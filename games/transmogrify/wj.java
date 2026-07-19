/*
 * Decompiled by CFR-JS 0.4.0.
 */
class wj extends kk {
    static String field_i;
    static ib field_j;
    static String field_k;
    private long field_m;
    static String field_l;
    static int field_o;
    private String field_n;
    static int field_h;

    final static void b(int param0) {
        if (param0 != 480) {
          wj.b(122);
          fd.a(param0 ^ 410, true, ta.field_h, hf.field_g);
          hd.field_b = true;
          return;
        } else {
          fd.a(param0 ^ 410, true, ta.field_h, hf.field_g);
          hd.field_b = true;
          return;
        }
    }

    final void a(byte param0, oa param1) {
        try {
            param1.b(1908720528, this.field_m);
            if (param0 > -50) {
                wj.b(-65);
            }
            param1.a((byte) 112, this.field_n);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "wj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_k = null;
        if (param0 != 480) {
          field_j = (ib) null;
          field_l = null;
          field_i = null;
          field_j = null;
          return;
        } else {
          field_l = null;
          field_i = null;
          field_j = null;
          return;
        }
    }

    nk a(int param0) {
        nk discarded$0 = null;
        if (param0 != -184) {
            discarded$0 = this.a(52);
            return vc.field_G;
        }
        return vc.field_G;
    }

    wj(long param0, String param1) {
        try {
            this.field_n = param1;
            this.field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "wj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_l = "Type your age in years";
        field_i = "Email is valid";
        field_h = 480;
    }
}
