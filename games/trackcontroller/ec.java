/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ec extends kd {
    private String field_c;
    static int[] field_d;
    private long field_e;

    final void a(byte param0, be param1) {
        try {
            if (param0 != -6) {
                ec.b((byte) 6);
            }
            param1.a(((ec) this).field_e, 2147483647);
            param1.a(((ec) this).field_c, param0 + 27939);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ec.F(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static qj a() {
        int var4_int = 0;
        int var5 = TrackController.field_F ? 1 : 0;
        int var1 = cf.field_p[0] * j.field_f[0];
        byte[] var2 = qk.field_M[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = qe.field_z[tc.a((int) var2[var4_int], 255)];
        }
        qj var4 = new qj(ab.field_a, qe.field_p, ka.field_f[0], vb.field_a[0], cf.field_p[0], j.field_f[0], var3);
        ff.b(76);
        return var4;
    }

    public static void b(byte param0) {
        field_d = null;
        if (param0 > -12) {
            ec.b((byte) -1);
        }
    }

    nh a(boolean param0) {
        if (param0) {
            return null;
        }
        return ji.field_a;
    }

    ec(long param0, String param1) {
        try {
            ((ec) this).field_e = param0;
            ((ec) this).field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) (Object) runtimeException, "ec.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
