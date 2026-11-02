/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicVoiceMixer extends AudioStream {
    static QuickChatParameterType field_o;
    static RgbSprite field_t;
    private MidiSynthesizer synthesizer;
    NodeDeque voices;
    static int textChoiceRight;
    static boolean field_s;
    static RgbSprite[] field_n;
    static int[] customBytePoolCounts;
    static String field_q;
    AudioMixer fadingStreams;

    final void fill(int[] output, int offset, int frames) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MusicVoice var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          this.fadingStreams.fill(output, offset, frames);
          var6 = (MusicVoice) (this.voices.first(-123));
          while (var6 != null) {
            if (!this.synthesizer.discardInactiveVoice(var6, -128)) {
              var4_int = offset;
              var5 = frames;
              do {
                if (var6.updateFrames >= var5) {
                  this.fillVoice(var5, var5 + var4_int, output, var4_int, -1048576, var6);
                  var6.updateFrames = var6.updateFrames - var5;
                  break;
                }
                this.fillVoice(var6.updateFrames, var4_int + var5, output, var4_int, -1048576, var6);
                var5 = var5 - var6.updateFrames;
                var4_int = var4_int + var6.updateFrames;
              } while (!this.synthesizer.updateVoiceControls(23300, output, var5, var6, var4_int));
            }
            var6 = (MusicVoice) (this.voices.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("lk.D(");
          if (output == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(offset).append(',').append(frames).append(')').toString());
        }
    }

    final void skip(int frames) {
        int var2;
        MusicVoice var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = BrickABrac.field_J ? 1 : 0;
        this.fadingStreams.skip(frames);
        var3 = (MusicVoice) (this.voices.first(-18));
        while (var3 != null) {
          stackIn_4_0 = this.synthesizer.discardInactiveVoice(var3, -112);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = frames;
            while (var3.updateFrames < var2) {
              this.skipVoice((byte) -128, var3.updateFrames, var3);
              var2 = var2 - var3.updateFrames;
              if (this.synthesizer.updateVoiceControls(23300, (int[]) null, var2, var3, 0)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.skipVoice((byte) -109, var2, var3);
              var3.updateFrames = var3.updateFrames - var2;
            }
          }
          var3 = (MusicVoice) (this.voices.next((byte) 116));
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final AudioStream firstSubStream() {
        MusicVoice var1 = (MusicVoice) (this.voices.first(-81));
        if (var1 == null) {
          return null;
        }
        if (var1.pcmStream != null) {
          return (AudioStream) ((Object) var1.pcmStream);
        }
        return this.nextSubStream();
    }

    private final void fillVoice(int frames, int endOffset, int[] output, int offset, int obfuscationGuard, MusicVoice voice) {
        MidiSynthesizer stackIn_15_0 = null;
        boolean stackIn_15_1 = false;
        MusicVoice stackIn_15_2 = null;
        boolean stackIn_16_3;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        PcmStream var11 = null;
        int var12 = 0;
        var12 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != -1048576) {
            return;
          }
          if ((4 & this.synthesizer.channelFlags[voice.channel]) != 0 &&
            0 > voice.releaseProgress) {
            var7_int = this.synthesizer.field_U[voice.channel] / PcmPlayer.sampleRate;
            while (true) {
              var8 = (1048575 - (-var7_int + voice.field_j)) / var7_int;
              if (var8 > frames) {
                voice.field_j = voice.field_j + frames * var7_int;
                break;
              }
              voice.pcmStream.fill(output, offset, var8);
              frames = frames - var8;
              voice.field_j = voice.field_j + (var7_int * var8 - 1048576);
              offset = offset + var8;
              var9 = PcmPlayer.sampleRate / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = voice.pcmStream;
              if (this.synthesizer.channelSampleOffset[voice.channel] == 0) {
                voice.pcmStream = PcmStream.createWithGain(voice.sample, var11.getSpeed(), var11.getGain(), var11.getPan());
              } else {
                voice.pcmStream = PcmStream.createWithGain(voice.sample, var11.getSpeed(), 0, var11.getPan());
                stackIn_15_0 = this.synthesizer;
                stackIn_15_1 = false;
                stackIn_15_2 = (MusicVoice) (voice);
                stackIn_16_3 = !(voice.patch.pitchOffsets[voice.note] >= 0);
                ((MidiSynthesizer) (Object) stackIn_15_0).setVoiceStartPosition(stackIn_15_1, stackIn_15_2, stackIn_16_3);
                voice.pcmStream.rampGain(var9, var11.getGain());
              }
              if (voice.patch.pitchOffsets[voice.note] < 0) {
                voice.pcmStream.setLoopCount(-1);
              }
              var11.fadeOut(var9);
              var11.fill(output, offset, -offset + endOffset);
              if (!var11.isRamping()) {
                continue;
              }
              this.fadingStreams.addStream(var11);
            }
          }
          voice.pcmStream.fill(output, offset, frames);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("lk.G(").append(frames).append(',').append(endOffset).append(',');
          if (output == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(offset).append(',').append(obfuscationGuard).append(',');
          if (voice == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final void skipVoice(byte obfuscationGuard, int frames, MusicVoice voice) {
        MidiSynthesizer stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        MusicVoice stackIn_9_2 = null;
        boolean stackIn_10_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (obfuscationGuard >= -97) {
            this.voices = (NodeDeque) null;
          }
          if ((this.synthesizer.channelFlags[voice.channel] & 4) != 0 &&
            voice.releaseProgress < 0) {
            var4_int = this.synthesizer.field_U[voice.channel] / PcmPlayer.sampleRate;
            var5 = (-voice.field_j + var4_int + 1048575) / var4_int;
            voice.field_j = 1048575 & var4_int * frames + voice.field_j;
            if (frames >= var5) {
              if (0 == this.synthesizer.channelSampleOffset[voice.channel]) {
                voice.pcmStream = PcmStream.createWithGain(voice.sample, voice.pcmStream.getSpeed(), voice.pcmStream.getGain(), voice.pcmStream.getPan());
              } else {
                voice.pcmStream = PcmStream.createWithGain(voice.sample, voice.pcmStream.getSpeed(), 0, voice.pcmStream.getPan());
                stackIn_9_0 = this.synthesizer;
                stackIn_9_1 = false;
                stackIn_9_2 = (MusicVoice) (voice);
                stackIn_10_3 = !(voice.patch.pitchOffsets[voice.note] >= 0);
                ((MidiSynthesizer) (Object) stackIn_9_0).setVoiceStartPosition(stackIn_9_1, stackIn_9_2, stackIn_10_3);
              }
              if (voice.patch.pitchOffsets[voice.note] < 0) {
                voice.pcmStream.setLoopCount(-1);
              }
              frames = voice.field_j / var4_int;
            }
          }
          voice.pcmStream.skip(frames);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("lk.C(").append(obfuscationGuard).append(',').append(frames).append(',');
          if (voice == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final AudioStream nextSubStream() {
        MusicVoice var1_ref = null;
        do {
          var1_ref = (MusicVoice) (this.voices.next((byte) 116));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.pcmStream);
        return (AudioStream) ((Object) var1_ref.pcmStream);
    }

    final static int[] createColorRamp(int obfuscationGuard, int highRgb, int lowRgb) {
        int var10 = 0;
        int var12 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (16745759 & highRgb) >> 16;
        int var5 = (highRgb & 65300) >> 8;
        int var6 = 255 & highRgb;
        int var7 = (lowRgb & 16728276) >> 16;
        int var8 = (65533 & lowRgb) >> 8;
        int var9 = 255 & lowRgb;
        int var11 = 60 / ((obfuscationGuard + 44) / 54);
        for (var10 = 0; 256 > var10; var10++) {
          var12 = 256 - var10;
          var14[var10] = (var6 * var10 >> 8) + (var9 * var12 >> 8) + (((var5 * var10 >> 8) + (var8 * var12 >> 8) << 8) + ((var7 * var12 >> 8) + (var10 * var4 >> 8) << 16));
        }
        return var3;
    }

    public static void clearSharedReferences(int obfuscationGuard) {
        customBytePoolCounts = null;
        field_q = null;
        field_o = null;
        field_n = null;
        if (obfuscationGuard == 2143) {
          field_t = null;
          return;
        }
        MusicVoiceMixer.clearSharedReferences(-30);
        field_t = null;
    }

    MusicVoiceMixer(MidiSynthesizer synthesizer) {
        this.voices = new NodeDeque();
        this.fadingStreams = new AudioMixer();
        try {
          this.synthesizer = synthesizer;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lk.<init>(" + (synthesizer != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new QuickChatParameterType(15, 0, 1, 0);
        field_q = "ON";
    }
}
