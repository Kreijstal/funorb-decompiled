/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends dm {
    private String field_h;
    private String field_k;
    static ug field_i;
    static ci field_j;
    static int[] field_l;
    static java.awt.Frame field_e;
    static eb field_d;
    static String field_f;
    static String field_g;

    final static String e(byte param0) {
        String var1;
        String var1Lifetime1;
        if (param0 <= -42) {
          var1 = "";
          if (null != um.field_b) {
            var1 = um.field_b.i((byte) 52);
          }
          if (var1.length() == 0) {
            var1 = am.b((byte) -84);
          }
          if (var1.length() == 0) {
            var1 = ql.field_e;
          }
          return var1;
        }
        ec.d((byte) 58);
        var1Lifetime1 = "";
        if (null != um.field_b) {
          var1Lifetime1 = um.field_b.i((byte) 52);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = am.b((byte) -84);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = ql.field_e;
        }
        return var1Lifetime1;
    }

    final static int c(byte param0) {
        int var2 = 0;
        un var1 = uh.i(param0 ^ -23115);
        int var2Lifetime1;
        int var2Lifetime2;
        if (param0 != -63) {
          return -28;
        }
        if (var1 == null) {
          var2 = 0;
          return var2;
        }
        if (var1.field_b) {
          var2Lifetime1 = -(480 - uh.field_m.field_wb) / 2;
          return var2Lifetime1;
        }
        var2Lifetime2 = 0;
        return var2Lifetime2;
    }

    public static void d(byte param0) {
        field_i = null;
        field_e = null;
        field_f = null;
        if (param0 == 98) {
          field_l = null;
          field_j = null;
          field_g = null;
          field_d = null;
          return;
        }
        field_g = (String) null;
        field_l = null;
        field_j = null;
        field_g = null;
        field_d = null;
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        if (param3) {
          if (hg.field_d[param1] < hg.field_d[param2]) {
            return true;
          }
          if (hg.field_d[param1] > hg.field_d[param2]) {
            return false;
          }
          if (gh.field_a[param1] < gh.field_a[param2]) {
            return true;
          }
          if (gh.field_a[param1] > gh.field_a[param2]) {
            return false;
          }
          var5 = 28 / ((param0 - 59) / 61);
          var4 = in.field_j[param1] + (hn.field_e[param1] + oc.field_n[param1]);
          var6 = in.field_j[param2] + hn.field_e[param2] + oc.field_n[param2];
          if (var6 > var4) {
            return true;
          }
          if (var6 < var4) {
            return false;
          }
          return !(param2 <= param1);
        }
        if (gh.field_a[param2] > gh.field_a[param1]) {
          return true;
        }
        if (gh.field_a[param1] > gh.field_a[param2]) {
          return false;
        }
        if (hg.field_d[param2] > hg.field_d[param1]) {
          return true;
        }
        if (hg.field_d[param1] > hg.field_d[param2]) {
          return false;
        }
        var5Lifetime1 = 28 / ((param0 - 59) / 61);
        var4Lifetime1 = in.field_j[param1] + (hn.field_e[param1] + oc.field_n[param1]);
        var6Lifetime1 = in.field_j[param2] + hn.field_e[param2] + oc.field_n[param2];
        if (var6Lifetime1 > var4Lifetime1) {
          return true;
        }
        if (var6Lifetime1 < var4Lifetime1) {
          return false;
        }
        if (param2 <= param1) {
          return false;
        }
        return true;
    }

    final void a(p param0, byte param1) {
        try {
          param0.a(true, this.field_k);
          param0.a(this.field_h, false);
          if (param1 != 123) {
            this.field_k = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ec.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ec(String param0, String param1) {
        try {
          this.field_h = param1;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ec.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final ug b(byte param0) {
        if (param0 <= 27) {
          p var3 = (p) null;
          this.a((p) null, (byte) -84);
          return field_i;
        }
        return field_i;
    }

    static {
        field_i = new ug(3);
        field_g = "Rook";
    }
}
