/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    static String field_a;
    static ed field_b;
    static er[][] field_d;
    static int[] field_c;

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -3) {
          L0: {
            field_a = (String) null;
            if ((param1 ^ -1) != -3) {
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
            if ((param1 ^ -1) != -3) {
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

    final static void a(int param0, byte param1) {
        rk.field_A = hn.field_u[param0];
        if (param1 != -84) {
            kh.a((byte) 115);
        }
    }

    final static void a(byte param0) {
        tk.field_e = false;
        ed.field_t = false;
        rh.b(-14, -1);
        if (param0 != -32) {
            return;
        }
        un.field_Hb = l.field_a;
        um.field_F = l.field_a;
    }

    public static void a(boolean param0) {
        field_d = (er[][]) null;
        field_c = null;
        if (param0) {
          field_c = (int[]) null;
          field_a = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          return;
        }
    }

    static {
        field_a = "Withdraw invitation to <%0> to join this game";
    }
}
