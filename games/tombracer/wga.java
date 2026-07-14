/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wga implements bo {
    private int field_b;
    static int[] field_a;

    final void a(int param0, v param1, qh param2) {
        param2.field_k.h(((wga) this).field_b, 78);
        if (param0 != 4545315) {
            ((wga) this).field_b = 35;
        }
    }

    final static void a(boolean param0, int param1) {
        kh var2 = null;
        var2 = ql.field_k;
        if (!param0) {
          return;
        } else {
          var2.k(param1, -2988);
          var2.i(2, 0);
          var2.i(4, 0);
          var2.i(r.f(11), 0);
          return;
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 125);
        if (param1 != -19) {
          wga.a(false);
          ((wga) this).field_b = param0.b((byte) 44, 5);
          param0.i((byte) 98);
          return;
        } else {
          ((wga) this).field_b = param0.b((byte) 44, 5);
          param0.i((byte) 98);
          return;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_a = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    public final void a(int param0, kh param1) {
        param1.i(8);
        param1.a((byte) 31, ((wga) this).field_b, 5);
        param1.k(param0 ^ -1826190742);
        if (param0 != 200) {
            ((wga) this).field_b = 49;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{4545315, 2375003, 5973028, 5252187};
    }
}
