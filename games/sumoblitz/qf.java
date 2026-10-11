/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static int field_a;
    private static String field_z;

    final static int a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        int var5;
        int var6;
        int var7;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var5 = param3 & 15;
        stackIn_3_0 = (var5 >= param2) ? param0 : param4;
        var6 = stackIn_3_0;
        if (var5 < 4) {
          stackIn_31_0 = param0;
          var7 = stackIn_31_0;
          if ((2 & var5) == 0) {
            stackIn_34_0 = var7;
          } else {
            stackIn_34_0 = -var7;
          }
          if ((var5 & 1) == 0) {
            stackIn_37_1 = var6;
          } else {
            stackIn_37_1 = -var6;
          }
          return stackIn_34_0 + stackIn_37_1;
        }
        if (12 == var5) {
          stackIn_8_0 = param4;
          var7Lifetime1 = stackIn_8_0;
          if ((2 & var5) == 0) {
            stackIn_11_0 = var7Lifetime1;
          } else {
            stackIn_11_0 = -var7Lifetime1;
          }
          if ((var5 & 1) == 0) {
            stackIn_14_1 = var6;
          } else {
            stackIn_14_1 = -var6;
          }
          return stackIn_11_0 + stackIn_14_1;
        }
        if (var5 == 14) {
          var7Lifetime2 = param4;
          if ((2 & var5) == 0) {
            stackIn_26_0 = var7Lifetime2;
          } else {
            stackIn_26_0 = -var7Lifetime2;
          }
          if ((var5 & 1) == 0) {
            stackIn_29_1 = var6;
          } else {
            stackIn_29_1 = -var6;
          }
          return stackIn_26_0 + stackIn_29_1;
        }
        var7Lifetime3 = param1;
        if ((2 & var5) == 0) {
          stackIn_19_0 = var7Lifetime3;
        } else {
          stackIn_19_0 = -var7Lifetime3;
        }
        if ((var5 & 1) == 0) {
          stackIn_22_1 = var6;
        } else {
          stackIn_22_1 = -var6;
        }
        return stackIn_19_0 + stackIn_22_1;
    }

    static {
        field_z = "qf.A(";
        field_a = 0;
    }
}
