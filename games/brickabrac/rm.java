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

    final static hl a(int param0, byte[] param1) {
        hl var2 = null;
        RuntimeException var2_ref = null;
        hl stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hl stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 12658477) {
            stackIn_2_0 = (hl) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return (hl) (stackIn_5_0);
          }
          var2 = new hl(param1, ArrayWidgetGroup.decodedSpriteOffsetX, dl.decodedSpriteOffsetY, jh.decodedSpriteWidths, TextHotspotRegion.decodedSpriteHeights, cn.decodedSpriteIndices);
          MotionWaypoint.clearDecodedSpriteData((byte) 96);
          stackIn_7_0 = var2;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("rm.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
