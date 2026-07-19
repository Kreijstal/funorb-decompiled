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
        L0: {
          if (0 != (rc.field_f ^ -1)) {
            break L0;
          } else {
            if (hj.a(1, true)) {
              rc.field_f = MonkeyPuzzle2.field_D.a((byte) 114);
              MonkeyPuzzle2.field_D.field_h = 0;
              break L0;
            } else {
              return false;
            }
          }
        }
        L1: {
          if (-2 != rc.field_f) {
            break L1;
          } else {
            if (!hj.a(2, true)) {
              return false;
            } else {
              rc.field_f = MonkeyPuzzle2.field_D.j(17277);
              MonkeyPuzzle2.field_D.field_h = 0;
              break L1;
            }
          }
        }
        if (!param0) {
          field_i = 83;
          return hj.a(rc.field_f, param0);
        } else {
          return hj.a(rc.field_f, param0);
        }
    }

    final void c(byte param0) {
        float[] var2 = null;
        float var3 = 0.0f;
        float[] var4 = null;
        float[] var5 = null;
        float[] var6 = null;
        float[] var7 = null;
        float[] var8 = null;
        float[] var9 = null;
        if (param0 != 122) {
          L0: {
            L1: {
              this.field_k = (wg) null;
              if (this.field_m) {
                break L1;
              } else {
                var8 = ac.a(this.field_k.field_e, 123, this.field_e.field_e);
                var6 = var8;
                var4 = var6;
                var2 = var4;
                var3 = wg.a(var8, (byte) 115);
                oa.a(this.field_l / (var3 + this.field_l) - 0.5f, var8, 107);
                mh.a(this.field_k.field_e, (byte) -126, var8);
                wj.a(this.field_e.field_e, -74, var8);
                if (!MonkeyPuzzle2.field_F) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var9 = ac.a(this.field_k.field_e, 114, this.field_g);
            var7 = var9;
            var5 = var7;
            var2 = var5;
            var3 = wg.a(var9, (byte) 120);
            oa.a((-0.5f + this.field_l / (this.field_l + var3)) * 2.0f, var9, 126);
            mh.a(this.field_k.field_e, (byte) -125, var9);
            break L0;
          }
          return;
        } else {
          L2: {
            L3: {
              if (this.field_m) {
                break L3;
              } else {
                var8 = ac.a(this.field_k.field_e, 123, this.field_e.field_e);
                var6 = var8;
                var4 = var6;
                var2 = var4;
                var3 = wg.a(var8, (byte) 115);
                oa.a(this.field_l / (var3 + this.field_l) - 0.5f, var8, 107);
                mh.a(this.field_k.field_e, (byte) -126, var8);
                wj.a(this.field_e.field_e, -74, var8);
                if (!MonkeyPuzzle2.field_F) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var9 = ac.a(this.field_k.field_e, 114, this.field_g);
            var7 = var9;
            var5 = var7;
            var2 = var5;
            var3 = wg.a(var9, (byte) 120);
            oa.a((-0.5f + this.field_l / (this.field_l + var3)) * 2.0f, var9, 126);
            mh.a(this.field_k.field_e, (byte) -125, var9);
            break L2;
          }
          return;
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
