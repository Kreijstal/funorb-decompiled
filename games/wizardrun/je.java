/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je extends kf {
    byte[] field_k;
    boolean field_j;
    int field_m;
    int field_n;
    int field_l;

    final je a(i param0) {
        ((je) this).field_k = param0.a((byte) 47, ((je) this).field_k);
        ((je) this).field_m = param0.a(true, ((je) this).field_m);
        if (((je) this).field_n == ((je) this).field_l) {
          int dupTemp$2 = param0.a((byte) 127, ((je) this).field_n);
          ((je) this).field_l = dupTemp$2;
          ((je) this).field_n = dupTemp$2;
          return (je) this;
        } else {
          L0: {
            ((je) this).field_n = param0.a((byte) 127, ((je) this).field_n);
            ((je) this).field_l = param0.a((byte) 127, ((je) this).field_l);
            if (((je) this).field_n != ((je) this).field_l) {
              break L0;
            } else {
              ((je) this).field_n = ((je) this).field_n - 1;
              break L0;
            }
          }
          return (je) this;
        }
    }

    je(int param0, byte[] param1, int param2, int param3) {
        ((je) this).field_m = param0;
        ((je) this).field_k = param1;
        ((je) this).field_n = param2;
        ((je) this).field_l = param3;
    }

    je(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((je) this).field_m = param0;
        ((je) this).field_k = param1;
        ((je) this).field_n = param2;
        ((je) this).field_l = param3;
        ((je) this).field_j = param4 ? true : false;
    }
}
