/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai {
    static int field_a;
    static ca field_b;
    static int field_c;
    static int field_d;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L0: {
              if (-6145 < (param1 ^ -1)) {
                stackOut_18_0 = -k.field_d[-4096 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -k.field_d[-param1 + 8192];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if (2048 > param1) {
                stackOut_14_0 = k.field_d[param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = k.field_d[4096 + -param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          ai.a(38);
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L2: {
              if (-6145 < (param1 ^ -1)) {
                stackOut_8_0 = -k.field_d[-4096 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -k.field_d[-param1 + 8192];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if (2048 > param1) {
                stackOut_4_0 = k.field_d[param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = k.field_d[4096 + -param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (null != ef.field_h) {
          var1 = 0;
          L0: while (true) {
            if (ef.field_h.length > var1) {
              if (ef.field_h[var1] != null) {
                var2 = 0;
                L1: while (true) {
                  if (ef.field_h[var1].length <= var2) {
                    ef.field_h[var1] = null;
                    var1++;
                    var1++;
                    continue L0;
                  } else {
                    L2: {
                      if (ef.field_h[var1][var2] != null) {
                        ef.field_h[var1][var2].field_y = null;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ef.field_h[var1][var2] = null;
                    var2++;
                    continue L1;
                  }
                }
              } else {
                var1++;
                var1++;
                continue L0;
              }
            } else {
              if (param0 != 0) {
                ai.a(68);
                ef.field_h = null;
                return;
              } else {
                ef.field_h = null;
                return;
              }
            }
          }
        } else {
          if (param0 != 0) {
            ai.a(68);
            ef.field_h = null;
            return;
          } else {
            ef.field_h = null;
            return;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == 2048) {
            return;
        }
        field_c = 60;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
    }
}
