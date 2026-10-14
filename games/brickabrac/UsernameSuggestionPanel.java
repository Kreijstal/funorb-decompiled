/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameSuggestionPanel extends WidgetGroup implements WidgetActionListener {
    private UsernameSuggestionListener listener;
    private String[] suggestions;
    static int[] field_I;
    static String field_O;
    static String field_L;
    static String field_N;
    static int field_M;
    private FocusableWidget[] buttons;

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.suggestions.length; var6_int++) {
            if (this.buttons[var6_int] == widget) {
              this.listener.onUsernameSuggestionChosen(this.suggestions[var6_int], (byte) 56);
            }
          }
          if (widget == this.buttons[this.suggestions.length]) {
            this.listener.onRefreshUsernameSuggestions((byte) 100);
          }
          if (obfuscationGuard >= -22) {
            this.drawLayer(-93, -52, -108, (byte) -4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ri.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 > -69) {
          return false;
        }
        return null != VolcanicBackground.field_t ? true : false;
    }

    final void setSuggestions(byte obfuscationGuard, String[] suggestions) {
        int suggestionIndex = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int suggestionCount = 0;
        RuntimeException var3 = null;
        LinkWidgetRenderer rowRenderer = null;
        int buttonIndex = 0;
        int unusedGameFlag = 0;
        int guardComputation;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          this.children.clear((byte) -95);
          if (suggestions != null &&
            suggestions.length != 0) {
            suggestionCount = suggestions.length;
            this.suggestions = new String[suggestionCount];
            for (suggestionIndex = 0; suggestionCount > suggestionIndex; suggestionIndex++) {
              this.suggestions[suggestionIndex] = ap.a(true, (CharSequence) ((Object) suggestions[suggestionIndex])).replace(' ', ' ');
            }
            rowRenderer = new LinkWidgetRenderer(ArchiveNetworkClient.field_u, 0, 1);
            this.buttons = new FocusableWidget[suggestionCount + 1];
            for (buttonIndex = 0; buttonIndex < suggestionCount; buttonIndex++) {
              this.buttons[buttonIndex] = new FocusableWidget(this.suggestions[buttonIndex], (WidgetListener) (this));
              this.buttons[buttonIndex].renderer = (WidgetRenderer) ((Object) rowRenderer);
              this.buttons[buttonIndex].tooltip = aa.field_c;
              this.buttons[buttonIndex].setBounds(15, 0, buttonIndex * 16 + 20, (byte) -119, 80);
              this.addChild(this.buttons[buttonIndex], true);
            }
            this.buttons[suggestionCount] = new FocusableWidget(sh.field_c, (WidgetListener) (this));
            guardComputation = 52 / ((-9 - obfuscationGuard) / 59);
            this.buttons[suggestionCount].renderer = (WidgetRenderer) ((Object) rowRenderer);
            this.buttons[suggestionCount].setBounds(15, 0, 16 * (suggestionCount + 1) + 20, (byte) -119, 100);
            this.addChild(this.buttons[suggestionCount], true);
            return;
          }
          this.suggestions = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("ri.U(").append(obfuscationGuard).append(',');
          if (suggestions == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        if (param0 > -41) {
          return;
        }
        aa.a((byte) 96);
        ArchiveIndex.a(-32120);
    }

    final boolean handleWidgetKey(int keyCode, byte obfuscationGuard, Widget focusRoot, char character) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleWidgetKey(keyCode, obfuscationGuard, focusRoot, character)) {
            return true;
          }
          if (keyCode == 98) {
            stackIn_7_0 = this.b(focusRoot, (byte) -60);
            return stackIn_7_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_11_0 = this.a(focusRoot, (byte) -117);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ri.T(").append(keyCode).append(',').append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(character).append(')').toString());
        }
    }

    final static byte[] readPackedByteArray(byte[] reuse, int lengthBits, BitPacketBuffer packet, int obfuscationGuard) {
        int count = 0;
        int valueBits = 0;
        int base = 0;
        int element = 0;
        int unusedGameFlag = 0;
        byte[] invalidGuardResult = null;
        byte[] result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String reuseSummary = null;
        StringBuilder packetContext = null;
        String packetSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard != 20) {
            invalidGuardResult = (byte[]) null;
            return invalidGuardResult;
          }
          count = packet.readBits(lengthBits, (byte) -112);
          if (count == 0) {
            return null;
          }
          if (reuse == null ||
            reuse.length != count) {
            reuse = new byte[count];
          }
          valueBits = packet.readBits(3, (byte) 98);
          base = (byte)packet.readBits(8, (byte) 31);
          if (0 < valueBits) {
            for (element = 0; element < count; element++) {
              reuse[element] = (byte)(base + packet.readBits(valueBits, (byte) 107));
            }
          } else {
            for (element = 0; element < count; element++) {
              reuse[element] = (byte)base;
            }
          }
          result = (byte[]) (reuse);
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("ri.W(");
          if (reuse == null) {
            reuseSummary = "null";
          } else {
            reuseSummary = "{...}";
          }
          packetContext = ((StringBuilder) (Object) contextBuilder).append(reuseSummary).append(',').append(lengthBits).append(',');
          if (packet == null) {
            packetSummary = "null";
          } else {
            packetSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) packetContext).append(packetSummary).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_I = null;
        if (param0 != -83) {
          field_O = (String) null;
        }
        field_O = null;
        field_L = null;
        field_N = null;
    }

    final static void c(boolean param0) {
        int var1 = 0;
        if (BackgroundScene.masterSoundGain < 224) {
          var1 = BackgroundScene.masterSoundGain % 32;
          SingleChildWidget.a(13894, BackgroundScene.masterSoundGain + (32 - var1));
        } else {
          SingleChildWidget.a(13894, 256);
        }
        if (!param0) {
          field_M = -128;
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        if (layer != 0) {
          return;
        }
        TextFont var5 = ArchiveNetworkClient.field_u;
        if (this.suggestions != null) {
          var5.drawParagraph(AchievementIcon.field_l, parentX + this.x, this.y + parentY, this.width, 20, 16777215, -1, 0, 0, var5.descent + var5.ascent);
        }
    }

    UsernameSuggestionPanel(UsernameSuggestionListener listener) {
        super(0, 0, 0, 0, (WidgetRenderer) null);
        try {
          this.listener = listener;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ri.<init>(" + (listener != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_L = "Continue";
        field_O = "Remove <%0> from ignore list";
    }
}
