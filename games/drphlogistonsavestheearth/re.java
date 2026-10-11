/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class re implements Iterator {
    static String field_j;
    static he field_d;
    private gi field_a;
    private gi field_f;
    static he[] field_h;
    static int field_g;
    static he[] field_i;
    static int field_e;
    private tc field_b;
    static String field_c;
    private int field_k;

    private final void a(int param0) {
        int var2 = -6 / ((-2 - param0) / 38);
        this.field_f = null;
        this.field_k = 1;
        this.field_a = this.field_b.field_h[0].field_e;
    }

    public static void b(int param0) {
        if (param0 != 967) {
          return;
        }
        field_j = null;
        field_h = null;
        field_i = null;
        field_c = null;
        field_d = null;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_b.field_h[this.field_k - 1] != this.field_a) {
          return true;
        }
        while (this.field_b.field_c > this.field_k) {
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          if (this.field_b.field_h[fieldTemp$0].field_e != this.field_b.field_h[-1 + this.field_k]) {
            this.field_a = this.field_b.field_h[-1 + this.field_k].field_e;
            return true;
          }
          this.field_a = this.field_b.field_h[-1 + this.field_k];
        }
        return false;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        int var2;
        gi var3;
        gi var4;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_b.field_h[-1 + this.field_k] != this.field_a) {
          var4 = this.field_a;
          this.field_f = var4;
          this.field_a = var4.field_e;
          return var4;
        }
        do {
          if (this.field_b.field_c <= this.field_k) {
            return null;
          }
          fieldTemp$0 = this.field_k;
          this.field_k = this.field_k + 1;
          var3 = this.field_b.field_h[fieldTemp$0].field_e;
        } while (this.field_b.field_h[this.field_k - 1] == var3);
        this.field_f = var3;
        this.field_a = var3.field_e;
        return var3;
    }

    final static void a(boolean param0) {
        cf.a((byte) -107);
        sg.field_a = param0 ? true : false;
        pj.field_F = true;
        ng.field_c.j(300);
        nc.a(field_c, false, (byte) 79);
    }

    public final void remove() {
        if (null == this.field_f) {
          throw new IllegalStateException();
        }
        this.field_f.a(-16175);
        this.field_f = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 121) {
            re.a(true);
          }
          stackIn_3_0 = o.field_l.a("", param0, 24874);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("re.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    re(tc param0) {
        this.field_f = null;
        try {
          this.field_b = param0;
          this.a(-116);
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "re.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_j = "Mouse over an icon for details";
        field_c = "Connection lost - attempting to reconnect";
    }
}
