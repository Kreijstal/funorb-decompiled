/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RadialSelectorRenderer implements WidgetRenderer {
    static String field_a;
    static int field_i;
    private int shadowPaint;
    private int circleColor;
    private int labelOffsetY;
    private TextFont font;
    static int[] arcticBackgroundColors;
    static String field_c;
    private int backgroundColor;
    private int markedSectorColor;
    static boolean field_p;
    private int textPaint;
    static boolean field_d;
    static UiComponent field_h;
    private int labelGap;
    static boolean field_f;

    final static SocialListEntry findFriend(boolean obfuscationGuard, String name) {
        String nameKey = null;
        SocialListEntry entry = null;
        String entryNameKey = null;
        int unusedGameFlag = 0;
        CharSequence nameCharacters = null;
        CharSequence entryNameCharacters = null;
        Object invalidNameResult = null;
        SocialListEntry result = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (BlankScreen.friendIndex == null) {
            return null;
          }
          if (name == null) {
            return null;
          }
          if (name.length() == 0) {
            return null;
          }
          nameCharacters = (CharSequence) ((Object) name);
          nameKey = ChatMessage.normalizePlayerName(nameCharacters, 75);
          if (nameKey == null) {
            invalidNameResult = null;
            return (SocialListEntry) (invalidNameResult);
          }
          entry = (SocialListEntry) (BlankScreen.friendIndex.get((long)nameKey.hashCode(), -1));
          if (obfuscationGuard) {
            field_f = false;
          }
          while (entry != null) {
            entryNameCharacters = (CharSequence) ((Object) entry.name);
            entryNameKey = ChatMessage.normalizePlayerName(entryNameCharacters, 117);
            if (entryNameKey.equals(nameKey)) {
              result = entry;
              return result;
            }
            entry = (SocialListEntry) (BlankScreen.friendIndex.nextMatch((byte) 127));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("pf.E(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final void paintWidget(boolean obfuscationGuard, int callbackGuard, int parentX, Widget widget, int parentY) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        RadialSelectorWidget var14 = null;
        Widget stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        double var9Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        try {
          if (widget instanceof RadialSelectorWidget) {
            stackIn_3_0 = (Widget) (widget);
          } else {
            stackIn_3_0 = null;
          }
          var14 = (RadialSelectorWidget) (stackIn_3_0);
          if (var14 != null) {
          }
          Rasterizer2D.fillRectangle(widget.x + parentX, widget.y + parentY, widget.width, widget.height, this.backgroundColor);
          var7 = var14.centerX + parentX + widget.x;
          var8 = var14.centerY + (parentY + widget.y);
          Rasterizer2D.f(var7, var8, var14.radius, this.circleColor);
          if (var14.markedSector != -1) {
            var9 = 3.141592653589793 * (double)var14.markedSector * 2.0 / (double)var14.sectorCount;
            var11 = (int)(-Math.sin(var9) * (double)var14.radius);
            var12 = (int)(Math.cos(var9) * (double)var14.radius);
            Rasterizer2D.f(var7 + var11, var12 + var8, 1, this.markedSectorColor);
          }
          Rasterizer2D.f(var7, var8, 2, 1);
          if (callbackGuard != -20618) {
            return;
          }
          var9Lifetime1 = 2.0 * (3.141592653589793 * (double)var14.selectedSector) / (double)var14.sectorCount;
          var11Lifetime1 = (int)(-Math.sin(var9Lifetime1) * (double)var14.radius);
          var12Lifetime1 = (int)(Math.cos(var9Lifetime1) * (double)var14.radius);
          Rasterizer2D.drawLine(var7, var8, var11Lifetime1 + var7, var8 + var12Lifetime1, 1);
          if (this.font == null) {
            return;
          }
          var13 = var14.centerX + var14.radius + this.labelGap;
          this.font.drawParagraph(widget.text, widget.x + parentX + var13, parentY + (widget.y + this.labelOffsetY), widget.width - (this.labelGap + var13), widget.height - (this.labelGap << 1), this.textPaint, this.shadowPaint, 1, 1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("pf.AA(").append(obfuscationGuard).append(',').append(callbackGuard).append(',').append(parentX).append(',');
          if (widget == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(parentY).append(')').toString());
        }
    }

    final static void a(int param0, String param1) {
        try {
          ParisBackground.field_t = param1;
          int var2_int = 7 / ((-10 - param0) / 51);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 == 0) {
          arcticBackgroundColors = null;
          field_c = null;
          field_h = null;
          return;
        }
        RadialSelectorRenderer.a(false, 38);
        arcticBackgroundColors = null;
        field_c = null;
        field_h = null;
    }

    final static void a(int param0, byte[] param1, ResourceArchive param2, String[] param3, int param4, boolean param5, RgbSprite[][] param6, ResourceArchive param7, int param8, int[] param9, String[] param10, RgbSprite[][] param11, IndexedSprite[] param12, int param13, byte[] param14, String[][] param15, String[] param16, String[][] param17, int[] param18, ResourceArchive param19) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var20 = null;
        try {
          hc.a((byte) 113, param12, param9, param7, param19);
          Mesh3D.a(param7, (byte) 121);
          if (param4 != -27460) {
            field_i = 90;
          }
          CacheEntry.a(param17, param11, 45, param10, param13, param1, param3, param7, param18, param6, param14, param0, param16, param8, param15);
          ed.a(param5, param7, param2, (byte) 104);
          GameClock.b((byte) 13);
          SingleChildWidget.g((byte) -24);
          SoftwareFramebuffer.b((byte) 40);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var20 = decompiledCaughtException;
          stackIn_6_0 = var20;
          stackIn_6_1 = new StringBuilder().append("pf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param10 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param11 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param12 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param15 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param16 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param17 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param18 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',');
          if (param19 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              if (param1) {
                return;
              }
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(hg.a(param0, var2, -1), "_top");
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("pf.F(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, int param1) {
        ResourceArchive var3;
        if (!param0) {
          if (null == hd.pendingScreen &&
            param1 == AccountMessageDialog.currentScreen.screenId) {
            return true;
          }
          if (null == hd.pendingScreen) {
            return false;
          }
          if (hd.pendingScreen.screenId != param1) {
            return false;
          }
          return true;
        }
        var3 = (ResourceArchive) null;
        RadialSelectorRenderer.a(97, (byte[]) null, (ResourceArchive) null, (String[]) null, 18, true, (RgbSprite[][]) null, (ResourceArchive) null, -121, (int[]) null, (String[]) null, (RgbSprite[][]) null, (IndexedSprite[]) null, -69, (byte[]) null, (String[][]) null, (String[]) null, (String[][]) null, (int[]) null, (ResourceArchive) null);
        if (null == hd.pendingScreen &&
          param1 == AccountMessageDialog.currentScreen.screenId) {
          return true;
        }
        if (null == hd.pendingScreen) {
          return false;
        }
        if (hd.pendingScreen.screenId != param1) {
          return false;
        }
        return true;
    }

    RadialSelectorRenderer(TextFont font, int labelGap, int labelOffsetY, int textPaint, int shadowPaint, int circleColor, int markedSectorColor, int backgroundColor) {
        try {
          this.labelGap = labelGap;
          this.backgroundColor = backgroundColor;
          this.markedSectorColor = markedSectorColor;
          this.textPaint = textPaint;
          this.labelOffsetY = labelOffsetY;
          this.font = font;
          this.shadowPaint = shadowPaint;
          this.circleColor = circleColor;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pf.<init>(" + (font != null ? "{...}" : "null") + ',' + labelGap + ',' + labelOffsetY + ',' + textPaint + ',' + shadowPaint + ',' + circleColor + ',' + markedSectorColor + ',' + backgroundColor + ')');
        }
    }

    static {
        field_a = "There are no valid types of game that match your preferences.";
        arcticBackgroundColors = new int[]{25776, 12658477, 16494651, 26679, 16711935};
        field_c = "Rating";
        field_f = false;
    }
}
