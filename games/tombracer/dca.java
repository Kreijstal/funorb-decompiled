/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dca extends or {
    private byte[] field_p;
    static String field_q;
    static long field_o;

    dca() {
        super(12, 5, 16, 2, 2, 0.44999998807907104f);
    }

    final void a(int param0, boolean param1, byte param2) {
        int var4 = 0;
        var4 = param0 * 2;
        if (param1) {
          dca.g(-128);
          param2 = (byte)(127 + (param2 >> 1 & 127));
          int incrementValue$4 = var4;
          var4++;
          ((dca) this).field_p[incrementValue$4] = (byte)param2;
          ((dca) this).field_p[var4] = (byte)param2;
          return;
        } else {
          param2 = (byte)(127 + (param2 >> 1 & 127));
          int incrementValue$5 = var4;
          var4++;
          ((dca) this).field_p[incrementValue$5] = (byte)param2;
          ((dca) this).field_p[var4] = (byte)param2;
          return;
        }
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        ((dca) this).field_p = new byte[2 * (param3 * param0) * param1];
        int var5 = 53 / ((77 - param2) / 36);
        ((dca) this).a(param0, param1, param3, (byte) -102);
        return ((dca) this).field_p;
    }

    final static String f(int param0) {
        if (param0 != 12) {
            String discarded$0 = dca.f(68);
            return vc.field_q.e((byte) -76);
        }
        return vc.field_q.e((byte) -76);
    }

    public static void g(int param0) {
        field_q = null;
        if (param0 != 2) {
            field_q = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Remove <%0> from friend list";
    }
}
