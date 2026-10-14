/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends FocusableWidget {
    private String[] hotspotTooltips;
    private NodeDeque hotspotRegions;
    private TextHotspotRegion hoveredHotspot;
    static int field_L;
    static String field_M;

    final void rebuildHotspots(int obfuscationGuard) {
        int lineIndex = 0;
        int selectedLeftX = 0;
        int selectedRightX = 0;
        int searchOffset;
        WidgetLayoutProvider layoutProvider;
        WidgetTextLayout layout;
        int openingTagOffset;
        String hotspotIdText;
        int openingTagEnd;
        int firstLineIndex;
        int lastLineIndex;
        Object previousSegment;
        TextLineLayout line;
        int leftX;
        int rightX;
        TextHotspotRegion segment;
        int unusedGameFlag;
        int hotspotId;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        this.hotspotRegions = new NodeDeque();
        searchOffset = 0;
        layoutProvider = (WidgetLayoutProvider) ((Object) this.renderer);
        if (obfuscationGuard != -1) {
          this.a(-10, (byte) -28, 79, -11);
        }
        layout = layoutProvider.getTextLayout((Widget) (this), -7);
        while (true) {
          openingTagOffset = this.text.indexOf("<hotspot=", searchOffset);
          if (openingTagOffset == -1) {
            return;
          }
          openingTagEnd = this.text.indexOf(">", openingTagOffset);
          hotspotIdText = this.text.substring(openingTagOffset + 9, openingTagEnd);
          hotspotId = Integer.parseInt(hotspotIdText);
          searchOffset = this.text.indexOf("</hotspot>", openingTagOffset);
          firstLineIndex = layout.findLineIndex(openingTagOffset, true);
          lastLineIndex = layout.findLineIndex(searchOffset, true);
          previousSegment = null;
          for (lineIndex = firstLineIndex; lastLineIndex >= lineIndex; lineIndex++) {
            line = layout.lines[lineIndex];
            if (~lineIndex == ~firstLineIndex) {
              selectedLeftX = layout.getCaretX(openingTagOffset, (byte) -53);
            } else {
              selectedLeftX = line.caretX[0];
            }
            leftX = selectedLeftX;
            if (lastLineIndex != lineIndex) {
              if (line != null) {
                selectedRightX = line.caretX[line.caretX.length - 1];
              } else {
                selectedRightX = 0;
              }
            } else {
              selectedRightX = layout.getCaretX(searchOffset, (byte) -79);
            }
            rightX = selectedRightX;
            segment = new TextHotspotRegion(hotspotId, leftX, line.top, -leftX + rightX, Math.max(layoutProvider.getLineHeight((byte) 71), -line.top + line.bottom));
            if (previousSegment != null) {
              ((TextHotspotRegion) (previousSegment)).nextSegment = segment;
            }
            this.hotspotRegions.addLast(segment, (byte) 3);
            previousSegment = segment;
          }
        }
    }

    String getTooltip(int obfuscationGuard) {
        if (null == this.hoveredHotspot) {
          return null;
        }
        if (null == this.hotspotTooltips) {
          return null;
        }
        if (obfuscationGuard <= 6) {
          this.dispatchAction(-25, -88, 90, 70);
        }
        if (this.hoveredHotspot.hotspotId >= this.hotspotTooltips.length) {
          return null;
        }
        return this.hotspotTooltips[this.hoveredHotspot.hotspotId];
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

    private final TextHotspotRegion findHotspot(int y, int obfuscationGuard, int x) {
        TextHotspotRegion firstSegment;
        TextHotspotRegion segment;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 0) {
          this.setBounds(3, -6, -76, (byte) 116, -98);
        }
        firstSegment = (TextHotspotRegion) (this.hotspotRegions.first(obfuscationGuard - 75));
        while (firstSegment != null) {
          segment = firstSegment;
          while (segment != null) {
            if (segment.x <= x &&
              segment.y <= y &&
              segment.x + segment.width > x &&
              y <= segment.y + segment.height) {
              return firstSegment;
            }
            segment = segment.nextSegment;
          }
          firstSegment = (TextHotspotRegion) (this.hotspotRegions.next((byte) 116));
        }
        return null;
    }

    final void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        super.setBounds(height, x, y, obfuscationGuard, width);
        this.rebuildHotspots(-1);
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
          this.hoveredHotspot = null;
          if (this.mouseOver) {
            var5_int = -parentX + (MusicPatch.pointerX - this.x);
            var6 = -parentY + (po.pointerY - this.y);
            this.hoveredHotspot = this.findHotspot(var6, 0, var5_int);
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
          HotspotTextWidget.a(-127, (String) null, 62);
        }
        int var5 = -this.x + pointerX;
        int var6 = -this.y + pointerY;
        TextHotspotRegion var7 = this.findHotspot(var6, 0, var5);
        if (var7 != null &&
          this.listener != null) {
          ((TextHotspotListener) ((Object) this.listener)).onHotspotAction(button, -526, var7.hotspotId, this);
        }
    }

    final static void h(int param0) {
        ob.field_E.clear((byte) -114);
        dl.field_f = param0;
    }

    final void setHotspotTooltip(String tooltip, int hotspotId, byte obfuscationGuard) {
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
          if (this.hotspotTooltips == null ||
            this.hotspotTooltips.length <= hotspotId) {
            var7 = new String[hotspotId + 1];
            var8 = var7;
            var4 = var8;
            if (null != this.hotspotTooltips) {
              for (var5 = 0; var5 < this.hotspotTooltips.length; var5++) {
                var7[var5] = this.hotspotTooltips[var5];
              }
            }
            this.hotspotTooltips = var8;
          }
          this.hotspotTooltips[hotspotId] = tooltip;
          if (obfuscationGuard != -98) {
            this.getTooltip(-97);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_15_0 = var4_ref;
          stackIn_15_1 = new StringBuilder().append("lg.E(");
          if (tooltip == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(hotspotId).append(',').append(obfuscationGuard).append(')').toString());
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
        TextHotspotRegion var6 = this.hoveredHotspot;
        if (var6 == null) {
        } else {
          var7 = var9.a((Widget) (this), (byte) 77, parentX);
          var8 = var9.a(parentY, (byte) -100, (Widget) (this));
          do {
            ScrollPaneWithFooter.a(-2 + (var8 + var6.y), var7 - (-var6.x + 2), obfuscationGuard + 132, var6.height + 2, 2 + var6.width);
            var6 = var6.nextSegment;
          } while (var6 != null);
        }
    }

    HotspotTextWidget(String text, WidgetRenderer renderer) {
        super(text, (WidgetListener) null);
        this.hoveredHotspot = null;
        try {
          this.renderer = renderer;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "lg.<init>(" + (text != null ? "{...}" : "null") + ',' + (renderer != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = "Show private chat from my friends and opponents";
    }
}
