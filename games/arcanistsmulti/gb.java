/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class gb implements Iterable {
    static ll[] field_c;
    static String field_b;
    tf field_g;
    static byte[] field_d;
    static int field_f;
    static String field_e;
    static String field_a;

    final static void a() {
        hf.a(29, new int[9], 0, 0, 146, 577, 250);
        hf.a(31, new int[5], 0, 1, 320, 288, 32);
        hf.a(31, new int[7], 0, 2, 320, 288, 32);
        hf.a(31, new int[2], 0, 3, 32, 288, 32);
        hf.a(31, new int[5], 0, 4, 320, 288, 32);
        hf.a(31, new int[1], 0, 5, 410, 480, 160);
        hf.a(31, new int[2], 0, 6, 410, 480, 160);
        hf.a(31, new int[3], 0, 7, 430, 540, 70);
        hf.a(31, new int[4], 0, 8, 400, 480, 160);
        hf.a(31, new int[1], 0, 9, 400, 540, 290);
        hf.a(31, new int[2], 0, 10, 200, 540, 50);
        hf.a(31, new int[2], 0, 11, 430, 540, 110);
        hf.a(31, new int[2], 0, 12, 430, 540, 110);
        hf.a(31, new int[1], 0, 13, 430, 420, 220);
        hf.a(31, new int[5], 0, 14, 430, 420, 220);
        hf.a(29, new int[4], 0, 15, 146, 577, 250);
        hf.a(31, new int[1], 0, 16, 200, 540, 50);
    }

    final tf b(int param0) {
        tf var2 = null;
        if (param0 == 31) {
          var2 = ((gb) this).field_g.field_l;
          if (var2 == ((gb) this).field_g) {
            return null;
          } else {
            var2.a((byte) 88);
            return var2;
          }
        } else {
          field_a = null;
          var2 = ((gb) this).field_g.field_l;
          if (var2 == ((gb) this).field_g) {
            return null;
          } else {
            var2.a((byte) 88);
            return var2;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new fh((gb) this);
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_15_0 = null;
            String stackIn_17_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            Object stackOut_2_0 = null;
            String stackOut_8_0 = null;
            String stackOut_14_0 = null;
            String stackOut_16_0 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ArcanistsMulti.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param1 < -119) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = null;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return (String) (Object) stackIn_3_0;
                    }
                    case 4: {
                        try {
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) ei.a(param0, 119, "getcookies");
                            var5 = eh.a(false, ';', var4);
                            var6 = 0;
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
                            if (var5.length <= var6) {
                                statePc = 13;
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
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 10;
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
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 10;
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
                            stackOut_8_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var6++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var2 = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (vm.field_b == null) {
                                statePc = 16;
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
                            stackOut_14_0 = vm.field_b;
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = param0.getParameter("settings");
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
                        var2_ref = (RuntimeException) (Object) caughtException;
                        stackOut_18_0 = (RuntimeException) var2_ref;
                        stackOut_18_1 = new StringBuilder().append("gb.C(");
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        if (param0 == null) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "{...}";
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        stackIn_21_2 = stackOut_19_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "null";
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        stackIn_21_2 = stackOut_20_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        throw aa.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param1 + ')');
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

    final static void a(int param0, boolean param1) {
        ab var2 = he.field_e;
        var2.b((byte) -124, param0);
        var2.f(1, (byte) -54);
        var2.f(2, (byte) -47);
    }

    final void a(byte param0, tf param1) {
        if (!(null == param1.field_i)) {
            param1.a((byte) 88);
        }
        param1.field_l = ((gb) this).field_g;
        param1.field_i = ((gb) this).field_g.field_i;
        if (param0 != 37) {
            return;
        }
        try {
            param1.field_i.field_l = param1;
            param1.field_l.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "gb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gb() {
        ((gb) this).field_g = new tf();
        ((gb) this).field_g.field_l = ((gb) this).field_g;
        ((gb) this).field_g.field_i = ((gb) this).field_g;
    }

    public static void b() {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        int var1 = 0;
        field_a = null;
    }

    final static void a(int param0) {
        oj.field_i = false;
        if (!(nn.field_q == null)) {
            nn.field_q.e(-111);
        }
        if (nj.field_c != 0) {
            ue.b(10);
            ng.field_K = 0;
            return;
        }
        ng.field_K = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Allow spectators?";
        field_a = "Return to lobby";
        field_e = "Click the mouse to summon the minion. You can only summon within the shown summoning circle and clear of the landscape. Minions are either living, arcane or undead.";
    }
}
