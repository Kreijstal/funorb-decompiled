/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends rqa {
    static String field_o;

    final static void a(int param0) {
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        int[] var27 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        int[] var28 = null;
        int var2 = 0;
        int var2Lifetime1;
        og.field_r = vq.field_x.field_e.field_g;
        cw.field_o = feb.a(og.field_r, true);
        java.awt.Dimension var9 = vq.field_x.field_e.field_a.getSize();
        og.field_r.KA(0, 0, var9.width, var9.height);
        ocb.f(-10150);
        if (param0 != -9934) {
          qkb var8 = (qkb) null;
          jc.a((byte) 16, (asb) null, -27, (qkb) null);
          ad.a(-126);
          var2 = eaa.field_q;
          eaa.field_q = vq.field_x.field_e.field_b.field_a;
          if (var2 != eaa.field_q &&
            ef.field_E) {
            bea.a((byte) 44, "graphics_mode", eaa.field_q);
            qra.a(-123);
          }
          if (eaa.field_q != 1) {
            return;
          }
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
          if (ssa.b(param0 ^ -9936)) {
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
          return;
        }
        ad.a(-126);
        var2Lifetime1 = eaa.field_q;
        eaa.field_q = vq.field_x.field_e.field_b.field_a;
        if (var2Lifetime1 != eaa.field_q) {
          if (!ef.field_E) {
            if (eaa.field_q != 1) {
              return;
            }
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
            if (ssa.b(param0 ^ -9936)) {
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
            return;
          }
          bea.a((byte) 44, "graphics_mode", eaa.field_q);
          qra.a(-123);
        }
        if (eaa.field_q != 1) {
          return;
        }
        String var22 = jaggl.OpenGL.glGetString(7936);
        String var23 = jaggl.OpenGL.glGetString(7938);
        String var24 = jaggl.OpenGL.glGetString(7937);
        String var25 = jaggl.OpenGL.glGetString(7939);
        System.out.println("GL_VENDOR " + var22);
        System.out.println("GL_VERSION " + var23);
        System.out.println("GL_RENDERER " + var24);
        System.out.println("GL_EXTENSIONS " + var25);
        int[] var29 = new int[1];
        jaggl.OpenGL.glGetIntegerv(3379, var29, 0);
        System.out.println("GL_MAX_TEXTURE_SIZE: " + var29[0]);
        if (ssa.b(param0 ^ -9936)) {
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
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -119) {
            stackIn_4_0 = new nc(frb.a(185, 109));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jc.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
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
