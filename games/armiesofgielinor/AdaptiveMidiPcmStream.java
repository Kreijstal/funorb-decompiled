/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AdaptiveMidiPcmStream extends MidiPcmStream {
    private boolean gainsSettled;
    private int[] gainSteps;
    private int overallGain;
    static ClientUiComponent field_kb;
    static String lastQuickChatRecipientName;
    static String field_gb;
    private int[] fixedChannelGains;
    static String[] tutorialMapNames;
    static QuickChatMenu defaultQuickChatMenu;
    private ChannelGainProfile targetProfile;
    static String field_bb;

    final static boolean hasValidAccountNameShape(CharSequence name, int minimumLength, boolean allowRepeatedSeparators) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (name == null) {
            return false;
          }
          var3_int = name.length();
          if (var3_int >= minimumLength &&
            var3_int <= 12) {
            var4 = AccountNameNormalizer.normalize(name, false);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!rs.isAccountNameSeparator(var4.charAt(0), (byte) -111) &&
                !rs.isAccountNameSeparator(var4.charAt(var4.length() - 1), (byte) -74)) {
                var5 = 0;
                for (var6 = 0; var6 < name.length(); var6++) {
                  var7 = name.charAt(var6);
                  if (rs.isAccountNameSeparator((char) var7, (byte) -42)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (2 <= var5 &&
                    !allowRepeatedSeparators) {
                    return false;
                  }
                }
                if (var5 <= 0) {
                  return true;
                }
                return false;
              }
              return false;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("wn.AB(");
          if (name == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(minimumLength).append(',').append(allowRepeatedSeparators).append(')').toString());
        }
    }

    final synchronized void setChannelGain(int gain, int channel, byte obfuscationGuard) {
        if (-1 == channel) {
          this.overallGain = gain;
          return;
        }
        super.setChannelGain(gain, channel, (byte) -28);
        this.fixedChannelGains[channel] = gain << 12;
        if (obfuscationGuard > -13) {
          MusicTrack unusedTrack = (MusicTrack) null;
          this.startTrack(true, (byte) 40, true, (MusicTrack) null);
        }
    }

    public AdaptiveMidiPcmStream() {
        this.gainSteps = new int[16];
        this.overallGain = 256;
        this.fixedChannelGains = new int[16];
        this.resetChannelGains(3933);
    }

    final static void a(int param0, RgbSprite[] param1, int param2, int param3, int param4, int param5) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1 != null &&
            param2 > 0) {
            var6_int = param1[0].canvasWidth;
            var7 = param1[2].canvasWidth;
            var8 = param1[1].canvasWidth;
            param1[0].drawShadedGrayscale(param3, param4, param0);
            param1[2].drawShadedGrayscale(-var7 + param2 + param3, param4, param0);
            SoftwareRaster.b(DefeatPlayerConsoleCommand.field_H);
            SoftwareRaster.b(var6_int + param3, param4, param3 + param2 - var7, param1[1].canvasHeight + param4);
            if (param5 != -3225) {
              AdaptiveMidiPcmStream.a(true);
            }
            var9 = var6_int + param3;
            var10 = -var7 + param2 + param3;
            for (param3 = var9; var10 > param3; param3 = param3 + var8) {
              param1[1].drawShadedGrayscale(param3, param4, param0);
            }
            SoftwareRaster.a(DefeatPlayerConsoleCommand.field_H);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("wn.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != 52) {
          CharSequence var2 = (CharSequence) null;
          AdaptiveMidiPcmStream.hasValidAccountNameShape((CharSequence) null, -50, false);
        }
        field_kb = null;
        defaultQuickChatMenu = null;
        tutorialMapNames = null;
        field_bb = null;
        lastQuickChatRecipientName = null;
        field_gb = null;
    }

    final synchronized void render(int[] output, int outputOffset, int frameCount) {
        int channel = 0;
        int increasingStep = 0;
        int belowTarget = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String outputDescription = null;
        RuntimeException caughtFailure = null;
        int originalMasterVolume = 0;
        RuntimeException failure = null;
        int allSettled = 0;
        int step = 0;
        int targetGain = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          originalMasterVolume = this.getMasterVolume(4096);
          this.setMasterVolume(-87, this.overallGain * originalMasterVolume >> 8);
          super.render(output, outputOffset, frameCount);
          if (!this.gainsSettled) {
            allSettled = 1;
            for (channel = 0; channel < 16; channel++) {
              step = this.gainSteps[channel];
              if (0 != step) {
                this.fixedChannelGains[channel] = this.fixedChannelGains[channel] + step * frameCount;
                targetGain = this.targetProfile.gains[channel];
                increasingStep = (step <= 0) ? 0 : 1;
                if (this.fixedChannelGains[channel] >> 12 >= targetGain) {
                  belowTarget = 0;
                } else {
                  belowTarget = 1;
                }
                if ((increasingStep ^ belowTarget) != 0) {
                  this.gainSteps[channel] = 0;
                  this.fixedChannelGains[channel] = targetGain << 12;
                } else {
                  allSettled = 0;
                }
                super.setChannelGain(this.fixedChannelGains[channel] >> 12, channel, (byte) -123);
              }
            }
            if (allSettled != 0) {
              this.gainsSettled = true;
            }
          }
          this.setMasterVolume(-54, originalMasterVolume);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("wn.E(");
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(outputDescription).append(',').append(outputOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    private final synchronized void beginProfileRamp(int durationFrames, ChannelGainProfile profile, int obfuscationGuard) {
        int channel = 0;
        int obfuscationControl = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String profileDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.targetProfile = profile;
          if (obfuscationGuard != -20751) {
            field_kb = (ClientUiComponent) null;
          }
          for (channel = 0; 16 > channel; channel++) {
            this.scheduleChannelRamp(durationFrames, channel, -128, this.targetProfile.gains[channel]);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("wn.WA(").append(durationFrames).append(',');
          if (profile == null) {
            profileDescription = "null";
          } else {
            profileDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(profileDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final synchronized void scheduleChannelRamp(int durationFrames, int channel, int obfuscationGuard, int targetGain) {
        this.gainsSettled = false;
        if (null == this.targetProfile) {
          this.targetProfile = new ChannelGainProfile();
        }
        this.targetProfile.gains[channel] = targetGain;
        if (obfuscationGuard >= -126) {
          this.setChannelGain(82, -42, (byte) 31);
        }
        int currentFixedGain = this.fixedChannelGains[channel];
        int difference = (this.targetProfile.gains[channel] << 12) - currentFixedGain;
        int step = 0;
        int decreasingStep = 0;
        if (difference < 0) {
          difference = -difference;
          decreasingStep = 1;
        }
        if (difference > 0) {
          step = (1 + difference) / (durationFrames + 1);
        }
        this.gainSteps[channel] = decreasingStep != 0 ? -step : step;
    }

    AdaptiveMidiPcmStream(MidiPcmStream sharedPatchOwner) {
        super(sharedPatchOwner);
        this.gainSteps = new int[16];
        this.overallGain = 256;
        this.fixedChannelGains = new int[16];
        try {
          this.resetChannelGains(3933);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wn.<init>(" + (sharedPatchOwner != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0) {
        int var1 = 0;
        if (32 >= SoundPlaybackHandle.musicGain) {
          NetworkResourceRequest.b(0, 99);
        } else {
          var1 = SoundPlaybackHandle.musicGain % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          NetworkResourceRequest.b(SoundPlaybackHandle.musicGain - var1, 108);
        }
        if (!param0) {
          defaultQuickChatMenu = (QuickChatMenu) null;
        }
    }

    final synchronized void startTrack(boolean loop, byte obfuscationGuard, boolean stopSounds, MusicTrack track) {
        try {
          if (obfuscationGuard > -78) {
            this.targetProfile = (ChannelGainProfile) null;
          }
          this.resetChannelGains(3933);
          super.startTrack(loop, (byte) -110, stopSounds, track);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wn.EA(" + loop + ',' + obfuscationGuard + ',' + stopSounds + ',' + (track != null ? "{...}" : "null") + ')');
        }
    }

    final synchronized void rampToProfile(byte obfuscationGuard, int durationMillis, ChannelGainProfile profile) {
        int durationFrames = 0;
        try {
          durationFrames = durationMillis * PcmPlayer.outputSampleRate / 1000;
          int guardQuotient = 58 / ((9 - obfuscationGuard) / 36);
          this.beginProfileRamp(durationFrames, profile, -20751);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wn.BB(" + obfuscationGuard + ',' + durationMillis + ',' + (profile != null ? "{...}" : "null") + ')');
        }
    }

    private final void resetChannelGains(int obfuscationGuard) {
        int channel = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        for (channel = 0; channel < 16; channel++) {
          this.fixedChannelGains[channel] = 1048576;
        }
        if (obfuscationGuard != 3933) {
          RgbSprite[] unusedSprites = (RgbSprite[]) null;
          AdaptiveMidiPcmStream.a(47, (RgbSprite[]) null, 67, -125, 49, -47);
        }
        super.setChannelGain(256, -1, (byte) -20);
    }

    static {
        field_gb = "Move here";
        tutorialMapNames = new String[]{"tutorial.lev", "tutorial2.lev"};
        field_bb = "This unit cannot use ranged weapons.";
    }
}
