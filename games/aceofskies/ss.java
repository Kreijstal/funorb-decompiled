/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ss extends ea {
    private int field_y;
    private ll field_A;
    private int field_B;
    private int field_x;
    private ll field_D;
    private int field_s;
    private ll field_C;
    int field_z;
    private int field_v;
    private int field_r;
    private ll[] field_w;
    boolean field_u;
    static boolean field_t;

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 <= 122) {
            return;
        }
        super.a(param0, param1, param2, param3, (byte) 124);
        this.a(-104);
    }

    private final ll b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ll var13 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = new ll(((ss) this).field_y * 2, ((ss) this).field_n);
        cm.a(var13, -14492);
        var5 = ((ss) this).field_n >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((ss) this).field_n) {
            L1: {
              if (param1 == 128) {
                break L1;
              } else {
                ((ss) this).a(90, 49, (byte) 110);
                break L1;
              }
            }
            sl.c(2765);
            return var13;
          } else {
            L2: {
              var7 = (var6 >> 1) * (2 * ((ss) this).field_y + -1) % (((ss) this).field_y * 2);
              var8 = 16711935 & param0;
              var9 = param0 & 65280;
              var10 = -var5 + var6;
              var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 + -(var10 * var10))) / (double)var5));
              if (var11 < 256) {
                stackOut_4_0 = (-16711936 & var11 * var8 | var9 * var11 & 16711680) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = var8 | var9;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_5_0;
              vp.b(var7, var6, ((ss) this).field_y, var12);
              var9 = param2 & 65280;
              var8 = 16711935 & param2;
              vp.b(-(2 * ((ss) this).field_y) + var7, var6, ((ss) this).field_y, var12);
              if (var11 < 256) {
                stackOut_7_0 = (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L3;
              } else {
                stackOut_6_0 = var9 | var8;
                stackIn_8_0 = stackOut_6_0;
                break L3;
              }
            }
            var12 = stackIn_8_0;
            vp.b(((ss) this).field_y + var7, var6, ((ss) this).field_y, var12);
            vp.b(-((ss) this).field_y + var7, var6, ((ss) this).field_y, var12);
            var6++;
            continue L0;
          }
        }
    }

    private final void a(int param0) {
        ((ss) this).field_w = new ll[]{this.b(((ss) this).field_v, 128, ((ss) this).field_B), this.b(((ss) this).field_x, 128, ((ss) this).field_s)};
        int var2 = 64 % ((param0 - -63) / 35);
        ((ss) this).field_D = this.b(true);
        ((ss) this).field_C = ((ss) this).field_D.a();
        ((ss) this).field_A = new ll(((ss) this).field_n >> 1, ((ss) this).field_n);
    }

    ss(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return;
        }
        int var5 = param3 + ((ss) this).field_p;
        int var6 = ((ss) this).field_h + param2;
        this.a(var5, 118, var6, ((ss) this).field_w[0]);
        if (param0 < 64) {
            ((ss) this).field_B = -13;
        }
        if (!(((ss) this).field_z >= 65536)) {
            fp.a((byte) 77, var6, var6 + ((ss) this).field_n, ((ss) this).field_q + var5, (((ss) this).field_q * ((ss) this).field_z >> 16) + var5);
            this.a(var5, -101, var6, ((ss) this).field_w[1]);
            sl.c(2765);
        }
    }

    final void a(int param0, int param1, byte param2) {
        ((ss) this).field_x = (16711422 & param1) >> 1;
        ((ss) this).field_B = param0;
        int var4 = -88 % ((-6 - param2) / 58);
        ((ss) this).field_v = param1;
        ((ss) this).field_s = (param0 & 16711422) >> 1;
        this.a(-116);
    }

    private final ll b(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var2 = ((ss) this).field_n >> 1;
        ll var3 = new ll(var2, ((ss) this).field_n);
        cm.a(var3, -14492);
        for (var4 = 0; var4 < ((ss) this).field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((-var4 + ((ss) this).field_n) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 <= var6 ? 255 : (int)(255.0 * var6);
                }
                vp.a(var5, var4, var8 | var8 << 8 | var8 << 16);
            }
        }
        sl.c(2765);
        return var3;
    }

    final void a(byte param0, ea param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (((ss) this).field_u) {
                ((ss) this).field_r = ((ss) this).field_r + 1;
                if (2 * ((ss) this).field_y < ((ss) this).field_r) {
                  ((ss) this).field_r = ((ss) this).field_r - ((ss) this).field_y * 2;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 > 13) {
                break L2;
              } else {
                ((ss) this).field_z = 30;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ss.S(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, int param1, int param2, ll param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = ((ss) this).field_q + param0;
            fp.a((byte) 44, param2, param2 - -((ss) this).field_n, -((ss) this).field_D.field_r + var5_int, param0 + ((ss) this).field_D.field_r);
            var6 = -13 / ((-39 - param1) / 58);
            var7 = -((ss) this).field_r + param0;
            L1: while (true) {
              if (var5_int <= var7) {
                L2: {
                  sl.c(2765);
                  if (((ss) this).field_D.field_r + param0 >= vp.field_b) {
                    cm.a(((ss) this).field_A, -14492);
                    param3.b(-((ss) this).field_r, 0);
                    param3.b(2 * ((ss) this).field_y - ((ss) this).field_r, 0);
                    ((ss) this).field_C.a(0, 0);
                    sl.c(2765);
                    ((ss) this).field_A.b(param0, param2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (vp.field_k >= var5_int - ((ss) this).field_D.field_r) {
                    cm.a(((ss) this).field_A, -14492);
                    var8 = ((ss) this).field_r + ((ss) this).field_q + -((ss) this).field_D.field_r;
                    L4: while (true) {
                      if (2 * ((ss) this).field_y >= var8) {
                        param3.b(-var8, 0);
                        param3.b(((ss) this).field_y * 2 - var8, 0);
                        ((ss) this).field_D.a(0, 0);
                        sl.c(2765);
                        ((ss) this).field_A.b(var5_int - ((ss) this).field_D.field_r, param2);
                        break L3;
                      } else {
                        var8 = var8 - 2 * ((ss) this).field_y;
                        continue L4;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                param3.b(var7, param2);
                var7 = var7 + param3.field_r;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("ss.AA(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    private ss(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ss) this).field_s = param8;
        ((ss) this).field_y = param4;
        ((ss) this).field_B = param6;
        ((ss) this).field_v = param5;
        ((ss) this).field_x = param7;
        ((ss) this).a(param3, param0, param1, param2, (byte) 127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = false;
    }
}
