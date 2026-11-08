/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountMessagePanel extends WidgetContainer implements ButtonListener {
    static UiLayoutNode field_L;
    static String field_C;
    static int[] field_I;
    private BitmapFont field_B;
    private AccountRequestDialog field_E;
    static int field_H;
    private int[] field_M;
    private String field_D;
    static int[] field_G;
    private int field_N;
    static String field_F;
    private TextButton[] field_J;

    public final void onAction(int param0, TextButton param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Kickabout.field_G;
        try {
          if (param3 <= 64) {
            field_F = (String) null;
          }
          var6_int = 0;
          while (true) {
            if (this.field_N <= var6_int) {
              return;
            }
            if (this.field_J[var6_int] != param1) {
              var6_int++;
              continue;
            }
            break;
          }
          var7 = this.field_M[var6_int];
          if (var7 != -1) {
            IndexedSpriteState.setAccountMenuMode(38, this.field_M[var6_int]);
            return;
          }
          this.field_E.closeDialog(-77);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("qp.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_L = null;
        field_G = null;
        if (param0 == 14) {
          field_C = null;
          field_F = null;
          field_I = null;
          return;
        }
        AccountMessagePanel.a(-121, true, 59);
        field_C = null;
        field_F = null;
        field_I = null;
    }

    private final void ensureActionCapacity(int param0, int param1) {
        int var5 = 0;
        int var6 = Kickabout.field_G;
        if (this.field_N >= param1) {
          return;
        }
        TextButton[] var7 = new TextButton[param1];
        TextButton[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = param0; this.field_N > var5; var5++) {
          var7[var5] = this.field_J[var5];
          var4[var5] = this.field_M[var5];
        }
        this.field_J = var3;
        this.field_M = var4;
        this.field_N = param1;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, (int) (char)param1, param2, param3);
        this.field_B.drawParagraph(this.field_D, 14 + (param2 + this.field_t), 10 + (this.field_g + param3), -28 + this.field_n, this.field_i, 16777215, -1, 0, 0, this.field_B.field_G);
    }

    final TextButton appendButton(String param0, UiListener param1, byte param2) {
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
          if (param2 != 79) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          var4 = new TextButton(param0, param1);
          var4.field_r = (WidgetPainter) ((Object) new SpriteButtonPainter());
          var5 = -2 + this.field_i;
          this.setBounds(34 + this.field_i, 1, 0, this.field_n, 0);
          var4.setBounds(30, param2 ^ 78, 7, this.field_n - 14, var5);
          this.addChild(-102, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("qp.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final void addActionButton(byte param0, int param1, String param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_N;
          this.ensureActionCapacity(0, var4_int + 1);
          this.field_J[var4_int] = this.appendButton(param2, (UiListener) (this), (byte) 79);
          if (param0 <= 53) {
            String var5 = (String) null;
            this.addActionButton((byte) -105, -6, (String) null);
          }
          this.field_M[var4_int] = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qp.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    AccountMessagePanel(AccountRequestDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        int var4_int = 0;
        this.field_N = 0;
        try {
          this.field_D = param2;
          this.field_E = param0;
          this.field_B = param1;
          var4_int = null == this.field_D ? 0 : this.field_B.paragraphHeight(this.field_D, 260, this.field_B.field_G);
          this.setBounds(22 + var4_int, 1, 0, 288, 0);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "qp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(int param0, boolean param1, int param2) {
        if (5 == param0) {
          return LoginDialog.substitutePlaceholders(-18, ConsoleParseException.field_b, new String[]{LocalizedTextLoader.formatCurrencyAmount(param2, 26300)});
        }
        if (4 == param0) {
          return LoginDialog.substitutePlaceholders(-18, UnreadMessagesScreen.field_B, new String[]{LocalizedTextLoader.formatCurrencyAmount(param2, 26300)});
        }
        if (param0 == 3) {
          return ConsoleExpression.field_e;
        }
        if (1 == param0) {
          return LoginDialog.substitutePlaceholders(-18, SocialRowOrderSupport.field_g, new String[]{LocalizedTextLoader.formatCurrencyAmount(param2, 26300), LocalizedTextLoader.formatCurrencyAmount((int)((double)param2 * 0.9), 26300)});
        }
        if (param0 == 2) {
          return PasswordFieldPainter.field_C;
        }
        if (!param1) {
          throw new IllegalStateException();
        }
        field_F = (String) null;
        throw new IllegalStateException();
    }

    static {
        field_C = "Qualifying Round";
        field_I = new int[8192];
        field_F = "Please enter your age in years";
    }
}
