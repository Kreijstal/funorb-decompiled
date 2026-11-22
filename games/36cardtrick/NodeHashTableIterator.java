/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private int nextBucketIndex;
    private IterableNodeHashTable table;
    private IntrusiveNode lastReturned;
    static sg field_e;
    private IntrusiveNode nextNode;
    static mg[] field_a;
    static char[] field_f;

    final static AccountServiceResult createAccountSuccessResult(int param0, boolean param1) {
        AccountServiceResult var2 = new AccountServiceResult(true);
        var2.field_e = param1 ? true : false;
        if (param0 == -1) {
          return var2;
        }
        NodeHashTableIterator.b((byte) 34);
        return var2;
    }

    private final void reset(byte param0) {
        if (param0 == 64) {
          this.nextBucketIndex = 1;
          this.nextNode = this.table.buckets[0].next;
          this.lastReturned = null;
          return;
        }
        NodeHashTableIterator.createAccountSuccessResult(-8, false);
        this.nextBucketIndex = 1;
        this.nextNode = this.table.buckets[0].next;
        this.lastReturned = null;
    }

    final static uh a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = Main.field_T;
        uh var5 = (uh) (tl.field_a.beginForward((byte) 74));
        while (var5 != null) {
          if (var5.field_g == param3) {
            return var5;
          }
          var5 = (uh) (tl.field_a.nextForward((byte) -123));
        }
        uh var7 = new uh();
        var5 = var7;
        var7.field_g = param3;
        var7.field_h = param4;
        var7.field_k = param0;
        if (param2 == 25404) {
          tl.field_a.addLast(var5, 27362);
          DirectByteArrayStore.a(-91, var5, param1);
          return var5;
        }
        field_f = (char[]) null;
        tl.field_a.addLast(var5, 27362);
        DirectByteArrayStore.a(-91, var5, param1);
        return var5;
    }

    public final boolean hasNext() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = Main.field_T;
        if (this.table.buckets[this.nextBucketIndex - 1] != this.nextNode) {
          return true;
        }
        while (true) {
          if (this.nextBucketIndex >= this.table.bucketCount) {
            return false;
          }
          fieldTemp$0 = this.table.buckets;
          fieldTemp$1 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          if (fieldTemp$0[fieldTemp$1].next == this.table.buckets[this.nextBucketIndex - 1]) {
            this.nextNode = this.table.buckets[-1 + this.nextBucketIndex];
            continue;
          }
          break;
        }
        this.nextNode = this.table.buckets[-1 + this.nextBucketIndex].next;
        return true;
    }

    public final Object next() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = Main.field_T;
        if (this.table.buckets[-1 + this.nextBucketIndex] != this.nextNode) {
          var4 = this.nextNode;
          this.lastReturned = var4;
          this.nextNode = var4.next;
          return var4;
        }
        do {
          if (this.table.bucketCount <= this.nextBucketIndex) {
            return null;
          }
          fieldTemp$0 = this.table.buckets;
          fieldTemp$1 = this.nextBucketIndex;
          this.nextBucketIndex = this.nextBucketIndex + 1;
          var3 = fieldTemp$0[fieldTemp$1].next;
        } while (this.table.buckets[this.nextBucketIndex - 1] == var3);
        this.lastReturned = var3;
        this.nextNode = var3.next;
        return var3;
    }

    public static void b(byte param0) {
        field_a = null;
        field_e = null;
        field_f = null;
        if (param0 == 38) {
          return;
        }
        NodeHashTableIterator.a(103, 62, -72, -123, -10);
    }

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlink(121);
        this.lastReturned = null;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.lastReturned = null;
        try {
          this.table = param0;
          this.reset((byte) 64);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "il.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new sg();
        field_f = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
    }
}
