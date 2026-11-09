/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RenderBufferSet {
    static String passwordIsValidText;
    static int tickHistoryIndex;

    final static int glTexCoordGeneration(TextureCoordinateGeneration mode, int guard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 8 % ((guard + 40) / 46);
          if (DroneProximitySupport.EYE_LINEAR == mode) {
            stackIn_2_0 = 9216;
            return stackIn_2_0;
          }
          if (BeveledTextInputRenderer.NORMAL_MAP == mode) {
            stackIn_9_0 = 34065;
            return stackIn_9_0;
          }
          if (mode != LabeledWidget.REFLECTION_MAP) {
            throw new IllegalArgumentException();
          }
          stackIn_7_0 = 34066;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ka.F(");
          if (mode == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(guard).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        passwordIsValidText = null;
        if (param0 != -59) {
          TextureCoordinateGeneration var2 = (TextureCoordinateGeneration) null;
          RenderBufferSet.glTexCoordGeneration((TextureCoordinateGeneration) null, 4);
        }
    }

    static {
        passwordIsValidText = "Password is valid";
    }
}
