/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static volatile int field_a;
    static String field_d;
    static boolean field_c;
    private fr field_e;
    static String field_f;
    private sn field_b;

    public static void a(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 != -69) {
            field_f = null;
        }
    }

    b(fr param0) {
        ((b) this).field_e = param0;
    }

    final static void c(byte param0) {
        if (param0 <= 1) {
            return;
        }
        if (!(null != lt.field_m)) {
            return;
        }
        if (null != gk.field_o) {
            ib.d(1);
        }
    }

    final boolean b(byte param0) {
        mk var3 = null;
        mk var2 = null;
        if (((b) this).field_e.field_xc) {
            if (!(!((b) this).field_e.field_wb)) {
                if (((b) this).field_b == null) {
                    var3 = sk.a(((b) this).field_e, false, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
                    var2 = var3;
                    if (!(var2 == null)) {
                        ((b) this).field_b = hc.a(-14382, new mk[1], ((b) this).field_e);
                    }
                }
            }
        }
        if (param0 != -101) {
            field_a = -88;
        }
        return null != ((b) this).field_b ? true : false;
    }

    final boolean a(ek param0, float param1, boolean param2, ek param3) {
        kf var6 = null;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        cs var11 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        if (((b) this).b((byte) -101)) {
          L0: {
            var11 = ((b) this).field_e.field_G;
            var6 = new kf(((b) this).field_e, 6408, param0.field_p, param0.field_q);
            ((b) this).field_e.a((mw) (Object) var11, -98);
            var7 = param2 ? 1 : 0;
            var11.a(var6, 0, -14269);
            if (var11.h(-276)) {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
              jaggl.OpenGL.glPushAttrib(2048);
              jaggl.OpenGL.glViewport(0, 0, param0.field_p, param0.field_q);
              jaggl.OpenGL.glUseProgramObjectARB(((b) this).field_b.field_c);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(((b) this).field_b.field_c, "heightMap"), 0);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(((b) this).field_b.field_c, "rcpRelief"), 1.0f / param1);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(((b) this).field_b.field_c, "sampleSize"), 1.0f / (float)param3.field_p, 1.0f / (float)param3.field_q);
              var8 = 0;
              L1: while (true) {
                if (var8 >= param0.field_o) {
                  jaggl.OpenGL.glUseProgramObjectARB(0L);
                  jaggl.OpenGL.glPopAttrib();
                  jaggl.OpenGL.glPopMatrix();
                  jaggl.OpenGL.glMatrixMode(5888);
                  var7 = 1;
                  jaggl.OpenGL.glPopMatrix();
                  break L0;
                } else {
                  var9 = (float)var8 / (float)param0.field_o;
                  ((b) this).field_e.a(117, (ht) (Object) param3);
                  jaggl.OpenGL.glBegin(7);
                  jaggl.OpenGL.glTexCoord3f(0.0f, 0.0f, var9);
                  jaggl.OpenGL.glVertex2f(0.0f, 0.0f);
                  jaggl.OpenGL.glTexCoord3f(1.0f, 0.0f, var9);
                  jaggl.OpenGL.glVertex2f(1.0f, 0.0f);
                  jaggl.OpenGL.glTexCoord3f(1.0f, 1.0f, var9);
                  jaggl.OpenGL.glVertex2f(1.0f, 1.0f);
                  jaggl.OpenGL.glTexCoord3f(0.0f, 1.0f, var9);
                  jaggl.OpenGL.glVertex2f(0.0f, 1.0f);
                  jaggl.OpenGL.glEnd();
                  param0.a(0, (byte) 80, 0, var8, param0.field_q, param0.field_p, 0, 0);
                  var8++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          var11.a(0, 17012);
          ((b) this).field_e.a((byte) -72, (mw) (Object) var11);
          return var7 != 0;
        } else {
          return false;
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        pl var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var10 = null;
        int[] var11 = null;
        hg var12 = null;
        pl var13 = null;
        eg var14 = null;
        int[] var15 = null;
        Object var16 = null;
        eg var16_ref = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        L0: {
          var16 = null;
          var8 = Sumoblitz.field_L ? 1 : 0;
          if (param0 == -30084) {
            break L0;
          } else {
            b.c((byte) -53);
            break L0;
          }
        }
        L1: {
          var13 = ig.field_a;
          var2 = var13.e(-31302);
          if (var2 == 0) {
            var11 = lr.a(-14808);
            var19 = var11;
            var18 = var19;
            var17 = var18;
            var15 = var17;
            var3 = var15;
            var10 = var11;
            var4 = var10;
            var5 = var13;
            var6 = ((fs) (Object) var5).e(param0 + -1218);
            var7 = 0;
            L2: while (true) {
              if (var7 >= var6) {
                var16_ref = (eg) (Object) wr.field_E.b(-120);
                if (var16_ref == null) {
                  kk.a((byte) -111);
                  return;
                } else {
                  var16_ref.field_o = true;
                  var16_ref.field_k = var19[0];
                  var16_ref.field_m = var3;
                  var16_ref.b(false);
                  break L1;
                }
              } else {
                var10[var7] = ((fs) (Object) var5).c(true);
                var7++;
                continue L2;
              }
            }
          } else {
            if (-2 != (var2 ^ -1)) {
              if (-3 == (var2 ^ -1)) {
                var14 = (eg) (Object) wr.field_E.b(123);
                if (var14 == null) {
                  kk.a((byte) -122);
                  return;
                } else {
                  var14.field_m = lr.a(-14808);
                  var14.field_o = true;
                  var14.field_k = var14.field_m[0];
                  var14.b(false);
                  break L1;
                }
              } else {
                ms.a("A1: " + di.b((byte) 110), (Throwable) null, 0);
                kk.a((byte) -120);
                break L1;
              }
            } else {
              var12 = (hg) (Object) hi.field_f.b(param0 + 29968);
              if (var12 == null) {
                kk.a((byte) -113);
                return;
              } else {
                var12.b(false);
                break L1;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_d = "You are not currently logged in to the<nbsp>game.";
        field_f = "Loading levels";
    }
}
