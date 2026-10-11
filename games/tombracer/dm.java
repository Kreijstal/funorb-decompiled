/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm implements eja {
    jagdx.IDirect3DIndexBuffer field_d;
    private cta field_a;
    private int field_f;
    private boolean field_e;
    private una field_g;
    private int field_c;
    private boolean field_b;

    public final boolean a(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (!this.field_b) {
          var2 = 58 / ((param0 - 54) / 41);
          return false;
        }
        if (jagdx.ah.a(this.field_d.Unlock(), (byte) -123)) {
          this.field_b = false;
          return true;
        }
        var2Lifetime1 = 58 / ((param0 - 54) / 41);
        return false;
    }

    public final void a(int param0, int param1) {
        int var4 = 0;
        this.field_c = this.field_g.field_e * param1;
        int var3 = -99 / ((param0 + 30) / 36);
        if (this.field_f >= this.field_c) {
          return;
        }
        int var5 = 8;
        if (this.field_e) {
          var5 = var5 | 512;
          var4 = 0;
        } else {
          var4 = 1;
        }
        if (this.field_d == null) {
          this.field_d = this.field_a.field_jd.a(this.field_c, var5, this.field_g == una.field_f ? 101 : 102, var4, this.field_d);
          this.field_f = this.field_c;
          return;
        }
        this.field_d.a(false);
        this.field_d = this.field_a.field_jd.a(this.field_c, var5, this.field_g == una.field_f ? 101 : 102, var4, this.field_d);
        this.field_f = this.field_c;
    }

    public final jaclib.memory.Buffer a(boolean param0, byte param1) {
        if (this.field_d == null) {
          return null;
        }
        param0 = param0 & this.field_e;
        if (this.field_b) {
          if (param1 >= -9) {
            this.field_g = (una) null;
            return null;
          }
          return null;
        }
        if (jagdx.ah.a(this.field_d.Lock(0, this.field_f, param0 ? 8192 : 0, this.field_a.field_Oc), (byte) -94)) {
          this.field_b = true;
          return (jaclib.memory.Buffer) ((Object) this.field_a.field_Oc);
        }
        if (param1 >= -9) {
          this.field_g = (una) null;
          return null;
        }
        return null;
    }

    public final una b(int param0) {
        if (param0 != -32491) {
          return (una) null;
        }
        return this.field_g;
    }

    public final void a(int param0) {
        if (this.field_d != null) {
          this.field_d.a(false);
          this.field_d = null;
          this.field_c = 0;
          if (param0 != 12574) {
            this.field_g = (una) null;
            this.field_f = 0;
            return;
          }
          this.field_f = 0;
          return;
        }
        this.field_c = 0;
        if (param0 == 12574) {
          this.field_f = 0;
          return;
        }
        this.field_g = (una) null;
        this.field_f = 0;
    }

    dm(cta param0, una param1, boolean param2) {
        this.field_b = false;
        this.field_a = param0;
        this.field_e = param2 ? true : false;
        this.field_g = param1;
    }
}
