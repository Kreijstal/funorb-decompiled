/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class c {
    static String field_h;
    static ut[] field_f;
    static ut field_e;
    static StringBuilder field_a;
    static ut field_b;
    static String field_d;
    static boolean field_g;
    static int field_c;

    final static void a(int param0, int param1, int param2, int param3) {
        lo.a(0, param1, param2, false, (byte) -55);
        if (param0 != 31) {
            c.a(28, -64, 64, 35);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, boolean param1) {
        if (op.field_y != null) {
          if (param0 >= 0) {
            if (un.field_c != jn.field_rb) {
              or.field_d.field_n = 0;
              return;
            } else {
              L0: {
                if (0 != or.field_d.field_n) {
                  break L0;
                } else {
                  if (~(mp.field_i - -10000L) <= ~nj.a(86)) {
                    break L0;
                  } else {
                    or.field_d.b(param0, (byte) 101);
                    break L0;
                  }
                }
              }
              return;
            }
          } else {
            L1: {
              if (0 != or.field_d.field_n) {
                break L1;
              } else {
                if (~(mp.field_i - -10000L) <= ~nj.a(86)) {
                  break L1;
                } else {
                  or.field_d.b(param0, (byte) 101);
                  break L1;
                }
              }
            }
            return;
          }
        } else {
          or.field_d.field_n = 0;
          return;
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        return (param2[param0 >> 5] & 1 << (31 & param0)) != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Auction Settings";
        field_a = new StringBuilder(100);
        field_b = new ut(190, 190);
        field_d = "Game";
        field_c = 360;
    }
}
