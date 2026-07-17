/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

abstract class ag extends th {
    String field_u;
    private int field_v;
    private int field_w;
    static String field_k;
    private long field_l;
    private int field_n;
    private int field_q;
    private int field_p;
    private boolean field_r;
    private boolean field_s;
    private boolean field_t;
    private int field_x;
    static o field_m;
    static int field_o;

    final int h(byte param0) {
        int var2 = 0;
        int discarded$6 = 125;
        var2 = this.m();
        if (param0 != 58) {
          return -33;
        } else {
          L0: {
            L1: {
              if (var2 == 0) {
                break L1;
              } else {
                if (var2 == 1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              if (el.field_D[1]) {
                ti.a(57, 2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!el.field_D[2]) {
                break L3;
              } else {
                ce.a(3, param0 + -106);
                break L3;
              }
            }
            L4: {
              if (!el.field_D[3]) {
                break L4;
              } else {
                gh.a((byte) -89, 4);
                break L4;
              }
            }
            L5: {
              if (el.field_D[4]) {
                int discarded$7 = 8100;
                int discarded$8 = 5;
                fh.a();
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (el.field_D[5]) {
                int discarded$9 = -66;
                int discarded$10 = 6;
                nd.b();
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (el.field_D[6]) {
                kh.a(param0 ^ -1101, 7);
                break L7;
              } else {
                break L7;
              }
            }
            if (el.field_D[8]) {
              int discarded$11 = 38;
              sd.a();
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            if (param1 <= se.field_p.field_g) {
              return true;
            } else {
              if (m.field_b != null) {
                try {
                  L0: {
                    L1: {
                      var2_int = m.field_b.c(118);
                      if (param0 > 122) {
                        break L1;
                      } else {
                        field_o = 68;
                        break L1;
                      }
                    }
                    if (var2_int <= 0) {
                      L2: {
                        if (var2_int < 0) {
                          break L2;
                        } else {
                          int discarded$5 = -71;
                          if (kg.b() <= 30000L) {
                            decompiledRegionSelector0 = 0;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      int discarded$6 = 27;
                      ec.a();
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L3: {
                        if (var2_int > -se.field_p.field_g + param1) {
                          var2_int = -se.field_p.field_g + param1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      m.field_b.a(se.field_p.field_g, 32498, var2_int, se.field_p.field_f);
                      ik.field_p = dd.b(115);
                      se.field_p.field_g = se.field_p.field_g + var2_int;
                      if (param1 > se.field_p.field_g) {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0 != 0;
                      } else {
                        se.field_p.field_g = 0;
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0 != 0;
                      }
                    }
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    int discarded$7 = 27;
                    ec.a();
                    decompiledRegionSelector0 = 1;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  return false;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void j() {
        field_k = null;
        field_m = null;
    }

    private final void g(int param0) {
        s.field_k[5] = -1;
        s.field_k[10] = -1;
        s.field_k[1] = 16;
        s.field_k[8] = -2;
        s.field_k[9] = -1;
        s.field_k[6] = -2;
        s.field_k[11] = -1;
        s.field_k[12] = -1;
        s.field_k[18] = 1;
        s.field_k[16] = -1;
        s.field_k[3] = -1;
        s.field_k[13] = -1;
        s.field_k[7] = -1;
        if (param0 >= -14) {
          return;
        } else {
          s.field_k[2] = -2;
          s.field_k[17] = -1;
          s.field_k[4] = -1;
          return;
        }
    }

    final static void a(boolean param0, String param1, int param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            RuntimeException var4_ref = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            try {
              L0: {
                L1: {
                  if (!ka.field_r.startsWith("win")) {
                    break L1;
                  } else {
                    int discarded$6 = -54;
                    if (!sj.a(param1)) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                {
                  L2: {
                    param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                    break L2;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var4_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var4_ref;
                stackOut_7_1 = new StringBuilder().append("ag.FB(").append(param0).append(44);
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param1 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L4;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L4;
                }
              }
              L5: {
                stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
                stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(64).append(44);
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param3 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L5;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L5;
                }
              }
              throw sd.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g() {
        int var2 = -12;
        String var3 = rf.c(1);
        hi.a(0, var3, ll.b(110));
    }

    private final static boolean h() {
        return bl.field_b.a(-6);
    }

    final void a(boolean param0) {
        int var2 = 0;
        fb var3 = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        L0: {
          var4 = StarCannon.field_A;
          var2 = vh.field_t;
          if (64 <= var2) {
            break L0;
          } else {
            if (!el.field_D[var2]) {
              break L0;
            } else {
              if (param0) {
                if (var2 == 0) {
                  return;
                } else {
                  L1: {
                    if (var2 == 1) {
                      int discarded$11 = -57;
                      ef.b();
                      break L1;
                    } else {
                      if (var2 != 2) {
                        if (var2 == 3) {
                          vk.f(-96);
                          break L1;
                        } else {
                          if (var2 == 4) {
                            int discarded$12 = -101;
                            wa.b();
                            break L1;
                          } else {
                            if (var2 == 5) {
                              int discarded$13 = -107;
                              ea.b();
                              break L1;
                            } else {
                              if (var2 == 6) {
                                cb.a((byte) -104);
                                break L1;
                              } else {
                                if (var2 != 7) {
                                  if (8 != var2) {
                                    if (var2 == 16) {
                                      int discarded$14 = 12000;
                                      ri.b();
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
                                              int discarded$15 = 78;
                                              vk.f();
                                              break L1;
                                            } else {
                                              if (17 == var2) {
                                                int discarded$16 = 74;
                                                this.i();
                                                break L1;
                                              } else {
                                                if (var2 != 18) {
                                                  hc.a((Throwable) null, "MGS1: " + oe.a(46), (byte) 108);
                                                  int discarded$17 = 27;
                                                  ec.a();
                                                  break L1;
                                                } else {
                                                  int discarded$18 = 0;
                                                  ca.f();
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        stackOut_28_0 = 13607;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_29_0 = stackOut_28_0;
                                        if (var2 != 12) {
                                          stackOut_30_0 = stackIn_30_0;
                                          stackOut_30_1 = 0;
                                          stackIn_31_0 = stackOut_30_0;
                                          stackIn_31_1 = stackOut_30_1;
                                          break L3;
                                        } else {
                                          stackOut_29_0 = stackIn_29_0;
                                          stackOut_29_1 = 1;
                                          stackIn_31_0 = stackOut_29_0;
                                          stackIn_31_1 = stackOut_29_1;
                                          break L3;
                                        }
                                      }
                                      var3 = pb.a(stackIn_31_0, stackIn_31_1 != 0);
                                      qc.a(var3, (byte) -89);
                                      break L1;
                                    }
                                  } else {
                                    int discarded$19 = 0;
                                    wk.a(il.field_g, (rb) (Object) se.field_p, nb.field_e);
                                    break L1;
                                  }
                                } else {
                                  int discarded$20 = -47;
                                  this.g();
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        ak.a(70);
                        break L1;
                      }
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
        hc.a((Throwable) null, "MGS2: " + oe.a(-62), (byte) 84);
        int discarded$21 = 27;
        ec.a();
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        String stackIn_103_0 = null;
        String stackIn_104_0 = null;
        String stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        String stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        String stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        String stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
        int stackIn_108_3 = 0;
        int stackIn_138_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_102_0 = null;
        String stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        String stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        String stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        String stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        String stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        L0: {
          var5 = StarCannon.field_A;
          if (null == kd.field_B) {
            break L0;
          } else {
            L1: {
              if (null != n.field_a) {
                break L1;
              } else {
                int discarded$25 = 120;
                var6 = wi.a();
                var4 = var6.getSize();
                kd.field_B.a(118, var4.width, var4.height);
                break L1;
              }
            }
            kd.field_B.b((byte) 44);
            break L0;
          }
        }
        L2: {
          int discarded$26 = 119;
          bi.a();
          gf.a(true);
          if (le.c(param1 + 5)) {
            break L2;
          } else {
            if (bl.field_a != 11) {
              int discarded$27 = -100;
              ce.a();
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (qj.field_eb != null) {
            lh.field_I = qj.field_eb.a((byte) -107);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          int discarded$28 = 57;
          if (!fc.a()) {
            break L4;
          } else {
            L5: {
              var3 = 1200 * wc.a(-75);
              if (((ag) this).field_t) {
                break L5;
              } else {
                int discarded$29 = -33;
                if (~var3 <= ~ck.b()) {
                  break L4;
                } else {
                  int discarded$30 = -79;
                  if (var3 >= oj.a()) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ag) this).field_t = false;
            int discarded$31 = 27;
            ec.a();
            ob.a(-121);
            int discarded$32 = -77;
            pd.a(sc.field_e, 2);
            jc.b(0);
            fi.field_h = true;
            wa.field_a = 15000L + dd.b(56);
            break L4;
          }
        }
        L6: {
          L7: {
            if (qb.field_j == -1) {
              break L7;
            } else {
              if (qb.field_j == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (qb.field_j != -1) {
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
            qb.field_j = bf.e(~param1);
            if (var3 == 0) {
              break L9;
            } else {
              if (qb.field_j == 0) {
                if (11 != bl.field_a) {
                  break L9;
                } else {
                  int discarded$33 = -91;
                  if (!se.b()) {
                    int discarded$34 = 14;
                    w.b();
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (-1 == qb.field_j) {
            break L6;
          } else {
            if (qb.field_j != 0) {
              wa.field_a = 15000L + dd.b(105);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (qb.field_j == param1) {
            break L10;
          } else {
            if (0 != qb.field_j) {
              if (rk.field_d < 10) {
                if (qb.field_j != 3) {
                  if (qb.field_j != 4) {
                    if (qb.field_j == 2) {
                      ((ag) this).a("js5connect_full", false);
                      break L10;
                    } else {
                      if (qb.field_j != 5) {
                        ((ag) this).a("js5connect", false);
                        break L10;
                      } else {
                        ((ag) this).a("outofdate", false);
                        break L10;
                      }
                    }
                  } else {
                    ((ag) this).a("js5io", false);
                    break L10;
                  }
                } else {
                  ((ag) this).a("js5crc", false);
                  break L10;
                }
              } else {
                if (bl.field_a >= 10) {
                  L11: {
                    ob.a(-107);
                    if (qb.field_j == 3) {
                      int discarded$35 = -77;
                      pd.a(ob.field_g, 256);
                      break L11;
                    } else {
                      if (4 == qb.field_j) {
                        int discarded$36 = -77;
                        pd.a(d.field_m, 256);
                        break L11;
                      } else {
                        if (qb.field_j == 2) {
                          int discarded$37 = -77;
                          pd.a(lj.field_d, 256);
                          break L11;
                        } else {
                          if (qb.field_j == 5) {
                            int discarded$38 = -77;
                            pd.a(mi.field_n, 5);
                            break L11;
                          } else {
                            int discarded$39 = -77;
                            pd.a(rh.field_g, 256);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  fi.field_h = true;
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
              if (qb.field_j == -1) {
                break L14;
              } else {
                if (qb.field_j != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            int discarded$40 = -91;
            if (!se.b()) {
              break L12;
            } else {
              break L13;
            }
          }
          if (dd.b(param1 ^ -59) >= wa.field_a) {
            fi.field_h = false;
            if (qb.field_j == -1) {
              break L12;
            } else {
              if (qb.field_j != 0) {
                qb.field_j = -1;
                int discarded$41 = -30294;
                lj.a();
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (0 != qb.field_j) {
            break L15;
          } else {
            int discarded$42 = -91;
            if (!se.b()) {
              kb.field_a = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (rk.field_d == 0) {
            int discarded$43 = -28050;
            if (!ag.h()) {
              break L16;
            } else {
              rk.field_d = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (rk.field_d != 1) {
            break L17;
          } else {
            L18: {
              if (vg.field_b == 0) {
                break L18;
              } else {
                kl.field_b = b.a(false, rf.field_c);
                break L18;
              }
            }
            bf.field_y = sb.a(1, true, false, r.field_a, (byte) 104);
            fk.field_k = sb.a(1, true, false, ob.field_j, (byte) 104);
            li.field_b = sb.a(1, true, false, p.field_c, (byte) 103);
            fi.field_f = bf.field_y;
            rk.field_d = 2;
            lf.field_eb = fk.field_k;
            break L17;
          }
        }
        L19: {
          if (rk.field_d == 2) {
            L20: {
              if (kl.field_b != null) {
                if (kl.field_b.b((byte) 95)) {
                  if (kl.field_b.a(-20955, "")) {
                    if (kl.field_b.a("", param1 ^ 9882)) {
                      eh.a((byte) 63, kl.field_b);
                      kl.field_b = null;
                      tc.j(32);
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    kl.field_b = null;
                    break L20;
                  }
                } else {
                  break L20;
                }
              } else {
                break L20;
              }
            }
            if (null == kl.field_b) {
              rk.field_d = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (rk.field_d != 3) {
            break L21;
          } else {
            if (!kb.a(li.field_b, fk.field_k, (byte) 107, bf.field_y)) {
              break L21;
            } else {
              int discarded$44 = -206;
              if (!pa.a(li.field_b)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    int discarded$45 = -64;
                    eg.b();
                    int discarded$46 = 109;
                    jg.e();
                    o.field_b = pa.field_J;
                    sh.field_t = false;
                    StarCannon.a(li.field_b, ah.field_i, -20169, bf.field_y, fk.field_k);
                    if (vj.field_X) {
                      break L23;
                    } else {
                      if (qb.field_g == null) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_102_0 = qb.field_g;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (vj.field_X) {
                      stackOut_104_0 = (String) (Object) stackIn_104_0;
                      stackOut_104_1 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      break L24;
                    } else {
                      stackOut_103_0 = (String) (Object) stackIn_103_0;
                      stackOut_103_1 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_105_0 = (String) (Object) stackIn_105_0;
                    stackOut_105_1 = stackIn_105_1;
                    stackOut_105_2 = 0;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    stackIn_107_2 = stackOut_105_2;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    stackIn_106_2 = stackOut_105_2;
                    if (vj.field_X) {
                      stackOut_107_0 = (String) (Object) stackIn_107_0;
                      stackOut_107_1 = stackIn_107_1;
                      stackOut_107_2 = stackIn_107_2;
                      stackOut_107_3 = 0;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      stackIn_108_2 = stackOut_107_2;
                      stackIn_108_3 = stackOut_107_3;
                      break L25;
                    } else {
                      stackOut_106_0 = (String) (Object) stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = stackIn_106_2;
                      stackOut_106_3 = 1;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      stackIn_108_2 = stackOut_106_2;
                      stackIn_108_3 = stackOut_106_3;
                      break L25;
                    }
                  }
                  ae.a(stackIn_108_0, stackIn_108_1 != 0, stackIn_108_2, stackIn_108_3 != 0);
                  break L22;
                }
                L26: {
                  if (!cc.field_l) {
                    break L26;
                  } else {
                    pk.a((byte) -64);
                    break L26;
                  }
                }
                L27: {
                  if (uh.field_l == null) {
                    uh.field_l = rd.d(param1 + -60);
                    j.field_e = ui.a(true);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                kg.a(uh.field_l, param1 + 1, j.field_e, li.field_b);
                bf.field_y = null;
                li.field_b = null;
                fk.field_k = null;
                rb.a((java.applet.Applet) this, 65);
                tc.j(param1 ^ -33);
                rk.field_d = 10;
                break L21;
              }
            }
          }
        }
        L28: {
          if (10 == rk.field_d) {
            L29: {
              if (vg.field_b != 0) {
                fb.field_g = b.a(false, a.field_d);
                break L29;
              } else {
                break L29;
              }
            }
            rk.field_d = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (rk.field_d != 11) {
            break L30;
          } else {
            L31: {
              if (null == fb.field_g) {
                break L31;
              } else {
                L32: {
                  if (!fb.field_g.b((byte) 101)) {
                    break L32;
                  } else {
                    if (!fb.field_g.a(param1 + 29742)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                int discarded$47 = -116;
                ma.a(lb.a(fb.field_g, b.field_e, lb.field_L), param1 ^ 13922, 0.0f);
                break L30;
              }
            }
            rk.field_d = 12;
            fa.field_E = true;
            break L30;
          }
        }
        L33: {
          if (rk.field_d != 12) {
            break L33;
          } else {
            if (!fa.field_E) {
              rk.field_d = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if (rk.field_d == 13) {
            L35: {
              var3 = 1;
              if (null == lb.field_t) {
                break L35;
              } else {
                L36: {
                  if (!lb.field_t.a((byte) 15)) {
                    stackOut_137_0 = 0;
                    stackIn_138_0 = stackOut_137_0;
                    break L36;
                  } else {
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L36;
                  }
                }
                var3 = stackIn_138_0;
                ma.a(lb.field_t.field_h, -13923, lb.field_t.field_i);
                break L35;
              }
            }
            if (var3 != 0) {
              rk.field_d = 20;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (!jj.field_E) {
              break L37;
            } else {
              int discarded$48 = 0;
              wf.a(kj.field_E);
              ((ag) this).e(-128);
              mf.a(true, kj.field_E);
              break L37;
            }
          }
        }
        L38: {
          if (el.field_D[8]) {
            int discarded$49 = 10;
            fb.a();
            break L38;
          } else {
            break L38;
          }
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 17) {
            ((ag) this).field_p = 0;
        }
        return this.a(param0 ^ 26, true, param1);
    }

    private final void e() {
        el.field_D[1] = true;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ag) this).setBackground(java.awt.Color.black);
        vg.field_b = ((ag) this).field_n;
        jh.a(vg.field_b, param4);
        le.a(((ag) this).field_u, vg.field_b, 5000, nb.field_e, param6, 22692, ((ag) this).field_l, ((ag) this).field_s, ((ag) this).field_w, ((ag) this).field_v, ((ag) this).field_p, 5000, param0, ((ag) this).field_q);
        hj.a(vg.field_b, ((ag) this).field_p, nb.field_e, ((ag) this).field_q, 78, ((ag) this).field_w, param0, ((ag) this).field_u, ((ag) this).field_v);
        ge.b(4039);
        int discarded$0 = 5220;
        qj.field_eb = wc.b();
        mf.a(true, kj.field_E);
        rf.field_c = param7;
        p.field_c = param1;
        a.field_d = param3;
        r.field_a = param2;
        ob.field_j = param5;
        this.g(-102);
        ng.k(126);
    }

    private final void j(int param0) {
        el.field_D[2] = true;
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            Object var8 = null;
            Boolean var9 = null;
            rb var10 = null;
            Throwable decompiledCaughtException = null;
            int discarded$15 = 121;
            var4 = fa.a(lh.field_I, param2, vg.field_b);
            if (0 != var4) {
              L0: {
                if (1 == var4) {
                  L1: {
                    int discarded$16 = -1006263007;
                    var5_int = ok.a((byte) -49, tg.d((byte) 10), ig.b());
                    if (var5_int != -1) {
                      ie.a(-111, uj.field_r, ph.field_nb, var5_int);
                      uj.field_r = null;
                      ph.field_nb = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$17 = 95;
                  var9 = kk.c();
                  if (var9 == null) {
                    break L0;
                  } else {
                    int discarded$18 = 122;
                    sb.a(var9.booleanValue());
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$19 = -18;
                  int discarded$20 = 29084;
                  int discarded$21 = -3;
                  var5_int = fi.a(kk.b((byte) 123), ((ag) this).field_x, ff.g(111), hc.a((byte) 96), dg.b(), we.a());
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    int discarded$22 = 70;
                    qa.a(var5_int, ph.field_nb, uj.field_r);
                    ph.field_nb = null;
                    uj.field_r = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 == 3) {
                  L4: {
                    if (qb.field_j == -1) {
                      break L4;
                    } else {
                      if (qb.field_j != 0) {
                        qb.field_j = -1;
                        int discarded$23 = -30294;
                        lj.a();
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param1) {
                    fi.field_h = false;
                    break L3;
                  } else {
                    var5_int = qc.a(hc.a((byte) 117), ((ag) this).field_r, ((ag) this).field_x, false, -1, ff.g(9));
                    if (var5_int != -1) {
                      if (var5_int != 0) {
                        int discarded$24 = -77;
                        pd.a(uj.field_r, var5_int);
                        uj.field_r = null;
                        break L3;
                      } else {
                        ne.field_j = cb.field_a;
                        int discarded$25 = 14;
                        w.b();
                        bl.field_a = 10;
                        ai.field_c = false;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (var4 != 4) {
                  break L5;
                } else {
                  if (ah.field_i) {
                    ij.a(18065, ll.b(105));
                    break L5;
                  } else {
                    ai.field_c = true;
                    bl.field_a = 10;
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 != 5) {
                  break L6;
                } else {
                  int discarded$26 = 337033697;
                  nh.a(ll.b(91));
                  break L6;
                }
              }
              L7: {
                if (6 == var4) {
                  if (sh.field_t) {
                    bl.field_a = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (7 == var4) {
                  int discarded$27 = 32;
                  vk.b(ll.b(param0 ^ 80));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  ij.a(18065, ll.b(104));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (9 == var4) {
                  pa.b(ll.b(99), param0 ^ -31162);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  d.field_b.d((byte) 73, 17);
                  break L11;
                }
              }
              L12: {
                if (param0 == var4) {
                  int discarded$28 = 0;
                  wj.a(ll.b(86));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (12 == var4) {
                  int discarded$29 = 114;
                  ef.a(uc.c(), ll.b(115), param0 + 91);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var4 != 13) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null != qa.field_b) {
                          break L16;
                        } else {
                          qa.field_b = new gg(nb.field_e, new java.net.URL(((ag) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!qa.field_b.c((byte) -127)) {
                          break L17;
                        } else {
                          L18: {
                            var10 = qa.field_b.a((byte) 60);
                            if (var10 != null) {
                              var7 = va.a(0, 107, var10.field_f, var10.field_g);
                              ci.a(var7, param0 + -11);
                              break L18;
                            } else {
                              var8 = null;
                              ci.a((String) null, 0);
                              break L18;
                            }
                          }
                          qa.field_b = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      hc.a((Throwable) (Object) var5, "S1", (byte) 111);
                      ci.a((String) null, param0 + -11);
                      qa.field_b = null;
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
                  bl.field_a = 10;
                  break L20;
                }
              }
              if (16 == var4) {
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

    final static void k(int param0) {
        kg.a((String) null, "", (byte) 92);
        if (param0 != -1108) {
            ag.k(-89);
        }
    }

    private final void i(int param0) {
        int var2 = 0;
        el.field_D[4] = true;
    }

    final void f(byte param0) {
        int var3 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        L0: {
          var3 = StarCannon.field_A;
          if (ai.a((byte) -21)) {
            L1: {
              stackOut_7_0 = this;
              stackOut_7_1 = 11;
              stackOut_7_2 = 0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (n.field_a == null) {
                stackOut_9_0 = this;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L1;
              }
            }
            int discarded$135 = this.a(stackIn_10_1, stackIn_10_2 != 0, stackIn_10_3 != 0);
            break L0;
          } else {
            if (rk.field_d < 10) {
              break L0;
            } else {
              if (!m.a(-35)) {
                uc.d(1);
                break L0;
              } else {
                if (bl.field_a != 0) {
                  int discarded$136 = 150;
                  ne.b(lh.field_I);
                  break L0;
                } else {
                  int discarded$137 = this.a(11, false, false);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (param0 <= -20) {
            break L2;
          } else {
            this.g(66);
            break L2;
          }
        }
    }

    private final void a() {
        el.field_D[16] = true;
        el.field_D[7] = true;
        el.field_D[18] = true;
        el.field_D[8] = false;
        el.field_D[17] = true;
        el.field_D[3] = true;
        el.field_D[0] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        L0: {
          int discarded$8 = 0;
          int discarded$9 = 0;
          this.a();
          if (!param0) {
            break L0;
          } else {
            int discarded$10 = -6;
            this.e();
            break L0;
          }
        }
        L1: {
          if (param3) {
            this.j(-1);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1) {
            this.i(-57);
            break L2;
          } else {
            break L2;
          }
        }
        if (param4 != -752) {
          return;
        } else {
          L3: {
            if (!param2) {
              break L3;
            } else {
              int discarded$11 = 98;
              this.l();
              break L3;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param0 != -15028) {
            return;
        }
        try {
            int discarded$0 = -25;
            int discarded$1 = 640;
            int discarded$2 = 480;
            this.a(param1, param2);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ag.IA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    private final int m() {
        int var2 = 0;
        int var3 = 0;
        if (((ag) this).field_b) {
          return -1;
        } else {
          int discarded$8 = -91;
          if (se.b()) {
            if (!fi.field_h) {
              var2 = qc.a(hc.a((byte) 108), ((ag) this).field_r, ((ag) this).field_x, true, -1, ff.g(114));
              if (var2 != -1) {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if (1 == var2) {
                      break L0;
                    } else {
                      L1: {
                        if (!hd.field_p) {
                          ((ag) this).a("reconnect", false);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ob.a(-88);
                      var3 = 77;
                      int discarded$9 = -77;
                      pd.a(uj.field_r, var2);
                      fi.field_h = true;
                      wa.field_a = dd.b(103) + 15000L;
                      return var2;
                    }
                  }
                }
                L2: {
                  if (bl.field_a != 11) {
                    break L2;
                  } else {
                    if (qb.field_j == 0) {
                      int discarded$10 = 14;
                      w.b();
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
    }

    private final void i() {
        int var2 = se.field_p.j(7909);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = il.field_g + -1;
        byte[] var5 = new byte[var4];
        se.field_p.b(var4, (byte) -54, var5, 0);
        ag.a(var3 != 0, uh.a(127, var5), 64, ll.b(126));
    }

    private final void a(int param0, String param1) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          try {
            L0: {
              if (((ag) this).d(57)) {
                L1: {
                  L2: {
                    ((ag) this).field_u = ((ag) this).getCodeBase().getHost();
                    var6_ref2 = ((ag) this).field_u.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((ag) this).field_r = stackIn_7_1 != 0;
                  ((ag) this).field_v = Integer.parseInt(((ag) this).getParameter("gameport1"));
                  ((ag) this).field_q = Integer.parseInt(((ag) this).getParameter("gameport2"));
                  var7 = ((ag) this).getParameter("servernum");
                  if (var7 != null) {
                    ((ag) this).field_p = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((ag) this).field_w = Integer.parseInt(((ag) this).getParameter("gamecrc"));
                  ((ag) this).field_l = Long.parseLong(((ag) this).getParameter("instanceid"));
                  ((ag) this).field_s = ((ag) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ag) this).getParameter("lang");
                  if (var8 != null) {
                    ((ag) this).field_n = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((ag) this).field_n < 5) {
                    break L5;
                  } else {
                    ((ag) this).field_n = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((ag) this).getParameter("affid");
                  if (var9 != null) {
                    ((ag) this).field_x = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                cc.field_l = Boolean.valueOf(((ag) this).getParameter("simplemode")).booleanValue();
                ((ag) this).a((byte) 126, param1, ((ag) this).field_w, 32, 480, 640, param0);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              hc.a((Throwable) (Object) var6, (String) null, (byte) 100);
              ((ag) this).a("crash", false);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("ag.PA(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + 480 + 44 + 640 + 44 + -25 + 41);
        }
    }

    protected ag() {
    }

    private final void l() {
        el.field_D[5] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_m = new o(1, 2, 2, 0);
    }
}
