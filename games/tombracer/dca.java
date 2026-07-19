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
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int var4 = 0;
        var4 = param0 * 2;
        if (param1) {
          dca.g(-128);
          param2 = (byte)(127 + (param2 >> 17049473 & 127));
          incrementValue$4 = var4;
          var4++;
          this.field_p[incrementValue$4] = (byte)param2;
          this.field_p[var4] = (byte)param2;
          return;
        } else {
          param2 = (byte)(127 + (param2 >> 17049473 & 127));
          incrementValue$5 = var4;
          var4++;
          this.field_p[incrementValue$5] = (byte)param2;
          this.field_p[var4] = (byte)param2;
          return;
        }
    }

    final byte[] a(int param0, int param1, int param2, int param3) {
        this.field_p = new byte[2 * (param3 * param0) * param1];
        int var5 = 53 / ((77 - param2) / 36);
        this.a(param0, param1, param3, (byte) -102);
        return this.field_p;
    }

    final static String f(int param0) {
        String discarded$0 = null;
        if (param0 != 12) {
            discarded$0 = dca.f(68);
            return vc.field_q.e((byte) -76);
        }
        return vc.field_q.e((byte) -76);
    }

    public static void g(int param0) {
        field_q = null;
        if (param0 != 2) {
            field_q = (String) null;
        }
    }

    static {
        field_q = "Remove <%0> from friend list";
    }
}
