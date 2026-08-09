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
        super(null, null, null, false, param1 * (param1 * 6));
        Object stackIn_3_0;
        nla stackIn_3_1;
        kb stackIn_3_2;
        mj stackIn_3_3;
        Object stackIn_4_0 = null;
        nla stackIn_4_1 = null;
        kb stackIn_4_2 = null;
        mj stackIn_4_3 = null;
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

            stackIn_3_1 = (nla) (param0);

            stackIn_3_2 = qua.field_d;

            stackIn_3_3 = mj.field_f;

            if (!param2) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (nla) ((Object) stackIn_3_1);

              stackIn_3_2 = (kb) ((Object) stackIn_3_2);

              stackIn_3_3 = (mj) ((Object) stackIn_3_3);

              if (!param0.field_Jc) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (nla) ((Object) stackIn_3_1);
                stackIn_4_2 = (kb) ((Object) stackIn_3_2);
                stackIn_4_3 = (mj) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (nla) ((Object) stackIn_3_1);
          stackIn_4_2 = (kb) ((Object) stackIn_3_2);
          stackIn_4_3 = (mj) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
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
              this.field_g.UnlockRect(var6, 0);
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
