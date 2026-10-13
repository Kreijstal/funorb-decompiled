/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    private byte[] indexDigest;
    private int[] groupNameHashes;
    int indexCrc;
    static int field_s;
    int groupCapacity;
    IntKeyIndex groupNameIndex;
    static int field_e;
    int[] groupIds;
    int[] fileCapacities;
    static UiComponent field_j;
    int[] groupVersions;
    IntKeyIndex[] fileNameIndexes;
    int[] groupCrcs;
    int[] fileCounts;
    private int[][] fileNameHashes;
    int revision;
    private int groupCount;
    int[][] fileIds;
    byte[][] groupDigests;
    static String field_q;

    private final void decodeIndex(byte[] data, boolean obfuscationGuard) {
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
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_103_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int formatVersion = 0;
        int indexFlags = 0;
        int hasNames = 0;
        int hasDigests = 0;
        int cumulativeGroupId = 0;
        int maxGroupId = 0;
        int var10 = 0;
        int groupId = 0;
        int fileCount = 0;
        int maxFileId = 0;
        int fileOrdinal = 0;
        int decodedFileId = 0;
        int clientBranchFlag = 0;
        PacketBuffer packet = null;
        byte[] groupDigest = null;
        int cumulativeFileId;
        int groupHashSlot;
        int crcGroupOrdinal;
        int digestGroupOrdinal;
        int versionGroupOrdinal;
        int fileGroupOrdinal;
        int fileNameGroupOrdinal;
        int fileHashSlot;
        int fileId;
        int namedGroupId;
        int namedFileCount;
        int groupNameOrdinal;
        int fileNameOrdinal;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          packet = new PacketBuffer(AchievementIcon.decompressArchiveContainer(true, data));
          formatVersion = packet.readUnsignedByte(255);
          if (formatVersion >= 5 &&
            formatVersion <= 7) {
            if (formatVersion < 6) {
              this.revision = 0;
            } else {
              this.revision = packet.readInt(255);
            }
            indexFlags = packet.readUnsignedByte(255);
            stackIn_11_0 = (0 == (indexFlags & 1)) ? 0 : 1;
            hasNames = stackIn_11_0;
            stackIn_14_0 = (0 == (indexFlags & 2)) ? 0 : 1;
            hasDigests = stackIn_14_0;
            if (formatVersion >= 7) {
              this.groupCount = packet.readLargeSmart(false);
            } else {
              this.groupCount = packet.readUnsignedShort(65280);
            }
            cumulativeGroupId = 0;
            this.groupIds = new int[this.groupCount];
            if (obfuscationGuard) {
              ArchiveIndex.a((byte) 19);
            }
            maxGroupId = -1;
            if (formatVersion >= 7) {
              for (var10 = 0; var10 < this.groupCount; var10++) {
                dupTemp$0 = cumulativeGroupId + packet.readLargeSmart(false);
                cumulativeGroupId = dupTemp$0;
                this.groupIds[var10] = dupTemp$0;
                if (maxGroupId < this.groupIds[var10]) {
                  maxGroupId = this.groupIds[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.groupCount; var10++) {
                dupTemp$1 = cumulativeGroupId + packet.readUnsignedShort(65280);
                cumulativeGroupId = dupTemp$1;
                this.groupIds[var10] = dupTemp$1;
                if (maxGroupId < this.groupIds[var10]) {
                  maxGroupId = this.groupIds[var10];
                }
              }
            }
            this.groupCapacity = 1 + maxGroupId;
            this.groupVersions = new int[this.groupCapacity];
            if (hasDigests != 0) {
              this.groupDigests = new byte[this.groupCapacity][];
            }
            this.fileCapacities = new int[this.groupCapacity];
            this.groupCrcs = new int[this.groupCapacity];
            this.fileCounts = new int[this.groupCapacity];
            this.fileIds = new int[this.groupCapacity][];
            if (hasNames != 0) {
              this.groupNameHashes = new int[this.groupCapacity];
              for (groupHashSlot = 0; this.groupCapacity > groupHashSlot; groupHashSlot++) {
                this.groupNameHashes[groupHashSlot] = -1;
              }
              for (groupNameOrdinal = 0; groupNameOrdinal < this.groupCount; groupNameOrdinal++) {
                this.groupNameHashes[this.groupIds[groupNameOrdinal]] = packet.readInt(255);
              }
              this.groupNameIndex = new IntKeyIndex(this.groupNameHashes);
            }
            for (crcGroupOrdinal = 0; this.groupCount > crcGroupOrdinal; crcGroupOrdinal++) {
              this.groupCrcs[this.groupIds[crcGroupOrdinal]] = packet.readInt(255);
            }
            if (hasDigests != 0) {
              for (digestGroupOrdinal = 0; digestGroupOrdinal < this.groupCount; digestGroupOrdinal++) {
                groupDigest = new byte[64];
                packet.readBytes(0, groupDigest, 110, 64);
                this.groupDigests[this.groupIds[digestGroupOrdinal]] = groupDigest;
              }
            }
            for (versionGroupOrdinal = 0; this.groupCount > versionGroupOrdinal; versionGroupOrdinal++) {
              this.groupVersions[this.groupIds[versionGroupOrdinal]] = packet.readInt(255);
            }
            if (formatVersion < 7) {
              for (fileGroupOrdinal = 0; fileGroupOrdinal < this.groupCount; fileGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileGroupOrdinal]] = packet.readUnsignedShort(65280);
              }
              for (fileGroupOrdinal = 0; this.groupCount > fileGroupOrdinal; fileGroupOrdinal++) {
                groupId = this.groupIds[fileGroupOrdinal];
                cumulativeFileId = 0;
                fileCount = this.fileCounts[groupId];
                maxFileId = -1;
                array$2 = new int[fileCount];
                this.fileIds[groupId] = array$2;
                for (fileOrdinal = 0; fileOrdinal < fileCount; fileOrdinal++) {
                  dupTemp$3 = cumulativeFileId + packet.readUnsignedShort(65280);
                  cumulativeFileId = dupTemp$3;
                  dupTemp$4 = this.fileIds[groupId];
                  dupTemp$4[fileOrdinal] = dupTemp$3;
                  decodedFileId = dupTemp$3;
                  if (decodedFileId > maxFileId) {
                    maxFileId = decodedFileId;
                  }
                }
                this.fileCapacities[groupId] = 1 + maxFileId;
                if (maxFileId + 1 == fileCount) {
                  this.fileIds[groupId] = null;
                }
              }
            } else {
              for (fileGroupOrdinal = 0; fileGroupOrdinal < this.groupCount; fileGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileGroupOrdinal]] = packet.readLargeSmart(false);
              }
              for (fileGroupOrdinal = 0; this.groupCount > fileGroupOrdinal; fileGroupOrdinal++) {
                groupId = this.groupIds[fileGroupOrdinal];
                cumulativeFileId = 0;
                fileCount = this.fileCounts[groupId];
                array$5 = new int[fileCount];
                this.fileIds[groupId] = array$5;
                maxFileId = -1;
                for (fileOrdinal = 0; fileOrdinal < fileCount; fileOrdinal++) {
                  dupTemp$6 = cumulativeFileId + packet.readLargeSmart(false);
                  cumulativeFileId = dupTemp$6;
                  dupTemp$7 = this.fileIds[groupId];
                  dupTemp$7[fileOrdinal] = dupTemp$6;
                  decodedFileId = dupTemp$6;
                  if (maxFileId < decodedFileId) {
                    maxFileId = decodedFileId;
                  }
                }
                this.fileCapacities[groupId] = maxFileId + 1;
                if (1 + maxFileId == fileCount) {
                  this.fileIds[groupId] = null;
                }
              }
            }
            if (hasNames != 0) {
              this.fileNameIndexes = new IntKeyIndex[maxGroupId + 1];
              this.fileNameHashes = new int[1 + maxGroupId][];
              for (fileNameGroupOrdinal = 0; this.groupCount > fileNameGroupOrdinal; fileNameGroupOrdinal++) {
                namedGroupId = this.groupIds[fileNameGroupOrdinal];
                namedFileCount = this.fileCounts[namedGroupId];
                array$8 = new int[this.fileCapacities[namedGroupId]];
                this.fileNameHashes[namedGroupId] = array$8;
                for (fileHashSlot = 0; this.fileCapacities[namedGroupId] > fileHashSlot; fileHashSlot++) {
                  this.fileNameHashes[namedGroupId][fileHashSlot] = -1;
                }
                for (fileNameOrdinal = 0; fileNameOrdinal < namedFileCount; fileNameOrdinal++) {
                  if (null == this.fileIds[namedGroupId]) {
                    fileId = fileNameOrdinal;
                  } else {
                    fileId = this.fileIds[namedGroupId][fileNameOrdinal];
                  }
                  this.fileNameHashes[namedGroupId][fileId] = packet.readInt(255);
                }
                this.fileNameIndexes[namedGroupId] = new IntKeyIndex(this.fileNameHashes[namedGroupId]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_102_0 = var3;
          stackIn_102_1 = new StringBuilder().append("ko.A(");
          if (data == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var2 = BrickABrac.field_J ? 1 : 0;
        if (ml.field_b > 0) {
          ml.field_b = ml.field_b - 1;
        } else {
          if (IntArrayRequest.field_j > 0) {
            IntArrayRequest.field_j = IntArrayRequest.field_j - 1;
          } else {
            if (TableDataRequest.field_m > 0) {
              TableDataRequest.field_m = TableDataRequest.field_m - 1;
            }
          }
        }
        if (param0 != -32120) {
          return;
        }
        if (!(ml.field_b <= 0)) {
          Brick.e(param0 ^ 32040);
        }
        if (!(IntArrayRequest.field_j <= 0)) {
          co.a(IntArrayRequest.field_j, false);
        }
        if (TableDataRequest.field_m > 0) {
          co.a(TableDataRequest.field_m, false);
        }
    }

    final static void a(int param0, int param1, RgbSprite param2, int param3, RgbSprite param4, int param5, int param6, int param7, int param8, int param9, RgbSprite param10) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var11 = null;
        try {
          param4.drawAt(param8 - (-((-param4.canvasWidth + param6) / 2) - (5 * param3 >> 16)), param9);
          if (param0 > -20) {
            field_s = 123;
          }
          param10.drawTransparent(-(30 / param7) + (param8 + ((-param10.canvasWidth + param6) / 2 + (param3 * 10 >> 16))), 37 / param7 + (-param10.canvasHeight + 480 + param9) + param1);
          param2.drawTransparent(param8 - (-((param6 - param2.canvasWidth) / 2) - (20 * param3 >> 16)) - 5 / param7, -param2.canvasHeight + 480 + (param9 + param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var11 = decompiledCaughtException;
          stackIn_6_0 = var11;
          stackIn_6_1 = new StringBuilder().append("ko.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= 108) {
          return;
        }
        field_q = null;
        field_j = null;
    }

    ArchiveIndex(byte[] data, int expectedCrc, byte[] expectedDigest) {
        int var4_int = 0;
        try {
          this.indexCrc = NanoGameClock.a(data.length, data, (byte) -86);
          if (expectedCrc != this.indexCrc) {
            throw new RuntimeException();
          }
          if (expectedDigest != null) {
            if (expectedDigest.length != 64) {
              throw new RuntimeException();
            }
            this.indexDigest = jd.a(data, 0, -14970, data.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.indexDigest[var4_int] != expectedDigest[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decodeIndex(data, false);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ko.<init>(" + (data != null ? "{...}" : "null") + ',' + expectedCrc + ',' + (expectedDigest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "PER MONTH";
    }
}
