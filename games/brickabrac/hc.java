/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static String field_d;
    static RgbSprite[][] field_a;
    static int field_h;
    static boolean field_c;
    static int field_f;
    static RgbSprite field_g;
    static String field_b;
    static int[] field_e;

    final static fr a(int param0, BitPacketBuffer param1) {
        int var7 = 0;
        fr stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fr var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param1.readBits(8, (byte) 62);
          if (0 < var2_int) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = DirectByteStorage.a(false, param1) ? 1 : 0;
          var4 = DirectByteStorage.a(false, param1) ? 1 : 0;
          var5 = new fr();
          var5.field_w = (short)param1.readBits(16, (byte) -114);
          var5.field_B = LevelList.a((byte) -67, var5.field_B, param1, 16);
          var5.field_Q = LevelList.a((byte) -117, var5.field_Q, param1, 16);
          var5.field_P = LevelList.a((byte) -110, var5.field_P, param1, param0);
          var5.field_C = (short)param1.readBits(16, (byte) 79);
          var5.field_G = LevelList.a((byte) -64, var5.field_G, param1, 16);
          var5.field_b = LevelList.a((byte) -74, var5.field_b, param1, 16);
          var5.field_c = LevelList.a((byte) -124, var5.field_c, param1, 16);
          if (var3 != 0) {
            var5.field_o = (short)param1.readBits(16, (byte) 52);
            var5.field_n = LevelList.a((byte) -107, var5.field_n, param1, 16);
            var5.field_H = LevelList.a((byte) -77, var5.field_H, param1, 16);
            var5.field_a = LevelList.a((byte) -117, var5.field_a, param1, 16);
            var5.field_v = LevelList.a((byte) -68, var5.field_v, param1, 16);
            var5.field_h = LevelList.a((byte) -80, var5.field_h, param1, 16);
            var5.field_t = LevelList.a((byte) -61, var5.field_t, param1, 16);
          }
          if (var4 != 0) {
            param1.readBits(16, (byte) 101);
            var5.field_z = LevelList.a((byte) -122, var5.field_z, param1, 16);
            var5.field_m = LevelList.a((byte) -92, var5.field_m, param1, 16);
            var5.field_K = LevelList.a((byte) -123, var5.field_K, param1, 16);
            var5.field_j = LevelList.a((byte) -104, var5.field_j, param1, 16);
            var5.field_J = LevelList.a((byte) -124, var5.field_J, param1, 16);
          }
          if (DirectByteStorage.a(false, param1)) {
            var5.field_L = LevelList.a((byte) -65, var5.field_L, param1, 16);
          }
          if (DirectByteStorage.a(false, param1)) {
            var5.field_p = ri.a(var5.field_p, 16, param1, 20);
            var6 = 0;
            for (var7 = 0; var5.field_p.length > var7; var7++) {
              if ((var5.field_p[var7] & 255) > var6) {
                var6 = 255 & var5.field_p[var7];
              }
            }
            if (var6 != 0) {
              var5.field_A = (byte)(1 + var6);
            } else {
              var5.field_p = null;
            }
          }
          stackIn_26_0 = var5;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("hc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = (RgbSprite[][]) null;
        field_d = null;
        field_b = null;
        if (param0 >= -59) {
          field_c = true;
        }
        field_g = null;
    }

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = BrickABrac.field_J ? 1 : 0;
        int var1_intLifetime1;
        try {
          MenuSelection.gameClock.reset(1);
          for (var1_int = 0; var1_int < 32; var1_int++) {
            ig.renderTimes[var1_int] = 0L;
          }
          for (var1_intLifetime1 = 0; 32 > var1_intLifetime1; var1_intLifetime1++) {
            sm.tickTimes[var1_intLifetime1] = 0L;
          }
          if (param0 != 2) {
            field_c = false;
          }
          c.cyclesDue = 0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "hc.D(" + param0 + ')');
        }
    }

    final static void a(byte param0, IndexedSprite[] param1, int[] param2, ResourceArchive param3, ResourceArchive param4) {
        RgbSprite[] dupTemp$0 = null;
        RgbSprite[] dupTemp$1 = null;
        RgbSprite[] dupTemp$2 = null;
        RgbSprite[] dupTemp$3 = null;
        IndexedSprite[] var5 = null;
        IndexedSprite[] var6 = null;
        int[] var6_array = null;
        int var7_int = 0;
        int var18 = 0;
        int[] var19 = null;
        IndexedSprite[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[] var24 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        hl var7 = null;
        mh var8 = null;
        mh var9 = null;
        mh var10 = null;
        mh var11 = null;
        RgbSprite[] var12 = null;
        RgbSprite[] var13 = null;
        RgbSprite[] var14 = null;
        mh var15 = null;
        RgbSprite[] var16 = null;
        RgbSprite[] var17 = null;
        int var7_intLifetime1;
        int var7_intLifetime2;
        int var7_intLifetime3;
        var18 = BrickABrac.field_J ? 1 : 0;
        try {
          var20 = PacketBuffer.a("lobby", param3, "crowns", -946715356);
          var5 = var20;
          LevelPackLoader.field_g = var20.length;
          if (param1 != null) {
            var6 = new IndexedSprite[LevelPackLoader.field_g + param1.length];
            for (var7_int = 0; LevelPackLoader.field_g > var7_int; var7_int++) {
              var6[var7_int] = var20[var7_int];
            }
            for (var7_intLifetime3 = 0; param1.length > var7_intLifetime3; var7_intLifetime3++) {
              var6[LevelPackLoader.field_g + var7_intLifetime3] = param1[var7_intLifetime3];
            }
            var5 = var6;
          }
          var23 = new int[var5.length];
          var21 = var23;
          var19 = var21;
          var24 = var19;
          var22 = var24;
          var6_array = var22;
          for (var7_intLifetime1 = 0; LevelPackLoader.field_g > var7_intLifetime1; var7_intLifetime1++) {
            var23[var7_intLifetime1] = 10;
          }
          if (param1 != null) {
            if (param2 != null) {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param1.length; var7_intLifetime2++) {
                var6_array[LevelPackLoader.field_g + var7_intLifetime2] = param2[var7_intLifetime2];
              }
            } else {
              for (var7_intLifetime2 = 0; var7_intLifetime2 < param1.length; var7_intLifetime2++) {
                var6_array[LevelPackLoader.field_g + var7_intLifetime2] = param1[var7_intLifetime2].canvasHeight;
              }
            }
          }
          np.field_a = 15;
          MenuSelection.field_g = 2;
          om.field_oc = 4;
          if (param0 < 102) {
            return;
          }
          kn.field_z = 2;
          ok.field_f = 11;
          var7 = TooltipSprite.a((byte) -37, "lobby", param3, param4, "largefont");
          rd.field_e = TooltipSprite.a((byte) -37, "lobby", param3, param4, "generalfont");
          ScorePopup.field_m = TooltipSprite.a((byte) -37, "lobby", param3, param4, "chatfont");
          var7.setInlineSprites(var5, var24);
          rd.field_e.setInlineSprites(var5, var24);
          ScorePopup.field_m.setInlineSprites(var5, var24);
          var8 = new mh(0L, (mh) null);
          var8.field_O = (TextFont) ((Object) var7);
          var8.field_X = 16777215;
          var8.field_R = np.field_a;
          var8.field_Q = 1;
          var9 = var8;
          var9.field_S = 1;
          var10 = new mh(0L, (mh) null);
          var10.field_R = np.field_a;
          var10.field_X = 16777215;
          var10.field_O = (TextFont) ((Object) rd.field_e);
          var11 = var10;
          var10.field_Q = 1;
          var11.field_S = 1;
          qh.field_j = new mh(0L, var8);
          qh.field_j.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "heading", 2), (byte) -117);
          lp.field_Ab = new mh(0L, (mh) null);
          lp.field_Ab.field_Jb = TimedSplashScreen.a(false, (byte) 83, 8421504, 120, 4210752, false);
          f.field_a = new mh(0L, (mh) null);
          f.field_a.field_Jb = na.a(false, 6316128, 3, 6316128, 114, 1);
          GameUiController.field_c = new mh(0L, (mh) null);
          GameUiController.field_c.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "popup", 2), (byte) -114);
          var12 = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "popup_mouseover", 2), (byte) -117);
          var13 = cr.loadRgbSpritesByName("lobby", param3, "button", 2);
          var14 = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "tab_active", 2), (byte) -110);
          rf.field_c = new mh(0L, var8);
          rf.field_c.field_Jb = var14;
          am.field_Zb = new mh(0L, (mh) null);
          am.field_Zb.field_wb = pl.loadRgbSpriteByName("lobby", "closebutton", (byte) -90, param3);
          am.field_Zb.field_T = pl.loadRgbSpriteByName("lobby", "closebutton_mouseover", (byte) 119, param3);
          lj.field_k = new mh(0L, var8);
          lj.field_k.field_Jb = TimedSplashScreen.a(true, (byte) 57, 3815994, 40, 2039583, true);
          MainMenuScreen.field_t = new mh(0L, var10);
          MainMenuScreen.field_t.field_V = 2;
          MainMenuScreen.field_t.field_Jb = TimedSplashScreen.a(true, (byte) 44, 3815994, 30, 2039583, false);
          cd.field_d = new mh(0L, var10);
          cd.field_d.field_V = 2;
          cd.field_d.field_Jb = TimedSplashScreen.a(false, (byte) 77, 3815994, 30, 2039583, false);
          ik.field_a = new mh(0L, var10);
          ik.field_a.field_V = 2;
          ik.field_a.field_Jb = TimedSplashScreen.a(false, (byte) 83, 3815994, 30, 2039583, true);
          CappedUrlRequest.field_l = new mh(0L, (mh) null);
          CappedUrlRequest.field_l.field_Q = 1;
          CappedUrlRequest.field_l.field_O = (TextFont) ((Object) rd.field_e);
          CappedUrlRequest.field_l.field_R = np.field_a;
          CappedUrlRequest.field_l.field_X = 13421772;
          DualLinkNode.field_t = new mh(0L, CappedUrlRequest.field_l);
          DualLinkNode.field_t.field_Fb = 16777215;
          DualLinkNode.field_t.field_I = 8421504;
          DualLinkNode.field_t.field_X = 16764006;
          DualLinkNode.field_t.field_Y = 16777215;
          DualLinkNode.field_t.field_vb = 16777215;
          var15 = new mh(0L, DualLinkNode.field_t);
          var15.field_O = (TextFont) ((Object) var7);
          var15.field_X = 16777215;
          var15.field_R = np.field_a;
          Paddle.field_C = new mh(0L, CappedUrlRequest.field_l);
          Paddle.field_C.field_Jb = TimedSplashScreen.a(false, (byte) 94, 2236962, 16, 2236962, false);
          Paddle.field_C.field_V = 2;
          wi.field_n = new mh(0L, CappedUrlRequest.field_l);
          wi.field_n.field_Jb = TimedSplashScreen.a(false, (byte) 80, 1513239, 16, 1513239, false);
          wi.field_n.field_V = 2;
          OptionsScreen.field_v = new mh(0L, Paddle.field_C);
          OptionsScreen.field_v.a((byte) -82, DualLinkNode.field_t);
          vb.field_K = new mh(0L, wi.field_n);
          vb.field_K.a((byte) -72, DualLinkNode.field_t);
          var16 = cr.loadRgbSpritesByName("lobby", param3, "button_mouseover", 2);
          ce.field_b = new br(GameUiController.field_c, var12, CappedUrlRequest.field_l, DualLinkNode.field_t, 3, 2, kn.field_z, 3, np.field_a);
          fi.field_s = new mh(0L, DualLinkNode.field_t);
          fi.field_s.field_E = 1;
          fi.field_s.field_ub = 1;
          fi.field_s.field_N = 1;
          fi.field_s.field_Gb = var16;
          fi.field_s.field_Jb = var13;
          fi.field_s.field_rb = 1;
          fi.field_s.field_D = cr.loadRgbSpritesByName("lobby", param3, "button_mouseheld", 2);
          fi.field_s.field_pb = cr.loadRgbSpritesByName("lobby", param3, "button_active", 2);
          fi.field_s.field_Ab = cr.loadRgbSpritesByName("lobby", param3, "button_disabled", 2);
          fi.field_s.field_S = 1;
          eh.field_n = new mh(0L, DualLinkNode.field_t);
          eh.field_n.field_S = 1;
          eh.field_n.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "tab_inactive", 2), (byte) -119);
          eh.field_n.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "tab_mouseover", 2), (byte) -124);
          eh.field_n.field_pb = var14;
          hd.field_c = new mh(0L, (mh) null);
          hd.field_c.field_Jb = na.a(false, 1127256, 3, 1856141, 206, -1);
          qb.field_x = new mh(0L, (mh) null);
          qb.field_x.field_Jb = na.a(false, 6052956, 3, 11579568, 290, -1);
          fm.field_b = new mh(0L, var15);
          fm.field_b.field_rb = 1;
          fm.field_b.field_N = 1;
          fm.field_b.field_E = 1;
          fm.field_b.field_S = 1;
          fm.field_b.field_ub = 1;
          GameUiController.field_b = new mh(0L, fm.field_b);
          MessageScreen.field_r = new mh(0L, DualLinkNode.field_t);
          MessageScreen.field_r.field_N = 1;
          MessageScreen.field_r.field_S = 1;
          MessageScreen.field_r.field_E = 1;
          MessageScreen.field_r.field_rb = 1;
          MessageScreen.field_r.field_ub = 1;
          ok.field_d = new mh(0L, MessageScreen.field_r);
          MotionWaypoint.field_s = new mh(0L, MessageScreen.field_r);
          MatchCompleteScreen.field_x = new mh(0L, fm.field_b);
          GzipInflater.field_d = new mh(0L, MessageScreen.field_r);
          OptionsScreen.field_u = new mh(0L, MessageScreen.field_r);
          al.field_n = new mh(0L, MessageScreen.field_r);
          MessageScreen.field_r.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "smallbutton", 2), (byte) -119);
          MessageScreen.field_r.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "smallbutton_mouseover", 2), (byte) -114);
          dupTemp$0 = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "smallbutton_active", 2), (byte) -102);
          MessageScreen.field_r.field_pb = dupTemp$0;
          MessageScreen.field_r.field_D = dupTemp$0;
          MessageScreen.field_r.field_Ab = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "smallbutton_disabled", 2), (byte) -120);
          GameUiController.field_b.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "mediumbutton", 2), (byte) -102);
          GameUiController.field_b.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "mediumbutton_mouseover", 2), (byte) -105);
          GameUiController.field_b.field_D = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "mediumbutton_mouseheld", 2), (byte) -123);
          fm.field_b.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "bigbutton", 2), (byte) -114);
          fm.field_b.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "bigbutton_mouseover", 2), (byte) -120);
          fm.field_b.field_D = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "bigbutton_mouseheld", 2), (byte) -114);
          fm.field_b.field_Ab = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "bigbutton_disabled", 2), (byte) -106);
          ok.field_d.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "greenbutton", 2), (byte) -127);
          ok.field_d.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "greenbutton_mouseover", 2), (byte) -126);
          ok.field_d.field_D = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "greenbutton_mouseheld", 2), (byte) -119);
          MotionWaypoint.field_s.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "redbutton", 2), (byte) -105);
          MotionWaypoint.field_s.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "redbutton_mouseover", 2), (byte) -106);
          MotionWaypoint.field_s.field_D = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "redbutton_mouseheld", 2), (byte) -121);
          MatchCompleteScreen.field_x.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "backbutton", 2), (byte) -127);
          MatchCompleteScreen.field_x.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "backbutton_mouseover", 2), (byte) -103);
          MatchCompleteScreen.field_x.field_D = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "backbutton_mouseheld", 2), (byte) -122);
          MatchCompleteScreen.field_x.field_Ab = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "backbutton_disabled", 2), (byte) -107);
          al.field_n.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "gameoptionbutton", 2), (byte) -115);
          al.field_n.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "gameoptionbutton_mouseover", 2), (byte) -114);
          dupTemp$1 = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "gameoptionbutton_active", 2), (byte) -112);
          al.field_n.field_pb = dupTemp$1;
          al.field_n.field_D = dupTemp$1;
          al.field_n.field_Ab = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "gameoptionbutton_disabled", 2), (byte) -116);
          GzipInflater.field_d.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "chatbutton", 2), (byte) -103);
          GzipInflater.field_d.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "chatbutton_mouseover", 2), (byte) -113);
          dupTemp$2 = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "chatbutton_active", 2), (byte) -125);
          GzipInflater.field_d.field_pb = dupTemp$2;
          GzipInflater.field_d.field_D = dupTemp$2;
          OptionsScreen.field_u.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "chatfilterbutton", 2), (byte) -119);
          OptionsScreen.field_u.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "chatfilterbutton_mouseover", 2), (byte) -106);
          dupTemp$3 = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "chatfilterbutton_active", 2), (byte) -105);
          OptionsScreen.field_u.field_pb = dupTemp$3;
          OptionsScreen.field_u.field_D = dupTemp$3;
          var17 = cr.loadRgbSpritesByName("lobby", param3, "checkbox", 2);
          BlankScreen.field_k = new ni(0L, var17[1], var17[0], 1, DualLinkNode.field_t, (String) null);
          kb.field_Vb = new mh(0L, (mh) null);
          kb.field_Vb.field_Jb = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion", (byte) -95, param3), -52);
          kb.field_Vb.field_Gb = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion_mouseover", (byte) 104, param3), -71);
          kb.field_Vb.field_D = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion_mouseheld", (byte) 118, param3), -86);
          kb.field_Vb.field_Ab = HighscorePackSelector.a(pl.loadRgbSpriteByName("lobby", "slideregion_disabled", (byte) -47, param3), -39);
          RankingsScreen.field_s = new mh(0L, (mh) null);
          RankingsScreen.field_s.field_Jb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "dragbar", 2), (byte) -102);
          RankingsScreen.field_s.field_Gb = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "dragbar_mouseover", 2), (byte) -119);
          RankingsScreen.field_s.field_D = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "dragbar_mouseheld", 2), (byte) -120);
          RankingsScreen.field_s.field_Ab = GameConnectionShell.a(cr.loadRgbSpritesByName("lobby", param3, "dragbar_disabled", 2), (byte) -123);
          oo.field_u = new mh(0L, (mh) null);
          oo.field_u.field_wb = pl.loadRgbSpriteByName("lobby", "upbutton", (byte) -90, param3);
          oo.field_u.field_T = pl.loadRgbSpriteByName("lobby", "upbutton_mouseover", (byte) -125, param3);
          oo.field_u.field_tb = pl.loadRgbSpriteByName("lobby", "upbutton_mouseheld", (byte) 125, param3);
          oo.field_u.field_Hb = pl.loadRgbSpriteByName("lobby", "upbutton_disabled", (byte) -114, param3);
          MessageScreen.field_s = new mh(0L, (mh) null);
          MessageScreen.field_s.field_wb = pl.loadRgbSpriteByName("lobby", "downbutton", (byte) 99, param3);
          MessageScreen.field_s.field_T = pl.loadRgbSpriteByName("lobby", "downbutton_mouseover", (byte) -109, param3);
          MessageScreen.field_s.field_tb = pl.loadRgbSpriteByName("lobby", "downbutton_mouseheld", (byte) 97, param3);
          MessageScreen.field_s.field_Hb = pl.loadRgbSpriteByName("lobby", "downbutton_disabled", (byte) 104, param3);
          ic.field_c = new fj(0L, oo.field_u, MessageScreen.field_s, kb.field_Vb, RankingsScreen.field_s);
          rq.field_b = new hj(0L, (mh) null, am.field_Qb, ic.field_c, MessageScreen.field_r, (String) null, (String) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_28_0 = var5_ref;
          stackIn_28_1 = new StringBuilder().append("hc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param3 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',');
          if (param4 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3) {
        ng.a((byte) -86, param0);
        ce.a(param0, param3, (byte) 94, param2);
        if (param1 != -7812) {
          hc.b(4);
        }
    }

    static {
        field_d = "Type your age in years";
        field_b = "Message game";
        field_h = 1;
        field_e = new int[]{0, 27, 1, 5, 32, 4, 3, 22, 19, 42};
    }
}
