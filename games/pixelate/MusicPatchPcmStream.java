/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchPcmStream extends PcmStream {
    static Sprite field_p;
    static String field_q;
    static String field_t;
    IntrusiveDeque field_r;
    private MidiPcmStream sequencer;
    PcmStreamMixer field_o;

    final static ConditionalTextValue e(int param0) {
        String var1 = null;
        String var1Lifetime1;
        if (param0 == 100) {
          var1 = ProxySocketConnector.f(8192);
          if (var1 != null &&
            var1.indexOf('@') >= 0) {
            var1 = "";
          }
          return new ConditionalTextValue(ProxySocketConnector.f(8192), OptionsScreen.g(120));
        }
        field_p = (Sprite) null;
        var1Lifetime1 = ProxySocketConnector.f(8192);
        if (var1Lifetime1 != null &&
          var1Lifetime1.indexOf('@') >= 0) {
          var1Lifetime1 = "";
        }
        return new ConditionalTextValue(ProxySocketConnector.f(8192), OptionsScreen.g(120));
    }

    final PcmStream nextSubStream() {
        MusicPatchNode var1_ref = null;
        int var2 = Pixelate.field_H ? 1 : 0;
        do {
          var1_ref = (MusicPatchNode) (this.field_r.last(1504642273));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_G);
        return (PcmStream) ((Object) var1_ref.field_G);
    }

    final PcmStream firstSubStream() {
        MusicPatchNode var1 = (MusicPatchNode) (this.field_r.c(1504642273));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_G) {
          return this.nextSubStream();
        }
        return (PcmStream) ((Object) var1.field_G);
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        wa.field_i = param0;
        if (HuffmanCodec.field_b != qh.field_c) {
          var2 = qh.field_c * qh.field_c;
          var3 = -(HuffmanCodec.field_b * HuffmanCodec.field_b) + var2;
          param0 = param0 + var3 * (MatchingTextValidator.field_o - param0) / var2;
        }
        ui.field_i.a(param0, 120, TextTableInitializer.field_c, 256, 640);
        ArchiveProvider.a(MatchingTextValidator.field_o - 24, (byte) 123, 640, PlayerBoard.field_q, 5, 0, MouseWheelHandler.field_c);
        if (param1 != 112) {
          MusicPatchPcmStream.e(92);
          return;
        }
    }

    final void mixInto(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MusicPatchNode var6 = null;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          this.field_o.mixInto(param0, param1, param2);
          var6 = (MusicPatchNode) (this.field_r.c(1504642273));
          while (var6 != null) {
            stackIn_4_0 = this.sequencer.discardInactiveVoice(var6, (byte) 75);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var6.field_E < var5) {
                this.renderNote(var6, var5 + var4_int, var4_int, param0, -1, var6.field_E);
                var5 = var5 - var6.field_E;
                var4_int = var4_int + var6.field_E;
                if (this.sequencer.updateNote(var5, var6, var4_int, false, param0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.renderNote(var6, var4_int + var5, var4_int, param0, -1, var5);
                var6.field_E = var6.field_E - var5;
              }
            }
            var6 = (MusicPatchNode) (this.field_r.last(1504642273));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("km.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void skip(int param0) {
        int var2;
        MusicPatchNode var3;
        int var4;
        var4 = Pixelate.field_H ? 1 : 0;
        this.field_o.skip(param0);
        var3 = (MusicPatchNode) (this.field_r.c(1504642273));
        while (var3 != null) {
          if (!this.sequencer.discardInactiveVoice(var3, (byte) 75)) {
            var2 = param0;
            do {
              if (var3.field_E >= var2) {
                this.skipNote(var2, 9380, var3);
                var3.field_E = var3.field_E - var2;
                break;
              }
              this.skipNote(var3.field_E, 9380, var3);
              var2 = var2 - var3.field_E;
            } while (!this.sequencer.updateNote(var2, var3, 0, false, (int[]) null));
          }
          var3 = (MusicPatchNode) (this.field_r.last(1504642273));
        }
    }

    private final void renderNote(MusicPatchNode param0, int param1, int param2, int[] param3, int param4, int param5) {
        MidiPcmStream stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        PcmSampleStream var11 = null;
        int var12 = 0;
        var12 = Pixelate.field_H ? 1 : 0;
        try {
          if (param4 != ~(4 & this.sequencer.channelFlags[param0.field_I]) &&
            0 > param0.field_v) {
            var7_int = this.sequencer.field_I[param0.field_I] / AudioOutput.field_h;
            while (true) {
              var8 = (1048575 - (-var7_int + param0.field_n)) / var7_int;
              if (var8 > param5) {
                param0.field_n = param0.field_n + param5 * var7_int;
                break;
              }
              param0.field_G.mixInto(param3, param2, var8);
              param2 = param2 + var8;
              param0.field_n = param0.field_n + (var8 * var7_int - 1048576);
              param5 = param5 - var8;
              var9 = AudioOutput.field_h / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.field_G;
              if (this.sequencer.channelSampleOffset[param0.field_I] == 0) {
                param0.field_G = PcmSampleStream.createAtStepQ8(param0.field_F, var11.getSampleStepMagnitude(), var11.getTargetVolume(), var11.panQ14());
              } else {
                param0.field_G = PcmSampleStream.createAtStepQ8(param0.field_F, var11.getSampleStepMagnitude(), 0, var11.panQ14());
                stackIn_11_0 = this.sequencer;
                stackIn_12_1 = !(param0.field_x.field_u[param0.field_A] >= 0);
                ((MidiPcmStream) (Object) stackIn_11_0).applyNoteSampleOffset(stackIn_12_1, (byte) 118, param0);
                param0.field_G.rampVolumeQ6(var9, var11.getTargetVolume());
              }
              if (0 > param0.field_x.field_u[param0.field_A]) {
                param0.field_G.setLoopCount(-1);
              }
              var11.fadeOut(var9);
              var11.mixInto(param3, param2, -param2 + param1);
              if (!var11.hasRemainingRampFrames()) {
                continue;
              }
              this.field_o.a(var11);
            }
          }
          param0.field_G.mixInto(param3, param2, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("km.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int activity() {
        return 0;
    }

    public static void a(byte param0) {
        field_p = null;
        field_t = null;
        field_q = null;
        if (param0 >= 101) {
          return;
        }
        MusicPatchPcmStream.e(-33);
    }

    private final void skipNote(int param0, int param1, MusicPatchNode param2) {
        MidiPcmStream stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.sequencer.channelFlags[param2.field_I] & 4) != 0 &&
            param2.field_v < 0) {
            var4_int = this.sequencer.field_I[param2.field_I] / AudioOutput.field_h;
            var5 = (1048575 + var4_int - param2.field_n) / var4_int;
            param2.field_n = param2.field_n + param0 * var4_int & 1048575;
            if (var5 <= param0) {
              if (this.sequencer.channelSampleOffset[param2.field_I] != 0) {
                param2.field_G = PcmSampleStream.createAtStepQ8(param2.field_F, param2.field_G.getSampleStepMagnitude(), 0, param2.field_G.panQ14());
                stackIn_8_0 = this.sequencer;
                stackIn_9_1 = !(param2.field_x.field_u[param2.field_A] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).applyNoteSampleOffset(stackIn_9_1, (byte) 118, param2);
              } else {
                param2.field_G = PcmSampleStream.createAtStepQ8(param2.field_F, param2.field_G.getSampleStepMagnitude(), param2.field_G.getTargetVolume(), param2.field_G.panQ14());
              }
              if (param2.field_x.field_u[param2.field_A] < 0) {
                param2.field_G.setLoopCount(-1);
              }
              param0 = param2.field_n / var4_int;
            }
          }
          param2.field_G.skip(param0);
          if (param1 == 9380) {
            return;
          }
          this.sequencer = (MidiPcmStream) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("km.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    MusicPatchPcmStream(MidiPcmStream param0) {
        this.field_r = new IntrusiveDeque();
        this.field_o = new PcmStreamMixer();
        try {
          this.sequencer = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "km.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_q = "Average rating";
        field_t = "Respect";
    }
}
