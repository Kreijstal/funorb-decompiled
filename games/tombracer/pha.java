/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pha extends jea {
    int field_Ab;
    static String field_Ib;
    int field_zb;
    boolean field_Hb;
    boolean field_tb;
    String field_wb;
    jea field_Cb;
    jea field_Nb;
    jea field_Gb;
    long field_yb;
    String field_vb;
    jea field_Db;
    static jpa field_Bb;
    static int[] field_ub;
    jea field_Kb;
    int field_xb;
    int field_Eb;
    long field_Mb;
    boolean field_Fb;
    int field_Lb;
    int field_Jb;

    public static void d(byte param0) {
        Object var2 = null;
        field_Bb = null;
        field_Ib = null;
        if (param0 != -68) {
          var2 = null;
          ib discarded$2 = pha.a((kh) null, (la) null, 16);
          field_ub = null;
          return;
        } else {
          field_ub = null;
          return;
        }
    }

    final boolean a(byte param0, pha param1) {
        if ((!param1.field_Fb ? 1 : 0) == (((pha) this).field_Fb ? 1 : 0)) {
            return ((pha) this).field_Fb;
        }
        if (param0 <= 106) {
            Object var4 = null;
            boolean discarded$4 = ((pha) this).a((byte) 29, (pha) null);
            if (!((!((pha) this).field_Hb ? 1 : 0) != (param1.field_Hb ? 1 : 0))) {
                return ((pha) this).field_Hb;
            }
            return param1.field_Mb > ((pha) this).field_Mb ? true : false;
        }
        if (!((!((pha) this).field_Hb ? 1 : 0) != (param1.field_Hb ? 1 : 0))) {
            return ((pha) this).field_Hb;
        }
        return param1.field_Mb > ((pha) this).field_Mb ? true : false;
    }

    final boolean f(int param0) {
        if (param0 != 162) {
            return false;
        }
        return !((pha) this).d(0) ? true : false;
    }

    pha(String param0, String param1, long param2) {
        super(0L, (jea) null);
        ((pha) this).field_yb = param2;
        ((pha) this).field_vb = param0;
        ((pha) this).field_wb = param1;
        CharSequence var6 = (CharSequence) (Object) ((pha) this).field_vb;
        String discarded$0 = jd.a(1, var6);
    }

    final void a(String param0, int param1, String param2) {
        CharSequence var5 = null;
        CharSequence var6 = null;
        ((pha) this).field_vb = param2;
        if (param1 <= 23) {
          pha.d((byte) 68);
          ((pha) this).field_wb = param0;
          var5 = (CharSequence) (Object) ((pha) this).field_vb;
          String discarded$4 = jd.a(1, var5);
          return;
        } else {
          ((pha) this).field_wb = param0;
          var6 = (CharSequence) (Object) ((pha) this).field_vb;
          String discarded$5 = jd.a(1, var6);
          return;
        }
    }

    final static ib a(kh param0, la param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param2 != 162) {
            field_ub = null;
            var3 = param0.b((byte) 44, 4);
            var4 = var3;
            if (!(var4 != 0)) {
                return (ib) (Object) new vja(param1, param0);
            }
            throw new IllegalStateException("Unrecognised spawner type: " + var3);
        }
        var3 = param0.b((byte) 44, 4);
        var4 = var3;
        if (!(var4 != 0)) {
            return (ib) (Object) new vja(param1, param0);
        }
        throw new IllegalStateException("Unrecognised spawner type: " + var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ub = new int[]{50, 162, 28, 261, 212, 301, 386, 379, 481};
        field_Ib = "Piles";
    }
}
