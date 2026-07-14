/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pf {
    static ot field_b;
    static String field_a;
    static r field_e;
    static int[] field_d;
    static boolean field_c;

    abstract byte[] a(int param0);

    abstract void a(byte[] param0, int param1);

    final static void a(int param0, dl param1, byte param2) {
        int var3 = -84 / ((param2 - -50) / 61);
        ml var4 = or.field_d;
        var4.b(param0, (byte) -80);
        var4.a(125, 2);
        var4.a(119, 0);
        var4.a(108, param1.field_e);
    }

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        if (param0 <= 90) {
          field_a = null;
          field_d = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          return;
        }
    }

    final static void a(iw param0, int param1) {
        int var2 = 0;
        if (param1 != 542439655) {
          return;
        } else {
          pl.field_d = param0.a((byte) 81) << -365488795;
          var2 = param0.h((byte) -125);
          pl.field_d = pl.field_d + (var2 >> 1074824387);
          df.field_E = 1835008 & var2 << -964825838;
          df.field_E = df.field_E + (param0.a((byte) 81) << 931742658);
          var2 = param0.h((byte) -126);
          io.field_j = 2064384 & var2 << -134217809;
          df.field_E = df.field_E + (var2 >> 1296029030);
          io.field_j = io.field_j + (param0.h((byte) -106) << 542439655);
          var2 = param0.h((byte) -105);
          io.field_j = io.field_j + (var2 >> 361645953);
          lr.field_r = (var2 & 1) << 1124531280;
          lr.field_r = lr.field_r + param0.a((byte) 81);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<%0> and <%1> have equal game stats. <%2> wins the tournament by a random 50/50 chance.";
        field_e = new r();
        field_c = true;
    }
}
