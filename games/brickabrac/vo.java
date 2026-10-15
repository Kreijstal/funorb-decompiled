/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo extends bn {
    int field_z;
    private int field_D;
    int field_B;
    int field_w;
    int field_y;
    static mh field_C;
    static int field_x;
    private int field_E;
    static int[] field_v;
    static String field_G;
    int field_F;
    int field_H;
    static int field_A;

    public static void e(int param0) {
        field_C = null;
        int var1 = -6 / ((param0 + 5) / 47);
        field_G = null;
        field_v = null;
    }

    vo(int param0, int param1, int param2, int param3) {
        super(0, param1, 0, 0, 22528, 3840, 0);
        this.field_D = 1;
        this.field_y = param3;
        this.field_E = param0;
        this.field_B = param2;
        this.f(0);
    }

    final int a(int param0, StringBuilder param1) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = super.a(105, param1) ^ 1381323349;
          if (param1 != null) {
            discarded$4 = param1.append("base checksum for paddle: " + Integer.toString(var3_int, 16) + "\n");
            discarded$5 = param1.append(this.field_j + " " + this.field_m + " " + this.field_k + " " + this.field_o + " " + " " + this.field_i + " " + this.field_l + "\n");
            discarded$6 = param1.append(this.field_B + " " + this.field_y + " " + this.field_E + " " + this.field_F + " " + " " + this.field_w + " " + this.field_z + "\n");
            discarded$7 = param1.append(this.field_D + " " + this.field_H + "\n");
          }
          var3_int = var3_int ^ (this.field_y * 41 << 5) + (this.field_B * 37 << 1);
          var3_int = var3_int + (64175 + this.field_E * 11);
          var3_int = var3_int ^ 51 + this.field_F * 31 << 22;
          var3_int = var3_int ^ 85 + this.field_w * 59 << 11;
          if (param0 <= 79) {
            this.field_w = 12;
          }
          var3_int = var3_int + (this.field_z * 29 << 26);
          var3_int = var3_int ^ 10 + 13 * this.field_D << 28;
          var3_int = var3_int ^ this.field_H * 83 + 45050 << 2;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vo.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (null != no.field_p) {
          var3 = no.field_p.b(param1, 8421504);
          if (-2 == var3) {
            if (param2 <= 69) {
              field_v = (int[]) null;
              return;
            }
            return;
          }
          if (var3 != -1) {
            var4 = no.field_p.j(72) ? 1 : 0;
            oc.a(var3, param0, no.field_p.field_Wb, 1, var4 != 0, no.field_p.h(107));
          }
          no.field_p = null;
          cr.f((byte) -124);
        }
        if (param2 > 69) {
          return;
        }
        field_v = (int[]) null;
    }

    final void b(boolean param0) {
        if (this.field_D != 8) {
          this.field_D = this.field_D + 1;
          if (!param0) {
            field_C = (mh) null;
          }
          return;
        }
    }

    final void a(byte param0, j param1, no param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        vn var14 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5Lifetime1;
        int var5Lifetime2;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          super.a(param0, param1, param2);
          var14 = (vn) (param2);
          var14.field_I = 0;
          var14.field_C = var14.field_C + 1;
          if (sh.field_a != 1) {
            if (sh.field_a == 2) {
              param2.field_o = -param2.field_o;
              return;
            }
            param2.field_k = -param2.field_k;
            var5 = (this.field_k - param2.field_k) * mn.field_A;
            if (var5 >= 0) {
              return;
            }
            param2.field_k = this.field_k;
            return;
          }
          var5Lifetime1 = kj.a(-w.b(param2.field_k, -param2.field_k, 93) - w.b(param2.field_o, -param2.field_o, 114) << 8, param0 - 51) >> 8;
          var6 = this.field_D * 16 + var5Lifetime1;
          if (3840 < var6) {
            var6 = 3840;
          }
          var7 = 43520;
          var8 = param2.field_j + param2.field_u - (this.field_j + (this.field_u >> 1));
          var9 = -kj.a(w.b(var8, -var8, 113) - w.b(var7, -var7, 111) << 8, 2);
          var9 = var9 / var7;
          var8 = (var8 << 8) / var7;
          var10 = param2.field_o * var9 + var8 * param2.field_k >> 7;
          var11 = -(var8 * var10 >> 8) + (param2.field_k + 8) - param1.a(16, (byte) 62);
          var12 = -(var10 * var9 >> 8) + (param2.field_o + (-param1.a(16, (byte) 62) + 8));
          if (var11 == 0) {
            param2.field_o = var12;
            param2.field_k = var11;
          } else {
            stackIn_8_0 = 341;
            if (var12 * var11 <= 0) {
              stackIn_9_1 = -((var12 << 8) / var11) << 8;
            } else {
              stackIn_9_1 = (var12 << 8) / var11 << 8;
            }
            if (stackIn_8_0 < nk.a(stackIn_9_1, 30922)) {
              param2.field_o = var12;
              param2.field_k = var11;
            } else {
              param2.field_o = -param2.field_o;
            }
          }
          var5Lifetime2 = kj.a(-w.b(param2.field_k, -param2.field_k, param0 ^ 85) - w.b(param2.field_o, -param2.field_o, 95) << 8, param0 ^ 55) >> 8;
          param2.field_k = var6 * param2.field_k / var5Lifetime2;
          param2.field_o = param2.field_o * var6 / var5Lifetime2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("vo.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void f(int param0) {
        this.field_D = 1;
        this.field_j = this.field_E - 11264;
        this.field_F = 8;
        this.field_u = 22528;
        this.field_H = param0;
    }

    final void d(int param0) {
        if (14 == this.field_F) {
          return;
        }
        if (param0 >= 6) {
          this.field_j = this.field_j - 1536;
          this.field_F = this.field_F + 2;
          this.field_u = this.field_u + 3072;
          return;
        }
    }

    final void e(byte param0) {
        if (this.field_F != 0) {
          this.field_u = this.field_u - 3072;
          this.field_j = this.field_j + 1536;
          int var2 = 27 / ((74 - param0) / 49);
          this.field_F = this.field_F - 2;
          return;
        }
    }

    final void a(int param0, wq param1) {
        super.a(94, param1);
        this.field_F = param1.l(255);
        if (param0 <= 89) {
          return;
        }
        try {
          this.field_D = 15 & this.field_F >> 4;
          this.field_F = this.field_F & 15;
          this.field_w = param1.i(65280);
          this.field_z = param1.i(65280);
          this.field_H = param1.i(65280);
          this.field_u = 32 + (6 * this.field_F + 8) << 8;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "vo.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = "Show players in <%0>'s game";
        field_v = new int[8192];
    }
}
