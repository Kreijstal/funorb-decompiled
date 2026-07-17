/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg {
    int[] field_f;
    int field_d;
    int field_m;
    int field_b;
    static ll[] field_c;
    static ll[] field_l;
    int field_k;
    kc field_a;
    String field_e;
    String field_n;
    long field_h;
    static String field_j;
    static boolean field_r;
    boolean field_i;
    static int[] field_p;
    int field_q;
    String field_o;
    String field_g;

    final int b(int param0) {
        if (!((jg) this).field_i) {
            if (((jg) this).field_m != 2) {
                if (!(~((jg) this).field_h != ~qf.field_a)) {
                    return 1;
                }
                if (jb.field_t == 2) {
                    if (!kl.a(((jg) this).field_n, 1)) {
                        if (param0 > -19) {
                            ((jg) this).field_a = null;
                            return 0;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (param0 > -19) {
                    ((jg) this).field_a = null;
                    return 0;
                }
                return 0;
            }
            if (((jg) this).field_b <= 0) {
                if (!(~((jg) this).field_h != ~qf.field_a)) {
                    return 1;
                }
                if (jb.field_t == 2) {
                    if (!kl.a(((jg) this).field_n, 1)) {
                        if (param0 > -19) {
                            ((jg) this).field_a = null;
                            return 0;
                        }
                        return 0;
                    }
                    return 1;
                }
                if (param0 > -19) {
                    ((jg) this).field_a = null;
                    return 0;
                }
                return 0;
            }
            return 2;
        }
        return 2;
    }

    final static void a() {
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        if (null != jb.field_z) {
          if ((jb.field_z.field_D & 1 << jb.field_z.field_I) == 0) {
            if (0 == jb.field_z.field_D) {
              ce.field_g[10] = cn.field_K;
              return;
            } else {
              ce.field_g[10] = pe.field_Nb;
              return;
            }
          } else {
            ce.field_g[10] = uh.field_s;
            return;
          }
        } else {
          return;
        }
    }

    public static void c() {
        field_p = null;
        field_j = null;
        field_l = null;
        field_c = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param2 >>> 31;
        return (var3 + param2) / param0 + -var3;
    }

    jg(boolean param0) {
        ((jg) this).field_i = sc.field_V;
        ((jg) this).field_h = vi.field_P;
        ((jg) this).field_e = fe.field_p;
        ((jg) this).field_b = db.field_e;
        ((jg) this).field_o = wl.field_N;
        ((jg) this).field_g = vf.field_j;
        ((jg) this).field_q = mc.field_c;
        ((jg) this).field_d = i.field_f;
        if (param0) {
            ((jg) this).field_f = ga.field_s;
        } else {
            ((jg) this).field_f = null;
        }
        ((jg) this).field_n = ff.field_a;
        ((jg) this).field_k = ma.field_M;
        ((jg) this).field_m = sl.field_W;
    }

    jg(int param0, String param1, int param2, String param3, String param4) {
        try {
            ((jg) this).field_k = 0;
            ((jg) this).field_f = null;
            ((jg) this).field_g = param1;
            ((jg) this).field_n = param1;
            ((jg) this).field_b = 0;
            ((jg) this).field_i = true;
            ((jg) this).field_q = param2;
            ((jg) this).field_e = param4;
            ((jg) this).field_d = 0;
            ((jg) this).field_h = 0L;
            ((jg) this).field_o = param3;
            ((jg) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jg.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = false;
        field_j = "Hide lobby chat";
    }
}
