/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lg extends FocusableWidget {
    private String[] field_K;
    private NodeDeque field_O;
    private gg field_N;
    static int field_L;
    static String field_M;

    final void i(int param0) {
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int var2;
        WidgetLayoutProvider var3;
        ep var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        ml var12;
        int var13;
        int var14;
        gg var15;
        int var16;
        int var7Lifetime1;
        var16 = BrickABrac.field_J ? 1 : 0;
        this.field_O = new NodeDeque();
        var2 = 0;
        var3 = (WidgetLayoutProvider) ((Object) this.renderer);
        if (param0 != -1) {
          this.a(-10, (byte) -28, 79, -11);
        }
        var4 = var3.c((Widget) (this), -7);
        while (true) {
          var5 = this.text.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.text.indexOf(">", var5);
          var6 = this.text.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.text.indexOf("</hotspot>", var5);
          var8 = var4.a(var5, true);
          var9 = var4.a(var2, true);
          var10 = null;
          for (var11 = var8; var9 >= var11; var11++) {
            var12 = var4.field_c[var11];
            if (~var11 == ~var8) {
              stackIn_10_0 = var4.a(var5, (byte) -53);
            } else {
              stackIn_10_0 = var12.field_g[0];
            }
            var13 = stackIn_10_0;
            if (var9 != var11) {
              if (var12 != null) {
                stackIn_15_0 = var12.field_g[var12.field_g.length - 1];
              } else {
                stackIn_15_0 = 0;
              }
            } else {
              stackIn_15_0 = var4.a(var2, (byte) -79);
            }
            var14 = stackIn_15_0;
            var15 = new gg(var7Lifetime1, var13, var12.field_d, -var13 + var14, Math.max(var3.a((byte) 71), -var12.field_d + var12.field_a));
            if (var10 != null) {
              ((gg) (var10)).field_k = var15;
            }
            this.field_O.addLast(var15, (byte) 3);
            var10 = var15;
          }
        }
    }

    String getTooltip(int obfuscationGuard) {
        if (null == this.field_N) {
          return null;
        }
        if (null == this.field_K) {
          return null;
        }
        if (obfuscationGuard <= 6) {
          this.dispatchAction(-25, -88, 90, 70);
        }
        if (this.field_N.field_u >= this.field_K.length) {
          return null;
        }
        return this.field_K[this.field_N.field_u];
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 46) {
          return;
        }
        this.setBounds(((WidgetLayoutProvider) ((Object) this.renderer)).getPreferredHeight((Widget) (this), 46695), param0, param3, (byte) -119, param2);
    }

    boolean tryFocus(boolean obfuscationGuard, Widget focusRoot) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            return false;
          }
          field_L = 12;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lg.CA(").append(obfuscationGuard).append(',');
          if (focusRoot == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    private final gg b(int param0, int param1, int param2) {
        gg var4;
        gg var5;
        int var6;
        var6 = BrickABrac.field_J ? 1 : 0;
        if (param1 != 0) {
          this.setBounds(3, -6, -76, (byte) 116, -98);
        }
        var4 = (gg) (this.field_O.first(param1 - 75));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_j <= param2 &&
              var5.field_s <= param0 &&
              var5.field_j + var5.field_r > param2 &&
              param0 <= var5.field_s + var5.field_n) {
              return var4;
            }
            var5 = var5.field_k;
          }
          var4 = (gg) (this.field_O.next((byte) 116));
        }
        return null;
    }

    final void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        super.setBounds(height, x, y, obfuscationGuard, width);
        this.i(-1);
    }

    void updatePointer(Widget focusRoot, byte obfuscationGuard, int parentX, int parentY) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updatePointer(focusRoot, obfuscationGuard, parentX, parentY);
          this.field_N = null;
          if (this.mouseOver) {
            var5_int = -parentX + (MusicPatch.pointerX - this.x);
            var6 = -parentY + (po.pointerY - this.y);
            this.field_N = this.b(var6, 0, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("lg.WA(");
          if (focusRoot == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(',').append(parentY).append(')').toString());
        }
    }

    public static void j(int param0) {
        if (param0 != -2) {
          field_M = (String) null;
        }
        field_M = null;
    }

    final static boolean a(int param0) {
        if (param0 != 9) {
          field_L = -88;
        }
        return ik.field_j;
    }

    final static RgbSprite a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        RgbSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            field_L = -26;
          }
          stackIn_3_0 = OptionsScreen.a(2, param0, param1, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final void dispatchAction(int pointerY, int button, int obfuscationGuard, int pointerX) {
        super.dispatchAction(pointerY, button, -106, pointerX);
        if (obfuscationGuard >= -8) {
          String var8 = (String) null;
          lg.a(-127, (String) null, 62);
        }
        int var5 = -this.x + pointerX;
        int var6 = -this.y + pointerY;
        gg var7 = this.b(var6, 0, var5);
        if (var7 != null &&
          this.listener != null) {
          ((ha) ((Object) this.listener)).a(button, -526, var7.field_u, this);
        }
    }

    final static void h(int param0) {
        ob.field_E.clear((byte) -114);
        dl.field_f = param0;
    }

    final void a(String param0, int param1, byte param2) {
        int var5 = 0;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          if (this.field_K == null ||
            this.field_K.length <= param1) {
            var7 = new String[param1 + 1];
            var8 = var7;
            var4 = var8;
            if (null != this.field_K) {
              for (var5 = 0; var5 < this.field_K.length; var5++) {
                var7[var5] = this.field_K[var5];
              }
            }
            this.field_K = var8;
          }
          this.field_K[param1] = param0;
          if (param2 != -98) {
            this.getTooltip(-97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("lg.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        int var7 = 0;
        int var8 = 0;
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        if (layer != 0) {
          return;
        }
        WidgetLayoutProvider var9 = (WidgetLayoutProvider) ((Object) this.renderer);
        gg var6 = this.field_N;
        if (var6 == null) {
        } else {
          var7 = var9.a((Widget) (this), (byte) 77, parentX);
          var8 = var9.a(parentY, (byte) -100, (Widget) (this));
          do {
            ScrollPaneWithFooter.a(-2 + (var8 + var6.field_s), var7 - (-var6.field_j + 2), obfuscationGuard + 132, var6.field_n + 2, 2 + var6.field_r);
            var6 = var6.field_k;
          } while (var6 != null);
        }
    }

    lg(String param0, WidgetRenderer param1) {
        super(param0, (WidgetListener) null);
        this.field_N = null;
        try {
          this.renderer = param1;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = "Show private chat from my friends and opponents";
    }
}
