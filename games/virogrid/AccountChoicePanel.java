/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountChoicePanel extends WidgetContainer implements ButtonActionListener {
    static int field_E;
    private TextButton field_I;
    static String field_D;
    static String field_F;
    private TextButton field_G;
    private TextButton field_H;

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        int var5 = param1 + this.field_l;
        int var6 = this.field_u + param2;
        PlayerContextMenu.arezzo14Font.drawParagraph(PendingRequest.field_n, 20 + var5, 20 + var6, -40 + this.field_g, this.field_m - 50, 16777215, -1, 1, 0, PlayerContextMenu.arezzo14Font.field_H);
        super.drawLayer(param0, param1, param2, param3);
    }

    final static void sendChatMessage(int param0, int param1, String param2, int param3, byte param4, String param5) {
        int var7 = 0;
        CipherPacketBuffer var8 = IterableNodeHashTable.field_g;
        CipherPacketBuffer var6 = var8;
        var8.writeCipheredOpcode(param3, 8);
        var8.position = var8.position + 1;
        if (param4 != 39) {
          return;
        }
        try {
          var7 = var8.position;
          var8.writeByte(param1, -69);
          if (param1 == 2) {
            var8.writeString(param2, (byte) -102);
          }
          if (param5 != null) {
            IconLabelWidget.writeCompressedString(true, param5, var8);
          } else {
            var8.writeShort((byte) -78, param0);
          }
          var8.backpatchByteLength(var8.position - var7, -1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jl.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] readTextResourceBytes(String param0, boolean param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            stackIn_4_0 = DialWidgetPainter.field_m.getFileByName("", 100, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("jl.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onAction(int param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 12085) {
            field_E = -62;
          }
          if (this.field_H == param1) {
            RenderTargetHelpers.openLoginForm(256);
            return;
          }
          if (this.field_G == param1) {
            ArchiveFactoryHelpers.openAccountCreation(false);
            return;
          }
          if (this.field_I != param1) {
            return;
          }
          BitCountAndDialogHelpers.openAccountMessageDialog(param0 ^ -18303);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("jl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean handleKeyInput(UiWidget param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, 13)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.focusPreviousChild(2, param0);
            return stackIn_7_0;
          }
          if (param2 == 99) {
            stackIn_10_0 = this.focusNextChild(-16234, param0);
            return stackIn_10_0;
          }
          var5_int = -63 % ((-75 - param3) / 36);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("jl.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public AccountChoicePanel() {
        super(0, 0, 476, 225, (WidgetListener) null);
        this.field_G = new TextButton(DelayedPacket.field_g, (UiListener) null);
        this.field_H = new TextButton(DialWidgetPainter.field_o, (UiListener) null);
        this.field_I = new TextButton(DecodedSpriteHelpers.field_e, (UiListener) null);
        ThreeSliceButtonPainter var1 = new ThreeSliceButtonPainter();
        this.field_G.listener = (WidgetListener) ((Object) var1);
        this.field_H.listener = (WidgetListener) ((Object) var1);
        this.field_I.listener = (WidgetListener) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_H.setBounds(30, true, this.field_m - 48 - var2, -var3 + this.field_g >> 1, var4);
        this.field_I.setBounds(30, true, -var2 + this.field_m - 48, var2 + var4 + (this.field_g - var3 >> 1), var4);
        this.field_G.setBounds(30, true, this.field_m - 78 - 2 * var2, this.field_g - var3 >> 1, var3);
        this.field_H.field_o = (UiListener) (this);
        this.field_G.field_o = (UiListener) (this);
        this.field_I.field_o = (UiListener) (this);
        this.field_G.field_h = LongAndTextCredentials.field_j;
        this.field_I.field_h = LobbySessionHelpers.field_f;
        this.addChild((UiWidget) (this.field_H), (byte) -78);
        this.addChild((UiWidget) (this.field_G), (byte) -78);
        this.addChild((UiWidget) (this.field_I), (byte) -78);
    }

    final static boolean getAccountCreationOptIn(int param0) {
        if (param0 > -123) {
          field_F = (String) null;
          return BirthDateEntryPanel.field_J;
        }
        return BirthDateEntryPanel.field_J;
    }

    public static void releaseStatics(int param0) {
        field_D = null;
        field_F = null;
        if (param0 != 15354) {
          String var2 = (String) null;
          AccountChoicePanel.sendChatMessage(41, -123, (String) null, -103, (byte) -32, (String) null);
        }
    }

    static {
        field_F = "Unable to add friend - system busy";
        field_D = "Back";
    }
}
