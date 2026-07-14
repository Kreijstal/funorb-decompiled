/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends ha implements e {
    private boolean field_s;
    long field_nativeid;
    private ya field_p;
    private vna field_o;
    private gda field_i;
    private int field_k;
    private ji field_r;
    private p field_f;
    private int field_n;
    private gda field_j;
    private static int[] field_m;
    private static float[] field_e;
    private static float[] field_d;
    private a[] field_q;
    static int[] field_t;
    private static int[] field_g;
    private boolean field_h;
    int field_l;

    final native void za(int param0, int param1, int param2, int param3, int param4);

    public oa(java.awt.Canvas param0, d param1, int param2, int param3) {
        super(param1);
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((oa) this).field_nativeid = 0L;
                    ((oa) this).field_s = false;
                    ((oa) this).field_o = new vna();
                    ((oa) this).field_k = 4096;
                    ((oa) this).field_n = 4096;
                    ((oa) this).field_r = new ji(4);
                    ((oa) this).field_h = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (in.a("sw3d", 480)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        throw new RuntimeException("");
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ho.b(false);
                        this.MA(((oa) this).field_c, 0, 0);
                        ija.a(true, (byte) 98, false);
                        ((oa) this).field_h = true;
                        ((oa) this).field_i = (gda) (Object) new ja();
                        ((oa) this).a((gda) (Object) new ja());
                        this.f(1);
                        this.g(0);
                        if (param0 == null) {
                            statePc = 7;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.a(param0, param2, param3);
                        this.a(param0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var5 = caughtException;
                    ((oa) this).a(true);
                    throw new RuntimeException();
                }
                case 7: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final native void w(boolean param0);

    private final native void va(za param0);

    final void a(gda param0) {
        ((oa) this).field_j = param0;
        this.ma(((ja) (Object) param0).field_nativeid);
    }

    final mw b(int param0, int param1) {
        return (mw) (Object) new xa(param0, param1);
    }

    final native void f(int param0, int param1);

    final native void v(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final void a(int param0, ob[] param1) {
        int var4 = 0;
        int var3 = 0;
        for (var4 = 0; var4 < param0; var4++) {
            var3++;
            field_g[var3] = param1[var4].d(13437);
            var3++;
            field_g[var3] = param1[var4].a(19848);
            var3++;
            field_g[var3] = param1[var4].b((byte) 11);
            var3++;
            field_g[var3] = param1[var4].a((byte) -56);
            field_d[var4] = param1[var4].b(0);
            var3++;
            field_g[var3] = param1[var4].c(-113);
        }
        this.N(param0, field_g, field_d);
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final native void xa(float param0);

    final native void la();

    private final native void wa(int param0, int param1, int param2, int param3, int param4, int param5);

    final native void T(int param0, int param1, int param2, int param3);

    final da a(qla param0, jpa[] param1, boolean param2) {
        int[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        var4 = new int[param1.length];
        var5 = new int[param1.length];
        var6 = 0;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1.length) {
            if (!param2) {
              if (var6 == 0) {
                return (da) (Object) new n((oa) this, ((oa) this).field_p, param0, param1, (nh[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            } else {
              if (var6 == 0) {
                return (da) (Object) new h((oa) this, ((oa) this).field_p, param0, param1, (nh[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            }
          } else {
            var4[var7] = param1[var7].field_i;
            var5[var7] = param1[var7].field_a;
            if (param1[var7].field_h != null) {
              var6 = 1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    final native void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    final a m() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 < ((oa) this).field_l) {
            if ((Object) (Object) ((oa) this).field_q[var1].field_h != (Object) (Object) Thread.currentThread()) {
              var1++;
              continue L0;
            } else {
              return ((oa) this).field_q[var1];
            }
          } else {
            return null;
          }
        }
    }

    private final native void AA(short param0, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final void d() {
        this.a(((oa) this).field_f.field_f);
    }

    final native int XA();

    private final native void ma(long param0);

    final native void L(int param0, int param1, int param2);

    private final boolean WA(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        dw var3 = null;
        int[] var4 = null;
        Throwable var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2_ref = (Object) (Object) ((oa) this).field_c;
                    // monitorenter ((oa) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((oa) this).field_c.a((int) param0, (byte) 120)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var2_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        var3 = ((oa) this).field_c.a((byte) -109, (int) param0);
                        if (var3 != null) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var2_ref
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        if (var3.field_d == 2) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4 = ((oa) this).field_c.a(14907, (int) param0, true, 128, 0.699999988079071f, 128);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4 = ((oa) this).field_c.a((byte) 40, 128, 0.699999988079071f, (int) param0, true, 128);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        this.CA(param0, var4, var3.field_m, var3.field_d, var3.field_h, var3.field_a, var3.field_t, var3.field_g, var3.field_c, var3.field_i, var3.field_s, var3.field_o, var3.field_p, var3.field_f, var3.field_k, var3.field_b, var3.field_n, var3.field_r, var3.field_l, var3.field_e, var3.field_q);
                        // monitorexit var2_ref
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return true;
                }
                case 12: {
                    try {
                        var5 = caughtException;
                        // monitorexit var2_ref
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final native void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    final void b(int param0) {
        ((oa) this).field_k = param0;
        ((oa) this).field_n = param0;
        if (((oa) this).field_l > 1) {
            throw new IllegalStateException("No MT");
        }
        this.f(((oa) this).field_l);
        this.g(0);
    }

    final jca a(nha param0, mw param1) {
        return (jca) (Object) new wa((oa) this, (j) (Object) param0, (xa) (Object) param1);
    }

    private final native void t(p param0);

    final native void ya();

    final void c() {
    }

    final boolean f() {
        return false;
    }

    final boolean j() {
        return true;
    }

    private final native void FA();

    final gda e() {
        return ((oa) this).field_i;
    }

    final ka a(oc param0, int param1, int param2, int param3, int param4) {
        return (ka) (Object) new i((oa) this, ((oa) this).field_p, param0, param1, param2, param3, param4);
    }

    final native void KA(int param0, int param1, int param2, int param3);

    final gda b() {
        return (gda) (Object) new ja();
    }

    private final boolean c(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        dw var3 = null;
        Throwable var4 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2_ref = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3 = ((oa) this).field_c.a((byte) 9, (int) param0);
                        if (var3 != null) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var2_ref
                        stackOut_2_0 = 0;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0 != 0;
                }
                case 4: {
                    try {
                        this.AA(param0, var3.field_m, var3.field_d, var3.field_h, var3.field_a, var3.field_t, var3.field_g, var3.field_c, var3.field_i, var3.field_s, var3.field_o, var3.field_p, var3.field_f, var3.field_k, var3.field_b, var3.field_n, var3.field_r, var3.field_l, var3.field_e, var3.field_q);
                        // monitorexit var2_ref
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return true;
                }
                case 6: {
                    try {
                        var4 = caughtException;
                        // monitorexit var2_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        try {
            java.lang.reflect.Method var6 = null;
            p var4_ref = null;
            Class var7 = null;
            p var4 = (p) (Object) ((oa) this).field_r.a((byte) -110, (long)((Object) (Object) param0).hashCode());
            if (var4 == null) {
                try {
                    var7 = Class.forName("java.awt.Canvas");
                    var6 = var7.getMethod("setIgnoreRepaint", new Class[1]);
                    Object discarded$0 = var6.invoke((Object) (Object) param0, new Object[1]);
                } catch (Exception exception) {
                }
                var4_ref = new p((oa) this, param0, param1, param2);
                ((oa) this).field_r.a((long)((Object) (Object) param0).hashCode(), 101, (vg) (Object) var4_ref);
            } else {
                if (var4_ref.field_i == param1) {
                    // if_icmpeq L144
                }
                var4_ref.a(param0, param1, param2);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final native void ZA(int param0, float param1, float param2, float param3, float param4, float param5);

    final native void ea(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8);

    private final native void P(int param0, int param1, int param2, int param3, int param4);

    private final native void n(long param0, long param1);

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((oa) this).U(param0, param1, param2, param4, param5);
        ((oa) this).U(param0, param1 + param3 - 1, param2, param4, param5);
        this.P(param0, param1 + 1, param3 - 1, param4, param5);
        this.P(param0 + param2 - 1, param1 + 1, param3 - 1, param4, param5);
    }

    private final void a(java.awt.Canvas param0) {
        p var2 = null;
        if (param0 != null) {
            var2 = (p) (Object) ((oa) this).field_r.a((byte) -82, (long)((Object) (Object) param0).hashCode());
            ((oa) this).field_f = var2;
            this.t(var2);
        } else {
            ((oa) this).field_f = null;
            this.t((p) null);
        }
    }

    private final native void CA(short param0, int[] param1, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    final native int[] Y();

    final native void da(int param0, int param1, int param2, int[] param3);

    final nh a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (nh) (Object) new j((oa) this, param0, param1, param2, param3, param4, false);
    }

    protected final synchronized void finalize() {
        ((oa) this).a(true);
        if (((oa) this).field_nativeid != 0L) {
            ho.a(-1, (e) this);
        }
    }

    final int l() {
        return 4;
    }

    final native void K(int[] param0);

    private final void f(int param0) {
        int var2 = 0;
        ((oa) this).field_l = param0;
        ((oa) this).field_q = new a[((oa) this).field_l];
        for (var2 = 0; var2 < ((oa) this).field_l; var2++) {
            ((oa) this).field_q[var2] = new a((oa) this, ((oa) this).field_n, ((oa) this).field_k);
        }
    }

    final nh a(jpa param0, boolean param1) {
        j var3 = new j((oa) this, param0.field_g, param0.field_f, param0.field_h, 0, param0.field_i, param0.field_i, param0.field_a);
        ((nh) (Object) var3).b(param0.field_d, param0.field_c, param0.field_b, param0.field_e);
        return (nh) (Object) var3;
    }

    final native void U(int param0, int param1, int param2, int param3, int param4);

    private final native void N(int param0, int[] param1, float[] param2);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.wa(param0, param1, param2, param3, param4, param5);
    }

    final za a(int param0) {
        ya var2 = new ya((oa) this, param0);
        ((oa) this).field_o.b((byte) -97, (vg) (Object) var2);
        return (za) (Object) var2;
    }

    final void a(int param0, int param1) throws qva {
        if (((oa) this).field_f == null) {
            throw new IllegalStateException("off");
        }
        ((oa) this).field_f.a(param0, param1);
    }

    final native void s(int param0, int param1, int param2, int param3, int param4);

    final void c(int param0) {
        ho.a(true);
        this.d(param0);
        ya var2 = (ya) (Object) ((oa) this).field_o.f(-80);
        while (var2 != null) {
            var2.r();
            var2 = (ya) (Object) ((oa) this).field_o.e(111);
        }
    }

    private final Object OA() {
        return (Object) (Object) new ba((oa) this);
    }

    final native void DA(int param0, int param1, int param2, int param3);

    final void k() {
        if (((oa) this).field_s) {
            return;
        }
        ((oa) this).field_q = null;
        ((oa) this).field_f = null;
        ((oa) this).field_p = null;
        ((oa) this).field_i = null;
        ((oa) this).field_r.e(-67);
        ya var1 = (ya) (Object) ((oa) this).field_o.f(-80);
        while (var1 != null) {
            var1.ga();
            var1 = (ya) (Object) ((oa) this).field_o.e(108);
        }
        ((oa) this).field_o.d(8);
        this.FA();
        if (((oa) this).field_h) {
            rpa.a(true, false, true);
            ((oa) this).field_h = false;
        }
        this.g();
        ho.a(-1);
        ((oa) this).field_s = true;
    }

    final void a(jca param0) {
        wa var2 = (wa) (Object) param0;
        this.n(var2.field_b.field_nativeid, var2.field_a.field_nativeid);
    }

    final ob a(int param0, int param1, int param2, int param3, int param4, float param5) {
        return (ob) (Object) new kka(param0, param1, param2, param3, param4, param5);
    }

    final native int i();

    private final void g(int param0) {
        ((oa) this).field_q[param0].a();
    }

    private final void g() {
        System.gc();
        System.runFinalization();
        ho.a(true);
    }

    private final native void MA(d param0, int param1, int param2);

    final native void GA(int param0);

    final void a(nh param0, boolean param1) {
        this.n(((j) (Object) param0).field_nativeid, 0L);
    }

    final void a() {
    }

    final boolean h() {
        return false;
    }

    final void a(za param0) {
        ((oa) this).field_p = (ya) (Object) param0;
        this.va(param0);
    }

    private final native void d(int param0);

    final native void HA(int param0, int param1, int param2, int param3, int[] param4);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        throw new IllegalStateException();
    }

    final void a(float param0, float param1, float param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[Math.max(Math.max(104, 20), 24573)];
        field_e = new float[20];
        field_d = field_e;
        field_t = new int[6];
        field_g = field_m;
    }
}
