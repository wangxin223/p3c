/*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.p3c.pmd.lang.java.rule.naming;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;
import org.junit.Test;

/**
 * Test for naming rules.
 *
 * @author changle.lq
 * @date 2016/11/23
 *
 */
public class NamingRulesTest extends SimpleAggregatorTst {
    private static final String RULESET = "java-ali-naming";

    @Override
    public void setUp() {
        addRule(RULESET, "ClassNamingShouldBeCamelRule");
        addRule(RULESET, "AbstractClassShouldStartWithAbstractNamingRule");
        addRule(RULESET, "ExceptionClassShouldEndWithExceptionRule");
        addRule(RULESET, "TestClassShouldEndWithTestNamingRule");
        addRule(RULESET, "LowerCamelCaseVariableNamingRule");
        addRule(RULESET, "AvoidStartWithDollarAndUnderLineNamingRule");
        addRule(RULESET, "ConstantFieldShouldBeUpperCaseRule");
        addRule(RULESET, "ServiceOrDaoClassShouldEndWithImplRule");
        addRule(RULESET, "BooleanPropertyShouldNotStartWithIsRule");
        addRule(RULESET, "ArrayNamingShouldHaveBracketRule");
        addRule(RULESET, "PackageNamingRule");
    }

    @Test
    public void testExcludeVariable() {
        LowerCamelCaseVariableNamingRule rule = new LowerCamelCaseVariableNamingRule();
        rule.setRuleSetName(RULESET);
        rule.setName("LowerCamelCaseVariableNamingRule");
        runTests(rule);
    }
}
