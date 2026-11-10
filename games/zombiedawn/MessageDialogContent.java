/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessageDialogContent extends UiContainer implements ButtonActionListener {
    static int field_O;
    private TextButton[] field_F;
    static String field_I;
    static int field_H;
    private Font field_L;
    private int[] field_J;
    static DialogLayer field_S;
    private int field_N;
    private String field_Q;
    static Sprite field_G;
    private ProgressMessageDialog field_R;
    static int field_P;
    static int field_K;

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3 ^ 0);
        this.field_L.drawParagraph(this.field_Q, this.field_k + param2 + 14, this.field_j + (param0 + 10), this.field_i - 28, this.field_n, 16777215, -1, 0, param3, this.field_L.field_I);
    }

    final TextButton addButton(String param0, int param1, WidgetListener param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_2_0 = null;
        TextButton stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 102) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          var4 = new TextButton(param0, param2);
          var4.field_h = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          var5 = -2 + this.field_n;
          this.setBounds(113, 0, 0, this.field_i, this.field_n + 34);
          var4.setBounds(51, var5, 7, -14 + this.field_i, 30);
          this.addChild(var4, 10);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("e.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void addActionButton(byte param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = this.field_N;
          this.ensureActionCapacity(-128, 1 + var4_int);
          this.field_F[var4_int] = this.addButton(param1, 125, (WidgetListener) (this));
          this.field_J[var4_int] = param2;
          if (param0 < 88) {
            this.field_F = (TextButton[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("e.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void ensureActionCapacity(int param0, int param1) {
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        if (this.field_N >= param1) {
          return;
        }
        int var4 = -81 / ((-66 - param0) / 59);
        TextButton[] var8 = new TextButton[param1];
        TextButton[] var3 = var8;
        int[] var5 = new int[param1];
        for (var6 = 0; this.field_N > var6; var6++) {
          var8[var6] = this.field_F[var6];
          var5[var6] = this.field_J[var6];
        }
        this.field_N = param1;
        this.field_J = var5;
        this.field_F = var3;
    }

    MessageDialogContent(ProgressMessageDialog param0, Font param1, String param2) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        int var4_int = 0;
        this.field_N = 0;
        try {
          this.field_L = param1;
          this.field_Q = param2;
          this.field_R = param0;
          var4_int = this.field_Q != null ? this.field_L.paragraphHeight(this.field_Q, 260, this.field_L.field_I) : 0;
          this.setBounds(44, 0, 0, 288, var4_int + 22);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "e.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_S = null;
        field_I = null;
        if (!param0) {
          field_G = (Sprite) null;
        }
        field_G = null;
    }

    public final void onButtonActivated(int param0, int param1, TextButton param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = ZombieDawn.field_J;
        try {
          if (param1 != -6) {
            this.ensureActionCapacity(-49, -101);
          }
          for (var6_int = 0; var6_int < this.field_N; var6_int++) {
            if (param2 != this.field_F[var6_int]) {
              continue;
            }
            var7 = this.field_J[var6_int];
            if (var7 == -1) {
              this.field_R.closeDialog((byte) -126);
            } else {
              NetworkArchiveRequest.setPendingAccountAction(param1 ^ 120, this.field_J[var6_int]);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("e.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_O = 500;
        field_I = "Unpacking music";
        field_P = -1;
        field_K = 67;
    }
}
