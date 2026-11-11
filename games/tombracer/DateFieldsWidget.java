/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateFieldsWidget extends DateInputWidget {
    static String[] gasDeathMessages;
    private TextInputWidget field_E;
    static int[] field_C;
    static VerticalScrollbar field_F;
    private TextInputWidget field_B;
    private boolean field_G;
    private TextInputWidget field_D;

    public static void releaseStatics(int param0) {
        if (param0 == 25) {
          field_C = null;
          gasDeathMessages = null;
          field_F = null;
          return;
        }
        DateFieldsWidget.releaseStatics(83);
        field_C = null;
        gasDeathMessages = null;
        field_F = null;
    }

    DateFieldsWidget(WidgetPainter param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds((byte) -31, param4, param5, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void setBounds(byte param0, int param1, int param2, int param3, int param4) {
        super.setBounds((byte) -31, param1, param2, param3, param4);
        int var6 = -130 + param1 >> 1;
        if (!this.field_G) {
          this.field_B.setBounds((byte) -31, 25, param2, var6, 0);
          this.field_E.setBounds((byte) -31, 25, param2, var6 + 45, 0);
          this.field_D.setBounds(param0, 40, param2, 90 + var6, 0);
          return;
        }
        this.field_E.setBounds((byte) -31, 25, param2, var6, 0);
        this.field_B.setBounds((byte) -31, 25, param2, var6 + 45, 0);
        this.field_D.setBounds(param0, 40, param2, 90 + var6, 0);
    }

    private DateFieldsWidget(WidgetPainter param0, boolean param1) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_B = (TextInputWidget) ((Object) new ValidatedTextInputWidget("", (WidgetListener) null, 2));
          this.field_E = (TextInputWidget) ((Object) new ValidatedTextInputWidget("", (WidgetListener) null, 2));
          this.field_D = (TextInputWidget) ((Object) new ValidatedTextInputWidget("", (WidgetListener) null, 4));
          this.field_G = param1 ? true : false;
          this.field_D.field_r = param0;
          this.field_E.field_r = param0;
          this.field_B.field_r = param0;
          if (!this.field_G) {
            this.addChild(this.field_B, -1);
            this.addChild(this.field_E, -1);
          } else {
            this.addChild(this.field_E, -1);
            this.addChild(this.field_B, -1);
          }
          this.addChild(this.field_D, -1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void renderLayer(int param0, int param1, int param2, int param3) {
        super.renderLayer(param0, param1, param2, param3);
        if (param3 == 0) {
          param1 = param1 + this.field_n;
          param0 = param0 + this.field_i;
          this.drawFieldLabel(-44, param0, this.field_B, param1, oda.field_i);
          this.drawFieldLabel(-121, param0, this.field_E, param1, HardwareTextureCache.field_d);
          this.drawFieldLabel(param2 - 62, param0, this.field_D, param1, DropdownList.field_y);
          return;
        }
    }

    final int getDay(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 110) {
          this.setBounds((byte) 13, 53, -119, 96, 97);
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_D.field_o);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final String getHoverText(byte param0) {
        int var2 = 46 % ((-58 - param0) / 60);
        String var3 = this.field_E.getHoverText((byte) -127);
        if (var3 != null) {
          return var3;
        }
        if (this.field_f) {
          return this.field_q == null ? this.field_o : this.field_q;
        }
        return null;
    }

    private final void drawFieldLabel(int param0, int param1, UiWidget param2, int param3, String param4) {
        try {
          if (param0 > -25) {
            this.field_B = (TextInputWidget) null;
          }
          BlendModeOperator.field_o.drawCenteredText(param4, (param2.field_m >> 1) + (param2.field_i + param1), param3 + param2.field_n - 5, 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fe.LA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 > 103) {
            stackIn_4_0 = Integer.parseInt(this.field_B.field_o);
            return stackIn_4_0;
          }
          stackIn_2_0 = -6;
          return stackIn_2_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean isEmpty(byte param0) {
        int var2 = 39 / ((31 - param0) / 33);
        if (this.field_B.field_o == null) {
          return true;
        }
        if (this.field_B.field_o.length() == 0) {
          return true;
        }
        if (this.field_E.field_o == null) {
          return true;
        }
        if (this.field_E.field_o.length() == 0) {
          return true;
        }
        if (null == this.field_D.field_o) {
          return true;
        }
        if (0 != this.field_D.field_o.length()) {
          return false;
        }
        return true;
    }

    final void setValidator(byte param0, uba param1) {
        try {
          super.setValidator((byte) -95, param1);
          this.field_B.field_h = (WidgetListener) ((Object) param1);
          int var3_int = 118 / ((-36 - param0) / 59);
          this.field_E.field_h = (WidgetListener) ((Object) param1);
          this.field_D.field_h = (WidgetListener) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "fe.AA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getYear(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != 22829) {
          return -70;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_E.field_o) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    static {
        gasDeathMessages = new String[]{"<%0> had a touch of the vapours", "<%0> didn't notice the funny smell", "<%0> should have brought a gas mask", "<%0> came for the treasure, but stayed for the deadly gas"};
        field_C = new int[]{0, 70, 70, 70, 70};
    }
}
