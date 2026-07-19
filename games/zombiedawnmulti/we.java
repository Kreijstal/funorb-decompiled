/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends br {
    static th field_k;
    int field_m;
    static String[] field_n;
    static String[] field_g;
    static String field_l;
    static ja[] field_j;
    static String field_i;
    br field_h;
    uj field_f;

    public static void a(byte param0) {
        field_i = null;
        if (param0 != 103) {
            return;
        }
        field_g = null;
        field_l = null;
        field_k = null;
        field_n = null;
        field_j = null;
    }

    final static String a(byte param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4 = param2.indexOf(param1);
        L0: while (true) {
          L1: {
            L2: {
              if (-1 == var4) {
                break L2;
              } else {
                param2 = param2.substring(0, var4) + param3 + param2.substring(param1.length() + var4);
                stackOut_2_0 = param2.indexOf(param1, param3.length() + var4);
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6 != 0) {
                  break L1;
                } else {
                  var4 = stackIn_3_0;
                  if (var6 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_4_0 = -18 / ((-2 - param0) / 54);
            stackIn_5_0 = stackOut_4_0;
            break L1;
          }
          var5 = stackIn_5_0;
          return param2;
        }
    }

    we(uj param0, br param1) {
        try {
            this.field_f = param0;
            this.field_m = param0.h();
            this.field_h = param1;
            this.field_f.d(this.field_m * db.field_c + 128 >> 694414536);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "we.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new th();
        field_n = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_i = "Resilient";
        field_l = "Remove <%0> from ignore list";
    }
}
