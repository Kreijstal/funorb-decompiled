/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    int field_c;
    private int field_q;
    private int field_s;
    private int field_t;
    private int field_j;
    private int field_m;
    private int field_b;
    private int field_k;
    private int field_l;
    float field_e;
    private int field_y;
    static vn field_o;
    private int field_p;
    int field_u;
    private int field_n;
    float field_g;
    private int field_x;
    int field_f;
    private float field_r;
    private int field_i;
    private int field_h;
    static String field_z;
    int field_v;
    private int field_w;
    private int field_a;
    boolean field_d;

    public static void a() {
        field_o = null;
        field_z = null;
    }

    final void a(byte param0) {
        ((wk) this).field_c = ((wk) this).field_k;
        ((wk) this).field_f = ((wk) this).field_k;
        ((wk) this).field_d = true;
        ((wk) this).field_u = ((wk) this).field_l;
        ((wk) this).field_v = ((wk) this).field_l;
        ((wk) this).field_g = 1.0f;
        if (param0 >= -33) {
            int discarded$0 = ((wk) this).a(-48, true);
        }
        ((wk) this).field_e = 0.0f;
        ((wk) this).field_r = 0.004999999888241291f;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((wk) this).field_n = (-(27 * param0) + (6 * param1 + param4 * -15 - -(param7 * 54))) / 18;
        if (param8 != 106) {
            ((wk) this).field_m = -116;
        }
        ((wk) this).field_x = (54 * param2 + (-15 * param3 - -(6 * param6) + -(27 * param5))) / 18;
        ((wk) this).field_j = param1;
        ((wk) this).field_m = (54 * param0 + (param1 * -15 - (-(param4 * 6) - -(param7 * 27)))) / 18;
        ((wk) this).field_h = param6;
        ((wk) this).field_l = param4;
        ((wk) this).field_b = (param5 * 54 + (param3 * 6 + (param6 * -15 - param2 * 27))) / 18;
        ((wk) this).field_k = param3;
    }

    final int a(int param0, boolean param1) {
        if (param1) {
            int discarded$0 = ((wk) this).b(64, false);
        }
        return -bd.field_d + (param0 - -((wk) this).field_u);
    }

    final void c(int param0) {
        ((wk) this).field_d = false;
        ((wk) this).field_e = 1.0f;
        ((wk) this).field_u = ((wk) this).field_j;
        ((wk) this).field_c = ((wk) this).field_h;
        int var2 = 73 % ((-42 - param0) / 61);
    }

    final int b(int param0, boolean param1) {
        if (!param1) {
            return -101;
        }
        return ((wk) this).field_c + param0 - nh.field_G;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = ZombieDawn.field_J;
        try {
          L0: {
            if (param0 >= param2) {
              return;
            } else {
              if (param1 > param0 + 1) {
                L1: {
                  if (param0 - -5 >= param1) {
                    break L1;
                  } else {
                    if (param6 != param5) {
                      var7_int = (param5 & param6 & 1) + ((param5 >> 1) + (param6 >> 1));
                      var8 = param0;
                      var9 = param6;
                      var10 = param5;
                      var11 = param0;
                      L2: while (true) {
                        if (var11 >= param1) {
                          wk.a(param0, var8, param2, param3, param4, var9, param6);
                          wk.a(var8, param1, param2, 0, param4, param5, var10);
                          break L0;
                        } else {
                          L3: {
                            var12 = qd.field_c[var11];
                            if (param4) {
                              stackOut_22_0 = dj.field_g[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = qp.field_b[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          var13 = stackIn_23_0;
                          if (var7_int < var13) {
                            L4: {
                              qd.field_c[var11] = qd.field_c[var8];
                              if (var9 > var13) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            int incrementValue$1 = var8;
                            var8++;
                            qd.field_c[incrementValue$1] = var12;
                            var11++;
                            continue L2;
                          } else {
                            L5: {
                              if (var13 <= var10) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param1;
                L6: while (true) {
                  if (param0 >= var7_int) {
                    return;
                  } else {
                    var8 = param0;
                    L7: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = qd.field_c[var8];
                          var10 = qd.field_c[var8 + 1];
                          if (!fp.a(var9, param4, 0, var10)) {
                            break L8;
                          } else {
                            qd.field_c[var8] = var10;
                            qd.field_c[1 + var8] = var9;
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var7, "wk.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final int a(int param0, byte param1) {
        if (param1 >= -58) {
            return -34;
        }
        return bd.field_d + (param0 + -((wk) this).field_u);
    }

    final int a(int param0, int param1) {
        if (param1 != 0) {
            ((wk) this).field_x = 23;
        }
        return -((wk) this).field_c + param0 + nh.field_G;
    }

    final void a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4, boolean param5) {
        float var7_float = 0.0f;
        int var7 = 0;
        float var8 = 0.0f;
        int var9 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var9 = ZombieDawn.field_J;
          ((wk) this).field_p = ((wk) this).field_t - bd.field_d;
          if (param3 <= -41) {
            break L0;
          } else {
            field_z = null;
            break L0;
          }
        }
        L1: {
          if (bo.field_i) {
            ((wk) this).field_a = ((wk) this).field_q - 240;
            ((wk) this).field_w = 240;
            break L1;
          } else {
            ((wk) this).field_a = -nh.field_G + ((wk) this).field_q;
            if (nh.field_G <= ((wk) this).field_a) {
              ((wk) this).field_w = nh.field_G;
              break L1;
            } else {
              ((wk) this).field_w = (((wk) this).field_a + nh.field_G) / 2;
              ((wk) this).field_a = (((wk) this).field_a + nh.field_G) / 2;
              break L1;
            }
          }
        }
        L2: {
          if (((wk) this).field_p >= bd.field_d) {
            ((wk) this).field_s = bd.field_d;
            break L2;
          } else {
            ((wk) this).field_s = (bd.field_d + ((wk) this).field_p) / 2;
            ((wk) this).field_p = (bd.field_d + ((wk) this).field_p) / 2;
            break L2;
          }
        }
        L3: {
          if (!((wk) this).field_d) {
            L4: {
              if (0.0f >= ((wk) this).field_g) {
                break L4;
              } else {
                ((wk) this).field_g = ((wk) this).field_g - 0.07000000029802322f;
                break L4;
              }
            }
            L5: {
              if (0 >= ((wk) this).field_i) {
                break L5;
              } else {
                ((wk) this).field_i = ((wk) this).field_i - 1;
                break L5;
              }
            }
            L6: {
              if (0 >= ((wk) this).field_y) {
                break L6;
              } else {
                ((wk) this).field_y = ((wk) this).field_y - 1;
                break L6;
              }
            }
            L7: {
              if (((wk) this).field_i < 0) {
                ((wk) this).field_i = ((wk) this).field_i + 1;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (((wk) this).field_y >= 0) {
                break L8;
              } else {
                ((wk) this).field_y = ((wk) this).field_y + 1;
                break L8;
              }
            }
            L9: {
              if (param5) {
                stackOut_32_0 = 2;
                stackIn_33_0 = stackOut_32_0;
                break L9;
              } else {
                stackOut_31_0 = 1;
                stackIn_33_0 = stackOut_31_0;
                break L9;
              }
            }
            L10: {
              var7 = stackIn_33_0 * 8;
              if (param1) {
                ((wk) this).field_y = -var7;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              if (param0) {
                ((wk) this).field_y = var7;
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if (!param4) {
                break L12;
              } else {
                ((wk) this).field_i = var7;
                break L12;
              }
            }
            L13: {
              if (!param2) {
                break L13;
              } else {
                ((wk) this).field_i = -var7;
                break L13;
              }
            }
            ((wk) this).field_u = ((wk) this).field_u + ((wk) this).field_i;
            ((wk) this).field_c = ((wk) this).field_c + ((wk) this).field_y;
            break L3;
          } else {
            L14: {
              if (0.00001 >= (double)((wk) this).field_r) {
                break L14;
              } else {
                if (((wk) this).field_e < 1.0f) {
                  L15: {
                    ((wk) this).field_e = ((wk) this).field_e + ((wk) this).field_r;
                    if ((double)((wk) this).field_e > 0.87) {
                      ((wk) this).field_r = (float)((double)((wk) this).field_r - 0.0001);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var7_float = ((wk) this).field_e;
                  var8 = 1.0f - var7_float;
                  ((wk) this).field_u = (int)((float)(((wk) this).field_m * 3) * var8 * var7_float * var7_float + (var8 * (var8 * (float)((wk) this).field_l) * var8 + var8 * ((float)(((wk) this).field_n * 3) * var8) * var7_float) + var7_float * (var7_float * (float)((wk) this).field_j * var7_float));
                  ((wk) this).field_v = (int)((float)(((wk) this).field_m * 3) * var8 * var7_float * var7_float + (var8 * (var8 * (float)((wk) this).field_l) * var8 + var8 * ((float)(((wk) this).field_n * 3) * var8) * var7_float) + var7_float * (var7_float * (float)((wk) this).field_j * var7_float));
                  ((wk) this).field_c = (int)(var8 * ((float)((wk) this).field_k * var8 * var8) + (float)(((wk) this).field_x * 3) * var8 * var8 * var7_float + var7_float * (var7_float * (var8 * (float)(((wk) this).field_b * 3))) + var7_float * (float)((wk) this).field_h * var7_float * var7_float);
                  ((wk) this).field_f = (int)(var8 * ((float)((wk) this).field_k * var8 * var8) + (float)(((wk) this).field_x * 3) * var8 * var8 * var7_float + var7_float * (var7_float * (var8 * (float)(((wk) this).field_b * 3))) + var7_float * (float)((wk) this).field_h * var7_float * var7_float);
                  break L3;
                } else {
                  break L14;
                }
              }
            }
            ((wk) this).field_d = false;
            break L3;
          }
        }
        int discarded$1 = -28216;
        this.b();
    }

    final void a(byte param0, int param1, int param2) {
        ((wk) this).field_c = ((wk) this).field_c - param2;
        ((wk) this).field_u = ((wk) this).field_u - param1;
        int var4 = 15 % ((-55 - param0) / 43);
        int discarded$0 = -28216;
        this.b();
    }

    private final void b() {
        if (!(((wk) this).field_u >= ((wk) this).field_s)) {
            ((wk) this).field_u = ((wk) this).field_s;
        }
        if (((wk) this).field_w > ((wk) this).field_c) {
            ((wk) this).field_c = ((wk) this).field_w;
        }
        if (((wk) this).field_a < ((wk) this).field_c) {
            ((wk) this).field_c = ((wk) this).field_a;
        }
        if (!(((wk) this).field_u <= ((wk) this).field_p)) {
            ((wk) this).field_u = ((wk) this).field_p;
        }
    }

    wk(int param0, int param1) {
        ((wk) this).field_y = 0;
        ((wk) this).field_i = 0;
        ((wk) this).field_d = false;
        ((wk) this).field_g = 0.0f;
        ((wk) this).field_s = bd.field_d;
        ((wk) this).field_t = param0;
        ((wk) this).field_q = param1;
        ((wk) this).field_p = -bd.field_d + ((wk) this).field_t;
        int var3 = bo.field_i ? 240 : nh.field_G;
        ((wk) this).field_w = -var3 + 240;
        ((wk) this).field_a = ((wk) this).field_q + -var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Unfortunately we are unable to create an account for you at this time.";
    }
}
