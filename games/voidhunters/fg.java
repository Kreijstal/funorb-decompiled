/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fg {
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3) {
        int var4 = 0;
        var4 = -107 % ((0 - param3) / 34);
        if (li.field_i) {
          if (!ne.field_v) {
            return;
          } else {
            og.field_r.a(1, (byte) 120, param0 | -16777216, 1, param1, param2);
            return;
          }
        } else {
          dma.a(param2, param1, param0);
          return;
        }
    }

    abstract void a(int param0, java.awt.Component param1);

    public static void a(int param0) {
        field_a = null;
        if (param0 != -25692) {
            fg.a(4);
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    abstract int b(int param0);

    final static boolean a(char param0, int param1) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 > 22) {
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (45 == param0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_a = null;
          if (param0 != 160) {
            if (param0 != 32) {
              if (param0 != 95) {
                if (45 == param0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Private";
    }
}
