/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountMessagePanel extends UiContainer implements ButtonListener {
    static Sprite[][] field_M;
    static PcmSample field_J;
    private int buttonCount;
    static QuickChatDynamicCommand field_P;
    private AccountRequestDialog requestDialog;
    static int field_N;
    private String message;
    private TextButton[] buttons;
    private int[] buttonActions;
    private BitmapFont messageFont;

    final static void setTickRate(int ticksPerSecond, boolean guard) {
        if (!guard) {
          field_M = (Sprite[][]) null;
        }
        sn.field_d = 1000000000L / (long)ticksPerSecond;
    }

    public static void releaseStatics(int guard) {
        field_P = null;
        field_J = null;
        if (guard != 8) {
          return;
        }
        field_M = (Sprite[][]) null;
    }

    final void appendActionButton(boolean guard, String label, int action) {
        if (guard) {
          return;
        }
        try {
          int var4_int = this.buttonCount;
          this.ensureButtonCapacity(1 + var4_int, 106);
          this.buttons[var4_int] = this.appendButton((UiListener) (this), (byte) -67, label);
          this.buttonActions[var4_int] = action;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qi.F(" + guard + ',' + (label != null ? "{...}" : "null") + ',' + action + ')');
        }
    }

    private final void ensureButtonCapacity(int capacity, int guard) {
        int var6 = EscapeVector.obfuscationControl;
        if (capacity <= this.buttonCount) {
          return;
        }
        TextButton[] var7 = new TextButton[capacity];
        TextButton[] var3 = var7;
        int[] var4 = new int[capacity];
        for (int var5 = 0; this.buttonCount > var5; var5++) {
          var7[var5] = this.buttons[var5];
          var4[var5] = this.buttonActions[var5];
        }
        this.buttons = var3;
        this.buttonActions = var4;
        this.buttonCount = capacity;
        if (guard < 98) {
          field_N = -54;
        }
    }

    final TextButton appendButton(UiListener listener, byte guard, String label) {
        String stackIn_7_2 = null;
        String stackIn_10_2 = null;
        try {
          TextButton var4 = new TextButton(label, listener);
          var4.painter = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
          int var5 = this.height - 2;
          if (guard != -67) {
            byte[] var6 = (byte[]) null;
            AccountMessagePanel.decodeCp1252(114, 51, (byte[]) null, (byte) 116);
          }
          this.setBounds(this.width, 0, 0, true, this.height + 34);
          var4.setBounds(this.width - 14, var5, 7, true, 30);
          this.addChild(var4, false);
          TextButton stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var4_ref;
          StringBuilder stackIn_6_1 = new StringBuilder().append("qi.B(");
          if (listener == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          StringBuilder stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(guard).append(',');
          if (label == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    AccountMessagePanel(AccountRequestDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        this.buttonCount = 0;
        try {
          this.message = param2;
          this.messageFont = param1;
          this.requestDialog = param0;
          int var4_int = this.message == null ? 0 : this.messageFont.paragraphHeight(this.message, 260, this.messageFont.maxAscent);
          this.setBounds(288, 0, 0, true, 22 + var4_int);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "qi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onAction(TextButton button, int buttonCode, int localY, int guard, int localX) {
        String stackIn_13_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var6_int = 0;
          if (guard != 1) {
            return;
          }
          while (var6_int < this.buttonCount) {
            if (this.buttons[var6_int] != button) {
              var6_int++;
              continue;
            }
            int var7 = this.buttonActions[var6_int];
            if (var7 != -1) {
              WhirlpoolHasher.a(this.buttonActions[var6_int], 57);
            } else {
              this.requestDialog.closeDialog(-18861);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_12_0 = var6;
          StringBuilder stackIn_12_1 = new StringBuilder().append("qi.K(");
          if (button == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(buttonCode).append(',').append(localY).append(',').append(guard).append(',').append(localX).append(')').toString());
        }
    }

    final static void drawUnevenFrame(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        if (param3 >= 0 &&
          mh.field_a[param3 * 8] == 0) {
          mh.field_a[param3 * 8] = (int)(Math.random() * (double)(param1 + (10 - param6)) * 0.06) + 2;
          mh.field_a[1 + param3 * 8] = 2 + (int)((double)(param1 + 10 - param6) * Math.random() * 0.06) + mh.field_a[8 * param3];
          mh.field_a[2 + 8 * param3] = (int)(0.06 * ((double)(param1 + (10 - param6)) * Math.random())) + 2;
          mh.field_a[3 + param3 * 8] = (int)((double)(-param6 + param1 + 10) * Math.random() * 0.06) + (2 + mh.field_a[8 * param3 + 2]);
          mh.field_a[8 * param3 + 4] = (int)(Math.random() * (double)(-param4 + (param7 + 10)) * 0.06) + 2;
          mh.field_a[8 * param3 + 5] = (int)(Math.random() * (double)(10 + param7 - param4) * 0.06) + 2 + mh.field_a[4 + param3 * 8];
          mh.field_a[6 + param3 * 8] = 2 + (int)((double)(-param4 + (param7 + 10)) * Math.random() * 0.06);
          mh.field_a[param3 * 8 + 7] = (int)((double)(-param4 + 10 + param7) * Math.random() * 0.06) + (2 + mh.field_a[6 + 8 * param3]);
        }
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        if (param3 >= 0) {
          var15 = mh.field_a[param3 * 8 + 6];
          var13 = mh.field_a[4 + 8 * param3];
          var11 = mh.field_a[8 * param3 + 2];
          var10 = mh.field_a[8 * param3 + 1];
          var9 = mh.field_a[param3 * 8];
          var14 = mh.field_a[param3 * 8 + 5];
          var12 = mh.field_a[3 + param3 * 8];
          var16 = mh.field_a[7 + 8 * param3];
        }
        if (param3 == -2) {
          var11 = 8;
          var16 = var15 + 6;
          var14 = 3 + var13;
          var12 = 4 + var11;
        }
        SoftwareRasterizer.drawHorizontalLine(-(param8 * 16) - var9 + param6, param4, var10 + (param1 - param6), param0);
        SoftwareRasterizer.drawHorizontalLine(16 * param8 + (-var9 + param6), param4, var10 + (param1 - param6), param0);
        int var17 = -30 % ((param5 - 20) / 45);
        SoftwareRasterizer.drawHorizontalLine(-(16 * param8) - var11 + param6, -1 + param7, -param6 + (param1 + var12), param0);
        SoftwareRasterizer.drawHorizontalLine(-var11 + param6 + param8 * 16, param7 - 1, var12 + (-param6 + param1), param0);
        SoftwareRasterizer.drawVerticalLine(param6, -(12 * param8) + (-var13 + param4), param7 + (-param4 + var14), param0);
        SoftwareRasterizer.drawVerticalLine(param6, -var13 + (param4 + 12 * param8), var14 - param4 + param7, param0);
        SoftwareRasterizer.drawVerticalLine(-1 + param1, -(12 * param8) + (param4 - var15), param7 + (-param4 + var16), param0);
        SoftwareRasterizer.drawVerticalLine(param1 - 1, 12 * param8 + (-var15 + param4), -param4 + (param7 + var16), param0);
        SoftwareRasterizer.drawHorizontalLine(-var9 + param6 + param8 * 16, param4, -param6 + (param1 + var10) - param8 * 32, param2);
        SoftwareRasterizer.drawHorizontalLine(-var11 + param6 + param8 * 16, param7 - 1, -(32 * param8) + (var12 - param6) + param1, param2);
        SoftwareRasterizer.drawVerticalLine(param6, param8 * 12 + (param4 - var13), -(24 * param8) - param4 + (param7 + var14), param2);
        SoftwareRasterizer.drawVerticalLine(-1 + param1, 12 * param8 + (param4 - var15), var16 + (-param4 + (param7 - param8 * 24)), param2);
    }

    final void drawLayer(int screenY, byte guard, int layer, int screenX) {
        if (guard <= 85) {
          AccountMessagePanel.drawUnevenFrame(-30, 97, 116, 20, 118, -63, -60, -67, 114);
        }
        super.drawLayer(screenY, (byte) 103, layer, screenX);
        this.messageFont.drawParagraph(this.message, 14 + (this.x + screenX), 10 + screenY + this.y, -28 + this.width, this.height, 16777215, -1, 0, 0, this.messageFont.maxAscent);
    }

    final static String decodeCp1252(int length, int offset, byte[] bytes, byte guard) {
        String stackIn_18_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          char[] var12 = new char[length];
          char[] var11 = var12;
          char[] var4 = var11;
          int var5 = 0;
          int var7 = -38 / ((61 - guard) / 36);
          for (int var6 = 0; var6 < length; var6++) {
            int var8 = bytes[offset + var6] & 255;
            if (var8 != 0) {
              if (var8 >= 128 &&
                var8 < 160) {
                int var9 = IntrusiveDeque.field_c[var8 - 128];
                if (var9 == 0) {
                  var9 = 63;
                }
                var8 = var9;
              }
              int incrementValue$1 = var5;
              var5++;
              var4[incrementValue$1] = (char)var8;
            }
          }
          String stackIn_14_0 = new String(var12, 0, var5);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("qi.C(").append(length).append(',').append(offset).append(',');
          if (bytes == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_N = 0;
        field_P = new QuickChatDynamicCommand(1, 2, 2, 0);
    }
}
