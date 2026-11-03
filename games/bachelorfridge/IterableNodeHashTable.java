/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static String field_e;
    static vr field_a;
    static String field_g;
    int field_f;
    private IntrusiveNode field_d;
    static String field_b;
    IntrusiveNode[] field_c;

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final void a(int param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink(false);
          }
          var5 = this.field_c[(int)(param1 & (long)(this.field_f - 1))];
          param2.previous = var5.previous;
          param2.next = var5;
          if (param0 != 0) {
            this.field_f = 63;
          }
          param2.previous.next = param2;
          param2.key = param1;
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "wha.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(long param0, byte param1) {
        IntrusiveNode var5 = null;
        int var6 = BachelorFridge.field_y;
        IntrusiveNode var4 = this.field_c[(int)((long)(-1 + this.field_f) & param0)];
        this.field_d = var4.next;
        while (this.field_d != var4) {
          if (~param0 == ~this.field_d.key) {
            var5 = this.field_d;
            this.field_d = this.field_d.next;
            return var5;
          }
          this.field_d = this.field_d.next;
        }
        this.field_d = null;
        if (param1 <= -100) {
          return null;
        }
        return (IntrusiveNode) null;
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 != -1) {
          IterableNodeHashTable.releaseStatics(-48);
          field_a = null;
          field_e = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_e = null;
        field_b = null;
    }

    IterableNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_c = new IntrusiveNode[param0];
        this.field_f = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_c[var2] = dupTemp$0;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    static {
        field_e = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_g = "Accept unrated rematch";
        field_b = "To Customer Support";
    }
}
