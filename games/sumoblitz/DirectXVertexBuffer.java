/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXVertexBuffer implements VertexBuffer {
    private boolean mapped;
    private byte stride;
    private DirectXGraphicsToolkit toolkit;
    jagdx.IDirect3DVertexBuffer buffer;
    private int sizeBytes;
    private int capacityBytes;
    private boolean dynamic;

    public final jaclib.memory.Buffer map(int guard, boolean discard) {
        if (null == this.buffer) {
          return null;
        }
        if (guard != 7454) {
          this.stride(-80);
          discard = discard & this.dynamic;
          if (this.mapped) {
            return null;
          }
          if (jagdx.HResult.succeeded(this.buffer.Lock(0, this.capacityBytes, discard ? 8192 : 0, this.toolkit.field_Yc), guard ^ -7499)) {
            this.mapped = true;
            return (jaclib.memory.Buffer) ((Object) this.toolkit.field_Yc);
          }
          return null;
        }
        discard = discard & this.dynamic;
        if (this.mapped) {
          return null;
        }
        if (jagdx.HResult.succeeded(this.buffer.Lock(0, this.capacityBytes, discard ? 8192 : 0, this.toolkit.field_Yc), guard ^ -7499)) {
          this.mapped = true;
          return (jaclib.memory.Buffer) ((Object) this.toolkit.field_Yc);
        }
        return null;
    }

    public final boolean unmap(int guard) {
        if (guard != 22957) {
          return true;
        }
        if (!this.mapped) {
          return false;
        }
        if (jagdx.HResult.succeeded(this.buffer.Unlock(), -98)) {
          this.mapped = false;
          return true;
        }
        return false;
    }

    public final void close(int guard) {
        if (null != this.buffer) {
          this.buffer.a(guard ^ -30320);
          this.buffer = null;
          this.sizeBytes = 0;
          this.capacityBytes = 0;
          if (guard != 12001) {
            this.capacityBytes = 82;
            return;
          }
          return;
        }
        this.sizeBytes = 0;
        this.capacityBytes = 0;
        if (guard == 12001) {
          return;
        }
        this.capacityBytes = 82;
    }

    public final boolean allocate(int stride, byte guard, int sizeBytes) {
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_20_0 = false;
        int var4;
        int var5;
        if (guard != -35) {
          return true;
        }
        this.stride = (byte)stride;
        this.sizeBytes = sizeBytes;
        if (this.sizeBytes <= this.capacityBytes) {
          stackIn_20_0 = (this.buffer != null);
          return stackIn_20_0;
        }
        var5 = 8;
        if (!this.dynamic) {
          var4 = 1;
        } else {
          var4 = 0;
          var5 = var5 | 512;
        }
        if (this.buffer == null) {
          this.buffer = this.toolkit.field_Cc.a(this.sizeBytes, var5, 0, var4, this.buffer);
          this.capacityBytes = this.sizeBytes;
          stackIn_11_0 = (this.buffer != null);
          return stackIn_11_0;
        }
        this.buffer.a(-22671);
        this.buffer = this.toolkit.field_Cc.a(this.sizeBytes, var5, 0, var4, this.buffer);
        this.capacityBytes = this.sizeBytes;
        stackIn_15_0 = (this.buffer != null);
        return stackIn_15_0;
    }

    final int stride(int guard) {
        if (guard <= 84) {
          this.close(48);
          return this.stride;
        }
        return this.stride;
    }

    DirectXVertexBuffer(DirectXGraphicsToolkit param0, boolean param1) {
        this.mapped = false;
        this.toolkit = param0;
        this.dynamic = param1 ? true : false;
    }
}
