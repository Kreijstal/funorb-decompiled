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
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -1) {
          if (this.field_c != null) {
            if (0 == this.field_c.length) {
              return 0;
            } else {
              return this.field_c[this.field_c.length + -1];
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0;
          }
        } else {
          return 65;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        if (gj.field_a != null) {
          if (gj.field_a.h()) {
            gj.field_a = li.a(ke.field_h[5], 100, 96);
            var1 = 39 / ((param0 - -87) / 39);
            na.a((byte) 125, gj.field_a);
            return;
          } else {
            return;
          }
        } else {
          gj.field_a = li.a(ke.field_h[5], 100, 96);
          var1 = 39 / ((param0 - -87) / 39);
          na.a((byte) 125, gj.field_a);
          return;
        }
    }

    final int a(int param0, int param1) {
        String discarded$2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != this.field_c) {
          if (-1 != (this.field_c.length ^ -1)) {
            var3 = 1;
            L0: while (true) {
              if (this.field_c.length <= var3) {
                if (param0 != 0) {
                  var5 = (byte[]) null;
                  discarded$2 = be.a((byte[]) null, (byte) 88);
                  return this.field_c.length + -1;
                } else {
                  return this.field_c.length + -1;
                }
              } else {
                stackOut_8_0 = this.field_c[var3 + -1] + this.field_c[var3] >> -177902559;
                stackOut_8_1 = param1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (var4 == 0) {
                  if (stackIn_10_0 > stackIn_10_1) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return stackIn_9_0 + stackIn_9_1;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_d = null;
        field_e = null;
    }

    final static void a(gk param0, java.math.BigInteger param1, int param2, int param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
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
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (4 <= var9) {
                      break L5;
                    } else {
                      var8[var9] = pb.field_b.nextInt();
                      var9++;
                      if (var10 != 0) {
                        break L4;
                      } else {
                        if (var10 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
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
              L6: {
                L7: {
                  jk.field_z.field_h = 0;
                  jk.field_z.b(param6, param4, -2, param3);
                  jk.field_z.a(true, var7_int);
                  jk.field_z.a(30350, var13);
                  if (null == MonkeyPuzzle2.field_A) {
                    break L7;
                  } else {
                    if (MonkeyPuzzle2.field_A.field_g.length < 100) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                MonkeyPuzzle2.field_A = new gk(100);
                break L6;
              }
              MonkeyPuzzle2.field_A.field_h = 0;
              MonkeyPuzzle2.field_A.b(10, -49152);
              var9 = 0;
              L8: while (true) {
                L9: {
                  L10: {
                    if ((var9 ^ -1) <= -5) {
                      break L10;
                    } else {
                      MonkeyPuzzle2.field_A.a(-803539344, var13[var9]);
                      var9++;
                      if (var10 != 0) {
                        break L9;
                      } else {
                        if (var10 == 0) {
                          continue L8;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  L11: {
                    if (param2 < -76) {
                      break L11;
                    } else {
                      var11 = (byte[]) null;
                      be.a((gk) null, (java.math.BigInteger) null, 116, -40, -47, (java.math.BigInteger) null, (byte[]) null);
                      break L11;
                    }
                  }
                  MonkeyPuzzle2.field_A.c(param4, 83);
                  MonkeyPuzzle2.field_A.a((byte) -127, param1, param5);
                  param0.b(MonkeyPuzzle2.field_A.field_g, MonkeyPuzzle2.field_A.field_h, -2, 0);
                  param0.b(jk.field_z.field_g, jk.field_z.field_h, -2, 0);
                  break L9;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var7 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var7);
            stackOut_25_1 = new StringBuilder().append("be.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L12;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L12;
            }
          }
          L13: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L13;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L13;
            }
          }
          L14: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param5 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L14;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L14;
            }
          }
          L15: {
            stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
            stackOut_34_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param6 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L15;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L15;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
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
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("be.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static ad a(boolean param0, boolean param1, int param2, int param3, boolean param4) {
        byte[] var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        boolean stackIn_2_3 = false;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        boolean stackIn_3_2 = false;
        boolean stackIn_3_3 = false;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        boolean stackIn_4_3 = false;
        int stackIn_4_4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        boolean stackIn_6_2 = false;
        boolean stackIn_6_3 = false;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        boolean stackIn_7_2 = false;
        boolean stackIn_7_3 = false;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_8_2 = false;
        boolean stackIn_8_3 = false;
        int stackIn_8_4 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        boolean stackOut_5_2 = false;
        boolean stackOut_5_3 = false;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        boolean stackOut_7_2 = false;
        boolean stackOut_7_3 = false;
        int stackOut_7_4 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        boolean stackOut_6_2 = false;
        boolean stackOut_6_3 = false;
        int stackOut_6_4 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        boolean stackOut_1_2 = false;
        boolean stackOut_1_3 = false;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        boolean stackOut_3_2 = false;
        boolean stackOut_3_3 = false;
        int stackOut_3_4 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        boolean stackOut_2_2 = false;
        boolean stackOut_2_3 = false;
        int stackOut_2_4 = 0;
        if (param2 != 13271) {
          L0: {
            var6 = (byte[]) null;
            be.a((gk) null, (java.math.BigInteger) null, -19, 70, -21, (java.math.BigInteger) null, (byte[]) null);
            stackOut_5_0 = 0;
            stackOut_5_1 = param3;
            stackOut_5_2 = param4;
            stackOut_5_3 = param1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_7_3 = stackOut_5_3;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            if (param0) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = stackIn_7_2;
              stackOut_7_3 = stackIn_7_3;
              stackOut_7_4 = 1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              stackIn_8_3 = stackOut_7_3;
              stackIn_8_4 = stackOut_7_4;
              break L0;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = 0;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              stackIn_8_3 = stackOut_6_3;
              stackIn_8_4 = stackOut_6_4;
              break L0;
            }
          }
          return em.a(stackIn_8_0 != 0, stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, 50);
        } else {
          L1: {
            stackOut_1_0 = 0;
            stackOut_1_1 = param3;
            stackOut_1_2 = param4;
            stackOut_1_3 = param1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            stackIn_2_3 = stackOut_1_3;
            if (param0) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = stackIn_3_3;
              stackOut_3_4 = 1;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              stackIn_4_4 = stackOut_3_4;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = stackIn_2_3;
              stackOut_2_4 = 0;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              stackIn_4_4 = stackOut_2_4;
              break L1;
            }
          }
          return em.a(stackIn_4_0 != 0, stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4, 50);
        }
    }

    be(int param0, int param1, int param2) {
        this.field_a = param0;
        this.field_c = new int[1 + param2];
        this.field_f = param1;
    }

    static {
        field_b = Math.atan2(0.0, 1.0);
        field_e = "Email (Login):";
    }
}
