/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fm {
    static boolean field_e;
    static String field_c;
    static boolean field_b;
    static long field_d;
    static boolean field_f;
    static String field_a;

    final static void a(byte param0, bh param1, bh param2) {
        try {
            int var3_int = 32 % ((param0 - 60) / 49);
            if (!(null == param1.field_a)) {
                param1.b((byte) 113);
            }
            param1.field_b = param2;
            param1.field_a = param2.field_a;
            param1.field_a.field_b = param1;
            param1.field_b.field_a = param1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "fm.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, kn param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        uf var7 = null;
        uf var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var7 = we.field_b;
                        var8 = var7;
                        var8.f(param1, -4);
                        var8.field_n = var8.field_n + 1;
                        var4 = var8.field_n;
                        var8.a(true, 1);
                        var8.d(-1, param2.field_u);
                        var8.d(-1, param2.field_x);
                        var8.d(-1, param2.field_q);
                        var8.a(param2.field_t, false);
                        var8.a(param2.field_v, false);
                        var8.a(param2.field_w, false);
                        var8.a(param2.field_y, false);
                        var8.a(true, param2.field_s.length);
                        var5 = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var5 >= param2.field_s.length) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var7.a(param2.field_s[var5], false);
                        var5++;
                        if (var6 != 0) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var8.a((byte) -15, var4);
                        var8.b(var8.field_n - var4, true);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 <= -90) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        field_b = true;
                        return;
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
                    stackIn_12_1 = new StringBuilder().append("fm.I(").append(param0).append(',').append(param1).append(',');
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
                    throw dh.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(wl param0, byte param1);

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            kn var2 = (kn) null;
            fm.a((byte) 8, -15, (kn) null);
        }
    }

    abstract gh a(int param0);

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7;
        int var8;
        int var9;
        int var10;
        int stackIn_3_0 = 0;
        L0: {
          var10 = client.field_A ? 1 : 0;
          if (80 > param4) {
            stackIn_3_0 = param4 / 20 * 18;
            break L0;
          } else {
            stackIn_3_0 = 54;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        var8 = 0;
        if (60 > param4) {
          var7 = var7 + vl.a(23841, 80, param3 * 18 - -40);
          if (var10 != 0) {
            if ((param4 ^ -1) <= -81) {
              if (param4 >= 93) {
                hk.a(param1 + -36 + -3, param2 + 36 - 3, 78, 60, 4, 65280, 100);
                if (var10 == 0) {
                  cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                  cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                  cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                  cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                  fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                  fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                  var9 = 16 / ((59 - param5) / 43);
                  fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                  fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                  return;
                } else {
                  var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                  var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                  cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                  cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                  cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                  cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                  fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                  fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                  var9 = 16 / ((59 - param5) / 43);
                  fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                  fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                  return;
                }
              } else {
                L1: {
                  var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                  if (var10 == 0) {
                    break L1;
                  } else {
                    var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                    break L1;
                  }
                }
                cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                var9 = 16 / ((59 - param5) / 43);
                fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                return;
              }
            } else {
              var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
              cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
              cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
              cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
              cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
              fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
              fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
              var9 = 16 / ((59 - param5) / 43);
              fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
              fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
              return;
            }
          } else {
            cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
            cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
            cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
            cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
            fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
            fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
            var9 = 16 / ((59 - param5) / 43);
            fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
            fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
            return;
          }
        } else {
          if ((param4 ^ -1) <= -81) {
            if (param4 >= 93) {
              hk.a(param1 + -36 + -3, param2 + 36 - 3, 78, 60, 4, 65280, 100);
              if (var10 == 0) {
                cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                var9 = 16 / ((59 - param5) / 43);
                fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                return;
              } else {
                var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
                cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
                cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
                cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
                fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
                fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
                var9 = 16 / ((59 - param5) / 43);
                fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
                fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
                return;
              }
            } else {
              L2: {
                var8 = vl.a(23841, 80, 18 * ve.field_ic[1 + param4 - 80] - -40);
                if (var10 == 0) {
                  break L2;
                } else {
                  var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
                  break L2;
                }
              }
              cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
              cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
              cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
              cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
              fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
              fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
              var9 = 16 / ((59 - param5) / 43);
              fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
              fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
              return;
            }
          } else {
            var7 = var7 + vl.a(23841, 80, param6 * 18 - -40);
            cg.a(param0, 2, 5, param1 - -18, param2 + 73, -2, -2);
            cg.a(param0, 2, 12, 18 + param1, param2 - -55, -2, -1);
            cg.a(param0, 2, 8, 18 + param1, 36 + (param2 - -1), -2, -1);
            cg.a(param0, 2, 2, param1, 1 + param2 + 72, -1, -2);
            fb.field_c[param0][2].c(param1 + -18, 72 + param2, 18, 18);
            fb.field_c[param0][2].c(-36 + param1, param2 + 72, 18, 18);
            var9 = 16 / ((59 - param5) / 43);
            fb.field_c[param0][2].c(param1, param2 - -54, 18, 18);
            fb.field_c[param0][2].c(param1 + -18, param2 - -var7 + var8, 18, 18 + -var8);
            return;
          }
        }
    }

    static {
        field_c = "In Single-player";
        field_a = "Connection restored.";
    }
}
