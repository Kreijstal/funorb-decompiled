/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class su {
    static int[] field_a;
    private float[] field_e;
    static String field_b;
    static String field_c;
    static je field_d;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          su.a(true);
        }
        field_d = null;
        field_a = null;
        field_c = null;
    }

    final AiPlanner a(byte param0, Battlefield param1, CampaignUnitOverride[] param2, int param3, boolean param4) {
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
          var10 = new AiPlanner(param1, param3, param4, param2);
          var6 = var10;
          var7 = 0;
          var8 = -40 / ((param0 + 12) / 61);
          while (var7 < 62) {
            var10.weights[var7] = this.field_e[var7];
            var7++;
          }
          stackIn_5_0 = var6;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_8_0 = var6_ref;
          stackIn_8_1 = new StringBuilder().append("su.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private su() throws Throwable {
        throw new Error();
    }

    static {
        field_a = new int[]{1, 8, 8, 15, 1, 9};
        field_b = "Name";
        field_c = "Sound: ";
    }
}
