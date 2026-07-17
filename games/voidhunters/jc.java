/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends rqa {
    static String field_o;

    final static void a(int param0) {
        int var2 = 0;
        java.awt.Dimension var8 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          og.field_r = vq.field_x.field_e.field_g;
          cw.field_o = feb.a(og.field_r, true);
          var8 = vq.field_x.field_e.field_a.getSize();
          og.field_r.KA(0, 0, var8.width, var8.height);
          ocb.f(-10150);
          ad.a(-126);
          var2 = eaa.field_q;
          eaa.field_q = vq.field_x.field_e.field_b.field_a;
          if (var2 == eaa.field_q) {
            break L0;
          } else {
            if (ef.field_E) {
              bea.a((byte) 44, (Object) (Object) "graphics_mode", eaa.field_q);
              qra.a(-123);
              break L0;
            } else {
              if (eaa.field_q == 1) {
                var11 = jaggl.OpenGL.glGetString(7936);
                var12 = jaggl.OpenGL.glGetString(7938);
                var13 = jaggl.OpenGL.glGetString(7937);
                var14 = jaggl.OpenGL.glGetString(7939);
                System.out.println("GL_VENDOR " + var11);
                System.out.println("GL_VERSION " + var12);
                System.out.println("GL_RENDERER " + var13);
                System.out.println("GL_EXTENSIONS " + var14);
                var21 = new int[1];
                jaggl.OpenGL.glGetIntegerv(3379, var21, 0);
                System.out.println("GL_MAX_TEXTURE_SIZE: " + var21[0]);
                if (!ssa.b(2)) {
                  return;
                } else {
                  System.out.println("has_memorypools: " + og.field_r.a());
                  System.out.println("has_volatile_backbuffer: " + og.field_r.w());
                  System.out.println("has_resizable_backbuffer: " + og.field_r.n());
                  System.out.println("has_offscreen_rendering: " + og.field_r.x());
                  System.out.println("has_slow_offscreen_rendering: " + og.field_r.r());
                  System.out.println("has_shadows: " + og.field_r.q());
                  System.out.println("has_bloom: " + og.field_r.c());
                  System.out.println("has_envmap: " + og.field_r.k());
                  System.out.println("has_antialiasing: " + og.field_r.f());
                  System.out.println("has_multiplethreads: " + og.field_r.h());
                  System.out.println("has_fasttexturedparticles: " + og.field_r.l());
                  System.out.println("has_underwater: " + og.field_r.e());
                  System.out.println("has_farzclipplane: " + og.field_r.p());
                  System.out.println("has_multiple_canvases: " + og.field_r.m());
                  System.out.println("has_pointlights: " + og.field_r.a(-76));
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (eaa.field_q == 1) {
          var16 = jaggl.OpenGL.glGetString(7936);
          var17 = jaggl.OpenGL.glGetString(7938);
          var18 = jaggl.OpenGL.glGetString(7937);
          var19 = jaggl.OpenGL.glGetString(7939);
          System.out.println("GL_VENDOR " + var16);
          System.out.println("GL_VERSION " + var17);
          System.out.println("GL_RENDERER " + var18);
          System.out.println("GL_EXTENSIONS " + var19);
          var22 = new int[1];
          jaggl.OpenGL.glGetIntegerv(3379, var22, 0);
          System.out.println("GL_MAX_TEXTURE_SIZE: " + var22[0]);
          if (!ssa.b(2)) {
            return;
          } else {
            System.out.println("has_memorypools: " + og.field_r.a());
            System.out.println("has_volatile_backbuffer: " + og.field_r.w());
            System.out.println("has_resizable_backbuffer: " + og.field_r.n());
            System.out.println("has_offscreen_rendering: " + og.field_r.x());
            System.out.println("has_slow_offscreen_rendering: " + og.field_r.r());
            System.out.println("has_shadows: " + og.field_r.q());
            System.out.println("has_bloom: " + og.field_r.c());
            System.out.println("has_envmap: " + og.field_r.k());
            System.out.println("has_antialiasing: " + og.field_r.f());
            System.out.println("has_multiplethreads: " + og.field_r.h());
            System.out.println("has_fasttexturedparticles: " + og.field_r.l());
            System.out.println("has_underwater: " + og.field_r.e());
            System.out.println("has_farzclipplane: " + og.field_r.p());
            System.out.println("has_multiple_canvases: " + og.field_r.m());
            System.out.println("has_pointlights: " + og.field_r.a(-76));
            return;
          }
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 <= -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(185, 109));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("jc.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, asb param1, int param2, qkb param3) {
        tha.field_p = param2 * wjb.e(204) / 1000;
        ce.a(param1, false);
        km.a(param1, (byte) 36);
        hob.a(param0 ^ 107, param1);
        pm.e((byte) -39);
        if (param0 != 55) {
            return;
        }
        try {
            ls.a(121);
            nd.field_r = 0 - tha.field_p;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "jc.B(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    jc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_o = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
