/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DualLinkDeque implements Iterable {
    static KeyboardInput keyboardInput;
    DualLinkNode sentinel;
    static UiComponent field_d;
    static int textChoiceBodyBaseline;

    final static boolean consistsOfRepeatedCharacter(byte obfuscationGuard, String text) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = text.charAt(0);
          if (obfuscationGuard <= 28) {
            return false;
          }
          for (var3 = 1; text.length() > var3; var3++) {
            if (text.charAt(var3) != var2_int) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("gp.G(").append(obfuscationGuard).append(',');
          if (text == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != -4858) {
          DualLinkDeque.outlineRasterRegion(-58, 65, -66, 54, -73);
          if (null != GameRenderAudioHelpers.contextActions) {
            return true;
          }
          if (ResourcePreparationQueue.a(-121)) {
            return true;
          }
          if (CircleBody.reportAbuseDialog != null) {
            return true;
          }
          if (!BufferedFile.b(true)) {
            return false;
          }
          return true;
        }
        if (null != GameRenderAudioHelpers.contextActions) {
          return true;
        }
        if (ResourcePreparationQueue.a(-121)) {
          return true;
        }
        if (CircleBody.reportAbuseDialog != null) {
          return true;
        }
        if (!BufferedFile.b(true)) {
          return false;
        }
        return true;
    }

    final static void outlineRasterRegion(int height, int y, int width, int unusedBelowIndex, int x) {
        width -= 4;
        x += 2;
        y += 2;
        height -= 4;
        int offset = Rasterizer2D.width * y + x;
        int rowSkip = Rasterizer2D.width - width;
        RasterEffectHelpers.markOutlineNeighbors(Rasterizer2D.pixels, offset, 0, 0, 0, unusedBelowIndex, width, height, rowSkip);
    }

    final void addLast(DualLinkNode node, byte obfuscationGuard) {
        try {
          if (null != node.secondaryPrevious) {
            node.unlinkSecondary(3);
          }
          node.secondaryNext = this.sentinel;
          if (obfuscationGuard > -112) {
            field_d = (UiComponent) null;
          }
          node.secondaryPrevious = this.sentinel.secondaryPrevious;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "gp.E(" + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new DualLinkIterator(this));
    }

    DualLinkDeque() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    public static void b(int param0) {
        field_d = null;
        keyboardInput = null;
        if (param0 != 2) {
          DualLinkDeque.outlineRasterRegion(-125, -106, -42, 126, 57);
        }
    }

    final DualLinkNode removeFirst(boolean obfuscationGuard) {
        DualLinkNode node = this.sentinel.secondaryNext;
        if (node == this.sentinel) {
          return null;
        }
        node.unlinkSecondary(3);
        if (!obfuscationGuard) {
          return node;
        }
        DualLinkDeque.outlineRasterRegion(-105, -93, 51, -34, -59);
        return node;
    }

    final static void a(boolean param0, boolean param1) {
        if (DualLinkDeque.a(-4858)) {
          param0 = false;
        }
        RichTextLayout.a(param0, (byte) 123);
        if (ValidationMessageWidget.field_V) {
          Rasterizer2D.darkenRectangle(BrickGameLayerController.field_c.tabs.localX, BrickGameLayerController.field_c.tabs.localY, BrickGameLayerController.field_c.tabs.width, BrickGameLayerController.field_c.tabs.height);
          BrickGameLayerController.field_c.tabs.drawRoot(true, param0);
        }
        if (!param1) {
          IntrusiveHashTable.a(7070, param0);
          return;
        }
    }

    static {
        keyboardInput = new KeyboardInput();
    }
}
