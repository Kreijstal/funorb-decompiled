/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeDisposalQueue {
    private static int toolkitCount;
    private static IntrusiveDeque pendingResources;
    private static boolean disabled;

    final synchronized static void enqueue(int param0, NativeResource param1) {
        NativeDisposalNode var2 = null;
        if (!disabled) {
          if (toolkitCount > param0) {
            var2 = new NativeDisposalNode();
            var2.resource = param1;
            pendingResources.addLast(param0 - 10258, var2);
          } else {
            param1.disposeNative(false);
          }
          return;
        }
    }

    final synchronized static void registerToolkit(byte param0) {
        toolkitCount = toolkitCount + 1;
        if (param0 == -76) {
          return;
        }
        toolkitCount = -71;
    }

    final synchronized static void unregisterToolkit(boolean param0) {
        if (!param0) {
          disabled = false;
          toolkitCount = toolkitCount - 1;
          if (0 == toolkitCount) {
            NativeDisposalQueue.drain((byte) -128);
            return;
          }
          return;
        }
        toolkitCount = toolkitCount - 1;
        if (0 == toolkitCount) {
          NativeDisposalQueue.drain((byte) -128);
          return;
        }
    }

    final synchronized static void drain(byte param0) {
        NativeDisposalNode var1;
        if (param0 != -128) {
          disabled = true;
        }
        while (true) {
          var1 = (NativeDisposalNode) (pendingResources.removeFirst(true));
          if (var1 == null) {
            return;
          }
          var1.resource.disposeNative(true);
          var1.unlink(-3846);
        }
    }

    static {
        toolkitCount = 0;
        disabled = false;
        pendingResources = new IntrusiveDeque();
    }
}
