/*
 * Copyright (C) 2015 Karumi.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.spisoft.spexpsel;

/**
 * Contains all the information needed to render a expandable item inside a ExpandableSelector
 * widget. The information you can render is a Drawable identifier, a String used as title and a
 * Drawable used as background.
 */
public class ExpandableItem {

  private static final int NO_ID = -1;

  private int resourceId = NO_ID;
  private final int backgroundId;
  private final String title;
  private boolean disable;

  public ExpandableItem() {
    this(NO_ID, null, false);
  }

  public ExpandableItem(int backgroundId) {
    this(backgroundId, null, false);
  }

  public ExpandableItem(String title, boolean disable) {
    this(NO_ID, title, disable);
  }

  private ExpandableItem(int backgroundId, String title, boolean disable) {
    this.backgroundId = backgroundId;
    this.title = title;
    this.disable = disable;
  }

  public int getBackgroundId() {
    return backgroundId;
  }

  public String getTitle() {
    return title;
  }

  public void setResourceId(int resourceId) {
    this.resourceId = resourceId;
  }

  public int getResourceId() {
    return resourceId;
  }

  public boolean hasResourceId() {
    return resourceId != NO_ID;
  }

  public boolean hasBackgroundId() {
    return backgroundId != NO_ID;
  }

  public boolean hasTitle() {
    return title != null;
  }

  public boolean hasDisable() {
    return disable;
  }
}