/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    static int field_b;
    private la field_c;
    static String field_a;

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hr var11 = null;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var7 = 131072;
        for (var8 = param4; 1 > var8; var8++) {
            var9 = param2 / 8 + (-(var7 / 2) + this.a((byte) -33, var7));
            var10 = -(var7 / 2) + (this.a((byte) -33, var7) + param5 / 8);
            var11 = ((dj) this).field_c.a(param1, param0, (byte) 100, param3);
            var11.a(false, 32, 10, 16, 20 + this.a((byte) -33, 15));
            var11.a(var10, -var10 / 64, var9, -var9 / 64, 131072, -8192, (byte) -20);
            var11.a(this.a((byte) -33, 2048), this.a((byte) -33, 32) + -16, -77);
        }
    }

    final void a(pc param0, gma param1, byte param2) {
        try {
            if (param2 >= -99) {
                Object var5 = null;
                ((dj) this).a((byte) 23, (pc) null, (up) null);
            }
            ((dj) this).a(param0.field_a, (byte) -101, param0.field_j, param0.field_i, 1, qva.a((byte) -120, -param0.field_k + param0.field_f, param0.field_c - param0.field_d) - 4096, 8, 393216, param0.field_e, 4, 8);
            ((dj) this).a(param0.field_a, (byte) -110, param0.field_j, param0.field_i, 1, 0, 5, 0, param0.field_e, 6, 12);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dj.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final int a(byte param0, int param1) {
        return uca.field_c.a(param1, 0);
    }

    public static void a(int param0) {
        field_a = null;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        int var16 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var17 = 0;
        int var18 = 0;
        hr var15 = null;
        int var19 = TombRacer.field_G ? 1 : 0;
        if (param1 >= -63) {
            return;
        }
        for (var16 = 0; var16 < param4; var16++) {
            var12 = param5 - 512 - -this.a((byte) -33, 1024);
            var13 = hua.a((byte) 125, var12 >> 2);
            var14 = bua.a(0, var12 >> 2);
            var17 = gqa.a(var13, (byte) 24, param7);
            var18 = gqa.a(var14, (byte) 24, param7);
            var15 = ((dj) this).field_c.a(param8, param0, (byte) 100, param3);
            var15.a(false, param9, param2, param10, param6);
            var15.a(var18, -var18 / 32, var17, -var17 / 32, 0, 0, (byte) -20);
            var15.a(this.a((byte) -33, 2048), this.a((byte) -33, 128) - 64, -125);
        }
    }

    final void a(byte param0, pc param1, up param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        hr var15 = null;
        int var16 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = -param1.field_d + param1.field_e;
              var5 = -param1.field_k + param1.field_a;
              if (0 != var4_int) {
                break L1;
              } else {
                if (0 == var5) {
                  return;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var6 = qva.a((byte) -26, var5, var4_int);
              var7 = 8;
              var8 = var7 * hua.a((byte) 112, var6 >> 2);
              var9 = bua.a(0, var6 >> 2) * var7;
              var10 = 0;
              if (ua.a(var4_int, -124) > ua.a(var5, -127)) {
                if (var8 == 0) {
                  break L2;
                } else {
                  var10 = var4_int / var8;
                  break L2;
                }
              } else {
                if (var9 == 0) {
                  break L2;
                } else {
                  var10 = var5 / var9;
                  break L2;
                }
              }
            }
            var11 = 4;
            var12 = param1.field_d;
            if (param0 >= 117) {
              var13 = param1.field_k;
              var14 = 0;
              L3: while (true) {
                L4: {
                  if (var10 <= var14) {
                    break L4;
                  } else {
                    var15 = ((dj) this).field_c.a(var12, var13, (byte) 100, param1.field_i);
                    var15.a(false, 12, param1.field_j, 6, var11);
                    var13 = var13 + var9;
                    var12 = var12 + var8;
                    var15.a(-121, var6);
                    if (var12 < 0) {
                      break L4;
                    } else {
                      if (var13 < 0) {
                        break L4;
                      } else {
                        if (~var12 < ~((dj) this).field_c.m((byte) -86)) {
                          break L4;
                        } else {
                          if (var13 <= ((dj) this).field_c.s(-127)) {
                            var14++;
                            continue L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                L5: {
                  if (param1.field_h == null) {
                    break L5;
                  } else {
                    ((dj) this).a((byte) 118, param1.field_h, param2);
                    break L5;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("dj.H(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L6;
            }
          }
          L7: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        hr var11 = null;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var7 = 131072;
        for (var8 = param4; var8 < 5; var8++) {
            var9 = param3 / 8 - var7 / 2 - -this.a((byte) -33, var7);
            var10 = param0 / 8 + (-(var7 / 2) + this.a((byte) -33, var7));
            var11 = ((dj) this).field_c.a(param5, param1, (byte) 100, param2);
            var11.a(false, 64, 11, 16, this.a((byte) -33, 15) + 20);
            var11.a(var10, -var10 / 64, var9, -var9 / 64, 0, 0, (byte) -20);
            var11.a(this.a((byte) -33, 2048), -8 + this.a((byte) -33, 16), -112);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        hr var9 = null;
        int var10 = TombRacer.field_G ? 1 : 0;
        int var5 = 262144;
        for (var6 = 0; var6 < 4 - -uca.field_c.a(4, param2 ^ 46); var6++) {
            var7 = -(var5 / 2) + this.a((byte) -33, var5);
            var8 = this.a((byte) -33, var5) - var5 / 2;
            var9 = ((dj) this).field_c.a(param3, param0, (byte) 100, param1);
            var9.a(false, 16, 14, 16, 25 + uca.field_c.a(25, param2 ^ 46));
            var9.a(var8, -var8 / 64, var7, -var7 / 64, 131072 + uca.field_c.a(131072, 0), -8192, (byte) -20);
            var9.a(this.a((byte) -33, 2048), this.a((byte) -33, 32) + -16, -110);
        }
        if (param2 != 46) {
            ((dj) this).field_c = null;
        }
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        hr var11 = null;
        int var12 = TombRacer.field_G ? 1 : 0;
        int var7 = 262144;
        int var8 = 0;
        if (param1 <= 78) {
            return;
        }
        while (var8 < 3) {
            var9 = -(var7 / 2) + this.a((byte) -33, var7) + param4;
            var10 = param2 - var7 / 2 - -this.a((byte) -33, var7);
            var11 = ((dj) this).field_c.a(param0, param5, (byte) 100, param3);
            var11.a(false, 32, 2, 16, this.a((byte) -33, 4) + 8);
            var11.b(98, var10, var9);
            var11.a(this.a((byte) -33, 2048), -64 + this.a((byte) -33, 128), -113);
            var8++;
        }
    }

    dj(la param0) {
        try {
            ((dj) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "dj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hr var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = TombRacer.field_G ? 1 : 0;
        int var5 = 262144;
        int var6 = 0;
        if (param3 > -2) {
            field_b = 105;
        }
        while (var6 < 8) {
            var7 = this.a((byte) -33, 8192);
            var8 = hua.a((byte) 102, var7 >> 2);
            var9 = bua.a(0, var7 >> 2);
            var10 = ((dj) this).field_c.a(param1, param0, (byte) 100, param2);
            var11 = var5 + this.a((byte) -33, var5);
            var12 = gqa.a(var8, (byte) 24, var11);
            var13 = gqa.a(var9, (byte) 24, var11);
            var10.a(false, 2, 13, 16, 10);
            var10.b(70, var13, var12);
            var6++;
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hr var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 29) {
            return;
        }
        int var5 = 262144;
        for (var6 = 0; var6 < 8; var6++) {
            var7 = this.a((byte) -33, 8192);
            var8 = hua.a((byte) 126, var7 >> 2);
            var9 = bua.a(0, var7 >> 2);
            var10 = ((dj) this).field_c.a(param2, param3, (byte) 100, param1);
            var11 = this.a((byte) -33, var5) + var5;
            var12 = gqa.a(var8, (byte) 24, var11);
            var13 = gqa.a(var9, (byte) 24, var11);
            var10.a(false, 2, 4, 16, 10);
            var10.b(50, var13, var12);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hr var10 = null;
        int var11 = 0;
        int var12 = TombRacer.field_G ? 1 : 0;
        if (param0 < 47) {
            ((dj) this).field_c = null;
        }
        for (var6 = 0; 5 > var6; var6++) {
            var7 = -256 + (this.a((byte) -33, 512) + param4);
            var8 = hua.a((byte) 124, var7 >> 2);
            var9 = bua.a(0, var7 >> 2);
            var10 = ((dj) this).field_c.a(param3, param2, (byte) 100, param1);
            var11 = 262144 - -this.a((byte) -33, 262144);
            var10.a(false, 2, 4, 16, 10);
            var10.b(69, gqa.a(var9, (byte) 24, var11), gqa.a(var8, (byte) 24, var11));
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Add name";
    }
}
