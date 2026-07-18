/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class CrazyCrystals extends eb {
    static String field_C;
    static int field_D;
    public static int field_B;

    public final void init() {
        try {
            ((CrazyCrystals) this).a(-1, "crazycrystals", 14);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "CrazyCrystals.init()");
        }
    }

    private final void g() {
        int var2_int = 0;
        double var2_double = 0.0;
        int var3 = 0;
        we var3_ref_we = null;
        int var4 = 0;
        double var4_double = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12_double = 0.0;
        int var12 = 0;
        int var13 = 0;
        double var14_double = 0.0;
        nj var14 = null;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        uc stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_55_1 = 0;
        f[] stackIn_264_0 = null;
        f[] stackIn_265_0 = null;
        f[] stackIn_266_0 = null;
        int stackIn_266_1 = 0;
        int stackIn_287_0 = 0;
        int stackIn_295_0 = 0;
        int stackIn_295_1 = 0;
        uc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        f[] stackOut_263_0 = null;
        f[] stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        f[] stackOut_264_0 = null;
        int stackOut_264_1 = 0;
        int stackOut_286_0 = 0;
        int stackOut_285_0 = 0;
        int stackOut_294_0 = 0;
        int stackOut_294_1 = 0;
        var20 = field_B;
        if (null != uh.field_p) {
          L0: while (true) {
            if (!ge.b(-92)) {
              uh.field_p.a(true);
              return;
            } else {
              stackOut_3_0 = uh.field_p;
              stackOut_3_1 = 75;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              if (((uc) (Object) stackIn_4_0).b((byte) stackIn_4_1)) {
                ((CrazyCrystals) this).a(true);
                return;
              } else {
                continue L0;
              }
            }
          }
        } else {
          L1: {
            int discarded$7 = 42806;
            fe.b();
            if (!uh.field_n) {
              L2: {
                if (null != ab.field_D) {
                  ab.field_D = ab.field_D.b((byte) -39);
                  if (!r.field_m) {
                    int discarded$8 = 127;
                    gh.i();
                    ((CrazyCrystals) this).a(true);
                    return;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: while (true) {
                if (!ge.b(-45)) {
                  L4: {
                    if (!cp.field_k[vf.field_c]) {
                      break L4;
                    } else {
                      if (!lb.field_k) {
                        if (!qh.field_o.isEmpty()) {
                          break L4;
                        } else {
                          if (en.field_O != 0) {
                            break L4;
                          } else {
                            if (cn.field_d == null) {
                              L5: {
                                lb.field_k = true;
                                if (qp.field_f) {
                                  stackOut_48_0 = 0;
                                  stackIn_49_0 = stackOut_48_0;
                                  break L5;
                                } else {
                                  stackOut_47_0 = 1;
                                  stackIn_49_0 = stackOut_47_0;
                                  break L5;
                                }
                              }
                              qp.field_f = stackIn_49_0 != 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!qp.field_f) {
                    stackOut_54_0 = ~mo.field_f;
                    stackOut_54_1 = -1;
                    stackIn_55_0 = stackOut_54_0;
                    stackIn_55_1 = stackOut_54_1;
                    if (stackIn_55_0 < stackIn_55_1) {
                      mo.field_f = mo.field_f - 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    if (mo.field_f >= 12) {
                      break L1;
                    } else {
                      mo.field_f = mo.field_f + 1;
                      break L1;
                    }
                  }
                } else {
                  var2_int = pj.field_q;
                  if (var2_int == 85) {
                    if (!(ab.field_D instanceof ja)) {
                      int discarded$9 = 0;
                      hc.a(false);
                      continue L3;
                    } else {
                      continue L3;
                    }
                  } else {
                    if (var2_int == 80) {
                      continue L3;
                    } else {
                      if (var2_int != 84) {
                        if (var2_int == 13) {
                          L6: {
                            int discarded$10 = 127;
                            gh.i();
                            if (ab.field_D instanceof ja) {
                              ((ja) (Object) ab.field_D).c((byte) -41);
                              ab.field_D = null;
                              break L6;
                            } else {
                              uh.field_p = (uc) (Object) new p(false);
                              break L6;
                            }
                          }
                          ((CrazyCrystals) this).a(true);
                          return;
                        } else {
                          continue L3;
                        }
                      } else {
                        if (li.field_a != null) {
                          li.field_a = li.field_a.b((byte) -108);
                          continue L3;
                        } else {
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              break L1;
            }
          }
          L7: {
            km.field_d = km.field_d + 1;
            pa.a(tm.field_d, w.field_f, ia.field_i, (byte) -26);
            if (!uh.field_n) {
              L8: {
                L9: {
                  if (qh.field_o.isEmpty()) {
                    break L9;
                  } else {
                    if (en.field_O == 0) {
                      mo.field_f = 0;
                      en.field_O = 1;
                      qp.field_f = false;
                      bq.field_i = ce.b((byte) -124);
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                if (1 != en.field_O) {
                  break L8;
                } else {
                  if (qh.field_o.isEmpty()) {
                    if (null == cn.field_d) {
                      td.field_c = ce.b((byte) -125);
                      if (null == td.field_c) {
                        break L8;
                      } else {
                        ca.field_j = 0;
                        cn.field_d = bq.field_i;
                        mi.i(22075);
                        en.field_O = 0;
                        break L8;
                      }
                    } else {
                      en.field_O = 0;
                      break L8;
                    }
                  } else {
                    break L8;
                  }
                }
              }
              L10: {
                if (en.field_O != 0) {
                  break L10;
                } else {
                  if (cn.field_d == null) {
                    break L10;
                  } else {
                    ca.field_j = ca.field_j + 1;
                    if (~ca.field_j <= ~ia.field_g) {
                      bq.field_i = td.field_c;
                      cn.field_d = null;
                      break L7;
                    } else {
                      if (ca.field_j <= 0) {
                        bq.field_i = cn.field_d;
                        break L7;
                      } else {
                        L11: {
                          L12: {
                            var2_double = (double)ca.field_j / (double)ia.field_g;
                            var4_double = cn.field_d[0] / cn.field_d[2];
                            var6 = cn.field_d[1] / cn.field_d[2];
                            var8 = td.field_c[0] / td.field_c[2];
                            var10 = td.field_c[1] / td.field_c[2];
                            var12_double = cn.field_d[2];
                            var14_double = td.field_c[2];
                            var16 = var12_double * Math.pow(var14_double / var12_double, var2_double);
                            var18 = (-(1.0 / var12_double) + 1.0 / var16) / (-(1.0 / var12_double) + 1.0 / var14_double);
                            if (Double.isNaN(var18)) {
                              break L12;
                            } else {
                              if (0.0 > var18) {
                                break L12;
                              } else {
                                if (var18 > 1.0) {
                                  break L12;
                                } else {
                                  break L11;
                                }
                              }
                            }
                          }
                          var18 = var2_double;
                          break L11;
                        }
                        bq.field_i = new double[]{var16 * (var18 * (-var4_double + var8) + var4_double), var16 * (var6 + (-var6 + var10) * var18), var16};
                        break L7;
                      }
                    }
                  }
                }
              }
              if (qh.field_o.isEmpty()) {
                tm.field_e = tm.field_e + 1;
                ij.a(w.field_f, -2, ia.field_i, tm.field_d);
                if (0 != en.field_O) {
                  break L7;
                } else {
                  L13: {
                    bq.field_i = ce.b((byte) -125);
                    if (bq.field_i == null) {
                      bq.field_i = kd.field_l;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  if (mo.field_f <= 0) {
                    break L7;
                  } else {
                    L14: {
                      L15: {
                        var2_double = (double)mo.field_f / 12.0;
                        var4_double = bq.field_i[0] / bq.field_i[2];
                        var6 = bq.field_i[1] / bq.field_i[2];
                        var8 = kd.field_l[0] / kd.field_l[2];
                        var10 = kd.field_l[1] / kd.field_l[2];
                        var12_double = bq.field_i[2];
                        var14_double = kd.field_l[2];
                        var16 = Math.pow(var14_double / var12_double, var2_double) * var12_double;
                        var18 = (-(1.0 / var12_double) + 1.0 / var16) / (1.0 / var14_double - 1.0 / var12_double);
                        if (Double.isNaN(var18)) {
                          break L15;
                        } else {
                          if (0.0 > var18) {
                            break L15;
                          } else {
                            if (var18 > 1.0) {
                              break L15;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      var18 = var2_double;
                      break L14;
                    }
                    bq.field_i = new double[]{var16 * (var18 * (var8 - var4_double) + var4_double), var16 * ((-var6 + var10) * var18 + var6), var16};
                    break L7;
                  }
                }
              } else {
                break L7;
              }
            } else {
              break L7;
            }
          }
          int discarded$11 = 127;
          gh.i();
          L16: {
            if (uh.field_n) {
              break L16;
            } else {
              if (ab.field_D != null) {
                break L16;
              } else {
                var2_int = 3;
                var3 = 1 + ia.field_i;
                L17: while (true) {
                  if (-1 + (-ia.field_i + tm.field_d.length) <= var3) {
                    if ((1 & var2_int) == 0) {
                      if ((var2_int & 2) != 0) {
                        ab.field_D = (te) (Object) new r();
                        break L16;
                      } else {
                        break L16;
                      }
                    } else {
                      L18: {
                        if (uo.field_o == ke.field_b[jo.field_o]) {
                          L19: {
                            ei.field_F = ei.field_F + 8;
                            sm.field_f = sm.field_f + 8;
                            ka.field_n = ka.field_n + 4;
                            je.field_j = je.field_j + 5;
                            we.field_h = we.field_h + 8;
                            fp.field_a = fp.field_a + 8;
                            b.field_a = b.field_a + 4;
                            qk.field_F = qk.field_F + 5;
                            var3_ref_we = new we(jo.field_o, uo.field_o, we.field_h, b.field_a, je.field_j, fp.field_a);
                            if (!rc.a(-89)) {
                              lj.a(5, var3_ref_we, -93);
                              break L19;
                            } else {
                              ec.field_l.b(0, (jb) (Object) var3_ref_we);
                              break L19;
                            }
                          }
                          ke.field_b[jo.field_o] = uo.field_o - -1;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L20: {
                        if (uo.field_o > ke.field_b[jo.field_o]) {
                          break L20;
                        } else {
                          L21: {
                            if (jo.field_o == 1) {
                              L22: {
                                if (9 != uo.field_o) {
                                  break L22;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 255, je.field_j, 0, fp.field_a);
                                  break L22;
                                }
                              }
                              L23: {
                                if (19 != uo.field_o) {
                                  break L23;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 254, je.field_j, 1, fp.field_a);
                                  break L23;
                                }
                              }
                              L24: {
                                if (uo.field_o != 39) {
                                  break L24;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 253, je.field_j, 2, fp.field_a);
                                  break L24;
                                }
                              }
                              L25: {
                                if (59 != uo.field_o) {
                                  break L25;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 252, je.field_j, 3, fp.field_a);
                                  break L25;
                                }
                              }
                              if (uo.field_o != 69) {
                                break L21;
                              } else {
                                rc.a(1, we.field_h, b.field_a, 251, je.field_j, 4, fp.field_a);
                                break L21;
                              }
                            } else {
                              break L21;
                            }
                          }
                          L26: {
                            if (jo.field_o == 4) {
                              L27: {
                                if (uo.field_o == 4) {
                                  rc.a(1, we.field_h, b.field_a, 250, je.field_j, 5, fp.field_a);
                                  break L27;
                                } else {
                                  break L27;
                                }
                              }
                              L28: {
                                if (14 == uo.field_o) {
                                  rc.a(1, we.field_h, b.field_a, 249, je.field_j, 6, fp.field_a);
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              L29: {
                                if (uo.field_o == 24) {
                                  rc.a(1, we.field_h, b.field_a, 248, je.field_j, 7, fp.field_a);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              L30: {
                                ld.field_y = ld.field_y + q.field_a[2].field_d;
                                if (ld.field_y >= 30) {
                                  rc.a(1, we.field_h, b.field_a, 243, je.field_j, 12, fp.field_a);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              L31: {
                                if (uo.field_o != 11) {
                                  break L31;
                                } else {
                                  if (va.field_d != 0) {
                                    rc.a(1, we.field_h, b.field_a, 242, je.field_j, 13, fp.field_a);
                                    break L31;
                                  } else {
                                    break L31;
                                  }
                                }
                              }
                              L32: {
                                if (uo.field_o != 15) {
                                  break L32;
                                } else {
                                  if (3000 <= tm.field_e) {
                                    break L32;
                                  } else {
                                    rc.a(1, we.field_h, b.field_a, 241, je.field_j, 14, fp.field_a);
                                    break L32;
                                  }
                                }
                              }
                              if (uo.field_o != 9) {
                                break L26;
                              } else {
                                if (va.field_d == 0) {
                                  break L26;
                                } else {
                                  if (ol.field_B == 0) {
                                    break L26;
                                  } else {
                                    rc.a(1, we.field_h, b.field_a, 240, je.field_j, 15, fp.field_a);
                                    break L26;
                                  }
                                }
                              }
                            } else {
                              break L26;
                            }
                          }
                          L33: {
                            if (!ai.a(100, 0)) {
                              break L33;
                            } else {
                              if (uo.field_o + -dk.field_h != 12) {
                                break L33;
                              } else {
                                rc.a(1, we.field_h, b.field_a, 239, je.field_j, 16, fp.field_a);
                                break L33;
                              }
                            }
                          }
                          gh.j(-10935);
                          break L20;
                        }
                      }
                      ab.field_D = (te) (Object) new ja();
                      break L16;
                    }
                  } else {
                    var4 = 1 + w.field_f;
                    L34: while (true) {
                      if (~(-w.field_f + tm.field_d[0].length + -1) >= ~var4) {
                        var3++;
                        continue L17;
                      } else {
                        var2_int = var2_int & tm.field_d[var3][var4].d(-92);
                        var4++;
                        continue L34;
                      }
                    }
                  }
                }
              }
            }
          }
          L35: {
            if (null == li.field_a) {
              if (!vh.field_a) {
                break L35;
              } else {
                if (!qh.field_o.isEmpty()) {
                  break L35;
                } else {
                  if (0 != en.field_O) {
                    break L35;
                  } else {
                    if (null != cn.field_d) {
                      break L35;
                    } else {
                      if (ab.field_D instanceof ja) {
                        break L35;
                      } else {
                        if (!go.field_i) {
                          int discarded$12 = 127;
                          va.a();
                          break L35;
                        } else {
                          break L35;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              li.field_a = li.field_a.c(-28530);
              break L35;
            }
          }
          L36: {
            if (uh.field_n) {
              break L36;
            } else {
              if (pj.field_v != 0) {
                if (to.field_a >= 480) {
                  L37: {
                    if (null != ab.field_D) {
                      break L37;
                    } else {
                      if (vh.field_a) {
                        break L37;
                      } else {
                        if (dp.field_h < 48) {
                          break L37;
                        } else {
                          if (158 > dp.field_h) {
                            var2_int = 0;
                            var3 = 0;
                            L38: while (true) {
                              if (var3 >= 3) {
                                var3 = -(var2_int * 26) + 562;
                                var4 = 0;
                                L39: while (true) {
                                  if (var4 >= 3) {
                                    break L37;
                                  } else {
                                    L40: {
                                      if (q.field_a[var4].field_b) {
                                        L41: {
                                          if (oe.field_a[var4] == null) {
                                            break L41;
                                          } else {
                                            if (~var3 < ~to.field_a) {
                                              break L41;
                                            } else {
                                              if (~to.field_a <= ~(var3 + 48)) {
                                                break L41;
                                              } else {
                                                li.field_a = oe.field_a[var4].a(23525, li.field_a);
                                                break L37;
                                              }
                                            }
                                          }
                                        }
                                        var3 += 52;
                                        break L40;
                                      } else {
                                        break L40;
                                      }
                                    }
                                    var4++;
                                    continue L39;
                                  }
                                }
                              } else {
                                L42: {
                                  if (q.field_a[var3].field_b) {
                                    var2_int++;
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                                var3++;
                                continue L38;
                              }
                            }
                          } else {
                            break L37;
                          }
                        }
                      }
                    }
                  }
                  L43: {
                    if (dp.field_h < 158) {
                      break L43;
                    } else {
                      if (null != li.field_a) {
                        li.field_a = li.field_a.b((byte) -125);
                        break L36;
                      } else {
                        break L43;
                      }
                    }
                  }
                  L44: {
                    if (vh.field_a) {
                      break L44;
                    } else {
                      if (null == ab.field_D) {
                        L45: {
                          if (to.field_a < 506) {
                            break L45;
                          } else {
                            if (614 > to.field_a) {
                              var2_int = 158;
                              var3 = 0;
                              L46: while (true) {
                                if (2 <= var3) {
                                  break L45;
                                } else {
                                  L47: {
                                    if (gm.field_c[var3] <= 0) {
                                      break L47;
                                    } else {
                                      if (dp.field_h < 12 + var2_int) {
                                        break L47;
                                      } else {
                                        if (dp.field_h < var2_int - -60) {
                                          L48: {
                                            stackOut_263_0 = lm.field_d;
                                            stackIn_265_0 = stackOut_263_0;
                                            stackIn_264_0 = stackOut_263_0;
                                            if (var3 == 0) {
                                              stackOut_265_0 = (f[]) (Object) stackIn_265_0;
                                              stackOut_265_1 = 15;
                                              stackIn_266_0 = stackOut_265_0;
                                              stackIn_266_1 = stackOut_265_1;
                                              break L48;
                                            } else {
                                              stackOut_264_0 = (f[]) (Object) stackIn_264_0;
                                              stackOut_264_1 = 25;
                                              stackIn_266_0 = stackOut_264_0;
                                              stackIn_266_1 = stackOut_264_1;
                                              break L48;
                                            }
                                          }
                                          li.field_a = ((f) (Object) stackIn_266_0[stackIn_266_1]).a(23525, li.field_a);
                                          break L45;
                                        } else {
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                  var2_int += 48;
                                  var3++;
                                  continue L46;
                                }
                              }
                            } else {
                              break L45;
                            }
                          }
                        }
                        if (!qh.field_o.isEmpty()) {
                          break L44;
                        } else {
                          if (en.field_O != 0) {
                            break L44;
                          } else {
                            if (cn.field_d != null) {
                              break L44;
                            } else {
                              L49: {
                                var2_int = go.field_l.a(f.field_e, 152);
                                var3 = -(10 * var2_int) + 100;
                                if (3 <= var2_int) {
                                  var3 += 10;
                                  break L49;
                                } else {
                                  break L49;
                                }
                              }
                              var4 = var3 - -(var2_int * 20);
                              if (480 > to.field_a) {
                                break L44;
                              } else {
                                if (640 <= to.field_a) {
                                  break L44;
                                } else {
                                  if (~(var3 + 282) < ~dp.field_h) {
                                    break L44;
                                  } else {
                                    if (dp.field_h >= var4 + 282) {
                                      break L44;
                                    } else {
                                      L50: {
                                        if (qp.field_f) {
                                          stackOut_286_0 = 0;
                                          stackIn_287_0 = stackOut_286_0;
                                          break L50;
                                        } else {
                                          stackOut_285_0 = 1;
                                          stackIn_287_0 = stackOut_285_0;
                                          break L50;
                                        }
                                      }
                                      qp.field_f = stackIn_287_0 != 0;
                                      break L44;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L44;
                      }
                    }
                  }
                  L51: {
                    var2_int = 460;
                    if (!(ab.field_D instanceof ja)) {
                      stackOut_294_0 = ~dp.field_h;
                      stackOut_294_1 = ~var2_int;
                      stackIn_295_0 = stackOut_294_0;
                      stackIn_295_1 = stackOut_294_1;
                      L52: {
                        if (stackIn_295_0 > stackIn_295_1) {
                          break L52;
                        } else {
                          if (~dp.field_h <= ~(var2_int - -20)) {
                            break L52;
                          } else {
                            uh.field_p = (uc) (Object) new p(true);
                            break L52;
                          }
                        }
                      }
                      var2_int -= 20;
                      if (dp.field_h < var2_int) {
                        break L51;
                      } else {
                        if (20 + var2_int <= dp.field_h) {
                          break L51;
                        } else {
                          int discarded$13 = 0;
                          hc.a(true);
                          break L51;
                        }
                      }
                    } else {
                      if (dp.field_h < var2_int) {
                        break L51;
                      } else {
                        if (dp.field_h >= 20 + var2_int) {
                          break L51;
                        } else {
                          ((ja) (Object) ab.field_D).c((byte) -41);
                          ab.field_D = null;
                          break L51;
                        }
                      }
                    }
                  }
                  break L36;
                } else {
                  if (null == ab.field_D) {
                    L53: {
                      var2_double = bq.field_i[0];
                      var4_double = bq.field_i[1];
                      var6 = bq.field_i[2];
                      var8 = 240.0 - var2_double;
                      var10 = -var4_double + (240.0 + var6 / 2.0);
                      var12 = (int)Math.floor(((double)to.field_a - var8) / (var6 * 2.0));
                      var13 = (int)Math.floor(((double)dp.field_h - var10) / (var6 * 2.0));
                      if (var12 < 0) {
                        break L53;
                      } else {
                        if (~var12 <= ~tm.field_d[0].length) {
                          break L53;
                        } else {
                          if (var13 < 0) {
                            break L53;
                          } else {
                            if (var13 < tm.field_d.length) {
                              var14 = tm.field_d[var13][var12].a(23525, li.field_a);
                              if (null == var14) {
                                break L53;
                              } else {
                                li.field_a = var14;
                                break L53;
                              }
                            } else {
                              break L53;
                            }
                          }
                        }
                      }
                    }
                    break L36;
                  } else {
                    break L36;
                  }
                }
              } else {
                break L36;
              }
            }
          }
          return;
        }
    }

    final void c(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              CrazyCrystals.m(param0 + 30555);
              int discarded$169 = -1;
              ne.a();
              int discarded$170 = 7279;
              bd.e();
              vf.a((byte) -117);
              int discarded$171 = 0;
              jf.a();
              int discarded$172 = 127;
              cn.a();
              int discarded$173 = 78;
              eb.f();
              ub.a(true);
              wa.e(5);
              int discarded$174 = 8076;
              ai.a();
              a.a(true);
              int discarded$175 = -122;
              jm.a();
              kh.d();
              db.b((byte) 127);
              int discarded$176 = 64;
              dg.b();
              hf.b(4);
              ng.e((byte) -125);
              lo.a(param0 + -183);
              int discarded$177 = -85;
              ll.a();
              oe.a(-106);
              int discarded$178 = -85;
              vl.a();
              int discarded$179 = 0;
              lp.a();
              int discarded$180 = 1;
              qi.a();
              int discarded$181 = 110;
              ui.a();
              q.a(param0 + -3680);
              uf.a(0);
              sn.a((byte) -123);
              int discarded$182 = 20;
              gf.a();
              gm.a(true);
              int discarded$183 = 127;
              ke.a();
              int discarded$184 = -26389;
              bc.b();
              vm.b((byte) 119);
              dd.a(param0 ^ -45);
              oa.b(-98);
              f.a(100);
              id.b();
              wg.e(64);
              int discarded$185 = 117;
              am.a();
              int discarded$186 = 127;
              me.a();
              int discarded$187 = 118;
              wb.f();
              int discarded$188 = 1;
              sg.a();
              int discarded$189 = 1;
              fq.b();
              vh.b((byte) -114);
              nj.a(12);
              int discarded$190 = -77;
              te.a();
              int discarded$191 = 0;
              uc.a();
              int discarded$192 = 12554;
              ob.a();
              int discarded$193 = 120;
              pk.b();
              qa.a(param0 + -6231);
              int discarded$194 = 45;
              j.a();
              bn.a((byte) -3);
              kp.b(false);
              mj.a((byte) -64);
              int discarded$195 = -1;
              ea.f();
              jb.c(-24894);
              int discarded$196 = -124;
              pl.a();
              ic.g();
              ka.a((byte) 120);
              int discarded$197 = -109;
              to.a();
              int discarded$198 = 2;
              rp.b();
              dn.a(param0 + -210);
              kb.a(-96);
              vc.a();
              ij.d(1);
              int discarded$199 = 0;
              wi.a();
              jh.a(18744);
              re.d((byte) -97);
              int discarded$200 = -113;
              ge.a();
              int discarded$201 = 0;
              hj.a();
              int discarded$202 = -121;
              oc.a();
              int discarded$203 = -102;
              lc.c();
              int discarded$204 = 122;
              g.a();
              int discarded$205 = -21017;
              hc.a();
              vj.a(26988);
              int discarded$206 = 51;
              qg.a();
              ih.a(param0 + 13);
              int discarded$207 = -29;
              lk.a();
              int discarded$208 = 119;
              pn.c();
              if (param0 == 89) {
                break L1;
              } else {
                CrazyCrystals.a(107, 81, 58, -104, (int[]) null, (int[]) null, -4, -89);
                break L1;
              }
            }
            int discarded$209 = 1;
            sl.b();
            mi.h(-20188);
            fb.a((byte) -50);
            int discarded$210 = -123;
            gg.b();
            int discarded$211 = 0;
            td.a();
            int discarded$212 = 19266;
            ag.a();
            int discarded$213 = 76;
            bp.a();
            ol.i(param0 ^ 89);
            int discarded$214 = 0;
            sa.d();
            kl.h((byte) -1);
            ck.l(param0 ^ 29);
            na.m(-18883);
            int discarded$215 = 81;
            dc.j();
            int discarded$216 = 20;
            ae.a();
            vk.a(-23);
            qk.j(-26005);
            int discarded$217 = 15157;
            rh.c();
            nd.a(32);
            int discarded$218 = -72;
            ao.b();
            int discarded$219 = 30447;
            lj.a();
            int discarded$220 = 100;
            rb.c();
            int discarded$221 = -1;
            rg.a();
            int discarded$222 = 3;
            de.f();
            pj.g(param0 ^ -39);
            bo.f(0);
            int discarded$223 = -100;
            vn.c();
            m.c((byte) -124);
            jo.f(6);
            em.b(param0 ^ -66);
            mc.b((byte) 126);
            bl.c();
            ej.b();
            nm.a();
            int discarded$224 = 27;
            r.d();
            ff.c(param0 ^ -18779);
            ja.d(27348);
            int discarded$225 = -104;
            kn.g();
            int discarded$226 = -1;
            c.g();
            bb.b(true);
            qf.e((byte) -72);
            int discarded$227 = 4;
            ro.f();
            gh.k(0);
            int discarded$228 = 0;
            cd.b();
            gi.b(true);
            cj.f((byte) -21);
            int discarded$229 = 996201186;
            cb.f();
            aa.a(param0 + 20204);
            int discarded$230 = -105;
            jl.a();
            int discarded$231 = -1246;
            hd.a();
            int discarded$232 = 19;
            wh.a();
            int discarded$233 = -111;
            mg.b();
            int discarded$234 = 0;
            md.j();
            vg.a(8877);
            int discarded$235 = 0;
            ua.a();
            int discarded$236 = -8130;
            d.a();
            int discarded$237 = 0;
            nc.b();
            p.b(-1);
            nn.a(-127);
            wm.b(-1);
            int discarded$238 = -66;
            bm.a();
            km.e(0);
            int discarded$239 = 100;
            ld.f();
            int discarded$240 = 113;
            sp.a();
            mf.f(param0 + -20);
            ee.d(0);
            int discarded$241 = -117;
            gl.a();
            int discarded$242 = 54;
            rk.a();
            int discarded$243 = -89;
            wl.c();
            cm.b(-121);
            int discarded$244 = 0;
            gn.e();
            int discarded$245 = 0;
            rc.a();
            int discarded$246 = -114;
            lb.a();
            nb.c();
            qj.a(param0 ^ 84);
            int discarded$247 = -2;
            hm.b();
            jg.a(32767);
            int discarded$248 = -18277;
            cc.a();
            int discarded$249 = -11774;
            so.a();
            on.a((byte) -128);
            int discarded$250 = 1;
            vo.a();
            int discarded$251 = 0;
            je.a();
            int discarded$252 = 46;
            dj.a();
            int discarded$253 = -14;
            vp.a();
            int discarded$254 = -126;
            pg.a();
            tf.a(param0 + -215);
            int discarded$255 = 114;
            v.a();
            int discarded$256 = 100;
            qb.a();
            di.a();
            qn.a(param0 + 169);
            int discarded$257 = 102;
            pi.a();
            h.a(0);
            kf.a(param0 ^ -90);
            int discarded$258 = -121;
            fl.a();
            fk.b(param0 + -5171);
            gk.a(-125);
            int discarded$259 = -103;
            ip.a();
            tb.b(param0 ^ -2180);
            qm.g(1);
            int discarded$260 = -58;
            pc.d();
            om.e((byte) 122);
            int discarded$261 = 0;
            en.i();
            int discarded$262 = 0;
            ab.c();
            og.h(param0 ^ 736);
            tm.a(-11909);
            int discarded$263 = 0;
            cf.a();
            jc.a(param0 + 33469896);
            int discarded$264 = -100;
            tg.a();
            int discarded$265 = 31039;
            lg.b();
            b.a(param0 ^ 89);
            int discarded$266 = 1;
            ra.a();
            int discarded$267 = 65;
            jj.a();
            int discarded$268 = -98;
            wp.a();
            int discarded$269 = 2;
            tl.b();
            va.a(true);
            int discarded$270 = 118;
            s.b();
            tk.a((byte) -125);
            df.a(-20012);
            al.a(param0 + 31664);
            ma.f(125);
            dm.a(param0 + 14137);
            int discarded$271 = 55;
            dk.a();
            int discarded$272 = 112;
            cp.a();
            int discarded$273 = 33;
            pf.f();
            ig.f(24);
            ah.a((byte) 40);
            fm.f(-108);
            ji.e((byte) -8);
            tn.f(param0 + 10);
            int discarded$274 = 2;
            el.b();
            nl.b(0);
            qo.b((byte) -64);
            int discarded$275 = -59;
            uo.c();
            int discarded$276 = 1;
            jk.a();
            int discarded$277 = -46;
            ei.f();
            int discarded$278 = 54;
            sd.h();
            int discarded$279 = 0;
            ga.o();
            int discarded$280 = -124;
            ud.h();
            co.a(2);
            int discarded$281 = -7397;
            nh.a();
            rf.e((byte) -98);
            sb.e((byte) 2);
            io.h(param0 + -211);
            int discarded$282 = 3;
            of.h();
            se.d((byte) -96);
            fj.b(param0 ^ 45);
            int discarded$283 = 1;
            ph.c();
            pa.e((byte) -104);
            dq.f((byte) -69);
            bk.a();
            kj.a(-99);
            int discarded$284 = 0;
            af.c();
            int discarded$285 = 855;
            ch.a();
            int discarded$286 = 0;
            oj.f();
            ed.f((byte) 87);
            int discarded$287 = 21732;
            sj.a();
            int discarded$288 = 32;
            ug.b();
            int discarded$289 = -48;
            be.a();
            int discarded$290 = 31438;
            ib.g();
            int discarded$291 = 400;
            qd.i();
            wf.c(0);
            int discarded$292 = 16777215;
            la.a();
            ii.a(param0 + -179);
            int discarded$293 = 0;
            wk.a();
            int discarded$294 = 77;
            ak.a();
            int discarded$295 = 20974;
            hp.a();
            tp.a(7566);
            int discarded$296 = -34;
            sc.b();
            ok.a(false);
            int discarded$297 = -107;
            wc.b();
            aq.b(param0 + -201);
            int discarded$298 = 108;
            wn.a();
            th.h(param0 ^ -13158);
            int discarded$299 = 0;
            ce.b();
            int discarded$300 = 1;
            hb.b();
            lm.a(-26377);
            int discarded$301 = 2;
            pp.a();
            int discarded$302 = -22523;
            we.a();
            int discarded$303 = -127;
            dp.a();
            ca.a(param0 ^ 89);
            int discarded$304 = 105;
            ik.a();
            int discarded$305 = -2;
            nk.c();
            int discarded$306 = -70;
            mh.c();
            si.a(param0 ^ 14362);
            int discarded$307 = 0;
            e.a();
            int discarded$308 = -27838;
            mk.b();
            mo.a(-60);
            jd.e((byte) 54);
            hl.b(param0 + 25559);
            int discarded$309 = -118;
            fe.d();
            int discarded$310 = -101;
            l.a();
            o.c(58);
            ec.a(param0 + -85);
            int discarded$311 = 1;
            ia.a();
            int discarded$312 = 17659;
            qe.a();
            ba.b(48);
            int discarded$313 = 1;
            fn.a();
            int discarded$314 = 124;
            fh.a();
            le.b(-1);
            go.b((byte) 54);
            ln.a((byte) -128);
            kk.a(param0 + -192);
            pb.a(param0 ^ -31326);
            int discarded$315 = 6388;
            hk.b();
            int discarded$316 = 32;
            oh.b();
            rl.e(120);
            qc.c((byte) 124);
            int discarded$317 = 39;
            nf.c();
            int discarded$318 = 1;
            pd.a();
            int discarded$319 = 1;
            rd.a();
            ta.a(true);
            gj.d(19);
            ek.b(16);
            ul.b(true);
            int discarded$320 = 0;
            ad.c();
            eq.f(1);
            sh.c(126);
            int discarded$321 = 35;
            aj.g();
            int discarded$322 = 23;
            ac.d();
            uk.c(89);
            fg.c(121);
            int discarded$323 = 19;
            mn.c();
            int discarded$324 = -128;
            rn.c();
            int discarded$325 = 92;
            ti.c();
            cl.c(param0 + -45);
            int discarded$326 = 88;
            qh.c();
            il.a(false);
            int discarded$327 = 10;
            sm.b();
            int discarded$328 = 11458;
            mb.a();
            int discarded$329 = 1;
            fa.a();
            uh.c(param0 ^ 217);
            int discarded$330 = 1;
            bq.a();
            an.b((byte) 118);
            wd.c(param0 ^ 31368);
            int discarded$331 = -125;
            bf.a();
            pe.d(1);
            qp.a(param0 + 1095153591);
            pm.a((byte) 35);
            bh.a(param0 ^ -90);
            int discarded$332 = 1;
            no.b();
            int discarded$333 = -31737;
            jn.d();
            int discarded$334 = -33;
            kd.e();
            int discarded$335 = 70;
            ci.d();
            fp.a((byte) 125);
            int discarded$336 = -56;
            fo.a();
            int discarded$337 = 118;
            oi.a();
            li.c(param0 + 261);
            jp.a((byte) 120);
            ((CrazyCrystals) this).field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.A(" + param0 + ')');
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 480) {
            return;
          } else {
            var9 = mi.field_A[var8];
            param2 = param7;
            param6 = param7 + var9 - param3;
            L1: while (true) {
              if (param2 >= param6) {
                L2: {
                  param6 = param6 + (param3 + param3);
                  param7 += 640;
                  if (param6 <= param7) {
                    break L2;
                  } else {
                    param6 = param7;
                    break L2;
                  }
                }
                L3: while (true) {
                  if (param2 >= param6) {
                    L4: while (true) {
                      if (param2 >= param7) {
                        var8++;
                        continue L0;
                      } else {
                        param4[param2] = param5[param2 - param3];
                        param2++;
                        continue L4;
                      }
                    }
                  } else {
                    param0 = param4[param2];
                    param0 = ((param0 & 16711935) * param1 & -16711936) + ((param0 & 65280) * param1 & 16711680);
                    int incrementValue$1 = param2;
                    param2++;
                    param4[incrementValue$1] = param0 >>> 8;
                    continue L3;
                  }
                }
              } else {
                param4[param2] = param5[param2 + param3];
                param2++;
                continue L1;
              }
            }
          }
        }
    }

    final void a(int param0) {
        RuntimeException var2 = null;
        java.awt.Canvas var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var4_ref_int__ = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_43_0 = 0;
        int stackIn_60_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_59_0 = false;
        int stackOut_57_0 = 0;
        boolean stackOut_42_0 = false;
        int stackOut_40_0 = 0;
        var10 = field_B;
        try {
          L0: {
            L1: {
              if (param0 <= -119) {
                break L1;
              } else {
                ((CrazyCrystals) this).c(101);
                break L1;
              }
            }
            int discarded$20 = 128;
            var2_ref = gd.c();
            if (aj.e((byte) 114)) {
              int discarded$21 = 2;
              int discarded$22 = -59;
              pl.a(al.a(), var2_ref);
              return;
            } else {
              if (!ij.field_i) {
                to.a(0, var2_ref);
                return;
              } else {
                fo.a(0);
                int discarded$23 = 1;
                if (ul.a()) {
                  L2: {
                    if (null != a.field_b) {
                      L3: {
                        a.field_b.b(8);
                        int discarded$24 = 136;
                        if (fj.a()) {
                          break L3;
                        } else {
                          if (cb.field_w > 0) {
                            break L3;
                          } else {
                            if (j.c((byte) -23)) {
                              L4: {
                                if (ph.field_E == null) {
                                  stackOut_59_0 = mb.field_d;
                                  stackIn_60_0 = stackOut_59_0 ? 1 : 0;
                                  break L4;
                                } else {
                                  stackOut_57_0 = 1;
                                  stackIn_60_0 = stackOut_57_0;
                                  break L4;
                                }
                              }
                              int discarded$25 = 7923;
                              fe.a(stackIn_60_0 != 0);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      int discarded$26 = 255;
                      var3 = ub.a();
                      var4 = rl.c((byte) 95);
                      var5 = 320 + (-(var3 / 2) + -30);
                      var6 = 30 + (var3 / 2 + 320);
                      var7 = var5 + cb.field_w * ((var6 - var5) * cb.field_w) / 400;
                      var8 = -20 + -(var4 / 2) + 240;
                      var9 = var4 / 2 + 260;
                      wi.a(var5, jn.field_o, var8, var9 - var8, (byte) -71, -var5 + var7);
                      kh.d(var5 - -8, var8 + 8, -16 + (var7 + -var5), -16 + -var8 + var9, 0, 192);
                      int discarded$27 = 136;
                      if (!fj.a()) {
                        break L2;
                      } else {
                        if (20 != cb.field_w) {
                          break L2;
                        } else {
                          wp.b((byte) -110);
                          break L2;
                        }
                      }
                    } else {
                      L5: {
                        if (r.field_m) {
                          int discarded$28 = -26477;
                          dq.a();
                          int discarded$29 = 480;
                          qb.b();
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      int discarded$30 = 136;
                      if (fj.a()) {
                        int discarded$31 = 255;
                        var3 = ub.a();
                        var4 = rl.c((byte) 76);
                        go.a((var4 + 41) / 24, (var3 + 35) / 24, false);
                        wp.b((byte) -99);
                        break L2;
                      } else {
                        L6: {
                          if (null != uh.field_p) {
                            uh.field_p.a((byte) 127);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        L7: {
                          if (r.field_m) {
                            var3 = qn.field_n;
                            if (640 <= var3) {
                              break L7;
                            } else {
                              var4_ref_int__ = ge.field_d.field_w;
                              var5_ref_int__ = kh.field_i;
                              var6 = (var3 << 7) / 640 + 128;
                              var7 = 0;
                              CrazyCrystals.a(0, var6, 0, var3, var5_ref_int__, var4_ref_int__, 0, var7);
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        int discarded$32 = 0;
                        if (!gn.d()) {
                          break L2;
                        } else {
                          L8: {
                            if (ph.field_E == null) {
                              stackOut_42_0 = mb.field_d;
                              stackIn_43_0 = stackOut_42_0 ? 1 : 0;
                              break L8;
                            } else {
                              stackOut_40_0 = 1;
                              stackIn_43_0 = stackOut_40_0;
                              break L8;
                            }
                          }
                          int discarded$33 = 7923;
                          fe.a(stackIn_43_0 != 0);
                          break L2;
                        }
                      }
                    }
                  }
                  L9: {
                    if (rb.field_h < 2) {
                      break L9;
                    } else {
                      if (sg.field_a) {
                        var3 = (int)(Runtime.getRuntime().freeMemory() / 1024L);
                        var4 = (int)(Runtime.getRuntime().totalMemory() / 1024L);
                        an.field_q.b(-var3 + var4 + " kB / " + var4 + " kB", 636, 16, 16777215, -1);
                        an.field_q.b(p.field_j + " fps", 636, 30, 16777215, -1);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  }
                  int discarded$34 = 4;
                  int discarded$35 = 0;
                  int discarded$36 = 0;
                  bq.a(var2_ref);
                  break L0;
                } else {
                  int discarded$37 = 0;
                  td.a(96.0f, rh.field_e);
                  to.a(0, var2_ref);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.I(" + param0 + ')');
        }
    }

    private final void d() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ak.field_f != null) {
                tl.a(121, ak.field_f);
                ak.field_f = null;
                vp.a(103);
                break L1;
              } else {
                break L1;
              }
            }
            l.field_d = mi.c(1, -115);
            uf.field_e = mi.c(7, -123);
            md.field_p = mi.c(9, -97);
            vm.field_k = we.a(true, (byte) -127, true, true, 2);
            ma.field_p = we.a(true, (byte) -111, true, true, 4);
            rl.field_i = we.a(true, (byte) -51, true, true, 8);
            mg.field_c = we.a(true, (byte) -70, true, true, 3);
            mg.field_g = we.a(true, (byte) -124, true, true, 5);
            ba.field_k = we.a(true, (byte) -46, true, true, 0);
            io.a(4096, lo.field_a, dj.field_ab);
            qd.a(-91, 60);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.Q(" + true + ')');
        }
    }

    public CrazyCrystals() {
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null == ph.field_E) {
                break L1;
              } else {
                q.a(false);
                break L1;
              }
            }
            L2: {
              if (hb.field_h == null) {
                break L2;
              } else {
                hb.field_h.d();
                break L2;
              }
            }
            L3: {
              if (null == gf.field_c) {
                break L3;
              } else {
                gf.field_c.d();
                break L3;
              }
            }
            L4: {
              ue.b((byte) -106);
              if (param0 == 241) {
                break L4;
              } else {
                field_D = 122;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.J(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        byte[] var3 = null;
        dl[] var3_array = null;
        dl var3_ref = null;
        int var3_int = 0;
        wj[] var4_ref_wj__ = null;
        int var4 = 0;
        int var5 = 0;
        dl[] var6_ref_dl__ = null;
        int var6 = 0;
        Object var7 = null;
        dl[] var8_ref_dl__ = null;
        int var8 = 0;
        dl[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = field_B;
          if (null != fq.field_x) {
            break L0;
          } else {
            L1: {
              if (!dj.field_ab.a((byte) 102)) {
                break L1;
              } else {
                if (!dj.field_ab.a(-20402, "basic")) {
                  break L1;
                } else {
                  L2: {
                    if (!l.field_d.a((byte) 102)) {
                      break L2;
                    } else {
                      if (!l.field_d.a(-20402, "")) {
                        break L2;
                      } else {
                        L3: {
                          if (!uf.field_e.a((byte) 102)) {
                            break L3;
                          } else {
                            if (!uf.field_e.a(false)) {
                              break L3;
                            } else {
                              L4: {
                                if (!md.field_p.a((byte) 102)) {
                                  break L4;
                                } else {
                                  if (md.field_p.a(false)) {
                                    L5: {
                                      if (!vm.field_k.a((byte) 102)) {
                                        break L5;
                                      } else {
                                        if (vm.field_k.a(-20402, "initialset")) {
                                          L6: {
                                            if (!ma.field_p.a((byte) 102)) {
                                              break L6;
                                            } else {
                                              if (!ma.field_p.e(0, 81)) {
                                                break L6;
                                              } else {
                                                if (ma.field_p.a(-20402, "initialset")) {
                                                  if (rl.field_i.a((byte) 102)) {
                                                    if (!mg.field_c.a((byte) 102)) {
                                                      int discarded$36 = 0;
                                                      td.a(20.0f, jl.field_f);
                                                      return;
                                                    } else {
                                                      L7: {
                                                        if (!mg.field_g.a((byte) 102)) {
                                                          break L7;
                                                        } else {
                                                          if (!mg.field_g.a(false)) {
                                                            break L7;
                                                          } else {
                                                            L8: {
                                                              if (!ba.field_k.a((byte) 102)) {
                                                                break L8;
                                                              } else {
                                                                if (ba.field_k.a(false)) {
                                                                  if (param0) {
                                                                    bm.field_e = new int[][]{new int[4], new int[4], new int[4]};
                                                                    fq.field_x = new wg();
                                                                    fq.field_x.a(128, 9, (byte) -103);
                                                                    gf.field_c.b((od) (Object) fq.field_x);
                                                                    aa.field_b = new bn(vm.field_k, ma.field_p);
                                                                    break L0;
                                                                  } else {
                                                                    return;
                                                                  }
                                                                } else {
                                                                  break L8;
                                                                }
                                                              }
                                                            }
                                                            int discarded$37 = 0;
                                                            td.a(24.0f, kp.a(vj.field_c, rh.field_e, "", 3, ba.field_k));
                                                            return;
                                                          }
                                                        }
                                                      }
                                                      int discarded$38 = 0;
                                                      td.a(24.0f, kp.a(vj.field_c, rh.field_e, "", 3, mg.field_g));
                                                      return;
                                                    }
                                                  } else {
                                                    int discarded$39 = 0;
                                                    td.a(20.0f, jl.field_f);
                                                    return;
                                                  }
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                          }
                                          int discarded$40 = 0;
                                          td.a(16.0f, kp.a(rk.field_e, uc.field_a, "initialset", 3, ma.field_p));
                                          return;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    int discarded$41 = 0;
                                    td.a(16.0f, kp.a(rk.field_e, uc.field_a, "initialset", 3, vm.field_k));
                                    return;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              int discarded$42 = 0;
                              td.a(12.0f, kp.a(ld.field_w, jn.field_k, "", 3, md.field_p));
                              return;
                            }
                          }
                        }
                        int discarded$43 = 0;
                        td.a(8.0f, vl.a(re.field_n, 0, 4164, dp.field_j, uf.field_e));
                        return;
                      }
                    }
                  }
                  int discarded$44 = 0;
                  td.a(8.0f, kp.a(re.field_n, dp.field_j, "", 3, l.field_d));
                  return;
                }
              }
            }
            int discarded$45 = 0;
            td.a(8.0f, kp.a(re.field_n, dp.field_j, "basic", 3, dj.field_ab));
            return;
          }
        }
        rm discarded$46 = dc.a(true, "menu", (byte) -106);
        if (null == h.field_d) {
          int discarded$47 = 126;
          ba.b();
          int discarded$48 = 0;
          td.a(28.0f, oi.field_b);
          ((CrazyCrystals) this).a(-124);
          h.field_d = bf.a(-1, "buttonframe", "", l.field_d);
          af.field_c = bf.a(-1, "hoverbuttonframe", "", l.field_d);
          fo.field_g = bf.a(-1, "smallbuttonframe", "", l.field_d);
          mi.field_x = bf.a(-1, "hoversmallbuttonframe", "", l.field_d);
          jn.field_o = bf.a(-1, "hollowframe", "", l.field_d);
          mg.field_b = bf.a(-1, "tinyhollowframe", "", l.field_d);
          an.field_q = hp.a(md.field_p, 0, "fonts_smallfont", l.field_d, "");
          var3 = md.field_p.a(7693, "fonts_largefont", "");
          int discarded$49 = 0;
          var4_ref_wj__ = ep.a(l.field_d, "fonts_largefont", "");
          int discarded$50 = 8;
          bd.a(l.field_d, var3, var4_ref_wj__);
          go.field_l = wi.a(0, var4_ref_wj__, var3);
          gj.field_m = pp.a(new int[0], (byte) 80, 1, var3, var4_ref_wj__);
          var5 = gj.field_m.field_K[0].length;
          gj.field_m.field_K[1] = new int[var5];
          eg.a(gj.field_m.field_K[0], 0, gj.field_m.field_K[1], 0, var5);
          gj.field_m.field_K[2] = new int[var5];
          eg.a(gj.field_m.field_K[0], 0, gj.field_m.field_K[2], 0, var5);
          gj.field_m.field_K[0][1] = 12640511;
          gj.field_m.field_K[1][1] = 16777215;
          md.field_p = null;
          lo.field_a = null;
          gj.field_m.field_K[2][1] = 16760896;
          var6_ref_dl__ = bf.a(-1, "bgtiles_rocky", "", l.field_d);
          var7 = (Object) (Object) bf.a(-1, "bgtiles_grass", "", l.field_d);
          var8_ref_dl__ = bf.a(-1, "bgtiles_metal", "", l.field_d);
          var9 = bf.a(-1, "bgtiles_tiles", "", l.field_d);
          var10 = var9.length + (var8_ref_dl__.length + var6_ref_dl__.length - -((Object[]) var7).length) + -12;
          tb.field_e = new dl[4 - -var10];
          tb.field_e[0] = var6_ref_dl__[0];
          tb.field_e[3] = var9[0];
          tb.field_e[1] = (dl) ((Object[]) var7)[0];
          tb.field_e[2] = var8_ref_dl__[0];
          kj.field_a[0] = var6_ref_dl__[1];
          kj.field_a[1] = (dl) ((Object[]) var7)[1];
          kj.field_a[3] = var9[1];
          kj.field_a[2] = var8_ref_dl__[1];
          qc.field_f[1] = (dl) ((Object[]) var7)[2];
          qc.field_f[0] = var6_ref_dl__[2];
          qc.field_f[2] = var8_ref_dl__[2];
          qc.field_f[3] = var9[2];
          var11 = 4;
          vp.field_a[0] = var11;
          var12 = 3;
          L9: while (true) {
            if (var12 >= var6_ref_dl__.length) {
              vp.field_a[1] = var11;
              var12 = 3;
              L10: while (true) {
                if (var12 >= ((Object[]) var7).length) {
                  vp.field_a[2] = var11;
                  var12 = 3;
                  L11: while (true) {
                    if (~var8_ref_dl__.length >= ~var12) {
                      vp.field_a[3] = var11;
                      var12 = 3;
                      L12: while (true) {
                        if (var9.length <= var12) {
                          vp.field_a[4] = var11;
                          ec.field_j = bf.a(-1, "bgtiles_teleport", "", l.field_d);
                          mg.a(-104, l.field_d);
                          var6 = 0;
                          L13: while (true) {
                            if (var6 >= 17) {
                              var6 = 0;
                              L14: while (true) {
                                if (var6 >= 4) {
                                  vp.a(111);
                                  return;
                                } else {
                                  L15: {
                                    var7 = null;
                                    if (var6 == 0) {
                                      var7 = (Object) (Object) ci.a(new String[3], fb.field_e, 3);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (var6 != 1) {
                                      break L16;
                                    } else {
                                      var7 = (Object) (Object) ci.a(new String[3], fb.field_e, 3);
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (var6 != 2) {
                                      break L17;
                                    } else {
                                      var7 = (Object) (Object) ci.a(new String[2], of.field_G, 3);
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (var6 == 3) {
                                      var7 = (Object) (Object) jn.field_n;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (go.field_l.a((String) var7, 148) <= 5) {
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                  var6++;
                                  continue L14;
                                }
                              }
                            } else {
                              L20: {
                                var7 = (Object) (Object) ci.a(new String[1], wn.field_a, 3);
                                var8 = 3;
                                if (var6 < 8) {
                                  break L20;
                                } else {
                                  if (var6 > 11) {
                                    break L20;
                                  } else {
                                    var8 = 2;
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (var6 >= 13) {
                                  var8 = 4;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L22: {
                                int discarded$51 = -113;
                                if (var8 >= gh.a((String) var7)) {
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              var6++;
                              continue L13;
                            }
                          }
                        } else {
                          int incrementValue$52 = var11;
                          var11++;
                          tb.field_e[incrementValue$52] = var9[var12];
                          var12++;
                          continue L12;
                        }
                      }
                    } else {
                      int incrementValue$53 = var11;
                      var11++;
                      tb.field_e[incrementValue$53] = var8_ref_dl__[var12];
                      var12++;
                      continue L11;
                    }
                  }
                } else {
                  int incrementValue$54 = var11;
                  var11++;
                  tb.field_e[incrementValue$54] = (dl) ((Object[]) var7)[var12];
                  var12++;
                  continue L10;
                }
              }
            } else {
              int incrementValue$55 = var11;
              var11++;
              tb.field_e[incrementValue$55] = var6_ref_dl__[var12];
              var12++;
              continue L9;
            }
          }
        } else {
          if (s.field_o != null) {
            if (null == ac.field_j) {
              int discarded$56 = 0;
              td.a(36.0f, oi.field_b);
              ((CrazyCrystals) this).a(-125);
              var3_array = bf.a(-1, "sprites_lasers", "", l.field_d);
              jl.field_b = var3_array[3];
              ai.field_b = var3_array[5];
              qn.field_e = var3_array[1];
              en.field_M = var3_array[2];
              ce.field_eb = var3_array[4];
              ac.field_j = var3_array[0];
              de.field_k = wl.a("sprites_ledge", l.field_d, 10, "");
              qj.field_b = wl.a("sprites_stickyball", l.field_d, 10, "");
              il.field_e = wl.a("sprites_pingpongball", l.field_d, 10, "");
              var3_array = bf.a(-1, "sprites_ball_indicators", "", l.field_d);
              na.field_eb = var3_array[1];
              qi.field_a = var3_array[5];
              mk.field_a = var3_array[2];
              ln.field_d = var3_array[7];
              vp.field_d = var3_array[0];
              tl.field_b = var3_array[3];
              rf.field_C = var3_array[4];
              ba.field_j = var3_array[6];
              ag.field_c = new dl[12];
              al.field_h = new dl[12];
              cp.field_d = new dl[12];
              sa.field_qb = new dl[12];
              var3_array = bf.a(-1, "sprites_spider", "", l.field_d);
              var4 = 0;
              L23: while (true) {
                if (var4 >= 12) {
                  var4 = 0;
                  L24: while (true) {
                    if (12 <= var4) {
                      var4 = 0;
                      L25: while (true) {
                        if (var4 >= 12) {
                          var4 = 0;
                          L26: while (true) {
                            if (var4 >= 12) {
                              vp.a(118);
                              return;
                            } else {
                              al.field_h[var4] = var3_array[var4 + 36];
                              var4++;
                              continue L26;
                            }
                          }
                        } else {
                          cp.field_d[var4] = var3_array[var4 + 24];
                          var4++;
                          continue L25;
                        }
                      }
                    } else {
                      ag.field_c[var4] = var3_array[12 - -var4];
                      var4++;
                      continue L24;
                    }
                  }
                } else {
                  sa.field_qb[var4] = var3_array[var4];
                  var4++;
                  continue L23;
                }
              }
            } else {
              if (null != pa.field_H) {
                if (null != ba.field_g) {
                  if (null == jf.field_b) {
                    int discarded$57 = 0;
                    td.a(48.0f, oi.field_b);
                    ((CrazyCrystals) this).a(-124);
                    jf.field_b = bf.a(-1, "control_keys", "", l.field_d);
                    boolean discarded$58 = qh.a(9260, 52, 0, l.field_d);
                    boolean discarded$59 = qh.a(9260, 56, 1, l.field_d);
                    boolean discarded$60 = qh.a(9260, 60, 2, l.field_d);
                    boolean discarded$61 = qh.a(9260, 64, 3, l.field_d);
                    vp.a(118);
                    return;
                  } else {
                    if (null == d.field_c) {
                      int discarded$62 = 0;
                      td.a(68.0f, oi.field_b);
                      ((CrazyCrystals) this).a(-126);
                      ln.a(0, l.field_d);
                      int discarded$63 = -88;
                      am.a(l.field_d, uf.field_e);
                      d.field_c = bf.a(-1, "achievements", "", l.field_d);
                      ro.field_q = wl.a("unachieved", dj.field_ab, 10, "basic");
                      ah.field_b = wl.a("locked", dj.field_ab, 10, "basic");
                      var3_ref = wl.a("orbcoin", dj.field_ab, 10, "basic");
                      vf.field_b = new dl[d.field_c.length];
                      cn.field_c = new dl[d.field_c.length];
                      var4 = 0;
                      L27: while (true) {
                        if (d.field_c.length <= var4) {
                          oj.field_B = new dl(32, 32);
                          oj.field_B.a();
                          ro.field_q.d(0, 0, 32, 32);
                          p.field_k = new dl(32, 32);
                          p.field_k.a();
                          ah.field_b.d(0, 0, 32, 32);
                          ne.field_i = new dl(20, 20);
                          ne.field_i.a();
                          var3_ref.d(0, 0, 20, 20);
                          dk.field_o.a(6945);
                          l.field_d = null;
                          dj.field_ab = null;
                          uf.field_e = null;
                          vp.a(102);
                          return;
                        } else {
                          vf.field_b[var4] = new dl(48, 48);
                          vf.field_b[var4].a();
                          d.field_c[var4].d(0, 0, 48, 48);
                          cn.field_c[var4] = new dl(32, 32);
                          cn.field_c[var4].a();
                          d.field_c[var4].d(0, 0, 32, 32);
                          var4++;
                          continue L27;
                        }
                      }
                    } else {
                      if (fk.field_x == null) {
                        int discarded$64 = 0;
                        td.a(72.0f, gl.field_l);
                        ((CrazyCrystals) this).a(-128);
                        fk.field_x = new ko[2];
                        fk.field_x[0] = bl.a(ma.field_p, "initialset", "crystal1").a();
                        fk.field_x[1] = bl.a(ma.field_p, "initialset", "crystal2").a();
                        nk.field_j = ha.a(vm.field_k, "initialset", "ball-bounce").b();
                        wm.field_a = ha.a(vm.field_k, "initialset", "ball-rolling").b();
                        uk.field_i = bl.a(ma.field_p, "initialset", "ball-into-hole").a();
                        aq.field_t = bl.a(ma.field_p, "initialset", "ball-punch").a();
                        qf.field_w = ha.a(vm.field_k, "initialset", "dig-through-earth").b();
                        fb.field_c = bl.a(ma.field_p, "initialset", "laser-humming").a();
                        ti.field_l = bl.a(ma.field_p, "initialset", "rock-push").a();
                        pe.field_h = bl.a(ma.field_p, "initialset", "rock-falling").a();
                        mg.field_d = ha.a(vm.field_k, "initialset", "rock_land").b();
                        io.field_H = ha.a(vm.field_k, "initialset", "bomb-push").b();
                        vp.a(103);
                        return;
                      } else {
                        if (null != fo.field_i) {
                          if (an.field_s != null) {
                            if (null != dc.a(true, "menu", (byte) 121)) {
                              int discarded$65 = 0;
                              td.a(88.0f, ae.field_D);
                              ((CrazyCrystals) this).a(-126);
                              kf.field_d = new int[30];
                              lm.field_d = new f[30];
                              kf.field_d[0] = 0;
                              lm.field_d[0] = (f) (Object) new kp();
                              kf.field_d[1] = 8;
                              lm.field_d[1] = (f) (Object) new pj(0);
                              kf.field_d[2] = 16;
                              lm.field_d[2] = (f) (Object) new pj(1);
                              kf.field_d[3] = 24;
                              lm.field_d[3] = (f) (Object) new pj(2);
                              kf.field_d[4] = 32;
                              lm.field_d[4] = (f) (Object) new pj(3);
                              kf.field_d[5] = 40;
                              lm.field_d[5] = (f) (Object) new pj(4);
                              kf.field_d[6] = 48;
                              lm.field_d[6] = (f) (Object) new pj(5);
                              kf.field_d[7] = 56;
                              lm.field_d[7] = (f) (Object) new pj(6);
                              kf.field_d[8] = 64;
                              lm.field_d[8] = (f) (Object) new pj(7);
                              kf.field_d[9] = 72;
                              lm.field_d[9] = (f) (Object) new pj(8);
                              kf.field_d[10] = 80;
                              lm.field_d[10] = (f) (Object) new pj(9);
                              kf.field_d[11] = 88;
                              lm.field_d[11] = (f) (Object) new de();
                              kf.field_d[12] = 112;
                              lm.field_d[12] = (f) (Object) new kn((f) (Object) new kp());
                              kf.field_d[13] = 120;
                              lm.field_d[13] = (f) (Object) new c((f) (Object) new kp());
                              kf.field_d[14] = 96;
                              lm.field_d[14] = (f) (Object) new bb((f) (Object) new kp());
                              kf.field_d[15] = 104;
                              lm.field_d[15] = (f) (Object) new jo((f) (Object) new kp(), 0);
                              kf.field_d[16] = 128;
                              lm.field_d[16] = (f) (Object) new ro(0, (f) (Object) new kp());
                              kf.field_d[17] = 129;
                              lm.field_d[17] = (f) (Object) new ro(1, (f) (Object) new kp());
                              kf.field_d[18] = 136;
                              lm.field_d[18] = (f) (Object) new vb((f) (Object) new kp());
                              kf.field_d[19] = 144;
                              lm.field_d[19] = (f) (Object) new cd((f) (Object) new kp(), 1, 0, 0, 1);
                              kf.field_d[20] = 145;
                              lm.field_d[20] = (f) (Object) new gh((f) (Object) new kp(), 1, 0);
                              var3_int = 116 / ((param1 - 34) / 63);
                              kf.field_d[21] = 146;
                              lm.field_d[21] = (f) (Object) new mi((f) (Object) new kp());
                              kf.field_d[22] = 152;
                              lm.field_d[22] = (f) (Object) new gi(0, (f) (Object) new kp());
                              kf.field_d[23] = 160;
                              lm.field_d[23] = (f) (Object) new ep((f) (Object) new jo((f) (Object) new kp(), 0), 0);
                              kf.field_d[24] = 168;
                              lm.field_d[24] = (f) (Object) new cj((f) (Object) new kp(), 2, 0, 0);
                              kf.field_d[25] = 105;
                              lm.field_d[25] = (f) (Object) new jo((f) (Object) new kp(), 1);
                              kf.field_d[26] = 200;
                              lm.field_d[26] = (f) (Object) new cb((f) (Object) new kp(), 0, 0);
                              kf.field_d[27] = 248;
                              lm.field_d[27] = (f) (Object) new fq((f) (Object) new kp(), 0, 0, 0);
                              kf.field_d[28] = 249;
                              lm.field_d[28] = (f) (Object) new fq((f) (Object) new kp(), 1, 0, 0);
                              kf.field_d[29] = 250;
                              lm.field_d[29] = (f) (Object) new fq((f) (Object) new kp(), 2, 0, 0);
                              a.field_b = (ue) (Object) new re();
                              vp.a(103);
                              ij.field_i = true;
                              return;
                            } else {
                              int discarded$66 = 0;
                              td.a(84.0f, be.field_b);
                              ((CrazyCrystals) this).a(-121);
                              vp.a(124);
                              return;
                            }
                          } else {
                            int discarded$67 = 0;
                            td.a(80.0f, gl.field_l);
                            ((CrazyCrystals) this).a(-120);
                            an.field_s = bl.a(ma.field_p, "initialset", "mirror-start-bending").a();
                            cl.field_m = bl.a(ma.field_p, "initialset", "mirror-ping").a();
                            ab.field_z = ha.a(vm.field_k, "initialset", "teleport").b();
                            sa.field_nb = bl.a(ma.field_p, "initialset", "player-push-upwards").a();
                            tg.field_c = bl.a(ma.field_p, "initialset", "player-sticky-feet").a();
                            va.field_b = bl.a(ma.field_p, "initialset", "player-prod-spider").a();
                            ga.field_H = bl.a(ma.field_p, "initialset", "player-taunt-spider").a();
                            e.a(0, vm.field_k, ma.field_p);
                            sb.a(ma.field_p, 18180);
                            of.a(vm.field_k, 23, ma.field_p);
                            ma.field_p = null;
                            vm.field_k = null;
                            vp.a(118);
                            return;
                          }
                        } else {
                          int discarded$68 = 0;
                          td.a(76.0f, gl.field_l);
                          ((CrazyCrystals) this).a(-124);
                          fo.field_i = new ko[4];
                          fo.field_i[0] = ha.a(vm.field_k, "initialset", "footstep-rocky").b();
                          fo.field_i[1] = ha.a(vm.field_k, "initialset", "footstep-grass").b();
                          fo.field_i[2] = ha.a(vm.field_k, "initialset", "footstep-metal").b();
                          fo.field_i[3] = ha.a(vm.field_k, "initialset", "footstep-tiles").b();
                          rn.field_p = ha.a(vm.field_k, "initialset", "footstep-ball").b();
                          nj.field_c = bl.a(ma.field_p, "initialset", "spider-advancing").a();
                          cf.field_f = bl.a(ma.field_p, "initialset", "spider-crushed").a();
                          lm.field_a = bl.a(ma.field_p, "initialset", "spider-explode-into-sparks").a();
                          jc.field_a = bl.a(ma.field_p, "initialset", "safes-open").a();
                          oa.field_e = bl.a(ma.field_p, "initialset", "key").a();
                          gk.field_j = bl.a(ma.field_p, "initialset", "break-ledge").a();
                          jm.field_k = ha.a(vm.field_k, "initialset", "bomb-explode").b();
                          lb.field_d = ha.a(vm.field_k, "initialset", "tile-explode").b();
                          vp.a(119);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  int discarded$69 = 0;
                  td.a(44.0f, oi.field_b);
                  ((CrazyCrystals) this).a(-122);
                  pl.field_B = new dl[8];
                  ba.field_g = new dl[8];
                  q.field_b = new dl[8];
                  hj.field_b = new dl[8];
                  bd.field_n = new dl[8];
                  cl.field_n = new dl[8];
                  jg.field_i = new dl[8];
                  var3_array = bf.a(-1, "sprites_explosion", "", l.field_d);
                  var4 = 0;
                  L28: while (true) {
                    if (var4 >= 8) {
                      vp.a(118);
                      return;
                    } else {
                      ba.field_g[var4] = var3_array[7 * var4];
                      jg.field_i[var4] = var3_array[7 * var4 + 1];
                      hj.field_b[var4] = var3_array[var4 * 7 - -2];
                      q.field_b[var4] = var3_array[7 * var4 + 3];
                      pl.field_B[var4] = var3_array[4 + var4 * 7];
                      cl.field_n[var4] = var3_array[7 * var4 + 5];
                      bd.field_n[var4] = var3_array[6 + var4 * 7];
                      var4++;
                      continue L28;
                    }
                  }
                }
              } else {
                int discarded$70 = 0;
                td.a(40.0f, oi.field_b);
                ((CrazyCrystals) this).a(-127);
                pa.field_H = wl.a("sprites_spider_bright", l.field_d, 10, "");
                wl.field_p = new dl[4][4];
                var3_array = bf.a(-1, "sprites_spider_web", "", l.field_d);
                var4 = 0;
                L29: while (true) {
                  if (16 <= var4) {
                    jd.field_A = wl.a("sprites_grave", l.field_d, 10, "");
                    fl.field_i = bf.a(-1, "sprites_key", "", l.field_d);
                    v.field_b = bf.a(-1, "sprites_safe", "", l.field_d);
                    bb.field_y = new dl[12];
                    var3_array = bf.a(-1, "sprites_safe_base", "", l.field_d);
                    var4 = 1;
                    L30: while (true) {
                      if (12 <= var4) {
                        al.field_a = wl.a("sprites_bomb", l.field_d, 10, "");
                        vp.a(104);
                        return;
                      } else {
                        bb.field_y[var4] = var3_array[var4 - 1];
                        var4++;
                        continue L30;
                      }
                    }
                  } else {
                    wl.field_p[var4 >> 2][pf.b(3, var4)] = var3_array[var4];
                    var4++;
                    continue L29;
                  }
                }
              }
            }
          } else {
            int discarded$71 = 0;
            td.a(32.0f, oi.field_b);
            ((CrazyCrystals) this).a(-124);
            s.field_o = bf.a(-1, "fgtiles_earth", "", l.field_d);
            qb.field_b = wl.a("fgtiles_laserhub", l.field_d, 10, "");
            jm.field_i = wl.a("sprites_rock", l.field_d, 10, "");
            vp.field_i = new dl[2][];
            vp.field_i[0] = bf.a(-1, "sprites_crystal1", "", l.field_d);
            vp.field_i[1] = bf.a(-1, "sprites_crystal2", "", l.field_d);
            var3_array = bf.a(-1, "sprites_mirrors", "", l.field_d);
            en.field_K = new dl[6];
            tk.field_h = new dl[6];
            db.field_j = new dl[6];
            ig.field_q = var3_array[6];
            nf.field_g = var3_array[19];
            ja.field_h = new dl[6];
            var4 = 0;
            L31: while (true) {
              if (6 <= var4) {
                vp.a(108);
                return;
              } else {
                en.field_K[var4] = var3_array[-var4 + 12];
                tk.field_h[var4] = var3_array[-var4 + 25];
                ja.field_h[var4] = var3_array[var4 + 13];
                db.field_j[var4] = var3_array[var4];
                var4++;
                continue L31;
              }
            }
          }
        }
    }

    public static void m(int param0) {
        try {
            field_C = null;
            if (param0 != 30644) {
                CrazyCrystals.m(-45);
            }
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "CrazyCrystals.O(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        ((CrazyCrystals) this).a(13, 10, (byte) 111, false, 12, 6, 11, 15);
        fe.field_g = (CrazyCrystals) this;
        if (param0 != -82) {
            return;
        }
        try {
            id.a(22050, true, 10);
            hb.field_h = id.a(te.field_a, (java.awt.Component) (Object) jd.field_D, 0, 0);
            gf.field_c = id.a(te.field_a, (java.awt.Component) (Object) jd.field_D, 1, 22050);
            tb.field_d = new tj();
            hb.field_h.b((od) (Object) tb.field_d);
            ((CrazyCrystals) this).a(true, false, true, true, -1);
            ao.field_e = 16760896;
            mc.field_s = 0;
            jn.field_i = 1;
            int discarded$0 = 107;
            qo.c();
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "CrazyCrystals.H(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        re var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_66_0 = null;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        ef stackIn_192_0 = null;
        ef stackIn_194_0 = null;
        ef stackIn_196_0 = null;
        ef stackIn_197_0 = null;
        int stackIn_197_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_65_0 = null;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        ef stackOut_191_0 = null;
        ef stackOut_196_0 = null;
        int stackOut_196_1 = 0;
        ef stackOut_192_0 = null;
        ef stackOut_194_0 = null;
        int stackOut_194_1 = 0;
        var5 = field_B;
        try {
          L0: {
            L1: {
              if (cp.field_k[8]) {
                sg.field_a = false;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (cp.field_k[9]) {
                sg.field_a = true;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ph.field_E == null) {
                break L3;
              } else {
                if (!ph.field_E.field_d) {
                  break L3;
                } else {
                  q.a(false);
                  int discarded$18 = -15544;
                  cm.a();
                  break L3;
                }
              }
            }
            L4: {
              hb.field_h.c();
              gf.field_c.c();
              stackOut_15_0 = this;
              stackIn_18_0 = stackOut_15_0;
              stackIn_16_0 = stackOut_15_0;
              if (ph.field_E == null) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L4;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = 1;
                stackIn_19_0 = stackOut_16_0;
                stackIn_19_1 = stackOut_16_1;
                break L4;
              }
            }
            L5: {
              ((CrazyCrystals) this).a(stackIn_19_1 != 0, 15000);
              if (hb.field_g) {
                int discarded$19 = 1;
                this.d();
                hb.field_g = false;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!cp.field_k[vf.field_c]) {
                lb.field_k = false;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param0) {
                break L7;
              } else {
                ((CrazyCrystals) this).c(70);
                break L7;
              }
            }
            L8: {
              if (aj.e((byte) -9)) {
                L9: {
                  if (ti.field_o) {
                    dg.a(false, 50);
                    ti.field_o = false;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                ((CrazyCrystals) this).k(6579);
                if (kf.b(45)) {
                  this.a(false, (byte) 103);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                L10: {
                  if (ij.field_i) {
                    break L10;
                  } else {
                    pi.a(of.field_H, -118);
                    this.a(true, (byte) -81);
                    break L10;
                  }
                }
                L11: {
                  if (!ij.field_i) {
                    break L11;
                  } else {
                    int discarded$20 = 1;
                    if (!ul.a()) {
                      pi.a(of.field_H, -94);
                      int discarded$21 = -9762;
                      uk.d();
                      break L11;
                    } else {
                      int discarded$22 = 136;
                      if (fj.a()) {
                        L12: {
                          var2_ref = (re) (Object) a.field_b;
                          var3 = 0;
                          if (!s.field_l) {
                            break L12;
                          } else {
                            var3 = 40;
                            break L12;
                          }
                        }
                        L13: {
                          if (null == var2_ref) {
                            break L13;
                          } else {
                            var2_ref.f(-88);
                            var2_ref.b(-115, var3, 2);
                            if (!s.field_l) {
                              if (cb.field_w < 20) {
                                cb.field_w = cb.field_w + 1;
                                break L13;
                              } else {
                                break L13;
                              }
                            } else {
                              if (0 < cb.field_w) {
                                cb.field_w = cb.field_w - 1;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                        L14: {
                          if (s.field_l) {
                            if (40 > var2_ref.field_f) {
                              break L14;
                            } else {
                              if (!tp.field_e) {
                                int discarded$23 = -76;
                                of.e();
                                tp.field_e = true;
                                break L14;
                              } else {
                                tp.field_e = false;
                                s.field_l = false;
                                dq.a(-32056, true);
                                break L14;
                              }
                            }
                          } else {
                            L15: {
                              if (var2_ref != null) {
                                var2_ref.c(-1);
                                break L15;
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              var4 = tb.a(true);
                              if (3 == var4) {
                                dq.a(-32056, true);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            L17: {
                              if (var4 == 2) {
                                q.a(false);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if (var4 != 4) {
                                break L18;
                              } else {
                                s.field_l = true;
                                break L18;
                              }
                            }
                            break L14;
                          }
                        }
                        break L11;
                      } else {
                        int discarded$24 = 0;
                        if (!gn.d()) {
                          L19: {
                            if (!ti.field_o) {
                              dg.a(false, 60);
                              ti.field_o = true;
                              break L19;
                            } else {
                              break L19;
                            }
                          }
                          L20: {
                            if (cb.field_w <= 0) {
                              break L20;
                            } else {
                              cb.field_w = cb.field_w - 1;
                              break L20;
                            }
                          }
                          if (a.field_b == null) {
                            if (!r.field_m) {
                              break L11;
                            } else {
                              L21: {
                                if (uh.field_n) {
                                  break L21;
                                } else {
                                  if (qn.field_n >= 640) {
                                    break L21;
                                  } else {
                                    L22: {
                                      if (qn.field_n >= 136) {
                                        break L22;
                                      } else {
                                        gh.field_C = gh.field_C + 1;
                                        break L22;
                                      }
                                    }
                                    qn.field_n = qn.field_n + gh.field_C;
                                    if (qn.field_n >= 320) {
                                      break L21;
                                    } else {
                                      if (ca.field_j < 0) {
                                        ca.field_j = ca.field_j - 1;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                              int discarded$25 = -128;
                              this.g();
                              if (uh.field_n) {
                                L23: {
                                  qn.field_n = qn.field_n - gh.field_C;
                                  if (136 > qn.field_n) {
                                    gh.field_C = gh.field_C - 1;
                                    break L23;
                                  } else {
                                    break L23;
                                  }
                                }
                                if (0 != qn.field_n) {
                                  break L11;
                                } else {
                                  vk.j(17);
                                  break L11;
                                }
                              } else {
                                break L11;
                              }
                            }
                          } else {
                            a.field_b.a(false);
                            break L11;
                          }
                        } else {
                          if (cb.field_w > 0) {
                            cb.field_w = cb.field_w - 1;
                            break L11;
                          } else {
                            L24: {
                              if (!ti.field_o) {
                                break L24;
                              } else {
                                dg.a(false, 50);
                                ti.field_o = false;
                                break L24;
                              }
                            }
                            L25: {
                              if (!r.field_m) {
                                break L25;
                              } else {
                                if (qn.field_n < 640) {
                                  L26: {
                                    if (qn.field_n < 136) {
                                      gh.field_C = gh.field_C + 1;
                                      break L26;
                                    } else {
                                      break L26;
                                    }
                                  }
                                  qn.field_n = qn.field_n + gh.field_C;
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            L27: {
                              stackOut_65_0 = this;
                              stackIn_68_0 = stackOut_65_0;
                              stackIn_66_0 = stackOut_65_0;
                              if (ph.field_E == null) {
                                stackOut_68_0 = this;
                                stackOut_68_1 = 0;
                                stackIn_69_0 = stackOut_68_0;
                                stackIn_69_1 = stackOut_68_1;
                                break L27;
                              } else {
                                stackOut_66_0 = this;
                                stackOut_66_1 = 1;
                                stackIn_69_0 = stackOut_66_0;
                                stackIn_69_1 = stackOut_66_1;
                                break L27;
                              }
                            }
                            L28: {
                              var2_int = na.a((eb) this, stackIn_69_1 != 0, 10);
                              if (var2_int != 2364824) {
                                break L28;
                              } else {
                                int discarded$26 = 33423575;
                                w.a();
                                break L28;
                              }
                            }
                            L29: {
                              if (var2_int != 1) {
                                break L29;
                              } else {
                                q.a(false);
                                break L29;
                              }
                            }
                            L30: {
                              if (var2_int == 2) {
                                q.a(false);
                                int discarded$27 = -20;
                                int discarded$28 = 19;
                                ta.a(le.b());
                                break L30;
                              } else {
                                break L30;
                              }
                            }
                            break L11;
                          }
                        }
                      }
                    }
                  }
                }
                L31: while (true) {
                  int discarded$29 = 64;
                  if (!ee.a(ai.field_c)) {
                    ak.a(0, (byte) -48);
                    if (!gl.c(-11)) {
                      break L8;
                    } else {
                      L32: {
                        L33: {
                          var2_int = ((CrazyCrystals) this).i(-1);
                          if (var2_int == 0) {
                            break L33;
                          } else {
                            if (var2_int != 1) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        ue.a(2, -109);
                        fo.a(3, (byte) -98);
                        si.a(4, false);
                        int discarded$30 = 5;
                        int discarded$31 = 5;
                        hk.a();
                        break L32;
                      }
                      L34: {
                        if (var2_int != 2) {
                          break L34;
                        } else {
                          L35: {
                            stackOut_191_0 = go.field_l;
                            stackIn_196_0 = stackOut_191_0;
                            stackIn_192_0 = stackOut_191_0;
                            if (r.field_m) {
                              stackOut_196_0 = (ef) (Object) stackIn_196_0;
                              stackOut_196_1 = 240;
                              stackIn_197_0 = stackOut_196_0;
                              stackIn_197_1 = stackOut_196_1;
                              break L35;
                            } else {
                              stackOut_192_0 = (ef) (Object) stackIn_192_0;
                              stackIn_194_0 = stackOut_192_0;
                              stackOut_194_0 = (ef) (Object) stackIn_194_0;
                              stackOut_194_1 = 320;
                              stackIn_197_0 = stackOut_194_0;
                              stackIn_197_1 = stackOut_194_1;
                              break L35;
                            }
                          }
                          int discarded$32 = -17213;
                          int discarded$33 = 25;
                          int discarded$34 = 23;
                          int discarded$35 = 240;
                          ja.a((vc) (Object) stackIn_197_0, stackIn_197_1);
                          break L34;
                        }
                      }
                      break L8;
                    }
                  } else {
                    ((CrazyCrystals) this).l(-124);
                    continue L31;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.F(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "No highscores";
    }
}
