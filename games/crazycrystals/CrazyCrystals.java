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
        we var3_ref = null;
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
                            var3_ref = new we(jo.field_o, uo.field_o, we.field_h, b.field_a, je.field_j, fp.field_a);
                            if (!rc.a(-89)) {
                              lj.a(5, var3_ref, -93);
                              break L20;
                            } else {
                              ec.field_l.b(0, (jb) (Object) var3_ref);
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
          try {
            L0: {
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
                break L0;
              } else {
                CrazyCrystals.a(107, 81, 58, -104, (int[]) null, (int[]) null, -4, -89);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
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
        }
    }

    private final static void a(int param0, int param1, int param2, int param3, int[] param4, int[] param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = 0;
        L0: while (true) {
          if (var8 >= 480) {
            return;
          } else {
            var9 = mi.field_A[var8];
            param2 = param7;
            param6 = param7 + var9 - param3;
            try {
              L1: while (true) {
                if (param2 >= param6) {
                  break L1;
                } else {
                  param4[param2] = param5[param2 + param3];
                  param2++;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              throw decompiledCaughtException;
            }
            L2: {
              param6 = param6 + (param3 + param3);
              // wide iinc 7 640
              if (param6 <= param7) {
                break L2;
              } else {
                param6 = param7;
                break L2;
              }
            }
            L3: while (true) {
              if (param2 >= param6) {
                try {
                  L4: while (true) {
                    if (param2 >= param7) {
                      break L4;
                    } else {
                      param4[param2] = param5[param2 - param3];
                      param2++;
                      continue L4;
                    }
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  throw decompiledCaughtException;
                }
                var8++;
                continue L0;
              } else {
                param0 = param4[param2];
                param0 = ((param0 & 16711935) * param1 & -16711936) + ((param0 & 65280) * param1 & 16711680);
                param2++;
                param4[param2] = param0 >>> 8;
                continue L3;
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
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        boolean stackIn_76_0 = false;
        int stackOut_42_0 = 0;
        boolean stackOut_44_0 = false;
        int stackOut_51_0 = 0;
        int stackOut_61_0 = 0;
        boolean stackOut_63_0 = false;
        int stackOut_67_0 = 0;
        boolean stackOut_75_0 = false;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var10 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -119) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((CrazyCrystals) this).c(101);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2_ref = gd.c(128);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (aj.e((byte) 114)) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        pl.a(al.a((byte) 2), var2_ref, (byte) -59);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    try {
                        if (!ij.field_i) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        to.a(0, var2_ref);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 15: {
                    return;
                }
                case 16: {
                    try {
                        fo.a(0);
                        if (ul.a(true)) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        td.a(96.0f, rh.field_e, false);
                        to.a(0, var2_ref);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 18: {
                    return;
                }
                case 19: {
                    try {
                        if (null != a.field_b) {
                            statePc = 48;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        if (r.field_m) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        dq.a(-26477);
                        qb.b(480);
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (fj.a(136)) {
                            statePc = 46;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (null != uh.field_p) {
                            statePc = 32;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        uh.field_p.a((byte) 127);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (r.field_m) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var3 = qn.field_n;
                        if (640 <= var3) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var4_ref_int__ = ge.field_d.field_w;
                        var5_ref_int__ = kh.field_i;
                        var6 = (var3 << -1694850777) / 640 + 128;
                        var7 = 0;
                        CrazyCrystals.a(0, var6, 0, var3, var5_ref_int__, var4_ref_int__, 0, var7);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (!gn.d(false)) {
                            statePc = 74;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 41;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (ph.field_E == null) {
                            statePc = 44;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        stackOut_42_0 = 1;
                        stackIn_45_0 = stackOut_42_0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        stackOut_44_0 = mb.field_d;
                        stackIn_45_0 = stackOut_44_0 ? 1 : 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        fe.a(stackIn_45_0 != 0, 7923);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        var3 = ub.a(255);
                        var4 = rl.c((byte) 76);
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        go.a((var4 + 41) / 24, (var3 + 35) / 24, false);
                        wp.b((byte) -99);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        a.field_b.b(8);
                        if (fj.a(136)) {
                            statePc = 65;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        stackOut_51_0 = cb.field_w;
                        stackIn_52_0 = stackOut_51_0;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if (stackIn_52_0 > 0) {
                            statePc = 65;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 57;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (j.c((byte) -23)) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (ph.field_E == null) {
                            statePc = 63;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackOut_61_0 = 1;
                        stackIn_64_0 = stackOut_61_0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 62;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackOut_63_0 = mb.field_d;
                        stackIn_64_0 = stackOut_63_0 ? 1 : 0;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        fe.a(stackIn_64_0 != 0, 7923);
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        var3 = ub.a(255);
                        var4 = rl.c((byte) 95);
                        var5 = 320 + (-(var3 / 2) + -30);
                        var6 = 30 + (var3 / 2 + 320);
                        var7 = var5 + cb.field_w * ((var6 - var5) * cb.field_w) / 400;
                        var8 = -20 + -(var4 / 2) + 240;
                        var9 = var4 / 2 + 240 + 20;
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        wi.a(var5, jn.field_o, var8, var9 - var8, (byte) -71, -var5 + var7);
                        kh.d(var5 - -8, var8 + 8, -16 + (var7 + -var5), -16 + -var8 + var9, 0, 192);
                        if (!fj.a(136)) {
                            statePc = 74;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = 20;
                        stackIn_68_0 = stackOut_67_0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 70;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (stackIn_68_0 != cb.field_w) {
                            statePc = 74;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        wp.b((byte) -110);
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if ((rb.field_h ^ -1) > -3) {
                            statePc = 82;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        stackOut_75_0 = sg.field_a;
                        stackIn_76_0 = stackOut_75_0;
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (stackIn_76_0) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var3 = (int)(Runtime.getRuntime().freeMemory() / 1024L);
                        var4 = (int)(Runtime.getRuntime().totalMemory() / 1024L);
                        an.field_q.b(-var3 + var4 + " kB / " + var4 + " kB", 636, 16, 16777215, -1);
                        an.field_q.b(p.field_j + " fps", 636, 30, 16777215, -1);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        bq.a(var2_ref, 0, 0, 4);
                        statePc = 85;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 84;
                        continue stateLoop;
                    }
                }
                case 84: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dn.a((Throwable) (Object) var2, "CrazyCrystals.I(" + param0 + 41);
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void d(boolean param0) {
        RuntimeException var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (ak.field_f != null) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        tl.a(121, ak.field_f);
                        ak.field_f = null;
                        vp.a(103);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
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
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dn.a((Throwable) (Object) var2, "CrazyCrystals.Q(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public CrazyCrystals() {
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (null == ph.field_E) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        q.a(false);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (hb.field_h == null) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        hb.field_h.d();
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (null == gf.field_c) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        gf.field_c.d();
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ue.b((byte) -106);
                        if (param0 == 241) {
                            statePc = 18;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        field_D = 122;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dn.a((Throwable) (Object) var2, "CrazyCrystals.J(" + param0 + 41);
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
        dl[] var7 = null;
        String var7_ref = null;
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
        rm discarded$5 = dc.a(true, "menu", (byte) -106);
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
          var7 = bf.a(-1, "bgtiles_grass", "", l.field_d);
          var8_ref_dl__ = bf.a(-1, "bgtiles_metal", "", l.field_d);
          var9 = bf.a(-1, "bgtiles_tiles", "", l.field_d);
          var10 = var9.length + (var8_ref_dl__.length + var6_ref_dl__.length - -var7.length) + -12;
          tb.field_e = new dl[4 - -var10];
          tb.field_e[0] = var6_ref_dl__[0];
          tb.field_e[3] = var9[0];
          tb.field_e[1] = var7[0];
          tb.field_e[2] = var8_ref_dl__[0];
          kj.field_a[0] = var6_ref_dl__[1];
          kj.field_a[1] = var7[1];
          kj.field_a[3] = var9[1];
          kj.field_a[2] = var8_ref_dl__[1];
          qc.field_f[1] = var7[2];
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
                if (var12 >= var7.length) {
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
                                      var7_ref = ci.a(new String[3], fb.field_e, 3);
                                      break L15;
                                    } else {
                                      break L15;
                                    }
                                  }
                                  L16: {
                                    if (var6 != 1) {
                                      break L16;
                                    } else {
                                      var7_ref = ci.a(new String[3], fb.field_e, 3);
                                      break L16;
                                    }
                                  }
                                  L17: {
                                    if (var6 != 2) {
                                      break L17;
                                    } else {
                                      var7_ref = ci.a(new String[2], of.field_G, 3);
                                      break L17;
                                    }
                                  }
                                  L18: {
                                    if (-4 == (var6 ^ -1)) {
                                      var7_ref = jn.field_n;
                                      break L18;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (-6 <= (go.field_l.a(var7_ref, 148) ^ -1)) {
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
                                var7_ref = ci.a(new String[1], wn.field_a, 3);
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
                                if (var8 >= gh.a(var7_ref, -113)) {
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
                          var11++;
                          tb.field_e[var11] = var9[var12];
                          var12++;
                          continue L12;
                        }
                      }
                    } else {
                      var11++;
                      tb.field_e[var11] = var8_ref_dl__[var12];
                      var12++;
                      continue L11;
                    }
                  }
                } else {
                  var11++;
                  tb.field_e[var11] = var7[var12];
                  var12++;
                  continue L10;
                }
              }
            } else {
              var11++;
              tb.field_e[var11] = var6_ref_dl__[var12];
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
                    boolean discarded$6 = qh.a(9260, 52, 0, l.field_d);
                    boolean discarded$7 = qh.a(9260, 56, 1, l.field_d);
                    boolean discarded$8 = qh.a(9260, 60, 2, l.field_d);
                    boolean discarded$9 = qh.a(9260, 64, 3, l.field_d);
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
        dd stackIn_11_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_61_0 = 0;
        Object stackIn_72_0 = null;
        Object stackIn_74_0 = null;
        Object stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_204_0 = 0;
        ef stackIn_212_0 = null;
        ef stackIn_214_0 = null;
        ef stackIn_216_0 = null;
        ef stackIn_217_0 = null;
        int stackIn_217_1 = 0;
        dd stackOut_10_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_60_0 = 0;
        Object stackOut_71_0 = null;
        Object stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_203_0 = 0;
        ef stackOut_211_0 = null;
        ef stackOut_212_0 = null;
        ef stackOut_214_0 = null;
        int stackOut_214_1 = 0;
        ef stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var5 = field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (cp.field_k[8]) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        sg.field_a = false;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (cp.field_k[9]) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        sg.field_a = true;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (ph.field_E == null) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = ph.field_E;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (!stackIn_11_0.field_d) {
                            statePc = 17;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        q.a(false);
                        cm.a(-15544);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        hb.field_h.c();
                        gf.field_c.c();
                        stackOut_17_0 = this;
                        stackIn_20_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (ph.field_E == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = this;
                        stackOut_18_1 = 1;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = this;
                        stackOut_20_1 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        ((CrazyCrystals) this).a(stackIn_21_1 != 0, 15000);
                        if (hb.field_g) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        this.d(true);
                        hb.field_g = false;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (!cp.field_k[vf.field_c]) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        lb.field_k = false;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        if (param0) {
                            statePc = 33;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        ((CrazyCrystals) this).c(70);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (aj.e((byte) -9)) {
                            statePc = 219;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (ij.field_i) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        pi.a(of.field_H, -118);
                        this.a(true, (byte) -81);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 39;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!ij.field_i) {
                            statePc = 196;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        if (!ul.a(true)) {
                            statePc = 193;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (fj.a(136)) {
                            statePc = 141;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (!gn.d(false)) {
                            statePc = 92;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        if ((cb.field_w ^ -1) < -1) {
                            statePc = 89;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (!ti.field_o) {
                            statePc = 59;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        dg.a(false, 50);
                        ti.field_o = false;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 58;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (!r.field_m) {
                            statePc = 71;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        stackOut_60_0 = qn.field_n;
                        stackIn_61_0 = stackOut_60_0;
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (stackIn_61_0 < 640) {
                            statePc = 66;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if ((qn.field_n ^ -1) > -137) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        gh.field_C = gh.field_C + 1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        qn.field_n = qn.field_n + gh.field_C;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackOut_71_0 = this;
                        stackIn_74_0 = stackOut_71_0;
                        stackIn_72_0 = stackOut_71_0;
                        if (ph.field_E == null) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = this;
                        stackOut_72_1 = 1;
                        stackIn_75_0 = stackOut_72_0;
                        stackIn_75_1 = stackOut_72_1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackOut_74_0 = this;
                        stackOut_74_1 = 0;
                        stackIn_75_0 = stackOut_74_0;
                        stackIn_75_1 = stackOut_74_1;
                        statePc = 75;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        var2_int = na.a((eb) this, stackIn_75_1 != 0, 10);
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if ((var2_int ^ -1) != -2364825) {
                            statePc = 80;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        w.a(33423575);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 79;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        if (-2 != (var2_int ^ -1)) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        q.a(false);
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 83;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (-3 == (var2_int ^ -1)) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 86;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        q.a(false);
                        ta.a(le.b((byte) -20), 19);
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 91;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        cb.field_w = cb.field_w - 1;
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 94;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        if (!ti.field_o) {
                            statePc = 97;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 96;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        dg.a(false, 60);
                        ti.field_o = true;
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (cb.field_w <= 0) {
                            statePc = 102;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        cb.field_w = cb.field_w - 1;
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 101;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 102: {
                    try {
                        if (a.field_b == null) {
                            statePc = 106;
                        } else {
                            statePc = 103;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_102) {
                        caughtException = stateCaught_102;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        a.field_b.a(false);
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 108;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (!r.field_m) {
                            statePc = 196;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        statePc = 109;
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 111;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (uh.field_n) {
                            statePc = 130;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        stackOut_112_0 = qn.field_n;
                        stackIn_113_0 = stackOut_112_0;
                        statePc = 113;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 115;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        if ((stackIn_113_0 ^ -1) <= -641) {
                            statePc = 130;
                        } else {
                            statePc = 114;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 118;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (qn.field_n >= 136) {
                            statePc = 122;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 119;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        gh.field_C = gh.field_C + 1;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 121;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        statePc = 122;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        qn.field_n = qn.field_n + gh.field_C;
                        if (qn.field_n >= 320) {
                            statePc = 130;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        stackOut_123_0 = ca.field_j;
                        stackIn_124_0 = stackOut_123_0;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if ((stackIn_124_0 ^ -1) > -1) {
                            statePc = 129;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 128;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        ca.field_j = ca.field_j - 1;
                        statePc = 130;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 130: {
                    try {
                        this.g((byte) -128);
                        if (uh.field_n) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_130) {
                        caughtException = stateCaught_130;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 132;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        qn.field_n = qn.field_n - gh.field_C;
                        if (136 > qn.field_n) {
                            statePc = 136;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 135;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        gh.field_C = gh.field_C - 1;
                        statePc = 137;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 137: {
                    try {
                        if (0 != qn.field_n) {
                            statePc = 196;
                        } else {
                            statePc = 138;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_137) {
                        caughtException = stateCaught_137;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        vk.j(17);
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 140;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var2_ref = (re) (Object) a.field_b;
                        var3 = 0;
                        if (!s.field_l) {
                            statePc = 143;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        var3 = 40;
                        statePc = 143;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 143: {
                    try {
                        if (null == var2_ref) {
                            statePc = 159;
                        } else {
                            statePc = 144;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_143) {
                        caughtException = stateCaught_143;
                        statePc = 146;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var2_ref.f(-88);
                        var2_ref.b(-115, var3, 2);
                        if (!s.field_l) {
                            statePc = 153;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        statePc = 147;
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 149;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        if (0 < cb.field_w) {
                            statePc = 152;
                        } else {
                            statePc = 148;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 148: {
                    try {
                        statePc = 150;
                        continue stateLoop;
                    } catch (Throwable stateCaught_148) {
                        caughtException = stateCaught_148;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 151;
                        continue stateLoop;
                    }
                }
                case 151: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_151) {
                        caughtException = stateCaught_151;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        cb.field_w = cb.field_w - 1;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 155;
                        continue stateLoop;
                    }
                }
                case 153: {
                    try {
                        if (cb.field_w < 20) {
                            statePc = 158;
                        } else {
                            statePc = 154;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_153) {
                        caughtException = stateCaught_153;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 157;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 158: {
                    try {
                        cb.field_w = cb.field_w + 1;
                        statePc = 159;
                        continue stateLoop;
                    } catch (Throwable stateCaught_158) {
                        caughtException = stateCaught_158;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 159: {
                    try {
                        if (s.field_l) {
                            statePc = 180;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_159) {
                        caughtException = stateCaught_159;
                        statePc = 162;
                        continue stateLoop;
                    }
                }
                case 160: {
                    try {
                        if (var2_ref != null) {
                            statePc = 165;
                        } else {
                            statePc = 161;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_160) {
                        caughtException = stateCaught_160;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 161: {
                    try {
                        statePc = 163;
                        continue stateLoop;
                    } catch (Throwable stateCaught_161) {
                        caughtException = stateCaught_161;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 162: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_162) {
                        caughtException = stateCaught_162;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 163: {
                    try {
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_163) {
                        caughtException = stateCaught_163;
                        statePc = 164;
                        continue stateLoop;
                    }
                }
                case 164: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_164) {
                        caughtException = stateCaught_164;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 165: {
                    try {
                        var2_ref.c(-1);
                        statePc = 166;
                        continue stateLoop;
                    } catch (Throwable stateCaught_165) {
                        caughtException = stateCaught_165;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 166: {
                    try {
                        var4 = tb.a(true);
                        statePc = 167;
                        continue stateLoop;
                    } catch (Throwable stateCaught_166) {
                        caughtException = stateCaught_166;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 167: {
                    try {
                        if (3 == var4) {
                            statePc = 170;
                        } else {
                            statePc = 168;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_167) {
                        caughtException = stateCaught_167;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 168: {
                    try {
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_168) {
                        caughtException = stateCaught_168;
                        statePc = 169;
                        continue stateLoop;
                    }
                }
                case 169: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_169) {
                        caughtException = stateCaught_169;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 170: {
                    try {
                        dq.a(-32056, true);
                        statePc = 171;
                        continue stateLoop;
                    } catch (Throwable stateCaught_170) {
                        caughtException = stateCaught_170;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 171: {
                    try {
                        if (-3 == (var4 ^ -1)) {
                            statePc = 174;
                        } else {
                            statePc = 172;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_171) {
                        caughtException = stateCaught_171;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 172: {
                    try {
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_172) {
                        caughtException = stateCaught_172;
                        statePc = 173;
                        continue stateLoop;
                    }
                }
                case 173: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_173) {
                        caughtException = stateCaught_173;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 174: {
                    try {
                        q.a(false);
                        statePc = 175;
                        continue stateLoop;
                    } catch (Throwable stateCaught_174) {
                        caughtException = stateCaught_174;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 175: {
                    try {
                        if ((var4 ^ -1) != -5) {
                            statePc = 179;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_175) {
                        caughtException = stateCaught_175;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 176: {
                    try {
                        s.field_l = true;
                        statePc = 177;
                        continue stateLoop;
                    } catch (Throwable stateCaught_176) {
                        caughtException = stateCaught_176;
                        statePc = 178;
                        continue stateLoop;
                    }
                }
                case 177: {
                    try {
                        statePc = 179;
                        continue stateLoop;
                    } catch (Throwable stateCaught_177) {
                        caughtException = stateCaught_177;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 178: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_178) {
                        caughtException = stateCaught_178;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 179: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_179) {
                        caughtException = stateCaught_179;
                        statePc = 182;
                        continue stateLoop;
                    }
                }
                case 180: {
                    try {
                        if (40 > var2_ref.field_f) {
                            statePc = 192;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_180) {
                        caughtException = stateCaught_180;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 181: {
                    try {
                        statePc = 183;
                        continue stateLoop;
                    } catch (Throwable stateCaught_181) {
                        caughtException = stateCaught_181;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 182: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_182) {
                        caughtException = stateCaught_182;
                        statePc = 185;
                        continue stateLoop;
                    }
                }
                case 183: {
                    try {
                        if (!tp.field_e) {
                            statePc = 189;
                        } else {
                            statePc = 184;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_183) {
                        caughtException = stateCaught_183;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 184: {
                    try {
                        statePc = 186;
                        continue stateLoop;
                    } catch (Throwable stateCaught_184) {
                        caughtException = stateCaught_184;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 185: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_185) {
                        caughtException = stateCaught_185;
                        statePc = 188;
                        continue stateLoop;
                    }
                }
                case 186: {
                    try {
                        tp.field_e = false;
                        s.field_l = false;
                        dq.a(-32056, true);
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_186) {
                        caughtException = stateCaught_186;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 188: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_188) {
                        caughtException = stateCaught_188;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 189: {
                    try {
                        of.e((byte) -76);
                        tp.field_e = true;
                        statePc = 190;
                        continue stateLoop;
                    } catch (Throwable stateCaught_189) {
                        caughtException = stateCaught_189;
                        statePc = 191;
                        continue stateLoop;
                    }
                }
                case 190: {
                    try {
                        statePc = 192;
                        continue stateLoop;
                    } catch (Throwable stateCaught_190) {
                        caughtException = stateCaught_190;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 191: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_191) {
                        caughtException = stateCaught_191;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 192: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_192) {
                        caughtException = stateCaught_192;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 193: {
                    try {
                        pi.a(of.field_H, -94);
                        uk.d(-9762);
                        statePc = 194;
                        continue stateLoop;
                    } catch (Throwable stateCaught_193) {
                        caughtException = stateCaught_193;
                        statePc = 195;
                        continue stateLoop;
                    }
                }
                case 194: {
                    try {
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_194) {
                        caughtException = stateCaught_194;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 195: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_195) {
                        caughtException = stateCaught_195;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 196: {
                    try {
                        if (!ee.a(ai.field_c, 64)) {
                            statePc = 200;
                        } else {
                            statePc = 197;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_196) {
                        caughtException = stateCaught_196;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 197: {
                    try {
                        ((CrazyCrystals) this).l(-124);
                        statePc = 196;
                        continue stateLoop;
                    } catch (Throwable stateCaught_197) {
                        caughtException = stateCaught_197;
                        statePc = 199;
                        continue stateLoop;
                    }
                }
                case 199: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_199) {
                        caughtException = stateCaught_199;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 200: {
                    try {
                        ak.a(0, (byte) -48);
                        if (!gl.c(-11)) {
                            statePc = 231;
                        } else {
                            statePc = 201;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_200) {
                        caughtException = stateCaught_200;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 201: {
                    try {
                        var2_int = ((CrazyCrystals) this).i(-1);
                        statePc = 202;
                        continue stateLoop;
                    } catch (Throwable stateCaught_201) {
                        caughtException = stateCaught_201;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 202: {
                    try {
                        if (var2_int == 0) {
                            statePc = 207;
                        } else {
                            statePc = 203;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_202) {
                        caughtException = stateCaught_202;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 203: {
                    try {
                        stackOut_203_0 = -2;
                        stackIn_204_0 = stackOut_203_0;
                        statePc = 204;
                        continue stateLoop;
                    } catch (Throwable stateCaught_203) {
                        caughtException = stateCaught_203;
                        statePc = 206;
                        continue stateLoop;
                    }
                }
                case 204: {
                    try {
                        if (stackIn_204_0 != (var2_int ^ -1)) {
                            statePc = 210;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_204) {
                        caughtException = stateCaught_204;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 205: {
                    try {
                        statePc = 207;
                        continue stateLoop;
                    } catch (Throwable stateCaught_205) {
                        caughtException = stateCaught_205;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 206: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_206) {
                        caughtException = stateCaught_206;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 207: {
                    try {
                        ue.a(2, -109);
                        fo.a(3, (byte) -98);
                        si.a(4, false);
                        hk.a((byte) 5, 5);
                        statePc = 208;
                        continue stateLoop;
                    } catch (Throwable stateCaught_207) {
                        caughtException = stateCaught_207;
                        statePc = 209;
                        continue stateLoop;
                    }
                }
                case 208: {
                    try {
                        statePc = 210;
                        continue stateLoop;
                    } catch (Throwable stateCaught_208) {
                        caughtException = stateCaught_208;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 209: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_209) {
                        caughtException = stateCaught_209;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 210: {
                    try {
                        if (-3 != (var2_int ^ -1)) {
                            statePc = 218;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_210) {
                        caughtException = stateCaught_210;
                        statePc = 213;
                        continue stateLoop;
                    }
                }
                case 211: {
                    try {
                        stackOut_211_0 = go.field_l;
                        stackIn_216_0 = stackOut_211_0;
                        stackIn_212_0 = stackOut_211_0;
                        if (r.field_m) {
                            statePc = 216;
                        } else {
                            statePc = 212;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_211) {
                        caughtException = stateCaught_211;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 212: {
                    try {
                        stackOut_212_0 = (ef) (Object) stackIn_212_0;
                        stackIn_214_0 = stackOut_212_0;
                        statePc = 214;
                        continue stateLoop;
                    } catch (Throwable stateCaught_212) {
                        caughtException = stateCaught_212;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 213: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_213) {
                        caughtException = stateCaught_213;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 214: {
                    try {
                        stackOut_214_0 = (ef) (Object) stackIn_214_0;
                        stackOut_214_1 = 320;
                        stackIn_217_0 = stackOut_214_0;
                        stackIn_217_1 = stackOut_214_1;
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_214) {
                        caughtException = stateCaught_214;
                        statePc = 215;
                        continue stateLoop;
                    }
                }
                case 215: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_215) {
                        caughtException = stateCaught_215;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 216: {
                    try {
                        stackOut_216_0 = (ef) (Object) stackIn_216_0;
                        stackOut_216_1 = 240;
                        stackIn_217_0 = stackOut_216_0;
                        stackIn_217_1 = stackOut_216_1;
                        statePc = 217;
                        continue stateLoop;
                    } catch (Throwable stateCaught_216) {
                        caughtException = stateCaught_216;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 217: {
                    try {
                        ja.a((vc) (Object) stackIn_217_0, stackIn_217_1, 240, 23, 25, -17213);
                        statePc = 218;
                        continue stateLoop;
                    } catch (Throwable stateCaught_217) {
                        caughtException = stateCaught_217;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 218: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_218) {
                        caughtException = stateCaught_218;
                        statePc = 221;
                        continue stateLoop;
                    }
                }
                case 219: {
                    try {
                        if (ti.field_o) {
                            statePc = 224;
                        } else {
                            statePc = 220;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_219) {
                        caughtException = stateCaught_219;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 220: {
                    try {
                        statePc = 222;
                        continue stateLoop;
                    } catch (Throwable stateCaught_220) {
                        caughtException = stateCaught_220;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 221: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_221) {
                        caughtException = stateCaught_221;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 222: {
                    try {
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_222) {
                        caughtException = stateCaught_222;
                        statePc = 223;
                        continue stateLoop;
                    }
                }
                case 223: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_223) {
                        caughtException = stateCaught_223;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 224: {
                    try {
                        dg.a(false, 50);
                        ti.field_o = false;
                        statePc = 225;
                        continue stateLoop;
                    } catch (Throwable stateCaught_224) {
                        caughtException = stateCaught_224;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 225: {
                    try {
                        ((CrazyCrystals) this).k(6579);
                        if (kf.b(45)) {
                            statePc = 228;
                        } else {
                            statePc = 226;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_225) {
                        caughtException = stateCaught_225;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 226: {
                    try {
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_226) {
                        caughtException = stateCaught_226;
                        statePc = 227;
                        continue stateLoop;
                    }
                }
                case 227: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_227) {
                        caughtException = stateCaught_227;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 228: {
                    try {
                        this.a(false, (byte) 103);
                        statePc = 231;
                        continue stateLoop;
                    } catch (Throwable stateCaught_228) {
                        caughtException = stateCaught_228;
                        statePc = 230;
                        continue stateLoop;
                    }
                }
                case 230: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw dn.a((Throwable) (Object) var2, "CrazyCrystals.F(" + param0 + 41);
                }
                case 231: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "No highscores";
    }
}
