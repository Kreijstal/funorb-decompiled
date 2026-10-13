/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class CheckBoxWidgetPainter implements WidgetPainter {
    private BitmapFont font;
    private int verticalAlignment;
    private int backgroundColour;
    private int boxOffsetX;
    private int boxWidth;
    private int textOffsetY;
    private int boxHeight;
    private int horizontalAlignment;
    private int textPadding;
    private int textColour;
    private int boxOffsetY;
    static boolean[] acceptedPacketOpcodes;
    private int textShadow;

    final static ResourceArchive a(int param0, boolean param1, int param2, boolean param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveProvider var8 = null;
          ResourceArchive stackIn_2_0 = null;
          ResourceArchive stackIn_17_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 != 1) {
              stackIn_2_0 = (ResourceArchive) null;
              return stackIn_2_0;
            }
            var6 = null;
            if (null != vq.field_c.cacheDataFile) {
              SpellMenuGroup.field_b = new BufferedFile(vq.field_c.cacheDataFile, 5200, 0);
              vq.field_c.cacheDataFile = null;
              var6 = new SectorCacheStore(255, SpellMenuGroup.field_b, new BufferedFile(vq.field_c.masterIndexFile, 12000, 0), 2097152);
            }
            var7 = null;
            if (null != SpellMenuGroup.field_b) {
              if (mu.field_b == null) {
                mu.field_b = new BufferedFile[vq.field_c.cacheIndexFiles.length];
              }
              if (mu.field_b[param0] == null) {
                mu.field_b[param0] = new BufferedFile(vq.field_c.cacheIndexFiles[param0], 12000, 0);
                vq.field_c.cacheIndexFiles[param0] = null;
              }
              var7 = new SectorCacheStore(param0, SpellMenuGroup.field_b, mu.field_b[param0], 2097152);
            }
            var8 = oi.field_c.a(param3, (SectorCacheStore) (var7), param0, 0, (SectorCacheStore) (var6));
            if (param4) {
              var8.c(31637);
            }
            stackIn_17_0 = new ResourceArchive(var8, param1, param5);
            return stackIn_17_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        acceptedPacketOpcodes = null;
        if (param0 > -36) {
          CheckBoxWidgetPainter.a(-28, true, 82, false, false, -112);
        }
    }

    public final void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        Widget toggleWidgetAlias = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int boxColour = 0;
        int boxX = 0;
        int boxY = 0;
        int textLeft = 0;
        ToggleWidget toggle = null;
        try {
          if (widget instanceof ToggleWidget) {
            toggleWidgetAlias = (Widget) (widget);
          } else {
            toggleWidgetAlias = null;
          }
          toggle = (ToggleWidget) (toggleWidgetAlias);
          if (toggle != null) {
            renderFlag = renderFlag & toggle.enabled;
          }
          if (obfuscationGuard >= -79) {
            this.verticalAlignment = -101;
          }
          boxColour = 5592405;
          SoftwareRaster.f(originX + widget.x, widget.y + originY, widget.width, widget.height, this.backgroundColour);
          if (renderFlag) {
            boxColour = 16777215;
          }
          boxX = this.boxOffsetX + (originX + widget.x);
          boxY = widget.y + (originY + this.boxOffsetY);
          SoftwareRaster.g(boxX, boxY, this.boxWidth, this.boxHeight, 5592405);
          SoftwareRaster.f(boxX, boxY, this.boxWidth, this.boxHeight, boxColour);
          if (toggle.active) {
            SoftwareRaster.h(boxX, boxY, this.boxWidth + boxX, this.boxHeight + boxY, 1);
            SoftwareRaster.h(boxX + this.boxWidth, boxY, boxX, this.boxHeight + boxY, 1);
          }
          if (this.font != null) {
            textLeft = this.textPadding + this.boxWidth + this.boxOffsetX;
            this.font.drawParagraph(widget.text, originX + widget.x + textLeft, widget.y + originY + this.textOffsetY, -this.textPadding - textLeft + widget.width, widget.height - (this.textPadding << 1), this.textColour, this.textShadow, this.horizontalAlignment, this.verticalAlignment, 0);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("tk.C(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(originX).append(',').append(obfuscationGuard).append(',').append(renderFlag).append(',').append(originY).append(')').toString());
        }
    }

    CheckBoxWidgetPainter(BitmapFont font, int textPadding, int textOffsetY, int textColour, int textShadow, int boxOffsetX, int boxOffsetY, int boxHeight, int boxWidth, int backgroundColour) {
        this.verticalAlignment = 1;
        this.horizontalAlignment = 1;
        try {
          this.boxOffsetX = boxOffsetX;
          this.textColour = textColour;
          this.textShadow = textShadow;
          this.boxHeight = boxHeight;
          this.textOffsetY = textOffsetY;
          this.textPadding = textPadding;
          this.boxOffsetY = boxOffsetY;
          this.boxWidth = boxWidth;
          this.font = font;
          this.backgroundColour = backgroundColour;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "tk.<init>(" + (font != null ? "{...}" : "null") + ',' + textPadding + ',' + textOffsetY + ',' + textColour + ',' + textShadow + ',' + boxOffsetX + ',' + boxOffsetY + ',' + boxHeight + ',' + boxWidth + ',' + backgroundColour + ')');
        }
    }

    static {
        acceptedPacketOpcodes = new boolean[64];
    }
}
