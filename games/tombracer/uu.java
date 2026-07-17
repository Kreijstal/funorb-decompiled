/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu implements bo {
    static ht field_a;
    static int field_c;
    private int field_b;

    final static boolean a(boolean param0, int param1, int param2) {
        if (!param0) {
          field_c = 33;
          return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
        } else {
          return (ir.a(param1, param2, (byte) -80) | cga.a(param1, -54, param2) | er.c(param1, param2, 52)) & ss.a((byte) 61, param2, param1);
        }
    }

    final static void a(int param0, byte param1, byte[] param2, java.math.BigInteger param3, uia param4, java.math.BigInteger param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = mt.a(param0, 0);
              if (pb.field_n != null) {
                break L1;
              } else {
                pb.field_n = new java.security.SecureRandom();
                break L1;
              }
            }
            L2: {
              var15 = new int[4];
              var14 = var15;
              var13 = var14;
              var12 = var13;
              var8 = var12;
              if (param1 == -81) {
                break L2;
              } else {
                uu.a(25);
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (var9 >= 4) {
                L4: {
                  L5: {
                    if (null == hf.field_d) {
                      break L5;
                    } else {
                      if (hf.field_d.field_g.length >= var7_int) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  hf.field_d = new uia(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    hf.field_d.field_h = 0;
                    hf.field_d.a(0, param2, param0, 61);
                    hf.field_d.b(716148936, var7_int);
                    hf.field_d.a((byte) -48, var15);
                    if (ola.field_Bb == null) {
                      break L7;
                    } else {
                      if (100 <= ola.field_Bb.field_g.length) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ola.field_Bb = new uia(100);
                  break L6;
                }
                ola.field_Bb.field_h = 0;
                ola.field_Bb.i(10, param1 + 81);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (var11 >= 4) {
                    ola.field_Bb.f(-1477662136, param0);
                    ola.field_Bb.a(102, param3, param5);
                    param4.a(0, ola.field_Bb.field_g, ola.field_Bb.field_h, 96);
                    param4.a(0, hf.field_d.field_g, hf.field_d.field_h, param1 ^ -43);
                    break L0;
                  } else {
                    ola.field_Bb.a(var15[var11], (byte) 78);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = pb.field_n.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("uu.F(").append(param0).append(44).append(param1).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          L10: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          L11: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param4 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L11;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L11;
            }
          }
          L12: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param5 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L12;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L12;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 44 + 0 + 41);
        }
    }

    public final void a(kh param0, byte param1) {
        try {
            param0.h((byte) 122);
            if (param1 != -19) {
                ((uu) this).field_b = 121;
            }
            ((uu) this).field_b = param0.b((byte) 44, 2);
            param0.i((byte) 98);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uu.A(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1) {
        if (param0 <= 2) {
            return;
        }
        ((uu) this).field_b = param1;
    }

    final static boolean a(int param0, int param1, byte param2) {
        if (param2 >= -56) {
            return false;
        }
        return pca.b(param1, 113, param0) & ag.b(-1, param0, param1);
    }

    final static void b(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            if (param0 == 12475) {
              try {
                L0: {
                  Object discarded$1 = lb.a(-96, "resizing", di.a(111), new Object[1]);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L1: {
                  var2 = decompiledCaughtException;
                  break L1;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, kh param1) {
        try {
            if (param0 != 200) {
                Object var4 = null;
                ((uu) this).a((kh) null, (byte) 46);
            }
            param1.i(8);
            param1.a((byte) -125, ((uu) this).field_b, 2);
            param1.k(param0 ^ -1826190742);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "uu.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int[] param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 2507) {
                break L1;
              } else {
                field_c = -64;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (c.field_g.length <= var5_int) {
                break L0;
              } else {
                param3 = c.field_g[var5_int];
                var6 = var5_int << 4;
                L3: while (true) {
                  int incrementValue$12 = param3;
                  param3--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    var5_int++;
                    continue L2;
                  } else {
                    int incrementValue$13 = var6;
                    var6++;
                    param0 = aia.field_t[incrementValue$13];
                    param4[param2[param0]] = param4[param2[param0]] + 1;
                    aia.field_t[param4[param2[param0]]] = param0;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("uu.I(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(param3).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
    }
}
