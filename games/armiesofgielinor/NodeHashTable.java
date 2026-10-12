/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeHashTable {
    private int bucketCount;
    private IntrusiveNode lookupNext;
    private int iterationBucket;
    private IntrusiveNode iterationNext;
    private IntrusiveNode[] buckets;
    static String field_b;

    final int size(byte obfuscationGuard) {
        int var3 = 0;
        IntrusiveNode var4 = null;
        IntrusiveNode var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var2 = 0;
        for (var3 = 0; var3 < this.bucketCount; var3++) {
          var4 = this.buckets[var3];
          var5 = var4.next;
          while (var4 != var5) {
            var2++;
            var5 = var5.next;
          }
        }
        if (obfuscationGuard < 109) {
          return 109;
        }
        return var2;
    }

    final static void a(int param0, int param1) {
        fm.field_d[4] = param1;
        if (param0 != -1) {
          NodeHashTable.a(87, 95);
        }
    }

    final IntrusiveNode first(int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          this.clear((byte) -43);
        }
        this.iterationBucket = 0;
        return this.next((byte) 85);
    }

    final IntrusiveNode get(int obfuscationGuard, long key) {
        IntrusiveNode var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        IntrusiveNode var4 = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
        this.lookupNext = var4.next;
        if (obfuscationGuard > -8) {
          NodeHashTable.a(-7);
        }
        while (var4 != this.lookupNext) {
          if (~key == ~this.lookupNext.key) {
            var5 = this.lookupNext;
            this.lookupNext = this.lookupNext.next;
            return var5;
          }
          this.lookupNext = this.lookupNext.next;
        }
        this.lookupNext = null;
        return null;
    }

    final void clear(byte obfuscationGuard) {
        int var2;
        IntrusiveNode var3_ref_tc;
        IntrusiveNode var4;
        int var5;
        int var3;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        while (true) {
          if (var2 >= this.bucketCount) {
            var3 = -28 / ((obfuscationGuard + 43) / 39);
            this.iterationNext = null;
            this.lookupNext = null;
            return;
          }
          var3_ref_tc = this.buckets[var2];
          while (true) {
            var4 = var3_ref_tc.next;
            if (var3_ref_tc != var4) {
              var4.unlink(-111);
              continue;
            }
            break;
          }
          var2++;
        }
    }

    NodeHashTable(int bucketCount) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.iterationBucket = 0;
        this.buckets = new IntrusiveNode[bucketCount];
        this.bucketCount = bucketCount;
        for (var2 = 0; var2 < bucketCount; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    final IntrusiveNode next(byte obfuscationGuard) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        IntrusiveNode var4;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard <= 45) {
          this.size((byte) 90);
        }
        if (0 < this.iterationBucket &&
          this.iterationNext != this.buckets[this.iterationBucket - 1]) {
          var2 = this.iterationNext;
          this.iterationNext = var2.next;
          return var2;
        }
        do {
          if (this.bucketCount <= this.iterationBucket) {
            return null;
          }
          fieldTemp$0 = this.iterationBucket;
          this.iterationBucket = this.iterationBucket + 1;
          var4 = this.buckets[fieldTemp$0].next;
          var2 = var4;
        } while (var4 == this.buckets[this.iterationBucket - 1]);
        this.iterationNext = var2.next;
        return var2;
    }

    public static void a(int param0) {
        if (param0 >= -2) {
          NodeHashTable.a(-78);
        }
        field_b = null;
    }

    final void put(IntrusiveNode node, long key, int obfuscationGuard) {
        IntrusiveNode var5 = null;
        try {
          if (null != node.previous) {
            node.unlink(-128);
          }
          if (obfuscationGuard < 14) {
            this.lookupNext = (IntrusiveNode) null;
          }
          var5 = this.buckets[(int)((long)(-1 + this.bucketCount) & key)];
          node.next = var5;
          node.previous = var5.previous;
          node.previous.next = node;
          node.key = key;
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "bg.D(" + (node != null ? "{...}" : "null") + ',' + key + ',' + obfuscationGuard + ')');
        }
    }

    static {
        field_b = "Start Game";
    }
}
