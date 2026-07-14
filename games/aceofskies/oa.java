/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends ha implements e {
    private ya field_i;
    private boolean field_j;
    long field_nativeid;
    private kp field_m;
    private p field_d;
    private int field_e;
    private ao field_f;
    private int field_l;
    private ph field_h;
    private a[] field_k;
    private int field_n;
    private boolean field_g;

    private final native void P(int param0, int param1, int param2, int param3, int param4);

    final native void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    private final native void MA(d param0, int param1, int param2);

    public oa(java.awt.Canvas param0, d param1, int param2, int param3) {
        super(param1);
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((oa) this).field_j = false;
                    ((oa) this).field_nativeid = 0L;
                    ((oa) this).field_m = new kp();
                    ((oa) this).field_l = 4096;
                    ((oa) this).field_e = 4096;
                    ((oa) this).field_h = new ph(4);
                    ((oa) this).field_g = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (ei.a("sw3d", (byte) -16)) {
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
                        vk.b(false);
                        this.MA(((oa) this).field_a, 0, 0);
                        fr.a(false, 0, true);
                        ((oa) this).field_g = true;
                        ja discarded$2 = new ja();
                        this.a((ao) (Object) new ja());
                        this.g(1);
                        this.f(0);
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
                    ((oa) this).a(-9);
                    throw new RuntimeException();
                }
                case 7: {
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(pa param0, boolean param1) {
        this.n(((j) param0).field_nativeid, 0L);
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.wa(param0, param1, param2, param3, param4, param5);
    }

    private final void f(int param0) {
        ((oa) this).field_k[param0].a();
    }

    private final native void n(long param0, long param1);

    final void a(sm param0) {
        wa var2 = (wa) param0;
        this.n(((wa) var2).field_a.field_nativeid, ((wa) var2).field_b.field_nativeid);
    }

    final native int[] Y();

    final void c() {
        if (((oa) this).field_j) {
            return;
        }
        ((oa) this).field_k = null;
        ((oa) this).field_d = null;
        ((oa) this).field_i = null;
        ((oa) this).field_h.b(0);
        ya var1 = (ya) ((oa) this).field_m.d(268435455);
        while (var1 != null) {
            var1.ga();
            var1 = (ya) ((oa) this).field_m.b((byte) 103);
        }
        ((oa) this).field_m.c(268435455);
        this.FA();
        if (((oa) this).field_g) {
            da.a(24, true, false);
            ((oa) this).field_g = false;
        }
        this.g();
        vk.a(false);
        ((oa) this).field_j = true;
    }

    final native void K(int[] param0);

    private final native void CA(short param0, int[] param1, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    private final void a(ao param0) {
        ((oa) this).field_f = param0;
        this.ma(((ja) param0).field_nativeid);
    }

    final void a() {
        this.a(((oa) this).field_d.field_i);
    }

    final native int i();

    private final native void AA(short param0, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final native void f(int param0, int param1);

    final native void DA(int param0, int param1, int param2, int param3);

    private final boolean c(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        uh var3 = null;
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
                        var3 = ((oa) this).field_a.a(false, (int) param0);
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
                        this.AA(param0, ((uh) var3).field_t, ((uh) var3).field_q, ((uh) var3).field_c, ((uh) var3).field_s, ((uh) var3).field_h, ((uh) var3).field_o, ((uh) var3).field_r, ((uh) var3).field_b, ((uh) var3).field_n, ((uh) var3).field_j, ((uh) var3).field_f, ((uh) var3).field_a, ((uh) var3).field_p, ((uh) var3).field_d, ((uh) var3).field_l, ((uh) var3).field_k, ((uh) var3).field_i, ((uh) var3).field_m, ((uh) var3).field_e);
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

    final pa a(vd param0, boolean param1) {
        j var3 = new j((oa) this, ((vd) param0).field_f, ((vd) param0).field_d, ((vd) param0).field_e, 0, ((vd) param0).field_h, ((vd) param0).field_h, ((vd) param0).field_c);
        ((pa) (Object) var3).a(((vd) param0).field_a, ((vd) param0).field_i, ((vd) param0).field_g, ((vd) param0).field_b);
        return (pa) (Object) var3;
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        try {
            java.lang.reflect.Method var6 = null;
            p var4_ref = null;
            Class var7 = null;
            p var4 = (p) ((oa) this).field_h.a((byte) 106, (long)((Object) (Object) param0).hashCode());
            if (var4 == null) {
                try {
                    var7 = Class.forName("java.awt.Canvas");
                    var6 = var7.getMethod("setIgnoreRepaint", new Class[1]);
                    Object discarded$0 = var6.invoke((Object) (Object) param0, new Object[1]);
                } catch (Exception exception) {
                }
                var4_ref = new p((oa) this, param0, param1, param2);
                ((oa) this).field_h.a(-125, (long)((Object) (Object) param0).hashCode(), (wf) (Object) var4_ref);
            } else {
                if (((p) var4_ref).field_h == param1) {
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

    final void b(int param0) {
        vk.a((byte) 117);
        this.d(param0);
        ya var2 = (ya) ((oa) this).field_m.d(268435455);
        while (var2 != null) {
            var2.r();
            var2 = (ya) ((oa) this).field_m.b((byte) 103);
        }
    }

    private final native void FA();

    final boolean b() {
        return true;
    }

    public final native void w(boolean param0);

    final pa a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (pa) (Object) new j((oa) this, param0, param1, param2, param3, param4, false);
    }

    private final void a(java.awt.Canvas param0) {
        p var2 = null;
        if (param0 != null) {
            var2 = (p) ((oa) this).field_h.a((byte) 106, (long)((Object) (Object) param0).hashCode());
            ((oa) this).field_d = var2;
            this.t(var2);
        } else {
            ((oa) this).field_d = null;
            this.t((p) null);
        }
    }

    private final native void va(za param0);

    final native void KA(int param0, int param1, int param2, int param3);

    private final void g(int param0) {
        int var2 = 0;
        ((oa) this).field_n = param0;
        ((oa) this).field_k = new a[((oa) this).field_n];
        for (var2 = 0; var2 < ((oa) this).field_n; var2++) {
            ((oa) this).field_k[var2] = new a((oa) this, ((oa) this).field_e, ((oa) this).field_l);
        }
    }

    final native void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native void d(int param0);

    final za c(int param0) {
        ya var2 = new ya((oa) this, param0);
        ((oa) this).field_m.a(119, (wf) (Object) var2);
        return (za) (Object) var2;
    }

    private final boolean WA(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        uh var3 = null;
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
                    var2_ref = (Object) (Object) ((oa) this).field_a;
                    // monitorenter ((oa) this).field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((oa) this).field_a.a((int) param0, -3804)) {
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
                        var3 = ((oa) this).field_a.a(false, (int) param0);
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
                        if (((uh) var3).field_q == 2) {
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
                        var4 = ((oa) this).field_a.a(128, (int) param0, (byte) -18, true, 128, 0.699999988079071f);
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
                        var4 = ((oa) this).field_a.a((int) param0, -10805, 128, true, 0.699999988079071f, 128);
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
                        this.CA(param0, var4, ((uh) var3).field_t, ((uh) var3).field_q, ((uh) var3).field_c, ((uh) var3).field_s, ((uh) var3).field_h, ((uh) var3).field_o, ((uh) var3).field_r, ((uh) var3).field_b, ((uh) var3).field_n, ((uh) var3).field_j, ((uh) var3).field_f, ((uh) var3).field_a, ((uh) var3).field_p, ((uh) var3).field_d, ((uh) var3).field_l, ((uh) var3).field_k, ((uh) var3).field_i, ((uh) var3).field_m, ((uh) var3).field_e);
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

    final void e() {
    }

    private final Object OA() {
        return (Object) (Object) new ba((oa) this);
    }

    final boolean d() {
        return false;
    }

    final da a(vs param0, vd[] param1, boolean param2) {
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
                return (da) (Object) new n((oa) this, ((oa) this).field_i, param0, param1, (pa[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            } else {
              if (var6 == 0) {
                return (da) (Object) new h((oa) this, ((oa) this).field_i, param0, param1, (pa[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            }
          } else {
            var4[var7] = param1[var7].field_h;
            var5[var7] = param1[var7].field_c;
            if (param1[var7].field_e != null) {
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

    final native void T(int param0, int param1, int param2, int param3);

    final void a(za param0) {
        ((oa) this).field_i = (ya) param0;
        this.va(param0);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((oa) this).U(param0, param1, param2, param4, param5);
        ((oa) this).U(param0, param1 + param3 - 1, param2, param4, param5);
        this.P(param0, param1 + 1, param3 - 1, param4, param5);
        this.P(param0 + param2 - 1, param1 + 1, param3 - 1, param4, param5);
    }

    private final void g() {
        System.gc();
        System.runFinalization();
        vk.a((byte) -69);
    }

    final sm a(ra param0, gd param1) {
        return (sm) (Object) new wa((oa) this, (j) param0, (xa) param1);
    }

    private final native void ma(long param0);

    final native void U(int param0, int param1, int param2, int param3, int param4);

    private final native void wa(int param0, int param1, int param2, int param3, int param4, int param5);

    final gd a(int param0, int param1) {
        return (gd) (Object) new xa(param0, param1);
    }

    protected final synchronized void finalize() {
        ((oa) this).a(-9);
        if (((oa) this).field_nativeid != 0L) {
            vk.a((e) this, -111);
        }
    }

    private final native void t(p param0);

    final native int XA();

    final void b(int param0, int param1) throws lp {
        if (((oa) this).field_d == null) {
            throw new IllegalStateException("off");
        }
        ((oa) this).field_d.a(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int discarded$0 = Math.max(Math.max(104, 20), 24573);
    }
}
