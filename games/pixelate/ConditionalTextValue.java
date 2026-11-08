/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConditionalTextValue {
    private boolean field_b;
    static int[] field_i;
    static SceneWidget field_g;
    private String field_f;
    static byte[][] field_e;
    static PaletteBitmapFont field_h;
    static BufferedSocket field_d;
    static String field_a;
    static String field_c;

    final String getText(int param0) {
        if (param0 != -30491) {
          field_c = (String) null;
          return this.field_f;
        }
        return this.field_f;
    }

    final static boolean isAccountNamePromptOpen(int param0) {
        if (param0 != -10093) {
          ConditionalTextValue.isAccountNamePromptOpen(-27);
          return CanvasInputHelpers.field_f != null ? true : false;
        }
        return CanvasInputHelpers.field_f != null ? true : false;
    }

    final static String getLoadingStatusMessage(int param0) {
        if (AchievementRecord.field_q < 2) {
          return PuzzleModePictureHelpers.field_d;
        }
        if (null != DebouncedValidator.field_e) {
          if (!DebouncedValidator.field_e.ensureIndex(param0 ^ -16421)) {
            return ClockHelpers.field_a;
          }
          return SpriteBuildHelpers.field_a;
        }
        if (!EmailLoginCredentials.field_j.ensureIndex(-3)) {
          return SocialListEntry.field_Mb;
        }
        if (!EmailLoginCredentials.field_j.ensureGroupAvailableByName("commonui", -1)) {
          return PasswordValidator.field_q + " - " + EmailLoginCredentials.field_j.getGroupProgressByName(119, "commonui") + "%";
        }
        if (!LoginMethod.field_g.ensureIndex(param0 ^ -16421)) {
          return CanvasRasterBuffer.field_f;
        }
        if (!LoginMethod.field_g.ensureGroupAvailableByName("commonui", -1)) {
          return CipherPacketBuffer.field_x + " - " + LoginMethod.field_g.getGroupProgressByName(param0 ^ 16463, "commonui") + "%";
        }
        if (!MatchingTextValidator.field_u.ensureIndex(-3)) {
          return RasterState.field_p;
        }
        if (param0 != 16422) {
          ConditionalTextValue.isAccountNamePromptOpen(34);
        }
        if (!MatchingTextValidator.field_u.ensureAllGroupsAvailable((byte) 92)) {
          return ContextMenuHelpers.field_a + " - " + MatchingTextValidator.field_u.getOverallProgress(0) + "%";
        }
        return GrowableIntList.field_b;
    }

    ConditionalTextValue(String param0) {
        this(param0, false);
    }

    ConditionalTextValue(String param0, boolean param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_f = param0;
          if (null == this.field_f) {
            this.field_f = "";
          }
          stackIn_6_1 = (param1);
          this.field_b = stackIn_6_1;
          if (this.field_f.length() != 0) {
            return;
          }
          this.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("sc.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean isPending(byte param0) {
        int var2 = -65 / ((59 - param0) / 43);
        return this.field_b;
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_i = null;
        if (param0 < -14) {
          field_e = (byte[][]) null;
          field_d = null;
          return;
        }
        field_g = (SceneWidget) null;
        field_e = (byte[][]) null;
        field_d = null;
    }

    static {
        field_e = new byte[1000][];
        field_i = new int[128];
        field_c = "Accept rematch";
    }
}
