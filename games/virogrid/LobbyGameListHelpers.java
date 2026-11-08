/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyGameListHelpers {
    static LogoAndLoginHelpers field_b;
    static String field_d;
    static String field_c;
    static String field_a;

    public static void releaseStatics(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != -29216) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void setLoginOptionalText(String param0, int param1) {
        try {
          StrongCacheReference.field_B = param0;
          if (param1 != 0) {
            LobbyGameListHelpers.updateLobbyGameList(true, -125, -71, (byte) 20, -84, 72, true);
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "pi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void updateLobbyGameList(boolean param0, int param1, int param2, byte param3, int param4, int param5, boolean param6) {
        int var18_int = 0;
        int var22_int = 0;
        SpriteWidget dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollPane stackIn_3_0;
        int stackIn_3_1;
        boolean stackIn_3_2;
        boolean stackIn_3_3;
        int stackIn_3_4;
        int stackIn_3_5;
        boolean stackIn_4_6 = false;
        LobbyGame stackIn_12_0;
        SpriteWidget stackIn_12_1;
        SpriteWidget stackIn_12_2;
        long stackIn_12_3;
        SpriteWidget stackIn_13_1 = null;
        SpriteWidget stackIn_13_2 = null;
        SpriteWidget stackIn_13_4 = null;
        LobbyGame stackIn_31_0;
        SpriteWidget stackIn_31_1;
        SpriteWidget stackIn_31_2;
        long stackIn_31_3;
        SpriteWidget stackIn_32_1;
        SpriteWidget stackIn_32_2;
        SpriteWidget stackIn_32_4;
        int stackIn_36_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_82_0 = 0;
        Sprite[] stackIn_84_0 = null;
        int stackIn_85_1 = 0;
        Sprite[] stackIn_92_0 = null;
        int stackIn_93_1 = 0;
        String stackIn_154_0 = null;
        String stackIn_163_0 = null;
        String stackIn_169_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        IntrusiveDeque var8 = null;
        long var9 = 0L;
        Object var11 = null;
        LobbyGame var12 = null;
        int var13 = 0;
        int var14 = 0;
        SpriteWidget var18 = null;
        SpriteWidget var19 = null;
        SpriteWidget var20 = null;
        SpriteWidget var21 = null;
        SpriteWidget var22 = null;
        SpriteWidget var23 = null;
        SpriteWidget var24 = null;
        SpriteWidget var25 = null;
        SpriteWidget var26 = null;
        SpriteWidget var27 = null;
        SpriteWidget var28 = null;
        SpriteWidget var29 = null;
        SpriteWidget var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        String var42 = null;
        Sprite var43 = null;
        SpriteWidget var44 = null;
        SpriteWidget var45 = null;
        SpriteWidget var46 = null;
        SpriteWidget var47 = null;
        SpriteWidget var48 = null;
        SpriteWidget var49 = null;
        SpriteWidget var50 = null;
        Object var51 = null;
        Sprite var51_ref = null;
        Object var52 = null;
        Sprite var52_ref = null;
        Object var53 = null;
        Sprite var53_ref = null;
        Object var54 = null;
        Sprite var54_ref = null;
        Sprite var55 = null;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var51 = null;
        var52 = null;
        var53 = null;
        var54 = null;
        var41 = Virogrid.field_F ? 1 : 0;
        try {
          stackIn_3_0 = DisplayModeInfo.field_a;
          stackIn_3_1 = 4 + LobbySortHelpers.field_e * 2;
          stackIn_3_2 = param6;
          stackIn_3_3 = false;
          stackIn_3_4 = 2;
          stackIn_3_5 = (8 + 4 * LobbySortHelpers.field_e) * param1;
          stackIn_4_6 = (DisplayModeInfo.field_a == RasterBuffer.field_d);
          var7_int = ((ScrollPane) (Object) stackIn_3_0).updateContentLayout(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_4_6) ? 1 : 0;
          var8 = DisplayModeInfo.field_a.field_Jb.field_W;
          if (param3 > -97) {
            var42 = (String) null;
            LobbyGameListHelpers.setLoginOptionalText((String) null, 55);
          }
          var9 = ClockAndTextHelpers.monotonicMillis(-9986);
          var11 = null;
          var12 = (LobbyGame) (var8.first((byte) -119));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_W == null) {
              var12.field_Lb = new SpriteWidget(0L, GzipDecompressor.field_d);
              var14 = param4 | param2;
              var12.addChild(0, var12.field_Lb);
              var12.field_Lb.field_lb = 1;
              var12.field_Vb = new SpriteWidget(0L, FadingModalPanel.field_F);
              var12.addChild(0, var12.field_Vb);
              var12.field_Nb = new SpriteWidget(0L, GzipDecompressor.field_d);
              var12.addChild(0, var12.field_Nb);
              var12.field_Nb.field_z = 0;
              var12.field_Gb = new SpriteWidget(0L, GzipDecompressor.field_d);
              var12.addChild(0, var12.field_Gb);
              var12.field_Gb.field_z = 0;
              var12.field_oc = new SpriteWidget(0L, FadingModalPanel.field_F);
              var12.addChild(0, var12.field_oc);
              var12.field_oc.field_lb = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (DialWidgetPainter.field_d) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = GzipDecompressor.field_d;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = FadingModalPanel.field_F;
              }
              stackIn_12_0.field_Yb = new SpriteWidget(stackIn_12_3, stackIn_13_4);
              var12.addChild(0, var12.field_Yb);
              var12.field_jc = new SpriteWidget[TextMetricsGlobals.field_h];
              var12.field_rc = new SpriteWidget(0L, (SpriteWidget) null);
              if (0 != (1 << TriangleSortHelpers.field_h & var14)) {
                var12.field_Yb.addChild(0, var12.field_rc);
              }
              var12.field_hc = new SpriteWidget(0L, (SpriteWidget) null);
              if ((1 << TextEncodingHelpers.field_a & var14) != 0) {
                var12.field_Yb.addChild(0, var12.field_hc);
              }
              var12.field_Fb = new SpriteWidget(0L, (SpriteWidget) null);
              if ((var14 & 1 << DialWidget.field_K) != 0) {
                var12.field_Yb.addChild(0, var12.field_Fb);
              }
              var12.field_qc = new SpriteWidget(0L, (SpriteWidget) null);
              if ((var14 & 1 << DiskArchiveRequest.field_z) != 0) {
                var12.field_Yb.addChild(0, var12.field_qc);
              }
              var46 = var12.field_rc;
              var45 = var12.field_qc;
              var12.field_Fb.field_D = 1;
              var44 = var12.field_hc;
              var44.field_D = 1;
              var45.field_D = 1;
              var46.field_D = 1;
              for (var18_int = 0; var18_int < TextMetricsGlobals.field_h; var18_int++) {
                var12.field_jc[var18_int] = new SpriteWidget(0L, (SpriteWidget) null);
                if (0 != (var14 & 1 << ClockAndTextHelpers.field_c + var18_int)) {
                  var12.field_Yb.addChild(0, var12.field_jc[var18_int]);
                }
                var12.field_jc[var18_int].field_D = 1;
              }
              stackIn_31_0 = var12;
              stackIn_31_1 = null;
              stackIn_31_2 = null;
              stackIn_31_3 = 0L;
              if (!DialWidgetPainter.field_d) {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = GzipDecompressor.field_d;
              } else {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = FadingModalPanel.field_F;
              }
              stackIn_31_0.field_Kb = new SpriteWidget(stackIn_31_3, stackIn_32_4);
              var12.addChild(0, var12.field_Kb);
              var12.field_Kb.field_lb = 2;
              var12.field_uc = new SpriteWidget(0L, FadingModalPanel.field_F);
              var12.addChild(0, var12.field_uc);
              var12.field_bc = new SpriteWidget(0L, IntrusiveDequeCursor.field_e);
              var12.addChild(0, var12.field_bc);
              var12.field_Ob = new SpriteWidget(0L, IntrusiveDequeCursor.field_e);
              var12.addChild(0, var12.field_Ob);
              var12.field_Tb = new SpriteWidget(0L, LinkTextPainter.field_h);
              var12.addChild(0, var12.field_Tb);
              var12.markTreeDirty((byte) 42);
              var12.field_tc = new SpriteWidget(0L, UiTheme.field_a);
              var13 = 1;
              var12.addChild(0, var12.field_tc);
            }
            stackIn_36_0 = (!var12.field_kc) ? param4 : param2;
            var14Lifetime1 = stackIn_36_0;
            var12.field_Lb.field_V = null;
            var12.field_Lb.field_ub = 0;
            var47 = var12.field_Lb;
            var47.field_K = 0;
            var12.field_tc.field_V = null;
            var12.field_tc.field_ub = 0;
            var48 = var12.field_tc;
            var48.field_K = 0;
            var12.field_Vb.field_V = null;
            var12.field_Vb.field_ub = 0;
            var49 = var12.field_Vb;
            var12.field_Nb.field_V = null;
            var49.field_K = 0;
            var12.field_Nb.field_ub = 0;
            var18 = var12.field_Nb;
            var12.field_Gb.field_V = null;
            var18.field_K = 0;
            var19 = var12.field_Gb;
            var12.field_Gb.field_ub = 0;
            var19.field_K = 0;
            var12.field_oc.field_V = null;
            var20 = var12.field_oc;
            var12.field_oc.field_ub = 0;
            var12.field_Yb.field_V = null;
            var20.field_K = 0;
            var21 = var12.field_Yb;
            var12.field_Yb.field_ub = 0;
            var21.field_K = 0;
            for (var22_int = 0; var22_int < TextMetricsGlobals.field_h; var22_int++) {
              var12.field_jc[var22_int].normalSprite = null;
              var23 = var12.field_jc[var22_int];
              var12.field_jc[var22_int].field_ub = 0;
              var23.field_K = 0;
            }
            var12.field_rc.normalSprite = null;
            var12.field_rc.field_ub = 0;
            var22 = var12.field_rc;
            var12.field_qc.normalSprite = null;
            var22.field_K = 0;
            var50 = var12.field_qc;
            var12.field_qc.field_ub = 0;
            var12.field_hc.normalSprite = null;
            var50.field_K = 0;
            var12.field_hc.field_ub = 0;
            var24 = var12.field_hc;
            var24.field_K = 0;
            var12.field_Fb.normalSprite = null;
            var25 = var12.field_Fb;
            var12.field_Fb.field_ub = 0;
            var12.field_Kb.field_V = null;
            var25.field_K = 0;
            var12.field_Kb.field_ub = 0;
            var26 = var12.field_Kb;
            var26.field_K = 0;
            var12.field_uc.field_V = null;
            var12.field_uc.field_ub = 0;
            var27 = var12.field_uc;
            var12.field_bc.field_V = null;
            var27.field_K = 0;
            var12.field_bc.field_ub = 0;
            var28 = var12.field_bc;
            var28.field_K = 0;
            var12.field_Ob.field_V = null;
            var29 = var12.field_Ob;
            var12.field_Ob.field_ub = 0;
            var29.field_K = 0;
            var12.field_Tb.field_V = null;
            var30 = var12.field_Tb;
            var12.field_Tb.field_ub = 0;
            var30.field_K = 0;
            var12.field_K = DisplayModeInfo.field_a.field_Jb.field_K;
            var31 = 0;
            var32 = var12.field_Qb;
            if (!var12.isUnlisted((byte) -115)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.field_kc) {
                if (var12.field_mc >= 0) {
                  var12.field_Lb.field_V = WeightedLruCache.field_g;
                } else {
                  if (var12.field_Rb && (var12.field_Ib ||
                    var12.field_dc)) {
                    var12.field_tc.field_V = FrameSkin.field_b;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_lc == 2) {
                      var12.field_tc.field_V = BufferedFile.field_a;
                    } else {
                      var12.field_Lb.field_V = RasterBuffer.field_k;
                    }
                  }
                }
              } else {
                if (!var12.field_Ib &&
                  !var12.field_dc) {
                  if (var12.field_Sb) {
                    var12.field_Lb.field_V = BufferedSocket.field_b;
                  } else {
                    var12.field_Lb.field_V = IconTextComponent.field_Eb;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_tc.field_V = FrameSkin.field_b;
                }
              }
              if (var12.field_tc.field_V == null) {
                var12.field_Lb.setGeometry(0, LobbySortHelpers.field_e, 68, (byte) -91, var31);
              } else {
                var12.field_tc.setGeometry(0, LobbySortHelpers.field_e, 68, (byte) -110, var31);
              }
              var12.field_Vb.field_V = BitmapFont.truncateWithEllipsis(var12.field_Vb.field_C, var32, 78);
              var12.field_Vb.setGeometry(70, LobbySortHelpers.field_e, 78, (byte) -50, var31);
              if (var12.field_Vb.field_S &&
                !var12.field_Vb.field_V.equals(var32)) {
                QuickChatCategoryCache.field_g = var32;
              }
              var12.field_Nb.field_V = Integer.toString(var12.field_ic);
              if (!var12.field_Rb) {
                var12.field_Nb.field_lb = 1;
                var12.field_Nb.setGeometry(150, LobbySortHelpers.field_e, 48, (byte) -83, var31);
              } else {
                var12.field_Nb.field_lb = 2;
                var12.field_Gb.field_V = "/" + var12.field_vc;
                var33_int = (-var12.field_Gb.field_C.textWidth("/") + 348) / 2;
                var12.field_Nb.setGeometry(150, LobbySortHelpers.field_e, -150 + var33_int, (byte) -67, var31);
                var12.field_Gb.setGeometry(var33_int, LobbySortHelpers.field_e, 198 - var33_int, (byte) -47, var31);
              }
              var12.field_oc.field_V = Integer.toString(var12.field_ac);
              var12.field_oc.setGeometry(200, LobbySortHelpers.field_e, 48, (byte) -94, var31);
              stackIn_71_0 = (DialWidgetPainter.field_d) ? 250 : 200;
              var33_intLifetime1 = stackIn_71_0;
              var12.field_Yb.setGeometry(var33_intLifetime1, LobbySortHelpers.field_e, -2 + (-var33_intLifetime1 + 365), (byte) -80, var31);
              var34_int = ConnectionStage.field_b;
              if ((var14Lifetime1 & 1 << TriangleSortHelpers.field_h) != 0) {
                var51_ref = BirthDateInputWidget.gamePrivacyIcons[var12.field_fc];
                var12.field_rc.normalSprite = var51_ref;
                var12.field_rc.setGeometry(var34_int, var12.field_Yb.field_ub, var51_ref.field_u, (byte) -58, 0);
                var34_int = var34_int + (ConnectionStage.field_b + var51_ref.field_u);
              }
              if ((var14Lifetime1 & 1 << TextEncodingHelpers.field_a) != 0) {
                if (!var12.field_Ib) {
                  stackIn_82_0 = (var12.field_dc) ? 1 : 0;
                } else {
                  stackIn_82_0 = 1;
                }
                var36 = stackIn_82_0;
                stackIn_84_0 = TypeCode.openToMeIcons;
                if (var36 != 0) {
                  stackIn_85_1 = 1;
                } else {
                  stackIn_85_1 = 0;
                }
                var52_ref = stackIn_84_0[stackIn_85_1];
                var12.field_hc.normalSprite = var52_ref;
                var12.field_hc.setGeometry(var34_int, var12.field_Yb.field_ub, var52_ref.field_u, (byte) -72, 0);
                var34_int = var34_int + (ConnectionStage.field_b + var52_ref.field_u);
              }
              if ((1 << DialWidget.field_K & var14Lifetime1) != 0) {
                var53_ref = ProxySocketConnector.allowSpectatorsIcons[var12.field_lc - 1];
                var12.field_Fb.normalSprite = var53_ref;
                var12.field_Fb.setGeometry(var34_int, var12.field_Yb.field_ub, var53_ref.field_u, (byte) -50, 0);
                var34_int = var34_int + (ConnectionStage.field_b + var53_ref.field_u);
              }
              if ((1 << DiskArchiveRequest.field_z & var14Lifetime1) != 0) {
                stackIn_92_0 = CellAnimator.ratedGameIcons;
                if (var12.field_Ub) {
                  stackIn_93_1 = 1;
                } else {
                  stackIn_93_1 = 0;
                }
                var54_ref = stackIn_92_0[stackIn_93_1];
                var12.field_qc.normalSprite = var54_ref;
                var12.field_qc.setGeometry(var34_int, var12.field_Yb.field_ub, var54_ref.field_u, (byte) -108, 0);
                var34_int = var34_int + (ConnectionStage.field_b + var54_ref.field_u);
              }
              if (LoadingProgressDialog.field_fb != null) {
                for (var36Lifetime1 = 0; var36Lifetime1 < TextMetricsGlobals.field_h; var36Lifetime1++) {
                  if (null != LoadingProgressDialog.field_fb[var36Lifetime1] &&
                    (var14Lifetime1 & 1 << ClockAndTextHelpers.field_c + var36Lifetime1) != 0) {
                    var43 = LoadingProgressDialog.field_fb[var36Lifetime1][255 & var12.field_Pb[var36Lifetime1]];
                    var55 = var43;
                    var12.field_jc[var36Lifetime1].normalSprite = var43;
                    var12.field_jc[var36Lifetime1].setGeometry(var34_int, var12.field_Yb.field_ub, var55.field_u, (byte) -41, 0);
                    var34_int = var34_int + (ConnectionStage.field_b + var55.field_u);
                  }
                }
              }
              var36Lifetime2 = (var12.field_Yb.field_K - var34_int) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_rc.field_tb = var12.field_rc.field_tb + var36Lifetime2;
                var12.field_hc.field_tb = var12.field_hc.field_tb + var36Lifetime2;
                var12.field_Fb.field_tb = var12.field_Fb.field_tb + var36Lifetime2;
                var12.field_qc.field_tb = var12.field_qc.field_tb + var36Lifetime2;
                for (var37_int = 0; TextMetricsGlobals.field_h > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_jc[var37_int];
                  dupTemp$0.field_tb = dupTemp$0.field_tb + var36Lifetime2;
                }
              }
              if (var12.field_kc) {
                var37_intLifetime1 = var12.field_mc;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Hb);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 < 60) {
                  var12.field_Kb.field_V = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Kb.field_V = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Kb.setGeometry(365, LobbySortHelpers.field_e, -365 + var12.field_K, (byte) -41, var31);
              var31 = var31 + LobbySortHelpers.field_e;
              if (var12.field_Zb != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(LogoIntroHelpers.field_d);
                discarded$2 = var37.append(var12.field_Zb[0]);
                for (var38_intLifetime1 = 1; var12.field_ic > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Zb[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_uc.field_V = var38;
                var39Lifetime1 = var12.field_uc.field_C.wrappedLineCount(var38, -(var12.field_uc.field_z * 2) + var12.field_K);
                var12.field_uc.setGeometry(0, LobbySortHelpers.field_e * var39Lifetime1, var12.field_K, (byte) -100, var31);
                var31 = var31 + LobbySortHelpers.field_e * var39Lifetime1;
              }
              if (var12.field_dc) {
                var12.field_bc.field_V = MenuScreen.formatIndexedText(new String[]{var32}, CredentialHelpers.field_e, 2);
                var12.field_bc.setGeometry(PopupMenuDrawHelpers.field_d, LobbySortHelpers.field_e, var12.field_K - 2 * PopupMenuDrawHelpers.field_d, (byte) -126, var31);
                var31 = var31 + LobbySortHelpers.field_e;
              }
              if (var12.field_sc) {
                var12.field_Ob.field_V = MenuScreen.formatIndexedText(new String[]{var32}, IndexedSpriteState.field_f, 2);
                var12.field_Ob.setGeometry(PopupMenuDrawHelpers.field_d, LobbySortHelpers.field_e, var12.field_K - PopupMenuDrawHelpers.field_d * 2, (byte) -96, var31);
                var31 = var31 + LobbySortHelpers.field_e;
              }
            }
            var33 = ArchiveProvider.getJoinFailureMessage(var32, var12.field_Eb, (byte) 83);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Tb.field_C.wrappedLineCount(var33, -PopupMenuDrawHelpers.field_d + var12.field_K - PopupMenuDrawHelpers.field_d);
              var12.field_Tb.field_H = 256 * var12.field_Mb / LobbySessionHelpers.field_c;
              var12.field_Tb.field_V = var33;
              var12.field_Tb.setGeometry(PopupMenuDrawHelpers.field_d, var34_intLifetime1 * LobbySortHelpers.field_e, -(2 * PopupMenuDrawHelpers.field_d) + var12.field_K, (byte) -48, var31);
              var31 = var31 + var34_intLifetime1 * LobbySortHelpers.field_e;
            }
            if (var7_int == 0) {
              var12.field_kb = var31 - var12.field_ub;
            }
            if (var13 != 0) {
              DisplayModeInfo.field_a.field_Jb.positionAfter(2, var12, (SpriteWidget) (var11), (byte) 98);
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < TextMetricsGlobals.field_h; var34_intLifetime2++) {
              if (var12.field_jc[var34_intLifetime2].field_S) {
                if (null == QuickChatPhraseDefinition.field_p) {
                  var35 = null;
                } else {
                  if (null != QuickChatPhraseDefinition.field_p[var34_intLifetime2]) {
                    var35 = QuickChatPhraseDefinition.field_p[var34_intLifetime2][255 & var12.field_Pb[var34_intLifetime2]];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 != null) {
                  QuickChatCategoryCache.field_g = LoginMethodHelpers.field_a[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  QuickChatCategoryCache.field_g = LoginMethodHelpers.field_a[var34_intLifetime2];
                }
              }
            }
            if (var12.field_rc.field_S) {
              if (var12.field_fc == 1) {
                var34 = DualLinkDequeIterator.field_g;
              } else {
                var34 = ChatMessage.field_b[var12.field_fc];
              }
              QuickChatCategoryCache.field_g = HelpPopup.field_Gb + " - " + var34;
            }
            if (var12.field_qc.field_S) {
              if (var12.field_Ub) {
                stackIn_154_0 = IconTextComponent.field_Ib;
              } else {
                stackIn_154_0 = LogoRenderHelpers.field_g;
              }
              QuickChatCategoryCache.field_g = stackIn_154_0;
            }
            if (var12.field_hc.field_S) {
              if (!var12.field_Ib &&
                !var12.field_dc) {
                if (var12.field_Rb) {
                  stackIn_163_0 = MusicCrossfadeStream.field_z;
                } else {
                  stackIn_163_0 = AccountCreationSupport.field_f;
                }
              } else {
                stackIn_163_0 = PendingScoreQuery.field_i;
              }
              QuickChatCategoryCache.field_g = stackIn_163_0;
            }
            if (var12.field_Fb.field_S) {
              if (var12.field_lc == 2) {
                stackIn_169_0 = Js5Transport.field_o;
              } else {
                stackIn_169_0 = BackgroundParticle.field_i;
              }
              QuickChatCategoryCache.field_g = stackIn_169_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (0 != var12.field_nb &&
              !var12.isUnlisted((byte) 45)) {
              if (0 == var12.field_tc.field_nb) {
                GzipDecompressor.openLobbyEntryContextMenu(var12, 17300, param0, var32);
              } else {
                if (var12.field_kc && (!var12.field_Rb ||
                  !var12.field_Ib &&
                  !var12.field_dc)) {
                  DiskCacheWorker.sendShortSetting(var12.getGameId((byte) -124), param5, 14534);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  LogoRenderHelpers.sendJoinRequest((byte) 20, var12.getGameId((byte) -124), param5);
                }
              }
            }
            var12 = (LobbyGame) (var8.next(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var7), "pi.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void openRelativePage(String param0, int param1, java.applet.Applet param2) {
        try {
          java.net.URL var3 = null;
          if (param1 != -17713) {
            field_a = (String) null;
          }
          try {
            var3 = new java.net.URL(param2.getCodeBase(), param0);
            var3 = BoundedUrlRequest.appendSessionParameters(-1, param2, var3);
            Js5Archive.openExternalUrl(var3.toString(), param2, (byte) -25, true);
          } catch (Exception exception) {
            exception.printStackTrace();
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new LogoAndLoginHelpers();
        field_d = "Instructions";
        field_c = "Kick";
        field_a = "Status";
    }
}
