/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ns {
    static ha field_a;

    final static void a(wt param0, int param1, wt param2) {
        L0: {
          if (null != ((wt) param0).field_f) {
            param0.d(param1 + 30453);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_j = ((wt) param2).field_j;
        param0.field_f = param2;
        ((wt) param0).field_f.field_j = param0;
        if (param1 != -30575) {
          return;
        } else {
          ((wt) param0).field_j.field_f = param0;
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -24169) {
            field_a = (ha) null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
    }
}
