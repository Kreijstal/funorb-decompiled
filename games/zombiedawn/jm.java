/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm extends tc {
    static ec field_B;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = param0 * (param0 * param0 >> -901373652) >> 285548268;
        if (param1 <= 63) {
          int discarded$2 = jm.a(-123, 65);
          var3 = 6 * param0 + -61440;
          var4 = (var3 * param0 >> -123943188) + 40960;
          return var2 * var4 >> -1975494484;
        } else {
          var3 = 6 * param0 + -61440;
          var4 = (var3 * param0 >> -123943188) + 40960;
          return var2 * var4 >> -1975494484;
        }
    }

    final static void a(String param0, String param1, int param2) {
        if (kk.field_i == null) {
          he.field_a = new ih(param1, param0, false, true, true);
          if (param2 != -901373652) {
            return;
          } else {
            bm.field_d.b(20, (ga) (Object) he.field_a);
            return;
          }
        } else {
          kk.field_i.h((byte) -34);
          he.field_a = new ih(param1, param0, false, true, true);
          if (param2 != -901373652) {
            return;
          } else {
            bm.field_d.b(20, (ga) (Object) he.field_a);
            return;
          }
        }
    }

    final String b(int param0, ga param1) {
        if (param0 != 12307) {
          field_B = null;
          return mo.a(95, param1.field_o.length(), '*');
        } else {
          return mo.a(95, param1.field_o.length(), '*');
        }
    }

    jm(int param0) {
        this(ia.field_e, param0);
    }

    private jm(rb param0, int param1) {
        super(param0, param1);
    }

    public static void a(boolean param0) {
        field_B = null;
        if (param0) {
            field_B = null;
        }
    }

    static {
    }
}
