/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ua implements kt {
    private int field_k;
    jc field_a;
    private int field_m;
    private int field_i;
    static float[] field_c;
    static int[] field_h;
    private boolean field_e;
    private int field_b;
    private jaclib.memory.heap.NativeHeapBuffer field_f;
    static String field_j;
    private int field_n;
    static bs field_d;
    static int[][] field_l;
    static RenderSprite[] field_g;

    final jaclib.memory.Buffer a(jaggl.MapBuffer param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_4_0 = null;
        int stackIn_8_0;
        int stackIn_8_1;
        Object stackIn_8_2;
        int stackIn_8_3;
        int stackIn_9_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_11_0 = null;
        jaggl.MapBuffer stackIn_16_0 = null;
        jaclib.memory.Buffer stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_m == 0) {
            this.f(-1);
            if (this.field_k <= 0) {
              this.field_m = 2;
              stackIn_4_0 = this.field_f;
              return (jaclib.memory.Buffer) ((Object) stackIn_4_0);
            }
            jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_k);
            if (param1) {
              stackIn_8_0 = this.field_b;
              stackIn_8_1 = this.field_i;
              stackIn_8_2 = null;
              stackIn_8_3 = 0;
              if (this.field_e) {
                stackIn_9_4 = 35040;
              } else {
                stackIn_9_4 = 35044;
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_8_0, stackIn_8_1, (byte[]) (stackIn_8_2), stackIn_8_3, stackIn_9_4);
              if (this.field_n <= this.field_a.field_Q.c) {
                this.field_m = 1;
                stackIn_11_0 = this.field_a.field_Q;
                return (jaclib.memory.Buffer) ((Object) stackIn_11_0);
              }
            }
            if (!param0.a() &&
              param0.a(this.field_b, this.field_n, 35001)) {
              this.field_m = 2;
              stackIn_16_0 = (jaggl.MapBuffer) (param0);
              return (jaclib.memory.Buffer) ((Object) stackIn_16_0);
            }
          }
          if (param2 == -10386) {
            return null;
          }
          stackIn_20_0 = (jaclib.memory.Buffer) null;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_24_0 = var4;
          stackIn_24_1 = new StringBuilder().append("ua.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void b(int param0) {
        if (this.field_a.field_Cc) {
          jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_k);
        }
        if (param0 != -17310) {
          jaggl.MapBuffer var3 = (jaggl.MapBuffer) null;
          this.a((jaggl.MapBuffer) null, (byte) 10);
        }
    }

    public static void d(int param0) {
        field_j = null;
        field_l = (int[][]) null;
        field_d = null;
        field_h = null;
        field_g = null;
        field_c = null;
        int var1 = -51 / ((param0 - 59) / 37);
    }

    final static short[] a(CipherPacketBuffer param0, short[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var4_int = param0.b((byte) 103, param3);
          if (var4_int == 0) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param1 == null ||
            param1.length != var4_int) {
            param1 = new short[var4_int];
          }
          var5 = param0.b((byte) -95, 4);
          var6 = (short)param0.b((byte) 89, 16);
          if (param2 < var5) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param1[var7] = (short)(param0.b((byte) 96, var5) + var6);
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)var6;
            }
          }
          stackIn_16_0 = (short[]) (param1);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ua.L(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -115) {
            this.f(53);
          }
          var3_int = 1;
          if (this.field_m != 0) {
            if (0 < this.field_k) {
              jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_k);
              if (this.field_m == 1) {
                jaggl.OpenGL.glBufferSubDataARBa(this.field_b, 0, this.field_i, this.field_a.field_Q.a());
              } else {
                stackIn_8_0 = (!param0.b()) ? 0 : 1;
                var3_int = stackIn_8_0;
              }
            }
            this.field_m = 0;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ua.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    void a(int param0, int param1) {
        if (param0 != -12880) {
          return;
        }
        if (this.field_i < param1) {
          this.f(-1);
          if (this.field_k > 0) {
            jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_k);
            jaggl.OpenGL.glBufferDataARBub(this.field_b, param1, (byte[]) null, 0, !this.field_e ? 35044 : 35040);
            this.field_a.field_j = this.field_a.field_j + (-this.field_i + param1);
          } else {
            this.field_f = this.field_a.a((byte) -77, param1, false);
          }
          this.field_i = param1;
        }
        this.field_n = param1;
    }

    void a(int param0) {
        if (this.field_k > 0) {
          this.field_a.a(this.field_n, 9841, this.field_k);
          this.field_k = -1;
        }
        if (param0 != 4665) {
          field_d = (bs) null;
        }
    }

    protected final void finalize() throws Throwable {
        this.a(4665);
        super.finalize();
    }

    final static void e(int param0) {
        if (param0 != 4754) {
          field_d = (bs) null;
        }
        String var2 = (String) null;
        ub.a("", (String) null, -89);
    }

    private final void f(int param0) {
        if (~this.field_k <= param0) {
          return;
        }
        if (!this.field_a.field_Cc) {
          this.field_k = 0;
        } else {
          jaggl.OpenGL.glGenBuffersARB(1, ci.field_m, 0);
          this.field_k = ci.field_m[0];
          jaggl.OpenGL.glBindBufferARB(this.field_b, this.field_k);
        }
    }

    final long b(byte param0) {
        if (param0 <= 29) {
          return -98L;
        }
        return this.field_k == 0 ? this.field_f.a() : 0L;
    }

    final static void c(int param0) {
        oj.a(param0 ^ 26099, bm.m(124));
        if (param0 != 0) {
          short[] var2 = (short[]) null;
          ua.a((CipherPacketBuffer) null, (short[]) null, 101, 22);
        }
    }

    final static void a(String param0, boolean param1, byte param2) {
        try {
          int var3_int = 117 % ((16 - param2) / 58);
          ae.field_f = param1 ? true : false;
          ss.field_t = true;
          ml.field_m = new oo(vn.field_f, b.field_c, param0, nf.field_a, ae.field_f);
          vn.field_f.a(ml.field_m, 0);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ua.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    ua(jc param0, int param1, boolean param2) {
        this.field_m = 0;
        this.field_k = -1;
        try {
          this.field_e = param2 ? true : false;
          this.field_b = param1;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        int var0 = 0;
        field_c = new float[]{0.0f, -1.0f, 0.0f, 0.0f};
        field_h = new int[4096];
        for (var0 = 0; var0 < 4096; var0++) {
          field_h[var0] = it.a(var0, -1);
        }
        field_d = new bs();
        field_l = new int[8][];
    }
}
