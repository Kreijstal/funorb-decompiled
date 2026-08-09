/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    static String field_a;

    final static void a(boolean param0, int param1, db[] param2, int param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-1 > (param4 ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        if (param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var5_int = param2[0].field_r;
                        var6 = param2[2].field_r;
                        var7 = param2[1].field_r;
                        param2[0].d(param3, param1);
                        param2[2].d(-var6 + param3 - -param4, param1);
                        lf.b(uh.field_C);
                        lf.f(var5_int + param3, param1, param4 + (param3 + -var6), param1 + param2[1].field_x);
                        var8 = var5_int + param3;
                        var9 = param4 + (param3 + -var6);
                        param3 = var8;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param3 >= var9) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        param2[1].d(param3, param1);
                        param3 = param3 + var7;
                        if (var10 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
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
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        lf.a(uh.field_C);
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var5 = (RuntimeException) ((Object) caughtException);
                    stackIn_15_0 = (RuntimeException) (var5);
                    stackIn_14_0 = stackIn_15_0;
                    stackIn_15_1 = new StringBuilder().append("ac.B(").append(param0).append(',').append(param1).append(',');
                    stackIn_14_1 = stackIn_15_1;
                    if (param2 == null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_16_2 = "{...}";
                    statePc = 16;
                    continue stateLoop;
                }
                case 15: {
                    stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                    stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                    stackIn_16_2 = "null";
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
                }
                case 17: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 4) {
            ac.a(true, 32, true, true);
        }
    }

    final static String a(boolean param0, int param1, boolean param2, boolean param3) {
        int var4;
        if (param1 < -46) {
          L0: {
            var4 = 0;
            if (param2) {
              var4 += 4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param3) {
              var4 += 2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0) {
            var4++;
            return ll.field_e[var4];
          } else {
            return ll.field_e[var4];
          }
        } else {
          L2: {
            field_a = (String) null;
            var4 = 0;
            if (param2) {
              var4 += 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param3) {
              var4 += 2;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param0) {
            return ll.field_e[var4];
          } else {
            var4++;
            return ll.field_e[var4];
          }
        }
    }

    static {
        field_a = "Names cannot start or end with space or underscore";
    }
}
