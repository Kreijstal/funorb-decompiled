/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends gd {
    static ad field_U;
    static cf[] field_T;
    static int field_P;
    static String field_S;
    h field_Q;
    static boolean field_O;
    static String field_R;

    final static int a(int param0, int param1, boolean param2) {
        if (!param2) {
          return 117;
        }
        if (param0 == 0) {
          if (0 == param1) {
            return 0;
          }
          if (param1 < 0) {
            return -2048;
          }
          return 2048;
        }
        if (param0 < 0) {
          if (0 == param1) {
            return 4096;
          }
          if (param1 >= 0) {
            return -d.a(-81, -param0, param1) + 4096;
          }
          return d.a(-89, -param0, -param1) - 4096;
        }
        if (0 == param1) {
          return 0;
        }
        if (param1 >= 0) {
          return d.a(-103, param0, param1);
        }
        return -d.a(-120, param0, -param1);
    }

    u(int param0, int param1, h param2) {
        super(param0, param1, 0, 0, 0);
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        gp stackIn_17_0 = null;
        String stackIn_17_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_20_3;
        int stackIn_21_4;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
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
          this.field_Q = param2;
          var19 = this.field_Q.field_F;
          var4 = var19;
          var5 = ib.a(this.field_Q, 918);
          var6 = jn.a(var19, new int[]{140, 88}, -78, db.field_v);
          var7 = var6.length * db.field_v.field_H + la.field_b.field_H + 42;
          if (0 >= pb.field_G) {
            stackIn_7_0 = (0 != (1 & this.field_Q.field_x)) ? 1 : 0;
          } else {
            stackIn_7_0 = 0;
          }
          var8 = stackIn_7_0;
          if (0 == gm.field_d.field_e) {
            stackIn_13_0 = (0 != (this.field_Q.field_x & 2)) ? 1 : 0;
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
          for (var15 = 0; var6.length > var15; var15++) {
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
          var15Lifetime1 = -45 + var7;
          gf.a();
          var11.e(0, 0, 16744448);
          gk.a(52, this.field_Q, 95, 16744448, var14);
          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15Lifetime1);
          var13.e();
          gf.a();
          var11.e(0, 0, 12690143);
          gk.a(52, this.field_Q, 118, 10449103, var14);
          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15Lifetime1);
          var11.e();
          gk.a(52, this.field_Q, 115, 12632256, var14);
          rp.a(8, 40, (byte) 108, 2, 40, kc.field_S, var15Lifetime1);
          jh.b();
          var16 = rb.a(16, var12, 255, (byte) 99);
          var17 = rb.a(16, var12, 16711680, (byte) -128);
          this.a(var12, var11, var17, var13, (byte) 106, var16);
          this.field_n = (en) ((Object) new fc(this.field_Q));
          if (var10 == 0) {
            return;
          }
          this.field_w = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_33_0 = var4_ref;
          stackIn_33_1 = new StringBuilder().append("u.<init>(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(int param0, lb param1) {
        int var2_int = 0;
        eh var3 = null;
        int var4 = 0;
        eh stackIn_15_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = DungeonAssault.field_K;
        try {
          if (um.field_i == null) {
            um.field_i = new hb[8];
          }
          if (param0 != 1) {
            return;
          }
          for (var2_int = 0; 8 > var2_int; var2_int++) {
            if (param1 == null ||
              um.field_i[var2_int] == param1.field_a[var2_int]) {
              um.field_i[var2_int] = gm.field_d.field_a[var2_int];
              if (null != um.field_i[var2_int]) {
                if (255 != um.field_i[var2_int].field_p) {
                  stackIn_15_0 = um.field_i[var2_int].field_n.field_e;
                } else {
                  stackIn_15_0 = k.field_c;
                }
                var3 = stackIn_15_0;
                um.field_i[var2_int].field_b = new wd(var3);
              }
            }
          }
          ho.b((byte) -36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("u.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = -3 + this.field_t + param0;
        int var5 = -3 + (param2 + this.field_i);
        int var6 = this.field_q + var4 + 5;
        int var7 = this.field_x + var5 + 5;
        if (var4 > gf.field_h) {
          return;
        }
        if (gf.field_e < var5) {
          return;
        }
        if (gf.field_j > var6) {
          return;
        }
        if (gf.field_f > var7) {
          return;
        }
        gf.b(var4, var5, 5 + this.field_q, this.field_x + 5, 0, 128);
        super.b(param0, param1, param2);
        cn var13 = null == this.field_Q.field_e ? null : this.field_Q.field_e.a(40, 0, 40, 0);
        cn var8 = var13;
        int var9 = this.field_x + var5 - 2 - 40;
        int var10 = 5 + var4;
        if (var13 != null) {
          var13.c(var10, var9);
          return;
        }
        gf.b(var10, var9, 32, 32, 0);
    }

    final static String a(se param0, byte param1, String param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = 106 % ((-21 - param1) / 43);
          stackIn_1_0 = ia.a(param5, param0, an.a(param4, (byte) -109, param3, param2), 0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_4_0 = var6;
          stackIn_4_1 = new StringBuilder().append("u.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_R = null;
        field_S = null;
        field_T = null;
        int var1 = 52 / ((param0 - 30) / 54);
        field_U = null;
    }

    static {
        field_S = "<col=8B1717>Disarm</col>";
        field_U = new ad(7, 0, 1, 1);
        field_R = "Monster attacks.";
    }
}
