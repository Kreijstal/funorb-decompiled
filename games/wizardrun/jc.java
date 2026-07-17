/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends mi {
    int field_G;
    static int field_I;
    static hi field_H;

    public static void g(byte param0) {
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
          if (null != ((jc) this).field_F) {
            if (((jc) this).field_G == 0) {
              return;
            } else {
              if (((jc) this).field_G == 256) {
                ((jc) this).field_F.a(((jc) this).field_o + param0, 0, param2, ((jc) this).field_l + param3);
                return;
              } else {
                var6 = new o(((jc) this).field_F.field_r, ((jc) this).field_F.field_n);
                ud.a(var6, false);
                ((jc) this).field_F.a(0, 0, param2, 0);
                bb.b(4);
                var6.c(param0 + ((jc) this).field_o, ((jc) this).field_l + param3, ((jc) this).field_G);
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
        ((jc) this).field_G = 256;
    }

    jc(ub param0) {
        super(param0.field_o, param0.field_l, param0.field_r, param0.field_n, (bf) null, (ce) null);
        try {
            param0.a(114, 0, ((jc) this).field_n, ((jc) this).field_r, 0);
            ((jc) this).field_F = param0;
            ((jc) this).field_G = 256;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "jc.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = 50;
    }
}
