/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputDetachHelpers {
    static TypeCode field_d;
    static Sprite field_c;
    static String field_b;
    static int[] field_a;

    final static void detachKeyboardInput(int param0, java.awt.Component param1) {
        try {
          param1.removeKeyListener(ValidationIndicator.field_L);
          if (param0 != 2) {
            java.awt.Component var3 = (java.awt.Component) null;
            InputDetachHelpers.detachKeyboardInput(-122, (java.awt.Component) null);
          }
          param1.removeFocusListener(ValidationIndicator.field_L);
          DisplayModeInfo.field_f = -1;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "dn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0 < 34) {
          field_a = (int[]) null;
        }
    }

    final static void returnToLoginStage(int param0) {
        if (!MenuScreen.field_d) {
          throw new IllegalStateException();
        }
        LobbySortHelpers.field_h = true;
        NodeHashTableIterator.openLoginPrompt(true, param0 ^ -8319);
        NodeHashTableIterator.field_l = 0;
        if (param0 == 8192) {
          return;
        }
        InputDetachHelpers.releaseStatics((byte) 73);
    }

    static {
        field_d = new TypeCode(1, 2, 2, 0);
        field_b = "Hide chat";
        field_a = new int[8192];
    }
}
