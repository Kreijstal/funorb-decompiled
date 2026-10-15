/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeInfo {
    static RgbSprite field_g;
    int height;
    static String field_b;
    int refreshRate;
    static NodeDeque delayedOutgoingPackets;
    int width;
    int bitDepth;
    static int field_e;

    final static java.net.URL applyChangedAppletParameters(java.applet.Applet applet, java.net.URL url, int obfuscationGuard) {
        Object settingsOverride = null;
        Object unusedSettingsAlias = null;
        java.net.URL rewrittenUrl = null;
        Object failureContext = null;
        StringBuilder contextBuilder = null;
        String appletSummary = null;
        StringBuilder urlContextBuilder = null;
        String urlSummary = null;
        RuntimeException caughtFailure = null;
        Object sessionOverride;
        Object unusedSettingsCopy;
        try {
          settingsOverride = null;
          if (obfuscationGuard != -1) {
            field_b = (String) null;
          }
          if (null != SoundCache.clientSettings &&
            !SoundCache.clientSettings.equals(applet.getParameter("settings"))) {
            settingsOverride = SoundCache.clientSettings;
            unusedSettingsAlias = settingsOverride;
            unusedSettingsCopy = settingsOverride;
          }
          sessionOverride = null;
          if (null != OpacityWidget.clientSession &&
            !OpacityWidget.clientSession.equals(applet.getParameter("session"))) {
            sessionOverride = OpacityWidget.clientSession;
          }
          rewrittenUrl = FramedMenuScreen.rewriteAppletPath((String) (settingsOverride), (byte) 60, (String) (sessionOverride), -1, url);
          return rewrittenUrl;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          settingsOverride = caughtFailure;
          failureContext = settingsOverride;
          contextBuilder = new StringBuilder().append("hg.D(");
          if (applet == null) {
            appletSummary = "null";
          } else {
            appletSummary = "{...}";
          }
          urlContextBuilder = ((StringBuilder) (Object) contextBuilder).append(appletSummary).append(',');
          if (url == null) {
            urlSummary = "null";
          } else {
            urlSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (failureContext), ((StringBuilder) (Object) urlContextBuilder).append(urlSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static EmailAvailabilityRequest pollEmailAvailability(int obfuscationGuard, String email) {
        RuntimeException var2 = null;
        EmailAvailabilityRequest stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (LabeledWidget.emailAvailabilityRequest.isCompleted(96) &&
            !email.equals(LabeledWidget.emailAvailabilityRequest.getEmail(0))) {
            LabeledWidget.emailAvailabilityRequest = FontRequestHelpers.createEmailAvailabilityRequest(email, 16711935);
          }
          if (obfuscationGuard != 0) {
            field_g = (RgbSprite) null;
          }
          stackIn_7_0 = LabeledWidget.emailAvailabilityRequest;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("hg.B(").append(obfuscationGuard).append(',');
          if (email == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != 19) {
          field_b = (String) null;
          delayedOutgoingPackets = null;
          field_b = null;
          return;
        }
        delayedOutgoingPackets = null;
        field_b = null;
    }

    final static void resetCollisionSelection(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          return;
        }
        SpriteGeometry.collisionNormalX256 = 0;
        GameClock.collisionBody = null;
        InputOptionsHelpers.collisionTime256 = 0;
        DualLinkIterator.collisionNormalY256 = 0;
        IntegerValidationHelpers.collisionFace = 0;
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
    }
}
