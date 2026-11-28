/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jn extends DequeWidgetContainer implements WidgetActivationListener {
    private String field_Q;
    private InteractiveWidget[] field_L;
    private int[] field_H;
    static String field_R;
    static String field_O;
    private int field_P;
    private BitmapFont field_T;
    static PcmSample field_U;
    private dh field_S;

    final InteractiveWidget a(String param0, WidgetEventListener param1, boolean param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_2_0 = null;
        InteractiveWidget stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            stackIn_2_0 = (InteractiveWidget) null;
            return stackIn_2_0;
          }
          var4 = new InteractiveWidget(param0, param1);
          var4.field_n = (WidgetRenderer) ((Object) new je());
          var5 = this.field_z - 2;
          this.setBounds(-114, this.field_F, 0, this.field_z + 34, 0);
          var4.setBounds(-121, -14 + this.field_F, var5, 30, 7);
          this.addChild(var4, 10);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("jn.E(");
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
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseDeclaredStaticReferences(int param0) {
        if (param0 < 94) {
          field_U = (PcmSample) null;
        }
        field_O = null;
        field_U = null;
        field_R = null;
    }

    jn(dh param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.field_P = 0;
        try {
          this.field_Q = param2;
          this.field_S = param0;
          this.field_T = param1;
          var4_int = null != this.field_Q ? this.field_T.textHeight(this.field_Q, 260, this.field_T.field_C) : 0;
          this.setBounds(-125, 288, 0, var4_int + 22, 0);
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "jn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        int var6 = Confined.field_J ? 1 : 0;
        if (param1 <= this.field_P) {
          return;
        }
        InteractiveWidget[] var7 = new InteractiveWidget[param1];
        InteractiveWidget[] var3 = var7;
        int[] var4 = new int[param1];
        int var5 = 0;
        if (param0) {
          return;
        }
        while (var5 < this.field_P) {
          var7[var5] = this.field_L[var5];
          var4[var5] = this.field_H[var5];
          var5++;
        }
        this.field_L = var3;
        this.field_H = var4;
        this.field_P = param1;
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        if (param2 <= 36) {
          String var6 = (String) null;
          this.a(111, (String) null, -98);
        }
        super.drawWidget(param0, param1, (byte) 125, param3);
        this.field_T.drawParagraph(this.field_Q, param3 + this.field_q + 14, 10 + (this.field_m + param0), this.field_F - 28, this.field_z, 16777215, -1, 0, 0, this.field_T.field_C);
    }

    final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        if (param0 != 0) {
          return;
        }
        try {
          var4_int = this.field_P;
          this.a(false, 1 + var4_int);
          this.field_L[var4_int] = this.a(param1, (WidgetEventListener) (this), false);
          this.field_H[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw TextLineMetrics.a((Throwable) ((Object) runtimeException), "jn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = Confined.field_J ? 1 : 0;
        try {
          if (param0 < 68) {
            this.field_H = (int[]) null;
          }
          for (var6_int = 0; this.field_P > var6_int; var6_int++) {
            if (param3 != this.field_L[var6_int]) {
              continue;
            }
            var7 = this.field_H[var6_int];
            if (var7 == -1) {
              this.field_S.n(10);
            } else {
              DefaultTextWidgetRenderer.a((byte) -114, this.field_H[var6_int]);
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("jn.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param0) {
                return;
              }
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(pn.a(var2, (byte) -33, param1), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("jn.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw TextLineMetrics.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_R = "Names can only contain letters, numbers, spaces and underscores";
        field_O = "Distance";
    }
}
