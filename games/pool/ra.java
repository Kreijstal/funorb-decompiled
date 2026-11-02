/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    static String tabHidechattemporarily;
    static qf[] field_f;
    static String muChatGameShowAll;
    static String createtouse;
    static ph field_e;
    static int[][] field_b;

    public static void a(boolean param0) {
        field_e = null;
        muChatGameShowAll = null;
        if (!param0) {
          tabHidechattemporarily = null;
          createtouse = null;
          field_b = (int[][]) null;
          field_f = null;
          return;
        }
        ra.a(false);
        tabHidechattemporarily = null;
        createtouse = null;
        field_b = (int[][]) null;
        field_f = null;
    }

    final static void a(byte param0) {
        re.field_b = false;
        if (param0 != -108) {
          ra.a((byte) -36);
        }
    }

    final static void a(int param0, oi param1, int param2) {
        oq var5 = ej.field_j;
        var5.b(false, param0);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        var5.a(1, false);
        var5.a(param1.field_t, false);
        var5.c(-128, param1.field_l);
        var5.a(true, param1.field_u);
        var5.a(true, param1.field_m);
        var5.a(true, param1.field_s);
        var5.a(true, param1.field_p);
        var5.d(-1, var4);
        if (param2 > -23) {
          return;
        }
        try {
          var5.b(var5.position - var4, true);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ra.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        muChatGameShowAll = "Show all game chat";
        tabHidechattemporarily = "TAB - hide chat temporarily";
        createtouse = "Create a free account to start using this feature";
        field_e = new ph();
    }
}
