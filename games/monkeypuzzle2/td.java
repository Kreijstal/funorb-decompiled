/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends jl {
    int field_f;
    boolean field_h;
    int field_g;
    int field_i;
    byte[] field_j;

    final td a(o param0) {
        ((td) this).field_j = param0.a(false, ((td) this).field_j);
        ((td) this).field_f = param0.a(((td) this).field_f, -98);
        if (((td) this).field_i == ((td) this).field_g) {
          int dupTemp$2 = param0.a(((td) this).field_i, (byte) 44);
          ((td) this).field_g = dupTemp$2;
          ((td) this).field_i = dupTemp$2;
          return (td) this;
        } else {
          L0: {
            ((td) this).field_i = param0.a(((td) this).field_i, (byte) 80);
            ((td) this).field_g = param0.a(((td) this).field_g, (byte) 94);
            if (((td) this).field_i != ((td) this).field_g) {
              break L0;
            } else {
              ((td) this).field_i = ((td) this).field_i - 1;
              break L0;
            }
          }
          return (td) this;
        }
    }

    td(int param0, byte[] param1, int param2, int param3) {
        ((td) this).field_f = param0;
        ((td) this).field_j = param1;
        ((td) this).field_i = param2;
        ((td) this).field_g = param3;
    }

    td(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((td) this).field_f = param0;
        ((td) this).field_j = param1;
        ((td) this).field_i = param2;
        ((td) this).field_g = param3;
        ((td) this).field_h = param4 ? true : false;
    }
}
