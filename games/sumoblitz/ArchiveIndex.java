/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    int crc;
    int[] groupCrcs;
    static String loadingInstrumentsText;
    private int[][] fileNameHashes;
    private byte[] digest;
    static long field_j;
    byte[][] groupDigests;
    int revision;
    IntIndexHashTable groupNameIndex;
    int groupCapacity;
    int[] groupVersions;
    IntIndexHashTable[] fileNameIndices;
    private int groupCount;
    int[] fileCounts;
    private int[] groupNameHashes;
    int[][] fileIds;
    int[] fileCapacities;
    static String passwordsMustBeBetweenText;
    int[] groupIds;

    private final void decode(byte[] containerBytes, byte guard) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_106_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        PacketBuffer var17 = null;
        byte[] var21 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != -56) {
            return;
          }
          var17 = new PacketBuffer(GridWidgetContainer.decompressContainer(-1, containerBytes));
          var4 = var17.readUnsignedByte(guard ^ 31346);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.revision = 0;
            } else {
              this.revision = var17.readInt(true);
            }
            var5 = var17.readUnsignedByte(-31302);
            stackIn_13_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_13_0;
            if (var4 < 7) {
              this.groupCount = var17.readUnsignedShort(255);
            } else {
              this.groupCount = var17.readLargeSmart(0);
            }
            stackIn_19_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_19_0;
            var8 = 0;
            var9 = -1;
            this.groupIds = new int[this.groupCount];
            if (var4 >= 7) {
              for (var10 = 0; this.groupCount > var10; var10++) {
                dupTemp$0 = var8 + var17.readLargeSmart(0);
                var8 = dupTemp$0;
                this.groupIds[var10] = dupTemp$0;
                if (var9 < this.groupIds[var10]) {
                  var9 = this.groupIds[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.groupCount; var10++) {
                dupTemp$1 = var8 + var17.readUnsignedShort(GzipDecompressor.bitwiseXor((int) guard, -201));
                var8 = dupTemp$1;
                this.groupIds[var10] = dupTemp$1;
                if (this.groupIds[var10] > var9) {
                  var9 = this.groupIds[var10];
                }
              }
            }
            this.groupCapacity = var9 + 1;
            this.groupCrcs = new int[this.groupCapacity];
            this.groupVersions = new int[this.groupCapacity];
            if (var7 != 0) {
              this.groupDigests = new byte[this.groupCapacity][];
            }
            this.fileIds = new int[this.groupCapacity][];
            this.fileCapacities = new int[this.groupCapacity];
            this.fileCounts = new int[this.groupCapacity];
            if (var6 != 0) {
              this.groupNameHashes = new int[this.groupCapacity];
              for (var10Lifetime1 = 0; this.groupCapacity > var10Lifetime1; var10Lifetime1++) {
                this.groupNameHashes[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.groupCount > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.groupNameHashes[this.groupIds[var10Lifetime1Lifetime1]] = var17.readInt(true);
              }
              this.groupNameIndex = new IntIndexHashTable(this.groupNameHashes);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.groupCount; var10Lifetime2++) {
              this.groupCrcs[this.groupIds[var10Lifetime2]] = var17.readInt(true);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.groupCount; var10Lifetime3++) {
                this.groupVersions[this.groupIds[var10Lifetime3]] = var17.readInt(true);
              }
            } else {
              for (var10Lifetime3 = 0; this.groupCount > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.readBytes(var21, 64, 0, (byte) -109);
                this.groupDigests[this.groupIds[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; var10Lifetime3 < this.groupCount; var10Lifetime3++) {
                this.groupVersions[this.groupIds[var10Lifetime3]] = var17.readInt(true);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; this.groupCount > var10Lifetime4; var10Lifetime4++) {
                this.fileCounts[this.groupIds[var10Lifetime4]] = var17.readLargeSmart(0);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.groupCount; var10Lifetime4++) {
                var11 = this.groupIds[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.fileCounts[var11];
                var13 = -1;
                array$2 = new int[var12];
                this.fileIds[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.readLargeSmart(0);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.fileIds[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.fileCapacities[var11] = 1 + var13;
                if (1 + var13 == var12) {
                  this.fileIds[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; var10Lifetime4 < this.groupCount; var10Lifetime4++) {
                this.fileCounts[this.groupIds[var10Lifetime4]] = var17.readUnsignedShort(255);
              }
              for (var10Lifetime4 = 0; this.groupCount > var10Lifetime4; var10Lifetime4++) {
                var11 = this.groupIds[var10Lifetime4];
                var12 = this.fileCounts[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.fileIds[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.readUnsignedShort(255);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.fileIds[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.fileCapacities[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.fileIds[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.fileNameHashes = new int[var9 + 1][];
              this.fileNameIndices = new IntIndexHashTable[1 + var9];
              for (var10Lifetime5 = 0; this.groupCount > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.groupIds[var10Lifetime5];
                var12Lifetime1 = this.fileCounts[var11Lifetime1];
                array$8 = new int[this.fileCapacities[var11Lifetime1]];
                this.fileNameHashes[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.fileCapacities[var11Lifetime1]; var13Lifetime1++) {
                  this.fileNameHashes[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.fileIds[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.fileIds[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.fileNameHashes[var11Lifetime1][var14Lifetime1] = var17.readInt(true);
                }
                this.fileNameIndices[var11Lifetime1] = new IntIndexHashTable(this.fileNameHashes[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_105_0 = var3;
          stackIn_105_1 = new StringBuilder().append("sg.C(");
          if (containerBytes == null) {
            stackIn_106_2 = "null";
          } else {
            stackIn_106_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_105_0), ((StringBuilder) (Object) stackIn_105_1).append(stackIn_106_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > -67) {
          return;
        }
        passwordsMustBeBetweenText = null;
        loadingInstrumentsText = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 < 12) {
          return false;
        }
        return (param1 & 2048) != 0 ? true : false;
    }

    ArchiveIndex(byte[] containerBytes, int expectedCrc, byte[] expectedDigest) {
        int var4_int = 0;
        try {
          this.crc = CachedArchiveProvider.crc32(containerBytes.length, containerBytes, (byte) 18);
          if (this.crc != expectedCrc) {
            throw new RuntimeException();
          }
          if (expectedDigest != null) {
            if (64 != expectedDigest.length) {
              throw new RuntimeException();
            }
            this.digest = gn.whirlpoolDigest(containerBytes, (byte) -110, 0, containerBytes.length);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (expectedDigest[var4_int] != this.digest[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decode(containerBytes, (byte) -56);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sg.<init>(" + (containerBytes != null ? "{...}" : "null") + ',' + expectedCrc + ',' + (expectedDigest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        loadingInstrumentsText = "Loading instruments";
        passwordsMustBeBetweenText = "Passwords must be between 5 and 20 characters long";
    }
}
