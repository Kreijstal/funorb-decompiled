/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveIndex {
    static int field_h;
    int[] field_j;
    private int[] field_n;
    static qo field_d;
    int[] field_k;
    int field_l;
    private byte[] field_c;
    int[] field_o;
    byte[][] field_i;
    static int[] field_e;
    int[][] field_q;
    IntKeyLookup field_b;
    private int[][] field_p;
    int[] field_g;
    IntKeyLookup[] field_r;
    int field_t;
    int field_m;
    static vd[][] field_f;
    private int field_s;
    int[] field_a;

    final static void a(String[] args, byte param1) {
        int var2_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_int = 60 / ((param1 - 53) / 55);
          if (null != qk.field_e) {
            qk.field_e.field_B.a(args, true);
          }
          if (null != fd.field_f) {
            fd.field_f.field_t.a(args, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ps.D(");
          if (args == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        aq.field_b = null;
        if (!param0) {
          ArchiveIndex.b(111);
        }
        qn.field_d = null;
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
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
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
        var16 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var17 = new PacketBuffer(pn.a(param0, 0));
          var4 = var17.readUnsignedByte(-112);
          if (var4 >= 5 &&
            var4 <= 7) {
            if (param1 <= 65) {
              ArchiveIndex.b(-65);
            }
            if (6 <= var4) {
              this.field_m = var17.readInt((byte) 113);
            } else {
              this.field_m = 0;
            }
            var5 = var17.readUnsignedByte(73);
            stackIn_13_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_13_0;
            if (var4 >= 7) {
              this.field_s = var17.c((byte) 127);
            } else {
              this.field_s = var17.readUnsignedShort((byte) 0);
            }
            stackIn_19_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_19_0;
            var8 = 0;
            var9 = -1;
            this.field_o = new int[this.field_s];
            if (7 <= var4) {
              for (var10 = 0; this.field_s > var10; var10++) {
                dupTemp$0 = var8 + var17.c((byte) 127);
                var8 = dupTemp$0;
                this.field_o[var10] = dupTemp$0;
                if (this.field_o[var10] > var9) {
                  var9 = this.field_o[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_s > var10; var10++) {
                dupTemp$1 = var8 + var17.readUnsignedShort((byte) 0);
                var8 = dupTemp$1;
                this.field_o[var10] = dupTemp$1;
                if (this.field_o[var10] > var9) {
                  var9 = this.field_o[var10];
                }
              }
            }
            this.field_l = 1 + var9;
            this.field_g = new int[this.field_l];
            if (var7 != 0) {
              this.field_i = new byte[this.field_l][];
            }
            this.field_q = new int[this.field_l][];
            this.field_k = new int[this.field_l];
            this.field_a = new int[this.field_l];
            this.field_j = new int[this.field_l];
            if (var6 != 0) {
              this.field_n = new int[this.field_l];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_l; var10Lifetime1++) {
                this.field_n[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_s; var10Lifetime1Lifetime1++) {
                this.field_n[this.field_o[var10Lifetime1Lifetime1]] = var17.readInt((byte) 124);
              }
              this.field_b = new IntKeyLookup(this.field_n);
            }
            for (var10Lifetime2 = 0; this.field_s > var10Lifetime2; var10Lifetime2++) {
              this.field_g[this.field_o[var10Lifetime2]] = var17.readInt((byte) 125);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_s; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(0, 7186, 64, var21);
                this.field_i[this.field_o[var10Lifetime3]] = var21;
              }
            }
            for (var10Lifetime4 = 0; this.field_s > var10Lifetime4; var10Lifetime4++) {
              this.field_a[this.field_o[var10Lifetime4]] = var17.readInt((byte) 113);
            }
            if (var4 < 7) {
              for (var10Lifetime5 = 0; this.field_s > var10Lifetime5; var10Lifetime5++) {
                this.field_k[this.field_o[var10Lifetime5]] = var17.readUnsignedShort((byte) 0);
              }
              for (var10Lifetime5 = 0; this.field_s > var10Lifetime5; var10Lifetime5++) {
                var11 = this.field_o[var10Lifetime5];
                var12 = this.field_k[var11];
                var8Lifetime1 = 0;
                array$2 = new int[var12];
                this.field_q[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.readUnsignedShort((byte) 0);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_q[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_j[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_q[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                this.field_k[this.field_o[var10Lifetime5]] = var17.c((byte) 126);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_s; var10Lifetime5++) {
                var11 = this.field_o[var10Lifetime5];
                var12 = this.field_k[var11];
                var8Lifetime1 = 0;
                array$5 = new int[var12];
                this.field_q[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.c((byte) 124);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_q[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_j[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_q[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_p = new int[var9 + 1][];
              this.field_r = new IntKeyLookup[1 + var9];
              for (var10Lifetime6 = 0; this.field_s > var10Lifetime6; var10Lifetime6++) {
                var11Lifetime1 = this.field_o[var10Lifetime6];
                var12Lifetime1 = this.field_k[var11Lifetime1];
                array$8 = new int[this.field_j[var11Lifetime1]];
                this.field_p[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; var13Lifetime1 < this.field_j[var11Lifetime1]; var13Lifetime1++) {
                  this.field_p[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (null != this.field_q[var11Lifetime1]) {
                    var14Lifetime1 = this.field_q[var11Lifetime1][var13Lifetime1Lifetime1];
                  } else {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  }
                  this.field_p[var11Lifetime1][var14Lifetime1] = var17.readInt((byte) 110);
                }
                this.field_r[var11Lifetime1] = new IntKeyLookup(this.field_p[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("ps.E(");
          if (param0 == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0) {
        oi.a(param0, 20665);
    }

    final static void a(int param0, boolean param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            cl.field_fb.a(118, var4, param3, param0);
            if (param1) {
              return;
            }
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("ps.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 0) {
          field_d = (qo) null;
        }
        field_f = (vd[][]) null;
    }

    ArchiveIndex(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_t = lj.a(-124, param0, param0.length);
          if (param1 != this.field_t) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_c = qm.a(0, param0.length, param0, 0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_c[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, 100);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ps.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[128];
        field_d = new qo();
    }
}
