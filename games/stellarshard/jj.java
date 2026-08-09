/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    int[] field_v;
    private int field_z;
    int[] field_J;
    int[] field_D;
    int field_s;
    int[] field_B;
    int[] field_q;
    int field_w;
    private int[] field_G;
    int[] field_m;
    int[] field_E;
    int[] field_n;
    private int field_K;
    int[] field_l;
    int[] field_b;
    int[][] field_C;
    int[][] field_g;
    int field_r;
    int[][] field_I;
    static di field_k;
    int field_d;
    int[] field_H;
    int[] field_A;
    int[] field_f;
    static long field_p;
    byte[][] field_y;
    int[][] field_x;
    int[] field_o;
    private gk field_u;
    int[] field_t;
    int[] field_e;
    int[][] field_L;
    int[] field_c;
    int field_a;
    int[] field_F;
    int[] field_h;
    ud[] field_j;
    private int[] field_i;

    final static int a(int param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param3 <= -48) {
                break L1;
              } else {
                jj.a((byte) 14, -35L);
                break L1;
              }
            }
            var5 = param0;
            L2: while (true) {
              if (var5 >= param2) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = nb.field_F[255 & (var4_int ^ param1[var5])] ^ var4_int >>> 1392494472;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("jj.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        if (param0 != 18917) {
            byte[] var2 = (byte[]) null;
            jj.a(-53, (byte[]) null, 76, -35);
        }
        field_k = null;
    }

    private final void a(boolean param0) {
        int var2;
        int var3;
        int var5;
        ud var4;
        var5 = stellarshard.field_B;
        if (this.field_u == null) {
          return;
        } else {
          var2 = param0 ? 1 : 0;
          var3 = 0;
          L0: while (true) {
            if (this.field_j.length <= var3) {
              L1: {
                if (var2 == 0) {
                  break L1;
                } else {
                  this.field_G = null;
                  this.field_u = null;
                  this.field_i = null;
                  break L1;
                }
              }
              return;
            } else {
              if (null == this.field_j[var3]) {
                L2: {
                  if (this.field_c[var3] >> -909039804 == 0) {
                    var4 = this.field_u.a(this.field_i[var3], this.field_G[var3], false);
                    break L2;
                  } else {
                    var4 = this.field_u.a((byte) -65, this.field_G[var3], this.field_i[var3]);
                    break L2;
                  }
                }
                if (var4 != null) {
                  this.field_c[var3] = sa.a(this.field_c[var3], 15);
                  this.field_j[var3] = var4;
                  var3++;
                  continue L0;
                } else {
                  var2 = 0;
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        }
    }

    final static void a(byte param0, long param1) {
        if (!(param1 > 0L)) {
            return;
        }
        if (param0 >= -112) {
            field_p = 50L;
        }
        if (param1 % 10L != 0L) {
            ef.a(11, param1);
        } else {
            ef.a(11, -1L + param1);
            ef.a(11, 1L);
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, pb[] param7, pb[] param8, int param9, int param10, int param11, bd param12, bd param13) {
        RuntimeException runtimeException = null;
        byte[] var15 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              pk.a(4);
              if (param0) {
                break L1;
              } else {
                var15 = (byte[]) null;
                jj.a(-44, (byte[]) null, -58, 66);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("jj.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param8 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');

            if (param12 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param13 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final static bh[] b(int param0) {
        if (param0 != -1) {
            return (bh[]) null;
        }
        return new bh[]{kk.field_k, ak.field_d, ma.field_m};
    }

    jj(ka param0, gk param1) {
        int var3_int = 0;
        int var4 = 0;
        int dupTemp$0 = 0;
        byte[] var16 = null;
        int var7 = 0;
        int dupTemp$1 = 0;
        int var9 = 0;
        int[] array$2 = null;
        int var10 = 0;
        int dupTemp$3 = 0;
        int[] array$4 = null;
        int dupTemp$5 = 0;
        int[] array$6 = null;
        int dupTemp$7 = 0;
        int[] array$8 = null;
        int dupTemp$9 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        try {
            this.field_u = param1;
            this.field_d = 1 + param0.f(4);
            param0.f(4);
            this.field_r = 1 + param0.f(4);
            this.field_z = param0.f(4) - -1;
            this.field_K = param0.f(4) + 1;
            var3_int = param0.f(4);
            this.field_s = 1 & var3_int;
            this.field_a = param0.f(4);
            this.field_w = param0.f(4);
            this.field_f = new int[this.field_d];
            var4 = 0;
            for (var5 = 0; var5 < this.field_d; var5++) {
                dupTemp$0 = var4 + param0.f(4);
                var4 = dupTemp$0;
                this.field_f[var5] = sa.a(dupTemp$0, 255);
            }
            this.field_l = new int[256];
            this.field_y = new byte[256][];
            ri.a(this.field_l, 0, 256, 64);
            for (var5 = 0; 256 > var5; var5++) {
                this.field_y[var5] = sb.field_i;
            }
            for (var5 = 0; this.field_z > var5; var5++) {
                this.field_l[var5] = param0.f(4) - -1;
                var6 = param0.c((byte) 73);
                var16 = new byte[var6];
                if (-1 > (var6 ^ -1)) {
                    param0.a(0, (byte) -104, var6, var16);
                    this.field_y[var5] = var16;
                }
            }
            this.field_D = new int[this.field_K];
            this.field_B = new int[this.field_K];
            this.field_E = new int[this.field_K];
            this.field_g = new int[this.field_K][];
            this.field_L = new int[this.field_K][];
            this.field_C = new int[this.field_K][96];
            this.field_e = new int[this.field_K];
            this.field_I = new int[this.field_K][];
            this.field_H = new int[this.field_K];
            this.field_q = new int[this.field_K];
            this.field_b = new int[this.field_K];
            this.field_x = new int[this.field_K][];
            this.field_F = new int[this.field_K];
            this.field_A = new int[this.field_K];
            var5 = param0.c((byte) 124);
            this.field_h = new int[var5];
            this.field_n = new int[var5];
            this.field_J = new int[var5];
            this.field_t = new int[var5];
            this.field_v = new int[var5];
            this.field_c = new int[var5];
            this.field_G = new int[var5];
            this.field_o = new int[var5];
            this.field_i = new int[var5];
            this.field_j = new ud[var5];
            this.field_m = new int[var5];
            var5 = 0;
            for (var6 = 0; var6 < this.field_K; var6++) {
                var7 = param0.f(4);
                if (0 < var7) {
                    var4 = 0;
                    for (var8 = 0; (var8 ^ -1) > -97; var8++) {
                        dupTemp$1 = var4 + param0.f(4);
                        var4 = dupTemp$1;
                        this.field_C[var6][var8] = var5 - -sa.a(255, dupTemp$1);
                    }
                    this.field_A[var6] = param0.f(4);
                    var8 = param0.f(4);
                    this.field_D[var6] = param0.f(4);
                    this.field_e[var6] = param0.f(4);
                    this.field_q[var6] = this.field_e[var6] + param0.f(4);
                    this.field_F[var6] = param0.f(4);
                    var9 = param0.f(4);
                    this.field_B[var6] = param0.f(4);
                    this.field_E[var6] = param0.f(4);
                    this.field_H[var6] = this.field_E[var6] - -param0.f(4);
                    array$2 = new int[var8];
                    this.field_L[var6] = array$2;
                    var4 = 0;
                    var10 = 0;
                    for (var11 = 0; var8 > var11; var11++) {
                        dupTemp$3 = var10 + param0.e(-64);
                        var10 = dupTemp$3;
                        var4 = var4 + dupTemp$3;
                        this.field_L[var6][var11] = var4 + dupTemp$3;
                    }
                    var4 = 0;
                    array$4 = new int[var8];
                    this.field_I[var6] = array$4;
                    for (var11 = 0; var8 > var11; var11++) {
                        dupTemp$5 = var4 + param0.f(4);
                        var4 = dupTemp$5;
                        this.field_I[var6][var11] = sa.a(255, dupTemp$5);
                    }
                    array$6 = new int[var9];
                    this.field_x[var6] = array$6;
                    var4 = 0;
                    var10 = 0;
                    for (var11 = 0; var11 < var9; var11++) {
                        dupTemp$7 = var10 + param0.e(-64);
                        var10 = dupTemp$7;
                        var4 = var4 + dupTemp$7;
                        this.field_x[var6][var11] = var4 + dupTemp$7;
                    }
                    array$8 = new int[var9];
                    this.field_g[var6] = array$8;
                    var4 = 0;
                    for (var11 = 0; var11 < var9; var11++) {
                        dupTemp$9 = var4 + param0.f(4);
                        var4 = dupTemp$9;
                        this.field_g[var6][var11] = sa.a(dupTemp$9, 255);
                    }
                    this.field_b[var6] = param0.c((byte) 85);
                    for (var11 = 0; var11 < var7; var11++) {
                        this.field_m[var5] = param0.c(true);
                        this.field_t[var5] = param0.c(true);
                        this.field_v[var5] = this.field_t[var5] + param0.c(true);
                        this.field_J[var5] = param0.f(4);
                        this.field_n[var5] = param0.g(110);
                        this.field_c[var5] = param0.f(4);
                        this.field_h[var5] = param0.f(4);
                        this.field_o[var5] = param0.g(112) + -1;
                        this.field_i[var5] = param0.c((byte) 71);
                        this.field_G[var5] = param0.c((byte) 60);
                        var5++;
                    }
                }
            }
            this.a(true);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "jj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new di();
    }
}
