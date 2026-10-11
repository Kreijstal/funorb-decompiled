/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dpb {
    final static String a(boolean param0, pgb param1) {
        String stackIn_3_0 = null;
        String stackIn_35_0 = null;
        Object stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        Object var3_ref = null;
        int var4 = 0;
        String var5 = null;
        String var3Lifetime1;
        Object var3_refLifetime1;
        String var3Lifetime2;
        var4 = VoidHunters.field_G;
        try {
          if (!param0) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var2 = null;
          if (param1.field_e != null) {
            var5 = param1.field_e;
            var3 = var5;
            var3Lifetime2 = var5;
            var2 = var5;
            if (1 == param1.field_c) {
              var2 = "<img=0>" + var5;
            }
            if (param1.field_c == 2) {
              var2 = "<img=1>" + (String) (var2);
              var3_ref = var2;
              var3_refLifetime1 = var2;
            }
          }
          var3Lifetime1 = "";
          if (param1.field_a != 2) {
            if (0 == param1.field_a &&
              cqb.field_e) {
              var3Lifetime1 = "[" + bib.field_e + "] ";
            }
            if (param1.field_a == 1) {
              var3Lifetime1 = "[" + isa.a(wt.field_b, new String[]{param1.field_o}, 107) + "] ";
            }
            if (param1.field_a == 4 &&
              null != vla.field_E) {
              var3Lifetime1 = "[" + vla.field_E + "] ";
            }
            if (3 == param1.field_a) {
              var3Lifetime1 = "[#" + param1.field_o + "] ";
            }
            if (!param1.field_k) {
              var3Lifetime1 = var3Lifetime1 + (String) (var2) + ": ";
            }
          } else {
            if (!param1.field_k) {
              if (0 == param1.field_f &&
                param1.field_h == 0) {
                var3Lifetime1 = isa.a(tia.field_G, new String[]{(String) (var2)}, 119);
              } else {
                var3Lifetime1 = isa.a(ejb.field_o, new String[]{(String) (var2)}, 123);
              }
            }
          }
          stackIn_35_0 = var3Lifetime1;
          return stackIn_35_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_38_0 = var2;
          stackIn_38_1 = new StringBuilder().append("dpb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw rta.a((Throwable) (stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    static {
    }
}
