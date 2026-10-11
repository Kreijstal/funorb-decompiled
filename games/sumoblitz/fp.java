/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends fj implements ef {
    private jagdx.IDirect3DCubeTexture field_f;
    private int field_g;

    public final void a(int param0) {
        if (param0 != 8905) {
          this.d(-55);
        }
        this.field_b.a((fj) (this), 1);
    }

    public final void a(ji param0, int param1) {
        super.a(param0, param1 ^ 0);
        if (param1 != 15149) {
          this.d(20);
        }
    }

    fp(ir param0, int param1, boolean param2, int[][] param3) {
        super(null, null, null, false, param1 * param1 * 6);
        int var6 = 0;
        int var9 = 0;
        Object stackIn_3_0;
        ir stackIn_3_1;
        iw stackIn_3_2;
        io stackIn_3_3;
        int stackIn_4_4 = 0;
        int var7;
        int var8;
        jagdx.PixelBuffer var10;
        jagdx.PixelBuffer var11;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (ir) (param0);
        stackIn_3_2 = nl.field_p;
        stackIn_3_3 = io.field_g;
        if (param2) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Qc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        this.field_g = param1;
        if (this.field_e) {
          this.field_f = this.field_b.field_Cc.a(this.field_g, 0, 1024, 21, 1);
        } else {
          this.field_f = this.field_b.field_Cc.a(this.field_g, 1, 0, 21, 1);
        }
        var10 = this.field_b.field_Jc;
        var11 = var10;
        for (var6 = 0; 6 > var6; var6++) {
          var7 = this.field_f.LockRect(var6, 0, 0, 0, this.field_g, this.field_g, 0, var11);
          if (jagdx.gv.b(var7, -47)) {
            var8 = var11.getRowPitch();
            if (this.field_g * 4 != var8) {
              for (var9 = 0; var9 < this.field_g; var9++) {
                var10.a(param3[var6], var9 * this.field_g, var8 * var9, this.field_g);
              }
            } else {
              var10.a(param3[var6], 0, 0, this.field_g * this.field_g);
            }
            this.field_f.UnlockRect(var6, 0);
          }
        }
    }

    final jagdx.IDirect3DBaseTexture d(int param0) {
        if (param0 != -22689) {
          return (jagdx.IDirect3DBaseTexture) null;
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }
}
