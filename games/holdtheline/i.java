/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends vn {
    static int[] field_j;
    static vi[] field_k;
    static int[] field_l;
    static java.awt.Image field_i;
    static kf field_m;

    final static void a(boolean param0, gn param1, gn param2, gn param3) {
        bm[] var14 = null;
        int var11_int = 0;
        hj var11 = null;
        hj var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = HoldTheLine.field_D;
        int var8Lifetime1;
        ja.field_Db = si.a(param3, 33, "commonui", "frame_top");
        te.field_b = si.a(param3, 33, "commonui", "frame_bottom");
        di.field_t = dl.a(param3, "commonui", false, "jagex_logo_grey");
        vm.field_Ab = si.a(param3, 33, "commonui", "button");
        ef.field_i = ce.a("validation", 17870, "commonui", param3);
        mo.field_w = (qi) ((Object) ga.a("commonui", "arezzo12", param1, (byte) 35, param3));
        hl.field_g = (qi) ((Object) ga.a("commonui", "arezzo14", param1, (byte) 35, param3));
        de.field_I = (qi) ((Object) ga.a("commonui", "arezzo14bold", param1, (byte) 35, param3));
        hj var17 = new hj(param2.a("", !param0 ? true : false, "button.gif"), (java.awt.Component) ((Object) kd.field_b));
        hc.a("dropdown", param3, -120, "commonui");
        bm[] var5 = oc.a("screen_options", param3, (byte) 32, "commonui");
        ef.field_g = new bm[4];
        ef.field_d = new bm[4];
        ug.field_d = new bm[4];
        bm[][] var6 = new bm[][]{ef.field_d, ef.field_g, ug.field_d};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_n;
        for (var8 = 1; var19.length > var8; var8++) {
          var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        var8Lifetime1 = var5[0].field_m[0];
        var19[2][var8Lifetime1] = 16777215;
        var19[1][var8Lifetime1] = 2394342;
        var19[3][var8Lifetime1] = 4767999;
        for (var9 = 0; var9 < 3; var9++) {
          var14 = var6[var9];
          bm[] var10 = var14;
          for (var11_int = 0; var14.length > var11_int; var11_int++) {
            var14[var11_int] = rl.a(var19[var11_int], -116, var5[var9]);
          }
        }
        var9 = var17.field_y;
        lj.a((byte) -124);
        var17.f();
        tc.g(0, 0, tc.field_j, tc.field_c);
        hj var15 = new hj(var9, var9);
        hj var18 = var15;
        var18.f();
        if (!param0) {
          return;
        }
        try {
          var17.b(0, 0);
          var11 = new hj(var9, var9);
          var11.f();
          var17.b(-var17.field_s + var9, 0);
          var12 = new hj(var17.field_s - 2 * var9, var9);
          var12.f();
          var17.b(-var9, 0);
          dm.b((byte) -10);
          vm.field_Ab = new hj[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "i.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(gj param0, gj param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        float var5 = 0.0f;
        in var6 = null;
        in var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        qm var11 = null;
        qm var12 = null;
        int var13 = 0;
        wb var14 = null;
        try {
          var14 = new wb(param1.field_t, param0.field_t);
          var4 = var14.a(-113);
          var5 = (float)Math.sqrt((double)var4);
          var6 = var14.a(var5, (byte) 121);
          if (param2 != -6218) {
            i.a((byte) -15, true);
          }
          var7 = var6.a((byte) -41);
          var8 = (float)(-(param0.field_u * param0.field_u) + (var4 + param1.field_u * param1.field_u));
          var8 = var8 / (var5 * 2.0f);
          var9 = -(var8 * var8) + (float)(param1.field_u * param1.field_u);
          if (0.0f > var9) {
            stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          var10 = (float)Math.sqrt((double)var9);
          var6.a(var8, param2 ^ 6217);
          var7.a(var10, -1);
          var11 = new qm(param1.field_t);
          var11.a(var6, (byte) 109);
          if (0.0010000000474974513f > var9) {
            mm.field_d = ha.a(param1.field_t, var11, false);
            lk.field_b = ha.a(param0.field_t, var11, false);
            if (param1.a(mm.field_d, param2 ^ -10910) &&
              param0.a(lk.field_b, param2 ^ -10910)) {
              stackIn_19_0 = 1;
              return stackIn_19_0;
            }
            stackIn_21_0 = 0;
            return stackIn_21_0;
          }
          var12 = new qm(var11);
          var11.a(var7, (byte) 122);
          var12.a(var7, -13201);
          mm.field_d = ha.a(param1.field_t, var11, false);
          var13 = 0;
          lk.field_b = ha.a(param0.field_t, var11, false);
          if (param1.a(mm.field_d, 13012) &&
            param0.a(lk.field_b, 13012)) {
            var13++;
          }
          rb.field_g = ha.a(param1.field_t, var12, false);
          cj.field_G = ha.a(param0.field_t, var12, false);
          if (param1.a(rb.field_g, param2 + 19230) &&
            param0.a(cj.field_G, 13012)) {
            var13++;
            if (var13 == 1) {
              mm.field_d = rb.field_g;
              lk.field_b = cj.field_G;
            }
          }
          stackIn_15_0 = var13;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_24_0 = var3;
          stackIn_24_1 = new StringBuilder().append("i.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1) {
        ej.field_b = dg.field_c;
        if (param0 <= 43) {
          String var3 = (String) null;
          i.a(100, -42, -85, (String) null, -48);
        }
        if (dg.field_c == 13) {
          ((ec) (l.field_a[dg.field_c])).d((byte) -120);
        } else {
          if (dg.field_c != -1) {
            ((ti) (l.field_a[dg.field_c])).i(105);
          }
        }
        gg.field_L = param1;
        vg.field_G = 1;
    }

    final static tk a(int param0, int param1, int param2, String param3, int param4) {
        String var5 = null;
        RuntimeException var5_ref = null;
        String var6 = null;
        oa var7 = null;
        oa var8 = null;
        tk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param3 + "_accelerate+loop";
          if (param0 >= -104) {
            field_i = (java.awt.Image) null;
          }
          var6 = param3 + "_decelerate";
          var7 = new oa(var5, param2);
          var8 = new oa(var6, param4);
          var7.field_m = oh.a(var7, param1, 89);
          var7.field_l = var7.field_n.length;
          stackIn_3_0 = new tk(var7, var8);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("i.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        cg.a(param4, param0, param3, (byte) 41, param1);
        if (param2 != -51) {
          gn var7 = (gn) null;
          i.a(true, (gn) null, (gn) null, (gn) null);
        }
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 != -3) {
          i.a((byte) -104, true);
        }
        field_j = null;
        field_i = null;
        field_k = null;
        field_l = null;
    }

    i() {
    }

    static {
        field_j = fc.a(-45, 5, 36);
        field_l = new int[]{4, 4, 4};
    }
}
