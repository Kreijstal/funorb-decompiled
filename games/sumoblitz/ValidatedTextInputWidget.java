/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidatedTextInputWidget extends TextInputWidget implements ValidationProvider {
    private int pointerOffsetX;
    static int field_P;
    private InputValidator validator;
    static String namesShouldContainAText;
    static LegacyBitmapFont field_R;

    public static void releaseStatics(int param0) {
        if (param0 != -15648) {
          field_R = (LegacyBitmapFont) null;
          field_R = null;
          namesShouldContainAText = null;
          return;
        }
        field_R = null;
        namesShouldContainAText = null;
    }

    final void setValidator(byte guard, InputValidator validator) {
        try {
          int var3_int = 2 % ((guard - 72) / 46);
          this.validator = validator;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qq.D(" + guard + ',' + (validator != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 >= -6) {
          return true;
        }
        return wn.a(param0, param1, -107) & TextureTransformMode.a(param1, -2626, param0);
    }

    public final InputValidator getValidator(int guard) {
        int var2 = 124 / ((-52 - guard) / 62);
        return this.validator;
    }

    final void notifyChanged(byte guard) {
        super.notifyChanged((byte) 127);
        if (guard <= 78) {
          namesShouldContainAText = (String) null;
          if (null != this.validator) {
            this.validator.markChanged((byte) -117);
            return;
          }
          return;
        }
        if (null == this.validator) {
          return;
        }
        this.validator.markChanged((byte) -117);
    }

    final static PlayingSound addPlayingSound(int param0, PcmSampleStream param1) {
        PlayingSound var2 = null;
        RuntimeException var2_ref = null;
        PlayingSound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 18416) {
            ValidatedTextInputWidget.b(-31, 81, 66);
          }
          var2 = new PlayingSound(param1, param1);
          ContentTransitionPhase.field_c.addLast((IntrusiveNode) (var2), (byte) 39);
          sj.field_c.addSubstream(param1);
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("qq.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    ValidatedTextInputWidget(String text, WidgetListener listener, int maxLength) {
        super(text, listener, maxLength);
    }

    final String hoveredTooltip(int guard) {
        if (!this.hovered) {
          return null;
        }
        if (this.tooltip == null) {
          return null;
        }
        if (guard == -6696) {
          LegacyOpenGlRidgedWaterEffect.a(pi.field_e, this.width - (this.pointerOffsetX - ko.field_p), -95);
          return this.tooltip;
        }
        this.validator = (InputValidator) null;
        LegacyOpenGlRidgedWaterEffect.a(pi.field_e, this.width - (this.pointerOffsetX - ko.field_p), -95);
        return this.tooltip;
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          super.update(parentX, -86, root, parentY);
          int var5_int = 126 % ((guard + 25) / 45);
          this.pointerOffsetX = ko.field_p - (this.x + parentX);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qq.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    static {
        namesShouldContainAText = "Names should contain a maximum of 12 characters";
    }
}
