/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementUnlock extends IntrusiveNode {
    static LoginMethodPreference field_j;
    int field_n;
    static Sprite field_p;
    static String field_i;
    static int field_k;
    static String field_l;
    static int field_o;
    static Sprite[] wizardNoHatSprites;

    public static void releaseStatics(int param0) {
        field_j = null;
        int var1 = 7 / ((param0 - 64) / 46);
        field_i = null;
        field_p = null;
        wizardNoHatSprites = null;
        field_l = null;
    }

    final static void activateLevelExitEffect(int param0) {
        int var2 = 0;
        PlatformActor dupTemp$0 = null;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var3 = wizardrun.field_H;
        try {
          RadixParsingHelpers.field_e = true;
          if (param0 != 2) {
            return;
          }
          for (var1_int = 0; var1_int < 300; var1_int++) {
            if (SavedDataRequest.level.field_d[var1_int]) {
              SavedDataRequest.level.field_d[var1_int] = false;
            }
          }
          var1_intLifetime1 = WidgetTheme.field_k;
          for (var2 = 0; var1_intLifetime1 > var2; var2++) {
            if (NameAvailabilityFactory.field_e[var2].actorType == 21) {
              NameAvailabilityFactory.field_e[var2].verticalVelocity = 20;
              NameAvailabilityFactory.field_e[var2].field_h = -NameAvailabilityFactory.field_e[var2].field_h;
              dupTemp$0 = NameAvailabilityFactory.field_e[var2];
              dupTemp$0.field_o = dupTemp$0.field_o + 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionSupport.wrapException((Throwable) ((Object) var1), "ra.C(" + param0 + ')');
        }
    }

    AchievementUnlock(int param0) {
        this.field_n = param0;
    }

    final static byte[] loadNamedResource(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -94) {
            field_k = -114;
          }
          stackIn_3_0 = FramedButtonPainter.field_r.getNamedFile(92, param0, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ra.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_j = new LoginMethodPreference("");
        field_k = -1;
        field_l = "The Pirate Ship";
        field_i = "members-only content";
    }
}
