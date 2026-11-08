/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginCredentialType {
    static int[] field_h;
    static ConnectionStage field_c;
    static SpriteWidget field_a;
    static String field_b;
    static String field_f;
    int field_d;
    static FrameSkin field_g;
    static String field_e;

    final static void popRasterState(byte param0) {
        MouseInputHandler.field_b = MouseInputHandler.field_b - 1;
        Rasterizer.setTarget(ProxySocketConnector.field_l[MouseInputHandler.field_b], FadeLayer.field_K[MouseInputHandler.field_b], LobbyJoinTextGlobals.field_e[MouseInputHandler.field_b]);
        if (param0 >= 79) {
          Rasterizer.field_i = TextHotspot.field_i[MouseInputHandler.field_b];
          Rasterizer.field_k = CellAnimator.field_i[MouseInputHandler.field_b];
          Rasterizer.field_g = ValidationMessageWidget.field_O[MouseInputHandler.field_b];
          Rasterizer.field_h = TextFieldValidator.field_h[MouseInputHandler.field_b];
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean openQuickChatForRecipient(long param0, int param1, int param2, String param3, int[] param4) {
        QuickChatMenu var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!CachedArchiveSource.canMessage(28977, param3, param0, param1, param4)) {
            return false;
          }
          if (param1 == 1) {
            param1 = 0;
          }
          ArchiveFactoryHelpers.field_d = param3;
          ChatFilterHelpers.field_e = param1;
          if (param2 != -22557) {
            field_c = (ConnectionStage) null;
          }
          var7 = (CharSequence) ((Object) param3);
          TabbedPanel.field_Gb = DisplayNameHelpers.normalizeDisplayName(var7, true);
          PendingScoreQuery.field_n = param0;
          var6 = ConnectionStage.buildQuickChatResponseMenu(RankingsRequest.field_k, ChatFilterHelpers.field_a, 49, IterableNodeHashTable.field_e, param4);
          RasterEffectHelpers.openQuickChatMenu(var6, (byte) -27);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("ul.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void increaseVolume(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (DelegatingCanvas.field_c >= 224) {
          TextFieldValidator.setSoundEffectVolume((byte) 120, 256);
        } else {
          var1 = DelegatingCanvas.field_c % 32;
          TextFieldValidator.setSoundEffectVolume((byte) 59, -var1 + (DelegatingCanvas.field_c + 32));
        }
        var1Lifetime1 = 32 % ((param0 - 23) / 39);
    }

    final static void loginWithStoredCredentials(int param0) {
        StatSubmission.startLoginRequest((byte) 120, DrawQueueGlobals.field_e, LoginDialog.field_sb, true);
        if (param0 != 15429) {
          field_b = (String) null;
          IntrusiveDeque.field_f = true;
          return;
        }
        IntrusiveDeque.field_f = true;
    }

    LoginCredentialType(int param0) {
        this.field_d = param0;
    }

    public static void releaseStatics(byte param0) {
        field_h = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_a = null;
        field_g = null;
        if (param0 < -48) {
          field_b = null;
          return;
        }
    }

    static {
        field_h = new int[8192];
        field_f = "Player names can be up to 12 letters, numbers and underscores";
        field_b = "Who can join";
        field_e = "Loading...";
        field_c = new ConnectionStage();
    }
}
