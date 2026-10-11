/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    int field_j;
    int[][][] field_e;
    static String[] field_g;
    int field_k;
    int field_b;
    static ut field_m;
    static String field_i;
    boolean field_d;
    int[] field_c;
    int field_o;
    int field_n;
    static String field_a;
    int field_l;
    int field_f;
    int field_h;

    final static void a(int param0, int param1) {
        gn var2 = null;
        int var3 = 0;
        ii var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Kickabout.field_G;
        try {
          var4 = (ii) (il.field_a.g(24009));
          while (var4 != null) {
            te.a(param0, var4, (byte) -112);
            var4 = (ii) (il.field_a.c(33));
          }
          var2 = ap.field_j.g(24009);
          while (var2 != null) {
            lb.a((byte) -105, param0);
            var2 = ap.field_j.c(33);
          }
          if (param1 > -36) {
            field_g = (String[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "kp.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        he var1 = null;
        qb var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        he var1Lifetime1;
        var3 = Kickabout.field_G;
        try {
          var1 = (he) (rp.field_B.g(24009));
          while (var1 != null) {
            if (var1.field_Jb > 0) {
              var1.field_Jb = var1.field_Jb - 1;
              if (var1.field_Jb == 0) {
                var1.field_Mb = 0;
                if (var1.h(-13356)) {
                  var1.c((byte) -109);
                }
              }
            }
            var1 = (he) (rp.field_B.c(33));
          }
          var1_ref = (qb) (kq.field_yb.g(24009));
          while (var1_ref != null) {
            if (0 < var1_ref.field_Db) {
              var1_ref.field_Db = var1_ref.field_Db - 1;
              if (var1_ref.field_Db != 0) {
                var1_ref = (qb) (kq.field_yb.c(33));
                continue;
              }
              var1_ref.field_Ab = 0;
              if (var1_ref.b(-7)) {
                var1_ref.c((byte) -109);
              }
            }
            var1_ref = (qb) (kq.field_yb.c(33));
          }
          var1Lifetime1 = (he) (lw.field_d.g(24009));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Jb > 0) {
              var1Lifetime1.field_Jb = var1Lifetime1.field_Jb - 1;
              if (var1Lifetime1.field_Jb == 0) {
                var1Lifetime1.field_Mb = 0;
                if (var1Lifetime1.h(-13356)) {
                  var1Lifetime1.c((byte) -109);
                }
              }
            }
            var1Lifetime1 = (he) (lw.field_d.c(33));
          }
          var2 = -47 / ((39 - param0) / 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1_ref2), "kp.D(" + param0 + ')');
        }
    }

    final void a(byte param0, ml param1) {
        int var4 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var3_intLifetime1;
        var5 = Kickabout.field_G;
        try {
          if (param0 >= -96) {
            field_i = (String) null;
          }
          this.field_c = new int[2];
          for (var3_int = 0; var3_int < 2; var3_int++) {
            this.field_c[var3_int] = param1.j((byte) -94);
          }
          stackIn_9_1 = (param1.h((byte) -111) == 1);
          this.field_d = stackIn_9_1;
          this.field_f = param1.j((byte) -123);
          this.field_j = param1.h((byte) -126);
          this.field_b = param1.h((byte) -125);
          if (5 == this.field_f) {
            this.field_o = param1.j((byte) -96);
            this.field_k = param1.j((byte) -104);
          }
          if (this.field_f == 4) {
            this.field_h = param1.a((byte) 81) - 1;
            this.field_n = param1.h((byte) -112);
            this.field_l = param1.h((byte) -111);
            for (var3_intLifetime1 = 0; var3_intLifetime1 < 2; var3_intLifetime1++) {
              for (var4 = 0; var4 < 5; var4++) {
                this.field_e[var3_intLifetime1][var4][0] = param1.h((byte) -110);
                this.field_e[var3_intLifetime1][var4][1] = param1.h((byte) -121);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_21_0 = var3;
          stackIn_21_1 = new StringBuilder().append("kp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void a(boolean param0, kp param1) {
        int var9 = 0;
        int var10 = 0;
        int[] dupTemp$0 = null;
        int[] dupTemp$1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var11 = 0;
        int var3_intLifetime1;
        int var3_intLifetime2;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var11 = Kickabout.field_G;
        try {
          this.field_k = param1.field_k;
          this.field_o = param1.field_o;
          this.field_b = param1.field_b;
          this.field_f = param1.field_f;
          this.field_h = param1.field_h;
          this.field_j = param1.field_j;
          this.field_c = new int[param1.field_c.length];
          for (var3_int = 0; this.field_c.length > var3_int; var3_int++) {
            this.field_c[var3_int] = param1.field_c[var3_int];
          }
          this.field_d = param1.field_d;
          var3_intLifetime1 = param1.field_n << 16;
          var4 = param1.field_l << 16;
          var5 = -this.field_n + var3_intLifetime1;
          var6 = -this.field_l + var4;
          var7 = var5 >> 4;
          if (Math.abs(var5 >> 16) >= 50) {
            this.field_n = var3_intLifetime1;
          } else {
            this.field_n = this.field_n + var7;
          }
          var8 = var6 >> 4;
          if (Math.abs(var6 >> 16) >= 50) {
            this.field_l = var4;
          } else {
            this.field_l = this.field_l + var8;
          }
          for (var9 = 0; var9 < 2; var9++) {
            for (var10 = 0; var10 < 5; var10++) {
              var4Lifetime1 = param1.field_e[var9][var10][1] << 16;
              var3_intLifetime2 = param1.field_e[var9][var10][0] << 16;
              var5Lifetime1 = var3_intLifetime2 - this.field_e[var9][var10][0];
              var6Lifetime1 = -this.field_e[var9][var10][1] + var4Lifetime1;
              var8Lifetime1 = var6Lifetime1 >> 4;
              var7Lifetime1 = var5Lifetime1 >> 4;
              if (20 > Math.abs(var5Lifetime1 >> 16)) {
                dupTemp$0 = this.field_e[var9][var10];
                dupTemp$0[0] = dupTemp$0[0] + var7Lifetime1;
              } else {
                this.field_e[var9][var10][0] = var3_intLifetime2;
              }
              if (Math.abs(var6Lifetime1 >> 16) >= 20) {
                this.field_e[var9][var10][1] = var4Lifetime1;
              } else {
                dupTemp$1 = this.field_e[var9][var10];
                dupTemp$1[1] = dupTemp$1[1] + var8Lifetime1;
              }
            }
          }
          if (param0) {
            this.field_e = (int[][][]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("kp.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 != 101) {
          field_m = (ut) null;
        }
        field_a = null;
        field_g = null;
        field_m = null;
        field_i = null;
    }

    final void b(boolean param0, kp param1) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var5 = 0;
        int var3_intLifetime1;
        var5 = Kickabout.field_G;
        try {
          this.field_o = param1.field_o;
          this.field_k = param1.field_k;
          this.field_h = param1.field_h;
          this.field_f = param1.field_f;
          this.field_c = new int[param1.field_c.length];
          for (var3_int = 0; this.field_c.length > var3_int; var3_int++) {
            this.field_c[var3_int] = param1.field_c[var3_int];
          }
          this.field_l = param1.field_l << 16;
          this.field_n = param1.field_n << 16;
          this.field_d = param1.field_d;
          for (var3_intLifetime1 = 0; 2 > var3_intLifetime1; var3_intLifetime1++) {
            for (var4 = 0; var4 < 5; var4++) {
              this.field_e[var3_intLifetime1][var4][0] = param1.field_e[var3_intLifetime1][var4][0] << 16;
              this.field_e[var3_intLifetime1][var4][1] = param1.field_e[var3_intLifetime1][var4][1] << 16;
            }
          }
          this.field_b = param1.field_b;
          if (param0) {
            return;
          }
          this.field_j = param1.field_j;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("kp.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public kp() {
        this.field_e = new int[2][5][2];
        this.field_c = new int[]{-1, -1};
        this.field_j = 0;
        this.field_o = -2;
        this.field_k = -1;
        this.field_b = 0;
        this.field_n = lj.a(448, false);
        this.field_l = lj.a(672, false);
        this.field_f = -1;
        this.field_h = -1;
    }

    static {
        field_a = "Waiting for other players.";
        field_i = "(1 player wants to join)";
    }
}
