/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends o {
    static String field_r;
    byte[] field_q;
    static int field_k;
    static char[] field_l;
    static um field_o;
    static int field_p;
    static String field_j;
    static String[] field_n;
    static String field_m;

    final static void a(le param0, int param1, int param2, int param3) {
        try {
            if (param3 != 200) {
                td.a(40);
            }
            tm.field_d = param2;
            tn.field_m = param1;
            bl.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "td.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static km[] a(int param0, int param1) {
        km[] var2 = null;
        le var3 = null;
        km[] var4 = null;
        var4 = new km[9];
        var2 = var4;
        if (param0 != -31056) {
          var3 = (le) null;
          td.a((le) null, -77, -59, -123);
          var4[4] = rd.a(64, param1, 14727);
          return var2;
        } else {
          var4[4] = rd.a(64, param1, 14727);
          return var2;
        }
    }

    td(byte[] param0) {
        try {
            this.field_q = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_j = null;
        field_n = null;
        if (param0 != 5239) {
          field_p = 73;
          field_m = null;
          field_l = null;
          field_r = null;
          field_o = null;
          return;
        } else {
          field_m = null;
          field_l = null;
          field_r = null;
          field_o = null;
          return;
        }
    }

    static {
        field_p = 500;
        field_j = "Unable to add name - system busy";
        field_k = 20;
        field_r = "Invalid password.";
        field_l = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_m = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
