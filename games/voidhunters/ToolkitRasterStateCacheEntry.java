/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitRasterStateCacheEntry extends IntrusiveNode {
    ToolkitRasterStateStack stateStack;
    GraphicsToolkit toolkit;

    ToolkitRasterStateCacheEntry(GraphicsToolkit param0, ToolkitRasterStateStack param1) {
        try {
          this.toolkit = param0;
          this.stateStack = param1;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "qgb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
