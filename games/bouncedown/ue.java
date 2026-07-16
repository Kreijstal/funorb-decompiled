/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends ic {
    int field_i;
    int field_l;
    byte[] field_h;
    boolean field_j;
    int field_k;

    final ue a(u param0) {
        ((ue) this).field_h = param0.a(((ue) this).field_h, true);
        ((ue) this).field_k = param0.a(false, ((ue) this).field_k);
        if (((ue) this).field_i == ((ue) this).field_l) {
          int dupTemp$2 = param0.a(((ue) this).field_i, 6);
          ((ue) this).field_l = dupTemp$2;
          ((ue) this).field_i = dupTemp$2;
          return (ue) this;
        } else {
          L0: {
            ((ue) this).field_i = param0.a(((ue) this).field_i, 6);
            ((ue) this).field_l = param0.a(((ue) this).field_l, 6);
            if (((ue) this).field_i != ((ue) this).field_l) {
              break L0;
            } else {
              ((ue) this).field_i = ((ue) this).field_i - 1;
              break L0;
            }
          }
          return (ue) this;
        }
    }

    ue(int param0, byte[] param1, int param2, int param3) {
        ((ue) this).field_k = param0;
        ((ue) this).field_h = param1;
        ((ue) this).field_i = param2;
        ((ue) this).field_l = param3;
    }

    ue(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((ue) this).field_k = param0;
        ((ue) this).field_h = param1;
        ((ue) this).field_i = param2;
        ((ue) this).field_l = param3;
        ((ue) this).field_j = param4 ? true : false;
    }
}
