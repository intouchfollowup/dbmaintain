/*
 * Copyright DbMaintain.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dbmaintain.script.parser.impl;

import org.dbmaintain.script.parser.parsingstate.PlSqlBlockMatcher;
import org.dbmaintain.script.parser.parsingstate.impl.OraclePlSqlBlockMatcher;

import java.util.Properties;

/**
 * @author Filip Neven
 * @author Tim Ducheyne
 */
public class OracleScriptParserFactory extends DefaultScriptParserFactory {

    public OracleScriptParserFactory(boolean backSlashEscapingEnabled, Properties scriptParameters) {
        super(backSlashEscapingEnabled, scriptParameters);
    }

    @Override
    protected PlSqlBlockMatcher createStoredProcedureMatcher() {
        return new OraclePlSqlBlockMatcher();
    }
}
