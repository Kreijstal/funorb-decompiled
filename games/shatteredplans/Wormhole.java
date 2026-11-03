/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Wormhole extends IntrusiveNode {
    Star field_n;
    static fg field_j;
    Star field_k;
    static boolean field_i;
    static v field_l;
    int field_m;
    static Sprite field_h;

    public static void clearStatics(int param0) {
        field_l = null;
        field_j = null;
        int var1 = 115 / ((-10 - param0) / 45);
        field_h = null;
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        Sprite var16 = null;
        int[] var18 = SoftwareRasterizer.field_h;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = SoftwareRasterizer.field_b;
        int var8 = SoftwareRasterizer.field_k;
        Sprite var9 = new Sprite(param1, param2 - 2 * param1);
        var9.bindAsRenderTarget();
        SoftwareRasterizer.fillRectGradient(0, 0, param1, param2 - param1 * 2, param3, param4);
        Sprite var10 = new Sprite(param1, param1);
        var10.bindAsRenderTarget();
        SoftwareRasterizer.fillRect(0, 0, param1, param1, param3);
        Sprite var11 = new Sprite(16, param1);
        var11.bindAsRenderTarget();
        SoftwareRasterizer.fillRect(0, 0, param0, param1, param3);
        Sprite var12 = new Sprite(param1, param1);
        var12.bindAsRenderTarget();
        SoftwareRasterizer.fillRect(0, 0, param1, param1, param4);
        Sprite var13 = new Sprite(16, param1);
        var13.bindAsRenderTarget();
        SoftwareRasterizer.fillRect(0, 0, 16, param1, param4);
        Object var14 = null;
        if (0 < param5) {
          var16 = new Sprite(16, 16);
          var14 = var16;
          var16.bindAsRenderTarget();
          SoftwareRasterizer.fillRect(0, 0, 16, 16, param5);
        }
        SoftwareRasterizer.setTarget(var18, var7, var8);
        return new Sprite[]{var10, var11, var10, var9, (Sprite) (var14), var9, var12, var13, var12};
    }

    Wormhole(Star param0, Star param1, int param2) {
        try {
          this.field_k = param1;
          this.field_m = param2;
          this.field_n = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "cs.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(byte param0) {
        an.field_b = new aa();
        if (param0 > 64) {
          ae.field_f.b(an.field_b, -88);
          return;
        }
        Wormhole.clearStatics(14);
        ae.field_f.b(an.field_b, -88);
    }

    static {
    }
}
