/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    IntrusiveNode[] buckets;
    static int[] field_f;
    private IntrusiveNode field_d;
    private IntrusiveNode field_a;
    int bucketCount;
    static int[] field_c;
    private int field_b;

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != 33) {
          IterableNodeHashTable.releaseStatics(99);
        }
        field_f = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final void put(IntrusiveNode param0, byte param1, long param2) {
        if (param0.previous != null) {
          param0.unlink(92);
        }
        IntrusiveNode var5 = this.buckets[(int)(param2 & (long)(-1 + this.bucketCount))];
        param0.previous = var5.previous;
        if (param1 < 98) {
          return;
        }
        try {
          param0.next = var5;
          param0.previous.next = param0;
          param0.next.previous = param0;
          param0.key = param2;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "sk.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void clear(int param0) {
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        int var5;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = param0;
        while (true) {
          if (var2 >= this.bucketCount) {
            this.field_d = null;
            this.field_a = null;
            return;
          }
          var3 = this.buckets[var2];
          while (true) {
            var4 = var3.next;
            if (var3 != var4) {
              var4.unlink(92);
              continue;
            }
            break;
          }
          var2++;
        }
    }

    final IntrusiveNode first(byte param0) {
        if (param0 != 35) {
          this.field_d = (IntrusiveNode) null;
        }
        this.field_b = 0;
        return this.next((byte) 55);
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_b = 0;
        this.buckets = new IntrusiveNode[param0];
        this.bucketCount = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.buckets[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    final IntrusiveNode next(byte param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 55) {
          this.get(100L, true);
        }
        if (this.field_b > 0 &&
          this.buckets[this.field_b - 1] != this.field_a) {
          var2 = this.field_a;
          this.field_a = var2.next;
          return var2;
        }
        do {
          if (this.field_b >= this.bucketCount) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var2 = this.buckets[fieldTemp$0].next;
        } while (this.buckets[-1 + this.field_b] == var2);
        this.field_a = var2.next;
        return var2;
    }

    final IntrusiveNode get(long param0, boolean param1) {
        IntrusiveNode var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        IntrusiveNode var4 = this.buckets[(int)((long)(-1 + this.bucketCount) & param0)];
        this.field_d = var4.next;
        while (var4 != this.field_d) {
          if (param0 == this.field_d.key) {
            var5 = this.field_d;
            this.field_d = this.field_d.next;
            return var5;
          }
          this.field_d = this.field_d.next;
        }
        if (param1) {
          field_c = (int[]) null;
        }
        this.field_d = null;
        return null;
    }

    static {
        field_f = new int[]{15, 12, 18, 33};
        field_c = new int[256];
    }
}
