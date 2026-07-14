/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends kd {
    int field_i;
    int field_l;
    static boolean field_k;
    int field_n;
    int[] field_h;
    static int field_o;
    int field_p;
    int field_m;
    int field_j;

    final static void a(int param0, int param1, int param2, int param3, int[] param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16) {
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
        int var42 = 0;
        L0: {
          var42 = Lexicominos.field_L ? 1 : 0;
          if (param1 < 0) {
            break L0;
          } else {
            if (k.field_d > param3) {
              L1: {
                if (0 <= param13) {
                  break L1;
                } else {
                  if (param9 >= 0) {
                    break L1;
                  } else {
                    if (0 > param16) {
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                if (k.field_f > param13) {
                  break L2;
                } else {
                  if (k.field_f > param9) {
                    break L2;
                  } else {
                    if (param16 >= k.field_f) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param12 == -1464114640) {
                L3: {
                  L4: {
                    var34 = param1 - param3;
                    if (param6 == param3) {
                      break L4;
                    } else {
                      L5: {
                        L6: {
                          var30 = param7 << -784694448;
                          var29 = param7 << -784694448;
                          var26 = param11 << 1301668912;
                          var25 = param11 << 1301668912;
                          var18 = param13 << 1694128400;
                          var17 = param13 << 1694128400;
                          var22 = param5 << 1872127760;
                          var21 = param5 << 1872127760;
                          var35 = param6 - param3;
                          var19 = (param9 + -param13 << 2001023408) / var35;
                          var20 = (param16 - param13 << -1790780656) / var34;
                          if (var19 >= var20) {
                            break L6;
                          } else {
                            var32 = (param8 + -param7 << -446993904) / var34;
                            var23 = (param10 - param5 << 47289776) / var35;
                            var27 = (param15 + -param11 << -1464114640) / var35;
                            var31 = (-param7 + param14 << 1823951472) / var35;
                            var24 = (param0 + -param5 << 1984144976) / var34;
                            var33 = 0;
                            var28 = (param2 + -param11 << -1239474064) / var34;
                            if (0 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        var27 = (param2 - param11 << -1449691728) / var34;
                        var31 = (-param7 + param8 << -2080218160) / var34;
                        var24 = (-param5 + param10 << -1432025744) / var35;
                        var36 = var19;
                        var19 = var20;
                        var20 = var36;
                        var33 = 1;
                        var23 = (param0 - param5 << -1854740816) / var34;
                        var32 = (param14 + -param7 << 1683830992) / var35;
                        var28 = (param15 + -param11 << -679402832) / var35;
                        break L5;
                      }
                      L7: {
                        L8: {
                          if (param3 < 0) {
                            L9: {
                              if (param6 >= 0) {
                                break L9;
                              } else {
                                param3 = -param3 + param6;
                                var18 = var18 + var20 * param3;
                                var25 = var25 + var27 * param3;
                                var21 = var21 + param3 * var23;
                                var30 = var30 + var32 * param3;
                                var26 = var26 + var28 * param3;
                                var17 = var17 + param3 * var19;
                                var29 = var29 + param3 * var31;
                                var22 = var22 + var24 * param3;
                                param3 = param6;
                                if (0 == 0) {
                                  break L7;
                                } else {
                                  break L9;
                                }
                              }
                            }
                            param3 = -param3;
                            var29 = var29 + var31 * param3;
                            var26 = var26 + param3 * var28;
                            var22 = var22 + var24 * param3;
                            var21 = var21 + param3 * var23;
                            var30 = var30 + var32 * param3;
                            var17 = var17 + param3 * var19;
                            var25 = var25 + param3 * var27;
                            var18 = var18 + param3 * var20;
                            param3 = 0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var36 = k.field_e[param3];
                        L10: while (true) {
                          if (param6 <= param3) {
                            break L7;
                          } else {
                            L11: {
                              var37 = var17 >> 503428368;
                              if (var37 < k.field_f) {
                                var38 = -(var17 >> 518468912) + (var18 >> 1155114352);
                                if (var38 == 0) {
                                  if (0 > var37) {
                                    break L11;
                                  } else {
                                    if (k.field_f <= var37) {
                                      break L11;
                                    } else {
                                      vb.a(0, var25, var38, 0, var21, (byte) -95, param4, 0, var37 - -var36, var29);
                                      break L11;
                                    }
                                  }
                                } else {
                                  if (0 > var37) {
                                    break L11;
                                  } else {
                                    if (k.field_f <= var37) {
                                      break L11;
                                    } else {
                                      vb.a(0, var25, var38, 0, var21, (byte) -95, param4, 0, var37 - -var36, var29);
                                      break L11;
                                    }
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                            param3++;
                            if (param3 < k.field_d) {
                              var21 = var21 + var23;
                              var22 = var22 + var24;
                              var26 = var26 + var28;
                              var30 = var30 + var32;
                              var29 = var29 + var31;
                              var17 = var17 + var19;
                              var36 = var36 + lf.field_f;
                              var18 = var18 + var20;
                              var25 = var25 + var27;
                              if (0 == 0) {
                                continue L10;
                              } else {
                                break L7;
                              }
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      L12: {
                        L13: {
                          var36 = param1 - param6;
                          if (var36 != 0) {
                            break L13;
                          } else {
                            var24 = 0;
                            var23 = 0;
                            var27 = 0;
                            var19 = 0;
                            var32 = 0;
                            var20 = 0;
                            var28 = 0;
                            var31 = 0;
                            if (0 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          }
                        }
                        L14: {
                          L15: {
                            var37 = param16 << 1417813520;
                            var38 = param0 << 221873008;
                            var39 = param2 << -1191438576;
                            if (var33 != 0) {
                              break L15;
                            } else {
                              var21 = param10 << -866746736;
                              var29 = param14 << -264827472;
                              var17 = param9 << 1065624656;
                              var25 = param15 << 1937650960;
                              if (0 == 0) {
                                break L14;
                              } else {
                                break L15;
                              }
                            }
                          }
                          var22 = param10 << 1408694288;
                          var18 = param9 << 1355062160;
                          var30 = param14 << 946440112;
                          var26 = param15 << -748447760;
                          break L14;
                        }
                        var40 = param8 << -110867504;
                        var20 = (var37 + -var18) / var36;
                        var24 = (-var22 + var38) / var36;
                        var31 = (-var29 + var40) / var36;
                        var27 = (-var25 + var39) / var36;
                        var28 = (var39 + -var26) / var36;
                        var19 = (-var17 + var37) / var36;
                        var23 = (var38 + -var21) / var36;
                        var32 = (var40 - var30) / var36;
                        break L12;
                      }
                      if (0 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L16: {
                    L17: {
                      if (param3 != param1) {
                        break L17;
                      } else {
                        var18 = param9 << 295157488;
                        var26 = param15;
                        var28 = 0;
                        var27 = 0;
                        var25 = param11;
                        var30 = param14;
                        var31 = 0;
                        var32 = 0;
                        var23 = 0;
                        var19 = 0;
                        var20 = 0;
                        var21 = param5;
                        var24 = 0;
                        var17 = param13 << 655450704;
                        var29 = param7;
                        var22 = param10;
                        if (0 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    L18: {
                      var35 = param1 - param6;
                      if (param9 <= param13) {
                        break L18;
                      } else {
                        var24 = (param0 - param10 << -545221616) / var35;
                        var30 = param14 << 2014944720;
                        var26 = param15 << -56450384;
                        var25 = param11 << -820185072;
                        var21 = param5 << -480064880;
                        var23 = (-param5 + param0 << 264325072) / var34;
                        var17 = param13 << -1973324976;
                        var28 = (param2 + -param15 << -1763662576) / var35;
                        var32 = (param8 + -param14 << 612568368) / var35;
                        var29 = param7 << 1471051952;
                        var22 = param10 << -531647632;
                        var27 = (param2 + -param11 << -1438801616) / var34;
                        var31 = (param8 + -param7 << -1435885904) / var34;
                        var18 = param9 << 1128041360;
                        var19 = (param16 + -param13 << 1924839280) / var34;
                        var20 = (-param9 + param16 << -1450193040) / var35;
                        if (0 == 0) {
                          break L16;
                        } else {
                          break L18;
                        }
                      }
                    }
                    var26 = param11 << 1895570928;
                    var17 = param9 << 1804481296;
                    var24 = (param0 - param5 << -1766099856) / var34;
                    var18 = param13 << 2140033968;
                    var20 = (param16 + -param13 << 2069455504) / var34;
                    var27 = (-param15 + param2 << -2038519536) / var35;
                    var21 = param10 << 623532080;
                    var25 = param15 << 1117346256;
                    var22 = param5 << -923417616;
                    var29 = param14 << 1267713040;
                    var28 = (param2 - param11 << 1227442032) / var34;
                    var19 = (-param9 + param16 << -1461491280) / var35;
                    var23 = (-param10 + param0 << -1617051568) / var35;
                    var32 = (-param7 + param8 << 273147024) / var34;
                    var31 = (param8 + -param14 << -1175046704) / var35;
                    var30 = param7 << 921511408;
                    break L16;
                  }
                  var33 = 0;
                  if (param3 >= 0) {
                    break L3;
                  } else {
                    param3 = Math.min(-param3, -param3 + param6);
                    var30 = var30 + param3 * var32;
                    var25 = var25 + param3 * var27;
                    var22 = var22 + var24 * param3;
                    var29 = var29 + param3 * var31;
                    var18 = var18 + param3 * var20;
                    var21 = var21 + param3 * var23;
                    var17 = var17 + param3 * var19;
                    var26 = var26 + param3 * var28;
                    param3 = 0;
                    break L3;
                  }
                }
                L19: {
                  if (param3 >= 0) {
                    break L19;
                  } else {
                    param3 = -param3;
                    var26 = var26 + var28 * param3;
                    var25 = var25 + var27 * param3;
                    var18 = var18 + var20 * param3;
                    var30 = var30 + var32 * param3;
                    var21 = var21 + param3 * var23;
                    var29 = var29 + param3 * var31;
                    var17 = var17 + var19 * param3;
                    var22 = var22 + var24 * param3;
                    param3 = 0;
                    break L19;
                  }
                }
                L20: {
                  var35 = k.field_e[param3];
                  if (param1 <= param3) {
                    break L20;
                  } else {
                    L21: {
                      var36 = var17 >> -798359184;
                      if (k.field_f > var36) {
                        L22: {
                          var37 = (var18 >> 159836240) - (var17 >> -1229344336);
                          if (var37 != 0) {
                            break L22;
                          } else {
                            if (var36 < 0) {
                              break L21;
                            } else {
                              if (var36 < k.field_f) {
                                vb.a(0, var25, var37, 0, var21, (byte) -95, param4, 0, var36 + var35, var29);
                                if (0 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              } else {
                                break L21;
                              }
                            }
                          }
                        }
                        L23: {
                          var38 = (var22 - var21) / var37;
                          var39 = (-var25 + var26) / var37;
                          var40 = (var30 - var29) / var37;
                          if (var37 + var36 >= k.field_f) {
                            var37 = k.field_f - var36 + -1;
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (var36 < 0) {
                            break L24;
                          } else {
                            vb.a(var38, var25, var37, var40, var21, (byte) -95, param4, var39, var35 + var36, var29);
                            if (0 == 0) {
                              break L21;
                            } else {
                              break L24;
                            }
                          }
                        }
                        vb.a(var38, -(var39 * var36) + var25, var36 + var37, var40, var21 - var36 * var38, (byte) -95, param4, var39, var35, -(var36 * var40) + var29);
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    param3++;
                    if (k.field_d <= param3) {
                      return;
                    } else {
                      var25 = var25 + var27;
                      var17 = var17 + var19;
                      var29 = var29 + var31;
                      var22 = var22 + var24;
                      var18 = var18 + var20;
                      var30 = var30 + var32;
                      var35 = var35 + lf.field_f;
                      var26 = var26 + var28;
                      var21 = var21 + var23;
                      break L20;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    final static int a(nc param0, sj param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Lexicominos.field_L ? 1 : 0;
          if (param1 == null) {
            break L0;
          } else {
            if (null == param1.field_n) {
              break L0;
            } else {
              if (param0 == null) {
                break L0;
              } else {
                if (param1.field_h != param0.field_k) {
                  break L0;
                } else {
                  L1: {
                    var4 = param0.field_m.length;
                    var5 = param1.field_n[param3].length / var4;
                    if (param2 >= 44) {
                      break L1;
                    } else {
                      ul.a(-76, -113, 52, -107, (int[]) null, 3, 112, 69, -116, -97, 14, -59, 65, 10, -40, 3, 50);
                      break L1;
                    }
                  }
                  var6 = 0;
                  L2: while (true) {
                    if (var5 <= var6) {
                      return -1;
                    } else {
                      if (param0.field_h == param1.field_i[param3][var6]) {
                        if (md.a(param1.field_j[param3][var6], -98)) {
                          var7 = 0;
                          L3: while (true) {
                            if (var4 <= var7) {
                              return var6;
                            } else {
                              if (param1.field_n[param3][var7 + var4 * var6] == param0.field_m[var7]) {
                                var7++;
                                continue L3;
                              } else {
                                var6++;
                                continue L2;
                              }
                            }
                          }
                        } else {
                          var6++;
                          continue L2;
                        }
                      } else {
                        var6++;
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    final void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        ((ul) this).field_n = param3;
        if (param2 != 0) {
            return;
        }
        ((ul) this).field_i = param4;
        ((ul) this).field_j = param5;
        ((ul) this).field_h = param0;
        ((ul) this).field_l = param7;
        ((ul) this).field_p = param1;
        ((ul) this).field_m = param6;
    }

    final static void a(sh param0, sh param1, sh param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        jb[] var15 = null;
        int var11_int = 0;
        int var14 = Lexicominos.field_L ? 1 : 0;
        ti.field_I = td.a("commonui", "frame_top", param0, 22306);
        we.field_i = td.a("commonui", "frame_bottom", param0, 22306);
        Lexicominos.field_I = df.a("commonui", "jagex_logo_grey", param0, (byte) -123);
        uc.field_hb = td.a("commonui", "button", param0, 22306);
        be.field_b = uk.a("validation", "commonui", -909811167, param0);
        cl.field_T = (le) (Object) ee.a("commonui", "arezzo12", false, param1, param0);
        ql.field_Q = (le) (Object) ee.a("commonui", "arezzo14", false, param1, param0);
        ra.field_c = (le) (Object) ee.a("commonui", "arezzo14bold", false, param1, param0);
        db var18 = new db(param2.a((byte) 127, "", "button.gif"), (java.awt.Component) (Object) ug.field_y);
        jb discarded$0 = nh.a("commonui", param0, false, "dropdown");
        jb[] var5 = wf.a(param0, "commonui", true, "screen_options");
        si.field_u = new jb[4];
        oc.field_d = new jb[4];
        uj.field_a = new jb[4];
        jb[][] var6 = new jb[][]{uj.field_a, si.field_u, oc.field_d};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_j;
        for (var8 = 1; var8 < var22.length; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_i[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        var22[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var15 = var6[var9];
            jb[] var10 = var15;
            for (var11_int = 0; var11_int < var15.length; var11_int++) {
                var15[var11_int] = bf.a(var22[var11_int], var5[var9], 0);
            }
        }
        var9 = var18.field_u;
        ja.b((byte) -116);
        var18.b();
        lf.b(0, 0, lf.field_f, lf.field_a);
        db var16 = new db(var9, var9);
        db var19 = var16;
        var19.b();
        var18.b(0, 0);
        db var11 = new db(var9, var9);
        var11.b();
        var18.b(-var18.field_p + var9, 0);
        int var12 = -33 / ((param3 - 38) / 59);
        db var13 = new db(var18.field_p + -(var9 * 2), var9);
        var13.b();
        var18.b(-var9, 0);
        pd.a(-22949);
        uc.field_hb = new db[]{var16, var13, var11};
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Lexicominos.field_L ? 1 : 0;
                    if (param1 == 14080) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return false;
                }
                case 2: {
                    try {
                        if (!ab.field_b.startsWith("win")) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0.startsWith("https://")) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0 != 0;
                }
                case 10: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var3 >= param0.length()) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var2.indexOf((int) param0.charAt(var3)) == -1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return stackIn_15_0 != 0;
                }
                case 16: {
                    try {
                        var3++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_17_0 = 1;
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
                    return stackIn_18_0 != 0;
                }
                case 19: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ul() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = true;
        field_o = 0;
    }
}
