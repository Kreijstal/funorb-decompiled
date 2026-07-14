/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static boolean field_b;
    d field_c;
    int field_a;

    abstract boolean f();

    final void a(boolean param0) {
        if (!param0) {
            ((ha) this).finalize();
        }
        ns.field_d[((ha) this).field_a] = false;
        ((ha) this).k();
    }

    abstract void d(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract gda b();

    abstract void la();

    final void a(int param0, int param1, int param2, int param3, int param4) {
        ((ha) this).U(param3, param2, param1, param4, param0);
    }

    void a(nh param0, boolean param1) {
        ((ha) this).a(((ha) this).a((nha) (Object) param0, !param1 ? null : ((ha) this).b(param0.a(), param0.c())));
    }

    protected void finalize() {
        ((ha) this).a(true);
    }

    abstract void a(int param0, int param1) throws qva;

    abstract void a(float param0, float param1, float param2);

    abstract nh a(jpa param0, boolean param1);

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        ((ha) this).d(param1, param0, param3, param2, param4, 1);
        if (param5 > -57) {
            ((ha) this).field_c = null;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9);

    abstract void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    abstract int[] Y();

    abstract void ZA(int param0, float param1, float param2, float param3, float param4, float param5);

    abstract void T(int param0, int param1, int param2, int param3);

    abstract boolean h();

    abstract ka a(oc param0, int param1, int param2, int param3, int param4);

    abstract gda e();

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param4 != -22971) {
            ((ha) this).a(-0.8806686997413635f, -0.4391394555568695f, 0.2737298011779785f);
        }
        ((ha) this).aa(param1, param3, param2, param5, param0, 1);
    }

    abstract da a(qla param0, jpa[] param1, boolean param2);

    abstract void HA(int param0, int param1, int param2, int param3, int[] param4);

    final synchronized static ha a(d param0, int param1, cn param2, int param3, int param4, int param5, java.awt.Canvas param6, int param7) {
        if (0 == param3) {
            return l.a(param1, 127, param6, param0, param4);
        }
        if (!(-3 != param3)) {
            return pw.a(param1, param6, param4, (byte) -62, param0);
        }
        if (!(-2 != param3)) {
            return on.a(param6, param0, param5, (byte) -109);
        }
        if (5 == param3) {
            return rua.a(true, param0, param2, param6, param5);
        }
        if (param3 == 3) {
            return oua.a(param0, param5, (byte) -50, param2, param6);
        }
        if (param7 != -17441) {
            return null;
        }
        throw new IllegalArgumentException("UM");
    }

    abstract void a(int param0, int param1, int param2, int param3);

    abstract void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    abstract void a();

    abstract void c();

    abstract void za(int param0, int param1, int param2, int param3, int param4);

    abstract void f(int param0, int param1);

    abstract void L(int param0, int param1, int param2);

    abstract void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    abstract void ya();

    abstract int i();

    abstract void GA(int param0);

    abstract void xa(float param0);

    abstract void d();

    final void e(int param0) throws qva {
        ((ha) this).a(param0, 0);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract void U(int param0, int param1, int param2, int param3, int param4);

    abstract void c(int param0);

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((ha) this).a(param2, param0, param5, param3, param1, param4);
    }

    abstract void a(za param0);

    abstract void da(int param0, int param1, int param2, int[] param3);

    abstract void KA(int param0, int param1, int param2, int param3);

    abstract za a(int param0);

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 30 / ((88 - param1) / 33);
        ((ha) this).za(param4, param0, param2, param3, 1);
    }

    ha(d param0) {
        int var3 = 0;
        ((ha) this).field_c = param0;
        int var2 = -1;
        for (var3 = 0; var3 < 8; var3++) {
            if (!ns.field_d[var3]) {
                var2 = var3;
                ns.field_d[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        ((ha) this).field_a = var2;
    }

    abstract void s(int param0, int param1, int param2, int param3, int param4);

    abstract mw b(int param0, int param1);

    abstract ob a(int param0, int param1, int param2, int param3, int param4, float param5);

    abstract nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5);

    abstract void b(int param0);

    abstract boolean j();

    abstract int l();

    abstract void a(gda param0);

    final nh a(int[] param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 < 73) {
            ((ha) this).a(1.7194017171859741f, 0.590789794921875f, 1.4003089666366577f);
        }
        return ((ha) this).a(param0, param5, param3, param4, param1, true);
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        ((ha) this).s(param0, param4, param2, param3, 1);
        if (param1 != -11185) {
            ((ha) this).L(-114, 43, -49);
        }
    }

    abstract void a(int param0, ob[] param1);

    abstract void K(int[] param0);

    abstract void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    abstract int XA();

    abstract void a(jca param0);

    abstract void DA(int param0, int param1, int param2, int param3);

    abstract jca a(nha param0, mw param1);

    abstract void k();

    static {
    }
}
