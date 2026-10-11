/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd extends RuntimeException {
    static int field_d;
    Throwable field_b;
    String field_c;
    static String field_a;
    static int field_e;

    public static void a(byte param0) {
        field_a = null;
        int var1 = 74 / ((-51 - param0) / 54);
    }

    dd(Throwable param0, String param1) {
        this.field_c = param1;
        this.field_b = param0;
    }

    final static am a(String param0, boolean param1) {
        am stackIn_3_0 = null;
        am stackIn_6_0 = null;
        am stackIn_10_0 = null;
        int stackIn_19_0 = 0;
        am stackIn_23_0 = null;
        am stackIn_36_0 = null;
        am stackIn_41_0 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
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
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_3_0 = si.field_s;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_6_0 = wk.field_f;
            return stackIn_6_0;
          }
          if (34 == param0.charAt(0)) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_10_0 = lh.field_c;
              return stackIn_10_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_19_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_19_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_23_0 = lh.field_c;
                  return stackIn_23_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = param1 ? 1 : 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_36_0 = lh.field_c;
                return stackIn_36_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (-1 == qd.field_b.indexOf(var5Lifetime1)) {
                stackIn_41_0 = lh.field_c;
                return stackIn_41_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_47_0 = var2;
          stackIn_47_1 = new StringBuilder().append("dd.B(");
          if (param0 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_47_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 != 0) {
          field_d = 21;
        }
    }

    static {
        field_a = "Passwords must be between 5 and 20 characters long";
        field_e = 0;
    }
}
