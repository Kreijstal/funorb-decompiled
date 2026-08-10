/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qe extends qg {
    private ti field_y;
    static String field_H;
    private ti field_C;
    static String field_I;
    static ti[] field_F;
    private ti[] field_D;
    private int field_G;
    boolean field_w;
    int field_J;
    static kh field_x;
    private int field_u;
    private ti field_K;
    private int field_M;
    private int field_L;
    private int field_t;
    private int field_B;
    static String[] field_E;
    static int[] field_z;
    static String field_v;
    static String field_A;

    private final ti h(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Transmogrify.field_A ? 1 : 0;
        int var2 = this.field_h >> -2114180767;
        ti var3 = new ti(var2, this.field_h);
        oj.a(var3, 256);
        for (var4 = 0; var4 < this.field_h; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_h));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                sb.a(var5, var4, var8 << 408496040 | var8 | var8 << 1557073104);
            }
        }
        if (param0 != -29239) {
            field_E = (String[]) null;
        }
        fi.c(true);
        return var3;
    }

    final void a(boolean param0, int param1, int param2) {
        this.field_u = (param1 & 16711422) >> -1813204703;
        this.field_L = 8355711 & param2 >> -1606387295;
        this.field_B = param1;
        this.field_M = param2;
        this.c(false);
        if (!param0) {
            this.a(false, 76, -81);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-109, param1, param2, param3, param4);
        int var6 = 118 / ((param0 - -29) / 53);
        this.c(false);
    }

    private final ti a(byte param0, int param1, int param2) {
        ti discarded$0 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = Transmogrify.field_A ? 1 : 0;
        ti var14 = new ti(this.field_t * 2, this.field_h);
        oj.a(var14, param0 + 166);
        int var5 = this.field_h >> -1790979455;
        if (param0 != 90) {
            discarded$0 = this.h(50);
        }
        for (var6 = 0; var6 < this.field_h; var6++) {
            var7 = (var6 >> -1974548927) * (-1 + this.field_t * 2) % (this.field_t * 2);
            var8 = param2 & 16711935;
            var9 = 65280 & param2;
            var10 = var6 - var5;
            var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
            var12 = -257 < (var11 ^ -1) ? (16711680 & var11 * var9 | var11 * var8 & -16711936) >>> -1794144536 : var9 | var8;
            sb.d(var7, var6, this.field_t, var12);
            sb.d(var7 - 2 * this.field_t, var6, this.field_t, var12);
            var9 = param1 & 65280;
            var8 = 16711935 & param1;
            var12 = var11 >= 256 ? var9 | var8 : (var9 * var11 & 16711680 | var11 * var8 & -16711936) >>> -811925688;
            sb.d(var7 - -this.field_t, var6, this.field_t, var12);
            sb.d(-this.field_t + var7, var6, this.field_t, var12);
        }
        fi.c(true);
        return var14;
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (this.field_w) {
                this.field_G = this.field_G + 1;
                if (this.field_G > this.field_t * 2) {
                  this.field_G = this.field_G - this.field_t * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -12) {
                break L2;
              } else {
                field_v = (String) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qe.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param3 + ')');
        }
    }

    private final void c(boolean param0) {
        if (param0) {
            this.field_u = -108;
        }
        this.field_D = new ti[]{this.a((byte) 90, this.field_B, this.field_M), this.a((byte) 90, this.field_u, this.field_L)};
        this.field_y = this.h(-29239);
        this.field_C = this.field_y.c();
        this.field_K = new ti(this.field_h >> 1507472769, this.field_h);
    }

    private final void a(byte param0, ti param1, int param2, int param3) {
        ti discarded$0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_l + param3;
              c.a(var5_int + -this.field_y.field_n, this.field_y.field_n + param3, (byte) -50, this.field_h + param2, param2);
              var6 = -this.field_G + param3;
              if (param0 == -57) {
                break L1;
              } else {
                discarded$0 = this.h(-123);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  fi.c(true);
                  if (param3 - -this.field_y.field_n < sb.field_d) {
                    break L3;
                  } else {
                    oj.a(this.field_K, 256);
                    param1.c(-this.field_G, 0);
                    param1.c(this.field_t * 2 - this.field_G, 0);
                    this.field_C.b(0, 0);
                    fi.c(true);
                    this.field_K.c(param3, param2);
                    break L3;
                  }
                }
                L4: {
                  if (var5_int + -this.field_y.field_n <= sb.field_b) {
                    oj.a(this.field_K, 256);
                    var7 = this.field_G + this.field_l - this.field_y.field_n;
                    L5: while (true) {
                      if (2 * this.field_t >= var7) {
                        param1.c(-var7, 0);
                        param1.c(this.field_t * 2 - var7, 0);
                        this.field_y.b(0, 0);
                        fi.c(true);
                        this.field_K.c(-this.field_y.field_n + var5_int, param2);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_t;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param1.c(var6, param2);
                var6 = var6 + param1.field_n;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("qe.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, 8355711 & param5 >> -1277422143, param6 >> 342186241 & 8355711);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (0 != param2) {
            return;
        }
        int var5 = -77 % ((param3 - 77) / 34);
        int var6 = this.field_p + param0;
        int var7 = this.field_n + param1;
        this.a((byte) -57, this.field_D[0], var7, var6);
        if (65536 > this.field_J) {
            c.a(this.field_l + var6, (this.field_l * this.field_J >> -156630320) + var6, (byte) -50, this.field_h + var7, var7);
            this.a((byte) -57, this.field_D[1], var7, var6);
            fi.c(true);
        }
    }

    public static void i(int param0) {
        field_E = null;
        field_A = null;
        field_F = null;
        field_z = null;
        field_H = null;
        if (param0 != -156630320) {
            qe.i(-7);
        }
        field_x = null;
        field_v = null;
        field_I = null;
    }

    private qe(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_L = param7;
        this.field_t = param4;
        this.field_M = param5;
        this.field_u = param8;
        this.field_B = param6;
        this.a(75, param1, param0, param2, param3);
    }

    static {
        field_H = "Passwords can only contain letters and numbers";
        field_I = "Continue";
        field_x = new kh("");
        field_v = "Instructions";
        field_E = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        field_z = new int[8192];
        field_A = "Age:";
    }
}
