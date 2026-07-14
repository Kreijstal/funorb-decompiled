/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id implements Serializable {
    int[] field_k;
    int[] field_h;
    int field_d;
    int field_a;
    private qg[] field_x;
    static jf field_s;
    int field_n;
    int[] field_y;
    boolean[] field_r;
    int[] field_j;
    int[] field_z;
    int[] field_v;
    int field_m;
    int[] field_u;
    boolean[] field_q;
    int[] field_c;
    static nc field_A;
    int[] field_i;
    int[] field_g;
    boolean[] field_e;
    static bd[] field_p;
    int[] field_f;
    int[] field_o;
    static ji field_t;
    static String field_l;
    boolean[] field_B;
    static bd field_w;
    static String field_b;

    private final void a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        boolean[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        if (-60001 == (param0.length ^ -1)) {
          this.a(106, 100, 100);
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (((id) this).field_n <= var4) {
              var5 = -72 / ((param1 - 41) / 54);
              return;
            } else {
              L1: {
                var3++;
                ((id) this).field_y[var4] = param0[var3];
                if (0 <= ((id) this).field_y[var4]) {
                  break L1;
                } else {
                  ((id) this).field_y[var4] = ((id) this).field_y[var4] + 256;
                  break L1;
                }
              }
              L2: {
                var3++;
                ((id) this).field_y[var4] = ((id) this).field_y[var4] + 64 * param0[var3];
                var3++;
                ((id) this).field_c[var4] = param0[var3] * 2;
                var3++;
                ((id) this).field_k[var4] = -5 + param0[var3];
                var3++;
                ((id) this).field_f[var4] = param0[var3];
                ((id) this).field_r[var4] = false;
                if (((id) this).field_f[var4] == 3) {
                  ((id) this).field_r[var4] = true;
                  if (((id) this).field_c[var4] == 0) {
                    ((id) this).field_f[var4] = 1;
                    break L2;
                  } else {
                    ((id) this).field_f[var4] = 0;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                var3++;
                stackOut_11_0 = ((id) this).field_B;
                stackOut_11_1 = var4;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (-2 != (param0[var3] ^ -1)) {
                  stackOut_13_0 = (boolean[]) (Object) stackIn_13_0;
                  stackOut_13_1 = stackIn_13_1;
                  stackOut_13_2 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  stackIn_14_2 = stackOut_13_2;
                  break L3;
                } else {
                  stackOut_12_0 = (boolean[]) (Object) stackIn_12_0;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_14_2 = stackOut_12_2;
                  break L3;
                }
              }
              stackIn_14_0[stackIn_14_1] = stackIn_14_2 != 0;
              ((id) this).field_u[var4] = 0;
              ((id) this).field_i[var4] = 0;
              ((id) this).field_e[var4] = false;
              var4++;
              continue L0;
            }
          }
        } else {
          this.a((byte) 92, param0);
          return;
        }
    }

    final int b(int param0, int param1, int param2) {
        int var4 = 0;
        L0: {
          if (((id) this).field_c[param2] <= 1) {
            break L0;
          } else {
            if (5 == ((id) this).field_c[param2]) {
              break L0;
            } else {
              return ((id) this).field_c[param2];
            }
          }
        }
        L1: {
          if ((param0 ^ -1) >= -1) {
            break L1;
          } else {
            L2: {
              var4 = param2 + -1;
              if (0 > var4) {
                break L2;
              } else {
                if (((id) this).field_c[var4] <= 1) {
                  break L2;
                } else {
                  if (((id) this).field_c[var4] == 5) {
                    break L2;
                  } else {
                    return ((id) this).field_c[var4];
                  }
                }
              }
            }
            L3: {
              var4 = -((id) this).field_d + param2;
              if (var4 < 0) {
                break L3;
              } else {
                if (((id) this).field_c[var4] >= -2) {
                  break L3;
                } else {
                  if (5 != ((id) this).field_c[var4]) {
                    return ((id) this).field_c[var4];
                  } else {
                    break L3;
                  }
                }
              }
            }
            L4: {
              var4--;
              if (-1 > var4) {
                break L4;
              } else {
                if (1 >= ((id) this).field_c[var4]) {
                  break L4;
                } else {
                  if (-6 != (((id) this).field_c[var4] ^ -1)) {
                    return ((id) this).field_c[var4];
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (param0 < -2) {
              L5: {
                var4 = param2 + -2;
                if (0 > var4) {
                  break L5;
                } else {
                  if (-2 >= ((id) this).field_c[var4]) {
                    break L5;
                  } else {
                    if (5 == ((id) this).field_c[var4]) {
                      break L5;
                    } else {
                      return ((id) this).field_c[var4];
                    }
                  }
                }
              }
              L6: {
                var4 = var4 - ((id) this).field_d;
                if (var4 > -1) {
                  break L6;
                } else {
                  if (-2 >= ((id) this).field_c[var4]) {
                    break L6;
                  } else {
                    if (((id) this).field_c[var4] == 5) {
                      break L6;
                    } else {
                      return ((id) this).field_c[var4];
                    }
                  }
                }
              }
              L7: {
                var4 = var4 - ((id) this).field_d;
                if (var4 < 0) {
                  break L7;
                } else {
                  if (((id) this).field_c[var4] <= 1) {
                    break L7;
                  } else {
                    if (((id) this).field_c[var4] != 5) {
                      return ((id) this).field_c[var4];
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                var4++;
                if (var4 < 0) {
                  break L8;
                } else {
                  if (-2 <= ((id) this).field_c[var4]) {
                    break L8;
                  } else {
                    if (((id) this).field_c[var4] != 5) {
                      return ((id) this).field_c[var4];
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var4++;
              if (-1 > var4) {
                break L1;
              } else {
                if (((id) this).field_c[var4] <= 1) {
                  break L1;
                } else {
                  if (((id) this).field_c[var4] == 5) {
                    break L1;
                  } else {
                    return ((id) this).field_c[var4];
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
        if (param1 == 5857) {
          return 0;
        } else {
          return 75;
        }
    }

    final void a(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        oc var15 = null;
        L0: {
          var14 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == -2) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          var15 = mm.field_m[0].field_j;
          var4 = var15.b(-4);
          vf.a(param0 + -83, var4);
          var5 = var15.field_g - 20;
          var6 = 20 + var15.field_g;
          var7 = var15.field_e - 27;
          if (-1 <= var5) {
            var5 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (-1 >= var7) {
            var7 = 1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          var8 = 27 + var15.field_e;
          if (var6 >= ((id) this).field_a - 1) {
            var6 = ((id) this).field_a + -2;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (var8 < -1 + ((id) this).field_d) {
            break L4;
          } else {
            var8 = -2 + ((id) this).field_d;
            break L4;
          }
        }
        var10 = ((id) this).field_d * var5;
        var11 = var5;
        L5: while (true) {
          if (var11 >= var6) {
            return;
          } else {
            var9 = var7 + var10;
            var12 = var7;
            L6: while (true) {
              if (var8 <= var12) {
                var10 = var10 + ((id) this).field_d;
                var11++;
                continue L5;
              } else {
                L7: {
                  if ((((id) this).field_u[var9] ^ -1) >= -1) {
                    break L7;
                  } else {
                    L8: {
                      if ((((id) this).field_u[var9] ^ -1) >= -1) {
                        break L8;
                      } else {
                        ((id) this).field_u[var9] = ((id) this).field_u[var9] - param1;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = ((id) this).field_u[var9] >> -1202191103;
                      if (((id) this).field_u[-1 + var9] >= var13) {
                        break L9;
                      } else {
                        ((id) this).field_u[var9 - 1] = var13;
                        break L9;
                      }
                    }
                    L10: {
                      if (((id) this).field_u[var9 - -1] < var13) {
                        ((id) this).field_u[1 + var9] = var13;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (var13 <= ((id) this).field_u[var9 - ((id) this).field_d]) {
                        break L11;
                      } else {
                        ((id) this).field_u[var9 + -((id) this).field_d] = var13;
                        break L11;
                      }
                    }
                    if (var13 > ((id) this).field_u[var9 - -((id) this).field_d]) {
                      ((id) this).field_u[((id) this).field_d + var9] = var13;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L12: {
                  if (-1 != (((id) this).field_f[var9] ^ -1)) {
                    if (((id) this).field_c[var9] == 2) {
                      break L12;
                    } else {
                      if (((id) this).field_c[var9] != -5) {
                        ((id) this).field_c[var9] = 1;
                        if (-2 > ((id) this).field_f[var9 + -1]) {
                          break L12;
                        } else {
                          if (-2 < ((id) this).field_f[var9 - ((id) this).field_d]) {
                            break L12;
                          } else {
                            if (-2 > ((id) this).field_f[var9 + -1 - ((id) this).field_d]) {
                              break L12;
                            } else {
                              ((id) this).field_c[var9] = 0;
                              break L12;
                            }
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                  } else {
                    ((id) this).field_c[var9] = 2;
                    break L12;
                  }
                }
                if (-1 == (((id) this).field_c[var9] ^ -1)) {
                  L13: {
                    if (((id) this).field_c[var9 - 1] == 2) {
                      break L13;
                    } else {
                      if (4 == ((id) this).field_c[var9 - 1]) {
                        break L13;
                      } else {
                        if (((id) this).field_c[-((id) this).field_d + var9] == -3) {
                          break L13;
                        } else {
                          if (-5 == ((id) this).field_c[-((id) this).field_d + var9]) {
                            break L13;
                          } else {
                            var9++;
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  ((id) this).field_c[var9] = 1;
                  var9++;
                  var12++;
                  continue L6;
                } else {
                  var9++;
                  var12++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_s = null;
        int var1 = -12 / ((param0 - -14) / 33);
        field_b = null;
        field_l = null;
        field_t = null;
        field_w = null;
        field_p = null;
        field_A = null;
    }

    private final void a(byte param0, byte[] param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vi var10 = null;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        boolean[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        boolean[] stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        L0: {
          var9 = HostileSpawn.field_I ? 1 : 0;
          var10 = new vi(param1);
          var4 = var10.l(32270);
          if (param0 > 81) {
            break L0;
          } else {
            ((id) this).a(-10, 78);
            break L0;
          }
        }
        L1: {
          var5 = var10.e(8);
          var6 = var10.e(8);
          this.a(62, var6, var5);
          if (-4 < (var4 ^ -1)) {
            int discarded$1 = var10.l(32270);
            break L1;
          } else {
            break L1;
          }
        }
        ((id) this).field_m = var10.l(32270);
        var7 = 0;
        L2: while (true) {
          if (var7 >= ((id) this).field_n) {
            L3: {
              if (-8 < (var4 ^ -1)) {
                break L3;
              } else {
                var7 = var10.l(32270) * 2;
                ((id) this).field_v = new int[var7];
                var8 = 0;
                L4: while (true) {
                  if (var8 >= var7) {
                    break L3;
                  } else {
                    ((id) this).field_v[var8] = var10.e(8);
                    var8++;
                    continue L4;
                  }
                }
              }
            }
            L5: {
              if (var4 >= 8) {
                var7 = var10.l(32270);
                ((id) this).field_x = new qg[var7];
                var8 = 0;
                L6: while (true) {
                  if (var8 >= var7) {
                    break L5;
                  } else {
                    ((id) this).field_x[var8] = new qg(var10);
                    var8++;
                    continue L6;
                  }
                }
              } else {
                break L5;
              }
            }
            return;
          } else {
            L7: {
              ((id) this).field_y[var7] = var10.e(8);
              ((id) this).field_c[var7] = var10.l(32270);
              if (var4 < 9) {
                ((id) this).field_k[var7] = var10.l(32270);
                break L7;
              } else {
                ((id) this).field_k[var7] = var10.e(8);
                break L7;
              }
            }
            L8: {
              if ((var4 ^ -1) <= -5) {
                ((id) this).field_j[var7] = var10.l(32270);
                ((id) this).field_z[var7] = var10.l(32270);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              ((id) this).field_f[var7] = var10.l(32270);
              stackOut_13_0 = ((id) this).field_r;
              stackOut_13_1 = var7;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              if ((var10.l(32270) ^ -1) != -2) {
                stackOut_15_0 = (boolean[]) (Object) stackIn_15_0;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                stackIn_16_2 = stackOut_15_2;
                break L9;
              } else {
                stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                break L9;
              }
            }
            L10: {
              stackIn_16_0[stackIn_16_1] = stackIn_16_2 != 0;
              stackOut_16_0 = ((id) this).field_B;
              stackOut_16_1 = var7;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              if (var10.l(32270) != 1) {
                stackOut_18_0 = (boolean[]) (Object) stackIn_18_0;
                stackOut_18_1 = stackIn_18_1;
                stackOut_18_2 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                stackIn_19_2 = stackOut_18_2;
                break L10;
              } else {
                stackOut_17_0 = (boolean[]) (Object) stackIn_17_0;
                stackOut_17_1 = stackIn_17_1;
                stackOut_17_2 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_19_2 = stackOut_17_2;
                break L10;
              }
            }
            L11: {
              stackIn_19_0[stackIn_19_1] = stackIn_19_2 != 0;
              if (var4 < 1) {
                ((id) this).field_o[var7] = 0;
                break L11;
              } else {
                ((id) this).field_o[var7] = var10.b(true);
                break L11;
              }
            }
            L12: {
              if ((var4 ^ -1) > -6) {
                break L12;
              } else {
                ((id) this).field_g[var7] = var10.l(32270);
                break L12;
              }
            }
            L13: {
              if ((var4 ^ -1) > -7) {
                break L13;
              } else {
                ((id) this).field_h[var7] = var10.l(32270);
                break L13;
              }
            }
            ((id) this).field_u[var7] = 0;
            ((id) this).field_i[var7] = 0;
            ((id) this).field_e[var7] = false;
            var7++;
            continue L2;
          }
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          ((id) this).field_a = param1;
          ((id) this).field_d = param2;
          ((id) this).field_n = ((id) this).field_d * ((id) this).field_a;
          ((id) this).field_h = new int[((id) this).field_n];
          ((id) this).field_u = new int[((id) this).field_n];
          if (param0 > 42) {
            break L0;
          } else {
            ((id) this).field_z = null;
            break L0;
          }
        }
        ((id) this).field_e = new boolean[((id) this).field_n];
        ((id) this).field_g = new int[((id) this).field_n];
        ((id) this).field_f = new int[((id) this).field_n];
        ((id) this).field_v = new int[]{};
        ((id) this).field_i = new int[((id) this).field_n];
        ((id) this).field_c = new int[((id) this).field_n];
        ((id) this).field_k = new int[((id) this).field_n];
        ((id) this).field_r = new boolean[((id) this).field_n];
        ((id) this).field_o = new int[((id) this).field_n];
        ((id) this).field_y = new int[((id) this).field_n];
        ((id) this).field_q = new boolean[((id) this).field_n];
        ((id) this).field_B = new boolean[((id) this).field_n];
        ((id) this).field_j = new int[((id) this).field_n];
        ((id) this).field_z = new int[((id) this).field_n];
        ((id) this).field_x = new qg[]{};
        var4 = 0;
        L1: while (true) {
          if (var4 >= ((id) this).field_n) {
            return;
          } else {
            ((id) this).field_y[var4] = 0;
            ((id) this).field_c[var4] = 2;
            ((id) this).field_k[var4] = 0;
            ((id) this).field_j[var4] = 0;
            ((id) this).field_z[var4] = 0;
            ((id) this).field_u[var4] = 0;
            ((id) this).field_i[var4] = 0;
            ((id) this).field_r[var4] = false;
            ((id) this).field_e[var4] = false;
            ((id) this).field_f[var4] = 0;
            ((id) this).field_B[var4] = false;
            ((id) this).field_o[var4] = 0;
            var4++;
            continue L1;
          }
        }
    }

    final int c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param1 > (((id) this).field_c[param2] ^ -1)) {
            var4 = ((id) this).field_c[param2];
        }
        if (param0 < -1) {
            if (-1 < param2) {
                if (-2 > (((id) this).field_c[-1 + param2] ^ -1)) {
                    var4 = ((id) this).field_c[-1 + param2];
                }
            }
            if (param2 > ((id) this).field_d - -1) {
                if (!((((id) this).field_c[param2 - (1 + ((id) this).field_d)] ^ -1) >= -2)) {
                    var4 = ((id) this).field_c[-((id) this).field_d + (-1 + param2)];
                }
            }
            if (((id) this).field_d < param2) {
                if (!(-2 <= (((id) this).field_c[param2 - ((id) this).field_d] ^ -1))) {
                    var4 = ((id) this).field_c[-((id) this).field_d + param2];
                }
            }
        }
        return var4;
    }

    id(byte[] param0) {
        ((id) this).field_x = new qg[]{};
        this.a(param0, 127);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new jf();
        field_l = "Connection restored.";
        field_b = "Find the rocket launcher, then use it to destroy the turrets blocking the lift.";
    }
}
