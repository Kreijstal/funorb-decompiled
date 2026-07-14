/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tf extends pg {
    static int[] field_g;
    static String field_h;
    long field_k;
    tf field_i;
    static qb[] field_j;
    tf field_l;

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        if (param0 <= 17) {
            return;
        }
        field_g = null;
    }

    final static ri a(int param0, String param1) {
        int var5 = 0;
        String var6 = null;
        ri var7 = null;
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        int var2 = param1.length();
        if (!(var2 != 0)) {
            return uh.field_i;
        }
        if (!(255 >= var2)) {
            return b.field_e;
        }
        String[] var3 = eh.a(false, '.', param1);
        if (param0 != 32752) {
            return null;
        }
        if (!(-3 >= (var3.length ^ -1))) {
            return uh.field_i;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = mo.a(var6, 45);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return ik.a(param0 + -32810, var3[var3.length - 1]);
    }

    final static f a(int param0, int param1, byte[] param2) {
        if (param1 != -25866) {
            return null;
        }
        f var3 = new f(param2);
        cm.field_l.b((pg) (Object) var3, -1);
        pb.a(32, param0, var3);
        return var3;
    }

    final void a(byte param0) {
        if (param0 != 88) {
            ((tf) this).field_k = 116L;
        }
        if (!(((tf) this).field_i != null)) {
            return;
        }
        ((tf) this).field_i.field_l = ((tf) this).field_l;
        ((tf) this).field_l.field_i = ((tf) this).field_i;
        ((tf) this).field_l = null;
        ((tf) this).field_i = null;
    }

    final long b(boolean param0) {
        if (param0) {
            return 111L;
        }
        return ((tf) this).field_k;
    }

    final void a(int param0, long param1) {
        if (param0 != 46) {
            return;
        }
        if (null != ((tf) this).field_i) {
            throw new RuntimeException();
        }
        ((tf) this).field_k = param1;
    }

    final boolean d(byte param0) {
        if (param0 != -17) {
            return false;
        }
        if (((tf) this).field_i != null) {
            return true;
        }
        return false;
    }

    protected tf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Remember to select the focus point's location, then fire as before. Destroy the targets!";
    }
}
