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

    public static void a() {
        field_f = null;
        field_d = null;
    }

    b(fr param0) {
        try {
            ((b) this).field_e = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "b.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
        RuntimeException var5 = null;
        kf var6 = null;
        int var7 = 0;
        int var8 = 0;
        float var9 = 0.0f;
        int var10 = 0;
        cs var11 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (((b) this).b((byte) -101)) {
              L1: {
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
                  L2: while (true) {
                    if (var8 >= param0.field_o) {
                      jaggl.OpenGL.glUseProgramObjectARB(0L);
                      jaggl.OpenGL.glPopAttrib();
                      jaggl.OpenGL.glPopMatrix();
                      jaggl.OpenGL.glMatrixMode(5888);
                      var7 = 1;
                      jaggl.OpenGL.glPopMatrix();
                      break L1;
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
                      continue L2;
                    }
                  }
                } else {
                  break L1;
                }
              }
              var11.a(0, 17012);
              ((b) this).field_e.a((byte) -72, (mw) (Object) var11);
              stackOut_10_0 = var7;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("b.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
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
        RuntimeException decompiledCaughtException = null;
        var16 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = ig.field_a;
              var2 = var13.e(-31302);
              if (var2 == 0) {
                int discarded$2 = -14808;
                var11 = lr.a();
                var19 = var11;
                var18 = var19;
                var17 = var18;
                var15 = var17;
                var3 = var15;
                var10 = var11;
                var4 = var10;
                var5 = var13;
                var6 = ((fs) (Object) var5).e(-31302);
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
                if (var2 != 1) {
                  if (var2 == 2) {
                    var14 = (eg) (Object) wr.field_E.b(123);
                    if (var14 == null) {
                      kk.a((byte) -122);
                      return;
                    } else {
                      int discarded$3 = -14808;
                      var14.field_m = lr.a();
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
                  var12 = (hg) (Object) hi.field_f.b(-116);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "b.D(" + -30084 + ')');
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
