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
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            we var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Pixelate.field_H ? 1 : 0;
                        var4 = qi.a(param0 + 6388, lp.field_i, wo.field_d, param1);
                        if (param0 != var4) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        throw new IllegalStateException();
                    }
                    case 2: {
                        if (-2 != (var4 ^ -1)) {
                            statePc = 8;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var5_int = uj.a((byte) -127, lj.a((byte) 108), km.e(100));
                        if ((var5_int ^ -1) == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        hn.a((byte) -97, ii.field_y, var5_int, gi.field_b);
                        gi.field_b = null;
                        ii.field_y = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var11 = pi.c((byte) 104);
                        if (var11 != null) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        nk.a(param0 + 0, var11.booleanValue());
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (-3 != (var4 ^ -1)) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var5_int = dn.a(wc.d(param0 + 0), (byte) 5, ((lb) this).field_t, am.a(-13565), vi.b((byte) 127), pd.k(0), eg.f(8192));
                        if (-1 == var5_int) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        rh.a(true, gi.field_b, ii.field_y, var5_int);
                        gi.field_b = null;
                        ii.field_y = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (var4 != 3) {
                            statePc = 22;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        if ((mj.field_b ^ -1) == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (mj.field_b == 0) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        mj.field_b = -1;
                        op.g((byte) 68);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (param2) {
                            statePc = 21;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var5_int = mi.a(((lb) this).field_A, (byte) 28, am.a(-13565), ((lb) this).field_t, false, eg.f(8192));
                        if (-1 != var5_int) {
                            statePc = 18;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (0 == var5_int) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        gp.a(true, gi.field_b, var5_int);
                        gi.field_b = null;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 20: {
                        ff.field_d = vn.field_b;
                        ql.d(123);
                        el.field_b = 10;
                        lo.field_Nb = false;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 21: {
                        ol.field_o = false;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var4 == 4) {
                            statePc = 24;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (uj.field_Lb) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        el.field_b = 10;
                        lo.field_Nb = true;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        vi.a(ao.a(param0 ^ 13867), 22770);
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        if (5 == var4) {
                            statePc = 29;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        d.a(0, ao.a(13867));
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if ((var4 ^ -1) == -7) {
                            statePc = 32;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (sd.field_I) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        el.field_b = 10;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if ((var4 ^ -1) == -8) {
                            statePc = 37;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        ip.a((byte) 93, ao.a(param0 + 13867));
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if ((var4 ^ -1) == -9) {
                            statePc = 40;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        vi.a(ao.a(13867), 22770);
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (var4 != 9) {
                            statePc = 43;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        fc.a(ao.a(param0 + 13867), (byte) 19);
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (-11 == (var4 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        aa.field_f.g(17, 15514);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (var4 != 11) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        vf.a(ao.a(13867), 3279);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (12 == var4) {
                            statePc = 50;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        ae.a((byte) 71, ao.a(13867), sn.b((byte) 11));
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (13 != var4) {
                            statePc = 62;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        try {
                            if (null == qe.field_w) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            qe.field_w = new ll(mc.field_k, new java.net.URL(((lb) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (!qe.field_w.b((byte) -87)) {
                                statePc = 62;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var12 = qe.field_w.a(3);
                            if (var12 == null) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var7 = ui.a(true, var12.field_k, 0, var12.field_m);
                            ri.a(var7, true);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var9 = null;
                            ri.a((String) null, true);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            qe.field_w = null;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var5 = (Exception) (Object) caughtException;
                        jo.a(1, "S1", (Throwable) (Object) var5);
                        var10 = null;
                        ri.a((String) null, true);
                        qe.field_w = null;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (var4 != 15) {
                            statePc = 64;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 63: {
                        el.field_b = 10;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if ((var4 ^ -1) == -17) {
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
                        if (17 != var4) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return 2;
                    }
                    case 69: {
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

    final void a(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
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
        int stackIn_132_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
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
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
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
              if (((lb) this).field_F) {
                break L5;
              } else {
                if (il.a(-115) <= var3) {
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
            ((lb) this).field_F = false;
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
            if (mj.field_b != 0) {
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
                  ((lb) this).a(-18310, "js5crc");
                  break L10;
                } else {
                  if (mj.field_b != 4) {
                    if ((mj.field_b ^ -1) != -3) {
                      if ((mj.field_b ^ -1) == -6) {
                        ((lb) this).a(-18310, "outofdate");
                        break L10;
                      } else {
                        ((lb) this).a(param0 + -18310, "js5connect");
                        break L10;
                      }
                    } else {
                      ((lb) this).a(param0 + -18310, "js5connect_full");
                      break L10;
                    }
                  } else {
                    ((lb) this).a(-18310, "js5io");
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
                        if (mj.field_b != -3) {
                          if (-6 == mj.field_b) {
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
              if (param0 == mj.field_b) {
                break L14;
              } else {
                if (-1 != mj.field_b) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (uh.a((byte) -59)) {
              break L13;
            } else {
              if (0 != mj.field_b) {
                break L12;
              } else {
                if (uh.a((byte) -59)) {
                  break L12;
                } else {
                  go.field_f = false;
                  break L12;
                }
              }
            }
          }
          if (mc.field_q <= hm.a(64)) {
            if (0 != mj.field_b) {
              break L12;
            } else {
              if (uh.a((byte) -59)) {
                break L12;
              } else {
                go.field_f = false;
                break L12;
              }
            }
          } else {
            if (0 != mj.field_b) {
              break L12;
            } else {
              if (uh.a((byte) -59)) {
                break L12;
              } else {
                go.field_f = false;
                break L12;
              }
            }
          }
        }
        L15: {
          if (hf.field_q != 0) {
            break L15;
          } else {
            if (!pg.b(param0 ^ 916440577)) {
              break L15;
            } else {
              hf.field_q = 1;
              break L15;
            }
          }
        }
        L16: {
          if (hf.field_q != 1) {
            break L16;
          } else {
            L17: {
              if (0 == wo.field_d) {
                break L17;
              } else {
                hn.field_e = wb.a(il.field_f, (byte) 124);
                break L17;
              }
            }
            wk.field_j = vm.a(true, (byte) 22, false, wg.field_e, 1);
            io.field_g = vm.a(true, (byte) 22, false, lo.field_Hb, 1);
            qo.field_u = vm.a(true, (byte) 22, false, wn.field_r, 1);
            qn.field_l = wk.field_j;
            dg.field_d = io.field_g;
            hf.field_q = 2;
            break L16;
          }
        }
        L18: {
          if (hf.field_q != 2) {
            break L18;
          } else {
            L19: {
              if (hn.field_e == null) {
                break L19;
              } else {
                if (hn.field_e.b(-3)) {
                  if (!hn.field_e.b(param0 + 125, "")) {
                    hn.field_e = null;
                    break L19;
                  } else {
                    if (!hn.field_e.a("", param0 ^ -1)) {
                      break L19;
                    } else {
                      uk.a(param0 + 31873, hn.field_e);
                      hn.field_e = null;
                      sf.a(param0 + 0);
                      break L19;
                    }
                  }
                } else {
                  break L19;
                }
              }
            }
            if (null == hn.field_e) {
              hf.field_q = 3;
              break L18;
            } else {
              break L18;
            }
          }
        }
        L20: {
          if ((hf.field_q ^ -1) != -4) {
            break L20;
          } else {
            if (!gf.a(io.field_g, -123, wk.field_j, qo.field_u)) {
              break L20;
            } else {
              if (!pe.a(qo.field_u, (byte) -91)) {
                break L20;
              } else {
                L21: {
                  L22: {
                    gg.c((byte) 24);
                    rn.a((byte) 119);
                    ad.field_r = mk.field_c;
                    sd.field_I = false;
                    hn.a(io.field_g, param0 + 27848, wk.field_j, qo.field_u, uj.field_Lb);
                    if (ri.field_b) {
                      break L22;
                    } else {
                      if (null == eq.field_fc) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    stackOut_101_0 = param0 + -20;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_102_0 = stackOut_101_0;
                    if (ri.field_b) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      break L23;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_104_0 = stackIn_104_0;
                    stackOut_104_1 = stackIn_104_1;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    stackIn_105_0 = stackOut_104_0;
                    stackIn_105_1 = stackOut_104_1;
                    if (ri.field_b) {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      stackIn_107_2 = stackOut_106_2;
                      break L24;
                    } else {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      stackIn_107_2 = stackOut_105_2;
                      break L24;
                    }
                  }
                  vn.a(stackIn_107_0, stackIn_107_1 != 0, stackIn_107_2 != 0, eq.field_fc);
                  break L21;
                }
                L25: {
                  if (!ci.field_n) {
                    break L25;
                  } else {
                    jo.a(-22218);
                    break L25;
                  }
                }
                L26: {
                  if (null != kp.field_t) {
                    break L26;
                  } else {
                    kp.field_t = vp.d((byte) -58);
                    hn.field_a = te.n(0);
                    break L26;
                  }
                }
                em.a(kp.field_t, 74, hn.field_a, qo.field_u);
                io.field_g = null;
                qo.field_u = null;
                wk.field_j = null;
                bg.a(param0 + 125, (java.applet.Applet) this);
                sf.a(0);
                hf.field_q = 10;
                break L20;
              }
            }
          }
        }
        L27: {
          if (-11 != hf.field_q) {
            break L27;
          } else {
            L28: {
              if (wo.field_d == 0) {
                break L28;
              } else {
                lf.field_f = wb.a(ro.field_c, (byte) 124);
                break L28;
              }
            }
            hf.field_q = 11;
            break L27;
          }
        }
        L29: {
          if (-12 != hf.field_q) {
            break L29;
          } else {
            L30: {
              if (null == lf.field_f) {
                break L30;
              } else {
                L31: {
                  if (!lf.field_f.b(-3)) {
                    break L31;
                  } else {
                    if (!lf.field_f.a((byte) 92)) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                li.a(0.0f, -1, dk.a(wa.field_a, 0, hm.field_a, lf.field_f));
                break L29;
              }
            }
            nn.field_i = true;
            hf.field_q = 12;
            break L29;
          }
        }
        L32: {
          if (hf.field_q != 12) {
            break L32;
          } else {
            if (nn.field_i) {
              break L32;
            } else {
              hf.field_q = 13;
              break L32;
            }
          }
        }
        L33: {
          if ((hf.field_q ^ -1) != -14) {
            break L33;
          } else {
            L34: {
              var3 = 1;
              if (gd.field_a == null) {
                break L34;
              } else {
                L35: {
                  if (!gd.field_a.c(4567)) {
                    stackOut_131_0 = 0;
                    stackIn_132_0 = stackOut_131_0;
                    break L35;
                  } else {
                    stackOut_130_0 = 1;
                    stackIn_132_0 = stackOut_130_0;
                    break L35;
                  }
                }
                var3 = stackIn_132_0;
                li.a(gd.field_a.field_f, -1, gd.field_a.field_e);
                break L34;
              }
            }
            if (var3 != 0) {
              hf.field_q = 20;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L36: {
          if (param1) {
            break L36;
          } else {
            if (wl.field_i) {
              pf.a(ec.field_u, param0 ^ 0);
              ((lb) this).a(-27106);
              he.a(0, ec.field_u);
              break L36;
            } else {
              break L36;
            }
          }
        }
        L37: {
          if (!h.field_P[8]) {
            break L37;
          } else {
            gh.d(8);
            break L37;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((lb) this).setBackground(java.awt.Color.black);
        wo.field_d = ((lb) this).field_z;
        if (!param4) {
            return;
        }
        pf.b(wo.field_d, -31383);
        l.a(false, wo.field_d, 5000, ((lb) this).field_v, ((lb) this).field_u, ((lb) this).field_s, ((lb) this).field_w, param0, 5000, param1, ((lb) this).field_y, ((lb) this).field_q, ((lb) this).field_B, mc.field_k);
        rp.a(((lb) this).field_u, param0, wo.field_d, ((lb) this).field_y, mc.field_k, ((lb) this).field_q, ((lb) this).field_w, -21462, ((lb) this).field_B);
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
                    if (-2 != var2) {
                      if (-3 == var2) {
                        ef.b(false);
                        break L1;
                      } else {
                        if (-4 != var2) {
                          if (-5 == var2) {
                            wh.e(-84);
                            break L1;
                          } else {
                            if (var2 != -6) {
                              if (-7 == var2) {
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
                                        if (-12 == var2) {
                                          break L2;
                                        } else {
                                          if (-13 == var2) {
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
                                    od.a(-5, (we) (Object) vi.field_o, jj.field_b, mc.field_k);
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
        int var3 = Pixelate.field_H ? 1 : 0;
        if (param0 != 20) {
            this.o(-126);
        }
        if (re.a(122)) {
            int discarded$1 = this.a(0, ib.field_f != null ? true : false, false);
        } else {
            if ((hf.field_q ^ -1) > -11) {
            } else {
                if (!dm.q(22452)) {
                    pb.b(124);
                } else {
                    if (el.field_b != 0) {
                        a.a((byte) -104, lp.field_i);
                    } else {
                        int discarded$2 = this.a(0, false, false);
                    }
                }
            }
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, String param4) {
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
                        if (((lb) this).c((byte) -112)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 1: {
                    return;
                }
                case 2: {
                    try {
                        ((lb) this).field_w = ((lb) this).getCodeBase().getHost();
                        var6_ref = ((lb) this).field_w.toLowerCase();
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
                        statePc = 21;
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
                        statePc = 21;
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
                        statePc = 21;
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
                        statePc = 21;
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
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ((lb) this).field_A = stackIn_7_1 != 0;
                        ((lb) this).field_y = Integer.parseInt(((lb) this).getParameter("gameport1"));
                        ((lb) this).field_q = Integer.parseInt(((lb) this).getParameter("gameport2"));
                        var7 = ((lb) this).getParameter("servernum");
                        if (var7 != null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((lb) this).field_B = Integer.parseInt(var7);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((lb) this).field_u = Integer.parseInt(((lb) this).getParameter("gamecrc"));
                        ((lb) this).field_s = Long.parseLong(((lb) this).getParameter("instanceid"));
                        ((lb) this).field_v = ((lb) this).getParameter("member").equals((Object) (Object) "yes");
                        var8 = ((lb) this).getParameter("lang");
                        if (var8 != null) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((lb) this).field_z = Integer.parseInt(var8);
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if ((((lb) this).field_z ^ -1) > -6) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((lb) this).field_z = 0;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var9 = ((lb) this).getParameter("affid");
                        if (var9 != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((lb) this).field_t = Integer.parseInt(var9);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        ci.field_n = Boolean.valueOf(((lb) this).getParameter("simplemode")).booleanValue();
                        ((lb) this).a(param1, (byte) -104, param2, param3, ((lb) this).field_u, param4, 32);
                        if (param0 == -128) {
                            statePc = 22;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        this.m(-94);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    var6 = (Exception) (Object) caughtException;
                    var10 = null;
                    jo.a(1, (String) null, (Throwable) (Object) var6);
                    ((lb) this).a(-18310, "crash");
                    statePc = 22;
                    continue stateLoop;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(boolean param0) {
        field_C = null;
        if (!param0) {
            field_C = null;
        }
        field_r = null;
        field_x = null;
    }

    final void a(String param0, int param1, int param2) {
        this.a((byte) -128, 480, param1, param2, param0);
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
            ((lb) this).a(false, false, true, true, true, false, -110);
        }
        gj.a(var2, ao.a(param0 ^ 25606), true);
    }

    final int j(int param0) {
        if (param0 != 1272) {
            this.o(-20);
        }
        int var2 = this.l(-85);
        if (0 != var2) {
            // if_icmpne L160
        }
        if (h.field_P[1]) {
            io.a(2, -20304);
        }
        if (h.field_P[2]) {
            se.a((byte) 32, 3);
        }
        if (h.field_P[3]) {
            ue.b(4, (byte) 42);
        }
        if (!(!h.field_P[4])) {
            vp.a(0, 5);
        }
        if (h.field_P[5]) {
            bo.a(6, 7);
        }
        if (!(!h.field_P[6])) {
            ag.a((byte) -116, 7);
        }
        if (!(!h.field_P[8])) {
            nn.a(true);
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
            ((lb) this).field_s = -38L;
        }
    }

    private final int l(int param0) {
        if (((lb) this).field_c) {
            return -1;
        }
        if (!(uh.a((byte) -59))) {
            return -1;
        }
        if (param0 >= -73) {
            ((lb) this).field_w = null;
        }
        if (!(!ol.field_o)) {
            return -1;
        }
        int var2 = mi.a(((lb) this).field_A, (byte) 91, am.a(-13565), ((lb) this).field_t, true, eg.f(8192));
        if (!(-1 != var2)) {
            return -1;
        }
        if (var2 != 0) {
            // if_icmpeq L100
        } else {
            if (-12 == el.field_b) {
                if (!(mj.field_b != 0)) {
                    ql.d(44);
                }
            }
            return var2;
        }
        if (!am.field_e) {
            ((lb) this).a(-18310, "reconnect");
        }
        to.g((byte) 47);
        gp.a(true, gi.field_b, var2);
        ol.field_o = true;
        mc.field_q = 15000L + hm.a(64);
        return var2;
    }

    private final void f(byte param0) {
        h.field_P[11] = true;
        h.field_P[12] = true;
        h.field_P[13] = true;
        if (param0 >= -61) {
            int discarded$0 = lb.a((byte) -22, 47);
        }
    }

    private final void k(int param0) {
        h.field_P[4] = true;
        if (param0 < 24) {
            ((lb) this).field_t = -8;
        }
    }

    private final void g(byte param0) {
        int var2 = vi.field_o.f(255);
        if (param0 != 59) {
            ((lb) this).field_B = -116;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = jj.field_b + -1;
        byte[] var5 = new byte[var4];
        vi.field_o.b(var5, 0, 88, var4);
        ia.a(var3 != 0, of.a(var5, 1), -33, ao.a(param0 ^ 13840));
    }

    final static hh[] a(fm param0, int param1, String param2, String param3) {
        int var4 = param0.a(127, param2);
        int var6 = 95 % ((param1 - -53) / 49);
        int var5 = param0.a((byte) -126, param3, var4);
        return ff.a(param0, var5, var4, (byte) 18);
    }

    final static int a(byte param0, int param1) {
        Object var3 = null;
        L0: {
          if (param0 <= -88) {
            break L0;
          } else {
            var3 = null;
            hh[] discarded$1 = lb.a((fm) null, 29, (String) null, (String) null);
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
            Object var4 = null;
            ((lb) this).a((String) null, 31, 95);
        }
        h.field_P[3] = true;
        h.field_P[0] = true;
        h.field_P[8] = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new wm(6, 0, 4, 2);
        field_C = new wm(8, 0, 4, 1);
    }
}
