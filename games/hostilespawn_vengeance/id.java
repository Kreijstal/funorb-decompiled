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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            if (param0.length == 60000) {
              this.a(106, 100, 100);
              var3_int = 0;
              var4 = 0;
              L1: while (true) {
                if (((id) this).field_n <= var4) {
                  var5 = -72;
                  break L0;
                } else {
                  L2: {
                    int incrementValue$6 = var3_int;
                    var3_int++;
                    ((id) this).field_y[var4] = param0[incrementValue$6];
                    if (0 <= ((id) this).field_y[var4]) {
                      break L2;
                    } else {
                      ((id) this).field_y[var4] = ((id) this).field_y[var4] + 256;
                      break L2;
                    }
                  }
                  L3: {
                    int incrementValue$7 = var3_int;
                    var3_int++;
                    ((id) this).field_y[var4] = ((id) this).field_y[var4] + 64 * param0[incrementValue$7];
                    int incrementValue$8 = var3_int;
                    var3_int++;
                    ((id) this).field_c[var4] = param0[incrementValue$8] * 2;
                    int incrementValue$9 = var3_int;
                    var3_int++;
                    ((id) this).field_k[var4] = -5 + param0[incrementValue$9];
                    int incrementValue$10 = var3_int;
                    var3_int++;
                    ((id) this).field_f[var4] = param0[incrementValue$10];
                    ((id) this).field_r[var4] = false;
                    if (((id) this).field_f[var4] == 3) {
                      ((id) this).field_r[var4] = true;
                      if (((id) this).field_c[var4] == 0) {
                        ((id) this).field_f[var4] = 1;
                        break L3;
                      } else {
                        ((id) this).field_f[var4] = 0;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    int incrementValue$11 = var3_int;
                    var3_int++;
                    stackOut_13_0 = ((id) this).field_B;
                    stackOut_13_1 = var4;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    if (param0[incrementValue$11] != 1) {
                      stackOut_15_0 = (boolean[]) (Object) stackIn_15_0;
                      stackOut_15_1 = stackIn_15_1;
                      stackOut_15_2 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      break L4;
                    } else {
                      stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
                      stackOut_14_1 = stackIn_14_1;
                      stackOut_14_2 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_16_2 = stackOut_14_2;
                      break L4;
                    }
                  }
                  stackIn_16_0[stackIn_16_1] = stackIn_16_2 != 0;
                  ((id) this).field_u[var4] = 0;
                  ((id) this).field_i[var4] = 0;
                  ((id) this).field_e[var4] = false;
                  var4++;
                  continue L1;
                }
              }
            } else {
              this.a((byte) 92, param0);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("id.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 127 + ')');
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
          if (param0 <= 0) {
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
                if (((id) this).field_c[var4] <= 1) {
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
              if (var4 < 0) {
                break L4;
              } else {
                if (1 >= ((id) this).field_c[var4]) {
                  break L4;
                } else {
                  if (((id) this).field_c[var4] != 5) {
                    return ((id) this).field_c[var4];
                  } else {
                    break L4;
                  }
                }
              }
            }
            if (param0 > 1) {
              L5: {
                var4 = param2 + -2;
                if (0 > var4) {
                  break L5;
                } else {
                  if (((id) this).field_c[var4] <= 1) {
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
                if (var4 < 0) {
                  break L6;
                } else {
                  if (((id) this).field_c[var4] <= 1) {
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
                  if (((id) this).field_c[var4] <= 1) {
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
              if (var4 < 0) {
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
          if (var5 <= 0) {
            var5 = 1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var7 <= 0) {
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
              if (~var8 >= ~var12) {
                var10 = var10 + ((id) this).field_d;
                var11++;
                continue L5;
              } else {
                L7: {
                  if (((id) this).field_u[var9] <= 0) {
                    break L7;
                  } else {
                    L8: {
                      if (((id) this).field_u[var9] <= 0) {
                        break L8;
                      } else {
                        ((id) this).field_u[var9] = ((id) this).field_u[var9] - param1;
                        break L8;
                      }
                    }
                    L9: {
                      var13 = ((id) this).field_u[var9] >> 1;
                      if (~((id) this).field_u[-1 + var9] <= ~var13) {
                        break L9;
                      } else {
                        ((id) this).field_u[var9 - 1] = var13;
                        break L9;
                      }
                    }
                    L10: {
                      if (~((id) this).field_u[var9 - -1] > ~var13) {
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
                  if (((id) this).field_f[var9] != 0) {
                    if (((id) this).field_c[var9] == 2) {
                      break L12;
                    } else {
                      if (((id) this).field_c[var9] != 4) {
                        ((id) this).field_c[var9] = 1;
                        if (((id) this).field_f[var9 + -1] < 1) {
                          break L12;
                        } else {
                          if (((id) this).field_f[var9 - ((id) this).field_d] < 1) {
                            break L12;
                          } else {
                            if (((id) this).field_f[var9 + -1 - ((id) this).field_d] < 1) {
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
                L13: {
                  if (((id) this).field_c[var9] != 0) {
                    break L13;
                  } else {
                    L14: {
                      if (((id) this).field_c[var9 - 1] == 2) {
                        break L14;
                      } else {
                        if (4 == ((id) this).field_c[var9 - 1]) {
                          break L14;
                        } else {
                          if (((id) this).field_c[-((id) this).field_d + var9] == 2) {
                            break L14;
                          } else {
                            if (((id) this).field_c[-((id) this).field_d + var9] == 4) {
                              break L14;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                    }
                    ((id) this).field_c[var9] = 1;
                    break L13;
                  }
                }
                var9++;
                var12++;
                continue L6;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_s = null;
        int var1 = -12;
        field_b = null;
        field_l = null;
        field_t = null;
        field_w = null;
        field_p = null;
        field_A = null;
    }

    private final void a(byte param0, byte[] param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        vi var10 = null;
        boolean[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean[] stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        boolean[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        boolean[] stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        int stackIn_18_2 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        boolean[] stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        boolean[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        boolean[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        boolean[] stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        boolean[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var9 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new vi(param1);
              var4 = var10.l(32270);
              var5 = var10.e(8);
              var6 = var10.e(8);
              this.a(62, var6, var5);
              if (var4 < 3) {
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
                  if (var4 < 7) {
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
                break L0;
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
                  if (var4 >= 4) {
                    ((id) this).field_j[var7] = var10.l(32270);
                    ((id) this).field_z[var7] = var10.l(32270);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  ((id) this).field_f[var7] = var10.l(32270);
                  stackOut_12_0 = ((id) this).field_r;
                  stackOut_12_1 = var7;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (var10.l(32270) != 1) {
                    stackOut_14_0 = (boolean[]) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L9;
                  } else {
                    stackOut_13_0 = (boolean[]) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L9;
                  }
                }
                L10: {
                  stackIn_15_0[stackIn_15_1] = stackIn_15_2 != 0;
                  stackOut_15_0 = ((id) this).field_B;
                  stackOut_15_1 = var7;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (var10.l(32270) != 1) {
                    stackOut_17_0 = (boolean[]) (Object) stackIn_17_0;
                    stackOut_17_1 = stackIn_17_1;
                    stackOut_17_2 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    stackIn_18_2 = stackOut_17_2;
                    break L10;
                  } else {
                    stackOut_16_0 = (boolean[]) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_18_1 = stackOut_16_1;
                    stackIn_18_2 = stackOut_16_2;
                    break L10;
                  }
                }
                L11: {
                  stackIn_18_0[stackIn_18_1] = stackIn_18_2 != 0;
                  if (var4 < 1) {
                    ((id) this).field_o[var7] = 0;
                    break L11;
                  } else {
                    ((id) this).field_o[var7] = var10.b(true);
                    break L11;
                  }
                }
                L12: {
                  if (var4 < 5) {
                    break L12;
                  } else {
                    ((id) this).field_g[var7] = var10.l(32270);
                    break L12;
                  }
                }
                L13: {
                  if (var4 < 6) {
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
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var3;
            stackOut_36_1 = new StringBuilder().append("id.D(").append(92).append(',');
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L14;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L14;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
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
        if (param1 > ~((id) this).field_c[param2]) {
            var4 = ((id) this).field_c[param2];
        }
        if (param0 > 0) {
            if (param2 > 0) {
                if (((id) this).field_c[-1 + param2] > 1) {
                    var4 = ((id) this).field_c[-1 + param2];
                }
            }
            if (param2 > ((id) this).field_d - -1) {
                if (!(((id) this).field_c[param2 - (1 + ((id) this).field_d)] <= 1)) {
                    var4 = ((id) this).field_c[-((id) this).field_d + (-1 + param2)];
                }
            }
            if (~((id) this).field_d > ~param2) {
                if (!(((id) this).field_c[param2 - ((id) this).field_d] <= 1)) {
                    var4 = ((id) this).field_c[-((id) this).field_d + param2];
                }
            }
        }
        return var4;
    }

    id(byte[] param0) {
        ((id) this).field_x = new qg[]{};
        try {
            this.a(param0, 127);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "id.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
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
