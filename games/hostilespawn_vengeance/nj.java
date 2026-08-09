/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nj {
    static String field_e;
    static jg field_c;
    static String field_b;
    static int field_a;
    static pg[][] field_d;

    public static void b(byte param0) {
        if (param0 != -93) {
            field_c = (jg) null;
        }
        field_c = null;
        field_d = (pg[][]) null;
        field_b = null;
        field_e = null;
    }

    final static void a(int param0, int param1, int param2, int param3, bd param4, int param5) {
        if (param3 != 22173) {
            return;
        }
        try {
            ld.a(param1 << -1668743547, (byte) -84, param5 << 242536488, param0, param4, param2);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "nj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    final static void a(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        p var8_ref_p = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int[] var14 = null;
        int[] var15 = null;
        var13 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var4 = uj.field_p.field_e + 24;
            var5 = uj.field_p.field_g;
            var15 = new int[12];
            var14 = var15;
            var6 = var14;
            var7 = 0;
            var1_int = 0;
            L1: while (true) {
              if (ib.field_c <= var1_int) {
                if (param0 == 11178) {
                  var8 = 0;
                  L2: while (true) {
                    if (var7 <= var8) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3 = var6[1 + var8];
                      var2 = var15[var8];
                      var9 = var6[2 + var8];
                      ue.field_c.a(true, 128, var9, var2, var3);
                      var8 += 3;
                      continue L2;
                    }
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                          if (-737 > (var2 ^ -1)) {
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
                  if (-21 != (var12 ^ -1)) {
                    L7: {
                      if (-1 != (var12 ^ -1)) {
                        if (var12 != 18) {
                          if (-10 == (var12 ^ -1)) {
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
                                  if (-2 == (bm.field_c ^ -1)) {
                                    if (kd.field_t) {
                                      nj.a(var2 - me.field_ib[var11].field_z / 2, 128, -(me.field_ib[var11].field_A / 2) + var3, 22173, me.field_ib[var11], (int)var8_ref_p.field_c);
                                      break L3;
                                    } else {
                                      if (-1 <= (var11 ^ -1)) {
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
                                  if ((var12 ^ -1) == -3) {
                                    var10 = 16711680;
                                    si.f(var2, var3, var8_ref_p.field_e * 2, var10, 128 - var8_ref_p.field_e * 4);
                                    break L3;
                                  } else {
                                    if (-4 != (var12 ^ -1)) {
                                      if (-22 != (var12 ^ -1)) {
                                        L10: {
                                          if (var12 == 4) {
                                            break L10;
                                          } else {
                                            if ((var12 ^ -1) != -9) {
                                              if (-18 != (var12 ^ -1)) {
                                                if ((var12 ^ -1) == -30) {
                                                  break L10;
                                                } else {
                                                  L11: {
                                                    if (-29 == (var12 ^ -1)) {
                                                      break L11;
                                                    } else {
                                                      if ((var12 ^ -1) != -31) {
                                                        if (var12 != 5) {
                                                          if (-8 == (var12 ^ -1)) {
                                                            if (var7 < var15.length) {
                                                              incrementValue$0 = var7;
                                                              var7++;
                                                              var6[incrementValue$0] = var2;
                                                              incrementValue$1 = var7;
                                                              var7++;
                                                              var6[incrementValue$1] = var3;
                                                              incrementValue$2 = var7;
                                                              var7++;
                                                              var6[incrementValue$2] = (int)var8_ref_p.field_c;
                                                              break L3;
                                                            } else {
                                                              break L3;
                                                            }
                                                          } else {
                                                            if (var12 == 24) {
                                                              bn.a(true, var3, var8_ref_p, var2);
                                                              break L3;
                                                            } else {
                                                              if ((var12 ^ -1) == -7) {
                                                                tm.a((byte) 88, var2, var3, var8_ref_p);
                                                                break L3;
                                                              } else {
                                                                if (-38 == (var12 ^ -1)) {
                                                                  am.a(-1, var3, var2, var8_ref_p);
                                                                  break L3;
                                                                } else {
                                                                  L12: {
                                                                    if (10 != var12) {
                                                                      if (-26 != (var12 ^ -1)) {
                                                                        if ((var12 ^ -1) == -12) {
                                                                          ri.a(91, var3, var8_ref_p, var2);
                                                                          break L3;
                                                                        } else {
                                                                          if (var12 == 34) {
                                                                            f.a(var2, var3, var8_ref_p, param0 ^ 11176);
                                                                            break L3;
                                                                          } else {
                                                                            if (33 == var12) {
                                                                              in.a(param0 ^ 11182, var8_ref_p, var3, var2);
                                                                              break L3;
                                                                            } else {
                                                                              if (-13 != (var12 ^ -1)) {
                                                                                if ((var12 ^ -1) == -14) {
                                                                                  ka.a(var2, var8_ref_p, var3, 128);
                                                                                  break L3;
                                                                                } else {
                                                                                  if (-15 != (var12 ^ -1)) {
                                                                                    L13: {
                                                                                      if ((var12 ^ -1) == -23) {
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
                                                                  el.a(var2, var8_ref_p, param0 + -11295, var3);
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          ha.a(var2, param0 ^ -896, var8_ref_p, var3);
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
                                      nm.a(var2, var8_ref_p, var3, param0 ^ 11187);
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
          throw wg.a((Throwable) ((Object) var1), "nj.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        java.net.URL stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (null == bi.field_g) {
                break L1;
              } else {
                if (!bi.field_g.equals(param0.getParameter("settings"))) {
                  var3 = bi.field_g;
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
                if (vh.field_c.equals(param0.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = vh.field_c;
                  break L2;
                }
              }
            }
            if (param1) {
              stackIn_11_0 = ig.a(true, param2, (String) (var3), -1, (String) (var4));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_9_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = var3;

            stackIn_14_1 = new StringBuilder().append("nj.H(");

            if (param0 == null) {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = stackIn_14_0;
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {

              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static gb a(int param0, int param1, boolean param2, boolean param3, int param4) {
        if (param0 <= 66) {
            return (gb) null;
        }
        return bf.a(false, param2, param1, param4, param3, -31);
    }

    final static int a(oc param0, oc param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_e <= param0.field_e) {
                stackIn_3_0 = param0.field_e - param1.field_e;
                break L1;
              } else {
                stackIn_3_0 = param1.field_e - param0.field_e;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_3_0;
              if (param2 == -28835) {
                break L2;
              } else {
                nj.b((byte) -110);
                break L2;
              }
            }
            L3: {
              if (param1.field_g <= param0.field_g) {
                stackIn_8_0 = param0.field_g - param1.field_g;
                break L3;
              } else {
                stackIn_8_0 = -param0.field_g + param1.field_g;
                break L3;
              }
            }
            L4: {
              var4 = stackIn_8_0;
              if (var3_int >= var4) {
                stackIn_11_0 = var3_int;
                break L4;
              } else {
                stackIn_11_0 = var4;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("nj.F(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    abstract void a(int param0, byte[] param1);

    abstract byte[] a(byte param0);

    static {
        field_e = "Hard mode";
        field_b = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_c = new jg();
    }
}
