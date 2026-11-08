/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNoteMixer extends PcmStream {
    static int field_p;
    static SpriteData[] field_q;
    IntrusiveDeque field_t;
    static int[] field_s;
    static boolean[] field_r;
    private MidiPcmStream field_u;
    PcmStreamMixer field_o;

    final void mixInto(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MusicVoice var6 = null;
        int var7 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          this.field_o.mixInto(param0, param1, param2);
          var6 = (MusicVoice) (this.field_t.first(-108));
          while (var6 != null) {
            stackIn_4_0 = this.field_u.b(73, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var5 = param2;
              var4_int = param1;
              while (var5 > var6.field_u) {
                this.a(var6, param0, var5 + var4_int, 78, var4_int, var6.field_u);
                var5 = var5 - var6.field_u;
                var4_int = var4_int + var6.field_u;
                if (this.field_u.a(param0, var4_int, var5, var6, 0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, param0, var4_int + var5, 119, var4_int, var5);
                var6.field_u = var6.field_u - var5;
              }
            }
            var6 = (MusicVoice) (this.field_t.next((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("rh.J(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(MusicVoice param0, int[] param1, int param2, int param3, int param4, int param5) {
        MidiPcmStream stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        MusicVoice stackIn_14_2 = null;
        boolean stackIn_15_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        PcmSampleStream var11 = null;
        int var12 = 0;
        MusicVoice var13 = null;
        var12 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (param3 < 54) {
            var13 = (MusicVoice) null;
            this.a((MusicVoice) null, -15, 29);
          }
          if ((4 & this.field_u.field_J[param0.field_y]) != 0 &&
            param0.field_x < 0) {
            var7_int = this.field_u.field_x[param0.field_y] / AudioOutput.field_k;
            while (true) {
              var8 = (var7_int + (1048575 - param0.field_t)) / var7_int;
              if (var8 > param5) {
                param0.field_t = param0.field_t + var7_int * param5;
                break;
              }
              param0.field_z.mixInto(param1, param4, var8);
              param4 = param4 + var8;
              param0.field_t = param0.field_t + (-1048576 + var8 * var7_int);
              param5 = param5 - var8;
              var9 = AudioOutput.field_k / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param0.field_z;
              if (this.field_u.field_R[param0.field_y] != 0) {
                param0.field_z = PcmSampleStream.createForSampleStep(param0.field_B, var11.stepMagnitude(), 0, var11.targetPan());
                stackIn_14_0 = this.field_u;
                stackIn_14_1 = 114;
                stackIn_14_2 = (MusicVoice) (param0);
                stackIn_15_3 = !(param0.field_A.field_k[param0.field_E] >= 0);
                ((MidiPcmStream) (Object) stackIn_14_0).a((byte) stackIn_14_1, stackIn_14_2, stackIn_15_3);
                param0.field_z.rampVolume(var9, var11.targetVolume());
              } else {
                param0.field_z = PcmSampleStream.createForSampleStep(param0.field_B, var11.stepMagnitude(), var11.targetVolume(), var11.targetPan());
              }
              if (param0.field_A.field_k[param0.field_E] < 0) {
                param0.field_z.setLoopCount(-1);
              }
              var11.fadeOutAndUnlink(var9);
              var11.mixInto(param1, param4, -param4 + param2);
              if (!var11.isRamping()) {
                continue;
              }
              this.field_o.addSubstream(var11);
            }
          }
          param0.field_z.mixInto(param1, param4, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("rh.F(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void skip(int param0) {
        int var2;
        MusicVoice var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_o.skip(param0);
        var3 = (MusicVoice) (this.field_t.first(-103));
        while (var3 != null) {
          stackIn_4_0 = this.field_u.b(94, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var2 > var3.field_u) {
              this.a(var3, var3.field_u, -23408);
              var2 = var2 - var3.field_u;
              if (this.field_u.a((int[]) null, 0, var2, var3, 0)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(var3, var2, -23408);
              var3.field_u = var3.field_u - var2;
            }
          }
          var3 = (MusicVoice) (this.field_t.next((byte) 18));
        }
    }

    final int activityWeight() {
        return 0;
    }

    final PcmStream firstSubstream() {
        MusicVoice var1 = (MusicVoice) (this.field_t.first(-127));
        if (var1 == null) {
          return null;
        }
        if (null == var1.field_z) {
          return this.nextSubstream();
        }
        return (PcmStream) ((Object) var1.field_z);
    }

    public static void releaseStatics(byte param0) {
        if (param0 > 47) {
          field_s = null;
          field_q = null;
          field_r = null;
          return;
        }
        MidiNoteMixer.releaseStatics((byte) 45);
        field_s = null;
        field_q = null;
        field_r = null;
    }

    private final void a(MusicVoice param0, int param1, int param2) {
        MidiPcmStream stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        MusicVoice stackIn_8_2 = null;
        boolean stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        try {
          if ((4 & this.field_u.field_J[param0.field_y]) != 0 &&
            param0.field_x < 0) {
            var4_int = this.field_u.field_x[param0.field_y] / AudioOutput.field_k;
            var5 = (var4_int + 1048575 - param0.field_t) / var4_int;
            param0.field_t = param1 * var4_int + param0.field_t & 1048575;
            if (param1 >= var5) {
              if (this.field_u.field_R[param0.field_y] == 0) {
                param0.field_z = PcmSampleStream.createForSampleStep(param0.field_B, param0.field_z.stepMagnitude(), param0.field_z.targetVolume(), param0.field_z.targetPan());
              } else {
                param0.field_z = PcmSampleStream.createForSampleStep(param0.field_B, param0.field_z.stepMagnitude(), 0, param0.field_z.targetPan());
                stackIn_8_0 = this.field_u;
                stackIn_8_1 = -56;
                stackIn_8_2 = (MusicVoice) (param0);
                stackIn_9_3 = !(param0.field_A.field_k[param0.field_E] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).a((byte) stackIn_8_1, stackIn_8_2, stackIn_9_3);
              }
              if (param0.field_A.field_k[param0.field_E] < 0) {
                param0.field_z.setLoopCount(-1);
              }
              param1 = param0.field_t / var4_int;
            }
          }
          param0.field_z.skip(param1);
          if (param2 == -23408) {
            return;
          }
          var6 = (int[]) null;
          this.a((MusicVoice) null, (int[]) null, 36, -113, -84, 67);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("rh.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final PcmStream nextSubstream() {
        MusicVoice var1;
        int var2;
        var2 = Sumoblitz.field_L ? 1 : 0;
        while (true) {
          var1 = (MusicVoice) (this.field_t.next((byte) 18));
          if (var1 == null) {
            return null;
          }
          if (var1.field_z != null) {
            return (PcmStream) ((Object) var1.field_z);
          }
        }
    }

    MidiNoteMixer(MidiPcmStream param0) {
        this.field_t = new IntrusiveDeque();
        this.field_o = new PcmStreamMixer();
        try {
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = new boolean[]{true, false, false, false, true, false, true, false, true, false, false, false, true, false, false, false, true, false, true, false, true, false, false, false, true};
        field_s = new int[13];
    }
}
