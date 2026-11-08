/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScoreboardNameRecord {
    static UiComponent field_d;
    String field_b;
    String field_f;
    static String hotseatmultiplayer;
    static int field_g;
    static DisplayNamePanel field_a;
    boolean field_c;

    final static void a(int param0, boolean param1, boolean param2, String param3) {
        try {
          OptionsScreen.f(-1);
          TabbedPane.field_Ub.hideAllDialogs(-22216);
          TextLineLayout.field_j = new LoginForm(SpriteState.field_x, (String) null, ProjectedVertex.field_e, param1, param2);
          int var4_int = 113 % ((param0 + 67) / 53);
          RasterSnapshot.field_n = new AccountContentDialog(TabbedPane.field_Ub, TextLineLayout.field_j);
          TabbedPane.field_Ub.showDialog(RasterSnapshot.field_n, 30000);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "tg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
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
