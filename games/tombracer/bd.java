/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends vg {
    int field_f;
    int field_m;
    int field_k;
    int field_n;
    int field_h;
    static nh field_i;
    int[] field_g;
    static String field_j;
    int field_l;

    final static hra a(int param0, String param1) {
        hra stackIn_4_0 = null;
        hra stackIn_7_0 = null;
        hra stackIn_11_0 = null;
        int stackIn_20_0 = 0;
        hra stackIn_24_0 = null;
        hra stackIn_38_0 = null;
        hra stackIn_42_0 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = param1.length();
          if (~var2_int == param0) {
            stackIn_4_0 = is.field_wb;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = rg.field_A;
            return stackIn_7_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_11_0 = fb.field_c;
              return stackIn_11_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param1.charAt(var4);
              if (var5 == 92) {
                stackIn_20_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_20_0;
              } else {
                if (34 == var5 &&
                  var3 == 0) {
                  stackIn_24_0 = fb.field_c;
                  return stackIn_24_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_38_0 = fb.field_c;
                return stackIn_38_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (tl.field_p.indexOf(var5Lifetime1) == -1) {
                stackIn_42_0 = fb.field_c;
                return stackIn_42_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_48_0 = var2;
          stackIn_48_1 = new StringBuilder().append("bd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 <= 61) {
          field_i = (nh) null;
        }
        field_j = null;
    }

    final void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
          this.field_m = param0;
          this.field_k = param4;
          this.field_g = param1;
          this.field_f = param7;
          this.field_h = param3;
          this.field_n = param5;
          if (param2 < 113) {
            bd.a(-51);
          }
          this.field_l = param6;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bd.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    bd() {
    }

    static {
        field_j = "Bonus";
    }
}
