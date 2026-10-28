/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementGrantRule {
    private int achievementMask;
    private int requiredMode;
    static volatile int pendingMouseY;
    private int awardCategory;

    final static void completeNameAvailabilityAndSuggestions(String[] suggestions, String message, int guard, int responseCode) {
        String stackIn_17_2 = null;
        String stackIn_20_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          ui.field_b = TriangleMesh.field_y;
          if (responseCode == 255) {
            boolean stackIn_5_0 = !(gf.field_a >= 13);
            InputGlyphSupport.field_a = fc.a(stackIn_5_0, (byte) -79);
            mb.a((String[]) null, guard + 105);
          } else if (responseCode >= 100 &&
            responseCode <= 105) {
            String[] var4 = suggestions;
            mb.a(var4, 4);
            InputGlyphSupport.field_a = BufferedRandomAccessFile.a(suggestions, (byte) -63);
          } else {
            InputGlyphSupport.field_a = bm.a(message, responseCode, guard ^ -97);
          }
          if (guard == -101) {
            return;
          }
          pendingMouseY = 26;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var4_ref;
          StringBuilder stackIn_16_1 = new StringBuilder().append("jk.A(");
          if (suggestions == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          StringBuilder stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (message == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',').append(responseCode).append(')').toString());
        }
    }

    private final void beforeGrant(int mode, int achievement, int guard) {
        if (guard != 14714) {
          this.achievementMask = 40;
        }
    }

    final void grantIfAllowed(byte guard, int mode, int achievement) {
        int var4 = 1 << achievement;
        if (0 == (this.achievementMask & var4)) {
          return;
        }
        if (mode != this.requiredMode) {
          return;
        }
        GameplaySession var5 = BoundedRandomAccessFile.activeSession;
        int var6 = -69 / ((19 - guard) / 47);
        if (var5 == null) {
          return;
        }
        this.beforeGrant(mode, achievement, 14714);
        var5.awardAchievement(achievement, false, this.awardCategory, this.awardCategory ^ 255);
    }

    final static void a(String param0, byte param1) {
        try {
          if (param1 != -6) {
            pendingMouseY = 86;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "jk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    AchievementGrantRule(int param0, int param1, int param2) {
        this.requiredMode = param0;
        this.achievementMask = param1;
        this.awardCategory = param2;
    }

    static {
        pendingMouseY = -1;
    }
}
