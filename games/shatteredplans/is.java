/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class is {
    static boolean field_b;
    static boolean field_a;
    private static String field_z;

    final static int a(byte param0, int param1) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        gb.field_i = 0;
        oj.field_Gb = null;
        js.field_a = null;
        if (param0 != -94) {
          is.a((byte) -54, 83);
        }
        int var2 = hn.field_i;
        hn.field_i = cf.field_D;
        if (param1 == 51) {
          vp.field_o.field_p = 2;
          cf.field_D = var2;
          vp.field_o.field_a = vp.field_o.field_a + 1;
          if (vp.field_o.field_a < 2) {
            if (2 <= vp.field_o.field_a &&
              param1 == 50) {
              return 5;
            }
            if (vp.field_o.field_a < 4) {
              return -1;
            }
            return 1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (2 <= vp.field_o.field_a &&
            param1 == 50) {
            return 5;
          }
          if (vp.field_o.field_a < 4) {
            return -1;
          }
          return 1;
        }
        if (50 == param1) {
          vp.field_o.field_p = 5;
          cf.field_D = var2;
          vp.field_o.field_a = vp.field_o.field_a + 1;
          if (vp.field_o.field_a < 2) {
            if (2 <= vp.field_o.field_a &&
              param1 == 50) {
              return 5;
            }
            if (vp.field_o.field_a < 4) {
              return -1;
            }
            return 1;
          }
          if (param1 == 51) {
            return 2;
          }
          if (2 <= vp.field_o.field_a &&
            param1 == 50) {
            return 5;
          }
          if (vp.field_o.field_a < 4) {
            return -1;
          }
          return 1;
        }
        vp.field_o.field_p = 1;
        cf.field_D = var2;
        vp.field_o.field_a = vp.field_o.field_a + 1;
        if (vp.field_o.field_a < 2) {
          if (2 <= vp.field_o.field_a &&
            param1 == 50) {
            return 5;
          }
          if (vp.field_o.field_a >= 4) {
            return 1;
          }
          return -1;
        }
        if (param1 == 51) {
          return 2;
        }
        if (2 <= vp.field_o.field_a &&
          param1 == 50) {
          return 5;
        }
        if (vp.field_o.field_a < 4) {
          return -1;
        }
        return 1;
    }

    static {
        field_z = "is.A(";
    }
}
