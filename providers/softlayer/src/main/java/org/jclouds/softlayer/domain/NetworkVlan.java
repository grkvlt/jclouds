/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.softlayer.domain;

import java.beans.ConstructorProperties;

import org.jclouds.javax.annotation.Nullable;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Class NetworkVlan
 *
 * @see <a href= "http://sldn.softlayer.com/reference/datatypes/SoftLayer_Network_Vlan"/>
 */
public class NetworkVlan {

   public static Builder builder() {
      return new Builder();
   }

   public Builder toBuilder() {
      return builder().fromNetworkVlan(this);
   }

   public static class Builder {

      protected int id;
      protected String name;
      protected int networkVrfId;
      protected String note;
      protected int primarySubnetId;
      protected int vlanNumber;

      /**
       * @see org.jclouds.softlayer.domain.NetworkVlan#getId()
       */
      public Builder id(int id) {
         this.id = id;
         return this;
      }

      /**
       * @see org.jclouds.softlayer.domain.NetworkVlan#getName()
       */
      public Builder name(String name) {
         this.name = name;
         return this;
      }

      /**
       * @see org.jclouds.softlayer.domain.NetworkVlan#getNetworkVrfId()
       */
      public Builder networkVrfId(int networkVrfId) {
         this.networkVrfId = networkVrfId;
         return this;
      }

      /**
       * @see org.jclouds.softlayer.domain.NetworkVlan#getNote()
       */
      public Builder note(String note) {
         this.note = note;
         return this;
      }

      /**
       * @see org.jclouds.softlayer.domain.NetworkVlan#getPrimarySubnetId()
       */
      public Builder primarySubnetId(int primarySubnetId) {
         this.primarySubnetId = primarySubnetId;
         return this;
      }

      /**
       * @see org.jclouds.softlayer.domain.NetworkVlan#getVlanNumber()
       */
      public Builder vlanNumber(int vlanNumber) {
         this.vlanNumber = vlanNumber;
         return this;
      }

      public NetworkVlan build() {
         return new NetworkVlan(id, name, networkVrfId, note, primarySubnetId, vlanNumber);
      }

      public Builder fromVirtualGuestNetworkComponent(NetworkVlan in) {
         return this
                 .id(in.getId())
                 .name(in.getName())
                 .networkVrfId(in.getNetworkVrfId())
                 .note(in.getNote())
                 .primarySubnetId(in.getPrimarySubnetId())
                 .vlanNumber(in.getVlanNumber());
      }
   }

   private final int id;
   private final String name;
   private final int networkVrfId;
   private final String note;
   private final int primarySubnetId;
   private final int vlanNumber;

   @ConstructorProperties({ "id", "name", "networkVrfId", "note", "primarySubnetId", "vlanNumber" })
   protected NetworkVlan(int id, String name, int networkVrfId, @Nullable String note, int primarySubnetId, int vlanNumber) {
      this.id = id;
      this.name = name;
      this.networkVrfId = networkVrfId;
      this.note = note;
      this.primarySubnetId = primarySubnetId;
      this.vlanNumber = vlanNumber;
   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public int getNetworkVrfId() {
      return networkVrfId;
   }

   public String getNote() {
      return note;
   }

   public int getPrimarySubnetId() {
      return primarySubnetId;
   }

   public int getVlanNumber() {
      return vlanNumber;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      NetworkVlan that = (NetworkVlan) o;

      return Objects.equal(this.id, that.id) &&
              Objects.equal(this.name, that.name) &&
              Objects.equal(this.networkVrfId, that.networkVrfId) &&
              Objects.equal(this.note, that.note) &&
              Objects.equal(this.primarySubnetId, that.primarySubnetId) &&
              Objects.equal(this.vlanNumber, that.vlanNumber);
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(id, name, networkVrfId, note, primarySubnetId, vlanNumber);
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
              .add("id", id)
              .add("name", name)
              .add("networkVrfId", networkVrfId)
              .add("note", note)
              .add("primarySubnetId", primarySubnetId)
              .add("vlanNumber", vlanNumber)
              .toString();
   }
}
