/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends jh {
    private uc field_L;
    private boolean field_J;
    private int field_M;
    private int field_F;
    static int[] field_G;
    static int field_E;
    private int field_H;
    private String field_D;
    static String[] field_I;

    na(int param0, int param1, int param2, int param3, gm param4, boolean param5, int param6, int param7, uc param8, int param9, String param10) {
        super(param0, param1, param2, param3, (el) null, (ca) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_H = param6;
          this.field_M = param7;
          stackIn_4_1 = (param5);
          this.field_J = stackIn_4_1;
          this.field_C = param4;
          this.field_D = param10;
          this.field_F = param9;
          this.field_L = param8;
          var12_int = this.field_H - this.field_M;
          var13 = this.field_L.a(param10, var12_int, this.field_L.field_x) + this.field_M * 2;
          if (param3 >= var13) {
            var13 = param3;
          } else {
            this.a((byte) 127, param0, param1, var13, param2);
          }
          if (!this.field_J) {
            stackIn_10_0 = this.field_H + this.field_M * 2;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_C.a((byte) 123, var14, (-param3 + var13 >> 1) + this.field_M, param3 - this.field_M * 2, -(this.field_M * 3) + (-this.field_H + param2));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("na.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static int a(da param0, String param1, int param2, da param3, int param4, boolean param5, int param6) {
        int var12 = 0;
        int stackIn_5_0 = 0;
        fj stackIn_11_0 = null;
        String stackIn_12_1 = null;
        fj stackIn_14_0 = null;
        String stackIn_15_1 = null;
        int stackIn_36_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var13 = 0;
        da var14 = null;
        String var15 = null;
        Object var16 = null;
        CharSequence var17 = null;
        int var10Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        var16 = null;
        var13 = Torquing.field_u;
        try {
          var15 = param3.b((byte) -38);
          var8 = param0.b((byte) -107);
          if (null == vk.field_E &&
            !mo.a(269, false)) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (ef.field_a == tb.field_o) {
            jl.field_T = null;
            wa.field_d.field_n = 0;
            if (param1 != null) {
              var9 = 0;
              jb.field_c.field_n = 0;
              if (param5) {
                var9 = var9 | 1;
              }
              jb.field_c.b((byte) 60, sa.field_d.nextInt());
              jb.field_c.b((byte) 60, sa.field_d.nextInt());
              jb.field_c.a(var15, (byte) -72);
              jb.field_c.a(var8, (byte) -72);
              var17 = (CharSequence) ((Object) param1);
              jb.field_c.a(lp.a(var17, 109), (byte) -72);
              jb.field_c.a(param6, 109);
              jb.field_c.b(90, param4);
              jb.field_c.b(90, var9);
              wa.field_d.b(90, 18);
              wa.field_d.field_n = wa.field_d.field_n + 2;
              var10 = wa.field_d.field_n;
              var11_ref_String = rb.a(-108, ip.a(9));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              wa.field_d.b((byte) 4, var11_ref_String);
              ok.a(jb.field_c, ua.field_a, wa.field_d, gk.field_b, -4);
              wa.field_d.c(-var10 + wa.field_d.field_n, param2 + 400395746);
            } else {
              jb.field_c.field_n = 0;
              jb.field_c.b((byte) 60, sa.field_d.nextInt());
              jb.field_c.b((byte) 60, sa.field_d.nextInt());
              stackIn_11_0 = jb.field_c;
              if (!param3.a((byte) 104)) {
                stackIn_12_1 = "";
              } else {
                stackIn_12_1 = var15;
              }
              ((fj) (Object) stackIn_11_0).a(stackIn_12_1, (byte) -72);
              stackIn_14_0 = jb.field_c;
              if (param0.a((byte) -113)) {
                stackIn_15_1 = var8;
              } else {
                stackIn_15_1 = "";
              }
              ((fj) (Object) stackIn_14_0).a(stackIn_15_1, (byte) -72);
              wa.field_d.b(90, 16);
              wa.field_d.field_n = wa.field_d.field_n + 1;
              var9 = wa.field_d.field_n;
              ok.a(jb.field_c, ua.field_a, wa.field_d, gk.field_b, -4);
              wa.field_d.c((byte) 48, -var9 + wa.field_d.field_n);
            }
            jd.a((byte) -118, -1);
            ef.field_a = q.field_c;
          }
          if (param2 != -25978) {
            var14 = (da) null;
            na.a((da) null, (String) null, 121, (da) null, -99, true, 19);
          }
          if (q.field_c == ef.field_a &&
            no.a(1, param2 + 25978)) {
            var9Lifetime1 = kj.field_d.i((byte) -101);
            kj.field_d.field_n = 0;
            if (100 <= var9Lifetime1 &&
              var9Lifetime1 <= 105) {
              kh.field_n = new String[var9Lifetime1 - 100];
              ef.field_a = pl.field_s;
            } else {
              if (248 == var9Lifetime1) {
                ae.a(ip.a(9), (byte) 25);
                pl.field_u = od.field_u;
                ih.b(true);
                lh.field_J = false;
                stackIn_36_0 = var9Lifetime1;
                return stackIn_36_0;
              }
              if (var9Lifetime1 == 99) {
                no.a(ol.b(-92), param2 ^ -25978);
                jl.field_T = new Boolean(ac.a(kj.field_d, 28066));
                kj.field_d.field_n = 0;
              } else {
                fa.field_e = var9Lifetime1;
                ef.field_a = ah.field_b;
                oo.field_a = -1;
              }
            }
          }
          if (pl.field_s == ef.field_a) {
            var9Lifetime2 = 2;
            if (no.a(var9Lifetime2, 0)) {
              var10Lifetime1 = kj.field_d.i(7088);
              kj.field_d.field_n = 0;
              if (no.a(var10Lifetime1, 0)) {
                var11 = kh.field_n.length;
                for (var12 = 0; var12 < var11; var12++) {
                  kh.field_n[var12] = kj.field_d.d(-7519);
                }
                ih.b(true);
                lh.field_J = false;
                stackIn_47_0 = 100 + var11;
                return stackIn_47_0;
              }
            }
          }
          if (ef.field_a == ah.field_b &&
            ah.a(param2 + 25980)) {
            if (fa.field_e != 255) {
              pl.field_u = kj.field_d.h((byte) 124);
            } else {
              var9_ref_String = kj.field_d.a(19);
              if (var9_ref_String != null) {
                om.a((byte) 73, var9_ref_String, ip.a(9));
              }
            }
            ih.b(true);
            lh.field_J = false;
            stackIn_57_0 = fa.field_e;
            return stackIn_57_0;
          }
          if (vk.field_E == null) {
            if (lh.field_J) {
              if (lc.h((byte) -76) > 30000L) {
                pl.field_u = eb.field_h;
              } else {
                pl.field_u = hq.field_e;
              }
              lh.field_J = false;
              stackIn_65_0 = 249;
              return stackIn_65_0;
            }
            var9Lifetime3 = ea.field_t;
            ea.field_t = sf.field_a;
            lh.field_J = true;
            sf.field_a = var9Lifetime3;
          }
          stackIn_67_0 = -1;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("na.J(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param1 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_77_2 = "null";
          } else {
            stackIn_77_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_76_1).append(stackIn_77_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_I = (String[]) null;
        }
        field_I = null;
        field_G = null;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = this.field_w + param3;
        if (param1 >= -7) {
          this.b(85);
        }
        int var6 = param2 + this.field_k;
        super.a(param0, (byte) -91, param2, param3);
        if (param0 != 0) {
          return;
        }
        int var7 = !this.field_J ? 0 : -this.field_H + (this.field_p - 2 * this.field_M);
        this.field_L.a(this.field_D, var5 - (-var7 - this.field_M), var6 + this.field_M, -this.field_M + this.field_H, this.field_o - 2 * this.field_M, this.field_F, -1, !this.field_J ? 2 : 0, 1, this.field_L.field_x);
    }

    final String b(int param0) {
        int var2 = this.field_C.field_s ? 1 : 0;
        this.field_C.field_s = this.field_s;
        String var3 = this.field_C.b(param0);
        this.field_C.field_s = var2 != 0 ? true : false;
        return var3;
    }

    static {
        field_I = new String[]{"By rating", "By win percentage"};
    }
}
