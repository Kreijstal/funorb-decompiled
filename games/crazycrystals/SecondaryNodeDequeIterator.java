/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode nextNode;
    private SecondaryNodeDeque deque;
    static int field_b;
    static String[] field_c;
    private DualLinkNode lastReturned;

    public final boolean hasNext() {
        return this.nextNode != this.deque.sentinel;
    }

    public static void a(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          SecondaryNodeDequeIterator.a((String) null, true, (String) null, false);
          field_c = null;
          return;
        }
        field_c = null;
    }

    public final void remove() {
        if (this.lastReturned == null) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(1);
        this.lastReturned = null;
    }

    final static void a(String param0, boolean param1, String param2, boolean param3) {
        try {
          jd.field_G = param0;
          ig.field_p = param2;
          ke.a(AccountNameAvailabilityValidator.field_i, param1, -13);
          if (param3) {
            String var5 = (String) null;
            SecondaryNodeDequeIterator.a((String) null, true, (String) null, true);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wk.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final Object next() {
        Object var1 = this.nextNode;
        if (var1 != this.deque.sentinel) {
          this.nextNode = ((DualLinkNode) (var1)).field_j;
        } else {
          var1 = null;
          this.nextNode = null;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    SecondaryNodeDequeIterator(SecondaryNodeDeque param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.nextNode = this.deque.sentinel.field_j;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{"idle", "", "", "", "walk", "", "", "", "cross_arms", "tap_foot", null, "wave", "push_rock_up", "punch_ball", null, "sticky_feet", "prod_spider_playertile", null, "prod_spider_spidertile", null, "death_crushed", "death_blown_up", "death_got_by_spider"};
    }
}
