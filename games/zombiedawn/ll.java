/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static boolean field_a;

    final static void a(int param0, int param1) {
        if (ej.field_o == ob.field_b[param0]) {
          ej.field_o = null;
        }
        if (tm.field_h == kd.field_Fb[param0]) {
          tm.field_h = null;
        }
        if (param1 != 4767999) {
          return;
        }
        vn[][] var4 = ob.field_b;
        vn[][] var2 = var4;
        kd.field_Fb[param0] = null;
        int var3 = param0;
        var4[var3] = null;
    }

    final static void a(dj param0, dj param1, dj param2, int param3) {
        int var11_int = 0;
        v[] var5 = null;
        v[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        v[] var10 = null;
        vn var11 = null;
        vn var12 = null;
        int var13 = 0;
        v[] var14 = null;
        vn var15 = null;
        int[][] var16 = null;
        vn var17 = null;
        vn var18 = null;
        int[][] var19 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var8Lifetime1;
        int var9Lifetime1;
        var13 = ZombieDawn.field_J;
        try {
          ad.field_f = vm.a((byte) 117, "frame_top", "commonui", param1);
          dp.field_b = vm.a((byte) -44, "frame_bottom", "commonui", param1);
          we.field_Tb = gf.a(param1, "jagex_logo_grey", 8, "commonui");
          ia.field_d = vm.a((byte) -83, "button", "commonui", param1);
          dj.field_k = df.a((byte) 24, "commonui", "validation", param1);
          ii.field_a = (rb) ((Object) ra.a(param0, "commonui", "arezzo12", param3 + 19041, param1));
          ia.field_e = (rb) ((Object) ra.a(param0, "commonui", "arezzo14", param3 + 19041, param1));
          rk.field_b = (rb) ((Object) ra.a(param0, "commonui", "arezzo14bold", 0, param1));
          var17 = new vn(param2.a("", param3 ^ 19000, "button.gif"), (java.awt.Component) ((Object) cj.field_d));
          vj.a(param1, "dropdown", "commonui", 4424743);
          var5 = dd.a("commonui", "screen_options", -1864, param1);
          af.field_c = new v[4];
          ti.field_e = new v[4];
          li.field_h = new v[4];
          var6 = new v[][]{ti.field_e, li.field_h, af.field_c};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_l;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_k[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = ud.a(var5[var9], var19[var11_int], -27837);
            }
          }
          var9Lifetime1 = var17.field_t;
          hk.i(1584);
          var17.a();
          bi.a(0, 0, bi.field_f, bi.field_a);
          var15 = new vn(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.a();
          var17.e(0, 0);
          var11 = new vn(var9Lifetime1, var9Lifetime1);
          var11.a();
          var17.e(var9Lifetime1 - var17.field_w, 0);
          var12 = new vn(var17.field_w - 2 * var9Lifetime1, var9Lifetime1);
          var12.a();
          var17.e(-var9Lifetime1, 0);
          pa.a(-21189);
          ia.field_d = new vn[]{var15, var12, var11};
          if (param3 != -19041) {
            ll.a(110, -88);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ll.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void a(boolean param0, de param1);

    abstract nk a(byte param0);

    final static void a(int param0) {
        int var3 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        mf stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mf var9 = null;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        try {
          var1_int = eb.field_a - eb.field_c;
          eb.field_c = -(var1_int >> 1) + im.field_d;
          eb.field_a = eb.field_c + var1_int;
          el.field_k = sc.field_b - (qk.field_Mb >> 1);
          var2 = el.field_k;
          if (param0 > -45) {
            return;
          }
          for (var3 = 0; n.field_r.length > var3; var3++) {
            var4 = la.field_b[var3];
            if (var4 >= 0) {
              if (var4 == kk.field_m.field_d) {
                var5 = ej.field_s;
              } else {
                var5 = qi.field_E;
              }
            } else {
              var5 = qg.field_f;
            }
            var6 = n.field_r[var3];
            stackIn_12_0 = 32564;
            stackIn_13_1 = !(0 > var4);
            var7 = sm.a(stackIn_12_0, stackIn_13_1, var6);
            var8 = -(var7 >> 1) + im.field_d;
            if (var4 >= 0) {
              if (kk.field_m.field_d != var4) {
                stackIn_17_0 = dd.field_b;
              } else {
                stackIn_17_0 = qi.field_G;
              }
              var9 = stackIn_17_0;
              var2 = var2 + qb.field_i;
              if (var9 != null) {
                var9.a((nb.field_m << 1) + var7, var2, -nb.field_m + var8, (byte) -118, ma.field_k + (lb.field_Y << 1));
              }
              var2 = var2 + lb.field_Y;
            }
            if (var4 >= 0) {
              wb.field_m.c(var6, var8, pf.field_g + var2, var5, -1);
              var2 = var2 + (ma.field_k + lb.field_Y + qb.field_i);
            } else {
              re.field_g.c(var6, var8, fa.field_p + var2, var5, -1);
              var2 = var2 + mh.field_G;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "ll.A(" + param0 + ')');
        }
    }

    static {
        field_a = false;
    }
}
