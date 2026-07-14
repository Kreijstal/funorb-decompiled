/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class oi {
    static he field_h;
    static he[] field_a;
    static double[] field_b;
    static nh field_d;
    static he[] field_g;
    static boolean field_c;
    static bl field_e;
    static he field_f;

    final static int a(int param0, byte param1) {
        if (param1 != 1) {
            return 85;
        }
        int var2 = 0;
        if ((param0 ^ -1) <= -1) {
            // if_icmpge L26
        } else {
            param0 = param0 >>> 16;
            var2 += 16;
        }
        if (param0 >= 256) {
            var2 += 8;
            param0 = param0 >>> 8;
        }
        if (16 <= param0) {
            var2 += 4;
            param0 = param0 >>> 4;
        }
        if (param0 >= 4) {
            param0 = param0 >>> 2;
            var2 += 2;
        }
        if (!(param0 < 1)) {
            var2++;
            param0 = param0 >>> 1;
        }
        return param0 + var2;
    }

    final static int a(a param0, a param1, byte param2) {
        if (param2 != -85) {
            oi.a((byte) -77);
        }
        return pj.a((String) null, 0, param0, param1, param2 + 85, 0, false);
    }

    abstract void a(java.awt.Component param0, byte param1);

    abstract int a(int param0);

    final static void b(byte param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            int var2 = 0;
            IOException var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
                        if (p.field_a != null) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        p.field_a.a((byte) -82);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (pd.field_d == null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        pd.field_d.a((byte) 104);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var1 = 35 / ((param0 - -45) / 48);
                        if (null == uj.field_h) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            uj.field_h.a(-126);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (rc.field_d == null) {
                            statePc = 18;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var2 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (rc.field_d.length <= var2) {
                            statePc = 18;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if (rc.field_d[var2] != null) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var2++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            rc.field_d[var2].a(-104);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var2++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 17: {
                        var3 = (IOException) (Object) caughtException;
                        var2++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 18: {
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

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 86) {
            return;
        }
        field_f = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    abstract void a(byte param0, java.awt.Component param1);

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= param1.length()) {
            if (param0 == 8975) {
              return false;
            } else {
              int discarded$1 = oi.a(-35, (byte) 4);
              return false;
            }
          } else {
            var3 = param1.charAt(var2);
            if (!ug.a(-1, (char) var3)) {
              if (!lb.a((char) var3, true)) {
                return true;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new double[]{1.5, 5.0, 2.5, 3.0, 3.0, 2.0, 1.0, 2.5, 4.5, 3.0, 1.5, 2.0, 1.0, 1.5, 1.5, 3.0, 3.0, 2.0, 5.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5, 1.0, 5.0, 5.0, 2.5, 1.5, 5.0, 4.5, 1.0, 1.0, 1.0, 5.0, 1.5, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        field_c = false;
    }
}
