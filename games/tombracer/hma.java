/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hma implements Iterable {
    static String field_e;
    static int[] field_f;
    static int field_a;
    od field_d;
    private od field_c;
    static jea field_b;

    final od c(int param0) {
        if (param0 > 89) {
          return this.a((byte) 121, (od) null);
        }
        od var3 = (od) null;
        this.a((od) null, -48);
        return this.a((byte) 121, (od) null);
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new rba(this));
    }

    final void a(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        while (this.field_d.field_g != this.field_d) {
          this.field_d.field_g.c(-7975);
        }
        if (param0 == 84) {
          return;
        }
        field_f = (int[]) null;
    }

    public static void b(int param0) {
        field_f = null;
        field_b = null;
        field_e = null;
        if (param0 != 8192) {
          hma.b(101);
        }
    }

    final od b(byte param0) {
        if (param0 <= 44) {
          return (od) null;
        }
        od var2 = this.field_d.field_g;
        if (var2 != this.field_d) {
          var2.c(-7975);
          return var2;
        }
        return null;
    }

    private final od a(byte param0, od param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        od var4 = null;
        Object stackIn_6_0 = null;
        od stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 77 / ((param0 - 2) / 56);
          if (param1 != null) {
            var4 = param1;
          } else {
            var4 = this.field_d.field_g;
          }
          if (var4 == this.field_d) {
            this.field_c = null;
            stackIn_6_0 = null;
            return (od) (stackIn_6_0);
          }
          this.field_c = var4.field_g;
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("hma.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(od param0, int param1) {
        if (param0.field_f != null) {
          param0.c(-7975);
        }
        param0.field_f = this.field_d.field_f;
        param0.field_g = this.field_d;
        param0.field_f.field_g = param0;
        if (param1 != -11396) {
          return;
        }
        try {
          param0.field_g.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hma.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    hma() {
        this.field_d = new od();
        this.field_d.field_g = this.field_d;
        this.field_d.field_f = this.field_d;
    }

    final od a(int param0) {
        od var2 = this.field_c;
        if (var2 == this.field_d) {
          this.field_c = null;
          return null;
        }
        if (param0 < -77) {
          this.field_c = var2.field_g;
          return var2;
        }
        return (od) null;
    }

    static {
        field_f = new int[8192];
        field_e = null;
        field_a = 9;
    }
}
