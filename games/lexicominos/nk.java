/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nk extends qb {
    private int field_A;
    private int field_r;
    static int field_z;
    private int field_s;
    private int field_q;
    private int field_u;
    private int field_D;
    static String field_C;
    private boolean field_x;
    private boolean field_y;
    private boolean field_w;
    String field_B;
    private long field_v;
    static String field_t;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ri.field_e = this.field_u;
        jh.a(14221, ri.field_e);
        sb.a(this.field_v, jh.field_a, this.field_q, 0, param2, param7, ri.field_e, this.field_s, param4, this.field_D, this.field_B, 5000, this.field_r, this.field_x);
        uk.a(this.field_D, this.field_s, ri.field_e, jh.field_a, this.field_r, (byte) -92, param7, this.field_q, this.field_B);
        li.g(false);
        rk.field_c = bl.a(115);
        ha.a(ug.field_y, (byte) 76);
        th.field_m = param6;
        ea.field_d = param0;
        ll.field_f = param1;
        ij.field_l = param3;
        gf.field_e = param5;
        this.g(7);
        vk.b(0);
    }

    private final void h(int param0) {
        String var2 = kg.g(0);
        if (param0 != 16) {
            this.field_w = true;
        }
        gg.a(true, kk.c(-14047), var2);
    }

    private final void j(int param0) {
        ij.field_o[4] = true;
        if (param0 >= -25) {
            this.l(-103);
        }
    }

    private final void i(int param0) {
        ij.field_o[2] = true;
        if (param0 != -1) {
            this.field_r = -84;
        }
    }

    private final void a(int param0, boolean param1) {
        ij.field_o[17] = true;
        ij.field_o[0] = true;
        ij.field_o[18] = true;
        ij.field_o[7] = true;
        ij.field_o[8] = param1;
        ij.field_o[16] = true;
        ij.field_o[param0] = true;
    }

    public static void c(byte param0) {
        if (param0 != 89) {
            nk.c((byte) -5);
        }
        field_t = null;
        field_C = null;
    }

    final int b(boolean param0, int param1) {
        if (param1 >= -51) {
            this.field_u = 35;
        }
        return this.a(true, 0, param0);
    }

    final void e(byte param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int var3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        L0: {
          L1: {
            var3 = Lexicominos.field_L ? 1 : 0;
            if (!ha.a(118)) {
              break L1;
            } else {
              L2: {
                stackOut_1_0 = this;
                stackOut_1_1 = 0;
                stackOut_1_2 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                stackIn_2_2 = stackOut_1_2;
                if (null == ff.field_b) {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = stackIn_3_2;
                  stackOut_3_3 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  stackIn_4_3 = stackOut_3_3;
                  break L2;
                } else {
                  stackOut_2_0 = this;
                  stackOut_2_1 = stackIn_2_1;
                  stackOut_2_2 = stackIn_2_2;
                  stackOut_2_3 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  stackIn_4_3 = stackOut_2_3;
                  break L2;
                }
              }
              discarded$6 = this.a(stackIn_4_1 != 0, stackIn_4_2, stackIn_4_3 != 0);
              if (var3 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (10 <= wf.field_i) {
            L3: {
              if (og.a(23440)) {
                break L3;
              } else {
                ta.d(-108);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (ta.field_g != 0) {
                break L4;
              } else {
                discarded$7 = this.a(false, 0, false);
                if (var3 == 0) {
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            hb.a(gd.field_l, true);
            break L0;
          } else {
            break L0;
          }
        }
        L5: {
          if (param0 >= 4) {
            break L5;
          } else {
            discarded$8 = this.a(true, 79, false);
            break L5;
          }
        }
    }

    private final void g(int param0) {
        fg.field_f[5] = -1;
        fg.field_f[12] = -1;
        fg.field_f[8] = -2;
        fg.field_f[3] = -1;
        fg.field_f[1] = 16;
        fg.field_f[16] = -1;
        fg.field_f[13] = -1;
        fg.field_f[2] = -2;
        fg.field_f[6] = -2;
        fg.field_f[18] = 1;
        fg.field_f[4] = -1;
        fg.field_f[17] = -1;
        fg.field_f[11] = -1;
        fg.field_f[9] = -1;
        fg.field_f[param0] = -1;
        fg.field_f[10] = -1;
    }

    final void c(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_25_0 = 0;
        String stackIn_109_0 = null;
        String stackIn_110_0 = null;
        String stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        String stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        String stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        String stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_147_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String stackOut_108_0 = null;
        String stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        String stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        String stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        String stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        String stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_146_0 = 0;
        int stackOut_145_0 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (null != da.field_a) {
            L1: {
              if (ff.field_b == null) {
                var6 = jd.a(-88);
                var4 = var6.getSize();
                da.field_a.a(var4.height, (byte) -65, var4.width);
                break L1;
              } else {
                break L1;
              }
            }
            da.field_a.d(-1);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          u.j(param1 ^ 6);
          bf.b((byte) -21);
          if (lh.b(param1 ^ 24920)) {
            break L2;
          } else {
            if ((ta.field_g ^ -1) != -12) {
              kj.a((byte) 22);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != rk.field_c) {
            gd.field_l = rk.field_c.c(82);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!bd.c(false)) {
            break L4;
          } else {
            L5: {
              var3 = cl.p(param1 + -127) * 1200;
              if (this.field_w) {
                break L5;
              } else {
                if ((ec.a(-28617) ^ -1) >= (var3 ^ -1)) {
                  break L4;
                } else {
                  if (var3 >= rf.a(30448)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_w = false;
            ck.b((byte) -125);
            ia.a((byte) 93);
            sc.a(2, (byte) -128, kk.field_i);
            l.i(57);
            kj.field_o = true;
            mc.field_i = rf.c(0) - -15000L;
            break L4;
          }
        }
        L6: {
          L7: {
            if ((nc.field_r ^ -1) == 0) {
              break L7;
            } else {
              if (-1 == (nc.field_r ^ -1)) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if ((nc.field_r ^ -1) != 0) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L8;
            } else {
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_25_0;
            nc.field_r = ea.a((byte) 105);
            if (var3 == 0) {
              break L9;
            } else {
              if (0 == nc.field_r) {
                if (ta.field_g != 11) {
                  break L9;
                } else {
                  if (d.a((byte) 117)) {
                    break L9;
                  } else {
                    wb.b((byte) 50);
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (-1 == nc.field_r) {
            break L6;
          } else {
            if (0 == nc.field_r) {
              break L6;
            } else {
              mc.field_i = rf.c(0) + 15000L;
              break L6;
            }
          }
        }
        L10: {
          if ((nc.field_r ^ -1) == 0) {
            break L10;
          } else {
            if ((nc.field_r ^ -1) == -1) {
              break L10;
            } else {
              L11: {
                if ((wf.field_i ^ -1) > -11) {
                  break L11;
                } else {
                  if ((ta.field_g ^ -1) <= -11) {
                    L12: {
                      L13: {
                        ia.a((byte) 103);
                        if ((nc.field_r ^ -1) == -4) {
                          break L13;
                        } else {
                          L14: {
                            if (-5 != (nc.field_r ^ -1)) {
                              break L14;
                            } else {
                              sc.a(256, (byte) -114, jd.field_b);
                              if (var5 == 0) {
                                break L12;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (nc.field_r == 2) {
                              break L15;
                            } else {
                              L16: {
                                if ((nc.field_r ^ -1) != -6) {
                                  break L16;
                                } else {
                                  sc.a(5, (byte) 96, ri.field_f);
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              sc.a(256, (byte) 111, e.field_g);
                              if (var5 == 0) {
                                break L12;
                              } else {
                                break L15;
                              }
                            }
                          }
                          sc.a(256, (byte) -93, ib.field_b);
                          if (var5 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      sc.a(256, (byte) -98, mh.field_H);
                      break L12;
                    }
                    kj.field_o = true;
                    if (var5 == 0) {
                      break L10;
                    } else {
                      break L11;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L17: {
                if (3 == nc.field_r) {
                  break L17;
                } else {
                  L18: {
                    if (-5 != (nc.field_r ^ -1)) {
                      break L18;
                    } else {
                      this.a("js5io", param1 ^ -113);
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L18;
                      }
                    }
                  }
                  L19: {
                    if (2 == nc.field_r) {
                      break L19;
                    } else {
                      L20: {
                        if (nc.field_r == 5) {
                          break L20;
                        } else {
                          this.a("js5connect", 80);
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L20;
                          }
                        }
                      }
                      this.a("outofdate", 90);
                      if (var5 == 0) {
                        break L10;
                      } else {
                        break L19;
                      }
                    }
                  }
                  this.a("js5connect_full", 118);
                  if (var5 == 0) {
                    break L10;
                  } else {
                    break L17;
                  }
                }
              }
              this.a("js5crc", 78);
              break L10;
            }
          }
        }
        L21: {
          L22: {
            L23: {
              if (0 == (nc.field_r ^ -1)) {
                break L23;
              } else {
                if (nc.field_r != 0) {
                  break L22;
                } else {
                  break L23;
                }
              }
            }
            if (d.a((byte) -24)) {
              break L22;
            } else {
              break L21;
            }
          }
          if (mc.field_i > rf.c(0)) {
            break L21;
          } else {
            kj.field_o = false;
            if ((nc.field_r ^ -1) == 0) {
              break L21;
            } else {
              if ((nc.field_r ^ -1) != -1) {
                nc.field_r = -1;
                si.e((byte) 13);
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L24: {
          if (nc.field_r != 0) {
            break L24;
          } else {
            if (!d.a((byte) 112)) {
              fh.field_i = false;
              break L24;
            } else {
              break L24;
            }
          }
        }
        L25: {
          if ((wf.field_i ^ -1) == param1) {
            if (!gd.d((byte) -53)) {
              break L25;
            } else {
              wf.field_i = 1;
              break L25;
            }
          } else {
            break L25;
          }
        }
        L26: {
          if (1 == wf.field_i) {
            L27: {
              if (ri.field_e == 0) {
                break L27;
              } else {
                eh.field_d = oj.a(false, th.field_m);
                break L27;
              }
            }
            we.field_h = cl.a(true, (byte) -98, false, gf.field_e, 1);
            gk.field_a = cl.a(true, (byte) -15, false, ij.field_l, 1);
            ej.field_d = cl.a(true, (byte) -37, false, ll.field_f, 1);
            wf.field_i = 2;
            gg.field_d = gk.field_a;
            th.field_p = we.field_h;
            break L26;
          } else {
            break L26;
          }
        }
        L28: {
          if ((wf.field_i ^ -1) != -3) {
            break L28;
          } else {
            L29: {
              if (eh.field_d == null) {
                break L29;
              } else {
                if (eh.field_d.c(92)) {
                  L30: {
                    if (!eh.field_d.a("", (byte) -114)) {
                      break L30;
                    } else {
                      if (eh.field_d.a("", 10762)) {
                        kb.a(-119, eh.field_d);
                        eh.field_d = null;
                        dl.b(5);
                        if (var5 == 0) {
                          break L29;
                        } else {
                          break L30;
                        }
                      } else {
                        break L29;
                      }
                    }
                  }
                  eh.field_d = null;
                  break L29;
                } else {
                  break L29;
                }
              }
            }
            if (null == eh.field_d) {
              wf.field_i = 3;
              break L28;
            } else {
              break L28;
            }
          }
        }
        L31: {
          if ((wf.field_i ^ -1) != -4) {
            break L31;
          } else {
            if (!cl.a(ej.field_d, we.field_h, gk.field_a, (byte) 127)) {
              break L31;
            } else {
              if (oh.a(ej.field_d, -109)) {
                L32: {
                  L33: {
                    qa.b(0);
                    mg.e(0);
                    u.field_tb = false;
                    pb.field_j = qk.field_a;
                    fk.a(hl.field_F, we.field_h, (byte) 40, ej.field_d, gk.field_a);
                    if (ki.field_e) {
                      break L33;
                    } else {
                      if (null == sc.field_c) {
                        break L32;
                      } else {
                        break L33;
                      }
                    }
                  }
                  L34: {
                    stackOut_108_0 = sc.field_c;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_109_0 = stackOut_108_0;
                    if (ki.field_e) {
                      stackOut_110_0 = (String) ((Object) stackIn_110_0);
                      stackOut_110_1 = 0;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      break L34;
                    } else {
                      stackOut_109_0 = (String) ((Object) stackIn_109_0);
                      stackOut_109_1 = 1;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      break L34;
                    }
                  }
                  L35: {
                    stackOut_111_0 = (String) ((Object) stackIn_111_0);
                    stackOut_111_1 = stackIn_111_1;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    if (ki.field_e) {
                      stackOut_113_0 = (String) ((Object) stackIn_113_0);
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = 0;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      stackIn_114_2 = stackOut_113_2;
                      break L35;
                    } else {
                      stackOut_112_0 = (String) ((Object) stackIn_112_0);
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 1;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_114_2 = stackOut_112_2;
                      break L35;
                    }
                  }
                  rb.a(stackIn_114_0, stackIn_114_1 != 0, stackIn_114_2 != 0, param1 + 14636);
                  break L32;
                }
                L36: {
                  if (Lexicominos.field_M) {
                    ui.d(4);
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (null != de.field_b) {
                    break L37;
                  } else {
                    de.field_b = fb.b(12898);
                    jh.field_c = kf.g(0);
                    break L37;
                  }
                }
                vk.a(ej.field_d, param1 ^ 0, de.field_b, jh.field_c);
                gk.field_a = null;
                we.field_h = null;
                ej.field_d = null;
                mc.a(-116, (java.applet.Applet) (this));
                dl.b(5);
                wf.field_i = 10;
                break L31;
              } else {
                break L31;
              }
            }
          }
        }
        L38: {
          if (-11 == (wf.field_i ^ -1)) {
            L39: {
              if (ri.field_e == 0) {
                break L39;
              } else {
                eg.field_C = oj.a(false, ea.field_d);
                break L39;
              }
            }
            wf.field_i = 11;
            break L38;
          } else {
            break L38;
          }
        }
        L40: {
          if (11 == wf.field_i) {
            L41: {
              L42: {
                if (null == eg.field_C) {
                  break L42;
                } else {
                  if (!eg.field_C.c(param1 + -104)) {
                    break L41;
                  } else {
                    if (!eg.field_C.a((byte) 60)) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                }
              }
              wf.field_i = 12;
              ne.field_e = true;
              if (var5 == 0) {
                break L40;
              } else {
                break L41;
              }
            }
            al.a(16, ee.a((byte) 126, oh.field_a, we.field_c, eg.field_C), 0.0f);
            break L40;
          } else {
            break L40;
          }
        }
        L43: {
          if (wf.field_i == 12) {
            if (!ne.field_e) {
              wf.field_i = 13;
              break L43;
            } else {
              break L43;
            }
          } else {
            break L43;
          }
        }
        L44: {
          if (-14 == (wf.field_i ^ -1)) {
            L45: {
              var3 = 1;
              if (gd.field_i != null) {
                L46: {
                  if (!gd.field_i.a(-71)) {
                    stackOut_146_0 = 0;
                    stackIn_147_0 = stackOut_146_0;
                    break L46;
                  } else {
                    stackOut_145_0 = 1;
                    stackIn_147_0 = stackOut_145_0;
                    break L46;
                  }
                }
                var3 = stackIn_147_0;
                al.a(param1 + 17, gd.field_i.field_f, gd.field_i.field_c);
                break L45;
              } else {
                break L45;
              }
            }
            if (var3 != 0) {
              wf.field_i = 20;
              break L44;
            } else {
              break L44;
            }
          } else {
            break L44;
          }
        }
        L47: {
          if (param0) {
            break L47;
          } else {
            if (!rl.field_O) {
              break L47;
            } else {
              jd.a(ug.field_y, 160);
              this.f(param1 ^ -468);
              ha.a(ug.field_y, (byte) 105);
              break L47;
            }
          }
        }
        L48: {
          if (!ij.field_o[8]) {
            break L48;
          } else {
            uk.g(true);
            break L48;
          }
        }
    }

    final int n(int param0) {
        int var2 = 0;
        L0: {
          var2 = this.f((byte) -127);
          if (param0 == 6) {
            break L0;
          } else {
            this.e((byte) -85);
            break L0;
          }
        }
        L1: {
          L2: {
            if (var2 == 0) {
              break L2;
            } else {
              if ((var2 ^ -1) == -2) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (!ij.field_o[1]) {
              break L3;
            } else {
              bh.a((byte) 77, 2);
              break L3;
            }
          }
          L4: {
            if (!ij.field_o[2]) {
              break L4;
            } else {
              g.a(3, (byte) -39);
              break L4;
            }
          }
          L5: {
            if (!ij.field_o[3]) {
              break L5;
            } else {
              vh.a(false, 4);
              break L5;
            }
          }
          L6: {
            if (!ij.field_o[4]) {
              break L6;
            } else {
              hl.f(5, -2212);
              break L6;
            }
          }
          L7: {
            if (ij.field_o[5]) {
              bd.a(6, -4584);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (ij.field_o[6]) {
              n.b(7, param0 + -7);
              break L8;
            } else {
              break L8;
            }
          }
          if (ij.field_o[8]) {
            pg.a((byte) 92);
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
    }

    private final void a(String param0, int param1, int param2, byte param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (!this.c(-7257)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param3 == 62) {
                      break L2;
                    } else {
                      this.field_B = (String) null;
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      this.field_B = this.getCodeBase().getHost();
                      var6_ref2 = this.field_B.toLowerCase();
                      stackOut_5_0 = this;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L4;
                      } else {
                        stackOut_6_0 = this;
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_9_0 = this;
                          stackOut_9_1 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          break L3;
                        } else {
                          stackOut_7_0 = this;
                          stackIn_8_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L3;
                  }
                  L5: {
                    ((nk) (this)).field_y = stackIn_10_1 != 0;
                    this.field_D = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_q = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L5;
                    } else {
                      this.field_s = Integer.parseInt(var7);
                      break L5;
                    }
                  }
                  L6: {
                    this.field_r = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_v = Long.parseLong(this.getParameter("instanceid"));
                    this.field_x = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_u = Integer.parseInt(var8);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (-6 >= (this.field_u ^ -1)) {
                      this.field_u = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var9 = this.getParameter("affid");
                    if (var9 == null) {
                      break L8;
                    } else {
                      this.field_A = Integer.parseInt(var9);
                      break L8;
                    }
                  }
                  Lexicominos.field_M = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(this.field_r, param2, param4, param1, param3 ^ 92, 32, param0);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                uj.a((String) null, (Throwable) ((Object) var6), 1);
                this.a("crash", 92);
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var6_ref);
            stackOut_24_1 = new StringBuilder().append("nk.GA(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int f(byte param0) {
        int var2 = 0;
        if (this.field_g) {
          return -1;
        } else {
          if (d.a((byte) 83)) {
            if (!kj.field_o) {
              L0: {
                var2 = ve.a(el.b(1), (byte) -25, this.field_y, true, dg.a(false), this.field_A);
                if (param0 < -85) {
                  break L0;
                } else {
                  this.field_s = -83;
                  break L0;
                }
              }
              if ((var2 ^ -1) == 0) {
                return -1;
              } else {
                L1: {
                  if (-1 == (var2 ^ -1)) {
                    if (ta.field_g == 11) {
                      if (nc.field_r == 0) {
                        wb.b((byte) 50);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      if (ta.field_g == 11) {
                        if (nc.field_r == 0) {
                          wb.b((byte) 50);
                          break L1;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if (ta.field_g == 11) {
                      if (nc.field_r == 0) {
                        wb.b((byte) 50);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
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
        }
    }

    final void a(int param0, String param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(param1, 480, param0, (byte) 62, 640);
              if (param2 < -82) {
                break L1;
              } else {
                this.field_y = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("nk.FA(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        this.a(3, false);
        if (!(!param0)) {
            this.l(-74);
        }
        if (param2) {
            this.i(-1);
        }
        if (!(!param4)) {
            this.j(-67);
        }
        if (!(!param1)) {
            this.d((byte) -47);
        }
        int var6 = -104 % ((param3 - 77) / 34);
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            wf var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Lexicominos.field_L ? 1 : 0;
            var4 = qk.a(ri.field_e, param2, param1 + param1, gd.field_l);
            if ((var4 ^ -1) == -1) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (1 == var4) {
                  L1: {
                    var5_int = mg.a(0, fk.a(85), qd.a(false));
                    if (var5_int != -1) {
                      mb.a(105, var5_int, wj.field_p, fc.field_S);
                      wj.field_p = null;
                      fc.field_S = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = al.e((byte) -117);
                  if (var11 != null) {
                    mc.a(var11.booleanValue(), 0);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  var5_int = il.a(this.field_A, dg.a(false), el.b(param1 ^ 1), ve.b(25594), tf.a((byte) -101), 103, a.c(true));
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    nl.a(var5_int, -6258, wj.field_p, fc.field_S);
                    fc.field_S = null;
                    wj.field_p = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (-4 == (var4 ^ -1)) {
                  L4: {
                    if (0 == (nc.field_r ^ -1)) {
                      break L4;
                    } else {
                      if (0 != nc.field_r) {
                        nc.field_r = -1;
                        si.e((byte) 86);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (!param0) {
                      break L5;
                    } else {
                      kj.field_o = false;
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var5_int = ve.a(el.b(1), (byte) -25, this.field_y, false, dg.a(false), this.field_A);
                  if (var5_int == -1) {
                    break L3;
                  } else {
                    L6: {
                      if ((var5_int ^ -1) != -1) {
                        break L6;
                      } else {
                        d.field_a = rc.field_f;
                        wb.b((byte) 50);
                        ta.field_g = 10;
                        qg.field_d = false;
                        if (var8 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    sc.a(var5_int, (byte) 58, wj.field_p);
                    wj.field_p = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L7: {
                if (4 != var4) {
                  break L7;
                } else {
                  L8: {
                    if (hl.field_F) {
                      break L8;
                    } else {
                      ta.field_g = 10;
                      qg.field_d = true;
                      if (var8 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  lj.a(kk.c(-14047), (byte) 125);
                  break L7;
                }
              }
              L9: {
                if ((var4 ^ -1) == -6) {
                  ge.a(0, kk.c(param1 ^ -14047));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if ((var4 ^ -1) == -7) {
                  if (u.field_tb) {
                    ta.field_g = 10;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if (7 == var4) {
                  sk.a(kk.c(-14047), 12);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if ((var4 ^ -1) == -9) {
                  lj.a(kk.c(-14047), (byte) 123);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (-10 == (var4 ^ -1)) {
                  la.a(kk.c(-14047), true);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var4 != 10) {
                  break L14;
                } else {
                  ed.field_q.h(17, 0);
                  break L14;
                }
              }
              L15: {
                if ((var4 ^ -1) != -12) {
                  break L15;
                } else {
                  rf.a(20104, kk.c(-14047));
                  break L15;
                }
              }
              L16: {
                if (12 == var4) {
                  pd.a(cf.c(32), -120, kk.c(param1 + -14047));
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if (13 != var4) {
                  break L17;
                } else {
                  try {
                    L18: {
                      L19: {
                        if (g.field_m != null) {
                          break L19;
                        } else {
                          g.field_m = new wg(jh.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L19;
                        }
                      }
                      L20: {
                        if (g.field_m.a(74)) {
                          L21: {
                            L22: {
                              var12 = g.field_m.a((byte) -65);
                              if (var12 != null) {
                                break L22;
                              } else {
                                var9 = (String) null;
                                hf.a((String) null, (byte) 122);
                                if (var8 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var7 = dc.a(var12.field_h, var12.field_j, (byte) 16, 0);
                            hf.a(var7, (byte) 110);
                            break L21;
                          }
                          g.field_m = null;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      break L18;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L23: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      uj.a("S1", (Throwable) ((Object) var5), 1);
                      var10 = (String) null;
                      hf.a((String) null, (byte) 118);
                      g.field_m = null;
                      break L23;
                    }
                  }
                  break L17;
                }
              }
              L24: {
                if (15 != var4) {
                  break L24;
                } else {
                  ta.field_g = 10;
                  break L24;
                }
              }
              if (-17 == (var4 ^ -1)) {
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

    private final void l(int param0) {
        ij.field_o[1] = true;
        int var2 = 65 % ((62 - param0) / 33);
    }

    protected nk() {
    }

    final void m(int param0) {
        int var2 = 0;
        df var3 = null;
        int var4 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 == -6721) {
          L0: {
            var2 = pg.field_d;
            if (var2 >= 64) {
              break L0;
            } else {
              if (!ij.field_o[var2]) {
                break L0;
              } else {
                if (var2 != 0) {
                  L1: {
                    if (-2 == (var2 ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (2 == var2) {
                          break L2;
                        } else {
                          L3: {
                            if ((var2 ^ -1) == -4) {
                              break L3;
                            } else {
                              L4: {
                                if (-5 != (var2 ^ -1)) {
                                  break L4;
                                } else {
                                  u.l((byte) -124);
                                  if (var4 != 0) {
                                    break L4;
                                  } else {
                                    return;
                                  }
                                }
                              }
                              L5: {
                                if (-6 == (var2 ^ -1)) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (var2 == 6) {
                                      break L6;
                                    } else {
                                      L7: {
                                        if ((var2 ^ -1) != -8) {
                                          break L7;
                                        } else {
                                          this.h(16);
                                          if (var4 != 0) {
                                            break L7;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                      L8: {
                                        if (8 != var2) {
                                          break L8;
                                        } else {
                                          ge.a((byte) -127, a.field_c, ig.field_a, jh.field_a);
                                          if (var4 != 0) {
                                            break L8;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                      L9: {
                                        if (-17 == (var2 ^ -1)) {
                                          break L9;
                                        } else {
                                          L10: {
                                            if (var2 == 11) {
                                              break L10;
                                            } else {
                                              if (-13 == (var2 ^ -1)) {
                                                break L10;
                                              } else {
                                                L11: {
                                                  if (13 != var2) {
                                                    break L11;
                                                  } else {
                                                    pa.a(15);
                                                    if (var4 != 0) {
                                                      break L11;
                                                    } else {
                                                      return;
                                                    }
                                                  }
                                                }
                                                L12: {
                                                  if (var2 == 17) {
                                                    break L12;
                                                  } else {
                                                    L13: {
                                                      if (-19 != (var2 ^ -1)) {
                                                        break L13;
                                                      } else {
                                                        vk.a((byte) -117);
                                                        if (var4 != 0) {
                                                          break L13;
                                                        } else {
                                                          return;
                                                        }
                                                      }
                                                    }
                                                    uj.a("MGS1: " + qj.h(param0 ^ 6689), (Throwable) null, 1);
                                                    ck.b((byte) -118);
                                                    if (var4 != 0) {
                                                      break L12;
                                                    } else {
                                                      return;
                                                    }
                                                  }
                                                }
                                                this.k(126);
                                                if (var4 != 0) {
                                                  break L10;
                                                } else {
                                                  return;
                                                }
                                              }
                                            }
                                          }
                                          L14: {
                                            stackOut_43_0 = 0;
                                            stackIn_45_0 = stackOut_43_0;
                                            stackIn_44_0 = stackOut_43_0;
                                            if (var2 != 12) {
                                              stackOut_45_0 = stackIn_45_0;
                                              stackOut_45_1 = 0;
                                              stackIn_46_0 = stackOut_45_0;
                                              stackIn_46_1 = stackOut_45_1;
                                              break L14;
                                            } else {
                                              stackOut_44_0 = stackIn_44_0;
                                              stackOut_44_1 = 1;
                                              stackIn_46_0 = stackOut_44_0;
                                              stackIn_46_1 = stackOut_44_1;
                                              break L14;
                                            }
                                          }
                                          var3 = qd.a(stackIn_46_0, stackIn_46_1 != 0);
                                          ij.a(var3, param0 + 6833);
                                          if (var4 != 0) {
                                            break L9;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                      kf.h(-1);
                                      if (var4 != 0) {
                                        break L6;
                                      } else {
                                        return;
                                      }
                                    }
                                  }
                                  ge.c(param0 ^ -6708);
                                  if (var4 != 0) {
                                    break L5;
                                  } else {
                                    return;
                                  }
                                }
                              }
                              pg.a(1);
                              if (var4 != 0) {
                                break L3;
                              } else {
                                return;
                              }
                            }
                          }
                          me.e(false);
                          if (var4 != 0) {
                            break L2;
                          } else {
                            return;
                          }
                        }
                      }
                      hl.d(0);
                      if (var4 != 0) {
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                  rb.a(false);
                  if (var4 == 0) {
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          uj.a("MGS2: " + qj.h(param0 + 6632), (Throwable) null, param0 + 6722);
          ck.b((byte) -79);
          return;
        } else {
          return;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = ig.field_a.d(true);
          if (0 == (var2 & 1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 <= 125) {
          return;
        } else {
          var4 = -1 + a.field_c;
          var5 = new byte[var4];
          ig.field_a.b(var4, 0, 55, var5);
          m.a(var3 != 0, true, ni.a((byte) -55, var5), kk.c(-14047));
          return;
        }
    }

    private final void d(byte param0) {
        if (param0 != -47) {
            return;
        }
        ij.field_o[5] = true;
    }

    static {
        field_z = 0;
        field_C = "Player names can be up to 12 letters, numbers and underscores";
        field_t = "Connection timed out. Please try using a different server.";
    }
}
