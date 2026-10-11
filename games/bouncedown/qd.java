/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static boolean field_a;
    static int field_b;

    final static jb a(int param0, int param1, si param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        jb var7 = null;
        java.awt.Frame var8 = null;
        jb stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = ed.a(4147, param2, param4, param0, param1, param5);
          var6 = var8;
          if (param3 < 121) {
            field_a = false;
          }
          if (var8 == null) {
            return null;
          }
          var7 = new jb();
          var7.field_e = var8;
          var7.field_e.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param1, param5);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("qd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static lj a(String param0, int param1) {
        lj stackIn_4_0 = null;
        lj stackIn_8_0 = null;
        lj stackIn_13_0 = null;
        int stackIn_22_0 = 0;
        lj stackIn_26_0 = null;
        lj stackIn_40_0 = null;
        lj stackIn_45_0 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = Bounce.field_N;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_4_0 = uc.field_E;
            return stackIn_4_0;
          }
          if (var2_int > 64) {
            stackIn_8_0 = lk.field_t;
            return stackIn_8_0;
          }
          if (param0.charAt(0) == 34) {
            if (param0.charAt(-1 + var2_int) != 34) {
              stackIn_13_0 = mh.field_R;
              return stackIn_13_0;
            }
            var3 = 0;
            for (var4 = 1; var4 < -1 + var2_int; var4++) {
              var5 = param0.charAt(var4);
              if (var5 == 92) {
                stackIn_22_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_22_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_26_0 = mh.field_R;
                  return stackIn_26_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          var4Lifetime1 = 53 / ((param1 + 7) / 38);
          for (var5Lifetime1 = 0; var2_int > var5Lifetime1; var5Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var6 = param0.charAt(var5Lifetime1);
            if (46 == var6) {
              if (var5Lifetime1 != 0 &&
                var2_int - 1 != var5Lifetime1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_40_0 = mh.field_R;
                return stackIn_40_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (ve.field_c.indexOf(var6) == -1) {
                stackIn_45_0 = mh.field_R;
                return stackIn_45_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_51_0 = var2;
          stackIn_51_1 = new StringBuilder().append("qd.A(");
          if (param0 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_51_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = false;
    }
}
