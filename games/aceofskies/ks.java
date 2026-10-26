/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ks {
    static IntrusiveDeque field_d;
    static String field_c;
    static boolean field_b;
    static int field_a;

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 109) {
          return;
        }
        field_c = null;
    }

    final static ej a(int param0, int param1) {
        int var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        ej[] var5 = sf.d((byte) 112);
        ej[] var2 = var5;
        for (int var3 = 0; var5.length > var3; var3++) {
          if (~var5[var3].field_d == ~param0) {
            return var5[var3];
          }
        }
        if (param1 == -28228) {
          return null;
        }
        ks.a(-73, -126);
        return null;
    }

    static {
        field_d = new IntrusiveDeque();
        field_c = "Loading fonts";
        field_b = true;
    }
}
