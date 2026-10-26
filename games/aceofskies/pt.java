/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pt {
    static rk field_b;
    static int field_a;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_a = 24;
        }
    }

    final static String a(byte param0, int param1, char param2) {
        int var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        for (int var4 = 0; param1 > var4; var4++) {
          var6[var4] = param2;
        }
        if (param0 == -126) {
          return new String(var3);
        }
        pt.a(54);
        return new String(var3);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
