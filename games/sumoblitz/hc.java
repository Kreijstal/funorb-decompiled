/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hc {
    static MessageDialog field_c;
    static ToolkitFont field_e;
    static int selectedBounceLevel;
    static SpriteData[] field_a;
    static SpriteData field_b;
    static String continueToNextLevelText;

    private hc() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_b = null;
        continueToNextLevelText = null;
        field_e = null;
        int var1 = 80 / ((69 - param0) / 40);
        field_c = null;
    }

    final static LegacyOpenGlShaderProgram linkShaderProgram(int guard, LegacyOpenGlShader[] shaders, LegacyOpenGlGraphicsToolkit toolkit) {
        Object stackIn_7_0 = null;
        LegacyOpenGlShaderProgram stackIn_14_0 = null;
        Object stackIn_27_0 = null;
        LegacyOpenGlShaderProgram stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        long var3_long = 0L;
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var11 = null;
        int var5Lifetime1;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          while (var3_int < shaders.length) {
            if (null == shaders[var3_int]) {
              return null;
            }
            if (shaders[var3_int].shaderHandle > 0L) {
              var3_int++;
              continue;
            }
            stackIn_7_0 = null;
            return (LegacyOpenGlShaderProgram) (stackIn_7_0);
          }
          var3_long = jaggl.OpenGL.glCreateProgramObjectARB();
          for (var5 = 0; shaders.length > var5; var5++) {
            jaggl.OpenGL.glAttachObjectARB(var3_long, shaders[var5].shaderHandle);
          }
          jaggl.OpenGL.glLinkProgramARB(var3_long);
          if (guard != -14382) {
            stackIn_14_0 = (LegacyOpenGlShaderProgram) null;
            return stackIn_14_0;
          }
          jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35714, OpenGlVertexBuffer.field_o, 0);
          if (0 == OpenGlVertexBuffer.field_o[0]) {
            if (OpenGlVertexBuffer.field_o[0] == 0) {
              System.out.println("Shader linking failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var3_long, 35716, OpenGlVertexBuffer.field_o, 1);
            if (OpenGlVertexBuffer.field_o[1] > 1) {
              var11 = new byte[OpenGlVertexBuffer.field_o[1]];
              jaggl.OpenGL.glGetInfoLogARB(var3_long, OpenGlVertexBuffer.field_o[1], OpenGlVertexBuffer.field_o, 0, var11, 0);
              System.out.println(new String(var11));
            }
            if (OpenGlVertexBuffer.field_o[0] == 0) {
              var7 = 0;
              var5Lifetime1 = var7;
              while (shaders.length > var7) {
                jaggl.OpenGL.glDetachObjectARB(var3_long, shaders[var7].shaderHandle);
                var7++;
              }
              jaggl.OpenGL.glDeleteObjectARB(var3_long);
              stackIn_27_0 = null;
              return (LegacyOpenGlShaderProgram) (stackIn_27_0);
            }
          }
          stackIn_29_0 = new LegacyOpenGlShaderProgram(toolkit, var3_long, shaders);
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("hc.B(").append(guard).append(',');
          if (shaders == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (toolkit == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        continueToNextLevelText = "Continue to next level?";
        selectedBounceLevel = 1;
    }
}
