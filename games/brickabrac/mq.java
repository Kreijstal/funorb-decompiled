/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq {
    static String field_h;
    static String field_a;
    static String field_c;
    static String field_i;
    static String field_d;
    static tp[] field_b;
    static int field_g;
    static tg field_e;
    static jp field_f;

    public static void b(int param0) {
        field_i = null;
        field_f = null;
        field_c = null;
        field_d = null;
        field_h = null;
        field_a = null;
        if (param0 != -30593) {
          return;
        } else {
          field_b = null;
          field_e = null;
          return;
        }
    }

    final static void a(int param0) {
        if (param0 != 4252) {
            return;
        }
        ng.field_b = 0;
        di.a((byte) -114);
    }

    final static nc a(byte param0, mf param1, wq param2, int param3, int param4, int param5, int param6) {
        int var9 = 0;
        wk var10 = null;
        int var11 = BrickABrac.field_J ? 1 : 0;
        nc var12 = new nc(param4, param6, param5);
        nc var13 = var12;
        var13.field_i = param2.i(65280);
        int var8 = param2.i(65280);
        var13.field_j = new byte[var8][];
        var13.field_c = new wk[var8];
        for (var9 = 0; var8 > var9; var9++) {
            var10 = ai.a((byte) -12, param2);
            var12.field_c[var10.field_n] = var10;
            var13.field_j[var10.field_n] = param1.a(var10.field_q, param3, 4);
        }
        var9 = -74 % ((7 - param0) / 52);
        return var13;
    }

    final static boolean a(byte param0) {
        int var1 = 25 % ((param0 - 55) / 54);
        return uo.a(uc.e((byte) -95), (byte) 14);
    }

    final static mh c(int param0) {
        if (param0 != 0) {
            return null;
        }
        return fo.field_b.field_Rb;
    }

    final static al a(byte param0, int param1) {
        al var2 = null;
        if (param0 <= 37) {
          al discarded$2 = mq.a((byte) -67, -39);
          var2 = new al();
          ej.field_F.a((nm) (Object) var2, (byte) 3);
          ma.b((byte) -112, param1);
          return var2;
        } else {
          var2 = new al();
          ej.field_F.a((nm) (Object) var2, (byte) 3);
          ma.b((byte) -112, param1);
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "(<%0> players want to join)";
        field_a = "Please log in to access this feature.";
        field_i = "Tutorial";
        field_c = "Orb points: ";
        field_d = "End Game";
    }
}
