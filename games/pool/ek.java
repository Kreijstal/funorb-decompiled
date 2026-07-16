/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static int[] field_b;
    static int field_a;
    static char[] field_c;

    final static String a(int param0, int param1, int param2) {
        char[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        String var7 = null;
        char[] var8 = null;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        char[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        char[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        char[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        char[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        char[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        char[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        char[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        char[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        char[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        char[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        char[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        char[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        char[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        char[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        char[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        char[] stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        char[] stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        char[] stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        char[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        char[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_29_2 = 0;
        char[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        char[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        char[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        char[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        char[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        char[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        char[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        char[] stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        char[] stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        char[] stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        char[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int stackOut_28_2 = 0;
        char[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_27_2 = 0;
        char[] stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        char[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        char[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        char[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        char[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        char[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        char[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        char[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        char[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        char[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        char[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        char[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        if (param0 >= 60) {
          return p.a(param0 % 60, param1, 45, param0 / 60);
        } else {
          var7 = lq.field_S;
          var11 = var7.toCharArray();
          var10 = var11;
          var9 = var10;
          var8 = var9;
          var4 = var8;
          if (param2 != 10) {
            L0: {
              var6 = null;
              ek.a((vh) null, (byte) 119, -128);
              var5 = var7.indexOf("mm");
              int incrementValue$8 = var5;
              var5++;
              stackOut_17_0 = (char[]) var4;
              stackOut_17_1 = incrementValue$8;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              if ((param0 ^ -1) > -1) {
                stackOut_19_0 = (char[]) (Object) stackIn_19_0;
                stackOut_19_1 = stackIn_19_1;
                stackOut_19_2 = 45;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                stackIn_20_2 = stackOut_19_2;
                break L0;
              } else {
                stackOut_18_0 = (char[]) (Object) stackIn_18_0;
                stackOut_18_1 = stackIn_18_1;
                stackOut_18_2 = 48 + param0 / 10;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_20_2 = stackOut_18_2;
                break L0;
              }
            }
            L1: {
              stackIn_20_0[stackIn_20_1] = (char)stackIn_20_2;
              int incrementValue$9 = var5;
              var5++;
              stackOut_20_0 = (char[]) var4;
              stackOut_20_1 = incrementValue$9;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              if ((param0 ^ -1) <= -1) {
                stackOut_22_0 = (char[]) (Object) stackIn_22_0;
                stackOut_22_1 = stackIn_22_1;
                stackOut_22_2 = param0 % 10 + 48;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                stackIn_23_2 = stackOut_22_2;
                break L1;
              } else {
                stackOut_21_0 = (char[]) (Object) stackIn_21_0;
                stackOut_21_1 = stackIn_21_1;
                stackOut_21_2 = 45;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_23_2 = stackOut_21_2;
                break L1;
              }
            }
            L2: {
              stackIn_23_0[stackIn_23_1] = (char)stackIn_23_2;
              var5 = var7.indexOf("ss");
              int incrementValue$10 = var5;
              var5++;
              stackOut_23_0 = (char[]) var4;
              stackOut_23_1 = incrementValue$10;
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              if (0 > param1) {
                stackOut_25_0 = (char[]) (Object) stackIn_25_0;
                stackOut_25_1 = stackIn_25_1;
                stackOut_25_2 = 45;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                break L2;
              } else {
                stackOut_24_0 = (char[]) (Object) stackIn_24_0;
                stackOut_24_1 = stackIn_24_1;
                stackOut_24_2 = param1 / 10 + 48;
                stackIn_26_0 = stackOut_24_0;
                stackIn_26_1 = stackOut_24_1;
                stackIn_26_2 = stackOut_24_2;
                break L2;
              }
            }
            L3: {
              stackIn_26_0[stackIn_26_1] = (char)stackIn_26_2;
              int incrementValue$11 = var5;
              var5++;
              stackOut_26_0 = (char[]) var4;
              stackOut_26_1 = incrementValue$11;
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              if ((param1 ^ -1) <= -1) {
                stackOut_28_0 = (char[]) (Object) stackIn_28_0;
                stackOut_28_1 = stackIn_28_1;
                stackOut_28_2 = param1 % 10 + 48;
                stackIn_29_0 = stackOut_28_0;
                stackIn_29_1 = stackOut_28_1;
                stackIn_29_2 = stackOut_28_2;
                break L3;
              } else {
                stackOut_27_0 = (char[]) (Object) stackIn_27_0;
                stackOut_27_1 = stackIn_27_1;
                stackOut_27_2 = 45;
                stackIn_29_0 = stackOut_27_0;
                stackIn_29_1 = stackOut_27_1;
                stackIn_29_2 = stackOut_27_2;
                break L3;
              }
            }
            stackIn_29_0[stackIn_29_1] = (char)stackIn_29_2;
            return new String(var11);
          } else {
            L4: {
              var5 = var7.indexOf("mm");
              int incrementValue$12 = var5;
              var5++;
              stackOut_4_0 = (char[]) var4;
              stackOut_4_1 = incrementValue$12;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if ((param0 ^ -1) > -1) {
                stackOut_6_0 = (char[]) (Object) stackIn_6_0;
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = 45;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                break L4;
              } else {
                stackOut_5_0 = (char[]) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = 48 + param0 / 10;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                break L4;
              }
            }
            L5: {
              stackIn_7_0[stackIn_7_1] = (char)stackIn_7_2;
              int incrementValue$13 = var5;
              var5++;
              stackOut_7_0 = (char[]) var4;
              stackOut_7_1 = incrementValue$13;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              if ((param0 ^ -1) <= -1) {
                stackOut_9_0 = (char[]) (Object) stackIn_9_0;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = param0 % 10 + 48;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                break L5;
              } else {
                stackOut_8_0 = (char[]) (Object) stackIn_8_0;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = 45;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                break L5;
              }
            }
            L6: {
              stackIn_10_0[stackIn_10_1] = (char)stackIn_10_2;
              var5 = var7.indexOf("ss");
              int incrementValue$14 = var5;
              var5++;
              stackOut_10_0 = (char[]) var4;
              stackOut_10_1 = incrementValue$14;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              if (0 > param1) {
                stackOut_12_0 = (char[]) (Object) stackIn_12_0;
                stackOut_12_1 = stackIn_12_1;
                stackOut_12_2 = 45;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                stackIn_13_2 = stackOut_12_2;
                break L6;
              } else {
                stackOut_11_0 = (char[]) (Object) stackIn_11_0;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = param1 / 10 + 48;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_13_2 = stackOut_11_2;
                break L6;
              }
            }
            L7: {
              stackIn_13_0[stackIn_13_1] = (char)stackIn_13_2;
              int incrementValue$15 = var5;
              var5++;
              stackOut_13_0 = (char[]) var4;
              stackOut_13_1 = incrementValue$15;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if ((param1 ^ -1) <= -1) {
                stackOut_15_0 = (char[]) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = param1 % 10 + 48;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                break L7;
              } else {
                stackOut_14_0 = (char[]) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 45;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                break L7;
              }
            }
            stackIn_16_0[stackIn_16_1] = (char)stackIn_16_2;
            return new String(var11);
          }
        }
    }

    final static int[] a(int param0) {
        int var1 = 53 % ((param0 - 72) / 37);
        return new int[8];
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 >= -39) {
            field_a = 27;
        }
    }

    final static void a(vh param0, byte param1, int param2) {
        aa var3 = null;
        vh var4 = null;
        vh stackIn_3_0 = null;
        vh stackIn_4_0 = null;
        vh stackIn_5_0 = null;
        vh stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        vh stackOut_2_0 = null;
        vh stackOut_3_0 = null;
        vh stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        vh stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        if (param1 <= -38) {
          L0: {
            L1: {
              stackOut_2_0 = (vh) param0;
              stackIn_5_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (0 == (param2 ^ -1)) {
                break L1;
              } else {
                stackOut_3_0 = (vh) (Object) stackIn_3_0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if ((long)param2 != param0.field_c) {
                  break L1;
                } else {
                  stackOut_4_0 = (vh) (Object) stackIn_4_0;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L0;
                }
              }
            }
            stackOut_5_0 = (vh) (Object) stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L0;
          }
          stackIn_6_0.field_Ib = stackIn_6_1 != 0;
          if (null != param0.field_T) {
            if (param0.field_T.c(0)) {
              return;
            } else {
              var3 = new aa(param0.field_T);
              var4 = (vh) (Object) var3.b((byte) -92);
              L2: while (true) {
                if (var4 == null) {
                  return;
                } else {
                  ek.a(var4, (byte) -69, param2);
                  var4 = (vh) (Object) var3.b(-111);
                  continue L2;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static int a(byte param0, boolean param1, int param2, int param3) {
        if (param0 != -88) {
            field_b = null;
            return ph.a((byte) -115);
        }
        return ph.a((byte) -115);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[12];
        field_a = 14;
        field_c = new char[128];
    }
}
