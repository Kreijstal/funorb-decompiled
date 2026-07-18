/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    static vh field_d;
    static tf field_b;
    static String field_a;
    static String field_c;

    public static void a() {
        field_b = null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a(vh param0, vh param1) {
        try {
            if (!(null != param0.field_T)) {
                param0.field_T = new ko();
            }
            if (param1.field_T == null) {
                param1.field_T = new ko();
            }
            if (null == df.field_b) {
                df.field_b = new tk(64);
            }
            if (!(gd.field_c != null)) {
                gd.field_c = new tk(64);
            }
            cf.field_k = param0.field_T;
            jq.field_c = param1.field_T;
            lq.l(-65);
            int var3_int = -53;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "rp.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + -36 + ')');
        }
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        dd var9 = null;
        dd var10 = null;
        dd var11 = null;
        dd var12 = null;
        dd var13 = null;
        Object var14 = null;
        int[] var15 = null;
        dd var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var20 = qh.field_d;
          var19 = var20;
          var18 = var19;
          var17 = var18;
          var15 = var17;
          var6 = var15;
          var7 = qh.field_l;
          var8 = qh.field_f;
          var9 = new dd(3, -6 + param3);
          var9.e();
          qh.d(0, 0, 3, -6 + param3, param4, param5);
          var10 = new dd(3, 3);
          var10.e();
          qh.f(0, 0, 3, 3, param4);
          var11 = new dd(16, 3);
          var11.e();
          qh.f(0, 0, 16, 3, param4);
          var12 = new dd(3, 3);
          var12.e();
          qh.f(0, 0, 3, 3, param5);
          var13 = new dd(16, 3);
          var13.e();
          qh.f(0, 0, 16, 3, param5);
          var14 = null;
          if (param2 <= 0) {
            break L0;
          } else {
            var16 = new dd(16, 16);
            var14 = (Object) (Object) var16;
            var16.e();
            qh.f(0, 0, 16, 16, param2);
            break L0;
          }
        }
        qh.a(var20, var7, var8);
        return new dd[]{var10, var11, var10, var9, (dd) var14, var9, var12, var13, var12};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Send private message to <%0>";
        field_b = new tf(2);
        field_c = "Waiting for graphics";
    }
}
