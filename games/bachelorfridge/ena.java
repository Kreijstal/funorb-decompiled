/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends pu {
    static byte[][] field_p;
    static IndexedSprite field_l;
    static tn field_m;
    static String[] field_o;
    static int field_n;

    public static void b(boolean param0) {
        if (param0) {
          return;
        }
        field_p = (byte[][]) null;
        field_o = null;
        field_l = null;
        field_m = null;
    }

    final static void a(byte param0, vr param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = BachelorFridge.field_y;
        int var2_intLifetime1;
        int var2_intLifetime2;
        System.gc();
        gna.f((byte) -98);
        cga.field_r = BagpipeSpecial.a(param1, param0 ^ 43, "basic", "freezer_side");
        kja.field_e = FullHealEvent.a("ice_cube", param1, "basic", (byte) 113);
        jla.field_d = BagpipeSpecial.a(param1, -1, "basic", "ice_tray_mid");
        vl.field_c = BagpipeSpecial.a(param1, -1, "basic", "ice_tray_top");
        an.field_r = BagpipeSpecial.a(param1, -1, "basic", "ice_tray_lower");
        BagpipeSpecial.a(param1, -1, "basic", "freezer_open");
        dc.field_y = pi.a(param1, param0 ^ 8871, "basic", "food_icons");
        ca.field_c = pi.a(param1, -8845, "basic", "food_icons_mouldy");
        a.field_n = pi.a(param1, -8845, "basic", "food_icons_eaten");
        gr.field_a = new Sprite[dc.field_y.length];
        for (var2_int = 0; var2_int < gr.field_a.length; var2_int++) {
          gr.field_a[var2_int] = new Sprite(39, 39);
          gr.field_a[var2_int].b();
          SoftwareRasterizer.fillRectangle(0, 0, 39, 39, 16700762);
          nk.a((ArgbSprite) (dc.field_y[var2_int])).b(0, 0, 39, 39);
        }
        hga.field_U.a((byte) -10);
        kka.field_i = new Sprite[dc.field_y.length];
        for (var2_intLifetime1 = 0; kka.field_i.length > var2_intLifetime1; var2_intLifetime1++) {
          kka.field_i[var2_intLifetime1] = new Sprite(39, 39);
          kka.field_i[var2_intLifetime1].b();
          SoftwareRasterizer.fillRectangle(0, 0, 39, 39, 12688481);
          nk.a((ArgbSprite) (dc.field_y[var2_intLifetime1])).b(0, 0, 39, 39);
        }
        hga.field_U.a((byte) 114);
        hk.a("basic_frame", param1, param0 + 152, "basic");
        wd.field_w = hk.a("button_frame", param1, -54, "basic");
        RageSpecial.field_p = hk.a("button_frame_hover", param1, -68, "basic");
        BattleState.field_I = hk.a("button_frame_pressed", param1, 60, "basic");
        DreamsEvent.field_r = pi.a(param1, -8845, "basic", "stars");
        DiveBomberAnimation.a(DreamsEvent.field_r, 96);
        wq.field_k = FullHealEvent.a("creatureviewer_bg", param1, "basic", (byte) -127);
        a.field_o = FullHealEvent.a("selected_splat", param1, "basic", (byte) 106);
        SnowAnimation.field_y = FullHealEvent.a("creatureviewer_button", param1, "basic", (byte) -46);
        OneAnimation.field_E = FullHealEvent.a("action_bg", param1, "basic", (byte) -97);
        RefreshingAnimation.field_v = FullHealEvent.a("padlock", param1, "basic", (byte) 70);
        HomingMissileEvent.field_s = FullHealEvent.a("stamina", param1, "basic", (byte) 91);
        vaa.field_b = FullHealEvent.a("speed", param1, "basic", (byte) -30);
        dt.field_a = FullHealEvent.a("fisticuffs", param1, "basic", (byte) 74);
        DualLinkDeque.field_b = FullHealEvent.a("flingstuff", param1, "basic", (byte) 84);
        FlySpecial.field_p = gw.a("basic", "category_icons", param1, -102);
        mq.field_b = gw.a("basic", "category_icons_small", param1, -121);
        hh.field_b = pi.a(param1, -8845, "basic", "move_icons");
        nia.field_l = pi.a(param1, -8845, "basic", "icon_frames");
        hp.field_b = new Sprite[nia.field_l.length];
        for (var2_intLifetime2 = 0; var2_intLifetime2 < nia.field_l.length; var2_intLifetime2++) {
          hp.field_b[var2_intLifetime2] = new Sprite(nia.field_l[var2_intLifetime2].field_q, nia.field_l[var2_intLifetime2].field_p);
          hp.field_b[var2_intLifetime2].b();
          FlyEvent.a(5587456, nia.field_l[var2_intLifetime2], (byte) -116, 0, 0);
          hga.field_U.a((byte) -41);
        }
        ZombiesAnimation.field_y = hca.a("basic", param1, -79, "shop_cost_left");
        wja.field_l = hca.a("basic", param1, param0 ^ -76, "shop_cost_right");
        us.field_b = hca.a("basic", param1, 104, "shop_cost_mid");
        fw.a((byte) -122, us.field_b, wja.field_l, ZombiesAnimation.field_y);
        ZombiesEvent.field_q = BagpipeSpecial.a(param1, -1, "basic", "shop_bg");
        BagpipeSpecial.a(param1, -1, "basic", "button_add_to_cart");
        fba.field_a = BagpipeSpecial.a(param1, -1, "basic", "icon_buy");
        bn.field_h = BagpipeSpecial.a(param1, -1, "basic", "icon_buy_hover");
        eq.field_b = hk.a("scroll_green", param1, -76, "basic");
        tq.field_g = hk.a("scroll_yellow", param1, -94, "basic");
        og.field_b = hk.a("scroll_brown", param1, 43, "basic");
        jf.field_l = BagpipeSpecial.a(param1, -1, "basic", "tab_shop");
        InvincibleSpecial.field_p = BagpipeSpecial.a(param1, param0 ^ 43, "basic", "tab_shop_active");
        int[] var7 = new int[256];
        int[] var6 = var7;
        int[] var5 = var6;
        int[] var2 = var5;
        for (var3 = 0; var3 < var7.length; var3++) {
          var5[var3] = 65793 * var3;
        }
        ska.field_k = FullHealEvent.a("shop_list", param1, "basic", (byte) -22);
        PetAttackEvent.field_s = FullHealEvent.a("shop_list_hover", param1, "basic", (byte) 60);
        rfa.field_a = FullHealEvent.a("mag_hover", param1, "basic", (byte) 122);
        FullHealEvent.a("rag", param1, "basic", (byte) -35);
        FullHealEvent.a("rag_hover", param1, "basic", (byte) 67);
        hca.a("basic", param1, param0 - 50, "bucket");
        hca.a("basic", param1, -125, "bucket_empty");
        ng.field_a = FullHealEvent.a("bag_hover", param1, "basic", (byte) 88);
        pea.field_k = FullHealEvent.a("bag_bg", param1, "basic", (byte) -108);
        kga.field_d = FullHealEvent.a("bag_full_hover", param1, "basic", (byte) -111);
        ve.field_l = pi.a(param1, param0 - 8801, "basic", "arena_entrance_anim");
        rea.field_k = FullHealEvent.a("arena_sign_off", param1, "basic", (byte) -100);
        ot.field_e = FullHealEvent.a("arena_sign_on", param1, "basic", (byte) 116);
        dp.field_n = pi.a(param1, -8845, "basic", "bin");
        iea.field_a = FullHealEvent.a("bin_shadow", param1, "basic", (byte) 117);
        BattleState.field_u = FullHealEvent.a("bin_shadow2", param1, "basic", (byte) -117);
        ua.field_d = FullHealEvent.a("mould_white", param1, "basic", (byte) 105);
        SauceOfFlameAnimation.field_y = FullHealEvent.a("mould_green", param1, "basic", (byte) 83);
        StampedeEvent.field_q = pi.a(param1, param0 ^ 8871, "basic", "sporesplosion");
        DisableAnimation.field_v = FullHealEvent.a("thought_bubble", param1, "basic", (byte) -13);
        iq.field_l = FullHealEvent.a("burp", param1, "basic", (byte) 67);
        pja.field_b = gw.a("basic", "counter_numbers", param1, -116);
        gba.field_xb = hca.a("basic", param1, 123, "counter_frame");
        TeleportAnimation.field_v = hca.a("basic", param1, 125, "counter_icon");
        ew.field_q = BagpipeSpecial.a(param1, -1, "basic", "tutorial_highlight_arena");
        lfa.field_s = BagpipeSpecial.a(param1, -1, "basic", "tutorial_highlight_bag");
        rj.field_l = BagpipeSpecial.a(param1, param0 ^ 43, "basic", "tutorial_highlight_bin");
        if (param0 != -44) {
          return;
        }
        try {
          ada.field_m = BagpipeSpecial.a(param1, param0 ^ 43, "basic", "tutorial_highlight_freezer");
          wa.field_n = BagpipeSpecial.a(param1, -1, "basic", "tutorial_highlight_list");
          bn.field_i = BagpipeSpecial.a(param1, -1, "basic", "tutorial_highlight_mag");
          var2 = null;
          gg.field_a = FullHealEvent.a("padlock_freezer", param1, "basic", (byte) -58);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "ena.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = new byte[1000][];
        field_o = new String[]{"turntime_icons", null, "teamsize_icons", "gamemode_icons", null};
    }
}
