/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ContentDialog extends ContentTransitionDialog {
    static ToolkitSprite[] field_ab;
    static String typeYourAgeInText;

    final void transitionToContent(byte guard, UiWidget newContent) {
        try {
          if (guard >= -87) {
            field_ab = (ToolkitSprite[]) null;
          }
          super.transitionToContent((byte) -96, newContent);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dc.E(" + guard + ',' + (newContent != null ? "{...}" : "null") + ')');
        }
    }

    ContentDialog(DialogLayer param0, UiWidget param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void releaseStatics(int param0) {
        if (param0 < 89) {
          typeYourAgeInText = (String) null;
          field_ab = null;
          typeYourAgeInText = null;
          return;
        }
        field_ab = null;
        typeYourAgeInText = null;
    }

    final static void raiseSoundVolume(int threshold) {
        if (threshold <= kr.field_c) {
          lf.setSoundVolume(256, (byte) -58);
          return;
        }
        int var1 = kr.field_c % 32;
        lf.setSoundVolume(32 + (kr.field_c - var1), (byte) -58);
    }

    static {
        typeYourAgeInText = "Type your age in years";
    }
}
