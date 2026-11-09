/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPhraseProvider {
    private ResourceArchive extendedArchive;
    static boolean field_b;
    private SoftLruCache cache;
    private ResourceArchive defaultArchive;
    static IntrusiveDeque arenaPads;
    static boolean field_a;

    final static void b(int param0) {
        LegacyOpenGlRenderBufferSet.setSoundVolume(256, (byte) -58);
        if (param0 <= 56) {
          field_b = false;
        }
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          return (param1 & 33) != 0 ? true : false;
        }
        field_a = true;
        return (param1 & 33) != 0 ? true : false;
    }

    final QuickChatPhrase getPhrase(int phraseId, int guard) {
        byte[] var4 = null;
        QuickChatPhrase var3 = (QuickChatPhrase) (this.cache.get((long)phraseId, 123));
        if (var3 == null) {
          if (phraseId >= 32768) {
            var4 = this.extendedArchive.fetchFile((byte) 115, phraseId & 32767, 1);
          } else {
            var4 = this.defaultArchive.fetchFile((byte) 109, phraseId, 1);
          }
          var3 = new QuickChatPhrase();
          if (var4 != null) {
            var3.decode(new PacketBuffer(var4), true);
          }
          if (guard >= ~phraseId) {
            var3.useExtendedResponseIds(guard ^ 32885);
          }
          this.cache.put((long)phraseId, var3, (byte) 19);
          return var3;
        }
        return var3;
    }

    final static void showGraphicsOptions(int guard) {
        if (guard >= 27) {
          HardwareTextureSprite.field_e.closeAllDialogs((byte) 123);
          HardwareTextureSprite.field_e.pushDialog((byte) 112, new GraphicsOptionsDialog(HardwareTextureSprite.field_e));
          return;
        }
        String var2 = (String) null;
        QuickChatPhraseProvider.findIgnoredContact((byte) 10, (String) null);
        HardwareTextureSprite.field_e.closeAllDialogs((byte) 123);
        HardwareTextureSprite.field_e.pushDialog((byte) 112, new GraphicsOptionsDialog(HardwareTextureSprite.field_e));
    }

    final static SocialContact findIgnoredContact(byte guard, String name) {
        String var2 = null;
        SocialContact var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        SocialContact stackIn_6_0 = null;
        SocialContact stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (GpuDataType.field_b == null) {
            stackIn_3_0 = null;
            return (SocialContact) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) name);
          var2 = AccountCreationProgressDialog.normalizeAccountName(-1, var6);
          if (guard < 89) {
            stackIn_6_0 = (SocialContact) null;
            return stackIn_6_0;
          }
          if (var2 == null) {
            var2 = name;
          }
          var3 = (SocialContact) (GpuDataType.field_b.get((long)var2.hashCode(), -45));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.displayName);
            var4 = AccountCreationProgressDialog.normalizeAccountName(-1, var7);
            if (var4 == null) {
              var4 = var3.displayName;
            }
            if (var4.equals(var2)) {
              stackIn_18_0 = var3;
              return stackIn_18_0;
            }
            var3 = (SocialContact) (GpuDataType.field_b.nextMatch(-109));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("is.A(").append(guard).append(',');
          if (name == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private QuickChatPhraseProvider() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(boolean param0) {
        arenaPads = null;
        if (param0) {
          String var2 = (String) null;
          QuickChatPhraseProvider.findIgnoredContact((byte) 3, (String) null);
        }
    }

    static {
        field_b = false;
    }
}
