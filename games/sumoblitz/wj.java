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
        if (param1 != 18834) {
            wj.d(-57);
        }
    }

    public static void d(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 != 79) {
            Object var2 = null;
            wj.a((java.awt.Frame) null, (wi) null, false);
        }
    }

    final static void a(java.awt.Frame param0, wi param1, boolean param2) {
        jr var3 = null;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        L0: while (true) {
          var3 = param1.a(param0, 19);
          L1: while (true) {
            if (var3.field_c != 0) {
              if ((var3.field_c ^ -1) != -2) {
                tg.a(100L, (byte) 127);
                continue L0;
              } else {
                param0.setVisible(param2);
                param0.dispose();
                return;
              }
            } else {
              tg.a(10L, (byte) 81);
              continue L1;
            }
          }
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
        int var1 = 0;
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
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          var29 = Sumoblitz.field_L ? 1 : 0;
          if (null != aa.field_a) {
            var1 = 0;
            L1: while (true) {
              if (var1 >= db.field_l) {
                break L0;
              } else {
                var2 = aa.field_a[var1];
                if (var2 != null) {
                  if (var2.a((byte) 113)) {
                    var3 = 1 + var1;
                    L2: while (true) {
                      if (db.field_l > var3) {
                        var4 = aa.field_a[var3];
                        if (var4 != null) {
                          if (var4.a((byte) 113)) {
                            var5 = var2.field_m + var4.field_m;
                            if (wn.a(var2.field_z, var5, -119, var4.field_C, var2.field_C, var4.field_z)) {
                              L3: {
                                if (-1 >= (var2.field_x ^ -1)) {
                                  var2.field_x = 150;
                                  break L3;
                                } else {
                                  break L3;
                                }
                              }
                              L4: {
                                if (var4.field_x < 0) {
                                  break L4;
                                } else {
                                  var4.field_x = 150;
                                  break L4;
                                }
                              }
                              L5: {
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
                                  stackOut_24_0 = 0;
                                  stackIn_25_0 = stackOut_24_0;
                                  break L5;
                                } else {
                                  stackOut_23_0 = 1;
                                  stackIn_25_0 = stackOut_23_0;
                                  break L5;
                                }
                              }
                              L6: {
                                var22 = stackIn_25_0;
                                if (st.a(89, new float[2], new float[2]) >= 0.0f) {
                                  stackOut_27_0 = 0;
                                  stackIn_28_0 = stackOut_27_0;
                                  break L6;
                                } else {
                                  stackOut_26_0 = 1;
                                  stackIn_28_0 = stackOut_26_0;
                                  break L6;
                                }
                              }
                              L7: {
                                var23 = stackIn_28_0;
                                if (var23 == 0) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (var4.field_N != -3) {
                                      break L8;
                                    } else {
                                      if (-1 != var4.field_v) {
                                        break L8;
                                      } else {
                                        ro.a(var2, (byte) 113);
                                        var4.h((byte) -55);
                                        break L8;
                                      }
                                    }
                                  }
                                  if (var4.field_N != -4) {
                                    break L7;
                                  } else {
                                    if (-1 == var4.field_v) {
                                      var4.field_j = 25;
                                      var4.h((byte) -55);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L9: {
                                if (var22 == 0) {
                                  break L9;
                                } else {
                                  L10: {
                                    if (var2.field_N != -3) {
                                      break L10;
                                    } else {
                                      if (-1 == var2.field_v) {
                                        ro.a(var4, (byte) 113);
                                        var2.h((byte) -55);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  if (3 != var2.field_N) {
                                    break L9;
                                  } else {
                                    if (var2.field_v == 0) {
                                      var2.field_j = 25;
                                      var2.h((byte) -55);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                              L11: {
                                if (1 != var2.field_N) {
                                  break L11;
                                } else {
                                  var2.h((byte) -55);
                                  break L11;
                                }
                              }
                              L12: {
                                if ((var4.field_N ^ -1) != -2) {
                                  break L12;
                                } else {
                                  var4.h((byte) -55);
                                  break L12;
                                }
                              }
                              L13: {
                                L14: {
                                  var2.field_d = 0;
                                  var2.field_P = var3;
                                  var4.field_P = var1;
                                  var4.field_d = 0;
                                  if (var2.field_Q != 0) {
                                    break L14;
                                  } else {
                                    if (var2.g(param0 + -22379)) {
                                      var4.field_R = true;
                                      break L13;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                                var4.field_R = false;
                                break L13;
                              }
                              L15: {
                                L16: {
                                  if (var4.field_Q != 0) {
                                    break L16;
                                  } else {
                                    if (var4.g(96)) {
                                      var2.field_R = true;
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                var2.field_R = false;
                                break L15;
                              }
                              L17: {
                                var24 = (int)Math.round(Math.max(1.0, Math.sqrt((double)((float)var12 * (float)var12 + (float)var13 * (float)var13))));
                                if (var24 >= var5) {
                                  break L17;
                                } else {
                                  var25 = var12 * (var5 + -var24) / var24;
                                  var4.field_C = var4.field_C + var25;
                                  var26 = (var5 - var24) * var13 / var24;
                                  var4.field_z = var4.field_z + var26;
                                  var2.field_C = var2.field_C - var25;
                                  var2.field_z = var2.field_z - var26;
                                  break L17;
                                }
                              }
                              L18: {
                                if (!var2.g(param0 + -22327)) {
                                  if (var4.g(22)) {
                                    if (-1 != (var4.field_Q ^ -1)) {
                                      var10 = var10 * 8.0;
                                      break L18;
                                    } else {
                                      var10 = var10 * 10.0;
                                      break L18;
                                    }
                                  } else {
                                    break L18;
                                  }
                                } else {
                                  if (0 != var2.field_Q) {
                                    var7 = var7 * 8.0;
                                    break L18;
                                  } else {
                                    var7 = var7 * 10.0;
                                    break L18;
                                  }
                                }
                              }
                              L19: {
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
                                  if (!var4.g(param0 + -22319)) {
                                    break L19;
                                  } else {
                                    var2.field_E = var2.field_E << 1;
                                    var2.field_A = var2.field_A << 1;
                                    break L19;
                                  }
                                } else {
                                  var4.field_A = var4.field_A << 1;
                                  var4.field_E = var4.field_E << 1;
                                  break L19;
                                }
                              }
                              L20: {
                                if (var4.field_Q == 0) {
                                  Sumoblitz.a(var2.field_Q, var2.field_N, (byte) -111);
                                  break L20;
                                } else {
                                  break L20;
                                }
                              }
                              if (0 == var2.field_Q) {
                                Sumoblitz.a(var4.field_Q, var4.field_N, (byte) -93);
                                var3++;
                                continue L2;
                              } else {
                                var3++;
                                continue L2;
                              }
                            } else {
                              var3++;
                              continue L2;
                            }
                          } else {
                            var3++;
                            continue L2;
                          }
                        } else {
                          var3++;
                          continue L2;
                        }
                      } else {
                        var1++;
                        continue L1;
                      }
                    }
                  } else {
                    var1++;
                    continue L1;
                  }
                } else {
                  var1++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L21: {
          if (param0 == 22403) {
            break L21;
          } else {
            field_i = null;
            break L21;
          }
        }
    }

    wj(on param0, ki param1, sk param2) {
        super((aw) (Object) param0);
        ((wj) this).field_f = param2;
        ((wj) this).field_j = param0;
        if (param1 != null) {
            // ifeq L70
            // ifeq L70
            ((wj) this).field_g = ve.a((byte) 103, ((wj) this).field_j, param1.a("transparent_water", "gl", -1), 34336);
        } else {
            ((wj) this).field_g = null;
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
