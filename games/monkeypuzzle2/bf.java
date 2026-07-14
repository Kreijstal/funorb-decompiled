/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bf extends ug {
    bf field_g;
    static int field_h;
    bf field_e;
    long field_f;

    final static al a(String param0, byte param1, int param2) {
        ia var3 = new ia();
        ((al) (Object) var3).field_a = param2;
        if (param1 >= -52) {
            return null;
        }
        ((al) (Object) var3).field_b = param0;
        return (al) (Object) var3;
    }

    final void a(int param0) {
        Object var3 = null;
        if (null == ((bf) this).field_e) {
          return;
        } else {
          ((bf) this).field_e.field_g = ((bf) this).field_g;
          if (param0 != 7847) {
            var3 = null;
            al discarded$2 = bf.a((String) null, (byte) 125, 81);
            ((bf) this).field_g.field_e = ((bf) this).field_e;
            ((bf) this).field_g = null;
            ((bf) this).field_e = null;
            return;
          } else {
            ((bf) this).field_g.field_e = ((bf) this).field_e;
            ((bf) this).field_g = null;
            ((bf) this).field_e = null;
            return;
          }
        }
    }

    protected bf() {
    }

    static {
    }
}
