/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends ti {
    int field_p;
    byte[] field_o;
    int field_q;
    boolean field_r;
    int field_s;

    final ud a(je param0) {
        ((ud) this).field_o = param0.a(14, ((ud) this).field_o);
        ((ud) this).field_p = param0.a(false, ((ud) this).field_p);
        if (((ud) this).field_q == ((ud) this).field_s) {
          int dupTemp$2 = param0.b(((ud) this).field_q, 114);
          ((ud) this).field_s = dupTemp$2;
          ((ud) this).field_q = dupTemp$2;
          return (ud) this;
        } else {
          L0: {
            ((ud) this).field_q = param0.b(((ud) this).field_q, 86);
            ((ud) this).field_s = param0.b(((ud) this).field_s, 36);
            if (((ud) this).field_q != ((ud) this).field_s) {
              break L0;
            } else {
              ((ud) this).field_q = ((ud) this).field_q - 1;
              break L0;
            }
          }
          return (ud) this;
        }
    }

    ud(int param0, byte[] param1, int param2, int param3) {
        ((ud) this).field_p = param0;
        ((ud) this).field_o = param1;
        ((ud) this).field_q = param2;
        ((ud) this).field_s = param3;
    }

    ud(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((ud) this).field_p = param0;
        ((ud) this).field_o = param1;
        ((ud) this).field_q = param2;
        ((ud) this).field_s = param3;
        ((ud) this).field_r = param4 ? true : false;
    }
}
