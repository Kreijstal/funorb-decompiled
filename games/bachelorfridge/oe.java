/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe implements so {
    static String[] field_b;
    static String field_d;
    static sna field_c;
    static String field_a;

    final static void a(int param0, lu param1, it param2) {
        if (param2 == null) {
          return;
        }
        try {
          param1.d(param2.field_e, 0);
          param1.d(param2.field_h, param0 + 21332);
          param1.d(param2.field_m, 0);
          param1.b(param2.field_b, -114);
          param1.d(param2.field_a ? 1 : 0, param0 ^ param0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "oe.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        if (0 > param0) {
          param0 = 0;
        } else {
          if (param0 > 230) {
            param0 = 230;
          }
        }
        gka.a(102, param0);
        if (param1 < 11) {
          oe.a(-101, -109, 0, -60, 10, -92);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
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
        var15 = BachelorFridge.field_y;
        try {
          var6_int = param4 - param0;
          var7 = param3 - param5;
          if (param2 > -75) {
            return;
          }
          if (0 == var7) {
            if (0 != var6_int) {
              ada.a(param0, param1, param5, 117, param4);
            }
            return;
          }
          if (0 == var6_int) {
            ew.a(param5, param0, -94, param1, param3);
            return;
          }
          if (var6_int < 0) {
            var6_int = -var6_int;
          }
          if (0 > var7) {
            var7 = -var7;
          }
          stackIn_20_0 = (var6_int <= var7) ? 0 : 1;
          var8 = stackIn_20_0;
          if (var8 != 0) {
            var9 = param5;
            var10 = param3;
            param5 = param0;
            param0 = var9;
            param3 = param4;
            param4 = var10;
          }
          if (param5 > param3) {
            var9Lifetime1 = param5;
            var10Lifetime1 = param0;
            param5 = param3;
            param3 = var9Lifetime1;
            param0 = param4;
            param4 = var10Lifetime1;
          }
          var9Lifetime2 = param0;
          var10Lifetime2 = -param5 + param3;
          var11 = -param0 + param4;
          var12 = -(var10Lifetime2 >> 1);
          stackIn_28_0 = (param0 < param4) ? 1 : -1;
          var13 = stackIn_28_0;
          if (var11 < 0) {
            var11 = -var11;
          }
          if (var8 == 0) {
            for (var14 = param5; var14 <= param3; var14++) {
              tj.field_b[var9Lifetime2][var14] = param1;
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
          while (param3 >= var16) {
            tj.field_b[var16][var9Lifetime2] = param1;
            var12 = var12 + var11;
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
          throw pe.a((Throwable) ((Object) var6), "oe.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0) {
          field_d = (String) null;
        }
        field_d = null;
    }

    static {
        field_a = "Honour";
        field_b = new String[]{"By rating", "By win percentage"};
        field_d = "Now feel free to experiment and breed more creatures. When you're ready, click the arena portal to enter the arena! Click here to close.";
    }
}
