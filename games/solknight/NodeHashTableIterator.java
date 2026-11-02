/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private int field_g;
    static String field_c;
    static Boolean field_b;
    private IntrusiveNode field_f;
    static PlatformTaskDispatcher field_a;
    private IntrusiveNode field_d;
    private IterableNodeHashTable field_e;

    public static void a(int param0) {
        field_b = null;
        field_c = null;
        int var1 = -127 % ((-59 - param0) / 44);
        field_a = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = SolKnight.field_L ? 1 : 0;
        if (this.field_f != this.field_e.buckets[-1 + this.field_g]) {
          return true;
        }
        while (true) {
          if (this.field_g >= this.field_e.field_e) {
            return false;
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          if (this.field_e.buckets[fieldTemp$0].previous == this.field_e.buckets[this.field_g - 1]) {
            this.field_f = this.field_e.buckets[this.field_g - 1];
            continue;
          }
          break;
        }
        this.field_f = this.field_e.buckets[this.field_g - 1].previous;
        return true;
    }

    public final void remove() {
        if (null == this.field_d) {
          throw new IllegalStateException();
        }
        this.field_d.unlink(10);
        this.field_d = null;
    }

    private final void b(int param0) {
        this.field_f = this.field_e.buckets[0].previous;
        this.field_d = null;
        if (param0 <= -23) {
          this.field_g = 1;
          return;
        }
        this.hasNext();
        this.field_g = 1;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        IntrusiveNode var1;
        int var2;
        var2 = SolKnight.field_L ? 1 : 0;
        if (this.field_f != this.field_e.buckets[this.field_g - 1]) {
          var1 = this.field_f;
          this.field_f = var1.previous;
          this.field_d = var1;
          return var1;
        }
        do {
          if (this.field_e.field_e <= this.field_g) {
            return null;
          }
          fieldTemp$0 = this.field_g;
          this.field_g = this.field_g + 1;
          var1 = this.field_e.buckets[fieldTemp$0].previous;
        } while (this.field_e.buckets[this.field_g - 1] == var1);
        this.field_f = var1.previous;
        this.field_d = var1;
        return var1;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.field_d = null;
        try {
          this.field_e = param0;
          this.b(-59);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
