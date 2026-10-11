/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co implements cr {
    private ir field_e;
    private int field_b;
    private boolean field_c;
    private jagdx.IDirect3DIndexBuffer field_f;
    private io field_a;
    private boolean field_g;
    private int field_d;

    public final boolean a(int param0) {
        if (!this.field_c) {
          if (param0 == -28833) {
            return false;
          }
          return false;
        }
        if (jagdx.gv.b(this.field_f.Unlock(), -75)) {
          this.field_c = false;
          return true;
        }
        if (param0 == -28833) {
          return false;
        }
        return false;
    }

    public final void b(int param0) {
        if (this.field_f != null) {
          this.field_f.a(-22671);
          this.field_f = null;
          this.field_d = 0;
          if (param0 != 12001) {
            this.field_b = -108;
            this.field_b = 0;
            return;
          }
          this.field_b = 0;
          return;
        }
        this.field_d = 0;
        if (param0 == 12001) {
          this.field_b = 0;
          return;
        }
        this.field_b = -108;
        this.field_b = 0;
    }

    public final void a(byte param0, int param1) {
        int var4 = 0;
        int var3 = 0;
        this.field_b = this.field_a.field_j * param1;
        if (this.field_b > this.field_d) {
          var4 = 8;
          if (!this.field_g) {
            var3 = 1;
          } else {
            var4 = var4 | 512;
            var3 = 0;
          }
          if (this.field_f != null) {
            this.field_f.a(-22671);
          }
          this.field_f = this.field_e.field_Cc.a(this.field_b, var4, io.field_k != this.field_a ? 102 : 101, var3, this.field_f);
          this.field_d = this.field_b;
        }
        if (param0 < -67) {
          return;
        }
        this.a((byte) 36, 56);
    }

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (this.field_f == null) {
          return null;
        }
        if (param1 != 10081) {
          return (jaclib.memory.Buffer) null;
        }
        param0 = param0 & this.field_g;
        if (this.field_c) {
          return null;
        }
        if (jagdx.gv.b(this.field_f.Lock(0, this.field_d, !param0 ? 0 : 8192, this.field_e.field_Yc), -75)) {
          this.field_c = true;
          return (jaclib.memory.Buffer) ((Object) this.field_e.field_Yc);
        }
        return null;
    }

    co(ir param0, io param1, boolean param2) {
        this.field_c = false;
        this.field_e = param0;
        this.field_g = param2 ? true : false;
        this.field_a = param1;
    }
}
