/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cp extends gd {
    static String field_T;
    static boolean field_U;
    static String field_P;
    ac field_S;
    static String[] field_Q;
    static int field_R;
    static String field_O;

    final void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        cn var8;
        int var9;
        int var10;
        if (param1 != 8187) {
          return;
        }
        var4 = param0 + (this.field_t - 3);
        var5 = -3 + (param2 + this.field_i);
        var6 = 5 + (this.field_q + var4);
        var7 = 5 + var5 + this.field_x;
        if (var4 > gf.field_h) {
          return;
        }
        if (gf.field_e >= var5 &&
          gf.field_j <= var6 &&
          var7 >= gf.field_f) {
          gf.b(var4, var5, this.field_q + 5, this.field_x + 5, 0, 128);
          super.b(param0, param1 + 0, param2);
          var8 = this.field_S.field_d.a(40, 0, 40, 0);
          var9 = this.field_x + var5 - 42;
          var10 = var4 + 5;
          if (var8 != null) {
            var8.c(var10, var9);
          } else {
            gf.b(var10, var9, 32, 32, 0);
          }
          return;
        }
    }

    cp(int param0, int param1, ac param2) {
        super(param0, param1, 0, 0, 0);
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        gp stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_3;
        int stackIn_21_4;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        cn var11 = null;
        cn var12 = null;
        cn var13 = null;
        int var14 = 0;
        int var15 = 0;
        cn var16 = null;
        cn var17 = null;
        String var19 = null;
        int var15Lifetime1;
        try {
          this.field_S = param2;
          var19 = this.field_S.field_z;
          var4 = var19;
          var5 = this.field_S.field_c;
          var6 = jn.a(var19, new int[]{140, 88}, -108, db.field_v);
          var7 = db.field_v.field_H * var6.length + la.field_b.field_H + 42;
          if (pb.field_G <= 0) {
            stackIn_7_0 = ((this.field_S.field_j & 1) != 0) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var8 = stackIn_7_0;
          if (gm.field_d.field_e == 0) {
            stackIn_13_0 = ((this.field_S.field_j & 2) != 0) ? 1 : 0;
          } else {
            stackIn_13_0 = 0;
          }
          var9 = stackIn_13_0;
          var10 = var8 | var9;
          var11 = new cn(140, var7);
          var12 = new cn(140, var7);
          var13 = new cn(140, var7);
          jh.a(var11);
          gf.a();
          var14 = 0;
          for (var15 = 0; var15 < var6.length; var15++) {
            var14 = var14 + la.field_b.field_H;
            stackIn_17_0 = la.field_b;
            stackIn_17_1 = var6[var15];
            if (var15 != 0) {
              stackIn_18_2 = la.field_b.field_H;
            } else {
              stackIn_18_2 = 0;
            }
            stackIn_20_3 = var14;
            if (var10 == 0) {
              stackIn_21_4 = 16760832;
            } else {
              stackIn_21_4 = 8421504;
            }
            ((gp) (Object) stackIn_17_0).b(stackIn_17_1, stackIn_18_2, stackIn_20_3, stackIn_21_4, -1);
          }
          var14 = var14 + (la.field_b.field_H + 2);
          if (var8 == 0) {
            if (var9 == 0) {
              la.field_b.b(jk.a(new String[]{Integer.toString(var5 / 10)}, n.field_a, 30496), 52, var14, 12632256, -1);
            } else {
              la.field_b.b(be.field_q, 52, var14, 16711680, -1);
            }
          } else {
            la.field_b.b(dn.field_T, 52, var14, 16711680, -1);
          }
          var14 += 4;
          var12.e();
          var15Lifetime1 = -40 + (var7 - 5);
          gf.a();
          var11.e(0, 0, 16744448);
          al.a(52, var14, false, this.field_S, 16744448);
          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15Lifetime1);
          var13.e();
          gf.a();
          var11.e(0, 0, 12690143);
          al.a(52, var14, false, this.field_S, 10449103);
          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15Lifetime1);
          var11.e();
          al.a(52, var14, false, this.field_S, 12632256);
          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15Lifetime1);
          jh.b();
          var16 = rb.a(16, var12, 255, (byte) -95);
          var17 = rb.a(16, var12, 16711680, (byte) -75);
          this.a(var12, var11, var17, var13, (byte) 126, var16);
          this.field_n = (en) ((Object) new bd(this.field_S));
          if (var10 != 0) {
            this.field_w = false;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_32_0 = var4_ref;
          stackIn_32_1 = new StringBuilder().append("cp.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(int param0, java.applet.Applet param1, byte param2, int param3, String[] param4, int param5) {
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        var8 = DungeonAssault.field_K;
        try {
          mj.field_f = param1.getParameter("overxgames");
          if (null == mj.field_f) {
            mj.field_f = "0";
          }
          dh.field_f = param1.getParameter("overxachievements");
          if (dh.field_f == null) {
            dh.field_f = "0";
          }
          var6 = param1.getParameter("currency");
          if (var6 == null) {
            wo.field_g = 2;
          } else {
            if (!sj.a((CharSequence) ((Object) var6), 10)) {
              wo.field_g = 2;
            } else {
              wo.field_g = ri.a((byte) 87, (CharSequence) ((Object) var6));
            }
          }
          uj.field_d = param5;
          lj.field_u = param3;
          ld.field_c = param0;
          en.field_b = new cn[param4.length];
          var7 = 0;
          if (param2 != -36) {
            cp.f(104, 12, -116);
          }
          while (var7 < param4.length) {
            en.field_b[var7] = new cn(317, 34);
            var7++;
          }
          ec.field_l = param4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_19_0 = var6_ref;
          stackIn_19_1 = new StringBuilder().append("cp.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(')').toString());
        }
    }

    final static int f(int param0, int param1, int param2) {
        int var3 = 49 % ((56 - param0) / 49);
        int var4 = param2 >>> 31;
        return (var4 + param2) / param1 - var4;
    }

    public static void c(byte param0) {
        field_O = null;
        field_Q = null;
        field_P = null;
        if (param0 != -66) {
          field_U = false;
        }
        field_T = null;
    }

    final static void f(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = DungeonAssault.field_K;
        try {
          if (!fm.a((byte) -123)) {
            if (cm.field_R != null &&
              cm.field_R.field_g) {
              ib.a(930);
              na.field_D.a(new nm(na.field_D, of.field_g), -1);
            }
            return;
          }
          na.field_D.a(am.field_e, (byte) 66, bp.field_d, true);
          na.field_D.b(true);
          while (ha.b((byte) 47)) {
            na.field_D.a(param0 + 30335, mm.field_t, ob.field_Yb);
          }
          if (param0 != -30208) {
            cp.c((byte) 49);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "cp.B(" + param0 + ')');
        }
    }

    static {
        field_P = "If the trap here is triggered, the room will almost instantly fill with a gangrenous-looking poison gas.";
        field_U = false;
        field_O = "Giant Rats";
        field_R = 64;
        field_T = "Login: ";
    }
}
