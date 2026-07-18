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

    public static void g() {
        field_q = null;
        field_u = null;
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          try {
            L0: {
              if (!((ms) this).d((byte) 105)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((ms) this).field_r = ((ms) this).getCodeBase().getHost();
                    var12 = ((ms) this).field_r.toLowerCase();
                    stackOut_3_0 = this;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var12.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (!var12.endsWith(".jagex.com")) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L1;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L1;
                }
                L3: {
                  ((ms) this).field_o = stackIn_8_1 != 0;
                  ((ms) this).field_l = Integer.parseInt(((ms) this).getParameter("gameport1"));
                  ((ms) this).field_k = Integer.parseInt(((ms) this).getParameter("gameport2"));
                  if (param3 == 11127) {
                    break L3;
                  } else {
                    var10 = null;
                    this.a(39, -37, -125, 68, (String) null);
                    break L3;
                  }
                }
                L4: {
                  var7 = ((ms) this).getParameter("servernum");
                  if (var7 == null) {
                    break L4;
                  } else {
                    ((ms) this).field_v = Integer.parseInt(var7);
                    break L4;
                  }
                }
                L5: {
                  ((ms) this).field_t = Integer.parseInt(((ms) this).getParameter("gamecrc"));
                  ((ms) this).field_w = Long.parseLong(((ms) this).getParameter("instanceid"));
                  ((ms) this).field_n = ((ms) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ms) this).getParameter("lang");
                  if (var8 == null) {
                    break L5;
                  } else {
                    ((ms) this).field_m = Integer.parseInt(var8);
                    break L5;
                  }
                }
                L6: {
                  if (((ms) this).field_m >= 5) {
                    ((ms) this).field_m = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var9 = ((ms) this).getParameter("affid");
                  if (var9 == null) {
                    break L7;
                  } else {
                    ((ms) this).field_p = Integer.parseInt(var9);
                    break L7;
                  }
                }
                vla.field_s = Boolean.valueOf(((ms) this).getParameter("simplemode")).booleanValue();
                ((ms) this).a(param4, ((ms) this).field_t, 32, (byte) -119, param0, param1, param2);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var11 = null;
              cv.a(1, (String) null, (Throwable) (Object) var6);
              ((ms) this).a("crash", (byte) -48);
              break L8;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6_ref;
            stackOut_23_1 = new StringBuilder().append("ms.MA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
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
              int discarded$2 = 1;
              var2 = mma.a(((ms) this).field_o, wk.a(true), 28, true, waa.a(), ((ms) this).field_p);
              if (var2 == -1) {
                return -1;
              } else {
                L1: {
                  if (var2 == 0) {
                    break L1;
                  } else {
                    if (1 != var2) {
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
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (11 != jv.field_j) {
                    break L3;
                  } else {
                    if (bp.field_x == 0) {
                      laa.b(118);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                return var2;
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

    private final void e() {
        cl.field_p[1] = true;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_140_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        L0: {
          var5 = BachelorFridge.field_y;
          if (null != qt.field_l) {
            L1: {
              if (null == kga.field_c) {
                int discarded$12 = -1334;
                var6 = vw.a();
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
          int discarded$13 = 116;
          hi.a();
          int discarded$14 = 117;
          qh.b();
          if (sn.c(94)) {
            break L2;
          } else {
            if (11 == jv.field_j) {
              break L2;
            } else {
              int discarded$15 = -1;
              cv.d();
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
          int discarded$16 = 0;
          if (cia.a()) {
            L5: {
              int discarded$17 = 0;
              var3 = 1200 * fda.a();
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
            if (bp.field_x == -1) {
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
          L9: {
            var3 = stackIn_24_0;
            int discarded$18 = 72;
            bp.field_x = dba.b();
            if (var3 == 0) {
              break L9;
            } else {
              if (bp.field_x == 0) {
                if (jv.field_j != 11) {
                  break L9;
                } else {
                  if (er.d(11154)) {
                    break L9;
                  } else {
                    laa.b(121);
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (bp.field_x == -1) {
            break L6;
          } else {
            if (bp.field_x == 0) {
              break L6;
            } else {
              sja.field_hb = f.b((byte) 73) - -15000L;
              break L6;
            }
          }
        }
        L10: {
          if (-1 == bp.field_x) {
            break L10;
          } else {
            if (bp.field_x != 0) {
              if (lk.field_r < 10) {
                if (bp.field_x == 3) {
                  ((ms) this).a("js5crc", (byte) -48);
                  break L10;
                } else {
                  if (bp.field_x == 4) {
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
                      if (bp.field_x == 4) {
                        ns.a(dc.field_u, -11, 256);
                        break L11;
                      } else {
                        if (bp.field_x == 2) {
                          ns.a(ct.field_r, -11, 256);
                          break L11;
                        } else {
                          if (bp.field_x != 5) {
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
              if (bp.field_x == -1) {
                break L14;
              } else {
                if (bp.field_x != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (er.d(11154)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (f.b((byte) 73) < sja.field_hb) {
            break L12;
          } else {
            qe.field_l = false;
            if (-1 == bp.field_x) {
              break L12;
            } else {
              if (0 != bp.field_x) {
                bp.field_x = -1;
                int discarded$19 = 0;
                waa.b();
                break L12;
              } else {
                break L12;
              }
            }
          }
        }
        L15: {
          if (bp.field_x != 0) {
            break L15;
          } else {
            if (er.d(11154)) {
              break L15;
            } else {
              wk.field_b = false;
              break L15;
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
            int discarded$20 = 76;
            if (!us.a(fi.field_n, bv.field_B, em.field_T)) {
              break L21;
            } else {
              if (!vd.a((byte) 89, em.field_T)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    sr.a(48);
                    int discarded$21 = -124;
                    ut.d();
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
                    stackOut_101_0 = -6;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_102_0 = stackOut_101_0;
                    if (ww.field_p) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      break L24;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_104_0 = stackIn_104_0;
                    stackOut_104_1 = stackIn_104_1;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    if (ww.field_p) {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      stackIn_107_2 = stackOut_106_2;
                      break L25;
                    } else {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      stackIn_107_2 = stackOut_105_2;
                      break L25;
                    }
                  }
                  vma.a((byte) stackIn_107_0, stackIn_107_1 != 0, stackIn_107_2 != 0, nj.field_i);
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
                    int discarded$22 = 0;
                    dla.field_l = cda.a();
                    de.field_E = rma.b(1);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                int discarded$23 = 0;
                re.a(de.field_E, dla.field_l, em.field_T);
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
          if (lk.field_r == 11) {
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
          if (lk.field_r != 13) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (null != ql.field_t) {
                L37: {
                  if (!ql.field_t.a((byte) 49)) {
                    stackOut_139_0 = 0;
                    stackIn_140_0 = stackOut_139_0;
                    break L37;
                  } else {
                    stackOut_138_0 = 1;
                    stackIn_140_0 = stackOut_138_0;
                    break L37;
                  }
                }
                var3 = stackIn_140_0;
                dea.a(ql.field_t.field_d, ql.field_t.field_b, 115);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 != 0) {
              lk.field_r = 20;
              break L35;
            } else {
              break L35;
            }
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (!daa.field_vb) {
              break L38;
            } else {
              wd.a((byte) 70, dca.field_y);
              ((ms) this).a(44);
              nl.a(dca.field_y, (byte) 106);
              break L38;
            }
          }
        }
        L39: {
          if (cl.field_p[8]) {
            qfa.i(8);
            break L39;
          } else {
            break L39;
          }
        }
    }

    private final void j(int param0) {
        int discarded$0 = -45;
        String var2 = sm.e();
        jia.a(var2, -104, nia.d(-31768));
    }

    final static sna n() {
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
                        if (var2 != 4) {
                          if (var2 != 5) {
                            if (var2 != 6) {
                              if (var2 == 7) {
                                this.j(-1);
                                break L1;
                              } else {
                                if (8 == var2) {
                                  int discarded$9 = 1;
                                  cda.a(dw.field_f, (lu) (Object) ig.field_m, ju.field_r);
                                  break L1;
                                } else {
                                  if (var2 == 16) {
                                    jja.b(-1048576);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (13 != var2) {
                                            if (var2 != 17) {
                                              if (var2 == 18) {
                                                int discarded$10 = 118;
                                                nja.a();
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
                                    int discarded$11 = 3100;
                                    fda.a(var3);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              int discarded$12 = 116;
                              wda.a();
                              break L1;
                            }
                          } else {
                            int discarded$13 = -63;
                            qfa.h();
                            break L1;
                          }
                        } else {
                          int discarded$14 = -64;
                          eha.c();
                          break L1;
                        }
                      } else {
                        int discarded$15 = -71;
                        sh.l();
                        break L1;
                      }
                    } else {
                      int discarded$16 = -60;
                      ola.c();
                      break L1;
                    }
                  } else {
                    int discarded$17 = -84;
                    p.c();
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
        int discarded$0 = 1;
        int discarded$1 = 1;
        this.a();
        if (!(!param6)) {
            int discarded$2 = 0;
            this.e();
        }
        if (!(!param0)) {
            int discarded$3 = -108;
            this.p();
        }
        if (param4) {
            int discarded$4 = 4;
            this.m();
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
            int discarded$5 = -2;
            this.i();
        }
    }

    private final void m() {
        cl.field_p[4] = true;
    }

    private final void i() {
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
            var9 = BachelorFridge.field_y;
            var4 = vea.a(8192, vc.field_a, kt.field_k, param0);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$9 = -22;
                    var5 = sp.a(kla.e(52), false, ti.a());
                    if (var5 != -1) {
                      oha.a(vd.field_B, var5, 4, vt.field_m);
                      vd.field_B = null;
                      vt.field_m = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$10 = 1;
                  var12 = nma.b();
                  if (var12 == null) {
                    break L0;
                  } else {
                    vq.a((byte) -64, var12.booleanValue());
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$11 = -89;
                  int discarded$12 = 1;
                  int discarded$13 = -24457;
                  var5 = dha.a(lha.a(), (byte) 53, waa.a(), jc.f(), tt.e(21240), ((ms) this).field_p, wk.a(true));
                  if (var5 == -1) {
                    break L2;
                  } else {
                    fv.a(true, var5, vt.field_m, vd.field_B);
                    vt.field_m = null;
                    vd.field_B = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 != 3) {
                  break L3;
                } else {
                  L4: {
                    if (-1 == bp.field_x) {
                      break L4;
                    } else {
                      if (0 != bp.field_x) {
                        bp.field_x = -1;
                        int discarded$14 = 0;
                        waa.b();
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param2) {
                    int discarded$15 = 1;
                    var5 = mma.a(((ms) this).field_o, wk.a(true), 5, false, waa.a(), ((ms) this).field_p);
                    if (var5 != -1) {
                      if (var5 != 0) {
                        ns.a(vt.field_m, -11, var5);
                        vt.field_m = null;
                        break L3;
                      } else {
                        om.field_v = gha.field_a;
                        laa.b(-122);
                        qo.field_c = false;
                        jv.field_j = 10;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    qe.field_l = false;
                    break L3;
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (vs.field_c) {
                    dp.a(nia.d(-31768), -99);
                    break L5;
                  } else {
                    jv.field_j = 10;
                    qo.field_c = true;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 == 5) {
                  dh.a(nia.d(-31768), 56);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (lia.field_i) {
                    jv.field_j = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 != 7) {
                  break L8;
                } else {
                  int discarded$16 = 0;
                  gma.a(nia.d(-31768));
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  dp.a(nia.d(-31768), -80);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 != 9) {
                  break L10;
                } else {
                  int discarded$17 = -17672;
                  lha.a(nia.d(-31768));
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  sja.field_fb.c(17, (byte) 127);
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  qfa.a(nia.d(-31768), -61);
                  break L12;
                }
              }
              L13: {
                if (var4 != 12) {
                  break L13;
                } else {
                  eea.a((byte) 127, mg.d(320), nia.d(-31768));
                  break L13;
                }
              }
              L14: {
                var5 = 110 / ((-1 - param1) / 57);
                if (var4 == 13) {
                  try {
                    L15: {
                      L16: {
                        if (lf.field_d != null) {
                          break L16;
                        } else {
                          lf.field_d = new tca(ju.field_r, new java.net.URL(((ms) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!lf.field_d.b((byte) 126)) {
                          break L17;
                        } else {
                          L18: {
                            var7 = lf.field_d.a(-11514);
                            if (var7 == null) {
                              var10 = null;
                              ana.a(-1, (String) null);
                              break L18;
                            } else {
                              var8 = gt.a(0, var7.field_h, (byte) 104, var7.field_g);
                              ana.a(-1, var8);
                              break L18;
                            }
                          }
                          lf.field_d = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      cv.a(1, "S1", (Throwable) (Object) var6);
                      var11 = null;
                      ana.a(-1, (String) null);
                      lf.field_d = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (var4 == 15) {
                  jv.field_j = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (16 == var4) {
                return 1;
              } else {
                if (17 != var4) {
                  return 0;
                } else {
                  return 2;
                }
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
    }

    final int g(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.q(11);
            if (var2 == 0) {
              break L1;
            } else {
              if (var2 != 1) {
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

    private final void a() {
        cl.field_p[3] = true;
        cl.field_p[0] = true;
        cl.field_p[18] = true;
        cl.field_p[8] = true;
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
        mfa.field_b[5] = -1;
        mfa.field_b[2] = -2;
        mfa.field_b[12] = -1;
        mfa.field_b[9] = -1;
        mfa.field_b[13] = -1;
        mfa.field_b[3] = -1;
        mfa.field_b[4] = -1;
    }

    private final void k(int param0) {
        int var2 = ig.field_m.b(16711935);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = dw.field_f - 1;
        byte[] var5 = new byte[var4];
        ig.field_m.b(var5, var4, 0, -31908);
        gja.a(var3 != 0, nia.d(-31768), qq.a(var5, false), 38);
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
        int discarded$0 = 69;
        wma.c();
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
        int discarded$1 = 15366;
        ih.d();
    }

    final void a(int param0, String param1, int param2) {
        try {
            if (param0 != -8771) {
                ((ms) this).field_w = -116L;
            }
            this.a(640, param2, 480, param0 + 19898, param1);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ms.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
            int discarded$176 = this.a(stackIn_10_1 != 0, -89, false);
            break L0;
          } else {
            if (lk.field_r < 10) {
              break L0;
            } else {
              if (ad.d((byte) 38)) {
                if (jv.field_j != 0) {
                  aca.a((byte) -118, vc.field_a);
                  break L0;
                } else {
                  int discarded$177 = this.a(false, 113, false);
                  break L0;
                }
              } else {
                int discarded$178 = -34;
                ei.a();
                break L0;
              }
            }
          }
        }
        L2: {
          if (param0 == 10) {
            break L2;
          } else {
            int discarded$179 = this.q(18);
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

    private final void p() {
        cl.field_p[2] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "End Phase";
    }
}
