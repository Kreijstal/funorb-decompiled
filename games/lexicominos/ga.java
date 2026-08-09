/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static int field_c;
    static String field_b;
    static sh field_a;

    final static void a(nc param0, int param1, int param2) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        th var8 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = ed.field_q;
                        var8 = var7;
                        if (param2 > 71) {
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
                    return;
                }
                case 3: {
                    try {
                        var8.h(param1, 0);
                        var8.field_h = var8.field_h + 1;
                        var4 = var8.field_h;
                        var8.c(1, -1);
                        var8.e(96, param0.field_j);
                        var8.e(105, param0.field_k);
                        var8.e(111, param0.field_l);
                        var8.f(param0.field_i, -32287);
                        var8.f(param0.field_q, -32287);
                        var8.f(param0.field_o, -32287);
                        var8.f(param0.field_s, -32287);
                        var8.c(param0.field_m.length, -1);
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
                        if (param0.field_m.length <= var5) {
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
                        var7.f(param0.field_m[var5], -32287);
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
                        var8.a(var4, (byte) 29);
                        var8.d(-var4 + var8.field_h, (byte) -124);
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
                    stackIn_12_1 = new StringBuilder().append("ga.B(");
                    stackIn_11_1 = stackIn_12_1;
                    if (param0 == null) {
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
                    throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-11 >= (wf.field_i ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 0;
                    if (dl.field_b) {
                      dl.field_b = false;
                      var3_int = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  hd.a(aa.a((byte) 92), (byte) -90, ik.a((byte) 94), var3_int != 0, te.field_E);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (og.a(23440)) {
                  break L4;
                } else {
                  lf.a();
                  ra.a(320, 150, 240);
                  lj.a(0, param2, 0, (byte) -128);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (-1 != (ta.field_g ^ -1)) {
                  break L5;
                } else {
                  tg.a(param1, false, param0 + 49);
                  lj.a(0, param2, 0, (byte) -128);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              uj.a(param0 + -126, param2);
              break L1;
            }
            if (param0 == 57) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        di.field_x.b(123, new mh());
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            ga.a((byte) -81, true, (java.awt.Canvas) null);
        }
    }

    static {
        field_c = 0;
        field_b = "GAME OVER";
    }
}
