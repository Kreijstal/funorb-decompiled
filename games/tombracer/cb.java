/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb implements ks {
    private int field_a;
    private int field_b;
    private int field_e;
    private int field_c;
    private int field_g;
    static nh[] field_i;
    private cka field_f;
    private int field_d;
    private wia[] field_h;

    private final void a(int param0, rt param1, int param2, int param3) {
        int var5 = 0;
        if (-1 != ((cb) this).field_a) {
          var5 = param0 << param3;
          if (-1 != (((cb) this).field_e & var5)) {
            if (((cb) this).field_c == param1.field_l) {
              if (((cb) this).field_g != param1.field_o) {
                throw new RuntimeException();
              } else {
                param1.a(((cb) this).field_a, param2, 0, vta.field_d[param3]);
                ((cb) this).field_h[param3] = (wia) (Object) param1;
                ((cb) this).field_e = ((cb) this).field_e | var5;
                return;
              }
            } else {
              throw new RuntimeException();
            }
          } else {
            ((cb) this).field_g = param1.field_o;
            ((cb) this).field_c = param1.field_l;
            param1.a(((cb) this).field_a, param2, 0, vta.field_d[param3]);
            ((cb) this).field_h[param3] = (wia) (Object) param1;
            ((cb) this).field_e = ((cb) this).field_e | var5;
            return;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(((cb) this).field_a);
        var3 = 59 % ((param0 - 53) / 33);
        if (36053 == var2) {
          return true;
        } else {
          return false;
        }
    }

    public final void c(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, ((cb) this).field_b);
        ((cb) this).field_d = ((cb) this).field_d | 2;
        ((cb) this).field_a = this.e(0);
        if (param0 < 29) {
            ((cb) this).a((byte) -62);
        }
    }

    public final void d(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        if (param0 < 10) {
          return;
        } else {
          ((cb) this).field_d = ((cb) this).field_d & -2;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    public final void a(byte param0) {
        if (param0 >= -115) {
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36008, ((cb) this).field_b);
          ((cb) this).field_d = ((cb) this).field_d | 1;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    final void b(int param0, int param1) {
        if (param0 == ((cb) this).field_a) {
            throw new RuntimeException();
        }
        jaggl.OpenGL.glReadBuffer(vta.field_d[param1]);
    }

    public final void b(byte param0) {
        if (param0 != -36) {
          ((cb) this).c((byte) 91);
          jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
          ((cb) this).field_d = ((cb) this).field_d & -5;
          ((cb) this).field_a = this.e(0);
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
          ((cb) this).field_d = ((cb) this).field_d & -5;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    final void a(int param0, int param1) {
        int var3 = -110 % ((-35 - param0) / 34);
        if (!(null == ((cb) this).field_h[param1])) {
            ((cb) this).field_h[param1].a(109);
        }
        ((cb) this).field_e = ((cb) this).field_e & (1 << param1 ^ -1);
        ((cb) this).field_h[param1] = null;
    }

    final void a(int param0, kba param1, boolean param2) {
        int var4 = 0;
        if (-1 == ((cb) this).field_a) {
          throw new RuntimeException();
        } else {
          L0: {
            var4 = 1 << param0;
            if (-1 == (var4 & ((cb) this).field_e)) {
              ((cb) this).field_c = param1.field_n;
              ((cb) this).field_g = param1.field_l;
              break L0;
            } else {
              if (param1.field_n == ((cb) this).field_c) {
                if (((cb) this).field_g == param1.field_l) {
                  break L0;
                } else {
                  throw new RuntimeException();
                }
              } else {
                throw new RuntimeException();
              }
            }
          }
          param1.a(vta.field_d[param0], ((cb) this).field_a, -23992);
          if (!param2) {
            ((cb) this).a(-122, 86);
            ((cb) this).field_h[param0] = (wia) (Object) param1;
            ((cb) this).field_e = ((cb) this).field_e | var4;
            return;
          } else {
            ((cb) this).field_h[param0] = (wia) (Object) param1;
            ((cb) this).field_e = ((cb) this).field_e | var4;
            return;
          }
        }
    }

    final void a(boolean param0, rt param1, int param2) {
        this.a(1, param1, 0, param2);
        if (!param0) {
            cb.d(-3);
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -91) {
            ((cb) this).a(-7, -21);
            if (!(0 != ((cb) this).field_a)) {
                throw new RuntimeException();
            }
            jaggl.OpenGL.glDrawBuffer(vta.field_d[param0]);
            return;
        }
        if (!(0 != ((cb) this).field_a)) {
            throw new RuntimeException();
        }
        jaggl.OpenGL.glDrawBuffer(vta.field_d[param0]);
    }

    private final int e(int param0) {
        if ((((cb) this).field_d & 4) != 0) {
          return 36160;
        } else {
          if (param0 == (((cb) this).field_d & 2)) {
            if (-1 != (((cb) this).field_d & 1 ^ -1)) {
              return 36008;
            } else {
              return -1;
            }
          } else {
            return 36009;
          }
        }
    }

    public final void b(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, ((cb) this).field_b);
        ((cb) this).field_d = ((cb) this).field_d | 4;
        ((cb) this).field_a = this.e(param0 ^ param0);
    }

    public final void a(int param0) {
        if (param0 != 4245) {
          int discarded$2 = this.e(-53);
          jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
          ((cb) this).field_d = ((cb) this).field_d & -3;
          ((cb) this).field_a = this.e(0);
          return;
        } else {
          jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
          ((cb) this).field_d = ((cb) this).field_d & -3;
          ((cb) this).field_a = this.e(0);
          return;
        }
    }

    protected final void finalize() throws Throwable {
        ((cb) this).field_f.e(2, ((cb) this).field_b);
        super.finalize();
    }

    public static void d(int param0) {
        if (param0 != 36053) {
            field_i = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    cb(cka param0) {
        ((cb) this).field_a = -1;
        ((cb) this).field_h = new wia[9];
        ((cb) this).field_d = 0;
        if (!param0.field_id) {
            throw new IllegalStateException("");
        }
        ((cb) this).field_f = param0;
        jaggl.OpenGL.glGenFramebuffersEXT(1, tg.field_b, 0);
        ((cb) this).field_b = tg.field_b[0];
    }

    static {
    }
}
