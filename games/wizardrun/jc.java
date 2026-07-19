/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends mi {
    int field_G;
    static int field_I;
    static hi field_H;

    public static void g(byte param0) {
        if (param0 != -19) {
            return;
        }
        field_H = null;
    }

    final static void a(byte param0, int param1) {
        if (param0 <= 37) {
            jc.a((byte) 83, 58);
            w.field_a = param1;
            return;
        }
        w.field_a = param1;
    }

    final void a(int param0, int param1, int param2, int param3) {
        o var6 = null;
        if (param2 == param1) {
          if (null != this.field_F) {
            if (-1 == (this.field_G ^ -1)) {
              return;
            } else {
              if ((this.field_G ^ -1) == -257) {
                this.field_F.a(this.field_o + param0, 0, param2, this.field_l + param3);
                return;
              } else {
                var6 = new o(this.field_F.field_r, this.field_F.field_n);
                ud.a(var6, false);
                this.field_F.a(0, 0, param2, 0);
                bb.b(4);
                var6.c(param0 + this.field_o, this.field_l + param3, this.field_G);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public jc() {
        super(0, 0, 0, 0, (bf) null, (ce) null);
        this.field_G = 256;
    }

    jc(ub param0) {
        super(param0.field_o, param0.field_l, param0.field_r, param0.field_n, (bf) null, (ce) null);
        try {
            param0.a(114, 0, this.field_n, this.field_r, 0);
            this.field_F = param0;
            this.field_G = 256;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_I = 50;
    }
}
