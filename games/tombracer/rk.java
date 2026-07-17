/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends ae {
    private int field_u;
    private int field_C;
    boolean field_D;
    private int field_y;
    private int field_G;
    static String field_F;
    private int field_x;
    private iu field_z;
    int field_B;
    private iu field_E;
    private iu field_A;
    private iu[] field_w;
    private int field_v;

    final void a(boolean param0, int param1, int param2) {
        ((rk) this).field_G = 8355711 & param1 >> 1;
        ((rk) this).field_v = (param2 & 16711422) >> 1;
        ((rk) this).field_C = param2;
        ((rk) this).field_x = param1;
        if (!param0) {
            return;
        }
        int discarded$0 = 12;
        this.g();
    }

    public static void a(int param0) {
        if (param0 != 30548) {
            rk.a(-86);
        }
        field_F = null;
    }

    final void a(int param0, int param1, ae param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 2097152) {
                break L1;
              } else {
                iu discarded$3 = this.a((byte) 6);
                break L1;
              }
            }
            L2: {
              if (!((rk) this).field_D) {
                break L2;
              } else {
                ((rk) this).field_y = ((rk) this).field_y + 1;
                if (2 * ((rk) this).field_u < ((rk) this).field_y) {
                  ((rk) this).field_y = ((rk) this).field_y - 2 * ((rk) this).field_u;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("rk.A(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    private final iu a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = TombRacer.field_G ? 1 : 0;
        int var2 = ((rk) this).field_p >> 1;
        iu var3 = new iu(var2, ((rk) this).field_p);
        nm.a(var3, (byte) 93);
        if (param0 <= 66) {
            ((rk) this).field_z = null;
        }
        for (var4 = 0; var4 < ((rk) this).field_p; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((rk) this).field_p) * var4);
                var8 = 1;
                if (1.0 > var6) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 >= 1.0 ? 255 : (int)(var6 * 255.0);
                }
                bea.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        pfa.a(1);
        return var3;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        int discarded$0 = 12;
        this.g();
    }

    private final void g() {
        ((rk) this).field_w = new iu[]{this.c(-69, ((rk) this).field_C, ((rk) this).field_x), this.c(91, ((rk) this).field_v, ((rk) this).field_G)};
        ((rk) this).field_A = this.a((byte) 78);
        ((rk) this).field_z = ((rk) this).field_A.d();
        ((rk) this).field_E = new iu(((rk) this).field_p >> 1, ((rk) this).field_p);
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        int var5 = param0 + ((rk) this).field_i;
        int var6 = param1 + ((rk) this).field_n;
        this.a(var6, ((rk) this).field_w[param2], var5, 93);
        if (((rk) this).field_B < 65536) {
            tga.a(-21953, (((rk) this).field_B * ((rk) this).field_m >> 16) + var5, ((rk) this).field_m + var5, var6, var6 - -((rk) this).field_p);
            this.a(var6, ((rk) this).field_w[1], var5, 115);
            pfa.a(param2 + 1);
        }
    }

    rk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, param6 >> 1 & 8355711);
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3, int param4, int param5, int param6) {
        if (!(!wqa.r((byte) -118))) {
            iqa.a(-109, param3, param5, param1);
            if (hka.field_b != null) {
                if (!(!hka.field_b.a(param1, param6, param0, param2 ^ -107, param3))) {
                    wp.a(-1);
                    param1 = false;
                }
            }
            fu.a(-83, param3, param1);
            kma.a(param1, 104, param4);
            param1 = false;
        }
        if (param2 != 107) {
            boolean discarded$0 = rk.a(-24, false, (byte) 37, -109, 107, 111, -35);
        }
        return param1;
    }

    private final iu c(int param0, int param1, int param2) {
        int var4 = 0;
        iu var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var14 = TombRacer.field_G ? 1 : 0;
        var4 = 29 % ((28 - param0) / 61);
        var5 = new iu(2 * ((rk) this).field_u, ((rk) this).field_p);
        nm.a(var5, (byte) 110);
        var6 = ((rk) this).field_p >> 1;
        var7 = 0;
        L0: while (true) {
          if (((rk) this).field_p <= var7) {
            pfa.a(1);
            return var5;
          } else {
            L1: {
              var8 = (var7 >> 1) * (((rk) this).field_u * 2 - 1) % (2 * ((rk) this).field_u);
              var9 = 16711935 & param1;
              var10 = 65280 & param1;
              var11 = var7 - var6;
              var12 = (int)(128.0 * (Math.sqrt((double)(var6 * var6 - var11 * var11)) / (double)var6)) + 128;
              if (var12 >= 256) {
                stackOut_4_0 = var9 | var10;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (-16711936 & var9 * var12 | var12 * var10 & 16711680) >>> 8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var13 = stackIn_5_0;
              bea.c(var8, var7, ((rk) this).field_u, var13);
              bea.c(-(2 * ((rk) this).field_u) + var8, var7, ((rk) this).field_u, var13);
              var9 = 16711935 & param2;
              var10 = 65280 & param2;
              if (var12 < 256) {
                stackOut_7_0 = (16711680 & var12 * var10 | var12 * var9 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var10 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var13 = stackIn_8_0;
            bea.c(((rk) this).field_u + var8, var7, ((rk) this).field_u, var13);
            bea.c(var8 + -((rk) this).field_u, var7, ((rk) this).field_u, var13);
            var7++;
            continue L0;
          }
        }
    }

    private final void a(int param0, iu param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param2 - -((rk) this).field_m;
              tga.a(-21953, ((rk) this).field_A.field_m + param2, var5_int + -((rk) this).field_A.field_m, param0, ((rk) this).field_p + param0);
              if (param3 > 86) {
                break L1;
              } else {
                ((rk) this).a(true, -45, -128);
                break L1;
              }
            }
            var6 = param2 - ((rk) this).field_y;
            L2: while (true) {
              if (var5_int <= var6) {
                L3: {
                  pfa.a(1);
                  if (bea.field_b > ((rk) this).field_A.field_m + param2) {
                    break L3;
                  } else {
                    nm.a(((rk) this).field_E, (byte) 116);
                    param1.b(-((rk) this).field_y, 0);
                    param1.b(2 * ((rk) this).field_u + -((rk) this).field_y, 0);
                    ((rk) this).field_z.a(0, 0);
                    pfa.a(1);
                    ((rk) this).field_E.b(param2, param0);
                    break L3;
                  }
                }
                L4: {
                  if (bea.field_d >= -((rk) this).field_A.field_m + var5_int) {
                    nm.a(((rk) this).field_E, (byte) 91);
                    var7 = ((rk) this).field_y + ((rk) this).field_m + -((rk) this).field_A.field_m;
                    L5: while (true) {
                      if (2 * ((rk) this).field_u >= var7) {
                        param1.b(-var7, 0);
                        param1.b(-var7 + ((rk) this).field_u * 2, 0);
                        ((rk) this).field_A.a(0, 0);
                        pfa.a(1);
                        ((rk) this).field_E.b(-((rk) this).field_A.field_m + var5_int, param0);
                        break L4;
                      } else {
                        var7 = var7 - 2 * ((rk) this).field_u;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param1.b(var6, param0);
                var6 = var6 + param1.field_m;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("rk.F(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static void b(int param0, boolean param1, int param2, int param3) {
        wj.a(param3, di.field_a, wg.field_i, 2, mna.field_d, param2, param1);
    }

    private rk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((rk) this).field_x = param6;
        ((rk) this).field_u = param4;
        ((rk) this).field_v = param7;
        ((rk) this).field_C = param5;
        ((rk) this).field_G = param8;
        ((rk) this).a((byte) -31, param2, param3, param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "You must be a member to play with the current options.";
    }
}
