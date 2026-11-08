/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SpriteState extends DualLinkNode {
    int field_t;
    static float field_v;
    int field_E;
    int field_D;
    int field_x;
    static int field_A;
    static String field_I;
    int field_u;
    int field_F;
    static int field_G;
    static String field_y;
    static String field_z;
    static String field_H;
    static Sprite[] field_B;
    static String field_w;

    final static void updateLobbyGameList(int param0, int param1, boolean param2, int param3, byte param4, int param5, boolean param6) {
        int var18_int = 0;
        int var22_int = 0;
        UiComponent dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollPane stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_3_4;
        boolean stackIn_4_5 = false;
        LobbyGame stackIn_12_0;
        UiComponent stackIn_12_1;
        UiComponent stackIn_12_2;
        long stackIn_12_3;
        UiComponent stackIn_13_1 = null;
        UiComponent stackIn_13_2 = null;
        UiComponent stackIn_13_4 = null;
        LobbyGame stackIn_31_0;
        UiComponent stackIn_31_1;
        UiComponent stackIn_31_2;
        long stackIn_31_3;
        UiComponent stackIn_32_1;
        UiComponent stackIn_32_2;
        UiComponent stackIn_32_4;
        int stackIn_36_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_81_0 = 0;
        Sprite[] stackIn_83_0 = null;
        int stackIn_84_1 = 0;
        Sprite[] stackIn_91_0 = null;
        int stackIn_92_1 = 0;
        String stackIn_154_0 = null;
        String stackIn_164_0 = null;
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
        UiComponent var18 = null;
        UiComponent var19 = null;
        UiComponent var20 = null;
        UiComponent var21 = null;
        UiComponent var22 = null;
        UiComponent var23 = null;
        UiComponent var24 = null;
        UiComponent var25 = null;
        UiComponent var26 = null;
        UiComponent var27 = null;
        UiComponent var28 = null;
        UiComponent var29 = null;
        UiComponent var30 = null;
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
        Sprite var42 = null;
        UiComponent var43 = null;
        UiComponent var44 = null;
        UiComponent var45 = null;
        UiComponent var46 = null;
        UiComponent var47 = null;
        UiComponent var48 = null;
        UiComponent var49 = null;
        Object var50 = null;
        Sprite var50_ref = null;
        Object var51 = null;
        Sprite var51_ref = null;
        Object var52 = null;
        Sprite var52_ref = null;
        Object var53 = null;
        Sprite var53_ref = null;
        Sprite var54 = null;
        String var34Lifetime1;
        String var34Lifetime2;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = TetraLink.field_J;
        try {
          stackIn_3_0 = NetworkGameClient.field_t;
          stackIn_3_1 = 2;
          stackIn_3_2 = (2 + GameKeyHandler.field_d) * 2;
          stackIn_3_3 = -118;
          stackIn_3_4 = param2;
          stackIn_4_5 = (PendingMove.field_d == NetworkGameClient.field_t);
          var7_int = ((ScrollPane) (Object) stackIn_3_0).layoutAndScrollToContent(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_4_5, param3 * (8 + 4 * GameKeyHandler.field_d)) ? 1 : 0;
          var8 = NetworkGameClient.field_t.field_Pb.field_fb;
          var9 = ClockAndTextHelpers.monotonicMillis(0);
          var11 = null;
          if (param4 != -73) {
            SpriteState.releaseStatics(64);
          }
          var12 = (LobbyGame) (var8.first(false));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_fb == null) {
              var14 = param5 | param1;
              var12.field_nc = new UiComponent(0L, JoinGameTextGlobals.field_c);
              var12.addChild((byte) -108, var12.field_nc);
              var12.field_nc.field_xb = 1;
              var12.field_pc = new UiComponent(0L, SectorCacheStore.field_h);
              var12.addChild((byte) -96, var12.field_pc);
              var12.field_Bc = new UiComponent(0L, JoinGameTextGlobals.field_c);
              var12.addChild((byte) 127, var12.field_Bc);
              var12.field_Bc.field_V = 0;
              var12.field_yc = new UiComponent(0L, JoinGameTextGlobals.field_c);
              var12.addChild((byte) -112, var12.field_yc);
              var12.field_yc.field_V = 0;
              var12.field_Xb = new UiComponent(0L, SectorCacheStore.field_h);
              var12.addChild((byte) -93, var12.field_Xb);
              var12.field_Xb.field_xb = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (IntroFinalFrameHelpers.field_b) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = JoinGameTextGlobals.field_c;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = SectorCacheStore.field_h;
              }
              stackIn_12_0.field_Yb = new UiComponent(stackIn_12_3, stackIn_13_4);
              var12.addChild((byte) -100, var12.field_Yb);
              var12.field_Lb = new UiComponent[GameOptionControls.field_k];
              var12.field_lc = new UiComponent(0L, (UiComponent) null);
              if ((1 << ArchiveIndex.field_t & var14) != 0) {
                var12.field_Yb.addChild((byte) 24, var12.field_lc);
              }
              var12.field_ac = new UiComponent(0L, (UiComponent) null);
              if ((var14 & 1 << MidiPcmStream.field_s) != 0) {
                var12.field_Yb.addChild((byte) 21, var12.field_ac);
              }
              var12.field_zc = new UiComponent(0L, (UiComponent) null);
              if ((1 << VerticalScrollbar.field_Kb & var14) != 0) {
                var12.field_Yb.addChild((byte) -105, var12.field_zc);
              }
              var12.field_Rb = new UiComponent(0L, (UiComponent) null);
              if ((var14 & 1 << PageReloadHelpers.field_d) != 0) {
                var12.field_Yb.addChild((byte) -126, var12.field_Rb);
              }
              var45 = var12.field_lc;
              var44 = var12.field_Rb;
              var43 = var12.field_ac;
              var12.field_zc.field_J = 1;
              var43.field_J = 1;
              var44.field_J = 1;
              var45.field_J = 1;
              for (var18_int = 0; GameOptionControls.field_k > var18_int; var18_int++) {
                var12.field_Lb[var18_int] = new UiComponent(0L, (UiComponent) null);
                if ((var14 & 1 << var18_int + ChatMessageReader.field_h) != 0) {
                  var12.field_Yb.addChild((byte) 73, var12.field_Lb[var18_int]);
                }
                var12.field_Lb[var18_int].field_J = 1;
              }
              stackIn_31_0 = var12;
              stackIn_31_1 = null;
              stackIn_31_2 = null;
              stackIn_31_3 = 0L;
              if (!IntroFinalFrameHelpers.field_b) {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = JoinGameTextGlobals.field_c;
              } else {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = SectorCacheStore.field_h;
              }
              stackIn_31_0.field_wc = new UiComponent(stackIn_31_3, stackIn_32_4);
              var12.addChild((byte) 55, var12.field_wc);
              var12.field_wc.field_xb = 2;
              var12.field_Mb = new UiComponent(0L, SectorCacheStore.field_h);
              var12.addChild((byte) 86, var12.field_Mb);
              var12.field_vc = new UiComponent(0L, NotificationToast.field_n);
              var12.addChild((byte) -88, var12.field_vc);
              var12.field_Pb = new UiComponent(0L, NotificationToast.field_n);
              var12.addChild((byte) -116, var12.field_Pb);
              var12.field_Tb = new UiComponent(0L, TextLayoutLine.field_i);
              var12.addChild((byte) -85, var12.field_Tb);
              var12.markTreeDirty((byte) -114);
              var12.field_hc = new UiComponent(0L, CameraAndChatHelpers.field_c);
              var13 = 1;
              var12.addChild((byte) 68, var12.field_hc);
            }
            stackIn_36_0 = (!var12.field_Kb) ? param5 : param1;
            var14Lifetime1 = stackIn_36_0;
            var12.field_nc.field_jb = null;
            var12.field_nc.field_R = 0;
            var46 = var12.field_nc;
            var12.field_hc.field_jb = null;
            var46.field_Hb = 0;
            var47 = var12.field_hc;
            var12.field_hc.field_R = 0;
            var47.field_Hb = 0;
            var12.field_pc.field_jb = null;
            var12.field_pc.field_R = 0;
            var48 = var12.field_pc;
            var48.field_Hb = 0;
            var12.field_Bc.field_jb = null;
            var12.field_Bc.field_R = 0;
            var18 = var12.field_Bc;
            var18.field_Hb = 0;
            var12.field_yc.field_jb = null;
            var12.field_yc.field_R = 0;
            var19 = var12.field_yc;
            var19.field_Hb = 0;
            var12.field_Xb.field_jb = null;
            var20 = var12.field_Xb;
            var12.field_Xb.field_R = 0;
            var12.field_Yb.field_jb = null;
            var20.field_Hb = 0;
            var12.field_Yb.field_R = 0;
            var21 = var12.field_Yb;
            var21.field_Hb = 0;
            for (var22_int = 0; GameOptionControls.field_k > var22_int; var22_int++) {
              var12.field_Lb[var22_int].field_vb = null;
              var23 = var12.field_Lb[var22_int];
              var12.field_Lb[var22_int].field_R = 0;
              var23.field_Hb = 0;
            }
            var12.field_lc.field_vb = null;
            var22 = var12.field_lc;
            var12.field_lc.field_R = 0;
            var22.field_Hb = 0;
            var12.field_Rb.field_vb = null;
            var12.field_Rb.field_R = 0;
            var49 = var12.field_Rb;
            var12.field_ac.field_vb = null;
            var49.field_Hb = 0;
            var12.field_ac.field_R = 0;
            var24 = var12.field_ac;
            var12.field_zc.field_vb = null;
            var24.field_Hb = 0;
            var12.field_zc.field_R = 0;
            var25 = var12.field_zc;
            var12.field_wc.field_jb = null;
            var25.field_Hb = 0;
            var26 = var12.field_wc;
            var12.field_wc.field_R = 0;
            var26.field_Hb = 0;
            var12.field_Mb.field_jb = null;
            var12.field_Mb.field_R = 0;
            var27 = var12.field_Mb;
            var12.field_vc.field_jb = null;
            var27.field_Hb = 0;
            var28 = var12.field_vc;
            var12.field_vc.field_R = 0;
            var12.field_Pb.field_jb = null;
            var28.field_Hb = 0;
            var12.field_Pb.field_R = 0;
            var29 = var12.field_Pb;
            var29.field_Hb = 0;
            var12.field_Tb.field_jb = null;
            var30 = var12.field_Tb;
            var12.field_Tb.field_R = 0;
            var30.field_Hb = 0;
            var12.field_Hb = NetworkGameClient.field_t.field_Pb.field_Hb;
            var31 = 0;
            var32 = var12.field_ec;
            if (!var12.isUnlisted(-597)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.field_Kb) {
                if (var12.field_bc >= 0) {
                  var12.field_nc.field_jb = SocialListEntry.field_Pb;
                } else {
                  if (var12.field_kc && (var12.field_xc ||
                    var12.field_Vb)) {
                    var12.field_hc.field_jb = LobbyGame.field_Sb;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_Zb != 2) {
                      var12.field_nc.field_jb = StripedProgressBar.field_V;
                    } else {
                      var12.field_hc.field_jb = DualLinkNodeHashTable.field_m;
                    }
                  }
                }
              } else {
                if (!var12.field_xc &&
                  !var12.field_Vb) {
                  if (!var12.field_uc) {
                    var12.field_nc.field_jb = IconLabelItem.field_Kb;
                  } else {
                    var12.field_nc.field_jb = QuickChatMenu.field_Vb;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_hc.field_jb = LobbyGame.field_Sb;
                }
              }
              if (var12.field_hc.field_jb == null) {
                var12.field_nc.setBounds((byte) -119, 68, var31, GameKeyHandler.field_d, 0);
              } else {
                var12.field_hc.setBounds((byte) -118, 68, var31, GameKeyHandler.field_d, 0);
              }
              var12.field_pc.field_jb = BitmapFont.truncateWithEllipsis(var12.field_pc.field_Ib, var32, 78);
              var12.field_pc.setBounds((byte) -102, 78, var31, GameKeyHandler.field_d, 70);
              if (var12.field_pc.field_Y &&
                !var12.field_pc.field_jb.equals(var32)) {
                CheckboxWidget.field_P = var32;
              }
              var12.field_Bc.field_jb = Integer.toString(var12.field_jc);
              if (var12.field_kc) {
                var12.field_yc.field_jb = "/" + var12.field_rc;
                var12.field_Bc.field_xb = 2;
                var33_int = (-var12.field_yc.field_Ib.textWidth("/") + 348) / 2;
                var12.field_Bc.setBounds((byte) -104, -150 + var33_int, var31, GameKeyHandler.field_d, 150);
                var12.field_yc.setBounds((byte) -102, -var33_int + 198, var31, GameKeyHandler.field_d, var33_int);
              } else {
                var12.field_Bc.field_xb = 1;
                var12.field_Bc.setBounds((byte) -125, 48, var31, GameKeyHandler.field_d, 150);
              }
              var12.field_Xb.field_jb = Integer.toString(var12.field_Qb);
              var12.field_Xb.setBounds((byte) -106, 48, var31, GameKeyHandler.field_d, 200);
              stackIn_70_0 = (IntroFinalFrameHelpers.field_b) ? 250 : 200;
              var33_intLifetime1 = stackIn_70_0;
              var12.field_Yb.setBounds((byte) -109, -var33_intLifetime1 + 365 - 2, var31, GameKeyHandler.field_d, var33_intLifetime1);
              var34_int = QueuedStatSubmission.field_w;
              if ((var14Lifetime1 & 1 << ArchiveIndex.field_t) != 0) {
                var50_ref = LoadingScreenHelpers.field_b[var12.field_ic];
                var12.field_lc.field_vb = var50_ref;
                var12.field_lc.setBounds((byte) -89, var50_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                var34_int = var34_int + (QueuedStatSubmission.field_w + var50_ref.field_t);
              }
              if ((var14Lifetime1 & 1 << MidiPcmStream.field_s) != 0) {
                if (!var12.field_xc) {
                  stackIn_81_0 = (var12.field_Vb) ? 1 : 0;
                } else {
                  stackIn_81_0 = 1;
                }
                var36 = stackIn_81_0;
                stackIn_83_0 = ArchiveRequest.field_u;
                if (var36 != 0) {
                  stackIn_84_1 = 1;
                } else {
                  stackIn_84_1 = 0;
                }
                var51_ref = stackIn_83_0[stackIn_84_1];
                var12.field_ac.field_vb = var51_ref;
                var12.field_ac.setBounds((byte) -92, var51_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                var34_int = var34_int + (QueuedStatSubmission.field_w + var51_ref.field_t);
              }
              if ((var14Lifetime1 & 1 << VerticalScrollbar.field_Kb) != 0) {
                var52_ref = field_B[-1 + var12.field_Zb];
                var12.field_zc.field_vb = var52_ref;
                var12.field_zc.setBounds((byte) -94, var52_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                var34_int = var34_int + (var52_ref.field_t + QueuedStatSubmission.field_w);
              }
              if ((1 << PageReloadHelpers.field_d & var14Lifetime1) != 0) {
                stackIn_91_0 = MenuThemeHelpers.field_e;
                if (var12.field_mc) {
                  stackIn_92_1 = 1;
                } else {
                  stackIn_92_1 = 0;
                }
                var53_ref = stackIn_91_0[stackIn_92_1];
                var12.field_Rb.field_vb = var53_ref;
                var12.field_Rb.setBounds((byte) -121, var53_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                var34_int = var34_int + (QueuedStatSubmission.field_w + var53_ref.field_t);
              }
              if (null != KeyHandlerHelpers.field_b) {
                for (var36Lifetime1 = 0; var36Lifetime1 < GameOptionControls.field_k; var36Lifetime1++) {
                  if (null != KeyHandlerHelpers.field_b[var36Lifetime1] &&
                    (1 << var36Lifetime1 + ChatMessageReader.field_h & var14Lifetime1) != 0) {
                    var42 = KeyHandlerHelpers.field_b[var36Lifetime1][var12.field_sc[var36Lifetime1] & 255];
                    var54 = var42;
                    var12.field_Lb[var36Lifetime1].field_vb = var42;
                    var12.field_Lb[var36Lifetime1].setBounds((byte) -123, var54.field_t, 0, var12.field_Yb.field_R, var34_int);
                    var34_int = var34_int + (var54.field_t + QueuedStatSubmission.field_w);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_Yb.field_Hb) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_lc.field_M = var12.field_lc.field_M + var36Lifetime2;
                var12.field_ac.field_M = var12.field_ac.field_M + var36Lifetime2;
                var12.field_zc.field_M = var12.field_zc.field_M + var36Lifetime2;
                var12.field_Rb.field_M = var12.field_Rb.field_M + var36Lifetime2;
                for (var37_int = 0; GameOptionControls.field_k > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_Lb[var37_int];
                  dupTemp$0.field_M = dupTemp$0.field_M + var36Lifetime2;
                }
              }
              if (var12.field_Kb) {
                var37_intLifetime1 = var12.field_bc;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Ac);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 < 60) {
                  var12.field_wc.field_jb = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_wc.field_jb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_wc.setBounds((byte) -101, var12.field_Hb - 365, var31, GameKeyHandler.field_d, 365);
              var31 = var31 + GameKeyHandler.field_d;
              if (var12.field_fc != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(DialWidgetPainter.field_e);
                discarded$2 = var37.append(var12.field_fc[0]);
                for (var38_intLifetime1 = 1; var12.field_jc > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_fc[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Mb.field_jb = var38;
                var39Lifetime1 = var12.field_Mb.field_Ib.wrappedLineCount(var38, -(2 * var12.field_Mb.field_V) + var12.field_Hb);
                var12.field_Mb.setBounds((byte) -96, var12.field_Hb, var31, var39Lifetime1 * GameKeyHandler.field_d, 0);
                var31 = var31 + GameKeyHandler.field_d * var39Lifetime1;
              }
              if (var12.field_Vb) {
                var12.field_vc.field_jb = SectorCacheStore.formatTemplate(new String[]{var32}, MenuThemeHelpers.field_b, 127);
                var12.field_vc.setBounds((byte) -106, -(2 * DisplayNameForm.field_Q) + var12.field_Hb, var31, GameKeyHandler.field_d, DisplayNameForm.field_Q);
                var31 = var31 + GameKeyHandler.field_d;
              }
              if (var12.field_Wb) {
                var12.field_Pb.field_jb = SectorCacheStore.formatTemplate(new String[]{var32}, DebouncedValidator.field_g, 121);
                var12.field_Pb.setBounds((byte) -96, -(2 * DisplayNameForm.field_Q) + var12.field_Hb, var31, GameKeyHandler.field_d, DisplayNameForm.field_Q);
                var31 = var31 + GameKeyHandler.field_d;
              }
            }
            var33 = NanoTickClock.getJoinFailureMessage((byte) 63, var32, var12.field_gc);
            var34 = var33;
            var34Lifetime1 = var33;
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Tb.field_Ib.wrappedLineCount(var33, -DisplayNameForm.field_Q + (var12.field_Hb - DisplayNameForm.field_Q));
              var12.field_Tb.field_jb = var33;
              var12.field_Tb.field_K = 256 * var12.field_Ub / QuickChatPhraseCache.field_a;
              var12.field_Tb.setBounds((byte) -112, var12.field_Hb - 2 * DisplayNameForm.field_Q, var31, var34_intLifetime1 * GameKeyHandler.field_d, DisplayNameForm.field_Q);
              var31 = var31 + GameKeyHandler.field_d * var34_intLifetime1;
            }
            if (var7_int == 0) {
              var12.field_mb = -var12.field_R + var31;
            }
            if (var13 != 0) {
              NetworkGameClient.field_t.field_Pb.placeBelow((UiComponent) (var11), true, var12, 2);
            }
            for (var34_intLifetime2 = 0; GameOptionControls.field_k > var34_intLifetime2; var34_intLifetime2++) {
              if (var12.field_Lb[var34_intLifetime2].field_Y) {
                if (GameOptionTextTables.field_c != null) {
                  if (GameOptionTextTables.field_c[var34_intLifetime2] != null) {
                    var35 = GameOptionTextTables.field_c[var34_intLifetime2][var12.field_sc[var34_intLifetime2] & 255];
                  } else {
                    var35 = null;
                  }
                } else {
                  var35 = null;
                }
                if (var35 != null) {
                  CheckboxWidget.field_P = ArchiveRequest.field_y[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  CheckboxWidget.field_P = ArchiveRequest.field_y[var34_intLifetime2];
                }
              }
            }
            if (var12.field_lc.field_Y) {
              if (var12.field_ic != 1) {
                var34Lifetime2 = TriangleSpanHelpers.field_b[var12.field_ic];
              } else {
                var34Lifetime2 = MusicPatch.field_y;
              }
              CheckboxWidget.field_P = KeyEventHelpers.field_c + " - " + var34Lifetime2;
            }
            if (var12.field_Rb.field_Y) {
              if (!var12.field_mc) {
                stackIn_154_0 = MenuInputState.field_h;
              } else {
                stackIn_154_0 = EmailSyntaxValidator.field_u;
              }
              CheckboxWidget.field_P = stackIn_154_0;
            }
            if (var12.field_ac.field_Y) {
              if (!var12.field_xc &&
                !var12.field_Vb) {
                if (var12.field_kc) {
                  stackIn_164_0 = JoinGameTextGlobals.field_d;
                } else {
                  stackIn_164_0 = EmailSyntaxValidator.field_x;
                }
              } else {
                stackIn_164_0 = TopLevelContainerHelpers.field_c;
              }
              CheckboxWidget.field_P = stackIn_164_0;
            }
            if (var12.field_zc.field_Y) {
              if (2 != var12.field_Zb) {
                stackIn_169_0 = IconLabelItem.field_Pb;
              } else {
                stackIn_169_0 = DefaultQuickChatContext.field_d;
              }
              CheckboxWidget.field_P = stackIn_169_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_F != 0 &&
              !var12.isUnlisted(-597)) {
              if (var12.field_hc.field_F != 0) {
                if (var12.field_Kb && (!var12.field_kc ||
                  !var12.field_xc &&
                  !var12.field_Vb)) {
                  LabelPairWidget.sendByteRequest(param4 + 76, var12.getGameId(-80), param0);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  LoginProgressHelpers.sendShortRequest(param0, (byte) 108, var12.getGameId(-98));
                }
              } else {
                IsaacCipher.openLobbyGameContextMenu(var12, (byte) 110, param6, var32);
              }
            }
            var12 = (LobbyGame) (var8.next((byte) -70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var7), "md.P(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_B = null;
        field_z = null;
        field_y = null;
        field_H = null;
        field_I = null;
        field_w = null;
        if (param0 <= 1) {
          field_v = -0.4149215519428253f;
        }
    }

    SpriteState() {
    }

    final static void writeReflectionCheckReply(byte param0, BitPacketBuffer param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_68_0 = null;
          StringBuilder stackIn_68_1 = null;
          String stackIn_69_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          ReflectionCheck var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          ReflectionCheck var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = TetraLink.field_J;
          try {
            var13 = (ReflectionCheck) (CachedArchiveSource.field_C.first(false));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            var4 = 0;
            if (param0 != -93) {
              return;
            }
            while (var4 < var17.field_r) {
              if (var13.field_x[var4] != null) {
                if (var13.field_x[var4].field_d == 2) {
                  var13.field_w[var4] = -5;
                }
                if (var13.field_x[var4].field_d == 0) {
                  var3 = 1;
                }
              }
              if (null != var13.field_u[var4]) {
                if (2 == var13.field_u[var4].field_d) {
                  var13.field_w[var4] = -6;
                }
                if (var13.field_u[var4].field_d == 0) {
                  var3 = 1;
                }
              }
              var4++;
            }
            if (var3 != 0) {
              return;
            }
            var4 = param1.position;
            param1.writeInt(var17.field_s, (byte) -124);
            for (var5 = 0; var5 < var17.field_r; var5++) {
              if (var17.field_w[var5] != 0) {
                param1.writeByte(var17.field_w[var5], false);
              } else {
                try {
                  var6_int = var17.field_z[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_x[var5].field_f);
                    var8 = var15.getInt((Object) null);
                    param1.writeByte(0, false);
                    param1.writeInt(var8, (byte) -124);
                  } else {
                    if (1 == var6_int) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_x[var5].field_f);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_q[var5]);
                      param1.writeByte(0, false);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_x[var5].field_f);
                        var8 = var26.getModifiers();
                        param1.writeByte(0, false);
                        param1.writeInt(var8, (byte) -124);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_u[var5].field_f);
                    var25 = var17.field_t[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param1.writeByte(0, false);
                    } else if (var10 instanceof Number) {
                      param1.writeByte(1, false);
                      param1.writeLong(-1, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param1.writeByte(4, false);
                    } else {
                      param1.writeByte(2, false);
                      param1.writeString((String) (var10), 0);
                    }
                  } else {
                    if (4 == var6_int) {
                      var27 = (java.lang.reflect.Method) (var17.field_u[var5].field_f);
                      var8Lifetime1 = var27.getModifiers();
                      param1.writeByte(0, false);
                      param1.writeInt(var8Lifetime1, (byte) -124);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param1.writeByte(-10, false);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param1.writeByte(-11, false);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param1.writeByte(-12, false);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param1.writeByte(-13, false);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param1.writeByte(-14, false);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param1.writeByte(-15, false);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param1.writeByte(-16, false);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param1.writeByte(-17, false);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param1.writeByte(-18, false);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param1.writeByte(-19, false);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param1.writeByte(-20, false);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param1.writeByte(-21, false);
                }
              }
            }
            param1.writeCrc32(var4, param0 - 17);
            var17.unlink(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_68_0 = var2;
            stackIn_68_1 = new StringBuilder().append("md.Q(").append(param0).append(',');
            if (param1 == null) {
              stackIn_69_2 = "null";
            } else {
              stackIn_69_2 = "{...}";
            }
            throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_I = "Searching for opponents";
        field_A = -1;
        field_H = "Hide game chat";
        field_z = "Detail: ";
        field_y = "Spectate <%0>'s game";
        field_w = "Rating";
    }
}
