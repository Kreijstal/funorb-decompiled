/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ooa extends wka {
    static String field_h;
    static int[] field_e;
    static int field_g;
    static jea field_f;

    final static String a(byte param0) {
        String var1 = "";
        if (param0 < -46) {
          if (null != vn.field_b) {
            var1 = vn.field_b.a(39);
          }
          if (var1.length() == 0) {
            var1 = ra.r((byte) 69);
          }
          if (var1.length() == 0) {
            var1 = uw.field_a;
          }
          return var1;
        }
        ooa.a((byte) -83);
        if (null != vn.field_b) {
          var1 = vn.field_b.a(39);
        }
        if (var1.length() == 0) {
          var1 = ra.r((byte) 69);
        }
        if (var1.length() == 0) {
          var1 = uw.field_a;
        }
        return var1;
    }

    public static void d(int param0) {
        field_f = null;
        field_h = null;
        field_e = null;
        int var1 = -88 % ((70 - param0) / 47);
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 <= -42) {
          return (((param1 & 8192) != 0 ? true : false) | cra.a(param0, -57, param1) | wq.b(param0, param1, 8000)) & kb.a(param0, param1, (byte) 17);
        }
        return true;
    }

    static {
        field_h = "Create a free account to start using this feature";
    }
}
