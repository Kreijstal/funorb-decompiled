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
        L0: {
          var5 = param3 & 15;
          if (var5 >= param2) {
            stackIn_3_0 = param0;
            break L0;
          } else {
            stackIn_3_0 = param4;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        if ((var5 ^ -1) <= -5) {
          if (12 != var5) {
            if (var5 == 14) {
              L1: {
                var7 = param4;
                if ((2 & var5) == 0) {
                  stackIn_26_0 = var7;
                  break L1;
                } else {
                  stackIn_26_0 = -var7;
                  break L1;
                }
              }
              L2: {


                if ((var5 & 1) == 0) {

                  stackIn_29_1 = var6;
                  break L2;
                } else {

                  stackIn_29_1 = -var6;
                  break L2;
                }
              }
              return stackIn_26_0 + stackIn_29_1;
            } else {
              L3: {
                var7 = param1;
                if ((2 & var5) == 0) {
                  stackIn_19_0 = var7;
                  break L3;
                } else {
                  stackIn_19_0 = -var7;
                  break L3;
                }
              }
              L4: {


                if ((var5 & 1) == 0) {

                  stackIn_22_1 = var6;
                  break L4;
                } else {

                  stackIn_22_1 = -var6;
                  break L4;
                }
              }
              return stackIn_19_0 + stackIn_22_1;
            }
          } else {
            stackIn_8_0 = param4;
            L5: {
              var7 = stackIn_8_0;
              if ((2 & var5) == 0) {
                stackIn_11_0 = var7;
                break L5;
              } else {
                stackIn_11_0 = -var7;
                break L5;
              }
            }
            L6: {


              if ((var5 & 1) == 0) {

                stackIn_14_1 = var6;
                break L6;
              } else {

                stackIn_14_1 = -var6;
                break L6;
              }
            }
            return stackIn_11_0 + stackIn_14_1;
          }
        } else {
          stackIn_31_0 = param0;
          L7: {
            var7 = stackIn_31_0;
            if ((2 & var5) == 0) {
              stackIn_34_0 = var7;
              break L7;
            } else {
              stackIn_34_0 = -var7;
              break L7;
            }
          }
          L8: {


            if ((var5 & 1) == 0) {

              stackIn_37_1 = var6;
              break L8;
            } else {

              stackIn_37_1 = -var6;
              break L8;
            }
          }
          return stackIn_34_0 + stackIn_37_1;
        }
    }

    static {
        field_z = "qf.A(";
        field_a = 0;
    }
}
