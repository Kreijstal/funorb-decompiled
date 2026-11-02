/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class NodeHashTableIterator implements Iterator {
    private IntrusiveNode field_b;
    private int field_d;
    static String field_a;
    private IterableNodeHashTable field_e;
    private IntrusiveNode field_c;

    public final void remove() {
        if (this.field_b == null) {
          throw new IllegalStateException();
        }
        this.field_b.unlink(20);
        this.field_b = null;
    }

    final static void a(int param0, Sprite param1) {
        try {
          if (param0 != -8039) {
            field_a = (String) null;
          }
          eh.field_f = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = stellarshard.field_B;
        if (this.field_e.field_e[-1 + this.field_d] != this.field_c) {
          return true;
        }
        while (true) {
          if (this.field_d >= this.field_e.field_b) {
            return false;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          if (this.field_e.field_e[fieldTemp$0].next == this.field_e.field_e[-1 + this.field_d]) {
            this.field_c = this.field_e.field_e[-1 + this.field_d];
            continue;
          }
          break;
        }
        this.field_c = this.field_e.field_e[this.field_d - 1].next;
        return true;
    }

    public static void a(byte param0) {
        if (param0 != 3) {
          field_a = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        var2 = stellarshard.field_B;
        if (this.field_e.field_e[-1 + this.field_d] != this.field_c) {
          var4 = this.field_c;
          this.field_c = var4.next;
          this.field_b = var4;
          return var4;
        }
        do {
          if (this.field_d >= this.field_e.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var3 = this.field_e.field_e[fieldTemp$0].next;
        } while (this.field_e.field_e[this.field_d - 1] == var3);
        this.field_b = var3;
        this.field_c = var3.next;
        return var3;
    }

    private final void a(int param0) {
        this.field_c = this.field_e.field_e[0].next;
        this.field_b = null;
        this.field_d = param0;
    }

    NodeHashTableIterator(IterableNodeHashTable param0) {
        this.field_b = null;
        try {
          this.field_e = param0;
          this.a(1);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ga.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
