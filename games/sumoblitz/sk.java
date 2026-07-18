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
                int discarded$10 = 128;
                int discarded$11 = 8;
                int discarded$12 = 16;
                var18 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, (ab) (Object) new vu(419684), 4.0f, 4.0f, 16.0f);
                var2 = var18;
                int discarded$13 = 0;
                ab.field_b = aj.a((byte) -121, var18);
                break L1;
              } else {
                break L1;
              }
            }
            int discarded$14 = 0;
            var25 = ab.a(false, ab.field_b);
            var23 = var25;
            var21 = var23;
            var19 = var21;
            var17 = var19;
            var2 = var17;
            var26 = new byte[4 * var25.length];
            var24 = var26;
            var22 = var24;
            var20 = var22;
            var3 = var20;
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (16 <= var5) {
                ((sk) this).field_e = ((sk) this).field_a.a(true, nl.field_p, 16, 128, var26, 128);
                break L0;
              } else {
                var6 = 16384 * var5;
                var7 = var6;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= 128) {
                    var5++;
                    continue L2;
                  } else {
                    var9 = var7 - -(var8 * 128);
                    var10 = var7 + (127 & var8 + -1) * 128;
                    var11 = 128 * (1 + var8 & 127) + var7;
                    var12 = 0;
                    L4: while (true) {
                      if (var12 >= 128) {
                        var8++;
                        continue L3;
                      } else {
                        var13 = (float)((var2[var12 + var10] & 255) + -(var2[var12 + var11] & 255));
                        var14 = (float)((var2[(var12 + -1 & 127) + var9] & 255) - (255 & var2[var9 + (127 & var12 + 1)]));
                        var15 = (float)(128.0 / Math.sqrt((double)(16384.0f + var14 * var14 + var13 * var13)));
                        int incrementValue$15 = var4;
                        var4++;
                        var3[incrementValue$15] = (byte)(int)(127.0f + var15 * var14);
                        int incrementValue$16 = var4;
                        var4++;
                        var3[incrementValue$16] = (byte)(int)(127.0f + 128.0f * var15);
                        int incrementValue$17 = var4;
                        var4++;
                        var3[incrementValue$17] = (byte)(int)(var13 * var15 + 127.0f);
                        int incrementValue$18 = var4;
                        var4++;
                        int incrementValue$19 = var6;
                        var6++;
                        var3[incrementValue$18] = var2[incrementValue$19];
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
        long var4_long = 0L;
        RuntimeException var4 = null;
        byte[] var10 = null;
        Object stackIn_12_0 = null;
        mk stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        mk stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param2);
            jaggl.OpenGL.glShaderSourceARB(var4_long, param3);
            jaggl.OpenGL.glCompileShaderARB(var4_long);
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, cl.field_z, 0);
            L1: {
              if (cl.field_z[0] == 0) {
                L2: {
                  if (cl.field_z[0] == 0) {
                    System.out.println("Shader compile failed:");
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35716, cl.field_z, 1);
                  if (cl.field_z[1] <= 1) {
                    break L3;
                  } else {
                    var10 = new byte[cl.field_z[1]];
                    jaggl.OpenGL.glGetInfoLogARB(var4_long, cl.field_z[1], cl.field_z, 0, var10, 0);
                    System.out.println(new String(var10));
                    break L3;
                  }
                }
                if (0 == cl.field_z[0]) {
                  jaggl.OpenGL.glDeleteObjectARB(var4_long);
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (mk) (Object) stackIn_12_0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            stackOut_13_0 = new mk(param0, var4_long, param2);
            stackIn_14_0 = stackOut_13_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("sk.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
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
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(false).append(',').append(param2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_14_0;
    }

    sk(aw param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        ((sk) this).field_e = null;
        ((sk) this).field_f = null;
        ((sk) this).field_d = null;
        ((sk) this).field_b = null;
        try {
          L0: {
            L1: {
              ((sk) this).field_a = param0;
              ((sk) this).field_g = ((sk) this).field_a.field_Eb;
              if (!((sk) this).field_g) {
                break L1;
              } else {
                if (((sk) this).field_a.a((byte) -42, io.field_g, ps.field_c)) {
                  break L1;
                } else {
                  ((sk) this).field_g = false;
                  break L1;
                }
              }
            }
            L2: {
              if (((sk) this).field_g) {
                break L2;
              } else {
                if (((sk) this).field_a.a(io.field_g, ps.field_c, 6)) {
                  break L2;
                } else {
                  return;
                }
              }
            }
            L3: {
              int discarded$4 = 23369;
              as.f();
              if (!((sk) this).field_g) {
                ((sk) this).field_d = new ru[16];
                var2_int = 0;
                L4: while (true) {
                  if (var2_int >= 16) {
                    ((sk) this).field_b = new ru[16];
                    var2_int = 0;
                    L5: while (true) {
                      if (var2_int >= 16) {
                        break L3;
                      } else {
                        var18 = iq.a(mk.field_d, 14381, 32768, 32768 * var2_int);
                        ((sk) this).field_b[var2_int] = ((sk) this).field_a.a(var18, 128, 128, ps.field_c, 0, true);
                        var2_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var17 = iq.a(pd.field_n, 14381, 32768, var2_int * 32768);
                    ((sk) this).field_d[var2_int] = ((sk) this).field_a.a(var17, 128, 128, ps.field_c, 0, true);
                    var2_int++;
                    continue L4;
                  }
                }
              } else {
                int discarded$5 = 0;
                var15 = ab.a(false, pd.field_n);
                ((sk) this).field_f = ((sk) this).field_a.a(true, ps.field_c, 16, 128, var15, 128);
                int discarded$6 = 0;
                var16 = ab.a(false, mk.field_d);
                nh discarded$7 = ((sk) this).field_a.a(true, ps.field_c, 16, 128, var16, 128);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("sk.<init>(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    static {
    }
}
