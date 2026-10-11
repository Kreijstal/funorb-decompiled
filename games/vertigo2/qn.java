/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends li {
    int field_n;
    static lg field_p;
    static String field_z;
    static cr field_s;
    static String field_o;
    static String field_v;
    static boolean field_q;
    static int field_u;
    static v field_y;
    static int field_w;
    static er field_r;
    static String[] field_t;
    int field_x;

    public static void a(byte param0) {
        if (param0 > 42) {
          field_t = null;
          field_o = null;
          field_v = null;
          field_y = null;
          field_r = null;
          field_p = null;
          field_z = null;
          field_s = null;
          return;
        }
    }

    final static wp a(String param0, int param1) {
        wp stackIn_4_0 = null;
        wp stackIn_8_0 = null;
        wp stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        wp stackIn_26_0 = null;
        wp stackIn_40_0 = null;
        wp stackIn_45_0 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
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
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          if (0 == var2_int) {
            stackIn_4_0 = ab.field_a;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = cg.field_a;
            return stackIn_8_0;
          }
          if (param0.charAt(param1) == 34) {
            if (34 != param0.charAt(var2_int - 1)) {
              stackIn_13_0 = bp.field_A;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param0.charAt(var4);
              if (92 == var5) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = bp.field_A;
                  return stackIn_26_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
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
                stackIn_40_0 = bp.field_A;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (gi.field_q.indexOf(var5Lifetime1) == -1) {
                stackIn_45_0 = bp.field_A;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_52_0 = var2;
          stackIn_52_1 = new StringBuilder().append("qn.A(");
          if (param0 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_52_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param1).append(')').toString());
        }
    }

    private qn() throws Throwable {
        throw new Error();
    }

    static {
        field_z = "This is your RuneScape clan if you have one.";
        field_v = "Press F10 to open Quick Chat.";
        field_o = "<%0> has not yet unlocked this option for use.";
        field_t = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
        field_y = null;
    }
}
