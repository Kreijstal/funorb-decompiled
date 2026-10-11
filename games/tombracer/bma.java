/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bma extends ci {
    private int field_m;
    private int field_r;
    private int field_A;
    private int field_q;
    static gb field_w;
    private int field_x;
    private int field_n;
    static jea field_v;
    private int field_C;
    private int[] field_u;
    private int[][] field_B;
    private int[][] field_y;
    static int[] field_t;
    private int field_o;
    private int field_D;
    private int field_z;
    static String field_s;
    private int field_E;
    static int[] field_p;

    final static void d(byte param0) {
        aca var1 = (aca) (io.field_d.f(-80));
        if (var1 == null) {
          dea.a(60);
          return;
        }
        kh var2 = vc.field_q;
        if (param0 < 23) {
          field_t = (int[]) null;
        }
        var2.e(-16);
        var2.e(-118);
        var2.e(112);
        var2.e(-29);
        var1.p(71);
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (0 != var4_int) {
            if (var4_int == 1) {
              this.field_n = param1.h(255);
            } else {
              if (2 != var4_int) {
                if (var4_int == 3) {
                  this.field_C = param1.d(123);
                } else {
                  if (var4_int == 4) {
                    this.field_z = param1.d(param0 + 18);
                  } else {
                    if (5 == var4_int) {
                      this.field_A = param1.d(param0 + 17);
                    } else {
                      if (var4_int == 6) {
                        this.field_q = param1.d(121);
                      } else {
                        if (var4_int == 7) {
                          this.field_x = param1.d(param0 ^ 23);
                        }
                      }
                    }
                  }
                }
              } else {
                this.field_D = param1.d(param0 + 17);
              }
            }
          } else {
            this.field_o = param1.h(255);
          }
          if (param0 != 107) {
            bma.d((byte) -52);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("bma.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int d(int param0, int param1, int param2) {
        if (param1 != -1368) {
          return 73;
        }
        if (param0 < 2) {
          if (param2 < 5) {
            return 0;
          }
          return 1;
        }
        return 2;
    }

    private final void c(int param0) {
        int var5 = 0;
        int var8 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        Random var10 = new Random((long)this.field_n);
        int var6Lifetime1;
        int var7Lifetime1;
        this.field_E = 4096 / this.field_n;
        this.field_r = 4096 / this.field_o;
        this.field_m = this.field_q / 2;
        if (param0 < 46) {
          return;
        }
        int var3 = this.field_r / 2;
        this.field_u = new int[this.field_n + 1];
        this.field_B = new int[this.field_n][this.field_o];
        int var4 = this.field_E / 2;
        this.field_y = new int[this.field_n][1 + this.field_o];
        this.field_u[0] = 0;
        for (var5 = 0; var5 < this.field_n; var5++) {
          if (var5 > 0) {
            var6 = this.field_E;
            var7 = (jqa.a(4096, var10, -100) - 2048) * this.field_C >> 12;
            var6 = var6 + (var4 * var7 >> 12);
            this.field_u[var5] = var6 + this.field_u[var5 - 1];
          }
          this.field_y[var5][0] = 0;
          for (var6Lifetime1 = 0; this.field_o > var6Lifetime1; var6Lifetime1++) {
            if (var6Lifetime1 > 0) {
              var7Lifetime1 = this.field_r;
              var8 = (-2048 + jqa.a(4096, var10, -93)) * this.field_D >> 12;
              var7Lifetime1 = var7Lifetime1 + (var3 * var8 >> 12);
              this.field_y[var5][var6Lifetime1] = this.field_y[var5][var6Lifetime1 - 1] + var7Lifetime1;
            }
            this.field_B[var5][var6Lifetime1] = this.field_x > 0 ? -jqa.a(this.field_x, var10, -120) + 4096 : 4096;
          }
          this.field_y[var5][this.field_o] = 4096;
        }
        this.field_u[this.field_n] = 4096;
    }

    final static boolean d(int param0, int param1) {
        int var2;
        boolean stackIn_7_0 = false;
        var2 = 76 / ((-20 - param0) / 40);
        stackIn_7_0 = (param1 == 0) || (param1 == pl.a((byte) 64)) || (dta.field_g[param1]) || !(rd.b(false));
        return stackIn_7_0;
    }

    public static void d(int param0) {
        if (param0 != -21771) {
          bma.d(5, -48, 96);
        }
        field_p = null;
        field_w = null;
        field_v = null;
        field_s = null;
        field_t = null;
    }

    final void b(byte param0) {
        if (param0 != 116) {
          return;
        }
        this.c(122);
    }

    public bma() {
        super(0, true);
        this.field_n = 8;
        this.field_q = 81;
        this.field_C = 204;
        this.field_A = 0;
        this.field_D = 409;
        this.field_z = 1024;
        this.field_o = 4;
        this.field_x = 1024;
    }

    final static int a(fp param0, boolean param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ej.field_c == param0) {
            stackIn_11_0 = 5890;
            return stackIn_11_0;
          }
          if (tla.field_c == param0) {
            stackIn_9_0 = 34167;
            return stackIn_9_0;
          }
          if (param0 == lja.field_j) {
            stackIn_4_0 = 34168;
            return stackIn_4_0;
          }
          if (param0 == pea.field_c) {
            stackIn_7_0 = 34166;
            return stackIn_7_0;
          }
          if (!param1) {
            bma.d(-82, 71, 72);
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("bma.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int stackIn_14_0 = 0;
        int stackIn_23_0 = 0;
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
        var17 = TombRacer.field_G ? 1 : 0;
        if (param0 != 1) {
          return (int[]) null;
        }
        var19 = this.field_i.a((byte) 46, param1);
        var18 = var19;
        var3 = var18;
        if (this.field_i.field_d) {
          var7 = 0;
          for (var9 = sj.field_b[param1] + this.field_A; var9 < 0; var9 += 4096) {
          }
          while (var9 > 4096) {
            var9 -= 4096;
          }
          while (var7 < this.field_n) {
            if (this.field_u[var7] <= var9) {
              var7++;
              continue;
            }
            break;
          }
          var11 = -1 + var7;
          stackIn_14_0 = ((1 & var7) != 0) ? 0 : 1;
          var12 = stackIn_14_0;
          var15 = this.field_u[var7];
          var16 = this.field_u[-1 + var7];
          if (var16 + this.field_m < var9 &&
            var15 - this.field_m > var9) {
            for (var4 = 0; var4 < ns.field_g; var4++) {
              if (var12 != 0) {
                stackIn_23_0 = this.field_z;
              } else {
                stackIn_23_0 = -this.field_z;
              }
              var5 = stackIn_23_0;
              var6 = 0;
              for (var8 = ht.field_Fb[var4] + (this.field_r * var5 >> 12); var8 < 0; var8 += 4096) {
              }
              while (var8 > 4096) {
                var8 -= 4096;
              }
              while (var6 < this.field_o) {
                if (var8 >= this.field_y[var11][var6]) {
                  var6++;
                  continue;
                }
                break;
              }
              var10 = var6 - 1;
              var13 = this.field_y[var11][var10];
              var14 = this.field_y[var11][var6];
              if (this.field_m + var13 < var8 &&
                var8 < var14 - this.field_m) {
                var3[var4] = this.field_B[var11][var10];
              } else {
                var19[var4] = 0;
              }
            }
          } else {
            lua.a(var19, 0, ns.field_g, 0);
          }
        }
        return var3;
    }

    static {
        field_w = new gb();
        field_t = new int[5];
        field_p = new int[8192];
    }
}
