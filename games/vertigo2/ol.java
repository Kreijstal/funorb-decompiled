/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ol extends ji {
    private int[] field_M;
    private int field_K;
    static int field_I;
    private int field_N;
    static String field_z;
    private int field_Q;
    private int field_C;
    static ie field_H;
    private int[][] field_O;
    private int field_G;
    private int field_J;
    private int field_E;
    private int[][] field_P;
    static int field_B;
    private int field_L;
    static String field_D;
    private int field_y;
    private int field_R;
    static int field_A;
    private int field_F;

    final static void a(int param0, boolean param1, int param2, int param3) {
        ri.b(param1, 30834);
        if (param3 <= 23) {
          field_B = 0;
        }
        cj.b(param1, -1, param0, param2);
    }

    final static wp a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        wp var5 = null;
        String var6 = null;
        wp stackIn_4_0 = null;
        wp stackIn_8_0 = null;
        wp stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            0 != param0.length()) {
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_8_0 = ab.field_a;
              return stackIn_8_0;
            }
            var3 = param0.substring(0, var2_int);
            if (param1 != -6675) {
              var6 = (String) null;
              ol.a((String) null, -122);
            }
            var4 = param0.substring(var2_int + 1);
            var5 = qn.a(var3, 0);
            if (var5 == null) {
              return ug.a(var4, (byte) -77);
            }
            stackIn_14_0 = var5;
            return stackIn_14_0;
          }
          stackIn_4_0 = jr.field_e;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ol.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0) {
        if (param0 >= -98) {
          field_I = -9;
        }
        this.g(-95);
    }

    public ol() {
        super(0, true);
        this.field_N = 409;
        this.field_C = 4;
        this.field_Q = 1024;
        this.field_J = 81;
        this.field_L = 1024;
        this.field_R = 8;
        this.field_y = 204;
        this.field_E = 0;
    }

    private final void g(int param0) {
        int var5 = 0;
        int var8 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = Vertigo2.field_L ? 1 : 0;
        Random var10 = new Random((long)this.field_R);
        Random var11 = var10;
        int var6Lifetime1;
        int var7Lifetime1;
        this.field_K = this.field_J / 2;
        this.field_G = 4096 / this.field_C;
        this.field_F = 4096 / this.field_R;
        int var3 = this.field_G / 2;
        this.field_O = new int[this.field_R][this.field_C + 1];
        this.field_M = new int[1 + this.field_R];
        if (param0 > -94) {
          this.field_K = 75;
        }
        int var4 = this.field_F / 2;
        this.field_P = new int[this.field_R][this.field_C];
        this.field_M[0] = 0;
        for (var5 = 0; var5 < this.field_R; var5++) {
          if (var5 > 0) {
            var6 = this.field_F;
            var7 = (-2048 + mj.a(-119, var11, 4096)) * this.field_y >> 12;
            var6 = var6 + (var7 * var4 >> 12);
            this.field_M[var5] = this.field_M[-1 + var5] + var6;
          }
          this.field_O[var5][0] = 0;
          for (var6Lifetime1 = 0; this.field_C > var6Lifetime1; var6Lifetime1++) {
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = this.field_G;
              var8 = (-2048 + mj.a(-104, var11, 4096)) * this.field_N >> 12;
              var7Lifetime1 = var7Lifetime1 + (var3 * var8 >> 12);
              this.field_O[var5][var6Lifetime1] = this.field_O[var5][-1 + var6Lifetime1] + var7Lifetime1;
            }
            this.field_P[var5][var6Lifetime1] = this.field_Q <= 0 ? 4096 : -mj.a(-105, var10, this.field_Q) + 4096;
          }
          this.field_O[var5][this.field_C] = 4096;
        }
        this.field_M[this.field_R] = 4096;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (0 == var4_int) {
            this.field_C = param2.h(-11);
          } else {
            if (var4_int == 1) {
              this.field_R = param2.h(-11);
            } else {
              if (var4_int != 2) {
                if (var4_int != 3) {
                  if (var4_int != 4) {
                    if (var4_int == 5) {
                      this.field_E = param2.a((byte) -11);
                    } else {
                      if (var4_int == 6) {
                        this.field_J = param2.a((byte) -11);
                      } else {
                        if (var4_int == 7) {
                          this.field_Q = param2.a((byte) -11);
                        }
                      }
                    }
                  } else {
                    this.field_L = param2.a((byte) -11);
                  }
                } else {
                  this.field_y = param2.a((byte) -11);
                }
              } else {
                this.field_N = param2.a((byte) -11);
              }
            }
          }
          if (param0 != 110) {
            field_A = -77;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ol.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
        int[] var3;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int[] var18;
        int[] var19;
        int[] var19Lifetime1;
        var17 = Vertigo2.field_L ? 1 : 0;
        var19 = this.field_x.a(param0, (byte) 68);
        var18 = var19;
        var3 = var18;
        if (param1 <= 91) {
          return (int[]) null;
        }
        if (this.field_x.field_i) {
          var7 = 0;
          for (var9 = lf.field_y[param0] + this.field_E; var9 < 0; var9 += 4096) {
          }
          while (var9 > 4096) {
            var9 -= 4096;
          }
          while (this.field_R > var7) {
            if (this.field_M[var7] <= var9) {
              var7++;
              continue;
            }
            break;
          }
          var11 = var7 - 1;
          stackIn_15_0 = ((var7 & 1) != 0) ? 0 : 1;
          var12 = stackIn_15_0;
          var15 = this.field_M[var7];
          var16 = this.field_M[var7 - 1];
          if (this.field_K + var16 < var9 &&
            var15 - this.field_K > var9) {
            for (var4 = 0; we.field_M > var4; var4++) {
              var6 = 0;
              if (var12 != 0) {
                stackIn_22_0 = this.field_L;
              } else {
                stackIn_22_0 = -this.field_L;
              }
              var5 = stackIn_22_0;
              for (var8 = rh.field_O[var4] + (this.field_G * var5 >> 12); var8 < 0; var8 += 4096) {
              }
              while (var8 > 4096) {
                var8 -= 4096;
              }
              while (this.field_C > var6) {
                if (this.field_O[var11][var6] <= var8) {
                  var6++;
                  continue;
                }
                break;
              }
              var10 = -1 + var6;
              var13 = this.field_O[var11][var10];
              var14 = this.field_O[var11][var6];
              if (var8 > var13 + this.field_K &&
                -this.field_K + var14 > var8) {
                var3[var4] = this.field_P[var11][var10];
              } else {
                var19Lifetime1 = var18;
                var19Lifetime1[var4] = 0;
              }
            }
          } else {
            var19Lifetime1 = var18;
            qq.a(var19Lifetime1, 0, we.field_M, 0);
          }
        }
        return var3;
    }

    final static be a(int param0, int param1, int param2, int param3) {
        be var4 = new be();
        int var5 = 59 / ((param0 - 51) / 44);
        var4.field_o = new int[param3];
        var4.field_r = param2;
        mb.field_v.a(var4, false);
        ec.a(param1, (byte) 126, var4);
        return var4;
    }

    public static void h(int param0) {
        if (param0 <= 126) {
          ol.a(98, -118, 23, -57);
        }
        field_H = null;
        field_D = null;
        field_z = null;
    }

    static {
        field_I = 4;
        field_z = "Report abuse";
        field_B = -1;
        field_D = "Hide chat";
    }
}
