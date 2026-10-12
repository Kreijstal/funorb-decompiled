/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    int[] fileCapacities;
    static int field_r;
    int[] groupVersions;
    IntKeyLookup groupNameLookup;
    byte[][] groupDigests;
    private int groupCount;
    static float field_c;
    IntKeyLookup[] fileNameLookups;
    static int field_p;
    int[] groupIds;
    int revision;
    private int[][] fileNameHashes;
    int indexCrc;
    int[] fileCounts;
    static SceneWidget field_s;
    private byte[] indexDigest;
    int groupCapacity;
    static oe field_w;
    static String field_f;
    private int[] groupNameHashes;
    int[] groupCrcs;
    static String field_i;
    int[][] fileIds;

    final static void a(boolean param0) {
        aj var1 = (aj) (sl.field_b.c(-6533));
        if (var1 == null) {
          var1 = new aj();
        }
        var1.a(SoftwareRaster.field_b, SoftwareRaster.field_i, SoftwareRaster.field_c, SoftwareRaster.field_l, SoftwareRaster.field_g, SoftwareRaster.field_d, SoftwareRaster.field_j, (byte) -62);
        ff.field_qb.addLast(3, var1);
        if (param0) {
          ArchiveIndex.a(true);
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_w = null;
        if (param0 != 0) {
          ArchiveIndex.a(81);
        }
        field_i = null;
        field_s = null;
    }

    private final void decode(byte[] encodedIndex, int obfuscationGuard) {
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
        int stackIn_17_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_104_2 = null;
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
        var16 = SteelSentinels.obfuscationControl;
        try {
          packet = new PacketBuffer(ln.decompressContainer(encodedIndex, (byte) 127));
          formatVersion = packet.readUnsignedByte((byte) -66);
          if (5 <= formatVersion &&
            formatVersion <= 7) {
            if (formatVersion >= 6) {
              this.revision = packet.readInt(0);
            } else {
              this.revision = 0;
            }
            flags = packet.readUnsignedByte((byte) -111);
            stackIn_11_0 = ((1 & flags) == 0) ? 0 : 1;
            hasNames = stackIn_11_0;
            if (formatVersion < 7) {
              this.groupCount = packet.readUnsignedShort((byte) -60);
            } else {
              this.groupCount = packet.readLargeSmart(true);
            }
            stackIn_17_0 = ((flags & 2) == 0) ? 0 : 1;
            hasGroupDigests = stackIn_17_0;
            cumulativeGroupId = 0;
            maximumGroupId = -1;
            this.groupIds = new int[this.groupCount];
            if (7 > formatVersion) {
              for (groupOrdinal = 0; this.groupCount > groupOrdinal; groupOrdinal++) {
                dupTemp$0 = cumulativeGroupId + packet.readUnsignedShort((byte) -60);
                cumulativeGroupId = dupTemp$0;
                this.groupIds[groupOrdinal] = dupTemp$0;
                if (this.groupIds[groupOrdinal] > maximumGroupId) {
                  maximumGroupId = this.groupIds[groupOrdinal];
                }
              }
            } else {
              for (groupOrdinal = 0; this.groupCount > groupOrdinal; groupOrdinal++) {
                dupTemp$1 = cumulativeGroupId + packet.readLargeSmart(true);
                cumulativeGroupId = dupTemp$1;
                this.groupIds[groupOrdinal] = dupTemp$1;
                if (this.groupIds[groupOrdinal] > maximumGroupId) {
                  maximumGroupId = this.groupIds[groupOrdinal];
                }
              }
            }
            this.groupCapacity = 1 + maximumGroupId;
            this.fileIds = new int[this.groupCapacity][];
            this.fileCapacities = new int[this.groupCapacity];
            if (hasGroupDigests != 0) {
              this.groupDigests = new byte[this.groupCapacity][];
            }
            this.fileCounts = new int[this.groupCapacity];
            this.groupCrcs = new int[this.groupCapacity];
            this.groupVersions = new int[this.groupCapacity];
            if (hasNames != 0) {
              this.groupNameHashes = new int[this.groupCapacity];
              for (groupNameSlot = 0; this.groupCapacity > groupNameSlot; groupNameSlot++) {
                this.groupNameHashes[groupNameSlot] = -1;
              }
              for (groupNameOrdinal = 0; groupNameOrdinal < this.groupCount; groupNameOrdinal++) {
                this.groupNameHashes[this.groupIds[groupNameOrdinal]] = packet.readInt(0);
              }
              this.groupNameLookup = new IntKeyLookup(this.groupNameHashes);
            }
            for (crcGroupOrdinal = 0; this.groupCount > crcGroupOrdinal; crcGroupOrdinal++) {
              this.groupCrcs[this.groupIds[crcGroupOrdinal]] = packet.readInt(0);
            }
            if (hasGroupDigests != 0) {
              for (digestGroupOrdinal = 0; digestGroupOrdinal < this.groupCount; digestGroupOrdinal++) {
                groupDigest = new byte[64];
                packet.readBytes(0, groupDigest, 28, 64);
                this.groupDigests[this.groupIds[digestGroupOrdinal]] = groupDigest;
              }
            }
            if (obfuscationGuard < 64) {
              return;
            }
            for (versionGroupOrdinal = 0; this.groupCount > versionGroupOrdinal; versionGroupOrdinal++) {
              this.groupVersions[this.groupIds[versionGroupOrdinal]] = packet.readInt(0);
            }
            if (formatVersion < 7) {
              for (fileGroupOrdinal = 0; this.groupCount > fileGroupOrdinal; fileGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileGroupOrdinal]] = packet.readUnsignedShort((byte) -60);
              }
              for (fileGroupOrdinal = 0; this.groupCount > fileGroupOrdinal; fileGroupOrdinal++) {
                groupId = this.groupIds[fileGroupOrdinal];
                cumulativeFileId = 0;
                fileCount = this.fileCounts[groupId];
                array$2 = new int[fileCount];
                this.fileIds[groupId] = array$2;
                maximumFileId = -1;
                for (fileOrdinal = 0; fileOrdinal < fileCount; fileOrdinal++) {
                  dupTemp$3 = cumulativeFileId + packet.readUnsignedShort((byte) -60);
                  cumulativeFileId = dupTemp$3;
                  dupTemp$4 = this.fileIds[groupId];
                  dupTemp$4[fileOrdinal] = dupTemp$3;
                  fileId = dupTemp$3;
                  if (maximumFileId < fileId) {
                    maximumFileId = fileId;
                  }
                }
                this.fileCapacities[groupId] = 1 + maximumFileId;
                if (fileCount == 1 + maximumFileId) {
                  this.fileIds[groupId] = null;
                }
              }
            } else {
              for (fileGroupOrdinal = 0; this.groupCount > fileGroupOrdinal; fileGroupOrdinal++) {
                this.fileCounts[this.groupIds[fileGroupOrdinal]] = packet.readLargeSmart(true);
              }
              for (fileGroupOrdinal = 0; fileGroupOrdinal < this.groupCount; fileGroupOrdinal++) {
                groupId = this.groupIds[fileGroupOrdinal];
                cumulativeFileId = 0;
                fileCount = this.fileCounts[groupId];
                maximumFileId = -1;
                array$5 = new int[fileCount];
                this.fileIds[groupId] = array$5;
                for (fileOrdinal = 0; fileCount > fileOrdinal; fileOrdinal++) {
                  dupTemp$6 = cumulativeFileId + packet.readLargeSmart(true);
                  cumulativeFileId = dupTemp$6;
                  dupTemp$7 = this.fileIds[groupId];
                  dupTemp$7[fileOrdinal] = dupTemp$6;
                  fileId = dupTemp$6;
                  if (fileId > maximumFileId) {
                    maximumFileId = fileId;
                  }
                }
                this.fileCapacities[groupId] = maximumFileId + 1;
                if (maximumFileId + 1 == fileCount) {
                  this.fileIds[groupId] = null;
                }
              }
            }
            if (hasNames != 0) {
              this.fileNameLookups = new IntKeyLookup[maximumGroupId + 1];
              this.fileNameHashes = new int[1 + maximumGroupId][];
              for (namedGroupOrdinal = 0; this.groupCount > namedGroupOrdinal; namedGroupOrdinal++) {
                namedGroupId = this.groupIds[namedGroupOrdinal];
                namedFileCount = this.fileCounts[namedGroupId];
                array$8 = new int[this.fileCapacities[namedGroupId]];
                this.fileNameHashes[namedGroupId] = array$8;
                for (fileNameSlot = 0; this.fileCapacities[namedGroupId] > fileNameSlot; fileNameSlot++) {
                  this.fileNameHashes[namedGroupId][fileNameSlot] = -1;
                }
                for (namedFileOrdinal = 0; namedFileCount > namedFileOrdinal; namedFileOrdinal++) {
                  if (null == this.fileIds[namedGroupId]) {
                    namedFileId = namedFileOrdinal;
                  } else {
                    namedFileId = this.fileIds[namedGroupId][namedFileOrdinal];
                  }
                  this.fileNameHashes[namedGroupId][namedFileId] = packet.readInt(0);
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
          stackIn_103_0 = var3;
          stackIn_103_1 = new StringBuilder().append("jl.C(");
          if (encodedIndex == null) {
            stackIn_104_2 = "null";
          } else {
            stackIn_104_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_103_0), ((StringBuilder) (Object) stackIn_103_1).append(stackIn_104_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    ArchiveIndex(byte[] encodedIndex, int expectedCrc, byte[] expectedDigest) {
        int var4_int = 0;
        try {
          this.indexCrc = ba.a((byte) -107, encodedIndex, encodedIndex.length);
          if (this.indexCrc != expectedCrc) {
            throw new RuntimeException();
          }
          if (expectedDigest != null) {
            if (64 != expectedDigest.length) {
              throw new RuntimeException();
            }
            this.indexDigest = co.a((byte) -37, encodedIndex.length, 0, encodedIndex);
            for (var4_int = 0; 64 > var4_int; var4_int++) {
              if (expectedDigest[var4_int] != this.indexDigest[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decode(encodedIndex, 70);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "jl.<init>(" + (encodedIndex != null ? "{...}" : "null") + ',' + expectedCrc + ',' + (expectedDigest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "Unpacking graphics";
        field_f = "Click or press F10 to open Quick Chat";
    }
}
