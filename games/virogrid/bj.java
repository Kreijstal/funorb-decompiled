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
        int var3 = param1 >> -2139635681 & param0 + -1;
        if (param2 != 1) {
            return 82;
        }
        return var3 + ((param1 >>> -2126198881) + param1) % param0;
    }

    final static void a(int param0, int param1, int param2) {
        ad.field_i = param2;
        hn.field_q = param0;
        if (param1 != 23) {
            field_k = (byte[][]) null;
        }
    }

    public static void a(byte param0) {
        field_o = null;
        field_g = null;
        field_k = (byte[][]) null;
        field_h = null;
        field_m = null;
        if (param0 >= -59) {
            bj.a(-31);
        }
    }

    bj(long param0, int param1, byte[] param2) {
        try {
            this.field_i = param1;
            this.field_l = param2;
            this.field_p = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "bj.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        lk stackIn_52_0 = null;
        lk stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_100_0 = 0;
        lk stackIn_107_0 = null;
        lk stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hg var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        lk var3_ref_lk = null;
        int var4 = 0;
        he var4_ref_he = null;
        int var5 = 0;
        String var6 = null;
        he var6_ref = null;
        lk var7 = null;
        lk var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        he var13 = null;
        lk var15 = null;
        Object var16 = null;
        Object var17 = null;
        he var17_ref = null;
        lk var18 = null;
        String var19 = null;
        String var20 = null;
        lk var21 = null;
        lk var22 = null;
        Object var23 = null;
        he var23_ref = null;
        he var24 = null;
        Object var25 = null;
        lk var26 = null;
        String var27 = null;
        String var28 = null;
        lk var29 = null;
        he var30 = null;
        he var31 = null;
        var23 = null;
        var17 = null;
        var16 = null;
        var25 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var1 = sh.field_qb;
            var2 = ((jc) ((Object) var1)).g(11132);
            if (param0 < -3) {
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
                            if (5 == var2) {
                              L3: {
                                var3_long = ((jc) ((Object) var1)).e((byte) -60);
                                var27 = ((jc) ((Object) var1)).h(-127);
                                var6 = ((jc) ((Object) var1)).h(-124);
                                var28 = ((jc) ((Object) var1)).h(-119);
                                var29 = db.a(var3_long, false);
                                var8 = var29;
                                if (var6.equals("")) {
                                  stackIn_100_0 = 0;
                                  break L3;
                                } else {
                                  stackIn_100_0 = 1;
                                  break L3;
                                }
                              }
                              L4: {
                                var9 = stackIn_100_0;
                                if (var29 != null) {
                                  if (var9 != 0) {
                                    var29.a(var28, var27, 0);
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                } else {
                                  var8 = new lk(var27, var28, var3_long);
                                  ti.field_i.a(var3_long, var8, 30804);
                                  break L4;
                                }
                              }
                              L5: {
                                var8.field_Ib = hc.a(-9986) + -(long)((jc) ((Object) var1)).d((byte) 123);
                                var8.field_Vb = ((jc) ((Object) var1)).c((byte) 33);
                                var10 = ((jc) ((Object) var1)).c(0);
                                var8.field_Rb = var10 >> 352882849;
                                stackIn_107_0 = (lk) (var8);

                                if (0 == (1 & var10)) {
                                  stackIn_108_0 = (lk) ((Object) stackIn_107_0);
                                  stackIn_108_1 = 0;
                                  break L5;
                                } else {
                                  stackIn_108_0 = (lk) ((Object) stackIn_107_0);
                                  stackIn_108_1 = 1;
                                  break L5;
                                }
                              }
                              stackIn_108_0.field_Jb = stackIn_108_1 != 0;
                              var8.field_Ub = ((jc) ((Object) var1)).g(11132);
                              var8.field_Fb = ((jc) ((Object) var1)).g(11132);
                              je.a(var8, (byte) 95);
                              break L1;
                            } else {
                              if (6 == var2) {
                                var3_long = ((jc) ((Object) var1)).e((byte) -60);
                                var5 = ((jc) ((Object) var1)).g(11132);
                                var26 = db.a(var3_long, false);
                                if (var26 != null) {
                                  L6: {
                                    if (!var26.field_Sb) {
                                      break L6;
                                    } else {
                                      ea.field_a = ea.field_a - 1;
                                      var26.field_Sb = false;
                                      break L6;
                                    }
                                  }
                                  L7: {
                                    if (var5 != 0) {
                                      var26.field_Wb = var5;
                                      var26.field_Gb = fn.field_c;
                                      break L7;
                                    } else {
                                      var26.a(false);
                                      break L7;
                                    }
                                  }
                                  var26.c(44);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              } else {
                                if (-8 != (var2 ^ -1)) {
                                  if (8 != var2) {
                                    if ((var2 ^ -1) == -10) {
                                      var3 = ((jc) ((Object) var1)).c((byte) 38);
                                      var4 = ((jc) ((Object) var1)).g(11132);
                                      var31 = (he) ((Object) ma.field_c.a((long)var3, (byte) 100));
                                      if (var31 != null) {
                                        L8: {
                                          if (0 == var4) {
                                            var31.a(false);
                                            break L8;
                                          } else {
                                            var31.field_Eb = var4;
                                            var31.field_Mb = fn.field_c;
                                            break L8;
                                          }
                                        }
                                        var31.c(25);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if (10 == var2) {
                                        var30 = (he) ((Object) te.field_f.a((byte) -110));
                                        L9: while (true) {
                                          if (var30 == null) {
                                            break L1;
                                          } else {
                                            var30.a(false);
                                            var30.c(11);
                                            var30 = (he) ((Object) te.field_f.a(16213));
                                            continue L9;
                                          }
                                        }
                                      } else {
                                        L10: {
                                          if ((var2 ^ -1) == -12) {
                                            break L10;
                                          } else {
                                            if ((var2 ^ -1) == -13) {
                                              break L10;
                                            } else {
                                              if ((var2 ^ -1) == -14) {
                                                var3 = ((jc) ((Object) var1)).c((byte) 66);
                                                var4 = ((jc) ((Object) var1)).g(11132);
                                                var23_ref = (he) ((Object) ma.field_c.a((long)var3, (byte) -5));
                                                if (var23_ref != null) {
                                                  L11: {
                                                    var13 = var23_ref;
                                                    var6_ref = var13;
                                                    var23_ref.field_sc = false;
                                                    var13.field_dc = false;
                                                    if (0 == var4) {
                                                      break L11;
                                                    } else {
                                                      var23_ref.field_Eb = var4;
                                                      var23_ref.field_Mb = fn.field_c;
                                                      break L11;
                                                    }
                                                  }
                                                  pg.a(false, var23_ref);
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              } else {
                                                L12: {
                                                  if (-15 == (var2 ^ -1)) {
                                                    break L12;
                                                  } else {
                                                    if ((var2 ^ -1) == -17) {
                                                      break L12;
                                                    } else {
                                                      L13: {
                                                        if (var2 == 15) {
                                                          break L13;
                                                        } else {
                                                          if (-18 == (var2 ^ -1)) {
                                                            break L13;
                                                          } else {
                                                            if ((var2 ^ -1) == -19) {
                                                              L14: {
                                                                var3_long = ((jc) ((Object) var1)).e((byte) -60);
                                                                var19 = ((jc) ((Object) var1)).h(-118);
                                                                var20 = ((jc) ((Object) var1)).h(-118);
                                                                var7 = ic.a(var3_long, (byte) -127);
                                                                if (var7 == null) {
                                                                  var7 = new lk(var19, var20, var3_long);
                                                                  ah.field_h.a(var3_long, var7, 30804);
                                                                  wl.field_d.field_ic = wl.field_d.field_ic + 1;
                                                                  break L14;
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                              L15: {
                                                                var7.field_Vb = ((jc) ((Object) var1)).c((byte) 75);
                                                                var8_int = ((jc) ((Object) var1)).c(0);
                                                                stackIn_52_0 = (lk) (var7);

                                                                if (0 == (1 & var8_int)) {
                                                                  stackIn_53_0 = (lk) ((Object) stackIn_52_0);
                                                                  stackIn_53_1 = 0;
                                                                  break L15;
                                                                } else {
                                                                  stackIn_53_0 = (lk) ((Object) stackIn_52_0);
                                                                  stackIn_53_1 = 1;
                                                                  break L15;
                                                                }
                                                              }
                                                              stackIn_53_0.field_Jb = stackIn_53_1 != 0;
                                                              var7.field_Rb = var8_int >> 1848459425;
                                                              var7.field_Ub = ((jc) ((Object) var1)).g(11132);
                                                              var7.field_Fb = ((jc) ((Object) var1)).g(11132);
                                                              qm.field_Mb.a(var7, (byte) -101);
                                                              break L1;
                                                            } else {
                                                              if ((var2 ^ -1) == -20) {
                                                                var3_long = ((jc) ((Object) var1)).e((byte) -60);
                                                                var5 = ((jc) ((Object) var1)).g(11132);
                                                                var18 = ic.a(var3_long, (byte) -127);
                                                                if (var18 != null) {
                                                                  L16: {
                                                                    if (-1 != (var5 ^ -1)) {
                                                                      var18.field_Gb = fn.field_c;
                                                                      var18.field_Wb = var5;
                                                                      break L16;
                                                                    } else {
                                                                      var18.a(false);
                                                                      break L16;
                                                                    }
                                                                  }
                                                                  var18.c(32);
                                                                  wl.field_d.field_ic = wl.field_d.field_ic - 1;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              } else {
                                                                if (-21 == (var2 ^ -1)) {
                                                                  cc.a(false, wl.field_d, true, var1);
                                                                  break L1;
                                                                } else {
                                                                  if (21 != var2) {
                                                                    if (-23 == (var2 ^ -1)) {
                                                                      sb.field_i = ((jc) ((Object) var1)).c((byte) 69);
                                                                      nh.field_c = ((jc) ((Object) var1)).c(0);
                                                                      break L1;
                                                                    } else {
                                                                      if (var2 == 23) {
                                                                        hh.field_d = ((jc) ((Object) var1)).e((byte) -60);
                                                                        break L1;
                                                                      } else {
                                                                        en.a("L1: " + rg.a(true), (Throwable) null, 1);
                                                                        tn.a(false);
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3 = ((jc) ((Object) var1)).c((byte) -90);
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
                                                      var3_long = ((jc) ((Object) var1)).e((byte) -60);
                                                      var5 = ((jc) ((Object) var1)).g(11132);
                                                      var21 = db.a(var3_long, false);
                                                      if (var21 == null) {
                                                        break L1;
                                                      } else {
                                                        L17: {
                                                          if (-16 == (var2 ^ -1)) {
                                                            var21.field_Xb = false;
                                                            break L17;
                                                          } else {
                                                            if (!var21.field_Sb) {
                                                              break L17;
                                                            } else {
                                                              ea.field_a = ea.field_a - 1;
                                                              var21.field_Sb = false;
                                                              break L17;
                                                            }
                                                          }
                                                        }
                                                        L18: {
                                                          if (0 == var5) {
                                                            break L18;
                                                          } else {
                                                            var21.field_Gb = fn.field_c;
                                                            var21.field_Wb = var5;
                                                            break L18;
                                                          }
                                                        }
                                                        je.a(var21, (byte) 99);
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                }
                                                var3_long = ((jc) ((Object) var1)).e((byte) -60);
                                                var22 = db.a(var3_long, false);
                                                if (var22 == null) {
                                                  break L1;
                                                } else {
                                                  L19: {
                                                    if (var2 == 14) {
                                                      var22.field_Xb = true;
                                                      break L19;
                                                    } else {
                                                      if (!var22.field_Sb) {
                                                        var22.field_Sb = true;
                                                        ea.field_a = ea.field_a + 1;
                                                        break L19;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  je.a(var22, (byte) 112);
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var3 = ((jc) ((Object) var1)).c((byte) 71);
                                        var17_ref = (he) ((Object) ma.field_c.a((long)var3, (byte) -46));
                                        var24 = var17_ref;
                                        if (var24 != null) {
                                          L20: {
                                            if (11 != var2) {
                                              var24.field_sc = true;
                                              break L20;
                                            } else {
                                              var24.field_dc = true;
                                              break L20;
                                            }
                                          }
                                          pg.a(false, var24);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    L21: {
                                      var3 = ((jc) ((Object) var1)).c((byte) 100);
                                      var4_ref_he = (he) ((Object) ma.field_c.a((long)var3, (byte) -103));
                                      if (var4_ref_he != null) {
                                        break L21;
                                      } else {
                                        var4_ref_he = new he(vb.field_h);
                                        ma.field_c.a((long)var3, var4_ref_he, 30804);
                                        break L21;
                                      }
                                    }
                                    cc.a(true, var4_ref_he, true, var1);
                                    pg.a(false, var4_ref_he);
                                    break L1;
                                  }
                                } else {
                                  var15 = (lk) ((Object) ci.field_o.a((byte) -77));
                                  L22: while (true) {
                                    if (var15 == null) {
                                      ea.field_a = 0;
                                      break L1;
                                    } else {
                                      var15.a(false);
                                      var15.c(53);
                                      var15 = (lk) ((Object) ci.field_o.a(16213));
                                      continue L22;
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
                var3_ref_lk = (lk) ((Object) qm.field_Mb.a((byte) -62));
                L23: while (true) {
                  if (var3_ref_lk == null) {
                    var3_ref_lk = (lk) ((Object) ti.field_i.a(true));
                    L24: while (true) {
                      if (var3_ref_lk == null) {
                        L25: {
                          if ((var2 ^ -1) != -2) {
                            break L25;
                          } else {
                            if (wl.field_d == null) {
                              break L25;
                            } else {
                              cf.field_b = wl.field_d.field_Qb;
                              break L25;
                            }
                          }
                        }
                        L26: {
                          if (var2 != 4) {
                            wl.field_d = null;
                            break L26;
                          } else {
                            var3 = ((jc) ((Object) var1)).c((byte) -66);
                            wl.field_d = new he(vb.field_h);
                            wl.field_d.a(0, (long)var3);
                            cc.a(false, wl.field_d, true, var1);
                            d.field_Eb = 0L;
                            break L26;
                          }
                        }
                        L27: {
                          L28: {
                            if (-3 == (var2 ^ -1)) {
                              break L28;
                            } else {
                              if ((var2 ^ -1) != -4) {
                                la.field_h = null;
                                break L27;
                              } else {
                                break L28;
                              }
                            }
                          }
                          if (null == la.field_h) {
                            la.field_h = new he(vb.field_h);
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        if (3 != var2) {
                          ld.field_c = false;
                          break L1;
                        } else {
                          ld.field_c = true;
                          var3 = 0;
                          L29: while (true) {
                            if (var3 >= kn.field_E.length) {
                              aa.field_e = ((jc) ((Object) var1)).g(11132);
                              qc.field_c = ((jc) ((Object) var1)).g(11132);
                              var3 = 0;
                              L30: while (true) {
                                if (var3 >= pm.field_p.length) {
                                  break L1;
                                } else {
                                  pm.field_p[var3] = ((jc) ((Object) var1)).a((byte) -77);
                                  var3++;
                                  continue L30;
                                }
                              }
                            } else {
                              kn.field_E[var3] = ((jc) ((Object) var1)).a((byte) -88);
                              var3++;
                              continue L29;
                            }
                          }
                        }
                      } else {
                        L31: {
                          L32: {
                            if (var3_ref_lk.field_Xb) {
                              break L32;
                            } else {
                              if (!var3_ref_lk.field_Sb) {
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          L33: {
                            var3_ref_lk.field_Xb = false;
                            if (!var3_ref_lk.field_Sb) {
                              break L33;
                            } else {
                              ea.field_a = ea.field_a - 1;
                              var3_ref_lk.field_Sb = false;
                              break L33;
                            }
                          }
                          je.a(var3_ref_lk, (byte) 114);
                          break L31;
                        }
                        var3_ref_lk = (lk) ((Object) ti.field_i.b(-1));
                        continue L24;
                      }
                    }
                  } else {
                    var3_ref_lk.a(false);
                    var3_ref_lk.c(54);
                    var3_ref_lk = (lk) ((Object) qm.field_Mb.a(16213));
                    continue L23;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1_ref), "bj.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_o = new p();
        field_k = new byte[50][];
        field_h = new ra();
        field_g = "Create a free Account";
    }
}
