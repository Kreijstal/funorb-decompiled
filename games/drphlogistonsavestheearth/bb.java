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
        int stackIn_7_0 = 0;
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
          bb.a((byte) 20);
          if (this != uf.field_c) {
            if (this == sg.field_d) {
              return true;
            } else {
              L0: {
                if (this != ik.field_d) {
                  stackIn_7_0 = 0;
                  break L0;
                } else {
                  stackIn_7_0 = 1;
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
        oh.field_a = true;
        ab.field_a = 15000L + la.a(false);
        if (param0 != -103) {
          L0: {
            field_g = -116;
            if (af.field_b != 11) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (af.field_b != 11) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
