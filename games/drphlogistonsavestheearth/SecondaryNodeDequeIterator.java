/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeDequeIterator implements Iterator {
    private DualLinkNode lastReturned;
    static String field_c;
    static String field_d;
    private dg deque;
    static int field_b;
    private DualLinkNode nextNode;

    public final void remove() {
        if (null == this.lastReturned) {
          throw new IllegalStateException();
        }
        this.lastReturned.unlinkSecondary(64);
        this.lastReturned = null;
    }

    public final Object next() {
        Object var1 = this.nextNode;
        if (this.deque.field_b != var1) {
          this.nextNode = ((DualLinkNode) (var1)).secondaryNext;
        } else {
          this.nextNode = null;
          var1 = null;
        }
        this.lastReturned = (DualLinkNode) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.nextNode != this.deque.field_b;
    }

    final static boolean a(byte param0, int param1, int param2, boolean param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param3) {
          if (rc.field_i[param1] > rc.field_i[param2]) {
            return true;
          }
          if (rc.field_i[param1] < rc.field_i[param2]) {
            return false;
          }
          if (kf.field_c[param1] > kf.field_c[param2]) {
            return true;
          }
          if (kf.field_c[param1] < kf.field_c[param2]) {
            return false;
          }
          var4 = qj.field_d[param2] + fi.field_h[param2] + kk.field_a[param2];
          var5 = qj.field_d[param1] + (fi.field_h[param1] + kk.field_a[param1]);
          if (var5 > var4) {
            return true;
          }
          if (var4 > var5) {
            return false;
          }
          if (param0 <= 56) {
            return false;
          }
          return !(param2 >= param1);
        }
        if (kf.field_c[param2] < kf.field_c[param1]) {
          return true;
        }
        if (kf.field_c[param1] < kf.field_c[param2]) {
          return false;
        }
        if (rc.field_i[param1] > rc.field_i[param2]) {
          return true;
        }
        if (rc.field_i[param2] > rc.field_i[param1]) {
          return false;
        }
        var4Lifetime1 = qj.field_d[param2] + fi.field_h[param2] + kk.field_a[param2];
        var5Lifetime1 = qj.field_d[param1] + (fi.field_h[param1] + kk.field_a[param1]);
        if (var5Lifetime1 > var4Lifetime1) {
          return true;
        }
        if (var4Lifetime1 > var5Lifetime1) {
          return false;
        }
        if (param0 <= 56) {
          return false;
        }
        if (param2 >= param1) {
          return false;
        }
        return true;
    }

    public static void a(int param0) {
        if (param0 > 70) {
          field_d = null;
          field_c = null;
          return;
        }
        SecondaryNodeDequeIterator.a((byte) -83, -53, 50, true);
        field_d = null;
        field_c = null;
    }

    SecondaryNodeDequeIterator(dg param0) {
        this.lastReturned = null;
        try {
          this.deque = param0;
          this.nextNode = this.deque.field_b.secondaryNext;
          this.lastReturned = null;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Account created successfully!";
        field_b = 80;
    }
}
