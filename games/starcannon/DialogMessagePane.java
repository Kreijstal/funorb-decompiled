/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogMessagePane extends DequeWidgetContainer implements WidgetActivationListener {
    private int field_B;
    static Sprite[] field_y;
    private BitmapFont field_F;
    private String field_D;
    private ProgressMessageDialog field_C;
    private InteractiveWidget[] field_A;
    static java.awt.Canvas field_E;
    private int[] field_z;

    final InteractiveWidget addListenerButton(byte param0, WidgetEventListener param1, String param2) {
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
          var4 = new InteractiveWidget(param2, param1);
          var4.field_o = (WidgetRenderer) ((Object) new gb());
          var5 = this.field_f - 2;
          this.setBounds(0, this.field_i, (byte) 124, 34 + this.field_f, 0);
          if (param0 < 87) {
            stackIn_2_0 = (InteractiveWidget) null;
            return stackIn_2_0;
          }
          var4.setBounds(7, this.field_i - 14, (byte) 116, 30, var5);
          this.addChild(true, var4);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("kj.B(").append(param0).append(',');
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
          throw sd.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        field_E = null;
        if (param0 != 0) {
          return;
        }
        field_y = null;
    }

    DialogMessagePane(ProgressMessageDialog param0, BitmapFont param1, String param2) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.field_B = 0;
        try {
          this.field_D = param2;
          this.field_C = param0;
          this.field_F = param1;
          var4_int = null == this.field_D ? 0 : this.field_F.textHeight(this.field_D, 260, this.field_F.field_p);
          this.setBounds(0, 288, (byte) 126, 22 + var4_int, 0);
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "kj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void onWidgetActivated(InteractiveWidget param0, int param1, boolean param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = StarCannon.field_A;
        try {
          for (var6_int = 0; var6_int < this.field_B; var6_int++) {
            if (param0 != this.field_A[var6_int]) {
              continue;
            }
            var7 = this.field_z[var6_int];
            if (var7 != -1) {
              fd.a(this.field_z[var6_int], 0);
            } else {
              this.field_C.closeDialog(-122);
            }
            break;
          }
          if (param2) {
            this.field_F = (BitmapFont) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("kj.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void addActionButton(String param0, int param1, int param2) {
        int var4_int = 0;
        try {
          var4_int = this.field_B;
          this.growActions(1 + var4_int, param1 - 13759);
          if (param1 != 13759) {
            String var5 = (String) null;
            this.addListenerButton((byte) -124, (WidgetEventListener) null, (String) null);
          }
          this.field_A[var4_int] = this.addListenerButton((byte) 120, (WidgetEventListener) (this), param0);
          this.field_z[var4_int] = param2;
        } catch (RuntimeException runtimeException) {
          throw sd.wrapClientException((Throwable) ((Object) runtimeException), "kj.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        super.drawWidget(param0, param1, param2, param3);
        this.field_F.drawParagraph(this.field_D, param1 + this.field_s + 14, this.field_j + (param3 + 10), -28 + this.field_i, this.field_f, 16777215, -1, 0, 0, this.field_F.field_p);
    }

    private final void growActions(int param0, int param1) {
        int var5 = 0;
        if (this.field_B >= param0) {
          return;
        }
        InteractiveWidget[] var6 = new InteractiveWidget[param0];
        InteractiveWidget[] var7 = var6;
        InteractiveWidget[] var3 = var7;
        int[] var4 = new int[param0];
        for (var5 = param1; var5 < this.field_B; var5++) {
          var6[var5] = this.field_A[var5];
          var4[var5] = this.field_z[var5];
        }
        this.field_A = var7;
        this.field_z = var4;
        this.field_B = param0;
    }

    static {
        field_y = new Sprite[4];
    }
}
