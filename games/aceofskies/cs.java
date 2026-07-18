/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs {
    private wl field_c;
    static rk field_d;
    static int field_a;
    private in field_b;

    final boolean a(byte param0, sr param1, sr param2, float param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        cu var7 = null;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        int var11 = 0;
        wj var12 = null;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_10_0 = 0;
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
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (!((cs) this).b(true)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var6 = 114 % ((param0 - 32) / 42);
                var12 = ((cs) this).field_c.field_o;
                var7 = new cu(((cs) this).field_c, 6408, param1.field_l, param1.field_m);
                var8 = 0;
                ((cs) this).field_c.a((up) (Object) var12, 32925);
                var12.a(var7, 0, (byte) 119);
                if (!var12.d((byte) -64)) {
                  break L1;
                } else {
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glMatrixMode(5889);
                  jaggl.OpenGL.glPushMatrix();
                  jaggl.OpenGL.glLoadIdentity();
                  jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
                  jaggl.OpenGL.glPushAttrib(2048);
                  jaggl.OpenGL.glViewport(0, 0, param1.field_l, param1.field_m);
                  jaggl.OpenGL.glUseProgramObjectARB(((cs) this).field_b.field_d);
                  jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(((cs) this).field_b.field_d, "heightMap"), 0);
                  jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(((cs) this).field_b.field_d, "rcpRelief"), 1.0f / param3);
                  jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(((cs) this).field_b.field_d, "sampleSize"), 1.0f / (float)param2.field_l, 1.0f / (float)param2.field_m);
                  var9 = 0;
                  L2: while (true) {
                    if (param1.field_n <= var9) {
                      jaggl.OpenGL.glUseProgramObjectARB(0L);
                      jaggl.OpenGL.glPopAttrib();
                      jaggl.OpenGL.glPopMatrix();
                      jaggl.OpenGL.glMatrixMode(5888);
                      var8 = 1;
                      jaggl.OpenGL.glPopMatrix();
                      break L1;
                    } else {
                      var10 = (float)var9 / (float)param1.field_n;
                      ((cs) this).field_c.a((rt) (Object) param2, 1);
                      jaggl.OpenGL.glBegin(7);
                      jaggl.OpenGL.glTexCoord3f(0.0f, 0.0f, var10);
                      jaggl.OpenGL.glVertex2f(0.0f, 0.0f);
                      jaggl.OpenGL.glTexCoord3f(1.0f, 0.0f, var10);
                      jaggl.OpenGL.glVertex2f(1.0f, 0.0f);
                      jaggl.OpenGL.glTexCoord3f(1.0f, 1.0f, var10);
                      jaggl.OpenGL.glVertex2f(1.0f, 1.0f);
                      jaggl.OpenGL.glTexCoord3f(0.0f, 1.0f, var10);
                      jaggl.OpenGL.glVertex2f(0.0f, 1.0f);
                      jaggl.OpenGL.glEnd();
                      param1.a(0, 0, -105, param1.field_m, param1.field_l, var9, 0, 0);
                      var9++;
                      continue L2;
                    }
                  }
                }
              }
              var12.a(0, (byte) -107);
              ((cs) this).field_c.b((byte) -113, (up) (Object) var12);
              stackOut_10_0 = var8;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("cs.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
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
          throw pn.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final boolean b(boolean param0) {
        aq var2 = null;
        aq var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0) {
          if (((cs) this).field_c.field_A) {
            if (((cs) this).field_c.field_lc) {
              if (null == ((cs) this).field_b) {
                var3 = kg.a("uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n", 35632, true, ((cs) this).field_c);
                var2 = var3;
                if (var2 == null) {
                  L0: {
                    if (((cs) this).field_b == null) {
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L0;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_25_0 = stackOut_23_0;
                      break L0;
                    }
                  }
                  return stackIn_25_0 != 0;
                } else {
                  L1: {
                    ((cs) this).field_b = br.a(((cs) this).field_c, new aq[1], (byte) -122);
                    if (((cs) this).field_b == null) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L1;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L1;
                    }
                  }
                  return stackIn_21_0 != 0;
                }
              } else {
                L2: {
                  if (((cs) this).field_b == null) {
                    stackOut_15_0 = 0;
                    stackIn_16_0 = stackOut_15_0;
                    break L2;
                  } else {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L2;
                  }
                }
                return stackIn_16_0 != 0;
              }
            } else {
              L3: {
                if (((cs) this).field_b == null) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L3;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L3;
                }
              }
              return stackIn_11_0 != 0;
            }
          } else {
            L4: {
              if (((cs) this).field_b == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L4;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L4;
              }
            }
            return stackIn_6_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static byte[] a(boolean param0, int param1, int param2, Object param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        af var5 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_5_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          if (param3 != null) {
            int discarded$6 = 1;
            cs.a();
            if (param3 instanceof byte[]) {
              var4 = (byte[]) param3;
              stackOut_5_0 = eu.a(var4, 32768, (byte) 20, param1);
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0;
            } else {
              if (!(param3 instanceof af)) {
                throw new IllegalArgumentException();
              } else {
                var5 = (af) param3;
                stackOut_8_0 = var5.a(-19920, param1, 32768);
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4_ref;
            stackOut_11_1 = new StringBuilder().append("cs.B(").append(false).append(',').append(param1).append(',').append(32768).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L0;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L0;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final static boolean a(cl param0, int param1, cl param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param2.field_cb + -param0.field_cb;
              if (ul.field_s != param2.field_bb) {
                if (null == param2.field_bb) {
                  var3_int += 200;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int -= 200;
                break L1;
              }
            }
            L2: {
              if (ul.field_s == param0.field_bb) {
                var3_int += 200;
                break L2;
              } else {
                if (param0.field_bb != null) {
                  break L2;
                } else {
                  var3_int -= 200;
                  break L2;
                }
              }
            }
            L3: {
              if (var3_int <= 0) {
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L3;
              } else {
                stackOut_11_0 = 1;
                stackIn_13_0 = stackOut_11_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("cs.E(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(-115).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public static void a() {
        field_d = null;
    }

    cs(wl param0) {
        try {
            ((cs) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "cs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
