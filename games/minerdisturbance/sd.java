/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sd implements Iterable {
    private pi field_h;
    static int[] field_g;
    int field_f;
    static String field_e;
    static ed field_d;
    pi[] field_b;
    static int[] field_c;
    static ta field_a;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_g = null;
        field_c = null;
        if (param0 == -1) {
          field_a = null;
          return;
        }
        field_a = (ta) null;
        field_a = null;
    }

    final void a(long param0, boolean param1, pi param2) {
        if (null != param2.field_c) {
          param2.b(34);
        }
        pi var5 = this.field_b[(int)(param0 & (long)(this.field_f - 1))];
        if (!param1) {
          return;
        }
        try {
          param2.field_c = var5.field_c;
          param2.field_f = var5;
          param2.field_c.field_f = param2;
          param2.field_d = param0;
          param2.field_f.field_c = param2;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final pi a(int param0, long param1) {
        pi var5 = null;
        int var6 = MinerDisturbance.field_ab;
        pi var4 = this.field_b[(int)((long)(-1 + this.field_f) & param1)];
        this.field_h = var4.field_f;
        while (this.field_h != var4) {
          if (~param1 == ~this.field_h.field_d) {
            var5 = this.field_h;
            this.field_h = this.field_h.field_f;
            return var5;
          }
          this.field_h = this.field_h.field_f;
        }
        this.field_h = null;
        if (param0 >= -53) {
          return (pi) null;
        }
        return null;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new gb(this));
    }

    private sd() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "Start Game";
        field_c = new int[25];
        field_g = new int[8192];
        field_a = new ta();
    }
}
