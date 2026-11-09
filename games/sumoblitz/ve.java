/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve extends IntrusiveNode {
    private boolean field_n;
    static String waitingForMusicText;
    LegacyOpenGlGraphicsToolkit field_m;
    static SpriteData field_k;

    final boolean a(int param0) {
        if (param0 < 106) {
          this.field_m = (LegacyOpenGlGraphicsToolkit) null;
          return this.field_n;
        }
        return this.field_n;
    }

    final static OpenGlAssemblyProgram compileAssemblyProgram(byte guard, OpenGlGraphicsToolkit toolkit, byte[] source, int target) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        OpenGlAssemblyProgram stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (source == null) {
            stackIn_2_0 = null;
            return (OpenGlAssemblyProgram) (stackIn_2_0);
          }
          var4_int = jaggl.OpenGL.glGenProgramARB();
          var5 = 50 / ((guard + 9) / 58);
          jaggl.OpenGL.glBindProgramARB(target, var4_int);
          jaggl.OpenGL.glProgramRawARB(target, 34933, source);
          jaggl.OpenGL.glGetIntegerv(34379, GzipDecompressor.field_e, 0);
          if (GzipDecompressor.field_e[0] == -1) {
            jaggl.OpenGL.glBindProgramARB(target, 0);
            stackIn_7_0 = new OpenGlAssemblyProgram(toolkit, target, var4_int);
            return stackIn_7_0;
          }
          jaggl.OpenGL.glBindProgramARB(target, 0);
          stackIn_5_0 = null;
          return (OpenGlAssemblyProgram) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ve.F(").append(guard).append(',');
          if (toolkit == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (source == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(target).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_k = null;
        int var1 = 106 / ((param0 - 71) / 40);
        waitingForMusicText = null;
    }

    abstract void c(int param0);

    final static ResourceArchive a(int param0, boolean param1, int param2, int param3, boolean param4) {
        if (param0 == 11880) {
          return ng.a(param3, param0 ^ -11778, param1, param2, param4, false);
        }
        ve.a(87, true, -113, -52, false);
        return ng.a(param3, param0 ^ -11778, param1, param2, param4, false);
    }

    ve(LegacyOpenGlGraphicsToolkit param0) {
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ve.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        waitingForMusicText = "Waiting for music";
    }
}
