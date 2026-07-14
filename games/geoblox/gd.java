/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd extends e {
    int field_g;
    int field_h;
    int field_j;
    boolean field_i;
    byte[] field_k;

    final gd a(ue param0) {
        ((gd) this).field_k = param0.a(99, ((gd) this).field_k);
        ((gd) this).field_h = param0.a(-128, ((gd) this).field_h);
        if (((gd) this).field_g == ((gd) this).field_j) {
          ((gd) this).field_j = param0.b(((gd) this).field_g, 6);
          ((gd) this).field_g = param0.b(((gd) this).field_g, 6);
          return (gd) this;
        } else {
          L0: {
            ((gd) this).field_g = param0.b(((gd) this).field_g, 6);
            ((gd) this).field_j = param0.b(((gd) this).field_j, 6);
            if (((gd) this).field_g != ((gd) this).field_j) {
              break L0;
            } else {
              ((gd) this).field_g = ((gd) this).field_g - 1;
              break L0;
            }
          }
          return (gd) this;
        }
    }

    gd(int param0, byte[] param1, int param2, int param3) {
        ((gd) this).field_h = param0;
        ((gd) this).field_k = param1;
        ((gd) this).field_g = param2;
        ((gd) this).field_j = param3;
    }

    gd(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((gd) this).field_h = param0;
        ((gd) this).field_k = param1;
        ((gd) this).field_g = param2;
        ((gd) this).field_j = param3;
        ((gd) this).field_i = param4 ? true : false;
    }
}
