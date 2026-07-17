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
        Object var16 = null;
        int decompiledRegionSelector0 = 0;
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
                var16 = null;
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
              if (var6 <= var5_int) {
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                var8 += 2;
                var7 = var7 + var8;
                if (var15 != 0) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (var7 <= 0) {
                      break L3;
                    } else {
                      var6--;
                      var7 = var7 - (var6 << 1);
                      var11 = param2 - var6;
                      var12 = param2 + var6;
                      if (var12 < ua.field_e) {
                        break L3;
                      } else {
                        if (cj.field_D < var11) {
                          break L3;
                        } else {
                          L4: {
                            var13 = pk.a((byte) -14, ib.field_a, param0 - -var5_int, ap.field_e);
                            var14 = pk.a((byte) -14, ib.field_a, param0 - var5_int, ap.field_e);
                            if (var12 <= cj.field_D) {
                              ki.a(-123, var14, vl.field_e[var12], var13, param3);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          if (ua.field_e <= var11) {
                            ki.a(-86, var14, vl.field_e[var11], var13, param3);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    var5_int++;
                    var11 = -var5_int + param2;
                    var12 = var5_int + param2;
                    if (var12 < ua.field_e) {
                      break L5;
                    } else {
                      if (var11 <= cj.field_D) {
                        L6: {
                          var13 = pk.a((byte) -14, ib.field_a, var6 + param0, ap.field_e);
                          var14 = pk.a((byte) -14, ib.field_a, -var6 + param0, ap.field_e);
                          if (cj.field_D < var12) {
                            break L6;
                          } else {
                            ki.a(-88, var14, vl.field_e[var12], var13, param3);
                            break L6;
                          }
                        }
                        if (var11 >= ua.field_e) {
                          ki.a(-97, var14, vl.field_e[var11], var13, param3);
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var5, "tq.A(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        mi var1_ref = null;
        int var2 = 0;
        bs var3_ref_bs = null;
        long var3_long = 0L;
        int var3 = 0;
        uh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        uh var6 = null;
        bs var7 = null;
        bs var8_ref_bs = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        mi var12 = null;
        uh var13 = null;
        uh var14 = null;
        uh var15 = null;
        Object var16 = null;
        Object var17 = null;
        String var18 = null;
        String var19 = null;
        String var20 = null;
        bs var21 = null;
        Object var22 = null;
        bs var23 = null;
        String var24 = null;
        String var25 = null;
        bs var26 = null;
        bs var27 = null;
        uh var28 = null;
        uh var29 = null;
        bs var30 = null;
        boolean stackIn_18_0 = false;
        int stackIn_27_0 = 0;
        int stackIn_61_0 = 0;
        bs stackIn_66_0 = null;
        bs stackIn_67_0 = null;
        bs stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        bs stackIn_120_0 = null;
        bs stackIn_121_0 = null;
        bs stackIn_122_0 = null;
        int stackIn_122_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_17_0 = false;
        int stackOut_26_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        bs stackOut_65_0 = null;
        bs stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        bs stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        bs stackOut_119_0 = null;
        bs stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        bs stackOut_120_0 = null;
        int stackOut_120_1 = 0;
        var22 = null;
        var16 = null;
        var17 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            var12 = id.field_f;
            var1_ref = var12;
            if (param0 == -66) {
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
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                      }
                    }
                  }
                  var3_ref_bs = (bs) (Object) kq.field_Rb.a((byte) 100);
                  L4: while (true) {
                    L5: {
                      L6: {
                        if (var3_ref_bs == null) {
                          break L6;
                        } else {
                          var3_ref_bs.c(2);
                          var3_ref_bs.a(-117);
                          var3_ref_bs = (bs) (Object) kq.field_Rb.b(param0 + 181);
                          if (var11 != 0) {
                            break L5;
                          } else {
                            if (var11 == 0) {
                              continue L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      var3_ref_bs = (bs) (Object) kd.field_l.b(-128);
                      break L5;
                    }
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (var3_ref_bs == null) {
                            break L9;
                          } else {
                            stackOut_17_0 = var3_ref_bs.field_Yb;
                            stackIn_27_0 = stackOut_17_0 ? 1 : 0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var11 != 0) {
                              break L8;
                            } else {
                              L10: {
                                L11: {
                                  if (stackIn_18_0) {
                                    break L11;
                                  } else {
                                    if (!var3_ref_bs.field_Ob) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                L12: {
                                  if (var3_ref_bs.field_Ob) {
                                    kk.field_j = kk.field_j - 1;
                                    var3_ref_bs.field_Ob = false;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                var3_ref_bs.field_Yb = false;
                                ia.a((byte) 77, var3_ref_bs);
                                break L10;
                              }
                              var3_ref_bs = (bs) (Object) kd.field_l.a((byte) -60);
                              if (var11 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        stackOut_26_0 = var2;
                        stackIn_27_0 = stackOut_26_0;
                        break L8;
                      }
                      L13: {
                        if (stackIn_27_0 != 1) {
                          break L13;
                        } else {
                          if (gd.field_j != null) {
                            nr.field_q = gd.field_j.field_Nb;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        L15: {
                          if (4 == var2) {
                            break L15;
                          } else {
                            gd.field_j = null;
                            if (var11 == 0) {
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        var3 = ((ed) (Object) var1_ref).a((byte) -11);
                        gd.field_j = new uh(ol.field_A);
                        gd.field_j.a(-1, (long)var3);
                        ph.a(gd.field_j, true, (ed) (Object) var1_ref, false);
                        r.field_h = 0L;
                        break L14;
                      }
                      L16: {
                        L17: {
                          L18: {
                            if (var2 == 2) {
                              break L18;
                            } else {
                              if (var2 != 3) {
                                break L17;
                              } else {
                                break L18;
                              }
                            }
                          }
                          if (sj.field_d != null) {
                            break L16;
                          } else {
                            sj.field_d = new uh(ol.field_A);
                            if (var11 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        sj.field_d = null;
                        break L16;
                      }
                      L19: {
                        if (var2 == 3) {
                          break L19;
                        } else {
                          qn.field_q = false;
                          if (var11 == 0) {
                            break L1;
                          } else {
                            break L19;
                          }
                        }
                      }
                      qn.field_q = true;
                      var3 = 0;
                      L20: while (true) {
                        L21: {
                          L22: {
                            if (~qc.field_w.length >= ~var3) {
                              break L22;
                            } else {
                              qc.field_w[var3] = ((ed) (Object) var12).g(114);
                              var3++;
                              if (var11 != 0) {
                                break L21;
                              } else {
                                if (var11 == 0) {
                                  continue L20;
                                } else {
                                  break L22;
                                }
                              }
                            }
                          }
                          ua.field_a = ((ed) (Object) var1_ref).h(-11);
                          kg.field_y = ((ed) (Object) var1_ref).h(param0 ^ 75);
                          break L21;
                        }
                        var3 = 0;
                        L23: while (true) {
                          L24: {
                            if (var3 >= dj.field_a.length) {
                              break L24;
                            } else {
                              dj.field_a[var3] = ((ed) (Object) var12).g(90);
                              var3++;
                              if (var11 != 0) {
                                break L1;
                              } else {
                                if (var11 == 0) {
                                  continue L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
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
                L25: {
                  if (5 != var2) {
                    break L25;
                  } else {
                    L26: {
                      var3_long = ((ed) (Object) var1_ref).i(param0 + -30950);
                      var19 = ((ed) (Object) var1_ref).f(128);
                      var18 = ((ed) (Object) var1_ref).f(128);
                      var20 = ((ed) (Object) var1_ref).f(128);
                      var8_ref_bs = jg.a(var3_long, -126);
                      if (var18.equals((Object) (Object) "")) {
                        stackOut_60_0 = 0;
                        stackIn_61_0 = stackOut_60_0;
                        break L26;
                      } else {
                        stackOut_59_0 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        break L26;
                      }
                    }
                    L27: {
                      L28: {
                        var9 = stackIn_61_0;
                        if (var8_ref_bs != null) {
                          break L28;
                        } else {
                          var8_ref_bs = new bs(var19, var20, var3_long);
                          kd.field_l.a((gp) (Object) var8_ref_bs, var3_long, 61);
                          if (var11 == 0) {
                            break L27;
                          } else {
                            break L28;
                          }
                        }
                      }
                      if (var9 == 0) {
                        break L27;
                      } else {
                        var8_ref_bs.a(1, var20, var19);
                        break L27;
                      }
                    }
                    L29: {
                      var8_ref_bs.field_Jb = gk.a(53) + -(long)((ed) (Object) var1_ref).b(true);
                      var8_ref_bs.field_Rb = ((ed) (Object) var1_ref).a((byte) -11);
                      var10 = ((ed) (Object) var1_ref).a(false);
                      var8_ref_bs.field_Mb = var10 >> 1;
                      stackOut_65_0 = (bs) var8_ref_bs;
                      stackIn_67_0 = stackOut_65_0;
                      stackIn_66_0 = stackOut_65_0;
                      if ((var10 & 1) == 0) {
                        stackOut_67_0 = (bs) (Object) stackIn_67_0;
                        stackOut_67_1 = 0;
                        stackIn_68_0 = stackOut_67_0;
                        stackIn_68_1 = stackOut_67_1;
                        break L29;
                      } else {
                        stackOut_66_0 = (bs) (Object) stackIn_66_0;
                        stackOut_66_1 = 1;
                        stackIn_68_0 = stackOut_66_0;
                        stackIn_68_1 = stackOut_66_1;
                        break L29;
                      }
                    }
                    stackIn_68_0.field_Zb = stackIn_68_1 != 0;
                    var8_ref_bs.field_Ib = ((ed) (Object) var1_ref).h(param0 + 55);
                    var8_ref_bs.field_Kb = ((ed) (Object) var1_ref).h(-11);
                    ia.a((byte) 77, var8_ref_bs);
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L25;
                    }
                  }
                }
                L30: {
                  if (var2 != 6) {
                    break L30;
                  } else {
                    L31: {
                      var3_long = ((ed) (Object) var1_ref).i(-31016);
                      var5 = ((ed) (Object) var1_ref).h(-11);
                      var21 = jg.a(var3_long, 86);
                      if (var21 != null) {
                        L32: {
                          if (!var21.field_Ob) {
                            break L32;
                          } else {
                            var21.field_Ob = false;
                            kk.field_j = kk.field_j - 1;
                            break L32;
                          }
                        }
                        L33: {
                          L34: {
                            if (var5 != 0) {
                              break L34;
                            } else {
                              var21.c(param0 ^ -68);
                              if (var11 == 0) {
                                break L33;
                              } else {
                                break L34;
                              }
                            }
                          }
                          var21.field_Hb = var5;
                          var21.field_Ub = lp.field_D;
                          break L33;
                        }
                        var21.a(-124);
                        break L31;
                      } else {
                        break L31;
                      }
                    }
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L30;
                    }
                  }
                }
                L35: {
                  if (var2 == 7) {
                    break L35;
                  } else {
                    L36: {
                      if (var2 == 8) {
                        break L36;
                      } else {
                        L37: {
                          if (9 == var2) {
                            break L37;
                          } else {
                            L38: {
                              if (var2 == 10) {
                                break L38;
                              } else {
                                L39: {
                                  L40: {
                                    if (var2 == 11) {
                                      break L40;
                                    } else {
                                      if (var2 != 12) {
                                        break L39;
                                      } else {
                                        break L40;
                                      }
                                    }
                                  }
                                  L41: {
                                    var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                    var28 = (uh) (Object) lh.field_b.a(param0 ^ -3597, (long)var3);
                                    if (var28 == null) {
                                      break L41;
                                    } else {
                                      L42: {
                                        L43: {
                                          if (var2 != 11) {
                                            break L43;
                                          } else {
                                            var28.field_Sb = true;
                                            if (var11 == 0) {
                                              break L42;
                                            } else {
                                              break L43;
                                            }
                                          }
                                        }
                                        var28.field_qc = true;
                                        break L42;
                                      }
                                      ce.a(true, var28);
                                      break L41;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L1;
                                  } else {
                                    break L39;
                                  }
                                }
                                L44: {
                                  if (var2 != 13) {
                                    break L44;
                                  } else {
                                    L45: {
                                      var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                      var4_int = ((ed) (Object) var1_ref).h(-11);
                                      var14 = (uh) (Object) lh.field_b.a(3661, (long)var3);
                                      if (var14 != null) {
                                        L46: {
                                          var14.field_qc = false;
                                          var13 = var14;
                                          var6 = var13;
                                          var13.field_Sb = false;
                                          if (0 == var4_int) {
                                            break L46;
                                          } else {
                                            var14.field_ic = lp.field_D;
                                            var14.field_Lb = var4_int;
                                            break L46;
                                          }
                                        }
                                        ce.a(true, var14);
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L1;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                                L47: {
                                  if (var2 == 14) {
                                    break L47;
                                  } else {
                                    if (var2 == 16) {
                                      break L47;
                                    } else {
                                      L48: {
                                        L49: {
                                          if (var2 == 15) {
                                            break L49;
                                          } else {
                                            if (var2 != 17) {
                                              break L48;
                                            } else {
                                              break L49;
                                            }
                                          }
                                        }
                                        L50: {
                                          var3_long = ((ed) (Object) var1_ref).i(-31016);
                                          var5 = ((ed) (Object) var1_ref).h(-11);
                                          var23 = jg.a(var3_long, -126);
                                          if (var23 == null) {
                                            break L50;
                                          } else {
                                            L51: {
                                              if (var5 == 0) {
                                                break L51;
                                              } else {
                                                var23.field_Ub = lp.field_D;
                                                var23.field_Hb = var5;
                                                break L51;
                                              }
                                            }
                                            L52: {
                                              L53: {
                                                if (15 == var2) {
                                                  break L53;
                                                } else {
                                                  if (!var23.field_Ob) {
                                                    break L52;
                                                  } else {
                                                    var23.field_Ob = false;
                                                    kk.field_j = kk.field_j - 1;
                                                    if (var11 == 0) {
                                                      break L52;
                                                    } else {
                                                      break L53;
                                                    }
                                                  }
                                                }
                                              }
                                              var23.field_Yb = false;
                                              break L52;
                                            }
                                            ia.a((byte) 77, var23);
                                            break L50;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L1;
                                        } else {
                                          break L48;
                                        }
                                      }
                                      L54: {
                                        if (var2 != 18) {
                                          break L54;
                                        } else {
                                          L55: {
                                            var3_long = ((ed) (Object) var1_ref).i(-31016);
                                            var24 = ((ed) (Object) var1_ref).f(128);
                                            var25 = ((ed) (Object) var1_ref).f(128);
                                            var7 = eq.a(var3_long, (byte) 89);
                                            if (var7 != null) {
                                              break L55;
                                            } else {
                                              var7 = new bs(var24, var25, var3_long);
                                              ck.field_I.a((gp) (Object) var7, var3_long, param0 + -1);
                                              gd.field_j.field_Qb = gd.field_j.field_Qb + 1;
                                              break L55;
                                            }
                                          }
                                          L56: {
                                            var7.field_Rb = ((ed) (Object) var1_ref).a((byte) -11);
                                            var8 = ((ed) (Object) var1_ref).a(false);
                                            stackOut_119_0 = (bs) var7;
                                            stackIn_121_0 = stackOut_119_0;
                                            stackIn_120_0 = stackOut_119_0;
                                            if ((var8 & 1) == 0) {
                                              stackOut_121_0 = (bs) (Object) stackIn_121_0;
                                              stackOut_121_1 = 0;
                                              stackIn_122_0 = stackOut_121_0;
                                              stackIn_122_1 = stackOut_121_1;
                                              break L56;
                                            } else {
                                              stackOut_120_0 = (bs) (Object) stackIn_120_0;
                                              stackOut_120_1 = 1;
                                              stackIn_122_0 = stackOut_120_0;
                                              stackIn_122_1 = stackOut_120_1;
                                              break L56;
                                            }
                                          }
                                          stackIn_122_0.field_Zb = stackIn_122_1 != 0;
                                          var7.field_Mb = var8 >> 1;
                                          var7.field_Ib = ((ed) (Object) var1_ref).h(-11);
                                          var7.field_Kb = ((ed) (Object) var1_ref).h(-11);
                                          kq.field_Rb.a((li) (Object) var7, false);
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L54;
                                          }
                                        }
                                      }
                                      L57: {
                                        if (var2 == 19) {
                                          break L57;
                                        } else {
                                          L58: {
                                            if (var2 == 20) {
                                              break L58;
                                            } else {
                                              L59: {
                                                if (var2 != 21) {
                                                  break L59;
                                                } else {
                                                  L60: {
                                                    L61: {
                                                      var3 = ((ed) (Object) var1_ref).a((byte) -11);
                                                      if (var3 == 0) {
                                                        break L61;
                                                      } else {
                                                        r.field_h = (long)var3 + gk.a(102);
                                                        if (var11 == 0) {
                                                          break L60;
                                                        } else {
                                                          break L61;
                                                        }
                                                      }
                                                    }
                                                    r.field_h = 0L;
                                                    break L60;
                                                  }
                                                  if (var11 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              L62: {
                                                if (var2 == 22) {
                                                  break L62;
                                                } else {
                                                  L63: {
                                                    if (var2 == 23) {
                                                      break L63;
                                                    } else {
                                                      ke.a((Throwable) null, "L1: " + or.a(param0 + 181), 0);
                                                      rm.b((byte) -115);
                                                      if (var11 == 0) {
                                                        break L1;
                                                      } else {
                                                        break L63;
                                                      }
                                                    }
                                                  }
                                                  ao.field_N = ((ed) (Object) var1_ref).i(param0 ^ 31078);
                                                  if (var11 == 0) {
                                                    break L1;
                                                  } else {
                                                    break L62;
                                                  }
                                                }
                                              }
                                              rp.field_a = ((ed) (Object) var1_ref).a((byte) -11);
                                              qn.field_w = ((ed) (Object) var1_ref).a(false);
                                              if (var11 == 0) {
                                                break L1;
                                              } else {
                                                break L58;
                                              }
                                            }
                                          }
                                          ph.a(gd.field_j, true, (ed) (Object) var1_ref, false);
                                          if (var11 == 0) {
                                            break L1;
                                          } else {
                                            break L57;
                                          }
                                        }
                                      }
                                      L64: {
                                        var3_long = ((ed) (Object) var1_ref).i(-31016);
                                        var5 = ((ed) (Object) var1_ref).h(-11);
                                        var26 = eq.a(var3_long, (byte) 127);
                                        if (var26 != null) {
                                          L65: {
                                            L66: {
                                              if (var5 == 0) {
                                                break L66;
                                              } else {
                                                var26.field_Ub = lp.field_D;
                                                var26.field_Hb = var5;
                                                if (var11 == 0) {
                                                  break L65;
                                                } else {
                                                  break L66;
                                                }
                                              }
                                            }
                                            var26.c(param0 ^ -68);
                                            break L65;
                                          }
                                          var26.a(param0 ^ 58);
                                          gd.field_j.field_Qb = gd.field_j.field_Qb - 1;
                                          break L64;
                                        } else {
                                          break L64;
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L1;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                }
                                L67: {
                                  var3_long = ((ed) (Object) var1_ref).i(-31016);
                                  var27 = jg.a(var3_long, -8);
                                  if (var27 == null) {
                                    break L67;
                                  } else {
                                    L68: {
                                      L69: {
                                        if (var2 != 14) {
                                          break L69;
                                        } else {
                                          var27.field_Yb = true;
                                          if (var11 == 0) {
                                            break L68;
                                          } else {
                                            break L69;
                                          }
                                        }
                                      }
                                      if (!var27.field_Ob) {
                                        var27.field_Ob = true;
                                        kk.field_j = kk.field_j + 1;
                                        break L68;
                                      } else {
                                        break L68;
                                      }
                                    }
                                    ia.a((byte) 77, var27);
                                    break L67;
                                  }
                                }
                                if (var11 == 0) {
                                  break L1;
                                } else {
                                  break L38;
                                }
                              }
                            }
                            var15 = (uh) (Object) nr.field_p.a((byte) 100);
                            L70: while (true) {
                              L71: {
                                if (var15 == null) {
                                  break L71;
                                } else {
                                  var15.c(2);
                                  var15.a(-103);
                                  var15 = (uh) (Object) nr.field_p.b(49);
                                  if (var11 != 0) {
                                    break L1;
                                  } else {
                                    if (var11 == 0) {
                                      continue L70;
                                    } else {
                                      break L71;
                                    }
                                  }
                                }
                              }
                              if (var11 == 0) {
                                break L1;
                              } else {
                                break L37;
                              }
                            }
                          }
                        }
                        L72: {
                          var3 = ((ed) (Object) var1_ref).a((byte) -11);
                          var4_int = ((ed) (Object) var1_ref).h(-11);
                          var29 = (uh) (Object) lh.field_b.a(3661, (long)var3);
                          if (var29 != null) {
                            L73: {
                              L74: {
                                if (var4_int != 0) {
                                  break L74;
                                } else {
                                  var29.c(2);
                                  if (var11 == 0) {
                                    break L73;
                                  } else {
                                    break L74;
                                  }
                                }
                              }
                              var29.field_Lb = var4_int;
                              var29.field_ic = lp.field_D;
                              break L73;
                            }
                            var29.a(-108);
                            break L72;
                          } else {
                            break L72;
                          }
                        }
                        if (var11 == 0) {
                          break L1;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L75: {
                      var3 = ((ed) (Object) var1_ref).a((byte) -11);
                      var4 = (uh) (Object) lh.field_b.a(3661, (long)var3);
                      if (var4 != null) {
                        break L75;
                      } else {
                        var4 = new uh(ol.field_A);
                        lh.field_b.a((gp) (Object) var4, (long)var3, 45);
                        break L75;
                      }
                    }
                    ph.a(var4, true, (ed) (Object) var1_ref, true);
                    ce.a(true, var4);
                    if (var11 == 0) {
                      break L1;
                    } else {
                      break L35;
                    }
                  }
                }
                var30 = (bs) (Object) mk.field_J.a((byte) 100);
                L76: while (true) {
                  L77: {
                    if (var30 == null) {
                      break L77;
                    } else {
                      var30.c(2);
                      var30.a(param0 + -59);
                      var30 = (bs) (Object) mk.field_J.b(88);
                      if (var11 != 0) {
                        break L1;
                      } else {
                        if (var11 == 0) {
                          continue L76;
                        } else {
                          break L77;
                        }
                      }
                    }
                  }
                  kk.field_j = 0;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) (Object) var1, "tq.D(" + param0 + 41);
        }
    }

    final static void b(byte param0) {
        eb.field_c = uo.a(107);
        ch.field_e = new sd();
        if (param0 != 44) {
            Object var2 = null;
            tq.a((java.awt.Color) null, false, (String) null, (byte) 8, 11);
        }
        ak.a(true, true, 3);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 != 13597) {
            field_d = null;
        }
    }

    final static void a(java.awt.Color param0, boolean param1, String param2, byte param3, int param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ne.field_F.getGraphics();
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
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, op.field_c, gh.field_a);
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
                    var10 = ug.field_c.getGraphics();
                    var10.setColor(param0);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 33, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(35, 2, 267, 30);
                    var10.setFont(fh.field_t);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param2, (304 + -(param2.length() * 6)) / 2, 22);
                    boolean discarded$1 = var9.drawImage(ug.field_c, -152 + op.field_c / 2, -18 + gh.field_a / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + op.field_c / 2;
                    var8 = -18 + gh.field_a / 2;
                    var9.setColor(param0);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 - -2, var8 + 2, 33, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, var8 + 1, 301, 31);
                    var9.fillRect(2 + var7 + 33, 2 + var8, 267, 30);
                    var9.setFont(fh.field_t);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, 22 + var8);
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
                    var9.setFont(fh.field_t);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(op.field_a, op.field_c / 2 + -(6 * op.field_a.length() / 2), -26 + gh.field_a / 2);
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
                var5 = (Exception) (Object) decompiledCaughtException;
                ne.field_F.repaint();
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5_ref;
            stackOut_19_1 = new StringBuilder().append("tq.E(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L11;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L11;
            }
          }
          L12: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L12;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L12;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 44 + 11 + 41);
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
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
                var3 = (CharSequence) (Object) var2;
                if (kq.a((byte) 123, var3) != 0L) {
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
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("tq.C(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
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
