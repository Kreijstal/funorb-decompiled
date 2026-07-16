/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends gg {
    int field_o;
    boolean field_p;
    byte[] field_r;
    int field_q;
    int field_s;

    final ji a(wm param0) {
        ((ji) this).field_r = param0.a(true, ((ji) this).field_r);
        ((ji) this).field_s = param0.b(((ji) this).field_s, (byte) 80);
        if (((ji) this).field_q == ((ji) this).field_o) {
          int dupTemp$2 = param0.a(((ji) this).field_q, (byte) -124);
          ((ji) this).field_o = dupTemp$2;
          ((ji) this).field_q = dupTemp$2;
          return (ji) this;
        } else {
          L0: {
            ((ji) this).field_q = param0.a(((ji) this).field_q, (byte) -123);
            ((ji) this).field_o = param0.a(((ji) this).field_o, (byte) -124);
            if (((ji) this).field_q != ((ji) this).field_o) {
              break L0;
            } else {
              ((ji) this).field_q = ((ji) this).field_q - 1;
              break L0;
            }
          }
          return (ji) this;
        }
    }

    ji(int param0, byte[] param1, int param2, int param3) {
        ((ji) this).field_s = param0;
        ((ji) this).field_r = param1;
        ((ji) this).field_q = param2;
        ((ji) this).field_o = param3;
    }

    ji(int param0, byte[] param1, int param2, int param3, boolean param4) {
        ((ji) this).field_s = param0;
        ((ji) this).field_r = param1;
        ((ji) this).field_q = param2;
        ((ji) this).field_o = param3;
        ((ji) this).field_p = param4 ? true : false;
    }
}
