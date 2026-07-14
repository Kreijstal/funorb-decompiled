/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    nh field_e;
    nh field_f;
    static ri[] field_c;
    boolean field_g;
    private aw field_a;
    ru[] field_d;
    private ru[] field_b;

    final boolean a(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        int var16 = 0;
        byte[] var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        byte[] var26 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        L0: {
          var16 = Sumoblitz.field_L ? 1 : 0;
          if (((sk) this).field_e != null) {
            break L0;
          } else {
            L1: {
              if (ab.field_b == null) {
                var28 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, (ab) (Object) new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
                var25 = var28;
                var22 = var25;
                var19 = var22;
                var18 = var19;
                var2 = var18;
                ab.field_b = aj.a((byte) -121, var28, false);
                break L1;
              } else {
                break L1;
              }
            }
            var29 = ab.a(false, ab.field_b, 0);
            var26 = var29;
            var23 = var26;
            var20 = var23;
            var17 = var20;
            var2 = var17;
            var30 = new byte[4 * var29.length];
            var27 = var30;
            var24 = var27;
            var21 = var24;
            var3 = var21;
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (16 <= var5) {
                ((sk) this).field_e = ((sk) this).field_a.a(true, nl.field_p, 16, 128, var30, 128);
                break L0;
              } else {
                var6 = 16384 * var5;
                var7 = var6;
                var8 = 0;
                L3: while (true) {
                  if ((var8 ^ -1) <= -129) {
                    var5++;
                    continue L2;
                  } else {
                    var9 = var7 - -(var8 * 128);
                    var10 = var7 + (127 & var8 + -1) * 128;
                    var11 = 128 * (1 + var8 & 127) + var7;
                    var12 = 0;
                    L4: while (true) {
                      if (-129 >= (var12 ^ -1)) {
                        var8++;
                        continue L3;
                      } else {
                        var13 = (float)((var2[var12 + var10] & 255) + -(var2[var12 + var11] & 255));
                        var14 = (float)((var2[(var12 + -1 & 127) + var9] & 255) - (255 & var2[var9 + (127 & var12 + 1)]));
                        var15 = (float)(128.0 / Math.sqrt((double)(16384.0f + var14 * var14 + var13 * var13)));
                        var4++;
                        var3[var4] = (byte)(int)(127.0f + var15 * var14);
                        var4++;
                        var3[var4] = (byte)(int)(127.0f + 128.0f * var15);
                        var4++;
                        var3[var4] = (byte)(int)(var13 * var15 + 127.0f);
                        var4++;
                        var6++;
                        var3[var4] = var2[var6];
                        var12++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L5: {
          if (param0 <= -120) {
            break L5;
          } else {
            ((sk) this).field_g = true;
            break L5;
          }
        }
        L6: {
          if (((sk) this).field_e == null) {
            stackOut_18_0 = 0;
            stackIn_19_0 = stackOut_18_0;
            break L6;
          } else {
            stackOut_17_0 = 1;
            stackIn_19_0 = stackOut_17_0;
            break L6;
          }
        }
        return stackIn_19_0 != 0;
    }

    final boolean c(int param0) {
        int stackIn_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 > 14) {
          L0: {
            if (((sk) this).field_g) {
              if (null == ((sk) this).field_f) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L0;
              }
            } else {
              if (((sk) this).field_d == null) {
                stackOut_5_0 = 0;
                stackIn_9_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 1;
                stackIn_9_0 = stackOut_4_0;
                break L0;
              }
            }
          }
          return stackIn_9_0 != 0;
        } else {
          return false;
        }
    }

    public static void b(int param0) {
        if (param0 != 128) {
            sk.b(-102);
        }
        field_c = null;
    }

    final static mk a(fr param0, boolean param1, int param2, String param3) {
        byte[] var8 = null;
        long var4 = jaggl.OpenGL.glCreateShaderObjectARB(param2);
        jaggl.OpenGL.glShaderSourceARB(var4, param3);
        jaggl.OpenGL.glCompileShaderARB(var4);
        jaggl.OpenGL.glGetObjectParameterivARB(var4, 35713, cl.field_z, 0);
        if (param1) {
            return null;
        }
        if (!(cl.field_z[0] != 0)) {
            if (!(cl.field_z[0] != 0)) {
                System.out.println("Shader compile failed:");
            }
            jaggl.OpenGL.glGetObjectParameterivARB(var4, 35716, cl.field_z, 1);
            if (-2 > (cl.field_z[1] ^ -1)) {
                var8 = new byte[cl.field_z[1]];
                jaggl.OpenGL.glGetInfoLogARB(var4, cl.field_z[1], cl.field_z, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (!(0 != cl.field_z[0])) {
                jaggl.OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new mk(param0, var4, param2);
    }

    sk(aw param0) {
        int var2 = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        L0: {
          ((sk) this).field_e = null;
          ((sk) this).field_f = null;
          ((sk) this).field_d = null;
          ((sk) this).field_b = null;
          ((sk) this).field_a = param0;
          ((sk) this).field_g = ((sk) this).field_a.field_Eb;
          if (!((sk) this).field_g) {
            break L0;
          } else {
            if (((sk) this).field_a.a((byte) -42, io.field_g, ps.field_c)) {
              break L0;
            } else {
              ((sk) this).field_g = false;
              break L0;
            }
          }
        }
        L1: {
          if (((sk) this).field_g) {
            break L1;
          } else {
            if (((sk) this).field_a.a(io.field_g, ps.field_c, 6)) {
              break L1;
            } else {
            }
          }
        }
        L2: {
          as.f(23369);
          if (!((sk) this).field_g) {
            ((sk) this).field_d = new ru[16];
            var2 = 0;
            L3: while (true) {
              if (-17 >= (var2 ^ -1)) {
                ((sk) this).field_b = new ru[16];
                var2 = 0;
                L4: while (true) {
                  if (var2 >= 16) {
                    break L2;
                  } else {
                    var18 = iq.a(mk.field_d, 14381, 32768, 32768 * var2);
                    ((sk) this).field_b[var2] = ((sk) this).field_a.a(var18, 128, 128, ps.field_c, 0, true);
                    var2++;
                    continue L4;
                  }
                }
              } else {
                var17 = iq.a(pd.field_n, 14381, 32768, var2 * 32768);
                ((sk) this).field_d[var2] = ((sk) this).field_a.a(var17, 128, 128, ps.field_c, 0, true);
                var2++;
                continue L3;
              }
            }
          } else {
            var15 = ab.a(false, pd.field_n, 0);
            ((sk) this).field_f = ((sk) this).field_a.a(true, ps.field_c, 16, 128, var15, 128);
            var16 = ab.a(false, mk.field_d, 0);
            nh discarded$1 = ((sk) this).field_a.a(true, ps.field_c, 16, 128, var16, 128);
            break L2;
          }
        }
    }

    static {
    }
}
