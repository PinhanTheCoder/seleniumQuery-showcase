/*
 * Copyright (c) 2017 seleniumQuery authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package plugin;

import static io.github.seleniumquery.SeleniumQuery.$;

public class SeleniumQueryPluginExample {

    public static void main(String[] args) {
        $.driver().useFirefox().headless().autoDriverDownload().autoQuitDriver();

        $.url("https://github.com/seleniumQuery/seleniumQuery");

        int theSize = $("div.container").as(SizerPlugin.SIZER).gimmeTheSize();

        System.out.println("The size: " + theSize);
    }

}
