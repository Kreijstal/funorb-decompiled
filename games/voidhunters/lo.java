/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lo {
    static String field_d;
    static llb field_b;
    static wf[] field_a;
    static phb[] field_c;

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_c = null;
        if (!param0) {
          lta var2 = (lta) null;
          lo.a(20, 74, (aja) null, (lta) null);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, aja param2, lta param3) {
        int var16 = 0;
        int var17 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        var24 = VoidHunters.field_G;
        try {
          var4_int = param3.a(true, 0);
          if (var4_int < 0) {
            var4_int = var4_int - param1;
          }
          var5 = param3.a(param0 + 0, 0);
          if (var5 < 0) {
            var5 = var5 - param1;
          }
          var6 = param3.a(true, ip.field_p.width);
          var7 = param3.a(0, ip.field_p.height);
          var8 = -var4_int + var6;
          var9 = var7 - var5;
          var10 = var4_int / param1 * param1;
          var11 = param1 * (var5 / param1);
          var12 = var8 / param1;
          var13 = var9 / param1;
          var14 = var10;
          var15 = var11;
          for (var16 = param0; var16 <= var12; var16++) {
            for (var17 = 0; var13 >= var17; var17++) {
              var18 = var14 + param1;
              var19 = var15 + param1;
              var20 = param3.a(var14, (byte) 127);
              var21 = param3.b(true, var15);
              var22 = param3.a(var18, (byte) 127);
              var23 = param3.b(true, var19);
              param2.b(var20, var21, var22 - var20, -var21 + var23);
              var15 = var15 + param1;
            }
            var14 = var14 + param1;
            var15 = var11;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("lo.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_a = new wf[10];
    }
}
