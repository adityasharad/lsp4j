/**
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j;

import com.google.gson.annotations.JsonAdapter;
import org.eclipse.lsp4j.jsonrpc.json.adapters.JsonElementTypeAdapter;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * A notification sent from the client to the server to signal the change of configuration settings.
 */
@SuppressWarnings("all")
public class DidChangeConfigurationParams {
  /**
   * The actual changed settings.
   */
  @NonNull
  @JsonAdapter(JsonElementTypeAdapter.Factory.class)
  private Object settings;
  
  public DidChangeConfigurationParams() {
  }
  
  public DidChangeConfigurationParams(@NonNull final Object settings) {
    this.settings = settings;
  }
  
  /**
   * The actual changed settings.
   */
  @Pure
  @NonNull
  public Object getSettings() {
    return this.settings;
  }
  
  /**
   * The actual changed settings.
   */
  public void setSettings(@NonNull final Object settings) {
    this.settings = settings;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("settings", this.settings);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    DidChangeConfigurationParams other = (DidChangeConfigurationParams) obj;
    if (this.settings == null) {
      if (other.settings != null)
        return false;
    } else if (!this.settings.equals(other.settings))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.settings== null) ? 0 : this.settings.hashCode());
    return result;
  }
}
