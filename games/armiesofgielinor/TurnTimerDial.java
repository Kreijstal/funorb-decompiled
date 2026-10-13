/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TurnTimerDial {
    private int cycleLength;
    static wj field_a;
    int sweepPosition;
    static String field_b;
    private int[] pixelThresholds;
    static String field_g;
    private boolean useSweepMask;
    static int previousOpcode;
    static int field_d;

    final void draw(int screenY, int screenX, byte obfuscationGuard) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var11;
        int var12;
        int var13;
        int var14;
        int var8;
        int var9;
        int var10;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.useSweepMask) {
          vg.field_q[0].g(screenX, screenY);
        } else {
          var4 = 0;
          var5 = SoftwareRaster.width * screenY + screenX;
          var6 = SoftwareRaster.width - CampaignProgress.field_b;
          var12 = 0;
          while (ac.field_m > var12) {
            var13 = 0;
            while (var13 < CampaignProgress.field_b) {
              var7 = vg.field_q[0].pixels[var4];
              var11 = var7 >>> 24;
              if (0 != var11) {
                if (var11 >= 255) {
                  if (this.pixelThresholds[var4] <= this.sweepPosition) {
                    var7 = vg.field_q[1].pixels[var4];
                  }
                  SoftwareRaster.pixels[var5] = var7;
                } else {
                  if (this.sweepPosition >= this.pixelThresholds[var4]) {
                    var7 = vg.field_q[1].pixels[var4];
                    var11 = var7 >>> 24;
                  }
                  var8 = 16711935 & var7;
                  var9 = var7 & 65280;
                  var7 = 256 - var11;
                  var8 = var8 * var7;
                  var9 = var9 * var7;
                  var7 = SoftwareRaster.pixels[var5];
                  var10 = var7 & 16711935;
                  var10 = var10 * var11;
                  var9 = var9 + var9;
                  var8 = var8 + var10;
                  var8 = var8 & -16711936;
                  var9 = var9 & 16711680;
                  SoftwareRaster.pixels[var5] = AccountRegistrationDialog.bitwiseOr(var9, var8) >>> 8;
                }
              }
              var4++;
              var13++;
              var5++;
            }
            var12++;
            var5 = var5 + var6;
          }
        }
        DeployEvent.field_z.b(384, 2464, screenX + (CampaignProgress.field_b >> 1) << 4, screenY + (ac.field_m >> 1) << 4, this.sweepPosition * 65535 / this.cycleLength, 1024);
        if (obfuscationGuard == 121) {
          return;
        }
        this.advanceSweep(false, -122, (byte) -12);
    }

    final void advanceSweep(boolean useMaskAfterWrap, int targetPosition, byte obfuscationGuard) {
        int distanceToTarget = 0;
        int maximumStep = 0;
        if (targetPosition < 0) {
          this.sweepPosition = 0;
          this.useSweepMask = true;
          return;
        }
        if (targetPosition > this.sweepPosition) {
          targetPosition = targetPosition - this.cycleLength;
        }
        int guardArithmetic = 23 % ((obfuscationGuard - 82) / 42);
        if (this.sweepPosition > targetPosition) {
          distanceToTarget = -targetPosition + this.sweepPosition;
          maximumStep = DualNodeHashTable.getNominalTickRate(-84) * 2;
          this.sweepPosition = this.sweepPosition - (maximumStep <= distanceToTarget ? maximumStep : distanceToTarget);
        }
        if (0 > this.sweepPosition) {
          this.useSweepMask = useMaskAfterWrap ? true : false;
          this.sweepPosition = this.sweepPosition + this.cycleLength;
        }
    }

    final static int readTieredSignedBits(int unusedTier3HalfRange, int tier2HalfRange, byte obfuscationGuard, int tier3Bits, int tier2Bits, int tier1HalfRange, int tier0HalfRange, int tier1Bits, int tier0Bits, CipherPacketBuffer packet) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          var10_int = 111 / ((25 - obfuscationGuard) / 56);
          var10_intLifetime1 = packet.readBits(-108, 2);
          if (0 == var10_intLifetime1) {
            if (tier0Bits == 0) {
              stackIn_4_0 = 0;
            } else {
              stackIn_4_0 = UnitSpell.readSignedBits(packet, tier0Bits, 1);
            }
            return stackIn_4_0;
          }
          if (1 == var10_intLifetime1) {
            if (0 != tier1Bits) {
              stackIn_9_0 = UnitSpell.readSignedBits(packet, tier1Bits, 1);
            } else {
              stackIn_9_0 = 0;
            }
            var11 = stackIn_9_0;
            var12 = tier0HalfRange;
            if (var11 >= 0) {
              stackIn_12_0 = var11 + var12;
            } else {
              stackIn_12_0 = -var12 + var11;
            }
            return stackIn_12_0;
          }
          if (var10_intLifetime1 == 2) {
            if (tier2Bits != 0) {
              stackIn_26_0 = UnitSpell.readSignedBits(packet, tier2Bits, 1);
            } else {
              stackIn_26_0 = 0;
            }
            var11Lifetime1 = stackIn_26_0;
            var12Lifetime1 = tier1HalfRange + tier0HalfRange;
            if (0 > var11Lifetime1) {
              stackIn_29_0 = var11Lifetime1 - var12Lifetime1;
            } else {
              stackIn_29_0 = var12Lifetime1 + var11Lifetime1;
            }
            return stackIn_29_0;
          }
          if (3 != var10_intLifetime1) {
            throw new IllegalStateException();
          }
          if (0 == tier3Bits) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = UnitSpell.readSignedBits(packet, tier3Bits, 1);
          }
          var11Lifetime2 = stackIn_18_0;
          var12Lifetime2 = tier1HalfRange + tier2HalfRange + tier0HalfRange;
          if (var11Lifetime2 < 0) {
            stackIn_21_0 = -var12Lifetime2 + var11Lifetime2;
          } else {
            stackIn_21_0 = var11Lifetime2 + var12Lifetime2;
          }
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_32_0 = var10;
          stackIn_32_1 = new StringBuilder().append("sj.D(").append(unusedTier3HalfRange).append(',').append(tier2HalfRange).append(',').append(obfuscationGuard).append(',').append(tier3Bits).append(',').append(tier2Bits).append(',').append(tier1HalfRange).append(',').append(tier0HalfRange).append(',').append(tier1Bits).append(',').append(tier0Bits).append(',');
          if (packet == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(int param0, SoundCache param1) {
        int var3 = 0;
        PcmSample[] array$0 = null;
        int var4 = 0;
        PcmSample var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          wh.field_f = false;
          LinkButtonPainter.field_d = new PcmSample[ProgressDialog.field_W.length][];
          int var2_int = 93 / ((27 - param0) / 62);
          for (var3 = 0; ProgressDialog.field_W.length > var3; var3++) {
            array$0 = new PcmSample[ProgressDialog.field_W[var3].length];
            LinkButtonPainter.field_d[var3] = array$0;
            for (var4 = 0; ProgressDialog.field_W[var3].length > var4; var4++) {
              var5 = param1.getSoundEffectByName(ProgressDialog.field_W[var3][var4], (byte) -97, "");
              if (var5 == null) {
                var5 = param1.getMusicSampleByName((byte) -127, "", ProgressDialog.field_W[var3][var4]);
              }
              if (var5 != null) {
              }
              LinkButtonPainter.field_d[var3][var4] = var5;
            }
          }
          ke.a((byte) 90, param1);
          wh.field_f = true;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "sj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        if (param0 > -17) {
          field_b = (String) null;
        }
    }

    TurnTimerDial(int cycleLength) {
        int pixelIndex = 0;
        int minimumThreshold;
        int maximumThreshold;
        int pixelXFromCenter;
        int pixelYFromCenter;
        int threshold;
        this.useSweepMask = false;
        this.cycleLength = cycleLength;
        minimumThreshold = 2147483647;
        this.pixelThresholds = new int[ac.field_m * CampaignProgress.field_b];
        maximumThreshold = -2147483648;
        for (pixelIndex = 0; ac.field_m * CampaignProgress.field_b > pixelIndex; pixelIndex++) {
          pixelXFromCenter = pixelIndex % CampaignProgress.field_b - (CampaignProgress.field_b >> 1);
          pixelYFromCenter = -(ac.field_m >> 1) + pixelIndex / CampaignProgress.field_b;
          threshold = (this.cycleLength - (int)(Math.atan2((double)(-pixelXFromCenter), (double)pixelYFromCenter) * (double)this.cycleLength / 3.141592653589793)) / 2;
          if (maximumThreshold < threshold) {
            maximumThreshold = threshold;
          }
          this.pixelThresholds[pixelIndex] = threshold;
          if (threshold < minimumThreshold) {
            minimumThreshold = threshold;
          }
        }
    }

    static {
        field_g = "You can only use equipment on your turn.";
        field_a = null;
        previousOpcode = -1;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int readTieredSignedBits(int unusedTier3HalfRange, int tier2HalfRange, int obfuscationGuard, int tier3Bits, int tier2Bits, int tier1HalfRange, int tier0HalfRange, int tier1Bits, int tier0Bits, CipherPacketBuffer packet) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          var10_int = 111 / ((25 - obfuscationGuard) / 56);
          var10_intLifetime1 = packet.readBits(-108, 2);
          if (0 == var10_intLifetime1) {
            if (tier0Bits == 0) {
              stackIn_4_0 = 0;
            } else {
              stackIn_4_0 = UnitSpell.readSignedBits(packet, tier0Bits, 1);
            }
            return stackIn_4_0;
          }
          if (1 == var10_intLifetime1) {
            if (0 != tier1Bits) {
              stackIn_9_0 = UnitSpell.readSignedBits(packet, tier1Bits, 1);
            } else {
              stackIn_9_0 = 0;
            }
            var11 = stackIn_9_0;
            var12 = tier0HalfRange;
            if (var11 >= 0) {
              stackIn_12_0 = var11 + var12;
            } else {
              stackIn_12_0 = -var12 + var11;
            }
            return stackIn_12_0;
          }
          if (var10_intLifetime1 == 2) {
            if (tier2Bits != 0) {
              stackIn_26_0 = UnitSpell.readSignedBits(packet, tier2Bits, 1);
            } else {
              stackIn_26_0 = 0;
            }
            var11Lifetime1 = stackIn_26_0;
            var12Lifetime1 = tier1HalfRange + tier0HalfRange;
            if (0 > var11Lifetime1) {
              stackIn_29_0 = var11Lifetime1 - var12Lifetime1;
            } else {
              stackIn_29_0 = var12Lifetime1 + var11Lifetime1;
            }
            return stackIn_29_0;
          }
          if (3 != var10_intLifetime1) {
            throw new IllegalStateException();
          }
          if (0 == tier3Bits) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = UnitSpell.readSignedBits(packet, tier3Bits, 1);
          }
          var11Lifetime2 = stackIn_18_0;
          var12Lifetime2 = tier1HalfRange + tier2HalfRange + tier0HalfRange;
          if (var11Lifetime2 < 0) {
            stackIn_21_0 = -var12Lifetime2 + var11Lifetime2;
          } else {
            stackIn_21_0 = var11Lifetime2 + var12Lifetime2;
          }
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_32_0 = var10;
          stackIn_32_1 = new StringBuilder().append("sj.D(").append(unusedTier3HalfRange).append(',').append(tier2HalfRange).append(',').append(obfuscationGuard).append(',').append(tier3Bits).append(',').append(tier2Bits).append(',').append(tier1HalfRange).append(',').append(tier0HalfRange).append(',').append(tier1Bits).append(',').append(tier0Bits).append(',');
          if (packet == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }
}
