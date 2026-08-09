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
        if (param0 == -1) {
          if (this.field_c != null) {
            if (0 == this.field_c.length) {
              return 0;
            } else {
              return this.field_c[this.field_c.length + -1];
            }
          } else {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
        } else {
          return 65;
        }
    }

    final static void b(int param0) {
        int var1;
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
        int var3;
        int var4;
        byte[] var5;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != this.field_c) {
          if (-1 != (this.field_c.length ^ -1)) {
            var3 = 1;
            L0: while (true) {
              L1: {
                if (this.field_c.length <= var3) {
                  break L1;
                } else {
                  stackIn_10_0 = this.field_c[var3 + -1] + this.field_c[var3] >> -177902559;

                  stackIn_10_1 = param1;

                  if (var4 == 0) {
                    if (stackIn_10_0 > stackIn_10_1) {
                      return -1 + var3;
                    } else {
                      var3++;
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    return stackIn_10_0 + stackIn_10_1;
                  }
                }
              }
              if (param0 != 0) {
                var5 = (byte[]) null;
                be.a((byte[]) null, (byte) 88);
                return this.field_c.length + -1;
              } else {
                return this.field_c.length + -1;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        byte[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = vb.a(105, param4);
                        if (pb.field_b != null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        pb.field_b = new java.security.SecureRandom();
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var13 = new int[4];
                        var12 = var13;
                        var8 = var12;
                        var9 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (4 <= var9) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8[var9] = pb.field_b.nextInt();
                        var9++;
                        if (var10 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var10 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (jk.field_z == null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7_int > jk.field_z.field_g.length) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        jk.field_z = new gk(var7_int);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        jk.field_z.field_h = 0;
                        jk.field_z.b(param6, param4, -2, param3);
                        jk.field_z.a(true, var7_int);
                        jk.field_z.a(30350, var13);
                        if (null == MonkeyPuzzle2.field_A) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (MonkeyPuzzle2.field_A.field_g.length < 100) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        MonkeyPuzzle2.field_A = new gk(100);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        MonkeyPuzzle2.field_A.field_h = 0;
                        MonkeyPuzzle2.field_A.b(10, -49152);
                        var9 = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if ((var9 ^ -1) <= -5) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        MonkeyPuzzle2.field_A.a(-803539344, var13[var9]);
                        var9++;
                        if (var10 != 0) {
                            statePc = 38;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var10 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (param2 < -76) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var11 = (byte[]) null;
                        be.a((gk) null, (java.math.BigInteger) null, 116, -40, -47, (java.math.BigInteger) null, (byte[]) null);
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        MonkeyPuzzle2.field_A.c(param4, 83);
                        MonkeyPuzzle2.field_A.a((byte) -127, param1, param5);
                        param0.b(MonkeyPuzzle2.field_A.field_g, MonkeyPuzzle2.field_A.field_h, -2, 0);
                        param0.b(jk.field_z.field_g, jk.field_z.field_h, -2, 0);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_27_0 = (RuntimeException) (var7);
                    stackIn_26_0 = stackIn_27_0;
                    stackIn_27_1 = new StringBuilder().append("be.B(");
                    stackIn_26_1 = stackIn_27_1;
                    if (param0 == null) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_26_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_26_1);
                    stackIn_28_2 = "{...}";
                    statePc = 28;
                    continue stateLoop;
                }
                case 27: {
                    stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_28_2 = "null";
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_30_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_0 = stackIn_30_0;
                    stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
                    stackIn_29_1 = stackIn_30_1;
                    if (param1 == null) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_29_1);
                    stackIn_31_2 = "{...}";
                    statePc = 31;
                    continue stateLoop;
                }
                case 30: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_31_2 = "null";
                    statePc = 31;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_33_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_0 = stackIn_33_0;
                    stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                    stackIn_32_1 = stackIn_33_1;
                    if (param5 == null) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_32_1);
                    stackIn_34_2 = "{...}";
                    statePc = 34;
                    continue stateLoop;
                }
                case 33: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_34_2 = "null";
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_36_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_0 = stackIn_36_0;
                    stackIn_36_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_34_2).append(',');
                    stackIn_35_1 = stackIn_36_1;
                    if (param6 == null) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_35_1);
                    stackIn_37_2 = "{...}";
                    statePc = 37;
                    continue stateLoop;
                }
                case 36: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_37_2 = "null";
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    throw la.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ')');
                }
                case 38: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = -122 % ((18 - param1) / 45);
            stackIn_1_0 = sc.a(param0, param0.length, 94, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var2);

            stackIn_4_1 = new StringBuilder().append("be.D(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    final static ad a(boolean param0, boolean param1, int param2, int param3, boolean param4) {
        byte[] var6;
        int stackIn_3_0;
        int stackIn_3_1;
        boolean stackIn_3_2;
        boolean stackIn_3_3;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        boolean stackIn_4_3 = false;
        int stackIn_4_4 = 0;
        int stackIn_7_0;
        int stackIn_7_1;
        boolean stackIn_7_2;
        boolean stackIn_7_3;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_8_2 = false;
        boolean stackIn_8_3 = false;
        int stackIn_8_4 = 0;
        if (param2 != 13271) {
          L0: {
            var6 = (byte[]) null;
            be.a((gk) null, (java.math.BigInteger) null, -19, 70, -21, (java.math.BigInteger) null, (byte[]) null);
            stackIn_7_0 = 0;

            stackIn_7_1 = param3;

            stackIn_7_2 = param4;

            stackIn_7_3 = param1;

            if (param0) {
              stackIn_8_0 = stackIn_7_0;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = stackIn_7_2;
              stackIn_8_3 = stackIn_7_3;
              stackIn_8_4 = 1;
              break L0;
            } else {
              stackIn_8_0 = stackIn_7_0;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = stackIn_7_2;
              stackIn_8_3 = stackIn_7_3;
              stackIn_8_4 = 0;
              break L0;
            }
          }
          return em.a(stackIn_8_0 != 0, stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, 50);
        } else {
          L1: {
            stackIn_3_0 = 0;

            stackIn_3_1 = param3;

            stackIn_3_2 = param4;

            stackIn_3_3 = param1;

            if (param0) {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = stackIn_3_2;
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = 1;
              break L1;
            } else {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = stackIn_3_2;
              stackIn_4_3 = stackIn_3_3;
              stackIn_4_4 = 0;
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
