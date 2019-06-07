/**
 * Copyright Intellectual Reserve, Inc.
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
package org.familysearch.platform.ordinances;

import com.webcohesion.enunciate.metadata.qname.XmlQNameEnum;
import com.webcohesion.enunciate.metadata.qname.XmlQNameEnumValue;
import org.familysearch.platform.FamilySearchPlatform;
import org.gedcomx.common.URI;
import org.gedcomx.rt.ControlledVocabulary;
import org.gedcomx.rt.EnumURIMap;

/**
 * Enumeration of known ordinance types
 *
 */
@XmlQNameEnum(
  base = XmlQNameEnum.BaseType.URI
)
// todo GenericOrdinanceTerms ordinances  This class should be deleted
@Deprecated
public enum OrdinanceAssignee implements ControlledVocabulary {

  @XmlQNameEnumValue(
    namespace = "https://www.lds.org/",
    localPart = ""
  )
  /** deprecated */
  @Deprecated
  LdsChurch,

  /** deprecated */
  @Deprecated
  OTHER;

  private static final EnumURIMap<OrdinanceAssignee> URI_MAP = new EnumURIMap<OrdinanceAssignee>(OrdinanceAssignee.class, FamilySearchPlatform.NAMESPACE);

  /**
   * Deprecated: Return the QName value for this enum.
   *
   * @return The QName value for this enum.
   */
  public URI toQNameURI() {
    return URI_MAP.toURIValue(this);
  }

  /**
   * Deprecated: Get the enumeration from the QName.
   *
   * @param qname The qname.
   * @return The enumeration.
   */
  public static OrdinanceAssignee fromQNameURI(URI qname) {
    return URI_MAP.fromURIValue(qname);
  }


}
