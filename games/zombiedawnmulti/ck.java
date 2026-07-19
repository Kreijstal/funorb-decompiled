/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -23838) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            var5 = new int[rb.field_c.length + 1];
            var2 = var5;
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (rb.field_c.length <= var3) {
                    break L4;
                  } else {
                    var5[var3] = rb.field_c[var3];
                    var3++;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var5[var5.length - 1] = param0;
                rb.field_c = var5;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "ck.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        ga var1_ref = null;
        int var2 = 0;
        dm var3_ref_dm = null;
        long var3_long = 0L;
        int var3 = 0;
        jh var3_ref_jh = null;
        jh var4 = null;
        int var4_int = 0;
        int var5 = 0;
        dm var7 = null;
        dm var8_ref_dm = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ga var13 = null;
        jh var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        dm var18 = null;
        Object var19 = null;
        dm var20 = null;
        dm var21 = null;
        String var22 = null;
        String var23 = null;
        dm var24 = null;
        Object var25 = null;
        jh var25_ref = null;
        Object var26 = null;
        jh var27 = null;
        jh var28 = null;
        int stackIn_12_0 = 0;
        dm stackIn_17_0 = null;
        dm stackIn_18_0 = null;
        dm stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        dm stackIn_96_0 = null;
        dm stackIn_97_0 = null;
        dm stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        boolean stackIn_146_0 = false;
        int stackIn_154_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        dm stackOut_16_0 = null;
        dm stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        dm stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        dm stackOut_95_0 = null;
        dm stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        dm stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        boolean stackOut_145_0 = false;
        int stackOut_153_0 = 0;
        var19 = null;
        var25 = null;
        var26 = null;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = s.field_e;
              var1_ref = var13;
              var2 = ((k) ((Object) var1_ref)).g(31365);
              if (param0 == -2061) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (var2 == 0) {
                  break L3;
                } else {
                  if ((var2 ^ -1) == -2) {
                    break L3;
                  } else {
                    if (-3 == (var2 ^ -1)) {
                      break L3;
                    } else {
                      if (3 == var2) {
                        break L3;
                      } else {
                        if (4 == var2) {
                          break L3;
                        } else {
                          L4: {
                            if ((var2 ^ -1) != -6) {
                              break L4;
                            } else {
                              L5: {
                                var3_long = ((k) ((Object) var1_ref)).a((byte) -30);
                                var16 = ((k) ((Object) var1_ref)).f((byte) -76);
                                var15 = ((k) ((Object) var1_ref)).f((byte) -50);
                                var17 = ((k) ((Object) var1_ref)).f((byte) -61);
                                var8_ref_dm = en.a((byte) 50, var3_long);
                                if (var15.equals("")) {
                                  stackOut_11_0 = 0;
                                  stackIn_12_0 = stackOut_11_0;
                                  break L5;
                                } else {
                                  stackOut_10_0 = 1;
                                  stackIn_12_0 = stackOut_10_0;
                                  break L5;
                                }
                              }
                              L6: {
                                L7: {
                                  var9 = stackIn_12_0;
                                  if (var8_ref_dm != null) {
                                    break L7;
                                  } else {
                                    var8_ref_dm = new dm(var16, var17, var3_long);
                                    hq.field_c.a(param0 + 2060, var8_ref_dm, var3_long);
                                    if (var11 == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                if (var9 == 0) {
                                  break L6;
                                } else {
                                  var8_ref_dm.a(var16, var17, 43);
                                  break L6;
                                }
                              }
                              L8: {
                                var8_ref_dm.field_Kb = bl.a((byte) 98) - (long)((k) ((Object) var1_ref)).i(-1478490344);
                                var8_ref_dm.field_Mb = ((k) ((Object) var1_ref)).d((byte) 69);
                                var10 = ((k) ((Object) var1_ref)).a(param0 ^ -2061);
                                stackOut_16_0 = (dm) (var8_ref_dm);
                                stackIn_18_0 = stackOut_16_0;
                                stackIn_17_0 = stackOut_16_0;
                                if ((1 & var10) == 0) {
                                  stackOut_18_0 = (dm) ((Object) stackIn_18_0);
                                  stackOut_18_1 = 0;
                                  stackIn_19_0 = stackOut_18_0;
                                  stackIn_19_1 = stackOut_18_1;
                                  break L8;
                                } else {
                                  stackOut_17_0 = (dm) ((Object) stackIn_17_0);
                                  stackOut_17_1 = 1;
                                  stackIn_19_0 = stackOut_17_0;
                                  stackIn_19_1 = stackOut_17_1;
                                  break L8;
                                }
                              }
                              stackIn_19_0.field_Nb = stackIn_19_1 != 0;
                              var8_ref_dm.field_Sb = var10 >> -178928735;
                              var8_ref_dm.field_Yb = ((k) ((Object) var1_ref)).g(31365);
                              var8_ref_dm.field_Vb = ((k) ((Object) var1_ref)).g(param0 + 33426);
                              lf.a(var8_ref_dm, true);
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                          L9: {
                            if (6 != var2) {
                              break L9;
                            } else {
                              L10: {
                                var3_long = ((k) ((Object) var1_ref)).a((byte) -30);
                                var5 = ((k) ((Object) var1_ref)).g(31365);
                                var18 = en.a((byte) 50, var3_long);
                                if (var18 != null) {
                                  L11: {
                                    if (!var18.field_Ob) {
                                      break L11;
                                    } else {
                                      cb.field_i = cb.field_i - 1;
                                      var18.field_Ob = false;
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    L13: {
                                      if (0 != var5) {
                                        break L13;
                                      } else {
                                        var18.a(true);
                                        if (var11 == 0) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    var18.field_bc = so.field_r;
                                    var18.field_Fb = var5;
                                    break L12;
                                  }
                                  var18.a(-4564);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L14: {
                            if (7 == var2) {
                              break L14;
                            } else {
                              L15: {
                                if ((var2 ^ -1) == -9) {
                                  break L15;
                                } else {
                                  L16: {
                                    if (-10 == (var2 ^ -1)) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if ((var2 ^ -1) == -11) {
                                          break L17;
                                        } else {
                                          L18: {
                                            L19: {
                                              if (-12 == (var2 ^ -1)) {
                                                break L19;
                                              } else {
                                                if (var2 != 12) {
                                                  break L18;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            L20: {
                                              var3 = ((k) ((Object) var1_ref)).d((byte) 69);
                                              var27 = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                              if (var27 != null) {
                                                L21: {
                                                  L22: {
                                                    if (-12 == (var2 ^ -1)) {
                                                      break L22;
                                                    } else {
                                                      var27.field_rc = true;
                                                      if (var11 == 0) {
                                                        break L21;
                                                      } else {
                                                        break L22;
                                                      }
                                                    }
                                                  }
                                                  var27.field_lc = true;
                                                  break L21;
                                                }
                                                mi.a(var27, -126);
                                                break L20;
                                              } else {
                                                break L20;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L2;
                                            } else {
                                              break L18;
                                            }
                                          }
                                          L23: {
                                            if (var2 == 13) {
                                              break L23;
                                            } else {
                                              L24: {
                                                if (-15 == (var2 ^ -1)) {
                                                  break L24;
                                                } else {
                                                  if (var2 == 16) {
                                                    break L24;
                                                  } else {
                                                    L25: {
                                                      L26: {
                                                        if ((var2 ^ -1) == -16) {
                                                          break L26;
                                                        } else {
                                                          if ((var2 ^ -1) != -18) {
                                                            break L25;
                                                          } else {
                                                            break L26;
                                                          }
                                                        }
                                                      }
                                                      L27: {
                                                        var3_long = ((k) ((Object) var1_ref)).a((byte) -30);
                                                        var5 = ((k) ((Object) var1_ref)).g(param0 + 33426);
                                                        var20 = en.a((byte) 50, var3_long);
                                                        if (var20 != null) {
                                                          L28: {
                                                            L29: {
                                                              if (var2 != 15) {
                                                                break L29;
                                                              } else {
                                                                var20.field_Pb = false;
                                                                if (var11 == 0) {
                                                                  break L28;
                                                                } else {
                                                                  break L29;
                                                                }
                                                              }
                                                            }
                                                            if (var20.field_Ob) {
                                                              var20.field_Ob = false;
                                                              cb.field_i = cb.field_i - 1;
                                                              break L28;
                                                            } else {
                                                              break L28;
                                                            }
                                                          }
                                                          L30: {
                                                            if (var5 != 0) {
                                                              var20.field_bc = so.field_r;
                                                              var20.field_Fb = var5;
                                                              break L30;
                                                            } else {
                                                              break L30;
                                                            }
                                                          }
                                                          lf.a(var20, true);
                                                          break L27;
                                                        } else {
                                                          break L27;
                                                        }
                                                      }
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L25;
                                                      }
                                                    }
                                                    L31: {
                                                      if (var2 == 18) {
                                                        break L31;
                                                      } else {
                                                        L32: {
                                                          if (-20 != (var2 ^ -1)) {
                                                            break L32;
                                                          } else {
                                                            L33: {
                                                              var3_long = ((k) ((Object) var1_ref)).a((byte) -30);
                                                              var5 = ((k) ((Object) var1_ref)).g(31365);
                                                              var21 = vm.a(var3_long, (byte) -54);
                                                              if (var21 == null) {
                                                                break L33;
                                                              } else {
                                                                L34: {
                                                                  if (-1 != (var5 ^ -1)) {
                                                                    var21.field_Fb = var5;
                                                                    var21.field_bc = so.field_r;
                                                                    if (var11 == 0) {
                                                                      break L34;
                                                                    } else {
                                                                      var21.a(true);
                                                                      break L34;
                                                                    }
                                                                  } else {
                                                                    var21.a(true);
                                                                    break L34;
                                                                  }
                                                                }
                                                                var21.a(param0 ^ 6623);
                                                                mh.field_c.field_cc = mh.field_c.field_cc - 1;
                                                                break L33;
                                                              }
                                                            }
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L32;
                                                            }
                                                          }
                                                        }
                                                        L35: {
                                                          if (-21 == (var2 ^ -1)) {
                                                            break L35;
                                                          } else {
                                                            L36: {
                                                              if (-22 == (var2 ^ -1)) {
                                                                break L36;
                                                              } else {
                                                                L37: {
                                                                  if (22 != var2) {
                                                                    break L37;
                                                                  } else {
                                                                    bc.field_e = ((k) ((Object) var1_ref)).d((byte) 69);
                                                                    dm.field_Zb = ((k) ((Object) var1_ref)).a(param0 + 2061);
                                                                    if (var11 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L37;
                                                                    }
                                                                  }
                                                                }
                                                                L38: {
                                                                  if (var2 != 23) {
                                                                    break L38;
                                                                  } else {
                                                                    ie.field_sb = ((k) ((Object) var1_ref)).a((byte) -30);
                                                                    if (var11 == 0) {
                                                                      break L2;
                                                                    } else {
                                                                      break L38;
                                                                    }
                                                                  }
                                                                }
                                                                bd.a("L1: " + ci.a(0), (Throwable) null, false);
                                                                ak.a((byte) -125);
                                                                if (var11 == 0) {
                                                                  break L2;
                                                                } else {
                                                                  break L36;
                                                                }
                                                              }
                                                            }
                                                            L39: {
                                                              L40: {
                                                                var3 = ((k) ((Object) var1_ref)).d((byte) 69);
                                                                if (-1 != (var3 ^ -1)) {
                                                                  break L40;
                                                                } else {
                                                                  qi.field_c = 0L;
                                                                  if (var11 == 0) {
                                                                    break L39;
                                                                  } else {
                                                                    break L40;
                                                                  }
                                                                }
                                                              }
                                                              qi.field_c = bl.a((byte) 97) - -(long)var3;
                                                              break L39;
                                                            }
                                                            if (var11 == 0) {
                                                              break L2;
                                                            } else {
                                                              break L35;
                                                            }
                                                          }
                                                        }
                                                        dl.a(mh.field_c, false, var1_ref, false);
                                                        if (var11 == 0) {
                                                          break L2;
                                                        } else {
                                                          break L31;
                                                        }
                                                      }
                                                    }
                                                    L41: {
                                                      var3_long = ((k) ((Object) var1_ref)).a((byte) -30);
                                                      var22 = ((k) ((Object) var1_ref)).f((byte) -27);
                                                      var23 = ((k) ((Object) var1_ref)).f((byte) -125);
                                                      var7 = vm.a(var3_long, (byte) -99);
                                                      if (var7 == null) {
                                                        var7 = new dm(var22, var23, var3_long);
                                                        kp.field_o.a(-1, var7, var3_long);
                                                        mh.field_c.field_cc = mh.field_c.field_cc + 1;
                                                        break L41;
                                                      } else {
                                                        break L41;
                                                      }
                                                    }
                                                    L42: {
                                                      var7.field_Mb = ((k) ((Object) var1_ref)).d((byte) 69);
                                                      var8 = ((k) ((Object) var1_ref)).a(0);
                                                      var7.field_Sb = var8 >> 573625729;
                                                      stackOut_95_0 = (dm) (var7);
                                                      stackIn_97_0 = stackOut_95_0;
                                                      stackIn_96_0 = stackOut_95_0;
                                                      if (-1 == (1 & var8 ^ -1)) {
                                                        stackOut_97_0 = (dm) ((Object) stackIn_97_0);
                                                        stackOut_97_1 = 0;
                                                        stackIn_98_0 = stackOut_97_0;
                                                        stackIn_98_1 = stackOut_97_1;
                                                        break L42;
                                                      } else {
                                                        stackOut_96_0 = (dm) ((Object) stackIn_96_0);
                                                        stackOut_96_1 = 1;
                                                        stackIn_98_0 = stackOut_96_0;
                                                        stackIn_98_1 = stackOut_96_1;
                                                        break L42;
                                                      }
                                                    }
                                                    stackIn_98_0.field_Nb = stackIn_98_1 != 0;
                                                    var7.field_Yb = ((k) ((Object) var1_ref)).g(31365);
                                                    var7.field_Vb = ((k) ((Object) var1_ref)).g(31365);
                                                    nh.field_g.a(var7, false);
                                                    if (var11 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L24;
                                                    }
                                                  }
                                                }
                                              }
                                              L43: {
                                                var3_long = ((k) ((Object) var1_ref)).a((byte) -30);
                                                var24 = en.a((byte) 50, var3_long);
                                                if (var24 != null) {
                                                  L44: {
                                                    L45: {
                                                      if (14 == var2) {
                                                        break L45;
                                                      } else {
                                                        if (var24.field_Ob) {
                                                          break L44;
                                                        } else {
                                                          cb.field_i = cb.field_i + 1;
                                                          var24.field_Ob = true;
                                                          if (var11 == 0) {
                                                            break L44;
                                                          } else {
                                                            break L45;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    var24.field_Pb = true;
                                                    break L44;
                                                  }
                                                  lf.a(var24, true);
                                                  break L43;
                                                } else {
                                                  break L43;
                                                }
                                              }
                                              if (var11 == 0) {
                                                break L2;
                                              } else {
                                                break L23;
                                              }
                                            }
                                          }
                                          L46: {
                                            var3 = ((k) ((Object) var1_ref)).d((byte) 69);
                                            var4_int = ((k) ((Object) var1_ref)).g(param0 + 33426);
                                            var25_ref = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                            if (var25_ref == null) {
                                              break L46;
                                            } else {
                                              L47: {
                                                var14 = var25_ref;
                                                var25_ref.field_rc = false;
                                                if (var4_int == 0) {
                                                  break L47;
                                                } else {
                                                  var25_ref.field_Jb = so.field_r;
                                                  var25_ref.field_Vb = var4_int;
                                                  break L47;
                                                }
                                              }
                                              var14.field_lc = false;
                                              mi.a(var25_ref, -57);
                                              break L46;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      var3_ref_jh = (jh) ((Object) tn.field_C.c(param0 + 2175));
                                      L48: while (true) {
                                        L49: {
                                          if (var3_ref_jh == null) {
                                            break L49;
                                          } else {
                                            var3_ref_jh.a(true);
                                            var3_ref_jh.a(param0 ^ 6623);
                                            var3_ref_jh = (jh) ((Object) tn.field_C.b(param0 + 2067));
                                            if (var11 != 0) {
                                              break L2;
                                            } else {
                                              if (var11 == 0) {
                                                continue L48;
                                              } else {
                                                break L49;
                                              }
                                            }
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
                                  L50: {
                                    var3 = ((k) ((Object) var1_ref)).d((byte) 69);
                                    var4_int = ((k) ((Object) var1_ref)).g(31365);
                                    var28 = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                    if (var28 != null) {
                                      L51: {
                                        if (-1 != (var4_int ^ -1)) {
                                          var28.field_Jb = so.field_r;
                                          var28.field_Vb = var4_int;
                                          if (var11 == 0) {
                                            break L51;
                                          } else {
                                            var28.a(true);
                                            break L51;
                                          }
                                        } else {
                                          var28.a(true);
                                          break L51;
                                        }
                                      }
                                      var28.a(-4564);
                                      break L50;
                                    } else {
                                      break L50;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L2;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              L52: {
                                var3 = ((k) ((Object) var1_ref)).d((byte) 69);
                                var4 = (jh) ((Object) af.field_h.a((long)var3, -22877));
                                if (var4 != null) {
                                  break L52;
                                } else {
                                  var4 = new jh(kj.field_h);
                                  af.field_h.a(-1, var4, (long)var3);
                                  break L52;
                                }
                              }
                              dl.a(var4, true, var1_ref, false);
                              mi.a(var4, param0 ^ 2144);
                              if (var11 == 0) {
                                break L2;
                              } else {
                                break L14;
                              }
                            }
                          }
                          var3_ref_dm = (dm) ((Object) cg.field_i.c(66));
                          L53: while (true) {
                            L54: {
                              L55: {
                                if (var3_ref_dm == null) {
                                  break L55;
                                } else {
                                  var3_ref_dm.a(true);
                                  var3_ref_dm.a(-4564);
                                  var3_ref_dm = (dm) ((Object) cg.field_i.b(param0 + 2067));
                                  if (var11 != 0) {
                                    break L54;
                                  } else {
                                    if (var11 == 0) {
                                      continue L53;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                              }
                              cb.field_i = 0;
                              break L54;
                            }
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
              }
              var3_ref_dm = (dm) ((Object) nh.field_g.c(113));
              L56: while (true) {
                L57: {
                  L58: {
                    if (var3_ref_dm == null) {
                      break L58;
                    } else {
                      var3_ref_dm.a(true);
                      var3_ref_dm.a(-4564);
                      var3_ref_dm = (dm) ((Object) nh.field_g.b(6));
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
                  var3_ref_dm = (dm) ((Object) hq.field_c.a((byte) 7));
                  break L57;
                }
                L59: while (true) {
                  L60: {
                    L61: {
                      if (var3_ref_dm == null) {
                        break L61;
                      } else {
                        stackOut_145_0 = var3_ref_dm.field_Pb;
                        stackIn_154_0 = stackOut_145_0 ? 1 : 0;
                        stackIn_146_0 = stackOut_145_0;
                        if (var11 != 0) {
                          break L60;
                        } else {
                          L62: {
                            L63: {
                              if (stackIn_146_0) {
                                break L63;
                              } else {
                                if (var3_ref_dm.field_Ob) {
                                  break L63;
                                } else {
                                  break L62;
                                }
                              }
                            }
                            L64: {
                              if (!var3_ref_dm.field_Ob) {
                                break L64;
                              } else {
                                cb.field_i = cb.field_i - 1;
                                var3_ref_dm.field_Ob = false;
                                break L64;
                              }
                            }
                            var3_ref_dm.field_Pb = false;
                            lf.a(var3_ref_dm, true);
                            break L62;
                          }
                          var3_ref_dm = (dm) ((Object) hq.field_c.c((byte) 123));
                          if (var11 == 0) {
                            continue L59;
                          } else {
                            break L61;
                          }
                        }
                      }
                    }
                    stackOut_153_0 = -2;
                    stackIn_154_0 = stackOut_153_0;
                    break L60;
                  }
                  L65: {
                    if (stackIn_154_0 != (var2 ^ -1)) {
                      break L65;
                    } else {
                      if (null == mh.field_c) {
                        break L65;
                      } else {
                        sb.field_k = mh.field_c.field_Nb;
                        break L65;
                      }
                    }
                  }
                  L66: {
                    L67: {
                      if (var2 == 4) {
                        break L67;
                      } else {
                        mh.field_c = null;
                        if (var11 == 0) {
                          break L66;
                        } else {
                          break L67;
                        }
                      }
                    }
                    var3 = ((k) ((Object) var1_ref)).d((byte) 69);
                    mh.field_c = new jh(kj.field_h);
                    mh.field_c.a((byte) -85, (long)var3);
                    dl.a(mh.field_c, false, var1_ref, false);
                    qi.field_c = 0L;
                    break L66;
                  }
                  L68: {
                    L69: {
                      if (-3 == (var2 ^ -1)) {
                        break L69;
                      } else {
                        if (-4 == (var2 ^ -1)) {
                          break L69;
                        } else {
                          ej.field_n = null;
                          break L68;
                        }
                      }
                    }
                    if (null != ej.field_n) {
                      break L68;
                    } else {
                      ej.field_n = new jh(kj.field_h);
                      if (var11 == 0) {
                        break L68;
                      } else {
                        ej.field_n = null;
                        break L68;
                      }
                    }
                  }
                  L70: {
                    if (var2 == 3) {
                      break L70;
                    } else {
                      la.field_k = false;
                      if (var11 == 0) {
                        break L2;
                      } else {
                        break L70;
                      }
                    }
                  }
                  la.field_k = true;
                  var3 = 0;
                  L71: while (true) {
                    L72: {
                      if (fg.field_k.length <= var3) {
                        pb.field_h = ((k) ((Object) var1_ref)).g(31365);
                        sc.field_f = ((k) ((Object) var1_ref)).g(31365);
                        break L72;
                      } else {
                        fg.field_k[var3] = ((k) ((Object) var13)).d(param0 + -249697519);
                        var3++;
                        if (var11 != 0) {
                          break L72;
                        } else {
                          continue L71;
                        }
                      }
                    }
                    var3 = 0;
                    L73: while (true) {
                      if (var3 >= tg.field_a.length) {
                        break L2;
                      } else {
                        tg.field_a[var3] = ((k) ((Object) var13)).d(-249699580);
                        var3++;
                        if (var11 != 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          continue L73;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ck.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != null) {
                var3_int = param2.length();
                if (-13 < (var3_int ^ -1)) {
                  if (eb.a((byte) 64, param0)) {
                    L2: {
                      if (-1 == (var3_int ^ -1)) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L2;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L2;
                      }
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    return true;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
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
