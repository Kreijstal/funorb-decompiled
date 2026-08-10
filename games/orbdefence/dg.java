/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends pj {
    private hj field_G;
    private int field_A;
    static String field_C;
    private int field_y;
    static int[] field_B;
    private int field_K;
    private hj[] field_E;
    private int field_H;
    int field_J;
    private hj field_F;
    boolean field_z;
    private hj field_L;
    private int field_x;
    private int field_D;

    dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -21701087 & 8355711, (16711422 & param6) >> -1972298943);
    }

    private final void a(int param0, int param1, int param2, hj param3) {
        hj discarded$0 = null;
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
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_m + param2;
              id.a(-this.field_L.field_o + var5_int, param2 + this.field_L.field_o, this.field_r + param1, param1, 734);
              var6 = param2 + -this.field_A;
              if (param0 > 100) {
                break L1;
              } else {
                discarded$0 = this.i(114);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  oc.g((byte) -105);
                  if (this.field_L.field_o + param2 < ul.field_i) {
                    break L3;
                  } else {
                    de.a(-128, this.field_G);
                    param3.c(-this.field_A, 0);
                    param3.c(-this.field_A + 2 * this.field_D, 0);
                    this.field_F.e(0, 0);
                    oc.g((byte) -105);
                    this.field_G.c(param2, param1);
                    break L3;
                  }
                }
                L4: {
                  if (ul.field_e >= -this.field_L.field_o + var5_int) {
                    de.a(-127, this.field_G);
                    var7 = this.field_A + this.field_m + -this.field_L.field_o;
                    L5: while (true) {
                      if (this.field_D * 2 >= var7) {
                        param3.c(-var7, 0);
                        param3.c(-var7 + 2 * this.field_D, 0);
                        this.field_L.e(0, 0);
                        oc.g((byte) -105);
                        this.field_G.c(var5_int + -this.field_L.field_o, param1);
                        break L4;
                      } else {
                        var7 = var7 - 2 * this.field_D;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param3.c(var6, param1);
                var6 = var6 + param3.field_o;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("dg.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 <= 113) {
            dg.a((byte) -26);
        }
        field_C = null;
        field_B = null;
    }

    private final hj i(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = OrbDefence.field_D ? 1 : 0;
        int var2 = this.field_r >> 368752481;
        hj var3 = new hj(var2, this.field_r);
        if (param0 < 33) {
            return (hj) null;
        }
        de.a(-125, var3);
        for (var4 = 0; var4 < this.field_r; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_r));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                ul.a(var5, var4, var8 << 200392840 | var8 | var8 << 1723690512);
            }
        }
        oc.g((byte) -105);
        return var3;
    }

    private final hj a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = OrbDefence.field_D ? 1 : 0;
        if (param1 != -45) {
            this.field_J = 82;
        }
        hj var14 = new hj(2 * this.field_D, this.field_r);
        de.a(-127, var14);
        int var5 = this.field_r >> 110509729;
        for (var6 = 0; var6 < this.field_r; var6++) {
            var7 = (var6 >> 1059469665) * (2 * this.field_D + -1) % (this.field_D * 2);
            var8 = 16711935 & param0;
            var9 = param0 & 65280;
            var10 = var6 - var5;
            var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
            var12 = var11 >= 256 ? var9 | var8 : (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 1637544392;
            ul.d(var7, var6, this.field_D, var12);
            ul.d(-(this.field_D * 2) + var7, var6, this.field_D, var12);
            var8 = 16711935 & param2;
            var9 = 65280 & param2;
            var12 = 256 > var11 ? (16711680 & var9 * var11 | -16711936 & var11 * var8) >>> -1927424632 : var9 | var8;
            ul.d(this.field_D + var7, var6, this.field_D, var12);
            ul.d(var7 + -this.field_D, var6, this.field_D, var12);
        }
        oc.g((byte) -105);
        return var14;
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.c(false);
    }

    final void a(int param0, int param1, int param2) {
        this.field_y = param1;
        this.field_H = param2 >> 1279763073 & 8355711;
        this.field_x = param2;
        this.field_K = (param1 & param0) >> -1024194527;
        this.c(false);
    }

    private final void c(boolean param0) {
        this.field_E = new hj[]{this.a(this.field_y, (byte) -45, this.field_x), this.a(this.field_K, (byte) -45, this.field_H)};
        this.field_L = this.i(90);
        if (param0) {
            this.field_y = -26;
        }
        this.field_F = this.field_L.b();
        this.field_G = new hj(this.field_r >> -103743775, this.field_r);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (0 != param1) {
            return;
        }
        int var5 = this.field_s + param3;
        int var6 = param0 - -this.field_n;
        this.a(121, var6, var5, this.field_E[0]);
        if (param2 != 1048575) {
            return;
        }
        if (!(this.field_J >= 65536)) {
            id.a(var5 + this.field_m, (this.field_m * this.field_J >> -1169100496) + var5, var6 - -this.field_r, var6, 734);
            this.a(111, var6, var5, this.field_E[1]);
            oc.g((byte) -105);
        }
    }

    final void a(byte param0, pj param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_z) {
                break L1;
              } else {
                this.field_A = this.field_A + 1;
                if (this.field_A <= this.field_D * 2) {
                  break L1;
                } else {
                  this.field_A = this.field_A - 2 * this.field_D;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -77) {
                break L2;
              } else {
                this.field_z = true;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("dg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private dg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_H = param8;
        this.field_K = param7;
        this.field_x = param6;
        this.field_y = param5;
        this.field_D = param4;
        this.a(param0, param1, param3, (byte) -90, param2);
    }

    static {
        field_C = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_B = new int[8192];
    }
}
