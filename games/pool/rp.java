/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    static vh field_d;
    static tf field_b;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 == 13) {
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
        field_c = (String) null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a(vh param0, vh param1, int param2) {
        try {
          if (null == param0.field_T) {
            param0.field_T = new IntrusiveDeque();
          }
          if (param1.field_T == null) {
            param1.field_T = new IntrusiveDeque();
          }
          if (null == df.field_b) {
            df.field_b = new tk(64);
          }
          if (gd.field_c == null) {
            gd.field_c = new tk(64);
          }
          cf.field_k = param0.field_T;
          jq.field_c = param1.field_T;
          lq.l(-65);
          int var3_int = 107 / ((param2 - 50) / 36);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "rp.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        Sprite var25 = null;
        Sprite var26 = null;
        Sprite var27 = null;
        Sprite var28 = null;
        Sprite var29 = null;
        Sprite var30 = null;
        Sprite var24 = null;
        int var8 = 0;
        Object var14 = null;
        int[] var18 = SoftwareRasterizer.pixels;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = SoftwareRasterizer.width;
        int var8Lifetime1;
        if (param0 == 32450) {
          var8 = SoftwareRasterizer.height;
          var25 = new Sprite(param1, -(param1 * 2) + param3);
          var25.e();
          SoftwareRasterizer.fillVerticalGradient(0, 0, param1, -(param1 * 2) + param3, param4, param5);
          var26 = new Sprite(param1, param1);
          var26.e();
          SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param4);
          var27 = new Sprite(16, param1);
          var27.e();
          SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param4);
          var28 = new Sprite(param1, param1);
          var28.e();
          SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param5);
          var29 = new Sprite(16, param1);
          var29.e();
          SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param5);
          var14 = null;
          if (param2 > 0) {
            var30 = new Sprite(16, 16);
            var14 = var30;
            var30.e();
            SoftwareRasterizer.fillRectangle(0, 0, 16, 16, param2);
          }
          SoftwareRasterizer.setTarget(var18, var7, var8);
          return new Sprite[]{var26, var27, var26, var25, (Sprite) (var14), var25, var28, var29, var28};
        }
        rp.a((byte) -47);
        var8Lifetime1 = SoftwareRasterizer.height;
        Sprite var19 = new Sprite(param1, -(param1 * 2) + param3);
        var19.e();
        SoftwareRasterizer.fillVerticalGradient(0, 0, param1, -(param1 * 2) + param3, param4, param5);
        Sprite var20 = new Sprite(param1, param1);
        var20.e();
        SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param4);
        Sprite var21 = new Sprite(16, param1);
        var21.e();
        SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param4);
        Sprite var22 = new Sprite(param1, param1);
        var22.e();
        SoftwareRasterizer.fillRectangle(0, 0, param1, param1, param5);
        Sprite var23 = new Sprite(16, param1);
        var23.e();
        SoftwareRasterizer.fillRectangle(0, 0, 16, param1, param5);
        var14 = null;
        if (param2 > 0) {
          var24 = new Sprite(16, 16);
          var14 = var24;
          var24.e();
          SoftwareRasterizer.fillRectangle(0, 0, 16, 16, param2);
        }
        SoftwareRasterizer.setTarget(var18, var7, var8Lifetime1);
        return new Sprite[]{var20, var21, var20, var19, (Sprite) (var14), var19, var22, var23, var22};
    }

    static {
        field_a = "Send private message to <%0>";
        field_b = new tf(2);
        field_c = "Waiting for graphics";
    }
}
