/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rk extends bw {
    int[] field_m;
    Random field_p;
    eaa field_h;
    wca field_o;
    int field_q;
    private int[] field_j;
    String field_n;
    private int field_l;
    int[] field_k;
    int field_f;
    static String field_r;
    boolean[] field_g;
    int field_i;

    final boolean a(int param0, int param1) {
        int var4 = 0;
        int[] var3;
        int var5;
        int var6;
        int[] var7;
        var6 = BachelorFridge.field_y;
        if (param1 != 9) {
          this.field_f = -95;
        }
        var7 = this.field_m;
        var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
          var5 = var7[var4];
          if (-1 != var5 &&
            param0 == this.field_o.field_g.field_b[var5]) {
            return true;
          }
        }
        return false;
    }

    final boolean a(int param0, int param1, int[] param2) {
        int var5 = 0;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BachelorFridge.field_y;
        try {
          var8 = param2;
          var4 = var8;
          for (var5 = param1; var8.length > var5; var5++) {
            var6 = var8[var5];
            if (var6 != -1 &&
              this.field_o.field_g.field_b[var6] == param0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("rk.EB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1) {
        int var4 = BachelorFridge.field_y;
        ho var3 = (ho) (this.field_h.b((byte) 90));
        while (var3 != null) {
          if (~param1 == ~var3.field_i) {
            return true;
          }
          var3 = (ho) (this.field_h.c(0));
        }
        if (param0 != 8) {
          this.field_p = (Random) null;
        }
        return false;
    }

    final void a(byte param0, int param1) {
        int var4 = 0;
        int var3;
        int var5;
        var5 = BachelorFridge.field_y;
        if (0 < param1) {
          return;
        }
        var3 = 88 / ((-81 - param0) / 38);
        for (var4 = 0; this.field_m.length > var4; var4++) {
          if (this.field_m[var4] >= 6) {
            this.field_m[var4] = -1;
          }
        }
    }

    final int c(int param0, int param1) {
        t var3;
        if (param0 != 87) {
          this.field_g = (boolean[]) null;
        }
        var3 = (t) (al.a(-104, param1));
        if (var3.field_p != 4) {
          return var3.field_t;
        }
        if (this.a(36, param0 - 78)) {
          return ((a) (al.a(87, 36))).field_r;
        }
        if (this.a(35, 9)) {
          return ((a) (al.a(param0 ^ 12, 35))).field_r;
        }
        if (!this.a(34, 9)) {
          return var3.field_t;
        }
        return ((a) (al.a(-42, 34))).field_r;
    }

    void a(byte param0, lu param1) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ho var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        oha var7 = null;
        int var8 = 0;
        int var5Lifetime1;
        var6 = BachelorFridge.field_y;
        try {
          param1.d(this.field_o.field_b, 0);
          param1.e((int)this.field_c, -1615464796);
          param1.d(0, 0);
          var3 = (ho) (this.field_h.b((byte) 90));
          if (param0 >= -21) {
            var7 = (oha) null;
            this.a((oha) null, -19);
          }
          param1.d(this.field_h.g(0), 0);
          while (var3 != null) {
            param1.d(var3.field_h.field_b, 0);
            param1.d(var3.field_i, 0);
            var3 = (ho) (this.field_h.c(0));
          }
          var4 = 1;
          for (var5 = 0; var5 < 13; var5++) {
            if (this.field_g[var5]) {
              var4 = var4 | 1 << var5 + 1;
            }
          }
          param1.c(-1607631824, var4);
          var8 = 0;
          var5Lifetime1 = var8;
          while (var8 < 5) {
            param1.b(this.field_m[var8], -124);
            var8++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("rk.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final double a(oha param0, int param1) {
        t var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        double stackIn_2_0 = 0.0;
        int stackIn_8_0 = 0;
        double stackIn_9_0 = 0.0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_a != 1) {
            stackIn_2_0 = 1.0;
            return stackIn_2_0;
          }
          if (param1 != -5313) {
            rk.c((byte) 75);
          }
          var3 = (t) (param0);
          stackIn_8_0 = (var3.c(27863)) ? 3 : 2;
          var4 = stackIn_8_0;
          stackIn_9_0 = it.field_c[this.field_k[var4]] / 100.0;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("rk.RA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static pp a(int param0, lu param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        rla stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = qi.a(param1, (byte) 104);
          if (param0 != 1) {
            field_r = (String) null;
          }
          var3 = param1.b(16711935);
          stackIn_3_0 = new rla(var2, var3);
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("rk.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    rk(rk param0) {
        this(param0.field_o);
        int discarded$0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        ho var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var5 = 0;
        int var3Lifetime1;
        try {
          this.field_n = param0.field_n;
          this.field_q = param0.field_q;
          this.field_h = new eaa();
          var2 = (ho) (param0.field_h.b((byte) 90));
          while (var2 != null) {
            this.field_h.a(var2.c((byte) 68), true);
            this.field_g[var2.field_i * 3 - 2] = true;
            var2 = (ho) (param0.field_h.c(0));
          }
          bl.a(param0.field_g, 0, this.field_g, 0, this.field_g.length);
          this.field_j = new int[param0.field_j.length];
          for (var3 = 0; this.field_j.length > var3; var3++) {
            this.field_j[var3] = param0.field_j[var3];
          }
          this.field_m = new int[5];
          var5 = 0;
          var3Lifetime1 = var5;
          while (var5 < this.field_m.length) {
            this.field_m[var5] = param0.field_m[var5];
            var5++;
          }
          if (this.a(84, 0, this.field_m)) {
            this.field_k[0] = this.field_k[0] + 1;
          }
          if (this.a(85, 0, this.field_m)) {
            this.field_k[1] = this.field_k[1] + 1;
          }
          if (this.a(86, 0, this.field_m)) {
            this.field_k[2] = this.field_k[2] + 1;
          }
          if (this.a(87, 0, this.field_m)) {
            this.field_k[3] = this.field_k[3] + 1;
          }
          discarded$0 = this.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("rk.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    public final int hashCode() {
        int var1 = 1;
        var1 = 31 * var1 + this.field_q;
        var1 = 31 * var1 + (this.field_o != null ? this.field_o.hashCode() : 0);
        return var1;
    }

    private final void d(byte param0) {
        if (param0 >= -87) {
          oha var3 = (oha) null;
          this.a((oha) null, -23);
        }
        this.field_n = this.field_o.field_h;
    }

    final void a(lu param0, boolean param1) {
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        int var4Lifetime1;
        var7 = BachelorFridge.field_y;
        try {
          this.field_c = (long)param0.f(-50);
          param0.field_g = param0.field_g + 1;
          var3_int = param0.b(16711935);
          this.field_h = new eaa();
          for (var4 = 0; var4 < var3_int; var4++) {
            this.field_h.a(new ho(fw.field_h[param0.b(16711935)], param0.b(16711935)), true);
          }
          var4Lifetime1 = param0.a(3);
          this.field_j = new int[rfa.a(param1, var4Lifetime1) + 1];
          this.field_j[1] = this.field_o.field_g.field_b[1];
          this.field_j[0] = this.field_o.field_g.field_b[0];
          var5 = 2;
          for (var6 = 0; var6 < 13; var6++) {
            stackIn_8_0 = this.field_g;
            stackIn_8_1 = var6;
            stackIn_9_2 = (dda.a(var4Lifetime1, 1 << 1 + var6) == 1 << var6 + 1);
            stackIn_8_0[stackIn_8_1] = stackIn_9_2;
            if (this.field_g[var6]) {
              this.field_j[var5] = this.field_o.field_g.field_b[2 + var6];
              var5++;
            }
          }
          this.field_m = new int[5];
          for (var6Lifetime1 = 0; var6Lifetime1 < 5; var6Lifetime1++) {
            this.field_m[var6Lifetime1] = param0.c((byte) -85);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("rk.QA(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final lna e(byte param0) {
        int var6 = BachelorFridge.field_y;
        int[] var9 = new int[5];
        int[] var8 = var9;
        int[] var7 = var8;
        int[] var2 = var7;
        bl.a(var9, 0, 5, this.field_o.field_b);
        int[] var3 = ug.field_l[this.field_h.g(0)];
        if (param0 >= -8) {
          field_r = (String) null;
        }
        ho var4 = (ho) (this.field_h.b((byte) 90));
        int var5 = 1;
        while (var4 != null) {
          var7[var5] = var4.field_h.field_b;
          var5++;
          var4 = (ho) (this.field_h.c(0));
        }
        return new lna(var7[var3[0]], var7[var3[1]], var7[var3[2]], var7[var3[3]], var7[var3[4]], var7[var3[5]], var7[var3[6]], var7[var3[7]], var7[var3[8]], var7[var3[9]], var7[var3[10]]);
    }

    final boolean a(byte param0, pd param1, int param2) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int var5Lifetime1;
        var9 = BachelorFridge.field_y;
        try {
          var4_int = 1 + this.field_o.a(73, param1, this.field_g);
          var5 = 0;
          if (var4_int != 0) {
            if (var4_int > 1 &&
              param2 <= 0) {
              return false;
            }
            if (var4_int == 3 &&
              this.field_h.g(0) < 1) {
              return false;
            }
            if (var4_int == 4 &&
              this.field_h.g(0) < 2) {
              return false;
            }
            this.field_g[-2 + 3 * var4_int] = true;
            this.field_h.a(new ho(param1, var4_int), true);
            var5Lifetime1 = 3 * var4_int;
            this.field_i = var5Lifetime1;
          } else {
            var5Lifetime1 = this.field_o.a(param1, 0, this.field_g);
            if (var5Lifetime1 == -1) {
              return false;
            }
            this.field_g[var5Lifetime1] = true;
            this.field_i = 2 + var5Lifetime1;
          }
          var11 = new int[1 + this.field_j.length];
          var10 = var11;
          var6 = var10;
          var7 = 0;
          var8 = -81 % ((-25 - param0) / 62);
          while (var7 < this.field_j.length) {
            var6[var7] = this.field_j[var7];
            var7++;
          }
          var6[var11.length - 1] = this.field_o.field_g.field_b[var5Lifetime1 + 2];
          this.field_j = var6;
          this.field_f = param1.field_b;
          uca.a(35, (byte) -106);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_30_0 = var4;
          stackIn_30_1 = new StringBuilder().append("rk.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_r = null;
        if (param0 <= 92) {
          field_r = (String) null;
        }
    }

    final int d(int param0, int param1) {
        t var3;
        if (param0 <= 122) {
          this.field_j = (int[]) null;
        }
        var3 = (t) (al.a(114, param1));
        if (var3.field_p != 4) {
          return var3.field_r;
        }
        if (this.a(53, 9)) {
          return ((a) (al.a(-82, 53))).field_q;
        }
        return var3.field_r;
    }

    private final int a(int param0) {
        this.field_l = param0;
        return this.field_l;
    }

    public final boolean equals(Object param0) {
        rk var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == this) {
            return true;
          }
          if (param0 == null) {
            return false;
          }
          if (this.getClass() != param0.getClass()) {
            return false;
          }
          var2 = (rk) (param0);
          if (var2.field_q != this.field_q) {
            return false;
          }
          if (this.field_o == null) {
            if (var2.field_o != null) {
              return false;
            }
          } else {
            if (!this.field_o.equals(var2.field_o)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("rk.equals(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    rk(wca param0) {
        int discarded$0 = 0;
        this.field_q = 1;
        this.field_j = new int[2];
        this.field_h = new eaa();
        this.field_g = new boolean[13];
        this.field_f = -1;
        try {
          this.field_o = param0;
          if (null == this.field_o) {
            throw new RuntimeException("You're not supposed to be able to breed random creatures any more!");
          }
          this.d((byte) -107);
          this.field_k = new int[4];
          bl.a(this.field_o.field_l, 0, this.field_k, 0, 4);
          this.field_p = new Random();
          this.field_j[1] = this.field_o.field_g.field_b[1];
          this.field_m = new int[5];
          this.field_j[0] = this.field_o.field_g.field_b[0];
          bl.a(this.field_m, 0, this.field_m.length, -1);
          this.field_m[0] = 0;
          this.field_m[1] = 1;
          discarded$0 = this.a(0);
          this.field_c = (long)kla.a(2147483647, this.field_p, -2147483648);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Reject <%0> from this game";
    }
}
