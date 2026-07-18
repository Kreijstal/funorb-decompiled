/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tq {
    static String field_a;
    static String field_c;
    int field_b;
    static String field_d;

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
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
            L1: {
              var5_int = 0;
              var6 = param1;
              if (!param4) {
                break L1;
              } else {
                tq.a(true, (java.applet.Applet) null);
                break L1;
              }
            }
            var7 = -param1;
            var8 = -1;
            var9 = pk.a((byte) -14, ib.field_a, param0 - -param1, ap.field_e);
            var10 = pk.a((byte) -14, ib.field_a, param0 + -param1, ap.field_e);
            ki.a(-110, var10, vl.field_e[param2], var9, param3);
            L2: while (true) {
              L3: {
                L4: {
                  if (~var6 >= ~var5_int) {
                    break L4;
                  } else {
                    var8 += 2;
                    var7 = var7 + var8;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (var7 <= 0) {
                          break L5;
                        } else {
                          var6--;
                          var7 = var7 - (var6 << -871283871);
                          var11 = param2 - var6;
                          var12 = param2 + var6;
                          if (var12 < ua.field_e) {
                            break L5;
                          } else {
                            if (cj.field_D < var11) {
                              break L5;
                            } else {
                              L6: {
                                var13 = pk.a((byte) -14, ib.field_a, param0 - -var5_int, ap.field_e);
                                var14 = pk.a((byte) -14, ib.field_a, param0 - var5_int, ap.field_e);
                                if (~var12 >= ~cj.field_D) {
                                  ki.a(-123, var14, vl.field_e[var12], var13, param3);
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              if (ua.field_e <= var11) {
                                ki.a(-86, var14, vl.field_e[var11], var13, param3);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                      L7: {
                        var5_int++;
                        var11 = -var5_int + param2;
                        var12 = var5_int + param2;
                        if (~var12 > ~ua.field_e) {
                          break L7;
                        } else {
                          if (var11 <= cj.field_D) {
                            L8: {
                              var13 = pk.a((byte) -14, ib.field_a, var6 + param0, ap.field_e);
                              var14 = pk.a((byte) -14, ib.field_a, -var6 + param0, ap.field_e);
                              if (~cj.field_D > ~var12) {
                                break L8;
                              } else {
                                ki.a(-88, var14, vl.field_e[var12], var13, param3);
                                break L8;
                              }
                            }
                            if (~var11 <= ~ua.field_e) {
                              ki.a(-97, var14, vl.field_e[var11], var13, param3);
                              break L7;
                            } else {
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var15 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "tq.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        mi var1 = null;
        int var2 = 0;
        bs var3 = null;
        int var3_int = 0;
        long var3_long = 0L;
        uh var3_ref = null;
        uh var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        uh var5_ref = null;
        bs var5_ref2 = null;
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
        boolean stackIn_19_0 = false;
        boolean stackIn_20_0 = false;
        int stackIn_31_0 = 0;
        int stackIn_68_0 = 0;
        bs stackIn_74_0 = null;
        bs stackIn_75_0 = null;
        bs stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        bs stackIn_142_0 = null;
        bs stackIn_143_0 = null;
        bs stackIn_144_0 = null;
        int stackIn_144_1 = 0;
        boolean stackOut_18_0 = false;
        boolean stackOut_19_0 = false;
        int stackOut_30_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        bs stackOut_73_0 = null;
        bs stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        bs stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        bs stackOut_141_0 = null;
        bs stackOut_143_0 = null;
        int stackOut_143_1 = 0;
        bs stackOut_142_0 = null;
        int stackOut_142_1 = 0;
        var11 = Vertigo2.field_L ? 1 : 0;
        var1 = id.field_f;
        if (param0 == -66) {
          L0: {
            L1: {
              L2: {
                var2 = ((ed) (Object) var1).h(-11);
                if (var2 == 0) {
                  break L2;
                } else {
                  if (var2 == 1) {
                    break L2;
                  } else {
                    if (var2 == 2) {
                      break L2;
                    } else {
                      if (var2 == 3) {
                        break L2;
                      } else {
                        if (var2 != 4) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var3 = (bs) (Object) kq.field_Rb.a((byte) 100);
              L3: while (true) {
                L4: {
                  L5: {
                    if (null == var3) {
                      break L5;
                    } else {
                      var3.c(2);
                      var3.a(-117);
                      var3 = (bs) (Object) kq.field_Rb.b(param0 + 181);
                      if (var11 != 0) {
                        break L4;
                      } else {
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var3 = (bs) (Object) kd.field_l.b(-128);
                  break L4;
                }
                L6: while (true) {
                  L7: {
                    L8: {
                      if (var3 == null) {
                        break L8;
                      } else {
                        stackOut_18_0 = var3.field_Yb;
                        stackIn_31_0 = stackOut_18_0 ? 1 : 0;
                        stackIn_19_0 = stackOut_18_0;
                        if (var11 != 0) {
                          break L7;
                        } else {
                          stackOut_19_0 = stackIn_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          L9: {
                            L10: {
                              if (stackIn_20_0) {
                                break L10;
                              } else {
                                if (!var3.field_Ob) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L11: {
                              if (var3.field_Ob) {
                                kk.field_j = kk.field_j - 1;
                                var3.field_Ob = false;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var3.field_Yb = false;
                            ia.a((byte) 77, var3);
                            break L9;
                          }
                          var3 = (bs) (Object) kd.field_l.a((byte) -60);
                          if (var11 == 0) {
                            continue L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                    stackOut_30_0 = var2;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  }
                  L12: {
                    if (stackIn_31_0 != 1) {
                      break L12;
                    } else {
                      if (gd.field_j != null) {
                        nr.field_q = gd.field_j.field_Nb;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (4 == var2) {
                        break L14;
                      } else {
                        gd.field_j = null;
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var3_int = ((ed) (Object) var1).a((byte) -11);
                    gd.field_j = new uh(ol.field_A);
                    gd.field_j.a(-1, (long)var3_int);
                    ph.a(gd.field_j, true, (ed) (Object) var1, false);
                    r.field_h = 0L;
                    break L13;
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (var2 == 2) {
                          break L17;
                        } else {
                          if (var2 != 3) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (sj.field_d != null) {
                        break L15;
                      } else {
                        sj.field_d = new uh(ol.field_A);
                        if (var11 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    sj.field_d = null;
                    break L15;
                  }
                  L18: {
                    if (var2 == 3) {
                      break L18;
                    } else {
                      qn.field_q = false;
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L18;
                      }
                    }
                  }
                  qn.field_q = true;
                  var3_int = 0;
                  L19: while (true) {
                    L20: {
                      L21: {
                        if (~qc.field_w.length >= ~var3_int) {
                          break L21;
                        } else {
                          qc.field_w[var3_int] = ((ed) (Object) var1).g(114);
                          var3_int++;
                          if (var11 != 0) {
                            break L20;
                          } else {
                            if (var11 == 0) {
                              continue L19;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      ua.field_a = ((ed) (Object) var1).h(-11);
                      kg.field_y = ((ed) (Object) var1).h(param0 ^ 75);
                      break L20;
                    }
                    var3_int = 0;
                    L22: while (true) {
                      L23: {
                        if (var3_int >= dj.field_a.length) {
                          break L23;
                        } else {
                          dj.field_a[var3_int] = ((ed) (Object) var1).g(90);
                          var3_int++;
                          if (var11 != 0) {
                            break L0;
                          } else {
                            if (var11 == 0) {
                              continue L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
            }
            L24: {
              if (5 != var2) {
                break L24;
              } else {
                L25: {
                  var3_long = ((ed) (Object) var1).i(param0 + -30950);
                  var5 = ((ed) (Object) var1).f(128);
                  var6 = ((ed) (Object) var1).f(128);
                  var7 = ((ed) (Object) var1).f(128);
                  var8_ref_bs = jg.a(var3_long, -126);
                  if (var6.equals((Object) (Object) "")) {
                    stackOut_67_0 = 0;
                    stackIn_68_0 = stackOut_67_0;
                    break L25;
                  } else {
                    stackOut_66_0 = 1;
                    stackIn_68_0 = stackOut_66_0;
                    break L25;
                  }
                }
                L26: {
                  L27: {
                    var9 = stackIn_68_0;
                    if (var8_ref_bs != null) {
                      break L27;
                    } else {
                      var8_ref_bs = new bs(var5, var7, var3_long);
                      kd.field_l.a((gp) (Object) var8_ref_bs, var3_long, 61);
                      if (var11 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  if (var9 == 0) {
                    break L26;
                  } else {
                    var8_ref_bs.a(1, var7, var5);
                    break L26;
                  }
                }
                L28: {
                  var8_ref_bs.field_Jb = gk.a(53) + -(long)((ed) (Object) var1).b(true);
                  var8_ref_bs.field_Rb = ((ed) (Object) var1).a((byte) -11);
                  var10 = ((ed) (Object) var1).a(false);
                  var8_ref_bs.field_Mb = var10 >> 1936096449;
                  stackOut_73_0 = (bs) var8_ref_bs;
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_74_0 = stackOut_73_0;
                  if ((var10 & 1) == 0) {
                    stackOut_75_0 = (bs) (Object) stackIn_75_0;
                    stackOut_75_1 = 0;
                    stackIn_76_0 = stackOut_75_0;
                    stackIn_76_1 = stackOut_75_1;
                    break L28;
                  } else {
                    stackOut_74_0 = (bs) (Object) stackIn_74_0;
                    stackOut_74_1 = 1;
                    stackIn_76_0 = stackOut_74_0;
                    stackIn_76_1 = stackOut_74_1;
                    break L28;
                  }
                }
                stackIn_76_0.field_Zb = stackIn_76_1 != 0;
                var8_ref_bs.field_Ib = ((ed) (Object) var1).h(param0 + 55);
                var8_ref_bs.field_Kb = ((ed) (Object) var1).h(-11);
                ia.a((byte) 77, var8_ref_bs);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L24;
                }
              }
            }
            L29: {
              if (var2 != 6) {
                break L29;
              } else {
                L30: {
                  var3_long = ((ed) (Object) var1).i(-31016);
                  var5_int = ((ed) (Object) var1).h(-11);
                  var6_ref = jg.a(var3_long, 86);
                  if (var6_ref != null) {
                    L31: {
                      if (!var6_ref.field_Ob) {
                        break L31;
                      } else {
                        var6_ref.field_Ob = false;
                        kk.field_j = kk.field_j - 1;
                        break L31;
                      }
                    }
                    L32: {
                      L33: {
                        if (var5_int != 0) {
                          break L33;
                        } else {
                          var6_ref.c(param0 ^ -68);
                          if (var11 == 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      var6_ref.field_Hb = var5_int;
                      var6_ref.field_Ub = lp.field_D;
                      break L32;
                    }
                    var6_ref.a(-124);
                    break L30;
                  } else {
                    break L30;
                  }
                }
                if (var11 == 0) {
                  break L0;
                } else {
                  break L29;
                }
              }
            }
            L34: {
              if (var2 == 7) {
                break L34;
              } else {
                L35: {
                  if (var2 == 8) {
                    break L35;
                  } else {
                    L36: {
                      if (9 == var2) {
                        break L36;
                      } else {
                        L37: {
                          if (var2 == 10) {
                            break L37;
                          } else {
                            L38: {
                              L39: {
                                if (var2 == 11) {
                                  break L39;
                                } else {
                                  if (var2 != 12) {
                                    break L38;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              L40: {
                                var3_int = ((ed) (Object) var1).a((byte) -11);
                                var4 = (uh) (Object) lh.field_b.a(param0 ^ -3597, (long)var3_int);
                                if (var4 == null) {
                                  break L40;
                                } else {
                                  L41: {
                                    L42: {
                                      if (var2 != 11) {
                                        break L42;
                                      } else {
                                        var4.field_Sb = true;
                                        if (var11 == 0) {
                                          break L41;
                                        } else {
                                          break L42;
                                        }
                                      }
                                    }
                                    var4.field_qc = true;
                                    break L41;
                                  }
                                  ce.a(true, var4);
                                  break L40;
                                }
                              }
                              if (var11 == 0) {
                                break L0;
                              } else {
                                break L38;
                              }
                            }
                            L43: {
                              if (var2 != 13) {
                                break L43;
                              } else {
                                L44: {
                                  var3_int = ((ed) (Object) var1).a((byte) -11);
                                  var4_int = ((ed) (Object) var1).h(-11);
                                  var5_ref = (uh) (Object) lh.field_b.a(3661, (long)var3_int);
                                  if (null != var5_ref) {
                                    L45: {
                                      var5_ref.field_qc = false;
                                      var6_ref2 = var5_ref;
                                      var6_ref2.field_Sb = false;
                                      if (0 == var4_int) {
                                        break L45;
                                      } else {
                                        var5_ref.field_ic = lp.field_D;
                                        var5_ref.field_Lb = var4_int;
                                        break L45;
                                      }
                                    }
                                    ce.a(true, var5_ref);
                                    break L44;
                                  } else {
                                    break L44;
                                  }
                                }
                                if (var11 == 0) {
                                  break L0;
                                } else {
                                  break L43;
                                }
                              }
                            }
                            L46: {
                              if (var2 == 14) {
                                break L46;
                              } else {
                                if (var2 == 16) {
                                  break L46;
                                } else {
                                  L47: {
                                    L48: {
                                      if (var2 == 15) {
                                        break L48;
                                      } else {
                                        if (var2 != 17) {
                                          break L47;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                    L49: {
                                      var3_long = ((ed) (Object) var1).i(-31016);
                                      var5_int = ((ed) (Object) var1).h(-11);
                                      var6_ref = jg.a(var3_long, -126);
                                      if (var6_ref == null) {
                                        break L49;
                                      } else {
                                        L50: {
                                          if (var5_int == 0) {
                                            break L50;
                                          } else {
                                            var6_ref.field_Ub = lp.field_D;
                                            var6_ref.field_Hb = var5_int;
                                            break L50;
                                          }
                                        }
                                        L51: {
                                          L52: {
                                            if (15 == var2) {
                                              break L52;
                                            } else {
                                              if (!var6_ref.field_Ob) {
                                                break L51;
                                              } else {
                                                var6_ref.field_Ob = false;
                                                kk.field_j = kk.field_j - 1;
                                                if (var11 == 0) {
                                                  break L51;
                                                } else {
                                                  break L52;
                                                }
                                              }
                                            }
                                          }
                                          var6_ref.field_Yb = false;
                                          break L51;
                                        }
                                        ia.a((byte) 77, var6_ref);
                                        break L49;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L0;
                                    } else {
                                      break L47;
                                    }
                                  }
                                  L53: {
                                    if (var2 != 18) {
                                      break L53;
                                    } else {
                                      L54: {
                                        var3_long = ((ed) (Object) var1).i(-31016);
                                        var5 = ((ed) (Object) var1).f(128);
                                        var6 = ((ed) (Object) var1).f(128);
                                        var7_ref = eq.a(var3_long, (byte) 89);
                                        if (var7_ref != null) {
                                          break L54;
                                        } else {
                                          var7_ref = new bs(var5, var6, var3_long);
                                          ck.field_I.a((gp) (Object) var7_ref, var3_long, param0 + -1);
                                          gd.field_j.field_Qb = gd.field_j.field_Qb + 1;
                                          break L54;
                                        }
                                      }
                                      L55: {
                                        var7_ref.field_Rb = ((ed) (Object) var1).a((byte) -11);
                                        var8 = ((ed) (Object) var1).a(false);
                                        stackOut_141_0 = (bs) var7_ref;
                                        stackIn_143_0 = stackOut_141_0;
                                        stackIn_142_0 = stackOut_141_0;
                                        if ((var8 & 1) == 0) {
                                          stackOut_143_0 = (bs) (Object) stackIn_143_0;
                                          stackOut_143_1 = 0;
                                          stackIn_144_0 = stackOut_143_0;
                                          stackIn_144_1 = stackOut_143_1;
                                          break L55;
                                        } else {
                                          stackOut_142_0 = (bs) (Object) stackIn_142_0;
                                          stackOut_142_1 = 1;
                                          stackIn_144_0 = stackOut_142_0;
                                          stackIn_144_1 = stackOut_142_1;
                                          break L55;
                                        }
                                      }
                                      stackIn_144_0.field_Zb = stackIn_144_1 != 0;
                                      var7_ref.field_Mb = var8 >> -236505247;
                                      var7_ref.field_Ib = ((ed) (Object) var1).h(-11);
                                      var7_ref.field_Kb = ((ed) (Object) var1).h(-11);
                                      kq.field_Rb.a((li) (Object) var7_ref, false);
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                  L56: {
                                    if (var2 == 19) {
                                      break L56;
                                    } else {
                                      L57: {
                                        if (var2 == 20) {
                                          break L57;
                                        } else {
                                          L58: {
                                            if (var2 != 21) {
                                              break L58;
                                            } else {
                                              L59: {
                                                L60: {
                                                  var3_int = ((ed) (Object) var1).a((byte) -11);
                                                  if (var3_int == 0) {
                                                    break L60;
                                                  } else {
                                                    r.field_h = (long)var3_int + gk.a(102);
                                                    if (var11 == 0) {
                                                      break L59;
                                                    } else {
                                                      break L60;
                                                    }
                                                  }
                                                }
                                                r.field_h = 0L;
                                                break L59;
                                              }
                                              if (var11 == 0) {
                                                break L0;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                          L61: {
                                            if (var2 == 22) {
                                              break L61;
                                            } else {
                                              L62: {
                                                if (var2 == 23) {
                                                  break L62;
                                                } else {
                                                  ke.a((Throwable) null, "L1: " + or.a(param0 + 181), 0);
                                                  rm.b((byte) -115);
                                                  if (var11 == 0) {
                                                    break L0;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                              }
                                              ao.field_N = ((ed) (Object) var1).i(param0 ^ 31078);
                                              if (var11 == 0) {
                                                break L0;
                                              } else {
                                                break L61;
                                              }
                                            }
                                          }
                                          rp.field_a = ((ed) (Object) var1).a((byte) -11);
                                          qn.field_w = ((ed) (Object) var1).a(false);
                                          if (var11 == 0) {
                                            break L0;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      ph.a(gd.field_j, true, (ed) (Object) var1, false);
                                      if (var11 == 0) {
                                        break L0;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  L63: {
                                    var3_long = ((ed) (Object) var1).i(-31016);
                                    var5_int = ((ed) (Object) var1).h(-11);
                                    var6_ref = eq.a(var3_long, (byte) 127);
                                    if (null != var6_ref) {
                                      L64: {
                                        L65: {
                                          if (var5_int == 0) {
                                            break L65;
                                          } else {
                                            var6_ref.field_Ub = lp.field_D;
                                            var6_ref.field_Hb = var5_int;
                                            if (var11 == 0) {
                                              break L64;
                                            } else {
                                              break L65;
                                            }
                                          }
                                        }
                                        var6_ref.c(param0 ^ -68);
                                        break L64;
                                      }
                                      var6_ref.a(param0 ^ 58);
                                      gd.field_j.field_Qb = gd.field_j.field_Qb - 1;
                                      break L63;
                                    } else {
                                      break L63;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L0;
                                  } else {
                                    break L46;
                                  }
                                }
                              }
                            }
                            L66: {
                              var3_long = ((ed) (Object) var1).i(-31016);
                              var5_ref2 = jg.a(var3_long, -8);
                              if (var5_ref2 == null) {
                                break L66;
                              } else {
                                L67: {
                                  L68: {
                                    if (var2 != 14) {
                                      break L68;
                                    } else {
                                      var5_ref2.field_Yb = true;
                                      if (var11 == 0) {
                                        break L67;
                                      } else {
                                        break L68;
                                      }
                                    }
                                  }
                                  if (!var5_ref2.field_Ob) {
                                    var5_ref2.field_Ob = true;
                                    kk.field_j = kk.field_j + 1;
                                    break L67;
                                  } else {
                                    break L67;
                                  }
                                }
                                ia.a((byte) 77, var5_ref2);
                                break L66;
                              }
                            }
                            if (var11 == 0) {
                              break L0;
                            } else {
                              break L37;
                            }
                          }
                        }
                        var3_ref = (uh) (Object) nr.field_p.a((byte) 100);
                        L69: while (true) {
                          L70: {
                            if (null == var3_ref) {
                              break L70;
                            } else {
                              var3_ref.c(2);
                              var3_ref.a(-103);
                              var3_ref = (uh) (Object) nr.field_p.b(49);
                              if (var11 != 0) {
                                break L0;
                              } else {
                                if (var11 == 0) {
                                  continue L69;
                                } else {
                                  break L70;
                                }
                              }
                            }
                          }
                          if (var11 == 0) {
                            break L0;
                          } else {
                            break L36;
                          }
                        }
                      }
                    }
                    L71: {
                      var3_int = ((ed) (Object) var1).a((byte) -11);
                      var4_int = ((ed) (Object) var1).h(-11);
                      var5_ref = (uh) (Object) lh.field_b.a(3661, (long)var3_int);
                      if (var5_ref != null) {
                        L72: {
                          L73: {
                            if (var4_int != 0) {
                              break L73;
                            } else {
                              var5_ref.c(2);
                              if (var11 == 0) {
                                break L72;
                              } else {
                                break L73;
                              }
                            }
                          }
                          var5_ref.field_Lb = var4_int;
                          var5_ref.field_ic = lp.field_D;
                          break L72;
                        }
                        var5_ref.a(-108);
                        break L71;
                      } else {
                        break L71;
                      }
                    }
                    if (var11 == 0) {
                      break L0;
                    } else {
                      break L35;
                    }
                  }
                }
                L74: {
                  var3_int = ((ed) (Object) var1).a((byte) -11);
                  var4 = (uh) (Object) lh.field_b.a(3661, (long)var3_int);
                  if (null != var4) {
                    break L74;
                  } else {
                    var4 = new uh(ol.field_A);
                    lh.field_b.a((gp) (Object) var4, (long)var3_int, 45);
                    break L74;
                  }
                }
                ph.a(var4, true, (ed) (Object) var1, true);
                ce.a(true, var4);
                if (var11 == 0) {
                  break L0;
                } else {
                  break L34;
                }
              }
            }
            var3 = (bs) (Object) mk.field_J.a((byte) 100);
            L75: while (true) {
              L76: {
                if (null == var3) {
                  break L76;
                } else {
                  var3.c(2);
                  var3.a(param0 + -59);
                  var3 = (bs) (Object) mk.field_J.b(88);
                  if (var11 != 0) {
                    break L0;
                  } else {
                    if (var11 == 0) {
                      continue L75;
                    } else {
                      break L76;
                    }
                  }
                }
              }
              kk.field_j = 0;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              eb.field_c = uo.a(107);
              ch.field_e = new sd();
              if (param0 == 44) {
                break L1;
              } else {
                tq.a((java.awt.Color) null, false, (String) null, (byte) 8, 11);
                break L1;
              }
            }
            ak.a(true, true, 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "tq.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        try {
            field_a = null;
            field_c = null;
            field_d = null;
            if (param0 != 13597) {
                field_d = null;
            }
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tq.F(" + param0 + ')');
        }
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, byte param3, int param4) {
        java.awt.Graphics var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        Exception var6 = null;
        java.awt.Graphics var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
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
                  if (param3 <= -125) {
                    break L8;
                  } else {
                    field_c = null;
                    break L8;
                  }
                }
                L9: {
                  if (op.field_a != null) {
                    var5.setFont(fh.field_t);
                    var5.setColor(java.awt.Color.white);
                    var5.drawString(op.field_a, op.field_c / 2 + -(6 * op.field_a.length() / 2), -26 + gh.field_a / 2);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L10: {
                var5_ref = (Exception) (Object) decompiledCaughtException;
                ne.field_F.repaint();
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var5_ref2;
            stackOut_24_1 = new StringBuilder().append("tq.E(");
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L11;
            }
          }
          L12: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param1).append(',');
            stackIn_31_0 = stackOut_28_0;
            stackIn_31_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_32_0 = stackOut_29_0;
              stackIn_32_1 = stackOut_29_1;
              stackIn_32_2 = stackOut_29_2;
              break L12;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final String toString() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          throw new IllegalStateException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "tq.toString()");
        }
    }

    tq(int param0) {
        try {
            ((tq) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "tq.<init>(" + param0 + ')');
        }
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (!param0) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                if (kq.a((byte) 123, (CharSequence) (Object) var2) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L2;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2_ref;
            stackOut_9_1 = new StringBuilder().append("tq.C(").append(param0).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
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
