/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DirectXVertexBuffer implements VertexStreamBuffer {
    jagdx.IDirect3DVertexBuffer field_e;
    private int field_a;
    private boolean field_g;
    private boolean field_f;
    private int field_b;
    private byte field_d;
    private Direct3DToolkit field_c;

    final int getStride(int param0) {
        if (param0 != -7339) {
          return 115;
        }
        return this.field_d;
    }

    public final void close(int param0) {
        if (null != this.field_e) {
          this.field_e.a(false);
          this.field_e = null;
          this.field_a = 0;
          if (param0 != 12574) {
            this.allocate(51, -94, true);
            this.field_b = 0;
            return;
          }
          this.field_b = 0;
          return;
        }
        this.field_a = 0;
        if (param0 == 12574) {
          this.field_b = 0;
          return;
        }
        this.allocate(51, -94, true);
        this.field_b = 0;
    }

    public final boolean allocate(int param0, int param1, boolean param2) {
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_20_0 = false;
        int var4;
        int var5;
        this.field_d = (byte)param1;
        if (!param2) {
          return true;
        }
        this.field_a = param0;
        if (this.field_b >= this.field_a) {
          stackIn_20_0 = (null != this.field_e);
          return stackIn_20_0;
        }
        var5 = 8;
        if (!this.field_f) {
          var4 = 1;
        } else {
          var4 = 0;
          var5 = var5 | 512;
        }
        if (this.field_e == null) {
          this.field_e = this.field_c.field_jd.createVertexBuffer(this.field_a, var5, 0, var4, this.field_e);
          this.field_b = this.field_a;
          stackIn_11_0 = (null != this.field_e);
          return stackIn_11_0;
        }
        this.field_e.a(false);
        this.field_e = this.field_c.field_jd.createVertexBuffer(this.field_a, var5, 0, var4, this.field_e);
        this.field_b = this.field_a;
        stackIn_15_0 = (null != this.field_e);
        return stackIn_15_0;
    }

    public final jaclib.memory.Buffer mapBuffer(int param0, boolean param1) {
        if (null == this.field_e) {
          return null;
        }
        param1 = param1 & this.field_f;
        if (param0 != -15730) {
          this.allocate(52, 89, false);
          if (this.field_g) {
            return null;
          }
          if (jagdx.ah.a(this.field_e.Lock(0, this.field_b, param1 ? 8192 : 0, this.field_c.field_Oc), (byte) 79)) {
            this.field_g = true;
            return (jaclib.memory.Buffer) ((Object) this.field_c.field_Oc);
          }
          return null;
        }
        if (this.field_g) {
          return null;
        }
        if (jagdx.ah.a(this.field_e.Lock(0, this.field_b, param1 ? 8192 : 0, this.field_c.field_Oc), (byte) 79)) {
          this.field_g = true;
          return (jaclib.memory.Buffer) ((Object) this.field_c.field_Oc);
        }
        return null;
    }

    public final boolean unmapBuffer(boolean param0) {
        if (!param0) {
          this.allocate(-68, -25, false);
          if (!this.field_g) {
            return false;
          }
          if (jagdx.ah.a(this.field_e.Unlock(), (byte) -109)) {
            this.field_g = false;
            return true;
          }
          return false;
        }
        if (!this.field_g) {
          return false;
        }
        if (jagdx.ah.a(this.field_e.Unlock(), (byte) -109)) {
          this.field_g = false;
          return true;
        }
        return false;
    }

    DirectXVertexBuffer(Direct3DToolkit param0, boolean param1) {
        this.field_g = false;
        this.field_f = param1 ? true : false;
        this.field_c = param0;
    }
}
