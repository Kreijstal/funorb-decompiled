/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rm implements bp {
    static String field_b;
    static UiComponent field_a;
    static RgbSprite farmMidSprite;
    static int[] farmBackgroundColors;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_a = null;
        farmBackgroundColors = null;
        farmMidSprite = null;
        field_e = null;
        field_b = null;
        if (param0 < -2) {
          field_c = null;
          return;
        }
        field_e = (String) null;
        field_c = null;
    }

    final static BinaryMaskFont createBinaryMaskFont(int obfuscationGuard, byte[] metrics) {
        BinaryMaskFont font = null;
        RuntimeException failure = null;
        BinaryMaskFont guardRejectedFont = null;
        Object missingMetricsFont = null;
        BinaryMaskFont result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String metricsSummary = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 12658477) {
            guardRejectedFont = (BinaryMaskFont) null;
            return guardRejectedFont;
          }
          if (metrics == null) {
            missingMetricsFont = null;
            return (BinaryMaskFont) (missingMetricsFont);
          }
          font = new BinaryMaskFont(metrics, ArrayWidgetGroup.decodedSpriteOffsetX, SocketConnector.decodedSpriteOffsetY, jh.decodedSpriteWidths, TextHotspotRegion.decodedSpriteHeights, cn.decodedSpriteIndices);
          MotionWaypoint.clearDecodedSpriteData((byte) 96);
          result = font;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("rm.C(").append(obfuscationGuard).append(',');
          if (metrics == null) {
            metricsSummary = "null";
          } else {
            metricsSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(metricsSummary).append(')').toString());
        }
    }

    final static EmailAvailabilityRequest createEmailAvailabilityRequest(String email, int obfuscationGuard) {
        RuntimeException var2 = null;
        EmailAvailabilityRequest stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 16711935) {
            farmBackgroundColors = (int[]) null;
          }
          stackIn_3_0 = new EmailAvailabilityRequest(email);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rm.A(");
          if (email == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_b = "Withdraw request to join <%0>'s game";
        farmBackgroundColors = new int[]{12658477, 22953, 16494651, 26679, 16711935};
        field_c = "Your rating is <%0>";
        field_e = "(<%0>/<%1>)";
    }
}
