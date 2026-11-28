/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogMessagePane extends DequeWidgetContainer implements WidgetActivationListener {
    static java.awt.Canvas field_D;
    private String field_M;
    static RgbSprite field_A;
    private int field_F;
    private InteractiveWidget[] field_L;
    static int field_I;
    private ProgressMessageDialog field_B;
    private int[] field_E;
    static boolean field_H;
    static String field_J;
    static boolean field_z;
    static int[] field_K;
    static String field_G;
    private BitmapFont field_C;

    public static void e(byte param0) {
        if (param0 >= 20) {
          field_G = null;
          field_A = null;
          field_J = null;
          field_K = null;
          field_D = null;
          return;
        }
        DialogMessagePane.pollAccountCreationResult((byte) 41);
        field_G = null;
        field_A = null;
        field_J = null;
        field_K = null;
        field_D = null;
    }

    final static AccountServiceResult pollAccountCreationResult(byte param0) {
        if (lc.field_c == SocketConnector.field_e) {
          throw new IllegalStateException();
        }
        if (param0 != 93) {
          DialogMessagePane.e((byte) -51);
          if (lc.field_c == ValidationStatusWidget.field_P) {
            lc.field_c = SocketConnector.field_e;
            return qc.field_i;
          }
          return null;
        }
        if (lc.field_c == ValidationStatusWidget.field_P) {
          lc.field_c = SocketConnector.field_e;
          return qc.field_i;
        }
        return null;
    }

    public final void onWidgetActivated(byte param0, int param1, int param2, int param3, InteractiveWidget param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var9 = CrazyCrystals.field_B;
        try {
          var6_int = -104 % ((83 - param0) / 36);
          var7 = 0;
          while (true) {
            if (this.field_F <= var7) {
              return;
            }
            if (this.field_L[var7] != param4) {
              var7++;
              continue;
            }
            break;
          }
          var8 = this.field_E[var7];
          if (var8 == -1) {
            this.field_B.closeDialog((byte) -62);
            return;
          }
          rc.a(-25537, this.field_E[var7]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("jd.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    DialogMessagePane(ProgressMessageDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.field_F = 0;
        try {
          this.field_B = param0;
          this.field_C = param1;
          this.field_M = param2;
          var4_int = null == this.field_M ? 0 : this.field_C.textHeight(this.field_M, 260, this.field_C.field_o);
          this.setBounds(22 + var4_int, 0, 0, 288, (byte) -52);
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "jd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final InteractiveWidget addListenerButton(String param0, WidgetEventListener param1, int param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        InteractiveWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(param0, param1);
          var4.field_i = (WidgetRenderer) ((Object) new ve());
          var5 = -2 + this.field_f;
          this.setBounds(34 + this.field_f, 0, 0, this.field_g, (byte) -52);
          var4.setBounds(30, 7, var5, this.field_g - 14, (byte) -52);
          this.addChild(var4, 35);
          if (param2 < 4) {
            var6 = (String) null;
            this.addActionButton((String) null, (byte) 44, 127);
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("jd.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final void drawWidget(int param0, byte param1, int param2, int param3) {
        super.drawWidget(param0, (byte) -92, param2, param3);
        this.field_C.drawParagraph(this.field_M, 14 + (this.field_r + param2), 10 + (param0 + this.field_j), -28 + this.field_g, this.field_f, 16777215, -1, 0, 0, this.field_C.field_o);
        if (param1 > -12) {
          String var6 = (String) null;
          this.addActionButton((String) null, (byte) 125, 44);
        }
    }

    private final void growActions(int param0, int param1) {
        int var5 = 0;
        int var6 = CrazyCrystals.field_B;
        if (param1 <= this.field_F) {
          return;
        }
        InteractiveWidget[] var7 = new InteractiveWidget[param1];
        InteractiveWidget[] var3 = var7;
        int[] var4 = new int[param1];
        for (var5 = 0; this.field_F > var5; var5++) {
          var7[var5] = this.field_L[var5];
          var4[var5] = this.field_E[var5];
        }
        if (param0 < 92) {
          this.field_E = (int[]) null;
        } else {
          this.field_F = param1;
          this.field_L = var3;
          this.field_E = var4;
          return;
        }
        this.field_F = param1;
        this.field_L = var3;
        this.field_E = var4;
    }

    final void addActionButton(String param0, byte param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_F;
          if (param1 != -124) {
            field_D = (java.awt.Canvas) null;
          }
          this.growActions(119, var4_int + 1);
          this.field_L[var4_int] = this.addListenerButton(param0, (WidgetEventListener) (this), param1 + 167);
          this.field_E[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw dn.wrapClientException((Throwable) ((Object) runtimeException), "jd.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_H = false;
        field_J = "Restart Level";
    }
}
