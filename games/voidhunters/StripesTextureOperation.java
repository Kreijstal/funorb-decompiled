/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StripesTextureOperation extends TextureOperation {
    private int direction;
    static String field_n;
    private int[] stripeEnds;
    private int[] stripeStarts;
    private int stripeCount;
    private int dutyCycle;

    final int[] getMonochromeRow(int param0, boolean param1) {
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        int var5Lifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var10 = VoidHunters.field_G;
        var13 = this.field_f.getRow((byte) 121, param0);
        var12 = var13;
        var3 = var12;
        if (this.field_f.field_e) {
          var4 = SetSalvoUsesAllEnergy.textureYCoordinates[param0];
          if (this.direction == 0) {
            var5 = 0;
            var6 = 0;
            scanLoop1: while (true) {
              if (var6 < this.stripeCount) {
                if (var4 >= this.stripeStarts[var6] &&
                  var4 < this.stripeStarts[1 + var6]) {
                  if (var4 >= this.stripeEnds[var6]) {
                    break scanLoop1;
                  }
                  var5 = 4096;
                  break scanLoop1;
                }
                var6++;
                continue;
              }
              break;
            }
            ArrayOperations.fill(var13, 0, TextHotspotRegion.textureWidth, var5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var5Lifetime1 = 0;
            while (!(TextHotspotRegion.textureWidth <= var5Lifetime1)) {
              var6Lifetime1 = 0;
              var7 = 0;
              var8 = BoxBlurTextureOperation.textureXCoordinates[var5Lifetime1];
              var9 = this.direction;
              stackIn_19_0 = var9;
              stackIn_19_1 = 1;
              if (stackIn_19_0 != stackIn_19_1) {
                if (2 != var9) {
                  if (var9 == 3) {
                    var6Lifetime1 = 2048 + (-var4 + var8 >> 1);
                  }
                } else {
                  var6Lifetime1 = 2048 + (var8 - (4096 - var4) >> 1);
                }
              } else {
                var6Lifetime1 = var8;
              }
              var11 = 0;
              var9Lifetime1 = var11;
              scanLoop2: while (true) {
                if (var11 < this.stripeCount) {
                  if (var6Lifetime1 >= this.stripeStarts[var11] &&
                    this.stripeStarts[var11 + 1] > var6Lifetime1) {
                    if (this.stripeEnds[var11] <= var6Lifetime1) {
                      break scanLoop2;
                    }
                    var7 = 4096;
                    break scanLoop2;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var13 = var12;
              var13[var5Lifetime1] = var7;
              var5Lifetime1++;
            }
          }
        }
        if (!param1) {
          return (int[]) null;
        }
        return var3;
    }

    private final void initializeStripeIntervals(int param0) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = 0;
        this.stripeStarts = new int[1 + this.stripeCount];
        if (param0 > -51) {
          return;
        }
        this.stripeEnds = new int[this.stripeCount + 1];
        int var3 = 4096 / this.stripeCount;
        int var4 = this.dutyCycle * var3 >> 12;
        for (var5 = 0; var5 < this.stripeCount; var5++) {
          this.stripeStarts[var5] = var2;
          this.stripeEnds[var5] = var2 + var4;
          var2 = var2 + var3;
        }
        this.stripeStarts[this.stripeCount] = 4096;
        this.stripeEnds[this.stripeCount] = this.stripeEnds[0] + 4096;
    }

    public static void clearSharedReferences(int param0) {
        field_n = null;
        if (param0 != -120) {
          field_n = (String) null;
        }
    }

    final void decodeParameter(int param0, int param1, PacketBuffer param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        PacketBuffer var6 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int == 0) {
            this.stripeCount = param2.readUnsignedByte((byte) -121);
          } else {
            if (var4_int != 1) {
              if (2 == var4_int) {
                this.direction = param2.readUnsignedByte((byte) -103);
              }
            } else {
              this.dutyCycle = param2.readUnsignedShort(1869);
            }
          }
          if (param1 > -60) {
            var6 = (PacketBuffer) null;
            this.decodeParameter(61, -61, (PacketBuffer) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("moa.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public StripesTextureOperation() {
        super(0, true);
        this.direction = 0;
        this.dutyCycle = 2048;
        this.stripeCount = 10;
    }

    final static void a(boolean param0) {
        int var1 = (GetShieldsDirectionalArcParticleLife.field_p - 640) / 2;
        int var2 = GetRepairModePower.field_o * GetRepairModePower.field_o;
        if (!param0) {
          field_n = (String) null;
        }
        int var3 = var2 - SoftwareTransform3D.field_b * SoftwareTransform3D.field_b;
        SocialPanelState.socialPanelRoot.setBounds(var1 - var3 * 199 / var2, 32, 199, 90, -124 + SoftwareRasterizer2D.height - 90);
        ModelFaceAttachment.field_d.setBounds(438 * var3 / var2 + (var1 + 202), -126, 438, 0, -4 + (-120 + SoftwareRasterizer2D.height));
    }

    final void postDecode(byte param0) {
        if (param0 > -35) {
          return;
        }
        this.initializeStripeIntervals(-64);
    }

    static {
        field_n = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
