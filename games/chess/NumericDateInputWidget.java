/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NumericDateInputWidget extends DateInputWidget {
    static String field_T;
    private EditableTextField field_R;
    private EditableTextField field_P;
    static boolean field_U;
    static int field_O;
    static String field_Q;
    private boolean field_X;
    static byte[] field_S;
    private EditableTextField field_W;
    static String field_Y;
    static String field_V;

    final String getTooltipText(int param0) {
        String var2 = this.field_P.getTooltipText(param0 + param0);
        if (var2 != null) {
          return var2;
        }
        if (this.field_w) {
          return this.field_j == null ? this.field_v : this.field_j;
        }
        return null;
    }

    final static void a(int param0, int param1) {
        if (param1 <= 1) {
          NumericDateInputWidget.a(46, -13);
          pk.a(param0, -66);
          return;
        }
        pk.a(param0, -66);
    }

    NumericDateInputWidget(WidgetRenderer param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.setBounds(param3, 34, param5, param4, param2);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ih.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean isDateEmpty(byte param0) {
        if (this.field_R.field_v == null) {
          return true;
        }
        if (0 == this.field_R.field_v.length()) {
          return true;
        }
        if (null == this.field_P.field_v) {
          return true;
        }
        if (0 == this.field_P.field_v.length()) {
          return true;
        }
        if (null == this.field_W.field_v) {
          return true;
        }
        if (this.field_W.field_v.length() == 0) {
          return true;
        }
        if (param0 < -118) {
          return false;
        }
        field_S = (byte[]) null;
        return false;
    }

    final void drawWidget(int param0, int param1, int param2, int param3) {
        super.drawWidget(param0, param1, -128, param3);
        if (param1 != 0) {
          return;
        }
        if (param2 <= -80) {
          param3 = param3 + this.field_u;
          param0 = param0 + this.field_r;
          this.drawDateFieldLabel(this.field_R, param3, fn.field_f, -2200, param0);
          this.drawDateFieldLabel(this.field_P, param3, ProxySocketConnector.field_i, -2200, param0);
          this.drawDateFieldLabel(this.field_W, param3, AccountServiceResult.field_d, -2200, param0);
          return;
        }
    }

    private NumericDateInputWidget(WidgetRenderer param0, boolean param1) {
        super(0, 0, 0, 0, (WidgetRenderer) null);
        try {
          this.field_R = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) null, 2));
          this.field_P = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) null, 2));
          this.field_W = (EditableTextField) ((Object) new ValidatedTextField("", (WidgetEventListener) null, 4));
          this.field_W.field_n = param0;
          this.field_P.field_n = param0;
          this.field_R.field_n = param0;
          this.field_X = param1 ? true : false;
          if (this.field_X) {
            this.addChild(this.field_P, 95);
            this.addChild(this.field_R, 95);
          } else {
            this.addChild(this.field_R, 95);
            this.addChild(this.field_P, 95);
          }
          this.addChild(this.field_W, 95);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ih.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getDay(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_4_0 = Integer.parseInt(this.field_R.field_v);
            return stackIn_4_0;
          }
          stackIn_2_0 = -32;
          return stackIn_2_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final void setDateValidator(boolean param0, BirthDateValidator param1) {
        try {
          super.setDateValidator(param0, param1);
          this.field_R.field_p = (WidgetEventListener) ((Object) param1);
          this.field_P.field_p = (WidgetEventListener) ((Object) param1);
          this.field_W.field_p = (WidgetEventListener) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ih.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, 34, param2, param3, param4);
        int var6 = -130 + param3 >> 1;
        if (!this.field_X) {
          this.field_R.setBounds(0, 34, param2, 25, var6);
          this.field_P.setBounds(0, 34, param2, 25, var6 + 45);
          this.field_W.setBounds(0, (int) (char)param1, param2, 40, 90 + var6);
          return;
        }
        this.field_P.setBounds(0, 34, param2, 25, var6);
        this.field_R.setBounds(0, 34, param2, 25, var6 + 45);
        this.field_W.setBounds(0, (int) (char)param1, param2, 40, 90 + var6);
    }

    final int getYear(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 < 75) {
          return -116;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_W.field_v);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    public static void clearDeclaredStaticReferences(byte param0) {
        field_Q = null;
        field_V = null;
        field_T = null;
        field_Y = null;
        if (param0 != 48) {
          return;
        }
        field_S = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        rf.a((byte) -122, param1);
        if (param3 == -1) {
          bb.a(param1, param3 ^ -70, param0, param2);
          return;
        }
        field_U = true;
        bb.a(param1, param3 ^ -70, param0, param2);
    }

    private final void drawDateFieldLabel(UiWidget param0, int param1, String param2, int param3, int param4) {
        if (param3 != -2200) {
          return;
        }
        try {
          rc.field_a.drawCentred(param2, (param0.field_y >> 1) + (param1 + param0.field_u), param0.field_r + (param4 - 5), 16777215, -1);
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "ih.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final int getMonthIndex(int param0) {
        NumberFormatException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (param0 == -1) {
            stackIn_4_0 = -1 + Integer.parseInt(this.field_P.field_v);
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

    static {
        field_O = 0;
        field_Y = "Use this alternative as your account name";
        field_S = new byte[]{(byte)3};
        field_V = "<%0> cannot join; the game has started.";
    }
}
