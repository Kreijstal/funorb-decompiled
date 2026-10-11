/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ov implements Iterator {
    static String field_a;
    private ht field_d;
    private gn field_g;
    static String field_c;
    private int field_f;
    static int field_b;
    private gn field_e;

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Kickabout.field_G;
        if (this.field_d.field_e[-1 + this.field_f] != this.field_e) {
          return true;
        }
        while (this.field_d.field_d > this.field_f) {
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          if (this.field_d.field_e[fieldTemp$0].field_d != this.field_d.field_e[-1 + this.field_f]) {
            this.field_e = this.field_d.field_e[-1 + this.field_f].field_d;
            return true;
          }
          this.field_e = this.field_d.field_e[this.field_f - 1];
        }
        return false;
    }

    final static void a(tf param0, int param1) {
        Object var2 = null;
        gn var2_ref = null;
        gn var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref2 = null;
        var4 = Kickabout.field_G;
        try {
          if (param1 != 0) {
            field_b = -112;
          }
          while (!jo.a(param0, false)) {
            var2_ref = param0.g(24009);
            while (var2_ref instanceof ak) {
              if (!(var2_ref.field_d instanceof ak)) {
                break;
              }
              var3 = var2_ref.field_d;
              if (((ak) (var2_ref)).a((byte) 120) < ((ak) (var3)).a((byte) -73)) {
                var2_ref.c((byte) -109);
                pa.a(var2_ref, var3, (byte) 127);
              }
              var2_ref = var3;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          stackIn_14_0 = var2_ref2;
          stackIn_14_1 = new StringBuilder().append("ov.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
          ov.a(-70, -86, -1);
          field_a = null;
          field_c = null;
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        ml var2 = or.field_d;
        int var3 = -31 / ((param0 - 40) / 56);
        var2.b(param1, (byte) 120);
        var2.a(106, 1);
        var2.a(119, 0);
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        gn var1;
        int var2;
        var2 = Kickabout.field_G;
        if (this.field_d.field_e[this.field_f - 1] != this.field_e) {
          var1 = this.field_e;
          this.field_e = var1.field_d;
          this.field_g = var1;
          return var1;
        }
        do {
          if (this.field_d.field_d <= this.field_f) {
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var1 = this.field_d.field_e[fieldTemp$0].field_d;
        } while (var1 == this.field_d.field_e[this.field_f - 1]);
        this.field_e = var1.field_d;
        this.field_g = var1;
        return var1;
    }

    public final void remove() {
        if (this.field_g == null) {
          throw new IllegalStateException();
        }
        this.field_g.c((byte) -109);
        this.field_g = null;
    }

    private final void b(int param0) {
        this.field_e = this.field_d.field_e[param0].field_d;
        this.field_f = 1;
        this.field_g = null;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (~cc.field_e == param1) {
          hq.b((byte) 124);
          return true;
        }
        if (cc.field_e == 102) {
          dr.field_g.a(5075);
          return true;
        }
        if (null == dr.field_g) {
          return false;
        }
        if (dr.field_g.a(param0, param2, (byte) -101)) {
          return true;
        }
        return false;
    }

    ov(ht param0) {
        this.field_g = null;
        try {
          this.field_d = param0;
          this.b(0);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ov.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = 0;
        field_c = "Spend EXP";
    }
}
