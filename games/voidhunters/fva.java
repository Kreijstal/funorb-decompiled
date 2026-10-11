/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fva extends rqa {
    static int field_o;
    static boolean field_p;

    fva(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static int a(int param0, int param1, int[] param2, int param3, int[] param4, int param5, int param6) {
        int stackIn_34_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20_int = 0;
        long var20 = 0L;
        int var21 = 0;
        int var22 = 0;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var20_intLifetime1;
        int var20_intLifetime2;
        int var20_intLifetime3;
        int var20_intLifetime4;
        int var21Lifetime1;
        int var19Lifetime4Lifetime1;
        var22 = VoidHunters.field_G;
        try {
          var7_int = param4[-2 + param4.length];
          var8 = param4[param4.length - 1];
          if (param6 != -1) {
            field_o = -71;
          }
          var9 = 0;
          while (param4.length > var9) {
            boolean decompiledFrameRemainder0 = true;
            var10 = param4[var9++];
            var11 = param4[var9++];
            var12 = -var8 + var11 >> param5;
            var13 = -var10 + var7_int >> param5;
            if (var12 != 0 &&
              var13 != 0) {
              var18 = 0;
              var19 = param4[var18++];
              var20_int = param4[var18++];
              var14 = var12 * (-param1 + var19 >> param5) + (-param3 + var20_int >> param5) * var13;
              var15 = var14;
              while (var18 < param4.length) {
                var19Lifetime1 = param4[var18++];
                var20_intLifetime1 = param4[var18++];
                var21 = (-param1 + var19Lifetime1 >> param5) * var12 + (var20_intLifetime1 - param3 >> param5) * var13;
                if (var15 > var21) {
                  var15 = var21;
                  continue;
                }
                if (var14 >= var21) {
                  continue;
                }
                var14 = var21;
              }
              var18Lifetime1 = 0;
              var19Lifetime2 = param2[var18Lifetime1++];
              var20_intLifetime2 = param2[var18Lifetime1++];
              var16 = var12 * (-param1 + var19Lifetime2 >> param5) + var13 * (var20_intLifetime2 - param3 >> param5);
              var17 = var16;
              while (var18Lifetime1 < param2.length) {
                var19Lifetime3 = param2[var18Lifetime1++];
                var20_intLifetime3 = param2[var18Lifetime1++];
                var21Lifetime1 = (-param1 + var19Lifetime3 >> param5) * var12 + (var20_intLifetime3 - param3 >> param5) * var13;
                if (var21Lifetime1 < var17) {
                  var17 = var21Lifetime1;
                  continue;
                }
                if (var21Lifetime1 <= var16) {
                  continue;
                }
                var16 = var21Lifetime1;
              }
              if (var15 < var16 &&
                var14 > var17) {
                var19Lifetime4 = -var16 + var15;
                var20_intLifetime4 = var14 - var17;
                var18Lifetime2 = (Math.abs(var19Lifetime4) >= Math.abs(var20_intLifetime4)) ? var20_intLifetime4 : var19Lifetime4;
                var19Lifetime4Lifetime1 = ar.a(var12, (byte) 119, var13);
                if (!(var19Lifetime4Lifetime1 <= 0)) {
                  var20 = ((long)var18Lifetime2 << param5) / (long)var19Lifetime4Lifetime1;
                  if (!(Math.abs(var20) >= (long)Math.abs(param0))) {
                    param0 = (int)var20;
                  }
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_34_0 = 2147483647;
                return stackIn_34_0;
              }
            }
            var8 = var11;
            var7_int = var10;
          }
          stackIn_37_0 = param0;
          return stackIn_37_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_40_0 = var7;
          stackIn_40_1 = new StringBuilder().append("fva.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param5).append(',').append(param6).append(')').toString());
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
          if (param1 >= -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(42, 62, param0[0].a(11));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fva.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(int[] param0, boolean param1) {
        int var3 = 0;
        String var2 = null;
        int var4 = 0;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = "{";
          for (var3 = 0; param0.length > var3; var3++) {
            var2 = var2 + param0[var3];
            if (var3 < param0.length - 1) {
              var2 = var2 + ",";
            }
          }
          if (!param1) {
            stackIn_15_0 = var2 + "}";
            return stackIn_15_0;
          }
          stackIn_13_0 = (String) null;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("fva.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = true;
        field_o = 22;
    }
}
