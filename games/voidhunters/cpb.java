/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cpb extends ora implements gf {
    private int field_f;
    private int field_h;
    private int field_g;
    private jagdx.IDirect3DVolumeTexture field_i;

    final jagdx.IDirect3DBaseTexture c(int param0) {
        jagdx.IDirect3DBaseTexture discarded$0 = null;
        if (param0 != 24971) {
            discarded$0 = this.c(-11);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_i);
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    public final void b(int param0) {
        this.field_d.a((cpb) (this), -7913);
        if (param0 != -27445) {
            this.b(-122);
        }
    }

    cpb(nla param0, kb param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, param1, mj.field_f, false, param4 * param3 * param2);
        boolean discarded$1 = false;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        jagdx.PixelBuffer var15 = null;
        L0: {
          this.field_h = param4;
          this.field_g = param3;
          this.field_f = param2;
          this.field_i = this.field_d.field_Mc.a(param2, param3, param4, 1, 0, nla.a(param1, this.field_a, -86), 1);
          var15 = this.field_d.field_zc;
          var8 = this.field_i.LockBox(0, 0, 0, 0, param2, param3, param4, 0, var15);
          if (!jagdx.hea.b(var8, (byte) 15)) {
            break L0;
          } else {
            L1: {
              var9 = this.field_c.field_a * this.field_f;
              var10 = var9 * this.field_g;
              var11 = var15.getSlicePitch();
              if (var11 == var10) {
                var15.a(param5, 0, 0, this.field_h * this.field_g * var9);
                break L1;
              } else {
                var12 = var15.getRowPitch();
                if (var12 != var9) {
                  var13 = 0;
                  L2: while (true) {
                    if (this.field_h <= var13) {
                      break L1;
                    } else {
                      var14 = 0;
                      L3: while (true) {
                        if (this.field_g <= var14) {
                          var13++;
                          continue L2;
                        } else {
                          var15.a(param5, var14 * var9 + var13 * var10, var11 * var13 - -(var14 * var12), var9);
                          var14++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var13 = 0;
                  L4: while (true) {
                    if (var13 >= this.field_h) {
                      break L1;
                    } else {
                      var15.a(param5, var13 * var10, var11 * var13, var10);
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
            }
            discarded$1 = this.field_i.UnlockBox(0);
            break L0;
          }
        }
    }
}
