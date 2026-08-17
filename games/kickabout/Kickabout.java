/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Kickabout extends tu {
    private boolean field_L;
    static sj field_J;
    static String field_I;
    static hd field_H;
    static String field_F;
    public static int field_G;

    public final void a(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_17_0 = 0;
        js stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        js stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        boolean stackIn_59_0 = false;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        pt var8;
        pt var9;
        L0: {
          var7 = field_G;
          stackIn_2_0 = this;

          if (!param1) {
            stackIn_3_0 = this;
            stackIn_3_1 = 0;
            break L0;
          } else {
            stackIn_3_0 = this;
            stackIn_3_1 = 1;
            break L0;
          }
        }
        L1: {
          L2: {
            ((Kickabout) (this)).field_L = stackIn_3_1 != 0;
            gi.b(17702);
            if (!pf.field_c) {
              break L2;
            } else {
              if (!this.field_L) {
                break L2;
              } else {
                L3: {
                  if (null != e.field_m) {
                    break L3;
                  } else {
                    if (!vb.field_k) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  L5: {
                    if (ra.field_G == null) {
                      break L5;
                    } else {
                      if (um.field_e == ra.field_G) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (cq.field_h != um.field_e) {
                    break L2;
                  } else {
                    if (null != ra.field_G) {
                      break L2;
                    } else {
                      break L4;
                    }
                  }
                }
                if (!um.field_e.f((byte) 29)) {
                  break L2;
                } else {
                  stackIn_17_0 = 1;
                  break L1;
                }
              }
            }
          }
          stackIn_17_0 = 0;
          break L1;
        }
        L6: {
          L7: {
            L8: {
              kw.b(stackIn_17_0 != 0, (byte) -116);
              re.b(param0 ^ -105);
              ((eh) ((Object) ma.field_t)).e(0);
              if (um.field_e != null) {
                break L8;
              } else {
                if (wh.field_q) {
                  break L8;
                } else {
                  if (!od.field_n) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
            }
            if (null == um.field_e) {
              break L6;
            } else {
              if (!ja.field_O) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          io.a(2);
          break L6;
        }
        L9: {
          if (param0 == -25) {
            break L9;
          } else {
            this.c((byte) -89);
            break L9;
          }
        }
        L10: {
          L11: {
            stackIn_30_0 = cq.field_h;

            stackIn_30_1 = -96;

            if (!this.field_L) {
              break L11;
            } else {
              stackIn_30_0 = (js) ((Object) stackIn_30_0);

              if (null != ra.field_G) {
                break L11;
              } else {
                stackIn_31_0 = (js) ((Object) stackIn_30_0);
                stackIn_31_1 = stackIn_30_1;
                stackIn_31_2 = 1;
                break L10;
              }
            }
          }
          stackIn_31_0 = (js) ((Object) stackIn_30_0);
          stackIn_31_1 = stackIn_30_1;
          stackIn_31_2 = 0;
          break L10;
        }
        L12: {
          ((js) (Object) stackIn_31_0).a((byte) stackIn_31_1, stackIn_31_2 != 0);
          if (ra.field_G == null) {
            L13: {
              if (um.field_e == null) {
                break L13;
              } else {
                if (cq.field_h != um.field_e) {
                  um.field_e.a((byte) 119, false);
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (null == sr.field_l) {
              break L12;
            } else {
              if (sr.field_l != cq.field_h) {
                sr.field_l.a((byte) -116, false);
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            L14: {
              var3 = (ce.field_I << 1946523368) / 24;
              cq.field_h.a(var3, false, -53, ra.field_G);
              ra.field_G.a(var3, true, -100, cq.field_h);
              ra.field_G.a((byte) -51, false);
              if (ka.field_b) {
                break L14;
              } else {
                ce.field_I = ce.field_I + 1;
                break L14;
              }
            }
            var4 = -ce.field_I + 24;
            var5 = (var4 * var4 << 742170152) / 576;
            var6 = -var5 + 256;
            wr.field_f = var5 * po.a(cq.field_h, -4) - -(po.a(ra.field_G, -4) * var6) >> -714215864;
            if (-25 == (ce.field_I ^ -1)) {
              cv.a((byte) 105);
              break L12;
            } else {
              break L12;
            }
          }
        }
        L15: {
          dh.b(true);
          if (!this.field_L) {
            break L15;
          } else {
            var9 = (pt) ((Object) tu.field_E.field_g.g(24009));
            L16: while (true) {
              L17: {
                if (var9 == null) {
                  var8 = (pt) ((Object) vd.field_a.g(param0 + 24034));
                  L18: while (true) {
                    if (var8 == null) {
                      stackIn_59_0 = tu.field_E.field_m;
                      break L17;
                    } else {
                      var8.c((byte) -109);
                      stackIn_59_0 = gi.a(140, var8);

                      L19: {
                        if (!stackIn_59_0) {
                          break L19;
                        } else {
                          gu.a((byte) -25, var8, false);
                          break L19;
                        }
                      }
                      var8 = (pt) ((Object) vd.field_a.c(33));
                      continue L18;
                    }
                  }
                } else {
                  var9.c((byte) -109);
                  stackIn_59_0 = gi.a(param0 ^ -149, var9);

                  L20: {
                    if (!stackIn_59_0) {
                      break L20;
                    } else {
                      gu.a((byte) -25, var9, true);
                      break L20;
                    }
                  }
                  var9 = (pt) ((Object) tu.field_E.field_g.c(33));
                  continue L16;
                }
              }
              L21: {
                if (!stackIn_59_0) {
                  break L21;
                } else {
                  gw.c(0);
                  tu.field_E.field_m = false;
                  break L21;
                }
              }
              this.u(param0 ^ 23294);
              break L15;
            }
          }
        }
        L22: {
          if (!la.a(100)) {
            break L22;
          } else {
            if (ws.field_f) {
              ql.a(31663);
              ws.field_f = false;
              break L22;
            } else {
              break L22;
            }
          }
        }
    }

    private final void u(int param0) {
        if (param0 != -23271) {
            return;
        }
        if (lf.field_b == null || "" == lf.field_b) {
            return;
        }
        if (!(-1 != (ak.a(cq.field_h, param0 + 23275) ^ -1))) {
            return;
        }
        ot var2 = jm.field_g == null ? (ot) ((Object) sf.field_C) : jm.field_g;
        int var3 = -var2.field_o + 640 >> 807795265;
        if ((el.field_A ^ -1) <= (var3 ^ -1) && var2.field_o + var3 >= el.field_A && 10 <= n.field_m) {
            if (!((n.field_m ^ -1) < (10 - -var2.field_v ^ -1))) {
                qd.a((byte) -67, lf.field_b);
            }
        }
    }

    final void a(int param0, byte param1) {
        int var3;
        int var4;
        L0: {
          var4 = field_G;
          kp.a(4, -120);
          mf.a(7, (byte) -97);
          if (cq.field_h instanceof sc) {
            jm.a(0, false, -2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var3 = -37 % ((-39 - param1) / 32);
          if ((param0 ^ -1) == -2) {
            an.field_d = true;
            ec.field_e = true;
            break L1;
          } else {
            L2: {
              if (!od.field_n) {
                break L2;
              } else {
                L3: {
                  wi.field_B = true;
                  al.field_Db = true;
                  k.field_k = true;
                  if (null != um.field_e) {
                    L4: {
                      if (!um.field_e.e(-2)) {
                        ka.a(2, uc.field_B);
                        ng.a(10, 113);
                        break L4;
                      } else {
                        ng.a(0, 104);
                        break L4;
                      }
                    }
                    jm.a(18, false, -2);
                    break L3;
                  } else {
                    if (sr.field_l == null) {
                      jm.a(0, false, -2);
                      break L3;
                    } else {
                      ka.a(2, uc.field_B);
                      ng.a(10, 112);
                      jm.a(18, false, -2);
                      break L3;
                    }
                  }
                }
                od.field_n = false;
                vr.b(1);
                break L2;
              }
            }
            ec.field_e = false;
            an.field_d = false;
            break L1;
          }
        }
    }

    public static void o(byte param0) {
        field_H = null;
        field_I = null;
        field_F = null;
        field_J = null;
        if (param0 >= -35) {
            Kickabout.o((byte) -40);
        }
    }

    private final void w(int param0) {
        int var3;
        int var4;
        int var5;
        int var6;
        ot var7;
        Object stackIn_5_0 = null;
        if (param0 >= 95) {
          L0: {
            if (null != jm.field_g) {
              stackIn_5_0 = jm.field_g;
              break L0;
            } else {
              stackIn_5_0 = sf.field_C;
              break L0;
            }
          }
          L1: {
            var7 = (ot) ((Object) stackIn_5_0);
            var3 = 640 - var7.field_o >> -546195231;
            var4 = ak.a(cq.field_h, 4);
            if (ra.field_G == null) {
              break L1;
            } else {
              var5 = ak.a(ra.field_G, 4);
              if (var4 > var5) {
                var6 = Math.min(256, (ce.field_I << 2124633513) / 24);
                var4 = var4 + ((-var4 + var5) * var6 >> -1826280728);
                break L1;
              } else {
                if (var5 <= var4) {
                  break L1;
                } else {
                  var6 = Math.max(0, -256 + 2 * ((ce.field_I << 2140220136) / 24));
                  var4 = var4 + ((-var4 + var5) * var6 >> 958509256);
                  break L1;
                }
              }
            }
          }
          L2: {
            if (256 != var4) {
              break L2;
            } else {
              var7.c(var3, 10);
              break L2;
            }
          }
          L3: {
            if (0 != var4) {
              var7.b(var3, 10, var4);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          return;
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        int fieldTemp$0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_131_0 = 0;
        boolean stackIn_140_0 = false;
        int stackIn_146_0 = 0;
        int stackIn_151_0 = 0;
        int stackIn_156_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_183_0 = 0;
        int stackIn_192_0 = 0;
        int stackIn_240_0 = 0;
        boolean stackOut_139_0;
        int var4;
        int var5;
        int var6_int;
        js var6;
        String[] var7_ref_String__;
        int var7;
        int var8;
        int var9;
        String[] var10;
        String var11;
        hn var12;
        L0: {
          var9 = field_G;
          var4 = ne.field_G[82] ? 1 : 0;
          var5 = ne.field_G[86] ? 1 : 0;
          if (!ka.field_b) {
            break L0;
          } else {
            if (83 != param1) {
              break L0;
            } else {
              ce.field_I = ce.field_I + 1;
              return true;
            }
          }
        }
        L1: {
          if (param1 != 103) {
            break L1;
          } else {
            if ((tb.field_v ^ -1) == -2) {
              tb.field_v = 0;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (102 != param1) {
            break L2;
          } else {
            if (tb.field_v == 0) {
              tb.field_v = 1;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (fm.a(false)) {
            L4: {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        if (var4 == 0) {
                          break L9;
                        } else {
                          if (var5 == 0) {
                            break L9;
                          } else {
                            if (param1 == 51) {
                              var11 = "The quick brown fox jumped over the lazy rabbit. Also this sentence is getting quite long with some long words that might not fit at end of a sentence/line but we shall see. Oooh double-barrel-ness, see how it deals with that.";
                              var10 = og.a(var11, 100, (byte) -69);
                              var7_ref_String__ = var10;
                              if (var7_ref_String__ != null) {
                                var8 = 0;
                                L10: while (true) {
                                  if (var10.length <= var8) {
                                    return true;
                                  } else {
                                    System.out.println(var10[var8]);
                                    var8++;
                                    continue L10;
                                  }
                                }
                              } else {
                                return true;
                              }
                            } else {
                              if (param2 == 96) {
                                break L8;
                              } else {
                                gd.field_a = false;
                                return true;
                              }
                            }
                          }
                        }
                      }
                      if (param2 == 96) {
                        r.field_d = new kd(qo.d((byte) 26), pb.field_C, oo.field_c);
                        oa.a(false, r.field_d);
                        return r.field_d.a(11516, param1, param2);
                      } else {
                        if (-90 != (param1 ^ -1)) {
                          if (var4 == 0) {
                            if (var4 != 0) {
                              if (16 != param1) {
                                if ((param1 ^ -1) == -18) {
                                  L11: {
                                    if (hr.field_k) {
                                      stackIn_115_0 = 0;
                                      break L11;
                                    } else {
                                      stackIn_115_0 = 1;
                                      break L11;
                                    }
                                  }
                                  hr.field_k = stackIn_115_0 != 0;
                                  return true;
                                } else {
                                  if ((param1 ^ -1) != -19) {
                                    if ((param1 ^ -1) == -20) {
                                      L12: {
                                        if (th.field_d) {
                                          stackIn_126_0 = 0;
                                          break L12;
                                        } else {
                                          stackIn_126_0 = 1;
                                          break L12;
                                        }
                                      }
                                      th.field_d = stackIn_126_0 != 0;
                                      return true;
                                    } else {
                                      if (-21 != (param1 ^ -1)) {
                                        if ((param1 ^ -1) != -22) {
                                          break L6;
                                        } else {
                                          var6_int = 0;
                                          L13: while (true) {
                                            if (tu.field_E.field_J.length <= var6_int) {
                                              break L7;
                                            } else {
                                              tu.field_E.field_J[var6_int] = true;
                                              var6_int++;
                                              continue L13;
                                            }
                                          }
                                        }
                                      } else {
                                        L14: {
                                          if (wl.field_g) {
                                            stackIn_131_0 = 0;
                                            break L14;
                                          } else {
                                            stackIn_131_0 = 1;
                                            break L14;
                                          }
                                        }
                                        wl.field_g = stackIn_131_0 != 0;
                                        return true;
                                      }
                                    }
                                  } else {
                                    L15: {
                                      if (wl.field_o) {
                                        stackIn_120_0 = 0;
                                        break L15;
                                      } else {
                                        stackIn_120_0 = 1;
                                        break L15;
                                      }
                                    }
                                    wl.field_o = stackIn_120_0 != 0;
                                    return true;
                                  }
                                }
                              } else {
                                L16: {
                                  if (gd.field_a) {
                                    stackIn_109_0 = 0;
                                    break L16;
                                  } else {
                                    stackIn_109_0 = 1;
                                    break L16;
                                  }
                                }
                                gd.field_a = stackIn_109_0 != 0;
                                return true;
                              }
                            } else {
                              break L4;
                            }
                          } else {
                            if (var5 != 0) {
                              if ((param1 ^ -1) != -2) {
                                if (2 == param1) {
                                  nm.a(rm.field_C, -76, true, ih.field_c);
                                  gs.a(0);
                                  return true;
                                } else {
                                  if (var4 != 0) {
                                    if (16 != param1) {
                                      if ((param1 ^ -1) == -18) {
                                        L17: {
                                          if (hr.field_k) {
                                            stackIn_81_0 = 0;
                                            break L17;
                                          } else {
                                            stackIn_81_0 = 1;
                                            break L17;
                                          }
                                        }
                                        hr.field_k = stackIn_81_0 != 0;
                                        return true;
                                      } else {
                                        if ((param1 ^ -1) != -19) {
                                          if ((param1 ^ -1) == -20) {
                                            L18: {
                                              if (th.field_d) {
                                                stackIn_92_0 = 0;
                                                break L18;
                                              } else {
                                                stackIn_92_0 = 1;
                                                break L18;
                                              }
                                            }
                                            th.field_d = stackIn_92_0 != 0;
                                            return true;
                                          } else {
                                            if (-21 != (param1 ^ -1)) {
                                              if ((param1 ^ -1) != -22) {
                                                break L6;
                                              } else {
                                                var6_int = 0;
                                                L19: while (true) {
                                                  if (tu.field_E.field_J.length <= var6_int) {
                                                    break L7;
                                                  } else {
                                                    tu.field_E.field_J[var6_int] = true;
                                                    var6_int++;
                                                    continue L19;
                                                  }
                                                }
                                              }
                                            } else {
                                              L20: {
                                                if (wl.field_g) {
                                                  stackIn_97_0 = 0;
                                                  break L20;
                                                } else {
                                                  stackIn_97_0 = 1;
                                                  break L20;
                                                }
                                              }
                                              wl.field_g = stackIn_97_0 != 0;
                                              return true;
                                            }
                                          }
                                        } else {
                                          L21: {
                                            if (wl.field_o) {
                                              stackIn_86_0 = 0;
                                              break L21;
                                            } else {
                                              stackIn_86_0 = 1;
                                              break L21;
                                            }
                                          }
                                          wl.field_o = stackIn_86_0 != 0;
                                          return true;
                                        }
                                      }
                                    } else {
                                      L22: {
                                        if (gd.field_a) {
                                          stackIn_75_0 = 0;
                                          break L22;
                                        } else {
                                          stackIn_75_0 = 1;
                                          break L22;
                                        }
                                      }
                                      gd.field_a = stackIn_75_0 != 0;
                                      return true;
                                    }
                                  } else {
                                    break L4;
                                  }
                                }
                              } else {
                                nm.a(rm.field_C, param0 + -11592, false, ih.field_c);
                                gs.a(0);
                                return true;
                              }
                            } else {
                              if (var4 != 0) {
                                break L8;
                              } else {
                                break L4;
                              }
                            }
                          }
                        } else {
                          System.gc();
                          return true;
                        }
                      }
                    }
                    if (16 != param1) {
                      if ((param1 ^ -1) == -18) {
                        L23: {
                          if (hr.field_k) {
                            stackIn_44_0 = 0;
                            break L23;
                          } else {
                            stackIn_44_0 = 1;
                            break L23;
                          }
                        }
                        hr.field_k = stackIn_44_0 != 0;
                        return true;
                      } else {
                        if ((param1 ^ -1) != -19) {
                          if ((param1 ^ -1) == -20) {
                            L24: {
                              if (th.field_d) {
                                stackIn_55_0 = 0;
                                break L24;
                              } else {
                                stackIn_55_0 = 1;
                                break L24;
                              }
                            }
                            th.field_d = stackIn_55_0 != 0;
                            return true;
                          } else {
                            if (-21 != (param1 ^ -1)) {
                              if ((param1 ^ -1) != -22) {
                                break L6;
                              } else {
                                var6_int = 0;
                                L25: while (true) {
                                  if (tu.field_E.field_J.length <= var6_int) {
                                    break L7;
                                  } else {
                                    tu.field_E.field_J[var6_int] = true;
                                    var6_int++;
                                    continue L25;
                                  }
                                }
                              }
                            } else {
                              L26: {
                                if (wl.field_g) {
                                  stackIn_60_0 = 0;
                                  break L26;
                                } else {
                                  stackIn_60_0 = 1;
                                  break L26;
                                }
                              }
                              wl.field_g = stackIn_60_0 != 0;
                              return true;
                            }
                          }
                        } else {
                          L27: {
                            if (wl.field_o) {
                              stackIn_49_0 = 0;
                              break L27;
                            } else {
                              stackIn_49_0 = 1;
                              break L27;
                            }
                          }
                          wl.field_o = stackIn_49_0 != 0;
                          return true;
                        }
                      }
                    } else {
                      L28: {
                        if (gd.field_a) {
                          stackIn_38_0 = 0;
                          break L28;
                        } else {
                          stackIn_38_0 = 1;
                          break L28;
                        }
                      }
                      gd.field_a = stackIn_38_0 != 0;
                      return true;
                    }
                  }
                  if (la.a(100)) {
                    break L6;
                  } else {
                    var6_int = 0;
                    var7 = 0;
                    L29: while (true) {
                      if (var7 >= tu.field_E.field_J.length) {
                        or.field_d.b(69, (byte) -54);
                        or.field_d.b(-88, var6_int);
                        break L6;
                      } else {
                        stackOut_139_0 = tu.field_E.field_J[var7];
                        stackIn_146_0 = stackOut_139_0 ? 1 : 0;
                        stackIn_140_0 = stackOut_139_0;
                        L30: {
                          if (stackIn_140_0) {
                            var6_int = var6_int | 1 << var7;
                            break L30;
                          } else {
                            break L30;
                          }
                        }
                        var7++;
                        continue L29;
                      }
                    }
                  }
                }
                stackIn_146_0 = -23;
                break L5;
              }
              if (stackIn_146_0 == (param1 ^ -1)) {
                L31: {
                  if (gk.field_e) {
                    stackIn_151_0 = 0;
                    break L31;
                  } else {
                    stackIn_151_0 = 1;
                    break L31;
                  }
                }
                gk.field_e = stackIn_151_0 != 0;
                return true;
              } else {
                if (param1 != 23) {
                  if (-25 != (param1 ^ -1)) {
                    if (param1 != 25) {
                      if (26 == param1) {
                        L32: {
                          if (gs.field_g) {
                            stackIn_174_0 = 0;
                            break L32;
                          } else {
                            stackIn_174_0 = 1;
                            break L32;
                          }
                        }
                        gs.field_g = stackIn_174_0 != 0;
                        return true;
                      } else {
                        if (27 == param1) {
                          fieldTemp$0 = fa.field_j + 1;
                          fa.field_j = fa.field_j + 1;
                          fa.field_j = fieldTemp$0 & 3;
                          return true;
                        } else {
                          if (85 == param1) {
                            L33: {
                              if (pb.field_B) {
                                stackIn_183_0 = 0;
                                break L33;
                              } else {
                                stackIn_183_0 = 1;
                                break L33;
                              }
                            }
                            pb.field_B = stackIn_183_0 != 0;
                            return true;
                          } else {
                            L34: {
                              if (35 == param1) {
                                lr.b((byte) -116);
                                break L34;
                              } else {
                                break L34;
                              }
                            }
                            if (-40 == (param1 ^ -1)) {
                              L35: {
                                if (pc.field_e) {
                                  stackIn_192_0 = 0;
                                  break L35;
                                } else {
                                  stackIn_192_0 = 1;
                                  break L35;
                                }
                              }
                              pc.field_e = stackIn_192_0 != 0;
                              return true;
                            } else {
                              L36: {
                                if ((param1 ^ -1) != -41) {
                                  break L36;
                                } else {
                                  if (!la.a(param0 ^ 11416)) {
                                    or.field_d.b(85, (byte) 112);
                                    return true;
                                  } else {
                                    break L36;
                                  }
                                }
                              }
                              L37: {
                                if (-42 != (param1 ^ -1)) {
                                  break L37;
                                } else {
                                  if (!la.a(100)) {
                                    or.field_d.b(80, (byte) 114);
                                    return true;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if ((param1 ^ -1) != -57) {
                                  break L38;
                                } else {
                                  if (!la.a(100)) {
                                    or.field_d.b(81, (byte) 107);
                                    or.field_d.field_n = or.field_d.field_n + 2;
                                    var6_int = or.field_d.field_n;
                                    or.field_d.a(113, 1);
                                    var12 = new hn(3, new int[]{0, 0});
                                    var12.a(1, or.field_d);
                                    or.field_d.d(or.field_d.field_n + -var6_int, 62);
                                    return true;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              if (-2 == (param1 ^ -1)) {
                                nm.a(0, param0 + -11592, vi.field_n, ih.field_c);
                                gs.a(0);
                                return true;
                              } else {
                                if (-3 == (param1 ^ -1)) {
                                  nm.a(1, -76, vi.field_n, ih.field_c);
                                  gs.a(param0 + -11516);
                                  return true;
                                } else {
                                  if ((param1 ^ -1) == -4) {
                                    nm.a(2, -76, vi.field_n, ih.field_c);
                                    gs.a(0);
                                    return true;
                                  } else {
                                    if ((param1 ^ -1) == -5) {
                                      nm.a(3, param0 ^ -11448, vi.field_n, ih.field_c);
                                      gs.a(0);
                                      return true;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      L39: {
                        if (ka.field_b) {
                          stackIn_168_0 = 0;
                          break L39;
                        } else {
                          stackIn_168_0 = 1;
                          break L39;
                        }
                      }
                      ka.field_b = stackIn_168_0 != 0;
                      return true;
                    }
                  } else {
                    L40: {
                      if (pq.field_K) {
                        stackIn_163_0 = 0;
                        break L40;
                      } else {
                        stackIn_163_0 = 1;
                        break L40;
                      }
                    }
                    pq.field_K = stackIn_163_0 != 0;
                    return true;
                  }
                } else {
                  L41: {
                    if (wp.field_f) {
                      stackIn_156_0 = 0;
                      break L41;
                    } else {
                      stackIn_156_0 = 1;
                      break L41;
                    }
                  }
                  wp.field_f = stackIn_156_0 != 0;
                  if (null != um.field_e) {
                    um.field_e.a(-109);
                    return true;
                  } else {
                    return true;
                  }
                }
              }
            }
            L42: {
              if (var5 != 0) {
                if ((param1 ^ -1) == -2) {
                  nm.a(rm.field_C, -76, vi.field_n, 0);
                  gs.a(param0 ^ 11516);
                  return true;
                } else {
                  if (param1 == 2) {
                    nm.a(rm.field_C, -76, vi.field_n, 1);
                    gs.a(0);
                    return true;
                  } else {
                    if ((param1 ^ -1) != -4) {
                      break L42;
                    } else {
                      nm.a(rm.field_C, param0 ^ -11448, vi.field_n, 2);
                      gs.a(0);
                      return true;
                    }
                  }
                }
              } else {
                break L42;
              }
            }
            if (87 == param1) {
              pq.field_J = (pq.field_J + 1) % 10;
              return true;
            } else {
              if (-89 == (param1 ^ -1)) {
                pq.field_J = (9 + pq.field_J) % 10;
                return true;
              } else {
                break L3;
              }
            }
          } else {
            break L3;
          }
        }
        var6 = cq.field_h;
        if (param0 == 11516) {
          L43: {
            if (null == ra.field_G) {
              break L43;
            } else {
              var6 = ra.field_G;
              break L43;
            }
          }
          L44: {
            if (var6 == null) {
              stackIn_240_0 = 0;
              break L44;
            } else {
              stackIn_240_0 = var6.a(param1, -17, param2) ? 1 : 0;
              break L44;
            }
          }
          return stackIn_240_0 != 0;
        } else {
          return true;
        }
    }

    private final void v(int param0) {
        on.a(0, 300, 640, 87, 0, 190);
        int var2 = (int)(250.0f * ga.field_R / 100.0f);
        int var3 = var2 + 196;
        un.field_d.d(vo.a((byte) -18, mc.field_e, new String[]{h.field_b[ih.field_c][rm.field_C].toUpperCase()}), 320, 332, 16777215, 0);
        on.f(193, 348, 254, 19, 8, 268435455);
        if (param0 != 81) {
            return;
        }
        if ((var2 ^ -1) >= -17) {
            pt.a((var2 >> -826875391) + 195, -22914, 0, 480, 0);
            on.i(195, 350, 250, 15, 6, 268435455);
            ta.e(117);
            pt.a(640, -22914, (var2 >> 537942305) + 195, 480, 0);
            on.i(-250 + (var2 + 195), 350, 250, 15, 6, 268435455);
            ta.e(122);
        } else {
            on.i(195, 350, var2, 15, 6, 268435455);
        }
        pt.a(640, -22914, var3, 480, 0);
        q.field_d.d(mf.field_Db, 320, 362, 16777215, -1);
        ta.e(126);
        pt.a(var3, -22914, 0, 480, 0);
        q.field_d.d(mf.field_Db, 320, 362, 65793, -1);
        ta.e(param0 ^ 39);
    }

    public Kickabout() {
        CharSequence var2 = (CharSequence) ((Object) gw.field_b);
        tu.field_E = new gr(jc.a(var2, false));
        nm.field_g = (Kickabout) (this);
    }

    final static void t(int param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_11_0 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3_int = 0;
        ot var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ot var11 = null;
        var9 = field_G;
        try {
          L0: {
            L1: {
              var11 = nn.field_B;
              if (param0 == -826875391) {
                break L1;
              } else {
                Kickabout.o((byte) -117);
                break L1;
              }
            }
            var2 = 0;
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= var11.field_v) {
                var3 = nn.field_B;
                vq.field_d = new ut(((ut) ((Object) var3)).field_o, ((ut) ((Object) var3)).field_v);
                var10 = 0;
                var4 = var10;
                var5 = 0;
                L3: while (true) {
                  stackIn_11_0 = ((ut) ((Object) var3)).field_v ^ -1;
                  L4: while (true) {
                    if (stackIn_11_0 >= (var5 ^ -1)) {
                      po.field_h = new ut(((ut) ((Object) var3)).field_o, ((ut) ((Object) var3)).field_v);
                      break L0;
                    } else {
                      var6 = 0;
                      var7 = 0;
                      var8 = 0;
                      L5: while (true) {
                        if ((var8 ^ -1) <= (((ut) ((Object) var3)).field_o ^ -1)) {
                          var5++;
                          continue L3;
                        } else {
                          stackIn_11_0 = var6;

                          L6: {
                            if (stackIn_11_0 != 0) {
                              break L6;
                            } else {
                              if ((((ut) ((Object) var3)).field_y[var10] & -16777216) == 0) {
                                break L6;
                              } else {
                                incrementValue$0 = var7;
                                var7++;
                                if (5 >= incrementValue$0) {
                                  break L6;
                                } else {
                                  var6 = 1;
                                  break L6;
                                }
                              }
                            }
                          }
                          L7: {
                            incrementValue$1 = var10;
                            var10++;
                            stackIn_21_0 = vq.field_d.field_y;

                            stackIn_21_1 = incrementValue$1;

                            if (var6 != 0) {
                              stackIn_22_0 = (int[]) ((Object) stackIn_21_0);
                              stackIn_22_1 = stackIn_21_1;
                              stackIn_22_2 = -1;
                              break L7;
                            } else {
                              stackIn_22_0 = (int[]) ((Object) stackIn_21_0);
                              stackIn_22_1 = stackIn_21_1;
                              stackIn_22_2 = 0;
                              break L7;
                            }
                          }
                          stackIn_22_0[stackIn_22_1] = stackIn_22_2;
                          var8++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var4 = 70 * var3_int / var11.field_v;
                var5 = 0;
                L8: while (true) {
                  if ((var11.field_o ^ -1) >= (var5 ^ -1)) {
                    var3_int++;
                    continue L2;
                  } else {
                    var11.field_y[var2] = qj.b(var11.field_y[var2], -16777216);
                    var11.field_y[var2] = hf.a(var11.field_y[var2], hf.a(hf.a(var4 << -1982327632, var4 << -1572213464), var4));
                    var2++;
                    var5++;
                    continue L8;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "Kickabout.HA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        ph.a(4);
        if (param0 != -24) {
            return;
        }
        r.a(true);
    }

    final void g(byte param0) {
        if (param0 >= -23) {
            this.g((byte) 116);
        }
        this.a(1, 69, 0, 2, 18, (byte) -4, 4, true);
        this.a(107, new eh());
        vq.a(oo.field_c, (byte) 23, (java.awt.Component) ((Object) ic.field_d));
        bc.a((byte) -8, uc.field_A);
    }

    final void o(int param0) {
        if (2147483647 == op.field_v) {
        } else {
            if (2 != (op.field_v ^ -1)) {
                jm.a(op.field_v, false, -2);
            } else {
                rg.a(-1822);
            }
        }
        gm.i(0);
        if (param0 < 50) {
            field_I = (String) null;
        }
    }

    final boolean m(byte param0) {
        int stackIn_8_0 = 0;
        if (param0 < -70) {
          L0: {
            L1: {
              if (od.field_n) {
                break L1;
              } else {
                if (ec.field_e) {
                  break L1;
                } else {
                  if (!an.field_d) {
                    stackIn_8_0 = 0;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            stackIn_8_0 = 1;
            break L0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    final boolean a(int param0, ml param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_29_0 = 0;
        ml stackIn_29_1 = null;
        int stackIn_30_0 = 0;
        ml stackIn_30_1 = null;
        int stackIn_30_2 = 0;
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        int stackIn_95_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_143_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_163_0 = 0;
        int stackIn_166_0 = 0;
        int stackIn_169_0 = 0;
        int stackIn_181_0 = 0;
        int stackIn_184_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_190_0 = 0;
        ap stackIn_192_0 = null;
        ap stackIn_193_0 = null;
        int stackIn_193_1 = 0;
        int stackIn_203_0 = 0;
        int stackIn_212_0 = 0;
        int stackIn_216_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_242_0 = 0;
        int stackIn_245_0 = 0;
        int stackIn_248_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_254_1 = 0;
        int stackIn_257_0 = 0;
        int stackIn_266_0 = 0;
        int stackIn_272_0 = 0;
        int stackIn_275_0 = 0;
        int stackIn_278_0 = 0;
        int stackIn_287_0 = 0;
        int stackIn_293_0 = 0;
        int stackIn_303_0 = 0;
        RuntimeException stackIn_306_0 = null;
        StringBuilder stackIn_306_1 = null;
        RuntimeException stackIn_307_0 = null;
        StringBuilder stackIn_307_1 = null;
        String stackIn_307_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        String[] var4 = null;
        int[] var4_array = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        vc[] var5_ref_vc__ = null;
        int[] var5_ref_int__ = null;
        int var6 = 0;
        int[] var6_ref_int__ = null;
        vc[] var7_ref_vc__ = null;
        int var7 = 0;
        int var8_int = 0;
        tv var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String[] var12 = null;
        int var13 = 0;
        Object var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var29 = null;
        vc[] var30 = null;
        vc[] var31 = null;
        String[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        String var40 = null;
        up[] var41 = null;
        ng var42 = null;
        String var43 = null;
        String[] var44 = null;
        String var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        var22 = field_G;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                this.m((byte) -8);
                break L1;
              }
            }
            if (-91 != (param0 ^ -1)) {
              if (-87 != (param0 ^ -1)) {
                if (85 == param0) {
                  ds.field_g = true;
                  stackIn_15_0 = 1;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-85 == (param0 ^ -1)) {
                    rr.field_f = true;
                    stackIn_19_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if ((param0 ^ -1) == -82) {
                      vd.field_a.a(new pt(un.field_e), param2 ^ 2);
                      stackIn_23_0 = 1;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L2: {
                        if (71 == param0) {
                          break L2;
                        } else {
                          if (83 == param0) {
                            break L2;
                          } else {
                            if (73 == param0) {
                              L3: {
                                ds.field_g = false;
                                param1.p(-127);
                                stackIn_36_0 = 0;

                                if (-2 != (param1.l(1, 59) ^ -1)) {
                                  stackIn_37_0 = stackIn_36_0;
                                  stackIn_37_1 = 0;
                                  break L3;
                                } else {
                                  stackIn_37_0 = stackIn_36_0;
                                  stackIn_37_1 = 1;
                                  break L3;
                                }
                              }
                              fj.a(stackIn_37_0 != 0, stackIn_37_1 != 0);
                              param1.l((byte) 103);
                              var4_int = un.field_e.i(param2 ^ -97);
                              var5 = un.field_e.b(param2 ^ 65281);
                              var6 = un.field_e.h((byte) -119);
                              var7_ref_vc__ = new vc[var6];
                              var8_int = 0;
                              L4: while (true) {
                                if ((var8_int ^ -1) <= (var6 ^ -1)) {
                                  ((wf) ((Object) rn.a(param2 + -120, 16))).a(true, var7_ref_vc__, var4_int, var5);
                                  stackIn_41_0 = 1;
                                  decompiledRegionSelector0 = 6;
                                  break L0;
                                } else {
                                  var7_ref_vc__[var8_int] = vc.a(param2 + -21833, un.field_e);
                                  var8_int++;
                                  continue L4;
                                }
                              }
                            } else {
                              if ((param0 ^ -1) != -77) {
                                if (-81 == (param0 ^ -1)) {
                                  L5: {
                                    ds.field_g = false;
                                    param1.p(-100);
                                    stackIn_55_0 = 0;

                                    if (-2 != (param1.l(1, param2 + 58) ^ -1)) {
                                      stackIn_56_0 = stackIn_55_0;
                                      stackIn_56_1 = 0;
                                      break L5;
                                    } else {
                                      stackIn_56_0 = stackIn_55_0;
                                      stackIn_56_1 = 1;
                                      break L5;
                                    }
                                  }
                                  fj.a(stackIn_56_0 != 0, stackIn_56_1 != 0);
                                  param1.l((byte) 112);
                                  var4_int = un.field_e.h((byte) -125);
                                  var31 = new vc[var4_int];
                                  var5_ref_vc__ = var31;
                                  var6 = 0;
                                  L6: while (true) {
                                    if ((var6 ^ -1) <= (var4_int ^ -1)) {
                                      ((wf) ((Object) rn.a(-53, 16))).a(true, var31);
                                      stackIn_60_0 = 1;
                                      decompiledRegionSelector0 = 8;
                                      break L0;
                                    } else {
                                      var5_ref_vc__[var6] = vc.a(ek.b(param2, -21831), un.field_e);
                                      var6++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  if (param0 != 77) {
                                    if (param0 == 78) {
                                      var32 = new String[param1.a((byte) 81)];
                                      var4 = var32;
                                      var5 = 0;
                                      L7: while (true) {
                                        if (var32.length <= var5) {
                                          gg.a(var32, (byte) 88);
                                          stackIn_74_0 = 1;
                                          decompiledRegionSelector0 = 10;
                                          break L0;
                                        } else {
                                          var4[var5] = param1.a(ek.b(param2, -112));
                                          var5++;
                                          continue L7;
                                        }
                                      }
                                    } else {
                                      if (70 != param0) {
                                        if ((param0 ^ -1) != -75) {
                                          if ((param0 ^ -1) != -10) {
                                            if (-15 != (param0 ^ -1)) {
                                              if (param0 == 15) {
                                                L8: {
                                                  if (!od.field_n) {
                                                    break L8;
                                                  } else {
                                                    vc.f((byte) 119);
                                                    vu.b(122);
                                                    jm.a(0, false, -2);
                                                    wi.field_B = true;
                                                    k.field_k = true;
                                                    od.field_n = false;
                                                    al.field_Db = true;
                                                    vr.b(1);
                                                    break L8;
                                                  }
                                                }
                                                an.field_d = false;
                                                ec.field_e = false;
                                                stackIn_115_0 = 1;
                                                decompiledRegionSelector0 = 15;
                                                break L0;
                                              } else {
                                                L9: {
                                                  if (10 != param0) {
                                                    break L9;
                                                  } else {
                                                    if (od.field_n) {
                                                      na.i(14);
                                                      stackIn_120_0 = 1;
                                                      decompiledRegionSelector0 = 16;
                                                      break L0;
                                                    } else {
                                                      break L9;
                                                    }
                                                  }
                                                }
                                                if ((param0 ^ -1) != -68) {
                                                  if (param0 == 75) {
                                                    var4_int = param1.h((byte) -114);
                                                    var5 = 0;
                                                    L10: while (true) {
                                                      if ((var5 ^ -1) <= (var4_int ^ -1)) {
                                                        stackIn_150_0 = 1;
                                                        decompiledRegionSelector0 = 18;
                                                        break L0;
                                                      } else {
                                                        var40 = param1.a(80);
                                                        r.field_d.a("  <col=99ccff># " + var40 + "</col", (byte) 94);
                                                        var5++;
                                                        continue L10;
                                                      }
                                                    }
                                                  } else {
                                                    L11: {
                                                      if (param0 == 64) {
                                                        break L11;
                                                      } else {
                                                        if ((param0 ^ -1) == -66) {
                                                          break L11;
                                                        } else {
                                                          if (param0 != 66) {
                                                            if (82 == param0) {
                                                              tb.a((byte) 126, 38);
                                                              stackIn_216_0 = 1;
                                                              decompiledRegionSelector0 = 21;
                                                              break L0;
                                                            } else {
                                                              L12: {
                                                                if (um.field_e == null) {
                                                                  break L12;
                                                                } else {
                                                                  if (um.field_e.field_t) {
                                                                    if (69 == param0) {
                                                                      um.field_e.a((byte) -17, param1);
                                                                      stackIn_223_0 = 1;
                                                                      decompiledRegionSelector0 = 22;
                                                                      break L0;
                                                                    } else {
                                                                      if (68 == param0) {
                                                                        var4_int = param1.h((byte) -105);
                                                                        var5 = 0;
                                                                        L13: while (true) {
                                                                          if ((var5 ^ -1) <= (var4_int ^ -1)) {
                                                                            L14: {
                                                                              var5 = param1.k(4);
                                                                              um.field_e.field_m.a(param1, -5);
                                                                              var6 = um.field_e.field_m.c(-98);
                                                                              if (var5 == -1) {
                                                                                break L14;
                                                                              } else {
                                                                                if ((var6 ^ -1) == (var5 ^ -1)) {
                                                                                  break L14;
                                                                                } else {
                                                                                  if (!um.field_e.field_g) {
                                                                                    break L14;
                                                                                  } else {
                                                                                    bd.a("ChecksumError: server=" + Integer.toHexString(var5) + " client=" + Integer.toHexString(var6), (Throwable) ((Object) new IllegalStateException(um.field_e.field_m.toString())), 1);
                                                                                    um.field_e.field_g = false;
                                                                                    break L14;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            um.field_e.field_i.a(um.field_e.field_m, (byte) 119);
                                                                            stackIn_234_0 = 1;
                                                                            decompiledRegionSelector0 = 23;
                                                                            break L0;
                                                                          } else {
                                                                            um.field_e.field_m.d(4);
                                                                            var5++;
                                                                            continue L13;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        break L12;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L12;
                                                                  }
                                                                }
                                                              }
                                                              if ((param0 ^ -1) == -88) {
                                                                L15: {
                                                                  if (um.field_e == null) {
                                                                    break L15;
                                                                  } else {
                                                                    al.field_Db = true;
                                                                    break L15;
                                                                  }
                                                                }
                                                                L16: {
                                                                  var6 = 0;
                                                                  param1.p(-114);
                                                                  var5 = 0;
                                                                  var4_int = 0;
                                                                  if (!mu.a(param1, (byte) -39)) {
                                                                    stackIn_242_0 = 0;
                                                                    break L16;
                                                                  } else {
                                                                    stackIn_242_0 = 1;
                                                                    break L16;
                                                                  }
                                                                }
                                                                L17: {
                                                                  var4_int = stackIn_242_0;
                                                                  if (!mu.a(param1, (byte) -39)) {
                                                                    stackIn_245_0 = 0;
                                                                    break L17;
                                                                  } else {
                                                                    stackIn_245_0 = 1;
                                                                    break L17;
                                                                  }
                                                                }
                                                                L18: {
                                                                  var5 = stackIn_245_0;
                                                                  if (!mu.a(param1, (byte) -39)) {
                                                                    stackIn_248_0 = 0;
                                                                    break L18;
                                                                  } else {
                                                                    stackIn_248_0 = 1;
                                                                    break L18;
                                                                  }
                                                                }
                                                                L19: {
                                                                  var6 = stackIn_248_0;
                                                                  param1.l((byte) -50);
                                                                  if (var6 != 0) {
                                                                    stackIn_251_0 = 0;
                                                                    break L19;
                                                                  } else {
                                                                    stackIn_251_0 = 1;
                                                                    break L19;
                                                                  }
                                                                }
                                                                L20: {


                                                                  if (var5 == var4_int) {

                                                                    stackIn_254_1 = 0;
                                                                    break L20;
                                                                  } else {

                                                                    stackIn_254_1 = 1;
                                                                    break L20;
                                                                  }
                                                                }
                                                                L21: {
                                                                  if (stackIn_251_0 != stackIn_254_1) {
                                                                    stackIn_257_0 = 0;
                                                                    break L21;
                                                                  } else {
                                                                    stackIn_257_0 = 1;
                                                                    break L21;
                                                                  }
                                                                }
                                                                if (stackIn_257_0 != 0) {
                                                                  L22: {
                                                                    L23: {
                                                                      sr.field_l = new lm(param1);
                                                                      da.a(-88);
                                                                      if (null == ra.field_G) {
                                                                        break L23;
                                                                      } else {
                                                                        if (ra.field_G.field_c == 18) {
                                                                          break L22;
                                                                        } else {
                                                                          break L23;
                                                                        }
                                                                      }
                                                                    }
                                                                    if (1 == (cq.field_h.field_c ^ -1)) {
                                                                      cq.field_h = (js) ((Object) sr.field_l);
                                                                      break L22;
                                                                    } else {
                                                                      al.field_Db = true;
                                                                      ng.a(-2, param2 ^ 71);
                                                                      jm.a(18, false, param2 + -3);
                                                                      break L22;
                                                                    }
                                                                  }
                                                                  an.field_d = false;
                                                                  stackIn_266_0 = 1;
                                                                  decompiledRegionSelector0 = 24;
                                                                  break L0;
                                                                } else {
                                                                  throw new RuntimeException("Tried to init a lobby without the full state being sent [" + (var4_int != 0) + "," + (var5 != 0) + "," + (var6 != 0) + "]");
                                                                }
                                                              } else {
                                                                L24: {
                                                                  if (null == sr.field_l) {
                                                                    break L24;
                                                                  } else {
                                                                    if ((param0 ^ -1) != -89) {
                                                                      break L24;
                                                                    } else {
                                                                      L25: {
                                                                        param1.p(-112);
                                                                        var6 = 0;
                                                                        var4_int = 0;
                                                                        var5 = 0;
                                                                        if (!mu.a(param1, (byte) -39)) {
                                                                          stackIn_272_0 = 0;
                                                                          break L25;
                                                                        } else {
                                                                          stackIn_272_0 = 1;
                                                                          break L25;
                                                                        }
                                                                      }
                                                                      L26: {
                                                                        var4_int = stackIn_272_0;
                                                                        if (!mu.a(param1, (byte) -39)) {
                                                                          stackIn_275_0 = 0;
                                                                          break L26;
                                                                        } else {
                                                                          stackIn_275_0 = 1;
                                                                          break L26;
                                                                        }
                                                                      }
                                                                      L27: {
                                                                        var5 = stackIn_275_0;
                                                                        if (!mu.a(param1, (byte) -39)) {
                                                                          stackIn_278_0 = 0;
                                                                          break L27;
                                                                        } else {
                                                                          stackIn_278_0 = 1;
                                                                          break L27;
                                                                        }
                                                                      }
                                                                      L28: {
                                                                        var6 = stackIn_278_0;
                                                                        param1.l((byte) 103);
                                                                        if (var4_int == 0) {
                                                                          break L28;
                                                                        } else {
                                                                          sr.field_l.a(param1, false);
                                                                          break L28;
                                                                        }
                                                                      }
                                                                      L29: {
                                                                        if (var5 != 0) {
                                                                          sr.field_l.a(param2 + 8, param1);
                                                                          break L29;
                                                                        } else {
                                                                          break L29;
                                                                        }
                                                                      }
                                                                      L30: {
                                                                        if (var6 != 0) {
                                                                          sr.field_l.a(param1, (byte) 110);
                                                                          break L30;
                                                                        } else {
                                                                          break L30;
                                                                        }
                                                                      }
                                                                      stackIn_287_0 = 1;
                                                                      decompiledRegionSelector0 = 25;
                                                                      break L0;
                                                                    }
                                                                  }
                                                                }
                                                                if (-90 != (param0 ^ -1)) {
                                                                  if (param0 == 91) {
                                                                    L31: {
                                                                      L32: {
                                                                        L33: {
                                                                          var45 = param1.a(param2 + -108);
                                                                          if (um.field_e == null) {
                                                                            break L33;
                                                                          } else {
                                                                            if (um.field_e.field_A) {
                                                                              break L32;
                                                                            } else {
                                                                              break L33;
                                                                            }
                                                                          }
                                                                        }
                                                                        if (sr.field_l == null) {
                                                                          break L31;
                                                                        } else {
                                                                          break L32;
                                                                        }
                                                                      }
                                                                      li.a(2009, var45);
                                                                      break L31;
                                                                    }
                                                                    stackIn_303_0 = 1;
                                                                    decompiledRegionSelector0 = 27;
                                                                    break L0;
                                                                  } else {
                                                                    return false;
                                                                  }
                                                                } else {
                                                                  var42 = new ng();
                                                                  var42.a(param1, param2 ^ -20364);
                                                                  var43 = var42.a((byte) 51);
                                                                  var44 = og.a(var43, 80, (byte) 123);
                                                                  var7 = 0;
                                                                  L34: while (true) {
                                                                    if (var7 >= var44.length) {
                                                                      stackIn_293_0 = 1;
                                                                      decompiledRegionSelector0 = 26;
                                                                      break L0;
                                                                    } else {
                                                                      var8 = new tv(2, "", 0, "", var44[var7]);
                                                                      qh.a((byte) 94, var8);
                                                                      var7++;
                                                                      continue L34;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            L35: {
                                                              if (null != sr.field_l) {
                                                                wi.field_B = true;
                                                                jm.a(-3, false, -2);
                                                                vr.b(1);
                                                                break L35;
                                                              } else {
                                                                break L35;
                                                              }
                                                            }
                                                            L36: {
                                                              if (null == um.field_e) {
                                                                break L36;
                                                              } else {
                                                                if (!um.field_e.field_t) {
                                                                  break L36;
                                                                } else {
                                                                  um.field_e.a(false, param2 ^ 19);
                                                                  al.field_Db = true;
                                                                  wi.field_B = true;
                                                                  jm.a(-3, false, -2);
                                                                  vr.b(param2 ^ 0);
                                                                  break L36;
                                                                }
                                                              }
                                                            }
                                                            an.field_d = false;
                                                            stackIn_212_0 = 1;
                                                            decompiledRegionSelector0 = 20;
                                                            break L0;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    L37: {
                                                      ok.field_a.b(22997);
                                                      if (sr.field_l != null) {
                                                        wi.field_B = true;
                                                        break L37;
                                                      } else {
                                                        break L37;
                                                      }
                                                    }
                                                    L38: {
                                                      var4_int = param1.field_n;
                                                      cv.a((byte) 72);
                                                      if (0 == param1.h((byte) -106)) {
                                                        stackIn_160_0 = 0;
                                                        break L38;
                                                      } else {
                                                        stackIn_160_0 = 1;
                                                        break L38;
                                                      }
                                                    }
                                                    L39: {
                                                      var5 = stackIn_160_0;
                                                      if (0 == param1.h((byte) -116)) {
                                                        stackIn_163_0 = 0;
                                                        break L39;
                                                      } else {
                                                        stackIn_163_0 = 1;
                                                        break L39;
                                                      }
                                                    }
                                                    L40: {
                                                      var6 = stackIn_163_0;
                                                      var7 = param1.h((byte) -117);
                                                      var8_int = param1.h((byte) -126);
                                                      if ((param1.h((byte) -123) ^ -1) == -1) {
                                                        stackIn_166_0 = 0;
                                                        break L40;
                                                      } else {
                                                        stackIn_166_0 = 1;
                                                        break L40;
                                                      }
                                                    }
                                                    L41: {
                                                      var9 = stackIn_166_0;
                                                      if (0 == param1.h((byte) -113)) {
                                                        stackIn_169_0 = 0;
                                                        break L41;
                                                      } else {
                                                        stackIn_169_0 = 1;
                                                        break L41;
                                                      }
                                                    }
                                                    var10 = stackIn_169_0;
                                                    var11 = param1.h((byte) -111);
                                                    var12 = new String[var11];
                                                    var13 = 0;
                                                    L42: while (true) {
                                                      if (var12.length <= var13) {
                                                        L43: {
                                                          var13 = param1.j((byte) -64);
                                                          var14 = null;
                                                          if (var10 == 0) {
                                                            break L43;
                                                          } else {
                                                            if (-1 >= (var13 ^ -1)) {
                                                              var41 = new up[9];
                                                              var14 = var41;
                                                              var15 = 0;
                                                              L44: while (true) {
                                                                if (9 <= var15) {
                                                                  break L43;
                                                                } else {
                                                                  ((Object[]) (var14))[var15] = new up();
                                                                  var41[var15].a(39, param1);
                                                                  var15++;
                                                                  continue L44;
                                                                }
                                                              }
                                                            } else {
                                                              break L43;
                                                            }
                                                          }
                                                        }
                                                        L45: {
                                                          vs.field_g = null;
                                                          var15 = param1.h((byte) -128);
                                                          if (0 == (var15 & 1)) {
                                                            stackIn_181_0 = 0;
                                                            break L45;
                                                          } else {
                                                            stackIn_181_0 = 1;
                                                            break L45;
                                                          }
                                                        }
                                                        L46: {
                                                          var16 = stackIn_181_0;
                                                          if ((var15 & 2 ^ -1) == -1) {
                                                            stackIn_184_0 = 0;
                                                            break L46;
                                                          } else {
                                                            stackIn_184_0 = 1;
                                                            break L46;
                                                          }
                                                        }
                                                        L47: {
                                                          var17 = stackIn_184_0;
                                                          if ((var15 & 4) == 0) {
                                                            stackIn_187_0 = 0;
                                                            break L47;
                                                          } else {
                                                            stackIn_187_0 = 1;
                                                            break L47;
                                                          }
                                                        }
                                                        L48: {
                                                          var18 = stackIn_187_0;
                                                          if (-1 == (var15 & 8 ^ -1)) {
                                                            stackIn_190_0 = 0;
                                                            break L48;
                                                          } else {
                                                            stackIn_190_0 = 1;
                                                            break L48;
                                                          }
                                                        }
                                                        L49: {
                                                          var19 = stackIn_190_0;
                                                          var20 = param1.j((byte) -87);
                                                          um.field_e = new ap(true, (up[]) (var14), var12, var13, var5 != 0, var6 != 0, var7, var8_int, var9 != 0, var10 != 0, var16 != 0, var17 != 0, var18 != 0, var20, (gr) null);
                                                          stackIn_192_0 = um.field_e;

                                                          if (var19 == 0) {
                                                            stackIn_193_0 = (ap) ((Object) stackIn_192_0);
                                                            stackIn_193_1 = 0;
                                                            break L49;
                                                          } else {
                                                            stackIn_193_0 = (ap) ((Object) stackIn_192_0);
                                                            stackIn_193_1 = 1;
                                                            break L49;
                                                          }
                                                        }
                                                        L50: {
                                                          L51: {
                                                            stackIn_193_0.field_v = stackIn_193_1 != 0;
                                                            da.a(-76);
                                                            if (ra.field_G == null) {
                                                              break L51;
                                                            } else {
                                                              if (ra.field_G.field_c == 18) {
                                                                break L50;
                                                              } else {
                                                                break L51;
                                                              }
                                                            }
                                                          }
                                                          if ((cq.field_h.field_c ^ -1) == 0) {
                                                            cq.field_h = (js) ((Object) um.field_e);
                                                            break L50;
                                                          } else {
                                                            wi.field_B = true;
                                                            ng.a(-1, param2 ^ 85);
                                                            jm.a(18, false, -2);
                                                            break L50;
                                                          }
                                                        }
                                                        an.field_d = false;
                                                        var21 = param1.field_n + -var4_int;
                                                        if (var21 != ms.field_b) {
                                                          throw new RuntimeException("");
                                                        } else {
                                                          stackIn_203_0 = 1;
                                                          decompiledRegionSelector0 = 19;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var12[var13] = param1.a(-111);
                                                        var13++;
                                                        continue L42;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var23 = new int[8];
                                                  var48 = var23;
                                                  var35 = var48;
                                                  var4_array = var35;
                                                  var5 = 0;
                                                  L52: while (true) {
                                                    if (2 < var5) {
                                                      var46 = var4_array;
                                                      var33 = var46;
                                                      var24 = var33;
                                                      var5_ref_int__ = var24;
                                                      var47 = bh.field_f;
                                                      var34 = var47;
                                                      var25 = var34;
                                                      var6_ref_int__ = var25;
                                                      var7 = 0;
                                                      L53: while (true) {
                                                        if (var7 >= 8) {
                                                          var5 = 0;
                                                          L54: while (true) {
                                                            if ((var5 ^ -1) <= -74) {
                                                              var49 = bh.field_f;
                                                              var36 = var49;
                                                              var26 = var36;
                                                              var5_ref_int__ = var26;
                                                              var50 = var4_array;
                                                              var37 = var50;
                                                              var27 = var37;
                                                              var6_ref_int__ = var27;
                                                              var7 = 0;
                                                              L55: while (true) {
                                                                if (-9 >= (var7 ^ -1)) {
                                                                  var51 = ha.field_F;
                                                                  var38 = var51;
                                                                  var28 = var38;
                                                                  var5_ref_int__ = var28;
                                                                  var52 = var4_array;
                                                                  var39 = var52;
                                                                  var29 = var39;
                                                                  var6_ref_int__ = var29;
                                                                  var7 = 0;
                                                                  L56: while (true) {
                                                                    if ((var7 ^ -1) <= -9) {
                                                                      L57: {
                                                                        if (!sj.field_g) {
                                                                          break L57;
                                                                        } else {
                                                                          og.a(20164);
                                                                          break L57;
                                                                        }
                                                                      }
                                                                      stackIn_143_0 = 1;
                                                                      decompiledRegionSelector0 = 17;
                                                                      break L0;
                                                                    } else {
                                                                      var28[var7] = hf.a(var51[var7], var52[var7]);
                                                                      var7++;
                                                                      continue L56;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var26[var7] = hf.a(var49[var7], var50[var7]);
                                                                  var7++;
                                                                  continue L55;
                                                                }
                                                              }
                                                            } else {
                                                              L58: {
                                                                if (c.a(var5, 0, var48)) {
                                                                  ec.field_f.a(new oi(var5), 3);
                                                                  ok.field_a.a(new oi(var5), 3);
                                                                  break L58;
                                                                } else {
                                                                  break L58;
                                                                }
                                                              }
                                                              var5++;
                                                              continue L54;
                                                            }
                                                          }
                                                        } else {
                                                          var24[var7] = qj.b(var46[var7], var47[var7] ^ -1);
                                                          var7++;
                                                          continue L53;
                                                        }
                                                      }
                                                    } else {
                                                      var23[var5] = param1.k(ek.b(param2, 5));
                                                      var5++;
                                                      continue L52;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              L59: {
                                                cv.a((byte) 81);
                                                q.a(ma.f(param2 ^ 1), 120, ig.a((byte) 6, 1250), ig.a((byte) 6, 16), dd.b(-116), sn.field_c, dr.a(param2 ^ 1), 150, ow.field_c.length, 1024);
                                                ln.a(64, qq.h((byte) -64), qt.f((byte) -63));
                                                ec.field_e = false;
                                                od.field_n = true;
                                                if (!an.field_d) {
                                                  jm.a(-3, false, -2);
                                                  break L59;
                                                } else {
                                                  break L59;
                                                }
                                              }
                                              stackIn_109_0 = 1;
                                              decompiledRegionSelector0 = 14;
                                              break L0;
                                            }
                                          } else {
                                            cv.a((byte) 87);
                                            ec.field_e = false;
                                            jm.a(10, false, -2);
                                            ka.a(2, param1.a(param2 + -98));
                                            stackIn_103_0 = 1;
                                            decompiledRegionSelector0 = 13;
                                            break L0;
                                          }
                                        } else {
                                          L60: {
                                            var4_int = param1.k(param2 + 3);
                                            if (um.field_e == null) {
                                              break L60;
                                            } else {
                                              um.field_e.a(-21573, param1);
                                              break L60;
                                            }
                                          }
                                          or.field_d.b(57, (byte) -80);
                                          or.field_d.b(param2 ^ -30, var4_int);
                                          stackIn_100_0 = 1;
                                          decompiledRegionSelector0 = 12;
                                          break L0;
                                        }
                                      } else {
                                        L61: {
                                          ui.field_y = true;
                                          tu.field_E.a(85, param1, 4);
                                          pf.field_c = tu.field_E.field_d;
                                          if (tu.field_E.field_L) {
                                            tb.field_v = 1;
                                            break L61;
                                          } else {
                                            tb.field_v = 0;
                                            break L61;
                                          }
                                        }
                                        L62: {
                                          ei.field_n = tu.field_E.field_A;
                                          if (!iu.field_h) {
                                            li.a(tu.field_E.field_p, (byte) 33);
                                            pe.a(tu.field_E.field_F, (byte) -116);
                                            break L62;
                                          } else {
                                            break L62;
                                          }
                                        }
                                        L63: {
                                          if (!(cq.field_h instanceof ta)) {
                                            break L63;
                                          } else {
                                            if (ra.field_G != null) {
                                              break L63;
                                            } else {
                                              ((qt) ((Object) cq.field_h)).a(0, 0, true);
                                              tb.a((byte) 126, 28);
                                              break L63;
                                            }
                                          }
                                        }
                                        L64: {
                                          param1.p(param2 ^ -105);
                                          if ((param1.l(1, 59) ^ -1) != -2) {
                                            stackIn_88_0 = 0;
                                            break L64;
                                          } else {
                                            stackIn_88_0 = 1;
                                            break L64;
                                          }
                                        }
                                        L65: {
                                          c.field_g = stackIn_88_0 != 0;
                                          if (1 != param1.l(1, 59)) {
                                            stackIn_91_0 = 0;
                                            break L65;
                                          } else {
                                            stackIn_91_0 = 1;
                                            break L65;
                                          }
                                        }
                                        L66: {
                                          f.field_c = stackIn_91_0 != 0;
                                          stackIn_93_0 = 0;

                                          if (param1.l(1, 59) != 1) {
                                            stackIn_94_0 = stackIn_93_0;
                                            stackIn_94_1 = 0;
                                            break L66;
                                          } else {
                                            stackIn_94_0 = stackIn_93_0;
                                            stackIn_94_1 = 1;
                                            break L66;
                                          }
                                        }
                                        fj.a(stackIn_94_0 != 0, stackIn_94_1 != 0);
                                        param1.l((byte) 108);
                                        stackIn_95_0 = 1;
                                        decompiledRegionSelector0 = 11;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    L67: {
                                      var4_int = un.field_e.h((byte) -115);
                                      k.a(true, var4_int);
                                      bh.field_k = var4_int;
                                      if (!(cq.field_h instanceof qs)) {
                                        break L67;
                                      } else {
                                        if (null == ra.field_G) {
                                          ((qt) ((Object) cq.field_h)).a(param2 ^ 1, 0, true);
                                          tb.a((byte) 126, 28);
                                          break L67;
                                        } else {
                                          return true;
                                        }
                                      }
                                    }
                                    stackIn_67_0 = 1;
                                    decompiledRegionSelector0 = 9;
                                    break L0;
                                  }
                                }
                              } else {
                                L68: {
                                  ds.field_g = false;
                                  param1.p(-104);
                                  stackIn_45_0 = 0;

                                  if (param1.l(1, param2 ^ 58) != 1) {
                                    stackIn_46_0 = stackIn_45_0;
                                    stackIn_46_1 = 0;
                                    break L68;
                                  } else {
                                    stackIn_46_0 = stackIn_45_0;
                                    stackIn_46_1 = 1;
                                    break L68;
                                  }
                                }
                                fj.a(stackIn_46_0 != 0, stackIn_46_1 != 0);
                                param1.l((byte) -84);
                                var4_int = un.field_e.h((byte) -125);
                                var30 = new vc[var4_int];
                                var5_ref_vc__ = var30;
                                var6 = 0;
                                L69: while (true) {
                                  if (var6 >= var4_int) {
                                    wh.a((byte) 99, var30);
                                    stackIn_50_0 = 1;
                                    decompiledRegionSelector0 = 7;
                                    break L0;
                                  } else {
                                    var5_ref_vc__[var6] = vc.a(-21832, un.field_e);
                                    var6++;
                                    continue L69;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L70: {
                        rr.field_f = false;
                        stackIn_29_0 = -105;

                        stackIn_29_1 = (ml) (param1);

                        if (83 != so.field_b) {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = (ml) ((Object) stackIn_29_1);
                          stackIn_30_2 = 0;
                          break L70;
                        } else {
                          stackIn_30_0 = stackIn_29_0;
                          stackIn_30_1 = (ml) ((Object) stackIn_29_1);
                          stackIn_30_2 = 1;
                          break L70;
                        }
                      }
                      mf.a((byte) stackIn_30_0, stackIn_30_1, stackIn_30_2 != 0);
                      stackIn_31_0 = 1;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                }
              } else {
                L71: {
                  stackIn_9_0 = 0;

                  if (-2 != (param1.h((byte) -122) ^ -1)) {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 0;
                    break L71;
                  } else {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 1;
                    break L71;
                  }
                }
                fj.a(stackIn_10_0 != 0, stackIn_10_1 != 0);
                stackIn_11_0 = 1;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              ((eh) ((Object) ma.field_t)).b((byte) 115);
              stackIn_5_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L72: {
            var4_ref = decompiledCaughtException;
            stackIn_306_0 = (RuntimeException) (var4_ref);

            stackIn_306_1 = new StringBuilder().append("Kickabout.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_307_0 = (RuntimeException) ((Object) stackIn_306_0);
              stackIn_307_1 = (StringBuilder) ((Object) stackIn_306_1);
              stackIn_307_2 = "null";
              break L72;
            } else {
              stackIn_307_0 = (RuntimeException) ((Object) stackIn_306_0);
              stackIn_307_1 = (StringBuilder) ((Object) stackIn_306_1);
              stackIn_307_2 = "{...}";
              break L72;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_307_0), stackIn_307_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_23_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_31_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_41_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_50_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_60_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_67_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_74_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_95_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_100_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_103_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_109_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_115_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_120_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_143_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_150_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_203_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_212_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_216_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_223_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_234_0 != 0;
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return stackIn_266_0 != 0;
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return stackIn_287_0 != 0;
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return stackIn_293_0 != 0;
                                                            } else {
                                                              return stackIn_303_0 != 0;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public final void a(int param0) {
        int incrementValue$0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        lm stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        lm stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        ap stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        ap stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        js stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        js stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        qt stackIn_74_0 = null;
        qt stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        js stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        js stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        L0: {
          var6 = field_G;
          var2 = 97 % ((param0 - 50) / 45);
          var3 = 0;
          if (0 >= wr.field_f) {
            break L0;
          } else {
            L1: {
              if (po.a(cq.field_h, -4) < 640) {
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
                break L1;
              }
            }
            L2: {
              L3: {
                var4 = stackIn_4_0;
                if (var4 == 0) {
                  break L3;
                } else {
                  if (ra.field_G == null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (0 != tb.field_v) {
                var3 = 240;
                if (ra.field_G == null) {
                  break L0;
                } else {
                  L4: {
                    if (po.a(ra.field_G, -4) < 640) {
                      stackIn_14_0 = 0;
                      break L4;
                    } else {
                      stackIn_14_0 = 1;
                      break L4;
                    }
                  }
                  L5: {
                    var5 = stackIn_14_0;
                    if (var4 == 0) {
                      break L5;
                    } else {
                      if (var5 == 0) {
                        break L5;
                      } else {
                        var3 = 256;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (var4 != 0) {
                      break L6;
                    } else {
                      if (var5 == 0) {
                        break L6;
                      } else {
                        var3 = var3 + (ce.field_I << 613431907);
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (var4 == 0) {
                      break L7;
                    } else {
                      if (var5 == 0) {
                        var3 = var3 + (24 + -ce.field_I << -2091134525);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (var3 <= 256) {
                    break L0;
                  } else {
                    var3 = 256;
                    break L0;
                  }
                }
              } else {
                break L2;
              }
            }
            var3 = 256;
            break L0;
          }
        }
        L8: {
          L9: {
            if (cq.field_h.field_c != -3) {
              break L9;
            } else {
              L10: {
                if (null == ra.field_G) {
                  break L10;
                } else {
                  if (18 != ra.field_G.field_c) {
                    break L9;
                  } else {
                    break L10;
                  }
                }
              }
              var4 = 0;
              var5 = -on.field_a.length;
              L11: while (true) {
                if (-1 >= (var5 ^ -1)) {
                  break L8;
                } else {
                  incrementValue$0 = var4;
                  var4++;
                  on.field_a[incrementValue$0] = 65793;
                  var5++;
                  continue L11;
                }
              }
            }
          }
          L12: {
            if ((wr.field_f ^ -1) > -681) {
              hr.a((byte) -48);
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (sr.field_l == null) {
              break L13;
            } else {
              if ((cq.field_h.field_c ^ -1) == -1) {
                break L13;
              } else {
                if ((cq.field_h.field_c ^ -1) == 0) {
                  break L13;
                } else {
                  if (6 == cq.field_h.field_c) {
                    break L13;
                  } else {
                    L14: {
                      L15: {
                        stackIn_44_0 = sr.field_l;

                        stackIn_44_1 = -5;

                        if (!this.field_L) {
                          break L15;
                        } else {
                          stackIn_44_0 = (lm) ((Object) stackIn_44_0);

                          if (sr.field_l != cq.field_h) {
                            break L15;
                          } else {
                            stackIn_44_0 = (lm) ((Object) stackIn_44_0);

                            if (ra.field_G != null) {
                              break L15;
                            } else {
                              stackIn_45_0 = (lm) ((Object) stackIn_44_0);
                              stackIn_45_1 = stackIn_44_1;
                              stackIn_45_2 = 1;
                              break L14;
                            }
                          }
                        }
                      }
                      stackIn_45_0 = (lm) ((Object) stackIn_44_0);
                      stackIn_45_1 = stackIn_44_1;
                      stackIn_45_2 = 0;
                      break L14;
                    }
                    ((lm) (Object) stackIn_45_0).a(stackIn_45_1, stackIn_45_2 != 0);
                    break L13;
                  }
                }
              }
            }
          }
          if (um.field_e == null) {
            break L8;
          } else {
            if (-1 == (cq.field_h.field_c ^ -1)) {
              break L8;
            } else {
              if (-2 == cq.field_h.field_c) {
                break L8;
              } else {
                L16: {
                  L17: {
                    stackIn_53_0 = um.field_e;

                    stackIn_53_1 = -5;

                    if (!this.field_L) {
                      break L17;
                    } else {
                      stackIn_53_0 = (ap) ((Object) stackIn_53_0);

                      if (um.field_e != cq.field_h) {
                        break L17;
                      } else {
                        stackIn_53_0 = (ap) ((Object) stackIn_53_0);

                        if (null != ra.field_G) {
                          break L17;
                        } else {
                          stackIn_54_0 = (ap) ((Object) stackIn_53_0);
                          stackIn_54_1 = stackIn_53_1;
                          stackIn_54_2 = 1;
                          break L16;
                        }
                      }
                    }
                  }
                  stackIn_54_0 = (ap) ((Object) stackIn_53_0);
                  stackIn_54_1 = stackIn_53_1;
                  stackIn_54_2 = 0;
                  break L16;
                }
                ((ap) (Object) stackIn_54_0).a(stackIn_54_1, stackIn_54_2 != 0);
                break L8;
              }
            }
          }
        }
        L18: {
          pt.a(wr.field_f, -22914, 0, 480, 0);
          var4 = -nn.field_B.field_o + wr.field_f;
          if ((var3 ^ -1) < -1) {
            eo.a(po.field_h, vq.field_d, var4);
            eo.a(mk.field_a, 0, 0, wr.field_f, 480, var3, 0);
            cq.field_j.c(-36, 50, 64);
            break L18;
          } else {
            break L18;
          }
        }
        L19: {
          if (cq.field_h instanceof qt) {
            L20: {
              L21: {
                stackIn_63_0 = cq.field_h;

                stackIn_63_1 = -5;

                if (!this.field_L) {
                  break L21;
                } else {
                  stackIn_63_0 = (js) ((Object) stackIn_63_0);

                  if (null != ra.field_G) {
                    break L21;
                  } else {
                    stackIn_64_0 = (js) ((Object) stackIn_63_0);
                    stackIn_64_1 = stackIn_63_1;
                    stackIn_64_2 = 1;
                    break L20;
                  }
                }
              }
              stackIn_64_0 = (js) ((Object) stackIn_63_0);
              stackIn_64_1 = stackIn_63_1;
              stackIn_64_2 = 0;
              break L20;
            }
            ((js) (Object) stackIn_64_0).a(stackIn_64_1, stackIn_64_2 != 0);
            break L19;
          } else {
            break L19;
          }
        }
        L22: {
          if (!(ra.field_G instanceof qt)) {
            break L22;
          } else {
            ra.field_G.a(-5, false);
            break L22;
          }
        }
        L23: {
          if (-1 > (wr.field_f ^ -1)) {
            po.field_h.c(var4, 0);
            nn.field_B.c(var4, 0);
            break L23;
          } else {
            break L23;
          }
        }
        L24: {
          ta.e(118);
          if (!(cq.field_h instanceof qt)) {
            break L24;
          } else {
            L25: {
              L26: {
                stackIn_74_0 = (qt) ((Object) cq.field_h);

                if (!this.field_L) {
                  break L26;
                } else {
                  stackIn_74_0 = (qt) ((Object) stackIn_74_0);

                  if (ra.field_G != null) {
                    break L26;
                  } else {
                    stackIn_75_0 = (qt) ((Object) stackIn_74_0);
                    stackIn_75_1 = 1;
                    break L25;
                  }
                }
              }
              stackIn_75_0 = (qt) ((Object) stackIn_74_0);
              stackIn_75_1 = 0;
              break L25;
            }
            ((qt) (Object) stackIn_75_0).a(stackIn_75_1 != 0, 117);
            break L24;
          }
        }
        L27: {
          if (ra.field_G instanceof qt) {
            ((qt) ((Object) ra.field_G)).a(false, 119);
            break L27;
          } else {
            break L27;
          }
        }
        L28: {
          if (cq.field_h instanceof qt) {
            break L28;
          } else {
            if (cq.field_h == um.field_e) {
              break L28;
            } else {
              if (cq.field_h == sr.field_l) {
                break L28;
              } else {
                L29: {
                  L30: {
                    stackIn_85_0 = cq.field_h;

                    stackIn_85_1 = -5;

                    if (!this.field_L) {
                      break L30;
                    } else {
                      stackIn_85_0 = (js) ((Object) stackIn_85_0);

                      if (ra.field_G != null) {
                        break L30;
                      } else {
                        stackIn_86_0 = (js) ((Object) stackIn_85_0);
                        stackIn_86_1 = stackIn_85_1;
                        stackIn_86_2 = 1;
                        break L29;
                      }
                    }
                  }
                  stackIn_86_0 = (js) ((Object) stackIn_85_0);
                  stackIn_86_1 = stackIn_85_1;
                  stackIn_86_2 = 0;
                  break L29;
                }
                ((js) (Object) stackIn_86_0).a(stackIn_86_1, stackIn_86_2 != 0);
                break L28;
              }
            }
          }
        }
        L31: {
          if (ra.field_G == null) {
            break L31;
          } else {
            if (ra.field_G instanceof qt) {
              break L31;
            } else {
              if (um.field_e == ra.field_G) {
                break L31;
              } else {
                if (sr.field_l == ra.field_G) {
                  break L31;
                } else {
                  ra.field_G.a(-5, false);
                  break L31;
                }
              }
            }
          }
        }
        L32: {
          this.w(102);
          if (!pb.field_B) {
            break L32;
          } else {
            sc.g((byte) -119);
            break L32;
          }
        }
        L33: {
          if (ka.field_b) {
            L34: {
              var5 = -ce.field_I + 24 << -29150844;
              if (-13 < (ce.field_I ^ -1)) {
                var5 = ce.field_I << -488357084;
                break L34;
              } else {
                break L34;
              }
            }
            q.field_d.d("Transition: " + ce.field_I + " : " + var5, 320, 100, 16777215, 0);
            break L33;
          } else {
            break L33;
          }
        }
        L35: {
          if (!wh.field_q) {
            break L35;
          } else {
            if (3 != (cq.field_h.field_c ^ -1)) {
              this.v(81);
              break L35;
            } else {
              break L35;
            }
          }
        }
        wq.a((byte) 71);
        gs.a((byte) -106);
    }

    final void b(int param0) {
        Kickabout.o((byte) -99);
        bw.a(false);
        uq.a(-91);
        ug.a(-1);
        et.a(121);
        w.b(23);
        ng.b(param0 ^ 126);
        up.g(112);
        hn.a((byte) 122);
        pt.a((byte) 9);
        su.a((byte) -115);
        gr.b((byte) 0);
        fp.a(-23834);
        wk.a((byte) -67);
        pc.b(-13827);
        nd.a((byte) 115);
        oo.a(param0 ^ -18184);
        pl.a(20177);
        pr.a(0);
        oi.a(false);
        tf.a(param0 + -133);
        on.c();
        jl.a(param0 ^ 8198);
        ml.m(0);
        gs.b((byte) -117);
        mi.a(param0 + -6);
        nc.a((byte) 72);
        ss.a((byte) -90);
        tu.q(30907);
        de.a(param0 + 3896);
        gw.d(param0 + 92);
        qr.a(false);
        ma.d(true);
        bs.a((byte) -95);
        ah.c(1);
        u.a(param0 + -8);
        ku.a(param0 + -7);
        rg.a((byte) 66);
        sj.c(param0 ^ -122);
        fc.a(29136);
        td.a(false);
        iw.g((byte) 88);
        nj.a((byte) -64);
        fh.a((byte) 122);
        fs.a(-81);
        ms.a((byte) 53);
        tn.a(false);
        cu.a(param0 ^ 6);
        oa.a(param0 + -6);
        tv.a(2);
        hp.a(0);
        ns.a((byte) 60);
        mc.a((byte) -116);
        qe.a(true);
        vq.a((byte) 25);
        kh.d(param0 + -1712);
        sd.a(-1);
        ap.a(true);
        lm.a(true);
        js.a((byte) 125);
        kd.c(-1);
        lu.g((byte) -28);
        am.e(13421568);
        gn.d(126);
        hj.a(param0 + 50);
        rd.a(true);
        ds.a(-49);
        cq.b(110);
        eh.d(1);
        ig.a((byte) -13);
        vb.a(0);
        fn.q(140);
        hs.b(104);
        il.a((byte) 101);
        jb.c(false);
        ar.a((byte) -73);
        gm.i((byte) 14);
        ak.a(17);
        vr.a((byte) -118);
        ca.a((byte) -72);
        ws.a(-25514);
        fj.b(true);
        c.a((byte) 114);
        sn.a(-1316);
        ti.a((byte) -126);
        nh.a();
        aj.a(-9097);
        le.a(false);
        bq.a((byte) -127);
        dg.a((byte) -90);
        t.a();
        ep.a(0);
        ck.a(false);
        rj.a((byte) -116);
        ks.a(0);
        uh.a();
        jj.a((byte) -99);
        qt.c((byte) -107);
        fv.b((byte) 108);
        mt.a(param0 ^ 7);
        ji.a(-123);
        hd.g(-14457);
        io.a((byte) -6);
        ko.a((byte) -22);
        ew.d(81);
        te.a(true);
        ec.a(0);
        we.a((byte) -43);
        kr.a(param0 ^ -121);
        kj.b((byte) -118);
        ps.b(-27680);
        bh.c(param0 ^ -109);
        kt.a(125);
        e.a(-1);
        ta.g((byte) 91);
        sp.j(param0 + -246);
        jt.h((byte) -17);
        in.a(param0 ^ 31347);
        ud.e(14513);
        gt.a(true);
        ch.a((byte) 119);
        qn.a((byte) -124);
        hu.a();
        nu.a(true);
        aq.b(1);
        vj.a((byte) 111);
        tg.a();
        wh.a(0);
        bd.f(param0 ^ -54);
        gk.a((byte) -127);
        rm.f(-71);
        uf.b(param0 ^ 3547);
        ne.g(29250);
        cb.a((byte) -100);
        ob.i(127);
        la.a((byte) -124);
        tj.f(0);
        nl.e((byte) -108);
        is.b(116);
        mj.a(param0 ^ 6);
        om.b(0);
        na.a(param0 ^ 116);
        iv.a(false);
        gu.h((byte) 38);
        al.a(1);
        uv.c(123);
        np.i((byte) -122);
        rb.c(true);
        he.b(240);
        qb.a(-7);
        em.c((byte) 36);
        sk.a(-5514);
        ph.b(1114366657);
        ad.a(param0 + -6);
        bn.e(-38);
        so.a((byte) -113);
        jq.a(true);
        kp.a((byte) 101);
        vk.a(50);
        pi.a((byte) -116);
        h.a(false);
        jc.a(48);
        p.a(320);
        it.c(92);
        oe.a((byte) -90);
        wr.a(true);
        ua.a((byte) -30);
        ki.a(0);
        mo.a(-3);
        po.a(0);
        sc.e(130);
        rq.a(true);
        dc.a(-89);
        bo.a(param0 ^ 78);
        tt.a(false);
        eg.d();
        sh.a(320);
        ul.a(param0 ^ 125);
        o.d(1603);
        be.d((byte) -53);
        lj.a(-64);
        ts.a((byte) 123);
        vg.m(param0 + 90);
        qd.a(-75);
        rk.a(0);
        nr.a((byte) 126);
        dr.a((byte) -127);
        fm.g((byte) 81);
        eo.c();
        tk.i((byte) -69);
        wf.h((byte) -53);
        jw.a(0);
        jh.k((byte) 68);
        jr.i(-25734);
        kc.a((byte) -111);
        b.f(-2010043359);
        mf.i((byte) -127);
        pu.i((byte) -108);
        qs.h((byte) -111);
        bp.c(false);
        kq.i((byte) -123);
        vu.a(-15410);
        rf.a(-97);
        kf.c(true);
        sl.i((byte) 39);
        ac.b((byte) 16);
        wa.a((byte) 116);
        rr.a(param0 + -121);
        ru.a((byte) -32);
        kl.a(param0 ^ 6);
        rc.a(113);
        ow.a(false);
        km.a();
        cp.a((byte) 60);
        fw.f(-107);
        i.f((byte) 90);
        pv.g((byte) -111);
        sq.g(13);
        qq.g(param0 + 2350);
        aw.h((byte) -117);
        ha.g(100);
        hg.h(22100);
        nq.h(0);
        no.g((byte) -93);
        pq.g(-14948);
        pw.g(-8332);
        gi.h(-31922);
        hk.g(0);
        rt.g(param0 ^ 25994);
        ie.h(24342);
        ek.d(false);
        kn.g(2);
        vf.g((byte) -45);
        ce.g(30);
        bm.d(false);
        lt.a(-122);
        of.a(false);
        ih.a(66049);
        d.a(0);
        se.m(-1);
        jn.s(248);
        oj.j((byte) 110);
        vo.j((byte) 53);
        wv.j((byte) -108);
        ae.a((byte) -94);
        nn.k(2);
        pd.k(param0 ^ -11205);
        mb.a((byte) -94);
        wc.a(10);
        ee.a((byte) -100);
        th.a(false);
        ve.j((byte) 77);
        cd.a((byte) -98);
        cm.o(1);
        qv.a(true);
        wi.a(79);
        fd.g((byte) 88);
        ub.a((byte) -103);
        wj.i(param0 ^ -336184830);
        nw.c((byte) -65);
        iq.b(0);
        ct.j(31068);
        pg.b(127);
        bi.f(param0 + -6);
        eb.a(2);
        n.b(-2147483648);
        gf.a(64);
        kk.a((byte) 94);
        pe.b((byte) 7);
        wq.a(-109);
        f.a((byte) -88);
        tl.c(0);
        ao.b(113);
        sa.a((byte) 125);
        di.a(-10);
        lf.a((byte) 94);
        pf.a((byte) 98);
        au.a();
        os.b(3);
        si.a(0);
        un.a((byte) 106);
        re.a((byte) 109);
        id.a(-116);
        ei.a(-19485);
        du.a(-24229);
        ql.b(7);
        mv.a(true);
        ka.a(19044);
        sg.a(false);
        bb.b(111);
        bt.a(true);
        an.a(30297);
        bg.a(71);
        eq.a((byte) -32);
        av.b(99);
        lw.a((byte) -125);
        vi.d(125);
        dh.a((byte) -29);
        hq.a(param0 + 55);
        cl.a(-1);
        tr.a(false);
        ol.g(-39);
        va.c((byte) -40);
        wb.g(param0 + -119);
        fk.f(1);
        lr.f(param0 + -15646);
        bf.b((byte) -113);
        ib.a(param0 + 905215451);
        cv.b((byte) -39);
        ia.a((byte) 107);
        rn.a(-66);
        je.a(-1);
        ok.a(param0 + 121);
        ef.h((byte) -31);
        db.a();
        mk.a(17437);
        uk.a((byte) -128);
        nm.a(256);
        g.a(true);
        us.f((byte) 40);
        ip.a(-123);
        vp.b((byte) 125);
        da.a((byte) -80);
        rs.b();
        pp.a(false);
        dj.e(param0 + -29110);
        tb.c((byte) -115);
        ui.a(true);
        qh.b(-1);
        hi.g(-26236);
        wm.a((byte) -119);
        or.a((byte) 69);
        vv.g((byte) 18);
        af.a((byte) 105);
        cg.k(115);
        mr.n((byte) 74);
        ga.l(param0 + -6);
        mu.p(12);
        fr.a(param0 + -6);
        lb.i(param0 + 9568);
        gb.a((byte) 38);
        ju.h((byte) -120);
        qk.a((byte) 108);
        jd.b((byte) -124);
        br.a(true);
        ai.l(0);
        bk.b(-79);
        kv.a();
        hw.a(96);
        sf.f(90);
        ra.g(128);
        qa.g(60);
        df.c(false);
        ja.h(8);
        um.a(123);
        es.a((byte) -49);
        hl.f(param0 ^ -5);
        fb.n(-23192);
        wt.b(false);
        go.a(99);
        mg.a(param0 ^ 136);
        hv.a(23);
        jk.f((byte) -37);
        gl.a(93);
        m.a(0);
        s.i(-1);
        nv.j(696);
        st.b((byte) -103);
        jg.h((byte) -112);
        ln.k(31235);
        ll.b((byte) -56);
        fu.a(true);
        ht.a(false);
        ci.a(18);
        ij.g((byte) -46);
        ff.a((byte) 101);
        pn.b(-1);
        dq.a(false);
        dt.a(43);
        cj.a(param0 ^ -104);
        vt.a(-73);
        as.a();
        nt.i(4476);
        ov.a(1);
        lc.a(-119);
        nb.a(true);
        ag.a((byte) 100);
        vc.g((byte) -126);
        wd.a((byte) 122);
        ni.a(-1859);
        sm.a(0);
        wp.b(param0 ^ 6);
        op.b(-1842526431);
        cr.a(param0 + 18080);
        ri.b(true);
        rp.a(102);
        mn.a((byte) 106);
        pj.h((byte) 115);
        oc.b((byte) -116);
        dk.a(7571);
        ii.a(84);
        bl.b((byte) -104);
        lk.a(param0 + -6);
        li.a((byte) -126);
        tm.a(15);
        fi.a((byte) 121);
        dw.a(param0 ^ 6);
        sb.a(-127);
        q.b(-84);
        en.b((byte) 38);
        rl.b(20);
        ba.c((byte) -35);
        od.b(param0 + -6);
        qi.b((byte) 85);
        sr.a((byte) 121);
        nk.a(-15207);
        pa.c((byte) 125);
        md.c(param0 ^ 32312);
        fa.a(param0 + -121);
        kw.d((byte) -122);
        r.a(param0 ^ -94);
        jm.a(104);
        vd.a(-5);
        wn.a(param0 ^ param0);
        ue.a(92);
        j.a(true);
        vl.a(120);
        aa.b((byte) -104);
        wo.a(false);
        gp.c(85);
        oh.b((byte) -47);
        vs.a(0);
        cf.a(-13);
        iu.a((byte) -123);
        gd.a(22897);
        hm.g(10040319);
        kb.g(1);
        jo.g(param0 + -6);
        jf.g(param0 + 121);
        ir.a(false);
        pb.g(50);
        tq.g(115);
        ik.g(param0 ^ -107);
        uc.g(220);
        ev.g(1);
        el.g((byte) 52);
        uj.a(false);
        lh.g((byte) 96);
        ej.h((byte) 118);
        im.a(-18523);
        at.h((byte) -117);
        dn.c(true);
        qp.a(14);
        hh.a((byte) 121);
        qj.b((byte) -125);
        dl.a((byte) -61);
        hr.a(2);
        k.a(-77);
        mp.a(1);
        hf.a(true);
        v.b(0);
        bv.g(-70);
        lo.c((byte) -96);
        qo.f((byte) -126);
        mh.g(-29635);
        fo.c((byte) 92);
        ge.c((byte) 76);
        ic.a((byte) 68);
        er.a((byte) -94);
        rv.a(-89);
        lg.d(param0 ^ 344);
        ea.a(param0 ^ -110);
        ld.a((byte) 112);
        this.field_z = null;
    }

    public final void init() {
        this.a("Kickabout", 19, (byte) -60);
    }

    static {
        field_I = "Name is available";
        field_F = "Duration";
    }
}
