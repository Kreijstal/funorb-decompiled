/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TrackerMusicPlayer extends PcmMixerListener {
    private int[] pitchSlideUpSteps;
    private int[] fadeOutAccumulator;
    private int[] volumeEnvelopeActive;
    private int[] fineVolumeUpMemory;
    private static int[] periodFrequencies;
    private int requestedOrder;
    private static int[] vibratoWave;
    private int[] tonePortamentoActive;
    private int jumpTarget;
    private int[] panSlideActive;
    private int[] volumeSlideActive;
    private int[] vibratoActive;
    private int[] extraFinePitchDownMemory;
    private int[] vibratoPhase;
    private int[] targetPeriods;
    private int[] keyHeld;
    private int orderIndex;
    private PcmSampleStream[] channelStreams;
    private int tempoBpm;
    private int masterVolume;
    private int[] volumeEnvelopeTicks;
    private int tickWithinRow;
    private int queuedOrder;
    private int nextRow;
    private int patternCursor;
    private int[] periods;
    private int[] portamentoSpeeds;
    private int[] finePitchDownMemory;
    private int queuedRow;
    private boolean looping;
    private TrackerMusicDefinition song;
    private int ticksPerRow;
    private int patternBoundaryIntervalRows;
    private int[] channelPans;
    private int[] panSlideAmounts;
    private int[] sampleIndices;
    private int[] volumeSlideAmounts;
    private int[] globalVolumeSlideActive;
    private int[] vibratoRates;
    private int[] fineVolumeDownMemory;
    private int patternIndex;
    private int[] panEnvelopeTicks;
    private int orderJumpIntervalRows;
    private int[] pitchSlideDownSteps;
    private boolean[] channelMuted;
    private int tempoScaleQ8;
    private int[] instrumentIndices;
    private int[] extraFinePitchUpMemory;
    private TrackerMusicDefinition queuedSong;
    private int[] vibratoDepths;
    private int[] delayedEventOffsets;
    private int playbackState;
    private int[] channelVolumes;
    private int patternBreakPending;
    private int[] finePitchUpMemory;
    private int globalVolume;
    private int[] globalVolumeSlideAmounts;

    final int onDeadline(PcmStreamMixer mixer) {
        if (this.advanceTick() &&
          !this.looping) {
          return -1;
        }
        int var3 = AudioOutput.sampleRate;
        int var4 = (var3 << 9) + (var3 << 7);
        return var4 / (this.tempoBpm * this.tempoScaleQ8);
    }

    final synchronized void setLooping(boolean looping) {
        this.looping = looping ? true : false;
    }

    private final void rampChannelGain(int channel, int volume, int pan) {
        if (this.channelStreams[channel] != null) {
          if (volume < 0) {
            volume = 0;
          } else if (volume > 64) {
            volume = 64;
          }
          if (pan < 0) {
            pan = 0;
          } else if (pan > 256) {
            pan = 256;
          }
          this.channelStreams[channel].rampVolumeAndPan(AudioOutput.sampleRate >> 7, volume * this.globalVolume * this.masterVolume >> 12, pan);
        }
    }

    private final void fadeChannel(int channel) {
        if (this.channelStreams[channel] != null) {
          this.channelStreams[channel].fadeOut(AudioOutput.sampleRate >> 7);
          this.channelStreams[channel] = null;
        }
    }

    final void onRemoved() {
        for (int var1 = 0; var1 < this.song.channelCount; var1++) {
          if (this.channelStreams[var1] != null) {
            this.owner.removeSubstream(this.channelStreams[var1]);
          }
        }
    }

    public static void releaseStatics() {
        periodFrequencies = null;
        vibratoWave = null;
    }

    private final void resetPlayback() {
        this.tickWithinRow = 0;
        this.playbackState = 0;
        this.patternCursor = 0;
        this.nextRow = 0;
        this.orderIndex = 0;
        this.patternIndex = 0;
        this.ticksPerRow = this.song.initialTicksPerRow;
        this.tempoBpm = this.song.initialTempoBpm;
        this.globalVolume = 64;
        for (int var1 = 0; var1 < this.song.channelCount; var1++) {
          this.volumeSlideAmounts[var1] = 0;
          this.panSlideAmounts[var1] = 0;
          this.vibratoRates[var1] = 0;
          this.vibratoDepths[var1] = 0;
          this.vibratoPhase[var1] = 0;
          this.vibratoActive[var1] = 0;
          this.fineVolumeUpMemory[var1] = 0;
          this.finePitchUpMemory[var1] = 0;
          this.extraFinePitchUpMemory[var1] = 0;
          this.fineVolumeDownMemory[var1] = 0;
          this.finePitchDownMemory[var1] = 0;
          this.extraFinePitchDownMemory[var1] = 0;
          this.pitchSlideUpSteps[var1] = 0;
          this.pitchSlideDownSteps[var1] = 0;
          this.targetPeriods[var1] = 0;
          this.portamentoSpeeds[var1] = 0;
          this.delayedEventOffsets[var1] = -1;
          this.volumeEnvelopeTicks[var1] = 0;
          this.panEnvelopeTicks[var1] = 0;
          this.volumeEnvelopeActive[var1] = 0;
          this.keyHeld[var1] = 0;
          this.fadeOutAccumulator[var1] = 0;
          this.tonePortamentoActive[var1] = 0;
          this.globalVolumeSlideActive[var1] = 0;
          this.volumeSlideActive[var1] = 0;
          this.panSlideActive[var1] = 0;
          this.sampleIndices[var1] = 0;
          this.channelVolumes[var1] = 0;
          this.channelPans[var1] = 128;
          this.periods[var1] = 0;
          this.instrumentIndices[var1] = -1;
        }
        this.patternBoundaryIntervalRows = 0;
        this.queuedSong = null;
        this.queuedOrder = -1;
        this.queuedRow = -1;
        this.orderJumpIntervalRows = 0;
        this.jumpTarget = 0;
        this.requestedOrder = -1;
        this.patternBreakPending = 0;
        int var2 = 0;
        int var1Lifetime1 = var2;
        while (var2 < this.song.channelCount) {
          this.channelStreams[var2] = null;
          this.channelMuted[var2] = false;
          var2++;
        }
        this.playbackState = 1;
    }

    private final void allocateChannels() {
        this.channelVolumes = new int[this.song.channelCount];
        this.channelPans = new int[this.song.channelCount];
        this.periods = new int[this.song.channelCount];
        this.sampleIndices = new int[this.song.channelCount];
        this.instrumentIndices = new int[this.song.channelCount];
        this.globalVolumeSlideAmounts = new int[this.song.channelCount];
        this.volumeSlideAmounts = new int[this.song.channelCount];
        this.panSlideAmounts = new int[this.song.channelCount];
        this.vibratoRates = new int[this.song.channelCount];
        this.vibratoDepths = new int[this.song.channelCount];
        this.vibratoPhase = new int[this.song.channelCount];
        this.vibratoActive = new int[this.song.channelCount];
        this.fineVolumeUpMemory = new int[this.song.channelCount];
        this.finePitchUpMemory = new int[this.song.channelCount];
        this.extraFinePitchUpMemory = new int[this.song.channelCount];
        this.fineVolumeDownMemory = new int[this.song.channelCount];
        this.finePitchDownMemory = new int[this.song.channelCount];
        this.extraFinePitchDownMemory = new int[this.song.channelCount];
        this.pitchSlideUpSteps = new int[this.song.channelCount];
        this.pitchSlideDownSteps = new int[this.song.channelCount];
        this.targetPeriods = new int[this.song.channelCount];
        this.portamentoSpeeds = new int[this.song.channelCount];
        this.delayedEventOffsets = new int[this.song.channelCount];
        this.volumeEnvelopeTicks = new int[this.song.channelCount];
        this.panEnvelopeTicks = new int[this.song.channelCount];
        this.volumeEnvelopeActive = new int[this.song.channelCount];
        this.keyHeld = new int[this.song.channelCount];
        this.fadeOutAccumulator = new int[this.song.channelCount];
        this.tonePortamentoActive = new int[this.song.channelCount];
        this.volumeSlideActive = new int[this.song.channelCount];
        this.panSlideActive = new int[this.song.channelCount];
        this.globalVolumeSlideActive = new int[this.song.channelCount];
        this.channelMuted = new boolean[this.song.channelCount];
        this.channelStreams = new PcmSampleStream[this.song.channelCount];
        this.resetPlayback();
    }

    private final boolean advanceTick() {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var15;
        int var16;
        int var17;
        int var25;
        int var3 = 0;
        if (this.playbackState != 1 &&
          this.playbackState != 2) {
          this.tickWithinRow = 0;
          return false;
        }
        boolean var14 = false;
        if (this.tickWithinRow == 0) {
          if (this.playbackState == 1) {
            this.playbackState = 2;
            this.orderIndex = 0;
            this.nextRow = 0;
            this.patternIndex = this.song.orderList[this.orderIndex];
            this.patternCursor = 0;
          }
          if (!(this.nextRow < this.song.patternRowCounts[this.patternIndex]) ||
            this.patternBreakPending == 1 ||
            this.orderJumpIntervalRows != 0 &&
            this.nextRow % this.orderJumpIntervalRows == 0 ||
            this.patternBoundaryIntervalRows > 0 &&
            this.nextRow % this.patternBoundaryIntervalRows == 0) {
            if (this.orderJumpIntervalRows == 0) {
              this.orderIndex = this.orderIndex + 1;
            } else {
              if (this.jumpTarget <= this.orderIndex) {
                var14 = true;
              }
              this.orderIndex = this.jumpTarget;
            }
            if (this.requestedOrder != -1) {
              this.orderIndex = this.requestedOrder;
              this.requestedOrder = -1;
            }
            if (this.orderIndex >= this.song.orderCount) {
              this.orderIndex = 0;
              var14 = true;
            }
            this.nextRow = 0;
            if (this.patternBreakPending == 1) {
              this.jumpTarget = this.jumpTarget / 16 * 10 + this.jumpTarget % 16;
              if (this.jumpTarget >= this.song.patternRowCounts[this.patternIndex]) {
                this.jumpTarget = 0;
              }
              this.nextRow = this.jumpTarget;
            }
            if (this.queuedOrder >= 0 && (this.patternBoundaryIntervalRows >= 0 ||
              var14)) {
              var15 = this.queuedOrder;
              var16 = this.queuedRow;
              if (this.queuedSong != null) {
                for (var17 = 0; var17 < this.song.channelCount; var17++) {
                  this.fadeChannel(var17);
                }
                this.song = this.queuedSong;
                this.allocateChannels();
                this.playbackState = 2;
              }
              this.orderIndex = var15;
              this.nextRow = var16;
              var14 = false;
              this.patternBoundaryIntervalRows = 0;
              this.queuedOrder = -1;
              this.queuedRow = -1;
              this.queuedSong = null;
            }
            this.patternIndex = this.song.orderList[this.orderIndex];
            this.patternCursor = 0;
            for (int var10 = 0; var10 < this.nextRow; var10++) {
              for (var15 = 0; var15 < this.song.channelCount; var15++) {
                var16 = this.song.patternData[this.patternIndex][this.patternCursor] & 255;
                this.patternCursor = this.patternCursor + 1;
                if (var16 >= 128) {
                  var16 -= 128;
                } else {
                  this.patternCursor = this.patternCursor - 1;
                  var16 = 31;
                }
                if ((var16 & 1) == 1) {
                  this.patternCursor = this.patternCursor + 1;
                }
                if ((var16 & 2) == 2) {
                  this.patternCursor = this.patternCursor + 1;
                }
                if ((var16 & 4) == 4) {
                  this.patternCursor = this.patternCursor + 1;
                }
                if ((var16 & 8) == 8) {
                  this.patternCursor = this.patternCursor + 1;
                }
                if ((var16 & 16) == 16) {
                  this.patternCursor = this.patternCursor + 1;
                }
              }
            }
            this.requestedOrder = -1;
            this.patternBreakPending = 0;
            this.orderJumpIntervalRows = 0;
          }
          this.nextRow = this.nextRow + 1;
        }
        for (var15 = 0; var15 < this.song.channelCount; var15++) {
          regionExit1: {
            if (this.tickWithinRow != 0) {
              if (this.delayedEventOffsets[var15] < 0) {
                break regionExit1;
              }
              var16 = this.delayedEventOffsets[var15];
            } else {
              var16 = this.patternCursor;
            }
            this.delayedEventOffsets[var15] = -1;
            var17 = var16;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            int var22 = -1;
            int var23 = 0;
            int var24 = this.song.patternData[this.patternIndex][var16] & 255;
            var16++;
            if (var24 >= 128) {
              var24 -= 128;
            } else {
              var16--;
              var24 = 31;
            }
            if ((var24 & 1) == 1) {
              var18 = this.song.patternData[this.patternIndex][var16] & 255;
              var16++;
            }
            if ((var24 & 2) == 2) {
              var19 = (this.song.patternData[this.patternIndex][var16] & 255) - 1;
              var16++;
            }
            if ((var24 & 4) == 4) {
              var20 = (this.song.patternData[this.patternIndex][var16] & 255) - 16;
              var16++;
            }
            if ((var24 & 8) == 8) {
              var22 = this.song.patternData[this.patternIndex][var16] & 255;
              var16++;
            }
            if ((var24 & 16) == 16) {
              var23 = this.song.patternData[this.patternIndex][var16] & 255;
              var16++;
            }
            if (this.tickWithinRow == 0) {
              this.patternCursor = var16;
            }
            if (!this.channelMuted[var15]) {
              if (var22 == 14) {
                var22 = var22 * 16 + var23 / 16;
                var23 = var23 & 15;
              }
              if (var22 == 236) {
                if (var23 == 0) {
                  var18 = 97;
                } else if (this.tickWithinRow != var23) {
                  this.delayedEventOffsets[var15] = var17;
                } else {
                  var18 = 97;
                  var22 = -1;
                  var21 = -1;
                  var20 = -1;
                  var19 = -1;
                  var23 = 0;
                }
              }
              if (var22 == 237 &&
                this.tickWithinRow < var23) {
                this.delayedEventOffsets[var15] = var17;
              } else {
                if (var20 >= 80 &&
                  var20 < 96) {
                  this.volumeSlideActive[var15] = 2;
                  this.volumeSlideAmounts[var15] = 80 - var20;
                  var20 = -1;
                }
                if (var20 >= 96 &&
                  var20 < 112) {
                  this.volumeSlideActive[var15] = 2;
                  this.volumeSlideAmounts[var15] = var20 - 96;
                  var20 = -1;
                }
                if (var20 >= 112 &&
                  var20 < 128) {
                  var20 = this.channelVolumes[var15] - (var20 - 112);
                  if (!(var20 >= 0)) {
                    var20 = 0;
                  } else if (var20 > 64) {
                    var20 = 64;
                  }
                }
                if (var20 >= 128 &&
                  var20 < 136) {
                  var20 = this.channelVolumes[var15] + (var20 - 128);
                  if (!(var20 >= 0)) {
                    var20 = 0;
                  } else if (var20 > 64) {
                    var20 = 64;
                  }
                }
                if (var20 >= 176 &&
                  var20 < 192) {
                  var21 = (var20 - 176) * 17;
                  var20 = -1;
                }
                if (var20 >= 192 &&
                  var20 < 208) {
                  this.panSlideActive[var15] = 2;
                  this.panSlideAmounts[var15] = 192 - var20;
                  var20 = -1;
                }
                if (var20 >= 208 &&
                  var20 < 224) {
                  this.panSlideActive[var15] = 2;
                  this.panSlideAmounts[var15] = var20 - 208;
                  var20 = -1;
                }
                if (var20 > 64) {
                  var20 = -1;
                }
                if (var22 == 13) {
                  if (this.orderJumpIntervalRows > 1) {
                    this.orderJumpIntervalRows = 1;
                  } else {
                    this.patternBreakPending = 1;
                    this.jumpTarget = var23;
                  }
                }
                if (var22 == 15) {
                  if (var23 >= 32) {
                    this.tempoBpm = var23;
                  } else {
                    this.ticksPerRow = var23;
                  }
                }
                if (var22 == 16) {
                  this.globalVolume = var23;
                }
                if (var22 == 12) {
                  var20 = var23;
                }
                if (var22 == 8) {
                  var21 = var23;
                }
                if (var22 == 11 &&
                  this.orderJumpIntervalRows <= 1) {
                  this.orderJumpIntervalRows = 1;
                  this.jumpTarget = var23;
                }
                if (var22 == 20) {
                  var18 = 97;
                }
                if (var22 == 21) {
                  this.volumeEnvelopeTicks[var15] = var23;
                  if (this.volumeEnvelopeTicks[var15] >= this.song.volumeEnvelopeTicks[var3][this.song.volumeEnvelopeTicks[var3].length - 1]) {
                    this.volumeEnvelopeTicks[var15] = this.song.volumeEnvelopeTicks[var3][this.song.volumeEnvelopeTicks[var3].length - 1] - 1;
                  }
                  this.panEnvelopeTicks[var15] = var23;
                  if (this.panEnvelopeTicks[var15] >= this.song.panEnvelopeTicks[var3][this.song.panEnvelopeTicks[var3].length - 1]) {
                    this.panEnvelopeTicks[var15] = this.song.panEnvelopeTicks[var3][this.song.panEnvelopeTicks[var3].length - 1] - 1;
                  }
                }
                if (var19 >= 0 &&
                  var18 <= 96) {
                  this.volumeEnvelopeTicks[var15] = 0;
                  this.panEnvelopeTicks[var15] = 0;
                  this.keyHeld[var15] = 1;
                  this.fadeOutAccumulator[var15] = 0;
                }
                if (var22 == 3 &&
                  var20 < 0 &&
                  var19 != -1) {
                  var20 = this.song.sampleVolumes[this.sampleIndices[var15]];
                }
                if (var22 == 3 &&
                  var21 < 0 &&
                  var19 != -1) {
                  var21 = this.song.samplePans[this.sampleIndices[var15]];
                }
                if (var18 >= 0 &&
                  var18 <= 96 &&
                  var22 != 3) {
                  if (var19 == -1 &&
                    var20 < 0) {
                    var20 = this.channelVolumes[var15];
                  }
                  if (var19 == -1 &&
                    var21 < 0) {
                    var21 = this.channelPans[var15];
                  }
                  if (var19 != -1) {
                    this.instrumentIndices[var15] = var19;
                    if (var18 >= 96) {
                      var19 = this.song.instrumentSampleMaps[var19][95];
                    } else {
                      var19 = this.song.instrumentSampleMaps[var19][var18];
                    }
                  } else {
                    var19 = this.sampleIndices[var15];
                  }
                  if (var20 < 0) {
                    var20 = this.song.sampleVolumes[var19];
                  }
                  if (var21 < 0) {
                    var21 = this.song.samplePans[var19];
                  }
                  var25 = 7680 - (var18 + this.song.sampleRelativeNotes[var19]) * 64 - this.song.sampleFineTunes[var19] / 2;
                  if (!(var25 >= 0)) {
                    var25 = 0;
                  } else if (var25 > 7999) {
                    var25 = 7999;
                  }
                  this.targetPeriods[var15] = var25;
                  int var26 = periodFrequencies[var25];
                  this.sampleIndices[var15] = var19;
                  this.channelVolumes[var15] = var20;
                  this.channelPans[var15] = var21;
                  this.periods[var15] = var25;
                  int var1 = 0;
                  if (var22 == 9) {
                    if (var23 * 256 <= this.song.sampleLengths[var19]) {
                      var1 = var23 * 256;
                    } else {
                      var1 = this.song.sampleLengths[var19];
                    }
                  }
                  this.startChannelSample(var15, var19, var1, var26, var20, var21);
                  this.vibratoPhase[var15] = 0;
                } else if (var18 <= 96) {
                  if (var20 >= 0 ||
                    var21 >= 0) {
                    if (var20 >= 0) {
                      this.channelVolumes[var15] = var20;
                    }
                    if (var21 >= 0) {
                      this.channelPans[var15] = var21;
                    }
                  }
                } else if (this.volumeEnvelopeActive[var15] != 1) {
                  this.fadeChannel(var15);
                } else {
                  this.keyHeld[var15] = 0;
                }
                regionExit2: {
                  if (var22 == 3) {
                    this.tonePortamentoActive[var15] = 1;
                    if (var18 >= 0) {
                      if (var18 <= 96) {
                        var19 = this.sampleIndices[var15];
                        var25 = 7680 - (var18 + this.song.sampleRelativeNotes[var19]) * 64 - this.song.sampleFineTunes[var19] / 2;
                        if (var25 >= 0) {
                          if (var25 <= 7999) {
                            this.targetPeriods[var15] = var25;
                            if (var23 != 0) {
                              this.portamentoSpeeds[var15] = var23;
                              if (this.song.frequencyMode == 0) {
                                this.portamentoSpeeds[var15] = this.portamentoSpeeds[var15] * 2;
                              }
                            }
                            break regionExit2;
                          }
                          var25 = 7999;
                        } else {
                          var25 = 0;
                        }
                        this.targetPeriods[var15] = var25;
                        if (var23 != 0) {
                          this.portamentoSpeeds[var15] = var23;
                          if (this.song.frequencyMode == 0) {
                            this.portamentoSpeeds[var15] = this.portamentoSpeeds[var15] * 2;
                          }
                        }
                      } else if (var23 != 0) {
                        this.portamentoSpeeds[var15] = var23;
                        if (this.song.frequencyMode == 0) {
                          this.portamentoSpeeds[var15] = this.portamentoSpeeds[var15] * 2;
                        }
                      }
                    } else if (var23 != 0) {
                      this.portamentoSpeeds[var15] = var23;
                      if (this.song.frequencyMode == 0) {
                        this.portamentoSpeeds[var15] = this.portamentoSpeeds[var15] * 2;
                      }
                    }
                  } else if (var22 != 5) {
                    this.tonePortamentoActive[var15] = 0;
                  }
                }
                if (var22 == 4) {
                  this.vibratoActive[var15] = 1;
                  if (var23 / 16 > 0) {
                    this.vibratoRates[var15] = var23 / 16;
                  }
                  if ((var23 & 15) > 0) {
                    this.vibratoDepths[var15] = var23 & 15;
                  }
                } else if (var22 != 6) {
                  if (this.vibratoActive[var15] != 0) {
                    var25 = periodFrequencies[this.periods[var15]];
                    this.setChannelFrequency(var15, var25);
                  }
                  this.vibratoPhase[var15] = 0;
                  this.vibratoActive[var15] = 0;
                }
                if (var22 != 17) {
                  this.globalVolumeSlideActive[var15] = 0;
                } else {
                  this.globalVolumeSlideActive[var15] = 1;
                  if (var23 != 0) {
                    this.globalVolumeSlideAmounts[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                }
                if (var22 == 10 ||
                  var22 == 6 ||
                  var22 == 5) {
                  this.volumeSlideActive[var15] = 1;
                  if (var23 != 0) {
                    this.volumeSlideAmounts[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                } else if (this.volumeSlideActive[var15] != 2) {
                  this.volumeSlideActive[var15] = 0;
                } else {
                  this.volumeSlideActive[var15] = 1;
                }
                if (var22 == 25) {
                  this.panSlideActive[var15] = 1;
                  if (var23 != 0) {
                    this.panSlideAmounts[var15] = (var23 & 240) / 16 - (var23 & 15);
                  }
                } else if (this.panSlideActive[var15] != 2) {
                  this.panSlideActive[var15] = 0;
                } else {
                  this.panSlideActive[var15] = 1;
                }
                if (var22 == 234) {
                  if (var23 != 0) {
                    this.fineVolumeUpMemory[var15] = var23;
                  } else {
                    var23 = this.fineVolumeUpMemory[var15];
                  }
                  this.channelVolumes[var15] = this.channelVolumes[var15] + var23;
                  if (!(this.channelVolumes[var15] >= 0)) {
                    this.channelVolumes[var15] = 0;
                  } else if (this.channelVolumes[var15] > 64) {
                    this.channelVolumes[var15] = 64;
                  }
                }
                if (var22 == 235) {
                  if (var23 != 0) {
                    this.fineVolumeDownMemory[var15] = var23;
                  } else {
                    var23 = this.fineVolumeDownMemory[var15];
                  }
                  this.channelVolumes[var15] = this.channelVolumes[var15] - var23;
                  if (!(this.channelVolumes[var15] >= 0)) {
                    this.channelVolumes[var15] = 0;
                  } else if (this.channelVolumes[var15] > 64) {
                    this.channelVolumes[var15] = 64;
                  }
                }
                if (var22 != 1) {
                  this.pitchSlideUpSteps[var15] = 0;
                } else if (var23 != 0) {
                  this.pitchSlideUpSteps[var15] = var23;
                }
                if (var22 != 2) {
                  this.pitchSlideDownSteps[var15] = 0;
                } else if (var23 != 0) {
                  this.pitchSlideDownSteps[var15] = var23;
                }
                switch (var22) {
                  case 225:
                    if (var23 != 0) {
                      this.finePitchUpMemory[var15] = var23;
                    } else {
                      var23 = this.finePitchUpMemory[var15];
                    }
                    this.periods[var15] = this.periods[var15] - var23 * 4;
                    if (this.periods[var15] >= 0) {
                      if (this.periods[var15] > 7999) {
                        this.periods[var15] = 7999;
                      }
                    } else {
                      this.periods[var15] = 0;
                    }
                    var25 = periodFrequencies[this.periods[var15]];
                    this.setChannelFrequency(var15, var25);
                    break;
                  case 226:
                    if (var23 != 0) {
                      this.finePitchDownMemory[var15] = var23;
                    } else {
                      var23 = this.finePitchDownMemory[var15];
                    }
                    this.periods[var15] = this.periods[var15] + var23 * 4;
                    if (this.periods[var15] >= 0) {
                      if (this.periods[var15] > 7999) {
                        this.periods[var15] = 7999;
                      }
                    } else {
                      this.periods[var15] = 0;
                    }
                    var25 = periodFrequencies[this.periods[var15]];
                    this.setChannelFrequency(var15, var25);
                    break;
                  case 33:
                    if (var23 / 16 != 1) {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.extraFinePitchDownMemory[var15] = var23;
                      } else {
                        var23 = this.extraFinePitchDownMemory[var15];
                      }
                      this.periods[var15] = this.periods[var15] + var23;
                      if (!(this.periods[var15] >= 0)) {
                        this.periods[var15] = 0;
                      } else if (this.periods[var15] > 7999) {
                        this.periods[var15] = 7999;
                      }
                      var25 = periodFrequencies[this.periods[var15]];
                      this.setChannelFrequency(var15, var25);
                    } else {
                      var23 = var23 & 15;
                      if (var23 != 0) {
                        this.extraFinePitchUpMemory[var15] = var23;
                      } else {
                        var23 = this.extraFinePitchUpMemory[var15];
                      }
                      this.periods[var15] = this.periods[var15] - var23;
                      if (!(this.periods[var15] >= 0)) {
                        this.periods[var15] = 0;
                      } else if (this.periods[var15] > 7999) {
                        this.periods[var15] = 7999;
                      }
                      var25 = periodFrequencies[this.periods[var15]];
                      this.setChannelFrequency(var15, var25);
                    }
                    break;
                  default:
                    break;
                }
              }
            }
          }
        }
        if (this.tickWithinRow > 0) {
          for (var15 = 0; var15 < this.song.channelCount; var15++) {
            if (!this.channelMuted[var15]) {
              if (this.globalVolumeSlideActive[var15] != 0) {
                this.globalVolume = this.globalVolume + this.globalVolumeSlideAmounts[var15];
                if (!(this.globalVolume >= 0)) {
                  this.globalVolume = 0;
                } else if (this.globalVolume > 64) {
                  this.globalVolume = 64;
                }
              }
              if (this.volumeSlideActive[var15] != 0 ||
                this.panSlideActive[var15] != 0) {
                this.channelVolumes[var15] = this.channelVolumes[var15] + this.volumeSlideAmounts[var15];
                if (!(this.channelVolumes[var15] >= 0)) {
                  this.channelVolumes[var15] = 0;
                } else if (this.channelVolumes[var15] > 64) {
                  this.channelVolumes[var15] = 64;
                }
                this.channelPans[var15] = this.channelPans[var15] + this.panSlideAmounts[var15];
                if (!(this.channelPans[var15] >= 0)) {
                  this.channelPans[var15] = 0;
                } else if (this.channelPans[var15] > 255) {
                  this.channelPans[var15] = 255;
                }
              }
              if (this.vibratoActive[var15] == 1) {
                this.vibratoPhase[var15] = (this.vibratoPhase[var15] + this.vibratoRates[var15]) % 68;
                int var2 = vibratoWave[this.vibratoPhase[var15]] * this.vibratoDepths[var15] >> 8;
                var16 = this.periods[var15] + var2;
                this.setChannelFrequency(var15, periodFrequencies[var16]);
              }
              if (this.pitchSlideUpSteps[var15] > 0) {
                this.periods[var15] = this.periods[var15] - this.pitchSlideUpSteps[var15] * 4;
                if (!(this.periods[var15] >= 0)) {
                  this.periods[var15] = 0;
                } else if (this.periods[var15] > 7999) {
                  this.periods[var15] = 7999;
                }
                var16 = periodFrequencies[this.periods[var15]];
                this.setChannelFrequency(var15, var16);
              }
              if (this.pitchSlideDownSteps[var15] > 0) {
                this.periods[var15] = this.periods[var15] + this.pitchSlideDownSteps[var15] * 4;
                if (!(this.periods[var15] >= 0)) {
                  this.periods[var15] = 0;
                } else if (this.periods[var15] > 7999) {
                  this.periods[var15] = 7999;
                }
                var16 = periodFrequencies[this.periods[var15]];
                this.setChannelFrequency(var15, var16);
              }
              if (this.tonePortamentoActive[var15] > 0) {
                if (this.periods[var15] < this.targetPeriods[var15]) {
                  this.periods[var15] = this.periods[var15] + this.portamentoSpeeds[var15] * 4;
                  if (this.periods[var15] > this.targetPeriods[var15]) {
                    this.periods[var15] = this.targetPeriods[var15];
                  }
                }
                if (this.periods[var15] > this.targetPeriods[var15]) {
                  this.periods[var15] = this.periods[var15] - this.portamentoSpeeds[var15] * 4;
                  if (this.periods[var15] < this.targetPeriods[var15]) {
                    this.periods[var15] = this.targetPeriods[var15];
                  }
                }
                if (!(this.periods[var15] >= 0)) {
                  this.periods[var15] = 0;
                } else if (this.periods[var15] > 7999) {
                  this.periods[var15] = 7999;
                }
                var16 = periodFrequencies[this.periods[var15]];
                this.setChannelFrequency(var15, var16);
              }
            }
          }
        }
        for (var15 = 0; var15 < this.song.channelCount; var15++) {
          if (!this.channelMuted[var15]) {
            var16 = this.channelVolumes[var15];
            var17 = this.channelPans[var15];
            this.volumeEnvelopeActive[var15] = 0;
            if (this.instrumentIndices[var15] >= 0) {
              var3 = this.instrumentIndices[var15];
              if ((this.song.volumeEnvelopeFlags[this.instrumentIndices[var15]] & 1) == 1) {
                this.volumeEnvelopeActive[var15] = 1;
                var4 = this.volumeEnvelopeTicks[var15];
                for (var5 = 0; this.song.volumeEnvelopeTicks[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.song.volumeEnvelopeTicks[var3][var5];
                var8 = this.song.volumeEnvelopeTicks[var3][var5 + 1];
                var7 = this.song.volumeEnvelopeValues[var3][var5];
                var9 = this.song.volumeEnvelopeValues[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                int var11 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                int var12 = 32768 - this.fadeOutAccumulator[var15];
                if (var12 < 0) {
                  var12 = 0;
                }
                var16 = var16 * var11 * var12 >> 21;
                if ((this.song.volumeEnvelopeFlags[var3] & 2) == 2 &&
                  this.keyHeld[var15] == 1 &&
                  this.volumeEnvelopeTicks[var15] == this.song.volumeEnvelopeTicks[var3][this.song.volumeSustainPoints[var3]]) {
                  this.volumeEnvelopeTicks[var15] = this.volumeEnvelopeTicks[var15] - 1;
                }
                if (this.volumeEnvelopeTicks[var15] == this.song.volumeEnvelopeTicks[var3][this.song.volumeEnvelopeTicks[var3].length - 1]) {
                  this.volumeEnvelopeTicks[var15] = this.volumeEnvelopeTicks[var15] - 1;
                }
                if (this.keyHeld[var15] == 0) {
                  this.fadeOutAccumulator[var15] = this.fadeOutAccumulator[var15] + this.song.instrumentFadeouts[var3];
                }
                this.volumeEnvelopeTicks[var15] = this.volumeEnvelopeTicks[var15] + 1;
                if ((this.song.volumeEnvelopeFlags[var3] & 4) == 4 &&
                  this.volumeEnvelopeTicks[var15] == this.song.volumeEnvelopeTicks[var3][this.song.volumeLoopEndPoints[var3]]) {
                  this.volumeEnvelopeTicks[var15] = this.song.volumeEnvelopeTicks[var3][this.song.volumeLoopStartPoints[var3]];
                }
              }
              if ((this.song.panEnvelopeFlags[this.instrumentIndices[var15]] & 1) == 1) {
                var4 = this.panEnvelopeTicks[var15];
                for (var5 = 0; this.song.panEnvelopeTicks[var3][var5 + 1] < var4; var5++) {
                }
                var6 = this.song.panEnvelopeTicks[var3][var5];
                var8 = this.song.panEnvelopeTicks[var3][var5 + 1];
                var7 = this.song.panEnvelopeValues[var3][var5];
                var9 = this.song.panEnvelopeValues[var3][var5 + 1];
                if (var8 == var6) {
                  var8++;
                }
                int var13 = ((var8 - var4) * var7 + (var4 - var6) * var9) / (var8 - var6);
                var17 = var17 + ((var13 - 32) * (128 - Math.abs(var17 - 128)) >> 5);
                if ((this.song.panEnvelopeFlags[var3] & 2) == 2 &&
                  this.keyHeld[var15] == 1 &&
                  this.panEnvelopeTicks[var15] == this.song.panEnvelopeTicks[var3][this.song.panSustainPoints[var3]]) {
                  this.panEnvelopeTicks[var15] = this.panEnvelopeTicks[var15] - 1;
                }
                if (this.panEnvelopeTicks[var15] == this.song.panEnvelopeTicks[var3][this.song.panEnvelopeTicks[var3].length - 1]) {
                  this.panEnvelopeTicks[var15] = this.panEnvelopeTicks[var15] - 1;
                }
                this.panEnvelopeTicks[var15] = this.panEnvelopeTicks[var15] + 1;
                if ((this.song.panEnvelopeFlags[var3] & 4) == 4 &&
                  this.panEnvelopeTicks[var15] == this.song.panEnvelopeTicks[var3][this.song.panLoopEndPoints[var3]]) {
                  this.panEnvelopeTicks[var15] = this.song.panEnvelopeTicks[var3][this.song.panLoopStartPoints[var3]];
                }
              }
            }
            this.rampChannelGain(var15, var16, var17);
          }
        }
        this.tickWithinRow = this.tickWithinRow + 1;
        if (this.tickWithinRow >= this.ticksPerRow) {
          this.tickWithinRow = 0;
        }
        return (var14);
    }

    private final void startChannelSample(int channel, int sampleIndex, int sampleOffset, int frequencyHz, int volume, int pan) {
        int stackIn_14_2 = 0;
        Throwable decompiledCaughtException = null;
        this.fadeChannel(channel);
        if (frequencyHz > periodFrequencies[7999] &&
          frequencyHz < periodFrequencies[0]) {
          if (!(volume >= 0)) {
            volume = 0;
          } else if (volume > 64) {
            volume = 64;
          }
          if (!(pan >= 0)) {
            pan = 0;
          } else if (pan > 255) {
            pan = 255;
          }
          PcmSample stackIn_13_0 = this.song.samples[sampleIndex];
          int stackIn_13_1 = frequencyHz * 256 / AudioOutput.sampleRate;
          if (sampleOffset == 0) {
            stackIn_14_2 = volume * this.globalVolume * this.masterVolume >> 12;
          } else {
            stackIn_14_2 = 0;
          }
          PcmSampleStream var7 = PcmSampleStream.createAtStepScaled(stackIn_13_0, stackIn_13_1, stackIn_14_2, pan);
          var7.setLoopRange(this.song.sampleLoopStarts[sampleIndex], this.song.sampleLoopEnds[sampleIndex]);
          PcmSampleStream stackIn_16_0 = var7;
          int stackIn_17_1 = (this.song.sampleFlags[sampleIndex] == 0) ? 0 : -1;
          ((PcmSampleStream) (Object) stackIn_16_0).setLoopCount(stackIn_17_1);
          PcmSampleStream stackIn_19_0 = var7;
          boolean stackIn_20_1 = (this.song.sampleFlags[sampleIndex] != 2) ? false : true;
          ((PcmSampleStream) (Object) stackIn_19_0).setPingPongLoop(stackIn_20_1);
          if (sampleOffset != 0) {
            var7.setPosition(sampleOffset);
            var7.rampVolumeAndPan(AudioOutput.sampleRate >> 7, volume * this.globalVolume * this.masterVolume >> 12, pan);
          }
          this.channelStreams[channel] = var7;
          if (this.owner != null) {
            Object var8 = this.owner;
            synchronized (var8) {
              this.owner.addSubstream(var7);
            }
          }
          return;
        }
    }

    final synchronized void setMasterVolume(int volume) {
        this.masterVolume = volume;
    }

    final void onScheduled() {
        for (int var1 = 0; var1 < this.song.channelCount; var1++) {
          if (this.channelStreams[var1] != null) {
            this.owner.addSubstream(this.channelStreams[var1]);
          }
        }
    }

    private final void setChannelFrequency(int channel, int frequencyHz) {
        if (this.channelStreams[channel] != null) {
          this.channelStreams[channel].setSpeed(frequencyHz * 256 / AudioOutput.sampleRate);
        }
    }

    TrackerMusicPlayer(TrackerMusicDefinition song) {
        this.masterVolume = 64;
        this.patternBoundaryIntervalRows = 0;
        this.queuedRow = -1;
        this.queuedSong = null;
        this.tickWithinRow = 0;
        this.playbackState = 0;
        this.orderJumpIntervalRows = 0;
        this.patternBreakPending = 0;
        this.requestedOrder = -1;
        this.tempoScaleQ8 = 256;
        this.looping = true;
        this.jumpTarget = 0;
        this.queuedOrder = -1;
        this.song = song;
        this.allocateChannels();
    }

    static {
        periodFrequencies = new int[8000];
        vibratoWave = new int[68];
        for (int var0 = 0; var0 < 8000; var0++) {
          periodFrequencies[var0] = (int)(8363.0 * Math.pow(2.0, (double)(4608 - var0) / 768.0));
        }
        for (int var0Lifetime1 = 0; var0Lifetime1 < 68; var0Lifetime1++) {
          vibratoWave[var0Lifetime1] = (int)(-2048.0 * Math.sin((double)var0Lifetime1 * 0.0923998));
        }
    }
}
