/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AiWeightProfile {
    static int[] field_a;
    private float[] weights;
    static String field_b;
    static String field_c;
    static ClientUiComponent field_d;

    public static void releaseStatics(boolean obfuscationGuard) {
        field_b = null;
        if (!obfuscationGuard) {
          AiWeightProfile.releaseStatics(true);
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final AiPlanner createPlanner(byte obfuscationGuard, Battlefield battlefield, CampaignUnitOverride[] unitOverrides, int playerId, boolean flag) {
        AiPlanner var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        AiPlanner var10 = null;
        AiPlanner stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var10 = new AiPlanner(battlefield, playerId, flag, unitOverrides);
          var6 = var10;
          var7 = 0;
          var8 = -40 / ((obfuscationGuard + 12) / 61);
          while (var7 < 62) {
            var10.weights[var7] = this.weights[var7];
            var7++;
          }
          stackIn_5_0 = var6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("su.B(").append(obfuscationGuard).append(',');
          if (battlefield == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (unitOverrides == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(playerId).append(',').append(flag).append(')').toString());
        }
    }

    private AiWeightProfile() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new int[]{1, 8, 8, 15, 1, 9};
        field_b = "Name";
        field_c = "Sound: ";
    }
}
