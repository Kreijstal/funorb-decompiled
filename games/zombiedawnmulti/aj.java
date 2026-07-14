/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ae {
    static String field_l;
    static int field_j;
    static String field_i;
    private int field_k;

    final void a(int param0, qd param1) {
        if (param0 != 0) {
            return;
        }
        param1.b(((aj) this).field_k, 10);
    }

    final static void a(pd param0, int param1, int param2, int param3, int param4, int param5, int param6, fm param7, int param8, int param9, int param10, int param11, pd param12, int param13, pd param14, fm param15, int param16, int param17, int param18, byte param19) {
        wn.field_u = param7;
        e.field_c = param15;
        if (param19 <= 50) {
            int discarded$0 = aj.a(-22, false, -26);
        }
        ne.c(param13, 20341, param3, param8, param11);
        cb.a(param17, param10, -8388, param0);
        wq.a(param5, param14, param1, param12, param9, false);
        ei.a(param4, 25938, param2);
        p.a(param18, param6, false, param16);
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!param1) {
          var3 = 0;
          var4 = eb.field_M;
          L0: while (true) {
            if (var3 >= eo.field_e.length) {
              return -1;
            } else {
              var5 = dn.field_a[var3];
              if ((var5 ^ -1) > -1) {
                var4 = var4 + dq.field_l;
                var3++;
                continue L0;
              } else {
                var6 = vh.a(true, -121, eo.field_e[var3]);
                var7 = aq.field_x + -(var6 >> 1221679809);
                var4 = var4 + pb.field_b;
                if (th.a(param0, -wb.field_db + var7, param2, (wb.field_db << -1400234143) + var6, var4, po.field_n - -(ne.field_tb << 1074612609), 93)) {
                  return var5;
                } else {
                  var4 = var4 + ((ne.field_tb << 2088066689) + (pb.field_b + po.field_n));
                  var3++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return 122;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (!param1) {
            ((aj) this).a(-96, true, 85, -17);
        }
    }

    aj(int param0, int param1) {
        super(param0);
        ((aj) this).field_k = param1;
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 >= -28) {
            return;
        }
        field_l = null;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3 = -79 / ((param2 - -42) / 32);
        hl.field_a = param1;
        tn.field_z = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
        field_l = "Connection timed out. Please try using a different server.";
        field_i = "Only show private chat from my friends and opponents";
    }
}
