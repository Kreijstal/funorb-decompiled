/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicCrossfadeStream extends PcmStream {
    static int field_z;
    private MidiPcmStream foregroundSequencer;
    private boolean returnAfterTrack;
    private int masterGain;
    private int fadeStep;
    MidiPcmStream selectedSequencer;
    private boolean keepMutedTracks;
    static int deliveredOpcode;
    static String field_u;
    MidiPcmStream firstSequencer;
    MidiPcmStream secondSequencer;
    private int[] secondSamples;
    private MusicTrack firstTrack;
    private MusicTrack foregroundTrack;
    private int[] firstSamples;
    static ResourceArchive field_s;
    private int foregroundBlend;
    private int fadePosition;
    private MusicTrack secondTrack;

    final void render(int[] output, int outputOffset, int frameCount) {
        int doubledBackgroundOffset = 0;
        int doubledForegroundOffset = 0;
        int foregroundSampleIndex = 0;
        int sampleCountForMix = 0;
        int backgroundOutputOffset = 0;
        int foregroundOutputOffset = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String outputDescription = null;
        RuntimeException caughtFailure = null;
        int firstGain = 0;
        RuntimeException failure = null;
        int secondGain = 0;
        int sampleCount = 0;
        int backgroundOffset = 0;
        int sampleIndex = 0;
        int backgroundGain = 0;
        int obfuscationControl = 0;
        int foregroundOffset;
        int foregroundGain;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.masterGain <= 0) {
            this.skip(frameCount);
            return;
          }
          if (this.returnAfterTrack) {
            if (this.fadeStep > 0 &&
              !this.firstSequencer.isPlaying(11899)) {
              this.returnAfterTrack = false;
              this.firstTrack = null;
              this.fadeStep = -this.fadeStep;
            } else {
              if (this.fadeStep < 0 &&
                !this.secondSequencer.isPlaying(11899)) {
                this.returnAfterTrack = false;
                this.fadeStep = -this.fadeStep;
                this.secondTrack = null;
              }
            }
          }
          firstGain = (this.fadePosition >> 12) * this.masterGain / 256;
          secondGain = -firstGain + this.masterGain;
          if (this.fadeStep != 0) {
            this.fadePosition = this.fadePosition + frameCount * this.fadeStep;
            if (1048576 > this.fadePosition) {
              if (this.fadePosition <= 0) {
                this.fadePosition = 0;
                if (!this.returnAfterTrack) {
                  this.fadeStep = 0;
                  if (!this.keepMutedTracks) {
                    if (this.firstTrack != null) {
                      this.firstSequencer.stop(7);
                    }
                    this.firstTrack = null;
                  }
                }
              }
            } else {
              this.fadePosition = 1048576;
              if (!this.returnAfterTrack) {
                this.fadeStep = 0;
                if (!this.keepMutedTracks) {
                  if (null != this.secondTrack) {
                    this.secondSequencer.stop(7);
                  }
                  this.secondTrack = null;
                }
              }
            }
          }
          if (!PcmPlayer.stereo) {
            sampleCountForMix = frameCount;
          } else {
            sampleCountForMix = frameCount << 1;
          }
          sampleCount = sampleCountForMix;
          if (this.foregroundBlend < 256 && (this.firstTrack != null ||
            null != this.secondTrack)) {
            if (firstGain != 256) {
              if (secondGain != 256) {
                if (null != this.firstSamples &&
                  sampleCount <= this.firstSamples.length) {
                  vm.a(this.firstSamples, 0, sampleCount);
                  vm.a(this.secondSamples, 0, sampleCount);
                } else {
                  this.firstSamples = new int[sampleCount];
                  this.secondSamples = new int[sampleCount];
                }
                this.firstSequencer.render(this.firstSamples, 0, frameCount);
                this.secondSequencer.render(this.secondSamples, 0, frameCount);
                if (!PcmPlayer.stereo) {
                  backgroundOutputOffset = outputOffset;
                } else {
                  doubledBackgroundOffset = outputOffset << 1;
                  outputOffset = doubledBackgroundOffset;
                  backgroundOutputOffset = doubledBackgroundOffset;
                }
                backgroundOffset = backgroundOutputOffset;
                for (sampleIndex = 0; sampleIndex < sampleCount; sampleIndex++) {
                  output[backgroundOffset + sampleIndex] = output[backgroundOffset + sampleIndex] + (secondGain * this.secondSamples[sampleIndex] + firstGain * this.firstSamples[sampleIndex] >> 8);
                }
              } else {
                this.secondSequencer.render(output, outputOffset, frameCount);
              }
            } else {
              this.firstSequencer.render(output, outputOffset, frameCount);
            }
          }
          if (this.foregroundTrack != null) {
            if (this.foregroundBlend == 0) {
              return;
            }
            if (this.firstSamples != null &&
              sampleCount <= this.firstSamples.length) {
              vm.a(this.firstSamples, 0, sampleCount);
            } else {
              this.secondSamples = new int[sampleCount];
              this.firstSamples = new int[sampleCount];
            }
            this.foregroundSequencer.render(this.firstSamples, 0, frameCount);
            if (!PcmPlayer.stereo) {
              foregroundOutputOffset = outputOffset;
            } else {
              doubledForegroundOffset = outputOffset << 1;
              outputOffset = doubledForegroundOffset;
              foregroundOutputOffset = doubledForegroundOffset;
            }
            foregroundOffset = foregroundOutputOffset;
            foregroundGain = this.masterGain * this.foregroundBlend / 256;
            backgroundGain = -foregroundGain + this.masterGain;
            for (foregroundSampleIndex = 0; foregroundSampleIndex < sampleCount; foregroundSampleIndex++) {
              output[foregroundSampleIndex + foregroundOffset] = output[foregroundSampleIndex + foregroundOffset] * backgroundGain + foregroundGain * this.firstSamples[foregroundSampleIndex] >> 8;
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("nm.E(");
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(outputDescription).append(',').append(outputOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    final static void setMusicTrack(MusicTrack track, boolean loop, int channelGain, byte obfuscationGuard) {
        Object playerLock = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String trackDescription = null;
        Throwable caughtFailure = null;
        RuntimeException failure = null;
        try {
          if (obfuscationGuard != 41) {
            field_u = (String) null;
          }
          if (BitmapTextWidgetPainter.musicCrossfadeStream != null) {
            bk.selectMusicTrack(channelGain, 1048576, track, obfuscationGuard + 20566, loop);
          }
          if (null != LobbyRoom.directMusicSequencer) {
            playerLock = l.musicPlayer;
            synchronized (playerLock) {
              LobbyRoom.directMusicSequencer.setChannelGain(channelGain, -1, (byte) -91);
              if (MapLayout.currentDirectMusicTrack == track) {
                return;
              }
              LobbyRoom.directMusicSequencer.stop(7);
              l.musicPlayer.flush();
              MapLayout.currentDirectMusicTrack = track;
              if (MapLayout.currentDirectMusicTrack != null) {
                LobbyRoom.directMusicSequencer.playTrack(2, loop, MapLayout.currentDirectMusicTrack);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = (RuntimeException) (Object) caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("nm.N(");
          if (track == null) {
            trackDescription = "null";
          } else {
            trackDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(trackDescription).append(',').append(loop).append(',').append(channelGain).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final PcmStream firstSubStream() {
        return null;
    }

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
          return false;
        }
        return param0 >= 0 ? true : false;
    }

    final synchronized void skip(int frameCount) {
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.fadePosition > 0 &&
          this.firstTrack != null) {
          this.firstSequencer.skip(frameCount);
        }
        if (this.fadePosition < 1048576 &&
          this.secondTrack != null) {
          this.secondSequencer.skip(frameCount);
        }
        if (this.foregroundBlend > 0 &&
          null != this.foregroundTrack) {
          this.foregroundSequencer.skip(frameCount);
        }
        if (this.returnAfterTrack) {
          if (this.fadeStep > 0) {
            if (!this.firstSequencer.isPlaying(11899)) {
              this.returnAfterTrack = false;
              this.fadeStep = -this.fadeStep;
              this.firstTrack = null;
            } else {
              if (this.fadeStep < 0 &&
                !this.secondSequencer.isPlaying(11899)) {
                this.returnAfterTrack = false;
                this.fadeStep = -this.fadeStep;
                this.secondTrack = null;
              }
            }
          } else {
            if (this.fadeStep < 0 &&
              !this.secondSequencer.isPlaying(11899)) {
              this.returnAfterTrack = false;
              this.fadeStep = -this.fadeStep;
              this.secondTrack = null;
            }
          }
        }
        if (this.fadeStep != 0) {
          this.fadePosition = this.fadePosition + this.fadeStep * frameCount;
          if (this.fadePosition < 1048576) {
            if (this.fadePosition <= 0) {
              this.fadePosition = 0;
              if (!this.returnAfterTrack) {
                this.fadeStep = 0;
                if (!this.keepMutedTracks) {
                  if (null != this.firstTrack) {
                    this.firstSequencer.stop(7);
                  }
                  this.firstTrack = null;
                }
              }
            }
          } else {
            this.fadePosition = 1048576;
            if (!this.returnAfterTrack) {
              this.fadeStep = 0;
              if (!this.keepMutedTracks) {
                if (this.secondTrack != null) {
                  this.secondSequencer.stop(7);
                }
                this.secondTrack = null;
              }
            }
          }
        }
    }

    final synchronized void selectTrack(int channelGain, boolean returnAfterCompletion, MusicTrack track, int obfuscationGuard, int fadeRate, int timeScale) {
        boolean returnMode = false;
        int chooseFirstSlot = 0;
        MidiPcmStream secondToStart = null;
        int secondStartGuard = 0;
        boolean secondLoop = false;
        MidiPcmStream firstToStart = null;
        int firstStartGuard = 0;
        boolean firstLoop = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String trackDescription = null;
        RuntimeException caughtFailure = null;
        int replaceFirstSlot = 0;
        RuntimeException failure = null;
        int obfuscationControl = 0;
        MidiPcmStream unusedSequencer = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.returnAfterTrack &&
            returnAfterCompletion) {
            if (this.fadeStep <= 0) {
              if (null != this.secondTrack) {
                this.secondSequencer.stop(7);
              }
              this.secondTrack = track;
              if (track != null) {
                this.secondSequencer.playTrack(2, false, track);
                this.configureSelectedSequencer(-1, this.secondSequencer, timeScale, channelGain);
              }
            } else {
              if (this.firstTrack != null) {
                this.firstSequencer.stop(7);
              }
              this.firstTrack = track;
              if (track != null) {
                this.firstSequencer.playTrack(2, false, track);
                this.configureSelectedSequencer(-1, this.firstSequencer, timeScale, channelGain);
              }
            }
            return;
          }
          returnMode = (returnAfterCompletion);
          this.returnAfterTrack = returnMode;
          if (track == this.firstTrack) {
            this.fadeStep = fadeRate;
            this.configureSelectedSequencer(-1, this.firstSequencer, timeScale, channelGain);
            return;
          }
          if (track == this.secondTrack) {
            this.fadeStep = -fadeRate;
            this.configureSelectedSequencer(-1, this.secondSequencer, timeScale, channelGain);
            return;
          }
          if (obfuscationGuard != -1) {
            unusedSequencer = (MidiPcmStream) null;
            this.configureSelectedSequencer(-25, (MidiPcmStream) null, 43, -18);
          }
          if (this.firstTrack == null) {
            replaceFirstSlot = 1;
          } else {
            if (null == this.secondTrack) {
              replaceFirstSlot = 0;
            } else {
              chooseFirstSlot = (this.fadePosition >= 524288) ? 0 : 1;
              replaceFirstSlot = chooseFirstSlot;
            }
          }
          if (replaceFirstSlot != 0) {
            if (this.firstTrack != null) {
              this.firstSequencer.stop(7);
            }
            this.firstTrack = track;
            if (track != null) {
              firstToStart = this.firstSequencer;
              firstStartGuard = 2;
              firstLoop = !(returnAfterCompletion);
              ((MidiPcmStream) (Object) firstToStart).playTrack(firstStartGuard, firstLoop, track);
              this.configureSelectedSequencer(obfuscationGuard + 0, this.firstSequencer, timeScale, channelGain);
            }
            this.fadeStep = fadeRate;
          } else {
            if (null != this.secondTrack) {
              this.secondSequencer.stop(7);
            }
            this.secondTrack = track;
            if (track != null) {
              secondToStart = this.secondSequencer;
              secondStartGuard = obfuscationGuard + 3;
              secondLoop = !(returnAfterCompletion);
              ((MidiPcmStream) (Object) secondToStart).playTrack(secondStartGuard, secondLoop, track);
              this.configureSelectedSequencer(obfuscationGuard ^ 0, this.secondSequencer, timeScale, channelGain);
            }
            this.fadeStep = -fadeRate;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("nm.J(").append(channelGain).append(',').append(returnAfterCompletion).append(',');
          if (track == null) {
            trackDescription = "null";
          } else {
            trackDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(trackDescription).append(',').append(obfuscationGuard).append(',').append(fadeRate).append(',').append(timeScale).append(')').toString());
        }
    }

    final PcmStream nextSubStream() {
        return null;
    }

    final synchronized void setMasterGain(int gain, int obfuscationGuard) {
        this.masterGain = gain;
        int guardRemainder = 74 % ((obfuscationGuard + 65) / 46);
    }

    final synchronized int getSchedulingCost() {
        return 2;
    }

    private final void initializeSequencers(int obfuscationGuard, MidiPcmStream firstSequencer, MidiPcmStream secondSequencer) {
        try {
          this.secondSequencer = secondSequencer;
          this.firstSequencer = firstSequencer;
          this.fadePosition = 1048576;
          this.selectedSequencer = this.firstSequencer;
          if (obfuscationGuard < 36) {
            MidiPcmStream unusedSequencer = (MidiPcmStream) null;
            this.initializeSequencers(-114, (MidiPcmStream) null, (MidiPcmStream) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nm.A(" + obfuscationGuard + ',' + (firstSequencer != null ? "{...}" : "null") + ',' + (secondSequencer != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        if (param0 != 256) {
          field_u = (String) null;
        }
        field_u = null;
        field_s = null;
    }

    private final void configureSelectedSequencer(int channel, MidiPcmStream sequencer, int timeScale, int channelGain) {
        try {
          this.selectedSequencer = sequencer;
          sequencer.setChannelGain(channelGain, channel, (byte) -55);
          sequencer.setTimeScale(timeScale, channel ^ 34);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nm.L(" + channel + ',' + (sequencer != null ? "{...}" : "null") + ',' + timeScale + ',' + channelGain + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        ClientUiComponent stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        ClientUiComponent stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        ClientUiComponent stackIn_23_0 = null;
        boolean stackIn_24_1 = false;
        ClientUiComponent stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        CampaignUnitOverride.a(-640 + SoftwareRaster.width >> 1, 640 + SoftwareRaster.width >> 1, SoftwareRaster.height, 0, (byte) 91);
        if (ModalDialogHost.field_J > 0) {
          if (null != dh.field_k) {
            dh.field_k.drawPixels(NumericDateInputWidget.field_T.x, 0);
          }
          stackIn_6_0 = NumericDateInputWidget.field_T;
          stackIn_7_1 = (param1) && (!bw.field_g);
          ((ClientUiComponent) (Object) stackIn_6_0).draw(stackIn_7_1, 20);
          stackIn_10_0 = ov.field_i;
          stackIn_11_1 = (param1) && (!bw.field_g);
          ((ClientUiComponent) (Object) stackIn_10_0).draw(stackIn_11_1, 20);
        }
        if (param0 != 95) {
          return;
        }
        if (!(0 >= PreparedAction.field_r) ||
          !(InstructionsPanel.field_D <= 0)) {
          if (dh.field_k != null) {
            dh.field_k.drawPixels(BitmapTextWidgetPainter.field_a.x, 0);
          }
          stackIn_23_0 = BitmapTextWidgetPainter.field_a;
          stackIn_24_1 = (param1) && (!ChannelGainProfile.field_f);
          ((ClientUiComponent) (Object) stackIn_23_0).draw(stackIn_24_1, 20);
          stackIn_27_0 = pd.field_c;
          stackIn_28_1 = (param1) && (!ChannelGainProfile.field_f);
          ((ClientUiComponent) (Object) stackIn_27_0).draw(stackIn_28_1, 20);
        }
        QuickChatPhraseRepository.popRasterState(-18862);
    }

    final static li a(int param0, int param1, byte[] param2) {
        li var3 = null;
        RuntimeException var3_ref = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new li(param2);
          s.field_e.addLast((byte) -119, (IntrusiveNode) (var3));
          DeathEvent.a(var3, param1, 25522);
          if (param0 == 0) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          stackIn_2_0 = (li) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("nm.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    MusicCrossfadeStream(MidiPcmStream firstSequencer, MidiPcmStream secondSequencer) {
        this.keepMutedTracks = false;
        this.masterGain = 256;
        this.foregroundBlend = 0;
        try {
          this.initializeSequencers(121, firstSequencer, secondSequencer);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nm.<init>(" + (firstSequencer != null ? "{...}" : "null") + ',' + (secondSequencer != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_u = "The following settings need to be changed:  ";
        deliveredOpcode = -1;
    }
}
