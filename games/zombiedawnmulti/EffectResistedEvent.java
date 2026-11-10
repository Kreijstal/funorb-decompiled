/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EffectResistedEvent extends GameEvent {
    static String field_l;
    static int field_j;
    static String field_i;
    private int field_k;

    final void apply(int param0, GameScreen param1) {
        if (param0 != 0) {
          return;
        }
        try {
          param1.flashUnit(this.field_k, 10);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "aj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void initializeLobbyUi(FramePainter param0, int param1, int param2, int param3, int param4, int param5, int param6, BitmapFont param7, int param8, int param9, int param10, int param11, FramePainter param12, int param13, FramePainter param14, BitmapFont param15, int param16, int param17, int param18, byte param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          AlternateUsernameCredentials.field_u = param7;
          SecondaryNodeDeque.field_c = param15;
          if (param19 <= 50) {
            EffectResistedEvent.findMenuOptionAt(-22, false, -26);
          }
          MessageDialog.setMenuLayoutMetrics(param13, 20341, param3, param8, param11);
          PowerupProgressCard.setMenuFrameAndPadding(param17, param10, -8388, param0);
          MenuStyleHelpers.setMenuFrameStyle(param5, param14, param1, param12, param9, false);
          LayoutCenterHelpers.setLayoutCenter(param4, 25938, param2);
          ObjectFactoryHelpers.setMenuOptionMetrics(param18, param6, false, param16);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("aj.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param15 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(')').toString());
        }
    }

    final static int findMenuOptionAt(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1) {
            stackIn_3_0 = 122;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = PopupMenuBuilder.field_M;
          while (var3_int < KeyboardListenerHelpers.field_e.length) {
            var5 = PackedArrayHelpers.field_a[var3_int];
            if (var5 < 0) {
              var4 = var4 + ImageProducerRasterBuffer.field_l;
            } else {
              var6 = ColourPickerWidget.measureText(true, -121, KeyboardListenerHelpers.field_e[var3_int]);
              var7 = NetworkGameClient.field_x - (var6 >> 1);
              var4 = var4 + EffectAudioHelpers.field_b;
              if (IntrusiveDeque.isPointInRect(param0, -GameCharacter.field_db + var7, param2, (GameCharacter.field_db << 1) + var6, var4, MusicPatch.field_n + (MessageDialog.field_tb << 1), 93)) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + ((MessageDialog.field_tb << 1) + (EffectAudioHelpers.field_b + MusicPatch.field_n));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var3), "aj.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void drawDebugOverlay(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
          this.drawDebugOverlay(-96, true, 85, -17);
        }
    }

    EffectResistedEvent(int param0, int param1) {
        super(param0);
        this.field_k = param1;
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        if (param0 >= -28) {
          return;
        }
        field_l = null;
    }

    final static void setTooltipAnchor(int param0, int param1, byte param2) {
        int var3 = -79 / ((param2 + 42) / 32);
        LobbyStateHelpers.field_a = param1;
        NetworkArchiveRequest.field_z = param0;
    }

    static {
        field_j = 0;
        field_l = "Connection timed out. Please try using a different server.";
        field_i = "Only show private chat from my friends and opponents";
    }
}
