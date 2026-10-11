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
        RuntimeException runtimeException = null;
        int var5_int = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (-1 == this.field_a) {
            throw new RuntimeException();
          }
          var5_int = param0 << param3;
          if ((this.field_e & ~var5_int) != 0) {
            if (this.field_c != param1.field_l ||
              this.field_g != param1.field_o) {
              throw new RuntimeException();
            }
          } else {
            this.field_g = param1.field_o;
            this.field_c = param1.field_l;
          }
          param1.a(this.field_a, param2, 0, vta.field_d[param3]);
          this.field_h[param3] = (wia) ((Object) param1);
          this.field_e = this.field_e | var5_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("cb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean c(int param0) {
        int var2 = jaggl.OpenGL.glCheckFramebufferStatusEXT(this.field_a);
        int var3 = 59 % ((param0 - 53) / 33);
        if (36053 != var2) {
          return false;
        }
        return true;
    }

    public final void c(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36009, this.field_b);
        this.field_d = this.field_d | 2;
        this.field_a = this.e(0);
        if (param0 < 29) {
          this.a((byte) -62);
        }
    }

    public final void d(byte param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36008, 0);
        if (param0 >= 10) {
          this.field_d = this.field_d & -2;
          this.field_a = this.e(0);
          return;
        }
    }

    public final void a(byte param0) {
        if (param0 < -115) {
          jaggl.OpenGL.glBindFramebufferEXT(36008, this.field_b);
          this.field_d = this.field_d | 1;
          this.field_a = this.e(0);
          return;
        }
    }

    final void b(int param0, int param1) {
        if (param0 == this.field_a) {
          throw new RuntimeException();
        }
        jaggl.OpenGL.glReadBuffer(vta.field_d[param1]);
    }

    public final void b(byte param0) {
        if (param0 == -36) {
          jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
          this.field_d = this.field_d & -5;
          this.field_a = this.e(0);
          return;
        }
        this.c((byte) 91);
        jaggl.OpenGL.glBindFramebufferEXT(36160, 0);
        this.field_d = this.field_d & -5;
        this.field_a = this.e(0);
    }

    final void a(int param0, int param1) {
        int var3 = -110 % ((-35 - param0) / 34);
        if (null != this.field_h[param1]) {
          this.field_h[param1].a(109);
        }
        this.field_e = this.field_e & ~(1 << param1);
        this.field_h[param1] = null;
    }

    final void a(int param0, kba param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (-1 == this.field_a) {
            throw new RuntimeException();
          }
          var4_int = 1 << param0;
          if ((~var4_int & this.field_e) != 0) {
            if (param1.field_n != this.field_c ||
              this.field_g != param1.field_l) {
              throw new RuntimeException();
            }
          } else {
            this.field_c = param1.field_n;
            this.field_g = param1.field_l;
          }
          param1.a(vta.field_d[param0], this.field_a, -23992);
          if (!param2) {
            this.a(-122, 86);
          }
          this.field_h[param0] = (wia) ((Object) param1);
          this.field_e = this.field_e | var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("cb.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void a(boolean param0, rt param1, int param2) {
        try {
          this.a(1, param1, 0, param2);
          if (!param0) {
            cb.d(-3);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cb.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte param1) {
        if (param1 != -91) {
          this.a(-7, -21);
          if (this.field_a == -1) {
            throw new RuntimeException();
          }
          jaggl.OpenGL.glDrawBuffer(vta.field_d[param0]);
          return;
        }
        if (this.field_a == -1) {
          throw new RuntimeException();
        }
        jaggl.OpenGL.glDrawBuffer(vta.field_d[param0]);
    }

    private final int e(int param0) {
        if ((this.field_d & 4) != 0) {
          return 36160;
        }
        if (param0 != (this.field_d & 2)) {
          return 36009;
        }
        if ((this.field_d & 1) == 0) {
          return -1;
        }
        return 36008;
    }

    public final void b(int param0) {
        jaggl.OpenGL.glBindFramebufferEXT(36160, this.field_b);
        this.field_d = this.field_d | 4;
        this.field_a = this.e(param0 ^ param0);
    }

    public final void a(int param0) {
        if (param0 == 4245) {
          jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
          this.field_d = this.field_d & -3;
          this.field_a = this.e(0);
          return;
        }
        int discarded$0 = this.e(-53);
        jaggl.OpenGL.glBindFramebufferEXT(36009, 0);
        this.field_d = this.field_d & -3;
        this.field_a = this.e(0);
    }

    protected final void finalize() throws Throwable {
        this.field_f.e(2, this.field_b);
        super.finalize();
    }

    public static void d(int param0) {
        if (param0 != 36053) {
          field_i = (nh[]) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    cb(cka param0) {
        this.field_a = -1;
        this.field_h = new wia[9];
        this.field_d = 0;
        try {
          if (!param0.field_id) {
            throw new IllegalStateException("");
          }
          this.field_f = param0;
          jaggl.OpenGL.glGenFramebuffersEXT(1, tg.field_b, 0);
          this.field_b = tg.field_b[0];
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
