/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wf implements Iterable {
    static String field_e;
    pa field_a;
    static int field_c;
    static String field_d;
    static rh field_b;

    final static wj c(int param0) {
        if (param0 != 0) {
            wj discarded$0 = wf.c(120);
            return (wj) (Object) new o();
        }
        return (wj) (Object) new o();
    }

    final void a(int param0, pa param1) {
        int var3 = 0;
        if (param1.field_m != null) {
          param1.e(-122);
          var3 = -53 % ((param0 - 9) / 32);
          param1.field_p = ((wf) this).field_a;
          param1.field_m = ((wf) this).field_a.field_m;
          param1.field_m.field_p = param1;
          param1.field_p.field_m = param1;
          return;
        } else {
          var3 = -53 % ((param0 - 9) / 32);
          param1.field_p = ((wf) this).field_a;
          param1.field_m = ((wf) this).field_a.field_m;
          param1.field_m.field_p = param1;
          param1.field_p.field_m = param1;
          return;
        }
    }

    final static boolean b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 < -90) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_d = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var1 = (Object) (Object) rh.field_f;
                    // monitorenter rh.field_f
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (tl.field_o == tc.field_h) {
                            statePc = 5;
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var1
                        stackOut_5_0 = 0;
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
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        ji.field_a = hj.field_b[tl.field_o];
                        id.field_b = pf.field_d[tl.field_o];
                        tl.field_o = 1 + tl.field_o & 127;
                        // monitorexit var1
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final pa d(int param0) {
        pa var2 = null;
        if (param0 == -27593) {
          var2 = ((wf) this).field_a.field_p;
          if (((wf) this).field_a == var2) {
            return null;
          } else {
            var2.e(123);
            return var2;
          }
        } else {
          return null;
        }
    }

    private wf() throws Throwable {
        throw new Error();
    }

    final static vb a(int param0, int param1, int param2, ce param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        vb var7 = null;
        java.awt.Frame var8 = null;
        var8 = pf.a(param0 + 18316, param2, param5, param3, param1, param4);
        var6 = var8;
        if (var8 == null) {
          return null;
        } else {
          var7 = new vb();
          var7.field_b = var8;
          java.awt.Component discarded$2 = var7.field_b.add((java.awt.Component) (Object) var7);
          var7.setBounds(param0, 0, param1, param5);
          var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
          var7.requestFocus();
          return var7;
        }
    }

    final static void a(String param0, boolean param1, boolean param2) {
        ah.field_c = true;
        ud.field_c = param2 ? true : false;
        ok.field_x = new bd(nb.field_a, rg.field_o, param0, jg.field_d, ud.field_c);
        nb.field_a.b((qa) (Object) ok.field_x, (byte) -35);
        if (param1) {
            field_e = null;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_b = null;
        field_d = null;
        field_e = null;
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new rc((wf) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Names cannot contain consecutive spaces";
    }
}
