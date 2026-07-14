/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    int field_c;
    static String field_d;
    int[] field_b;
    static java.awt.Font field_a;
    int field_e;

    final int a(boolean param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param0) {
          if (null != ((ha) this).field_b) {
            if (((ha) this).field_b.length != 0) {
              var3 = 1;
              L0: while (true) {
                if (((ha) this).field_b.length > var3) {
                  if (param1 >= ((ha) this).field_b[var3] + ((ha) this).field_b[-1 + var3] >> -838636703) {
                    var3++;
                    continue L0;
                  } else {
                    return var3 - 1;
                  }
                } else {
                  return ((ha) this).field_b.length + -1;
                }
              }
            } else {
              return 0;
            }
          } else {
            return 0;
          }
        } else {
          return -25;
        }
    }

    final int b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 20) {
          if (null != ((ha) this).field_b) {
            if (((ha) this).field_b.length == 0) {
              return 0;
            } else {
              return ((ha) this).field_b[-1 + ((ha) this).field_b.length];
            }
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0;
          }
        } else {
          return -36;
        }
    }

    public static void a(int param0) {
        if (param0 != 4324) {
            ha.a(-34);
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static boolean a(byte param0) {
        if (!sr.field_h) {
          return false;
        } else {
          if (param0 > 94) {
            if (em.field_h != 0) {
              return false;
            } else {
              return true;
            }
          } else {
            boolean discarded$5 = ha.a((byte) 11);
            if (em.field_h != 0) {
              return false;
            } else {
              return true;
            }
          }
        }
    }

    ha(int param0, int param1, int param2) {
        ((ha) this).field_e = param0;
        ((ha) this).field_c = param1;
        ((ha) this).field_b = new int[1 + param2];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Pause Menu";
    }
}
