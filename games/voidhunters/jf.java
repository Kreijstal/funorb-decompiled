/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ora implements hdb {
    private jagdx.IDirect3DCubeTexture field_g;
    private int field_f;

    final jagdx.IDirect3DBaseTexture c(int param0) {
        if (param0 != 24971) {
          this.b(102);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_g);
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    jf(nla param0, int param1, boolean param2, int[][] param3) {
        super(null, null, null, false, param1 * (param1 * 6));
        int var6 = 0;
        int var9 = 0;
        Object stackIn_3_0;
        nla stackIn_3_1;
        kb stackIn_3_2;
        mj stackIn_3_3;
        int stackIn_4_4 = 0;
        int var7;
        int var8;
        jagdx.PixelBuffer var10;
        jagdx.PixelBuffer var11;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (nla) (param0);
        stackIn_3_2 = qua.field_d;
        stackIn_3_3 = mj.field_f;
        if (param2) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Jc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        this.field_f = param1;
        if (this.field_b) {
          this.field_g = this.field_d.field_Mc.a(this.field_f, 0, 1024, 21, 1);
        } else {
          this.field_g = this.field_d.field_Mc.a(this.field_f, 1, 0, 21, 1);
        }
        var10 = this.field_d.field_zc;
        var11 = var10;
        for (var6 = 0; var6 < 6; var6++) {
          var7 = this.field_g.LockRect(var6, 0, 0, 0, this.field_f, this.field_f, 0, var11);
          if (jagdx.hea.b(var7, (byte) 114)) {
            var8 = var11.getRowPitch();
            if (this.field_f * 4 != var8) {
              for (var9 = 0; var9 < this.field_f; var9++) {
                var10.a(param3[var6], this.field_f * var9, var8 * var9, this.field_f);
              }
            } else {
              var10.a(param3[var6], 0, 0, this.field_f * this.field_f);
            }
            this.field_g.UnlockRect(var6, 0);
          }
        }
    }

    public final void b(int param0) {
        if (param0 != -27445) {
          return;
        }
        this.field_d.a(56, (ora) (this));
    }
}
