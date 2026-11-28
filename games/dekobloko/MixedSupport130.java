/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport130 {
    static String stringState0562;
    static String[] stringArrayState0050;
    static int integerState0810;
    static String stringState0563;
    static String stringState0564;
    static String stringState0565;
    static RgbSprite[][] rgbSpriteArrayArrayState0012;

    final static void performAction1665(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, int integerArgument6) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int integerLocal5 = 0;
        int integerLocal6 = 0;
        int integerLocal7 = 0;
        int integerLocal8 = 0;
        int integerLocal9 = 0;
        int integerLocal10 = 0;
        RuntimeException caughtExceptionLocal11 = null;
        RuntimeException runtimeExceptionLocal12 = null;
        int integerLocal13;
        integerLocal10 = DekoBlokoClient.obfuscationControl ? 1 : 0;
        try {
          integerLocal2 = integerArgument2 + (2 + (485 + integerArgument5) + 16);
          integerLocal3 = -37 / ((-64 - integerArgument6) / 62);
          MatchingFieldValidator.sceneWidgetState0105.performAction1764(-6 + integerLocal2, 0, 3, -6 + RichTextLayout.sceneWidgetState0021.integerState0915, 3);
          integerLocal4 = -5 + MatchingFieldValidator.sceneWidgetState0105.integerState0915;
          MixedSupport116.sceneWidgetState0111.performAction1764(2 + (485 + integerArgument5) + integerArgument2, 0, -integerArgument1 + integerLocal4, integerArgument1, 5);
          AccountCreationResultPanel.sceneWidgetState0150.performAction1764(MixedSupport116.sceneWidgetState0111.integerState0896 - (integerArgument5 + DiagnosticSupport002.sceneWidgetState0057.integerState0896), 0, 0, integerArgument1, integerArgument5);
          integerLocal4 = integerLocal4 - (integerArgument1 + 2);
          DiagnosticSupport002.sceneWidgetState0057.performAction1764(DiagnosticSupport002.sceneWidgetState0057.integerState0896, 0, 0, integerArgument1, integerArgument5 + AccountCreationResultPanel.sceneWidgetState0150.integerState0896);
          NanoFrameTimer.sceneWidgetPart008State0001.performAction1122(6, 5, integerArgument2, 5, integerLocal4 - 5, 487 + integerArgument5 + integerArgument2, 2);
          if (null != MixedSupport009.uiComponentPart019State0001) {
            MixedSupport009.uiComponentPart019State0001.setBounds(NanoFrameTimer.sceneWidgetPart008State0001.integerState0915, NanoFrameTimer.sceneWidgetPart008State0001.integerState0896, NanoFrameTimer.sceneWidgetPart008State0001.integerState0890, NanoFrameTimer.sceneWidgetPart008State0001.integerState0903, -16555);
          }
          integerLocal5 = -integerLocal2 + (-integerArgument5 + RichTextLayout.sceneWidgetState0021.integerState0896);
          integerLocal6 = integerLocal5 / 2;
          integerLocal7 = integerArgument3 + (integerLocal6 + integerArgument5);
          integerLocal8 = 0;
          for (integerLocal1 = 0; integerLocal1 < 6; integerLocal1++) {
            if (integerLocal1 >= 5 ||
              null != ClientException.sceneWidgetArrayState0001[integerLocal1]) {
              integerLocal9 = 3 + (-6 + (RichTextLayout.sceneWidgetState0021.integerState0915 + 2)) * integerLocal8 / (ClientException.integerState0140 + 1);
              integerLocal8++;
              integerLocal13 = 1 + ((-4 + RichTextLayout.sceneWidgetState0021.integerState0915) * integerLocal8 / (1 + ClientException.integerState0140) - integerLocal9);
              if (integerLocal1 >= 5) {
                NetworkArchiveRequestManager.sceneWidgetState0098.performAction1764(integerLocal5, 0, integerLocal9, integerLocal13, integerLocal2);
              } else {
                ClientException.sceneWidgetArrayState0001[integerLocal1].performAction1764(integerLocal5, 0, integerLocal9, integerLocal13, integerLocal2);
                MusicTrack.sceneWidgetArrayState0007[integerLocal1].performAction1764(-integerArgument5 + integerLocal6, 0, 0, integerLocal13, integerArgument5);
                NodeHashTable.sceneWidgetArrayState0004[integerLocal1].performAction1764(integerArgument3, 0, integerArgument4, -integerArgument4 + (integerLocal13 - integerArgument4), integerLocal6);
                MixedSupport076.sceneWidgetArrayState0002[integerLocal1].performAction1764(-integerLocal7 + (-integerArgument5 + integerLocal5), 0, integerArgument4, -integerArgument4 + (integerLocal13 - integerArgument4), integerLocal7);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameterLocal14) {
          caughtExceptionLocal11 = caughtParameterLocal14;
          runtimeExceptionLocal12 = caughtExceptionLocal11;
          throw ClientException.computeDiagnosticSupport0020365((Throwable) ((Object) runtimeExceptionLocal12), "uj.A(" + integerArgument1 + ',' + integerArgument2 + ',' + integerArgument3 + ',' + integerArgument4 + ',' + integerArgument5 + ',' + integerArgument6 + ')');
        }
    }

    public static void clearStaticReferences(byte byteArgument1) {
        stringState0564 = null;
        stringArrayState0050 = null;
        stringState0565 = null;
        if (byteArgument1 <= 99) {
          return;
        }
        stringState0563 = null;
        rgbSpriteArrayArrayState0012 = (RgbSprite[][]) null;
        stringState0562 = null;
    }

    final synchronized static byte[] computeByteArray1664(int integerArgument1, int integerArgument2) {
        int integerLocal1 = 0;
        int integerLocal2 = 0;
        int integerLocal3 = 0;
        int integerLocal4 = 0;
        int cachedIntegerLocal5 = 0;
        byte[][] arrayValue$7 = null;
        byte[] byteArrayLocal7;
        byte[] byteArrayLocal8;
        byte[] byteArrayLocal9;
        byte[] byteArrayLocal10;
        if (integerArgument2 == 100 &&
          MixedSupport107.integerState0684 > 0) {
          integerLocal1 = MixedSupport107.integerState0684 - 1;
          MixedSupport107.integerState0684 = MixedSupport107.integerState0684 - 1;
          byteArrayLocal7 = ResourceSupport003.byteArrayArrayState0006[integerLocal1];
          ResourceSupport003.byteArrayArrayState0006[MixedSupport107.integerState0684] = null;
          return byteArrayLocal7;
        }
        if (integerArgument2 == 5000 &&
          MixedSupport074.integerState0418 > 0) {
          integerLocal2 = MixedSupport074.integerState0418 - 1;
          MixedSupport074.integerState0418 = MixedSupport074.integerState0418 - 1;
          byteArrayLocal9 = GameplayControls.byteArrayArrayState0011[integerLocal2];
          GameplayControls.byteArrayArrayState0011[MixedSupport074.integerState0418] = null;
          return byteArrayLocal9;
        }
        if (integerArgument1 != 5) {
          return (byte[]) null;
        }
        if (integerArgument2 == 30000 &&
          MixedSupport021.integerState0124 > 0) {
          integerLocal3 = MixedSupport021.integerState0124 - 1;
          MixedSupport021.integerState0124 = MixedSupport021.integerState0124 - 1;
          byteArrayLocal10 = ProgressMessageDialog.byteArrayArrayState0002[integerLocal3];
          ProgressMessageDialog.byteArrayArrayState0002[MixedSupport021.integerState0124] = null;
          return byteArrayLocal10;
        }
        if (null != LoginCredentials.byteArrayArrayArrayState0001) {
          for (integerLocal4 = 0; FullscreenNoticeType.integerArrayState0149.length > integerLocal4; integerLocal4++) {
            if (FullscreenNoticeType.integerArrayState0149[integerLocal4] == integerArgument2 &&
              MixedSupport143.integerArrayState0256[integerLocal4] > 0) {
              cachedIntegerLocal5 = MixedSupport143.integerArrayState0256[integerLocal4] - 1;
              arrayValue$7 = LoginCredentials.byteArrayArrayArrayState0001[integerLocal4];
              MixedSupport143.integerArrayState0256[integerLocal4] = cachedIntegerLocal5;
              byteArrayLocal8 = arrayValue$7[cachedIntegerLocal5];
              LoginCredentials.byteArrayArrayArrayState0001[integerLocal4][MixedSupport143.integerArrayState0256[integerLocal4]] = null;
              return byteArrayLocal8;
            }
          }
        }
        return new byte[integerArgument2];
    }

    static {
        stringArrayState0050 = new String[]{"Welcome to the Master Challenge!<br><br>The Master Challenge is not for the faint of heart. Games are short, and, unlike Stamina Mode, the Master Challenge gets very harsh very quickly. Get as many points as you can, while you can.", "The Master Challenge will test your skill in every different Deko Bloko strategy. You will need to use different strategies as the game progresses. Have you noticed the strategy box on the right? Keep checking it for each new theme."};
        stringState0563 = "Seriously offensive language";
        stringState0564 = "<%0> SHAPES";
        stringState0565 = "to return to the normal view.";
        rgbSpriteArrayArrayState0012 = new RgbSprite[8][];
        stringState0562 = "Rated games are available to members only. To become a member and gain access to Rated games, extra game options and more, please visit the 'Account' section of the website.";
    }
}
