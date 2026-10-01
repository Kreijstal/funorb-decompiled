/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static String idleMessage20MinText;
    static String createDoubleSpaceAlertText;
    static int releasesPerTheme;
    static int field_f;
    static int field_e;
    static boolean entitiesDetachedThisTick;
    static qc field_c;
    static int field_i;
    static String[] membersExpansionBenefitTexts;

    final static void a(String param0, int param1, boolean param2) {
        mi.field_I = param2;
        if (param1 != 480) {
            return;
        }
        try {
            va.field_d = true;
            Geoblox.field_y = new f(kd.field_e, hh.field_c, param0, cf.field_i, mi.field_I);
            kd.field_e.a(false, Geoblox.field_y);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        idleMessage20MinText = null;
        if (param0 != 30970) {
            return;
        }
        createDoubleSpaceAlertText = null;
        membersExpansionBenefitTexts = null;
    }

    static {
        releasesPerTheme = 60;
        field_f = 14;
        idleMessage20MinText = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        createDoubleSpaceAlertText = "Names cannot contain consecutive spaces";
        field_e = 0;
        field_i = 480;
        membersExpansionBenefitTexts = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
