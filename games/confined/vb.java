/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb {
    static bi field_f;
    static int[] field_e;
    private mn field_b;
    private rk field_c;
    static long field_d;
    static double[] field_a;

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        qf var4 = null;
        if (param2 == null) {
            return null;
        }
        if (!(!(param2 instanceof byte[]))) {
            var3 = (byte[]) param2;
            if (param0) {
                return ug.a(var3, 194);
            }
            return var3;
        }
        if (!(!(param2 instanceof qf))) {
            var4 = (qf) param2;
            return var4.a(87);
        }
        if (param1 != 6) {
            field_e = null;
        }
        throw new IllegalArgumentException();
    }

    final static void b(byte param0) {
        if (!(fd.field_j)) {
            throw new IllegalStateException();
        }
        qf.field_g = true;
        if (param0 < 104) {
            boolean discarded$0 = vb.a((byte) -90, '￘');
        }
        aa.a((byte) -118, false);
        rk.field_e = 0;
    }

    final rk b(rk param0, int param1) {
        rk var3 = null;
        if (param0 == null) {
            var3 = ((vb) this).field_b.field_a.field_h;
        } else {
            var3 = param0;
        }
        if (((vb) this).field_b.field_a == var3) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var3.field_h;
        if (param1 != 6) {
            Object var4 = null;
            rk discarded$0 = ((vb) this).a((rk) null, 28);
        }
        return var3;
    }

    final rk a(rk param0, int param1) {
        rk var3 = null;
        if (param1 != 0) {
            ((vb) this).field_c = null;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((vb) this).field_b.field_a.field_a;
        }
        if (!(var3 != ((vb) this).field_b.field_a)) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var3.field_a;
        return var3;
    }

    final static boolean a(byte param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = Confined.field_J ? 1 : 0;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (!(!ld.a((byte) -21, param1))) {
            return true;
        }
        char[] var6 = gk.field_y;
        char[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            if (var4 == param1) {
                return true;
            }
        }
        if (param0 != -37) {
            vb.b((byte) -35);
        }
        char[] var7 = pa.field_d;
        var2 = var7;
        int var8 = 0;
        var3 = var8;
        while (var7.length > var8) {
            var4 = var7[var8];
            if (var4 == param1) {
                return true;
            }
            var8++;
        }
        return false;
    }

    final rk c(int param0) {
        rk var2 = ((vb) this).field_b.field_a.field_a;
        if (var2 == ((vb) this).field_b.field_a) {
            ((vb) this).field_c = null;
            return null;
        }
        if (param0 != 7) {
            return null;
        }
        ((vb) this).field_c = var2.field_a;
        return var2;
    }

    vb(mn param0) {
        ((vb) this).field_b = param0;
    }

    final rk a(byte param0) {
        if (param0 != 120) {
            vb.b((byte) -33);
        }
        rk var2 = ((vb) this).field_b.field_a.field_h;
        if (((vb) this).field_b.field_a == var2) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var2.field_h;
        return var2;
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 8) {
            field_d = -115L;
        }
        field_a = null;
        field_e = null;
    }

    final rk a(int param0) {
        if (param0 != 0) {
            field_d = -121L;
        }
        rk var2 = ((vb) this).field_c;
        if (((vb) this).field_b.field_a == var2) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var2.field_a;
        return var2;
    }

    final rk b(int param0) {
        int var2 = -88 % ((param0 - 17) / 35);
        rk var3 = ((vb) this).field_c;
        if (var3 == ((vb) this).field_b.field_a) {
            ((vb) this).field_c = null;
            return null;
        }
        ((vb) this).field_c = var3.field_h;
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[1024];
        field_a = new double[]{6.0, 6.0, 7.0, 8.0, 6.0, 4.0, 5.0, 6.0, 5.5, 6.0, 7.0, 6.0, 5.0, 6.0, 6.0, 8.0, 5.0, 8.0, 8.0, 6.0, 10.0, 9.0, 8.0, 7.0, 7.0};
    }
}
