/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends AudioStream {
    static th field_o;
    static RgbSprite field_t;
    private ie field_r;
    NodeDeque field_v;
    static int field_p;
    static boolean field_s;
    static RgbSprite[] field_n;
    static int[] field_u;
    static String field_q;
    AudioMixer field_m;

    final void fill(int[] output, int offset, int frames) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          this.field_m.fill(output, offset, frames);
          var6 = (ka) (this.field_v.first(-123));
          while (var6 != null) {
            if (!this.field_r.a(var6, -128)) {
              var4_int = offset;
              var5 = frames;
              do {
                if (var6.field_z >= var5) {
                  this.a(var5, var5 + var4_int, output, var4_int, -1048576, var6);
                  var6.field_z = var6.field_z - var5;
                  break;
                }
                this.a(var6.field_z, var4_int + var5, output, var4_int, -1048576, var6);
                var5 = var5 - var6.field_z;
                var4_int = var4_int + var6.field_z;
              } while (!this.field_r.a(23300, output, var5, var6, var4_int));
            }
            var6 = (ka) (this.field_v.next((byte) 116));
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
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(offset).append(',').append(frames).append(')').toString());
        }
    }

    final void skip(int frames) {
        int var2;
        ka var3;
        int var4;
        boolean stackIn_4_0 = false;
        var4 = BrickABrac.field_J ? 1 : 0;
        this.field_m.skip(frames);
        var3 = (ka) (this.field_v.first(-18));
        while (var3 != null) {
          stackIn_4_0 = this.field_r.a(var3, -112);
          boolean decompiledFrameCompleted0 = true;
          if (!stackIn_4_0) {
            var2 = frames;
            while (var3.field_z < var2) {
              this.a((byte) -128, var3.field_z, var3);
              var2 = var2 - var3.field_z;
              if (this.field_r.a(23300, (int[]) null, var2, var3, 0)) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              this.a((byte) -109, var2, var3);
              var3.field_z = var3.field_z - var2;
            }
          }
          var3 = (ka) (this.field_v.next((byte) 116));
        }
    }

    final int getSchedulingCost() {
        return 0;
    }

    final AudioStream firstSubStream() {
        ka var1 = (ka) (this.field_v.first(-81));
        if (var1 == null) {
          return null;
        }
        if (var1.field_y != null) {
          return (AudioStream) ((Object) var1.field_y);
        }
        return this.nextSubStream();
    }

    private final void a(int param0, int param1, int[] param2, int param3, int param4, ka param5) {
        ie stackIn_15_0 = null;
        boolean stackIn_15_1 = false;
        ka stackIn_15_2 = null;
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
          if (param4 != -1048576) {
            return;
          }
          if ((4 & this.field_r.field_n[param5.field_u]) != 0 &&
            0 > param5.field_x) {
            var7_int = this.field_r.field_U[param5.field_u] / PcmPlayer.sampleRate;
            while (true) {
              var8 = (1048575 - (-var7_int + param5.field_j)) / var7_int;
              if (var8 > param0) {
                param5.field_j = param5.field_j + param0 * var7_int;
                break;
              }
              param5.field_y.fill(param2, param3, var8);
              param0 = param0 - var8;
              param5.field_j = param5.field_j + (var7_int * var8 - 1048576);
              param3 = param3 + var8;
              var9 = PcmPlayer.sampleRate / 100;
              var10 = 262144 / var7_int;
              if (var10 < var9) {
                var9 = var10;
              }
              var11 = param5.field_y;
              if (this.field_r.field_y[param5.field_u] == 0) {
                param5.field_y = PcmStream.createWithGain(param5.field_F, var11.getSpeed(), var11.getGain(), var11.getPan());
              } else {
                param5.field_y = PcmStream.createWithGain(param5.field_F, var11.getSpeed(), 0, var11.getPan());
                stackIn_15_0 = this.field_r;
                stackIn_15_1 = false;
                stackIn_15_2 = (ka) (param5);
                stackIn_16_3 = !(param5.field_k.field_j[param5.field_B] >= 0);
                ((ie) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, stackIn_16_3);
                param5.field_y.rampGain(var9, var11.getGain());
              }
              if (param5.field_k.field_j[param5.field_B] < 0) {
                param5.field_y.setLoopCount(-1);
              }
              var11.fadeOut(var9);
              var11.fill(param2, param3, -param3 + param1);
              if (!var11.isRamping()) {
                continue;
              }
              this.field_m.addStream(var11);
            }
          }
          param5.field_y.fill(param2, param3, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("lk.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, ka param2) {
        ie stackIn_9_0 = null;
        boolean stackIn_9_1 = false;
        ka stackIn_9_2 = null;
        boolean stackIn_10_3;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (param0 >= -97) {
            this.field_v = (NodeDeque) null;
          }
          if ((this.field_r.field_n[param2.field_u] & 4) != 0 &&
            param2.field_x < 0) {
            var4_int = this.field_r.field_U[param2.field_u] / PcmPlayer.sampleRate;
            var5 = (-param2.field_j + var4_int + 1048575) / var4_int;
            param2.field_j = 1048575 & var4_int * param1 + param2.field_j;
            if (param1 >= var5) {
              if (0 == this.field_r.field_y[param2.field_u]) {
                param2.field_y = PcmStream.createWithGain(param2.field_F, param2.field_y.getSpeed(), param2.field_y.getGain(), param2.field_y.getPan());
              } else {
                param2.field_y = PcmStream.createWithGain(param2.field_F, param2.field_y.getSpeed(), 0, param2.field_y.getPan());
                stackIn_9_0 = this.field_r;
                stackIn_9_1 = false;
                stackIn_9_2 = (ka) (param2);
                stackIn_10_3 = !(param2.field_k.field_j[param2.field_B] >= 0);
                ((ie) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_10_3);
              }
              if (param2.field_k.field_j[param2.field_B] < 0) {
                param2.field_y.setLoopCount(-1);
              }
              param1 = param2.field_j / var4_int;
            }
          }
          param2.field_y.skip(param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_19_0 = var4;
          stackIn_19_1 = new StringBuilder().append("lk.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final AudioStream nextSubStream() {
        ka var1_ref = null;
        do {
          var1_ref = (ka) (this.field_v.next((byte) 116));
          if (var1_ref == null) {
            return null;
          }
        } while (null == var1_ref.field_y);
        return (AudioStream) ((Object) var1_ref.field_y);
    }

    final static int[] a(int param0, int param1, int param2) {
        int var10 = 0;
        int var12 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (16745759 & param1) >> 16;
        int var5 = (param1 & 65300) >> 8;
        int var6 = 255 & param1;
        int var7 = (param2 & 16728276) >> 16;
        int var8 = (65533 & param2) >> 8;
        int var9 = 255 & param2;
        int var11 = 60 / ((param0 + 44) / 54);
        for (var10 = 0; 256 > var10; var10++) {
          var12 = 256 - var10;
          var14[var10] = (var6 * var10 >> 8) + (var9 * var12 >> 8) + (((var5 * var10 >> 8) + (var8 * var12 >> 8) << 8) + ((var7 * var12 >> 8) + (var10 * var4 >> 8) << 16));
        }
        return var3;
    }

    public static void c(int param0) {
        field_u = null;
        field_q = null;
        field_o = null;
        field_n = null;
        if (param0 == 2143) {
          field_t = null;
          return;
        }
        lk.c(-30);
        field_t = null;
    }

    lk(ie param0) {
        this.field_v = new NodeDeque();
        this.field_m = new AudioMixer();
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "lk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_o = new th(15, 0, 1, 0);
        field_q = "ON";
    }
}
