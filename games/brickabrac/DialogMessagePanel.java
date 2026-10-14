/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialogMessagePanel extends WidgetGroup implements WidgetActionListener {
    static int field_J;
    static String field_L;
    private int[] actionIds;
    private FocusableWidget[] buttons;
    private int buttonCount;
    static boolean field_O;
    static PlatformServices field_P;
    static int[] rankingRatings;
    private String message;
    static String field_S;
    private TextFont font;
    private AccountMessageDialog dialog;
    static BackgroundScene field_Q;

    final void addAction(boolean obfuscationGuard, String caption, int actionId) {
        int buttonIndex = 0;
        try {
          if (obfuscationGuard) {
            FocusableWidget var5 = (FocusableWidget) null;
            this.onAction(117, -42, (byte) 27, -108, (FocusableWidget) null);
          }
          buttonIndex = this.buttonCount;
          this.ensureButtonCapacity((byte) -106, 1 + buttonIndex);
          this.buttons[buttonIndex] = this.appendButton((byte) 126, caption, (WidgetListener) (this));
          this.actionIds[buttonIndex] = actionId;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ec.E(" + obfuscationGuard + ',' + (caption != null ? "{...}" : "null") + ',' + actionId + ')');
        }
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          for (var6_int = 0; var6_int < this.buttonCount; var6_int++) {
            if (widget != this.buttons[var6_int]) {
              continue;
            }
            var7 = this.actionIds[var6_int];
            if (var7 != -1) {
              CheckboxWidgetRenderer.a(this.actionIds[var6_int], true);
            } else {
              this.dialog.closeDialog(17);
            }
            break;
          }
          if (obfuscationGuard > -22) {
            field_O = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ec.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void h(int param0) {
        IntKeyIndex.a(-1);
        NanoGameClock.field_l = true;
        InteractiveGameClient.field_E = true;
        ResourceArchive.field_f.hideLayers(-126);
        if (param0 != 6846) {
          DialogMessagePanel.a(-62);
        }
        MusicPatch.a(0, GameScreen.field_b, false);
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        this.font.a(this.message, 14 + (parentX + this.x), 10 + (parentY + this.y), this.width - 28, this.height, 16777215, -1, 0, 0, this.font.ascent);
    }

    final FocusableWidget appendButton(byte obfuscationGuard, String caption, WidgetListener listener) {
        int var4_int = 0;
        RuntimeException var4 = null;
        FocusableWidget var5 = null;
        int var6 = 0;
        FocusableWidget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = -104 / ((obfuscationGuard - 89) / 37);
          var5 = new FocusableWidget(caption, listener);
          var5.renderer = (WidgetRenderer) ((Object) new ButtonWidgetRenderer());
          var6 = this.height - 2;
          this.setBounds(34 + this.height, 0, 0, (byte) -119, this.width);
          var5.setBounds(30, 7, var6, (byte) -119, -14 + this.width);
          this.addChild(var5, true);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ec.A(").append(obfuscationGuard).append(',');
          if (caption == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (listener == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final void ensureButtonCapacity(byte obfuscationGuard, int count) {
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        if (count <= this.buttonCount) {
          return;
        }
        FocusableWidget[] var7 = new FocusableWidget[count];
        FocusableWidget[] var3 = var7;
        int[] var4 = new int[count];
        for (var5 = 0; var5 < this.buttonCount; var5++) {
          var7[var5] = this.buttons[var5];
          var4[var5] = this.actionIds[var5];
        }
        this.actionIds = var4;
        if (obfuscationGuard > -54) {
          return;
        }
        this.buttons = var3;
        this.buttonCount = count;
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RgbSprite var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int[] var32 = null;
        int[] var33 = null;
        int var15Lifetime1;
        int var16Lifetime1;
        var31 = BrickABrac.field_J ? 1 : 0;
        try {
          var8_int = param2 + (-param1 - param7);
          var9 = -param7 + param4 - param1;
          var10 = param1 + (param2 + param7);
          if (Rasterizer2D.clipRight < var10) {
            var10 = Rasterizer2D.clipRight;
          }
          if (Rasterizer2D.clipLeft > var8_int) {
            var8_int = Rasterizer2D.clipLeft;
          }
          var11 = param4 + param1 + param7;
          if (var9 < Rasterizer2D.clipTop) {
            var9 = Rasterizer2D.clipTop;
          }
          if (var11 > Rasterizer2D.clipBottom) {
            var11 = Rasterizer2D.clipBottom;
          }
          var33 = new int[32];
          var32 = var33;
          var12 = var32;
          var13 = 16711935 & param0;
          var14 = 65280 & param0;
          for (var15 = 0; var15 < 16; var15++) {
            var16 = param6 * var15 >> 4;
            var12[var15] = LevelSelectScreen.d(IntrusiveHashIterator.a(var16 * var14, 16711680), IntrusiveHashIterator.a(var13 * var16, -16711936)) >>> 8;
            var12[-var15 + 31] = LevelSelectScreen.d(IntrusiveHashIterator.a(var16 * var13, -16711936), IntrusiveHashIterator.a(16711680, var16 * var14)) >>> 8;
          }
          var15Lifetime1 = var10 - var8_int;
          var16Lifetime1 = -var9 + var11;
          if (param3 != 99) {
            field_O = false;
          }
          if (var15Lifetime1 > 0 &&
            var16Lifetime1 > 0) {
            var17 = new RgbSprite(var15Lifetime1, var16Lifetime1);
            var18 = param1 * param1;
            var19 = (param7 + param1) * (param7 + param1);
            var20 = 0;
            var21 = -param4 + var9;
            var22 = 0;
            while (var22 < var16Lifetime1) {
              var23 = -param2 + var8_int;
              var24 = var23 * var23 + var21 * var21;
              var25 = 0;
              while (var25 < var15Lifetime1) {
                var26 = var22 + var9;
                var27 = var25 + var8_int;
                if (var24 != 0) {
                  if (var24 < var18) {
                    var28 = ap.a(var24 << 12, -55);
                    var29 = (param1 << 6) - var28;
                    var30 = var28 - ((-BrickABrac.cosine8192(2048, (var29 << 7) / param1) + 65536) * param5 >> 11);
                    var26 = var21 * var30 / var28 + param4;
                    var27 = var30 * var23 / var28 + param2;
                    if (Rasterizer2D.clipLeft > var27) {
                      var27 = Rasterizer2D.clipLeft;
                    }
                    if (Rasterizer2D.clipTop > var26) {
                      var26 = Rasterizer2D.clipTop;
                    }
                    if (var27 >= Rasterizer2D.clipRight) {
                      var27 = Rasterizer2D.clipRight;
                    }
                    if (var26 >= Rasterizer2D.clipBottom) {
                      var26 = Rasterizer2D.clipBottom;
                    }
                  } else {
                    if (var19 <= var24) {
                      var17.pixels[var20] = Rasterizer2D.pixels[Rasterizer2D.width * var26 + var27];
                      var20++;
                      var23++;
                      var25++;
                      var24 = var24 + (-1 + var23 * 2);
                      continue;
                    }
                    var28 = ap.a(var24 << 12, -100);
                    var29 = -(param1 << 6) + var28;
                    var30 = var28 - (param5 * (-BrickABrac.cosine8192(2048, (var29 << 7) / param7) + 65536) >> 11);
                    var27 = param2 + var23 * var30 / var28;
                    var26 = var30 * var21 / var28 + param4;
                    if (Rasterizer2D.clipLeft > var27) {
                      var27 = Rasterizer2D.clipLeft;
                    }
                    if (Rasterizer2D.clipTop > var26) {
                      var26 = Rasterizer2D.clipTop;
                    }
                    if (Rasterizer2D.clipBottom <= var26) {
                      var26 = Rasterizer2D.clipBottom;
                    }
                    if (var27 >= Rasterizer2D.clipRight) {
                      var27 = Rasterizer2D.clipRight;
                    }
                  }
                }
                var17.pixels[var20] = Rasterizer2D.pixels[Rasterizer2D.width * var26 + var27];
                var20++;
                var23++;
                var25++;
                var24 = var24 + (-1 + var23 * 2);
              }
              var22++;
              var21++;
            }
            var17.drawAt(var8_int, var9);
            Rasterizer2D.b(param2 << 4, param4 << 4, param7 + param1 << 4, 255, var33);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var8), "ec.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    DialogMessagePanel(AccountMessageDialog dialog, TextFont font, String message) {
        super(0, 0, 288, 0, (WidgetRenderer) null);
        int var4_int = 0;
        this.buttonCount = 0;
        try {
          this.dialog = dialog;
          this.message = message;
          this.font = font;
          var4_int = this.message == null ? 0 : this.font.measureWrappedHeight(this.message, 260, this.font.ascent);
          this.setBounds(22 + var4_int, 0, 0, (byte) -119, 288);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ec.<init>(" + (dialog != null ? "{...}" : "null") + ',' + (font != null ? "{...}" : "null") + ',' + (message != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_Q = null;
        if (param0 != 0) {
          field_Q = (BackgroundScene) null;
        }
        rankingRatings = null;
        field_L = null;
        field_S = null;
        field_P = null;
    }

    static {
        field_L = "Reload game";
        field_J = 15;
        field_S = "Offline";
    }
}
