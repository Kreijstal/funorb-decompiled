/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionsPanel extends WidgetContainer implements ButtonListener {
    static String field_I;
    private NameSuggestionListener field_C;
    private String[] field_H;
    private TextButton[] field_F;
    static String field_B;
    static int field_G;
    static UiLayoutNode field_E;

    final static int a(ea param0, int[][][] param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            stackIn_4_0 = -param1[param0.field_c][param0.field_i][param0.field_k] + param1[param0.field_c][param0.field_d][param0.field_k] + (-param1[param0.field_c][param0.field_d][param0.field_e] + param1[param0.field_l][param0.field_i][param0.field_k]) + (-param1[param0.field_l][param0.field_i][param0.field_e] + (param1[param0.field_l][param0.field_d][param0.field_e] - param1[param0.field_l][param0.field_d][param0.field_k]) + param1[param0.field_c][param0.field_i][param0.field_e]);
            return stackIn_4_0;
          }
          stackIn_2_0 = 115;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("fr.G(");
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

    public static void a(int param0) {
        field_B = null;
        if (param0 != 0) {
          field_G = 118;
        }
        field_E = null;
        field_I = null;
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkTextPainter var4 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        try {
          this.field_y.clear(22997);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_H = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_H[var4_int] = hv.a(false, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            if (param1 >= -27) {
              this.field_H = (String[]) null;
            }
            var4 = new LinkTextPainter(gf.field_a, 0, 1);
            this.field_F = new TextButton[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_F[var5] = new TextButton(this.field_H[var5], (UiListener) (this));
              this.field_F[var5].field_r = (WidgetPainter) ((Object) var4);
              this.field_F[var5].field_u = TextHotspotWidget.field_G;
              this.field_F[var5].setBounds(15, 1, 0, 80, var5 * 16 + 20);
              this.a(-23, this.field_F[var5]);
            }
            this.field_F[var3_int] = new TextButton(PlayingView.field_K, (UiListener) (this));
            this.field_F[var3_int].field_r = (WidgetPainter) ((Object) var4);
            this.field_F[var3_int].setBounds(15, 1, 0, 100, 20 + 16 * (var3_int + 1));
            this.a(-52, this.field_F[var3_int]);
            return;
          }
          this.field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("fr.F(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean handleKeyInput(char param0, byte param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_9_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -60) {
            NameSuggestionsPanel.a((byte) -18);
          }
          if (super.handleKeyInput(param0, (byte) -87, param2, param3)) {
            return true;
          }
          if (param3 == 98) {
            stackIn_9_0 = this.a(param2, (byte) -100);
            return stackIn_9_0;
          }
          if (99 != param3) {
            return false;
          }
          stackIn_13_0 = this.b(param2, (byte) 127);
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("fr.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    NameSuggestionsPanel(NameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_C = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "fr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0) {
        CachedArchiveSource.field_u = new AccountRegistrationPanel();
        if (param0 != -76) {
          field_B = (String) null;
        }
        we.field_a.a((byte) -118, (UiWidget) (CachedArchiveSource.field_u));
    }

    final static TextWidgetPainter h(byte param0) {
        if (param0 != 66) {
          return (TextWidgetPainter) null;
        }
        if (null == ArchiveManager.field_e) {
          ArchiveManager.field_e = new TextWidgetPainter(EmailSyntaxValidator.field_k, 20, 0, 0, 0, 11579568, -1, 0, 0, EmailSyntaxValidator.field_k.field_G, -1, 2147483647, true);
        }
        return ArchiveManager.field_e;
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
          return;
        }
        BitmapFont var5 = gf.field_a;
        if (null != this.field_H) {
          var5.a(CheatCodeListener.field_d, param2 + this.field_t, param3 + this.field_g, this.field_n, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_p);
        }
    }

    public final void onAction(int param0, TextButton param1, int param2, byte param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Kickabout.field_G;
        try {
          if (param3 <= 64) {
            return;
          }
          for (var6_int = 0; this.field_H.length > var6_int; var6_int++) {
            if (param1 == this.field_F[var6_int]) {
              this.field_C.onSuggestionChosen(this.field_H[var6_int], 15);
            }
          }
          if (param1 == this.field_F[this.field_H.length]) {
            this.field_C.onRefreshSuggestions(-1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("fr.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_B = "Status";
        field_I = "Use the buttons to choose your formation. Click OK when ready.";
    }
}
