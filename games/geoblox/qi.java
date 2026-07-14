/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi extends hf {
    int[] field_g;
    static gk field_h;
    boolean field_f;
    static int[] field_i;
    int field_j;

    public static void c(int param0) {
        field_h = null;
        if (param0 != 59) {
            return;
        }
        field_i = null;
    }

    final static boolean b(int param0) {
        int var1 = -46 % ((param0 - -28) / 60);
        return gb.field_b.b((byte) 126);
    }

    final static boolean d(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 76) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if ((ra.field_d ^ -1) >= -1) {
              break L2;
            } else {
              if ((65536 & ra.field_d) == 0) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    qi() {
        ((qi) this).field_f = false;
    }

    final static String a(String param0, java.applet.Applet param1, int param2) {
        try {
            int var3 = 0;
            String var4 = null;
            Throwable var4_ref = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String stackIn_6_0 = null;
            String stackOut_5_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Geoblox.field_C;
                        var3 = -105 / ((param2 - -33) / 57);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var4 = (String) wk.a((byte) -6, param1, "getcookies");
                            var5 = uj.a(';', true, var4);
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
                            if (var6 >= var5.length) {
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
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) param0)) {
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
                        var4_ref = caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        return null;
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

    final static int b(int param0, int param1) {
        if (param1 != 1) {
            return 99;
        }
        return sc.a((byte) -75, gk.field_d, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new gk();
    }
}
