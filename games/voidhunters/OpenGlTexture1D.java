/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlTexture1D extends OpenGlTexture {
    static boolean field_i;
    private int width;

    final void setWrap(boolean param0, boolean param1) {
        if (param1) {
          this.toolkit.bindTexture(86, (OpenGlTexture) (this));
          jaggl.OpenGL.glTexParameteri(this.target, 10242, param0 ? 10497 : 33071);
          return;
        }
        this.setWrap(false, true);
        this.toolkit.bindTexture(86, (OpenGlTexture) (this));
        jaggl.OpenGL.glTexParameteri(this.target, 10242, param0 ? 10497 : 33071);
    }

    public final void detachFromFramebuffer(int param0) {
        if (param0 != 31294) {
          this.detachFromFramebuffer(83);
        }
    }

    OpenGlTexture1D(OpenGlToolkit param0, int param1, int param2, byte[] param3, int param4) {
        super(param0, 3552, param1, param2, false);
        try {
          this.width = param2;
          this.toolkit.bindTexture(104, (OpenGlTexture) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage1Dub(this.target, 0, this.internalFormat, this.width, 0, param4, 5121, param3, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.setLinearFiltering(-125, true);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = TextureLineShape.a(param1, 53);
        int var4 = GetNumStars.a(param1, (byte) 106);
        int var5 = TextureLineShape.a(param2, 108);
        int var6 = GetNumStars.a(param2, (byte) -76);
        int var7 = (int)((long)var3 * (long)var5 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var5 * (long)var4 >> 16);
        int var11 = 18 % ((param0 + 54) / 51);
        int var10 = (int)((long)var4 * (long)var6 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    static {
        field_i = true;
    }
}
