/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ia extends wf {
    int field_p;
    int field_k;
    int field_m;
    static String field_l;
    int field_h;
    static String field_i;
    static int field_j;
    int field_g;
    int[] field_o;
    int field_n;

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            String var4 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            StringBuilder stackIn_11_1 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param1 == 6) {
                        break L2;
                      } else {
                        var4 = (String) null;
                        ia.a((java.applet.Applet) null, 40, (String) null);
                        break L2;
                      }
                    }
                    var3 = new java.net.URL(param0.getCodeBase(), param2);
                    var3 = dh.a(param0, (byte) -118, var3);
                    ea.a((byte) 68, param0, true, var3.toString());
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    var3_ref.printStackTrace();
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var3_ref2);

                stackIn_8_1 = new StringBuilder().append("ia.D(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7) {
        try {
            this.field_m = param2;
            this.field_o = param7;
            this.field_p = param1;
            if (param6 != 6) {
                ia.d(81);
            }
            this.field_g = param5;
            this.field_k = param3;
            this.field_n = param0;
            this.field_h = param4;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "ia.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static void d(int param0) {
        int fieldTemp$0 = 0;
        sj dupTemp$1 = null;
        sj dupTemp$2 = null;
        int stackIn_23_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_112_0 = 0;
        sj stackIn_151_0 = null;
        sj stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        sj stackIn_157_0 = null;
        sj stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_216_0 = 0;
        Object stackIn_328_0 = null;
        sj stackIn_328_1 = null;
        sj stackIn_369_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        pl var2 = null;
        pl var3 = null;
        int var4 = 0;
        sj var4_ref_sj = null;
        j var4_ref_j = null;
        int var5 = 0;
        Object var5_ref = null;
        int var6 = 0;
        j var6_ref_j = null;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        j var13 = null;
        sj[] var14 = null;
        sj var15 = null;
        sj[] var16 = null;
        sj var17 = null;
        sj[] var18 = null;
        sj var19 = null;
        sj[] var21 = null;
        sj var22 = null;
        sj[] var23 = null;
        sj var24 = null;
        sj var25 = null;
        sj var26 = null;
        String var27 = null;
        sj var28 = null;
        char[] var31 = null;
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              hf.field_j = hf.field_j + 1;
              gh.field_l = gh.field_l + 1;
              pf.field_g = eh.field_a;
              nc.field_t = nc.field_t + jk.field_B;
              vh.field_n = vh.field_n + 1;
              hg.a(95);
              if (oj.field_u.a((byte) -95) == null) {
                break L1;
              } else {
                fieldTemp$0 = da.field_C + 1;
                da.field_C = da.field_C + 1;
                if ((fieldTemp$0 ^ -1) != -336) {
                  break L1;
                } else {
                  da.field_C = 0;
                  oj.field_u.c(-94);
                  break L1;
                }
              }
            }
            L2: {
              if (mg.field_d) {
                break L2;
              } else {
                ne.a(39);
                break L2;
              }
            }
            L3: {
              if (param0 >= 22) {
                break L3;
              } else {
                field_l = (String) null;
                break L3;
              }
            }
            L4: {
              L5: {
                if (n.field_a != 0) {
                  break L5;
                } else {
                  if (6 > re.field_A) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (n.field_a < 2) {
                  break L6;
                } else {
                  if (mg.field_d) {
                    break L4;
                  } else {
                    if (-11 >= (n.field_a ^ -1)) {
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              wk.field_c = wk.field_c + 1;
              break L4;
            }
            L7: {
              L8: {
                eg.field_b = eg.field_b + 1;
                if (!mg.field_d) {
                  break L8;
                } else {
                  if ((n.field_a ^ -1) != -3) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              dc.field_a = dc.field_a + 1;
              break L7;
            }
            L9: {
              g.field_z = g.field_z - 1;
              if (!rj.field_b) {
                stackIn_23_0 = 0;
                break L9;
              } else {
                stackIn_23_0 = 1;
                break L9;
              }
            }
            L10: {
              var1_int = stackIn_23_0;
              if (ub.field_c == null) {
                break L10;
              } else {
                if (!ub.field_c.field_c) {
                  var1_int = 1;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            if (var1_int == 0) {
              L11: {
                if (!mg.field_d) {
                  stackIn_32_0 = 1;
                  break L11;
                } else {
                  stackIn_32_0 = 7;
                  break L11;
                }
              }
              qf.field_d = stackIn_32_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L12: {
                var2 = d.field_e;
                if ((n.field_a ^ -1) > -4) {
                  var3 = bd.field_u[1];
                  break L12;
                } else {
                  if ((n.field_a ^ -1) <= -7) {
                    if ((n.field_a ^ -1) <= -10) {
                      if (n.field_a >= 10) {
                        var3 = bd.field_u[6];
                        break L12;
                      } else {
                        var3 = bd.field_u[4];
                        break L12;
                      }
                    } else {
                      var3 = bd.field_u[3];
                      break L12;
                    }
                  } else {
                    var3 = bd.field_u[2];
                    break L12;
                  }
                }
              }
              L13: {
                if (var2 == null) {
                  wd.a(17099, true, var3);
                  break L13;
                } else {
                  if (var2 == var3) {
                    break L13;
                  } else {
                    if (var3 == bd.field_u[6]) {
                      break L13;
                    } else {
                      if (var2 != bd.field_u[5]) {
                        wd.a(17099, false, bd.field_u[5]);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
              }
              if (re.field_A >= 6) {
                L14: {
                  if (!ve.field_B[11]) {
                    break L14;
                  } else {
                    if (0 != ig.field_l) {
                      break L14;
                    } else {
                      ig.field_l = -1;
                      break L14;
                    }
                  }
                }
                L15: {
                  if (!ve.field_B[1]) {
                    break L15;
                  } else {
                    if (va.field_j >= 2) {
                      L16: {
                        if (ll.field_S) {
                          stackIn_205_0 = 0;
                          break L16;
                        } else {
                          stackIn_205_0 = 1;
                          break L16;
                        }
                      }
                      ll.field_S = stackIn_205_0 != 0;
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                }
                L17: {
                  if (ve.field_B[12]) {
                    ig.field_l = 0;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: while (true) {
                  if (!pc.b(-122)) {
                    L19: {
                      if (ad.field_e) {
                        a.field_S.a(-127, kk.a(336, ol.field_b, nk.field_c), kk.a(336, oa.field_j, bk.field_a));
                        if (!a.field_S.f(-9112)) {
                          break L19;
                        } else {
                          L20: {
                            if (0 == a.field_S.field_d) {
                              dc.a(-22991, true);
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          if (a.field_S.field_d != 1) {
                            break L19;
                          } else {
                            ad.field_e = false;
                            break L19;
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                    L21: {
                      L22: {
                        L23: {
                          if (-2 != (tg.field_d ^ -1)) {
                            break L23;
                          } else {
                            if (!ad.field_e) {
                              L24: {
                                qf.field_e = qf.field_e ^ 5 << bc.field_b;
                                hf.field_j = hf.field_j + ol.field_b;
                                vh.field_n = vh.field_n + ol.field_b;
                                nc.field_t = nc.field_t + nk.field_c;
                                bc.field_b = bc.field_b ^ 5 << bc.field_b;
                                ud.field_b = ud.field_b - nk.field_c;
                                if (-265 < (oa.field_j ^ -1)) {
                                  break L24;
                                } else {
                                  if ((oa.field_j ^ -1) <= -429) {
                                    break L24;
                                  } else {
                                    if (bk.field_a < 376) {
                                      break L24;
                                    } else {
                                      if ((bk.field_a ^ -1) <= -408) {
                                        break L24;
                                      } else {
                                        dc.a(-22991, true);
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                              L25: {
                                if (134 > oa.field_j) {
                                  break L25;
                                } else {
                                  if (-243 >= (oa.field_j ^ -1)) {
                                    break L25;
                                  } else {
                                    if ((bk.field_a ^ -1) > -377) {
                                      break L25;
                                    } else {
                                      if (407 > bk.field_a) {
                                        vk.a((byte) 85, dg.field_d[0]);
                                        wk.field_a.a(-10874);
                                        si.field_i.a(-10874);
                                        break L21;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              L26: {
                                L27: {
                                  if (bk.field_a < 114) {
                                    break L27;
                                  } else {
                                    if (bk.field_a >= 114 - -wl.field_K.field_m) {
                                      break L27;
                                    } else {
                                      if (oa.field_j >= 34) {
                                        var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                                        if (var4 >= od.field_g.field_e.length) {
                                          break L26;
                                        } else {
                                          rk.field_p = -(-(var4 * wl.field_K.field_n) + -34 + oa.field_j);
                                          sg.field_d = od.field_g.field_e[var4];
                                          ek.field_e = 114 - bk.field_a;
                                          break L26;
                                        }
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                }
                                L28: {
                                  if (-191 < (bk.field_a ^ -1)) {
                                    break L28;
                                  } else {
                                    if (bk.field_a >= 190 + wl.field_K.field_m) {
                                      break L28;
                                    } else {
                                      if (oa.field_j >= 34) {
                                        var4 = (-34 + oa.field_j) / wl.field_K.field_n;
                                        if (var4 >= wk.field_a.field_e.length) {
                                          break L26;
                                        } else {
                                          rk.field_p = -(oa.field_j - (34 - -(wl.field_K.field_n * var4)));
                                          sg.field_d = wk.field_a.field_e[var4];
                                          ek.field_e = -bk.field_a + 190;
                                          break L26;
                                        }
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                }
                                if (bk.field_a < 247) {
                                  break L26;
                                } else {
                                  if (247 + wl.field_K.field_m <= bk.field_a) {
                                    break L26;
                                  } else {
                                    if (161 > oa.field_j) {
                                      break L26;
                                    } else {
                                      var4 = (-161 + oa.field_j) / wl.field_K.field_n;
                                      if (var4 >= si.field_i.field_e.length) {
                                        break L26;
                                      } else {
                                        rk.field_p = -(-(var4 * wl.field_K.field_n) + (oa.field_j - 161));
                                        sg.field_d = si.field_i.field_e[var4];
                                        ek.field_e = 247 - bk.field_a;
                                        break L26;
                                      }
                                    }
                                  }
                                }
                              }
                              L29: {
                                if ((va.field_j ^ -1) > -3) {
                                  break L29;
                                } else {
                                  if (0 >= ig.field_l) {
                                    break L29;
                                  } else {
                                    if (sg.field_d != null) {
                                      L30: {
                                        sg.field_d.field_i = (char)ig.field_l;
                                        if (!dk.field_b) {
                                          hf.field_j = hf.field_j + 1;
                                          nc.field_t = nc.field_t + 1;
                                          dk.field_b = true;
                                          break L30;
                                        } else {
                                          break L30;
                                        }
                                      }
                                      sg.field_d.field_v = qi.field_c.field_p[255 & sg.field_d.field_i];
                                      var4_ref_sj = sg.field_d;
                                      sg.field_d.field_l = 0;
                                      ig.field_l = -1;
                                      var4_ref_sj.field_h = 0;
                                      break L29;
                                    } else {
                                      break L29;
                                    }
                                  }
                                }
                              }
                              if (null == sg.field_d) {
                                break L22;
                              } else {
                                stackIn_369_0 = nc.field_s;
                                L31: {
                                  if (stackIn_369_0 != sg.field_d) {
                                    break L31;
                                  } else {
                                    if (-1 > (g.field_z ^ -1)) {
                                      L32: {
                                        sg.field_d = null;
                                        if (od.field_g == nc.field_s.field_o) {
                                          eh.a(nc.field_s, 55);
                                          break L32;
                                        } else {
                                          var4 = 0;
                                          L33: while (true) {
                                            if (12 <= var4) {
                                              break L32;
                                            } else {
                                              if (od.field_g.field_e[var4] == null) {
                                                nc.field_s.a(var4, 28, od.field_g);
                                                break L32;
                                              } else {
                                                var4++;
                                                continue L33;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      nc.field_s = null;
                                      break L21;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                g.field_z = 10;
                                nc.field_s = sg.field_d;
                                break L21;
                              }
                            } else {
                              break L23;
                            }
                          }
                        }
                        stackIn_328_0 = null;
                        stackIn_328_1 = sg.field_d;
                        if (stackIn_328_0 == stackIn_328_1) {
                          break L22;
                        } else {
                          if (b.field_k != 0) {
                            ua.b((byte) 69);
                            break L21;
                          } else {
                            qi.a((byte) 125);
                            break L21;
                          }
                        }
                      }
                      break L21;
                    }
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    qf.field_e = qf.field_e ^ 1 << eh.field_a;
                    bc.field_b = bc.field_b ^ 1 << eh.field_a;
                    ud.field_b = ud.field_b - gh.field_l;
                    jk.field_B = jk.field_B - 1;
                    if (ch.field_d != 13) {
                      if ((n.field_a ^ -1) == -11) {
                        continue L18;
                      } else {
                        L34: {
                          if (!mg.field_d) {
                            break L34;
                          } else {
                            if (n.field_a != 2) {
                              break L34;
                            } else {
                              continue L18;
                            }
                          }
                        }
                        if (ad.field_e) {
                          a.field_S.b(false);
                          if (!a.field_S.f(-9112)) {
                            continue L18;
                          } else {
                            L35: {
                              if (0 == a.field_S.field_d) {
                                dc.a(-22991, false);
                                break L35;
                              } else {
                                break L35;
                              }
                            }
                            if (1 == a.field_S.field_d) {
                              ad.field_e = false;
                              continue L18;
                            } else {
                              continue L18;
                            }
                          }
                        } else {
                          if (84 != ch.field_d) {
                            L36: {
                              if (va.field_j < 2) {
                                break L36;
                              } else {
                                if ((ch.field_d ^ -1) != -36) {
                                  break L36;
                                } else {
                                  if (!ve.field_B[82]) {
                                    break L36;
                                  } else {
                                    ue.b(31370);
                                    continue L18;
                                  }
                                }
                              }
                            }
                            if ((ch.field_d ^ -1) != -84) {
                              L37: {
                                if (85 != ch.field_d) {
                                  break L37;
                                } else {
                                  if (od.field_g.field_e[0] == null) {
                                    break L37;
                                  } else {
                                    wh.f((byte) 104);
                                    continue L18;
                                  }
                                }
                              }
                              L38: {
                                if (!i.a(sg.field_n, 160)) {
                                  break L38;
                                } else {
                                  if (sg.field_n == 32) {
                                    break L38;
                                  } else {
                                    if (od.field_g.field_e[11] == null) {
                                      L39: {
                                        sg.field_n = qi.field_c.a(0, sg.field_n);
                                        if (0 != ig.field_l) {
                                          ig.field_l = sg.field_n & 255;
                                          break L39;
                                        } else {
                                          break L39;
                                        }
                                      }
                                      var28 = w.a((byte)sg.field_n, false);
                                      if (var28 == null) {
                                        vk.a((byte) 91, dg.field_d[6]);
                                        continue L18;
                                      } else {
                                        var5 = 0;
                                        L40: while (true) {
                                          if (var5 >= 12) {
                                            continue L18;
                                          } else {
                                            if (null == od.field_g.field_e[var5]) {
                                              var28.a(var5, 28, od.field_g);
                                              continue L18;
                                            } else {
                                              var5++;
                                              continue L40;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              L41: {
                                L42: {
                                  if (98 != ch.field_d) {
                                    break L42;
                                  } else {
                                    if ((n.field_a ^ -1) < -1) {
                                      break L41;
                                    } else {
                                      break L42;
                                    }
                                  }
                                }
                                if (99 == ch.field_d) {
                                  break L41;
                                } else {
                                  continue L18;
                                }
                              }
                              var4 = 0;
                              L43: while (true) {
                                L44: {
                                  if (-13 >= (var4 ^ -1)) {
                                    break L44;
                                  } else {
                                    var25 = od.field_g.field_e[var4];
                                    var26 = var25;
                                    var28 = var26;
                                    var26 = var25;
                                    var5_ref = var26;
                                    if (var25 == null) {
                                      break L44;
                                    } else {
                                      if (var25.field_k != null) {
                                        if (od.field_g != var25.field_k) {
                                          L45: {
                                            if (null == var25.field_k.field_e[var25.field_s]) {
                                              var25.a(var25.field_s, 28, var25.field_k);
                                              break L45;
                                            } else {
                                              break L45;
                                            }
                                          }
                                          var4++;
                                          continue L43;
                                        } else {
                                          var4++;
                                          continue L43;
                                        }
                                      } else {
                                        var4++;
                                        continue L43;
                                      }
                                    }
                                  }
                                }
                                var4 = 0;
                                L46: while (true) {
                                  if (12 <= var4) {
                                    if (ch.field_d != 98) {
                                      continue L18;
                                    } else {
                                      var27 = vi.field_g[n.field_a + -1].toString();
                                      var5 = 0;
                                      L47: while (true) {
                                        if (var27.length() <= var5) {
                                          continue L18;
                                        } else {
                                          var6 = var27.charAt(var5);
                                          var7 = null;
                                          var8 = -1;
                                          var9 = -1;
                                          var10 = 0;
                                          L48: while (true) {
                                            if (12 <= var10) {
                                              var12 = 0;
                                              var10 = var12;
                                              L49: while (true) {
                                                if (var12 >= 8) {
                                                  ((j) (var7)).field_e[var8].a(var5, 28, od.field_g);
                                                  var5++;
                                                  continue L47;
                                                } else {
                                                  if (si.field_i.field_e[var12] != null) {
                                                    if (var6 == si.field_i.field_e[var12].field_i) {
                                                      L50: {
                                                        if (var9 < si.field_i.field_e[var12].field_l) {
                                                          var7 = si.field_i;
                                                          var9 = si.field_i.field_e[var12].field_l;
                                                          var8 = var12;
                                                          break L50;
                                                        } else {
                                                          break L50;
                                                        }
                                                      }
                                                      var12++;
                                                      continue L49;
                                                    } else {
                                                      var12++;
                                                      continue L49;
                                                    }
                                                  } else {
                                                    var12++;
                                                    continue L49;
                                                  }
                                                }
                                              }
                                            } else {
                                              if (wk.field_a.field_e[var10] != null) {
                                                if (var6 == wk.field_a.field_e[var10].field_i) {
                                                  L51: {
                                                    if (wk.field_a.field_e[var10].field_l > var9) {
                                                      var8 = var10;
                                                      var7 = wk.field_a;
                                                      var9 = wk.field_a.field_e[var10].field_l;
                                                      break L51;
                                                    } else {
                                                      break L51;
                                                    }
                                                  }
                                                  var10++;
                                                  continue L48;
                                                } else {
                                                  var10++;
                                                  continue L48;
                                                }
                                              } else {
                                                var10++;
                                                continue L48;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L52: {
                                      var26 = od.field_g.field_e[var4];
                                      var28 = var26;
                                      var28 = var26;
                                      var5_ref = var26;
                                      if (var26 != null) {
                                        L53: {
                                          if (-1 != (var26.field_h ^ -1)) {
                                            var7 = si.field_i;
                                            var6_ref_j = wk.field_a;
                                            break L53;
                                          } else {
                                            var6_ref_j = si.field_i;
                                            var7 = wk.field_a;
                                            break L53;
                                          }
                                        }
                                        var8 = 0;
                                        L54: while (true) {
                                          L55: {
                                            if (var6_ref_j.field_e.length <= var8) {
                                              break L55;
                                            } else {
                                              if (var6_ref_j.field_e[var8] != null) {
                                                var8++;
                                                continue L54;
                                              } else {
                                                var26.a(var8, 28, var6_ref_j);
                                                var5_ref = null;
                                                break L55;
                                              }
                                            }
                                          }
                                          if (var5_ref == null) {
                                            break L52;
                                          } else {
                                            var8 = 0;
                                            L56: while (true) {
                                              if (var8 >= ((j) (var7)).field_e.length) {
                                                break L52;
                                              } else {
                                                if (((j) (var7)).field_e[var8] == null) {
                                                  ((sj) (var5_ref)).a(var8, 28, (j) (var7));
                                                  break L52;
                                                } else {
                                                  var8++;
                                                  continue L56;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        break L52;
                                      }
                                    }
                                    var4++;
                                    continue L46;
                                  }
                                }
                              }
                            } else {
                              vk.a((byte) 78, dg.field_d[0]);
                              wk.field_a.a(-10874);
                              si.field_i.a(-10874);
                              continue L18;
                            }
                          } else {
                            dc.a(-22991, false);
                            continue L18;
                          }
                        }
                      }
                    } else {
                      if (!ad.field_e) {
                        L57: {
                          if (mg.field_d) {
                            stackIn_216_0 = 7;
                            break L57;
                          } else {
                            stackIn_216_0 = 1;
                            break L57;
                          }
                        }
                        qf.field_d = stackIn_216_0;
                        decompiledRegionSelector0 = 4;
                        break L0;
                      } else {
                        ad.field_e = false;
                        continue L18;
                      }
                    }
                  }
                }
              } else {
                L58: {
                  if (0 > jl.field_j) {
                    break L58;
                  } else {
                    L59: {
                      if (-1 + n.field_a == jl.field_j) {
                        break L59;
                      } else {
                        if (!hd.field_a) {
                          if ((o.field_i ^ -1) < -1) {
                            o.field_i = o.field_i - 10;
                            break L58;
                          } else {
                            break L58;
                          }
                        } else {
                          break L59;
                        }
                      }
                    }
                    o.field_i = o.field_i + 10;
                    if (237 - -o.field_i >= 480) {
                      hd.field_a = false;
                      jl.field_j = jl.field_j + 1;
                      break L58;
                    } else {
                      break L58;
                    }
                  }
                }
                L60: {
                  if (-1 == (re.field_A ^ -1)) {
                    var4 = 1;
                    var23 = si.field_i.field_e;
                    var6 = 0;
                    L61: while (true) {
                      L62: {
                        if (var23.length <= var6) {
                          break L62;
                        } else {
                          L63: {
                            var24 = var23[var6];
                            if (var24 == null) {
                              break L63;
                            } else {
                              if (var24.field_q != var24.field_p) {
                                var4 = 0;
                                break L62;
                              } else {
                                if (-248 != (var24.field_p ^ -1)) {
                                  break L63;
                                } else {
                                  var4 = 0;
                                  var24.field_p = var24.field_p + wl.field_K.field_m;
                                  break L62;
                                }
                              }
                            }
                          }
                          var6++;
                          continue L61;
                        }
                      }
                      if (var4 == 0) {
                        break L60;
                      } else {
                        re.field_A = 1;
                        break L60;
                      }
                    }
                  } else {
                    if (-2 != (re.field_A ^ -1)) {
                      if (2 != re.field_A) {
                        if (3 != re.field_A) {
                          if (4 == re.field_A) {
                            var4 = 1;
                            var21 = si.field_i.field_e;
                            var6 = 0;
                            L64: while (true) {
                              L65: {
                                if (var21.length <= var6) {
                                  break L65;
                                } else {
                                  L66: {
                                    var22 = var21[var6];
                                    if (var22 == null) {
                                      break L66;
                                    } else {
                                      if (var22.field_p == var22.field_q) {
                                        if ((var22.field_p ^ -1) != -248) {
                                          var22.field_p = 247;
                                          var4 = 0;
                                          break L65;
                                        } else {
                                          break L66;
                                        }
                                      } else {
                                        var4 = 0;
                                        break L65;
                                      }
                                    }
                                  }
                                  var6++;
                                  continue L64;
                                }
                              }
                              L67: {
                                if (n.field_a != 0) {
                                  break L67;
                                } else {
                                  if ((dc.field_a ^ -1) > -51) {
                                    var4 = 0;
                                    break L67;
                                  } else {
                                    if (var4 != 0) {
                                      dc.field_a = 0;
                                      break L67;
                                    } else {
                                      break L67;
                                    }
                                  }
                                }
                              }
                              if (var4 != 0) {
                                re.field_A = 5;
                                break L60;
                              } else {
                                break L60;
                              }
                            }
                          } else {
                            if (-6 == (re.field_A ^ -1)) {
                              L68: {
                                var13 = wk.field_a;
                                var4_ref_j = var13;
                                wk.field_a = od.field_g;
                                wk.field_a.field_d = 34;
                                od.field_g = var13;
                                wk.field_a.field_c = 190;
                                re.field_A = 6;
                                od.field_g.field_c = 114;
                                if ((jl.field_j ^ -1) != -4) {
                                  break L68;
                                } else {
                                  jl.field_j = jl.field_j + 1;
                                  break L68;
                                }
                              }
                              od.field_g.field_d = 34;
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                        } else {
                          L69: {
                            wk.field_a.a(true);
                            si.field_i.a(true);
                            if (-11 == (n.field_a ^ -1)) {
                              break L69;
                            } else {
                              L70: {
                                if (!mg.field_d) {
                                  break L70;
                                } else {
                                  if (2 == n.field_a) {
                                    break L69;
                                  } else {
                                    break L70;
                                  }
                                }
                              }
                              var18 = od.field_g.field_e;
                              var5 = 0;
                              L71: while (true) {
                                if (var5 >= var18.length) {
                                  L72: {
                                    L73: {
                                      var31 = new char[8];
                                      if (!mg.field_d) {
                                        break L73;
                                      } else {
                                        if ((n.field_a ^ -1) != -2) {
                                          break L73;
                                        } else {
                                          if (null != qi.field_c.field_n) {
                                            var5 = 0;
                                            L74: while (true) {
                                              if (var5 >= qi.field_c.field_n.length()) {
                                                break L72;
                                              } else {
                                                L75: {
                                                  si.field_i.field_e[var5] = w.a(si.field_i, var5, qi.field_c, (byte) 105, qi.field_c.field_n.charAt(var5));
                                                  stackIn_157_0 = si.field_i.field_e[var5];

                                                  if (-2 != (var5 ^ -1)) {
                                                    stackIn_158_0 = (sj) ((Object) stackIn_157_0);
                                                    stackIn_158_1 = 0;
                                                    break L75;
                                                  } else {
                                                    stackIn_158_0 = (sj) ((Object) stackIn_157_0);
                                                    stackIn_158_1 = 1;
                                                    break L75;
                                                  }
                                                }
                                                stackIn_158_0.field_x = stackIn_158_1 != 0;
                                                dupTemp$1 = si.field_i.field_e[var5];
                                                dupTemp$1.field_p = 247 + -wl.field_K.field_m;
                                                si.field_i.field_e[var5].field_q = 247 + -wl.field_K.field_m;
                                                var5++;
                                                continue L74;
                                              }
                                            }
                                          } else {
                                            break L73;
                                          }
                                        }
                                      }
                                    }
                                    qi.field_c.a((byte) 92, var31);
                                    var5 = li.a(8, o.field_o, false);
                                    var6 = 0;
                                    L76: while (true) {
                                      if (var31.length <= var6) {
                                        break L72;
                                      } else {
                                        L77: {
                                          si.field_i.field_e[var6] = w.a(si.field_i, var6, qi.field_c, (byte) 30, var31[var6]);
                                          stackIn_151_0 = si.field_i.field_e[var6];

                                          if (var5 != var6) {
                                            stackIn_152_0 = (sj) ((Object) stackIn_151_0);
                                            stackIn_152_1 = 0;
                                            break L77;
                                          } else {
                                            stackIn_152_0 = (sj) ((Object) stackIn_151_0);
                                            stackIn_152_1 = 1;
                                            break L77;
                                          }
                                        }
                                        stackIn_152_0.field_x = stackIn_152_1 != 0;
                                        dupTemp$2 = si.field_i.field_e[var6];
                                        dupTemp$2.field_p = 247 + -wl.field_K.field_m;
                                        si.field_i.field_e[var6].field_q = 247 + -wl.field_K.field_m;
                                        var6++;
                                        continue L76;
                                      }
                                    }
                                  }
                                  wk.field_a.field_c = 114;
                                  wk.field_a.field_d = 34;
                                  re.field_A = 4;
                                  break L60;
                                } else {
                                  L78: {
                                    var19 = var18[var5];
                                    if (var19 == null) {
                                      break L78;
                                    } else {
                                      var19.field_x = false;
                                      var19.field_l = var19.field_l + 1;
                                      if (-4 >= (var19.field_h ^ -1)) {
                                        break L78;
                                      } else {
                                        var19.field_h = var19.field_h + 1;
                                        break L78;
                                      }
                                    }
                                  }
                                  var5++;
                                  continue L71;
                                }
                              }
                            }
                          }
                          re.field_A = 6;
                          break L60;
                        }
                      } else {
                        L79: {
                          if (n.field_a == 10) {
                            break L79;
                          } else {
                            L80: {
                              if (!mg.field_d) {
                                break L80;
                              } else {
                                if (2 != n.field_a) {
                                  break L80;
                                } else {
                                  break L79;
                                }
                              }
                            }
                            var4 = 1;
                            var16 = od.field_g.field_e;
                            var6 = 0;
                            L81: while (true) {
                              L82: {
                                if (var6 >= var16.length) {
                                  break L82;
                                } else {
                                  L83: {
                                    var17 = var16[var6];
                                    if (var17 != null) {
                                      if (var17.field_q != var17.field_p) {
                                        var4 = 0;
                                        break L82;
                                      } else {
                                        if (-115 != (var17.field_p ^ -1)) {
                                          break L83;
                                        } else {
                                          var4 = 0;
                                          var17.field_p = 190;
                                          break L82;
                                        }
                                      }
                                    } else {
                                      break L83;
                                    }
                                  }
                                  var6++;
                                  continue L81;
                                }
                              }
                              L84: {
                                if (n.field_a != 0) {
                                  break L84;
                                } else {
                                  if ((dc.field_a ^ -1) > -51) {
                                    var4 = 0;
                                    break L84;
                                  } else {
                                    if (var4 != 0) {
                                      dc.field_a = 0;
                                      break L84;
                                    } else {
                                      break L84;
                                    }
                                  }
                                }
                              }
                              if (var4 != 0) {
                                re.field_A = 3;
                                break L60;
                              } else {
                                break L60;
                              }
                            }
                          }
                        }
                        var4 = 0;
                        L85: while (true) {
                          if (!pc.b(-128)) {
                            L86: {
                              if (1 != tg.field_d) {
                                break L86;
                              } else {
                                if ((ol.field_b ^ -1) > -265) {
                                  break L86;
                                } else {
                                  if (-429 >= (ol.field_b ^ -1)) {
                                    break L86;
                                  } else {
                                    if (nk.field_c < 376) {
                                      break L86;
                                    } else {
                                      if ((nk.field_c ^ -1) <= -408) {
                                        break L86;
                                      } else {
                                        var4 = 1;
                                        break L86;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L87: {
                              if (1000 <= dc.field_a) {
                                var4 = 1;
                                break L87;
                              } else {
                                break L87;
                              }
                            }
                            L88: {
                              if (var4 == 0) {
                                break L88;
                              } else {
                                if (!mg.field_d) {
                                  if (!qj.b((byte) 97)) {
                                    L89: {
                                      if (0 != hc.field_u) {
                                        stackIn_112_0 = 6;
                                        break L89;
                                      } else {
                                        stackIn_112_0 = 2;
                                        break L89;
                                      }
                                    }
                                    qf.field_d = stackIn_112_0;
                                    break L88;
                                  } else {
                                    qf.field_d = 5;
                                    break L88;
                                  }
                                } else {
                                  mg.field_d = false;
                                  hd.field_a = true;
                                  break L88;
                                }
                              }
                            }
                            decompiledRegionSelector0 = 3;
                            break L0;
                          } else {
                            L90: {
                              L91: {
                                if ((ch.field_d ^ -1) == -14) {
                                  break L91;
                                } else {
                                  if (84 == ch.field_d) {
                                    break L91;
                                  } else {
                                    break L90;
                                  }
                                }
                              }
                              var4 = 1;
                              break L90;
                            }
                            if (13 != ch.field_d) {
                              continue L85;
                            } else {
                              if (!mg.field_d) {
                                continue L85;
                              } else {
                                qf.field_d = 0;
                                decompiledRegionSelector0 = 2;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var4 = 1;
                      var14 = wk.field_a.field_e;
                      var6 = 0;
                      L92: while (true) {
                        L93: {
                          if (var6 >= var14.length) {
                            break L93;
                          } else {
                            L94: {
                              var15 = var14[var6];
                              if (var15 == null) {
                                break L94;
                              } else {
                                if (var15.field_p == var15.field_q) {
                                  if ((var15.field_p ^ -1) != -191) {
                                    break L94;
                                  } else {
                                    var15.field_p = var15.field_p + wl.field_K.field_m;
                                    var4 = 0;
                                    break L93;
                                  }
                                } else {
                                  var4 = 0;
                                  break L93;
                                }
                              }
                            }
                            var6++;
                            continue L92;
                          }
                        }
                        L95: {
                          if (0 == n.field_a) {
                            if (-51 < (dc.field_a ^ -1)) {
                              var4 = 0;
                              break L95;
                            } else {
                              if (var4 != 0) {
                                dc.field_a = 0;
                                break L95;
                              } else {
                                break L95;
                              }
                            }
                          } else {
                            break L95;
                          }
                        }
                        if (var4 == 0) {
                          break L60;
                        } else {
                          re.field_A = 2;
                          break L60;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "ia.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 != -4) {
            field_j = -4;
        }
        field_i = null;
    }

    ia() {
    }

    static {
        field_i = "Menu";
        field_l = "Updates will sent to the email address you've given";
    }
}
