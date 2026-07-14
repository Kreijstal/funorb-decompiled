/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb implements Iterable {
    static ll[] field_c;
    static String field_b;
    tf field_g;
    static byte[] field_d;
    static int field_f;
    static String field_e;
    static String field_a;

    final static void a(byte param0) {
        hf.a(29, new int[9], param0 ^ -9, 0, 146, 577, 250);
        hf.a(31, new int[5], 0, 1, 320, 288, 32);
        hf.a(31, new int[7], 0, 2, 320, 288, 32);
        hf.a(31, new int[2], 0, 3, 32, 288, 32);
        hf.a(31, new int[5], 0, 4, 320, 288, 32);
        hf.a(31, new int[1], 0, 5, 410, 480, 160);
        hf.a(31, new int[2], 0, 6, 410, 480, 160);
        hf.a(31, new int[3], param0 ^ -9, 7, 430, 540, 70);
        hf.a(31, new int[4], param0 ^ -9, 8, 400, 480, 160);
        hf.a(31, new int[1], 0, 9, 400, 540, 290);
        hf.a(31, new int[2], 0, 10, 200, 540, 50);
        hf.a(31, new int[2], 0, 11, 430, 540, 110);
        hf.a(31, new int[2], param0 + 9, 12, 430, 540, 110);
        hf.a(31, new int[1], 0, 13, 430, 420, 220);
        if (param0 != -9) {
          return;
        } else {
          hf.a(31, new int[5], 0, 14, 430, 420, 220);
          hf.a(29, new int[4], 0, 15, 146, 577, 250);
          hf.a(31, new int[1], 0, 16, 200, 540, 50);
          return;
        }
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
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_7_0 = null;
            String stackOut_6_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = ArcanistsMulti.field_G ? 1 : 0;
                        if (param1 < -119) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return null;
                    }
                    case 2: {
                        try {
                            var9 = param0.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) ei.a(param0, 119, "getcookies");
                            var5 = eh.a(false, ';', var4);
                            var6 = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5.length <= var6) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = var5[var6].substring(1 + var7).trim();
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return (String) (Object) stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var6++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2 = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (vm.field_b != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        return param0.getParameter("settings");
                    }
                    case 13: {
                        return vm.field_b;
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
        ab var2 = null;
        if (!param1) {
          return;
        } else {
          var2 = he.field_e;
          var2.b((byte) -124, param0);
          var2.f(1, (byte) -54);
          var2.f(2, (byte) -47);
          return;
        }
    }

    final void a(byte param0, tf param1) {
        L0: {
          if (null != param1.field_i) {
            param1.a((byte) 88);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_l = ((gb) this).field_g;
        param1.field_i = ((gb) this).field_g.field_i;
        if (param0 != 37) {
          return;
        } else {
          param1.field_i.field_l = param1;
          param1.field_l.field_i = param1;
          return;
        }
    }

    gb() {
        ((gb) this).field_g = new tf();
        ((gb) this).field_g.field_l = ((gb) this).field_g;
        ((gb) this).field_g.field_i = ((gb) this).field_g;
    }

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        int var1 = 2 % ((76 - param0) / 36);
        field_a = null;
    }

    final static void a(int param0) {
        Object var2 = null;
        L0: {
          oj.field_i = false;
          if (nn.field_q != null) {
            nn.field_q.e(-111);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 14) {
          if (nj.field_c != 0) {
            ue.b(10);
            ng.field_K = 0;
            return;
          } else {
            ng.field_K = 0;
            return;
          }
        } else {
          var2 = null;
          String discarded$5 = gb.a((java.applet.Applet) null, 114);
          if (nj.field_c == 0) {
            ng.field_K = 0;
            return;
          } else {
            ue.b(10);
            ng.field_K = 0;
            return;
          }
        }
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
