/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rsa extends rqa {
    static llb field_o;

    final static int[] a(ml param0, int param1) {
        int incrementValue$1 = 0;
        ij var2 = null;
        RuntimeException var2_ref = null;
        hua var3 = null;
        int[] var4 = null;
        int var5 = 0;
        hua var6 = null;
        int var7 = 0;
        int[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          var2 = new ij();
          ct.a(param0, 83, var2);
          var3 = (hua) (var2.c((byte) -103));
          if (var3.field_d != -1) {
            var2.b(-10258, var3);
          }
          var4 = new int[var2.c(3)];
          var5 = 0;
          if (param1 >= -109) {
            field_o = (llb) null;
          }
          var6 = (hua) (var2.d(0));
          while (var6 != null) {
            incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = var6.field_d;
            var6 = (hua) (var2.a((byte) 55));
          }
          stackIn_9_0 = var4;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("rsa.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != -1) {
          field_o = (llb) null;
        }
    }

    rsa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sva.field_m = param0[0].a(72);
          if (param1 > -119) {
            field_o = (llb) null;
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("rsa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_15_0 = 0;
        int stackIn_22_0 = 0;
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
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var14Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          var6_int = -param3 + param4;
          var7 = param1 - param5;
          if (param2 == ~var7) {
            if (0 != var6_int) {
              sk.a(-115, param3, param5, param4, param0);
            }
            return;
          }
          if (var6_int == 0) {
            bpa.a(param0, param3, (byte) -25, param5, param1);
            return;
          }
          if (0 > var7) {
            var7 = -var7;
          }
          if (var6_int < 0) {
            var6_int = -var6_int;
          }
          stackIn_15_0 = (var7 >= var6_int) ? 0 : 1;
          var8 = stackIn_15_0;
          if (var8 != 0) {
            var9 = param5;
            param5 = param3;
            var10 = param1;
            param3 = var9;
            param1 = param4;
            param4 = var10;
          }
          if (param1 < param5) {
            var9Lifetime1 = param5;
            param5 = param1;
            var10Lifetime1 = param3;
            param1 = var9Lifetime1;
            param3 = param4;
            param4 = var10Lifetime1;
          }
          var9Lifetime2 = param3;
          var10Lifetime2 = -param5 + param1;
          var11 = -param3 + param4;
          var12 = -(var10Lifetime2 >> 1);
          stackIn_22_0 = (param3 >= param4) ? -1 : 1;
          var13 = stackIn_22_0;
          if (var11 < 0) {
            var11 = -var11;
          }
          if (var8 != 0) {
            for (var14 = param5; param1 >= var14; var14++) {
              rba.field_b[var14][var9Lifetime2] = param0;
              var12 = var12 + var11;
              if (var12 > 0) {
                var9Lifetime2 = var9Lifetime2 + var13;
                var12 = var12 - var10Lifetime2;
              }
            }
            return;
          }
          var16 = param5;
          var14Lifetime1 = var16;
          while (param1 >= var16) {
            var12 = var12 + var11;
            rba.field_b[var9Lifetime2][var16] = param0;
            if (var12 > 0) {
              var12 = var12 - var10Lifetime2;
              var9Lifetime2 = var9Lifetime2 + var13;
            }
            var16++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var6), "rsa.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
    }
}
