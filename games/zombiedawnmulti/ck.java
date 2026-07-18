/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, int param1) {
        int[] var5 = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
            if (param1 != -23838) {
                field_c = null;
            }
            var5 = new int[rb.field_c.length + 1];
            var2 = var5;
            for (var3 = 0; rb.field_c.length > var3; var3++) {
                var5[var3] = rb.field_c[var3];
            }
            var2[var2.length - 1] = param0;
            rb.field_c = var2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ck.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a() {
        RuntimeException var1 = null;
        ga var1_ref = null;
        int var2 = 0;
        Object var3_ref = null;
        dm var3_ref_dm = null;
        long var3_long = 0L;
        int var3 = 0;
        jh var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        jh var5_ref = null;
        dm var5_ref2 = null;
        String var6 = null;
        dm var6_ref = null;
        String var7 = null;
        dm var7_ref = null;
        dm var8_ref_dm = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dm var13 = null;
        jh var15 = null;
        Object var16 = null;
        jh var16_ref = null;
        Object var17 = null;
        Object var18 = null;
        jh var18_ref = null;
        dm var19 = null;
        jh var20 = null;
        int stackIn_10_0 = 0;
        dm stackIn_15_0 = null;
        dm stackIn_16_0 = null;
        dm stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        dm stackIn_80_0 = null;
        dm stackIn_81_0 = null;
        dm stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        RuntimeException decompiledCaughtException = null;
        dm stackOut_79_0 = null;
        dm stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        dm stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        dm stackOut_14_0 = null;
        dm stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        dm stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        var18 = null;
        var17 = null;
        var16 = null;
        var3_ref = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  var1_ref = s.field_e;
                  var2 = ((k) (Object) var1_ref).g(31365);
                  if (var2 == 0) {
                    break L3;
                  } else {
                    if (var2 == 1) {
                      break L3;
                    } else {
                      if (var2 == 2) {
                        break L3;
                      } else {
                        if (3 == var2) {
                          break L3;
                        } else {
                          if (4 == var2) {
                            break L3;
                          } else {
                            if (var2 != 5) {
                              if (6 != var2) {
                                if (7 == var2) {
                                  var3_ref_dm = (dm) (Object) cg.field_i.c(66);
                                  L4: while (true) {
                                    if (var3_ref_dm == null) {
                                      cb.field_i = 0;
                                      break L1;
                                    } else {
                                      var3_ref_dm.a(true);
                                      var3_ref_dm.a(-4564);
                                      var3_ref_dm = (dm) (Object) cg.field_i.b(6);
                                      continue L4;
                                    }
                                  }
                                } else {
                                  if (var2 == 8) {
                                    L5: {
                                      var3 = ((k) (Object) var1_ref).d((byte) 69);
                                      var4 = (jh) (Object) af.field_h.a((long)var3, -22877);
                                      if (var4 != null) {
                                        break L5;
                                      } else {
                                        var4 = new jh(kj.field_h);
                                        af.field_h.a(-1, (qa) (Object) var4, (long)var3);
                                        break L5;
                                      }
                                    }
                                    int discarded$8 = 0;
                                    dl.a(var4, true, (k) (Object) var1_ref);
                                    mi.a(var4, -109);
                                    break L1;
                                  } else {
                                    if (var2 == 9) {
                                      var3 = ((k) (Object) var1_ref).d((byte) 69);
                                      var4_int = ((k) (Object) var1_ref).g(31365);
                                      var16_ref = (jh) (Object) af.field_h.a((long)var3, -22877);
                                      var5_ref = var16_ref;
                                      if (var16_ref != null) {
                                        L6: {
                                          if (var4_int == 0) {
                                            var5_ref.a(true);
                                            break L6;
                                          } else {
                                            var16_ref.field_Jb = so.field_r;
                                            var16_ref.field_Vb = var4_int;
                                            break L6;
                                          }
                                        }
                                        var5_ref.a(-4564);
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if (var2 == 10) {
                                        var20 = (jh) (Object) tn.field_C.c(114);
                                        L7: while (true) {
                                          if (var20 == null) {
                                            break L2;
                                          } else {
                                            var20.a(true);
                                            var20.a(-4564);
                                            var20 = (jh) (Object) tn.field_C.b(6);
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        L8: {
                                          if (var2 == 11) {
                                            break L8;
                                          } else {
                                            if (var2 != 12) {
                                              if (var2 == 13) {
                                                L9: {
                                                  var3 = ((k) (Object) var1_ref).d((byte) 69);
                                                  var4_int = ((k) (Object) var1_ref).g(31365);
                                                  var5_ref = (jh) (Object) af.field_h.a((long)var3, -22877);
                                                  if (var5_ref == null) {
                                                    break L9;
                                                  } else {
                                                    L10: {
                                                      var15 = var5_ref;
                                                      var5_ref.field_rc = false;
                                                      if (var4_int == 0) {
                                                        break L10;
                                                      } else {
                                                        var5_ref.field_Jb = so.field_r;
                                                        var5_ref.field_Vb = var4_int;
                                                        break L10;
                                                      }
                                                    }
                                                    var15.field_lc = false;
                                                    mi.a(var5_ref, -57);
                                                    break L9;
                                                  }
                                                }
                                                break L1;
                                              } else {
                                                L11: {
                                                  if (var2 == 14) {
                                                    break L11;
                                                  } else {
                                                    if (var2 == 16) {
                                                      break L11;
                                                    } else {
                                                      L12: {
                                                        if (var2 == 15) {
                                                          break L12;
                                                        } else {
                                                          if (var2 != 17) {
                                                            if (var2 == 18) {
                                                              L13: {
                                                                var3_long = ((k) (Object) var1_ref).a((byte) -30);
                                                                var5 = ((k) (Object) var1_ref).f((byte) -27);
                                                                var6 = ((k) (Object) var1_ref).f((byte) -125);
                                                                var7_ref = vm.a(var3_long, (byte) -99);
                                                                if (var7_ref == null) {
                                                                  var7_ref = new dm(var5, var6, var3_long);
                                                                  kp.field_o.a(-1, (qa) (Object) var7_ref, var3_long);
                                                                  mh.field_c.field_cc = mh.field_c.field_cc + 1;
                                                                  break L13;
                                                                } else {
                                                                  break L13;
                                                                }
                                                              }
                                                              L14: {
                                                                var7_ref.field_Mb = ((k) (Object) var1_ref).d((byte) 69);
                                                                var8 = ((k) (Object) var1_ref).a(0);
                                                                var7_ref.field_Sb = var8 >> 1;
                                                                stackOut_79_0 = (dm) var7_ref;
                                                                stackIn_81_0 = stackOut_79_0;
                                                                stackIn_80_0 = stackOut_79_0;
                                                                if ((1 & var8) == 0) {
                                                                  stackOut_81_0 = (dm) (Object) stackIn_81_0;
                                                                  stackOut_81_1 = 0;
                                                                  stackIn_82_0 = stackOut_81_0;
                                                                  stackIn_82_1 = stackOut_81_1;
                                                                  break L14;
                                                                } else {
                                                                  stackOut_80_0 = (dm) (Object) stackIn_80_0;
                                                                  stackOut_80_1 = 1;
                                                                  stackIn_82_0 = stackOut_80_0;
                                                                  stackIn_82_1 = stackOut_80_1;
                                                                  break L14;
                                                                }
                                                              }
                                                              stackIn_82_0.field_Nb = stackIn_82_1 != 0;
                                                              var7_ref.field_Yb = ((k) (Object) var1_ref).g(31365);
                                                              var7_ref.field_Vb = ((k) (Object) var1_ref).g(31365);
                                                              nh.field_g.a((br) (Object) var7_ref, false);
                                                              break L1;
                                                            } else {
                                                              if (var2 != 19) {
                                                                if (var2 == 20) {
                                                                  int discarded$9 = 0;
                                                                  dl.a(mh.field_c, false, (k) (Object) var1_ref);
                                                                  break L1;
                                                                } else {
                                                                  if (var2 == 21) {
                                                                    var3 = ((k) (Object) var1_ref).d((byte) 69);
                                                                    if (var3 != 0) {
                                                                      qi.field_c = bl.a((byte) 97) - -(long)var3;
                                                                      break L1;
                                                                    } else {
                                                                      qi.field_c = 0L;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if (22 != var2) {
                                                                      if (var2 != 23) {
                                                                        int discarded$10 = 0;
                                                                        bd.a("L1: " + ci.a(0), (Throwable) null);
                                                                        ak.a((byte) -125);
                                                                        break L1;
                                                                      } else {
                                                                        ie.field_sb = ((k) (Object) var1_ref).a((byte) -30);
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      bc.field_e = ((k) (Object) var1_ref).d((byte) 69);
                                                                      dm.field_Zb = ((k) (Object) var1_ref).a(0);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                L15: {
                                                                  var3_long = ((k) (Object) var1_ref).a((byte) -30);
                                                                  var5_int = ((k) (Object) var1_ref).g(31365);
                                                                  var19 = vm.a(var3_long, (byte) -54);
                                                                  var19 = var19;
                                                                  if (var19 == null) {
                                                                    break L15;
                                                                  } else {
                                                                    L16: {
                                                                      if (var5_int == 0) {
                                                                        var19.a(true);
                                                                        break L16;
                                                                      } else {
                                                                        var19.field_Fb = var5_int;
                                                                        var19.field_bc = so.field_r;
                                                                        break L16;
                                                                      }
                                                                    }
                                                                    var19.a(-4564);
                                                                    mh.field_c.field_cc = mh.field_c.field_cc - 1;
                                                                    break L15;
                                                                  }
                                                                }
                                                                break L1;
                                                              }
                                                            }
                                                          } else {
                                                            break L12;
                                                          }
                                                        }
                                                      }
                                                      var3_long = ((k) (Object) var1_ref).a((byte) -30);
                                                      var5_int = ((k) (Object) var1_ref).g(31365);
                                                      var13 = en.a((byte) 50, var3_long);
                                                      var6_ref = var13;
                                                      if (var13 != null) {
                                                        L17: {
                                                          if (var2 != 15) {
                                                            if (var6_ref.field_Ob) {
                                                              var6_ref.field_Ob = false;
                                                              cb.field_i = cb.field_i - 1;
                                                              break L17;
                                                            } else {
                                                              break L17;
                                                            }
                                                          } else {
                                                            var13.field_Pb = false;
                                                            break L17;
                                                          }
                                                        }
                                                        L18: {
                                                          if (var5_int != 0) {
                                                            var6_ref.field_bc = so.field_r;
                                                            var6_ref.field_Fb = var5_int;
                                                            break L18;
                                                          } else {
                                                            break L18;
                                                          }
                                                        }
                                                        int discarded$11 = 1;
                                                        lf.a(var6_ref);
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                }
                                                var3_long = ((k) (Object) var1_ref).a((byte) -30);
                                                var5_ref2 = en.a((byte) 50, var3_long);
                                                if (var5_ref2 != null) {
                                                  L19: {
                                                    if (14 == var2) {
                                                      var5_ref2.field_Pb = true;
                                                      break L19;
                                                    } else {
                                                      if (var5_ref2.field_Ob) {
                                                        break L19;
                                                      } else {
                                                        cb.field_i = cb.field_i + 1;
                                                        var5_ref2.field_Ob = true;
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  int discarded$12 = 1;
                                                  lf.a(var5_ref2);
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
                                        var3 = ((k) (Object) var1_ref).d((byte) 69);
                                        var18_ref = (jh) (Object) af.field_h.a((long)var3, -22877);
                                        var18_ref = var18_ref;
                                        if (var18_ref != null) {
                                          L20: {
                                            if (var2 == 11) {
                                              var18_ref.field_lc = true;
                                              break L20;
                                            } else {
                                              var18_ref.field_rc = true;
                                              break L20;
                                            }
                                          }
                                          mi.a(var18_ref, -126);
                                          break L1;
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3_long = ((k) (Object) var1_ref).a((byte) -30);
                                var5_int = ((k) (Object) var1_ref).g(31365);
                                var6_ref = en.a((byte) 50, var3_long);
                                if (var6_ref != null) {
                                  L21: {
                                    if (!var6_ref.field_Ob) {
                                      break L21;
                                    } else {
                                      cb.field_i = cb.field_i - 1;
                                      var6_ref.field_Ob = false;
                                      break L21;
                                    }
                                  }
                                  L22: {
                                    if (0 != var5_int) {
                                      var6_ref.field_bc = so.field_r;
                                      var6_ref.field_Fb = var5_int;
                                      break L22;
                                    } else {
                                      var6_ref.a(true);
                                      break L22;
                                    }
                                  }
                                  var6_ref.a(-4564);
                                  break L1;
                                } else {
                                  break L1;
                                }
                              }
                            } else {
                              L23: {
                                var3_long = ((k) (Object) var1_ref).a((byte) -30);
                                var5 = ((k) (Object) var1_ref).f((byte) -76);
                                var6 = ((k) (Object) var1_ref).f((byte) -50);
                                var7 = ((k) (Object) var1_ref).f((byte) -61);
                                var8_ref_dm = en.a((byte) 50, var3_long);
                                if (var6.equals((Object) (Object) "")) {
                                  stackOut_9_0 = 0;
                                  stackIn_10_0 = stackOut_9_0;
                                  break L23;
                                } else {
                                  stackOut_8_0 = 1;
                                  stackIn_10_0 = stackOut_8_0;
                                  break L23;
                                }
                              }
                              L24: {
                                var9 = stackIn_10_0;
                                if (var8_ref_dm != null) {
                                  if (var9 == 0) {
                                    break L24;
                                  } else {
                                    var8_ref_dm.a(var5, var7, 43);
                                    break L24;
                                  }
                                } else {
                                  var8_ref_dm = new dm(var5, var7, var3_long);
                                  hq.field_c.a(-1, (qa) (Object) var8_ref_dm, var3_long);
                                  break L24;
                                }
                              }
                              L25: {
                                var8_ref_dm.field_Kb = bl.a((byte) 98) - (long)((k) (Object) var1_ref).i(-1478490344);
                                var8_ref_dm.field_Mb = ((k) (Object) var1_ref).d((byte) 69);
                                var10 = ((k) (Object) var1_ref).a(0);
                                stackOut_14_0 = (dm) var8_ref_dm;
                                stackIn_16_0 = stackOut_14_0;
                                stackIn_15_0 = stackOut_14_0;
                                if ((1 & var10) == 0) {
                                  stackOut_16_0 = (dm) (Object) stackIn_16_0;
                                  stackOut_16_1 = 0;
                                  stackIn_17_0 = stackOut_16_0;
                                  stackIn_17_1 = stackOut_16_1;
                                  break L25;
                                } else {
                                  stackOut_15_0 = (dm) (Object) stackIn_15_0;
                                  stackOut_15_1 = 1;
                                  stackIn_17_0 = stackOut_15_0;
                                  stackIn_17_1 = stackOut_15_1;
                                  break L25;
                                }
                              }
                              stackIn_17_0.field_Nb = stackIn_17_1 != 0;
                              var8_ref_dm.field_Sb = var10 >> 1;
                              var8_ref_dm.field_Yb = ((k) (Object) var1_ref).g(31365);
                              var8_ref_dm.field_Vb = ((k) (Object) var1_ref).g(31365);
                              int discarded$13 = 1;
                              lf.a(var8_ref_dm);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_dm = (dm) (Object) nh.field_g.c(113);
                L26: while (true) {
                  if (var3_ref_dm == null) {
                    var3_ref_dm = (dm) (Object) hq.field_c.a((byte) 7);
                    L27: while (true) {
                      if (var3_ref_dm == null) {
                        L28: {
                          if (var2 != 1) {
                            break L28;
                          } else {
                            if (null == mh.field_c) {
                              break L28;
                            } else {
                              sb.field_k = mh.field_c.field_Nb;
                              break L28;
                            }
                          }
                        }
                        L29: {
                          if (var2 == 4) {
                            var3 = ((k) (Object) var1_ref).d((byte) 69);
                            mh.field_c = new jh(kj.field_h);
                            mh.field_c.a((byte) -85, (long)var3);
                            int discarded$14 = 0;
                            dl.a(mh.field_c, false, (k) (Object) var1_ref);
                            qi.field_c = 0L;
                            break L29;
                          } else {
                            mh.field_c = null;
                            break L29;
                          }
                        }
                        L30: {
                          L31: {
                            if (var2 == 2) {
                              break L31;
                            } else {
                              if (var2 != 3) {
                                ej.field_n = null;
                                break L30;
                              } else {
                                break L31;
                              }
                            }
                          }
                          if (null != ej.field_n) {
                            break L30;
                          } else {
                            ej.field_n = new jh(kj.field_h);
                            break L30;
                          }
                        }
                        if (var2 == 3) {
                          la.field_k = true;
                          var3 = 0;
                          L32: while (true) {
                            if (~fg.field_k.length >= ~var3) {
                              pb.field_h = ((k) (Object) var1_ref).g(31365);
                              sc.field_f = ((k) (Object) var1_ref).g(31365);
                              var3 = 0;
                              L33: while (true) {
                                if (~var3 <= ~tg.field_a.length) {
                                  break L2;
                                } else {
                                  tg.field_a[var3] = ((k) (Object) var1_ref).d(-249699580);
                                  var3++;
                                  continue L33;
                                }
                              }
                            } else {
                              fg.field_k[var3] = ((k) (Object) var1_ref).d(-249699580);
                              var3++;
                              continue L32;
                            }
                          }
                        } else {
                          la.field_k = false;
                          break L1;
                        }
                      } else {
                        L34: {
                          L35: {
                            if (var3_ref_dm.field_Pb) {
                              break L35;
                            } else {
                              if (var3_ref_dm.field_Ob) {
                                break L35;
                              } else {
                                break L34;
                              }
                            }
                          }
                          L36: {
                            if (!var3_ref_dm.field_Ob) {
                              break L36;
                            } else {
                              cb.field_i = cb.field_i - 1;
                              var3_ref_dm.field_Ob = false;
                              break L36;
                            }
                          }
                          var3_ref_dm.field_Pb = false;
                          int discarded$15 = 1;
                          lf.a(var3_ref_dm);
                          break L34;
                        }
                        var3_ref_dm = (dm) (Object) hq.field_c.c((byte) 123);
                        continue L27;
                      }
                    }
                  } else {
                    var3_ref_dm.a(true);
                    var3_ref_dm.a(-4564);
                    var3_ref_dm = (dm) (Object) nh.field_g.b(6);
                    continue L26;
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
          throw fa.a((Throwable) (Object) var1, "ck.C(" + -2061 + ')');
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!lo.a(8192, param0)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              if (param2 != null) {
                var3_int = param2.length();
                if (var3_int < 12) {
                  if (eb.a((byte) 64, param0)) {
                    L1: {
                      if (var3_int == 0) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L1;
                      } else {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        break L1;
                      }
                    }
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(-1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    public static void b() {
        field_c = null;
        int var1 = 0;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OVER <%0>";
        field_b = "Players";
        field_a = 0;
    }
}
