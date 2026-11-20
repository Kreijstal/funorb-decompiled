/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareDepthBuffer implements DepthBuffer {
    int height;
    int width;
    static int field_b;
    float[] depth;
    static String field_e;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, String param6) {
        RuntimeException var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 74) {
            return;
          }
          if (OpenGlTexture1D.field_i) {
            PlayerReadyFactory.field_b[param5].drawRightAligned(param4, param1, -16777216 | param0, true, param2, param6);
            return;
          }
          DateOfBirthTextFields.getDefaultBitmapFont(param5, 7988).drawRightAligned(param6, param2, param1, param0, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("woa.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -16777216) {
          return;
        }
        field_e = null;
    }

    SoftwareDepthBuffer(int param0, int param1) {
        this.height = param1;
        this.width = param0;
        this.depth = new float[param0 * param1];
    }

    static {
        field_e = "Point defence laser";
    }
}
