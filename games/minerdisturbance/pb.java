/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb {
    int[] field_o;
    int[] field_k;
    short field_I;
    short[] field_P;
    short[] field_M;
    short[] field_d;
    int field_h;
    int field_H;
    short[] field_C;
    short[] field_F;
    short[] field_f;
    int[] field_S;
    short[] field_u;
    short[] field_a;
    int field_v;
    short[] field_Q;
    short[] field_G;
    short[] field_B;
    int[] field_b;
    short[] field_w;
    private boolean field_t;
    int[] field_p;
    int field_j;
    int[] field_N;
    short[] field_O;
    short field_g;
    byte[] field_x;
    short[] field_q;
    short[] field_s;
    int[] field_D;
    short[] field_e;
    byte field_E;
    int[] field_L;
    short[] field_n;
    int[] field_m;
    static String field_z;
    short field_y;
    int field_J;
    int field_l;
    static String field_A;
    static ae field_c;
    short[] field_i;
    static int field_K;
    static String[][] field_R;
    static bj field_r;

    private final void b(int param0) {
        if (param0 != 0) {
          this.field_v = -28;
        }
        this.field_t = false;
    }

    final static void d(int param0) {
        jg.a(qf.field_r, km.field_b, -115, true);
        int var1 = 108 / ((param0 + 30) / 55);
        oh.field_F = true;
    }

    final static int b(boolean param0) {
        if (!fh.field_d &&
          ld.field_w <= hk.field_e &&
          qn.field_K + ld.field_w > hk.field_e) {
          return se.field_K;
        }
        if (param0) {
          field_A = (String) null;
        }
        return -1;
    }

    final static ln a(String param0, bj param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ln stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -77) {
            field_c = (ae) null;
          }
          var4_int = param1.a(param3 ^ -52, param0);
          var5 = param1.a(param2, var4_int, -76);
          stackIn_3_0 = ac.a(23917, param1, var4_int, var5);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("pb.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0) {
        int var8 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var9;
        int var10;
        int var11;
        int var12;
        boolean stackIn_5_1 = false;
        var12 = MinerDisturbance.field_ab;
        if (this.field_t) {
          return;
        }
        stackIn_5_1 = (param0);
        this.field_t = stackIn_5_1;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        for (var8 = 0; this.field_y > var8; var8++) {
          var9 = this.field_n[var8];
          var10 = this.field_M[var8];
          if (var10 > var6) {
            var6 = var10;
          }
          var11 = this.field_Q[var8];
          if (var9 > var5) {
            var5 = var9;
          }
          if (var10 < var3) {
            var3 = var10;
          }
          if (var2 > var9) {
            var2 = var9;
          }
          if (var11 < var4) {
            var4 = var11;
          }
          if (var7 < var11) {
            var7 = var11;
          }
        }
        this.field_H = var2;
        this.field_j = var4;
        this.field_J = var7;
        this.field_v = var5;
        this.field_h = var3;
        this.field_l = var6;
    }

    final static void a(int param0) {
        mb.field_b.n(21974);
        if (bd.field_e == null) {
          bd.field_e = new jl(mb.field_b, ic.field_i);
        }
        int var1 = 67 / ((-18 - param0) / 56);
        mb.field_b.b(1, bd.field_e);
    }

    public static void c(int param0) {
        field_R = (String[][]) null;
        field_r = null;
        field_A = null;
        int var1 = -81 / ((30 - param0) / 39);
        field_z = null;
        field_c = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = MinerDisturbance.field_ab;
        for (var5 = param2; var5 < this.field_y; var5++) {
          this.field_n[var5] = (short)(this.field_n[var5] + param3);
          this.field_M[var5] = (short)(this.field_M[var5] + param1);
          this.field_Q[var5] = (short)(this.field_Q[var5] + param0);
        }
        this.b(0);
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 0;
        int var7 = MinerDisturbance.field_ab;
        if (param4 != -81) {
          this.a(21, -115, 39, 65);
        }
        for (var6 = 0; var6 < this.field_y; var6++) {
          this.field_n[var6] = (short)(this.field_n[var6] * param1 / param0);
          this.field_M[var6] = (short)(this.field_M[var6] * param3 / param0);
          this.field_Q[var6] = (short)(this.field_Q[var6] * param2 / param0);
        }
        this.b(param4 ^ -81);
    }

    pb() {
        this.field_t = false;
        this.field_E = (byte) 0;
    }

    static {
        field_A = "You have <%0> unread messages!";
        field_z = "Tragically Molten";
        field_c = new ae();
        field_R = new String[][]{new String[]{"You have planted an explosive. It will detonate in 5 seconds. Conventional wisdom would be to put a healthy distance between you and it. Remember, it will ignite any gas, too!"}};
    }
}
