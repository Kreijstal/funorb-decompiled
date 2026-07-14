/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sf extends jf {
    int field_j;
    boolean field_n;
    int field_k;
    byte[] field_l;
    int field_m;

    final sf a(ci param0) {
        ((sf) this).field_l = param0.a(((sf) this).field_l, -108);
        ((sf) this).field_k = param0.b(((sf) this).field_k, 14698);
        if (((sf) this).field_m == ((sf) this).field_j) {
          ((sf) this).field_j = param0.a(((sf) this).field_m, 18308);
          ((sf) this).field_m = param0.a(((sf) this).field_m, 18308);
          return (sf) this;
        } else {
          L0: {
            ((sf) this).field_m = param0.a(((sf) this).field_m, 18308);
            ((sf) this).field_j = param0.a(((sf) this).field_j, 18308);
            if (((sf) this).field_m != ((sf) this).field_j) {
              break L0;
            } else {
              ((sf) this).field_m = ((sf) this).field_m - 1;
              break L0;
            }
          }
          return (sf) this;
        }
    }

    sf(int param0, int param1) {
        ((sf) this).field_k = param0;
        ((sf) this).field_l = new byte[param1];
        ((sf) this).field_m = 0;
        ((sf) this).field_j = param1;
    }

    sf(int param0, byte[] param1, int param2, int param3) {
        ((sf) this).field_k = param0;
        ((sf) this).field_l = param1;
        ((sf) this).field_m = param2;
        ((sf) this).field_j = param3;
    }

    sf(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((sf) this).field_k = param0;
        ((sf) this).field_l = param1;
        ((sf) this).field_m = param2;
        ((sf) this).field_j = param3;
        ((sf) this).field_n = param4 ? true : false;
    }
}
