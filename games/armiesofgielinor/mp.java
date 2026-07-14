/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends je {
    je field_Rb;
    static jl field_Mb;
    je field_Ib;
    je field_Nb;
    static wk field_Jb;
    dn field_Kb;
    static bl field_Sb;
    static String field_Pb;
    static je field_Lb;
    static um field_Ob;
    static je field_Qb;

    mp(long param0, mp param1, String param2, String param3) {
        this(param0, (je) (Object) param1, param1.field_Kb.field_Nb, param1.field_Kb.field_Ib, param1.field_Ib, param2, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        if (param7 > -34) {
          int discarded$2 = mp.k(17);
          ((mp) this).field_gb = param4;
          ((mp) this).field_S = param0;
          ((mp) this).field_ab = param5;
          ((mp) this).field_ob = param6;
          ((mp) this).a((byte) -110, param1, param3, param2);
          return;
        } else {
          ((mp) this).field_gb = param4;
          ((mp) this).field_S = param0;
          ((mp) this).field_ab = param5;
          ((mp) this).field_ob = param6;
          ((mp) this).a((byte) -110, param1, param3, param2);
          return;
        }
    }

    public static void l(int param0) {
        field_Pb = null;
        field_Qb = null;
        field_Ob = null;
        if (param0 != -8291) {
            mp.l(-93);
            field_Jb = null;
            field_Sb = null;
            field_Mb = null;
            field_Lb = null;
            return;
        }
        field_Jb = null;
        field_Sb = null;
        field_Mb = null;
        field_Lb = null;
    }

    mp(long param0, je param1, je param2, ll param3, je param4, String param5, String param6) {
        super(param0, param1);
        ((mp) this).field_Nb = new je(0L, (je) null);
        ((mp) this).field_Kb = new dn(0L, ((mp) this).field_Nb, param2, param3);
        ((mp) this).field_Ib = new je(0L, param4);
        ((mp) this).field_Rb = new je(0L, param4);
        ((mp) this).field_Ib.field_X = param5;
        ((mp) this).field_Rb.field_X = param6;
        ((mp) this).a((je) (Object) ((mp) this).field_Kb, 41);
        ((mp) this).a(((mp) this).field_Ib, 80);
        ((mp) this).a(((mp) this).field_Rb, 111);
    }

    final static int k(int param0) {
        if (param0 > -38) {
          return 60;
        } else {
          return nr.field_e.field_v - nr.field_e.field_L + (-(nr.field_e.field_H >> 1472789153) - -(nr.field_e.field_y >> 738224194) + 3);
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        var5 = (((mp) this).field_gb + param3) / 2;
        var6 = ((mp) this).field_ob - param2;
        ((mp) this).field_Kb.a(0, false, ((mp) this).field_gb, param3, param1, 0, -param3 + var6);
        ((mp) this).field_Ib.field_S = 0;
        ((mp) this).field_Ib.field_ob = param2;
        ((mp) this).field_Ib.field_ab = var6;
        ((mp) this).field_Ib.field_gb = var5 - param3;
        ((mp) this).field_Rb.field_ab = var6;
        ((mp) this).field_Rb.field_gb = ((mp) this).field_gb - var5;
        ((mp) this).field_Rb.field_S = var5;
        ((mp) this).field_Rb.field_ob = param2;
        if (param0 != -110) {
          ((mp) this).a((byte) 61, 6, 46, 70);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = "Passwords must be between 5 and 20 characters long";
        field_Mb = new jl();
    }
}
