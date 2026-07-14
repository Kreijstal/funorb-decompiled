/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends jd {
    static int[] field_r;
    private kg field_t;
    private kg[] field_q;
    static String[] field_s;

    private final void a(boolean param0, int param1, qi param2) {
        int var4 = 0;
        kg var5 = null;
        kg var6 = null;
        int var7 = 0;
        Object var8 = null;
        kg stackIn_7_0 = null;
        kg stackIn_8_0 = null;
        kg stackIn_9_0 = null;
        kg stackIn_9_1 = null;
        kg stackOut_6_0 = null;
        kg stackOut_8_0 = null;
        kg stackOut_8_1 = null;
        kg stackOut_7_0 = null;
        kg stackOut_7_1 = null;
        L0: {
          var7 = Bounce.field_N;
          super.a((jd) (Object) param2, (byte) -122);
          if (param1 == -19463) {
            break L0;
          } else {
            var8 = null;
            ((qi) this).a(10, 115, (tg[]) null);
            break L0;
          }
        }
        L1: {
          if (!param0) {
            cb.a((Object[]) (Object) ((qi) this).field_q, 0, (Object[]) (Object) param2.field_q, 0, 6);
            break L1;
          } else {
            var4 = 0;
            L2: while (true) {
              if (var4 >= 6) {
                break L1;
              } else {
                var5 = ((qi) this).field_q[var4];
                if (var5 == null) {
                  param2.field_q[var4] = null;
                  var4++;
                  continue L2;
                } else {
                  L3: {
                    var6 = param2.field_q[var4];
                    stackOut_6_0 = (kg) var5;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var6 == null) {
                      param2.field_q[var4] = new kg();
                      stackOut_8_0 = (kg) (Object) stackIn_8_0;
                      stackOut_8_1 = new kg();
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      break L3;
                    } else {
                      stackOut_7_0 = (kg) (Object) stackIn_7_0;
                      stackOut_7_1 = (kg) var6;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_9_1 = stackOut_7_1;
                      break L3;
                    }
                  }
                  ((kg) (Object) stackIn_9_0).a(stackIn_9_1, (byte) 55);
                  var4++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_s = null;
        if (param0 != 0) {
            qi.b(66);
        }
        field_r = null;
    }

    public qi() {
        ((qi) this).field_q = new kg[6];
        ((qi) this).field_t = new kg();
        ((qi) this).field_q[0] = new kg();
        kg var1 = new kg();
        var1.a(-29776);
    }

    final void a(int param0, int param1, tg[] param2) {
        int var4 = param1;
        if (((qi) this).field_q[var4] == null) {
            ((qi) this).field_q[var4] = new kg();
        }
        if (param0 != -25026) {
            return;
        }
        ((qi) this).field_q[param1].field_n = param2;
    }

    public final void a(int param0, lk param1, byte param2, boolean param3, int param4) {
        kg var7 = null;
        int var8 = 0;
        kg var9 = null;
        wd var10 = null;
        kg var11 = null;
        kg var12 = null;
        kg var13 = null;
        kg var14 = null;
        lk stackIn_3_0 = null;
        lk stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param1 instanceof wd) {
            stackOut_2_0 = (lk) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (lk) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (wd) (Object) stackIn_3_0;
          ai.a(param1.field_k + (param1.field_r + param4), param1.field_m + (param0 - -param1.field_i), param0 + param1.field_i, param1.field_r + param4, -19852);
          if (var10 != null) {
            param3 = param3 & var10.field_y;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = ((qi) this).field_q[0];
          ((qi) this).field_t.a(-29776);
          var7.a(((qi) this).field_t, param4, param0, (qi) this, false, param1);
          if (var10 == null) {
            break L2;
          } else {
            L3: {
              if (var10.field_z) {
                var11 = ((qi) this).field_q[1];
                if (var11 == null) {
                  break L3;
                } else {
                  var11.a(((qi) this).field_t, param4, param0, (qi) this, false, param1);
                  break L3;
                }
              } else {
                break L3;
              }
            }
            if (!var10.field_g) {
              break L2;
            } else {
              L4: {
                var12 = ((qi) this).field_q[3];
                if (var10.field_u == 0) {
                  break L4;
                } else {
                  if (var12 != null) {
                    var12.a(((qi) this).field_t, param4, param0, (qi) this, false, param1);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var9 = ((qi) this).field_q[2];
              if (var9 != null) {
                var9.a(((qi) this).field_t, param4, param0, (qi) this, false, param1);
                break L2;
              } else {
                break L2;
              }
            }
          }
        }
        L5: {
          if (param1.e(1)) {
            var13 = ((qi) this).field_q[5];
            if (var13 != null) {
              var13.a(((qi) this).field_t, param4, param0, (qi) this, false, param1);
              break L5;
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
        L6: {
          if (!param3) {
            var14 = ((qi) this).field_q[4];
            if (var14 != null) {
              var14.a(((qi) this).field_t, param4, param0, (qi) this, false, param1);
              break L6;
            } else {
              break L6;
            }
          } else {
            break L6;
          }
        }
        ((qi) this).field_t.a(param0, (qi) this, param1, param4, -103);
        ve.a(-128);
        var8 = 80 % ((param2 - -60) / 56);
    }

    qi(qi param0, boolean param1) {
        this();
        param0.a(param1, -19463, (qi) this);
    }

    final kg b(int param0, int param1) {
        if (param0 != -1) {
            Object var4 = null;
            boolean discarded$0 = qi.a((gk) null, (gk) null, (byte) -12, (gk) null);
        }
        ((qi) this).field_q[param1] = new kg();
        return new kg();
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        try {
            var4 = param0.getGraphics();
            if (param3 != -25971) {
                Object var5 = null;
                qi.a((java.awt.Canvas) null, 12, -85, -86);
            }
            ca.field_d.a(param2, param1, var4, -104);
            var4.dispose();
        } catch (Exception exception) {
            param0.repaint();
        }
    }

    final static boolean a(gk param0, gk param1, byte param2, gk param3) {
        int var4 = 0;
        var4 = -52 / ((-79 - param2) / 39);
        if (!param3.c(-108)) {
          return false;
        } else {
          if (param3.b("commonui", false)) {
            L0: {
              if (!param1.c(-90)) {
                break L0;
              } else {
                if (!param1.b("commonui", false)) {
                  break L0;
                } else {
                  L1: {
                    if (!param0.c(44)) {
                      break L1;
                    } else {
                      if (param0.b("button.gif", false)) {
                        return true;
                      } else {
                        break L1;
                      }
                    }
                  }
                  return false;
                }
              }
            }
            return false;
          } else {
            return false;
          }
        }
    }

    final void a(int param0, tg[] param1) {
        kg[] var3 = null;
        int var4 = 0;
        kg var5 = null;
        int var6 = 0;
        Object var7 = null;
        kg[] var8 = null;
        L0: {
          var6 = Bounce.field_N;
          var8 = ((qi) this).field_q;
          var3 = var8;
          if (param0 == 7) {
            break L0;
          } else {
            var7 = null;
            ((qi) this).a(-84, (lk) null, (byte) 115, true, 56);
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var8.length <= var4) {
            return;
          } else {
            var5 = var8[var4];
            if (var5 != null) {
              var5.field_n = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != 10) {
            Object var3 = null;
            qi.a((java.awt.Canvas) null, -82, -45, 126);
        }
        return pc.a(8272, true, param0, 10);
    }

    final void a(boolean param0, tg param1) {
        kg[] var3 = null;
        int var4 = 0;
        kg var5 = null;
        int var6 = 0;
        kg[] var7 = null;
        L0: {
          var6 = Bounce.field_N;
          var7 = ((qi) this).field_q;
          var3 = var7;
          if (param0) {
            break L0;
          } else {
            ((qi) this).field_q = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_o = param1;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(byte[] param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wi var16 = null;
        wi var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        L0: {
          var15 = Bounce.field_N;
          var16 = new wi(param0);
          var17 = var16;
          var17.field_h = param0.length - 2;
          nj.field_p = var17.a(-1640531527);
          lg.field_c = new boolean[nj.field_p];
          if (param1 == 11906) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        cl.field_n = new int[nj.field_p];
        gk.field_g = new byte[nj.field_p][];
        ae.field_c = new int[nj.field_p];
        ph.field_c = new byte[nj.field_p][];
        qh.field_i = new int[nj.field_p];
        ih.field_V = new int[nj.field_p];
        var17.field_h = param0.length + (-7 + -(8 * nj.field_p));
        se.field_C = var17.a(-1640531527);
        fk.field_e = var17.a(param1 + -1640543433);
        var3 = 1 + (var17.d((byte) -105) & 255);
        var4 = 0;
        L1: while (true) {
          L2: {
            if (nj.field_p <= var4) {
              break L2;
            } else {
              cl.field_n[var4] = var16.a(-1640531527);
              var4++;
              if (0 == 0) {
                continue L1;
              } else {
                break L2;
              }
            }
          }
          var4 = 0;
          L3: while (true) {
            L4: {
              if (nj.field_p <= var4) {
                break L4;
              } else {
                ae.field_c[var4] = var16.a(-1640531527);
                var4++;
                if (0 == 0) {
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
            var4 = 0;
            L5: while (true) {
              L6: {
                if (var4 >= nj.field_p) {
                  break L6;
                } else {
                  ih.field_V[var4] = var16.a(-1640531527);
                  var4++;
                  if (0 == 0) {
                    continue L5;
                  } else {
                    break L6;
                  }
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (nj.field_p <= var4) {
                    break L8;
                  } else {
                    qh.field_i[var4] = var16.a(param1 + -1640543433);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_h = -(nj.field_p * 8) + (param0.length - (7 - -((-1 + var3) * 3)));
                he.field_k = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        he.field_k[var4] = var16.b((byte) -83);
                        if (0 == he.field_k[var4]) {
                          he.field_k[var4] = 1;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17.field_h = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= nj.field_p) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
                            var5 = ih.field_V[var4];
                            var6 = qh.field_i[var4];
                            var7 = var5 * var6;
                            var24 = new byte[var7];
                            var22 = var24;
                            var20 = var22;
                            var18 = var20;
                            var8 = var18;
                            ph.field_c[var4] = var24;
                            var25 = new byte[var7];
                            var23 = var25;
                            var21 = var23;
                            var19 = var21;
                            var9 = var19;
                            gk.field_g[var4] = var25;
                            var10 = 0;
                            var11 = var17.d((byte) -118);
                            if (-1 != (1 & var11 ^ -1)) {
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var12 >= var7) {
                                    break L17;
                                  } else {
                                    var8[var12] = var16.k(ud.a(param1, -12011));
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if ((2 & var11) != 0) {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var12 >= var7) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var16.k(99);
                                          var13 = var16.k(99);
                                          stackOut_35_0 = var10;
                                          stackIn_37_0 = stackOut_35_0;
                                          stackIn_36_0 = stackOut_35_0;
                                          if (-1 == var13) {
                                            stackOut_37_0 = stackIn_37_0;
                                            stackOut_37_1 = 0;
                                            stackIn_38_0 = stackOut_37_0;
                                            stackIn_38_1 = stackOut_37_1;
                                            break L20;
                                          } else {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 1;
                                            stackIn_38_0 = stackOut_36_0;
                                            stackIn_38_1 = stackOut_36_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_38_0 | stackIn_38_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            L22: {
                              if (var5 <= var12) {
                                break L22;
                              } else {
                                var13 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (var6 <= var13) {
                                      break L24;
                                    } else {
                                      var8[var13 * var5 + var12] = var16.k(-53);
                                      var13++;
                                      if (0 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if ((var11 & 2) == 0) {
                              break L14;
                            } else {
                              var12 = 0;
                              L25: while (true) {
                                if (var12 >= var5) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var6 <= var13) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var12 - -(var13 * var5)] = var16.k(-81);
                                          var14 = var16.k(-81);
                                          stackOut_52_0 = var10;
                                          stackIn_54_0 = stackOut_52_0;
                                          stackIn_53_0 = stackOut_52_0;
                                          if (-1 == var14) {
                                            stackOut_54_0 = stackIn_54_0;
                                            stackOut_54_1 = 0;
                                            stackIn_55_0 = stackOut_54_0;
                                            stackIn_55_1 = stackOut_54_1;
                                            break L28;
                                          } else {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 1;
                                            stackIn_55_0 = stackOut_53_0;
                                            stackIn_55_1 = stackOut_53_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_55_0 | stackIn_55_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        lg.field_c[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
