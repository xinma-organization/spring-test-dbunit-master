/*
 * Copyright 2002-2015 the original author or authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.springtestdbunit.testutils;

import org.junit.Assert;
import org.springframework.test.context.TestContext;

import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;

/**
 * An extension of {@link TransactionDbUnitTestExecutionListener} that ensures that a test method does not swallow
 * exceptions.
 *
 * @author Phillip Webb
 */
public class MustNoSwallowTestExecutionListener extends TransactionDbUnitTestExecutionListener {

	@Override
	public void afterTestMethod(TestContext testContext) throws Exception {
		Assert.assertTrue(testContext.getTestException() instanceof NotSwallowedException);
		try {
			super.afterTestMethod(testContext);
		} catch (Throwable ex) {
			Assert.fail("Throw exception");
		}
	}

}
