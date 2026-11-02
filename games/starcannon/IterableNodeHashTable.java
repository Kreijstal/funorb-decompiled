/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    int field_c;
    static long field_d;
    private IntrusiveNode field_e;
    static java.applet.Applet field_b;
    IntrusiveNode[] field_a;

    final IntrusiveNode a(long param0, int param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = StarCannon.field_A;
        var4 = this.field_a[(int)(param0 & (long)(this.field_c - param1))];
        this.field_e = var4.next;
        while (true) {
          if (var4 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (~param0 != ~this.field_e.key) {
            this.field_e = this.field_e.next;
            continue;
          }
          break;
        }
        var5 = this.field_e;
        this.field_e = this.field_e.next;
        return var5;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          IterableNodeHashTable.a(44);
        }
    }

    final static int a(int param0, int param1) {
        int var3 = 0;
        int var2 = 0;
        int var3Lifetime1;
        if ((param1 & 7) != 0) {
          var2 = 8 - (7 & param1);
        }
        if (param0 == 23201) {
          var3 = var2 + param1;
          return var3;
        }
        IterableNodeHashTable.a(-51, -124);
        var3Lifetime1 = var2 + param1;
        return var3Lifetime1;
    }

    final void a(long param0, int param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink(4);
          }
          var5 = this.field_a[(int)(param0 & (long)(param1 + this.field_c))];
          param2.next = var5;
          param2.previous = var5.previous;
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ek.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0) {
        if (param0 >= -44) {
          return true;
        }
        return !qa.field_a.b(false) ? true : false;
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    static {
    }
}
