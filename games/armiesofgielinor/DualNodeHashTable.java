/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DualNodeHashTable {
    static NodeDeque field_e;
    private long lookupKey;
    private DualLinkedNode[] buckets;
    private int bucketCount;
    private DualLinkedNode iterationCursor;
    static String field_c;
    static String field_f;
    private int iterationBucket;
    private DualLinkedNode lookupCursor;

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final DualLinkedNode getNextMatch(int obfuscationGuard) {
        DualLinkedNode var3 = null;
        int var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.lookupCursor == null) {
          return null;
        }
        DualLinkedNode var2 = this.buckets[(int)(this.lookupKey & (long)(this.bucketCount - 1))];
        if (obfuscationGuard == -348) {
          while (var2 != this.lookupCursor) {
            if (~this.lookupKey == ~this.lookupCursor.secondaryKey) {
              var3 = this.lookupCursor;
              this.lookupCursor = this.lookupCursor.secondaryNext;
              return var3;
            }
            this.lookupCursor = this.lookupCursor.secondaryNext;
          }
          this.lookupCursor = null;
          return null;
        }
        return (DualLinkedNode) null;
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_e = null;
        int var1 = 20 / ((11 - param0) / 56);
    }

    final DualLinkedNode get(byte obfuscationGuard, long key) {
        DualLinkedNode var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.lookupKey = key;
        DualLinkedNode var4 = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
        this.lookupCursor = var4.secondaryNext;
        while (var4 != this.lookupCursor) {
          if (~this.lookupCursor.secondaryKey == ~key) {
            var5 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.secondaryNext;
            return var5;
          }
          this.lookupCursor = this.lookupCursor.secondaryNext;
        }
        if (obfuscationGuard != -27) {
          DualLinkedNode var7 = (DualLinkedNode) null;
          this.put(-62, 115L, (DualLinkedNode) null);
          this.lookupCursor = null;
          return null;
        }
        this.lookupCursor = null;
        return null;
    }

    final DualLinkedNode first(byte obfuscationGuard) {
        if (obfuscationGuard != 66) {
          field_f = (String) null;
          this.iterationBucket = 0;
          return this.next(1);
        }
        this.iterationBucket = 0;
        return this.next(1);
    }

    final static int getNominalTickRate(int obfuscationGuard) {
        if (obfuscationGuard > -68) {
          return -119;
        }
        return (int)(1000000000L / rd.tickDurationNanos);
    }

    final void put(int obfuscationGuard, long key, DualLinkedNode node) {
        DualLinkedNode var5 = null;
        try {
          if (node.secondaryPrevious != null) {
            node.unlinkSecondary((byte) -76);
          }
          var5 = this.buckets[(int)(key & (long)(obfuscationGuard + this.bucketCount))];
          node.secondaryPrevious = var5.secondaryPrevious;
          node.secondaryNext = var5;
          node.secondaryPrevious.secondaryNext = node;
          node.secondaryKey = key;
          node.secondaryNext.secondaryPrevious = node;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "tp.G(" + obfuscationGuard + ',' + key + ',' + (node != null ? "{...}" : "null") + ')');
        }
    }

    final DualLinkedNode next(int obfuscationGuard) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        DualLinkedNode var4;
        DualLinkedNode var5;
        DualLinkedNode var6;
        DualLinkedNode var9;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.iterationBucket <= 0) {
          do {
            if (this.iterationBucket >= this.bucketCount) {
              if (obfuscationGuard != 1) {
                return (DualLinkedNode) null;
              }
              return null;
            }
            fieldTemp$1 = this.iterationBucket;
            this.iterationBucket = this.iterationBucket + 1;
            var4 = this.buckets[fieldTemp$1].secondaryNext;
            var5 = var4;
          } while (var4 == this.buckets[-1 + this.iterationBucket]);
          this.iterationCursor = var5.secondaryNext;
          return var5;
        }
        if (this.buckets[this.iterationBucket - 1] != this.iterationCursor) {
          var9 = this.iterationCursor;
          this.iterationCursor = var9.secondaryNext;
          return var9;
        }
        do {
          if (this.iterationBucket >= this.bucketCount) {
            if (obfuscationGuard != 1) {
              return (DualLinkedNode) null;
            }
            return null;
          }
          fieldTemp$0 = this.iterationBucket;
          this.iterationBucket = this.iterationBucket + 1;
          var4 = this.buckets[fieldTemp$0].secondaryNext;
          var6 = var4;
        } while (var4 == this.buckets[-1 + this.iterationBucket]);
        this.iterationCursor = var6.secondaryNext;
        return var6;
    }

    DualNodeHashTable(int bucketCount) {
        int var2 = 0;
        DualLinkedNode dupTemp$1 = null;
        DualLinkedNode var3;
        this.iterationBucket = 0;
        this.buckets = new DualLinkedNode[bucketCount];
        this.bucketCount = bucketCount;
        for (var2 = 0; var2 < bucketCount; var2++) {
          dupTemp$1 = new DualLinkedNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_e = new NodeDeque();
        field_f = "Your game";
        field_c = "Try changing the '<%0>' setting.";
    }
}
