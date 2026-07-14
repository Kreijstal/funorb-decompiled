/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static int field_d;
    static String field_c;
    private static int field_a;
    static String field_b;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            Object var2 = null;
            eg discarded$0 = a.a(true, (eg) null);
        }
    }

    final static eg a(boolean param0, eg param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = Pool.field_O;
        var2 = 0;
        L0: while (true) {
          if (param1.field_Y.length <= var2) {
            if (!param0) {
              var4 = null;
              a.a((String) null, false, false, -0.28095385432243347f);
              jf.a(param1, (byte) 38);
              param1.a();
              return param1;
            } else {
              jf.a(param1, (byte) 38);
              param1.a();
              return param1;
            }
          } else {
            param1.field_Y[var2] = -param1.field_Y[var2];
            var2++;
            continue L0;
          }
        }
    }

    final static String a(byte[] param0, int param1) {
        int var2 = -3 % ((69 - param1) / 54);
        return tl.a(param0.length, -7510, param0, 0);
    }

    final static void a(String param0, boolean param1, boolean param2, float param3) {
        if (of.field_Nb == null) {
          of.field_Nb = new wa(wd.field_Ub, oa.field_d);
          wd.field_Ub.b((ei) (Object) of.field_Nb, 30000);
          of.field_Nb.a(param0, 2113632, param3, param2);
          qh.d();
          to.a((byte) -118, param1);
          return;
        } else {
          of.field_Nb.a(param0, 2113632, param3, param2);
          qh.d();
          to.a((byte) -118, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 15;
        field_c = "Players";
        field_b = "You cannot join this game - it is in progress";
        field_d = 1 << field_a;
    }
}
