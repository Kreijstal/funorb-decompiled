/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTexture1D extends LegacyOpenGlTexture {
    static ToolkitSprite[] field_k;
    private int length;

    LegacyOpenGlTexture1D(LegacyOpenGlGraphicsToolkit owner, int storageFormat, int texels, byte[] pixels, int sourceFormat) {
        super(owner, 3552, storageFormat, texels, false);
        try {
          this.length = texels;
          this.toolkit.bindTexture(55, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage1Dub(this.target, 0, this.internalFormat, this.length, 0, sourceFormat, 5121, pixels, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.setLinearFiltering(true, 0);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "pr.<init>(" + (owner != null ? "{...}" : "null") + ',' + storageFormat + ',' + texels + ',' + (pixels != null ? "{...}" : "null") + ',' + sourceFormat + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_k = null;
        if (param0 != 7064) {
          LegacyOpenGlTexture1D.releaseStatics(44);
        }
    }

    final void setRepeat(boolean repeat, byte guard) {
        if (guard >= 119) {
          this.toolkit.bindTexture(69, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glTexParameteri(this.target, 10242, repeat ? 10497 : 33071);
          return;
        }
        field_k = (ToolkitSprite[]) null;
        this.toolkit.bindTexture(69, (LegacyOpenGlTexture) (this));
        jaggl.OpenGL.glTexParameteri(this.target, 10242, repeat ? 10497 : 33071);
    }

    public final void detachFramebuffer(int guard) {
        int var2 = -87 % ((44 - guard) / 58);
    }

    static {
    }
}
