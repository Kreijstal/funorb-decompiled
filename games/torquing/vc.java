/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vc {
    static kh[] field_c;
    static int[] field_a;
    static t field_b;
    static int field_d;

    abstract int b(int param0);

    final static void a(t param0, boolean param1) {
        try {
          kj.field_b = param0;
          if (param1) {
            field_a = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "vc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!param0) {
          if (ji.field_a[param1] > ji.field_a[param3]) {
            return true;
          }
          if (ji.field_a[param1] < ji.field_a[param3]) {
            return false;
          }
          if (il.field_o[param3] < il.field_o[param1]) {
            return true;
          }
          if (il.field_o[param1] < il.field_o[param3]) {
            return false;
          }
          var4 = vp.field_F[param3] + vo.field_d[param3] + wh.field_y[param3];
          var5 = wh.field_y[param1] + vo.field_d[param1] + vp.field_F[param1];
          if (var5 > var4) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          if (param2 == 0) {
            return !(param3 >= param1);
          }
          field_b = (t) null;
          return !(param3 >= param1);
        }
        if (il.field_o[param1] > il.field_o[param3]) {
          return true;
        }
        if (il.field_o[param3] > il.field_o[param1]) {
          return false;
        }
        if (ji.field_a[param1] > ji.field_a[param3]) {
          return true;
        }
        if (ji.field_a[param1] < ji.field_a[param3]) {
          return false;
        }
        var4Lifetime1 = vp.field_F[param3] + vo.field_d[param3] + wh.field_y[param3];
        var5Lifetime1 = wh.field_y[param1] + vo.field_d[param1] + vp.field_F[param1];
        if (var5Lifetime1 > var4Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        if (param2 == 0) {
          return !(param3 >= param1);
        }
        field_b = (t) null;
        if (param3 >= param1) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_c = null;
    }

    final static k[] c(int param0) {
        if (param0 == 0) {
          return new k[]{fh.field_t, np.field_k, cc.field_a, jp.field_p, eo.field_b, mc.field_k, gp.field_L, lb.field_z, da.field_d, qk.field_r, ag.field_a, aq.field_a, ip.field_a, qd.field_f};
        }
        field_d = -64;
        return new k[]{fh.field_t, np.field_k, cc.field_a, jp.field_p, eo.field_b, mc.field_k, gp.field_L, lb.field_z, da.field_d, qk.field_r, ag.field_a, aq.field_a, ip.field_a, qd.field_f};
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void a(int param0, java.awt.Component param1);

    static {
        field_d = 0;
    }
}
