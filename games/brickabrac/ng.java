/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    static String field_f;
    static int field_b;
    static tp[] field_d;
    static jp field_a;
    static String field_e;
    static String field_c;

    final static void a(boolean param0, int param1, int param2) {
        if (hd.field_d == null) {
          if (lp.field_rb.field_a != param2) {
            L0: {
              hd.field_d = ij.a(param2, (byte) -128);
              if (hd.field_d instanceof km) {
                ((km) (Object) hd.field_d).a(param0, 0, 125);
                break L0;
              } else {
                break L0;
              }
            }
            if (param1 < 52) {
              ng.a(true, 107, -22);
              kh.field_a = 0;
              wp.a(8, ta.field_e[8]);
              return;
            } else {
              kh.field_a = 0;
              wp.a(8, ta.field_e[8]);
              return;
            }
          } else {
            return;
          }
        } else {
          sk.i((byte) -127);
          if (lp.field_rb.field_a != param2) {
            L1: {
              hd.field_d = ij.a(param2, (byte) -128);
              if (hd.field_d instanceof km) {
                ((km) (Object) hd.field_d).a(param0, 0, 125);
                break L1;
              } else {
                break L1;
              }
            }
            if (param1 >= 52) {
              kh.field_a = 0;
              wp.a(8, ta.field_e[8]);
              return;
            } else {
              ng.a(true, 107, -22);
              kh.field_a = 0;
              wp.a(8, ta.field_e[8]);
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        if (param0 != -49) {
          ng.a((byte) 114, true);
          field_f = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_c = null;
          return;
        }
    }

    final static void a(byte param0, boolean param1) {
        if (param0 <= -64) {
          if (null != sq.field_c) {
            if (!sq.field_c.a((byte) 79, param1)) {
              return;
            } else {
              sq.field_c = null;
              return;
            }
          } else {
            return;
          }
        } else {
          ng.a((byte) -25);
          if (null != sq.field_c) {
            if (!sq.field_c.a((byte) 79, param1)) {
              return;
            } else {
              sq.field_c = null;
              return;
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_e = "Remove name";
        field_c = "Quick Chat Help";
        field_f = "That name is not available";
    }
}
