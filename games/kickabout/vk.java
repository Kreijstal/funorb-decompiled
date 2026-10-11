/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    static String field_a;
    static boolean field_b;

    final static int a(int param0, int param1) {
        int var2;
        int var3;
        var3 = Kickabout.field_G;
        iv.field_o = null;
        je.field_e = null;
        ci.field_a = 0;
        var2 = nb.field_b;
        nb.field_b = nr.field_e;
        if (param1 == 51) {
          gt.field_t.field_l = 2;
        } else {
          if (50 == param1) {
            gt.field_t.field_l = 5;
          } else {
            gt.field_t.field_l = 1;
          }
        }
        nr.field_e = var2;
        gt.field_t.field_o = gt.field_t.field_o + 1;
        if (param0 >= -115) {
          return 120;
        }
        if (gt.field_t.field_o >= 2 &&
          param1 == 51) {
          return 2;
        }
        if (gt.field_t.field_o >= 2 &&
          param1 == 50) {
          return 5;
        }
        if (4 <= gt.field_t.field_o) {
          return 1;
        }
        return -1;
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 50) {
          vk.a(-97);
        }
    }

    static {
        field_a = "Your team earns 10% of normal experience.";
        field_b = false;
    }
}
