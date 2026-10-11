/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    static uc field_a;
    static li field_c;
    static hl field_b;

    final static void a(byte param0, nj param1) {
        int var3 = 0;
        int var2_int = 0;
        nj var4 = null;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = stellarshard.field_B;
        try {
          var2_int = 79 / ((param0 - 16) / 36);
          if (param1.field_m == null) {
            return;
          }
          if (0 != param1.field_a ||
            0 != param1.field_i) {
            for (var3 = 0; var3 < gi.field_g; var3++) {
              var4 = ai.field_d[var3];
              if (var4.field_p == 2 &&
                var4.field_a == param1.field_a &&
                param1.field_i == var4.field_i) {
                return;
              }
            }
          }
          if (param1.field_k != null) {
          }
          vd.a(param1, -128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("ok.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static wb a(String param0, int param1) {
        wb stackIn_3_0 = null;
        wb stackIn_7_0 = null;
        wb stackIn_13_0 = null;
        int stackIn_21_0 = 0;
        wb stackIn_26_0 = null;
        wb stackIn_40_0 = null;
        wb stackIn_45_0 = null;
        Object stackIn_51_0 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
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
        var6 = stellarshard.field_B;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = uj.field_d;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_7_0 = bg.field_a;
            return stackIn_7_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_13_0 = h.field_a;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < var2_int - 1; var4++) {
              var5 = param0.charAt(var4);
              if (var5 != 92) {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = h.field_a;
                  return stackIn_26_0;
                }
                var3 = 0;
              } else {
                stackIn_21_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_21_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = h.field_a;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == vk.field_c.indexOf(var5Lifetime1)) {
                stackIn_45_0 = h.field_a;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
          }
          if (param1 == 1) {
            return null;
          }
          field_a = (uc) null;
          stackIn_51_0 = null;
          return (wb) (stackIn_51_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_54_0 = var2;
          stackIn_54_1 = new StringBuilder().append("ok.A(");
          if (param0 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_54_0), ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        if (param0 != -30) {
          return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static int a(byte param0) {
        int var1 = -110 % ((76 - param0) / 49);
        return -od.field_r + dd.field_e;
    }

    static {
        field_a = new uc();
        field_c = new li(7, 0, 1, 1);
    }
}
