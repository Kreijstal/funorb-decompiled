/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class tg extends hk {
    private int field_k;
    private int field_r;
    private boolean field_o;
    private boolean field_n;
    private long field_s;
    private int field_q;
    private int field_p;
    private int field_l;
    String field_i;
    private int field_m;
    private boolean field_j;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var9 = new java.awt.Frame("Jagex");
        if (param3 >= -24) {
            return;
        }
        try {
            var9.pack();
            var9.dispose();
            ((tg) this).setBackground(java.awt.Color.black);
            sn.field_i = ((tg) this).field_k;
            il.a((byte) 52, sn.field_i);
            in.a(((tg) this).field_l, ((tg) this).field_o, ((tg) this).field_i, param0, sn.field_i, 5000, ((tg) this).field_r, nk.field_u, param2, ((tg) this).field_p, 0, ((tg) this).field_s, 5000, ((tg) this).field_m);
            mg.a(-1, sn.field_i, ((tg) this).field_r, ((tg) this).field_m, nk.field_u, ((tg) this).field_l, ((tg) this).field_i, ((tg) this).field_p, param0);
            qg.d(-125);
            wb.field_u = la.b(26);
            j.a(k.field_d, (byte) -125);
            b.field_w = param6;
            uf.field_p = param1;
            gf.field_k = param5;
            ug.field_b = param4;
            tp.field_g = param7;
            this.h(11);
            rn.a(-117);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "tg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final static void m(int param0) {
        RuntimeException runtimeException = null;
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        var4 = Torquing.field_u;
        try {
          L0: {
            var1 = (Object) (Object) ha.field_b;
            synchronized (var1) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      q.field_g = mj.field_d;
                      po.field_w = po.field_w + 1;
                      if (0 <= hb.field_y) {
                        break L4;
                      } else {
                        var2 = 0;
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (var2 >= 112) {
                                break L7;
                              } else {
                                i.field_P[var2] = false;
                                var2++;
                                if (var4 != 0) {
                                  break L6;
                                } else {
                                  if (var4 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            hb.field_y = n.field_w;
                            break L6;
                          }
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    L8: while (true) {
                      if (n.field_w == hb.field_y) {
                        break L3;
                      } else {
                        var2 = no.field_i[n.field_w];
                        n.field_w = 127 & n.field_w - -1;
                        stackOut_14_0 = -1;
                        stackOut_14_1 = ~var2;
                        stackIn_29_0 = stackOut_14_0;
                        stackIn_29_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (var4 != 0) {
                          break L2;
                        } else {
                          L9: {
                            L10: {
                              if (stackIn_15_0 >= stackIn_15_1) {
                                break L10;
                              } else {
                                i.field_P[~var2] = false;
                                if (var4 == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            i.field_P[var2] = true;
                            break L9;
                          }
                          if (var4 == 0) {
                            continue L8;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  mj.field_d = gn.field_d;
                  stackOut_28_0 = param0;
                  stackOut_28_1 = -26;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L2;
                }
                break L1;
              }
            }
            L11: {
              if (stackIn_29_0 <= stackIn_29_1) {
                break L11;
              } else {
                tg.m(67);
                break L11;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "tg.R(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        java.awt.Container var3_ref = null;
        int var3_int = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        int stackIn_38_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_200_0 = 0;
        String stackIn_200_1 = null;
        int stackIn_202_0 = 0;
        String stackIn_202_1 = null;
        int stackIn_203_0 = 0;
        String stackIn_203_1 = null;
        int stackIn_203_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_199_0 = 0;
        String stackOut_199_1 = null;
        int stackOut_202_0 = 0;
        String stackOut_202_1 = null;
        int stackOut_202_2 = 0;
        int stackOut_200_0 = 0;
        String stackOut_200_1 = null;
        int stackOut_200_2 = 0;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (ki.field_D == null) {
                break L1;
              } else {
                L2: {
                  if (dg.field_i == null) {
                    var3_ref = lp.b(20);
                    var4 = var3_ref.getSize();
                    ki.field_D.a(var4.width, false, var4.height);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ki.field_D.a((byte) -110);
                break L1;
              }
            }
            L3: {
              tg.m(param0 ^ -104);
              gj.c(24417);
              if (sf.a(param0 ^ -24)) {
                break L3;
              } else {
                if (11 == op.field_i) {
                  break L3;
                } else {
                  ra.a((byte) 75);
                  break L3;
                }
              }
            }
            L4: {
              if (wb.field_u == null) {
                break L4;
              } else {
                da.field_g = wb.field_u.b(0);
                break L4;
              }
            }
            L5: {
              if (!oo.a(16158)) {
                break L5;
              } else {
                L6: {
                  var3_int = n.c((byte) 57) * 1200;
                  if (((tg) this).field_n) {
                    break L6;
                  } else {
                    if (~var3_int <= ~k.b(124)) {
                      break L5;
                    } else {
                      if (var3_int >= ac.d((byte) -97)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                ((tg) this).field_n = false;
                ih.b(true);
                lg.h(-101);
                dc.a(2, gh.field_b, 2);
                pp.a(false);
                gk.field_a = true;
                ta.field_k = km.b(-1) - -15000L;
                break L5;
              }
            }
            L7: {
              L8: {
                if (aj.field_J == -1) {
                  break L8;
                } else {
                  if (aj.field_J == 0) {
                    break L8;
                  } else {
                    break L7;
                  }
                }
              }
              L9: {
                if (aj.field_J != -1) {
                  stackOut_37_0 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  break L9;
                } else {
                  stackOut_35_0 = 1;
                  stackIn_38_0 = stackOut_35_0;
                  break L9;
                }
              }
              L10: {
                var3_int = stackIn_38_0;
                aj.field_J = un.a(0);
                if (var3_int == 0) {
                  break L10;
                } else {
                  if (0 == aj.field_J) {
                    if (op.field_i != 11) {
                      break L10;
                    } else {
                      if (mk.a((byte) 38)) {
                        break L10;
                      } else {
                        qa.a((byte) -72);
                        break L10;
                      }
                    }
                  } else {
                    break L10;
                  }
                }
              }
              if (aj.field_J == -1) {
                break L7;
              } else {
                if (aj.field_J == 0) {
                  break L7;
                } else {
                  ta.field_k = km.b(-1) - -15000L;
                  break L7;
                }
              }
            }
            L11: {
              if (aj.field_J == -1) {
                break L11;
              } else {
                if (0 == aj.field_J) {
                  break L11;
                } else {
                  L12: {
                    if (b.field_x < 10) {
                      break L12;
                    } else {
                      if (op.field_i >= 10) {
                        L13: {
                          L14: {
                            lg.h(param0 ^ -107);
                            if (aj.field_J != 3) {
                              break L14;
                            } else {
                              dc.a(256, bm.field_r, param0 ^ 21);
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (aj.field_J == 4) {
                              break L15;
                            } else {
                              L16: {
                                if (aj.field_J == 2) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (aj.field_J != 5) {
                                      break L17;
                                    } else {
                                      dc.a(5, e.field_d, 2);
                                      if (var5 == 0) {
                                        break L13;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  dc.a(256, jk.field_b, 2);
                                  if (var5 == 0) {
                                    break L13;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              dc.a(256, ra.field_b, param0 + -21);
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                          dc.a(256, ib.field_a, 2);
                          break L13;
                        }
                        gk.field_a = true;
                        if (var5 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      } else {
                        break L11;
                      }
                    }
                  }
                  L18: {
                    if (aj.field_J == 3) {
                      break L18;
                    } else {
                      L19: {
                        if (aj.field_J == 4) {
                          break L19;
                        } else {
                          L20: {
                            if (2 != aj.field_J) {
                              break L20;
                            } else {
                              ((tg) this).a(10, "js5connect_full");
                              if (var5 == 0) {
                                break L11;
                              } else {
                                break L20;
                              }
                            }
                          }
                          L21: {
                            if (aj.field_J != 5) {
                              break L21;
                            } else {
                              ((tg) this).a(10, "outofdate");
                              if (var5 == 0) {
                                break L11;
                              } else {
                                break L21;
                              }
                            }
                          }
                          ((tg) this).a(10, "js5connect");
                          if (var5 == 0) {
                            break L11;
                          } else {
                            break L19;
                          }
                        }
                      }
                      ((tg) this).a(param0 + -13, "js5io");
                      if (var5 == 0) {
                        break L11;
                      } else {
                        break L18;
                      }
                    }
                  }
                  ((tg) this).a(10, "js5crc");
                  break L11;
                }
              }
            }
            L22: {
              L23: {
                L24: {
                  if (-1 == aj.field_J) {
                    break L24;
                  } else {
                    if (aj.field_J != 0) {
                      break L23;
                    } else {
                      break L24;
                    }
                  }
                }
                if (!mk.a((byte) 38)) {
                  break L22;
                } else {
                  break L23;
                }
              }
              if (~ta.field_k < ~km.b(-1)) {
                break L22;
              } else {
                gk.field_a = false;
                if (aj.field_J == -1) {
                  break L22;
                } else {
                  if (aj.field_J != 0) {
                    aj.field_J = -1;
                    jl.b((byte) 106);
                    break L22;
                  } else {
                    break L22;
                  }
                }
              }
            }
            L25: {
              if (aj.field_J != 0) {
                break L25;
              } else {
                if (!mk.a((byte) 38)) {
                  mh.field_g = false;
                  break L25;
                } else {
                  break L25;
                }
              }
            }
            L26: {
              if (b.field_x != 0) {
                break L26;
              } else {
                if (!sb.b(-80)) {
                  break L26;
                } else {
                  b.field_x = 1;
                  break L26;
                }
              }
            }
            L27: {
              if (1 == b.field_x) {
                L28: {
                  if (sn.field_i != 0) {
                    je.field_f = vg.a(-27646, b.field_w);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                lp.field_a = sd.a(true, 1, (byte) -125, tp.field_g, false);
                eg.field_v = sd.a(true, 1, (byte) -84, ug.field_b, false);
                kb.field_a = sd.a(true, 1, (byte) -65, gf.field_k, false);
                e.field_b = eg.field_v;
                rp.field_d = lp.field_a;
                b.field_x = 2;
                break L27;
              } else {
                break L27;
              }
            }
            L29: {
              if (b.field_x != 2) {
                break L29;
              } else {
                L30: {
                  if (null != je.field_f) {
                    if (je.field_f.a(-12749)) {
                      L31: {
                        if (!je.field_f.b((byte) -58, "")) {
                          break L31;
                        } else {
                          if (je.field_f.a(true, "")) {
                            fh.a(7, je.field_f);
                            je.field_f = null;
                            cf.a(param0 ^ 6648);
                            if (var5 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          } else {
                            break L30;
                          }
                        }
                      }
                      je.field_f = null;
                      break L30;
                    } else {
                      break L30;
                    }
                  } else {
                    break L30;
                  }
                }
                if (null != je.field_f) {
                  break L29;
                } else {
                  b.field_x = 3;
                  break L29;
                }
              }
            }
            L32: {
              if (b.field_x == 3) {
                if (!ro.a((byte) 54, lp.field_a, kb.field_a, eg.field_v)) {
                  break L32;
                } else {
                  if (!pg.a(true, kb.field_a)) {
                    break L32;
                  } else {
                    L33: {
                      L34: {
                        od.c(-8431868);
                        mk.a(true);
                        ob.field_b = vo.field_e;
                        r.field_c = false;
                        fd.a(ao.field_b, lp.field_a, 0, kb.field_a, eg.field_v);
                        if (ra.field_a) {
                          break L34;
                        } else {
                          if (null == vo.field_c) {
                            break L33;
                          } else {
                            break L34;
                          }
                        }
                      }
                      L35: {
                        if (ra.field_a) {
                          stackOut_198_0 = 0;
                          stackIn_199_0 = stackOut_198_0;
                          break L35;
                        } else {
                          stackOut_196_0 = 1;
                          stackIn_199_0 = stackOut_196_0;
                          break L35;
                        }
                      }
                      L36: {
                        stackOut_199_0 = stackIn_199_0;
                        stackOut_199_1 = vo.field_c;
                        stackIn_202_0 = stackOut_199_0;
                        stackIn_202_1 = stackOut_199_1;
                        stackIn_200_0 = stackOut_199_0;
                        stackIn_200_1 = stackOut_199_1;
                        if (ra.field_a) {
                          stackOut_202_0 = stackIn_202_0;
                          stackOut_202_1 = (String) (Object) stackIn_202_1;
                          stackOut_202_2 = 0;
                          stackIn_203_0 = stackOut_202_0;
                          stackIn_203_1 = stackOut_202_1;
                          stackIn_203_2 = stackOut_202_2;
                          break L36;
                        } else {
                          stackOut_200_0 = stackIn_200_0;
                          stackOut_200_1 = (String) (Object) stackIn_200_1;
                          stackOut_200_2 = 1;
                          stackIn_203_0 = stackOut_200_0;
                          stackIn_203_1 = stackOut_200_1;
                          stackIn_203_2 = stackOut_200_2;
                          break L36;
                        }
                      }
                      vb.a(stackIn_203_0 != 0, stackIn_203_1, stackIn_203_2 != 0, param0 ^ 4818);
                      break L33;
                    }
                    L37: {
                      if (ii.field_n) {
                        eh.c((byte) 90);
                        break L37;
                      } else {
                        break L37;
                      }
                    }
                    L38: {
                      if (kb.field_d != null) {
                        break L38;
                      } else {
                        kb.field_d = rg.a(true);
                        qc.field_Z = c.a(24852);
                        break L38;
                      }
                    }
                    cl.a(qc.field_Z, false, kb.field_d, kb.field_a);
                    eg.field_v = null;
                    kb.field_a = null;
                    lp.field_a = null;
                    ne.a((java.applet.Applet) this, 0);
                    cf.a(6639);
                    b.field_x = 10;
                    break L32;
                  }
                }
              } else {
                break L32;
              }
            }
            L39: {
              if (b.field_x != 10) {
                break L39;
              } else {
                L40: {
                  if (0 != sn.field_i) {
                    rd.field_z = vg.a(-27646, uf.field_p);
                    break L40;
                  } else {
                    break L40;
                  }
                }
                b.field_x = 11;
                break L39;
              }
            }
            L41: {
              if (b.field_x != 11) {
                break L41;
              } else {
                L42: {
                  L43: {
                    if (null == rd.field_z) {
                      break L43;
                    } else {
                      if (!rd.field_z.a(-12749)) {
                        break L42;
                      } else {
                        if (!rd.field_z.c(-19375)) {
                          break L42;
                        } else {
                          break L43;
                        }
                      }
                    }
                  }
                  b.field_x = 12;
                  w.field_F = true;
                  if (var5 == 0) {
                    break L41;
                  } else {
                    break L42;
                  }
                }
                df.a(0.0f, -84, il.a(Torquing.field_w, rd.field_z, md.field_b, (byte) 78));
                break L41;
              }
            }
            L44: {
              if (b.field_x != 12) {
                break L44;
              } else {
                if (!w.field_F) {
                  b.field_x = 13;
                  break L44;
                } else {
                  break L44;
                }
              }
            }
            L45: {
              if (b.field_x == 13) {
                L46: {
                  var3_int = 1;
                  if (null != a.field_c) {
                    var3_int = a.field_c.b(param0 ^ 23) ? 1 : 0;
                    df.a(a.field_c.field_l, 75, a.field_c.field_h);
                    break L46;
                  } else {
                    break L46;
                  }
                }
                if (var3_int != 0) {
                  b.field_x = 20;
                  break L45;
                } else {
                  break L45;
                }
              } else {
                break L45;
              }
            }
            L47: {
              if (param1) {
                break L47;
              } else {
                if (b.field_v) {
                  tf.a(-101, k.field_d);
                  ((tg) this).a(false);
                  j.a(k.field_d, (byte) -118);
                  break L47;
                } else {
                  break L47;
                }
              }
            }
            L48: {
              if (hh.field_d[8]) {
                kj.a(8);
                break L48;
              } else {
                break L48;
              }
            }
            L49: {
              if (param0 == 23) {
                break L49;
              } else {
                ((tg) this).field_k = 113;
                break L49;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var3, "tg.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void h(int param0) {
        try {
            nk.field_s[6] = -2;
            nk.field_s[7] = -1;
            nk.field_s[17] = -1;
            nk.field_s[4] = -1;
            nk.field_s[16] = -1;
            nk.field_s[2] = -2;
            nk.field_s[8] = -2;
            nk.field_s[13] = -1;
            nk.field_s[1] = 16;
            nk.field_s[3] = -1;
            nk.field_s[10] = -1;
            nk.field_s[param0] = -1;
            nk.field_s[5] = -1;
            nk.field_s[12] = -1;
            nk.field_s[9] = -1;
            nk.field_s[18] = 1;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "tg.L(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        String var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = ol.a(124);
              ol.a(var2, true, ip.a(param0 + -81));
              if (param0 == 90) {
                break L1;
              } else {
                this.k(30);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "tg.T(" + param0 + ')');
        }
    }

    private final void l(int param0) {
        try {
            hh.field_d[1] = true;
            if (param0 != 0) {
                ((tg) this).a(43, (String) null, -13);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "tg.F(" + param0 + ')');
        }
    }

    final void e(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        hi var4 = null;
        int var5 = 0;
        int stackIn_75_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_80_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_74_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_79_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_77_1 = 0;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var2_int = fa.field_e;
              var3 = -51 / ((param0 - 4) / 53);
              if (64 <= var2_int) {
                break L1;
              } else {
                if (hh.field_d[var2_int]) {
                  L2: {
                    if (var2_int == 0) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          if (1 != var2_int) {
                            break L4;
                          } else {
                            uf.b(-109);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (2 == var2_int) {
                            break L5;
                          } else {
                            L6: {
                              if (3 == var2_int) {
                                break L6;
                              } else {
                                L7: {
                                  if (var2_int == 4) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (var2_int != 5) {
                                        break L8;
                                      } else {
                                        ij.e(10078);
                                        if (var5 == 0) {
                                          break L3;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    L9: {
                                      if (6 != var2_int) {
                                        break L9;
                                      } else {
                                        en.e((byte) 50);
                                        if (var5 == 0) {
                                          break L3;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (var2_int != 7) {
                                        break L10;
                                      } else {
                                        this.c((byte) 90);
                                        if (var5 == 0) {
                                          break L3;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (var2_int == 8) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (var2_int == 16) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (11 == var2_int) {
                                                break L13;
                                              } else {
                                                if (var2_int == 12) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    if (var2_int != 13) {
                                                      break L14;
                                                    } else {
                                                      ld.a((byte) 123);
                                                      if (var5 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L14;
                                                      }
                                                    }
                                                  }
                                                  L15: {
                                                    if (var2_int != 17) {
                                                      break L15;
                                                    } else {
                                                      this.k(1);
                                                      if (var5 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L15;
                                                      }
                                                    }
                                                  }
                                                  L16: {
                                                    if (18 != var2_int) {
                                                      break L16;
                                                    } else {
                                                      mm.a((byte) 60);
                                                      if (var5 == 0) {
                                                        break L3;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                  nn.a("MGS1: " + me.a(-1), (Throwable) null, -9958);
                                                  ih.b(true);
                                                  if (var5 == 0) {
                                                    break L3;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                            }
                                            L17: {
                                              stackOut_74_0 = -11936;
                                              stackIn_79_0 = stackOut_74_0;
                                              stackIn_75_0 = stackOut_74_0;
                                              if (var2_int != 12) {
                                                stackOut_79_0 = stackIn_79_0;
                                                stackOut_79_1 = 0;
                                                stackIn_80_0 = stackOut_79_0;
                                                stackIn_80_1 = stackOut_79_1;
                                                break L17;
                                              } else {
                                                stackOut_75_0 = stackIn_75_0;
                                                stackIn_77_0 = stackOut_75_0;
                                                stackOut_77_0 = stackIn_77_0;
                                                stackOut_77_1 = 1;
                                                stackIn_80_0 = stackOut_77_0;
                                                stackIn_80_1 = stackOut_77_1;
                                                break L17;
                                              }
                                            }
                                            var4 = pa.a(stackIn_80_0, stackIn_80_1 != 0);
                                            ga.a(false, var4);
                                            if (var5 == 0) {
                                              break L3;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        ti.b(1);
                                        if (var5 == 0) {
                                          break L3;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    nh.a(nk.field_u, oo.field_a, (fj) (Object) kj.field_d, (byte) -126);
                                    if (var5 == 0) {
                                      break L3;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                                wh.b(99);
                                if (var5 == 0) {
                                  break L3;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            vd.a(27912);
                            if (var5 == 0) {
                              break L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                        il.f(-30593);
                        if (var5 == 0) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            nn.a("MGS2: " + me.a(-1), (Throwable) null, -9958);
            ih.b(true);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "tg.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void i(int param0) {
        try {
            hh.field_d[2] = true;
            if (param0 != 24500) {
                int discarded$0 = ((tg) this).b(false, 7);
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "tg.Q(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        hh.field_d[7] = true;
        hh.field_d[16] = true;
        if (param1 > -90) {
            return;
        }
        try {
            hh.field_d[8] = param0;
            hh.field_d[17] = true;
            hh.field_d[0] = true;
            hh.field_d[18] = true;
            hh.field_d[3] = true;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "tg.M(" + param0 + ',' + param1 + ')');
        }
    }

    final int g(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = -125 / ((param0 - 70) / 47);
                var3 = this.j(-93);
                if (0 == var3) {
                  break L2;
                } else {
                  if (1 == var3) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (!hh.field_d[1]) {
                  break L3;
                } else {
                  kf.b(2, -8190);
                  break L3;
                }
              }
              L4: {
                if (!hh.field_d[2]) {
                  break L4;
                } else {
                  ag.a((byte) -45, 3);
                  break L4;
                }
              }
              L5: {
                if (!hh.field_d[3]) {
                  break L5;
                } else {
                  jm.a(4, 0);
                  break L5;
                }
              }
              L6: {
                if (!hh.field_d[4]) {
                  break L6;
                } else {
                  km.a((byte) -128, 5);
                  break L6;
                }
              }
              L7: {
                if (!hh.field_d[5]) {
                  break L7;
                } else {
                  jd.a(true, 6);
                  break L7;
                }
              }
              L8: {
                if (!hh.field_d[6]) {
                  break L8;
                } else {
                  fa.a(7, -21386);
                  break L8;
                }
              }
              if (hh.field_d[8]) {
                kg.a(112);
                break L1;
              } else {
                break L1;
              }
            }
            stackOut_28_0 = var3;
            stackIn_29_0 = stackOut_28_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "tg.J(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    private final void k(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = kj.field_d.i((byte) -101);
              if ((param0 & var2_int) == 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var3 = stackIn_4_0;
            var4 = -1 + oo.field_a;
            var5 = new byte[var4];
            kj.field_d.b(0, param0 + 7, var5, var4);
            a.a(var3 != 0, lj.a(var5, false), ip.a(9), 3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw rb.a((Throwable) (Object) runtimeException, "tg.O(" + param0 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 84) {
                break L1;
              } else {
                ((tg) this).field_l = -57;
                break L1;
              }
            }
            hh.field_d[5] = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "tg.B(" + param0 + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            this.a((byte) 88, param0, 480, 640, param1);
            var4_int = 56 % ((28 - param2) / 53);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("tg.K(").append(param0).append(',');
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1 <= -85) {
                break L1;
              } else {
                this.f(93);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param0, true, true);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var3, "tg.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    private final int j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (!((tg) this).field_e) {
              if (!mk.a((byte) 38)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (param0 <= -68) {
                  if (gk.field_a) {
                    stackOut_14_0 = -1;
                    stackIn_15_0 = stackOut_14_0;
                    return stackIn_15_0;
                  } else {
                    var2_int = vb.a(fo.i(17543), ki.i(20), (byte) 27, true, ((tg) this).field_j, ((tg) this).field_q);
                    if (var2_int != -1) {
                      L1: {
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          if (var2_int != 1) {
                            L2: {
                              if (hg.field_c) {
                                break L2;
                              } else {
                                ((tg) this).a(10, "reconnect");
                                break L2;
                              }
                            }
                            lg.h(-128);
                            dc.a(var2_int, pl.field_u, 2);
                            gk.field_a = true;
                            ta.field_k = 15000L + km.b(-1);
                            stackOut_37_0 = var2_int;
                            stackIn_38_0 = stackOut_37_0;
                            break L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                      L3: {
                        if (op.field_i != 11) {
                          break L3;
                        } else {
                          if (aj.field_J == 0) {
                            qa.a((byte) -95);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_32_0 = var2_int;
                      stackIn_33_0 = stackOut_32_0;
                      return stackIn_33_0;
                    } else {
                      stackOut_17_0 = -1;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0;
                    }
                  }
                } else {
                  stackOut_9_0 = 107;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "tg.D(" + param0 + ')');
        }
        return stackIn_38_0;
    }

    private final void f(int param0) {
        try {
            hh.field_d[param0] = true;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "tg.C(" + param0 + ')');
        }
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_20_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        var3 = Torquing.field_u;
        try {
          L0: {
            L1: {
              L2: {
                if (la.a(true)) {
                  break L2;
                } else {
                  if (b.field_x >= 10) {
                    L3: {
                      if (pl.b(-115)) {
                        break L3;
                      } else {
                        pg.a((byte) -3);
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (op.field_i != 0) {
                        break L4;
                      } else {
                        int discarded$2 = this.a(false, false, true);
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    ue.a(-16513, da.field_g);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              L5: {
                stackOut_20_0 = this;
                stackIn_25_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (dg.field_i == null) {
                  stackOut_25_0 = this;
                  stackOut_25_1 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L5;
                } else {
                  stackOut_21_0 = this;
                  stackIn_23_0 = stackOut_21_0;
                  stackOut_23_0 = this;
                  stackOut_23_1 = 1;
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  break L5;
                }
              }
              int discarded$3 = this.a(stackIn_26_1 != 0, false, true);
              break L1;
            }
            L6: {
              if (param0 >= 0) {
                break L6;
              } else {
                ((tg) this).field_j = false;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var2, "tg.N(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.a(param4, (byte) -116);
              if (!param3) {
                break L1;
              } else {
                this.l(0);
                break L1;
              }
            }
            L2: {
              if (param2) {
                this.i(24500);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!param0) {
                break L3;
              } else {
                this.f(4);
                break L3;
              }
            }
            L4: {
              if (param1) {
                this.d((byte) 84);
                break L4;
              } else {
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var6, "tg.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 80) {
                break L1;
              } else {
                ((tg) this).field_q = -47;
                break L1;
              }
            }
            try {
              L2: {
                if (((tg) this).b(false)) {
                  L3: {
                    L4: {
                      ((tg) this).field_i = ((tg) this).getCodeBase().getHost();
                      var6_ref2 = ((tg) this).field_i.toLowerCase();
                      stackOut_5_0 = this;
                      stackIn_9_0 = stackOut_5_0;
                      stackIn_6_0 = stackOut_5_0;
                      if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                        break L4;
                      } else {
                        stackOut_6_0 = this;
                        stackIn_11_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_11_0 = this;
                          stackOut_11_1 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          stackIn_12_1 = stackOut_11_1;
                          break L3;
                        } else {
                          stackOut_7_0 = this;
                          stackIn_9_0 = stackOut_7_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_9_0 = this;
                    stackOut_9_1 = 1;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_12_1 = stackOut_9_1;
                    break L3;
                  }
                  L5: {
                    ((tg) this).field_j = stackIn_12_1 != 0;
                    ((tg) this).field_p = Integer.parseInt(((tg) this).getParameter("gameport1"));
                    ((tg) this).field_m = Integer.parseInt(((tg) this).getParameter("gameport2"));
                    var7 = ((tg) this).getParameter("servernum");
                    if (var7 == null) {
                      break L5;
                    } else {
                      ((tg) this).field_l = Integer.parseInt(var7);
                      break L5;
                    }
                  }
                  L6: {
                    ((tg) this).field_r = Integer.parseInt(((tg) this).getParameter("gamecrc"));
                    ((tg) this).field_s = Long.parseLong(((tg) this).getParameter("instanceid"));
                    ((tg) this).field_o = ((tg) this).getParameter("member").equals((Object) (Object) "yes");
                    var8 = ((tg) this).getParameter("lang");
                    if (var8 == null) {
                      break L6;
                    } else {
                      ((tg) this).field_k = Integer.parseInt(var8);
                      break L6;
                    }
                  }
                  L7: {
                    if (((tg) this).field_k >= 5) {
                      ((tg) this).field_k = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var9 = ((tg) this).getParameter("affid");
                    if (null == var9) {
                      break L8;
                    } else {
                      ((tg) this).field_q = Integer.parseInt(var9);
                      break L8;
                    }
                  }
                  ii.field_n = Boolean.valueOf(((tg) this).getParameter("simplemode")).booleanValue();
                  ((tg) this).a(((tg) this).field_r, 121, param4, param2, param3, 32, param1);
                  break L2;
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                nn.a((String) null, (Throwable) (Object) var6, -9958);
                ((tg) this).a(10, "crash");
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6_ref;
            stackOut_29_1 = new StringBuilder().append("tg.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L10;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            RuntimeException var4 = null;
            int var4_int = 0;
            Exception var5 = null;
            int var5_int = 0;
            Boolean var6 = null;
            fj var6_ref = null;
            String var7 = null;
            int var8 = 0;
            int stackIn_11_0 = 0;
            int stackIn_111_0 = 0;
            int stackIn_114_0 = 0;
            int stackIn_116_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_10_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_115_0 = 0;
            int stackOut_113_0 = 0;
            int stackOut_110_0 = 0;
            var8 = Torquing.field_u;
            try {
              L0: {
                var4_int = vb.a(da.field_g, sn.field_i, param0, 32);
                if (var4_int != 0) {
                  L1: {
                    if (var4_int != 1) {
                      break L1;
                    } else {
                      L2: {
                        if (param2) {
                          stackOut_10_0 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          break L2;
                        } else {
                          stackOut_8_0 = 1;
                          stackIn_11_0 = stackOut_8_0;
                          break L2;
                        }
                      }
                      L3: {
                        var5_int = uj.a(hb.a(stackIn_11_0 != 0), (byte) 75, wp.b(-118));
                        if (-1 == var5_int) {
                          break L3;
                        } else {
                          wb.a(var5_int, kh.field_n, (byte) -94, pl.field_u);
                          kh.field_n = null;
                          pl.field_u = null;
                          break L3;
                        }
                      }
                      var6 = qd.a(-112);
                      if (var6 != null) {
                        nl.a(-2, var6.booleanValue());
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L4: {
                    if (var4_int != 2) {
                      break L4;
                    } else {
                      var5_int = od.a(wd.a(-19), -124, fo.i(17543), of.d((byte) -87), ((tg) this).field_q, oc.a(false), ki.i(20));
                      if (var5_int == -1) {
                        break L4;
                      } else {
                        gk.a(-5006, pl.field_u, kh.field_n, var5_int);
                        pl.field_u = null;
                        kh.field_n = null;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (3 != var4_int) {
                      break L5;
                    } else {
                      L6: {
                        if (aj.field_J == -1) {
                          break L6;
                        } else {
                          if (0 != aj.field_J) {
                            aj.field_J = -1;
                            jl.b((byte) 106);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (!param1) {
                          break L7;
                        } else {
                          gk.field_a = false;
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var5_int = vb.a(fo.i(17543), ki.i(20), (byte) 27, false, ((tg) this).field_j, ((tg) this).field_q);
                      if (-1 == var5_int) {
                        break L5;
                      } else {
                        L8: {
                          if (var5_int != 0) {
                            break L8;
                          } else {
                            gf.field_f = qd.field_e;
                            qa.a((byte) -106);
                            kb.field_h = false;
                            op.field_i = 10;
                            if (var8 == 0) {
                              break L5;
                            } else {
                              break L8;
                            }
                          }
                        }
                        dc.a(var5_int, pl.field_u, 2);
                        pl.field_u = null;
                        break L5;
                      }
                    }
                  }
                  L9: {
                    if (var4_int != 4) {
                      break L9;
                    } else {
                      L10: {
                        if (!ao.field_b) {
                          break L10;
                        } else {
                          bc.a(ip.a(9), (byte) 108);
                          if (var8 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      op.field_i = 10;
                      kb.field_h = true;
                      break L9;
                    }
                  }
                  L11: {
                    if (var4_int == 5) {
                      to.a(ip.a(9), -20);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var4_int == 6) {
                      if (r.field_c) {
                        op.field_i = 10;
                        break L12;
                      } else {
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var4_int == 7) {
                      tp.a(ip.a(9), -65);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (param2) {
                      break L14;
                    } else {
                      ((tg) this).field_r = 12;
                      break L14;
                    }
                  }
                  L15: {
                    if (8 == var4_int) {
                      bc.a(ip.a(9), (byte) 108);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if (var4_int == 9) {
                      bi.a(ip.a(9), (byte) -126);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (var4_int != 10) {
                      break L17;
                    } else {
                      wa.field_d.f(120, 17);
                      break L17;
                    }
                  }
                  L18: {
                    if (var4_int == 11) {
                      gq.a(25530, ip.a(9));
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (12 == var4_int) {
                      ul.a(0, ah.c(2048), ip.a(9));
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                  L20: {
                    if (var4_int == 13) {
                      try {
                        L21: {
                          L22: {
                            if (null == ub.field_G) {
                              ub.field_G = new mm(nk.field_u, new java.net.URL(((tg) this).getCodeBase(), "countrylist.ws"), 5000);
                              break L22;
                            } else {
                              break L22;
                            }
                          }
                          L23: {
                            var5_int = ub.field_G.a(3) ? 1 : 0;
                            if (var5_int == 0) {
                              break L23;
                            } else {
                              L24: {
                                L25: {
                                  var6_ref = ub.field_G.a(true);
                                  if (null == var6_ref) {
                                    break L25;
                                  } else {
                                    var7 = hk.a(var6_ref.field_n, true, 0, var6_ref.field_j);
                                    hn.a(var7, (byte) -84);
                                    if (var8 == 0) {
                                      break L24;
                                    } else {
                                      break L25;
                                    }
                                  }
                                }
                                hn.a((String) null, (byte) -126);
                                break L24;
                              }
                              ub.field_G = null;
                              break L23;
                            }
                          }
                          break L21;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L26: {
                          var5 = (Exception) (Object) decompiledCaughtException;
                          nn.a("S1", (Throwable) (Object) var5, -9958);
                          hn.a((String) null, (byte) -87);
                          ub.field_G = null;
                          break L26;
                        }
                      }
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L27: {
                    if (var4_int != 15) {
                      break L27;
                    } else {
                      op.field_i = 10;
                      break L27;
                    }
                  }
                  if (var4_int != 16) {
                    if (var4_int != 17) {
                      stackOut_115_0 = 0;
                      stackIn_116_0 = stackOut_115_0;
                      break L0;
                    } else {
                      stackOut_113_0 = 2;
                      stackIn_114_0 = stackOut_113_0;
                      return stackIn_114_0;
                    }
                  } else {
                    stackOut_110_0 = 1;
                    stackIn_111_0 = stackOut_110_0;
                    return stackIn_111_0;
                  }
                } else {
                  throw new IllegalStateException();
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (RuntimeException) (Object) decompiledCaughtException;
              throw rb.a((Throwable) (Object) var4, "tg.H(" + param0 + ',' + param1 + ',' + param2 + ')');
            }
            return stackIn_116_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected tg() {
    }

    static {
    }
}
