/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ni implements Iterable {
    bf field_b;
    static java.applet.Applet field_e;
    static String[] field_d;
    static int field_a;
    static ai[] field_c;

    public final Iterator iterator() {
        return (Iterator) ((Object) new nd((ni) (this)));
    }

    final static ed[] a(int param0, hb param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        ed[] var4 = null;
        int var5 = 0;
        int var6_int = 0;
        ed var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ed[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2_int = param1.f(8, 8);
                        if (-1 <= (var2_int ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (ed[]) ((Object) stackIn_3_0);
                }
                case 4: {
                    try {
                        var3 = param1.f(param0 + -4, param0);
                        var4 = new ed[var3];
                        var5 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var5 >= var3) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (vg.a(100, param1)) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var6_int = param1.f(param0 ^ 4, qg.a((byte) 105, var5 + -1));
                        var4[var5] = var4[var6_int];
                        if (var7 == 0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = new ed();
                        param1.f(8, 24);
                        param1.f(8, 24);
                        var6.field_e = param1.f(8, 24);
                        param1.f(param0 + -4, 9);
                        param1.f(8, 12);
                        param1.f(8, 12);
                        param1.f(param0 + -4, 12);
                        var4[var5] = var6;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var5++;
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = (ed[]) (var4);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0;
                }
                case 12: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_14_0 = (RuntimeException) (var2);
                    stackIn_13_0 = stackIn_14_0;
                    stackIn_14_1 = new StringBuilder().append("ni.C(").append(param0).append(',');
                    stackIn_13_1 = stackIn_14_1;
                    if (param1 == null) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_15_2 = "{...}";
                    statePc = 15;
                    continue stateLoop;
                }
                case 14: {
                    stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                    stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                    stackIn_15_2 = "null";
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(int param0, bf param1) {
        try {
            if (!(null == param1.field_e)) {
                param1.a(7847);
            }
            if (param0 != 12) {
                field_d = (String[]) null;
            }
            param1.field_g = this.field_b;
            param1.field_e = this.field_b.field_e;
            param1.field_e.field_g = param1;
            param1.field_g.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ni.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.removeKeyListener(wj.field_k);
            if (param1 > -123) {
                java.awt.Component var3 = (java.awt.Component) null;
                ni.a((java.awt.Component) null, (byte) -124);
            }
            param0.removeFocusListener(wj.field_k);
            vf.field_a = -1;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "ni.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final bf b(byte param0) {
        bf var2;
        hb var3;
        if (param0 <= -73) {
          var2 = this.field_b.field_g;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.a(7847);
            return var2;
          }
        } else {
          var3 = (hb) null;
          ni.a(109, (hb) null);
          var2 = this.field_b.field_g;
          if (var2 == this.field_b) {
            return null;
          } else {
            var2.a(7847);
            return var2;
          }
        }
    }

    private ni() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        if (param0 < 81) {
            return;
        }
        field_d = null;
    }

    static {
        field_d = new String[255];
        field_a = 0;
        field_c = new ai[4];
    }
}
