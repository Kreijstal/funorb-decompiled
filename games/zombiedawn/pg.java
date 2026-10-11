/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends al {
    static vn field_t;
    static String field_n;
    private int field_s;
    static int field_p;
    private int field_q;
    static int field_o;
    static String field_r;
    private int field_m;

    final int c(int param0, int param1) {
        if (param1 != 6) {
          return -32;
        }
        return vh.field_b + this.field_s;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        int var3Lifetime1;
        var4 = ZombieDawn.field_J;
        og.g(0);
        if (param0 > -35) {
          this.field_m = -72;
        }
        bi.f(5, 5, -5 + bd.field_e, -5 + nh.field_P);
        la.a(30);
        qk.a(6, -(2 * this.field_q) + 640, -11 + nh.field_P, 3 + (this.field_q + vh.field_b), false);
        la.field_d.b((byte) -55);
        if (nh.field_P != 480) {
          var2 = -5 + nh.field_P;
          for (var3 = 6; var3 < var2; var3 += 130) {
            lo.field_i.b(vh.field_b + this.field_q, var3);
          }
          for (var3Lifetime1 = 6; var3Lifetime1 < var2; var3Lifetime1 += 128) {
            mo.field_a.b(640 + vh.field_b - this.field_q, var3Lifetime1);
          }
        } else {
          lo.field_i.b(this.field_q + vh.field_b, 136);
          lo.field_i.b(this.field_q + vh.field_b, 6);
          mo.field_a.b(640 + (vh.field_b - this.field_q), 6);
          mo.field_a.b(-this.field_q + vh.field_b + 640, 134);
        }
        bi.c();
        ql.field_g.b(vh.field_b, id.field_M / 2);
        super.a((byte) -112);
    }

    final void d(byte param0) {
        int var5 = 0;
        int[] stackIn_5_0 = null;
        int var2;
        int var3;
        int[] var4;
        String var6;
        int var7;
        int var8;
        int var9;
        String var10;
        int[] var11;
        int[] var12;
        var9 = ZombieDawn.field_J;
        this.field_m = 0;
        var2 = 0;
        var3 = -77 / ((14 - param0) / 54);
        while (var2 < 2) {
          if (var2 == 0) {
            stackIn_5_0 = jj.c(1, 122).field_h;
          } else {
            stackIn_5_0 = jj.c(14, 73).field_h;
          }
          var12 = stackIn_5_0;
          var11 = var12;
          var4 = var11;
          for (var5 = 0; var12.length > var5; var5++) {
            var10 = vk.field_b[var12[var5]];
            var7 = sg.field_jb.b(var10);
            if (var12[var5] == 37) {
              var8 = sg.field_jb.b(wl.field_a[1]);
              if (var7 < var8) {
                var6 = wl.field_a[1];
                var7 = var8;
              }
            }
            if (var12[var5] == 12 ||
              var12[var5] == 13) {
              var7 += 140;
            }
            if (var7 > this.field_m) {
              this.field_m = var7;
            }
          }
          var2++;
        }
        this.field_s = 320 - (this.field_m >> 1);
        this.field_q = this.field_s - 20;
        if (null == la.field_d) {
          la.field_d = new uh(true);
        }
    }

    pg(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void a(byte param0, boolean param1) {
        super.a((byte) 95, param1);
        la.field_d.a(ei.field_K, ha.field_b, true);
        int var3 = 87 % ((-39 - param0) / 61);
    }

    final static void a(boolean param0, java.applet.Applet param1, long param2, String param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              if (!param0) {
                pg.d(68);
              }
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (0L > param2) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + jb.a(2147483647, pd.a(-22826) + param2 * 1000L) + "; Max-Age=" + param2;
              }
              qe.a("document.cookie=\"" + var7Lifetime4 + "\"", param1, (byte) 125);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("pg.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
          param0.addMouseListener(ng.field_b);
          param0.addMouseMotionListener(ng.field_b);
          param0.addFocusListener(ng.field_b);
          if (param1 != 66) {
            field_n = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "pg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -5) {
          String var2 = (String) null;
          pg.a(true, (java.applet.Applet) null, 14L, (String) null, (String) null);
        }
        field_r = null;
        field_t = null;
        field_n = null;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
          this.field_m = -123;
        }
        return this.field_m + (this.field_s + vh.field_b);
    }

    final static void c(int param0) {
        re.a((byte) -71);
        if (null != cj.field_d) {
          fa.a((byte) -46, cj.field_d);
        }
        fc.o((byte) -101);
        jo.x(-2);
        hg.c(param0 ^ 1);
        if (lb.m(-83)) {
          dp.field_e.j(11, 1);
          vl.a((byte) -46, 0);
        }
        p.a(param0);
    }

    static {
        field_n = "Retry (<%0> Left)";
        field_r = "Names should contain a maximum of 12 characters";
    }
}
