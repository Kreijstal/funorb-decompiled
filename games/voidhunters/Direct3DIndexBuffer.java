/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Direct3DIndexBuffer implements GpuIndexBuffer {
    private boolean locked;
    private GpuDataType dataType;
    private int capacity;
    private boolean dynamic;
    private int size;
    private jagdx.IDirect3DIndexBuffer buffer;
    private Direct3DToolkit toolkit;

    public final void release(int param0) {
        if (null != this.buffer) {
          this.buffer.release(false);
          this.buffer = null;
        }
        this.capacity = 0;
        if (param0 < -84) {
          this.size = 0;
          return;
        }
    }

    public final void allocate(int param0, int param1) {
        Object stackIn_10_0;
        jagdx.IDirect3DDevice stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        int stackIn_11_4 = 0;
        Object stackIn_14_0;
        jagdx.IDirect3DDevice stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_15_4 = 0;
        int var3;
        int var4;
        this.size = this.dataType.byteSize * param1;
        if (param0 != 25427) {
          return;
        }
        if (this.size <= this.capacity) {
          return;
        }
        var4 = 8;
        if (this.dynamic) {
          var3 = 0;
          var4 = var4 | 512;
        } else {
          var3 = 1;
        }
        if (null == this.buffer) {
          stackIn_10_0 = this;
          stackIn_10_1 = this.toolkit.field_Mc;
          stackIn_10_2 = this.size;
          stackIn_10_3 = var4;
          if (this.dataType == GpuDataType.UNSIGNED_SHORT) {
            stackIn_11_4 = 101;
          } else {
            stackIn_11_4 = 102;
          }
          this.buffer = ((jagdx.IDirect3DDevice) (Object) stackIn_10_1).createIndexBuffer(stackIn_10_2, stackIn_10_3, stackIn_11_4, var3, this.buffer);
        } else {
          this.buffer.release(false);
          stackIn_14_0 = this;
          stackIn_14_1 = this.toolkit.field_Mc;
          stackIn_14_2 = this.size;
          stackIn_14_3 = var4;
          if (this.dataType == GpuDataType.UNSIGNED_SHORT) {
            stackIn_15_4 = 101;
          } else {
            stackIn_15_4 = 102;
          }
          this.buffer = ((jagdx.IDirect3DDevice) (Object) stackIn_14_1).createIndexBuffer(stackIn_14_2, stackIn_14_3, stackIn_15_4, var3, this.buffer);
        }
        this.capacity = this.size;
        return;
    }

    public final boolean unlock(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (!this.locked) {
          var2 = 14 / ((13 - param0) / 37);
          return false;
        }
        if (jagdx.HResult.succeeded(this.buffer.Unlock(), (byte) 90)) {
          this.locked = false;
          return true;
        }
        var2Lifetime1 = 14 / ((13 - param0) / 37);
        return false;
    }

    public final jaclib.memory.Buffer lock(byte param0, boolean param1) {
        if (param0 >= -23) {
          this.unlock(-118);
          if (null == this.buffer) {
            return null;
          }
          param1 = param1 & this.dynamic;
          if (this.locked) {
            return null;
          }
          if (jagdx.HResult.succeeded(this.buffer.Lock(0, this.capacity, param1 ? 8192 : 0, this.toolkit.field_Kc), (byte) 37)) {
            this.locked = true;
            return (jaclib.memory.Buffer) ((Object) this.toolkit.field_Kc);
          }
          return null;
        }
        if (null == this.buffer) {
          return null;
        }
        param1 = param1 & this.dynamic;
        if (this.locked) {
          return null;
        }
        if (jagdx.HResult.succeeded(this.buffer.Lock(0, this.capacity, param1 ? 8192 : 0, this.toolkit.field_Kc), (byte) 37)) {
          this.locked = true;
          return (jaclib.memory.Buffer) ((Object) this.toolkit.field_Kc);
        }
        return null;
    }

    Direct3DIndexBuffer(Direct3DToolkit param0, GpuDataType param1, boolean param2) {
        this.locked = false;
        this.dataType = param1;
        this.dynamic = param2 ? true : false;
        this.toolkit = param0;
    }
}
