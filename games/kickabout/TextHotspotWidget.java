/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextHotspotWidget extends TextButton {
    static String[] field_K;
    private String[] field_J;
    static Sprite field_L;
    static String field_H;
    static String field_G;
    static String field_N;
    private IntrusiveDeque field_E;
    static volatile int field_M;
    static boolean field_F;
    private TextHotspotRegion field_I;

    private final TextHotspotRegion b(int param0, int param1, int param2) {
        TextHotspotRegion var4;
        TextHotspotRegion var5;
        int var6;
        var6 = Kickabout.field_G;
        var4 = (TextHotspotRegion) (this.field_E.g(24009));
        if (param1 != 2) {
          this.field_I = (TextHotspotRegion) null;
        }
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (param0 >= var5.x &&
              param2 >= var5.y &&
              var5.x + var5.width > param0 &&
              var5.y + var5.height >= param2) {
              return var4;
            }
            var5 = var5.nextLineRegion;
          }
          var4 = (TextHotspotRegion) (this.field_E.c(param1 ^ 35));
        }
        return null;
    }

    final static boolean a(int param0, int param1, int param2) {
        RenderedFootballer var4;
        boolean stackIn_8_0 = false;
        if (param2 != 480) {
          var4 = (RenderedFootballer) null;
          TextHotspotWidget.a((RenderedFootballer) null, 69);
        }
        stackIn_8_0 = (20 + param0 > 0) && (param1 > 0) && (param0 - 20 < 640) && (480 > -40 + param1);
        return stackIn_8_0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -this.field_t + param1;
        int var6 = -this.field_g + param2;
        TextHotspotRegion var7 = this.b(var5, 2, var6);
        if (var7 != null &&
          null != this.field_k) {
          ((TextHotspotListener) ((Object) this.field_k)).onHotspotClicked(this, param0, var7.hotspotId, 40);
        }
    }

    public static void i(int param0) {
        field_L = null;
        field_K = null;
        field_G = null;
        field_N = null;
        field_H = null;
        if (param0 != 9574) {
          field_M = 34;
        }
    }

    final static void a(byte param0, int param1) {
        CipherPacketBuffer var2 = FootballerAiOverlaySupport.field_d;
        if (param0 != -105) {
          TextHotspotWidget.i(83);
        }
        var2.b(param1, (byte) -80);
        var2.writeByte(116, 1);
        var2.writeByte(param0 ^ -32, 2);
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param0 != -1) {
          field_H = (String) null;
        }
        this.setBounds(((WidgetTextLayout) ((Object) this.field_r)).preferredHeight(param0 + 4, (UiWidget) (this)), 1, param2, param1, param3);
    }

    TextHotspotWidget(String param0, WidgetPainter param1) {
        super(param0, (UiListener) null);
        this.field_I = null;
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        if (!AuctionLogEntry.e(15137)) {
          return;
        }
        try {
          if (param0 != -28153) {
            field_L = (Sprite) null;
          }
          FootballerAiOverlaySupport.field_d.b(89, (byte) 77);
          FootballerAiOverlaySupport.field_d.field_n = FootballerAiOverlaySupport.field_d.field_n + 2;
          var2_int = FootballerAiOverlaySupport.field_d.field_n;
          FootballerAiOverlaySupport.field_d.writeString(14190, param1);
          FootballerAiOverlaySupport.field_d.backpatchShortLength(FootballerAiOverlaySupport.field_d.field_n - var2_int, 62);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "lb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String getTooltip(int param0) {
        if (null == this.field_I) {
          return null;
        }
        if (null == this.field_J) {
          return null;
        }
        if (param0 != -1) {
          this.b(112, 119, -84, -8);
        }
        if (this.field_I.hotspotId >= this.field_J.length) {
          return null;
        }
        return this.field_J[this.field_I.hotspotId];
    }

    void updatePointerState(byte param0, UiWidget param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_I = null;
          if (this.field_m) {
            var5_int = -param2 + (BytePlusOneCommand.field_A - this.field_t);
            var6 = ArchiveManager.field_m - (param3 + this.field_g);
            this.field_I = this.b(var5_int, 2, var6);
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "lb.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static WorldDrawEntry a(RenderedFootballer param0, int param1) {
        WorldDrawEntry var2 = null;
        RuntimeException var2_ref = null;
        WorldDrawEntry stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new WorldDrawEntry(param1);
          var2.field_m = param0;
          stackIn_1_0 = var2;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_4_0 = var2_ref;
          stackIn_4_1 = new StringBuilder().append("lb.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(param0, param1 ^ 0, param2, param3, param4);
        this.a((byte) -41);
        if (param1 != 1) {
          field_H = (String) null;
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          if (param2 != 12082) {
            field_H = (String) null;
          }
          if (this.field_J == null ||
            param1 >= this.field_J.length) {
            var7 = new String[1 + param1];
            var8 = var7;
            var4 = var8;
            if (null != this.field_J) {
              for (var5 = 0; var5 < this.field_J.length; var5++) {
                var7[var5] = this.field_J[var5];
              }
            }
            this.field_J = var8;
          }
          this.field_J[param1] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("lb.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    boolean requestKeyboardFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("lb.HA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawLayer(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
          return;
        }
        WidgetTextLayout var5 = (WidgetTextLayout) ((Object) this.field_r);
        TextHotspotRegion var6 = this.field_I;
        if (var6 != null) {
          var7 = var5.textOriginX((UiWidget) (this), param2, -1);
          var8 = var5.textOriginY(true, (UiWidget) (this), param3);
          do {
            RenderedBall.b(param1 - 63, 2 + var6.width, var6.y + (var8 - 2), var6.height + 2, -2 + (var7 + var6.x));
            var6 = var6.nextLineRegion;
          } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var11 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int var2;
        WidgetTextLayout var3;
        TextLayout var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        Object var10;
        TextLayoutLine var12;
        int var13;
        int var14;
        TextHotspotRegion var15;
        int var16;
        int var7Lifetime1;
        var16 = Kickabout.field_G;
        this.field_E = new IntrusiveDeque();
        var2 = 0;
        var3 = (WidgetTextLayout) ((Object) this.field_r);
        var4 = var3.ensureTextLayout(param0 ^ -4996, (UiWidget) (this));
        if (param0 != -41) {
          field_H = (String) null;
        }
        while (true) {
          var5 = this.field_q.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            return;
          }
          var7 = this.field_q.indexOf(">", var5);
          var6 = this.field_q.substring(9 + var5, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.field_q.indexOf("</hotspot>", var5);
          var8 = var4.lineIndexForCharacter(param0 + 41, var5);
          var9 = var4.lineIndexForCharacter(0, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.field_c[var11];
            if (var11 == var8) {
              stackIn_9_0 = var4.characterX(0, var5);
            } else {
              stackIn_9_0 = var12.field_b[0];
            }
            var13 = stackIn_9_0;
            if (var11 == var9) {
              stackIn_14_0 = var4.characterX(param0 + 41, var2);
            } else {
              if (var12 != null) {
                stackIn_14_0 = var12.field_b[-1 + var12.field_b.length];
              } else {
                stackIn_14_0 = 0;
              }
            }
            var14 = stackIn_14_0;
            var15 = new TextHotspotRegion(var7Lifetime1, var13, var12.field_g, -var13 + var14, Math.max(var3.lineHeight((byte) -76), -var12.field_g + var12.field_d));
            if (var10 != null) {
              ((TextHotspotRegion) (var10)).nextLineRegion = var15;
            }
            var10 = var15;
            this.field_E.addLast(var15, param0 + 44);
          }
        }
    }

    static {
        field_K = new String[]{"Auto-Switch: Off", "Auto-Switch: On"};
        field_H = "Tips";
        field_N = "Names cannot contain consecutive spaces";
        field_M = 0;
        field_G = "Use this alternative as your account name";
    }
}
