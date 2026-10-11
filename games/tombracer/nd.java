/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nd implements Iterator {
    private int field_b;
    private vg field_d;
    private vg field_a;
    private sk field_c;

    final static boolean b(byte param0) {
        if (param0 > -88) {
          return true;
        }
        return !gva.field_b.b(52) ? true : false;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = TombRacer.field_G ? 1 : 0;
        if (this.field_c.field_e[-1 + this.field_b] != this.field_a) {
          return true;
        }
        while (true) {
          if (this.field_c.field_g <= this.field_b) {
            return false;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          if (this.field_c.field_e[fieldTemp$0].field_a == this.field_c.field_e[this.field_b - 1]) {
            this.field_a = this.field_c.field_e[-1 + this.field_b];
            continue;
          }
          break;
        }
        this.field_a = this.field_c.field_e[-1 + this.field_b].field_a;
        return true;
    }

    private final void a(boolean param0) {
        this.field_d = null;
        if (param0) {
          this.field_a = this.field_c.field_e[0].field_a;
          this.field_b = 1;
          return;
        }
        this.field_b = -88;
        this.field_a = this.field_c.field_e[0].field_a;
        this.field_b = 1;
    }

    final static void a(byte param0) {
        if (param0 != 55) {
          nd.a((byte) -67);
          gt.a((byte) 46);
          return;
        }
        gt.a((byte) 46);
    }

    final static void a(String param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_4_0 = var2;
          stackIn_4_1 = new StringBuilder().append("nd.B(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void remove() {
        if (this.field_d == null) {
          throw new IllegalStateException();
        }
        this.field_d.p(105);
        this.field_d = null;
    }

    final static void a(int param0, boolean param1) {
        qha.a(0, param1);
        jo.a(true, param1);
        if (param0 != -1) {
          return;
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        vg var3;
        vg var4;
        var2 = TombRacer.field_G ? 1 : 0;
        if (this.field_a != this.field_c.field_e[this.field_b - 1]) {
          var4 = this.field_a;
          this.field_d = var4;
          this.field_a = var4.field_a;
          return var4;
        }
        do {
          if (this.field_b >= this.field_c.field_g) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var3 = this.field_c.field_e[fieldTemp$0].field_a;
        } while (var3 == this.field_c.field_e[-1 + this.field_b]);
        this.field_a = var3.field_a;
        this.field_d = var3;
        return var3;
    }

    nd(sk param0) {
        this.field_d = null;
        try {
          this.field_c = param0;
          this.a(true);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
