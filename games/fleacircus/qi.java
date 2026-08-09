/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi {
    static fh field_b;
    static String field_d;
    static String field_e;
    static dd field_c;
    static int field_f;
    static String field_a;

    final static void a(java.math.BigInteger param0, int param1, int param2, byte[] param3, ni param4, java.math.BigInteger param5, byte param6) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7_int = pf.a(param6 ^ 104, param1);
                        if (null == vk.field_N) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        vk.field_N = new java.security.SecureRandom();
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var12 = new int[4];
                        var11 = var12;
                        var8 = var11;
                        if (param6 == -60) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var9 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var9 ^ -1) <= -5) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8[var9] = vk.field_N.nextInt();
                        var9++;
                        if (var10 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var10 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (null == ri.field_x) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var7_int <= ri.field_x.field_k.length) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ri.field_x = new ni(var7_int);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ri.field_x.field_i = 0;
                        ri.field_x.a(param3, param1, param2, 0);
                        ri.field_x.d(var7_int, 0);
                        ri.field_x.a(0, var12);
                        if (fleas.field_B == null) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (100 > fleas.field_B.field_k.length) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        fleas.field_B = new ni(100);
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        fleas.field_B.field_i = 0;
                        fleas.field_B.a(param6 + 49, 10);
                        var9 = 0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if ((var9 ^ -1) <= -5) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        fleas.field_B.a(var12[var9], (byte) -15);
                        var9++;
                        if (var10 != 0) {
                            statePc = 39;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var10 == 0) {
                            statePc = 20;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        fleas.field_B.b((byte) -49, param1);
                        fleas.field_B.a(param0, param5, 127);
                        param4.a(fleas.field_B.field_k, fleas.field_B.field_i, 0, 0);
                        param4.a(ri.field_x.field_k, ri.field_x.field_i, 0, param6 + 60);
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var7 = (RuntimeException) ((Object) caughtException);
                    stackIn_28_0 = (RuntimeException) (var7);
                    stackIn_27_0 = stackIn_28_0;
                    stackIn_28_1 = new StringBuilder().append("qi.C(");
                    stackIn_27_1 = stackIn_28_1;
                    if (param0 == null) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_27_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_27_1);
                    stackIn_29_2 = "{...}";
                    statePc = 29;
                    continue stateLoop;
                }
                case 28: {
                    stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
                    stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
                    stackIn_29_2 = "null";
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    stackIn_31_0 = (RuntimeException) ((Object) stackIn_29_0);
                    stackIn_30_0 = stackIn_31_0;
                    stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');
                    stackIn_30_1 = stackIn_31_1;
                    if (param3 == null) {
                        statePc = 31;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 30: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_30_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_30_1);
                    stackIn_32_2 = "{...}";
                    statePc = 32;
                    continue stateLoop;
                }
                case 31: {
                    stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
                    stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
                    stackIn_32_2 = "null";
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    stackIn_34_0 = (RuntimeException) ((Object) stackIn_32_0);
                    stackIn_33_0 = stackIn_34_0;
                    stackIn_34_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(',');
                    stackIn_33_1 = stackIn_34_1;
                    if (param4 == null) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_33_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_33_1);
                    stackIn_35_2 = "{...}";
                    statePc = 35;
                    continue stateLoop;
                }
                case 34: {
                    stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
                    stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
                    stackIn_35_2 = "null";
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    stackIn_37_0 = (RuntimeException) ((Object) stackIn_35_0);
                    stackIn_36_0 = stackIn_37_0;
                    stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
                    stackIn_36_1 = stackIn_37_1;
                    if (param5 == null) {
                        statePc = 37;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_36_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_36_1);
                    stackIn_38_2 = "{...}";
                    statePc = 38;
                    continue stateLoop;
                }
                case 37: {
                    stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
                    stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
                    stackIn_38_2 = "null";
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    throw pf.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ',' + param6 + ')');
                }
                case 39: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -105) {
            return;
        }
        field_e = null;
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
        byte[] var6 = null;
        Object var7 = null;
        byte[] var9 = null;
        ni var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          L0: {
            L1: {
              if (param1 == -22518) {
                break L1;
              } else {
                var9 = (byte[]) null;
                qi.a((byte[]) null, -34);
                break L1;
              }
            }
            L2: {
              var10 = new ni(param0);
              var3 = var10.e(false);
              var4 = var10.c((byte) 123);
              if (0 > var4) {
                break L2;
              } else {
                L3: {
                  if (0 == lj.field_b) {
                    break L3;
                  } else {
                    if (var4 > lj.field_b) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (-1 == (var3 ^ -1)) {
                  var14 = new byte[var4];
                  var12 = var14;
                  var5 = var12;
                  var10.b(var14, 0, -126, var4);
                  stackIn_24_0 = (byte[]) (var5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L4: {
                    var5_int = var10.c((byte) 126);
                    if (0 > var5_int) {
                      break L4;
                    } else {
                      L5: {
                        if (lj.field_b == 0) {
                          break L5;
                        } else {
                          if (lj.field_b >= var5_int) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L6: {
                        L7: {
                          var13 = new byte[var5_int];
                          var11 = var13;
                          var6 = var11;
                          if (var3 == 1) {
                            break L7;
                          } else {
                            var7 = se.field_c;
                            synchronized (var7) {
                              L8: {
                                se.field_c.a((byte) -126, var13, var10);
                                break L8;
                              }
                            }
                            if (!fleas.field_A) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        fe.a(var13, var5_int, param0, var4, 9);
                        break L6;
                      }
                      stackIn_22_0 = (byte[]) (var6);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                  throw new RuntimeException();
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var2);

            stackIn_27_1 = new StringBuilder().append("qi.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L9;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L9;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_22_0;
        } else {
          return stackIn_24_0;
        }
    }

    static {
        field_e = "Service unavailable";
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_b = new fh(8, 0, 4, 1);
    }
}
