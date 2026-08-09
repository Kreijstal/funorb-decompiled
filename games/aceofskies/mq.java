/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mq extends wf {
    static eg field_h;
    bo field_j;
    ha field_f;
    static Object field_e;
    static st field_g;
    static String field_i;

    final static sn[] a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        sn[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        sn[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1[-1 + param1.length] != 0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              var2_int = stackIn_4_0;
              if (var2_int == 0) {
                stackIn_7_0 = 1 + param1.length;
                break L2;
              } else {
                stackIn_7_0 = param1.length;
                break L2;
              }
            }
            L3: {
              var3 = new sn[stackIn_7_0];
              var4 = 0;
              if (param0 == 122) {
                break L3;
              } else {
                mq.a((byte) -13, 105, -5, 91, 36);
                break L3;
              }
            }
            var4 = 0;
            L4: while (true) {
              if (param1.length <= var4) {
                L5: {
                  if (var4 >= var3.length) {
                    break L5;
                  } else {
                    var3[var4] = new sn(0, 2);
                    break L5;
                  }
                }
                stackIn_15_0 = (sn[]) (var3);
                break L0;
              } else {
                var3[var4] = new sn(param1[var4], 2);
                var4++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("mq.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 20370) {
          field_e = (Object) null;
          field_i = null;
          field_e = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_e = null;
          field_h = null;
          return;
        }
    }

    final static int a(byte param0, int param1, int param2, int param3, int param4) {
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = param3 & 15;
          if (8 <= var5) {
            stackIn_3_0 = param4;
            break L0;
          } else {
            stackIn_3_0 = param1;
            break L0;
          }
        }
        var6 = stackIn_3_0;
        var8 = -45 / ((-12 - param0) / 50);
        if ((var5 ^ -1) <= -5) {
          if (-13 != (var5 ^ -1)) {
            if (-15 == (var5 ^ -1)) {
              L1: {
                var7 = param1;
                if (0 != (var5 & 2)) {
                  stackIn_34_0 = -var7;
                  break L1;
                } else {
                  stackIn_34_0 = var7;
                  break L1;
                }
              }
              L2: {


                if ((1 & var5) != 0) {

                  stackIn_37_1 = -var6;
                  break L2;
                } else {

                  stackIn_37_1 = var6;
                  break L2;
                }
              }
              return stackIn_34_0 + stackIn_37_1;
            } else {
              stackIn_24_0 = param2;
              L3: {
                var7 = stackIn_24_0;
                if (0 != (var5 & 2)) {
                  stackIn_27_0 = -var7;
                  break L3;
                } else {
                  stackIn_27_0 = var7;
                  break L3;
                }
              }
              L4: {


                if ((1 & var5) != 0) {

                  stackIn_30_1 = -var6;
                  break L4;
                } else {

                  stackIn_30_1 = var6;
                  break L4;
                }
              }
              return stackIn_27_0 + stackIn_30_1;
            }
          } else {
            stackIn_14_0 = param1;
            L5: {
              var7 = stackIn_14_0;
              if (0 != (var5 & 2)) {
                stackIn_17_0 = -var7;
                break L5;
              } else {
                stackIn_17_0 = var7;
                break L5;
              }
            }
            L6: {


              if ((1 & var5) != 0) {

                stackIn_20_1 = -var6;
                break L6;
              } else {

                stackIn_20_1 = var6;
                break L6;
              }
            }
            return stackIn_17_0 + stackIn_20_1;
          }
        } else {
          L7: {
            var7 = param4;
            if (0 != (var5 & 2)) {
              stackIn_7_0 = -var7;
              break L7;
            } else {
              stackIn_7_0 = var7;
              break L7;
            }
          }
          L8: {


            if ((1 & var5) != 0) {

              stackIn_10_1 = -var6;
              break L8;
            } else {

              stackIn_10_1 = var6;
              break L8;
            }
          }
          return stackIn_7_0 + stackIn_10_1;
        }
    }

    mq(ha param0, bo param1) {
        try {
            this.field_f = param0;
            this.field_j = param1;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "mq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new eg();
        field_i = "Continue";
        field_g = new st();
    }
}
