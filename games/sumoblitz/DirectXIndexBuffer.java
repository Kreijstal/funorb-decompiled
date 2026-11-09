/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXIndexBuffer implements IndexBuffer {
    private DirectXGraphicsToolkit toolkit;
    private int sizeBytes;
    private boolean mapped;
    private jagdx.IDirect3DIndexBuffer buffer;
    private GpuDataType indexType;
    private boolean dynamic;
    private int capacityBytes;

    public final boolean unmap(int guard) {
        if (!this.mapped) {
          if (guard == -28833) {
            return false;
          }
          return false;
        }
        if (jagdx.HResult.succeeded(this.buffer.Unlock(), -75)) {
          this.mapped = false;
          return true;
        }
        if (guard == -28833) {
          return false;
        }
        return false;
    }

    public final void close(int guard) {
        if (this.buffer != null) {
          this.buffer.release(-22671);
          this.buffer = null;
          this.capacityBytes = 0;
          if (guard != 12001) {
            this.sizeBytes = -108;
            this.sizeBytes = 0;
            return;
          }
          this.sizeBytes = 0;
          return;
        }
        this.capacityBytes = 0;
        if (guard == 12001) {
          this.sizeBytes = 0;
          return;
        }
        this.sizeBytes = -108;
        this.sizeBytes = 0;
    }

    public final void allocate(byte guard, int indexCount) {
        int var4 = 0;
        int var3 = 0;
        this.sizeBytes = this.indexType.bytesPerComponent * indexCount;
        if (this.sizeBytes > this.capacityBytes) {
          var4 = 8;
          if (!this.dynamic) {
            var3 = 1;
          } else {
            var4 = var4 | 512;
            var3 = 0;
          }
          if (this.buffer != null) {
            this.buffer.release(-22671);
          }
          this.buffer = this.toolkit.field_Cc.a(this.sizeBytes, var4, GpuDataType.UNSIGNED_SHORT != this.indexType ? 102 : 101, var3, this.buffer);
          this.capacityBytes = this.sizeBytes;
        }
        if (guard < -67) {
          return;
        }
        this.allocate((byte) 36, 56);
    }

    public final jaclib.memory.Buffer map(boolean discard, int guard) {
        if (this.buffer == null) {
          return null;
        }
        if (guard != 10081) {
          return (jaclib.memory.Buffer) null;
        }
        discard = discard & this.dynamic;
        if (this.mapped) {
          return null;
        }
        if (jagdx.HResult.succeeded(this.buffer.Lock(0, this.capacityBytes, !discard ? 0 : 8192, this.toolkit.field_Yc), -75)) {
          this.mapped = true;
          return (jaclib.memory.Buffer) ((Object) this.toolkit.field_Yc);
        }
        return null;
    }

    DirectXIndexBuffer(DirectXGraphicsToolkit param0, GpuDataType param1, boolean param2) {
        this.mapped = false;
        this.toolkit = param0;
        this.dynamic = param2 ? true : false;
        this.indexType = param1;
    }
}
