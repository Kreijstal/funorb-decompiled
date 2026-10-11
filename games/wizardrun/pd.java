/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pd extends mi {
    static String field_G;
    static String[] field_I;
    static o[] field_H;

    final static boolean a(String param0, byte param1, String param2) {
        String var3 = null;
        boolean stackIn_15_0 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 >= -86) {
            return true;
          }
          var3 = ag.a(param0, 1);
          if (-1 != param2.indexOf(param0)) {
            return true;
          }
          if (param2.indexOf(var3) != -1) {
            return true;
          }
          stackIn_15_0 = (param2.startsWith(param0)) || (param2.startsWith(var3)) || (param2.endsWith(param0)) || (param2.endsWith(var3));
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("pd.MA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1) {
        int var2;
        int var3;
        var3 = wizardrun.field_H;
        if (hl.field_a <= 0) {
          var2 = (e.a(-89)) ? 0 : 1;
        } else {
          if (null == oa.field_c) {
            ki.field_E = hb.a(0, 640, 0, 480, 0, ld.field_g);
          } else {
            ki.field_E = oa.field_c.c(0);
            rc.a(0, 2);
          }
          if (ki.field_E != null) {
            var2 = 2;
            jf.a(false, ki.field_E);
          } else {
            var2 = 3;
          }
        }
        if (null == oa.field_c &&
          dg.field_b) {
          le.a(param0, var2, 15991);
        }
        if (param1) {
          pd.f(-89);
        }
    }

    final static void d(boolean param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        mg var5 = null;
        int var6 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        pg var11 = null;
        mg var12 = null;
        int[] var13 = null;
        te var14 = null;
        te var15 = null;
        int[] var16 = null;
        var8 = wizardrun.field_H;
        try {
          if (param0) {
            field_I = (String[]) null;
          }
          var12 = nk.field_N;
          var2 = var12.f(255);
          if (var2 == 0) {
            var10 = mh.m(-26421);
            var16 = var10;
            var13 = var16;
            var3 = var13;
            var9 = var10;
            var4 = var9;
            var5 = var12;
            var6 = ((va) ((Object) var5)).f(255);
            for (var7 = 0; var7 < var6; var7++) {
              var9[var7] = ((va) ((Object) var5)).i(255);
            }
            var14 = (te) (bk.field_d.b((byte) 97));
            if (var14 == null) {
              ql.a(-113);
              return;
            }
            var14.field_l = var3;
            var14.field_j = var16[0];
            var14.field_i = true;
            var14.a(false);
            return;
          }
          if (var2 == 1) {
            var11 = (pg) (sf.field_j.b((byte) 123));
            if (var11 == null) {
              ql.a(-58);
              return;
            }
            var11.a(false);
          } else {
            if (var2 == 2) {
              var15 = (te) (bk.field_d.b((byte) 48));
              if (var15 == null) {
                ql.a(-34);
                return;
              }
              var15.field_l = mh.m(-26421);
              var15.field_i = true;
              var15.field_j = var15.field_l[0];
              var15.a(false);
            } else {
              rg.a((Throwable) null, "A1: " + ni.c(6), -562);
              ql.a(-109);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1), "pd.OA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, ub param4, int param5) {
        pj var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.a(param0, param1, param2, param3, param4, param5 + param5);
          var7 = tg.field_h;
          if (var7 != null &&
            this.b(param1, param3, 0, param0, param2)) {
            if (this.field_s instanceof qg) {
              ((qg) (this.field_s)).a(var7, -95, this);
              tg.field_h = null;
              return;
            }
            if (var7.field_s instanceof qg) {
              ((qg) (var7.field_s)).a(var7, -106, this);
              tg.field_h = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_9_0 = var7_ref;
          stackIn_9_1 = new StringBuilder().append("pd.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param5).append(')').toString());
        }
    }

    private pd(int param0, int param1, int param2, int param3, bf param4, ce param5, ub param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_F = param6;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "pd.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    public static void f(int param0) {
        field_I = null;
        field_G = null;
        if (param0 != -27864) {
          return;
        }
        field_H = null;
    }

    static {
        field_G = "You and your friends have not";
    }
}
