/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi {
    static String field_a;
    static String field_b;
    static String field_c;

    final static void a(byte param0, fb param1, ob param2, boolean param3) {
        fb stackIn_7_0 = null;
        fb stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        fb stackIn_11_0 = null;
        fb stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        fb stackIn_14_0 = null;
        fb stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        fb stackIn_17_0 = null;
        fb stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        fb stackIn_20_0 = null;
        fb stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        fb stackIn_23_0 = null;
        fb stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param3) {
                break L1;
              } else {
                param1.field_Lb = param2.j(-95);
                break L1;
              }
            }
            L2: {
              param1.field_Eb = param2.j(-64);
              if (param0 == -89) {
                break L2;
              } else {
                mi.a((byte) -67);
                break L2;
              }
            }
            L3: {
              param1.field_nc = param2.j(-123);
              var4_int = param2.j(-111);
              stackIn_7_0 = (fb) (param1);

              if (0 == (128 & var4_int)) {
                stackIn_8_0 = (fb) ((Object) stackIn_7_0);
                stackIn_8_1 = 0;
                break L3;
              } else {
                stackIn_8_0 = (fb) ((Object) stackIn_7_0);
                stackIn_8_1 = 1;
                break L3;
              }
            }
            L4: {
              L5: {
                stackIn_8_0.field_Qb = stackIn_8_1 != 0;
                stackIn_11_0 = (fb) (param1);

                if (!param1.field_Qb) {
                  break L5;
                } else {
                  stackIn_11_0 = (fb) ((Object) stackIn_11_0);

                  if (param1.field_Eb <= param1.field_Lb) {
                    break L5;
                  } else {
                    stackIn_12_0 = (fb) ((Object) stackIn_11_0);
                    stackIn_12_1 = 1;
                    break L4;
                  }
                }
              }
              stackIn_12_0 = (fb) ((Object) stackIn_11_0);
              stackIn_12_1 = 0;
              break L4;
            }
            L6: {
              stackIn_12_0.field_cc = stackIn_12_1 != 0;
              stackIn_14_0 = (fb) (param1);

              if ((16 & var4_int) != 0) {
                stackIn_15_0 = (fb) ((Object) stackIn_14_0);
                stackIn_15_1 = 2;
                break L6;
              } else {
                stackIn_15_0 = (fb) ((Object) stackIn_14_0);
                stackIn_15_1 = 1;
                break L6;
              }
            }
            L7: {
              stackIn_15_0.field_Fb = stackIn_15_1;
              stackIn_17_0 = (fb) (param1);

              if (0 == (var4_int & 32)) {
                stackIn_18_0 = (fb) ((Object) stackIn_17_0);
                stackIn_18_1 = 0;
                break L7;
              } else {
                stackIn_18_0 = (fb) ((Object) stackIn_17_0);
                stackIn_18_1 = 1;
                break L7;
              }
            }
            L8: {
              stackIn_18_0.field_ec = stackIn_18_1 != 0;
              stackIn_20_0 = (fb) (param1);

              if ((8 & var4_int) == 0) {
                stackIn_21_0 = (fb) ((Object) stackIn_20_0);
                stackIn_21_1 = 0;
                break L8;
              } else {
                stackIn_21_0 = (fb) ((Object) stackIn_20_0);
                stackIn_21_1 = 1;
                break L8;
              }
            }
            L9: {
              stackIn_21_0.field_mc = stackIn_21_1 != 0;
              stackIn_23_0 = (fb) (param1);

              if (-1 == (var4_int & 64 ^ -1)) {
                stackIn_24_0 = (fb) ((Object) stackIn_23_0);
                stackIn_24_1 = 0;
                break L9;
              } else {
                stackIn_24_0 = (fb) ((Object) stackIn_23_0);
                stackIn_24_1 = 1;
                break L9;
              }
            }
            L10: {
              stackIn_24_0.field_Ab = stackIn_24_1 != 0;
              if (0 == (4 & var4_int)) {
                stackIn_27_0 = 0;
                break L10;
              } else {
                stackIn_27_0 = 1;
                break L10;
              }
            }
            L11: {
              var5 = stackIn_27_0;
              if ((2 & var4_int) == 0) {
                stackIn_30_0 = 0;
                break L11;
              } else {
                stackIn_30_0 = 1;
                break L11;
              }
            }
            L12: {
              var6 = stackIn_30_0;
              param2.a(param1.field_dc.length, 0, 17469032, param1.field_dc);
              param1.field_Zb = param2.f(-20976);
              param1.field_Gb = pr.a(param0 + 14363) + -(long)param2.a(16711680);
              if (var5 == 0) {
                param1.field_lc = -1;
                break L12;
              } else {
                param1.field_lc = param2.a(16711680);
                break L12;
              }
            }
            param1.field_fc = param2.d(127);
            var7 = param2.field_j;
            param1.field_Xb = param2.e(-1);
            if (var6 == 0) {
              param1.field_jc = null;
              return;
            } else {
              param2.field_j = var7;
              param1.field_jc = new String[param1.field_Lb];
              var8 = 0;
              L13: while (true) {
                if (param1.field_Lb <= var8) {
                  break L0;
                } else {
                  param1.field_jc[var8] = param2.e(-1);
                  var8++;
                  continue L13;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var4 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var4);

            stackIn_41_1 = new StringBuilder().append("mi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L14;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L14;
            }
          }
          L15: {


            stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',');

            if (param2 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L15;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L15;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_42_0), stackIn_45_2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 < 95) {
            field_a = (String) null;
            field_c = null;
            field_b = null;
            return;
        }
        field_c = null;
        field_b = null;
    }

    static {
        field_a = "Your ignore list is full. Max of 100 hit.";
        field_b = "Invite more players, or alternatively try changing the following settings:  ";
        field_c = "No";
    }
}
