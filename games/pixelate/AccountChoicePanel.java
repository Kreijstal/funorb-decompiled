/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountChoicePanel extends UiContainer implements ButtonListener {
    static String field_K;
    static String field_I;
    private TextButton field_N;
    static String field_P;
    static int field_M;
    private TextButton field_L;
    static Sprite field_O;
    private TextButton field_J;

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        SceneWidget stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        SceneWidget stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean stackIn_16_2 = false;
        SceneWidget stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        boolean stackIn_21_2 = false;
        SceneWidget stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        boolean stackIn_57_2 = false;
        SceneWidget stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        boolean stackIn_64_2 = false;
        SceneWidget stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        boolean stackIn_69_2 = false;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        EditableTextWidget.m(67);
        if (gi.field_a < 0) {
          ValidatedTextWidget.field_lb.field_cb = null;
          if (param0 != 2) {
            return;
          }
          stackIn_8_0 = GreenGrowTheRushesBackground.field_n;
          stackIn_8_1 = -28476;
          stackIn_9_2 = (param2) && (!param3) && (!LobbyPlayer.field_Wb) && (null == io.field_c) && (null == DraggableWidget.field_S);
          ((SceneWidget) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_9_2);
          stackIn_15_0 = MidiPcmStream.field_E;
          stackIn_15_1 = param0 - 28478;
          stackIn_16_2 = (param2) && (!param3) && (!LobbyPlayer.field_Wb) && (io.field_c == null) && (null == DraggableWidget.field_S);
          ((SceneWidget) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_16_2);
          stackIn_20_0 = TickClock.field_e;
          stackIn_20_1 = param0 - 28478;
          stackIn_21_2 = (param2) && (!param3) && (LobbyPlayer.field_Wb);
          ((SceneWidget) (Object) stackIn_20_0).a(stackIn_20_1, stackIn_21_2);
        } else {
          ValidatedTextWidget.field_lb.field_cb = AlphaContainer.a(oi.field_d, 89, new String[]{Integer.toString(gi.field_a)});
          if (param0 != 2) {
            return;
          }
          stackIn_56_0 = GreenGrowTheRushesBackground.field_n;
          stackIn_56_1 = -28476;
          stackIn_57_2 = (param2) && (!param3) && (!LobbyPlayer.field_Wb) && (null == io.field_c) && (null == DraggableWidget.field_S);
          ((SceneWidget) (Object) stackIn_56_0).a(stackIn_56_1, stackIn_57_2);
          stackIn_63_0 = MidiPcmStream.field_E;
          stackIn_63_1 = param0 - 28478;
          stackIn_64_2 = (param2) && (!param3) && (!LobbyPlayer.field_Wb) && (io.field_c == null) && (null == DraggableWidget.field_S);
          ((SceneWidget) (Object) stackIn_63_0).a(stackIn_63_1, stackIn_64_2);
          stackIn_68_0 = TickClock.field_e;
          stackIn_68_1 = param0 - 28478;
          stackIn_69_2 = (param2) && (!param3) && (LobbyPlayer.field_Wb);
          ((SceneWidget) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_69_2);
        }
        cl.field_g.field_g.b((byte) -88);
        if (ValidatedTextWidget.field_cb.field_P != 0) {
          fc.field_a = true;
        }
        if (lg.field_c.field_P != 0) {
          if (fe.field_a) {
            AudioService.a(83, param1);
          } else {
            if (0 < BufferedRandomAccessFile.field_j) {
              AudioService.a(83, param1);
            } else {
              if (2 > wo.field_h) {
                PlayerBoard.field_g = true;
              } else {
                if (EmailValidator.field_m[12]) {
                  AudioService.a(83, param1);
                } else {
                  PlayerBoard.field_g = true;
                }
              }
            }
          }
        }
        if (0 != MusicPatchNode.field_p.field_P) {
          if (1 == LinkButtonPainter.field_a.length &&
            GameApplet.field_o != LinkButtonPainter.field_a[0]) {
            GameApplet.field_o = LinkButtonPainter.field_a[0];
          }
          DialWidget.a(param1, bg.field_d, GameApplet.field_o, 0, true, (byte) -76);
        }
        if (DelegatingCanvas.field_h.field_P != 0) {
          LobbyPlayer.field_Wb = false;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = this.field_z + param2;
        int var6 = this.field_p + param0;
        int var7 = 87 % ((70 - param3) / 49);
        he.field_d.drawParagraph(ClientContextMenu.field_n, 20 + var5, 20 + var6, -40 + this.field_E, -50 + this.field_C, 16777215, -1, 1, 0, he.field_d.maxAscent);
        super.a(param0, param1, param2, (byte) 122);
    }

    final boolean onFocusedKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.onFocusedKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_6_0 = this.focusNextChild(0, param2);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.b(10, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("jh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onAction(TextButton param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        UiComponent var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          if (param2 != 11) {
            var8 = (UiComponent) null;
            this.onFocusedKey(-91, 51, (UiComponent) null, '0');
          }
          if (this.field_N != param0) {
            if (this.field_J != param0) {
              if (param0 == this.field_L) {
                CheckboxPainter.a(-22218);
              }
            } else {
              id.a(param2 + 87);
            }
          } else {
            IntrusiveDequeCursor.b(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("jh.Q(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public AccountChoicePanel() {
        super(0, 0, 476, 225, (WidgetPainter) null);
        this.field_J = new TextButton(AlphaContainer.field_M, (UiListener) null);
        this.field_N = new TextButton(MatchController.field_v, (UiListener) null);
        this.field_L = new TextButton(fc.field_c, (UiListener) null);
        ThreeSliceButtonPainter var1 = new ThreeSliceButtonPainter();
        this.field_J.field_y = (WidgetPainter) ((Object) var1);
        this.field_N.field_y = (WidgetPainter) ((Object) var1);
        this.field_L.field_y = (WidgetPainter) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = -var2 + var3 >> 1;
        this.field_N.a(var4, (byte) 98, -var2 + (this.field_C - 48), -var3 + this.field_E >> 1, 30);
        this.field_L.a(var4, (byte) 85, -var2 + this.field_C - 48, var2 + (var4 + (-var3 + this.field_E >> 1)), 30);
        this.field_J.a(var3, (byte) 103, -(2 * var2) + (this.field_C - 78), this.field_E - var3 >> 1, 30);
        this.field_N.field_n = (UiListener) (this);
        this.field_J.field_n = (UiListener) (this);
        this.field_J.field_l = KeyboardInputHandler.field_a;
        this.field_L.field_n = (UiListener) (this);
        this.field_L.field_l = up.field_q;
        this.b(this.field_N, 80);
        this.b(this.field_J, 80);
        this.b(this.field_L, 80);
    }

    public static void a(byte param0) {
        field_K = null;
        if (param0 != -123) {
          return;
        }
        field_P = null;
        field_I = null;
        field_O = null;
    }

    static {
        field_I = "Loading music";
        field_K = "Return to Main Menu";
        field_P = "Public chat is unavailable while setting up a rated game.";
    }
}
