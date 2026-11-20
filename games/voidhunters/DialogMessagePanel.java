/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogMessagePanel extends UiContainer implements UiActionListener {
    static String field_F;
    private int[] actionCodes;
    static String field_D;
    private AccountStatusDialog owner;
    static int field_w;
    static Widget field_v;
    static CommandConsole field_C;
    private BitmapFont font;
    private String message;
    static MenuInputState field_z;
    private int actionButtonCount;
    private UiFocusableComponent[] actionButtons;

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = VoidHunters.field_G;
        try {
          if (param0 != 11) {
            return;
          }
          for (var6_int = 0; this.actionButtonCount > var6_int; var6_int++) {
            if (this.actionButtons[var6_int] != param3) {
              continue;
            }
            var7 = this.actionCodes[var6_int];
            if (var7 != -1) {
              GetSelfDestructPrepareToggleCooldown.a(127, this.actionCodes[var6_int]);
            } else {
              this.owner.closeDialog((byte) -106);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("nna.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final void addButton(int param0, String param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.actionButtonCount;
          this.growActionButtons(-4349, var4_int + 1);
          if (param0 > -113) {
            field_D = (String) null;
          }
          this.actionButtons[var4_int] = this.addButton((byte) 62, param1, (UiListener) (this));
          this.actionCodes[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nna.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final UiFocusableComponent addButton(byte param0, String param1, UiListener param2) {
        UiFocusableComponent var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        UiFocusableComponent stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 59) {
            this.drawLayer(78, -29, 18, 90);
          }
          var4 = new UiFocusableComponent(param1, param2);
          var4.renderer = (UiRenderer) ((Object) new ThreeSliceButtonStyle());
          var5 = -2 + this.height;
          this.setBounds(0, this.width, this.height + 34, 1, 0);
          var4.setBounds(7, this.width - 14, 30, 1, var5);
          this.addChild(-18756, var4);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("nna.H(").append(param0).append(',');
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
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(boolean param0) {
        field_F = null;
        field_v = null;
        field_z = null;
        field_C = null;
        if (!param0) {
          DialogMessagePanel.clearSharedReferences(true);
        }
        field_D = null;
    }

    DialogMessagePanel(AccountStatusDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (UiRenderer) null);
        int var4_int = 0;
        this.actionButtonCount = 0;
        try {
          this.message = param2;
          this.owner = param0;
          this.font = param1;
          var4_int = null != this.message ? this.font.getParagraphHeight(this.message, 260, this.font.maxAscent) : 0;
          this.setBounds(0, 288, var4_int + 22, 1, 0);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        if (param2 < 47) {
          UiListener var6 = (UiListener) null;
          this.addButton((byte) -58, (String) null, (UiListener) null);
        }
        super.drawLayer(param0, param1, 61, param3);
        this.font.drawParagraph(this.message, param0 + this.x + 14, 10 + (param3 + this.y), this.width - 28, this.height, 16777215, -1, 0, 0, this.font.maxAscent);
    }

    private final void growActionButtons(int param0, int param1) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (param1 <= this.actionButtonCount) {
          return;
        }
        UiFocusableComponent[] var7 = new UiFocusableComponent[param1];
        UiFocusableComponent[] var3 = var7;
        if (param0 != -4349) {
          return;
        }
        int[] var4 = new int[param1];
        for (var5 = 0; var5 < this.actionButtonCount; var5++) {
          var7[var5] = this.actionButtons[var5];
          var4[var5] = this.actionCodes[var5];
        }
        this.actionButtons = var3;
        this.actionButtonCount = param1;
        this.actionCodes = var4;
    }

    static {
        field_F = "This option cannot be combined with the current settings for:  ";
        field_D = "Return to game";
    }
}
