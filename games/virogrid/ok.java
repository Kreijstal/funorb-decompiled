/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok extends fd implements im, ta {
    private b field_H;
    static String field_K;
    static int field_L;
    static boolean field_J;
    private nk field_D;
    static int field_G;
    private tg field_I;
    static String field_E;

    public static void f(int param0) {
        field_K = null;
        field_E = null;
        if (param0 != -100) {
            field_J = true;
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        if (!(!super.a(param0, param1, param2, 94))) {
            return true;
        }
        if (!(-99 != (param2 ^ -1))) {
            return ((ok) this).b(2, param0);
        }
        int var5 = -34 % ((param3 - -75) / 36);
        if (-100 == (param2 ^ -1)) {
            return ((ok) this).a(-16234, param0);
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, e param9, int param10, mg[] param11, int param12, int param13, int param14, int param15, mg[] param16, e param17, mg[] param18, int param19, int param20) {
        oj.a(param13, new wg(param11), param14, param20, param2, param19, param12, param6, param7, param8, param1, new wg(param16), (byte) -29, param15, param17, param4, param10, param9, param0, new wg(param18), param5);
        if (param3 != -100) {
            ok.f(-30);
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        if (param0 != 12085) {
          L0: {
            ((ok) this).field_D = null;
            if (((ok) this).field_I == param1) {
              ul.a(15429);
              ((ok) this).field_H.h(true);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ok) this).field_I == param1) {
              ul.a(15429);
              ((ok) this).field_H.h(true);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final String a(byte param0) {
        if (param0 < 116) {
            Object var3 = null;
            ((ok) this).a(62, -11, false, (nk) null);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    ok(b param0) {
        super(0, 0, 288, 0, (ol) null);
        ((ok) this).field_H = param0;
        ((ok) this).field_I = new tg(md.field_c, (cd) null);
        ((ok) this).field_I.field_w = (ol) (Object) new hf();
        String var7 = oi.a(new String[2], gh.field_Kb, 2);
        int var3 = 20;
        aj var4 = new aj(dj.field_h, 0, 0, 0, 0, 16777215, -1, 3, 0, dj.field_h.field_H, -1, 2147483647, true);
        ((ok) this).field_D = new nk(var7, (ol) (Object) var4);
        ((ok) this).field_D.field_h = "";
        ((ok) this).field_D.a(al.field_g, (byte) -100, 0);
        ((ok) this).field_D.a(al.field_g, (byte) -126, 1);
        ((ok) this).field_D.field_g = ((ok) this).field_g - 40;
        ((ok) this).field_D.field_o = (cd) this;
        ((ok) this).field_D.a(-40 + ((ok) this).field_g, var3, 26, (byte) -125);
        var3 = var3 + (((ok) this).field_D.field_m + 15);
        ((ok) this).a((fi) (Object) ((ok) this).field_D, (byte) -78);
        int var5 = 4;
        int var6 = 200;
        ((ok) this).field_I.a(40, true, var3, -var6 + 300 >> 306608929, var6);
        ((ok) this).field_I.field_o = (cd) this;
        ((ok) this).a((fi) (Object) ((ok) this).field_I, (byte) -78);
        ((ok) this).a(var5 + (55 + var3), true, 0, 0, 300);
    }

    public final void a(int param0, int param1, boolean param2, nk param3) {
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        if (param2) {
          if (0 == param0) {
            wf.a("terms.ws", 12);
            return;
          } else {
            if (-2 == (param0 ^ -1)) {
              wf.a("privacy.ws", 12);
              return;
            } else {
              if (-3 != (param0 ^ -1)) {
                return;
              } else {
                wf.a("conduct.ws", 12);
                return;
              }
            }
          }
        } else {
          field_J = true;
          if (0 == param0) {
            wf.a("terms.ws", 12);
            return;
          } else {
            if (-2 == (param0 ^ -1)) {
              wf.a("privacy.ws", 12);
              return;
            } else {
              if (-3 == (param0 ^ -1)) {
                wf.a("conduct.ws", 12);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final static void b(boolean param0, int param1) {
        if (param1 != 3410) {
          field_E = null;
          oi.a(param0, 6);
          cg.a(param0, param1 + 3441);
          return;
        } else {
          oi.a(param0, 6);
          cg.a(param0, param1 + 3441);
          return;
        }
    }

    private final String a(int param0) {
        if (param0 != -18042) {
            return null;
        }
        return "</col></u>";
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_E = "<%0> has withdrawn the request to join.";
    }
}
