/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends ur {
    static ToolkitSprite[] field_ab;
    static String typeYourAgeInText;

    final void b(byte param0, UiWidget param1) {
        try {
          if (param0 >= -87) {
            field_ab = (ToolkitSprite[]) null;
          }
          super.b((byte) -96, param1);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "dc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dc(dg param0, UiWidget param1) {
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

    final static void l(int param0) {
        if (param0 <= kr.field_c) {
          lf.a(256, (byte) -58);
          return;
        }
        int var1 = kr.field_c % 32;
        lf.a(32 + (kr.field_c - var1), (byte) -58);
    }

    static {
        typeYourAgeInText = "Type your age in years";
    }
}
