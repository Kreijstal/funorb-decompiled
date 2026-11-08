/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LinkButtonPainter implements WidgetPainter {
    static int[] field_g;
    static String field_i;
    private BitmapFont field_m;
    static Sprite field_l;
    static IntrusiveDeque field_j;
    static String field_n;
    private int field_e;
    static int field_d;
    static int field_a;
    static int field_f;
    static SceneWidget field_h;
    private int field_k;
    static String field_b;
    static boolean field_c;

    public static void releaseStatics(int param0) {
        field_n = null;
        field_j = null;
        field_i = null;
        field_l = null;
        field_g = null;
        field_h = null;
        if (param0 == -9922) {
          field_b = null;
          return;
        }
        field_b = (String) null;
        field_b = null;
    }

    final static int getFramesPerSecond(int param0) {
        if (param0 != -2) {
          return -77;
        }
        return (int)(1000000000L / fd.field_d);
    }

    final static void a(byte param0) {
        if (ResizableModalPanel.field_Y != null) {
          ResizableModalPanel.field_Y.field_l = true;
          NameSuggestionsPanel.notifyBrowserResizing(1, 0);
          int var1 = 10 / ((-80 - param0) / 44);
          return;
        }
        throw new IllegalStateException("NGR");
    }

    public final void paint(UiComponent param0, int param1, int param2, int param3, boolean param4) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!param0.field_w &&
            !param0.isFocused(-2116)) {
            stackIn_5_0 = 2188450;
          } else {
            stackIn_5_0 = 3249872;
          }
          var6_int = stackIn_5_0;
          this.field_m.drawParagraph("<u=" + Integer.toString(var6_int, 16) + ">" + param0.field_g + "</u>", param2 + param0.field_n, param3 + param0.field_j, param0.field_v, param0.field_k, var6_int, -1, this.field_k, this.field_e, this.field_m.field_C + this.field_m.field_m);
          if (param0.isFocused(-2116)) {
            var7 = this.field_m.textWidth(param0.field_g);
            var8 = this.field_m.field_C + this.field_m.field_m;
            var9 = param0.field_n + param2;
            if (this.field_k == 2) {
              var9 = var9 + (param0.field_v - var7);
            } else {
              if (this.field_k == 1) {
                var9 = var9 + (-var7 + param0.field_v >> 1);
              }
            }
            var10 = param3 + param0.field_j;
            if (2 != this.field_e) {
              if (this.field_e == 1) {
                var10 = var10 + (param0.field_k - var8 >> 1);
              }
            } else {
              var10 = var10 + (-var8 + param0.field_k);
            }
            oj.a(param1 ^ -5581056, var10 + 2, -2 + var9, var8, 4 + var7);
          }
          if (param1 == 5592405) {
            return;
          }
          LinkButtonPainter.getFramesPerSecond(-20);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("gm.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public LinkButtonPainter() {
        this.field_e = 1;
        this.field_k = 1;
        this.field_m = ia.field_c;
    }

    LinkButtonPainter(BitmapFont param0, int param1, int param2) {
        try {
          this.field_m = param0;
          this.field_k = param1;
          this.field_e = param2;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = new int[8192];
        field_n = "<%0> has lost connection.";
        field_i = "Spectate <%0>'s game";
        field_a = 3;
        field_c = true;
        field_b = "Lesson 2 of 7<br><br>Practise using a tactically varied spell in a safe and secure environment.<br><br>Use the Lava Bomb spell to destroy all three targets.<br><br><br>* Using controlled power *<br>* Use of terrain to direct your spells *";
    }
}
