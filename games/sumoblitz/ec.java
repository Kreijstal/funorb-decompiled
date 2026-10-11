/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends fj implements ru {
    boolean field_h;
    private int field_i;
    private int field_j;
    private jagdx.IDirect3DTexture field_f;
    boolean field_g;

    public final int a(byte param0) {
        int var2 = 10 / ((-39 - param0) / 40);
        return this.field_i;
    }

    ec(ir param0, iw param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param3 * param2);
        int var12 = 0;
        Object stackIn_3_0;
        ir stackIn_3_1;
        iw stackIn_3_2;
        io stackIn_3_3;
        int stackIn_4_4 = 0;
        int var10;
        int var11;
        jagdx.PixelBuffer var13;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (ir) (param0);
        stackIn_3_2 = (iw) (param1);
        stackIn_3_3 = io.field_g;
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
        if (!this.field_b.field_Oc) {
          this.field_j = hn.a(false, param2);
          this.field_i = hn.a(false, param3);
        } else {
          this.field_j = param2;
          this.field_i = param3;
        }
        if (param4) {
          this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 0, 1024, ir.a(this.field_d, 126, io.field_g), 1);
        } else {
          this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 1, 0, ir.a(this.field_d, -88, io.field_g), 1);
        }
        var13 = this.field_b.field_Jc;
        var10 = this.field_f.LockRect(0, 0, 0, param2, param3, 0, var13);
        if (jagdx.gv.b(var10, -111)) {
          if (param7 == 0) {
            param7 = param2;
          }
          param7 = param7 * this.field_d.field_c;
          param2 = param2 * this.field_d.field_c;
          var11 = var13.getRowPitch();
          if (var11 == param2 &&
            param2 == param7) {
            var13.a(param5, param6, 0, param3 * param2);
          } else {
            for (var12 = 0; param3 > var12; var12++) {
              var13.a(param5, var12 * param7 + param6, var11 * var12, param2);
            }
          }
          this.field_f.UnlockRect(0);
        }
    }

    public final void a(boolean param0, boolean param1, boolean param2) {
        this.field_g = param1 ? true : false;
        this.field_h = param0 ? true : false;
        if (!param2) {
          this.field_g = true;
        }
    }

    ec(ir param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param1 * param2);
        Object stackIn_3_0;
        ir stackIn_3_1;
        iw stackIn_3_2;
        io stackIn_3_3;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        int var11;
        jagdx.PixelBuffer var12;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (ir) (param0);
        stackIn_3_2 = nl.field_p;
        stackIn_3_3 = io.field_g;
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
        if (!this.field_b.field_Oc) {
          this.field_j = hn.a(false, param1);
          this.field_i = hn.a(false, param2);
        } else {
          this.field_j = param1;
          this.field_i = param2;
        }
        if (!param3) {
          this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 1, 0, 21, 1);
        } else {
          this.field_f = this.field_b.field_Cc.a(this.field_j, this.field_i, 0, 1024, 21, 1);
        }
        var12 = this.field_b.field_Jc;
        var9 = this.field_f.LockRect(0, 0, 0, param1, param2, 0, var12);
        if (jagdx.gv.b(var9, -45)) {
          if (param6 == 0) {
            param6 = param1;
          }
          var10 = var12.getRowPitch();
          if (var10 != param1 * 4) {
            for (var11 = 0; var11 < param2; var11++) {
              var12.a(param4, param5 + param6 * var11, var10 * var11, param1);
            }
          } else if (param6 != param1) {
            for (var11 = 0; var11 < param2; var11++) {
              var12.a(param4, param5 + param6 * var11, var10 * var11, param1);
            }
          } else {
            var12.a(param4, param5, 0, param2 * param1);
          }
          this.field_f.UnlockRect(0);
        }
    }

    public final boolean c(int param0) {
        if (param0 != -24722) {
          return true;
        }
        return true;
    }

    public final void a(ji param0, int param1) {
        super.a(param0, param1);
    }

    public final int b(int param0) {
        if (param0 != -16625) {
          this.b(-1.7616260051727295f, 87);
        }
        return this.field_j;
    }

    ec(ir param0, iw param1, io param2, int param3, int param4) {
        super(param0, param1, param2, false, param4 * param3);
        if (!this.field_b.field_Oc) {
          this.field_j = hn.a(false, param3);
          this.field_i = hn.a(false, param4);
        } else {
          this.field_j = param3;
          this.field_i = param4;
        }
        this.field_f = this.field_b.field_Cc.a(param3, param4, 1, 0, ir.a(this.field_d, -120, this.field_c), 1);
    }

    public final void a(int param0) {
        if (param0 != 8905) {
          return;
        }
        this.field_b.a(param0 ^ 8904, this);
    }

    public final float a(float param0, int param1) {
        if (param1 > -10) {
          return 0.4205271005630493f;
        }
        return param0 / (float)this.field_j;
    }

    final jagdx.IDirect3DBaseTexture d(int param0) {
        if (param0 != -22689) {
          return (jagdx.IDirect3DBaseTexture) null;
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_f);
    }

    public final float b(float param0, int param1) {
        if (param1 != -19230) {
          ji var4 = (ji) null;
          this.a((ji) null, 47);
        }
        return param0 / (float)this.field_i;
    }
}
