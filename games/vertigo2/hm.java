/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hm extends ji {
    private int field_E;
    private int[] field_y;
    private int field_D;
    private int field_G;
    static String field_z;
    static int field_F;
    static int[] field_A;
    static int[] field_C;
    static String field_B;
    static String field_H;

    final static byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        ed var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = new ed(param1);
                    var3 = var9.h(-11);
                    if (param0 == -20595) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var4 = var9.b(true);
                    if (0 > var4) {
                        statePc = 6;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (0 == eo.field_j) {
                        statePc = 7;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (var4 <= eo.field_j) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    throw new RuntimeException();
                }
                case 7: {
                    if (0 == var3) {
                        statePc = 21;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    var5_int = var9.b(true);
                    if ((var5_int ^ -1) > -1) {
                        statePc = 12;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    if (eo.field_j == 0) {
                        statePc = 13;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    if (eo.field_j >= var5_int) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    throw new RuntimeException();
                }
                case 13: {
                    var16 = new byte[var5_int];
                    var14 = var16;
                    var12 = var14;
                    var10 = var12;
                    var6 = var10;
                    if (-2 != (var3 ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    int discarded$4 = rj.a(var16, var5_int, param1, var4, 9);
                    statePc = 20;
                    continue stateLoop;
                }
                case 15: {
                    var7 = (Object) (Object) uo.field_g;
                    // monitorenter uo.field_g
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        uo.field_g.a(var9, (byte) 88, var16);
                        // monitorexit var7
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 19: {
                    throw (RuntimeException) (Object) var8;
                }
                case 20: {
                    return var6;
                }
                case 21: {
                    var17 = new byte[var4];
                    var15 = var17;
                    var13 = var15;
                    var11 = var13;
                    var5 = var11;
                    var9.a(0, var17, var4, -124);
                    return var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7, int param8) {
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
        var19 = Vertigo2.field_L ? 1 : 0;
        if (param3 >= 0) {
          if (param1 < oo.field_b) {
            L0: {
              if (param8 >= 0) {
                break L0;
              } else {
                if (param2 >= 0) {
                  break L0;
                } else {
                  if (param4 < 0) {
                    return;
                  } else {
                    break L0;
                  }
                }
              }
            }
            L1: {
              if (oo.field_q > param8) {
                break L1;
              } else {
                if (param2 < oo.field_q) {
                  break L1;
                } else {
                  if (oo.field_q > param4) {
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            }
            L2: {
              if (param5 <= -21) {
                break L2;
              } else {
                hm.a((int[]) null, 56, -5, 126, 17, (byte) -38, -43, 90, -128);
                break L2;
              }
            }
            L3: {
              L4: {
                var14 = -param1 + param3;
                if (param1 == param6) {
                  break L4;
                } else {
                  L5: {
                    L6: {
                      var10 = param8 << 891972368;
                      var9 = param8 << 891972368;
                      var15 = -param1 + param6;
                      var12 = (param4 - param8 << -2103913680) / var14;
                      var11 = (param2 + -param8 << 1400026704) / var15;
                      if (var11 < var12) {
                        break L6;
                      } else {
                        var16 = var11;
                        var11 = var12;
                        var12 = var16;
                        var13 = 1;
                        if (0 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var13 = 0;
                    break L5;
                  }
                  L7: {
                    L8: {
                      if (param1 < 0) {
                        L9: {
                          if (param6 < 0) {
                            break L9;
                          } else {
                            param1 = -param1;
                            var10 = var10 + param1 * var12;
                            var9 = var9 + var11 * param1;
                            param1 = 0;
                            if (0 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        param1 = -param1 + param6;
                        var10 = var10 + var12 * param1;
                        var9 = var9 + param1 * var11;
                        param1 = param6;
                        if (0 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    var16 = oo.field_a[param1];
                    L10: while (true) {
                      if (param6 <= param1) {
                        break L7;
                      } else {
                        L11: {
                          var17 = var9 >> -1639708272;
                          if (oo.field_q > var17) {
                            L12: {
                              var18 = -(var9 >> -2082549616) + (var10 >> 2046561552);
                              if (0 != var18) {
                                break L12;
                              } else {
                                if (0 > var17) {
                                  break L11;
                                } else {
                                  if (var17 >= oo.field_q) {
                                    break L11;
                                  } else {
                                    md.a(32, var17 + var16, param0, var18, param7);
                                    if (0 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                              }
                            }
                            L13: {
                              if (oo.field_q <= var18 + var17) {
                                var18 = -1 + oo.field_q - var17;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            L14: {
                              if (var17 >= 0) {
                                break L14;
                              } else {
                                md.a(-108, var16, param0, var18 - -var17, param7);
                                if (0 == 0) {
                                  break L11;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            md.a(-95, var17 - -var16, param0, var18, param7);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        param1++;
                        if (param1 >= oo.field_b) {
                          return;
                        } else {
                          var16 = var16 + bi.field_e;
                          var10 = var10 + var12;
                          var9 = var9 + var11;
                          if (0 == 0) {
                            continue L10;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L15: {
                    L16: {
                      var16 = -param6 + param3;
                      if (var16 != 0) {
                        break L16;
                      } else {
                        var12 = 0;
                        var11 = 0;
                        if (0 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    L17: {
                      L18: {
                        var17 = param4 << 1244315952;
                        if (var13 == 0) {
                          break L18;
                        } else {
                          var10 = param2 << -1647196880;
                          if (0 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      var9 = param2 << -484696368;
                      break L17;
                    }
                    var11 = (var17 + -var9) / var16;
                    var12 = (var17 - var10) / var16;
                    break L15;
                  }
                  if (0 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              L19: {
                L20: {
                  if (param3 == param1) {
                    break L20;
                  } else {
                    L21: {
                      L22: {
                        var15 = param3 - param6;
                        if (param2 <= param8) {
                          break L22;
                        } else {
                          var12 = (param4 + -param2 << 2041984752) / var15;
                          var9 = param8 << -1918056208;
                          var11 = (-param8 + param4 << 488618448) / var14;
                          var10 = param2 << 2139848272;
                          if (0 == 0) {
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var10 = param8 << -1504917680;
                      var11 = (param4 + -param2 << -929695664) / var15;
                      var9 = param2 << 1698177360;
                      var12 = (param4 - param8 << -397518704) / var14;
                      break L21;
                    }
                    if (0 == 0) {
                      break L19;
                    } else {
                      break L20;
                    }
                  }
                }
                var9 = param8 << 1399225552;
                var10 = param2 << 719751632;
                var11 = 0;
                var12 = 0;
                break L19;
              }
              L23: {
                if (0 > param1) {
                  param1 = Math.min(-param1, -param1 + param6);
                  var10 = var10 + var12 * param1;
                  var9 = var9 + param1 * var11;
                  param1 = 0;
                  break L23;
                } else {
                  break L23;
                }
              }
              var13 = 0;
              break L3;
            }
            L24: {
              if (param1 >= 0) {
                break L24;
              } else {
                param1 = -param1;
                var9 = var9 + param1 * var11;
                var10 = var10 + var12 * param1;
                param1 = 0;
                break L24;
              }
            }
            var15 = oo.field_a[param1];
            L25: while (true) {
              if (param1 < param3) {
                L26: {
                  var16 = var9 >> 739115600;
                  if (oo.field_q > var16) {
                    L27: {
                      var17 = (var10 >> -816378896) - (var9 >> 151179792);
                      if (var17 != 0) {
                        break L27;
                      } else {
                        if (var16 < 0) {
                          break L26;
                        } else {
                          if (var16 >= oo.field_q) {
                            break L26;
                          } else {
                            md.a(-115, var15 + var16, param0, var17, param7);
                            if (0 == 0) {
                              break L26;
                            } else {
                              break L27;
                            }
                          }
                        }
                      }
                    }
                    L28: {
                      if (var17 + var16 < oo.field_q) {
                        break L28;
                      } else {
                        var17 = -var16 + (oo.field_q - 1);
                        break L28;
                      }
                    }
                    L29: {
                      if (var16 >= 0) {
                        break L29;
                      } else {
                        md.a(97, var15, param0, var16 + var17, param7);
                        if (0 == 0) {
                          break L26;
                        } else {
                          break L29;
                        }
                      }
                    }
                    md.a(58, var15 + var16, param0, var17, param7);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                param1++;
                if (param1 >= oo.field_b) {
                  return;
                } else {
                  var15 = var15 + bi.field_e;
                  var9 = var9 + var11;
                  var10 = var10 + var12;
                  if (0 == 0) {
                    continue L25;
                  } else {
                    return;
                  }
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public hm() {
        super(1, true);
        ((hm) this).field_E = 3216;
        ((hm) this).field_G = 3216;
        ((hm) this).field_D = 4096;
        ((hm) this).field_y = new int[3];
    }

    final void a(int param0) {
        this.h(4096);
        if (param0 >= -98) {
            hm.g(40);
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Vertigo2.field_L ? 1 : 0;
          var4 = param1;
          if (var4 != -1) {
            if (-2 == var4) {
              ((hm) this).field_G = param2.a((byte) -11);
              break L0;
            } else {
              if (var4 == 2) {
                ((hm) this).field_E = param2.a((byte) -11);
                break L0;
              } else {
                break L0;
              }
            }
          } else {
            ((hm) this).field_D = param2.a((byte) -11);
            break L0;
          }
        }
        L1: {
          if (param0 == 110) {
            break L1;
          } else {
            ((hm) this).field_y = null;
            break L1;
          }
        }
    }

    final static void g(int param0) {
        String var3 = null;
        if (param0 < 9) {
            Object var2 = null;
            hm.a(-60, -51, 24, 49, (byte) 92, -38, 53, (int[]) null, -113, -61);
        }
        if (null != nr.field_q) {
            var3 = nr.field_q;
            String var1 = var3;
            fh.a(Vertigo2.a(new String[1], ua.field_b, 92), -19615);
            nr.field_q = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int[] param7, int param8, int param9) {
        int[] var17 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = Vertigo2.field_L ? 1 : 0;
        if (param4 < 19) {
            hm.b(false);
        }
        while (true) {
            param3--;
            if (0 > param3) {
                break;
            }
            var17 = param7;
            var10 = var17;
            var11 = param8;
            var12 = param5;
            var13 = param2;
            var14 = param6;
            var15 = var17[var11] >> -937395103 & 8355711;
            var10[var11] = (b.a(33423531, var13) >> 947491625) + ((b.a(var12, 33423360) >> 1734739745) - -b.a(var14 >> -1077133327, 255) + var15);
            param6 = param6 + param0;
            param5 = param5 + param9;
            param8++;
            param2 = param2 + param1;
        }
    }

    final static void d(int param0, int param1) {
        mi var2 = uh.field_Wb;
        var2.j(param1, param0 + 120);
        if (param0 != 0) {
            field_F = -89;
        }
        var2.f(1, -83);
        var2.f(2, 78);
    }

    public static void b(boolean param0) {
        field_z = null;
        field_H = null;
        if (!param0) {
            hm.g(-111);
        }
        field_B = null;
        field_C = null;
        field_A = null;
    }

    final static hq a(int param0, boolean param1) {
        hq var2 = new hq();
        mo.field_h.a((li) (Object) var2, !param1 ? true : false);
        if (!param1) {
            field_C = null;
        }
        hm.d(0, param0);
        return var2;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        L0: {
          var17 = Vertigo2.field_L ? 1 : 0;
          var18 = ((hm) this).field_x.a(param0, (byte) -115);
          var3 = var18;
          if (!((hm) this).field_x.field_i) {
            break L0;
          } else {
            var7 = ((hm) this).field_D * h.field_y >> 2037426060;
            var26 = ((hm) this).a(0, -1, param0 + -1 & fk.field_x);
            var9 = ((hm) this).a(0, -1, param0);
            var25 = ((hm) this).a(0, -1, param0 + 1 & fk.field_x);
            var11 = 0;
            L1: while (true) {
              if (we.field_M <= var11) {
                break L0;
              } else {
                L2: {
                  var12 = (var25[var11] - var26[var11]) * var7 >> 370966988;
                  var13 = (var9[-1 + var11 & rm.field_z] - var9[var11 + 1 & rm.field_z]) * var7 >> 328817452;
                  var14 = var13 >> 1367826372;
                  if (-1 >= (var14 ^ -1)) {
                    break L2;
                  } else {
                    var14 = -var14;
                    break L2;
                  }
                }
                L3: {
                  var15 = var12 >> -1116779836;
                  if (255 < var14) {
                    var14 = 255;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (var15 < 0) {
                    var15 = -var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (-256 > (var15 ^ -1)) {
                    var15 = 255;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var16 = tl.field_b[((1 + var15) * var15 >> -1681425023) + var14] & 255;
                var5 = var12 * var16 >> -1454738904;
                var6 = var16 * 4096 >> 1048619848;
                var4 = var13 * var16 >> -981486488;
                var4 = var4 * ((hm) this).field_y[0] >> -850327764;
                var5 = var5 * ((hm) this).field_y[1] >> -118959028;
                var6 = ((hm) this).field_y[2] * var6 >> -1570076532;
                var18[var11] = var6 + var4 + var5;
                var11++;
                continue L1;
              }
            }
          }
        }
        L6: {
          if (param1 > 91) {
            break L6;
          } else {
            hm.d(-50, 65);
            break L6;
          }
        }
        return var18;
    }

    private final void h(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = Math.cos((double)((float)((hm) this).field_E / 4096.0f));
          ((hm) this).field_y[0] = (int)(var2 * Math.sin((double)((float)((hm) this).field_G / 4096.0f)) * 4096.0);
          ((hm) this).field_y[1] = (int)(Math.cos((double)((float)((hm) this).field_G / 4096.0f)) * var2 * (double)param0);
          ((hm) this).field_y[2] = (int)(Math.sin((double)((float)((hm) this).field_E / 4096.0f)) * 4096.0);
          var4 = ((hm) this).field_y[0] * ((hm) this).field_y[0] >> -202712084;
          var5 = ((hm) this).field_y[1] * ((hm) this).field_y[1] >> 959620972;
          var6 = ((hm) this).field_y[2] * ((hm) this).field_y[2] >> 1332823308;
          var7 = (int)(4096.0 * Math.sqrt((double)(var4 - -var5 + var6 >> -2080235764)));
          if (-1 != (var7 ^ -1)) {
            ((hm) this).field_y[2] = (((hm) this).field_y[2] << 999645772) / var7;
            ((hm) this).field_y[0] = (((hm) this).field_y[0] << -1085812788) / var7;
            ((hm) this).field_y[1] = (((hm) this).field_y[1] << -1436496308) / var7;
            break L0;
          } else {
            break L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Suggest muting this player";
        field_B = "Buying or selling an account";
        field_H = "To Customer Support";
    }
}
