/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
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
package org.optaplanner.workbench.screens.solver.client.editor;

import org.jboss.errai.common.client.api.IsElement;
import org.optaplanner.workbench.screens.solver.model.TerminationCompositionStyleModel;
import org.optaplanner.workbench.screens.solver.model.TerminationConfigOption;

public interface TerminationTreeItemContentView extends IsElement {

    void setPresenter(TerminationTreeItemContent presenter);

    void setRoot(boolean root);

    void addDropDownOption(TerminationConfigOption option);

    void removeDropDownOption(TerminationConfigOption option);

    void setNestedTreeItem(boolean nestedTreeItem);

    void hideTimeSpentInput();

    void hideUnimprovedTimeSpentInput();

    void hideStepCountLimitInput();

    void hideUnimprovedStepCountLimitInput();

    void hideScoreCalculationCountLimitInput();

    void hideBestScoreFeasibleInput();

    void hideBestScoreLimitInput();

    void setFormLabelText(String text);

    void setFormLabelHelpContent(String content);

    void setDropDownHelpContent(String content);

    void setDaysSpent(Long value);

    void setHoursSpent(Long value);

    void setMinutesSpent(Long value);

    void setSecondsSpent(Long value);

    void setMillisecondsSpent(Long value);

    void setUnimprovedDaysSpent(Long value);

    void setUnimprovedHoursSpent(Long value);

    void setUnimprovedMinutesSpent(Long value);

    void setUnimprovedSecondsSpent(Long value);

    void setUnimprovedMillisecondsSpent(Long value);

    void setStepCountLimit(Integer value);

    void setUnimprovedStepCountLimit(Integer value);

    void setScoreCalculationCountLimit(Long value);

    void setBestScoreFeasible(Boolean value);

    void setBestScoreLimit(String value);

    void setTerminationCompositionStyle(TerminationCompositionStyleModel value);
}
