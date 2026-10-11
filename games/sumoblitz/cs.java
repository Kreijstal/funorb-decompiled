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
        if (param1 != 17012) {
          return;
        }
        if (this.field_d[param0] == null) {
          this.field_g = this.field_g & ~(1 << param0);
          this.field_d[param0] = null;
          return;
        }
        this.field_d[param0].a(109);
        this.field_g = this.field_g & ~(1 << param0);
        this.field_d[param0] = null;
    }

    public final void a(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        this.field_h = this.field_h & -2;
        if (param0 == -20745) {
          this.field_f = this.f(24909);
          return;
        }
        this.c(-86);
        this.field_f = this.f(24909);
    }

    final void a(kf param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f == -1) {
            throw new RuntimeException();
          }
          if (param2 != -14269) {
            return;
          }
          var4_int = 1 << param1;
          if (0 != (this.field_g & ~var4_int)) {
            if (param0.field_A != this.field_e ||
              param0.field_x != this.field_b) {
              throw new RuntimeException();
            }
          } else {
            this.field_e = param0.field_A;
            this.field_b = param0.field_x;
          }
          param0.a(false, wv.field_a[param1], this.field_f);
          this.field_d[param1] = (ft) ((Object) param0);
          this.field_g = this.field_g | var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("cs.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final boolean h(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != -276) {
          this.a(99);
          var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.field_f);
          if (var2 == 36053) {
            return true;
          }
          return false;
        }
        var2Lifetime1 = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.field_f);
        if (var2Lifetime1 == 36053) {
          return true;
        }
        return false;
    }

    private final int f(int param0) {
        if (param0 != 24909) {
          this.field_a = -81;
          if ((4 & this.field_h) != 0) {
            return 36160;
          }
          if (0 != (2 & this.field_h)) {
            return 36009;
          }
          if ((this.field_h & 1) != 0) {
            return 36008;
          }
          return -1;
        }
        if ((4 & this.field_h) != 0) {
          return 36160;
        }
        if (0 != (2 & this.field_h)) {
          return 36009;
        }
        if ((this.field_h & 1) != 0) {
          return 36008;
        }
        return -1;
    }

    protected final void finalize() throws Throwable {
        this.field_c.b((byte) -92, this.field_a);
        super.finalize();
    }

    public final void a(boolean param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        this.field_h = this.field_h & -3;
        this.field_f = this.f(24909);
        if (param0) {
          this.field_d = (ft[]) null;
        }
    }

    private final void a(int param0, int param1, int param2, us param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_f == -1) {
            throw new RuntimeException();
          }
          var5_int = 1 << param2;
          if (param0 != ~(this.field_g & ~var5_int)) {
            if (param3.field_l != this.field_e ||
              param3.field_o != this.field_b) {
              throw new RuntimeException();
            }
          } else {
            this.field_e = param3.field_l;
            this.field_b = param3.field_o;
          }
          param3.a(-90, wv.field_a[param2], param1, this.field_f);
          this.field_d[param2] = (ft) ((Object) param3);
          this.field_g = this.field_g | var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("cs.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(us param0, int param1, int param2) {
        try {
          this.a(param1 + 4609, 0, param2, param0);
          if (param1 != -4610) {
            this.field_h = 35;
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "cs.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void c(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, this.field_a);
        this.field_h = this.field_h | 1;
        this.field_f = this.f(24909);
        if (param0 != 195) {
          this.field_d = (ft[]) null;
        }
    }

    public final void e(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        if (param0 < -32) {
          this.field_h = this.field_h & -5;
          this.field_f = this.f(24909);
          return;
        }
    }

    cs(fr param0) {
        this.field_h = 0;
        this.field_f = -1;
        this.field_d = new ft[9];
        try {
          if (!param0.field_xc) {
            throw new IllegalStateException("");
          }
          this.field_c = param0;
          jaggl.OpenGL.glGenFramebuffersEXT(1, ci.field_e, 0);
          this.field_a = ci.field_e[0];
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "cs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(int param0) {
        if (param0 == 30352) {
          jaggl.OpenGL.glBindFramebufferEXT(36160, this.field_a);
          this.field_h = this.field_h | 4;
          this.field_f = this.f(24909);
          return;
        }
    }

    public final void d(int param0) {
        if (param0 > 103) {
          jaggl.OpenGL.glBindFramebufferEXT(36009, this.field_a);
          this.field_h = this.field_h | 2;
          this.field_f = this.f(24909);
          return;
        }
    }

    static {
    }
}
