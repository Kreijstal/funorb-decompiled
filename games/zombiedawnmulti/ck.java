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
                field_c = (String) null;
            }
            var5 = new int[rb.field_c.length + 1];
            var2 = var5;
            for (var3 = 0; rb.field_c.length > var3; var3++) {
                var5[var3] = rb.field_c[var3];
            }
            var2[var2.length - 1] = param0;
            rb.field_c = var2;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "ck.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        int stackIn_12_0 = 0;
        dm stackIn_18_0 = null;
        dm stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        dm stackIn_83_0 = null;
        dm stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ga var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        dm var3_ref_dm = null;
        int var3 = 0;
        jh var3_ref_jh = null;
        long var3_long = 0L;
        jh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dm var7 = null;
        int var8 = 0;
        dm var8_ref_dm = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        dm var14 = null;
        dm var15 = null;
        jh var16 = null;
        Object var17 = null;
        jh var17_ref = null;
        Object var18 = null;
        jh var18_ref = null;
        String var19 = null;
        String var20 = null;
        String var21 = null;
        dm var22 = null;
        dm var23 = null;
        jh var24 = null;
        dm var25 = null;
        dm var26 = null;
        String var27 = null;
        String var28 = null;
        dm var29 = null;
        Object var30 = null;
        jh var30_ref = null;
        jh var31 = null;
        var18 = null;
        var30 = null;
        var17 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = s.field_e;
              var2 = ((k) ((Object) var1)).g(31365);
              if (param0 == -2061) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (var2 == 0) {
                    break L4;
                  } else {
                    if ((var2 ^ -1) == -2) {
                      break L4;
                    } else {
                      if (-3 == (var2 ^ -1)) {
                        break L4;
                      } else {
                        if (3 == var2) {
                          break L4;
                        } else {
                          if (4 == var2) {
                            break L4;
                          } else {
                            if ((var2 ^ -1) != -6) {
                              if (6 != var2) {
                                if (7 == var2) {
                                  var3_ref_dm = (dm) ((Object) cg.field_i.c(66));
                                  L5: while (true) {
                                    if (var3_ref_dm == null) {
                                      cb.field_i = 0;
                                      break L2;
                                    } else {
                                      var3_ref_dm.a(true);
                                      var3_ref_dm.a(-4564);
                                      var3_ref_dm = (dm) ((Object) cg.field_i.b(param0 + 2067));
                                      continue L5;
                                    }
                                  }
                                } else {
                                  if ((var2 ^ -1) == -9) {
                                    L6: {
                                      var3 = ((k) ((Object) var1)).d((byte) 69);
                                      var4 = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                      if (var4 != null) {
                                        break L6;
                                      } else {
                                        var4 = new jh(kj.field_h);
                                        af.field_h.a(-1, var4, (long)var3);
                                        break L6;
                                      }
                                    }
                                    dl.a(var4, true, var1, false);
                                    mi.a(var4, param0 ^ 2144);
                                    break L2;
                                  } else {
                                    if (-10 == (var2 ^ -1)) {
                                      var3 = ((k) ((Object) var1)).d((byte) 69);
                                      var4_int = ((k) ((Object) var1)).g(31365);
                                      var17_ref = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                      var31 = var17_ref;
                                      if (var17_ref != null) {
                                        L7: {
                                          if (-1 == (var4_int ^ -1)) {
                                            var31.a(true);
                                            break L7;
                                          } else {
                                            var17_ref.field_Jb = so.field_r;
                                            var17_ref.field_Vb = var4_int;
                                            break L7;
                                          }
                                        }
                                        var31.a(-4564);
                                        break L2;
                                      } else {
                                        break L2;
                                      }
                                    } else {
                                      if ((var2 ^ -1) == -11) {
                                        var3_ref_jh = (jh) ((Object) tn.field_C.c(param0 + 2175));
                                        L8: while (true) {
                                          if (var3_ref_jh == null) {
                                            break L3;
                                          } else {
                                            var3_ref_jh.a(true);
                                            var3_ref_jh.a(param0 ^ 6623);
                                            var3_ref_jh = (jh) ((Object) tn.field_C.b(param0 + 2067));
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        L9: {
                                          if (-12 == (var2 ^ -1)) {
                                            break L9;
                                          } else {
                                            if (var2 != 12) {
                                              if (var2 == 13) {
                                                L10: {
                                                  var3 = ((k) ((Object) var1)).d((byte) 69);
                                                  var4_int = ((k) ((Object) var1)).g(param0 + 33426);
                                                  var30_ref = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                                  if (var30_ref == null) {
                                                    break L10;
                                                  } else {
                                                    L11: {
                                                      var16 = var30_ref;
                                                      var30_ref.field_rc = false;
                                                      if (var4_int == 0) {
                                                        break L11;
                                                      } else {
                                                        var30_ref.field_Jb = so.field_r;
                                                        var30_ref.field_Vb = var4_int;
                                                        break L11;
                                                      }
                                                    }
                                                    var16.field_lc = false;
                                                    mi.a(var30_ref, -57);
                                                    break L10;
                                                  }
                                                }
                                                break L2;
                                              } else {
                                                L12: {
                                                  if (-15 == (var2 ^ -1)) {
                                                    break L12;
                                                  } else {
                                                    if (var2 == 16) {
                                                      break L12;
                                                    } else {
                                                      L13: {
                                                        if ((var2 ^ -1) == -16) {
                                                          break L13;
                                                        } else {
                                                          if ((var2 ^ -1) != -18) {
                                                            if (var2 == 18) {
                                                              L14: {
                                                                var3_long = ((k) ((Object) var1)).a((byte) -30);
                                                                var27 = ((k) ((Object) var1)).f((byte) -27);
                                                                var28 = ((k) ((Object) var1)).f((byte) -125);
                                                                var7 = vm.a(var3_long, (byte) -99);
                                                                if (var7 == null) {
                                                                  var7 = new dm(var27, var28, var3_long);
                                                                  kp.field_o.a(-1, var7, var3_long);
                                                                  mh.field_c.field_cc = mh.field_c.field_cc + 1;
                                                                  break L14;
                                                                } else {
                                                                  break L14;
                                                                }
                                                              }
                                                              L15: {
                                                                var7.field_Mb = ((k) ((Object) var1)).d((byte) 69);
                                                                var8 = ((k) ((Object) var1)).a(0);
                                                                var7.field_Sb = var8 >> 573625729;
                                                                stackIn_83_0 = (dm) (var7);

                                                                if (-1 == (1 & var8 ^ -1)) {
                                                                  stackIn_84_0 = (dm) ((Object) stackIn_83_0);
                                                                  stackIn_84_1 = 0;
                                                                  break L15;
                                                                } else {
                                                                  stackIn_84_0 = (dm) ((Object) stackIn_83_0);
                                                                  stackIn_84_1 = 1;
                                                                  break L15;
                                                                }
                                                              }
                                                              stackIn_84_0.field_Nb = stackIn_84_1 != 0;
                                                              var7.field_Yb = ((k) ((Object) var1)).g(31365);
                                                              var7.field_Vb = ((k) ((Object) var1)).g(31365);
                                                              nh.field_g.a(var7, false);
                                                              break L2;
                                                            } else {
                                                              if (-20 != (var2 ^ -1)) {
                                                                if (-21 == (var2 ^ -1)) {
                                                                  dl.a(mh.field_c, false, var1, false);
                                                                  break L2;
                                                                } else {
                                                                  if (-22 == (var2 ^ -1)) {
                                                                    var3 = ((k) ((Object) var1)).d((byte) 69);
                                                                    if (-1 != (var3 ^ -1)) {
                                                                      qi.field_c = bl.a((byte) 97) - -(long)var3;
                                                                      break L2;
                                                                    } else {
                                                                      qi.field_c = 0L;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    if (22 != var2) {
                                                                      if (var2 != 23) {
                                                                        bd.a("L1: " + ci.a(0), (Throwable) null, false);
                                                                        ak.a((byte) -125);
                                                                        break L2;
                                                                      } else {
                                                                        ie.field_sb = ((k) ((Object) var1)).a((byte) -30);
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      bc.field_e = ((k) ((Object) var1)).d((byte) 69);
                                                                      dm.field_Zb = ((k) ((Object) var1)).a(param0 + 2061);
                                                                      break L2;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                L16: {
                                                                  var3_long = ((k) ((Object) var1)).a((byte) -30);
                                                                  var5 = ((k) ((Object) var1)).g(31365);
                                                                  var15 = vm.a(var3_long, (byte) -54);
                                                                  var26 = var15;
                                                                  if (var15 == null) {
                                                                    break L16;
                                                                  } else {
                                                                    L17: {
                                                                      if (-1 == (var5 ^ -1)) {
                                                                        var26.a(true);
                                                                        break L17;
                                                                      } else {
                                                                        var15.field_Fb = var5;
                                                                        var15.field_bc = so.field_r;
                                                                        break L17;
                                                                      }
                                                                    }
                                                                    var26.a(param0 ^ 6623);
                                                                    mh.field_c.field_cc = mh.field_c.field_cc - 1;
                                                                    break L16;
                                                                  }
                                                                }
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            break L13;
                                                          }
                                                        }
                                                      }
                                                      var3_long = ((k) ((Object) var1)).a((byte) -30);
                                                      var5 = ((k) ((Object) var1)).g(param0 + 33426);
                                                      var14 = en.a((byte) 50, var3_long);
                                                      var25 = var14;
                                                      if (var14 != null) {
                                                        L18: {
                                                          if (var2 != 15) {
                                                            if (var25.field_Ob) {
                                                              var25.field_Ob = false;
                                                              cb.field_i = cb.field_i - 1;
                                                              break L18;
                                                            } else {
                                                              break L18;
                                                            }
                                                          } else {
                                                            var14.field_Pb = false;
                                                            break L18;
                                                          }
                                                        }
                                                        L19: {
                                                          if (var5 != 0) {
                                                            var25.field_bc = so.field_r;
                                                            var25.field_Fb = var5;
                                                            break L19;
                                                          } else {
                                                            break L19;
                                                          }
                                                        }
                                                        lf.a(var25, true);
                                                        break L2;
                                                      } else {
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                }
                                                var3_long = ((k) ((Object) var1)).a((byte) -30);
                                                var29 = en.a((byte) 50, var3_long);
                                                if (var29 != null) {
                                                  L20: {
                                                    if (14 == var2) {
                                                      var29.field_Pb = true;
                                                      break L20;
                                                    } else {
                                                      if (var29.field_Ob) {
                                                        break L20;
                                                      } else {
                                                        cb.field_i = cb.field_i + 1;
                                                        var29.field_Ob = true;
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  lf.a(var29, true);
                                                  break L2;
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              break L9;
                                            }
                                          }
                                        }
                                        var3 = ((k) ((Object) var1)).d((byte) 69);
                                        var18_ref = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                        var24 = var18_ref;
                                        if (var24 != null) {
                                          L21: {
                                            if (-12 == (var2 ^ -1)) {
                                              var24.field_lc = true;
                                              break L21;
                                            } else {
                                              var24.field_rc = true;
                                              break L21;
                                            }
                                          }
                                          mi.a(var24, -126);
                                          break L2;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var3_long = ((k) ((Object) var1)).a((byte) -30);
                                var5 = ((k) ((Object) var1)).g(31365);
                                var23 = en.a((byte) 50, var3_long);
                                if (var23 != null) {
                                  L22: {
                                    if (!var23.field_Ob) {
                                      break L22;
                                    } else {
                                      cb.field_i = cb.field_i - 1;
                                      var23.field_Ob = false;
                                      break L22;
                                    }
                                  }
                                  L23: {
                                    if (0 != var5) {
                                      var23.field_bc = so.field_r;
                                      var23.field_Fb = var5;
                                      break L23;
                                    } else {
                                      var23.a(true);
                                      break L23;
                                    }
                                  }
                                  var23.a(-4564);
                                  break L2;
                                } else {
                                  break L2;
                                }
                              }
                            } else {
                              L24: {
                                var3_long = ((k) ((Object) var1)).a((byte) -30);
                                var20 = ((k) ((Object) var1)).f((byte) -76);
                                var19 = ((k) ((Object) var1)).f((byte) -50);
                                var21 = ((k) ((Object) var1)).f((byte) -61);
                                var22 = en.a((byte) 50, var3_long);
                                var8_ref_dm = var22;
                                if (var19.equals("")) {
                                  stackIn_12_0 = 0;
                                  break L24;
                                } else {
                                  stackIn_12_0 = 1;
                                  break L24;
                                }
                              }
                              L25: {
                                var9 = stackIn_12_0;
                                if (var22 != null) {
                                  if (var9 == 0) {
                                    break L25;
                                  } else {
                                    var22.a(var20, var21, 43);
                                    break L25;
                                  }
                                } else {
                                  var8_ref_dm = new dm(var20, var21, var3_long);
                                  hq.field_c.a(param0 + 2060, var8_ref_dm, var3_long);
                                  break L25;
                                }
                              }
                              L26: {
                                var8_ref_dm.field_Kb = bl.a((byte) 98) - (long)((k) ((Object) var1)).i(-1478490344);
                                var8_ref_dm.field_Mb = ((k) ((Object) var1)).d((byte) 69);
                                var10 = ((k) ((Object) var1)).a(param0 ^ -2061);
                                stackIn_18_0 = (dm) (var8_ref_dm);

                                if ((1 & var10) == 0) {
                                  stackIn_19_0 = (dm) ((Object) stackIn_18_0);
                                  stackIn_19_1 = 0;
                                  break L26;
                                } else {
                                  stackIn_19_0 = (dm) ((Object) stackIn_18_0);
                                  stackIn_19_1 = 1;
                                  break L26;
                                }
                              }
                              stackIn_19_0.field_Nb = stackIn_19_1 != 0;
                              var8_ref_dm.field_Sb = var10 >> -178928735;
                              var8_ref_dm.field_Yb = ((k) ((Object) var1)).g(31365);
                              var8_ref_dm.field_Vb = ((k) ((Object) var1)).g(param0 + 33426);
                              lf.a(var8_ref_dm, true);
                              break L2;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var3_ref_dm = (dm) ((Object) nh.field_g.c(113));
                L27: while (true) {
                  if (var3_ref_dm == null) {
                    var3_ref_dm = (dm) ((Object) hq.field_c.a((byte) 7));
                    L28: while (true) {
                      if (var3_ref_dm == null) {
                        L29: {
                          if (-2 != (var2 ^ -1)) {
                            break L29;
                          } else {
                            if (null == mh.field_c) {
                              break L29;
                            } else {
                              sb.field_k = mh.field_c.field_Nb;
                              break L29;
                            }
                          }
                        }
                        L30: {
                          if (var2 == 4) {
                            var3 = ((k) ((Object) var1)).d((byte) 69);
                            mh.field_c = new jh(kj.field_h);
                            mh.field_c.a((byte) -85, (long)var3);
                            dl.a(mh.field_c, false, var1, false);
                            qi.field_c = 0L;
                            break L30;
                          } else {
                            mh.field_c = null;
                            break L30;
                          }
                        }
                        L31: {
                          L32: {
                            if (-3 == (var2 ^ -1)) {
                              break L32;
                            } else {
                              if (-4 != (var2 ^ -1)) {
                                ej.field_n = null;
                                break L31;
                              } else {
                                break L32;
                              }
                            }
                          }
                          if (null != ej.field_n) {
                            break L31;
                          } else {
                            ej.field_n = new jh(kj.field_h);
                            break L31;
                          }
                        }
                        if (var2 == 3) {
                          la.field_k = true;
                          var3 = 0;
                          L33: while (true) {
                            if (fg.field_k.length <= var3) {
                              pb.field_h = ((k) ((Object) var1)).g(31365);
                              sc.field_f = ((k) ((Object) var1)).g(31365);
                              var3 = 0;
                              L34: while (true) {
                                if (var3 >= tg.field_a.length) {
                                  break L3;
                                } else {
                                  tg.field_a[var3] = ((k) ((Object) var1)).d(-249699580);
                                  var3++;
                                  continue L34;
                                }
                              }
                            } else {
                              fg.field_k[var3] = ((k) ((Object) var1)).d(param0 + -249697519);
                              var3++;
                              continue L33;
                            }
                          }
                        } else {
                          la.field_k = false;
                          break L2;
                        }
                      } else {
                        L35: {
                          L36: {
                            if (var3_ref_dm.field_Pb) {
                              break L36;
                            } else {
                              if (var3_ref_dm.field_Ob) {
                                break L36;
                              } else {
                                break L35;
                              }
                            }
                          }
                          L37: {
                            if (!var3_ref_dm.field_Ob) {
                              break L37;
                            } else {
                              cb.field_i = cb.field_i - 1;
                              var3_ref_dm.field_Ob = false;
                              break L37;
                            }
                          }
                          var3_ref_dm.field_Pb = false;
                          lf.a(var3_ref_dm, true);
                          break L35;
                        }
                        var3_ref_dm = (dm) ((Object) hq.field_c.c((byte) 123));
                        continue L28;
                      }
                    }
                  } else {
                    var3_ref_dm.a(true);
                    var3_ref_dm.a(-4564);
                    var3_ref_dm = (dm) ((Object) nh.field_g.b(6));
                    continue L27;
                  }
                }
              }
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref), "ck.C(" + param0 + ')');
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            if (!lo.a(8192, param0)) {
              stackIn_5_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != null) {
                var3_int = param2.length();
                if (-13 < (var3_int ^ -1)) {
                  if (eb.a((byte) 64, param0)) {
                    L2: {
                      if (-1 == (var3_int ^ -1)) {
                        stackIn_17_0 = 0;
                        break L2;
                      } else {
                        stackIn_17_0 = 1;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  stackIn_11_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_8_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var3);

            stackIn_21_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L3;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L3;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        int var1 = -20 % ((param0 - 40) / 63);
        field_b = null;
    }

    static {
        field_c = "OVER <%0>";
        field_b = "Players";
        field_a = 0;
    }
}
