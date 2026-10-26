/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class r extends DualLinkNode {
    static String field_o;
    static int field_n;

    public static void f(int param0) {
        field_o = null;
        if (param0 != 27354) {
          r.e(-50);
        }
    }

    protected r() {
    }

    final static void e(int param0) {
        if (param0 != -14598) {
          return;
        }
        if (32 >= gn.field_a) {
          rt.b(0, (byte) 28);
          return;
        }
        int var1 = gn.field_a % 32;
        if (var1 == 0) {
          var1 = 32;
        }
        rt.b(-var1 + gn.field_a, (byte) -127);
    }

    static {
        field_o = "Suggested names: ";
    }
}
