/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends oh {
    static qh field_n;
    int[] field_k;
    boolean field_l;
    boolean field_j;
    static String field_o;
    static qr field_m;
    int field_h;
    static int field_i;

    public static void a(byte param0) {
        field_n = null;
        field_m = null;
        field_o = null;
        int var1 = -46 % ((param0 + 22) / 47);
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        int var4;
        if (param3 == 0 &&
          vm.field_Bb != param2) {
          qh.field_v = true;
          vm.field_Bb = param2;
          kb.a(68, param1);
        }
        if (param3 == 1 &&
          sq.field_a != param2) {
          sq.field_a = param2;
          qh.field_v = true;
          kb.a(55, param1);
        }
        var4 = 40 % ((-21 - param0) / 59);
        if (param3 == 2 &&
          ul.field_Hb != param2) {
          ul.field_Hb = param2;
          qh.field_v = true;
          kb.a(95, param1);
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (!gq.a(param1, true, -4)) {
            return false;
          }
          var2_int = 0;
          var3 = -2 / ((param0 + 7) / 59);
          while (true) {
            if (var2_int >= param1.length()) {
              return true;
            }
            if (ne.a(0, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("gb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    gb() {
        this.field_j = false;
        this.field_l = true;
    }

    static {
        field_o = "Quick Chat lobby";
    }
}
