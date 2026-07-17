/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo {
    static String field_c;
    static String field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 256) {
            vo.a(45);
        }
    }

    final static void a(bc param0, bc param1) {
        try {
            mj.field_Sb = new io(param1, param0);
            qf discarded$0 = gg.a(128, 153, "shatteredplans_menu_open");
            qf discarded$1 = gg.a(128, 153, "shatteredplans_menu_close");
            us.field_d = gg.a(128, 256, "shatteredplans_ship_selection");
            hs.field_l = gg.a(128, 256, "shatteredplans_ship_move_order");
            jj.field_l = gg.a(128, 256, "shatteredplans_ship_attack_order");
            qc.field_w = gg.a(128, 256, "shatteredplans_factory_noise");
            pd.field_m = jj.a((byte) -111, 120, "shatteredplans_explosion");
            qf discarded$2 = gg.a(128, 100, "shatteredplans_tab_open");
            qf discarded$3 = gg.a(128, 100, "shatteredplans_tab_close");
            ub.field_yb = gg.a(128, 256, "shatteredplans_next_open");
            sf.field_g = gg.a(128, 256, "shatteredplans_next_close");
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "vo.A(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + 100 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Right click to cancel the <%0> at <%1>";
        field_a = "Battles lost in friendly space.";
    }
}
