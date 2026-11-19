/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends TextButton {
    private String[] field_I;
    static GameKeyHandler keyHandler;
    private IntrusiveDeque field_G;
    private TextHotspotRange field_F;
    static int field_J;

    final void fireButtonAction(int param0, int param1, int param2, int param3) {
        super.fireButtonAction(-120, param1, param2, param3);
        int var5 = param1 - this.x;
        int var6 = -this.y + param2;
        if (param0 > -45) {
          this.setBoundsToPreferredHeight(-20, (byte) -111, 69, -112);
        }
        TextHotspotRange var7 = this.findHotspot((byte) -117, var6, var5);
        if (var7 != null &&
          null != this.listener) {
          ((HotspotClickListener) ((Object) this.listener)).onHotspotAction(var7.field_k, this, param3, 111);
        }
    }

    HotspotTextWidget(String param0, WidgetRenderer param1) {
        super(param0, (WidgetListener) null);
        this.field_F = null;
        try {
          this.renderer = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 65 % ((param0 - 84) / 40);
        keyHandler = null;
    }

    String getTooltip(boolean param0) {
        if (this.field_F == null) {
          return null;
        }
        if (null == this.field_I) {
          return null;
        }
        if (param0) {
          return (String) null;
        }
        if (this.field_F.field_k >= this.field_I.length) {
          return null;
        }
        return this.field_I[this.field_F.field_k];
    }

    final static ProgressQuery requestProgress(int param0, int param1, int param2, int param3) {
        ProgressQuery var4 = new ProgressQuery();
        var4.values = new int[param1];
        var4.category = param3;
        LevelData.field_c.addLast(var4, false);
        MusicPatchLoader.writeProgressQuery(param0, var4, param2 ^ param2);
        return var4;
    }

    void updateInput(int param0, int param1, int param2, UiWidget param3) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          super.updateInput(param0 ^ 0, param1, param2, param3);
          if (param0 != 10000536) {
            this.field_G = (IntrusiveDeque) null;
          }
          this.field_F = null;
          if (this.hovered) {
            var5_int = AchievementSubmission.field_n - param2 - this.x;
            var6 = -this.y + (NetworkArchiveRequest.field_B - param1);
            this.field_F = this.findHotspot((byte) -120, var6, var5_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ff.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void setBoundsToPreferredHeight(int param0, byte param1, int param2, int param3) {
        this.setBounds(127, param0, ((TextWidgetRenderer) ((Object) this.renderer)).getPreferredHeight((byte) 89, (UiWidget) (this)), param2, param3);
        if (param1 != 61) {
          keyHandler = (GameKeyHandler) null;
        }
    }

    void drawLayer(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.drawLayer(param0, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        TextWidgetRenderer var5 = (TextWidgetRenderer) ((Object) this.renderer);
        TextHotspotRange var6 = this.field_F;
        if (var6 != null) {
          var7 = var5.getTextOriginX((UiWidget) (this), param1 + 0, param0);
          var8 = var5.getTextOriginY(true, param3, (UiWidget) (this));
          do {
            AlternateUsernameLoginCredentials.drawDottedFocusRect((byte) 69, 2 + var6.field_o, var6.field_j + (var8 - 2), 2 + var6.field_n, var7 + (var6.field_i - 2));
            var6 = var6.field_l;
          } while (var6 != null);
        }
    }

    final static HighscoreRequest requestHighscores(int param0, int param1, byte param2, int param3, int param4) {
        HighscoreRequest var5;
        int var6;
        HighscoreRequest var5Lifetime1;
        var6 = wizardrun.field_H;
        var5 = (HighscoreRequest) (Js5Index.field_l.first((byte) 93));
        while (var5 != null) {
          if (param1 == var5.field_l) {
            return var5;
          }
          var5 = (HighscoreRequest) (Js5Index.field_l.next(8192));
        }
        var5Lifetime1 = new HighscoreRequest();
        var5Lifetime1.field_j = param0;
        var5Lifetime1.field_l = param1;
        var5Lifetime1.field_o = param4;
        Js5Index.field_l.addLast(var5Lifetime1, false);
        BoundedRandomAccessFile.writeHighscoreRequest(var5Lifetime1, param3, (byte) 121);
        if (param2 != 59) {
          HotspotTextWidget.requestHighscores(88, 105, (byte) -48, -68, 37);
        }
        return var5Lifetime1;
    }

    final void rebuildHotspotBounds(int param0) {
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        TextWidgetRenderer var3;
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
        TextHotspotRange var15;
        int var16;
        int var7Lifetime1;
        var16 = wizardrun.field_H;
        this.field_G = new IntrusiveDeque();
        var2 = param0;
        var3 = (TextWidgetRenderer) ((Object) this.renderer);
        var4 = var3.getTextLayout((UiWidget) (this), (byte) 116);
        while (true) {
          var5 = this.text.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          }
          var7 = this.text.indexOf(">", var5);
          var6 = this.text.substring(var5 + 9, var7);
          var7Lifetime1 = Integer.parseInt(var6);
          var2 = this.text.indexOf("</hotspot>", var5);
          var8 = var4.getLineIndex((byte) 110, var5);
          var9 = var4.getLineIndex((byte) 89, var2);
          var10 = null;
          for (var11 = var8; var11 <= var9; var11++) {
            var12 = var4.lines[var11];
            if (var11 == var8) {
              stackIn_7_0 = var4.getCharacterX(62, var5);
            } else {
              stackIn_7_0 = var12.characterPositions[0];
            }
            var13 = stackIn_7_0;
            if (var11 == var9) {
              stackIn_12_0 = var4.getCharacterX(62, var2);
            } else {
              if (var12 != null) {
                stackIn_12_0 = var12.characterPositions[-1 + var12.characterPositions.length];
              } else {
                stackIn_12_0 = 0;
              }
            }
            var14 = stackIn_12_0;
            var15 = new TextHotspotRange(var7Lifetime1, var13, var12.top, var14 - var13, Math.max(var3.getLineHeight((byte) -104), -var12.top + var12.bottom));
            if (var10 != null) {
              ((TextHotspotRange) (var10)).field_l = var15;
            }
            var10 = var15;
            this.field_G.addLast(var15, false);
          }
        }
    }

    final void setHotspotTooltip(int param0, String param1, int param2) {
        String[] var7 = null;
        String[] var8 = null;
        int var5 = 0;
        int var6 = wizardrun.field_H;
        try {
          if (param0 != 1) {
            this.field_F = (TextHotspotRange) null;
          }
          if (null == this.field_I ||
            param2 >= this.field_I.length) {
            var7 = new String[1 + param2];
            var8 = var7;
            String[] var4 = var8;
            if (this.field_I != null) {
              for (var5 = 0; this.field_I.length > var5; var5++) {
                var7[var5] = this.field_I[var5];
              }
            }
            this.field_I = var8;
          }
          this.field_I[param2] = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "ff.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    boolean requestFocus(UiWidget param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 8) {
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ff.J(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void setBounds(int param0, int param1, int param2, int param3, int param4) {
        super.setBounds(126, param1, param2, param3, param4);
        if (param0 < 108) {
          return;
        }
        this.rebuildHotspotBounds(0);
    }

    private final TextHotspotRange findHotspot(byte param0, int param1, int param2) {
        TextHotspotRange var4;
        TextHotspotRange var5;
        int var6;
        var6 = wizardrun.field_H;
        if (param0 > -91) {
          return (TextHotspotRange) null;
        }
        var4 = (TextHotspotRange) (this.field_G.first((byte) 80));
        while (var4 != null) {
          var5 = var4;
          while (var5 != null) {
            if (var5.field_i <= param2 &&
              param1 >= var5.field_j &&
              var5.field_i + var5.field_o > param2 &&
              param1 <= var5.field_j + var5.field_n) {
              return var4;
            }
            var5 = var5.field_l;
          }
          var4 = (TextHotspotRange) (this.field_G.next(8192));
        }
        return null;
    }

    static {
        keyHandler = new GameKeyHandler();
    }
}
