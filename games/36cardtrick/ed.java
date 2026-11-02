/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed implements Iterable {
    private IntrusiveNode field_d;
    static int[] field_e;
    static int field_c;
    int field_a;
    IntrusiveNode[] field_b;

    final void a(int param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink(83);
          }
          var5 = this.field_b[(int)(param1 & (long)(-1 + this.field_a))];
          param2.next = var5;
          param2.previous = var5.previous;
          if (param0 >= -94) {
            this.field_d = (IntrusiveNode) null;
          }
          param2.previous.next = param2;
          param2.next.previous = param2;
          param2.key = param1;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ed.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new il(this));
    }

    final IntrusiveNode a(byte param0, long param1) {
        int var4;
        IntrusiveNode var5;
        IntrusiveNode var6;
        int var7;
        var7 = Main.field_T;
        var4 = -24 / ((21 - param0) / 48);
        var5 = this.field_b[(int)((long)(-1 + this.field_a) & param1)];
        this.field_d = var5.next;
        while (true) {
          if (var5 == this.field_d) {
            this.field_d = null;
            return null;
          }
          if (this.field_d.key != param1) {
            this.field_d = this.field_d.next;
            continue;
          }
          break;
        }
        var6 = this.field_d;
        this.field_d = this.field_d.next;
        return var6;
    }

    private ed() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 3663) {
          field_c = -42;
        }
    }

    static {
        field_e = new int[8192];
    }
}
