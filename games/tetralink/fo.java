/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo extends nn implements uc {
    private vm field_fb;
    static String field_db;
    static String field_eb;
    private int field_gb;

    final void a(na param0, int param1, int param2, boolean param3) {
        super.a(param0, param1, param2, param3);
        if (!param3) {
            return;
        }
        try {
            this.field_gb = aa.field_Nb + -this.field_t - param1;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "fo.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    fo(String param0, dn param1, int param2) {
        super(param0, param1, param2);
    }

    final void j(int param0) {
        super.j(param0);
        if (this.field_fb != null) {
            this.field_fb.a(118);
        }
    }

    final void a(byte param0, vm param1) {
        try {
            this.field_fb = param1;
            int var3_int = -96 % ((-9 - param0) / 48);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) ((Object) runtimeException), "fo.GA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String e(int param0) {
        if (this.field_r) {
          if (null != this.field_C) {
            if (param0 != 0) {
              return (String) null;
            } else {
              kj.a((byte) -77, this.field_F + -this.field_gb + aa.field_Nb, a.field_a);
              return this.field_C;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void o(int param0) {
        field_db = null;
        field_eb = null;
        if (param0 != 29790) {
            field_db = (String) null;
        }
    }

    public final vm a(int param0) {
        if (param0 >= -100) {
            vm var3 = (vm) null;
            this.a((byte) -21, (vm) null);
            return this.field_fb;
        }
        return this.field_fb;
    }

    static {
        field_db = "Rankings";
        field_eb = "Visit the Account Management section on the main site to view.";
    }
}
