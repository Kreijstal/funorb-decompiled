/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDateEntryPanel extends ArrayWidgetContainer implements ButtonListener {
    private TextButton field_O;
    static IntrusiveDeque field_P;
    static int field_G;
    private NumericDateInputWidget field_Q;
    static int[] field_N;
    static String field_R;

    final void a(int param0) {
        int var2 = 250;
        if (param0 == 14210) {
          this.field_Q.a(140, (byte) 73, 20 + (this.field_C - 25) >> 1, this.field_E - var2 >> 1, 25);
          this.field_O.a(100, (byte) 57, 2 + (-30 + (20 + this.field_C) >> 1), 10 + ((this.field_E - var2 >> 1) + 140), 30);
          return;
        }
    }

    public static void n(int param0) {
        field_R = null;
        if (param0 != -8012) {
          field_N = (int[]) null;
          field_N = null;
          field_P = null;
          return;
        }
        field_N = null;
        field_P = null;
    }

    final void updatePointer(int param0, int param1, int param2, UiComponent param3) {
        RuntimeException var5 = null;
        UiComponent var6 = null;
        TextButton stackIn_2_0 = null;
        boolean stackIn_3_1 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          super.updatePointer(param0 ^ 0, param1, param2, param3);
          stackIn_2_0 = this.field_O;
          stackIn_3_1 = (this.field_Q.a(1).a((byte) 88) == qk.field_g);
          stackIn_2_0.field_H = stackIn_3_1;
          if (param0 == 40) {
            return;
          }
          var6 = (UiComponent) null;
          this.updatePointer(78, -97, 93, (UiComponent) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("oj.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void onAction(TextButton param0, int param1, int param2, int param3, int param4) {
        if (this.field_Q.a(1).a((byte) 69) != qk.field_g) {
          return;
        }
        try {
          ui.a(123, this.field_Q.e((byte) 83), this.field_Q.c(true), this.field_Q.getMonthIndex(25));
          if (param2 != 11) {
            field_R = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "oj.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    BirthDateEntryPanel(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetPainter) null);
        this.field_Q = new NumericDateInputWidget(new GradientOutlineTextPainter(10000536), TextFieldValidator.field_l, 0, 0, 140, 25);
        this.field_Q.a(new DateOfBirthValidator(), 20672);
        this.field_O = new TextButton(MusicCrossfadeStream.field_J, (UiListener) (this));
        this.children = new UiComponent[]{(UiComponent) ((Object) this.field_Q), (UiComponent) ((Object) this.field_O)};
        this.field_O.field_y = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.c((byte) 121);
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, (byte) 119);
        ep.field_b.drawText(UiComponent.field_v, 4 + param2 + this.field_z, ep.field_b.maxAscent + (param0 + this.field_p + 4), 16777215, -1);
        int var5 = -53 % ((70 - param3) / 49);
    }

    static {
        field_G = -1;
        field_P = new IntrusiveDeque();
        field_N = new int[]{2, 20, 21, 27, 6, 5, 9};
        field_R = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
