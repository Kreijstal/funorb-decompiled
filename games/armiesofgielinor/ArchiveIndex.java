/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    static String[] field_w;
    byte[][] groupDigests;
    IntKeyLookup groupNameLookup;
    int[] groupCrcs;
    int[] groupIds;
    static ClientUiComponent field_b;
    private int[] groupNameHashes;
    int indexCrc;
    private int[][] fileNameHashes;
    private byte[] indexDigest;
    static NodeDeque field_o;
    static String field_d;
    IntKeyLookup[] fileNameLookups;
    static String field_u;
    private int groupCount;
    int groupCapacity;
    int[] fileCounts;
    int[][] fileIds;
    int[] groupVersions;
    int revision;
    static boolean field_g;
    static volatile int pressedPointerButton;
    int[] fileCapacities;

    private final void decode(byte[] encodedIndex, boolean obfuscationGuard) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int formatVersion = 0;
        int flags = 0;
        int hasNames = 0;
        int hasGroupDigests = 0;
        int cumulativeGroupId = 0;
        int maximumGroupId = 0;
        int groupOrdinal = 0;
        int groupId = 0;
        int fileCount = 0;
        int maximumFileId = 0;
        int fileOrdinal = 0;
        int fileId = 0;
        int var16 = 0;
        byte[] var17 = null;
        PacketBuffer packet = null;
        byte[] groupDigest = null;
        int cumulativeFileId;
        int groupNameSlot;
        int crcGroupOrdinal;
        int digestGroupOrdinal;
        int versionGroupOrdinal;
        int fileGroupOrdinal;
        int namedGroupOrdinal;
        int fileNameSlot;
        int namedFileId;
        int namedGroupId;
        int namedFileCount;
        int groupNameOrdinal;
        int namedFileOrdinal;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          packet = new PacketBuffer(el.decompressContainer(obfuscationGuard, encodedIndex));
          formatVersion = packet.readUnsignedByte(0);
          if (5 <= formatVersion &&
            formatVersion <= 7) {
            if (formatVersion >= 6) {
              this.revision = packet.readInt(1);
            } else {
              this.revision = 0;
            }
            flags = packet.readUnsignedByte(0);
            stackIn_11_0 = ((flags & 1) == 0) ? 0 : 1;
            hasNames = stackIn_11_0;
            stackIn_14_0 = ((flags & 2) == 0) ? 0 : 1;
            hasGroupDigests = stackIn_14_0;
            if (7 > formatVersion) {
              this.groupCount = packet.readUnsignedShort((byte) -104);
            } else {
              this.groupCount = packet.readLargeSmart((byte) 111);
            }
            cumulativeGroupId = 0;
            this.groupIds = new int[this.groupCount];
            maximumGroupId = -1;
            if (formatVersion < 7) {
              for (groupOrdinal = 0; this.groupCount > groupOrdinal; groupOrdinal++) {
                dupTemp$0 = cumulativeGroupId + packet.readUnsignedShort((byte) -104);
                cumulativeGroupId = dupTemp$0;
                this.groupIds[groupOrdinal] = dupTemp$0;
                if (this.groupIds[groupOrdinal] > maximumGroupId) {
                  maximumGroupId = this.groupIds[groupOrdinal];
                }
              }
            } else {
              for (groupOrdinal = 0; this.groupCount > groupOrdinal; groupOrdinal++) {
                dupTemp$1 = cumulativeGroupId + packet.readLargeSmart((byte) 101);
                cumulativeGroupId = dupTemp$1;
                this.groupIds[groupOrdinal] = dupTemp$1;
                if (maximumGroupId < this.groupIds[groupOrdinal]) {
                  maximumGroupId = this.groupIds[groupOrdinal];
                }
              }
            }
            this.groupCapacity = maximumGroupId + 1;
            if (obfuscationGuard) {
              var17 = (byte[]) null;
              this.decode((byte[]) null, true);
            }
            this.groupCrcs = new int[this.groupCapacity];
            this.fileCapacities = new int[this.groupCapacity];
            this.fileIds = new int[this.groupCapacity][];
            if (hasGroupDigests != 0) {
              this.groupDigests = new byte[this.groupCapacity][];
            }
            this.fileCounts = new int[this.groupCapacity];
            this.groupVersions = new int[this.groupCapacity];
            if (hasNames != 0) {
              this.groupNameHashes = new int[this.groupCapacity];
              for (groupNameSlot = 0; groupNameSlot < this.groupCapacity; groupNameSlot++) {
                this.groupNameHashes[groupNameSlot] = -1;
              }
              for (groupNameOrdinal = 0; this.groupCount > groupNameOrdinal; groupNameOrdinal++) {
                this.groupNameHashes[this.groupIds[groupNameOrdinal]] = packet.readInt(1);
              }
              this.groupNameLookup = new IntKeyLookup(this.groupNameHashes);
            }
            for (crcGroupOrdinal = 0; crcGroupOrdinal < this.groupCount; crcGroupOrdinal++) {
              this.groupCrcs[this.groupIds[crcGroupOrdinal]] = packet.readInt(1);
            }
            if (hasGroupDigests != 0) {
              for (digestGroupOrdinal = 0; digestGroupOrdinal < this.groupCount; digestGroupOrdinal++) {
                groupDigest = new byte[64];
                packet.readBytes(0, 64, 0, groupDigest);
                this.groupDigests[this.groupIds[digestGroupOrdinal]] = groupDigest;
              }
            }
            for (versionGroupOrdinal = 0; versionGroupOrdinal < this.groupCount; versionGroupOrdinal++) {
              this.groupVersions[this.groupIds[versionGroupOrdinal]] = packet.readInt(1);
            }
            if (formatVersion >= 7) {
              for (fileGroupOrdinal = 0; this.groupCount > fileGroupOrdinal; fileGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileGroupOrdinal]] = packet.readLargeSmart((byte) 102);
              }
              for (fileGroupOrdinal = 0; fileGroupOrdinal < this.groupCount; fileGroupOrdinal++) {
                groupId = this.groupIds[fileGroupOrdinal];
                cumulativeFileId = 0;
                fileCount = this.fileCounts[groupId];
                array$2 = new int[fileCount];
                this.fileIds[groupId] = array$2;
                maximumFileId = -1;
                for (fileOrdinal = 0; fileOrdinal < fileCount; fileOrdinal++) {
                  dupTemp$3 = cumulativeFileId + packet.readLargeSmart((byte) 125);
                  cumulativeFileId = dupTemp$3;
                  dupTemp$4 = this.fileIds[groupId];
                  dupTemp$4[fileOrdinal] = dupTemp$3;
                  fileId = dupTemp$3;
                  if (fileId > maximumFileId) {
                    maximumFileId = fileId;
                  }
                }
                this.fileCapacities[groupId] = maximumFileId + 1;
                if (fileCount == 1 + maximumFileId) {
                  this.fileIds[groupId] = null;
                }
              }
            } else {
              for (fileGroupOrdinal = 0; this.groupCount > fileGroupOrdinal; fileGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileGroupOrdinal]] = packet.readUnsignedShort((byte) -104);
              }
              for (fileGroupOrdinal = 0; fileGroupOrdinal < this.groupCount; fileGroupOrdinal++) {
                groupId = this.groupIds[fileGroupOrdinal];
                cumulativeFileId = 0;
                fileCount = this.fileCounts[groupId];
                maximumFileId = -1;
                array$5 = new int[fileCount];
                this.fileIds[groupId] = array$5;
                for (fileOrdinal = 0; fileCount > fileOrdinal; fileOrdinal++) {
                  dupTemp$6 = cumulativeFileId + packet.readUnsignedShort((byte) -104);
                  cumulativeFileId = dupTemp$6;
                  dupTemp$7 = this.fileIds[groupId];
                  dupTemp$7[fileOrdinal] = dupTemp$6;
                  fileId = dupTemp$6;
                  if (fileId > maximumFileId) {
                    maximumFileId = fileId;
                  }
                }
                this.fileCapacities[groupId] = maximumFileId + 1;
                if (fileCount == 1 + maximumFileId) {
                  this.fileIds[groupId] = null;
                }
              }
            }
            if (hasNames != 0) {
              this.fileNameHashes = new int[maximumGroupId + 1][];
              this.fileNameLookups = new IntKeyLookup[1 + maximumGroupId];
              for (namedGroupOrdinal = 0; namedGroupOrdinal < this.groupCount; namedGroupOrdinal++) {
                namedGroupId = this.groupIds[namedGroupOrdinal];
                namedFileCount = this.fileCounts[namedGroupId];
                array$8 = new int[this.fileCapacities[namedGroupId]];
                this.fileNameHashes[namedGroupId] = array$8;
                for (fileNameSlot = 0; this.fileCapacities[namedGroupId] > fileNameSlot; fileNameSlot++) {
                  this.fileNameHashes[namedGroupId][fileNameSlot] = -1;
                }
                for (namedFileOrdinal = 0; namedFileOrdinal < namedFileCount; namedFileOrdinal++) {
                  if (this.fileIds[namedGroupId] == null) {
                    namedFileId = namedFileOrdinal;
                  } else {
                    namedFileId = this.fileIds[namedGroupId][namedFileOrdinal];
                  }
                  this.fileNameHashes[namedGroupId][namedFileId] = packet.readInt(1);
                }
                this.fileNameLookups[namedGroupId] = new IntKeyLookup(this.fileNameHashes[namedGroupId]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("jm.B(");
          if (encodedIndex == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          PacketBuffer.a(0, LoginForm.field_T, false, pd.field_e, EmailConfirmationValidator.field_p, param0, true);
          for (var2_int = param1; EmailConfirmationValidator.field_p > var2_int; var2_int++) {
            SpriteControlNode.field_m[param0 + var2_int] = var2_int;
          }
          PacketBuffer.a(param0, se.field_e, false, sq.field_k, EmailConfirmationValidator.field_p + param0, param0 + param0, false);
          if (param0 < EmailConfirmationValidator.field_p) {
            EmailConfirmationValidator.field_p = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "jm.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(ClientUiComponent param0, int param1) {
        ClientUiComponent var5 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        ClientUiComponent var4 = (ClientUiComponent) (param0.children.first((byte) 121));
        ClientUiComponent var2 = var4;
        while (var4 != null) {
          var4.pendingHeightDelta = 0;
          var4.height = 0;
          var4.pendingYDelta = 0;
          var4.y = 0;
          var5 = (ClientUiComponent) (param0.children.next((byte) 123));
          var5 = var5;
        }
        param0.pendingHeightDelta = 0;
        param0.height = 0;
        param0.y = 0;
        if (param1 > -42) {
          return;
        }
        try {
          param0.pendingYDelta = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_w = null;
        field_u = null;
        if (param0 > -48) {
          return;
        }
        field_o = null;
        field_d = null;
        field_b = null;
    }

    ArchiveIndex(byte[] encodedIndex, int expectedCrc, byte[] expectedDigest) {
        int var4_int = 0;
        try {
          this.indexCrc = ValidationStatusWidget.a(encodedIndex, encodedIndex.length, 120);
          if (this.indexCrc != expectedCrc) {
            throw new RuntimeException();
          }
          if (expectedDigest != null) {
            if (64 != expectedDigest.length) {
              throw new RuntimeException();
            }
            this.indexDigest = SpellCastAction.a(-18423, encodedIndex.length, encodedIndex, 0);
            for (var4_int = 0; 64 > var4_int; var4_int++) {
              if (this.indexDigest[var4_int] != expectedDigest[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decode(encodedIndex, false);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jm.<init>(" + (encodedIndex != null ? "{...}" : "null") + ',' + expectedCrc + ',' + (expectedDigest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new String[]{"Player_1", "Player_2", "Player_3", "Player_4", "Player_5", "Player_6", "Player_7", "Player_8"};
        field_u = "Remove name";
        field_d = "Accessories";
        field_g = false;
        field_o = new NodeDeque();
        pressedPointerButton = 0;
    }
}
