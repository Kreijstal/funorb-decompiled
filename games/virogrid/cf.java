/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_b;
    static float field_c;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -95 / ((param0 - 66) / 45);
    }

    final static void loadCommonUi(Js5Archive param0, Js5Archive param1, int param2, Js5Archive param3) {
        Sprite var17 = null;
        rm[] var5 = null;
        rm[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        rm[] var14 = null;
        int var11_int = 0;
        Sprite var15 = null;
        Sprite var18 = null;
        Sprite var11 = null;
        Sprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Virogrid.field_F ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          if (param2 < 51) {
            cf.a(105);
          }
          qm.frameTopSprites = ke.a(32, param0, "commonui", "frame_top");
          qg.frameBottomSprites = ke.a(32, param0, "commonui", "frame_bottom");
          ed.jagexLogoGrey = sn.a(param0, "jagex_logo_grey", "commonui", false);
          td.buttonSprites = ke.a(32, param0, "commonui", "button");
          bf.field_p = jj.a("commonui", param0, false, "validation");
          dk.arezzo12Font = (e) ((Object) pc.a(param0, -1, "commonui", "arezzo12", param3));
          dj.arezzo14Font = (e) ((Object) pc.a(param0, -1, "commonui", "arezzo14", param3));
          on.arezzo14BoldFont = (e) ((Object) pc.a(param0, -1, "commonui", "arezzo14bold", param3));
          var17 = new Sprite(param1.a("button.gif", 100, ""), (java.awt.Component) ((Object) UiWidget.field_v));
          vc.a(param0, "dropdown", "commonui", (byte) 39);
          var5 = ke.a("screen_options", "commonui", param0, 32370);
          dk.field_q = new rm[4];
          hj.field_g = new rm[4];
          PacketBuffer.field_h = new rm[4];
          var6 = new rm[][]{hj.field_g, PacketBuffer.field_h, dk.field_q};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_m;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_n[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            rm[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = fe.a(var5[var9], var19[var11_int], (byte) -107);
            }
          }
          var9Lifetime1 = var17.field_p;
          lm.a(0);
          var17.b();
          Rasterizer.e(0, 0, Rasterizer.field_e, Rasterizer.field_f);
          var15 = new Sprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.b();
          var17.b(0, 0);
          var11 = new Sprite(var9Lifetime1, var9Lifetime1);
          var11.b();
          var17.b(var9Lifetime1 - var17.field_w, 0);
          var12 = new Sprite(var17.field_w - var9Lifetime1 * 2, var9Lifetime1);
          var12.b();
          var17.b(-var9Lifetime1, 0);
          ai.a(true);
          td.buttonSprites = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "cf.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        if (ij.field_j != null) {
          Rasterizer.g(Rasterizer.field_i, Rasterizer.field_g, -Rasterizer.field_i + Rasterizer.field_k, Rasterizer.field_h - Rasterizer.field_g);
          ij.field_j.a(param1, 24960);
        }
        if (param0 > -94) {
          cf.a((byte) 1);
        }
    }

    final static ck a(byte param0) {
        if (param0 >= -19) {
          cj var2 = (cj) null;
          cf.a((cj) null, (byte) 82);
        }
        if (pa.field_l == kh.field_e) {
          throw new IllegalStateException();
        }
        if (pa.field_l != rg.field_d) {
          return null;
        }
        pa.field_l = kh.field_e;
        return vb.field_c;
    }

    final static int[] b(int param0) {
        if (param0 != -30481) {
          return (int[]) null;
        }
        return new int[8];
    }

    final static void a(cj param0, byte param1) {
        int var2_int = 0;
        cj var3 = null;
        int var4 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (null == param0.field_h) {
            return;
          }
          if (param1 < 6) {
            field_c = 1.6972997188568115f;
          }
          if (param0.field_m != 0 ||
            param0.field_a != 0) {
            for (var2_int = 0; qh.field_K > var2_int; var2_int++) {
              var3 = BufferedSocket.field_s[var2_int];
              if (var3.field_n == 2 &&
                param0.field_m == var3.field_m &&
                param0.field_a == var3.field_a) {
                return;
              }
            }
          }
          if (param0.field_g != null) {
            i.field_F = param0.field_n;
            ca.field_O = param0.field_i;
            an.field_a = param0.field_p;
            sh.field_ub = param0.field_g;
          }
          ln.a(param0, 107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("cf.A(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Offer draw";
    }
}
