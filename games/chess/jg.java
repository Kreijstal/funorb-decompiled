/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends ArrayWidgetContainer implements WidgetActivationListener {
    static int field_K;
    static int field_I;
    static String field_L;
    private InteractiveWidget field_N;
    static long field_M;
    static byte[] field_O;
    private ih field_J;

    public final void onWidgetActivated(InteractiveWidget param0, int param1, int param2, int param3, int param4) {
        if (param4 != -24221) {
          field_O = (byte[]) null;
        }
        if (this.field_J.getFieldValidator(param4 ^ 24305).getValidationStatus(param4 + 45535) != ProxyAuthenticationRequiredException.field_a) {
          return;
        }
        try {
          DisplayNameSelectionPanel.b(this.field_J.c(false), this.field_J.h(-1), 0, this.field_J.i(82));
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "jg.DA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        super.drawWidget(param0, param1, -115, param3);
        if (param2 <= -80) {
          rc.field_a.drawString(gi.field_b, this.field_u + (param3 + 4), rc.field_a.field_C + (this.field_r + (param0 + 4)), 16777215, -1);
          return;
        }
        this.drawWidget(-61, -119, -11, -21);
        rc.field_a.drawString(gi.field_b, this.field_u + (param3 + 4), rc.field_a.field_C + (this.field_r + (param0 + 4)), 16777215, -1);
    }

    final static void n(int param0) {
        SingleChildWidgetContainer.field_L = true;
        if (param0 >= -50) {
          return;
        }
        vk.field_g = 0;
    }

    final static RgbSprite[] a(byte param0, int param1, ResourceArchive param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 76 / ((param0 - 9) / 61);
          if (EmailFormatValidator.a(param3, param1, param2, (byte) 83)) {
            return rf.b((byte) 8);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("jg.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2 = 250;
        this.field_J.setBounds(20 + (this.field_C - 25) >> 1, 34, 25, 140, this.field_y - var2 >> 1);
        this.field_N.setBounds(2 + (-30 + (this.field_C + 20) >> 1), 34, param0, 100, 10 + (140 + (this.field_y - var2 >> 1)));
    }

    jg(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetRenderer) null);
        this.field_J = new ih(new wc(10000536), ej.field_f, 0, 0, 140, 25);
        this.field_J.a(false, new BirthDateValidator());
        this.field_N = new InteractiveWidget(sg.field_e, (WidgetEventListener) (this));
        this.field_E = new UiWidget[]{(UiWidget) ((Object) this.field_J), (UiWidget) ((Object) this.field_N)};
        this.field_N.field_n = (WidgetRenderer) ((Object) new sf());
        this.refreshLayout((byte) 113);
    }

    final static ci k(int param0) {
        if (param0 <= 57) {
          jg.n(-68);
          return ci.field_zb.field_Kb;
        }
        return ci.field_zb.field_Kb;
    }

    final void updatePointer(int param0, int param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        InteractiveWidget stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.updatePointer(param0, -103, param2, param3);
          stackIn_2_0 = this.field_N;
          stackIn_3_1 = (this.field_J.getFieldValidator(-112).getValidationStatus(21314) == ProxyAuthenticationRequiredException.field_a);
          stackIn_2_0.field_H = stackIn_3_1;
          if (param1 <= -6) {
            return;
          }
          jg.clearDeclaredStaticReferences(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("jg.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    final static int m(int param0) {
        if (param0 >= 32) {
          return v.field_d + ((ii.field_Q << 2) + (sg.field_d << 4));
        }
        jg.clearDeclaredStaticReferences(5);
        return v.field_d + ((ii.field_Q << 2) + (sg.field_d << 4));
    }

    public static void clearDeclaredStaticReferences(int param0) {
        if (param0 != 10000536) {
          field_L = (String) null;
          field_L = null;
          field_O = null;
          return;
        }
        field_L = null;
        field_O = null;
    }

    final static void b(boolean param0) {
        BirthDateValidator.g(124);
        if (!param0) {
          field_M = 3L;
          ChessBoardState.a(false, 4);
          return;
        }
        ChessBoardState.a(false, 4);
    }

    static {
        field_K = 64;
        field_O = new byte[520];
        field_L = "Menu";
    }
}
