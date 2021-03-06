/*
 * Copyright 2021 www.seleniumtests.com
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.seleniumtests.webelements;

import org.openqa.selenium.By;

import com.seleniumtests.core.TestLogging;

public class RadioButtonElement extends HtmlElement {

    public RadioButtonElement(final String label, final By by) {
        super(label, by);
    }

    @Override
    public void check() {
        TestLogging.logWebStep("check " + toHTML(), false);
        super.check();
    }

    @Override
    public void uncheck() {
        TestLogging.logWebStep("uncheck " + toHTML(), false);
        super.uncheck();
    }

    @Override
    public void click() {
        TestLogging.logWebStep("click on " + toHTML(), false);
        super.click();
    }

    public boolean isSelected() {
        findElement();
        return element.isSelected();
    }
}
