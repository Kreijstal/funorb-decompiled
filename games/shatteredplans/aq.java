/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq extends oh {
    static String field_k;
    static bi field_i;
    static String field_n;
    int field_l;
    int field_m;
    static boolean[] field_p;
    static qr field_j;
    static int[] field_o;
    static double field_h;

    final static boolean a(int param0, boolean param1, int param2, boolean param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!param1) {
          aq.a(-82);
        }
        if (param3) {
          if (kf.field_f[param0] > kf.field_f[param2]) {
            return true;
          }
          if (kf.field_f[param2] > kf.field_f[param0]) {
            return false;
          }
          if (dc.field_c[param2] < dc.field_c[param0]) {
            return true;
          }
          if (dc.field_c[param2] > dc.field_c[param0]) {
            return false;
          }
          var4 = aj.field_d[param2] + fb.field_zb[param2] + f.field_y[param2];
          var5 = f.field_y[param0] + fb.field_zb[param0] + aj.field_d[param0];
          if (var4 < var5) {
            return true;
          }
          if (var5 < var4) {
            return false;
          }
          return !(param0 <= param2);
        }
        if (dc.field_c[param0] > dc.field_c[param2]) {
          return true;
        }
        if (dc.field_c[param0] < dc.field_c[param2]) {
          return false;
        }
        if (kf.field_f[param0] > kf.field_f[param2]) {
          return true;
        }
        if (kf.field_f[param2] > kf.field_f[param0]) {
          return false;
        }
        var4Lifetime1 = aj.field_d[param2] + fb.field_zb[param2] + f.field_y[param2];
        var5Lifetime1 = f.field_y[param0] + fb.field_zb[param0] + aj.field_d[param0];
        if (var4Lifetime1 < var5Lifetime1) {
          return true;
        }
        if (var5Lifetime1 < var4Lifetime1) {
          return false;
        }
        return !(param0 <= param2);
    }

    public static void a(byte param0) {
        field_j = null;
        field_i = null;
        field_o = null;
        field_n = null;
        field_p = null;
        field_k = null;
        if (param0 < 71) {
          bi var2 = (bi) null;
          aq.a((byte) 4, (bi) null);
        }
    }

    final static boolean a(int param0) {
        if (param0 < 2) {
          return false;
        }
        return np.field_m;
    }

    final static void a(byte param0, bi param1) {
        try {
          int var2_int = -121 % ((29 - param0) / 51);
          wh.a(false);
          gf.a(param1.field_B, param1.field_o, param1.field_p);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "aq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static gq a(int param0, int param1) {
        int var3 = 0;
        gq[] var2;
        int var4;
        gq[] var5;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var5 = dn.a(4);
        var2 = var5;
        for (var3 = param1; var5.length > var3; var3++) {
          if (var5[var3].field_c == param0) {
            return var5[var3];
          }
        }
        return null;
    }

    private aq() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "When ready, press <col=2F5FBF>'ENTER'</col> to continue.";
        field_n = "this resource.";
        field_h = 0.0;
        field_o = new int[8192];
    }
}
