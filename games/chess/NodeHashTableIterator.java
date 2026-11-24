/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private IntrusiveNode nextNode;
    private IntrusiveNode lastReturned;
    static String field_f;
    static short[] field_g;
    static String[] field_a;
    private int nextBucketIndex;
    static String field_b;
    static tk field_e;
    private IterableNodeHashTable table;
    static ld[] field_i;

    private final void reset(int param0) {
        this.nextBucketIndex = 1;
        int var2 = -7 / ((12 - param0) / 54);
        this.nextNode = this.table.buckets[0].previous;
        this.lastReturned = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = Chess.field_G;
        if (this.table.buckets[this.nextBucketIndex - 1] != this.nextNode) {
          var4 = this.nextNode;
          this.nextNode = var4.previous;
          this.lastReturned = var4;
          return var4;
        }
        do {
          if (this.table.bucketCount <= this.nextBucketIndex) {
            return null;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var3 = this.table.buckets[fieldTemp$0].previous;
        } while (var3 == this.table.buckets[-1 + this.nextBucketIndex]);
        this.lastReturned = var3;
        this.nextNode = var3.previous;
        return var3;
    }

    public static void clearStaticReferences(byte param0) {
        field_g = null;
        field_b = null;
        if (param0 <= -64) {
          field_a = null;
          field_i = null;
          field_e = null;
          field_f = null;
          return;
        }
        field_a = (String[]) null;
        field_a = null;
        field_i = null;
        field_e = null;
        field_f = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Chess.field_G;
        if (this.table.buckets[-1 + this.nextBucketIndex] != this.nextNode) {
          return true;
        }
        while (true) {
          if (this.table.bucketCount <= this.nextBucketIndex) {
            return false;
          }
          fieldTemp$0 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (this.table.buckets[fieldTemp$0].previous == this.table.buckets[-1 + this.nextBucketIndex]) {
            this.nextNode = this.table.buckets[-1 + this.nextBucketIndex];
            continue;
          }
          break;
        }
        this.nextNode = this.table.buckets[-1 + this.nextBucketIndex].previous;
        return true;
    }

    final static AccountServiceResult pollAccountCreationResult(int param0) {
        if (DelegatingCanvas.field_a == ji.field_T) {
          throw new IllegalStateException();
        }
        if (kn.field_D == DelegatingCanvas.field_a) {
          DelegatingCanvas.field_a = ji.field_T;
          return lg.field_a;
        }
        if (param0 != 6792) {
          field_b = (String) null;
          return null;
        }
        return null;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset(90);
        } catch (RuntimeException runtimeException) {
          throw fk.wrapClientException((Throwable) ((Object) runtimeException), "ik.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(-2193);
        this.lastReturned = null;
    }

    static {
        field_b = "Unable to delete friend - system busy";
        field_g = new short[]{(short)16288, (short)6792};
        field_f = "3D MODE";
        field_e = new tk();
    }
}
