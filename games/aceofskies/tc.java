/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tc extends ib implements go {
    private jagdx.IDirect3DCubeTexture field_f;
    private int field_g;

    public final void a(byte param0) {
        this.field_c.a((ib) (this), (byte) 73);
        if (param0 != -50) {
          this.a((byte) -19);
        }
    }

    public final void a(ke param0, int param1) {
        super.a(param0, param1);
    }

    final jagdx.IDirect3DBaseTexture b(int param0) {
        if (param0 < 87) {
          this.a((byte) -105);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }

    tc(kr param0, int param1, boolean param2, int[][] param3) {
        super(null, null, null, false, 6 * param1 * param1);
        int var6 = 0;
        int var9 = 0;
        Object stackIn_3_0;
        kr stackIn_3_1;
        hd stackIn_3_2;
        la stackIn_3_3;
        int stackIn_4_4 = 0;
        int var7;
        int var8;
        jagdx.PixelBuffer var10;
        jagdx.PixelBuffer var11;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (kr) (param0);
        stackIn_3_2 = lc.field_g;
        stackIn_3_3 = la.field_h;
        if (param2) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_rc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        this.field_g = param1;
        if (this.field_b) {
          this.field_f = this.field_c.field_Rc.a(this.field_g, 0, 1024, 21, 1);
        } else {
          this.field_f = this.field_c.field_Rc.a(this.field_g, 1, 0, 21, 1);
        }
        var10 = this.field_c.field_Ec;
        var11 = var10;
        for (var6 = 0; 6 > var6; var6++) {
          var7 = this.field_f.LockRect(var6, 0, 0, 0, this.field_g, this.field_g, 0, var11);
          if (jagdx.gf.a((byte) 86, var7)) {
            var8 = var11.getRowPitch();
            if (4 * this.field_g != var8) {
              for (var9 = 0; var9 < this.field_g; var9++) {
                var10.a(param3[var6], var9 * this.field_g, var9 * var8, this.field_g);
              }
            } else {
              var10.a(param3[var6], 0, 0, this.field_g * this.field_g);
            }
            this.field_f.UnlockRect(var6, 0);
          }
        }
    }
}
