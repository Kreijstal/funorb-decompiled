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
        return (jagdx.IDirect3DBaseTexture) (Object) ((ek) this).field_f;
    }

    ek(cta param0, ft param1, int param2, int param3, int param4, byte[] param5) {
        super(param0, param1, una.field_g, false, param2 * param3 * param4);
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        jagdx.PixelBuffer var15 = null;
        L0: {
          ((ek) this).field_h = param3;
          ((ek) this).field_i = param4;
          ((ek) this).field_g = param2;
          ((ek) this).field_f = ((ek) this).field_d.field_jd.a(param2, param3, param4, 1, 0, cta.a(param1, -128, ((ek) this).field_b), 1);
          var15 = ((ek) this).field_d.field_Nc;
          var8 = ((ek) this).field_f.LockBox(0, 0, 0, 0, param2, param3, param4, 0, var15);
          if (!jagdx.ah.a(var8, (byte) -86)) {
            break L0;
          } else {
            L1: {
              var9 = ((ek) this).field_e.field_b * ((ek) this).field_g;
              var10 = var9 * ((ek) this).field_h;
              var11 = var15.getSlicePitch();
              if (var10 == var11) {
                var15.a(param5, 0, 0, var9 * ((ek) this).field_h * ((ek) this).field_i);
                break L1;
              } else {
                var12 = var15.getRowPitch();
                if (var9 != var12) {
                  var13 = 0;
                  L2: while (true) {
                    if (((ek) this).field_i <= var13) {
                      break L1;
                    } else {
                      var14 = 0;
                      L3: while (true) {
                        if (var14 >= ((ek) this).field_h) {
                          var13++;
                          continue L2;
                        } else {
                          var15.a(param5, var14 * var9 + var13 * var10, var13 * var11 + var14 * var12, var9);
                          var14++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  var13 = 0;
                  L4: while (true) {
                    if (var13 >= ((ek) this).field_i) {
                      break L1;
                    } else {
                      var15.a(param5, var10 * var13, var11 * var13, var10);
                      var13++;
                      continue L4;
                    }
                  }
                }
              }
            }
            boolean discarded$1 = ((ek) this).field_f.UnlockBox(0);
            break L0;
          }
        }
    }

    public final void b(byte param0) {
        ((ek) this).field_d.a((byte) -125, (ek) this);
        if (param0 < 32) {
            Object var3 = null;
            ((ek) this).a(88, (hs) null);
        }
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
    }
}
