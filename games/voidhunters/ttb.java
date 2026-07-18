/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ttb extends shb {
    private phb field_F;
    private int field_t;
    private int field_E;
    private phb[] field_C;
    private int field_A;
    private phb field_u;
    private int field_H;
    boolean field_x;
    private phb field_y;
    private int field_G;
    int field_v;
    static char field_B;
    static String field_z;
    private int field_w;

    private final phb a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        phb var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = VoidHunters.field_G;
        var14 = new phb(((ttb) this).field_E * 2, ((ttb) this).field_f);
        de.a(105, var14);
        var5 = ((ttb) this).field_f >> 1;
        var6 = 0;
        L0: while (true) {
          if (((ttb) this).field_f <= var6) {
            bia.a((byte) 124);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (2 * ((ttb) this).field_E - 1) % (((ttb) this).field_E * 2);
              var8 = param1 & 16711935;
              var9 = 65280 & param1;
              var10 = var6 + -var5;
              var11 = (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0) + 128;
              if (var11 >= 256) {
                stackOut_4_0 = var9 | var8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = (var8 * var11 & -16711936 | 16711680 & var9 * var11) >>> 8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              dma.h(var7, var6, ((ttb) this).field_E, var12);
              dma.h(var7 + -(2 * ((ttb) this).field_E), var6, ((ttb) this).field_E, var12);
              var8 = 16711935 & param2;
              var9 = param2 & 65280;
              if (256 > var11) {
                stackOut_7_0 = (16711680 & var9 * var11 | var8 * var11 & -16711936) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            dma.h(((ttb) this).field_E + var7, var6, ((ttb) this).field_E, var12);
            dma.h(-((ttb) this).field_E + var7, var6, ((ttb) this).field_E, var12);
            var6++;
            continue L0;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        ((ttb) this).field_G = 8355711 & param0 >> 1;
        ((ttb) this).field_H = param0;
        ((ttb) this).field_t = param2;
        ((ttb) this).field_A = param2 >> 1 & 8355711;
        if (param1 != -21202) {
            ttb.d(87);
        }
        this.a(107);
    }

    final void a(int param0, int param1, int param2, shb param3) {
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
              if (!((ttb) this).field_x) {
                break L1;
              } else {
                ((ttb) this).field_w = ((ttb) this).field_w + 1;
                if (((ttb) this).field_E * 2 >= ((ttb) this).field_w) {
                  break L1;
                } else {
                  ((ttb) this).field_w = ((ttb) this).field_w - ((ttb) this).field_E * 2;
                  break L1;
                }
              }
            }
            L2: {
              if (param2 == -981) {
                break L2;
              } else {
                ttb.d(-78);
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
            stackOut_6_1 = new StringBuilder().append("ttb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw rta.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final phb b() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = VoidHunters.field_G;
        int var2 = ((ttb) this).field_f >> 1;
        phb var3 = new phb(var2, ((ttb) this).field_f);
        de.a(78, var3);
        for (var4 = 0; ((ttb) this).field_f > var4; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((ttb) this).field_f - var4));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 >= 1.0 ? 255 : (int)(255.0 * var6);
                }
                dma.a(var5, var4, var8 << 16 | (var8 << 8 | var8));
            }
        }
        bia.a((byte) 124);
        return var3;
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        if (param2 < 47) {
            ((ttb) this).a(48, -94, 68, 84, -83);
        }
        int var5 = param0 - -((ttb) this).field_g;
        int var6 = ((ttb) this).field_r + param3;
        this.a(2, var6, ((ttb) this).field_C[0], var5);
        if (!(((ttb) this).field_v >= 65536)) {
            qca.a(((ttb) this).field_h + var5, ((ttb) this).field_f + var6, var5 - -(((ttb) this).field_h * ((ttb) this).field_v >> 16), true, var6);
            this.a(2, var6, ((ttb) this).field_C[1], var5);
            bia.a((byte) 124);
        }
    }

    public static void d(int param0) {
        if (param0 != 16711935) {
            ttb.d(-30);
        }
        field_z = null;
    }

    private final void a(int param0) {
        if (param0 < 59) {
            return;
        }
        ((ttb) this).field_C = new phb[]{this.a(true, ((ttb) this).field_H, ((ttb) this).field_t), this.a(true, ((ttb) this).field_G, ((ttb) this).field_A)};
        int discarded$0 = 0;
        ((ttb) this).field_y = this.b();
        ((ttb) this).field_u = ((ttb) this).field_y.a();
        ((ttb) this).field_F = new phb(((ttb) this).field_f >> 1, ((ttb) this).field_f);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.a(param3 ^ 125);
    }

    private ttb(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ttb) this).field_t = param6;
        ((ttb) this).field_A = param8;
        ((ttb) this).field_H = param5;
        ((ttb) this).field_E = param4;
        ((ttb) this).field_G = param7;
        ((ttb) this).a(param0, param2, param3, 1, param1);
    }

    private final void a(int param0, int param1, phb param2, int param3) {
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
        var8 = VoidHunters.field_G;
        try {
          L0: {
            var5_int = ((ttb) this).field_h + param3;
            qca.a(var5_int - ((ttb) this).field_y.field_q, ((ttb) this).field_f + param1, param3 + ((ttb) this).field_y.field_q, true, param1);
            var6 = param3 - ((ttb) this).field_w;
            L1: while (true) {
              if (var5_int <= var6) {
                L2: {
                  bia.a((byte) 124);
                  if (param3 - -((ttb) this).field_y.field_q < dma.field_d) {
                    break L2;
                  } else {
                    de.a(64, ((ttb) this).field_F);
                    param2.a(-((ttb) this).field_w, 0);
                    param2.a(((ttb) this).field_E * 2 - ((ttb) this).field_w, 0);
                    ((ttb) this).field_u.b(0, 0);
                    bia.a((byte) 124);
                    ((ttb) this).field_F.a(param3, param1);
                    break L2;
                  }
                }
                L3: {
                  if (dma.field_a < var5_int + -((ttb) this).field_y.field_q) {
                    break L3;
                  } else {
                    de.a(24, ((ttb) this).field_F);
                    var7 = ((ttb) this).field_h - ((ttb) this).field_y.field_q - -((ttb) this).field_w;
                    L4: while (true) {
                      if (var7 <= 2 * ((ttb) this).field_E) {
                        param2.a(-var7, 0);
                        param2.a(((ttb) this).field_E * 2 + -var7, 0);
                        ((ttb) this).field_y.b(0, 0);
                        bia.a((byte) 124);
                        ((ttb) this).field_F.a(-((ttb) this).field_y.field_q + var5_int, param1);
                        break L3;
                      } else {
                        var7 = var7 - ((ttb) this).field_E * 2;
                        continue L4;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param2.a(var6, param1);
                var6 = var6 + param2.field_q;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("ttb.DA(").append(2).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param3 + ')');
        }
    }

    ttb(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, 8355711 & param6 >> 1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = '/';
        field_z = "Loading instruments";
    }
}
