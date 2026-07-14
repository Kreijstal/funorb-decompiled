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
        ((bu) this).field_h = param3;
        ((bu) this).field_i = 64;
        kv var5 = param0.field_s.field_p;
        ((bu) this).field_f = new kv(var5.field_q, var5.field_p);
        bu.a(0, ((bu) this).field_f);
        var5.e(0, 0, 16777215);
        db.b(62);
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
        dg.a(param1.field_v, param1.field_n, param1.field_o);
    }

    final boolean b(int param0) {
        ((bu) this).field_i = ((bu) this).field_i - 1;
        if (0 >= ((bu) this).field_i - 1) {
          if (param0 <= 21) {
            ((bu) this).field_f = null;
            return true;
          } else {
            return true;
          }
        } else {
          if ((((bu) this).field_i ^ -1) == -33) {
            ((bu) this).field_e.field_T[((bu) this).field_h] = ((bu) this).field_e.field_T[((bu) this).field_h] + 1;
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = (int)(128.0 * (-Math.cos(3.141592653589793 * (double)((bu) this).field_i / 32.0) + 1.0));
        this.a(param0, param1, param2);
        ((bu) this).field_f.a(param2, param0, var4);
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            ((bu) this).a(-35, false, -42);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Please check if address is correct";
    }
}
