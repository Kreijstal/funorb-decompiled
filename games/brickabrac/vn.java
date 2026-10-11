/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends no {
    static jp field_w;
    static mh field_A;
    static String field_H;
    int field_I;
    static java.math.BigInteger field_F;
    static jp[] field_G;
    private int field_z;
    static jp[] field_K;
    hp field_E;
    int field_v;
    static String field_x;
    int field_C;
    int field_J;
    static jp field_D;
    int field_B;
    hp field_y;

    private vn(int param0, int param1) {
        super(0, 0, 0, 0, 1536, 0);
        this.field_E = new hp(50);
        this.field_y = new hp(50);
        this.field_z = param0;
        this.a(this.field_z, param1, 116);
    }

    final static th a(int param0, byte param1) {
        th[] var2;
        int var3;
        int var4;
        th[] var5;
        int var3Lifetime1;
        th[] var2Lifetime1;
        th[] var5Lifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 > 4) {
          var5 = lq.b(0);
          var2 = var5;
          for (var3 = 0; var5.length > var3; var3++) {
            if (param0 == var5[var3].field_e) {
              return var5[var3];
            }
          }
          return null;
        }
        field_A = (mh) null;
        var5Lifetime1 = lq.b(0);
        var2Lifetime1 = var5Lifetime1;
        for (var3Lifetime1 = 0; var5Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
          if (param0 == var5Lifetime1[var3Lifetime1].field_e) {
            return var5Lifetime1[var3Lifetime1];
          }
        }
        return null;
    }

    final void a(vo param0, int param1) {
        try {
          this.field_j = -1536 + (param0.field_j + (param0.field_u >> 1));
          this.field_m = param0.field_m - 3072;
          this.field_j = this.field_j + param0.field_u * this.field_z / 3072;
          if (param1 != 0) {
            this.field_E = (hp) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vn.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    vn(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, 1536, 0);
        this.field_E = new hp(50);
        this.field_y = new hp(50);
    }

    final static int[] d(int param0) {
        if (param0 != 8) {
          vn.d(-23);
          return new int[8];
        }
        return new int[8];
    }

    public static void c(int param0) {
        field_F = null;
        field_w = null;
        field_G = null;
        field_x = null;
        field_A = null;
        field_H = null;
        field_D = null;
        if (param0 >= 91) {
          field_K = null;
          return;
        }
        field_F = (java.math.BigInteger) null;
        field_K = null;
    }

    vn() {
        this(0, 0, 0, 0);
    }

    final void a(int param0, int param1, int param2) {
        this.field_k = (sa.a(param0, -4097) >> 8) * param1 >> 8;
        if (param2 >= 95) {
          this.field_o = (BrickABrac.c(2048, param0) >> 8) * -param1 >> 8;
          return;
        }
    }

    vn(vo param0, int param1, int param2) {
        this(param1, param2);
        try {
          this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, wq param1) {
        super.a(107, param1);
        this.field_C = param1.e(255);
        if (param0 < 89) {
          return;
        }
        try {
          this.field_v = param1.i(65280);
          this.field_J = param1.a(126);
          this.field_z = param1.a(126);
          this.field_I = param1.c((byte) -82);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vn.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, StringBuilder param1) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 79) {
            this.c(-49, 14);
          }
          var3_int = -19088744 ^ super.a(93, param1);
          if (param1 != null) {
            discarded$3 = param1.append("base checksum for ball: " + Integer.toString(var3_int, 16) + "\n");
            discarded$4 = param1.append(this.field_j + " " + this.field_m + " " + this.field_k + " " + this.field_o + " " + " " + this.field_i + " " + this.field_l + "\n");
            discarded$5 = param1.append("Ball Info: " + this.field_v + " " + this.field_J + " " + this.field_C + " " + this.field_z + "\n");
          }
          var3_int = var3_int ^ this.field_v * 83 + 119 << 12;
          var3_int = var3_int ^ 57 + this.field_J * 13 << 18;
          var3_int = var3_int ^ 6483 + this.field_C * 53 << 3;
          var3_int = var3_int ^ this.field_z * 5 + 289 << 5;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void b(int param0, int param1) {
        this.field_J = this.field_J + param1;
        this.field_v = 0;
        if (param0 > -27) {
          this.a(119, 71, 24);
        }
    }

    final void c(int param0, int param1) {
        int var3 = kj.a(this.field_k * this.field_k + this.field_o * this.field_o, 2) >> 8;
        int var4 = param1 + var3;
        if (var4 < param0) {
          var4 = 512;
        }
        if (var4 > 3840) {
          var4 = 3840;
        }
        this.field_k = this.field_k * var4 / var3;
        this.field_o = var4 * this.field_o / var3;
    }

    final void a(byte param0, int param1) {
        if (param0 == 40) {
          this.field_v = this.field_v + param1;
          this.field_J = 0;
          return;
        }
        field_K = (jp[]) null;
        this.field_v = this.field_v + param1;
        this.field_J = 0;
    }

    final void a(int param0, int param1) {
        this.a(param1, kj.a(this.field_o * this.field_o + this.field_k * this.field_k, 2) >> 8, 107);
        if (param0 != 6546) {
          this.field_v = -29;
        }
    }

    static {
        field_x = "Unpacking levels";
        field_H = "To server list";
        field_F = new java.math.BigInteger("65537");
    }
}
