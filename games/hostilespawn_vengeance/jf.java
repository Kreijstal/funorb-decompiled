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
        nb.field_I = (param1 & 63) >> 4;
        if (2 < nb.field_I) {
          nb.field_I = 2;
          dk.field_p = (12 & param1) >> 2;
          eg.field_h = param1 & 3;
          if (param0 == -1631279870) {
            if (!(dk.field_p <= 2)) {
              dk.field_p = 2;
            }
            if (2 >= eg.field_h) {
              return;
            }
            eg.field_h = 2;
            return;
          }
          jf.a(-111, -22);
          if (!(dk.field_p <= 2)) {
            dk.field_p = 2;
          }
          if (2 < eg.field_h) {
            eg.field_h = 2;
            return;
          }
          return;
        }
        dk.field_p = (12 & param1) >> 2;
        eg.field_h = param1 & 3;
        if (param0 != -1631279870) {
          jf.a(-111, -22);
          if (!(dk.field_p <= 2)) {
            dk.field_p = 2;
          }
          if (2 >= eg.field_h) {
            return;
          }
          eg.field_h = 2;
          return;
        }
        if (!(dk.field_p <= 2)) {
          dk.field_p = 2;
        }
        if (2 >= eg.field_h) {
          return;
        }
        eg.field_h = 2;
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
        if (param1 == 19) {
          System.out.println("Error: " + re.a(param0, "%0a", "\n", param1 - 139));
          return;
        }
        field_d = 100;
        System.out.println("Error: " + re.a(param0, "%0a", "\n", param1 - 139));
    }

    static {
        field_c = 0;
        field_g = 0;
        field_f = "Game play";
        field_d = 50;
        field_h = "Please wait...";
        field_e = "Continue";
        field_a = "BRIEFING";
    }
}
