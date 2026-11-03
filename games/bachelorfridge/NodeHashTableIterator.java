/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private int field_c;
    private IntrusiveNode field_b;
    private IntrusiveNode field_d;
    private IterableNodeHashTable field_a;

    public final Object next() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = BachelorFridge.field_y;
        if (this.field_b != this.field_a.field_c[this.field_c - 1]) {
          var4 = this.field_b;
          this.field_b = var4.next;
          this.field_d = var4;
          return var4;
        }
        do {
          if (this.field_a.field_f <= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_a.field_c;
          fieldTemp$1 = this.field_c;
          this.field_c = this.field_c + 1;
          var3 = fieldTemp$0[fieldTemp$1].next;
        } while (this.field_a.field_c[this.field_c - 1] == var3);
        this.field_d = var3;
        this.field_b = var3.next;
        return var3;
    }

    private final void a(int param0) {
        this.field_b = this.field_a.field_c[0].next;
        this.field_c = 1;
        if (param0 <= -34) {
          this.field_d = null;
          return;
        }
        this.field_c = -99;
        this.field_d = null;
    }

    public final void remove() {
        if (this.field_d == null) {
          throw new IllegalStateException();
        }
        this.field_d.unlink(false);
        this.field_d = null;
    }

    public final boolean hasNext() {
        IntrusiveNode[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = BachelorFridge.field_y;
        if (this.field_a.field_c[this.field_c - 1] != this.field_b) {
          return true;
        }
        while (this.field_c < this.field_a.field_f) {
          fieldTemp$0 = this.field_a.field_c;
          fieldTemp$1 = this.field_c;
          this.field_c = this.field_c + 1;
          if (fieldTemp$0[fieldTemp$1].next != this.field_a.field_c[this.field_c - 1]) {
            this.field_b = this.field_a.field_c[this.field_c - 1].next;
            return true;
          }
          this.field_b = this.field_a.field_c[-1 + this.field_c];
        }
        return false;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.field_d = null;
        try {
          this.field_a = param0;
          this.a(-87);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "np.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
