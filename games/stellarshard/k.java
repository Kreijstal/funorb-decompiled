/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String field_e;
    static String field_c;
    static String field_a;
    static long field_d;
    static fh field_b;

    final static void a(int param0) {
        try {
            java.lang.reflect.Method var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Runtime var2_ref = null;
            Long var3 = null;
            Object var4 = null;
            Object var5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var1 = Runtime.class.getMethod("maxMemory", new Class[0]);
                            if (var1 != null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var2_ref = Runtime.getRuntime();
                            var4 = null;
                            var3 = (Long) var1.invoke((Object) (Object) var2_ref, (Object[]) null);
                            fh.field_m = 1 + (int)(var3.longValue() / 1048576L);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2 = caughtException;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == 3) {
                                statePc = 9;
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
                            var5 = null;
                            k.a((byte[]) null, 110, (int[]) null, false, 122);
                            return;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var1_ref = (Exception) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte[] param0, int param1, int[] param2, boolean param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = stellarshard.field_B;
        if (param3) {
          field_a = null;
          var5 = 0;
          L0: while (true) {
            if (gg.field_h.length <= var5) {
              return;
            } else {
              param1 = gg.field_h[var5];
              var6 = var5 << 880533700;
              L1: while (true) {
                param1--;
                if (param1 == 0) {
                  var5++;
                  var5++;
                  continue L0;
                } else {
                  var6++;
                  param4 = ki.field_z[var6];
                  param2[param0[param4]] = param2[param0[param4]] + 1;
                  ki.field_z[param2[param0[param4]]] = param4;
                  continue L1;
                }
              }
            }
          }
        } else {
          var5 = 0;
          L2: while (true) {
            if (gg.field_h.length <= var5) {
              return;
            } else {
              param1 = gg.field_h[var5];
              var6 = var5 << 880533700;
              L3: while (true) {
                param1--;
                if (param1 == 0) {
                  var5++;
                  var5++;
                  continue L2;
                } else {
                  var6++;
                  param4 = ki.field_z[var6];
                  param2[param0[param4]] = param2[param0[param4]] + 1;
                  ki.field_z[param2[param0[param4]]] = param4;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = -117 / ((-81 - param0) / 41);
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static void a(pf param0, int param1) {
        pb var2 = new pb(param0.a("final_frame.jpg", "", (byte) -12), (java.awt.Component) (Object) qd.field_j);
        int var3 = var2.field_v;
        int var4 = var2.field_y;
        kg.d(false);
        wh.field_a = new pb(var3, param1 * var4 / 4);
        wh.field_a.e();
        var2.d(0, 0);
        fb.field_h = new pb(var3, var4 + -wh.field_a.field_y);
        fb.field_h.e();
        var2.d(0, -wh.field_a.field_y);
        fb.field_h.field_s = wh.field_a.field_y;
        id.b((byte) -58);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Password is valid";
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = "Login: ";
    }
}
