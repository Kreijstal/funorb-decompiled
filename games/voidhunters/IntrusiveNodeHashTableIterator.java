/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IntrusiveNodeHashTableIterator implements Iterator {
    private IntrusiveNode nextNode;
    private IntrusiveNode lastReturned;
    private IntrusiveNodeHashTable table;
    private int nextBucketIndex;

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = VoidHunters.field_G;
        if (this.nextNode != this.table.buckets[-1 + this.nextBucketIndex]) {
          return true;
        }
        while (this.nextBucketIndex < this.table.bucketCount) {
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.buckets[fieldTemp$0].next != this.table.buckets[-1 + this.nextBucketIndex]) {
            this.nextNode = this.table.buckets[this.nextBucketIndex - 1].next;
            return true;
          }
          this.nextNode = this.table.buckets[this.nextBucketIndex - 1];
        }
        return false;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = VoidHunters.field_G;
        if (this.table.buckets[this.nextBucketIndex - 1] != this.nextNode) {
          var1 = this.nextNode;
          this.nextNode = var1.next;
          this.lastReturned = var1;
          return var1;
        }
        do {
          if (this.nextBucketIndex >= this.table.bucketCount) {
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var1 = this.table.buckets[fieldTemp$0].next;
        } while (this.table.buckets[this.nextBucketIndex - 1] == var1);
        this.nextNode = var1.next;
        this.lastReturned = var1;
        return var1;
    }

    private final void reset(int param0) {
        if (param0 == 1) {
          this.nextNode = this.table.buckets[0].next;
          this.lastReturned = null;
          this.nextBucketIndex = 1;
          return;
        }
        this.lastReturned = (IntrusiveNode) null;
        this.nextNode = this.table.buckets[0].next;
        this.lastReturned = null;
        this.nextBucketIndex = 1;
    }

    IntrusiveNodeHashTableIterator(IntrusiveNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset(1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "pnb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(-3846);
        this.lastReturned = null;
    }

    static {
    }
}
