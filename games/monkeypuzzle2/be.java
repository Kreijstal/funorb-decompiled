/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class be {
    static double field_b;
    int[] field_c;
    int field_f;
    int field_a;
    static String field_d;
    static String field_e;

    final int a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == -1) {
          L0: {
            L1: {
              if (((be) this).field_c == null) {
                break L1;
              } else {
                if (0 != ((be) this).field_c.length) {
                  stackOut_6_0 = ((be) this).field_c[((be) this).field_c.length + -1];
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0;
        } else {
          return 65;
        }
    }

    final static void b() {
        if (gj.field_a != null) {
            if (!(gj.field_a.h())) {
                return;
            }
        }
        int discarded$0 = 96;
        int discarded$1 = 100;
        gj.field_a = li.a(ke.field_h[5]);
        int var1 = -39;
        na.a((byte) 125, gj.field_a);
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (null == ((be) this).field_c) {
            break L0;
          } else {
            if (((be) this).field_c.length == 0) {
              break L0;
            } else {
              var3 = 1;
              L1: while (true) {
                if (((be) this).field_c.length <= var3) {
                  L2: {
                    if (param0 == 0) {
                      break L2;
                    } else {
                      var5 = null;
                      String discarded$2 = be.a((byte[]) null, (byte) 88);
                      break L2;
                    }
                  }
                  return ((be) this).field_c.length + -1;
                } else {
                  if (((be) this).field_c[var3 + -1] + ((be) this).field_c[var3] >> 1 > param1) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        return 0;
    }

    public static void a() {
        field_d = null;
        field_e = null;
    }

    final static void a(gk param0, java.math.BigInteger param1, int param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
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
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = vb.a(105, param4);
              if (pb.field_b != null) {
                break L1;
              } else {
                pb.field_b = new java.security.SecureRandom();
                break L1;
              }
            }
            var16 = new int[4];
            var15 = var16;
            var14 = var15;
            var13 = var14;
            var8 = var13;
            var9 = 0;
            L2: while (true) {
              if (4 <= var9) {
                L3: {
                  L4: {
                    if (jk.field_z == null) {
                      break L4;
                    } else {
                      if (var7_int > jk.field_z.field_g.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  jk.field_z = new gk(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    jk.field_z.field_h = 0;
                    jk.field_z.b(param6, param4, -2, param3);
                    jk.field_z.a(true, var7_int);
                    jk.field_z.a(30350, var16);
                    if (null == MonkeyPuzzle2.field_A) {
                      break L6;
                    } else {
                      if (MonkeyPuzzle2.field_A.field_g.length < 100) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  MonkeyPuzzle2.field_A = new gk(100);
                  break L5;
                }
                MonkeyPuzzle2.field_A.field_h = 0;
                MonkeyPuzzle2.field_A.b(10, -49152);
                var12 = 0;
                var9 = var12;
                L7: while (true) {
                  if (var12 >= 4) {
                    L8: {
                      if (param2 < -76) {
                        break L8;
                      } else {
                        var11 = null;
                        be.a((gk) null, (java.math.BigInteger) null, 116, -40, -47, (java.math.BigInteger) null, (byte[]) null);
                        break L8;
                      }
                    }
                    MonkeyPuzzle2.field_A.c(param4, 83);
                    MonkeyPuzzle2.field_A.a((byte) -127, param1, param5);
                    param0.b(MonkeyPuzzle2.field_A.field_g, MonkeyPuzzle2.field_A.field_h, -2, 0);
                    param0.b(jk.field_z.field_g, jk.field_z.field_h, -2, 0);
                    break L0;
                  } else {
                    MonkeyPuzzle2.field_A.a(-803539344, var16[var12]);
                    var12++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = pb.field_b.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var7;
            stackOut_21_1 = new StringBuilder().append("be.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
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
            if (param1 == null) {
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
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param5 == null) {
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
            if (param6 == null) {
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
          throw la.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    final static String a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -122 % ((18 - param1) / 45);
            stackOut_0_0 = sc.a(param0, param0.length, 94, 0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("be.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final static ad a(boolean param0, boolean param1, int param2) {
        if (param2 != 13271) {
            Object var6 = null;
            be.a((gk) null, (java.math.BigInteger) null, -19, 70, -21, (java.math.BigInteger) null, (byte[]) null);
        }
        int discarded$0 = 50;
        return em.a(false, 6, false, true, 0);
    }

    be(int param0, int param1, int param2) {
        ((be) this).field_a = param0;
        ((be) this).field_c = new int[1 + param2];
        ((be) this).field_f = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = Math.atan2(0.0, 1.0);
        field_e = "Email (Login):";
    }
}
