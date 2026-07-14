/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u {
    static double field_b;
    static int field_a;

    final static boolean a(int param0) {
        RuntimeException var1 = null;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 >= 72) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        u.a(-96, 16, 11, false, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -65, (int[]) null, (int[]) null, -114, 112, (int[]) null, (byte[]) null, (int[]) null, (int[]) null, 52, (int[]) null, -56, (int[]) null, (eg) null, 52, (int[]) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (-251 <= (im.field_fc ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 1;
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var1, "u.C(" + param0 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, boolean param3, int[] param4, int[] param5, int[] param6, int[] param7, int param8, int[] param9, int[] param10, int param11, int param12, int[] param13, byte[] param14, int[] param15, int[] param16, int param17, int[] param18, int param19, int[] param20, eg param21, int param22, int[] param23) {
        int var24_int = 0;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
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
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        int[] var54 = null;
        int var55 = 0;
        int var56 = 0;
        int var57 = 0;
        int var58 = 0;
        int var59 = 0;
        int var60 = 0;
        int var61 = 0;
        int var62 = 0;
        int var63 = 0;
        int var64 = 0;
        int var65 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_197_0 = 0;
        int stackIn_197_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_196_1 = 0;
        L0: {
          L1: {
            var65 = Pool.field_O;
            if (wh.field_j == null) {
              break L1;
            } else {
              if ((wh.field_j.length ^ -1) > (param22 ^ -1)) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          var24_int = 100 + param22;
          va.field_T = new int[var24_int];
          wh.field_j = new int[var24_int];
          break L0;
        }
        L2: {
          L3: {
            if (null == hr.field_n) {
              break L3;
            } else {
              if (param12 * 2 > hr.field_n.length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          var24_int = 100 + param12 * 2;
          gr.field_B = new int[var24_int];
          hr.field_n = new int[var24_int];
          break L2;
        }
        L4: {
          var24 = wh.field_j;
          if (cd.field_d != null) {
            break L4;
          } else {
            cd.field_d = new int[16];
            break L4;
          }
        }
        L5: {
          var25 = va.field_T;
          var26 = cd.field_d;
          if (param3) {
            break L5;
          } else {
            vh discarded$1 = u.a((byte) 100, -4, 66, true, 88);
            break L5;
          }
        }
        L6: {
          L7: {
            var27 = hr.field_n;
            nk.field_a = 0;
            uf.field_W = 0;
            de.field_a = 0;
            var28 = gr.field_B;
            eq.field_R = 0;
            if (qp.field_Yb == null) {
              break L7;
            } else {
              if ((qp.field_Yb.length ^ -1) <= (param22 ^ -1)) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          sa.field_r = new int[100 + param22];
          qp.field_Yb = new int[param22 - -100];
          ro.field_d = new int[100 + param22];
          break L6;
        }
        L8: {
          L9: {
            if (null == hi.field_k) {
              break L9;
            } else {
              if ((param12 ^ -1) >= (hi.field_k.length ^ -1)) {
                break L8;
              } else {
                break L9;
              }
            }
          }
          nr.field_P = new int[100 + param12];
          hi.field_k = new int[100 + param12];
          vn.field_h = new int[param12 + 100];
          break L8;
        }
        L10: {
          if (param5 == null) {
            break L10;
          } else {
            L11: {
              if (null == gp.field_e) {
                break L11;
              } else {
                if (gp.field_e.length >= param12) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            gp.field_e = new int[param12 - -100];
            hf.field_d = new int[param12 + 100];
            te.field_o = new int[100 + param12];
            break L10;
          }
        }
        L12: {
          L13: {
            if (null == eh.field_w) {
              break L13;
            } else {
              if (eh.field_w.length >= param22) {
                break L12;
              } else {
                break L13;
              }
            }
          }
          mj.field_a = new int[param22 - -100];
          sa.field_w = new int[param22 + 100];
          eh.field_w = new int[param22 - -100];
          break L12;
        }
        L14: {
          L15: {
            if (wn.field_d == null) {
              break L15;
            } else {
              if (wn.field_d.length >= param12) {
                break L14;
              } else {
                break L15;
              }
            }
          }
          nk.field_b = new int[100 + param12];
          wn.field_d = new int[param12 - -100];
          f.field_b = new int[param12 - -100];
          break L14;
        }
        L16: {
          if (param5 == null) {
            break L16;
          } else {
            L17: {
              if (la.field_d == null) {
                break L17;
              } else {
                if (la.field_d.length >= param12) {
                  break L16;
                } else {
                  break L17;
                }
              }
            }
            sl.field_V = new int[param12 + 100];
            la.field_d = new int[100 + param12];
            rb.field_b = new int[param12 + 100];
            break L16;
          }
        }
        var29 = 0;
        var30 = 0;
        var31 = 0;
        var33 = 0;
        L18: while (true) {
          L19: {
            if ((param22 ^ -1) >= (var33 ^ -1)) {
              break L19;
            } else {
              var24[var33] = -1;
              var33++;
              if (var65 == 0) {
                continue L18;
              } else {
                break L19;
              }
            }
          }
          var32 = 0;
          var33 = 0;
          L20: while (true) {
            L21: {
              if ((var33 ^ -1) <= (param22 ^ -1)) {
                break L21;
              } else {
                var25[var33] = -1;
                var33++;
                if (var65 == 0) {
                  continue L20;
                } else {
                  break L21;
                }
              }
            }
            var35 = 0;
            var36 = 0;
            var37 = 0;
            var38 = 0;
            L22: while (true) {
              L23: {
                L24: {
                  if (var38 >= param12) {
                    break L24;
                  } else {
                    var39 = param7[var38];
                    var40 = param18[var38];
                    var41 = param15[var38];
                    var42 = param6[var39];
                    var43 = param13[var39];
                    var44 = param10[var39];
                    var45 = param6[var40];
                    var46 = param13[var40];
                    var47 = param10[var40];
                    var48 = param6[var41];
                    var49 = param13[var41];
                    var50 = param10[var41];
                    var51 = (var44 + -param1) * param17 + (param8 * (-param0 + var43) + (var42 - param11) * param2);
                    var52 = param2 * (-param11 + var45) + ((-param0 + var46) * param8 + param17 * (-param1 + var47));
                    var53 = (-param1 + var50) * param17 + (-param0 + var49) * param8 + param2 * (var48 + -param11);
                    stackOut_50_0 = (var53 | (var51 | var52)) ^ -1;
                    stackOut_50_1 = -1;
                    stackIn_197_0 = stackOut_50_0;
                    stackIn_197_1 = stackOut_50_1;
                    stackIn_51_0 = stackOut_50_0;
                    stackIn_51_1 = stackOut_50_1;
                    if (var65 != 0) {
                      break L23;
                    } else {
                      L25: {
                        L26: {
                          if (stackIn_51_0 <= stackIn_51_1) {
                            break L26;
                          } else {
                            L27: {
                              if ((-var53 | (-var52 | -var51)) >= 0) {
                                break L27;
                              } else {
                                L28: {
                                  if (4 + var29 + param22 > qp.field_Yb.length) {
                                    var54 = new int[var29 + (param22 + 104)];
                                    qn.a(qp.field_Yb, 0, var54, 0, nk.field_a);
                                    qp.field_Yb = var54;
                                    var54 = new int[104 + param22 + var29];
                                    qn.a(sa.field_r, 0, var54, 0, nk.field_a);
                                    sa.field_r = var54;
                                    var54 = new int[param22 - (-var29 + -104)];
                                    qn.a(ro.field_d, 0, var54, 0, nk.field_a);
                                    ro.field_d = var54;
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                L29: {
                                  if ((4 + (var31 + param22) ^ -1) < (eh.field_w.length ^ -1)) {
                                    var54 = new int[104 + (var31 + param22)];
                                    qn.a(eh.field_w, 0, var54, 0, de.field_a);
                                    eh.field_w = var54;
                                    var54 = new int[var31 + (param22 + 104)];
                                    qn.a(mj.field_a, 0, var54, 0, de.field_a);
                                    mj.field_a = var54;
                                    var54 = new int[var31 + param22 - -104];
                                    qn.a(sa.field_w, 0, var54, 0, de.field_a);
                                    sa.field_w = var54;
                                    break L29;
                                  } else {
                                    break L29;
                                  }
                                }
                                L30: {
                                  L31: {
                                    var55 = nk.field_a;
                                    var56 = de.field_a;
                                    var57 = 0;
                                    var58 = 0;
                                    if (null != param14) {
                                      break L31;
                                    } else {
                                      L32: {
                                        if (null == param20) {
                                          break L32;
                                        } else {
                                          L33: {
                                            L34: {
                                              if (0 == (param20[var38] ^ -1)) {
                                                break L34;
                                              } else {
                                                if (param20[var38] == -2) {
                                                  break L34;
                                                } else {
                                                  stackOut_69_0 = 1;
                                                  stackIn_71_0 = stackOut_69_0;
                                                  break L33;
                                                }
                                              }
                                            }
                                            stackOut_70_0 = 0;
                                            stackIn_71_0 = stackOut_70_0;
                                            break L33;
                                          }
                                          var64 = stackIn_71_0;
                                          if (var65 == 0) {
                                            break L30;
                                          } else {
                                            break L32;
                                          }
                                        }
                                      }
                                      var64 = 1;
                                      if (var65 == 0) {
                                        break L30;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                  L35: {
                                    if (-1 != (1 & param14[var38] ^ -1)) {
                                      stackOut_76_0 = 0;
                                      stackIn_77_0 = stackOut_76_0;
                                      break L35;
                                    } else {
                                      stackOut_75_0 = 1;
                                      stackIn_77_0 = stackOut_75_0;
                                      break L35;
                                    }
                                  }
                                  var64 = stackIn_77_0;
                                  break L30;
                                }
                                L36: {
                                  if (null != param5) {
                                    L37: {
                                      if (var64 == 0) {
                                        break L37;
                                      } else {
                                        var37 = 65535 & param20[var38];
                                        var36 = param23[var38] & 65535;
                                        var35 = 65535 & param5[var38];
                                        if (var65 == 0) {
                                          break L36;
                                        } else {
                                          break L37;
                                        }
                                      }
                                    }
                                    var37 = param20[var38];
                                    var35 = param5[var38];
                                    var36 = param23[var38];
                                    break L36;
                                  } else {
                                    break L36;
                                  }
                                }
                                L38: {
                                  if (-1 >= (var51 ^ -1)) {
                                    L39: {
                                      var34 = var24[var39];
                                      if ((var34 ^ -1) > -1) {
                                        var55++;
                                        var34 = var55;
                                        var24[var39] = var55;
                                        qp.field_Yb[var34] = var42;
                                        sa.field_r[var34] = var43;
                                        ro.field_d[var34] = var44;
                                        break L39;
                                      } else {
                                        break L39;
                                      }
                                    }
                                    var26[var57 + 0] = var34;
                                    var26[var57 + 8] = var35;
                                    var57++;
                                    break L38;
                                  } else {
                                    break L38;
                                  }
                                }
                                L40: {
                                  if (-1 <= (var51 ^ -1)) {
                                    L41: {
                                      var34 = var25[var39];
                                      if (-1 >= (var34 ^ -1)) {
                                        break L41;
                                      } else {
                                        var56++;
                                        var34 = var56;
                                        var25[var39] = var56;
                                        eh.field_w[var34] = var42;
                                        mj.field_a[var34] = var43;
                                        sa.field_w[var34] = var44;
                                        break L41;
                                      }
                                    }
                                    var26[4 + var58] = var34;
                                    var26[12 - -var58] = var35;
                                    var58++;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                L42: {
                                  if (-1 == (var51 ^ -1)) {
                                    break L42;
                                  } else {
                                    if (-1 == (var52 ^ -1)) {
                                      break L42;
                                    } else {
                                      if (0 > (var52 ^ var51)) {
                                        var63 = -var51 + var52;
                                        var59 = (-(var51 * var45) + var52 * var42) / var63;
                                        var60 = (-(var51 * var46) + var52 * var43) / var63;
                                        var55++;
                                        var34 = var55;
                                        var61 = (-(var47 * var51) + var44 * var52) / var63;
                                        var62 = (-(var51 * var36) + var52 * var35) / var63;
                                        qp.field_Yb[var34] = var59;
                                        sa.field_r[var34] = var60;
                                        ro.field_d[var34] = var61;
                                        var26[var57 + 0] = var34;
                                        var26[var57 + 8] = var62;
                                        var57++;
                                        var56++;
                                        var34 = var56;
                                        eh.field_w[var34] = var59;
                                        mj.field_a[var34] = var60;
                                        sa.field_w[var34] = var61;
                                        var26[4 + var58] = var34;
                                        var26[12 - -var58] = var62;
                                        var58++;
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  }
                                }
                                L43: {
                                  if ((var52 ^ -1) > -1) {
                                    break L43;
                                  } else {
                                    L44: {
                                      var34 = var24[var40];
                                      if (var34 >= 0) {
                                        break L44;
                                      } else {
                                        var55++;
                                        var34 = var55;
                                        var24[var40] = var55;
                                        qp.field_Yb[var34] = var45;
                                        sa.field_r[var34] = var46;
                                        ro.field_d[var34] = var47;
                                        break L44;
                                      }
                                    }
                                    var26[var57 + 0] = var34;
                                    var26[8 + var57] = var36;
                                    var57++;
                                    break L43;
                                  }
                                }
                                L45: {
                                  if ((var52 ^ -1) < -1) {
                                    break L45;
                                  } else {
                                    L46: {
                                      var34 = var25[var40];
                                      if ((var34 ^ -1) > -1) {
                                        var56++;
                                        var34 = var56;
                                        var25[var40] = var56;
                                        eh.field_w[var34] = var45;
                                        mj.field_a[var34] = var46;
                                        sa.field_w[var34] = var47;
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                    var26[4 - -var58] = var34;
                                    var26[var58 + 12] = var36;
                                    var58++;
                                    break L45;
                                  }
                                }
                                L47: {
                                  if (-1 == (var52 ^ -1)) {
                                    break L47;
                                  } else {
                                    if ((var53 ^ -1) == -1) {
                                      break L47;
                                    } else {
                                      if ((var53 ^ var52) < 0) {
                                        var63 = -var52 + var53;
                                        var61 = (-(var52 * var50) + var53 * var47) / var63;
                                        var60 = (-(var49 * var52) + var53 * var46) / var63;
                                        var55++;
                                        var34 = var55;
                                        var62 = (var53 * var36 + -(var52 * var37)) / var63;
                                        var59 = (var53 * var45 + -(var48 * var52)) / var63;
                                        qp.field_Yb[var34] = var59;
                                        sa.field_r[var34] = var60;
                                        ro.field_d[var34] = var61;
                                        var26[0 + var57] = var34;
                                        var26[var57 + 8] = var62;
                                        var56++;
                                        var34 = var56;
                                        var57++;
                                        eh.field_w[var34] = var59;
                                        mj.field_a[var34] = var60;
                                        sa.field_w[var34] = var61;
                                        var26[4 + var58] = var34;
                                        var26[var58 + 12] = var62;
                                        var58++;
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                }
                                L48: {
                                  if (0 > var53) {
                                    break L48;
                                  } else {
                                    L49: {
                                      var34 = var24[var41];
                                      if (0 <= var34) {
                                        break L49;
                                      } else {
                                        var55++;
                                        var34 = var55;
                                        var24[var41] = var55;
                                        qp.field_Yb[var34] = var48;
                                        sa.field_r[var34] = var49;
                                        ro.field_d[var34] = var50;
                                        break L49;
                                      }
                                    }
                                    var26[var57 + 0] = var34;
                                    var26[8 + var57] = var37;
                                    var57++;
                                    break L48;
                                  }
                                }
                                L50: {
                                  if ((var53 ^ -1) < -1) {
                                    break L50;
                                  } else {
                                    L51: {
                                      var34 = var25[var41];
                                      if (0 > var34) {
                                        var56++;
                                        var34 = var56;
                                        var25[var41] = var56;
                                        eh.field_w[var34] = var48;
                                        mj.field_a[var34] = var49;
                                        sa.field_w[var34] = var50;
                                        break L51;
                                      } else {
                                        break L51;
                                      }
                                    }
                                    var26[4 - -var58] = var34;
                                    var26[12 - -var58] = var37;
                                    var58++;
                                    break L50;
                                  }
                                }
                                L52: {
                                  if (-1 == ((var51 | var53) ^ -1)) {
                                    break L52;
                                  } else {
                                    if ((var53 ^ var51 ^ -1) > -1) {
                                      var63 = var51 - var53;
                                      var59 = (-(var42 * var53) + var48 * var51) / var63;
                                      var61 = (-(var44 * var53) + var50 * var51) / var63;
                                      var55++;
                                      var34 = var55;
                                      var62 = (var37 * var51 - var53 * var35) / var63;
                                      var60 = (-(var53 * var43) + var51 * var49) / var63;
                                      qp.field_Yb[var34] = var59;
                                      sa.field_r[var34] = var60;
                                      ro.field_d[var34] = var61;
                                      var26[0 + var57] = var34;
                                      var26[8 - -var57] = var62;
                                      var57++;
                                      var56++;
                                      var34 = var56;
                                      eh.field_w[var34] = var59;
                                      mj.field_a[var34] = var60;
                                      sa.field_w[var34] = var61;
                                      var26[4 + var58] = var34;
                                      var26[var58 + 12] = var62;
                                      var58++;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                L53: {
                                  var29 = var29 + (var55 + -nk.field_a);
                                  var33 = uf.field_W;
                                  nk.field_a = var55;
                                  if ((hi.field_k.length ^ -1) <= (-2 + (var30 + param12 - -var57) ^ -1)) {
                                    break L53;
                                  } else {
                                    var54 = new int[98 + param12 - (-var30 - var57)];
                                    qn.a(hi.field_k, 0, var54, 0, var33);
                                    hi.field_k = var54;
                                    var54 = new int[var57 + (var30 + param12 - -98)];
                                    qn.a(vn.field_h, 0, var54, 0, var33);
                                    vn.field_h = var54;
                                    var54 = new int[98 + (var30 + param12) - -var57];
                                    qn.a(nr.field_P, 0, var54, 0, var33);
                                    nr.field_P = var54;
                                    if (null != param5) {
                                      var54 = new int[param12 + var30 + var57 + 98];
                                      qn.a(gp.field_e, 0, var54, 0, var33);
                                      gp.field_e = var54;
                                      var54 = new int[var57 + (var30 + param12 - -98)];
                                      qn.a(te.field_o, 0, var54, 0, var33);
                                      te.field_o = var54;
                                      var54 = new int[var57 + (var30 + param12) + 98];
                                      qn.a(hf.field_d, 0, var54, 0, var33);
                                      hf.field_d = var54;
                                      break L53;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L54: {
                                  hi.field_k[var33] = var26[0];
                                  vn.field_h[var33] = var26[1];
                                  nr.field_P[var33] = var26[2];
                                  if (null != param5) {
                                    L55: {
                                      if (var64 == 0) {
                                        break L55;
                                      } else {
                                        gp.field_e[var33] = var26[8];
                                        te.field_o[var33] = var26[9];
                                        hf.field_d[var33] = var26[10];
                                        if (var65 == 0) {
                                          break L54;
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                    gp.field_e[var33] = var35;
                                    hf.field_d[var33] = var37;
                                    break L54;
                                  } else {
                                    break L54;
                                  }
                                }
                                L56: {
                                  var33++;
                                  var27[var33] = var38;
                                  if (4 != var57) {
                                    break L56;
                                  } else {
                                    L57: {
                                      hi.field_k[var33] = var26[2];
                                      vn.field_h[var33] = var26[3];
                                      nr.field_P[var33] = var26[0];
                                      if (null != param5) {
                                        L58: {
                                          if (var64 != 0) {
                                            break L58;
                                          } else {
                                            gp.field_e[var33] = var35;
                                            hf.field_d[var33] = var37;
                                            if (var65 == 0) {
                                              break L57;
                                            } else {
                                              break L58;
                                            }
                                          }
                                        }
                                        gp.field_e[var33] = var26[10];
                                        te.field_o[var33] = var26[11];
                                        hf.field_d[var33] = var26[8];
                                        break L57;
                                      } else {
                                        break L57;
                                      }
                                    }
                                    var33++;
                                    var27[var33] = var38;
                                    var30++;
                                    break L56;
                                  }
                                }
                                L59: {
                                  var31 = var31 + (var56 - de.field_a);
                                  uf.field_W = var33;
                                  de.field_a = var56;
                                  var33 = eq.field_R;
                                  if ((wn.field_d.length ^ -1) > (-2 + var58 + param12 + var32 ^ -1)) {
                                    var54 = new int[param12 + (var32 - -var58 - -98)];
                                    qn.a(wn.field_d, 0, var54, 0, var33);
                                    wn.field_d = var54;
                                    var54 = new int[98 + (var58 + var32) + param12];
                                    qn.a(f.field_b, 0, var54, 0, var33);
                                    f.field_b = var54;
                                    var54 = new int[98 + (var58 + (var32 + param12))];
                                    qn.a(nk.field_b, 0, var54, 0, var33);
                                    nk.field_b = var54;
                                    if (param5 == null) {
                                      break L59;
                                    } else {
                                      var54 = new int[98 + (var32 + param12) - -var58];
                                      qn.a(la.field_d, 0, var54, 0, var33);
                                      la.field_d = var54;
                                      var54 = new int[98 + var58 + (var32 + param12)];
                                      qn.a(sl.field_V, 0, var54, 0, var33);
                                      sl.field_V = var54;
                                      var54 = new int[98 + var58 + (var32 + param12)];
                                      qn.a(rb.field_b, 0, var54, 0, var33);
                                      rb.field_b = var54;
                                      break L59;
                                    }
                                  } else {
                                    break L59;
                                  }
                                }
                                L60: {
                                  wn.field_d[var33] = var26[4];
                                  f.field_b[var33] = var26[5];
                                  nk.field_b[var33] = var26[6];
                                  if (null == param5) {
                                    break L60;
                                  } else {
                                    L61: {
                                      if (var64 == 0) {
                                        break L61;
                                      } else {
                                        la.field_d[var33] = var26[12];
                                        sl.field_V[var33] = var26[13];
                                        rb.field_b[var33] = var26[14];
                                        if (var65 == 0) {
                                          break L60;
                                        } else {
                                          break L61;
                                        }
                                      }
                                    }
                                    la.field_d[var33] = var35;
                                    rb.field_b[var33] = var37;
                                    break L60;
                                  }
                                }
                                L62: {
                                  var33++;
                                  var28[var33] = var38;
                                  if (-5 == (var58 ^ -1)) {
                                    L63: {
                                      wn.field_d[var33] = var26[6];
                                      f.field_b[var33] = var26[7];
                                      nk.field_b[var33] = var26[4];
                                      if (param5 == null) {
                                        break L63;
                                      } else {
                                        L64: {
                                          if (var64 != 0) {
                                            break L64;
                                          } else {
                                            la.field_d[var33] = var35;
                                            rb.field_b[var33] = var37;
                                            if (var65 == 0) {
                                              break L63;
                                            } else {
                                              break L64;
                                            }
                                          }
                                        }
                                        la.field_d[var33] = var26[14];
                                        sl.field_V[var33] = var26[15];
                                        rb.field_b[var33] = var26[12];
                                        break L63;
                                      }
                                    }
                                    var33++;
                                    var28[var33] = var38;
                                    var32++;
                                    break L62;
                                  } else {
                                    break L62;
                                  }
                                }
                                eq.field_R = var33;
                                if (var65 == 0) {
                                  break L25;
                                } else {
                                  break L27;
                                }
                              }
                            }
                            L65: {
                              eq.field_R = eq.field_R + 1;
                              var33 = eq.field_R;
                              var34 = var25[var39];
                              if (var34 < 0) {
                                de.field_a = de.field_a + 1;
                                var34 = de.field_a;
                                var25[var39] = de.field_a;
                                eh.field_w[var34] = var42;
                                mj.field_a[var34] = var43;
                                sa.field_w[var34] = var44;
                                break L65;
                              } else {
                                break L65;
                              }
                            }
                            L66: {
                              wn.field_d[var33] = var34;
                              var34 = var25[var40];
                              if ((var34 ^ -1) > -1) {
                                de.field_a = de.field_a + 1;
                                var34 = de.field_a;
                                var25[var40] = de.field_a;
                                eh.field_w[var34] = var45;
                                mj.field_a[var34] = var46;
                                sa.field_w[var34] = var47;
                                break L66;
                              } else {
                                break L66;
                              }
                            }
                            L67: {
                              f.field_b[var33] = var34;
                              var34 = var25[var41];
                              if (0 <= var34) {
                                break L67;
                              } else {
                                de.field_a = de.field_a + 1;
                                var34 = de.field_a;
                                var25[var41] = de.field_a;
                                eh.field_w[var34] = var48;
                                mj.field_a[var34] = var49;
                                sa.field_w[var34] = var50;
                                break L67;
                              }
                            }
                            L68: {
                              nk.field_b[var33] = var34;
                              if (null != param5) {
                                la.field_d[var33] = param5[var38];
                                sl.field_V[var33] = param23[var38];
                                rb.field_b[var33] = param20[var38];
                                break L68;
                              } else {
                                break L68;
                              }
                            }
                            var28[var33] = var38;
                            if (var65 == 0) {
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L69: {
                          uf.field_W = uf.field_W + 1;
                          var33 = uf.field_W;
                          var34 = var24[var39];
                          if (var34 < 0) {
                            nk.field_a = nk.field_a + 1;
                            var34 = nk.field_a;
                            var24[var39] = nk.field_a;
                            qp.field_Yb[var34] = var42;
                            sa.field_r[var34] = var43;
                            ro.field_d[var34] = var44;
                            break L69;
                          } else {
                            break L69;
                          }
                        }
                        L70: {
                          hi.field_k[var33] = var34;
                          var34 = var24[var40];
                          if (var34 < 0) {
                            nk.field_a = nk.field_a + 1;
                            var34 = nk.field_a;
                            var24[var40] = nk.field_a;
                            qp.field_Yb[var34] = var45;
                            sa.field_r[var34] = var46;
                            ro.field_d[var34] = var47;
                            break L70;
                          } else {
                            break L70;
                          }
                        }
                        L71: {
                          vn.field_h[var33] = var34;
                          var34 = var24[var41];
                          if (0 > var34) {
                            nk.field_a = nk.field_a + 1;
                            var34 = nk.field_a;
                            var24[var41] = nk.field_a;
                            qp.field_Yb[var34] = var48;
                            sa.field_r[var34] = var49;
                            ro.field_d[var34] = var50;
                            break L71;
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          nr.field_P[var33] = var34;
                          if (param5 != null) {
                            gp.field_e[var33] = param5[var38];
                            te.field_o[var33] = param23[var38];
                            hf.field_d[var33] = param20[var38];
                            break L72;
                          } else {
                            break L72;
                          }
                        }
                        var27[var33] = var38;
                        break L25;
                      }
                      var38++;
                      if (var65 == 0) {
                        continue L22;
                      } else {
                        break L24;
                      }
                    }
                  }
                }
                ja.field_a = param19;
                ld.field_g = param19;
                vk.field_bb = de.field_a;
                nj.field_d = nk.field_a;
                stackOut_196_0 = -1;
                stackOut_196_1 = param19 ^ -1;
                stackIn_197_0 = stackOut_196_0;
                stackIn_197_1 = stackOut_196_1;
                break L23;
              }
              L73: {
                L74: {
                  if (stackIn_197_0 <= stackIn_197_1) {
                    break L74;
                  } else {
                    L75: {
                      if (param21 == null) {
                        break L75;
                      } else {
                        L76: {
                          L77: {
                            kp.field_h.field_o = param21.field_o;
                            gn.field_e.field_o = param21.field_o;
                            if (null == gn.field_e.field_p) {
                              break L77;
                            } else {
                              if (gn.field_e.field_p.length >= param19) {
                                break L76;
                              } else {
                                break L77;
                              }
                            }
                          }
                          gn.field_e.field_C = new short[param19];
                          gn.field_e.field_H = new short[param19];
                          gn.field_e.field_p = new short[param19];
                          break L76;
                        }
                        L78: {
                          L79: {
                            if (null == kp.field_h.field_p) {
                              break L79;
                            } else {
                              if (param19 <= kp.field_h.field_p.length) {
                                break L78;
                              } else {
                                break L79;
                              }
                            }
                          }
                          kp.field_h.field_p = new short[param19];
                          kp.field_h.field_C = new short[param19];
                          kp.field_h.field_H = new short[param19];
                          break L78;
                        }
                        var38 = 0;
                        L80: while (true) {
                          L81: {
                            L82: {
                              if (param19 <= var38) {
                                break L82;
                              } else {
                                if (var65 != 0) {
                                  break L81;
                                } else {
                                  L83: {
                                    L84: {
                                      if (-1 != (param21.field_o[var38] ^ -1)) {
                                        break L84;
                                      } else {
                                        L85: {
                                          var33 = param21.field_p[var38];
                                          var34 = var24[var33];
                                          if (var34 < 0) {
                                            nk.field_a = nk.field_a + 1;
                                            var34 = nk.field_a;
                                            var24[var33] = nk.field_a;
                                            qp.field_Yb[var34] = param6[var33];
                                            sa.field_r[var34] = param13[var33];
                                            ro.field_d[var34] = param10[var33];
                                            break L85;
                                          } else {
                                            break L85;
                                          }
                                        }
                                        L86: {
                                          gn.field_e.field_p[var38] = (short)var34;
                                          var34 = var25[var33];
                                          if ((var34 ^ -1) > -1) {
                                            de.field_a = de.field_a + 1;
                                            var34 = de.field_a;
                                            var25[var33] = de.field_a;
                                            eh.field_w[var34] = param6[var33];
                                            mj.field_a[var34] = param13[var33];
                                            sa.field_w[var34] = param10[var33];
                                            break L86;
                                          } else {
                                            break L86;
                                          }
                                        }
                                        L87: {
                                          kp.field_h.field_p[var38] = (short)var34;
                                          var33 = param21.field_H[var38];
                                          var34 = var24[var33];
                                          if ((var34 ^ -1) > -1) {
                                            nk.field_a = nk.field_a + 1;
                                            var34 = nk.field_a;
                                            var24[var33] = nk.field_a;
                                            qp.field_Yb[var34] = param6[var33];
                                            sa.field_r[var34] = param13[var33];
                                            ro.field_d[var34] = param10[var33];
                                            break L87;
                                          } else {
                                            break L87;
                                          }
                                        }
                                        L88: {
                                          gn.field_e.field_H[var38] = (short)var34;
                                          var34 = var25[var33];
                                          if ((var34 ^ -1) > -1) {
                                            de.field_a = de.field_a + 1;
                                            var34 = de.field_a;
                                            var25[var33] = de.field_a;
                                            eh.field_w[var34] = param6[var33];
                                            mj.field_a[var34] = param13[var33];
                                            sa.field_w[var34] = param10[var33];
                                            break L88;
                                          } else {
                                            break L88;
                                          }
                                        }
                                        L89: {
                                          kp.field_h.field_H[var38] = (short)var34;
                                          var33 = param21.field_C[var38];
                                          var34 = var24[var33];
                                          if ((var34 ^ -1) > -1) {
                                            nk.field_a = nk.field_a + 1;
                                            var34 = nk.field_a;
                                            var24[var33] = nk.field_a;
                                            qp.field_Yb[var34] = param6[var33];
                                            sa.field_r[var34] = param13[var33];
                                            ro.field_d[var34] = param10[var33];
                                            break L89;
                                          } else {
                                            break L89;
                                          }
                                        }
                                        L90: {
                                          gn.field_e.field_C[var38] = (short)var34;
                                          var34 = var25[var33];
                                          if (-1 >= (var34 ^ -1)) {
                                            break L90;
                                          } else {
                                            de.field_a = de.field_a + 1;
                                            var34 = de.field_a;
                                            var25[var33] = de.field_a;
                                            eh.field_w[var34] = param6[var33];
                                            mj.field_a[var34] = param13[var33];
                                            sa.field_w[var34] = param10[var33];
                                            break L90;
                                          }
                                        }
                                        kp.field_h.field_C[var38] = (short)var34;
                                        if (var65 == 0) {
                                          break L83;
                                        } else {
                                          break L84;
                                        }
                                      }
                                    }
                                    kp.field_h.field_p[var38] = param21.field_p[var38];
                                    gn.field_e.field_p[var38] = param21.field_p[var38];
                                    kp.field_h.field_H[var38] = param21.field_H[var38];
                                    gn.field_e.field_H[var38] = param21.field_H[var38];
                                    kp.field_h.field_C[var38] = param21.field_C[var38];
                                    gn.field_e.field_C[var38] = param21.field_C[var38];
                                    break L83;
                                  }
                                  var38++;
                                  if (var65 == 0) {
                                    continue L80;
                                  } else {
                                    break L82;
                                  }
                                }
                              }
                            }
                            kp.field_h.field_E = param21.field_E;
                            gn.field_e.field_E = param21.field_E;
                            kp.field_h.field_T = param21.field_T;
                            gn.field_e.field_T = param21.field_T;
                            kp.field_h.field_F = param21.field_F;
                            gn.field_e.field_F = param21.field_F;
                            kp.field_h.field_j = param21.field_j;
                            gn.field_e.field_j = param21.field_j;
                            kp.field_h.field_R = param21.field_R;
                            gn.field_e.field_R = param21.field_R;
                            kp.field_h.field_i = param21.field_i;
                            gn.field_e.field_i = param21.field_i;
                            kp.field_h.field_z = param21.field_z;
                            gn.field_e.field_z = param21.field_z;
                            kp.field_h.field_h = param21.field_h;
                            gn.field_e.field_h = param21.field_h;
                            break L81;
                          }
                          if (var65 == 0) {
                            break L74;
                          } else {
                            break L75;
                          }
                        }
                      }
                    }
                    L91: {
                      L92: {
                        if (ve.field_w == null) {
                          break L92;
                        } else {
                          if ((param19 ^ -1) < (ve.field_w.length ^ -1)) {
                            break L92;
                          } else {
                            break L91;
                          }
                        }
                      }
                      jk.field_h = new int[param19];
                      kc.field_e = new int[param19];
                      ve.field_w = new int[param19];
                      break L91;
                    }
                    L93: {
                      L94: {
                        if (dp.field_e == null) {
                          break L94;
                        } else {
                          if (param19 <= dp.field_e.length) {
                            break L93;
                          } else {
                            break L94;
                          }
                        }
                      }
                      tk.field_e = new int[param19];
                      dp.field_e = new int[param19];
                      up.field_p = new int[param19];
                      break L93;
                    }
                    var38 = 0;
                    L95: while (true) {
                      if ((param19 ^ -1) >= (var38 ^ -1)) {
                        break L74;
                      } else {
                        var33 = param9[var38];
                        var34 = var24[var33];
                        if (var65 != 0) {
                          break L73;
                        } else {
                          L96: {
                            if ((var34 ^ -1) <= -1) {
                              break L96;
                            } else {
                              nk.field_a = nk.field_a + 1;
                              var34 = nk.field_a;
                              var24[var33] = nk.field_a;
                              qp.field_Yb[var34] = param6[var33];
                              sa.field_r[var34] = param13[var33];
                              ro.field_d[var34] = param10[var33];
                              break L96;
                            }
                          }
                          L97: {
                            ve.field_w[var38] = var34;
                            var34 = var25[var33];
                            if (var34 < 0) {
                              de.field_a = de.field_a + 1;
                              var34 = de.field_a;
                              var25[var33] = de.field_a;
                              eh.field_w[var34] = param6[var33];
                              mj.field_a[var34] = param13[var33];
                              sa.field_w[var34] = param10[var33];
                              break L97;
                            } else {
                              break L97;
                            }
                          }
                          L98: {
                            dp.field_e[var38] = var34;
                            var33 = param4[var38];
                            var34 = var24[var33];
                            if (-1 >= (var34 ^ -1)) {
                              break L98;
                            } else {
                              nk.field_a = nk.field_a + 1;
                              var34 = nk.field_a;
                              var24[var33] = nk.field_a;
                              qp.field_Yb[var34] = param6[var33];
                              sa.field_r[var34] = param13[var33];
                              ro.field_d[var34] = param10[var33];
                              break L98;
                            }
                          }
                          L99: {
                            kc.field_e[var38] = var34;
                            var34 = var25[var33];
                            if ((var34 ^ -1) <= -1) {
                              break L99;
                            } else {
                              de.field_a = de.field_a + 1;
                              var34 = de.field_a;
                              var25[var33] = de.field_a;
                              eh.field_w[var34] = param6[var33];
                              mj.field_a[var34] = param13[var33];
                              sa.field_w[var34] = param10[var33];
                              break L99;
                            }
                          }
                          L100: {
                            up.field_p[var38] = var34;
                            var33 = param16[var38];
                            var34 = var24[var33];
                            if (0 <= var34) {
                              break L100;
                            } else {
                              nk.field_a = nk.field_a + 1;
                              var34 = nk.field_a;
                              var24[var33] = nk.field_a;
                              qp.field_Yb[var34] = param6[var33];
                              sa.field_r[var34] = param13[var33];
                              ro.field_d[var34] = param10[var33];
                              break L100;
                            }
                          }
                          L101: {
                            jk.field_h[var38] = var34;
                            var34 = var25[var33];
                            if ((var34 ^ -1) <= -1) {
                              break L101;
                            } else {
                              de.field_a = de.field_a + 1;
                              var34 = de.field_a;
                              var25[var33] = de.field_a;
                              eh.field_w[var34] = param6[var33];
                              mj.field_a[var34] = param13[var33];
                              sa.field_w[var34] = param10[var33];
                              break L101;
                            }
                          }
                          tk.field_e[var38] = var34;
                          var38++;
                          if (var65 == 0) {
                            continue L95;
                          } else {
                            break L74;
                          }
                        }
                      }
                    }
                  }
                }
                break L73;
              }
              return;
            }
          }
        }
    }

    final static vh a(byte param0, int param1, int param2, boolean param3, int param4) {
        dd var5 = null;
        RuntimeException var5_ref = null;
        vh var6 = null;
        dd stackIn_8_0 = null;
        vh stackIn_10_0 = null;
        vh stackIn_12_0 = null;
        vh stackIn_13_0 = null;
        dd stackIn_13_1 = null;
        vh stackIn_14_0 = null;
        vh stackIn_16_0 = null;
        vh stackIn_17_0 = null;
        dd stackIn_17_1 = null;
        vh stackIn_18_0 = null;
        dd stackOut_5_0 = null;
        dd stackOut_7_0 = null;
        vh stackOut_9_0 = null;
        vh stackOut_10_0 = null;
        dd stackOut_10_1 = null;
        vh stackOut_12_0 = null;
        dd stackOut_12_1 = null;
        vh stackOut_13_0 = null;
        vh stackOut_14_0 = null;
        dd stackOut_14_1 = null;
        vh stackOut_16_0 = null;
        dd stackOut_16_1 = null;
        vh stackOut_17_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 > 53) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        u.a(-58, -76, -84, false, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -35, (int[]) null, (int[]) null, -23, 17, (int[]) null, (byte[]) null, (int[]) null, (int[]) null, -54, (int[]) null, 18, (int[]) null, (eg) null, 89, (int[]) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param3) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = hp.field_b;
                        stackIn_8_0 = stackOut_5_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = bf.field_h;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var5 = stackIn_8_0;
                        var6 = new vh((long)param4, (vh) null, param1, param2, var5.field_z, var5.field_A, (String) null);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var6.field_hb = var5;
                        stackOut_9_0 = (vh) var6;
                        stackIn_12_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (!param3) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = (vh) (Object) stackIn_10_0;
                        stackOut_10_1 = ag.field_b;
                        stackIn_13_0 = stackOut_10_0;
                        stackIn_13_1 = stackOut_10_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (vh) (Object) stackIn_12_0;
                        stackOut_12_1 = gj.field_T;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_13_0.field_ab = stackIn_13_1;
                        stackOut_13_0 = (vh) var6;
                        stackIn_16_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (param3) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = (vh) (Object) stackIn_14_0;
                        stackOut_14_1 = eh.field_y;
                        stackIn_17_0 = stackOut_14_0;
                        stackIn_17_1 = stackOut_14_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = (vh) (Object) stackIn_16_0;
                        stackOut_16_1 = wf.field_a;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        stackIn_17_0.field_yb = stackIn_17_1;
                        stackOut_17_0 = (vh) var6;
                        stackIn_18_0 = stackOut_17_0;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return stackIn_18_0;
                }
                case 19: {
                    var5_ref = (RuntimeException) (Object) caughtException;
                    throw wm.a((Throwable) (Object) var5_ref, "u.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0.0;
    }
}
