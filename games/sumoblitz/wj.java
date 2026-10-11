/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj extends rq {
    private sk field_f;
    static ts field_h;
    private on field_j;
    private wg field_g;
    static int field_e;
    static boolean field_k;
    static ri[] field_i;

    final void a(boolean param0, int param1) {
        jaggl.OpenGL.glBindProgramARB(34336, this.field_g.field_b);
        jaggl.OpenGL.glEnable(34336);
        this.field_b.a(ta.field_a, 0, param1 - 20186);
        if (param1 != 20186) {
          this.field_j = (on) null;
        }
    }

    final void a(int param0, int param1, ed param2) {
        try {
          if (param1 != 18834) {
            wj.d(-57);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wj.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 != 79) {
          wi var2 = (wi) null;
          wj.a((java.awt.Frame) null, (wi) null, false);
        }
    }

    final static void a(java.awt.Frame param0, wi param1, boolean param2) {
        jr var3 = null;
        int var4 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          while (true) {
            var3 = param1.a(param0, 19);
            while (var3.field_c == 0) {
              tg.a(10L, (byte) 81);
            }
            if (var3.field_c != 1) {
              tg.a(100L, (byte) 127);
              continue;
            }
            break;
          }
          param0.setVisible(param2);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("wj.N(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final void c(boolean param0) {
        this.field_b.a(jq.field_a, 0, 0);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        jaggl.OpenGL.glDisable(34336);
        if (param0) {
          ed var3 = (ed) null;
          this.a(11, -28, (ed) null);
        }
    }

    final void a(boolean param0, byte param1) {
        this.field_b.a((byte) -83, cv.field_F, lf.field_e);
        if (param1 >= -71) {
          wj.d(-46);
        }
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        float var4_float = 0.0f;
        if (param0 != 34023) {
          field_e = 83;
        }
        if (this.field_f.field_g) {
          var4_float = (float)(this.field_b.field_kc % 4000) / 4000.0f;
          this.field_b.a(this.field_f.field_f, 96);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
        } else {
          var4 = 16 * (this.field_b.field_kc % 4000) / 4000;
          this.field_b.a(this.field_f.field_d[var4], 114);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        }
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
          this.c(true);
        }
        return this.field_g != null ? true : false;
    }

    final static void d(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        ah var2 = null;
        ah var4 = null;
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int var13 = 0;
        double var14 = 0.0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        float var21 = 0.0f;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var25Lifetime1;
        int var26Lifetime1;
        var29 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null != aa.field_a) {
            for (var1_int = 0; var1_int < db.field_l; var1_int++) {
              var2 = aa.field_a[var1_int];
              if (var2 != null &&
                var2.a((byte) 113)) {
                for (var3 = 1 + var1_int; db.field_l > var3; var3++) {
                  var4 = aa.field_a[var3];
                  if (var4 != null &&
                    var4.a((byte) 113)) {
                    var5 = var2.field_m + var4.field_m;
                    if (wn.a(var2.field_z, var5, -119, var4.field_C, var2.field_C, var4.field_z)) {
                      if (var2.field_x >= 0) {
                        var2.field_x = 150;
                      }
                      if (var4.field_x >= 0) {
                        var4.field_x = 150;
                      }
                      var6 = var2.field_o;
                      var7 = var2.field_L;
                      var9 = var4.field_o;
                      var10 = var4.field_L;
                      var12 = var4.field_C - var2.field_C;
                      var13 = -var2.field_z + var4.field_z;
                      var14 = Math.sqrt((double)(var13 * var13 + var12 * var12));
                      var16 = (float)((double)var12 / var14);
                      var17 = (float)((double)var13 / var14);
                      var18 = (float)Math.sin(var2.field_s);
                      var19 = (float)Math.cos(var2.field_s);
                      var20 = (float)Math.sin(var4.field_s);
                      var21 = (float)Math.cos(var4.field_s);
                      stackIn_21_0 = (!(0.0f < st.a(86, new float[]{var18, var19}, new float[]{var16, var17}))) ? 0 : 1;
                      var22 = stackIn_21_0;
                      stackIn_24_0 = (!(st.a(89, new float[]{var20, var21}, new float[]{var16, var17}) < 0.0f)) ? 0 : 1;
                      var23 = stackIn_24_0;
                      if (var23 != 0) {
                        if (var4.field_N == 2 &&
                          var4.field_v == 0) {
                          ro.a(var2, (byte) 113);
                          var4.h((byte) -55);
                        }
                        if (var4.field_N == 3 &&
                          var4.field_v == 0) {
                          var4.field_j = 25;
                          var4.h((byte) -55);
                        }
                      }
                      if (var22 != 0) {
                        if (var2.field_N == 2 &&
                          var2.field_v == 0) {
                          ro.a(var4, (byte) 113);
                          var2.h((byte) -55);
                        }
                        if (3 == var2.field_N &&
                          var2.field_v == 0) {
                          var2.field_j = 25;
                          var2.h((byte) -55);
                        }
                      }
                      if (1 == var2.field_N) {
                        var2.h((byte) -55);
                      }
                      if (var4.field_N == 1) {
                        var4.h((byte) -55);
                      }
                      var2.field_d = 0;
                      var2.field_P = var3;
                      var4.field_P = var1_int;
                      var4.field_d = 0;
                      if (var2.field_Q == 0 &&
                        var2.g(param0 - 22379)) {
                        var4.field_R = true;
                      } else {
                        var4.field_R = false;
                      }
                      if (var4.field_Q == 0 &&
                        var4.g(96)) {
                        var2.field_R = true;
                      } else {
                        var2.field_R = false;
                      }
                      var24 = (int)Math.round(Math.max(1.0, Math.sqrt((double)((float)var12 * (float)var12 + (float)var13 * (float)var13))));
                      if (var24 < var5) {
                        var25 = var12 * (var5 - var24) / var24;
                        var4.field_C = var4.field_C + var25;
                        var26 = (var5 - var24) * var13 / var24;
                        var4.field_z = var4.field_z + var26;
                        var2.field_C = var2.field_C - var25;
                        var2.field_z = var2.field_z - var26;
                      }
                      if (!var2.g(param0 - 22327)) {
                        if (var4.g(22)) {
                          if (var4.field_Q != 0) {
                            var10 = var10 * 8.0;
                          } else {
                            var10 = var10 * 10.0;
                          }
                        }
                      } else {
                        if (0 != var2.field_Q) {
                          var7 = var7 * 8.0;
                        } else {
                          var7 = var7 * 10.0;
                        }
                      }
                      var12 = (var12 << 8) / var24;
                      var13 = (var13 << 8) / var24;
                      var25Lifetime1 = (int)(var7 * (double)(Math.max(0, var12 * var2.field_E + var13 * var2.field_A >> 8) * (var6 * 2)));
                      var26Lifetime1 = -(var12 * var2.field_A) + var13 * var2.field_E >> 8;
                      var27 = (int)((double)(Math.max(0, -(var4.field_A * var13) + var12 * -var4.field_E >> 8) * (var9 * 2)) * var10);
                      var28 = var4.field_A * var12 + -var4.field_E * var13 >> 8;
                      var2.field_E = var13 * var26Lifetime1 + -var27 * var12 / var6 >> 8;
                      var2.field_A = -var27 * var13 / var6 - var26Lifetime1 * var12 >> 8;
                      var4.field_E = -(var28 * var13) + var12 * var25Lifetime1 / var9 >> 8;
                      var4.field_A = var25Lifetime1 * var13 / var9 + var28 * var12 >> 8;
                      if (!var2.g(63)) {
                        if (var4.g(param0 - 22319)) {
                          var2.field_E = var2.field_E << 1;
                          var2.field_A = var2.field_A << 1;
                        }
                      } else {
                        var4.field_A = var4.field_A << 1;
                        var4.field_E = var4.field_E << 1;
                      }
                      if (var4.field_Q == 0) {
                        Sumoblitz.a(var2.field_Q, var2.field_N, (byte) -111);
                      }
                      if (0 == var2.field_Q) {
                        Sumoblitz.a(var4.field_Q, var4.field_N, (byte) -93);
                      }
                    }
                  }
                }
              }
            }
          }
          if (param0 != 22403) {
            field_i = (ri[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "wj.H(" + param0 + ')');
        }
    }

    wj(on param0, ki param1, sk param2) {
        super(param0);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          this.field_f = param2;
          this.field_j = param0;
          if (param1 != null &&
            this.field_f.c(83) &&
            this.field_j.field_Ac) {
            this.field_g = ve.a((byte) 103, this.field_j, param1.a("transparent_water", "gl", -1), 34336);
            return;
          }
          this.field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("wj.<init>(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_h = new ts(4, 1, 1, 1);
        field_k = false;
    }
}
