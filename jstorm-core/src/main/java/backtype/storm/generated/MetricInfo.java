/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package backtype.storm.generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-2-22")
public class MetricInfo implements org.apache.thrift.TBase<MetricInfo, MetricInfo._Fields>, java.io.Serializable, Cloneable, Comparable<MetricInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetricInfo");

  private static final org.apache.thrift.protocol.TField METRICS_FIELD_DESC = new org.apache.thrift.protocol.TField("metrics", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetricInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetricInfoTupleSchemeFactory());
  }

  private Map<String,Map<Integer,MetricSnapshot>> metrics; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METRICS((short)1, "metrics");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // METRICS
          return METRICS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.METRICS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRICS, new org.apache.thrift.meta_data.FieldMetaData("metrics", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
                new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MetricSnapshot.class)))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetricInfo.class, metaDataMap);
  }

  public MetricInfo() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetricInfo(MetricInfo other) {
    if (other.is_set_metrics()) {
      Map<String,Map<Integer,MetricSnapshot>> __this__metrics = new HashMap<String,Map<Integer,MetricSnapshot>>(other.metrics.size());
      for (Map.Entry<String, Map<Integer,MetricSnapshot>> other_element : other.metrics.entrySet()) {

        String other_element_key = other_element.getKey();
        Map<Integer,MetricSnapshot> other_element_value = other_element.getValue();

        String __this__metrics_copy_key = other_element_key;

        Map<Integer,MetricSnapshot> __this__metrics_copy_value = new HashMap<Integer,MetricSnapshot>(other_element_value.size());
        for (Map.Entry<Integer, MetricSnapshot> other_element_value_element : other_element_value.entrySet()) {

          Integer other_element_value_element_key = other_element_value_element.getKey();
          MetricSnapshot other_element_value_element_value = other_element_value_element.getValue();

          Integer __this__metrics_copy_value_copy_key = other_element_value_element_key;

          MetricSnapshot __this__metrics_copy_value_copy_value = new MetricSnapshot(other_element_value_element_value);

          __this__metrics_copy_value.put(__this__metrics_copy_value_copy_key, __this__metrics_copy_value_copy_value);
        }

        __this__metrics.put(__this__metrics_copy_key, __this__metrics_copy_value);
      }
      this.metrics = __this__metrics;
    }
  }

  public MetricInfo deepCopy() {
    return new MetricInfo(this);
  }

  @Override
  public void clear() {
    this.metrics = null;
  }

  public int get_metrics_size() {
    return (this.metrics == null) ? 0 : this.metrics.size();
  }

  public void put_to_metrics(String key, Map<Integer,MetricSnapshot> val) {
    if (this.metrics == null) {
      this.metrics = new HashMap<String,Map<Integer,MetricSnapshot>>();
    }
    this.metrics.put(key, val);
  }

  public Map<String,Map<Integer,MetricSnapshot>> get_metrics() {
    return this.metrics;
  }

  public void set_metrics(Map<String,Map<Integer,MetricSnapshot>> metrics) {
    this.metrics = metrics;
  }

  public void unset_metrics() {
    this.metrics = null;
  }

  /** Returns true if field metrics is set (has been assigned a value) and false otherwise */
  public boolean is_set_metrics() {
    return this.metrics != null;
  }

  public void set_metrics_isSet(boolean value) {
    if (!value) {
      this.metrics = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRICS:
      if (value == null) {
        unset_metrics();
      } else {
        set_metrics((Map<String,Map<Integer,MetricSnapshot>>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRICS:
      return get_metrics();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METRICS:
      return is_set_metrics();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetricInfo)
      return this.equals((MetricInfo)that);
    return false;
  }

  public boolean equals(MetricInfo that) {
    if (that == null)
      return false;

    boolean this_present_metrics = true && this.is_set_metrics();
    boolean that_present_metrics = true && that.is_set_metrics();
    if (this_present_metrics || that_present_metrics) {
      if (!(this_present_metrics && that_present_metrics))
        return false;
      if (!this.metrics.equals(that.metrics))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metrics = true && (is_set_metrics());
    list.add(present_metrics);
    if (present_metrics)
      list.add(metrics);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetricInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_metrics()).compareTo(other.is_set_metrics());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_metrics()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metrics, other.metrics);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MetricInfo(");
    boolean first = true;

    if (is_set_metrics()) {
      sb.append("metrics:");
      if (this.metrics == null) {
        sb.append("null");
      } else {
        sb.append(this.metrics);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MetricInfoStandardSchemeFactory implements SchemeFactory {
    public MetricInfoStandardScheme getScheme() {
      return new MetricInfoStandardScheme();
    }
  }

  private static class MetricInfoStandardScheme extends StandardScheme<MetricInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetricInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRICS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map116 = iprot.readMapBegin();
                struct.metrics = new HashMap<String,Map<Integer,MetricSnapshot>>(2*_map116.size);
                String _key117;
                Map<Integer,MetricSnapshot> _val118;
                for (int _i119 = 0; _i119 < _map116.size; ++_i119)
                {
                  _key117 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TMap _map120 = iprot.readMapBegin();
                    _val118 = new HashMap<Integer,MetricSnapshot>(2*_map120.size);
                    int _key121;
                    MetricSnapshot _val122;
                    for (int _i123 = 0; _i123 < _map120.size; ++_i123)
                    {
                      _key121 = iprot.readI32();
                      _val122 = new MetricSnapshot();
                      _val122.read(iprot);
                      _val118.put(_key121, _val122);
                    }
                    iprot.readMapEnd();
                  }
                  struct.metrics.put(_key117, _val118);
                }
                iprot.readMapEnd();
              }
              struct.set_metrics_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetricInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metrics != null) {
        if (struct.is_set_metrics()) {
          oprot.writeFieldBegin(METRICS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, struct.metrics.size()));
            for (Map.Entry<String, Map<Integer,MetricSnapshot>> _iter124 : struct.metrics.entrySet())
            {
              oprot.writeString(_iter124.getKey());
              {
                oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, _iter124.getValue().size()));
                for (Map.Entry<Integer, MetricSnapshot> _iter125 : _iter124.getValue().entrySet())
                {
                  oprot.writeI32(_iter125.getKey());
                  _iter125.getValue().write(oprot);
                }
                oprot.writeMapEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetricInfoTupleSchemeFactory implements SchemeFactory {
    public MetricInfoTupleScheme getScheme() {
      return new MetricInfoTupleScheme();
    }
  }

  private static class MetricInfoTupleScheme extends TupleScheme<MetricInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MetricInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.is_set_metrics()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_metrics()) {
        {
          oprot.writeI32(struct.metrics.size());
          for (Map.Entry<String, Map<Integer,MetricSnapshot>> _iter126 : struct.metrics.entrySet())
          {
            oprot.writeString(_iter126.getKey());
            {
              oprot.writeI32(_iter126.getValue().size());
              for (Map.Entry<Integer, MetricSnapshot> _iter127 : _iter126.getValue().entrySet())
              {
                oprot.writeI32(_iter127.getKey());
                _iter127.getValue().write(oprot);
              }
            }
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MetricInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map128 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.MAP, iprot.readI32());
          struct.metrics = new HashMap<String,Map<Integer,MetricSnapshot>>(2*_map128.size);
          String _key129;
          Map<Integer,MetricSnapshot> _val130;
          for (int _i131 = 0; _i131 < _map128.size; ++_i131)
          {
            _key129 = iprot.readString();
            {
              org.apache.thrift.protocol.TMap _map132 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val130 = new HashMap<Integer,MetricSnapshot>(2*_map132.size);
              int _key133;
              MetricSnapshot _val134;
              for (int _i135 = 0; _i135 < _map132.size; ++_i135)
              {
                _key133 = iprot.readI32();
                _val134 = new MetricSnapshot();
                _val134.read(iprot);
                _val130.put(_key133, _val134);
              }
            }
            struct.metrics.put(_key129, _val130);
          }
        }
        struct.set_metrics_isSet(true);
      }
    }
  }

}

