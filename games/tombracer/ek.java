/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek extends nqa implements lv {
    private jagdx.IDirect3DVolumeTexture field_f;
    private int field_i;
    private int field_g;
    private int field_h;

    final jagdx.IDirect3DBaseTexture c(int param0) {
        int var2 = 21 / ((param0 - 48) / 45);
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }

    ek(cta param0, ft param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, param1, una.field_g, false, param2 * param3 * param4);
        int var14 = 0;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        jagdx.PixelBuffer var15;
        this.field_h = param3;
        this.field_i = param4;
        this.field_g = param2;
        this.field_f = this.field_d.field_jd.a(param2, param3, param4, 1, 0, cta.a(param1, -128, this.field_b), 1);
        var15 = this.field_d.field_Nc;
        var8 = this.field_f.LockBox(0, 0, 0, 0, param2, param3, param4, 0, var15);
        if (jagdx.ah.a(var8, (byte) -86)) {
          var9 = this.field_e.field_b * this.field_g;
          var10 = var9 * this.field_h;
          var11 = var15.getSlicePitch();
          if (var10 != var11) {
            var12 = var15.getRowPitch();
            if (var9 == var12) {
              for (var13 = 0; var13 < this.field_i; var13++) {
                var15.a(param5, var10 * var13, var11 * var13, var10);
              }
            } else {
              for (var13 = 0; this.field_i > var13; var13++) {
                for (var14 = 0; var14 < this.field_h; var14++) {
                  var15.a(param5, var14 * var9 + var13 * var10, var13 * var11 + var14 * var12, var9);
                }
              }
            }
          } else {
            var15.a(param5, 0, 0, var9 * this.field_h * this.field_i);
          }
          this.field_f.UnlockBox(0);
        }
    }

    public final void b(byte param0) {
        this.field_d.a((byte) -125, this);
        if (param0 < 32) {
          hs var3 = (hs) null;
          this.a(88, (hs) null);
        }
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
    }
}
