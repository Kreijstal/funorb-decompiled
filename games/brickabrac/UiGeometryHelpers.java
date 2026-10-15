/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiGeometryHelpers {
    static String[] rankingSortModeLabels;
    static int tooltipDisplayDurationTicks;
    static int[] decodedSpriteWidths;
    static RgbSprite spaceNearHalfSprite;
    static String goodGriefText;

    final static RgbSprite createScaledHalfSizeSprite(int destinationX, RgbSprite source) {
        RgbSprite halfSizeSprite = null;
        RuntimeException failure = null;
        RgbSprite result = null;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String sourceSummary = null;
        RuntimeException caughtFailure = null;
        try {
          halfSizeSprite = new RgbSprite(source.canvasWidth / 2, source.canvasHeight / 2);
          halfSizeSprite.bindRasterTarget();
          source.a(destinationX, 0, source.canvasWidth / 2, source.canvasHeight / 2);
          BallPulseEffect.framebuffer.bindRaster((byte) 102);
          result = halfSizeSprite;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("jh.C(").append(destinationX).append(',');
          if (source == null) {
            sourceSummary = "null";
          } else {
            sourceSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(sourceSummary).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte obfuscationGuard) {
        int var1 = 54 / ((-65 - obfuscationGuard) / 48);
        spaceNearHalfSprite = null;
        decodedSpriteWidths = null;
        goodGriefText = null;
        rankingSortModeLabels = null;
    }

    final static void resetListVerticalBounds(boolean obfuscationGuard, UiComponent list) {
        UiComponent currentChild = null;
        UiComponent firstChildAlias = null;
        int unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        UiComponent nextChildAlias;
        try {
          currentChild = (UiComponent) (list.children.first(-104));
          firstChildAlias = currentChild;
          while (currentChild != null) {
            currentChild.remainingY = 0;
            currentChild.height = 0;
            currentChild.remainingHeight = 0;
            currentChild.localY = 0;
            currentChild = (UiComponent) (list.children.next((byte) 116));
            nextChildAlias = currentChild;
          }
          if (!obfuscationGuard) {
            UiGeometryHelpers.clearSharedReferences((byte) -19);
          }
          list.localY = 0;
          list.remainingY = 0;
          list.height = 0;
          list.remainingHeight = 0;
        } catch (RuntimeException failure) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "jh.A(" + obfuscationGuard + ',' + (list != null ? "{...}" : "null") + ')');
        }
    }

    static {
        rankingSortModeLabels = new String[]{"Showing by rating", "Showing by win percentage"};
        goodGriefText = "Good grief!";
        tooltipDisplayDurationTicks = 250;
    }
}
