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
        var3 = param1 >> 31 & param0 + -1;
        if (param2 != 1) {
          return 82;
        } else {
          return var3 + ((param1 >>> 31) + param1) % param0;
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
        try {
            ((bj) this).field_i = param1;
            ((bj) this).field_l = param2;
            ((bj) this).field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) (Object) runtimeException, "bj.<init>(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        hg var1_ref = null;
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
        lk stackIn_62_0 = null;
        lk stackIn_63_0 = null;
        lk stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_124_0 = 0;
        lk stackIn_130_0 = null;
        lk stackIn_131_0 = null;
        lk stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        boolean stackIn_142_0 = false;
        int stackIn_150_0 = 0;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_61_0 = null;
        lk stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        lk stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        lk stackOut_129_0 = null;
        lk stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        lk stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        boolean stackOut_141_0 = false;
        int stackOut_149_0 = 0;
        var26 = null;
        var19 = null;
        var20 = null;
        var27 = null;
        var21 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var13 = sh.field_qb;
            var1_ref = var13;
            var2 = ((jc) (Object) var1_ref).g(11132);
            L1: {
              L2: {
                L3: {
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (var2 == 3) {
                          break L3;
                        } else {
                          if (var2 == 4) {
                            break L3;
                          } else {
                            L4: {
                              if (5 == var2) {
                                break L4;
                              } else {
                                L5: {
                                  if (6 == var2) {
                                    break L5;
                                  } else {
                                    L6: {
                                      if (var2 != 7) {
                                        break L6;
                                      } else {
                                        var28 = (lk) (Object) ci.field_o.a((byte) -77);
                                        L7: while (true) {
                                          L8: {
                                            L9: {
                                              if (var28 == null) {
                                                break L9;
                                              } else {
                                                var28.a(false);
                                                var28.c(53);
                                                var28 = (lk) (Object) ci.field_o.a(16213);
                                                if (var11 != 0) {
                                                  break L8;
                                                } else {
                                                  if (var11 == 0) {
                                                    continue L7;
                                                  } else {
                                                    break L9;
                                                  }
                                                }
                                              }
                                            }
                                            ea.field_a = 0;
                                            break L8;
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    L10: {
                                      if (8 != var2) {
                                        break L10;
                                      } else {
                                        L11: {
                                          var3 = ((jc) (Object) var1_ref).c((byte) 100);
                                          var4_ref_he = (he) (Object) ma.field_c.a((long)var3, (byte) -103);
                                          if (var4_ref_he != null) {
                                            break L11;
                                          } else {
                                            var4_ref_he = new he(vb.field_h);
                                            ma.field_c.a((long)var3, (wb) (Object) var4_ref_he, 30804);
                                            break L11;
                                          }
                                        }
                                        cc.a(true, var4_ref_he, true, (jc) (Object) var1_ref);
                                        pg.a(false, var4_ref_he);
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L12: {
                                      if (var2 == 9) {
                                        break L12;
                                      } else {
                                        L13: {
                                          if (10 == var2) {
                                            break L13;
                                          } else {
                                            L14: {
                                              if (var2 == 11) {
                                                break L14;
                                              } else {
                                                if (var2 == 12) {
                                                  break L14;
                                                } else {
                                                  L15: {
                                                    if (var2 == 13) {
                                                      break L15;
                                                    } else {
                                                      L16: {
                                                        if (var2 == 14) {
                                                          break L16;
                                                        } else {
                                                          if (var2 == 16) {
                                                            break L16;
                                                          } else {
                                                            L17: {
                                                              if (var2 == 15) {
                                                                break L17;
                                                              } else {
                                                                if (var2 == 17) {
                                                                  break L17;
                                                                } else {
                                                                  L18: {
                                                                    if (var2 == 18) {
                                                                      break L18;
                                                                    } else {
                                                                      L19: {
                                                                        if (var2 == 19) {
                                                                          break L19;
                                                                        } else {
                                                                          L20: {
                                                                            if (var2 == 20) {
                                                                              break L20;
                                                                            } else {
                                                                              L21: {
                                                                                if (21 != var2) {
                                                                                  break L21;
                                                                                } else {
                                                                                  L22: {
                                                                                    L23: {
                                                                                      var3 = ((jc) (Object) var1_ref).c((byte) -90);
                                                                                      if (0 != var3) {
                                                                                        break L23;
                                                                                      } else {
                                                                                        d.field_Eb = 0L;
                                                                                        if (var11 == 0) {
                                                                                          break L22;
                                                                                        } else {
                                                                                          break L23;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    d.field_Eb = hc.a(-9986) + (long)var3;
                                                                                    break L22;
                                                                                  }
                                                                                  if (var11 == 0) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    break L21;
                                                                                  }
                                                                                }
                                                                              }
                                                                              L24: {
                                                                                if (var2 == 22) {
                                                                                  break L24;
                                                                                } else {
                                                                                  L25: {
                                                                                    if (var2 == 23) {
                                                                                      break L25;
                                                                                    } else {
                                                                                      en.a("L1: " + rg.a(true), (Throwable) null, 1);
                                                                                      tn.a(false);
                                                                                      if (var11 == 0) {
                                                                                        break L2;
                                                                                      } else {
                                                                                        break L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  hh.field_d = ((jc) (Object) var1_ref).e((byte) -60);
                                                                                  if (var11 == 0) {
                                                                                    break L2;
                                                                                  } else {
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                              }
                                                                              sb.field_i = ((jc) (Object) var1_ref).c((byte) 69);
                                                                              nh.field_c = ((jc) (Object) var1_ref).c(0);
                                                                              if (var11 == 0) {
                                                                                break L2;
                                                                              } else {
                                                                                break L20;
                                                                              }
                                                                            }
                                                                          }
                                                                          cc.a(false, wl.field_d, true, (jc) (Object) var1_ref);
                                                                          if (var11 == 0) {
                                                                            break L2;
                                                                          } else {
                                                                            break L19;
                                                                          }
                                                                        }
                                                                      }
                                                                      L26: {
                                                                        var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                                        var5 = ((jc) (Object) var1_ref).g(11132);
                                                                        var14 = ic.a(var3_long, (byte) -127);
                                                                        if (var14 != null) {
                                                                          L27: {
                                                                            L28: {
                                                                              if (var5 != 0) {
                                                                                break L28;
                                                                              } else {
                                                                                var14.a(false);
                                                                                if (var11 == 0) {
                                                                                  break L27;
                                                                                } else {
                                                                                  break L28;
                                                                                }
                                                                              }
                                                                            }
                                                                            var14.field_Gb = fn.field_c;
                                                                            var14.field_Wb = var5;
                                                                            break L27;
                                                                          }
                                                                          var14.c(32);
                                                                          wl.field_d.field_ic = wl.field_d.field_ic - 1;
                                                                          break L26;
                                                                        } else {
                                                                          break L26;
                                                                        }
                                                                      }
                                                                      if (var11 == 0) {
                                                                        break L2;
                                                                      } else {
                                                                        break L18;
                                                                      }
                                                                    }
                                                                  }
                                                                  L29: {
                                                                    var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                                    var15 = ((jc) (Object) var1_ref).h(-118);
                                                                    var16 = ((jc) (Object) var1_ref).h(-118);
                                                                    var7 = ic.a(var3_long, (byte) -127);
                                                                    if (var7 == null) {
                                                                      var7 = new lk(var15, var16, var3_long);
                                                                      ah.field_h.a(var3_long, (wb) (Object) var7, 30804);
                                                                      wl.field_d.field_ic = wl.field_d.field_ic + 1;
                                                                      break L29;
                                                                    } else {
                                                                      break L29;
                                                                    }
                                                                  }
                                                                  L30: {
                                                                    var7.field_Vb = ((jc) (Object) var1_ref).c((byte) 75);
                                                                    var8_int = ((jc) (Object) var1_ref).c(0);
                                                                    stackOut_61_0 = (lk) var7;
                                                                    stackIn_63_0 = stackOut_61_0;
                                                                    stackIn_62_0 = stackOut_61_0;
                                                                    if (0 == (1 & var8_int)) {
                                                                      stackOut_63_0 = (lk) (Object) stackIn_63_0;
                                                                      stackOut_63_1 = 0;
                                                                      stackIn_64_0 = stackOut_63_0;
                                                                      stackIn_64_1 = stackOut_63_1;
                                                                      break L30;
                                                                    } else {
                                                                      stackOut_62_0 = (lk) (Object) stackIn_62_0;
                                                                      stackOut_62_1 = 1;
                                                                      stackIn_64_0 = stackOut_62_0;
                                                                      stackIn_64_1 = stackOut_62_1;
                                                                      break L30;
                                                                    }
                                                                  }
                                                                  stackIn_64_0.field_Jb = stackIn_64_1 != 0;
                                                                  var7.field_Rb = var8_int >> 1;
                                                                  var7.field_Ub = ((jc) (Object) var1_ref).g(11132);
                                                                  var7.field_Fb = ((jc) (Object) var1_ref).g(11132);
                                                                  qm.field_Mb.a((l) (Object) var7, (byte) -101);
                                                                  if (var11 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L17;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                            L31: {
                                                              var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                              var5 = ((jc) (Object) var1_ref).g(11132);
                                                              var17 = db.a(var3_long, false);
                                                              if (var17 == null) {
                                                                break L31;
                                                              } else {
                                                                L32: {
                                                                  L33: {
                                                                    if (var2 == 15) {
                                                                      break L33;
                                                                    } else {
                                                                      if (!var17.field_Sb) {
                                                                        break L32;
                                                                      } else {
                                                                        ea.field_a = ea.field_a - 1;
                                                                        var17.field_Sb = false;
                                                                        if (var11 == 0) {
                                                                          break L32;
                                                                        } else {
                                                                          break L33;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                  var17.field_Xb = false;
                                                                  break L32;
                                                                }
                                                                L34: {
                                                                  if (0 == var5) {
                                                                    break L34;
                                                                  } else {
                                                                    var17.field_Gb = fn.field_c;
                                                                    var17.field_Wb = var5;
                                                                    break L34;
                                                                  }
                                                                }
                                                                je.a(var17, (byte) 99);
                                                                break L31;
                                                              }
                                                            }
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L16;
                                                            }
                                                          }
                                                        }
                                                      }
                                                      L35: {
                                                        var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                        var18 = db.a(var3_long, false);
                                                        if (var18 == null) {
                                                          break L35;
                                                        } else {
                                                          L36: {
                                                            L37: {
                                                              if (var2 == 14) {
                                                                break L37;
                                                              } else {
                                                                if (!var18.field_Sb) {
                                                                  var18.field_Sb = true;
                                                                  ea.field_a = ea.field_a + 1;
                                                                  if (var11 == 0) {
                                                                    break L36;
                                                                  } else {
                                                                    break L37;
                                                                  }
                                                                } else {
                                                                  break L36;
                                                                }
                                                              }
                                                            }
                                                            var18.field_Xb = true;
                                                            break L36;
                                                          }
                                                          je.a(var18, (byte) 112);
                                                          break L35;
                                                        }
                                                      }
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  L38: {
                                                    var3 = ((jc) (Object) var1_ref).c((byte) 66);
                                                    var4 = ((jc) (Object) var1_ref).g(11132);
                                                    var19_ref = (he) (Object) ma.field_c.a((long)var3, (byte) -5);
                                                    if (var19_ref != null) {
                                                      L39: {
                                                        var25 = var19_ref;
                                                        var6_ref = var25;
                                                        var19_ref.field_sc = false;
                                                        var25.field_dc = false;
                                                        if (0 == var4) {
                                                          break L39;
                                                        } else {
                                                          var19_ref.field_Eb = var4;
                                                          var19_ref.field_Mb = fn.field_c;
                                                          break L39;
                                                        }
                                                      }
                                                      pg.a(false, var19_ref);
                                                      break L38;
                                                    } else {
                                                      break L38;
                                                    }
                                                  }
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L14;
                                                  }
                                                }
                                              }
                                            }
                                            L40: {
                                              var3 = ((jc) (Object) var1_ref).c((byte) 71);
                                              var29 = (he) (Object) ma.field_c.a((long)var3, (byte) -46);
                                              if (var29 != null) {
                                                L41: {
                                                  L42: {
                                                    if (11 != var2) {
                                                      break L42;
                                                    } else {
                                                      var29.field_dc = true;
                                                      if (var11 == 0) {
                                                        break L41;
                                                      } else {
                                                        break L42;
                                                      }
                                                    }
                                                  }
                                                  var29.field_sc = true;
                                                  break L41;
                                                }
                                                pg.a(false, var29);
                                                break L40;
                                              } else {
                                                break L40;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L2;
                                            } else {
                                              break L13;
                                            }
                                          }
                                        }
                                        var30 = (he) (Object) te.field_f.a((byte) -110);
                                        L43: while (true) {
                                          L44: {
                                            if (var30 == null) {
                                              break L44;
                                            } else {
                                              var30.a(false);
                                              var30.c(11);
                                              var30 = (he) (Object) te.field_f.a(16213);
                                              if (var11 != 0) {
                                                break L2;
                                              } else {
                                                if (var11 == 0) {
                                                  continue L43;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                    }
                                    L45: {
                                      var3 = ((jc) (Object) var1_ref).c((byte) 38);
                                      var4 = ((jc) (Object) var1_ref).g(11132);
                                      var31 = (he) (Object) ma.field_c.a((long)var3, (byte) 100);
                                      if (var31 != null) {
                                        L46: {
                                          L47: {
                                            if (0 == var4) {
                                              break L47;
                                            } else {
                                              var31.field_Eb = var4;
                                              var31.field_Mb = fn.field_c;
                                              if (var11 == 0) {
                                                break L46;
                                              } else {
                                                break L47;
                                              }
                                            }
                                          }
                                          var31.a(false);
                                          break L46;
                                        }
                                        var31.c(25);
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L2;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                                L48: {
                                  var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                  var5 = ((jc) (Object) var1_ref).g(11132);
                                  var22 = db.a(var3_long, false);
                                  if (var22 != null) {
                                    L49: {
                                      if (!var22.field_Sb) {
                                        break L49;
                                      } else {
                                        ea.field_a = ea.field_a - 1;
                                        var22.field_Sb = false;
                                        break L49;
                                      }
                                    }
                                    L50: {
                                      L51: {
                                        if (var5 != 0) {
                                          break L51;
                                        } else {
                                          var22.a(false);
                                          if (var11 == 0) {
                                            break L50;
                                          } else {
                                            break L51;
                                          }
                                        }
                                      }
                                      var22.field_Wb = var5;
                                      var22.field_Gb = fn.field_c;
                                      break L50;
                                    }
                                    var22.c(44);
                                    break L48;
                                  } else {
                                    break L48;
                                  }
                                }
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L52: {
                              var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                              var23 = ((jc) (Object) var1_ref).h(-127);
                              var6 = ((jc) (Object) var1_ref).h(-124);
                              var24 = ((jc) (Object) var1_ref).h(-119);
                              var8 = db.a(var3_long, false);
                              if (var6.equals((Object) (Object) "")) {
                                stackOut_123_0 = 0;
                                stackIn_124_0 = stackOut_123_0;
                                break L52;
                              } else {
                                stackOut_122_0 = 1;
                                stackIn_124_0 = stackOut_122_0;
                                break L52;
                              }
                            }
                            L53: {
                              L54: {
                                var9 = stackIn_124_0;
                                if (var8 != null) {
                                  break L54;
                                } else {
                                  var8 = new lk(var23, var24, var3_long);
                                  ti.field_i.a(var3_long, (wb) (Object) var8, 30804);
                                  if (var11 == 0) {
                                    break L53;
                                  } else {
                                    break L54;
                                  }
                                }
                              }
                              if (var9 != 0) {
                                var8.a(var24, var23, 0);
                                break L53;
                              } else {
                                break L53;
                              }
                            }
                            L55: {
                              var8.field_Ib = hc.a(-9986) + -(long)((jc) (Object) var1_ref).d((byte) 123);
                              var8.field_Vb = ((jc) (Object) var1_ref).c((byte) 33);
                              var10 = ((jc) (Object) var1_ref).c(0);
                              var8.field_Rb = var10 >> 1;
                              stackOut_129_0 = (lk) var8;
                              stackIn_131_0 = stackOut_129_0;
                              stackIn_130_0 = stackOut_129_0;
                              if (0 == (1 & var10)) {
                                stackOut_131_0 = (lk) (Object) stackIn_131_0;
                                stackOut_131_1 = 0;
                                stackIn_132_0 = stackOut_131_0;
                                stackIn_132_1 = stackOut_131_1;
                                break L55;
                              } else {
                                stackOut_130_0 = (lk) (Object) stackIn_130_0;
                                stackOut_130_1 = 1;
                                stackIn_132_0 = stackOut_130_0;
                                stackIn_132_1 = stackOut_130_1;
                                break L55;
                              }
                            }
                            stackIn_132_0.field_Jb = stackIn_132_1 != 0;
                            var8.field_Ub = ((jc) (Object) var1_ref).g(11132);
                            var8.field_Fb = ((jc) (Object) var1_ref).g(11132);
                            je.a(var8, (byte) 95);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_lk = (lk) (Object) qm.field_Mb.a((byte) -62);
                L56: while (true) {
                  L57: {
                    L58: {
                      if (var3_ref_lk == null) {
                        break L58;
                      } else {
                        var3_ref_lk.a(false);
                        var3_ref_lk.c(54);
                        var3_ref_lk = (lk) (Object) qm.field_Mb.a(16213);
                        if (var11 != 0) {
                          break L57;
                        } else {
                          if (var11 == 0) {
                            continue L56;
                          } else {
                            break L58;
                          }
                        }
                      }
                    }
                    var3_ref_lk = (lk) (Object) ti.field_i.a(true);
                    break L57;
                  }
                  L59: while (true) {
                    L60: {
                      L61: {
                        if (var3_ref_lk == null) {
                          break L61;
                        } else {
                          stackOut_141_0 = var3_ref_lk.field_Xb;
                          stackIn_150_0 = stackOut_141_0 ? 1 : 0;
                          stackIn_142_0 = stackOut_141_0;
                          if (var11 != 0) {
                            break L60;
                          } else {
                            L62: {
                              L63: {
                                if (stackIn_142_0) {
                                  break L63;
                                } else {
                                  if (!var3_ref_lk.field_Sb) {
                                    break L62;
                                  } else {
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                var3_ref_lk.field_Xb = false;
                                if (!var3_ref_lk.field_Sb) {
                                  break L64;
                                } else {
                                  ea.field_a = ea.field_a - 1;
                                  var3_ref_lk.field_Sb = false;
                                  break L64;
                                }
                              }
                              je.a(var3_ref_lk, (byte) 114);
                              break L62;
                            }
                            var3_ref_lk = (lk) (Object) ti.field_i.b(-1);
                            if (var11 == 0) {
                              continue L59;
                            } else {
                              break L61;
                            }
                          }
                        }
                      }
                      stackOut_149_0 = ~var2;
                      stackIn_150_0 = stackOut_149_0;
                      break L60;
                    }
                    L65: {
                      if (stackIn_150_0 != -2) {
                        break L65;
                      } else {
                        if (wl.field_d == null) {
                          break L65;
                        } else {
                          cf.field_b = wl.field_d.field_Qb;
                          break L65;
                        }
                      }
                    }
                    L66: {
                      if (var2 != 4) {
                        wl.field_d = null;
                        break L66;
                      } else {
                        var3 = ((jc) (Object) var1_ref).c((byte) -66);
                        wl.field_d = new he(vb.field_h);
                        wl.field_d.a(0, (long)var3);
                        cc.a(false, wl.field_d, true, (jc) (Object) var1_ref);
                        d.field_Eb = 0L;
                        break L66;
                      }
                    }
                    L67: {
                      L68: {
                        L69: {
                          if (var2 == 2) {
                            break L69;
                          } else {
                            if (var2 != 3) {
                              break L68;
                            } else {
                              break L69;
                            }
                          }
                        }
                        if (null == la.field_h) {
                          la.field_h = new he(vb.field_h);
                          if (var11 == 0) {
                            break L67;
                          } else {
                            break L68;
                          }
                        } else {
                          break L67;
                        }
                      }
                      la.field_h = null;
                      break L67;
                    }
                    L70: {
                      if (3 != var2) {
                        break L70;
                      } else {
                        ld.field_c = true;
                        var3 = 0;
                        L71: while (true) {
                          L72: {
                            L73: {
                              if (var3 >= kn.field_E.length) {
                                break L73;
                              } else {
                                kn.field_E[var3] = ((jc) (Object) var13).a((byte) -88);
                                var3++;
                                if (var11 != 0) {
                                  break L72;
                                } else {
                                  if (var11 == 0) {
                                    continue L71;
                                  } else {
                                    break L73;
                                  }
                                }
                              }
                            }
                            aa.field_e = ((jc) (Object) var1_ref).g(11132);
                            qc.field_c = ((jc) (Object) var1_ref).g(11132);
                            break L72;
                          }
                          var3 = 0;
                          L74: while (true) {
                            L75: {
                              if (var3 >= pm.field_p.length) {
                                break L75;
                              } else {
                                pm.field_p[var3] = ((jc) (Object) var13).a((byte) -77);
                                var3++;
                                if (var11 != 0) {
                                  break L2;
                                } else {
                                  if (var11 == 0) {
                                    continue L74;
                                  } else {
                                    break L75;
                                  }
                                }
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L70;
                            }
                          }
                        }
                      }
                    }
                    ld.field_c = false;
                    break L1;
                  }
                }
              }
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "bj.C(" + -31 + 41);
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
