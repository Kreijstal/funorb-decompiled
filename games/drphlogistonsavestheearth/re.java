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
        int fieldTemp$1 = 0;
        int var2;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_b.field_h[this.field_k + -1] == this.field_a) {
          L0: while (true) {
            if (this.field_b.field_c > this.field_k) {
              fieldTemp$1 = this.field_k;
              this.field_k = this.field_k + 1;
              if (this.field_b.field_h[fieldTemp$1].field_e != this.field_b.field_h[-1 + this.field_k]) {
                this.field_a = this.field_b.field_h[-1 + this.field_k].field_e;
                return true;
              } else {
                this.field_a = this.field_b.field_h[-1 + this.field_k];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        int var2;
        Object var3;
        gi var3_ref;
        gi var4;
        var2 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (this.field_b.field_h[-1 + this.field_k] == this.field_a) {
          L0: while (true) {
            if (this.field_b.field_c > this.field_k) {
              fieldTemp$1 = this.field_k;
              this.field_k = this.field_k + 1;
              var3_ref = this.field_b.field_h[fieldTemp$1].field_e;
              if (this.field_b.field_h[this.field_k - 1] == var3_ref) {
                continue L0;
              } else {
                this.field_f = var3_ref;
                this.field_a = var3_ref.field_e;
                return var3_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_a;
          this.field_f = var4;
          this.field_a = var4.field_e;
          return var4;
        }
    }

    final static void a(boolean param0) {
        cf.a((byte) -107);
        sg.field_a = param0 ? true : false;
        pj.field_F = true;
        ng.field_c.j(300);
        nc.a(field_c, false, (byte) 79);
    }

    public final void remove() {
        if (!(null != this.field_f)) {
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 121) {
                break L1;
              } else {
                re.a(true);
                break L1;
              }
            }
            stackIn_3_0 = o.field_l.a("", param0, 24874);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("re.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
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
