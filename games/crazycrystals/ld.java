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

    public static void f(int param0) {
        if (param0 == 100) {
          field_r = null;
          field_v = null;
          field_x = null;
          field_w = null;
          return;
        }
        field_x = (String[]) null;
        field_r = null;
        field_v = null;
        field_x = null;
        field_w = null;
    }

    final static char a(int param0, byte param1) {
        int var3 = 0;
        if (param0 > -15) {
          return '￸';
        }
        int var2 = 255 & param1;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        }
        if (var2 < 128) {
          return (char)var2;
        }
        if (var2 < 160) {
          var3 = tg.field_d[-128 + var2];
          if (var3 == 0) {
            var3 = 63;
          }
          var2 = var3;
          return (char)var2;
        }
        return (char)var2;
    }

    final int b(byte param0) {
        if (param0 < 18) {
          this.b((byte) -98);
          if (null != this.field_s) {
            return this.field_s.field_f * 100 / (this.field_s.field_h.length - this.field_u);
          }
          return 0;
        }
        if (null != this.field_s) {
          return this.field_s.field_f * 100 / (this.field_s.field_h.length - this.field_u);
        }
        return 0;
    }

    final static void g(int param0) {
        CharSequence var3 = null;
        je.field_g = kd.field_n.i(111);
        if (param0 == -1266) {
          var3 = (CharSequence) ((Object) je.field_g);
          lk.field_b = fe.a(60136, var3);
          return;
        }
        field_r = (String) null;
        CharSequence var2 = (CharSequence) ((Object) je.field_g);
        lk.field_b = fe.a(60136, var2);
    }

    final byte[] e(int param0) {
        int var2 = 8 % ((55 - param0) / 55);
        if (this.field_n) {
          throw new RuntimeException();
        }
        if (this.field_s.field_f >= this.field_s.field_h.length - this.field_u) {
          return this.field_s.field_h;
        }
        throw new RuntimeException();
    }

    ld() {
    }

    static {
        field_x = new String[]{"Showing by rating", "Showing by win percentage"};
        field_w = "Waiting for fonts";
    }
}
