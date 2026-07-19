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

    public static void a(boolean param0) {
        field_j = null;
        field_r = null;
        if (!param0) {
            field_j = (ci) null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.field_h = param3;
            this.field_o = param0;
            this.field_p = param1;
            this.field_l = param2;
            this.field_n = param5;
            this.field_i = param4;
            this.field_q = param7;
            int var9_int = 22 % ((5 - param6) / 38);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "aa.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static nd a(int param0, int param1, int param2, int param3, int param4) {
        nd discarded$2 = null;
        nd var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        var5 = (nd) ((Object) r.field_Q.d(9272));
        L0: while (true) {
          if (var5 == null) {
            var5 = new nd();
            var5.field_j = param1;
            var5.field_s = param2;
            var5.field_n = param4;
            r.field_Q.a(var5, -16611);
            if (param0 != 8166) {
              discarded$2 = aa.a(2, 40, -127, -46, 80);
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
              var5 = (nd) ((Object) r.field_Q.e((byte) -119));
              continue L0;
            }
          }
        }
    }

    aa() {
    }

    static {
        field_r = " has died.";
    }
}
