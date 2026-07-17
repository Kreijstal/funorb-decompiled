/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qs extends fj implements nh {
    private jagdx.IDirect3DVolumeTexture field_h;
    private int field_g;
    private int field_i;
    private int field_f;

    qs(ir param0, iw param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, param1, io.field_g, false, param3 * param2 * param4);
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        jagdx.PixelBuffer var15 = null;
        ((qs) this).field_f = param4;
        ((qs) this).field_g = param2;
        ((qs) this).field_i = param3;
        ((qs) this).field_h = ((qs) this).field_b.field_Cc.a(param2, param3, param4, 1, 0, ir.a(param1, -99, ((qs) this).field_c), 1);
        var15 = ((qs) this).field_b.field_Jc;
        var8 = ((qs) this).field_h.LockBox(0, 0, 0, 0, param2, param3, param4, 0, var15);
        if (!jagdx.gv.b(var8, -94)) {
          return;
        } else {
          var9 = ((qs) this).field_d.field_c * ((qs) this).field_g;
          var10 = var9 * ((qs) this).field_i;
          var11 = var15.getSlicePitch();
          if (var11 != var10) {
            var12 = var15.getRowPitch();
            if (var12 != var9) {
              var13 = 0;
              L0: while (true) {
                if (((qs) this).field_f <= var13) {
                  boolean discarded$3 = ((qs) this).field_h.UnlockBox(0);
                  return;
                } else {
                  var14 = 0;
                  L1: while (true) {
                    if (((qs) this).field_i <= var14) {
                      var13++;
                      continue L0;
                    } else {
                      var15.a(param5, var13 * var10 + var9 * var14, var12 * var14 + var11 * var13, var9);
                      var14++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var13 = 0;
              L2: while (true) {
                if (((qs) this).field_f <= var13) {
                  boolean discarded$4 = ((qs) this).field_h.UnlockBox(0);
                  return;
                } else {
                  var15.a(param5, var10 * var13, var13 * var11, var10);
                  var13++;
                  continue L2;
                }
              }
            }
          } else {
            var15.a(param5, 0, 0, var9 * ((qs) this).field_i * ((qs) this).field_f);
            boolean discarded$5 = ((qs) this).field_h.UnlockBox(0);
            return;
          }
        }
    }

    public final void a(ji param0, int param1) {
        if (param1 != 15149) {
            return;
        }
        super.a(param0, param1);
    }

    final jagdx.IDirect3DBaseTexture d(int param0) {
        if (param0 != -22689) {
            ((qs) this).field_g = -6;
            return (jagdx.IDirect3DBaseTexture) (Object) ((qs) this).field_h;
        }
        return (jagdx.IDirect3DBaseTexture) (Object) ((qs) this).field_h;
    }

    public final void a(int param0) {
        ((qs) this).field_b.a(2, (qs) this);
        if (param0 != 8905) {
            Object var3 = null;
            ((qs) this).a((ji) null, 117);
        }
    }
}
