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
        super(param0, lc.field_g, la.field_h, false, 6 * param1 * param1);
        boolean discarded$1 = false;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jagdx.PixelBuffer var10 = null;
        jagdx.PixelBuffer var11 = null;
        Object stackIn_1_0 = null;
        kr stackIn_1_1 = null;
        hd stackIn_1_2 = null;
        la stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        kr stackIn_2_1 = null;
        hd stackIn_2_2 = null;
        la stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        kr stackIn_3_1 = null;
        hd stackIn_3_2 = null;
        la stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        kr stackIn_4_1 = null;
        hd stackIn_4_2 = null;
        la stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_0_0 = null;
        kr stackOut_0_1 = null;
        hd stackOut_0_2 = null;
        la stackOut_0_3 = null;
        Object stackOut_1_0 = null;
        kr stackOut_1_1 = null;
        hd stackOut_1_2 = null;
        la stackOut_1_3 = null;
        Object stackOut_2_0 = null;
        kr stackOut_2_1 = null;
        hd stackOut_2_2 = null;
        la stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_3_0 = null;
        kr stackOut_3_1 = null;
        hd stackOut_3_2 = null;
        la stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this;
            stackOut_0_1 = (kr) (param0);
            stackOut_0_2 = lc.field_g;
            stackOut_0_3 = la.field_h;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_3_2 = stackOut_0_2;
            stackIn_3_3 = stackOut_0_3;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            stackIn_1_2 = stackOut_0_2;
            stackIn_1_3 = stackOut_0_3;
            if (!param2) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackOut_1_1 = (kr) ((Object) stackIn_1_1);
              stackOut_1_2 = (hd) ((Object) stackIn_1_2);
              stackOut_1_3 = (la) ((Object) stackIn_1_3);
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (!param0.field_rc) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = (kr) ((Object) stackIn_2_1);
                stackOut_2_2 = (hd) ((Object) stackIn_2_2);
                stackOut_2_3 = (la) ((Object) stackIn_2_3);
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L0;
              }
            }
          }
          stackOut_3_0 = this;
          stackOut_3_1 = (kr) ((Object) stackIn_3_1);
          stackOut_3_2 = (hd) ((Object) stackIn_3_2);
          stackOut_3_3 = (la) ((Object) stackIn_3_3);
          stackOut_3_4 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
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
              discarded$1 = this.field_f.UnlockRect(var6, 0);
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
