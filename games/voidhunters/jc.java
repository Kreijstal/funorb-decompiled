/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends rqa {
    static String field_o;

    final static void a(int param0) {
        int var2 = 0;
        qkb var8 = null;
        java.awt.Dimension var9 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        String var25 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        og.field_r = vq.field_x.field_e.field_g;
        cw.field_o = feb.a(og.field_r, true);
        var9 = vq.field_x.field_e.field_a.getSize();
        og.field_r.KA(0, 0, var9.width, var9.height);
        ocb.f(-10150);
        if (param0 == -9934) {
          L0: {
            ad.a(-126);
            var2 = eaa.field_q;
            eaa.field_q = vq.field_x.field_e.field_b.field_a;
            if (var2 == eaa.field_q) {
              break L0;
            } else {
              if (ef.field_E) {
                bea.a((byte) 44, "graphics_mode", eaa.field_q);
                qra.a(-123);
                break L0;
              } else {
                if ((eaa.field_q ^ -1) == -2) {
                  var17 = jaggl.OpenGL.glGetString(7936);
                  var18 = jaggl.OpenGL.glGetString(7938);
                  var19 = jaggl.OpenGL.glGetString(7937);
                  var20 = jaggl.OpenGL.glGetString(7939);
                  System.out.println("GL_VENDOR " + var17);
                  System.out.println("GL_VERSION " + var18);
                  System.out.println("GL_RENDERER " + var19);
                  System.out.println("GL_EXTENSIONS " + var20);
                  var28 = new int[1];
                  jaggl.OpenGL.glGetIntegerv(3379, var28, 0);
                  System.out.println("GL_MAX_TEXTURE_SIZE: " + var28[0]);
                  if (!ssa.b(param0 ^ -9936)) {
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
          if ((eaa.field_q ^ -1) == -2) {
            var22 = jaggl.OpenGL.glGetString(7936);
            var23 = jaggl.OpenGL.glGetString(7938);
            var24 = jaggl.OpenGL.glGetString(7937);
            var25 = jaggl.OpenGL.glGetString(7939);
            System.out.println("GL_VENDOR " + var22);
            System.out.println("GL_VERSION " + var23);
            System.out.println("GL_RENDERER " + var24);
            System.out.println("GL_EXTENSIONS " + var25);
            var29 = new int[1];
            jaggl.OpenGL.glGetIntegerv(3379, var29, 0);
            System.out.println("GL_MAX_TEXTURE_SIZE: " + var29[0]);
            if (!ssa.b(param0 ^ -9936)) {
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
        } else {
          L1: {
            var8 = (qkb) null;
            jc.a((byte) 16, (asb) null, -27, (qkb) null);
            ad.a(-126);
            var2 = eaa.field_q;
            eaa.field_q = vq.field_x.field_e.field_b.field_a;
            if (var2 == eaa.field_q) {
              break L1;
            } else {
              if (ef.field_E) {
                bea.a((byte) 44, "graphics_mode", eaa.field_q);
                qra.a(-123);
                break L1;
              } else {
                break L1;
              }
            }
          }
          if ((eaa.field_q ^ -1) == -2) {
            var12 = jaggl.OpenGL.glGetString(7936);
            var13 = jaggl.OpenGL.glGetString(7938);
            var14 = jaggl.OpenGL.glGetString(7937);
            var15 = jaggl.OpenGL.glGetString(7939);
            System.out.println("GL_VENDOR " + var12);
            System.out.println("GL_VERSION " + var13);
            System.out.println("GL_RENDERER " + var14);
            System.out.println("GL_EXTENSIONS " + var15);
            var27 = new int[1];
            jaggl.OpenGL.glGetIntegerv(3379, var27, 0);
            System.out.println("GL_MAX_TEXTURE_SIZE: " + var27[0]);
            if (!ssa.b(param0 ^ -9936)) {
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

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        nc stackOut_1_0 = null;
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
              stackOut_3_0 = new nc(frb.a(185, 109));
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (nc) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("jc.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
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
            throw rta.a((Throwable) ((Object) runtimeException), "jc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    jc(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void b(boolean param0) {
        field_o = null;
        if (param0) {
            jc.b(false);
        }
    }

    static {
        field_o = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
    }
}
