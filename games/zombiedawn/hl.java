/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hl implements Iterator {
    private le field_e;
    static String field_f;
    static cg field_d;
    private wm field_a;
    private le field_c;
    static String field_h;
    static cg field_g;
    private int field_i;
    static String[] field_b;

    public final void remove() {
        if (((hl) this).field_c == null) {
            throw new IllegalStateException();
        }
        ((hl) this).field_c.b(-27598);
        ((hl) this).field_c = null;
    }

    public final Object next() {
        le var1 = null;
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        if (((hl) this).field_a.field_c[-1 + ((hl) this).field_i] == ((hl) this).field_e) {
          L0: while (true) {
            if (((hl) this).field_i < ((hl) this).field_a.field_f) {
              ((hl) this).field_i = ((hl) this).field_i + 1;
              var1 = ((hl) this).field_a.field_c[((hl) this).field_i].field_b;
              if (((hl) this).field_a.field_c[-1 + ((hl) this).field_i] != var1) {
                ((hl) this).field_e = var1.field_b;
                ((hl) this).field_c = var1;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((hl) this).field_e;
          ((hl) this).field_e = var1.field_b;
          ((hl) this).field_c = var1;
          return (Object) (Object) var1;
        }
    }

    private final void a(int param0) {
        ((hl) this).field_c = null;
        if (param0 != 11936) {
          return;
        } else {
          ((hl) this).field_e = ((hl) this).field_a.field_c[0].field_b;
          ((hl) this).field_i = 1;
          return;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var4 = param0.getCodeBase();
                var3 = rc.a(-1, param0, var4).getFile();
                Object discarded$6 = qe.a(new Object[2], "updatelinks", 29674, param0);
                Object discarded$7 = qe.a(new Object[2], "updatelinks", param1 ^ 29675, param0);
                Object discarded$8 = qe.a(new Object[2], "updatelinks", 29674, param0);
                Object discarded$9 = qe.a(new Object[2], "updatelinks", 29674, param0);
                if (param1 == 1) {
                  break L0;
                } else {
                  field_h = null;
                  break L0;
                }
              }
              Object discarded$10 = qe.a(new Object[2], "updatelinks", 29674, param0);
              Object discarded$11 = qe.a(new Object[2], "updatelinks", 29674, param0);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ZombieDawn.field_J;
                        if (!nm.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) qe.a(param1, "getcookies", -109);
                            if (param0 < -111) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            field_g = null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var4 = de.a(';', var3, -125);
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 14;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
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

    public final boolean hasNext() {
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        if (((hl) this).field_e == ((hl) this).field_a.field_c[((hl) this).field_i - 1]) {
          L0: while (true) {
            if (((hl) this).field_a.field_f > ((hl) this).field_i) {
              ((hl) this).field_i = ((hl) this).field_i + 1;
              if (((hl) this).field_a.field_c[((hl) this).field_i].field_b == ((hl) this).field_a.field_c[-1 + ((hl) this).field_i]) {
                ((hl) this).field_e = ((hl) this).field_a.field_c[((hl) this).field_i + -1];
                continue L0;
              } else {
                ((hl) this).field_e = ((hl) this).field_a.field_c[-1 + ((hl) this).field_i].field_b;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_g = null;
        field_f = null;
        field_h = null;
        if (param0 <= 105) {
            return;
        }
        field_b = null;
    }

    hl(wm param0) {
        ((hl) this).field_c = null;
        ((hl) this).field_a = param0;
        this.a(11936);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Names cannot contain consecutive spaces";
        field_h = "Just play";
        field_d = new cg(1, 2, 2, 0);
        field_g = new cg(4, 1, 1, 1);
    }
}
