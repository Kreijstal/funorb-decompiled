/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static nh field_f;
    static int field_g;
    static String[] field_e;
    static String field_d;
    static int[] field_h;
    static he field_b;
    static int field_c;
    static java.awt.Frame field_a;

    final boolean a(boolean param0) {
        boolean discarded$5 = false;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (!param0) {
          if (this != uf.field_c) {
            if (this != sg.field_d) {
              if (this == ik.field_d) {
                return true;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          discarded$5 = bb.a((byte) 20);
          if (this != uf.field_c) {
            if (this == sg.field_d) {
              return true;
            } else {
              L0: {
                if (this != ik.field_d) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L0;
                }
              }
              return stackIn_7_0 != 0;
            }
          } else {
            return true;
          }
        }
    }

    final static boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        oh.field_a = true;
        ab.field_a = 15000L + la.a(false);
        if (param0 != -103) {
          L0: {
            field_g = -116;
            if (af.field_b != 11) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (af.field_b != 11) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(boolean param0) {
        if (param0) {
            return;
        }
        field_f = null;
        field_b = null;
        field_h = null;
        field_e = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_f = new nh(540, 140);
        field_e = new String[]{"Showing by rating", "Showing by win percentage"};
        field_d = "To Customer Support";
        field_c = 20;
    }
}
