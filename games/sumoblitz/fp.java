/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends fj implements ef {
    private jagdx.IDirect3DCubeTexture field_f;
    private int field_g;

    public final void a(int param0) {
        if (param0 != 8905) {
            jagdx.IDirect3DBaseTexture discarded$0 = ((fp) this).d(-55);
        }
        ((fp) this).field_b.a((fj) this, 1);
    }

    public final void a(ji param0, int param1) {
        super.a(param0, param1 ^ 0);
        if (param1 != 15149) {
            jagdx.IDirect3DBaseTexture discarded$0 = ((fp) this).d(20);
        }
    }

    fp(ir param0, int param1, boolean param2, int[][] param3) {
        super(param0, nl.field_p, io.field_g, false, param1 * param1 * 6);
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jagdx.PixelBuffer var10 = null;
        jagdx.PixelBuffer var11 = null;
        Object stackIn_1_0 = null;
        ir stackIn_1_1 = null;
        iw stackIn_1_2 = null;
        io stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        ir stackIn_2_1 = null;
        iw stackIn_2_2 = null;
        io stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        ir stackIn_3_1 = null;
        iw stackIn_3_2 = null;
        io stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        ir stackIn_4_1 = null;
        iw stackIn_4_2 = null;
        io stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_0_0 = null;
        ir stackOut_0_1 = null;
        iw stackOut_0_2 = null;
        io stackOut_0_3 = null;
        Object stackOut_1_0 = null;
        ir stackOut_1_1 = null;
        iw stackOut_1_2 = null;
        io stackOut_1_3 = null;
        Object stackOut_2_0 = null;
        ir stackOut_2_1 = null;
        iw stackOut_2_2 = null;
        io stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_3_0 = null;
        ir stackOut_3_1 = null;
        iw stackOut_3_2 = null;
        io stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this;
            stackOut_0_1 = (ir) param0;
            stackOut_0_2 = nl.field_p;
            stackOut_0_3 = io.field_g;
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
              stackOut_1_1 = (ir) (Object) stackIn_1_1;
              stackOut_1_2 = (iw) (Object) stackIn_1_2;
              stackOut_1_3 = (io) (Object) stackIn_1_3;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (!param0.field_Qc) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = (ir) (Object) stackIn_2_1;
                stackOut_2_2 = (iw) (Object) stackIn_2_2;
                stackOut_2_3 = (io) (Object) stackIn_2_3;
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
          stackOut_3_1 = (ir) (Object) stackIn_3_1;
          stackOut_3_2 = (iw) (Object) stackIn_3_2;
          stackOut_3_3 = (io) (Object) stackIn_3_3;
          stackOut_3_4 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          break L0;
        }
        L2: {
          ((fp) this).field_g = param1;
          if (((fp) this).field_e) {
            ((fp) this).field_f = ((fp) this).field_b.field_Cc.a(((fp) this).field_g, 0, 1024, 21, 1);
            break L2;
          } else {
            ((fp) this).field_f = ((fp) this).field_b.field_Cc.a(((fp) this).field_g, 1, 0, 21, 1);
            break L2;
          }
        }
        var10 = ((fp) this).field_b.field_Jc;
        var11 = var10;
        var6 = 0;
        L3: while (true) {
          if (6 <= var6) {
          } else {
            var7 = ((fp) this).field_f.LockRect(var6, 0, 0, 0, ((fp) this).field_g, ((fp) this).field_g, 0, var11);
            if (jagdx.gv.b(var7, -47)) {
              L4: {
                var8 = var11.getRowPitch();
                if (((fp) this).field_g * 4 != var8) {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= ((fp) this).field_g) {
                      break L4;
                    } else {
                      var10.a(param3[var6], var9 * ((fp) this).field_g, var8 * var9, ((fp) this).field_g);
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  var10.a(param3[var6], 0, 0, ((fp) this).field_g * ((fp) this).field_g);
                  break L4;
                }
              }
              boolean discarded$1 = ((fp) this).field_f.UnlockRect(var6, 0);
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
            return null;
        }
        return (jagdx.IDirect3DBaseTexture) (Object) ((fp) this).field_f;
    }
}
