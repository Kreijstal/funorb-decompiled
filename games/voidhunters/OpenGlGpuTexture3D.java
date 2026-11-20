/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlGpuTexture3D extends OpenGlGpuTexture implements GpuTexture3D {
    static int field_n;
    private int field_j;
    static wsb field_m;
    private int field_l;
    private int field_k;

    public final void bind(int param0) {
        super.bind(param0);
    }

    public final void setFilterMode(TextureFilterMode param0, int param1) {
        if (param1 != -28798) {
          return;
        }
        try {
          super.setFilterMode(param0, param1 ^ 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rab.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 148) {
          OpenGlGpuTexture3D.clearSharedReferences(-7);
          field_m = null;
          return;
        }
        field_m = null;
    }

    OpenGlGpuTexture3D(OpenGlGpuToolkit param0, TextureFormat param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, 32879, param1, GpuDataType.UNSIGNED_BYTE, param4 * (param2 * param3), false);
        try {
          this.field_l = param3;
          this.field_k = param4;
          this.field_j = param2;
          this.toolkit.setTexture((GpuTexture) (this), -116);
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage3Dub(this.target, 0, this.getInternalFormat((byte) -31), this.field_j, this.field_l, this.field_k, 0, MissionControl.toOpenGlTextureFormat(-29328, this.format), 5121, param5, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = 0;
    }
}
