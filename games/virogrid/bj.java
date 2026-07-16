/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends l {
    long field_p;
    byte[] field_l;
    static p field_o;
    int field_i;
    static byte[][] field_k;
    static ra field_h;
    static int field_j;
    static java.awt.Frame field_m;
    static String field_g;
    static boolean field_n;

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        var3 = param1 >> -2139635681 & param0 + -1;
        if (param2 != 1) {
          return 82;
        } else {
          return var3 + ((param1 >>> -2126198881) + param1) % param0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        ad.field_i = param2;
        hn.field_q = param0;
        if (param1 != 23) {
            field_k = null;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_g = null;
        field_k = null;
        field_h = null;
        field_m = null;
        if (param0 >= -59) {
            bj.a(-31);
        }
    }

    bj(long param0, int param1, byte[] param2) {
        ((bj) this).field_i = param1;
        ((bj) this).field_l = param2;
        ((bj) this).field_p = param0;
    }

    final static void a(int param0) {
        hg var1 = null;
        int var2 = 0;
        lk var3_ref_lk = null;
        long var3_long = 0L;
        int var3 = 0;
        he var4_ref_he = null;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        he var6_ref = null;
        lk var7 = null;
        lk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hg var13 = null;
        lk var14 = null;
        String var15 = null;
        String var16 = null;
        lk var17 = null;
        lk var18 = null;
        Object var19 = null;
        he var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        lk var22 = null;
        String var23 = null;
        String var24 = null;
        he var25 = null;
        Object var26 = null;
        Object var27 = null;
        lk var28 = null;
        he var29 = null;
        he var30 = null;
        he var31 = null;
        lk stackIn_61_0 = null;
        lk stackIn_62_0 = null;
        lk stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_123_0 = 0;
        lk stackIn_129_0 = null;
        lk stackIn_130_0 = null;
        lk stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        boolean stackIn_141_0 = false;
        int stackIn_149_0 = 0;
        lk stackOut_60_0 = null;
        lk stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        lk stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_121_0 = 0;
        lk stackOut_128_0 = null;
        lk stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        lk stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        boolean stackOut_140_0 = false;
        int stackOut_148_0 = 0;
        var26 = null;
        var19 = null;
        var20 = null;
        var27 = null;
        var21 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        var13 = sh.field_qb;
        var1 = var13;
        var2 = ((jc) (Object) var1).g(11132);
        if (param0 < -3) {
          L0: {
            L1: {
              L2: {
                if (var2 == 0) {
                  break L2;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L2;
                  } else {
                    if ((var2 ^ -1) == -3) {
                      break L2;
                    } else {
                      if (-4 == (var2 ^ -1)) {
                        break L2;
                      } else {
                        if (-5 == (var2 ^ -1)) {
                          break L2;
                        } else {
                          L3: {
                            if (5 == var2) {
                              break L3;
                            } else {
                              L4: {
                                if (6 == var2) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (-8 != (var2 ^ -1)) {
                                      break L5;
                                    } else {
                                      var28 = (lk) (Object) ci.field_o.a((byte) -77);
                                      L6: while (true) {
                                        L7: {
                                          L8: {
                                            if (var28 == null) {
                                              break L8;
                                            } else {
                                              var28.a(false);
                                              var28.c(53);
                                              var28 = (lk) (Object) ci.field_o.a(16213);
                                              if (var11 != 0) {
                                                break L7;
                                              } else {
                                                if (var11 == 0) {
                                                  continue L6;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                          }
                                          ea.field_a = 0;
                                          break L7;
                                        }
                                        if (var11 == 0) {
                                          break L0;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                  L9: {
                                    if (8 != var2) {
                                      break L9;
                                    } else {
                                      L10: {
                                        var3 = ((jc) (Object) var1).c((byte) 100);
                                        var4_ref_he = (he) (Object) ma.field_c.a((long)var3, (byte) -103);
                                        if (var4_ref_he != null) {
                                          break L10;
                                        } else {
                                          var4_ref_he = new he(vb.field_h);
                                          ma.field_c.a((long)var3, (wb) (Object) var4_ref_he, 30804);
                                          break L10;
                                        }
                                      }
                                      cc.a(true, var4_ref_he, true, (jc) (Object) var1);
                                      pg.a(false, var4_ref_he);
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  L11: {
                                    if ((var2 ^ -1) == -10) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (10 == var2) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if ((var2 ^ -1) == -12) {
                                              break L13;
                                            } else {
                                              if ((var2 ^ -1) == -13) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  if ((var2 ^ -1) == -14) {
                                                    break L14;
                                                  } else {
                                                    L15: {
                                                      if (-15 == (var2 ^ -1)) {
                                                        break L15;
                                                      } else {
                                                        if ((var2 ^ -1) == -17) {
                                                          break L15;
                                                        } else {
                                                          L16: {
                                                            if (var2 == 15) {
                                                              break L16;
                                                            } else {
                                                              if (-18 == (var2 ^ -1)) {
                                                                break L16;
                                                              } else {
                                                                L17: {
                                                                  if ((var2 ^ -1) == -19) {
                                                                    break L17;
                                                                  } else {
                                                                    L18: {
                                                                      if ((var2 ^ -1) == -20) {
                                                                        break L18;
                                                                      } else {
                                                                        L19: {
                                                                          if (-21 == (var2 ^ -1)) {
                                                                            break L19;
                                                                          } else {
                                                                            L20: {
                                                                              if (21 != var2) {
                                                                                break L20;
                                                                              } else {
                                                                                L21: {
                                                                                  L22: {
                                                                                    var3 = ((jc) (Object) var1).c((byte) -90);
                                                                                    if (0 != var3) {
                                                                                      break L22;
                                                                                    } else {
                                                                                      d.field_Eb = 0L;
                                                                                      if (var11 == 0) {
                                                                                        break L21;
                                                                                      } else {
                                                                                        break L22;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  d.field_Eb = hc.a(-9986) + (long)var3;
                                                                                  break L21;
                                                                                }
                                                                                if (var11 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L20;
                                                                                }
                                                                              }
                                                                            }
                                                                            L23: {
                                                                              if (-23 == (var2 ^ -1)) {
                                                                                break L23;
                                                                              } else {
                                                                                L24: {
                                                                                  if (var2 == 23) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    en.a("L1: " + rg.a(true), (Throwable) null, 1);
                                                                                    tn.a(false);
                                                                                    if (var11 == 0) {
                                                                                      break L1;
                                                                                    } else {
                                                                                      break L24;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                hh.field_d = ((jc) (Object) var1).e((byte) -60);
                                                                                if (var11 == 0) {
                                                                                  break L1;
                                                                                } else {
                                                                                  break L23;
                                                                                }
                                                                              }
                                                                            }
                                                                            sb.field_i = ((jc) (Object) var1).c((byte) 69);
                                                                            nh.field_c = ((jc) (Object) var1).c(0);
                                                                            if (var11 == 0) {
                                                                              break L1;
                                                                            } else {
                                                                              break L19;
                                                                            }
                                                                          }
                                                                        }
                                                                        cc.a(false, wl.field_d, true, (jc) (Object) var1);
                                                                        if (var11 == 0) {
                                                                          break L1;
                                                                        } else {
                                                                          break L18;
                                                                        }
                                                                      }
                                                                    }
                                                                    L25: {
                                                                      var3_long = ((jc) (Object) var1).e((byte) -60);
                                                                      var5 = ((jc) (Object) var1).g(11132);
                                                                      var14 = ic.a(var3_long, (byte) -127);
                                                                      if (var14 != null) {
                                                                        L26: {
                                                                          L27: {
                                                                            if (-1 != (var5 ^ -1)) {
                                                                              break L27;
                                                                            } else {
                                                                              var14.a(false);
                                                                              if (var11 == 0) {
                                                                                break L26;
                                                                              } else {
                                                                                break L27;
                                                                              }
                                                                            }
                                                                          }
                                                                          var14.field_Gb = fn.field_c;
                                                                          var14.field_Wb = var5;
                                                                          break L26;
                                                                        }
                                                                        var14.c(32);
                                                                        wl.field_d.field_ic = wl.field_d.field_ic - 1;
                                                                        break L25;
                                                                      } else {
                                                                        break L25;
                                                                      }
                                                                    }
                                                                    if (var11 == 0) {
                                                                      break L1;
                                                                    } else {
                                                                      break L17;
                                                                    }
                                                                  }
                                                                }
                                                                L28: {
                                                                  var3_long = ((jc) (Object) var1).e((byte) -60);
                                                                  var15 = ((jc) (Object) var1).h(-118);
                                                                  var16 = ((jc) (Object) var1).h(-118);
                                                                  var7 = ic.a(var3_long, (byte) -127);
                                                                  if (var7 == null) {
                                                                    var7 = new lk(var15, var16, var3_long);
                                                                    ah.field_h.a(var3_long, (wb) (Object) var7, 30804);
                                                                    wl.field_d.field_ic = wl.field_d.field_ic + 1;
                                                                    break L28;
                                                                  } else {
                                                                    break L28;
                                                                  }
                                                                }
                                                                L29: {
                                                                  var7.field_Vb = ((jc) (Object) var1).c((byte) 75);
                                                                  var8_int = ((jc) (Object) var1).c(0);
                                                                  stackOut_60_0 = (lk) var7;
                                                                  stackIn_62_0 = stackOut_60_0;
                                                                  stackIn_61_0 = stackOut_60_0;
                                                                  if (0 == (1 & var8_int)) {
                                                                    stackOut_62_0 = (lk) (Object) stackIn_62_0;
                                                                    stackOut_62_1 = 0;
                                                                    stackIn_63_0 = stackOut_62_0;
                                                                    stackIn_63_1 = stackOut_62_1;
                                                                    break L29;
                                                                  } else {
                                                                    stackOut_61_0 = (lk) (Object) stackIn_61_0;
                                                                    stackOut_61_1 = 1;
                                                                    stackIn_63_0 = stackOut_61_0;
                                                                    stackIn_63_1 = stackOut_61_1;
                                                                    break L29;
                                                                  }
                                                                }
                                                                stackIn_63_0.field_Jb = stackIn_63_1 != 0;
                                                                var7.field_Rb = var8_int >> 1848459425;
                                                                var7.field_Ub = ((jc) (Object) var1).g(11132);
                                                                var7.field_Fb = ((jc) (Object) var1).g(11132);
                                                                qm.field_Mb.a((l) (Object) var7, (byte) -101);
                                                                if (var11 == 0) {
                                                                  break L1;
                                                                } else {
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                          }
                                                          L30: {
                                                            var3_long = ((jc) (Object) var1).e((byte) -60);
                                                            var5 = ((jc) (Object) var1).g(11132);
                                                            var17 = db.a(var3_long, false);
                                                            if (var17 == null) {
                                                              break L30;
                                                            } else {
                                                              L31: {
                                                                L32: {
                                                                  if (-16 == (var2 ^ -1)) {
                                                                    break L32;
                                                                  } else {
                                                                    if (!var17.field_Sb) {
                                                                      break L31;
                                                                    } else {
                                                                      ea.field_a = ea.field_a - 1;
                                                                      var17.field_Sb = false;
                                                                      if (var11 == 0) {
                                                                        break L31;
                                                                      } else {
                                                                        break L32;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var17.field_Xb = false;
                                                                break L31;
                                                              }
                                                              L33: {
                                                                if (0 == var5) {
                                                                  break L33;
                                                                } else {
                                                                  var17.field_Gb = fn.field_c;
                                                                  var17.field_Wb = var5;
                                                                  break L33;
                                                                }
                                                              }
                                                              je.a(var17, (byte) 99);
                                                              break L30;
                                                            }
                                                          }
                                                          if (var11 == 0) {
                                                            break L1;
                                                          } else {
                                                            break L15;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L34: {
                                                      var3_long = ((jc) (Object) var1).e((byte) -60);
                                                      var18 = db.a(var3_long, false);
                                                      if (var18 == null) {
                                                        break L34;
                                                      } else {
                                                        L35: {
                                                          L36: {
                                                            if (var2 == 14) {
                                                              break L36;
                                                            } else {
                                                              if (!var18.field_Sb) {
                                                                var18.field_Sb = true;
                                                                ea.field_a = ea.field_a + 1;
                                                                if (var11 == 0) {
                                                                  break L35;
                                                                } else {
                                                                  break L36;
                                                                }
                                                              } else {
                                                                break L35;
                                                              }
                                                            }
                                                          }
                                                          var18.field_Xb = true;
                                                          break L35;
                                                        }
                                                        je.a(var18, (byte) 112);
                                                        break L34;
                                                      }
                                                    }
                                                    if (var11 == 0) {
                                                      break L1;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                L37: {
                                                  var3 = ((jc) (Object) var1).c((byte) 66);
                                                  var4 = ((jc) (Object) var1).g(11132);
                                                  var19_ref = (he) (Object) ma.field_c.a((long)var3, (byte) -5);
                                                  if (var19_ref != null) {
                                                    L38: {
                                                      var25 = var19_ref;
                                                      var6_ref = var25;
                                                      var19_ref.field_sc = false;
                                                      var25.field_dc = false;
                                                      if (0 == var4) {
                                                        break L38;
                                                      } else {
                                                        var19_ref.field_Eb = var4;
                                                        var19_ref.field_Mb = fn.field_c;
                                                        break L38;
                                                      }
                                                    }
                                                    pg.a(false, var19_ref);
                                                    break L37;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                                if (var11 == 0) {
                                                  break L1;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                          L39: {
                                            var3 = ((jc) (Object) var1).c((byte) 71);
                                            var29 = (he) (Object) ma.field_c.a((long)var3, (byte) -46);
                                            if (var29 != null) {
                                              L40: {
                                                L41: {
                                                  if (11 != var2) {
                                                    break L41;
                                                  } else {
                                                    var29.field_dc = true;
                                                    if (var11 == 0) {
                                                      break L40;
                                                    } else {
                                                      break L41;
                                                    }
                                                  }
                                                }
                                                var29.field_sc = true;
                                                break L40;
                                              }
                                              pg.a(false, var29);
                                              break L39;
                                            } else {
                                              break L39;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      var30 = (he) (Object) te.field_f.a((byte) -110);
                                      L42: while (true) {
                                        L43: {
                                          if (var30 == null) {
                                            break L43;
                                          } else {
                                            var30.a(false);
                                            var30.c(11);
                                            var30 = (he) (Object) te.field_f.a(16213);
                                            if (var11 != 0) {
                                              break L1;
                                            } else {
                                              if (var11 == 0) {
                                                continue L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                  }
                                  L44: {
                                    var3 = ((jc) (Object) var1).c((byte) 38);
                                    var4 = ((jc) (Object) var1).g(11132);
                                    var31 = (he) (Object) ma.field_c.a((long)var3, (byte) 100);
                                    if (var31 != null) {
                                      L45: {
                                        L46: {
                                          if (0 == var4) {
                                            break L46;
                                          } else {
                                            var31.field_Eb = var4;
                                            var31.field_Mb = fn.field_c;
                                            if (var11 == 0) {
                                              break L45;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                        var31.a(false);
                                        break L45;
                                      }
                                      var31.c(25);
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L47: {
                                var3_long = ((jc) (Object) var1).e((byte) -60);
                                var5 = ((jc) (Object) var1).g(11132);
                                var22 = db.a(var3_long, false);
                                if (var22 != null) {
                                  L48: {
                                    if (!var22.field_Sb) {
                                      break L48;
                                    } else {
                                      ea.field_a = ea.field_a - 1;
                                      var22.field_Sb = false;
                                      break L48;
                                    }
                                  }
                                  L49: {
                                    L50: {
                                      if (var5 != 0) {
                                        break L50;
                                      } else {
                                        var22.a(false);
                                        if (var11 == 0) {
                                          break L49;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                    var22.field_Wb = var5;
                                    var22.field_Gb = fn.field_c;
                                    break L49;
                                  }
                                  var22.c(44);
                                  break L47;
                                } else {
                                  break L47;
                                }
                              }
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                          L51: {
                            var3_long = ((jc) (Object) var1).e((byte) -60);
                            var23 = ((jc) (Object) var1).h(-127);
                            var6 = ((jc) (Object) var1).h(-124);
                            var24 = ((jc) (Object) var1).h(-119);
                            var8 = db.a(var3_long, false);
                            if (var6.equals((Object) (Object) "")) {
                              stackOut_122_0 = 0;
                              stackIn_123_0 = stackOut_122_0;
                              break L51;
                            } else {
                              stackOut_121_0 = 1;
                              stackIn_123_0 = stackOut_121_0;
                              break L51;
                            }
                          }
                          L52: {
                            L53: {
                              var9 = stackIn_123_0;
                              if (var8 != null) {
                                break L53;
                              } else {
                                var8 = new lk(var23, var24, var3_long);
                                ti.field_i.a(var3_long, (wb) (Object) var8, 30804);
                                if (var11 == 0) {
                                  break L52;
                                } else {
                                  break L53;
                                }
                              }
                            }
                            if (var9 != 0) {
                              var8.a(var24, var23, 0);
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                          L54: {
                            var8.field_Ib = hc.a(-9986) + -(long)((jc) (Object) var1).d((byte) 123);
                            var8.field_Vb = ((jc) (Object) var1).c((byte) 33);
                            var10 = ((jc) (Object) var1).c(0);
                            var8.field_Rb = var10 >> 352882849;
                            stackOut_128_0 = (lk) var8;
                            stackIn_130_0 = stackOut_128_0;
                            stackIn_129_0 = stackOut_128_0;
                            if (0 == (1 & var10)) {
                              stackOut_130_0 = (lk) (Object) stackIn_130_0;
                              stackOut_130_1 = 0;
                              stackIn_131_0 = stackOut_130_0;
                              stackIn_131_1 = stackOut_130_1;
                              break L54;
                            } else {
                              stackOut_129_0 = (lk) (Object) stackIn_129_0;
                              stackOut_129_1 = 1;
                              stackIn_131_0 = stackOut_129_0;
                              stackIn_131_1 = stackOut_129_1;
                              break L54;
                            }
                          }
                          stackIn_131_0.field_Jb = stackIn_131_1 != 0;
                          var8.field_Ub = ((jc) (Object) var1).g(11132);
                          var8.field_Fb = ((jc) (Object) var1).g(11132);
                          je.a(var8, (byte) 95);
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                }
              }
              var3_ref_lk = (lk) (Object) qm.field_Mb.a((byte) -62);
              L55: while (true) {
                L56: {
                  L57: {
                    if (var3_ref_lk == null) {
                      break L57;
                    } else {
                      var3_ref_lk.a(false);
                      var3_ref_lk.c(54);
                      var3_ref_lk = (lk) (Object) qm.field_Mb.a(16213);
                      if (var11 != 0) {
                        break L56;
                      } else {
                        if (var11 == 0) {
                          continue L55;
                        } else {
                          break L57;
                        }
                      }
                    }
                  }
                  var3_ref_lk = (lk) (Object) ti.field_i.a(true);
                  break L56;
                }
                L58: while (true) {
                  L59: {
                    L60: {
                      if (var3_ref_lk == null) {
                        break L60;
                      } else {
                        stackOut_140_0 = var3_ref_lk.field_Xb;
                        stackIn_149_0 = stackOut_140_0 ? 1 : 0;
                        stackIn_141_0 = stackOut_140_0;
                        if (var11 != 0) {
                          break L59;
                        } else {
                          L61: {
                            L62: {
                              if (stackIn_141_0) {
                                break L62;
                              } else {
                                if (!var3_ref_lk.field_Sb) {
                                  break L61;
                                } else {
                                  break L62;
                                }
                              }
                            }
                            L63: {
                              var3_ref_lk.field_Xb = false;
                              if (!var3_ref_lk.field_Sb) {
                                break L63;
                              } else {
                                ea.field_a = ea.field_a - 1;
                                var3_ref_lk.field_Sb = false;
                                break L63;
                              }
                            }
                            je.a(var3_ref_lk, (byte) 114);
                            break L61;
                          }
                          var3_ref_lk = (lk) (Object) ti.field_i.b(-1);
                          if (var11 == 0) {
                            continue L58;
                          } else {
                            break L60;
                          }
                        }
                      }
                    }
                    stackOut_148_0 = var2 ^ -1;
                    stackIn_149_0 = stackOut_148_0;
                    break L59;
                  }
                  L64: {
                    if (stackIn_149_0 != -2) {
                      break L64;
                    } else {
                      if (wl.field_d == null) {
                        break L64;
                      } else {
                        cf.field_b = wl.field_d.field_Qb;
                        break L64;
                      }
                    }
                  }
                  L65: {
                    if (var2 != 4) {
                      wl.field_d = null;
                      break L65;
                    } else {
                      var3 = ((jc) (Object) var1).c((byte) -66);
                      wl.field_d = new he(vb.field_h);
                      wl.field_d.a(0, (long)var3);
                      cc.a(false, wl.field_d, true, (jc) (Object) var1);
                      d.field_Eb = 0L;
                      break L65;
                    }
                  }
                  L66: {
                    L67: {
                      L68: {
                        if (-3 == (var2 ^ -1)) {
                          break L68;
                        } else {
                          if ((var2 ^ -1) != -4) {
                            break L67;
                          } else {
                            break L68;
                          }
                        }
                      }
                      if (null == la.field_h) {
                        la.field_h = new he(vb.field_h);
                        if (var11 == 0) {
                          break L66;
                        } else {
                          break L67;
                        }
                      } else {
                        break L66;
                      }
                    }
                    la.field_h = null;
                    break L66;
                  }
                  L69: {
                    if (3 != var2) {
                      break L69;
                    } else {
                      ld.field_c = true;
                      var3 = 0;
                      L70: while (true) {
                        L71: {
                          L72: {
                            if (var3 >= kn.field_E.length) {
                              break L72;
                            } else {
                              kn.field_E[var3] = ((jc) (Object) var13).a((byte) -88);
                              var3++;
                              if (var11 != 0) {
                                break L71;
                              } else {
                                if (var11 == 0) {
                                  continue L70;
                                } else {
                                  break L72;
                                }
                              }
                            }
                          }
                          aa.field_e = ((jc) (Object) var1).g(11132);
                          qc.field_c = ((jc) (Object) var1).g(11132);
                          break L71;
                        }
                        var3 = 0;
                        L73: while (true) {
                          L74: {
                            if (var3 >= pm.field_p.length) {
                              break L74;
                            } else {
                              pm.field_p[var3] = ((jc) (Object) var13).a((byte) -77);
                              var3++;
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (var11 == 0) {
                                  continue L73;
                                } else {
                                  break L74;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L69;
                          }
                        }
                      }
                    }
                  }
                  ld.field_c = false;
                  break L0;
                }
              }
            }
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new p();
        field_k = new byte[50][];
        field_h = new ra();
        field_g = "Create a free Account";
    }
}
