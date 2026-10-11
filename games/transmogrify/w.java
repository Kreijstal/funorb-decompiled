/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class w implements Iterator {
    private wf field_d;
    static int field_f;
    static String field_a;
    private wf field_e;
    private int field_c;
    private vi field_b;

    public final Object next() {
        int fieldTemp$0 = 0;
        wf var1;
        int var2;
        var2 = Transmogrify.field_A ? 1 : 0;
        if (this.field_b.field_d[this.field_c - 1] != this.field_d) {
          var1 = this.field_d;
          this.field_e = var1;
          this.field_d = var1.field_b;
          return var1;
        }
        do {
          if (this.field_b.field_c <= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var1 = this.field_b.field_d[fieldTemp$0].field_b;
        } while (this.field_b.field_d[-1 + this.field_c] == var1);
        this.field_d = var1.field_b;
        this.field_e = var1;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$0 = 0;
        int var2;
        var2 = Transmogrify.field_A ? 1 : 0;
        if (this.field_b.field_d[-1 + this.field_c] != this.field_d) {
          return true;
        }
        while (this.field_b.field_c > this.field_c) {
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          if (this.field_b.field_d[fieldTemp$0].field_b != this.field_b.field_d[-1 + this.field_c]) {
            this.field_d = this.field_b.field_d[-1 + this.field_c].field_b;
            return true;
          }
          this.field_d = this.field_b.field_d[this.field_c - 1];
        }
        return false;
    }

    private final void a(byte param0) {
        this.field_c = 1;
        if (param0 != -75) {
          return;
        }
        this.field_d = this.field_b.field_d[0].field_b;
        this.field_e = null;
    }

    final static sj a(j param0, int param1, nf param2, byte param3, char param4) {
        sj stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        sj var5 = null;
        RuntimeException var5_ref = null;
        sj var6 = null;
        nf var7 = null;
        try {
          if (param3 <= 24) {
            var7 = (nf) null;
            w.a((j) null, -111, (nf) null, (byte) -120, '￬');
          }
          var5 = (sj) (ab.field_c.c(-126));
          if (var5 == null) {
            var5 = new sj();
          }
          ch.field_e.a(var5, -112);
          var5.field_i = param4;
          var5.field_n = param2;
          var5.field_v = param2.field_p[param4 & 255];
          var6 = var5;
          var5.field_l = 0;
          var5.field_p = param0.field_c;
          var5.field_g = param0.field_d + 32 * param1;
          var5.field_q = param0.field_c;
          var6.field_h = 0;
          var5.field_k = param0;
          var5.field_o = param0;
          var5.field_j = param1 * 32 + param0.field_d;
          var5.field_s = param1;
          var5.field_t = param1;
          stackIn_6_0 = var5;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_9_0 = var5_ref;
          stackIn_9_1 = new StringBuilder().append("w.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void remove() {
        if (null == this.field_e) {
          throw new IllegalStateException();
        }
        this.field_e.c(5);
        this.field_e = null;
    }

    final static sj a(byte param0, boolean param1) {
        Object var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var5Lifetime1;
        var6 = Transmogrify.field_A ? 1 : 0;
        if (param1) {
          field_a = (String) null;
        }
        var2 = null;
        var3 = -1;
        var4 = -1;
        for (var5 = 0; 12 > var5; var5++) {
          if (null != wk.field_a.field_e[var5] &&
            wk.field_a.field_e[var5].field_i == param0) {
            if (var4 < wk.field_a.field_e[var5].field_l) {
              var3 = var5;
              var2 = wk.field_a;
              var4 = wk.field_a.field_e[var5].field_l;
            }
            if (wk.field_a.field_e[var5].field_x) {
              var3 = var5;
              var4 = 2147483647;
              var2 = wk.field_a;
            }
          }
        }
        var7 = 0;
        var5Lifetime1 = var7;
        while (var7 < 8) {
          if (si.field_i.field_e[var7] != null &&
            param0 == si.field_i.field_e[var7].field_i) {
            if (si.field_i.field_e[var7].field_l > var4) {
              var3 = var7;
              var2 = si.field_i;
              var4 = si.field_i.field_e[var7].field_l;
            }
            if (si.field_i.field_e[var7].field_x) {
              var3 = var7;
              var4 = 2147483647;
              var2 = si.field_i;
            }
          }
          var7++;
        }
        if (var2 != null) {
          return ((j) (var2)).field_e[var3];
        }
        return null;
    }

    final static boolean a(int param0, hj param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_f = -99;
          }
          stackIn_5_0 = (param1.k(1, 1522829539) == 1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("w.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_a = null;
        if (param0 > -84) {
          field_a = (String) null;
        }
    }

    w(vi param0) {
        this.field_e = null;
        try {
          this.field_b = param0;
          this.a((byte) -75);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "w.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
