/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static vd[] field_b;
    static String field_a;
    static vd field_c;

    final static void a(int param0) {
        if (param0 == -26317) {
          tt.b(-32546);
          if (ci.field_f == null) {
            ic.a(0);
            to.h(param0 ^ -26318);
            bl.c(-18535);
            if (je.a(false)) {
              q.field_p.g(54, 1);
              fr.a(param0 + 26270, 0);
              te.b(true);
              return;
            } else {
              te.b(true);
              return;
            }
          } else {
            pg.a(ci.field_f, 116);
            ic.a(0);
            to.h(param0 ^ -26318);
            bl.c(-18535);
            if (!je.a(false)) {
              te.b(true);
              return;
            } else {
              q.field_p.g(54, 1);
              fr.a(param0 + 26270, 0);
              te.b(true);
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != 10) {
            return true;
        }
        return aa.a(true, 10, param1, (byte) -43);
    }

    public static void b(int param0) {
        field_b = null;
        if (param0 != 8664) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Cancel";
    }
}
