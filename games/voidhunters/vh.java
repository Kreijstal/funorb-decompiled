/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vh implements Iterable {
    static llb[] field_c;
    fh field_a;
    private fh field_b;

    final void a(byte param0) {
        int var3 = VoidHunters.field_G;
        while (this.field_a.field_e != this.field_a) {
          this.field_a.field_e.d((byte) -35);
        }
        if (param0 >= 50) {
          return;
        }
        this.a(-59);
    }

    private final fh a(fh param0, int param1) {
        fh var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        fh stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -98) {
            this.iterator();
          }
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_a.field_e;
          }
          if (var3 != this.field_a) {
            this.field_b = var3.field_e;
            stackIn_9_0 = var3;
            return stackIn_9_0;
          }
          this.field_b = null;
          stackIn_7_0 = null;
          return (fh) (stackIn_7_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("vh.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final fh a(boolean param0) {
        if (param0) {
          return (fh) null;
        }
        return this.a((fh) null, -113);
    }

    final void a(int param0, fh param1) {
        if (param0 != -17569) {
          return;
        }
        try {
          if (null != param1.field_d) {
            param1.d((byte) -35);
          }
          param1.field_e = this.field_a;
          param1.field_d = this.field_a.field_d;
          param1.field_d.field_e = param1;
          param1.field_e.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "vh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final fh b(int param0) {
        fh var2 = this.field_b;
        if (param0 != 8063) {
          return (fh) null;
        }
        if (var2 != this.field_a) {
          this.field_b = var2.field_e;
          return var2;
        }
        this.field_b = null;
        return null;
    }

    public static void b(boolean param0) {
        field_c = null;
        if (!param0) {
          vh.b(true);
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new jn(this));
    }

    vh() {
        this.field_a = new fh();
        this.field_a.field_e = this.field_a;
        this.field_a.field_d = this.field_a;
    }

    final fh a(int param0) {
        fh var2 = this.field_a.field_e;
        if (param0 != -7481) {
          this.field_b = (fh) null;
          if (var2 != this.field_a) {
            var2.d((byte) -35);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_a) {
          var2.d((byte) -35);
          return var2;
        }
        return null;
    }

    static {
    }
}
