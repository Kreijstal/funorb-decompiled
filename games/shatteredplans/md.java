/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends vg {
    static String field_I;
    static boolean field_B;
    private int field_E;
    private bi field_S;
    private bi field_R;
    boolean field_L;
    private int field_P;
    static String field_G;
    static String field_D;
    private int field_O;
    private bi field_N;
    static int field_M;
    static String field_K;
    private bi[] field_z;
    private int field_A;
    static boolean field_Q;
    static int[] field_J;
    int field_y;
    private int field_H;
    private int field_F;

    private final bi a(int param0, byte param1, int param2) {
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
        bi var15 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var14 = ShatteredPlansClient.field_F ? 1 : 0;
        var15 = new bi(2 * ((md) this).field_H, ((md) this).field_n);
        var5 = -87 % ((param1 - 33) / 61);
        aq.a((byte) 83, var15);
        var6 = ((md) this).field_n >> 1;
        var7 = 0;
        L0: while (true) {
          if (var7 >= ((md) this).field_n) {
            ln.f((byte) 111);
            return var15;
          } else {
            L1: {
              var8 = (((md) this).field_H * 2 + -1) * (var7 >> 1) % (2 * ((md) this).field_H);
              var9 = param0 & 16711935;
              var10 = 65280 & param0;
              var11 = var7 + -var6;
              var12 = 128 - -(int)(Math.sqrt((double)(-(var11 * var11) + var6 * var6)) / (double)var6 * 128.0);
              if (var12 < 256) {
                stackOut_4_0 = (var12 * var10 & 16711680 | -16711936 & var12 * var9) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var10;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var13 = stackIn_5_0;
              gf.f(var8, var7, ((md) this).field_H, var13);
              gf.f(var8 + -(((md) this).field_H * 2), var7, ((md) this).field_H, var13);
              var10 = 65280 & param2;
              var9 = 16711935 & param2;
              if (256 > var12) {
                stackOut_7_0 = (16711680 & var12 * var10 | var9 * var12 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var10 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var13 = stackIn_8_0;
            gf.f(var8 - -((md) this).field_H, var7, ((md) this).field_H, var13);
            gf.f(-((md) this).field_H + var8, var7, ((md) this).field_H, var13);
            var7++;
            continue L0;
          }
        }
    }

    private final void a(int param0) {
        ((md) this).field_z = new bi[]{this.a(((md) this).field_E, (byte) 98, ((md) this).field_F), this.a(((md) this).field_A, (byte) 124, ((md) this).field_O)};
        ((md) this).field_R = this.h(61);
        ((md) this).field_N = ((md) this).field_R.c();
        ((md) this).field_S = new bi(((md) this).field_n >> 1, ((md) this).field_n);
    }

    final static void a(int param0, String param1, int param2, String param3, String param4, int param5) {
        nf var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var6 = new nf(param0, param3, param2, param4, param1);
              ei.a((byte) 37, var6);
              if (param5 == -16169) {
                break L1;
              } else {
                md.j(127);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var6_ref;
            stackOut_3_1 = new StringBuilder().append("md.I(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param5 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 107, param3, param4);
        if (param2 <= 99) {
            return;
        }
        this.a(-907398527);
    }

    md(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    private final void a(bi param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_int = param2 - -((md) this).field_x;
            ke.a(-6187, var5_int - ((md) this).field_R.field_z, ((md) this).field_n + param1, param1, param2 - -((md) this).field_R.field_z);
            var6 = -((md) this).field_P + param2;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  ln.f((byte) -64);
                  if (gf.field_i > param2 - -((md) this).field_R.field_z) {
                    break L2;
                  } else {
                    aq.a((byte) -90, ((md) this).field_S);
                    param0.f(-((md) this).field_P, 0);
                    param0.f(-((md) this).field_P + ((md) this).field_H * 2, 0);
                    ((md) this).field_N.e(0, 0);
                    ln.f((byte) -91);
                    ((md) this).field_S.f(param2, param1);
                    break L2;
                  }
                }
                L3: {
                  if (gf.field_l < -((md) this).field_R.field_z + var5_int) {
                    break L3;
                  } else {
                    aq.a((byte) 98, ((md) this).field_S);
                    var7 = -((md) this).field_R.field_z + ((md) this).field_x + ((md) this).field_P;
                    L4: while (true) {
                      if (2 * ((md) this).field_H >= var7) {
                        param0.f(-var7, 0);
                        param0.f(((md) this).field_H * 2 + -var7, 0);
                        ((md) this).field_R.e(0, 0);
                        ln.f((byte) 111);
                        ((md) this).field_S.f(-((md) this).field_R.field_z + var5_int, param1);
                        break L3;
                      } else {
                        var7 = var7 - 2 * ((md) this).field_H;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.f(var6, param1);
                var6 = var6 + param0.field_z;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("md.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + -1 + ')');
        }
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((md) this).field_L) {
                break L1;
              } else {
                ((md) this).field_P = ((md) this).field_P + 1;
                if (((md) this).field_H * 2 >= ((md) this).field_P) {
                  break L1;
                } else {
                  ((md) this).field_P = ((md) this).field_P - 2 * ((md) this).field_H;
                  break L1;
                }
              }
            }
            L2: {
              if (param3 == 91) {
                break L2;
              } else {
                ((md) this).field_E = 61;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("md.PA(").append(param0).append(',').append(param1).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param0 == 0)) {
            return;
        }
        if (param1 != -11857) {
            Object var7 = null;
            ((md) this).a(-111, -4, (vg) null, (byte) -84);
        }
        int var5 = param3 - -((md) this).field_m;
        int var6 = ((md) this).field_q + param2;
        this.a(((md) this).field_z[0], var6, var5, -1);
        if (!(((md) this).field_y >= 65536)) {
            ke.a(-6187, var5 + ((md) this).field_x, var6 - -((md) this).field_n, var6, var5 + (((md) this).field_y * ((md) this).field_x >> 16));
            this.a(((md) this).field_z[1], var6, var5, -1);
            ln.f((byte) -78);
        }
    }

    final static bi i(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        ln.field_F = new bi(182 + -(pf.field_a[0].field_z * 3 / 4), rs.field_Cb.field_J);
        ra.a(-106);
        ln.field_F.e();
        var1 = 1;
        L0: while (true) {
          if (-1 + ln.field_F.field_w <= var1) {
            gf.f(0, 0, ln.field_F.field_z, 1052688);
            gf.f(0, -1 + ln.field_F.field_w, ln.field_F.field_z, 1052688);
            var1 = 0;
            L1: while (true) {
              if (var1 >= ln.field_F.field_w) {
                gf.a(ln.field_F.field_z - 2, 1, ui.a(1052688, ln.field_F.field_B[ln.field_F.field_z * 2 + -2], -83, 128));
                gf.a(ln.field_F.field_z + -3, 1, ui.a(1052688, ln.field_F.field_B[-3 + ln.field_F.field_z * 2], -78, 192));
                gf.a(-2 + ln.field_F.field_z, 2, ui.a(1052688, ln.field_F.field_B[-2 + ln.field_F.field_z * 3], -110, 192));
                gf.a(ln.field_F.field_z - 2, ln.field_F.field_w - 2, ui.a(1052688, ln.field_F.field_B[ln.field_F.field_z * (ln.field_F.field_w + -1) + -2], -117, 128));
                gf.a(-3 + ln.field_F.field_z, -2 + ln.field_F.field_w, ui.a(1052688, ln.field_F.field_B[-3 + (-1 + ln.field_F.field_w) * ln.field_F.field_z], -125, 192));
                gf.a(-2 + ln.field_F.field_z, -3 + ln.field_F.field_w, ui.a(1052688, ln.field_F.field_B[-2 + ln.field_F.field_z * (-2 + ln.field_F.field_w)], -111, 192));
                cg.i(0);
                return ln.field_F;
              } else {
                gf.a(-1 + ln.field_F.field_z, var1, ui.a(1052688, ln.field_F.field_B[-1 + (var1 + 1) * ln.field_F.field_z], -114, 128));
                var1++;
                continue L1;
              }
            }
          } else {
            var2 = (-var1 + ln.field_F.field_w / 2) * (ln.field_F.field_w / 2 - var1);
            gf.f(0, var1, ln.field_F.field_z, 328965 * (ln.field_F.field_w / 2 * (ln.field_F.field_w / 2) - var2));
            var1++;
            continue L0;
          }
        }
    }

    private final bi h(int param0) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = ShatteredPlansClient.field_F ? 1 : 0;
        int var2 = ((md) this).field_n >> 1;
        bi var3 = new bi(var2, ((md) this).field_n);
        int var4 = 44;
        aq.a((byte) -50, var3);
        for (var5 = 0; ((md) this).field_n > var5; var5++) {
            for (var6 = 0; var2 > var6; var6++) {
                var7 = (double)var6 * (double)var6 / (double)(var5 * (-var5 + ((md) this).field_n));
                var9 = 1;
                if (!(var7 >= 1.0)) {
                    var7 = Math.sqrt(-var7 + 1.0);
                    var9 = 1.0 > var7 ? (int)(255.0 * var7) : 255;
                }
                gf.a(var6, var5, var9 << 8 | var9 | var9 << 16);
            }
        }
        ln.f((byte) 110);
        return var3;
    }

    final static int[] a(byte param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        int[] var10 = new int[param2];
        int[] var3 = var10;
        int var4 = 16711935;
        int var5 = 65280;
        if (param0 <= 23) {
            Object var9 = null;
            md.a(27, (String) null, 25, (String) null, (String) null, 0);
        }
        for (var6 = 0; param2 > var6; var6++) {
            var7 = (param2 - var6) * 256 / param2;
            var10[var6] = ee.a(we.a(var7 * var4, -16711936), we.a(16711680, var7 * var5)) >>> 8;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2) {
        ((md) this).field_F = param0;
        if (param2 != -27855) {
            ((md) this).field_O = -4;
        }
        ((md) this).field_O = (16711422 & param0) >> 1;
        ((md) this).field_A = param1 >> 1 & 8355711;
        ((md) this).field_E = param1;
        this.a(-907398527);
    }

    public static void j(int param0) {
        field_D = null;
        field_K = null;
        int var1 = -58 / ((-52 - param0) / 49);
        field_G = null;
        field_I = null;
        field_J = null;
    }

    private md(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((md) this).field_O = param8;
        ((md) this).field_E = param5;
        ((md) this).field_F = param6;
        ((md) this).field_A = param7;
        ((md) this).field_H = param4;
        ((md) this).a(param1, param3, (byte) 122, param0, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "You do not have a suitable number of players for the current options.";
        field_G = "Showing system collapses.";
        field_K = "Outgoing fleet";
        field_D = "Honour";
        field_J = new int[]{32, 24, 16, 12, 10};
    }
}
