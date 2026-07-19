/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends ora implements hdb {
    private jagdx.IDirect3DCubeTexture field_g;
    private int field_f;

    final jagdx.IDirect3DBaseTexture c(int param0) {
        if (param0 != 24971) {
            this.b(102);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_g);
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    jf(nla param0, int param1, boolean param2, int[][] param3) {
        super(param0, qua.field_d, mj.field_f, false, param1 * (param1 * 6));
        boolean discarded$1 = false;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        jagdx.PixelBuffer var10 = null;
        jagdx.PixelBuffer var11 = null;
        Object stackIn_1_0 = null;
        nla stackIn_1_1 = null;
        kb stackIn_1_2 = null;
        mj stackIn_1_3 = null;
        Object stackIn_2_0 = null;
        nla stackIn_2_1 = null;
        kb stackIn_2_2 = null;
        mj stackIn_2_3 = null;
        Object stackIn_3_0 = null;
        nla stackIn_3_1 = null;
        kb stackIn_3_2 = null;
        mj stackIn_3_3 = null;
        Object stackIn_4_0 = null;
        nla stackIn_4_1 = null;
        kb stackIn_4_2 = null;
        mj stackIn_4_3 = null;
        int stackIn_4_4 = 0;
        Object stackOut_0_0 = null;
        nla stackOut_0_1 = null;
        kb stackOut_0_2 = null;
        mj stackOut_0_3 = null;
        Object stackOut_1_0 = null;
        nla stackOut_1_1 = null;
        kb stackOut_1_2 = null;
        mj stackOut_1_3 = null;
        Object stackOut_2_0 = null;
        nla stackOut_2_1 = null;
        kb stackOut_2_2 = null;
        mj stackOut_2_3 = null;
        int stackOut_2_4 = 0;
        Object stackOut_3_0 = null;
        nla stackOut_3_1 = null;
        kb stackOut_3_2 = null;
        mj stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          L1: {
            stackOut_0_0 = this;
            stackOut_0_1 = (nla) (param0);
            stackOut_0_2 = qua.field_d;
            stackOut_0_3 = mj.field_f;
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
              stackOut_1_1 = (nla) ((Object) stackIn_1_1);
              stackOut_1_2 = (kb) ((Object) stackIn_1_2);
              stackOut_1_3 = (mj) ((Object) stackIn_1_3);
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (!param0.field_Jc) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = (nla) ((Object) stackIn_2_1);
                stackOut_2_2 = (kb) ((Object) stackIn_2_2);
                stackOut_2_3 = (mj) ((Object) stackIn_2_3);
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
          stackOut_3_1 = (nla) ((Object) stackIn_3_1);
          stackOut_3_2 = (kb) ((Object) stackIn_3_2);
          stackOut_3_3 = (mj) ((Object) stackIn_3_3);
          stackOut_3_4 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          break L0;
        }
        L2: {
          this.field_f = param1;
          if (this.field_b) {
            this.field_g = this.field_d.field_Mc.a(this.field_f, 0, 1024, 21, 1);
            break L2;
          } else {
            this.field_g = this.field_d.field_Mc.a(this.field_f, 1, 0, 21, 1);
            break L2;
          }
        }
        var10 = this.field_d.field_zc;
        var11 = var10;
        var6 = 0;
        L3: while (true) {
          if (var6 >= 6) {
            return;
          } else {
            var7 = this.field_g.LockRect(var6, 0, 0, 0, this.field_f, this.field_f, 0, var11);
            if (jagdx.hea.b(var7, (byte) 114)) {
              L4: {
                var8 = var11.getRowPitch();
                if (this.field_f * 4 == var8) {
                  var10.a(param3[var6], 0, 0, this.field_f * this.field_f);
                  break L4;
                } else {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= this.field_f) {
                      break L4;
                    } else {
                      var10.a(param3[var6], this.field_f * var9, var8 * var9, this.field_f);
                      var9++;
                      continue L5;
                    }
                  }
                }
              }
              discarded$1 = this.field_g.UnlockRect(var6, 0);
              var6++;
              continue L3;
            } else {
              var6++;
              continue L3;
            }
          }
        }
    }

    public final void b(int param0) {
        if (param0 != -27445) {
            return;
        }
        this.field_d.a(56, (ora) (this));
    }
}
