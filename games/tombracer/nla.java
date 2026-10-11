/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nla {
    static String field_b;
    static int field_a;

    public static void a(byte param0) {
        if (param0 < 118) {
          return;
        }
        field_b = null;
    }

    final static int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int localTemp$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_45_0 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var12Lifetime1;
        var8 = -(param1 * param6) + param7 * param2;
        if (0 == var8) {
          return -1;
        }
        var9 = param1 * param4 - param3 * param7;
        stackIn_5_0 = (0 >= var8) ? 0 : 1;
        stackIn_8_1 = (var9 < 0) ? 0 : 1;
        if ((stackIn_5_0 ^ stackIn_8_1) != 0) {
          return -1;
        }
        if (param0 != 2749) {
          return -58;
        }
        var10 = 30 - vd.b(1, var9);
        if (var10 >= param5) {
          var11 = (var9 << param5) / var8;
        } else {
          localTemp$0 = var8 >> param5 - var10;
          var8 = localTemp$0;
          if (localTemp$0 == 0) {
            return -1;
          }
          var11 = (var9 << var10) / var8;
        }
        if (1 << param5 < var11) {
          return -1;
        }
        if (Math.abs(param1) > Math.abs(param7)) {
          var12 = param3 + (param2 * var11 >> param5);
          if (param1 < 0) {
            if (param1 > var12) {
              return -1;
            }
            if (var12 > 0) {
              return -1;
            }
            return var11;
          }
          if (var12 < 0) {
            return -1;
          }
          if (param1 < var12) {
            return -1;
          }
          return var11;
        }
        var12Lifetime1 = param4 + (param6 * var11 >> param5);
        if (0 <= param7) {
          if (0 > var12Lifetime1) {
            return -1;
          }
          if (var12Lifetime1 > param7) {
            return -1;
          }
          return var11;
        }
        if (var12Lifetime1 < param7) {
          stackIn_45_0 = -1;
          return stackIn_45_0;
        }
        if (var12Lifetime1 > 0) {
          return -1;
        }
        return var11;
    }

    static {
        field_b = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_a = 1;
    }
}
