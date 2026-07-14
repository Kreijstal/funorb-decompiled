/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends f implements Cloneable {
    static dl field_k;
    static ko field_l;
    ea field_j;
    private int field_i;

    public static void f(int param0) {
        if (param0 != 3) {
            field_k = null;
            field_k = null;
            field_l = null;
            return;
        }
        field_k = null;
        field_l = null;
    }

    final boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            field_l = null;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        if (param2 != -25) {
          kj.field_a[((de) this).field_i].b(param5, param4, 2 * param2, param0 * 2);
          if (null == ((de) this).field_j) {
            var7 = 8 / ((-70 - param1) / 33);
            return;
          } else {
            ((de) this).field_j.a(param0, param5, param2, param4, true);
            qc.field_f[((de) this).field_i].b(param5, param4, 2 * param2, 2 * param0);
            var7 = 8 / ((-70 - param1) / 33);
            return;
          }
        } else {
          if (-25 == param0) {
            kj.field_a[((de) this).field_i].c(param5, param4);
            if (null != ((de) this).field_j) {
              ((de) this).field_j.a(param0, param5, param2, param4, true);
              qc.field_f[((de) this).field_i].a(param5, param4);
              var7 = 8 / ((-70 - param1) / 33);
              return;
            } else {
              var7 = 8 / ((-70 - param1) / 33);
              return;
            }
          } else {
            kj.field_a[((de) this).field_i].b(param5, param4, 2 * param2, param0 * 2);
            if (null == ((de) this).field_j) {
              var7 = 8 / ((-70 - param1) / 33);
              return;
            } else {
              ((de) this).field_j.a(param0, param5, param2, param4, true);
              qc.field_f[((de) this).field_i].b(param5, param4, 2 * param2, 2 * param0);
              var7 = 8 / ((-70 - param1) / 33);
              return;
            }
          }
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            field_k = null;
            return 3;
        }
        return 3;
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            return null;
        }
        return new pf(param2, param0, (f) this).a(param0, (byte) -110, param2);
    }

    final boolean e(int param0) {
        if (param0 != -4128) {
            return false;
        }
        return true;
    }

    final boolean b(byte param0) {
        if (param0 <= 43) {
            ((de) this).field_i = 114;
            return true;
        }
        return true;
    }

    final static db a(boolean param0, boolean param1, int param2, int param3, int param4) {
        if (param4 != 12) {
          field_l = null;
          return qk.a(param2, param4 + 86, param0, param1, false, param3);
        } else {
          return qk.a(param2, param4 + 86, param0, param1, false, param3);
        }
    }

    final boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            return false;
        }
        return true;
    }

    final static void a(byte param0, db param1) {
        dl var2 = null;
        int var3 = 0;
        int var4 = 0;
        var2 = new dl(param1.a(7693, "", "final_frame.jpg"), (java.awt.Component) (Object) jd.field_D);
        var3 = var2.field_l;
        var4 = var2.field_u;
        hd.a(false);
        if (param0 >= -58) {
          field_l = null;
          kn.field_p = new dl(var3, var4 * 3 / 4);
          kn.field_p.a();
          var2.c(0, 0);
          ne.field_e = new dl(var3, var4 + -kn.field_p.field_u);
          ne.field_e.a();
          var2.c(0, -kn.field_p.field_u);
          ne.field_e.field_t = kn.field_p.field_u;
          lg.a(1);
          return;
        } else {
          kn.field_p = new dl(var3, var4 * 3 / 4);
          kn.field_p.a();
          var2.c(0, 0);
          ne.field_e = new dl(var3, var4 + -kn.field_p.field_u);
          ne.field_e.a();
          var2.c(0, -kn.field_p.field_u);
          ne.field_e.field_t = kn.field_p.field_u;
          lg.a(1);
          return;
        }
    }

    final nj a(int param0, nj param1) {
        de var3 = null;
        if (param0 == 23525) {
          var3 = new de(((de) this).field_i);
          if (null == ((de) this).field_j) {
            return ng.a(mg.field_h, param1, (f) (Object) var3, (byte) -83, hl.field_e);
          } else {
            var3.field_j = (ea) ((de) this).field_j.clone();
            return ng.a(mg.field_h, param1, (f) (Object) var3, (byte) -83, wa.field_j);
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            field_l = null;
            return true;
        }
        return true;
    }

    de() {
        this(0);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        if (param5 != -87) {
            return null;
        }
        if (!(param4 != null)) {
            return (f) this;
        }
        dd.field_c.a(32, 12 * param2, 12 * param1, 0, (byte) -111);
        return (f) (Object) new ig(param0, param4, (f) this, false);
    }

    final void a(int param0, int param1, int param2) {
        Object var5 = null;
        L0: {
          if (null != ((de) this).field_j) {
            si.field_e.a(128, param2, param1, 60, (byte) -111);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != -29660) {
          var5 = null;
          boolean discarded$2 = ((de) this).a(false, (f[][]) null, (mj) null);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
            field_k = null;
            ((de) this).field_i = param0;
            return;
        }
        ((de) this).field_i = param0;
    }

    private de(int param0) {
        ((de) this).field_j = null;
        ((de) this).field_i = param0;
    }

    static {
    }
}
