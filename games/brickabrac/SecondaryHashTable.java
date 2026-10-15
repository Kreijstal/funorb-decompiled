/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryHashTable {
    private DualLinkNode traversalCursor;
    private int bucketCount;
    private long lookupKey;
    private int traversalBucket;
    private DualLinkNode[] buckets;
    static long lastDiagnosticUsedHeapKiB;
    private DualLinkNode lookupCursor;
    static int[] earnedAchievementMask;
    static String[][] field_c;
    static java.applet.Applet field_i;
    static String field_a;

    final DualLinkNode get(long key, int bucketAdjustment) {
        DualLinkNode bucket;
        DualLinkNode match;
        int clientBranchFlag;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        this.lookupKey = key;
        bucket = this.buckets[(int)((long)(this.bucketCount + bucketAdjustment) & key)];
        this.lookupCursor = bucket.secondaryNext;
        while (true) {
          if (this.lookupCursor == bucket) {
            this.lookupCursor = null;
            return null;
          }
          if (key != this.lookupCursor.secondaryKey) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        match = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return match;
    }

    final DualLinkNode nextMatch(byte obfuscationGuard) {
        DualLinkNode var2;
        int var3_int;
        DualLinkNode var3;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (null == this.lookupCursor) {
          return null;
        }
        var2 = this.buckets[(int)((long)(this.bucketCount - 1) & this.lookupKey)];
        while (true) {
          if (this.lookupCursor == var2) {
            var3_int = 61 / ((obfuscationGuard - 37) / 63);
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

    final DualLinkNode next(boolean obfuscationGuard) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var36;
        DualLinkNode var37;
        DualLinkNode var38;
        DualLinkNode var39;
        DualLinkNode var42;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (!obfuscationGuard) {
          if (0 >= this.traversalBucket) {
            do {
              if (this.bucketCount <= this.traversalBucket) {
                return null;
              }
              fieldTemp$1 = this.traversalBucket;
              this.traversalBucket = this.traversalBucket + 1;
              var4 = this.buckets[fieldTemp$1].secondaryNext;
              var38 = var4;
            } while (var4 == this.buckets[-1 + this.traversalBucket]);
            this.traversalCursor = var38.secondaryNext;
            return var38;
          }
          if (this.buckets[-1 + this.traversalBucket] != this.traversalCursor) {
            var42 = this.traversalCursor;
            this.traversalCursor = var42.secondaryNext;
            return var42;
          }
          do {
            if (this.bucketCount <= this.traversalBucket) {
              return null;
            }
            fieldTemp$0 = this.traversalBucket;
            this.traversalBucket = this.traversalBucket + 1;
            var4 = this.buckets[fieldTemp$0].secondaryNext;
            var39 = var4;
          } while (var4 == this.buckets[-1 + this.traversalBucket]);
          this.traversalCursor = var39.secondaryNext;
          return var39;
        }
        this.get(31L, -107);
        if (0 >= this.traversalBucket) {
          do {
            if (this.bucketCount <= this.traversalBucket) {
              return null;
            }
            fieldTemp$3 = this.traversalBucket;
            this.traversalBucket = this.traversalBucket + 1;
            var4 = this.buckets[fieldTemp$3].secondaryNext;
            var5 = var4;
          } while (var4 == this.buckets[-1 + this.traversalBucket]);
          this.traversalCursor = var5.secondaryNext;
          return var5;
        }
        if (this.buckets[-1 + this.traversalBucket] != this.traversalCursor) {
          var36 = this.traversalCursor;
          this.traversalCursor = var36.secondaryNext;
          return var36;
        }
        do {
          if (this.bucketCount <= this.traversalBucket) {
            return null;
          }
          fieldTemp$2 = this.traversalBucket;
          this.traversalBucket = this.traversalBucket + 1;
          var4 = this.buckets[fieldTemp$2].secondaryNext;
          var37 = var4;
        } while (var4 == this.buckets[-1 + this.traversalBucket]);
        this.traversalCursor = var37.secondaryNext;
        return var37;
    }

    final DualLinkNode first(byte obfuscationGuard) {
        this.traversalBucket = 0;
        if (obfuscationGuard <= 57) {
          return (DualLinkNode) null;
        }
        return this.next(false);
    }

    final static void a(int param0) {
        if (param0 == -1) {
          return;
        }
        SecondaryHashTable.c((byte) 88);
    }

    final void put(long key, DualLinkNode node, int obfuscationGuard) {
        if (null != node.secondaryPrevious) {
          node.unlinkSecondary(3);
        }
        DualLinkNode bucket = this.buckets[(int)(key & (long)(-1 + this.bucketCount))];
        node.secondaryPrevious = bucket.secondaryPrevious;
        node.secondaryNext = bucket;
        node.secondaryPrevious.secondaryNext = node;
        if (obfuscationGuard <= 38) {
          return;
        }
        try {
          node.secondaryNext.secondaryPrevious = node;
          node.secondaryKey = key;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "mk.B(" + key + ',' + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_c = (String[][]) null;
        earnedAchievementMask = null;
        field_a = null;
        if (param0 > 47) {
          return;
        }
        field_i = (java.applet.Applet) null;
    }

    SecondaryHashTable(int bucketCount) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.traversalBucket = 0;
        this.buckets = new DualLinkNode[bucketCount];
        this.bucketCount = bucketCount;
        for (var2 = 0; bucketCount > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        earnedAchievementMask = Ball.createAchievementMask(8);
        field_a = "Wipe out: cancels out any positive power-ups.";
    }
}
