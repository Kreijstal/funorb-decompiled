/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends ha implements e {
    private jn field_o;
    long field_nativeid;
    private boolean field_m;
    private ya field_i;
    private eu field_p;
    private te field_q;
    private int field_n;
    private p field_r;
    private int field_j;
    private int field_l;
    private a[] field_s;
    private boolean field_k;

    final native void K(int[] param0);

    public final native void w(boolean param0);

    final nr a(int param0, int param1) {
        return (nr) (Object) new xa(param0, param1);
    }

    private final native void AA(short param0, short param1, int param2, byte param3, byte param4, int param5, boolean param6, byte param7, byte param8, byte param9, byte param10, boolean param11, boolean param12, boolean param13, boolean param14, boolean param15, byte param16, boolean param17, boolean param18, int param19);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.wa(param0, param1, param2, param3, param4, param5);
    }

    protected final synchronized void finalize() {
        ((oa) this).a((byte) -22);
        if (((oa) this).field_nativeid != 0L) {
            pa.a((e) this, (byte) -37);
        }
    }

    final void a(vc param0) {
        wa var2 = (wa) (Object) param0;
        this.n(var2.field_a.field_nativeid, var2.field_b.field_nativeid);
    }

    private final void a(java.awt.Canvas param0, int param1, int param2) {
        try {
            Exception exception = null;
            p var4 = null;
            java.lang.reflect.Method var6 = null;
            Class var7 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              var4 = (p) (Object) ((oa) this).field_q.a(106, (long)((Object) (Object) param0).hashCode());
              if (var4 != null) {
                L1: {
                  if (var4.field_m != param1) {
                    break L1;
                  } else {
                    if (var4.field_l == param2) {
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
                ((oa) this).field_q.a((ms) (Object) var4, -1, (long)((Object) (Object) param0).hashCode());
                break L0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final native void va(za param0);

    private final void a(java.awt.Canvas param0) {
        p var2 = null;
        if (param0 != null) {
            var2 = (p) (Object) ((oa) this).field_q.a(127, (long)((Object) (Object) param0).hashCode());
            ((oa) this).field_r = var2;
            this.t(var2);
        } else {
            ((oa) this).field_r = null;
            this.t((p) null);
        }
    }

    private final native void FA();

    final native void U(int param0, int param1, int param2, int param3, int param4);

    final native int XA();

    final za c(int param0) {
        ya var2 = new ya((oa) this, param0);
        ((oa) this).field_o.a((ms) (Object) var2, (byte) 39);
        return (za) (Object) var2;
    }

    private final void a(eu param0) {
        ((oa) this).field_p = param0;
        this.ma(((ja) (Object) param0).field_nativeid);
    }

    final native void KA(int param0, int param1, int param2, int param3);

    final void e() {
    }

    final hr a(ri param0, boolean param1) {
        j var3 = new j((oa) this, param0.field_g, param0.field_e, param0.field_a, 0, param0.field_h, param0.field_h, param0.field_i);
        ((hr) (Object) var3).a(param0.field_c, param0.field_d, param0.field_b, param0.field_f);
        return (hr) (Object) var3;
    }

    final vc a(bu param0, nr param1) {
        return (vc) (Object) new wa((oa) this, (j) (Object) param0, (xa) (Object) param1);
    }

    final native void s(int param0, int param1, int param2, int param3, int param4);

    final native void SA(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6);

    private final native void wa(int param0, int param1, int param2, int param3, int param4, int param5);

    private final native void n(long param0, long param1);

    private final void h(int param0) {
        int var2 = 0;
        ((oa) this).field_l = 1;
        ((oa) this).field_s = new a[((oa) this).field_l];
        for (var2 = 0; var2 < ((oa) this).field_l; var2++) {
            ((oa) this).field_s[var2] = new a((oa) this, ((oa) this).field_j, ((oa) this).field_n);
        }
    }

    public oa(java.awt.Canvas param0, d param1, int param2, int param3) {
        super(param1);
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        ((oa) this).field_m = false;
        ((oa) this).field_nativeid = 0L;
        ((oa) this).field_o = new jn();
        ((oa) this).field_n = 4096;
        ((oa) this).field_j = 4096;
        ((oa) this).field_q = new te(4);
        ((oa) this).field_k = false;
        try {
          L0: {
            if (mc.b((byte) -124, "sw3d")) {
              L1: {
                pa.b((byte) -119);
                this.MA(((oa) this).field_h, 0, 0);
                kr.a(true, -21, false);
                ((oa) this).field_k = true;
                ja discarded$2 = new ja();
                this.a((eu) (Object) new ja());
                this.h(1);
                this.g(0);
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
          ((oa) this).a((byte) -121);
          throw new RuntimeException();
        }
    }

    private final boolean c(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        wm var3 = null;
        Throwable var4 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        var2_ref = this;
        synchronized (var2_ref) {
          L0: {
            var3 = ((oa) this).field_h.a(-29193, (int) param0);
            if (var3 != null) {
              this.AA(param0, var3.field_e, var3.field_p, var3.field_d, var3.field_j, var3.field_h, var3.field_n, var3.field_t, var3.field_g, var3.field_c, var3.field_u, var3.field_r, var3.field_m, var3.field_b, var3.field_l, var3.field_i, var3.field_k, var3.field_s, var3.field_o, var3.field_q);
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

    private final void g() {
        System.gc();
        System.runFinalization();
        pa.a(-121);
    }

    final void d() {
        if (((oa) this).field_m) {
            return;
        }
        ((oa) this).field_s = null;
        ((oa) this).field_r = null;
        ((oa) this).field_i = null;
        ((oa) this).field_q.c(6407);
        ya var1 = (ya) (Object) ((oa) this).field_o.b(99);
        while (var1 != null) {
            var1.ga();
            var1 = (ya) (Object) ((oa) this).field_o.d((byte) 18);
        }
        ((oa) this).field_o.e(125);
        this.FA();
        if (((oa) this).field_k) {
            pt.a(false, true, -1);
            ((oa) this).field_k = false;
        }
        this.g();
        pa.a((byte) -107);
        ((oa) this).field_m = true;
    }

    final da a(ta param0, ri[] param1, boolean param2) {
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
                return (da) (Object) new n((oa) this, ((oa) this).field_i, param0, param1, (hr[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            } else {
              if (var6 == 0) {
                return (da) (Object) new h((oa) this, ((oa) this).field_i, param0, param1, (hr[]) null);
              } else {
                throw new IllegalArgumentException("Cannot specify alpha with non-mono font unless someone writes it");
              }
            }
          } else {
            var4[var7] = param1[var7].field_h;
            var5[var7] = param1[var7].field_i;
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

    final native int i();

    private final boolean WA(short param0) {
        Object var2 = null;
        Object var2_ref = null;
        wm var3 = null;
        int[] var4 = null;
        Throwable var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var2_ref = (Object) (Object) ((oa) this).field_h;
        synchronized (var2_ref) {
          L0: {
            if (((oa) this).field_h.b(-29912, (int) param0)) {
              var3 = ((oa) this).field_h.a(-29193, (int) param0);
              if (var3 != null) {
                L1: {
                  if (var3.field_p == 2) {
                    var4 = ((oa) this).field_h.a(-25069, 128, 128, true, 0.699999988079071f, (int) param0);
                    break L1;
                  } else {
                    var4 = ((oa) this).field_h.a(true, 128, (byte) -81, 128, 0.699999988079071f, (int) param0);
                    break L1;
                  }
                }
                this.CA(param0, var4, var3.field_e, var3.field_p, var3.field_d, var3.field_j, var3.field_h, var3.field_n, var3.field_t, var3.field_g, var3.field_c, var3.field_u, var3.field_r, var3.field_m, var3.field_b, var3.field_l, var3.field_i, var3.field_k, var3.field_s, var3.field_o, var3.field_q);
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

    final boolean c() {
        return true;
    }

    final native void aa(int param0, int param1, int param2, int param3, int param4, int param5);

    final void b(int param0, int param1) throws rf {
        if (((oa) this).field_r == null) {
            throw new IllegalStateException("off");
        }
        ((oa) this).field_r.a(param0, param1);
    }

    final native void DA(int param0, int param1, int param2, int param3);

    final void b() {
        this.a(((oa) this).field_r.field_o);
    }

    final native int[] Y();

    final hr a(int[] param0, int param1, int param2, int param3, int param4, boolean param5) {
        return (hr) (Object) new j((oa) this, param0, param1, param2, param3, param4, false);
    }

    final void a(za param0) {
        ((oa) this).field_i = (ya) (Object) param0;
        this.va(param0);
    }

    final native void f(int param0, int param1);

    final boolean a() {
        return false;
    }

    private final native void t(p param0);

    private final native void CA(short param0, int[] param1, short param2, int param3, byte param4, byte param5, int param6, boolean param7, byte param8, byte param9, byte param10, byte param11, boolean param12, boolean param13, boolean param14, boolean param15, boolean param16, byte param17, boolean param18, boolean param19, int param20);

    private final native void ma(long param0);

    private final native void MA(d param0, int param1, int param2);

    private final native void d(int param0);

    final native void T(int param0, int param1, int param2, int param3);

    final void f(int param0) {
        pa.a(-127);
        this.d(param0);
        ya var2 = (ya) (Object) ((oa) this).field_o.b(-61);
        while (var2 != null) {
            var2.r();
            var2 = (ya) (Object) ((oa) this).field_o.d((byte) 18);
        }
    }

    final void a(hr param0, boolean param1) {
        this.n(((j) (Object) param0).field_nativeid, 0L);
    }

    final native void GA(int param0);

    private final void g(int param0) {
        ((oa) this).field_s[0].a();
    }

    private final Object OA() {
        return (Object) (Object) new ba((oa) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int discarded$0 = Math.max(Math.max(104, 20), 24573);
    }
}
