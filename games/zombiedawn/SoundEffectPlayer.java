/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEffectPlayer {
    static Sprite[] field_a;

    final static void toggleTutorialTips(byte param0) {
        if (param0 <= 107) {
          field_a = (Sprite[]) null;
          if (PendingFlagRequest.field_h) {
            IntRecordReplyHelpers.field_b = false;
            PendingFlagRequest.field_h = false;
            HighscoresScreen.field_o = 0;
            return;
          }
          PendingFlagRequest.field_h = true;
          return;
        }
        if (PendingFlagRequest.field_h) {
          IntRecordReplyHelpers.field_b = false;
          PendingFlagRequest.field_h = false;
          HighscoresScreen.field_o = 0;
          return;
        }
        PendingFlagRequest.field_h = true;
    }

    public static void releaseStatics(int param0) {
        if (param0 > -26) {
          return;
        }
        field_a = null;
    }

    final static PcmSampleStream playSoundEffect(byte param0, int param1) {
        SoundEffectNode var2 = null;
        SoundEffectNode var2Lifetime1;
        if (ProxySocketConnector.field_m.size(-117) >= 4) {
          return null;
        }
        if (param0 == 18) {
          var2 = new SoundEffectNode(param1);
          ProxySocketConnector.field_m.addFirst(param0 ^ 18, var2);
          return var2.field_j;
        }
        field_a = (Sprite[]) null;
        var2Lifetime1 = new SoundEffectNode(param1);
        ProxySocketConnector.field_m.addFirst(param0 ^ 18, var2Lifetime1);
        return var2Lifetime1.field_j;
    }

    static {
        field_a = new Sprite[2];
    }
}
