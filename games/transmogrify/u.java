/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static tf field_c;
    static int field_d;
    static int field_b;
    static qh field_a;

    final static int a(int param0, int param1) {
        hj var3;
        param1--;
        param1 = param1 | param1 >>> -816856703;
        param1 = param1 | param1 >>> -343087198;
        param1 = param1 | param1 >>> -1759701692;
        param1 = param1 | param1 >>> 476893576;
        if (param0 != -816856703) {
          var3 = (hj) null;
          u.a((hj) null, (byte) 92);
          param1 = param1 | param1 >>> 155990192;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> 155990192;
          return 1 + param1;
        }
    }

    final static oe[] a(hj param0, byte param1) {
        Object stackIn_3_0 = null;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        oe[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        boolean stackOut_6_0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        oe[] var4 = null;
        int var5 = 0;
        oe var6_ref_oe = null;
        int var6 = 0;
        int var7 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param0.k(8, 1522829539);
                        if (-1 <= (var2_int ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (oe[]) ((Object) stackIn_3_0);
                }
                case 4: {
                    try {
                        var3 = param0.k(12, 1522829539);
                        var4 = new oe[var3];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= var3) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = w.a(-1, param0);
                        stackIn_12_0 = stackOut_6_0 ? 1 : 0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var7 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (!stackIn_7_0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6_ref_oe = new oe();
                        param0.k(24, 1522829539);
                        param0.k(24, 1522829539);
                        var6_ref_oe.field_b = param0.k(24, 1522829539);
                        param0.k(9, 1522829539);
                        param0.k(12, 1522829539);
                        param0.k(12, 1522829539);
                        param0.k(12, 1522829539);
                        var4[var5] = var6_ref_oe;
                        if (var7 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6 = param0.k(ol.a(-23755, var5 + -1), 1522829539);
                        var4[var5] = var4[var6];
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = 70 / ((param1 - -47) / 36);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = stackIn_12_0;
                        stackIn_13_0 = (oe[]) (var4);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_16_0 = (RuntimeException) (var2);
                    stackIn_15_0 = stackIn_16_0;
                    stackIn_16_1 = new StringBuilder().append("u.A(");
                    stackIn_15_1 = stackIn_16_1;
                    if (param0 == null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_17_2 = "{...}";
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_17_2 = "null";
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(String param0, String param1, ci param2, boolean param3) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3) {
                break L1;
              } else {
                field_a = (qh) null;
                break L1;
              }
            }
            if (param2.a((byte) -125)) {
              stackIn_6_0 = param1 + " - " + param2.b(-22884) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("u.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static String a(boolean param0, int param1, oa param2) {
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        String var5 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var3_int = param2.f(-120);
                  if (var3_int <= param1) {
                    break L2;
                  } else {
                    var3_int = param1;
                    break L2;
                  }
                }
                if (!param0) {
                  var4 = new byte[var3_int];
                  param2.field_h = param2.field_h + bf.field_C.a(var3_int, var4, 0, param2.field_g, 0, param2.field_h);
                  var5 = cc.a(0, 15923, var3_int, var4);
                  stackIn_6_0 = (String) (var5);
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  stackIn_4_0 = (String) null;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (Exception) (Object) decompiledCaughtException;
              stackIn_8_0 = "Cabbage";
              return stackIn_8_0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("u.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(byte param0) {
        ci var2;
        if (param0 < 99) {
          var2 = (ci) null;
          u.a((String) null, (String) null, (ci) null, false);
          field_c = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_a = null;
          return;
        }
    }

    static {
        field_c = new tf(12, 0, 1, 0);
    }
}
