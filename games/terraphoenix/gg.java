/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gg extends id {
    int field_j;
    int field_m;
    int field_l;
    byte[] field_k;
    boolean field_i;

    final gg a(m param0) {
        ((gg) this).field_k = param0.a((byte) 109, ((gg) this).field_k);
        ((gg) this).field_l = param0.a(((gg) this).field_l, true);
        if (((gg) this).field_j == ((gg) this).field_m) {
          ((gg) this).field_m = param0.a((byte) 46, ((gg) this).field_j);
          ((gg) this).field_j = param0.a((byte) 46, ((gg) this).field_j);
          return (gg) this;
        } else {
          L0: {
            ((gg) this).field_j = param0.a((byte) 46, ((gg) this).field_j);
            ((gg) this).field_m = param0.a((byte) 46, ((gg) this).field_m);
            if (((gg) this).field_j != ((gg) this).field_m) {
              break L0;
            } else {
              ((gg) this).field_j = ((gg) this).field_j - 1;
              break L0;
            }
          }
          return (gg) this;
        }
    }

    gg(int param0, byte[] param1, int param2, int param3) {
        ((gg) this).field_l = param0;
        ((gg) this).field_k = param1;
        ((gg) this).field_j = param2;
        ((gg) this).field_m = param3;
    }

    gg(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((gg) this).field_l = param0;
        ((gg) this).field_k = param1;
        ((gg) this).field_j = param2;
        ((gg) this).field_m = param3;
        ((gg) this).field_i = param4 ? true : false;
    }
}
