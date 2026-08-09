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
        Object stackIn_3_0;
        ir stackIn_3_1;
        iw stackIn_3_2;
        io stackIn_3_3;
        Object stackIn_4_0 = null;
        ir stackIn_4_1 = null;
        iw stackIn_4_2 = null;
        io stackIn_4_3 = null;
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

            stackIn_3_1 = (ir) (param0);

            stackIn_3_2 = nl.field_p;

            stackIn_3_3 = io.field_g;

            if (!param2) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (ir) ((Object) stackIn_3_1);

              stackIn_3_2 = (iw) ((Object) stackIn_3_2);

              stackIn_3_3 = (io) ((Object) stackIn_3_3);

              if (!param0.field_Qc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (ir) ((Object) stackIn_3_1);
                stackIn_4_2 = (iw) ((Object) stackIn_3_2);
                stackIn_4_3 = (io) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (ir) ((Object) stackIn_3_1);
          stackIn_4_2 = (iw) ((Object) stackIn_3_2);
          stackIn_4_3 = (io) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
          break L0;
        }
        L2: {
          this.field_g = param1;
          if (this.field_e) {
            this.field_f = this.field_b.field_Cc.a(this.field_g, 0, 1024, 21, 1);
            break L2;
          } else {
            this.field_f = this.field_b.field_Cc.a(this.field_g, 1, 0, 21, 1);
            break L2;
          }
        }
        var10 = this.field_b.field_Jc;
        var11 = var10;
        var6 = 0;
        L3: while (true) {
          if (6 <= var6) {
            return;
          } else {
            var7 = this.field_f.LockRect(var6, 0, 0, 0, this.field_g, this.field_g, 0, var11);
            if (jagdx.gv.b(var7, -47)) {
              L4: {
                var8 = var11.getRowPitch();
                if (this.field_g * 4 != var8) {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= this.field_g) {
                      break L4;
                    } else {
                      var10.a(param3[var6], var9 * this.field_g, var8 * var9, this.field_g);
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

    final jagdx.IDirect3DBaseTexture d(int param0) {
        if (param0 != -22689) {
            return (jagdx.IDirect3DBaseTexture) null;
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }
}
