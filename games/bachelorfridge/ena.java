/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends pu {
    static byte[][] field_p;
    static ee field_l;
    static tn field_m;
    static String[] field_o;
    static int field_n;

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_p = null;
        field_o = null;
        field_l = null;
        field_m = null;
    }

    final static void a(byte param0, vr param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        System.gc();
        gna.f((byte) -98);
        cga.field_r = ch.a(param1, param0 ^ 43, "basic", "freezer_side");
        kja.field_e = wfa.a("ice_cube", param1, "basic", (byte) 113);
        jla.field_d = ch.a(param1, -1, "basic", "ice_tray_mid");
        vl.field_c = ch.a(param1, -1, "basic", "ice_tray_top");
        an.field_r = ch.a(param1, -1, "basic", "ice_tray_lower");
        ee discarded$0 = ch.a(param1, -1, "basic", "freezer_open");
        dc.field_y = pi.a(param1, param0 ^ 8871, "basic", "food_icons");
        ca.field_c = pi.a(param1, -8845, "basic", "food_icons_mouldy");
        a.field_n = pi.a(param1, -8845, "basic", "food_icons_eaten");
        gr.field_a = new kv[dc.field_y.length];
        for (var2_int = 0; var2_int < gr.field_a.length; var2_int++) {
            gr.field_a[var2_int] = new kv(39, 39);
            gr.field_a[var2_int].b();
            dg.c(0, 0, 39, 39, 16700762);
            nk.a((pa) (Object) dc.field_y[var2_int]).b(0, 0, 39, 39);
        }
        hga.field_U.a((byte) -10);
        kka.field_i = new kv[dc.field_y.length];
        for (var2_int = 0; kka.field_i.length > var2_int; var2_int++) {
            kka.field_i[var2_int] = new kv(39, 39);
            kka.field_i[var2_int].b();
            dg.c(0, 0, 39, 39, 12688481);
            nk.a((pa) (Object) dc.field_y[var2_int]).b(0, 0, 39, 39);
        }
        hga.field_U.a((byte) 114);
        kv[] discarded$1 = hk.a("basic_frame", param1, param0 + 152, "basic");
        wd.field_w = hk.a("button_frame", param1, -54, "basic");
        bla.field_p = hk.a("button_frame_hover", param1, -68, "basic");
        op.field_I = hk.a("button_frame_pressed", param1, 60, "basic");
        bt.field_r = pi.a(param1, -8845, "basic", "stars");
        kv[] discarded$2 = kla.a(bt.field_r, 96);
        wq.field_k = wfa.a("creatureviewer_bg", param1, "basic", (byte) -127);
        a.field_o = wfa.a("selected_splat", param1, "basic", (byte) 106);
        pw.field_y = wfa.a("creatureviewer_button", param1, "basic", (byte) -46);
        gq.field_E = wfa.a("action_bg", param1, "basic", (byte) -97);
        nma.field_v = wfa.a("padlock", param1, "basic", (byte) 70);
        fk.field_s = wfa.a("stamina", param1, "basic", (byte) 91);
        vaa.field_b = wfa.a("speed", param1, "basic", (byte) -30);
        dt.field_a = wfa.a("fisticuffs", param1, "basic", (byte) 74);
        in.field_b = wfa.a("flingstuff", param1, "basic", (byte) 84);
        nw.field_p = gw.a("basic", "category_icons", param1, -102);
        mq.field_b = gw.a("basic", "category_icons_small", param1, -121);
        hh.field_b = pi.a(param1, -8845, "basic", "move_icons");
        nia.field_l = pi.a(param1, -8845, "basic", "icon_frames");
        hp.field_b = new kv[nia.field_l.length];
        for (var2_int = 0; var2_int < nia.field_l.length; var2_int++) {
            hp.field_b[var2_int] = new kv(nia.field_l[var2_int].field_q, nia.field_l[var2_int].field_p);
            hp.field_b[var2_int].b();
            cja.a(5587456, nia.field_l[var2_int], (byte) -116, 0, 0);
            hga.field_U.a((byte) -41);
        }
        cka.field_y = hca.a("basic", param1, -79, "shop_cost_left");
        wja.field_l = hca.a("basic", param1, param0 ^ -76, "shop_cost_right");
        us.field_b = hca.a("basic", param1, 104, "shop_cost_mid");
        kv[] discarded$3 = fw.a((byte) -122, us.field_b, wja.field_l, cka.field_y);
        ps.field_q = ch.a(param1, -1, "basic", "shop_bg");
        ee discarded$4 = ch.a(param1, -1, "basic", "button_add_to_cart");
        fba.field_a = ch.a(param1, -1, "basic", "icon_buy");
        bn.field_h = ch.a(param1, -1, "basic", "icon_buy_hover");
        eq.field_b = hk.a("scroll_green", param1, -76, "basic");
        tq.field_g = hk.a("scroll_yellow", param1, -94, "basic");
        og.field_b = hk.a("scroll_brown", param1, 43, "basic");
        jf.field_l = ch.a(param1, -1, "basic", "tab_shop");
        dr.field_p = ch.a(param1, param0 ^ 43, "basic", "tab_shop_active");
        int[] var9 = new int[256];
        int[] var8 = var9;
        int[] var7 = var8;
        int[] var6 = var7;
        int[] var5 = var6;
        int[] var2 = var5;
        for (var3 = 0; var3 < var9.length; var3++) {
            var5[var3] = 65793 * var3;
        }
        ska.field_k = wfa.a("shop_list", param1, "basic", (byte) -22);
        tl.field_s = wfa.a("shop_list_hover", param1, "basic", (byte) 60);
        rfa.field_a = wfa.a("mag_hover", param1, "basic", (byte) 122);
        kv discarded$5 = wfa.a("rag", param1, "basic", (byte) -35);
        kv discarded$6 = wfa.a("rag_hover", param1, "basic", (byte) 67);
        kv discarded$7 = hca.a("basic", param1, param0 + -50, "bucket");
        kv discarded$8 = hca.a("basic", param1, -125, "bucket_empty");
        ng.field_a = wfa.a("bag_hover", param1, "basic", (byte) 88);
        pea.field_k = wfa.a("bag_bg", param1, "basic", (byte) -108);
        kga.field_d = wfa.a("bag_full_hover", param1, "basic", (byte) -111);
        ve.field_l = pi.a(param1, param0 + -8801, "basic", "arena_entrance_anim");
        rea.field_k = wfa.a("arena_sign_off", param1, "basic", (byte) -100);
        ot.field_e = wfa.a("arena_sign_on", param1, "basic", (byte) 116);
        dp.field_n = pi.a(param1, -8845, "basic", "bin");
        iea.field_a = wfa.a("bin_shadow", param1, "basic", (byte) 117);
        op.field_u = wfa.a("bin_shadow2", param1, "basic", (byte) -117);
        ua.field_d = wfa.a("mould_white", param1, "basic", (byte) 105);
        aw.field_y = wfa.a("mould_green", param1, "basic", (byte) 83);
        oo.field_q = pi.a(param1, param0 ^ 8871, "basic", "sporesplosion");
        bna.field_v = wfa.a("thought_bubble", param1, "basic", (byte) -13);
        iq.field_l = wfa.a("burp", param1, "basic", (byte) 67);
        pja.field_b = gw.a("basic", "counter_numbers", param1, -116);
        gba.field_xb = hca.a("basic", param1, 123, "counter_frame");
        ln.field_v = hca.a("basic", param1, 125, "counter_icon");
        ew.field_q = ch.a(param1, -1, "basic", "tutorial_highlight_arena");
        lfa.field_s = ch.a(param1, -1, "basic", "tutorial_highlight_bag");
        rj.field_l = ch.a(param1, param0 ^ 43, "basic", "tutorial_highlight_bin");
        if (param0 != -44) {
            return;
        }
        ada.field_m = ch.a(param1, param0 ^ 43, "basic", "tutorial_highlight_freezer");
        wa.field_n = ch.a(param1, -1, "basic", "tutorial_highlight_list");
        bn.field_i = ch.a(param1, -1, "basic", "tutorial_highlight_mag");
        var2 = null;
        gg.field_a = wfa.a("padlock_freezer", param1, "basic", (byte) -58);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new byte[1000][];
        field_o = new String[]{"turntime_icons", null, "teamsize_icons", "gamemode_icons", null};
    }
}
