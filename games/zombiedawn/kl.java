/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends al {
    private int field_m;
    private boolean field_n;
    static cg field_p;
    static String[] field_o;

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        int var4Lifetime1Lifetime1;
        int var5Lifetime1Lifetime1;
        var6 = ZombieDawn.field_J;
        var2 = vh.field_b;
        if (param0 >= -35) {
          this.a((byte) -96);
        }
        var3 = id.field_M;
        bi.d();
        if (this.field_n) {
          this.d(-105);
          return;
        }
        bi.c(-32 + vh.field_b, 0, 672 + vh.field_b, nh.field_P);
        if (260 <= this.field_m) {
          if (this.field_m >= 388) {
            if (this.field_m < 508) {
              nn.field_j.e(var2, var3);
              we.field_Ub.b(var2, 480 + (var3 - we.field_Ub.field_q));
            } else {
              if (this.field_m >= 1564) {
                if (this.field_m < 1724) {
                  nn.field_j.e(-264 + var2, var3);
                  pg.field_t.b(var2 + 270, 200 + var3);
                } else {
                  if (this.field_m >= 1852) {
                    if (this.field_m >= 2152) {
                    }
                  } else {
                    nn.field_j.b(-264 + var2, var3);
                    pg.field_t.b(var2 + 270, 200 + var3);
                    bi.a(0, var3, bd.field_e, 550, 0, 2 * this.field_m - 3448);
                  }
                }
              } else {
                var4 = -508 + this.field_m;
                nn.field_j.e(-(var4 >> 2) + var2, var3);
                var5 = var4 * 3 >> 2;
                we.field_Ub.b(-var5 + var2, var3 + 480 - we.field_Ub.field_q);
                pg.field_t.b(1062 + (var2 - var5), 200 + var3);
              }
            }
          } else {
            nn.field_j.b(var2, var3);
            we.field_Ub.b(var2, -we.field_Ub.field_q + (480 + var3));
            bi.a(0, var3, bd.field_e, 550, 0, -(2 * (-260 + this.field_m)) + 256);
          }
        }
        this.d(-119);
        bi.c(-32 + vh.field_b, 0, vh.field_b + 672, nh.field_P);
        if (this.field_m > 120 &&
          this.field_m < 388) {
          bj.field_q.a(rg.field_L, bd.field_d, Math.min(510 + id.field_M, nh.field_P - 20), 16777215, 0);
        }
        if (640 < bd.field_e) {
          var4Lifetime1 = 8;
          bi.g(-1 + vh.field_b, id.field_M, 550, 0, 4);
          for (var5Lifetime1 = vh.field_b - 2; 0 < var5Lifetime1; var5Lifetime1--) {
            if (256 > var4Lifetime1) {
              bi.g(var5Lifetime1, id.field_M, 550, 0, var4Lifetime1);
              var4Lifetime1 += 8;
              continue;
            }
            break;
          }
          var4Lifetime1Lifetime1 = 8;
          bi.g(640 + vh.field_b, id.field_M, 550, 0, 4);
          for (var5Lifetime1Lifetime1 = 640 + vh.field_b + 1; var5Lifetime1Lifetime1 < bd.field_e; var5Lifetime1Lifetime1++) {
            if (256 <= var4Lifetime1Lifetime1) {
              break;
            }
            bi.g(var5Lifetime1Lifetime1, id.field_M, 550, 0, var4Lifetime1Lifetime1);
            var4Lifetime1Lifetime1 += 8;
          }
        }
    }

    private final void d(int param0) {
        int stackIn_21_0 = 0;
        int var2;
        int var3;
        int var4;
        Object var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = ZombieDawn.field_J;
        var3 = 26 / ((-41 - param0) / 63);
        var2 = vh.field_b;
        var4 = id.field_M;
        var5 = null;
        var6 = 0;
        for (var8 = 0; var8 < jc.field_q.length; var8++) {
          var9 = -jc.field_q[var8] + this.field_m;
          if (0 < var9 &&
            var9 < 50 + a.field_g[var8] + 10) {
            var6 = 256;
            if (var9 < 10) {
              var6 = (var9 << 8) / 10;
            }
            var5 = gj.field_o[var8];
            if (var9 > 10 + a.field_g[var8]) {
              var6 = -((-a.field_g[var8] - 10 + var9 << 8) / 50) + 256;
            }
          }
        }
        var7 = 50 + var4;
        if (var5 != null) {
          var8Lifetime1 = -5 + (sg.field_jb.field_I + sg.field_jb.field_x);
          stackIn_21_0 = (var5 != gj.field_o[6]) ? 0 : 1;
          var9Lifetime1 = stackIn_21_0;
          if (var9Lifetime1 != 0 ||
            var5 == gj.field_o[5]) {
            var7 = 180 + var4;
          }
          if (var9Lifetime1 != 0) {
            sg.field_jb.a(gj.field_o[5], 60 + var2, var7, 520, 200, 0, 0, 1, 0, var8Lifetime1);
          }
          if (null == eg.field_n ||
            eg.field_n != var5) {
            this.a(var8Lifetime1, var7 - var4, 5, (String) (var5));
          }
          if (256 > var6) {
            sg.field_jb.a((String) (var5), var2 + 60, var7, 520, 200, 0, 0, var6, 1, 0, var8Lifetime1);
            if (var9Lifetime1 == 0) {
              so.b(lf.field_h, var2, var4, var6);
            }
          } else {
            sg.field_jb.a((String) (var5), var2 + 60, var7, 520, 200, 0, 0, 1, 0, var8Lifetime1);
            if (var9Lifetime1 == 0) {
              so.a(lf.field_h, var2, var4);
            }
          }
        }
        eg.field_n = (String) (var5);
    }

    final static void c(int param0) {
        if (null != sh.field_d) {
          sh.field_d.a();
        }
        if (cf.field_fb != null) {
          cf.field_fb.a();
        }
        if (param0 != -16861) {
          kl.e(-83, 78);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 != 65793) {
          kl.c(95);
        }
        if (this.field_m <= 100) {
          return true;
        }
        this.d((byte) -117);
        return true;
    }

    final void a(byte param0, boolean param1) {
        int stackIn_3_0 = 0;
        int var3;
        int var4;
        int var5;
        this.field_m = this.field_m + 1;
        jc.field_q = new int[]{90, 490, 830, 1170, 1510, 1970, 2020};
        a.field_g = new int[]{280, 180, 180, 180, 180, 180, 180};
        stackIn_3_0 = (1 != ci.field_d) ? 0 : 1;
        var3 = stackIn_3_0;
        if (this.field_m >= 2152) {
          var3 = 1;
        }
        if (var3 != 0 &&
          100 < this.field_m) {
          this.d((byte) 113);
        }
        if (this.field_m == jc.field_q[0]) {
          ph.a((byte) 103, w.field_a[9]);
        }
        var4 = -71 / ((param0 + 39) / 61);
        if (this.field_m > 1896 &&
          2152 > this.field_m) {
          var5 = -this.field_m + 2152;
          if (var5 < 0) {
            var5 = 0;
          }
          ZombieDawn.b(119, vk.field_a * var5 >> 8);
        }
    }

    final void a(al param0, int param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_n = true;
          if (param1 <= 70) {
            this.d(-27);
            oj.field_d.c(100, 10);
          } else {
            oj.field_d.c(100, 10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kl.W(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1, fk param2, String param3, int param4, String param5, boolean param6) {
        RuntimeException var7 = null;
        md var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ic.field_S != fk.field_F) {
            return false;
          }
          if (param1 != 640) {
            kl.e(-27, 118);
          }
          var8 = new md(e.field_S, param2);
          e.field_S.a(var8, true);
          if (sn.b((byte) 12)) {
            var8.c(false);
            return true;
          }
          to.field_d = param5;
          ae.field_a = param4;
          da.field_i = param0;
          df.field_l = param6;
          mp.field_f = null;
          we.field_Rb = param3;
          fk.field_F = vh.field_c;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_15_0 = var7;
          stackIn_15_1 = new StringBuilder().append("kl.AA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
        }
    }

    kl(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
        this.field_m = 0;
        try {
          this.field_n = false;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "kl.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    private final void d(byte param0) {
        int var2 = 118 % ((61 - param0) / 52);
        ZombieDawn.b(117, vk.field_a);
        ph.a((byte) 47, w.field_a[1]);
        ca.a(true, true, 0);
    }

    private final void a(int param0, int param1, int param2, String param3) {
        try {
          lf.field_h.a();
          bi.d();
          sg.field_jb.a(param3, 60, param1, 520, 200, 4, 0, 1, 0, param0);
          so.a(16777215);
          so.a(16777215);
          so.a(16777215);
          so.a(16777215);
          bi.h(5, 5, 0, 0, 640, 480);
          sg.field_jb.a(param3, 60, param1, 520, 200, param2, 0, 1, 0, param0);
          cn.field_f.b(param2 + 11);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "kl.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void e(int param0, int param1) {
        int var5 = 0;
        int var6 = ZombieDawn.field_J;
        if (be.field_j <= 0 &&
          param0 > 0) {
          return;
        }
        bn.field_i = param0;
        ki.a((byte) -119, cc.field_b);
        bi.d();
        vn var2 = f.field_d;
        int var3 = 0;
        int var4 = 0;
        var2.b(var3 + 10, var4 + 10);
        for (var5 = 0; var5 < 3; var5++) {
          so.a(16777045);
        }
        var2.d(10 + var3, 10 + var4, 0);
        if (param1 != 16777045) {
          return;
        }
        try {
          bi.h(2, 2, 0, 0, 195, 170);
          pa.a(-21189);
          ti.field_b = 3 * wd.field_z.length >> 2;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "kl.T(" + param0 + ',' + param1 + ')');
        }
    }

    public static void e(byte param0) {
        if (param0 != -112) {
          field_p = (cg) null;
        }
        field_o = null;
        field_p = null;
    }

    final void e(int param0) {
        this.field_n = false;
        if (param0 >= -123) {
          return;
        }
        oj.field_d.a(false, 10);
        this.field_m = 0;
        ch.b(65);
        vk.field_a = ce.field_u;
    }

    static {
        field_p = new cg(0, 2, 2, 1);
        field_o = new String[]{"4 new stages full of zombifying action", "Fight new enemies trying to chase you out of their land", "Trick humans into opening your path and use new powerups", "Take over the Palace and seize the throne!"};
    }
}
