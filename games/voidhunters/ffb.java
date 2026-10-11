/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ffb {
    static String field_e;
    static String field_a;
    static String field_d;
    static String field_b;
    static String field_c;

    final static byte[] a(boolean param0, Object param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ps var4 = null;
        byte[] stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_13_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (param1 instanceof byte[]) {
            var3 = (byte[]) (param1);
            if (!param0) {
              stackIn_9_0 = var3;
              return stackIn_9_0;
            }
            stackIn_7_0 = nia.a(var3, (byte) -116);
            return stackIn_7_0;
          }
          if (param1 instanceof ps) {
            var4 = (ps) (param1);
            stackIn_13_0 = var4.b(3);
            return stackIn_13_0;
          }
          if (param2) {
            throw new IllegalArgumentException();
          }
          stackIn_16_0 = (byte[]) null;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ffb.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_e = null;
        field_c = null;
        field_d = null;
        int var1 = -75 / ((-40 - param0) / 34);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        var15 = VoidHunters.field_G;
        try {
          if (param1 >= -72) {
            field_d = (String) null;
          }
          var5_int = 0;
          var6 = param0;
          var7 = -param0;
          var8 = -1;
          var9 = ksa.a(31123, ob.field_j, mt.field_o, param4 + param0);
          var10 = ksa.a(31123, ob.field_j, mt.field_o, param4 - param0);
          ww.a(param3, var9, rba.field_b[param2], (byte) 75, var10);
          while (var6 > var5_int) {
            var8 += 2;
            var7 = var7 + var8;
            if (var7 > 0) {
              var6--;
              var7 = var7 - (var6 << 1);
              var11 = -var6 + param2;
              var12 = param2 + var6;
              if (lua.field_c <= var12 &&
                hab.field_i >= var11) {
                var13 = ksa.a(31123, ob.field_j, mt.field_o, var5_int + param4);
                var14 = ksa.a(31123, ob.field_j, mt.field_o, param4 - var5_int);
                if (var12 <= hab.field_i) {
                  ww.a(param3, var13, rba.field_b[var12], (byte) 75, var14);
                }
                if (var11 >= lua.field_c) {
                  ww.a(param3, var13, rba.field_b[var11], (byte) 75, var14);
                }
              }
            }
            var5_int++;
            var11Lifetime1 = -var5_int + param2;
            var12Lifetime1 = var5_int + param2;
            if (lua.field_c > var12Lifetime1) {
              continue;
            }
            if (var11Lifetime1 > hab.field_i) {
              continue;
            }
            var13Lifetime1 = ksa.a(31123, ob.field_j, mt.field_o, param4 + var6);
            var14Lifetime1 = ksa.a(31123, ob.field_j, mt.field_o, param4 - var6);
            if (hab.field_i >= var12Lifetime1) {
              ww.a(param3, var13Lifetime1, rba.field_b[var12Lifetime1], (byte) 75, var14Lifetime1);
            }
            if (lua.field_c > var11Lifetime1) {
              continue;
            }
            ww.a(param3, var13Lifetime1, rba.field_b[var11Lifetime1], (byte) 75, var14Lifetime1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var5), "ffb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_a = "Add condition (Node on team)";
        field_d = "Offer rematch";
        field_b = "Menu";
        field_c = "Player Name: ";
    }
}
