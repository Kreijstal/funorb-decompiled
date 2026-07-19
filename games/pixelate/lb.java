/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lb extends tn {
    private boolean field_A;
    private long field_s;
    private int field_u;
    static wm field_r;
    String field_w;
    private int field_y;
    private int field_z;
    private boolean field_v;
    private int field_B;
    private int field_t;
    static wm field_C;
    private boolean field_F;
    private int field_q;
    static int field_D;
    static kn field_x;

    final int a(boolean param0, byte param1) {
        if (param1 != 96) {
            this.g((byte) 41);
        }
        return this.a(param1 ^ 96, param0, true);
    }

    private final void m(int param0) {
        h.field_P[param0] = true;
    }

    private final void o(int param0) {
        if (param0 < 125) {
            this.i(-53);
        }
        h.field_P[6] = true;
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            we var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Pixelate.field_H ? 1 : 0;
            var4 = qi.a(param0 + 6388, lp.field_i, wo.field_d, param1);
            if (param0 != var4) {
              L0: {
                if (-2 != (var4 ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    var5_int = uj.a((byte) -127, lj.a((byte) 108), km.e(100));
                    if ((var5_int ^ -1) == 0) {
                      break L1;
                    } else {
                      hn.a((byte) -97, ii.field_y, var5_int, gi.field_b);
                      gi.field_b = null;
                      ii.field_y = null;
                      break L1;
                    }
                  }
                  var11 = pi.c((byte) 104);
                  if (var11 != null) {
                    nk.a(param0 + 0, var11.booleanValue());
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
                  var5_int = dn.a(wc.d(param0 + 0), (byte) 5, this.field_t, am.a(-13565), vi.b((byte) 127), pd.k(0), eg.f(8192));
                  if (-1 == var5_int) {
                    break L2;
                  } else {
                    rh.a(true, gi.field_b, ii.field_y, var5_int);
                    gi.field_b = null;
                    ii.field_y = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 != 3) {
                  break L3;
                } else {
                  L4: {
                    if ((mj.field_b ^ -1) == 0) {
                      break L4;
                    } else {
                      if (mj.field_b == 0) {
                        break L4;
                      } else {
                        mj.field_b = -1;
                        op.g((byte) 68);
                        break L4;
                      }
                    }
                  }
                  if (param2) {
                    ol.field_o = false;
                    break L3;
                  } else {
                    var5_int = mi.a(this.field_A, (byte) 28, am.a(-13565), this.field_t, false, eg.f(8192));
                    if (-1 != var5_int) {
                      if (0 == var5_int) {
                        ff.field_d = vn.field_b;
                        ql.d(123);
                        el.field_b = 10;
                        lo.field_Nb = false;
                        break L3;
                      } else {
                        gp.a(true, gi.field_b, var5_int);
                        gi.field_b = null;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (uj.field_Lb) {
                    vi.a(ao.a(param0 ^ 13867), 22770);
                    break L5;
                  } else {
                    el.field_b = 10;
                    lo.field_Nb = true;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 == var4) {
                  d.a(0, ao.a(13867));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if ((var4 ^ -1) == -7) {
                  if (sd.field_I) {
                    el.field_b = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if ((var4 ^ -1) == -8) {
                  ip.a((byte) 93, ao.a(param0 + 13867));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((var4 ^ -1) == -9) {
                  vi.a(ao.a(13867), 22770);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 != 9) {
                  break L10;
                } else {
                  fc.a(ao.a(param0 + 13867), (byte) 19);
                  break L10;
                }
              }
              L11: {
                if (-11 == (var4 ^ -1)) {
                  aa.field_f.g(17, 15514);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  vf.a(ao.a(13867), 3279);
                  break L12;
                }
              }
              L13: {
                if (12 == var4) {
                  ae.a((byte) 71, ao.a(13867), sn.b((byte) 11));
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (13 != var4) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null == qe.field_w) {
                          qe.field_w = new ll(mc.field_k, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (!qe.field_w.b((byte) -87)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = qe.field_w.a(3);
                            if (var12 == null) {
                              var9 = (String) null;
                              ri.a((String) null, true);
                              break L18;
                            } else {
                              var7 = ui.a(true, var12.field_k, 0, var12.field_m);
                              ri.a(var7, true);
                              break L18;
                            }
                          }
                          qe.field_w = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      jo.a(1, "S1", (Throwable) ((Object) var5));
                      var10 = (String) null;
                      ri.a((String) null, true);
                      qe.field_w = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (var4 != 15) {
                  break L20;
                } else {
                  el.field_b = 10;
                  break L20;
                }
              }
              if ((var4 ^ -1) == -17) {
                return 1;
              } else {
                if (17 != var4) {
                  return 0;
                } else {
                  return 2;
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

    final void a(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_129_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_128_0 = 0;
        int stackOut_127_0 = 0;
        L0: {
          var5 = Pixelate.field_H ? 1 : 0;
          if (null != vh.field_c) {
            L1: {
              if (null == ib.field_f) {
                var6 = tn.b((byte) 99);
                var4 = var6.getSize();
                vh.field_c.a(var4.width, 13756, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            vh.field_c.c(85);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          re.a((byte) 85);
          cm.e(-118);
          if (bd.a(true)) {
            break L2;
          } else {
            if (el.field_b != 11) {
              nj.d(param0 ^ 49661);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != gp.field_Lb) {
            lp.field_i = gp.field_Lb.b(true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (ol.b(true)) {
            L5: {
              var3 = pf.a(true) * 1200;
              if (this.field_F) {
                break L5;
              } else {
                if ((il.a(-115) ^ -1) >= (var3 ^ -1)) {
                  break L4;
                } else {
                  if (var3 < ql.g(13428)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            this.field_F = false;
            na.a(true);
            to.g((byte) 81);
            gp.a(true, hm.field_c, 2);
            fe.a(false);
            ol.field_o = true;
            mc.field_q = 15000L + hm.a(64);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if ((mj.field_b ^ -1) == 0) {
              break L7;
            } else {
              if (mj.field_b != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (mj.field_b != -1) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L8;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_26_0;
            mj.field_b = qn.e(59);
            if (var3 == 0) {
              break L9;
            } else {
              if (0 == mj.field_b) {
                if ((el.field_b ^ -1) != -12) {
                  break L9;
                } else {
                  if (uh.a((byte) -59)) {
                    break L9;
                  } else {
                    ql.d(param0 ^ 47);
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (mj.field_b == -1) {
            break L6;
          } else {
            if ((mj.field_b ^ -1) != -1) {
              mc.field_q = 15000L + hm.a(64);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if ((mj.field_b ^ -1) == 0) {
            break L10;
          } else {
            if (0 != mj.field_b) {
              if (10 > hf.field_q) {
                if (mj.field_b == 3) {
                  this.a(-18310, "js5crc");
                  break L10;
                } else {
                  if (mj.field_b != 4) {
                    if ((mj.field_b ^ -1) != -3) {
                      if ((mj.field_b ^ -1) == -6) {
                        this.a(-18310, "outofdate");
                        break L10;
                      } else {
                        this.a(param0 + -18310, "js5connect");
                        break L10;
                      }
                    } else {
                      this.a(param0 + -18310, "js5connect_full");
                      break L10;
                    }
                  } else {
                    this.a(-18310, "js5io");
                    break L10;
                  }
                }
              } else {
                if ((el.field_b ^ -1) <= -11) {
                  L11: {
                    to.g((byte) 106);
                    if (mj.field_b == 3) {
                      gp.a(true, wo.field_e, 256);
                      break L11;
                    } else {
                      if (mj.field_b == 4) {
                        gp.a(true, od.field_Ib, 256);
                        break L11;
                      } else {
                        if ((mj.field_b ^ -1) != -3) {
                          if (-6 == (mj.field_b ^ -1)) {
                            gp.a(true, aq.field_b, 5);
                            break L11;
                          } else {
                            gp.a(true, ll.field_k, 256);
                            break L11;
                          }
                        } else {
                          gp.a(true, rn.field_g, 256);
                          break L11;
                        }
                      }
                    }
                  }
                  ol.field_o = true;
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
              if (param0 == (mj.field_b ^ -1)) {
                break L14;
              } else {
                if (-1 != (mj.field_b ^ -1)) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (uh.a((byte) -59)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (mc.field_q > hm.a(64)) {
            break L12;
          } else {
            ol.field_o = false;
            if (mj.field_b == -1) {
              break L12;
            } else {
              if (mj.field_b != 0) {
                mj.field_b = -1;
                op.g((byte) 68);
                break L12;
              } else {
                break L12;
              }
            }
          }
        }
        L15: {
          if (0 != mj.field_b) {
            break L15;
          } else {
            if (uh.a((byte) -59)) {
              break L15;
            } else {
              go.field_f = false;
              break L15;
            }
          }
        }
        L16: {
          if ((hf.field_q ^ -1) != -1) {
            break L16;
          } else {
            if (!pg.b(param0 ^ 916440577)) {
              break L16;
            } else {
              hf.field_q = 1;
              break L16;
            }
          }
        }
        L17: {
          if (hf.field_q != 1) {
            break L17;
          } else {
            L18: {
              if (0 == wo.field_d) {
                break L18;
              } else {
                hn.field_e = wb.a(il.field_f, (byte) 124);
                break L18;
              }
            }
            wk.field_j = vm.a(true, (byte) 22, false, wg.field_e, 1);
            io.field_g = vm.a(true, (byte) 22, false, lo.field_Hb, 1);
            qo.field_u = vm.a(true, (byte) 22, false, wn.field_r, 1);
            qn.field_l = wk.field_j;
            dg.field_d = io.field_g;
            hf.field_q = 2;
            break L17;
          }
        }
        L19: {
          if (hf.field_q != 2) {
            break L19;
          } else {
            L20: {
              if (hn.field_e == null) {
                break L20;
              } else {
                if (hn.field_e.b(-3)) {
                  if (!hn.field_e.b(param0 + 125, "")) {
                    hn.field_e = null;
                    break L20;
                  } else {
                    if (!hn.field_e.a("", param0 ^ -1)) {
                      break L20;
                    } else {
                      uk.a(param0 + 31873, hn.field_e);
                      hn.field_e = null;
                      sf.a(param0 + 0);
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
            }
            if (null == hn.field_e) {
              hf.field_q = 3;
              break L19;
            } else {
              break L19;
            }
          }
        }
        L21: {
          if ((hf.field_q ^ -1) != -4) {
            break L21;
          } else {
            if (!gf.a(io.field_g, -123, wk.field_j, qo.field_u)) {
              break L21;
            } else {
              if (!pe.a(qo.field_u, (byte) -91)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    gg.c((byte) 24);
                    rn.a((byte) 119);
                    ad.field_r = mk.field_c;
                    sd.field_I = false;
                    hn.a(io.field_g, param0 + 27848, wk.field_j, qo.field_u, uj.field_Lb);
                    if (ri.field_b) {
                      break L23;
                    } else {
                      if (null == eq.field_fc) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_98_0 = param0 + -20;
                    stackIn_100_0 = stackOut_98_0;
                    stackIn_99_0 = stackOut_98_0;
                    if (ri.field_b) {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      break L24;
                    } else {
                      stackOut_99_0 = stackIn_99_0;
                      stackOut_99_1 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      stackIn_101_1 = stackOut_99_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_101_0 = stackIn_101_0;
                    stackOut_101_1 = stackIn_101_1;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    if (ri.field_b) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      break L25;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      break L25;
                    }
                  }
                  vn.a(stackIn_104_0, stackIn_104_1 != 0, stackIn_104_2 != 0, eq.field_fc);
                  break L22;
                }
                L26: {
                  if (!ci.field_n) {
                    break L26;
                  } else {
                    jo.a(-22218);
                    break L26;
                  }
                }
                L27: {
                  if (null != kp.field_t) {
                    break L27;
                  } else {
                    kp.field_t = vp.d((byte) -58);
                    hn.field_a = te.n(0);
                    break L27;
                  }
                }
                em.a(kp.field_t, 74, hn.field_a, qo.field_u);
                io.field_g = null;
                qo.field_u = null;
                wk.field_j = null;
                bg.a(param0 + 125, (java.applet.Applet) (this));
                sf.a(0);
                hf.field_q = 10;
                break L21;
              }
            }
          }
        }
        L28: {
          if (-11 != (hf.field_q ^ -1)) {
            break L28;
          } else {
            L29: {
              if (wo.field_d == 0) {
                break L29;
              } else {
                lf.field_f = wb.a(ro.field_c, (byte) 124);
                break L29;
              }
            }
            hf.field_q = 11;
            break L28;
          }
        }
        L30: {
          if (-12 != (hf.field_q ^ -1)) {
            break L30;
          } else {
            L31: {
              if (null == lf.field_f) {
                break L31;
              } else {
                L32: {
                  if (!lf.field_f.b(-3)) {
                    break L32;
                  } else {
                    if (!lf.field_f.a((byte) 92)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                li.a(0.0f, -1, dk.a(wa.field_a, 0, hm.field_a, lf.field_f));
                break L30;
              }
            }
            nn.field_i = true;
            hf.field_q = 12;
            break L30;
          }
        }
        L33: {
          if (hf.field_q != 12) {
            break L33;
          } else {
            if (nn.field_i) {
              break L33;
            } else {
              hf.field_q = 13;
              break L33;
            }
          }
        }
        L34: {
          if ((hf.field_q ^ -1) != -14) {
            break L34;
          } else {
            L35: {
              var3 = 1;
              if (gd.field_a == null) {
                break L35;
              } else {
                L36: {
                  if (!gd.field_a.c(4567)) {
                    stackOut_128_0 = 0;
                    stackIn_129_0 = stackOut_128_0;
                    break L36;
                  } else {
                    stackOut_127_0 = 1;
                    stackIn_129_0 = stackOut_127_0;
                    break L36;
                  }
                }
                var3 = stackIn_129_0;
                li.a(gd.field_a.field_f, -1, gd.field_a.field_e);
                break L35;
              }
            }
            if (var3 != 0) {
              hf.field_q = 20;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (wl.field_i) {
              pf.a(ec.field_u, param0 ^ 0);
              this.a(-27106);
              he.a(0, ec.field_u);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (!h.field_P[8]) {
            break L38;
          } else {
            gh.d(8);
            break L38;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        wo.field_d = this.field_z;
        if (!param4) {
            return;
        }
        pf.b(wo.field_d, -31383);
        l.a(false, wo.field_d, 5000, this.field_v, this.field_u, this.field_s, this.field_w, param0, 5000, param1, this.field_y, this.field_q, this.field_B, mc.field_k);
        rp.a(this.field_u, param0, wo.field_d, this.field_y, mc.field_k, this.field_q, this.field_w, -21462, this.field_B);
        qf.a(31171);
        gp.field_Lb = bl.a(71);
        he.a(0, ec.field_u);
        wg.field_e = param6;
        wn.field_r = param5;
        il.field_f = param7;
        lo.field_Hb = param3;
        ro.field_c = param2;
        this.n(-2);
        an.a(0);
    }

    final void h(int param0) {
        int var2 = 0;
        aa var3 = null;
        int var4 = 0;
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          var4 = Pixelate.field_H ? 1 : 0;
          var2 = mn.field_e;
          if (64 <= var2) {
            break L0;
          } else {
            if (!h.field_P[var2]) {
              break L0;
            } else {
              if (param0 == -12) {
                if (0 == var2) {
                  return;
                } else {
                  L1: {
                    if (-2 != (var2 ^ -1)) {
                      if (-3 == (var2 ^ -1)) {
                        ef.b(false);
                        break L1;
                      } else {
                        if (-4 != (var2 ^ -1)) {
                          if (-5 == (var2 ^ -1)) {
                            wh.e(-84);
                            break L1;
                          } else {
                            if ((var2 ^ -1) != -6) {
                              if (-7 == (var2 ^ -1)) {
                                io.b(-123);
                                break L1;
                              } else {
                                if ((var2 ^ -1) == -8) {
                                  this.i(param0 + 21049);
                                  break L1;
                                } else {
                                  if (8 != var2) {
                                    if (var2 != 16) {
                                      L2: {
                                        if (-12 == (var2 ^ -1)) {
                                          break L2;
                                        } else {
                                          if (-13 == (var2 ^ -1)) {
                                            break L2;
                                          } else {
                                            if (13 == var2) {
                                              ee.b(-123);
                                              break L1;
                                            } else {
                                              if ((var2 ^ -1) != -18) {
                                                if (18 != var2) {
                                                  jo.a(1, "MGS1: " + jm.b(-106), (Throwable) null);
                                                  na.a(true);
                                                  break L1;
                                                } else {
                                                  cl.b(param0 ^ -8237);
                                                  break L1;
                                                }
                                              } else {
                                                this.g((byte) 59);
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        if (-13 != (var2 ^ -1)) {
                                          stackOut_32_0 = 0;
                                          stackIn_33_0 = stackOut_32_0;
                                          break L3;
                                        } else {
                                          stackOut_31_0 = 1;
                                          stackIn_33_0 = stackOut_31_0;
                                          break L3;
                                        }
                                      }
                                      var3 = uj.a(stackIn_33_0 != 0, (byte) 122);
                                      fq.a(var3, (byte) 64);
                                      break L1;
                                    } else {
                                      nk.a(16711935);
                                      break L1;
                                    }
                                  } else {
                                    od.a(-5, vi.field_o, jj.field_b, mc.field_k);
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              ki.a(107);
                              break L1;
                            }
                          }
                        } else {
                          la.a(126);
                          break L1;
                        }
                      }
                    } else {
                      ef.a(-14439);
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        jo.a(1, "MGS2: " + jm.b(param0 + -55), (Throwable) null);
        na.a(true);
    }

    final void d(byte param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 20) {
            this.o(-126);
        }
        if (re.a(122)) {
            discarded$1 = this.a(0, ib.field_f != null ? true : false, false);
        } else {
            if ((hf.field_q ^ -1) > -11) {
            } else {
                if (!dm.q(22452)) {
                    pb.b(124);
                } else {
                    if (el.field_b != 0) {
                        a.a((byte) -104, lp.field_i);
                    } else {
                        discarded$2 = this.a(0, false, false);
                    }
                }
            }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
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
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
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
            try {
              L1: {
                if (this.c((byte) -112)) {
                  L2: {
                    L3: {
                      this.field_w = this.getCodeBase().getHost();
                      var6_ref2 = this.field_w.toLowerCase();
                      stackOut_2_0 = this;
                      stackIn_5_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_6_0 = this;
                          stackOut_6_1 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          break L2;
                        } else {
                          stackOut_4_0 = this;
                          stackIn_5_0 = stackOut_4_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                  L4: {
                    ((lb) (this)).field_A = stackIn_7_1 != 0;
                    this.field_y = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_q = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 != null) {
                      this.field_B = Integer.parseInt(var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_s = Long.parseLong(this.getParameter("instanceid"));
                    this.field_v = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_z = Integer.parseInt(var8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((this.field_z ^ -1) > -6) {
                      break L6;
                    } else {
                      this.field_z = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_t = Integer.parseInt(var9);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    ci.field_n = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                    this.a(param1, (byte) -104, param2, param3, this.field_u, param4, 32);
                    if (param0 == -128) {
                      break L8;
                    } else {
                      this.m(-94);
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                jo.a(1, (String) null, (Throwable) ((Object) var6));
                this.a(-18310, "crash");
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
            stackOut_23_0 = (RuntimeException) (var6_ref);
            stackOut_23_1 = new StringBuilder().append("lb.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L10;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_C = null;
        if (!param0) {
            field_C = (wm) null;
        }
        field_r = null;
        field_x = null;
    }

    final void a(String param0, int param1, int param2) {
        try {
            this.a((byte) -128, 480, param1, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lb.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void n(int param0) {
        wd.field_d[17] = -1;
        wd.field_d[18] = 1;
        wd.field_d[10] = -1;
        wd.field_d[3] = -1;
        wd.field_d[1] = 16;
        wd.field_d[12] = -1;
        wd.field_d[9] = -1;
        wd.field_d[7] = -1;
        wd.field_d[6] = param0;
        wd.field_d[13] = -1;
        wd.field_d[2] = -2;
        wd.field_d[4] = -1;
        wd.field_d[5] = -1;
        wd.field_d[8] = -2;
        wd.field_d[16] = -1;
        wd.field_d[11] = -1;
    }

    private final void i(int param0) {
        String var2 = qo.e(480);
        if (param0 != 21037) {
            this.a(false, false, true, true, true, false, -110);
        }
        gj.a(var2, ao.a(param0 ^ 25606), true);
    }

    final int j(int param0) {
        int var2 = 0;
        L0: {
          if (param0 == 1272) {
            break L0;
          } else {
            this.o(-20);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = this.l(-85);
            if (0 == var2) {
              break L2;
            } else {
              if (-2 != (var2 ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (!h.field_P[1]) {
              break L3;
            } else {
              io.a(2, -20304);
              break L3;
            }
          }
          L4: {
            if (!h.field_P[2]) {
              break L4;
            } else {
              se.a((byte) 32, 3);
              break L4;
            }
          }
          L5: {
            if (!h.field_P[3]) {
              break L5;
            } else {
              ue.b(4, (byte) 42);
              break L5;
            }
          }
          L6: {
            if (h.field_P[4]) {
              vp.a(0, 5);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!h.field_P[5]) {
              break L7;
            } else {
              bo.a(6, 7);
              break L7;
            }
          }
          L8: {
            if (h.field_P[6]) {
              ag.a((byte) -116, 7);
              break L8;
            } else {
              break L8;
            }
          }
          if (h.field_P[8]) {
            nn.a(true);
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
    }

    private final void e(byte param0) {
        int var2 = -121 / ((12 - param0) / 42);
        h.field_P[5] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, int param6) {
        this.a((byte) -53, true);
        if (param4) {
            this.m(1);
        }
        if (param3) {
            this.g(17);
        }
        if (param5) {
            this.k(61);
        }
        if (param1) {
            this.e((byte) 107);
        }
        if (param0) {
            this.o(126);
        }
        if (param2) {
            this.f((byte) -103);
        }
        if (param6 > -30) {
            this.field_s = -38L;
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        if (!this.field_c) {
          if (!uh.a((byte) -59)) {
            return -1;
          } else {
            L0: {
              if (param0 < -73) {
                break L0;
              } else {
                this.field_w = (String) null;
                break L0;
              }
            }
            if (ol.field_o) {
              return -1;
            } else {
              var2 = mi.a(this.field_A, (byte) 91, am.a(-13565), this.field_t, true, eg.f(8192));
              if (-1 == var2) {
                return -1;
              } else {
                L1: {
                  if (var2 == 0) {
                    break L1;
                  } else {
                    if ((var2 ^ -1) == -2) {
                      break L1;
                    } else {
                      L2: {
                        if (am.field_e) {
                          break L2;
                        } else {
                          this.a(-18310, "reconnect");
                          break L2;
                        }
                      }
                      to.g((byte) 47);
                      gp.a(true, gi.field_b, var2);
                      ol.field_o = true;
                      mc.field_q = 15000L + hm.a(64);
                      return var2;
                    }
                  }
                }
                L3: {
                  if (-12 != (el.field_b ^ -1)) {
                    break L3;
                  } else {
                    if (mj.field_b == 0) {
                      ql.d(44);
                      break L3;
                    } else {
                      break L3;
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

    private final void f(byte param0) {
        int discarded$0 = 0;
        h.field_P[11] = true;
        h.field_P[12] = true;
        h.field_P[13] = true;
        if (param0 >= -61) {
            discarded$0 = lb.a((byte) -22, 47);
        }
    }

    private final void k(int param0) {
        h.field_P[4] = true;
        if (param0 < 24) {
            this.field_t = -8;
        }
    }

    private final void g(byte param0) {
        int var2 = vi.field_o.f(255);
        if (param0 != 59) {
            this.field_B = -116;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = jj.field_b + -1;
        byte[] var5 = new byte[var4];
        vi.field_o.b(var5, 0, 88, var4);
        ia.a(var3 != 0, of.a(var5, 1), -33, ao.a(param0 ^ 13840));
    }

    final static hh[] a(fm param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        hh[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param0.a(127, param2);
            var6 = 95 % ((param1 - -53) / 49);
            var5 = param0.a((byte) -126, param3, var4_int);
            stackOut_0_0 = ff.a(param0, var5, var4_int, (byte) 18);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("lb.O(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static int a(byte param0, int param1) {
        hh[] discarded$1 = null;
        String var3 = null;
        L0: {
          if (param0 <= -88) {
            break L0;
          } else {
            var3 = (String) null;
            discarded$1 = lb.a((fm) null, 29, (String) null, (String) null);
            break L0;
          }
        }
        if (65536L <= (long)param1) {
          if (((long)param1 ^ -1L) <= -16777217L) {
            if (268435456L <= (long)param1) {
              if ((long)param1 < 1073741824L) {
                return nj.field_e[param1 >> 337361494] >> 634957601;
              } else {
                return nj.field_e[param1 >> 1971963864];
              }
            } else {
              if ((long)param1 >= 67108864L) {
                return nj.field_e[param1 >> -741204236] >> -673385342;
              } else {
                return nj.field_e[param1 >> -1519556334] >> -210852957;
              }
            }
          } else {
            if ((long)param1 < 1048576L) {
              if (-262145L < ((long)param1 ^ -1L)) {
                return nj.field_e[param1 >> 220622602] >> -27576281;
              } else {
                return nj.field_e[param1 >> 113171052] >> 2064156326;
              }
            } else {
              if ((long)param1 >= 4194304L) {
                return nj.field_e[param1 >> -157552272] >> -145426204;
              } else {
                return nj.field_e[param1 >> -61143314] >> -869528987;
              }
            }
          }
        } else {
          if (256L <= (long)param1) {
            if ((long)param1 >= 4096L) {
              if (16384L <= (long)param1) {
                return nj.field_e[param1 >> 1653400936] >> -629214936;
              } else {
                return nj.field_e[param1 >> -156323962] >> 1358702537;
              }
            } else {
              if (-1025L < ((long)param1 ^ -1L)) {
                return nj.field_e[param1 >> 1578766178] >> 2026677387;
              } else {
                return nj.field_e[param1 >> -591887228] >> -1230874134;
              }
            }
          } else {
            if (-1 >= (param1 ^ -1)) {
              return nj.field_e[param1] >> 1759504428;
            } else {
              return -1;
            }
          }
        }
    }

    private final void g(int param0) {
        h.field_P[2] = true;
        int var2 = 1 / ((-44 - param0) / 49);
    }

    protected lb() {
    }

    private final void a(byte param0, boolean param1) {
        h.field_P[7] = true;
        h.field_P[16] = true;
        h.field_P[17] = true;
        h.field_P[18] = true;
        if (param0 >= -49) {
            String var4 = (String) null;
            this.a((String) null, 31, 95);
        }
        h.field_P[3] = true;
        h.field_P[0] = true;
        h.field_P[8] = param1;
    }

    static {
        field_r = new wm(6, 0, 4, 2);
        field_C = new wm(8, 0, 4, 1);
    }
}
