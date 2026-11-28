/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchPcmStream extends PcmStream {
    static String field_k;
    private MidiPcmStream field_p;
    static mj field_o;
    static int field_n;
    IntrusiveDeque field_m;
    PcmStreamMixer field_l;

    final PcmStream firstChildStream() {
        MusicPatchNode var1 = (MusicPatchNode) (this.field_m.beginForward((byte) -52));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_i) {
          return this.nextChildStream();
        }
        return (PcmStream) ((Object) var1.field_i);
    }

    private final void renderVoiceFrames(int[] param0, int param1, int param2, MusicPatchNode param3, byte param4, int param5) {
        MidiPcmStream stackIn_13_0 = null;
        MusicPatchNode stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        boolean stackIn_14_3;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RawPcmStream var11 = null;
        int var12 = 0;
        var12 = Bounce.field_N;
        try {
          if ((this.field_p.field_l[param3.field_E] & 4) != 0 &&
            param3.field_C < 0) {
            var7_int = this.field_p.field_K[param3.field_E] / AudioOutput.field_r;
            while (true) {
              var8 = (var7_int + 1048575 - param3.field_u) / var7_int;
              if (var8 > param2) {
                param3.field_u = param3.field_u + param2 * var7_int;
                break;
              }
              param3.field_i.mixInto(param0, param5, var8);
              param2 = param2 - var8;
              param3.field_u = param3.field_u + (var8 * var7_int - 1048576);
              param5 = param5 + var8;
              var9 = AudioOutput.field_r / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param3.field_i;
              if (this.field_p.field_s[param3.field_E] != 0) {
                param3.field_i = RawPcmStream.createForSampleStep(param3.field_w, var11.getSampleStepMagnitude(), 0, var11.getPan());
                stackIn_13_0 = this.field_p;
                stackIn_13_1 = (MusicPatchNode) (param3);
                stackIn_13_2 = -115;
                stackIn_14_3 = !(param3.field_D.field_n[param3.field_r] >= 0);
                ((MidiPcmStream) (Object) stackIn_13_0).applySampleOffset(stackIn_13_1, (byte) stackIn_13_2, stackIn_14_3);
                param3.field_i.rampVolume(var9, var11.getTargetVolume());
              } else {
                param3.field_i = RawPcmStream.createForSampleStep(param3.field_w, var11.getSampleStepMagnitude(), var11.getTargetVolume(), var11.getPan());
              }
              if (param3.field_D.field_n[param3.field_r] < 0) {
                param3.field_i.setLoopCount(-1);
              }
              var11.fadeOutAndUnlink(var9);
              var11.mixInto(param0, param5, param1 - param5);
              if (!var11.hasRemainingRampFrames()) {
                continue;
              }
              this.field_l.addChildStream(var11);
            }
          }
          param3.field_i.mixInto(param0, param5, param2);
          if (param4 < -54) {
            return;
          }
          this.skipFrames(-79);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("ka.A(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void skipVoiceFrames(MusicPatchNode param0, int param1, int param2) {
        MidiPcmStream stackIn_8_0 = null;
        MusicPatchNode stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        boolean stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_p.field_l[param0.field_E] & 4) != 0 &&
            param0.field_C < 0) {
            var4_int = this.field_p.field_K[param0.field_E] / AudioOutput.field_r;
            var5 = (-param0.field_u + (1048575 + var4_int)) / var4_int;
            param0.field_u = param0.field_u + var4_int * param1 & 1048575;
            if (var5 <= param1) {
              if (this.field_p.field_s[param0.field_E] != 0) {
                param0.field_i = RawPcmStream.createForSampleStep(param0.field_w, param0.field_i.getSampleStepMagnitude(), 0, param0.field_i.getPan());
                stackIn_8_0 = this.field_p;
                stackIn_8_1 = (MusicPatchNode) (param0);
                stackIn_8_2 = -128;
                stackIn_9_3 = !(param0.field_D.field_n[param0.field_r] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).applySampleOffset(stackIn_8_1, (byte) stackIn_8_2, stackIn_9_3);
              } else {
                param0.field_i = RawPcmStream.createForSampleStep(param0.field_w, param0.field_i.getSampleStepMagnitude(), param0.field_i.getTargetVolume(), param0.field_i.getPan());
              }
              if (0 > param0.field_D.field_n[param0.field_r]) {
                param0.field_i.setLoopCount(-1);
              }
              param1 = param0.field_u / var4_int;
            }
          }
          if (param2 >= -58) {
            field_k = (String) null;
          }
          param0.field_i.skipFrames(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("ka.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void resetStaticState(int param0) {
        field_o = null;
        field_k = null;
        if (param0 == 0) {
          return;
        }
        field_n = 46;
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
        var7 = Bounce.field_N;
        try {
          this.field_l.mixInto(param0, param1, param2);
          var6 = (MusicPatchNode) (this.field_m.beginForward((byte) -49));
          while (var6 != null) {
            stackIn_4_0 = this.field_p.isVoiceInactive(var6, 8335400);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_j) {
                this.renderVoiceFrames(param0, var4_int + var5, var6.field_j, var6, (byte) -109, var4_int);
                var4_int = var4_int + var6.field_j;
                var5 = var5 - var6.field_j;
                if (this.field_p.updateVoice(param0, var5, var4_int, var6, (byte) 106)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.renderVoiceFrames(param0, var4_int + var5, var5, var6, (byte) -70, var4_int);
                var6.field_j = var6.field_j - var5;
              }
            }
            var6 = (MusicPatchNode) (this.field_m.nextForward((byte) 127));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ka.P(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.removeMouseListener(EmailFormatValidator.field_o);
          if (param1 > -72) {
            field_k = (String) null;
          }
          param0.removeMouseMotionListener(EmailFormatValidator.field_o);
          param0.removeFocusListener(EmailFormatValidator.field_o);
          c.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "ka.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final PcmStream nextChildStream() {
        MusicPatchNode var1;
        while (true) {
          var1 = (MusicPatchNode) (this.field_m.nextForward((byte) -94));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_i) {
            return (PcmStream) ((Object) var1.field_i);
          }
        }
    }

    final void skipFrames(int param0) {
        int var2;
        MusicPatchNode var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Bounce.field_N;
        this.field_l.skipFrames(param0);
        var3 = (MusicPatchNode) (this.field_m.beginForward((byte) -91));
        while (var3 != null) {
          stackIn_4_0 = this.field_p.isVoiceInactive(var3, 8335400);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var2 > var3.field_j) {
              this.skipVoiceFrames(var3, var3.field_j, -124);
              var2 = var2 - var3.field_j;
              if (this.field_p.updateVoice((int[]) null, var2, 0, var3, (byte) 112)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.skipVoiceFrames(var3, var2, -96);
              var3.field_j = var3.field_j - var2;
            }
          }
          var3 = (MusicPatchNode) (this.field_m.nextForward((byte) -101));
        }
    }

    MusicPatchPcmStream(MidiPcmStream param0) {
        this.field_m = new IntrusiveDeque();
        this.field_l = new PcmStreamMixer();
        try {
          this.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "ka.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Keys";
    }
}
