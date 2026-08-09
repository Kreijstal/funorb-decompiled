/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_b;
    static String[] field_c;
    static String field_a;

    final static void a(oa param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4 = 0;
        ih var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = ud.field_b;
            var5.e(8, param1);
            if (!param2) {
              L1: {
                L2: {
                  var5.field_i = var5.field_i + 1;
                  var4 = var5.field_i;
                  var5.a(-11, 1);
                  if (param0.field_k != null) {
                    break L2;
                  } else {
                    var5.a(-11, 0);
                    if (!fleas.field_A) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var5.a(-11, param0.field_k.length);
                var5.a(param0.field_k, param0.field_k.length, 0, 0);
                break L1;
              }
              var5.c(var4, -30532);
              var5.field_i = var5.field_i - 4;
              param0.field_i = var5.c((byte) -3);
              var5.c((byte) -128, -var4 + var5.field_i);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (runtimeException);

            stackIn_10_1 = new StringBuilder().append("s.A(");

            if (param0 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 123) {
            field_b = (String) null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, bh param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        bh var7 = null;
        ih var8 = null;
        ih var9 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var8 = ud.field_b;
                        var9 = var8;
                        var9.e(param0 ^ -4479, param1);
                        var9.field_i = var9.field_i + 1;
                        var4 = var9.field_i;
                        if (param0 == -4471) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var7 = (bh) null;
                        s.a(120, -80, (bh) null);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var9.a(-11, 1);
                        var9.b((byte) 76, param2.field_s);
                        var9.b((byte) -49, param2.field_o);
                        var9.b((byte) 105, param2.field_i);
                        var9.a(param2.field_j, (byte) -50);
                        var9.a(param2.field_r, (byte) -35);
                        var9.a(param2.field_v, (byte) -56);
                        var9.a(param2.field_m, (byte) -15);
                        var9.a(-11, param2.field_p.length);
                        var5 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var5 >= param2.field_p.length) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var8.a(param2.field_p[var5], (byte) -50);
                        var5++;
                        if (var6 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var9.c(var4, -30532);
                        var9.c((byte) -110, var9.field_i - var4);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    stackIn_12_0 = (RuntimeException) (var3);
                    stackIn_11_0 = stackIn_12_0;
                    stackIn_12_1 = new StringBuilder().append("s.C(").append(param0).append(',').append(param1).append(',');
                    stackIn_11_1 = stackIn_12_1;
                    if (param2 == null) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_13_2 = "{...}";
                    statePc = 13;
                    continue stateLoop;
                }
                case 12: {
                    stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_13_2 = "null";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    throw pf.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_a = "Try again";
    }
}
