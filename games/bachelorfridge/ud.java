/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends td {
    static String field_q;
    static int field_p;

    public static void c(boolean param0) {
        if (param0) {
          return;
        }
        field_q = null;
    }

    final ii a(op param0, int param1) {
        int var10 = 0;
        int var11 = 0;
        ica stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        ica var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        aga var15 = null;
        iv var16 = null;
        int var17 = 0;
        aga var18 = null;
        int[][] var22 = null;
        var17 = BachelorFridge.field_y;
        try {
          var18 = this.field_h.a(25, param0);
          var4 = new ica(this.field_g, new nq(var18));
          var4.field_q = this.field_n;
          var4.field_s = this.field_k;
          if (param1 != 3) {
            field_p = -22;
          }
          var22 = var4.a(param0, 0, -95, var18);
          var6 = 17;
          var7 = 17;
          var8 = var6 - 1 >> 1;
          var9 = -1 + var7 >> 1;
          for (var10 = 0; var10 < var6; var10++) {
            for (var11 = 0; var11 < var7; var11++) {
              if (1 == var22[var10][var11]) {
                var12 = var10 - (var8 - this.field_k);
                var13 = -var9 + var11 + this.field_n;
                if (0 <= var12 &&
                  param0.field_z > var12 &&
                  0 <= var13 &&
                  var13 < param0.field_B) {
                  var14 = param0.field_a[var12][var13];
                  var15 = var14.field_l;
                  if (var15 != null) {
                    var16 = new iv(new nq(var15), false, 1, 0, 53);
                    var4.field_o.a(var16, true);
                  }
                }
              }
            }
          }
          stackIn_27_0 = var4;
          return (ii) ((Object) stackIn_27_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ud.A(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(')').toString());
        }
    }

    ud(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
          this.field_n = param3;
          this.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ud.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        wn.field_p = true;
        if (param1 < 77) {
          return;
        }
        try {
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          oc.a(param0, var2, var4, 122, var3);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ud.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_q = "Allow spectators?";
    }
}
