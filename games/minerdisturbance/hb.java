/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb {
    static volatile int field_b;
    private bj field_d;
    static bj field_e;
    private bj field_a;
    private hk field_c;

    final fc a(int param0, int param1) {
        fc var3 = null;
        byte[] var4 = null;
        var3 = (fc) ((hb) this).field_c.a((long)param1, (byte) 95);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (param1 < 32768) {
              var4 = ((hb) this).field_a.a(false, 1, param1);
              break L0;
            } else {
              var4 = ((hb) this).field_d.a(false, 1, 32767 & param1);
              break L0;
            }
          }
          L1: {
            var3 = new fc();
            if (var4 != null) {
              var3.a(param0 + 7307, new sb(var4));
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (32768 <= param1) {
              var3.g(60);
              break L2;
            } else {
              break L2;
            }
          }
          ((hb) this).field_c.a(6565, (long)param1, (Object) (Object) var3);
          if (param0 != 25461) {
            return null;
          } else {
            return var3;
          }
        }
    }

    public static void a() {
        field_e = null;
        int var1 = 48;
    }

    final static ea a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        ea var6 = new ea(param0, param0);
        ea var3 = var6;
        for (var4 = 0; var3.field_D.length > var4; var4++) {
            var6.field_D[var4] = param2;
        }
        return var3;
    }

    private hb() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
