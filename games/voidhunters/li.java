/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class li extends pib {
    static boolean field_i;
    private int field_h;

    final void a(boolean param0, boolean param1) {
        if (param1) {
          this.field_g.a(86, (pib) (this));
          jaggl.OpenGL.glTexParameteri(this.field_b, 10242, param0 ? 10497 : 33071);
          return;
        }
        this.a(false, true);
        this.field_g.a(86, (pib) (this));
        jaggl.OpenGL.glTexParameteri(this.field_b, 10242, param0 ? 10497 : 33071);
    }

    public final void a(int param0) {
        if (param0 != 31294) {
          this.a(83);
        }
    }

    li(qfa param0, int param1, int param2, byte[] param3, int param4) {
        super(param0, 3552, param1, param2, false);
        try {
          this.field_h = param2;
          this.field_g.a(104, (pib) (this));
          jaggl.OpenGL.glPixelStorei(3317, 1);
          jaggl.OpenGL.glTexImage1Dub(this.field_b, 0, this.field_d, this.field_h, 0, param4, 5121, param3, 0);
          jaggl.OpenGL.glPixelStorei(3317, 4);
          this.a(-125, true);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var3 = eu.a(param1, 53);
        int var4 = fc.a(param1, (byte) 106);
        int var5 = eu.a(param2, 108);
        int var6 = fc.a(param2, (byte) -76);
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
