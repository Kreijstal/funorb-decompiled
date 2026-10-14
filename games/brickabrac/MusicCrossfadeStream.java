/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends AudioStream {
    private int primaryMixQ20;
    static int[] field_n;
    private boolean retainFadedTrack;
    static int field_C;
    private int[] primaryScratch;
    private MusicTrack secondaryTrack;
    private int overlayMix256;
    private MusicTrack primaryTrack;
    private MusicTrack overlayTrack;
    private MidiSynthesizer primarySynthesizer;
    private int masterGain;
    private MidiSynthesizer overlaySynthesizer;
    private int[] secondaryScratch;
    private int fadeStep;
    private MidiSynthesizer secondarySynthesizer;
    static String field_B;
    private boolean returnWhenTrackEnds;
    static NameEntryPopup nameEntryPopup;
    static volatile boolean field_A;
    static String field_w;

    final AudioStream nextSubStream() {
        return null;
    }

    final void fill(int[] output, int offset, int frames) {
        int baseStereoOffset = 0;
        int overlayStereoOffset = 0;
        int overlaySample = 0;
        int sampleCountValue = 0;
        int baseOffsetValue = 0;
        int overlayOffsetValue = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String outputSummary = null;
        RuntimeException caughtFailure = null;
        int primaryGain = 0;
        RuntimeException failure = null;
        int secondaryGain = 0;
        int sampleCount = 0;
        int baseOffset = 0;
        int baseSample = 0;
        int backgroundGain = 0;
        int unusedGameFlag = 0;
        int overlayOffset;
        int overlayGain;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.masterGain <= 0) {
            this.skip(frames);
            return;
          }
          if (this.returnWhenTrackEnds) {
            if (this.fadeStep > 0 &&
              !this.primarySynthesizer.hasMidiData(-1)) {
              this.primaryTrack = null;
              this.returnWhenTrackEnds = false;
              this.fadeStep = -this.fadeStep;
            } else {
              if (this.fadeStep < 0 &&
                !this.secondarySynthesizer.hasMidiData(-1)) {
                this.fadeStep = -this.fadeStep;
                this.secondaryTrack = null;
                this.returnWhenTrackEnds = false;
              }
            }
          }
          primaryGain = (this.primaryMixQ20 >> 12) * this.masterGain / 256;
          secondaryGain = -primaryGain + this.masterGain;
          if (this.fadeStep != 0) {
            this.primaryMixQ20 = this.primaryMixQ20 + this.fadeStep * frames;
            if (1048576 > this.primaryMixQ20) {
              if (this.primaryMixQ20 <= 0) {
                this.primaryMixQ20 = 0;
                if (!this.returnWhenTrackEnds) {
                  this.fadeStep = 0;
                  if (!this.retainFadedTrack) {
                    if (null != this.primaryTrack) {
                      this.primarySynthesizer.stopTrack(-24774);
                    }
                    this.primaryTrack = null;
                  }
                }
              }
            } else {
              this.primaryMixQ20 = 1048576;
              if (!this.returnWhenTrackEnds) {
                this.fadeStep = 0;
                if (!this.retainFadedTrack) {
                  if (null != this.secondaryTrack) {
                    this.secondarySynthesizer.stopTrack(-24774);
                  }
                  this.secondaryTrack = null;
                }
              }
            }
          }
          if (!PcmPlayer.stereo) {
            sampleCountValue = frames;
          } else {
            sampleCountValue = frames << 1;
          }
          sampleCount = sampleCountValue;
          if (this.overlayMix256 < 256 && (this.primaryTrack != null ||
            this.secondaryTrack != null)) {
            if (primaryGain != 256) {
              if (256 != secondaryGain) {
                if (this.primaryScratch != null &&
                  sampleCount <= this.primaryScratch.length) {
                  ArrayOperations.clearInts(this.primaryScratch, 0, sampleCount);
                  ArrayOperations.clearInts(this.secondaryScratch, 0, sampleCount);
                } else {
                  this.primaryScratch = new int[sampleCount];
                  this.secondaryScratch = new int[sampleCount];
                }
                this.primarySynthesizer.fill(this.primaryScratch, 0, frames);
                this.secondarySynthesizer.fill(this.secondaryScratch, 0, frames);
                if (!PcmPlayer.stereo) {
                  baseOffsetValue = offset;
                } else {
                  baseStereoOffset = offset << 1;
                  offset = baseStereoOffset;
                  baseOffsetValue = baseStereoOffset;
                }
                baseOffset = baseOffsetValue;
                for (baseSample = 0; baseSample < sampleCount; baseSample++) {
                  output[baseSample + baseOffset] = output[baseSample + baseOffset] + (secondaryGain * this.secondaryScratch[baseSample] + this.primaryScratch[baseSample] * primaryGain >> 8);
                }
              } else {
                this.secondarySynthesizer.fill(output, offset, frames);
              }
            } else {
              this.primarySynthesizer.fill(output, offset, frames);
            }
          }
          if (null != this.overlayTrack) {
            if (this.overlayMix256 == 0) {
              return;
            }
            if (this.primaryScratch != null &&
              this.primaryScratch.length >= sampleCount) {
              ArrayOperations.clearInts(this.primaryScratch, 0, sampleCount);
            } else {
              this.secondaryScratch = new int[sampleCount];
              this.primaryScratch = new int[sampleCount];
            }
            this.overlaySynthesizer.fill(this.primaryScratch, 0, frames);
            if (PcmPlayer.stereo) {
              overlayStereoOffset = offset << 1;
              offset = overlayStereoOffset;
              overlayOffsetValue = overlayStereoOffset;
            } else {
              overlayOffsetValue = offset;
            }
            overlayOffset = overlayOffsetValue;
            overlayGain = this.overlayMix256 * this.masterGain / 256;
            backgroundGain = -overlayGain + this.masterGain;
            for (overlaySample = 0; sampleCount > overlaySample; overlaySample++) {
              output[overlaySample + overlayOffset] = overlayGain * this.primaryScratch[overlaySample] + output[overlayOffset + overlaySample] * backgroundGain >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("tn.D(");
          if (output == null) {
            outputSummary = "null";
          } else {
            outputSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(outputSummary).append(',').append(offset).append(',').append(frames).append(')').toString());
        }
    }

    final AudioStream firstSubStream() {
        return null;
    }

    final synchronized void skip(int frames) {
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (this.primaryMixQ20 > 0 &&
          null != this.primaryTrack) {
          this.primarySynthesizer.skip(frames);
        }
        if (this.primaryMixQ20 < 1048576 &&
          null != this.secondaryTrack) {
          this.secondarySynthesizer.skip(frames);
        }
        if (this.overlayMix256 > 0 &&
          null != this.overlayTrack) {
          this.overlaySynthesizer.skip(frames);
        }
        if (this.returnWhenTrackEnds) {
          if (this.fadeStep > 0 &&
            !this.primarySynthesizer.hasMidiData(-1)) {
            this.returnWhenTrackEnds = false;
            this.primaryTrack = null;
            this.fadeStep = -this.fadeStep;
          } else {
            if (0 > this.fadeStep &&
              !this.secondarySynthesizer.hasMidiData(-1)) {
              this.returnWhenTrackEnds = false;
              this.fadeStep = -this.fadeStep;
              this.secondaryTrack = null;
            }
          }
        }
        if (this.fadeStep != 0) {
          this.primaryMixQ20 = this.primaryMixQ20 + frames * this.fadeStep;
          if (this.primaryMixQ20 < 1048576) {
            if (this.primaryMixQ20 <= 0) {
              this.primaryMixQ20 = 0;
              if (!this.returnWhenTrackEnds) {
                this.fadeStep = 0;
                if (!this.retainFadedTrack) {
                  if (this.primaryTrack != null) {
                    this.primarySynthesizer.stopTrack(-24774);
                  }
                  this.primaryTrack = null;
                }
              }
            }
          } else {
            this.primaryMixQ20 = 1048576;
            if (!this.returnWhenTrackEnds) {
              this.fadeStep = 0;
              if (!this.retainFadedTrack) {
                if (null != this.secondaryTrack) {
                  this.secondarySynthesizer.stopTrack(-24774);
                }
                this.secondaryTrack = null;
              }
            }
          }
        }
    }

    final synchronized void selectTrack(int channelGain, boolean returnWhenTrackEnds, int fadeStep, byte obfuscationGuard, int tempoScale, MusicTrack track) {
        boolean returnMode = false;
        int selectedPrimaryFlag = 0;
        MidiSynthesizer secondaryTarget = null;
        MusicTrack secondaryInput = null;
        int secondaryGuard = 0;
        boolean secondaryLoop;
        MidiSynthesizer primaryTarget = null;
        MusicTrack primaryInput = null;
        int primaryGuard = 0;
        boolean primaryLoop;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String trackSummary = null;
        RuntimeException caughtFailure = null;
        int selectPrimary = 0;
        RuntimeException failure = null;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.returnWhenTrackEnds &&
            returnWhenTrackEnds) {
            if (0 < this.fadeStep) {
              if (null != this.primaryTrack) {
                this.primarySynthesizer.stopTrack(-24774);
              }
              this.primaryTrack = track;
              if (track != null) {
                this.primarySynthesizer.playTrack(track, 127, false);
                this.configureSynthesizer(channelGain, false, this.primarySynthesizer, tempoScale);
              }
            } else {
              if (this.secondaryTrack != null) {
                this.secondarySynthesizer.stopTrack(-24774);
              }
              this.secondaryTrack = track;
              if (track != null) {
                this.secondarySynthesizer.playTrack(track, -66, false);
                this.configureSynthesizer(channelGain, false, this.secondarySynthesizer, tempoScale);
              }
            }
            return;
          }
          returnMode = (returnWhenTrackEnds);
          this.returnWhenTrackEnds = returnMode;
          if (track == this.primaryTrack) {
            this.fadeStep = fadeStep;
            this.configureSynthesizer(channelGain, false, this.primarySynthesizer, tempoScale);
            return;
          }
          if (track == this.secondaryTrack) {
            this.fadeStep = -fadeStep;
            this.configureSynthesizer(channelGain, false, this.secondarySynthesizer, tempoScale);
            return;
          }
          if (obfuscationGuard != 22) {
            this.getSchedulingCost();
          }
          if (this.primaryTrack == null) {
            selectPrimary = 1;
          } else {
            if (null == this.secondaryTrack) {
              selectPrimary = 0;
            } else {
              selectedPrimaryFlag = (this.primaryMixQ20 >= 524288) ? 0 : 1;
              selectPrimary = selectedPrimaryFlag;
            }
          }
          if (selectPrimary != 0) {
            if (null != this.primaryTrack) {
              this.primarySynthesizer.stopTrack(-24774);
            }
            this.primaryTrack = track;
            if (track != null) {
              primaryTarget = this.primarySynthesizer;
              primaryInput = (MusicTrack) (track);
              primaryGuard = 126;
              primaryLoop = !(returnWhenTrackEnds);
              ((MidiSynthesizer) (Object) primaryTarget).playTrack(primaryInput, primaryGuard, primaryLoop);
              this.configureSynthesizer(channelGain, false, this.primarySynthesizer, tempoScale);
            }
            this.fadeStep = fadeStep;
          } else {
            if (this.secondaryTrack != null) {
              this.secondarySynthesizer.stopTrack(-24774);
            }
            this.secondaryTrack = track;
            if (track != null) {
              secondaryTarget = this.secondarySynthesizer;
              secondaryInput = (MusicTrack) (track);
              secondaryGuard = 126;
              secondaryLoop = !(returnWhenTrackEnds);
              ((MidiSynthesizer) (Object) secondaryTarget).playTrack(secondaryInput, secondaryGuard, secondaryLoop);
              this.configureSynthesizer(channelGain, false, this.secondarySynthesizer, tempoScale);
            }
            this.fadeStep = -fadeStep;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("tn.G(").append(channelGain).append(',').append(returnWhenTrackEnds).append(',').append(fadeStep).append(',').append(obfuscationGuard).append(',').append(tempoScale).append(',');
          if (track == null) {
            trackSummary = "null";
          } else {
            trackSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(trackSummary).append(')').toString());
        }
    }

    final synchronized int getSchedulingCost() {
        return 2;
    }

    public static void c(int param0) {
        if (param0 > -18) {
          MusicCrossfadeStream.c(-21);
        }
        field_B = null;
        nameEntryPopup = null;
        field_n = null;
        field_w = null;
    }

    final synchronized void setMasterGain(boolean obfuscationGuard, int gain) {
        this.masterGain = gain;
        if (!obfuscationGuard) {
          this.getSchedulingCost();
        }
    }

    private final void configureSynthesizer(int channelGain, boolean clearRetainedFade, MidiSynthesizer synthesizer, int tempoScale) {
        try {
          synthesizer.setChannelGain(channelGain, -1, 16);
          synthesizer.setTempoScale(tempoScale, -606970073);
          if (clearRetainedFade) {
            this.retainFadedTrack = false;
          }
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "tn.C(" + channelGain + ',' + clearRetainedFade + ',' + (synthesizer != null ? "{...}" : "null") + ',' + tempoScale + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        b.field_c = param1;
        if (param2 != 256) {
          return;
        }
        QuickChatCategoryRegistry.field_b = param0;
        DualLinkIterator.field_f = param3;
        IntArrayRequest.field_s = param4;
    }

    private MusicCrossfadeStream() throws Throwable {
        throw new Error();
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_B = "Highscores";
        field_n = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)(1 + (var0 << 1));
          var4 = (long)((var0 << 1) - 1);
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (!(field_n.length > var3)) {
            var3 = -1 + field_n.length;
          }
          for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
            field_n[var1] = var0;
          }
        }
        field_A = false;
        field_w = "Speed up: increases the speed of any ball in play.";
    }
}
