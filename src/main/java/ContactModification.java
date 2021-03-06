/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContactModification implements org.apache.thrift.TBase<ContactModification, ContactModification._Fields>, java.io.Serializable, Cloneable, Comparable<ContactModification> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ContactModification");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField LUID_FIELD_DESC = new org.apache.thrift.protocol.TField("luid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PHONES_FIELD_DESC = new org.apache.thrift.protocol.TField("phones", org.apache.thrift.protocol.TType.LIST, (short)11);
  private static final org.apache.thrift.protocol.TField EMAILS_FIELD_DESC = new org.apache.thrift.protocol.TField("emails", org.apache.thrift.protocol.TType.LIST, (short)12);
  private static final org.apache.thrift.protocol.TField USERIDS_FIELD_DESC = new org.apache.thrift.protocol.TField("userids", org.apache.thrift.protocol.TType.LIST, (short)13);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ContactModificationStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ContactModificationTupleSchemeFactory());
  }

  /**
   * 
   * @see ModificationType
   */
  public ModificationType type; // required
  public String luid; // required
  public List<String> phones; // required
  public List<String> emails; // required
  public List<String> userids; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ModificationType
     */
    TYPE((short)1, "type"),
    LUID((short)2, "luid"),
    PHONES((short)11, "phones"),
    EMAILS((short)12, "emails"),
    USERIDS((short)13, "userids");

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
        case 1: // TYPE
          return TYPE;
        case 2: // LUID
          return LUID;
        case 11: // PHONES
          return PHONES;
        case 12: // EMAILS
          return EMAILS;
        case 13: // USERIDS
          return USERIDS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ModificationType.class)));
    tmpMap.put(_Fields.LUID, new org.apache.thrift.meta_data.FieldMetaData("luid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PHONES, new org.apache.thrift.meta_data.FieldMetaData("phones", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EMAILS, new org.apache.thrift.meta_data.FieldMetaData("emails", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.USERIDS, new org.apache.thrift.meta_data.FieldMetaData("userids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ContactModification.class, metaDataMap);
  }

  public ContactModification() {
  }

  public ContactModification(
    ModificationType type,
    String luid,
    List<String> phones,
    List<String> emails,
    List<String> userids)
  {
    this();
    this.type = type;
    this.luid = luid;
    this.phones = phones;
    this.emails = emails;
    this.userids = userids;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ContactModification(ContactModification other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetLuid()) {
      this.luid = other.luid;
    }
    if (other.isSetPhones()) {
      List<String> __this__phones = new ArrayList<String>(other.phones);
      this.phones = __this__phones;
    }
    if (other.isSetEmails()) {
      List<String> __this__emails = new ArrayList<String>(other.emails);
      this.emails = __this__emails;
    }
    if (other.isSetUserids()) {
      List<String> __this__userids = new ArrayList<String>(other.userids);
      this.userids = __this__userids;
    }
  }

  public ContactModification deepCopy() {
    return new ContactModification(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.luid = null;
    this.phones = null;
    this.emails = null;
    this.userids = null;
  }

  /**
   * 
   * @see ModificationType
   */
  public ModificationType getType() {
    return this.type;
  }

  /**
   * 
   * @see ModificationType
   */
  public ContactModification setType(ModificationType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getLuid() {
    return this.luid;
  }

  public ContactModification setLuid(String luid) {
    this.luid = luid;
    return this;
  }

  public void unsetLuid() {
    this.luid = null;
  }

  /** Returns true if field luid is set (has been assigned a value) and false otherwise */
  public boolean isSetLuid() {
    return this.luid != null;
  }

  public void setLuidIsSet(boolean value) {
    if (!value) {
      this.luid = null;
    }
  }

  public int getPhonesSize() {
    return (this.phones == null) ? 0 : this.phones.size();
  }

  public java.util.Iterator<String> getPhonesIterator() {
    return (this.phones == null) ? null : this.phones.iterator();
  }

  public void addToPhones(String elem) {
    if (this.phones == null) {
      this.phones = new ArrayList<String>();
    }
    this.phones.add(elem);
  }

  public List<String> getPhones() {
    return this.phones;
  }

  public ContactModification setPhones(List<String> phones) {
    this.phones = phones;
    return this;
  }

  public void unsetPhones() {
    this.phones = null;
  }

  /** Returns true if field phones is set (has been assigned a value) and false otherwise */
  public boolean isSetPhones() {
    return this.phones != null;
  }

  public void setPhonesIsSet(boolean value) {
    if (!value) {
      this.phones = null;
    }
  }

  public int getEmailsSize() {
    return (this.emails == null) ? 0 : this.emails.size();
  }

  public java.util.Iterator<String> getEmailsIterator() {
    return (this.emails == null) ? null : this.emails.iterator();
  }

  public void addToEmails(String elem) {
    if (this.emails == null) {
      this.emails = new ArrayList<String>();
    }
    this.emails.add(elem);
  }

  public List<String> getEmails() {
    return this.emails;
  }

  public ContactModification setEmails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public void unsetEmails() {
    this.emails = null;
  }

  /** Returns true if field emails is set (has been assigned a value) and false otherwise */
  public boolean isSetEmails() {
    return this.emails != null;
  }

  public void setEmailsIsSet(boolean value) {
    if (!value) {
      this.emails = null;
    }
  }

  public int getUseridsSize() {
    return (this.userids == null) ? 0 : this.userids.size();
  }

  public java.util.Iterator<String> getUseridsIterator() {
    return (this.userids == null) ? null : this.userids.iterator();
  }

  public void addToUserids(String elem) {
    if (this.userids == null) {
      this.userids = new ArrayList<String>();
    }
    this.userids.add(elem);
  }

  public List<String> getUserids() {
    return this.userids;
  }

  public ContactModification setUserids(List<String> userids) {
    this.userids = userids;
    return this;
  }

  public void unsetUserids() {
    this.userids = null;
  }

  /** Returns true if field userids is set (has been assigned a value) and false otherwise */
  public boolean isSetUserids() {
    return this.userids != null;
  }

  public void setUseridsIsSet(boolean value) {
    if (!value) {
      this.userids = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ModificationType)value);
      }
      break;

    case LUID:
      if (value == null) {
        unsetLuid();
      } else {
        setLuid((String)value);
      }
      break;

    case PHONES:
      if (value == null) {
        unsetPhones();
      } else {
        setPhones((List<String>)value);
      }
      break;

    case EMAILS:
      if (value == null) {
        unsetEmails();
      } else {
        setEmails((List<String>)value);
      }
      break;

    case USERIDS:
      if (value == null) {
        unsetUserids();
      } else {
        setUserids((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case LUID:
      return getLuid();

    case PHONES:
      return getPhones();

    case EMAILS:
      return getEmails();

    case USERIDS:
      return getUserids();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case LUID:
      return isSetLuid();
    case PHONES:
      return isSetPhones();
    case EMAILS:
      return isSetEmails();
    case USERIDS:
      return isSetUserids();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ContactModification)
      return this.equals((ContactModification)that);
    return false;
  }

  public boolean equals(ContactModification that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_luid = true && this.isSetLuid();
    boolean that_present_luid = true && that.isSetLuid();
    if (this_present_luid || that_present_luid) {
      if (!(this_present_luid && that_present_luid))
        return false;
      if (!this.luid.equals(that.luid))
        return false;
    }

    boolean this_present_phones = true && this.isSetPhones();
    boolean that_present_phones = true && that.isSetPhones();
    if (this_present_phones || that_present_phones) {
      if (!(this_present_phones && that_present_phones))
        return false;
      if (!this.phones.equals(that.phones))
        return false;
    }

    boolean this_present_emails = true && this.isSetEmails();
    boolean that_present_emails = true && that.isSetEmails();
    if (this_present_emails || that_present_emails) {
      if (!(this_present_emails && that_present_emails))
        return false;
      if (!this.emails.equals(that.emails))
        return false;
    }

    boolean this_present_userids = true && this.isSetUserids();
    boolean that_present_userids = true && that.isSetUserids();
    if (this_present_userids || that_present_userids) {
      if (!(this_present_userids && that_present_userids))
        return false;
      if (!this.userids.equals(that.userids))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ContactModification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLuid()).compareTo(other.isSetLuid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLuid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.luid, other.luid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPhones()).compareTo(other.isSetPhones());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPhones()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.phones, other.phones);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmails()).compareTo(other.isSetEmails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmails()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emails, other.emails);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserids()).compareTo(other.isSetUserids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userids, other.userids);
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
    StringBuilder sb = new StringBuilder("ContactModification(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("luid:");
    if (this.luid == null) {
      sb.append("null");
    } else {
      sb.append(this.luid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("phones:");
    if (this.phones == null) {
      sb.append("null");
    } else {
      sb.append(this.phones);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("emails:");
    if (this.emails == null) {
      sb.append("null");
    } else {
      sb.append(this.emails);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("userids:");
    if (this.userids == null) {
      sb.append("null");
    } else {
      sb.append(this.userids);
    }
    first = false;
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

  private static class ContactModificationStandardSchemeFactory implements SchemeFactory {
    public ContactModificationStandardScheme getScheme() {
      return new ContactModificationStandardScheme();
    }
  }

  private static class ContactModificationStandardScheme extends StandardScheme<ContactModification> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ContactModification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = ModificationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // LUID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.luid = iprot.readString();
              struct.setLuidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // PHONES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list128 = iprot.readListBegin();
                struct.phones = new ArrayList<String>(_list128.size);
                for (int _i129 = 0; _i129 < _list128.size; ++_i129)
                {
                  String _elem130;
                  _elem130 = iprot.readString();
                  struct.phones.add(_elem130);
                }
                iprot.readListEnd();
              }
              struct.setPhonesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 12: // EMAILS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list131 = iprot.readListBegin();
                struct.emails = new ArrayList<String>(_list131.size);
                for (int _i132 = 0; _i132 < _list131.size; ++_i132)
                {
                  String _elem133;
                  _elem133 = iprot.readString();
                  struct.emails.add(_elem133);
                }
                iprot.readListEnd();
              }
              struct.setEmailsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 13: // USERIDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list134 = iprot.readListBegin();
                struct.userids = new ArrayList<String>(_list134.size);
                for (int _i135 = 0; _i135 < _list134.size; ++_i135)
                {
                  String _elem136;
                  _elem136 = iprot.readString();
                  struct.userids.add(_elem136);
                }
                iprot.readListEnd();
              }
              struct.setUseridsIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ContactModification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.luid != null) {
        oprot.writeFieldBegin(LUID_FIELD_DESC);
        oprot.writeString(struct.luid);
        oprot.writeFieldEnd();
      }
      if (struct.phones != null) {
        oprot.writeFieldBegin(PHONES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.phones.size()));
          for (String _iter137 : struct.phones)
          {
            oprot.writeString(_iter137);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.emails != null) {
        oprot.writeFieldBegin(EMAILS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.emails.size()));
          for (String _iter138 : struct.emails)
          {
            oprot.writeString(_iter138);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.userids != null) {
        oprot.writeFieldBegin(USERIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.userids.size()));
          for (String _iter139 : struct.userids)
          {
            oprot.writeString(_iter139);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ContactModificationTupleSchemeFactory implements SchemeFactory {
    public ContactModificationTupleScheme getScheme() {
      return new ContactModificationTupleScheme();
    }
  }

  private static class ContactModificationTupleScheme extends TupleScheme<ContactModification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ContactModification struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetLuid()) {
        optionals.set(1);
      }
      if (struct.isSetPhones()) {
        optionals.set(2);
      }
      if (struct.isSetEmails()) {
        optionals.set(3);
      }
      if (struct.isSetUserids()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetLuid()) {
        oprot.writeString(struct.luid);
      }
      if (struct.isSetPhones()) {
        {
          oprot.writeI32(struct.phones.size());
          for (String _iter140 : struct.phones)
          {
            oprot.writeString(_iter140);
          }
        }
      }
      if (struct.isSetEmails()) {
        {
          oprot.writeI32(struct.emails.size());
          for (String _iter141 : struct.emails)
          {
            oprot.writeString(_iter141);
          }
        }
      }
      if (struct.isSetUserids()) {
        {
          oprot.writeI32(struct.userids.size());
          for (String _iter142 : struct.userids)
          {
            oprot.writeString(_iter142);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ContactModification struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.type = ModificationType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.luid = iprot.readString();
        struct.setLuidIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list143 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.phones = new ArrayList<String>(_list143.size);
          for (int _i144 = 0; _i144 < _list143.size; ++_i144)
          {
            String _elem145;
            _elem145 = iprot.readString();
            struct.phones.add(_elem145);
          }
        }
        struct.setPhonesIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list146 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.emails = new ArrayList<String>(_list146.size);
          for (int _i147 = 0; _i147 < _list146.size; ++_i147)
          {
            String _elem148;
            _elem148 = iprot.readString();
            struct.emails.add(_elem148);
          }
        }
        struct.setEmailsIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list149 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.userids = new ArrayList<String>(_list149.size);
          for (int _i150 = 0; _i150 < _list149.size; ++_i150)
          {
            String _elem151;
            _elem151 = iprot.readString();
            struct.userids.add(_elem151);
          }
        }
        struct.setUseridsIsSet(true);
      }
    }
  }

}

