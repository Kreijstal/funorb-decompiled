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

    private final void g(byte param0) {
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
        f[] stackIn_265_0 = null;
        f[] stackIn_266_0 = null;
        f[] stackIn_267_0 = null;
        int stackIn_267_1 = 0;
        int stackIn_288_0 = 0;
        int stackIn_296_0 = 0;
        int stackIn_296_1 = 0;
        uc stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_54_1 = 0;
        f[] stackOut_264_0 = null;
        f[] stackOut_266_0 = null;
        int stackOut_266_1 = 0;
        f[] stackOut_265_0 = null;
        int stackOut_265_1 = 0;
        int stackOut_287_0 = 0;
        int stackOut_286_0 = 0;
        int stackOut_295_0 = 0;
        int stackOut_295_1 = 0;
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
            fe.b(42806);
            if (!uh.field_n) {
              L2: {
                if (null != ab.field_D) {
                  ab.field_D = ab.field_D.b((byte) -39);
                  if (!r.field_m) {
                    gh.i(127);
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
                          if ((en.field_O ^ -1) != -1) {
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
                    stackOut_54_0 = mo.field_f ^ -1;
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
                  if ((var2_int ^ -1) == -86) {
                    if (!(ab.field_D instanceof ja)) {
                      hc.a(false, false);
                      continue L3;
                    } else {
                      continue L3;
                    }
                  } else {
                    if (-81 == (var2_int ^ -1)) {
                      continue L3;
                    } else {
                      if (-85 != (var2_int ^ -1)) {
                        if (-14 == (var2_int ^ -1)) {
                          L6: {
                            gh.i(127);
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
                    if ((ca.field_j ^ -1) <= (ia.field_g ^ -1)) {
                      bq.field_i = td.field_c;
                      cn.field_d = null;
                      break L7;
                    } else {
                      if ((ca.field_j ^ -1) >= -1) {
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
                  if (-1 <= (mo.field_f ^ -1)) {
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
          L16: {
            gh.i(127);
            if (param0 < -126) {
              break L16;
            } else {
              this.a(false, (byte) -6);
              break L16;
            }
          }
          L17: {
            if (uh.field_n) {
              break L17;
            } else {
              if (ab.field_D != null) {
                break L17;
              } else {
                var2_int = 3;
                var3 = 1 + ia.field_i;
                L18: while (true) {
                  if (-1 + (-ia.field_i + tm.field_d.length) <= var3) {
                    if ((1 & var2_int) == 0) {
                      if (-1 != (var2_int & 2 ^ -1)) {
                        ab.field_D = (te) (Object) new r();
                        break L17;
                      } else {
                        break L17;
                      }
                    } else {
                      L19: {
                        if (uo.field_o == ke.field_b[jo.field_o]) {
                          L20: {
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
                              break L20;
                            } else {
                              ec.field_l.b(0, (jb) (Object) var3_ref_we);
                              break L20;
                            }
                          }
                          ke.field_b[jo.field_o] = uo.field_o - -1;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L21: {
                        if (uo.field_o > ke.field_b[jo.field_o]) {
                          break L21;
                        } else {
                          L22: {
                            if (jo.field_o == 1) {
                              L23: {
                                if (9 != uo.field_o) {
                                  break L23;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 255, je.field_j, 0, fp.field_a);
                                  break L23;
                                }
                              }
                              L24: {
                                if (19 != uo.field_o) {
                                  break L24;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 254, je.field_j, 1, fp.field_a);
                                  break L24;
                                }
                              }
                              L25: {
                                if ((uo.field_o ^ -1) != -40) {
                                  break L25;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 253, je.field_j, 2, fp.field_a);
                                  break L25;
                                }
                              }
                              L26: {
                                if (59 != uo.field_o) {
                                  break L26;
                                } else {
                                  rc.a(1, we.field_h, b.field_a, 252, je.field_j, 3, fp.field_a);
                                  break L26;
                                }
                              }
                              if ((uo.field_o ^ -1) != -70) {
                                break L22;
                              } else {
                                rc.a(1, we.field_h, b.field_a, 251, je.field_j, 4, fp.field_a);
                                break L22;
                              }
                            } else {
                              break L22;
                            }
                          }
                          L27: {
                            if ((jo.field_o ^ -1) == -5) {
                              L28: {
                                if ((uo.field_o ^ -1) == -5) {
                                  rc.a(1, we.field_h, b.field_a, 250, je.field_j, 5, fp.field_a);
                                  break L28;
                                } else {
                                  break L28;
                                }
                              }
                              L29: {
                                if (14 == uo.field_o) {
                                  rc.a(1, we.field_h, b.field_a, 249, je.field_j, 6, fp.field_a);
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              L30: {
                                if (uo.field_o == 24) {
                                  rc.a(1, we.field_h, b.field_a, 248, je.field_j, 7, fp.field_a);
                                  break L30;
                                } else {
                                  break L30;
                                }
                              }
                              L31: {
                                ld.field_y = ld.field_y + q.field_a[2].field_d;
                                if (-31 >= (ld.field_y ^ -1)) {
                                  rc.a(1, we.field_h, b.field_a, 243, je.field_j, 12, fp.field_a);
                                  break L31;
                                } else {
                                  break L31;
                                }
                              }
                              L32: {
                                if ((uo.field_o ^ -1) != -12) {
                                  break L32;
                                } else {
                                  if ((va.field_d ^ -1) != -1) {
                                    rc.a(1, we.field_h, b.field_a, 242, je.field_j, 13, fp.field_a);
                                    break L32;
                                  } else {
                                    break L32;
                                  }
                                }
                              }
                              L33: {
                                if (uo.field_o != 15) {
                                  break L33;
                                } else {
                                  if (3000 <= tm.field_e) {
                                    break L33;
                                  } else {
                                    rc.a(1, we.field_h, b.field_a, 241, je.field_j, 14, fp.field_a);
                                    break L33;
                                  }
                                }
                              }
                              if (-10 != (uo.field_o ^ -1)) {
                                break L27;
                              } else {
                                if ((va.field_d ^ -1) == -1) {
                                  break L27;
                                } else {
                                  if ((ol.field_B ^ -1) == -1) {
                                    break L27;
                                  } else {
                                    rc.a(1, we.field_h, b.field_a, 240, je.field_j, 15, fp.field_a);
                                    break L27;
                                  }
                                }
                              }
                            } else {
                              break L27;
                            }
                          }
                          L34: {
                            if (!ai.a(100, 0)) {
                              break L34;
                            } else {
                              if (-13 != (uo.field_o + -dk.field_h ^ -1)) {
                                break L34;
                              } else {
                                rc.a(1, we.field_h, b.field_a, 239, je.field_j, 16, fp.field_a);
                                break L34;
                              }
                            }
                          }
                          gh.j(-10935);
                          break L21;
                        }
                      }
                      ab.field_D = (te) (Object) new ja();
                      break L17;
                    }
                  } else {
                    var4 = 1 + w.field_f;
                    L35: while (true) {
                      if ((-w.field_f + tm.field_d[0].length + -1 ^ -1) >= (var4 ^ -1)) {
                        var3++;
                        continue L18;
                      } else {
                        var2_int = var2_int & tm.field_d[var3][var4].d(-92);
                        var4++;
                        continue L35;
                      }
                    }
                  }
                }
              }
            }
          }
          L36: {
            if (null == li.field_a) {
              if (!vh.field_a) {
                break L36;
              } else {
                if (!qh.field_o.isEmpty()) {
                  break L36;
                } else {
                  if (0 != en.field_O) {
                    break L36;
                  } else {
                    if (null != cn.field_d) {
                      break L36;
                    } else {
                      if (ab.field_D instanceof ja) {
                        break L36;
                      } else {
                        if (!go.field_i) {
                          va.a(127);
                          break L36;
                        } else {
                          break L36;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              li.field_a = li.field_a.c(-28530);
              break L36;
            }
          }
          L37: {
            if (uh.field_n) {
              break L37;
            } else {
              if ((pj.field_v ^ -1) != -1) {
                if ((to.field_a ^ -1) <= -481) {
                  L38: {
                    if (null != ab.field_D) {
                      break L38;
                    } else {
                      if (vh.field_a) {
                        break L38;
                      } else {
                        if ((dp.field_h ^ -1) > -49) {
                          break L38;
                        } else {
                          if (158 > dp.field_h) {
                            var2_int = 0;
                            var3 = 0;
                            L39: while (true) {
                              if ((var3 ^ -1) <= -4) {
                                var3 = -(var2_int * 26) + 562;
                                var4 = 0;
                                L40: while (true) {
                                  if (-4 >= (var4 ^ -1)) {
                                    break L38;
                                  } else {
                                    L41: {
                                      if (q.field_a[var4].field_b) {
                                        L42: {
                                          if (oe.field_a[var4] == null) {
                                            break L42;
                                          } else {
                                            if ((var3 ^ -1) < (to.field_a ^ -1)) {
                                              break L42;
                                            } else {
                                              if ((to.field_a ^ -1) <= (var3 + 48 ^ -1)) {
                                                break L42;
                                              } else {
                                                li.field_a = oe.field_a[var4].a(23525, li.field_a);
                                                break L38;
                                              }
                                            }
                                          }
                                        }
                                        var3 += 52;
                                        break L41;
                                      } else {
                                        break L41;
                                      }
                                    }
                                    var4++;
                                    continue L40;
                                  }
                                }
                              } else {
                                L43: {
                                  if (q.field_a[var3].field_b) {
                                    var2_int++;
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                }
                                var3++;
                                continue L39;
                              }
                            }
                          } else {
                            break L38;
                          }
                        }
                      }
                    }
                  }
                  L44: {
                    if ((dp.field_h ^ -1) > -159) {
                      break L44;
                    } else {
                      if (null != li.field_a) {
                        li.field_a = li.field_a.b((byte) -125);
                        break L37;
                      } else {
                        break L44;
                      }
                    }
                  }
                  L45: {
                    if (vh.field_a) {
                      break L45;
                    } else {
                      if (null == ab.field_D) {
                        L46: {
                          if (to.field_a < 506) {
                            break L46;
                          } else {
                            if (614 > to.field_a) {
                              var2_int = 158;
                              var3 = 0;
                              L47: while (true) {
                                if (2 <= var3) {
                                  break L46;
                                } else {
                                  L48: {
                                    if ((gm.field_c[var3] ^ -1) >= -1) {
                                      break L48;
                                    } else {
                                      if (dp.field_h < 12 + var2_int) {
                                        break L48;
                                      } else {
                                        if (dp.field_h < var2_int - -60) {
                                          L49: {
                                            stackOut_264_0 = lm.field_d;
                                            stackIn_266_0 = stackOut_264_0;
                                            stackIn_265_0 = stackOut_264_0;
                                            if ((var3 ^ -1) == -1) {
                                              stackOut_266_0 = (f[]) (Object) stackIn_266_0;
                                              stackOut_266_1 = 15;
                                              stackIn_267_0 = stackOut_266_0;
                                              stackIn_267_1 = stackOut_266_1;
                                              break L49;
                                            } else {
                                              stackOut_265_0 = (f[]) (Object) stackIn_265_0;
                                              stackOut_265_1 = 25;
                                              stackIn_267_0 = stackOut_265_0;
                                              stackIn_267_1 = stackOut_265_1;
                                              break L49;
                                            }
                                          }
                                          li.field_a = ((f) (Object) stackIn_267_0[stackIn_267_1]).a(23525, li.field_a);
                                          break L46;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                  var2_int += 48;
                                  var3++;
                                  continue L47;
                                }
                              }
                            } else {
                              break L46;
                            }
                          }
                        }
                        if (!qh.field_o.isEmpty()) {
                          break L45;
                        } else {
                          if (-1 != (en.field_O ^ -1)) {
                            break L45;
                          } else {
                            if (cn.field_d != null) {
                              break L45;
                            } else {
                              L50: {
                                var2_int = go.field_l.a(f.field_e, 152);
                                var3 = -(10 * var2_int) + 100;
                                if (3 <= var2_int) {
                                  var3 += 10;
                                  break L50;
                                } else {
                                  break L50;
                                }
                              }
                              var4 = var3 - -(var2_int * 20);
                              if (480 > to.field_a) {
                                break L45;
                              } else {
                                if (640 <= to.field_a) {
                                  break L45;
                                } else {
                                  if ((var3 + 282 ^ -1) < (dp.field_h ^ -1)) {
                                    break L45;
                                  } else {
                                    if (dp.field_h >= var4 + 282) {
                                      break L45;
                                    } else {
                                      L51: {
                                        if (qp.field_f) {
                                          stackOut_287_0 = 0;
                                          stackIn_288_0 = stackOut_287_0;
                                          break L51;
                                        } else {
                                          stackOut_286_0 = 1;
                                          stackIn_288_0 = stackOut_286_0;
                                          break L51;
                                        }
                                      }
                                      qp.field_f = stackIn_288_0 != 0;
                                      break L45;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L45;
                      }
                    }
                  }
                  L52: {
                    var2_int = 460;
                    if (!(ab.field_D instanceof ja)) {
                      stackOut_295_0 = dp.field_h ^ -1;
                      stackOut_295_1 = var2_int ^ -1;
                      stackIn_296_0 = stackOut_295_0;
                      stackIn_296_1 = stackOut_295_1;
                      L53: {
                        if (stackIn_296_0 > stackIn_296_1) {
                          break L53;
                        } else {
                          if ((dp.field_h ^ -1) <= (var2_int - -20 ^ -1)) {
                            break L53;
                          } else {
                            uh.field_p = (uc) (Object) new p(true);
                            break L53;
                          }
                        }
                      }
                      var2_int -= 20;
                      if (dp.field_h < var2_int) {
                        break L52;
                      } else {
                        if (20 + var2_int <= dp.field_h) {
                          break L52;
                        } else {
                          hc.a(true, false);
                          break L52;
                        }
                      }
                    } else {
                      if (dp.field_h < var2_int) {
                        break L52;
                      } else {
                        if (dp.field_h >= 20 + var2_int) {
                          break L52;
                        } else {
                          ((ja) (Object) ab.field_D).c((byte) -41);
                          ab.field_D = null;
                          break L52;
                        }
                      }
                    }
                  }
                  break L37;
                } else {
                  if (null == ab.field_D) {
                    L54: {
                      var2_double = bq.field_i[0];
                      var4_double = bq.field_i[1];
                      var6 = bq.field_i[2];
                      var8 = 240.0 - var2_double;
                      var10 = -var4_double + (240.0 + var6 / 2.0);
                      var12 = (int)Math.floor(((double)to.field_a - var8) / (var6 * 2.0));
                      var13 = (int)Math.floor(((double)dp.field_h - var10) / (var6 * 2.0));
                      if ((var12 ^ -1) > -1) {
                        break L54;
                      } else {
                        if ((var12 ^ -1) <= (tm.field_d[0].length ^ -1)) {
                          break L54;
                        } else {
                          if (-1 < (var13 ^ -1)) {
                            break L54;
                          } else {
                            if (var13 < tm.field_d.length) {
                              var14 = tm.field_d[var13][var12].a(23525, li.field_a);
                              if (null == var14) {
                                break L54;
                              } else {
                                li.field_a = var14;
                                break L54;
                              }
                            } else {
                              break L54;
                            }
                          }
                        }
                      }
                    }
                    break L37;
                  } else {
                    break L37;
                  }
                }
              } else {
                break L37;
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
              ne.a(-1);
              bd.e(7279);
              vf.a((byte) -117);
              jf.a(0);
              cn.a(127);
              eb.f((byte) 78);
              ub.a(true);
              wa.e(5);
              ai.a(8076);
              a.a(true);
              jm.a(-122);
              kh.d();
              db.b((byte) 127);
              dg.b((byte) 64);
              hf.b(4);
              ng.e((byte) -125);
              lo.a(param0 + -183);
              ll.a((byte) -85);
              oe.a(-106);
              vl.a((byte) -85);
              lp.a(0);
              qi.a(true);
              ui.a((byte) 110);
              q.a(param0 + -3680);
              uf.a(0);
              sn.a((byte) -123);
              gf.a(20);
              gm.a(true);
              ke.a((byte) 127);
              bc.b(-26389);
              vm.b((byte) 119);
              dd.a(param0 ^ -45);
              oa.b(-98);
              f.a(100);
              id.b();
              wg.e(64);
              am.a(117);
              me.a((byte) 127);
              wb.f(118);
              sg.a(true);
              fq.b(true);
              vh.b((byte) -114);
              nj.a(12);
              te.a((byte) -77);
              uc.a(0);
              ob.a(12554);
              pk.b(120);
              qa.a(param0 + -6231);
              j.a((byte) 45);
              bn.a((byte) -3);
              kp.b(false);
              mj.a((byte) -64);
              ea.f(-1);
              jb.c(-24894);
              pl.a(-124);
              ic.g();
              ka.a((byte) 120);
              to.a((byte) -109);
              rp.b(2);
              dn.a(param0 + -210);
              kb.a(-96);
              vc.a();
              ij.d(1);
              wi.a(0);
              jh.a(18744);
              re.d((byte) -97);
              ge.a(-113);
              hj.a(0);
              oc.a((byte) -121);
              lc.c(-102);
              g.a((byte) 122);
              hc.a(-21017);
              vj.a(26988);
              qg.a((byte) 51);
              ih.a(param0 + 13);
              lk.a((byte) -29);
              pn.c((byte) 119);
              if (param0 == 89) {
                break L1;
              } else {
                CrazyCrystals.a(107, 81, 58, -104, (int[]) null, (int[]) null, -4, -89);
                break L1;
              }
            }
            sl.b(true);
            mi.h(-20188);
            fb.a((byte) -50);
            gg.b(-123);
            td.a(0);
            ag.a(19266);
            bp.a((byte) 76);
            ol.i(param0 ^ 89);
            sa.d(false);
            kl.h((byte) -1);
            ck.l(param0 ^ 29);
            na.m(-18883);
            dc.j(81);
            ae.a(20);
            vk.a(-23);
            qk.j(-26005);
            rh.c(15157);
            nd.a(32);
            ao.b((byte) -72);
            lj.a(30447);
            rb.c((byte) 100);
            rg.a(-1);
            de.f(3);
            pj.g(param0 ^ -39);
            bo.f(0);
            vn.c(-100);
            m.c((byte) -124);
            jo.f(6);
            em.b(param0 ^ -66);
            mc.b((byte) 126);
            bl.c();
            ej.b();
            nm.a();
            r.d(27);
            ff.c(param0 ^ -18779);
            ja.d(27348);
            kn.g(-104);
            c.g(-1);
            bb.b(true);
            qf.e((byte) -72);
            ro.f(4);
            gh.k(0);
            cd.b(false);
            gi.b(true);
            cj.f((byte) -21);
            cb.f(996201186);
            aa.a(param0 + 20204);
            jl.a((byte) -105);
            hd.a(-1246);
            wh.a((byte) 19);
            mg.b(-111);
            md.j(0);
            vg.a(8877);
            ua.a(0);
            d.a(-8130);
            nc.b(false);
            p.b(-1);
            nn.a(-127);
            wm.b(-1);
            bm.a((byte) -66);
            km.e(0);
            ld.f(100);
            sp.a((byte) 113);
            mf.f(param0 + -20);
            ee.d(0);
            gl.a((byte) -117);
            rk.a((byte) 54);
            wl.c((byte) -89);
            cm.b(-121);
            gn.e(false);
            rc.a(false);
            lb.a((byte) -114);
            nb.c();
            qj.a(param0 ^ 84);
            hm.b(-2);
            jg.a(32767);
            cc.a(-18277);
            so.a(-11774);
            on.a((byte) -128);
            vo.a(true);
            je.a(0);
            dj.a((byte) 46);
            vp.a((byte) -14);
            pg.a((byte) -126);
            tf.a(param0 + -215);
            v.a(114);
            qb.a((byte) 100);
            di.a();
            qn.a(param0 + 169);
            pi.a(102);
            h.a(0);
            kf.a(param0 ^ -90);
            fl.a((byte) -121);
            fk.b(param0 + -5171);
            gk.a(-125);
            ip.a((byte) -103);
            tb.b(param0 ^ -2180);
            qm.g(1);
            pc.d((byte) -58);
            om.e((byte) 122);
            en.i(0);
            ab.c(false);
            og.h(param0 ^ 736);
            tm.a(-11909);
            cf.a(0);
            jc.a(param0 + 33469896);
            tg.a((byte) -100);
            lg.b(31039);
            b.a(param0 ^ 89);
            ra.a(true);
            jj.a((byte) 65);
            wp.a((byte) -98);
            tl.b(2);
            va.a(true);
            s.b((byte) 118);
            tk.a((byte) -125);
            df.a(-20012);
            al.a(param0 + 31664);
            ma.f(125);
            dm.a(param0 + 14137);
            dk.a((byte) 55);
            cp.a(112);
            pf.f((byte) 33);
            ig.f(24);
            ah.a((byte) 40);
            fm.f(-108);
            ji.e((byte) -8);
            tn.f(param0 + 10);
            el.b(2);
            nl.b(0);
            qo.b((byte) -64);
            uo.c(-59);
            jk.a(true);
            ei.f((byte) -46);
            sd.h((byte) 54);
            ga.o(0);
            ud.h((byte) -124);
            co.a(2);
            nh.a(-7397);
            rf.e((byte) -98);
            sb.e((byte) 2);
            io.h(param0 + -211);
            of.h(3);
            se.d((byte) -96);
            fj.b(param0 ^ 45);
            ph.c(true);
            pa.e((byte) -104);
            dq.f((byte) -69);
            bk.a();
            kj.a(-99);
            af.c(0);
            ch.a(855);
            oj.f((byte) 0);
            ed.f((byte) 87);
            sj.a(21732);
            ug.b(32);
            be.a((byte) -48);
            ib.g(31438);
            qd.i(400);
            wf.c(0);
            la.a(16777215);
            ii.a(param0 + -179);
            wk.a(false);
            ak.a(77);
            hp.a(20974);
            tp.a(7566);
            sc.b((byte) -34);
            ok.a(false);
            wc.b((byte) -107);
            aq.b(param0 + -201);
            wn.a(108);
            th.h(param0 ^ -13158);
            ce.b(false);
            hb.b(true);
            lm.a(-26377);
            pp.a((byte) 2);
            we.a(-22523);
            dp.a(-127);
            ca.a(param0 ^ 89);
            ik.a((byte) 105);
            nk.c(-2);
            mh.c(-70);
            si.a(param0 ^ 14362);
            e.a(false);
            mk.b(-27838);
            mo.a(-60);
            jd.e((byte) 54);
            hl.b(param0 + 25559);
            fe.d((byte) -118);
            l.a((byte) -101);
            o.c(58);
            ec.a(param0 + -85);
            ia.a(true);
            qe.a(17659);
            ba.b(48);
            fn.a(true);
            fh.a(124);
            le.b(-1);
            go.b((byte) 54);
            ln.a((byte) -128);
            kk.a(param0 + -192);
            pb.a(param0 ^ -31326);
            hk.b(6388);
            oh.b(32);
            rl.e(120);
            qc.c((byte) 124);
            nf.c((byte) 39);
            pd.a(true);
            rd.a(true);
            ta.a(true);
            gj.d(19);
            ek.b(16);
            ul.b(true);
            ad.c(0);
            eq.f(1);
            sh.c(126);
            aj.g(35);
            ac.d((byte) 23);
            uk.c(89);
            fg.c(121);
            mn.c((byte) 19);
            rn.c(-128);
            ti.c(92);
            cl.c(param0 + -45);
            qh.c((byte) 88);
            il.a(false);
            sm.b(10);
            mb.a(11458);
            fa.a(true);
            uh.c(param0 ^ 217);
            bq.a(true);
            an.b((byte) 118);
            wd.c(param0 ^ 31368);
            bf.a((byte) -125);
            pe.d(1);
            qp.a(param0 + 1095153591);
            pm.a((byte) 35);
            bh.a(param0 ^ -90);
            no.b(true);
            jn.d(-31737);
            kd.e((byte) -33);
            ci.d(70);
            fp.a((byte) 125);
            fo.a((byte) -56);
            oi.a((byte) 118);
            li.c(param0 + 261);
            jp.a((byte) 120);
            ((CrazyCrystals) this).field_u = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.A(" + param0 + 41);
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
            var2_ref = gd.c(128);
            if (aj.e((byte) 114)) {
              pl.a(al.a((byte) 2), var2_ref, (byte) -59);
              return;
            } else {
              if (!ij.field_i) {
                to.a(0, var2_ref);
                return;
              } else {
                fo.a(0);
                if (ul.a(true)) {
                  L2: {
                    if (null != a.field_b) {
                      L3: {
                        a.field_b.b(8);
                        if (fj.a(136)) {
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
                              fe.a(stackIn_60_0 != 0, 7923);
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      var3 = ub.a(255);
                      var4 = rl.c((byte) 95);
                      var5 = 320 + (-(var3 / 2) + -30);
                      var6 = 30 + (var3 / 2 + 320);
                      var7 = var5 + cb.field_w * ((var6 - var5) * cb.field_w) / 400;
                      var8 = -20 + -(var4 / 2) + 240;
                      var9 = var4 / 2 + 240 + 20;
                      wi.a(var5, jn.field_o, var8, var9 - var8, (byte) -71, -var5 + var7);
                      kh.d(var5 - -8, var8 + 8, -16 + (var7 + -var5), -16 + -var8 + var9, 0, 192);
                      if (!fj.a(136)) {
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
                          dq.a(-26477);
                          qb.b(480);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      if (fj.a(136)) {
                        var3 = ub.a(255);
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
                              var6 = (var3 << -1694850777) / 640 + 128;
                              var7 = 0;
                              CrazyCrystals.a(0, var6, 0, var3, var5_ref_int__, var4_ref_int__, 0, var7);
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        if (!gn.d(false)) {
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
                          fe.a(stackIn_43_0 != 0, 7923);
                          break L2;
                        }
                      }
                    }
                  }
                  L9: {
                    if ((rb.field_h ^ -1) > -3) {
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
                  bq.a(var2_ref, 0, 0, 4);
                  break L0;
                } else {
                  td.a(96.0f, rh.field_e, false);
                  to.a(0, var2_ref);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.I(" + param0 + 41);
        }
    }

    private final void d(boolean param0) {
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
            rl.field_i = we.a(true, (byte) -51, true, param0, 8);
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
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.Q(" + param0 + 41);
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
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.J(" + param0 + 41);
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
                                                      td.a(20.0f, jl.field_f, false);
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
                                                            td.a(24.0f, kp.a(vj.field_c, rh.field_e, "", 3, ba.field_k), false);
                                                            return;
                                                          }
                                                        }
                                                      }
                                                      td.a(24.0f, kp.a(vj.field_c, rh.field_e, "", 3, mg.field_g), false);
                                                      return;
                                                    }
                                                  } else {
                                                    td.a(20.0f, jl.field_f, false);
                                                    return;
                                                  }
                                                } else {
                                                  break L6;
                                                }
                                              }
                                            }
                                          }
                                          td.a(16.0f, kp.a(rk.field_e, uc.field_a, "initialset", 3, ma.field_p), false);
                                          return;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                    td.a(16.0f, kp.a(rk.field_e, uc.field_a, "initialset", 3, vm.field_k), false);
                                    return;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              td.a(12.0f, kp.a(ld.field_w, jn.field_k, "", 3, md.field_p), false);
                              return;
                            }
                          }
                        }
                        td.a(8.0f, vl.a(re.field_n, 0, 4164, dp.field_j, uf.field_e), false);
                        return;
                      }
                    }
                  }
                  td.a(8.0f, kp.a(re.field_n, dp.field_j, "", 3, l.field_d), false);
                  return;
                }
              }
            }
            td.a(8.0f, kp.a(re.field_n, dp.field_j, "basic", 3, dj.field_ab), false);
            return;
          }
        }
        rm discarded$9 = dc.a(true, "menu", (byte) -106);
        if (null == h.field_d) {
          ba.b((byte) 126);
          td.a(28.0f, oi.field_b, false);
          ((CrazyCrystals) this).a(-124);
          h.field_d = bf.a(-1, "buttonframe", "", l.field_d);
          af.field_c = bf.a(-1, "hoverbuttonframe", "", l.field_d);
          fo.field_g = bf.a(-1, "smallbuttonframe", "", l.field_d);
          mi.field_x = bf.a(-1, "hoversmallbuttonframe", "", l.field_d);
          jn.field_o = bf.a(-1, "hollowframe", "", l.field_d);
          mg.field_b = bf.a(-1, "tinyhollowframe", "", l.field_d);
          an.field_q = hp.a(md.field_p, 0, "fonts_smallfont", l.field_d, "");
          var3 = md.field_p.a(7693, "fonts_largefont", "");
          var4_ref_wj__ = ep.a(l.field_d, "fonts_largefont", "", false);
          bd.a(l.field_d, var3, var4_ref_wj__, 8);
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
                    if ((var8_ref_dl__.length ^ -1) >= (var12 ^ -1)) {
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
                                if ((var6 ^ -1) <= -5) {
                                  vp.a(111);
                                  return;
                                } else {
                                  L15: {
                                    var7 = null;
                                    if (-1 == (var6 ^ -1)) {
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
                                    if (-4 == (var6 ^ -1)) {
                                      var7 = (Object) (Object) jn.field_n;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (-6 <= (go.field_l.a((String) var7, 148) ^ -1)) {
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
                                if (-14 >= (var6 ^ -1)) {
                                  var8 = 4;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L22: {
                                if (var8 >= gh.a((String) var7, -113)) {
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
                          int incrementValue$10 = var11;
                          var11++;
                          tb.field_e[incrementValue$10] = var9[var12];
                          var12++;
                          continue L12;
                        }
                      }
                    } else {
                      int incrementValue$11 = var11;
                      var11++;
                      tb.field_e[incrementValue$11] = var8_ref_dl__[var12];
                      var12++;
                      continue L11;
                    }
                  }
                } else {
                  int incrementValue$12 = var11;
                  var11++;
                  tb.field_e[incrementValue$12] = (dl) ((Object[]) var7)[var12];
                  var12++;
                  continue L10;
                }
              }
            } else {
              int incrementValue$13 = var11;
              var11++;
              tb.field_e[incrementValue$13] = var6_ref_dl__[var12];
              var12++;
              continue L9;
            }
          }
        } else {
          if (s.field_o != null) {
            if (null == ac.field_j) {
              td.a(36.0f, oi.field_b, false);
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
                        if ((var4 ^ -1) <= -13) {
                          var4 = 0;
                          L26: while (true) {
                            if (-13 >= (var4 ^ -1)) {
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
                    td.a(48.0f, oi.field_b, false);
                    ((CrazyCrystals) this).a(-124);
                    jf.field_b = bf.a(-1, "control_keys", "", l.field_d);
                    boolean discarded$14 = qh.a(9260, 52, 0, l.field_d);
                    boolean discarded$15 = qh.a(9260, 56, 1, l.field_d);
                    boolean discarded$16 = qh.a(9260, 60, 2, l.field_d);
                    boolean discarded$17 = qh.a(9260, 64, 3, l.field_d);
                    vp.a(118);
                    return;
                  } else {
                    if (null == d.field_c) {
                      td.a(68.0f, oi.field_b, false);
                      ((CrazyCrystals) this).a(-126);
                      ln.a(0, l.field_d);
                      am.a(l.field_d, uf.field_e, -88);
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
                        td.a(72.0f, gl.field_l, false);
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
                              td.a(88.0f, ae.field_D, false);
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
                              td.a(84.0f, be.field_b, false);
                              ((CrazyCrystals) this).a(-121);
                              vp.a(124);
                              return;
                            }
                          } else {
                            td.a(80.0f, gl.field_l, false);
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
                          td.a(76.0f, gl.field_l, false);
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
                  td.a(44.0f, oi.field_b, false);
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
                    if ((var4 ^ -1) <= -9) {
                      vp.a(118);
                      return;
                    } else {
                      ba.field_g[var4] = var3_array[7 * var4 + 0];
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
                td.a(40.0f, oi.field_b, false);
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
                    wl.field_p[var4 >> 457065986][pf.b(3, var4)] = var3_array[var4];
                    var4++;
                    continue L29;
                  }
                }
              }
            }
          } else {
            td.a(32.0f, oi.field_b, false);
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
            throw dn.a((Throwable) (Object) runtimeException, "CrazyCrystals.O(" + param0 + 41);
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
            qo.c((byte) 107);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "CrazyCrystals.H(" + param0 + 41);
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
                  cm.a(-15544);
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
                this.d(true);
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
                    if (!ul.a(true)) {
                      pi.a(of.field_H, -94);
                      uk.d(-9762);
                      break L11;
                    } else {
                      if (fj.a(136)) {
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
                                of.e((byte) -76);
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
                              if (-3 == (var4 ^ -1)) {
                                q.a(false);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            L18: {
                              if ((var4 ^ -1) != -5) {
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
                        if (!gn.d(false)) {
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
                                  if ((qn.field_n ^ -1) <= -641) {
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
                                      if ((ca.field_j ^ -1) > -1) {
                                        ca.field_j = ca.field_j - 1;
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                              this.g((byte) -128);
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
                          if ((cb.field_w ^ -1) < -1) {
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
                                    if ((qn.field_n ^ -1) > -137) {
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
                              if ((var2_int ^ -1) != -2364825) {
                                break L28;
                              } else {
                                w.a(33423575);
                                break L28;
                              }
                            }
                            L29: {
                              if (-2 != (var2_int ^ -1)) {
                                break L29;
                              } else {
                                q.a(false);
                                break L29;
                              }
                            }
                            L30: {
                              if (-3 == (var2_int ^ -1)) {
                                q.a(false);
                                ta.a(le.b((byte) -20), 19);
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
                  if (!ee.a(ai.field_c, 64)) {
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
                            if (-2 != (var2_int ^ -1)) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                        ue.a(2, -109);
                        fo.a(3, (byte) -98);
                        si.a(4, false);
                        hk.a((byte) 5, 5);
                        break L32;
                      }
                      L34: {
                        if (-3 != (var2_int ^ -1)) {
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
                          ja.a((vc) (Object) stackIn_197_0, stackIn_197_1, 240, 23, 25, -17213);
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
          throw dn.a((Throwable) (Object) var2, "CrazyCrystals.F(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "No highscores";
    }
}
