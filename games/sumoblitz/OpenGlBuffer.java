/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class OpenGlBuffer implements GpuBuffer {
    OpenGlGraphicsToolkit toolkit;
    private int mappingMode;
    private int capacityBytes;
    private boolean dynamic;
    static TextureCombineOperation INTERPOLATE;
    private int sizeBytes;
    private int bufferId;
    private jaclib.memory.heap.NativeHeapBuffer clientBuffer;
    private int target;
    static int[] field_h;
    static String fullscreenModeWasCancelledText;
    static int field_a;
    static ToolkitSprite[] field_g;
    static int targetMarkerXQ8;

    final static Sprite[] a(int param0, int param1) {
        Sprite[] var3 = new Sprite[9];
        Sprite[] var2 = var3;
        var3[4] = wg.a(64, param0, 3);
        if (param1 >= -114) {
          OpenGlBuffer.a(63, -120);
        }
        return var2;
    }

    final jaclib.memory.Buffer map(boolean discard, int guard, jaggl.MapBuffer mapping) {
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
          if (this.mappingMode == 0) {
            this.ensureCreated(0);
            if (this.bufferId <= 0) {
              this.mappingMode = 2;
              stackIn_4_0 = this.clientBuffer;
              return (jaclib.memory.Buffer) ((Object) stackIn_4_0);
            }
            jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
            if (discard) {
              stackIn_9_0 = this.target;
              stackIn_9_1 = this.capacityBytes;
              stackIn_9_2 = null;
              stackIn_9_3 = 0;
              if (this.dynamic) {
                stackIn_10_4 = 35040;
              } else {
                stackIn_10_4 = 35044;
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_9_0, stackIn_9_1, (byte[]) (stackIn_9_2), stackIn_9_3, stackIn_10_4);
              if (this.sizeBytes <= this.toolkit.field_z.c) {
                this.mappingMode = 1;
                stackIn_13_0 = this.toolkit.field_z;
                return (jaclib.memory.Buffer) ((Object) stackIn_13_0);
              }
            }
            if (!mapping.a() &&
              mapping.a(this.target, this.sizeBytes, 35001)) {
              this.mappingMode = 2;
              stackIn_18_0 = (jaggl.MapBuffer) (mapping);
              return (jaclib.memory.Buffer) ((Object) stackIn_18_0);
            }
          }
          if (guard == 2) {
            return null;
          }
          var5 = (jaggl.MapBuffer) null;
          this.map(true, 66, (jaggl.MapBuffer) null);
          stackIn_22_0 = null;
          return (jaclib.memory.Buffer) (stackIn_22_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("ua.O(").append(discard).append(',').append(guard).append(',');
          if (mapping == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, Drone param1) {
        try {
          kf.field_u = param1;
          im.field_b = new IntrusiveDeque();
          up.field_a = ExpandingRingEffect.nextRandomInt(640, HardwareGraphicsHeap.field_o, (byte) -96) << 8;
          LoginForm.field_E = ExpandingRingEffect.nextRandomInt(480, HardwareGraphicsHeap.field_o, (byte) -96) << 8;
          LimitedRandomAccessFile.d(22030);
          if (param0 != 35040) {
            OpenGlBuffer.a(116, -119);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ua.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void ensureCreated(int guard) {
        if (this.bufferId >= 0) {
          return;
        }
        if (!this.toolkit.field_Nc) {
          this.bufferId = 0;
        } else {
          jaggl.OpenGL.glGenBuffersARB(1, LevelCompleteUpgradeScreen.field_k, 0);
          this.bufferId = LevelCompleteUpgradeScreen.field_k[0];
          jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
        }
        if (guard != 0) {
          INTERPOLATE = (TextureCombineOperation) null;
        }
    }

    void close(int guard) {
        if (0 < this.bufferId) {
          this.toolkit.a((byte) -99, this.sizeBytes, this.bufferId);
          this.bufferId = -1;
        }
        if (guard != 12001) {
          this.capacityBytes = 82;
        }
    }

    final long clientAddress(int guard) {
        if (guard != -24168) {
          return 1L;
        }
        return this.bufferId == 0 ? this.clientBuffer.c() : 0L;
    }

    final static void f(int param0) {
        if (null == SecondaryNodeDequeIterator.field_b) {
          throw new IllegalStateException("NGR");
        }
        if (param0 != -5812) {
          INTERPOLATE = (TextureCombineOperation) null;
        }
        SecondaryNodeDequeIterator.field_b.field_g = true;
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
            OpenGlBuffer.f(77);
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    void allocate(byte guard, int sizeBytes) {
        if (sizeBytes > this.capacityBytes) {
          this.ensureCreated(0);
          if (this.bufferId > 0) {
            jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
            jaggl.OpenGL.glBufferDataARBub(this.target, sizeBytes, (byte[]) null, 0, this.dynamic ? 35040 : 35044);
            this.toolkit.field_o = this.toolkit.field_o + (-this.capacityBytes + sizeBytes);
          } else {
            this.clientBuffer = this.toolkit.a(false, false, sizeBytes);
          }
          this.capacityBytes = sizeBytes;
        }
        this.sizeBytes = sizeBytes;
        if (guard >= -67) {
          this.bind(-122);
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    protected final void finalize() throws Throwable {
        this.close(12001);
        super.finalize();
    }

    final void bind(int guard) {
        if (guard != 1175993800) {
          jaggl.MapBuffer var3 = (jaggl.MapBuffer) null;
          this.unmap((jaggl.MapBuffer) null, (byte) 48);
        }
        if (this.toolkit.field_Nc) {
          jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
        }
    }

    OpenGlBuffer(OpenGlGraphicsToolkit owner, int bufferTarget, boolean dynamicUsage) {
        this.mappingMode = 0;
        this.bufferId = -1;
        try {
          this.dynamic = dynamicUsage ? true : false;
          this.toolkit = owner;
          this.target = bufferTarget;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ua.<init>(" + (owner != null ? "{...}" : "null") + ',' + bufferTarget + ',' + dynamicUsage + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        fullscreenModeWasCancelledText = null;
        int var1 = -96 / ((param0 + 61) / 57);
        field_h = null;
        field_g = null;
        INTERPOLATE = null;
    }

    final boolean unmap(jaggl.MapBuffer mapping, byte guard) {
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
          if (this.mappingMode != 0) {
            if (this.bufferId > 0) {
              jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
              if (1 != this.mappingMode) {
                stackIn_7_0 = (!mapping.b()) ? 0 : 1;
                var3_int = stackIn_7_0;
              } else {
                jaggl.OpenGL.glBufferSubDataARBa(this.target, 0, this.capacityBytes, this.toolkit.field_z.c());
              }
            }
            this.mappingMode = 0;
          }
          if (guard != 92) {
            this.toolkit = (OpenGlGraphicsToolkit) null;
          }
          stackIn_12_0 = var3_int;
          return stackIn_12_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ua.R(");
          if (mapping == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        INTERPOLATE = new TextureCombineOperation();
        field_h = new int[8192];
        fullscreenModeWasCancelledText = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_a = 0;
    }
}
