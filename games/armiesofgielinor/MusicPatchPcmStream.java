/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchPcmStream extends PcmStream {
    NodeDeque notes;
    private MidiPcmStream sequencer;
    static int field_o;
    PcmStreamMixer fadingStreams;
    static String field_q;

    final PcmStream nextSubStream() {
        MusicPatchNode note = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        do {
          note = (MusicPatchNode) (this.notes.next((byte) 123));
          if (note == null) {
            return null;
          }
        } while (null == note.stream);
        return (PcmStream) ((Object) note.stream);
    }

    final PcmStream firstSubStream() {
        MusicPatchNode note = (MusicPatchNode) (this.notes.first((byte) 99));
        if (note == null) {
          return null;
        }
        if (null != note.stream) {
          return (PcmStream) ((Object) note.stream);
        }
        return this.nextSubStream();
    }

    final void render(int[] output, int outputOffset, int frameCount) {
        boolean noteFinished = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String outputDescription = null;
        RuntimeException caughtFailure = null;
        int currentOffset = 0;
        RuntimeException failure = null;
        int remainingFrames = 0;
        MusicPatchNode note = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.fadingStreams.render(output, outputOffset, frameCount);
          note = (MusicPatchNode) (this.notes.first((byte) 94));
          while (note != null) {
            noteFinished = this.sequencer.removeFinishedNote((byte) -109, note);
            boolean renderRemainder = true;
            if (!noteFinished) {
              currentOffset = outputOffset;
              remainingFrames = frameCount;
              while (note.framesUntilUpdate < remainingFrames) {
                this.renderNote(currentOffset, remainingFrames + currentOffset, output, -1, note, note.framesUntilUpdate);
                remainingFrames = remainingFrames - note.framesUntilUpdate;
                currentOffset = currentOffset + note.framesUntilUpdate;
                if (this.sequencer.updateNote(remainingFrames, currentOffset, note, (byte) 116, output)) {
                  renderRemainder = false;
                  break;
                }
              }
              if (renderRemainder) {
                this.renderNote(currentOffset, currentOffset + remainingFrames, output, -1, note, remainingFrames);
                note.framesUntilUpdate = note.framesUntilUpdate - remainingFrames;
              }
            }
            note = (MusicPatchNode) (this.notes.next((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("os.E(");
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(outputDescription).append(',').append(outputOffset).append(',').append(frameCount).append(')').toString());
        }
    }

    final static int floorDivide(int divisor, int dividend, int obfuscationGuard) {
        int signCorrection = dividend >>> 31;
        if (obfuscationGuard != 1589591487) {
          return 83;
        }
        return (dividend + signCorrection) / divisor - signCorrection;
    }

    final static boolean e(int param0) {
        if (param0 == -1) {
          return !vi.field_d ? true : false;
        }
        MusicPatchPcmStream.floorDivide(-56, 74, 21);
        return !vi.field_d ? true : false;
    }

    final static int getPointerIdleTicks(int obfuscationGuard) {
        if (obfuscationGuard != 4) {
          return 68;
        }
        return av.pointerIdleTicks;
    }

    final void skip(int frameCount) {
        int remainingFrames;
        MusicPatchNode note;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.fadingStreams.skip(frameCount);
        note = (MusicPatchNode) (this.notes.first((byte) 103));
        while (note != null) {
          if (!this.sequencer.removeFinishedNote((byte) -97, note)) {
            remainingFrames = frameCount;
            do {
              if (note.framesUntilUpdate >= remainingFrames) {
                this.skipNote(note, (byte) 16, remainingFrames);
                note.framesUntilUpdate = note.framesUntilUpdate - remainingFrames;
                break;
              }
              this.skipNote(note, (byte) 16, note.framesUntilUpdate);
              remainingFrames = remainingFrames - note.framesUntilUpdate;
            } while (!this.sequencer.updateNote(remainingFrames, 0, note, (byte) 78, (int[]) null));
          }
          note = (MusicPatchNode) (this.notes.next((byte) 123));
        }
    }

    private final void skipNote(MusicPatchNode note, byte obfuscationGuard, int frameCount) {
        MidiPcmStream ownerForOffset = null;
        boolean looped = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String noteDescription = null;
        RuntimeException caughtFailure = null;
        int phaseStep = 0;
        RuntimeException failure = null;
        int framesToWrap = 0;
        try {
          if ((this.sequencer.channelFlags[note.channel] & 4) != 0 &&
            0 > note.releaseTime) {
            phaseStep = this.sequencer.channelRetriggerSteps[note.channel] / PcmPlayer.outputSampleRate;
            framesToWrap = (1048575 + phaseStep - note.retriggerPhase) / phaseStep;
            note.retriggerPhase = phaseStep * frameCount + note.retriggerPhase & 1048575;
            if (frameCount >= framesToWrap) {
              if (0 != this.sequencer.channelSampleOffsets[note.channel]) {
                note.stream = RawPcmStream.createAtStep(note.sample, note.stream.getStepMagnitude(), 0, note.stream.getPan());
                ownerForOffset = this.sequencer;
                looped = !(0 <= note.patch.pitchAndLoopFlags[note.key]);
                ((MidiPcmStream) (Object) ownerForOffset).applySampleOffset(looped, note, 16);
              } else {
                note.stream = RawPcmStream.createAtStep(note.sample, note.stream.getStepMagnitude(), note.stream.getTargetVolume(), note.stream.getPan());
              }
              if (0 > note.patch.pitchAndLoopFlags[note.key]) {
                note.stream.setLoopCount(-1);
              }
              frameCount = note.retriggerPhase / phaseStep;
            }
          }
          if (obfuscationGuard != 16) {
            MusicPatchPcmStream.f(119);
          }
          note.stream.skip(frameCount);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("os.A(");
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(noteDescription).append(',').append(obfuscationGuard).append(',').append(frameCount).append(')').toString());
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    MusicPatchPcmStream(MidiPcmStream sequencer) {
        this.notes = new NodeDeque();
        this.fadingStreams = new PcmStreamMixer();
        try {
          this.sequencer = sequencer;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "os.<init>(" + (sequencer != null ? "{...}" : "null") + ')');
        }
    }

    private final void renderNote(int outputOffset, int outputEnd, int[] output, int obfuscationGuard, MusicPatchNode note, int frameCount) {
        MidiPcmStream ownerForOffset = null;
        boolean looped = false;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String outputDescription = null;
        StringBuilder noteContext = null;
        String noteDescription = null;
        RuntimeException caughtFailure = null;
        int phaseStep = 0;
        RuntimeException failure = null;
        int framesToWrap = 0;
        int fadeFrames = 0;
        int maximumFadeFrames = 0;
        RawPcmStream previousStream = null;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != ~(this.sequencer.channelFlags[note.channel] & 4) &&
            note.releaseTime < 0) {
            phaseStep = this.sequencer.channelRetriggerSteps[note.channel] / PcmPlayer.outputSampleRate;
            while (true) {
              framesToWrap = (-note.retriggerPhase + (phaseStep + 1048575)) / phaseStep;
              if (frameCount < framesToWrap) {
                note.retriggerPhase = note.retriggerPhase + frameCount * phaseStep;
                break;
              }
              note.stream.render(output, outputOffset, framesToWrap);
              outputOffset = outputOffset + framesToWrap;
              frameCount = frameCount - framesToWrap;
              note.retriggerPhase = note.retriggerPhase + (-1048576 + phaseStep * framesToWrap);
              fadeFrames = PcmPlayer.outputSampleRate / 100;
              maximumFadeFrames = 262144 / phaseStep;
              if (fadeFrames > maximumFadeFrames) {
                fadeFrames = maximumFadeFrames;
              }
              previousStream = note.stream;
              if (this.sequencer.channelSampleOffsets[note.channel] == 0) {
                note.stream = RawPcmStream.createAtStep(note.sample, previousStream.getStepMagnitude(), previousStream.getTargetVolume(), previousStream.getPan());
              } else {
                note.stream = RawPcmStream.createAtStep(note.sample, previousStream.getStepMagnitude(), 0, previousStream.getPan());
                ownerForOffset = this.sequencer;
                looped = !(note.patch.pitchAndLoopFlags[note.key] >= 0);
                ((MidiPcmStream) (Object) ownerForOffset).applySampleOffset(looped, note, 16);
                note.stream.rampVolume(fadeFrames, previousStream.getTargetVolume());
              }
              if (note.patch.pitchAndLoopFlags[note.key] < 0) {
                note.stream.setLoopCount(-1);
              }
              previousStream.fadeOut(fadeFrames);
              previousStream.render(output, outputOffset, -outputOffset + outputEnd);
              if (!previousStream.isRamping()) {
                continue;
              }
              this.fadingStreams.addSubStream(previousStream);
            }
          }
          note.stream.render(output, outputOffset, frameCount);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("os.H(").append(outputOffset).append(',').append(outputEnd).append(',');
          if (output == null) {
            outputDescription = "null";
          } else {
            outputDescription = "{...}";
          }
          noteContext = ((StringBuilder) (Object) errorContext).append(outputDescription).append(',').append(obfuscationGuard).append(',');
          if (note == null) {
            noteDescription = "null";
          } else {
            noteDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) noteContext).append(noteDescription).append(',').append(frameCount).append(')').toString());
        }
    }

    public static void f(int param0) {
        field_q = null;
        if (param0 == 1048575) {
          return;
        }
        field_o = 68;
    }

    static {
        field_q = "This private message is prefixed with \"<col=9090FF>To <%1>:</col>\" on your screen.<br>On <%1>'s screen, it will be prefixed with \"<col=FF6060>From <%0>:</col>\", which is<br>a different length and may leave less room for the message itself.<br><br>This shading covers the area which is not available on <%1>'s screen.<br>Provided your message fits to the left of the shaded area,<br><%1> should be able to see it in full.<br><br>(Note: this may be inaccurate if <%1> is playing in a different<br>language from you.)";
    }
}
