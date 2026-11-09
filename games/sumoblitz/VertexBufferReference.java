/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class VertexBufferReference {
    static SpriteData field_c;
    static int[] field_a;
    private VertexBuffer buffer;
    static AccountConnectionPhase field_b;

    final static int[] createServerIntValues(int guard) {
        if (guard != -14808) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static void prepareLoginCredentials(boolean returnToLogin, String password, byte guard, String identifier) {
        try {
          int var4_int = -26 % ((76 - guard) / 42);
          FocusProxyWidget.loginIdentifier = identifier;
          LoginIdentifierSupport.loginPassword = password;
          HardwareUnlitEffect.showAccountProgressDialog(LegacyOpenGlTexture2D.loggingInText, returnToLogin, (byte) -99);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lr.D(" + returnToLogin + ',' + (password != null ? "{...}" : "null") + ',' + guard + ',' + (identifier != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 16766976) {
          field_b = (AccountConnectionPhase) null;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void playLoopedMusic(MusicTrack track, byte guard) {
        try {
          if (guard < 15) {
            VertexBufferReference.createServerIntValues(-61);
          }
          CachedTextLayout.playMusic(track, (byte) 109, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "lr.E(" + (track != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    VertexBufferReference(boolean unused) {
    }

    final void close(int guard) {
        if (guard == 16711680) {
          if (this.buffer != null) {
            this.buffer.close(12001);
          }
          return;
        }
        String var3 = (String) null;
        VertexBufferReference.prepareLoginCredentials(false, (String) null, (byte) -120, (String) null);
        if (this.buffer != null) {
          this.buffer.close(12001);
        }
    }

    static {
        field_a = new int[]{10813242, 16711680, 16739328, 16766976, 13725607, 108799};
        field_b = new AccountConnectionPhase();
    }
}
