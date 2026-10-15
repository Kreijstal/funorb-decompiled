/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialTabbedPanel {
    static ConnectionPhase awaitingValidationBody;
    TabbedPane tabs;
    static int decodedRankingRating;
    static RgbSprite field_b;
    static UiComponent[] field_a;
    static int[] field_f;

    final void setBounds(int width, int x, int obfuscationGuard, int y, int height) {
        int tabHeight = 0;
        int panelInset = 0;
        if (obfuscationGuard >= 75) {
          tabHeight = 24;
          panelInset = 5;
          this.tabs.setTabbedPaneBounds(panelInset, x, width, tabHeight, height, y, 75);
          ChatLobbyUiHelpers.friendsStatusLabel.setBounds(WidgetLayerBootstrap.uiRowHeight, 0, 0, QuickChatPhraseRegistry.friendsPanel.width, (byte) 64);
          MouseWheelSource.friendNameHeading.setBounds(18, 2 + WidgetLayerBootstrap.uiRowHeight, 0, -82 + (QuickChatPhraseRegistry.friendsPanel.width - DialogMessagePanel.uiScrollbarWidth - 2), (byte) 64);
          GameplayScreen.friendLocationHeading.setBounds(18, 2 + WidgetLayerBootstrap.uiRowHeight, -2 + (-DialogMessagePanel.uiScrollbarWidth + (QuickChatPhraseRegistry.friendsPanel.width - 80)), 82 + DialogMessagePanel.uiScrollbarWidth, (byte) 64);
          GameScreen.friendsListPane.setPaneFooterBounds(true, 2, QuickChatPhraseRegistry.friendsPanel.width, 0, 20 + (WidgetLayerBootstrap.uiRowHeight + 2), DialogMessagePanel.uiScrollbarWidth, 20, -2 + (-WidgetLayerBootstrap.uiRowHeight + QuickChatPhraseRegistry.friendsPanel.height) - 20);
          TableResponseHelpers.ignoreListPane.layoutPaneFooter(20, -779, DialogMessagePanel.uiScrollbarWidth, 2);
          return;
        }
    }

    public static void a(boolean param0) {
        awaitingValidationBody = null;
        if (param0) {
          field_f = null;
          field_a = null;
          field_b = null;
          return;
        }
        MusicTrack var2 = (MusicTrack) null;
        SocialTabbedPanel.a(true, 99, (byte) -104, (MusicTrack) null);
        field_f = null;
        field_a = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, byte param2, MusicTrack param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        Throwable var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var4_int = -2 / ((41 - param2) / 40);
          if (null != MeshAttributeRecord.musicCrossfadeStream) {
            ScorePopup.a(1048576, param3, param1, param0, -104);
          }
          if (null == ConditionalTextValue.musicSynthesizer) {
            return;
          }
          var5 = DirectByteStorage.field_f;
          synchronized (var5) {
            ConditionalTextValue.musicSynthesizer.setChannelGain(param1, -1, 16);
            if (param3 == IsaacGenerator.field_a) {
              return;
            }
            ConditionalTextValue.musicSynthesizer.stopTrack(-24774);
            DirectByteStorage.field_f.flush();
            IsaacGenerator.field_a = param3;
            if (null != IsaacGenerator.field_a) {
              ConditionalTextValue.musicSynthesizer.playTrack(IsaacGenerator.field_a, 127, param0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("vj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    SocialTabbedPanel(String primaryTabLabel, UiComponent primaryPanel) {
        String[] tabLabels = null;
        UiComponent[] panels = null;
        try {
          tabLabels = new String[]{primaryTabLabel, AchievementSubmission.friendsTabLabel, SpriteInputHelpers.ignoreTabLabel};
          panels = new UiComponent[]{primaryPanel, QuickChatPhraseRegistry.friendsPanel, (UiComponent) ((Object) TableResponseHelpers.ignoreListPane)};
          this.tabs = new TabbedPane(0L, WidgetTheme.field_n, tabLabels, InvitationDialogHelpers.field_c, panels, 0);
        } catch (RuntimeException constructionFailure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) constructionFailure), "vj.<init>(" + (primaryTabLabel != null ? "{...}" : "null") + ',' + (primaryPanel != null ? "{...}" : "null") + ')');
        }
    }

    static {
        awaitingValidationBody = new ConnectionPhase();
        field_f = new int[]{14, 14, 14, 14, 14, 14, 14};
    }
}
