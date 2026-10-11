/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport048 {
    int integerState0261;
    static MixedSupport111 mixedSupport111State0003;
    static String stringState0203;
    static SceneWidget sceneWidgetState0041;
    static MixedSupport076 mixedSupport076State0001;
    static String stringState0204;

    final static void performAction0645(boolean booleanArgument1) {
        if (MixedSupport052.integerState0269 == 10) {
          CodecSupport002.performAction1253(-5);
          MixedSupport052.integerState0269 = 11;
        } else {
          if (!FunOrbClient.computeBoolean0126((byte) -124)) {
            CodecSupport002.performAction1253(-5);
            MixedSupport052.integerState0269 = 11;
          }
        }
        UiComponentPart031.booleanState0185 = true;
        if (!booleanArgument1) {
          return;
        }
        stringState0204 = (String) null;
    }

    MixedSupport048(int integerArgument1) {
        this.integerState0261 = integerArgument1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void performAction0644(int integerArgument1) {
        stringState0203 = null;
        stringState0204 = null;
        if (integerArgument1 <= 42) {
          return;
        }
        sceneWidgetState0041 = null;
        mixedSupport111State0003 = null;
        mixedSupport076State0001 = null;
    }

    static {
        mixedSupport111State0003 = new MixedSupport111(15, 0, 1, 0);
        stringState0203 = "Macroing or use of bots";
        mixedSupport076State0001 = null;
        stringState0204 = "Public chat is unavailable while setting up a rated game.";
    }
}
