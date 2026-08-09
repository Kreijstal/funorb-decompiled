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
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              o.field_d = param1;
              ec.field_v = param3;
              da.a(param0, qd.field_g, 22676);
              if (param2 < -5) {
                break L1;
              } else {
                dj.h(108);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("dj.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    dj(int param0, int param1, int param2, int param3, n param4, boolean param5, int param6, int param7, qi param8, int param9, String param10) {
        super(param0, param1, param2, param3, (dh) null, (tb) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          L0: {
            L1: {
              this.field_J = param8;
              this.field_K = param10;
              this.field_I = param9;
              this.field_L = param6;
              this.field_B = param4;
              this.field_G = param7;
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((dj) (this)).field_M = stackIn_4_1 != 0;
              var12_int = -this.field_G + this.field_L;
              var13 = this.field_J.b(param10, var12_int, this.field_J.field_G) - -(this.field_G * 2);
              if (var13 > param3) {
                this.a(param0, (byte) 122, param1, var13, param2);
                break L2;
              } else {
                var13 = param3;
                break L2;
              }
            }
            L3: {
              if (this.field_M) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = this.field_L + 2 * this.field_G;
                break L3;
              }
            }
            var14 = stackIn_10_0;
            this.field_B.a(var14, (byte) 122, (-param3 + var13 >> -755336223) + this.field_G, param3 + -(this.field_G * 2), param2 - this.field_L + -(this.field_G * 3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var12 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var12);

            stackIn_14_1 = new StringBuilder().append("dj.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param9).append(',');

            if (param10 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ')');
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
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
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
          L0: {
            L1: {
              if (param1.field_o != 0) {
                if ((param1.field_o ^ -1) != -2) {
                  if (param1.field_o == 2) {
                    a.field_F.field_b.b(0, 0);
                    mn.a(param1.field_u, new qd(lk.field_a.field_b), (byte) -40);
                    break L1;
                  } else {
                    if (param1.field_o == 3) {
                      kc.field_b.field_b.b(0, 0);
                      mn.a(param1.field_u, new qd(ug.field_b.field_b, 0.5f), (byte) -102);
                      break L1;
                    } else {
                      if (4 == param1.field_o) {
                        ug.field_b.field_b.b(0, 0);
                        mn.a(param1.field_u, new qd(ha.field_i.field_b, 0.5f), (byte) -30);
                        break L1;
                      } else {
                        if (-6 != (param1.field_o ^ -1)) {
                          if ((param1.field_o ^ -1) != -7) {
                            break L1;
                          } else {
                            hg.field_Q.field_b.b(0, 0);
                            tn.a(param1.field_u, 10000536, new qd(fd.field_e.field_b));
                            break L1;
                          }
                        } else {
                          ha.field_i.field_b.b(0, 0);
                          mn.a(param1.field_u, new qd(kc.field_b.field_b, 0.5f), (byte) -125);
                          break L1;
                        }
                      }
                    }
                  }
                } else {
                  a.field_F.field_b.b(0, 0);
                  mn.a(param1.field_u, new qd(hf.field_h.field_b), (byte) -15);
                  break L1;
                }
              } else {
                ol.field_h.field_b.b(0, 0);
                mn.a(param1.field_u, new qd(fd.field_e.field_b), (byte) -23);
                break L1;
              }
            }
            L2: {
              if (-3 == (param0 ^ -1)) {
                break L2;
              } else {
                if (param0 != 6) {
                  L3: {
                    if (2 != param1.field_p) {
                      if (-2 == (param1.field_p ^ -1)) {
                        stackIn_23_0 = 13941600;
                        break L3;
                      } else {
                        stackIn_23_0 = 16777215;
                        break L3;
                      }
                    } else {
                      stackIn_23_0 = 8372223;
                      break L3;
                    }
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
                  L4: while (true) {
                    if (var12 <= var14) {
                      break L2;
                    } else {
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
                      continue L4;
                    }
                  }
                } else {
                  break L2;
                }
              }
            }
            L5: {
              if (!param2) {
                break L5;
              } else {
                field_N = (String) null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_31_0 = (RuntimeException) (var3);

            stackIn_31_1 = new StringBuilder().append("dj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L6;
            } else {
              stackIn_32_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param2 + ')');
        }
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = HoldTheLine.field_D;
          if (param1 == 28433) {
            break L0;
          } else {
            field_N = (String) null;
            break L0;
          }
        }
        L1: {
          var2 = 0;
          var3 = cf.field_q;
          if (-6 < (var3 ^ -1)) {
            var2 = var3 * var3 * 8192 / 1100;
            break L1;
          } else {
            if (var3 < 105) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L1;
            } else {
              if (120 <= var3) {
                break L1;
              } else {
                var3 = -var3 + 120;
                var2 = -(8192 * (var3 * var3) / 3300) + 8192;
                break L1;
              }
            }
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if (-4 == (param0 ^ -1)) {
            var4 = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (-2 != (param0 ^ -1)) {
            break L3;
          } else {
            var5 = 1;
            break L3;
          }
        }
        L4: {
          if (-5 != (param0 ^ -1)) {
            break L4;
          } else {
            var5 = 1;
            var4 = 1;
            break L4;
          }
        }
        L5: {
          if (param0 != 5) {
            break L5;
          } else {
            var5 = 1;
            var4 = -1;
            break L5;
          }
        }
        L6: {
          if (6 != param0) {
            break L6;
          } else {
            var4 = 1;
            var5 = -1;
            break L6;
          }
        }
        L7: {
          L8: {
            if (-8 == (param0 ^ -1)) {
              break L8;
            } else {
              if (param0 == 8) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var4 = -1;
          var5 = -1;
          break L7;
        }
        L9: {
          if (11 != param0) {
            break L9;
          } else {
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (12 == param0) {
            var5 = -1;
            var4 = -1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param0 != 13) {
            break L11;
          } else {
            var4 = 1;
            var5 = -1;
            break L11;
          }
        }
        L12: {
          if (param0 != 14) {
            break L12;
          } else {
            var4 = -1;
            var5 = 1;
            break L12;
          }
        }
        L13: {
          if (-16 == (param0 ^ -1)) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        fe.field_b = ti.a(var2 * var5, var4 * var2, (byte) -90);
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int stackIn_6_0 = 0;
        qi stackIn_8_0;
        String stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        int stackIn_8_5;
        int stackIn_8_6;
        int stackIn_8_7;
        qi stackIn_9_0 = null;
        String stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        int stackIn_9_6 = 0;
        int stackIn_9_7 = 0;
        int stackIn_9_8 = 0;
        L0: {
          if (param0 == -9532) {
            break L0;
          } else {
            this.field_K = (String) null;
            break L0;
          }
        }
        var5 = this.field_k + param2;
        var6 = this.field_o + param1;
        super.a(param0 ^ 0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          L1: {
            if (!this.field_M) {
              stackIn_6_0 = 0;
              break L1;
            } else {
              stackIn_6_0 = -(this.field_G * 2) + (-this.field_L + this.field_x);
              break L1;
            }
          }
          L2: {
            var7 = stackIn_6_0;
            stackIn_8_0 = this.field_J;

            stackIn_8_1 = this.field_K;

            stackIn_8_2 = this.field_G + (var7 + var5);

            stackIn_8_3 = var6 - -this.field_G;

            stackIn_8_4 = this.field_L - this.field_G;

            stackIn_8_5 = -(this.field_G * 2) + this.field_u;

            stackIn_8_6 = this.field_I;

            stackIn_8_7 = -1;

            if (!this.field_M) {
              stackIn_9_0 = (qi) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 2;
              break L2;
            } else {
              stackIn_9_0 = (qi) ((Object) stackIn_8_0);
              stackIn_9_1 = (String) ((Object) stackIn_8_1);
              stackIn_9_2 = stackIn_8_2;
              stackIn_9_3 = stackIn_8_3;
              stackIn_9_4 = stackIn_8_4;
              stackIn_9_5 = stackIn_8_5;
              stackIn_9_6 = stackIn_8_6;
              stackIn_9_7 = stackIn_8_7;
              stackIn_9_8 = 0;
              break L2;
            }
          }
          ((qi) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5, stackIn_9_6, stackIn_9_7, stackIn_9_8, 1, this.field_J.field_G);
          return;
        }
    }

    static {
        field_N = "Unfortunately we are unable to create an account for you at this time.";
        field_H = "<img=10>";
    }
}
