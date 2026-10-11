/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad extends bw {
    boolean field_l;
    static boolean field_i;
    static sna field_q;
    int field_o;
    static pia field_h;
    aga field_s;
    static int field_g;
    eaa field_n;
    int field_k;
    int field_j;
    static int[] field_m;
    eaa field_t;
    int field_p;
    int field_r;
    lna field_f;

    final float e(byte param0) {
        int var3 = BachelorFridge.field_y;
        gca var2 = (gca) (this.field_n.b((byte) 90));
        if (param0 != -121) {
          sna var4 = (sna) null;
          ad.a((sna) null, (jc) null, (sna) null, (sna) null, false);
        }
        while (var2 != null) {
          if (var2 instanceof c) {
            return ((c) (var2)).field_j;
          }
          var2 = (gca) (this.field_n.c(0));
        }
        return 0.0f;
    }

    final void b(int param0, int param1) {
        this.field_f.a((byte) 28, this.field_s.field_o.field_b, param1);
        if (param0 != -1) {
          this.c((byte) 96);
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
          if (param1 < 7) {
            String var5 = (String) null;
            this.a(-38, 92, (String) null);
          }
          this.field_t.a(new vca(taa.field_u, param2, param0, 4096, 20, 30, 50, (-8 + taa.field_u.field_F) * (-1 + this.field_t.g(0)) + 8), true);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ad.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(boolean param0) {
        field_m = null;
        field_h = null;
        if (param0) {
          ad.c(false);
        }
        field_q = null;
    }

    final static boolean a(int param0, int param1) {
        if (param1 < 0) {
          return 0 == (param1 + 1) % 4 ? true : false;
        }
        if (param1 < 1582) {
          return param1 % 4 == 0 ? true : false;
        }
        if (param1 % 4 != 0) {
          return false;
        }
        if (param1 % 100 != 0) {
          return true;
        }
        if (param0 != 30) {
          field_m = (int[]) null;
        }
        if (param1 % 400 == 0) {
          return true;
        }
        return false;
    }

    final static nv a(sna param0, jc param1, sna param2, sna param3, boolean param4) {
        int var14 = 0;
        Object stackIn_3_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        nv stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        char[] var9 = null;
        int[] var10 = null;
        nv[] var11 = null;
        int var12 = 0;
        jc var13_ref_jc = null;
        int var13 = 0;
        int var15 = 0;
        pda var16 = null;
        int var17 = 0;
        int[] var18 = null;
        char[] var19 = null;
        int[] var20 = null;
        char[] var21 = null;
        int var12Lifetime1;
        var17 = BachelorFridge.field_y;
        try {
          if (param1 == null) {
            stackIn_3_0 = null;
            return (nv) (stackIn_3_0);
          }
          if (null == param1.field_u) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = param1.field_u.length;
          }
          var5_int = stackIn_7_0;
          if (null != param1.field_q) {
            stackIn_10_0 = param1.field_q.length;
          } else {
            stackIn_10_0 = 0;
          }
          var6 = stackIn_10_0;
          var7 = var5_int + var6;
          var8 = new String[var7];
          var21 = new char[var7];
          var19 = var21;
          var9 = var19;
          if (param4) {
            field_g = -56;
          }
          var20 = new int[var7];
          var18 = var20;
          var10 = var18;
          var11 = new nv[var7];
          if (param1.field_u != null) {
            for (var12 = 0; var12 < param1.field_u.length; var12++) {
              var13_ref_jc = bga.field_l.a((byte) 105, param1.field_u[var12]);
              var8[var12] = var13_ref_jc.field_s;
              var9[var12] = param1.field_p[var12];
              var11[var12] = ad.a(param0, var13_ref_jc, param2, param3, false);
            }
          }
          if (null != param1.field_q) {
            var12Lifetime1 = var5_int;
            var13 = 49;
            for (var14 = 0; param1.field_q.length > var14; var14++) {
              var15 = param1.field_q[var14];
              if (var15 != -1) {
                var16 = cea.field_h.a(-22834, var15);
                var8[var14 + var12Lifetime1] = var16.d((byte) 74);
                var9[var14 + var12Lifetime1] = param1.field_o[var14];
                if (var9[var12Lifetime1 + var14] <= 0) {
                  var13 = (char)(var13 + 1);
                  var9[var14 + var12Lifetime1] = (char)var13;
                }
                var10[var14 + var12Lifetime1] = param1.field_q[var14];
              } else {
                var8[var12Lifetime1 + var14] = ci.field_p;
                var9[var14 + var12Lifetime1] = param1.field_o[var14];
                var10[var12Lifetime1 + var14] = param1.field_q[var14];
              }
            }
          }
          stackIn_27_0 = new nv(0L, param3, param0, param2, var11, var20, var8, var21);
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ad.E(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param3 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean d(byte param0) {
        if (param0 < 7) {
          ad.a(54, -103);
        }
        return ur.field_d > 250 ? true : false;
    }

    final void c(byte param0) {
        this.field_f = this.field_s.e((byte) -78);
        this.field_f.field_b = this.field_s.field_o.field_k.field_b;
        this.field_t = new eaa();
        this.field_n = new eaa();
        this.field_j = this.field_s.field_I;
        if (param0 >= -53) {
          this.a(124);
        }
        this.b(false);
    }

    final void b(boolean param0) {
        this.field_f.field_v = param0 ? true : false;
        this.field_f.field_i = false;
        if (this.field_s.field_y == 29 ||
          this.field_s.field_y == 44) {
          this.field_f.a((byte) 92, this.field_s.field_o.field_b, 18);
          return;
        }
        if (35 == this.field_s.field_y) {
          this.field_f.field_i = true;
        }
        if (this.field_s.field_y == 42) {
          this.field_f.field_v = true;
        }
        if (this.field_s.field_I <= 0) {
          this.field_f.a((byte) 125, this.field_s.field_o.field_b, 6);
          this.field_f.field_u.a((byte) -69);
          return;
        }
        this.field_f.a((byte) 90, this.field_s.field_o.field_b, 0);
    }

    final void a(int param0) {
        int stackIn_20_0 = 0;
        int var3;
        gca var4;
        int var5;
        int var6;
        int var7;
        vca var8;
        gca var4Lifetime1;
        var7 = BachelorFridge.field_y;
        var8 = (vca) (this.field_t.b((byte) 90));
        L1: while (true) {
          if (var8 != null) {
            if (var8.b(false)) {
              var8.a(false);
            } else {
              if (var8.c((byte) 127)) {
                break L1;
              }
            }
            var8 = (vca) (this.field_t.c(0));
            continue;
          }
          break;
        }
        if (this.field_s.field_I < this.field_j) {
          this.field_j = this.field_j - 1;
        } else {
          if (this.field_s.field_I > this.field_j) {
            this.field_j = this.field_j + 1;
          }
        }
        if (param0 < 101) {
          ad.c(true);
        }
        var3 = 0;
        var4 = (gca) (this.field_n.b((byte) 90));
        while (var4 != null) {
          stackIn_20_0 = (~this.field_s.field_y == ~var4.field_h) ? 1 : 0;
          var5 = stackIn_20_0;
          var6 = var4.a(false, var5 != 0) ? 1 : 0;
          if (var5 == 0 &&
            var6 == 0) {
            var4.a(false);
          }
          var4 = (gca) (this.field_n.c(0));
          var3 = var3 | var5;
        }
        if (var3 == 0 &&
          this.field_s.field_y != 0) {
          var4Lifetime1 = nba.a(this.field_s.field_y, false);
          if (var4Lifetime1 != null) {
            this.field_n.a(var4Lifetime1, true);
          }
        }
        return;
    }

    ad(aga param0) {
        try {
          this.field_s = param0;
          this.c((byte) -126);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ad.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = false;
        field_m = new int[]{23, 23, 24, 26, 30};
    }
}
