/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp implements io {
    static nk field_a;
    static String field_g;
    static vn[] field_b;
    private int field_d;
    static int field_h;
    private rb field_f;
    static am field_e;
    private int field_c;

    final static void a(int param0, int param1) {
        int var3 = 0;
        rc var4 = null;
        jc var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawn.field_J;
        try {
          var4 = (rc) (hk.field_F.b((byte) 26));
          while (var4 != null) {
            rm.a((byte) -109, param0, var4);
            var4 = (rc) (hk.field_F.a(false));
          }
          if (param1 != -4) {
            dp.a(-47, 66, -71);
          }
          var5 = (jc) (on.field_g.b((byte) 26));
          while (var5 != null) {
            pm.a(param1 + 4, param0, var5);
            var5 = (jc) (on.field_g.a(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "dp.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0) {
        int var1;
        var1 = 67 % ((4 - param0) / 37);
        if (ld.field_j < 2) {
          return 0;
        }
        if (jp.field_a == 0) {
          if (!vo.field_d.a((byte) 73)) {
            return 20;
          }
          if (!vo.field_d.a(-1, "commonui")) {
            return 40;
          }
          if (!da.field_l.a((byte) 73)) {
            return 50;
          }
          if (!da.field_l.a(-1, "commonui")) {
            return 60;
          }
          if (!al.field_a.a((byte) 73)) {
            return 70;
          }
          if (!al.field_a.c(9001)) {
            return 80;
          }
          return 100;
        }
        if (f.field_i == null) {
          if (!vo.field_d.a((byte) 73)) {
            return 43;
          }
          if (!vo.field_d.a(-1, "commonui")) {
            return 57;
          }
          if (!da.field_l.a((byte) 73)) {
            return 71;
          }
          if (!da.field_l.a(-1, "commonui")) {
            return 80;
          }
          if (!al.field_a.a((byte) 73)) {
            return 82;
          }
          if (!al.field_a.c(9001)) {
            return 86;
          }
          return 100;
        }
        if (!f.field_i.a((byte) 73)) {
          return 14;
        }
        if (!f.field_i.a("", 0)) {
          return 29;
        }
        if (!f.field_i.a(-1, "")) {
          return 29;
        }
        if (!vo.field_d.a((byte) 73)) {
          return 43;
        }
        if (!vo.field_d.a(-1, "commonui")) {
          return 57;
        }
        if (!da.field_l.a((byte) 73)) {
          return 71;
        }
        if (!da.field_l.a(-1, "commonui")) {
          return 80;
        }
        if (!al.field_a.a((byte) 73)) {
          return 82;
        }
        if (al.field_a.c(9001)) {
          return 100;
        }
        return 86;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ZombieDawn.field_J;
        try {
          if (param0 != 16777215) {
            this.field_d = -68;
          }
          if (!param3.field_l &&
            !param3.e(-17741)) {
            stackIn_7_0 = 2188450;
          } else {
            stackIn_7_0 = 3249872;
          }
          var6_int = stackIn_7_0;
          this.field_f.a("<u=" + Integer.toString(var6_int, 16) + ">" + param3.field_o + "</u>", param3.field_k + param4, param2 + param3.field_j, param3.field_i, param3.field_n, var6_int, -1, this.field_c, this.field_d, this.field_f.field_I + this.field_f.field_x);
          if (param3.e(param0 ^ -16759476)) {
            var7 = this.field_f.b(param3.field_o);
            var8 = this.field_f.field_x + this.field_f.field_I;
            var9 = param3.field_k + param4;
            if (this.field_c != 2) {
              if (this.field_c == 1) {
                var9 = var9 + (param3.field_i - var7 >> 1);
              }
            } else {
              var9 = var9 + (param3.field_i - var7);
            }
            var10 = param3.field_j + param2;
            if (2 != this.field_d) {
              if (this.field_d == 1) {
                var10 = var10 + (-var8 + param3.field_n >> 1);
              }
            } else {
              var10 = var10 + (param3.field_n - var8);
            }
            on.b(var7 + 4, var8, var9 - 2, param0 - 16777135, 2 + var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_21_0 = var6;
          stackIn_21_1 = new StringBuilder().append("dp.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_b = null;
        field_e = null;
        if (!param0) {
          field_g = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var6Lifetime3;
        int var7Lifetime3;
        int var7Lifetime4;
        var8 = ZombieDawn.field_J;
        if (ej.field_x < 0) {
          return;
        }
        var3 = param0 - 135;
        var4 = -35 + param2;
        var5 = 256;
        if (ej.field_x < 75) {
          var5 = (ej.field_x << 8) / 75;
        }
        if (ej.field_x > 200) {
          var5 = (-ej.field_x + 250 << 8) / 50;
        }
        ki.a((byte) -102, ti.field_g);
        en.c();
        bi.d();
        gk.j(30549);
        if (var5 < 256) {
          bi.a(0, 0, bi.field_f, bi.field_a, 0, 256 - var5);
          pa.a(param1 ^ 32173);
          if (param1 != -12138) {
            dp.a(118, -83);
          }
          if (150 <= ej.field_x) {
            kh.field_a.e(var3 + 15, var4 + 10, var5);
          } else {
            ti.field_g.d(var3, var4);
          }
          var6 = -125 + ej.field_x;
          if (0 < var6) {
            if (var6 >= 50) {
              var6 = -140 + ej.field_x;
              if (var6 > 0) {
                var7 = 256;
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                }
                bh.field_j.e(15 + var3, var4 + 10, var7 * var5 >> 8);
              }
              return;
            }
            if (var6 < 20) {
              var7Lifetime4 = var6 * 256 / 20;
              wc.field_Pb.b(var3, var4, var7Lifetime4);
            } else {
              if (var6 >= 30) {
                var7Lifetime4 = (-(256 * var6) + 12800) / 20;
                wc.field_Pb.b(var3, var4, var7Lifetime4);
              } else {
                wc.field_Pb.b(var3, var4, 256);
              }
            }
          }
          var6Lifetime3 = -140 + ej.field_x;
          if (var6Lifetime3 > 0) {
            var7Lifetime3 = 256;
            if (var6Lifetime3 < 20) {
              var7Lifetime3 = var6Lifetime3 * 256 / 20;
            }
            bh.field_j.e(15 + var3, var4 + 10, var7Lifetime3 * var5 >> 8);
          }
          return;
        }
        pa.a(param1 ^ 32173);
        if (param1 != -12138) {
          dp.a(118, -83);
          if (150 <= ej.field_x) {
            kh.field_a.e(var3 + 15, var4 + 10, var5);
          } else {
            ti.field_g.d(var3, var4);
          }
          var6Lifetime1 = -125 + ej.field_x;
          if (0 < var6Lifetime1 &&
            var6Lifetime1 < 50) {
            if (var6Lifetime1 < 20) {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
              wc.field_Pb.b(var3, var4, var7Lifetime1);
            } else {
              if (var6Lifetime1 >= 30) {
                var7Lifetime1 = (-(256 * var6Lifetime1) + 12800) / 20;
                wc.field_Pb.b(var3, var4, var7Lifetime1);
              } else {
                wc.field_Pb.b(var3, var4, 256);
              }
            }
          }
        } else {
          if (150 <= ej.field_x) {
            kh.field_a.e(var3 + 15, var4 + 10, var5);
          } else {
            ti.field_g.d(var3, var4);
          }
          var6Lifetime1 = -125 + ej.field_x;
          if (0 < var6Lifetime1 &&
            var6Lifetime1 < 50) {
            if (var6Lifetime1 < 20) {
              var7Lifetime1 = var6Lifetime1 * 256 / 20;
              wc.field_Pb.b(var3, var4, var7Lifetime1);
            } else {
              if (var6Lifetime1 < 30) {
                wc.field_Pb.b(var3, var4, 256);
              } else {
                var7Lifetime1 = (-(256 * var6Lifetime1) + 12800) / 20;
                wc.field_Pb.b(var3, var4, var7Lifetime1);
              }
            }
          }
        }
        var6Lifetime2 = -140 + ej.field_x;
        if (var6Lifetime2 > 0) {
          var7Lifetime2 = 256;
          if (var6Lifetime2 < 20) {
            var7Lifetime2 = var6Lifetime2 * 256 / 20;
          }
          bh.field_j.e(15 + var3, var4 + 10, var7Lifetime2 * var5 >> 8);
        }
    }

    public dp() {
        this.field_f = ia.field_e;
        this.field_d = 1;
        this.field_c = 1;
    }

    dp(rb param0, int param1, int param2) {
        try {
          this.field_d = param2;
          this.field_f = param0;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "dp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_g = "Password is valid";
        field_h = 2147483647;
        field_a = new nk(3);
    }
}
