/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private static int[] field_d;
    static int field_h;
    static Sprite[][] field_b;
    private IntrusiveNode nextNode;
    private int bucketIndex;
    private IterableNodeHashTable table;
    private IntrusiveNode lastReturned;
    static String field_a;

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink((byte) -90);
        this.lastReturned = null;
    }

    private final void reset(byte guard) {
        this.nextNode = this.table.buckets[0].next;
        this.lastReturned = null;
        if (guard != -59) {
          this.hasNext();
        }
        this.bucketIndex = 1;
    }

    public final boolean hasNext() {
        int var2 = EscapeVector.obfuscationControl;
        if (this.nextNode != this.table.buckets[-1 + this.bucketIndex]) {
          return true;
        }
        while (true) {
          if (this.table.bucketCount <= this.bucketIndex) {
            return false;
          }
          int fieldTemp$0 = this.bucketIndex;
          this.bucketIndex = this.bucketIndex + 1;
          if (this.table.buckets[fieldTemp$0].next == this.table.buckets[this.bucketIndex - 1]) {
            this.nextNode = this.table.buckets[-1 + this.bucketIndex];
            continue;
          }
          break;
        }
        this.nextNode = this.table.buckets[-1 + this.bucketIndex].next;
        return true;
    }

    public static void releaseStatics(boolean guard) {
        field_d = null;
        field_a = null;
        if (guard) {
          NodeHashTableIterator.releaseStatics(true);
        }
        field_b = (Sprite[][]) null;
    }

    public final Object next() {
        IntrusiveNode var1;
        int var2 = EscapeVector.obfuscationControl;
        if (this.table.buckets[-1 + this.bucketIndex] != this.nextNode) {
          var1 = this.nextNode;
          this.nextNode = var1.next;
          this.lastReturned = var1;
          return var1;
        }
        do {
          if (this.table.bucketCount <= this.bucketIndex) {
            return null;
          }
          int fieldTemp$0 = this.bucketIndex;
          this.bucketIndex = this.bucketIndex + 1;
          var1 = this.table.buckets[fieldTemp$0].next;
        } while (this.table.buckets[this.bucketIndex - 1] == var1);
        this.lastReturned = var1;
        this.nextNode = var1.next;
        return var1;
    }

    NodeHashTableIterator(IterableNodeHashTable table) {
        this.lastReturned = null;
        try {
          this.table = table;
          this.reset((byte) -59);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hb.<init>(" + (table != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[98304];
        for (int var0 = 92682; var0 >= 46341; var0--) {
          long var4 = (long)((var0 << 1) - 1);
          long var6 = (long)((var0 << 1) + 1);
          int var3 = (int)((var6 * var6 >> 18) - 32768L);
          int var2 = (int)((var4 * var4 >> 18) - 32768L);
          if (!(field_d.length > var3)) {
            var3 = -1 + field_d.length;
          }
          for (int var1 = var2 < 0 ? 0 : var2; var1 <= var3; var1++) {
            field_d[var1] = var0;
          }
        }
        field_a = "Five rock busters";
    }
}
