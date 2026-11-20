/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NodeHashTable {
    private int bucketCount;
    private IntrusiveNode iterationCursor;
    private IntrusiveNode[] buckets;
    private int iterationBucket;
    private IntrusiveNode lookupCursor;

    final IntrusiveNode get(byte param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (param0 < 111) {
          return (IntrusiveNode) null;
        }
        var4 = this.buckets[(int)(param1 & (long)(this.bucketCount - 1))];
        this.lookupCursor = var4.next;
        while (true) {
          if (var4 == this.lookupCursor) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.key != ~param1) {
            this.lookupCursor = this.lookupCursor.next;
            continue;
          }
          break;
        }
        var5 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.next;
        return var5;
    }

    final void put(IntrusiveNode param0, long param1, boolean param2) {
        IntrusiveNode var5 = null;
        if (param0.previous != null) {
          param0.unlink(0);
        }
        if (param2) {
          return;
        }
        try {
          var5 = this.buckets[(int)((long)(this.bucketCount - 1) & param1)];
          param0.previous = var5.previous;
          param0.next = var5;
          param0.previous.next = param0;
          param0.key = param1;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "og.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void showLoginChoice(byte param0) {
        if (param0 != 44) {
          return;
        }
        sm.field_c.setContent((UiWidget) (new LoginChoicePanel()), (byte) 87);
    }

    final IntrusiveNode first(int param0) {
        this.iterationBucket = param0;
        return this.next(-1);
    }

    final IntrusiveNode next(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        IntrusiveNode var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        IntrusiveNode var9;
        var3 = HoldTheLine.field_D;
        if (0 >= this.iterationBucket) {
          do {
            if (this.bucketCount <= this.iterationBucket) {
              if (param0 == -1) {
                return null;
              }
              this.bucketCount = -105;
              return null;
            }
            fieldTemp$1 = this.iterationBucket;
            this.iterationBucket = this.iterationBucket + 1;
            var4 = this.buckets[fieldTemp$1].next;
            var5 = var4;
          } while (var4 == this.buckets[-1 + this.iterationBucket]);
          this.iterationCursor = var5.next;
          return var5;
        }
        if (this.buckets[-1 + this.iterationBucket] != this.iterationCursor) {
          var9 = this.iterationCursor;
          this.iterationCursor = var9.next;
          return var9;
        }
        do {
          if (this.bucketCount <= this.iterationBucket) {
            if (param0 == -1) {
              return null;
            }
            this.bucketCount = -105;
            return null;
          }
          fieldTemp$0 = this.iterationBucket;
          this.iterationBucket = this.iterationBucket + 1;
          var4 = this.buckets[fieldTemp$0].next;
          var6 = var4;
        } while (var4 == this.buckets[-1 + this.iterationBucket]);
        this.iterationCursor = var6.next;
        return var6;
    }

    NodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.iterationBucket = 0;
        this.buckets = new IntrusiveNode[param0];
        this.bucketCount = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.buckets[var2] = dupTemp$1;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
    }
}
