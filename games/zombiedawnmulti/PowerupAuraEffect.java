/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerupAuraEffect extends IntrusiveNode {
    private int field_n;
    private int field_k;
    private int field_h;
    static ClientProtocolStage field_p;
    private int field_j;
    private int field_g;
    private PcmSampleStream field_q;
    private int field_l;
    static IndexedSprite field_o;
    private int field_i;
    static int field_f;
    static int[] field_m;

    final void finishFade(int param0) {
        this.field_j = 0;
        if (param0 == -24421) {
          this.field_k = this.field_i;
          return;
        }
        field_o = (IndexedSprite) null;
        this.field_k = this.field_i;
    }

    final void draw(int param0, Camera param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param1.worldToScreenX(this.field_g, -20126);
          var4 = param1.worldToScreenY(this.field_l, param0 ^ 130);
          this.field_q.setVolume(DropTargetWidget.computeScreenVolume(12, var4, var3_int));
          if (param0 >= ~var3_int &&
            var4 >= -256 &&
            var3_int <= 896 &&
            var4 <= 736) {
            if (this.field_j < 256) {
              stackIn_9_0 = (-this.field_h + 256) * this.field_j >> 10;
            } else {
              stackIn_9_0 = 256 - this.field_h >> 2;
            }
            var5 = stackIn_9_0;
            SoftwareRasterizer.fillCircleAlpha(var3_int, var4, this.field_h, 0, var5);
            RasterEffectHelpers.darkenUnderSpriteAlpha(DialSelectorWidget.field_P, var3_int - 256, -256 + var4, this.field_j);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_13_0 = runtimeException;
          stackIn_13_1 = new StringBuilder().append("pq.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean isWithinRadius(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!param1) {
          var4 = param0 - this.field_g;
          var5 = -this.field_l + param2;
          return 67600 > var4 * var4 + var5 * var5 ? true : false;
        }
        PowerupAuraEffect.releaseStatics((byte) -103);
        var4Lifetime1 = param0 - this.field_g;
        var5Lifetime1 = -this.field_l + param2;
        return 67600 > var4Lifetime1 * var4Lifetime1 + var5Lifetime1 * var5Lifetime1 ? true : false;
    }

    final void setPosition(int param0, int param1, int param2) {
        this.field_l = param0;
        this.field_g = param1;
        if (param2 != 0) {
          this.field_h = 113;
        }
    }

    final static void clearTileAnimations(boolean param0) {
        PasswordValidator.field_x = new FrameCycleAnimation[]{};
        if (param0) {
          field_f = -55;
        }
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        field_m = null;
        field_p = null;
        if (param0 <= 27) {
          field_m = (int[]) null;
        }
    }

    final void advancePulse(int param0) {
        int var2;
        int var2Lifetime1;
        if (this.isFinished(107)) {
          return;
        }
        this.field_h = this.field_h + 7;
        if (this.field_h <= 256) {
          if (this.field_k >= this.field_i) {
            this.field_j = this.field_j - this.field_n;
          } else {
            this.field_k = this.field_k + 1;
            if (this.field_j >= 256) {
              var2 = 2 / ((53 - param0) / 35);
              if (256 < this.field_j) {
                this.field_j = 256;
              }
              if (this.field_j >= 0) {
                return;
              }
              this.field_j = 0;
              return;
            }
            this.field_j = this.field_j + this.field_n;
          }
        } else {
          this.field_h = 0;
          if (this.field_k >= this.field_i) {
            this.field_j = this.field_j - this.field_n;
          } else {
            this.field_k = this.field_k + 1;
            if (this.field_j < 256) {
              this.field_j = this.field_j + this.field_n;
            }
          }
        }
        var2Lifetime1 = 2 / ((53 - param0) / 35);
        if (256 < this.field_j) {
          this.field_j = 256;
        }
        if (this.field_j >= 0) {
          return;
        }
        this.field_j = 0;
    }

    final boolean isFinished(int param0) {
        if (param0 <= 66) {
          this.field_h = 27;
          if (this.field_k < this.field_i) {
            return false;
          }
          if (0 == this.field_j) {
            return true;
          }
          return false;
        }
        if (this.field_k < this.field_i) {
          return false;
        }
        if (0 == this.field_j) {
          return true;
        }
        return false;
    }

    PowerupAuraEffect(int param0, int param1, int param2) {
        this.field_q = null;
        this.field_l = param1;
        this.field_k = 0;
        this.field_n = 3;
        this.field_g = param0;
        this.field_j = 0;
        this.field_h = 0;
        this.field_i = param2;
        this.field_q = Camera.createMixerStream(-128, 17);
    }

    static {
        field_p = new ClientProtocolStage();
        field_m = new int[5];
        field_f = 0;
    }
}
