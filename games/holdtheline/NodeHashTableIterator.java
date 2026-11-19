/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    static NineSlicePanel field_c;
    private int field_i;
    private IntrusiveNode field_k;
    static int[] field_j;
    static int field_g;
    static Sprite field_h;
    static String field_b;
    static byte[] field_e;
    private IntrusiveNode field_d;
    static String field_a;
    private IterableNodeHashTable field_f;

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        field_h = null;
        field_j = null;
        if (param0 != 86) {
          field_e = (byte[]) null;
          return;
        }
    }

    final static int a(int param0) {
        if (param0 != 855) {
          return -27;
        }
        return (int)(1000000000L / IntrusiveDequeCursor.field_c);
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = HoldTheLine.field_D;
        if (this.field_f.buckets[this.field_i - 1] != this.field_k) {
          var1 = this.field_k;
          this.field_k = var1.next;
          this.field_d = var1;
          return var1;
        }
        do {
          if (this.field_f.bucketCount <= this.field_i) {
            return null;
          }
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          var1 = this.field_f.buckets[fieldTemp$0].next;
        } while (this.field_f.buckets[this.field_i - 1] == var1);
        this.field_d = var1;
        this.field_k = var1.next;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = HoldTheLine.field_D;
        if (this.field_k != this.field_f.buckets[-1 + this.field_i]) {
          return true;
        }
        while (this.field_f.bucketCount > this.field_i) {
          fieldTemp$0 = this.field_i;
          this.field_i = this.field_i + 1;
          if (this.field_f.buckets[fieldTemp$0].next != this.field_f.buckets[-1 + this.field_i]) {
            this.field_k = this.field_f.buckets[this.field_i - 1].next;
            return true;
          }
          this.field_k = this.field_f.buckets[this.field_i - 1];
        }
        return false;
    }

    private final void resetIterator(byte param0) {
        this.field_d = null;
        int var2 = -67 / ((param0 - 79) / 46);
        this.field_k = this.field_f.buckets[0].next;
        this.field_i = 1;
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.unlink(0);
        this.field_d = null;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.field_d = null;
        try {
          this.field_f = param0;
          this.resetIterator((byte) 127);
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Just Play";
        field_g = 0;
        field_j = new int[]{16711680, 65280, 16776960, 8421631};
        field_e = new byte[]{(byte)50, (byte)97};
        field_a = "Select Course";
    }
}
