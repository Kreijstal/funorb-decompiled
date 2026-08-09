/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class t extends ma implements mj {
    private wl field_N;
    static int[] field_P;
    static ci[] field_K;
    static boolean field_Q;
    static boolean[][] field_L;
    static int[] field_M;
    private String[] field_O;
    private fb[] field_R;

    final static void a(ln param0, boolean param1, int param2, boolean param3) {
        tl dupTemp$0 = null;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        tl stackIn_23_0 = null;
        tl stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        tl stackIn_29_0 = null;
        tl stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        tl stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        tl stackIn_77_0 = null;
        boolean stackIn_77_1 = false;
        int stackIn_77_2 = 0;
        tl stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        int stackIn_82_1 = 0;
        tl stackIn_85_0 = null;
        tl stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        tl stackIn_90_0 = null;
        tl stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_95_0 = 0;
        tl stackIn_109_0 = null;
        tl stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        tl stackIn_114_0 = null;
        tl stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        tl stackIn_118_0 = null;
        tl stackIn_119_0 = null;
        int stackIn_119_1 = 0;
        tl stackIn_122_0 = null;
        tl stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        String stackIn_141_0 = null;
        tl stackIn_145_0 = null;
        tl stackIn_146_0 = null;
        int stackIn_146_1 = 0;
        tl stackIn_148_0 = null;
        tl stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        int stackIn_155_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_215_0 = 0;
        tl stackIn_317_0 = null;
        boolean stackIn_317_1 = false;
        tl stackIn_318_0 = null;
        boolean stackIn_318_1 = false;
        int stackIn_318_2 = 0;
        tl stackIn_320_0 = null;
        int stackIn_320_1 = 0;
        byte stackIn_320_2 = 0;
        int stackIn_320_3 = 0;
        int stackIn_323_1 = 0;
        tl stackIn_327_0 = null;
        tl stackIn_328_0 = null;
        int stackIn_328_1 = 0;
        tl stackIn_332_0 = null;
        tl stackIn_333_0 = null;
        int stackIn_333_1 = 0;
        RuntimeException stackIn_342_0 = null;
        StringBuilder stackIn_342_1 = null;
        RuntimeException stackIn_343_0 = null;
        StringBuilder stackIn_343_1 = null;
        String stackIn_343_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        tl[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        tl var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        Object var22 = null;
        int var22_int = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        tl var28 = null;
        tl var29 = null;
        tl[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        var26 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (!param1) {
                L2: {
                  if (ci.f(-48)) {
                    if (!param0.field_Vb) {
                      stackIn_12_0 = 1;
                      break L2;
                    } else {
                      stackIn_12_0 = 0;
                      break L2;
                    }
                  } else {
                    stackIn_12_0 = 0;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (ud.field_b) {
                    stackIn_5_0 = 0;
                    break L3;
                  } else {
                    stackIn_5_0 = 1;
                    break L3;
                  }
                }
                var4_int = stackIn_5_0;
                break L1;
              }
            }
            L4: {
              var5 = 0;
              if (param1) {
                break L4;
              } else {
                var6 = 0;
                L5: while (true) {
                  if (5 <= var6) {
                    if (ba.field_P[0][2].field_Db) {
                      if (ci.f(-48)) {
                        pc.field_Mb = th.field_f;
                        break L4;
                      } else {
                        pc.field_Mb = oc.a(jd.field_e, new String[]{pd.field_Rb.field_Gb}, (byte) -54);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L6: {
                      if (var4_int == 0) {
                        break L6;
                      } else {
                        if (ba.field_P[0][1 + var6].field_L == 0) {
                          break L6;
                        } else {
                          if (param0.field_ic != var6) {
                            var5 = 1;
                            param0.field_ic = var6;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      stackIn_23_0 = ba.field_P[0][var6 + 1];

                      if (var4_int == 0) {
                        stackIn_24_0 = (tl) ((Object) stackIn_23_0);
                        stackIn_24_1 = 0;
                        break L7;
                      } else {
                        stackIn_24_0 = (tl) ((Object) stackIn_23_0);
                        stackIn_24_1 = 1;
                        break L7;
                      }
                    }
                    L8: {
                      stackIn_24_0.field_tb = stackIn_24_1 != 0;
                      if (bo.field_c) {
                        break L8;
                      } else {
                        if (-4 != (var6 ^ -1)) {
                          break L8;
                        } else {
                          ba.field_P[0][var6 - -1].field_tb = false;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      stackIn_29_0 = ba.field_P[0][1 + var6];

                      if (var6 != param0.field_ic) {
                        stackIn_30_0 = (tl) ((Object) stackIn_29_0);
                        stackIn_30_1 = 0;
                        break L9;
                      } else {
                        stackIn_30_0 = (tl) ((Object) stackIn_29_0);
                        stackIn_30_1 = 1;
                        break L9;
                      }
                    }
                    stackIn_30_0.field_gb = stackIn_30_1 != 0;
                    var6++;
                    continue L5;
                  }
                }
              }
            }
            L10: {
              if (wn.field_d.length < 2) {
                break L10;
              } else {
                L11: {
                  if (param1) {
                    if (0 != (dl.field_n ^ -1)) {
                      stackIn_43_0 = 1;
                      break L11;
                    } else {
                      stackIn_43_0 = 0;
                      break L11;
                    }
                  } else {
                    stackIn_43_0 = 0;
                    break L11;
                  }
                }
                L12: {
                  var6 = stackIn_43_0;
                  if (var6 == 0) {
                    break L12;
                  } else {
                    var7 = dl.field_n;
                    var8_int = 0;
                    L13: while (true) {
                      if (g.field_f.length <= var8_int) {
                        g.field_f[var7 / 8] = (byte)s.a((int) g.field_f[var7 / 8], 1 << var7 % 8);
                        break L12;
                      } else {
                        g.field_f[var8_int] = (byte) 0;
                        var8_int++;
                        continue L13;
                      }
                    }
                  }
                }
                L14: {
                  if (!param1) {
                    stackIn_51_0 = 0;
                    break L14;
                  } else {
                    stackIn_51_0 = -1;
                    break L14;
                  }
                }
                var7 = stackIn_51_0;
                L15: while (true) {
                  if (wn.field_d.length <= var7) {
                    break L10;
                  } else {
                    L16: {
                      if (var6 != 0) {
                        if (dl.field_n != var7) {
                          stackIn_59_0 = 1;
                          break L16;
                        } else {
                          stackIn_59_0 = 0;
                          break L16;
                        }
                      } else {
                        stackIn_59_0 = 0;
                        break L16;
                      }
                    }
                    L17: {
                      var8_int = stackIn_59_0;
                      if (var4_int == 0) {
                        break L17;
                      } else {
                        if (0 == ba.field_P[1][1 + var7].field_L) {
                          break L17;
                        } else {
                          if (param1) {
                            if (var6 != 0) {
                              break L17;
                            } else {
                              if (0 != (var7 ^ -1)) {
                                g.field_f[var7 / 8] = (byte)dm.a((int) g.field_f[var7 / 8], 1 << ce.a(var7, 7));
                                break L17;
                              } else {
                                var9 = 0;
                                L18: while (true) {
                                  if (g.field_f.length <= var9) {
                                    break L17;
                                  } else {
                                    g.field_f[var9] = (byte) 0;
                                    var9++;
                                    continue L18;
                                  }
                                }
                              }
                            }
                          } else {
                            var9 = wn.field_d[var7];
                            if (param0.field_hc == var9) {
                              break L17;
                            } else {
                              param0.field_hc = var9;
                              var5 = 1;
                              break L17;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (!param1) {
                        L20: {
                          var9 = wn.field_d[var7];
                          stackIn_85_0 = ba.field_P[1][var7 - -1];

                          if (param0.field_hc != var9) {
                            stackIn_86_0 = (tl) ((Object) stackIn_85_0);
                            stackIn_86_1 = 0;
                            break L20;
                          } else {
                            stackIn_86_0 = (tl) ((Object) stackIn_85_0);
                            stackIn_86_1 = 1;
                            break L20;
                          }
                        }
                        stackIn_86_0.field_gb = stackIn_86_1 != 0;
                        break L19;
                      } else {
                        if (0 != (var7 ^ -1)) {
                          stackIn_79_0 = ba.field_P[1][var7 + 1];
                          stackIn_79_1 = -1;
                          stackIn_79_2 = g.field_f[var7 / 8] & 1 << (7 & var7);
                          stackIn_79_3 = -1;
                          L21: {


                            if (stackIn_79_1 == (stackIn_79_2 ^ stackIn_79_3)) {
                              stackIn_79_0 = (tl) ((Object) stackIn_79_0);
                              stackIn_82_1 = 0;
                              break L21;
                            } else {
                              stackIn_79_0 = (tl) ((Object) stackIn_79_0);
                              stackIn_82_1 = 1;
                              break L21;
                            }
                          }
                          stackIn_79_0.field_gb = stackIn_82_1 != 0;
                          break L19;
                        } else {
                          ba.field_P[1][var7 - -1].field_gb = true;
                          var9 = 0;
                          L22: while (true) {
                            if (var9 >= wn.field_d.length) {
                              break L19;
                            } else {
                              L23: {
                                dupTemp$0 = ba.field_P[1][var7 + 1];
                                stackIn_76_0 = (tl) (dupTemp$0);

                                stackIn_76_1 = dupTemp$0.field_gb;

                                if (-1 != (g.field_f[var9 / 8] & 1 << (7 & var9) ^ -1)) {
                                  stackIn_77_0 = (tl) ((Object) stackIn_76_0);
                                  stackIn_77_1 = stackIn_76_1;
                                  stackIn_77_2 = 0;
                                  break L23;
                                } else {
                                  stackIn_77_0 = (tl) ((Object) stackIn_76_0);
                                  stackIn_77_1 = stackIn_76_1;
                                  stackIn_77_2 = 1;
                                  break L23;
                                }
                              }
                              stackIn_77_0.field_gb = stackIn_77_1 & stackIn_77_2 != 0;
                              var9++;
                              continue L22;
                            }
                          }
                        }
                      }
                    }
                    L24: {
                      L25: {
                        stackIn_90_0 = ba.field_P[1][1 + var7];

                        if (var4_int == 0) {
                          break L25;
                        } else {
                          stackIn_90_0 = (tl) ((Object) stackIn_90_0);

                          if (var8_int != 0) {
                            break L25;
                          } else {
                            stackIn_91_0 = (tl) ((Object) stackIn_90_0);
                            stackIn_91_1 = 1;
                            break L24;
                          }
                        }
                      }
                      stackIn_91_0 = (tl) ((Object) stackIn_90_0);
                      stackIn_91_1 = 0;
                      break L24;
                    }
                    stackIn_91_0.field_tb = stackIn_91_1 != 0;
                    var7++;
                    continue L15;
                  }
                }
              }
            }
            L26: {
              if (!param1) {
                stackIn_95_0 = 1;
                break L26;
              } else {
                stackIn_95_0 = 0;
                break L26;
              }
            }
            var6 = stackIn_95_0;
            L27: while (true) {
              if ((var6 ^ -1) <= -4) {
                L28: {
                  if (param3) {
                    break L28;
                  } else {
                    t.a(107);
                    break L28;
                  }
                }
                L29: {
                  if (!param1) {
                    break L29;
                  } else {
                    if (1 < un.field_q) {
                      var6 = 0;
                      L30: while (true) {
                        if (1 + un.field_q <= var6) {
                          break L29;
                        } else {
                          L31: {
                            var29 = ba.field_P[3][var6];
                            if (var4_int == 0) {
                              break L31;
                            } else {
                              if (var29.field_L != 0) {
                                qd.field_u = var6;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            if (!var29.field_Db) {
                              break L32;
                            } else {
                              if (-1 > (var6 ^ -1)) {
                                L33: {
                                  if (db.field_m == null) {
                                    stackIn_141_0 = null;
                                    break L33;
                                  } else {
                                    stackIn_141_0 = db.field_m[var6 + -1];
                                    break L33;
                                  }
                                }
                                var8 = stackIn_141_0;
                                if (var8 == null) {
                                  break L32;
                                } else {
                                  pc.field_Mb = var8;
                                  break L32;
                                }
                              } else {
                                break L32;
                              }
                            }
                          }
                          L34: {
                            stackIn_145_0 = (tl) (var29);

                            if (qd.field_u != var6) {
                              stackIn_146_0 = (tl) ((Object) stackIn_145_0);
                              stackIn_146_1 = 0;
                              break L34;
                            } else {
                              stackIn_146_0 = (tl) ((Object) stackIn_145_0);
                              stackIn_146_1 = 1;
                              break L34;
                            }
                          }
                          L35: {
                            stackIn_146_0.field_gb = stackIn_146_1 != 0;
                            stackIn_148_0 = (tl) (var29);

                            if (var4_int == 0) {
                              stackIn_149_0 = (tl) ((Object) stackIn_148_0);
                              stackIn_149_1 = 0;
                              break L35;
                            } else {
                              stackIn_149_0 = (tl) ((Object) stackIn_148_0);
                              stackIn_149_1 = 1;
                              break L35;
                            }
                          }
                          stackIn_149_0.field_tb = stackIn_149_1 != 0;
                          var6++;
                          continue L30;
                        }
                      }
                    } else {
                      break L29;
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L36: while (true) {
                  if (var7 >= qa.field_e) {
                    L37: {
                      if (var5 == 0) {
                        break L37;
                      } else {
                        if (!param1) {
                          si.a(126, param2);
                          break L37;
                        } else {
                          break L37;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L38: {
                      var30 = ba.field_P[var7 + 4];
                      var8_array = var30;
                      if (!param1) {
                        stackIn_155_0 = 0;
                        break L38;
                      } else {
                        stackIn_155_0 = -1;
                        break L38;
                      }
                    }
                    var9 = stackIn_155_0;
                    L39: while (true) {
                      if (var9 >= var30.length + -1) {
                        var6 = var6 + (255 & wk.field_e[var7]);
                        var7++;
                        continue L36;
                      } else {
                        L40: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L40;
                          } else {
                            if ((var9 ^ -1) <= -1) {
                              L41: {
                                if (null == nk.field_r) {
                                  break L41;
                                } else {
                                  if (null == nk.field_r[var7]) {
                                    break L41;
                                  } else {
                                    if (-1 > (nk.field_r[var7][var9] & (cb.field_c ^ -1) ^ -1)) {
                                      var15 = ie.a(nk.field_r[var7][var9] & (cb.field_c ^ -1), (byte) -59);
                                      var14 = 1;
                                      break L41;
                                    } else {
                                      break L41;
                                    }
                                  }
                                }
                              }
                              L42: {
                                if (field_L == null) {
                                  break L42;
                                } else {
                                  if (field_L[var7] != null) {
                                    if (0 < cl.field_d) {
                                      break L42;
                                    } else {
                                      if (field_L[var7][var9]) {
                                        var10 = 1;
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                  } else {
                                    break L42;
                                  }
                                }
                              }
                              L43: {
                                if (null == uj.field_k) {
                                  break L43;
                                } else {
                                  if (uj.field_k[var7] == null) {
                                    break L43;
                                  } else {
                                    L44: {
                                      var16 = uj.field_k[var7][var9];
                                      if ((var16 ^ -1) >= -1) {
                                        break L44;
                                      } else {
                                        if (var16 > fm.field_W) {
                                          var12 = 1;
                                          break L44;
                                        } else {
                                          break L44;
                                        }
                                      }
                                    }
                                    if (-1 == (var16 ^ -1)) {
                                      break L43;
                                    } else {
                                      if (lf.field_U) {
                                        break L43;
                                      } else {
                                        if (0 < cl.field_d) {
                                          break L43;
                                        } else {
                                          var10 = 1;
                                          break L43;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L45: {
                                if (param1) {
                                  if (jc.field_g != null) {
                                    if (jc.field_g[var7] != null) {
                                      if (!jc.field_g[var7][var9]) {
                                        stackIn_192_0 = 0;
                                        break L45;
                                      } else {
                                        stackIn_192_0 = 1;
                                        break L45;
                                      }
                                    } else {
                                      stackIn_192_0 = 0;
                                      break L45;
                                    }
                                  } else {
                                    stackIn_192_0 = 0;
                                    break L45;
                                  }
                                } else {
                                  stackIn_192_0 = 0;
                                  break L45;
                                }
                              }
                              var13 = stackIn_192_0;
                              if (null == il.field_b) {
                                break L40;
                              } else {
                                if (null != il.field_b[var7]) {
                                  L46: {
                                    var16 = il.field_b[var7][var9];
                                    if (var16 <= 0) {
                                      break L46;
                                    } else {
                                      if (var16 <= jf.field_b) {
                                        break L46;
                                      } else {
                                        var11 = 1;
                                        break L46;
                                      }
                                    }
                                  }
                                  if (-1 == (var16 ^ -1)) {
                                    break L40;
                                  } else {
                                    if (lf.field_U) {
                                      break L40;
                                    } else {
                                      if (0 >= cl.field_d) {
                                        var10 = 1;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                  }
                                } else {
                                  break L40;
                                }
                              }
                            } else {
                              break L40;
                            }
                          }
                        }
                        L47: {
                          if ((sk.field_t ^ -1) > -3) {
                            break L47;
                          } else {
                            if (ok.field_Jb[12]) {
                              var11 = 0;
                              var13 = 0;
                              var10 = 0;
                              var14 = 0;
                              var12 = 0;
                              break L47;
                            } else {
                              break L47;
                            }
                          }
                        }
                        L48: {
                          L49: {
                            if (var10 != 0) {
                              break L49;
                            } else {
                              if (var11 != 0) {
                                break L49;
                              } else {
                                if (var12 != 0) {
                                  break L49;
                                } else {
                                  if (var13 != 0) {
                                    break L49;
                                  } else {
                                    if (var14 == 0) {
                                      stackIn_215_0 = 0;
                                      break L48;
                                    } else {
                                      stackIn_215_0 = 1;
                                      break L48;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_215_0 = 1;
                          break L48;
                        }
                        L50: {
                          var16 = stackIn_215_0;
                          pk.field_g = true;
                          if (var16 != 0) {
                            break L50;
                          } else {
                            if (-1 < (var9 ^ -1)) {
                              break L50;
                            } else {
                              if (hd.field_n == null) {
                                break L50;
                              } else {
                                L51: {
                                  if (!param1) {
                                    break L51;
                                  } else {
                                    if (ud.field_b) {
                                      break L50;
                                    } else {
                                      break L51;
                                    }
                                  }
                                }
                                L52: {
                                  d.field_Gb = false;
                                  if (null == d.field_Jb) {
                                    bi.field_d = new boolean[qa.field_e];
                                    d.field_Jb = new byte[qa.field_e];
                                    break L52;
                                  } else {
                                    break L52;
                                  }
                                }
                                pk.field_g = false;
                                var17_int = 0;
                                L53: while (true) {
                                  if (var7 <= var17_int) {
                                    L54: {
                                      b.a(var9, -78, 0, -1, var7, -1, param0, param1);
                                      if ((sk.field_t ^ -1) > -3) {
                                        break L54;
                                      } else {
                                        if (!ok.field_Jb[12]) {
                                          break L54;
                                        } else {
                                          pk.field_g = true;
                                          break L54;
                                        }
                                      }
                                    }
                                    if (pk.field_g) {
                                      break L50;
                                    } else {
                                      var16 = 1;
                                      break L50;
                                    }
                                  } else {
                                    bi.field_d[var17_int] = false;
                                    var17_int++;
                                    continue L53;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L55: {
                          var17 = var8_array[1 + var9];
                          if (var4_int == 0) {
                            break L55;
                          } else {
                            if (var17.field_L == 0) {
                              break L55;
                            } else {
                              if (!param1) {
                                if (var16 != 0) {
                                  break L55;
                                } else {
                                  if (param0.field_sc[var7] == (byte)var9) {
                                    break L55;
                                  } else {
                                    param0.field_sc[var7] = (byte)var9;
                                    var5 = 1;
                                    break L55;
                                  }
                                }
                              } else {
                                if (0 != (var9 ^ -1)) {
                                  fe.field_d[(var9 + var6) / 8] = (byte)dm.a((int) fe.field_d[(var9 + var6) / 8], 1 << ce.a(var9 + var6, 7));
                                  break L55;
                                } else {
                                  var18 = var6;
                                  L56: while (true) {
                                    if (var18 >= var30.length + var6 + -1) {
                                      break L55;
                                    } else {
                                      fe.field_d[var18 / 8] = (byte)ce.a((int) fe.field_d[var18 / 8], 1 << ce.a(var18, 7) ^ -1);
                                      var18++;
                                      continue L56;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L57: {
                          if (!param1) {
                            break L57;
                          } else {
                            if (var16 != 0) {
                              fe.field_d[(var9 + var6) / 8] = (byte)ce.a((int) fe.field_d[(var9 + var6) / 8], 1 << ce.a(var6 + var9, 7) ^ -1);
                              break L57;
                            } else {
                              break L57;
                            }
                          }
                        }
                        L58: {
                          if (-1 < (var9 ^ -1)) {
                            break L58;
                          } else {
                            if (var17.field_Db) {
                              L59: {
                                if (null == ln.field_qc) {
                                  var18_ref = null;
                                  break L59;
                                } else {
                                  if (null == ln.field_qc[var7]) {
                                    var18_ref = null;
                                    break L59;
                                  } else {
                                    var18_ref = ln.field_qc[var7][var9];
                                    break L59;
                                  }
                                }
                              }
                              L60: {
                                if (null == in.field_f) {
                                  var19 = null;
                                  break L60;
                                } else {
                                  if (null != in.field_f[var7]) {
                                    var19 = in.field_f[var7][var9];
                                    break L60;
                                  } else {
                                    var19 = null;
                                    break L60;
                                  }
                                }
                              }
                              L61: {
                                var20 = null;
                                if (var19 == null) {
                                  break L61;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref)) {
                                    var20 = var19;
                                    break L61;
                                  } else {
                                    break L61;
                                  }
                                }
                              }
                              L62: {
                                var21 = null;
                                if (var13 != 0) {
                                  var21 = pe.field_a;
                                  var22 = var21;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var22 = var21;
                                  break L62;
                                } else {
                                  if (var10 == 0) {
                                    L63: {
                                      if (var11 != 0) {
                                        var22_int = il.field_b[var7][var9] + -jf.field_b;
                                        if (-2 == (var22_int ^ -1)) {
                                          var21 = hm.field_a;
                                          break L63;
                                        } else {
                                          var21 = oc.a(ej.field_b, new String[]{Integer.toString(var22_int)}, (byte) -119);
                                          break L63;
                                        }
                                      } else {
                                        break L63;
                                      }
                                    }
                                    L64: {
                                      if (var12 == 0) {
                                        break L64;
                                      } else {
                                        var31 = oc.a(da.field_B, new String[]{Integer.toString(fm.field_W), Integer.toString(uj.field_k[var7][var9])}, (byte) -74);
                                        var22 = var31;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        var22 = var31;
                                        if (var21 != null) {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L64;
                                        } else {
                                          var21 = var31;
                                          break L64;
                                        }
                                      }
                                    }
                                    if (var14 != 0) {
                                      L65: {
                                        var22 = vn.field_Eb;
                                        if ((var15 ^ -1) >= -1) {
                                          break L65;
                                        } else {
                                          if (null == la.field_b) {
                                            break L65;
                                          } else {
                                            if (var15 > la.field_b.length) {
                                              break L65;
                                            } else {
                                              if (la.field_b[var15 + -1] != null) {
                                                var22 = la.field_b[-1 + var15][0];
                                                break L65;
                                              } else {
                                                break L65;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 != null) {
                                        var21 = (String) (var21) + "<br>" + (String) (var22);
                                        break L62;
                                      } else {
                                        var21 = var22;
                                        break L62;
                                      }
                                    } else {
                                      break L62;
                                    }
                                  } else {
                                    var21 = lf.field_Q;
                                    break L62;
                                  }
                                }
                              }
                              L66: {
                                if (var4_int == 0) {
                                  break L66;
                                } else {
                                  if (!pk.field_g) {
                                    L67: {
                                      var22 = null;
                                      if (!d.field_Gb) {
                                        break L67;
                                      } else {
                                        var22 = "</col>" + tm.field_h + "<col=A00000>";
                                        var25 = var22;
                                        var22 = var25;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        break L67;
                                      }
                                    }
                                    var23 = 0;
                                    var24 = 0;
                                    L68: while (true) {
                                      if (var24 >= var7) {
                                        if (var23 != 0) {
                                          var21 = eb.field_G + (String) (var22);
                                          break L66;
                                        } else {
                                          var21 = oc.a(fj.field_b, new String[]{(String) (var22)}, (byte) -100);
                                          break L66;
                                        }
                                      } else {
                                        if (bi.field_d[var24]) {
                                          L69: {
                                            var25_ref = "</col>" + td.field_n[var24] + "<col=A00000>";
                                            var22 = var25_ref;
                                            var21 = var22;
                                            var22 = var25_ref;
                                            if (var22 == null) {
                                              var22 = var25_ref;
                                              var21 = var22;
                                              var21 = var22;
                                              break L69;
                                            } else {
                                              var23 = 1;
                                              var22 = (String) (var22) + ", " + var25_ref;
                                              break L69;
                                            }
                                          }
                                          var24++;
                                          continue L68;
                                        } else {
                                          var24++;
                                          continue L68;
                                        }
                                      }
                                    }
                                  } else {
                                    break L66;
                                  }
                                }
                              }
                              L70: {
                                if (var21 != null) {
                                  var32 = "<col=A00000>" + (String) (var21);
                                  var33 = ia.a("<br>", "<br><col=A00000>", var32, (byte) 107);
                                  if (var20 != null) {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L70;
                                  } else {
                                    var20 = var33;
                                    break L70;
                                  }
                                } else {
                                  break L70;
                                }
                              }
                              if (var20 == null) {
                                break L58;
                              } else {
                                pc.field_Mb = (String) (var20);
                                break L58;
                              }
                            } else {
                              break L58;
                            }
                          }
                        }
                        L71: {
                          if (!param1) {
                            L72: {
                              L73: {
                                stackIn_327_0 = (tl) (var17);

                                if (!pk.field_g) {
                                  break L73;
                                } else {
                                  stackIn_327_0 = (tl) ((Object) stackIn_327_0);

                                  if (param0.field_sc[var7] != (byte)var9) {
                                    break L73;
                                  } else {
                                    stackIn_328_0 = (tl) ((Object) stackIn_327_0);
                                    stackIn_328_1 = 1;
                                    break L72;
                                  }
                                }
                              }
                              stackIn_328_0 = (tl) ((Object) stackIn_327_0);
                              stackIn_328_1 = 0;
                              break L72;
                            }
                            stackIn_328_0.field_gb = stackIn_328_1 != 0;
                            break L71;
                          } else {
                            if (-1 != var9) {
                              stackIn_320_0 = (tl) (var17);
                              stackIn_320_1 = 0;
                              stackIn_320_2 = fe.field_d[(var6 + var9) / 8];
                              stackIn_320_3 = 1 << (var6 + var9 & 7);
                              L74: {


                                if (stackIn_320_1 == (stackIn_320_2 & stackIn_320_3)) {
                                  stackIn_320_0 = (tl) ((Object) stackIn_320_0);
                                  stackIn_323_1 = 0;
                                  break L74;
                                } else {
                                  stackIn_320_0 = (tl) ((Object) stackIn_320_0);
                                  stackIn_323_1 = 1;
                                  break L74;
                                }
                              }
                              stackIn_320_0.field_gb = stackIn_323_1 != 0;
                              break L71;
                            } else {
                              var17.field_gb = true;
                              var27 = var6;
                              var18 = var27;
                              L75: while (true) {
                                if (var27 >= var30.length + (var6 - 1)) {
                                  break L71;
                                } else {
                                  L76: {
                                    stackIn_317_0 = (tl) (var17);

                                    stackIn_317_1 = var17.field_gb;

                                    if (-1 != (fe.field_d[var27 / 8] & 1 << (7 & var27) ^ -1)) {
                                      stackIn_318_0 = (tl) ((Object) stackIn_317_0);
                                      stackIn_318_1 = stackIn_317_1;
                                      stackIn_318_2 = 0;
                                      break L76;
                                    } else {
                                      stackIn_318_0 = (tl) ((Object) stackIn_317_0);
                                      stackIn_318_1 = stackIn_317_1;
                                      stackIn_318_2 = 1;
                                      break L76;
                                    }
                                  }
                                  stackIn_318_0.field_gb = stackIn_318_1 & stackIn_318_2 != 0;
                                  var27++;
                                  continue L75;
                                }
                              }
                            }
                          }
                        }
                        L77: {
                          L78: {
                            stackIn_332_0 = (tl) (var17);

                            if (var4_int == 0) {
                              break L78;
                            } else {
                              stackIn_332_0 = (tl) ((Object) stackIn_332_0);

                              if (var16 != 0) {
                                break L78;
                              } else {
                                stackIn_333_0 = (tl) ((Object) stackIn_332_0);
                                stackIn_333_1 = 1;
                                break L77;
                              }
                            }
                          }
                          stackIn_333_0 = (tl) ((Object) stackIn_332_0);
                          stackIn_333_1 = 0;
                          break L77;
                        }
                        stackIn_333_0.field_tb = stackIn_333_1 != 0;
                        var9++;
                        continue L39;
                      }
                    }
                  }
                }
              } else {
                L79: {
                  var28 = ba.field_P[2][var6];
                  if (var4_int == 0) {
                    break L79;
                  } else {
                    if (-1 != (var28.field_L ^ -1)) {
                      if (param1) {
                        if (-1 == (var6 ^ -1)) {
                          p.field_n = 0;
                          break L79;
                        } else {
                          p.field_n = p.field_n ^ var6;
                          break L79;
                        }
                      } else {
                        if (param0.field_Mb == var6) {
                          break L79;
                        } else {
                          param0.field_Mb = var6;
                          var5 = 1;
                          break L79;
                        }
                      }
                    } else {
                      break L79;
                    }
                  }
                }
                L80: {
                  if (param1) {
                    if (var6 != 0) {
                      L81: {
                        stackIn_118_0 = (tl) (var28);

                        if (-1 == (var6 & p.field_n ^ -1)) {
                          stackIn_119_0 = (tl) ((Object) stackIn_118_0);
                          stackIn_119_1 = 0;
                          break L81;
                        } else {
                          stackIn_119_0 = (tl) ((Object) stackIn_118_0);
                          stackIn_119_1 = 1;
                          break L81;
                        }
                      }
                      stackIn_119_0.field_gb = stackIn_119_1 != 0;
                      break L80;
                    } else {
                      L82: {
                        stackIn_114_0 = (tl) (var28);

                        if (-1 != (p.field_n ^ -1)) {
                          stackIn_115_0 = (tl) ((Object) stackIn_114_0);
                          stackIn_115_1 = 0;
                          break L82;
                        } else {
                          stackIn_115_0 = (tl) ((Object) stackIn_114_0);
                          stackIn_115_1 = 1;
                          break L82;
                        }
                      }
                      stackIn_115_0.field_gb = stackIn_115_1 != 0;
                      break L80;
                    }
                  } else {
                    L83: {
                      stackIn_109_0 = (tl) (var28);

                      if (0 == (param0.field_Mb & var6)) {
                        stackIn_110_0 = (tl) ((Object) stackIn_109_0);
                        stackIn_110_1 = 0;
                        break L83;
                      } else {
                        stackIn_110_0 = (tl) ((Object) stackIn_109_0);
                        stackIn_110_1 = 1;
                        break L83;
                      }
                    }
                    stackIn_110_0.field_gb = stackIn_110_1 != 0;
                    break L80;
                  }
                }
                L84: {
                  stackIn_122_0 = (tl) (var28);

                  if (var4_int == 0) {
                    stackIn_123_0 = (tl) ((Object) stackIn_122_0);
                    stackIn_123_1 = 0;
                    break L84;
                  } else {
                    stackIn_123_0 = (tl) ((Object) stackIn_122_0);
                    stackIn_123_1 = 1;
                    break L84;
                  }
                }
                stackIn_123_0.field_tb = stackIn_123_1 != 0;
                var6++;
                continue L27;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L85: {
            var4 = decompiledCaughtException;
            stackIn_342_0 = (RuntimeException) (var4);

            stackIn_342_1 = new StringBuilder().append("t.C(");

            if (param0 == null) {
              stackIn_343_0 = (RuntimeException) ((Object) stackIn_342_0);
              stackIn_343_1 = (StringBuilder) ((Object) stackIn_342_1);
              stackIn_343_2 = "null";
              break L85;
            } else {
              stackIn_343_0 = (RuntimeException) ((Object) stackIn_342_0);
              stackIn_343_1 = (StringBuilder) ((Object) stackIn_342_1);
              stackIn_343_2 = "{...}";
              break L85;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_343_0), stackIn_343_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -89, param3);
        if (0 != param1) {
            return;
        }
        if (param2 > -80) {
            mf var6 = (mf) null;
            this.a('￩', -83, 68, (mf) null);
        }
        lh var5 = rb.field_b;
        if (null != this.field_O) {
            var5.a(ic.field_f, this.field_u + param3, param0 - -this.field_r, this.field_y, 20, 16777215, -1, 0, 0, var5.field_t + var5.field_C);
        }
    }

    t(wl param0) {
        super(0, 0, 0, 0, (jm) null);
        try {
            this.field_N = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "t.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, int param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        wj var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = Chess.field_G;
        try {
          L0: {
            L1: {
              this.field_I.e(-31023);
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_O = new String[var3_int];
                  var4_int = 0;
                  L2: while (true) {
                    if (var3_int <= var4_int) {
                      L3: {
                        if (param1 == -1) {
                          break L3;
                        } else {
                          field_P = (int[]) null;
                          break L3;
                        }
                      }
                      var4 = new wj(rb.field_b, 0, 1);
                      this.field_R = new fb[1 + var3_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var3_int <= var5) {
                          this.field_R[var3_int] = new fb(cn.field_d, (rg) (this));
                          this.field_R[var3_int].field_n = (jm) ((Object) var4);
                          this.field_R[var3_int].a((var3_int + 1) * 16 + 20, 34, 15, 100, 0);
                          this.b(this.field_R[var3_int], 95);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_R[var5] = new fb(this.field_O[var5], (rg) (this));
                          this.field_R[var5].field_n = (jm) ((Object) var4);
                          this.field_R[var5].field_j = ih.field_Y;
                          this.field_R[var5].a(var5 * 16 + 20, 34, 15, 80, 0);
                          this.b(this.field_R[var5], 95);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_O[var4_int] = rl.a((CharSequence) ((Object) param0[var4_int]), (byte) -70).replace(' ', ' ');
                      var4_int++;
                      continue L2;
                    }
                  }
                }
              }
            }
            this.field_O = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("t.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(fb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (param4 == -24221) {
                break L1;
              } else {
                this.a(59, -126, 113, 15);
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (this.field_O.length <= var6_int) {
                L3: {
                  if (this.field_R[this.field_O.length] == param0) {
                    this.field_N.a(120);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (param0 != this.field_R[var6_int]) {
                    break L4;
                  } else {
                    this.field_N.a(this.field_O[var6_int], (byte) -121);
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("t.DA(");

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
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 8) {
            return;
        }
        field_P = null;
        field_K = null;
        field_M = null;
        field_L = (boolean[][]) null;
    }

    final boolean a(char param0, int param1, int param2, mf param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 != (param1 ^ -1)) {
                if ((param1 ^ -1) != -100) {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = this.a(param3, (byte) -73);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = this.a(param3, 27964);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var5);

            stackIn_14_1 = new StringBuilder().append("t.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    static {
        field_P = new int[]{64, 48};
        field_Q = true;
        field_M = new int[8192];
    }
}
