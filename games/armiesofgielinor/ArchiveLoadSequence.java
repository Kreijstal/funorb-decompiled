/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadSequence {
    private int stepCount;
    String caption;
    static boolean field_a;
    private int fractionScale;
    private ArchiveLoadStep[] steps;
    float fraction;
    static int[] field_g;
    private int currentStep;

    final boolean pollLoading(int obfuscationGuard) {
        int var3;
        ArchiveLoadStep var4;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 2189) {
          this.caption = (String) null;
        }
        while (this.stepCount > this.currentStep) {
          var4 = this.steps[this.currentStep];
          if (!var4.field_c.ensureIndex((byte) 82)) {
            this.updateProgress(0, var4, (byte) -126);
            return false;
          }
          if (var4.field_d >= 0 &&
            !var4.field_c.ensureGroupAvailable(11894, var4.field_d)) {
            this.updateProgress(var4.field_c.getGroupProgress(var4.field_d, (byte) 73), var4, (byte) -89);
            return false;
          }
          if (var4.field_b != null &&
            !var4.field_c.ensureGroupAvailableByName(28979, var4.field_b)) {
            this.updateProgress(var4.field_c.getGroupProgressByName(var4.field_b, (byte) -126), var4, (byte) -75);
            return false;
          }
          if (var4.field_d < 0 &&
            null == var4.field_b &&
            var4.field_j != null &&
            !var4.field_c.ensureAllGroupsAvailable(-27927)) {
            this.updateProgress(var4.field_c.getOverallProgress(0), var4, (byte) -88);
            return false;
          }
          this.currentStep = this.currentStep + 1;
        }
        return true;
    }

    final static void drawHorizontalThreeSliceWithBrightness(int param0, int param1, int param2, RgbSprite[] param3, int param4, int param5) {
        try {
          if (param5 != -8991) {
            field_g = (int[]) null;
          }
          param3[0].drawWithBrightness(param0, param1, param4);
          param3[1].drawScaledWithBrightness(param3[1].pixelWidth + param0, param1, -(param3[2].pixelWidth << 1) + param2, param3[2].pixelHeight, param4);
          param3[2].drawWithBrightness(-param3[2].pixelWidth + (param2 + param0), param1, param4);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(PacketBuffer param0, int param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          la.field_d = param0.readUnsignedShort((byte) -104) << 5;
          var2_int = param0.readUnsignedByte(0);
          RevivalEvent.field_D = (var2_int & 7) << 18;
          la.field_d = la.field_d + (var2_int >> 3);
          RevivalEvent.field_D = RevivalEvent.field_D + (param0.readUnsignedShort((byte) -104) << 2);
          var2_intLifetime1 = param0.readUnsignedByte(0);
          Bzip2State.field_m = 2064384 & var2_intLifetime1 << 15;
          RevivalEvent.field_D = RevivalEvent.field_D + (var2_intLifetime1 >> 6);
          Bzip2State.field_m = Bzip2State.field_m + (param0.readUnsignedByte(0) << 7);
          int var3 = 16 % ((param1 + 45) / 34);
          var2_intLifetime2 = param0.readUnsignedByte(0);
          SpectateRoomRequestSupport.field_e = (1 & var2_intLifetime2) << 16;
          Bzip2State.field_m = Bzip2State.field_m + (var2_intLifetime2 >> 1);
          SpectateRoomRequestSupport.field_e = SpectateRoomRequestSupport.field_e + param0.readUnsignedShort((byte) -104);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jp.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void updateProgress(int percent, ArchiveLoadStep step, byte obfuscationGuard) {
        float var4_float = 0.0f;
        try {
          var4_float = (float)(this.currentStep + 1) + (float)percent / 100.0f;
          if (percent != 0) {
            this.caption = step.field_j + " - " + percent + "%";
          } else {
            this.caption = step.field_e;
          }
          if (obfuscationGuard > -64) {
            this.pollLoading(8);
          }
          this.fraction = (float)this.fractionScale * var4_float / (float)(1 + this.stepCount);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "jp.C(" + percent + ',' + (step != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (SoftwareRaster.width >= param2 + param0) {
          return param0;
        }
        if (~(param0 + param1 - param2) <= param3) {
          return -param2 + (param1 + param0);
        }
        return -param2 + SoftwareRaster.width;
    }

    public static void releaseStatics(byte obfuscationGuard) {
        field_g = null;
        if (obfuscationGuard < -74) {
          return;
        }
        ArchiveLoadSequence.releaseStatics((byte) 0);
    }

    private ArchiveLoadSequence() throws Throwable {
        throw new Error();
    }

    static {
        field_g = new int[128];
    }
}
