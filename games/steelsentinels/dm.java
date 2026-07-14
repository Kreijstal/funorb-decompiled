/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm {
    static String field_h;
    private boolean field_b;
    static u field_f;
    static boolean field_c;
    static int field_a;
    private String field_i;
    static String field_e;
    private boolean field_g;
    static String field_d;

    final void a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ((dm) this).field_g = true;
        if (param0 != 200) {
          L0: {
            field_a = 9;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((dm) this).field_b = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((dm) this).field_b = stackIn_4_1 != 0;
          return;
        }
    }

    final boolean b(int param0) {
        if (param0 != 200) {
            String discarded$0 = ((dm) this).a(false);
            return ((dm) this).field_b;
        }
        return ((dm) this).field_b;
    }

    final static boolean a(ah param0, int param1, ah param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          if (param1 == 22635) {
            break L0;
          } else {
            var5 = null;
            StringBuilder discarded$2 = dm.a('', -119, (StringBuilder) null, -20);
            break L0;
          }
        }
        L1: {
          var3 = -param0.field_bc + param2.field_bc;
          if (param2.field_ac != nn.field_f) {
            if (param2.field_ac == null) {
              // wide iinc 3 200
              break L1;
            } else {
              break L1;
            }
          } else {
            // wide iinc 3 -200
            break L1;
          }
        }
        if (nn.field_f != param0.field_ac) {
          if (param0.field_ac != null) {
            L2: {
              if ((var3 ^ -1) >= -1) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              // wide iinc 3 -200
              if ((var3 ^ -1) >= -1) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if ((var3 ^ -1) >= -1) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    final boolean a(byte param0) {
        if (param0 != -72) {
            return true;
        }
        return ((dm) this).field_g;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 > -99) {
          dm.a(120);
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        } else {
          field_f = null;
          field_d = null;
          field_h = null;
          return;
        }
    }

    final String a(boolean param0) {
        if (!param0) {
            return null;
        }
        return ((dm) this).field_i;
    }

    final static StringBuilder a(char param0, int param1, StringBuilder param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        var4 = param2.length();
        param2.setLength(param3);
        var5 = var4;
        L0: while (true) {
          if (param3 <= var5) {
            if (param1 != 200) {
              field_a = 21;
              return param2;
            } else {
              return param2;
            }
          } else {
            param2.setCharAt(var5, param0);
            var5++;
            continue L0;
          }
        }
    }

    dm(String param0) {
        ((dm) this).field_g = false;
        ((dm) this).field_b = false;
        ((dm) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_h = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = "Sentinels Expansion";
        field_a = 3;
        field_d = "Friends";
    }
}
