/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TickButtonPainter implements WidgetPainter {
    static int field_b;
    static int field_a;

    final static boolean isServerSessionActive(int param0) {
        if (param0 != 23517) {
          TickButtonPainter.advanceToLoginRequest(54);
          if (SpriteHotspot.field_h == null) {
            return false;
          }
          if (IntroScreen.field_l.isPostRequestStage((byte) -90)) {
            return true;
          }
          return false;
        }
        if (SpriteHotspot.field_h == null) {
          return false;
        }
        if (IntroScreen.field_l.isPostRequestStage((byte) -90)) {
          return true;
        }
        return false;
    }

    public final void paintWidget(boolean param0, int param1, int param2, int param3, UiWidget param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        Sprite var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param4.field_y + param3;
          var7 = param4.field_i + param1;
          ArchiveProvider.drawInsetFieldBorder(1, var6_int, param4.field_n, var7, param4.field_w);
          if (param2 != -15112) {
            return;
          }
          var8 = RubbleChunk.field_I[1];
          if (param4 instanceof ButtonWidget &&
            ((ButtonWidget) (param4)).field_G) {
            var8.drawAdditive(var6_int + 1 + (-var8.fullWidth + param4.field_n >> 1), (param4.field_w - var8.field_u >> 1) + var7 + 1, 256);
          }
          if (!param4.hasKeyboardFocus(124)) {
            return;
          }
          LobbyStateHelpers.drawDottedRectangle(2 + var7, 2 + var6_int, (byte) 111, param4.field_n - 4, param4.field_w - 4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ib.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int daysInMonth(int param0, int param1, int param2) {
        if (param1 != param0) {
          return Js5Transport.field_a[param0];
        }
        if (!TutorialAndMenuHelpers.isLeapYear((byte) 98, param2)) {
          return Js5Transport.field_a[param0];
        }
        return 29;
    }

    final static void advanceToLoginRequest(int param0) {
        if (LoginSuccessHelpers.field_b == 10) {
          SupportPageHelpers.showReconnectingDialog(117);
          LoginSuccessHelpers.field_b = 11;
        } else {
          if (!ValidationState.alwaysTrue(-113)) {
            SupportPageHelpers.showReconnectingDialog(117);
            LoginSuccessHelpers.field_b = 11;
          }
        }
        if (param0 > -37) {
          TickButtonPainter.advanceToLoginRequest(74);
        }
        PopupMenuBuilder.field_p = true;
    }

    final static PlayingSound playSoundEffect(byte param0, PcmSample param1) {
        RuntimeException var2 = null;
        PlayingSound stackIn_2_0 = null;
        PlayingSound stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 112) {
            stackIn_4_0 = AccountCreationDialog.playStream(PcmSampleStream.createAtRatePercent(param1, 100, 96), (byte) -98);
            return stackIn_4_0;
          }
          stackIn_2_0 = (PlayingSound) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ib.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
