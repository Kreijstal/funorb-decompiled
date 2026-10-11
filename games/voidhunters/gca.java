/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gca extends rqa {
    static char[] field_q;
    static String field_o;
    static String field_p;
    static lkb field_r;

    gca(String param0, Class[] param1, String param2) {
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
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(202, 84));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("gca.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static sg a(pe param0, byte param1, int param2, sg param3) {
        int var7 = 0;
        Object stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        sg var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        sg[] var13 = null;
        var12 = VoidHunters.field_G;
        try {
          var13 = param0.d(1000);
          var5 = 2147483647;
          if (param3.q((byte) 113) < 0) {
            var5 = cab.field_p;
          }
          var6 = null;
          for (var7 = 0; var13.length > var7; var7++) {
            var8 = var13[var7];
            if (var8 != null &&
              param3 != var8 && ((var8.q((byte) 71) != param3.q((byte) 84) ||
              var8.q((byte) 86) == sja.field_c &&
              var8.o((byte) -117) != param2 &&
              (null == var8.k((byte) -108) ||
              var8.k((byte) -108).a((byte) 66) != param2)) &&
              (!param3.g(false) ||
              !param0.a((anb) (var8), 119)))) {
              var9 = var8.field_d - param3.field_d;
              var10 = var8.field_e - param3.field_e;
              var11 = ar.a(var9, (byte) 107, var10);
              if (var5 > var11) {
                var5 = var11;
                var6 = var8;
              }
            }
          }
          if (param1 != 63) {
            field_o = (String) null;
          }
          stackIn_24_0 = var6;
          return (sg) (stackIn_24_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_27_0 = var4;
          stackIn_27_1 = new StringBuilder().append("gca.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 <= -110) {
          field_p = null;
          field_q = null;
          field_r = null;
          return;
        }
        sg var2 = (sg) null;
        gca.a((pe) null, (byte) -124, 125, (sg) null);
        field_p = null;
        field_q = null;
        field_r = null;
    }

    final static int[] a(byte param0, int[] param1) {
        int var3_int = 0;
        int var5 = 0;
        int[] stackIn_12_0 = null;
        int[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = VoidHunters.field_G;
        try {
          var2_int = 0;
          for (var3_int = 0; param1.length > var3_int; var3_int += 2) {
            var4 = param1[var3_int + 1];
            if (var4 == 0) {
              var2_int++;
            }
          }
          var10 = new int[-(var2_int * 2) + (param1.length + param1.length)];
          var9 = var10;
          var3 = var9;
          for (var4Lifetime1 = 0; param1.length > var4Lifetime1; var4Lifetime1++) {
            var3[var4Lifetime1] = param1[var4Lifetime1];
          }
          var4Lifetime2 = param1.length;
          if (param0 < 63) {
            stackIn_12_0 = (int[]) null;
            return stackIn_12_0;
          }
          for (var5 = -2 + param1.length; var5 >= 0; var5 -= 2) {
            var6 = param1[var5];
            var7 = param1[1 + var5];
            if (var7 != 0) {
              var10[var4Lifetime2] = var6;
              var3[var4Lifetime2 + 1] = -var7;
              var4Lifetime2 += 2;
            }
          }
          stackIn_21_0 = var3;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("gca.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_q = new char[128];
        field_o = "Power plant";
        field_p = "Honour";
        field_r = new lkb();
    }
}
