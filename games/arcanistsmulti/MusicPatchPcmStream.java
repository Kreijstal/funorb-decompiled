/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchPcmStream extends PcmStream {
    static boolean field_s;
    private MidiPcmStream field_q;
    IntrusiveDeque field_l;
    static wj[] field_p;
    static int field_o;
    static CredentialKind field_m;
    PcmStreamMixer field_n;
    static Sprite field_k;
    static String field_r;

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
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_n.mixInto(param0, param1, param2);
          var6 = (MusicPatchNode) (this.field_l.first(12623));
          scanLoop1: while (true) {
            if (var6 == null) {
              return;
            }
            stackIn_4_0 = this.field_q.discardInactiveVoice(true, var6);
            if (stackIn_4_0) {
              var6 = (MusicPatchNode) (this.field_l.next(0));
              continue;
            }
            var5 = param2;
            var4_int = param1;
            do {
              if (var5 <= var6.field_C) {
                this.renderNote(var6, var4_int, var5, var4_int + var5, param0, 59);
                var6.field_C = var6.field_C - var5;
                var6 = (MusicPatchNode) (this.field_l.next(0));
                continue scanLoop1;
              }
              this.renderNote(var6, var4_int, var6.field_C, var5 + var4_int, param0, 82);
              var4_int = var4_int + var6.field_C;
              var5 = var5 - var6.field_C;
            } while (!this.field_q.updateNote(var4_int, 24464, var5, param0, var6));
            var6 = (MusicPatchNode) (this.field_l.next(0));
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("hk.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_m = null;
        if (!param0) {
          field_r = null;
          field_p = null;
          field_k = null;
          return;
        }
        field_o = 74;
        field_r = null;
        field_p = null;
        field_k = null;
    }

    final int activity() {
        return 0;
    }

    private final void renderNote(MusicPatchNode param0, int param1, int param2, int param3, int[] param4, int param5) {
        MidiPcmStream stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        PcmSampleStream var11 = null;
        int var12 = 0;
        int var7_intLifetime1;
        var12 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if ((4 & this.field_q.field_Q[param0.field_H]) != 0 &&
            param0.field_y < 0) {
            var7_int = this.field_q.field_s[param0.field_H] / AudioOutput.field_r;
            while (true) {
              var8 = (-param0.field_l + var7_int + 1048575) / var7_int;
              if (param2 < var8) {
                param0.field_l = param0.field_l + var7_int * param2;
                break;
              }
              param0.field_n.mixInto(param4, param1, var8);
              param1 = param1 + var8;
              param0.field_l = param0.field_l + (-1048576 + var7_int * var8);
              param2 = param2 - var8;
              var9 = AudioOutput.field_r / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param0.field_n;
              if (this.field_q.field_H[param0.field_H] == 0) {
                param0.field_n = PcmSampleStream.createAtStepQ8(param0.field_m, var11.getSampleStepMagnitude(), var11.getTargetVolume(), var11.panQ14());
              } else {
                param0.field_n = PcmSampleStream.createAtStepQ8(param0.field_m, var11.getSampleStepMagnitude(), 0, var11.panQ14());
                stackIn_12_0 = this.field_q;
                stackIn_12_1 = 11132;
                stackIn_13_2 = !(0 <= param0.field_D.field_m[param0.field_t]);
                ((MidiPcmStream) (Object) stackIn_12_0).applyNoteSampleOffset(stackIn_12_1, stackIn_13_2, param0);
                param0.field_n.rampVolumeQ6(var9, var11.getTargetVolume());
              }
              if (param0.field_D.field_m[param0.field_t] < 0) {
                param0.field_n.setLoopCount(-1);
              }
              var11.d(var9);
              var11.mixInto(param4, param1, -param1 + param3);
              if (!var11.hasRemainingRampFrames()) {
                continue;
              }
              this.field_n.addSubStream(var11);
            }
          }
          var7_intLifetime1 = -125 / ((21 - param5) / 35);
          param0.field_n.mixInto(param4, param1, param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_25_0 = var7;
          stackIn_25_1 = new StringBuilder().append("hk.D(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param5).append(')').toString());
        }
    }

    final PcmStream nextSubStream() {
        MusicPatchNode var1;
        int var2;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        while (true) {
          var1 = (MusicPatchNode) (this.field_l.next(0));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_n) {
            return (PcmStream) ((Object) var1.field_n);
          }
        }
    }

    final static boolean c(int param0) {
        if (param0 == 0) {
          return null == ProxySocketConnector.field_m ? ie.field_Pb : true;
        }
        MusicPatchPcmStream.c(-43);
        return null == ProxySocketConnector.field_m ? ie.field_Pb : true;
    }

    final PcmStream firstSubStream() {
        MusicPatchNode var1 = (MusicPatchNode) (this.field_l.first(12623));
        if (var1 == null) {
          return null;
        }
        if (var1.field_n != null) {
          return (PcmStream) ((Object) var1.field_n);
        }
        return this.nextSubStream();
    }

    private final void skipNote(MusicPatchNode param0, int param1, int param2) {
        MidiPcmStream stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if ((this.field_q.field_Q[param0.field_H] & 4) != 0 &&
            0 > param0.field_y) {
            var4_int = this.field_q.field_s[param0.field_H] / AudioOutput.field_r;
            var5 = (1048575 + (var4_int - param0.field_l)) / var4_int;
            param0.field_l = 1048575 & param0.field_l + var4_int * param2;
            if (param2 >= var5) {
              if (0 != this.field_q.field_H[param0.field_H]) {
                param0.field_n = PcmSampleStream.createAtStepQ8(param0.field_m, param0.field_n.getSampleStepMagnitude(), 0, param0.field_n.panQ14());
                stackIn_8_0 = this.field_q;
                stackIn_8_1 = 11132;
                stackIn_9_2 = !(0 <= param0.field_D.field_m[param0.field_t]);
                ((MidiPcmStream) (Object) stackIn_8_0).applyNoteSampleOffset(stackIn_8_1, stackIn_9_2, param0);
              } else {
                param0.field_n = PcmSampleStream.createAtStepQ8(param0.field_m, param0.field_n.getSampleStepMagnitude(), param0.field_n.getTargetVolume(), param0.field_n.panQ14());
              }
              if (0 > param0.field_D.field_m[param0.field_t]) {
                param0.field_n.setLoopCount(-1);
              }
              param2 = param0.field_l / var4_int;
            }
          }
          if (param1 != 0) {
            MusicPatchPcmStream.c(-38);
          }
          param0.field_n.skip(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("hk.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void skip(int param0) {
        MusicPatchNode var3;
        int var4;
        boolean stackIn_4_0 = false;
        int var2;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_n.skip(param0);
        var3 = (MusicPatchNode) (this.field_l.first(12623));
        scanLoop1: while (true) {
          if (var3 == null) {
            return;
          }
          stackIn_4_0 = this.field_q.discardInactiveVoice(true, var3);
          if (stackIn_4_0) {
            var3 = (MusicPatchNode) (this.field_l.next(0));
            continue;
          }
          var2 = param0;
          do {
            if (var3.field_C >= var2) {
              this.skipNote(var3, 0, var2);
              var3.field_C = var3.field_C - var2;
              var3 = (MusicPatchNode) (this.field_l.next(0));
              continue scanLoop1;
            }
            this.skipNote(var3, 0, var3.field_C);
            var2 = var2 - var3.field_C;
          } while (!this.field_q.updateNote(0, 24464, var2, (int[]) null, var3));
          var3 = (MusicPatchNode) (this.field_l.next(0));
        }
    }

    final static void d(int param0) {
        HuffmanCodec.field_k = false;
        field_s = false;
        if (param0 == -24225) {
          DebouncedValidator.a(-1, (byte) 30);
          SceneScrollbar.field_Gb = ScreenDisplayMode.field_h;
          hb.field_Gb = ScreenDisplayMode.field_h;
          return;
        }
        MusicPatchPcmStream.b(true);
        DebouncedValidator.a(-1, (byte) 30);
        SceneScrollbar.field_Gb = ScreenDisplayMode.field_h;
        hb.field_Gb = ScreenDisplayMode.field_h;
    }

    MusicPatchPcmStream(MidiPcmStream param0) {
        this.field_l = new IntrusiveDeque();
        this.field_n = new PcmStreamMixer();
        try {
          this.field_q = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "hk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = new CredentialKind(2);
        field_r = "Password is valid";
    }
}
