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
        if (param0 == 13) {
          field_d = null;
          field_a = null;
          field_c = null;
          return;
        }
        field_c = (String) null;
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final static void a(vh param0, vh param1, int param2) {
        try {
          if (null == param0.field_T) {
            param0.field_T = new ko();
          }
          if (param1.field_T == null) {
            param1.field_T = new ko();
          }
          if (null == df.field_b) {
            df.field_b = new tk(64);
          }
          if (gd.field_c == null) {
            gd.field_c = new tk(64);
          }
          cf.field_k = param0.field_T;
          jq.field_c = param1.field_T;
          lq.l(-65);
          int var3_int = 107 / ((param2 - 50) / 36);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "rp.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static dd[] a(int param0, int param1, int param2, int param3, int param4, int param5) {
        dd var25 = null;
        dd var26 = null;
        dd var27 = null;
        dd var28 = null;
        dd var29 = null;
        dd var30 = null;
        dd var24 = null;
        int var8 = 0;
        Object var14 = null;
        int[] var18 = qh.field_d;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = qh.field_l;
        int var8Lifetime1;
        if (param0 == 32450) {
          var8 = qh.field_f;
          var25 = new dd(param1, -(param1 * 2) + param3);
          var25.e();
          qh.d(0, 0, param1, -(param1 * 2) + param3, param4, param5);
          var26 = new dd(param1, param1);
          var26.e();
          qh.f(0, 0, param1, param1, param4);
          var27 = new dd(16, param1);
          var27.e();
          qh.f(0, 0, 16, param1, param4);
          var28 = new dd(param1, param1);
          var28.e();
          qh.f(0, 0, param1, param1, param5);
          var29 = new dd(16, param1);
          var29.e();
          qh.f(0, 0, 16, param1, param5);
          var14 = null;
          if (param2 > 0) {
            var30 = new dd(16, 16);
            var14 = var30;
            var30.e();
            qh.f(0, 0, 16, 16, param2);
          }
          qh.a(var18, var7, var8);
          return new dd[]{var26, var27, var26, var25, (dd) (var14), var25, var28, var29, var28};
        }
        rp.a((byte) -47);
        var8Lifetime1 = qh.field_f;
        dd var19 = new dd(param1, -(param1 * 2) + param3);
        var19.e();
        qh.d(0, 0, param1, -(param1 * 2) + param3, param4, param5);
        dd var20 = new dd(param1, param1);
        var20.e();
        qh.f(0, 0, param1, param1, param4);
        dd var21 = new dd(16, param1);
        var21.e();
        qh.f(0, 0, 16, param1, param4);
        dd var22 = new dd(param1, param1);
        var22.e();
        qh.f(0, 0, param1, param1, param5);
        dd var23 = new dd(16, param1);
        var23.e();
        qh.f(0, 0, 16, param1, param5);
        var14 = null;
        if (param2 > 0) {
          var24 = new dd(16, 16);
          var14 = var24;
          var24.e();
          qh.f(0, 0, 16, 16, param2);
        }
        qh.a(var18, var7, var8Lifetime1);
        return new dd[]{var20, var21, var20, var19, (dd) (var14), var19, var22, var23, var22};
    }

    static {
        field_a = "Send private message to <%0>";
        field_b = new tf(2);
        field_c = "Waiting for graphics";
    }
}
