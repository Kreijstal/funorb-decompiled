/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm implements ti {
    private kr field_f;
    private int field_b;
    private jagdx.IDirect3DIndexBuffer field_g;
    private boolean field_d;
    private la field_e;
    private int field_a;
    private boolean field_c;

    public final jaclib.memory.Buffer a(boolean param0, int param1) {
        if (param1 != 32570) {
          this.a(75, -106);
          if (this.field_g == null) {
            return null;
          }
          param0 = param0 & this.field_c;
          if (this.field_d) {
            return null;
          }
          if (jagdx.gf.a((byte) 94, this.field_g.Lock(0, this.field_b, param0 ? 8192 : 0, this.field_f.field_vc))) {
            this.field_d = true;
            return (jaclib.memory.Buffer) ((Object) this.field_f.field_vc);
          }
          return null;
        }
        if (this.field_g == null) {
          return null;
        }
        param0 = param0 & this.field_c;
        if (this.field_d) {
          return null;
        }
        if (jagdx.gf.a((byte) 94, this.field_g.Lock(0, this.field_b, param0 ? 8192 : 0, this.field_f.field_vc))) {
          this.field_d = true;
          return (jaclib.memory.Buffer) ((Object) this.field_f.field_vc);
        }
        return null;
    }

    public final boolean a(byte param0) {
        int var2 = 31 % ((-61 - param0) / 59);
        if (!this.field_d) {
          return false;
        }
        if (jagdx.gf.a((byte) 72, this.field_g.Unlock())) {
          this.field_d = false;
          return true;
        }
        return false;
    }

    public final void a(int param0, int param1) {
        int var3 = 0;
        this.field_a = this.field_e.field_c * param1;
        if (this.field_a <= this.field_b) {
        } else {
          int var4 = 8;
          if (this.field_c) {
            var4 = var4 | 512;
            var3 = 0;
          } else {
            var3 = 1;
          }
          if (this.field_g != null) {
            this.field_g.a(1618);
            this.field_g = this.field_f.field_Rc.a(this.field_a, var4, this.field_e != la.field_b ? 102 : 101, var3, this.field_g);
            this.field_b = this.field_a;
            if (param0 == -12880) {
              return;
            }
            this.field_a = -21;
            return;
          }
          this.field_g = this.field_f.field_Rc.a(this.field_a, var4, this.field_e != la.field_b ? 102 : 101, var3, this.field_g);
          this.field_b = this.field_a;
        }
        if (param0 == -12880) {
          return;
        }
        this.field_a = -21;
    }

    public final void a(int param0) {
        if (null != this.field_g) {
          this.field_g.a(1618);
          this.field_g = null;
          this.field_b = 0;
          this.field_a = 0;
          if (param0 != 4665) {
            this.a((byte) 35);
            return;
          }
          return;
        }
        this.field_b = 0;
        this.field_a = 0;
        if (param0 == 4665) {
          return;
        }
        this.a((byte) 35);
    }

    dm(kr param0, la param1, boolean param2) {
        this.field_d = false;
        this.field_e = param1;
        this.field_f = param0;
        this.field_c = param2 ? true : false;
    }
}
