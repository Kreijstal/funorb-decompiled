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
        this.field_b.a(ta.field_a, 0, param1 + -20186);
        if (param1 != 20186) {
            this.field_j = (on) null;
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
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("wj.E(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        RuntimeException runtimeException = null;
        jr var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a(param0, 19);
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (var3.field_c != 0) {
                        break L5;
                      } else {
                        tg.a(10L, (byte) 81);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L6: {
                      if ((var3.field_c ^ -1) != -2) {
                        break L6;
                      } else {
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    tg.a(100L, (byte) 127);
                    break L4;
                  }
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
                param0.setVisible(param2);
                param0.dispose();
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (runtimeException);
            stackOut_13_1 = new StringBuilder().append("wj.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L7;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L7;
            }
          }
          L8: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
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
        float var4_float = 0.0f;
        int var4 = 0;
        L0: {
          if (param0 == 34023) {
            break L0;
          } else {
            field_e = 83;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.field_f.field_g) {
              break L2;
            } else {
              var4_float = (float)(this.field_b.field_kc % 4000) / 4000.0f;
              this.field_b.a(this.field_f.field_f, 96);
              jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, var4_float, 0.0f, 0.0f, 1.0f);
              if (!Sumoblitz.field_L) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 16 * (this.field_b.field_kc % 4000) / 4000;
          this.field_b.a(this.field_f.field_d[var4], 114);
          jaggl.OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0f, 0.0f, 0.0f, 1.0f);
          break L1;
        }
    }

    final boolean b(byte param0) {
        if (param0 > -8) {
            this.c(true);
        }
        return this.field_g != null ? true : false;
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
        Object stackIn_11_0 = null;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        Object stackIn_84_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_10_0 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        Object stackOut_83_0 = null;
        var29 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (null != aa.field_a) {
                    var1_int = 0;
                    L4: while (true) {
                      if (var1_int >= db.field_l) {
                        break L3;
                      } else {
                        var2 = aa.field_a[var1_int];
                        if (var29 != 0) {
                          break L1;
                        } else {
                          L5: {
                            if (var2 == null) {
                              break L5;
                            } else {
                              if (!var2.a((byte) 113)) {
                                break L5;
                              } else {
                                var3 = 1 + var1_int;
                                L6: while (true) {
                                  if (db.field_l <= var3) {
                                    break L5;
                                  } else {
                                    var4 = aa.field_a[var3];
                                    stackOut_10_0 = null;
                                    stackIn_84_0 = stackOut_10_0;
                                    stackIn_11_0 = stackOut_10_0;
                                    if (var29 != 0) {
                                      break L2;
                                    } else {
                                      L7: {
                                        if (stackIn_11_0 == var4) {
                                          break L7;
                                        } else {
                                          if (var4.a((byte) 113)) {
                                            var5 = var2.field_m + var4.field_m;
                                            if (!wn.a(var2.field_z, var5, -119, var4.field_C, var2.field_C, var4.field_z)) {
                                              break L7;
                                            } else {
                                              L8: {
                                                if (-1 >= (var2.field_x ^ -1)) {
                                                  var2.field_x = 150;
                                                  break L8;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                              L9: {
                                                if (var4.field_x < 0) {
                                                  break L9;
                                                } else {
                                                  var4.field_x = 150;
                                                  break L9;
                                                }
                                              }
                                              L10: {
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
                                                if (0.0f >= st.a(86, new float[]{var18, var19}, new float[]{var16, var17})) {
                                                  stackOut_22_0 = 0;
                                                  stackIn_23_0 = stackOut_22_0;
                                                  break L10;
                                                } else {
                                                  stackOut_21_0 = 1;
                                                  stackIn_23_0 = stackOut_21_0;
                                                  break L10;
                                                }
                                              }
                                              L11: {
                                                var22 = stackIn_23_0;
                                                if (st.a(89, new float[]{var20, var21}, new float[]{var16, var17}) >= 0.0f) {
                                                  stackOut_25_0 = 0;
                                                  stackIn_26_0 = stackOut_25_0;
                                                  break L11;
                                                } else {
                                                  stackOut_24_0 = 1;
                                                  stackIn_26_0 = stackOut_24_0;
                                                  break L11;
                                                }
                                              }
                                              L12: {
                                                var23 = stackIn_26_0;
                                                if (var23 == 0) {
                                                  break L12;
                                                } else {
                                                  L13: {
                                                    if ((var4.field_N ^ -1) != -3) {
                                                      break L13;
                                                    } else {
                                                      if (-1 != (var4.field_v ^ -1)) {
                                                        break L13;
                                                      } else {
                                                        ro.a(var2, (byte) 113);
                                                        var4.h((byte) -55);
                                                        break L13;
                                                      }
                                                    }
                                                  }
                                                  if ((var4.field_N ^ -1) != -4) {
                                                    break L12;
                                                  } else {
                                                    if (-1 == (var4.field_v ^ -1)) {
                                                      var4.field_j = 25;
                                                      var4.h((byte) -55);
                                                      break L12;
                                                    } else {
                                                      break L12;
                                                    }
                                                  }
                                                }
                                              }
                                              L14: {
                                                if (var22 == 0) {
                                                  break L14;
                                                } else {
                                                  L15: {
                                                    if ((var2.field_N ^ -1) != -3) {
                                                      break L15;
                                                    } else {
                                                      if (-1 == (var2.field_v ^ -1)) {
                                                        ro.a(var4, (byte) 113);
                                                        var2.h((byte) -55);
                                                        break L15;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  if (3 != var2.field_N) {
                                                    break L14;
                                                  } else {
                                                    if (var2.field_v == 0) {
                                                      var2.field_j = 25;
                                                      var2.h((byte) -55);
                                                      break L14;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                              }
                                              L16: {
                                                if (1 != var2.field_N) {
                                                  break L16;
                                                } else {
                                                  var2.h((byte) -55);
                                                  break L16;
                                                }
                                              }
                                              L17: {
                                                if ((var4.field_N ^ -1) != -2) {
                                                  break L17;
                                                } else {
                                                  var4.h((byte) -55);
                                                  break L17;
                                                }
                                              }
                                              L18: {
                                                L19: {
                                                  L20: {
                                                    var2.field_d = 0;
                                                    var2.field_P = var3;
                                                    var4.field_P = var1_int;
                                                    var4.field_d = 0;
                                                    if (var2.field_Q != 0) {
                                                      break L20;
                                                    } else {
                                                      if (var2.g(param0 + -22379)) {
                                                        break L19;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  var4.field_R = false;
                                                  if (var29 == 0) {
                                                    break L18;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                                var4.field_R = true;
                                                break L18;
                                              }
                                              L21: {
                                                L22: {
                                                  L23: {
                                                    if (var4.field_Q != 0) {
                                                      break L23;
                                                    } else {
                                                      if (var4.g(96)) {
                                                        break L22;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  var2.field_R = false;
                                                  if (var29 == 0) {
                                                    break L21;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                                var2.field_R = true;
                                                break L21;
                                              }
                                              L24: {
                                                var24 = (int)Math.round(Math.max(1.0, Math.sqrt((double)((float)var12 * (float)var12 + (float)var13 * (float)var13))));
                                                if (var24 >= var5) {
                                                  break L24;
                                                } else {
                                                  var25 = var12 * (var5 + -var24) / var24;
                                                  var4.field_C = var4.field_C + var25;
                                                  var26 = (var5 - var24) * var13 / var24;
                                                  var4.field_z = var4.field_z + var26;
                                                  var2.field_C = var2.field_C - var25;
                                                  var2.field_z = var2.field_z - var26;
                                                  break L24;
                                                }
                                              }
                                              L25: {
                                                L26: {
                                                  if (!var2.g(param0 + -22327)) {
                                                    break L26;
                                                  } else {
                                                    L27: {
                                                      if (0 != var2.field_Q) {
                                                        break L27;
                                                      } else {
                                                        var7 = var7 * 10.0;
                                                        if (var29 == 0) {
                                                          break L25;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                    }
                                                    var7 = var7 * 8.0;
                                                    if (var29 == 0) {
                                                      break L25;
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                }
                                                if (var4.g(22)) {
                                                  L28: {
                                                    if (-1 != (var4.field_Q ^ -1)) {
                                                      break L28;
                                                    } else {
                                                      var10 = var10 * 10.0;
                                                      if (var29 == 0) {
                                                        break L25;
                                                      } else {
                                                        break L28;
                                                      }
                                                    }
                                                  }
                                                  var10 = var10 * 8.0;
                                                  break L25;
                                                } else {
                                                  break L25;
                                                }
                                              }
                                              L29: {
                                                L30: {
                                                  var12 = (var12 << 1462644232) / var24;
                                                  var13 = (var13 << -279410360) / var24;
                                                  var25 = (int)(var7 * (double)(Math.max(0, var12 * var2.field_E - -(var13 * var2.field_A) >> 413431272) * (var6 * 2)));
                                                  var26 = -(var12 * var2.field_A) + var13 * var2.field_E >> 740338440;
                                                  var27 = (int)((double)(Math.max(0, -(var4.field_A * var13) + var12 * -var4.field_E >> -821322840) * (var9 * 2)) * var10);
                                                  var28 = var4.field_A * var12 + -var4.field_E * var13 >> 1761916616;
                                                  var2.field_E = var13 * var26 + -var27 * var12 / var6 >> 1344257416;
                                                  var2.field_A = -var27 * var13 / var6 - var26 * var12 >> -1012506328;
                                                  var4.field_E = -(var28 * var13) + var12 * var25 / var9 >> -64025112;
                                                  var4.field_A = var25 * var13 / var9 - -(var28 * var12) >> -910462392;
                                                  if (!var2.g(63)) {
                                                    break L30;
                                                  } else {
                                                    var4.field_A = var4.field_A << 1;
                                                    var4.field_E = var4.field_E << 1;
                                                    if (var29 == 0) {
                                                      break L29;
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                }
                                                if (!var4.g(param0 + -22319)) {
                                                  break L29;
                                                } else {
                                                  var2.field_E = var2.field_E << 1;
                                                  var2.field_A = var2.field_A << 1;
                                                  break L29;
                                                }
                                              }
                                              L31: {
                                                if (var4.field_Q == 0) {
                                                  Sumoblitz.a(var2.field_Q, var2.field_N, (byte) -111);
                                                  break L31;
                                                } else {
                                                  break L31;
                                                }
                                              }
                                              if (0 != var2.field_Q) {
                                                break L7;
                                              } else {
                                                Sumoblitz.a(var4.field_Q, var4.field_N, (byte) -93);
                                                break L7;
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      var3++;
                                      if (var29 == 0) {
                                        continue L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var1_int++;
                          if (var29 == 0) {
                            continue L4;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (param0 == 22403) {
                  break L1;
                } else {
                  stackOut_83_0 = null;
                  stackIn_84_0 = stackOut_83_0;
                  break L2;
                }
              }
              field_i = (ri[]) ((Object) stackIn_84_0);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "wj.H(" + param0 + ')');
        }
    }

    wj(on param0, ki param1, sk param2) {
        super(param0);
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
                this.field_f = param2;
                this.field_j = param0;
                if (param1 == null) {
                  break L2;
                } else {
                  if (!this.field_f.c(83)) {
                    break L2;
                  } else {
                    if (!this.field_j.field_Ac) {
                      break L2;
                    } else {
                      this.field_g = ve.a((byte) 103, this.field_j, param1.a("transparent_water", "gl", -1), 34336);
                      if (!Sumoblitz.field_L) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
              }
              this.field_g = null;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("wj.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    static {
        field_h = new ts(4, 1, 1, 1);
        field_k = false;
    }
}
