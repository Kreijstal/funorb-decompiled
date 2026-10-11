/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pia extends nqa implements gf {
    boolean field_g;
    private jagdx.IDirect3DTexture field_f;
    private int field_h;
    boolean field_j;
    private int field_i;

    pia(cta param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param2 * param1);
        int var11 = 0;
        Object stackIn_3_0;
        cta stackIn_3_1;
        ft stackIn_3_2;
        una stackIn_3_3;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        jagdx.PixelBuffer var12;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (cta) (param0);
        stackIn_3_2 = gpa.field_a;
        stackIn_3_3 = una.field_g;
        if (param3) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Sc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (this.field_d.field_Tc) {
          this.field_i = param2;
          this.field_h = param1;
        } else {
          this.field_h = lla.a(false, param1);
          this.field_i = lla.a(false, param2);
        }
        if (param3) {
          this.field_f = this.field_d.field_jd.a(this.field_h, this.field_i, 0, 1024, 21, 1);
        } else {
          this.field_f = this.field_d.field_jd.a(this.field_h, this.field_i, 1, 0, 21, 1);
        }
        var12 = this.field_d.field_Nc;
        var9 = this.field_f.LockRect(0, 0, 0, param1, param2, 0, var12);
        if (jagdx.ah.a(var9, (byte) -117)) {
          if (param6 == 0) {
            param6 = param1;
          }
          var10 = var12.getRowPitch();
          if (4 * param1 == var10 &&
            param6 == param1) {
            var12.a(param4, param5, 0, param2 * param1);
          } else {
            for (var11 = 0; param2 > var11; var11++) {
              var12.a(param4, param5 + var11 * param6, var11 * var10, param1);
            }
          }
          this.field_f.UnlockRect(0);
        }
    }

    public final float a(int param0, float param1) {
        if (param0 <= 60) {
          this.a(-0.6146475672721863f, (byte) -85);
        }
        return param1 / (float)this.field_i;
    }

    public final float a(float param0, byte param1) {
        if (param1 != -33) {
          return -0.45543020963668823f;
        }
        return param0 / (float)this.field_h;
    }

    public final boolean a(int param0) {
        if (param0 != -14634) {
          this.b(22);
          return true;
        }
        return true;
    }

    public final int b(int param0) {
        if (param0 != -7070) {
          this.field_h = -30;
        }
        return this.field_h;
    }

    public final void a(int param0, hs param1) {
        super.a(param0, param1);
    }

    pia(cta param0, ft param1, una param2, int param3, int param4) {
        super(param0, param1, param2, false, param4 * param3);
        if (!this.field_d.field_Tc) {
          this.field_h = lla.a(false, param3);
          this.field_i = lla.a(false, param4);
        } else {
          this.field_h = param3;
          this.field_i = param4;
        }
        this.field_f = this.field_d.field_jd.a(param3, param4, 1, 0, cta.a(this.field_e, -128, this.field_b), 1);
    }

    pia(cta param0, ft param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param2 * param3);
        Object stackIn_3_0;
        cta stackIn_3_1;
        ft stackIn_3_2;
        una stackIn_3_3;
        int stackIn_4_4 = 0;
        int var10;
        int var11;
        int var12;
        jagdx.PixelBuffer var13;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (cta) (param0);
        stackIn_3_2 = (ft) (param1);
        stackIn_3_3 = una.field_g;
        if (param4) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Sc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (!this.field_d.field_Tc) {
          this.field_h = lla.a(false, param2);
          this.field_i = lla.a(false, param3);
        } else {
          this.field_i = param3;
          this.field_h = param2;
        }
        if (param4) {
          this.field_f = this.field_d.field_jd.a(this.field_h, this.field_i, 0, 1024, cta.a(this.field_e, -128, una.field_g), 1);
        } else {
          this.field_f = this.field_d.field_jd.a(this.field_h, this.field_i, 1, 0, cta.a(this.field_e, -128, una.field_g), 1);
        }
        var13 = this.field_d.field_Nc;
        var10 = this.field_f.LockRect(0, 0, 0, param2, param3, 0, var13);
        if (jagdx.ah.a(var10, (byte) -100)) {
          if (param7 == 0) {
            param7 = param2;
          }
          param2 = param2 * this.field_e.field_b;
          param7 = param7 * this.field_e.field_b;
          var11 = var13.getRowPitch();
          if (var11 != param2) {
            for (var12 = 0; var12 < param3; var12++) {
              var13.a(param5, param6 + param7 * var12, var12 * var11, param2);
            }
          } else if (param7 != param2) {
            for (var12 = 0; var12 < param3; var12++) {
              var13.a(param5, param6 + param7 * var12, var12 * var11, param2);
            }
          } else {
            var13.a(param5, param6, 0, param2 * param3);
          }
          this.field_f.UnlockRect(0);
        }
    }

    final jagdx.IDirect3DBaseTexture c(int param0) {
        int var2 = 9 % ((48 - param0) / 45);
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }

    public final int a(byte param0) {
        if (param0 > 0) {
          this.field_h = 121;
        }
        return this.field_i;
    }

    public final void a(byte param0, boolean param1, boolean param2) {
        this.field_j = param2 ? true : false;
        if (param0 > -60) {
          this.field_h = -74;
        }
        this.field_g = param1 ? true : false;
    }

    public final void b(byte param0) {
        this.field_d.a(this, true);
        if (param0 <= 32) {
          this.a((byte) 121, true, false);
        }
    }
}
