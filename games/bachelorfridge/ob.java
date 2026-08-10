/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends kj {
    private int field_f;
    static ok field_g;

    final boolean b(int param0) {
        int fieldTemp$1 = this.field_f - 1;
        this.field_f = this.field_f - 1;
        if (0 <= fieldTemp$1) {
          if (param0 <= 21) {
            this.b(-23);
            return false;
          } else {
            return false;
          }
        } else {
          this.field_e.field_h.d(-1, this.field_c, this.field_d);
          return true;
        }
    }

    final static void a(long param0, byte param1, int param2, int param3, String param4) {
        try {
            oa.field_vb = param3;
            el.field_h = param2;
            wg.field_g = true;
            we.field_b = param0;
            hda.field_l = param4;
            if (param1 != -47) {
                ob.c(0);
            }
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ob.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.b(1);
        }
    }

    ob(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        try {
            this.field_f = 100;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            field_g = (ok) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static void a(String param0, int param1, int[] param2, String param3, int param4, byte param5, int param6, String param7, kga param8, int[] param9) {
        try {
            gfa.field_a[param4] = new wca(param6, param0, param7, param2, param9, param1, param8, param3);
            if (param5 != 22) {
                String var11 = (String) null;
                ob.a(-114L, (byte) -127, -69, -33, (String) null);
            }
            param4++;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ob.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + (param8 != null ? "{...}" : "null") + ',' + (param9 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
          return;
        } else {
          co.field_b[4].a(param2, -64 + param0, (100 + -this.field_f) * 192 / 100);
          return;
        }
    }

    static {
    }
}
