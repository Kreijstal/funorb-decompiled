/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n extends gn implements dm {
    private sh field_S;
    static int field_M;
    static fj[] field_L;
    static boolean field_P;
    static ah field_N;
    static int field_O;
    private String[] field_V;
    static hj field_U;
    private ae[] field_T;
    static String field_R;
    static boolean field_Q;

    final static String a(boolean param0, String param1, String param2, String param3) {
        int var5 = TetraLink.field_J;
        int var4 = param3.indexOf(param1);
        while (-1 != var4) {
          param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param1.length());
          var4 = param3.indexOf(param1, var4 + param2.length());
        }
        if (!param0) {
          fj var6 = (fj) null;
          n.a((byte) -53, (fj) null);
        }
        return param3;
    }

    n(sh param0) {
        super(0, 0, 0, 0, (kg) null);
        try {
          this.field_S = param0;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_U = null;
        if (param0 <= 69) {
          fj var2 = (fj) null;
          n.a((byte) 120, (fj) null);
        }
        field_R = null;
        field_L = null;
        field_N = null;
    }

    public final void a(byte param0, ae param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TetraLink.field_J;
        try {
          if (param0 >= 0) {
            field_L = (fj[]) null;
          }
          for (var6_int = 0; var6_int < this.field_V.length; var6_int++) {
            if (param1 == this.field_T[var6_int]) {
              this.field_S.a(-118, this.field_V[var6_int]);
            }
          }
          if (this.field_T[this.field_V.length] == param1) {
            this.field_S.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("n.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (0 != param3) {
          return;
        }
        jb var5 = od.field_S;
        if (null != this.field_V) {
          var5.a(pg.field_c, param1 + this.field_t, param2 + this.field_w, this.field_F, 20, 16777215, -1, 0, 0, var5.field_K + var5.field_N);
        }
    }

    final void a(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        q var4 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          this.field_J.b(1);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_V = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_V[var4_int] = p.a((CharSequence) ((Object) param1[var4_int]), (byte) 43).replace(' ', ' ');
            }
            var4 = new q(od.field_S, param0, 1);
            this.field_T = new ae[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_T[var5] = new ae(this.field_V[var5], (dn) (this));
              this.field_T[var5].field_H = (kg) ((Object) var4);
              this.field_T[var5].field_C = rn.field_a;
              this.field_T[var5].a(15, 16 * var5 + 20, 80, 0, 80);
              this.c(this.field_T[var5], 10);
            }
            this.field_T[var3_int] = new ae(qc.field_ab, (dn) (this));
            this.field_T[var3_int].field_H = (kg) ((Object) var4);
            this.field_T[var3_int].a(15, 16 + var3_int * 16 + 20, param0 + 73, 0, 100);
            this.c(this.field_T[var3_int], 10);
            return;
          }
          this.field_V = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("n.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.d(param3, 54);
            return stackIn_5_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.b(param3, 108);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("n.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(byte param0, fj param1) {
        String stackIn_2_0;
        int stackIn_2_1;
        String stackIn_2_2;
        int stackIn_2_3;
        Object stackIn_2_4;
        Object stackIn_2_5;
        long stackIn_2_6;
        hl stackIn_2_7;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        pf var5 = null;
        String var6 = null;
        pf var7 = null;
        String var8 = null;
        pf var9 = null;
        String var10 = null;
        pf var11 = null;
        String var12 = null;
        pf var13 = null;
        try {
          stackIn_2_0 = param1.field_n;
          stackIn_2_1 = 255;
          stackIn_2_2 = param1.field_e;
          stackIn_2_3 = param1.field_i;
          stackIn_2_4 = null;
          stackIn_2_5 = null;
          stackIn_2_6 = param1.field_r;
          stackIn_2_7 = param1.field_f;
          if (param1.field_i == 1) {
            stackIn_3_8 = param1.field_j;
          } else {
            stackIn_3_8 = 0;
          }
          gd.a(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_2_3, (rb) (stackIn_2_4), (int[]) (stackIn_2_5), stackIn_2_6, stackIn_2_7, stackIn_3_8);
          if (param1.field_i == 0 &&
            !u.a(113) &&
            null == qb.field_N &&
            null == qe.field_a) {
            if (!fn.field_K) {
              var5 = hd.field_s;
              var6 = mn.field_f;
              var5.field_j.a(var6, 1, 14);
            }
            var7 = hd.field_s;
            var8 = bc.field_x;
            var7.field_j.a(var8, 1, 20);
          }
          if (param1.field_i == 1 &&
            !u.a(param0 ^ 0) &&
            null != qb.field_N &&
            param1.field_j == qb.field_N.j(param0 ^ -7)) {
            if (!fn.field_K) {
              var9 = hd.field_s;
              var10 = lc.field_d;
              var9.field_j.a(var10, 1, 14);
            }
            var11 = hd.field_s;
            var12 = bd.field_d;
            var11.field_j.a(var12, param0 ^ 110, 20);
          }
          if (param0 != 111) {
            return;
          }
          hd.field_s.b((byte) 79);
          hd.field_s.a(param0 - 92, false);
          hd.field_s.a(param1.field_i, param1.field_a, true);
          hd.field_s.a(true);
          hd.field_s.a(param1, param0 ^ 99);
          var13 = hd.field_s;
          var3 = ci.field_B;
          var4 = li.field_o;
          var13.field_j.a(0, var4, -73, 0, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("n.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
    }
}
