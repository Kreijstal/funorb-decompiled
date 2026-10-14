/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MeshAttributeRecord {
    static n field_f;
    int baseRgb;
    static MusicCrossfadeStream musicCrossfadeStream;
    static int currentKeyCode;
    static RgbSprite chocolateCharacterSprite;
    static String field_d;
    static boolean field_g;

    public static void a(int param0) {
        chocolateCharacterSprite = null;
        field_d = null;
        musicCrossfadeStream = null;
        if (param0 != -9669) {
          field_d = (String) null;
          field_f = null;
          return;
        }
        field_f = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10, boolean param11) {
        EmailAvailabilityRequest.a(param10, param7, param11, param9, param6, param5, param1, param4, param0, (byte) -113, param8, param2, 16777215, param3);
    }

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -35) {
            stackIn_4_0 = sh.a(true, 104, param0, 10);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("dc.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = new n();
        field_d = "Build: Adds a row of bricks to the top of the level.";
    }
}
