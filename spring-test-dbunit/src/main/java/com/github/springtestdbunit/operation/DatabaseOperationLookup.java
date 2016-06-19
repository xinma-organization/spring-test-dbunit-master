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

package com.github.springtestdbunit.operation;

import com.github.springtestdbunit.annotation.DatabaseOperation;

/**
 * Strategy used to lookup a DBUnit {@link org.dbunit.operation.DatabaseOperation Database Operation} from a
 * {@link DatabaseOperation enum value}.
 *
 * @author Phillip Webb
 * @see DefaultDatabaseOperationLookup
 * @see MicrosoftSqlDatabaseOperationLookup
 */
public interface DatabaseOperationLookup {

	/**
	 * Returns the DBUnit {@link org.dbunit.operation.DatabaseOperation Database Operation} that should be used for the
	 * specified enum or {@code null} if the operation is not supported.
	 * @param operation the enum value
	 * @return the DBUnit databsae operation or {@code null}.
	 */
	org.dbunit.operation.DatabaseOperation get(DatabaseOperation operation);

}
