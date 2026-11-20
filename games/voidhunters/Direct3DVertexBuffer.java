/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DVertexBuffer implements GpuVertexBuffer {
    private byte stride;
    private int size;
    jagdx.IDirect3DVertexBuffer buffer;
    private Direct3DToolkit toolkit;
    private boolean locked;
    private boolean dynamic;
    private int capacity;

    public final boolean allocate(int param0, int param1, int param2) {
        boolean stackIn_12_0 = false;
        boolean stackIn_24_0 = false;
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        this.size = param1;
        if (param2 > 81) {
          this.stride = (byte)param0;
          if (this.capacity < this.size) {
            var5 = 8;
            if (this.dynamic) {
              var4 = 0;
              var5 = var5 | 512;
            } else {
              var4 = 1;
            }
            if (this.buffer != null) {
              this.buffer.release(false);
            }
            this.buffer = this.toolkit.field_Mc.createVertexBuffer(this.size, var5, 0, var4, this.buffer);
            this.capacity = this.size;
          }
          stackIn_12_0 = (this.buffer != null);
          return stackIn_12_0;
        }
        this.toolkit = (Direct3DToolkit) null;
        this.stride = (byte)param0;
        if (this.capacity < this.size) {
          var5Lifetime1 = 8;
          if (this.dynamic) {
            var4Lifetime1 = 0;
            var5Lifetime1 = var5Lifetime1 | 512;
          } else {
            var4Lifetime1 = 1;
          }
          if (this.buffer != null) {
            this.buffer.release(false);
          }
          this.buffer = this.toolkit.field_Mc.createVertexBuffer(this.size, var5Lifetime1, 0, var4Lifetime1, this.buffer);
          this.capacity = this.size;
        }
        stackIn_24_0 = (this.buffer != null);
        return stackIn_24_0;
    }

    final int getStride(byte param0) {
        int var2 = -6 % ((27 - param0) / 60);
        return this.stride;
    }

    public final void release(int param0) {
        if (param0 <= -84) {
          if (this.buffer != null) {
            this.buffer.release(false);
            this.buffer = null;
          }
          this.size = 0;
          this.capacity = 0;
          return;
        }
        this.locked = false;
        if (this.buffer != null) {
          this.buffer.release(false);
          this.buffer = null;
        }
        this.size = 0;
        this.capacity = 0;
    }

    public final boolean unlock(int param0) {
        if (param0 != -20836) {
          this.size = 48;
          if (!this.locked) {
            return false;
          }
          if (jagdx.HResult.succeeded(this.buffer.Unlock(), (byte) 53)) {
            this.locked = false;
            return true;
          }
          return false;
        }
        if (!this.locked) {
          return false;
        }
        if (jagdx.HResult.succeeded(this.buffer.Unlock(), (byte) 53)) {
          this.locked = false;
          return true;
        }
        return false;
    }

    public final jaclib.memory.Buffer lock(boolean param0, byte param1) {
        if (null == this.buffer) {
          return null;
        }
        param0 = param0 & this.dynamic;
        if (param1 <= 16) {
          this.dynamic = false;
          if (this.locked) {
            return null;
          }
          if (jagdx.HResult.succeeded(this.buffer.Lock(0, this.capacity, !param0 ? 0 : 8192, this.toolkit.field_Kc), (byte) 93)) {
            this.locked = true;
            return (jaclib.memory.Buffer) ((Object) this.toolkit.field_Kc);
          }
          return null;
        }
        if (this.locked) {
          return null;
        }
        if (jagdx.HResult.succeeded(this.buffer.Lock(0, this.capacity, !param0 ? 0 : 8192, this.toolkit.field_Kc), (byte) 93)) {
          this.locked = true;
          return (jaclib.memory.Buffer) ((Object) this.toolkit.field_Kc);
        }
        return null;
    }

    Direct3DVertexBuffer(Direct3DToolkit param0, boolean param1) {
        this.locked = false;
        this.toolkit = param0;
        this.dynamic = param1 ? true : false;
    }
}
