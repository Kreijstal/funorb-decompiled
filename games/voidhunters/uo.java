/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo extends rqa {
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          dw.field_b = param0[0].a(90);
          if (param1 < -119) {
            stackIn_4_0 = new nc("void");
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uo.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    uo(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(asb param0, asb param1, asb param2, int param3) {
        phb var17 = null;
        caa[] var5 = null;
        caa[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        caa[] var14 = null;
        int var11_int = 0;
        phb var15 = null;
        phb var18 = null;
        phb var11 = null;
        phb var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = VoidHunters.field_G;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          vsa.field_p = wjb.a(param1, true, "commonui", "frame_top");
          oqa.field_q = wjb.a(param1, true, "commonui", "frame_bottom");
          wf.field_a = gra.a(param1, "jagex_logo_grey", "commonui", true);
          eia.field_o = wjb.a(param1, true, "commonui", "button");
          ps.field_a = hma.a("commonui", -90, param1, "validation");
          web.field_o = (no) ((Object) vda.a(0, "commonui", param1, param2, "arezzo12"));
          loa.field_o = (no) ((Object) vda.a(0, "commonui", param1, param2, "arezzo14"));
          vob.field_r = (no) ((Object) vda.a(0, "commonui", param1, param2, "arezzo14bold"));
          var17 = new phb(param0.a("", true, "button.gif"), (java.awt.Component) ((Object) igb.field_a));
          ef.a("dropdown", "commonui", param3 ^ -60, param1);
          var5 = qu.a(-124, "commonui", "screen_options", param1);
          cw.field_p = new caa[4];
          tw.field_f = new caa[4];
          fja.field_q = new caa[4];
          var6 = new caa[][]{fja.field_q, cw.field_p, tw.field_f};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_i;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_j[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            caa[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = mhb.a(94, var5[var9], var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.field_p;
          vbb.e(param3 + 3);
          var17.b();
          dma.a(0, 0, dma.field_g, dma.field_j);
          var15 = new phb(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.b();
          var17.c(0, 0);
          var11 = new phb(var9Lifetime1, var9Lifetime1);
          var11.b();
          var17.c(var9Lifetime1 - var17.field_q, 0);
          var12 = new phb(var17.field_q - var9Lifetime1 * 2, var9Lifetime1);
          var12.b();
          var17.c(-var9Lifetime1, param3);
          bia.a((byte) 124);
          eia.field_o = new phb[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "uo.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
    }
}
