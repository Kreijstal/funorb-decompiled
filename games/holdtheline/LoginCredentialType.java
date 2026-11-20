/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCredentialType {
    static String[] field_b;
    static boolean field_c;
    int protocolId;
    static String field_d;

    final static void pollPlayerProgress(byte param0) {
        if (!AccountProtocolState.field_a) {
          if (null == RotatedSpriteAsset.field_k) {
            RotatedSpriteAsset.field_k = SpriteSheetAsset.requestAchievementStatus((byte) -103, 4);
          }
          if (RotatedSpriteAsset.field_k.completed) {
            GameMenu.field_z = RotatedSpriteAsset.field_k.unlockedMask;
            RotatedSpriteAsset.field_k = null;
            if (!AccountProtocolState.field_a) {
              ClientException.field_c = ClientException.field_c & ~GameMenu.field_z;
            }
            AccountProtocolState.field_a = true;
          }
        }
        if (!MusicPatchEnvelope.field_f) {
          if (null == IsaacRandom.field_g) {
            IsaacRandom.field_g = InheritedWidgetStyle.requestBlobRead(6, -52);
          }
          if (IsaacRandom.field_g.completed) {
            HuffmanDecoder.decodePlayerProgress(param0 - 56, IsaacRandom.field_g.payload);
            if (ad.field_a) {
              GrowableStringList.savePlayerProgress(0);
            }
            MusicPatchEnvelope.field_f = true;
            IsaacRandom.field_g = null;
          }
        }
        if (param0 == 0) {
          return;
        }
        field_d = (String) null;
    }

    final static boolean isFeatureEnabled(int param0, int param1) {
        if (param1 == -1) {
          return true;
        }
        if (param0 == 16616) {
          return 0 != (ka.field_g & 1 << param1) ? true : false;
        }
        LoginCredentialType.clearSharedReferences(113);
        return 0 != (ka.field_g & 1 << param1) ? true : false;
    }

    final static boolean b(int param0) {
        int var1 = 94 % ((param0 + 21) / 54);
        return oi.field_f;
    }

    public static void clearSharedReferences(int param0) {
        int var1 = 76 % ((param0 - 71) / 40);
        field_b = null;
        field_d = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static SpriteSheetAsset createSpriteSheetAsset(String param0, byte param1) {
        RuntimeException var2 = null;
        String var3 = null;
        SpriteSheetAsset stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -53) {
            var3 = (String) null;
            LoginCredentialType.createSpriteSheetAsset((String) null, (byte) -81);
          }
          stackIn_3_0 = new SpriteSheetAsset(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("kb.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    LoginCredentialType(int param0) {
        this.protocolId = param0;
    }

    static {
        field_b = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_d = "Major shield";
    }
}
