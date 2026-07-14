/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ms {
    static String field_a;
    private ti field_b;
    static ll field_c;
    static int field_d;

    final void b(byte param0) {
        if (((ms) this).field_b == null) {
          if (param0 != 29) {
            ((ms) this).field_b = (ti) null;
            return;
          } else {
            return;
          }
        } else {
          ((ms) this).field_b.a(4665);
          if (param0 == 29) {
            return;
          } else {
            ((ms) this).field_b = (ti) null;
            return;
          }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        int var1 = -69 / ((71 - param0) / 39);
        field_a = null;
    }

    ms(boolean param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Log in";
    }
}
