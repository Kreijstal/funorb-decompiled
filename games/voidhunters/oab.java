/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oab extends rqa {
    static int field_o;

    final static int a(int param0, int param1, int[] param2, int param3) {
        int var7 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6_ref_int__ = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_5_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          if (param2 != null &&
            param3 != 0) {
            if (param0 >= -74) {
              field_o = -89;
            }
            var4_int = 2147483647;
            var5 = -2147483648;
            var6_ref_int__ = param2;
            for (var7 = 0; var7 < var6_ref_int__.length; var7++) {
              var8 = var6_ref_int__[var7];
              if (var5 < var8) {
                var5 = var8;
              }
              if (var4_int > var8) {
                var4_int = var8;
              }
            }
            var6 = iia.a(-85, var5 - var4_int);
            stackIn_18_0 = 32 + (6 + param1 + param3 * var6);
            return stackIn_18_0;
          }
          stackIn_5_0 = param1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("oab.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
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
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(60, 120));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("oab.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    oab(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
