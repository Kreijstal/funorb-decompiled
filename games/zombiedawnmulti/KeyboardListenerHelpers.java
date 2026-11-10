/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardListenerHelpers {
    static String field_b;
    static String field_c;
    static String[] field_e;
    static volatile long field_d;
    static String field_a;

    final static boolean handleChatShortcutKey(int param0, boolean param1, int param2) {
        int stackIn_3_0 = 0;
        int var3;
        String var4;
        String var4Lifetime1;
        stackIn_3_0 = (null == BufferedSocket.field_n) ? 0 : 1;
        var3 = stackIn_3_0;
        if (InfectionEvent.field_p != 9) {
          if (InfectionEvent.field_p == 10) {
            if (var3 != 0) {
              return false;
            }
            SineTableHelpers.openPublicQuickChat(13151);
            return true;
          }
          if (11 != InfectionEvent.field_p) {
            if (param1) {
            }
            return false;
          }
          if (!ColourPickerWidget.field_Hb) {
            if (param1) {
            }
            return false;
          }
          if (NavigationGrid.field_n != 2) {
            if (NavigationGrid.field_n != 2 &&
              var3 != 0) {
              return false;
            }
          } else {
            if (!FramePainter.isOnlineFriendOrLobbyPlayer(InflaterDecompressor.field_c, LobbySlideLayout.field_a, 2)) {
              return false;
            }
            if (NavigationGrid.field_n == 2) {
              if (QuickChatCategoryDefinition.tryAcquireChatSendPermit((byte) 88)) {
                var4 = (String) null;
                GameWorld.sendChatMessage(StateIconLabel.field_Gb, LobbySlideLayout.field_a, param0, (String) null, NavigationGrid.field_n, 29602);
              }
              return true;
            }
            if (var3 != 0) {
              return false;
            }
          }
        } else {
          if (NetworkArchiveRequest.canMessage(SectorCacheStore.field_f, QuickChatMenu.field_Kb, (byte) -81, ChatPanelSetupHelpers.field_c, GradientOutlineTextPainter.field_t)) {
            if (ChatPanelSetupHelpers.field_c == 2) {
              return AlphaChildWidget.beginPrivateQuickChat(GradientOutlineTextPainter.field_t, (byte) -46, SectorCacheStore.field_f, QuickChatMenu.field_Kb, ChatPanelSetupHelpers.field_c);
            }
            if (var3 == 0) {
              return AlphaChildWidget.beginPrivateQuickChat(GradientOutlineTextPainter.field_t, (byte) -46, SectorCacheStore.field_f, QuickChatMenu.field_Kb, ChatPanelSetupHelpers.field_c);
            }
            return false;
          }
          if (InfectionEvent.field_p == 10) {
            if (var3 != 0) {
              return false;
            }
            SineTableHelpers.openPublicQuickChat(13151);
            return true;
          }
          if (11 != InfectionEvent.field_p) {
            if (!param1) {
            }
            return false;
          }
          if (!ColourPickerWidget.field_Hb) {
            if (!param1) {
            }
            return false;
          }
          if (NavigationGrid.field_n == 2 &&
            !FramePainter.isOnlineFriendOrLobbyPlayer(InflaterDecompressor.field_c, LobbySlideLayout.field_a, 2)) {
            return false;
          }
          if (NavigationGrid.field_n != 2 &&
            var3 != 0) {
            return false;
          }
        }
        if (QuickChatCategoryDefinition.tryAcquireChatSendPermit((byte) 88)) {
          var4Lifetime1 = (String) null;
          GameWorld.sendChatMessage(StateIconLabel.field_Gb, LobbySlideLayout.field_a, param0, (String) null, NavigationGrid.field_n, 29602);
        }
        return true;
    }

    final static void attachKeyboardListeners(java.awt.Component param0, int param1) {
        try {
          param0.setFocusTraversalKeysEnabled(false);
          if (param1 != 11) {
            field_c = (String) null;
          }
          param0.addKeyListener(ClickMarkerParticle.field_c);
          param0.addFocusListener(ClickMarkerParticle.field_c);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "eo.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void layoutQuickChatMenu(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        PlayerProfile.field_l.setBounds(param6, param2, param5, param4, -3344);
        if (ScrollBar.field_Ib != null) {
          ScrollBar.field_Ib.layoutMenuChain(-UnitView.field_Y + param0, param6, param3 ^ 77, param1, param0, param6);
          if (param3 != -10) {
            KeyboardListenerHelpers.layoutQuickChatMenu(114, -96, -86, -58, 125, -101, 21);
            return;
          }
          return;
        }
        if (param3 == -10) {
          return;
        }
        KeyboardListenerHelpers.layoutQuickChatMenu(114, -96, -86, -58, 125, -101, 21);
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_c = null;
        field_b = null;
        field_a = null;
        int var1 = -49 / ((21 - param0) / 36);
    }

    static {
        field_c = "Open new routes for your zombies to attack from.";
        field_a = "Month";
        field_d = 0L;
    }
}
