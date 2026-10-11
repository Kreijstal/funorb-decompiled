/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj extends ub {
    private String field_K;
    private int field_I;
    private int field_G;
    private qi field_J;
    static String field_N;
    private boolean field_M;
    private int field_L;
    static String field_H;

    final String f(int param0) {
        int var2 = this.field_B.field_p ? 1 : 0;
        this.field_B.field_p = this.field_p;
        String var3 = this.field_B.f(param0);
        this.field_B.field_p = var2 != 0 ? true : false;
        return var3;
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        try {
          o.field_d = param1;
          ec.field_v = param3;
          da.a(param0, qd.field_g, 22676);
          if (param2 >= -5) {
            dj.h(108);
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "dj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    dj(int param0, int param1, int param2, int param3, n param4, boolean param5, int param6, int param7, qi param8, int param9, String param10) {
        super(param0, param1, param2, param3, (dh) null, (tb) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_J = param8;
          this.field_K = param10;
          this.field_I = param9;
          this.field_L = param6;
          this.field_B = param4;
          this.field_G = param7;
          stackIn_4_1 = (param5);
          this.field_M = stackIn_4_1;
          var12_int = -this.field_G + this.field_L;
          var13 = this.field_J.b(param10, var12_int, this.field_J.field_G) + this.field_G * 2;
          if (var13 > param3) {
            this.a(param0, (byte) 122, param1, var13, param2);
          } else {
            var13 = param3;
          }
          if (this.field_M) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = this.field_L + 2 * this.field_G;
          }
          var14 = stackIn_10_0;
          this.field_B.a(var14, (byte) 122, (-param3 + var13 >> 1) + this.field_G, param3 - this.field_G * 2, param2 - this.field_L - this.field_G * 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("dj.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        if (param0 != 18701) {
          dj.b(-116, -1);
        }
        field_H = null;
        field_N = null;
    }

    final static void a(int param0, vk param1, boolean param2) {
        int var15 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        wd var4 = null;
        qm var5 = null;
        qm var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        int[] var13 = null;
        int var14 = 0;
        int[] var16 = null;
        int[] var17 = null;
        var15 = HoldTheLine.field_D;
        try {
          if (param1.field_o != 0) {
            if (param1.field_o != 1) {
              if (param1.field_o == 2) {
                a.field_F.field_b.b(0, 0);
                mn.a(param1.field_u, new qd(lk.field_a.field_b), (byte) -40);
              } else {
                if (param1.field_o == 3) {
                  kc.field_b.field_b.b(0, 0);
                  mn.a(param1.field_u, new qd(ug.field_b.field_b, 0.5f), (byte) -102);
                } else {
                  if (4 == param1.field_o) {
                    ug.field_b.field_b.b(0, 0);
                    mn.a(param1.field_u, new qd(ha.field_i.field_b, 0.5f), (byte) -30);
                  } else {
                    if (param1.field_o != 5) {
                      if (param1.field_o == 6) {
                        hg.field_Q.field_b.b(0, 0);
                        tn.a(param1.field_u, 10000536, new qd(fd.field_e.field_b));
                      }
                    } else {
                      ha.field_i.field_b.b(0, 0);
                      mn.a(param1.field_u, new qd(kc.field_b.field_b, 0.5f), (byte) -125);
                    }
                  }
                }
              }
            } else {
              a.field_F.field_b.b(0, 0);
              mn.a(param1.field_u, new qd(hf.field_h.field_b), (byte) -15);
            }
          } else {
            ol.field_h.field_b.b(0, 0);
            mn.a(param1.field_u, new qd(fd.field_e.field_b), (byte) -23);
          }
          if (param0 != 2 &&
            param0 != 6) {
            if (2 != param1.field_p) {
              stackIn_23_0 = (param1.field_p == 1) ? 13941600 : 16777215;
            } else {
              stackIn_23_0 = 8372223;
            }
            var3_int = stackIn_23_0;
            var4 = param1.field_u[0];
            var5 = var4.c(true);
            var6 = var4.o(-14);
            var7 = (float)((var6.field_h + var5.field_h) / 2) + 0.5f;
            var8 = (float)((var6.field_f + var5.field_f) / 2) + 0.5f;
            var9 = (float)(var6.field_h - var5.field_h);
            var10 = (float)(var6.field_f - var5.field_f);
            var11 = (float)Math.sqrt((double)(var9 * var9 + var10 * var10));
            var10 = var10 / var11;
            var9 = var9 / var11;
            var12 = (int)(6.0f + var11) / 12;
            var17 = new int[8];
            var16 = var17;
            var13 = var16;
            var14 = -var12;
            while (var12 > var14) {
              var13[3] = (int)(var10 * (float)(6 + 6 * var14) + var8 - var9 * 0.0f);
              var13[5] = (int)(var8 + (float)(var14 * 6 + 6) * var10 - 6.0f * var9);
              var13[0] = (int)(var9 * (float)(6 * var14) + var7 + var10 * 0.0f);
              var13[4] = (int)(var7 + (float)(6 * var14 + 6) * var9 + 6.0f * var10);
              var13[6] = (int)(var10 * 6.0f + (var9 * (float)(6 * var14) + var7));
              var13[1] = (int)(-(var9 * 0.0f) + (var10 * (float)(var14 * 6) + var8));
              var13[2] = (int)(var10 * 0.0f + (var7 + (float)(6 + 6 * var14) * var9));
              var13[7] = (int)(-(6.0f * var9) + (var10 * (float)(var14 * 6) + var8));
              var14++;
              gf.a(var17, var3_int);
              var13[7] = (int)(var8 + (float)(var14 * 6) * var10 + 6.0f * var9);
              var13[1] = (int)(0.0f * var9 + (var10 * (float)(var14 * 6) + var8));
              var13[5] = (int)(var8 + (float)(var14 * 6 + 6) * var10 + var9 * 6.0f);
              var13[2] = (int)(-(0.0f * var10) + ((float)(6 + var14 * 6) * var9 + var7));
              var13[4] = (int)(-(var10 * 6.0f) + (var7 + (float)(6 + var14 * 6) * var9));
              var13[0] = (int)(-(0.0f * var10) + (var7 + var9 * (float)(var14 * 6)));
              var13[3] = (int)(var9 * 0.0f + (var8 + (float)(6 + var14 * 6) * var10));
              var13[6] = (int)(-(var10 * 6.0f) + (var7 + (float)(var14 * 6) * var9));
              gf.a(var17, var3_int);
              var14++;
            }
          }
          if (param2) {
            field_N = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("dj.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = HoldTheLine.field_D;
        if (param1 != 28433) {
          field_N = (String) null;
        }
        var2 = 0;
        var3 = cf.field_q;
        if (var3 < 5) {
          var2 = var3 * var3 * 8192 / 1100;
        } else {
          if (var3 < 105) {
            var2 = (-40960 + var3 * 16384) / 220;
          } else {
            if (120 > var3) {
              var3 = -var3 + 120;
              var2 = -(8192 * (var3 * var3) / 3300) + 8192;
            }
          }
        }
        var4 = 1;
        var5 = 0;
        if (param0 == 3) {
          var4 = -1;
        }
        if (param0 == 1) {
          var5 = 1;
        }
        if (param0 == 4) {
          var5 = 1;
          var4 = 1;
        }
        if (param0 == 5) {
          var5 = 1;
          var4 = -1;
        }
        if (6 == param0) {
          var4 = 1;
          var5 = -1;
        }
        if (param0 == 7 ||
          param0 == 8) {
          var4 = -1;
          var5 = -1;
        }
        if (11 == param0) {
          var4 = -1;
        }
        if (12 == param0) {
          var5 = -1;
          var4 = -1;
        }
        if (param0 == 13) {
          var4 = 1;
          var5 = -1;
        }
        if (param0 == 14) {
          var4 = -1;
          var5 = 1;
        }
        if (param0 == 15) {
          var4 = 1;
          var5 = 1;
        }
        fe.field_b = ti.a(var2 * var5, var4 * var2, (byte) -90);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        if (param0 != -9532) {
          this.field_K = (String) null;
        }
        int var5 = this.field_k + param2;
        int var6 = this.field_o + param1;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param3 == 0) {
          var7 = this.field_M ? -(this.field_G * 2) + (-this.field_L + this.field_x) : 0;
          this.field_J.a(this.field_K, this.field_G + (var7 + var5), var6 + this.field_G, this.field_L - this.field_G, -(this.field_G * 2) + this.field_u, this.field_I, -1, this.field_M ? 0 : 2, 1, this.field_J.field_G);
          return;
        }
    }

    static {
        field_N = "Unfortunately we are unable to create an account for you at this time.";
        field_H = "<img=10>";
    }
}
