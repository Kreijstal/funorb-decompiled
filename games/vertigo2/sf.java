/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf {
    static fe field_b;
    static er[] field_a;
    static int field_d;
    static String field_c;
    static int[] field_e;
    static boolean[][] field_f;

    public static void a(byte param0) {
        field_f = null;
        field_e = null;
        field_b = null;
        field_a = null;
        int var1 = -53 / ((-39 - param0) / 33);
        field_c = null;
    }

    final static boolean a(int param0) {
        Object var2 = null;
        if (param0 != 1) {
          var2 = null;
          sf.a((int[]) null, (byte) -70, 6, -67, (int[]) null);
          return pd.field_c.b(-83);
        } else {
          return pd.field_c.b(-83);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                            param0.getAppletContext().showDocument(ar.a(param0, var2, 0), "_top");
                            if (param1 < -40) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_d = 84;
                            return;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
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

    final static void a(int[] param0, byte param1, int param2, int param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var13 = Vertigo2.field_L ? 1 : 0;
        if (param1 != 17) {
          return;
        } else {
          L0: {
            if (param3 < param2) {
              L1: {
                var5 = (param2 + param3) / 2;
                var6 = param3;
                var7 = param0[var5];
                param0[var5] = param0[param2];
                param0[param2] = var7;
                var8 = param4[var5];
                param4[var5] = param4[param2];
                param4[param2] = var8;
                if (2147483647 == var7) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                }
              }
              var9 = stackIn_6_0;
              var10 = param3;
              L2: while (true) {
                if (param2 <= var10) {
                  param0[param2] = param0[var6];
                  param0[var6] = var7;
                  param4[param2] = param4[var6];
                  param4[var6] = var8;
                  sf.a(param0, (byte) 17, -1 + var6, param3, param4);
                  sf.a(param0, (byte) 17, param2, 1 + var6, param4);
                  break L0;
                } else {
                  if (param0[var10] > -(var10 & var9) + var7) {
                    var11 = param0[var10];
                    param0[var10] = param0[var6];
                    param0[var6] = var11;
                    var12 = param4[var10];
                    param4[var10] = param4[var6];
                    var6++;
                    param4[var6] = var12;
                    var10++;
                    var10++;
                    continue L2;
                  } else {
                    var10++;
                    var10++;
                    continue L2;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Name is available";
        field_e = new int[]{400, 450, 700, 400, 700, 700, 1750, 1250, 2000, 2000, 1000, 1700, 1250, 2800, 4500, 5250, 4000, 6500, 3800, 4000, 5000, 4000, 3250, 5250, 5250, 6000, 3000, 4750, 10000, 3500, 3750, 5750, 5750, 4000, 5000, 6000, 6000, 4500, 4500, 5250, 4750, 5750, 4750, 4750, 3000, 4500, 5250, 8500, 4250, 6000};
    }
}
