/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    d field_h;
    static ki field_e;
    static int field_b;
    int field_a;
    static int field_f;
    static String field_d;
    static ki field_g;
    static pm field_c;

    abstract void f(int param0, int param1);

    final synchronized static ha a(int param0, java.awt.Canvas param1, int param2, int param3, d param4, int param5, int param6, ki param7) {
        if (!(param2 != (param0 ^ -1))) {
            return kl.a(param5, param1, param4, param6, -1);
        }
        if (2 == param0) {
            return qc.a(param5, param6, param2 ^ 0, param1, param4);
        }
        if ((param0 ^ -1) == -2) {
            return aw.a(param4, param1, param3, 27541);
        }
        if (5 == param0) {
            return sb.a(param7, param2 ^ 6707, param4, param1, param3);
        }
        if (!((param0 ^ -1) != -4)) {
            return nu.a(7023, param7, param4, param1, param3);
        }
        throw new IllegalArgumentException("UM");
    }

    abstract void KA(int param0, int param1, int param2, int param3);

    final static void a(int param0) {
        int var1 = -102 % ((param0 - 39) / 38);
    }

    final hr a(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        if (param1 != -2) {
          field_g = null;
          return ((ha) this).a(param5, param0, param3, param4, param2, true);
        } else {
          return ((ha) this).a(param5, param0, param3, param4, param2, true);
        }
    }

    public static void e(int param0) {
        field_e = null;
        if (param0 != 0) {
            return;
        }
        field_c = null;
        field_g = null;
        field_d = null;
    }

    abstract boolean a();

    final static void a(int param0, ms param1, ms param2) {
        L0: {
          if (null != param2.field_g) {
            param2.b(false);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -2) {
          return;
        } else {
          param2.field_g = param1.field_g;
          param2.field_b = param1;
          param2.field_g.field_b = param2;
          param2.field_b.field_g = param2;
          return;
        }
    }

    abstract boolean c();

    final void a(boolean param0) throws rf {
        if (!param0) {
            field_c = null;
            ((ha) this).b(0, 0);
            return;
        }
        ((ha) this).b(0, 0);
    }

    abstract da a(ta param0, ri[] param1, boolean param2);

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).aa(param4, param2, param1, param5, param3, 1);
        if (param0 >= -38) {
            ((ha) this).field_a = 121;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 <= 80) {
          boolean discarded$2 = ((ha) this).a();
          ((ha) this).U(param4, param2, param3, param0, 1);
          return;
        } else {
          ((ha) this).U(param4, param2, param3, param0, 1);
          return;
        }
    }

    abstract vc a(bu param0, nr param1);

    final static void b(int param0) {
        sr.field_d = false;
        uw.field_b = null;
        uw.field_c = null;
        if (param0 != 23639) {
            return;
        }
        hf.field_F = null;
        no.field_b = null;
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void s(int param0, int param1, int param2, int param3, int param4);

    abstract int XA();

    abstract nr a(int param0, int param1);

    abstract void d();

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract void b();

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    final void a(byte param0) {
        fs.field_o[((ha) this).field_a] = false;
        ((ha) this).d();
        if (param0 >= -11) {
            Object var3 = null;
            ha.a(-61, (ms) null, (ms) null);
        }
    }

    abstract void K(int[] param0);

    void a(hr param0, boolean param1) {
        ((ha) this).a(((ha) this).a((bu) (Object) param0, param1 ? ((ha) this).a(param0.c(), param0.a()) : null));
    }

    abstract void a(za param0);

    abstract void f(int param0);

    abstract int i();

    abstract za c(int param0);

    protected void finalize() {
        ((ha) this).a((byte) -21);
    }

    abstract void a(vc param0);

    final static void a(byte param0, String param1) {
        if (param0 < 106) {
            Object var3 = null;
            ha discarded$0 = ha.a(-117, (java.awt.Canvas) null, -59, 3, (d) null, -128, -20, (ki) null);
        }
    }

    abstract hr a(ri param0, boolean param1);

    abstract void GA(int param0);

    abstract hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    ha(d param0) {
        int var3 = 0;
        ((ha) this).field_h = param0;
        int var2 = -1;
        for (var3 = 0; 8 > var3; var3++) {
            if (!fs.field_o[var3]) {
                fs.field_o[var3] = true;
                var2 = var3;
                if (var2 == -1) {
                    throw new IllegalStateException("NFTI");
                }
                ((ha) this).field_a = var2;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        ((ha) this).field_a = var2;
    }

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract int[] Y();

    abstract void b(int param0, int param1) throws rf;

    abstract void e();

    abstract void T(int param0, int param1, int param2, int param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = null;
    }
}
