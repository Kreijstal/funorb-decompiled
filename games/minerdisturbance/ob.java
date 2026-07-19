/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob extends m {
    private int field_o;
    private boolean field_x;
    private int field_t;
    static ea[] field_w;
    private int field_r;
    String field_s;
    static bj field_q;
    static String[][] field_n;
    private int field_B;
    private int field_A;
    static String field_v;
    private boolean field_p;
    private boolean field_z;
    private long field_u;
    private int field_y;

    private final void m(int param0) {
        mk.field_b[2] = true;
        if (param0 != -9859) {
            this.field_s = (String) null;
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.b(false, false);
        if (param0) {
            this.i(1);
        }
        if (param2) {
            this.m(-9859);
        }
        int var6 = 107 / ((param1 - 27) / 46);
        if (!(!param4)) {
            this.j(22810);
        }
        if (!(!param3)) {
            this.p(110);
        }
    }

    public static void o(int param0) {
        field_w = null;
        field_q = null;
        field_v = null;
        field_n = (String[][]) null;
        if (param0 < 48) {
            field_q = (bj) null;
        }
    }

    final int c(byte param0) {
        int discarded$2 = 0;
        int var2 = 0;
        pf var3 = null;
        L0: {
          L1: {
            var2 = this.d((byte) 86);
            if (var2 == 0) {
              break L1;
            } else {
              if ((var2 ^ -1) == -2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (!mk.field_b[1]) {
              break L2;
            } else {
              kh.a(-1, 2);
              break L2;
            }
          }
          L3: {
            if (!mk.field_b[2]) {
              break L3;
            } else {
              nb.a((byte) -52, 3);
              break L3;
            }
          }
          L4: {
            if (!mk.field_b[3]) {
              break L4;
            } else {
              qd.a(4, (byte) -125);
              break L4;
            }
          }
          L5: {
            if (mk.field_b[4]) {
              gh.a(5, 21121);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (!mk.field_b[5]) {
              break L6;
            } else {
              gi.a(85, 6);
              break L6;
            }
          }
          L7: {
            if (!mk.field_b[6]) {
              break L7;
            } else {
              g.a((byte) -69, 7);
              break L7;
            }
          }
          if (!mk.field_b[8]) {
            break L0;
          } else {
            hd.a(-124);
            break L0;
          }
        }
        L8: {
          if (param0 <= -103) {
            break L8;
          } else {
            var3 = (pf) null;
            discarded$2 = ob.a((byte) -21, (pf) null, (pf) null);
            break L8;
          }
        }
        return var2;
    }

    private final void c(boolean param0) {
        ge.field_g[2] = -2;
        ge.field_g[4] = -1;
        ge.field_g[5] = -1;
        ge.field_g[12] = -1;
        ge.field_g[18] = 1;
        ge.field_g[1] = 16;
        ge.field_g[7] = -1;
        ge.field_g[16] = -1;
        ge.field_g[11] = -1;
        ge.field_g[3] = -1;
        ge.field_g[6] = -2;
        ge.field_g[8] = -2;
        ge.field_g[13] = -1;
        ge.field_g[9] = -1;
        ge.field_g[17] = -1;
        if (param0) {
            this.field_z = false;
        }
        ge.field_g[10] = -1;
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        String stackIn_98_2 = null;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        String stackIn_99_2 = null;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        String stackIn_100_2 = null;
        int stackIn_100_3 = 0;
        int stackIn_130_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        String stackOut_97_2 = null;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        String stackOut_99_2 = null;
        int stackOut_99_3 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        String stackOut_98_2 = null;
        int stackOut_98_3 = 0;
        int stackOut_129_0 = 0;
        int stackOut_128_0 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          if (ij.field_o == null) {
            break L0;
          } else {
            L1: {
              if (kf.field_d != null) {
                break L1;
              } else {
                var6 = da.b(24255);
                var4 = var6.getSize();
                ij.field_o.a(false, var4.height, var4.width);
                break L1;
              }
            }
            ij.field_o.c(565);
            break L0;
          }
        }
        L2: {
          mh.b(114);
          k.f(10525);
          if (hl.b((byte) 120)) {
            break L2;
          } else {
            if (fh.field_b == 11) {
              break L2;
            } else {
              hm.d((byte) 22);
              break L2;
            }
          }
        }
        L3: {
          if (null == pf.field_e) {
            break L3;
          } else {
            ki.field_n = pf.field_e.a((byte) -124);
            break L3;
          }
        }
        L4: {
          if (!gd.b((byte) -110)) {
            break L4;
          } else {
            L5: {
              var3 = pl.b((byte) -116) * 1200;
              if (this.field_z) {
                break L5;
              } else {
                if ((mk.b(24) ^ -1) >= (var3 ^ -1)) {
                  break L4;
                } else {
                  if (var3 >= u.b(-4440)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_z = false;
            si.a(-75);
            eb.a((byte) -96);
            da.a(true, le.field_a, 2);
            oj.c((byte) -62);
            nd.field_e = true;
            j.field_f = 15000L + sf.a((byte) -58);
            break L4;
          }
        }
        if (param1 == 18808) {
          L6: {
            L7: {
              if (0 == (tb.field_f ^ -1)) {
                break L7;
              } else {
                if (-1 != (tb.field_f ^ -1)) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              if (0 != (tb.field_f ^ -1)) {
                stackOut_22_0 = 0;
                stackIn_23_0 = stackOut_22_0;
                break L8;
              } else {
                stackOut_21_0 = 1;
                stackIn_23_0 = stackOut_21_0;
                break L8;
              }
            }
            L9: {
              var3 = stackIn_23_0;
              tb.field_f = si.a((byte) -115);
              if (var3 == 0) {
                break L9;
              } else {
                if (0 != tb.field_f) {
                  break L9;
                } else {
                  if (fh.field_b != 11) {
                    break L9;
                  } else {
                    if (!ci.a(82)) {
                      mc.c(-78);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            if (0 == (tb.field_f ^ -1)) {
              break L6;
            } else {
              if (0 == tb.field_f) {
                break L6;
              } else {
                j.field_f = sf.a((byte) -52) + 15000L;
                break L6;
              }
            }
          }
          L10: {
            if ((tb.field_f ^ -1) == 0) {
              break L10;
            } else {
              if (tb.field_f == 0) {
                break L10;
              } else {
                if (10 <= af.field_u) {
                  if ((fh.field_b ^ -1) > -11) {
                    break L10;
                  } else {
                    L11: {
                      eb.a((byte) -110);
                      if (tb.field_f == 3) {
                        da.a(true, wf.field_N, 256);
                        break L11;
                      } else {
                        if ((tb.field_f ^ -1) == -5) {
                          da.a(true, kc.field_e, 256);
                          break L11;
                        } else {
                          if ((tb.field_f ^ -1) == -3) {
                            da.a(true, ng.field_k, 256);
                            break L11;
                          } else {
                            if (tb.field_f != 5) {
                              da.a(true, kj.field_b, 256);
                              break L11;
                            } else {
                              da.a(true, rd.field_e, 5);
                              break L11;
                            }
                          }
                        }
                      }
                    }
                    nd.field_e = true;
                    break L10;
                  }
                } else {
                  if (-4 == (tb.field_f ^ -1)) {
                    this.a((byte) -18, "js5crc");
                    break L10;
                  } else {
                    if (tb.field_f != 4) {
                      if (tb.field_f == 2) {
                        this.a((byte) 120, "js5connect_full");
                        break L10;
                      } else {
                        if (-6 == (tb.field_f ^ -1)) {
                          this.a((byte) -125, "outofdate");
                          break L10;
                        } else {
                          this.a((byte) -128, "js5connect");
                          break L10;
                        }
                      }
                    } else {
                      this.a((byte) -29, "js5io");
                      break L10;
                    }
                  }
                }
              }
            }
          }
          L12: {
            L13: {
              L14: {
                if (-1 == tb.field_f) {
                  break L14;
                } else {
                  if ((tb.field_f ^ -1) != -1) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              if (!ci.a(106)) {
                break L12;
              } else {
                break L13;
              }
            }
            if (sf.a((byte) -15) < j.field_f) {
              break L12;
            } else {
              nd.field_e = false;
              if (0 == (tb.field_f ^ -1)) {
                break L12;
              } else {
                if (-1 == (tb.field_f ^ -1)) {
                  break L12;
                } else {
                  tb.field_f = -1;
                  ql.a(-78);
                  break L12;
                }
              }
            }
          }
          L15: {
            if ((tb.field_f ^ -1) != -1) {
              break L15;
            } else {
              if (ci.a(param1 + -18752)) {
                break L15;
              } else {
                ul.field_a = false;
                break L15;
              }
            }
          }
          L16: {
            if (-1 != (af.field_u ^ -1)) {
              break L16;
            } else {
              if (!sn.a((byte) 107)) {
                break L16;
              } else {
                af.field_u = 1;
                break L16;
              }
            }
          }
          L17: {
            if ((af.field_u ^ -1) == -2) {
              L18: {
                if (-1 != (kb.field_c ^ -1)) {
                  sb.field_r = lb.a(1, s.field_Q);
                  break L18;
                } else {
                  break L18;
                }
              }
              hj.field_i = eb.a(true, fn.field_p, false, 1, true);
              pb.field_r = eb.a(true, se.field_N, false, 1, true);
              oh.field_C = eb.a(true, da.field_c, false, 1, true);
              s.field_P = pb.field_r;
              af.field_u = 2;
              field_q = hj.field_i;
              break L17;
            } else {
              break L17;
            }
          }
          L19: {
            if ((af.field_u ^ -1) != -3) {
              break L19;
            } else {
              L20: {
                if (null == sb.field_r) {
                  break L20;
                } else {
                  if (!sb.field_r.a((byte) 83)) {
                    break L20;
                  } else {
                    if (sb.field_r.b(false, "")) {
                      if (sb.field_r.a(false, "")) {
                        li.a(9259, sb.field_r);
                        sb.field_r = null;
                        wf.p(4462);
                        break L20;
                      } else {
                        break L20;
                      }
                    } else {
                      sb.field_r = null;
                      break L20;
                    }
                  }
                }
              }
              if (null == sb.field_r) {
                af.field_u = 3;
                break L19;
              } else {
                break L19;
              }
            }
          }
          L21: {
            if (3 != af.field_u) {
              break L21;
            } else {
              if (!eg.a(pb.field_r, 4, hj.field_i, oh.field_C)) {
                break L21;
              } else {
                if (eb.a(oh.field_C, (byte) 124)) {
                  L22: {
                    L23: {
                      bh.h((byte) 123);
                      em.g(-1719110238);
                      bj.field_c = ll.field_e;
                      jb.field_q = false;
                      mj.a(v.field_e, hj.field_i, 43, oh.field_C, pb.field_r);
                      if (nc.field_e) {
                        break L23;
                      } else {
                        if (null == bm.field_q) {
                          break L22;
                        } else {
                          break L23;
                        }
                      }
                    }
                    L24: {
                      stackOut_94_0 = param1 + 1123;
                      stackIn_96_0 = stackOut_94_0;
                      stackIn_95_0 = stackOut_94_0;
                      if (nc.field_e) {
                        stackOut_96_0 = stackIn_96_0;
                        stackOut_96_1 = 0;
                        stackIn_97_0 = stackOut_96_0;
                        stackIn_97_1 = stackOut_96_1;
                        break L24;
                      } else {
                        stackOut_95_0 = stackIn_95_0;
                        stackOut_95_1 = 1;
                        stackIn_97_0 = stackOut_95_0;
                        stackIn_97_1 = stackOut_95_1;
                        break L24;
                      }
                    }
                    L25: {
                      stackOut_97_0 = stackIn_97_0;
                      stackOut_97_1 = stackIn_97_1;
                      stackOut_97_2 = bm.field_q;
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_99_1 = stackOut_97_1;
                      stackIn_99_2 = stackOut_97_2;
                      stackIn_98_0 = stackOut_97_0;
                      stackIn_98_1 = stackOut_97_1;
                      stackIn_98_2 = stackOut_97_2;
                      if (nc.field_e) {
                        stackOut_99_0 = stackIn_99_0;
                        stackOut_99_1 = stackIn_99_1;
                        stackOut_99_2 = (String) ((Object) stackIn_99_2);
                        stackOut_99_3 = 0;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        stackIn_100_2 = stackOut_99_2;
                        stackIn_100_3 = stackOut_99_3;
                        break L25;
                      } else {
                        stackOut_98_0 = stackIn_98_0;
                        stackOut_98_1 = stackIn_98_1;
                        stackOut_98_2 = (String) ((Object) stackIn_98_2);
                        stackOut_98_3 = 1;
                        stackIn_100_0 = stackOut_98_0;
                        stackIn_100_1 = stackOut_98_1;
                        stackIn_100_2 = stackOut_98_2;
                        stackIn_100_3 = stackOut_98_3;
                        break L25;
                      }
                    }
                    bb.a(stackIn_100_0, stackIn_100_1 != 0, stackIn_100_2, stackIn_100_3 != 0);
                    break L22;
                  }
                  L26: {
                    if (!bd.field_d) {
                      break L26;
                    } else {
                      km.a((byte) -69);
                      break L26;
                    }
                  }
                  L27: {
                    if (hj.field_o != null) {
                      break L27;
                    } else {
                      hj.field_o = da.a(param1 + -17950);
                      tm.field_I = hm.f((byte) -67);
                      break L27;
                    }
                  }
                  fi.a((byte) 104, oh.field_C, hj.field_o, tm.field_I);
                  pb.field_r = null;
                  hj.field_i = null;
                  oh.field_C = null;
                  vk.a(true, (java.applet.Applet) (this));
                  wf.p(param1 ^ 22550);
                  af.field_u = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
            }
          }
          L28: {
            if (af.field_u == 10) {
              L29: {
                if ((kb.field_c ^ -1) != -1) {
                  fh.field_c = lb.a(1, mg.field_f);
                  break L29;
                } else {
                  break L29;
                }
              }
              af.field_u = 11;
              break L28;
            } else {
              break L28;
            }
          }
          L30: {
            if ((af.field_u ^ -1) == -12) {
              L31: {
                if (fh.field_c == null) {
                  break L31;
                } else {
                  L32: {
                    if (!fh.field_c.a((byte) 84)) {
                      break L32;
                    } else {
                      if (!fh.field_c.b(-1)) {
                        break L32;
                      } else {
                        break L31;
                      }
                    }
                  }
                  pa.a(true, qn.a(ge.field_d, ic.field_g, false, fh.field_c), 0.0f);
                  break L30;
                }
              }
              oe.field_a = true;
              af.field_u = 12;
              break L30;
            } else {
              break L30;
            }
          }
          L33: {
            if (-13 != (af.field_u ^ -1)) {
              break L33;
            } else {
              if (!oe.field_a) {
                af.field_u = 13;
                break L33;
              } else {
                break L33;
              }
            }
          }
          L34: {
            if ((af.field_u ^ -1) != -14) {
              break L34;
            } else {
              L35: {
                var3 = 1;
                if (null != qg.field_d) {
                  L36: {
                    if (!qg.field_d.a(true)) {
                      stackOut_129_0 = 0;
                      stackIn_130_0 = stackOut_129_0;
                      break L36;
                    } else {
                      stackOut_128_0 = 1;
                      stackIn_130_0 = stackOut_128_0;
                      break L36;
                    }
                  }
                  var3 = stackIn_130_0;
                  pa.a(true, qg.field_d.field_g, qg.field_d.field_c);
                  break L35;
                } else {
                  break L35;
                }
              }
              if (var3 != 0) {
                af.field_u = 20;
                break L34;
              } else {
                break L34;
              }
            }
          }
          L37: {
            if (param0) {
              break L37;
            } else {
              if (!fa.field_a) {
                break L37;
              } else {
                ci.a(ef.field_c, 0);
                this.c(-111);
                ab.a((byte) -13, ef.field_c);
                break L37;
              }
            }
          }
          L38: {
            if (mk.field_b[8]) {
              cm.e(param1 + 5875);
              break L38;
            } else {
              break L38;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void p(int param0) {
        mk.field_b[5] = true;
        if (param0 <= 104) {
            this.a(false, -107, (byte) 111, 87, 84, 120, -94, -19);
        }
    }

    private final int d(byte param0) {
        int var2 = 0;
        if (param0 > 67) {
          if (this.field_i) {
            return -1;
          } else {
            if (ci.a(101)) {
              if (!nd.field_e) {
                var2 = re.a(this.field_A, false, this.field_p, fc.b((byte) 119), true, ii.b((byte) -42));
                if ((var2 ^ -1) != 0) {
                  L0: {
                    if (var2 == 0) {
                      break L0;
                    } else {
                      if (-2 == (var2 ^ -1)) {
                        break L0;
                      } else {
                        L1: {
                          if (!tn.field_M) {
                            this.a((byte) -120, "reconnect");
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        eb.a((byte) -33);
                        da.a(true, nf.field_g, var2);
                        nd.field_e = true;
                        j.field_f = 15000L + sf.a((byte) -89);
                        return var2;
                      }
                    }
                  }
                  L2: {
                    if (11 != fh.field_b) {
                      break L2;
                    } else {
                      if (tb.field_f == 0) {
                        mc.c(-73);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return var2;
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
        } else {
          return -114;
        }
    }

    final void a(String param0, int param1, int param2) {
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
              this.a(param0, param1, 640, 480, param2 ^ 6576);
              if (param2 == -6622) {
                break L1;
              } else {
                this.field_x = false;
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
            stackOut_3_1 = new StringBuilder().append("ob.R(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        mk.field_b[param0] = true;
    }

    private final void j(int param0) {
        if (param0 != 22810) {
            this.field_B = -24;
        }
        mk.field_b[4] = true;
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var7 = null;
        String var7_ref = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        String var11 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var6_int = -94 % ((param4 - 70) / 39);
            try {
              L1: {
                if (!this.a((byte) -50)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_s = this.getCodeBase().getHost();
                      var7_ref = this.field_s.toLowerCase();
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var7_ref.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (!var7_ref.endsWith(".jagex.com")) {
                          stackOut_8_0 = this;
                          stackOut_8_1 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          break L2;
                        } else {
                          stackOut_6_0 = this;
                          stackIn_7_0 = stackOut_6_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L2;
                  }
                  L4: {
                    ((ob) (this)).field_p = stackIn_9_1 != 0;
                    this.field_y = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_o = Integer.parseInt(this.getParameter("gameport2"));
                    var8 = this.getParameter("servernum");
                    if (var8 != null) {
                      this.field_t = Integer.parseInt(var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_u = Long.parseLong(this.getParameter("instanceid"));
                    this.field_x = this.getParameter("member").equals("yes");
                    var9 = this.getParameter("lang");
                    if (var9 != null) {
                      this.field_r = Integer.parseInt(var9);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-6 < (this.field_r ^ -1)) {
                      break L6;
                    } else {
                      this.field_r = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = this.getParameter("affid");
                    if (var10 == null) {
                      break L7;
                    } else {
                      this.field_A = Integer.parseInt(var10);
                      break L7;
                    }
                  }
                  bd.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(param2, param1, this.field_B, 3, param0, param3, 32);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var7 = (Exception) (Object) decompiledCaughtException;
                var11 = (String) null;
                di.a((Throwable) ((Object) var7), 1, (String) null);
                this.a((byte) -125, "crash");
                decompiledRegionSelector0 = 1;
                break L8;
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
          L9: {
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6);
            stackOut_23_1 = new StringBuilder().append("ob.V(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void h(int param0) {
        int var2 = kj.field_a.d((byte) -54);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = rj.field_d - 1;
        byte[] var5 = new byte[var4];
        kj.field_a.a(var5, 113, var4, param0);
        cn.a(bm.c(-98), bh.a(var5, 88), 11050, var3 != 0);
    }

    final static boolean l(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            field_q = (bj) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (ci.field_i == null) {
              break L2;
            } else {
              if (!qd.field_Q.a(param0 ^ -18545)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void b(boolean param0, boolean param1) {
        mk.field_b[3] = true;
        mk.field_b[16] = true;
        mk.field_b[8] = param0;
        mk.field_b[18] = true;
        if (param1) {
            this.field_o = 34;
        }
        mk.field_b[7] = true;
        mk.field_b[17] = true;
        mk.field_b[0] = true;
    }

    final void k(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = MinerDisturbance.field_ab;
        if (bi.a(-11)) {
            discarded$1 = this.a(true, false, kf.field_d != null ? true : false);
        } else {
            if (10 <= af.field_u) {
                if (!fe.j(param0 ^ -94)) {
                    ed.a(127);
                } else {
                    if (fh.field_b != 0) {
                        il.a(ki.field_n, (byte) -109);
                    } else {
                        discarded$2 = this.a(true, false, false);
                    }
                }
            }
        }
        if (param0 != 10) {
            this.b(true, true);
        }
    }

    private final void g(int param0) {
        int discarded$0 = 0;
        String var2 = ca.b((byte) -124);
        tk.a(var2, bm.c(-116), (byte) -15);
        if (param0 != -18) {
            discarded$0 = this.c((byte) 99);
        }
    }

    final void a(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        if (param2 != -121) {
            this.k(-25);
        }
        this.setBackground(java.awt.Color.black);
        kb.field_c = this.field_r;
        od.a(122, kb.field_c);
        qg.a(qa.field_a, this.field_t, this.field_B, param1, this.field_y, this.field_u, this.field_o, this.field_s, this.field_x, 5000, true, param0, 5000, kb.field_c);
        q.a(this.field_t, qa.field_a, kb.field_c, this.field_s, this.field_o, param1, 20, this.field_B, this.field_y);
        km.b((byte) 109);
        pf.field_e = oh.c((byte) 119);
        ab.a((byte) -13, ef.field_c);
        se.field_N = param5;
        da.field_c = param7;
        fn.field_p = param4;
        mg.field_f = param6;
        s.field_Q = param3;
        this.c(false);
        oe.a(true);
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            Boolean var10 = null;
            sb var11 = null;
            String stackIn_62_0 = null;
            String stackIn_63_0 = null;
            String stackIn_64_0 = null;
            int stackIn_64_1 = 0;
            Object stackIn_68_0 = null;
            Object stackIn_69_0 = null;
            Object stackIn_70_0 = null;
            int stackIn_70_1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_61_0 = null;
            String stackOut_63_0 = null;
            int stackOut_63_1 = 0;
            String stackOut_62_0 = null;
            int stackOut_62_1 = 0;
            Object stackOut_67_0 = null;
            Object stackOut_69_0 = null;
            int stackOut_69_1 = 0;
            Object stackOut_68_0 = null;
            int stackOut_68_1 = 0;
            var8 = MinerDisturbance.field_ab;
            var4 = bj.a(ki.field_n, kb.field_c, param2, 65);
            if ((var4 ^ -1) != -1) {
              L0: {
                if ((var4 ^ -1) != -2) {
                  break L0;
                } else {
                  L1: {
                    var5_int = ob.a((byte) 112, mf.a(15), fe.f(0));
                    if (-1 == var5_int) {
                      break L1;
                    } else {
                      vj.a(-21614, nf.field_g, var5_int, vh.field_i);
                      nf.field_g = null;
                      vh.field_i = null;
                      break L1;
                    }
                  }
                  var10 = aj.a(103);
                  if (var10 != null) {
                    jc.a((byte) 17, var10.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (-3 != (var4 ^ -1)) {
                  break L2;
                } else {
                  var5_int = dn.a(lm.n(-124), fa.a(true), mb.b((byte) -95), fc.b((byte) 123), ii.b((byte) 63), this.field_A, -14543);
                  if (-1 != var5_int) {
                    ee.a(nf.field_g, vh.field_i, (byte) -98, var5_int);
                    nf.field_g = null;
                    vh.field_i = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (-4 != (var4 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if ((tb.field_f ^ -1) == 0) {
                      break L4;
                    } else {
                      if (-1 != (tb.field_f ^ -1)) {
                        tb.field_f = -1;
                        ql.a(-93);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param1) {
                    nd.field_e = false;
                    break L3;
                  } else {
                    var5_int = re.a(this.field_A, false, this.field_p, fc.b((byte) 127), false, ii.b((byte) 126));
                    if (0 == (var5_int ^ -1)) {
                      break L3;
                    } else {
                      if ((var5_int ^ -1) != -1) {
                        da.a(true, nf.field_g, var5_int);
                        nf.field_g = null;
                        break L3;
                      } else {
                        jn.field_n = ne.field_Q;
                        mc.c(-100);
                        qc.field_b = false;
                        fh.field_b = 10;
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                if (-5 != (var4 ^ -1)) {
                  break L5;
                } else {
                  if (!v.field_e) {
                    qc.field_b = true;
                    fh.field_b = 10;
                    break L5;
                  } else {
                    kn.a(13569, bm.c(-89));
                    break L5;
                  }
                }
              }
              L6: {
                if (5 == var4) {
                  uf.a(13, bm.c(-84));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if ((var4 ^ -1) == -7) {
                  if (jb.field_q) {
                    fh.field_b = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (-8 == (var4 ^ -1)) {
                  tg.a((byte) -114, bm.c(-112));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (-9 == (var4 ^ -1)) {
                  kn.a(13569, bm.c(-112));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (-10 != (var4 ^ -1)) {
                  break L10;
                } else {
                  dk.a(bm.c(-77), (byte) -27);
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  sn.field_c.d((byte) -51, 17);
                  break L11;
                }
              }
              L12: {
                if (-12 != (var4 ^ -1)) {
                  break L12;
                } else {
                  ne.a(bm.c(-108), 30433);
                  break L12;
                }
              }
              if (param0) {
                L13: {
                  if (12 == var4) {
                    jk.a(bm.c(-86), 68, kn.a(0));
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (13 == var4) {
                    try {
                      L15: {
                        L16: {
                          if (null == hf.field_u) {
                            hf.field_u = new lf(qa.field_a, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (hf.field_u.a((byte) 105)) {
                            L18: {
                              var11 = hf.field_u.a(0);
                              if (var11 != null) {
                                L19: {
                                  var7 = ph.a((byte) 31, var11.field_o, var11.field_u, 0);
                                  stackOut_61_0 = (String) (var7);
                                  stackIn_63_0 = stackOut_61_0;
                                  stackIn_62_0 = stackOut_61_0;
                                  if (param0) {
                                    stackOut_63_0 = (String) ((Object) stackIn_63_0);
                                    stackOut_63_1 = 0;
                                    stackIn_64_0 = stackOut_63_0;
                                    stackIn_64_1 = stackOut_63_1;
                                    break L19;
                                  } else {
                                    stackOut_62_0 = (String) ((Object) stackIn_62_0);
                                    stackOut_62_1 = 1;
                                    stackIn_64_0 = stackOut_62_0;
                                    stackIn_64_1 = stackOut_62_1;
                                    break L19;
                                  }
                                }
                                fm.a(stackIn_64_0, stackIn_64_1 != 0);
                                break L18;
                              } else {
                                var9 = (String) null;
                                fm.a((String) null, false);
                                break L18;
                              }
                            }
                            hf.field_u = null;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        break L15;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L20: {
                        L21: {
                          var5 = (Exception) (Object) decompiledCaughtException;
                          di.a((Throwable) ((Object) var5), 1, "S1");
                          stackOut_67_0 = null;
                          stackIn_69_0 = stackOut_67_0;
                          stackIn_68_0 = stackOut_67_0;
                          if (param0) {
                            stackOut_69_0 = stackIn_69_0;
                            stackOut_69_1 = 0;
                            stackIn_70_0 = stackOut_69_0;
                            stackIn_70_1 = stackOut_69_1;
                            break L21;
                          } else {
                            stackOut_68_0 = stackIn_68_0;
                            stackOut_68_1 = 1;
                            stackIn_70_0 = stackOut_68_0;
                            stackIn_70_1 = stackOut_68_1;
                            break L21;
                          }
                        }
                        fm.a((String) ((Object) stackIn_70_0), stackIn_70_1 != 0);
                        hf.field_u = null;
                        break L20;
                      }
                    }
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L22: {
                  if ((var4 ^ -1) == -16) {
                    fh.field_b = 10;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                if (16 == var4) {
                  return 1;
                } else {
                  if ((var4 ^ -1) != -18) {
                    return 0;
                  } else {
                    return 2;
                  }
                }
              } else {
                return 19;
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

    final void n(int param0) {
        int var2 = 0;
        id var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var4 = MinerDisturbance.field_ab;
          var2 = oj.field_K;
          if (param0 >= 21) {
            break L0;
          } else {
            this.g(49);
            break L0;
          }
        }
        L1: {
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (mk.field_b[var2]) {
              if (-1 == (var2 ^ -1)) {
                return;
              } else {
                L2: {
                  if (var2 == 1) {
                    dk.a(22288);
                    break L2;
                  } else {
                    if (var2 == 2) {
                      fn.a(0);
                      break L2;
                    } else {
                      if (3 != var2) {
                        if (-5 == (var2 ^ -1)) {
                          em.d((byte) -67);
                          break L2;
                        } else {
                          if ((var2 ^ -1) != -6) {
                            if (-7 == (var2 ^ -1)) {
                              jn.a((byte) -105);
                              break L2;
                            } else {
                              if (-8 != (var2 ^ -1)) {
                                if (var2 != 8) {
                                  if (16 == var2) {
                                    hn.a((byte) -125);
                                    break L2;
                                  } else {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (12 == var2) {
                                          break L3;
                                        } else {
                                          if (var2 == 13) {
                                            cb.c(false);
                                            break L2;
                                          } else {
                                            if (17 == var2) {
                                              this.h(0);
                                              break L2;
                                            } else {
                                              if (18 != var2) {
                                                di.a((Throwable) null, 1, "MGS1: " + hj.a((byte) 86));
                                                si.a(-106);
                                                break L2;
                                              } else {
                                                ri.a(true);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (12 != var2) {
                                        stackOut_31_0 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        break L4;
                                      } else {
                                        stackOut_30_0 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        break L4;
                                      }
                                    }
                                    var3 = tb.a(stackIn_32_0 != 0, -2);
                                    kn.a(var3, (byte) -51);
                                    break L2;
                                  }
                                } else {
                                  ff.a(qa.field_a, kj.field_a, rj.field_d, true);
                                  break L2;
                                }
                              } else {
                                this.g(-18);
                                break L2;
                              }
                            }
                          } else {
                            h.b(115);
                            break L2;
                          }
                        }
                      } else {
                        ki.a(-15003);
                        break L2;
                      }
                    }
                  }
                }
                return;
              }
            } else {
              break L1;
            }
          }
        }
        di.a((Throwable) null, 1, "MGS2: " + hj.a((byte) 57));
        si.a(-74);
    }

    private final static int a(byte param0, pf param1, pf param2) {
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 112) {
                break L1;
              } else {
                field_v = (String) null;
                break L1;
              }
            }
            var4 = (String) null;
            stackOut_2_0 = j.a(0, -45, false, 0, param1, (String) null, param2);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ob.G(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final int c(boolean param0, boolean param1) {
        if (!param1) {
            this.field_r = -75;
        }
        return this.a(true, true, param0);
    }

    protected ob() {
    }

    static {
        field_v = "Breathe toxic gas as if it were air; the essential purchase for any effluvium miner. Without this, you'll start to choke in seconds.";
        field_n = new String[][]{null, new String[]{"What a wonderful example of the common killer pinniped. On dry land, it's quite slow, but once in the water it's an awe-inspiring predator. It remains vulnerable to explosions, being frozen and being crushed by ice."}};
    }
}
