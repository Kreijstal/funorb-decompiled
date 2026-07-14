/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cs {
    private wl field_c;
    static rk field_d;
    static int field_a;
    private in field_b;

    final boolean a(byte param0, sr param1, sr param2, float param3) {
        int var6 = 0;
        cu var7 = null;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        int var11 = 0;
        wj var12 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (!((cs) this).b(true)) {
          return false;
        } else {
          L0: {
            var6 = 114 % ((param0 - 32) / 42);
            var12 = ((cs) this).field_c.field_o;
            var7 = new cu(((cs) this).field_c, 6408, ((sr) param1).field_l, ((sr) param1).field_m);
            var8 = 0;
            ((cs) this).field_c.a((up) (Object) var12, 32925);
            var12.a(var7, 0, (byte) 119);
            if (!var12.d((byte) -64)) {
              break L0;
            } else {
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glMatrixMode(5889);
              jaggl.OpenGL.glPushMatrix();
              jaggl.OpenGL.glLoadIdentity();
              jaggl.OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
              jaggl.OpenGL.glPushAttrib(2048);
              jaggl.OpenGL.glViewport(0, 0, ((sr) param1).field_l, ((sr) param1).field_m);
              jaggl.OpenGL.glUseProgramObjectARB(((cs) this).field_b.field_d);
              jaggl.OpenGL.glUniform1iARB(jaggl.OpenGL.glGetUniformLocationARB(((cs) this).field_b.field_d, "heightMap"), 0);
              jaggl.OpenGL.glUniform1fARB(jaggl.OpenGL.glGetUniformLocationARB(((cs) this).field_b.field_d, "rcpRelief"), 1.0f / param3);
              jaggl.OpenGL.glUniform2fARB(jaggl.OpenGL.glGetUniformLocationARB(((cs) this).field_b.field_d, "sampleSize"), 1.0f / (float)((sr) param2).field_l, 1.0f / (float)((sr) param2).field_m);
              var9 = 0;
              L1: while (true) {
                if (((sr) param1).field_n <= var9) {
                  jaggl.OpenGL.glUseProgramObjectARB(0L);
                  jaggl.OpenGL.glPopAttrib();
                  jaggl.OpenGL.glPopMatrix();
                  jaggl.OpenGL.glMatrixMode(5888);
                  var8 = 1;
                  jaggl.OpenGL.glPopMatrix();
                  break L0;
                } else {
                  var10 = (float)var9 / (float)((sr) param1).field_n;
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
                  param1.a(0, 0, -105, ((sr) param1).field_m, ((sr) param1).field_l, var9, 0, 0);
                  var9++;
                  continue L1;
                }
              }
            }
          }
          var12.a(0, (byte) -107);
          ((cs) this).field_c.b((byte) -113, (up) (Object) var12);
          return var8 != 0;
        }
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
        af var5 = null;
        if (param3 != null) {
          if (!param0) {
            if (param3 instanceof byte[]) {
              var4 = (byte[]) (byte[]) param3;
              return eu.a(var4, param2, (byte) 20, param1);
            } else {
              if (param3 instanceof af) {
                var5 = (af) param3;
                return var5.a(-19920, param1, param2);
              } else {
                throw new IllegalArgumentException();
              }
            }
          } else {
            cs.a(true);
            if (param3 instanceof byte[]) {
              var4 = (byte[]) (byte[]) param3;
              return eu.a(var4, param2, (byte) 20, param1);
            } else {
              if (param3 instanceof af) {
                var5 = (af) param3;
                return var5.a(-19920, param1, param2);
              } else {
                throw new IllegalArgumentException();
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(cl param0, int param1, cl param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          var3 = ((cl) param2).field_cb + -((cl) param0).field_cb;
          if (ul.field_s != ((cl) param2).field_bb) {
            if (null == ((cl) param2).field_bb) {
              // wide iinc 3 200
              break L0;
            } else {
              break L0;
            }
          } else {
            // wide iinc 3 -200
            break L0;
          }
        }
        L1: {
          if (param1 < -50) {
            break L1;
          } else {
            field_a = -104;
            break L1;
          }
        }
        if (ul.field_s != ((cl) param0).field_bb) {
          if (((cl) param0).field_bb == null) {
            L2: {
              // wide iinc 3 -200
              if ((var3 ^ -1) >= -1) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L2;
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                break L2;
              }
            }
            return stackIn_20_0 != 0;
          } else {
            L3: {
              if ((var3 ^ -1) >= -1) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L3;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L3;
              }
            }
            return stackIn_16_0 != 0;
          }
        } else {
          L4: {
            // wide iinc 3 200
            if ((var3 ^ -1) >= -1) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L4;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L4;
            }
          }
          return stackIn_11_0 != 0;
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
            field_d = (rk) null;
        }
    }

    cs(wl param0) {
        ((cs) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
    }
}
