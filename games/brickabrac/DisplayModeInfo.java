/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeInfo {
    static RgbSprite field_g;
    int height;
    static String field_b;
    int refreshRate;
    static NodeDeque field_a;
    int width;
    int bitDepth;
    static int field_e;

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (param2 != -1) {
            field_b = (String) null;
          }
          if (null != SoundCache.field_d &&
            !SoundCache.field_d.equals(param0.getParameter("settings"))) {
            var3 = SoundCache.field_d;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (null != OpacityWidget.field_G &&
            !OpacityWidget.field_G.equals(param0.getParameter("session"))) {
            var4Lifetime1 = OpacityWidget.field_G;
          }
          stackIn_11_0 = FramedMenuScreen.a((String) (var3), (byte) 60, (String) (var4Lifetime1), -1, param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hg.D(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
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
            LabeledWidget.emailAvailabilityRequest = rm.createEmailAvailabilityRequest(email, 16711935);
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
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void resetCollisionSelection(int obfuscationGuard) {
        if (obfuscationGuard != -1) {
          return;
        }
        SpriteGeometry.collisionNormalX256 = 0;
        GameClock.collisionBody = null;
        ea.collisionTime256 = 0;
        DualLinkIterator.collisionNormalY256 = 0;
        IntegerValidationHelpers.collisionFace = 0;
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
    }
}
