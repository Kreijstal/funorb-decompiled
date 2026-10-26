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
        boolean decompiledFrameRemainder0 = true;
        Object stackIn_3_0 = this;
        kr stackIn_3_1 = (kr) (param0);
        hd stackIn_3_2 = lc.field_g;
        la stackIn_3_3 = la.field_h;
        if (param2) {
          Object stackIn_3_0Lifetime1 = this;
          if (param0.field_rc) {
            int stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          int stackIn_4_4Lifetime1 = 0;
        }
        this.field_g = param1;
        if (this.field_b) {
          this.field_f = this.field_c.field_Rc.a(this.field_g, 0, 1024, 21, 1);
        } else {
          this.field_f = this.field_c.field_Rc.a(this.field_g, 1, 0, 21, 1);
        }
        jagdx.PixelBuffer var10 = this.field_c.field_Ec;
        jagdx.PixelBuffer var11 = var10;
        for (int var6 = 0; 6 > var6; var6++) {
          int var7 = this.field_f.LockRect(var6, 0, 0, 0, this.field_g, this.field_g, 0, var11);
          if (jagdx.gf.a((byte) 86, var7)) {
            int var8 = var11.getRowPitch();
            if (4 * this.field_g != var8) {
              for (int var9 = 0; var9 < this.field_g; var9++) {
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
