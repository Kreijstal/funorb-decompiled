/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri {
    static od field_c;
    static bi field_b;
    static String[] field_a;

    public static void a(byte param0) {
        int var1 = -117 / ((param0 + 52) / 52);
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final synchronized static long a(int param0) {
        long var1 = System.currentTimeMillis();
        if (var1 < ci.field_c) {
          im.field_d = im.field_d + (ci.field_c - var1);
        }
        ci.field_c = var1;
        if (param0 != -3) {
          field_a = (String[]) null;
        }
        return im.field_d + var1;
    }

    final static void a(rk param0, int param1, rk param2) {
        try {
          if (null != param2.field_a) {
            param2.a(true);
          }
          param2.field_a = param0.field_a;
          param2.field_h = param0;
          if (param1 != 0) {
            ri.a(-89);
          }
          param2.field_a.field_h = param2;
          param2.field_h.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ri.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        qh.c(4);
        if (fb.field_b != null) {
          fa.a(fb.field_b, -122);
        }
        hl.b((byte) -58);
        vd.b((byte) 18);
        vm.h((byte) 37);
        if (param0 <= 101) {
          return;
        }
        if (pa.a(false)) {
          vh.field_a.b(true, 1);
          tb.a(0, 125);
        }
        dc.d(115);
    }

    final static int a(String[] args, int param1, String param2, ok param3, int param4) {
        int var10 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var6Lifetime1;
        var14 = Confined.field_J ? 1 : 0;
        try {
          var5_int = param3.c(param2);
          if (param4 >= var5_int &&
            param2.indexOf("<br>") == -1) {
            args[0] = param2;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (var5_int + param4 - 1) / param4;
          param4 = var5_int / var6;
          var7 = -45 / ((-40 - param1) / 37);
          var6Lifetime1 = 0;
          var8 = 0;
          var9 = param2.length();
          for (var10 = 0; var10 < var9; var10++) {
            var11 = param2.charAt(var10);
            if (var11 == 32 ||
              45 == var11) {
              var12 = param2.substring(var8, var10 + 1).trim();
              var13 = param3.c(var12);
              if (param4 <= var13) {
                var8 = var10 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                args[incrementValue$1] = var12;
              }
            }
            if (var11 == 62 &&
              param2.regionMatches(var10 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              args[incrementValue$2] = param2.substring(var8, -3 + var10).trim();
              var8 = var10 + 1;
            }
          }
          if (var8 < var9) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            args[incrementValue$0] = param2.substring(var8, var9).trim();
          }
          stackIn_26_0 = var6Lifetime1;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("ri.A(");
          if (args == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',');
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
          throw sd.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
