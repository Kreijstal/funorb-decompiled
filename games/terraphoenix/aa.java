/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends uf {
    int field_o;
    static ci field_j;
    int field_h;
    int field_n;
    int[] field_p;
    int field_q;
    static String field_r;
    static int field_m;
    int field_i;
    static boolean[] field_k;
    int field_l;

    public static void a() {
        field_j = null;
        field_r = null;
        field_k = null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((aa) this).field_h = param3;
            ((aa) this).field_o = param0;
            ((aa) this).field_p = param1;
            ((aa) this).field_l = param2;
            ((aa) this).field_n = param5;
            ((aa) this).field_i = param4;
            ((aa) this).field_q = param7;
            int var9_int = 22 % ((5 - param6) / 38);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "aa.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    final static nd a(int param0, int param1, int param2, int param3, int param4) {
        nd var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        var5 = (nd) (Object) r.field_Q.d(9272);
        L0: while (true) {
          if (var5 == null) {
            var5 = new nd();
            var5.field_j = param1;
            var5.field_s = param2;
            var5.field_n = param4;
            r.field_Q.a((uf) (Object) var5, -16611);
            if (param0 != 8166) {
              nd discarded$2 = aa.a(2, 40, -127, -46, 80);
              gb.a((byte) 15, var5, param3);
              return var5;
            } else {
              gb.a((byte) 15, var5, param3);
              return var5;
            }
          } else {
            if (param2 == var5.field_s) {
              return var5;
            } else {
              var5 = (nd) (Object) r.field_Q.e((byte) -119);
              continue L0;
            }
          }
        }
    }

    aa() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = " has died.";
    }
}
