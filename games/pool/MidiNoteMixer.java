/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNoteMixer extends PcmStream {
    IntrusiveDeque field_t;
    static AudioOutput field_s;
    static boolean field_v;
    static int field_r;
    private MidiPcmStream field_w;
    static ResourceArchive field_u;
    static String[] mustlogin2;
    PcmStreamMixer field_p;

    final PcmStream nextChildStream() {
        MusicVoice var1;
        while (true) {
          var1 = (MusicVoice) (this.field_t.previous((byte) -5));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_o) {
            return (PcmStream) ((Object) var1.field_o);
          }
        }
    }

    final static void requestQuitToWebsite(int obfuscationGuard) {
        if (obfuscationGuard > -21) {
          field_s = (AudioOutput) null;
          LoginEncryptionSupport.setAccountDialogResult(17, (byte) 77);
          return;
        }
        LoginEncryptionSupport.setAccountDialogResult(17, (byte) 77);
    }

    private final void skipVoice(int frames, MusicVoice voice, int obfuscationGuard) {
        MidiPcmStream stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        MusicVoice stackIn_9_2 = null;
        boolean stackIn_10_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (obfuscationGuard != 1048575) {
            return;
          }
          if ((this.field_w.field_F[voice.field_t] & 4) != 0) {
            if (voice.field_G >= 0) {
              voice.field_o.skip(frames);
              return;
            }
            var4_int = this.field_w.field_L[voice.field_t] / AudioOutput.sampleRate;
            var5 = (-voice.field_y + (var4_int + 1048575)) / var4_int;
            voice.field_y = voice.field_y + var4_int * frames & 1048575;
            if (var5 <= frames) {
              if (this.field_w.field_U[voice.field_t] == 0) {
                voice.field_o = PcmSampleStream.createAtStepQ8(voice.field_C, voice.field_o.getSampleStepMagnitude(), voice.field_o.getVolume(), voice.field_o.getPan());
              } else {
                voice.field_o = PcmSampleStream.createAtStepQ8(voice.field_C, voice.field_o.getSampleStepMagnitude(), 0, voice.field_o.getPan());
                stackIn_9_0 = this.field_w;
                stackIn_9_1 = obfuscationGuard - 1048698;
                stackIn_9_2 = (MusicVoice) (voice);
                stackIn_10_3 = !(voice.field_u.field_s[voice.field_A] >= 0);
                ((MidiPcmStream) (Object) stackIn_9_0).applyNoteSampleOffset(stackIn_9_1, stackIn_9_2, stackIn_10_3);
              }
              if (voice.field_u.field_s[voice.field_A] < 0) {
                voice.field_o.setLoopCount(-1);
              }
              frames = voice.field_y / var4_int;
            }
          }
          voice.field_o.skip(frames);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ib.I(").append(frames).append(',');
          if (voice == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void mixVoice(int offset, int endOffset, MusicVoice voice, int obfuscationGuard, int frames, int[] destination) {
        MidiPcmStream stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        MusicVoice stackIn_14_2 = null;
        boolean stackIn_15_3;
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
        PcmSampleStream var11 = null;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          if ((4 & this.field_w.field_F[voice.field_t]) != 0 &&
            voice.field_G < 0) {
            var7_int = this.field_w.field_L[voice.field_t] / AudioOutput.sampleRate;
            while (true) {
              var8 = (1048575 + var7_int - voice.field_y) / var7_int;
              if (frames < var8) {
                voice.field_y = voice.field_y + frames * var7_int;
                break;
              }
              voice.field_o.mixInto(destination, offset, var8);
              frames = frames - var8;
              voice.field_y = voice.field_y + (-1048576 + var8 * var7_int);
              offset = offset + var8;
              var9 = AudioOutput.sampleRate / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = voice.field_o;
              if (this.field_w.field_U[voice.field_t] != 0) {
                voice.field_o = PcmSampleStream.createAtStepQ8(voice.field_C, var11.getSampleStepMagnitude(), 0, var11.getPan());
                stackIn_14_0 = this.field_w;
                stackIn_14_1 = -125;
                stackIn_14_2 = (MusicVoice) (voice);
                stackIn_15_3 = !(voice.field_u.field_s[voice.field_A] >= 0);
                ((MidiPcmStream) (Object) stackIn_14_0).applyNoteSampleOffset(stackIn_14_1, stackIn_14_2, stackIn_15_3);
                voice.field_o.rampVolume(var9, var11.getVolume());
              } else {
                voice.field_o = PcmSampleStream.createAtStepQ8(voice.field_C, var11.getSampleStepMagnitude(), var11.getVolume(), var11.getPan());
              }
              if (voice.field_u.field_s[voice.field_A] < 0) {
                voice.field_o.setLoopCount(-1);
              }
              var11.fadeOutAndUnlink(var9);
              var11.mixInto(destination, offset, endOffset - offset);
              if (!var11.isRamping()) {
                continue;
              }
              this.field_p.addSubstream(var11);
            }
          }
          if (obfuscationGuard != 1048575) {
            MidiNoteMixer.requestQuitToWebsite(-60);
          }
          voice.field_o.mixInto(destination, offset, frames);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("ib.A(").append(offset).append(',').append(endOffset).append(',');
          if (voice == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(obfuscationGuard).append(',').append(frames).append(',');
          if (destination == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final PcmStream firstChildStream() {
        MusicVoice var1 = (MusicVoice) (this.field_t.last((byte) 76));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_o) {
          return this.nextChildStream();
        }
        return (PcmStream) ((Object) var1.field_o);
    }

    final void mixInto(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MusicVoice var6 = null;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          this.field_p.mixInto(param0, param1, param2);
          var6 = (MusicVoice) (this.field_t.last((byte) -67));
          while (var6 != null) {
            if (!this.field_w.a(-16257, var6)) {
              var5 = param2;
              var4_int = param1;
              do {
                if (var6.field_D >= var5) {
                  this.mixVoice(var4_int, var4_int + var5, var6, 1048575, var5, param0);
                  var6.field_D = var6.field_D - var5;
                  break;
                }
                this.mixVoice(var4_int, var4_int + var5, var6, 1048575, var6.field_D, param0);
                var5 = var5 - var6.field_D;
                var4_int = var4_int + var6.field_D;
              } while (!this.field_w.advanceNoteAndHandleCompletion(var5, param0, var4_int, 1, var6));
            }
            var6 = (MusicVoice) (this.field_t.previous((byte) -5));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ib.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_s = null;
        if (param0 != -1) {
          mustlogin2 = (String[]) null;
          field_u = null;
          mustlogin2 = null;
          return;
        }
        field_u = null;
        mustlogin2 = null;
    }

    final static int[] toFixed3Array(double[] values, int obfuscationGuard) {
        RuntimeException var2 = null;
        int[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -30100) {
            MidiNoteMixer.releaseStatics(-75);
          }
          stackIn_3_0 = AccountStateQuery.a(3, -20607, values);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ib.J(");
          if (values == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void skip(int length) {
        int var2;
        MusicVoice var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Pool.field_O;
        this.field_p.skip(length);
        var3 = (MusicVoice) (this.field_t.last((byte) -20));
        while (var3 != null) {
          stackIn_4_0 = this.field_w.a(-16257, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = length;
            while (var2 > var3.field_D) {
              this.skipVoice(var3.field_D, var3, 1048575);
              var2 = var2 - var3.field_D;
              if (this.field_w.advanceNoteAndHandleCompletion(var2, (int[]) null, 0, 1, var3)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.skipVoice(var2, var3, 1048575);
              var3.field_D = var3.field_D - var2;
            }
          }
          var3 = (MusicVoice) (this.field_t.previous((byte) -5));
        }
    }

    MidiNoteMixer(MidiPcmStream param0) {
        this.field_t = new IntrusiveDeque();
        this.field_p = new PcmStreamMixer();
        try {
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "ib.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        mustlogin2 = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
    }
}
