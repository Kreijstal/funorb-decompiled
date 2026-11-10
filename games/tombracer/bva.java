/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bva {
    static fta field_b;
    static float field_c;
    static String field_a;

    public static void releaseStatics(byte param0) {
        if (param0 > -7) {
          field_b = (fta) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final synchronized static long currentTimeMillis(byte param0) {
        long var1 = 0L;
        long var1Lifetime1;
        if (param0 != -107) {
          bva.releaseStatics((byte) 0);
          var1 = System.currentTimeMillis();
          if (var1 < LegacyTurbulentWaterNoise.field_o) {
            QuickChatCategory.field_p = QuickChatCategory.field_p + (-var1 + LegacyTurbulentWaterNoise.field_o);
            LegacyTurbulentWaterNoise.field_o = var1;
            return var1 + QuickChatCategory.field_p;
          }
          LegacyTurbulentWaterNoise.field_o = var1;
          return var1 + QuickChatCategory.field_p;
        }
        var1Lifetime1 = System.currentTimeMillis();
        if (var1Lifetime1 >= LegacyTurbulentWaterNoise.field_o) {
          LegacyTurbulentWaterNoise.field_o = var1Lifetime1;
          return var1Lifetime1 + QuickChatCategory.field_p;
        }
        QuickChatCategory.field_p = QuickChatCategory.field_p + (-var1Lifetime1 + LegacyTurbulentWaterNoise.field_o);
        LegacyTurbulentWaterNoise.field_o = var1Lifetime1;
        return var1Lifetime1 + QuickChatCategory.field_p;
    }

    static {
        field_b = new fta();
        field_a = "<%0> is already on your ignore list.";
    }
}
