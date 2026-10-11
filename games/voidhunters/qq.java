/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qq implements nib {
    private int field_e;
    private boolean field_g;
    private int field_f;
    private int field_a;
    private int field_c;
    jp field_d;
    private int field_b;
    private jaclib.memory.heap.NativeHeapBuffer field_h;

    private final void d(int param0) {
        if (param0 != 0) {
          return;
        }
        if (this.field_a >= 0) {
          return;
        }
        if (!this.field_d.field_Hc) {
          this.field_a = 0;
          return;
        }
        jaggl.OpenGL.glGenBuffersARB(1, lkb.field_a, 0);
        this.field_a = lkb.field_a[0];
        jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
    }

    final void a(byte param0) {
        jaggl.MapBuffer var3 = null;
        jaggl.MapBuffer var3Lifetime1;
        if (this.field_d.field_Hc) {
          jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
          if (param0 != 54) {
            var3 = (jaggl.MapBuffer) null;
            this.a((byte) 60, (jaggl.MapBuffer) null);
            return;
          }
          return;
        }
        if (param0 == 54) {
          return;
        }
        var3Lifetime1 = (jaggl.MapBuffer) null;
        this.a((byte) 60, (jaggl.MapBuffer) null);
    }

    final boolean a(byte param0, jaggl.MapBuffer param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -36) {
            this.field_h = (jaclib.memory.heap.NativeHeapBuffer) null;
          }
          var3_int = 1;
          if (0 != this.field_e) {
            if (0 < this.field_a) {
              jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
              if (this.field_e == 1) {
                jaggl.OpenGL.glBufferSubDataARBa(this.field_b, 0, this.field_f, this.field_d.field_m.b());
              } else {
                stackIn_10_0 = (!param1.a()) ? 0 : 1;
                var3_int = stackIn_10_0;
              }
            }
            this.field_e = 0;
          }
          stackIn_14_0 = var3_int;
          return stackIn_14_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("qq.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
          return true;
        }
        return param0 < 14 ? true : false;
    }

    final long c(int param0) {
        if (param0 == 2) {
          return 0 == this.field_a ? this.field_h.b() : 0L;
        }
        qq.a(127, true);
        return 0 == this.field_a ? this.field_h.b() : 0L;
    }

    protected final void finalize() throws Throwable {
        this.a(-106);
        super.finalize();
    }

    final static int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var3_int = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = VoidHunters.field_G;
        try {
          if (!param0) {
            stackIn_3_0 = 55;
            return stackIn_3_0;
          }
          if (null != fwa.field_g) {
            var3_int = 0;
            for (var4 = param1; var4 < 56; var4++) {
              if (fwa.field_g.c(var4, (byte) 34)) {
                if (param2 <= var3_int) {
                  stackIn_11_0 = var4;
                  return stackIn_11_0;
                }
                var3_int++;
              }
            }
          }
          stackIn_16_0 = param1 + param2;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var3), "qq.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void a(int param0) {
        if (this.field_a > 0) {
          this.field_d.b(this.field_a, this.field_c, false);
          this.field_a = -1;
          if (param0 >= -84) {
            this.c(126);
            return;
          }
          return;
        }
        if (param0 < -84) {
          return;
        }
        this.c(126);
    }

    void a(int param0, int param1) {
        if (param0 == 25427) {
          if (this.field_f >= param1) {
          } else {
            this.d(0);
            if (this.field_a <= 0) {
              this.field_h = this.field_d.a(false, 127, param1);
            } else {
              jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
              jaggl.OpenGL.glBufferDataARBub(this.field_b, param1, (byte[]) null, 0, !this.field_g ? 35044 : 35040);
              this.field_d.field_ob = this.field_d.field_ob + (param1 - this.field_f);
            }
            this.field_f = param1;
          }
          this.field_c = param1;
          return;
        }
        this.d(-59);
        if (this.field_f < param1) {
          this.d(0);
          if (this.field_a <= 0) {
            this.field_h = this.field_d.a(false, 127, param1);
            this.field_f = param1;
            this.field_c = param1;
            return;
          }
          jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
          jaggl.OpenGL.glBufferDataARBub(this.field_b, param1, (byte[]) null, 0, !this.field_g ? 35044 : 35040);
          this.field_d.field_ob = this.field_d.field_ob + (param1 - this.field_f);
          this.field_f = param1;
          this.field_c = param1;
          return;
        }
        this.field_c = param1;
    }

    final jaclib.memory.Buffer a(boolean param0, boolean param1, jaggl.MapBuffer param2) {
        RuntimeException var4 = null;
        int stackIn_6_0;
        int stackIn_6_1;
        Object stackIn_6_2;
        int stackIn_6_3;
        int stackIn_7_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_9_0 = null;
        jaggl.MapBuffer stackIn_14_0 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_16_0 = null;
        Object stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e == 0) {
            this.d(0);
            if (this.field_a <= 0) {
              this.field_e = 2;
              stackIn_16_0 = this.field_h;
              return (jaclib.memory.Buffer) ((Object) stackIn_16_0);
            }
            jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_a);
            if (param1) {
              stackIn_6_0 = this.field_b;
              stackIn_6_1 = this.field_f;
              stackIn_6_2 = null;
              stackIn_6_3 = 0;
              if (!this.field_g) {
                stackIn_7_4 = 35044;
              } else {
                stackIn_7_4 = 35040;
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_6_0, stackIn_6_1, (byte[]) (stackIn_6_2), stackIn_6_3, stackIn_7_4);
              if (this.field_d.field_m.d >= this.field_c) {
                this.field_e = 1;
                stackIn_9_0 = this.field_d.field_m;
                return (jaclib.memory.Buffer) ((Object) stackIn_9_0);
              }
            }
            if (!param2.b() &&
              param2.a(this.field_b, this.field_c, 35001)) {
              this.field_e = 2;
              stackIn_14_0 = (jaggl.MapBuffer) (param2);
              return (jaclib.memory.Buffer) ((Object) stackIn_14_0);
            }
          }
          if (!param0) {
            return null;
          }
          qq.a(7, true);
          stackIn_20_0 = null;
          return (jaclib.memory.Buffer) (stackIn_20_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("qq.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    qq(jp param0, int param1, boolean param2) {
        this.field_a = -1;
        this.field_e = 0;
        try {
          this.field_d = param0;
          this.field_b = param1;
          this.field_g = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
