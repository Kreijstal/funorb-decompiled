/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener {
    private InteractiveWidget field_N;
    static int field_P;
    private RichTextWidget field_L;
    private AccountCreationResultPanel field_O;
    static ad field_T;
    static boolean field_Q;
    static String field_S;
    static String field_K;
    static int[] field_M;
    static FullscreenFocusCanvas field_R;

    private final String i(int param0) {
        if (param0 <= 109) {
          field_P = -123;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void onWidgetActivated(InteractiveWidget param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 98) {
            field_S = (String) null;
          }
          if (this.field_N != param0) {
            return;
          }
          up.b(-80);
          this.field_O.j((byte) 98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("cm.FA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_28_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DungeonAssault.field_K;
        try {
          if (param2 == null) {
            stackIn_3_0 = hf.field_zb;
            return stackIn_3_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = jm.a((byte) 59, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!jc.a(var4.charAt(0), -128) &&
                !jc.a(var4.charAt(var4.length() - 1), -114)) {
                var5 = 0;
                for (var6 = 0; param2.length() > var6; var6++) {
                  var7 = param2.charAt(var6);
                  if (jc.a((char) var7, 64)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_28_0 = SecondaryNodeDequeIterator.field_c;
                    return stackIn_28_0;
                  }
                }
                if (param1 >= -73) {
                  field_S = (String) null;
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_35_0 = jm.field_e;
                return stackIn_35_0;
              }
              stackIn_18_0 = jm.field_e;
              return stackIn_18_0;
            }
            stackIn_13_0 = hf.field_zb;
            return stackIn_13_0;
          }
          stackIn_8_0 = hf.field_zb;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("cm.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
        field_M = null;
        field_S = null;
        if (param0 > -117) {
          return;
        }
        field_K = null;
        field_R = null;
        field_T = null;
    }

    final static void a(float param0, float param1, int param2, float param3, float param4) {
        if (param2 == -7788) {
          IntrusiveDeque.a(1.0f, param1, 1.0f, param0, param3, 0, param4);
          return;
        }
        field_S = (String) null;
        IntrusiveDeque.a(1.0f, param1, 1.0f, param0, param3, 0, param4);
    }

    private final String a(int param0) {
        if (param0 < 82) {
          field_R = (FullscreenFocusCanvas) null;
          return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    public final void onTextHotspotActivated(int param0, RichTextWidget param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RichTextWidget var7 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          if (param2 != 126) {
            var7 = (RichTextWidget) null;
            this.onTextHotspotActivated(113, (RichTextWidget) null, 9, -25);
          }
          if (param0 == 0) {
            lk.a("terms.ws", (byte) 58);
            return;
          }
          if (param0 == 1) {
            lk.a("privacy.ws", (byte) 58);
            return;
          }
          if (param0 != 2) {
            return;
          }
          lk.a("conduct.ws", (byte) 58);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("cm.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean handleKey(UiWidget param0, char param1, int param2, byte param3) {
        RuntimeException var5 = null;
        InteractiveWidget var6 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, (byte) 61)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.focusPreviousChild(param0, (byte) 71);
            return stackIn_6_0;
          }
          if (99 == param2) {
            stackIn_9_0 = this.focusNextChild((byte) -5, param0);
            return stackIn_9_0;
          }
          if (param3 < 55) {
            var6 = (InteractiveWidget) null;
            this.onWidgetActivated((InteractiveWidget) null, (byte) 8, 78, 7, -119);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("cm.W(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    cm(AccountCreationResultPanel param0) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        String var7 = null;
        int var3 = 0;
        DefaultTextWidgetRenderer var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_O = param0;
          this.field_N = new InteractiveWidget(gl.field_Jb, (WidgetEventListener) null);
          this.field_N.field_o = (WidgetRenderer) ((Object) new na());
          var7 = jk.a(new String[]{this.a(120), this.i(115)}, nj.field_a, 30496);
          var3 = 20;
          var4 = new DefaultTextWidgetRenderer(lp.field_C, 0, 0, 0, 0, 16777215, -1, 3, 0, lp.field_C.field_H, -1, 2147483647, true);
          this.field_L = new RichTextWidget(var7, var4);
          this.field_L.field_i = "";
          this.field_L.a(8, 0, kn.field_d);
          this.field_L.a(8, 1, kn.field_d);
          this.field_L.field_n = (WidgetEventListener) (this);
          this.field_L.field_x = this.field_x - 40;
          this.field_L.a(26, (byte) -71, -40 + this.field_x, var3);
          var3 = var3 + (15 + this.field_L.field_s);
          this.addChild((byte) -119, this.field_L);
          var5 = 4;
          var6 = 200;
          this.field_N.setBounds(0, var6, var3, -var6 + 300 >> 1, 40);
          this.field_N.field_n = (WidgetEventListener) (this);
          this.addChild((byte) -95, this.field_N);
          this.setBounds(0, 300, 0, 0, var5 + 55 + var3);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "cm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = new ad(10, 2, 2, 0);
        field_K = "Raider escapes!";
        field_S = "Hoard";
        field_M = rb.b(12632256, 8421504, 64);
    }
}
