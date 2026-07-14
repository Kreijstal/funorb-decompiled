/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ms extends ck {
    static ik field_u;
    private int field_t;
    private int field_l;
    private int field_m;
    private boolean field_s;
    private int field_p;
    private int field_k;
    private boolean field_n;
    private long field_w;
    static String field_q;
    private boolean field_o;
    private int field_v;
    String field_r;

    public static void g(byte param0) {
        field_q = null;
        field_u = null;
        if (param0 <= 97) {
            field_u = null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object var11 = null;
        String var12 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        try {
          if (!((ms) this).d((byte) 105)) {
            return;
          } else {
            L0: {
              L1: {
                ((ms) this).field_r = ((ms) this).getCodeBase().getHost();
                var12 = ((ms) this).field_r.toLowerCase();
                stackOut_3_0 = this;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var12.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!var12.endsWith(".jagex.com")) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L0;
                  } else {
                    stackOut_5_0 = this;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
            L2: {
              ((ms) this).field_o = stackIn_8_1 != 0;
              ((ms) this).field_l = Integer.parseInt(((ms) this).getParameter("gameport1"));
              ((ms) this).field_k = Integer.parseInt(((ms) this).getParameter("gameport2"));
              if (param3 == 11127) {
                break L2;
              } else {
                var10 = null;
                this.a(39, -37, -125, 68, (String) null);
                break L2;
              }
            }
            L3: {
              var7 = ((ms) this).getParameter("servernum");
              if (var7 == null) {
                break L3;
              } else {
                ((ms) this).field_v = Integer.parseInt(var7);
                break L3;
              }
            }
            L4: {
              ((ms) this).field_t = Integer.parseInt(((ms) this).getParameter("gamecrc"));
              ((ms) this).field_w = Long.parseLong(((ms) this).getParameter("instanceid"));
              ((ms) this).field_n = ((ms) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((ms) this).getParameter("lang");
              if (var8 == null) {
                break L4;
              } else {
                ((ms) this).field_m = Integer.parseInt(var8);
                break L4;
              }
            }
            L5: {
              if (-6 >= (((ms) this).field_m ^ -1)) {
                ((ms) this).field_m = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((ms) this).getParameter("affid");
              if (var9 == null) {
                break L6;
              } else {
                ((ms) this).field_p = Integer.parseInt(var9);
                break L6;
              }
            }
            vla.field_s = Boolean.valueOf(((ms) this).getParameter("simplemode")).booleanValue();
            ((ms) this).a(param4, ((ms) this).field_t, 32, (byte) -119, param0, param1, param2);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var11 = null;
        cv.a(1, (String) null, (Throwable) (Object) var6);
        ((ms) this).a("crash", (byte) -48);
    }

    private final int q(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (!((ms) this).field_g) {
          L0: {
            if (param0 == 11) {
              break L0;
            } else {
              var3 = null;
              this.a(-35, 117, 41, -64, (String) null);
              break L0;
            }
          }
          if (er.d(11154)) {
            if (!qe.field_l) {
              var2 = mma.a(((ms) this).field_o, wk.a(true), 28, true, waa.a(true), ((ms) this).field_p);
              if (var2 == 0) {
                return -1;
              } else {
                if (-1 != var2) {
                  if (1 == var2) {
                    L1: {
                      if (11 != jv.field_j) {
                        break L1;
                      } else {
                        if (-1 == bp.field_x) {
                          laa.b(118);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return var2;
                  } else {
                    L2: {
                      if (!lna.field_f) {
                        ((ms) this).a("reconnect", (byte) -48);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    ih.e(param0 ^ 1);
                    ns.a(vt.field_m, -11, var2);
                    qe.field_l = true;
                    sja.field_hb = f.b((byte) 73) - -15000L;
                    return var2;
                  }
                } else {
                  L3: {
                    if (11 != jv.field_j) {
                      break L3;
                    } else {
                      if (-1 == bp.field_x) {
                        laa.b(118);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return var2;
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private final void e(byte param0) {
        if (param0 != 0) {
            int discarded$0 = ((ms) this).a(true, -29);
        }
        cl.field_p[1] = true;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (null != qt.field_l) {
            L1: {
              if (null == kga.field_c) {
                var6 = vw.a(-1334);
                var4 = var6.getSize();
                qt.field_l.a(false, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            qt.field_l.b((byte) 106);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          hi.a(116);
          qh.b((byte) 117);
          if (sn.c(94)) {
            break L2;
          } else {
            if (11 == jv.field_j) {
              break L2;
            } else {
              cv.d(-1);
              break L2;
            }
          }
        }
        L3: {
          if (null == sd.field_c) {
            break L3;
          } else {
            vc.field_a = sd.field_c.a((byte) -127);
            break L3;
          }
        }
        L4: {
          if (cia.a(0)) {
            L5: {
              var3 = 1200 * fda.a(0);
              if (((ms) this).field_s) {
                break L5;
              } else {
                if (sma.e(30) <= var3) {
                  break L4;
                } else {
                  if (var3 < jfa.e(-124)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((ms) this).field_s = false;
            vc.a((byte) -65);
            ih.e(10);
            ns.a(bja.field_m, -11, 2);
            eka.c((byte) -69);
            qe.field_l = true;
            sja.field_hb = f.b((byte) 73) - -15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if ((bp.field_x ^ -1) == 0) {
              break L7;
            } else {
              if (0 == bp.field_x) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (-1 != bp.field_x) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          var3 = stackIn_24_0;
          bp.field_x = dba.b((byte) 72);
          if (var3 != 0) {
            L9: {
              if (-1 == bp.field_x) {
                if (jv.field_j == -12) {
                  if (!er.d(11154)) {
                    laa.b(121);
                    break L9;
                  } else {
                    if (0 == bp.field_x) {
                      break L6;
                    } else {
                      if (bp.field_x == -1) {
                        break L6;
                      } else {
                        sja.field_hb = f.b((byte) 73) - -15000L;
                        break L6;
                      }
                    }
                  }
                } else {
                  if (0 == bp.field_x) {
                    break L6;
                  } else {
                    if (bp.field_x == -1) {
                      break L6;
                    } else {
                      sja.field_hb = f.b((byte) 73) - -15000L;
                      break L6;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            if (0 == bp.field_x) {
              break L6;
            } else {
              if (bp.field_x == 0) {
                break L6;
              } else {
                sja.field_hb = f.b((byte) 73) - -15000L;
                break L6;
              }
            }
          } else {
            if (0 == (bp.field_x ^ -1)) {
              break L6;
            } else {
              if (bp.field_x == -1) {
                break L6;
              } else {
                sja.field_hb = f.b((byte) 73) - -15000L;
                break L6;
              }
            }
          }
        }
        L10: {
          if (-1 == bp.field_x) {
            break L10;
          } else {
            if (bp.field_x != 0) {
              if ((lk.field_r ^ -1) > -11) {
                if (bp.field_x == 3) {
                  ((ms) this).a("js5crc", (byte) -48);
                  break L10;
                } else {
                  if ((bp.field_x ^ -1) == -5) {
                    ((ms) this).a("js5io", (byte) -48);
                    break L10;
                  } else {
                    if (bp.field_x == 2) {
                      ((ms) this).a("js5connect_full", (byte) -48);
                      break L10;
                    } else {
                      if (bp.field_x != 5) {
                        ((ms) this).a("js5connect", (byte) -48);
                        break L10;
                      } else {
                        ((ms) this).a("outofdate", (byte) -48);
                        break L10;
                      }
                    }
                  }
                }
              } else {
                if (10 <= jv.field_j) {
                  L11: {
                    ih.e(10);
                    if (3 != bp.field_x) {
                      if ((bp.field_x ^ -1) == -5) {
                        ns.a(dc.field_u, -11, 256);
                        break L11;
                      } else {
                        if (bp.field_x == -3) {
                          ns.a(ct.field_r, -11, 256);
                          break L11;
                        } else {
                          if (-6 != bp.field_x) {
                            ns.a(gfa.field_g, -11, 256);
                            break L11;
                          } else {
                            ns.a(cl.field_o, -11, 5);
                            break L11;
                          }
                        }
                      }
                    } else {
                      ns.a(mw.field_i, -11, 256);
                      break L11;
                    }
                  }
                  qe.field_l = true;
                  break L10;
                } else {
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (bp.field_x == 0) {
                break L14;
              } else {
                if (-1 != bp.field_x) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (er.d(11154)) {
              break L13;
            } else {
              if (-1 != bp.field_x) {
                break L12;
              } else {
                if (er.d(11154)) {
                  break L12;
                } else {
                  wk.field_b = false;
                  break L12;
                }
              }
            }
          }
          if (f.b((byte) 73) < sja.field_hb) {
            L15: {
              if (-1 == bp.field_x) {
                break L15;
              } else {
                if (-1 != bp.field_x) {
                  break L12;
                } else {
                  break L15;
                }
              }
            }
            if (er.d(11154)) {
              break L12;
            } else {
              wk.field_b = false;
              break L12;
            }
          } else {
            if (-1 != bp.field_x) {
              break L12;
            } else {
              if (er.d(11154)) {
                break L12;
              } else {
                wk.field_b = false;
                break L12;
              }
            }
          }
        }
        L16: {
          if (lk.field_r == 0) {
            if (!uf.a(109)) {
              break L16;
            } else {
              lk.field_r = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (1 == lk.field_r) {
            L18: {
              if (0 != kt.field_k) {
                lh.field_s = daa.c(68, gq.field_z);
                break L18;
              } else {
                break L18;
              }
            }
            bv.field_B = rs.a(1, false, 0, true, ct.field_q);
            fi.field_n = rs.a(1, false, 0, true, mj.field_j);
            em.field_T = rs.a(1, false, 0, true, vaa.field_d);
            lk.field_r = 2;
            vfa.field_p = fi.field_n;
            mt.field_p = bv.field_B;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (lk.field_r == 2) {
            L20: {
              if (lh.field_s != null) {
                if (!lh.field_s.a(0)) {
                  break L20;
                } else {
                  if (!lh.field_s.b("", false)) {
                    lh.field_s = null;
                    break L20;
                  } else {
                    if (lh.field_s.a("", 20637)) {
                      u.a(false, lh.field_s);
                      lh.field_s = null;
                      mia.b(32);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            if (lh.field_s == null) {
              lk.field_r = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (3 == lk.field_r) {
            if (!us.a(fi.field_n, bv.field_B, em.field_T, 76)) {
              break L21;
            } else {
              if (!vd.a((byte) 89, em.field_T)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    sr.a(48);
                    ut.d(-124);
                    lia.field_i = false;
                    mp.field_p = ema.field_Ab;
                    aw.a(vs.field_c, -12472, em.field_T, bv.field_B, fi.field_n);
                    if (ww.field_p) {
                      break L23;
                    } else {
                      if (nj.field_i == null) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_114_0 = -6;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_115_0 = stackOut_114_0;
                    if (ww.field_p) {
                      stackOut_116_0 = stackIn_116_0;
                      stackOut_116_1 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      break L24;
                    } else {
                      stackOut_115_0 = stackIn_115_0;
                      stackOut_115_1 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      stackIn_117_1 = stackOut_115_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_117_0 = stackIn_117_0;
                    stackOut_117_1 = stackIn_117_1;
                    stackIn_119_0 = stackOut_117_0;
                    stackIn_119_1 = stackOut_117_1;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    if (ww.field_p) {
                      stackOut_119_0 = stackIn_119_0;
                      stackOut_119_1 = stackIn_119_1;
                      stackOut_119_2 = 0;
                      stackIn_120_0 = stackOut_119_0;
                      stackIn_120_1 = stackOut_119_1;
                      stackIn_120_2 = stackOut_119_2;
                      break L25;
                    } else {
                      stackOut_118_0 = stackIn_118_0;
                      stackOut_118_1 = stackIn_118_1;
                      stackOut_118_2 = 1;
                      stackIn_120_0 = stackOut_118_0;
                      stackIn_120_1 = stackOut_118_1;
                      stackIn_120_2 = stackOut_118_2;
                      break L25;
                    }
                  }
                  vma.a((byte) stackIn_120_0, stackIn_120_1 != 0, stackIn_120_2 != 0, nj.field_i);
                  break L22;
                }
                L26: {
                  if (vla.field_s) {
                    nt.e((byte) 88);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null == dla.field_l) {
                    dla.field_l = cda.a(0);
                    de.field_E = rma.b(1);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                re.a(de.field_E, dla.field_l, em.field_T, false);
                em.field_T = null;
                bv.field_B = null;
                fi.field_n = null;
                rh.a(19007, (java.applet.Applet) this);
                mia.b(32);
                lk.field_r = 10;
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (10 != lk.field_r) {
            break L28;
          } else {
            L29: {
              if (kt.field_k == 0) {
                break L29;
              } else {
                nha.field_c = daa.c(124, ov.field_c);
                break L29;
              }
            }
            lk.field_r = 11;
            break L28;
          }
        }
        L30: {
          if (-12 == (lk.field_r ^ -1)) {
            L31: {
              if (nha.field_c == null) {
                break L31;
              } else {
                L32: {
                  if (!nha.field_c.a(0)) {
                    break L32;
                  } else {
                    if (!nha.field_c.b((byte) 99)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                dea.a(kh.a(nha.field_c, (byte) -57, gq.field_G, rj.field_q), 0.0f, 120);
                break L30;
              }
            }
            lk.field_r = 12;
            ed.field_a = true;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (lk.field_r == 12) {
            if (!ed.field_a) {
              lk.field_r = 13;
              break L33;
            } else {
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (param0 <= -12) {
            break L34;
          } else {
            this.k(10);
            break L34;
          }
        }
        L35: {
          if (-14 != (lk.field_r ^ -1)) {
            if (param1) {
              break L35;
            } else {
              if (!daa.field_vb) {
                break L35;
              } else {
                wd.a((byte) 70, dca.field_y);
                ((ms) this).a(44);
                nl.a(dca.field_y, (byte) 106);
                break L35;
              }
            }
          } else {
            if (param1) {
              break L35;
            } else {
              if (!daa.field_vb) {
                break L35;
              } else {
                wd.a((byte) 70, dca.field_y);
                ((ms) this).a(44);
                nl.a(dca.field_y, (byte) 106);
                break L35;
              }
            }
          }
        }
        L36: {
          if (cl.field_p[8]) {
            qfa.i(8);
            break L36;
          } else {
            break L36;
          }
        }
    }

    private final void j(int param0) {
        String var2 = sm.e(-45);
        if (param0 != -1) {
            return;
        }
        jia.a(var2, param0 + -103, nia.d(param0 + -31767));
    }

    final static sna n(int param0) {
        if (param0 < 48) {
            return null;
        }
        return ae.a(true);
    }

    final void a(boolean param0) {
        int var2 = 0;
        gs var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          var2 = ri.field_a;
          if (64 <= var2) {
            break L0;
          } else {
            if (cl.field_p[var2]) {
              if (0 == var2) {
                return;
              } else {
                L1: {
                  if (1 != var2) {
                    if (2 != var2) {
                      if (3 != var2) {
                        if (var2 != -5) {
                          if (-6 != var2) {
                            if (-7 != var2) {
                              if (var2 == 7) {
                                this.j(-1);
                                break L1;
                              } else {
                                if (8 == var2) {
                                  cda.a(dw.field_f, (lu) (Object) ig.field_m, ju.field_r, true);
                                  break L1;
                                } else {
                                  if (-17 == var2) {
                                    jja.b(-1048576);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (-12 == (var2 ^ -1)) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (13 != var2) {
                                            if (var2 != 17) {
                                              if (-19 == (var2 ^ -1)) {
                                                nja.a(118);
                                                break L1;
                                              } else {
                                                cv.a(1, "MGS1: " + nia.d((byte) -113), (Throwable) null);
                                                vc.a((byte) -72);
                                                break L1;
                                              }
                                            } else {
                                              this.k(10);
                                              break L1;
                                            }
                                          } else {
                                            rd.c((byte) -111);
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_29_0 = -10183;
                                      stackIn_31_0 = stackOut_29_0;
                                      stackIn_30_0 = stackOut_29_0;
                                      if (var2 != 12) {
                                        stackOut_31_0 = stackIn_31_0;
                                        stackOut_31_1 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        stackIn_32_1 = stackOut_31_1;
                                        break L3;
                                      } else {
                                        stackOut_30_0 = stackIn_30_0;
                                        stackOut_30_1 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        stackIn_32_1 = stackOut_30_1;
                                        break L3;
                                      }
                                    }
                                    var3 = via.a(stackIn_32_0, stackIn_32_1 != 0);
                                    fda.a(var3, 3100);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              wda.a((byte) 116);
                              break L1;
                            }
                          } else {
                            qfa.h(-63);
                            break L1;
                          }
                        } else {
                          eha.c(-64);
                          break L1;
                        }
                      } else {
                        sh.l(-71);
                        break L1;
                      }
                    } else {
                      ola.c((byte) -60);
                      break L1;
                    }
                  } else {
                    p.c(-84);
                    break L1;
                  }
                }
                L4: {
                  if (param0) {
                    break L4;
                  } else {
                    ((ms) this).field_s = true;
                    break L4;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        cv.a(1, "MGS2: " + nia.d((byte) -96), (Throwable) null);
        vc.a((byte) -70);
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.a(true, true);
        if (!(!param6)) {
            this.e((byte) 0);
        }
        if (!(!param0)) {
            this.p(-108);
        }
        if (param4) {
            this.m(4);
        }
        if (param5) {
            this.o(-25800);
        }
        if (param1 != 62) {
            ((ms) this).field_l = -78;
        }
        if (!(!param3)) {
            this.h(123);
        }
        if (!(!param2)) {
            this.i(-2);
        }
    }

    private final void m(int param0) {
        cl.field_p[param0] = true;
    }

    private final void i(int param0) {
        if (param0 != -2) {
            return;
        }
        cl.field_p[13] = true;
        cl.field_p[12] = true;
        cl.field_p[11] = true;
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            lu var7 = null;
            String var8 = null;
            int var9 = 0;
            Object var10 = null;
            Object var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = BachelorFridge.field_y;
                        var4 = vea.a(8192, vc.field_a, kt.field_k, param0);
                        if (-1 == var4) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 3: {
                        if (-2 != var4) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5 = sp.a(kla.e(52), false, ti.a(-22));
                        if ((var5 ^ -1) != 0) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        oha.a(vd.field_B, var5, 4, vt.field_m);
                        vd.field_B = null;
                        vt.field_m = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var12 = nma.b(true);
                        if (var12 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        vq.a((byte) -64, var12.booleanValue());
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if ((var4 ^ -1) != -3) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var5 = dha.a(lha.a((byte) -89), (byte) 53, waa.a(true), jc.f(-24457), tt.e(21240), ((ms) this).field_p, wk.a(true));
                        if (0 == var5) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        fv.a(true, var5, vt.field_m, vd.field_B);
                        vt.field_m = null;
                        vd.field_B = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-4 != var4) {
                            statePc = 24;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (-1 == bp.field_x) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (0 != bp.field_x) {
                            statePc = 16;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        bp.field_x = -1;
                        waa.b(false);
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (!param2) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        qe.field_l = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 19: {
                        var5 = mma.a(((ms) this).field_o, wk.a(true), 5, false, waa.a(true), ((ms) this).field_p);
                        if (0 != (var5 ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (var5 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        om.field_v = gha.field_a;
                        laa.b(-122);
                        qo.field_c = false;
                        jv.field_j = 10;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        ns.a(vt.field_m, -11, var5);
                        vt.field_m = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (var4 == 4) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (vs.field_c) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        jv.field_j = 10;
                        qo.field_c = true;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        dp.a(nia.d(-31768), -99);
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if ((var4 ^ -1) == -6) {
                            statePc = 31;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        dh.a(nia.d(-31768), 56);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (var4 == -7) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (lia.field_i) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        jv.field_j = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (-8 != var4) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        gma.a(nia.d(-31768), false);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (var4 == 8) {
                            statePc = 41;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        dp.a(nia.d(-31768), -80);
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (var4 != 9) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        lha.a(nia.d(-31768), -17672);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (var4 != 10) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        sja.field_fb.c(17, (byte) 127);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (-12 != (var4 ^ -1)) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        qfa.a(nia.d(-31768), -61);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if ((var4 ^ -1) != -13) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        eea.a((byte) 127, mg.d(320), nia.d(-31768));
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        var5 = 110 / ((-1 - param1) / 57);
                        if (-14 == (var4 ^ -1)) {
                            statePc = 52;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        try {
                            if (lf.field_d != null) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            lf.field_d = new tca(ju.field_r, new java.net.URL(((ms) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (!lf.field_d.b((byte) 126)) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var7 = lf.field_d.a(-11514);
                            if (var7 == null) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var8 = gt.a(0, var7.field_h, (byte) 104, var7.field_g);
                            ana.a(-1, var8);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var10 = null;
                            ana.a(-1, (String) null);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            lf.field_d = null;
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 60;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        var6 = (Exception) (Object) caughtException;
                        cv.a(1, "S1", (Throwable) (Object) var6);
                        var11 = null;
                        ana.a(-1, (String) null);
                        lf.field_d = null;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if ((var4 ^ -1) == -16) {
                            statePc = 63;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        jv.field_j = 10;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if (16 == var4) {
                            statePc = 66;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        return 1;
                    }
                    case 67: {
                        if (17 == var4) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return 0;
                    }
                    case 69: {
                        return 2;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(int param0) {
        cl.field_p[6] = true;
        if (param0 <= 80) {
            ((ms) this).a(true);
        }
    }

    final int g(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.q(11);
            if (var2 == 0) {
              break L1;
            } else {
              if ((var2 ^ -1) != -2) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!cl.field_p[1]) {
              break L2;
            } else {
              kda.a(-85, 2);
              break L2;
            }
          }
          L3: {
            if (cl.field_p[2]) {
              ub.a(3, 1);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (cl.field_p[3]) {
              rg.a(35, 4);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!cl.field_p[4]) {
              break L5;
            } else {
              tc.a(5, -16482);
              break L5;
            }
          }
          L6: {
            if (!cl.field_p[5]) {
              break L6;
            } else {
              fk.c(-60, 6);
              break L6;
            }
          }
          L7: {
            if (cl.field_p[6]) {
              vr.a((byte) 75, 7);
              break L7;
            } else {
              break L7;
            }
          }
          if (cl.field_p[8]) {
            ct.c(true);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 >= -61) {
          return -92;
        } else {
          return var2;
        }
    }

    private final void a(boolean param0, boolean param1) {
        cl.field_p[3] = true;
        cl.field_p[0] = true;
        cl.field_p[18] = param1;
        cl.field_p[8] = param0;
        cl.field_p[17] = true;
        cl.field_p[16] = true;
        cl.field_p[7] = true;
    }

    private final void f(byte param0) {
        mfa.field_b[18] = 1;
        mfa.field_b[17] = -1;
        mfa.field_b[6] = -2;
        mfa.field_b[8] = -2;
        mfa.field_b[1] = 16;
        mfa.field_b[11] = -1;
        mfa.field_b[10] = -1;
        mfa.field_b[7] = -1;
        mfa.field_b[16] = -1;
        if (param0 != -115) {
          return;
        } else {
          mfa.field_b[5] = -1;
          mfa.field_b[2] = -2;
          mfa.field_b[12] = -1;
          mfa.field_b[9] = -1;
          mfa.field_b[13] = -1;
          mfa.field_b[3] = -1;
          mfa.field_b[4] = -1;
          return;
        }
    }

    private final void k(int param0) {
        int var2 = ig.field_m.b(16711935);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = dw.field_f - 1;
        byte[] var5 = new byte[var4];
        ig.field_m.b(var5, var4, 0, param0 + -31918);
        gja.a(var3 != 0, nia.d(-31768), qq.a(var5, false), 38);
        if (param0 != 10) {
            int discarded$0 = this.a(false, 81, false);
        }
    }

    private final void o(int param0) {
        if (param0 != -25800) {
            ((ms) this).field_k = -74;
        }
        cl.field_p[5] = true;
    }

    protected ms() {
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ms) this).setBackground(java.awt.Color.black);
        kt.field_k = ((ms) this).field_m;
        sr.a(kt.field_k, (byte) 78);
        vda.a(((ms) this).field_w, ((ms) this).field_v, 5000, param0, param5, ((ms) this).field_n, 5000, 64, ju.field_r, ((ms) this).field_k, kt.field_k, ((ms) this).field_r, ((ms) this).field_t, ((ms) this).field_l);
        cc.a(param0, ((ms) this).field_r, -1456477592, ((ms) this).field_k, ((ms) this).field_l, ju.field_r, kt.field_k, ((ms) this).field_v, ((ms) this).field_t);
        wma.c((byte) 69);
        sd.field_c = qq.b(-5368);
        nl.a(dca.field_y, (byte) 76);
        mj.field_j = param6;
        if (param4) {
            this.o(62);
        }
        gq.field_z = param2;
        ov.field_c = param1;
        vaa.field_d = param7;
        ct.field_q = param3;
        this.f((byte) -115);
        ih.d(15366);
    }

    final void a(int param0, String param1, int param2) {
        if (param0 != -8771) {
            ((ms) this).field_w = -116L;
        }
        this.a(640, param2, 480, param0 + 19898, param1);
    }

    final void l(int param0) {
        int var3 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (gw.a((byte) 110)) {
            L1: {
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (kga.field_c == null) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            int discarded$135 = this.a(stackIn_10_1 != 0, -89, false);
            break L0;
          } else {
            if (lk.field_r < 10) {
              break L0;
            } else {
              if (ad.d((byte) 38)) {
                if (-1 != (jv.field_j ^ -1)) {
                  aca.a((byte) -118, vc.field_a);
                  break L0;
                } else {
                  int discarded$136 = this.a(false, 113, false);
                  break L0;
                }
              } else {
                ei.a((byte) -34);
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 == 10) {
            break L2;
          } else {
            int discarded$137 = this.q(18);
            break L2;
          }
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 > -14) {
            Object var4 = null;
            ((ms) this).a(-85, (String) null, -60);
        }
        return this.a(param0, 76, true);
    }

    private final void p(int param0) {
        cl.field_p[2] = true;
        if (param0 > -107) {
            int discarded$0 = this.q(108);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "End Phase";
    }
}
