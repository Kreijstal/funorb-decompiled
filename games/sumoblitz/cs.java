/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs implements mw {
    private int field_b;
    private int field_a;
    private int field_e;
    private int field_g;
    private int field_h;
    private int field_f;
    private fr field_c;
    private ft[] field_d;

    final static int g(int param0) {
        wt.field_i.c((byte) 66);
        if (param0 != -5) {
            return 63;
        }
        if (jk.field_b.c((byte) 119)) {
            return 0;
        }
        return ji.a(true);
    }

    final void a(int param0, int param1) {
        if (param1 == 17012) {
          if (((cs) this).field_d[param0] != null) {
            ((cs) this).field_d[param0].a(109);
            ((cs) this).field_g = ((cs) this).field_g & (1 << param0 ^ -1);
            ((cs) this).field_d[param0] = null;
            return;
          } else {
            ((cs) this).field_g = ((cs) this).field_g & (1 << param0 ^ -1);
            ((cs) this).field_d[param0] = null;
            return;
          }
        } else {
          return;
        }
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        ((cs) this).field_h = ((cs) this).field_h & -2;
        if (param0 != -20745) {
          ((cs) this).c(-86);
          ((cs) this).field_f = this.f(24909);
          return;
        } else {
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    final void a(kf param0, int param1, int param2) {
        int var4 = 0;
        if (0 == (((cs) this).field_f ^ -1)) {
          throw new RuntimeException();
        } else {
          if (param2 == -14269) {
            var4 = 1 << param1;
            if (0 != (((cs) this).field_g & (var4 ^ -1))) {
              if (param0.field_A == ((cs) this).field_e) {
                if (param0.field_x != ((cs) this).field_b) {
                  throw new RuntimeException();
                } else {
                  param0.a(false, wv.field_a[param1], ((cs) this).field_f);
                  ((cs) this).field_d[param1] = (ft) (Object) param0;
                  ((cs) this).field_g = ((cs) this).field_g | var4;
                  return;
                }
              } else {
                throw new RuntimeException();
              }
            } else {
              ((cs) this).field_e = param0.field_A;
              ((cs) this).field_b = param0.field_x;
              param0.a(false, wv.field_a[param1], ((cs) this).field_f);
              ((cs) this).field_d[param1] = (ft) (Object) param0;
              ((cs) this).field_g = ((cs) this).field_g | var4;
              return;
            }
          } else {
            return;
          }
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        if (param0 == -276) {
          var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((cs) this).field_f);
          if (-36054 != var2) {
            return false;
          } else {
            return true;
          }
        } else {
          ((cs) this).a(99);
          var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((cs) this).field_f);
          if (-36054 != var2) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final int f(int param0) {
        if (param0 != 24909) {
            ((cs) this).field_a = -81;
            if (-1 != (4 & ((cs) this).field_h ^ -1)) {
                return 36160;
            }
            if (!(0 == (2 & ((cs) this).field_h))) {
                return 36009;
            }
            if (!((((cs) this).field_h & 1) == -1)) {
                return 36008;
            }
            return -1;
        }
        if (-1 != (4 & ((cs) this).field_h)) {
            return 36160;
        }
        if (!(0 == (2 & ((cs) this).field_h))) {
            return 36009;
        }
        if (!((((cs) this).field_h & 1) == 0)) {
            return 36008;
        }
        return -1;
    }

    protected final void finalize() throws Throwable {
        ((cs) this).field_c.b((byte) -92, ((cs) this).field_a);
        super.finalize();
    }

    public final void a(boolean param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        ((cs) this).field_h = ((cs) this).field_h & -3;
        ((cs) this).field_f = this.f(24909);
        if (param0) {
            ((cs) this).field_d = null;
        }
    }

    private final void a(int param0, int param1, int param2, us param3) {
        int var5 = 0;
        if (0 == (((cs) this).field_f ^ -1)) {
          throw new RuntimeException();
        } else {
          var5 = 1 << param2;
          if (param0 != (((cs) this).field_g & var5)) {
            if (param3.field_l == ((cs) this).field_e) {
              if (param3.field_o != ((cs) this).field_b) {
                throw new RuntimeException();
              } else {
                param3.a(-90, wv.field_a[param2], param1, ((cs) this).field_f);
                ((cs) this).field_d[param2] = (ft) (Object) param3;
                ((cs) this).field_g = ((cs) this).field_g | var5;
                return;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            ((cs) this).field_e = param3.field_l;
            ((cs) this).field_b = param3.field_o;
            param3.a(-90, wv.field_a[param2], param1, ((cs) this).field_f);
            ((cs) this).field_d[param2] = (ft) (Object) param3;
            ((cs) this).field_g = ((cs) this).field_g | var5;
            return;
          }
        }
    }

    final void a(us param0, int param1, int param2) {
        this.a(param1 + 4609, 0, param2, param0);
        if (param1 != -4610) {
            ((cs) this).field_h = 35;
        }
    }

    public final void c(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, ((cs) this).field_a);
        ((cs) this).field_h = ((cs) this).field_h | 1;
        ((cs) this).field_f = this.f(24909);
        if (param0 != 195) {
            ((cs) this).field_d = null;
        }
    }

    public final void e(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (param0 >= -32) {
          return;
        } else {
          ((cs) this).field_h = ((cs) this).field_h & -5;
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    cs(fr param0) {
        ((cs) this).field_h = 0;
        ((cs) this).field_f = -1;
        ((cs) this).field_d = new ft[9];
        if (!param0.field_xc) {
            throw new IllegalStateException("");
        }
        ((cs) this).field_c = param0;
        jaggl.OpenGL.glGenFramebuffersEXT(1, ci.field_e, 0);
        ((cs) this).field_a = ci.field_e[0];
    }

    public final void b(int param0) {
        if (param0 != 30352) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36160, ((cs) this).field_a);
          ((cs) this).field_h = ((cs) this).field_h | 4;
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    public final void d(int param0) {
        if (param0 <= 103) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36009, ((cs) this).field_a);
          ((cs) this).field_h = ((cs) this).field_h | 2;
          ((cs) this).field_f = this.f(24909);
          return;
        }
    }

    static {
    }
}
