/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qi implements Iterable {
    static double field_a;
    static cn[] field_f;
    static String field_h;
    static int field_b;
    static pn field_e;
    static cn field_i;
    private IntrusiveNode field_j;
    static String field_c;
    IntrusiveNode[] field_d;
    int field_g;

    public final Iterator iterator() {
        return (Iterator) ((Object) new ho(this));
    }

    final void a(long param0, byte param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        if (param2.next != null) {
          param2.unlink(false);
        }
        if (param1 > -127) {
          return;
        }
        try {
          var5 = this.field_d[(int)(param0 & (long)(-1 + this.field_g))];
          param2.next = var5.next;
          param2.previous = var5;
          param2.next.previous = param2;
          param2.previous.next = param2;
          param2.key = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "qi.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final IntrusiveNode a(int param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        var6 = DungeonAssault.field_K;
        var4 = this.field_d[(int)((long)(this.field_g - param0) & param1)];
        this.field_j = var4.previous;
        while (true) {
          if (this.field_j == var4) {
            this.field_j = null;
            return null;
          }
          if (~this.field_j.key != ~param1) {
            this.field_j = this.field_j.previous;
            continue;
          }
          break;
        }
        var5 = this.field_j;
        this.field_j = this.field_j.previous;
        return var5;
    }

    private qi() throws Throwable {
        throw new Error();
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          return;
        }
        field_e = null;
        field_h = null;
        field_i = null;
        field_f = null;
    }

    static {
        field_a = 0.0;
        field_h = "The <%0> is undamaged!";
        field_c = "Years spent studying the dark arts, in service to the corrupt human nobles of the west, have given the sorceress the knowledge to tame the elements and turn them against her foes.";
    }
}
