/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountUiBootstrap {
    static QuickChatCommand field_a;
    static String difficultyText;

    public static void releaseStatics(int param0) {
        int var1 = -48 % ((-58 - param0) / 49);
        field_a = null;
        difficultyText = null;
    }

    final static PcmStreamMixer gameSoundMixer(int guard) {
        if (guard != 14263) {
          difficultyText = (String) null;
          return sj.field_c;
        }
        return sj.field_c;
    }

    final static int parseInt(byte guard, CharSequence text, int radix) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -73) {
            difficultyText = (String) null;
          }
          stackIn_3_0 = SpriteOptionRenderer.parseInt(radix, text, true, (byte) -86);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ea.B(").append(guard).append(',');
          if (text == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(radix).append(')').toString());
        }
    }

    final static void showLoginDialog(int guard, boolean allowGuestPlay, String unused, boolean allowSignup) {
        MarkerTrackRenderer.resetAccountRequests((byte) -124);
        if (guard != 1) {
          return;
        }
        try {
          RenderPresentationException.field_a.closeAllDialogs((byte) -34);
          no.field_a = new LoginForm(FocusProxyWidget.field_F, (String) null, ReconnectState.reconnecting, allowSignup, allowGuestPlay);
          SlowBurstParticle.field_y = new ContentDialog(RenderPresentationException.field_a, no.field_a);
          RenderPresentationException.field_a.pushDialog((byte) 104, SlowBurstParticle.field_y);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ea.F(" + guard + ',' + allowGuestPlay + ',' + (unused != null ? "{...}" : "null") + ',' + allowSignup + ')');
        }
    }

    final static boolean isAsciiDigit(byte guard, char character) {
        if (guard != -54) {
          return false;
        }
        if (character < 48) {
          return false;
        }
        if (57 < character) {
          return false;
        }
        return true;
    }

    final static boolean isCurrentUserName(String name, byte guard) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard != -25) {
            difficultyText = (String) null;
          }
          var3 = (CharSequence) ((Object) name);
          stackIn_3_0 = PasswordValidator.field_f.equals(AccountCreationProgressDialog.normalizeAccountName(guard ^ 24, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ea.G(");
          if (name == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void initializeAccountUi(ResourceArchive extraArchive, boolean unused, byte guard, ResourceArchive fontArchive, ResourceArchive graphicsArchive) {
        AffineTransform3D.emailAvailabilityRequest = DroneDebris.createEmailAvailabilityRequest(false, "");
        AffineTransform3D.emailAvailabilityRequest.complete(113, false);
        ToolkitFont.a(graphicsArchive, fontArchive, 17474, extraArchive);
        if (guard < 20) {
          return;
        }
        try {
          SecondaryNodeQueue.b(246);
          vm.nameAvailabilityState = AccountRequestDefaults.IDLE;
          ProxySocketConnector.accountCreationState = AccountRequestDefaults.IDLE;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ea.C(" + (extraArchive != null ? "{...}" : "null") + ',' + unused + ',' + guard + ',' + (fontArchive != null ? "{...}" : "null") + ',' + (graphicsArchive != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new QuickChatCommand(12, 0, 1, 0);
        difficultyText = "Difficulty: ";
    }
}
