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

    final static int a() {
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
        cb.field_b = null;
    }

    final static boolean a(boolean param0) {
        if (rc.field_f == -1) {
            if (!hj.a(1, true)) {
                return false;
            }
            rc.field_f = MonkeyPuzzle2.field_D.a((byte) 114);
            MonkeyPuzzle2.field_D.field_h = 0;
        }
        if (-2 != rc.field_f) {
            return hj.a(rc.field_f, true);
        }
        if (!(hj.a(2, true))) {
            return false;
        }
        rc.field_f = MonkeyPuzzle2.field_D.j(17277);
        MonkeyPuzzle2.field_D.field_h = 0;
        return hj.a(rc.field_f, true);
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
        float[] var10 = null;
        float[] var11 = null;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float[] var15 = null;
        float[] var16 = null;
        float[] var17 = null;
        if (param0 != 122) {
          L0: {
            ((gb) this).field_k = null;
            if (((gb) this).field_m) {
              var15 = ac.a(((gb) this).field_k.field_e, 114, ((gb) this).field_g);
              var11 = var15;
              var9 = var11;
              var7 = var9;
              var5 = var7;
              var2 = var5;
              var3 = wg.a(var15, (byte) 120);
              oa.a((-0.5f + ((gb) this).field_l / (((gb) this).field_l + var3)) * 2.0f, var15, 126);
              mh.a(((gb) this).field_k.field_e, (byte) -125, var15);
              break L0;
            } else {
              var14 = ac.a(((gb) this).field_k.field_e, 123, ((gb) this).field_e.field_e);
              var10 = var14;
              var8 = var10;
              var6 = var8;
              var4 = var6;
              var2 = var4;
              var3 = wg.a(var14, (byte) 115);
              oa.a(((gb) this).field_l / (var3 + ((gb) this).field_l) - 0.5f, var14, 107);
              mh.a(((gb) this).field_k.field_e, (byte) -126, var14);
              wj.a(((gb) this).field_e.field_e, -74, var14);
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((gb) this).field_m) {
              var17 = ac.a(((gb) this).field_k.field_e, 114, ((gb) this).field_g);
              var13 = var17;
              var9 = var13;
              var7 = var9;
              var5 = var7;
              var2 = var5;
              var3 = wg.a(var17, (byte) 120);
              oa.a((-0.5f + ((gb) this).field_l / (((gb) this).field_l + var3)) * 2.0f, var17, 126);
              mh.a(((gb) this).field_k.field_e, (byte) -125, var17);
              break L1;
            } else {
              var16 = ac.a(((gb) this).field_k.field_e, 123, ((gb) this).field_e.field_e);
              var12 = var16;
              var8 = var12;
              var6 = var8;
              var4 = var6;
              var2 = var4;
              var3 = wg.a(var16, (byte) 115);
              oa.a(((gb) this).field_l / (var3 + ((gb) this).field_l) - 0.5f, var16, 107);
              mh.a(((gb) this).field_k.field_e, (byte) -126, var16);
              wj.a(((gb) this).field_e.field_e, -74, var16);
              break L1;
            }
          }
          return;
        }
    }

    gb(wg param0, wg param1, float param2) {
        ((gb) this).field_g = new float[2];
        try {
            ((gb) this).field_e = param1;
            ((gb) this).field_l = param2 * param2;
            ((gb) this).field_m = false;
            ((gb) this).field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "gb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    gb(wg param0, float param1, float param2, float param3) {
        ((gb) this).field_g = new float[2];
        try {
            ((gb) this).field_m = true;
            ((gb) this).field_g[0] = param1;
            ((gb) this).field_l = param3 * param3;
            ((gb) this).field_k = param0;
            ((gb) this).field_g[1] = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "gb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void b() {
        field_h = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
        field_n = "Visit the Account Management section on the main site to view.";
        field_i = 64;
        field_j = true;
        field_f = -1;
    }
}
