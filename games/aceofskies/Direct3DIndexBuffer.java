/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DIndexBuffer implements HardwareIndexBuffer {
    private HardwareDirect3DRenderer renderer;
    private int allocatedSize;
    private jagdx.IDirect3DIndexBuffer buffer;
    private boolean locked;
    private BufferElementType elementType;
    private int requestedSize;
    private boolean dynamic;

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 32570) {
          this.a(75, -106);
          if (this.buffer == null) {
            return null;
          }
          param0 = param0 & this.dynamic;
          if (this.locked) {
            return null;
          }
          if (jagdx.gf.a((byte) 94, this.buffer.Lock(0, this.allocatedSize, param0 ? 8192 : 0, this.renderer.field_vc))) {
            this.locked = true;
            return (jaclib.memory.Buffer) ((Object) this.renderer.field_vc);
          }
          return null;
        }
        if (this.buffer == null) {
          return null;
        }
        param0 = param0 & this.dynamic;
        if (this.locked) {
          return null;
        }
        if (jagdx.gf.a((byte) 94, this.buffer.Lock(0, this.allocatedSize, param0 ? 8192 : 0, this.renderer.field_vc))) {
          this.locked = true;
          return (jaclib.memory.Buffer) ((Object) this.renderer.field_vc);
        }
        return null;
    }

    public final boolean a(byte param0) {
        int var2 = 31 % ((-61 - param0) / 59);
        if (!this.locked) {
          return false;
        }
        if (jagdx.gf.a((byte) 72, this.buffer.Unlock())) {
          this.locked = false;
          return true;
        }
        return false;
    }

    public final void a(int param0, int param1) {
        int var3 = 0;
        this.requestedSize = this.elementType.field_c * param1;
        if (this.requestedSize <= this.allocatedSize) {
        } else {
          int var4 = 8;
          if (this.dynamic) {
            var4 = var4 | 512;
            var3 = 0;
          } else {
            var3 = 1;
          }
          if (this.buffer != null) {
            this.buffer.a(1618);
            this.buffer = this.renderer.field_Rc.a(this.requestedSize, var4, this.elementType != BufferElementType.field_b ? 102 : 101, var3, this.buffer);
            this.allocatedSize = this.requestedSize;
            if (param0 == -12880) {
              return;
            }
            this.requestedSize = -21;
            return;
          }
          this.buffer = this.renderer.field_Rc.a(this.requestedSize, var4, this.elementType != BufferElementType.field_b ? 102 : 101, var3, this.buffer);
          this.allocatedSize = this.requestedSize;
        }
        if (param0 == -12880) {
          return;
        }
        this.requestedSize = -21;
    }

    public final void a(int param0) {
        if (null != this.buffer) {
          this.buffer.a(1618);
          this.buffer = null;
          this.allocatedSize = 0;
          this.requestedSize = 0;
          if (param0 != 4665) {
            this.a((byte) 35);
            return;
          }
          return;
        }
        this.allocatedSize = 0;
        this.requestedSize = 0;
        if (param0 == 4665) {
          return;
        }
        this.a((byte) 35);
    }

    Direct3DIndexBuffer(HardwareDirect3DRenderer param0, BufferElementType param1, boolean param2) {
        this.locked = false;
        this.elementType = param1;
        this.renderer = param0;
        this.dynamic = param2 ? true : false;
    }
}
