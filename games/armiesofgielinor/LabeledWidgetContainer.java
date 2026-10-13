/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LabeledWidgetContainer extends SingleChildWidgetContainer {
    static NodeDeque field_O;
    private int padding;
    private int labelWidth;
    private String label;
    static String field_Q;
    private int labelColour;
    static boolean field_L;
    static int field_N;
    static String field_M;
    static ClientUiComponent field_R;
    private boolean labelOnRight;
    private BitmapFont font;

    final String getTooltipText(int obfuscationGuard) {
        int previousChildHover = 0;
        String tooltip = null;
        String guardTooltip;
        int guardPreviousChildHover;
        if (obfuscationGuard == 21384) {
          previousChildHover = this.child.hovered ? 1 : 0;
          this.child.hovered = this.hovered;
          tooltip = this.child.getTooltipText(obfuscationGuard + 0);
          this.child.hovered = previousChildHover != 0 ? true : false;
          return tooltip;
        }
        this.labelOnRight = true;
        guardPreviousChildHover = this.child.hovered ? 1 : 0;
        this.child.hovered = this.hovered;
        guardTooltip = this.child.getTooltipText(obfuscationGuard + 0);
        this.child.hovered = guardPreviousChildHover != 0 ? true : false;
        return guardTooltip;
    }

    public static void j(int param0) {
        if (param0 != -12819) {
          return;
        }
        field_O = null;
        field_M = null;
        field_Q = null;
        field_R = null;
    }

    final static void appendSystemChatMessage(String channelLabel, int channelId, int obfuscationGuard, String accountName, String text, int contextId) {
        ChatMessage var6 = null;
        RuntimeException var6_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ChatMessage(channelId, accountName, contextId, channelLabel, text);
          SectorCacheStore.appendChatHistory(obfuscationGuard ^ -19023, var6);
          if (obfuscationGuard == -18119) {
            return;
          }
          field_N = 8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_5_0 = var6_ref;
          stackIn_5_1 = new StringBuilder().append("ta.A(");
          if (channelLabel == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(channelId).append(',').append(obfuscationGuard).append(',');
          if (accountName == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (text == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(contextId).append(')').toString());
        }
    }

    LabeledWidgetContainer(int x, int y, int width, int height, Widget child, boolean labelOnRight, int labelWidth, int padding, BitmapFont font, int labelColour, String label) {
        super(x, y, width, height, (WidgetPainter) null, (WidgetListener) null);
        boolean rightLabel = false;
        int contentX = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int labelTextWidth = 0;
        RuntimeException failure = null;
        int layoutHeight = 0;
        int childX = 0;
        try {
          this.child = child;
          this.padding = padding;
          this.labelColour = labelColour;
          this.labelWidth = labelWidth;
          this.label = label;
          this.font = font;
          rightLabel = (labelOnRight);
          this.labelOnRight = rightLabel;
          labelTextWidth = this.labelWidth - this.padding;
          layoutHeight = this.font.getParagraphHeight(label, labelTextWidth, this.font.maxAscent) + 2 * this.padding;
          if (height >= layoutHeight) {
            layoutHeight = height;
          } else {
            this.setBounds(x, width, y, 8192, layoutHeight);
          }
          if (!this.labelOnRight) {
            contentX = 2 * this.padding + this.labelWidth;
          } else {
            contentX = 0;
          }
          childX = contentX;
          this.child.setBounds(childX, width + (-this.labelWidth - this.padding * 3), (layoutHeight - height >> 1) + this.padding, 8192, height - 2 * this.padding);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          failure = decompiledCaughtException;
          stackIn_14_0 = failure;
          stackIn_14_1 = new StringBuilder().append("ta.<init>(").append(x).append(',').append(y).append(',').append(width).append(',').append(height).append(',');
          if (child == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(labelOnRight).append(',').append(labelWidth).append(',').append(padding).append(',');
          if (font == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(labelColour).append(',');
          if (label == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int widgetX = this.x + originX;
        int widgetY = originY + this.y;
        super.drawWidget(originX, originY, (byte) -90, renderLayer);
        if (renderLayer != 0) {
          return;
        }
        int labelOffsetX = this.labelOnRight ? -(2 * this.padding) + (-this.labelWidth + this.width) : 0;
        this.font.drawParagraph(this.label, this.padding + labelOffsetX + widgetX, this.padding + widgetY, this.labelWidth - this.padding, -(this.padding * 2) + this.height, this.labelColour, -1, !this.labelOnRight ? 2 : 0, 1, this.font.maxAscent);
        if (obfuscationGuard <= -82) {
          return;
        }
        field_Q = (String) null;
    }

    static {
        field_O = new NodeDeque();
        field_Q = "To <%0>: ";
        field_L = false;
        field_M = "Unpacking music";
    }
}
