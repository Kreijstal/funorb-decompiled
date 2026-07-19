/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh extends pa {
    int field_H;
    static cg field_I;
    static int field_F;
    static int field_G;
    static ec field_E;

    public static void e(byte param0) {
        field_I = null;
        field_E = null;
        int var1 = -49 / ((65 - param0) / 51);
    }

    final void a(int param0, int param1, int param2, int param3) {
        vn var6 = null;
        if (param3 == param1) {
          if (this.field_z == null) {
            return;
          } else {
            if (this.field_H != 0) {
              if (256 == this.field_H) {
                this.field_z.a(param0 - -this.field_j, param1, param2 - -this.field_k, param3 ^ 0);
                return;
              } else {
                var6 = new vn(this.field_z.field_i, this.field_z.field_n);
                ki.a((byte) -108, var6);
                this.field_z.a(0, param1, 0, param3 + 0);
                pa.a(-21189);
                var6.e(param2 - -this.field_k, param0 + this.field_j, this.field_H);
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
            param0.a(61, 0, 0, this.field_i, this.field_n);
            this.field_z = param0;
            this.field_H = 256;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "mh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
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
                ec var10 = (ec) null;
                mh.a(55, -23, -91, (String) null, 112, -70, (ec) null, 37, -64);
            }
            uj.field_d = param8;
            tf.field_c = (pc) ((Object) new lh());
            he.field_d = new sh(param6);
            ep.field_l = new bp(tf.field_c, he.field_d);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "mh.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ',' + param8 + ')');
        }
    }

    public mh() {
        super(0, 0, 0, 0, (io) null, (sk) null);
        this.field_H = 256;
    }

    static {
        field_I = new cg(7, 0, 1, 1);
    }
}
