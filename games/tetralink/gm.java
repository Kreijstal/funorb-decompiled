/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm {
    static boolean[] field_g;
    static int[] field_b;
    static String field_c;
    static String field_f;
    static je field_a;
    static hl field_d;
    static of field_h;
    static String field_e;

    final static void a(boolean param0, byte param1, oh[] param2, int param3, oh[] param4, int param5, int param6, jb param7, int param8, String param9, boolean param10, int param11, int param12, int param13, int param14) {
        try {
          bo.a(param3, param6, fl.field_b, param14, -1, param7, ng.field_D, param11, new ve(param2), nm.field_o, uj.field_w, param11, new ve(param4), param12, param7, param5, wa.field_d, param8, param8, bm.field_n);
          je.a(param0, param13, param9, param10, -1381732671);
          if (param1 != 33) {
            field_c = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "gm.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + (param9 != null ? "{...}" : "null") + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ',' + param14 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != 0) {
          return;
        }
        field_g = null;
        field_d = null;
        field_c = null;
    }

    final static le a(int param0, hl param1, qa param2, hl param3, hl param4) {
        int var15 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        le stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        le[] var12 = null;
        int var13 = 0;
        qa var14_ref_qa = null;
        int var14 = 0;
        int var16 = 0;
        j var17 = null;
        int var18 = 0;
        int[] var19 = null;
        char[] var20 = null;
        int[] var21 = null;
        char[] var22 = null;
        int var13Lifetime1;
        var18 = TetraLink.field_J;
        try {
          if (param2 == null) {
            stackIn_3_0 = null;
            return (le) (stackIn_3_0);
          }
          if (null == param2.field_z) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = param2.field_z.length;
          }
          var5_int = stackIn_7_0;
          if (null != param2.field_t) {
            stackIn_10_0 = param2.field_t.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var6 + var5_int;
          var8 = new String[var7];
          var11 = 38 % ((-64 - param0) / 50);
          var22 = new char[var7];
          var20 = var22;
          var9 = var20;
          var21 = new int[var7];
          var19 = var21;
          var10 = var19;
          var12 = new le[var7];
          if (null != param2.field_z) {
            for (var13 = 0; var13 < param2.field_z.length; var13++) {
              var14_ref_qa = n.field_U.a(param2.field_z[var13], true);
              var8[var13] = var14_ref_qa.field_y;
              var9[var13] = param2.field_D[var13];
              var12[var13] = gm.a(-128, param1, var14_ref_qa, param3, param4);
            }
          }
          if (null != param2.field_t) {
            var13Lifetime1 = var5_int;
            var14 = 49;
            for (var15 = 0; var15 < param2.field_t.length; var15++) {
              var16 = param2.field_t[var15];
              if (var16 == -1) {
                var8[var13Lifetime1 + var15] = vb.field_m;
                var9[var15 + var13Lifetime1] = param2.field_u[var15];
                var10[var13Lifetime1 + var15] = param2.field_t[var15];
              } else {
                var17 = eh.field_p.a(var16, -126);
                var8[var15 + var13Lifetime1] = var17.h(-68);
                var9[var13Lifetime1 + var15] = param2.field_u[var15];
                if (var9[var13Lifetime1 + var15] <= 0) {
                  var14 = (char)(var14 + 1);
                  var9[var13Lifetime1 + var15] = (char)var14;
                }
                var10[var13Lifetime1 + var15] = param2.field_t[var15];
              }
            }
          }
          stackIn_26_0 = new le(0L, param3, param1, param4, var12, var21, var8, var22);
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("gm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param3 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param4 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    static {
        field_c = "Disruptive behaviour";
        field_f = "Clan";
        field_a = new je();
        field_h = new of(1);
        field_e = "Type your password again to make sure it's correct";
    }
}
