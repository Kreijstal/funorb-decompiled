/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends ef {
    int field_j;
    int field_l;
    byte[] field_k;
    int field_i;
    boolean field_m;

    final jb a(nm param0) {
        ((jb) this).field_k = param0.a(((jb) this).field_k, 0);
        ((jb) this).field_j = param0.a(((jb) this).field_j, true);
        if (((jb) this).field_l == ((jb) this).field_i) {
          int dupTemp$2 = param0.a(((jb) this).field_l, (byte) -59);
          ((jb) this).field_i = dupTemp$2;
          ((jb) this).field_l = dupTemp$2;
          return (jb) this;
        } else {
          L0: {
            ((jb) this).field_l = param0.a(((jb) this).field_l, (byte) -59);
            ((jb) this).field_i = param0.a(((jb) this).field_i, (byte) -59);
            if (((jb) this).field_l != ((jb) this).field_i) {
              break L0;
            } else {
              ((jb) this).field_l = ((jb) this).field_l - 1;
              break L0;
            }
          }
          return (jb) this;
        }
    }

    jb(int param0, byte[] param1, int param2, int param3) {
        ((jb) this).field_j = param0;
        ((jb) this).field_k = param1;
        ((jb) this).field_l = param2;
        ((jb) this).field_i = param3;
    }

    jb(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((jb) this).field_j = param0;
        ((jb) this).field_k = param1;
        ((jb) this).field_l = param2;
        ((jb) this).field_i = param3;
        ((jb) this).field_m = param4 ? true : false;
    }
}
