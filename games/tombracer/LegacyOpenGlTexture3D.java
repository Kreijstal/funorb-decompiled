/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTexture3D extends LegacyOpenGlTexture {
    int field_r;
    int field_q;
    private int field_n;
    static SpriteData field_l;
    int field_o;
    static String field_m;
    private int field_p;

    public final void detachFramebuffer(int param0) {
        jaggl.OpenGL.glFramebufferTexture3DEXT(this.field_n, this.field_p, this.target, 0, 0, 0);
        int var2 = -20 % ((14 - param0) / 56);
        this.field_n = -1;
        this.field_p = -1;
    }

    LegacyOpenGlTexture3D(OpenGlToolkit param0, int param1, int param2, int param3, int param4) {
        super(param0, 32879, param1, param3 * param2 * param4, false);
        this.field_n = -1;
        this.field_p = -1;
        try {
          this.field_o = param4;
          this.field_r = param2;
          this.field_q = param3;
          this.toolkit.bindTexture(true, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.internalFormat, this.field_r, this.field_q, this.field_o, 0, sja.toBaseInternalFormat(this.internalFormat, 20934), 5121, (byte[]) null, 0);
          this.setLinearFiltering(true, 3);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "lha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void copyFromFramebuffer(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.toolkit.bindTexture(true, (LegacyOpenGlTexture) (this));
        jaggl.OpenGL.glCopyTexSubImage3D(this.target, param6, param3, param0, param2, param1, param4, param5, param7);
        jaggl.OpenGL.glFlush();
    }

    LegacyOpenGlTexture3D(OpenGlToolkit param0, int param1, int param2, int param3, int param4, byte[] param5, int param6) {
        super(param0, 32879, param1, param4 * (param2 * param3), false);
        this.field_n = -1;
        this.field_p = -1;
        try {
          this.field_o = param4;
          this.field_r = param2;
          this.field_q = param3;
          this.toolkit.bindTexture(true, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.internalFormat, this.field_r, this.field_q, this.field_o, 0, param6, 5121, param5, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.setLinearFiltering(true, 3);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "lha.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_l = null;
        field_m = null;
        if (param0 < 5) {
          LegacyOpenGlTexture3D.releaseStatics((byte) 104);
        }
    }

    final static void writeCookie(String param0, String param1, byte param2, long param3, java.applet.Applet param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param4.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param1 + "=" + param0 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param2 < 109) {
                LegacyOpenGlTexture3D.releaseStatics((byte) -114);
              }
              if (0L <= param3) {
                var7Lifetime4 = var9 + "; Expires=" + ida.formatCookieDate(param3 * 1000L + bva.currentTimeMillis((byte) -107), -1) + "; Max-Age=" + param3;
              } else {
                var7Lifetime4 = var9 + "; Discard;";
              }
              JavaScriptBridge.evaluateScript(param4, 19467, "document.cookie=\"" + var7Lifetime4 + "\"");
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("lha.D(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw tba.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_m = "You do not have a suitable number of players for the current options.";
    }
}
