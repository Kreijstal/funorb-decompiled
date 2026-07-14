/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap implements bo {
    static String field_c;
    private int field_b;
    static int field_d;
    static jea field_a;

    final void a(int param0, byte param1) {
        ((ap) this).field_b = param0;
        if (param1 != -119) {
            ((ap) this).a(-18, (byte) -105);
        }
    }

    public final void a(kh param0, byte param1) {
        param0.h((byte) 124);
        ((ap) this).field_b = param0.b((byte) 44, 4);
        param0.i((byte) 98);
        if (param1 != -19) {
            ((ap) this).field_b = -114;
        }
    }

    public final void a(int param0, kh param1) {
        param1.i(8);
        if (param0 != 200) {
          field_c = null;
          param1.a((byte) -125, ((ap) this).field_b, 4);
          param1.k(-1826190686);
          return;
        } else {
          param1.a((byte) -125, ((ap) this).field_b, 4);
          param1.k(-1826190686);
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = -8 % ((-38 - param0) / 53);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Location";
    }
}
