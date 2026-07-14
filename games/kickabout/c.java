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
        if (param0 != 114) {
          field_b = null;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static void a(int param0, boolean param1) {
        try {
            if (op.field_y != null) {
                // iflt L30
                // if_acmpne L22
            } else {
                or.field_d.field_n = 0;
                return;
            }
            if (0 == or.field_d.field_n) {
                if ((mp.field_i - -10000L ^ -1L) > (nj.a(86) ^ -1L)) {
                    or.field_d.b(param0, (byte) 101);
                }
            }
            if (param1) {
                return;
            }
            if (or.field_d.field_n > 0) {
                try {
                    op.field_y.a(or.field_d.field_n, (byte) -127, 0, or.field_d.field_f);
                    mp.field_i = nj.a(-117);
                } catch (IOException iOException) {
                    lr.b((byte) -116);
                }
                or.field_d.field_n = 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 != 0) {
          L0: {
            c.a(-46, true);
            if ((param2[param0 >> 141521509] & 1 << (31 & param0)) == 0) {
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
            if ((param2[param0 >> 141521509] & 1 << (31 & param0)) == 0) {
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
