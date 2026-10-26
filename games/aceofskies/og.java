/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ib implements qi {
    boolean field_g;
    private int field_h;
    boolean field_j;
    private int field_f;
    private jagdx.IDirect3DTexture field_i;

    public final void a(ke param0, int param1) {
        super.a(param0, param1);
    }

    public final void a(byte param0) {
        this.field_c.a(this, 87);
        if (param0 != -50) {
          this.b((byte) -21);
        }
    }

    og(kr param0, hd param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param2 * param3);
        boolean decompiledFrameRemainder0 = true;
        Object stackIn_3_0 = this;
        kr stackIn_3_1 = (kr) (param0);
        hd stackIn_3_2 = (hd) (param1);
        la stackIn_3_3 = la.field_h;
        if (param4) {
          Object stackIn_3_0Lifetime1 = this;
          if (param0.field_Gc) {
            int stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          int stackIn_4_4Lifetime1 = 0;
        }
        if (!this.field_c.field_Dc) {
          this.field_f = fk.a(param2, 63);
          this.field_h = fk.a(param3, 69);
        } else {
          this.field_h = param3;
          this.field_f = param2;
        }
        if (!param4) {
          this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 1, 0, kr.a(this.field_e, la.field_h, false), 1);
        } else {
          this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 0, 1024, kr.a(this.field_e, la.field_h, false), 1);
        }
        jagdx.PixelBuffer var13 = this.field_c.field_Ec;
        int var10 = this.field_i.LockRect(0, 0, 0, param2, param3, 0, var13);
        if (jagdx.gf.a((byte) 111, var10)) {
          if (param7 == 0) {
            param7 = param2;
          }
          param2 = param2 * this.field_e.field_b;
          param7 = param7 * this.field_e.field_b;
          int var11 = var13.getRowPitch();
          if (var11 != param2) {
            for (int var12 = 0; param3 > var12; var12++) {
              var13.a(param5, param6 + param7 * var12, var11 * var12, param2);
            }
            this.field_i.UnlockRect(0);
            return;
          }
          if (param2 != param7) {
            for (int var12Lifetime1 = 0; param3 > var12Lifetime1; var12Lifetime1++) {
              var13.a(param5, param6 + param7 * var12Lifetime1, var11 * var12Lifetime1, param2);
            }
            this.field_i.UnlockRect(0);
            return;
          }
          var13.a(param5, param6, 0, param2 * param3);
          this.field_i.UnlockRect(0);
        }
    }

    public final boolean c(byte param0) {
        if (param0 > -104) {
          return false;
        }
        return true;
    }

    public final int a(int param0) {
        if (param0 < 56) {
          return -84;
        }
        return this.field_f;
    }

    public final int b(byte param0) {
        if (param0 < 2) {
          return -101;
        }
        return this.field_h;
    }

    final jagdx.IDirect3DBaseTexture b(int param0) {
        if (param0 < 87) {
          this.field_j = false;
          return (jagdx.IDirect3DBaseTexture) ((Object) this.field_i);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_i);
    }

    public final float a(float param0, byte param1) {
        if (param1 == -32) {
          return param0 / (float)this.field_h;
        }
        this.field_i = (jagdx.IDirect3DTexture) null;
        return param0 / (float)this.field_h;
    }

    public final float a(int param0, float param1) {
        if (param0 < 65) {
          this.field_g = true;
          return param1 / (float)this.field_f;
        }
        return param1 / (float)this.field_f;
    }

    og(kr param0, hd param1, la param2, int param3, int param4) {
        super(param0, param1, param2, false, param3 * param4);
        if (!this.field_c.field_Dc) {
          this.field_f = fk.a(param3, 118);
          this.field_h = fk.a(param4, 61);
        } else {
          this.field_f = param3;
          this.field_h = param4;
        }
        this.field_i = this.field_c.field_Rc.a(param3, param4, 1, 0, kr.a(this.field_e, this.field_d, false), 1);
    }

    og(kr param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param1 * param2);
        boolean decompiledFrameRemainder0 = true;
        Object stackIn_3_0 = this;
        kr stackIn_3_1 = (kr) (param0);
        hd stackIn_3_2 = lc.field_g;
        la stackIn_3_3 = la.field_h;
        if (param3) {
          Object stackIn_3_0Lifetime1 = this;
          if (param0.field_Gc) {
            int stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          int stackIn_4_4Lifetime1 = 0;
        }
        if (this.field_c.field_Dc) {
          this.field_f = param1;
          this.field_h = param2;
        } else {
          this.field_f = fk.a(param1, 91);
          this.field_h = fk.a(param2, 22);
        }
        if (!param3) {
          this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 1, 0, 21, 1);
        } else {
          this.field_i = this.field_c.field_Rc.a(this.field_f, this.field_h, 0, 1024, 21, 1);
        }
        jagdx.PixelBuffer var12 = this.field_c.field_Ec;
        int var9 = this.field_i.LockRect(0, 0, 0, param1, param2, 0, var12);
        if (!jagdx.gf.a((byte) 104, var9)) {
          return;
        }
        if (0 == param6) {
          param6 = param1;
        }
        int var10 = var12.getRowPitch();
        if (4 * param1 != var10) {
          for (int var11 = 0; param2 > var11; var11++) {
            var12.a(param4, param6 * var11 + param5, var10 * var11, param1);
          }
          this.field_i.UnlockRect(0);
          return;
        }
        if (param1 == param6) {
          var12.a(param4, param5, 0, param2 * param1);
          this.field_i.UnlockRect(0);
          return;
        }
        for (int var11Lifetime1 = 0; param2 > var11Lifetime1; var11Lifetime1++) {
          var12.a(param4, param6 * var11Lifetime1 + param5, var10 * var11Lifetime1, param1);
        }
        this.field_i.UnlockRect(0);
        return;
    }

    public final void a(boolean param0, boolean param1, byte param2) {
        this.field_g = param0 ? true : false;
        if (param2 == -127) {
          this.field_j = param1 ? true : false;
          return;
        }
        this.c((byte) -41);
        this.field_j = param1 ? true : false;
    }
}
