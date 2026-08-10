/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al implements hf {
    static gl field_f;
    int field_g;
    private woa field_c;
    float[] field_b;
    static String field_a;
    int[] field_e;
    int field_d;

    final static void a(int param0) {
        CharSequence var2;
        CharSequence var3;
        if (param0 >= -84) {
          field_a = (String) null;
          kca.field_a = qga.field_b.a(-1);
          var2 = (CharSequence) ((Object) kca.field_a);
          ffb.field_e = jwa.a(false, var2);
          return;
        } else {
          kca.field_a = qga.field_b.a(-1);
          var3 = (CharSequence) ((Object) kca.field_a);
          ffb.field_e = jwa.a(false, var3);
          return;
        }
    }

    final static void a(ksa param0, ksa param1, int param2) {
        try {
            if (!(param0.field_a == null)) {
                param0.b(-3846);
            }
            param0.field_a = param1.field_a;
            param0.field_c = param1;
            param0.field_a.field_c = param0;
            if (param2 != 2) {
                ksa var4 = (ksa) null;
                al.a((ksa) null, (ksa) null, 44);
            }
            param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "al.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    al(sob param0, aja param1, woa param2) {
        wfa var6 = null;
        sda var5 = null;
        try {
            if (param1 instanceof sda) {
                var5 = (sda) ((Object) param1);
                this.field_d = var5.field_e;
                this.field_g = var5.field_q;
                this.field_e = var5.field_F;
            } else {
                if (!(param1 instanceof wfa)) {
                    throw new RuntimeException();
                }
                var6 = (wfa) ((Object) param1);
                this.field_e = var6.field_F;
                this.field_g = var6.field_q;
                this.field_d = var6.field_e;
            }
            if (param2 != null) {
                this.field_c = param2;
                if (this.field_d != this.field_c.field_a || this.field_g != this.field_c.field_c) {
                    throw new RuntimeException();
                }
                this.field_b = this.field_c.field_d;
            }
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            al.a(-57);
            field_f = null;
            field_a = null;
            return;
        }
        field_f = null;
        field_a = null;
    }

    static {
        field_f = new gl(2);
    }
}
