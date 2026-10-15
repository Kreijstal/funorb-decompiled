/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static int field_a;
    static mh field_b;
    static String field_d;
    static jp[] field_c;

    final static kn b(int param0) {
        int var1_int = 0;
        kn var2 = null;
        int var3 = 0;
        kn stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = param0;
          while (true) {
            var2 = pj.field_c.a(var1_int, (byte) -97);
            if (!var2.field_A) {
              var1_int++;
              continue;
            }
            break;
          }
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final static int a(eg param0, sp param1, int param2, int param3) {
        int var7 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var6Lifetime1;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param0 != null &&
            param0.field_n != null &&
            param1 != null &&
            param1.field_o == param0.field_l) {
            var4_int = param1.field_i.length;
            var5 = param0.field_n[param3].length / var4_int;
            for (var6 = 0; var5 > var6; var6++) {
              boolean decompiledFrameCompleted0 = true;
              if (param1.field_p == param0.field_r[param3][var6] &&
                ci.a(param0.field_i[param3][var6], -46)) {
                for (var7 = 0; var7 < var4_int; var7++) {
                  if (param1.field_i[var7] != param0.field_n[param3][var7 + var4_int * var6]) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_18_0 = var6;
                  return stackIn_18_0;
                }
              }
            }
            var6Lifetime1 = 127 / ((param2 - 59) / 36);
            stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          stackIn_7_0 = -1;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("gj.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -27956) {
          field_c = (jp[]) null;
        }
        field_d = null;
        field_c = null;
    }

    static {
        field_d = "Tutorial: <%0>";
    }
}
