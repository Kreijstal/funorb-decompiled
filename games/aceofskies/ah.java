/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends qd {
    static String field_r;
    static int field_s;
    private byte[] field_q;

    final void b(int param0, int param1, byte param2) {
        int var4 = 0;
        param2 = (byte)(127 + (127 & param2 >> 1512442177));
        if (param0 != 255) {
          field_r = (String) null;
          var4 = param1 * 2;
          var4++;
          ((ah) this).field_q[var4] = (byte)param2;
          ((ah) this).field_q[var4] = (byte)param2;
          return;
        } else {
          var4 = param1 * 2;
          var4++;
          ((ah) this).field_q[var4] = (byte)param2;
          ((ah) this).field_q[var4] = (byte)param2;
          return;
        }
    }

    ah() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    public static void c(byte param0) {
        field_r = null;
        if (param0 != -27) {
            ah.c((byte) 54);
        }
    }

    final byte[] a(int param0, int param1, int param2, byte param3) {
        ((ah) this).field_q = new byte[param0 * (param2 * param1) * 2];
        ((ah) this).a(true, param1, param0, param2);
        int var5 = 29 / ((60 - param3) / 42);
        return ((ah) this).field_q;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Email (Login):";
    }
}
