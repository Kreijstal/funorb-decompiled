/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb extends ug {
    static int field_o;
    private boolean field_m;
    private wg field_k;
    private wg field_e;
    static String field_n;
    private float[] field_g;
    static int field_i;
    private float field_l;
    static volatile boolean field_j;
    static boolean[] field_h;
    static int field_f;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static int a(byte param0) {
        if (param0 != 57) {
          field_h = (boolean[]) null;
          return 1;
        }
        return 1;
    }

    final static void a(int param0) {
        fk.field_d = null;
        if (param0 >= -41) {
          return;
        }
        qc.field_P = null;
        da.field_c = null;
        mb.field_b = null;
        ra.field_ab = null;
        cb.field_b = (byte[][]) null;
    }

    final static boolean a(boolean param0) {
        if (rc.field_f == -1) {
          if (!hj.a(1, true)) {
            return false;
          }
          rc.field_f = MonkeyPuzzle2.field_D.a((byte) 114);
          MonkeyPuzzle2.field_D.field_h = 0;
        }
        if (-2 == rc.field_f) {
          if (!hj.a(2, true)) {
            return false;
          }
          rc.field_f = MonkeyPuzzle2.field_D.j(17277);
          MonkeyPuzzle2.field_D.field_h = 0;
        }
        if (param0) {
          return hj.a(rc.field_f, param0);
        }
        field_i = 83;
        return hj.a(rc.field_f, param0);
    }

    final void c(byte param0) {
        float[] var8 = null;
        float[] var6 = null;
        float[] var4 = null;
        float[] var2 = null;
        float var3 = 0.0f;
        float[] var9 = null;
        float[] var7 = null;
        float[] var5 = null;
        float[] var8Lifetime1;
        float[] var6Lifetime1;
        float[] var4Lifetime1;
        float[] var2Lifetime1;
        float[] var9Lifetime1;
        float[] var7Lifetime1;
        float[] var5Lifetime1;
        float var3Lifetime1;
        if (param0 == 122) {
          if (!this.field_m) {
            var8 = ac.a(this.field_k.field_e, 123, this.field_e.field_e);
            var6 = var8;
            var4 = var6;
            var2 = var4;
            var3 = wg.a(var8, (byte) 115);
            oa.a(this.field_l / (var3 + this.field_l) - 0.5f, var8, 107);
            mh.a(this.field_k.field_e, (byte) -126, var8);
            wj.a(this.field_e.field_e, -74, var8);
          } else {
            var9 = ac.a(this.field_k.field_e, 114, this.field_g);
            var7 = var9;
            var5 = var7;
            var2 = var5;
            var3 = wg.a(var9, (byte) 120);
            oa.a((-0.5f + this.field_l / (this.field_l + var3)) * 2.0f, var9, 126);
            mh.a(this.field_k.field_e, (byte) -125, var9);
          }
          return;
        }
        this.field_k = (wg) null;
        if (!this.field_m) {
          var8Lifetime1 = ac.a(this.field_k.field_e, 123, this.field_e.field_e);
          var6Lifetime1 = var8Lifetime1;
          var4Lifetime1 = var6Lifetime1;
          var2Lifetime1 = var4Lifetime1;
          var3Lifetime1 = wg.a(var8Lifetime1, (byte) 115);
          oa.a(this.field_l / (var3Lifetime1 + this.field_l) - 0.5f, var8Lifetime1, 107);
          mh.a(this.field_k.field_e, (byte) -126, var8Lifetime1);
          wj.a(this.field_e.field_e, -74, var8Lifetime1);
        } else {
          var9Lifetime1 = ac.a(this.field_k.field_e, 114, this.field_g);
          var7Lifetime1 = var9Lifetime1;
          var5Lifetime1 = var7Lifetime1;
          var2Lifetime1 = var5Lifetime1;
          var3Lifetime1 = wg.a(var9Lifetime1, (byte) 120);
          oa.a((-0.5f + this.field_l / (this.field_l + var3Lifetime1)) * 2.0f, var9Lifetime1, 126);
          mh.a(this.field_k.field_e, (byte) -125, var9Lifetime1);
        }
    }

    gb(wg param0, wg param1, float param2) {
        this.field_g = new float[2];
        try {
          this.field_e = param1;
          this.field_l = param2 * param2;
          this.field_m = false;
          this.field_k = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    gb(wg param0, float param1, float param2, float param3) {
        this.field_g = new float[2];
        try {
          this.field_m = true;
          this.field_g[0] = param1;
          this.field_l = param3 * param3;
          this.field_k = param0;
          this.field_g[1] = param2;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b(byte param0) {
        field_h = null;
        field_n = null;
        if (param0 > -79) {
          gb.a(33);
        }
    }

    static {
        field_o = 0;
        field_n = "Visit the Account Management section on the main site to view.";
        field_i = 64;
        field_j = true;
        field_f = -1;
    }
}
