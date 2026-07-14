/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_b;
    static char[] field_d;
    static boolean field_c;
    static boolean[] field_e;
    static double field_a;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(double param0, double param1, byte param2, int param3, double param4, double param5, nf param6, double param7, vg param8) {
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        double var29 = 0.0;
        int var31 = 0;
        nf stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        nf stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        nf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        nf stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        nf stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        nf stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        if (param2 == -11) {
          var14 = -param8.field_T + param0;
          var16 = param5 - param8.field_L;
          var18 = -param8.field_O + param4;
          var20 = var18 * param8.field_M + (param8.field_R * var14 + var16 * param8.field_ab);
          var22 = param8.field_V * var14 + var16 * param8.field_U + param8.field_F * var18;
          var24 = var18 * param8.field_N + (param8.field_P * var14 + param8.field_H * var16);
          if (var24 >= 0.15) {
            var26 = 320 - -(int)(var20 / var24 * 640.0);
            var27 = 188 - -(int)(640.0 * (var22 / var24));
            var28 = (int)(param1 / var24 * 640.0);
            var29 = (double)(2 * param3) * (1.0 - var18 / param7);
            var31 = (int)qn.field_v.a(var29, 0, param4);
            if (-1 <= (var31 ^ -1)) {
              return;
            } else {
              L0: {
                stackOut_5_0 = (nf) param6;
                stackOut_5_1 = var26 - var28;
                stackOut_5_2 = -var28 + var27;
                stackOut_5_3 = 2 * var28;
                stackOut_5_4 = 2 * var28;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                stackIn_7_4 = stackOut_5_4;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                if (param3 < var31) {
                  stackOut_7_0 = (nf) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = stackIn_7_4;
                  stackOut_7_5 = param3;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  stackIn_8_4 = stackOut_7_4;
                  stackIn_8_5 = stackOut_7_5;
                  break L0;
                } else {
                  stackOut_6_0 = (nf) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = stackIn_6_2;
                  stackOut_6_3 = stackIn_6_3;
                  stackOut_6_4 = stackIn_6_4;
                  stackOut_6_5 = var31;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  stackIn_8_4 = stackOut_6_4;
                  stackIn_8_5 = stackOut_6_5;
                  break L0;
                }
              }
              ((nf) (Object) stackIn_8_0).d(stackIn_8_1, stackIn_8_2, stackIn_8_3, stackIn_8_4, stackIn_8_5);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          if (null != kl.field_G) {
            if (!lk.field_d.a(-128)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = null;
          if (null != kl.field_G) {
            if (!lk.field_d.a(-128)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Confined.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) kf.a(75, "getcookies", param0);
                            var5 = ij.a(param1 ^ 59, (char)param1, var4);
                            var6 = 0;
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
                            if (var5.length <= var6) {
                                statePc = 10;
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
                            var7 = var5[var6].indexOf('=');
                            if ((var7 ^ -1) > -1) {
                                statePc = 7;
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
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 7;
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
                            stackOut_5_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var6++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2 = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (null != wm.field_jb) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return wm.field_jb;
                    }
                    case 13: {
                        return param0.getParameter("settings");
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

    public static void a(byte param0) {
        field_e = null;
        int var1 = 5 / ((param0 - -16) / 38);
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_c = false;
        field_b = -1;
    }
}
