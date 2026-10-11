/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah {
    static String field_a;

    public static void b(byte param0) {
        if (param0 > -90) {
          field_a = (String) null;
        }
        field_a = null;
    }

    final static tf a(String param0, byte param1) {
        tf stackIn_4_0 = null;
        tf stackIn_8_0 = null;
        tf stackIn_14_0 = null;
        int stackIn_22_0 = 0;
        tf stackIn_27_0 = null;
        tf stackIn_33_0 = null;
        tf stackIn_42_0 = null;
        tf stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
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
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = w.field_k;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = vi.field_l;
            return stackIn_8_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(var2_int - 1) != 34) {
              stackIn_14_0 = ll.field_a;
              return stackIn_14_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (var5 != 92) {
                if (34 == var5 &&
                  var3 == 0) {
                  stackIn_27_0 = ll.field_a;
                  return stackIn_27_0;
                }
                var3 = 0;
              } else {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          var4Lifetime1 = 0;
          if (param1 != 111) {
            stackIn_33_0 = (tf) null;
            return stackIn_33_0;
          }
          while (var4Lifetime1 < var2_int) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param0.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (var4Lifetime1 != 0 &&
                var2_int - 1 != var4Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = ll.field_a;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (hf.field_c.indexOf(var5Lifetime1) == -1) {
                stackIn_47_0 = ll.field_a;
                return stackIn_47_0;
              }
              var3Lifetime1 = 0;
            }
            var4Lifetime1++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("ah.B(");
          if (param0 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var3_int = 0;
          if (!param2) {
            stackIn_3_0 = -15;
            return stackIn_3_0;
          }
          while (param0 > 0) {
            var3_int = var3_int << 1 | param1 & 1;
            param0--;
            param1 = param1 >>> 1;
          }
          stackIn_7_0 = var3_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "ah.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static aj[] a(byte param0) {
        if (param0 != -55) {
          return (aj[]) null;
        }
        return new aj[]{gj.field_w, q.field_d, rk.field_n, vb.field_l, rk.field_d, uj.field_c, rj.field_b, li.field_R, nl.field_b, he.field_c, w.field_n, vf.field_m, fb.field_l, qb.field_d};
    }

    static {
        field_a = "Username: ";
    }
}
