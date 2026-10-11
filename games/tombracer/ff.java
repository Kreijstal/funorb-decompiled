/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ff implements dv {
    int field_k;
    dt[] field_G;
    int field_E;
    hca[] field_H;
    wd[] field_y;
    private int field_r;
    private mt field_d;
    static String field_N;
    int field_L;
    int field_K;
    private int field_O;
    int field_A;
    sma field_e;
    String[] field_l;
    int field_C;
    BitSet[] field_x;
    private int field_o;
    int field_b;
    boolean[] field_I;
    int[] field_v;
    kqa field_c;
    boolean field_h;
    ds field_D;
    private String[] field_J;
    static jpa[] field_j;
    int[] field_g;
    private boolean field_s;
    int field_P;
    long[] field_F;
    private int field_f;
    cfa field_i;
    private boolean[] field_n;
    private boolean[] field_q;
    static int field_w;
    private int field_B;
    int field_z;
    private wea[] field_u;
    private boolean field_M;
    private int field_m;
    private int field_a;
    static iu field_p;
    int field_t;

    final void a(int param0, int param1, int param2, int param3, int param4) {
        la var6 = this.field_G[param1].a(true, param0);
        if (var6 == null) {
          throw new IllegalStateException("Could not resync player to room: " + param1 + ", " + param0);
        }
        this.field_G[param1].field_c = param3;
        var6.a((byte) 88, param4);
        var6.i((byte) -65);
        if (param2 != 1) {
          this.field_k = 37;
        }
    }

    final void b(boolean param0, int param1, int param2) {
        this.field_s = false;
        dt var4 = this.field_G[param2];
        if (!param0) {
          return;
        }
        var4.m(9262).a(var4, param1, 104);
        if (!var4.k(-19271)) {
          this.n(121, param2);
        }
    }

    final int i(int param0) {
        if (param0 != 0) {
          this.a(68, (byte) -44);
        }
        return this.field_r;
    }

    final boolean b(int param0, int param1) {
        if (param1 != 0) {
          this.field_n = (boolean[]) null;
        }
        return this.field_n[param0];
    }

    private final void c(int param0) {
        this.c((byte) -89);
        if (param0 != 22640) {
          this.c(96);
        }
    }

    public static void f(int param0) {
        field_N = null;
        field_p = null;
        if (param0 != 0) {
          ff.h(88);
        }
        field_j = null;
    }

    final boolean a(boolean param0, int param1, int param2) {
        hca var4 = this.field_H[param1];
        if (param0) {
          return false;
        }
        la var5 = var4.f((byte) -85);
        if (var5 == null) {
          return true;
        }
        int var6 = var5.c(74);
        if (param2 != var6 &&
          param2 != var6 + 1) {
          return true;
        }
        return false;
    }

    final void a(boolean param0, la param1) {
        int var4 = 0;
        int var3_int = 0;
        la var5 = null;
        int var6 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          if (param1.o((byte) -82)) {
            return;
          }
          var3_int = param1.c(91);
          for (var4 = 0; var4 < this.field_G.length; var4++) {
            if (this.field_G[var4] != null) {
              var5 = this.field_G[var4].a(param0, var3_int);
              if (var5 != null) {
                param1.a(var5, (byte) 126);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ff.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void k(int param0, int param1) {
        this.field_o = param0;
        this.field_D.a(this.field_o, false);
        this.field_D.a((byte) 74);
        if (~this.field_o <= param1) {
          this.field_v[this.field_o] = this.field_v[this.field_o] + 1;
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 <= 62) {
            this.d(-118);
          }
          for (var3_int = 0; this.field_H.length > var3_int; var3_int++) {
            if (faa.a(param0, 109, this.field_l[var3_int])) {
              stackIn_8_0 = var3_int;
              return stackIn_8_0;
            }
          }
          stackIn_11_0 = -2;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ff.PA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean k(int param0) {
        if (param0 != -25319) {
          this.field_s = true;
        }
        return this.field_K == 2 ? true : false;
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 54) {
          this.field_n = (boolean[]) null;
        }
        var2 = -1;
        var3 = -1;
        for (var4 = 0; var4 < this.field_H.length; var4++) {
          var5 = this.field_v[var4];
          if (-1 == var3 ||
            var5 > var2) {
            var2 = var5;
            var3 = var4;
          }
        }
        if (var2 < this.field_L) {
          return -1;
        }
        return var3;
    }

    final void h(int param0, int param1) {
        int var3 = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 45) {
          return;
        }
        for (var3 = 0; this.field_H.length > var3; var3++) {
          this.field_G[var3].d(119, param0);
        }
    }

    final la a(int param0, int param1) {
        if (param0 != 0) {
          this.field_A = -127;
        }
        return this.field_H[param1].f((byte) 106);
    }

    final void d(byte param0, int param1) {
        if (!this.f((byte) -107, param1)) {
          if (this.l(13, param1)) {
            return;
          }
          this.field_m = this.field_m | 1 << param1;
          this.n(38, param1);
          int var3 = 27 / ((51 - param0) / 43);
          this.field_P = this.field_P - 1;
          return;
        }
    }

    private final void n(int param0, int param1) {
        this.field_q[param1] = true;
        if (param0 < 29) {
          this.a(-104, 79, -8, 3, -72);
        }
    }

    public final void a(kh param0, boolean param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_h = uha.a(5907, param0);
          this.field_z = uma.a(32, param0, -26803);
          this.field_A = param0.b((byte) 44, 32);
          this.field_C = param0.b((byte) 44, 32);
          this.field_y = (wd[]) (gha.a(this.field_y, 1, 8, -16499, nfa.field_q, param0));
          this.field_u = (wea[]) (gha.a(this.field_u, 1, 8, -16499, kba.field_u, param0));
          this.field_v = fa.a(0, param0, 8, this.field_v);
          this.field_o = uma.a(32, param0, -26803);
          this.field_q = c.a(8, this.field_q, (byte) 93, param0);
          this.field_P = param0.b((byte) 44, 32);
          this.field_s = uha.a(5907, param0);
          if (!uha.a(5907, param0)) {
            this.field_i = null;
          } else {
            if (null == this.field_i) {
              this.field_i = new cfa();
            }
            this.field_i.a(param0, false);
          }
          this.field_E = uma.a(32, param0, -26803);
          this.field_I = c.a(8, this.field_I, (byte) -41, param0);
          if (param1) {
            return;
          }
          this.c(22640);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ff.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void d(int param0, int param1) {
        if (msa.field_a == param1) {
          if (null == rba.field_a) {
            return;
          }
          if (param0 != 0) {
            return;
          }
          aoa.a(108, 13);
          aoa.a(84, 14);
          aoa.a(43, 15);
          return;
        }
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        for (var2 = param0; var2 < this.field_H.length; var2++) {
          if (!this.field_q[var2]) {
            return false;
          }
        }
        return true;
    }

    final String e(int param0, int param1) {
        if (param1 != 23807) {
          return (String) null;
        }
        if (param0 < 0) {
          return dpa.field_c;
        }
        return this.field_J[param0];
    }

    final boolean j(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -1878) {
          this.i(-41, -61);
        }
        stackIn_6_0 = (this.field_k == 1) && (this.field_K != 2);
        return stackIn_6_0;
    }

    final boolean e(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 >= -56) {
          this.c((byte) 52);
        }
        stackIn_6_0 = (!this.f((byte) -102, param1)) && (this.field_G[param1].e(-31170));
        return stackIn_6_0;
    }

    final static boolean h(int param0) {
        if (param0 != 1) {
          field_w = 88;
        }
        return du.field_e;
    }

    final void a(byte param0) {
        if (this.field_z < 0) {
          this.field_A = this.field_A + 1;
          this.field_C = this.field_A + (this.field_f + 1);
          this.field_D.a((byte) 108);
          this.c((byte) -89);
        }
        int var2 = -128 % ((80 - param0) / 37);
        this.field_o = -1;
        this.field_s = true;
    }

    final boolean g(int param0, int param1) {
        if (param0 < 68) {
          return false;
        }
        return (1 << param1 & this.field_t) > 0 ? true : false;
    }

    final boolean g(int param0) {
        if (param0 != 0) {
          this.k(37);
        }
        return this.field_s;
    }

    final dda a(boolean param0, int param1) {
        if (!param0) {
          return (dda) null;
        }
        return this.field_G[param1].m(9262).a(104);
    }

    final void m(int param0, int param1) {
        if (!this.f((byte) -82, param1)) {
          if (this.l(13, param1)) {
            return;
          }
          this.field_B = this.field_B | param0 << param1;
          this.n(40, param1);
          this.field_P = this.field_P - 1;
          return;
        }
    }

    final boolean a(int param0) {
        int var3 = 0;
        wd var5 = null;
        int var6 = TombRacer.field_G ? 1 : 0;
        wd[] var7 = this.field_y;
        wd[] var2 = var7;
        int var4 = -71 % ((param0 + 68) / 44);
        for (var3 = 0; var3 < var7.length; var3++) {
          var5 = var7[var3];
          if (var5.b(56) == -1) {
            return false;
          }
        }
        return true;
    }

    final void a(int param0, byte param1) {
        this.field_z = param0;
        this.field_h = true;
        if (param1 <= 100) {
          this.field_C = 80;
        }
    }

    final int i(int param0, int param1) {
        if (param0 != 1) {
          this.a(21, (byte) 42);
        }
        return this.field_H[param1].f((byte) 87).c(-79);
    }

    final boolean l(int param0, int param1) {
        if (param0 != 13) {
          this.field_C = -75;
        }
        return (1 << param1 & this.field_m) > 0 ? true : false;
    }

    private final void a(byte param0, int param1) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        int var4 = 16 % ((54 - param0) / 35);
        tu var7 = this.field_d.a(this, -25077);
        tu var3 = var7;
        this.field_G[param1] = new dt(var7, this.field_H[param1], this.field_O, this.field_a);
        for (var5 = 0; this.field_G[param1].l(-106) > var5; var5++) {
          this.field_G[param1].a(-28088, var5, this.field_u[this.field_A].a(1024, var5, this.field_C, this.field_G[param1]));
        }
    }

    final boolean b(byte param0, int param1) {
        boolean stackIn_6_0 = false;
        if (param0 != 90) {
          this.field_m = 124;
        }
        stackIn_6_0 = (!this.f((byte) -91, param1)) && (this.field_G[param1].b(param0 - 90));
        return stackIn_6_0;
    }

    final boolean f(byte param0, int param1) {
        if (param0 > -73) {
          this.field_O = 117;
        }
        return (1 << param1 & this.field_B) > 0 ? true : false;
    }

    final boolean a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        var3 = 0;
        if (!param1) {
          field_w = -127;
        }
        while (this.field_k > var3) {
          if (var3 != param0 &&
            !this.f((byte) -122, var3)) {
            return false;
          }
          var3++;
        }
        return true;
    }

    final String c(int param0, int param1) {
        if (param1 > param0) {
          return dpa.field_c;
        }
        return this.field_l[param0];
    }

    final int j(int param0, int param1) {
        if (param0 != 0) {
          this.field_a = 20;
        }
        return dna.b(this.field_G[param1].a(true), 255);
    }

    final dt f(int param0, int param1) {
        if (param0 < param1) {
          return null;
        }
        return this.field_G[param0];
    }

    final void a(byte param0, pi param1) {
        dt var3 = null;
        try {
          if (param0 <= 14) {
            this.b((byte) -115);
          }
          var3 = this.field_G[param1.a(3)];
          var3.m(9262).a(var3, param1, false);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ff.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int c(byte param0, int param1) {
        if (param0 != 115) {
          this.e(-62, 55);
        }
        return this.field_G[param1].field_c;
    }

    final boolean d(int param0) {
        if (param0 > -61) {
          this.field_z = -104;
        }
        return this.field_M;
    }

    final void c(byte param0) {
        int var2;
        la var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        var4 = TombRacer.field_G ? 1 : 0;
        for (var2 = 0; var2 < this.field_G.length; var2++) {
          this.field_H[var2].t((byte) 126);
          this.a((byte) -36, var2);
        }
        for (var2Lifetime1 = 0; var2Lifetime1 < this.field_G.length; var2Lifetime1++) {
          var3 = this.field_G[var2Lifetime1].a(-88);
          if (var3 != null) {
            var3.i((byte) -89);
          }
        }
        this.field_c.a(false);
        var2Lifetime2 = 0;
        if (param0 != -89) {
          return;
        }
        while (var2Lifetime2 < this.field_q.length) {
          this.field_q[var2Lifetime2] = this.f((byte) -81, var2Lifetime2);
          var2Lifetime2++;
        }
        if (0 == this.field_K) {
          this.field_i = new cfa(this);
          this.field_i.b(param0 + 28713);
          this.field_E = 0;
        }
    }

    final int e(int param0) {
        if (param0 != 2) {
          return 69;
        }
        return this.field_o;
    }

    final boolean d(byte param0) {
        boolean stackIn_7_0 = false;
        if (param0 < 57) {
          return true;
        }
        stackIn_7_0 = (this.field_K == 0) || (this.field_K == 2);
        return stackIn_7_0;
    }

    ff(String[] param0, int param1, int param2, int param3, int param4, int param5, int param6, BitSet[] param7, boolean[] param8, mt param9, ou param10) {
        int var13 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var12_intLifetime1;
        int var12_intLifetime2;
        int var12_intLifetime3;
        this.field_s = true;
        this.field_z = -1;
        this.field_E = -1;
        try {
          this.field_L = param4;
          this.field_d = param9;
          this.field_l = param0;
          this.field_K = param5;
          if (param10 != null) {
            if (this.field_K != 0) {
              var12_int = 1;
            } else {
              var12_int = this.field_l.length * (-1 + param4) + 1;
            }
            this.field_u = new wea[var12_int];
            for (var13 = 0; var13 < var12_int; var13++) {
              this.field_u[var13] = param10.a((byte) 58);
            }
          }
          this.field_J = new String[this.field_l.length];
          for (var12_intLifetime1 = 0; var12_intLifetime1 < this.field_l.length; var12_intLifetime1++) {
            this.field_J[var12_intLifetime1] = "<col=" + jm.field_k[var12_intLifetime1] + ">" + this.field_l[var12_intLifetime1] + "</col>";
          }
          this.field_k = param0.length;
          this.field_a = param3;
          this.field_O = param2;
          this.field_n = param8;
          this.field_f = param1;
          this.field_x = param7;
          this.field_C = this.field_f;
          this.field_P = this.field_k;
          this.field_v = new int[this.field_P];
          this.field_H = new hca[this.field_P];
          this.field_y = new wd[this.field_P];
          for (var12_intLifetime2 = 0; this.field_H.length > var12_intLifetime2; var12_intLifetime2++) {
            this.field_H[var12_intLifetime2] = new hca(var12_intLifetime2);
            this.field_y[var12_intLifetime2] = new wd(this.field_H[var12_intLifetime2]);
          }
          var12_intLifetime3 = this.field_K;
          if (var12_intLifetime3 == 0) {
            this.field_r = -1;
          } else {
            if (var12_intLifetime3 == 1) {
              this.field_r = param6;
            } else {
              if (3 == var12_intLifetime3) {
                this.field_r = pl.a((byte) 64);
              } else {
                if (2 == var12_intLifetime3) {
                  this.field_r = -1;
                }
              }
            }
          }
          this.field_G = new dt[this.field_k];
          this.field_q = new boolean[this.field_H.length];
          this.field_o = -1;
          this.field_c = new kqa(this);
          this.field_e = new sma(this);
          if (this.field_K == 0) {
            this.field_i = new cfa(this);
            this.field_i.b(28624);
            this.field_E = 0;
          }
          this.field_D = new ds(this.field_k);
          this.field_g = new int[this.field_k];
          this.field_F = new long[this.field_k];
          this.field_I = new boolean[this.field_k];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_29_0 = var12;
          stackIn_29_1 = new StringBuilder().append("ff.<init>(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param8 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param9 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param10 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    static {
        field_N = "Options";
        field_w = 256;
    }
}
