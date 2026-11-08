/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AsyncValidationResult {
    private String field_e;
    private boolean field_d;
    static int[] field_g;
    static String field_f;
    static String field_c;
    static ResourceArchive field_b;
    private boolean field_a;

    final static QuickChatCategory findRootQuickChatCategory(int param0) {
        int var1_int = 0;
        QuickChatCategory var2 = null;
        QuickChatCategory stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        try {
          if (param0 != -3060) {
            AsyncValidationResult.showLoadingProgressDialog((byte) 81);
          }
          var1_int = 0;
          while (true) {
            var2 = StatefulTextPainter.field_y.getCategory(var1_int, false);
            if (var2.field_y) {
              stackIn_6_0 = var2;
              return stackIn_6_0;
            }
            var1_int++;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final static boolean dispatchKeyInput(int param0, int param1, int param2, int param3) {
        if (SoundVoice.field_q) {
          return td.field_b.processKey(DualLinkDeque.field_f, ke.field_a, false);
        }
        if (un.field_l) {
          return AccountMessagePanel.handleQuickChatKey(102, param2, param1);
        }
        if (DebouncedValidator.handleChatShortcutKey(param1, param2, param3)) {
          return true;
        }
        if (IsaacRandom.field_g) {
          return false;
        }
        return EmailCredentials.handleChatInputKey(param0, -35, param1);
    }

    final boolean isComplete(int param0) {
        if (param0 <= 35) {
          this.getMessage((byte) 37);
          return this.field_d;
        }
        return this.field_d;
    }

    final static void showLoadingProgressDialog(byte param0) {
        wa.field_c.refreshPanelVisibility((byte) 54);
        int var1 = -119 / ((param0 + 55) / 51);
        if (null != cn.field_b) {
          wa.field_c.showPanel(-6183, cn.field_b);
          return;
        }
        cn.field_b = new LoadingProgressDialog(wa.field_c, wp.field_a);
        wa.field_c.showPanel(-6183, cn.field_b);
    }

    final boolean isSuccessful(int param0) {
        if (param0 != -20425) {
          AsyncValidationResult.showLoadingProgressDialog((byte) -122);
          return this.field_a;
        }
        return this.field_a;
    }

    final void complete(int param0, boolean param1) {
        if (param0 == 0) {
          this.field_d = true;
          this.field_a = param1 ? true : false;
          return;
        }
        field_g = (int[]) null;
        this.field_d = true;
        this.field_a = param1 ? true : false;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
          field_g = (int[]) null;
        }
    }

    final String getMessage(byte param0) {
        int var2 = 63 / ((param0 - 28) / 50);
        return this.field_e;
    }

    AsyncValidationResult(String param0) {
        this.field_d = false;
        this.field_a = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Ignore";
        field_f = "Names cannot contain consecutive spaces";
    }
}
