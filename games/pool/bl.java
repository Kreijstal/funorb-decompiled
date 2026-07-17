/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    boolean field_c;
    int field_E;
    private int field_m;
    private int field_h;
    private int field_i;
    private int field_f;
    private int field_u;
    static int[] field_r;
    private int field_D;
    private int field_z;
    private int field_F;
    private int field_k;
    static int field_s;
    private int field_p;
    private int field_d;
    private int field_b;
    int field_y;
    private int field_G;
    private int field_n;
    private int field_q;
    static String field_j;
    private int field_C;
    private int field_a;
    private int field_o;
    private int field_l;
    static int field_g;
    static String field_v;
    private int field_I;
    static String field_e;
    private int field_w;
    private int field_A;
    static String field_t;
    private int field_B;
    private int field_J;
    static boolean field_x;

    final void a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              var4 = ((bl) this).field_i + -param1[1];
              var3_int = ((bl) this).field_b + -param1[0];
              var5 = -param1[2] + ((bl) this).field_u;
              ((bl) this).field_B = var4 * param1[10] + (var3_int * param1[9] + param1[11] * var5) >> 16;
              if (((bl) this).field_B != 0) {
                break L1;
              } else {
                ((bl) this).field_B = -1;
                break L1;
              }
            }
            if (((bl) this).field_B > 0) {
              L2: {
                ((bl) this).field_o = 320 - -((param1[5] * var5 + (param1[3] * var3_int + param1[4] * var4) >> 7) / ((bl) this).field_B);
                ((bl) this).field_l = (var5 * param1[8] + (param1[6] * var3_int + param1[7] * var4) >> 7) / ((bl) this).field_B + 240;
                var4 = ((bl) this).field_F - param1[1];
                var5 = ((bl) this).field_k - param1[2];
                var3_int = ((bl) this).field_J + -param1[0];
                ((bl) this).field_d = var4 * param1[10] + var3_int * param1[9] - -(param1[11] * var5) >> 16;
                if (0 == ((bl) this).field_d) {
                  ((bl) this).field_d = -1;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (((bl) this).field_d > 0) {
                ((bl) this).field_C = 320 + (var3_int * param1[3] + (var4 * param1[4] - -(var5 * param1[5])) >> 7) / ((bl) this).field_d;
                ((bl) this).field_a = 240 - -((var3_int * param1[6] - -(param1[7] * var4) + param1[8] * var5 >> 7) / ((bl) this).field_d);
                var3_int = -param1[0] + ((bl) this).field_z;
                var4 = ((bl) this).field_D - param1[1];
                var5 = -param1[2] + ((bl) this).field_h;
                ((bl) this).field_f = param1[11] * var5 + (var4 * param1[10] + param1[9] * var3_int) >> 16;
                if (param0 <= -34) {
                  L3: {
                    if (0 == ((bl) this).field_f) {
                      ((bl) this).field_f = -1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  if (((bl) this).field_f <= 0) {
                    return;
                  } else {
                    ((bl) this).field_q = 240 - -((param1[7] * var4 + param1[6] * var3_int + param1[8] * var5 >> 7) / ((bl) this).field_f);
                    ((bl) this).field_n = (param1[5] * var5 + (param1[4] * var4 + param1[3] * var3_int) >> 7) / ((bl) this).field_f + 320;
                    L4: {
                      var5 = -param1[2] + ((bl) this).field_A;
                      var4 = ((bl) this).field_m - param1[1];
                      var3_int = -param1[0] + ((bl) this).field_w;
                      ((bl) this).field_G = var4 * param1[10] + (param1[9] * var3_int + param1[11] * var5) >> 16;
                      if (0 != ((bl) this).field_G) {
                        break L4;
                      } else {
                        ((bl) this).field_G = -1;
                        break L4;
                      }
                    }
                    if (0 >= ((bl) this).field_G) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      ((bl) this).field_p = 240 - -((param1[8] * var5 + (param1[7] * var4 + var3_int * param1[6]) >> 7) / ((bl) this).field_G);
                      ((bl) this).field_I = 320 + (var5 * param1[5] + var3_int * param1[3] - -(param1[4] * var4) >> 7) / ((bl) this).field_G;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var3;
            stackOut_23_1 = new StringBuilder().append("bl.A(").append(param0).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = Pool.field_O;
          if (0 >= ((bl) this).field_B) {
            break L0;
          } else {
            if (-1 <= ((bl) this).field_d) {
              break L0;
            } else {
              if (0 >= ((bl) this).field_f) {
                break L0;
              } else {
                if (-1 < ((bl) this).field_G) {
                  L1: {
                    L2: {
                      L3: {
                        if (((bl) this).field_o >= qh.field_b) {
                          break L3;
                        } else {
                          if (((bl) this).field_C >= qh.field_b) {
                            break L3;
                          } else {
                            if (((bl) this).field_n >= qh.field_b) {
                              break L3;
                            } else {
                              if (qh.field_b > ((bl) this).field_I) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                      if (((bl) this).field_o < qh.field_j) {
                        break L1;
                      } else {
                        if (((bl) this).field_C < qh.field_j) {
                          break L1;
                        } else {
                          if (((bl) this).field_n < qh.field_j) {
                            break L1;
                          } else {
                            if (((bl) this).field_I < qh.field_j) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    L4: {
                      L5: {
                        if (qh.field_c <= ((bl) this).field_l) {
                          break L5;
                        } else {
                          if (((bl) this).field_a >= qh.field_c) {
                            break L5;
                          } else {
                            if (((bl) this).field_q >= qh.field_c) {
                              break L5;
                            } else {
                              if (((bl) this).field_p < qh.field_c) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      if (qh.field_g > ((bl) this).field_l) {
                        break L1;
                      } else {
                        if (qh.field_g > ((bl) this).field_a) {
                          break L1;
                        } else {
                          if (qh.field_g > ((bl) this).field_q) {
                            break L1;
                          } else {
                            if (qh.field_g > ((bl) this).field_p) {
                              break L1;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                    }
                    return;
                  }
                  L6: {
                    if (((bl) this).field_E <= 0) {
                      var2 = 3346790;
                      break L6;
                    } else {
                      if (((bl) this).field_E >= 256) {
                        var2 = 10044586;
                        break L6;
                      } else {
                        var2 = (((bl) this).field_E * 17408 + 1114112 + -(((bl) this).field_E * 4352)) / 256 & 65280 | 16711935 & (((bl) this).field_E * 10027178 + (-(((bl) this).field_E * 3342438) + 855664128)) / 256;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (((bl) this).field_y <= 0) {
                      break L7;
                    } else {
                      if (256 <= ((bl) this).field_y) {
                        break L7;
                      } else {
                        var3 = (((bl) this).field_I + -((bl) this).field_o << 1) * ((bl) this).field_y / 256;
                        var4 = ((bl) this).field_y * (((bl) this).field_p - ((bl) this).field_l << 1) / 256;
                        var5 = 3 * (((bl) this).field_I + -((bl) this).field_o) / 2 * ((bl) this).field_y / 256;
                        var6 = ((bl) this).field_y * ((-((bl) this).field_l + ((bl) this).field_p) * 3 / 2) / 256;
                        var7 = (-((bl) this).field_y + 256 << 8) / 256;
                        qh.b(-var3 + ((bl) this).field_o, ((bl) this).field_l - var4, ((bl) this).field_C - var3, ((bl) this).field_a + -var4, 10044586, var7);
                        qh.b(var3 + ((bl) this).field_n, ((bl) this).field_q - -var4, var3 + ((bl) this).field_I, ((bl) this).field_p - -var4, 10044586, var7);
                        qh.b(((bl) this).field_o - var3, -var4 + ((bl) this).field_l, ((bl) this).field_n + -var3, ((bl) this).field_q - var4, 10044586, var7);
                        qh.b(var3 + ((bl) this).field_C, var4 + ((bl) this).field_a, var3 + ((bl) this).field_I, var4 + ((bl) this).field_p, 10044586, var7);
                        qh.b(((bl) this).field_o - var5, ((bl) this).field_l + -var6, -var5 + ((bl) this).field_C, -var6 + ((bl) this).field_a, 10044586, var7);
                        qh.b(((bl) this).field_n + var5, var6 + ((bl) this).field_q, var5 + ((bl) this).field_I, var6 + ((bl) this).field_p, 10044586, var7);
                        qh.b(((bl) this).field_o + -var5, -var6 + ((bl) this).field_l, ((bl) this).field_n + -var5, ((bl) this).field_q + -var6, 10044586, var7);
                        qh.b(var5 + ((bl) this).field_C, var6 + ((bl) this).field_a, ((bl) this).field_I - -var5, ((bl) this).field_p - -var6, 10044586, var7);
                        break L7;
                      }
                    }
                  }
                  L8: {
                    qh.d(((bl) this).field_o, ((bl) this).field_l, ((bl) this).field_C, ((bl) this).field_a, var2);
                    qh.d(((bl) this).field_n, ((bl) this).field_q, ((bl) this).field_I, ((bl) this).field_p, var2);
                    qh.d(((bl) this).field_o, ((bl) this).field_l, ((bl) this).field_n, ((bl) this).field_q, var2);
                    qh.d(((bl) this).field_C, ((bl) this).field_a, ((bl) this).field_I, ((bl) this).field_p, var2);
                    if (param0 == 67) {
                      break L8;
                    } else {
                      var9 = null;
                      ((bl) this).a(-121, (int[]) null);
                      break L8;
                    }
                  }
                  return;
                } else {
                  break L0;
                }
              }
            }
          }
        }
    }

    public static void a() {
        field_v = null;
        field_j = null;
        field_e = null;
        field_r = null;
        field_t = null;
    }

    bl(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11) {
        ((bl) this).field_m = param10;
        ((bl) this).field_w = param9;
        ((bl) this).field_u = param2;
        ((bl) this).field_A = param11;
        ((bl) this).field_F = param4;
        ((bl) this).field_k = param5;
        ((bl) this).field_D = param7;
        ((bl) this).field_z = param6;
        ((bl) this).field_i = param1;
        ((bl) this).field_J = param3;
        ((bl) this).field_h = param8;
        ((bl) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0;
        field_j = "You and <%0> have resigned!";
        field_r = new int[]{2, 20, 21, 49, 5, 10, 11, 13};
        field_v = "Game options changed (<%0>)";
        field_g = 65536;
        field_t = "Please enter your date of birth to enable chat:";
        field_e = "Kick";
    }
}
