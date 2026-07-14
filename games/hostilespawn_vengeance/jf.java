/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static int field_g;
    static String field_f;
    static int field_c;
    static String field_e;
    static int[] field_b;
    static int field_d;
    static String field_h;
    static String field_a;

    final static void a(int param0, int param1) {
        nb.field_I = (param1 & 63) >> 844148836;
        if (2 >= nb.field_I) {
          dk.field_p = (12 & param1) >> -1631279870;
          eg.field_h = param1 & 3;
          if (param0 == -1631279870) {
            L0: {
              if (dk.field_p > 2) {
                dk.field_p = 2;
                break L0;
              } else {
                break L0;
              }
            }
            if (2 < eg.field_h) {
              eg.field_h = 2;
              return;
            } else {
              return;
            }
          } else {
            L1: {
              jf.a(-111, -22);
              if (dk.field_p > 2) {
                dk.field_p = 2;
                break L1;
              } else {
                break L1;
              }
            }
            if (2 < eg.field_h) {
              eg.field_h = 2;
              return;
            } else {
              return;
            }
          }
        } else {
          nb.field_I = 2;
          dk.field_p = (12 & param1) >> -1631279870;
          eg.field_h = param1 & 3;
          if (param0 != -1631279870) {
            L2: {
              jf.a(-111, -22);
              if (dk.field_p > 2) {
                dk.field_p = 2;
                break L2;
              } else {
                break L2;
              }
            }
            if (2 >= eg.field_h) {
              return;
            } else {
              eg.field_h = 2;
              return;
            }
          } else {
            L3: {
              if (dk.field_p > 2) {
                dk.field_p = 2;
                break L3;
              } else {
                break L3;
              }
            }
            if (2 < eg.field_h) {
              eg.field_h = 2;
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -32) {
            return;
        }
        field_h = null;
        field_e = null;
        field_a = null;
        field_b = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(String param0, byte param1) {
        if (param1 != 19) {
          field_d = 100;
          System.out.println("Error: " + re.a(param0, "%0a", "\n", param1 + -139));
          return;
        } else {
          System.out.println("Error: " + re.a(param0, "%0a", "\n", param1 + -139));
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_g = 0;
        field_f = "Game play";
        field_d = 50;
        field_h = "Please wait...";
        field_e = "Continue";
        field_a = "BRIEFING";
    }
}
