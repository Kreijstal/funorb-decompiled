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
        te.field_v[5] = true;
        if (param0 <= 62) {
            this.field_s = -10L;
        }
    }

    private final void h(int param0) {
        te.field_v[6] = true;
        if (param0 != -1) {
            this.i(-42);
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            int var6_int = 0;
            String var8 = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            Boolean var12 = null;
            wl var13 = null;
            Throwable decompiledCaughtException = null;
            var9 = client.field_A ? 1 : 0;
            var4 = -3 % ((6 - param1) / 36);
            var5 = ne.a(255, kd.field_p, param0, jk.field_c);
            if (var5 != 0) {
              L0: {
                if (-2 != (var5 ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    var6_int = sm.a(ge.b((byte) -89), ob.b((byte) -117), 125);
                    if (-1 != var6_int) {
                      qf.a(rk.field_Y, ph.field_Eb, var6_int, -677);
                      rk.field_Y = null;
                      ph.field_Eb = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var12 = pg.a(24994);
                  if (var12 != null) {
                    pk.a(var12.booleanValue(), false);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (-3 == (var5 ^ -1)) {
                  var6_int = rd.a(pc.a(2), sm.a((byte) -97), f.a(116), aa.a(-48), 0, this.field_v, sm.b(1));
                  if (0 != (var6_int ^ -1)) {
                    jc.a(ph.field_Eb, var6_int, rk.field_Y, 0);
                    rk.field_Y = null;
                    ph.field_Eb = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 == var5) {
                  L4: {
                    if ((s.field_Pb ^ -1) == 0) {
                      break L4;
                    } else {
                      if (s.field_Pb != 0) {
                        s.field_Pb = -1;
                        sn.c((byte) -115);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (!param2) {
                      break L5;
                    } else {
                      of.field_h = false;
                      if (var9 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var6_int = sn.a(aa.a(-48), this.field_r, pc.a(2), (byte) 55, this.field_v, false);
                  if (-1 == var6_int) {
                    break L3;
                  } else {
                    L6: {
                      if (-1 != (var6_int ^ -1)) {
                        break L6;
                      } else {
                        ua.field_B = sh.field_f;
                        n.a(1);
                        v.field_d = false;
                        hc.field_d = 10;
                        if (var9 == 0) {
                          break L3;
                        } else {
                          break L6;
                        }
                      }
                    }
                    dd.a(rk.field_Y, 0, var6_int);
                    rk.field_Y = null;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L7: {
                if ((var5 ^ -1) == -5) {
                  L8: {
                    if (!ce.field_w) {
                      break L8;
                    } else {
                      be.a(se.h(25144), (byte) -57);
                      if (var9 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  v.field_d = true;
                  hc.field_d = 10;
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                if ((var5 ^ -1) == -6) {
                  pk.a((byte) -17, se.h(25144));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var5 != 6) {
                  break L10;
                } else {
                  if (!qi.field_M) {
                    break L10;
                  } else {
                    hc.field_d = 10;
                    break L10;
                  }
                }
              }
              L11: {
                if (var5 == 7) {
                  ki.a((byte) 96, se.h(25144));
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (8 == var5) {
                  be.a(se.h(25144), (byte) -57);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (9 != var5) {
                  break L13;
                } else {
                  bh.a(-114, se.h(25144));
                  break L13;
                }
              }
              L14: {
                if (10 != var5) {
                  break L14;
                } else {
                  we.field_b.f(17, -4);
                  break L14;
                }
              }
              L15: {
                if (-12 == (var5 ^ -1)) {
                  wb.a(se.h(25144), 30307);
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (-13 != (var5 ^ -1)) {
                  break L16;
                } else {
                  aj.a(vm.c(-30185), -88, se.h(25144));
                  break L16;
                }
              }
              L17: {
                if (13 == var5) {
                  try {
                    L18: {
                      L19: {
                        if (vg.field_E == null) {
                          vg.field_E = new oh(lf.field_e, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L20: {
                        if (!vg.field_E.a(-125)) {
                          break L20;
                        } else {
                          L21: {
                            L22: {
                              var13 = vg.field_E.a(false);
                              if (var13 != null) {
                                break L22;
                              } else {
                                var10 = (String) null;
                                jb.a((String) null, (byte) 45);
                                if (var9 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var8 = un.a(var13.field_r, 0, 0, var13.field_n);
                            jb.a(var8, (byte) 45);
                            break L21;
                          }
                          vg.field_E = null;
                          break L20;
                        }
                      }
                      break L18;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L23: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      qb.a((Throwable) ((Object) var6), 16408, "S1");
                      var11 = (String) null;
                      jb.a((String) null, (byte) 45);
                      vg.field_E = null;
                      break L23;
                    }
                  }
                  break L17;
                } else {
                  break L17;
                }
              }
              L24: {
                if ((var5 ^ -1) != -16) {
                  break L24;
                } else {
                  hc.field_d = 10;
                  break L24;
                }
              }
              if (-17 != (var5 ^ -1)) {
                if (17 != var5) {
                  return 0;
                } else {
                  return 2;
                }
              } else {
                return 1;
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

    private final void i(int param0) {
        String var2 = ui.a(param0 ^ -12040);
        oa.a(se.h(25144), -1, var2);
        if (param0 != 0) {
            this.f((byte) 100);
        }
    }

    final void g(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        var3 = client.field_A ? 1 : 0;
        if (param0 != 10) {
          return;
        } else {
          L0: {
            L1: {
              if (t.i((byte) 124)) {
                break L1;
              } else {
                if (ca.field_vb < 10) {
                  break L0;
                } else {
                  L2: {
                    if (!dl.a(480)) {
                      break L2;
                    } else {
                      L3: {
                        if (-1 == (hc.field_d ^ -1)) {
                          break L3;
                        } else {
                          ql.a(jk.field_c, (byte) -101);
                          if (var3 == 0) {
                            break L0;
                          } else {
                            break L3;
                          }
                        }
                      }
                      discarded$2 = this.a(false, -104, false);
                      if (var3 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ua.h((byte) -70);
                  if (var3 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L4: {
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (null == cl.field_v) {
                stackOut_13_0 = this;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L4;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L4;
              }
            }
            discarded$3 = this.a(stackIn_14_1 != 0, -41, false);
            break L0;
          }
          return;
        }
    }

    private final void e(byte param0) {
        te.field_v[13] = true;
        te.field_v[12] = true;
        te.field_v[11] = true;
        if (param0 != 13) {
            this.field_v = -26;
        }
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        int var5 = 0;
        int stackIn_22_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        String stackIn_109_2 = null;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        String stackIn_110_2 = null;
        int stackIn_111_0 = 0;
        int stackIn_111_1 = 0;
        String stackIn_111_2 = null;
        int stackIn_111_3 = 0;
        int stackIn_139_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        String stackOut_108_2 = null;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        String stackOut_110_2 = null;
        int stackOut_110_3 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        String stackOut_109_2 = null;
        int stackOut_109_3 = 0;
        int stackOut_138_0 = 0;
        int stackOut_137_0 = 0;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (li.field_b == null) {
            wf.b(19012);
            ql.c(-2);
            if (ta.a((byte) -35)) {
              break L0;
            } else {
              if ((hc.field_d ^ -1) == -12) {
                break L0;
              } else {
                fh.a(-52);
                break L0;
              }
            }
          } else {
            wf.b(19012);
            ql.c(-2);
            if (ta.a((byte) -35)) {
              break L0;
            } else {
              if ((hc.field_d ^ -1) == -12) {
                break L0;
              } else {
                fh.a(-52);
                break L0;
              }
            }
          }
        }
        L1: {
          if (null == uc.field_e) {
            break L1;
          } else {
            jk.field_c = uc.field_e.a(60);
            break L1;
          }
        }
        L2: {
          if (!si.c(-12851)) {
            break L2;
          } else {
            L3: {
              var3 = n.a((byte) -74) * 1200;
              if (this.field_p) {
                break L3;
              } else {
                if (var3 >= fl.a((byte) -108)) {
                  break L2;
                } else {
                  if (var3 >= ne.b((byte) -40)) {
                    break L2;
                  } else {
                    break L3;
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
            break L2;
          }
        }
        L4: {
          L5: {
            if ((s.field_Pb ^ -1) == 0) {
              break L5;
            } else {
              if (-1 != (s.field_Pb ^ -1)) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if ((s.field_Pb ^ -1) != 0) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L6;
            } else {
              stackOut_20_0 = 1;
              stackIn_22_0 = stackOut_20_0;
              break L6;
            }
          }
          L7: {
            var3 = stackIn_22_0;
            s.field_Pb = ib.l(102);
            if (var3 == 0) {
              break L7;
            } else {
              if (s.field_Pb != 0) {
                break L7;
              } else {
                if (-12 != (hc.field_d ^ -1)) {
                  break L7;
                } else {
                  if (!ea.c((byte) -57)) {
                    n.a(1);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
          }
          if (-1 == s.field_Pb) {
            break L4;
          } else {
            if (s.field_Pb != 0) {
              lb.field_d = ik.a(4) - -15000L;
              break L4;
            } else {
              break L4;
            }
          }
        }
        L8: {
          if (s.field_Pb == -1) {
            break L8;
          } else {
            if (s.field_Pb != 0) {
              L9: {
                if ((ca.field_vb ^ -1) > -11) {
                  break L9;
                } else {
                  if (-11 < (hc.field_d ^ -1)) {
                    break L8;
                  } else {
                    L10: {
                      L11: {
                        gh.a(false);
                        if (-4 == (s.field_Pb ^ -1)) {
                          break L11;
                        } else {
                          L12: {
                            if (4 == s.field_Pb) {
                              break L12;
                            } else {
                              L13: {
                                if (2 == s.field_Pb) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (s.field_Pb != 5) {
                                      break L14;
                                    } else {
                                      dd.a(ah.field_a, param1 + 11, 5);
                                      if (var5 == 0) {
                                        break L10;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  dd.a(kf.field_N, 0, 256);
                                  if (var5 == 0) {
                                    break L10;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              dd.a(kb.field_f, 0, 256);
                              if (var5 == 0) {
                                break L10;
                              } else {
                                break L12;
                              }
                            }
                          }
                          dd.a(ub.field_f, param1 + 11, 256);
                          if (var5 == 0) {
                            break L10;
                          } else {
                            break L11;
                          }
                        }
                      }
                      dd.a(ic.field_d, 0, 256);
                      break L10;
                    }
                    of.field_h = true;
                    if (var5 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              L15: {
                if ((s.field_Pb ^ -1) == -4) {
                  break L15;
                } else {
                  L16: {
                    if (4 == s.field_Pb) {
                      break L16;
                    } else {
                      L17: {
                        if (s.field_Pb != 2) {
                          break L17;
                        } else {
                          this.a(true, "js5connect_full");
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L18: {
                        if (-6 == (s.field_Pb ^ -1)) {
                          break L18;
                        } else {
                          this.a(true, "js5connect");
                          if (var5 == 0) {
                            break L8;
                          } else {
                            break L18;
                          }
                        }
                      }
                      this.a(true, "outofdate");
                      if (var5 == 0) {
                        break L8;
                      } else {
                        break L16;
                      }
                    }
                  }
                  this.a(true, "js5io");
                  if (var5 == 0) {
                    break L8;
                  } else {
                    break L15;
                  }
                }
              }
              this.a(true, "js5crc");
              break L8;
            } else {
              break L8;
            }
          }
        }
        L19: {
          L20: {
            L21: {
              if (s.field_Pb == -1) {
                break L21;
              } else {
                if (s.field_Pb != 0) {
                  break L20;
                } else {
                  break L21;
                }
              }
            }
            if (!ea.c((byte) -112)) {
              break L19;
            } else {
              break L20;
            }
          }
          if ((ik.a(4) ^ -1L) > (lb.field_d ^ -1L)) {
            break L19;
          } else {
            of.field_h = false;
            if ((s.field_Pb ^ -1) == 0) {
              break L19;
            } else {
              if (0 == s.field_Pb) {
                break L19;
              } else {
                s.field_Pb = -1;
                sn.c((byte) -116);
                break L19;
              }
            }
          }
        }
        L22: {
          if (s.field_Pb != 0) {
            break L22;
          } else {
            if (!ea.c((byte) -112)) {
              tf.field_bb = false;
              break L22;
            } else {
              break L22;
            }
          }
        }
        L23: {
          if (-1 == (ca.field_vb ^ -1)) {
            if (!nf.c(48)) {
              break L23;
            } else {
              ca.field_vb = 1;
              break L23;
            }
          } else {
            break L23;
          }
        }
        L24: {
          if ((ca.field_vb ^ -1) != -2) {
            break L24;
          } else {
            L25: {
              if (0 != kd.field_p) {
                vj.field_a = vg.a(vh.field_d, 34);
                break L25;
              } else {
                break L25;
              }
            }
            sk.field_f = tf.a(1, param1 + 131, false, true, cg.field_a);
            rc.field_k = tf.a(1, 127, false, true, a.field_h);
            ph.field_Fb = tf.a(1, 113, false, true, rf.field_d);
            ah.field_i = sk.field_f;
            ca.field_vb = 2;
            qc.field_vb = rc.field_k;
            break L24;
          }
        }
        L26: {
          if ((ca.field_vb ^ -1) != -3) {
            break L26;
          } else {
            L27: {
              if (vj.field_a != null) {
                if (vj.field_a.a((byte) 121)) {
                  L28: {
                    if (vj.field_a.a("", param1 ^ -11)) {
                      break L28;
                    } else {
                      vj.field_a = null;
                      if (var5 == 0) {
                        break L27;
                      } else {
                        break L28;
                      }
                    }
                  }
                  if (!vj.field_a.a("", (byte) -94)) {
                    break L27;
                  } else {
                    ml.a(vj.field_a, (byte) 117);
                    vj.field_a = null;
                    vj.a(true);
                    break L27;
                  }
                } else {
                  break L27;
                }
              } else {
                break L27;
              }
            }
            if (vj.field_a == null) {
              ca.field_vb = 3;
              break L26;
            } else {
              break L26;
            }
          }
        }
        L29: {
          if (3 != ca.field_vb) {
            break L29;
          } else {
            if (!ta.a(sk.field_f, rc.field_k, -21, ph.field_Fb)) {
              break L29;
            } else {
              if (!ba.a(ph.field_Fb, -2147483648)) {
                break L29;
              } else {
                L30: {
                  L31: {
                    e.b(-8621);
                    nm.h((byte) 112);
                    qi.field_M = false;
                    he.field_hb = wf.field_m;
                    se.a(sk.field_f, ph.field_Fb, (byte) 76, ce.field_w, rc.field_k);
                    if (ge.field_j) {
                      break L31;
                    } else {
                      if (null == vd.field_q) {
                        break L30;
                      } else {
                        break L31;
                      }
                    }
                  }
                  L32: {
                    if (ge.field_j) {
                      stackOut_107_0 = 0;
                      stackIn_108_0 = stackOut_107_0;
                      break L32;
                    } else {
                      stackOut_106_0 = 1;
                      stackIn_108_0 = stackOut_106_0;
                      break L32;
                    }
                  }
                  L33: {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = -86;
                    stackOut_108_2 = vd.field_q;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_110_1 = stackOut_108_1;
                    stackIn_110_2 = stackOut_108_2;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    stackIn_109_2 = stackOut_108_2;
                    if (ge.field_j) {
                      stackOut_110_0 = stackIn_110_0;
                      stackOut_110_1 = stackIn_110_1;
                      stackOut_110_2 = (String) ((Object) stackIn_110_2);
                      stackOut_110_3 = 0;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      stackIn_111_2 = stackOut_110_2;
                      stackIn_111_3 = stackOut_110_3;
                      break L33;
                    } else {
                      stackOut_109_0 = stackIn_109_0;
                      stackOut_109_1 = stackIn_109_1;
                      stackOut_109_2 = (String) ((Object) stackIn_109_2);
                      stackOut_109_3 = 1;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      stackIn_111_2 = stackOut_109_2;
                      stackIn_111_3 = stackOut_109_3;
                      break L33;
                    }
                  }
                  rb.a(stackIn_111_0 != 0, (byte) stackIn_111_1, stackIn_111_2, stackIn_111_3 != 0);
                  break L30;
                }
                L34: {
                  if (!om.field_f) {
                    break L34;
                  } else {
                    rk.c(false);
                    break L34;
                  }
                }
                L35: {
                  if (null != hm.field_c) {
                    break L35;
                  } else {
                    hm.field_c = pk.a(15000);
                    ea.field_r = i.a(1);
                    break L35;
                  }
                }
                ed.a(ph.field_Fb, ea.field_r, hm.field_c, 20350);
                sk.field_f = null;
                rc.field_k = null;
                ph.field_Fb = null;
                rd.a((java.applet.Applet) (this), false);
                vj.a(true);
                ca.field_vb = 10;
                break L29;
              }
            }
          }
        }
        L36: {
          if ((ca.field_vb ^ -1) != param1) {
            break L36;
          } else {
            L37: {
              if (0 == kd.field_p) {
                break L37;
              } else {
                wk.field_q = vg.a(gi.field_e, 112);
                break L37;
              }
            }
            ca.field_vb = 11;
            break L36;
          }
        }
        L38: {
          if ((ca.field_vb ^ -1) == -12) {
            L39: {
              L40: {
                if (null == wk.field_q) {
                  break L40;
                } else {
                  if (!wk.field_q.a((byte) 121)) {
                    break L39;
                  } else {
                    if (!wk.field_q.a(false)) {
                      break L39;
                    } else {
                      break L40;
                    }
                  }
                }
              }
              ca.field_vb = 12;
              of.field_c = true;
              if (var5 == 0) {
                break L38;
              } else {
                break L39;
              }
            }
            qi.a(0.0f, -78, ad.a(wk.field_q, fe.field_a, true, eb.field_n));
            break L38;
          } else {
            break L38;
          }
        }
        L41: {
          if (12 != ca.field_vb) {
            break L41;
          } else {
            if (of.field_c) {
              break L41;
            } else {
              ca.field_vb = 13;
              break L41;
            }
          }
        }
        L42: {
          if ((ca.field_vb ^ -1) == -14) {
            L43: {
              var3 = 1;
              if (sh.field_g == null) {
                break L43;
              } else {
                L44: {
                  if (!sh.field_g.a(-57)) {
                    stackOut_138_0 = 0;
                    stackIn_139_0 = stackOut_138_0;
                    break L44;
                  } else {
                    stackOut_137_0 = 1;
                    stackIn_139_0 = stackOut_137_0;
                    break L44;
                  }
                }
                var3 = stackIn_139_0;
                qi.a(sh.field_g.field_l, param1 + 82, sh.field_g.field_a);
                break L43;
              }
            }
            if (var3 == 0) {
              break L42;
            } else {
              ca.field_vb = 20;
              break L42;
            }
          } else {
            break L42;
          }
        }
        L45: {
          if (param0) {
            break L45;
          } else {
            if (!jg.field_e) {
              break L45;
            } else {
              tj.a(false, jh.field_b);
              this.b((byte) -91);
              hl.a(jh.field_b, (byte) -97);
              break L45;
            }
          }
        }
        L46: {
          if (te.field_v[8]) {
            ec.a(param1 + -82);
            break L46;
          } else {
            break L46;
          }
        }
    }

    final int a(boolean param0, byte param1) {
        if (param1 != 102) {
            this.field_t = false;
        }
        return this.a(param0, param1 ^ -124, true);
    }

    final void f(byte param0) {
        int var2 = 0;
        hl var3 = null;
        int var4 = 0;
        int stackIn_38_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_39_1 = 0;
        int stackOut_38_0 = 0;
        int stackOut_38_1 = 0;
        L0: {
          var4 = client.field_A ? 1 : 0;
          if (param0 >= 115) {
            break L0;
          } else {
            this.g(-60);
            break L0;
          }
        }
        L1: {
          var2 = bh.field_k;
          if (var2 >= 64) {
            break L1;
          } else {
            if (te.field_v[var2]) {
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  L3: {
                    if (-2 != (var2 ^ -1)) {
                      break L3;
                    } else {
                      ua.i((byte) -21);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (2 != var2) {
                      break L4;
                    } else {
                      ke.e((byte) 48);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (var2 == 3) {
                      break L5;
                    } else {
                      L6: {
                        if (var2 != 4) {
                          break L6;
                        } else {
                          cm.a((byte) 53);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (5 == var2) {
                          break L7;
                        } else {
                          L8: {
                            if ((var2 ^ -1) != -7) {
                              break L8;
                            } else {
                              ul.a((byte) 112);
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (7 == var2) {
                              break L9;
                            } else {
                              L10: {
                                if ((var2 ^ -1) == -9) {
                                  break L10;
                                } else {
                                  L11: {
                                    if (-17 == (var2 ^ -1)) {
                                      break L11;
                                    } else {
                                      L12: {
                                        if (var2 == 11) {
                                          break L12;
                                        } else {
                                          if (-13 == (var2 ^ -1)) {
                                            break L12;
                                          } else {
                                            L13: {
                                              if (13 != var2) {
                                                break L13;
                                              } else {
                                                oe.c(false);
                                                if (var4 == 0) {
                                                  break L2;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                            L14: {
                                              if (17 != var2) {
                                                break L14;
                                              } else {
                                                this.l(-33);
                                                if (var4 == 0) {
                                                  break L2;
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            L15: {
                                              if (-19 == (var2 ^ -1)) {
                                                break L15;
                                              } else {
                                                qb.a((Throwable) null, 16408, "MGS1: " + qk.d((byte) 52));
                                                si.a(65);
                                                if (var4 == 0) {
                                                  break L2;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            ne.c(27721);
                                            if (var4 == 0) {
                                              break L2;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                      }
                                      L16: {
                                        stackOut_37_0 = 0;
                                        stackIn_39_0 = stackOut_37_0;
                                        stackIn_38_0 = stackOut_37_0;
                                        if (var2 != 12) {
                                          stackOut_39_0 = stackIn_39_0;
                                          stackOut_39_1 = 0;
                                          stackIn_40_0 = stackOut_39_0;
                                          stackIn_40_1 = stackOut_39_1;
                                          break L16;
                                        } else {
                                          stackOut_38_0 = stackIn_38_0;
                                          stackOut_38_1 = 1;
                                          stackIn_40_0 = stackOut_38_0;
                                          stackIn_40_1 = stackOut_38_1;
                                          break L16;
                                        }
                                      }
                                      var3 = ki.a(stackIn_40_0, stackIn_40_1 != 0);
                                      cl.a(var3, true);
                                      if (var4 == 0) {
                                        break L2;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  wm.d(140);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              qn.a(sm.field_e, lf.field_e, 4210752, de.field_V);
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L9;
                              }
                            }
                          }
                          this.i(0);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L7;
                          }
                        }
                      }
                      pe.b(14750);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  dk.a(69);
                  break L2;
                }
                return;
              }
            } else {
              break L1;
            }
          }
        }
        qb.a((Throwable) null, 16408, "MGS2: " + qk.d((byte) 127));
        si.a(119);
    }

    private final void h(byte param0) {
        te.field_v[4] = true;
        if (param0 != -25) {
            this.field_q = 127;
        }
    }

    final void a(int param0, int param1, String param2) {
        try {
            if (param0 != -2990) {
                this.field_m = (String) null;
            }
            this.a(param1, false, 480, 640, param2);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "bd.UA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, boolean param1) {
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
    }

    private final int j(int param0) {
        int var2 = 0;
        if (this.field_f) {
          return -1;
        } else {
          if (ea.c((byte) -38)) {
            if (of.field_h) {
              return -1;
            } else {
              var2 = sn.a(aa.a(param0 + -68), this.field_r, pc.a(2), (byte) 55, this.field_v, true);
              if (-1 == var2) {
                return -1;
              } else {
                L0: {
                  if (0 == var2) {
                    if (-12 == (hc.field_d ^ -1)) {
                      if (-1 == (s.field_Pb ^ -1)) {
                        n.a(1);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      if (-12 == (hc.field_d ^ -1)) {
                        if (-1 == (s.field_Pb ^ -1)) {
                          n.a(1);
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if (-12 == (hc.field_d ^ -1)) {
                      if (-1 == (s.field_Pb ^ -1)) {
                        n.a(1);
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
          } else {
            return -1;
          }
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != -27096) {
            return;
        }
        ul.field_g = 1000000000L / (long)param0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        java.awt.Frame var10 = null;
        var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param1 <= 2) {
          return;
        } else {
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
          return;
        }
    }

    private final void m(int param0) {
        te.field_v[1] = true;
        if (param0 != -1) {
            this.field_o = 49;
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        L0: {
          this.a(77, true);
          if (param0) {
            this.m(-1);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (!param2) {
            break L1;
          } else {
            this.k(7);
            break L1;
          }
        }
        if (param3) {
          return;
        } else {
          L2: {
            if (param5) {
              this.h((byte) -25);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param6) {
              this.c((byte) 87);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!param4) {
              break L4;
            } else {
              this.h(-1);
              break L4;
            }
          }
          L5: {
            if (!param1) {
              break L5;
            } else {
              this.e((byte) 13);
              break L5;
            }
          }
          return;
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3, String param4) {
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
        Object stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        int stackIn_20_3 = 0;
        Object stackIn_21_0 = null;
        String stackIn_21_1 = null;
        int stackIn_21_2 = 0;
        int stackIn_21_3 = 0;
        Object stackIn_22_0 = null;
        String stackIn_22_1 = null;
        int stackIn_22_2 = 0;
        int stackIn_22_3 = 0;
        int stackIn_22_4 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
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
        Object stackOut_19_0 = null;
        String stackOut_19_1 = null;
        int stackOut_19_2 = 0;
        int stackOut_19_3 = 0;
        Object stackOut_21_0 = null;
        String stackOut_21_1 = null;
        int stackOut_21_2 = 0;
        int stackOut_21_3 = 0;
        int stackOut_21_4 = 0;
        Object stackOut_20_0 = null;
        String stackOut_20_1 = null;
        int stackOut_20_2 = 0;
        int stackOut_20_3 = 0;
        int stackOut_20_4 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.a((byte) -29)) {
                  L2: {
                    L3: {
                      this.field_m = this.getCodeBase().getHost();
                      var6_ref2 = this.field_m.toLowerCase();
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
                    ((bd) (this)).field_r = stackIn_7_1 != 0;
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
                      stackOut_19_0 = this;
                      stackOut_19_1 = (String) (param4);
                      stackOut_19_2 = 32;
                      stackOut_19_3 = param0;
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_21_1 = stackOut_19_1;
                      stackIn_21_2 = stackOut_19_2;
                      stackIn_21_3 = stackOut_19_3;
                      stackIn_20_0 = stackOut_19_0;
                      stackIn_20_1 = stackOut_19_1;
                      stackIn_20_2 = stackOut_19_2;
                      stackIn_20_3 = stackOut_19_3;
                      if (param1) {
                        stackOut_21_0 = this;
                        stackOut_21_1 = (String) ((Object) stackIn_21_1);
                        stackOut_21_2 = stackIn_21_2;
                        stackOut_21_3 = stackIn_21_3;
                        stackOut_21_4 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        stackIn_22_2 = stackOut_21_2;
                        stackIn_22_3 = stackOut_21_3;
                        stackIn_22_4 = stackOut_21_4;
                        break L8;
                      } else {
                        stackOut_20_0 = this;
                        stackOut_20_1 = (String) ((Object) stackIn_20_1);
                        stackOut_20_2 = stackIn_20_2;
                        stackOut_20_3 = stackIn_20_3;
                        stackOut_20_4 = 1;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        stackIn_22_2 = stackOut_20_2;
                        stackIn_22_3 = stackOut_20_3;
                        stackIn_22_4 = stackOut_20_4;
                        break L8;
                      }
                    }
                    this.a(stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_22_4 != 0, param2, param3, this.field_u);
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
                  var6 = (Exception) (Object) decompiledCaughtException;
                  var10 = (String) null;
                  qb.a((Throwable) ((Object) var6), 16408, (String) null);
                  stackOut_24_0 = this;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_25_0 = stackOut_24_0;
                  if (param1) {
                    stackOut_26_0 = this;
                    stackOut_26_1 = 0;
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    break L10;
                  } else {
                    stackOut_25_0 = this;
                    stackOut_25_1 = 1;
                    stackIn_27_0 = stackOut_25_0;
                    stackIn_27_1 = stackOut_25_1;
                    break L10;
                  }
                }
                this.a(stackIn_27_1 != 0, "crash");
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
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var6_ref);
            stackOut_29_1 = new StringBuilder().append("bd.VA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param4 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L11;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L11;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
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
        int var1 = -5 % ((param0 - -47) / 44);
        return true;
    }

    private final void l(int param0) {
        int var3 = 105 / ((param0 - 27) / 38);
        int var2 = de.field_V.d((byte) -124);
        int var4 = (var2 & 1) != 0 ? 1 : 0;
        int var5 = sm.field_e - 1;
        byte[] var6 = new byte[var5];
        de.field_V.a(-67, var6, var5, 0);
        c.a((byte) 84, qj.a(var6, 2), var4 != 0, se.h(25144));
    }

    private final void k(int param0) {
        if (param0 != 7) {
            return;
        }
        te.field_v[2] = true;
    }

    final int g(byte param0) {
        int var2 = 0;
        L0: {
          var2 = this.j(-1);
          if (param0 > 122) {
            break L0;
          } else {
            this.field_w = -122;
            break L0;
          }
        }
        L1: {
          L2: {
            if (0 == var2) {
              break L2;
            } else {
              if (var2 == 1) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (!te.field_v[1]) {
              break L3;
            } else {
              qn.c(-20494, 2);
              break L3;
            }
          }
          L4: {
            if (te.field_v[2]) {
              dg.a(-111, 3);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!te.field_v[3]) {
              break L5;
            } else {
              of.a(false, 4);
              break L5;
            }
          }
          L6: {
            if (te.field_v[4]) {
              wa.a(3, 5);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!te.field_v[5]) {
              break L7;
            } else {
              bh.a(6, -120);
              break L7;
            }
          }
          L8: {
            if (te.field_v[6]) {
              dl.b(640, 7);
              break L8;
            } else {
              break L8;
            }
          }
          if (te.field_v[8]) {
            ga.b((byte) -112);
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
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
        } else {
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
          return;
        }
    }

    protected bd() {
    }

    static {
    }
}
