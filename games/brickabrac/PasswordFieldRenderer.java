/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PasswordFieldRenderer extends TextFieldRenderer {
    static int pendingPacketOpcode;
    static AudioMixer soundMixer;
    static String field_H;
    static PaletteFont field_D;
    static NodeDeque field_E;
    static long field_G;
    static NodeDeque pendingIntArrayRequests;

    public static void b(int param0) {
        pendingIntArrayRequests = null;
        field_E = null;
        if (param0 >= -55) {
          return;
        }
        field_H = null;
        soundMixer = null;
        field_D = null;
    }

    final static int b(byte param0, int param1) {
        if (param0 <= -84) {
          param1 = ((param1 & -1431655766) >>> 1) + (1431655765 & param1);
          param1 = ((param1 & -858993460) >>> 2) + (param1 & 858993459);
          param1 = (param1 >>> 4) + param1 & 252645135;
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return 255 & param1;
        }
        PasswordFieldRenderer.b((byte) 47, 6);
        param1 = ((param1 & -1431655766) >>> 1) + (1431655765 & param1);
        param1 = ((param1 & -858993460) >>> 2) + (param1 & 858993459);
        param1 = (param1 >>> 4) + param1 & 252645135;
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
    }

    PasswordFieldRenderer(int textColor) {
        this(ArchiveNetworkClient.field_u, textColor);
    }

    final String getDisplayText(Widget widget, boolean obfuscationGuard) {
        RuntimeException var3 = null;
        Widget var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            var4 = (Widget) null;
            this.getDisplayText((Widget) null, false);
          }
          stackIn_3_0 = InteractiveGameClient.a('*', 122, widget.text.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ob.Q(");
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private PasswordFieldRenderer(TextFont font, int textColor) {
        super(font, textColor);
    }

    static {
        field_H = "Add <%0> to ignore list";
        pendingPacketOpcode = -1;
        field_E = new NodeDeque();
        pendingIntArrayRequests = new NodeDeque();
    }
}
