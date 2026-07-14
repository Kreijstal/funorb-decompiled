/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uo {
    static String field_d;
    static String[] field_g;
    static int[] field_b;
    static int[] field_c;
    static gn[] field_f;
    static String field_e;
    static cn field_a;

    public static void a(int param0) {
        field_f = null;
        field_c = null;
        field_d = null;
        field_a = null;
        field_e = null;
        field_g = null;
        if (param0 >= -73) {
            field_e = null;
        }
        field_b = null;
    }

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 < -41) {
            break L0;
          } else {
            nh discarded$2 = uo.a(false, 29, true, -7, 35, false);
            break L0;
          }
        }
        L1: {
          L2: {
            param1 = tg.a('_', param1, 3, "");
            var3 = sh.a((byte) -121, param1);
            if (0 != (param2.indexOf(param1) ^ -1)) {
              break L2;
            } else {
              if (param2.indexOf(var3) == -1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(int param0, int param1, int[] param2, Object[] param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int var13 = 0;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          var13 = DungeonAssault.field_K;
          if (param0 == 256) {
            break L0;
          } else {
            nh discarded$1 = uo.a(false, 117, false, -61, 4, ((boolean[]) param3[1])[6]);
            break L0;
          }
        }
        L1: {
          if (param4 < param1) {
            L2: {
              var5 = (param1 + param4) / 2;
              var6 = param4;
              var7 = param2[var5];
              param2[var5] = param2[param1];
              param2[param1] = var7;
              var8 = param3[var5];
              param3[var5] = param3[param1];
              param3[param1] = var8;
              if (-2147483648 != (var7 ^ -1)) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = 0;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var9 = stackIn_7_0;
            var10 = param4;
            L3: while (true) {
              if (var10 >= param1) {
                param2[param1] = param2[var6];
                param2[var6] = var7;
                param3[param1] = param3[var6];
                param3[var6] = var8;
                uo.a(param0 ^ 0, var6 + -1, param2, param3, param4);
                uo.a(256, param1, param2, param3, 1 + var6);
                break L1;
              } else {
                if ((var9 & var10) + var7 > param2[var10]) {
                  var11 = param2[var10];
                  param2[var10] = param2[var6];
                  param2[var6] = var11;
                  var12 = param3[var10];
                  param3[var10] = param3[var6];
                  var6++;
                  param3[var6] = var12;
                  var10++;
                  continue L3;
                } else {
                  var10++;
                  continue L3;
                }
              }
            }
          } else {
            break L1;
          }
        }
    }

    private uo() throws Throwable {
        throw new Error();
    }

    final static nh a(boolean param0, int param1, boolean param2, int param3, int param4, boolean param5) {
        try {
            ln var6 = null;
            IOException var6_ref = null;
            ln var7 = null;
            ti var8 = null;
            Object stackIn_12_0 = null;
            nh stackIn_17_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_11_0 = null;
            nh stackOut_16_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = null;
                            var7 = null;
                            if (null != kn.field_f.field_x) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            sa.field_x = new hd(kn.field_f.field_x, 5200, 0);
                            kn.field_f.field_x = null;
                            var6 = new ln(255, sa.field_x, new hd(kn.field_f.field_q, 12000, 0), 2097152);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (sa.field_x != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (null != cf.field_c) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            cf.field_c = new hd[kn.field_f.field_v.length];
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (null != cf.field_c[param3]) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            cf.field_c[param3] = new hd(kn.field_f.field_v[param3], 12000, 0);
                            kn.field_f.field_v[param3] = null;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var7 = new ln(param3, sa.field_x, cf.field_c[param3], 2097152);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var8 = bl.field_r.a(param5, 4210752, param3, var6, var7);
                            if (param4 == 27847) {
                                statePc = 13;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = null;
                            stackIn_12_0 = stackOut_11_0;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return (nh) (Object) stackIn_12_0;
                    }
                    case 13: {
                        try {
                            if (param0) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var8.d(param4 ^ 30326);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = new nh((qa) (Object) var8, param2, param1);
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0;
                    }
                    case 18: {
                        var6_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var6_ref.toString());
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Log in";
        field_g = new String[]{null, "Spend some of your initial Treasure building your dungeon, but save some for recruiting <%raiders> (about 50-100 Treasure should be sufficient). When you're finished, <col=FF0000>save your dungeon and exit this page by clicking on the 'Confirm' button at the top-left of the screen.</col>"};
        field_c = new int[256];
        field_d = "Your raider was detected by the monster.";
    }
}
