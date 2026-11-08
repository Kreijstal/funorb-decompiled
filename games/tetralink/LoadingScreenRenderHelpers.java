/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingScreenRenderHelpers {
    static boolean field_d;
    static String field_b;
    static String field_a;
    static volatile int field_c;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 23365) {
          field_a = (String) null;
        }
    }

    final static void renderLoadingScreen(int param0, java.awt.Canvas param1) {
        if (11 == DisplayNameForm.field_R) {
          LoadingStageHook.runLoadingStageHook(param0 ^ -8145);
        }
        EditableTextWidget.showLoadingProgress(ProxyAuthenticationRequiredException.field_a, SpriteState.field_v, param0 + 8007, NameSuggestionsPanel.field_Q);
        if (param0 != -8129) {
          return;
        }
        try {
          CachedArchiveSource.paintCanvasNow(0, 0, param1, -2);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "kf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static Sprite[] resetSpriteOffsets(boolean param0, Sprite[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Sprite var3 = null;
        int var4 = 0;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          if (!param0) {
            field_b = (String) null;
          }
          for (var2_int = 0; var2_int < param1.length; var2_int++) {
            var3 = param1[var2_int];
            param1[var2_int].field_D = 0;
            var3.field_x = 0;
            param1[var2_int].field_t = param1[var2_int].field_u;
            param1[var2_int].field_F = param1[var2_int].field_E;
          }
          stackIn_7_0 = (Sprite[]) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("kf.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void setFrameStyles(int param0, int param1, int param2, NineSliceFrame param3, NineSliceFrame param4, int param5) {
        try {
          CanvasAndErrorHelpers.field_e = param1;
          StartupFlagsHelpers.field_a = param2;
          if (param0 != -4968) {
            field_c = 80;
          }
          QuickChatCategoryCache.field_e = param3;
          ChatLayoutHelpers.field_c = param5;
          EmailAvailabilityValidator.field_t = param4;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "kf.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    static {
        field_a = "Only show game chat from my friends";
        field_b = "Exploiting a bug";
        field_c = 0;
    }
}
