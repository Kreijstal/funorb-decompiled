/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    static int field_b;
    static String field_a;
    static rg field_c;

    public static void b() {
        int var1 = -31;
        field_a = null;
        field_c = null;
    }

    final static java.awt.Container a() {
        if (!(ic.field_d == null)) {
            return (java.awt.Container) (Object) ic.field_d;
        }
        return (java.awt.Container) (Object) ll.b(78);
    }

    final static boolean a(int param0) {
        if (kd.field_B == null) {
            return false;
        }
        if (!kd.field_B.c(0)) {
            return false;
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email is valid";
    }
}
