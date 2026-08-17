/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bd extends hn {
    private boolean field_t;
    private int field_u;
    private int field_v;
    private int field_n;
    private int field_w;
    private int field_q;
    private boolean field_r;
    private int field_o;
    private long field_s;
    String field_m;
    private boolean field_p;

    private final void c(byte param0) {
        try {
            te.field_v[5] = true;
            if (param0 <= 62) {
                this.field_s = -10L;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.GA(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        try {
            te.field_v[6] = true;
            if (param0 != -1) {
                this.i(-42);
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.EA(" + param0 + ')');
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int stackIn_98_0 = 0;
            int stackIn_101_0 = 0;
            int stackIn_103_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var4_int = 0;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            Exception var6 = null;
            String var8 = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            Boolean var12 = null;
            wl var13 = null;
            var9 = client.field_A ? 1 : 0;
            try {
              L0: {
                var4_int = -3 % ((6 - param1) / 36);
                var5 = ne.a(255, kd.field_p, param0, jk.field_c);
                if (var5 != 0) {
                  L1: {
                    if (-2 != (var5 ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        var6_int = sm.a(ge.b((byte) -89), ob.b((byte) -117), 125);
                        if (-1 != var6_int) {
                          qf.a(rk.field_Y, ph.field_Eb, var6_int, -677);
                          rk.field_Y = null;
                          ph.field_Eb = null;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var12 = pg.a(24994);
                      if (var12 != null) {
                        pk.a(var12.booleanValue(), false);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (-3 == (var5 ^ -1)) {
                      var6_int = rd.a(pc.a(2), sm.a((byte) -97), f.a(116), aa.a(-48), 0, this.field_v, sm.b(1));
                      if (0 != (var6_int ^ -1)) {
                        jc.a(ph.field_Eb, var6_int, rk.field_Y, 0);
                        rk.field_Y = null;
                        ph.field_Eb = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (3 == var5) {
                      L5: {
                        if ((s.field_Pb ^ -1) == 0) {
                          break L5;
                        } else {
                          if (s.field_Pb != 0) {
                            s.field_Pb = -1;
                            sn.c((byte) -115);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (!param2) {
                        var6_int = sn.a(aa.a(-48), this.field_r, pc.a(2), (byte) 55, this.field_v, false);
                        if (-1 == var6_int) {
                          break L4;
                        } else {
                          if (-1 != (var6_int ^ -1)) {
                            dd.a(rk.field_Y, 0, var6_int);
                            rk.field_Y = null;
                            break L4;
                          } else {
                            ua.field_B = sh.field_f;
                            n.a(1);
                            v.field_d = false;
                            hc.field_d = 10;
                            break L4;
                          }
                        }
                      } else {
                        of.field_h = false;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  L6: {
                    if ((var5 ^ -1) == -5) {
                      if (!ce.field_w) {
                        v.field_d = true;
                        hc.field_d = 10;
                        break L6;
                      } else {
                        be.a(se.h(25144), (byte) -57);
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((var5 ^ -1) == -6) {
                      pk.a((byte) -17, se.h(25144));
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (var5 != 6) {
                      break L8;
                    } else {
                      if (!qi.field_M) {
                        break L8;
                      } else {
                        hc.field_d = 10;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    if (var5 == 7) {
                      ki.a((byte) 96, se.h(25144));
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (8 == var5) {
                      be.a(se.h(25144), (byte) -57);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (9 != var5) {
                      break L11;
                    } else {
                      bh.a(-114, se.h(25144));
                      break L11;
                    }
                  }
                  L12: {
                    if (10 != var5) {
                      break L12;
                    } else {
                      we.field_b.f(17, -4);
                      break L12;
                    }
                  }
                  L13: {
                    if (-12 == (var5 ^ -1)) {
                      wb.a(se.h(25144), 30307);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (-13 != (var5 ^ -1)) {
                      break L14;
                    } else {
                      aj.a(vm.c(-30185), -88, se.h(25144));
                      break L14;
                    }
                  }
                  L15: {
                    if (13 == var5) {
                      try {
                        L16: {
                          L17: {
                            if (vg.field_E == null) {
                              vg.field_E = new oh(lf.field_e, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          L18: {
                            if (!vg.field_E.a(-125)) {
                              break L18;
                            } else {
                              L19: {
                                var13 = vg.field_E.a(false);
                                if (var13 != null) {
                                  var8 = un.a(var13.field_r, 0, 0, var13.field_n);
                                  jb.a(var8, (byte) 45);
                                  break L19;
                                } else {
                                  var10 = (String) null;
                                  jb.a((String) null, (byte) 45);
                                  break L19;
                                }
                              }
                              vg.field_E = null;
                              break L18;
                            }
                          }
                          break L16;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L20: {
                          var6 = (Exception) (Object) decompiledCaughtException;
                          qb.a((Throwable) ((Object) var6), 16408, "S1");
                          var11 = (String) null;
                          jb.a((String) null, (byte) 45);
                          vg.field_E = null;
                          break L20;
                        }
                      }
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L21: {
                    if ((var5 ^ -1) != -16) {
                      break L21;
                    } else {
                      hc.field_d = 10;
                      break L21;
                    }
                  }
                  if (-17 != (var5 ^ -1)) {
                    if (17 != var5) {
                      stackIn_103_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      stackIn_101_0 = 2;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_98_0 = 1;
                    decompiledRegionSelector0 = 0;
                    break L0;
                  }
                } else {
                  throw new IllegalStateException();
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (RuntimeException) (Object) decompiledCaughtException;
              throw dh.a((Throwable) ((Object) var4), "bd.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_98_0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_101_0;
              } else {
                return stackIn_103_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void i(int param0) {
        String var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              var2 = ui.a(param0 ^ -12040);
              oa.a(se.h(25144), -1, var2);
              if (param0 == 0) {
                break L1;
              } else {
                this.f((byte) 100);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2_ref), "bd.QA(" + param0 + ')');
        }
    }

    final void g(int param0) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        int var3 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 == 10) {
              L1: {
                L2: {
                  if (t.i((byte) 124)) {
                    L3: {
                      stackIn_16_0 = this;

                      if (null == cl.field_v) {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 0;
                        break L3;
                      } else {
                        stackIn_17_0 = this;
                        stackIn_17_1 = 1;
                        break L3;
                      }
                    }
                    discarded$0 = this.a(stackIn_17_1 != 0, -41, false);
                    break L2;
                  } else {
                    if (ca.field_vb < 10) {
                      break L2;
                    } else {
                      if (!dl.a(480)) {
                        ua.h((byte) -70);
                        break L1;
                      } else {
                        if (-1 == (hc.field_d ^ -1)) {
                          discarded$1 = this.a(false, -104, false);
                          break L1;
                        } else {
                          ql.a(jk.field_c, (byte) -101);
                          break L1;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "bd.MA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void e(byte param0) {
        try {
            te.field_v[13] = true;
            te.field_v[12] = true;
            te.field_v[11] = true;
            if (param0 != 13) {
                this.field_v = -26;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.KA(" + param0 + ')');
        }
    }

    final void b(boolean param0, int param1) {
        int stackIn_25_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        String stackIn_124_2 = null;
        int stackIn_125_0;
        int stackIn_125_1;
        String stackIn_125_2;
        int stackIn_125_3;
        int stackIn_155_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (li.field_b == null) {
                break L1;
              } else {
                L2: {
                  if (null == cl.field_v) {
                    var6 = wm.f((byte) 126);
                    var4 = var6.getSize();
                    li.field_b.a(var4.width, false, var4.height);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                li.field_b.a(false);
                break L1;
              }
            }
            L3: {
              wf.b(19012);
              ql.c(-2);
              if (ta.a((byte) -35)) {
                break L3;
              } else {
                if ((hc.field_d ^ -1) == -12) {
                  break L3;
                } else {
                  fh.a(-52);
                  break L3;
                }
              }
            }
            L4: {
              if (null == uc.field_e) {
                break L4;
              } else {
                jk.field_c = uc.field_e.a(60);
                break L4;
              }
            }
            L5: {
              if (!si.c(-12851)) {
                break L5;
              } else {
                L6: {
                  var3_int = n.a((byte) -74) * 1200;
                  if (this.field_p) {
                    break L6;
                  } else {
                    if (var3_int >= fl.a((byte) -108)) {
                      break L5;
                    } else {
                      if (var3_int >= ne.b((byte) -40)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                this.field_p = false;
                si.a(79);
                gh.a(false);
                dd.a(am.field_d, param1 ^ -11, 2);
                jc.b((byte) 84);
                of.field_h = true;
                lb.field_d = ik.a(param1 + 15) + 15000L;
                break L5;
              }
            }
            L7: {
              L8: {
                if ((s.field_Pb ^ -1) == 0) {
                  break L8;
                } else {
                  if (-1 != (s.field_Pb ^ -1)) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if ((s.field_Pb ^ -1) == 0) {
                  stackIn_25_0 = 1;
                  break L9;
                } else {
                  stackIn_25_0 = 0;
                  break L9;
                }
              }
              L10: {
                var3_int = stackIn_25_0;
                s.field_Pb = ib.l(102);
                if (var3_int == 0) {
                  break L10;
                } else {
                  if (s.field_Pb != 0) {
                    break L10;
                  } else {
                    if (-12 != (hc.field_d ^ -1)) {
                      break L10;
                    } else {
                      if (!ea.c((byte) -57)) {
                        n.a(1);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
              }
              if (-1 == s.field_Pb) {
                break L7;
              } else {
                if (s.field_Pb != 0) {
                  lb.field_d = ik.a(4) - -15000L;
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L11: {
              if (s.field_Pb == -1) {
                break L11;
              } else {
                if (s.field_Pb != 0) {
                  if ((ca.field_vb ^ -1) > -11) {
                    if ((s.field_Pb ^ -1) == -4) {
                      this.a(true, "js5crc");
                      break L11;
                    } else {
                      if (4 == s.field_Pb) {
                        this.a(true, "js5io");
                        break L11;
                      } else {
                        if (s.field_Pb != 2) {
                          if (-6 == (s.field_Pb ^ -1)) {
                            this.a(true, "outofdate");
                            break L11;
                          } else {
                            this.a(true, "js5connect");
                            break L11;
                          }
                        } else {
                          this.a(true, "js5connect_full");
                          break L11;
                        }
                      }
                    }
                  } else {
                    if (-11 < (hc.field_d ^ -1)) {
                      break L11;
                    } else {
                      L12: {
                        gh.a(false);
                        if (-4 == (s.field_Pb ^ -1)) {
                          dd.a(ic.field_d, 0, 256);
                          break L12;
                        } else {
                          if (4 == s.field_Pb) {
                            dd.a(ub.field_f, param1 + 11, 256);
                            break L12;
                          } else {
                            if (2 == s.field_Pb) {
                              dd.a(kb.field_f, 0, 256);
                              break L12;
                            } else {
                              if (s.field_Pb != 5) {
                                dd.a(kf.field_N, 0, 256);
                                break L12;
                              } else {
                                dd.a(ah.field_a, param1 + 11, 5);
                                break L12;
                              }
                            }
                          }
                        }
                      }
                      of.field_h = true;
                      break L11;
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
            L13: {
              L14: {
                L15: {
                  if (s.field_Pb == -1) {
                    break L15;
                  } else {
                    if (s.field_Pb != 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                if (!ea.c((byte) -112)) {
                  break L13;
                } else {
                  break L14;
                }
              }
              if ((ik.a(4) ^ -1L) > (lb.field_d ^ -1L)) {
                break L13;
              } else {
                of.field_h = false;
                if ((s.field_Pb ^ -1) == 0) {
                  break L13;
                } else {
                  if (0 == s.field_Pb) {
                    break L13;
                  } else {
                    s.field_Pb = -1;
                    sn.c((byte) -116);
                    break L13;
                  }
                }
              }
            }
            L16: {
              if (s.field_Pb != 0) {
                break L16;
              } else {
                if (!ea.c((byte) -112)) {
                  tf.field_bb = false;
                  break L16;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (-1 == (ca.field_vb ^ -1)) {
                if (!nf.c(48)) {
                  break L17;
                } else {
                  ca.field_vb = 1;
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if ((ca.field_vb ^ -1) != -2) {
                break L18;
              } else {
                L19: {
                  if (0 != kd.field_p) {
                    vj.field_a = vg.a(vh.field_d, 34);
                    break L19;
                  } else {
                    break L19;
                  }
                }
                sk.field_f = tf.a(1, param1 + 131, false, true, cg.field_a);
                rc.field_k = tf.a(1, 127, false, true, a.field_h);
                ph.field_Fb = tf.a(1, 113, false, true, rf.field_d);
                ah.field_i = sk.field_f;
                ca.field_vb = 2;
                qc.field_vb = rc.field_k;
                break L18;
              }
            }
            L20: {
              if ((ca.field_vb ^ -1) != -3) {
                break L20;
              } else {
                L21: {
                  if (vj.field_a != null) {
                    if (vj.field_a.a((byte) 121)) {
                      if (vj.field_a.a("", param1 ^ -11)) {
                        if (!vj.field_a.a("", (byte) -94)) {
                          break L21;
                        } else {
                          ml.a(vj.field_a, (byte) 117);
                          vj.field_a = null;
                          vj.a(true);
                          break L21;
                        }
                      } else {
                        vj.field_a = null;
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  } else {
                    break L21;
                  }
                }
                if (vj.field_a == null) {
                  ca.field_vb = 3;
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            L22: {
              if (3 != ca.field_vb) {
                break L22;
              } else {
                if (!ta.a(sk.field_f, rc.field_k, -21, ph.field_Fb)) {
                  break L22;
                } else {
                  if (!ba.a(ph.field_Fb, -2147483648)) {
                    break L22;
                  } else {
                    L23: {
                      L24: {
                        e.b(-8621);
                        nm.h((byte) 112);
                        qi.field_M = false;
                        he.field_hb = wf.field_m;
                        se.a(sk.field_f, ph.field_Fb, (byte) 76, ce.field_w, rc.field_k);
                        if (ge.field_j) {
                          break L24;
                        } else {
                          if (null == vd.field_q) {
                            break L23;
                          } else {
                            break L24;
                          }
                        }
                      }
                      L25: {
                        if (ge.field_j) {
                          stackIn_121_0 = 0;
                          break L25;
                        } else {
                          stackIn_121_0 = 1;
                          break L25;
                        }
                      }
                      L26: {
                        stackIn_124_0 = stackIn_121_0;

                        stackIn_124_1 = -86;

                        stackIn_124_2 = vd.field_q;

                        if (ge.field_j) {
                          stackIn_125_0 = stackIn_124_0;
                          stackIn_125_1 = stackIn_124_1;
                          stackIn_125_2 = (String) ((Object) stackIn_124_2);
                          stackIn_125_3 = 0;
                          break L26;
                        } else {
                          stackIn_125_0 = stackIn_121_0;
                          stackIn_125_1 = stackIn_124_1;
                          stackIn_125_2 = (String) ((Object) stackIn_124_2);
                          stackIn_125_3 = 1;
                          break L26;
                        }
                      }
                      rb.a(stackIn_125_0 != 0, (byte) stackIn_125_1, stackIn_125_2, stackIn_125_3 != 0);
                      break L23;
                    }
                    L27: {
                      if (!om.field_f) {
                        break L27;
                      } else {
                        rk.c(false);
                        break L27;
                      }
                    }
                    L28: {
                      if (null != hm.field_c) {
                        break L28;
                      } else {
                        hm.field_c = pk.a(15000);
                        ea.field_r = i.a(1);
                        break L28;
                      }
                    }
                    ed.a(ph.field_Fb, ea.field_r, hm.field_c, 20350);
                    sk.field_f = null;
                    rc.field_k = null;
                    ph.field_Fb = null;
                    rd.a((java.applet.Applet) (this), false);
                    vj.a(true);
                    ca.field_vb = 10;
                    break L22;
                  }
                }
              }
            }
            L29: {
              if ((ca.field_vb ^ -1) != param1) {
                break L29;
              } else {
                L30: {
                  if (0 == kd.field_p) {
                    break L30;
                  } else {
                    wk.field_q = vg.a(gi.field_e, 112);
                    break L30;
                  }
                }
                ca.field_vb = 11;
                break L29;
              }
            }
            L31: {
              if ((ca.field_vb ^ -1) == -12) {
                L32: {
                  if (null == wk.field_q) {
                    break L32;
                  } else {
                    L33: {
                      if (!wk.field_q.a((byte) 121)) {
                        break L33;
                      } else {
                        if (!wk.field_q.a(false)) {
                          break L33;
                        } else {
                          break L32;
                        }
                      }
                    }
                    qi.a(0.0f, -78, ad.a(wk.field_q, fe.field_a, true, eb.field_n));
                    break L31;
                  }
                }
                ca.field_vb = 12;
                of.field_c = true;
                break L31;
              } else {
                break L31;
              }
            }
            L34: {
              if (12 != ca.field_vb) {
                break L34;
              } else {
                if (of.field_c) {
                  break L34;
                } else {
                  ca.field_vb = 13;
                  break L34;
                }
              }
            }
            L35: {
              if ((ca.field_vb ^ -1) == -14) {
                L36: {
                  var3_int = 1;
                  if (sh.field_g == null) {
                    break L36;
                  } else {
                    L37: {
                      if (!sh.field_g.a(-57)) {
                        stackIn_155_0 = 0;
                        break L37;
                      } else {
                        stackIn_155_0 = 1;
                        break L37;
                      }
                    }
                    var3_int = stackIn_155_0;
                    qi.a(sh.field_g.field_l, param1 + 82, sh.field_g.field_a);
                    break L36;
                  }
                }
                if (var3_int == 0) {
                  break L35;
                } else {
                  ca.field_vb = 20;
                  break L35;
                }
              } else {
                break L35;
              }
            }
            L38: {
              if (param0) {
                break L38;
              } else {
                if (!jg.field_e) {
                  break L38;
                } else {
                  tj.a(false, jh.field_b);
                  this.b((byte) -91);
                  hl.a(jh.field_b, (byte) -97);
                  break L38;
                }
              }
            }
            L39: {
              if (te.field_v[8]) {
                ec.a(param1 + -82);
                break L39;
              } else {
                break L39;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "bd.RA(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 102) {
                break L1;
              } else {
                this.field_t = false;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, param1 ^ -124, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "bd.NA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void f(byte param0) {
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_45_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        hl var3 = null;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 115) {
                break L1;
              } else {
                this.g(-60);
                break L1;
              }
            }
            L2: {
              var2_int = bh.field_k;
              if (var2_int >= 64) {
                break L2;
              } else {
                if (te.field_v[var2_int]) {
                  if (var2_int != 0) {
                    L3: {
                      if (-2 != (var2_int ^ -1)) {
                        if (2 != var2_int) {
                          if (var2_int == 3) {
                            dk.a(69);
                            break L3;
                          } else {
                            if (var2_int != 4) {
                              if (5 == var2_int) {
                                pe.b(14750);
                                break L3;
                              } else {
                                if ((var2_int ^ -1) != -7) {
                                  if (7 != var2_int) {
                                    if ((var2_int ^ -1) == -9) {
                                      qn.a(sm.field_e, lf.field_e, 4210752, de.field_V);
                                      break L3;
                                    } else {
                                      if (-17 == (var2_int ^ -1)) {
                                        wm.d(140);
                                        break L3;
                                      } else {
                                        L4: {
                                          if (var2_int == 11) {
                                            break L4;
                                          } else {
                                            if (-13 == (var2_int ^ -1)) {
                                              break L4;
                                            } else {
                                              if (13 != var2_int) {
                                                if (17 != var2_int) {
                                                  if (-19 == (var2_int ^ -1)) {
                                                    ne.c(27721);
                                                    break L3;
                                                  } else {
                                                    qb.a((Throwable) null, 16408, "MGS1: " + qk.d((byte) 52));
                                                    si.a(65);
                                                    break L3;
                                                  }
                                                } else {
                                                  this.l(-33);
                                                  break L3;
                                                }
                                              } else {
                                                oe.c(false);
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                        L5: {
                                          stackIn_44_0 = 0;

                                          if (var2_int != 12) {
                                            stackIn_45_0 = stackIn_44_0;
                                            stackIn_45_1 = 0;
                                            break L5;
                                          } else {
                                            stackIn_45_0 = stackIn_44_0;
                                            stackIn_45_1 = 1;
                                            break L5;
                                          }
                                        }
                                        var3 = ki.a(stackIn_45_0, stackIn_45_1 != 0);
                                        cl.a(var3, true);
                                        break L3;
                                      }
                                    }
                                  } else {
                                    this.i(0);
                                    break L3;
                                  }
                                } else {
                                  ul.a((byte) 112);
                                  break L3;
                                }
                              }
                            } else {
                              cm.a((byte) 53);
                              break L3;
                            }
                          }
                        } else {
                          ke.e((byte) 48);
                          break L3;
                        }
                      } else {
                        ua.i((byte) -21);
                        break L3;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L2;
                }
              }
            }
            qb.a((Throwable) null, 16408, "MGS2: " + qk.d((byte) 127));
            si.a(119);
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "bd.W(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void h(byte param0) {
        try {
            te.field_v[4] = true;
            if (param0 != -25) {
                this.field_q = 127;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.AA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -2990) {
                break L1;
              } else {
                this.field_m = (String) null;
                break L1;
              }
            }
            this.a(param1, false, 480, 640, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (runtimeException);

            stackIn_7_1 = new StringBuilder().append("bd.UA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        try {
            if (param0 < 70) {
                this.field_m = (String) null;
            }
            te.field_v[0] = true;
            te.field_v[17] = true;
            te.field_v[16] = true;
            te.field_v[7] = true;
            te.field_v[8] = param1;
            te.field_v[18] = true;
            te.field_v[3] = true;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.SA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int j(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          L0: {
            if (this.field_f) {
              stackIn_4_0 = -1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (ea.c((byte) -38)) {
                if (of.field_h) {
                  stackIn_12_0 = -1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var2_int = sn.a(aa.a(param0 + -68), this.field_r, pc.a(2), (byte) 55, this.field_v, true);
                  if (-1 == var2_int) {
                    stackIn_17_0 = -1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if (0 == var2_int) {
                        break L1;
                      } else {
                        if (-2 != (var2_int ^ -1)) {
                          L2: {
                            if (!lf.field_g) {
                              this.a(true, "reconnect");
                              break L2;
                            } else {
                              break L2;
                            }
                          }
                          gh.a(false);
                          dd.a(rk.field_Y, param0 ^ param0, var2_int);
                          of.field_h = true;
                          lb.field_d = 15000L + ik.a(4);
                          stackIn_31_0 = var2_int;
                          decompiledRegionSelector0 = 5;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L3: {
                      if (-12 != (hc.field_d ^ -1)) {
                        break L3;
                      } else {
                        if (-1 != (s.field_Pb ^ -1)) {
                          break L3;
                        } else {
                          n.a(1);
                          break L3;
                        }
                      }
                    }
                    stackIn_25_0 = var2_int;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              } else {
                stackIn_7_0 = -1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "bd.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0;
                } else {
                  return stackIn_31_0;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -27096) {
            return;
        }
        try {
            ul.field_g = 1000000000L / (long)param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param1 <= 2) {
            return;
        }
        try {
            kd.field_p = this.field_o;
            lc.a(kd.field_p, true);
            j.a(param2, this.field_u, lf.field_e, 5000, 5000, this.field_s, kd.field_p, param7, this.field_q, this.field_w, this.field_t, true, this.field_n, this.field_m);
            ce.a(this.field_w, this.field_u, kd.field_p, param2, this.field_n, this.field_m, lf.field_e, 0, this.field_q);
            eb.c(120);
            uc.field_e = t.k(-22);
            hl.a(jh.field_b, (byte) -71);
            gi.field_e = param0;
            a.field_h = param6;
            vh.field_d = param3;
            cg.field_a = param4;
            rf.field_d = param5;
            this.c(true);
            oh.a((byte) 13);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void m(int param0) {
        try {
            te.field_v[1] = true;
            if (param0 != -1) {
                this.field_o = 49;
            }
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.IA(" + param0 + ')');
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          L0: {
            L1: {
              this.a(77, true);
              if (param0) {
                this.m(-1);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                this.k(7);
                break L2;
              }
            }
            if (!param3) {
              L3: {
                if (param5) {
                  this.h((byte) -25);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (param6) {
                  this.c((byte) 87);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (!param4) {
                  break L5;
                } else {
                  this.h(-1);
                  break L5;
                }
              }
              L6: {
                if (!param1) {
                  break L6;
                } else {
                  this.e((byte) 13);
                  break L6;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var8), "bd.JA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, String param4) {
        Object stackIn_5_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_25_0;
        String stackIn_25_1;
        int stackIn_25_2;
        int stackIn_25_3;
        Object stackIn_26_0;
        String stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_26_4;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.a((byte) -29)) {
                  L2: {
                    L3: {
                      this.field_m = this.getCodeBase().getHost();
                      var6 = this.field_m.toLowerCase();
                      stackIn_5_0 = this;

                      if (var6.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackIn_7_0 = this;

                        if (!var6.endsWith(".jagex.com")) {
                          stackIn_8_0 = this;
                          stackIn_8_1 = 0;
                          break L2;
                        } else {
                          stackIn_5_0 = this;
                          break L3;
                        }
                      }
                    }
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L2;
                  }
                  L4: {
                    ((bd) (this)).field_r = stackIn_8_1 != 0;
                    this.field_n = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_w = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_q = Integer.parseInt(var7);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_s = Long.parseLong(this.getParameter("instanceid"));
                    this.field_t = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 == null) {
                      break L5;
                    } else {
                      this.field_o = Integer.parseInt(var8);
                      break L5;
                    }
                  }
                  L6: {
                    if (5 <= this.field_o) {
                      this.field_o = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_v = Integer.parseInt(var9);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  om.field_f = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  if (!param1) {
                    L8: {
                      stackIn_25_0 = this;

                      stackIn_25_1 = (String) (param4);

                      stackIn_25_2 = 32;

                      stackIn_25_3 = param0;

                      if (param1) {
                        stackIn_26_0 = this;
                        stackIn_26_1 = (String) ((Object) stackIn_25_1);
                        stackIn_26_2 = stackIn_25_2;
                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = 0;
                        break L8;
                      } else {
                        stackIn_26_0 = this;
                        stackIn_26_1 = (String) ((Object) stackIn_25_1);
                        stackIn_26_2 = stackIn_25_2;
                        stackIn_26_3 = stackIn_25_3;
                        stackIn_26_4 = 1;
                        break L8;
                      }
                    }
                    this.a(stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4 != 0, param2, param3, this.field_u);
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                L10: {
                  var6_ref = (Exception) (Object) decompiledCaughtException;
                  var10 = (String) null;
                  qb.a((Throwable) ((Object) var6_ref), 16408, (String) null);
                  stackIn_31_0 = this;

                  if (param1) {
                    stackIn_32_0 = this;
                    stackIn_32_1 = 0;
                    break L10;
                  } else {
                    stackIn_32_0 = this;
                    stackIn_32_1 = 1;
                    break L10;
                  }
                }
                this.a(stackIn_32_1 != 0, "crash");
                decompiledRegionSelector0 = 2;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L11: {
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var6_ref2);

            stackIn_37_1 = new StringBuilder().append("bd.VA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L11;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static boolean d(byte param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        try {
          L0: {
            var1_int = -5 % ((param0 - -47) / 44);
            stackIn_1_0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "bd.OA(" + param0 + ')');
        }
        return stackIn_1_0 != 0;
    }

    private final void l(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        try {
          L0: {
            L1: {
              var3 = 105 / ((param0 - 27) / 38);
              var2_int = de.field_V.d((byte) -124);
              if ((var2_int & 1) == 0) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            var4 = stackIn_4_0;
            var5 = sm.field_e - 1;
            var6 = new byte[var5];
            de.field_V.a(-67, var6, var5, 0);
            c.a((byte) 84, qj.a(var6, 2), var4 != 0, se.h(25144));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "bd.FA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        if (param0 != 7) {
            return;
        }
        try {
            te.field_v[2] = true;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.DA(" + param0 + ')');
        }
    }

    final int g(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = this.j(-1);
              if (param0 > 122) {
                break L1;
              } else {
                this.field_w = -122;
                break L1;
              }
            }
            L2: {
              L3: {
                if (0 == var2_int) {
                  break L3;
                } else {
                  if (var2_int == 1) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (!te.field_v[1]) {
                  break L4;
                } else {
                  qn.c(-20494, 2);
                  break L4;
                }
              }
              L5: {
                if (te.field_v[2]) {
                  dg.a(-111, 3);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (!te.field_v[3]) {
                  break L6;
                } else {
                  of.a(false, 4);
                  break L6;
                }
              }
              L7: {
                if (te.field_v[4]) {
                  wa.a(3, 5);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (!te.field_v[5]) {
                  break L8;
                } else {
                  bh.a(6, -120);
                  break L8;
                }
              }
              L9: {
                if (te.field_v[6]) {
                  dl.b(640, 7);
                  break L9;
                } else {
                  break L9;
                }
              }
              if (te.field_v[8]) {
                ga.b((byte) -112);
                break L2;
              } else {
                break L2;
              }
            }
            stackIn_29_0 = var2_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "bd.BA(" + param0 + ')');
        }
        return stackIn_29_0;
    }

    private final void c(boolean param0) {
        mk.field_c[18] = 1;
        mk.field_c[4] = -1;
        mk.field_c[13] = -1;
        mk.field_c[8] = -2;
        mk.field_c[2] = -2;
        mk.field_c[1] = 16;
        if (!param0) {
            return;
        }
        try {
            mk.field_c[11] = -1;
            mk.field_c[7] = -1;
            mk.field_c[3] = -1;
            mk.field_c[6] = -2;
            mk.field_c[9] = -1;
            mk.field_c[5] = -1;
            mk.field_c[17] = -1;
            mk.field_c[12] = -1;
            mk.field_c[10] = -1;
            mk.field_c[16] = -1;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.LA(" + param0 + ')');
        }
    }

    protected bd() {
    }

    static {
    }
}
