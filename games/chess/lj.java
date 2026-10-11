/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lj {
    int[] field_b;
    int field_g;
    int[] field_q;
    int[] field_l;
    static hn field_a;
    private int field_k;
    private byte[] field_r;
    int[] field_o;
    private int[] field_f;
    byte[][] field_t;
    int field_s;
    static rk field_n;
    int[][] field_h;
    qh[] field_j;
    private int[][] field_m;
    static String field_d;
    int field_c;
    int[] field_p;
    qh field_e;
    static bn field_i;

    final static void a(byte param0) {
        int var2;
        var2 = Chess.field_G;
        if (an.field_e <= 0) {
          if (aj.field_c > 0) {
            aj.field_c = aj.field_c - 1;
          } else {
            if (0 < ed.field_c) {
              ed.field_c = ed.field_c - 1;
            }
          }
        } else {
          an.field_e = an.field_e - 1;
        }
        if (an.field_e > 0) {
          tf.a(90);
        }
        if (aj.field_c > 0) {
          f.a(aj.field_c, true);
        }
        if (ed.field_c > 0) {
          f.a(ed.field_c, true);
        }
        if (param0 != 19) {
          lj.a((byte) -39);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_i = null;
        if (param0 <= 81) {
          lj.a((String) null, 126L, -28);
        }
        field_d = null;
        field_n = null;
    }

    private final void a(byte[] param0, byte param1) {
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
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
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
        p var17 = null;
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
        var16 = Chess.field_G;
        try {
          var17 = new p(dj.a(param0, 119));
          var4 = var17.i(-117);
          if (var4 >= 5 &&
            7 >= var4) {
            if (var4 >= 6) {
              this.field_s = var17.e((byte) -98);
            } else {
              this.field_s = 0;
            }
            var5 = var17.i(-114);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            if (7 <= var4) {
              this.field_k = var17.h(-120);
            } else {
              this.field_k = var17.f(674914976);
            }
            stackIn_17_0 = (0 == (var5 & 2)) ? 0 : 1;
            var7 = stackIn_17_0;
            var8 = 0;
            this.field_q = new int[this.field_k];
            var9 = -1;
            if (7 <= var4) {
              for (var10 = 0; this.field_k > var10; var10++) {
                dupTemp$0 = var8 + var17.h(-110);
                var8 = dupTemp$0;
                this.field_q[var10] = dupTemp$0;
                if (this.field_q[var10] > var9) {
                  var9 = this.field_q[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_k; var10++) {
                dupTemp$1 = var8 + var17.f(674914976);
                var8 = dupTemp$1;
                this.field_q[var10] = dupTemp$1;
                if (this.field_q[var10] > var9) {
                  var9 = this.field_q[var10];
                }
              }
            }
            this.field_g = var9 + 1;
            this.field_p = new int[this.field_g];
            this.field_o = new int[this.field_g];
            if (var7 != 0) {
              this.field_t = new byte[this.field_g][];
            }
            this.field_h = new int[this.field_g][];
            this.field_b = new int[this.field_g];
            this.field_l = new int[this.field_g];
            if (var6 != 0) {
              this.field_f = new int[this.field_g];
              for (var10Lifetime1 = 0; this.field_g > var10Lifetime1; var10Lifetime1++) {
                this.field_f[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; var10Lifetime1Lifetime1 < this.field_k; var10Lifetime1Lifetime1++) {
                this.field_f[this.field_q[var10Lifetime1Lifetime1]] = var17.e((byte) -114);
              }
              this.field_e = new qh(this.field_f);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_k; var10Lifetime2++) {
              this.field_p[this.field_q[var10Lifetime2]] = var17.e((byte) -116);
            }
            if (param1 < 35) {
              lj.a(-43);
            }
            if (var7 == 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_k; var10Lifetime3++) {
                this.field_b[this.field_q[var10Lifetime3]] = var17.e((byte) -93);
              }
            } else {
              for (var10Lifetime3 = 0; this.field_k > var10Lifetime3; var10Lifetime3++) {
                var21 = new byte[64];
                var17.a(64, (byte) 121, var21, 0);
                this.field_t[this.field_q[var10Lifetime3]] = var21;
              }
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_k; var10Lifetime3++) {
                this.field_b[this.field_q[var10Lifetime3]] = var17.e((byte) -93);
              }
            }
            if (var4 >= 7) {
              for (var10Lifetime4 = 0; this.field_k > var10Lifetime4; var10Lifetime4++) {
                this.field_l[this.field_q[var10Lifetime4]] = var17.h(-110);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_k; var10Lifetime4++) {
                var11 = this.field_q[var10Lifetime4];
                var12 = this.field_l[var11];
                var8Lifetime1 = 0;
                var13 = -1;
                array$2 = new int[var12];
                this.field_h[var11] = array$2;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var17.h(-99);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_h[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_o[var11] = 1 + var13;
                if (var12 == 1 + var13) {
                  this.field_h[var11] = null;
                }
              }
            } else {
              for (var10Lifetime4 = 0; this.field_k > var10Lifetime4; var10Lifetime4++) {
                this.field_l[this.field_q[var10Lifetime4]] = var17.f(674914976);
              }
              for (var10Lifetime4 = 0; var10Lifetime4 < this.field_k; var10Lifetime4++) {
                var11 = this.field_q[var10Lifetime4];
                var8Lifetime1 = 0;
                var12 = this.field_l[var11];
                array$5 = new int[var12];
                this.field_h[var11] = array$5;
                var13 = -1;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var17.f(674914976);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_h[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var13 < var15) {
                    var13 = var15;
                  }
                }
                this.field_o[var11] = var13 + 1;
                if (var12 == var13 + 1) {
                  this.field_h[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_m = new int[1 + var9][];
              this.field_j = new qh[var9 + 1];
              for (var10Lifetime5 = 0; this.field_k > var10Lifetime5; var10Lifetime5++) {
                var11Lifetime1 = this.field_q[var10Lifetime5];
                var12Lifetime1 = this.field_l[var11Lifetime1];
                array$8 = new int[this.field_o[var11Lifetime1]];
                this.field_m[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_o[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_m[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_h[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_h[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_m[var11Lifetime1][var14Lifetime1] = var17.e((byte) -97);
                }
                this.field_j[var11Lifetime1] = new qh(this.field_m[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("lj.D(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, long param1, int param2) {
        CharSequence var5 = null;
        try {
          vk.field_g = 2;
          ij.field_c = param0;
          var5 = (CharSequence) ((Object) param0);
          ec.field_f = ad.a(var5, -2);
          re.field_p = param1;
          int var4_int = -59 % ((param2 - 54) / 48);
          df.a(true);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "lj.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    lj(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_c = ke.a(param0, 21106, param0.length);
          if (this.field_c != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_r = kh.a(0, param0.length, (byte) 124, param0);
            for (var4_int = 0; var4_int < 64; var4_int++) {
              if (this.field_r[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, (byte) 50);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "lj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Join <%0>'s game";
    }
}
