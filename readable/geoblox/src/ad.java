/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends ia {
    private kj field_k;
    static String fullscreenFocusOrResolutionText;
    static boolean field_p;
    IntrusiveDeque field_l;
    static int field_j;
    ob field_m;
    static int field_o;

    public static void c(int param0) {
        fullscreenFocusOrResolutionText = null;
        if (param0 != -1) {
            ad.a((byte) -81);
        }
    }

    final int d() {
        return 0;
    }

    final void a(int[] param0, int param1, int param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pc var6 = null;
        try {
          this.field_m.a(param0, param1, param2);
          var6 = (pc) ((Object) this.field_l.firstForIteration(0));
          while (var6 != null) {
            L1: {
              if (!this.field_k.b(var6, -1)) {
                var4_int = param1;
                var5 = param2;
                while (true) {
                  if (var5 <= var6.field_g) {
                    this.a(var5, (byte) -69, var5 + var4_int, param0, var6, var4_int);
                    var6.field_g = var6.field_g - var5;
                    break L1;
                  }
                  this.a(var6.field_g, (byte) -37, var4_int + var5, param0, var6, var4_int);
                  var5 = var5 - var6.field_g;
                  var4_int = var4_int + var6.field_g;
                  if (!this.field_k.a(var5, var4_int, param0, var6, false)) {
                    continue;
                  }
                  break L1;
                }
              }
            }
            var6 = (pc) ((Object) this.field_l.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var4);
          stackIn_14_1 = new StringBuilder().append("ad.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, pc param1, int param2) {
        kj stackIn_6_0 = null;
        pc stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        boolean stackIn_7_3;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (((this.field_k.field_m[param1.field_t] & 4) != 0) &&
              (param1.field_y < 0)) {
            var4_int = this.field_k.field_n[param1.field_t] / AudioOutput.sampleRateHz;
            var5 = (-param1.field_B + (1048575 + var4_int)) / var4_int;
            param1.field_B = 1048575 & param1.field_B + param2 * var4_int;
            if (param2 >= var5) {
              if (this.field_k.field_u[param1.field_t] == 0) {
                param1.field_u = PcmSampleStream.a(param1.field_i, param1.field_u.h(), param1.field_u.i(), param1.field_u.k());
              } else {
                param1.field_u = PcmSampleStream.a(param1.field_i, param1.field_u.h(), 0, param1.field_u.k());
                stackIn_6_0 = this.field_k;
                stackIn_6_1 = (pc) (param1);
                stackIn_6_2 = -70;
                if (param1.field_z.pitchOffsetsAndLoopFlag[param1.field_D] >= 0) {
                  stackIn_7_3 = false;
                } else {
                  stackIn_7_3 = true;
                }
                ((kj) (Object) stackIn_6_0).a(stackIn_6_1, (byte) stackIn_6_2, stackIn_7_3);
              }
              if (param1.field_z.pitchOffsetsAndLoopFlag[param1.field_D] < 0) {
                param1.field_u.g(-1);
              }
              param2 = param1.field_B / var4_int;
            }
          }
          if (param0 != -1) {
            return;
          }
          param1.field_u.b(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = (RuntimeException) (var4);
          stackIn_18_1 = new StringBuilder().append("ad.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        Sprite var1 = null;
        Sprite var2 = null;
        int var3 = 0;
        int var4 = Geoblox.field_C;
        try {
            if (param0 != -32) {
                field_p = false;
            }
            var1 = new Sprite(540, 140);
            Geoblox.setRasterTarget(1, var1);
            TriangleRasterState.prepareTriangleClipFromRasterizer();
            SoftwareRasterizer.clearFramebuffer();
            gb.logoAnimationTick = 0;
            ck.renderLogoMeshes((byte) -73);
            var2 = var1.copy();
            for (var3 = 0; var3 < 15; var3++) {
                var2.drawSilhouette(-2, -2, 16777215);
                SoftwareRasterizer.blurRasterRegion(4, 4, 0, 0, 540, 140);
            }
            cd.field_l.setAsRasterTarget();
            var1.drawHalfSize(0, 0);
            id.a(true);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ad.H(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int var2;
        pc var3;
        this.field_m.b(param0);
        var3 = (pc) ((Object) this.field_l.firstForIteration(0));
        while (var3 != null) {
          L1: {
            if (!this.field_k.b(var3, -1)) {
              var2 = param0;
              while (var2 > var3.field_g) {
                this.a(-1, var3, var3.field_g);
                var2 = var2 - var3.field_g;
                if (this.field_k.a(var2, 0, (int[]) null, var3, false)) {
                  break L1;
                }
              }
              this.a(-1, var3, var2);
              var3.field_g = var3.field_g - var2;
            }
          }
          var3 = (pc) ((Object) this.field_l.nextForIteration(1));
        }
    }

    final ia c() {
        pc var1;
        int var2;
        var2 = Geoblox.field_C;
        while (true) {
          var1 = (pc) ((Object) this.field_l.nextForIteration(1));
          if (var1 == null) {
            return null;
          }
          if (var1.field_u != null) {
            return (ia) ((Object) var1.field_u);
          }
          continue;
        }
    }

    final ia b() {
        pc var1 = (pc) ((Object) this.field_l.firstForIteration(0));
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_u)) {
            return (ia) ((Object) var1.field_u);
        }
        return this.c();
    }

    private final void a(int param0, byte param1, int param2, int[] param3, pc param4, int param5) {
        kj stackIn_11_0 = null;
        pc stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        boolean stackIn_12_3;
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
        try {
          L0: {
            if (((4 & this.field_k.field_m[param4.field_t]) != 0) &&
                (param4.field_y < 0)) {
              var7_int = this.field_k.field_n[param4.field_t] / AudioOutput.sampleRateHz;
              while (true) {
                var8 = (-param4.field_B + (var7_int + 1048575)) / var7_int;
                if (param0 < var8) {
                  param4.field_B = param4.field_B + param0 * var7_int;
                  break L0;
                }
                param4.field_u.a(param3, param5, var8);
                param0 = param0 - var8;
                param5 = param5 + var8;
                param4.field_B = param4.field_B + (-1048576 + var7_int * var8);
                var9 = AudioOutput.sampleRateHz / 100;
                var10 = 262144 / var7_int;
                if (var10 < var9) {
                  var9 = var10;
                }
                var11 = param4.field_u;
                if (this.field_k.field_u[param4.field_t] == 0) {
                  param4.field_u = PcmSampleStream.a(param4.field_i, var11.h(), var11.i(), var11.k());
                } else {
                  param4.field_u = PcmSampleStream.a(param4.field_i, var11.h(), 0, var11.k());
                  stackIn_11_0 = this.field_k;
                  stackIn_11_1 = (pc) (param4);
                  stackIn_11_2 = -70;
                  if (param4.field_z.pitchOffsetsAndLoopFlag[param4.field_D] >= 0) {
                    stackIn_12_3 = false;
                  } else {
                    stackIn_12_3 = true;
                  }
                  ((kj) (Object) stackIn_11_0).a(stackIn_11_1, (byte) stackIn_11_2, stackIn_12_3);
                  param4.field_u.c(var9, var11.i());
                }
                if (param4.field_z.pitchOffsetsAndLoopFlag[param4.field_D] < 0) {
                  param4.field_u.g(-1);
                }
                var11.c(var9);
                var11.a(param3, param5, param2 - param5);
                if (!var11.g()) {
                  continue;
                }
                this.field_m.a(var11);
                continue;
              }
            }
          }
          if (param1 >= -26) {
            return;
          }
          param4.field_u.a(param3, param5, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = (RuntimeException) (var7);
          stackIn_26_1 = new StringBuilder().append("ad.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param4 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param5).append(')').toString());
        }
    }

    ad(kj param0) {
        this.field_l = new IntrusiveDeque();
        this.field_m = new ob();
        try {
            this.field_k = param0;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = false;
        fullscreenFocusOrResolutionText = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_j = 2;
        field_o = -1;
    }
}
