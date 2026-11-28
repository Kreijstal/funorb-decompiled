/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RegistrationAgreementPane extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener {
    static int rendererStrikethroughColor;
    static int[] field_B;
    private AccountCreationResultPanel field_y;
    private RichTextWidget field_A;
    static int field_v;
    static int[] field_w;
    static String field_x;
    static boolean field_C;
    private InteractiveWidget field_z;
    static RenderSprite[] medalSprites;

    public final void onTextHotspotActivated(byte param0, int param1, RichTextWidget param2, int param3) {
        String stackIn_14_2 = null;
        int var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param3 == 0) {
            qk.a("terms.ws", false);
          } else if (1 == param3) {
            qk.a("privacy.ws", false);
          } else if (param3 == 2) {
            qk.a("conduct.ws", false);
          }
          if (param0 < -59) {
            return;
          }
          RegistrationAgreementPane.clearStaticReferences((byte) -100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var5;
          StringBuilder stackIn_13_1 = new StringBuilder().append("rs.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean handleKey(int param0, int param1, char param2, UiWidget param3) {
        String stackIn_16_2 = null;
        try {
          if (super.handleKey(-117, param1, param2, param3)) {
            return true;
          }
          if (98 == param1) {
            boolean stackIn_7_0 = this.focusPreviousChild(param3, -87);
            return stackIn_7_0;
          }
          int var5_int = 11 / ((param0 + 53) / 33);
          if (param1 != 99) {
            return false;
          }
          boolean stackIn_10_0 = this.focusNextChild(80, param3);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var5;
          StringBuilder stackIn_15_1 = new StringBuilder().append("rs.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_B = null;
        field_w = null;
        field_x = null;
        medalSprites = null;
        if (param0 != 105) {
          RegistrationAgreementPane.clearStaticReferences((byte) -82);
        }
    }

    public final void onWidgetActivated(int param0, InteractiveWidget param1, int param2, int param3, byte param4) {
        String stackIn_7_2 = null;
        try {
          int var6_int = 36 / ((-27 - param4) / 61);
          if (this.field_z != param1) {
            return;
          }
          CachedArchiveProvider.b(true);
          this.field_y.closeDialog((byte) 119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_6_0 = var6;
          StringBuilder stackIn_6_1 = new StringBuilder().append("rs.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    RegistrationAgreementPane(AccountCreationResultPanel param0) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        try {
          this.field_y = param0;
          this.field_z = new InteractiveWidget(mq.field_i, (WidgetEventListener) null);
          this.field_z.field_e = (WidgetRenderer) ((Object) new qb());
          String var7 = sn.a(cd.field_c, 122, new String[]{this.getAgreementLinkOpeningTag((byte) 127), this.getAgreementLinkClosingTag((byte) 101)});
          int var3 = 20;
          DefaultTextWidgetRenderer var4 = new DefaultTextWidgetRenderer(qo.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, qo.field_b.maxAscent, -1, 2147483647, true);
          this.field_A = new RichTextWidget(var7, var4);
          this.field_A.field_k = "";
          this.field_A.setHotspotTooltip(-57, m.field_g, 0);
          this.field_A.setHotspotTooltip(72, m.field_g, 1);
          this.field_A.field_q = this.field_q - 40;
          this.field_A.field_o = (WidgetEventListener) (this);
          this.field_A.setTextBounds(26, var3, -40 + this.field_q, (byte) 110);
          var3 = var3 + (15 + this.field_A.field_n);
          this.addChild(this.field_A, 1);
          int var5 = 4;
          int var6 = 200;
          this.field_z.setBounds(40, -var6 + 300 >> 1, var3, var6, (byte) 127);
          this.field_z.field_o = (WidgetEventListener) (this);
          this.addChild(this.field_z, 1);
          this.setBounds(var3 + (55 + var5), 0, 0, 300, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw PcmOutputWorker.wrapClientException((Throwable) ((Object) runtimeException), "rs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String getAgreementLinkClosingTag(byte param0) {
        if (param0 <= 87) {
          rendererStrikethroughColor = 19;
          return "</col></u>";
        }
        return "</col></u>";
    }

    private final String getAgreementLinkOpeningTag(byte param0) {
        if (param0 <= 113) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_w = new int[1];
        rendererStrikethroughColor = -1;
        field_x = null;
        field_B = new int[8192];
        field_v = -1;
    }
}
