/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq extends fa {
    pl[] field_g;
    static byte[][] field_f;
    static IntrusiveDeque pendingScoreSubmissions;
    static kq field_i;
    static vd[] field_h;
    static String[] field_e;

    final static boolean c(boolean param0) {
        if (!ei.a("jaclib", (byte) -16)) {
          return false;
        }
        if (param0) {
          return ei.a("hw3d", (byte) -16);
        }
        pendingScoreSubmissions = (IntrusiveDeque) null;
        return ei.a("hw3d", (byte) -16);
    }

    public static void b(int param0) {
        field_f = (byte[][]) null;
        field_h = null;
        pendingScoreSubmissions = null;
        field_e = null;
        field_i = null;
        if (param0 != 400) {
          field_f = (byte[][]) null;
        }
    }

    final static void b(boolean param0) {
        ua.menuActions[4] = new int[]{5};
        if (!param0) {
          tq.b(false);
        }
        aa.menuScreens[4] = new MenuScreen(4);
        za.registerMenuLayout(32, new int[]{8, 9, 10, 21, 5, 20}, 400, 30, 2, 468, (byte) 120);
        aa.menuScreens[2] = new MenuScreen(2);
        if (qr.field_a <= 0) {
          co.returnMenuId = 0;
          if ((64 & hg.field_D) != 0) {
            si.c(true);
            return;
          }
          if (ln.field_d < 2) {
            return;
          }
          si.c(true);
          return;
        }
        if (cn.a(pt.field_b, (byte) 75)) {
          za.registerMenuLayout(32, new int[]{1, 12, 13, 4, 3, 7}, 180, 170, 1, 470, (byte) 121);
          aa.menuScreens[1] = new MenuScreen(1);
          za.registerMenuLayout(32, new int[]{12, 13, 4, 5}, 180, 170, 7, 470, (byte) 87);
          aa.menuScreens[7] = new MenuScreen(7);
        }
        co.returnMenuId = 0;
        if ((64 & hg.field_D) != 0) {
          si.c(true);
          return;
        }
        if (ln.field_d >= 2) {
          si.c(true);
          return;
        }
    }

    tq(pl[] param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "tq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new byte[250][];
        pendingScoreSubmissions = new IntrusiveDeque();
        field_e = new String[]{"All scores", "My scores", "Best each"};
    }
}
