/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlTexture3D extends OpenGlTexture {
    static String field_m;
    private int framebufferAttachment;
    int depth;
    static int rasterClipMinX;
    private int framebufferTarget;
    static String[] field_l;
    int height;
    int width;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 42) {
          OpenGlTexture3D.clearSharedReferences((byte) 67);
          field_l = null;
          field_m = null;
          return;
        }
        field_l = null;
        field_m = null;
    }

    final void copyFromFramebuffer(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        if (param5 == 115) {
          this.toolkit.bindTexture(114, (OpenGlTexture) (this));
          jaggl.OpenGL.glCopyTexSubImage3D(this.target, 0, param0, param7, param3, param1, param2, param6, param4);
          jaggl.OpenGL.glFlush();
          return;
        }
    }

    OpenGlTexture3D(OpenGlToolkit param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param2 * param3 * param4, false);
        this.framebufferAttachment = -1;
        this.framebufferTarget = -1;
        try {
          this.depth = param4;
          this.width = param2;
          this.height = param3;
          this.toolkit.bindTexture(62, (OpenGlTexture) (this));
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.internalFormat, this.width, this.height, this.depth, 0, PointLight.toOpenGlExternalFormat(this.internalFormat, false), 5121, (byte[]) null, 0);
          this.setLinearFiltering(-95, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final void detachFromFramebuffer(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(this.framebufferTarget, this.framebufferAttachment, this.target, 0, 0, 0);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
        if (param0 != 31294) {
          this.depth = 45;
        }
    }

    OpenGlTexture3D(OpenGlToolkit param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param3 * (param2 * param4), false);
        this.framebufferAttachment = -1;
        this.framebufferTarget = -1;
        try {
          this.depth = param4;
          this.width = param2;
          this.height = param3;
          this.toolkit.bindTexture(41, (OpenGlTexture) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.internalFormat, this.width, this.height, this.depth, 0, param6, 5121, param5, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.setLinearFiltering(99, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static FullscreenCanvas createFullscreenCanvas(int param0, PlatformService param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenCanvas var7 = null;
        java.awt.Frame var8 = null;
        Object stackIn_2_0 = null;
        FullscreenCanvas stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = GetAutozoomSpeedDivide.enterFullscreenBlocking(11168, param4, param1, param3, param0, param2);
          var6 = var8;
          if (var8 == null) {
            stackIn_2_0 = null;
            return (FullscreenCanvas) (stackIn_2_0);
          }
          var7 = new FullscreenCanvas();
          var7.frame = var8;
          var7.frame.add((java.awt.Component) ((Object) var7));
          var7.setBounds(param5, 0, param2, param3);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_4_0 = var7;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = var6_ref;
          stackIn_7_1 = new StringBuilder().append("ob.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_m = "More neutrals";
        rasterClipMinX = 0;
        field_l = new String[16];
    }
}
