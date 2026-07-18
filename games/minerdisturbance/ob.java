/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        try {
            mk.field_b[2] = true;
            if (param0 != -9859) {
                ((ob) this).field_s = null;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ob.E(" + param0 + ')');
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.b(false, false);
              if (!param0) {
                break L1;
              } else {
                this.i(1);
                break L1;
              }
            }
            L2: {
              if (!param2) {
                break L2;
              } else {
                this.m(-9859);
                break L2;
              }
            }
            L3: {
              var6_int = 107 / ((param1 - 27) / 46);
              if (param4) {
                this.j(22810);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param3) {
                this.p(110);
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
          throw lj.a((Throwable) (Object) var6, "ob.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void o(int param0) {
        try {
            field_w = null;
            field_q = null;
            field_v = null;
            field_n = null;
            if (param0 < 48) {
                field_q = null;
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ob.C(" + param0 + ')');
        }
    }

    final int c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_31_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var2_int = this.d((byte) 86);
                if (var2_int == 0) {
                  break L2;
                } else {
                  if (var2_int == 1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (!mk.field_b[1]) {
                  break L3;
                } else {
                  kh.a(-1, 2);
                  break L3;
                }
              }
              L4: {
                if (!mk.field_b[2]) {
                  break L4;
                } else {
                  nb.a((byte) -52, 3);
                  break L4;
                }
              }
              L5: {
                if (!mk.field_b[3]) {
                  break L5;
                } else {
                  qd.a(4, (byte) -125);
                  break L5;
                }
              }
              L6: {
                if (mk.field_b[4]) {
                  gh.a(5, 21121);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (!mk.field_b[5]) {
                  break L7;
                } else {
                  gi.a(85, 6);
                  break L7;
                }
              }
              L8: {
                if (!mk.field_b[6]) {
                  break L8;
                } else {
                  g.a((byte) -69, 7);
                  break L8;
                }
              }
              if (!mk.field_b[8]) {
                break L1;
              } else {
                hd.a(-124);
                break L1;
              }
            }
            L9: {
              if (param0 <= -103) {
                break L9;
              } else {
                int discarded$2 = ob.a((byte) -21, (pf) null, (pf) null);
                break L9;
              }
            }
            stackOut_31_0 = var2_int;
            stackIn_32_0 = stackOut_31_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ob.Q(" + param0 + ')');
        }
        return stackIn_32_0;
    }

    private final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
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
              if (!param0) {
                break L1;
              } else {
                ((ob) this).field_z = false;
                break L1;
              }
            }
            ge.field_g[10] = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ob.B(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException var3 = null;
        java.awt.Container var3_ref = null;
        int var3_int = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        int stackIn_38_0 = 0;
        int stackIn_196_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_200_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_202_0 = 0;
        int stackIn_202_1 = 0;
        String stackIn_202_2 = null;
        int stackIn_204_0 = 0;
        int stackIn_204_1 = 0;
        String stackIn_204_2 = null;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        String stackIn_205_2 = null;
        int stackIn_205_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_37_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_200_1 = 0;
        int stackOut_196_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_198_1 = 0;
        int stackOut_201_0 = 0;
        int stackOut_201_1 = 0;
        String stackOut_201_2 = null;
        int stackOut_204_0 = 0;
        int stackOut_204_1 = 0;
        String stackOut_204_2 = null;
        int stackOut_204_3 = 0;
        int stackOut_202_0 = 0;
        int stackOut_202_1 = 0;
        String stackOut_202_2 = null;
        int stackOut_202_3 = 0;
        var5 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (ij.field_o == null) {
                break L1;
              } else {
                L2: {
                  if (kf.field_d != null) {
                    break L2;
                  } else {
                    var3_ref = da.b(24255);
                    var4 = var3_ref.getSize();
                    ij.field_o.a(false, var4.height, var4.width);
                    break L2;
                  }
                }
                ij.field_o.c(565);
                break L1;
              }
            }
            L3: {
              mh.b(114);
              k.f(10525);
              if (hl.b((byte) 120)) {
                break L3;
              } else {
                if (fh.field_b == 11) {
                  break L3;
                } else {
                  hm.d((byte) 22);
                  break L3;
                }
              }
            }
            L4: {
              if (null == pf.field_e) {
                break L4;
              } else {
                ki.field_n = pf.field_e.a((byte) -124);
                break L4;
              }
            }
            L5: {
              if (!gd.b((byte) -110)) {
                break L5;
              } else {
                L6: {
                  var3_int = pl.b((byte) -116) * 1200;
                  if (((ob) this).field_z) {
                    break L6;
                  } else {
                    if (~mk.b(24) >= ~var3_int) {
                      break L5;
                    } else {
                      if (var3_int >= u.b(-4440)) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                ((ob) this).field_z = false;
                si.a(-75);
                eb.a((byte) -96);
                da.a(true, le.field_a, 2);
                oj.c((byte) -62);
                nd.field_e = true;
                j.field_f = 15000L + sf.a((byte) -58);
                break L5;
              }
            }
            if (param1 == 18808) {
              L7: {
                L8: {
                  if (tb.field_f == -1) {
                    break L8;
                  } else {
                    if (tb.field_f != 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (tb.field_f != -1) {
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
                  tb.field_f = si.a((byte) -115);
                  if (var3_int == 0) {
                    break L10;
                  } else {
                    if (0 != tb.field_f) {
                      break L10;
                    } else {
                      if (fh.field_b != 11) {
                        break L10;
                      } else {
                        if (!ci.a(82)) {
                          mc.c(-78);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                }
                if (tb.field_f == -1) {
                  break L7;
                } else {
                  if (0 == tb.field_f) {
                    break L7;
                  } else {
                    j.field_f = sf.a((byte) -52) + 15000L;
                    break L7;
                  }
                }
              }
              L11: {
                if (tb.field_f == -1) {
                  break L11;
                } else {
                  if (tb.field_f == 0) {
                    break L11;
                  } else {
                    L12: {
                      if (10 <= af.field_u) {
                        break L12;
                      } else {
                        L13: {
                          if (tb.field_f == 3) {
                            break L13;
                          } else {
                            L14: {
                              if (tb.field_f != 4) {
                                break L14;
                              } else {
                                ((ob) this).a((byte) -29, "js5io");
                                if (var5 == 0) {
                                  break L11;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              if (tb.field_f == 2) {
                                break L15;
                              } else {
                                L16: {
                                  if (tb.field_f == 5) {
                                    break L16;
                                  } else {
                                    ((ob) this).a((byte) -128, "js5connect");
                                    if (var5 == 0) {
                                      break L11;
                                    } else {
                                      break L16;
                                    }
                                  }
                                }
                                ((ob) this).a((byte) -125, "outofdate");
                                if (var5 == 0) {
                                  break L11;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            ((ob) this).a((byte) 120, "js5connect_full");
                            if (var5 == 0) {
                              break L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                        ((ob) this).a((byte) -18, "js5crc");
                        if (var5 == 0) {
                          break L11;
                        } else {
                          break L12;
                        }
                      }
                    }
                    if (fh.field_b < 10) {
                      break L11;
                    } else {
                      L17: {
                        L18: {
                          eb.a((byte) -110);
                          if (tb.field_f == 3) {
                            break L18;
                          } else {
                            L19: {
                              if (tb.field_f == 4) {
                                break L19;
                              } else {
                                L20: {
                                  if (tb.field_f == 2) {
                                    break L20;
                                  } else {
                                    L21: {
                                      if (tb.field_f != 5) {
                                        break L21;
                                      } else {
                                        da.a(true, rd.field_e, 5);
                                        if (var5 == 0) {
                                          break L17;
                                        } else {
                                          break L21;
                                        }
                                      }
                                    }
                                    da.a(true, kj.field_b, 256);
                                    if (var5 == 0) {
                                      break L17;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                da.a(true, ng.field_k, 256);
                                if (var5 == 0) {
                                  break L17;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            da.a(true, kc.field_e, 256);
                            if (var5 == 0) {
                              break L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        da.a(true, wf.field_N, 256);
                        break L17;
                      }
                      nd.field_e = true;
                      break L11;
                    }
                  }
                }
              }
              L22: {
                L23: {
                  L24: {
                    if (-1 == tb.field_f) {
                      break L24;
                    } else {
                      if (tb.field_f != 0) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  if (!ci.a(106)) {
                    break L22;
                  } else {
                    break L23;
                  }
                }
                if (sf.a((byte) -15) < j.field_f) {
                  break L22;
                } else {
                  nd.field_e = false;
                  if (tb.field_f == -1) {
                    break L22;
                  } else {
                    if (tb.field_f == 0) {
                      break L22;
                    } else {
                      tb.field_f = -1;
                      ql.a(-78);
                      break L22;
                    }
                  }
                }
              }
              L25: {
                if (tb.field_f != 0) {
                  break L25;
                } else {
                  if (ci.a(param1 + -18752)) {
                    break L25;
                  } else {
                    ul.field_a = false;
                    break L25;
                  }
                }
              }
              L26: {
                if (af.field_u != 0) {
                  break L26;
                } else {
                  if (!sn.a((byte) 107)) {
                    break L26;
                  } else {
                    af.field_u = 1;
                    break L26;
                  }
                }
              }
              L27: {
                if (af.field_u == 1) {
                  L28: {
                    if (kb.field_c != 0) {
                      sb.field_r = lb.a(1, s.field_Q);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  hj.field_i = eb.a(true, fn.field_p, false, 1, true);
                  pb.field_r = eb.a(true, se.field_N, false, 1, true);
                  oh.field_C = eb.a(true, da.field_c, false, 1, true);
                  s.field_P = pb.field_r;
                  af.field_u = 2;
                  field_q = hj.field_i;
                  break L27;
                } else {
                  break L27;
                }
              }
              L29: {
                if (af.field_u != 2) {
                  break L29;
                } else {
                  L30: {
                    if (null == sb.field_r) {
                      break L30;
                    } else {
                      if (!sb.field_r.a((byte) 83)) {
                        break L30;
                      } else {
                        L31: {
                          if (sb.field_r.b(false, "")) {
                            break L31;
                          } else {
                            sb.field_r = null;
                            if (var5 == 0) {
                              break L30;
                            } else {
                              break L31;
                            }
                          }
                        }
                        if (sb.field_r.a(false, "")) {
                          li.a(9259, sb.field_r);
                          sb.field_r = null;
                          wf.p(4462);
                          break L30;
                        } else {
                          break L30;
                        }
                      }
                    }
                  }
                  if (null == sb.field_r) {
                    af.field_u = 3;
                    break L29;
                  } else {
                    break L29;
                  }
                }
              }
              L32: {
                if (3 != af.field_u) {
                  break L32;
                } else {
                  if (!eg.a(pb.field_r, 4, hj.field_i, oh.field_C)) {
                    break L32;
                  } else {
                    if (eb.a(oh.field_C, (byte) 124)) {
                      L33: {
                        L34: {
                          bh.h((byte) 123);
                          em.g(-1719110238);
                          bj.field_c = ll.field_e;
                          jb.field_q = false;
                          mj.a(v.field_e, hj.field_i, 43, oh.field_C, pb.field_r);
                          if (nc.field_e) {
                            break L34;
                          } else {
                            if (null == bm.field_q) {
                              break L33;
                            } else {
                              break L34;
                            }
                          }
                        }
                        L35: {
                          stackOut_195_0 = param1 + 1123;
                          stackIn_200_0 = stackOut_195_0;
                          stackIn_196_0 = stackOut_195_0;
                          if (nc.field_e) {
                            stackOut_200_0 = stackIn_200_0;
                            stackOut_200_1 = 0;
                            stackIn_201_0 = stackOut_200_0;
                            stackIn_201_1 = stackOut_200_1;
                            break L35;
                          } else {
                            stackOut_196_0 = stackIn_196_0;
                            stackIn_198_0 = stackOut_196_0;
                            stackOut_198_0 = stackIn_198_0;
                            stackOut_198_1 = 1;
                            stackIn_201_0 = stackOut_198_0;
                            stackIn_201_1 = stackOut_198_1;
                            break L35;
                          }
                        }
                        L36: {
                          stackOut_201_0 = stackIn_201_0;
                          stackOut_201_1 = stackIn_201_1;
                          stackOut_201_2 = bm.field_q;
                          stackIn_204_0 = stackOut_201_0;
                          stackIn_204_1 = stackOut_201_1;
                          stackIn_204_2 = stackOut_201_2;
                          stackIn_202_0 = stackOut_201_0;
                          stackIn_202_1 = stackOut_201_1;
                          stackIn_202_2 = stackOut_201_2;
                          if (nc.field_e) {
                            stackOut_204_0 = stackIn_204_0;
                            stackOut_204_1 = stackIn_204_1;
                            stackOut_204_2 = (String) (Object) stackIn_204_2;
                            stackOut_204_3 = 0;
                            stackIn_205_0 = stackOut_204_0;
                            stackIn_205_1 = stackOut_204_1;
                            stackIn_205_2 = stackOut_204_2;
                            stackIn_205_3 = stackOut_204_3;
                            break L36;
                          } else {
                            stackOut_202_0 = stackIn_202_0;
                            stackOut_202_1 = stackIn_202_1;
                            stackOut_202_2 = (String) (Object) stackIn_202_2;
                            stackOut_202_3 = 1;
                            stackIn_205_0 = stackOut_202_0;
                            stackIn_205_1 = stackOut_202_1;
                            stackIn_205_2 = stackOut_202_2;
                            stackIn_205_3 = stackOut_202_3;
                            break L36;
                          }
                        }
                        bb.a(stackIn_205_0, stackIn_205_1 != 0, stackIn_205_2, stackIn_205_3 != 0);
                        break L33;
                      }
                      L37: {
                        if (!bd.field_d) {
                          break L37;
                        } else {
                          km.a((byte) -69);
                          break L37;
                        }
                      }
                      L38: {
                        if (hj.field_o != null) {
                          break L38;
                        } else {
                          hj.field_o = da.a(param1 + -17950);
                          tm.field_I = hm.f((byte) -67);
                          break L38;
                        }
                      }
                      fi.a((byte) 104, oh.field_C, hj.field_o, tm.field_I);
                      pb.field_r = null;
                      hj.field_i = null;
                      oh.field_C = null;
                      vk.a(true, (java.applet.Applet) this);
                      wf.p(param1 ^ 22550);
                      af.field_u = 10;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                }
              }
              L39: {
                if (af.field_u == 10) {
                  L40: {
                    if (kb.field_c != 0) {
                      fh.field_c = lb.a(1, mg.field_f);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                  af.field_u = 11;
                  break L39;
                } else {
                  break L39;
                }
              }
              L41: {
                if (af.field_u == 11) {
                  L42: {
                    L43: {
                      if (fh.field_c == null) {
                        break L43;
                      } else {
                        if (!fh.field_c.a((byte) 84)) {
                          break L42;
                        } else {
                          if (!fh.field_c.b(-1)) {
                            break L42;
                          } else {
                            break L43;
                          }
                        }
                      }
                    }
                    oe.field_a = true;
                    af.field_u = 12;
                    if (var5 == 0) {
                      break L41;
                    } else {
                      break L42;
                    }
                  }
                  pa.a(true, qn.a(ge.field_d, ic.field_g, false, fh.field_c), 0.0f);
                  break L41;
                } else {
                  break L41;
                }
              }
              L44: {
                if (af.field_u != 12) {
                  break L44;
                } else {
                  if (!oe.field_a) {
                    af.field_u = 13;
                    break L44;
                  } else {
                    break L44;
                  }
                }
              }
              L45: {
                if (af.field_u != 13) {
                  break L45;
                } else {
                  L46: {
                    var3_int = 1;
                    if (null != qg.field_d) {
                      var3_int = qg.field_d.a(true) ? 1 : 0;
                      pa.a(true, qg.field_d.field_g, qg.field_d.field_c);
                      break L46;
                    } else {
                      break L46;
                    }
                  }
                  if (var3_int != 0) {
                    af.field_u = 20;
                    break L45;
                  } else {
                    break L45;
                  }
                }
              }
              L47: {
                if (param0) {
                  break L47;
                } else {
                  if (!fa.field_a) {
                    break L47;
                  } else {
                    ci.a(ef.field_c, 0);
                    ((ob) this).c(-111);
                    ab.a((byte) -13, ef.field_c);
                    break L47;
                  }
                }
              }
              L48: {
                if (mk.field_b[8]) {
                  cm.e(param1 + 5875);
                  break L48;
                } else {
                  break L48;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "ob.U(" + param0 + ',' + param1 + ')');
        }
    }

    private final void p(int param0) {
        try {
            mk.field_b[5] = true;
            if (param0 <= 104) {
                ((ob) this).a(false, -107, (byte) 111, 87, 84, 120, -94, -19);
            }
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ob.J(" + param0 + ')');
        }
    }

    private final int d(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_37_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 > 67) {
              if (((ob) this).field_i) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (ci.a(101)) {
                  if (!nd.field_e) {
                    var2_int = re.a(((ob) this).field_A, false, ((ob) this).field_p, fc.b((byte) 119), true, ii.b((byte) -42));
                    if (var2_int != -1) {
                      L1: {
                        if (var2_int == 0) {
                          break L1;
                        } else {
                          if (var2_int == 1) {
                            break L1;
                          } else {
                            L2: {
                              if (!tn.field_M) {
                                ((ob) this).a((byte) -120, "reconnect");
                                break L2;
                              } else {
                                break L2;
                              }
                            }
                            eb.a((byte) -33);
                            da.a(true, nf.field_g, var2_int);
                            nd.field_e = true;
                            j.field_f = 15000L + sf.a((byte) -89);
                            stackOut_36_0 = var2_int;
                            stackIn_37_0 = stackOut_36_0;
                            break L0;
                          }
                        }
                      }
                      L3: {
                        if (11 != fh.field_b) {
                          break L3;
                        } else {
                          if (tb.field_f == 0) {
                            mc.c(-73);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_30_0 = var2_int;
                      stackIn_31_0 = stackOut_30_0;
                      return stackIn_31_0;
                    } else {
                      stackOut_15_0 = -1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0;
                    }
                  } else {
                    stackOut_12_0 = -1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = -1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_1_0 = -114;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ob.L(" + param0 + ')');
        }
        return stackIn_37_0;
    }

    final void a(String param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
                ((ob) this).field_x = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ob.R(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void i(int param0) {
        try {
            mk.field_b[param0] = true;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "ob.M(" + param0 + ')');
        }
    }

    private final void j(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 22810) {
                break L1;
              } else {
                ((ob) this).field_B = -24;
                break L1;
              }
            }
            mk.field_b[4] = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ob.S(" + param0 + ')');
        }
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var7 = null;
        String var7_ref = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
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
            var6_int = -94 % ((param4 - 70) / 39);
            try {
              L1: {
                if (!((ob) this).a((byte) -50)) {
                  return;
                } else {
                  L2: {
                    L3: {
                      ((ob) this).field_s = ((ob) this).getCodeBase().getHost();
                      var7_ref = ((ob) this).field_s.toLowerCase();
                      stackOut_4_0 = this;
                      stackIn_8_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var7_ref.equals((Object) (Object) "jagex.com")) {
                        break L3;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_10_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (!var7_ref.endsWith(".jagex.com")) {
                          stackOut_10_0 = this;
                          stackOut_10_1 = 0;
                          stackIn_11_0 = stackOut_10_0;
                          stackIn_11_1 = stackOut_10_1;
                          break L2;
                        } else {
                          stackOut_6_0 = this;
                          stackIn_8_0 = stackOut_6_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_8_0 = this;
                    stackOut_8_1 = 1;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    break L2;
                  }
                  L4: {
                    ((ob) this).field_p = stackIn_11_1 != 0;
                    ((ob) this).field_y = Integer.parseInt(((ob) this).getParameter("gameport1"));
                    ((ob) this).field_o = Integer.parseInt(((ob) this).getParameter("gameport2"));
                    var8 = ((ob) this).getParameter("servernum");
                    if (var8 != null) {
                      ((ob) this).field_t = Integer.parseInt(var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    ((ob) this).field_B = Integer.parseInt(((ob) this).getParameter("gamecrc"));
                    ((ob) this).field_u = Long.parseLong(((ob) this).getParameter("instanceid"));
                    ((ob) this).field_x = ((ob) this).getParameter("member").equals((Object) (Object) "yes");
                    var9 = ((ob) this).getParameter("lang");
                    if (null != var9) {
                      ((ob) this).field_r = Integer.parseInt(var9);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (((ob) this).field_r < 5) {
                      break L6;
                    } else {
                      ((ob) this).field_r = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((ob) this).getParameter("affid");
                    if (var10 == null) {
                      break L7;
                    } else {
                      ((ob) this).field_A = Integer.parseInt(var10);
                      break L7;
                    }
                  }
                  bd.field_d = Boolean.valueOf(((ob) this).getParameter("simplemode")).booleanValue();
                  ((ob) this).a(param2, param1, ((ob) this).field_B, 3, param0, param3, 32);
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var7 = (Exception) (Object) decompiledCaughtException;
                di.a((Throwable) (Object) var7, 1, (String) null);
                ((ob) this).a((byte) -125, "crash");
                break L8;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var6;
            stackOut_29_1 = new StringBuilder().append("ob.V(");
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L9;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void h(int param0) {
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
              var2_int = kj.field_a.d((byte) -54);
              if ((1 & var2_int) == 0) {
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
            var4 = rj.field_d - 1;
            var5 = new byte[var4];
            kj.field_a.a(var5, 113, var4, param0);
            cn.a(bm.c(-98), bh.a(var5, 88), 11050, var3 != 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) (Object) runtimeException, "ob.D(" + param0 + ')');
        }
    }

    final static boolean l(int param0) {
        RuntimeException var1 = null;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (ci.field_i == null) {
                  break L3;
                } else {
                  if (!qd.field_Q.a(param0 ^ -18545)) {
                    break L3;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_10_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var1, "ob.I(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    private final void b(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              mk.field_b[3] = true;
              mk.field_b[16] = true;
              mk.field_b[8] = param0;
              mk.field_b[18] = true;
              if (!param1) {
                break L1;
              } else {
                ((ob) this).field_o = 34;
                break L1;
              }
            }
            mk.field_b[7] = true;
            mk.field_b[17] = true;
            mk.field_b[0] = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "ob.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void k(int param0) {
        RuntimeException var2 = null;
        int var3 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        var3 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              L2: {
                if (!bi.a(-11)) {
                  break L2;
                } else {
                  L3: {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 1;
                    stackOut_2_2 = 0;
                    stackIn_7_0 = stackOut_2_0;
                    stackIn_7_1 = stackOut_2_1;
                    stackIn_7_2 = stackOut_2_2;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    stackIn_3_2 = stackOut_2_2;
                    if (kf.field_d == null) {
                      stackOut_7_0 = this;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = stackIn_7_2;
                      stackOut_7_3 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      stackIn_8_3 = stackOut_7_3;
                      break L3;
                    } else {
                      stackOut_3_0 = this;
                      stackOut_3_1 = stackIn_3_1;
                      stackOut_3_2 = stackIn_3_2;
                      stackIn_5_0 = stackOut_3_0;
                      stackIn_5_1 = stackOut_3_1;
                      stackIn_5_2 = stackOut_3_2;
                      stackOut_5_0 = this;
                      stackOut_5_1 = stackIn_5_1;
                      stackOut_5_2 = stackIn_5_2;
                      stackOut_5_3 = 1;
                      stackIn_8_0 = stackOut_5_0;
                      stackIn_8_1 = stackOut_5_1;
                      stackIn_8_2 = stackOut_5_2;
                      stackIn_8_3 = stackOut_5_3;
                      break L3;
                    }
                  }
                  int discarded$4 = this.a(stackIn_8_1 != 0, stackIn_8_2 != 0, stackIn_8_3 != 0);
                  if (var3 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (10 > af.field_u) {
                break L1;
              } else {
                L4: {
                  if (fe.j(param0 ^ -94)) {
                    break L4;
                  } else {
                    ed.a(127);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (fh.field_b == 0) {
                    break L5;
                  } else {
                    il.a(ki.field_n, (byte) -109);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L5;
                    }
                  }
                }
                int discarded$5 = this.a(true, false, false);
                break L1;
              }
            }
            L6: {
              if (param0 == 10) {
                break L6;
              } else {
                this.b(true, true);
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ob.H(" + param0 + ')');
        }
    }

    private final void g(int param0) {
        RuntimeException runtimeException = null;
        String var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = ca.b((byte) -124);
              tk.a(var2, bm.c(-116), (byte) -15);
              if (param0 == -18) {
                break L1;
              } else {
                int discarded$2 = ((ob) this).c((byte) 99);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) (Object) runtimeException, "ob.T(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var9 = null;
        RuntimeException var9_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var9 = new java.awt.Frame("Jagex");
              var9.pack();
              var9.dispose();
              if (param2 == -121) {
                break L1;
              } else {
                ((ob) this).k(-25);
                break L1;
              }
            }
            ((ob) this).setBackground(java.awt.Color.black);
            kb.field_c = ((ob) this).field_r;
            od.a(122, kb.field_c);
            qg.a(qa.field_a, ((ob) this).field_t, ((ob) this).field_B, param1, ((ob) this).field_y, ((ob) this).field_u, ((ob) this).field_o, ((ob) this).field_s, ((ob) this).field_x, 5000, true, param0, 5000, kb.field_c);
            q.a(((ob) this).field_t, qa.field_a, kb.field_c, ((ob) this).field_s, ((ob) this).field_o, param1, 20, ((ob) this).field_B, ((ob) this).field_y);
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var9_ref, "ob.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            RuntimeException var4 = null;
            int var4_int = 0;
            Exception var5 = null;
            int var5_int = 0;
            Boolean var6 = null;
            sb var6_ref = null;
            String var7 = null;
            int var8 = 0;
            int stackIn_79_0 = 0;
            String stackIn_99_0 = null;
            String stackIn_101_0 = null;
            String stackIn_102_0 = null;
            int stackIn_102_1 = 0;
            Object stackIn_106_0 = null;
            Object stackIn_108_0 = null;
            Object stackIn_109_0 = null;
            int stackIn_109_1 = 0;
            int stackIn_118_0 = 0;
            int stackIn_121_0 = 0;
            int stackIn_123_0 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_98_0 = null;
            String stackOut_101_0 = null;
            int stackOut_101_1 = 0;
            String stackOut_99_0 = null;
            int stackOut_99_1 = 0;
            Object stackOut_105_0 = null;
            Object stackOut_108_0 = null;
            int stackOut_108_1 = 0;
            Object stackOut_106_0 = null;
            int stackOut_106_1 = 0;
            int stackOut_117_0 = 0;
            int stackOut_122_0 = 0;
            int stackOut_120_0 = 0;
            int stackOut_78_0 = 0;
            var8 = MinerDisturbance.field_ab;
            try {
              L0: {
                var4_int = bj.a(ki.field_n, kb.field_c, param2, 65);
                if (var4_int != 0) {
                  L1: {
                    if (var4_int != 1) {
                      break L1;
                    } else {
                      L2: {
                        var5_int = ob.a((byte) 112, mf.a(15), fe.f(0));
                        if (-1 == var5_int) {
                          break L2;
                        } else {
                          vj.a(-21614, nf.field_g, var5_int, vh.field_i);
                          nf.field_g = null;
                          vh.field_i = null;
                          break L2;
                        }
                      }
                      var6 = aj.a(103);
                      if (null != var6) {
                        jc.a((byte) 17, var6.booleanValue());
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L3: {
                    if (var4_int != 2) {
                      break L3;
                    } else {
                      var5_int = dn.a(lm.n(-124), fa.a(true), mb.b((byte) -95), fc.b((byte) 123), ii.b((byte) 63), ((ob) this).field_A, -14543);
                      if (-1 != var5_int) {
                        ee.a(nf.field_g, vh.field_i, (byte) -98, var5_int);
                        nf.field_g = null;
                        vh.field_i = null;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var4_int != 3) {
                      break L4;
                    } else {
                      L5: {
                        if (tb.field_f == -1) {
                          break L5;
                        } else {
                          if (tb.field_f != 0) {
                            tb.field_f = -1;
                            ql.a(-93);
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (param1) {
                          break L6;
                        } else {
                          L7: {
                            var5_int = re.a(((ob) this).field_A, false, ((ob) this).field_p, fc.b((byte) 127), false, ii.b((byte) 126));
                            if (var5_int == -1) {
                              break L7;
                            } else {
                              L8: {
                                if (var5_int != 0) {
                                  break L8;
                                } else {
                                  jn.field_n = ne.field_Q;
                                  mc.c(-100);
                                  qc.field_b = false;
                                  fh.field_b = 10;
                                  if (var8 == 0) {
                                    break L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              da.a(true, nf.field_g, var5_int);
                              nf.field_g = null;
                              break L7;
                            }
                          }
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                      nd.field_e = false;
                      break L4;
                    }
                  }
                  L9: {
                    if (var4_int != 4) {
                      break L9;
                    } else {
                      L10: {
                        if (!v.field_e) {
                          break L10;
                        } else {
                          kn.a(13569, bm.c(-89));
                          if (var8 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      qc.field_b = true;
                      fh.field_b = 10;
                      break L9;
                    }
                  }
                  L11: {
                    if (5 == var4_int) {
                      uf.a(13, bm.c(-84));
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var4_int == 6) {
                      if (jb.field_q) {
                        fh.field_b = 10;
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
                      tg.a((byte) -114, bm.c(-112));
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var4_int == 8) {
                      kn.a(13569, bm.c(-112));
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var4_int != 9) {
                      break L15;
                    } else {
                      dk.a(bm.c(-77), (byte) -27);
                      break L15;
                    }
                  }
                  L16: {
                    if (var4_int != 10) {
                      break L16;
                    } else {
                      sn.field_c.d((byte) -51, 17);
                      break L16;
                    }
                  }
                  L17: {
                    if (var4_int != 11) {
                      break L17;
                    } else {
                      ne.a(bm.c(-108), 30433);
                      break L17;
                    }
                  }
                  if (param0) {
                    L18: {
                      if (12 == var4_int) {
                        jk.a(bm.c(-86), 68, kn.a(0));
                        break L18;
                      } else {
                        break L18;
                      }
                    }
                    L19: {
                      if (13 == var4_int) {
                        try {
                          L20: {
                            L21: {
                              if (null == hf.field_u) {
                                hf.field_u = new lf(qa.field_a, new java.net.URL(((ob) this).getCodeBase(), "countrylist.ws"), 5000);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            L22: {
                              var5_int = hf.field_u.a((byte) 105) ? 1 : 0;
                              if (var5_int != 0) {
                                L23: {
                                  L24: {
                                    var6_ref = hf.field_u.a(0);
                                    if (var6_ref != null) {
                                      break L24;
                                    } else {
                                      fm.a((String) null, false);
                                      if (var8 == 0) {
                                        break L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  L25: {
                                    var7 = ph.a((byte) 31, var6_ref.field_o, var6_ref.field_u, 0);
                                    stackOut_98_0 = (String) var7;
                                    stackIn_101_0 = stackOut_98_0;
                                    stackIn_99_0 = stackOut_98_0;
                                    if (param0) {
                                      stackOut_101_0 = (String) (Object) stackIn_101_0;
                                      stackOut_101_1 = 0;
                                      stackIn_102_0 = stackOut_101_0;
                                      stackIn_102_1 = stackOut_101_1;
                                      break L25;
                                    } else {
                                      stackOut_99_0 = (String) (Object) stackIn_99_0;
                                      stackOut_99_1 = 1;
                                      stackIn_102_0 = stackOut_99_0;
                                      stackIn_102_1 = stackOut_99_1;
                                      break L25;
                                    }
                                  }
                                  fm.a(stackIn_102_0, stackIn_102_1 != 0);
                                  break L23;
                                }
                                hf.field_u = null;
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            break L20;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L26: {
                            L27: {
                              var5 = (Exception) (Object) decompiledCaughtException;
                              di.a((Throwable) (Object) var5, 1, "S1");
                              stackOut_105_0 = null;
                              stackIn_108_0 = stackOut_105_0;
                              stackIn_106_0 = stackOut_105_0;
                              if (param0) {
                                stackOut_108_0 = stackIn_108_0;
                                stackOut_108_1 = 0;
                                stackIn_109_0 = stackOut_108_0;
                                stackIn_109_1 = stackOut_108_1;
                                break L27;
                              } else {
                                stackOut_106_0 = stackIn_106_0;
                                stackOut_106_1 = 1;
                                stackIn_109_0 = stackOut_106_0;
                                stackIn_109_1 = stackOut_106_1;
                                break L27;
                              }
                            }
                            fm.a((String) (Object) stackIn_109_0, stackIn_109_1 != 0);
                            hf.field_u = null;
                            break L26;
                          }
                        }
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L28: {
                      if (var4_int == 15) {
                        fh.field_b = 10;
                        break L28;
                      } else {
                        break L28;
                      }
                    }
                    if (16 == var4_int) {
                      stackOut_117_0 = 1;
                      stackIn_118_0 = stackOut_117_0;
                      return stackIn_118_0;
                    } else {
                      if (var4_int != 17) {
                        stackOut_122_0 = 0;
                        stackIn_123_0 = stackOut_122_0;
                        break L0;
                      } else {
                        stackOut_120_0 = 2;
                        stackIn_121_0 = stackOut_120_0;
                        return stackIn_121_0;
                      }
                    }
                  } else {
                    stackOut_78_0 = 19;
                    stackIn_79_0 = stackOut_78_0;
                    return stackIn_79_0;
                  }
                } else {
                  throw new IllegalStateException();
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (RuntimeException) (Object) decompiledCaughtException;
              throw lj.a((Throwable) (Object) var4, "ob.K(" + param0 + ',' + param1 + ',' + param2 + ')');
            }
            return stackIn_123_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void n(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        id var3 = null;
        int var4 = 0;
        int stackIn_82_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_81_0 = 0;
        int stackOut_79_0 = 0;
        var4 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var2_int = oj.field_K;
              if (param0 >= 21) {
                break L1;
              } else {
                this.g(49);
                break L1;
              }
            }
            L2: {
              if (var2_int >= 64) {
                break L2;
              } else {
                if (mk.field_b[var2_int]) {
                  if (var2_int != 0) {
                    L3: {
                      L4: {
                        if (var2_int == 1) {
                          break L4;
                        } else {
                          L5: {
                            if (var2_int == 2) {
                              break L5;
                            } else {
                              L6: {
                                if (3 != var2_int) {
                                  break L6;
                                } else {
                                  ki.a(-15003);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if (var2_int == 4) {
                                  break L7;
                                } else {
                                  L8: {
                                    if (var2_int != 5) {
                                      break L8;
                                    } else {
                                      h.b(115);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  L9: {
                                    if (var2_int == 6) {
                                      break L9;
                                    } else {
                                      L10: {
                                        if (var2_int != 7) {
                                          break L10;
                                        } else {
                                          this.g(-18);
                                          if (var4 == 0) {
                                            break L3;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (var2_int != 8) {
                                          break L11;
                                        } else {
                                          ff.a(qa.field_a, (sb) (Object) kj.field_a, rj.field_d, true);
                                          if (var4 == 0) {
                                            break L3;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      L12: {
                                        if (16 == var2_int) {
                                          break L12;
                                        } else {
                                          L13: {
                                            if (var2_int == 11) {
                                              break L13;
                                            } else {
                                              if (12 == var2_int) {
                                                break L13;
                                              } else {
                                                L14: {
                                                  if (var2_int == 13) {
                                                    break L14;
                                                  } else {
                                                    L15: {
                                                      if (17 == var2_int) {
                                                        break L15;
                                                      } else {
                                                        L16: {
                                                          if (18 != var2_int) {
                                                            break L16;
                                                          } else {
                                                            ri.a(true);
                                                            if (var4 == 0) {
                                                              break L3;
                                                            } else {
                                                              break L16;
                                                            }
                                                          }
                                                        }
                                                        di.a((Throwable) null, 1, "MGS1: " + hj.a((byte) 86));
                                                        si.a(-106);
                                                        if (var4 == 0) {
                                                          break L3;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    this.h(0);
                                                    if (var4 == 0) {
                                                      break L3;
                                                    } else {
                                                      break L14;
                                                    }
                                                  }
                                                }
                                                cb.c(false);
                                                if (var4 == 0) {
                                                  break L3;
                                                } else {
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                          L17: {
                                            if (12 != var2_int) {
                                              stackOut_81_0 = 0;
                                              stackIn_82_0 = stackOut_81_0;
                                              break L17;
                                            } else {
                                              stackOut_79_0 = 1;
                                              stackIn_82_0 = stackOut_79_0;
                                              break L17;
                                            }
                                          }
                                          var3 = tb.a(stackIn_82_0 != 0, -2);
                                          kn.a(var3, (byte) -51);
                                          if (var4 == 0) {
                                            break L3;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      hn.a((byte) -125);
                                      if (var4 == 0) {
                                        break L3;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  jn.a((byte) -105);
                                  if (var4 == 0) {
                                    break L3;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              em.d((byte) -67);
                              if (var4 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            }
                          }
                          fn.a(0);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      dk.a(22288);
                      break L3;
                    }
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  break L2;
                }
              }
            }
            di.a((Throwable) null, 1, "MGS2: " + hj.a((byte) 57));
            si.a(-74);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var2, "ob.F(" + param0 + ')');
        }
    }

    private final static int a(byte param0, pf param1, pf param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 112) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            stackOut_3_0 = j.a(0, -45, false, 0, param1, (String) null, param2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ob.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_4_0;
    }

    final int c(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                ((ob) this).field_r = -75;
                break L1;
              }
            }
            stackOut_3_0 = this.a(true, true, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var3, "ob.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    protected ob() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = "Breathe toxic gas as if it were air; the essential purchase for any effluvium miner. Without this, you'll start to choke in seconds.";
        field_n = new String[][]{null, new String[1]};
    }
}
