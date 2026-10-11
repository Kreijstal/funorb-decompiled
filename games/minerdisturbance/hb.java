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
        byte[] var4 = null;
        fc var3 = (fc) (this.field_c.a((long)param1, (byte) 95));
        if (var3 != null) {
          return var3;
        }
        if (param1 >= 32768) {
          var4 = this.field_d.a(false, 1, 32767 & param1);
        } else {
          var4 = this.field_a.a(false, 1, param1);
        }
        var3 = new fc();
        if (var4 != null) {
          var3.a(param0 + 7307, new sb(var4));
        }
        if (32768 <= param1) {
          var3.g(60);
        }
        this.field_c.a(6565, (long)param1, var3);
        if (param0 == 25461) {
          return var3;
        }
        return (fc) null;
    }

    public static void a(int param0) {
        field_e = null;
        int var1 = 97 / ((-10 - param0) / 39);
    }

    final static ea a(int param0, int param1, int param2) {
        ea var6 = null;
        ea var3 = null;
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param1 == 32768) {
          var6 = new ea(param0, param0);
          var3 = var6;
          for (var4 = 0; var3.field_D.length > var4; var4++) {
            var6.field_D[var4] = param2;
          }
          return var3;
        }
        return (ea) null;
    }

    private hb() throws Throwable {
        throw new Error();
    }

    static {
        field_b = 0;
    }
}
