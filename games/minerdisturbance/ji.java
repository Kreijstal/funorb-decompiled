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
        int dupTemp$2 = 0;
        this.field_r = param0.a(true, this.field_r);
        this.field_s = param0.b(this.field_s, (byte) 80);
        if (this.field_q == this.field_o) {
          dupTemp$2 = param0.a(this.field_q, (byte) -124);
          this.field_o = dupTemp$2;
          this.field_q = dupTemp$2;
          return (ji) (this);
        } else {
          L0: {
            this.field_q = param0.a(this.field_q, (byte) -123);
            this.field_o = param0.a(this.field_o, (byte) -124);
            if (this.field_q != this.field_o) {
              break L0;
            } else {
              this.field_q = this.field_q - 1;
              break L0;
            }
          }
          return (ji) (this);
        }
    }

    ji(int param0, byte[] param1, int param2, int param3) {
        this.field_s = param0;
        this.field_r = param1;
        this.field_q = param2;
        this.field_o = param3;
    }

    ji(int param0, byte[] param1, int param2, int param3, boolean param4) {
        this.field_s = param0;
        this.field_r = param1;
        this.field_q = param2;
        this.field_o = param3;
        this.field_p = param4 ? true : false;
    }
}
