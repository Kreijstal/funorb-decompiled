/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lh {
    static int field_I;
    int[] field_q;
    int[] field_v;
    int[][] field_f;
    int[] field_b;
    int[] field_a;
    ud[] field_L;
    int[] field_e;
    int field_w;
    static hl field_N;
    static String field_D;
    int field_p;
    int[] field_A;
    int[][] field_H;
    byte[][] field_l;
    int[] field_K;
    int[] field_J;
    int[][] field_k;
    int[] field_F;
    int[] field_i;
    static java.util.zip.CRC32 field_g;
    private int field_h;
    int[] field_B;
    int[] field_z;
    int[] field_O;
    int[] field_d;
    static int field_s;
    private int field_G;
    int field_M;
    int[] field_C;
    int[][] field_j;
    int field_u;
    private int[] field_x;
    int[] field_o;
    int[][] field_r;
    private int[] field_t;
    int[] field_E;
    int[] field_c;
    int[] field_P;
    private ja field_y;
    static String field_n;
    int field_m;

    public static void a(byte param0) {
        field_g = null;
        field_N = null;
        field_n = null;
        field_D = null;
        if (param0 >= -80) {
            CharSequence var2 = (CharSequence) null;
            lh.a(-54, (CharSequence) null, '\t');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        var8 = StarCannon.field_A;
        if (qb.field_h >= 0) {
          L0: {
            var3 = -135 + param2;
            var4 = -35 + param0;
            var5 = 256;
            if (75 <= qb.field_h) {
              break L0;
            } else {
              var5 = (qb.field_h << -1175114488) / 75;
              break L0;
            }
          }
          L1: {
            if (-201 > (qb.field_h ^ -1)) {
              var5 = (250 - qb.field_h << -1584646680) / 50;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            bc.a(wj.field_g, 26095);
            gl.b();
            ki.b();
            nc.a(-1196777214);
            if (-257 < (var5 ^ -1)) {
              ki.b(0, 0, ki.field_j, ki.field_f, 0, 256 - var5);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            wf.a(-123);
            if (-151 >= (qb.field_h ^ -1)) {
              m.field_a.e(var3 + 15, 10 + var4, var5);
              break L3;
            } else {
              wj.field_g.a(var3, var4);
              break L3;
            }
          }
          L4: {
            var6 = -125 + qb.field_h;
            if (-1 <= (var6 ^ -1)) {
              break L4;
            } else {
              if (var6 >= 50) {
                break L4;
              } else {
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                  ak.field_f.f(var3, var4, var7);
                  break L4;
                } else {
                  if (-31 >= (var6 ^ -1)) {
                    var7 = 256 * (-var6 + 50) / 20;
                    ak.field_f.f(var3, var4, var7);
                    break L4;
                  } else {
                    ak.field_f.f(var3, var4, 256);
                    break L4;
                  }
                }
              }
            }
          }
          L5: {
            var6 = -140 + qb.field_h;
            if (-1 > (var6 ^ -1)) {
              L6: {
                var7 = 256;
                if ((var6 ^ -1) <= -21) {
                  break L6;
                } else {
                  var7 = var6 * 256 / 20;
                  break L6;
                }
              }
              ai.field_g.e(var3 + 15, 10 + var4, var5 * var7 >> -1766593752);
              break L5;
            } else {
              break L5;
            }
          }
          L7: {
            if (param1 <= -43) {
              break L7;
            } else {
              lh.a((byte) 88);
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(byte param0) {
        int var2;
        int var3;
        int var4;
        int var6;
        ud var5;
        var6 = StarCannon.field_A;
        if (this.field_y != null) {
          var2 = 1;
          var4 = -26 % ((75 - param0) / 33);
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_L.length) {
              L1: {
                if (var2 != 0) {
                  this.field_x = null;
                  this.field_t = null;
                  this.field_y = null;
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              if (null == this.field_L[var3]) {
                L2: {
                  if (this.field_B[var3] >> -1175021820 == 0) {
                    var5 = this.field_y.b(this.field_t[var3], this.field_x[var3], 91);
                    break L2;
                  } else {
                    var5 = this.field_y.a(this.field_x[var3], this.field_t[var3], (byte) 41);
                    break L2;
                  }
                }
                if (var5 != null) {
                  this.field_B[var3] = w.a(this.field_B[var3], 15);
                  this.field_L[var3] = var5;
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
        } else {
          return;
        }
    }

    final static int a(int param0, CharSequence param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -15790) {
                break L1;
              } else {
                field_I = 98;
                break L1;
              }
            }
            var3_int = 0;
            var4 = param1.length();
            var5 = 0;
            L2: while (true) {
              if (var4 <= var5) {
                stackIn_8_0 = var3_int;
                break L0;
              } else {
                L3: {
                  if (param2 != param1.charAt(var5)) {
                    break L3;
                  } else {
                    var3_int++;
                    break L3;
                  }
                }
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("lh.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    lh(rb param0, ja param1) {
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
            this.field_y = param1;
            this.field_M = param0.j(7909) + 1;
            param0.j(7909);
            this.field_p = 1 + param0.j(7909);
            this.field_h = 1 + param0.j(7909);
            this.field_G = param0.j(7909) - -1;
            var3_int = param0.j(7909);
            this.field_m = var3_int & 1;
            this.field_w = param0.j(7909);
            this.field_u = param0.j(7909);
            this.field_F = new int[this.field_M];
            var4 = 0;
            for (var5 = 0; var5 < this.field_M; var5++) {
                dupTemp$0 = var4 + param0.j(7909);
                var4 = dupTemp$0;
                this.field_F[var5] = w.a(dupTemp$0, 255);
            }
            this.field_c = new int[256];
            this.field_l = new byte[256][];
            ug.a(this.field_c, 0, 256, 64);
            for (var5 = 0; var5 < 256; var5++) {
                this.field_l[var5] = mc.field_g;
            }
            for (var5 = 0; var5 < this.field_h; var5++) {
                this.field_c[var5] = param0.j(7909) + 1;
                var6 = param0.i(-1174051992);
                var16 = new byte[var6];
                if (var6 > 0) {
                    param0.a(var6, (byte) 88, var16, 0);
                    this.field_l[var5] = var16;
                }
            }
            this.field_K = new int[this.field_G];
            this.field_v = new int[this.field_G];
            this.field_r = new int[this.field_G][];
            this.field_k = new int[this.field_G][];
            this.field_f = new int[this.field_G][];
            this.field_a = new int[this.field_G];
            this.field_H = new int[this.field_G][];
            this.field_P = new int[this.field_G];
            this.field_b = new int[this.field_G];
            this.field_j = new int[this.field_G][96];
            this.field_z = new int[this.field_G];
            this.field_C = new int[this.field_G];
            this.field_O = new int[this.field_G];
            this.field_i = new int[this.field_G];
            var5 = param0.i(-1174051992);
            this.field_J = new int[var5];
            this.field_A = new int[var5];
            this.field_E = new int[var5];
            this.field_e = new int[var5];
            this.field_d = new int[var5];
            this.field_q = new int[var5];
            this.field_t = new int[var5];
            this.field_L = new ud[var5];
            this.field_B = new int[var5];
            this.field_o = new int[var5];
            this.field_x = new int[var5];
            var5 = 0;
            for (var6 = 0; this.field_G > var6; var6++) {
                var7 = param0.j(7909);
                if (0 < var7) {
                    var4 = 0;
                    for (var8 = 0; 96 > var8; var8++) {
                        dupTemp$1 = var4 + param0.j(7909);
                        var4 = dupTemp$1;
                        this.field_j[var6][var8] = var5 - -w.a(dupTemp$1, 255);
                    }
                    this.field_a[var6] = param0.j(7909);
                    var8 = param0.j(7909);
                    this.field_P[var6] = param0.j(7909);
                    this.field_K[var6] = param0.j(7909);
                    this.field_v[var6] = this.field_K[var6] - -param0.j(7909);
                    this.field_b[var6] = param0.j(7909);
                    var9 = param0.j(7909);
                    this.field_C[var6] = param0.j(7909);
                    this.field_z[var6] = param0.j(7909);
                    this.field_O[var6] = this.field_z[var6] - -param0.j(7909);
                    var4 = 0;
                    array$2 = new int[var8];
                    this.field_k[var6] = array$2;
                    var10 = 0;
                    for (var11 = 0; var8 > var11; var11++) {
                        dupTemp$3 = var10 + param0.d((byte) 26);
                        var10 = dupTemp$3;
                        var4 = var4 + dupTemp$3;
                        this.field_k[var6][var11] = var4 + dupTemp$3;
                    }
                    var4 = 0;
                    array$4 = new int[var8];
                    this.field_f[var6] = array$4;
                    for (var11 = 0; var11 < var8; var11++) {
                        dupTemp$5 = var4 + param0.j(7909);
                        var4 = dupTemp$5;
                        this.field_f[var6][var11] = w.a(dupTemp$5, 255);
                    }
                    var10 = 0;
                    array$6 = new int[var9];
                    this.field_r[var6] = array$6;
                    var4 = 0;
                    for (var11 = 0; var9 > var11; var11++) {
                        dupTemp$7 = var10 + param0.d((byte) 86);
                        var10 = dupTemp$7;
                        var4 = var4 + dupTemp$7;
                        this.field_r[var6][var11] = var4 + dupTemp$7;
                    }
                    var4 = 0;
                    array$8 = new int[var9];
                    this.field_H[var6] = array$8;
                    for (var11 = 0; var11 < var9; var11++) {
                        dupTemp$9 = var4 + param0.j(7909);
                        var4 = dupTemp$9;
                        this.field_H[var6][var11] = w.a(255, dupTemp$9);
                    }
                    this.field_i[var6] = param0.i(-1174051992);
                    for (var11 = 0; var11 < var7; var11++) {
                        this.field_d[var5] = param0.g(-89);
                        this.field_e[var5] = param0.g(62);
                        this.field_A[var5] = this.field_e[var5] + param0.g(123);
                        this.field_E[var5] = param0.j(7909);
                        this.field_o[var5] = param0.a(false);
                        this.field_B[var5] = param0.j(7909);
                        this.field_q[var5] = param0.j(7909);
                        this.field_J[var5] = param0.a(false) - 1;
                        this.field_x[var5] = param0.i(-1174051992);
                        this.field_t[var5] = param0.i(-1174051992);
                        var5++;
                    }
                }
            }
            this.b((byte) 123);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = "Type your password again to make sure it's correct";
        field_g = new java.util.zip.CRC32();
    }
}
