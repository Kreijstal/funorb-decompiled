/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wa extends vh {
    static String field_q;
    static int field_s;
    static volatile int field_p;
    static String field_t;
    static bg[] field_r;

    public static void c(int param0) {
        field_t = null;
        field_q = null;
        field_r = null;
        if (param0 != 21834) {
          field_q = (String) null;
        }
    }

    final static void a(ci param0, byte param1, String param2) {
        try {
          fa.field_d = param0;
          if (param1 < 19) {
            wa.c(-64);
          }
          jh.field_p = param2;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "wa.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var17 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15 = null;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        ci var21 = null;
        int[] var22 = null;
        int[] var25 = null;
        int[] var29 = null;
        int[] var30 = null;
        int var16Lifetime1;
        var19 = Terraphoenix.field_V;
        try {
          if (l.field_b > param1) {
            param7 = param7 - (l.field_b - param1);
            param1 = l.field_b;
          }
          if (l.field_d > param5) {
            param2 = param2 - (l.field_d - param5);
            param5 = l.field_d;
          }
          if (param1 + param7 > l.field_f) {
            param7 = -param1 + l.field_f;
          }
          if (param5 + param2 > l.field_c) {
            param2 = -param5 + l.field_c;
          }
          if (param7 > 0 &&
            param2 > 0) {
            var21 = param0.d();
            var30 = l.field_i;
            var10 = l.field_k;
            var11 = l.field_j;
            var29 = new int[4];
            l.b(var29);
            param0.a();
            l.i(var29[0], var29[1], var29[2], var29[3]);
            var13 = param1 + param0.field_r * param5;
            var14 = -param7 + param0.field_r;
            var25 = var21.field_z;
            var22 = var25;
            var15 = var22;
            for (var16 = param5; param5 + param2 > var16; var16++) {
              for (var17 = param1; param1 + param7 > var17; var17++) {
                var18 = var25[var13];
                if (0 != var18 && (var17 > 0 &&
                  0 == var15[-1 + var13] ||
                  var16 > 0 &&
                  var15[var13 - param0.field_r] == 0 ||
                  var17 < -1 + param0.field_r &&
                  var15[1 + var13] == 0 ||
                  !(param0.field_t - 1 <= var16) &&
                  0 == var15[var13 + param0.field_r])) {
                  l.e(var17, var16, param6, param4);
                }
                var13++;
              }
              var13 = var13 + var14;
            }
            var16Lifetime1 = 60 / ((param3 - 1) / 51);
            var21.b(-param0.field_p, -param0.field_v);
            l.a(var30, var10, var11);
            l.a(var29);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_42_0 = var8;
          stackIn_42_1 = new StringBuilder().append("wa.L(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static String a(byte param0, String param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var5 = 0;
        String var6 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          var2_int = param1.length();
          var3 = new char[var2_int];
          if (param0 != -117) {
            var6 = (String) null;
            wa.a((ci) null, (byte) 117, (String) null);
          }
          for (var4 = 0; var4 < var2_int; var4++) {
            var3[-1 + (var2_int - var4)] = param1.charAt(var4);
          }
          stackIn_7_0 = new String(var3);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("wa.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    wa() {
    }

    static {
        field_q = "OM-4 FG";
        field_s = 65280;
        field_p = 0;
    }
}
