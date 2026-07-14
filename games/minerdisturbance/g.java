/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static boolean field_o;
    byte[][] field_l;
    da[] field_n;
    int field_c;
    int[] field_d;
    static int field_k;
    private byte[] field_a;
    int[] field_f;
    int[] field_q;
    da field_s;
    int field_b;
    int[][] field_p;
    int field_r;
    int[] field_h;
    static String field_e;
    private int[] field_m;
    private int field_g;
    int[] field_t;
    private int[][] field_i;
    static ea[] field_j;

    final static void a(int param0, int param1) {
        ud.field_e = param0 >> -2033344156 & 3;
        if (!(2 >= ud.field_e)) {
            ud.field_e = 2;
        }
        ra.field_b = (param0 & 13) >> 1389110306;
        if (ra.field_b > param1) {
            ra.field_b = 2;
        }
        wi.field_t = param0 & 3;
        if (!(-3 <= (wi.field_t ^ -1))) {
            wi.field_t = 2;
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int var3 = -2 % ((46 - param1) / 51);
        if (param0) {
            eh.b(0, 0, eh.field_g, eh.field_c, 0, 192);
        } else {
            eh.d();
        }
        pf.a(0, param0);
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                if (param1 <= 34) {
                    field_k = 6;
                }
                param0.getAppletContext().showDocument(nn.a(121, param0, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1) {
        int var3 = MinerDisturbance.field_ab;
        if (param0 != -69) {
            field_o = true;
        }
        mj var4 = (mj) (Object) nh.field_a.b(75);
        while (var4 != null) {
            vd.a(param1, -3450, var4);
            var4 = (mj) (Object) nh.field_a.b((byte) 56);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, ea[] param5) {
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
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        var22 = MinerDisturbance.field_ab;
        if (param5 != null) {
          if (0 >= param3) {
            return;
          } else {
            if (0 < param1) {
              L0: {
                if (null != param5[3]) {
                  stackOut_7_0 = param5[3].field_x;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  stackOut_6_0 = 0;
                  stackIn_8_0 = stackOut_6_0;
                  break L0;
                }
              }
              L1: {
                var6 = stackIn_8_0;
                if (param5[5] != null) {
                  stackOut_10_0 = param5[5].field_x;
                  stackIn_11_0 = stackOut_10_0;
                  break L1;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_11_0;
                if (param5[1] != null) {
                  stackOut_13_0 = param5[1].field_A;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_12_0 = 0;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_14_0;
                if (null != param5[7]) {
                  stackOut_16_0 = param5[7].field_A;
                  stackIn_17_0 = stackOut_16_0;
                  break L3;
                } else {
                  stackOut_15_0 = 0;
                  stackIn_17_0 = stackOut_15_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_17_0;
                var10 = param3 + param2;
                var11 = param1 + param0;
                var12 = param2 - -var6;
                var13 = -var7 + var10;
                var14 = param0 - -var8;
                var15 = var11 - var9;
                var16 = var12;
                var17 = var13;
                if (var17 >= var16) {
                  break L4;
                } else {
                  var17 = param2 - -(param3 * var6 / (var7 + var6));
                  var16 = param2 - -(param3 * var6 / (var7 + var6));
                  break L4;
                }
              }
              L5: {
                var18 = var14;
                var19 = var15;
                if (param4 > 13) {
                  break L5;
                } else {
                  var23 = null;
                  g.a((java.applet.Applet) null, 77);
                  break L5;
                }
              }
              L6: {
                if (var18 <= var19) {
                  break L6;
                } else {
                  var19 = param1 * var8 / (var9 + var8) + param0;
                  var18 = param1 * var8 / (var9 + var8) + param0;
                  break L6;
                }
              }
              L7: {
                eh.b(fm.field_N);
                if (param5[0] == null) {
                  break L7;
                } else {
                  eh.f(param2, param0, var16, var18);
                  param5[0].f(param2, param0);
                  eh.a(fm.field_N);
                  break L7;
                }
              }
              L8: {
                if (param5[2] == null) {
                  break L8;
                } else {
                  eh.f(var17, param0, var10, var18);
                  param5[2].f(var13, param0);
                  eh.a(fm.field_N);
                  break L8;
                }
              }
              L9: {
                if (param5[6] != null) {
                  eh.f(param2, var19, var16, var11);
                  param5[6].f(param2, var15);
                  eh.a(fm.field_N);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (param5[8] != null) {
                  eh.f(var17, var19, var10, var11);
                  param5[8].f(var13, var15);
                  eh.a(fm.field_N);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (param5[1] == null) {
                  break L11;
                } else {
                  if (0 != param5[1].field_x) {
                    eh.f(var16, param0, var17, var18);
                    var20 = var12;
                    L12: while (true) {
                      L13: {
                        if (var13 <= var20) {
                          break L13;
                        } else {
                          param5[1].f(var20, param0);
                          var20 = var20 + param5[1].field_x;
                          if (0 == 0) {
                            continue L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      eh.a(fm.field_N);
                      break L11;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              L14: {
                if (null == param5[7]) {
                  break L14;
                } else {
                  if (param5[7].field_x != 0) {
                    eh.f(var16, var19, var17, var11);
                    var20 = var12;
                    L15: while (true) {
                      L16: {
                        if (var20 >= var13) {
                          break L16;
                        } else {
                          param5[7].f(var20, var15);
                          var20 = var20 + param5[7].field_x;
                          if (0 == 0) {
                            continue L15;
                          } else {
                            break L16;
                          }
                        }
                      }
                      eh.a(fm.field_N);
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
              }
              L17: {
                if (param5[3] == null) {
                  break L17;
                } else {
                  if (param5[3].field_A == 0) {
                    break L17;
                  } else {
                    eh.f(param2, var18, var16, var19);
                    var20 = var14;
                    L18: while (true) {
                      L19: {
                        if (var15 <= var20) {
                          break L19;
                        } else {
                          param5[3].f(param2, var20);
                          var20 = var20 + param5[3].field_A;
                          if (0 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      eh.a(fm.field_N);
                      break L17;
                    }
                  }
                }
              }
              L20: {
                if (param5[5] == null) {
                  break L20;
                } else {
                  if (param5[5].field_A != 0) {
                    eh.f(var17, var18, var10, var19);
                    var20 = var14;
                    L21: while (true) {
                      L22: {
                        if (var20 >= var15) {
                          break L22;
                        } else {
                          param5[5].f(var13, var20);
                          var20 = var20 + param5[5].field_A;
                          if (0 == 0) {
                            continue L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      eh.a(fm.field_N);
                      break L20;
                    }
                  } else {
                    break L20;
                  }
                }
              }
              L23: {
                if (null == param5[4]) {
                  break L23;
                } else {
                  if (param5[4].field_x == 0) {
                    break L23;
                  } else {
                    if (param5[4].field_A != 0) {
                      eh.f(var16, var18, var17, var19);
                      var20 = var14;
                      L24: while (true) {
                        L25: {
                          if (var20 >= var15) {
                            break L25;
                          } else {
                            var21 = var12;
                            L26: while (true) {
                              L27: {
                                if (var13 <= var21) {
                                  break L27;
                                } else {
                                  param5[4].f(var21, var20);
                                  var21 = var21 + param5[4].field_x;
                                  if (0 == 0) {
                                    continue L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              var20 = var20 + param5[4].field_A;
                              if (0 == 0) {
                                continue L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        eh.a(fm.field_N);
                        break L23;
                      }
                    } else {
                      break L23;
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, byte[] param1) {
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
        int var15 = 0;
        int var16 = 0;
        sb var17 = null;
        byte[] var21 = null;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var16 = MinerDisturbance.field_ab;
          var17 = new sb(in.a(param1, param0 + -2));
          var4 = var17.d((byte) -54);
          if (-6 < var4) {
            break L0;
          } else {
            if (-8 < var4) {
              break L0;
            } else {
              L1: {
                if (-7 >= (var4 ^ -1)) {
                  ((g) this).field_r = var17.b((byte) 91);
                  break L1;
                } else {
                  ((g) this).field_r = 0;
                  break L1;
                }
              }
              L2: {
                var5 = var17.d((byte) -54);
                if (-1 == (var5 & 1 ^ -1)) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                if (7 > var4) {
                  ((g) this).field_g = var17.e(param0 ^ -108);
                  break L3;
                } else {
                  ((g) this).field_g = var17.a((byte) -120);
                  break L3;
                }
              }
              L4: {
                if (-1 == (var5 & param0)) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L4;
                } else {
                  stackOut_14_0 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  break L4;
                }
              }
              L5: {
                var7 = stackIn_16_0;
                var8 = 0;
                ((g) this).field_t = new int[((g) this).field_g];
                var9 = -1;
                if (-8 <= var4) {
                  var10 = 0;
                  L6: while (true) {
                    if (((g) this).field_g <= var10) {
                      break L5;
                    } else {
                      var8 = var8 + var17.a((byte) -117);
                      ((g) this).field_t[var10] = var8 + var17.a((byte) -117);
                      if (var9 < ((g) this).field_t[var10]) {
                        var9 = ((g) this).field_t[var10];
                        var10++;
                        continue L6;
                      } else {
                        var10++;
                        continue L6;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L7: while (true) {
                    if (var10 >= ((g) this).field_g) {
                      break L5;
                    } else {
                      var8 = var8 + var17.e(-68);
                      ((g) this).field_t[var10] = var8 + var17.e(-68);
                      if (((g) this).field_t[var10] > var9) {
                        var9 = ((g) this).field_t[var10];
                        var10++;
                        continue L7;
                      } else {
                        var10++;
                        continue L7;
                      }
                    }
                  }
                }
              }
              L8: {
                ((g) this).field_c = 1 + var9;
                ((g) this).field_f = new int[((g) this).field_c];
                if (var7 != 0) {
                  ((g) this).field_l = new byte[((g) this).field_c][];
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                ((g) this).field_d = new int[((g) this).field_c];
                ((g) this).field_h = new int[((g) this).field_c];
                ((g) this).field_q = new int[((g) this).field_c];
                ((g) this).field_p = new int[((g) this).field_c][];
                if (var6 == 0) {
                  break L9;
                } else {
                  ((g) this).field_m = new int[((g) this).field_c];
                  var10 = 0;
                  L10: while (true) {
                    if (((g) this).field_c <= var10) {
                      var10 = 0;
                      L11: while (true) {
                        if (var10 >= ((g) this).field_g) {
                          ((g) this).field_s = new da(((g) this).field_m);
                          break L9;
                        } else {
                          ((g) this).field_m[((g) this).field_t[var10]] = var17.b((byte) 119);
                          var10++;
                          continue L11;
                        }
                      }
                    } else {
                      ((g) this).field_m[var10] = -1;
                      var10++;
                      continue L10;
                    }
                  }
                }
              }
              var10 = 0;
              L12: while (true) {
                if (((g) this).field_g <= var10) {
                  L13: {
                    if (var7 != 0) {
                      var10 = 0;
                      L14: while (true) {
                        if (var10 >= ((g) this).field_g) {
                          var10 = 0;
                          L15: while (true) {
                            if (((g) this).field_g <= var10) {
                              break L13;
                            } else {
                              ((g) this).field_q[((g) this).field_t[var10]] = var17.b((byte) 84);
                              var10++;
                              continue L15;
                            }
                          }
                        } else {
                          var21 = new byte[64];
                          var17.a(var21, (byte) -120, 0, 64);
                          ((g) this).field_l[((g) this).field_t[var10]] = var21;
                          var10++;
                          continue L14;
                        }
                      }
                    } else {
                      var10 = 0;
                      L16: while (true) {
                        if (((g) this).field_g <= var10) {
                          break L13;
                        } else {
                          ((g) this).field_q[((g) this).field_t[var10]] = var17.b((byte) 84);
                          var10++;
                          continue L16;
                        }
                      }
                    }
                  }
                  L17: {
                    if (var4 >= 7) {
                      var10 = 0;
                      L18: while (true) {
                        if (((g) this).field_g <= var10) {
                          var10 = 0;
                          L19: while (true) {
                            if (var10 >= ((g) this).field_g) {
                              break L17;
                            } else {
                              var11 = ((g) this).field_t[var10];
                              var8 = 0;
                              var12 = ((g) this).field_d[var11];
                              ((g) this).field_p[var11] = new int[var12];
                              var13 = -1;
                              var14 = 0;
                              L20: while (true) {
                                if (var14 >= var12) {
                                  ((g) this).field_f[var11] = var13 - -1;
                                  if (var13 + 1 == var12) {
                                    ((g) this).field_p[var11] = null;
                                    var10++;
                                    continue L19;
                                  } else {
                                    var10++;
                                    continue L19;
                                  }
                                } else {
                                  var8 = var8 + var17.a((byte) -119);
                                  ((g) this).field_p[var11][var14] = var8 + var17.a((byte) -119);
                                  var15 = var8 + var17.a((byte) -119);
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L20;
                                  } else {
                                    var14++;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((g) this).field_d[((g) this).field_t[var10]] = var17.a((byte) -124);
                          var10++;
                          continue L18;
                        }
                      }
                    } else {
                      var10 = 0;
                      L21: while (true) {
                        if (var10 >= ((g) this).field_g) {
                          var10 = 0;
                          L22: while (true) {
                            if (var10 >= ((g) this).field_g) {
                              break L17;
                            } else {
                              var11 = ((g) this).field_t[var10];
                              var12 = ((g) this).field_d[var11];
                              var8 = 0;
                              var13 = -1;
                              ((g) this).field_p[var11] = new int[var12];
                              var14 = 0;
                              L23: while (true) {
                                if (var14 >= var12) {
                                  ((g) this).field_f[var11] = var13 + 1;
                                  if (var12 == var13 - -1) {
                                    ((g) this).field_p[var11] = null;
                                    var10++;
                                    continue L22;
                                  } else {
                                    var10++;
                                    continue L22;
                                  }
                                } else {
                                  var8 = var8 + var17.e(eg.a(param0, -71));
                                  ((g) this).field_p[var11][var14] = var8 + var17.e(eg.a(param0, -71));
                                  var15 = var8 + var17.e(eg.a(param0, -71));
                                  if (var13 < var15) {
                                    var13 = var15;
                                    var14++;
                                    continue L23;
                                  } else {
                                    var14++;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          ((g) this).field_d[((g) this).field_t[var10]] = var17.e(-10);
                          var10++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L24: {
                    if (var6 == 0) {
                      break L24;
                    } else {
                      ((g) this).field_n = new da[var9 - -1];
                      ((g) this).field_i = new int[var9 - -1][];
                      var10 = 0;
                      L25: while (true) {
                        if (((g) this).field_g <= var10) {
                          break L24;
                        } else {
                          var11 = ((g) this).field_t[var10];
                          var12 = ((g) this).field_d[var11];
                          ((g) this).field_i[var11] = new int[((g) this).field_f[var11]];
                          var13 = 0;
                          L26: while (true) {
                            if (((g) this).field_f[var11] <= var13) {
                              var13 = 0;
                              L27: while (true) {
                                if (var13 >= var12) {
                                  ((g) this).field_n[var11] = new da(((g) this).field_i[var11]);
                                  var10++;
                                  continue L25;
                                } else {
                                  L28: {
                                    if (((g) this).field_p[var11] == null) {
                                      var14 = var13;
                                      break L28;
                                    } else {
                                      var14 = ((g) this).field_p[var11][var13];
                                      break L28;
                                    }
                                  }
                                  ((g) this).field_i[var11][var14] = var17.b((byte) 100);
                                  var13++;
                                  continue L27;
                                }
                              }
                            } else {
                              ((g) this).field_i[var11][var13] = -1;
                              var13++;
                              continue L26;
                            }
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  ((g) this).field_h[((g) this).field_t[var10]] = var17.b((byte) 49);
                  var10++;
                  continue L12;
                }
              }
            }
          }
        }
        throw new RuntimeException();
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
        if (param0 != 16704) {
            boolean discarded$0 = g.a(121);
        }
    }

    final static boolean a(int param0) {
        int var1 = 0;
        int var2 = 0;
        Object var3 = null;
        L0: {
          var2 = MinerDisturbance.field_ab;
          if (param0 == -36) {
            break L0;
          } else {
            var3 = null;
            g.a(25, -9, -119, -32, (byte) 41, (ea[]) null);
            break L0;
          }
        }
        var1 = 0;
        L1: while (true) {
          if (-36 >= (var1 ^ -1)) {
            return true;
          } else {
            if (th.field_b[var1][cm.field_o]) {
              if (d.a(var1, cm.field_o, (byte) 68)) {
                return false;
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
    }

    final static boolean a(char param0, byte param1) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param1 == -68) {
            break L0;
          } else {
            var3 = null;
            g.a((java.applet.Applet) null, -49);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param0 < 48) {
              break L2;
            } else {
              if (param0 > 57) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static boolean a(byte param0) {
        tn.field_M = true;
        if (param0 > -125) {
            return true;
        }
        j.field_f = 15000L + sf.a((byte) -19);
        return fh.field_b == 11 ? true : false;
    }

    g(byte[] param0, int param1, byte[] param2) {
        int var4 = 0;
        ((g) this).field_b = gn.a(param0.length, param0, true);
        if (param1 != ((g) this).field_b) {
            throw new RuntimeException();
        }
        if (param2 != null) {
            if (param2.length != 64) {
                throw new RuntimeException();
            }
            ((g) this).field_a = wb.a(param0.length, 0, param0, 18738);
            for (var4 = 0; -65 < (var4 ^ -1); var4++) {
                if (((g) this).field_a[var4] != param2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.a(2, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Woolly jumper: Protects against cold water.";
    }
}
