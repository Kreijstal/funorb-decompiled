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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int stackIn_19_0 = 0;
        byte[] var2;
        byte[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        float var13;
        float var14;
        float var15;
        int var16;
        byte[] var17;
        byte[] var18;
        byte[] var19;
        byte[] var20;
        byte[] var21;
        byte[] var22;
        byte[] var23;
        byte[] var24;
        L0: {
          var16 = Sumoblitz.field_L ? 1 : 0;
          if (this.field_e != null) {
            break L0;
          } else {
            L1: {
              if (ab.field_b == null) {
                var22 = mr.a(0.6000000238418579f, 0.5f, 128, -30865, new vu(419684), 4.0f, 4.0f, 16.0f, 16, 8, 128);
                var19 = var22;
                var18 = var19;
                var2 = var18;
                ab.field_b = aj.a((byte) -121, var22, false);
                break L1;
              } else {
                break L1;
              }
            }
            var23 = ab.a(false, ab.field_b, 0);
            var20 = var23;
            var17 = var20;
            var2 = var17;
            var24 = new byte[4 * var23.length];
            var21 = var24;
            var3 = var21;
            var4 = 0;
            var5 = 0;
            L2: while (true) {
              if (16 <= var5) {
                this.field_e = this.field_a.a(true, nl.field_p, 16, 128, var24, 128);
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
                        incrementValue$0 = var4;
                        var4++;
                        var3[incrementValue$0] = (byte)(int)(127.0f + var15 * var14);
                        incrementValue$1 = var4;
                        var4++;
                        var3[incrementValue$1] = (byte)(int)(127.0f + 128.0f * var15);
                        incrementValue$2 = var4;
                        var4++;
                        var3[incrementValue$2] = (byte)(int)(var13 * var15 + 127.0f);
                        incrementValue$3 = var4;
                        var4++;
                        incrementValue$4 = var6;
                        var6++;
                        var3[incrementValue$3] = var2[incrementValue$4];
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
            this.field_g = true;
            break L5;
          }
        }
        L6: {
          if (this.field_e == null) {
            stackIn_19_0 = 0;
            break L6;
          } else {
            stackIn_19_0 = 1;
            break L6;
          }
        }
        return stackIn_19_0 != 0;
    }

    final boolean c(int param0) {
        if (param0 <= 14) {
            return false;
        }
        return !this.field_g ? this.field_d != null ? true : false : null != this.field_f ? true : false;
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
        mk stackIn_2_0 = null;
        Object stackIn_13_0 = null;
        mk stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_long = jaggl.OpenGL.glCreateShaderObjectARB(param2);
            jaggl.OpenGL.glShaderSourceARB(var4_long, param3);
            jaggl.OpenGL.glCompileShaderARB(var4_long);
            jaggl.OpenGL.glGetObjectParameterivARB(var4_long, 35713, cl.field_z, 0);
            if (!param1) {
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
                    if (-2 <= (cl.field_z[1] ^ -1)) {
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
                    stackIn_13_0 = null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              stackIn_15_0 = new mk(param0, var4_long, param2);
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = (mk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4);

            stackIn_18_1 = new StringBuilder().append("sk.C(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (mk) ((Object) stackIn_13_0);
          } else {
            return stackIn_15_0;
          }
        }
    }

    sk(aw param0) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        this.field_e = null;
        this.field_f = null;
        this.field_d = null;
        this.field_b = null;
        try {
          L0: {
            L1: {
              this.field_a = param0;
              this.field_g = this.field_a.field_Eb;
              if (!this.field_g) {
                break L1;
              } else {
                if (this.field_a.a((byte) -42, io.field_g, ps.field_c)) {
                  break L1;
                } else {
                  this.field_g = false;
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_g) {
                break L2;
              } else {
                if (this.field_a.a(io.field_g, ps.field_c, 6)) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              as.f(23369);
              if (!this.field_g) {
                this.field_d = new ru[16];
                var2_int = 0;
                L4: while (true) {
                  if (-17 >= (var2_int ^ -1)) {
                    this.field_b = new ru[16];
                    var2_int = 0;
                    L5: while (true) {
                      if (var2_int >= 16) {
                        break L3;
                      } else {
                        var18 = iq.a(mk.field_d, 14381, 32768, 32768 * var2_int);
                        this.field_b[var2_int] = this.field_a.a(var18, 128, 128, ps.field_c, 0, true);
                        var2_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var17 = iq.a(pd.field_n, 14381, 32768, var2_int * 32768);
                    this.field_d[var2_int] = this.field_a.a(var17, 128, 128, ps.field_c, 0, true);
                    var2_int++;
                    continue L4;
                  }
                }
              } else {
                var15 = ab.a(false, pd.field_n, 0);
                this.field_f = this.field_a.a(true, ps.field_c, 16, 128, var15, 128);
                var16 = ab.a(false, mk.field_d, 0);
                this.field_a.a(true, ps.field_c, 16, 128, var16, 128);
                break L3;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2);

            stackIn_19_1 = new StringBuilder().append("sk.<init>(");

            if (param0 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
    }
}
