/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class OpenGlGpuBuffer implements GpuBuffer {
    private int lockMode;
    private boolean dynamic;
    private int capacity;
    private int bufferId;
    private int size;
    OpenGlGpuToolkit toolkit;
    private int target;
    private jaclib.memory.heap.NativeHeapBuffer clientBuffer;

    private final void ensureBuffer(int param0) {
        if (param0 != 0) {
          return;
        }
        if (this.bufferId >= 0) {
          return;
        }
        if (!this.toolkit.field_Hc) {
          this.bufferId = 0;
          return;
        }
        jaggl.OpenGL.glGenBuffersARB(1, lkb.field_a, 0);
        this.bufferId = lkb.field_a[0];
        jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
    }

    final void bind(byte param0) {
        jaggl.MapBuffer var3 = null;
        jaggl.MapBuffer var3Lifetime1;
        if (this.toolkit.field_Hc) {
          jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
          if (param0 != 54) {
            var3 = (jaggl.MapBuffer) null;
            this.unlockBuffer((byte) 60, (jaggl.MapBuffer) null);
            return;
          }
          return;
        }
        if (param0 == 54) {
          return;
        }
        var3Lifetime1 = (jaggl.MapBuffer) null;
        this.unlockBuffer((byte) 60, (jaggl.MapBuffer) null);
    }

    final boolean unlockBuffer(byte param0, jaggl.MapBuffer param1) {
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
            this.clientBuffer = (jaclib.memory.heap.NativeHeapBuffer) null;
          }
          var3_int = 1;
          if (0 != this.lockMode) {
            if (0 < this.bufferId) {
              jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
              if (this.lockMode == 1) {
                jaggl.OpenGL.glBufferSubDataARBa(this.target, 0, this.capacity, this.toolkit.field_m.getAddress());
              } else {
                stackIn_10_0 = (!param1.unmap()) ? 0 : 1;
                var3_int = stackIn_10_0;
              }
            }
            this.lockMode = 0;
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean isObjectiveVoteOption(int param0, boolean param1) {
        if (!param1) {
          return true;
        }
        return param0 < 14 ? true : false;
    }

    final long getClientAddress(int param0) {
        if (param0 == 2) {
          return 0 == this.bufferId ? this.clientBuffer.getAddress() : 0L;
        }
        OpenGlGpuBuffer.isObjectiveVoteOption(127, true);
        return 0 == this.bufferId ? this.clientBuffer.getAddress() : 0L;
    }

    protected final void finalize() throws Throwable {
        this.release(-106);
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
          if (null != ArchiveIndexLoader.field_g) {
            var3_int = 0;
            for (var4 = param1; var4 < 56; var4++) {
              if (ArchiveIndexLoader.field_g.isComponentOptionVisible(var4, (byte) 34)) {
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var3), "qq.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void release(int param0) {
        if (this.bufferId > 0) {
          this.toolkit.queueBufferDeletion(this.bufferId, this.size, false);
          this.bufferId = -1;
          if (param0 >= -84) {
            this.getClientAddress(126);
            return;
          }
          return;
        }
        if (param0 < -84) {
          return;
        }
        this.getClientAddress(126);
    }

    void allocate(int param0, int param1) {
        if (param0 == 25427) {
          if (this.capacity >= param1) {
          } else {
            this.ensureBuffer(0);
            if (this.bufferId <= 0) {
              this.clientBuffer = this.toolkit.allocateNativeBuffer(false, 127, param1);
            } else {
              jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
              jaggl.OpenGL.glBufferDataARBub(this.target, param1, (byte[]) null, 0, !this.dynamic ? 35044 : 35040);
              this.toolkit.field_ob = this.toolkit.field_ob + (param1 - this.capacity);
            }
            this.capacity = param1;
          }
          this.size = param1;
          return;
        }
        this.ensureBuffer(-59);
        if (this.capacity < param1) {
          this.ensureBuffer(0);
          if (this.bufferId <= 0) {
            this.clientBuffer = this.toolkit.allocateNativeBuffer(false, 127, param1);
            this.capacity = param1;
            this.size = param1;
            return;
          }
          jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
          jaggl.OpenGL.glBufferDataARBub(this.target, param1, (byte[]) null, 0, !this.dynamic ? 35044 : 35040);
          this.toolkit.field_ob = this.toolkit.field_ob + (param1 - this.capacity);
          this.capacity = param1;
          this.size = param1;
          return;
        }
        this.size = param1;
    }

    final jaclib.memory.Buffer lockBuffer(boolean param0, boolean param1, jaggl.MapBuffer param2) {
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
          if (this.lockMode == 0) {
            this.ensureBuffer(0);
            if (this.bufferId <= 0) {
              this.lockMode = 2;
              stackIn_16_0 = this.clientBuffer;
              return (jaclib.memory.Buffer) ((Object) stackIn_16_0);
            }
            jaggl.OpenGL.glBindBufferARB(this.target, this.bufferId);
            if (param1) {
              stackIn_6_0 = this.target;
              stackIn_6_1 = this.capacity;
              stackIn_6_2 = null;
              stackIn_6_3 = 0;
              if (!this.dynamic) {
                stackIn_7_4 = 35044;
              } else {
                stackIn_7_4 = 35040;
              }
              jaggl.OpenGL.glBufferDataARBub(stackIn_6_0, stackIn_6_1, (byte[]) (stackIn_6_2), stackIn_6_3, stackIn_7_4);
              if (this.toolkit.field_m.d >= this.size) {
                this.lockMode = 1;
                stackIn_9_0 = this.toolkit.field_m;
                return (jaclib.memory.Buffer) ((Object) stackIn_9_0);
              }
            }
            if (!param2.isMapped() &&
              param2.map(this.target, this.size, 35001)) {
              this.lockMode = 2;
              stackIn_14_0 = (jaggl.MapBuffer) (param2);
              return (jaclib.memory.Buffer) ((Object) stackIn_14_0);
            }
          }
          if (!param0) {
            return null;
          }
          OpenGlGpuBuffer.isObjectiveVoteOption(7, true);
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    OpenGlGpuBuffer(OpenGlGpuToolkit param0, int param1, boolean param2) {
        this.bufferId = -1;
        this.lockMode = 0;
        try {
          this.toolkit = param0;
          this.target = param1;
          this.dynamic = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
    }
}
