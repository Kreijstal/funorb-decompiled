/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNoteMixer extends PcmStream {
    private MidiPcmStream field_t;
    static java.awt.Frame field_u;
    IntrusiveDeque field_p;
    static int field_q;
    static int[] field_n;
    static int[] field_m;
    static String field_r;
    PcmStreamMixer field_o;
    static int[] field_s;

    final void fill(int[] param0, int param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        MidiNote var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          this.field_o.fill(param0, param1, param2);
          var6 = (MidiNote) (this.field_p.b((byte) 86));
          while (var6 != null) {
            if (!this.field_t.b(-1, var6)) {
              var4_int = param1;
              var5 = param2;
              do {
                if (var5 <= var6.field_E) {
                  this.a(var4_int, var5, param0, var6, var5 + var4_int, 66);
                  var6.field_E = var6.field_E - var5;
                  break;
                }
                this.a(var4_int, var6.field_E, param0, var6, var5 + var4_int, 124);
                var5 = var5 - var6.field_E;
                var4_int = var4_int + var6.field_E;
              } while (!this.field_t.a(0, param0, var6, var5, var4_int));
            }
            var6 = (MidiNote) (this.field_p.d(8192));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("he.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, MidiNote param1, int param2) {
        MidiPcmStream stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_8_2 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param2 != ~(this.field_t.field_y[param1.field_F] & 4) &&
            0 > param1.field_j) {
            var4_int = this.field_t.field_Q[param1.field_F] / AudioOutput.field_l;
            var5 = (-param1.field_H + var4_int + 1048575) / var4_int;
            param1.field_H = var4_int * param0 + param1.field_H & 1048575;
            if (param0 >= var5) {
              if (this.field_t.field_o[param1.field_F] == 0) {
                param1.field_w = PcmSampleStream.createAtStepQ8(param1.field_v, param1.field_w.getRateMagnitude(), param1.field_w.getVolume(), param1.field_w.getPan());
              } else {
                param1.field_w = PcmSampleStream.createAtStepQ8(param1.field_v, param1.field_w.getRateMagnitude(), 0, param1.field_w.getPan());
                stackIn_7_0 = this.field_t;
                stackIn_7_1 = 15;
                stackIn_8_2 = !(param1.field_C.field_r[param1.field_k] >= 0);
                ((MidiPcmStream) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_8_2, param1);
              }
              if (param1.field_C.field_r[param1.field_k] < 0) {
                param1.field_w.setLoopCount(-1);
              }
              param0 = param1.field_H / var4_int;
            }
          }
          param1.field_w.skipFrames(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("he.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != -28471) {
          return;
        }
        field_n = null;
        field_u = null;
        field_r = null;
        field_m = null;
        field_s = null;
    }

    private final void a(int param0, int param1, int[] param2, MidiNote param3, int param4, int param5) {
        MidiPcmStream stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
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
        PcmSampleStream var11 = null;
        int var12 = 0;
        var12 = wizardrun.field_H;
        try {
          if ((4 & this.field_t.field_y[param3.field_F]) != 0 &&
            param3.field_j < 0) {
            var7_int = this.field_t.field_Q[param3.field_F] / AudioOutput.field_l;
            while (true) {
              var8 = (1048575 - (-var7_int + param3.field_H)) / var7_int;
              if (param1 < var8) {
                param3.field_H = param3.field_H + var7_int * param1;
                break;
              }
              param3.field_w.fill(param2, param0, var8);
              param0 = param0 + var8;
              param1 = param1 - var8;
              param3.field_H = param3.field_H + (var8 * var7_int - 1048576);
              var9 = AudioOutput.field_l / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param3.field_w;
              if (this.field_t.field_o[param3.field_F] == 0) {
                param3.field_w = PcmSampleStream.createAtStepQ8(param3.field_v, var11.getRateMagnitude(), var11.getVolume(), var11.getPan());
              } else {
                param3.field_w = PcmSampleStream.createAtStepQ8(param3.field_v, var11.getRateMagnitude(), 0, var11.getPan());
                stackIn_12_0 = this.field_t;
                stackIn_12_1 = 15;
                stackIn_13_2 = !(param3.field_C.field_r[param3.field_k] >= 0);
                ((MidiPcmStream) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_13_2, param3);
                param3.field_w.rampVolume(var9, var11.getVolume());
              }
              if (param3.field_C.field_r[param3.field_k] < 0) {
                param3.field_w.setLoopCount(-1);
              }
              var11.fadeOutAndUnlink(var9);
              var11.fill(param2, param0, -param0 + param4);
              if (!var11.isRamping()) {
                continue;
              }
              this.field_o.addStream(var11);
            }
          }
          if (param5 <= 55) {
            this.firstSubstream();
          }
          param3.field_w.fill(param2, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("he.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final PcmStream nextSubstream() {
        MidiNote var1_ref = null;
        do {
          var1_ref = (MidiNote) (this.field_p.d(8192));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_w);
        return (PcmStream) ((Object) var1_ref.field_w);
    }

    final static ae a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        ae stackIn_6_0 = null;
        ae stackIn_10_0 = null;
        ae stackIn_20_0 = null;
        ae stackIn_24_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = wizardrun.field_H;
        try {
          var2_int = param1.length();
          if (param0 < 63) {
            MidiNoteMixer.releaseStatics(8);
          }
          if (0 == var2_int) {
            stackIn_6_0 = ValidationState.field_f;
            return stackIn_6_0;
          }
          if (var2_int > 63) {
            stackIn_10_0 = kj.field_c;
            return stackIn_10_0;
          }
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param1.charAt(var3);
            if (45 == var4) {
              if (var3 == 0 ||
                -1 + var2_int == var3) {
                stackIn_20_0 = tl.field_d;
                return stackIn_20_0;
              }
            } else {
              if (-1 == jg.field_r.indexOf(var4)) {
                stackIn_24_0 = tl.field_d;
                return stackIn_24_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("he.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final PcmStream firstSubstream() {
        MidiNote var1 = (MidiNote) (this.field_p.b((byte) 124));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_w) {
          return (PcmStream) ((Object) var1.field_w);
        }
        return this.nextSubstream();
    }

    final int mixingCost() {
        return 0;
    }

    MidiNoteMixer(MidiPcmStream param0) {
        this.field_p = new IntrusiveDeque();
        this.field_o = new PcmStreamMixer();
        try {
          this.field_t = param0;
        } catch (RuntimeException runtimeException) {
          throw bd.wrapException((Throwable) ((Object) runtimeException), "he.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void skipFrames(int param0) {
        int var2;
        MidiNote var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = wizardrun.field_H;
        this.field_o.skipFrames(param0);
        var3 = (MidiNote) (this.field_p.b((byte) 122));
        while (var3 != null) {
          stackIn_4_0 = this.field_t.b(-1, var3);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = param0;
            while (var3.field_E < var2) {
              this.a(var3.field_E, var3, -1);
              var2 = var2 - var3.field_E;
              if (this.field_t.a(0, (int[]) null, var3, var2, 0)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a(var2, var3, -1);
              var3.field_E = var3.field_E - var2;
            }
          }
          var3 = (MidiNote) (this.field_p.d(8192));
        }
    }

    static {
        field_n = new int[8192];
        field_r = "Be careful of the three different creatures.";
        field_s = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
