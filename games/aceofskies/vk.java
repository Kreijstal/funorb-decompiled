/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk {
    private static kp field_c;
    private static boolean field_b;
    private static int field_a;

    final synchronized static void a(byte param0) {
        wn var1 = null;
        try {
            while (true) {
                var1 = (wn) ((Object) field_c.e(125));
                if (var1 == null) {
                    break;
                }
                var1.field_e.w(true);
                var1.c(-123);
            }
            int var1_int = 47 % ((84 - param0) / 32);
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    final synchronized static void a(e param0, int param1) {
        wn var3 = null;
        int var2 = -29 % ((-59 - param1) / 51);
        if (!(!field_b)) {
            return;
        }
        if (0 < field_a) {
            var3 = new wn();
            var3.field_e = param0;
            field_c.a(79, var3);
        } else {
            param0.w(false);
        }
    }

    final synchronized static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_a = field_a + 1;
    }

    final synchronized static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = field_a - 1;
        if (!(0 != field_a)) {
            vk.a((byte) 119);
        }
    }

    static {
        field_b = false;
        field_a = 0;
        field_c = new kp();
    }
}
