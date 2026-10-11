/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class moa {
    static int field_b;
    static int field_a;

    final static String a(gqa param0, int param1) {
        String stackIn_33_0 = null;
        String stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2 = null;
          if (param0.field_g != null) {
            var5 = param0.field_g;
            var2 = var5;
            var2 = var5;
            var2 = var5;
            if (param0.field_n == 1) {
              var2 = "<img=0>" + var5;
            }
            if (param0.field_n == 2) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          var3 = "";
          if (param0.field_d == 2) {
            if (!param0.field_m) {
              if (param0.field_c == 0 &&
                param0.field_o == 0) {
                var3 = gl.$cfr$intArgs$a$53ce4ab4c593(114, wha.field_G, new String[]{(String) (var2)});
              } else {
                var3 = gl.$cfr$intArgs$a$53ce4ab4c593(112, li.field_a, new String[]{(String) (var2)});
              }
            }
          } else {
            if (param0.field_d == 0 &&
              kq.field_c) {
              var3 = "[" + cla.field_o + "] ";
            }
            if (param0.field_d == 1) {
              var3 = "[" + gl.$cfr$intArgs$a$53ce4ab4c593(96, jea.field_nb, new String[]{param0.field_b}) + "] ";
            }
            if (4 == param0.field_d &&
              null != tla.field_f) {
              var3 = "[" + tla.field_f + "] ";
            }
            if (param0.field_d == 3) {
              var3 = "[#" + param0.field_b + "] ";
            }
            if (!param0.field_m) {
              var3 = var3 + (String) (var2) + ": ";
            }
          }
          if (param1 >= 78) {
            stackIn_35_0 = var3;
            return stackIn_35_0;
          }
          stackIn_33_0 = (String) null;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("moa.A(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw tba.a((Throwable) (stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = 0;
        field_b = -1;
    }
}
