/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug extends fa {
    byte[] field_r;
    int field_m;
    static int[] field_n;
    static vp field_s;
    static pb field_q;
    static uo[] field_l;
    long field_o;
    static int field_k;
    static String field_p;

    final static void a(int param0, int param1, int param2) {
        qh.field_b = param0;
        if (param2 != -26104) {
            return;
        }
        bq.field_d = param1;
    }

    final static void a(int param0) {
        String var1 = null;
        String var2 = null;
        L0: {
          if (null != wo.field_b) {
            var2 = wo.field_b;
            var1 = var2;
            rg.a(sd.a(ek.field_d, 113, new String[]{var2}), false);
            wo.field_b = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 2586) {
          ug.a(20);
          return;
        } else {
          return;
        }
    }

    ug(long param0, int param1, byte[] param2) {
        try {
            this.field_o = param0;
            this.field_m = param1;
            this.field_r = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ug.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_l = null;
        if (param0 != 24857) {
          field_p = (String) null;
          field_p = null;
          field_s = null;
          field_n = null;
          field_q = null;
          return;
        } else {
          field_p = null;
          field_s = null;
          field_n = null;
          field_q = null;
          return;
        }
    }

    static {
        field_n = new int[]{14, 15, 16, 8};
        field_p = "<%0> is not on your ignore list.";
    }
}
