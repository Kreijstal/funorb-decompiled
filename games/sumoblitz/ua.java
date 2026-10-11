/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class ua implements ot {
    on field_f;
    private int field_b;
    private int field_e;
    private boolean field_j;
    static tg field_n;
    private int field_l;
    private int field_c;
    private jaclib.memory.heap.NativeHeapBuffer field_m;
    private int field_k;
    static int[] field_h;
    static String field_i;
    static int field_a;
    static hr[] field_g;
    static int field_d;

    final static wb[] a(int param0, int param1) {
        wb[] var3 = new wb[9];
        wb[] var2 = var3;
        var3[4] = wg.a(64, param0, 3);
        if (param1 >= -114) {
          ua.a(63, -120);
        }
        return var2;
    }

    final jaclib.memory.Buffer a(boolean param0, int param1, jaggl.MapBuffer param2) {
        RuntimeException var4 = null;
        jaggl.MapBuffer var5 = null;
        jaclib.memory.heap.NativeHeapBuffer stackIn_4_0 = null;
        int stackIn_9_0;
        int stackIn_9_1;
        Object stackIn_9_2;
        int stackIn_9_3;
        int stackIn_10_4 = 0;
        jaclib.memory.heap.NativeHeapBuffer stackIn_13_0 = null;
        jaggl.MapBuffer stackIn_18_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_b == 0) {
            this.d(0);
            if (this.field_c <= 0) {
              this.field_b = 2;
              stackIn_4_0 = this.field_m;
              return (jaclib.memory.Buffer) ((Object) stackIn_4_0);
            }
            jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
            if (param0) {
              stackIn_9_0 = this.field_k;
              stackIn_9_1 = this.field_e;
              stackIn_9_2 = null;
              stackIn_9_3 = 0;
              if (this.field_j) {
                stackIn_10_4 = 35040;
              } else {
                stackIn_10_4 = 35044;
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_9_0, stackIn_9_1, (byte[]) (stackIn_9_2), stackIn_9_3, stackIn_10_4);
              if (this.field_l <= this.field_f.field_z.c) {
                this.field_b = 1;
                stackIn_13_0 = this.field_f.field_z;
                return (jaclib.memory.Buffer) ((Object) stackIn_13_0);
              }
            }
            if (!param2.a() &&
              param2.a(this.field_k, this.field_l, 35001)) {
              this.field_b = 2;
              stackIn_18_0 = (jaggl.MapBuffer) (param2);
              return (jaclib.memory.Buffer) ((Object) stackIn_18_0);
            }
          }
          if (param1 == 2) {
            return null;
          }
          var5 = (jaggl.MapBuffer) null;
          this.a(true, 66, (jaggl.MapBuffer) null);
          stackIn_22_0 = null;
          return (jaclib.memory.Buffer) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("ua.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, ah param1) {
        try {
          kf.field_u = param1;
          im.field_b = new jn();
          up.field_a = fi.a(640, he.field_o, (byte) -96) << 8;
          cv.field_E = fi.a(480, he.field_o, (byte) -96) << 8;
          sr.d(22030);
          if (param0 != 35040) {
            ua.a(116, -119);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ua.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(int param0) {
        if (this.field_c >= 0) {
          return;
        }
        if (!this.field_f.field_Nc) {
          this.field_c = 0;
        } else {
          jaggl.OpenGL.glGenBuffersARB(1, jp.field_k, 0);
          this.field_c = jp.field_k[0];
          jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
        }
        if (param0 != 0) {
          field_n = (tg) null;
        }
    }

    void b(int param0) {
        if (0 < this.field_c) {
          this.field_f.a((byte) -99, this.field_l, this.field_c);
          this.field_c = -1;
        }
        if (param0 != 12001) {
          this.field_e = 82;
        }
    }

    final long c(int param0) {
        if (param0 != -24168) {
          return 1L;
        }
        return this.field_c == 0 ? this.field_m.c() : 0L;
    }

    final static void f(int param0) {
        if (null == vv.field_b) {
          throw new IllegalStateException("NGR");
        }
        if (param0 != -5812) {
          field_n = (tg) null;
        }
        vv.field_b.field_g = true;
        jl.a(param0 + 5837, 1);
    }

    final static String a(byte param0, String param1) {
        RuntimeException var2 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 5) {
            ua.f(77);
          }
          if (en.field_h.startsWith("win")) {
            stackIn_11_0 = param1 + ".dll";
            return stackIn_11_0;
          }
          if (en.field_h.startsWith("linux")) {
            stackIn_5_0 = "lib" + param1 + ".so";
            return stackIn_5_0;
          }
          if (!en.field_h.startsWith("mac")) {
            return null;
          }
          stackIn_9_0 = "lib" + param1 + ".dylib";
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ua.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void a(byte param0, int param1) {
        if (param1 > this.field_e) {
          this.d(0);
          if (this.field_c > 0) {
            jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
            jaggl.OpenGL.glBufferDataARBub(this.field_k, param1, (byte[]) null, 0, this.field_j ? 35040 : 35044);
            this.field_f.field_o = this.field_f.field_o + (-this.field_e + param1);
          } else {
            this.field_m = this.field_f.a(false, false, param1);
          }
          this.field_e = param1;
        }
        this.field_l = param1;
        if (param0 >= -67) {
          this.e(-122);
        }
    }

    final static byte[] a(int param0, int param1, byte[] param2, pl param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4_int = param3.b(param0, (byte) -87);
          if (var4_int == param1) {
            stackIn_3_0 = null;
            return (byte[]) (stackIn_3_0);
          }
          if (param2 == null ||
            var4_int != param2.length) {
            param2 = new byte[var4_int];
          }
          var5 = param3.b(3, (byte) -94);
          var6 = (byte)param3.b(8, (byte) -117);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param2[var7] = (byte)(var6 + param3.b(var5, (byte) -127));
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param2[var7] = (byte)var6;
            }
          }
          stackIn_16_0 = (byte[]) (param2);
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("ua.V(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        this.b(12001);
        super.finalize();
    }

    final void e(int param0) {
        if (param0 != 1175993800) {
          jaggl.MapBuffer var3 = (jaggl.MapBuffer) null;
          this.a((jaggl.MapBuffer) null, (byte) 48);
        }
        if (this.field_f.field_Nc) {
          jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
        }
    }

    ua(on param0, int param1, boolean param2) {
        this.field_b = 0;
        this.field_c = -1;
        try {
          this.field_j = param2 ? true : false;
          this.field_f = param0;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ua.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_i = null;
        int var1 = -96 / ((param0 + 61) / 57);
        field_h = null;
        field_g = null;
        field_n = null;
    }

    final boolean a(jaggl.MapBuffer param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 1;
          if (this.field_b != 0) {
            if (this.field_c > 0) {
              jaggl.OpenGL.glBindBufferARB(this.field_k, this.field_c);
              if (1 != this.field_b) {
                stackIn_7_0 = (!param0.b()) ? 0 : 1;
                var3_int = stackIn_7_0;
              } else {
                jaggl.OpenGL.glBufferSubDataARBa(this.field_k, 0, this.field_e, this.field_f.field_z.c());
              }
            }
            this.field_b = 0;
          }
          if (param1 != 92) {
            this.field_f = (on) null;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ua.R(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = new tg();
        field_h = new int[8192];
        field_i = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = 0;
    }
}
