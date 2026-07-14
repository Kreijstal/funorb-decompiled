/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hj extends l {
    int field_i;
    static int field_h;
    static rm[] field_g;

    public static void a(int param0) {
        if (param0 != 17) {
            field_h = 99;
            field_g = null;
            return;
        }
        field_g = null;
    }

    hj(int param0) {
        ((hj) this).field_i = param0;
    }

    final static rm a(eh param0, int param1, int param2) {
        Object var4 = null;
        if (mm.a(10332, param1, param0)) {
          if (param2 != 12) {
            var4 = null;
            rm discarded$2 = hj.a((eh) null, -36, 3);
            return bk.a(121);
          } else {
            return bk.a(121);
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, jc param1, int param2, int param3, int param4) {
        param1.a(param4, 84);
        param1.a((byte) -73, 17);
        param1.a((byte) -100, param3);
        param1.a((byte) -94, param0);
        param1.a(param2, 66);
    }

    final static km c(int param0) {
        if (param0 < 43) {
            field_h = 95;
            return wm.field_r.field_Jb;
        }
        return wm.field_r.field_Jb;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 0;
    }
}
