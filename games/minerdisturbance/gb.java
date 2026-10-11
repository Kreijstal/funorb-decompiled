/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb implements Iterator {
    static int field_e;
    static ea field_a;
    private sd field_f;
    private pi field_c;
    private int field_b;
    private pi field_d;

    public final boolean hasNext() {
        pi[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        int var2;
        var2 = MinerDisturbance.field_ab;
        if (this.field_f.field_b[this.field_b - 1] != this.field_d) {
          return true;
        }
        while (true) {
          if (this.field_b >= this.field_f.field_f) {
            return false;
          }
          fieldTemp$0 = this.field_f.field_b;
          fieldTemp$1 = this.field_b;
          this.field_b = this.field_b + 1;
          if (fieldTemp$0[fieldTemp$1].field_f == this.field_f.field_b[-1 + this.field_b]) {
            this.field_d = this.field_f.field_b[-1 + this.field_b];
            continue;
          }
          break;
        }
        this.field_d = this.field_f.field_b[this.field_b - 1].field_f;
        return true;
    }

    final static void b(int param0) {
        sa var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        sa var1Lifetime1;
        var2 = MinerDisturbance.field_ab;
        try {
          mj.field_o.e();
          im.field_b.e();
          sa.field_s = sa.field_s - 1;
          if (sa.field_s == 0) {
            sa.field_s = 200;
            var1 = (sa) (hj.field_b.b(114));
            while (var1 != null) {
              if (!var1.field_p.c(121)) {
                var1.b(param0 + 6163);
              }
              var1 = (sa) (hj.field_b.b((byte) 56));
            }
            if (null != m.field_c) {
              var1Lifetime1 = (sa) (m.field_c.b(114));
              while (var1Lifetime1 != null) {
                if (!var1Lifetime1.field_p.c(122)) {
                  var1Lifetime1.b(34);
                }
                var1Lifetime1 = (sa) (m.field_c.b((byte) 56));
              }
            }
          }
          if (param0 != -6129) {
            return;
          }
          if (null != km.field_a) {
            if (km.field_a.b((byte) -114)) {
              return;
            }
            de.field_b = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1_ref), "gb.D(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 <= -77) {
          return;
        }
        gb.b(92);
    }

    public final Object next() {
        pi[] fieldTemp$0 = null;
        int fieldTemp$1 = 0;
        pi var1;
        int var2;
        var2 = MinerDisturbance.field_ab;
        if (this.field_d != this.field_f.field_b[this.field_b - 1]) {
          var1 = this.field_d;
          this.field_c = var1;
          this.field_d = var1.field_f;
          return var1;
        }
        do {
          if (this.field_f.field_f <= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_f.field_b;
          fieldTemp$1 = this.field_b;
          this.field_b = this.field_b + 1;
          var1 = fieldTemp$0[fieldTemp$1].field_f;
        } while (this.field_f.field_b[this.field_b - 1] == var1);
        this.field_d = var1.field_f;
        this.field_c = var1;
        return var1;
    }

    private final void c(int param0) {
        this.field_c = null;
        if (param0 > 113) {
          this.field_d = this.field_f.field_b[0].field_f;
          this.field_b = 1;
          return;
        }
        this.field_c = (pi) null;
        this.field_d = this.field_f.field_b[0].field_f;
        this.field_b = 1;
    }

    final static void a(int param0, String param1) {
        lh.a(-18473, param1);
        if (param0 > -110) {
          return;
        }
        try {
          t.a(false, rf.field_a, 0);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gb(sd param0) {
        this.field_c = null;
        try {
          this.field_f = param0;
          this.c(123);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void remove() {
        if (null == this.field_c) {
          throw new IllegalStateException();
        }
        this.field_c.b(34);
        this.field_c = null;
    }

    static {
        field_e = 0;
    }
}
