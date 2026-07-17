/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends bk {
    int[] field_i;
    int[] field_s;
    int[] field_f;
    int field_m;
    private int field_w;
    int[] field_t;
    int[] field_u;
    byte[] field_F;
    int[] field_y;
    int[] field_l;
    private short[] field_r;
    private byte[] field_q;
    int[] field_p;
    short[] field_z;
    int[] field_g;
    private byte field_D;
    int[] field_v;
    private byte[] field_B;
    int field_k;
    int[] field_j;
    int field_x;
    private static boolean field_n;
    private boolean field_E;
    int[] field_h;
    private short field_o;

    final static int a(int param0, int param1) {
        param1 = param1 * (param0 & 127) >> 7;
        if (param1 < 2) {
            param1 = 2;
        } else {
            if (param1 > 126) {
                param1 = 126;
            }
        }
        return (param0 & 65408) + param1;
    }

    final int a() {
        if (!((pj) this).field_E) {
            this.b();
        }
        return ((pj) this).field_o;
    }

    final static int a(int param0) {
        if (param0 < 2) {
            param0 = 2;
        } else {
            if (param0 > 126) {
                param0 = 126;
            }
        }
        return param0;
    }

    private final void b() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
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
        var1 = 32767;
        var2 = 32767;
        var3 = 32767;
        var4 = -32768;
        var5 = -32768;
        var6 = -32768;
        var7 = 0;
        var8 = 0;
        var9 = 0;
        L0: while (true) {
          if (var9 >= ((pj) this).field_w) {
            ((pj) this).field_o = (short)(int)(Math.sqrt((double)var8) + 0.99);
            ((pj) this).field_E = true;
            return;
          } else {
            L1: {
              var10 = ((pj) this).field_j[var9];
              var11 = ((pj) this).field_y[var9];
              var12 = ((pj) this).field_v[var9];
              if (var10 >= var1) {
                break L1;
              } else {
                var1 = var10;
                break L1;
              }
            }
            L2: {
              if (var10 <= var4) {
                break L2;
              } else {
                var4 = var10;
                break L2;
              }
            }
            L3: {
              if (var11 >= var2) {
                break L3;
              } else {
                var2 = var11;
                break L3;
              }
            }
            L4: {
              if (var11 <= var5) {
                break L4;
              } else {
                var5 = var11;
                break L4;
              }
            }
            L5: {
              if (var12 >= var3) {
                break L5;
              } else {
                var3 = var12;
                break L5;
              }
            }
            L6: {
              if (var12 <= var6) {
                break L6;
              } else {
                var6 = var12;
                break L6;
              }
            }
            L7: {
              var13 = var10 * var10 + var12 * var12;
              if (var13 <= var7) {
                break L7;
              } else {
                var7 = var13;
                break L7;
              }
            }
            var13 = var13 + var11 * var11;
            if (var13 > var8) {
              var8 = var13;
              var9++;
              continue L0;
            } else {
              var9++;
              continue L0;
            }
          }
        }
    }

    private pj() {
        ((pj) this).field_m = 0;
        ((pj) this).field_w = 0;
        ((pj) this).field_D = (byte) 0;
        ((pj) this).field_k = 0;
        ((pj) this).field_x = 0;
        ((pj) this).field_E = false;
    }

    pj(rm param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var9_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        bl var18 = null;
        bl var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        L0: {
          ((pj) this).field_m = 0;
          ((pj) this).field_w = 0;
          ((pj) this).field_D = (byte) 0;
          ((pj) this).field_k = 0;
          ((pj) this).field_x = 0;
          ((pj) this).field_E = false;
          param0.a();
          param0.c();
          ((pj) this).field_k = param0.field_f;
          ((pj) this).field_w = param0.field_F;
          ((pj) this).field_j = param0.field_M;
          ((pj) this).field_y = param0.field_B;
          ((pj) this).field_v = param0.field_E;
          ((pj) this).field_x = param0.field_g;
          ((pj) this).field_p = param0.field_o;
          ((pj) this).field_u = param0.field_y;
          ((pj) this).field_t = param0.field_q;
          ((pj) this).field_B = param0.field_G;
          ((pj) this).field_q = param0.field_r;
          ((pj) this).field_D = param0.field_I;
          ((pj) this).field_r = param0.field_m;
          var7 = (int)Math.sqrt((double)(param3 * param3 + param4 * param4 + param5 * param5));
          var8 = param2 * var7 >> 8;
          ((pj) this).field_f = new int[((pj) this).field_x];
          ((pj) this).field_s = new int[((pj) this).field_x];
          ((pj) this).field_l = new int[((pj) this).field_x];
          if (param0.field_A == null) {
            ((pj) this).field_z = null;
            break L0;
          } else {
            ((pj) this).field_z = new short[((pj) this).field_x];
            var9 = 0;
            L1: while (true) {
              if (var9 >= ((pj) this).field_x) {
                break L0;
              } else {
                L2: {
                  var10 = param0.field_A[var9];
                  if (var10 == -1) {
                    break L2;
                  } else {
                    if (!be.field_c.d(var10)) {
                      break L2;
                    } else {
                      ((pj) this).field_z[var9] = (short)var10;
                      var9++;
                      continue L1;
                    }
                  }
                }
                ((pj) this).field_z[var9] = (short) -1;
                var9++;
                continue L1;
              }
            }
          }
        }
        L3: {
          if (param0.field_k <= 0) {
            break L3;
          } else {
            if (param0.field_D == null) {
              break L3;
            } else {
              var22 = new int[param0.field_k];
              var21 = var22;
              var20 = var21;
              var17 = var20;
              var9_ref_int__ = var17;
              var10 = 0;
              L4: while (true) {
                if (var10 >= ((pj) this).field_x) {
                  ((pj) this).field_m = 0;
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= param0.field_k) {
                      ((pj) this).field_h = new int[((pj) this).field_m];
                      ((pj) this).field_g = new int[((pj) this).field_m];
                      ((pj) this).field_i = new int[((pj) this).field_m];
                      var10 = 0;
                      var11 = 0;
                      L6: while (true) {
                        if (var11 >= param0.field_k) {
                          ((pj) this).field_F = new byte[((pj) this).field_x];
                          var11 = 0;
                          L7: while (true) {
                            if (var11 >= ((pj) this).field_x) {
                              break L3;
                            } else {
                              if (param0.field_D[var11] == -1) {
                                ((pj) this).field_F[var11] = (byte) -1;
                                var11++;
                                continue L7;
                              } else {
                                ((pj) this).field_F[var11] = (byte)var9_ref_int__[param0.field_D[var11] & 255];
                                if (((pj) this).field_F[var11] == -1) {
                                  if (((pj) this).field_z != null) {
                                    ((pj) this).field_z[var11] = (short) -1;
                                    var11++;
                                    continue L7;
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                } else {
                                  var11++;
                                  continue L7;
                                }
                              }
                            }
                          }
                        } else {
                          L8: {
                            if (var22[var11] <= 0) {
                              break L8;
                            } else {
                              if (param0.field_s[var11] != 0) {
                                break L8;
                              } else {
                                ((pj) this).field_h[var10] = param0.field_u[var11] & 65535;
                                ((pj) this).field_g[var10] = param0.field_n[var11] & 65535;
                                ((pj) this).field_i[var10] = param0.field_x[var11] & 65535;
                                int incrementValue$1 = var10;
                                var10++;
                                var9_ref_int__[var11] = incrementValue$1;
                                var11++;
                                continue L6;
                              }
                            }
                          }
                          var22[var11] = -1;
                          var11++;
                          continue L6;
                        }
                      }
                    } else {
                      if (var22[var10] > 0) {
                        if (param0.field_s[var10] == 0) {
                          ((pj) this).field_m = ((pj) this).field_m + 1;
                          var10++;
                          continue L5;
                        } else {
                          var10++;
                          continue L5;
                        }
                      } else {
                        var10++;
                        continue L5;
                      }
                    }
                  }
                } else {
                  if (param0.field_D[var10] != -1) {
                    var9_ref_int__[param0.field_D[var10] & 255] = var9_ref_int__[param0.field_D[var10] & 255] + 1;
                    var10++;
                    continue L4;
                  } else {
                    var10++;
                    continue L4;
                  }
                }
              }
            }
          }
        }
        var16 = 0;
        var9 = var16;
        L9: while (true) {
          if (var16 >= ((pj) this).field_x) {
            return;
          } else {
            L10: {
              if (param0.field_j != null) {
                var10 = param0.field_j[var16];
                break L10;
              } else {
                var10 = 0;
                break L10;
              }
            }
            L11: {
              if (param0.field_r != null) {
                var11 = param0.field_r[var16];
                break L11;
              } else {
                var11 = 0;
                break L11;
              }
            }
            L12: {
              if (((pj) this).field_z != null) {
                var12 = ((pj) this).field_z[var16];
                break L12;
              } else {
                var12 = -1;
                break L12;
              }
            }
            L13: {
              if (var11 != -2) {
                break L13;
              } else {
                var10 = 3;
                break L13;
              }
            }
            L14: {
              if (var11 != -1) {
                break L14;
              } else {
                var10 = 2;
                break L14;
              }
            }
            if (var12 != -1) {
              if (var10 != 0) {
                if (var10 != 1) {
                  ((pj) this).field_l[var16] = -2;
                  var16++;
                  continue L9;
                } else {
                  var19 = param0.field_J[var16];
                  var14 = param1 + (param3 * var19.field_c + param4 * var19.field_f + param5 * var19.field_a) / (var8 + var8 / 2);
                  ((pj) this).field_f[var16] = pj.a(var14);
                  ((pj) this).field_l[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L15: {
                  L16: {
                    if (param0.field_h == null) {
                      break L16;
                    } else {
                      if (param0.field_h[((pj) this).field_p[var16]] == null) {
                        break L16;
                      } else {
                        var13 = param0.field_h[((pj) this).field_p[var16]];
                        break L15;
                      }
                    }
                  }
                  var13 = param0.field_l[((pj) this).field_p[var16]];
                  break L15;
                }
                L17: {
                  L18: {
                    var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f);
                    ((pj) this).field_f[var16] = pj.a(var14);
                    if (param0.field_h == null) {
                      break L18;
                    } else {
                      if (param0.field_h[((pj) this).field_u[var16]] == null) {
                        break L18;
                      } else {
                        var13 = param0.field_h[((pj) this).field_u[var16]];
                        break L17;
                      }
                    }
                  }
                  var13 = param0.field_l[((pj) this).field_u[var16]];
                  break L17;
                }
                L19: {
                  L20: {
                    var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f);
                    ((pj) this).field_s[var16] = pj.a(var14);
                    if (param0.field_h == null) {
                      break L20;
                    } else {
                      if (param0.field_h[((pj) this).field_t[var16]] == null) {
                        break L20;
                      } else {
                        var13 = param0.field_h[((pj) this).field_t[var16]];
                        break L19;
                      }
                    }
                  }
                  var13 = param0.field_l[((pj) this).field_t[var16]];
                  break L19;
                }
                var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f);
                ((pj) this).field_l[var16] = pj.a(var14);
                var16++;
                continue L9;
              }
            } else {
              if (var10 != 0) {
                if (var10 != 1) {
                  if (var10 != 3) {
                    ((pj) this).field_l[var16] = -2;
                    var16++;
                    continue L9;
                  } else {
                    ((pj) this).field_f[var16] = 128;
                    ((pj) this).field_l[var16] = -1;
                    var16++;
                    continue L9;
                  }
                } else {
                  var18 = param0.field_J[var16];
                  var14 = param1 + (param3 * var18.field_c + param4 * var18.field_f + param5 * var18.field_a) / (var8 + var8 / 2) << 17;
                  ((pj) this).field_f[var16] = var14 | pj.a(param0.field_m[var16] & 65535, var14 >> 17);
                  ((pj) this).field_l[var16] = -1;
                  var16++;
                  continue L9;
                }
              } else {
                L21: {
                  L22: {
                    var15 = param0.field_m[var16] & 65535;
                    if (param0.field_h == null) {
                      break L22;
                    } else {
                      if (param0.field_h[((pj) this).field_p[var16]] == null) {
                        break L22;
                      } else {
                        var13 = param0.field_h[((pj) this).field_p[var16]];
                        break L21;
                      }
                    }
                  }
                  var13 = param0.field_l[((pj) this).field_p[var16]];
                  break L21;
                }
                L23: {
                  L24: {
                    var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f) << 17;
                    ((pj) this).field_f[var16] = var14 | pj.a(var15, var14 >> 17);
                    if (param0.field_h == null) {
                      break L24;
                    } else {
                      if (param0.field_h[((pj) this).field_u[var16]] == null) {
                        break L24;
                      } else {
                        var13 = param0.field_h[((pj) this).field_u[var16]];
                        break L23;
                      }
                    }
                  }
                  var13 = param0.field_l[((pj) this).field_u[var16]];
                  break L23;
                }
                L25: {
                  L26: {
                    var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f) << 17;
                    ((pj) this).field_s[var16] = var14 | pj.a(var15, var14 >> 17);
                    if (param0.field_h == null) {
                      break L26;
                    } else {
                      if (param0.field_h[((pj) this).field_t[var16]] == null) {
                        break L26;
                      } else {
                        var13 = param0.field_h[((pj) this).field_t[var16]];
                        break L25;
                      }
                    }
                  }
                  var13 = param0.field_l[((pj) this).field_t[var16]];
                  break L25;
                }
                var14 = param1 + (param3 * var13.field_g + param4 * var13.field_a + param5 * var13.field_h) / (var8 * var13.field_f) << 17;
                ((pj) this).field_l[var16] = var14 | pj.a(var15, var14 >> 17);
                var16++;
                continue L9;
              }
            }
          }
        }
    }

    pj(pj[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        pj var8_ref_pj = null;
        int var8 = 0;
        int var9_int = 0;
        pj var9 = null;
        int var10 = 0;
        pj var11 = null;
        int var12 = 0;
        pj var13 = null;
        pj var14 = null;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        byte[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        byte[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        byte[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        byte[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_52_2 = 0;
        byte[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        byte[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        byte[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        byte[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int stackOut_51_2 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        ((pj) this).field_m = 0;
        ((pj) this).field_w = 0;
        ((pj) this).field_D = (byte) 0;
        ((pj) this).field_k = 0;
        ((pj) this).field_x = 0;
        ((pj) this).field_E = false;
        var3 = 0;
        var4 = 0;
        var5 = 0;
        var6 = 0;
        ((pj) this).field_k = 0;
        ((pj) this).field_x = 0;
        ((pj) this).field_m = 0;
        ((pj) this).field_D = (byte) -1;
        var7 = 0;
        L0: while (true) {
          if (var7 >= param1) {
            L1: {
              ((pj) this).field_j = new int[((pj) this).field_k];
              ((pj) this).field_y = new int[((pj) this).field_k];
              ((pj) this).field_v = new int[((pj) this).field_k];
              ((pj) this).field_p = new int[((pj) this).field_x];
              ((pj) this).field_u = new int[((pj) this).field_x];
              ((pj) this).field_t = new int[((pj) this).field_x];
              ((pj) this).field_f = new int[((pj) this).field_x];
              ((pj) this).field_s = new int[((pj) this).field_x];
              ((pj) this).field_l = new int[((pj) this).field_x];
              if (var3 == 0) {
                break L1;
              } else {
                ((pj) this).field_B = new byte[((pj) this).field_x];
                break L1;
              }
            }
            L2: {
              if (var4 == 0) {
                break L2;
              } else {
                ((pj) this).field_q = new byte[((pj) this).field_x];
                break L2;
              }
            }
            L3: {
              if (var5 == 0) {
                break L3;
              } else {
                ((pj) this).field_z = new short[((pj) this).field_x];
                break L3;
              }
            }
            L4: {
              if (var6 == 0) {
                break L4;
              } else {
                ((pj) this).field_F = new byte[((pj) this).field_x];
                break L4;
              }
            }
            L5: {
              if (((pj) this).field_m <= 0) {
                break L5;
              } else {
                ((pj) this).field_h = new int[((pj) this).field_m];
                ((pj) this).field_g = new int[((pj) this).field_m];
                ((pj) this).field_i = new int[((pj) this).field_m];
                break L5;
              }
            }
            ((pj) this).field_r = new short[((pj) this).field_x];
            ((pj) this).field_k = 0;
            ((pj) this).field_x = 0;
            ((pj) this).field_m = 0;
            var7 = 0;
            L6: while (true) {
              if (var7 >= param1) {
                var7 = 0;
                ((pj) this).field_w = ((pj) this).field_k;
                var8 = 0;
                L7: while (true) {
                  if (var8 >= param1) {
                    return;
                  } else {
                    var9 = param0[var8];
                    if (var9 != null) {
                      var10 = 0;
                      L8: while (true) {
                        if (var10 >= var9.field_m) {
                          var12 = var9.field_w;
                          var10 = var12;
                          L9: while (true) {
                            if (var12 < var9.field_k) {
                              ((pj) this).field_j[((pj) this).field_k] = var9.field_j[var12];
                              ((pj) this).field_y[((pj) this).field_k] = var9.field_y[var12];
                              ((pj) this).field_v[((pj) this).field_k] = var9.field_v[var12];
                              ((pj) this).field_k = ((pj) this).field_k + 1;
                              var12++;
                              continue L9;
                            } else {
                              var8++;
                              continue L7;
                            }
                          }
                        } else {
                          L10: {
                            if (var9.field_h[var10] < var9.field_w) {
                              break L10;
                            } else {
                              ((pj) this).field_h[var7] = var9.field_h[var10] - var9.field_w + ((pj) this).field_k;
                              break L10;
                            }
                          }
                          L11: {
                            if (var9.field_g[var10] < var9.field_w) {
                              break L11;
                            } else {
                              ((pj) this).field_g[var7] = var9.field_g[var10] - var9.field_w + ((pj) this).field_k;
                              break L11;
                            }
                          }
                          if (var9.field_i[var10] >= var9.field_w) {
                            ((pj) this).field_i[var7] = var9.field_i[var10] - var9.field_w + ((pj) this).field_k;
                            var7++;
                            var10++;
                            continue L8;
                          } else {
                            var7++;
                            var10++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      var8++;
                      continue L7;
                    }
                  }
                }
              } else {
                var11 = param0[var7];
                var14 = var11;
                var8_ref_pj = var14;
                if (var8_ref_pj != null) {
                  var9_int = 0;
                  L12: while (true) {
                    if (var9_int >= var14.field_x) {
                      var9_int = 0;
                      L13: while (true) {
                        if (var9_int >= var14.field_m) {
                          var9_int = 0;
                          L14: while (true) {
                            if (var9_int < var14.field_w) {
                              ((pj) this).field_j[((pj) this).field_k] = var11.field_j[var9_int];
                              ((pj) this).field_y[((pj) this).field_k] = var11.field_y[var9_int];
                              ((pj) this).field_v[((pj) this).field_k] = var11.field_v[var9_int];
                              ((pj) this).field_k = ((pj) this).field_k + 1;
                              var9_int++;
                              continue L14;
                            } else {
                              var7++;
                              continue L6;
                            }
                          }
                        } else {
                          L15: {
                            if (var11.field_h[var9_int] >= var14.field_w) {
                              break L15;
                            } else {
                              ((pj) this).field_h[((pj) this).field_m] = var11.field_h[var9_int] + ((pj) this).field_k;
                              break L15;
                            }
                          }
                          L16: {
                            if (var11.field_g[var9_int] >= var14.field_w) {
                              break L16;
                            } else {
                              ((pj) this).field_g[((pj) this).field_m] = var11.field_g[var9_int] + ((pj) this).field_k;
                              break L16;
                            }
                          }
                          L17: {
                            if (var11.field_i[var9_int] >= var14.field_w) {
                              break L17;
                            } else {
                              ((pj) this).field_i[((pj) this).field_m] = var11.field_i[var9_int] + ((pj) this).field_k;
                              break L17;
                            }
                          }
                          ((pj) this).field_m = ((pj) this).field_m + 1;
                          var9_int++;
                          continue L13;
                        }
                      }
                    } else {
                      L18: {
                        ((pj) this).field_p[((pj) this).field_x] = var11.field_p[var9_int] + ((pj) this).field_k;
                        ((pj) this).field_u[((pj) this).field_x] = var11.field_u[var9_int] + ((pj) this).field_k;
                        ((pj) this).field_t[((pj) this).field_x] = var11.field_t[var9_int] + ((pj) this).field_k;
                        ((pj) this).field_f[((pj) this).field_x] = var11.field_f[var9_int];
                        ((pj) this).field_s[((pj) this).field_x] = var11.field_s[var9_int];
                        ((pj) this).field_l[((pj) this).field_x] = var11.field_l[var9_int];
                        ((pj) this).field_r[((pj) this).field_x] = var11.field_r[var9_int];
                        if (var3 == 0) {
                          break L18;
                        } else {
                          if (var14.field_B == null) {
                            ((pj) this).field_B[((pj) this).field_x] = var11.field_D;
                            break L18;
                          } else {
                            ((pj) this).field_B[((pj) this).field_x] = var11.field_B[var9_int];
                            break L18;
                          }
                        }
                      }
                      L19: {
                        if (var4 == 0) {
                          break L19;
                        } else {
                          if (var14.field_q == null) {
                            break L19;
                          } else {
                            ((pj) this).field_q[((pj) this).field_x] = var11.field_q[var9_int];
                            break L19;
                          }
                        }
                      }
                      L20: {
                        if (var5 == 0) {
                          break L20;
                        } else {
                          if (var14.field_z == null) {
                            ((pj) this).field_z[((pj) this).field_x] = (short) -1;
                            break L20;
                          } else {
                            ((pj) this).field_z[((pj) this).field_x] = var11.field_z[var9_int];
                            break L20;
                          }
                        }
                      }
                      L21: {
                        if (var6 == 0) {
                          break L21;
                        } else {
                          L22: {
                            L23: {
                              stackOut_48_0 = ((pj) this).field_F;
                              stackOut_48_1 = ((pj) this).field_x;
                              stackIn_51_0 = stackOut_48_0;
                              stackIn_51_1 = stackOut_48_1;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              if (var14.field_F == null) {
                                break L23;
                              } else {
                                stackOut_49_0 = (byte[]) (Object) stackIn_49_0;
                                stackOut_49_1 = stackIn_49_1;
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_51_1 = stackOut_49_1;
                                stackIn_50_0 = stackOut_49_0;
                                stackIn_50_1 = stackOut_49_1;
                                if (var11.field_F[var9_int] == -1) {
                                  break L23;
                                } else {
                                  stackOut_50_0 = (byte[]) (Object) stackIn_50_0;
                                  stackOut_50_1 = stackIn_50_1;
                                  stackOut_50_2 = var11.field_F[var9_int] + ((pj) this).field_m;
                                  stackIn_52_0 = stackOut_50_0;
                                  stackIn_52_1 = stackOut_50_1;
                                  stackIn_52_2 = stackOut_50_2;
                                  break L22;
                                }
                              }
                            }
                            stackOut_51_0 = (byte[]) (Object) stackIn_51_0;
                            stackOut_51_1 = stackIn_51_1;
                            stackOut_51_2 = -1;
                            stackIn_52_0 = stackOut_51_0;
                            stackIn_52_1 = stackOut_51_1;
                            stackIn_52_2 = stackOut_51_2;
                            break L22;
                          }
                          stackIn_52_0[stackIn_52_1] = (byte)stackIn_52_2;
                          break L21;
                        }
                      }
                      ((pj) this).field_x = ((pj) this).field_x + 1;
                      var9_int++;
                      continue L12;
                    }
                  }
                } else {
                  var7++;
                  continue L6;
                }
              }
            }
          } else {
            var13 = param0[var7];
            var8_ref_pj = var13;
            if (var8_ref_pj != null) {
              L24: {
                ((pj) this).field_k = ((pj) this).field_k + var13.field_k;
                ((pj) this).field_x = ((pj) this).field_x + var13.field_x;
                ((pj) this).field_m = ((pj) this).field_m + var13.field_m;
                if (var13.field_B == null) {
                  L25: {
                    if (((pj) this).field_D != -1) {
                      break L25;
                    } else {
                      ((pj) this).field_D = var13.field_D;
                      break L25;
                    }
                  }
                  if (((pj) this).field_D == var13.field_D) {
                    break L24;
                  } else {
                    var3 = 1;
                    break L24;
                  }
                } else {
                  var3 = 1;
                  break L24;
                }
              }
              L26: {
                stackOut_10_0 = var4;
                stackIn_12_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (var13.field_q == null) {
                  stackOut_12_0 = stackIn_12_0;
                  stackOut_12_1 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L26;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  break L26;
                }
              }
              L27: {
                var4 = stackIn_13_0 | stackIn_13_1;
                stackOut_13_0 = var5;
                stackIn_15_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (var13.field_z == null) {
                  stackOut_15_0 = stackIn_15_0;
                  stackOut_15_1 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  break L27;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackOut_14_1 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  break L27;
                }
              }
              L28: {
                var5 = stackIn_16_0 | stackIn_16_1;
                stackOut_16_0 = var6;
                stackIn_18_0 = stackOut_16_0;
                stackIn_17_0 = stackOut_16_0;
                if (var13.field_F == null) {
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L28;
                } else {
                  stackOut_17_0 = stackIn_17_0;
                  stackOut_17_1 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  break L28;
                }
              }
              var6 = stackIn_19_0 | stackIn_19_1;
              var7++;
              continue L0;
            } else {
              var7++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        pj discarded$0 = new pj();
        pj discarded$1 = new pj();
        pj discarded$2 = new pj();
        field_n = false;
        if (field_n) {
        }
    }
}
