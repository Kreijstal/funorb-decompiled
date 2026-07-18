/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ena extends pu {
    static byte[][] field_p;
    static ee field_l;
    static tn field_m;
    static String[] field_o;
    static int field_n;

    public static void b() {
        field_p = null;
        field_o = null;
        field_l = null;
        field_m = null;
    }

    final static void a(byte param0, vr param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int[] var2_array = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            System.gc();
            gna.f((byte) -98);
            cga.field_r = ch.a(param1, -1, "basic", "freezer_side");
            kja.field_e = wfa.a("ice_cube", param1, "basic", (byte) 113);
            jla.field_d = ch.a(param1, -1, "basic", "ice_tray_mid");
            vl.field_c = ch.a(param1, -1, "basic", "ice_tray_top");
            an.field_r = ch.a(param1, -1, "basic", "ice_tray_lower");
            ee discarded$9 = ch.a(param1, -1, "basic", "freezer_open");
            dc.field_y = pi.a(param1, -8845, "basic", "food_icons");
            ca.field_c = pi.a(param1, -8845, "basic", "food_icons_mouldy");
            a.field_n = pi.a(param1, -8845, "basic", "food_icons_eaten");
            gr.field_a = new kv[dc.field_y.length];
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= gr.field_a.length) {
                hga.field_U.a((byte) -10);
                kka.field_i = new kv[dc.field_y.length];
                var2_int = 0;
                L2: while (true) {
                  if (kka.field_i.length <= var2_int) {
                    hga.field_U.a((byte) 114);
                    kv[] discarded$10 = hk.a("basic_frame", param1, 108, "basic");
                    wd.field_w = hk.a("button_frame", param1, -54, "basic");
                    bla.field_p = hk.a("button_frame_hover", param1, -68, "basic");
                    op.field_I = hk.a("button_frame_pressed", param1, 60, "basic");
                    bt.field_r = pi.a(param1, -8845, "basic", "stars");
                    kv[] discarded$11 = kla.a(bt.field_r, 96);
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
                    var2_int = 0;
                    L3: while (true) {
                      if (var2_int >= nia.field_l.length) {
                        cka.field_y = hca.a("basic", param1, -79, "shop_cost_left");
                        wja.field_l = hca.a("basic", param1, 96, "shop_cost_right");
                        us.field_b = hca.a("basic", param1, 104, "shop_cost_mid");
                        kv[] discarded$12 = fw.a((byte) -122, us.field_b, wja.field_l, cka.field_y);
                        ps.field_q = ch.a(param1, -1, "basic", "shop_bg");
                        ee discarded$13 = ch.a(param1, -1, "basic", "button_add_to_cart");
                        fba.field_a = ch.a(param1, -1, "basic", "icon_buy");
                        bn.field_h = ch.a(param1, -1, "basic", "icon_buy_hover");
                        eq.field_b = hk.a("scroll_green", param1, -76, "basic");
                        tq.field_g = hk.a("scroll_yellow", param1, -94, "basic");
                        og.field_b = hk.a("scroll_brown", param1, 43, "basic");
                        jf.field_l = ch.a(param1, -1, "basic", "tab_shop");
                        dr.field_p = ch.a(param1, -1, "basic", "tab_shop_active");
                        var9 = new int[256];
                        var8 = var9;
                        var7 = var8;
                        var6 = var7;
                        var5 = var6;
                        var2_array = var5;
                        var3 = 0;
                        L4: while (true) {
                          if (var3 >= var9.length) {
                            ska.field_k = wfa.a("shop_list", param1, "basic", (byte) -22);
                            tl.field_s = wfa.a("shop_list_hover", param1, "basic", (byte) 60);
                            rfa.field_a = wfa.a("mag_hover", param1, "basic", (byte) 122);
                            kv discarded$14 = wfa.a("rag", param1, "basic", (byte) -35);
                            kv discarded$15 = wfa.a("rag_hover", param1, "basic", (byte) 67);
                            kv discarded$16 = hca.a("basic", param1, -94, "bucket");
                            kv discarded$17 = hca.a("basic", param1, -125, "bucket_empty");
                            ng.field_a = wfa.a("bag_hover", param1, "basic", (byte) 88);
                            pea.field_k = wfa.a("bag_bg", param1, "basic", (byte) -108);
                            kga.field_d = wfa.a("bag_full_hover", param1, "basic", (byte) -111);
                            ve.field_l = pi.a(param1, -8845, "basic", "arena_entrance_anim");
                            rea.field_k = wfa.a("arena_sign_off", param1, "basic", (byte) -100);
                            ot.field_e = wfa.a("arena_sign_on", param1, "basic", (byte) 116);
                            dp.field_n = pi.a(param1, -8845, "basic", "bin");
                            iea.field_a = wfa.a("bin_shadow", param1, "basic", (byte) 117);
                            op.field_u = wfa.a("bin_shadow2", param1, "basic", (byte) -117);
                            ua.field_d = wfa.a("mould_white", param1, "basic", (byte) 105);
                            aw.field_y = wfa.a("mould_green", param1, "basic", (byte) 83);
                            oo.field_q = pi.a(param1, -8845, "basic", "sporesplosion");
                            bna.field_v = wfa.a("thought_bubble", param1, "basic", (byte) -13);
                            iq.field_l = wfa.a("burp", param1, "basic", (byte) 67);
                            pja.field_b = gw.a("basic", "counter_numbers", param1, -116);
                            gba.field_xb = hca.a("basic", param1, 123, "counter_frame");
                            ln.field_v = hca.a("basic", param1, 125, "counter_icon");
                            ew.field_q = ch.a(param1, -1, "basic", "tutorial_highlight_arena");
                            lfa.field_s = ch.a(param1, -1, "basic", "tutorial_highlight_bag");
                            rj.field_l = ch.a(param1, -1, "basic", "tutorial_highlight_bin");
                            ada.field_m = ch.a(param1, -1, "basic", "tutorial_highlight_freezer");
                            wa.field_n = ch.a(param1, -1, "basic", "tutorial_highlight_list");
                            bn.field_i = ch.a(param1, -1, "basic", "tutorial_highlight_mag");
                            var2_array = null;
                            gg.field_a = wfa.a("padlock_freezer", param1, "basic", (byte) -58);
                            break L0;
                          } else {
                            var5[var3] = 65793 * var3;
                            var3++;
                            continue L4;
                          }
                        }
                      } else {
                        hp.field_b[var2_int] = new kv(nia.field_l[var2_int].field_q, nia.field_l[var2_int].field_p);
                        hp.field_b[var2_int].b();
                        cja.a(5587456, nia.field_l[var2_int], (byte) -116, 0, 0);
                        hga.field_U.a((byte) -41);
                        var2_int++;
                        continue L3;
                      }
                    }
                  } else {
                    kka.field_i[var2_int] = new kv(39, 39);
                    kka.field_i[var2_int].b();
                    dg.c(0, 0, 39, 39, 12688481);
                    nk.a((pa) (Object) dc.field_y[var2_int]).b(0, 0, 39, 39);
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                gr.field_a[var2_int] = new kv(39, 39);
                gr.field_a[var2_int].b();
                dg.c(0, 0, 39, 39, 16700762);
                nk.a((pa) (Object) dc.field_y[var2_int]).b(0, 0, 39, 39);
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ena.A(").append(-44).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new byte[1000][];
        field_o = new String[]{"turntime_icons", null, "teamsize_icons", "gamemode_icons", null};
    }
}
