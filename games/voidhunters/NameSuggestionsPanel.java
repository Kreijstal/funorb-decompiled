/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionsPanel extends UiContainer implements UiActionListener {
    private UiFocusableComponent[] buttons;
    private NameSuggestionTarget target;
    private String[] suggestions;

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, 96, param3);
        if (param2 < 47) {
          UiFocusableComponent var6 = (UiFocusableComponent) null;
          this.onAction(47, 33, 22, (UiFocusableComponent) null, 15);
        }
        if (param1 != 0) {
          return;
        }
        BitmapFont var5 = SetShipToShipRamDamage.field_o;
        if (null != this.suggestions) {
          var5.drawParagraph(SetShipTeamAction.field_a, this.x + param0, this.y + param3, this.width, 20, 16777215, -1, 0, 0, var5.maxAscent + var5.maxDescent);
        }
    }

    public final void onAction(int param0, int param1, int param2, UiFocusableComponent param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = VoidHunters.field_G;
        try {
          if (param0 != 11) {
            return;
          }
          for (var6_int = 0; this.suggestions.length > var6_int; var6_int++) {
            if (this.buttons[var6_int] == param3) {
              this.target.setSuggestedName((byte) 41, this.suggestions[var6_int]);
            }
          }
          if (param3 == this.buttons[this.suggestions.length]) {
            this.target.invalidateNameAvailability(1546);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("rcb.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final void setSuggestions(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        UnderlinedLinkRenderer var4 = null;
        int var6 = 0;
        var6 = VoidHunters.field_G;
        try {
          this.children.clear(101);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.suggestions = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.suggestions[var4_int] = SegmentIntersections.canonicalizeBase37Name((CharSequence) ((Object) param0[var4_int]), false).replace(' ', ' ');
            }
            var4 = new UnderlinedLinkRenderer(SetShipToShipRamDamage.field_o, param1, 1);
            this.buttons = new UiFocusableComponent[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.buttons[var5] = new UiFocusableComponent(this.suggestions[var5], (UiListener) (this));
              this.buttons[var5].renderer = (UiRenderer) ((Object) var4);
              this.buttons[var5].tooltip = OpenGlRenderbuffer.field_p;
              this.buttons[var5].setBounds(0, 80, 15, 1, var5 * 16 + 20);
              this.addChild(-18756, this.buttons[var5]);
            }
            this.buttons[var3_int] = new UiFocusableComponent(GetPointDefenceLaserRandomness.field_o, (UiListener) (this));
            this.buttons[var3_int].renderer = (UiRenderer) ((Object) var4);
            this.buttons[var3_int].setBounds(0, 100, 15, 1, 16 + var3_int * 16 + 20);
            this.addChild(-18756, this.buttons[var3_int]);
            return;
          }
          this.suggestions = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("rcb.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    NameSuggestionsPanel(NameSuggestionTarget param0) {
        super(0, 0, 0, 0, (UiRenderer) null);
        try {
          this.target = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rcb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleKey(int param0, int param1, UiComponent param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_5_0 = this.focusPreviousChild(param2, param0 + 15834);
            return stackIn_5_0;
          }
          if (99 != param1) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(true, param2);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("rcb.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
