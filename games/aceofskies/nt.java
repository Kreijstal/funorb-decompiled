/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nt extends ib implements bp {
    private int field_f;
    private int field_i;
    private jagdx.IDirect3DVolumeTexture field_g;
    private int field_h;

    final jagdx.IDirect3DBaseTexture b(int param0) {
        if (param0 <= 87) {
            ((nt) this).a((byte) 104);
            return (jagdx.IDirect3DBaseTexture) (Object) ((nt) this).field_g;
        }
        return (jagdx.IDirect3DBaseTexture) (Object) ((nt) this).field_g;
    }

    nt(kr param0, hd param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, param1, la.field_h, false, param2 * param3 * param4);
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        jagdx.PixelBuffer var15 = null;
        L0: {
          ((nt) this).field_h = param3;
          ((nt) this).field_f = param4;
          ((nt) this).field_i = param2;
          ((nt) this).field_g = ((nt) this).field_c.field_Rc.a(param2, param3, param4, 1, 0, kr.a(param1, ((nt) this).field_d, false), 1);
          var15 = ((nt) this).field_c.field_Ec;
          var8 = ((nt) this).field_g.LockBox(0, 0, 0, 0, param2, param3, param4, 0, var15);
          if (!jagdx.gf.a((byte) 64, var8)) {
            break L0;
          } else {
            var9 = ((nt) this).field_e.field_b * ((nt) this).field_i;
            var10 = var9 * ((nt) this).field_h;
            var11 = var15.getSlicePitch();
            if (var10 == var11) {
              var15.a(param5, 0, 0, ((nt) this).field_f * ((nt) this).field_h * var9);
              boolean discarded$3 = ((nt) this).field_g.UnlockBox(0);
              break L0;
            } else {
              var12 = var15.getRowPitch();
              if (var9 == var12) {
                var13 = 0;
                L1: while (true) {
                  if (((nt) this).field_f > var13) {
                    var15.a(param5, var10 * var13, var11 * var13, var10);
                    var13++;
                    continue L1;
                  } else {
                    boolean discarded$4 = ((nt) this).field_g.UnlockBox(0);
                    return;
                  }
                }
              } else {
                var13 = 0;
                L2: while (true) {
                  if (((nt) this).field_f > var13) {
                    var14 = 0;
                    L3: while (true) {
                      if (((nt) this).field_h <= var14) {
                        var13++;
                        continue L2;
                      } else {
                        var15.a(param5, var10 * var13 + var9 * var14, var12 * var14 + var11 * var13, var9);
                        var14++;
                        continue L3;
                      }
                    }
                  } else {
                    boolean discarded$5 = ((nt) this).field_g.UnlockBox(0);
                    return;
                  }
                }
              }
            }
          }
        }
    }

    public final void a(byte param0) {
        ((nt) this).field_c.a(param0 + 66, (nt) this);
        if (param0 != -50) {
            jagdx.IDirect3DBaseTexture discarded$0 = ((nt) this).b(15);
        }
    }

    public final void a(ke param0, int param1) {
        super.a(param0, param1);
    }
}
