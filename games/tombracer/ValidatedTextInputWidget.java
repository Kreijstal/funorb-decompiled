/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextInputWidget extends TextInputWidget implements ValidationProvider {
    static String field_J;
    private ValidationSource field_N;
    private int field_M;
    static int field_K;
    static String field_L;

    public static void releaseStatics(int param0) {
        if (param0 != 200) {
          ValidatedTextInputWidget.a(-98, (byte) 40, -89);
          field_J = null;
          field_L = null;
          return;
        }
        field_J = null;
        field_L = null;
    }

    final void updatePointerState(int param0, int param1, UiWidget param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_M = -param0 + AgeValidator.field_j - this.field_i;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "so.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void setValidationSource(int param0, ValidationSource param1) {
        try {
          this.field_N = param1;
          if (param0 != -13861) {
            field_K = -19;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "so.BB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void pumpAudio(int param0) {
        vb var1 = null;
        int var2 = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        vb var1Lifetime1;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          WheeledMountComponent.field_P.serviceOutput();
          if (param0 != -16310) {
            ValidatedTextInputWidget.pumpAudio(117);
          }
          HardwareModelIndexData.field_b.serviceOutput();
          S2CProfileUpdatePacket.field_b = S2CProfileUpdatePacket.field_b - 1;
          if (0 == S2CProfileUpdatePacket.field_b) {
            S2CProfileUpdatePacket.field_b = 200;
            var1 = (vb) (DivisionMazeGenerator.field_e.first(-80));
            while (var1 != null) {
              if (!var1.field_h.isLinked((byte) -101)) {
                var1.unlink(21);
              }
              var1 = (vb) (DivisionMazeGenerator.field_e.next(110));
            }
            if (Obstacle.field_f != null) {
              var1Lifetime1 = (vb) (Obstacle.field_f.first(param0 ^ 16378));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_h.isLinked((byte) -91)) {
                  var1Lifetime1.unlink(param0 + 16389);
                }
                var1Lifetime1 = (vb) (Obstacle.field_f.next(118));
              }
            }
          }
          if ((null != RoomHeader.field_e) &&
            (stackIn_20_0 = RoomHeader.field_e.hasMidiData((byte) -114))) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var1_ref), "so.VA(" + param0 + ')');
        }
    }

    public final ValidationSource getValidationSource(byte param0) {
        if (param0 < 44) {
          return (ValidationSource) null;
        }
        return this.field_N;
    }

    final void notifySubmitted(int param0) {
        super.notifySubmitted(param0);
        if (null != this.field_N) {
          this.field_N.markEdited(-74);
        }
    }

    ValidatedTextInputWidget(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0, byte param1, int param2) {
        int var3 = 118 / ((-39 - param1) / 53);
        return (ConsoleParseException.hasAnyMask33(param2, param0, -32842) | TimingPattern.hasAnyMask34((byte) -53, param2, param0) | gha.hasAnyMask52(param2, param0, 86)) & ArchiveRequest.hasFlag2048(param2, 0, param0);
    }

    final String getHoverText(byte param0) {
        if (!this.field_f) {
          return null;
        }
        if (this.field_q != null) {
          int var2 = -81 % ((param0 + 58) / 60);
          gca.setTooltipAnchor(2533, AgeValidator.field_j - (this.field_M - this.field_m), GridWidgetContainer.field_B);
          return this.field_q;
        }
        return null;
    }

    static {
        field_J = "+5 Coins";
        field_L = "Error";
    }
}
