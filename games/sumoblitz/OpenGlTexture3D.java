/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlTexture3D extends OpenGlTexture implements Texture3D {
    private int field_i;
    private int field_k;
    private int field_l;
    static QuickChatCommand field_n;
    static int[] field_j;
    static jj field_m;
    static String logInCreateAccountText;
    static ToolkitSprite[] field_p;

    public final void setFilter(TextureFilter filter, int guard) {
        try {
          if (guard != 15149) {
            field_j = (int[]) null;
          }
          super.setFilter(filter, guard ^ 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "go.J(" + (filter != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_p = null;
        field_m = null;
        field_j = null;
        logInCreateAccountText = null;
        field_n = null;
        if (param0 != -17) {
          OpenGlTexture3D.releaseStatics((byte) 112);
        }
    }

    OpenGlTexture3D(OpenGlGraphicsToolkit param0, TextureFormat param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, GpuDataType.UNSIGNED_BYTE, param2 * (param3 * param4), false);
        try {
          this.field_i = param2;
          this.field_k = param3;
          this.field_l = param4;
          this.toolkit.a((GpuTexture) (this), 104);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.glInternalFormat(-11), this.field_i, this.field_k, this.field_l, 0, IntrusiveNodeHashTable.glTextureFormat(-21339, this.format), 5121, param5, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "go.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public final void bind(int guard) {
        super.bind(guard);
    }

    static {
        field_n = new QuickChatCommand(0, 2, 2, 1);
        field_j = new int[25];
        logInCreateAccountText = "Log in / Create account";
        field_m = new jj("email");
    }
}
