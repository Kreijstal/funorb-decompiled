/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_b;
    static qr field_j;
    static nq field_f;
    static int field_c;
    static int field_a;
    static char field_h;
    static String field_g;
    static fs field_d;
    static byte[] field_i;
    static int[] field_e;

    final static void a(boolean param0, int param1) {
        if (null == bq.field_h) {
          if (param1 != 8323199) {
            ho.a(-86);
            return;
          } else {
            return;
          }
        } else {
          gf.h(gf.field_i, gf.field_a, gf.field_l + -gf.field_i, -gf.field_a + gf.field_f);
          bq.field_h.b(param0, -100);
          if (param1 == 8323199) {
            return;
          } else {
            ho.a(-86);
            return;
          }
        }
    }

    final static li a(int param0, int param1, String param2) {
        pa var3 = null;
        if (param1 != -4276) {
          field_h = 'ￊ';
          var3 = new pa();
          ((li) (Object) var3).field_a = param0;
          ((li) (Object) var3).field_f = param2;
          return (li) (Object) var3;
        } else {
          var3 = new pa();
          ((li) (Object) var3).field_a = param0;
          ((li) (Object) var3).field_f = param2;
          return (li) (Object) var3;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        if (param0 != 520) {
          ho.a(false, 124);
          field_i = null;
          field_g = null;
          field_j = null;
          field_d = null;
          return;
        } else {
          field_i = null;
          field_g = null;
          field_j = null;
          field_d = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_g = "Enemy Production";
        field_e = new int[]{16729156, 4521796, 7829503, 8323199, 16776960, 65535, 16776960, 8388479, 8355839};
        field_i = new byte[520];
    }
}
