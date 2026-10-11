/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb {
    int field_w;
    static cn field_C;
    int field_i;
    int field_K;
    static cn field_o;
    static String field_O;
    static cn field_v;
    int field_r;
    int field_u;
    private long[] field_c;
    private int[] field_n;
    int[] field_J;
    ai[] field_L;
    int field_l;
    private int[] field_M;
    wm field_k;
    static String field_E;
    boolean field_H;
    int field_b;
    int field_g;
    int field_e;
    int field_q;
    int field_h;
    int field_B;
    int field_N;
    int[] field_F;
    private int[] field_G;
    long[] field_t;
    int field_m;
    int field_p;
    static String[] field_d;
    static String field_x;
    int field_D;
    int field_A;
    int field_I;
    private long[] field_j;
    hb[] field_a;
    int field_f;
    int field_y;
    int field_z;
    int field_s;

    final static void a(boolean param0) {
        int var1_int = 0;
        hb var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = DungeonAssault.field_K;
        try {
          if (!param0) {
            return;
          }
          for (var1_int = 0; 8 > var1_int; var1_int++) {
            var2 = um.field_i[var1_int];
            if (var2 != null) {
              var2.field_i = qe.a(var2, 0);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "lb.B(" + param0 + ')');
        }
    }

    private final void a(ec param0, int param1, int param2) {
        ai dupTemp$0 = null;
        boolean stackIn_4_1 = false;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_93_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var5Lifetime4;
        int var5Lifetime5;
        int var5Lifetime6;
        int var5Lifetime7;
        var7 = DungeonAssault.field_K;
        try {
          var4_int = param0.c(true);
          stackIn_4_1 = ((var4_int & 1) != 0);
          this.field_H = stackIn_4_1;
          if (param2 < 19) {
            this.field_N = param0.f(-121);
          } else {
            this.field_N = param0.h(-46);
          }
          if (param2 < 1) {
            param0.f(-127);
            this.field_s = param0.f(-106);
            this.field_m = this.field_N;
            this.field_l = this.field_N;
            this.field_b = 0;
          } else {
            if (param2 >= 19) {
              this.field_l = param0.h(param1 ^ 13077);
              this.field_s = param0.h(-107);
              this.field_m = param0.h(-35);
            } else {
              this.field_l = param0.f(-128);
              this.field_s = param0.f(-98);
              if (param2 < 5) {
                this.field_m = this.field_N;
              } else {
                this.field_m = param0.f(-114);
              }
            }
            this.field_b = -this.field_N + this.field_l;
          }
          if (param2 >= 6) {
            param0.h(-78);
            this.field_q = param0.h(param1 + 13099);
          } else {
            this.field_q = -1;
          }
          if (param2 >= 8) {
            this.field_K = param0.c(true);
          } else {
            this.field_K = 0;
          }
          this.field_B = param0.f(-122);
          this.field_h = param0.f(-119);
          this.field_D = param0.k(0);
          this.field_y = param0.f(param1 + 13077);
          this.field_r = param0.f(-121);
          this.field_I = param0.k(0);
          if (param2 < 2) {
            this.field_w = ek.field_c;
          } else {
            this.field_w = rm.a(param0, 6065);
          }
          if (param2 >= 4) {
            param0.c(true);
          }
          for (var5 = 0; var5 < this.field_k.field_f.length; var5++) {
            this.field_k.field_f[var5] = param0.h(md.b(param1, 13096));
          }
          this.field_L = new ai[49];
          this.field_L[24] = new ai(2);
          dupTemp$0 = new ai(3);
          this.field_L[48] = dupTemp$0;
          this.field_L[42] = dupTemp$0;
          this.field_L[6] = dupTemp$0;
          this.field_L[0] = dupTemp$0;
          for (var5Lifetime1 = 0; var5Lifetime1 < 49; var5Lifetime1++) {
            if (var5Lifetime1 != 0 &&
              var5Lifetime1 != 6 &&
              var5Lifetime1 != 24 &&
              var5Lifetime1 != 42 &&
              var5Lifetime1 != 48) {
              this.field_L[var5Lifetime1] = gk.a(param0, (byte) -36);
            }
          }
          this.field_a = new hb[8];
          for (var5Lifetime2 = 0; 8 > var5Lifetime2; var5Lifetime2++) {
            this.field_a[var5Lifetime2] = ai.a(param0, var5Lifetime2, -12, param2);
          }
          this.field_F = new int[6];
          this.field_e = 0;
          if (param1 != -13182) {
            return;
          }
          this.field_J = new int[6];
          if (13 > param2) {
            for (var5Lifetime3 = 0; var5Lifetime3 < 6; var5Lifetime3++) {
              this.field_J[var5Lifetime3] = 0;
            }
            for (var5Lifetime3 = 0; var5Lifetime3 < 6; var5Lifetime3++) {
              this.field_F[var5Lifetime3] = 0;
            }
            this.field_f = 0;
            this.field_z = 0;
            this.field_A = -1;
          } else {
            for (var5Lifetime3 = 0; var5Lifetime3 < 6; var5Lifetime3++) {
              this.field_J[var5Lifetime3] = param0.k(0);
            }
            for (var5Lifetime3 = 0; var5Lifetime3 < 6; var5Lifetime3++) {
              var6 = param0.c(true);
              this.field_F[var5Lifetime3] = var6;
              this.field_e = this.field_e + var6;
            }
            this.field_f = param0.k(param1 + 13182);
            this.field_A = param0.h(-75);
            this.field_z = param0.c(true);
          }
          for (var5Lifetime4 = 0; 10 > var5Lifetime4; var5Lifetime4++) {
            this.field_c[var5Lifetime4] = param0.c((byte) 56);
            if (param2 >= 10) {
              this.field_G[var5Lifetime4] = param0.e((byte) 114);
            } else {
              this.field_G[var5Lifetime4] = 0;
            }
          }
          for (var5Lifetime5 = 0; var5Lifetime5 < 10; var5Lifetime5++) {
            this.field_t[var5Lifetime5] = param0.c((byte) 113);
            if (param2 < 10) {
              this.field_n[var5Lifetime5] = 0;
            } else {
              this.field_n[var5Lifetime5] = param0.e((byte) -87);
            }
          }
          for (var5Lifetime6 = 0; var5Lifetime6 < 10; var5Lifetime6++) {
            if (this.field_c[var5Lifetime6] == 0L) {
              this.field_c[var5Lifetime6] = -1L;
              this.field_G[var5Lifetime6] = 0;
            }
            if (0L == this.field_t[var5Lifetime6]) {
              this.field_t[var5Lifetime6] = -1L;
              this.field_n[var5Lifetime6] = 0;
            }
          }
          if (param2 < 14) {
            for (var5Lifetime7 = 0; 10 > var5Lifetime7; var5Lifetime7++) {
              this.field_j[var5Lifetime7] = -1L;
              this.field_M[var5Lifetime7] = -1;
            }
          } else {
            for (var5Lifetime7 = 0; var5Lifetime7 < 10; var5Lifetime7++) {
              this.field_j[var5Lifetime7] = param0.c((byte) 63);
              if (param2 >= 15) {
                this.field_M[var5Lifetime7] = param0.h(-74);
              } else {
                this.field_M[var5Lifetime7] = -1;
              }
            }
          }
          if (param2 >= 18) {
            this.field_u = param0.c(true);
            param0.k(0);
            this.field_g = param0.h(-125);
            this.field_i = param0.h(-76);
            this.field_p = param0.h(param1 ^ 13114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_92_0 = var4;
          stackIn_92_1 = new StringBuilder().append("lb.D(");
          if (param0 == null) {
            stackIn_93_2 = "null";
          } else {
            stackIn_93_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_92_0), ((StringBuilder) (Object) stackIn_92_1).append(stackIn_93_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_E = null;
        field_C = null;
        field_O = null;
        field_x = null;
        field_o = null;
        field_d = null;
        if (param0 <= 3) {
          lb.a((byte) 82);
        }
        field_v = null;
    }

    final static void a(se param0, se param1, int param2, int param3) {
        try {
          wa.field_l = param2;
          i.field_x = param0;
          n.field_c = param1;
          wm.a((byte) -52, gf.field_i / 2, gf.field_c / param3);
          mi.a(param0.field_N, 25570, param0.field_E + param0.field_N, param1.field_N, param1.field_N + param1.field_E);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lb.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    lb(ec param0, int param1) {
        this();
        try {
          this.a(param0, -13182, param1);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static char a(char param0, int param1) {
        if (param0 != 181 &&
          402 != param0) {
          if (param1 < 44) {
            lb.a('ﾞ', 95);
          }
          return Character.toTitleCase(param0);
        }
        return param0;
    }

    lb() {
        int var1;
        long[] var2;
        int var3;
        int var1Lifetime1;
        int var1Lifetime2;
        this.field_n = new int[10];
        this.field_M = new int[10];
        this.field_G = new int[10];
        this.field_p = -1;
        this.field_t = new long[10];
        this.field_c = new long[10];
        this.field_j = new long[10];
        this.field_w = ek.field_c;
        this.field_b = 0;
        this.field_m = 2500;
        this.field_q = -1;
        this.field_l = 2500;
        this.field_s = 2500;
        this.field_N = 2500;
        this.field_k = new wm(84);
        this.field_a = new hb[8];
        this.field_L = new ai[49];
        for (var1 = 0; var1 < 49; var1++) {
          if (var1 != 24) {
            if (var1 != 0 &&
              6 != var1 &&
              var1 != 42 &&
              var1 != 48) {
              this.field_L[var1] = new ai(0);
            } else {
              this.field_L[var1] = new ai(3);
            }
          } else {
            this.field_L[var1] = new ai(2);
          }
        }
        this.field_J = new int[6];
        this.field_F = new int[6];
        this.field_A = -1;
        for (var1Lifetime1 = 0; var1Lifetime1 < 10; var1Lifetime1++) {
          var2 = this.field_c;
          var3 = var1Lifetime1;
          this.field_t[var1Lifetime1] = -1L;
          var2[var3] = -1L;
        }
        for (var1Lifetime2 = 0; var1Lifetime2 < 10; var1Lifetime2++) {
          this.field_j[var1Lifetime2] = -1L;
          this.field_M[var1Lifetime2] = -1;
        }
        this.field_u = 0;
    }

    static {
        field_O = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_E = "Previous";
        field_d = new String[]{null, "When a raider enters a room containing a monster, it will fight to the death. As the raider and monster exchange blows, the <%attack> of one is compared to the <%defence> of the other to see if the strike breaks through the other's guard."};
        field_x = "Regenerate when raider leaves.";
    }
}
