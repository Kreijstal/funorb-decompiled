/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static String field_h;
    static volatile boolean field_f;
    static int[] field_c;
    static String field_g;
    static km field_a;
    static bn field_e;
    static int field_d;
    static ta field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ln param6, boolean param7) {
        int var8_int = 0;
        tl[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        tl var13 = null;
        int var14 = 0;
        int var15 = 0;
        tl[] var16 = null;
        int[] var17 = null;
        tl[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        tl[][] stackIn_33_0 = null;
        tl[][] stackIn_34_0 = null;
        tl[][] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        int stackIn_70_0 = 0;
        tl[][] stackOut_32_0 = null;
        tl[][] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        tl[][] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_69_0 = 0;
        int stackOut_68_0 = 0;
        L0: {
          var15 = Chess.field_G;
          if (param4 > param3) {
            L1: {
              stackOut_32_0 = ba.field_P;
              stackIn_34_0 = stackOut_32_0;
              stackIn_33_0 = stackOut_32_0;
              if ((param3 ^ -1) == 0) {
                stackOut_34_0 = (tl[][]) (Object) stackIn_34_0;
                stackOut_34_1 = 1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                break L1;
              } else {
                stackOut_33_0 = (tl[][]) (Object) stackIn_33_0;
                stackOut_33_1 = 4 + param3;
                stackIn_35_0 = stackOut_33_0;
                stackIn_35_1 = stackOut_33_1;
                break L1;
              }
            }
            L2: {
              var16 = stackIn_35_0[stackIn_35_1];
              var18 = var16;
              var8 = var18;
              var9 = 1;
              if (param7) {
                if (0 != (param3 ^ -1)) {
                  var16 = var18;
                  var10 = 0;
                  L3: while (true) {
                    L4: {
                      if (var16.length - 1 <= var10) {
                        break L4;
                      } else {
                        if (0 != (fe.field_d[(var10 + param2) / 8] & 1 << (var10 + param2 & 7))) {
                          var9 = 0;
                          break L4;
                        } else {
                          var10++;
                          continue L3;
                        }
                      }
                    }
                    param2 = param2 + (255 & wk.field_e[param3]);
                    break L2;
                  }
                } else {
                  var10 = 0;
                  L5: while (true) {
                    if (var10 >= wn.field_d.length) {
                      break L2;
                    } else {
                      if ((g.field_f[var10 / 8] & 1 << (var10 & 7)) != 0) {
                        var9 = 0;
                        break L2;
                      } else {
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            var10 = 0;
            var11 = 0;
            L6: while (true) {
              L7: {
                stackOut_52_0 = var11;
                stackIn_54_0 = stackOut_52_0;
                stackIn_53_0 = stackOut_52_0;
                if (-1 != param3) {
                  stackOut_54_0 = stackIn_54_0;
                  stackOut_54_1 = -1 + var18.length;
                  stackIn_55_0 = stackOut_54_0;
                  stackIn_55_1 = stackOut_54_1;
                  break L7;
                } else {
                  stackOut_53_0 = stackIn_53_0;
                  stackOut_53_1 = wn.field_d.length;
                  stackIn_55_0 = stackOut_53_0;
                  stackIn_55_1 = stackOut_53_1;
                  break L7;
                }
              }
              if (stackIn_55_0 >= stackIn_55_1) {
                if (var10 != 0) {
                  break L0;
                } else {
                  var11 = 0;
                  L8: while (true) {
                    if (var11 >= var18.length + -1) {
                      break L0;
                    } else {
                      L9: {
                        if (0 != (param3 ^ -1)) {
                          d.field_Jb[param3] = (byte)var11;
                          break L9;
                        } else {
                          param5 = var11;
                          break L9;
                        }
                      }
                      b.a(param0, -56, param2, param3 + 1, param4, param5, param6, param7);
                      if (pk.field_g) {
                        return;
                      } else {
                        var11++;
                        continue L8;
                      }
                    }
                  }
                }
              } else {
                L10: {
                  if (param3 != -1) {
                    d.field_Jb[param3] = (byte)var11;
                    break L10;
                  } else {
                    param5 = var11;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    if (param3 != -1) {
                      break L12;
                    } else {
                      if (wn.field_d.length == 1) {
                        var12 = 1;
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var13 = var8[var11 + 1];
                  if (param7) {
                    if (!var13.field_gb) {
                      if (var9 != 0) {
                        if (var13.field_tb) {
                          var12 = 1;
                          break L11;
                        } else {
                          var12 = 0;
                          break L11;
                        }
                      } else {
                        var12 = 0;
                        break L11;
                      }
                    } else {
                      var12 = 1;
                      break L11;
                    }
                  } else {
                    if (param3 == -1) {
                      L13: {
                        if (pd.field_Rb.field_hc != wn.field_d[var11]) {
                          stackOut_69_0 = 0;
                          stackIn_70_0 = stackOut_69_0;
                          break L13;
                        } else {
                          stackOut_68_0 = 1;
                          stackIn_70_0 = stackOut_68_0;
                          break L13;
                        }
                      }
                      var12 = stackIn_70_0;
                      break L11;
                    } else {
                      if (var11 != (pd.field_Rb.field_sc[param3] & 255)) {
                        var12 = 0;
                        break L11;
                      } else {
                        var12 = 1;
                        break L11;
                      }
                    }
                  }
                }
                L14: {
                  if (var12 != 0) {
                    b.a(param0, -43, param2, param3 - -1, param4, param5, param6, param7);
                    var10 = 1;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                if (pk.field_g) {
                  return;
                } else {
                  var11++;
                  continue L6;
                }
              }
            }
          } else {
            var8_int = 1;
            var9 = 0;
            L15: while (true) {
              if (hd.field_n.length <= var9) {
                if (var8_int == 0) {
                  break L0;
                } else {
                  pk.field_g = true;
                  break L0;
                }
              } else {
                var21 = hd.field_n[var9];
                var20 = var21;
                var19 = var20;
                var17 = var19;
                var10_ref_int__ = var17;
                var11 = 0;
                var12 = 0;
                L16: while (true) {
                  if (var21.length <= var12) {
                    L17: {
                      if (var11 != 0) {
                        break L17;
                      } else {
                        if (qa.field_e == param3) {
                          break L17;
                        } else {
                          var9++;
                          continue L15;
                        }
                      }
                    }
                    var8_int = 0;
                    var12 = 0;
                    L18: while (true) {
                      if (var21.length > var12) {
                        var13_int = var21[var12];
                        if ((var13_int ^ -1) != 0) {
                          if (var13_int < param3) {
                            bi.field_d[var13_int] = true;
                            var12 += 2;
                            continue L18;
                          } else {
                            var12 += 2;
                            continue L18;
                          }
                        } else {
                          d.field_Gb = true;
                          var12 += 2;
                          continue L18;
                        }
                      } else {
                        var9++;
                        continue L15;
                      }
                    }
                  } else {
                    var13_int = var21[var12];
                    var14 = var10_ref_int__[var12 - -1];
                    if (0 != (var13_int ^ -1)) {
                      L19: {
                        if (var13_int != param3) {
                          break L19;
                        } else {
                          if (var14 != param0) {
                            break L19;
                          } else {
                            var11 = 1;
                            var12 += 2;
                            continue L16;
                          }
                        }
                      }
                      if (var13_int < param3) {
                        L20: {
                          if ((255 & d.field_Jb[var13_int]) == var14) {
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                        var12 += 2;
                        continue L16;
                      } else {
                        var9++;
                        continue L15;
                      }
                    } else {
                      if (var14 != wn.field_d[param5]) {
                        var9++;
                        continue L15;
                      } else {
                        var12 += 2;
                        continue L16;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        L21: {
          if (param1 <= -40) {
            break L21;
          } else {
            field_c = null;
            break L21;
          }
        }
    }

    final static void a(boolean param0) {
        if (null == rm.field_R) {
            return;
        }
        kl.a((java.awt.Canvas) (Object) rm.field_R, (byte) -114);
        rm.field_R.a(oc.field_l, -3);
        if (!param0) {
            field_f = false;
        }
        rm.field_R = null;
        if (null != ch.field_gb) {
            ch.field_gb.c((byte) -103);
        }
        ja.field_h.requestFocus();
    }

    public static void a(int param0) {
        field_b = null;
        field_h = null;
        field_g = null;
        field_e = null;
        if (param0 != -17436) {
            field_b = null;
        }
        field_a = null;
        field_c = null;
    }

    final static void a(int param0, byte[] param1) {
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
        p var16 = null;
        p var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_34_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackOut_33_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        var15 = Chess.field_G;
        var16 = new p(param1);
        var17 = var16;
        var17.field_l = -2 + param1.length;
        h.field_n = var17.f(674914976);
        wm.field_b = new int[h.field_n];
        a.field_c = new int[h.field_n];
        gg.field_y = new byte[h.field_n][];
        in.field_c = new boolean[h.field_n];
        vk.field_d = new byte[h.field_n][];
        be.field_a = new int[h.field_n];
        field_c = new int[h.field_n];
        var17.field_l = -(8 * h.field_n) + -7 + param1.length;
        cd.field_p = var17.f(674914976);
        ek.field_a = var17.f(674914976);
        var3 = (var17.i(-127) & 255) + 1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (var4 >= h.field_n) {
              break L1;
            } else {
              be.field_a[var4] = var16.f(674914976);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (var4 >= h.field_n) {
                break L3;
              } else {
                a.field_c[var4] = var16.f(674914976);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (var4 >= h.field_n) {
                  break L5;
                } else {
                  wm.field_b[var4] = var16.f(674914976);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              var4 = 0;
              L6: while (true) {
                L7: {
                  if (h.field_n <= var4) {
                    break L7;
                  } else {
                    field_c[var4] = var16.f(674914976);
                    var4++;
                    if (0 == 0) {
                      continue L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var17.field_l = -(h.field_n * 8) + -7 + (param1.length - 3 * (-1 + var3));
                uh.field_r = new int[var3];
                var4 = 1;
                L8: while (true) {
                  L9: {
                    if (var3 <= var4) {
                      break L9;
                    } else {
                      L10: {
                        uh.field_r[var4] = var16.k(1389913160);
                        if ((uh.field_r[var4] ^ -1) == -1) {
                          uh.field_r[var4] = 1;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L8;
                      } else {
                        break L9;
                      }
                    }
                  }
                  var17.field_l = 0;
                  var4 = 0;
                  if (param0 > 104) {
                    L11: while (true) {
                      L12: {
                        if (var4 >= h.field_n) {
                          break L12;
                        } else {
                          L13: {
                            L14: {
                              var5 = wm.field_b[var4];
                              var6 = field_c[var4];
                              var7 = var6 * var5;
                              var24 = new byte[var7];
                              var22 = var24;
                              var20 = var22;
                              var18 = var20;
                              var8 = var18;
                              vk.field_d[var4] = var24;
                              var25 = new byte[var7];
                              var23 = var25;
                              var21 = var23;
                              var19 = var21;
                              var9 = var19;
                              gg.field_y[var4] = var25;
                              var10 = 0;
                              var11 = var17.i(-104);
                              if ((1 & var11) != 0) {
                                break L14;
                              } else {
                                var12 = 0;
                                L15: while (true) {
                                  L16: {
                                    if (var7 <= var12) {
                                      break L16;
                                    } else {
                                      var8[var12] = var16.g(0);
                                      var12++;
                                      if (0 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  if (0 == (var11 & 2)) {
                                    break L13;
                                  } else {
                                    var12 = 0;
                                    L17: while (true) {
                                      L18: {
                                        if (var12 >= var7) {
                                          break L18;
                                        } else {
                                          L19: {
                                            byte dupTemp$2 = var16.g(0);
                                            var9[var12] = dupTemp$2;
                                            var13 = dupTemp$2;
                                            stackOut_33_0 = var10;
                                            stackIn_35_0 = stackOut_33_0;
                                            stackIn_34_0 = stackOut_33_0;
                                            if (var13 == -1) {
                                              stackOut_35_0 = stackIn_35_0;
                                              stackOut_35_1 = 0;
                                              stackIn_36_0 = stackOut_35_0;
                                              stackIn_36_1 = stackOut_35_1;
                                              break L19;
                                            } else {
                                              stackOut_34_0 = stackIn_34_0;
                                              stackOut_34_1 = 1;
                                              stackIn_36_0 = stackOut_34_0;
                                              stackIn_36_1 = stackOut_34_1;
                                              break L19;
                                            }
                                          }
                                          var10 = stackIn_36_0 | stackIn_36_1;
                                          var12++;
                                          if (0 == 0) {
                                            continue L17;
                                          } else {
                                            break L18;
                                          }
                                        }
                                      }
                                      if (0 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var12 = 0;
                            L20: while (true) {
                              L21: {
                                if (var5 <= var12) {
                                  break L21;
                                } else {
                                  var13 = 0;
                                  L22: while (true) {
                                    L23: {
                                      if (var13 >= var6) {
                                        break L23;
                                      } else {
                                        var8[var5 * var13 + var12] = var16.g(0);
                                        var13++;
                                        if (0 == 0) {
                                          continue L22;
                                        } else {
                                          break L23;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                              }
                              if ((var11 & 2) == 0) {
                                break L13;
                              } else {
                                var12 = 0;
                                L24: while (true) {
                                  if (var12 >= var5) {
                                    break L13;
                                  } else {
                                    var13 = 0;
                                    L25: while (true) {
                                      L26: {
                                        if (var13 >= var6) {
                                          break L26;
                                        } else {
                                          L27: {
                                            byte dupTemp$3 = var16.g(0);
                                            var9[var5 * var13 + var12] = dupTemp$3;
                                            var14 = dupTemp$3;
                                            stackOut_50_0 = var10;
                                            stackIn_52_0 = stackOut_50_0;
                                            stackIn_51_0 = stackOut_50_0;
                                            if ((var14 ^ -1) == 0) {
                                              stackOut_52_0 = stackIn_52_0;
                                              stackOut_52_1 = 0;
                                              stackIn_53_0 = stackOut_52_0;
                                              stackIn_53_1 = stackOut_52_1;
                                              break L27;
                                            } else {
                                              stackOut_51_0 = stackIn_51_0;
                                              stackOut_51_1 = 1;
                                              stackIn_53_0 = stackOut_51_0;
                                              stackIn_53_1 = stackOut_51_1;
                                              break L27;
                                            }
                                          }
                                          var10 = stackIn_53_0 | stackIn_53_1;
                                          var13++;
                                          if (0 == 0) {
                                            continue L25;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var12++;
                                      if (0 == 0) {
                                        continue L24;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          in.field_c[var4] = var10 != 0;
                          var4++;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static boolean a(char param0, byte param1) {
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param1 == 104) {
          L0: {
            L1: {
              L2: {
                if (param0 < 65) {
                  break L2;
                } else {
                  if (param0 <= 90) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (97 > param0) {
                  break L3;
                } else {
                  if (122 < param0) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            }
            stackOut_8_0 = 1;
            stackIn_10_0 = stackOut_8_0;
            break L0;
          }
          return stackIn_10_0 != 0;
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = true;
        field_a = null;
        field_h = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_g = "Searching for opponents";
    }
}
