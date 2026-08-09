/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class vf {
    private short[] field_g;
    static String field_h;
    static wk[] field_j;
    private int field_d;
    static String field_e;
    private int field_a;
    private short[] field_k;
    int field_b;
    static String field_c;
    static String field_l;
    static int field_f;
    private int field_i;

    abstract void b(int param0, int param1, int param2);

    final static void a(int param0, int param1) {
        tg.field_a = param1;
        if (param0 != 0) {
            field_f = -108;
        }
        pg.field_f = cj.field_h;
    }

    private final void b(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        this.field_g = new short[this.field_b];
        int var2 = 0;
        int var3 = -49 / ((-69 - param0) / 56);
        while (var2 < this.field_b) {
            this.field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
            var2++;
        }
    }

    final static void a(int param0, boolean param1, int param2, au param3) {
        nf dupTemp$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        nf stackIn_35_0 = null;
        nf stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        nf stackIn_41_0 = null;
        nf stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_55_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_72_0 = 0;
        nf stackIn_90_0 = null;
        nf stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        nf stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        nf stackIn_97_0 = null;
        boolean stackIn_97_1 = false;
        int stackIn_97_2 = 0;
        nf stackIn_100_0 = null;
        nf stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        nf stackIn_105_0 = null;
        nf stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_110_0 = 0;
        nf stackIn_123_0 = null;
        nf stackIn_124_0 = null;
        int stackIn_124_1 = 0;
        nf stackIn_128_0 = null;
        nf stackIn_129_0 = null;
        int stackIn_129_1 = 0;
        nf stackIn_132_0 = null;
        nf stackIn_133_0 = null;
        int stackIn_133_1 = 0;
        nf stackIn_136_0 = null;
        nf stackIn_137_0 = null;
        int stackIn_137_1 = 0;
        String stackIn_153_0 = null;
        nf stackIn_158_0 = null;
        nf stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        nf stackIn_161_0 = null;
        nf stackIn_162_0 = null;
        int stackIn_162_1 = 0;
        int stackIn_170_0 = 0;
        int stackIn_217_0 = 0;
        int stackIn_230_0 = 0;
        nf stackIn_327_0 = null;
        nf stackIn_328_0 = null;
        int stackIn_328_1 = 0;
        nf stackIn_334_0 = null;
        boolean stackIn_334_1 = false;
        nf stackIn_335_0 = null;
        boolean stackIn_335_1 = false;
        int stackIn_335_2 = 0;
        nf stackIn_337_0 = null;
        int stackIn_337_1 = 0;
        int stackIn_337_2 = 0;
        int stackIn_337_3 = 0;
        int stackIn_340_1 = 0;
        nf stackIn_344_0 = null;
        nf stackIn_345_0 = null;
        int stackIn_345_1 = 0;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        RuntimeException stackIn_355_0 = null;
        StringBuilder stackIn_355_1 = null;
        String stackIn_355_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        nf[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        nf var17 = null;
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
        nf var28 = null;
        nf var29 = null;
        nf[] var30 = null;
        String var31 = null;
        String var32 = null;
        var26 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                L2: {
                  if (ua.field_s) {
                    stackIn_12_0 = 0;
                    break L2;
                  } else {
                    stackIn_12_0 = 1;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (vu.b(false)) {
                    if (!param3.field_kc) {
                      stackIn_8_0 = 1;
                      break L3;
                    } else {
                      stackIn_8_0 = 0;
                      break L3;
                    }
                  } else {
                    stackIn_8_0 = 0;
                    break L3;
                  }
                }
                var4_int = stackIn_8_0;
                break L1;
              }
            }
            L4: {
              L5: {
                L6: {
                  var5 = 0;
                  if (!param1) {
                    var6 = 0;
                    L7: while (true) {
                      if (var6 >= 5) {
                        L8: {
                          if (!pu.field_k[0][2].field_jb) {
                            break L8;
                          } else {
                            if (!vu.b(false)) {
                              ad.field_I = fo.a(4800, op.field_a, new String[]{vu.field_M.field_rc});
                              break L8;
                            } else {
                              ad.field_I = ra.field_f;
                              break L8;
                            }
                          }
                        }
                        if ((lm.field_e.length ^ -1) <= -3) {
                          L9: {
                            if (param1) {
                              if (-1 != bp.field_c) {
                                stackIn_55_0 = 1;
                                break L9;
                              } else {
                                stackIn_55_0 = 0;
                                break L9;
                              }
                            } else {
                              stackIn_55_0 = 0;
                              break L9;
                            }
                          }
                          var6 = stackIn_55_0;
                          if (var6 != 0) {
                            var7 = bp.field_c;
                            var8_int = 0;
                            L10: while (true) {
                              if (var8_int >= ln.field_d.length) {
                                break L6;
                              } else {
                                ln.field_d[var8_int] = (byte) 0;
                                var8_int++;
                                continue L10;
                              }
                            }
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        L11: {
                          if (var4_int == 0) {
                            break L11;
                          } else {
                            if (-1 == (pu.field_k[0][var6 - -1].field_yb ^ -1)) {
                              break L11;
                            } else {
                              if (var6 == param3.field_Tb) {
                                break L11;
                              } else {
                                var5 = 1;
                                param3.field_Tb = var6;
                                break L11;
                              }
                            }
                          }
                        }
                        L12: {
                          stackIn_35_0 = pu.field_k[0][1 + var6];

                          if (var4_int == 0) {
                            stackIn_36_0 = (nf) ((Object) stackIn_35_0);
                            stackIn_36_1 = 0;
                            break L12;
                          } else {
                            stackIn_36_0 = (nf) ((Object) stackIn_35_0);
                            stackIn_36_1 = 1;
                            break L12;
                          }
                        }
                        L13: {
                          stackIn_36_0.field_xb = stackIn_36_1 != 0;
                          if (fh.field_c) {
                            break L13;
                          } else {
                            if ((var6 ^ -1) != -4) {
                              break L13;
                            } else {
                              pu.field_k[0][var6 - -1].field_xb = false;
                              break L13;
                            }
                          }
                        }
                        L14: {
                          stackIn_41_0 = pu.field_k[0][1 + var6];

                          if (var6 != param3.field_Tb) {
                            stackIn_42_0 = (nf) ((Object) stackIn_41_0);
                            stackIn_42_1 = 0;
                            break L14;
                          } else {
                            stackIn_42_0 = (nf) ((Object) stackIn_41_0);
                            stackIn_42_1 = 1;
                            break L14;
                          }
                        }
                        stackIn_42_0.field_rb = stackIn_42_1 != 0;
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    if ((lm.field_e.length ^ -1) <= -3) {
                      L15: {
                        if (param1) {
                          if (-1 != bp.field_c) {
                            stackIn_22_0 = 1;
                            break L15;
                          } else {
                            stackIn_22_0 = 0;
                            break L15;
                          }
                        } else {
                          stackIn_22_0 = 0;
                          break L15;
                        }
                      }
                      var6 = stackIn_22_0;
                      if (var6 != 0) {
                        var7 = bp.field_c;
                        var8_int = 0;
                        L16: while (true) {
                          if (var8_int >= ln.field_d.length) {
                            break L6;
                          } else {
                            ln.field_d[var8_int] = (byte) 0;
                            var8_int++;
                            continue L16;
                          }
                        }
                      } else {
                        break L5;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                ln.field_d[var7 / 8] = (byte)oe.c((int) ln.field_d[var7 / 8], 1 << var7 % 8);
                break L5;
              }
              L17: {
                if (param1) {
                  stackIn_64_0 = -1;
                  break L17;
                } else {
                  stackIn_64_0 = 0;
                  break L17;
                }
              }
              var7 = stackIn_64_0;
              L18: while (true) {
                if (var7 >= lm.field_e.length) {
                  break L4;
                } else {
                  L19: {
                    if (var6 != 0) {
                      if (bp.field_c != var7) {
                        stackIn_72_0 = 1;
                        break L19;
                      } else {
                        stackIn_72_0 = 0;
                        break L19;
                      }
                    } else {
                      stackIn_72_0 = 0;
                      break L19;
                    }
                  }
                  L20: {
                    var8_int = stackIn_72_0;
                    if (var4_int == 0) {
                      break L20;
                    } else {
                      if (0 != pu.field_k[1][var7 - -1].field_yb) {
                        if (!param1) {
                          var9 = lm.field_e[var7];
                          if (var9 != param3.field_nc) {
                            param3.field_nc = var9;
                            var5 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          if (var6 == 0) {
                            if (0 != (var7 ^ -1)) {
                              ln.field_d[var7 / 8] = (byte)kf.b((int) ln.field_d[var7 / 8], 1 << rn.a(var7, 7));
                              break L20;
                            } else {
                              var9 = 0;
                              L21: while (true) {
                                if (var9 >= ln.field_d.length) {
                                  break L20;
                                } else {
                                  ln.field_d[var9] = (byte) 0;
                                  var9++;
                                  continue L21;
                                }
                              }
                            }
                          } else {
                            break L20;
                          }
                        }
                      } else {
                        break L20;
                      }
                    }
                  }
                  L22: {
                    if (!param1) {
                      L23: {
                        var9 = lm.field_e[var7];
                        stackIn_100_0 = pu.field_k[1][var7 - -1];

                        if (var9 != param3.field_nc) {
                          stackIn_101_0 = (nf) ((Object) stackIn_100_0);
                          stackIn_101_1 = 0;
                          break L23;
                        } else {
                          stackIn_101_0 = (nf) ((Object) stackIn_100_0);
                          stackIn_101_1 = 1;
                          break L23;
                        }
                      }
                      stackIn_101_0.field_rb = stackIn_101_1 != 0;
                      break L22;
                    } else {
                      if (var7 == -1) {
                        pu.field_k[1][1 + var7].field_rb = true;
                        var9 = 0;
                        L24: while (true) {
                          if (var9 >= lm.field_e.length) {
                            break L22;
                          } else {
                            L25: {
                              dupTemp$0 = pu.field_k[1][var7 - -1];
                              stackIn_96_0 = (nf) (dupTemp$0);

                              stackIn_96_1 = dupTemp$0.field_rb;

                              if (0 != (ln.field_d[var9 / 8] & 1 << (7 & var9))) {
                                stackIn_97_0 = (nf) ((Object) stackIn_96_0);
                                stackIn_97_1 = stackIn_96_1;
                                stackIn_97_2 = 0;
                                break L25;
                              } else {
                                stackIn_97_0 = (nf) ((Object) stackIn_96_0);
                                stackIn_97_1 = stackIn_96_1;
                                stackIn_97_2 = 1;
                                break L25;
                              }
                            }
                            stackIn_97_0.field_rb = stackIn_97_1 & stackIn_97_2 != 0;
                            var9++;
                            continue L24;
                          }
                        }
                      } else {
                        L26: {
                          stackIn_90_0 = pu.field_k[1][var7 - -1];

                          if ((ln.field_d[var7 / 8] & 1 << (var7 & 7)) == 0) {
                            stackIn_91_0 = (nf) ((Object) stackIn_90_0);
                            stackIn_91_1 = 0;
                            break L26;
                          } else {
                            stackIn_91_0 = (nf) ((Object) stackIn_90_0);
                            stackIn_91_1 = 1;
                            break L26;
                          }
                        }
                        stackIn_91_0.field_rb = stackIn_91_1 != 0;
                        break L22;
                      }
                    }
                  }
                  L27: {
                    L28: {
                      stackIn_105_0 = pu.field_k[1][var7 - -1];

                      if (var4_int == 0) {
                        break L28;
                      } else {
                        stackIn_105_0 = (nf) ((Object) stackIn_105_0);

                        if (var8_int != 0) {
                          break L28;
                        } else {
                          stackIn_106_0 = (nf) ((Object) stackIn_105_0);
                          stackIn_106_1 = 1;
                          break L27;
                        }
                      }
                    }
                    stackIn_106_0 = (nf) ((Object) stackIn_105_0);
                    stackIn_106_1 = 0;
                    break L27;
                  }
                  stackIn_106_0.field_xb = stackIn_106_1 != 0;
                  var7++;
                  continue L18;
                }
              }
            }
            L29: {
              if (!param1) {
                stackIn_110_0 = 1;
                break L29;
              } else {
                stackIn_110_0 = 0;
                break L29;
              }
            }
            var6 = stackIn_110_0;
            L30: while (true) {
              if (-4 >= (var6 ^ -1)) {
                L31: {
                  if (!param1) {
                    break L31;
                  } else {
                    if (-2 <= (ei.field_h ^ -1)) {
                      break L31;
                    } else {
                      var6 = 0;
                      L32: while (true) {
                        if (1 + ei.field_h <= var6) {
                          break L31;
                        } else {
                          L33: {
                            var29 = pu.field_k[3][var6];
                            if (var4_int == 0) {
                              break L33;
                            } else {
                              if (-1 != (var29.field_yb ^ -1)) {
                                nh.field_E = var6;
                                break L33;
                              } else {
                                break L33;
                              }
                            }
                          }
                          L34: {
                            if (!var29.field_jb) {
                              break L34;
                            } else {
                              if (0 < var6) {
                                L35: {
                                  if (cj.field_j != null) {
                                    stackIn_153_0 = cj.field_j[var6 + -1];
                                    break L35;
                                  } else {
                                    stackIn_153_0 = null;
                                    break L35;
                                  }
                                }
                                var8 = stackIn_153_0;
                                if (var8 != null) {
                                  ad.field_I = var8;
                                  break L34;
                                } else {
                                  break L34;
                                }
                              } else {
                                break L34;
                              }
                            }
                          }
                          L36: {
                            stackIn_158_0 = (nf) (var29);

                            if (var6 != nh.field_E) {
                              stackIn_159_0 = (nf) ((Object) stackIn_158_0);
                              stackIn_159_1 = 0;
                              break L36;
                            } else {
                              stackIn_159_0 = (nf) ((Object) stackIn_158_0);
                              stackIn_159_1 = 1;
                              break L36;
                            }
                          }
                          L37: {
                            stackIn_159_0.field_rb = stackIn_159_1 != 0;
                            stackIn_161_0 = (nf) (var29);

                            if (var4_int == 0) {
                              stackIn_162_0 = (nf) ((Object) stackIn_161_0);
                              stackIn_162_1 = 0;
                              break L37;
                            } else {
                              stackIn_162_0 = (nf) ((Object) stackIn_161_0);
                              stackIn_162_1 = 1;
                              break L37;
                            }
                          }
                          stackIn_162_0.field_xb = stackIn_162_1 != 0;
                          var6++;
                          continue L32;
                        }
                      }
                    }
                  }
                }
                L38: {
                  var6 = 0;
                  if (param0 == 1) {
                    break L38;
                  } else {
                    field_e = (String) null;
                    break L38;
                  }
                }
                var7 = 0;
                L39: while (true) {
                  if (tq.field_b <= var7) {
                    L40: {
                      L41: {
                        if (var5 == 0) {
                          break L41;
                        } else {
                          if (!param1) {
                            cl.b(5, param2);
                            break L41;
                          } else {
                            break L40;
                          }
                        }
                      }
                      break L40;
                    }
                    break L0;
                  } else {
                    L42: {
                      var30 = pu.field_k[var7 + 4];
                      var8_array = var30;
                      if (param1) {
                        stackIn_170_0 = -1;
                        break L42;
                      } else {
                        stackIn_170_0 = 0;
                        break L42;
                      }
                    }
                    var9 = stackIn_170_0;
                    L43: while (true) {
                      if (var9 >= -1 + var30.length) {
                        var6 = var6 + (255 & t.field_b[var7]);
                        var7++;
                        continue L39;
                      } else {
                        L44: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L44;
                          } else {
                            if (-1 >= (var9 ^ -1)) {
                              L45: {
                                if (sk.field_j == null) {
                                  break L45;
                                } else {
                                  if (sk.field_j[var7] == null) {
                                    break L45;
                                  } else {
                                    if (((ei.field_a ^ -1) & sk.field_j[var7][var9]) > 0) {
                                      var14 = 1;
                                      var15 = fd.a(true, sk.field_j[var7][var9] & (ei.field_a ^ -1));
                                      break L45;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (ep.field_p == null) {
                                  break L46;
                                } else {
                                  if (null == ep.field_p[var7]) {
                                    break L46;
                                  } else {
                                    if (-1 > (df.field_M ^ -1)) {
                                      break L46;
                                    } else {
                                      if (ep.field_p[var7][var9]) {
                                        var10 = 1;
                                        break L46;
                                      } else {
                                        break L46;
                                      }
                                    }
                                  }
                                }
                              }
                              L47: {
                                if (null == iv.field_e) {
                                  break L47;
                                } else {
                                  if (null == iv.field_e[var7]) {
                                    break L47;
                                  } else {
                                    L48: {
                                      var16 = iv.field_e[var7][var9];
                                      if (0 == var16) {
                                        break L48;
                                      } else {
                                        if (bj.field_k) {
                                          break L48;
                                        } else {
                                          if (df.field_M <= 0) {
                                            var10 = 1;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                    if (0 >= var16) {
                                      break L47;
                                    } else {
                                      if (al.field_g >= var16) {
                                        break L47;
                                      } else {
                                        var12 = 1;
                                        break L47;
                                      }
                                    }
                                  }
                                }
                              }
                              L49: {
                                if (null == jv.field_d) {
                                  break L49;
                                } else {
                                  if (jv.field_d[var7] != null) {
                                    L50: {
                                      var16 = jv.field_d[var7][var9];
                                      if (0 >= var16) {
                                        break L50;
                                      } else {
                                        if (var16 <= be.field_s) {
                                          break L50;
                                        } else {
                                          var11 = 1;
                                          break L50;
                                        }
                                      }
                                    }
                                    if (var16 == 0) {
                                      break L49;
                                    } else {
                                      if (bj.field_k) {
                                        break L49;
                                      } else {
                                        if (df.field_M <= 0) {
                                          var10 = 1;
                                          break L49;
                                        } else {
                                          break L49;
                                        }
                                      }
                                    }
                                  } else {
                                    break L49;
                                  }
                                }
                              }
                              L51: {
                                if (param1) {
                                  if (ke.field_b != null) {
                                    if (null != ke.field_b[var7]) {
                                      if (ke.field_b[var7][var9]) {
                                        stackIn_217_0 = 1;
                                        break L51;
                                      } else {
                                        stackIn_217_0 = 0;
                                        break L51;
                                      }
                                    } else {
                                      stackIn_217_0 = 0;
                                      break L51;
                                    }
                                  } else {
                                    stackIn_217_0 = 0;
                                    break L51;
                                  }
                                } else {
                                  stackIn_217_0 = 0;
                                  break L51;
                                }
                              }
                              var13 = stackIn_217_0;
                              break L44;
                            } else {
                              break L44;
                            }
                          }
                        }
                        L52: {
                          if (-3 < (hi.field_j ^ -1)) {
                            break L52;
                          } else {
                            if (br.field_f[12]) {
                              var11 = 0;
                              var12 = 0;
                              var10 = 0;
                              var13 = 0;
                              var14 = 0;
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                        }
                        L53: {
                          L54: {
                            fc.field_a = true;
                            if (var10 != 0) {
                              break L54;
                            } else {
                              if (var11 != 0) {
                                break L54;
                              } else {
                                if (var12 != 0) {
                                  break L54;
                                } else {
                                  if (var13 != 0) {
                                    break L54;
                                  } else {
                                    if (var14 == 0) {
                                      stackIn_230_0 = 0;
                                      break L53;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_230_0 = 1;
                          break L53;
                        }
                        L55: {
                          var16 = stackIn_230_0;
                          if (var16 != 0) {
                            break L55;
                          } else {
                            if (0 > var9) {
                              break L55;
                            } else {
                              if (null == fs.field_d) {
                                break L55;
                              } else {
                                L56: {
                                  if (!param1) {
                                    break L56;
                                  } else {
                                    if (!ua.field_s) {
                                      break L56;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                                L57: {
                                  jp.field_a = false;
                                  fc.field_a = false;
                                  if (null != ur.field_B) {
                                    break L57;
                                  } else {
                                    ur.field_B = new byte[tq.field_b];
                                    dt.field_d = new boolean[tq.field_b];
                                    break L57;
                                  }
                                }
                                var17_int = 0;
                                L58: while (true) {
                                  if (var17_int >= var7) {
                                    L59: {
                                      es.a(0, var7, param3, -1, param1, var9, (byte) 103, -1);
                                      if (-3 < (hi.field_j ^ -1)) {
                                        break L59;
                                      } else {
                                        if (!br.field_f[12]) {
                                          break L59;
                                        } else {
                                          fc.field_a = true;
                                          break L59;
                                        }
                                      }
                                    }
                                    if (fc.field_a) {
                                      break L55;
                                    } else {
                                      var16 = 1;
                                      break L55;
                                    }
                                  } else {
                                    dt.field_d[var17_int] = false;
                                    var17_int++;
                                    continue L58;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L60: {
                          var17 = var8_array[var9 + 1];
                          if (var4_int == 0) {
                            break L60;
                          } else {
                            if (var17.field_yb == 0) {
                              break L60;
                            } else {
                              if (!param1) {
                                if (var16 != 0) {
                                  break L60;
                                } else {
                                  if (param3.field_pc[var7] != (byte)var9) {
                                    var5 = 1;
                                    param3.field_pc[var7] = (byte)var9;
                                    break L60;
                                  } else {
                                    break L60;
                                  }
                                }
                              } else {
                                if (0 == (var9 ^ -1)) {
                                  var18 = var6;
                                  L61: while (true) {
                                    if (var18 >= var30.length + var6 + -1) {
                                      break L60;
                                    } else {
                                      tg.field_d[var18 / 8] = (byte)rn.a((int) tg.field_d[var18 / 8], 1 << rn.a(7, var18) ^ -1);
                                      var18++;
                                      continue L61;
                                    }
                                  }
                                } else {
                                  tg.field_d[(var6 + var9) / 8] = (byte)kf.b((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7));
                                  break L60;
                                }
                              }
                            }
                          }
                        }
                        L62: {
                          if (!param1) {
                            break L62;
                          } else {
                            if (var16 == 0) {
                              break L62;
                            } else {
                              tg.field_d[(var6 + var9) / 8] = (byte)rn.a((int) tg.field_d[(var6 + var9) / 8], 1 << rn.a(var9 + var6, 7) ^ -1);
                              break L62;
                            }
                          }
                        }
                        L63: {
                          if (-1 < (var9 ^ -1)) {
                            break L63;
                          } else {
                            if (!var17.field_jb) {
                              break L63;
                            } else {
                              L64: {
                                if (ll.field_Mb == null) {
                                  var18_ref = null;
                                  break L64;
                                } else {
                                  if (ll.field_Mb[var7] == null) {
                                    var18_ref = null;
                                    break L64;
                                  } else {
                                    var18_ref = ll.field_Mb[var7][var9];
                                    break L64;
                                  }
                                }
                              }
                              L65: {
                                if (wb.field_a == null) {
                                  var19 = null;
                                  break L65;
                                } else {
                                  if (null == wb.field_a[var7]) {
                                    var19 = null;
                                    break L65;
                                  } else {
                                    var19 = wb.field_a[var7][var9];
                                    break L65;
                                  }
                                }
                              }
                              L66: {
                                var20 = null;
                                if (var19 == null) {
                                  break L66;
                                } else {
                                  if (!((String) (var19)).equals(var18_ref)) {
                                    var20 = var19;
                                    break L66;
                                  } else {
                                    break L66;
                                  }
                                }
                              }
                              L67: {
                                var21 = null;
                                if (var13 != 0) {
                                  var21 = sc.field_h;
                                  var22 = var21;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var25 = var21;
                                  var22 = var25;
                                  var25 = var22;
                                  var22 = var25;
                                  var21 = var22;
                                  var22 = var25;
                                  break L67;
                                } else {
                                  if (var10 != 0) {
                                    var21 = gt.field_a;
                                    break L67;
                                  } else {
                                    L68: {
                                      if (var11 == 0) {
                                        break L68;
                                      } else {
                                        var22_int = jv.field_d[var7][var9] - be.field_s;
                                        if (var22_int != 1) {
                                          var21 = fo.a(4800, mg.field_a, new String[]{Integer.toString(var22_int)});
                                          break L68;
                                        } else {
                                          var21 = bt.field_a;
                                          break L68;
                                        }
                                      }
                                    }
                                    L69: {
                                      if (var12 != 0) {
                                        var31 = fo.a(4800, qb.field_k, new String[]{Integer.toString(al.field_g), Integer.toString(iv.field_e[var7][var9])});
                                        var22 = var31;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        var25_ref = var31;
                                        var22 = var25_ref;
                                        if (var21 == null) {
                                          var21 = var31;
                                          break L69;
                                        } else {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L69;
                                        }
                                      } else {
                                        break L69;
                                      }
                                    }
                                    if (var14 != 0) {
                                      L70: {
                                        var22 = md.field_F;
                                        if (-1 <= (var15 ^ -1)) {
                                          break L70;
                                        } else {
                                          if (jl.field_c == null) {
                                            break L70;
                                          } else {
                                            if (var15 > jl.field_c.length) {
                                              break L70;
                                            } else {
                                              if (null != jl.field_c[var15 - 1]) {
                                                var22 = jl.field_c[var15 - 1][0];
                                                break L70;
                                              } else {
                                                break L70;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 != null) {
                                        var21 = (String) (var21) + "<br>" + (String) (var22);
                                        break L67;
                                      } else {
                                        var21 = var22;
                                        break L67;
                                      }
                                    } else {
                                      break L67;
                                    }
                                  }
                                }
                              }
                              L71: {
                                if (var4_int == 0) {
                                  break L71;
                                } else {
                                  if (fc.field_a) {
                                    break L71;
                                  } else {
                                    L72: {
                                      var22 = null;
                                      if (jp.field_a) {
                                        var22 = "</col>" + ep.field_h + "<col=A00000>";
                                        var25 = var22;
                                        var22 = var25;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        break L72;
                                      } else {
                                        break L72;
                                      }
                                    }
                                    var23 = 0;
                                    var24 = 0;
                                    L73: while (true) {
                                      if (var24 >= var7) {
                                        if (var23 == 0) {
                                          var21 = fo.a(4800, ab.field_e, new String[]{(String) (var22)});
                                          break L71;
                                        } else {
                                          var21 = mj.field_a + (String) (var22);
                                          break L71;
                                        }
                                      } else {
                                        L74: {
                                          if (dt.field_d[var24]) {
                                            var25_ref = "</col>" + ob.field_M[var24] + "<col=A00000>";
                                            var22 = var25_ref;
                                            var21 = var22;
                                            var22 = var25_ref;
                                            if (var22 != null) {
                                              var22 = (String) (var22) + ", " + var25_ref;
                                              var21 = var22;
                                              var21 = var22;
                                              var23 = 1;
                                              break L74;
                                            } else {
                                              var22 = var25_ref;
                                              break L74;
                                            }
                                          } else {
                                            break L74;
                                          }
                                        }
                                        var24++;
                                        continue L73;
                                      }
                                    }
                                  }
                                }
                              }
                              L75: {
                                if (var21 == null) {
                                  break L75;
                                } else {
                                  var21 = "<col=A00000>" + (String) (var21);
                                  var32 = dj.a(6609, (String) (var21), "<br>", "<br><col=A00000>");
                                  if (var20 != null) {
                                    var20 = (String) (var20) + "<br>" + var32;
                                    break L75;
                                  } else {
                                    var20 = var32;
                                    break L75;
                                  }
                                }
                              }
                              if (var20 == null) {
                                break L63;
                              } else {
                                ad.field_I = (String) (var20);
                                break L63;
                              }
                            }
                          }
                        }
                        L76: {
                          if (param1) {
                            if (var9 != -1) {
                              stackIn_337_0 = (nf) (var17);
                              stackIn_337_1 = -1;
                              stackIn_337_2 = tg.field_d[(var9 + var6) / 8] & 1 << (var9 + var6 & 7);
                              stackIn_337_3 = -1;
                              L77: {


                                if (stackIn_337_1 == (stackIn_337_2 ^ stackIn_337_3)) {
                                  stackIn_337_0 = (nf) ((Object) stackIn_337_0);
                                  stackIn_340_1 = 0;
                                  break L77;
                                } else {
                                  stackIn_337_0 = (nf) ((Object) stackIn_337_0);
                                  stackIn_340_1 = 1;
                                  break L77;
                                }
                              }
                              stackIn_337_0.field_rb = stackIn_340_1 != 0;
                              break L76;
                            } else {
                              var17.field_rb = true;
                              var27 = var6;
                              var18 = var27;
                              L78: while (true) {
                                if (var30.length + var6 + -1 <= var27) {
                                  break L76;
                                } else {
                                  L79: {
                                    stackIn_334_0 = (nf) (var17);

                                    stackIn_334_1 = var17.field_rb;

                                    if (-1 != (tg.field_d[var27 / 8] & 1 << (var27 & 7) ^ -1)) {
                                      stackIn_335_0 = (nf) ((Object) stackIn_334_0);
                                      stackIn_335_1 = stackIn_334_1;
                                      stackIn_335_2 = 0;
                                      break L79;
                                    } else {
                                      stackIn_335_0 = (nf) ((Object) stackIn_334_0);
                                      stackIn_335_1 = stackIn_334_1;
                                      stackIn_335_2 = 1;
                                      break L79;
                                    }
                                  }
                                  stackIn_335_0.field_rb = stackIn_335_1 & stackIn_335_2 != 0;
                                  var27++;
                                  continue L78;
                                }
                              }
                            }
                          } else {
                            L80: {
                              L81: {
                                stackIn_327_0 = (nf) (var17);

                                if (!fc.field_a) {
                                  break L81;
                                } else {
                                  stackIn_327_0 = (nf) ((Object) stackIn_327_0);

                                  if ((byte)var9 != param3.field_pc[var7]) {
                                    break L81;
                                  } else {
                                    stackIn_328_0 = (nf) ((Object) stackIn_327_0);
                                    stackIn_328_1 = 1;
                                    break L80;
                                  }
                                }
                              }
                              stackIn_328_0 = (nf) ((Object) stackIn_327_0);
                              stackIn_328_1 = 0;
                              break L80;
                            }
                            stackIn_328_0.field_rb = stackIn_328_1 != 0;
                            break L76;
                          }
                        }
                        L82: {
                          L83: {
                            stackIn_344_0 = (nf) (var17);

                            if (var4_int == 0) {
                              break L83;
                            } else {
                              stackIn_344_0 = (nf) ((Object) stackIn_344_0);

                              if (var16 != 0) {
                                break L83;
                              } else {
                                stackIn_345_0 = (nf) ((Object) stackIn_344_0);
                                stackIn_345_1 = 1;
                                break L82;
                              }
                            }
                          }
                          stackIn_345_0 = (nf) ((Object) stackIn_344_0);
                          stackIn_345_1 = 0;
                          break L82;
                        }
                        stackIn_345_0.field_xb = stackIn_345_1 != 0;
                        var9++;
                        continue L43;
                      }
                    }
                  }
                }
              } else {
                L84: {
                  var28 = pu.field_k[2][var6];
                  if (var4_int == 0) {
                    break L84;
                  } else {
                    if (-1 == (var28.field_yb ^ -1)) {
                      break L84;
                    } else {
                      if (param1) {
                        if (var6 == 0) {
                          sm.field_b = 0;
                          break L84;
                        } else {
                          sm.field_b = sm.field_b ^ var6;
                          break L84;
                        }
                      } else {
                        if (var6 != param3.field_ac) {
                          param3.field_ac = var6;
                          var5 = 1;
                          break L84;
                        } else {
                          break L84;
                        }
                      }
                    }
                  }
                }
                L85: {
                  stackIn_123_0 = (nf) (var28);

                  if (var4_int == 0) {
                    stackIn_124_0 = (nf) ((Object) stackIn_123_0);
                    stackIn_124_1 = 0;
                    break L85;
                  } else {
                    stackIn_124_0 = (nf) ((Object) stackIn_123_0);
                    stackIn_124_1 = 1;
                    break L85;
                  }
                }
                L86: {
                  stackIn_124_0.field_xb = stackIn_124_1 != 0;
                  if (!param1) {
                    L87: {
                      stackIn_136_0 = (nf) (var28);

                      if ((var6 & param3.field_ac) == 0) {
                        stackIn_137_0 = (nf) ((Object) stackIn_136_0);
                        stackIn_137_1 = 0;
                        break L87;
                      } else {
                        stackIn_137_0 = (nf) ((Object) stackIn_136_0);
                        stackIn_137_1 = 1;
                        break L87;
                      }
                    }
                    stackIn_137_0.field_rb = stackIn_137_1 != 0;
                    break L86;
                  } else {
                    if (-1 != (var6 ^ -1)) {
                      L88: {
                        stackIn_132_0 = (nf) (var28);

                        if (-1 == (var6 & sm.field_b ^ -1)) {
                          stackIn_133_0 = (nf) ((Object) stackIn_132_0);
                          stackIn_133_1 = 0;
                          break L88;
                        } else {
                          stackIn_133_0 = (nf) ((Object) stackIn_132_0);
                          stackIn_133_1 = 1;
                          break L88;
                        }
                      }
                      stackIn_133_0.field_rb = stackIn_133_1 != 0;
                      break L86;
                    } else {
                      L89: {
                        stackIn_128_0 = (nf) (var28);

                        if (-1 != (sm.field_b ^ -1)) {
                          stackIn_129_0 = (nf) ((Object) stackIn_128_0);
                          stackIn_129_1 = 0;
                          break L89;
                        } else {
                          stackIn_129_0 = (nf) ((Object) stackIn_128_0);
                          stackIn_129_1 = 1;
                          break L89;
                        }
                      }
                      stackIn_129_0.field_rb = stackIn_129_1 != 0;
                      break L86;
                    }
                  }
                }
                var6++;
                continue L30;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L90: {
            var4 = decompiledCaughtException;
            stackIn_354_0 = (RuntimeException) (var4);

            stackIn_354_1 = new StringBuilder().append("vf.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_355_0 = (RuntimeException) ((Object) stackIn_354_0);
              stackIn_355_1 = (StringBuilder) ((Object) stackIn_354_1);
              stackIn_355_2 = "null";
              break L90;
            } else {
              stackIn_355_0 = (RuntimeException) ((Object) stackIn_354_0);
              stackIn_355_1 = (StringBuilder) ((Object) stackIn_354_1);
              stackIn_355_2 = "{...}";
              break L90;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_355_0), stackIn_355_2 + ')');
        }
    }

    public static void c(int param0) {
        field_e = null;
        field_j = null;
        field_l = null;
        if (param0 >= -70) {
            return;
        }
        field_h = null;
        field_c = null;
    }

    final void c(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int[] var25;
        int[] var26;
        int var27;
        int var28;
        int[] var29;
        int[] var30;
        int[] var31;
        int[] var32;
        L0: {
          var28 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param1 == 1) {
            break L0;
          } else {
            field_l = (String) null;
            break L0;
          }
        }
        var31 = new int[param2];
        var29 = var31;
        var25 = var29;
        var27 = 0;
        L1: while (true) {
          if (var27 >= param2) {
            var32 = new int[param0];
            var30 = var32;
            var26 = var30;
            var27 = 0;
            L2: while (true) {
              if (var27 >= param0) {
                this.a(param1 ^ -30419);
                var23 = 0;
                L3: while (true) {
                  if (var23 >= param0) {
                    return;
                  } else {
                    var22 = 0;
                    L4: while (true) {
                      if (var22 >= param2) {
                        var23++;
                        continue L3;
                      } else {
                        var24 = 0;
                        L5: while (true) {
                          if (this.field_b <= var24) {
                            this.a((byte) -127);
                            var22++;
                            continue L4;
                          } else {
                            L6: {
                              var27 = this.field_g[var24] << -417351956;
                              var6 = this.field_a * var27 >> 454290668;
                              var4 = var31[var22] * var27 >> -435855892;
                              var7 = var27 * this.field_d >> 1295093612;
                              var5 = var32[var23] * var27 >> 382859372;
                              var5 = var5 * this.field_d;
                              var4 = var4 * this.field_a;
                              var8 = var4 >> 1539421644;
                              var9 = var8 - -1;
                              var10 = var5 >> 434013004;
                              var8 = var8 & 255;
                              var11 = var10 - -1;
                              var5 = var5 & 4095;
                              if (var9 < var6) {
                                var9 = var9 & 255;
                                break L6;
                              } else {
                                var9 = 0;
                                break L6;
                              }
                            }
                            L7: {
                              var10 = var10 & 255;
                              var4 = var4 & 4095;
                              if (var7 <= var11) {
                                var11 = 0;
                                break L7;
                              } else {
                                var11 = var11 & 255;
                                break L7;
                              }
                            }
                            var14 = var4 - 4096;
                            var13 = mw.field_F[var5];
                            var17 = this.field_k[var11];
                            var15 = var5 + -4096;
                            var16 = this.field_k[var10];
                            var12 = mw.field_F[var4];
                            var18 = ma.a(var4, 3, (int) this.field_k[var16 + var8], var5);
                            var19 = ma.a(var14, 3, (int) this.field_k[var9 - -var16], var5);
                            var20 = (var12 * (var19 - var18) >> -1014869492) + var18;
                            var18 = ma.a(var4, 3, (int) this.field_k[var17 + var8], var15);
                            var19 = ma.a(var14, 3, (int) this.field_k[var17 + var9], var15);
                            var21 = var18 + (var12 * (-var18 + var19) >> 779152012);
                            this.b(var24, (var13 * (-var20 + var21) >> -1297562036) + var20, 19699);
                            var24++;
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                var26[var27] = (var27 << -449439476) / param0;
                var27++;
                continue L2;
              }
            }
          } else {
            var25[var27] = (var27 << 69489804) / param2;
            var27++;
            continue L1;
          }
        }
    }

    final static ru a(int[] param0, int param1, ru param2) {
        ru var3 = null;
        RuntimeException var3_ref = null;
        ru stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -13546) {
                break L1;
              } else {
                field_l = (String) null;
                break L1;
              }
            }
            var3 = new ru(0, 0, 0);
            var3.field_j = param0;
            var3.field_d = param2.field_d;
            var3.field_e = param2.field_e;
            var3.field_k = param2.field_k;
            var3.field_i = param2.field_i;
            var3.field_f = param2.field_f;
            var3.field_h = param2.field_h;
            var3.field_g = param2.field_g;
            stackIn_3_0 = (ru) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("vf.K(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(int param0);

    abstract void a(byte param0);

    vf(int param0, int param1, int param2, int param3, int param4) {
        this.field_k = new short[512];
        this.field_d = 4;
        this.field_a = 4;
        this.field_b = 4;
        this.field_i = 0;
        this.field_a = param2;
        this.field_i = param0;
        this.field_b = param1;
        this.field_d = param3;
        this.b(-125);
        this.d(-256);
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 != -1) {
            return -123;
        }
        if (!(rs.field_o != null)) {
            return -1;
        }
        if (param0 >= wi.field_c && wi.field_c + rs.field_o.field_y > param0 && param2 >= ro.field_pb) {
            if (!(param2 >= ro.field_pb - -rs.field_o.field_v)) {
                return 0;
            }
        }
        if (param0 >= co.field_h && co.field_h - -rs.field_o.field_y > param0 && ug.field_a <= param2) {
            if (!(rs.field_o.field_v + ug.field_a <= param2)) {
                return 1;
            }
        }
        return -1;
    }

    private final void d(int param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 != -256) {
            field_f = 9;
        }
        Random var2 = new Random((long)this.field_i);
        for (var3 = 0; (var3 ^ -1) > -256; var3++) {
            this.field_k[var3] = (short)var3;
        }
        for (var3 = 0; -256 < (var3 ^ -1); var3++) {
            var4 = 255 + -var3;
            var5 = ns.a(false, var4, var2);
            var6 = this.field_k[var5];
            this.field_k[var5] = this.field_k[var4];
            this.field_k[256 + var4] = (short) var6;
            this.field_k[var4] = (short) var6;
        }
    }

    static {
        field_h = "Toxins";
        field_e = "You have entered another game.";
        field_f = -1;
        field_c = "(1 player wants to join)";
        field_l = "Add <%0> to friend list";
    }
}
