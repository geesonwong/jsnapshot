// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg.proto
package info.airsen.tmp;


public final class ProtoBufferPractice {
	private static com.google.protobuf.Descriptors.Descriptor
			internal_static_msgInfo_descriptor;
	private static
	com.google.protobuf.GeneratedMessage.FieldAccessorTable
			internal_static_msgInfo_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.FileDescriptor
			descriptor;

	static {
		java.lang.String[] descriptorData = {
				"\n\tmsg.proto\"\"\n\007msgInfo\022\n\n\002id\030\001 \002(\003\022\013\n\003de" +
						"s\030\002 \002(\tB\025B\023ProtoBufferPractice"
		};
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
				new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
					public com.google.protobuf.ExtensionRegistry assignDescriptors(
							com.google.protobuf.Descriptors.FileDescriptor root) {
						descriptor = root;
						internal_static_msgInfo_descriptor =
								getDescriptor().getMessageTypes().get(0);
						internal_static_msgInfo_fieldAccessorTable = new
								com.google.protobuf.GeneratedMessage.FieldAccessorTable(
								internal_static_msgInfo_descriptor,
								new java.lang.String[]{"Id", "Des",});
						return null;
					}
				};
		com.google.protobuf.Descriptors.FileDescriptor
				.internalBuildGeneratedFileFrom(descriptorData,
						new com.google.protobuf.Descriptors.FileDescriptor[]{
						}, assigner);
	}

	private ProtoBufferPractice() {
	}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {
	}

	public static com.google.protobuf.Descriptors.FileDescriptor
	getDescriptor() {
		return descriptor;
	}

	public interface msgInfoOrBuilder
			extends com.google.protobuf.MessageOrBuilder {

		// required int64 id = 1;

		/**
		 * <code>required int64 id = 1;</code>
		 */
		boolean hasId();

		/**
		 * <code>required int64 id = 1;</code>
		 */
		long getId();

		// required string des = 2;

		/**
		 * <code>required string des = 2;</code>
		 */
		boolean hasDes();

		/**
		 * <code>required string des = 2;</code>
		 */
		java.lang.String getDes();

		/**
		 * <code>required string des = 2;</code>
		 */
		com.google.protobuf.ByteString
		getDesBytes();
	}

	/**
	 * Protobuf type {@code msgInfo}
	 */
	public static final class msgInfo extends
			com.google.protobuf.GeneratedMessage
			implements msgInfoOrBuilder {
		// required int64 id = 1;
		public static final int ID_FIELD_NUMBER = 1;
		// required string des = 2;
		public static final int DES_FIELD_NUMBER = 2;
		private static final msgInfo defaultInstance;
		private static final long serialVersionUID = 0L;
		public static com.google.protobuf.Parser<msgInfo> PARSER =
				new com.google.protobuf.AbstractParser<msgInfo>() {
					public msgInfo parsePartialFrom(
							com.google.protobuf.CodedInputStream input,
							com.google.protobuf.ExtensionRegistryLite extensionRegistry)
							throws com.google.protobuf.InvalidProtocolBufferException {
						return new msgInfo(input, extensionRegistry);
					}
				};
		private final com.google.protobuf.UnknownFieldSet unknownFields;
		private int bitField0_;
		private long id_;
		private java.lang.Object des_;
		private byte memoizedIsInitialized = -1;
		private int memoizedSerializedSize = -1;

		// Use msgInfo.newBuilder() to construct.
		private msgInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
			super(builder);
			this.unknownFields = builder.getUnknownFields();
		}

		private msgInfo(boolean noInit) {
			this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
		}

		private msgInfo(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			initFields();
			int mutable_bitField0_ = 0;
			com.google.protobuf.UnknownFieldSet.Builder unknownFields =
					com.google.protobuf.UnknownFieldSet.newBuilder();
			try {
				boolean done = false;
				while (!done) {
					int tag = input.readTag();
					switch (tag) {
						case 0:
							done = true;
							break;
						default: {
							if (!parseUnknownField(input, unknownFields,
									extensionRegistry, tag)) {
								done = true;
							}
							break;
						}
						case 8: {
							bitField0_ |= 0x00000001;
							id_ = input.readInt64();
							break;
						}
						case 18: {
							bitField0_ |= 0x00000002;
							des_ = input.readBytes();
							break;
						}
					}
				}
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				throw e.setUnfinishedMessage(this);
			} catch (java.io.IOException e) {
				throw new com.google.protobuf.InvalidProtocolBufferException(
						e.getMessage()).setUnfinishedMessage(this);
			} finally {
				this.unknownFields = unknownFields.build();
				makeExtensionsImmutable();
			}
		}

		public static msgInfo getDefaultInstance() {
			return defaultInstance;
		}

		public static final com.google.protobuf.Descriptors.Descriptor
		getDescriptor() {
			return ProtoBufferPractice.internal_static_msgInfo_descriptor;
		}

		public static ProtoBufferPractice.msgInfo parseFrom(
				com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		/**
		 * <code>required int64 id = 1;</code>
		 */
		public long getId() {
			return id_;
		}

		public static ProtoBufferPractice.msgInfo parseFrom(
				com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static ProtoBufferPractice.msgInfo parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static ProtoBufferPractice.msgInfo parseFrom(
				byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		/**
		 * <code>required string des = 2;</code>
		 */
		public boolean hasDes() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		public static ProtoBufferPractice.msgInfo parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		/**
		 * <code>required string des = 2;</code>
		 */
		public java.lang.String getDes() {
			java.lang.Object ref = des_;
			if (ref instanceof java.lang.String) {
				return (java.lang.String) ref;
			} else {
				com.google.protobuf.ByteString bs =
						(com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					des_ = s;
				}
				return s;
			}
		}

		public static ProtoBufferPractice.msgInfo parseFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		/**
		 * <code>required string des = 2;</code>
		 */
		public com.google.protobuf.ByteString
		getDesBytes() {
			java.lang.Object ref = des_;
			if (ref instanceof java.lang.String) {
				com.google.protobuf.ByteString b =
						com.google.protobuf.ByteString.copyFromUtf8(
								(java.lang.String) ref);
				des_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		public static ProtoBufferPractice.msgInfo parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input);
		}

		public static ProtoBufferPractice.msgInfo parseDelimitedFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseDelimitedFrom(input, extensionRegistry);
		}

		public static ProtoBufferPractice.msgInfo parseFrom(
				com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return PARSER.parseFrom(input);
		}

		public static ProtoBufferPractice.msgInfo parseFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return PARSER.parseFrom(input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return Builder.create();
		}

		public static Builder newBuilder(ProtoBufferPractice.msgInfo prototype) {
			return newBuilder().mergeFrom(prototype);
		}

		public msgInfo getDefaultInstanceForType() {
			return defaultInstance;
		}

		@java.lang.Override
		public com.google.protobuf.Parser<msgInfo> getParserForType() {
			return PARSER;
		}

		protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return ProtoBufferPractice.internal_static_msgInfo_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							ProtoBufferPractice.msgInfo.class, ProtoBufferPractice.msgInfo.Builder.class);
		}

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized != -1) return isInitialized == 1;

			if (!hasId()) {
				memoizedIsInitialized = 0;
				return false;
			}
			if (!hasDes()) {
				memoizedIsInitialized = 0;
				return false;
			}
			memoizedIsInitialized = 1;
			return true;
		}

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet
		getUnknownFields() {
			return this.unknownFields;
		}

		@java.lang.Override
		protected Builder newBuilderForType(
				com.google.protobuf.GeneratedMessage.BuilderParent parent) {
			Builder builder = new Builder(parent);
			return builder;
		}

		@java.lang.Override
		protected java.lang.Object writeReplace()
				throws java.io.ObjectStreamException {
			return super.writeReplace();
		}

		/**
		 * <code>required int64 id = 1;</code>
		 */
		public boolean hasId() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		private void initFields() {
			id_ = 0L;
			des_ = "";
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output)
				throws java.io.IOException {
			getSerializedSize();
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				output.writeInt64(1, id_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				output.writeBytes(2, getDesBytes());
			}
			getUnknownFields().writeTo(output);
		}

		public int getSerializedSize() {
			int size = memoizedSerializedSize;
			if (size != -1) return size;

			size = 0;
			if (((bitField0_ & 0x00000001) == 0x00000001)) {
				size += com.google.protobuf.CodedOutputStream
						.computeInt64Size(1, id_);
			}
			if (((bitField0_ & 0x00000002) == 0x00000002)) {
				size += com.google.protobuf.CodedOutputStream
						.computeBytesSize(2, getDesBytes());
			}
			size += getUnknownFields().getSerializedSize();
			memoizedSerializedSize = size;
			return size;
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

		public Builder toBuilder() {
			return newBuilder(this);
		}

		/**
		 * Protobuf type {@code msgInfo}
		 */
		public static final class Builder extends
				com.google.protobuf.GeneratedMessage.Builder<Builder>
				implements ProtoBufferPractice.msgInfoOrBuilder {
			private int bitField0_;
			// required int64 id = 1;
			private long id_;
			// required string des = 2;
			private java.lang.Object des_ = "";

			// Construct using ProtoBufferPractice.msgInfo.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(
					com.google.protobuf.GeneratedMessage.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			public static final com.google.protobuf.Descriptors.Descriptor
			getDescriptor() {
				return ProtoBufferPractice.internal_static_msgInfo_descriptor;
			}

			private static Builder create() {
				return new Builder();
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
				}
			}

			public Builder clone() {
				return create().mergeFrom(buildPartial());
			}

			public Builder clear() {
				super.clear();
				id_ = 0L;
				bitField0_ = (bitField0_ & ~0x00000001);
				des_ = "";
				bitField0_ = (bitField0_ & ~0x00000002);
				return this;
			}

			public ProtoBufferPractice.msgInfo getDefaultInstanceForType() {
				return ProtoBufferPractice.msgInfo.getDefaultInstance();
			}

			protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
			internalGetFieldAccessorTable() {
				return ProtoBufferPractice.internal_static_msgInfo_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								ProtoBufferPractice.msgInfo.class, ProtoBufferPractice.msgInfo.Builder.class);
			}

			public com.google.protobuf.Descriptors.Descriptor
			getDescriptorForType() {
				return ProtoBufferPractice.internal_static_msgInfo_descriptor;
			}

			public final boolean isInitialized() {
				if (!hasId()) {

					return false;
				}
				if (!hasDes()) {

					return false;
				}
				return true;
			}

			public ProtoBufferPractice.msgInfo build() {
				ProtoBufferPractice.msgInfo result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public ProtoBufferPractice.msgInfo buildPartial() {
				ProtoBufferPractice.msgInfo result = new ProtoBufferPractice.msgInfo(this);
				int from_bitField0_ = bitField0_;
				int to_bitField0_ = 0;
				if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
					to_bitField0_ |= 0x00000001;
				}
				result.id_ = id_;
				if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
					to_bitField0_ |= 0x00000002;
				}
				result.des_ = des_;
				result.bitField0_ = to_bitField0_;
				onBuilt();
				return result;
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof ProtoBufferPractice.msgInfo) {
					return mergeFrom((ProtoBufferPractice.msgInfo) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws java.io.IOException {
				ProtoBufferPractice.msgInfo parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (ProtoBufferPractice.msgInfo) e.getUnfinishedMessage();
					throw e;
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			public Builder mergeFrom(ProtoBufferPractice.msgInfo other) {
				if (other == ProtoBufferPractice.msgInfo.getDefaultInstance()) return this;
				if (other.hasId()) {
					setId(other.getId());
				}
				if (other.hasDes()) {
					bitField0_ |= 0x00000002;
					des_ = other.des_;
					onChanged();
				}
				this.mergeUnknownFields(other.getUnknownFields());
				return this;
			}

			/**
			 * <code>required int64 id = 1;</code>
			 */
			public Builder clearId() {
				bitField0_ = (bitField0_ & ~0x00000001);
				id_ = 0L;
				onChanged();
				return this;
			}

			/**
			 * <code>required int64 id = 1;</code>
			 */
			public boolean hasId() {
				return ((bitField0_ & 0x00000001) == 0x00000001);
			}

			/**
			 * <code>required string des = 2;</code>
			 */
			public Builder clearDes() {
				bitField0_ = (bitField0_ & ~0x00000002);
				des_ = getDefaultInstance().getDes();
				onChanged();
				return this;
			}

			/**
			 * <code>required int64 id = 1;</code>
			 */
			public long getId() {
				return id_;
			}

			/**
			 * <code>required int64 id = 1;</code>
			 */
			public Builder setId(long value) {
				bitField0_ |= 0x00000001;
				id_ = value;
				onChanged();
				return this;
			}


			/**
			 * <code>required string des = 2;</code>
			 */
			public boolean hasDes() {
				return ((bitField0_ & 0x00000002) == 0x00000002);
			}

			/**
			 * <code>required string des = 2;</code>
			 */
			public java.lang.String getDes() {
				java.lang.Object ref = des_;
				if (!(ref instanceof java.lang.String)) {
					java.lang.String s = ((com.google.protobuf.ByteString) ref)
							.toStringUtf8();
					des_ = s;
					return s;
				} else {
					return (java.lang.String) ref;
				}
			}

			/**
			 * <code>required string des = 2;</code>
			 */
			public com.google.protobuf.ByteString
			getDesBytes() {
				java.lang.Object ref = des_;
				if (ref instanceof String) {
					com.google.protobuf.ByteString b =
							com.google.protobuf.ByteString.copyFromUtf8(
									(java.lang.String) ref);
					des_ = b;
					return b;
				} else {
					return (com.google.protobuf.ByteString) ref;
				}
			}

			/**
			 * <code>required string des = 2;</code>
			 */
			public Builder setDes(
					java.lang.String value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				des_ = value;
				onChanged();
				return this;
			}


			/**
			 * <code>required string des = 2;</code>
			 */
			public Builder setDesBytes(
					com.google.protobuf.ByteString value) {
				if (value == null) {
					throw new NullPointerException();
				}
				bitField0_ |= 0x00000002;
				des_ = value;
				onChanged();
				return this;
			}

			// @@protoc_insertion_point(builder_scope:msgInfo)
		}

		static {
			defaultInstance = new msgInfo(true);
			defaultInstance.initFields();
		}


		// @@protoc_insertion_point(class_scope:msgInfo)
	}

	// @@protoc_insertion_point(outer_class_scope)
}
