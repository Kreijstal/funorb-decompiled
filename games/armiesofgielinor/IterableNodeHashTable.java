/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static int[] field_a;
    IntrusiveNode[] buckets;
    int bucketCount;
    static boolean[][] field_f;
    private IntrusiveNode lookupNext;
    static String field_b;
    static String field_h;
    static int field_i;
    static String field_g;

    final void put(IntrusiveNode node, boolean obfuscationGuard, long key) {
        IntrusiveNode var5 = null;
        try {
          if (obfuscationGuard) {
            field_i = -49;
          }
          if (node.previous != null) {
            node.unlink(-118);
          }
          var5 = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
          node.next = var5;
          node.previous = var5.previous;
          node.previous.next = node;
          node.next.previous = node;
          node.key = key;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "m.A(" + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + key + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_f = (boolean[][]) null;
        field_g = null;
        field_h = null;
        field_b = null;
        if (param0) {
          IterableNodeHashTable.a(false);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashIterator(this));
    }

    final IntrusiveNode get(int obfuscationGuard, long key) {
        IntrusiveNode bucket;
        IntrusiveNode match;
        int obfuscationControl;
        IntrusiveNode guardedBucket;
        IntrusiveNode guardedMatch;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard == 13497) {
          bucket = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
          this.lookupNext = bucket.next;
          while (true) {
            if (bucket == this.lookupNext) {
              this.lookupNext = null;
              return null;
            }
            if (key != this.lookupNext.key) {
              this.lookupNext = this.lookupNext.next;
              continue;
            }
            break;
          }
          match = this.lookupNext;
          this.lookupNext = this.lookupNext.next;
          return match;
        }
        field_f = (boolean[][]) null;
        guardedBucket = this.buckets[(int)((long)(this.bucketCount - 1) & key)];
        this.lookupNext = guardedBucket.next;
        while (true) {
          if (guardedBucket == this.lookupNext) {
            this.lookupNext = null;
            return null;
          }
          if (key != this.lookupNext.key) {
            this.lookupNext = this.lookupNext.next;
            continue;
          }
          break;
        }
        guardedMatch = this.lookupNext;
        this.lookupNext = this.lookupNext.next;
        return guardedMatch;
    }

    IterableNodeHashTable(int bucketCount) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
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

    static {
        field_a = new int[]{65, 105};
        field_b = "<%0> has entered another game.";
        field_h = "This structure belongs to <%0>";
        field_f = new boolean[][]{new boolean[]{false, false, false, false, false, false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false, false, false}, new boolean[]{false, false}, new boolean[]{false, false, false, false, true}};
        field_g = "Hexes to baffle and corrupt single units.";
    }
}
