/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bu extends kj {
    private int field_h;
    private kv field_f;
    static String field_g;
    static sna field_j;
    private int field_i;

    bu(gj param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        kv var5 = null;
        try {
            this.field_h = param3;
            this.field_i = 64;
            var5 = param0.field_s.field_p;
            this.field_f = new kv(var5.field_q, var5.field_p);
            bu.a(0, this.field_f);
            var5.e(0, 0, 16777215);
            db.b(62);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void c(int param0) {
        field_j = null;
        field_g = null;
        int var1 = 81 / ((14 - param0) / 62);
    }

    final static void a(int param0, kv param1) {
        uc.d(125);
        if (param0 != 0) {
            return;
        }
        try {
            dg.a(param1.field_v, param1.field_n, param1.field_o);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "bu.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0) {
        int fieldTemp$2 = this.field_i - 1;
        this.field_i = this.field_i - 1;
        if (0 >= fieldTemp$2) {
          if (param0 <= 21) {
            this.field_f = (kv) null;
            return true;
          } else {
            return true;
          }
        } else {
          if ((this.field_i ^ -1) == -33) {
            this.field_e.field_T[this.field_h] = this.field_e.field_T[this.field_h] + 1;
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = (int)(128.0 * (-Math.cos(3.141592653589793 * (double)this.field_i / 32.0) + 1.0));
        super.a(param0, param1, param2);
        this.field_f.a(param2, param0, var4);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.a(-35, false, -42);
        }
    }

    static {
        field_g = "Please check if address is correct";
    }
}
