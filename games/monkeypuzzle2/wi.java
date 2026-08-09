/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi implements ml {
    static ad field_d;
    static long field_f;
    static le field_e;
    static String field_a;
    static int field_c;
    static String[] field_b;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        me var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4 = (me) ((Object) af.field_a.a((byte) -117));
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var4 == null) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        qc.a(var4, (byte) 117, param0);
                        var4 = (me) ((Object) af.field_a.d((byte) 63));
                        if (var3 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 == 1197) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        field_d = (ad) null;
                        return;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) var2), "wi.A(" + param0 + ',' + param1 + ')');
                }
                case 10: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 256) {
          wi.a(127, 91);
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_d = null;
          return;
        }
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        le var8 = null;
        try {
          L0: {
            L1: {
              if (param4 > 19) {
                break L1;
              } else {
                wi.a(-113);
                break L1;
              }
            }
            L2: {
              var6_int = param3 + param1.field_r;
              var7 = param1.field_e + param2;
              eb.b(var6_int, 0, param1.field_p, param1.field_l, var7);
              var8 = hk.field_i[1];
              if (!(param1 instanceof t)) {
                break L2;
              } else {
                if (!((t) ((Object) param1)).field_u) {
                  break L2;
                } else {
                  var8.c((-var8.field_m + param1.field_l >> 1687994465) + var6_int + 1, (param1.field_p - var8.field_n >> 1839470177) + (1 + var7), 256);
                  break L2;
                }
              }
            }
            if (!param1.b((byte) 64)) {
              break L0;
            } else {
              hk.a(2 + var6_int, var7 + 2, 2, param1.field_l + -4, param1.field_p - 4);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var6);

            stackIn_10_1 = new StringBuilder().append("wi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_c = 0;
        field_a = "OK";
    }
}
