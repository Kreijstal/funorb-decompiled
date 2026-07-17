/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends ha implements e {
    private boolean field_m;
    private ij field_c;
    private ya field_k;
    long field_nativeid;
    private p field_e;
    private pw field_j;
    private int field_d;
    private int field_f;
    private gnb field_i;
    private a[] field_g;
    private boolean field_h;
    private int field_l;

    final boolean q() {
        return true;
    }

    final native void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native void wa(int param0, int param1, int param2, int param3, int param4, int param5);

    final boolean k() {
        return false;
    }

    final native void KA(int param0, int param1, int param2, int param3);

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        try {
            Exception exception = null;
            p var4 = null;
            java.lang.reflect.Method var6 = null;
            Class var7 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var4 = (p) (Object) ((oa) this).field_i.a((long)((Object) (Object) param0).hashCode(), 122);
              if (var4 != null) {
                L1: {
                  if (var4.field_e != param1) {
                    break L1;
                  } else {
                    if (var4.field_g == param2) {
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
                var4.a(param0, param1, param2);
                break L0;
              } else {
                try {
                  L2: {
                    var7 = Class.forName("java.awt.Canvas");
                    var6 = var7.getMethod("setIgnoreRepaint", new Class[1]);
                    Object discarded$2 = var6.invoke((Object) (Object) param0, new Object[1]);
                    break L2;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L3;
                  }
                }
                var4 = new p((oa) this, param0, param1, param2);
                ((oa) this).field_i.a((long)((Object) (Object) param0).hashCode(), (ksa) (Object) var4, (byte) -127);
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final native void CA(short param0, int[] param1, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    final native void K(int[] param0);

    final aja a(ima param0, boolean param1) {
        j var3 = new j((oa) this, param0.field_b, param0.field_h, param0.field_a, 0, param0.field_f, param0.field_f, param0.field_e);
        ((aja) (Object) var3).a(param0.field_c, param0.field_g, param0.field_i, param0.field_d);
        return (aja) (Object) var3;
    }

    final native void DA(int param0, int param1, int param2, int param3);

    final boolean r() {
        return false;
    }

    final boolean m() {
        return true;
    }

    final void o() {
        if (((oa) this).field_m) {
            return;
        }
        ((oa) this).field_g = null;
        ((oa) this).field_e = null;
        ((oa) this).field_k = null;
        ((oa) this).field_i.a((byte) -103);
        ya var1 = (ya) (Object) ((oa) this).field_c.d(0);
        while (var1 != null) {
            var1.ga();
            var1 = (ya) (Object) ((oa) this).field_c.a((byte) 33);
        }
        ((oa) this).field_c.e(93);
        this.FA();
        if (((oa) this).field_h) {
            uhb.a((byte) -115, true, false);
            ((oa) this).field_h = false;
        }
        this.g();
        pq.a(true);
        ((oa) this).field_m = true;
    }

    final void a(hf param0) {
        wa var2 = (wa) (Object) param0;
        this.n(var2.field_a.field_nativeid, var2.field_b.field_nativeid);
    }

    private final native void AA(short param0, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final void j() {
        this.a(((oa) this).field_e.field_f);
    }

    final native void T(int param0, int param1, int param2, int param3);

    final pw d() {
        return (pw) (Object) new ja();
    }

    private final native void ma(long param0);

    final native void ya();

    private final native void va(za param0);

    final boolean h() {
        return true;
    }

    final boolean w() {
        return true;
    }

    final boolean n() {
        return true;
    }

    private final native void MA(d param0, int param1, int param2);

    final int t() {
        return 4;
    }

    private final native void t(p param0);

    private final Object OA() {
        return (Object) (Object) new ba((oa) this);
    }

    final boolean c() {
        return false;
    }

    final void d(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((oa) this).U(param0, param1, param2, param4, param5);
        ((oa) this).U(param0, param1 + param3 - 1, param2, param4, param5);
        ((oa) this).P(param0, param1 + 1, param3 - 1, param4, param5);
        ((oa) this).P(param0 + param2 - 1, param1 + 1, param3 - 1, param4, param5);
    }

    final da a(sw param0, ima[] param1, boolean param2) {
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
                return (da) (Object) new n((oa) this, ((oa) this).field_k, param0, param1, (aja[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            } else {
              if (var6 == 0) {
                return (da) (Object) new h((oa) this, ((oa) this).field_k, param0, param1, (aja[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            }
          } else {
            var4[var7] = param1[var7].field_f;
            var5[var7] = param1[var7].field_e;
            if (param1[var7].field_a != null) {
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

    final boolean l() {
        return true;
    }

    final native void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    final native void GA(int param0);

    final boolean e() {
        return true;
    }

    private final void g() {
        System.gc();
        System.runFinalization();
        int discarded$0 = -128;
        pq.a();
    }

    protected final synchronized void finalize() {
        ((oa) this).a((byte) 30);
        if (((oa) this).field_nativeid != 0L) {
            pq.a(0, (e) this);
        }
    }

    final void v() {
    }

    final boolean b() {
        return false;
    }

    private final a y() {
        int var1 = 0;
        var1 = 0;
        L0: while (true) {
          if (var1 < ((oa) this).field_l) {
            if ((Object) (Object) ((oa) this).field_g[var1].field_a != (Object) (Object) Thread.currentThread()) {
              var1++;
              continue L0;
            } else {
              return ((oa) this).field_g[var1];
            }
          } else {
            return null;
          }
        }
    }

    private final native void FA();

    final boolean s() {
        return false;
    }

    final native int XA();

    final native void U(int param0, int param1, int param2, int param3, int param4);

    private final native void n(long param0, long param1);

    final wib b(int param0, int param1) {
        return (wib) (Object) new xa(param0, param1);
    }

    final void c(int param0) {
        int discarded$0 = -128;
        pq.a();
        this.d(param0);
        ya var2 = (ya) (Object) ((oa) this).field_c.d(0);
        while (var2 != null) {
            var2.r();
            var2 = (ya) (Object) ((oa) this).field_c.a((byte) 121);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        throw new IllegalStateException();
    }

    final void a(pw param0) {
        ((oa) this).field_j = param0;
        this.ma(((ja) (Object) param0).field_nativeid);
    }

    private final native void d(int param0);

    private final void g(int param0) {
        int var2 = 0;
        ((oa) this).field_l = 1;
        ((oa) this).field_g = new a[((oa) this).field_l];
        for (var2 = 0; var2 < ((oa) this).field_l; var2++) {
            ((oa) this).field_g[var2] = new a((oa) this, ((oa) this).field_d, ((oa) this).field_f);
        }
    }

    final ka a(cbb param0, int param1, int param2, int param3, int param4) {
        return (ka) (Object) new i((oa) this, ((oa) this).field_k, param0, param1, param2, param3, param4);
    }

    final za e(int param0) {
        ya var2 = new ya((oa) this, param0);
        ((oa) this).field_c.b(-10258, (ksa) (Object) var2);
        return (za) (Object) var2;
    }

    private final void f(int param0) {
        ((oa) this).field_g[0].a();
    }

    final void a(za param0) {
        ((oa) this).field_k = (ya) (Object) param0;
        this.va(param0);
    }

    public final native void w(boolean param0);

    final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.wa(param0, param1, param2, param3, param4, param5);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.y().a((ha) this, param0, param1, param2, param3, param4, param5, param6);
    }

    final boolean a() {
        return true;
    }

    final void a(float param0, float param1, float param2) {
    }

    final native void za(int param0, int param1, int param2, int param3, int param4);

    final aja a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (aja) (Object) new j((oa) this, param0, param1, param2, param3, param4, false);
    }

    final native void ZA(int param0, float param1, float param2, float param3, float param4, float param5);

    final native int[] na(int param0, int param1, int param2, int param3);

    private final void a(java.awt.Canvas param0) {
        p var2 = null;
        if (param0 != null) {
            var2 = (p) (Object) ((oa) this).field_i.a((long)((Object) (Object) param0).hashCode(), 124);
            ((oa) this).field_e = var2;
            this.t(var2);
        } else {
            ((oa) this).field_e = null;
            this.t((p) null);
        }
    }

    final native int[] Y();

    final native void P(int param0, int param1, int param2, int param3, int param4);

    final native int i();

    final void u() {
    }

    final hf a(ekb param0, wib param1) {
        return (hf) (Object) new wa((oa) this, (j) (Object) param0, (xa) (Object) param1);
    }

    final native void f(int param0, int param1);

    final boolean p() {
        return true;
    }

    final native void xa(float param0);

    public oa(java.awt.Canvas param0, d param1, int param2, int param3) {
        super(param1);
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        ((oa) this).field_m = false;
        ((oa) this).field_nativeid = 0L;
        ((oa) this).field_c = new ij();
        ((oa) this).field_f = 4096;
        ((oa) this).field_d = 4096;
        ((oa) this).field_i = new gnb(4);
        ((oa) this).field_h = false;
        try {
          L0: {
            int discarded$13 = 114;
            if (gpb.a("sw3d")) {
              L1: {
                int discarded$14 = -76;
                pq.b();
                this.MA(((oa) this).field_a, 0, 0);
                int discarded$15 = 1;
                int discarded$16 = 33;
                ocb.a(false);
                ((oa) this).field_h = true;
                ja discarded$17 = new ja();
                ((oa) this).a((pw) (Object) new ja());
                this.g(1);
                this.f(0);
                if (param0 == null) {
                  break L1;
                } else {
                  this.a(param0, param2, param3);
                  this.a(param0);
                  break L1;
                }
              }
              break L0;
            } else {
              throw new RuntimeException("");
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          ((oa) this).a((byte) 30);
          throw new RuntimeException();
        }
    }

    private final boolean WA(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        opa var3 = null;
        int[] var4 = null;
        Throwable var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var2_ref = (Object) (Object) ((oa) this).field_a;
        synchronized (var2_ref) {
          L0: {
            if (((oa) this).field_a.a((int) param0, (byte) -73)) {
              var3 = ((oa) this).field_a.a(-20292, (int) param0);
              if (var3 != null) {
                L1: {
                  if (var3.field_q == 2) {
                    var4 = ((oa) this).field_a.a(99, 128, 128, true, (int) param0, 0.699999988079071f);
                    break L1;
                  } else {
                    var4 = ((oa) this).field_a.a(128, 0.699999988079071f, true, (int) param0, 128, true);
                    break L1;
                  }
                }
                this.CA(param0, var4, var3.field_l, var3.field_q, var3.field_c, var3.field_n, var3.field_o, var3.field_h, var3.field_b, var3.field_g, var3.field_p, var3.field_d, var3.field_r, var3.field_m, var3.field_a, var3.field_k, var3.field_s, var3.field_j, var3.field_i, var3.field_e, var3.field_f);
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return true;
    }

    private final boolean c(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        opa var3 = null;
        Throwable var4 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        var2_ref = this;
        synchronized (var2_ref) {
          L0: {
            var3 = ((oa) this).field_a.a(-20292, (int) param0);
            if (var3 != null) {
              this.AA(param0, var3.field_l, var3.field_q, var3.field_c, var3.field_n, var3.field_o, var3.field_h, var3.field_b, var3.field_g, var3.field_p, var3.field_d, var3.field_r, var3.field_m, var3.field_a, var3.field_k, var3.field_s, var3.field_j, var3.field_i, var3.field_e, var3.field_f);
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return true;
    }

    final void a(int param0, int param1) throws jkb {
        if (((oa) this).field_e == null) {
            throw new IllegalStateException("off");
        }
        ((oa) this).field_e.a(param0, param1);
    }

    final boolean f() {
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
    }

    final native void s(int param0, int param1, int param2, int param3, int param4);

    final aja a(int param0, int param1, boolean param2) {
        return (aja) (Object) new j((oa) this, param0, param1);
    }

    final boolean x() {
        return true;
    }

    final void a(aja param0, boolean param1) {
        this.n(((j) (Object) param0).field_nativeid, 0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int discarded$0 = Math.max(Math.max(104, 20), 24573);
    }
}
