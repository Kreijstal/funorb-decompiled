/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends cj {
    private char[] field_Pb;
    private int[] field_Qb;
    private int field_Hb;
    private int field_Nb;
    private int field_Ob;
    private int field_Sb;
    private int field_Tb;
    private ld field_Ib;
    private int field_Mb;
    static lf field_Rb;
    private mo[] field_Gb;
    private int field_Vb;
    private ld[] field_Fb;
    private int field_Jb;
    static ja[] field_Ub;
    static String field_Lb;
    static long field_Kb;

    final int i(int param0) {
        if (param0 != -29804) {
            this.field_Hb = 69;
        }
        return this.field_Sb - -(this.field_Ib != null ? this.field_Ib.i(-29804) : 0);
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Hb = param0;
        int var5 = 0;
        if (param1 != 11183) {
            return;
        }
        while (var5 < this.field_Ob) {
            var3 = this.field_Jb * var5;
            var4 = this.field_Hb * this.field_Hb;
            this.field_Gb[var5].field_Q = (var4 * (this.field_Mb + -this.field_qb) + (144 - var4) * var3) / 144;
            var5++;
        }
    }

    final static void a(jh param0, boolean param1, int param2, int param3) {
        mo dupTemp$0 = null;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        mo stackIn_22_0 = null;
        mo stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        mo stackIn_29_0 = null;
        mo stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        mo stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        mo stackIn_77_0 = null;
        boolean stackIn_77_1 = false;
        int stackIn_77_2 = 0;
        mo stackIn_80_0 = null;
        mo stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        mo stackIn_84_0 = null;
        mo stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        mo stackIn_89_0 = null;
        mo stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_94_0 = 0;
        mo stackIn_108_0 = null;
        mo stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        mo stackIn_113_0 = null;
        mo stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        mo stackIn_117_0 = null;
        mo stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        mo stackIn_121_0 = null;
        mo stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        String stackIn_139_0 = null;
        mo stackIn_144_0 = null;
        mo stackIn_145_0 = null;
        int stackIn_145_1 = 0;
        mo stackIn_147_0 = null;
        mo stackIn_148_0 = null;
        int stackIn_148_1 = 0;
        int stackIn_154_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_212_0 = 0;
        mo stackIn_313_0 = null;
        boolean stackIn_313_1 = false;
        mo stackIn_314_0 = null;
        boolean stackIn_314_1 = false;
        int stackIn_314_2 = 0;
        mo stackIn_317_0 = null;
        mo stackIn_318_0 = null;
        int stackIn_318_1 = 0;
        int stackIn_321_1 = 0;
        byte stackIn_321_2 = 0;
        int stackIn_321_3 = 0;
        mo stackIn_323_0 = null;
        mo stackIn_324_0 = null;
        int stackIn_324_1 = 0;
        mo stackIn_328_0 = null;
        mo stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        RuntimeException stackIn_338_0 = null;
        StringBuilder stackIn_338_1 = null;
        RuntimeException stackIn_339_0 = null;
        StringBuilder stackIn_339_1 = null;
        String stackIn_339_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        mo[] var8_array = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        mo var17 = null;
        int var18 = 0;
        Object var18_ref = null;
        Object var19 = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        String var25_ref = null;
        int var26 = 0;
        int var27 = 0;
        mo var28 = null;
        mo var29 = null;
        mo[] var30 = null;
        String var31 = null;
        String var32 = null;
        var26 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1) {
                L2: {
                  if (la.field_k) {
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
                  if (hl.b(0)) {
                    if (!param0.field_Fb) {
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
              var5 = 0;
              if (param1) {
                break L4;
              } else {
                var6 = 0;
                L5: while (true) {
                  if (var6 >= 5) {
                    if (!ma.field_b[0][2].field_pb) {
                      break L4;
                    } else {
                      if (hl.b(0)) {
                        ui.field_j = pd.field_f;
                        break L4;
                      } else {
                        ui.field_j = vl.a(vc.field_e, new String[]{mh.field_c.field_Nb}, 2);
                        break L4;
                      }
                    }
                  } else {
                    L6: {
                      if (var4_int == 0) {
                        break L6;
                      } else {
                        if (ma.field_b[0][1 + var6].field_T == 0) {
                          break L6;
                        } else {
                          if (var6 == param0.field_Pb) {
                            break L6;
                          } else {
                            var5 = 1;
                            param0.field_Pb = var6;
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      stackIn_22_0 = ma.field_b[0][var6 - -1];

                      if (var4_int == 0) {
                        stackIn_23_0 = (mo) ((Object) stackIn_22_0);
                        stackIn_23_1 = 0;
                        break L7;
                      } else {
                        stackIn_23_0 = (mo) ((Object) stackIn_22_0);
                        stackIn_23_1 = 1;
                        break L7;
                      }
                    }
                    L8: {
                      stackIn_23_0.field_Z = stackIn_23_1 != 0;
                      if (tb.field_u) {
                        break L8;
                      } else {
                        if (var6 == 3) {
                          ma.field_b[0][1 + var6].field_Z = false;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      stackIn_29_0 = ma.field_b[0][1 + var6];

                      if (param0.field_Pb != var6) {
                        stackIn_30_0 = (mo) ((Object) stackIn_29_0);
                        stackIn_30_1 = 0;
                        break L9;
                      } else {
                        stackIn_30_0 = (mo) ((Object) stackIn_29_0);
                        stackIn_30_1 = 1;
                        break L9;
                      }
                    }
                    stackIn_30_0.field_Ab = stackIn_30_1 != 0;
                    var6++;
                    continue L5;
                  }
                }
              }
            }
            L10: {
              if ((qo.field_r.length ^ -1) <= -3) {
                L11: {
                  if (param1) {
                    if ((tj.field_c ^ -1) != 0) {
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
                    var7 = tj.field_c;
                    var8_int = 0;
                    L13: while (true) {
                      if (var8_int >= fg.field_k.length) {
                        fg.field_k[var7 / 8] = (byte)cr.b((int) fg.field_k[var7 / 8], 1 << var7 % 8);
                        break L12;
                      } else {
                        fg.field_k[var8_int] = (byte) 0;
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
                  if (qo.field_r.length <= var7) {
                    break L10;
                  } else {
                    L16: {
                      if (var6 != 0) {
                        if (tj.field_c != var7) {
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
                        if (ma.field_b[1][var7 - -1].field_T == 0) {
                          break L17;
                        } else {
                          if (param1) {
                            if (var6 != 0) {
                              break L17;
                            } else {
                              if ((var7 ^ -1) == 0) {
                                var9 = 0;
                                L18: while (true) {
                                  if (var9 >= fg.field_k.length) {
                                    break L17;
                                  } else {
                                    fg.field_k[var9] = (byte) 0;
                                    var9++;
                                    continue L18;
                                  }
                                }
                              } else {
                                fg.field_k[var7 / 8] = (byte)vg.a((int) fg.field_k[var7 / 8], 1 << tq.b(var7, 7));
                                break L17;
                              }
                            }
                          } else {
                            var9 = qo.field_r[var7];
                            if (var9 == param0.field_mc) {
                              break L17;
                            } else {
                              param0.field_mc = var9;
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
                          var9 = qo.field_r[var7];
                          stackIn_84_0 = ma.field_b[1][1 + var7];

                          if (param0.field_mc != var9) {
                            stackIn_85_0 = (mo) ((Object) stackIn_84_0);
                            stackIn_85_1 = 0;
                            break L20;
                          } else {
                            stackIn_85_0 = (mo) ((Object) stackIn_84_0);
                            stackIn_85_1 = 1;
                            break L20;
                          }
                        }
                        stackIn_85_0.field_Ab = stackIn_85_1 != 0;
                        break L19;
                      } else {
                        if (var7 != -1) {
                          L21: {
                            stackIn_80_0 = ma.field_b[1][var7 + 1];

                            if (-1 == (fg.field_k[var7 / 8] & 1 << (7 & var7) ^ -1)) {
                              stackIn_81_0 = (mo) ((Object) stackIn_80_0);
                              stackIn_81_1 = 0;
                              break L21;
                            } else {
                              stackIn_81_0 = (mo) ((Object) stackIn_80_0);
                              stackIn_81_1 = 1;
                              break L21;
                            }
                          }
                          stackIn_81_0.field_Ab = stackIn_81_1 != 0;
                          break L19;
                        } else {
                          ma.field_b[1][var7 - -1].field_Ab = true;
                          var9 = 0;
                          L22: while (true) {
                            if (qo.field_r.length <= var9) {
                              break L19;
                            } else {
                              L23: {
                                dupTemp$0 = ma.field_b[1][var7 - -1];
                                stackIn_76_0 = (mo) (dupTemp$0);

                                stackIn_76_1 = dupTemp$0.field_Ab;

                                if ((fg.field_k[var9 / 8] & 1 << (var9 & 7)) != 0) {
                                  stackIn_77_0 = (mo) ((Object) stackIn_76_0);
                                  stackIn_77_1 = stackIn_76_1;
                                  stackIn_77_2 = 0;
                                  break L23;
                                } else {
                                  stackIn_77_0 = (mo) ((Object) stackIn_76_0);
                                  stackIn_77_1 = stackIn_76_1;
                                  stackIn_77_2 = 1;
                                  break L23;
                                }
                              }
                              stackIn_77_0.field_Ab = stackIn_77_1 & stackIn_77_2 != 0;
                              var9++;
                              continue L22;
                            }
                          }
                        }
                      }
                    }
                    L24: {
                      L25: {
                        stackIn_89_0 = ma.field_b[1][var7 + 1];

                        if (var4_int == 0) {
                          break L25;
                        } else {
                          stackIn_89_0 = (mo) ((Object) stackIn_89_0);

                          if (var8_int != 0) {
                            break L25;
                          } else {
                            stackIn_90_0 = (mo) ((Object) stackIn_89_0);
                            stackIn_90_1 = 1;
                            break L24;
                          }
                        }
                      }
                      stackIn_90_0 = (mo) ((Object) stackIn_89_0);
                      stackIn_90_1 = 0;
                      break L24;
                    }
                    stackIn_90_0.field_Z = stackIn_90_1 != 0;
                    var7++;
                    continue L15;
                  }
                }
              } else {
                break L10;
              }
            }
            L26: {
              if (param1) {
                stackIn_94_0 = 0;
                break L26;
              } else {
                stackIn_94_0 = 1;
                break L26;
              }
            }
            L27: {
              var6 = stackIn_94_0;
              if (param3 == 1) {
                break L27;
              } else {
                field_Kb = -74L;
                break L27;
              }
            }
            L28: while (true) {
              if ((var6 ^ -1) <= -4) {
                L29: {
                  if (!param1) {
                    break L29;
                  } else {
                    if ((r.field_f ^ -1) < -2) {
                      var6 = 0;
                      L30: while (true) {
                        if (r.field_f + 1 <= var6) {
                          break L29;
                        } else {
                          L31: {
                            var29 = ma.field_b[3][var6];
                            if (var4_int == 0) {
                              break L31;
                            } else {
                              if (var29.field_T != 0) {
                                pb.field_h = var6;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            if (!var29.field_pb) {
                              break L32;
                            } else {
                              if (0 < var6) {
                                L33: {
                                  if (null != qp.field_s) {
                                    stackIn_139_0 = qp.field_s[-1 + var6];
                                    break L33;
                                  } else {
                                    stackIn_139_0 = null;
                                    break L33;
                                  }
                                }
                                var8 = stackIn_139_0;
                                if (var8 != null) {
                                  ui.field_j = var8;
                                  break L32;
                                } else {
                                  break L32;
                                }
                              } else {
                                break L32;
                              }
                            }
                          }
                          L34: {
                            stackIn_144_0 = (mo) (var29);

                            if (var4_int == 0) {
                              stackIn_145_0 = (mo) ((Object) stackIn_144_0);
                              stackIn_145_1 = 0;
                              break L34;
                            } else {
                              stackIn_145_0 = (mo) ((Object) stackIn_144_0);
                              stackIn_145_1 = 1;
                              break L34;
                            }
                          }
                          L35: {
                            stackIn_145_0.field_Z = stackIn_145_1 != 0;
                            stackIn_147_0 = (mo) (var29);

                            if (pb.field_h != var6) {
                              stackIn_148_0 = (mo) ((Object) stackIn_147_0);
                              stackIn_148_1 = 0;
                              break L35;
                            } else {
                              stackIn_148_0 = (mo) ((Object) stackIn_147_0);
                              stackIn_148_1 = 1;
                              break L35;
                            }
                          }
                          stackIn_148_0.field_Ab = stackIn_148_1 != 0;
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
                  if (var7 >= kj.field_h) {
                    L37: {
                      L38: {
                        if (var5 == 0) {
                          break L38;
                        } else {
                          if (!param1) {
                            og.b(param2, 115);
                            break L38;
                          } else {
                            break L37;
                          }
                        }
                      }
                      break L37;
                    }
                    break L0;
                  } else {
                    L39: {
                      var30 = ma.field_b[4 + var7];
                      var8_array = var30;
                      if (!param1) {
                        stackIn_154_0 = 0;
                        break L39;
                      } else {
                        stackIn_154_0 = -1;
                        break L39;
                      }
                    }
                    var9 = stackIn_154_0;
                    L40: while (true) {
                      if (var9 >= var30.length + -1) {
                        var6 = var6 + (od.field_Gb[var7] & 255);
                        var7++;
                        continue L36;
                      } else {
                        L41: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L41;
                          } else {
                            if (0 <= var9) {
                              L42: {
                                if (na.field_J == null) {
                                  break L42;
                                } else {
                                  if (null == na.field_J[var7]) {
                                    break L42;
                                  } else {
                                    if (((ql.field_c ^ -1) & na.field_J[var7][var9] ^ -1) < -1) {
                                      var14 = 1;
                                      var15 = vl.a((ql.field_c ^ -1) & na.field_J[var7][var9], (byte) -103);
                                      break L42;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                              }
                              L43: {
                                if (null == ch.field_g) {
                                  break L43;
                                } else {
                                  if (ch.field_g[var7] == null) {
                                    break L43;
                                  } else {
                                    if (0 < vl.field_h) {
                                      break L43;
                                    } else {
                                      if (ch.field_g[var7][var9]) {
                                        var10 = 1;
                                        break L43;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              }
                              L44: {
                                if (null == sd.field_G) {
                                  break L44;
                                } else {
                                  if (null == sd.field_G[var7]) {
                                    break L44;
                                  } else {
                                    L45: {
                                      var16 = sd.field_G[var7][var9];
                                      if (0 == var16) {
                                        break L45;
                                      } else {
                                        if (bo.field_e) {
                                          break L45;
                                        } else {
                                          if (-1 <= (vl.field_h ^ -1)) {
                                            var10 = 1;
                                            break L45;
                                          } else {
                                            break L45;
                                          }
                                        }
                                      }
                                    }
                                    if (-1 <= (var16 ^ -1)) {
                                      break L44;
                                    } else {
                                      if (bc.field_e >= var16) {
                                        break L44;
                                      } else {
                                        var12 = 1;
                                        break L44;
                                      }
                                    }
                                  }
                                }
                              }
                              L46: {
                                if (null == r.field_c) {
                                  break L46;
                                } else {
                                  if (r.field_c[var7] != null) {
                                    L47: {
                                      var16 = r.field_c[var7][var9];
                                      if (-1 == (var16 ^ -1)) {
                                        break L47;
                                      } else {
                                        if (bo.field_e) {
                                          break L47;
                                        } else {
                                          if (vl.field_h > 0) {
                                            break L47;
                                          } else {
                                            var10 = 1;
                                            break L47;
                                          }
                                        }
                                      }
                                    }
                                    if ((var16 ^ -1) >= -1) {
                                      break L46;
                                    } else {
                                      if (dm.field_Zb >= var16) {
                                        break L46;
                                      } else {
                                        var11 = 1;
                                        break L46;
                                      }
                                    }
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                              L48: {
                                if (param1) {
                                  if (mb.field_k != null) {
                                    if (null != mb.field_k[var7]) {
                                      if (!mb.field_k[var7][var9]) {
                                        stackIn_200_0 = 0;
                                        break L48;
                                      } else {
                                        stackIn_200_0 = 1;
                                        break L48;
                                      }
                                    } else {
                                      stackIn_200_0 = 0;
                                      break L48;
                                    }
                                  } else {
                                    stackIn_200_0 = 0;
                                    break L48;
                                  }
                                } else {
                                  stackIn_200_0 = 0;
                                  break L48;
                                }
                              }
                              var13 = stackIn_200_0;
                              break L41;
                            } else {
                              break L41;
                            }
                          }
                        }
                        L49: {
                          if (-3 < (kj.field_q ^ -1)) {
                            break L49;
                          } else {
                            if (!lc.field_m[12]) {
                              break L49;
                            } else {
                              var13 = 0;
                              var10 = 0;
                              var14 = 0;
                              var11 = 0;
                              var12 = 0;
                              break L49;
                            }
                          }
                        }
                        L50: {
                          L51: {
                            dj.field_l = true;
                            if (var10 != 0) {
                              break L51;
                            } else {
                              if (var11 != 0) {
                                break L51;
                              } else {
                                if (var12 != 0) {
                                  break L51;
                                } else {
                                  if (var13 != 0) {
                                    break L51;
                                  } else {
                                    if (var14 == 0) {
                                      stackIn_212_0 = 0;
                                      break L50;
                                    } else {
                                      stackIn_212_0 = 1;
                                      break L50;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackIn_212_0 = 1;
                          break L50;
                        }
                        L52: {
                          var16 = stackIn_212_0;
                          if (var16 != 0) {
                            break L52;
                          } else {
                            if (0 > var9) {
                              break L52;
                            } else {
                              if (null == iq.field_b) {
                                break L52;
                              } else {
                                L53: {
                                  if (!param1) {
                                    break L53;
                                  } else {
                                    if (la.field_k) {
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                                L54: {
                                  lp.field_p = false;
                                  if (null != rl.field_v) {
                                    break L54;
                                  } else {
                                    rl.field_v = new byte[kj.field_h];
                                    ll.field_c = new boolean[kj.field_h];
                                    break L54;
                                  }
                                }
                                dj.field_l = false;
                                var17_int = 0;
                                L55: while (true) {
                                  if (var17_int >= var7) {
                                    L56: {
                                      bh.a(-1712, var9, 0, param0, param1, var7, -1, -1);
                                      if (-3 < (kj.field_q ^ -1)) {
                                        break L56;
                                      } else {
                                        if (!lc.field_m[12]) {
                                          break L56;
                                        } else {
                                          dj.field_l = true;
                                          break L56;
                                        }
                                      }
                                    }
                                    if (!dj.field_l) {
                                      var16 = 1;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  } else {
                                    ll.field_c[var17_int] = false;
                                    var17_int++;
                                    continue L55;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L57: {
                          var17 = var8_array[var9 + 1];
                          if (var4_int == 0) {
                            break L57;
                          } else {
                            if (0 == var17.field_T) {
                              break L57;
                            } else {
                              if (param1) {
                                if (-1 == var9) {
                                  var18 = var6;
                                  L58: while (true) {
                                    if (var18 >= var30.length + var6 + -1) {
                                      break L57;
                                    } else {
                                      tg.field_a[var18 / 8] = (byte)tq.b((int) tg.field_a[var18 / 8], 1 << tq.b(var18, 7) ^ -1);
                                      var18++;
                                      continue L58;
                                    }
                                  }
                                } else {
                                  tg.field_a[(var6 + var9) / 8] = (byte)vg.a((int) tg.field_a[(var6 + var9) / 8], 1 << tq.b(var6 + var9, 7));
                                  break L57;
                                }
                              } else {
                                if (var16 != 0) {
                                  break L57;
                                } else {
                                  if (param0.field_Zb[var7] == (byte)var9) {
                                    break L57;
                                  } else {
                                    var5 = 1;
                                    param0.field_Zb[var7] = (byte)var9;
                                    break L57;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L59: {
                          if (!param1) {
                            break L59;
                          } else {
                            if (var16 != 0) {
                              tg.field_a[(var9 - -var6) / 8] = (byte)tq.b((int) tg.field_a[(var9 + var6) / 8], 1 << tq.b(var9 + var6, 7) ^ -1);
                              break L59;
                            } else {
                              break L59;
                            }
                          }
                        }
                        L60: {
                          if (var9 < 0) {
                            break L60;
                          } else {
                            if (!var17.field_pb) {
                              break L60;
                            } else {
                              L61: {
                                if (ul.field_m == null) {
                                  var18_ref = null;
                                  break L61;
                                } else {
                                  if (null == ul.field_m[var7]) {
                                    var18_ref = null;
                                    break L61;
                                  } else {
                                    var18_ref = ul.field_m[var7][var9];
                                    break L61;
                                  }
                                }
                              }
                              L62: {
                                if (kp.field_n != null) {
                                  if (kp.field_n[var7] != null) {
                                    var19 = kp.field_n[var7][var9];
                                    break L62;
                                  } else {
                                    var19 = null;
                                    break L62;
                                  }
                                } else {
                                  var19 = null;
                                  break L62;
                                }
                              }
                              L63: {
                                var20 = null;
                                if (var19 == null) {
                                  break L63;
                                } else {
                                  if (((String) (var19)).equals(var18_ref)) {
                                    break L63;
                                  } else {
                                    var20 = var19;
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                var21 = null;
                                if (var13 == 0) {
                                  if (var10 == 0) {
                                    L65: {
                                      if (var11 == 0) {
                                        break L65;
                                      } else {
                                        var22_int = r.field_c[var7][var9] + -dm.field_Zb;
                                        if (-2 != (var22_int ^ -1)) {
                                          var21 = vl.a(sc.field_c, new String[]{Integer.toString(var22_int)}, 2);
                                          break L65;
                                        } else {
                                          var21 = uq.field_a;
                                          break L65;
                                        }
                                      }
                                    }
                                    L66: {
                                      if (var12 != 0) {
                                        var31 = vl.a(dm.field_Rb, new String[]{Integer.toString(bc.field_e), Integer.toString(sd.field_G[var7][var9])}, 2);
                                        var21 = var31;
                                        var21 = var31;
                                        if (var21 == null) {
                                          var21 = var31;
                                          break L66;
                                        } else {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L66;
                                        }
                                      } else {
                                        break L66;
                                      }
                                    }
                                    if (var14 != 0) {
                                      L67: {
                                        var22 = eb.field_L;
                                        if (-1 <= (var15 ^ -1)) {
                                          break L67;
                                        } else {
                                          if (null == ki.field_o) {
                                            break L67;
                                          } else {
                                            if (var15 > ki.field_o.length) {
                                              break L67;
                                            } else {
                                              if (null != ki.field_o[-1 + var15]) {
                                                var22 = ki.field_o[-1 + var15][0];
                                                break L67;
                                              } else {
                                                break L67;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 == null) {
                                        var21 = var22;
                                        break L64;
                                      } else {
                                        var21 = (String) (var21) + "<br>" + (String) (var22);
                                        break L64;
                                      }
                                    } else {
                                      break L64;
                                    }
                                  } else {
                                    var21 = fa.field_Ub;
                                    break L64;
                                  }
                                } else {
                                  var21 = oj.field_H;
                                  break L64;
                                }
                              }
                              L68: {
                                if (var4_int == 0) {
                                  break L68;
                                } else {
                                  if (!dj.field_l) {
                                    L69: {
                                      var22 = null;
                                      if (lp.field_p) {
                                        var22 = "</col>" + gi.field_n + "<col=A00000>";
                                        var25 = var22;
                                        var22 = var25;
                                        var25 = var22;
                                        var22 = var25;
                                        var21 = var22;
                                        break L69;
                                      } else {
                                        break L69;
                                      }
                                    }
                                    var23 = 0;
                                    var24 = 0;
                                    L70: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 != 0) {
                                          var21 = kb.field_q + (String) (var22);
                                          break L68;
                                        } else {
                                          var21 = vl.a(io.field_a, new String[]{(String) (var22)}, 2);
                                          break L68;
                                        }
                                      } else {
                                        L71: {
                                          if (ll.field_c[var24]) {
                                            var25_ref = "</col>" + cf.field_f[var24] + "<col=A00000>";
                                            var22 = var25_ref;
                                            var21 = var22;
                                            var22 = var25_ref;
                                            if (var22 != null) {
                                              var22 = (String) (var22) + ", " + var25_ref;
                                              var21 = var22;
                                              var21 = var22;
                                              var23 = 1;
                                              break L71;
                                            } else {
                                              var22 = var25_ref;
                                              break L71;
                                            }
                                          } else {
                                            break L71;
                                          }
                                        }
                                        var24++;
                                        continue L70;
                                      }
                                    }
                                  } else {
                                    break L68;
                                  }
                                }
                              }
                              L72: {
                                if (var21 != null) {
                                  var21 = "<col=A00000>" + (String) (var21);
                                  var32 = sa.a((String) (var21), param3 + 123, "<br>", "<br><col=A00000>");
                                  if (var20 == null) {
                                    var20 = var32;
                                    break L72;
                                  } else {
                                    var20 = (String) (var20) + "<br>" + var32;
                                    break L72;
                                  }
                                } else {
                                  break L72;
                                }
                              }
                              if (var20 == null) {
                                break L60;
                              } else {
                                ui.field_j = (String) (var20);
                                break L60;
                              }
                            }
                          }
                        }
                        L73: {
                          if (!param1) {
                            L74: {
                              L75: {
                                stackIn_323_0 = (mo) (var17);

                                if (!dj.field_l) {
                                  break L75;
                                } else {

                                  stackIn_321_1 = param0.field_Zb[var7] ^ -1;
                                  stackIn_321_2 = (byte)var9;
                                  stackIn_321_3 = -1;
                                  stackIn_323_0 = (mo) ((Object) stackIn_323_0);

                                  if (stackIn_321_1 != (stackIn_321_2 ^ stackIn_321_3)) {
                                    break L75;
                                  } else {
                                    stackIn_324_0 = (mo) ((Object) stackIn_323_0);
                                    stackIn_324_1 = 1;
                                    break L74;
                                  }
                                }
                              }
                              stackIn_324_0 = (mo) ((Object) stackIn_323_0);
                              stackIn_324_1 = 0;
                              break L74;
                            }
                            stackIn_324_0.field_Ab = stackIn_324_1 != 0;
                            break L73;
                          } else {
                            if (var9 != -1) {
                              L76: {
                                stackIn_317_0 = (mo) (var17);

                                if (0 == (tg.field_a[(var9 + var6) / 8] & 1 << (var6 - -var9 & 7))) {
                                  stackIn_318_0 = (mo) ((Object) stackIn_317_0);
                                  stackIn_318_1 = 0;
                                  break L76;
                                } else {
                                  stackIn_318_0 = (mo) ((Object) stackIn_317_0);
                                  stackIn_318_1 = 1;
                                  break L76;
                                }
                              }
                              stackIn_318_0.field_Ab = stackIn_318_1 != 0;
                              break L73;
                            } else {
                              var17.field_Ab = true;
                              var27 = var6;
                              var18 = var27;
                              L77: while (true) {
                                if (-1 + (var30.length + var6) <= var27) {
                                  break L73;
                                } else {
                                  L78: {
                                    stackIn_313_0 = (mo) (var17);

                                    stackIn_313_1 = var17.field_Ab;

                                    if (-1 != (tg.field_a[var27 / 8] & 1 << (7 & var27) ^ -1)) {
                                      stackIn_314_0 = (mo) ((Object) stackIn_313_0);
                                      stackIn_314_1 = stackIn_313_1;
                                      stackIn_314_2 = 0;
                                      break L78;
                                    } else {
                                      stackIn_314_0 = (mo) ((Object) stackIn_313_0);
                                      stackIn_314_1 = stackIn_313_1;
                                      stackIn_314_2 = 1;
                                      break L78;
                                    }
                                  }
                                  stackIn_314_0.field_Ab = stackIn_314_1 & stackIn_314_2 != 0;
                                  var27++;
                                  continue L77;
                                }
                              }
                            }
                          }
                        }
                        L79: {
                          L80: {
                            stackIn_328_0 = (mo) (var17);

                            if (var4_int == 0) {
                              break L80;
                            } else {
                              stackIn_328_0 = (mo) ((Object) stackIn_328_0);

                              if (var16 != 0) {
                                break L80;
                              } else {
                                stackIn_329_0 = (mo) ((Object) stackIn_328_0);
                                stackIn_329_1 = 1;
                                break L79;
                              }
                            }
                          }
                          stackIn_329_0 = (mo) ((Object) stackIn_328_0);
                          stackIn_329_1 = 0;
                          break L79;
                        }
                        stackIn_329_0.field_Z = stackIn_329_1 != 0;
                        var9++;
                        continue L40;
                      }
                    }
                  }
                }
              } else {
                L81: {
                  var28 = ma.field_b[2][var6];
                  if (var4_int == 0) {
                    break L81;
                  } else {
                    if (-1 == (var28.field_T ^ -1)) {
                      break L81;
                    } else {
                      if (!param1) {
                        if (var6 != param0.field_fc) {
                          var5 = 1;
                          param0.field_fc = var6;
                          break L81;
                        } else {
                          break L81;
                        }
                      } else {
                        if (var6 == 0) {
                          sc.field_f = 0;
                          break L81;
                        } else {
                          sc.field_f = sc.field_f ^ var6;
                          break L81;
                        }
                      }
                    }
                  }
                }
                L82: {
                  stackIn_108_0 = (mo) (var28);

                  if (var4_int == 0) {
                    stackIn_109_0 = (mo) ((Object) stackIn_108_0);
                    stackIn_109_1 = 0;
                    break L82;
                  } else {
                    stackIn_109_0 = (mo) ((Object) stackIn_108_0);
                    stackIn_109_1 = 1;
                    break L82;
                  }
                }
                L83: {
                  stackIn_109_0.field_Z = stackIn_109_1 != 0;
                  if (!param1) {
                    L84: {
                      stackIn_121_0 = (mo) (var28);

                      if ((var6 & param0.field_fc) == 0) {
                        stackIn_122_0 = (mo) ((Object) stackIn_121_0);
                        stackIn_122_1 = 0;
                        break L84;
                      } else {
                        stackIn_122_0 = (mo) ((Object) stackIn_121_0);
                        stackIn_122_1 = 1;
                        break L84;
                      }
                    }
                    stackIn_122_0.field_Ab = stackIn_122_1 != 0;
                    break L83;
                  } else {
                    if (-1 == (var6 ^ -1)) {
                      L85: {
                        stackIn_117_0 = (mo) (var28);

                        if (-1 != (sc.field_f ^ -1)) {
                          stackIn_118_0 = (mo) ((Object) stackIn_117_0);
                          stackIn_118_1 = 0;
                          break L85;
                        } else {
                          stackIn_118_0 = (mo) ((Object) stackIn_117_0);
                          stackIn_118_1 = 1;
                          break L85;
                        }
                      }
                      stackIn_118_0.field_Ab = stackIn_118_1 != 0;
                      break L83;
                    } else {
                      L86: {
                        stackIn_113_0 = (mo) (var28);

                        if (-1 == (var6 & sc.field_f ^ -1)) {
                          stackIn_114_0 = (mo) ((Object) stackIn_113_0);
                          stackIn_114_1 = 0;
                          break L86;
                        } else {
                          stackIn_114_0 = (mo) ((Object) stackIn_113_0);
                          stackIn_114_1 = 1;
                          break L86;
                        }
                      }
                      stackIn_114_0.field_Ab = stackIn_114_1 != 0;
                      break L83;
                    }
                  }
                }
                var6++;
                continue L28;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L87: {
            var4 = decompiledCaughtException;
            stackIn_338_0 = (RuntimeException) (var4);

            stackIn_338_1 = new StringBuilder().append("ld.KA(");

            if (param0 == null) {
              stackIn_339_0 = (RuntimeException) ((Object) stackIn_338_0);
              stackIn_339_1 = (StringBuilder) ((Object) stackIn_338_1);
              stackIn_339_2 = "null";
              break L87;
            } else {
              stackIn_339_0 = (RuntimeException) ((Object) stackIn_338_0);
              stackIn_339_1 = (StringBuilder) ((Object) stackIn_338_1);
              stackIn_339_2 = "{...}";
              break L87;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_339_0), stackIn_339_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ld(long param0, cj param1, cj param2, cj param3, ld[] param4, int[] param5, String[] param6, char[] param7) {
        super(param0, param1);
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        String var11 = null;
        String var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        fm var17 = null;
        fm var18 = null;
        this.field_Tb = -1;
        try {
          L0: {
            this.field_Qb = param5;
            this.field_Pb = param7;
            this.field_Fb = param4;
            this.field_Ob = this.field_Qb.length;
            var17 = param3.field_yb;
            var18 = var17;
            this.field_Jb = var18.field_r + (var18.field_C + 2);
            this.field_Nb = this.field_Ob * this.field_Jb;
            this.field_Vb = 0;
            this.field_Gb = new mo[this.field_Ob];
            var11 = "<col=999999>";
            var12 = "</col>";
            var13 = 0;
            L1: while (true) {
              if (this.field_Ob <= var13) {
                this.field_Vb = this.field_Vb + (tb.field_v.field_z + 10);
                this.b(12, 11183);
                break L0;
              } else {
                L2: {
                  if (this.field_Pb[var13] <= 0) {
                    break L2;
                  } else {
                    param6[var13] = var11 + hm.a(-81, this.field_Pb[var13]).toUpperCase() + ": " + var12 + param6[var13];
                    break L2;
                  }
                }
                L3: {
                  L4: {
                    var14 = null;
                    if (null != this.field_Fb[var13]) {
                      break L4;
                    } else {
                      if (-1 != this.field_Qb[var13]) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var14 = tb.field_v;
                  break L3;
                }
                L5: {
                  this.field_Gb[var13] = new mo(0L, param2, (cj) null, param3, (ja) (var14), param6[var13]);
                  this.a((byte) 50, this.field_Gb[var13]);
                  var15 = var17.a(param6[var13]);
                  if (this.field_Vb >= var15) {
                    break L5;
                  } else {
                    this.field_Vb = var15;
                    break L5;
                  }
                }
                var13++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var10);

            stackIn_15_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L7;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param4 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param5 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');

            if (param6 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param7 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), stackIn_34_2 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4_int;
        mo var5;
        int var6;
        mo stackIn_6_0 = null;
        mo stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        ld var4;
        ld var7;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var4_int = 0;
        L0: while (true) {
          if (this.field_Gb.length <= var4_int) {
            L1: {
              if (param1 == 255) {
                break L1;
              } else {
                this.field_Ib = (ld) null;
                break L1;
              }
            }
            L2: {
              if (this.field_Tb == -1) {
                break L2;
              } else {
                var7 = this.field_Fb[this.field_Tb];
                var4 = var7;
                if (var4 == null) {
                  break L2;
                } else {
                  var7.b(param0, 255, param2);
                  break L2;
                }
              }
            }
            L3: {
              if ((this.field_Hb ^ -1) < -1) {
                this.b(this.field_Hb - 1, 11183);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            var5 = this.field_Gb[var4_int];
            if (var5.field_T == 1) {
              L4: {
                this.a(-115, var4_int, param0, param2);
                stackIn_6_0 = (mo) (var5);

                if (var4_int != this.field_Tb) {
                  stackIn_7_0 = (mo) ((Object) stackIn_6_0);
                  stackIn_7_1 = 0;
                  break L4;
                } else {
                  stackIn_7_0 = (mo) ((Object) stackIn_6_0);
                  stackIn_7_1 = 1;
                  break L4;
                }
              }
              stackIn_7_0.field_Ab = stackIn_7_1 != 0;
              var4_int++;
              continue L0;
            } else {
              var4_int++;
              continue L0;
            }
          }
        }
    }

    final static String a(byte param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        jh var3 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                var3 = (jh) null;
                ld.a((jh) null, false, 60, 111);
                break L1;
              }
            }
            L2: {
              var2 = mc.a(cq.a(0, param1), (byte) 26);
              if (var2 == null) {
                var2 = "";
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_6_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ld.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = ZombieDawnMulti.field_E ? 1 : 0;
        this.field_Sb = param4 * 2 + this.field_Vb;
        this.a(this.field_Nb, param1 - this.field_Nb, this.field_Sb, param0, -3344);
        if (param2 >= -16) {
            field_Kb = -29L;
        }
        if (param5 != this.field_Mb) {
            this.field_Mb = param5;
            this.b(this.field_Hb, 11183);
        }
        for (var7 = 0; this.field_Ob > var7; var7++) {
            this.field_Gb[var7].a(param3, 2, this.field_Jb, this.field_Sb, 0, this.field_Gb[var7].field_Q, param4);
        }
        if (-1 != this.field_Tb) {
            if (!(this.field_Fb[this.field_Tb] == null)) {
                var7 = this.field_Fb[this.field_Tb].field_Ob;
                for (var8 = this.field_Q + this.field_Jb * (var7 + this.field_Tb); param1 < var8; var8 = var8 - this.field_Jb) {
                }
                this.field_Fb[this.field_Tb].a(param0 - -this.field_Sb, var8, -87, param3, param4, this.field_Gb[this.field_Tb].field_qb);
            }
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        mo var4 = null;
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        mo[] var6 = this.field_Gb;
        mo[] var2 = var6;
        if (param0 < 107) {
            this.a(31, 97, 11, 57);
        }
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.field_T = 0;
            var4.field_Ab = false;
        }
        if (this.field_Ib != null) {
            this.field_Ib.c((byte) 108);
            this.field_Ib.a(true);
        }
        this.field_Ib = null;
        this.field_Tb = -1;
        this.b(12, 11183);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((param1 ^ -1) > -1) {
                break L1;
              } else {
                if (param5 >= ep.field_h) {
                  break L1;
                } else {
                  L2: {
                    if (param4 >= 0) {
                      break L2;
                    } else {
                      if ((param6 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if (0 <= param3) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (ep.field_i > param4) {
                      break L3;
                    } else {
                      if (param6 < ep.field_i) {
                        break L3;
                      } else {
                        if (ep.field_i <= param3) {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == -12628) {
                    L4: {
                      var14 = param1 - param5;
                      if (param5 == param2) {
                        L5: {
                          if (param1 == param5) {
                            var11 = 0;
                            var10 = param6 << -548596304;
                            var12 = 0;
                            var9_int = param4 << -1663683536;
                            break L5;
                          } else {
                            var15 = -param2 + param1;
                            if (param6 > param4) {
                              var10 = param6 << -1633525584;
                              var12 = (param3 - param6 << 1961646192) / var15;
                              var11 = (param3 + -param4 << -1401890096) / var14;
                              var9_int = param4 << 400811568;
                              break L5;
                            } else {
                              var10 = param4 << -94535408;
                              var11 = (-param6 + param3 << -1923766992) / var15;
                              var12 = (-param4 + param3 << 2106942736) / var14;
                              var9_int = param6 << -630187568;
                              break L5;
                            }
                          }
                        }
                        var13 = 0;
                        if (0 <= param5) {
                          break L4;
                        } else {
                          param5 = Math.min(-param5, -param5 + param2);
                          var10 = var10 + var12 * param5;
                          var9_int = var9_int + var11 * param5;
                          param5 = 0;
                          break L4;
                        }
                      } else {
                        L6: {
                          var10 = param4 << -1146515248;
                          var9_int = param4 << -1146515248;
                          var15 = -param5 + param2;
                          var11 = (param6 + -param4 << 1072950960) / var15;
                          var12 = (-param4 + param3 << -1368549136) / var14;
                          if (var11 >= var12) {
                            var16 = var11;
                            var11 = var12;
                            var12 = var16;
                            var13 = 1;
                            break L6;
                          } else {
                            var13 = 0;
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            if (0 > param5) {
                              if ((param2 ^ -1) <= -1) {
                                param5 = -param5;
                                var9_int = var9_int + var11 * param5;
                                var10 = var10 + var12 * param5;
                                param5 = 0;
                                break L8;
                              } else {
                                param5 = param2 + -param5;
                                var9_int = var9_int + param5 * var11;
                                var10 = var10 + var12 * param5;
                                param5 = param2;
                                break L7;
                              }
                            } else {
                              break L8;
                            }
                          }
                          var16 = ep.field_a[param5];
                          L9: while (true) {
                            if (param5 >= param2) {
                              break L7;
                            } else {
                              L10: {
                                var17 = var9_int >> -641679056;
                                if ((var17 ^ -1) <= (ep.field_i ^ -1)) {
                                  break L10;
                                } else {
                                  var18 = -(var9_int >> 774828240) + (var10 >> 929719024);
                                  if (var18 != 0) {
                                    L11: {
                                      if (ep.field_i <= var18 + var17) {
                                        var18 = -1 + -var17 + ep.field_i;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    if (var17 < 0) {
                                      so.a(param7, true, var16, var18 + var17, param8);
                                      break L10;
                                    } else {
                                      so.a(param7, true, var17 + var16, var18, param8);
                                      break L10;
                                    }
                                  } else {
                                    if (0 > var17) {
                                      break L10;
                                    } else {
                                      if (ep.field_i > var17) {
                                        so.a(param7, true, var16 + var17, var18, param8);
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              param5++;
                              if (param5 >= ep.field_h) {
                                decompiledRegionSelector0 = 4;
                                break L0;
                              } else {
                                var9_int = var9_int + var11;
                                var16 = var16 + oo.field_b;
                                var10 = var10 + var12;
                                continue L9;
                              }
                            }
                          }
                        }
                        var16 = param1 + -param2;
                        if (var16 != 0) {
                          L12: {
                            var17 = param3 << -435078064;
                            if (var13 != 0) {
                              var10 = param6 << 1481707568;
                              break L12;
                            } else {
                              var9_int = param6 << -592145584;
                              break L12;
                            }
                          }
                          var11 = (var17 + -var9_int) / var16;
                          var12 = (-var10 + var17) / var16;
                          break L4;
                        } else {
                          var12 = 0;
                          var11 = 0;
                          break L4;
                        }
                      }
                    }
                    L13: {
                      if ((param5 ^ -1) <= -1) {
                        break L13;
                      } else {
                        param5 = -param5;
                        var10 = var10 + var12 * param5;
                        var9_int = var9_int + param5 * var11;
                        param5 = 0;
                        break L13;
                      }
                    }
                    var15 = ep.field_a[param5];
                    L14: while (true) {
                      if (param1 <= param5) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        L15: {
                          var16 = var9_int >> -1311822640;
                          if (var16 < ep.field_i) {
                            var17 = (var10 >> 227210128) - (var9_int >> 1022113424);
                            if (0 != var17) {
                              L16: {
                                if (var16 - -var17 >= ep.field_i) {
                                  var17 = -1 + -var16 + ep.field_i;
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                              if (var16 >= 0) {
                                so.a(param7, true, var15 + var16, var17, param8);
                                break L15;
                              } else {
                                so.a(param7, true, var15, var17 - -var16, param8);
                                break L15;
                              }
                            } else {
                              if ((var16 ^ -1) > -1) {
                                break L15;
                              } else {
                                if (var16 < ep.field_i) {
                                  so.a(param7, true, var16 - -var15, var17, param8);
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          } else {
                            break L15;
                          }
                        }
                        param5++;
                        if (ep.field_h > param5) {
                          var9_int = var9_int + var11;
                          var15 = var15 + oo.field_b;
                          var10 = var10 + var12;
                          continue L14;
                        } else {
                          decompiledRegionSelector0 = 6;
                          break L0;
                        }
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var9);

            stackIn_80_1 = new StringBuilder().append("ld.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L17;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L17;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final boolean k(int param0) {
        int var4 = 0;
        mo var5 = null;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        int var2 = 0;
        if (param0 != -26899) {
            return false;
        }
        mo[] var3 = this.field_Gb;
        for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            var2 = var2 | (0 != var5.field_T ? 1 : 0);
        }
        if (var2 == 0 && (this.field_Tb ^ -1) != 0 && null != this.field_Fb[this.field_Tb]) {
            var2 = this.field_Fb[this.field_Tb].k(param0 + 0) ? 1 : 0;
        }
        return var2 != 0;
    }

    public static void h(int param0) {
        field_Lb = null;
        field_Rb = null;
        if (param0 >= -104) {
            jh var2 = (jh) null;
            ld.a((jh) null, false, 77, -3);
        }
        field_Ub = null;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        String var8;
        L0: {
          var7 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 <= -93) {
            break L0;
          } else {
            this.field_Fb = (ld[]) null;
            break L0;
          }
        }
        L1: {
          if (param1 == this.field_Tb) {
            this.c((byte) 127);
            this.b(0, 11183);
            break L1;
          } else {
            if (this.field_Fb[param1] != null) {
              this.c((byte) 119);
              this.b(0, 11183);
              this.field_Tb = param1;
              this.field_Ib = this.field_Fb[this.field_Tb];
              an.a((byte) 75, this.field_Ib);
              this.field_Ib.b(12, 11183);
              break L1;
            } else {
              if ((this.field_Qb[param1] ^ -1) == 0) {
                qd.c(4024);
                fh.b(31706);
                break L1;
              } else {
                L2: {
                  var5 = 32768 | this.field_Qb[param1];
                  var6 = va.field_a;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    if (mh.field_c == null) {
                      break L2;
                    } else {
                      var6 = 1;
                      break L2;
                    }
                  }
                }
                L3: {
                  if (-3 != (ga.a(var6, true) ^ -1)) {
                    break L3;
                  } else {
                    kp.a(var6, param3, 1, true);
                    break L3;
                  }
                }
                var8 = (String) null;
                kb.a(var5, qf.field_g, param2, (String) null, va.field_a, 29602);
                ii.a(va.field_a, (byte) -128, var5, qf.field_g, jj.field_M);
                fh.b(31706);
                lh.a(true);
                break L1;
              }
            }
          }
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int stackIn_3_0 = 0;
        L0: {
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          if (sj.field_p != 85) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (this.field_Ib != null) {
          L1: {
            if (var4 == 0) {
              break L1;
            } else {
              if (-1 == this.field_Ib.field_Tb) {
                this.c((byte) 110);
                this.b(0, 11183);
                return true;
              } else {
                break L1;
              }
            }
          }
          return this.field_Ib.a(-119, param1, param2);
        } else {
          L2: {
            if (null != this.field_Ib) {
              break L2;
            } else {
              if (mj.field_Ib != this) {
                break L2;
              } else {
                if (var4 != 0) {
                  fh.b(31706);
                  return true;
                } else {
                  break L2;
                }
              }
            }
          }
          L3: {
            var5 = pn.field_d;
            var6 = -52 / ((param0 - 38) / 52);
            if (var5 <= 0) {
              break L3;
            } else {
              L4: {
                if (wc.field_I != var5) {
                  break L4;
                } else {
                  var5 = 63;
                  break L4;
                }
              }
              var7 = 0;
              L5: while (true) {
                if (var7 >= this.field_Pb.length) {
                  break L3;
                } else {
                  if (this.field_Pb[var7] != var5) {
                    var7++;
                    continue L5;
                  } else {
                    this.a(-105, var7, param1, param2);
                    return true;
                  }
                }
              }
            }
          }
          return false;
        }
    }

    final static void j(int param0) {
        q.b(72);
        if (param0 != 1481707568) {
            field_Kb = -107L;
        }
        bc.b(10);
        bk.field_i = null;
        fh.b(param0 + -1481675862);
    }

    static {
        field_Rb = new lf();
        field_Lb = "Buying or selling an account";
    }
}
