/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteResourceSupport {
    static Sprite[] field_c;
    static int field_d;
    static UiComponent field_a;
    static int field_b;

    final static int floatToFixed3(float param0, boolean param1) {
        if (!param1) {
          SpriteResourceSupport.releaseStatics((byte) -61);
          return ButtonPainter.floatToFixed(3, param0, (byte) 126);
        }
        return ButtonPainter.floatToFixed(3, param0, (byte) 126);
    }

    final static IndexedSprite loadIndexedSprite(int param0, ResourceArchive param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -7575) {
            SpriteResourceSupport.floatToFixed3(0.49575117230415344f, true);
          }
          if (SpriteSheetLoadSupport.loadSpriteSheet((byte) 81, param1, param2)) {
            return KeyHandler.a((byte) 108);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("sb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 < 13) {
          SpriteResourceSupport.pollLoginBooleanResponse(-47);
        }
    }

    final static Boolean pollLoginBooleanResponse(int param0) {
        if (param0 < 107) {
          return (Boolean) null;
        }
        Boolean var1 = AchievementNotice.field_q;
        AchievementNotice.field_q = null;
        return var1;
    }

    static {
        field_b = 0;
    }
}
