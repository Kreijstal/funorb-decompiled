/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rkb extends rqa {
    static int field_o;

    rkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, tv param1, faa param2, int param3) {
        param2.h(24335, param3);
        param2.field_e = param2.field_e + 1;
        if (param0 != 0) {
            field_o = -13;
        }
        int var4 = param2.field_e;
        param2.q(-127);
        param1.b(param2, -112);
        param2.r(32712);
        param2.e(param2.field_e + -var4, -129);
    }

    final nc a(nc[] param0, int param1) {
        hba.field_o = param0[0].a(123);
        if (param1 >= -119) {
            field_o = 30;
        }
        return new nc((Object) (Object) "void");
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = VoidHunters.field_G;
          var3 = 0;
          var4 = nl.field_m;
          if (param1 == 3841) {
            break L0;
          } else {
            field_o = -93;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 >= db.field_o.length) {
            return -1;
          } else {
            var5 = aka.field_o[var3];
            if (-1 < (var5 ^ -1)) {
              var4 = var4 + whb.field_a;
              var3++;
              continue L1;
            } else {
              var6 = lsa.a(db.field_o[var3], -118, true);
              var4 = var4 + pva.field_g;
              var7 = -(var6 >> 1659942209) + alb.field_b;
              if (cta.a(var4, (ih.field_e << -1624782207) + var6, (hwa.field_q << 1978687105) + tba.field_o, param2, (byte) -65, -ih.field_e + var7, param0)) {
                return var5;
              } else {
                var4 = var4 + (tba.field_o + pva.field_g + (hwa.field_q << 1765358017));
                var3++;
                continue L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 8;
    }
}
