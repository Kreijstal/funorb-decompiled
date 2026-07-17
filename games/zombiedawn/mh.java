/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends pa {
    int field_H;
    static cg field_I;
    static int field_F;
    static int field_G;
    static ec field_E;

    public static void e() {
        field_I = null;
        field_E = null;
        int var1 = -24;
    }

    final void a(int param0, int param1, int param2, int param3) {
        vn var5 = null;
        if (param3 == param1) {
          if (((mh) this).field_z == null) {
            return;
          } else {
            if (((mh) this).field_H != 0) {
              if (256 == ((mh) this).field_H) {
                ((mh) this).field_z.a(param0 - -((mh) this).field_j, param1, param2 - -((mh) this).field_k, param3);
                return;
              } else {
                var5 = new vn(((mh) this).field_z.field_i, ((mh) this).field_z.field_n);
                ki.a((byte) -108, var5);
                ((mh) this).field_z.a(0, param1, 0, param3);
                pa.a(-21189);
                var5.e(param2 - -((mh) this).field_k, param0 + ((mh) this).field_j, ((mh) this).field_H);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    mh(ga param0) {
        super(param0.field_k, param0.field_j, param0.field_i, param0.field_n, (io) null, (sk) null);
        try {
            param0.a(61, 0, 0, ((mh) this).field_i, ((mh) this).field_n);
            ((mh) this).field_z = param0;
            ((mh) this).field_H = 256;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "mh.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, int param5, ec param6, int param7, int param8) {
        try {
            qj.field_e = param1;
            lc.field_a = param6;
            gd.field_u = param3;
            bd.field_j = param4;
            wh.field_b = param2;
            ha.field_a = param0;
            nd.field_a = param5;
            if (param7 != 0) {
                Object var10 = null;
                mh.a(55, -23, -91, (String) null, 112, -70, (ec) null, 37, -64);
            }
            uj.field_d = param8;
            tf.field_c = (pc) (Object) new lh();
            he.field_d = new sh(param6);
            ep.field_l = new bp(tf.field_c, he.field_d);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "mh.E(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    public mh() {
        super(0, 0, 0, 0, (io) null, (sk) null);
        ((mh) this).field_H = 256;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new cg(7, 0, 1, 1);
    }
}
