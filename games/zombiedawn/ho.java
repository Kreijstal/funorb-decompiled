/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho {
    static int field_b;
    static String[] field_a;

    final static void a(int param0, byte param1, int param2) {
        int[] dupTemp$0 = null;
        int dupTemp$1 = 0;
        param2 = param2 / 24;
        param0 = param0 / 24;
        if (param2 < 0) {
          return;
        }
        if (vm.field_u[0].length <= param2) {
          return;
        }
        if (0 > param0) {
          return;
        }
        if (param0 >= vm.field_u.length) {
          return;
        }
        if (param1 == 54) {
          dupTemp$0 = vm.field_u[param0];
          dupTemp$1 = dupTemp$0[param2] - 1;
          dupTemp$0[param2] = dupTemp$1;
          if (dupTemp$1 < 0) {
            vm.field_u[param0][param2] = 0;
          }
          return;
        }
    }

    final static void a(vn param0, boolean param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = ZombieDawn.field_J;
        try {
          var4_int = 14059691;
          if (param3 >= -102) {
            field_a = (String[]) null;
          }
          var5 = 10210196;
          var6 = param2;
          if (var6 != -1 &&
            var6 != 0) {
            if (var6 == 1) {
              var5 = 15420180;
              stackIn_20_0 = (param1) ? 14868269 : 14084155;
              var4_int = stackIn_20_0;
            } else if (var6 == 2) {
              stackIn_24_0 = (param1) ? 5410749 : 4618411;
              var4_int = stackIn_24_0;
              var5 = 8947848;
            } else if (3 == var6) {
              var5 = 2267494;
              stackIn_28_0 = (!param1) ? 4618411 : 13357901;
              var4_int = stackIn_28_0;
            } else if (var6 == 9) {
              var4_int = 13542477;
              var5 = 13843485;
            }
          } else {
            stackIn_16_0 = (param1) ? 14868413 : 14059691;
            var4_int = stackIn_16_0;
            var5 = 10210196;
          }
          sj.a(var4_int, -1380633400, var5, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_34_0 = var4;
          stackIn_34_1 = new StringBuilder().append("ho.B(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 118) {
          vn var2 = (vn) null;
          ho.a((vn) null, false, 18, -108);
        }
    }

    static {
    }
}
