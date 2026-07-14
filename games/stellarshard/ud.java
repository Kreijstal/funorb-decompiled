/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends gb {
    int field_m;
    boolean field_o;
    int field_l;
    byte[] field_n;
    int field_p;

    final ud a(qh param0) {
        ((ud) this).field_n = param0.a(85, ((ud) this).field_n);
        ((ud) this).field_m = param0.a(((ud) this).field_m, 15);
        if (((ud) this).field_l == ((ud) this).field_p) {
          ((ud) this).field_p = param0.b(((ud) this).field_l, -10689);
          ((ud) this).field_l = param0.b(((ud) this).field_l, -10689);
          return (ud) this;
        } else {
          L0: {
            ((ud) this).field_l = param0.b(((ud) this).field_l, -10689);
            ((ud) this).field_p = param0.b(((ud) this).field_p, -10689);
            if (((ud) this).field_l != ((ud) this).field_p) {
              break L0;
            } else {
              ((ud) this).field_l = ((ud) this).field_l - 1;
              break L0;
            }
          }
          return (ud) this;
        }
    }

    ud(int param0, byte[] param1, int param2, int param3) {
        ((ud) this).field_m = param0;
        ((ud) this).field_n = param1;
        ((ud) this).field_l = param2;
        ((ud) this).field_p = param3;
    }

    ud(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((ud) this).field_m = param0;
        ((ud) this).field_n = param1;
        ((ud) this).field_l = param2;
        ((ud) this).field_p = param3;
        ((ud) this).field_o = param4 ? true : false;
    }
}
