/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    int[] groupIds;
    byte[][] groupDigests;
    static Sprite field_o;
    private int groupCount;
    private int[][] fileNameHashes;
    int[] groupFileCounts;
    int[] groupCrc32s;
    int groupCapacity;
    int[] groupFileCapacities;
    static int field_t;
    private int[] groupNameHashes;
    IntKeyLookup groupNameLookup;
    int revision;
    static LoginCredentials field_m;
    int encodedCrc32;
    static int field_j;
    IntKeyLookup[] fileNameLookups;
    int[] groupVersions;
    int[][] fileIds;
    private byte[] encodedDigest;

    public static void releaseStatics(byte guard) {
        if (guard != 18) {
          field_m = (LoginCredentials) null;
        }
        field_o = null;
        field_m = null;
    }

    private final void decode(byte guard, byte[] encoded) {
        String stackIn_103_2 = null;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var8Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var15Lifetime1;
        int var17 = EscapeVector.obfuscationControl;
        try {
          PacketBuffer var18 = new PacketBuffer(Js5NetworkRequest.decompressGroup((byte) -26, encoded));
          int var4 = var18.readUnsignedByte(0);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.revision = 0;
            } else {
              this.revision = var18.readInt(-5053);
            }
            int var5 = var18.readUnsignedByte(0);
            boolean stackIn_11_0 = !((1 & var5) == 0);
            boolean var6 = stackIn_11_0;
            if (var4 >= 7) {
              this.groupCount = var18.readUnsignedShortOrInt(2147483647);
            } else {
              this.groupCount = var18.readUnsignedShort(1952);
            }
            boolean stackIn_17_0 = !(0 == (2 & var5));
            boolean var7 = stackIn_17_0;
            int var8 = 0;
            int var9 = -1;
            this.groupIds = new int[this.groupCount];
            if (var4 < 7) {
              for (var10 = 0; this.groupCount > var10; var10++) {
                int dupTemp$0 = var8 + var18.readUnsignedShort(1952);
                var8 = dupTemp$0;
                this.groupIds[var10] = dupTemp$0;
                if (this.groupIds[var10] > var9) {
                  var9 = this.groupIds[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.groupCount; var10++) {
                int dupTemp$1 = var8 + var18.readUnsignedShortOrInt(2147483647);
                var8 = dupTemp$1;
                this.groupIds[var10] = dupTemp$1;
                if (var9 < this.groupIds[var10]) {
                  var9 = this.groupIds[var10];
                }
              }
            }
            this.groupCapacity = var9 + 1;
            if (var7) {
              this.groupDigests = new byte[this.groupCapacity][];
            }
            int var10Lifetime1 = 115 % ((60 - guard) / 44);
            this.groupFileCounts = new int[this.groupCapacity];
            this.fileIds = new int[this.groupCapacity][];
            this.groupFileCapacities = new int[this.groupCapacity];
            this.groupCrc32s = new int[this.groupCapacity];
            this.groupVersions = new int[this.groupCapacity];
            if (var6) {
              this.groupNameHashes = new int[this.groupCapacity];
              for (int var11 = 0; this.groupCapacity > var11; var11++) {
                this.groupNameHashes[var11] = -1;
              }
              for (int var11Lifetime5 = 0; var11Lifetime5 < this.groupCount; var11Lifetime5++) {
                this.groupNameHashes[this.groupIds[var11Lifetime5]] = var18.readInt(-5053);
              }
              this.groupNameLookup = new IntKeyLookup(this.groupNameHashes);
            }
            for (int var11Lifetime1 = 0; this.groupCount > var11Lifetime1; var11Lifetime1++) {
              this.groupCrc32s[this.groupIds[var11Lifetime1]] = var18.readInt(-5053);
            }
            if (!var7) {
              for (var11Lifetime2 = 0; var11Lifetime2 < this.groupCount; var11Lifetime2++) {
                this.groupVersions[this.groupIds[var11Lifetime2]] = var18.readInt(-5053);
              }
            } else {
              for (var11Lifetime2 = 0; var11Lifetime2 < this.groupCount; var11Lifetime2++) {
                byte[] var22 = new byte[64];
                var18.readBytes(var22, (byte) -96, 0, 64);
                this.groupDigests[this.groupIds[var11Lifetime2]] = var22;
              }
              for (var11Lifetime2 = 0; var11Lifetime2 < this.groupCount; var11Lifetime2++) {
                this.groupVersions[this.groupIds[var11Lifetime2]] = var18.readInt(-5053);
              }
            }
            if (var4 < 7) {
              for (var11Lifetime3 = 0; var11Lifetime3 < this.groupCount; var11Lifetime3++) {
                this.groupFileCounts[this.groupIds[var11Lifetime3]] = var18.readUnsignedShort(1952);
              }
              for (var11Lifetime3 = 0; this.groupCount > var11Lifetime3; var11Lifetime3++) {
                var12 = this.groupIds[var11Lifetime3];
                var8Lifetime1 = 0;
                var13 = this.groupFileCounts[var12];
                var14 = -1;
                int[] array$2 = new int[var13];
                this.fileIds[var12] = array$2;
                for (var15 = 0; var15 < var13; var15++) {
                  int dupTemp$3 = var8Lifetime1 + var18.readUnsignedShort(1952);
                  var8Lifetime1 = dupTemp$3;
                  int[] dupTemp$4 = this.fileIds[var12];
                  dupTemp$4[var15] = dupTemp$3;
                  var16 = dupTemp$3;
                  if (var14 < var16) {
                    var14 = var16;
                  }
                }
                this.groupFileCapacities[var12] = 1 + var14;
                if (var14 + 1 == var13) {
                  this.fileIds[var12] = null;
                }
              }
            } else {
              for (var11Lifetime3 = 0; var11Lifetime3 < this.groupCount; var11Lifetime3++) {
                this.groupFileCounts[this.groupIds[var11Lifetime3]] = var18.readUnsignedShortOrInt(2147483647);
              }
              for (var11Lifetime3 = 0; this.groupCount > var11Lifetime3; var11Lifetime3++) {
                var12 = this.groupIds[var11Lifetime3];
                var8Lifetime1 = 0;
                var13 = this.groupFileCounts[var12];
                var14 = -1;
                int[] array$5 = new int[var13];
                this.fileIds[var12] = array$5;
                for (var15 = 0; var15 < var13; var15++) {
                  int dupTemp$6 = var8Lifetime1 + var18.readUnsignedShortOrInt(2147483647);
                  var8Lifetime1 = dupTemp$6;
                  int[] dupTemp$7 = this.fileIds[var12];
                  dupTemp$7[var15] = dupTemp$6;
                  var16 = dupTemp$6;
                  if (var16 > var14) {
                    var14 = var16;
                  }
                }
                this.groupFileCapacities[var12] = 1 + var14;
                if (1 + var14 == var13) {
                  this.fileIds[var12] = null;
                }
              }
            }
            if (var6) {
              this.fileNameHashes = new int[1 + var9][];
              this.fileNameLookups = new IntKeyLookup[1 + var9];
              for (int var11Lifetime4 = 0; var11Lifetime4 < this.groupCount; var11Lifetime4++) {
                int var12Lifetime1 = this.groupIds[var11Lifetime4];
                int var13Lifetime1 = this.groupFileCounts[var12Lifetime1];
                int[] array$8 = new int[this.groupFileCapacities[var12Lifetime1]];
                this.fileNameHashes[var12Lifetime1] = array$8;
                for (int var14Lifetime1 = 0; this.groupFileCapacities[var12Lifetime1] > var14Lifetime1; var14Lifetime1++) {
                  this.fileNameHashes[var12Lifetime1][var14Lifetime1] = -1;
                }
                for (int var14Lifetime1Lifetime1 = 0; var13Lifetime1 > var14Lifetime1Lifetime1; var14Lifetime1Lifetime1++) {
                  if (this.fileIds[var12Lifetime1] != null) {
                    var15Lifetime1 = this.fileIds[var12Lifetime1][var14Lifetime1Lifetime1];
                  } else {
                    var15Lifetime1 = var14Lifetime1Lifetime1;
                  }
                  this.fileNameHashes[var12Lifetime1][var15Lifetime1] = var18.readInt(-5053);
                }
                this.fileNameLookups[var12Lifetime1] = new IntKeyLookup(this.fileNameHashes[var12Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_102_0 = var3;
          StringBuilder stackIn_102_1 = new StringBuilder().append("f.B(").append(guard).append(',');
          if (encoded == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    ArchiveIndex(byte[] encoded, int expectedCrc32, byte[] expectedDigest) {
        try {
          this.encodedCrc32 = ji.a(255, encoded.length, encoded);
          if (expectedCrc32 != this.encodedCrc32) {
            throw new RuntimeException();
          }
          if (expectedDigest != null) {
            if (expectedDigest.length != 64) {
              throw new RuntimeException();
            }
            this.encodedDigest = RasterBuffer.a(encoded, 0, encoded.length, 0);
            for (int var4_int = 0; var4_int < 64; var4_int++) {
              if (expectedDigest[var4_int] != this.encodedDigest[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decode((byte) -23, encoded);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "f.<init>(" + (encoded != null ? "{...}" : "null") + ',' + expectedCrc32 + ',' + (expectedDigest != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = -1;
        field_m = null;
    }
}
