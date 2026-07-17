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
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        var6 = new char[param1];
        var3 = var6;
        var4 = 0;
        L0: while (true) {
          if (param1 <= var4) {
            if (param0 != -126) {
              pt.a(54);
              return new String(var3);
            } else {
              return new String(var3);
            }
          } else {
            var6[var4] = '*';
            var4++;
            continue L0;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
