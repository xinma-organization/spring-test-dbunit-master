/*
 * Copyright 2002-2013 the original author or authors
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

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.TestExecutionListenerChain;

/**
 * A {@link TestExecutionListenerChain} that triggers a {@link CallAfterTestMethodExecutionListener} as well as
 * transaction and DBUnit listeners.
 *
 * @author Phillip Webb
 */
public class AfterTearDownDbUnitTestExecutionListener extends TestExecutionListenerChain {

	private static final Class<?> CHAIN[] = { TransactionalTestExecutionListener.class,
			CallAfterTestMethodExecutionListener.class, DbUnitTestExecutionListener.class };

	@Override
	protected Class<?>[] getChain() {
		return CHAIN;
	}

}
