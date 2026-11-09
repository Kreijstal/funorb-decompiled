/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNameSupport {
    static int[] field_a;

    final static boolean isNameSeparator(byte guard, char character) {
        if (guard > -71) {
          AccountNameSupport.releaseStatics(false);
          if (character == 160) {
            return true;
          }
          if (character == 32) {
            return true;
          }
          if (95 == character) {
            return true;
          }
          if (45 != character) {
            return false;
          }
          return true;
        }
        if (character == 160) {
          return true;
        }
        if (character == 32) {
          return true;
        }
        if (95 == character) {
          return true;
        }
        if (45 != character) {
          return false;
        }
        return true;
    }

    final static boolean containsNameIgnoringUnderscores(boolean guard, String text, String name) {
        String var3 = null;
        String var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          name = ValidationStatus.a('_', name, guard, "");
          if (guard) {
            var4 = (String) null;
            AccountNameSupport.containsNameIgnoringUnderscores(true, (String) null, (String) null);
          }
          var3 = TextureFilter.reverseString(name, (byte) 81);
          stackIn_7_0 = (-1 != text.indexOf(name)) || (text.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("wv.A(").append(guard).append(',');
          if (text == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (name == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void muteMusic(int guard) {
        if (guard != 24238) {
          field_a = (int[]) null;
          LegacyOpenGlRenderBufferSet.setMusicVolume(0, 0);
          return;
        }
        LegacyOpenGlRenderBufferSet.setMusicVolume(0, 0);
    }

    public static void releaseStatics(boolean param0) {
        field_a = null;
        if (!param0) {
          AccountNameSupport.isNameSeparator((byte) 57, 'U');
        }
    }

    final static void showLoginForm(byte guard, String identifier, String message) {
        try {
          if (AccountStatusDialogState.activeDialog != null) {
            AccountStatusDialogState.activeDialog.n(-7);
          }
          LoginFormState.activeForm = new LoginForm(identifier, message, false, true, true);
          if (guard < 73) {
            String var4 = (String) null;
            AccountNameSupport.containsNameIgnoringUnderscores(false, (String) null, (String) null);
          }
          SlowBurstParticle.field_y.transitionToContent((byte) -119, LoginFormState.activeForm);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wv.E(" + guard + ',' + (identifier != null ? "{...}" : "null") + ',' + (message != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[]{36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096};
    }
}
