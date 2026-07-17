/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends wl {
    static String field_r;
    static String[] field_x;
    ng field_s;
    byte field_u;
    int field_t;
    static dl[] field_v;
    static String field_w;
    static int field_y;

    public static void f() {
        field_r = null;
        field_v = null;
        field_x = null;
        field_w = null;
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = 255 & param1;
        if (var2 != 0) {
          if (-129 >= var2) {
            if (-161 <= var2) {
              return (char)var2;
            } else {
              L0: {
                var3 = tg.field_d[-128 + var2];
                if (var3 == 0) {
                  var3 = 63;
                  break L0;
                } else {
                  break L0;
                }
              }
              var2 = var3;
              return (char)var2;
            }
          } else {
            return (char)var2;
          }
        } else {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
    }

    final int b(byte param0) {
        if (param0 >= 18) {
          if (null == ((ld) this).field_s) {
            return 0;
          } else {
            return ((ld) this).field_s.field_f * 100 / (((ld) this).field_s.field_h.length - ((ld) this).field_u);
          }
        } else {
          int discarded$7 = ((ld) this).b((byte) -98);
          if (null == ((ld) this).field_s) {
            return 0;
          } else {
            return ((ld) this).field_s.field_f * 100 / (((ld) this).field_s.field_h.length - ((ld) this).field_u);
          }
        }
    }

    final static void g() {
        je.field_g = kd.field_n.i(111);
        CharSequence var2 = (CharSequence) (Object) je.field_g;
        lk.field_b = fe.a(60136, var2);
    }

    final byte[] e(int param0) {
        int var2 = 0;
        var2 = 8 % ((55 - param0) / 55);
        if (!((ld) this).field_n) {
          if (((ld) this).field_s.field_f < ((ld) this).field_s.field_h.length - ((ld) this).field_u) {
            throw new RuntimeException();
          } else {
            return ((ld) this).field_s.field_h;
          }
        } else {
          throw new RuntimeException();
        }
    }

    ld() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new String[]{"Showing by rating", "Showing by win percentage"};
        field_w = "Waiting for fonts";
    }
}
