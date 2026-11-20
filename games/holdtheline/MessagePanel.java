/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MessagePanel extends WidgetContainer implements ButtonActionListener {
    private BitmapFont field_I;
    private TextButton[] field_G;
    static String field_K;
    private int[] field_J;
    static String field_H;
    private String field_M;
    private int field_L;
    private AccountProgressDialog field_F;

    public static void clearSharedReferences(byte param0) {
        if (param0 != 25) {
          field_H = (String) null;
          field_K = null;
          field_H = null;
          return;
        }
        field_K = null;
        field_H = null;
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          for (var6_int = 0; this.field_L > var6_int; var6_int++) {
            if (this.field_G[var6_int] != param1) {
              continue;
            }
            var7 = this.field_J[var6_int];
            if (-1 == var7) {
              this.field_F.closeProgressDialog((byte) -115);
            } else {
              RotatedSpriteAsset.requestAccountAction(0, this.field_J[var6_int]);
            }
            break;
          }
          if (param2 == -4) {
            return;
          }
          MessagePanel.clearSharedReferences((byte) -38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("nh.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final TextButton addButton(int param0, WidgetListener param1, String param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton var6 = null;
        TextButton stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param2, param1);
          var4.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
          var5 = -2 + this.height;
          this.setBounds(0, (byte) 122, 0, 34 + this.height, this.width);
          var4.setBounds(7, (byte) 122, var5, 30, -14 + this.width);
          if (param0 < 43) {
            var6 = (TextButton) null;
            this.onButtonAction(-64, (TextButton) null, 28, 127, 42);
          }
          this.addChild(true, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("nh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    MessagePanel(AccountProgressDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.field_L = 0;
        try {
          this.field_I = param1;
          this.field_F = param0;
          this.field_M = param2;
          var4_int = this.field_M == null ? 0 : this.field_I.getParagraphHeight(this.field_M, 260, this.field_I.ascent);
          this.setBounds(0, (byte) 122, 0, 22 + var4_int, 288);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void resetHoverTarget(int param0) {
        SecondaryNodeDeque.field_f = param0;
        SpriteSheetAsset.field_k = false;
        AccountCreationForm.field_I = -1;
    }

    private final void ensureButtonCapacity(int param0, byte param1) {
        int var5 = 0;
        int var6 = HoldTheLine.field_D;
        if (this.field_L >= param0) {
          return;
        }
        TextButton[] var7 = new TextButton[param0];
        TextButton[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = 0; this.field_L > var5; var5++) {
          var7[var5] = this.field_G[var5];
          var4[var5] = this.field_J[var5];
        }
        this.field_L = param0;
        this.field_J = var4;
        if (param1 > 125) {
          this.field_G = var3;
          return;
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3);
        this.field_I.drawParagraph(this.field_M, 14 + (this.x + param2), 10 + (this.y + param1), this.width - 28, this.height, 16777215, -1, 0, 0, this.field_I.ascent);
    }

    final void addActionButton(int param0, String param1, byte param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_L;
          this.ensureButtonCapacity(var4_int + 1, (byte) 127);
          this.field_G[var4_int] = this.addButton(76, (WidgetListener) (this), param1);
          if (param2 <= 52) {
            this.field_G = (TextButton[]) null;
          }
          this.field_J[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "nh.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_K = "Achievements";
        field_H = "Account created successfully!";
    }
}
