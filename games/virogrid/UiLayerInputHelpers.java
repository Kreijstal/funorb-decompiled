/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiLayerInputHelpers {
    static String field_a;
    static int[] field_b;

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 == 17) {
          field_a = null;
          return;
        }
        Js5Archive var2 = (Js5Archive) null;
        UiLayerInputHelpers.initializeChatInterface((Js5Archive) null, (Js5Archive) null, true, false);
        field_a = null;
    }

    final static void initializeChatInterface(Js5Archive param0, Js5Archive param1, boolean param2, boolean param3) {
        try {
          ChatPanelSetupHelpers.buildChatPanelComponents(CredentialHelpers.field_a, IntrusiveDequeCursor.field_e, NetworkArchiveRequest.field_z, LinkTextPainter.field_h, WidgetNode.field_u, QueuedResultSubmission.field_n, IntrusiveDeque.field_a, MidiNote.field_m, param2, -112, TooltipAndOptionsHelpers.chatFont, ArchiveRequest.field_r);
          NodeHashTableIterator.chatFilterIcons = WidgetNode.loadSpritesByName(32, param1, "lobby", "chatfilter");
          PendingHighscoreRequest.field_i[1] = ValidationMessageWidget.field_Y;
          PendingHighscoreRequest.field_i[0] = Js5Archive.field_g;
          PendingHighscoreRequest.field_i[2] = BitCountAndDialogHelpers.field_f;
          ChatPanelSetupHelpers.initializeQuickChat(Bzip2State.generalFont, false, param0);
          if (!param3) {
            field_a = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "vj.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void processUiLayerInput(byte param0) {
        int var2 = Virogrid.field_F ? 1 : 0;
        if (!LobbyAndTextHelpers.hasOpenDialogLayer((byte) -20)) {
          if (null != FullscreenState.field_b &&
            FullscreenState.field_b.field_a) {
            FullscreenSupport.exitFullscreen((byte) -16);
            LogoIntroHelpers.field_c.pushLayer(0, new FullscreenErrorDialog(LogoIntroHelpers.field_c, ClientException.field_b));
          }
          return;
        }
        try {
          LogoIntroHelpers.field_c.processPointerFrame(GameBoard.field_p, ResizableDialog.field_P, (byte) -127, true);
          LogoIntroHelpers.field_c.updateLayers(16);
          while (GrowableIntList.pollKeyEvent((byte) -98)) {
            LogoIntroHelpers.field_c.dispatchKeyInput(ScrollPane.field_Gb, PopupMenuHelpers.field_d, -97);
          }
          int var1_int = 80 % ((-47 - param0) / 37);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "vj.B(" + param0 + ')');
        }
    }

    static {
        field_a = "Add <%0> to friend list";
    }
}
