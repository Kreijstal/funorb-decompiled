/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DecodedSpriteHelpers {
    static String field_e;
    static String textEndgameNotime;
    static String field_c;
    static boolean field_a;
    static String textCreateAccount2;
    static LobbyLayout field_b;

    final static boolean isPrivateChatTarget(String param0, boolean param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ArchiveLoadSequence.field_h) {
            return false;
          }
          if (ChatFilterHelpers.field_e == 2 &&
            null != TabbedPanel.field_Gb) {
            var3 = (CharSequence) ((Object) param0);
            if (TabbedPanel.field_Gb.equals(DisplayNameHelpers.normalizeDisplayName(var3, true))) {
              if (!param1) {
                return true;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("dd.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static Sprite[] buildSprites(byte param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        int[] var6;
        int var8;
        String var9;
        int[] var10;
        int[] var14;
        int[] var17;
        byte[] var21;
        int[] var22;
        byte[] var23;
        var8 = Virogrid.field_F ? 1 : 0;
        var1 = new Sprite[MarkerSliderPainter.field_h];
        for (var2 = 0; MarkerSliderPainter.field_h > var2; var2++) {
          var3 = Bzip2State.field_k[var2] * MarkerSlider.field_F[var2];
          var21 = CheckboxPainter.field_j[var2];
          if (!MusicPlaybackHelpers.field_d[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var10[var6_int] = GameEntryHelpers.field_c[WidgetFactoryHelpers.bitAnd((int) var21[var6_int], 255)];
            }
            var1[var2] = new Sprite(QuickChatMenu.field_Kb, LobbyJoinTextGlobals.field_d, BufferedSocket.field_w[var2], ContentTransitionDialog.field_bb[var2], Bzip2State.field_k[var2], MarkerSlider.field_F[var2], var22);
          } else {
            var23 = IntKeyLookup.field_g[var2];
            var17 = new int[var3];
            var14 = var17;
            var6 = var14;
            for (var7 = 0; var7 < var3; var7++) {
              var6[var7] = BitwiseHelpers.bitOr(WidgetFactoryHelpers.bitAnd((int) var23[var7], 255) << 24, GameEntryHelpers.field_c[WidgetFactoryHelpers.bitAnd((int) var21[var7], 255)]);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(QuickChatMenu.field_Kb, LobbyJoinTextGlobals.field_d, BufferedSocket.field_w[var2], ContentTransitionDialog.field_bb[var2], Bzip2State.field_k[var2], MarkerSlider.field_F[var2], var17));
          }
        }
        if (param0 > -106) {
          var9 = (String) null;
          DecodedSpriteHelpers.isPrivateChatTarget((String) null, true);
        }
        PlayingSound.releaseDecodeArrays((byte) -28);
        return var1;
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -58) {
          return;
        }
        field_e = null;
        textCreateAccount2 = null;
        field_b = null;
        textEndgameNotime = null;
        field_c = null;
    }

    static {
        field_e = "Just play";
        textEndgameNotime = "<%0> ran out of time";
        textCreateAccount2 = "start using this feature.";
        field_c = "Invalid password.";
    }
}
