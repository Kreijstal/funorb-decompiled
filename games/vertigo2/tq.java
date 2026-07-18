/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    static String field_a;
    static String field_c;
    int field_b;
    static String field_d;

    final static void a(int param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        var15 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            var6 = param1;
            var7 = -param1;
            var8 = -1;
            var9 = pk.a((byte) -14, ib.field_a, param0 - -param1, ap.field_e);
            var10 = pk.a((byte) -14, ib.field_a, param0 + -param1, ap.field_e);
            ki.a(-110, var10, vl.field_e[param2], var9, param3);
            L1: while (true) {
              if (var6 <= var5_int) {
                break L0;
              } else {
                L2: {
                  var8 += 2;
                  var7 = var7 + var8;
                  if (var7 <= 0) {
                    break L2;
                  } else {
                    var6--;
                    var7 = var7 - (var6 << 1);
                    var11 = param2 - var6;
                    var12 = param2 + var6;
                    if (var12 < ua.field_e) {
                      break L2;
                    } else {
                      if (cj.field_D < var11) {
                        break L2;
                      } else {
                        L3: {
                          var13 = pk.a((byte) -14, ib.field_a, param0 - -var5_int, ap.field_e);
                          var14 = pk.a((byte) -14, ib.field_a, param0 - var5_int, ap.field_e);
                          if (var12 <= cj.field_D) {
                            ki.a(-123, var14, vl.field_e[var12], var13, param3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (ua.field_e <= var11) {
                          ki.a(-86, var14, vl.field_e[var11], var13, param3);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5_int++;
                var11 = -var5_int + param2;
                var12 = var5_int + param2;
                if (var12 < ua.field_e) {
                  continue L1;
                } else {
                  if (var11 <= cj.field_D) {
                    L4: {
                      var13 = pk.a((byte) -14, ib.field_a, var6 + param0, ap.field_e);
                      var14 = pk.a((byte) -14, ib.field_a, -var6 + param0, ap.field_e);
                      if (cj.field_D < var12) {
                        break L4;
                      } else {
                        ki.a(-88, var14, vl.field_e[var12], var13, param3);
                        break L4;
                      }
                    }
                    if (var11 >= ua.field_e) {
                      ki.a(-97, var14, vl.field_e[var11], var13, param3);
                      continue L1;
                    } else {
                      continue L1;
                    }
                  } else {
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "tq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + false + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        mi var1_ref = null;
        int var2 = 0;
        bs var3_ref_bs = null;
        long var3_long = 0L;
        int var3 = 0;
        uh var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        bs var5_ref = null;
        String var6 = null;
        bs var6_ref = null;
        uh var6_ref2 = null;
        String var7 = null;
        bs var7_ref = null;
        bs var8_ref_bs = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        uh var13 = null;
        bs var14 = null;
        uh var15 = null;
        Object var16 = null;
        Object var17 = null;
        Object var18 = null;
        uh var18_ref = null;
        Object var19 = null;
        uh var20 = null;
        uh var21 = null;
        bs var22 = null;
        int stackIn_47_0 = 0;
        bs stackIn_52_0 = null;
        bs stackIn_53_0 = null;
        bs stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        bs stackIn_101_0 = null;
        bs stackIn_102_0 = null;
        bs stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        RuntimeException decompiledCaughtException = null;
        bs stackOut_100_0 = null;
        bs stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        bs stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        bs stackOut_51_0 = null;
        bs stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        bs stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        var18 = null;
        var16 = null;
        var19 = null;
        var17 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var1_ref = id.field_f;
            L1: {
              L2: {
                L3: {
                  var2 = ((ed) (Object) var1_ref).h(-11);
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
                          if (var2 != 4) {
                            if (5 != var2) {
                              if (var2 != 6) {
                                if (var2 == 7) {
                                  var22 = (bs) (Object) mk.field_J.a((byte) 100);
                                  L4: while (true) {
                                    if (var22 == null) {
                                      kk.field_j = 0;
                                      break L2;
                                    } else {
                                      var22.c(2);
                                      var22.a(-125);
                                      var22 = (bs) (Object) mk.field_J.b(88);
                                      continue L4;
                                    }
                                  }
                                } else {
                                  if (var2 == 8) {
                                    L5: {
                                      var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                      var4 = (uh) (Object) lh.field_b.a(3661, (long)var3);
                                      if (var4 != null) {
                                        break L5;
                                      } else {
                                        var4 = new uh(ol.field_A);
                                        lh.field_b.a((gp) (Object) var4, (long)var3, 45);
                                        break L5;
                                      }
                                    }
                                    ph.a(var4, true, (ed) (Object) var1_ref, true);
                                    ce.a(true, var4);
                                    break L1;
                                  } else {
                                    if (9 == var2) {
                                      var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                      var4_int = ((ed) (Object) var1_ref).h(-11);
                                      var21 = (uh) (Object) lh.field_b.a(3661, (long)var3);
                                      if (var21 != null) {
                                        L6: {
                                          if (var4_int != 0) {
                                            var21.field_Lb = var4_int;
                                            var21.field_ic = lp.field_D;
                                            break L6;
                                          } else {
                                            var21.c(2);
                                            break L6;
                                          }
                                        }
                                        var21.a(-108);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if (var2 == 10) {
                                        var20 = (uh) (Object) nr.field_p.a((byte) 100);
                                        L7: while (true) {
                                          if (var20 == null) {
                                            break L2;
                                          } else {
                                            var20.c(2);
                                            var20.a(-103);
                                            var20 = (uh) (Object) nr.field_p.b(49);
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        L8: {
                                          if (var2 == 11) {
                                            break L8;
                                          } else {
                                            if (var2 != 12) {
                                              if (var2 != 13) {
                                                L9: {
                                                  if (var2 == 14) {
                                                    break L9;
                                                  } else {
                                                    if (var2 == 16) {
                                                      break L9;
                                                    } else {
                                                      L10: {
                                                        if (var2 == 15) {
                                                          break L10;
                                                        } else {
                                                          if (var2 != 17) {
                                                            if (var2 != 18) {
                                                              if (var2 == 19) {
                                                                var3_long = ((ed) (Object) var1_ref).i(-31016);
                                                                var5_int = ((ed) (Object) var1_ref).h(-11);
                                                                var14 = eq.a(var3_long, (byte) 127);
                                                                var6_ref = var14;
                                                                if (var14 != null) {
                                                                  L11: {
                                                                    if (var5_int == 0) {
                                                                      var6_ref.c(2);
                                                                      break L11;
                                                                    } else {
                                                                      var14.field_Ub = lp.field_D;
                                                                      var14.field_Hb = var5_int;
                                                                      break L11;
                                                                    }
                                                                  }
                                                                  var6_ref.a(-124);
                                                                  gd.field_j.field_Qb = gd.field_j.field_Qb - 1;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              } else {
                                                                if (var2 == 20) {
                                                                  ph.a(gd.field_j, true, (ed) (Object) var1_ref, false);
                                                                  break L1;
                                                                } else {
                                                                  if (var2 != 21) {
                                                                    if (var2 == 22) {
                                                                      rp.field_a = ((ed) (Object) var1_ref).a((byte) -11);
                                                                      qn.field_w = ((ed) (Object) var1_ref).a(false);
                                                                      break L1;
                                                                    } else {
                                                                      if (var2 == 23) {
                                                                        ao.field_N = ((ed) (Object) var1_ref).i(-31016);
                                                                        break L1;
                                                                      } else {
                                                                        ke.a((Throwable) null, "L1: " + or.a(115), 0);
                                                                        rm.b((byte) -115);
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                                                    if (var3 == 0) {
                                                                      r.field_h = 0L;
                                                                      break L1;
                                                                    } else {
                                                                      r.field_h = (long)var3 + gk.a(102);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              L12: {
                                                                var3_long = ((ed) (Object) var1_ref).i(-31016);
                                                                var5 = ((ed) (Object) var1_ref).f(128);
                                                                var6 = ((ed) (Object) var1_ref).f(128);
                                                                var7_ref = eq.a(var3_long, (byte) 89);
                                                                if (var7_ref != null) {
                                                                  break L12;
                                                                } else {
                                                                  var7_ref = new bs(var5, var6, var3_long);
                                                                  ck.field_I.a((gp) (Object) var7_ref, var3_long, -67);
                                                                  gd.field_j.field_Qb = gd.field_j.field_Qb + 1;
                                                                  break L12;
                                                                }
                                                              }
                                                              L13: {
                                                                var7_ref.field_Rb = ((ed) (Object) var1_ref).a((byte) -11);
                                                                var8 = ((ed) (Object) var1_ref).a(false);
                                                                stackOut_100_0 = (bs) var7_ref;
                                                                stackIn_102_0 = stackOut_100_0;
                                                                stackIn_101_0 = stackOut_100_0;
                                                                if ((var8 & 1) == 0) {
                                                                  stackOut_102_0 = (bs) (Object) stackIn_102_0;
                                                                  stackOut_102_1 = 0;
                                                                  stackIn_103_0 = stackOut_102_0;
                                                                  stackIn_103_1 = stackOut_102_1;
                                                                  break L13;
                                                                } else {
                                                                  stackOut_101_0 = (bs) (Object) stackIn_101_0;
                                                                  stackOut_101_1 = 1;
                                                                  stackIn_103_0 = stackOut_101_0;
                                                                  stackIn_103_1 = stackOut_101_1;
                                                                  break L13;
                                                                }
                                                              }
                                                              stackIn_103_0.field_Zb = stackIn_103_1 != 0;
                                                              var7_ref.field_Mb = var8 >> 1;
                                                              var7_ref.field_Ib = ((ed) (Object) var1_ref).h(-11);
                                                              var7_ref.field_Kb = ((ed) (Object) var1_ref).h(-11);
                                                              kq.field_Rb.a((li) (Object) var7_ref, false);
                                                              break L1;
                                                            }
                                                          } else {
                                                            break L10;
                                                          }
                                                        }
                                                      }
                                                      L14: {
                                                        var3_long = ((ed) (Object) var1_ref).i(-31016);
                                                        var5_int = ((ed) (Object) var1_ref).h(-11);
                                                        var6_ref = jg.a(var3_long, -126);
                                                        if (var6_ref == null) {
                                                          break L14;
                                                        } else {
                                                          L15: {
                                                            if (var5_int == 0) {
                                                              break L15;
                                                            } else {
                                                              var6_ref.field_Ub = lp.field_D;
                                                              var6_ref.field_Hb = var5_int;
                                                              break L15;
                                                            }
                                                          }
                                                          L16: {
                                                            if (15 == var2) {
                                                              var6_ref.field_Yb = false;
                                                              break L16;
                                                            } else {
                                                              if (!var6_ref.field_Ob) {
                                                                break L16;
                                                              } else {
                                                                var6_ref.field_Ob = false;
                                                                kk.field_j = kk.field_j - 1;
                                                                break L16;
                                                              }
                                                            }
                                                          }
                                                          ia.a((byte) 77, var6_ref);
                                                          break L14;
                                                        }
                                                      }
                                                      break L1;
                                                    }
                                                  }
                                                }
                                                L17: {
                                                  var3_long = ((ed) (Object) var1_ref).i(-31016);
                                                  var5_ref = jg.a(var3_long, -8);
                                                  if (var5_ref == null) {
                                                    break L17;
                                                  } else {
                                                    L18: {
                                                      if (var2 != 14) {
                                                        if (!var5_ref.field_Ob) {
                                                          var5_ref.field_Ob = true;
                                                          kk.field_j = kk.field_j + 1;
                                                          break L18;
                                                        } else {
                                                          break L18;
                                                        }
                                                      } else {
                                                        var5_ref.field_Yb = true;
                                                        break L18;
                                                      }
                                                    }
                                                    ia.a((byte) 77, var5_ref);
                                                    break L17;
                                                  }
                                                }
                                                break L1;
                                              } else {
                                                var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                                var4_int = ((ed) (Object) var1_ref).h(-11);
                                                var15 = (uh) (Object) lh.field_b.a(3661, (long)var3);
                                                if (var15 != null) {
                                                  L19: {
                                                    var15.field_qc = false;
                                                    var13 = var15;
                                                    var6_ref2 = var13;
                                                    var13.field_Sb = false;
                                                    if (0 == var4_int) {
                                                      break L19;
                                                    } else {
                                                      var15.field_ic = lp.field_D;
                                                      var15.field_Lb = var4_int;
                                                      break L19;
                                                    }
                                                  }
                                                  ce.a(true, var15);
                                                  break L1;
                                                } else {
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          }
                                        }
                                        L20: {
                                          var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                          var18_ref = (uh) (Object) lh.field_b.a(3661, (long)var3);
                                          var18_ref = var18_ref;
                                          if (var18_ref == null) {
                                            break L20;
                                          } else {
                                            L21: {
                                              if (var2 != 11) {
                                                var18_ref.field_qc = true;
                                                break L21;
                                              } else {
                                                var18_ref.field_Sb = true;
                                                break L21;
                                              }
                                            }
                                            ce.a(true, var18_ref);
                                            break L20;
                                          }
                                        }
                                        break L1;
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3_long = ((ed) (Object) var1_ref).i(-31016);
                                var5_int = ((ed) (Object) var1_ref).h(-11);
                                var6_ref = jg.a(var3_long, 86);
                                if (var6_ref != null) {
                                  L22: {
                                    if (!var6_ref.field_Ob) {
                                      break L22;
                                    } else {
                                      var6_ref.field_Ob = false;
                                      kk.field_j = kk.field_j - 1;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (var5_int != 0) {
                                      var6_ref.field_Hb = var5_int;
                                      var6_ref.field_Ub = lp.field_D;
                                      break L23;
                                    } else {
                                      var6_ref.c(2);
                                      break L23;
                                    }
                                  }
                                  var6_ref.a(-124);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              L24: {
                                var3_long = ((ed) (Object) var1_ref).i(-31016);
                                var5 = ((ed) (Object) var1_ref).f(128);
                                var6 = ((ed) (Object) var1_ref).f(128);
                                var7 = ((ed) (Object) var1_ref).f(128);
                                var8_ref_bs = jg.a(var3_long, -126);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_46_0 = 0;
                                  stackIn_47_0 = stackOut_46_0;
                                  break L24;
                                } else {
                                  stackOut_45_0 = 1;
                                  stackIn_47_0 = stackOut_45_0;
                                  break L24;
                                }
                              }
                              L25: {
                                var9 = stackIn_47_0;
                                if (var8_ref_bs != null) {
                                  if (var9 == 0) {
                                    break L25;
                                  } else {
                                    var8_ref_bs.a(1, var7, var5);
                                    break L25;
                                  }
                                } else {
                                  var8_ref_bs = new bs(var5, var7, var3_long);
                                  kd.field_l.a((gp) (Object) var8_ref_bs, var3_long, 61);
                                  break L25;
                                }
                              }
                              L26: {
                                var8_ref_bs.field_Jb = gk.a(53) + -(long)((ed) (Object) var1_ref).b(true);
                                var8_ref_bs.field_Rb = ((ed) (Object) var1_ref).a((byte) -11);
                                var10 = ((ed) (Object) var1_ref).a(false);
                                var8_ref_bs.field_Mb = var10 >> 1;
                                stackOut_51_0 = (bs) var8_ref_bs;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_52_0 = stackOut_51_0;
                                if ((var10 & 1) == 0) {
                                  stackOut_53_0 = (bs) (Object) stackIn_53_0;
                                  stackOut_53_1 = 0;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  break L26;
                                } else {
                                  stackOut_52_0 = (bs) (Object) stackIn_52_0;
                                  stackOut_52_1 = 1;
                                  stackIn_54_0 = stackOut_52_0;
                                  stackIn_54_1 = stackOut_52_1;
                                  break L26;
                                }
                              }
                              stackIn_54_0.field_Zb = stackIn_54_1 != 0;
                              var8_ref_bs.field_Ib = ((ed) (Object) var1_ref).h(-11);
                              var8_ref_bs.field_Kb = ((ed) (Object) var1_ref).h(-11);
                              ia.a((byte) 77, var8_ref_bs);
                              break L1;
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_bs = (bs) (Object) kq.field_Rb.a((byte) 100);
                L27: while (true) {
                  if (var3_ref_bs == null) {
                    var3_ref_bs = (bs) (Object) kd.field_l.b(-128);
                    L28: while (true) {
                      if (var3_ref_bs == null) {
                        L29: {
                          if (var2 != 1) {
                            break L29;
                          } else {
                            if (gd.field_j != null) {
                              nr.field_q = gd.field_j.field_Nb;
                              break L29;
                            } else {
                              break L29;
                            }
                          }
                        }
                        L30: {
                          if (4 == var2) {
                            var3 = ((ed) (Object) var1_ref).a((byte) -11);
                            gd.field_j = new uh(ol.field_A);
                            gd.field_j.a(-1, (long)var3);
                            ph.a(gd.field_j, true, (ed) (Object) var1_ref, false);
                            r.field_h = 0L;
                            break L30;
                          } else {
                            gd.field_j = null;
                            break L30;
                          }
                        }
                        L31: {
                          L32: {
                            if (var2 == 2) {
                              break L32;
                            } else {
                              if (var2 != 3) {
                                sj.field_d = null;
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          if (sj.field_d != null) {
                            break L31;
                          } else {
                            sj.field_d = new uh(ol.field_A);
                            break L31;
                          }
                        }
                        if (var2 == 3) {
                          qn.field_q = true;
                          var3 = 0;
                          L33: while (true) {
                            if (~qc.field_w.length >= ~var3) {
                              ua.field_a = ((ed) (Object) var1_ref).h(-11);
                              kg.field_y = ((ed) (Object) var1_ref).h(-11);
                              var3 = 0;
                              L34: while (true) {
                                if (var3 >= dj.field_a.length) {
                                  break L2;
                                } else {
                                  dj.field_a[var3] = ((ed) (Object) var1_ref).g(90);
                                  var3++;
                                  continue L34;
                                }
                              }
                            } else {
                              qc.field_w[var3] = ((ed) (Object) var1_ref).g(114);
                              var3++;
                              continue L33;
                            }
                          }
                        } else {
                          qn.field_q = false;
                          break L1;
                        }
                      } else {
                        L35: {
                          L36: {
                            if (var3_ref_bs.field_Yb) {
                              break L36;
                            } else {
                              if (!var3_ref_bs.field_Ob) {
                                break L35;
                              } else {
                                break L36;
                              }
                            }
                          }
                          L37: {
                            if (var3_ref_bs.field_Ob) {
                              kk.field_j = kk.field_j - 1;
                              var3_ref_bs.field_Ob = false;
                              break L37;
                            } else {
                              break L37;
                            }
                          }
                          var3_ref_bs.field_Yb = false;
                          ia.a((byte) 77, var3_ref_bs);
                          break L35;
                        }
                        var3_ref_bs = (bs) (Object) kd.field_l.a((byte) -60);
                        continue L28;
                      }
                    }
                  } else {
                    var3_ref_bs.c(2);
                    var3_ref_bs.a(-117);
                    var3_ref_bs = (bs) (Object) kq.field_Rb.b(115);
                    continue L27;
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
          throw wn.a((Throwable) (Object) var1, "tq.D(" + -66 + ')');
        }
    }

    final static void b() {
        eb.field_c = uo.a(107);
        ch.field_e = new sd();
        ak.a(true, true, 3);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, byte param3, int param4) {
        java.awt.Graphics var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        Exception var6 = null;
        java.awt.Graphics var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var5 = ne.field_F.getGraphics();
                  if (null != fh.field_t) {
                    break L2;
                  } else {
                    fh.field_t = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    var5.setColor(java.awt.Color.black);
                    var5.fillRect(0, 0, op.field_c, gh.field_a);
                    break L3;
                  }
                }
                L4: {
                  if (param0 != null) {
                    break L4;
                  } else {
                    param0 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null != ug.field_c) {
                        break L6;
                      } else {
                        ug.field_c = ne.field_F.createImage(304, 34);
                        break L6;
                      }
                    }
                    var6_ref = ug.field_c.getGraphics();
                    var6_ref.setColor(param0);
                    var6_ref.drawRect(0, 0, 303, 33);
                    var6_ref.fillRect(2, 2, param4 * 3, 30);
                    var6_ref.setColor(java.awt.Color.black);
                    var6_ref.drawRect(1, 1, 301, 31);
                    var6_ref.fillRect(2 - -(3 * param4), 2, -(param4 * 3) + 300, 30);
                    var6_ref.setFont(fh.field_t);
                    var6_ref.setColor(java.awt.Color.white);
                    var6_ref.drawString(param2, (304 + -(param2.length() * 6)) / 2, 22);
                    boolean discarded$1 = var5.drawImage(ug.field_c, -152 + op.field_c / 2, -18 + gh.field_a / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + op.field_c / 2;
                    var8 = -18 + gh.field_a / 2;
                    var5.setColor(param0);
                    var5.drawRect(var7, var8, 303, 33);
                    var5.fillRect(var7 - -2, var8 + 2, param4 * 3, 30);
                    var5.setColor(java.awt.Color.black);
                    var5.drawRect(1 + var7, var8 + 1, 301, 31);
                    var5.fillRect(2 + var7 + param4 * 3, 2 + var8, 300 - param4 * 3, 30);
                    var5.setFont(fh.field_t);
                    var5.setColor(java.awt.Color.white);
                    var5.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, 22 + var8);
                    break L7;
                  }
                }
                L8: {
                  if (op.field_a != null) {
                    var5.setFont(fh.field_t);
                    var5.setColor(java.awt.Color.white);
                    var5.drawString(op.field_a, op.field_c / 2 + -(6 * op.field_a.length() / 2), -26 + gh.field_a / 2);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5_ref = (Exception) (Object) decompiledCaughtException;
                ne.field_F.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5_ref2;
            stackOut_17_1 = new StringBuilder().append("tq.E(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L10;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L10;
            }
          }
          L11: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L11;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L11;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + -128 + ',' + param4 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    tq(int param0) {
        ((tq) this).field_b = param0;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (kq.a((byte) 123, var3) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("tq.C(").append(false).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Move left:<br>Move right:<br>Move back:<br>Move forward:<br>Jump:<br>Rotate camera left:<br>Rotate camera right:<br>Raise camera up:";
        field_a = "<%0> is not on your friend list.";
        field_d = "Data server full or too many connections from your address. Please try again in a few minutes.";
    }
}
