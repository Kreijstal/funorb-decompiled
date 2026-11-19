/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Js5Index {
    private int groupCount;
    int[] groupChecksums;
    IntHashTable groupNames;
    int[] fileCapacities;
    private byte[] field_b;
    static LoginCredentialKind field_v;
    int[] groupVersions;
    private int[][] fileNameHashes;
    int[] fileCounts;
    static String field_r;
    IntHashTable[] fileNames;
    int[] groupIds;
    static String field_o;
    byte[][] groupDigests;
    private int[] groupNameHashes;
    int field_i;
    int groupCapacity;
    int revision;
    int[][] fileIds;
    static QuickChatDynamicCommand field_a;
    static long[] field_k;
    static LoginCredentialKind field_m;
    static IntrusiveDeque field_l;
    static AudioOutput field_d;

    private final void decode(byte[] param0, int param1) {
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
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_98_2 = null;
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
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = wizardrun.field_H;
        try {
          var17 = new PacketBuffer(dg.decompressArchiveContainer(param0, 31027));
          var4 = var17.readUnsignedByte(param1 + 255);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.revision = var17.readInt(255);
            } else {
              this.revision = 0;
            }
            var5 = var17.readUnsignedByte(param1 ^ 255);
            stackIn_11_0 = ((1 & var5) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((2 & var5) == param1) ? 0 : 1;
            var7 = stackIn_14_0;
            if (var4 >= 7) {
              this.groupCount = var17.readLargeSmart((byte) -88);
            } else {
              this.groupCount = var17.readUnsignedShort(param1 - 14477);
            }
            var8 = 0;
            this.groupIds = new int[this.groupCount];
            var9 = -1;
            if (var4 >= 7) {
              for (var10 = 0; var10 < this.groupCount; var10++) {
                dupTemp$0 = var8 + var17.readLargeSmart((byte) -88);
                var8 = dupTemp$0;
                this.groupIds[var10] = dupTemp$0;
                if (var9 < this.groupIds[var10]) {
                  var9 = this.groupIds[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.groupCount; var10++) {
                dupTemp$1 = var8 + var17.readUnsignedShort(-14477);
                var8 = dupTemp$1;
                this.groupIds[var10] = dupTemp$1;
                if (var9 < this.groupIds[var10]) {
                  var9 = this.groupIds[var10];
                }
              }
            }
            this.groupCapacity = var9 + 1;
            this.fileCounts = new int[this.groupCapacity];
            if (var7 != 0) {
              this.groupDigests = new byte[this.groupCapacity][];
            }
            this.groupVersions = new int[this.groupCapacity];
            this.fileCapacities = new int[this.groupCapacity];
            this.groupChecksums = new int[this.groupCapacity];
            this.fileIds = new int[this.groupCapacity][];
            if (var6 != 0) {
              this.groupNameHashes = new int[this.groupCapacity];
              for (var10Lifetime1 = 0; this.groupCapacity > var10Lifetime1; var10Lifetime1++) {
                this.groupNameHashes[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.groupCount > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.groupNameHashes[this.groupIds[var10Lifetime1Lifetime1]] = var17.readInt(param1 + 255);
              }
              this.groupNames = new IntHashTable(this.groupNameHashes);
            }
            for (var10Lifetime2 = 0; this.groupCount > var10Lifetime2; var10Lifetime2++) {
              this.groupChecksums[this.groupIds[var10Lifetime2]] = var17.readInt(255);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.groupCount; var10Lifetime3++) {
                var21 = new byte[64];
                var17.readBytes(true, 64, var21, 0);
                this.groupDigests[this.groupIds[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.groupCount; var10Lifetime4++) {
              this.groupVersions[this.groupIds[var10Lifetime4]] = var17.readInt(255);
            }
            if (7 <= var4) {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.groupCount; var10Lifetime5++) {
                this.fileCounts[this.groupIds[var10Lifetime5]] = var17.readLargeSmart((byte) -88);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.groupCount; var10Lifetime5++) {
                var11 = this.groupIds[var10Lifetime5];
                var12 = this.fileCounts[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.fileIds[var11] = array$2;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.readLargeSmart((byte) -88);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.fileIds[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.fileCapacities[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.fileIds[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.groupCount; var10Lifetime5++) {
                this.fileCounts[this.groupIds[var10Lifetime5]] = var17.readUnsignedShort(-14477);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.groupCount; var10Lifetime5++) {
                var11 = this.groupIds[var10Lifetime5];
                var12 = this.fileCounts[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.fileIds[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.readUnsignedShort(-14477);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.fileIds[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.fileCapacities[var11] = 1 + var13;
                if (var12 == var13 + 1) {
                  this.fileIds[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.fileNameHashes = new int[1 + var9][];
              this.fileNames = new IntHashTable[var9 + 1];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.groupCount; var10Lifetime6++) {
                var11Lifetime1 = this.groupIds[var10Lifetime6];
                var12Lifetime1 = this.fileCounts[var11Lifetime1];
                array$8 = new int[this.fileCapacities[var11Lifetime1]];
                this.fileNameHashes[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.fileCapacities[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.fileNameHashes[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var12Lifetime1 > var13Lifetime1Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null == this.fileIds[var11Lifetime1]) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.fileIds[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.fileNameHashes[var11Lifetime1][var14Lifetime1] = var17.readInt(255);
                }
                this.fileNames[var11Lifetime1] = new IntHashTable(this.fileNameHashes[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_97_0 = var3;
          stackIn_97_1 = new StringBuilder().append("pc.C(");
          if (param0 == null) {
            stackIn_98_2 = "null";
          } else {
            stackIn_98_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_97_0), ((StringBuilder) (Object) stackIn_97_1).append(stackIn_98_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1) {
          String var2 = (String) null;
          Js5Index.loadSpriteStrip((byte) -119, (String) null, (ResourceArchive) null, (String) null);
        }
        field_k = null;
        field_v = null;
        field_r = null;
        field_a = null;
        field_o = null;
        field_l = null;
        field_m = null;
        field_d = null;
    }

    final static void a(int param0) {
        if (param0 != -1) {
          field_d = (AudioOutput) null;
        }
        String var2 = (String) null;
        MenuInputState.a((String) null, "", true);
    }

    Js5Index(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_i = Cp1252DecodingHelpers.crc32Prefix(param0, 10510, param0.length);
          if (this.field_i != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_b = id.whirlpoolDigest(param0, 0, param0.length, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_b[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.decode(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "pc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] loadSpriteStrip(byte param0, String param1, ResourceArchive param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.getGroupId(-1, param1);
          if (param0 < 99) {
            Js5Index.releaseStatics(61);
          }
          var5 = param2.getFileId(var4_int, param3, -11986);
          stackIn_3_0 = TimedValidator.a(var5, param2, 13469, var4_int);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    static {
        field_o = "Updates will sent to the email address you've given";
        field_v = new LoginCredentialKind(3);
        field_a = new QuickChatDynamicCommand(9, 0, 4, 1);
        field_k = new long[32];
        field_m = new LoginCredentialKind(0);
        field_l = new IntrusiveDeque();
    }
}
