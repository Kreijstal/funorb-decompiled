/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qq extends TextInputWidget implements op {
    private int field_T;
    static int field_P;
    private v field_S;
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

    final void a(byte param0, v param1) {
        try {
          int var3_int = 2 % ((param0 - 72) / 46);
          this.field_S = param1;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 >= -6) {
          return true;
        }
        return wn.a(param0, param1, -107) & tf.a(param1, -2626, param0);
    }

    public final v a(int param0) {
        int var2 = 124 / ((-52 - param0) / 62);
        return this.field_S;
    }

    final void notifyChanged(byte guard) {
        super.notifyChanged((byte) 127);
        if (guard <= 78) {
          namesShouldContainAText = (String) null;
          if (null != this.field_S) {
            this.field_S.a((byte) -117);
            return;
          }
          return;
        }
        if (null == this.field_S) {
          return;
        }
        this.field_S.a((byte) -117);
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
            qq.b(-31, 81, 66);
          }
          var2 = new PlayingSound(param1, param1);
          jf.field_c.addLast((IntrusiveNode) (var2), (byte) 39);
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

    qq(String param0, WidgetListener param1, int param2) {
        super(param0, param1, param2);
    }

    final String hoveredTooltip(int guard) {
        if (!this.hovered) {
          return null;
        }
        if (this.tooltip == null) {
          return null;
        }
        if (guard == -6696) {
          LegacyOpenGlRidgedWaterEffect.a(pi.field_e, this.width - (this.field_T - ko.field_p), -95);
          return this.tooltip;
        }
        this.field_S = (v) null;
        LegacyOpenGlRidgedWaterEffect.a(pi.field_e, this.width - (this.field_T - ko.field_p), -95);
        return this.tooltip;
    }

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        try {
          super.update(parentX, -86, root, parentY);
          int var5_int = 126 % ((guard + 25) / 45);
          this.field_T = ko.field_p - (this.x + parentX);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qq.U(" + parentX + ',' + guard + ',' + (root != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    static {
        namesShouldContainAText = "Names should contain a maximum of 12 characters";
    }
}
