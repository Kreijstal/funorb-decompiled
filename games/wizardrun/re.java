/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends WidgetContainer implements HotspotClickListener, ButtonActionListener {
    private TextButton field_H;
    private kk field_F;
    private HotspotTextWidget field_J;
    static GzipDecompressor field_I;
    static PacketBuffer field_G;
    static String field_E;

    private final String a(int param0) {
        if (param0 != 0) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_H == param1) {
            ConfirmedEmailValidator.f(92682);
            this.field_F.l(param0 - 8792);
          }
          if (param0 == -18905) {
            return;
          }
          field_G = (PacketBuffer) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("re.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final String h(byte param0) {
        if (param0 > -5) {
          return (String) null;
        }
        return "</col></u>";
    }

    final boolean handleKeyPress(char param0, int param1, byte param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -96) {
            return true;
          }
          if (super.handleKeyPress(param0, param1, (byte) -104, param3)) {
            return true;
          }
          if (98 == param1) {
            stackIn_10_0 = this.a((byte) -117, param3);
            return stackIn_10_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_14_0 = this.b(param3, 1);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("re.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    re(kk param0) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        String var7 = null;
        int var3 = 0;
        WidgetPainter var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_F = param0;
          this.field_H = new TextButton(e.field_e, (WidgetListener) null);
          this.field_H.renderer = (WidgetRenderer) ((Object) new jl());
          var7 = WeightedLruCache.a(new String[]{this.a(0), this.h((byte) -85)}, (byte) 79, t.field_b);
          var3 = 20;
          var4 = new WidgetPainter(Crc32Helpers.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, Crc32Helpers.field_b.field_M, -1, 2147483647, true);
          this.field_J = new HotspotTextWidget(var7, var4);
          this.field_J.tooltip = "";
          this.field_J.a(1, AccountCreationForm.field_R, 0);
          this.field_J.a(1, AccountCreationForm.field_R, 1);
          this.field_J.listener = (WidgetListener) (this);
          this.field_J.width = -40 + this.width;
          this.field_J.a(var3, (byte) 61, this.width - 40, 26);
          var3 = var3 + (this.field_J.height + 15);
          this.a((UiWidget) (this.field_J), (byte) 83);
          var5 = 4;
          var6 = 200;
          this.field_H.setBounds(127, var3, 40, var6, 300 - var6 >> 1);
          this.field_H.listener = (WidgetListener) (this);
          this.a((UiWidget) (this.field_H), (byte) 126);
          this.setBounds(127, 0, var5 + var3 + 55, 300, 0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_E = null;
        field_G = null;
        field_I = null;
        if (param0 != -55) {
          String var2 = (String) null;
          re.a((ResourceArchive) null, (String) null, (String) null, -82);
        }
    }

    final static IndexedSprite[] a(ResourceArchive param0, String param1, String param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        IndexedSprite[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = -86 / ((18 - param3) / 59);
          var4_int = param0.getGroupId(-1, param1);
          var5 = param0.getFileId(var4_int, param2, -11986);
          stackIn_1_0 = ArchiveRequest.a(param0, var5, -26955, var4_int);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("re.GA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onHotspotAction(int param0, HotspotTextWidget param1, int param2, int param3) {
        int var6 = wizardrun.field_H;
        try {
          if (param0 == 0) {
            BrowserCookieHelpers.a("terms.ws", 12);
          } else {
            if (1 == param0) {
              BrowserCookieHelpers.a("privacy.ws", 12);
            } else {
              if (param0 == 2) {
                BrowserCookieHelpers.a("conduct.ws", 12);
              }
            }
          }
          int var5_int = -13 / ((36 - param3) / 53);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "re.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_I = new GzipDecompressor();
        field_G = new PacketBuffer(256);
        field_E = "Player Name: ";
    }
}
