/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiAngleDial extends UiFocusableComponent {
    int centerX;
    int centerY;
    int stepsPerRevolution;
    static Sprite field_K;
    int radius;
    int markerValue;
    static String settingsFileName;
    int value;
    static int cachedFramePointerX;
    static String field_G;

    public static void clearSharedReferences(int param0) {
        if (param0 == 6344) {
          field_G = null;
          settingsFileName = null;
          field_K = null;
          return;
        }
        UiAngleDial.pollKeyEvent(-68);
        field_G = null;
        settingsFileName = null;
        field_K = null;
    }

    final static boolean pollKeyEvent(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_5_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = GetMomentOfInertiaPerpointCalcDownshift.field_q;
        synchronized (var1_ref) {
          if (MessageLog.field_a == OpenGlVertexDeclaration.field_c) {
            return false;
          }
          SetBombletSprayProjectileDamage.field_o = ServerTickFactory.field_a[OpenGlVertexDeclaration.field_c];
          SetClientSideDragging.field_r = GetGrapplingHookCooldown.field_q[OpenGlVertexDeclaration.field_c];
          OpenGlVertexDeclaration.field_c = param0 & OpenGlVertexDeclaration.field_c + 1;
          stackIn_5_0 = true;
        }
        return stackIn_5_0;
    }

    final boolean handleMousePress(int param0, int param1, int param2, int param3, UiComponent param4, int param5, byte param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = VoidHunters.field_G;
        try {
          if (param6 >= -17) {
            this.markerValue = 45;
          }
          if (!super.handleMousePress(param0, param1, param2, param3, param4, param5, (byte) -99)) {
            return false;
          }
          var8_int = param0 + (-this.x + (-param1 - this.centerX));
          var9 = param2 + (-this.centerY - this.y - param5);
          if (this.radius * this.radius <= var9 * var9 + var8_int * var8_int) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - SetSniperCannonEnergyUsed.field_q;
          if (!(var10 < 0.0)) {
            if (0.0 < var10) {
              var10 = var10 + 3.141592653589793 / (double)this.stepsPerRevolution;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.stepsPerRevolution;
          }
          this.value = (int)((double)this.stepsPerRevolution * var10 / 6.283185307179586);
          while (this.value >= this.stepsPerRevolution) {
            this.value = this.value - this.stepsPerRevolution;
          }
          while (this.value < 0) {
            this.value = this.value + this.stepsPerRevolution;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("ata.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private UiAngleDial() throws Throwable {
        throw new Error();
    }

    static {
        settingsFileName = "game_settings.dat";
        field_K = new Sprite(540, 140);
        field_G = "Hold the Component";
    }
}
