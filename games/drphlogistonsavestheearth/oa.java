/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oa implements Iterator {
    private uh field_a;
    static String field_c;
    static String field_d;
    private dg field_f;
    static int field_b;
    private uh field_e;

    public final void remove() {
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.f(64);
        this.field_a = null;
    }

    public final Object next() {
        Object var1 = this.field_e;
        if (this.field_f.field_b != var1) {
          this.field_e = ((uh) (var1)).field_p;
        } else {
          this.field_e = null;
          var1 = null;
        }
        this.field_a = (uh) (var1);
        return var1;
    }

    public final boolean hasNext() {
        return this.field_e != this.field_f.field_b;
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
        oa.a((byte) -83, -53, 50, true);
        field_d = null;
        field_c = null;
    }

    oa(dg param0) {
        this.field_a = null;
        try {
          this.field_f = param0;
          this.field_e = this.field_f.field_b.field_p;
          this.field_a = null;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "oa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Account created successfully!";
        field_b = 80;
    }
}
