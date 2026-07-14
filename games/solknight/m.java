/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class m extends gg {
    int field_i;
    int field_j;
    static nc field_h;

    final static int a(int param0, char param1, CharSequence param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var3 = 0;
        var4 = param2.length();
        var5 = param0;
        L0: while (true) {
          if (var4 <= var5) {
            return var3;
          } else {
            if (param2.charAt(var5) == param1) {
              var3++;
              var5++;
              var5++;
              continue L0;
            } else {
              var5++;
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_h = null;
    }

    private m() throws Throwable {
        throw new Error();
    }

    final static rb a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        rb var6 = null;
        if (param3 != -6) {
          field_h = null;
          var6 = new rb(param0, param2, param1, param5, param4);
          pk.a((byte) 32, var6);
          return var6;
        } else {
          var6 = new rb(param0, param2, param1, param5, param4);
          pk.a((byte) 32, var6);
          return var6;
        }
    }

    final static void b(boolean param0) {
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
                        var3 = SolKnight.field_L ? 1 : 0;
                        if (il.field_c == null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        il.field_c.a((byte) 92);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        if (pf.field_d != null) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        pf.field_d.a(5);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (null != hc.field_c) {
                            statePc = 9;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            hc.field_c.d(false);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (tk.field_p != null) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return;
                    }
                    case 14: {
                        var1 = 0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (tk.field_p.length <= var1) {
                            statePc = 23;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (null != tk.field_p[var1]) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var1++;
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 19: {
                        try {
                            tk.field_p[var1].d(false);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var1++;
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 21: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 23: {
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new nc();
    }
}
