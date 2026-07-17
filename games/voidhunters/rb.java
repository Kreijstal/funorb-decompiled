/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rb {
    static ij field_c;
    int field_b;
    String field_a;

    final static boolean a(int param0, int param1, int param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -6070) {
          L0: {
            boolean discarded$13 = rb.a(-47, -38, 120);
            if (0 == (2048 & param2)) {
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
            if (0 == (2048 & param2)) {
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

    final java.net.Socket a(boolean param0) throws IOException {
        if (param0) {
          ((rb) this).field_b = 48;
          return new java.net.Socket(((rb) this).field_a, ((rb) this).field_b);
        } else {
          return new java.net.Socket(((rb) this).field_a, ((rb) this).field_b);
        }
    }

    public static void a() {
        field_c = null;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    static {
    }
}
