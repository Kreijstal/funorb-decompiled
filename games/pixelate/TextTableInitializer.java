/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextTableInitializer {
    static int field_e;
    static SceneWidget field_g;
    static String[] field_a;
    static String field_f;
    static int field_c;
    static String field_b;
    static String field_d;

    final static void initializeMenuLabels(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          if (PacketBuffer.field_o != null) {
            return;
          }
          PacketBuffer.field_o = new String[35];
          PacketBuffer.field_o[3] = CacheReference.field_u;
          PacketBuffer.field_o[7] = RequestState.field_b;
          PacketBuffer.field_o[9] = TutorialTickHelpers.field_e;
          PacketBuffer.field_o[6] = EmailLoginCredentials.field_f;
          PacketBuffer.field_o[0] = Cloud.field_s;
          PacketBuffer.field_o[28] = TabbedPanel.field_Nb;
          PacketBuffer.field_o[1] = CheckboxPainter.field_c;
          PacketBuffer.field_o[11] = FallingPieceView.field_d;
          PacketBuffer.field_o[29] = RequestState.field_a;
          if (param0 != -29810) {
            TextTableInitializer.drawFrontEndOverlays(false, -69);
          }
          PacketBuffer.field_o[8] = null;
          PacketBuffer.field_o[5] = VolumeControlledVoice.field_l;
          PacketBuffer.field_o[2] = LobbyFrameHelpers.field_b;
          PacketBuffer.field_o[13] = NineSliceSpriteFactory.field_f;
          PacketBuffer.field_o[4] = MatchHud.field_l;
          PacketBuffer.field_o[19] = Cp1252EncodingHelpers.field_c;
          PacketBuffer.field_o[17] = QuickChatSendHelpers.field_c[0];
          PacketBuffer.field_o[15] = LoadingStepTracker.field_k[1];
          PacketBuffer.field_o[24] = ScoreMarkerDemo.field_i;
          PacketBuffer.field_o[22] = SecondaryNodeDeque.field_d;
          PacketBuffer.field_o[20] = HowToPlayScreen.field_p;
          PacketBuffer.field_o[26] = MusicPlaybackHelpers.field_f;
          PacketBuffer.field_o[16] = LoadingStepTracker.field_k[2];
          PacketBuffer.field_o[23] = PuzzleModePictureHelpers.field_a;
          PacketBuffer.field_o[27] = IterableNodeHashTable.field_d;
          PacketBuffer.field_o[21] = ScoreMarkerDemo.field_e;
          PacketBuffer.field_o[25] = PasswordFieldPainter.field_z;
          PacketBuffer.field_o[18] = QuickChatSendHelpers.field_c[1];
          PacketBuffer.field_o[14] = LoadingStepTracker.field_k[0];
          BlastFromThePastBackground.field_m[3] = GzipDecoder.field_b;
          BlastFromThePastBackground.field_m[6] = ReportAbuseDialog.field_Vb;
          BlastFromThePastBackground.field_m[2] = ScreenDisplayMode.field_a;
          BlastFromThePastBackground.field_m[4] = ChatChannelGlobals.field_e;
          BlastFromThePastBackground.field_m[1] = NameSuggestionHelpers.field_f;
          BlastFromThePastBackground.field_m[7] = KeyMapHelpers.field_d;
          DefaultQuickChatPhraseListener.field_a = new String[][]{ClockHelpers.field_f, MatchingTextValidator.field_t, SavedDataRequest.field_l, PauseMenuScreen.field_p, Cp1252DecodeHelpers.field_h, GameRequestHelpers.field_d};
          SoundVoice.field_m = new String[][]{PuzzleThumbnail.field_a, ScrollContainer.field_Hb, MusicPlaybackHelpers.field_d, EmailLoginCredentials.field_i, GameApplet.field_k, NumericDateInputWidget.field_R, GameModeSelectScreen.field_q, ChatAppendHelpers.field_d};
          BlastFromThePastBackground.field_m[0] = DraggableWidget.field_L;
          BlastFromThePastBackground.field_m[5] = SpriteBuildHelpers.field_e;
          for (var1_int = 0; var1_int < BlastFromThePastBackground.field_m.length; var1_int++) {
            if (null == BlastFromThePastBackground.field_m[var1_int]) {
              BlastFromThePastBackground.field_m[var1_int] = MouseWheelSetupHelpers.field_f;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "ho.A(" + param0 + ')');
        }
    }

    final static void drawFrontEndOverlays(boolean param0, int param1) {
        BoardView.drawAllOverlays((byte) -61, param0);
        if (param1 != 12402) {
          return;
        }
        Cp1252EncodingHelpers.drawOverlayLayers((byte) 95, param0);
    }

    public static void releaseStatics(int param0) {
        field_f = null;
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 != 11799) {
          TextTableInitializer.initializeMenuLabels(-116);
        }
        field_g = null;
    }

    static {
        field_e = 1;
        field_f = "Send private Quick Chat to <%0>";
        field_a = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_c = 0;
        field_b = "Error connecting to server. Please try using a different server.";
        field_d = "To Customer Support";
    }
}
