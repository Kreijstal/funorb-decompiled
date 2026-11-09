/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    static String unpackingMusicText;
    String field_a;
    static String creatingYourAccountText;
    Throwable field_b;

    final static OpenGlShader compileShader(int shaderType, OpenGlGraphicsToolkit toolkit, byte[] source, int guard) {
        Object stackIn_15_0 = null;
        OpenGlShader stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        try {
          if (source == null) {
            return null;
          }
          if (0 == source.length) {
            return null;
          }
          var4_long = jaggl.OpenGL.glCreateShaderObjectARB(shaderType);
          jaggl.OpenGL.glShaderSourceRawARB(var4_long, source);
          jaggl.OpenGL.glCompileShaderARB(var4_long);
          jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, TextInputWidget.field_H, 0);
          if (TextInputWidget.field_H[0] == 0) {
            if (TextInputWidget.field_H[0] == 0) {
              System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, TextInputWidget.field_H, 1);
            if (TextInputWidget.field_H[1] > 1) {
              var10 = new byte[TextInputWidget.field_H[1]];
              jaggl.OpenGL.glGetInfoLogARB(var4_long, TextInputWidget.field_H[1], TextInputWidget.field_H, 0, var10, 0);
              System.out.println(new String(var10));
            }
            if (TextInputWidget.field_H[0] == 0) {
              jaggl.OpenGL.glDeleteObjectARB(var4_long);
              stackIn_15_0 = null;
              return (OpenGlShader) (stackIn_15_0);
            }
          }
          if (guard > -113) {
            ClientException.releaseStatics((byte) -11);
          }
          stackIn_19_0 = new OpenGlShader(toolkit, var4_long, shaderType);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("su.A(").append(shaderType).append(',');
          if (toolkit == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (source == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(guard).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 0) {
          byte[] var2 = (byte[]) null;
          ClientException.compileShader(6, (OpenGlGraphicsToolkit) null, (byte[]) null, -63);
          if (!TimedSceneEffect.field_r) {
            return vs.b((byte) 9) ? true : false;
          }
          return true;
        }
        if (TimedSceneEffect.field_r) {
          return true;
        }
        if (!vs.b((byte) 9)) {
          return false;
        }
        return true;
    }

    final static void popRasterState(byte guard) {
        RasterStateFrame var1 = (RasterStateFrame) (IntrusiveNodeHashTable.field_g.removeLast((byte) -124));
        if (var1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.setRaster(var1.pixels, var1.width, var1.height);
        SoftwareRasterizer.setClip(var1.clipLeft, var1.clipTop, var1.clipRight, var1.clipBottom);
        var1.pixels = null;
        ko.field_m.addLast((IntrusiveNode) (var1), (byte) 39);
        int var2 = -37 / ((guard - 1) / 38);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -18) {
          return;
        }
        creatingYourAccountText = null;
        unpackingMusicText = null;
    }

    ClientException(Throwable param0, String param1) {
        this.field_a = param1;
        this.field_b = param0;
    }

    static {
        unpackingMusicText = "Unpacking music";
        creatingYourAccountText = "Creating your account";
    }
}
