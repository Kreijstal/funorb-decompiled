/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DVertexBuffer implements HardwareVertexBuffer {
    jagdx.IDirect3DVertexBuffer buffer;
    private int allocatedSize;
    private byte field_g;
    private HardwareDirect3DRenderer renderer;
    private boolean dynamic;
    private int requestedSize;
    private boolean locked;

    public final boolean a(int param0, int param1, int param2) {
        int var4;
        if (param1 > -112) {
          return true;
        }
        this.requestedSize = param2;
        this.field_g = (byte)param0;
        if (this.allocatedSize >= this.requestedSize) {
          boolean stackIn_6_0 = (this.buffer != null);
          return stackIn_6_0;
        }
        int var5 = 8;
        if (this.dynamic) {
          var5 = var5 | 512;
          var4 = 0;
        } else {
          var4 = 1;
        }
        if (this.buffer == null) {
          this.buffer = this.renderer.field_Rc.a(this.requestedSize, var5, 0, var4, this.buffer);
          this.allocatedSize = this.requestedSize;
          boolean stackIn_14_0 = (this.buffer != null);
          return stackIn_14_0;
        }
        this.buffer.a(1618);
        this.buffer = this.renderer.field_Rc.a(this.requestedSize, var5, 0, var4, this.buffer);
        this.allocatedSize = this.requestedSize;
        boolean stackIn_18_0 = (this.buffer != null);
        return stackIn_18_0;
    }

    public final void a(int param0) {
        if (null != this.buffer) {
          this.buffer.a(1618);
          this.buffer = null;
        }
        if (param0 == 4665) {
          this.allocatedSize = 0;
          this.requestedSize = 0;
          return;
        }
        this.b(28);
        this.allocatedSize = 0;
        this.requestedSize = 0;
    }

    final int b(int param0) {
        if (param0 != 1) {
          this.a((byte) 105);
          return this.field_g;
        }
        return this.field_g;
    }

    public final boolean a(byte param0) {
        if (this.locked) {
          if (jagdx.gf.a((byte) 73, this.buffer.Unlock())) {
            this.locked = false;
            return true;
          }
          if (param0 == -60) {
            return false;
          }
          return true;
        }
        if (param0 == -60) {
          return false;
        }
        return true;
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        if (null == this.buffer) {
          return null;
        }
        param0 = param0 & this.dynamic;
        if (!this.locked) {
          if (jagdx.gf.a((byte) 124, this.buffer.Lock(0, this.allocatedSize, param0 ? 8192 : 0, this.renderer.field_vc))) {
            this.locked = true;
            return (jaclib.memory.Buffer) ((Object) this.renderer.field_vc);
          }
          if (param1 >= -58) {
            return (jaclib.memory.Buffer) null;
          }
          return null;
        }
        if (param1 >= -58) {
          return (jaclib.memory.Buffer) null;
        }
        return null;
    }

    Direct3DVertexBuffer(HardwareDirect3DRenderer param0, boolean param1) {
        this.locked = false;
        this.renderer = param0;
        this.dynamic = param1 ? true : false;
    }
}
