/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap implements pv {
    private boolean field_d;
    private byte field_e;
    private ir field_c;
    jagdx.IDirect3DVertexBuffer field_b;
    private int field_a;
    private int field_g;
    private boolean field_f;

    public final jaclib.memory.Buffer a(int param0, boolean param1) {
        if (null == this.field_b) {
          return null;
        }
        if (param0 != 7454) {
          this.c(-80);
          param1 = param1 & this.field_f;
          if (this.field_d) {
            return null;
          }
          if (jagdx.gv.b(this.field_b.Lock(0, this.field_g, param1 ? 8192 : 0, this.field_c.field_Yc), param0 ^ -7499)) {
            this.field_d = true;
            return (jaclib.memory.Buffer) ((Object) this.field_c.field_Yc);
          }
          return null;
        }
        param1 = param1 & this.field_f;
        if (this.field_d) {
          return null;
        }
        if (jagdx.gv.b(this.field_b.Lock(0, this.field_g, param1 ? 8192 : 0, this.field_c.field_Yc), param0 ^ -7499)) {
          this.field_d = true;
          return (jaclib.memory.Buffer) ((Object) this.field_c.field_Yc);
        }
        return null;
    }

    public final boolean a(int param0) {
        if (param0 != 22957) {
          return true;
        }
        if (!this.field_d) {
          return false;
        }
        if (jagdx.gv.b(this.field_b.Unlock(), -98)) {
          this.field_d = false;
          return true;
        }
        return false;
    }

    public final void b(int param0) {
        if (null != this.field_b) {
          this.field_b.a(param0 ^ -30320);
          this.field_b = null;
          this.field_a = 0;
          this.field_g = 0;
          if (param0 != 12001) {
            this.field_g = 82;
            return;
          }
          return;
        }
        this.field_a = 0;
        this.field_g = 0;
        if (param0 == 12001) {
          return;
        }
        this.field_g = 82;
    }

    public final boolean a(int param0, byte param1, int param2) {
        boolean stackIn_11_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_20_0 = false;
        int var4;
        int var5;
        if (param1 != -35) {
          return true;
        }
        this.field_e = (byte)param0;
        this.field_a = param2;
        if (this.field_a <= this.field_g) {
          stackIn_20_0 = (this.field_b != null);
          return stackIn_20_0;
        }
        var5 = 8;
        if (!this.field_f) {
          var4 = 1;
        } else {
          var4 = 0;
          var5 = var5 | 512;
        }
        if (this.field_b == null) {
          this.field_b = this.field_c.field_Cc.a(this.field_a, var5, 0, var4, this.field_b);
          this.field_g = this.field_a;
          stackIn_11_0 = (this.field_b != null);
          return stackIn_11_0;
        }
        this.field_b.a(-22671);
        this.field_b = this.field_c.field_Cc.a(this.field_a, var5, 0, var4, this.field_b);
        this.field_g = this.field_a;
        stackIn_15_0 = (this.field_b != null);
        return stackIn_15_0;
    }

    final int c(int param0) {
        if (param0 <= 84) {
          this.b(48);
          return this.field_e;
        }
        return this.field_e;
    }

    ap(ir param0, boolean param1) {
        this.field_d = false;
        this.field_c = param0;
        this.field_f = param1 ? true : false;
    }
}
