/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class okb implements vca {
    private boolean field_c;
    private mj field_b;
    private int field_f;
    private boolean field_e;
    private int field_g;
    private jagdx.IDirect3DIndexBuffer field_d;
    private nla field_a;

    public final void a(int param0) {
        if (null != this.field_d) {
          this.field_d.a(false);
          this.field_d = null;
        }
        this.field_f = 0;
        if (param0 < -84) {
          this.field_g = 0;
          return;
        }
    }

    public final void a(int param0, int param1) {
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
        this.field_g = this.field_b.field_h * param1;
        if (param0 != 25427) {
          return;
        }
        if (this.field_g <= this.field_f) {
          return;
        }
        var4 = 8;
        if (this.field_e) {
          var3 = 0;
          var4 = var4 | 512;
        } else {
          var3 = 1;
        }
        if (null == this.field_d) {
          stackIn_10_0 = this;
          stackIn_10_1 = this.field_a.field_Mc;
          stackIn_10_2 = this.field_g;
          stackIn_10_3 = var4;
          if (this.field_b == mj.field_e) {
            stackIn_11_4 = 101;
          } else {
            stackIn_11_4 = 102;
          }
          this.field_d = ((jagdx.IDirect3DDevice) (Object) stackIn_10_1).a(stackIn_10_2, stackIn_10_3, stackIn_11_4, var3, this.field_d);
        } else {
          this.field_d.a(false);
          stackIn_14_0 = this;
          stackIn_14_1 = this.field_a.field_Mc;
          stackIn_14_2 = this.field_g;
          stackIn_14_3 = var4;
          if (this.field_b == mj.field_e) {
            stackIn_15_4 = 101;
          } else {
            stackIn_15_4 = 102;
          }
          this.field_d = ((jagdx.IDirect3DDevice) (Object) stackIn_14_1).a(stackIn_14_2, stackIn_14_3, stackIn_15_4, var3, this.field_d);
        }
        this.field_f = this.field_g;
        return;
    }

    public final boolean b(int param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (!this.field_c) {
          var2 = 14 / ((13 - param0) / 37);
          return false;
        }
        if (jagdx.hea.b(this.field_d.Unlock(), (byte) 90)) {
          this.field_c = false;
          return true;
        }
        var2Lifetime1 = 14 / ((13 - param0) / 37);
        return false;
    }

    public final jaclib.memory.Buffer a(byte param0, boolean param1) {
        if (param0 >= -23) {
          this.b(-118);
          if (null == this.field_d) {
            return null;
          }
          param1 = param1 & this.field_e;
          if (this.field_c) {
            return null;
          }
          if (jagdx.hea.b(this.field_d.Lock(0, this.field_f, param1 ? 8192 : 0, this.field_a.field_Kc), (byte) 37)) {
            this.field_c = true;
            return (jaclib.memory.Buffer) ((Object) this.field_a.field_Kc);
          }
          return null;
        }
        if (null == this.field_d) {
          return null;
        }
        param1 = param1 & this.field_e;
        if (this.field_c) {
          return null;
        }
        if (jagdx.hea.b(this.field_d.Lock(0, this.field_f, param1 ? 8192 : 0, this.field_a.field_Kc), (byte) 37)) {
          this.field_c = true;
          return (jaclib.memory.Buffer) ((Object) this.field_a.field_Kc);
        }
        return null;
    }

    okb(nla param0, mj param1, boolean param2) {
        this.field_c = false;
        this.field_b = param1;
        this.field_e = param2 ? true : false;
        this.field_a = param0;
    }
}
