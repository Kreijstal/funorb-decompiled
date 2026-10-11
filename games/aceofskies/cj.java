/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj implements tl {
    jagdx.IDirect3DVertexBuffer field_f;
    private int field_b;
    private byte field_g;
    private kr field_e;
    private boolean field_a;
    private int field_c;
    private boolean field_d;

    public final boolean a(int param0, int param1, int param2) {
        boolean stackIn_6_0 = false;
        boolean stackIn_14_0 = false;
        boolean stackIn_18_0 = false;
        int var4;
        int var5;
        if (param1 > -112) {
          return true;
        }
        this.field_c = param2;
        this.field_g = (byte)param0;
        if (this.field_b >= this.field_c) {
          stackIn_6_0 = (this.field_f != null);
          return stackIn_6_0;
        }
        var5 = 8;
        if (this.field_a) {
          var5 = var5 | 512;
          var4 = 0;
        } else {
          var4 = 1;
        }
        if (this.field_f == null) {
          this.field_f = this.field_e.field_Rc.a(this.field_c, var5, 0, var4, this.field_f);
          this.field_b = this.field_c;
          stackIn_14_0 = (this.field_f != null);
          return stackIn_14_0;
        }
        this.field_f.a(1618);
        this.field_f = this.field_e.field_Rc.a(this.field_c, var5, 0, var4, this.field_f);
        this.field_b = this.field_c;
        stackIn_18_0 = (this.field_f != null);
        return stackIn_18_0;
    }

    public final void a(int param0) {
        if (null != this.field_f) {
          this.field_f.a(1618);
          this.field_f = null;
        }
        if (param0 == 4665) {
          this.field_b = 0;
          this.field_c = 0;
          return;
        }
        this.b(28);
        this.field_b = 0;
        this.field_c = 0;
    }

    final int b(int param0) {
        if (param0 != 1) {
          this.a((byte) 105);
          return this.field_g;
        }
        return this.field_g;
    }

    public final boolean a(byte param0) {
        if (this.field_d) {
          if (jagdx.gf.a((byte) 73, this.field_f.Unlock())) {
            this.field_d = false;
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
        if (null == this.field_f) {
          return null;
        }
        param0 = param0 & this.field_a;
        if (!this.field_d) {
          if (jagdx.gf.a((byte) 124, this.field_f.Lock(0, this.field_b, param0 ? 8192 : 0, this.field_e.field_vc))) {
            this.field_d = true;
            return (jaclib.memory.Buffer) ((Object) this.field_e.field_vc);
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

    cj(kr param0, boolean param1) {
        this.field_d = false;
        this.field_e = param0;
        this.field_a = param1 ? true : false;
    }
}
