/*
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

package app.metatron.discovery.domain.workbench;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "polaris.workbench")
public class WorkbenchProperties {

  //default result size
  private Integer defaultResultSize = 1000;

  //max result size
  private Integer maxResultSize = 100000;

  //explicit result size
  private Integer explicitResultSize = 0;

  private Integer maxFetchSize = 10000;
  private String tempHdfsPath = "/tmp/hive";
  private String tempCSVPath = "/tmp";

  public static String TEMP_SCHEMA_PREFIX = "temp_";
  public static String TEMP_TABLE_PREFIX = "wb_";

  public Integer getDefaultResultSize() {
    return defaultResultSize;
  }

  public void setDefaultResultSize(Integer defaultResultSize) {
    this.defaultResultSize = defaultResultSize;
  }

  public Integer getMaxResultSize() {
    return maxResultSize;
  }

  public void setMaxResultSize(Integer maxResultSize) {
    this.maxResultSize = maxResultSize;
  }

  public Integer getExplicitResultSize() {
    return explicitResultSize;
  }

  public void setExplicitResultSize(Integer explicitResultSize) {
    this.explicitResultSize = explicitResultSize;
  }

  public Integer getMaxFetchSize() {
    return maxFetchSize;
  }

  public void setMaxFetchSize(Integer maxFetchSize) {
    this.maxFetchSize = maxFetchSize;
  }

  public String getTempHdfsPath() {
    return tempHdfsPath;
  }

  public void setTempHdfsPath(String tempHdfsPath) {
    this.tempHdfsPath = tempHdfsPath;
  }

  public String getTempCSVPath() {
    return tempCSVPath;
  }

  public void setTempCSVPath(String tempCSVPath) {
    this.tempCSVPath = tempCSVPath;
  }
}