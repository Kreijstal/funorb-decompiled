/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginDialogNavigation {
    static int defaultShadowColor;
    static int field_a;

    final static void showLoginDialog(boolean allowSignup, boolean allowGuestPlay) {
        WidgetStateStyle.showLoginDialog((byte) 127, allowSignup, allowGuestPlay);
    }

    final static void drawAccountDialogs(boolean dimBackground, byte guard, boolean unused) {
        if (!dimBackground) {
          SoftwareRasterizer.clear();
          if (guard != -71) {
            defaultShadowColor = 40;
            BurstParticle.a(dimBackground, true);
            return;
          }
          BurstParticle.a(dimBackground, true);
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 192);
        if (guard != -71) {
          defaultShadowColor = 40;
          BurstParticle.a(dimBackground, true);
          return;
        }
        BurstParticle.a(dimBackground, true);
    }

    final static void completeNameAvailability(int response, String[] suggestions, String message, boolean guard) {
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        String[] var7 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!guard) {
            field_a = -32;
          }
          Base37NameAlphabet.nameAvailabilityState = DropTargetWidget.COMPLETE;
          if (255 == response) {
            stackIn_7_0 = !(IntroFinalFrameResources.field_d >= 13);
            DraggableWidget.field_z = LegacyOpenGlEffect.accountSuccess(stackIn_7_0, 8192);
            var6 = (String[]) null;
            InwardSparkParticle.applyAccountNameSuggestions(256, (String[]) null);
            return;
          }
          if (100 > response) {
            DraggableWidget.field_z = LegacyOpenGlReflectionEffect.accountError(48, message, response);
            return;
          }
          if (response > 105) {
            DraggableWidget.field_z = LegacyOpenGlReflectionEffect.accountError(48, message, response);
            return;
          }
          var7 = suggestions;
          InwardSparkParticle.applyAccountNameSuggestions(256, var7);
          DraggableWidget.field_z = AccountConnectionPhase.accountNameSuggestions(suggestions, 8192);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("jv.A(").append(response).append(',');
          if (suggestions == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (message == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        defaultShadowColor = 0;
    }
}
