/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class kj extends ee implements gk {
    static ka[] field_C;
    sl field_F;
    static int field_D;
    static sl field_B;
    static String field_E;
    static String field_H;
    static int field_A;
    static int field_G;
    static boolean[] field_I;

    final boolean a(ee param0, int param1) {
        int var5 = TorChallenge.field_F ? 1 : 0;
        nj var3 = new nj(((kj) this).field_F);
        ee var4 = (ee) (Object) var3.c(param1);
        while (var4 != null) {
            if (var4.a(param0, 0)) {
                return true;
            }
            var4 = (ee) (Object) var3.a(false);
        }
        return false;
    }

    void a(int param0, int param1, boolean param2, int param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (0 == param3) {
            if (((kj) this).field_q != null) {
                ((kj) this).field_q.a((ee) this, param0, param1, (byte) 97, true);
            }
        }
        nj var5 = new nj(((kj) this).field_F);
        ee var6 = (ee) (Object) var5.a(-48);
        while (var6 != null) {
            var6.a(((kj) this).field_i + param0, param1 - -((kj) this).field_m, false, param3);
            var6 = (ee) (Object) var5.c((byte) -13);
        }
        if (param2) {
            field_E = null;
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) hl.field_d;
                    // monitorenter hl.field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (kc.field_n == ja.field_f) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        b.field_J = fj.field_C[ja.field_f];
                        di.field_m = ql.field_k[ja.field_f];
                        ja.field_f = ja.field_f - -1 & 127;
                        var2 = 93 % ((param0 - 48) / 46);
                        // monitorexit var1
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        if (!(!((kj) this).a(param0, param1, -125, param2))) {
            ((kj) this).a(param2, 127, param0, param1);
            this.a(param0, param2, param1, 127);
        }
        if (!param3) {
            kj.g(7);
        }
        return param2;
    }

    final int e(int param0) {
        int var5 = 0;
        int var6 = TorChallenge.field_F ? 1 : 0;
        int var2 = 0;
        if (param0 != -15000) {
            return 36;
        }
        nj var3 = new nj(((kj) this).field_F);
        ee var4 = (ee) (Object) var3.c(0);
        while (var4 != null) {
            var5 = var4.e(-15000);
            if (var2 < var5) {
                var2 = var5;
            }
            var4 = (ee) (Object) var3.a(false);
        }
        return var2;
    }

    kj(int param0, int param1, int param2, int param3, j param4) {
        super(param0, param1, param2, param3, param4, (gg) null);
        ((kj) this).field_F = new sl();
    }

    final boolean b(int param0, ee param1) {
        nj var5 = null;
        ee var6 = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (param0 < 70) {
            Object var8 = null;
            StringBuilder discarded$0 = ((kj) this).a((Hashtable) null, -30, (StringBuilder) null, true);
        }
        if (((kj) this).field_F.d(-127)) {
            return false;
        }
        nj var9 = new nj(((kj) this).field_F);
        ee var4 = (ee) (Object) var9.c(0);
        while (var4 != null) {
            if (var4.c(94)) {
                var5 = new nj(((kj) this).field_F);
                da discarded$1 = var5.b((da) (Object) var4, -117);
                var6 = (ee) (Object) var5.a(false);
                while (var6 != null) {
                    if (var6.a(param1, 0)) {
                        return true;
                    }
                    var6 = (ee) (Object) var5.a(false);
                }
            }
            var4 = (ee) (Object) var9.a(false);
        }
        return false;
    }

    final String b(boolean param0) {
        nj var2 = null;
        ee var3 = null;
        String var4 = null;
        int var5 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          var2 = new nj(((kj) this).field_F);
          if (!param0) {
            break L0;
          } else {
            field_D = -74;
            break L0;
          }
        }
        var3 = (ee) (Object) var2.c(0);
        L1: while (true) {
          if (var3 != null) {
            var4 = var3.b(param0);
            if (var4 != null) {
              return var4;
            } else {
              var3 = (ee) (Object) var2.a(false);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        int var9 = TorChallenge.field_F ? 1 : 0;
        nj var7 = new nj(((kj) this).field_F);
        ee var8_ref_ee = (ee) (Object) var7.c(0);
        while (var8_ref_ee != null) {
            // ifeq L85
            var8_ref_ee.a(((kj) this).field_i + param0, (byte) 31, param2, param3 - -((kj) this).field_m, param4, param5);
            var8_ref_ee = (ee) (Object) var7.a(false);
        }
        int var8 = -88 % ((-29 - param1) / 39);
    }

    final boolean c(int param0) {
        if (param0 <= 76) {
            return true;
        }
        return null != ((kj) this).d((byte) 107) ? true : false;
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) te.field_b);
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) te.field_b);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) te.field_b);
        int var2 = -85 % ((param0 - -48) / 57);
    }

    private final void a(Hashtable param0, StringBuilder param1, int param2, int param3) {
        int var7 = 0;
        int var8 = TorChallenge.field_F ? 1 : 0;
        nj var5 = new nj(((kj) this).field_F);
        ee var6 = (ee) (Object) var5.c(0);
        while (var6 != null) {
            StringBuilder discarded$0 = param1.append(10);
            for (var7 = 0; var7 <= param2; var7++) {
                StringBuilder discarded$1 = param1.append(32);
            }
            StringBuilder discarded$2 = var6.a(param0, param2 + 1, param1, true);
            var6 = (ee) (Object) var5.a(false);
        }
        if (param3 != 127) {
            field_A = 9;
        }
    }

    ee d(byte param0) {
        nj var2 = null;
        ee var3 = null;
        int var4 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = new nj(((kj) this).field_F);
        if (param0 == 107) {
          var3 = (ee) (Object) var2.c(0);
          L0: while (true) {
            if (var3 != null) {
              if (!var3.c(109)) {
                var3 = (ee) (Object) var2.a(false);
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, ee param1) {
        ((kj) this).field_F.a((da) (Object) param1, param0 + -128);
        if (param0 != 0) {
            Object var4 = null;
            StringBuilder discarded$0 = ((kj) this).a((Hashtable) null, 58, (StringBuilder) null, true);
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 < 100) {
            field_H = null;
        }
        super.a((byte) 126, param1, param2, param3, param4);
        this.c((byte) 112);
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        nj var5 = new nj(((kj) this).field_F);
        ee var8 = (ee) (Object) var5.c(0);
        while (var8 != null) {
            // ifeq L88
            if (var8.c(80)) {
                if (!(!var8.a(param0, param1, (byte) 73, param3))) {
                    return true;
                }
            }
            var8 = (ee) (Object) var5.a(false);
        }
        int var6 = param0;
        if (!(var6 != 80)) {
            return !nj.field_c[81] ? ((kj) this).b(89, param3) : ((kj) this).a(param3, (byte) -16);
        }
        if (param2 < 9) {
            field_E = null;
            return false;
        }
        return false;
    }

    final boolean a(int param0, int param1, int param2, int param3, ee param4, int param5, int param6) {
        int var10 = TorChallenge.field_F ? 1 : 0;
        nj var8 = new nj(((kj) this).field_F);
        ee var9 = (ee) (Object) var8.c(param0);
        while (var9 != null) {
            // ifeq L92
            if (var9.c(103)) {
                if (var9.a(param0 ^ 0, param1, param2, param3, param4, param5, param6)) {
                    return true;
                }
            }
            var9 = (ee) (Object) var8.a(false);
        }
        return false;
    }

    void a(ee param0, int param1, byte param2, int param3) {
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (param2 > -97) {
            ((kj) this).a(58, 106, true, -8);
        }
        super.a(param0, param1, (byte) -100, param3);
        nj var5 = new nj(((kj) this).field_F);
        ee var6 = (ee) (Object) var5.c(0);
        while (var6 != null) {
            // ifeq L111
            var6.a(param0, ((kj) this).field_m + param1, (byte) -111, param3 - -((kj) this).field_i);
            var6 = (ee) (Object) var5.a(false);
        }
    }

    final void d(int param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        nj var2 = new nj(((kj) this).field_F);
        if (param0 != 6064) {
            return;
        }
        ee var3 = (ee) (Object) var2.c(0);
        while (var3 != null) {
            var3.d(6064);
            var3 = (ee) (Object) var2.a(false);
        }
    }

    private final void c(byte param0) {
        int var4 = TorChallenge.field_F ? 1 : 0;
        if (param0 != 112) {
            Object var5 = null;
            boolean discarded$0 = ((kj) this).b(20, (ee) null);
        }
        nj var2 = new nj(((kj) this).field_F);
        ee var3 = (ee) (Object) var2.c(param0 + -112);
        while (var3 != null) {
            var3.b((byte) 113);
            var3 = (ee) (Object) var2.a(false);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        int var10 = TorChallenge.field_F ? 1 : 0;
        nj var8 = new nj(((kj) this).field_F);
        if (param2 != -81) {
            return false;
        }
        ee var9 = (ee) (Object) var8.c(0);
        while (var9 != null) {
            // ifeq L103
            if (!(!var9.a(param0, param1, -81, param3 - -((kj) this).field_i, ((kj) this).field_m + param4, param5, param6))) {
                return true;
            }
            var9 = (ee) (Object) var8.a(false);
        }
        return false;
    }

    final boolean a(ee param0, byte param1) {
        nj var5 = null;
        ee var6 = null;
        int var7 = TorChallenge.field_F ? 1 : 0;
        if (((kj) this).field_F.d(param1 ^ 116)) {
            return false;
        }
        nj var9 = new nj(((kj) this).field_F);
        if (param1 != -16) {
            Object var8 = null;
            ((kj) this).a(-35, (byte) -17, (ee) null, 41, 16, 15);
        }
        ee var4 = (ee) (Object) var9.a(-108);
        while (var4 != null) {
            if (!(!var4.c(110))) {
                var5 = new nj(((kj) this).field_F);
                da discarded$0 = var5.a((da) (Object) var4, -61);
                var6 = (ee) (Object) var5.c((byte) -13);
                while (var6 != null) {
                    if (!(!var6.a(param0, 0))) {
                        return true;
                    }
                    var6 = (ee) (Object) var5.c((byte) -13);
                }
            }
            var4 = (ee) (Object) var9.c((byte) -13);
        }
        return false;
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        if (param0 != 74) {
            Object var4 = null;
            int discarded$0 = kj.a((byte) 70, (CharSequence) null, 37);
        }
        return vh.a((byte) 86, true, param2, param1);
    }

    public static void g(int param0) {
        field_H = null;
        field_I = null;
        field_E = null;
        field_C = null;
        if (param0 != -10365) {
            field_D = 8;
        }
        field_B = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 0;
        field_B = new sl();
        field_G = -1;
        field_I = new boolean[6];
        field_H = "Sound: ";
        field_A = -1;
        field_E = "Return to game";
    }
}
