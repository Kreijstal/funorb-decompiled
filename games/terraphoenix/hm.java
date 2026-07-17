/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends gl {
    private ci[] field_D;
    private int field_E;
    private int field_K;
    static String field_G;
    private int field_F;
    private int field_A;
    private int field_Q;
    static int field_L;
    static int field_N;
    private int field_B;
    static String field_H;
    private ci field_z;
    private ci field_C;
    int field_M;
    static String field_J;
    boolean field_P;
    private ci field_I;

    private final ci a() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = Terraphoenix.field_V;
        int var2 = ((hm) this).field_n >> 1;
        ci var3 = new ci(var2, ((hm) this).field_n);
        il.a(1, var3);
        for (var4 = 0; var4 < ((hm) this).field_n; var4++) {
            for (var5 = 0; var5 < var2; var5++) {
                var6 = (double)var5 * (double)var5 / (double)((((hm) this).field_n + -var4) * var4);
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = 1.0 > var6 ? (int)(255.0 * var6) : 255;
                }
                l.a(var5, var4, var8 << 16 | (var8 | var8 << 8));
            }
        }
        ij.a(false);
        return var3;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param2 != 0) {
            return;
        }
        int var5 = param0 - -((hm) this).field_w;
        int var6 = ((hm) this).field_u + param3;
        if (param1 > -106) {
            ci discarded$0 = this.b(-89, -2, 111);
        }
        this.a(((hm) this).field_D[0], var6, var5, -1);
        if (!(65536 <= ((hm) this).field_M)) {
            di.a(var5 - -((hm) this).field_p, var6, 16105, var6 - -((hm) this).field_n, (((hm) this).field_M * ((hm) this).field_p >> 16) + var5);
            this.a(((hm) this).field_D[1], var6, var5, -1);
            ij.a(false);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 65, param2, param3, param4);
        this.e((byte) 76);
        if (param1 < 45) {
            field_J = null;
        }
    }

    private final ci b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ci var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = Terraphoenix.field_V;
        var14 = new ci(2 * ((hm) this).field_K, ((hm) this).field_n);
        il.a(1, var14);
        var5 = ((hm) this).field_n >> 1;
        if (param1 == -27888) {
          var6 = 0;
          L0: while (true) {
            if (((hm) this).field_n <= var6) {
              ij.a(false);
              return var14;
            } else {
              L1: {
                var7 = (var6 >> 1) * (((hm) this).field_K * 2 + -1) % (((hm) this).field_K * 2);
                var8 = param0 & 16711935;
                var9 = param0 & 65280;
                var10 = var6 - var5;
                var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
                if (256 > var11) {
                  stackOut_6_0 = (-16711936 & var11 * var8 | 16711680 & var9 * var11) >>> 8;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = var9 | var8;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                l.d(var7, var6, ((hm) this).field_K, var12);
                var8 = 16711935 & param2;
                l.d(-(2 * ((hm) this).field_K) + var7, var6, ((hm) this).field_K, var12);
                var9 = param2 & 65280;
                if (var11 >= 256) {
                  stackOut_9_0 = var8 | var9;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = (var8 * var11 & -16711936 | var9 * var11 & 16711680) >>> 8;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              l.d(((hm) this).field_K + var7, var6, ((hm) this).field_K, var12);
              l.d(var7 + -((hm) this).field_K, var6, ((hm) this).field_K, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    private final void a(ci param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
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
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (param3 == -1) {
                break L1;
              } else {
                var9 = null;
                ((hm) this).a((gl) null, 26, 3, -111);
                break L1;
              }
            }
            var5_int = ((hm) this).field_p + param2;
            di.a(-((hm) this).field_C.field_r + var5_int, param1, 16105, param1 + ((hm) this).field_n, ((hm) this).field_C.field_r + param2);
            var6 = -((hm) this).field_A + param2;
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  ij.a(false);
                  if (l.field_b > param2 - -((hm) this).field_C.field_r) {
                    break L3;
                  } else {
                    il.a(1, ((hm) this).field_I);
                    param0.b(-((hm) this).field_A, 0);
                    param0.b(2 * ((hm) this).field_K + -((hm) this).field_A, 0);
                    ((hm) this).field_z.e(0, 0);
                    ij.a(false);
                    ((hm) this).field_I.b(param2, param1);
                    break L3;
                  }
                }
                L4: {
                  if (l.field_f < -((hm) this).field_C.field_r + var5_int) {
                    break L4;
                  } else {
                    il.a(1, ((hm) this).field_I);
                    var7 = -((hm) this).field_C.field_r + (((hm) this).field_p - -((hm) this).field_A);
                    L5: while (true) {
                      if (2 * ((hm) this).field_K >= var7) {
                        param0.b(-var7, 0);
                        param0.b(-var7 + ((hm) this).field_K * 2, 0);
                        ((hm) this).field_C.e(0, 0);
                        ij.a(false);
                        ((hm) this).field_I.b(-((hm) this).field_C.field_r + var5_int, param1);
                        break L4;
                      } else {
                        var7 = var7 - 2 * ((hm) this).field_K;
                        continue L5;
                      }
                    }
                  }
                }
                break L0;
              } else {
                param0.b(var6, param1);
                var6 = var6 + param0.field_r;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("hm.RA(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static String a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_27_0 = null;
        String stackIn_29_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_28_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1 != null) {
              var2_int = 0;
              var3 = param1.length();
              L1: while (true) {
                L2: {
                  if (var2_int >= var3) {
                    break L2;
                  } else {
                    if (!ad.a((byte) 114, param1.charAt(var2_int))) {
                      break L2;
                    } else {
                      var2_int++;
                      continue L1;
                    }
                  }
                }
                L3: while (true) {
                  L4: {
                    if (var3 <= var2_int) {
                      break L4;
                    } else {
                      if (!ad.a((byte) 110, param1.charAt(-1 + var3))) {
                        break L4;
                      } else {
                        var3--;
                        continue L3;
                      }
                    }
                  }
                  var5 = 33 / ((-61 - param0) / 40);
                  var4 = -var2_int + var3;
                  if (var4 >= 1) {
                    if (var4 <= 12) {
                      var6 = new StringBuilder(var4);
                      var7 = var2_int;
                      L5: while (true) {
                        if (var3 <= var7) {
                          if (0 != var6.length()) {
                            stackOut_28_0 = var6.toString();
                            stackIn_29_0 = stackOut_28_0;
                            break L0;
                          } else {
                            stackOut_26_0 = null;
                            stackIn_27_0 = stackOut_26_0;
                            return (String) (Object) stackIn_27_0;
                          }
                        } else {
                          L6: {
                            var8 = param1.charAt(var7);
                            int discarded$2 = 106;
                            if (ja.a((char) var8)) {
                              var9 = kh.a((char) var8, (byte) -128);
                              if (0 != var9) {
                                StringBuilder discarded$3 = var6.append(var9);
                                break L6;
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                          var7++;
                          continue L5;
                        }
                      }
                    } else {
                      stackOut_15_0 = null;
                      stackIn_16_0 = stackOut_15_0;
                      return (String) (Object) stackIn_16_0;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (String) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var2;
            stackOut_30_1 = new StringBuilder().append("hm.QA(").append(param0).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
        return stackIn_29_0;
    }

    final void a(int param0, int param1, int param2) {
        ((hm) this).field_Q = param0;
        ((hm) this).field_B = param2;
        if (param1 != -7062047) {
            Object var5 = null;
            this.a((ci) null, 79, -24, 37);
        }
        ((hm) this).field_E = 8355711 & param0 >> 1;
        ((hm) this).field_F = param2 >> 1 & 8355711;
        this.e((byte) -43);
    }

    public static void b() {
        field_G = null;
        field_J = null;
        field_H = null;
    }

    final void a(gl param0, int param1, int param2, int param3) {
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
              if (param3 >= 25) {
                break L1;
              } else {
                ((hm) this).field_M = 79;
                break L1;
              }
            }
            L2: {
              if (!((hm) this).field_P) {
                break L2;
              } else {
                ((hm) this).field_A = ((hm) this).field_A + 1;
                if (((hm) this).field_A <= ((hm) this).field_K * 2) {
                  break L2;
                } else {
                  ((hm) this).field_A = ((hm) this).field_A - 2 * ((hm) this).field_K;
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
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("hm.B(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
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
          throw qk.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void e(byte param0) {
        ((hm) this).field_D = new ci[]{this.b(((hm) this).field_B, -27888, ((hm) this).field_Q), this.b(((hm) this).field_F, -27888, ((hm) this).field_E)};
        int var2 = -120 % ((12 - param0) / 40);
        int discarded$0 = 0;
        ((hm) this).field_C = this.a();
        ((hm) this).field_z = ((hm) this).field_C.e();
        ((hm) this).field_I = new ci(((hm) this).field_n >> 1, ((hm) this).field_n);
    }

    hm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, (param6 & 16711422) >> 1);
    }

    private hm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((hm) this).field_B = param5;
        ((hm) this).field_F = param7;
        ((hm) this).field_K = param4;
        ((hm) this).field_E = param8;
        ((hm) this).field_Q = param6;
        ((hm) this).a(param1, (byte) 113, param2, param0, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "    Your soldier";
        field_G = "Left click to throw grenade";
        field_J = "SUCCESS";
    }
}
