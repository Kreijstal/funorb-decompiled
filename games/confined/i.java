/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class i extends te {
    static mi field_r;
    private boolean field_m;
    private boolean field_x;
    private int field_A;
    private long field_s;
    static ej field_q;
    static long field_p;
    private int field_t;
    static int field_w;
    static int field_o;
    private int field_C;
    private boolean field_v;
    private int field_n;
    String field_y;
    private int field_B;
    static mi field_u;
    private int field_z;

    private final void n(int param0) {
        rb.field_a[4] = true;
    }

    private final void e(byte param0) {
        int var2 = -114;
        rb.field_a[5] = true;
    }

    private final void d(byte param0) {
        rb.field_a[1] = true;
    }

    final int l(int param0) {
        int var2 = 0;
        if (((i) this).field_e) {
          return -1;
        } else {
          if (!rj.b(28404)) {
            return -1;
          } else {
            if (eg.field_l) {
              return -1;
            } else {
              L0: {
                if (param0 == -215) {
                  break L0;
                } else {
                  int discarded$2 = ((i) this).l(63);
                  break L0;
                }
              }
              var2 = oi.a(true, ((i) this).field_v, wi.c(38), ((i) this).field_t, mc.a(param0 ^ -199), (byte) -91);
              if (var2 == -1) {
                return -1;
              } else {
                L1: {
                  if (var2 == 0) {
                    break L1;
                  } else {
                    if (var2 == 1) {
                      break L1;
                    } else {
                      L2: {
                        if (ag.field_h) {
                          break L2;
                        } else {
                          ((i) this).a("reconnect", false);
                          break L2;
                        }
                      }
                      vh.b(-4749);
                      fh.a(var2, (byte) -1, gl.field_k);
                      eg.field_l = true;
                      ec.field_e = ri.a(-3) - -15000L;
                      return var2;
                    }
                  }
                }
                L3: {
                  if (rk.field_e != 11) {
                    break L3;
                  } else {
                    if (ch.field_c != 0) {
                      break L3;
                    } else {
                      h.m(-31574);
                      break L3;
                    }
                  }
                }
                return var2;
              }
            }
          }
        }
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        L0: {
          L1: {
            var3 = Confined.field_J ? 1 : 0;
            if (!dc.f(-14)) {
              if (we.field_c >= 10) {
                if (hl.a((byte) 27)) {
                  if (rk.field_e == 0) {
                    int discarded$9 = this.a(false, false, (byte) -106);
                    break L1;
                  } else {
                    ca.a(il.field_cb, -1856653215);
                    break L1;
                  }
                } else {
                  fa.g(0);
                  break L1;
                }
              } else {
                var2 = -4 % ((-48 - param0) / 60);
                break L0;
              }
            } else {
              L2: {
                stackOut_1_0 = this;
                stackOut_1_1 = 0;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                if (dn.field_d == null) {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  break L2;
                } else {
                  stackOut_2_0 = this;
                  stackOut_2_1 = stackIn_2_1;
                  stackOut_2_2 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  break L2;
                }
              }
              int discarded$10 = this.a(stackIn_4_1 != 0, stackIn_4_2 != 0, (byte) -122);
              break L1;
            }
          }
          var2 = -4 % ((-48 - param0) / 60);
          break L0;
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_25_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_102_0 = 0;
        String stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        int stackIn_103_0 = 0;
        String stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        int stackIn_131_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        String stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_102_0 = 0;
        String stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_101_0 = 0;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        L0: {
          var5 = Confined.field_J ? 1 : 0;
          if (null != gg.field_m) {
            L1: {
              if (null != dn.field_d) {
                break L1;
              } else {
                var6 = wg.b((byte) -62);
                var4 = var6.getSize();
                gg.field_m.a(var4.width, (byte) 73, var4.height);
                break L1;
              }
            }
            gg.field_m.d((byte) -44);
            break L0;
          } else {
            break L0;
          }
        }
        lf.c((byte) -84);
        nh.b(false);
        if (param0 == 110) {
          L2: {
            if (ga.g(15214)) {
              break L2;
            } else {
              if (rk.field_e != 11) {
                ei.n(15102);
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (null == jc.field_c) {
              break L3;
            } else {
              il.field_cb = jc.field_c.a(8);
              break L3;
            }
          }
          L4: {
            if (!kk.a(117)) {
              break L4;
            } else {
              L5: {
                var3 = 1200 * bg.a(12398);
                if (((i) this).field_m) {
                  break L5;
                } else {
                  if (~var3 <= ~eh.e(0)) {
                    break L4;
                  } else {
                    if (~qk.a((byte) -58) >= ~var3) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              ((i) this).field_m = false;
              dc.d(param0 ^ 6);
              vh.b(-4749);
              fh.a(2, (byte) -1, ii.field_g);
              sd.a((byte) -4);
              eg.field_l = true;
              ec.field_e = ri.a(-3) + 15000L;
              break L4;
            }
          }
          L6: {
            L7: {
              if (-1 == ch.field_c) {
                break L7;
              } else {
                if (ch.field_c == 0) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              if (-1 != ch.field_c) {
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
              ch.field_c = hn.g(18042);
              if (var3 == 0) {
                break L9;
              } else {
                if (ch.field_c == 0) {
                  if (rk.field_e != 11) {
                    break L9;
                  } else {
                    if (rj.b(28404)) {
                      break L9;
                    } else {
                      h.m(-31574);
                      break L9;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            if (ch.field_c == -1) {
              break L6;
            } else {
              if (ch.field_c == 0) {
                break L6;
              } else {
                ec.field_e = ri.a(-3) - -15000L;
                break L6;
              }
            }
          }
          L10: {
            if (-1 == ch.field_c) {
              break L10;
            } else {
              if (0 == ch.field_c) {
                break L10;
              } else {
                if (10 > we.field_c) {
                  if (ch.field_c != 3) {
                    if (ch.field_c != 4) {
                      if (ch.field_c != 2) {
                        if (5 != ch.field_c) {
                          ((i) this).a("js5connect", false);
                          break L10;
                        } else {
                          ((i) this).a("outofdate", false);
                          break L10;
                        }
                      } else {
                        ((i) this).a("js5connect_full", false);
                        break L10;
                      }
                    } else {
                      ((i) this).a("js5io", false);
                      break L10;
                    }
                  } else {
                    ((i) this).a("js5crc", false);
                    break L10;
                  }
                } else {
                  if (rk.field_e < 10) {
                    break L10;
                  } else {
                    L11: {
                      vh.b(param0 ^ -4835);
                      if (ch.field_c == 3) {
                        fh.a(256, (byte) -1, jg.field_a);
                        break L11;
                      } else {
                        if (ch.field_c == 4) {
                          fh.a(256, (byte) -1, wi.field_q);
                          break L11;
                        } else {
                          if (ch.field_c == 2) {
                            fh.a(256, (byte) -1, jc.field_a);
                            break L11;
                          } else {
                            if (ch.field_c != 5) {
                              fh.a(256, (byte) -1, d.field_e);
                              break L11;
                            } else {
                              fh.a(5, (byte) -1, bn.field_d);
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    eg.field_l = true;
                    break L10;
                  }
                }
              }
            }
          }
          L12: {
            L13: {
              L14: {
                if (ch.field_c == -1) {
                  break L14;
                } else {
                  if (0 != ch.field_c) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              if (rj.b(28404)) {
                break L13;
              } else {
                break L12;
              }
            }
            if (ec.field_e > ri.a(param0 + -113)) {
              break L12;
            } else {
              eg.field_l = false;
              if (ch.field_c == -1) {
                break L12;
              } else {
                if (0 == ch.field_c) {
                  break L12;
                } else {
                  ch.field_c = -1;
                  a.a((byte) -26);
                  break L12;
                }
              }
            }
          }
          L15: {
            if (ch.field_c != 0) {
              break L15;
            } else {
              if (!rj.b(28404)) {
                mk.field_o = false;
                break L15;
              } else {
                break L15;
              }
            }
          }
          L16: {
            if (we.field_c != 0) {
              break L16;
            } else {
              if (!cd.c((byte) 6)) {
                break L16;
              } else {
                we.field_c = 1;
                break L16;
              }
            }
          }
          L17: {
            if (we.field_c != 1) {
              break L17;
            } else {
              L18: {
                if (0 != hc.field_m) {
                  o.field_f = cc.a(si.field_h, -14245);
                  break L18;
                } else {
                  break L18;
                }
              }
              wc.field_Wb = gi.a(gd.field_n, false, true, 1, true);
              field_r = gi.a(wg.field_e, false, true, 1, true);
              tf.field_k = gi.a(lc.field_z, false, true, 1, true);
              we.field_c = 2;
              pb.field_e = wc.field_Wb;
              break L17;
            }
          }
          L19: {
            if (we.field_c == 2) {
              L20: {
                if (null == o.field_f) {
                  break L20;
                } else {
                  if (o.field_f.b(0)) {
                    if (o.field_f.b("", -4308)) {
                      if (!o.field_f.a("", 0)) {
                        break L20;
                      } else {
                        wb.a(param0 ^ 104, o.field_f);
                        o.field_f = null;
                        am.g(-4258);
                        break L20;
                      }
                    } else {
                      o.field_f = null;
                      break L20;
                    }
                  } else {
                    break L20;
                  }
                }
              }
              if (null == o.field_f) {
                we.field_c = 3;
                break L19;
              } else {
                break L19;
              }
            } else {
              break L19;
            }
          }
          L21: {
            if (we.field_c != 3) {
              break L21;
            } else {
              if (!nn.a(wc.field_Wb, tf.field_k, field_r, param0 ^ 117)) {
                break L21;
              } else {
                if (qn.a(tf.field_k, -1)) {
                  L22: {
                    L23: {
                      bd.b(param0 ^ -4585);
                      lb.d(param0 + -228);
                      qf.field_g = false;
                      ui.field_b = ec.field_d;
                      fi.a(tf.field_k, 0, d.field_d, wc.field_Wb, field_r);
                      if (ad.field_d) {
                        break L23;
                      } else {
                        if (null == je.field_v) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (ad.field_d) {
                        stackOut_99_0 = 0;
                        stackIn_100_0 = stackOut_99_0;
                        break L24;
                      } else {
                        stackOut_98_0 = 1;
                        stackIn_100_0 = stackOut_98_0;
                        break L24;
                      }
                    }
                    L25: {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = je.field_v;
                      stackOut_100_2 = -120;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      stackIn_102_2 = stackOut_100_2;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      stackIn_101_2 = stackOut_100_2;
                      if (ad.field_d) {
                        stackOut_102_0 = stackIn_102_0;
                        stackOut_102_1 = (String) (Object) stackIn_102_1;
                        stackOut_102_2 = stackIn_102_2;
                        stackOut_102_3 = 0;
                        stackIn_103_0 = stackOut_102_0;
                        stackIn_103_1 = stackOut_102_1;
                        stackIn_103_2 = stackOut_102_2;
                        stackIn_103_3 = stackOut_102_3;
                        break L25;
                      } else {
                        stackOut_101_0 = stackIn_101_0;
                        stackOut_101_1 = (String) (Object) stackIn_101_1;
                        stackOut_101_2 = stackIn_101_2;
                        stackOut_101_3 = 1;
                        stackIn_103_0 = stackOut_101_0;
                        stackIn_103_1 = stackOut_101_1;
                        stackIn_103_2 = stackOut_101_2;
                        stackIn_103_3 = stackOut_101_3;
                        break L25;
                      }
                    }
                    gk.a(stackIn_103_0 != 0, stackIn_103_1, (byte) stackIn_103_2, stackIn_103_3 != 0);
                    break L22;
                  }
                  L26: {
                    if (ve.field_g) {
                      bd.a(param0 ^ 1849965388);
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (vg.field_G == null) {
                      vg.field_G = n.a(21146);
                      la.field_O = hd.a(58);
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  og.a((byte) 122, tf.field_k, vg.field_G, la.field_O);
                  tf.field_k = null;
                  field_r = null;
                  wc.field_Wb = null;
                  ec.a((java.applet.Applet) this, 3);
                  am.g(-4258);
                  we.field_c = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
            }
          }
          L28: {
            if (we.field_c != 10) {
              break L28;
            } else {
              L29: {
                if (hc.field_m == 0) {
                  break L29;
                } else {
                  fj.field_u = cc.a(cf.field_ib, param0 ^ -14283);
                  break L29;
                }
              }
              we.field_c = 11;
              break L28;
            }
          }
          L30: {
            if (we.field_c != 11) {
              break L30;
            } else {
              L31: {
                if (fj.field_u == null) {
                  break L31;
                } else {
                  L32: {
                    if (!fj.field_u.b(param0 ^ 110)) {
                      break L32;
                    } else {
                      if (fj.field_u.a(25057)) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  jc.a(ka.a(fj.field_u, hc.field_s, -12, b.field_k), 10265, 0.0f);
                  break L30;
                }
              }
              we.field_c = 12;
              pc.field_d = true;
              break L30;
            }
          }
          L33: {
            if (we.field_c != 12) {
              break L33;
            } else {
              if (pc.field_d) {
                break L33;
              } else {
                we.field_c = 13;
                break L33;
              }
            }
          }
          L34: {
            if (we.field_c == 13) {
              L35: {
                var3 = 1;
                if (null == dg.field_n) {
                  break L35;
                } else {
                  L36: {
                    if (!dg.field_n.a(-1)) {
                      stackOut_130_0 = 0;
                      stackIn_131_0 = stackOut_130_0;
                      break L36;
                    } else {
                      stackOut_129_0 = 1;
                      stackIn_131_0 = stackOut_129_0;
                      break L36;
                    }
                  }
                  var3 = stackIn_131_0;
                  jc.a(dg.field_n.field_e, 10265, dg.field_n.field_g);
                  break L35;
                }
              }
              if (var3 == 0) {
                break L34;
              } else {
                we.field_c = 20;
                break L34;
              }
            } else {
              break L34;
            }
          }
          L37: {
            if (param1) {
              break L37;
            } else {
              if (ac.field_a) {
                fa.a(fb.field_b, 100);
                ((i) this).g(122);
                ac.a(fb.field_b, (byte) -102);
                break L37;
              } else {
                break L37;
              }
            }
          }
          L38: {
            if (!rb.field_a[8]) {
              break L38;
            } else {
              og.a(false);
              break L38;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, String param1, int param2) {
        try {
            this.a(param2, 480, param1, (byte) -83, param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "i.NA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void i(int param0) {
        int var2 = 0;
        oc var3 = null;
        int var4 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        L0: {
          var4 = Confined.field_J ? 1 : 0;
          var2 = Confined.field_F;
          if (64 <= var2) {
            break L0;
          } else {
            if (!rb.field_a[var2]) {
              break L0;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if (var2 != 1) {
                    if (var2 == 2) {
                      md.b(-10964);
                      break L1;
                    } else {
                      if (var2 == 3) {
                        md.a((byte) 105);
                        break L1;
                      } else {
                        if (var2 == 4) {
                          ji.b((byte) 54);
                          break L1;
                        } else {
                          if (5 == var2) {
                            s.h(0);
                            break L1;
                          } else {
                            if (6 != var2) {
                              if (var2 == 7) {
                                this.m(31819);
                                break L1;
                              } else {
                                if (var2 != 8) {
                                  if (var2 == 16) {
                                    rc.b(-22889);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (var2 == 13) {
                                            kg.i((byte) -52);
                                            break L1;
                                          } else {
                                            if (var2 == 17) {
                                              this.b(false);
                                              break L1;
                                            } else {
                                              if (var2 == 18) {
                                                sf.c(-52);
                                                break L1;
                                              } else {
                                                mb.a("MGS1: " + ui.a(10), true, (Throwable) null);
                                                dc.d(124);
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_26_0 = 1;
                                      stackIn_28_0 = stackOut_26_0;
                                      stackIn_27_0 = stackOut_26_0;
                                      if (var2 != 12) {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackOut_28_1 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        stackIn_29_1 = stackOut_28_1;
                                        break L3;
                                      } else {
                                        stackOut_27_0 = stackIn_27_0;
                                        stackOut_27_1 = 1;
                                        stackIn_29_0 = stackOut_27_0;
                                        stackIn_29_1 = stackOut_27_1;
                                        break L3;
                                      }
                                    }
                                    var3 = vm.a(stackIn_29_0, stackIn_29_1 != 0);
                                    vg.a(false, var3);
                                    break L1;
                                  }
                                } else {
                                  b.a(ki.field_d, -85, (kg) (Object) e.field_c, ai.field_i);
                                  break L1;
                                }
                              }
                            } else {
                              cc.b(0);
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    hl.a(-251);
                    break L1;
                  }
                }
                L4: {
                  if (param0 >= 97) {
                    break L4;
                  } else {
                    field_w = 72;
                    break L4;
                  }
                }
                return;
              }
            }
          }
        }
        mb.a("MGS2: " + ui.a(10), true, (Throwable) null);
        dc.d(118);
    }

    private final void j(int param0) {
        ib.field_M[9] = -1;
        ib.field_M[13] = -1;
        ib.field_M[7] = -1;
        ib.field_M[17] = -1;
        ib.field_M[6] = -2;
        ib.field_M[12] = -1;
        ib.field_M[2] = -2;
        ib.field_M[10] = -1;
        ib.field_M[8] = -2;
        ib.field_M[11] = -1;
        ib.field_M[5] = -1;
        ib.field_M[4] = -1;
        ib.field_M[16] = -1;
        ib.field_M[3] = -1;
        ib.field_M[18] = 1;
        ib.field_M[1] = 16;
    }

    private final void k(int param0) {
        rb.field_a[param0] = true;
    }

    private final void a(int param0, int param1, String param2, byte param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
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
              if (!((i) this).a(true)) {
                return;
              } else {
                ((i) this).field_y = ((i) this).getCodeBase().getHost();
                L1: {
                  L2: {
                    var6_ref2 = ((i) this).field_y.toLowerCase();
                    stackOut_5_0 = this;
                    stackIn_8_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_6_0 = this;
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L1;
                      } else {
                        stackOut_7_0 = this;
                        stackIn_8_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_8_0 = this;
                  stackOut_8_1 = 1;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  break L1;
                }
                L3: {
                  ((i) this).field_v = stackIn_10_1 != 0;
                  ((i) this).field_A = Integer.parseInt(((i) this).getParameter("gameport1"));
                  ((i) this).field_B = Integer.parseInt(((i) this).getParameter("gameport2"));
                  var7 = ((i) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((i) this).field_n = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((i) this).field_C = Integer.parseInt(((i) this).getParameter("gamecrc"));
                  ((i) this).field_s = Long.parseLong(((i) this).getParameter("instanceid"));
                  ((i) this).field_x = ((i) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((i) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((i) this).field_z = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (((i) this).field_z < 5) {
                    break L5;
                  } else {
                    ((i) this).field_z = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((i) this).getParameter("affid");
                  if (var9 != null) {
                    ((i) this).field_t = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ve.field_g = Boolean.valueOf(((i) this).getParameter("simplemode")).booleanValue();
                ((i) this).a(480, ((i) this).field_C, param0, 69, param4, 32, param2);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              mb.a((String) null, true, (Throwable) (Object) var6);
              ((i) this).a("crash", false);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6_ref;
            stackOut_23_1 = new StringBuilder().append("i.CA(").append(param0).append(',').append(480).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + -83 + ',' + param4 + ')');
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, true);
        if (param1 != 111) {
            i.b((byte) -64);
        }
        if (!(!param0)) {
            this.d((byte) -106);
        }
        if (param4) {
            this.k(2);
        }
        if (!(!param2)) {
            this.n(20129);
        }
        if (param3) {
            this.e((byte) -35);
        }
    }

    public static void b(byte param0) {
        field_u = null;
        field_q = null;
        if (param0 <= 24) {
            char discarded$0 = i.a('￁', (byte) 35);
        }
        field_r = null;
    }

    final void a(byte param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((i) this).setBackground(java.awt.Color.black);
        if (param0 != 19) {
            i.b((byte) -65);
        }
        hc.field_m = ((i) this).field_z;
        fd.a(30177, hc.field_m);
        tl.a(((i) this).field_C, ((i) this).field_y, 5000, hc.field_m, param0 + 9718, ((i) this).field_x, ki.field_d, ((i) this).field_n, param4, ((i) this).field_s, ((i) this).field_A, ((i) this).field_B, param1, 5000);
        ng.a(((i) this).field_A, ((i) this).field_n, 24774, ((i) this).field_B, hc.field_m, ((i) this).field_C, ki.field_d, ((i) this).field_y, param1);
        kh.h(-66);
        jc.field_c = ba.h((byte) 110);
        ac.a(fb.field_b, (byte) -118);
        lc.field_z = param7;
        gd.field_n = param6;
        si.field_h = param5;
        wg.field_e = param3;
        cf.field_ib = param2;
        this.j(-1);
        eh.d(-117);
    }

    final int a(boolean param0, int param1) {
        if (param1 != 30116) {
            this.k(13);
        }
        return this.a(true, param0, (byte) -127);
    }

    private final void m(int param0) {
        String var2 = mh.a(true);
        ci.a(ii.b(false), var2, -77);
    }

    final static char a(char param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        if (param1 <= -7) {
          L0: {
            var2 = param0;
            if (32 != var2) {
              if (var2 == 160) {
                break L0;
              } else {
                if (var2 == 95) {
                  break L0;
                } else {
                  if (45 == var2) {
                    break L0;
                  } else {
                    L1: {
                      if (var2 != 91) {
                        if (var2 == 93) {
                          break L1;
                        } else {
                          if (var2 != 35) {
                            L2: {
                              if (var2 != 224) {
                                if (var2 != 225) {
                                  if (var2 == 226) {
                                    break L2;
                                  } else {
                                    if (var2 == 228) {
                                      break L2;
                                    } else {
                                      if (227 == var2) {
                                        break L2;
                                      } else {
                                        if (var2 != 192) {
                                          if (var2 == 193) {
                                            break L2;
                                          } else {
                                            if (194 != var2) {
                                              if (var2 == 196) {
                                                break L2;
                                              } else {
                                                if (var2 != 195) {
                                                  L3: {
                                                    if (var2 != 232) {
                                                      if (var2 == 233) {
                                                        break L3;
                                                      } else {
                                                        if (var2 == 234) {
                                                          break L3;
                                                        } else {
                                                          if (var2 == 235) {
                                                            break L3;
                                                          } else {
                                                            if (var2 != 200) {
                                                              if (var2 != 201) {
                                                                if (var2 == 202) {
                                                                  break L3;
                                                                } else {
                                                                  if (var2 != 203) {
                                                                    L4: {
                                                                      if (237 == var2) {
                                                                        break L4;
                                                                      } else {
                                                                        if (238 != var2) {
                                                                          if (var2 == 239) {
                                                                            break L4;
                                                                          } else {
                                                                            if (var2 == 205) {
                                                                              break L4;
                                                                            } else {
                                                                              if (var2 != 206) {
                                                                                if (207 != var2) {
                                                                                  L5: {
                                                                                    if (var2 != 242) {
                                                                                      if (243 == var2) {
                                                                                        break L5;
                                                                                      } else {
                                                                                        if (var2 == 244) {
                                                                                          break L5;
                                                                                        } else {
                                                                                          if (var2 == 246) {
                                                                                            break L5;
                                                                                          } else {
                                                                                            if (var2 != 245) {
                                                                                              if (var2 != 210) {
                                                                                                if (var2 == 211) {
                                                                                                  break L5;
                                                                                                } else {
                                                                                                  if (212 == var2) {
                                                                                                    break L5;
                                                                                                  } else {
                                                                                                    if (var2 == 214) {
                                                                                                      break L5;
                                                                                                    } else {
                                                                                                      if (var2 == 213) {
                                                                                                        break L5;
                                                                                                      } else {
                                                                                                        L6: {
                                                                                                          if (249 != var2) {
                                                                                                            if (var2 == 250) {
                                                                                                              break L6;
                                                                                                            } else {
                                                                                                              if (var2 != 251) {
                                                                                                                if (252 != var2) {
                                                                                                                  if (var2 != 217) {
                                                                                                                    if (218 == var2) {
                                                                                                                      break L6;
                                                                                                                    } else {
                                                                                                                      if (var2 != 219) {
                                                                                                                        if (var2 != 220) {
                                                                                                                          L7: {
                                                                                                                            if (231 == var2) {
                                                                                                                              break L7;
                                                                                                                            } else {
                                                                                                                              if (var2 != 199) {
                                                                                                                                L8: {
                                                                                                                                  if (var2 != 255) {
                                                                                                                                    if (376 == var2) {
                                                                                                                                      break L8;
                                                                                                                                    } else {
                                                                                                                                      L9: {
                                                                                                                                        if (241 == var2) {
                                                                                                                                          break L9;
                                                                                                                                        } else {
                                                                                                                                          if (var2 == 209) {
                                                                                                                                            break L9;
                                                                                                                                          } else {
                                                                                                                                            if (var2 != 223) {
                                                                                                                                              return Character.toLowerCase(param0);
                                                                                                                                            } else {
                                                                                                                                              return 'b';
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      return 'n';
                                                                                                                                    }
                                                                                                                                  } else {
                                                                                                                                    break L8;
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                return 'y';
                                                                                                                              } else {
                                                                                                                                break L7;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          return 'c';
                                                                                                                        } else {
                                                                                                                          break L6;
                                                                                                                        }
                                                                                                                      } else {
                                                                                                                        break L6;
                                                                                                                      }
                                                                                                                    }
                                                                                                                  } else {
                                                                                                                    break L6;
                                                                                                                  }
                                                                                                                } else {
                                                                                                                  break L6;
                                                                                                                }
                                                                                                              } else {
                                                                                                                break L6;
                                                                                                              }
                                                                                                            }
                                                                                                          } else {
                                                                                                            break L6;
                                                                                                          }
                                                                                                        }
                                                                                                        return 'u';
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                break L5;
                                                                                              }
                                                                                            } else {
                                                                                              break L5;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    } else {
                                                                                      break L5;
                                                                                    }
                                                                                  }
                                                                                  return 'o';
                                                                                } else {
                                                                                  break L4;
                                                                                }
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
                                                                    return 'i';
                                                                  } else {
                                                                    break L3;
                                                                  }
                                                                }
                                                              } else {
                                                                break L3;
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      break L3;
                                                    }
                                                  }
                                                  return 'e';
                                                } else {
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              break L2;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L2;
                                }
                              } else {
                                break L2;
                              }
                            }
                            return 'a';
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                    return param0;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return '_';
        } else {
          return '';
        }
    }

    private final int a(boolean param0, boolean param1, byte param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            kg var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Confined.field_J ? 1 : 0;
            var4 = cc.a(param1, (byte) -111, hc.field_m, il.field_cb);
            if (var4 != 0) {
              L0: {
                if (1 == var4) {
                  L1: {
                    var5_int = s.a(aa.a((byte) -115), md.c(97), (byte) -87);
                    if (-1 == var5_int) {
                      break L1;
                    } else {
                      gj.a(gl.field_k, true, sc.field_g, var5_int);
                      gl.field_k = null;
                      sc.field_g = null;
                      break L1;
                    }
                  }
                  var11 = dj.i((byte) 118);
                  if (var11 == null) {
                    break L0;
                  } else {
                    qj.a(-72, var11.booleanValue());
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (2 != var4) {
                  break L2;
                } else {
                  var5_int = rd.a(mc.a(16), ((i) this).field_t, 28406, qj.a(1), va.b(8), wi.c(22), hk.a(-1));
                  if (var5_int != -1) {
                    ud.a(false, var5_int, gl.field_k, sc.field_g);
                    gl.field_k = null;
                    sc.field_g = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (3 != var4) {
                  break L3;
                } else {
                  L4: {
                    if (ch.field_c == -1) {
                      break L4;
                    } else {
                      if (ch.field_c == 0) {
                        break L4;
                      } else {
                        ch.field_c = -1;
                        a.a((byte) -26);
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    var5_int = oi.a(false, ((i) this).field_v, wi.c(-123), ((i) this).field_t, mc.a(16), (byte) -89);
                    if (-1 == var5_int) {
                      break L3;
                    } else {
                      if (var5_int != 0) {
                        fh.a(var5_int, (byte) -1, gl.field_k);
                        gl.field_k = null;
                        break L3;
                      } else {
                        field_p = vb.field_d;
                        h.m(-31574);
                        fd.field_j = false;
                        rk.field_e = 10;
                        break L3;
                      }
                    }
                  } else {
                    eg.field_l = false;
                    break L3;
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (!d.field_d) {
                    fd.field_j = true;
                    rk.field_e = 10;
                    break L5;
                  } else {
                    pe.a(ii.b(false), (byte) 11);
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (param2 < -76) {
                  break L6;
                } else {
                  char discarded$1 = i.a('ﾵ', (byte) -116);
                  break L6;
                }
              }
              L7: {
                if (var4 == 5) {
                  jn.a(false, ii.b(false));
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 == 6) {
                  if (qf.field_g) {
                    rk.field_e = 10;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 != 7) {
                  break L9;
                } else {
                  ci.a(ii.b(false), true);
                  break L9;
                }
              }
              L10: {
                if (var4 != 8) {
                  break L10;
                } else {
                  pe.a(ii.b(false), (byte) 11);
                  break L10;
                }
              }
              L11: {
                if (9 == var4) {
                  pe.a(-59, ii.b(false));
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 != 10) {
                  break L12;
                } else {
                  vh.field_a.b(true, 17);
                  break L12;
                }
              }
              L13: {
                if (var4 == 11) {
                  me.a((byte) 102, ii.b(false));
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var4 == 12) {
                  li.a(ii.b(false), 104, ci.a((byte) -102));
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (var4 == 13) {
                  try {
                    L16: {
                      L17: {
                        if (cg.field_e != null) {
                          break L17;
                        } else {
                          cg.field_e = new pk(ki.field_d, new java.net.URL(((i) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        }
                      }
                      L18: {
                        if (!cg.field_e.b(1)) {
                          break L18;
                        } else {
                          L19: {
                            var12 = cg.field_e.a(-4);
                            if (var12 == null) {
                              var9 = null;
                              tk.a(13, (String) null);
                              break L19;
                            } else {
                              var7 = kh.a(var12.field_m, var12.field_n, 0, 0);
                              tk.a(13, var7);
                              break L19;
                            }
                          }
                          cg.field_e = null;
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      mb.a("S1", true, (Throwable) (Object) var5);
                      var10 = null;
                      tk.a(13, (String) null);
                      cg.field_e = null;
                      break L20;
                    }
                  }
                  break L15;
                } else {
                  break L15;
                }
              }
              L21: {
                if (var4 != 15) {
                  break L21;
                } else {
                  rk.field_e = 10;
                  break L21;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (17 == var4) {
                  return 2;
                } else {
                  return 0;
                }
              }
            } else {
              throw new IllegalStateException();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(boolean param0) {
        int var2 = e.field_c.c(32);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = ai.field_i - 1;
        byte[] var5 = new byte[var4];
        e.field_c.a(var5, 0, var4, 0);
        pk.a(var3 != 0, va.a(0, var5), ii.b(false), (byte) 73);
    }

    private final void a(boolean param0, boolean param1) {
        rb.field_a[8] = false;
        rb.field_a[0] = true;
        rb.field_a[16] = true;
        rb.field_a[18] = true;
        rb.field_a[17] = true;
        rb.field_a[7] = true;
        rb.field_a[3] = true;
    }

    protected i() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
        field_q = new ej();
    }
}
