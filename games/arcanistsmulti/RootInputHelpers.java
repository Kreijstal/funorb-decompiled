/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RootInputHelpers {
    static BitmapFont field_c;
    static SceneWidget[] field_b;
    static SceneWidget field_a;

    public static void releaseStatics(boolean param0) {
        field_c = null;
        if (param0) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void updateRootInputWrapper(int param0, int param1) {
        if (param0 != -14296) {
          field_b = (SceneWidget[]) null;
          BattleScreen.updateRootInput(param0 + 12303);
          return;
        }
        BattleScreen.updateRootInput(param0 + 12303);
    }

    static {
    }
}
