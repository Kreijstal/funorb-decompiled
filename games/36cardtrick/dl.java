/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends IntrusiveNode {
    static int field_g;
    int[] field_i;
    static int field_h;
    static String field_j;

    final static void a(int param0, RgbSprite param1) {
        try {
          ji.a(true);
          SoftwareRasterizer.setRasterBuffer(param1.field_r, param1.field_l, param1.field_k);
          int var2_int = -40 % ((param0 - 27) / 52);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "dl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(int param0) {
        if (param0 != 0) {
          return false;
        }
        return vg.field_d;
    }

    private dl() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_j = null;
        if (param0 != 8996) {
          RgbSprite var2 = (RgbSprite) null;
          dl.a(51, (RgbSprite) null);
        }
    }

    static {
        field_h = 0;
        field_j = "Go Back";
    }
}
