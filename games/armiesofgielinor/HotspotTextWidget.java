/*
 * Decompiled by CFR-JS 0.4.0.
 */
class HotspotTextWidget extends InteractiveWidget {
    static int[] decodedChatResponsePhraseIds;
    private NodeDeque hotspotRegions;
    private String[] hotspotTooltips;
    static String field_O;
    private TextHotspotRegion hoveredHotspot;
    static rn field_N;

    final void activate(int button, int pointerX, int pointerY, boolean notifyListener) {
        super.activate(button, pointerX, pointerY, notifyListener);
        int relativeX = -this.x + pointerX;
        int relativeY = pointerY - this.y;
        TextHotspotRegion hotspot = this.findHotspot(relativeY, (byte) -61, relativeX);
        if (hotspot != null &&
          null != this.listener) {
          ((TextHotspotListener) ((Object) this.listener)).hotspotActivated(hotspot.hotspotId, button, (byte) 112, this);
        }
    }

    final void rebuildHotspots(int obfuscationGuard) {
        int lineIndex = 0;
        int regionLeft = 0;
        int regionRight = 0;
        int scanIndex;
        TextWidgetPainter textPainter;
        TextLayout layout;
        int openingIndex;
        String idText;
        int openingEnd;
        int firstLine;
        int lastLine;
        Object previousRegion;
        TextLineLayout line;
        int left;
        int right;
        TextHotspotRegion region;
        int obfuscationControl;
        int hotspotId;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.hotspotRegions = new NodeDeque();
        scanIndex = 0;
        textPainter = (TextWidgetPainter) ((Object) this.painter);
        layout = textPainter.getTextLayout(-77, (Widget) (this));
        if (obfuscationGuard > -115) {
          return;
        }
        while (true) {
          openingIndex = this.text.indexOf("<hotspot=", scanIndex);
          if (openingIndex == -1) {
            return;
          }
          openingEnd = this.text.indexOf(">", openingIndex);
          idText = this.text.substring(openingIndex + 9, openingEnd);
          hotspotId = Integer.parseInt(idText);
          scanIndex = this.text.indexOf("</hotspot>", openingIndex);
          firstLine = layout.getLineIndex(0, openingIndex);
          lastLine = layout.getLineIndex(0, scanIndex);
          previousRegion = null;
          for (lineIndex = firstLine; lastLine >= lineIndex; lineIndex++) {
            line = layout.lines[lineIndex];
            if (~firstLine != ~lineIndex) {
              regionLeft = line.caretXs[0];
            } else {
              regionLeft = layout.getCaretX((byte) -66, openingIndex);
            }
            left = regionLeft;
            if (lineIndex != lastLine) {
              if (line == null) {
                regionRight = 0;
              } else {
                regionRight = line.caretXs[-1 + line.caretXs.length];
              }
            } else {
              regionRight = layout.getCaretX((byte) -66, scanIndex);
            }
            right = regionRight;
            region = new TextHotspotRegion(hotspotId, left, line.top, -left + right, Math.max(textPainter.getLineInkHeight(true), line.bottom - line.top));
            if (previousRegion != null) {
              ((TextHotspotRegion) (previousRegion)).nextRegion = region;
            }
            this.hotspotRegions.addLast((byte) -119, (IntrusiveNode) (region));
            previousRegion = region;
          }
        }
    }

    boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        RuntimeException failure = null;
        Widget guardWidget = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String rootDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 11) {
            guardWidget = (Widget) null;
            this.updatePointer(-45, 118, 84, (Widget) null);
          }
          return false;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("hv.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            rootDescription = "null";
          } else {
            rootDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(rootDescription).append(')').toString());
        }
    }

    private final TextHotspotRegion findHotspot(int y, byte obfuscationGuard, int x) {
        TextHotspotRegion segment = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        TextHotspotRegion group = (TextHotspotRegion) (this.hotspotRegions.first((byte) 107));
        while (group != null) {
          segment = group;
          while (segment != null) {
            if (x >= segment.left &&
              (y >= segment.top && segment.left + segment.width > x) &&
              !(segment.height + segment.top < y)) {
              return group;
            }
            segment = segment.nextRegion;
          }
          group = (TextHotspotRegion) (this.hotspotRegions.next((byte) 123));
        }
        if (obfuscationGuard == -61) {
          return null;
        }
        Widget guardWidget = (Widget) null;
        this.updatePointer(-11, -2, 46, (Widget) null);
        return null;
    }

    void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        int relativeX = 0;
        int relativeY = 0;
        try {
          super.updatePointer(obfuscationGuard, originX, originY, rootWidget);
          this.hoveredHotspot = null;
          if (this.hovered) {
            relativeX = -originX + (AiPlanningStrategy.pointerX - this.x);
            relativeY = -originY + ko.pointerY - this.y;
            this.hoveredHotspot = this.findHotspot(relativeY, (byte) -61, relativeX);
          }
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "hv.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    HotspotTextWidget(String text, WidgetPainter painter) {
        super(text, (WidgetListener) null);
        this.hoveredHotspot = null;
        try {
          this.painter = painter;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "hv.<init>(" + (text != null ? "{...}" : "null") + ',' + (painter != null ? "{...}" : "null") + ')');
        }
    }

    final void setBounds(int x, int width, int y, int obfuscationGuard, int height) {
        if (obfuscationGuard != 8192) {
          decodedChatResponsePhraseIds = (int[]) null;
        }
        super.setBounds(x, width, y, obfuscationGuard ^ 0, height);
        this.rebuildHotspots(-128);
    }

    public static void b(boolean param0) {
        field_N = null;
        field_O = null;
        if (!param0) {
          field_N = (rn) null;
        }
        decodedChatResponsePhraseIds = null;
    }

    String getTooltipText(int obfuscationGuard) {
        if (this.hoveredHotspot == null) {
          return null;
        }
        if (null == this.hotspotTooltips) {
          return null;
        }
        if (obfuscationGuard != 21384) {
          return (String) null;
        }
        if (this.hotspotTooltips.length <= this.hoveredHotspot.hotspotId) {
          return null;
        }
        return this.hotspotTooltips[this.hoveredHotspot.hotspotId];
    }

    final void setHotspotTooltip(String text, boolean obfuscationGuard, int hotspotId) {
        int tooltipIndex = 0;
        RuntimeException failure = null;
        String[] tooltipsAlias = null;
        int obfuscationControl = 0;
        String guardText = null;
        String[] expandedTooltips = null;
        String[] expandedTooltipsAlias = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null == this.hotspotTooltips ||
            this.hotspotTooltips.length <= hotspotId) {
            expandedTooltips = new String[hotspotId + 1];
            expandedTooltipsAlias = expandedTooltips;
            tooltipsAlias = expandedTooltipsAlias;
            if (null != this.hotspotTooltips) {
              for (tooltipIndex = 0; tooltipIndex < this.hotspotTooltips.length; tooltipIndex++) {
                expandedTooltips[tooltipIndex] = this.hotspotTooltips[tooltipIndex];
              }
            }
            this.hotspotTooltips = expandedTooltipsAlias;
          }
          if (obfuscationGuard) {
            guardText = (String) null;
            this.setHotspotTooltip((String) null, false, -3);
          }
          this.hotspotTooltips[hotspotId] = text;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("hv.CA(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(',').append(obfuscationGuard).append(',').append(hotspotId).append(')').toString());
        }
    }

    final void setTextBounds(int width, int obfuscationGuard, int x, int y) {
        this.setBounds(x, width, y, 8192, ((TextWidgetPainter) ((Object) this.painter)).getPreferredHeight((Widget) (this), -2));
        if (obfuscationGuard != 9567) {
          this.hotspotRegions = (NodeDeque) null;
        }
    }

    void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int textLeft = 0;
        int textTop = 0;
        super.drawWidget(originX, originY, (byte) -124, renderLayer);
        if (renderLayer != 0) {
          return;
        }
        TextWidgetPainter textPainter = (TextWidgetPainter) ((Object) this.painter);
        if (obfuscationGuard > -82) {
          Widget guardWidget = (Widget) null;
          this.takeFocus(-37, (Widget) null);
        }
        TextHotspotRegion region = this.hoveredHotspot;
        if (region != null) {
          textLeft = textPainter.getTextLeft((Widget) (this), originX, (byte) -123);
          textTop = textPainter.getTextTop(-18033, originY, (Widget) (this));
          do {
            AccountNameSelectionForm.c(2 + region.width, textLeft - (-region.left + 2), 116, 2 + region.height, -2 + (region.top + textTop));
            region = region.nextRegion;
          } while (region != null);
        }
    }

    static {
        field_O = "This unit has no magical ability.";
        field_N = new rn();
    }
}
