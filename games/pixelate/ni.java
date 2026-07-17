/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends fa {
    static ak field_s;
    static tf field_m;
    int field_r;
    int field_t;
    static String field_p;
    static boolean[] field_o;
    int field_k;
    int field_n;
    ni field_l;
    static int field_q;
    int field_u;

    public static void a(byte param0) {
        field_p = null;
        field_o = null;
        field_s = null;
        field_m = null;
    }

    final static um a(int param0, int param1) {
        um var2 = new um();
        bq.field_a.a(22125, (fa) (Object) var2);
        sd.a(true, param0);
        int var3 = 31;
        return var2;
    }

    final static void a(tf param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, jl param8, int param9, int param10) {
        try {
            cl.field_d = param2;
            bl.field_c = param3;
            mk.field_d = param0;
            i.field_l = param1;
            r.field_a = param7;
            vp.field_Lb = param9;
            if (param5) {
                ni.a(88);
            }
            aq.field_a = param6;
            mp.field_f = param4;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ni.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + (param8 != null ? "{...}" : "null") + 44 + param9 + 44 + param10 + 41);
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        L0: {
          oc.field_H[5].a(ug.field_n, (byte) -24);
          oc.field_H[6].a(lm.field_s, (byte) -24);
          oc.field_H[8].a(db.field_T, (byte) -24);
          if (!gq.d(121)) {
            oc.field_H[1].a(oj.field_N, (byte) -24);
            oc.field_H[2].a(vp.field_Sb, (byte) -24);
            oc.field_H[4].a(ng.field_m, (byte) -24);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -31470) {
          var2 = null;
          ni.a((tf) null, -53, -40, -46, -15, true, 64, 51, (jl) null, -14, -74);
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) - -(-715827883 & param1 >>> 1);
        param1 = (param1 >>> 2 & -214748365) + (858993459 & param1);
        param1 = (param1 >>> 4) + param1 & 252645135;
        param1 = param1 + (param1 >>> 8);
        if (param0 > -37) {
          return 116;
        } else {
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
    }

    ni(int param0, int param1, int param2, int param3, int param4) {
        ((ni) this).field_u = param4;
        ((ni) this).field_r = param2;
        ((ni) this).field_n = param0;
        ((ni) this).field_k = param1;
        ((ni) this).field_t = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Remove <%0> from friend list";
    }
}
