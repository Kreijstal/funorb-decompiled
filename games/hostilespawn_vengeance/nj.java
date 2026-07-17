/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

abstract class nj {
    static String field_e;
    static jg field_c;
    static String field_b;
    static int field_a;
    static pg[][] field_d;

    public static void b(byte param0) {
        if (param0 != -93) {
            field_c = null;
        }
        field_c = null;
        field_d = null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, bd param4, int param5) {
        if (param3 != 22173) {
            return;
        }
        try {
            ld.a(param1 << 5, (byte) -84, param5 << 8, param0, param4, param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "nj.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        p var8_ref_p = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = uj.field_p.field_e + 24;
            var5 = uj.field_p.field_g;
            var17 = new int[12];
            var16 = var17;
            var15 = var16;
            var14 = var15;
            var6 = var14;
            var7 = 0;
            var1_int = 0;
            L1: while (true) {
              if (~ib.field_c >= ~var1_int) {
                var8 = 0;
                L2: while (true) {
                  if (var7 <= var8) {
                    break L0;
                  } else {
                    var3 = var6[1 + var8];
                    var2 = var17[var8];
                    var9 = var6[2 + var8];
                    ue.field_c.a(true, 128, var9, var2, var3);
                    var8 += 3;
                    continue L2;
                  }
                }
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8_ref_p = jn.field_F[var1_int];
                      var9 = var8_ref_p.field_j.b(-4);
                      var3 = (int)(24.0 * (var8_ref_p.field_l.field_a + (double)var8_ref_p.field_j.field_g)) + -var5;
                      var2 = -var4 + (int)(24.0 * (var8_ref_p.field_l.field_f + (double)var8_ref_p.field_j.field_e));
                      if (var2 < -96) {
                        break L5;
                      } else {
                        if (var3 < -96) {
                          break L5;
                        } else {
                          if (var2 > 736) {
                            break L5;
                          } else {
                            if (var3 <= 576) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (5 == var8_ref_p.field_i) {
                      break L4;
                    } else {
                      if (24 != var8_ref_p.field_i) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L6: {
                    if (var8_ref_p.field_i != 13) {
                      if (ln.field_a.field_u[var9] >= 24) {
                        break L6;
                      } else {
                        ln.field_a.field_u[var9] = 24;
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  var10 = 0;
                  var12 = var8_ref_p.field_i;
                  if (var12 != 20) {
                    L7: {
                      if (var12 != 0) {
                        if (var12 != 18) {
                          if (var12 == 9) {
                            break L7;
                          } else {
                            if (23 == var12) {
                              break L7;
                            } else {
                              if (32 != var12) {
                                if (1 == var12) {
                                  L8: {
                                    var11 = var8_ref_p.field_e / 2;
                                    if (0 > var11) {
                                      var11 = 0;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  L9: {
                                    if (me.field_ib.length > var11) {
                                      break L9;
                                    } else {
                                      var11 = -1 + me.field_ib.length;
                                      break L9;
                                    }
                                  }
                                  if (bm.field_c == 1) {
                                    if (kd.field_t) {
                                      nj.a(var2 - me.field_ib[var11].field_z / 2, 128, -(me.field_ib[var11].field_A / 2) + var3, 22173, me.field_ib[var11], (int)var8_ref_p.field_c);
                                      break L3;
                                    } else {
                                      if (var11 <= 0) {
                                        break L3;
                                      } else {
                                        me.field_ib[var11].a(true, 128, (int)var8_ref_p.field_c, var2, var3);
                                        break L3;
                                      }
                                    }
                                  } else {
                                    me.field_ib[var11].c(var2 - me.field_ib[var11].field_z / 2, -(me.field_ib[var11].field_A / 2) + var3, 128);
                                    break L3;
                                  }
                                } else {
                                  if (var12 == 2) {
                                    var10 = 16711680;
                                    si.f(var2, var3, var8_ref_p.field_e * 2, var10, 128 - var8_ref_p.field_e * 4);
                                    break L3;
                                  } else {
                                    if (var12 != 3) {
                                      if (var12 != 21) {
                                        L10: {
                                          if (var12 == 4) {
                                            break L10;
                                          } else {
                                            if (var12 != 8) {
                                              if (var12 != 17) {
                                                if (var12 == 29) {
                                                  break L10;
                                                } else {
                                                  L11: {
                                                    if (var12 == 28) {
                                                      break L11;
                                                    } else {
                                                      if (var12 != 30) {
                                                        if (var12 != 5) {
                                                          if (var12 == 7) {
                                                            if (var7 < var17.length) {
                                                              int incrementValue$3 = var7;
                                                              var7++;
                                                              var6[incrementValue$3] = var2;
                                                              int incrementValue$4 = var7;
                                                              var7++;
                                                              var6[incrementValue$4] = var3;
                                                              int incrementValue$5 = var7;
                                                              var7++;
                                                              var6[incrementValue$5] = (int)var8_ref_p.field_c;
                                                              break L3;
                                                            } else {
                                                              break L3;
                                                            }
                                                          } else {
                                                            if (var12 == 24) {
                                                              bn.a(true, var3, var8_ref_p, var2);
                                                              break L3;
                                                            } else {
                                                              if (var12 == 6) {
                                                                tm.a((byte) 88, var2, var3, var8_ref_p);
                                                                break L3;
                                                              } else {
                                                                if (var12 == 37) {
                                                                  am.a(-1, var3, var2, var8_ref_p);
                                                                  break L3;
                                                                } else {
                                                                  L12: {
                                                                    if (10 != var12) {
                                                                      if (var12 != 25) {
                                                                        if (var12 == 11) {
                                                                          ri.a(91, var3, var8_ref_p, var2);
                                                                          break L3;
                                                                        } else {
                                                                          if (var12 == 34) {
                                                                            f.a(var2, var3, var8_ref_p, 2);
                                                                            break L3;
                                                                          } else {
                                                                            if (33 == var12) {
                                                                              in.a(4, var8_ref_p, var3, var2);
                                                                              break L3;
                                                                            } else {
                                                                              if (var12 != 12) {
                                                                                if (var12 == 13) {
                                                                                  ka.a(var2, var8_ref_p, var3, 128);
                                                                                  break L3;
                                                                                } else {
                                                                                  if (var12 != 14) {
                                                                                    L13: {
                                                                                      if (var12 == 22) {
                                                                                        break L13;
                                                                                      } else {
                                                                                        if (var12 == 27) {
                                                                                          break L13;
                                                                                        } else {
                                                                                          break L3;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    bi.a(var8_ref_p, var3, var2, -49);
                                                                                    break L3;
                                                                                  } else {
                                                                                    mg.a(var8_ref_p, var2, var3, 2);
                                                                                    break L3;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L14: {
                                                                                  var11 = var8_ref_p.field_e * ln.field_m.length / 128;
                                                                                  if (var11 < ln.field_m.length) {
                                                                                    break L14;
                                                                                  } else {
                                                                                    var11 = ln.field_m.length - 1;
                                                                                    break L14;
                                                                                  }
                                                                                }
                                                                                L15: {
                                                                                  if (var11 >= 0) {
                                                                                    break L15;
                                                                                  } else {
                                                                                    var11 = 0;
                                                                                    break L15;
                                                                                  }
                                                                                }
                                                                                ln.field_m[var11].a((double)var3, (double)var2, false, var8_ref_p.field_c, 256);
                                                                                break L3;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L12;
                                                                      }
                                                                    } else {
                                                                      break L12;
                                                                    }
                                                                  }
                                                                  el.a(var2, var8_ref_p, -117, var3);
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          ha.a(var2, -10454, var8_ref_p, var3);
                                                          break L3;
                                                        }
                                                      } else {
                                                        break L11;
                                                      }
                                                    }
                                                  }
                                                  hd.a(var2, -110, var3, var8_ref_p);
                                                  break L3;
                                                }
                                              } else {
                                                pf.a(var3, true, var8_ref_p, var2);
                                                break L3;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        pf.a(var3, true, var8_ref_p, var2);
                                        break L3;
                                      } else {
                                        ic.a(var2, var3, var8_ref_p, (byte) 107);
                                        break L3;
                                      }
                                    } else {
                                      nm.a(var2, var8_ref_p, var3, 25);
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                oa.a(-17652, var3, var8_ref_p, var2);
                                break L3;
                              }
                            }
                          }
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    gb.a(var3, (byte) 81, var8_ref_p, var2);
                    break L3;
                  } else {
                    wi.a(var8_ref_p, var2, (byte) -87, var3);
                    break L3;
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
          throw wg.a((Throwable) (Object) var1, "nj.A(" + 11178 + 41);
        }
    }

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        Object stackIn_9_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == bi.field_g) {
                break L1;
              } else {
                if (!bi.field_g.equals((Object) (Object) param0.getParameter("settings"))) {
                  var3 = (Object) (Object) bi.field_g;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (vh.field_c == null) {
                break L2;
              } else {
                if (vh.field_c.equals((Object) (Object) param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = (Object) (Object) vh.field_c;
                  break L2;
                }
              }
            }
            if (param1) {
              stackOut_10_0 = ig.a(true, param2, (String) var3, -1, (String) var4);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_8_0 = null;
              stackIn_9_0 = stackOut_8_0;
              return (java.net.URL) (Object) stackIn_9_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_12_0 = var3;
            stackOut_12_1 = new StringBuilder().append("nj.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    final static gb a(int param0, int param1, boolean param2, boolean param3, int param4) {
        if (param0 <= 66) {
            return null;
        }
        return bf.a(false, param2, param1, 1, param3, -31);
    }

    final static int a(oc param0, oc param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1.field_e <= param0.field_e) {
                stackOut_2_0 = param0.field_e - param1.field_e;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = param1.field_e - param0.field_e;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_3_0;
              if (param1.field_g <= param0.field_g) {
                stackOut_5_0 = param0.field_g - param1.field_g;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = -param0.field_g + param1.field_g;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_6_0;
              if (var3_int >= var4) {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = var4;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("nj.F(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + -28835 + 41);
        }
        return stackIn_9_0;
    }

    abstract void a(int param0, byte[] param1);

    abstract byte[] a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Hard mode";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_c = new jg();
    }
}
