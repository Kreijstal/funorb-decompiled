/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn {
    int field_g;
    int field_b;
    int field_a;
    int field_f;
    static int field_c;
    static String field_e;
    static String field_h;
    static int[] field_d;

    final static void a(dg param0, int param1, dg param2, int param3, int param4, int param5) {
        Object var7 = null;
        cr.field_e = param0;
        if (param5 > -80) {
          var7 = null;
          String discarded$2 = rn.a((String) null, 123, -38, (String) null);
          pr.field_d = param3;
          eb.field_d = param4;
          aj.field_a = param1;
          qn.field_a = param2;
          return;
        } else {
          pr.field_d = param3;
          eb.field_d = param4;
          aj.field_a = param1;
          qn.field_a = param2;
          return;
        }
    }

    final static qt a(int param0, int param1) {
        Object var3 = null;
        if (param0 >= -43) {
          var3 = null;
          rn.a((dg) null, 59, (dg) null, 65, 60, 35);
          return un.field_b[param1];
        } else {
          return un.field_b[param1];
        }
    }

    final static String a(String param0, int param1, int param2, String param3) {
        ml var5 = null;
        int var6 = 0;
        gg var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param3;
        if (!ef.a(var8, -9907)) {
          return kq.field_Ib;
        } else {
          if (param1 != ts.field_d) {
            return sp.field_Db;
          } else {
            var7 = fm.a(param0, 145);
            if (var7 == null) {
              return vo.a((byte) -18, jf.field_A, new String[1]);
            } else {
              var7.c((byte) -109);
              var7.f(66);
              ou.field_y = ou.field_y - 1;
              var5 = or.field_d;
              var5.b(param2, (byte) 110);
              var5.field_n = var5.field_n + 1;
              var6 = var5.field_n;
              var5.a(105, 3);
              var5.a(14190, param3);
              var5.c(62, var5.field_n + -var6);
              return null;
            }
          }
        }
    }

    final static int b(int param0, int param1) {
        Object var3 = null;
        if (param1 != 3) {
          var3 = null;
          String discarded$2 = rn.a((String) null, -48, 14, (String) null);
          return t.field_f[param0 & 2047];
        } else {
          return t.field_f[param0 & 2047];
        }
    }

    public static void a(int param0) {
        int var1 = -98 / ((12 - param0) / 59);
        field_e = null;
        field_d = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Kick <%0> from this game";
        field_h = "You must play <%1> more rated games before playing with the current options.";
    }
}
