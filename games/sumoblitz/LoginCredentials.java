/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class LoginCredentials {
    static String abcdefghijklmnopqrstuvwxyzabcdefghijText;
    static String pleaseTryAgainInText;
    static int field_d;
    static String scoreText;

    final static int pollAccountDialogs(int guard) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = Sumoblitz.field_L ? 1 : 0;
        try {
          RenderPresentationException.field_a.dispatchPointerInput(CheckboxWidget.field_F, GraphicsToolkit.field_b, true, guard - 19887);
          RenderPresentationException.field_a.advanceDialogAnimations(-90);
          while (EmailCredentials.pollKeyEvent(guard ^ -19954)) {
            RenderPresentationException.field_a.dispatchKey(WhirlpoolDigest.keyCharacter, TextureCombineOperation.keyCode, true);
          }
          if (MarkerTrackRenderer.field_e != -1) {
            var1_int = MarkerTrackRenderer.field_e;
            ReflectionCheck.setAccountDialogResult(-1, guard ^ -19873);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          if (StatusMessagePanel.field_A) {
            stackIn_10_0 = 3;
            return stackIn_10_0;
          }
          if (guard != 19886) {
            field_d = -49;
          }
          if (Base37NameAlphabet.nameAvailabilityState == LegacyOpenGlGraphicsHeap.PENDING) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (!AffineTransform3D.emailAvailabilityRequest.isComplete(true)) {
            stackIn_19_0 = 1;
            return stackIn_19_0;
          }
          if (ProxySocketConnector.accountCreationState != LegacyOpenGlGraphicsHeap.PENDING) {
            stackIn_24_0 = -1;
            return stackIn_24_0;
          }
          stackIn_22_0 = 2;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var1), "se.K(" + guard + ')');
        }
    }

    abstract LoginCredentialType credentialType(byte guard);

    final static String joinCharSequences(CharSequence[] parts, int offset, int count, int guard) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_13_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (guard != 14156) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (0 == count) {
            stackIn_7_0 = "";
            return stackIn_7_0;
          }
          if (count == 1) {
            var10 = parts[offset];
            var4 = var10;
            if (var4 != null) {
              return var10.toString();
            }
            stackIn_13_0 = "null";
            return stackIn_13_0;
          }
          var4_int = count + offset;
          var5 = 0;
          for (var6_int = offset; var4_int > var6_int; var6_int++) {
            var7_ref_CharSequence = parts[var6_int];
            if (var7_ref_CharSequence != null) {
              var5 = var5 + var7_ref_CharSequence.length();
            } else {
              var5 += 4;
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = offset; var7 < var4_int; var7++) {
            var8 = parts[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_27_0 = var6.toString();
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_30_0 = var4_ref;
          stackIn_30_1 = new StringBuilder().append("se.M(");
          if (parts == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(offset).append(',').append(count).append(',').append(guard).append(')').toString());
        }
    }

    abstract void writeCredentials(PacketBuffer packet, byte guard);

    final static boolean hasFlag2048AndConditionalMasks(int guard, int flags, int otherFlags) {
        int var3 = -24 % ((-63 - guard) / 40);
        if (!BeveledCheckboxRenderer.hasFlag2048(flags, 13836, otherFlags)) {
          return false;
        }
        if (((flags & 36864) != 0 ? true : false) | EmailValidationError.hasAnyMask540800(flags, (byte) -107, otherFlags) | LegacyOpenGlDisplayLists.hasFlag256(otherFlags, true, flags)) {
          return true;
        }
        return (ResetStatsConfirmationOverlay.hasMask24OrAll544(flags, -22, otherFlags) | ((8192 & flags) != 0 ? true : false) | GameInstructions.hasFlag65536(true, otherFlags, flags)) & ((otherFlags & 55) == 0 ? true : false);
    }

    public static void releaseStatics(int param0) {
        if (param0 != 8192) {
          field_d = 19;
        }
        abcdefghijklmnopqrstuvwxyzabcdefghijText = null;
        scoreText = null;
        pleaseTryAgainInText = null;
    }

    static {
        abcdefghijklmnopqrstuvwxyzabcdefghijText = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        pleaseTryAgainInText = "Please try again in a few minutes.";
        scoreText = "Score";
    }
}
