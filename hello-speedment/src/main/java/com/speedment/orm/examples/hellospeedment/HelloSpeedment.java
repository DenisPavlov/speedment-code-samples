/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.orm.examples.hellospeedment;

import com.company.speedment.orm.test.ImageManager;
import com.company.speedment.orm.test.TransitionManager;
import com.company.speedment.orm.test.UserManager;
import com.company.speedment.orm.test.VisitManager;
import com.speedment.orm.platform.Platform;
import com.speedment.orm.platform.component.ManagerComponent;

/**
 *
 * @author Emil Forslund
 */
public class HelloSpeedment {

    private static final String CONFIG_FILE_NAME = "src/main/groovy/speedment.groovy";

    public HelloSpeedment() {
        //Platform.get().get(ProjectComponent.class).getProject().setConfigFile(Paths.get(CONFIG_FILE_NAME));
    }

    public void start() {
        final ManagerComponent mgrc = Platform.get().get(ManagerComponent.class);
        mgrc.put(ImageManager.get());
        mgrc.put(TransitionManager.get());
        mgrc.put(UserManager.get());
        mgrc.put(VisitManager.get());
    }
}