/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    int field_N;
    int[] field_d;
    int[] field_M;
    int[][] field_q;
    static w field_x;
    int[] field_B;
    static gh field_t;
    int[] field_I;
    int[] field_G;
    int[][] field_a;
    int field_m;
    int[] field_j;
    private int field_A;
    int[] field_J;
    int[] field_l;
    int[] field_s;
    int[][] field_F;
    private int[] field_D;
    int[] field_O;
    int[] field_f;
    private int[] field_y;
    int[] field_b;
    static w[] field_E;
    int[] field_z;
    private int field_u;
    int[] field_w;
    int[][] field_c;
    int[] field_K;
    static String field_o;
    byte[][] field_e;
    int field_H;
    int[] field_n;
    int field_k;
    int[][] field_p;
    int[] field_C;
    int[] field_r;
    int[] field_v;
    int field_i;
    ud[] field_g;
    private pl field_h;
    static String field_L;

    final static ta a(int param0, String param1) {
        RuntimeException var2 = null;
        ta stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                field_E = (w[]) null;
                break L1;
              }
            }
            stackIn_3_0 = new ta(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("ui.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0) {
        if (param0 != -12040) {
            return (String) null;
        }
        return de.field_V.c((byte) -38);
    }

    public static void b(int param0) {
        field_o = null;
        field_t = null;
        field_L = null;
        field_x = null;
        field_E = null;
        if (param0 != 31158) {
            field_x = (w) null;
        }
    }

    private final void a(byte param0) {
        int var2;
        int var3;
        int var5;
        ud var4;
        var5 = client.field_A ? 1 : 0;
        if (this.field_h != null) {
          L0: {
            var2 = 1;
            if (param0 == 103) {
              break L0;
            } else {
              ui.a(-5);
              break L0;
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= this.field_g.length) {
              L2: {
                if (var2 != 0) {
                  this.field_h = null;
                  this.field_D = null;
                  this.field_y = null;
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            } else {
              if (this.field_g[var3] == null) {
                L3: {
                  if (this.field_M[var3] >> 1040524164 == 0) {
                    var4 = this.field_h.a(-62, this.field_y[var3], this.field_D[var3]);
                    break L3;
                  } else {
                    var4 = this.field_h.b(this.field_y[var3], this.field_D[var3], -1);
                    break L3;
                  }
                }
                if (var4 != null) {
                  this.field_M[var3] = lb.a(this.field_M[var3], 15);
                  this.field_g[var3] = var4;
                  var3++;
                  continue L1;
                } else {
                  var2 = 0;
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    ui(wl param0, pl param1) {
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
        int localTemp$4 = 0;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] array$7 = null;
        int dupTemp$8 = 0;
        int localTemp$9 = 0;
        int[] array$10 = null;
        int dupTemp$11 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var11 = 0;
        try {
            this.field_h = param1;
            this.field_i = 1 + param0.d((byte) -58);
            param0.d((byte) -61);
            this.field_H = 1 + param0.d((byte) -112);
            this.field_u = 1 + param0.d((byte) -84);
            this.field_A = param0.d((byte) -122) + 1;
            var3_int = param0.d((byte) -98);
            this.field_N = 1 & var3_int;
            this.field_k = param0.d((byte) -27);
            this.field_m = param0.d((byte) -30);
            this.field_s = new int[this.field_i];
            var4 = 0;
            for (var5 = 0; var5 < this.field_i; var5++) {
                dupTemp$0 = var4 + param0.d((byte) -126);
                var4 = dupTemp$0;
                this.field_s[var5] = lb.a(255, dupTemp$0);
            }
            this.field_e = new byte[256][];
            this.field_d = new int[256];
            an.a(this.field_d, 0, 256, 64);
            for (var5 = 0; (var5 ^ -1) > -257; var5++) {
                this.field_e[var5] = client.field_D;
            }
            for (var5 = 0; var5 < this.field_u; var5++) {
                this.field_d[var5] = 1 + param0.d((byte) -103);
                var6 = param0.e(3);
                var16 = new byte[var6];
                if (0 < var6) {
                    param0.a(var16, 0, (byte) 127, var6);
                    this.field_e[var5] = var16;
                }
            }
            this.field_z = new int[this.field_A];
            this.field_v = new int[this.field_A];
            this.field_J = new int[this.field_A];
            this.field_F = new int[this.field_A][];
            this.field_K = new int[this.field_A];
            this.field_p = new int[this.field_A][96];
            this.field_j = new int[this.field_A];
            this.field_a = new int[this.field_A][];
            this.field_C = new int[this.field_A];
            this.field_I = new int[this.field_A];
            this.field_c = new int[this.field_A][];
            this.field_O = new int[this.field_A];
            this.field_r = new int[this.field_A];
            this.field_q = new int[this.field_A][];
            var5 = param0.e(3);
            this.field_M = new int[var5];
            this.field_D = new int[var5];
            this.field_f = new int[var5];
            this.field_b = new int[var5];
            this.field_w = new int[var5];
            this.field_y = new int[var5];
            this.field_G = new int[var5];
            this.field_n = new int[var5];
            this.field_l = new int[var5];
            this.field_g = new ud[var5];
            this.field_B = new int[var5];
            var5 = 0;
            for (var6 = 0; this.field_A > var6; var6++) {
                var7 = param0.d((byte) -33);
                if (-1 > (var7 ^ -1)) {
                    var4 = 0;
                    for (var8 = 0; 96 > var8; var8++) {
                        dupTemp$1 = var4 + param0.d((byte) -79);
                        var4 = dupTemp$1;
                        this.field_p[var6][var8] = var5 - -lb.a(dupTemp$1, 255);
                    }
                    this.field_z[var6] = param0.d((byte) -64);
                    var8 = param0.d((byte) -99);
                    this.field_r[var6] = param0.d((byte) -19);
                    this.field_j[var6] = param0.d((byte) -110);
                    this.field_K[var6] = this.field_j[var6] + param0.d((byte) -66);
                    this.field_O[var6] = param0.d((byte) -110);
                    var9 = param0.d((byte) -78);
                    this.field_J[var6] = param0.d((byte) -64);
                    this.field_C[var6] = param0.d((byte) -46);
                    this.field_I[var6] = this.field_C[var6] + param0.d((byte) -58);
                    array$2 = new int[var8];
                    this.field_q[var6] = array$2;
                    var4 = 0;
                    var10 = 0;
                    for (var11 = 0; var8 > var11; var11++) {
                        dupTemp$3 = var10 + param0.e((byte) 126);
                        var10 = dupTemp$3;
                        localTemp$4 = var4 + dupTemp$3;
                        var4 = localTemp$4;
                        this.field_q[var6][var11] = localTemp$4;
                    }
                    var4 = 0;
                    array$5 = new int[var8];
                    this.field_F[var6] = array$5;
                    for (var11 = 0; var11 < var8; var11++) {
                        dupTemp$6 = var4 + param0.d((byte) -27);
                        var4 = dupTemp$6;
                        this.field_F[var6][var11] = lb.a(255, dupTemp$6);
                    }
                    var10 = 0;
                    array$7 = new int[var9];
                    this.field_c[var6] = array$7;
                    var4 = 0;
                    for (var11 = 0; var9 > var11; var11++) {
                        dupTemp$8 = var10 + param0.e((byte) -2);
                        var10 = dupTemp$8;
                        localTemp$9 = var4 + dupTemp$8;
                        var4 = localTemp$9;
                        this.field_c[var6][var11] = localTemp$9;
                    }
                    var4 = 0;
                    array$10 = new int[var9];
                    this.field_a[var6] = array$10;
                    for (var11 = 0; var9 > var11; var11++) {
                        dupTemp$11 = var4 + param0.d((byte) -110);
                        var4 = dupTemp$11;
                        this.field_a[var6][var11] = lb.a(255, dupTemp$11);
                    }
                    this.field_v[var6] = param0.e(3);
                    for (var11 = 0; var7 > var11; var11++) {
                        this.field_B[var5] = param0.h(65280);
                        this.field_w[var5] = param0.h(65280);
                        this.field_f[var5] = this.field_w[var5] + param0.h(65280);
                        this.field_G[var5] = param0.d((byte) -112);
                        this.field_l[var5] = param0.g((byte) -104);
                        this.field_M[var5] = param0.d((byte) -65);
                        this.field_n[var5] = param0.d((byte) -54);
                        this.field_b[var5] = -1 + param0.g((byte) -108);
                        this.field_D[var5] = param0.e(3);
                        this.field_y[var5] = param0.e(3);
                        var5++;
                    }
                }
            }
            this.a((byte) 103);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ui.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = "Steady...";
        field_t = new gh(2);
        field_L = "Some players haven't unlocked the currently selected game options.<br>Please see the player list on the left for details.";
    }
}
