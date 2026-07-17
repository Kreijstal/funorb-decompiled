/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    private int field_s;
    int[] field_q;
    int field_b;
    int field_A;
    boolean field_n;
    static um field_j;
    int field_v;
    static boolean field_i;
    private int field_l;
    int field_f;
    boolean field_g;
    int field_r;
    int[] field_e;
    int field_w;
    boolean field_x;
    static String field_o;
    byte[][] field_C;
    int field_y;
    int field_a;
    int field_D;
    private boolean[] field_h;
    int field_u;
    static int field_p;
    boolean field_E;
    int[] field_z;
    static String field_F;
    static String[][] field_d;
    int field_B;
    int field_m;
    int field_k;
    String[] field_c;
    int[] field_G;
    int[] field_t;

    private final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = Virogrid.field_F ? 1 : 0;
        ((uf) this).field_C = new byte[param0][param1];
        for (var4 = 0; var4 < param0; var4++) {
            for (var5 = 0; var5 < param1; var5++) {
                ((uf) this).field_C[var4][var5] = (byte) -1;
            }
        }
        ((uf) this).field_C[0][0] = (byte) 0;
        ((uf) this).field_C[0][param1 - 1] = (byte) 1;
        ((uf) this).field_C[param0 - 1][0] = (byte) 1;
        ((uf) this).field_C[param0 - 1][-1 + param1] = (byte) 0;
        ((uf) this).field_z = new int[2];
        ((uf) this).field_h = new boolean[2];
        int var7 = 0;
        var4 = var7;
        while (((uf) this).field_z.length > var7) {
            ((uf) this).field_z[var7] = 2;
            var7++;
        }
        ((uf) this).field_a = -1;
        ((uf) this).field_B = -1;
        ((uf) this).field_k = -1;
        ((uf) this).field_x = false;
        ((uf) this).field_m = -1;
        ((uf) this).field_n = false;
        ((uf) this).field_g = false;
        ((uf) this).field_w = -1;
    }

    final boolean a(byte param0, int param1, int param2, byte param3) {
        L0: {
          if (((uf) this).field_C.length <= param2) {
            break L0;
          } else {
            if (param2 < 0) {
              break L0;
            } else {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  ((uf) this).field_g = true;
                  break L1;
                }
              }
              if (param1 >= ((uf) this).field_C[0].length) {
                return false;
              } else {
                if (param1 >= 0) {
                  if (param3 != ((uf) this).field_C[param2][param1]) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    final void d(int param0, int param1) {
        ((uf) this).field_A = param1;
        ((uf) this).field_E = true;
        if (param0 > -16) {
            Object var4 = null;
            ((uf) this).a((jc) null, (byte) -59);
        }
    }

    final void b(int param0) {
        int var3 = Virogrid.field_F ? 1 : 0;
        if (((uf) this).field_E) {
            throw new IllegalStateException();
        }
        ((uf) this).field_u = ((uf) this).field_u + 1;
        if (param0 > -96) {
            field_i = true;
        }
        do {
            ((uf) this).field_A = (((uf) this).field_A + 1) % 2;
        } while ((1 << ((uf) this).field_A & ((uf) this).field_r) != 0);
    }

    final int a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        L0: {
          if (param2 == 99) {
            break L0;
          } else {
            var8 = null;
            ((uf) this).a((jc) null, (byte) -67);
            break L0;
          }
        }
        L1: {
          if (param3 >= ((uf) this).field_C.length) {
            break L1;
          } else {
            if (param3 >= 0) {
              L2: {
                if (((uf) this).field_C[0].length <= param0) {
                  break L2;
                } else {
                  if (param0 >= 0) {
                    L3: {
                      if (((uf) this).field_C[param3][param0] == -1) {
                        L4: {
                          var6 = Math.abs(-param1 + param3);
                          var7 = Math.abs(param0 + -param4);
                          if (var6 > 1) {
                            break L4;
                          } else {
                            if (1 >= var7) {
                              return 0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          L6: {
                            if (var6 != 2) {
                              break L6;
                            } else {
                              if (2 == var7) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          L7: {
                            if (var6 != 0) {
                              break L7;
                            } else {
                              if (var7 == 2) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                          if (2 != var6) {
                            break L3;
                          } else {
                            if (0 == var7) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        return 1;
                      } else {
                        break L3;
                      }
                    }
                    return -1;
                  } else {
                    break L2;
                  }
                }
              }
              return -1;
            } else {
              break L1;
            }
          }
        }
        return -1;
    }

    public static void a(int param0) {
        field_j = null;
        field_F = null;
        field_o = null;
        field_d = null;
        if (param0 <= 66) {
            uf.a(-93);
        }
    }

    private final int a(boolean param0, int param1, byte param2, int param3, int param4, boolean param5, int param6, int param7) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        L0: {
          L1: {
            L2: {
              var17 = Virogrid.field_F ? 1 : 0;
              var9 = ((uf) this).a(param1, param7, (byte) 99, param6, param3);
              var10 = 0;
              if (var9 == 0) {
                var10++;
                if (!param0) {
                  break L2;
                } else {
                  ((uf) this).field_C[param6][param1] = (byte)param2;
                  break L2;
                }
              } else {
                if (1 == var9) {
                  if (param0) {
                    ((uf) this).field_C[param7][param3] = (byte) -1;
                    ((uf) this).field_C[param6][param1] = (byte)param2;
                    break L2;
                  } else {
                    L3: {
                      var11 = -1 + param6;
                      if (var11 >= 0) {
                        break L3;
                      } else {
                        var11 = 0;
                        break L3;
                      }
                    }
                    L4: {
                      if (param4 > 38) {
                        break L4;
                      } else {
                        ((uf) this).a((byte) 123);
                        break L4;
                      }
                    }
                    L5: {
                      var12 = 1 + param6;
                      if (var12 < ((uf) this).field_C.length) {
                        break L5;
                      } else {
                        var12 = -1 + ((uf) this).field_C.length;
                        break L5;
                      }
                    }
                    L6: {
                      var13 = -1 + param1;
                      if (var13 >= 0) {
                        break L6;
                      } else {
                        var13 = 0;
                        break L6;
                      }
                    }
                    L7: {
                      var14 = param1 + 1;
                      if (var14 >= ((uf) this).field_C[0].length) {
                        var14 = ((uf) this).field_C[0].length + -1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    var15 = var11;
                    if (var12 < var15) {
                      break L0;
                    } else {
                      var16 = var13;
                      if (var16 <= var14) {
                        if (((uf) this).field_C[var15][var16] == -param2 + 1) {
                          var10++;
                          if (param0) {
                            L8: while (true) {
                              ((uf) this).field_C[var15][var16] = (byte)param2;
                              L9: while (true) {
                                L10: {
                                  if (param5) {
                                    var10++;
                                    var16++;
                                    break L10;
                                  } else {
                                    var16++;
                                    break L10;
                                  }
                                }
                                L11: while (true) {
                                  if (var16 <= var14) {
                                    if (((uf) this).field_C[var15][var16] == -param2 + 1) {
                                      var10++;
                                      if (param0) {
                                        continue L8;
                                      } else {
                                        continue L9;
                                      }
                                    } else {
                                      var16++;
                                      continue L11;
                                    }
                                  } else {
                                    var15++;
                                    if (var12 < var15) {
                                      break L0;
                                    } else {
                                      var16 = var13;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            L12: while (true) {
                              L13: {
                                if (param5) {
                                  var10++;
                                  var16++;
                                  break L13;
                                } else {
                                  var16++;
                                  break L13;
                                }
                              }
                              L14: while (true) {
                                if (var16 <= var14) {
                                  if (((uf) this).field_C[var15][var16] == -param2 + 1) {
                                    var10++;
                                    if (param0) {
                                      ((uf) this).field_C[var15][var16] = (byte)param2;
                                      continue L12;
                                    } else {
                                      continue L12;
                                    }
                                  } else {
                                    var16++;
                                    continue L14;
                                  }
                                } else {
                                  var15++;
                                  if (var12 < var15) {
                                    break L0;
                                  } else {
                                    var16 = var13;
                                    continue L14;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var16++;
                          L15: while (true) {
                            if (var16 <= var14) {
                              if (((uf) this).field_C[var15][var16] == -param2 + 1) {
                                L16: {
                                  var10++;
                                  if (param0) {
                                    ((uf) this).field_C[var15][var16] = (byte)param2;
                                    break L16;
                                  } else {
                                    break L16;
                                  }
                                }
                                if (param5) {
                                  var10++;
                                  var16++;
                                  continue L15;
                                } else {
                                  var16++;
                                  continue L15;
                                }
                              } else {
                                var16++;
                                continue L15;
                              }
                            } else {
                              var15++;
                              if (var12 < var15) {
                                break L0;
                              } else {
                                var16 = var13;
                                continue L15;
                              }
                            }
                          }
                        }
                      } else {
                        var15++;
                        break L1;
                      }
                    }
                  }
                } else {
                  return -1;
                }
              }
            }
            L17: {
              var11 = -1 + param6;
              if (var11 >= 0) {
                break L17;
              } else {
                var11 = 0;
                break L17;
              }
            }
            L18: {
              if (param4 > 38) {
                break L18;
              } else {
                ((uf) this).a((byte) 123);
                break L18;
              }
            }
            L19: {
              var12 = 1 + param6;
              if (var12 < ((uf) this).field_C.length) {
                break L19;
              } else {
                var12 = -1 + ((uf) this).field_C.length;
                break L19;
              }
            }
            L20: {
              var13 = -1 + param1;
              if (var13 >= 0) {
                break L20;
              } else {
                var13 = 0;
                break L20;
              }
            }
            L21: {
              var14 = param1 + 1;
              if (var14 >= ((uf) this).field_C[0].length) {
                var14 = ((uf) this).field_C[0].length + -1;
                break L21;
              } else {
                break L21;
              }
            }
            var15 = var11;
            break L1;
          }
          L22: while (true) {
            if (var12 < var15) {
              break L0;
            } else {
              var16 = var13;
              L23: while (true) {
                if (var16 <= var14) {
                  if (((uf) this).field_C[var15][var16] == -param2 + 1) {
                    L24: {
                      var10++;
                      if (param0) {
                        ((uf) this).field_C[var15][var16] = (byte)param2;
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    if (param5) {
                      var10++;
                      var16++;
                      continue L23;
                    } else {
                      var16++;
                      continue L23;
                    }
                  } else {
                    var16++;
                    continue L23;
                  }
                } else {
                  var15++;
                  continue L22;
                }
              }
            }
          }
        }
        return var10;
    }

    private final boolean a(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        int[] var14 = null;
        int stackIn_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        L0: {
          var12 = Virogrid.field_F ? 1 : 0;
          if (param1 <= -22) {
            break L0;
          } else {
            var13 = null;
            ((uf) this).a((jc) null, (byte) -15);
            break L0;
          }
        }
        var14 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
        var4 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
        var5 = 1;
        var6 = 0;
        L1: while (true) {
          L2: {
            if (((uf) this).field_C.length <= var6) {
              break L2;
            } else {
              var7 = 0;
              L3: while (true) {
                if (var7 >= ((uf) this).field_C[0].length) {
                  var6++;
                  continue L1;
                } else {
                  if (((uf) this).field_C[var6][var7] == -1) {
                    var5 = 0;
                    break L2;
                  } else {
                    var7++;
                    continue L3;
                  }
                }
              }
            }
          }
          if (var5 == 0) {
            var8 = 0;
            var9 = 0;
            L4: while (true) {
              if (var9 >= ((uf) this).field_C.length) {
                L5: {
                  if (var8 <= 0) {
                    stackOut_37_0 = 0;
                    stackIn_38_0 = stackOut_37_0;
                    break L5;
                  } else {
                    stackOut_36_0 = 1;
                    stackIn_38_0 = stackOut_36_0;
                    break L5;
                  }
                }
                return stackIn_38_0 != 0;
              } else {
                var10 = 0;
                L6: while (true) {
                  if (((uf) this).field_C[0].length <= var10) {
                    var9++;
                    continue L4;
                  } else {
                    if (param0 == ((uf) this).field_C[var9][var10]) {
                      var8++;
                      var11 = 0;
                      L7: while (true) {
                        if (var11 < var14.length) {
                          var6 = var14[var11] + var9;
                          var7 = var4[var11] + var10;
                          if (var6 <= -1) {
                            if (((uf) this).field_C.length > var6) {
                              if (-1 <= var7) {
                                if (((uf) this).field_C[0].length > var7) {
                                  if (((uf) this).field_C[var6][var7] == -1) {
                                    return false;
                                  } else {
                                    var11++;
                                    continue L7;
                                  }
                                } else {
                                  var11++;
                                  continue L7;
                                }
                              } else {
                                var11++;
                                continue L7;
                              }
                            } else {
                              var11++;
                              continue L7;
                            }
                          } else {
                            var11++;
                            continue L7;
                          }
                        } else {
                          var10++;
                          continue L6;
                        }
                      }
                    } else {
                      var10++;
                      continue L6;
                    }
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int[] var7_ref_int__ = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[] var13 = null;
        L0: {
          var12 = Virogrid.field_F ? 1 : 0;
          if (-1 > ((uf) this).field_f) {
            if (param1 < ((uf) this).field_l) {
              return;
            } else {
              if (-1 <= ((uf) this).field_f) {
                break L0;
              } else {
                if (((uf) this).field_l >= param1) {
                  break L0;
                } else {
                  ((uf) this).field_f = 0;
                  break L0;
                }
              }
            }
          } else {
            if (-1 >= ((uf) this).field_f) {
              break L0;
            } else {
              if (((uf) this).field_l >= param1) {
                break L0;
              } else {
                ((uf) this).field_f = 0;
                break L0;
              }
            }
          }
        }
        L1: {
          if (((uf) this).field_f < ((uf) this).field_e.length) {
            break L1;
          } else {
            var13 = new int[((uf) this).field_e.length * 2];
            var7_ref_int__ = var13;
            var8 = new int[((uf) this).field_e.length * 2];
            var9 = new int[2 * ((uf) this).field_e.length];
            var10 = new int[2 * ((uf) this).field_e.length];
            var11 = 0;
            L2: while (true) {
              if (var11 >= ((uf) this).field_e.length) {
                ((uf) this).field_t = var10;
                ((uf) this).field_q = var9;
                ((uf) this).field_G = var8;
                ((uf) this).field_e = var7_ref_int__;
                break L1;
              } else {
                var13[var11] = ((uf) this).field_e[var11];
                var8[var11] = ((uf) this).field_G[var11];
                var9[var11] = ((uf) this).field_q[var11];
                var10[var11] = ((uf) this).field_t[var11];
                var11++;
                continue L2;
              }
            }
          }
        }
        ((uf) this).field_e[((uf) this).field_f] = param0;
        var7 = 55 / ((43 - param3) / 48);
        ((uf) this).field_G[((uf) this).field_f] = param5;
        ((uf) this).field_q[((uf) this).field_f] = param2;
        ((uf) this).field_t[((uf) this).field_f] = param4;
        ((uf) this).field_l = param1;
        ((uf) this).field_f = ((uf) this).field_f + 1;
    }

    final void c(int param0, int param1) {
        int var3 = 0;
        L0: {
          ((uf) this).field_n = false;
          ((uf) this).field_x = false;
          var3 = param0;
          if (var3 == 1) {
            ((uf) this).field_x = true;
            break L0;
          } else {
            if (var3 == 2) {
              ((uf) this).field_n = true;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param1 == 2) {
            break L1;
          } else {
            ((uf) this).d(-64, 101);
            break L1;
          }
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackOut_17_0 = null;
        Object stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        if (((uf) this).field_E) {
          throw new IllegalStateException();
        } else {
          var2 = 0;
          L0: while (true) {
            if (var2 >= ((uf) this).field_z.length) {
              L1: {
                var2 = 1;
                if (param0 == 20602) {
                  break L1;
                } else {
                  ((uf) this).field_y = -14;
                  break L1;
                }
              }
              var3 = 0;
              L2: while (true) {
                if (((uf) this).field_C.length <= var3) {
                  L3: {
                    stackOut_17_0 = this;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var2 == 0) {
                      stackOut_19_0 = this;
                      stackOut_19_1 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      break L3;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L3;
                    }
                  }
                  ((uf) this).field_n = stackIn_20_1 != 0;
                  if (var2 != 0) {
                    L4: {
                      if (((uf) this).field_z[0] > ((uf) this).field_z[1]) {
                        ((uf) this).d(-124, 0);
                        break L4;
                      } else {
                        if (((uf) this).field_z[1] > ((uf) this).field_z[0]) {
                          ((uf) this).d(param0 + -20709, 1);
                          break L4;
                        } else {
                          ((uf) this).d(-35, -1);
                          break L4;
                        }
                      }
                    }
                    return true;
                  } else {
                    if (((uf) this).field_z[0] != 0) {
                      if (((uf) this).field_z[1] != 0) {
                        return false;
                      } else {
                        ((uf) this).field_x = true;
                        ((uf) this).d(-38, 0);
                        return true;
                      }
                    } else {
                      ((uf) this).field_x = true;
                      ((uf) this).d(-101, 1);
                      return true;
                    }
                  }
                } else {
                  var4 = 0;
                  L5: while (true) {
                    if (var4 >= ((uf) this).field_C[0].length) {
                      var3++;
                      continue L2;
                    } else {
                      if (((uf) this).field_C[var3][var4] != -1) {
                        ((uf) this).field_z[((uf) this).field_C[var3][var4]] = ((uf) this).field_z[((uf) this).field_C[var3][var4]] + 1;
                        var4++;
                        continue L5;
                      } else {
                        var2 = 0;
                        var4++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            } else {
              ((uf) this).field_z[var2] = 0;
              var2++;
              continue L0;
            }
          }
        }
    }

    final void a(jc param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 34) {
                break L1;
              } else {
                uf.a(-104);
                break L1;
              }
            }
            L2: {
              var3_int = param0.g(11132);
              if ((var3_int & 2) != 0) {
                var4 = 0;
                L3: while (true) {
                  if (var4 >= ((uf) this).field_C.length) {
                    break L2;
                  } else {
                    var5 = 0;
                    L4: while (true) {
                      if (((uf) this).field_C[0].length <= var5) {
                        var4++;
                        continue L3;
                      } else {
                        ((uf) this).field_C[var4][var5] = param0.a((byte) -101);
                        var5++;
                        continue L4;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("uf.S(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        var5 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= ((uf) this).field_z.length) {
            var2 = 1;
            var3 = 0;
            L1: while (true) {
              if (var3 >= ((uf) this).field_C.length) {
                L2: {
                  stackOut_12_0 = this;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_13_0 = stackOut_12_0;
                  if (var2 == 0) {
                    stackOut_14_0 = this;
                    stackOut_14_1 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    break L2;
                  } else {
                    stackOut_13_0 = this;
                    stackOut_13_1 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    break L2;
                  }
                }
                L3: {
                  ((uf) this).field_n = stackIn_15_1 != 0;
                  if (var2 == 0) {
                    L4: {
                      if (0 != ((uf) this).field_z[0]) {
                        if (((uf) this).field_z[1] != 0) {
                          break L4;
                        } else {
                          ((uf) this).field_x = true;
                          break L4;
                        }
                      } else {
                        ((uf) this).field_x = true;
                        break L4;
                      }
                    }
                    var3 = 44 / ((-11 - param0) / 62);
                    break L3;
                  } else {
                    var3 = 44 / ((-11 - param0) / 62);
                    break L3;
                  }
                }
                return;
              } else {
                var4 = 0;
                L5: while (true) {
                  if (((uf) this).field_C[0].length <= var4) {
                    var3++;
                    continue L1;
                  } else {
                    if (((uf) this).field_C[var3][var4] != -1) {
                      ((uf) this).field_z[((uf) this).field_C[var3][var4]] = ((uf) this).field_z[((uf) this).field_C[var3][var4]] + 1;
                      var4++;
                      continue L5;
                    } else {
                      var2 = 0;
                      var4++;
                      continue L5;
                    }
                  }
                }
              }
            }
          } else {
            ((uf) this).field_z[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    final int a(int param0, int param1, byte param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        var16 = Virogrid.field_F ? 1 : 0;
        if (!((uf) this).field_E) {
          L0: {
            var7 = ((uf) this).a(param5, param0, (byte) 99, param4, param1);
            if (var7 != 0) {
              if (var7 != 1) {
                return 0;
              } else {
                ((uf) this).field_C[param4][param5] = (byte)param3;
                ((uf) this).field_C[param0][param1] = (byte) -1;
                break L0;
              }
            } else {
              ((uf) this).field_C[param4][param5] = (byte)param3;
              ((uf) this).field_h[param3] = true;
              break L0;
            }
          }
          if (param2 == 119) {
            L1: {
              var8 = param4 - 1;
              if (var8 < 0) {
                var8 = 0;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = 1 + param4;
              if (var9 < ((uf) this).field_C.length) {
                break L2;
              } else {
                var9 = ((uf) this).field_C.length - 1;
                break L2;
              }
            }
            L3: {
              var10 = param5 - 1;
              if (0 > var10) {
                var10 = 0;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var11 = 1 + param5;
              if (var11 >= ((uf) this).field_C[0].length) {
                var11 = -1 + ((uf) this).field_C[0].length;
                break L4;
              } else {
                break L4;
              }
            }
            var12 = 0;
            var13_int = var8;
            L5: while (true) {
              if (var13_int > var9) {
                L6: {
                  if (!this.a(-param3 + 1, param2 ^ -88)) {
                    break L6;
                  } else {
                    ((uf) this).field_g = true;
                    var13_int = 0;
                    L7: while (true) {
                      if (var13_int >= ((uf) this).field_C.length) {
                        var20 = new int[2];
                        var19 = var20;
                        var18 = var19;
                        var17 = var18;
                        var13 = var17;
                        var14 = 0;
                        L8: while (true) {
                          if (var14 >= ((uf) this).field_C.length) {
                            if (var13[1 - param3] < var20[param3]) {
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            var15 = 0;
                            L9: while (true) {
                              if (((uf) this).field_C[0].length <= var15) {
                                var14++;
                                continue L8;
                              } else {
                                if (((uf) this).field_C[var14][var15] >= 0) {
                                  var13[((uf) this).field_C[var14][var15]] = var13[((uf) this).field_C[var14][var15]] + 1;
                                  var15++;
                                  continue L9;
                                } else {
                                  var15++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var14 = 0;
                        L10: while (true) {
                          if (((uf) this).field_C[0].length <= var14) {
                            var13_int++;
                            continue L7;
                          } else {
                            if (((uf) this).field_C[var13_int][var14] == -1) {
                              ((uf) this).field_C[var13_int][var14] = (byte)param3;
                              var14++;
                              continue L10;
                            } else {
                              var14++;
                              continue L10;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                ((uf) this).field_a = param1;
                ((uf) this).field_B = param3;
                ((uf) this).field_w = param5;
                ((uf) this).field_m = param4;
                ((uf) this).field_k = param0;
                return var12;
              } else {
                var14 = var10;
                L11: while (true) {
                  if (var11 < var14) {
                    var13_int++;
                    continue L5;
                  } else {
                    if (-param3 + 1 == ((uf) this).field_C[var13_int][var14]) {
                      var12++;
                      ((uf) this).field_C[var13_int][var14] = (byte)param3;
                      var14++;
                      continue L11;
                    } else {
                      var14++;
                      continue L11;
                    }
                  }
                }
              }
            }
          } else {
            return -27;
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (!(((uf) this).a(param5, param4, (byte) 99, param1, param2) != -1)) {
            return false;
        }
        if (!(param0 == ((uf) this).field_C[param4][param2])) {
            return false;
        }
        if (param3 != 2) {
            ((uf) this).field_w = 30;
            return true;
        }
        return true;
    }

    final void a(int param0, int param1, int param2) {
        if (param2 != 21428) {
            ((uf) this).field_a = 70;
        }
        ((uf) this).field_A = param0;
        ((uf) this).field_u = param1;
    }

    final void d(int param0) {
        this.a(((uf) this).field_C.length, ((uf) this).field_C[0].length, (byte) -108);
        ((uf) this).field_E = false;
        ((uf) this).field_r = 0;
        ((uf) this).field_D = param0;
        int var2 = ((uf) this).field_A;
        if (var2 != 0) {
            if (!(1 == var2)) {
                var2 = ((uf) this).field_v;
            }
        }
        var2 = var2 == 1 ? 0 : 1;
        ((uf) this).field_v = var2 == 1 ? 0 : 1;
        ((uf) this).a(var2, 0, param0 + 21428);
    }

    final void a(boolean[][] param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var12 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
              var5 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
              if (param2 == 14) {
                break L1;
              } else {
                boolean discarded$1 = ((uf) this).a(59, 84, 4, 79, -14, 66);
                break L1;
              }
            }
            var8 = 0;
            L2: while (true) {
              if (((uf) this).field_C.length <= var8) {
                break L0;
              } else {
                var9 = 0;
                L3: while (true) {
                  if (((uf) this).field_C[0].length <= var9) {
                    var8++;
                    continue L2;
                  } else {
                    L4: {
                      param0[var8][var9] = false;
                      if (param1 == ((uf) this).field_C[var8][var9]) {
                        var10 = 0;
                        L5: while (true) {
                          if (var12.length <= var10) {
                            break L4;
                          } else {
                            L6: {
                              var6 = var8 + var12[var10];
                              var7 = var5[var10] + var9;
                              if (var6 < 0) {
                                break L6;
                              } else {
                                if (var6 >= ((uf) this).field_C.length) {
                                  break L6;
                                } else {
                                  if (var7 < 0) {
                                    break L6;
                                  } else {
                                    if (((uf) this).field_C[0].length <= var7) {
                                      break L6;
                                    } else {
                                      if (-1 == ((uf) this).field_C[var6][var7]) {
                                        param0[var8][var9] = true;
                                        break L4;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var10++;
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("uf.P(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void b(int param0, int param1) {
        int[] var4 = null;
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
        int var20 = 0;
        int[] var21 = null;
        int var22 = 0;
        int[] var24 = null;
        byte[][] var27 = null;
        L0: {
          var20 = Virogrid.field_F ? 1 : 0;
          var21 = new int[]{-1, -1, -1, 0, 0, 1, 1, 1, 2, 2, 2, 0, 0, -2, -2, -2};
          var24 = var21;
          ((uf) this).field_e = new int[((uf) this).field_C.length * ((uf) this).field_C[param1].length];
          var4 = new int[]{-1, 0, 1, -1, 1, -1, 0, 1, 0, -2, 2, -2, 2, -2, 0, 2};
          ((uf) this).field_G = new int[((uf) this).field_C.length * ((uf) this).field_C[0].length];
          ((uf) this).field_q = new int[((uf) this).field_C[0].length * ((uf) this).field_C.length];
          ((uf) this).field_t = new int[((uf) this).field_C[0].length * ((uf) this).field_C.length];
          ((uf) this).field_f = 0;
          ((uf) this).field_l = -2147483648;
          var5 = (byte)((uf) this).field_A;
          if (param0 != 1) {
            if (2 != param0) {
              if (param0 == 3) {
                var27 = new byte[((uf) this).field_C.length][((uf) this).field_C[0].length];
                var7 = 0;
                L1: while (true) {
                  if (var7 >= ((uf) this).field_C.length) {
                    var7 = 0;
                    L2: while (true) {
                      if (((uf) this).field_C.length <= var7) {
                        break L0;
                      } else {
                        var8 = 0;
                        L3: while (true) {
                          if (((uf) this).field_C[0].length <= var8) {
                            var7++;
                            continue L2;
                          } else {
                            if (var5 == ((uf) this).field_C[var7][var8]) {
                              var11 = 0;
                              L4: while (true) {
                                if (var24.length > var11) {
                                  var9 = var7 - -var24[var11];
                                  var10 = var8 + var4[var11];
                                  if (((uf) this).a(var5, var9, var8, 2, var7, var10)) {
                                    var12 = this.a(true, var10, (byte) var5, var8, param1 + 69, false, var9, var7);
                                    var13 = -9;
                                    var14 = 0;
                                    L5: while (true) {
                                      if (var14 >= ((uf) this).field_C.length) {
                                        var12 = var12 - var13;
                                        this.b(var9, var12, var7, param1 ^ -65, var8, var10);
                                        var14 = 0;
                                        L6: while (true) {
                                          if (((uf) this).field_C.length > var14) {
                                            var22 = 0;
                                            var15 = var22;
                                            L7: while (true) {
                                              if (((uf) this).field_C[0].length <= var22) {
                                                var14++;
                                                continue L6;
                                              } else {
                                                ((uf) this).field_C[var14][var22] = var27[var14][var22];
                                                var22++;
                                                continue L7;
                                              }
                                            }
                                          } else {
                                            var11++;
                                            continue L4;
                                          }
                                        }
                                      } else {
                                        var15 = 0;
                                        L8: while (true) {
                                          if (var15 >= ((uf) this).field_C[0].length) {
                                            var14++;
                                            continue L5;
                                          } else {
                                            if (1 - var5 == ((uf) this).field_C[var14][var15]) {
                                              var18 = 0;
                                              L9: while (true) {
                                                if (var18 < var24.length) {
                                                  var17 = var15 + var4[var18];
                                                  var16 = var14 - -var24[var18];
                                                  if (((uf) this).a(-var5 + 1, var16, var15, 2, var14, var17)) {
                                                    var19 = this.a(false, var17, (byte)(-var5 + 1), var15, 115, false, var16, var14);
                                                    if (var19 > var13) {
                                                      var13 = var19;
                                                      var18++;
                                                      continue L9;
                                                    } else {
                                                      var18++;
                                                      continue L9;
                                                    }
                                                  } else {
                                                    var18++;
                                                    continue L9;
                                                  }
                                                } else {
                                                  var15++;
                                                  continue L8;
                                                }
                                              }
                                            } else {
                                              var15++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var11++;
                                    continue L4;
                                  }
                                } else {
                                  var8++;
                                  continue L3;
                                }
                              }
                            } else {
                              var8++;
                              continue L3;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var8 = 0;
                    L10: while (true) {
                      if (var8 >= ((uf) this).field_C[0].length) {
                        var7++;
                        continue L1;
                      } else {
                        var27[var7][var8] = ((uf) this).field_C[var7][var8];
                        var8++;
                        continue L10;
                      }
                    }
                  }
                }
              } else {
                break L0;
              }
            } else {
              var6 = 0;
              L11: while (true) {
                if (var6 >= ((uf) this).field_C.length) {
                  break L0;
                } else {
                  var7 = 0;
                  L12: while (true) {
                    if (var7 >= ((uf) this).field_C[0].length) {
                      var6++;
                      continue L11;
                    } else {
                      if (var5 == ((uf) this).field_C[var6][var7]) {
                        var10 = 0;
                        L13: while (true) {
                          if (var10 < var21.length) {
                            var8 = var6 - -var21[var10];
                            var9 = var4[var10] + var7;
                            if (((uf) this).a(var5, var8, var7, 2, var6, var9)) {
                              var11 = this.a(false, var9, (byte) var5, var7, 120, false, var8, var6);
                              this.b(var8, var11, var6, param1 + 103, var7, var9);
                              var10++;
                              continue L13;
                            } else {
                              var10++;
                              continue L13;
                            }
                          } else {
                            var7++;
                            continue L12;
                          }
                        }
                      } else {
                        var7++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
          } else {
            var6 = 0;
            L14: while (true) {
              if (((uf) this).field_C.length <= var6) {
                break L0;
              } else {
                var7 = 0;
                L15: while (true) {
                  if (((uf) this).field_C[0].length <= var7) {
                    var6++;
                    continue L14;
                  } else {
                    if (((uf) this).field_C[var6][var7] == var5) {
                      var21 = var24;
                      var10 = 0;
                      L16: while (true) {
                        if (var21.length > var10) {
                          var8 = var21[var10] + var6;
                          var9 = var7 - -var4[var10];
                          if (((uf) this).a(var5, var8, var7, 2, var6, var9)) {
                            this.b(var8, 1, var6, -81, var7, var9);
                            var10++;
                            continue L16;
                          } else {
                            var10++;
                            continue L16;
                          }
                        } else {
                          var7++;
                          continue L15;
                        }
                      }
                    } else {
                      var7++;
                      continue L15;
                    }
                  }
                }
              }
            }
          }
        }
    }

    uf(int param0, String[] param1, int param2, int param3) {
        ((uf) this).field_h = new boolean[2];
        ((uf) this).field_B = -1;
        ((uf) this).field_m = -1;
        ((uf) this).field_k = -1;
        ((uf) this).field_w = -1;
        ((uf) this).field_a = -1;
        try {
            ((uf) this).field_y = param0;
            if (param1.length != 2) {
                throw new RuntimeException();
            }
            ((uf) this).field_v = param2;
            ((uf) this).field_A = param2;
            ((uf) this).field_c = param1;
            ((uf) this).field_s = param3;
            this.a(ra.field_a[((uf) this).field_s], ra.field_a[((uf) this).field_s], (byte) -108);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "uf.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = true;
        field_o = "All games";
        field_F = "Achievements";
    }
}
