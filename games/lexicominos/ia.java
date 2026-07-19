/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends mg {
    static db field_G;
    static int field_C;
    static String field_F;
    static db field_H;
    int field_E;

    final static void a(byte param0) {
        if (ta.field_g == 10) {
          sb.a(-128);
          ta.field_g = 11;
          fh.field_i = true;
          if (param0 > 33) {
            return;
          } else {
            ia.h(-116);
            return;
          }
        } else {
          if (!ca.d(true)) {
            sb.a(-128);
            ta.field_g = 11;
            fh.field_i = true;
            if (param0 <= 33) {
              ia.h(-116);
              return;
            } else {
              return;
            }
          } else {
            fh.field_i = true;
            if (param0 > 33) {
              return;
            } else {
              ia.h(-116);
              return;
            }
          }
        }
    }

    ia(w param0) {
        super(param0.field_t, param0.field_o, param0.field_j, param0.field_v, (rd) null, (vd) null);
        try {
            param0.a(this.field_v, this.field_j, true, 0, 0);
            this.field_A = param0;
            this.field_E = 256;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        db var6 = null;
        if (param3 == 0) {
          if (this.field_A == null) {
            return;
          } else {
            if (this.field_E == 0) {
              return;
            } else {
              if ((this.field_E ^ -1) == -257) {
                this.field_A.a((byte) -115, this.field_o + param1, param2 + this.field_t, param3);
                return;
              } else {
                var6 = new db(this.field_A.field_j, this.field_A.field_v);
                de.a(var6, 6);
                this.field_A.a(param0, 0, 0, param3);
                pd.a(-22949);
                var6.b(this.field_t + param2, param1 + this.field_o, this.field_E);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void h(int param0) {
        field_H = null;
        field_G = null;
        field_F = null;
        if (param0 != 0) {
            ia.h(126);
        }
    }

    public ia() {
        super(0, 0, 0, 0, (rd) null, (vd) null);
        this.field_E = 256;
    }

    static {
        field_C = 64;
        field_F = "Loading animations";
    }
}
