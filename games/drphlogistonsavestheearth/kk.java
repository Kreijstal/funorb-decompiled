/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk {
    static he[][] field_b;
    static String[] field_c;
    static int[] field_a;
    static String[] field_d;

    final static java.net.URL a(java.net.URL param0, java.applet.Applet param1, int param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var4Lifetime1;
        Object var4Lifetime2;
        try {
          var3 = null;
          if (ih.field_J != null &&
            !ih.field_J.equals(param1.getParameter("settings"))) {
            var3 = ih.field_J;
            var4 = var3;
            var4Lifetime2 = var3;
          }
          var4Lifetime1 = null;
          if (ml.field_h != null &&
            !ml.field_h.equals(param1.getParameter("session"))) {
            var4Lifetime1 = ml.field_h;
          }
          if (param2 != 4767999) {
            field_c = (String[]) null;
          }
          stackIn_10_0 = th.a((String) (var3), -1, param0, -1, (String) (var4Lifetime1));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("kk.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.a((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 <= 21) {
          field_d = (String[]) null;
        }
        field_c = null;
        field_b = (he[][]) null;
    }

    final static void a(int param0, vj param1, vj param2, vj param3) {
        nh var18 = null;
        he[] var5 = null;
        he[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        he[] var15 = null;
        nh var16 = null;
        nh var19 = null;
        nh var12 = null;
        nh var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        int var11Lifetime1;
        try {
          ob.field_f = cl.a("commonui", param1, -125, "frame_top");
          kc.field_i = cl.a("commonui", param1, -115, "frame_bottom");
          ck.field_l = qk.a("commonui", param1, "jagex_logo_grey", true);
          rk.field_d = cl.a("commonui", param1, -120, "button");
          ja.field_n = ea.a("validation", "commonui", 0, param1);
          u.field_d = (rf) ((Object) qg.a(param2, "arezzo12", "commonui", param1, 126));
          uh.field_i = (rf) ((Object) qg.a(param2, "arezzo14", "commonui", param1, -100));
          wi.field_e = (rf) ((Object) qg.a(param2, "arezzo14bold", "commonui", param1, 106));
          var18 = new nh(param3.a("button.gif", "", 24874), (java.awt.Component) ((Object) n.field_g));
          eh.a("commonui", (byte) -45, param1, "dropdown");
          var5 = ij.a("screen_options", (byte) 113, param1, "commonui");
          al.field_d = new he[4];
          qb.field_b = new he[4];
          gd.field_b = new he[4];
          var6 = new he[][]{al.field_d, qb.field_b, gd.field_b};
          var20 = new int[4][];
          var17 = var20;
          var7 = var17;
          var7[0] = var5[0].field_l;
          for (var8 = 1; var8 < var20.length; var8++) {
            var7[var8] = (int[]) ((Object) var20[0].clone());
          }
          var8Lifetime1 = var5[0].field_m[0];
          var20[2][var8Lifetime1] = 16777215;
          var20[1][var8Lifetime1] = 2394342;
          var20[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var15 = var6[var9];
            he[] var10 = var15;
            for (var11 = 0; var11 < var15.length; var11++) {
              var15[var11] = a.a(var5[var9], var20[var11], (byte) -122);
            }
          }
          var9Lifetime1 = var18.field_w;
          aj.a(true);
          var18.c();
          var11Lifetime1 = 101 % ((22 - param0) / 61);
          wj.e(0, 0, wj.field_k, wj.field_c);
          var16 = new nh(var9Lifetime1, var9Lifetime1);
          var19 = var16;
          var19.c();
          var18.a(0, 0);
          var12 = new nh(var9Lifetime1, var9Lifetime1);
          var12.c();
          var18.a(-var18.field_y + var9Lifetime1, 0);
          var13 = new nh(var18.field_y - var9Lifetime1 * 2, var9Lifetime1);
          var13.c();
          var18.a(-var9Lifetime1, 0);
          cl.d((byte) -73);
          rk.field_d = new nh[]{var16, var13, var12};
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "kk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(long param0, boolean param1) {
        if (0L >= param0) {
          return;
        }
        if (param0 % 10L == 0L) {
          lh.b(param0 - 1L, (byte) 120);
          lh.b(1L, (byte) -3);
        } else {
          lh.b(param0, (byte) -124);
        }
        if (!param1) {
          kk.a(-113L, false);
        }
    }

    static {
        field_b = new he[2][];
        field_d = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
