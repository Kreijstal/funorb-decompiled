/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginDialog extends ContentTransitionDialog {
    static String field_Db;
    static boolean field_Gb;
    static SceneWidget field_Ab;
    static String field_Bb;
    static int field_Fb;
    static IndexedSprite[] field_Cb;
    static String field_zb;
    static String field_Eb;

    LoginDialog(ModalStack param0, UiComponent param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void releaseStatics(byte param0) {
        field_zb = null;
        field_Ab = null;
        field_Bb = null;
        field_Eb = null;
        field_Db = null;
        field_Cb = null;
        if (param0 > -110) {
          field_Ab = (SceneWidget) null;
        }
    }

    final static HighscoreTable findOrSendListRequest(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = SteelSentinels.obfuscationControl;
        HighscoreTable var5 = (HighscoreTable) (SentinelCommand.field_w.first(13058));
        int var6 = -56 % ((-3 - param0) / 44);
        while (var5 != null) {
          if (var5.field_C == param2) {
            return var5;
          }
          var5 = (HighscoreTable) (SentinelCommand.field_w.next((byte) -28));
        }
        var5 = new HighscoreTable();
        var5.field_u = param4;
        var5.field_w = param1;
        var5.field_C = param2;
        SentinelCommand.field_w.addLast(3, var5);
        TextHotspotWidget.sendListRequest(param3, var5, -2864);
        return var5;
    }

    final static void drawLobbyOverlays(byte param0, boolean param1) {
        SceneWidget stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        SceneWidget stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
        SceneWidget stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        SceneWidget stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        if (param0 > -102) {
          return;
        }
        ArchiveRequest.pushClip(-640 + SoftwareRaster.field_c >> 1, 0, -102, 640 + SoftwareRaster.field_c >> 1, SoftwareRaster.field_j);
        if (SentinelCommand.field_t > 0) {
          if (null != Js5ArchiveManager.field_e) {
            Js5ArchiveManager.field_e.drawOpaque(QuickChatMenu.field_Ub.field_Y, 0);
          }
          stackIn_9_0 = QuickChatMenu.field_Ub;
          stackIn_10_1 = (param1) && (!LobbyStateHelpers.field_b);
          ((SceneWidget) (Object) stackIn_9_0).drawFullScreen(stackIn_10_1, (byte) 126);
          stackIn_13_0 = PlayingSound.field_q;
          stackIn_14_1 = (param1) && (!LobbyStateHelpers.field_b);
          ((SceneWidget) (Object) stackIn_13_0).drawFullScreen(stackIn_14_1, (byte) 127);
        }
        if (!(SolidSpriteHelpers.field_c <= 0) ||
          !(PasswordRuleHelpers.field_f <= 0)) {
          if (null != Js5ArchiveManager.field_e) {
            Js5ArchiveManager.field_e.drawOpaque(SocialListPanel.field_ec.field_Y, 0);
          }
          stackIn_23_0 = SocialListPanel.field_ec;
          stackIn_24_1 = (param1) && (!GzipDecoder.field_c);
          ((SceneWidget) (Object) stackIn_23_0).drawFullScreen(stackIn_24_1, (byte) 127);
          stackIn_27_0 = NanoTickClock.field_y;
          stackIn_28_1 = (param1) && (!GzipDecoder.field_c);
          ((SceneWidget) (Object) stackIn_27_0).drawFullScreen(stackIn_28_1, (byte) 126);
        }
        MatchingTextValidator.popRasterStateWithIntGuard(98);
    }

    final static void openSocialEntryMenu(int param0, int param1, int param2, LobbyPlayer param3, ScrollContainer param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        PlayerContextMenu var12 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          TextAndMenuHelpers.openPlayerContextMenu(param3, -1, -1, (int[]) null, param3.field_mc, param3.field_Vb, 1073741824, param3.field_ec, param4);
          AudioService.field_i.addGameInviteActions(true, (byte) -126);
          AudioService.field_i.addSocialActions((int[]) null, -2, 0);
          AudioService.field_i.addReportAction(-121);
          var12 = AudioService.field_i;
          var8 = param1;
          var9 = param6;
          var10 = param0;
          var11 = param5;
          var12.field_j.layoutItems(var11, var10, var9, (byte) -101, var8);
          if (param2 != 4) {
            LoginDialog.findOrSendListRequest((byte) -65, -107, 25, 12, -73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("bf.JB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static void openAccountRequestDialog(byte param0, boolean param1, String param2) {
        try {
          EmailAvailabilityValidator.field_p = param1;
          DelayedServerPacket.field_A = true;
          ArrayWidgetContainer.field_O = new AccountRequestDialog(GradientOutlineTextPainter.field_p, GeneratedSpriteHelpers.field_d, param2, LoginMethod.field_d, EmailAvailabilityValidator.field_p);
          GradientOutlineTextPainter.field_p.pushPanel(ArrayWidgetContainer.field_O, -118);
          if (param0 > -63) {
            LoginDialog.buildMainScreenRoots(57);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "bf.MB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void buildMainScreenRoots(int param0) {
        Sprite.field_l = new SceneWidget(0L, (SceneWidget) null);
        if (param0 != 854) {
          field_zb = (String) null;
        }
        if (MenuInputState.field_p) {
          Sprite.field_l.addChild(Explosion.field_C, 126);
        }
        Sprite.field_l.addChild(TeamColourTinter.field_c, 122);
        BoundedRandomAccessFile.field_f = new SocialTabsPanel(ThreeSliceButtonPainter.field_p, Sprite.field_l);
        QuickChatMenu.field_Ub = new SceneWidget(0L, (SceneWidget) null);
        QuickChatMenu.field_Ub.addChild(BoundedRandomAccessFile.field_f.field_d, param0 - 734);
        QuickChatMenu.field_Ub.addChild(BufferedSocket.field_i, 120);
        TextHotspotRegion.layoutLobbyWidgets(0);
    }

    final void transitionToContent(UiComponent param0, int param1) {
        try {
          super.transitionToContent(param0, param1 ^ 0);
          if (param1 != -22908735) {
            field_Bb = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "bf.NB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static String joinCharSequenceRange(int param0, int param1, byte param2, CharSequence[] param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_9_0 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = SteelSentinels.obfuscationControl;
        try {
          if (0 == param0) {
            stackIn_3_0 = "";
            return stackIn_3_0;
          }
          if (param0 == 1) {
            var10 = param3[param1];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param1 + param0;
          var5 = 0;
          for (var6_int = param1; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param3[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          if (param2 != 50) {
            LoginDialog.releaseStatics((byte) 37);
          }
          for (var7 = param1; var7 < var4_int; var7++) {
            var8 = param3[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_25_0 = var6.toString();
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_28_0 = var4_ref;
          stackIn_28_1 = new StringBuilder().append("bf.KB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_Gb = false;
        field_Db = "Return to Campaign";
        field_Bb = "Elapsed time";
        field_zb = "TECH VALUE: <%0> (<%1>)";
        field_Eb = "Mission Failed";
    }
}
