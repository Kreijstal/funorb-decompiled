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
        ud.field_e = param0 >> 4 & 3;
        if (!(2 >= ud.field_e)) {
            ud.field_e = 2;
        }
        ra.field_b = (param0 & 13) >> 2;
        if (ra.field_b > 2) {
            ra.field_b = 2;
        }
        wi.field_t = param0 & 3;
        if (!(wi.field_t <= 2)) {
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
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                      if (param1 > 34) {
                        break L2;
                      } else {
                        field_k = 6;
                        break L2;
                      }
                    }
                    param0.getAppletContext().showDocument(nn.a(121, param0, var2), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) var2_ref2;
                stackOut_6_1 = new StringBuilder().append("g.A(");
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0 == null) {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L4;
                } else {
                  stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
                  stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L4;
                }
              }
              throw lj.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        mj var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            var4 = (mj) (Object) nh.field_a.b(75);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                vd.a(7, -3450, var4);
                var4 = (mj) (Object) nh.field_a.b((byte) 56);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "g.H(" + -69 + ',' + 7 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, ea[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var22 = MinerDisturbance.field_ab;
        try {
          L0: {
            if (param5 != null) {
              L1: {
                if (0 >= param3) {
                  break L1;
                } else {
                  if (0 < param1) {
                    L2: {
                      if (null != param5[3]) {
                        stackOut_8_0 = param5[3].field_x;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (param5[5] != null) {
                        stackOut_11_0 = param5[5].field_x;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (param5[1] != null) {
                        stackOut_14_0 = param5[1].field_A;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (null != param5[7]) {
                        stackOut_17_0 = param5[7].field_A;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param3 + param2;
                      var11 = param1 + param0;
                      var12 = param2 - -var6_int;
                      var13 = -var7 + var10;
                      var14 = param0 - -var8;
                      var15 = var11 - var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L6;
                      } else {
                        var17 = param2 - -(param3 * var6_int / (var7 + var6_int));
                        var16 = param2 - -(param3 * var6_int / (var7 + var6_int));
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      if (param4 > 13) {
                        break L7;
                      } else {
                        var23 = null;
                        g.a((java.applet.Applet) null, 77);
                        break L7;
                      }
                    }
                    L8: {
                      if (var18 <= var19) {
                        break L8;
                      } else {
                        var19 = param1 * var8 / (var9 + var8) + param0;
                        var18 = param1 * var8 / (var9 + var8) + param0;
                        break L8;
                      }
                    }
                    L9: {
                      eh.b(fm.field_N);
                      if (param5[0] == null) {
                        break L9;
                      } else {
                        eh.f(param2, param0, var16, var18);
                        param5[0].f(param2, param0);
                        eh.a(fm.field_N);
                        break L9;
                      }
                    }
                    L10: {
                      if (param5[2] == null) {
                        break L10;
                      } else {
                        eh.f(var17, param0, var10, var18);
                        param5[2].f(var13, param0);
                        eh.a(fm.field_N);
                        break L10;
                      }
                    }
                    L11: {
                      if (param5[6] != null) {
                        eh.f(param2, var19, var16, var11);
                        param5[6].f(param2, var15);
                        eh.a(fm.field_N);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (param5[8] != null) {
                        eh.f(var17, var19, var10, var11);
                        param5[8].f(var13, var15);
                        eh.a(fm.field_N);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    L13: {
                      if (param5[1] == null) {
                        break L13;
                      } else {
                        if (0 != param5[1].field_x) {
                          eh.f(var16, param0, var17, var18);
                          var20 = var12;
                          L14: while (true) {
                            if (var13 <= var20) {
                              eh.a(fm.field_N);
                              break L13;
                            } else {
                              param5[1].f(var20, param0);
                              var20 = var20 + param5[1].field_x;
                              continue L14;
                            }
                          }
                        } else {
                          break L13;
                        }
                      }
                    }
                    L15: {
                      if (null == param5[7]) {
                        break L15;
                      } else {
                        if (param5[7].field_x != 0) {
                          eh.f(var16, var19, var17, var11);
                          var20 = var12;
                          L16: while (true) {
                            if (var20 >= var13) {
                              eh.a(fm.field_N);
                              break L15;
                            } else {
                              param5[7].f(var20, var15);
                              var20 = var20 + param5[7].field_x;
                              continue L16;
                            }
                          }
                        } else {
                          break L15;
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
                            if (var15 <= var20) {
                              eh.a(fm.field_N);
                              break L17;
                            } else {
                              param5[3].f(param2, var20);
                              var20 = var20 + param5[3].field_A;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (param5[5] == null) {
                        break L19;
                      } else {
                        if (param5[5].field_A != 0) {
                          eh.f(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var20 >= var15) {
                              eh.a(fm.field_N);
                              break L19;
                            } else {
                              param5[5].f(var13, var20);
                              var20 = var20 + param5[5].field_A;
                              continue L20;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    L21: {
                      if (null == param5[4]) {
                        break L21;
                      } else {
                        if (param5[4].field_x == 0) {
                          break L21;
                        } else {
                          if (param5[4].field_A != 0) {
                            eh.f(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var20 >= var15) {
                                eh.a(fm.field_N);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param5[4].field_A;
                                    continue L22;
                                  } else {
                                    param5[4].f(var21, var20);
                                    var21 = var21 + param5[4].field_x;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          } else {
                            break L21;
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var6;
            stackOut_73_1 = new StringBuilder().append("g.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param5 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L24;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L24;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ')');
        }
    }

    private final void a(int param0, byte[] param1) {
        RuntimeException var3 = null;
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
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var16 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var17 = new sb(in.a(param1, 0));
              var4 = var17.d((byte) -54);
              if (var4 < 5) {
                break L1;
              } else {
                if (var4 > 7) {
                  break L1;
                } else {
                  L2: {
                    if (var4 >= 6) {
                      ((g) this).field_r = var17.b((byte) 91);
                      break L2;
                    } else {
                      ((g) this).field_r = 0;
                      break L2;
                    }
                  }
                  L3: {
                    var5 = var17.d((byte) -54);
                    if ((var5 & 1) == 0) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var6 = stackIn_11_0;
                    if (7 > var4) {
                      ((g) this).field_g = var17.e(-106);
                      break L4;
                    } else {
                      ((g) this).field_g = var17.a((byte) -120);
                      break L4;
                    }
                  }
                  L5: {
                    if ((var5 & 2) == 0) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L5;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_17_0;
                    var8 = 0;
                    ((g) this).field_t = new int[((g) this).field_g];
                    var9 = -1;
                    if (var4 >= 7) {
                      var10 = 0;
                      L7: while (true) {
                        if (~((g) this).field_g >= ~var10) {
                          break L6;
                        } else {
                          L8: {
                            int dupTemp$4 = var8 + var17.a((byte) -117);
                            var8 = dupTemp$4;
                            ((g) this).field_t[var10] = dupTemp$4;
                            if (~var9 <= ~((g) this).field_t[var10]) {
                              break L8;
                            } else {
                              var9 = ((g) this).field_t[var10];
                              break L8;
                            }
                          }
                          var10++;
                          continue L7;
                        }
                      }
                    } else {
                      var10 = 0;
                      L9: while (true) {
                        if (~var10 <= ~((g) this).field_g) {
                          break L6;
                        } else {
                          L10: {
                            int dupTemp$5 = var8 + var17.e(-68);
                            var8 = dupTemp$5;
                            ((g) this).field_t[var10] = dupTemp$5;
                            if (~((g) this).field_t[var10] >= ~var9) {
                              break L10;
                            } else {
                              var9 = ((g) this).field_t[var10];
                              break L10;
                            }
                          }
                          var10++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L11: {
                    ((g) this).field_c = 1 + var9;
                    ((g) this).field_f = new int[((g) this).field_c];
                    if (var7 != 0) {
                      ((g) this).field_l = new byte[((g) this).field_c][];
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    ((g) this).field_d = new int[((g) this).field_c];
                    ((g) this).field_h = new int[((g) this).field_c];
                    ((g) this).field_q = new int[((g) this).field_c];
                    ((g) this).field_p = new int[((g) this).field_c][];
                    if (var6 == 0) {
                      break L12;
                    } else {
                      ((g) this).field_m = new int[((g) this).field_c];
                      var10 = 0;
                      L13: while (true) {
                        if (~((g) this).field_c >= ~var10) {
                          var10 = 0;
                          L14: while (true) {
                            if (~var10 <= ~((g) this).field_g) {
                              ((g) this).field_s = new da(((g) this).field_m);
                              break L12;
                            } else {
                              ((g) this).field_m[((g) this).field_t[var10]] = var17.b((byte) 119);
                              var10++;
                              continue L14;
                            }
                          }
                        } else {
                          ((g) this).field_m[var10] = -1;
                          var10++;
                          continue L13;
                        }
                      }
                    }
                  }
                  var10 = 0;
                  L15: while (true) {
                    if (((g) this).field_g <= var10) {
                      L16: {
                        if (var7 != 0) {
                          var10 = 0;
                          L17: while (true) {
                            if (~var10 <= ~((g) this).field_g) {
                              var10 = 0;
                              L18: while (true) {
                                if (~((g) this).field_g >= ~var10) {
                                  break L16;
                                } else {
                                  ((g) this).field_q[((g) this).field_t[var10]] = var17.b((byte) 84);
                                  var10++;
                                  continue L18;
                                }
                              }
                            } else {
                              var21 = new byte[64];
                              var17.a(var21, (byte) -120, 0, 64);
                              ((g) this).field_l[((g) this).field_t[var10]] = var21;
                              var10++;
                              continue L17;
                            }
                          }
                        } else {
                          var10 = 0;
                          L19: while (true) {
                            if (~((g) this).field_g >= ~var10) {
                              break L16;
                            } else {
                              ((g) this).field_q[((g) this).field_t[var10]] = var17.b((byte) 84);
                              var10++;
                              continue L19;
                            }
                          }
                        }
                      }
                      L20: {
                        if (var4 >= 7) {
                          var10 = 0;
                          L21: while (true) {
                            if (~((g) this).field_g >= ~var10) {
                              var10 = 0;
                              L22: while (true) {
                                if (~var10 <= ~((g) this).field_g) {
                                  break L20;
                                } else {
                                  var11 = ((g) this).field_t[var10];
                                  var8 = 0;
                                  var12 = ((g) this).field_d[var11];
                                  ((g) this).field_p[var11] = new int[var12];
                                  var13 = -1;
                                  var14 = 0;
                                  L23: while (true) {
                                    if (var14 >= var12) {
                                      L24: {
                                        ((g) this).field_f[var11] = var13 - -1;
                                        if (~(var13 + 1) != ~var12) {
                                          break L24;
                                        } else {
                                          ((g) this).field_p[var11] = null;
                                          break L24;
                                        }
                                      }
                                      var10++;
                                      continue L22;
                                    } else {
                                      L25: {
                                        int dupTemp$6 = var8 + var17.a((byte) -119);
                                        var8 = dupTemp$6;
                                        ((g) this).field_p[var11][var14] = dupTemp$6;
                                        var15 = dupTemp$6;
                                        if (~var13 > ~var15) {
                                          var13 = var15;
                                          break L25;
                                        } else {
                                          break L25;
                                        }
                                      }
                                      var14++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((g) this).field_d[((g) this).field_t[var10]] = var17.a((byte) -124);
                              var10++;
                              continue L21;
                            }
                          }
                        } else {
                          var10 = 0;
                          L26: while (true) {
                            if (var10 >= ((g) this).field_g) {
                              var10 = 0;
                              L27: while (true) {
                                if (~var10 <= ~((g) this).field_g) {
                                  break L20;
                                } else {
                                  var11 = ((g) this).field_t[var10];
                                  var12 = ((g) this).field_d[var11];
                                  var8 = 0;
                                  var13 = -1;
                                  ((g) this).field_p[var11] = new int[var12];
                                  var14 = 0;
                                  L28: while (true) {
                                    if (var14 >= var12) {
                                      L29: {
                                        ((g) this).field_f[var11] = var13 + 1;
                                        if (~var12 != ~(var13 - -1)) {
                                          break L29;
                                        } else {
                                          ((g) this).field_p[var11] = null;
                                          break L29;
                                        }
                                      }
                                      var10++;
                                      continue L27;
                                    } else {
                                      L30: {
                                        int dupTemp$7 = var8 + var17.e(eg.a(2, -71));
                                        var8 = dupTemp$7;
                                        ((g) this).field_p[var11][var14] = dupTemp$7;
                                        var15 = dupTemp$7;
                                        if (~var13 <= ~var15) {
                                          break L30;
                                        } else {
                                          var13 = var15;
                                          break L30;
                                        }
                                      }
                                      var14++;
                                      continue L28;
                                    }
                                  }
                                }
                              }
                            } else {
                              ((g) this).field_d[((g) this).field_t[var10]] = var17.e(-10);
                              var10++;
                              continue L26;
                            }
                          }
                        }
                      }
                      L31: {
                        if (var6 == 0) {
                          break L31;
                        } else {
                          ((g) this).field_n = new da[var9 - -1];
                          ((g) this).field_i = new int[var9 - -1][];
                          var10 = 0;
                          L32: while (true) {
                            if (~((g) this).field_g >= ~var10) {
                              break L31;
                            } else {
                              var11 = ((g) this).field_t[var10];
                              var12 = ((g) this).field_d[var11];
                              ((g) this).field_i[var11] = new int[((g) this).field_f[var11]];
                              var13 = 0;
                              L33: while (true) {
                                if (~((g) this).field_f[var11] >= ~var13) {
                                  var13 = 0;
                                  L34: while (true) {
                                    if (var13 >= var12) {
                                      ((g) this).field_n[var11] = new da(((g) this).field_i[var11]);
                                      var10++;
                                      continue L32;
                                    } else {
                                      L35: {
                                        if (((g) this).field_p[var11] == null) {
                                          var14 = var13;
                                          break L35;
                                        } else {
                                          var14 = ((g) this).field_p[var11][var13];
                                          break L35;
                                        }
                                      }
                                      ((g) this).field_i[var11][var14] = var17.b((byte) 100);
                                      var13++;
                                      continue L34;
                                    }
                                  }
                                } else {
                                  ((g) this).field_i[var11][var13] = -1;
                                  var13++;
                                  continue L33;
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      ((g) this).field_h[((g) this).field_t[var10]] = var17.b((byte) 49);
                      var10++;
                      continue L15;
                    }
                  }
                }
              }
            }
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L36: {
            var3 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) var3;
            stackOut_94_1 = new StringBuilder().append("g.F(").append(2).append(',');
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param1 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L36;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L36;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + ')');
        }
    }

    public static void b(int param0) {
        field_e = null;
        field_j = null;
    }

    final static boolean a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_6_0 = 0;
        var2 = MinerDisturbance.field_ab;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              if (var1_int >= 35) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                L2: {
                  if (th.field_b[var1_int][cm.field_o]) {
                    if (!d.a(var1_int, cm.field_o, (byte) 68)) {
                      break L2;
                    } else {
                      stackOut_6_0 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0 != 0;
                    }
                  } else {
                    break L2;
                  }
                }
                var1_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "g.E(" + -36 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final static boolean a(char param0, byte param1) {
        return param0 >= 48 && param0 <= 57;
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
        int var4_int = 0;
        try {
            ((g) this).field_b = gn.a(param0.length, param0, true);
            if (param1 != ((g) this).field_b) {
                throw new RuntimeException();
            }
            if (param2 != null) {
                if (param2.length != 64) {
                    throw new RuntimeException();
                }
                ((g) this).field_a = wb.a(param0.length, 0, param0, 18738);
                for (var4_int = 0; var4_int < 64; var4_int++) {
                    if (((g) this).field_a[var4_int] != param2[var4_int]) {
                        throw new RuntimeException();
                    }
                }
            }
            this.a(2, param0);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "g.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Woolly jumper: Protects against cold water.";
    }
}
