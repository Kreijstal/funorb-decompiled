/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dra {
    static String[] field_b;
    static String[] field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -108) {
            field_a = null;
        }
    }

    final static void a(boolean param0) {
        kh var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          field_b = null;
          var1 = ql.field_k;
          L0: while (true) {
            if (!sea.l(10371)) {
              return;
            } else {
              var1.k(8, -2988);
              var1.field_h = var1.field_h + 1;
              var2 = var1.field_h + 1;
              hk.a(true, var1);
              ql.field_k.d(var1.field_h - var2, (byte) -17);
              continue L0;
            }
          }
        } else {
          var1 = ql.field_k;
          L1: while (true) {
            if (!sea.l(10371)) {
              return;
            } else {
              var1.k(8, -2988);
              var1.field_h = var1.field_h + 1;
              var2 = var1.field_h + 1;
              hk.a(true, var1);
              ql.field_k.d(var1.field_h - var2, (byte) -17);
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"Rhythm", "Basic1", "Basic2", "Flavour1", "Flavour2", "Flavour3", "Flavour4", "Flavour5", "Flavour6", "Music1", "Music2", "Music3", "Music4", "Boulder", "Danger", "Snakes"};
        field_a = new String[100];
    }
}
