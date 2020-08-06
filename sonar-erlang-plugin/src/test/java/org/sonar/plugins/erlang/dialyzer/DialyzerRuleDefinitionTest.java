/*
 * SonarQube Erlang Plugin
 * Copyright (C) 2012-2018 Tamas Kende; Denes Hegedus (Cursor Insight Ltd.)
 * kende.tamas@gmail.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.erlang.dialyzer;

import java.util.List;

import org.junit.Test;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionXmlLoader;

import static org.fest.assertions.Assertions.assertThat;
import static org.sonar.api.server.rule.RulesDefinition.Repository;

public class DialyzerRuleDefinitionTest {

  @Test
  public void test() {
    RulesDefinition.Context context = new RulesDefinition.Context();
    DialyzerRuleDefinition ruleDefinition = new DialyzerRuleDefinition(new RulesDefinitionXmlLoader());
    ruleDefinition.define(context);

    Repository repository = context.repository(DialyzerRuleDefinition.REPOSITORY_KEY);

    assertThat(repository.name()).isEqualTo(DialyzerRuleDefinition.REPOSITORY_NAME);

    List<RulesDefinition.Rule> rules = repository.rules();

    assertThat(rules.size()).isEqualTo(41);
  }

}