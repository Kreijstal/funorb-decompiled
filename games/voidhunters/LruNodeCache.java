/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LruNodeCache {
    static Boolean field_f;
    static int field_g;
    static int field_e;
    private DualLinkNode evictionSentinel;
    private SecondaryNodeQueue recencyQueue;
    private NodeHashTable index;
    private int remainingCapacity;

    final void put(long param0, byte param1, DualLinkNode param2) {
        DualLinkNode var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param1 > -9) {
            this.remainingCapacity = 91;
          }
          if (0 != this.remainingCapacity) {
            this.remainingCapacity = this.remainingCapacity - 1;
          } else {
            var5 = this.recencyQueue.removeFirst((byte) 77);
            var5.unlink(-3846);
            var5.unlinkSecondary((byte) -35);
            if (var5 == this.evictionSentinel) {
              var5 = this.recencyQueue.removeFirst((byte) -128);
              var5.unlink(-3846);
              var5.unlinkSecondary((byte) -35);
            }
          }
          this.index.put(param0, param2, (byte) -126);
          this.recencyQueue.addLast(param2, -94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("ehb.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final DualLinkNode get(long param0, int param1) {
        int var5 = 0;
        DualLinkNode var4 = (DualLinkNode) (this.index.get(param0, 117));
        int var5Lifetime1;
        if (var4 == null) {
          var5 = -104 % ((-26 - param1) / 38);
          return var4;
        }
        this.recencyQueue.addLast(var4, -74);
        var5Lifetime1 = -104 % ((-26 - param1) / 38);
        return var4;
    }

    public static void clearSharedReferences(boolean param0) {
        field_f = null;
        if (param0) {
          LruNodeCache.clearSharedReferences(false);
        }
    }

    LruNodeCache(int param0) {
        int var2 = 0;
        this.evictionSentinel = new DualLinkNode();
        this.recencyQueue = new SecondaryNodeQueue();
        this.remainingCapacity = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.index = new NodeHashTable(var2);
    }

    static {
        field_e = 5;
    }
}
