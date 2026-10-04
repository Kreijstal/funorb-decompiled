/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PcmResampler {
    static String createAgeText;
    private int inputRateRatio;
    private int[][] filterCoefficients;
    static IntrusiveDeque availableScorePopups;
    static String fullscreenBeforeAcceptText;
    static String highscoreFriendTipText;
    static String createNewsOptInText;
    static int pointerYSnapshot;
    private int outputRateRatio;
    static int field_j;

    static long orLong(long left, long right) {
        return left | right;
    }

    final int scaleSamplePosition(int samplePosition, int methodGuard) {
        if (methodGuard != 6) {
            createAgeText = (String) null;
        }
        if (!(this.filterCoefficients == null)) {
            samplePosition = (int)((long)samplePosition * (long)this.outputRateRatio / (long)this.inputRateRatio) + 6;
        }
        return samplePosition;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        if (param1) {
            SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.stride, SoftwareRasterizer.framebufferHeight, 0, 192);
        } else {
            SoftwareRasterizer.clearFramebuffer();
        }
        if (param2 != -102) {
            return;
        }
        ValidationMessageWidget.a(param1, false);
    }

    final int scaleSampleRate(int methodGuard, int sampleRateHz) {
        if (methodGuard != -128) {
            this.scaleSamplePosition(23, -122);
        }
        if (!(null == this.filterCoefficients)) {
            sampleRateHz = (int)((long)sampleRateHz * (long)this.outputRateRatio / (long)this.inputRateRatio);
        }
        return sampleRateHz;
    }

    public static void a(boolean param0) {
        availableScorePopups = null;
        highscoreFriendTipText = null;
        fullscreenBeforeAcceptText = null;
        if (!param0) {
            PcmResampler.a(false);
        }
        createAgeText = null;
        createNewsOptInText = null;
    }

    PcmResampler(int inputSampleRateHz, int outputSampleRateHz) {
        int filterPhase = 0;
        int rateGreatestCommonDivisor;
        int[] phaseCoefficients;
        double filterCenter;
        int tapIndex;
        int tapEndExclusive;
        double rateScale;
        double sincAngle;
        double weightedCoefficient;
        if (outputSampleRateHz == inputSampleRateHz) {
          return;
        }
        rateGreatestCommonDivisor = SessionBootstrapSupport.greatestCommonDivisor(inputSampleRateHz, outputSampleRateHz, -126);
        inputSampleRateHz = inputSampleRateHz / rateGreatestCommonDivisor;
        outputSampleRateHz = outputSampleRateHz / rateGreatestCommonDivisor;
        this.inputRateRatio = inputSampleRateHz;
        this.filterCoefficients = new int[inputSampleRateHz][14];
        this.outputRateRatio = outputSampleRateHz;
        for (filterPhase = 0; inputSampleRateHz > filterPhase; filterPhase++) {
          phaseCoefficients = this.filterCoefficients[filterPhase];
          filterCenter = 6.0 + (double)filterPhase / (double)inputSampleRateHz;
          tapIndex = (int)Math.floor(filterCenter - 7.0 + 1.0);
          if (tapIndex < 0) {
            tapIndex = 0;
          }
          tapEndExclusive = (int)Math.ceil(filterCenter + 7.0);
          if (tapEndExclusive > 14) {
            tapEndExclusive = 14;
          }
          rateScale = (double)outputSampleRateHz / (double)inputSampleRateHz;
          while (tapIndex < tapEndExclusive) {
            sincAngle = ((double)tapIndex - filterCenter) * 3.141592653589793;
            weightedCoefficient = rateScale;
            if (!((!(sincAngle < -0.0001)) &&
                (!(0.0001 < sincAngle)))) {
              weightedCoefficient = weightedCoefficient * (Math.sin(sincAngle) / sincAngle);
            }
            weightedCoefficient = weightedCoefficient * (Math.cos(0.2243994752564138 * (-filterCenter + (double)tapIndex)) * 0.46 + 0.54);
            phaseCoefficients[tapIndex] = (int)Math.floor(0.5 + 65536.0 * weightedCoefficient);
            tapIndex++;
          }
        }
        return;
    }

    final byte[] resampleBytes(int methodGuard, byte[] samples) {
        byte[] resampledBytesAtReturn = null;
        RuntimeException resamplingFailureBeforeDescription = null;
        StringBuilder resamplingMessagePrefix = null;
        String samplesDescription = null;
        RuntimeException caughtResamplingFailure = null;
        int guardDivisionResult = 0;
        RuntimeException resamplingFailureForContext = null;
        int outputLength = 0;
        int[] accumulatorForUpdates = null;
        int outputPosition = 0;
        int filterPhase = 0;
        int inputIndexThenZeroOutputIndex = 0;
        int sampleValueThenRoundedOutput = 0;
        int tapIndexThenOutputAdvance = 0;
        int outputIndex = 0;
        int[] accumulatorAlias = null;
        int[] allocatedAccumulator = null;
        int[] phaseCoefficients = null;
        try {
          guardDivisionResult = -6 / ((methodGuard + 18) / 49);
          if (this.filterCoefficients != null) {
            outputLength = (int)((long)samples.length * (long)this.outputRateRatio / (long)this.inputRateRatio) + 14;
            allocatedAccumulator = new int[outputLength];
            accumulatorAlias = allocatedAccumulator;
            accumulatorForUpdates = accumulatorAlias;
            outputPosition = 0;
            filterPhase = 0;
            for (inputIndexThenZeroOutputIndex = 0; samples.length > inputIndexThenZeroOutputIndex; inputIndexThenZeroOutputIndex++) {
              sampleValueThenRoundedOutput = samples[inputIndexThenZeroOutputIndex];
              phaseCoefficients = this.filterCoefficients[filterPhase];
              for (tapIndexThenOutputAdvance = 0; tapIndexThenOutputAdvance < 14; tapIndexThenOutputAdvance++) {
                accumulatorForUpdates[outputPosition + tapIndexThenOutputAdvance] = accumulatorForUpdates[outputPosition + tapIndexThenOutputAdvance] + sampleValueThenRoundedOutput * phaseCoefficients[tapIndexThenOutputAdvance];
              }
              filterPhase = filterPhase + this.outputRateRatio;
              tapIndexThenOutputAdvance = filterPhase / this.inputRateRatio;
              outputPosition = outputPosition + tapIndexThenOutputAdvance;
              filterPhase = filterPhase - this.inputRateRatio * tapIndexThenOutputAdvance;
            }
            samples = new byte[outputLength];
            outputIndex = 0;
            inputIndexThenZeroOutputIndex = outputIndex;
            while (outputIndex < outputLength) {
              sampleValueThenRoundedOutput = allocatedAccumulator[outputIndex] + 32768 >> 16;
              if (-128 > sampleValueThenRoundedOutput) {
                samples[outputIndex] = (byte)-128;
              } else {
                if (sampleValueThenRoundedOutput <= 127) {
                  samples[outputIndex] = (byte)sampleValueThenRoundedOutput;
                } else {
                  samples[outputIndex] = (byte)127;
                }
              }
              outputIndex++;
            }
          }
          resampledBytesAtReturn = (byte[]) (samples);
          return resampledBytesAtReturn;
        } catch (java.lang.RuntimeException resamplingFailure) {
          caughtResamplingFailure = resamplingFailure;
          resamplingFailureForContext = caughtResamplingFailure;
          resamplingFailureBeforeDescription = resamplingFailureForContext;
          resamplingMessagePrefix = new StringBuilder().append("ue.E(").append(methodGuard).append(',');
          if (samples == null) {
            samplesDescription = "null";
          } else {
            samplesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) resamplingFailureBeforeDescription), ((StringBuilder) (Object) resamplingMessagePrefix).append(samplesDescription).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        createAgeText = "Age:";
        fullscreenBeforeAcceptText = "Click";
        highscoreFriendTipText = "Friends can be added in multiplayer<nbsp>games";
        createNewsOptInText = "Please send me news and updates (I can unsubscribe at any time)";
        pointerYSnapshot = 0;
        availableScorePopups = new IntrusiveDeque();
        for (var0 = 0; var0 < 20; var0++) {
            availableScorePopups.addLast(-83, new ScorePopup());
        }
        field_j = 250;
    }
}
