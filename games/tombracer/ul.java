/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends nqa implements na {
    private int field_f;
    private jagdx.IDirect3DCubeTexture field_g;

    public final void b(byte param0) {
        this.field_d.a((byte) 77, (nqa) (this));
        if (param0 <= 32) {
            this.b((byte) -63);
        }
    }

    final jagdx.IDirect3DBaseTexture c(int param0) {
        int var2 = -22 % ((48 - param0) / 45);
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_g);
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
    }

    ul(cta param0, int param1, boolean param2, int[][] param3) {
        super(null, null, null, false, param1 * (param1 * 6));
        Object stackIn_3_0;
        cta stackIn_3_1;
        ft stackIn_3_2;
        una stackIn_3_3;
        Object stackIn_4_0 = null;
        cta stackIn_4_1 = null;
        ft stackIn_4_2 = null;
        una stackIn_4_3 = null;
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

            stackIn_3_1 = (cta) (param0);

            stackIn_3_2 = gpa.field_a;

            stackIn_3_3 = una.field_g;

            if (!param2) {
              break L1;
            } else {
              stackIn_3_0 = this;

              stackIn_3_1 = (cta) ((Object) stackIn_3_1);

              stackIn_3_2 = (ft) ((Object) stackIn_3_2);

              stackIn_3_3 = (una) ((Object) stackIn_3_3);

              if (!param0.field_nd) {
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = (cta) ((Object) stackIn_3_1);
                stackIn_4_2 = (ft) ((Object) stackIn_3_2);
                stackIn_4_3 = (una) ((Object) stackIn_3_3);
                stackIn_4_4 = 1;
                break L0;
              }
            }
          }
          stackIn_4_0 = this;
          stackIn_4_1 = (cta) ((Object) stackIn_3_1);
          stackIn_4_2 = (ft) ((Object) stackIn_3_2);
          stackIn_4_3 = (una) ((Object) stackIn_3_3);
          stackIn_4_4 = 0;
          break L0;
        }
        L2: {
          this.field_f = param1;
          if (this.field_c) {
            this.field_g = this.field_d.field_jd.a(this.field_f, 0, 1024, 21, 1);
            break L2;
          } else {
            this.field_g = this.field_d.field_jd.a(this.field_f, 1, 0, 21, 1);
            break L2;
          }
        }
        var10 = this.field_d.field_Nc;
        var11 = var10;
        var6 = 0;
        L3: while (true) {
          if ((var6 ^ -1) <= -7) {
            return;
          } else {
            var7 = this.field_g.LockRect(var6, 0, 0, 0, this.field_f, this.field_f, 0, var11);
            if (jagdx.ah.a(var7, (byte) 112)) {
              L4: {
                var8 = var11.getRowPitch();
                if (var8 == 4 * this.field_f) {
                  var10.a(param3[var6], 0, 0, this.field_f * this.field_f);
                  break L4;
                } else {
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= this.field_f) {
                      break L4;
                    } else {
                      var10.a(param3[var6], var9 * this.field_f, var9 * var8, this.field_f);
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
}
