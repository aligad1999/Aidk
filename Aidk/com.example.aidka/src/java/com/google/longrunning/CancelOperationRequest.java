/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.longrunning.CancelOperationRequest$1
 *  com.google.longrunning.CancelOperationRequestOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.longrunning;

import com.google.longrunning.CancelOperationRequest;
import com.google.longrunning.CancelOperationRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;

public final class CancelOperationRequest
extends GeneratedMessageLite<CancelOperationRequest, Builder>
implements CancelOperationRequestOrBuilder {
    private static final CancelOperationRequest DEFAULT_INSTANCE = new CancelOperationRequest();
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<CancelOperationRequest> PARSER;
    private String name_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private CancelOperationRequest() {
    }

    private void clearName() {
        this.name_ = CancelOperationRequest.getDefaultInstance().getName();
    }

    public static CancelOperationRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CancelOperationRequest cancelOperationRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)cancelOperationRequest);
    }

    public static CancelOperationRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CancelOperationRequest)CancelOperationRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CancelOperationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CancelOperationRequest)CancelOperationRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CancelOperationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CancelOperationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(InputStream inputStream) throws IOException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CancelOperationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CancelOperationRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CancelOperationRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CancelOperationRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CancelOperationRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setName(String string) {
        if (string != null) {
            this.name_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            CancelOperationRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 8: {
                if (PARSER != null) return PARSER;
                Class<CancelOperationRequest> class_ = CancelOperationRequest.class;
                // MONITORENTER : com.google.longrunning.CancelOperationRequest.class
                if (PARSER == null) {
                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                }
                // MONITOREXIT : class_
                return PARSER;
            }
            case 6: {
                CodedInputStream codedInputStream = (CodedInputStream)object;
                (ExtensionRegistryLite)object2;
                boolean bl = false;
                while (!bl) {
                    int n = codedInputStream.readTag();
                    if (n != 0) {
                        if (n != 10) {
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        this.name_ = codedInputStream.readStringRequireUtf8();
                        continue;
                    }
                    bl = true;
                    continue;
                    catch (IOException iOException) {
                        throw new RuntimeException((Throwable)new InvalidProtocolBufferException(iOException.getMessage()).setUnfinishedMessage((MessageLite)this));
                    }
                    catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                        throw new RuntimeException((Throwable)invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this));
                    }
                }
                return DEFAULT_INSTANCE;
            }
            case 7: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor)object;
                CancelOperationRequest cancelOperationRequest = (CancelOperationRequest)((Object)object2);
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ cancelOperationRequest.name_.isEmpty(), cancelOperationRequest.name_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new CancelOperationRequest();
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.name_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CancelOperationRequest, Builder>
    implements CancelOperationRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((CancelOperationRequest)this.instance).clearName();
            return this;
        }

        public String getName() {
            return ((CancelOperationRequest)this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((CancelOperationRequest)this.instance).getNameBytes();
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((CancelOperationRequest)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CancelOperationRequest)this.instance).setNameBytes(byteString);
            return this;
        }
    }

}

