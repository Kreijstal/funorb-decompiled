/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateOfBirthPanel extends ArrayWidgetContainer implements ButtonListener {
    static String field_F;
    static String field_H;
    private NumericDateInputWidget field_G;
    static boolean field_E;
    static String field_B;
    static int[] field_C;
    private TextButton field_D;

    final void updatePointerState(byte param0, UiWidget param1, int param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_D.field_y = this.field_G.getValidationSource((byte) -125).getValidationState(-24407) == LobbyPlayerRow.field_yb ? true : false;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ib.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final void onAction(int param0, TextButton param1, int param2, byte param3, int param4) {
        if (param3 < 64) {
          return;
        }
        if (this.field_G.getValidationSource((byte) -125).getValidationState(-24407) != LobbyPlayerRow.field_yb) {
          return;
        }
        try {
          TrinketSlot.a((byte) -113, this.field_G.getYear(-1), this.field_G.getMonthIndex((byte) 48), this.field_G.getDay(85));
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ib.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static byte[] loadNamedResource(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -79) {
            field_H = (String) null;
          }
          stackIn_3_0 = PlayerStats.field_m.takeFileByName(param0, "", 120);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ib.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void layoutChildWidgets(byte param0) {
        int var2 = 250;
        this.field_G.setBounds(25, param0 + 119, -var2 + this.field_n >> 1, 140, 20 + this.field_i - 25 >> 1);
        this.field_D.setBounds(30, 1, 140 + (this.field_n - var2 >> 1) + 10, 100, (20 + (this.field_i - 30) >> 1) + 2);
        if (param0 == -118) {
          return;
        }
        field_C = (int[]) null;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, (int) (char)param1, param2, param3);
        EmailSyntaxValidator.field_k.drawText(DebugConsole.field_v, 4 + param2 + this.field_t, 4 + EmailSyntaxValidator.field_k.field_G + (this.field_g + param3), 16777215, -1);
    }

    DateOfBirthPanel(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetPainter) null);
        this.field_G = new NumericDateInputWidget(new BeveledTextPainter(10000536), field_E, 0, 0, 140, 25);
        this.field_G.setValidator(new DateInputValidator(), -20274);
        this.field_D = new TextButton(RowRangeRequest.field_g, (UiListener) (this));
        this.field_w = new UiWidget[]{(UiWidget) ((Object) this.field_G), (UiWidget) ((Object) this.field_D)};
        this.field_D.field_r = (WidgetPainter) ((Object) new SpriteButtonPainter());
        this.refreshLayout(-1947);
    }

    public static void releaseStatics(int param0) {
        field_F = null;
        field_B = null;
        field_H = null;
        if (param0 != 905215457) {
          DateOfBirthPanel.releaseStatics(-67);
          field_C = null;
          return;
        }
        field_C = null;
    }

    static {
        field_H = "user";
        field_B = "This is your RuneScape clan if you have one.";
        field_F = "Players: <%0>/<%1>";
        field_C = new int[8192];
    }
}
