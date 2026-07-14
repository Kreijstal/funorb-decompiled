/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class wf extends ch {
    private int field_x;
    private long field_k;
    private int field_r;
    static rf field_o;
    private boolean field_t;
    private boolean field_v;
    String field_n;
    private boolean field_m;
    private int field_u;
    static String field_q;
    private int field_w;
    private int field_l;
    private int field_s;
    static int field_p;

    private final int k(int param0) {
        int var2 = 0;
        if (!((wf) this).field_a) {
          if (!sb.a(75)) {
            return -1;
          } else {
            if (ii.field_e) {
              return -1;
            } else {
              var2 = ri.a(true, sa.a(true), ((wf) this).field_r, ((wf) this).field_v, al.b(param0 + 1), 0);
              if (var2 == param0) {
                return -1;
              } else {
                L0: {
                  if (var2 != 0) {
                    if (var2 == 1) {
                      if (-12 == hj.field_a) {
                        if (ib.field_e == 0) {
                          gi.b(param0 + -12617);
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    } else {
                      L1: {
                        if (!ff.field_k) {
                          ((wf) this).a((byte) 79, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      kd.b((byte) 103);
                      q.a((byte) 124, var2, kh.field_a);
                      ii.field_e = true;
                      hi.field_G = oa.a(-12520) - -15000L;
                      return var2;
                    }
                  } else {
                    if (-12 == hj.field_a) {
                      if (ib.field_e == 0) {
                        gi.b(param0 + -12617);
                        break L0;
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
            }
          }
        } else {
          return -1;
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        int var4 = -16 / ((param1 - -4) / 62);
        String var3 = null;
        String var5 = null;
        if (null != sd.field_z) {
            if (!(sd.field_z.equals((Object) (Object) param2.getParameter("settings")))) {
                var3 = sd.field_z;
                var5 = var3;
                var5 = var3;
            }
        }
        if (me.field_j != null) {
            if (!(me.field_j.equals((Object) (Object) param2.getParameter("session")))) {
                var5 = me.field_j;
            }
        }
        return ai.a(var5, var3, param0, -1, true);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = null;
        var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((wf) this).setBackground(java.awt.Color.black);
        va.field_a = ((wf) this).field_u;
        da.a(true, va.field_a);
        if (param0 != -70) {
          return;
        } else {
          ic.a(((wf) this).field_s, ((wf) this).field_k, 5000, param7, ((wf) this).field_m, param5, va.field_a, ((wf) this).field_w, 5000, ((wf) this).field_n, ((wf) this).field_x, ka.field_i, 64, ((wf) this).field_l);
          q.a(param7, va.field_a, ((wf) this).field_l, ((wf) this).field_x, -23949, ka.field_i, ((wf) this).field_n, ((wf) this).field_s, ((wf) this).field_w);
          rd.b(28);
          vc.field_f = nd.a(param0 + 113);
          sl.a(f.field_kb, 57);
          lk.field_e = param2;
          ib.field_c = param4;
          pb.field_r = param6;
          sb.field_d = param3;
          ah.field_a = param1;
          this.e(123);
          pk.k((byte) -13);
          return;
        }
    }

    private final void f(int param0) {
        if (param0 != -11) {
            return;
        }
        String var2 = vf.i(1000);
        va.a(var2, k.c(111), param0 + 10);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(false, (byte) -91);
        if (!(!param3)) {
            this.f((byte) 32);
        }
        if (param2) {
            this.i(16072);
        }
        if (param4 > -87) {
            ((wf) this).field_w = -34;
        }
        if (!(!param0)) {
            this.e((byte) -19);
        }
        if (param1) {
            this.d(true);
        }
    }

    final void a(int param0, String param1, int param2) {
        this.a(480, param1, param0, (byte) 81, param2);
    }

    final int d(byte param0) {
        if (param0 != -67) {
            Object var3 = null;
            java.net.URL discarded$0 = wf.a((java.net.URL) null, 48, (java.applet.Applet) null);
        }
        int var2 = this.k(-1);
        if (-1 != (var2 ^ -1)) {
            // if_icmpeq L46
        } else {
            if (wj.field_G[1]) {
                qc.a(true, 2);
            }
            if (!(!wj.field_G[2])) {
                ec.a(param0 ^ 76, 3);
            }
            if (!(!wj.field_G[3])) {
                ud.a((byte) -125, 4);
            }
            if (!(!wj.field_G[4])) {
                oi.a(5, 116);
            }
            if (wj.field_G[5]) {
                di.a(6, param0 + 21789);
            }
            if (wj.field_G[6]) {
                wd.a(true, 7);
            }
            if (wj.field_G[8]) {
                ng.g(-13912);
            }
        }
        return var2;
    }

    private final void a(boolean param0, byte param1) {
        wj.field_G[18] = true;
        wj.field_G[17] = true;
        wj.field_G[8] = param0;
        wj.field_G[0] = true;
        wj.field_G[3] = true;
        if (param1 != -91) {
            this.e((byte) 55);
        }
        wj.field_G[7] = true;
        wj.field_G[16] = true;
    }

    private final void e(int param0) {
        pb.field_m[11] = -1;
        pb.field_m[3] = -1;
        pb.field_m[10] = -1;
        pb.field_m[17] = -1;
        pb.field_m[5] = -1;
        pb.field_m[16] = -1;
        pb.field_m[6] = -2;
        pb.field_m[1] = 16;
        pb.field_m[9] = -1;
        pb.field_m[13] = -1;
        int var2 = -13 / ((param0 - 56) / 60);
        pb.field_m[7] = -1;
        pb.field_m[2] = -2;
        pb.field_m[4] = -1;
        pb.field_m[8] = -2;
        pb.field_m[18] = 1;
        pb.field_m[12] = -1;
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_115_0 = 0;
        String stackIn_115_1 = null;
        int stackIn_116_0 = 0;
        String stackIn_116_1 = null;
        int stackIn_117_0 = 0;
        String stackIn_117_1 = null;
        int stackIn_117_2 = 0;
        int stackIn_118_0 = 0;
        String stackIn_118_1 = null;
        int stackIn_118_2 = 0;
        int stackIn_119_0 = 0;
        String stackIn_119_1 = null;
        int stackIn_119_2 = 0;
        int stackIn_120_0 = 0;
        String stackIn_120_1 = null;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        int stackIn_150_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_114_0 = 0;
        String stackOut_114_1 = null;
        int stackOut_116_0 = 0;
        String stackOut_116_1 = null;
        int stackOut_116_2 = 0;
        int stackOut_115_0 = 0;
        String stackOut_115_1 = null;
        int stackOut_115_2 = 0;
        int stackOut_117_0 = 0;
        String stackOut_117_1 = null;
        int stackOut_117_2 = 0;
        int stackOut_119_0 = 0;
        String stackOut_119_1 = null;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        int stackOut_118_0 = 0;
        String stackOut_118_1 = null;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        int stackOut_149_0 = 0;
        int stackOut_148_0 = 0;
        L0: {
          var5 = Geoblox.field_C;
          if (null == rb.field_d) {
            break L0;
          } else {
            L1: {
              if (vl.field_n != null) {
                break L1;
              } else {
                var6 = jf.a(true);
                var4 = var6.getSize();
                rb.field_d.a((byte) 126, var4.height, var4.width);
                break L1;
              }
            }
            rb.field_d.a((byte) -126);
            break L0;
          }
        }
        L2: {
          re.b(true);
          mc.a((byte) -128);
          if (bl.b(255)) {
            break L2;
          } else {
            if (hj.field_a != 11) {
              ck.c(1);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != vc.field_f) {
            vc.field_i = vc.field_f.a(true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (t.b(param1 ^ 19649)) {
            L5: {
              var3 = 1200 * sb.a(true);
              if (((wf) this).field_t) {
                break L5;
              } else {
                if (var3 >= ha.a(-76)) {
                  break L4;
                } else {
                  if (var3 >= jk.a(false)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((wf) this).field_t = false;
            jl.a((byte) -115);
            kd.b((byte) 81);
            q.a((byte) 124, 2, fa.field_d);
            bl.c(-113);
            ii.field_e = true;
            hi.field_G = oa.a(-12520) - -15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if ((ib.field_e ^ -1) == 0) {
              break L7;
            } else {
              if (ib.field_e != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != ib.field_e) {
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
          ib.field_e = ma.b(15869);
          if (var3 != 0) {
            L9: {
              if (ib.field_e == 0) {
                if (11 == hj.field_a) {
                  if (!sb.a(73)) {
                    gi.b(-12618);
                    break L9;
                  } else {
                    if (-1 == ib.field_e) {
                      break L6;
                    } else {
                      if (ib.field_e == 0) {
                        break L6;
                      } else {
                        hi.field_G = 15000L + oa.a(-12520);
                        break L6;
                      }
                    }
                  }
                } else {
                  if (-1 == ib.field_e) {
                    break L6;
                  } else {
                    if (ib.field_e == 0) {
                      break L6;
                    } else {
                      hi.field_G = 15000L + oa.a(-12520);
                      break L6;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            if (-1 == ib.field_e) {
              break L6;
            } else {
              if (ib.field_e == 0) {
                break L6;
              } else {
                hi.field_G = 15000L + oa.a(-12520);
                break L6;
              }
            }
          } else {
            if (-1 == ib.field_e) {
              break L6;
            } else {
              if (ib.field_e == 0) {
                break L6;
              } else {
                hi.field_G = 15000L + oa.a(-12520);
                break L6;
              }
            }
          }
        }
        L10: {
          if (ib.field_e == -1) {
            break L10;
          } else {
            if (ib.field_e != 0) {
              if (mi.field_C >= 10) {
                if (hj.field_a < 10) {
                  break L10;
                } else {
                  L11: {
                    kd.b((byte) 114);
                    if (-4 != (ib.field_e ^ -1)) {
                      if (4 != ib.field_e) {
                        if (2 == ib.field_e) {
                          q.a((byte) 124, 256, rc.field_g);
                          break L11;
                        } else {
                          if (ib.field_e != 5) {
                            q.a((byte) 124, 256, ki.field_e);
                            break L11;
                          } else {
                            q.a((byte) 124, 5, jg.field_c);
                            break L11;
                          }
                        }
                      } else {
                        q.a((byte) 124, 256, qb.field_F);
                        break L11;
                      }
                    } else {
                      q.a((byte) 124, 256, pf.field_H);
                      break L11;
                    }
                  }
                  ii.field_e = true;
                  break L10;
                }
              } else {
                if ((ib.field_e ^ -1) != -4) {
                  if (ib.field_e != 4) {
                    if (2 == ib.field_e) {
                      ((wf) this).a((byte) 79, "js5connect_full");
                      break L10;
                    } else {
                      if (-6 != (ib.field_e ^ -1)) {
                        ((wf) this).a((byte) 79, "js5connect");
                        break L10;
                      } else {
                        ((wf) this).a((byte) 79, "outofdate");
                        break L10;
                      }
                    }
                  } else {
                    ((wf) this).a((byte) 79, "js5io");
                    break L10;
                  }
                } else {
                  ((wf) this).a((byte) 79, "js5crc");
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
              L15: {
                if (ib.field_e == -1) {
                  break L15;
                } else {
                  if (ib.field_e != 0) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              if (sb.a(param1 + -19585)) {
                break L14;
              } else {
                break L13;
              }
            }
            if ((hi.field_G ^ -1L) >= (oa.a(param1 + -32180) ^ -1L)) {
              ii.field_e = false;
              if (-1 == ib.field_e) {
                L16: {
                  if (ib.field_e == -1) {
                    break L16;
                  } else {
                    if (ib.field_e != -1) {
                      break L12;
                    } else {
                      break L16;
                    }
                  }
                }
                if (sb.a(93)) {
                  break L12;
                } else {
                  lb.field_a = false;
                  break L12;
                }
              } else {
                L17: {
                  if (ib.field_e == -1) {
                    break L17;
                  } else {
                    if (ib.field_e != -1) {
                      break L12;
                    } else {
                      break L17;
                    }
                  }
                }
                if (sb.a(93)) {
                  break L12;
                } else {
                  lb.field_a = false;
                  break L12;
                }
              }
            } else {
              break L13;
            }
          }
          if (ib.field_e != -1) {
            break L12;
          } else {
            if (sb.a(93)) {
              break L12;
            } else {
              lb.field_a = false;
              break L12;
            }
          }
        }
        L18: {
          if (-1 != mi.field_C) {
            break L18;
          } else {
            if (qi.b(108)) {
              mi.field_C = 1;
              break L18;
            } else {
              break L18;
            }
          }
        }
        L19: {
          if (mi.field_C == 1) {
            L20: {
              if (va.field_a == 0) {
                break L20;
              } else {
                dd.field_J = kk.a(lk.field_e, (byte) -62);
                break L20;
              }
            }
            l.field_h = rj.a(ib.field_c, (byte) -18, true, false, 1);
            dc.field_c = rj.a(pb.field_r, (byte) -124, true, false, 1);
            hb.field_n = rj.a(sb.field_d, (byte) -41, true, false, 1);
            ki.field_b = l.field_h;
            mi.field_C = 2;
            re.field_i = dc.field_c;
            break L19;
          } else {
            break L19;
          }
        }
        L21: {
          if ((mi.field_C ^ -1) != -3) {
            break L21;
          } else {
            L22: {
              if (dd.field_J == null) {
                break L22;
              } else {
                if (dd.field_J.a(0)) {
                  if (!dd.field_J.b((byte) -116, "")) {
                    dd.field_J = null;
                    break L22;
                  } else {
                    if (!dd.field_J.a("", (byte) -126)) {
                      break L22;
                    } else {
                      wi.a((byte) 74, dd.field_J);
                      dd.field_J = null;
                      ih.b(-50);
                      break L22;
                    }
                  }
                } else {
                  break L22;
                }
              }
            }
            if (null == dd.field_J) {
              mi.field_C = 3;
              break L21;
            } else {
              break L21;
            }
          }
        }
        L23: {
          if (3 == mi.field_C) {
            if (!ma.a(hb.field_n, dc.field_c, l.field_h, -11652)) {
              break L23;
            } else {
              if (!rj.a((byte) -127, hb.field_n)) {
                break L23;
              } else {
                L24: {
                  L25: {
                    tj.c((byte) -105);
                    ke.b((byte) 120);
                    oi.field_e = nh.field_c;
                    kf.field_e = false;
                    fj.a((byte) 114, hb.field_n, rb.field_c, dc.field_c, l.field_h);
                    if (ri.field_a) {
                      break L25;
                    } else {
                      if (jg.field_d != null) {
                        break L25;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L26: {
                    stackOut_114_0 = 2274;
                    stackOut_114_1 = jg.field_d;
                    stackIn_116_0 = stackOut_114_0;
                    stackIn_116_1 = stackOut_114_1;
                    stackIn_115_0 = stackOut_114_0;
                    stackIn_115_1 = stackOut_114_1;
                    if (ri.field_a) {
                      stackOut_116_0 = stackIn_116_0;
                      stackOut_116_1 = (String) (Object) stackIn_116_1;
                      stackOut_116_2 = 0;
                      stackIn_117_0 = stackOut_116_0;
                      stackIn_117_1 = stackOut_116_1;
                      stackIn_117_2 = stackOut_116_2;
                      break L26;
                    } else {
                      stackOut_115_0 = stackIn_115_0;
                      stackOut_115_1 = (String) (Object) stackIn_115_1;
                      stackOut_115_2 = 1;
                      stackIn_117_0 = stackOut_115_0;
                      stackIn_117_1 = stackOut_115_1;
                      stackIn_117_2 = stackOut_115_2;
                      break L26;
                    }
                  }
                  L27: {
                    stackOut_117_0 = stackIn_117_0;
                    stackOut_117_1 = (String) (Object) stackIn_117_1;
                    stackOut_117_2 = stackIn_117_2;
                    stackIn_119_0 = stackOut_117_0;
                    stackIn_119_1 = stackOut_117_1;
                    stackIn_119_2 = stackOut_117_2;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    stackIn_118_2 = stackOut_117_2;
                    if (ri.field_a) {
                      stackOut_119_0 = stackIn_119_0;
                      stackOut_119_1 = (String) (Object) stackIn_119_1;
                      stackOut_119_2 = stackIn_119_2;
                      stackOut_119_3 = 0;
                      stackIn_120_0 = stackOut_119_0;
                      stackIn_120_1 = stackOut_119_1;
                      stackIn_120_2 = stackOut_119_2;
                      stackIn_120_3 = stackOut_119_3;
                      break L27;
                    } else {
                      stackOut_118_0 = stackIn_118_0;
                      stackOut_118_1 = (String) (Object) stackIn_118_1;
                      stackOut_118_2 = stackIn_118_2;
                      stackOut_118_3 = 1;
                      stackIn_120_0 = stackOut_118_0;
                      stackIn_120_1 = stackOut_118_1;
                      stackIn_120_2 = stackOut_118_2;
                      stackIn_120_3 = stackOut_118_3;
                      break L27;
                    }
                  }
                  og.a(stackIn_120_0, stackIn_120_1, stackIn_120_2 != 0, stackIn_120_3 != 0);
                  break L24;
                }
                L28: {
                  if (p.field_m) {
                    hk.e(83);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (null != bh.field_a) {
                    break L29;
                  } else {
                    bh.field_a = df.b((byte) 72);
                    hc.field_R = fe.b(110);
                    break L29;
                  }
                }
                bk.a(hb.field_n, hc.field_R, 111, bh.field_a);
                hb.field_n = null;
                dc.field_c = null;
                l.field_h = null;
                fd.a((java.applet.Applet) this, -82);
                ih.b(-69);
                mi.field_C = 10;
                break L23;
              }
            }
          } else {
            break L23;
          }
        }
        L30: {
          if (10 == mi.field_C) {
            L31: {
              if (va.field_a == 0) {
                break L31;
              } else {
                ak.field_b = kk.a(ah.field_a, (byte) -62);
                break L31;
              }
            }
            mi.field_C = 11;
            break L30;
          } else {
            break L30;
          }
        }
        L32: {
          if ((mi.field_C ^ -1) != -12) {
            break L32;
          } else {
            L33: {
              if (null == ak.field_b) {
                break L33;
              } else {
                L34: {
                  if (!ak.field_b.a(0)) {
                    break L34;
                  } else {
                    if (!ak.field_b.b(true)) {
                      break L34;
                    } else {
                      break L33;
                    }
                  }
                }
                lc.a(si.a(ri.field_c, 2147483647, vc.field_g, ak.field_b), -2, 0.0f);
                break L32;
              }
            }
            cf.field_k = true;
            mi.field_C = 12;
            break L32;
          }
        }
        if (param1 != 19660) {
          return;
        } else {
          L35: {
            if (-13 == (mi.field_C ^ -1)) {
              if (!cf.field_k) {
                mi.field_C = 13;
                break L35;
              } else {
                break L35;
              }
            } else {
              break L35;
            }
          }
          L36: {
            if (mi.field_C != 13) {
              break L36;
            } else {
              L37: {
                var3 = 1;
                if (null == b.field_b) {
                  break L37;
                } else {
                  L38: {
                    if (!b.field_b.a(true)) {
                      stackOut_149_0 = 0;
                      stackIn_150_0 = stackOut_149_0;
                      break L38;
                    } else {
                      stackOut_148_0 = 1;
                      stackIn_150_0 = stackOut_148_0;
                      break L38;
                    }
                  }
                  var3 = stackIn_150_0;
                  lc.a(b.field_b.field_e, -2, b.field_b.field_j);
                  break L37;
                }
              }
              if (var3 != 0) {
                mi.field_C = 20;
                break L36;
              } else {
                break L36;
              }
            }
          }
          L39: {
            if (param0) {
              break L39;
            } else {
              if (ab.field_a) {
                nb.a(-2, f.field_kb);
                ((wf) this).b(true);
                sl.a(f.field_kb, 57);
                break L39;
              } else {
                break L39;
              }
            }
          }
          L40: {
            if (wj.field_G[8]) {
              ji.f(-102);
              break L40;
            } else {
              break L40;
            }
          }
          return;
        }
    }

    final void h(int param0) {
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
          var3 = Geoblox.field_C;
          if (!fj.f(-31456)) {
            if (-11 < mi.field_C) {
              break L0;
            } else {
              if (!wj.f(7426)) {
                td.g((byte) 88);
                break L0;
              } else {
                if (-1 != hj.field_a) {
                  oj.a(vc.field_i, (byte) -96);
                  break L0;
                } else {
                  int discarded$237 = this.a(false, false, -1);
                  break L0;
                }
              }
            }
          } else {
            L1: {
              stackOut_1_0 = this;
              stackOut_1_1 = 0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (vl.field_n == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            int discarded$238 = this.a(stackIn_4_1 != 0, stackIn_4_2 != 0, -1);
            break L0;
          }
        }
        L2: {
          if (param0 >= 104) {
            break L2;
          } else {
            this.f(80);
            break L2;
          }
        }
    }

    public static void g(int param0) {
        field_o = null;
        field_q = null;
        if (param0 != 30344) {
            int[] discarded$0 = wf.j(-29);
        }
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            qc var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Geoblox.field_C;
                        var4 = gk.a(va.field_a, vc.field_i, param1, (byte) -117);
                        if (param2 == (var4 ^ -1)) {
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
                        if ((var4 ^ -1) != -2) {
                            statePc = 10;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = qc.a(qh.i(param2 ^ -26), pf.h((byte) -42), -121);
                        if (var5_int != -1) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        kb.a(var5_int, 6568, si.field_i, kh.field_a);
                        kh.field_a = null;
                        si.field_i = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = vf.a((byte) 111);
                        if (var11 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        mk.a(param2 ^ 110, var11.booleanValue());
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (var4 == 2) {
                            statePc = 12;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var5_int = uf.a((byte) -94, sa.a(true), qj.b((byte) 81), ((wf) this).field_r, vh.f(100), al.b(0), cg.a((byte) 27));
                        if ((var5_int ^ -1) == 0) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        gj.a(kh.field_a, var5_int, (byte) 30, si.field_i);
                        kh.field_a = null;
                        si.field_i = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var4 == 3) {
                            statePc = 16;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (-1 == ib.field_e) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (-1 != (ib.field_e ^ -1)) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ib.field_e = -1;
                        j.e(-21754);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (!param0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        ii.field_e = false;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 22: {
                        var5_int = ri.a(false, sa.a(true), ((wf) this).field_r, ((wf) this).field_v, al.b(param2 ^ -1), param2 ^ -1);
                        if ((var5_int ^ -1) == 0) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (var5_int == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        q.a((byte) 124, var5_int, kh.field_a);
                        kh.field_a = null;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        vi.field_H = oa.field_c;
                        gi.b(-12618);
                        hl.field_G = false;
                        hj.field_a = 10;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        if ((var4 ^ -1) != -5) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (!rb.field_c) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        ba.a((byte) 116, k.c(param2 ^ -122));
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        hl.field_G = true;
                        hj.field_a = 10;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (5 == var4) {
                            statePc = 32;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        gf.a(k.c(120), 62);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (-7 != (var4 ^ -1)) {
                            statePc = 37;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (kf.field_e) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        hj.field_a = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if (var4 != -8) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        je.a((byte) 114, k.c(107));
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (-9 == var4) {
                            statePc = 41;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        ba.a((byte) 116, k.c(119));
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (9 == var4) {
                            statePc = 44;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        tl.a(k.c(115), (byte) -91);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (var4 == -11) {
                            statePc = 47;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        fj.field_q.a(17, (byte) -21);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (-12 == var4) {
                            statePc = 50;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        h.a(k.c(110), false);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (var4 == 12) {
                            statePc = 53;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        eb.a(k.c(121), (byte) 117, gf.a(param2 ^ -241));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (-14 != (var4 ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        try {
                            if (null == mk.field_n) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            mk.field_n = new wg(ka.field_i, new java.net.URL(((wf) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (!mk.field_n.a((byte) 45)) {
                                statePc = 65;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var12 = mk.field_n.b((byte) 91);
                            if (var12 == null) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var7 = bc.a(-46, var12.field_j, 0, var12.field_f);
                            wd.a((byte) 69, var7);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var9 = null;
                            wd.a((byte) 69, (String) null);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            mk.field_n = null;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        var5 = (Exception) (Object) caughtException;
                        gi.a((Throwable) (Object) var5, "S1", (byte) 125);
                        var10 = null;
                        wd.a((byte) 69, (String) null);
                        mk.field_n = null;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (var4 != 15) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        hj.field_a = 10;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (16 == var4) {
                            statePc = 69;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        return 1;
                    }
                    case 70: {
                        if (var4 != 17) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        return 2;
                    }
                    case 72: {
                        return 0;
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

    private final void e(byte param0) {
        wj.field_G[4] = true;
        int var2 = 10 % ((-61 - param0) / 32);
    }

    private final void a(int param0, String param1, int param2, byte param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (((wf) this).a(false)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        ((wf) this).field_n = ((wf) this).getCodeBase().getHost();
                        var6_ref = ((wf) this).field_n.toLowerCase();
                        stackOut_2_0 = this;
                        stackIn_5_0 = stackOut_2_0;
                        stackIn_3_0 = stackOut_2_0;
                        if (var6_ref.equals((Object) (Object) "jagex.com")) {
                            statePc = 5;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (!var6_ref.endsWith(".jagex.com")) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackOut_5_1 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((wf) this).field_v = stackIn_7_1 != 0;
                        ((wf) this).field_l = Integer.parseInt(((wf) this).getParameter("gameport1"));
                        ((wf) this).field_w = Integer.parseInt(((wf) this).getParameter("gameport2"));
                        var7 = ((wf) this).getParameter("servernum");
                        if (var7 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((wf) this).field_x = Integer.parseInt(var7);
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((wf) this).field_s = Integer.parseInt(((wf) this).getParameter("gamecrc"));
                        ((wf) this).field_k = Long.parseLong(((wf) this).getParameter("instanceid"));
                        ((wf) this).field_m = ((wf) this).getParameter("member").equals((Object) (Object) "yes");
                        var8 = ((wf) this).getParameter("lang");
                        if (var8 == null) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((wf) this).field_u = Integer.parseInt(var8);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (-6 < (((wf) this).field_u ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((wf) this).field_u = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var9 = ((wf) this).getParameter("affid");
                        if (var9 != null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((wf) this).field_r = Integer.parseInt(var9);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        p.field_m = Boolean.valueOf(((wf) this).getParameter("simplemode")).booleanValue();
                        ((wf) this).a(32, -14948, ((wf) this).field_s, param0, param4, param1, param2);
                        if (param3 == 81) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((wf) this).a((byte) -103, -111, -55, -20, 80, false, -81, 86);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var6 = (Exception) (Object) caughtException;
                    var10 = null;
                    gi.a((Throwable) (Object) var6, (String) null, (byte) 125);
                    ((wf) this).a((byte) 79, "crash");
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int[] j(int param0) {
        if (param0 < 81) {
            field_p = -43;
        }
        return new int[8];
    }

    final void l(int param0) {
        int var2 = 0;
        vd var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (param0 >= 119) {
            break L0;
          } else {
            ((wf) this).field_m = true;
            break L0;
          }
        }
        L1: {
          var2 = me.field_l;
          if (var2 >= 64) {
            break L1;
          } else {
            if (!wj.field_G[var2]) {
              break L1;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if ((var2 ^ -1) == -2) {
                    ec.a(-1073741824);
                    break L2;
                  } else {
                    if (var2 == 2) {
                      cm.c(-24839);
                      break L2;
                    } else {
                      if (3 == var2) {
                        ud.b(119);
                        break L2;
                      } else {
                        if ((var2 ^ -1) != -5) {
                          if (5 == var2) {
                            al.a(26146);
                            break L2;
                          } else {
                            if ((var2 ^ -1) == -7) {
                              bh.a(2);
                              break L2;
                            } else {
                              if (var2 != 7) {
                                if (8 == var2) {
                                  pg.a(-4, ka.field_i, p.field_k, (qc) (Object) eh.field_d);
                                  break L2;
                                } else {
                                  if (var2 == -17) {
                                    rc.b(1);
                                    break L2;
                                  } else {
                                    L3: {
                                      if (11 == var2) {
                                        break L3;
                                      } else {
                                        if (12 == var2) {
                                          break L3;
                                        } else {
                                          if (-14 != var2) {
                                            if (17 == var2) {
                                              this.g((byte) 12);
                                              break L2;
                                            } else {
                                              if (var2 == 18) {
                                                dl.a(11560);
                                                break L2;
                                              } else {
                                                gi.a((Throwable) null, "MGS1: " + og.e(55), (byte) 125);
                                                jl.a((byte) -122);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            lc.a((byte) 104);
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (-13 != (var2 ^ -1)) {
                                        stackOut_29_0 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        break L4;
                                      } else {
                                        stackOut_28_0 = 1;
                                        stackIn_30_0 = stackOut_28_0;
                                        break L4;
                                      }
                                    }
                                    var3 = bk.a(stackIn_30_0 != 0, 128);
                                    s.a(var3, 0);
                                    break L2;
                                  }
                                }
                              } else {
                                this.f(-11);
                                break L2;
                              }
                            }
                          }
                        } else {
                          pf.f(-103);
                          break L2;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
        gi.a((Throwable) null, "MGS2: " + og.e(55), (byte) 125);
        jl.a((byte) -118);
    }

    private final void g(byte param0) {
        int var2 = eh.field_d.c((byte) 34);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        if (param0 != 12) {
            ((wf) this).h(106);
        }
        int var4 = -1 + p.field_k;
        byte[] var5 = new byte[var4];
        eh.field_d.c(96, 0, var5, var4);
        pa.a(ag.a(1, var5), (byte) -128, var3 != 0, k.c(112));
    }

    private final void i(int param0) {
        wj.field_G[2] = true;
        if (param0 != 16072) {
            wf.g(124);
        }
    }

    private final void d(boolean param0) {
        wj.field_G[5] = param0;
    }

    private final void f(byte param0) {
        if (param0 != 32) {
            ((wf) this).field_u = 72;
        }
        wj.field_G[1] = true;
    }

    final void h(byte param0) {
        ((wf) this).field_t = true;
        int var2 = -21 / ((-82 - param0) / 37);
    }

    final int a(boolean param0, int param1) {
        if (param1 != -17978) {
            this.e(-61);
        }
        return this.a(true, param0, -1);
    }

    protected wf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Fullscreen";
    }
}
