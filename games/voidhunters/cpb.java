/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cpb extends ora implements gf {
    private int field_f;
    private int field_h;
    private int field_g;
    private jagdx.IDirect3DVolumeTexture field_i;

    final jagdx.IDirect3DBaseTexture c(int param0) {
        if (param0 != 24971) {
          this.c(-11);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_i);
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    public final void b(int param0) {
        this.field_d.a(this, -7913);
        if (param0 != -27445) {
          this.b(-122);
        }
    }

    cpb(nla param0, kb param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, param1, mj.field_f, false, param4 * param3 * param2);
        int var14 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        jagdx.PixelBuffer var15;
        this.field_h = param4;
        this.field_g = param3;
        this.field_f = param2;
        this.field_i = this.field_d.field_Mc.a(param2, param3, param4, 1, 0, nla.a(param1, this.field_a, -86), 1);
        var15 = this.field_d.field_zc;
        var8 = this.field_i.LockBox(0, 0, 0, 0, param2, param3, param4, 0, var15);
        if (jagdx.hea.b(var8, (byte) 15)) {
          var9 = this.field_c.field_a * this.field_f;
          var10 = var9 * this.field_g;
          var11 = var15.getSlicePitch();
          if (var11 != var10) {
            var12 = var15.getRowPitch();
            if (var12 == var9) {
              for (var13 = 0; var13 < this.field_h; var13++) {
                var15.a(param5, var13 * var10, var11 * var13, var10);
              }
            } else {
              for (var13 = 0; this.field_h > var13; var13++) {
                for (var14 = 0; this.field_g > var14; var14++) {
                  var15.a(param5, var14 * var9 + var13 * var10, var11 * var13 + var14 * var12, var9);
                }
              }
            }
          } else {
            var15.a(param5, 0, 0, this.field_h * this.field_g * var9);
          }
          this.field_i.UnlockBox(0);
        }
    }
}
