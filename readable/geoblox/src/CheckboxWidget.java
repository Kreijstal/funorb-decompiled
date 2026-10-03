/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxWidget extends ButtonWidget {
    static String loginJustPlayTooltipText;
    static long field_H;
    static String createNewsOptInTooltipText;
    static int field_E;

    public static void f(int param0) {
        if (param0 >= -65) {
            PlatformTaskDispatcher var2 = (PlatformTaskDispatcher) null;
            CheckboxWidget.a(98, (PlatformTaskDispatcher) null);
        }
        loginJustPlayTooltipText = null;
        createNewsOptInTooltipText = null;
    }

    private CheckboxWidget(String param0, WidgetListener param1) {
        this(param0, DialRenderer.field_j.field_j, param1);
        try {
            this.renderer = DialRenderer.field_j.field_c;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void activateButton(int buttonY, int methodGuard, int buttonX, int pointerButton) {
        this.active = !this.active ? true : false;
        super.activateButton(buttonY, methodGuard, buttonX, pointerButton);
    }

    private CheckboxWidget(String param0, WidgetRenderer param1, WidgetListener param2) {
        super(param0, param1, param2);
        try {
            this.renderer = DialRenderer.field_j.field_c;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static rj[] a(int param0, PlatformTaskDispatcher param1) {
        int var5 = 0;
        rj[] stackIn_3_0 = null;
        rj[] stackIn_9_0 = null;
        rj[] stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        rj[] var4 = null;
        rj var6 = null;
        int var7 = 0;
        PlatformTask var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          if (!param1.hasFullscreenSupport(-26098)) {
            stackIn_3_0 = new rj[]{};
            return stackIn_3_0;
          }
          var8 = param1.requestDisplayModes(34);
          while (var8.status == 0) {
            bc.sleepMillis(0, 10L);
          }
          if (var8.status == 2) {
            stackIn_9_0 = new rj[]{};
            return stackIn_9_0;
          }
          var10 = (int[]) (var8.result);
          var9 = var10;
          var3 = var9;
          var4 = new rj[var10.length >> 2];
          if (param0 <= 61) {
            field_H = 120L;
          }
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new rj();
            var4[var5] = var6;
            var6.field_d = var3[var5 << 2];
            var6.field_f = var3[1 + (var5 << 2)];
            var6.field_h = var3[2 + (var5 << 2)];
            var6.field_a = var3[(var5 << 2) + 3];
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_19_0 = var2;
          stackIn_19_1 = new StringBuilder().append("vi.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    CheckboxWidget(String param0, WidgetListener param1, boolean param2) {
        this(param0, param1);
        try {
            this.active = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        loginJustPlayTooltipText = "Play the game without logging in just yet";
        createNewsOptInTooltipText = "Updates will sent to the email address you've given";
        field_E = 12;
    }
}
