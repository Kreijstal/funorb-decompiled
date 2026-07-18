/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends wj {
    private kv field_N;
    private kv field_H;
    static int field_E;
    static kv[] field_A;
    int field_M;
    private int field_y;
    private int field_L;
    static String field_K;
    static ee field_F;
    private int field_J;
    private int field_O;
    private int field_C;
    boolean field_P;
    private int field_G;
    private kv field_z;
    static int field_I;
    private kv[] field_D;

    de(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, (16711422 & param6) >> 1);
    }

    private final void a(int param0, int param1, int param2, kv param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var8 = BachelorFridge.field_y;
        try {
          L0: {
            var5_int = param1 + ((de) this).field_p;
            ah.a(-((de) this).field_N.field_q + var5_int, (byte) -99, param0, param1 + ((de) this).field_N.field_q, ((de) this).field_q + param0);
            var6 = param1 + -((de) this).field_C;
            L1: while (true) {
              if (var6 >= var5_int) {
                L2: {
                  db.b(74);
                  if (param1 + ((de) this).field_N.field_q >= dg.field_f) {
                    bu.a(0, ((de) this).field_H);
                    param3.e(-((de) this).field_C, 0);
                    param3.e(-((de) this).field_C + ((de) this).field_J * 2, 0);
                    ((de) this).field_z.a(0, 0);
                    db.b(121);
                    ((de) this).field_H.e(param1, param0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (dg.field_h >= var5_int - ((de) this).field_N.field_q) {
                    bu.a(0, ((de) this).field_H);
                    var7 = -((de) this).field_N.field_q + ((de) this).field_p + ((de) this).field_C;
                    L4: while (true) {
                      if (var7 <= ((de) this).field_J * 2) {
                        param3.e(-var7, 0);
                        param3.e(((de) this).field_J * 2 + -var7, 0);
                        ((de) this).field_N.a(0, 0);
                        db.b(109);
                        ((de) this).field_H.e(-((de) this).field_N.field_q + var5_int, param0);
                        break L3;
                      } else {
                        var7 = var7 - ((de) this).field_J * 2;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param3.e(var6, param0);
                var6 = var6 + param3.field_q;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("de.C(").append(param0).append(',').append(param1).append(',').append(2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        ((de) this).field_G = 8355711 & param1 >> 1;
        ((de) this).field_L = 8355711 & param2 >> 1;
        ((de) this).field_O = param1;
        ((de) this).field_y = param2;
        this.h(param0 ^ 1705304811);
        if (param0 != 1705304705) {
            int discarded$0 = de.d(49, -4, 45);
        }
    }

    public static void a(int param0) {
        field_K = null;
        field_F = null;
        field_A = null;
    }

    final void a(int param0, int param1, wj param2, int param3) {
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
              if (!((de) this).field_P) {
                break L1;
              } else {
                ((de) this).field_C = ((de) this).field_C + 1;
                if (2 * ((de) this).field_J >= ((de) this).field_C) {
                  break L1;
                } else {
                  ((de) this).field_C = ((de) this).field_C - 2 * ((de) this).field_J;
                  break L1;
                }
              }
            }
            L2: {
              if (param3 == 20) {
                break L2;
              } else {
                int discarded$2 = de.d(13, 12, 21);
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
            stackOut_6_1 = new StringBuilder().append("de.O(").append(param0).append(',').append(param1).append(',');
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
          throw pe.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param3 + ')');
        }
    }

    private final kv g(int param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = BachelorFridge.field_y;
        int var2 = ((de) this).field_q >> 1;
        kv var3 = new kv(var2, ((de) this).field_q);
        bu.a(0, var3);
        for (var4 = 0; ((de) this).field_q > var4; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (((de) this).field_q + -var4));
                var8 = 1;
                if (!(1.0 <= var6)) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(var6 * 255.0) : 255;
                }
                dg.a(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        db.b(121);
        return var3;
    }

    private final kv b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        kv var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var13 = BachelorFridge.field_y;
          var14 = new kv(2 * ((de) this).field_J, ((de) this).field_q);
          bu.a(0, var14);
          var5 = ((de) this).field_q >> 1;
          if (param2 <= -13) {
            break L0;
          } else {
            int discarded$1 = de.d(117, -107, -102);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (var6 >= ((de) this).field_q) {
            db.b(108);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> 1) * (-1 + ((de) this).field_J * 2) % (2 * ((de) this).field_J);
              var8 = 16711935 & param1;
              var9 = param1 & 65280;
              var10 = -var5 + var6;
              var11 = (int)(128.0 * (Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5)) + 128;
              if (var11 >= 256) {
                stackOut_6_0 = var9 | var8;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> 8;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_7_0;
              dg.e(var7, var6, ((de) this).field_J, var12);
              dg.e(var7 - ((de) this).field_J * 2, var6, ((de) this).field_J, var12);
              var8 = 16711935 & param0;
              var9 = 65280 & param0;
              if (var11 >= 256) {
                stackOut_9_0 = var8 | var9;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 8;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            var12 = stackIn_10_0;
            dg.e(((de) this).field_J + var7, var6, ((de) this).field_J, var12);
            dg.e(-((de) this).field_J + var7, var6, ((de) this).field_J, var12);
            var6++;
            continue L1;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.h(117);
    }

    private final void h(int param0) {
        ((de) this).field_D = new kv[]{this.b(((de) this).field_y, ((de) this).field_O, -47), this.b(((de) this).field_L, ((de) this).field_G, -126)};
        ((de) this).field_N = this.g(5);
        if (param0 <= 92) {
            int discarded$0 = de.d(84, 78, 72);
        }
        ((de) this).field_z = ((de) this).field_N.h();
        ((de) this).field_H = new kv(((de) this).field_q >> 1, ((de) this).field_q);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        int var5 = param3 - -((de) this).field_s;
        int var6 = ((de) this).field_v + param1;
        int var7 = 102 % ((-20 - param0) / 54);
        this.a(var6, var5, 2, ((de) this).field_D[0]);
        if (((de) this).field_M < 65536) {
            ah.a(var5 - -((de) this).field_p, (byte) 97, var6, var5 + (((de) this).field_p * ((de) this).field_M >> 16), ((de) this).field_q + var6);
            this.a(var6, var5, 2, ((de) this).field_D[1]);
            db.b(70);
        }
    }

    private de(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((de) this).field_L = param8;
        ((de) this).field_O = param5;
        ((de) this).field_J = param4;
        ((de) this).field_G = param7;
        ((de) this).field_y = param6;
        ((de) this).a(param0, param3, (byte) 59, param2, param1);
    }

    final static int d(int param0, int param1, int param2) {
        if (param1 != -257) {
            field_A = null;
        }
        if (param2 < 2) {
            if (param0 >= 5) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 555;
        field_K = "Friends";
    }
}
