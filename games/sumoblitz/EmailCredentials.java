/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EmailCredentials extends LoginCredentials {
    private String email;
    static GameKeyHandler field_e;
    private String password;
    static ResourceArchive field_j;
    static String continueText;
    static AudioOutput field_f;

    final static ResourceArchive openResourceArchive(int archiveId, byte guard) {
        if (guard == 125) {
          return HardwareSpecularEffect.openResourceArchive(1, -74, true, archiveId, false, false);
        }
        field_e = (GameKeyHandler) null;
        return HardwareSpecularEffect.openResourceArchive(1, -74, true, archiveId, false, false);
    }

    final void writeCredentials(PacketBuffer packet, byte guard) {
        try {
          packet.writeCircumfixedString(this.email, (byte) -105);
          packet.writeBase38Name(this.password, 46);
          if (guard >= -107) {
            PacketBuffer var4 = (PacketBuffer) null;
            this.writeCredentials((PacketBuffer) null, (byte) 29);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wd.C(" + (packet != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final static void showDroneIntroduction(byte guard, int type) {
        int var2 = -16 / ((18 - guard) / 60);
        OpenGlVertexLayout.field_f.show(-3388, type);
    }

    final LoginCredentialType credentialType(byte guard) {
        if (guard < 80) {
          this.credentialType((byte) -128);
          return IndexedSprite.EMAIL_CREDENTIALS;
        }
        return IndexedSprite.EMAIL_CREDENTIALS;
    }

    public static void releaseStatics(byte param0) {
        if (param0 == 88) {
          field_j = null;
          field_f = null;
          continueText = null;
          field_e = null;
          return;
        }
        continueText = (String) null;
        field_j = null;
        field_f = null;
        continueText = null;
        field_e = null;
    }

    final static boolean pollKeyEvent(int guard) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = field_e;
        synchronized (var1_ref) {
          if (guard > -20) {
            continueText = (String) null;
          }
          if (OpenGlBuffer.keyEventLimit == EmailAvailabilityRequest.keyEventReadIndex) {
            return false;
          }
          TextureCombineOperation.keyCode = WidgetTheme.queuedKeyCodes[EmailAvailabilityRequest.keyEventReadIndex];
          WhirlpoolDigest.keyCharacter = SpriteMask.queuedKeyCharacters[EmailAvailabilityRequest.keyEventReadIndex];
          EmailAvailabilityRequest.keyEventReadIndex = EmailAvailabilityRequest.keyEventReadIndex + 1 & 127;
          stackIn_7_0 = true;
        }
        return stackIn_7_0;
    }

    EmailCredentials(String address, String secret) {
        try {
          this.email = address;
          this.password = secret;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wd.<init>(" + (address != null ? "{...}" : "null") + ',' + (secret != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new GameKeyHandler();
        continueText = "Continue";
    }
}
