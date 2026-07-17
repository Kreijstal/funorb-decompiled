/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rp {
    static vh field_d;
    static tf field_b;
    static String field_a;
    static String field_c;

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 13) {
          field_c = null;
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void a(vh param0, vh param1, int param2) {
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
            throw wm.a((Throwable) (Object) runtimeException, "rp.C(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + -36 + 41);
        }
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        Object var14 = null;
        int[] var15 = null;
        int[] var17 = null;
        int[] var18 = null;
        dd var19 = null;
        dd var20 = null;
        dd var21 = null;
        dd var22 = null;
        dd var23 = null;
        dd var24 = null;
        int[] var25 = null;
        dd var26 = null;
        dd var27 = null;
        dd var28 = null;
        dd var29 = null;
        dd var30 = null;
        dd var31 = null;
        int[] var32 = null;
        var32 = qh.field_d;
        var25 = var32;
        var18 = var25;
        var17 = var18;
        var15 = var17;
        var6 = var15;
        var7 = qh.field_l;
        if (param0 != 32450) {
          L0: {
            rp.a((byte) -47);
            var8 = qh.field_f;
            var19 = new dd(param1, -(param1 * 2) + param3);
            var19.e();
            qh.d(0, 0, param1, -(param1 * 2) + param3, param4, param5);
            var20 = new dd(param1, param1);
            var20.e();
            qh.f(0, 0, param1, param1, param4);
            var21 = new dd(16, param1);
            var21.e();
            qh.f(0, 0, 16, param1, param4);
            var22 = new dd(param1, param1);
            var22.e();
            qh.f(0, 0, param1, param1, param5);
            var23 = new dd(16, param1);
            var23.e();
            qh.f(0, 0, 16, param1, param5);
            var14 = null;
            if (param2 <= 0) {
              break L0;
            } else {
              var24 = new dd(16, 16);
              var14 = (Object) (Object) var24;
              var24.e();
              qh.f(0, 0, 16, 16, param2);
              break L0;
            }
          }
          qh.a(var32, var7, var8);
          return new dd[]{var20, var21, var20, var19, (dd) var14, var19, var22, var23, var22};
        } else {
          L1: {
            var8 = qh.field_f;
            var26 = new dd(param1, -(param1 * 2) + param3);
            var26.e();
            qh.d(0, 0, param1, -(param1 * 2) + param3, param4, param5);
            var27 = new dd(param1, param1);
            var27.e();
            qh.f(0, 0, param1, param1, param4);
            var28 = new dd(16, param1);
            var28.e();
            qh.f(0, 0, 16, param1, param4);
            var29 = new dd(param1, param1);
            var29.e();
            qh.f(0, 0, param1, param1, param5);
            var30 = new dd(16, param1);
            var30.e();
            qh.f(0, 0, 16, param1, param5);
            var14 = null;
            if (param2 <= 0) {
              break L1;
            } else {
              var31 = new dd(16, 16);
              var14 = (Object) (Object) var31;
              var31.e();
              qh.f(0, 0, 16, 16, param2);
              break L1;
            }
          }
          qh.a(var32, var7, var8);
          return new dd[]{var27, var28, var27, var26, (dd) var14, var26, var29, var30, var29};
        }
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
