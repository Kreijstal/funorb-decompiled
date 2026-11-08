/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    private int[] field_f;
    int[] groupFileCounts;
    int field_d;
    int[] field_z;
    private int groupCount;
    int[] groupRevisions;
    byte[][] field_a;
    int[] groupCrcs;
    int field_h;
    int field_v;
    private int[][] field_j;
    private byte[] field_q;
    IntKeyLookup field_p;
    int[] groupIds;
    int[][] field_k;
    static IntrusiveDeque field_l;
    IntKeyLookup[] field_n;
    static String fsButtonCancel;
    static int field_x;
    static int[] field_o;
    static String playerXGainedALife;
    static Sprite field_y;
    static int field_r;
    static int field_c;
    static String createCreateanaccount;
    static int field_u;

    final static void a(byte param0, java.math.BigInteger param1, PacketBuffer param2, java.math.BigInteger param3, PacketBuffer param4) {
        try {
          lf.writeEncryptedPayload(param3, param2.payload, param1, param4, param2.position, 0, 0);
          if (param0 != 93) {
            ArchiveIndex.a(122, 64, 86);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ad.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_o = null;
        if (param0 != 20592) {
          return;
        }
        createCreateanaccount = null;
        field_y = null;
        playerXGainedALife = null;
        fsButtonCancel = null;
        field_l = null;
    }

    private final void a(byte[] param0, int param1) {
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
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
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
        var16 = Pool.field_O;
        try {
          var17 = new PacketBuffer(wp.decompressContainer(0, param0));
          var4 = var17.readUnsignedByte(param1 ^ 105);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_h = var17.readInt(true);
            } else {
              this.field_h = 0;
            }
            var5 = var17.readUnsignedByte(-60);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (var4 >= 7) {
              this.groupCount = var17.readSmartInt(99);
            } else {
              this.groupCount = var17.readUnsignedShort(-1034);
            }
            stackIn_17_0 = (0 == (var5 & 2)) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.groupIds = new int[this.groupCount];
            var9 = param1;
            if (7 <= var4) {
              for (var10 = 0; var10 < this.groupCount; var10++) {
                dupTemp$0 = var8 + var17.readSmartInt(TutorialFactory.bitwiseXor(param1, 82));
                var8 = dupTemp$0;
                this.groupIds[var10] = dupTemp$0;
                if (this.groupIds[var10] > var9) {
                  var9 = this.groupIds[var10];
                }
              }
            } else {
              for (var10 = 0; this.groupCount > var10; var10++) {
                dupTemp$1 = var8 + var17.readUnsignedShort(TutorialFactory.bitwiseXor(param1, 1033));
                var8 = dupTemp$1;
                this.groupIds[var10] = dupTemp$1;
                if (this.groupIds[var10] > var9) {
                  var9 = this.groupIds[var10];
                }
              }
            }
            this.field_d = 1 + var9;
            if (var7 != 0) {
              this.field_a = new byte[this.field_d][];
            }
            this.field_k = new int[this.field_d][];
            this.groupFileCounts = new int[this.field_d];
            this.groupCrcs = new int[this.field_d];
            this.groupRevisions = new int[this.field_d];
            this.field_z = new int[this.field_d];
            if (var6 != 0) {
              this.field_f = new int[this.field_d];
              for (var10Lifetime1 = 0; this.field_d > var10Lifetime1; var10Lifetime1++) {
                this.field_f[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.groupCount > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_f[this.groupIds[var10Lifetime1Lifetime1]] = var17.readInt(true);
              }
              this.field_p = new IntKeyLookup(this.field_f);
            }
            for (var10Lifetime2 = 0; this.groupCount > var10Lifetime2; var10Lifetime2++) {
              this.groupCrcs[this.groupIds[var10Lifetime2]] = var17.readInt(true);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.groupCount; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, (byte) -118, var21, 64);
                this.field_a[this.groupIds[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.groupCount > var10Lifetime4; var10Lifetime4++) {
              this.groupRevisions[this.groupIds[var10Lifetime4]] = var17.readInt(true);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; this.groupCount > var10Lifetime5; var10Lifetime5++) {
                this.groupFileCounts[this.groupIds[var10Lifetime5]] = var17.readSmartInt(TutorialFactory.bitwiseXor(param1, -103));
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.groupCount; var10Lifetime5++) {
                var11 = this.groupIds[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.groupFileCounts[var11];
                array$2 = new int[var12];
                this.field_k[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.readSmartInt(81);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_k[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_z[var11] = var13 + 1;
                if (1 + var13 == var12) {
                  this.field_k[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.groupCount; var10Lifetime5++) {
                this.groupFileCounts[this.groupIds[var10Lifetime5]] = var17.readUnsignedShort(param1 - 1033);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.groupCount; var10Lifetime5++) {
                var11 = this.groupIds[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.groupFileCounts[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_k[var11] = array$5;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.readUnsignedShort(-1034);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_k[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_z[var11] = var13 + 1;
                if (var12 == 1 + var13) {
                  this.field_k[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_n = new IntKeyLookup[1 + var9];
              this.field_j = new int[var9 + 1][];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.groupCount; var10Lifetime6++) {
                var11Lifetime1 = this.groupIds[var10Lifetime6];
                var12Lifetime1 = this.groupFileCounts[var11Lifetime1];
                array$8 = new int[this.field_z[var11Lifetime1]];
                this.field_j[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_z[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_j[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_k[var11Lifetime1] != null) {
                    var14Lifetime1 = this.field_k[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_j[var11Lifetime1][var14Lifetime1] = var17.readInt(true);
                }
                this.field_n[var11Lifetime1] = new IntKeyLookup(this.field_j[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_98_0 = var3;
          stackIn_98_1 = new StringBuilder().append("ad.D(");
          if (param0 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(')').toString());
        }
    }

    ArchiveIndex(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_v = SpriteState.a(param0.length, param0, 0);
          if (this.field_v != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_q = TikiBallSkin.a(param0.length, (byte) -51, param0, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_q[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, -1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite a(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != 7) {
          ArchiveIndex.releaseStatics(82);
        }
        Sprite var5 = new Sprite(param1, param1);
        Sprite var3 = var5;
        for (var4 = 0; var4 < var3.field_D.length; var4++) {
          var5.field_D[var4] = param0;
        }
        return var3;
    }

    static {
        field_l = new IntrusiveDeque();
        fsButtonCancel = "Cancel";
        field_o = new int[]{2, 20, 21, 49, 5, 3, 9};
        playerXGainedALife = "<%0> gained 1 life!";
        createCreateanaccount = "Create a free Account";
    }
}
