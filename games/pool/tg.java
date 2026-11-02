/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg {
    static vh field_d;
    String field_b;
    String field_f;
    static String hotseatmultiplayer;
    static int field_g;
    static DisplayNamePanel field_a;
    boolean field_c;

    final static void a(int param0, boolean param1, boolean param2, String param3) {
        try {
          be.f(-1);
          wd.field_Ub.hideAllDialogs(-22216);
          vj.field_j = new LoginForm(SpriteState.field_x, (String) null, ro.field_e, param1, param2);
          int var4_int = 113 % ((param0 + 67) / 53);
          tn.field_n = new AccountContentDialog(wd.field_Ub, vj.field_j);
          wd.field_Ub.showDialog(tn.field_n, 30000);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "tg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        hotseatmultiplayer = null;
        field_d = null;
        if (param0 != -10562) {
          field_a = (DisplayNamePanel) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        hotseatmultiplayer = "Hotseat multiplayer game";
    }
}
