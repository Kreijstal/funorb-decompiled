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
        jaggl.OpenGL.glBindProgramARB(34336, ((wj) this).field_g.field_b);
        jaggl.OpenGL.glEnable(34336);
        ((wj) this).field_b.a(ta.field_a, 0, param1 + -20186);
        if (param1 != 20186) {
            ((wj) this).field_j = null;
        }
    }

    final void a(int param0, int param1, ed param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 18834) {
                break L1;
              } else {
                wj.d(-57);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("wj.E(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void d(byte param0) {
        field_h = null;
        field_i = null;
    }

    final static void a(java.awt.Frame param0, wi param1, boolean param2) {
        jr var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param0, 19);
              L2: while (true) {
                if (var3.field_c != 0) {
                  if (var3.field_c != 1) {
                    tg.a(100L, (byte) 127);
                    continue L1;
                  } else {
                    param0.setVisible(param2);
                    param0.dispose();
                    break L0;
                  }
                } else {
                  tg.a(10L, (byte) 81);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("wj.N(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
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
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param2 + 41);
        }
    }

    final void c(boolean param0) {
        ((wj) this).field_b.a(jq.field_a, 0, 0);
        jaggl.OpenGL.glBindProgramARB(34336, 0);
        jaggl.OpenGL.glDisable(34820);
        jaggl.OpenGL.glDisable(34336);
        if (param0) {
            Object var3 = null;
            ((wj) this).a(11, -28, (ed) null);
        }
    }

    final void a(boolean param0, byte param1) {
        ((wj) this).field_b.a((byte) -83, cv.field_F, lf.field_e);
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
        if (((wj) this).field_f.field_g) {
            var4_float = (float)(((wj) this).field_b.field_kc % 4000) / 4000.0f;
            ((wj) this).field_b.a((ed) (Object) ((wj) this).field_f.field_f, 96);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
        } else {
            var4 = 16 * (((wj) this).field_b.field_kc % 4000) / 4000;
            ((wj) this).field_b.a((ed) (Object) ((wj) this).field_f.field_d[var4], 114);
            jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
        }
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
            ((wj) this).c(true);
        }
        return ((wj) this).field_g != null ? true : false;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        ah var2 = null;
        int var3 = 0;
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
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var29 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != aa.field_a) {
                var1_int = 0;
                L2: while (true) {
                  if (var1_int >= db.field_l) {
                    break L1;
                  } else {
                    L3: {
                      var2 = aa.field_a[var1_int];
                      if (var2 == null) {
                        break L3;
                      } else {
                        if (!var2.a((byte) 113)) {
                          break L3;
                        } else {
                          var3 = 1 + var1_int;
                          L4: while (true) {
                            if (db.field_l <= var3) {
                              break L3;
                            } else {
                              L5: {
                                var4 = aa.field_a[var3];
                                if (var4 == null) {
                                  break L5;
                                } else {
                                  if (var4.a((byte) 113)) {
                                    var5 = var2.field_m + var4.field_m;
                                    if (!wn.a(var2.field_z, var5, -119, var4.field_C, var2.field_C, var4.field_z)) {
                                      break L5;
                                    } else {
                                      L6: {
                                        if (var2.field_x >= 0) {
                                          var2.field_x = 150;
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                      L7: {
                                        if (var4.field_x < 0) {
                                          break L7;
                                        } else {
                                          var4.field_x = 150;
                                          break L7;
                                        }
                                      }
                                      L8: {
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
                                        if (0.0f >= st.a(86, new float[2], new float[2])) {
                                          stackOut_20_0 = 0;
                                          stackIn_21_0 = stackOut_20_0;
                                          break L8;
                                        } else {
                                          stackOut_19_0 = 1;
                                          stackIn_21_0 = stackOut_19_0;
                                          break L8;
                                        }
                                      }
                                      L9: {
                                        var22 = stackIn_21_0;
                                        if (st.a(89, new float[2], new float[2]) >= 0.0f) {
                                          stackOut_23_0 = 0;
                                          stackIn_24_0 = stackOut_23_0;
                                          break L9;
                                        } else {
                                          stackOut_22_0 = 1;
                                          stackIn_24_0 = stackOut_22_0;
                                          break L9;
                                        }
                                      }
                                      L10: {
                                        var23 = stackIn_24_0;
                                        if (var23 == 0) {
                                          break L10;
                                        } else {
                                          L11: {
                                            if (var4.field_N != 2) {
                                              break L11;
                                            } else {
                                              if (var4.field_v != 0) {
                                                break L11;
                                              } else {
                                                ro.a(var2, (byte) 113);
                                                var4.h((byte) -55);
                                                break L11;
                                              }
                                            }
                                          }
                                          if (var4.field_N != 3) {
                                            break L10;
                                          } else {
                                            if (var4.field_v == 0) {
                                              var4.field_j = 25;
                                              var4.h((byte) -55);
                                              break L10;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                      }
                                      L12: {
                                        if (var22 == 0) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (var2.field_N != 2) {
                                              break L13;
                                            } else {
                                              if (var2.field_v == 0) {
                                                ro.a(var4, (byte) 113);
                                                var2.h((byte) -55);
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                          if (3 != var2.field_N) {
                                            break L12;
                                          } else {
                                            if (var2.field_v == 0) {
                                              var2.field_j = 25;
                                              var2.h((byte) -55);
                                              break L12;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                      L14: {
                                        if (1 != var2.field_N) {
                                          break L14;
                                        } else {
                                          var2.h((byte) -55);
                                          break L14;
                                        }
                                      }
                                      L15: {
                                        if (var4.field_N != 1) {
                                          break L15;
                                        } else {
                                          var4.h((byte) -55);
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        L17: {
                                          var2.field_d = 0;
                                          var2.field_P = var3;
                                          var4.field_P = var1_int;
                                          var4.field_d = 0;
                                          if (var2.field_Q != 0) {
                                            break L17;
                                          } else {
                                            if (var2.g(param0 + -22379)) {
                                              var4.field_R = true;
                                              break L16;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var4.field_R = false;
                                        break L16;
                                      }
                                      L18: {
                                        L19: {
                                          if (var4.field_Q != 0) {
                                            break L19;
                                          } else {
                                            if (var4.g(96)) {
                                              var2.field_R = true;
                                              break L18;
                                            } else {
                                              break L19;
                                            }
                                          }
                                        }
                                        var2.field_R = false;
                                        break L18;
                                      }
                                      L20: {
                                        var24 = (int)Math.round(Math.max(1.0, Math.sqrt((double)((float)var12 * (float)var12 + (float)var13 * (float)var13))));
                                        if (~var24 <= ~var5) {
                                          break L20;
                                        } else {
                                          var25 = var12 * (var5 + -var24) / var24;
                                          var4.field_C = var4.field_C + var25;
                                          var26 = (var5 - var24) * var13 / var24;
                                          var4.field_z = var4.field_z + var26;
                                          var2.field_C = var2.field_C - var25;
                                          var2.field_z = var2.field_z - var26;
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        if (!var2.g(param0 + -22327)) {
                                          if (var4.g(22)) {
                                            if (var4.field_Q != 0) {
                                              var10 = var10 * 8.0;
                                              break L21;
                                            } else {
                                              var10 = var10 * 10.0;
                                              break L21;
                                            }
                                          } else {
                                            break L21;
                                          }
                                        } else {
                                          if (0 != var2.field_Q) {
                                            var7 = var7 * 8.0;
                                            break L21;
                                          } else {
                                            var7 = var7 * 10.0;
                                            break L21;
                                          }
                                        }
                                      }
                                      L22: {
                                        var12 = (var12 << 8) / var24;
                                        var13 = (var13 << 8) / var24;
                                        var25 = (int)(var7 * (double)(Math.max(0, var12 * var2.field_E - -(var13 * var2.field_A) >> 8) * (var6 * 2)));
                                        var26 = -(var12 * var2.field_A) + var13 * var2.field_E >> 8;
                                        var27 = (int)((double)(Math.max(0, -(var4.field_A * var13) + var12 * -var4.field_E >> 8) * (var9 * 2)) * var10);
                                        var28 = var4.field_A * var12 + -var4.field_E * var13 >> 8;
                                        var2.field_E = var13 * var26 + -var27 * var12 / var6 >> 8;
                                        var2.field_A = -var27 * var13 / var6 - var26 * var12 >> 8;
                                        var4.field_E = -(var28 * var13) + var12 * var25 / var9 >> 8;
                                        var4.field_A = var25 * var13 / var9 - -(var28 * var12) >> 8;
                                        if (!var2.g(63)) {
                                          if (!var4.g(param0 + -22319)) {
                                            break L22;
                                          } else {
                                            var2.field_E = var2.field_E << 1;
                                            var2.field_A = var2.field_A << 1;
                                            break L22;
                                          }
                                        } else {
                                          var4.field_A = var4.field_A << 1;
                                          var4.field_E = var4.field_E << 1;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        if (var4.field_Q == 0) {
                                          Sumoblitz.a(var2.field_Q, var2.field_N, (byte) -111);
                                          break L23;
                                        } else {
                                          break L23;
                                        }
                                      }
                                      if (0 != var2.field_Q) {
                                        break L5;
                                      } else {
                                        Sumoblitz.a(var4.field_Q, var4.field_N, (byte) -93);
                                        break L5;
                                      }
                                    }
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var3++;
                              continue L4;
                            }
                          }
                        }
                      }
                    }
                    var1_int++;
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            L24: {
              if (param0 == 22403) {
                break L24;
              } else {
                field_i = null;
                break L24;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "wj.H(" + param0 + 41);
        }
    }

    wj(on param0, ki param1, sk param2) {
        super((aw) (Object) param0);
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                ((wj) this).field_f = param2;
                ((wj) this).field_j = param0;
                if (param1 == null) {
                  break L2;
                } else {
                  if (!((wj) this).field_f.c(83)) {
                    break L2;
                  } else {
                    if (!((wj) this).field_j.field_Ac) {
                      break L2;
                    } else {
                      ((wj) this).field_g = ve.a((byte) 103, ((wj) this).field_j, param1.a("transparent_water", "gl", -1), 34336);
                      break L1;
                    }
                  }
                }
              }
              ((wj) this).field_g = null;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("wj.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ts(4, 1, 1, 1);
        field_k = false;
    }
}
