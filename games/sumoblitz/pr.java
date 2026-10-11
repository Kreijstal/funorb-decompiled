/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr extends ht {
    static hr[] field_k;
    private int field_l;

    pr(fr param0, int param1, int param2, byte[] param3, int param4) {
        super(param0, 3552, param1, param2, false);
        try {
          this.field_l = param2;
          this.field_d.a(55, (ht) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage1Dub(this.field_c, 0, this.field_a, this.field_l, 0, param4, 5121, param3, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.a(true, 0);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "pr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void d(int param0) {
        field_k = null;
        if (param0 != 7064) {
          pr.d(44);
        }
    }

    final void a(boolean param0, byte param1) {
        if (param1 >= 119) {
          this.field_d.a(69, (ht) (this));
          jaggl.OpenGL.glTexParameteri(this.field_c, 10242, param0 ? 10497 : 33071);
          return;
        }
        field_k = (hr[]) null;
        this.field_d.a(69, (ht) (this));
        jaggl.OpenGL.glTexParameteri(this.field_c, 10242, param0 ? 10497 : 33071);
    }

    public final void a(int param0) {
        int var2 = -87 % ((44 - param0) / 58);
    }

    static {
    }
}
