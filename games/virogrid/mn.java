/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static boolean field_e;
    static int field_a;
    static String[] field_c;
    static String field_b;
    static String[] field_d;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        if (param0 != 0) {
            field_a = -13;
        }
    }

    final static void a(boolean param0) {
        int var2 = 0;
        var2 = Virogrid.field_F ? 1 : 0;
        if (-1 == (vg.field_I.field_C.field_D & 1 << vg.field_I.field_e ^ -1)) {
          if (vg.field_I.field_C.field_D == 0) {
            de.field_pb[10] = cf.field_a;
            if (param0) {
              field_c = null;
              return;
            } else {
              return;
            }
          } else {
            de.field_pb[10] = of.field_c;
            if (!param0) {
              return;
            } else {
              field_c = null;
              return;
            }
          }
        } else {
          de.field_pb[10] = je.field_E;
          if (!param0) {
            return;
          } else {
            field_c = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Play free version";
        field_a = 480;
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
