/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlTexture1D extends LegacyOpenGlTexture {
    static Object field_m;
    private int field_l;
    static fta field_n;

    final void setWrap(int param0, boolean param1) {
        this.toolkit.bindTexture(true, (LegacyOpenGlTexture) (this));
        int var3 = -71 / ((17 - param0) / 38);
        jaggl.OpenGL.glTexParameteri(this.target, 10242, !param1 ? 33071 : 10497);
    }

    LegacyOpenGlTexture1D(OpenGlToolkit param0, int param1, int param2, byte[] param3, int param4) {
        super(param0, 3552, param1, param2, false);
        try {
          this.field_l = param2;
          this.toolkit.bindTexture(true, (LegacyOpenGlTexture) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage1Dub(this.target, 0, this.internalFormat, this.field_l, 0, param4, 5121, param3, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.setLinearFiltering(true, 3);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "uga.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public final void detachFramebuffer(int param0) {
        int var2 = -106 % ((14 - param0) / 56);
    }

    public static void releaseStatics(int param0) {
        field_n = null;
        if (param0 != -12242) {
          return;
        }
        field_m = null;
    }

    static {
        field_n = new fta();
    }
}
