/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxWidget extends TextButton {
    static String field_S;
    static String field_Q;
    static java.security.SecureRandom field_R;
    static String field_P;
    static String field_T;

    final void activate(int param0, int param1, int param2, int param3) {
        this.field_N = !this.field_N ? true : false;
        super.activate(param0, param1, param2, param3);
    }

    CheckboxWidget(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_N = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void shutdownSession(boolean param0) {
        QuickChatCategory.exitFullscreen((byte) 53);
        if (GameClock.field_b != null) {
          HighscoreQuery.attachCanvasInput((byte) -128, GameClock.field_b);
        }
        KeyHandlerHelpers.clearKeyHandler(-9648);
        InputDetachHelpers.detachMouseInput(109);
        FullscreenCanvasHelpers.closeArchiveConnections(-25676);
        if (!param0) {
          CheckboxWidget.clearLobbyState((byte) -39);
          if (ImageProducerRasterBuffer.isAwaitingLoginResponse(-14688)) {
            QuickChatHelpDialog.field_Lb.writeCipheredByte(1, (byte) -92);
            PacketFlushHelpers.flushPackets((byte) -86, 0);
          }
          SocialTabsPanel.closeGameSocket(false);
          return;
        }
        if (ImageProducerRasterBuffer.isAwaitingLoginResponse(-14688)) {
          QuickChatHelpDialog.field_Lb.writeCipheredByte(1, (byte) -92);
          PacketFlushHelpers.flushPackets((byte) -86, 0);
        }
        SocialTabsPanel.closeGameSocket(false);
    }

    final static boolean isPowerOfTwoOrZero(byte param0, int param1) {
        if (param0 < -84) {
          return (-param1 & param1) == param1 ? true : false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        field_R = null;
        field_S = null;
        field_Q = null;
        field_T = null;
        if (param0 != 0) {
          return;
        }
        field_P = null;
    }

    private CheckboxWidget(String param0, WidgetListener param1) {
        this(param0, LruTextureCache.field_q.field_n, param1);
        try {
          this.field_H = LruTextureCache.field_q.field_x;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void clearLobbyState(byte param0) {
        LobbyPlayerEntry var2 = null;
        int var3 = TetraLink.field_J;
        try {
          FullscreenFocusCanvas.field_a = false;
          GameKeyHandler.field_a = null;
          AccountWelcomePanel.field_N = null;
          if (AlternateLongAndTextCredentials.field_p != null) {
            AlternateLongAndTextCredentials.field_p.clear(1);
            AlternateLongAndTextCredentials.field_p = null;
          }
          QuickChatCommandType.field_a = null;
          if (null != InputDetachHelpers.field_a) {
            InputDetachHelpers.field_a.clear(1);
            InputDetachHelpers.field_a = null;
          }
          QuickChatCommandType.field_e = null;
          int var1_int = 39 / ((param0 - 14) / 42);
          if (ModelMergeHelpers.field_d != null) {
            ModelMergeHelpers.field_d.clear(1);
            ModelMergeHelpers.field_d = null;
          }
          WidgetStyleLayer.field_g = null;
          if (null != QuickChatCommandType.field_a) {
            var2 = (LobbyPlayerEntry) (QuickChatCommandType.field_a.firstInTraversal(-104));
            while (var2 != null) {
              var2.unlinkSecondary(0);
              var2 = (LobbyPlayerEntry) (QuickChatCommandType.field_a.nextInTraversal(-1));
            }
            QuickChatCommandType.field_a = null;
          }
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "re.C(" + param0 + ')');
        }
    }

    private CheckboxWidget(String param0, WidgetPainter param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
          this.field_H = LruTextureCache.field_q.field_x;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_S = "Remove friend";
        field_Q = "Add name";
        field_T = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
