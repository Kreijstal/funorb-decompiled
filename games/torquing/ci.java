/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ci {
    static int field_c;
    private static long[] field_a;
    static String field_b;
    static String field_d;

    final static void a(int param0, String[] param1) {
        if (!(ib.field_b == null)) {
            ib.field_b.field_M.a(param1, -121);
        }
        if (!(je.field_g == null)) {
            je.field_g.field_I.a(param1, -123);
        }
        int var2 = -62 % ((param0 - -12) / 62);
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != 2) {
            ci.b(-22);
        }
        field_a = null;
    }

    final static up a(int param0, String param1) {
        int var2 = 98 / ((param0 - -18) / 60);
        return new up(param1);
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Torquing.field_u;
                        if (param0 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_b = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null != nn.field_c) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        nn.field_c.b((byte) -101);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == gh.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        gh.field_a.a((byte) -95);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (null == jd.field_F) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            jd.field_F.a(false);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (uj.field_b == null) {
                            statePc = 20;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var1 = 0;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (uj.field_b.length <= var1) {
                            statePc = 20;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (uj.field_b[var1] != null) {
                            statePc = 17;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            uj.field_b[var1].a(false);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 19: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 20: {
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

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 == 0) {
            return 0;
        }
        if (!((param0 ^ -1) >= -1)) {
            var2 = 1;
            if (65535 < param0) {
                var2 += 16;
                param0 = param0 >> 16;
            }
            if (!((param0 ^ -1) >= -256)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (param0 > 15) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(3 >= param0)) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if (!(param0 <= 1)) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = param1;
        if (65535 < (param0 ^ -1)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (param0 < -256) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (param0 < -16) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if ((param0 ^ -1) > 3) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if ((param0 ^ -1) > 1) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_a = new long[256];
        field_b = "Password is valid";
        var2 = 0;
        L0: while (true) {
          if (var2 >= 256) {
            field_d = "Waiting for extra data";
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (8 <= var3) {
                field_a[var2] = var0;
                var2++;
                continue L0;
              } else {
                if (1L == (var0 & 1L)) {
                  var0 = var0 >>> -1512199487 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
