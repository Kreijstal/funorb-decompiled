/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh extends mc {
    int field_y;
    int field_o;
    int field_u;
    static hl field_q;
    static int field_w;
    int field_r;
    static int field_n;
    static a field_v;
    int field_x;
    int field_t;
    static int field_s;
    static u field_p;

    final static void b(byte param0) {
        int var1 = 0;
        var1 = 6 % ((40 - param0) / 42);
        if ((th.field_g ^ -1) >= -1) {
          if (te.field_P != pk.field_O.field_j) {
            L0: {
              ja.field_f = ja.field_f + (pk.field_O.field_j + -te.field_P);
              te.field_P = pk.field_O.field_j;
              if (-1 > (th.field_g ^ -1)) {
                lc.a((byte) -61);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if (-1 > (th.field_g ^ -1)) {
                lc.a((byte) -61);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          }
        } else {
          th.field_g = th.field_g - 1;
          if (te.field_P == pk.field_O.field_j) {
            L2: {
              if (-1 > (th.field_g ^ -1)) {
                lc.a((byte) -61);
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              ja.field_f = ja.field_f + (pk.field_O.field_j + -te.field_P);
              te.field_P = pk.field_O.field_j;
              if (-1 > (th.field_g ^ -1)) {
                lc.a((byte) -61);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_p = null;
        if (param0 != 0) {
            field_w = 3;
            field_v = null;
            return;
        }
        field_v = null;
    }

    private eh() throws Throwable {
        throw new Error();
    }

    static {
        field_n = 0;
        field_v = new a();
    }
}
