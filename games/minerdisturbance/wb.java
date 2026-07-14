/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends pi {
    int[] field_r;
    int field_u;
    int field_v;
    int field_t;
    int field_s;
    static int field_p;
    int field_o;
    int field_n;
    static String field_q;
    int field_w;

    final static int a(int param0, boolean param1, int param2) {
        int var4 = MinerDisturbance.field_ab;
        if (!param1) {
            Object var5 = null;
            byte[] discarded$0 = wb.a(17, -87, (byte[]) null, 80);
        }
        int var3 = 0;
        while ((param2 ^ -1) < -1) {
            var3 = param0 & 1 | var3 << -1810155999;
            param2--;
            param0 = param0 >>> 1;
        }
        return var3;
    }

    public static void a(int param0) {
        field_q = null;
        if (param0 != 0) {
            field_q = null;
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        qm var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = MinerDisturbance.field_ab;
          if (-1 <= (param1 ^ -1)) {
            var4 = param2;
            break L0;
          } else {
            var8 = new byte[param0];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param0) {
                break L0;
              } else {
                var8[var5_int] = param2[param1 + var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        var5 = new qm();
        if (param3 == 18738) {
          var5.a((byte) -29);
          var5.a(var4, -21816, (long)(8 * param0));
          var6 = new byte[64];
          var5.a(0, var6, 8);
          return var6;
        } else {
          return null;
        }
    }

    wb(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        ((wb) this).field_r = param6;
        ((wb) this).field_v = param0;
        ((wb) this).field_o = param3;
        ((wb) this).field_u = param2;
        nf.field_c = nf.field_c + 1;
        ((wb) this).field_w = 65535 & nf.field_c;
        ((wb) this).field_t = param4;
        ((wb) this).field_s = param1;
        ((wb) this).field_n = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "To server list";
    }
}
