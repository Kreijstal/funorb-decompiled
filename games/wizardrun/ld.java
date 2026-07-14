/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static o field_d;
    static String[] field_c;
    static String field_f;
    static String field_a;
    static si field_e;
    static int[] field_b;
    static vh field_g;

    public static void a(byte param0) {
        field_g = null;
        field_c = null;
        if (param0 != -122) {
          ld.a((byte) 91);
          field_b = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_d = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static h a(int param0, int param1, kl param2) {
        byte[] var3 = null;
        Object var4 = null;
        byte[] var5 = null;
        if (param0 > 26) {
          var5 = param2.a((byte) -128, param1);
          var3 = var5;
          if (var5 == null) {
            return null;
          } else {
            return new h(var5);
          }
        } else {
          var4 = null;
          h discarded$2 = ld.a(91, -108, (kl) null);
          var5 = param2.a((byte) -128, param1);
          var3 = var5;
          if (var5 == null) {
            return null;
          } else {
            return new h(var5);
          }
        }
    }

    final static void a(int param0, sc param1, int param2) {
        mg var3 = n.field_b;
        var3.c((byte) 87, param0);
        var3.b((byte) 11, 2);
        var3.b((byte) 11, param2);
        var3.b((byte) 11, param1.field_k);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_a = "when the last enemy is killed.";
        field_b = new int[4];
        field_c = new String[255];
    }
}
