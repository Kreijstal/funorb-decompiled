/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r extends ci {
    static ci field_Tb;
    int field_Sb;
    static String field_Zb;
    static String field_Fb;
    static int field_Eb;
    ci field_Ob;
    long field_Yb;
    boolean field_Qb;
    static boolean field_bc;
    int field_Vb;
    int field_Jb;
    int field_Wb;
    ci field_Xb;
    String field_Lb;
    boolean field_Hb;
    int field_Mb;
    int field_Pb;
    String field_Rb;
    boolean field_ac;
    ci field_Gb;
    static dk field_Ib;
    ci field_Kb;
    ci field_Ub;
    long field_Nb;

    final boolean a(r param0, int param1) {
        if ((param0.field_Qb ? 1 : 0) == (!((r) this).field_Qb ? 1 : 0)) {
            return ((r) this).field_Qb;
        }
        if (param1 != -343) {
            Object var4 = null;
            boolean discarded$6 = ((r) this).a((r) null, -42);
            if (!((!param0.field_ac ? 1 : 0) != (((r) this).field_ac ? 1 : 0))) {
                return ((r) this).field_ac;
            }
            return ((r) this).field_Nb < param0.field_Nb ? true : false;
        }
        if (!((!param0.field_ac ? 1 : 0) != (((r) this).field_ac ? 1 : 0))) {
            return ((r) this).field_ac;
        }
        return ((r) this).field_Nb < param0.field_Nb ? true : false;
    }

    final void a(int param0, String param1, String param2) {
        CharSequence var5 = null;
        if (param0 != 1) {
            ((r) this).field_Gb = null;
            ((r) this).field_Lb = param1;
            ((r) this).field_Rb = param2;
            var5 = (CharSequence) (Object) ((r) this).field_Rb;
            String discarded$0 = ad.a(var5, -2);
            return;
        }
        ((r) this).field_Lb = param1;
        ((r) this).field_Rb = param2;
        CharSequence var6 = (CharSequence) (Object) ((r) this).field_Rb;
        String discarded$1 = ad.a(var6, -2);
    }

    final static void k(int param0) {
        h var1 = null;
        h var1_ref = null;
        if (param0 != 3029) {
          return;
        } else {
          L0: {
            var1 = (h) (Object) ni.field_c.c(101);
            if (var1 == null) {
              var1_ref = new h();
              break L0;
            } else {
              break L0;
            }
          }
          var1_ref.a(wb.field_h, wb.field_c, 0, wb.field_d, wb.field_j, wb.field_i, wb.field_b, wb.field_a);
          tm.field_a.a((o) (Object) var1_ref, (byte) -39);
          return;
        }
    }

    final static void a(int param0, byte param1, int param2, le param3) {
        o.field_f = param2;
        de.field_c = param3;
        bb.field_b = param0;
        if (param1 > -46) {
            field_Ib = null;
        }
    }

    r(String param0, String param1, long param2) {
        super(0L, (ci) null);
        ((r) this).field_Lb = param1;
        ((r) this).field_Rb = param0;
        ((r) this).field_Yb = param2;
        CharSequence var6 = (CharSequence) (Object) ((r) this).field_Rb;
        String discarded$0 = ad.a(var6, -2);
    }

    final boolean l(int param0) {
        if (param0 != 1) {
            return true;
        }
        return !((r) this).e(-4) ? true : false;
    }

    public static void m(int param0) {
        field_Zb = null;
        int var1 = -85 / ((-34 - param0) / 32);
        field_Tb = null;
        field_Ib = null;
        field_Fb = null;
    }

    final static boolean a(boolean param0, nk param1) {
        if (!param0) {
            return true;
        }
        return 1 == param1.e(-63, 1) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Zb = "Continue spectating";
        field_Fb = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
