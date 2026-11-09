/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    private DualLinkNode[] buckets;
    static int[] field_e;
    static SpriteData[] field_g;
    private DualLinkNode lookupCursor;
    private int capacity;
    private long lookupKey;
    static int[] field_b;

    public static void releaseStatics(int param0) {
        field_b = null;
        field_g = null;
        if (param0 != 8192) {
          SecondaryNodeHashTable.releaseStatics(-5);
          field_e = null;
          return;
        }
        field_e = null;
    }

    final DualLinkNode nextMatch(int guard) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        DualLinkNode var2Lifetime1;
        DualLinkNode var3Lifetime1;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (this.lookupCursor == null) {
          return null;
        }
        if (guard <= -102) {
          var2 = this.buckets[(int)((long)(-1 + this.capacity) & this.lookupKey)];
          while (true) {
            if (this.lookupCursor == var2) {
              this.lookupCursor = null;
              return null;
            }
            if (this.lookupKey != this.lookupCursor.secondaryKey) {
              this.lookupCursor = this.lookupCursor.secondaryNext;
              continue;
            }
            break;
          }
          var3 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.secondaryNext;
          return var3;
        }
        this.lookupCursor = (DualLinkNode) null;
        var2Lifetime1 = this.buckets[(int)((long)(-1 + this.capacity) & this.lookupKey)];
        while (true) {
          if (this.lookupCursor == var2Lifetime1) {
            this.lookupCursor = null;
            return null;
          }
          if (this.lookupKey != this.lookupCursor.secondaryKey) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return var3Lifetime1;
    }

    final void put(long key, int guard, DualLinkNode node) {
        if (null != node.secondaryPrevious) {
          node.unlinkSecondary(-5106);
        }
        DualLinkNode var5 = this.buckets[(int)((long)(this.capacity - 1) & key)];
        node.secondaryPrevious = var5.secondaryPrevious;
        if (guard != -8156) {
          return;
        }
        try {
          node.secondaryNext = var5;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryNext.secondaryPrevious = node;
          node.secondaryKey = key;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "ci.A(" + key + ',' + guard + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkNode get(long key, int guard) {
        DualLinkNode var4;
        int var5;
        DualLinkNode var6;
        int var7;
        var7 = Sumoblitz.field_L ? 1 : 0;
        this.lookupKey = key;
        var5 = 121 % ((17 - guard) / 56);
        var4 = this.buckets[(int)((long)(-1 + this.capacity) & key)];
        this.lookupCursor = var4.secondaryNext;
        while (true) {
          if (var4 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (this.lookupCursor.secondaryKey != key) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        var6 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return var6;
    }

    SecondaryNodeHashTable(int bucketCount) {
        int var2 = 0;
        DualLinkNode dupTemp$0 = null;
        DualLinkNode var3 = null;
        this.buckets = new DualLinkNode[bucketCount];
        this.capacity = bucketCount;
        for (var2 = 0; bucketCount > var2; var2++) {
          dupTemp$0 = new DualLinkNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_e = new int[16];
        field_b = new int[8192];
    }
}
