/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchPcmStream extends PcmStream {
    static String field_z;
    static int field_y;
    static String field_w;
    static String field_C;
    private MidiPcmStream field_A;
    static int field_v;
    static String field_u;
    static ResourceArchive field_t;
    static String field_E;
    static int field_B;
    static String field_x;
    NodeDeque field_F;
    static int field_H;
    static String field_s;
    static int field_D;
    PcmStreamMixer field_G;

    final void skipFrames(int param0) {
        int var2;
        MusicPatchNode var3;
        int var4;
        var4 = SteelSentinels.obfuscationControl;
        this.field_G.skipFrames(param0);
        var3 = (MusicPatchNode) (this.field_F.first(13058));
        while (var3 != null) {
          if (!this.field_A.discardInactiveVoice(var3, false)) {
            var2 = param0;
            do {
              if (var2 <= var3.field_K) {
                this.skipNote(110, var3, var2);
                var3.field_K = var3.field_K - var2;
                break;
              }
              this.skipNote(-105, var3, var3.field_K);
              var2 = var2 - var3.field_K;
            } while (!this.field_A.updateNote(var2, 0, 7139, var3, (int[]) null));
          }
          var3 = (MusicPatchNode) (this.field_F.next((byte) -28));
        }
    }

    public static void releaseStatics(int param0) {
        field_C = null;
        field_w = null;
        field_x = null;
        field_E = null;
        field_t = null;
        field_u = null;
        if (param0 >= -62) {
          MusicPatchPcmStream.releaseStatics(-110);
        }
        field_z = null;
        field_s = null;
    }

    final static void recolorGreenPixelsInRect(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = SteelSentinels.obfuscationControl;
        try {
          if (SoftwareRaster.field_i > param1) {
            param2 = param2 - (SoftwareRaster.field_i - param1);
            param1 = SoftwareRaster.field_i;
          }
          if (param5 != 40) {
            field_t = (ResourceArchive) null;
          }
          if (SoftwareRaster.field_b < param2 + param1) {
            param2 = SoftwareRaster.field_b - param1;
          }
          if (SoftwareRaster.field_l > param4) {
            param0 = param0 - (SoftwareRaster.field_l - param4);
            param4 = SoftwareRaster.field_l;
          }
          if (SoftwareRaster.field_d < param0 + param4) {
            param0 = SoftwareRaster.field_d - param4;
          }
          if (param2 > 0 &&
            0 < param0) {
            var6_int = param4 * SoftwareRaster.field_c + param1;
            var7 = -param2 + SoftwareRaster.field_c;
            for (param4 = -param0; param4 < 0; param4++) {
              for (param1 = -param2; param1 < 0; param1++) {
                var8 = SoftwareRaster.field_g[var6_int];
                if ((var8 & 65280) >> 8 > param3 &&
                  (var8 >> 16 & 255) <= (var8 & 65280) >> 8) {
                  var9 = (var8 >> 15 & 510) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = 65280 & var8;
                  var10 = (var10 >> 1) - (var10 >> 5) & 65280;
                  var11 = var8 >> 3 & 31;
                  SoftwareRaster.field_g[var6_int] = DateOfBirthValidator.bitOr(DateOfBirthValidator.bitOr(var9 << 16, var10), var11);
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) var6), "ej.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void mixInto(int[] param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        MusicPatchNode var6 = null;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = SteelSentinels.obfuscationControl;
        try {
          this.field_G.mixInto(param0, param1, param2);
          var6 = (MusicPatchNode) (this.field_F.first(13058));
          while (var6 != null) {
            stackIn_4_0 = this.field_A.discardInactiveVoice(var6, false);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var5 > var6.field_K) {
                this.renderNote(var4_int, var6.field_K, (byte) 32, var6, param0, var5 + var4_int);
                var4_int = var4_int + var6.field_K;
                var5 = var5 - var6.field_K;
                if (this.field_A.updateNote(var5, var4_int, 7139, var6, param0)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.renderNote(var4_int, var5, (byte) -112, var6, param0, var5 + var4_int);
                var6.field_K = var6.field_K - var5;
              }
            }
            var6 = (MusicPatchNode) (this.field_F.next((byte) -37));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ej.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int activity() {
        return 0;
    }

    final PcmStream nextSubstream() {
        MusicPatchNode var1;
        while (true) {
          var1 = (MusicPatchNode) (this.field_F.next((byte) -122));
          if (var1 == null) {
            return null;
          }
          if (null != var1.field_A) {
            return (PcmStream) ((Object) var1.field_A);
          }
        }
    }

    private final void skipNote(int param0, MusicPatchNode param1, int param2) {
        MidiPcmStream stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var4_intLifetime1;
        try {
          if ((this.field_A.field_F[param1.field_t] & 4) != 0 &&
            param1.field_J < 0) {
            var4_int = this.field_A.field_u[param1.field_t] / AudioOutput.field_g;
            var5 = (1048575 + var4_int - param1.field_v) / var4_int;
            param1.field_v = 1048575 & param1.field_v + param2 * var4_int;
            if (param2 >= var5) {
              if (this.field_A.field_L[param1.field_t] != 0) {
                param1.field_A = PcmSampleStream.createAtStepQ8(param1.field_q, param1.field_A.getSampleStepMagnitude(), 0, param1.field_A.panQ14());
                stackIn_8_0 = this.field_A;
                stackIn_9_1 = !(param1.field_N.field_p[param1.field_z] >= 0);
                ((MidiPcmStream) (Object) stackIn_8_0).applyNoteSampleOffset(stackIn_9_1, 111, param1);
              } else {
                param1.field_A = PcmSampleStream.createAtStepQ8(param1.field_q, param1.field_A.getSampleStepMagnitude(), param1.field_A.getTargetVolume(), param1.field_A.panQ14());
              }
              if (param1.field_N.field_p[param1.field_z] < 0) {
                param1.field_A.setLoopCount(-1);
              }
              param2 = param1.field_v / var4_int;
            }
          }
          param1.field_A.skipFrames(param2);
          var4_intLifetime1 = 109 / ((12 - param0) / 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ej.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void renderNote(int param0, int param1, byte param2, MusicPatchNode param3, int[] param4, int param5) {
        MidiPcmStream stackIn_13_0 = null;
        boolean stackIn_14_1 = false;
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
        int var11 = 0;
        PcmSampleStream var12 = null;
        int var13 = 0;
        var13 = SteelSentinels.obfuscationControl;
        try {
          var7_int = -21 % ((-50 - param2) / 62);
          if ((this.field_A.field_F[param3.field_t] & 4) != 0 &&
            0 > param3.field_J) {
            var8 = this.field_A.field_u[param3.field_t] / AudioOutput.field_g;
            while (true) {
              var9 = (-param3.field_v + (var8 + 1048575)) / var8;
              if (var9 > param1) {
                param3.field_v = param3.field_v + param1 * var8;
                break;
              }
              param3.field_A.mixInto(param4, param0, var9);
              param0 = param0 + var9;
              param1 = param1 - var9;
              param3.field_v = param3.field_v + (-1048576 + var8 * var9);
              var10 = AudioOutput.field_g / 100;
              var11 = 262144 / var8;
              if (var11 < var10) {
                var10 = var11;
              }
              var12 = param3.field_A;
              if (this.field_A.field_L[param3.field_t] != 0) {
                param3.field_A = PcmSampleStream.createAtStepQ8(param3.field_q, var12.getSampleStepMagnitude(), 0, var12.panQ14());
                stackIn_13_0 = this.field_A;
                stackIn_14_1 = !(param3.field_N.field_p[param3.field_z] >= 0);
                ((MidiPcmStream) (Object) stackIn_13_0).applyNoteSampleOffset(stackIn_14_1, -59, param3);
                param3.field_A.rampVolumeQ6(var10, var12.getTargetVolume());
              } else {
                param3.field_A = PcmSampleStream.createAtStepQ8(param3.field_q, var12.getSampleStepMagnitude(), var12.getTargetVolume(), var12.panQ14());
              }
              if (param3.field_N.field_p[param3.field_z] < 0) {
                param3.field_A.setLoopCount(-1);
              }
              var12.fadeOutAndUnlink(var10);
              var12.mixInto(param4, param0, param5 - param0);
              if (!var12.hasRemainingRampFrames()) {
                continue;
              }
              this.field_G.addSubstream(var12);
            }
          }
          param3.field_A.mixInto(param4, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("ej.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param5).append(')').toString());
        }
    }

    final static boolean loadMembersBenefitsAssets(int param0) {
        if (null != Explosion.field_B) {
          return true;
        }
        if (!DualNode.field_x.isGroupLoadedByName("benefits", (byte) 90)) {
          return false;
        }
        Explosion.field_B = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "benefits", "members_benefits_borders", false);
        if (param0 > -126) {
          return true;
        }
        AccountNamePrompt.field_ac = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "benefits", "members_benefits_price", false);
        ValidatedTextWidget.field_qb = PacketLoopHelpers.loadRgbSpriteByName(DualNode.field_x, "benefits", "members_benefits_logo", false);
        AlternateUsernameCredentials.field_v = StatSubmission.loadSpritesByName("members_benefits_screenshots", "benefits", (byte) -73, DualNode.field_x);
        DisplayMode.setPromotionCaption(ReflectionCheckHelpers.field_h, Explosion.field_B, false);
        DateInputWidget.configureDialogFrameStyle(16744576, 2, (byte) 120, LoginDialogHelpers.field_j, -2400, AccountNamePrompt.field_ac, 80, 40, 15, 80, 40);
        NodeHashTable.setSlideshowSprites(1, AlternateUsernameCredentials.field_v);
        Js5NetworkRequest.setHeaderIconSprite(ValidatedTextWidget.field_qb, (byte) 69);
        return true;
    }

    final PcmStream firstSubstream() {
        MusicPatchNode var1 = (MusicPatchNode) (this.field_F.first(13058));
        if (var1 == null) {
          return null;
        }
        if (null != var1.field_A) {
          return (PcmStream) ((Object) var1.field_A);
        }
        return this.nextSubstream();
    }

    MusicPatchPcmStream(MidiPcmStream param0) {
        this.field_F = new NodeDeque();
        this.field_G = new PcmStreamMixer();
        try {
          this.field_A = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = "STANDARD";
        field_z = "This password contains your email address, and would be easy to guess";
        field_E = "NONE";
        field_u = "Show players in <%0>'s game";
        field_v = 1;
        field_H = 0;
        field_x = "Asking to join <%0>'s game...";
        field_s = "You have discovered the following items:";
        field_w = "Kick";
    }
}
