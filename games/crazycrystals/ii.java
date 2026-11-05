/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ii implements Iterator {
    private int field_d;
    private ug field_c;
    private jb field_b;
    static String field_e;
    private jb field_a;

    public final void remove() {
        if (null == this.field_a) {
          throw new IllegalStateException();
        }
        this.field_a.a(false);
        this.field_a = null;
    }

    private final void a(byte param0) {
        if (param0 == -112) {
          this.field_a = null;
          this.field_b = this.field_c.field_c[0].field_b;
          this.field_d = 1;
          return;
        }
        ii.a(-107);
        this.field_a = null;
        this.field_b = this.field_c.field_c[0].field_b;
        this.field_d = 1;
    }

    public static void a(int param0) {
        if (param0 > -53) {
          return;
        }
        field_e = null;
    }

    final static void a(int[] param0, fq param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 48 * param1.field_m / param1.field_p;
          var4 = param1.field_o * var3_int + 48 * param1.field_A + 24;
          if (vh.field_a) {
            var4 = tm.field_d[0].length * 24;
          }
          var5 = 24 + param1.field_t * 48 + var3_int * param1.field_s;
          if (var4 < param0[0]) {
            param0[0] = var4;
          }
          if (param2 < 116) {
            return;
          }
          if (var5 < param0[2]) {
            param0[2] = var5;
          }
          if (param0[1] < var4) {
            param0[1] = var4;
          }
          if (param0[3] >= var5) {
            return;
          }
          param0[3] = var5;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("ii.C(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
        }
    }

    ii(ug param0) {
        this.field_a = null;
        try {
          this.field_c = param0;
          this.a((byte) -112);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ii.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = CrazyCrystals.field_B;
        if (this.field_b != this.field_c.field_c[this.field_d - 1]) {
          return true;
        }
        while (this.field_d < this.field_c.field_e) {
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          if (this.field_c.field_c[fieldTemp$0].field_b != this.field_c.field_c[this.field_d - 1]) {
            this.field_b = this.field_c.field_c[this.field_d - 1].field_b;
            return true;
          }
          this.field_b = this.field_c.field_c[-1 + this.field_d];
        }
        return false;
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        jb var1;
        int var2;
        var2 = CrazyCrystals.field_B;
        if (this.field_b != this.field_c.field_c[-1 + this.field_d]) {
          var1 = this.field_b;
          this.field_a = var1;
          this.field_b = var1.field_b;
          return var1;
        }
        do {
          if (this.field_d >= this.field_c.field_e) {
            return null;
          }
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d + 1;
          var1 = this.field_c.field_c[fieldTemp$0].field_b;
        } while (var1 == this.field_c.field_c[-1 + this.field_d]);
        this.field_b = var1.field_b;
        this.field_a = var1;
        return var1;
    }

    static {
        field_e = "Rock";
    }
}
