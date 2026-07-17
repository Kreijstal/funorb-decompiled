/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo extends tt {
    boolean field_m;
    int field_r;
    private short[] field_u;
    static hv field_w;
    private byte[] field_x;
    private int field_v;
    int field_s;
    static String[] field_o;
    int field_p;
    int field_q;
    static int[] field_t;
    private short[] field_y;
    static float[] field_n;

    final void a(int param0, int param1, int[] param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
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
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5 = ((mo) this).field_q * uv.field_o[param1];
            if (param0 == -28696) {
              L1: {
                if (1 == ((mo) this).field_s) {
                  L2: {
                    var9 = ((mo) this).field_u[0];
                    var8 = ((mo) this).field_y[0] << 12;
                    var13 = var8 * ((mo) this).field_q >> 12;
                    var11 = var5 * var8 >> 12;
                    var12 = var8 * ((mo) this).field_r >> 12;
                    var15 = var11 >> 12;
                    var16 = 1 + var15;
                    if (var16 < var13) {
                      break L2;
                    } else {
                      var16 = 0;
                      break L2;
                    }
                  }
                  var11 = var11 & 4095;
                  var17 = ((mo) this).field_x[255 & var15] & 255;
                  var18 = ((mo) this).field_x[var16 & 255] & 255;
                  var14 = mu.field_y[var11];
                  if (((mo) this).field_m) {
                    var10 = 0;
                    L3: while (true) {
                      if (var10 >= ws.field_b) {
                        break L1;
                      } else {
                        var4_int = ((mo) this).field_r * gs.field_b[var10];
                        var6 = this.a(var18, var14, 3, var12, var11, var8 * var4_int >> 12, var17);
                        var6 = var6 * var9 >> 12;
                        param2[var10] = (var6 >> 1) + 2048;
                        var10++;
                        continue L3;
                      }
                    }
                  } else {
                    var10 = 0;
                    L4: while (true) {
                      if (ws.field_b <= var10) {
                        break L1;
                      } else {
                        var4_int = gs.field_b[var10] * ((mo) this).field_r;
                        var6 = this.a(var18, var14, 3, var12, var11, var4_int * var8 >> 12, var17);
                        param2[var10] = var6 * var9 >> 12;
                        var10++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  L5: {
                    L6: {
                      var9 = ((mo) this).field_u[0];
                      if (8 < var9) {
                        break L6;
                      } else {
                        if (-8 > var9) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L7: {
                      var8 = ((mo) this).field_y[0] << 12;
                      var12 = var8 * ((mo) this).field_r >> 12;
                      var13 = ((mo) this).field_q * var8 >> 12;
                      var11 = var5 * var8 >> 12;
                      var15 = var11 >> 12;
                      var16 = var15 - -1;
                      if (var13 > var16) {
                        break L7;
                      } else {
                        var16 = 0;
                        break L7;
                      }
                    }
                    var11 = var11 & 4095;
                    var18 = 255 & ((mo) this).field_x[255 & var16];
                    var17 = 255 & ((mo) this).field_x[255 & var15];
                    var14 = mu.field_y[var11];
                    var10 = 0;
                    L8: while (true) {
                      if (ws.field_b <= var10) {
                        break L5;
                      } else {
                        var4_int = gs.field_b[var10] * ((mo) this).field_r;
                        var6 = this.a(var18, var14, param0 + 28699, var12, var11, var8 * var4_int >> 12, var17);
                        param2[var10] = var9 * var6 >> 12;
                        var10++;
                        continue L8;
                      }
                    }
                  }
                  var7 = 1;
                  L9: while (true) {
                    if (var7 >= ((mo) this).field_s) {
                      break L1;
                    } else {
                      L10: {
                        L11: {
                          var9 = ((mo) this).field_u[var7];
                          if (var9 > 8) {
                            break L11;
                          } else {
                            if (var9 < -8) {
                              break L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L12: {
                          var8 = ((mo) this).field_y[var7] << 12;
                          var12 = ((mo) this).field_r * var8 >> 12;
                          var13 = var8 * ((mo) this).field_q >> 12;
                          var11 = var5 * var8 >> 12;
                          var15 = var11 >> 12;
                          var16 = 1 + var15;
                          if (~var16 <= ~var13) {
                            var16 = 0;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          var11 = var11 & 4095;
                          var17 = 255 & ((mo) this).field_x[var15 & 255];
                          var14 = mu.field_y[var11];
                          var18 = 255 & ((mo) this).field_x[255 & var16];
                          if (!((mo) this).field_m) {
                            break L13;
                          } else {
                            if (((mo) this).field_s - 1 == var7) {
                              var10 = 0;
                              L14: while (true) {
                                if (~ws.field_b >= ~var10) {
                                  break L10;
                                } else {
                                  var4_int = gs.field_b[var10] * ((mo) this).field_r;
                                  var6 = this.a(var18, var14, 3, var12, var11, var4_int * var8 >> 12, var17);
                                  var6 = param2[var10] - -(var9 * var6 >> 12);
                                  param2[var10] = 2048 + (var6 >> 1);
                                  var10++;
                                  continue L14;
                                }
                              }
                            } else {
                              break L13;
                            }
                          }
                        }
                        var10 = 0;
                        L15: while (true) {
                          if (var10 >= ws.field_b) {
                            break L10;
                          } else {
                            var4_int = ((mo) this).field_r * gs.field_b[var10];
                            var6 = this.a(var18, var14, 3, var12, var11, var8 * var4_int >> 12, var17);
                            param2[var10] = param2[var10] + (var9 * var6 >> 12);
                            var10++;
                            continue L15;
                          }
                        }
                      }
                      var7++;
                      continue L9;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var4 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var4;
            stackOut_40_1 = new StringBuilder().append("mo.A(").append(param0).append(44).append(param1).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param2 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L16;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L16;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
        }
    }

    final static void a(int param0, int param1) {
        lr.a(nt.field_m[param1], (byte) 56);
        int var2 = 29 % ((param0 - -73) / 48);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        ((mo) this).field_x = td.a(((mo) this).field_v, -50);
        this.d(param0 + 126);
        var2 = ((mo) this).field_s + -1;
        L0: while (true) {
          L1: {
            if (var2 < 1) {
              break L1;
            } else {
              var3 = ((mo) this).field_u[var2];
              if (var3 > 8) {
                break L1;
              } else {
                if (var3 >= -8) {
                  ((mo) this).field_s = ((mo) this).field_s - 1;
                  var2--;
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          L2: {
            if (param0 == -8) {
              break L2;
            } else {
              var5 = null;
              ((mo) this).a(14, 34, (int[]) null);
              break L2;
            }
          }
          return;
        }
    }

    mo() {
        super(0, true);
        ((mo) this).field_x = new byte[512];
        ((mo) this).field_r = 4;
        ((mo) this).field_p = 1638;
        ((mo) this).field_v = 0;
        ((mo) this).field_m = true;
        ((mo) this).field_q = 4;
        ((mo) this).field_s = 4;
    }

    final static boolean a(int param0, int param1, int param2) {
        return bj.a(param1, (byte) -113, param0) & (((8192 & param1) != 0 ? true : false) | lg.a(param1, -92, param0) | mb.a(true, param0, param1));
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var18 = Sumoblitz.field_L ? 1 : 0;
          var13 = param5 >> 12;
          var12 = var13 + 1;
          param5 = param5 & 4095;
          var13 = var13 & 255;
          if (param3 > var12) {
            break L0;
          } else {
            var12 = 0;
            break L0;
          }
        }
        L1: {
          var12 = var12 & 255;
          var10 = -4096 + param4;
          var11 = -4096 + param5;
          var15 = mu.field_y[param5];
          var14 = 3 & ((mo) this).field_x[param6 + var13];
          if (var14 > 1) {
            L2: {
              if (var14 == 2) {
                stackOut_9_0 = param5 - param4;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              } else {
                stackOut_8_0 = -param5 + -param4;
                stackIn_10_0 = stackOut_8_0;
                break L2;
              }
            }
            var8 = stackIn_10_0;
            break L1;
          } else {
            L3: {
              if (var14 == 0) {
                stackOut_5_0 = param4 + param5;
                stackIn_6_0 = stackOut_5_0;
                break L3;
              } else {
                stackOut_4_0 = -param5 + param4;
                stackIn_6_0 = stackOut_4_0;
                break L3;
              }
            }
            var8 = stackIn_6_0;
            break L1;
          }
        }
        L4: {
          var14 = ((mo) this).field_x[param6 + var12] & 3;
          if (var14 <= 1) {
            L5: {
              if (var14 == 0) {
                stackOut_18_0 = param4 + var11;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = param4 - var11;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            var9 = stackIn_19_0;
            break L4;
          } else {
            L6: {
              if (2 != var14) {
                stackOut_14_0 = -var11 - param4;
                stackIn_15_0 = stackOut_14_0;
                break L6;
              } else {
                stackOut_13_0 = -param4 + var11;
                stackIn_15_0 = stackOut_13_0;
                break L6;
              }
            }
            var9 = stackIn_15_0;
            break L4;
          }
        }
        L7: {
          var16 = var8 + ((-var8 + var9) * var15 >> 12);
          var14 = param2 & ((mo) this).field_x[var13 + param0];
          if (var14 > 1) {
            L8: {
              if (var14 != 2) {
                stackOut_27_0 = -param5 - var10;
                stackIn_28_0 = stackOut_27_0;
                break L8;
              } else {
                stackOut_26_0 = -var10 + param5;
                stackIn_28_0 = stackOut_26_0;
                break L8;
              }
            }
            var8 = stackIn_28_0;
            break L7;
          } else {
            L9: {
              if (var14 != 0) {
                stackOut_23_0 = var10 - param5;
                stackIn_24_0 = stackOut_23_0;
                break L9;
              } else {
                stackOut_22_0 = var10 + param5;
                stackIn_24_0 = stackOut_22_0;
                break L9;
              }
            }
            var8 = stackIn_24_0;
            break L7;
          }
        }
        L10: {
          var14 = ((mo) this).field_x[param0 + var12] & 3;
          if (var14 <= 1) {
            L11: {
              if (0 != var14) {
                stackOut_36_0 = -var11 + var10;
                stackIn_37_0 = stackOut_36_0;
                break L11;
              } else {
                stackOut_35_0 = var10 + var11;
                stackIn_37_0 = stackOut_35_0;
                break L11;
              }
            }
            var9 = stackIn_37_0;
            break L10;
          } else {
            L12: {
              if (var14 == 2) {
                stackOut_32_0 = var11 - var10;
                stackIn_33_0 = stackOut_32_0;
                break L12;
              } else {
                stackOut_31_0 = -var11 + -var10;
                stackIn_33_0 = stackOut_31_0;
                break L12;
              }
            }
            var9 = stackIn_33_0;
            break L10;
          }
        }
        var17 = var8 - -((var9 + -var8) * var15 >> 12);
        return (param1 * (-var16 + var17) >> 12) + var16;
    }

    public static void e(int param0) {
        field_w = null;
        field_t = null;
        field_n = null;
        field_o = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (((mo) this).field_p <= 0) {
            if (((mo) this).field_u == null) {
              break L0;
            } else {
              if (((mo) this).field_u.length != ((mo) this).field_s) {
                break L0;
              } else {
                ((mo) this).field_y = new short[((mo) this).field_s];
                var2 = 0;
                L1: while (true) {
                  if (((mo) this).field_s <= var2) {
                    break L0;
                  } else {
                    ((mo) this).field_y[var2] = (short)(int)Math.pow(2.0, (double)var2);
                    var2++;
                    continue L1;
                  }
                }
              }
            }
          } else {
            ((mo) this).field_y = new short[((mo) this).field_s];
            ((mo) this).field_u = new short[((mo) this).field_s];
            var2 = 0;
            L2: while (true) {
              if (var2 >= ((mo) this).field_s) {
                break L0;
              } else {
                ((mo) this).field_u[var2] = (short)(int)(Math.pow((double)((float)((mo) this).field_p / 4096.0f), (double)var2) * 4096.0);
                ((mo) this).field_y[var2] = (short)(int)Math.pow(2.0, (double)var2);
                var2++;
                continue L2;
              }
            }
          }
        }
        L3: {
          if (param0 > 81) {
            break L3;
          } else {
            mo.a(57, -58);
            break L3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_w = new hv();
        field_t = new int[4];
        field_n = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }
}
