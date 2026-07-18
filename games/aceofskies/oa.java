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
        Throwable decompiledCaughtException = null;
        ((oa) this).field_j = false;
        ((oa) this).field_nativeid = 0L;
        ((oa) this).field_m = new kp();
        ((oa) this).field_l = 4096;
        ((oa) this).field_e = 4096;
        ((oa) this).field_h = new ph(4);
        ((oa) this).field_g = false;
        try {
          L0: {
            if (ei.a("sw3d", (byte) -16)) {
              L1: {
                vk.b(false);
                this.MA(((oa) this).field_a, 0, 0);
                fr.a(false, 0, true);
                ((oa) this).field_g = true;
                ja discarded$2 = new ja();
                this.a((ao) (Object) new ja());
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
          ((oa) this).a(-9);
          throw new RuntimeException();
        }
    }

    final void a(pa param0, boolean param1) {
        this.n(((j) (Object) param0).field_nativeid, 0L);
    }

    final void c(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.wa(param0, param1, param2, param3, param4, param5);
    }

    private final void f(int param0) {
        ((oa) this).field_k[0].a();
    }

    private final native void n(long param0, long param1);

    final void a(sm param0) {
        wa var2 = (wa) (Object) param0;
        this.n(var2.field_a.field_nativeid, var2.field_b.field_nativeid);
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
        ya var1 = (ya) (Object) ((oa) this).field_m.d(268435455);
        while (var1 != null) {
            var1.ga();
            var1 = (ya) (Object) ((oa) this).field_m.b((byte) 103);
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
        this.ma(((ja) (Object) param0).field_nativeid);
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
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        var2_ref = this;
        synchronized (var2_ref) {
          L0: {
            var3 = ((oa) this).field_a.a(false, (int) param0);
            if (var3 != null) {
              this.AA(param0, var3.field_t, var3.field_q, var3.field_c, var3.field_s, var3.field_h, var3.field_o, var3.field_r, var3.field_b, var3.field_n, var3.field_j, var3.field_f, var3.field_a, var3.field_p, var3.field_d, var3.field_l, var3.field_k, var3.field_i, var3.field_m, var3.field_e);
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

    final pa a(vd param0, boolean param1) {
        j var3 = new j((oa) this, param0.field_f, param0.field_d, param0.field_e, 0, param0.field_h, param0.field_h, param0.field_c);
        ((pa) (Object) var3).a(param0.field_a, param0.field_i, param0.field_g, param0.field_b);
        return (pa) (Object) var3;
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        try {
            Exception exception = null;
            p var4 = null;
            java.lang.reflect.Method var6 = null;
            Class var7 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var4 = (p) (Object) ((oa) this).field_h.a((byte) 106, (long)((Object) (Object) param0).hashCode());
              if (var4 != null) {
                L1: {
                  if (var4.field_h != param1) {
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
                ((oa) this).field_h.a(-125, (long)((Object) (Object) param0).hashCode(), (wf) (Object) var4);
                break L0;
              }
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
        ya var2 = (ya) (Object) ((oa) this).field_m.d(268435455);
        while (var2 != null) {
            var2.r();
            var2 = (ya) (Object) ((oa) this).field_m.b((byte) 103);
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
            var2 = (p) (Object) ((oa) this).field_h.a((byte) 106, (long)((Object) (Object) param0).hashCode());
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
        ((oa) this).field_n = 1;
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
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var2_ref = (Object) (Object) ((oa) this).field_a;
        synchronized (var2_ref) {
          L0: {
            if (((oa) this).field_a.a((int) param0, -3804)) {
              var3 = ((oa) this).field_a.a(false, (int) param0);
              if (var3 != null) {
                L1: {
                  if (var3.field_q == 2) {
                    var4 = ((oa) this).field_a.a((int) param0, -10805, 128, true, 0.699999988079071f, 128);
                    break L1;
                  } else {
                    var4 = ((oa) this).field_a.a(128, (int) param0, (byte) -18, true, 128, 0.699999988079071f);
                    break L1;
                  }
                }
                this.CA(param0, var4, var3.field_t, var3.field_q, var3.field_c, var3.field_s, var3.field_h, var3.field_o, var3.field_r, var3.field_b, var3.field_n, var3.field_j, var3.field_f, var3.field_a, var3.field_p, var3.field_d, var3.field_l, var3.field_k, var3.field_i, var3.field_m, var3.field_e);
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
        ((oa) this).field_i = (ya) (Object) param0;
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
        return (sm) (Object) new wa((oa) this, (j) (Object) param0, (xa) (Object) param1);
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
