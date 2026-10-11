/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends v implements pi {
    static int field_L;
    static int[] field_I;
    private rm field_K;
    static char field_M;
    static h field_N;
    static lo field_G;
    private rm field_P;
    private rm field_F;
    static va field_O;
    static fg field_H;
    static String field_J;

    final boolean a(n param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.c(param0, -1);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_8_0 = this.b(param0, param2 ^ -51);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pk.T(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public pk() {
        super(0, 0, 476, 225, (dh) null);
        this.field_K = new rm(fo.field_m, (tb) null);
        this.field_P = new rm(um.field_c, (tb) null);
        this.field_F = new rm(ue.field_a, (tb) null);
        mo var1 = new mo();
        this.field_K.field_l = (dh) ((Object) var1);
        this.field_P.field_l = (dh) ((Object) var1);
        this.field_F.field_l = (dh) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_P.a(-var3 + this.field_x >> 1, (byte) 122, -var2 + (-48 + this.field_u), 30, var4);
        this.field_F.a((-var3 + this.field_x >> 1) + var4 + var2, (byte) 122, -48 + (this.field_u - var2), 30, var4);
        this.field_K.a(this.field_x - var3 >> 1, (byte) 122, -(2 * var2) - 78 + this.field_u, 30, var3);
        this.field_P.field_t = (tb) (this);
        this.field_K.field_t = (tb) (this);
        this.field_K.field_z = ml.field_b;
        this.field_F.field_t = (tb) (this);
        this.field_F.field_z = wc.field_j;
        this.a(true, this.field_P);
        this.a(true, this.field_K);
        this.a(true, this.field_F);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = this.field_k + param2;
        int var6 = param1 + this.field_o;
        hl.field_g.a(de.field_P, var5 + 20, 20 + var6, this.field_x - 40, this.field_u - 50, 16777215, -1, 1, 0, hl.field_g.field_G);
        super.a(param0, param1, param2, param3);
    }

    public static void h(int param0) {
        if (param0 != -25335) {
          return;
        }
        field_N = null;
        field_H = null;
        field_O = null;
        field_G = null;
        field_J = null;
        field_I = null;
    }

    final static sh a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sh stackIn_4_0 = null;
        sh stackIn_8_0 = null;
        sh stackIn_17_0 = null;
        sh stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = HoldTheLine.field_D;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_4_0 = fo.field_k;
            return stackIn_4_0;
          }
          if (63 < var2_int) {
            stackIn_8_0 = wb.field_h;
            return stackIn_8_0;
          }
          var3 = 0;
          var4 = 43 / ((param0 + 45) / 35);
          while (var2_int > var3) {
            var5 = param1.charAt(var3);
            if (45 == var5) {
              if (0 == var3 ||
                -1 + var2_int == var3) {
                stackIn_17_0 = qj.field_F;
                return stackIn_17_0;
              }
            } else {
              if (rc.field_e.indexOf(var5) == -1) {
                stackIn_20_0 = qj.field_F;
                return stackIn_20_0;
              }
            }
            var3++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("pk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void a(int param0, rm param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (param2 != -4) {
            return;
          }
          if (param1 == this.field_P) {
            rm.h(param2 + 88);
            return;
          }
          if (param1 == this.field_K) {
            qj.h((byte) 83);
            return;
          }
          if (param1 != this.field_F) {
            return;
          }
          rl.h(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("pk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_I = new int[128];
        field_N = new h();
        field_J = "Email is valid";
    }
}
