/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static String[] field_d;
    int field_e;
    private IntrusiveNode field_b;
    static bm field_c;
    IntrusiveNode[] field_a;

    final void a(long param0, byte param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        if (param2.next != null) {
          param2.f(0);
        }
        if (param1 < 7) {
          return;
        }
        try {
          var5 = this.field_a[(int)((long)(this.field_e - 1) & param0)];
          param2.next = var5.next;
          param2.previous = var5;
          param2.next.previous = param2;
          param2.previous.next = param2;
          param2.key = param0;
        } catch (RuntimeException runtimeException) {
          throw rb.a((Throwable) ((Object) runtimeException), "vl.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(long param0, int param1) {
        IntrusiveNode var4;
        int var5;
        IntrusiveNode var6;
        int var7;
        var7 = Torquing.field_u;
        var4 = this.field_a[(int)((long)(this.field_e - 1) & param0)];
        this.field_b = var4.previous;
        var5 = -94 % ((24 - param1) / 41);
        while (true) {
          if (this.field_b == var4) {
            this.field_b = null;
            return null;
          }
          if (this.field_b.key != param0) {
            this.field_b = this.field_b.previous;
            continue;
          }
          break;
        }
        var6 = this.field_b;
        this.field_b = this.field_b.previous;
        return var6;
    }

    public static void a(byte param0) {
        if (param0 != 93) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    static {
        field_d = new String[255];
        field_c = null;
    }
}
