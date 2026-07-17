/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re implements gj {
    static ko field_c;
    private int field_d;
    static String[] field_b;
    private int field_n;
    private int field_i;
    static int field_k;
    private int field_p;
    private hu field_m;
    private int field_g;
    private int field_f;
    private int field_j;
    private int field_a;
    private int field_e;
    static ot field_o;
    private int field_l;
    private int field_h;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        dg var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        dg stackIn_44_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        dg stackOut_43_0 = null;
        dg stackOut_42_0 = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              var1_int = uq.field_c;
              var2 = 0;
              if (ck.field_a == 2) {
                var3_long = -va.field_o + nj.a(-50);
                var2 = (int)((10999L - var3_long) / 1000L);
                if (var2 < 0) {
                  var2 = 0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (eq.field_c.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = dk.field_g[var3];
                  if (0 > var4) {
                    var5 = du.field_k;
                    break L3;
                  } else {
                    if (var4 != ll.field_k.field_e) {
                      var5 = wt.field_v;
                      break L3;
                    } else {
                      var5 = fb.field_R;
                      break L3;
                    }
                  }
                }
                L4: {
                  var6 = eq.field_c[var3];
                  if (ck.field_a != 2) {
                    break L4;
                  } else {
                    if (1 != var2) {
                      break L4;
                    } else {
                      L5: {
                        if (pn.field_D.length <= dn.field_Eb.length) {
                          stackOut_17_0 = dn.field_Eb.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = pn.field_D.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_18_0;
                        if (pg.field_a.length < cg.field_E.length) {
                          stackOut_20_0 = cg.field_E.length;
                          stackIn_21_0 = stackOut_20_0;
                          break L6;
                        } else {
                          stackOut_19_0 = pg.field_a.length;
                          stackIn_21_0 = stackOut_19_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_21_0;
                        if (6 > var3) {
                          break L7;
                        } else {
                          if (var3 >= var7 + 6) {
                            break L7;
                          } else {
                            L8: {
                              if (-6 + var3 - (-dn.field_Eb.length + var7) >= 0) {
                                stackOut_25_0 = dn.field_Eb[-var7 + -6 + (var3 + dn.field_Eb.length)];
                                stackIn_26_0 = stackOut_25_0;
                                break L8;
                              } else {
                                stackOut_24_0 = "";
                                stackIn_26_0 = stackOut_24_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L7;
                          }
                        }
                      }
                      if (var3 < var7 + 7) {
                        break L4;
                      } else {
                        if (var3 < var8 + 7 + var7) {
                          L9: {
                            if (pg.field_a.length <= var3 - (7 - -var7)) {
                              stackOut_32_0 = "";
                              stackIn_33_0 = stackOut_32_0;
                              break L9;
                            } else {
                              stackOut_31_0 = pg.field_a[-7 + (var3 + -var7)];
                              stackIn_33_0 = stackOut_31_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_33_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (var4 != -2) {
                    break L10;
                  } else {
                    var6 = Integer.toString(var2);
                    break L10;
                  }
                }
                L11: {
                  stackOut_36_0 = 10;
                  stackOut_36_1 = (String) var6;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  if (var4 < 0) {
                    stackOut_38_0 = stackIn_38_0;
                    stackOut_38_1 = (String) (Object) stackIn_38_1;
                    stackOut_38_2 = 0;
                    stackIn_39_0 = stackOut_38_0;
                    stackIn_39_1 = stackOut_38_1;
                    stackIn_39_2 = stackOut_38_2;
                    break L11;
                  } else {
                    stackOut_37_0 = stackIn_37_0;
                    stackOut_37_1 = (String) (Object) stackIn_37_1;
                    stackOut_37_2 = 1;
                    stackIn_39_0 = stackOut_37_0;
                    stackIn_39_1 = stackOut_37_1;
                    stackIn_39_2 = stackOut_37_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = ud.a(stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
                  var8 = ta.field_A - (var7 >> 1);
                  if (var4 >= 0) {
                    L13: {
                      if (ll.field_k.field_e == var4) {
                        stackOut_43_0 = qn.field_a;
                        stackIn_44_0 = stackOut_43_0;
                        break L13;
                      } else {
                        stackOut_42_0 = cr.field_e;
                        stackIn_44_0 = stackOut_42_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_44_0;
                      var1_int = var1_int + aj.field_a;
                      if (var9 == null) {
                        break L14;
                      } else {
                        var9.a(-eb.field_d + var8, nr.field_j - -(pr.field_d << 1), var1_int, var7 - -(eb.field_d << 1), 3);
                        break L14;
                      }
                    }
                    var1_int = var1_int + pr.field_d;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var4 < 0) {
                    cv.field_f.a(var6, var8, jl.field_d + var1_int, var5, -1);
                    var1_int = var1_int + la.field_c;
                    break L15;
                  } else {
                    sf.field_F.a(var6, var8, lk.field_g + var1_int, var5, -1);
                    var1_int = var1_int + (nr.field_j + aj.field_a + pr.field_d);
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "re.E(" + 0 + 41);
        }
    }

    public static void a() {
        field_b = null;
        field_o = null;
        field_c = null;
    }

    final static void b(int param0) {
        int var1 = 0;
        L0: {
          if (param0 > 85) {
            break L0;
          } else {
            field_k = 33;
            break L0;
          }
        }
        L1: {
          fp.field_f = fp.field_f + 3;
          if (fp.field_f < 256) {
            break L1;
          } else {
            fp.field_f = fp.field_f - 256;
            break L1;
          }
        }
        L2: {
          if (wh.field_q) {
            vd.a(0, 0);
            var1 = vr.a(rm.field_C, ih.field_c, (byte) -110);
            if (var1 == -1) {
              if (iu.a(63, ih.field_c, rm.field_C)) {
                L3: {
                  vd.a(0, 1);
                  if (0 != ih.field_c) {
                    if (ih.field_c == 1) {
                      var1 = vc.b(123);
                      if (var1 != -1) {
                        jm.a(100, 9863, var1);
                        return;
                      } else {
                        break L3;
                      }
                    } else {
                      if (ih.field_c != 2) {
                        break L3;
                      } else {
                        int discarded$8 = -124;
                        var1 = k.b();
                        if (var1 != -1) {
                          jm.a(100, 9863, var1);
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    int discarded$9 = 0;
                    var1 = ve.c();
                    if (var1 == -1) {
                      break L3;
                    } else {
                      jm.a(100, 9863, var1);
                      return;
                    }
                  }
                }
                L4: {
                  vd.a(0, 2);
                  if (2 != rm.field_C) {
                    if (rm.field_C == 3) {
                      var1 = kw.c((byte) 28);
                      if (var1 != -1) {
                        jm.a(100, 9863, var1);
                        return;
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    int discarded$10 = -94;
                    if (bl.a()) {
                      break L4;
                    } else {
                      jm.a(1, 9863, 0);
                      return;
                    }
                  }
                }
                vd.a(0, 3);
                var1 = fu.a(5464, ih.field_c, rm.field_C);
                if (var1 != -1) {
                  jm.a(100, 9863, var1);
                  return;
                } else {
                  vd.a(0, 4);
                  if (!ja.d(120, kn.a(ih.field_c, 121, vi.field_n, rm.field_C))) {
                    jm.a(4, 9863, 0);
                    return;
                  } else {
                    L5: {
                      vd.a(0, 5);
                      if (rm.field_C == 2) {
                        if (!ja.d(108, 4)) {
                          jm.a(2, 9863, 0);
                          return;
                        } else {
                          if (!ja.d(117, 5)) {
                            jm.a(2, 9863, 1);
                            return;
                          } else {
                            break L5;
                          }
                        }
                      } else {
                        if (rm.field_C != 3) {
                          break L5;
                        } else {
                          if (ja.d(109, 6)) {
                            if (!ja.d(120, 7)) {
                              jm.a(2, 9863, 1);
                              return;
                            } else {
                              break L5;
                            }
                          } else {
                            jm.a(2, 9863, 0);
                            return;
                          }
                        }
                      }
                    }
                    L6: {
                      if (kl.field_t) {
                        L7: {
                          hl.field_e = null;
                          am.field_h = null;
                          ub.field_G = null;
                          hq.field_e = null;
                          c.field_f = null;
                          vd.a(0, 6);
                          if (0 == rm.field_C) {
                            hd.a(15, 6, 50, 0);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        L8: {
                          if (rm.field_C == 1) {
                            hd.a(15, 5, 70, 20);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (2 != rm.field_C) {
                            break L9;
                          } else {
                            hd.a(15, 4, 128, 0);
                            break L9;
                          }
                        }
                        L10: {
                          if (3 != rm.field_C) {
                            break L10;
                          } else {
                            hd.a(15, 3, 256, 0);
                            break L10;
                          }
                        }
                        L11: {
                          vd.a(0, 7);
                          if (rm.field_C != 2) {
                            break L11;
                          } else {
                            int discarded$11 = 128;
                            int discarded$12 = 1;
                            in.a();
                            break L11;
                          }
                        }
                        L12: {
                          if (rm.field_C != 3) {
                            break L12;
                          } else {
                            int discarded$13 = 128;
                            int discarded$14 = -39;
                            mj.a();
                            break L12;
                          }
                        }
                        L13: {
                          vd.a(0, 8);
                          vb.a(true);
                          vd.a(0, 9);
                          if (0 != ih.field_c) {
                            break L13;
                          } else {
                            pp.b(1);
                            break L13;
                          }
                        }
                        L14: {
                          if (ih.field_c != 1) {
                            break L14;
                          } else {
                            int discarded$15 = -48;
                            eh.a();
                            break L14;
                          }
                        }
                        L15: {
                          if (ih.field_c == 2) {
                            cv.a(11383);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        vd.a(0, 10);
                        vp.a(-4121, rm.field_C);
                        kl.field_t = false;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    wh.field_q = false;
                    break L2;
                  }
                }
              } else {
                jm.a(2, 9863, 1);
                return;
              }
            } else {
              jm.a(100, 9863, var1);
              return;
            }
          } else {
            break L2;
          }
        }
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        es var9 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            if (la.a(100)) {
              return;
            } else {
              if (!uv.field_f) {
                L1: {
                  if (param1 >= 0) {
                    if (param1 > pu.field_Db[param3]) {
                      param1 = pu.field_Db[param3];
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    param1 = 0;
                    break L1;
                  }
                }
                L2: {
                  if (param2 < 0) {
                    param1 = 0;
                    break L2;
                  } else {
                    if (pu.field_Db[param3] >= param2) {
                      break L2;
                    } else {
                      param2 = pu.field_Db[param3];
                      break L2;
                    }
                  }
                }
                if (param2 <= param1) {
                  return;
                } else {
                  L3: {
                    if (-param1 + param2 <= 32) {
                      break L3;
                    } else {
                      param2 = 32 + param1;
                      break L3;
                    }
                  }
                  vq.field_g.b(22997);
                  var4_int = 0;
                  var5 = 0;
                  var6 = param1;
                  var7 = param1;
                  L4: while (true) {
                    if (var7 >= param2) {
                      L5: {
                        if (var5 > 0) {
                          vq.field_g.a((gn) (Object) new es(param3, var6, var5), 3);
                          var4_int++;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (0 < var4_int) {
                          or.field_d.b(53, (byte) 118);
                          or.field_d.g(-1207444472, 2 + 5 * var4_int);
                          or.field_d.a(121, var4_int);
                          var9 = (es) (Object) vq.field_g.b((byte) 126);
                          L7: while (true) {
                            if (var9 == null) {
                              or.field_d.a(105, param3);
                              uv.field_f = true;
                              ri.field_t = 500;
                              break L6;
                            } else {
                              var9.a(or.field_d, (byte) 95);
                              var9 = (es) (Object) vq.field_g.b((byte) 127);
                              continue L7;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      L8: {
                        if (bf.field_y.a(var7, (byte) 116, param3) == null) {
                          L9: {
                            if (var5 == 0) {
                              var6 = var7;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          var5++;
                          break L8;
                        } else {
                          L10: {
                            if (var5 <= 0) {
                              break L10;
                            } else {
                              var4_int++;
                              vq.field_g.a((gn) (Object) new es(param3, var6, var5), 3);
                              break L10;
                            }
                          }
                          var5 = 0;
                          break L8;
                        }
                      }
                      var7++;
                      continue L4;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var4, "re.F(" + 125 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final static ak a(boolean param0, int param1) {
        ak var2 = new ak(3);
        var2.field_n = param0 ? true : false;
        if (param1 < 33) {
            return null;
        }
        return var2;
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        qk var12 = null;
        fd stackIn_3_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param3 instanceof qk) {
                stackOut_2_0 = (fd) param3;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (fd) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var12 = (qk) (Object) stackIn_3_0;
              if (var12 == null) {
                break L2;
              } else {
                param1 = param1 & var12.field_y;
                break L2;
              }
            }
            L3: {
              var7 = 5592405;
              on.a(param4 - -param3.field_t, param3.field_g + param2, param3.field_n, param3.field_i, ((re) this).field_a);
              if (!param1) {
                break L3;
              } else {
                var7 = 16777215;
                break L3;
              }
            }
            L4: {
              var8 = param4 - (-param3.field_t + -((re) this).field_f);
              var9 = ((re) this).field_n + (param2 - -param3.field_g);
              var10 = -126 / ((59 - param0) / 53);
              on.d(var8, var9, ((re) this).field_h, ((re) this).field_g, 5592405);
              on.a(var8, var9, ((re) this).field_h, ((re) this).field_g, var7);
              if (!var12.field_A) {
                break L4;
              } else {
                on.b(var8, var9, ((re) this).field_h + var8, ((re) this).field_g + var9, 1);
                on.b(var8 + ((re) this).field_h, var9, var8, ((re) this).field_g + var9, 1);
                break L4;
              }
            }
            L5: {
              if (null == ((re) this).field_m) {
                break L5;
              } else {
                var11 = ((re) this).field_h + (((re) this).field_f - -((re) this).field_i);
                int discarded$1 = ((re) this).field_m.a(param3.field_q, var11 + param3.field_t + param4, ((re) this).field_p + param2 - -param3.field_g, -((re) this).field_i - var11 + param3.field_n, param3.field_i + -(((re) this).field_i << 1), ((re) this).field_e, ((re) this).field_l, ((re) this).field_d, ((re) this).field_j, 0);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var6;
            stackOut_12_1 = new StringBuilder().append("re.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param4 + 41);
        }
    }

    re(hu param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((re) this).field_d = 1;
        ((re) this).field_j = 1;
        try {
            ((re) this).field_m = param0;
            ((re) this).field_g = param7;
            ((re) this).field_f = param5;
            ((re) this).field_i = param1;
            ((re) this).field_p = param2;
            ((re) this).field_l = param4;
            ((re) this).field_e = param3;
            ((re) this).field_a = param9;
            ((re) this).field_h = param8;
            ((re) this).field_n = param6;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "re.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"<img=0>Tournaments are <col=ffff00>unrated</col> only.", "<img=0>If a player has no opponent for their game, they automatically go through to the next round.", "<img=0>In the event of a draw, a random statistic is chosen to decide who wins, in the event of all stats being the the same, the winner is decided on a coin toss."};
        field_c = new ko(1);
    }
}
