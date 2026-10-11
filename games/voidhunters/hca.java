/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hca extends rqa {
    static llb field_o;

    hca(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ak.field_o = param0[0].a(false);
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("hca.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 < 91) {
          field_o = (llb) null;
        }
        field_o = null;
    }

    final static lkb a(byte param0, String param1) {
        lkb stackIn_6_0 = null;
        lkb stackIn_10_0 = null;
        lkb stackIn_15_0 = null;
        int stackIn_23_0 = 0;
        lkb stackIn_28_0 = null;
        lkb stackIn_42_0 = null;
        lkb stackIn_47_0 = null;
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
        String var7 = null;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          if (param0 <= 95) {
            var7 = (String) null;
            hca.a((byte) 73, (String) null);
          }
          if (0 == var2_int) {
            stackIn_6_0 = br.field_f;
            return stackIn_6_0;
          }
          if (var2_int > 64) {
            stackIn_10_0 = qw.field_j;
            return stackIn_10_0;
          }
          if (param1.charAt(0) == 34) {
            if (param1.charAt(var2_int - 1) != 34) {
              stackIn_15_0 = ira.field_b;
              return stackIn_15_0;
            }
            var3 = 0;
            for (var4 = 1; -1 + var2_int > var4; var4++) {
              var5 = param1.charAt(var4);
              if (var5 != 92) {
                if (34 == var5 &&
                  var3 == 0) {
                  stackIn_28_0 = ira.field_b;
                  return stackIn_28_0;
                }
                var3 = 0;
              } else {
                stackIn_23_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_23_0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var4Lifetime1 < var2_int; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != -1 + var2_int &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = ira.field_b;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (es.field_a.indexOf(var5Lifetime1) == -1) {
                stackIn_47_0 = ira.field_b;
                return stackIn_47_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("hca.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    static {
    }
}
