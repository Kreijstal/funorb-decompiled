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
        Object stackIn_3_0;
        kr stackIn_3_1;
        hd stackIn_3_2;
        la stackIn_3_3;
        Object stackIn_4_0 = null;
        kr stackIn_4_1 = null;
        hd stackIn_4_2 = null;
        la stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        jagdx.PixelBuffer var10;
        jagdx.PixelBuffer var11;
        L0: {
          L1: {
            stackIn_3_0 = this;

            stackIn_3_1 = (kr) (param0);

            stackIn_3_2 = lc.field_g;

            stackIn_3_3 = la.field_h;

            if (!param2) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (kr) ((Object) stackIn_3_1);

              stackIn_3_2 = (hd) ((Object) stackIn_3_2);

              stackIn_3_3 = (la) ((Object) stackIn_3_3);

              if (!param0.field_rc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (kr) ((Object) stackIn_3_1);
                stackIn_4_2 = (hd) ((Object) stackIn_3_2);
                stackIn_4_3 = (la) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (kr) ((Object) stackIn_3_1);
          stackIn_4_2 = (hd) ((Object) stackIn_3_2);
          stackIn_4_3 = (la) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
          break L0;
        }
        L2: {
          this.field_g = param1;
          if (this.field_b) {
            this.field_f = this.field_c.field_Rc.a(this.field_g, 0, 1024, 21, 1);
            break L2;
          } else {
            this.field_f = this.field_c.field_Rc.a(this.field_g, 1, 0, 21, 1);
            break L2;
          }
        }
        var10 = this.field_c.field_Ec;
        var11 = var10;
        var6 = 0;
        L3: while (true) {
          if (6 <= var6) {
            return;
          } else {
            var7 = this.field_f.LockRect(var6, 0, 0, 0, this.field_g, this.field_g, 0, var11);
            if (jagdx.gf.a((byte) 86, var7)) {
              L4: {
                var8 = var11.getRowPitch();
                if (4 * this.field_g != var8) {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= this.field_g) {
                      break L4;
                    } else {
                      var10.a(param3[var6], var9 * this.field_g, var9 * var8, this.field_g);
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  var10.a(param3[var6], 0, 0, this.field_g * this.field_g);
                  break L4;
                }
              }
              this.field_f.UnlockRect(var6, 0);
              var6++;
              continue L3;
            } else {
              var6++;
              continue L3;
            }
          }
        }
    }
}
