/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

class sh extends mb implements ta {
    private dg field_pb;
    static String field_sb;
    private boolean field_xb;
    private e field_ob;
    private boolean field_vb;
    private boolean field_zb;
    static int field_rb;
    static p field_tb;
    static int[] field_yb;
    private boolean field_wb;
    static hg field_qb;
    static int[] field_ub;

    final void h(boolean param0) {
        if (!((sh) this).field_G) {
            return;
        }
        ((sh) this).field_G = false;
        if (((sh) this).field_vb) {
            ch.a((byte) -127);
        } else {
            if (((sh) this).field_zb) {
                hm.c(0);
            }
        }
        if (!param0) {
            ((sh) this).k(62);
        }
    }

    final static ck a(int param0, String param1) {
        if (cb.field_c != ao.field_Kb) {
          if (param0 == 648093968) {
            L0: {
              if (rg.field_d != cb.field_c) {
                break L0;
              } else {
                if (param1.equals((Object) (Object) ve.field_u)) {
                  cb.field_c = kh.field_e;
                  return de.field_ob;
                } else {
                  break L0;
                }
              }
            }
            cb.field_c = ao.field_Kb;
            de.field_ob = null;
            ve.field_u = param1;
            return null;
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void g(boolean param0) {
        field_yb = null;
        field_sb = null;
        field_tb = null;
        if (!param0) {
            field_qb = null;
        }
        field_qb = null;
        field_ub = null;
    }

    final static int b(int param0, int param1, int param2, int param3) {
        if (!(param2 + param3 > df.field_e)) {
            return param2;
        }
        if (param2 + (param1 + -param3) >= param0) {
            return param1 + param2 + -param3;
        }
        return df.field_e - param3;
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5 = -30 / ((param3 - -75) / 36);
        if (13 == param2) {
            ((sh) this).h(true);
            return true;
        }
        return super.a(param0, param1, param2, -30);
    }

    final static String b(int param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_8_0 = null;
            String stackOut_7_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Virogrid.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = param1.getParameter("cookieprefix");
                            var3 = var9 + "settings";
                            var4 = (String) q.b("getcookies", 6168, param1);
                            var5 = ql.a(var4, (byte) -123, ';');
                            if (param0 < 0) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_tb = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var6 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var6 >= var5.length) {
                                statePc = 12;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var7 = var5[var6].indexOf('=');
                            if (var7 < 0) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (!var5[var6].substring(0, var7).trim().equals((Object) (Object) var3)) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = var5[var6].substring(var7 + 1).trim();
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var6++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2 = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null == rh.field_a) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        return rh.field_a;
                    }
                    case 14: {
                        return param1.getParameter("settings");
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int param1, wg param2, wg param3, int param4, int param5) {
        bj.field_j = param4;
        qg.field_l = param2;
        oh.field_d = param1;
        ul.field_g = param3;
        if (param0 != -40) {
            sh.g(true);
        }
        eh.field_d = param5;
    }

    final static int a(int param0, int param1) {
        if (param0 != 4712) {
            Object var3 = null;
            String discarded$0 = sh.b(76, (java.applet.Applet) null);
        }
        return ak.a(param1, (byte) -74, wa.field_M);
    }

    public void a(int param0, tg param1, int param2, int param3, int param4) {
        if (!((sh) this).field_xb) {
            pi.a("tochangedisplayname.ws", -17713, mb.g((byte) 75));
        } else {
            kf.a(3, -1);
            ((sh) this).h(true);
        }
        if (param0 != 12085) {
            field_yb = null;
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        L0: {
          var42 = Virogrid.field_F ? 1 : 0;
          if (param16 > param7) {
            break L0;
          } else {
            if (fk.field_n <= param15) {
              break L0;
            } else {
              L1: {
                if (param4 >= 0) {
                  break L1;
                } else {
                  if (param2 >= 0) {
                    break L1;
                  } else {
                    if (param8 < 0) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (param4 < fk.field_o) {
                  break L2;
                } else {
                  if (param2 < fk.field_o) {
                    break L2;
                  } else {
                    if (fk.field_o > param8) {
                      break L2;
                    } else {
                      return;
                    }
                  }
                }
              }
              L3: {
                L4: {
                  var34 = param7 - param15;
                  if (param14 != param15) {
                    break L4;
                  } else {
                    L5: {
                      L6: {
                        if (param7 == param15) {
                          break L6;
                        } else {
                          L7: {
                            L8: {
                              var35 = -param14 + param7;
                              if (param4 < param2) {
                                break L8;
                              } else {
                                var23 = (param10 - param12 << -1402105936) / var35;
                                var20 = (param8 - param4 << 267160560) / var34;
                                var29 = param9 << -1043954832;
                                var28 = (-param1 + param13 << 737123088) / var34;
                                var21 = param12 << 687686800;
                                var30 = param3 << 828547920;
                                var26 = param1 << 654451312;
                                var24 = (-param11 + param10 << -912285584) / var34;
                                var22 = param11 << -651299888;
                                var32 = (param5 - param3 << -1763151440) / var34;
                                var25 = param6 << -1033989328;
                                var17 = param2 << -877377712;
                                var18 = param4 << 955944880;
                                var19 = (-param2 + param8 << 754030352) / var35;
                                var27 = (param13 + -param6 << 589442160) / var35;
                                var31 = (param5 - param9 << 648093968) / var35;
                                if (0 == 0) {
                                  break L7;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            var29 = param3 << 1683189744;
                            var17 = param4 << -1821274576;
                            var25 = param1 << 459348496;
                            var28 = (param13 - param6 << -1294380272) / var35;
                            var27 = (-param1 + param13 << 1960526160) / var34;
                            var31 = (param5 + -param3 << 292112560) / var34;
                            var20 = (param8 - param2 << -2068044944) / var35;
                            var24 = (param10 + -param12 << 1791900048) / var35;
                            var23 = (param10 + -param11 << 2051038064) / var34;
                            var30 = param9 << -1629216240;
                            var22 = param12 << -1832851184;
                            var19 = (param8 - param4 << 1195274480) / var34;
                            var32 = (param5 - param9 << 665325776) / var35;
                            var26 = param6 << -1999367952;
                            var21 = param11 << -1958505424;
                            var18 = param2 << 2007369200;
                            break L7;
                          }
                          if (0 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var17 = param4 << 131164176;
                      var32 = 0;
                      var23 = 0;
                      var25 = param1;
                      var22 = param12;
                      var29 = param3;
                      var21 = param11;
                      var20 = 0;
                      var28 = 0;
                      var30 = param9;
                      var31 = 0;
                      var19 = 0;
                      var27 = 0;
                      var18 = param2 << 949186096;
                      var24 = 0;
                      var26 = param6;
                      break L5;
                    }
                    L9: {
                      if (param15 >= 0) {
                        break L9;
                      } else {
                        param15 = Math.min(-param15, -param15 + param14);
                        var17 = var17 + param15 * var19;
                        var29 = var29 + param15 * var31;
                        var21 = var21 + var23 * param15;
                        var25 = var25 + param15 * var27;
                        var30 = var30 + var32 * param15;
                        var26 = var26 + param15 * var28;
                        var22 = var22 + param15 * var24;
                        var18 = var18 + var20 * param15;
                        param15 = 0;
                        break L9;
                      }
                    }
                    var33 = 0;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  L11: {
                    var18 = param4 << -261848176;
                    var17 = param4 << -261848176;
                    var30 = param3 << -1748164336;
                    var29 = param3 << -1748164336;
                    var26 = param1 << 498714736;
                    var25 = param1 << 498714736;
                    var22 = param11 << -634592784;
                    var21 = param11 << -634592784;
                    var35 = -param15 + param14;
                    var19 = (-param4 + param2 << -362346896) / var35;
                    var20 = (-param4 + param8 << 1812858832) / var34;
                    if (var19 >= var20) {
                      break L11;
                    } else {
                      var27 = (-param1 + param6 << 197863344) / var35;
                      var31 = (param9 + -param3 << 1115304048) / var35;
                      var23 = (-param11 + param12 << -1890314960) / var35;
                      var32 = (-param3 + param5 << -1144333008) / var34;
                      var28 = (-param1 + param13 << -2110090672) / var34;
                      var24 = (param10 + -param11 << 733908624) / var34;
                      var33 = 0;
                      if (0 == 0) {
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var36 = var19;
                  var19 = var20;
                  var20 = var36;
                  var27 = (param13 + -param1 << 1010814320) / var34;
                  var24 = (param12 + -param11 << -1640389168) / var35;
                  var31 = (-param3 + param5 << -102522960) / var34;
                  var23 = (-param11 + param10 << 1254784048) / var34;
                  var28 = (-param1 + param6 << 1971190448) / var35;
                  var33 = 1;
                  var32 = (param9 - param3 << -1577974512) / var35;
                  break L10;
                }
                L12: {
                  L13: {
                    if (param15 < 0) {
                      L14: {
                        if (param14 >= 0) {
                          break L14;
                        } else {
                          param15 = param14 + -param15;
                          var25 = var25 + var27 * param15;
                          var30 = var30 + var32 * param15;
                          var21 = var21 + param15 * var23;
                          var29 = var29 + var31 * param15;
                          var17 = var17 + param15 * var19;
                          var18 = var18 + param15 * var20;
                          var22 = var22 + var24 * param15;
                          var26 = var26 + param15 * var28;
                          param15 = param14;
                          if (0 == 0) {
                            break L12;
                          } else {
                            break L14;
                          }
                        }
                      }
                      param15 = -param15;
                      var29 = var29 + var31 * param15;
                      var21 = var21 + param15 * var23;
                      var17 = var17 + var19 * param15;
                      var25 = var25 + param15 * var27;
                      var26 = var26 + param15 * var28;
                      var30 = var30 + var32 * param15;
                      var18 = var18 + var20 * param15;
                      var22 = var22 + param15 * var24;
                      param15 = 0;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var36 = fk.field_m[param15];
                  L15: while (true) {
                    if (param14 <= param15) {
                      break L12;
                    } else {
                      L16: {
                        var37 = var17 >> -479267600;
                        if ((fk.field_o ^ -1) >= (var37 ^ -1)) {
                          break L16;
                        } else {
                          L17: {
                            var38 = -(var17 >> 533700048) + (var18 >> -1232356784);
                            if (0 == var38) {
                              break L17;
                            } else {
                              L18: {
                                var39 = (var22 - var21) / var38;
                                var40 = (-var25 + var26) / var38;
                                var41 = (-var29 + var30) / var38;
                                if (fk.field_o <= var38 + var37) {
                                  var38 = -var37 + fk.field_o + -1;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                              L19: {
                                L20: {
                                  if (0 > var37) {
                                    break L20;
                                  } else {
                                    sn.a(var40, var29, var41, var38, var25, (byte) -104, var37 + var36, param0, var39, var21);
                                    if (0 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                sn.a(var40, var29 - var37 * var41, var41, var37 + var38, -(var40 * var37) + var25, (byte) 91, var36, param0, var39, -(var39 * var37) + var21);
                                break L19;
                              }
                              if (0 == 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (var37 < 0) {
                            break L16;
                          } else {
                            if (var37 < fk.field_o) {
                              sn.a(0, var29, 0, var38, var25, (byte) -80, var37 + var36, param0, 0, var21);
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        }
                      }
                      param15++;
                      if (fk.field_n > param15) {
                        var29 = var29 + var31;
                        var26 = var26 + var28;
                        var30 = var30 + var32;
                        var22 = var22 + var24;
                        var18 = var18 + var20;
                        var25 = var25 + var27;
                        var36 = var36 + df.field_e;
                        var21 = var21 + var23;
                        var17 = var17 + var19;
                        if (0 == 0) {
                          continue L15;
                        } else {
                          break L12;
                        }
                      } else {
                        return;
                      }
                    }
                  }
                }
                L21: {
                  var36 = param7 + -param14;
                  if (0 == var36) {
                    break L21;
                  } else {
                    L22: {
                      L23: {
                        var37 = param8 << -446319344;
                        var38 = param10 << -411281968;
                        var39 = param13 << 1337172048;
                        if (var33 == 0) {
                          break L23;
                        } else {
                          var22 = param12 << 1019193232;
                          var18 = param2 << 143087440;
                          var30 = param9 << 1457907344;
                          var26 = param6 << -2070989072;
                          if (0 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var17 = param2 << 9993040;
                      var29 = param9 << -1258625264;
                      var21 = param12 << 1429507664;
                      var25 = param6 << -981863888;
                      break L22;
                    }
                    var40 = param5 << -1294217808;
                    var27 = (-var25 + var39) / var36;
                    var20 = (var37 - var18) / var36;
                    var19 = (-var17 + var37) / var36;
                    var28 = (var39 + -var26) / var36;
                    var31 = (var40 + -var29) / var36;
                    var23 = (-var21 + var38) / var36;
                    var24 = (var38 + -var22) / var36;
                    var32 = (var40 + -var30) / var36;
                    if (0 == 0) {
                      break L3;
                    } else {
                      break L21;
                    }
                  }
                }
                var27 = 0;
                var20 = 0;
                var31 = 0;
                var19 = 0;
                var32 = 0;
                var28 = 0;
                var24 = 0;
                var23 = 0;
                break L3;
              }
              L24: {
                if (param15 >= 0) {
                  break L24;
                } else {
                  param15 = -param15;
                  var30 = var30 + var32 * param15;
                  var29 = var29 + var31 * param15;
                  var21 = var21 + param15 * var23;
                  var26 = var26 + var28 * param15;
                  var25 = var25 + var27 * param15;
                  var17 = var17 + var19 * param15;
                  var18 = var18 + var20 * param15;
                  var22 = var22 + var24 * param15;
                  param15 = 0;
                  break L24;
                }
              }
              L25: {
                var35 = fk.field_m[param15];
                if (param15 >= param7) {
                  break L25;
                } else {
                  L26: {
                    var36 = var17 >> -937916848;
                    if (fk.field_o <= var36) {
                      break L26;
                    } else {
                      var37 = (var18 >> -1745263696) + -(var17 >> 494277584);
                      if (var37 == 0) {
                        if (0 > var36) {
                          break L26;
                        } else {
                          if (var36 >= fk.field_o) {
                            break L26;
                          } else {
                            sn.a(0, var29, 0, var37, var25, (byte) 53, var35 + var36, param0, 0, var21);
                            break L26;
                          }
                        }
                      } else {
                        if (0 > var36) {
                          break L26;
                        } else {
                          if (var36 >= fk.field_o) {
                            break L26;
                          } else {
                            sn.a(0, var29, 0, var37, var25, (byte) 53, var35 + var36, param0, 0, var21);
                            break L26;
                          }
                        }
                      }
                    }
                  }
                  param15++;
                  if (fk.field_n > param15) {
                    var26 = var26 + var28;
                    var18 = var18 + var20;
                    var21 = var21 + var23;
                    var29 = var29 + var31;
                    var30 = var30 + var32;
                    var17 = var17 + var19;
                    var25 = var25 + var27;
                    var22 = var22 + var24;
                    var35 = var35 + df.field_e;
                    break L25;
                  } else {
                    return;
                  }
                }
              }
              return;
            }
          }
        }
    }

    sh(je param0, e param1, String param2, boolean param3, boolean param4) {
        super(param0, (fi) (Object) new sf((sh) null, param1, param2), 77, 10, 10);
        ((sh) this).field_vb = param3 ? true : false;
        ((sh) this).field_ob = param1;
        ((sh) this).field_zb = param4 ? true : false;
        ((sh) this).field_wb = false;
        ((sh) this).field_xb = false;
        ((sh) this).field_pb = new dg(13, 50, 274, 30, 15, 2113632, 4210752);
        ((sh) this).field_pb.field_z = true;
        ((sh) this).a((fi) (Object) ((sh) this).field_pb, (byte) -78);
    }

    final void a(int param0, boolean param1, String param2) {
        int var5 = 0;
        sf var6 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        sf stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        sf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        sf stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        String stackIn_15_2 = null;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        sf stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        sf stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        String stackOut_14_2 = null;
        sf stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        String stackOut_13_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        if (((sh) this).field_wb) {
          return;
        } else {
          L0: {
            stackOut_3_0 = this;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param1) {
              stackOut_5_0 = this;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = this;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            ((sh) this).field_wb = stackIn_6_1 != 0;
            stackOut_6_0 = this;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if ((param0 ^ -1) != -257) {
              stackOut_8_0 = this;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            } else {
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
          }
          L2: {
            ((sh) this).field_xb = stackIn_9_1 != 0;
            ((sh) this).field_pb.d(4210752, 8405024, 118);
            var6 = new sf((sh) this, ((sh) this).field_ob, param2);
            if ((param0 ^ -1) == -6) {
              var6.a(11, rn.field_g, (byte) 126);
              var6.a(17, og.field_k, (byte) 127);
              break L2;
            } else {
              if (param0 != 256) {
                L3: {
                  stackOut_12_0 = (sf) var6;
                  stackOut_12_1 = -1;
                  stackIn_14_0 = stackOut_12_0;
                  stackIn_14_1 = stackOut_12_1;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  if (!((sh) this).field_vb) {
                    stackOut_14_0 = (sf) (Object) stackIn_14_0;
                    stackOut_14_1 = stackIn_14_1;
                    stackOut_14_2 = jl.field_D;
                    stackIn_15_0 = stackOut_14_0;
                    stackIn_15_1 = stackOut_14_1;
                    stackIn_15_2 = stackOut_14_2;
                    break L3;
                  } else {
                    stackOut_13_0 = (sf) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = tn.field_e;
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_15_1 = stackOut_13_1;
                    stackIn_15_2 = stackOut_13_2;
                    break L3;
                  }
                }
                ((sf) (Object) stackIn_15_0).a(stackIn_15_1, stackIn_15_2, (byte) 126);
                break L2;
              } else {
                tg discarded$29 = var6.a((cd) this, 260, tn.field_e);
                break L2;
              }
            }
          }
          L4: {
            if (-4 != (param0 ^ -1)) {
              if (param0 != 4) {
                if (6 == param0) {
                  var6.a(9, o.field_f, (byte) 126);
                  break L4;
                } else {
                  if (param0 != 9) {
                    break L4;
                  } else {
                    tg discarded$30 = var6.a((cd) this, 260, ve.field_n);
                    break L4;
                  }
                }
              } else {
                var6.a(8, mn.field_b, (byte) 127);
                break L4;
              }
            } else {
              var6.a(7, qh.field_N, (byte) 127);
              break L4;
            }
          }
          ((sh) this).b((fi) (Object) var6, (byte) -53);
          return;
        }
    }

    final static void a(byte param0, int param1) {
        hg var2 = gk.field_g;
        var2.g(param1, 8);
        var2.a(2, -66);
        if (param0 != -112) {
            return;
        }
        var2.a(4, -95);
        var2.a(nl.b(4), -75);
    }

    final void k(int param0) {
        ((sh) this).field_pb.d(4210752, 2121792, 122);
        sf var2 = new sf((sh) this, ((sh) this).field_ob, nd.field_h);
        if (param0 <= 115) {
            ((sh) this).field_vb = true;
        }
        var2.a(15, cj.field_f, (byte) 126);
        ((sh) this).b((fi) (Object) var2, (byte) -53);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = "Name is available";
        field_tb = new p();
        field_yb = new int[]{6000, 4500, 3000, 2250, 1500, 1000, 500};
    }
}
