/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IntrusiveNodeHashTable implements Iterable {
    static String field_a;
    private IntrusiveNode iterationCursor;
    static String field_c;
    private IntrusiveNode lookupCursor;
    int bucketCount;
    static String field_e;
    private int iterationBucket;
    IntrusiveNode[] buckets;

    public final Iterator iterator() {
        return (Iterator) ((Object) new IntrusiveNodeHashTableIterator(this));
    }

    final IntrusiveNode get(byte param0, long param1) {
        IntrusiveNode var5 = null;
        int var6 = VoidHunters.field_G;
        IntrusiveNode var4 = this.buckets[(int)(param1 & (long)(this.bucketCount - 1))];
        this.lookupCursor = var4.next;
        if (param0 > -103) {
          return (IntrusiveNode) null;
        }
        while (var4 != this.lookupCursor) {
          if (~param1 == ~this.lookupCursor.key) {
            var5 = this.lookupCursor;
            this.lookupCursor = this.lookupCursor.next;
            return var5;
          }
          this.lookupCursor = this.lookupCursor.next;
        }
        this.lookupCursor = null;
        return null;
    }

    final void put(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param0.previous) {
            param0.unlink(-3846);
          }
          var5 = this.buckets[(int)(param2 & (long)(this.bucketCount - 1))];
          if (param1 != 0) {
            field_a = (String) null;
          }
          param0.next = var5;
          param0.previous = var5.previous;
          param0.previous.next = param0;
          param0.key = param2;
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nga.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode next(byte param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        IntrusiveNode var4;
        var3 = VoidHunters.field_G;
        if (0 < this.iterationBucket &&
          this.buckets[-1 + this.iterationBucket] != this.iterationCursor) {
          var2 = this.iterationCursor;
          this.iterationCursor = var2.next;
          return var2;
        }
        do {
          if (this.bucketCount <= this.iterationBucket) {
            if (param0 == 44) {
              return null;
            }
            this.put((IntrusiveNode) null, 116, -5L);
            return null;
          }
          fieldTemp$0 = this.iterationBucket;
          this.iterationBucket = this.iterationBucket + 1;
          var4 = this.buckets[fieldTemp$0].next;
          var2 = var4;
        } while (var4 == this.buckets[this.iterationBucket - 1]);
        this.iterationCursor = var2.next;
        return var2;
    }

    final IntrusiveNode first(int param0) {
        int var2 = 110 / ((47 - param0) / 40);
        this.iterationBucket = 0;
        return this.next((byte) 44);
    }

    final void clear(int param0) {
        int var2 = 0;
        IntrusiveNode var3 = null;
        IntrusiveNode var4 = null;
        int var5 = VoidHunters.field_G;
        for (var2 = param0; var2 < this.bucketCount; var2++) {
          var3 = this.buckets[var2];
          while (true) {
            var4 = var3.next;
            if (var3 == var4) {
              break;
            }
            var4.unlink(-3846);
          }
        }
        this.lookupCursor = null;
        this.iterationCursor = null;
    }

    public static void clearSharedReferences(byte param0) {
        field_e = null;
        field_c = null;
        if (param0 != -126) {
          return;
        }
        field_a = null;
    }

    IntrusiveNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.iterationBucket = 0;
        this.bucketCount = param0;
        this.buckets = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
        field_a = "Show players in <%0>'s game";
        field_c = "Checking";
    }
}
