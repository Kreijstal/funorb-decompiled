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

    final static ResourceArchive a(int param0, byte param1) {
        if (param1 == 125) {
          return HardwareSpecularEffect.a(1, -74, true, param0, false, false);
        }
        field_e = (GameKeyHandler) null;
        return HardwareSpecularEffect.a(1, -74, true, param0, false, false);
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

    final static void a(byte param0, int param1) {
        int var2 = -16 / ((18 - param0) / 60);
        OpenGlVertexLayout.field_f.a(-3388, param1);
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

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        boolean stackIn_7_0 = false;
        Throwable decompiledCaughtException = null;
        var1_ref = field_e;
        synchronized (var1_ref) {
          if (param0 > -20) {
            continueText = (String) null;
          }
          if (OpenGlBuffer.field_a == bj.field_a) {
            return false;
          }
          TextureCombineOperation.field_a = WidgetTheme.field_c[bj.field_a];
          WhirlpoolDigest.field_c = SpriteMask.field_c[bj.field_a];
          bj.field_a = bj.field_a + 1 & 127;
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
