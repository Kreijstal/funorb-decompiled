/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends nh {
    int field_l;
    boolean field_i;
    int field_k;
    int field_j;
    byte[] field_h;

    final hh a(dd param0) {
        ((hh) this).field_h = param0.a(-128, ((hh) this).field_h);
        ((hh) this).field_j = param0.a(((hh) this).field_j, (byte) -87);
        if (((hh) this).field_k == ((hh) this).field_l) {
          ((hh) this).field_l = param0.a(false, ((hh) this).field_k);
          ((hh) this).field_k = param0.a(false, ((hh) this).field_k);
          return (hh) this;
        } else {
          L0: {
            ((hh) this).field_k = param0.a(false, ((hh) this).field_k);
            ((hh) this).field_l = param0.a(false, ((hh) this).field_l);
            if (((hh) this).field_k != ((hh) this).field_l) {
              break L0;
            } else {
              ((hh) this).field_k = ((hh) this).field_k - 1;
              break L0;
            }
          }
          return (hh) this;
        }
    }

    hh(int param0, byte[] param1, int param2, int param3) {
        ((hh) this).field_j = param0;
        ((hh) this).field_h = param1;
        ((hh) this).field_k = param2;
        ((hh) this).field_l = param3;
    }

    hh(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((hh) this).field_j = param0;
        ((hh) this).field_h = param1;
        ((hh) this).field_k = param2;
        ((hh) this).field_l = param3;
        ((hh) this).field_i = param4 ? true : false;
    }
}
