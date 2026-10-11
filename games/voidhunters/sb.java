/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends ora implements eb {
    private int field_i;
    private int field_j;
    boolean field_f;
    boolean field_g;
    private jagdx.IDirect3DTexture field_h;

    public final boolean a(int param0) {
        int var2 = 80 % ((-92 - param0) / 34);
        return true;
    }

    public final void a(int param0, int param1, int param2, int param3, int param4, int[] param5, int param6, byte param7) {
        int var12 = 0;
        jagdx.PixelBuffer var9;
        int var10;
        int var11;
        if (param7 >= -78) {
          this.field_j = -127;
        }
        if (this.field_c == qua.field_d &&
          mj.field_f == this.field_a) {
          var9 = this.field_d.field_zc;
          var10 = this.field_h.LockRect(0, param6, param0, param2, param1, 0, var9);
          if (jagdx.hea.b(var10, (byte) 58)) {
            var11 = var9.getRowPitch();
            if (var11 == param2 * 4 &&
              param4 == param2) {
              var9.a(param5, param3, 0, param1 * param2);
            } else {
              for (var12 = 0; param1 > var12; var12++) {
                var9.a(param5, var12 * param4 + param3, var12 * var11, param2);
              }
            }
            this.field_h.UnlockRect(0);
          }
          return;
        }
        throw new RuntimeException();
    }

    public final void a(tu param0, int param1) {
        super.a(param0, param1);
    }

    sb(nla param0, kb param1, int param2, int param3, boolean param4, byte[] param5, int param6, int param7) {
        super(null, null, null, false, param2 * param3);
        int var12 = 0;
        Object stackIn_3_0;
        nla stackIn_3_1;
        kb stackIn_3_2;
        mj stackIn_3_3;
        int stackIn_4_4 = 0;
        int var10;
        int var11;
        jagdx.PixelBuffer var13;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (nla) (param0);
        stackIn_3_2 = (kb) (param1);
        stackIn_3_3 = mj.field_f;
        if (param4) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Zc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (this.field_d.field_Nc) {
          this.field_i = param2;
          this.field_j = param3;
        } else {
          this.field_i = hj.a(param2, (byte) -127);
          this.field_j = hj.a(param3, (byte) -99);
        }
        if (!param4) {
          this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 1, 0, nla.a(this.field_c, mj.field_f, -122), 1);
        } else {
          this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 0, 1024, nla.a(this.field_c, mj.field_f, -95), 1);
        }
        var13 = this.field_d.field_zc;
        var10 = this.field_h.LockRect(0, 0, 0, param2, param3, 0, var13);
        if (jagdx.hea.b(var10, (byte) 100)) {
          if (param7 == 0) {
            param7 = param2;
          }
          param2 = param2 * this.field_c.field_a;
          param7 = param7 * this.field_c.field_a;
          var11 = var13.getRowPitch();
          if (param2 == var11 &&
            param7 == param2) {
            var13.a(param5, param6, 0, param2 * param3);
          } else {
            for (var12 = 0; param3 > var12; var12++) {
              var13.a(param5, param6 + param7 * var12, var12 * var11, param2);
            }
          }
          this.field_h.UnlockRect(0);
        }
    }

    sb(nla param0, kb param1, mj param2, int param3, int param4) {
        super(param0, param1, param2, false, param3 * param4);
        if (this.field_d.field_Nc) {
          this.field_j = param4;
          this.field_i = param3;
        } else {
          this.field_i = hj.a(param3, (byte) -113);
          this.field_j = hj.a(param4, (byte) -97);
        }
        this.field_h = this.field_d.field_Mc.a(param3, param4, 1, 0, nla.a(this.field_c, this.field_a, -122), 1);
    }

    final jagdx.IDirect3DBaseTexture c(int param0) {
        if (param0 != 24971) {
          this.b(-52);
        }
        return (jagdx.IDirect3DBaseTexture) ((Object) this.field_h);
    }

    public final int b(byte param0) {
        if (param0 != 113) {
          this.field_j = -121;
        }
        return this.field_i;
    }

    public final void b(int param0) {
        if (param0 != -27445) {
          this.field_j = -11;
        }
        this.field_d.a(param0 ^ -27467, this);
    }

    public final void a(boolean param0, byte param1, boolean param2) {
        this.field_g = param2 ? true : false;
        if (param1 != -98) {
          this.field_g = true;
        }
        this.field_f = param0 ? true : false;
    }

    public final float b(float param0, int param1) {
        if (param1 < 58) {
          return 1.741902470588684f;
        }
        return param0 / (float)this.field_j;
    }

    public final int a(byte param0) {
        if (param0 > -40) {
          int[] var3 = (int[]) null;
          this.a(15, 27, 32, 18, 4, (int[]) null, -70, (byte) 46);
        }
        return this.field_j;
    }

    sb(nla param0, int param1, int param2, boolean param3, int[] param4, int param5, int param6) {
        super(null, null, null, false, param2 * param1);
        int var11 = 0;
        Object stackIn_3_0;
        nla stackIn_3_1;
        kb stackIn_3_2;
        mj stackIn_3_3;
        int stackIn_4_4 = 0;
        int var9;
        int var10;
        jagdx.PixelBuffer var12;
        Object stackIn_3_0Lifetime1;
        int stackIn_4_4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        stackIn_3_0 = this;
        stackIn_3_1 = (nla) (param0);
        stackIn_3_2 = qua.field_d;
        stackIn_3_3 = mj.field_f;
        if (param3) {
          stackIn_3_0Lifetime1 = this;
          if (param0.field_Zc) {
            stackIn_4_4 = 1;
            decompiledFrameRemainder0 = false;
          }
        }
        if (decompiledFrameRemainder0) {
          stackIn_4_4Lifetime1 = 0;
        }
        if (!this.field_d.field_Nc) {
          this.field_i = hj.a(param1, (byte) -119);
          this.field_j = hj.a(param2, (byte) -97);
        } else {
          this.field_i = param1;
          this.field_j = param2;
        }
        if (!param3) {
          this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 1, 0, 21, 1);
        } else {
          this.field_h = this.field_d.field_Mc.a(this.field_i, this.field_j, 0, 1024, 21, 1);
        }
        var12 = this.field_d.field_zc;
        var9 = this.field_h.LockRect(0, 0, 0, param1, param2, 0, var12);
        if (jagdx.hea.b(var9, (byte) 118)) {
          if (0 == param6) {
            param6 = param1;
          }
          var10 = var12.getRowPitch();
          if (var10 == param1 * 4 &&
            param1 == param6) {
            var12.a(param4, param5, 0, param2 * param1);
          } else {
            for (var11 = 0; var11 < param2; var11++) {
              var12.a(param4, param5 + var11 * param6, var10 * var11, param1);
            }
          }
          this.field_h.UnlockRect(0);
        }
    }

    public final float a(float param0, int param1) {
        if (param1 != -1080) {
          this.a((byte) -126);
        }
        return param0 / (float)this.field_i;
    }
}
