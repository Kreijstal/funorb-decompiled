/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuStyleHelpers {
    static String field_a;

    final static void showAccountChoicePanel(byte param0) {
        int var1 = 38 % ((param0 + 66) / 55);
        PasswordValidator.field_u.transitionToContent(new AccountWelcomePanel(), -27667);
    }

    final static void setMenuOptionColours(int param0, int param1, int param2, int param3) {
        NineSliceFrame.field_b = param2;
        ProgressMessageDialog.field_wb = param1;
        IntrusiveNode.field_b = param3;
        if (param0 <= 68) {
          MenuStyleHelpers.showAccountChoicePanel((byte) -35);
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -12359) {
          field_a = (String) null;
        }
    }

    final static void setMenuFrameStyle(NineSliceFrame param0, int param1, int param2, int param3) {
        try {
          MusicPatch.field_D = param1;
          ReflectionCheck.field_o = param0;
          if (param3 != -20140) {
            field_a = (String) null;
          }
          BufferedSocket.field_b = param2;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "gj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_a = "Password: ";
    }
}
