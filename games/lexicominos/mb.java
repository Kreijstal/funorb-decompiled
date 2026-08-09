/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String field_a;
    String field_e;
    boolean field_c;
    String[] field_d;
    boolean field_b;
    int field_f;

    final static la a(byte param0, String param1) {
        RuntimeException var2 = null;
        la stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = new la(param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("mb.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        String[] var8 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 105) {
                break L1;
              } else {
                var6 = (String[]) null;
                mb.a(58, 95, (String) null, (String[]) null);
                break L1;
              }
            }
            L2: {
              L3: {
                ee.field_c = c.field_o;
                if (param1 != 255) {
                  break L3;
                } else {
                  L4: {
                    if (-14 >= (cg.field_l ^ -1)) {
                      stackIn_7_0 = 0;
                      break L4;
                    } else {
                      stackIn_7_0 = 1;
                      break L4;
                    }
                  }
                  n.field_k = mc.b(stackIn_7_0 != 0, 102);
                  var7 = (String[]) null;
                  th.a((byte) 83, (String[]) null);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (100 > param1) {
                n.field_k = wi.a(param1, (byte) -108, param2);
                return;
              } else {
                if (param1 > 105) {
                  n.field_k = wi.a(param1, (byte) -108, param2);
                  return;
                } else {
                  var8 = param3;
                  th.a((byte) 85, var8);
                  n.field_k = oe.a(-118, param3);
                  if (var5 == 0) {
                    break L2;
                  } else {
                    n.field_k = wi.a(param1, (byte) -108, param2);
                    return;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("mb.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = qg.field_b[param0];
                        var2 = 1;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (qg.field_b.length <= var2) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = qg.field_b[var2];
                        o.a(bf.field_a, var2 << -952767164, bf.field_a, var1_int, var3);
                        var1_int = var1_int + var3;
                        var2++;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw ld.a((Throwable) ((Object) var1), "mb.C(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 72 / ((param0 - 46) / 49);
    }

    mb(boolean param0) {
        this.field_c = param0 ? true : false;
    }

    static {
    }
}
