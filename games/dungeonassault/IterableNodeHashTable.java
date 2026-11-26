/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static double field_a;
    static RgbSprite[] field_f;
    static String field_h;
    static int field_b;
    static PlatformTask field_e;
    static RgbSprite field_i;
    private IntrusiveNode lookupCursor;
    static String field_c;
    IntrusiveNode[] buckets;
    int bucketCount;

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final void put(long param0, byte param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        if (param2.next != null) {
          param2.unlink(false);
        }
        if (param1 > -127) {
          return;
        }
        try {
          var5 = this.buckets[(int)(param0 & (long)(-1 + this.bucketCount))];
          param2.next = var5.next;
          param2.previous = var5;
          param2.next.previous = param2;
          param2.previous.next = param2;
          param2.key = param0;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "qi.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode get(int param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = DungeonAssault.field_K;
        var4 = this.buckets[(int)((long)(this.bucketCount - param0) & param1)];
        this.lookupCursor = var4.previous;
        while (true) {
          if (this.lookupCursor == var4) {
            this.lookupCursor = null;
            return null;
          }
          if (~this.lookupCursor.key != ~param1) {
            this.lookupCursor = this.lookupCursor.previous;
            continue;
          }
          break;
        }
        var5 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.previous;
        return var5;
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    public static void clearStaticReferences(boolean param0) {
        field_c = null;
        if (!param0) {
          return;
        }
        field_e = null;
        field_h = null;
        field_i = null;
        field_f = null;
    }

    static {
        field_a = 0.0;
        field_h = "The <%0> is undamaged!";
        field_c = "Years spent studying the dark arts, in service to the corrupt human nobles of the west, have given the sorceress the knowledge to tame the elements and turn them against her foes.";
    }
}
