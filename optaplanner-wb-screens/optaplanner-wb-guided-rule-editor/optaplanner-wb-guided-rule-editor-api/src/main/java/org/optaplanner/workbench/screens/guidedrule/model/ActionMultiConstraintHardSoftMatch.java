/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.workbench.screens.guidedrule.model;

import org.jboss.errai.common.client.api.annotations.Portable;

@Portable
public class ActionMultiConstraintHardSoftMatch implements ActionConstraintMatch {

    private ActionHardConstraintMatch actionHardConstraintMatch;

    private ActionSoftConstraintMatch actionSoftConstraintMatch;

    public ActionMultiConstraintHardSoftMatch() {
    }

    public ActionMultiConstraintHardSoftMatch(final ActionHardConstraintMatch actionHardConstraintMatch,
                                              final ActionSoftConstraintMatch actionSoftConstraintMatch) {
        this.actionHardConstraintMatch = actionHardConstraintMatch;
        this.actionSoftConstraintMatch = actionSoftConstraintMatch;
    }

    public ActionHardConstraintMatch getActionHardConstraintMatch() {
        return actionHardConstraintMatch;
    }

    public ActionSoftConstraintMatch getActionSoftConstraintMatch() {
        return actionSoftConstraintMatch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ActionMultiConstraintHardSoftMatch that = (ActionMultiConstraintHardSoftMatch) o;

        if (actionHardConstraintMatch != null ? !actionHardConstraintMatch.equals(that.actionHardConstraintMatch) : that.actionHardConstraintMatch != null) {
            return false;
        }
        return actionSoftConstraintMatch != null ? actionSoftConstraintMatch.equals(that.actionSoftConstraintMatch) : that.actionSoftConstraintMatch == null;
    }

    @Override
    public int hashCode() {
        int result = actionHardConstraintMatch != null ? actionHardConstraintMatch.hashCode() : 0;
        result = ~~result;
        result = 31 * result + (actionSoftConstraintMatch != null ? actionSoftConstraintMatch.hashCode() : 0);
        result = ~~result;
        return result;
    }
}
