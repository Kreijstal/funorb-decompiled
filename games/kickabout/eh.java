/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class eh implements pk {
    static String[] field_b;
    private boolean field_c;
    private boolean field_d;
    private boolean field_a;
    static int field_e;
    private static int[][] field_f;

    public final boolean c(int param0) {
        oi var2_ref_oi;
        int var2;
        int var3;
        boolean stackIn_24_0 = false;
        var3 = Kickabout.field_G;
        if (!this.field_a &&
          ob.m(99)) {
          this.field_a = true;
          var2_ref_oi = (oi) (ec.field_f.g(24009));
          while (var2_ref_oi != null) {
            if (c.a(var2_ref_oi.field_j, 0, BufferedSocket.field_f)) {
              var2_ref_oi.c((byte) -109);
            }
            var2_ref_oi = (oi) (ec.field_f.c(param0 ^ -27629));
          }
          ok.field_a.b(22997);
          RasterBuffer.a(20164);
        }
        if (param0 != -27598) {
          this.field_a = true;
        }
        if (!this.field_c) {
          if ((1 & vp.field_h) == 0) {
            var2 = js.field_e;
            if (var2 > 0) {
            }
          }
          this.field_c = true;
        }
        if (!this.field_d &&
          this.e(0)) {
          this.field_d = true;
        }
        stackIn_24_0 = (this.field_d) && (this.field_c) && (this.field_a) && (ui.field_y);
        return stackIn_24_0;
    }

    public final boolean a(boolean param0) {
        Sprite var4 = null;
        IndexedSprite var5 = null;
        Sprite var6 = null;
        Sprite[] var7 = null;
        Sprite[] var8 = null;
        int var9 = 0;
        int var11_int = 0;
        IndexedSprite[] var10 = null;
        Sprite[][] var11 = null;
        Sprite[][] var12 = null;
        int var10_int = 0;
        int var13 = Kickabout.field_G;
        int var10_intLifetime1;
        int var10_intLifetime2;
        if (!param0) {
          ArgbSprite var14 = (ArgbSprite) null;
          this.a(28, (ArgbSprite) null);
        }
        mf.h((byte) -19);
        up.e(-1456);
        ResourceArchive var16 = kh.field_g;
        ResourceArchive var17 = IterableNodeHashTable.field_b;
        if (null != IterableNodeHashTable.field_c &&
          null != d.field_b) {
          CipherPacketBuffer.k(61, 0);
          if (null == sr.field_h) {
            it.a(new rj(IterableNodeHashTable.field_c, d.field_b), d.field_b, (byte) -100);
          }
          d.field_b = null;
          IterableNodeHashTable.field_c = null;
          dd.a((byte) 49);
          return false;
        }
        if (ni.field_i != null) {
          CipherPacketBuffer.k(61, 1);
          f.a(ni.field_i, (byte) -122);
          ni.field_i = null;
          dd.a((byte) 53);
          return false;
        }
        if (!ja.d(111, fn.field_c)) {
          return false;
        }
        if (v.field_b != null) {
          CipherPacketBuffer.k(61, 2);
          eo.field_q = wa.a((byte) 124, "lobby", bo.field_Cb, "logo");
          eo.field_p = ModalStack.a(bo.field_Cb, -28, "lobby", "time");
          eo.field_j = ModalStack.a(bo.field_Cb, -121, "lobby", "tournament_icons");
          eo.field_j[0] = new Sprite(0, 0);
          eo.field_m = ModalStack.a(bo.field_Cb, -121, "lobby", "exhibition_icons");
          eo.field_m[0] = new Sprite(0, 0);
          eo.field_f = DemoIntegersCommand.a(bo.field_Cb, 17369, "lobby", "orb_icons");
          ModalStack.a(bo.field_Cb, -127, "lobby", "players");
          IntrusiveDeque.field_e = eo.field_q;
          un.field_d = gm.a(v.field_b, 10, "font2", bo.field_Cb, "fonts");
          q.field_d = Checkbox.a("font", v.field_b, 75, "fonts", bo.field_Cb);
          IsSixCommand.field_C = Checkbox.a("", var17, 105, "arialish12", var16);
          var4 = new Sprite(16, 9);
          PacketBuffer.a(-64, var4);
          SoftwareRasterizer.fillCircle(4, 4, 3, 7829367);
          SoftwareRasterizer.fillCircle(4, 4, 2, 13421772);
          ta.e(122);
          var5 = eo.a(var4);
          IsSixCommand.field_C.a(new IndexedSprite[]{var5}, new int[]{10});
          sk.a(83, 100, 10);
          var6 = wa.a((byte) 100, "basic", var16, "orbcoin");
          LoggedGoal.a(var6, (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 77, "locked")), (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 77, "unachieved")), -123);
          sh.field_g = nh.b(nh.a(var6));
          AccountChoicePanel.field_B = (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 69, "divider"));
          tt.field_e = wa.a((byte) 122, "menu", bo.field_Cb, "button_left_shine");
          GameAppletShell.field_l = wa.a((byte) 106, "menu", bo.field_Cb, "button_middle_shine");
          sk.a(-109, 100, 20);
          cg.field_K = wa.a((byte) 107, "menu", bo.field_Cb, "button_right_shine");
          kh.field_r = wa.a((byte) 116, "menu", bo.field_Cb, "button_small_shine");
          ap.field_l = wa.a((byte) 101, "menu", bo.field_Cb, "button_large_shine");
          ig.field_a = ModalStack.a(bo.field_Cb, -119, "menu", "digifont");
          sk.a(90, 100, 25);
          wt.field_z = ng.a("swatch_overlay", "menu", 2, bo.field_Cb);
          var7 = ng.a("arrows", "menu", 2, bo.field_Cb);
          eo.field_k = new ArgbSprite[]{(ArgbSprite) (var7[0]), (ArgbSprite) (var7[2]), (ArgbSprite) (var7[4])};
          eo.field_i = new ArgbSprite[]{(ArgbSprite) (var7[1]), (ArgbSprite) (var7[3]), (ArgbSprite) (var7[5])};
          sk.a(86, 100, 30);
          sk.a(103, 100, 35);
          sk.a(-94, 100, 40);
          tb.field_q = ng.a("digits", "hud", 2, bo.field_Cb);
          MouseInputHandler.field_g = ModalStack.a(bo.field_Cb, -121, "hud", "cones");
          SpriteState.field_p = ng.a("tutorial", "hud", 2, bo.field_Cb);
          tn.field_e = wa.a((byte) 114, "hud", bo.field_Cb, "arrow");
          IntrusiveDequeCursor.a(-128, wa.a((byte) 114, "hud", bo.field_Cb, "cursor"));
          sk.a(86, 100, 45);
          mc.field_k = ng.a("dialog_icon", "menu", 2, bo.field_Cb);
          wt.field_y = wa.a((byte) 107, "menu", bo.field_Cb, "star");
          sk.a(-48, 100, 60);
          var8 = ng.a("trinkets", "menu", 2, bo.field_Cb);
          tk.field_Fb = new ArgbSprite[4][6];
          var9 = 0;
          for (var10_int = 0; var10_int < 3; var10_int++) {
            for (var11_int = 0; var11_int < 6; var11_int++) {
              tk.field_Fb[var10_int][var11_int] = (ArgbSprite) (var8[var9]);
              var9++;
            }
          }
          for (var10_intLifetime1 = 0; var10_intLifetime1 < 6; var10_intLifetime1++) {
            tk.field_Fb[3][var10_intLifetime1] = (ArgbSprite) (var8[var9]);
          }
          ca.field_c = new ArgbSprite[4];
          for (var10_intLifetime2 = 0; var10_intLifetime2 < ca.field_c.length; var10_intLifetime2++) {
            ca.field_c[var10_intLifetime2] = ri.a(tk.field_Fb[var10_intLifetime2][0], param0);
          }
          ArchiveIndex.field_m = (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 96, "help_up"));
          bg.a("menu", bo.field_Cb, (byte) 100, "help_dwn");
          mf.a(ModalStack.a(bo.field_Cb, -124, "menu", "tickbox"), true);
          sk.a(80, 100, 75);
          eq.field_h = (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 93, "hammer_icon"));
          CipherPacketBuffer.field_q = (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 89, "hammer_icon_buy"));
          sk.a(113, 100, 70);
          qj.field_f = bg.a("menu", bo.field_Cb, (byte) 60, "tactics_pitch");
          fc.field_h = (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 109, "lock_icon"));
          sk.a(90, 100, 80);
          es.field_f = bg.a("menu", bo.field_Cb, (byte) 78, "kit");
          WriteIntegersCommand.field_E = ng.a("cups", "menu", 2, bo.field_Cb);
          jm.field_i = ng.a("cups_empty", "menu", 2, bo.field_Cb);
          sk.a(102, 100, 90);
          fn.field_d = (ArgbSprite) (bg.a("menu", bo.field_Cb, (byte) 88, "shelf"));
          rk.field_g = bg.a("menu", bo.field_Cb, (byte) 76, "scroll_button");
          bn.field_B = this.a("menu", bo.field_Cb, (byte) 26, "scroll_bar");
          su.field_a = wa.a((byte) 106, "menu", bo.field_Cb, "mini_ball");
          sk.a(-91, 100, 95);
          var10 = eo.field_f;
          var11 = new Sprite[][]{eo.field_p, null, eo.field_m, eo.field_j};
          var12 = new Sprite[][]{eo.field_p, null, eo.field_m, eo.field_j};
          int[] var15 = (int[]) null;
          uf.a(var11, id.field_y, ArchiveSource.field_c, true, ld.field_g, var10, var16, 16971, or.field_b, rk.field_e, var17, sn.field_c, rp.field_y, ld.field_h, os.field_i, var12, (int[]) null, 8, 3, jd.field_i);
          PlayArea.field_k = da.field_k;
          IndexedSpriteState.field_e = lr.field_n;
          TextButton.field_z = ja.field_Z;
          pn.field_t = 0;
          ValidatedTextWidget.a(false, 200);
          sk.a(-61, 100, 95);
          m.a(var17, var16, 5198);
          bf.a(-70, rm.field_A, 0, nm.field_g, 0, 16777215);
          Object var3 = null;
          v.field_b = null;
          dd.a((byte) 104);
          return false;
        }
        if (ResourceArchive.field_f != null) {
          CipherPacketBuffer.k(61, 3);
          cq.field_j = new Sprite(ResourceArchive.field_f.a("background_guy.png", "", 36), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          mk.field_a = new Sprite(ResourceArchive.field_f.a("background.png", "", 66), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          iu.field_k = new Sprite(ResourceArchive.field_f.a("splash.jpg", "", 8), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          AccountTermsPanel.field_E = new Sprite(ResourceArchive.field_f.a("botbar.png", "", 66), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          sk.a(-114, 23, 2);
          vo.field_cb = nh.a(new ArgbSprite(ResourceArchive.field_f.a("bank_top.png", "", 3), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          AccountChoicePanel.field_C = nh.a(new ArgbSprite(ResourceArchive.field_f.a("bank_mid.png", "", 52), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          du.field_i = nh.a(new ArgbSprite(ResourceArchive.field_f.a("bank_bot.png", "", 123), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          TextHotspotWidget.field_L = nh.a(new ArgbSprite(ResourceArchive.field_f.a("button_lrg.png", "", 91), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          ll.field_m = nh.a(new ArgbSprite(ResourceArchive.field_f.a("button_sml.png", "", 81), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(122, 23, 4);
          AccountChoicePanel.field_K = new ArgbSprite(ResourceArchive.field_f.a("cone_1.png", "", 91), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          re.field_o = new ArgbSprite(ResourceArchive.field_f.a("cone_2.png", "", 91), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          uv.field_m = nh.a(new ArgbSprite(ResourceArchive.field_f.a("button_left.png", "", 8), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          SetLagCommand.field_B = nh.a(new ArgbSprite(ResourceArchive.field_f.a("button_middle.png", "", 97), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(-114, 23, 6);
          mf.field_Cb = nh.a(new ArgbSprite(ResourceArchive.field_f.a("button_right.png", "", 90), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          pw.field_H = (Sprite) ((Object) new ArgbSprite(ResourceArchive.field_f.a("stopwatch.png", "", 101), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(-58, 23, 8);
          nh.a(new ArgbSprite(ResourceArchive.field_f.a("thin_button_endl.png", "", 89), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          nh.a(new ArgbSprite(ResourceArchive.field_f.a("thin_button_mid.png", "", 5), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(-105, 23, 10);
          nh.a(new ArgbSprite(ResourceArchive.field_f.a("thin_button_endr.png", "", 58), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          gu.field_zb = nh.a(new ArgbSprite(ResourceArchive.field_f.a("small_button_L.png", "", 52), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(-61, 23, 12);
          AccountRegistrationPanel.field_H = nh.a(new ArgbSprite(ResourceArchive.field_f.a("small_button_mid.png", "", 53), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          fv.field_b = nh.a(new ArgbSprite(ResourceArchive.field_f.a("small_button_R.png", "", 117), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(-85, 23, 14);
          mg.field_g = nh.a(new ArgbSprite(ResourceArchive.field_f.a("top_bar_Seg.png", "", 127), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(-49, 23, 16);
          qt.field_u = nh.a(new ArgbSprite(ResourceArchive.field_f.a("top.png", "", 82), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sk.a(-98, 23, 18);
          fn.field_f = new ArgbSprite(ResourceArchive.field_f.a("asphalt_corner.png", "", 6), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          kn.field_J = new Sprite(ResourceArchive.field_f.a("asphalt_v.png", "", 69), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          sk.a(126, 23, 20);
          vl.field_g = new Sprite(ResourceArchive.field_f.a("asphalt_h.png", "", 124), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          eo.field_a = new ArgbSprite(ResourceArchive.field_f.a("arrow_on.png", "", 63), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          eo.field_b = new ArgbSprite(ResourceArchive.field_f.a("arrow_off.png", "", 4), (java.awt.Component) ((Object) DropTargetWidget.l(64)));
          sk.a(-89, 23, 23);
          this.a(11264, new ArgbSprite(ResourceArchive.field_f.a("achievements_large.png", "", 63), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          sf.field_C = (Sprite) ((Object) new ArgbSprite(ResourceArchive.field_f.a("ka_logo.png", "", 37), (java.awt.Component) ((Object) DropTargetWidget.l(64))));
          ResourceArchive.field_f = null;
          dd.a((byte) 99);
          return false;
        }
        if (b.field_H != null) {
          CipherPacketBuffer.k(61, 4);
          ee.a(new ks(b.field_H.a("huffman", "", 93)), false);
          b.field_H = null;
          dd.a((byte) 78);
          return false;
        }
        if (null != Kickabout.field_J) {
          CipherPacketBuffer.k(61, 5);
          ap.a((byte) -34, Kickabout.field_J);
          Kickabout.field_J = null;
          dd.a((byte) 81);
          return false;
        }
        if (nt.field_Bb == null) {
          return true;
        }
        CipherPacketBuffer.k(61, 6);
        rf.a(20113, vu.field_Eb, gd.field_h, nt.field_Bb);
        nt.field_Bb = null;
        vu.field_Eb = null;
        gd.field_h = null;
        dd.a((byte) 48);
        return false;
    }

    final void b(byte param0) {
        if (param0 != 115) {
          return;
        }
        wc.field_k = new sn(nm.field_g);
    }

    final static void a(byte param0) {
        int incrementValue$69 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int incrementValue$51 = 0;
        int incrementValue$52 = 0;
        int incrementValue$53 = 0;
        int incrementValue$54 = 0;
        int incrementValue$55 = 0;
        int incrementValue$56 = 0;
        int incrementValue$57 = 0;
        int incrementValue$58 = 0;
        int incrementValue$59 = 0;
        int incrementValue$60 = 0;
        int incrementValue$61 = 0;
        int incrementValue$62 = 0;
        int incrementValue$63 = 0;
        int incrementValue$68 = 0;
        int incrementValue$64 = 0;
        int incrementValue$65 = 0;
        int incrementValue$66 = 0;
        int incrementValue$67 = 0;
        int incrementValue$40 = 0;
        int incrementValue$48 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        Sprite var2 = null;
        Sprite var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        Sprite var10 = null;
        Sprite var11 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var5Lifetime2;
        int var6Lifetime2;
        int var7Lifetime2;
        int var5Lifetime1Lifetime1;
        int var6Lifetime1Lifetime1;
        int var7Lifetime1Lifetime1;
        var8 = Kickabout.field_G;
        try {
          if (param0 >= -42) {
            var9 = (StringBuilder) null;
            eh.a(-123, -22, (StringBuilder) null);
          }
          var10 = tv.field_b[2];
          var11 = var10;
          var2 = nh.a((ArgbSprite) (c.field_e));
          var3 = nh.a((ArgbSprite) (st.field_q));
          if (rm.field_C == 0) {
            oi.field_e = new oh[30];
            var4 = 0;
            for (var5 = 0; 4 > var5; var5++) {
              var6 = p.a((byte) -24, 896 - var11.field_o);
              var7 = p.a((byte) -24, 1344 - var11.field_v);
              incrementValue$69 = var4;
              var4++;
              oi.field_e[incrementValue$69] = new oh(var10, var6, var7);
            }
            incrementValue$49 = var4;
            var4++;
            oi.field_e[incrementValue$49] = new oh(ns.field_c, 50, -100);
            incrementValue$50 = var4;
            var4++;
            oi.field_e[incrementValue$50] = new oh(je.field_h, 80, -150);
            incrementValue$51 = var4;
            var4++;
            oi.field_e[incrementValue$51] = new oh(je.field_h, 120, -105);
            incrementValue$52 = var4;
            var4++;
            oi.field_e[incrementValue$52] = new oh(var3, -100, -170);
            incrementValue$53 = var4;
            var4++;
            oi.field_e[incrementValue$53] = new oh(var2, 530, -240);
            incrementValue$54 = var4;
            var4++;
            oi.field_e[incrementValue$54] = new oh(var3, 670, -170);
            incrementValue$55 = var4;
            var4++;
            oi.field_e[incrementValue$55] = new oh(var2, 790, -195);
            incrementValue$56 = var4;
            var4++;
            oi.field_e[incrementValue$56] = new oh(ns.field_c, 700, 1354);
            incrementValue$57 = var4;
            var4++;
            oi.field_e[incrementValue$57] = new oh(je.field_h, 720, 1394);
            incrementValue$58 = var4;
            var4++;
            oi.field_e[incrementValue$58] = new oh(je.field_h, 780, 1374);
            incrementValue$59 = var4;
            var4++;
            oi.field_e[incrementValue$59] = new oh(var3, -171, 1037);
            incrementValue$60 = var4;
            var4++;
            oi.field_e[incrementValue$60] = new oh(FullscreenFocusCanvas.field_a, -51, 1082);
            incrementValue$61 = var4;
            var4++;
            oi.field_e[incrementValue$61] = new oh(FullscreenFocusCanvas.field_a, -30, 1105);
            incrementValue$62 = var4;
            var4++;
            oi.field_e[incrementValue$62] = new oh(FullscreenFocusCanvas.field_a, -20, 1055);
            incrementValue$63 = var4;
            var4++;
            oi.field_e[incrementValue$63] = new oh(ns.field_c, -68, 1143);
            for (var5Lifetime2 = 0; 7 > var5Lifetime2; var5Lifetime2++) {
              var6Lifetime2 = BytePlusOneCommand.a(29430, 40, 956);
              var7Lifetime2 = BytePlusOneCommand.a(29430, 70, var5Lifetime2 * 150 + 200);
              incrementValue$68 = var4;
              var4++;
              oi.field_e[incrementValue$68] = new oh(c.field_e, var6Lifetime2, var7Lifetime2);
            }
            incrementValue$64 = var4;
            var4++;
            oi.field_e[incrementValue$64] = new oh(var2, -111, 138);
            incrementValue$65 = var4;
            var4++;
            oi.field_e[incrementValue$65] = new oh(var2, -191, 290);
            incrementValue$66 = var4;
            var4++;
            oi.field_e[incrementValue$66] = new oh(var2, 30, 1324);
            incrementValue$67 = var4;
            var4++;
            oi.field_e[incrementValue$67] = new oh(var2, 170, 1364);
            return;
          }
          if (rm.field_C == 1) {
            oi.field_e = new oh[34];
            var4Lifetime1 = 0;
            incrementValue$40 = var4Lifetime1;
            var4Lifetime1++;
            oi.field_e[incrementValue$40] = new oh(BytePlusOneCommand.field_D, 0, 1375);
            for (var5Lifetime1 = 0; 12 > var5Lifetime1; var5Lifetime1++) {
              var6Lifetime1 = BytePlusOneCommand.a(29430, 30, -300 + 100 * var5Lifetime1);
              var7Lifetime1 = BytePlusOneCommand.a(29430, 60, -290);
              if (p.a((byte) -24, 2) == 0) {
                var6Lifetime1 = -var6Lifetime1 + 896;
                var7Lifetime1 += 1724;
              }
              incrementValue$48 = var4Lifetime1;
              var4Lifetime1++;
              oi.field_e[incrementValue$48] = new oh(c.field_e, var6Lifetime1, var7Lifetime1);
            }
            incrementValue$41 = var4Lifetime1;
            var4Lifetime1++;
            oi.field_e[incrementValue$41] = new oh(var3, -203, 169);
            incrementValue$42 = var4Lifetime1;
            var4Lifetime1++;
            oi.field_e[incrementValue$42] = new oh(je.field_h, -219, 292);
            incrementValue$43 = var4Lifetime1;
            var4Lifetime1++;
            oi.field_e[incrementValue$43] = new oh(ns.field_c, 824, -60);
            incrementValue$44 = var4Lifetime1;
            var4Lifetime1++;
            oi.field_e[incrementValue$44] = new oh(je.field_h, 753, -69);
            incrementValue$45 = var4Lifetime1;
            var4Lifetime1++;
            oi.field_e[incrementValue$45] = new oh(BytePlusOneCommand.field_D, 1030, 568);
            for (var5Lifetime1Lifetime1 = 0; var5Lifetime1Lifetime1 < 8; var5Lifetime1Lifetime1++) {
              var6Lifetime1Lifetime1 = BytePlusOneCommand.a(29430, 20, -170);
              var7Lifetime1Lifetime1 = -50 + var5Lifetime1Lifetime1 / 2 * 400;
              if ((1 & var5Lifetime1Lifetime1) != 0) {
                var7Lifetime1Lifetime1 = var7Lifetime1Lifetime1 + BytePlusOneCommand.a(29430, 20, 60);
              }
              incrementValue$46 = var4Lifetime1;
              var4Lifetime1++;
              oi.field_e[incrementValue$46] = new oh(wn.field_a[p.a((byte) -24, wn.field_a.length)], var6Lifetime1Lifetime1, var7Lifetime1Lifetime1);
              incrementValue$47 = var4Lifetime1;
              var4Lifetime1++;
              oi.field_e[incrementValue$47] = new oh(wn.field_a[p.a((byte) -24, wn.field_a.length)], -var6Lifetime1Lifetime1 + 876, var7Lifetime1Lifetime1);
            }
            return;
          }
          if (rm.field_C == 2) {
            oi.field_e = new oh[9];
            oi.field_e[0] = new oh(var3, -142, 231);
            oi.field_e[1] = new oh(c.field_e, -140, 549);
            oi.field_e[2] = new oh(var3, -154, 1331);
            oi.field_e[3] = new oh(c.field_e, -245, 1384);
            oi.field_e[4] = new oh(c.field_e, 901, -252);
            oi.field_e[5] = new oh(var3, 1095, 963);
            oi.field_e[6] = new oh(c.field_e, 925, 1294);
            oi.field_e[7] = new oh(BytePlusOneCommand.field_D, -131, 957);
            oi.field_e[8] = new oh(BytePlusOneCommand.field_D, 924, 240);
          } else {
            if (rm.field_C == 3) {
              oi.field_e = new oh[]{};
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "eh.H(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        field_f = (int[][]) null;
        field_b = null;
        if (param0 != 1) {
          StringBuilder var2 = (StringBuilder) null;
          eh.a(58, 40, (StringBuilder) null);
        }
    }

    public final void b(int param0) {
        int var2 = 0;
        int var4 = 0;
        ArgbSprite var3;
        int var5;
        var5 = Kickabout.field_G;
        nm.a(0, -76, false, ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(79, 3, new Random()));
        CipherPacketBuffer.k(param0 ^ 12774, 7);
        TriangleRasterizer.a(0.6000000238418579f);
        g.b(false);
        fn.i(18);
        ii.b(65280);
        CipherPacketBuffer.k(61, 8);
        td.b(param0 - 12854);
        sk.a(118, 2, 1);
        CipherPacketBuffer.k(61, 9);
        sk.a(84, 6, 1);
        eo.a();
        sk.a(-46, 6, 2);
        iv.a(un.field_d, (byte) 113);
        sk.a(-89, 6, 3);
        uf.a((byte) -32);
        ResizableModalPanel.l(96);
        sk.a(-49, 6, 5);
        GameLoopApplet.n((byte) -10);
        CipherPacketBuffer.k(61, 10);
        wb.b((byte) -47);
        rf.a((byte) -124);
        sk.a(127, 4, 1);
        op.a(param0 ^ -363033958);
        sk.a(-69, 4, 2);
        os.a(param0 - 12857);
        sk.a(-124, 4, 3);
        b.field_U = (Sprite[]) ((Object) new ArgbSprite[WriteIntegersCommand.field_E.length]);
        for (var2 = 0; var2 < WriteIntegersCommand.field_E.length; var2++) {
          var3 = new ArgbSprite(40, 40);
          PacketBuffer.a(-100, var3);
          WriteIntegersCommand.field_E[var2].c(0, 0);
          ta.e(param0 - 12637);
          for (var4 = 0; var3.field_y.length > var4; var4++) {
            if (var3.field_y[var4] != 0) {
              var3.field_y[var4] = hf.a(var3.field_y[var4], -16777216);
            }
          }
          var3.addOutline(-16777216);
          var3.addOutline(2130706432);
          b.field_U[var2] = (Sprite) ((Object) nh.b(var3));
        }
        CipherPacketBuffer.k(61, 11);
        if (param0 != 12763) {
          return;
        }
        BufferedCacheFile.field_a = ProxySocketConnector.$cfr$intArgs$a$7f8aad568c81(-65, nv.field_E.length, new Random());
        mj.a(256.0, 60, (double)nv.field_E[BufferedCacheFile.field_a], (double)qt.field_r[BufferedCacheFile.field_a]);
        gg.h((byte) 51);
        jm.a(-5, false, -2);
        CipherPacketBuffer.k(61, 12);
        sk.a(-71, 4, 1);
        nr.a(6, 10, (byte) 54, 20, 320, 320, 6, 18, 240, 13, IsSixCommand.field_C, un.field_d, new nk(), 20, 16777215, 30, new pa(true), 16777215, 9, new pa(false), 16777215);
        sk.a(-57, 4, 2);
        nb.a((byte) -94);
        sk.a(75, 4, 3);
        ResizableModalPanel.a(param0 ^ 922092267, 50);
        Kickabout.t(param0 - 826888154);
        CipherPacketBuffer.k(61, 13);
        oa.a(false, new md());
        oa.a(false, new tr());
        oa.a(false, new w());
        oa.a(false, new vp());
        oa.a(false, new ac());
        oa.a(false, new fv());
    }

    final boolean e(int param0) {
        int var3_int = 0;
        ti var4 = null;
        int var7 = 0;
        PacketBuffer var8 = null;
        ue var9 = null;
        ue var10 = null;
        byte[] var14 = null;
        Throwable decompiledCaughtException = null;
        Exception var3 = null;
        var7 = Kickabout.field_G;
        if (wc.field_k == null) {
          return true;
        }
        if (!wc.field_k.a((byte) -109)) {
          return false;
        }
        var8 = wc.field_k.a(false);
        wc.field_k = null;
        if (var8 == null) {
          lf.field_b = null;
          jm.field_g = null;
          return true;
        }
        try {
          var3_int = var8.field_n;
          var8.field_n = param0;
          var4 = new ti(var8, var3_int);
          var9 = var4.a(-116, "motd_message");
          if (var9 == null) {
            lf.field_b = null;
          } else {
            var8.field_n = var9.field_i;
            lf.field_b = var8.a(param0 ^ -114);
          }
          var10 = var4.a(-116, "motd_image");
          if (var10 == null) {
            jm.field_g = null;
          } else {
            var8.field_n = var10.field_i;
            var14 = new byte[var10.field_h];
            var8.a(var14, 0, (byte) -6, var10.field_h);
            jm.field_g = new ArgbSprite(var14, (java.awt.Component) ((Object) nm.field_g));
            if (-1 == jm.field_g.field_q &&
              jm.field_g.field_w == -1) {
              jm.field_g = null;
              return true;
            }
          }
          return true;
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (Exception) (Object) decompiledCaughtException;
          lf.field_b = null;
          jm.field_g = null;
          bd.a("Error when unpacking the MOTD data in KickaboutLoader.service_motd()", (Throwable) ((Object) var3), 1);
          return true;
        }
    }

    public final void a(int param0) {
        this.b((byte) 115);
        if (fn.field_b != null) {
          ad.a(fn.field_b, 1);
          fn.field_b = null;
          dd.a((byte) 85);
        }
        b.field_H = ImageProducerRasterBuffer.a((byte) -126, 3);
        id.field_y = ImageProducerRasterBuffer.a((byte) -128, 11);
        bo.field_Cb = ImageProducerRasterBuffer.a((byte) -128, 5);
        v.field_b = ImageProducerRasterBuffer.a((byte) -125, 6);
        IterableNodeHashTable.field_c = ImageProducerRasterBuffer.a((byte) -127, 7);
        d.field_b = ImageProducerRasterBuffer.a((byte) -128, 8);
        vp.field_j = ImageProducerRasterBuffer.a((byte) -127, 9);
        ni.field_i = ImageProducerRasterBuffer.a((byte) -127, 10);
        if (param0 != 7312) {
          this.field_d = false;
        }
        Kickabout.field_J = ImageProducerRasterBuffer.a((byte) -126, 12);
        nt.field_Bb = ImageProducerRasterBuffer.a((byte) -128, 14);
        vu.field_Eb = ImageProducerRasterBuffer.a((byte) -126, 15);
        gd.field_h = ImageProducerRasterBuffer.a((byte) -126, 16);
        ResourceArchive.field_f = ImageProducerRasterBuffer.a((byte) -126, 17);
        ResourceArchive var4 = kh.field_g;
        ResourceArchive var3 = IterableNodeHashTable.field_b;
        mp.field_h = new qe(55);
        mp.field_h.a(var4, BufferedSocket.field_q, -6869, "basic", CommonGame.field_M);
        mp.field_h.a(ResourceArchive.field_f, BufferedSocket.field_q, -6869, "", CommonGame.field_M);
        mp.field_h.a(var4, BufferedSocket.field_q, -6869, "arialish12", CommonGame.field_M);
        mp.field_h.a(bo.field_Cb, lj.field_l, -6869, "fonts", CommonGame.field_M);
        mp.field_h.a(v.field_b, lj.field_l, -6869, "fonts", te.field_b);
        mp.field_h.a(var3, lj.field_l, -6869, "arialish12", te.field_b);
        mp.field_h.a(var3, lj.field_l, -6869, "lobby", te.field_b);
        mp.field_h.a(bo.field_Cb, p.field_a, -6869, "menu", CommonGame.field_M);
        mp.field_h.a(bo.field_Cb, sm.field_j, param0 - 14181, "hud", CommonGame.field_M);
        mp.field_h.a(bo.field_Cb, pn.field_B, -6869, "lobby", CommonGame.field_M);
        mp.field_h.a(var4, pn.field_B, -6869, "lobby", CommonGame.field_M);
        if (ih.field_c == 0) {
          mp.field_h.a(bo.field_Cb, pi.field_c, param0 - 14181, "park", CommonGame.field_M);
          mp.field_h.a(bo.field_Cb, pi.field_c, param0 - 14181, "park_surface0", CommonGame.field_M);
        }
        if (ih.field_c == 1) {
          mp.field_h.a(bo.field_Cb, th.field_b, -6869, "beach", CommonGame.field_M);
          mp.field_h.a(bo.field_Cb, th.field_b, -6869, "beach_surface0", CommonGame.field_M);
        }
        if (ih.field_c == 2) {
          mp.field_h.a(bo.field_Cb, h.field_d, param0 - 14181, "street", CommonGame.field_M);
          mp.field_h.a(bo.field_Cb, h.field_d, -6869, "beach_surface0", CommonGame.field_M);
        }
        mp.field_h.a(IterableNodeHashTable.field_c, (byte) -115, us.field_f, qj.field_c);
        mp.field_h.a(qj.field_c, d.field_b, -100);
        mp.field_h.a(vp.field_j, (byte) -109, fw.field_H, ej.field_yb);
        mp.field_h.a(ni.field_i, (byte) -123, fw.field_H, ej.field_yb);
        mp.field_h.a(Kickabout.field_J, (byte) -124, st.field_d, bl.field_n);
        mp.field_h.a(nt.field_Bb, (byte) -122, vp.field_l, cu.field_b);
        mp.field_h.a(vu.field_Eb, (byte) -126, vp.field_l, cu.field_b);
        mp.field_h.a(gd.field_h, (byte) -106, vp.field_l, cu.field_b);
        mp.field_h.a(b.field_H, (byte) -128, kw.field_g, os.field_d);
        mp.field_h.a(id.field_y, (byte) -116, bb.field_Ib, ac.field_e);
    }

    private final void a(int param0, ArgbSprite param1) {
        int var6 = 0;
        int var8 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ArgbSprite[] var5 = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          var3_int = param1.field_q / 8;
          var4 = param1.field_w / 10;
          var5 = new ArgbSprite[80];
          if (param0 != 11264) {
            field_f = (int[][]) null;
          }
          for (var6 = 0; qe.field_i.length > var6; var6++) {
            var5[var6] = new ArgbSprite(var3_int, var4);
            var7 = param1.field_q * var4 * (var6 / 8) + var3_int * (var6 % 8);
            for (var8 = 0; var8 < var5[var6].field_y.length; var8++) {
              var9 = var8 % var3_int + param1.field_q * (var8 / var3_int);
              var5[var6].field_y[var8] = param1.field_y[var7 + var9];
            }
            qe.field_i[var6] = var5[var6];
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("eh.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final Sprite[] a(String param0, ResourceArchive param1, byte param2, String param3) {
        Sprite[] var5 = null;
        RuntimeException var5_ref = null;
        Sprite[] var6 = null;
        Sprite[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 16) {
            eh.a((byte) 120);
          }
          var6 = ModalStack.a(param1, -42, param0, param3);
          var5 = var6;
          var6[3].field_v = var6[3].field_w;
          var6[1].field_o = var6[1].field_q;
          var6[5].field_v = var6[5].field_w;
          var6[7].field_o = var6[7].field_q;
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("eh.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, StringBuilder param2) {
        StringBuilder discarded$11 = null;
        int var3_int = param0 >> 16;
        StringBuilder discarded$0 = param2.append(var3_int);
        int var4 = (int)(1000.0f * ((float)(65535 & param0) / 65536.0f));
        StringBuilder discarded$10 = param2.append('.');
        if (param1 != 100) {
          return;
        }
        try {
          discarded$11 = param2.append(var4);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "eh.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_f = new int[7][3];
        field_f[0][0] = 60;
        field_f[0][2] = 20;
        field_f[0][1] = 40;
        field_f[1][1] = 140;
        field_f[1][0] = 210;
        field_f[1][2] = 70;
        field_f[2][2] = 160;
        field_f[2][0] = 480;
        field_f[2][1] = 320;
        field_f[3][1] = 500;
        field_f[3][2] = 250;
        field_f[3][0] = 750;
        field_f[4][0] = 1140;
        field_f[4][2] = 380;
        field_f[4][1] = 760;
        field_f[5][1] = 1040;
        field_f[5][0] = 1610;
        field_f[5][2] = 520;
        field_f[6][1] = 1800;
        field_f[6][0] = 2700;
        field_f[6][2] = 900;
    }
}
