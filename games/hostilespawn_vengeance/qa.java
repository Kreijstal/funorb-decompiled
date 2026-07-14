/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static bd[] field_g;
    static int[] field_d;
    static String field_a;
    static String field_f;
    static int field_e;
    static bd field_c;
    static int field_b;

    final static bd[] a(int param0) {
        bd[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        byte[] var5 = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int[] var10 = null;
        byte[] var11 = null;
        int[] var13 = null;
        byte[] var15 = null;
        int[] var17 = null;
        byte[] var19 = null;
        int[] var21 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        var1 = new bd[sc.field_c];
        var2 = 0;
        L0: while (true) {
          if (var2 >= sc.field_c) {
            L1: {
              if (param0 == 26627) {
                break L1;
              } else {
                int discarded$1 = qa.a(-20, 98);
                break L1;
              }
            }
            uj.d(param0 ^ -26740);
            return var1;
          } else {
            var3 = hd.field_r[var2] * sf.field_X[var2];
            var24 = ja.field_e[var2];
            if (!qj.field_k[var2]) {
              var10 = new int[var3];
              var26 = var10;
              var6 = 0;
              L2: while (true) {
                if (var6 >= var3) {
                  var1[var2] = new bd(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], var26);
                  var2++;
                  continue L0;
                } else {
                  var10[var6] = bf.field_d[ua.a((int) var24[var6], 255)];
                  var6++;
                  continue L2;
                }
              }
            } else {
              var23 = vh.field_a[var2];
              var19 = var23;
              var15 = var19;
              var11 = var15;
              var9 = var11;
              var5 = var9;
              var25 = new int[var3];
              var21 = var25;
              var17 = var21;
              var13 = var17;
              var6_ref_int__ = var13;
              var7 = 0;
              L3: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (bd) (Object) new gk(ra.field_a, vc.field_e, th.field_Jb[var2], nh.field_O[var2], sf.field_X[var2], hd.field_r[var2], var25);
                  var2++;
                  continue L0;
                } else {
                  var6_ref_int__[var7] = ll.a(ua.a(-16777216, var23[var7] << -528475528), bf.field_d[ua.a((int) var24[var7], 255)]);
                  var7++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        boolean[] var13 = null;
        boolean[] var14 = null;
        int var16 = 0;
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
        bd var27 = null;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        Object var31 = null;
        int[] var33 = null;
        int[] var35 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_98_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        L0: {
          var30 = HostileSpawn.field_I ? 1 : 0;
          var10 = uj.field_p.field_e;
          if (param1 > 13) {
            break L0;
          } else {
            var31 = null;
            qa.a(true, (byte) -106, (String) null);
            break L0;
          }
        }
        var11 = uj.field_p.field_g;
        var39 = ln.field_a.field_y;
        var37 = var39;
        var35 = var37;
        var33 = var35;
        var12 = var33;
        var13 = ln.field_a.field_B;
        var14 = ln.field_a.field_r;
        var38 = ln.field_a.field_o;
        var16 = param2;
        L1: while (true) {
          if (param4 < var16) {
            return;
          } else {
            var7 = param5 * var16 - -param0;
            var9 = var16 * 24 - var11;
            var17 = param0;
            L2: while (true) {
              if (param3 < var17) {
                var16++;
                continue L1;
              } else {
                L3: {
                  L4: {
                    var8 = var17 * 24 + -var10;
                    var7++;
                    var18 = sa.a((byte) -128, var7);
                    var19 = var38[var7];
                    var20 = 250 - var18 * 10;
                    var23 = var18;
                    var22 = var18;
                    var21 = var18;
                    var24 = var18;
                    if (-1 == (r.field_a ^ -1)) {
                      break L4;
                    } else {
                      if (var19 < 0) {
                        var25 = ee.a(var18, -param5 + var7 - 1, false);
                        var21 = var21 + var25;
                        var25 = ee.a(var18, var7 + 0 + -param5, false);
                        var22 = var22 + var25;
                        var21 = var21 + var25;
                        var25 = ee.a(var18, 1 + (var7 - param5), false);
                        var22 = var22 + var25;
                        var25 = ee.a(var18, -1 + var7, false);
                        var23 = var23 + var25;
                        var21 = var21 + var25;
                        var25 = ee.a(var18, 1 + var7, false);
                        var22 = var22 + var25;
                        var24 = var24 + var25;
                        var25 = ee.a(var18, var7 + (-1 + param5), false);
                        var23 = var23 + var25;
                        var25 = ee.a(var18, param5 + var7 - 0, false);
                        var23 = var23 + var25;
                        var24 = var24 + var25;
                        var25 = ee.a(var18, param5 + (1 + var7), false);
                        var24 = var24 + var25;
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var25 = sa.a((byte) -128, var7 - (1 - -param5));
                  var21 = var21 + var25;
                  var25 = sa.a((byte) -126, -param5 + (var7 - 0));
                  var22 = var22 + var25;
                  var21 = var21 + var25;
                  var25 = sa.a((byte) -121, 1 + var7 - param5);
                  var22 = var22 + var25;
                  var25 = sa.a((byte) -113, -1 + var7);
                  var23 = var23 + var25;
                  var21 = var21 + var25;
                  var25 = sa.a((byte) -105, 1 + var7);
                  var22 = var22 + var25;
                  var24 = var24 + var25;
                  var25 = sa.a((byte) -111, param5 + (var7 + -1));
                  var23 = var23 + var25;
                  var25 = sa.a((byte) -117, 0 + var7 - -param5);
                  var24 = var24 + var25;
                  var23 = var23 + var25;
                  var25 = sa.a((byte) -127, param5 + var7 - -1);
                  var24 = var24 + var25;
                  break L3;
                }
                L5: {
                  L6: {
                    L7: {
                      var21 = var21 >> 2;
                      var22 = var22 >> 2;
                      var24 = var24 >> 2;
                      var23 = var23 >> 2;
                      var21 = var21 * 10;
                      var23 = var23 * 10;
                      var22 = var22 * 10;
                      var24 = var24 * 10;
                      var27 = pi.field_a[2];
                      if (-10 < (var39[var7] ^ -1)) {
                        break L7;
                      } else {
                        if ((var39[var7] ^ -1) >= -14) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (var39[var7] > -17) {
                        break L8;
                      } else {
                        if (17 >= var39[var7]) {
                          break L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (-23 > var39[var7]) {
                        break L9;
                      } else {
                        if (var39[var7] >= -24) {
                          break L6;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (-31 > var39[var7]) {
                        break L10;
                      } else {
                        if (-32 <= (var39[var7] ^ -1)) {
                          break L6;
                        } else {
                          break L10;
                        }
                      }
                    }
                    if ((var39[var7] ^ -1) > -39) {
                      break L5;
                    } else {
                      if (39 >= var39[var7]) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var27 = fa.field_d[var39[var7]];
                  break L5;
                }
                L11: {
                  L12: {
                    if (var21 < -1) {
                      break L12;
                    } else {
                      if (-1 < var22) {
                        break L12;
                      } else {
                        if (var23 > 0) {
                          break L12;
                        } else {
                          if (-1 <= (var24 ^ -1)) {
                            si.a(var8, var9, 24, 24, 0, 255);
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  L13: {
                    if (var22 != var21) {
                      break L13;
                    } else {
                      if (var21 != var23) {
                        break L13;
                      } else {
                        if (var24 == var21) {
                          si.a(var8, var9, 24, 24, 0, 256 - var21);
                          break L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  eh.a(var8, var9, var21, var22, var23, var24);
                  break L11;
                }
                L14: {
                  if (var19 < 0) {
                    break L14;
                  } else {
                    if (-1 > ak.field_b[var19].field_a) {
                      if (r.field_a == 0) {
                        L15: {
                          if (4 == var19 >> -941592216) {
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        var17++;
                        continue L2;
                      } else {
                        var17++;
                        continue L2;
                      }
                    } else {
                      break L14;
                    }
                  }
                }
                L16: {
                  if (var13[var7]) {
                    break L16;
                  } else {
                    if (-1 > rl.field_c) {
                      break L16;
                    } else {
                      if (-3 > (rl.field_c ^ -1)) {
                        break L16;
                      } else {
                        if (bm.field_c == 0) {
                          L17: {
                            L18: {
                              if (-3 != rl.field_c) {
                                break L18;
                              } else {
                                if (-1 != var39[var7]) {
                                  break L17;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            if (var12[-1 + var7] != 0) {
                              break L17;
                            } else {
                              if (-1 != var12[1 + var7]) {
                                break L17;
                              } else {
                                if (-1 != var12[var7 + -param5]) {
                                  break L17;
                                } else {
                                  if (var12[var7 + param5] != 0) {
                                    break L17;
                                  } else {
                                    if (0 != var12[-1 + (var7 + -param5)]) {
                                      break L17;
                                    } else {
                                      if (0 != var12[var7 - -1 - param5]) {
                                        break L17;
                                      } else {
                                        if (0 != var12[var7 + param5 - 1]) {
                                          break L17;
                                        } else {
                                          if (var12[-param5 + 1 + var7] != 0) {
                                            break L17;
                                          } else {
                                            var17++;
                                            continue L2;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (var18 == 0) {
                            L19: {
                              if (var12[-param5 + (-1 + var7)] != 0) {
                                stackOut_76_0 = -25;
                                stackIn_77_0 = stackOut_76_0;
                                break L19;
                              } else {
                                stackOut_75_0 = 25;
                                stackIn_77_0 = stackOut_75_0;
                                break L19;
                              }
                            }
                            L20: {
                              var25 = stackIn_77_0;
                              var24 = var18;
                              var22 = var18;
                              var23 = var18;
                              var21 = var18;
                              var21 = var21 + var25;
                              if (-1 == (var12[var7 - 0 - param5] ^ -1)) {
                                stackOut_79_0 = 25;
                                stackIn_80_0 = stackOut_79_0;
                                break L20;
                              } else {
                                stackOut_78_0 = -25;
                                stackIn_80_0 = stackOut_78_0;
                                break L20;
                              }
                            }
                            L21: {
                              var25 = stackIn_80_0;
                              var22 = var22 + var25;
                              var21 = var21 + var25;
                              if (var12[1 + (var7 - param5)] == 0) {
                                stackOut_82_0 = 25;
                                stackIn_83_0 = stackOut_82_0;
                                break L21;
                              } else {
                                stackOut_81_0 = -25;
                                stackIn_83_0 = stackOut_81_0;
                                break L21;
                              }
                            }
                            L22: {
                              var25 = stackIn_83_0;
                              var22 = var22 + var25;
                              if (var12[-1 + var7] == 0) {
                                stackOut_85_0 = 25;
                                stackIn_86_0 = stackOut_85_0;
                                break L22;
                              } else {
                                stackOut_84_0 = -25;
                                stackIn_86_0 = stackOut_84_0;
                                break L22;
                              }
                            }
                            L23: {
                              var25 = stackIn_86_0;
                              var23 = var23 + var25;
                              var21 = var21 + var25;
                              if (var12[1 + var7] == 0) {
                                stackOut_88_0 = 25;
                                stackIn_89_0 = stackOut_88_0;
                                break L23;
                              } else {
                                stackOut_87_0 = -25;
                                stackIn_89_0 = stackOut_87_0;
                                break L23;
                              }
                            }
                            L24: {
                              var25 = stackIn_89_0;
                              var24 = var24 + var25;
                              var22 = var22 + var25;
                              if (var12[var7 - (1 + -param5)] == 0) {
                                stackOut_91_0 = 25;
                                stackIn_92_0 = stackOut_91_0;
                                break L24;
                              } else {
                                stackOut_90_0 = -25;
                                stackIn_92_0 = stackOut_90_0;
                                break L24;
                              }
                            }
                            L25: {
                              var25 = stackIn_92_0;
                              var23 = var23 + var25;
                              if (var12[0 + var7 + param5] != 0) {
                                stackOut_94_0 = -25;
                                stackIn_95_0 = stackOut_94_0;
                                break L25;
                              } else {
                                stackOut_93_0 = 25;
                                stackIn_95_0 = stackOut_93_0;
                                break L25;
                              }
                            }
                            L26: {
                              var25 = stackIn_95_0;
                              var24 = var24 + var25;
                              var23 = var23 + var25;
                              if (0 == var12[var7 - -1 - -param5]) {
                                stackOut_97_0 = 25;
                                stackIn_98_0 = stackOut_97_0;
                                break L26;
                              } else {
                                stackOut_96_0 = -25;
                                stackIn_98_0 = stackOut_96_0;
                                break L26;
                              }
                            }
                            L27: {
                              var25 = stackIn_98_0;
                              var24 = var24 + var25;
                              var23 = var23 >> 2;
                              var22 = var22 >> 2;
                              var21 = var21 >> 2;
                              var24 = var24 >> 2;
                              if (0 > var22) {
                                var22 = 0;
                                break L27;
                              } else {
                                break L27;
                              }
                            }
                            L28: {
                              if (var23 >= 0) {
                                break L28;
                              } else {
                                var23 = 0;
                                break L28;
                              }
                            }
                            L29: {
                              if (-1 >= (var21 ^ -1)) {
                                break L29;
                              } else {
                                var21 = 0;
                                break L29;
                              }
                            }
                            L30: {
                              var21 = 250 + -(var21 * 10);
                              var22 = 250 - 10 * var22;
                              var23 = -(var23 * 10) + 250;
                              if (var24 < 0) {
                                var24 = 0;
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            L31: {
                              var24 = 250 + -(var24 * 10);
                              if (var21 != var22) {
                                break L31;
                              } else {
                                if (var23 != var21) {
                                  break L31;
                                } else {
                                  if (var24 != var21) {
                                    break L31;
                                  } else {
                                    si.a(var8, var9, 24, 24, 0, var21);
                                    var17++;
                                    continue L2;
                                  }
                                }
                              }
                            }
                            var28 = 0;
                            L32: while (true) {
                              if (-25 < (var28 ^ -1)) {
                                var26 = (24 - var28) * var23 + var28 * var24 >> 584784900;
                                var25 = var21 * (24 + -var28) + var22 * var28 >> -616109340;
                                var29 = 0;
                                L33: while (true) {
                                  if (24 <= var29) {
                                    var28 += 6;
                                    continue L32;
                                  } else {
                                    var20 = (24 + -var29) * var25 + var26 * var29 >> 1686761252;
                                    si.a(var8 + var28, var29 + var9, 6, 6, 0, var20);
                                    var29 += 6;
                                    continue L33;
                                  }
                                }
                              } else {
                                var17++;
                                continue L2;
                              }
                            }
                          } else {
                            var17++;
                            continue L2;
                          }
                        } else {
                          break L16;
                        }
                      }
                    }
                  }
                }
                if (var21 == 0) {
                  if (var22 == 0) {
                    if (0 == var23) {
                      if (var24 == 0) {
                        L34: {
                          if (var13[var7]) {
                            break L34;
                          } else {
                            if (var14[var7]) {
                              break L34;
                            } else {
                              var17++;
                              continue L2;
                            }
                          }
                        }
                        var27.a(var8, var9, 24, 24);
                        var17++;
                        continue L2;
                      } else {
                        var17++;
                        continue L2;
                      }
                    } else {
                      var17++;
                      continue L2;
                    }
                  } else {
                    var17++;
                    continue L2;
                  }
                } else {
                  var17++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        param0--;
        param0 = param0 | param0 >>> 510507425;
        param0 = param0 | param0 >>> 1601519202;
        param0 = param0 | param0 >>> -277196572;
        param0 = param0 | param0 >>> -2047848920;
        if (param1 != -1) {
            qa.a(-95, 16, -125, 100, -24, -56, 98);
        }
        param0 = param0 | param0 >>> -138262160;
        return 1 + param0;
    }

    final static void a(boolean param0, byte param1, String param2) {
        md.field_i = param0 ? true : false;
        eh.field_e = true;
        if (param1 > -19) {
            field_b = -46;
        }
        jj.field_d = new dg(im.field_e, pe.field_eb, param2, li.field_o, md.field_i);
        im.field_e.c((ag) (Object) jj.field_d, 101);
    }

    final static void a(boolean param0) {
        if (-tk.field_d + 0 != tk.field_e) {
            if (tk.field_e != 250 + -tk.field_d) {
            }
        }
        tk.field_e = tk.field_e + 1;
        if (!param0) {
            Object var2 = null;
            boolean discarded$0 = qa.a((int[]) null, -44, true);
        }
    }

    public static void b(boolean param0) {
        field_d = null;
        field_a = null;
        field_g = null;
        field_f = null;
        field_c = null;
        if (!param0) {
            field_g = null;
        }
    }

    final static boolean a(int[] param0, int param1, boolean param2) {
        if (!param2) {
            qa.a(true);
        }
        return 0 == (param0[param1 >> 1846534725] & 1 << (31 & param1)) ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "If I find whoever is leaving all these crates here ...";
        field_b = 0;
    }
}
