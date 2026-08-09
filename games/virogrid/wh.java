/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wh {
    static rm[] field_b;
    static km field_d;
    static km field_a;
    static int[] field_c;

    abstract void a(byte[] param0, byte param1);

    final static int a(byte param0) {
        if (param0 != 5) {
            wh.a(109);
        }
        return (int)(1000000000L / hd.field_f);
    }

    final static int a(int param0, boolean param1, int param2, boolean param3, String param4, uh param5, uh param6) {
        int stackIn_6_0 = 0;
        jc stackIn_11_0 = null;
        jc stackIn_12_0 = null;
        String stackIn_12_1 = null;
        jc stackIn_14_0 = null;
        jc stackIn_15_0 = null;
        String stackIn_15_1 = null;
        int stackIn_32_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        int var10 = 0;
        String var11_ref_String = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        CharSequence var15 = null;
        var13 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var14 = param5.b(-127);
              var8 = param6.b(-127);
              if (oj.field_Ub == null) {
                if (!ce.a(-111, false)) {
                  stackIn_6_0 = -1;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L2: {
              if (ul.field_c != ug.field_a) {
                break L2;
              } else {
                L3: {
                  ia.field_b = null;
                  gk.field_g.field_l = 0;
                  if (param4 != null) {
                    L4: {
                      var9 = 0;
                      gg.field_D.field_l = 0;
                      if (!param1) {
                        break L4;
                      } else {
                        var9 = var9 | 1;
                        break L4;
                      }
                    }
                    L5: {
                      gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
                      gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
                      gg.field_D.b(var14, (byte) -87);
                      gg.field_D.b(var8, (byte) -125);
                      var15 = (CharSequence) ((Object) param4);
                      gg.field_D.b(na.a((byte) 51, var15), (byte) 118);
                      gg.field_D.a((byte) -88, param0);
                      gg.field_D.a(param2, -69);
                      gg.field_D.a(var9, -66);
                      gk.field_g.a(18, 105);
                      gk.field_g.field_l = gk.field_g.field_l + 2;
                      var10 = gk.field_g.field_l;
                      var11_ref_String = sh.b(-25, mb.g((byte) 41));
                      if (var11_ref_String == null) {
                        var11_ref_String = "";
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    gk.field_g.a(var11_ref_String, (byte) -75);
                    nl.a(on.field_a, gg.field_D, gk.field_g, ch.field_i, 0);
                    gk.field_g.c(-var10 + gk.field_g.field_l, -3991);
                    break L3;
                  } else {
                    L6: {
                      gg.field_D.field_l = 0;
                      gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
                      gg.field_D.a(mc.field_c.nextInt(), (byte) -42);
                      stackIn_11_0 = gg.field_D;

                      if (param5.a(0)) {
                        stackIn_12_0 = (jc) ((Object) stackIn_11_0);
                        stackIn_12_1 = (String) (var14);
                        break L6;
                      } else {
                        stackIn_12_0 = (jc) ((Object) stackIn_11_0);
                        stackIn_12_1 = "";
                        break L6;
                      }
                    }
                    L7: {
                      ((jc) (Object) stackIn_12_0).b(stackIn_12_1, (byte) 109);
                      stackIn_14_0 = gg.field_D;

                      if (!param6.a(0)) {
                        stackIn_15_0 = (jc) ((Object) stackIn_14_0);
                        stackIn_15_1 = "";
                        break L7;
                      } else {
                        stackIn_15_0 = (jc) ((Object) stackIn_14_0);
                        stackIn_15_1 = (String) (var8);
                        break L7;
                      }
                    }
                    ((jc) (Object) stackIn_15_0).b(stackIn_15_1, (byte) -32);
                    gk.field_g.a(16, -90);
                    gk.field_g.field_l = gk.field_g.field_l + 1;
                    var9 = gk.field_g.field_l;
                    nl.a(on.field_a, gg.field_D, gk.field_g, ch.field_i, 0);
                    gk.field_g.b(gk.field_g.field_l + -var9, -1);
                    break L3;
                  }
                }
                al.b(-1, -1);
                ug.field_a = me.field_e;
                break L2;
              }
            }
            L8: {
              if (me.field_e == ug.field_a) {
                if (wg.a(1, 0)) {
                  L9: {
                    var9 = sh.field_qb.g(11132);
                    sh.field_qb.field_l = 0;
                    if (100 > var9) {
                      break L9;
                    } else {
                      if (105 < var9) {
                        break L9;
                      } else {
                        jf.field_b = new String[-100 + var9];
                        ug.field_a = kk.field_n;
                        break L8;
                      }
                    }
                  }
                  if (-249 != (var9 ^ -1)) {
                    if (99 == var9) {
                      wg.a(bl.f(0), 0);
                      ia.field_b = new Boolean(mk.a(sh.field_qb, -87));
                      sh.field_qb.field_l = 0;
                      break L8;
                    } else {
                      ci.field_q = var9;
                      ba.field_a = -1;
                      ug.field_a = k.field_a;
                      break L8;
                    }
                  } else {
                    sj.a(mb.g((byte) -112), 20298);
                    ld.field_g = wf.field_a;
                    tn.a(false);
                    fh.field_e = false;
                    stackIn_32_0 = var9;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            L10: {
              if (kk.field_n != ug.field_a) {
                break L10;
              } else {
                var9 = 2;
                if (!wg.a(var9, 0)) {
                  break L10;
                } else {
                  var10 = sh.field_qb.c((byte) -45);
                  sh.field_qb.field_l = 0;
                  if (!wg.a(var10, 0)) {
                    break L10;
                  } else {
                    var11 = jf.field_b.length;
                    var12 = 0;
                    L11: while (true) {
                      if (var12 >= var11) {
                        tn.a(false);
                        fh.field_e = false;
                        stackIn_43_0 = 100 + var11;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        jf.field_b[var12] = sh.field_qb.i(15070);
                        var12++;
                        continue L11;
                      }
                    }
                  }
                }
              }
            }
            L12: {
              if (param3) {
                break L12;
              } else {
                field_c = (int[]) null;
                break L12;
              }
            }
            L13: {
              if (k.field_a == ug.field_a) {
                if (!ic.c((byte) 48)) {
                  break L13;
                } else {
                  L14: {
                    if (255 != ci.field_q) {
                      ld.field_g = sh.field_qb.h(-118);
                      break L14;
                    } else {
                      var9_ref_String = sh.field_qb.f(123);
                      if (var9_ref_String == null) {
                        break L14;
                      } else {
                        jd.a(-51, var9_ref_String, mb.g((byte) 37));
                        break L14;
                      }
                    }
                  }
                  tn.a(false);
                  fh.field_e = false;
                  stackIn_54_0 = ci.field_q;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              } else {
                break L13;
              }
            }
            L15: {
              if (oj.field_Ub == null) {
                if (!fh.field_e) {
                  var9 = uh.field_b;
                  uh.field_b = tn.field_i;
                  tn.field_i = var9;
                  fh.field_e = true;
                  break L15;
                } else {
                  L16: {
                    if (30000L >= af.b(-126)) {
                      ld.field_g = ll.field_a;
                      break L16;
                    } else {
                      ld.field_g = wa.field_L;
                      break L16;
                    }
                  }
                  fh.field_e = false;
                  stackIn_62_0 = 249;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                break L15;
              }
            }
            stackIn_65_0 = -1;
            decompiledRegionSelector0 = 5;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var7 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var7);

            stackIn_68_1 = new StringBuilder().append("wh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L17;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L17;
            }
          }
          L18: {


            stackIn_71_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param5 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "null";
              break L18;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_72_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackIn_72_2 = "{...}";
              break L18;
            }
          }
          L19: {


            stackIn_74_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(',');

            if (param6 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "null";
              break L19;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
              stackIn_75_2 = "{...}";
              break L19;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_69_0), stackIn_75_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_43_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_54_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_62_0;
                } else {
                  return stackIn_65_0;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -23862) {
            field_b = (rm[]) null;
        }
    }

    abstract byte[] b(int param0);

    final static void a(int param0, boolean param1, int param2) {
        int stackIn_58_0 = 0;
        int stackIn_120_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          var3 = param2;
          if (0 != var3) {
            if ((var3 ^ -1) == -25) {
              var3 = param1 ? 1 : 0;
              gb.a(-2, 0, var3 != 0, -3);
              ka.a(false, (byte) 87);
              break L0;
            } else {
              if ((var3 ^ -1) != -2) {
                if (2 == var3) {
                  vm.a((byte) 30, af.field_k);
                  ec.field_z = ai.field_c;
                  em.field_c = kg.field_a;
                  jk.field_c = 2;
                  ka.a(false, (byte) 87);
                  var3 = param1 ? 1 : 0;
                  gb.a(-2, 0, var3 != 0, -1);
                  break L0;
                } else {
                  if ((var3 ^ -1) == -8) {
                    L1: {
                      L2: {
                        vm.a((byte) 30, ih.field_d);
                        var3 = param1 ? 1 : 0;
                        var4 = bd.field_e;
                        if (0 == hm.field_c) {
                          break L2;
                        } else {
                          if (-3 == (i.field_y ^ -1)) {
                            break L2;
                          } else {
                            if (3 == i.field_y) {
                              break L2;
                            } else {
                              if ((hm.field_c ^ -1) == -5) {
                                break L2;
                              } else {
                                if ((hm.field_c ^ -1) == -6) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                      var4 = hm.field_c;
                      break L1;
                    }
                    gb.a(-2, var4, var3 != 0, 0);
                    break L0;
                  } else {
                    if ((var3 ^ -1) != -4) {
                      if (-6 != (var3 ^ -1)) {
                        if ((var3 ^ -1) == -9) {
                          if (-11 != (i.field_y ^ -1)) {
                            L3: {
                              L4: {
                                vm.a((byte) 30, ih.field_d);
                                var3 = bd.field_e;
                                var4 = param1 ? 1 : 0;
                                var5 = bd.field_e;
                                if (0 == hm.field_c) {
                                  break L4;
                                } else {
                                  if (2 == i.field_y) {
                                    break L4;
                                  } else {
                                    if (-4 == (i.field_y ^ -1)) {
                                      break L4;
                                    } else {
                                      if (hm.field_c == 4) {
                                        break L4;
                                      } else {
                                        if ((hm.field_c ^ -1) != -6) {
                                          break L3;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var5 = hm.field_c;
                              break L3;
                            }
                            gb.a(-2, var5, var4 != 0, var3);
                            break L0;
                          } else {
                            el.a(12229, param1);
                            break L0;
                          }
                        } else {
                          if (-5 != (var3 ^ -1)) {
                            if ((var3 ^ -1) != -15) {
                              if ((var3 ^ -1) == -16) {
                                break L0;
                              } else {
                                if (16 != var3) {
                                  if (var3 != 17) {
                                    if (-29 == (var3 ^ -1)) {
                                      break L0;
                                    } else {
                                      if (-26 == (var3 ^ -1)) {
                                        break L0;
                                      } else {
                                        if (-27 != (var3 ^ -1)) {
                                          if (var3 == 27) {
                                            break L0;
                                          } else {
                                            if (6 != var3) {
                                              if (9 == var3) {
                                                ka.a(true, (byte) 87);
                                                vm.field_e = false;
                                                th.field_q = true;
                                                vg.field_I.a((byte) -70, param1);
                                                break L0;
                                              } else {
                                                if (10 != var3) {
                                                  if ((var3 ^ -1) == -12) {
                                                    vg.field_I.b((byte) -45);
                                                    var3 = param1 ? 1 : 0;
                                                    gb.a(-2, 0, var3 != 0, -1);
                                                    break L0;
                                                  } else {
                                                    if ((var3 ^ -1) == -19) {
                                                      vg.field_I.a((byte) 70);
                                                      var3 = param1 ? 1 : 0;
                                                      gb.a(-2, 0, var3 != 0, -1);
                                                      break L0;
                                                    } else {
                                                      if (var3 != 19) {
                                                        if ((var3 ^ -1) == -13) {
                                                          L5: {
                                                            ka.a(true, (byte) 87);
                                                            if (dd.field_a) {
                                                              L6: {
                                                                L7: {
                                                                  var3 = param1 ? 1 : 0;
                                                                  var4 = bd.field_e;
                                                                  if (hm.field_c == 0) {
                                                                    break L7;
                                                                  } else {
                                                                    if (2 == i.field_y) {
                                                                      break L7;
                                                                    } else {
                                                                      if ((i.field_y ^ -1) == -4) {
                                                                        break L7;
                                                                      } else {
                                                                        if (hm.field_c == 4) {
                                                                          break L7;
                                                                        } else {
                                                                          if ((hm.field_c ^ -1) == -6) {
                                                                            break L7;
                                                                          } else {
                                                                            break L6;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                                var4 = hm.field_c;
                                                                break L6;
                                                              }
                                                              gb.a(-2, var4, var3 != 0, -5);
                                                              break L5;
                                                            } else {
                                                              break L5;
                                                            }
                                                          }
                                                          if (on.field_d) {
                                                            sb.a(0, 11, param0 + 12440);
                                                            break L0;
                                                          } else {
                                                            break L0;
                                                          }
                                                        } else {
                                                          if (20 == var3) {
                                                            uk.field_c = 0;
                                                            break L0;
                                                          } else {
                                                            if (21 != var3) {
                                                              if ((var3 ^ -1) != -23) {
                                                                if ((var3 ^ -1) != -14) {
                                                                  if (-24 != (var3 ^ -1)) {
                                                                    break L0;
                                                                  } else {
                                                                    L8: {
                                                                      L9: {
                                                                        vm.a((byte) 30, ih.field_d);
                                                                        var3 = param1 ? 1 : 0;
                                                                        var4 = bd.field_e;
                                                                        if (-1 == (hm.field_c ^ -1)) {
                                                                          break L9;
                                                                        } else {
                                                                          if (-3 == (i.field_y ^ -1)) {
                                                                            break L9;
                                                                          } else {
                                                                            if ((i.field_y ^ -1) == -4) {
                                                                              break L9;
                                                                            } else {
                                                                              if (4 == hm.field_c) {
                                                                                break L9;
                                                                              } else {
                                                                                if (hm.field_c == 5) {
                                                                                  break L9;
                                                                                } else {
                                                                                  break L8;
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                      var4 = hm.field_c;
                                                                      break L8;
                                                                    }
                                                                    gb.a(-2, var4, var3 != 0, 1);
                                                                    break L0;
                                                                  }
                                                                } else {
                                                                  ha.a((byte) 39, mb.g((byte) -125));
                                                                  break L0;
                                                                }
                                                              } else {
                                                                L10: {
                                                                  a.field_D = false;
                                                                  if (i.field_y == 8) {
                                                                    break L10;
                                                                  } else {
                                                                    if (i.field_y != 6) {
                                                                      break L0;
                                                                    } else {
                                                                      break L10;
                                                                    }
                                                                  }
                                                                }
                                                                gn.a((byte) 86, qe.field_l, i.field_y);
                                                                break L0;
                                                              }
                                                            } else {
                                                              uk.field_c = 1;
                                                              break L0;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L11: {
                                                          vm.a((byte) 30, ih.field_d);
                                                          if (nf.field_g == 0) {
                                                            stackIn_120_0 = 1;
                                                            break L11;
                                                          } else {
                                                            stackIn_120_0 = 0;
                                                            break L11;
                                                          }
                                                        }
                                                        pg.field_g = stackIn_120_0;
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  vg.field_I.c(param0 + -2035);
                                                  var3 = param1 ? 1 : 0;
                                                  gb.a(-2, 0, var3 != 0, -1);
                                                  break L0;
                                                }
                                              }
                                            } else {
                                              if (null != ih.field_b) {
                                                am.a((byte) -16);
                                                break L0;
                                              } else {
                                                var3 = param1 ? 1 : 0;
                                                a.field_D = false;
                                                ic.a(ib.field_b, hd.field_b.field_A, 320, ib.field_b, 8, mc.field_b, 2, hd.field_b.field_A + hd.field_b.field_G, 8, -16824, var3 != 0, 240);
                                                break L0;
                                              }
                                            }
                                          }
                                        } else {
                                          break L0;
                                        }
                                      }
                                    }
                                  } else {
                                    break L0;
                                  }
                                } else {
                                  break L0;
                                }
                              }
                            } else {
                              break L0;
                            }
                          } else {
                            L12: {
                              L13: {
                                vm.a((byte) 30, ih.field_d);
                                var3 = param1 ? 1 : 0;
                                var4 = bd.field_e;
                                if (0 == hm.field_c) {
                                  break L13;
                                } else {
                                  if (-3 == (i.field_y ^ -1)) {
                                    break L13;
                                  } else {
                                    if (3 == i.field_y) {
                                      break L13;
                                    } else {
                                      if (4 == hm.field_c) {
                                        break L13;
                                      } else {
                                        if (5 != hm.field_c) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              var4 = hm.field_c;
                              break L12;
                            }
                            gb.a(-2, var4, var3 != 0, 6);
                            break L0;
                          }
                        }
                      } else {
                        L14: {
                          L15: {
                            vm.a((byte) 30, ih.field_d);
                            pg.field_g = 0;
                            var3 = param1 ? 1 : 0;
                            var4 = bd.field_e;
                            if (-1 == (hm.field_c ^ -1)) {
                              break L15;
                            } else {
                              if (i.field_y == 2) {
                                break L15;
                              } else {
                                if (3 == i.field_y) {
                                  break L15;
                                } else {
                                  if (-5 == (hm.field_c ^ -1)) {
                                    break L15;
                                  } else {
                                    if (-6 != (hm.field_c ^ -1)) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var4 = hm.field_c;
                          break L14;
                        }
                        gb.a(param0 ^ -2096, var4, var3 != 0, 7);
                        break L0;
                      }
                    } else {
                      L16: {
                        L17: {
                          vm.a((byte) 30, ih.field_d);
                          var3 = param1 ? 1 : 0;
                          var4 = bd.field_e;
                          if (hm.field_c == 0) {
                            break L17;
                          } else {
                            if ((i.field_y ^ -1) == -3) {
                              break L17;
                            } else {
                              if (-4 == (i.field_y ^ -1)) {
                                break L17;
                              } else {
                                if (-5 == (hm.field_c ^ -1)) {
                                  break L17;
                                } else {
                                  if (5 != hm.field_c) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4 = hm.field_c;
                        break L16;
                      }
                      gb.a(param0 ^ -2096, var4, var3 != 0, 8);
                      break L0;
                    }
                  }
                }
              } else {
                vm.a((byte) 30, ih.field_d);
                if (!qm.i(20)) {
                  L18: {
                    L19: {
                      var3 = param1 ? 1 : 0;
                      var4 = bd.field_e;
                      if (hm.field_c == 0) {
                        break L19;
                      } else {
                        if (2 == i.field_y) {
                          break L19;
                        } else {
                          if (i.field_y == 3) {
                            break L19;
                          } else {
                            if (4 == hm.field_c) {
                              break L19;
                            } else {
                              if (5 == hm.field_c) {
                                break L19;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                      }
                    }
                    var4 = hm.field_c;
                    break L18;
                  }
                  gb.a(-2, var4, var3 != 0, -4);
                  break L0;
                } else {
                  L20: {
                    a.field_D = false;
                    if (!qm.i(20)) {
                      stackIn_58_0 = 1;
                      break L20;
                    } else {
                      stackIn_58_0 = 0;
                      break L20;
                    }
                  }
                  var3 = stackIn_58_0;
                  hk.a(8, 2, var3, 320, 8, hd.field_b.field_A, true, 240, ib.field_b, (byte) 118, ib.field_b, param1, hd.field_b.field_A - -hd.field_b.field_G, he.field_cc, mc.field_b);
                  break L0;
                }
              }
            }
          } else {
            L21: {
              L22: {
                vm.a((byte) 30, ih.field_d);
                var3 = param1 ? 1 : 0;
                var4 = bd.field_e;
                if (hm.field_c == 0) {
                  break L22;
                } else {
                  if (i.field_y == 2) {
                    break L22;
                  } else {
                    if (3 == i.field_y) {
                      break L22;
                    } else {
                      if (hm.field_c == 4) {
                        break L22;
                      } else {
                        if (5 != hm.field_c) {
                          break L21;
                        } else {
                          break L22;
                        }
                      }
                    }
                  }
                }
              }
              var4 = hm.field_c;
              break L21;
            }
            gb.a(-2, var4, var3 != 0, 11);
            break L0;
          }
        }
        L23: {
          if (param0 == 2094) {
            break L23;
          } else {
            field_c = (int[]) null;
            break L23;
          }
        }
    }

    static {
    }
}
