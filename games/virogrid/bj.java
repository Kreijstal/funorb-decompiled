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

    final static int b(int param0, int param1) {
        int var3 = param1 >> 31 & param0 + -1;
        return var3 + ((param1 >>> 31) + param1) % param0;
    }

    final static void a(int param0, int param1, int param2) {
        ad.field_i = param2;
        hn.field_q = param0;
    }

    public static void a() {
        field_o = null;
        field_g = null;
        field_k = null;
        field_h = null;
        field_m = null;
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
        Object var3_ref = null;
        lk var3_ref_lk = null;
        long var3_long = 0L;
        int var3 = 0;
        he var3_ref_he = null;
        Object var4_ref = null;
        he var4_ref_he = null;
        int var4 = 0;
        String var5 = null;
        int var5_int = 0;
        he var5_ref = null;
        lk var5_ref2 = null;
        String var6 = null;
        lk var6_ref = null;
        he var6_ref2 = null;
        String var7 = null;
        lk var7_ref = null;
        lk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        lk stackIn_51_0 = null;
        lk stackIn_52_0 = null;
        lk stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_102_0 = 0;
        lk stackIn_108_0 = null;
        lk stackIn_109_0 = null;
        lk stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        lk stackOut_107_0 = null;
        lk stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        lk stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        lk stackOut_50_0 = null;
        lk stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        lk stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        var3_ref = null;
        var4_ref = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1_ref = sh.field_qb;
            var2 = ((jc) (Object) var1_ref).g(11132);
            if (param0 < -3) {
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
                              if (5 == var2) {
                                L4: {
                                  var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                  var5 = ((jc) (Object) var1_ref).h(-127);
                                  var6 = ((jc) (Object) var1_ref).h(-124);
                                  var7 = ((jc) (Object) var1_ref).h(-119);
                                  int discarded$6 = 0;
                                  var8 = db.a(var3_long);
                                  if (var6.equals((Object) (Object) "")) {
                                    stackOut_101_0 = 0;
                                    stackIn_102_0 = stackOut_101_0;
                                    break L4;
                                  } else {
                                    stackOut_100_0 = 1;
                                    stackIn_102_0 = stackOut_100_0;
                                    break L4;
                                  }
                                }
                                L5: {
                                  var9 = stackIn_102_0;
                                  if (var8 != null) {
                                    if (var9 != 0) {
                                      var8.a(var7, var5, 0);
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    var8 = new lk(var5, var7, var3_long);
                                    ti.field_i.a(var3_long, (wb) (Object) var8, 30804);
                                    break L5;
                                  }
                                }
                                L6: {
                                  var8.field_Ib = hc.a(-9986) + -(long)((jc) (Object) var1_ref).d((byte) 123);
                                  var8.field_Vb = ((jc) (Object) var1_ref).c((byte) 33);
                                  var10 = ((jc) (Object) var1_ref).c(0);
                                  var8.field_Rb = var10 >> 1;
                                  stackOut_107_0 = (lk) var8;
                                  stackIn_109_0 = stackOut_107_0;
                                  stackIn_108_0 = stackOut_107_0;
                                  if (0 == (1 & var10)) {
                                    stackOut_109_0 = (lk) (Object) stackIn_109_0;
                                    stackOut_109_1 = 0;
                                    stackIn_110_0 = stackOut_109_0;
                                    stackIn_110_1 = stackOut_109_1;
                                    break L6;
                                  } else {
                                    stackOut_108_0 = (lk) (Object) stackIn_108_0;
                                    stackOut_108_1 = 1;
                                    stackIn_110_0 = stackOut_108_0;
                                    stackIn_110_1 = stackOut_108_1;
                                    break L6;
                                  }
                                }
                                stackIn_110_0.field_Jb = stackIn_110_1 != 0;
                                var8.field_Ub = ((jc) (Object) var1_ref).g(11132);
                                var8.field_Fb = ((jc) (Object) var1_ref).g(11132);
                                je.a(var8, (byte) 95);
                                break L1;
                              } else {
                                if (6 == var2) {
                                  var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                  var5_int = ((jc) (Object) var1_ref).g(11132);
                                  int discarded$7 = 0;
                                  var6_ref = db.a(var3_long);
                                  if (var6_ref != null) {
                                    L7: {
                                      if (!var6_ref.field_Sb) {
                                        break L7;
                                      } else {
                                        ea.field_a = ea.field_a - 1;
                                        var6_ref.field_Sb = false;
                                        break L7;
                                      }
                                    }
                                    L8: {
                                      if (var5_int != 0) {
                                        var6_ref.field_Wb = var5_int;
                                        var6_ref.field_Gb = fn.field_c;
                                        break L8;
                                      } else {
                                        var6_ref.a(false);
                                        break L8;
                                      }
                                    }
                                    var6_ref.c(44);
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (var2 != 7) {
                                    if (8 != var2) {
                                      if (var2 == 9) {
                                        var3 = ((jc) (Object) var1_ref).c((byte) 38);
                                        var4 = ((jc) (Object) var1_ref).g(11132);
                                        var5_ref = (he) (Object) ma.field_c.a((long)var3, (byte) 100);
                                        if (var5_ref != null) {
                                          L9: {
                                            if (0 == var4) {
                                              var5_ref.a(false);
                                              break L9;
                                            } else {
                                              var5_ref.field_Eb = var4;
                                              var5_ref.field_Mb = fn.field_c;
                                              break L9;
                                            }
                                          }
                                          var5_ref.c(25);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      } else {
                                        if (10 == var2) {
                                          var3_ref_he = (he) (Object) te.field_f.a((byte) -110);
                                          L10: while (true) {
                                            if (var3_ref_he == null) {
                                              break L2;
                                            } else {
                                              var3_ref_he.a(false);
                                              var3_ref_he.c(11);
                                              var3_ref_he = (he) (Object) te.field_f.a(16213);
                                              continue L10;
                                            }
                                          }
                                        } else {
                                          L11: {
                                            if (var2 == 11) {
                                              break L11;
                                            } else {
                                              if (var2 == 12) {
                                                break L11;
                                              } else {
                                                if (var2 == 13) {
                                                  var3 = ((jc) (Object) var1_ref).c((byte) 66);
                                                  var4 = ((jc) (Object) var1_ref).g(11132);
                                                  var5_ref = (he) (Object) ma.field_c.a((long)var3, (byte) -5);
                                                  if (var5_ref != null) {
                                                    L12: {
                                                      var6_ref2 = var5_ref;
                                                      var5_ref.field_sc = false;
                                                      var6_ref2.field_dc = false;
                                                      if (0 == var4) {
                                                        break L12;
                                                      } else {
                                                        var5_ref.field_Eb = var4;
                                                        var5_ref.field_Mb = fn.field_c;
                                                        break L12;
                                                      }
                                                    }
                                                    pg.a(false, var5_ref);
                                                    break L1;
                                                  } else {
                                                    break L1;
                                                  }
                                                } else {
                                                  L13: {
                                                    if (var2 == 14) {
                                                      break L13;
                                                    } else {
                                                      if (var2 == 16) {
                                                        break L13;
                                                      } else {
                                                        L14: {
                                                          if (var2 == 15) {
                                                            break L14;
                                                          } else {
                                                            if (var2 == 17) {
                                                              break L14;
                                                            } else {
                                                              if (var2 == 18) {
                                                                L15: {
                                                                  var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                                  var5 = ((jc) (Object) var1_ref).h(-118);
                                                                  var6 = ((jc) (Object) var1_ref).h(-118);
                                                                  var7_ref = ic.a(var3_long, (byte) -127);
                                                                  if (var7_ref == null) {
                                                                    var7_ref = new lk(var5, var6, var3_long);
                                                                    ah.field_h.a(var3_long, (wb) (Object) var7_ref, 30804);
                                                                    wl.field_d.field_ic = wl.field_d.field_ic + 1;
                                                                    break L15;
                                                                  } else {
                                                                    break L15;
                                                                  }
                                                                }
                                                                L16: {
                                                                  var7_ref.field_Vb = ((jc) (Object) var1_ref).c((byte) 75);
                                                                  var8_int = ((jc) (Object) var1_ref).c(0);
                                                                  stackOut_50_0 = (lk) var7_ref;
                                                                  stackIn_52_0 = stackOut_50_0;
                                                                  stackIn_51_0 = stackOut_50_0;
                                                                  if (0 == (1 & var8_int)) {
                                                                    stackOut_52_0 = (lk) (Object) stackIn_52_0;
                                                                    stackOut_52_1 = 0;
                                                                    stackIn_53_0 = stackOut_52_0;
                                                                    stackIn_53_1 = stackOut_52_1;
                                                                    break L16;
                                                                  } else {
                                                                    stackOut_51_0 = (lk) (Object) stackIn_51_0;
                                                                    stackOut_51_1 = 1;
                                                                    stackIn_53_0 = stackOut_51_0;
                                                                    stackIn_53_1 = stackOut_51_1;
                                                                    break L16;
                                                                  }
                                                                }
                                                                stackIn_53_0.field_Jb = stackIn_53_1 != 0;
                                                                var7_ref.field_Rb = var8_int >> 1;
                                                                var7_ref.field_Ub = ((jc) (Object) var1_ref).g(11132);
                                                                var7_ref.field_Fb = ((jc) (Object) var1_ref).g(11132);
                                                                qm.field_Mb.a((l) (Object) var7_ref, (byte) -101);
                                                                break L1;
                                                              } else {
                                                                if (var2 == 19) {
                                                                  var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                                  var5_int = ((jc) (Object) var1_ref).g(11132);
                                                                  var6_ref = ic.a(var3_long, (byte) -127);
                                                                  if (var6_ref != null) {
                                                                    L17: {
                                                                      if (var5_int != 0) {
                                                                        var6_ref.field_Gb = fn.field_c;
                                                                        var6_ref.field_Wb = var5_int;
                                                                        break L17;
                                                                      } else {
                                                                        var6_ref.a(false);
                                                                        break L17;
                                                                      }
                                                                    }
                                                                    var6_ref.c(32);
                                                                    wl.field_d.field_ic = wl.field_d.field_ic - 1;
                                                                    break L1;
                                                                  } else {
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  if (var2 == 20) {
                                                                    cc.a(false, wl.field_d, true, (jc) (Object) var1_ref);
                                                                    break L1;
                                                                  } else {
                                                                    if (21 != var2) {
                                                                      if (var2 == 22) {
                                                                        sb.field_i = ((jc) (Object) var1_ref).c((byte) 69);
                                                                        nh.field_c = ((jc) (Object) var1_ref).c(0);
                                                                        break L1;
                                                                      } else {
                                                                        if (var2 == 23) {
                                                                          hh.field_d = ((jc) (Object) var1_ref).e((byte) -60);
                                                                          break L1;
                                                                        } else {
                                                                          int discarded$8 = 1;
                                                                          int discarded$9 = 1;
                                                                          en.a("L1: " + rg.a(), (Throwable) null);
                                                                          tn.a(false);
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3 = ((jc) (Object) var1_ref).c((byte) -90);
                                                                      if (0 != var3) {
                                                                        d.field_Eb = hc.a(-9986) + (long)var3;
                                                                        break L1;
                                                                      } else {
                                                                        d.field_Eb = 0L;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                        L18: {
                                                          var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                          var5_int = ((jc) (Object) var1_ref).g(11132);
                                                          int discarded$10 = 0;
                                                          var6_ref = db.a(var3_long);
                                                          if (var6_ref == null) {
                                                            break L18;
                                                          } else {
                                                            L19: {
                                                              if (var2 == 15) {
                                                                var6_ref.field_Xb = false;
                                                                break L19;
                                                              } else {
                                                                if (!var6_ref.field_Sb) {
                                                                  break L19;
                                                                } else {
                                                                  ea.field_a = ea.field_a - 1;
                                                                  var6_ref.field_Sb = false;
                                                                  break L19;
                                                                }
                                                              }
                                                            }
                                                            L20: {
                                                              if (0 == var5_int) {
                                                                break L20;
                                                              } else {
                                                                var6_ref.field_Gb = fn.field_c;
                                                                var6_ref.field_Wb = var5_int;
                                                                break L20;
                                                              }
                                                            }
                                                            je.a(var6_ref, (byte) 99);
                                                            break L18;
                                                          }
                                                        }
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    var3_long = ((jc) (Object) var1_ref).e((byte) -60);
                                                    int discarded$11 = 0;
                                                    var5_ref2 = db.a(var3_long);
                                                    if (var5_ref2 == null) {
                                                      break L21;
                                                    } else {
                                                      L22: {
                                                        if (var2 == 14) {
                                                          var5_ref2.field_Xb = true;
                                                          break L22;
                                                        } else {
                                                          if (!var5_ref2.field_Sb) {
                                                            var5_ref2.field_Sb = true;
                                                            ea.field_a = ea.field_a + 1;
                                                            break L22;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      je.a(var5_ref2, (byte) 112);
                                                      break L21;
                                                    }
                                                  }
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                          var3 = ((jc) (Object) var1_ref).c((byte) 71);
                                          var4_ref_he = (he) (Object) ma.field_c.a((long)var3, (byte) -46);
                                          if (var4_ref_he != null) {
                                            L23: {
                                              if (11 != var2) {
                                                var4_ref_he.field_sc = true;
                                                break L23;
                                              } else {
                                                var4_ref_he.field_dc = true;
                                                break L23;
                                              }
                                            }
                                            pg.a(false, var4_ref_he);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      L24: {
                                        var3 = ((jc) (Object) var1_ref).c((byte) 100);
                                        var4_ref_he = (he) (Object) ma.field_c.a((long)var3, (byte) -103);
                                        if (var4_ref_he != null) {
                                          break L24;
                                        } else {
                                          var4_ref_he = new he(vb.field_h);
                                          ma.field_c.a((long)var3, (wb) (Object) var4_ref_he, 30804);
                                          break L24;
                                        }
                                      }
                                      cc.a(true, var4_ref_he, true, (jc) (Object) var1_ref);
                                      pg.a(false, var4_ref_he);
                                      break L1;
                                    }
                                  } else {
                                    var3_ref_lk = (lk) (Object) ci.field_o.a((byte) -77);
                                    L25: while (true) {
                                      if (var3_ref_lk == null) {
                                        ea.field_a = 0;
                                        break L1;
                                      } else {
                                        var3_ref_lk.a(false);
                                        var3_ref_lk.c(53);
                                        var3_ref_lk = (lk) (Object) ci.field_o.a(16213);
                                        continue L25;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  var3_ref_lk = (lk) (Object) qm.field_Mb.a((byte) -62);
                  L26: while (true) {
                    if (var3_ref_lk == null) {
                      var3_ref_lk = (lk) (Object) ti.field_i.a(true);
                      L27: while (true) {
                        if (var3_ref_lk == null) {
                          L28: {
                            if (var2 != 1) {
                              break L28;
                            } else {
                              if (wl.field_d == null) {
                                break L28;
                              } else {
                                cf.field_b = wl.field_d.field_Qb;
                                break L28;
                              }
                            }
                          }
                          L29: {
                            if (var2 != 4) {
                              wl.field_d = null;
                              break L29;
                            } else {
                              var3 = ((jc) (Object) var1_ref).c((byte) -66);
                              wl.field_d = new he(vb.field_h);
                              wl.field_d.a(0, (long)var3);
                              cc.a(false, wl.field_d, true, (jc) (Object) var1_ref);
                              d.field_Eb = 0L;
                              break L29;
                            }
                          }
                          L30: {
                            L31: {
                              if (var2 == 2) {
                                break L31;
                              } else {
                                if (var2 != 3) {
                                  la.field_h = null;
                                  break L30;
                                } else {
                                  break L31;
                                }
                              }
                            }
                            if (null == la.field_h) {
                              la.field_h = new he(vb.field_h);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          if (3 != var2) {
                            ld.field_c = false;
                            break L1;
                          } else {
                            ld.field_c = true;
                            var3 = 0;
                            L32: while (true) {
                              if (var3 >= kn.field_E.length) {
                                aa.field_e = ((jc) (Object) var1_ref).g(11132);
                                qc.field_c = ((jc) (Object) var1_ref).g(11132);
                                var3 = 0;
                                L33: while (true) {
                                  if (var3 >= pm.field_p.length) {
                                    break L2;
                                  } else {
                                    pm.field_p[var3] = ((jc) (Object) var1_ref).a((byte) -77);
                                    var3++;
                                    continue L33;
                                  }
                                }
                              } else {
                                kn.field_E[var3] = ((jc) (Object) var1_ref).a((byte) -88);
                                var3++;
                                continue L32;
                              }
                            }
                          }
                        } else {
                          L34: {
                            L35: {
                              if (var3_ref_lk.field_Xb) {
                                break L35;
                              } else {
                                if (!var3_ref_lk.field_Sb) {
                                  break L34;
                                } else {
                                  break L35;
                                }
                              }
                            }
                            L36: {
                              var3_ref_lk.field_Xb = false;
                              if (!var3_ref_lk.field_Sb) {
                                break L36;
                              } else {
                                ea.field_a = ea.field_a - 1;
                                var3_ref_lk.field_Sb = false;
                                break L36;
                              }
                            }
                            je.a(var3_ref_lk, (byte) 114);
                            break L34;
                          }
                          var3_ref_lk = (lk) (Object) ti.field_i.b(-1);
                          continue L27;
                        }
                      }
                    } else {
                      var3_ref_lk.a(false);
                      var3_ref_lk.c(54);
                      var3_ref_lk = (lk) (Object) qm.field_Mb.a(16213);
                      continue L26;
                    }
                  }
                }
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var1, "bj.C(" + param0 + 41);
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
