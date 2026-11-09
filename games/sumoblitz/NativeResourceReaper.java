/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NativeResourceReaper {
    private static IntrusiveDeque pendingDisposal;
    private static int ownerCount;
    private static boolean field_c;

    final synchronized static void drainPending(int guard) {
        IntrusiveDeque stackIn_4_0 = null;
        DeferredNativeResource var1;
        if (guard >= -119) {
          return;
        }
        stackIn_4_0 = (IntrusiveDeque) (pendingDisposal);
        while (true) {
          var1 = (DeferredNativeResource) (((IntrusiveDeque) (Object) stackIn_4_0).removeFirst(9));
          if (var1 == null) {
            return;
          }
          var1.resource.disposeNativeResource(true);
          var1.unlink(false);
          stackIn_4_0 = (IntrusiveDeque) (pendingDisposal);
        }
    }

    final synchronized static void retainOwner(byte guard) {
        ownerCount = ownerCount + 1;
        if (guard < -113) {
          return;
        }
        pendingDisposal = (IntrusiveDeque) null;
    }

    final synchronized static void deferDisposal(NativeResource resource, byte guard) {
        DeferredNativeResource var2 = null;
        DeferredNativeResource var2Lifetime1;
        if (field_c) {
          return;
        }
        if (guard == -37) {
          if (ownerCount <= 0) {
            resource.disposeNativeResource(false);
          } else {
            var2 = new DeferredNativeResource();
            var2.resource = resource;
            pendingDisposal.addLast((IntrusiveNode) (var2), (byte) 39);
          }
          return;
        }
        NativeResourceReaper.drainPending(-21);
        if (ownerCount <= 0) {
          resource.disposeNativeResource(false);
        } else {
          var2Lifetime1 = new DeferredNativeResource();
          var2Lifetime1.resource = resource;
          pendingDisposal.addLast((IntrusiveNode) (var2Lifetime1), (byte) 39);
        }
    }

    final synchronized static void releaseOwner(byte guard) {
        ownerCount = ownerCount - 1;
        if (0 == ownerCount) {
          NativeResourceReaper.drainPending(-121);
          if (guard > -93) {
            field_c = false;
            return;
          }
          return;
        }
        if (guard > -93) {
          field_c = false;
          return;
        }
    }

    static {
        ownerCount = 0;
        field_c = false;
        pendingDisposal = new IntrusiveDeque();
    }
}
