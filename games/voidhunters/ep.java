/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends rqa {
    static kb field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          si.a(199, 62, param0[0].a(45));
          if (param1 >= -119) {
            field_o = (kb) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ep.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ep(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var21Lifetime1;
        int var22Lifetime1;
        var25 = VoidHunters.field_G;
        try {
          var6_int = 0;
          var7 = param4;
          var8 = param3 * param3;
          var9 = param4 * param4;
          var10 = var9 << 1;
          var11 = var8 << 1;
          var12 = param4 << 1;
          var13 = var10 + var8 * (-var12 + 1);
          var14 = var9 - (var12 - 1) * var11;
          var15 = var8 << 2;
          var16 = var9 << 2;
          var17 = var10 * ((var6_int << 1) + 3);
          var18 = var11 * ((var7 << 1) - 3);
          var19 = var16 * (1 + var6_int);
          if (lua.field_c <= param1 &&
            hab.field_i >= param1) {
            var21 = ksa.a(31123, ob.field_j, mt.field_o, param3 + param5);
            var22 = ksa.a(31123, ob.field_j, mt.field_o, -param3 + param5);
            ww.a(param2, var21, rba.field_b[param1], (byte) 75, var22);
          }
          var20 = (var7 - 1) * var15;
          if (param0 > -112) {
            field_o = (kb) null;
          }
          while (true) {
            if (var7 <= 0) {
              return;
            }
            if (0 > var13) {
              while (var13 < 0) {
                var14 = var14 + var19;
                var13 = var13 + var17;
                var6_int++;
                var19 = var19 + var16;
                var17 = var17 + var16;
              }
            }
            if (var14 < 0) {
              var14 = var14 + var19;
              var13 = var13 + var17;
              var19 = var19 + var16;
              var17 = var17 + var16;
              var6_int++;
            }
            var14 = var14 - var18;
            var13 = var13 - var20;
            var7--;
            var20 = var20 - var15;
            var18 = var18 - var15;
            var21Lifetime1 = param1 - var7;
            var22Lifetime1 = var7 + param1;
            if (var22Lifetime1 < lua.field_c) {
              continue;
            }
            if (hab.field_i < var21Lifetime1) {
              continue;
            }
            var23 = ksa.a(31123, ob.field_j, mt.field_o, param5 + var6_int);
            var24 = ksa.a(31123, ob.field_j, mt.field_o, -var6_int + param5);
            if (lua.field_c <= var21Lifetime1) {
              ww.a(param2, var23, rba.field_b[var21Lifetime1], (byte) 75, var24);
            }
            if (hab.field_i < var22Lifetime1) {
              continue;
            }
            ww.a(param2, var23, rba.field_b[var22Lifetime1], (byte) 75, var24);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "ep.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void e(byte param0) {
        int var1 = 85 % ((-42 - param0) / 42);
        field_o = null;
    }

    static {
        field_o = new kb(3);
    }
}
