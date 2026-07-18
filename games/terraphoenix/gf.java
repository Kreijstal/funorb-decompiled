/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf extends eh {
    private boolean field_r;
    private int field_A;
    private long field_t;
    private int field_o;
    private int field_x;
    private int field_B;
    private boolean field_s;
    static kf field_u;
    private boolean field_q;
    static ci field_p;
    private int field_v;
    String field_w;
    static int field_C;
    private int field_z;
    static nd field_y;

    private final static boolean a(byte param0, fa param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = -1;
            stackOut_0_0 = param1.b((byte) -128);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("gf.VC(").append(103).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void l(int param0) {
        tg.field_c[1] = true;
        if (param0 != 10001) {
            ((gf) this).field_r = false;
        }
    }

    private final void c() {
        tg.field_c[5] = true;
    }

    public static void g(int param0) {
        field_u = null;
        field_p = null;
        field_y = null;
    }

    private final void g() {
        int var2 = mk.field_j.a(-16384);
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        int var4 = qh.field_d + -1;
        byte[] var5 = new byte[var4];
        mk.field_j.b(0, var5, var4, 0);
        int discarded$0 = 0;
        m.a(dg.a(false), var3 != 0, ll.a(0, var5));
    }

    final int h(byte param0) {
        int var2 = 0;
        L0: {
          int discarded$14 = 78;
          var2 = this.d();
          if (param0 == -13) {
            break L0;
          } else {
            ((gf) this).field_o = 117;
            break L0;
          }
        }
        L1: {
          L2: {
            if (var2 == 0) {
              break L2;
            } else {
              if (1 == var2) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (!tg.field_c[1]) {
              break L3;
            } else {
              int discarded$15 = 2;
              int discarded$16 = 48;
              ah.a();
              break L3;
            }
          }
          L4: {
            if (tg.field_c[2]) {
              o.b(3, (byte) -74);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!tg.field_c[3]) {
              break L5;
            } else {
              uf.a(20840, 4);
              break L5;
            }
          }
          L6: {
            if (!tg.field_c[4]) {
              break L6;
            } else {
              int discarded$17 = -31890;
              int discarded$18 = 5;
              jh.b();
              break L6;
            }
          }
          L7: {
            if (tg.field_c[5]) {
              jd.a(false, 6);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (tg.field_c[6]) {
              int discarded$19 = 7;
              int discarded$20 = -336;
              sa.a();
              break L8;
            } else {
              break L8;
            }
          }
          if (tg.field_c[8]) {
            ak.b(param0 ^ -105);
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
    }

    private final int d() {
        int var2 = 0;
        if (((gf) this).field_i) {
          return -1;
        } else {
          if (qf.a((byte) 65)) {
            if (q.field_Gb) {
              return -1;
            } else {
              int discarded$8 = 0;
              int discarded$9 = -47;
              var2 = wj.a(true, 29398, le.a(), pb.a(), ((gf) this).field_o, ((gf) this).field_r);
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (1 != var2) {
                      L1: {
                        if (rf.field_r) {
                          break L1;
                        } else {
                          ((gf) this).a("reconnect", true);
                          break L1;
                        }
                      }
                      gl.c((byte) 120);
                      int discarded$10 = 0;
                      k.a(var2, bh.field_d);
                      q.field_Gb = true;
                      ah.field_z = 15000L + ll.a(1000);
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (q.field_Jb != 11) {
                    break L2;
                  } else {
                    if (jj.field_f != 0) {
                      break L2;
                    } else {
                      int discarded$11 = 95;
                      kj.a();
                      break L2;
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

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((gf) this).setBackground(java.awt.Color.black);
        ph.field_o = ((gf) this).field_z;
        a.a(ph.field_o, param1 + -4993);
        ji.a(((gf) this).field_A, ((gf) this).field_s, ((gf) this).field_v, param5, param1 + -4915, ((gf) this).field_w, ((gf) this).field_t, nj.field_l, 5000, param1, ((gf) this).field_x, param6, ph.field_o, ((gf) this).field_B);
        pe.a(((gf) this).field_B, ((gf) this).field_w, param6, ((gf) this).field_A, ((gf) this).field_v, ph.field_o, 128, nj.field_l, ((gf) this).field_x);
        wd.a(false);
        int discarded$0 = -3109;
        lk.field_d = ad.c();
        am.a((byte) 29, ae.field_G);
        f.field_g = param7;
        fg.field_b = param4;
        wc.field_s = param2;
        ld.field_d = param3;
        ik.field_b = param0;
        int discarded$1 = -95;
        this.f();
        int discarded$2 = 93;
        bk.b();
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            dh var7 = null;
            String var8 = null;
            int var9 = 0;
            Boolean var10 = null;
            Throwable decompiledCaughtException = null;
            var9 = Terraphoenix.field_V;
            int discarded$18 = 81;
            var4 = a.a(param0, vj.field_P, ph.field_o);
            if (0 != var4) {
              L0: {
                if (var4 == 1) {
                  L1: {
                    int discarded$19 = -32218;
                    var5 = fg.a(fm.a(), 41, qh.a(true));
                    if (var5 != -1) {
                      fl.a(bh.field_d, false, te.field_a, var5);
                      te.field_a = null;
                      bh.field_d = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$20 = 92;
                  var10 = rd.b();
                  if (var10 != null) {
                    af.a(true, var10.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 == 2) {
                  int discarded$21 = 0;
                  int discarded$22 = -27737;
                  int discarded$23 = 3;
                  int discarded$24 = -47;
                  var5 = gi.a(((gf) this).field_o, le.a(), cm.a(-125), 3, ab.b(), vl.b(), pb.a());
                  if (var5 != -1) {
                    int discarded$25 = -14;
                    bi.a(var5, bh.field_d, te.field_a);
                    te.field_a = null;
                    bh.field_d = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 != var4) {
                  break L3;
                } else {
                  L4: {
                    if (jj.field_f == -1) {
                      break L4;
                    } else {
                      if (jj.field_f != 0) {
                        jj.field_f = -1;
                        bb.b(3287);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param1) {
                    q.field_Gb = false;
                    break L3;
                  } else {
                    int discarded$26 = 0;
                    int discarded$27 = -47;
                    var5 = wj.a(false, 29398, le.a(), pb.a(), ((gf) this).field_o, ((gf) this).field_r);
                    if (var5 != -1) {
                      if (0 == var5) {
                        pf.field_c = oj.field_y;
                        int discarded$28 = 95;
                        kj.a();
                        ei.field_R = false;
                        q.field_Jb = 10;
                        break L3;
                      } else {
                        int discarded$29 = 0;
                        k.a(var5, bh.field_d);
                        bh.field_d = null;
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
                  if (jm.field_c) {
                    int discarded$30 = 1;
                    rk.a(dg.a(false));
                    break L5;
                  } else {
                    q.field_Jb = 10;
                    ei.field_R = true;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 == 5) {
                  int discarded$31 = 100;
                  fc.a(dg.a(false));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var5 = -92 / ((1 - param2) / 40);
                if (var4 == 6) {
                  if (!wd.field_b) {
                    break L7;
                  } else {
                    q.field_Jb = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (7 != var4) {
                  break L8;
                } else {
                  be.a(dg.a(false), -65);
                  break L8;
                }
              }
              L9: {
                if (8 == var4) {
                  int discarded$32 = 1;
                  rk.a(dg.a(false));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  dl.a(23943, dg.a(false));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  di.field_l.k(-17410, 17);
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  dl.a(dg.a(false), -6242);
                  break L12;
                }
              }
              L13: {
                if (var4 != 12) {
                  break L13;
                } else {
                  nl.a((byte) 122, ej.f((byte) -30), dg.a(false));
                  break L13;
                }
              }
              L14: {
                if (var4 == 13) {
                  try {
                    L15: {
                      L16: {
                        if (fm.field_b == null) {
                          fm.field_b = new bh(nj.field_l, new java.net.URL(((gf) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (fm.field_b.a((byte) 116)) {
                          L18: {
                            var7 = fm.field_b.a(-76);
                            if (var7 == null) {
                              int discarded$33 = 3;
                              si.a((String) null);
                              break L18;
                            } else {
                              var8 = tc.a((byte) -114, var7.field_i, var7.field_k, 0);
                              int discarded$34 = 3;
                              si.a(var8);
                              break L18;
                            }
                          }
                          fm.field_b = null;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      bd.a((Throwable) (Object) var6, "S1", 82);
                      int discarded$35 = 3;
                      si.a((String) null);
                      fm.field_b = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (15 != var4) {
                  break L20;
                } else {
                  q.field_Jb = 10;
                  break L20;
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

    final void a(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_134_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          if (null == ab.field_b) {
            break L0;
          } else {
            L1: {
              if (a.field_b == null) {
                int discarded$27 = 113;
                var6 = ck.b();
                var4 = var6.getSize();
                ab.field_b.a((byte) 63, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            ab.field_b.a((byte) 92);
            break L0;
          }
        }
        L2: {
          int discarded$28 = 1;
          tc.b();
          int discarded$29 = 43;
          fc.b();
          if (c.b(-107)) {
            break L2;
          } else {
            if (q.field_Jb != 11) {
              vk.a(-8177);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (lk.field_d == null) {
            break L3;
          } else {
            vj.field_P = lk.field_d.a(125);
            break L3;
          }
        }
        L4: {
          if (!ra.c((byte) 66)) {
            break L4;
          } else {
            L5: {
              int discarded$30 = -127;
              var3 = 1200 * uc.j();
              if (((gf) this).field_q) {
                break L5;
              } else {
                int discarded$31 = -5;
                if (~var3 <= ~ch.a()) {
                  break L4;
                } else {
                  if (var3 < wj.a(-127)) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((gf) this).field_q = false;
            gb.g(-17464);
            gl.c((byte) 127);
            int discarded$32 = 0;
            k.a(2, ae.field_F);
            int discarded$33 = -107;
            ke.a();
            q.field_Gb = true;
            ah.field_z = ll.a(1000) + 15000L;
            break L4;
          }
        }
        L6: {
          L7: {
            if (jj.field_f == -1) {
              break L7;
            } else {
              if (jj.field_f == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (jj.field_f != -1) {
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
            int discarded$34 = 0;
            jj.field_f = wc.c();
            if (var3 == 0) {
              break L9;
            } else {
              if (jj.field_f != 0) {
                break L9;
              } else {
                if (q.field_Jb != 11) {
                  break L9;
                } else {
                  if (!qf.a((byte) 64)) {
                    int discarded$35 = 95;
                    kj.a();
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == jj.field_f) {
            break L6;
          } else {
            if (jj.field_f == 0) {
              break L6;
            } else {
              ah.field_z = 15000L + ll.a(1000);
              break L6;
            }
          }
        }
        L10: {
          if (-1 == jj.field_f) {
            break L10;
          } else {
            if (jj.field_f == 0) {
              break L10;
            } else {
              if (uh.field_H >= 10) {
                if (10 <= q.field_Jb) {
                  L11: {
                    gl.c((byte) 118);
                    if (jj.field_f != 3) {
                      if (jj.field_f != 4) {
                        if (jj.field_f != 2) {
                          if (jj.field_f == 5) {
                            int discarded$36 = 0;
                            k.a(5, sh.field_x);
                            break L11;
                          } else {
                            int discarded$37 = 0;
                            k.a(256, ak.field_f);
                            break L11;
                          }
                        } else {
                          int discarded$38 = 0;
                          k.a(256, j.field_P);
                          break L11;
                        }
                      } else {
                        int discarded$39 = 0;
                        k.a(256, lb.field_a);
                        break L11;
                      }
                    } else {
                      int discarded$40 = 0;
                      k.a(256, tj.field_ub);
                      break L11;
                    }
                  }
                  q.field_Gb = true;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if (jj.field_f != 3) {
                  if (jj.field_f == 4) {
                    ((gf) this).a("js5io", true);
                    break L10;
                  } else {
                    if (jj.field_f != 2) {
                      if (jj.field_f == 5) {
                        ((gf) this).a("outofdate", true);
                        break L10;
                      } else {
                        ((gf) this).a("js5connect", true);
                        break L10;
                      }
                    } else {
                      ((gf) this).a("js5connect_full", true);
                      break L10;
                    }
                  }
                } else {
                  ((gf) this).a("js5crc", true);
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (jj.field_f == -1) {
                break L14;
              } else {
                if (jj.field_f != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!qf.a((byte) 91)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (ah.field_z <= ll.a(1000)) {
            q.field_Gb = false;
            if (-1 == jj.field_f) {
              break L12;
            } else {
              if (jj.field_f != 0) {
                jj.field_f = -1;
                bb.b(3287);
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
          if (0 != jj.field_f) {
            break L15;
          } else {
            if (!qf.a((byte) 106)) {
              da.field_f = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (0 == uh.field_H) {
            if (vb.a(-353)) {
              uh.field_H = 1;
              break L16;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (uh.field_H == 1) {
            L18: {
              if (0 != ph.field_o) {
                bl.field_a = va.a(wc.field_s, -120);
                break L18;
              } else {
                break L18;
              }
            }
            int discarded$41 = 1;
            int discarded$42 = 62;
            bi.field_d = vj.a(false, true, ld.field_d);
            int discarded$43 = 1;
            int discarded$44 = 62;
            ph.field_q = vj.a(false, true, ik.field_b);
            int discarded$45 = 1;
            int discarded$46 = 62;
            ch.field_g = vj.a(false, true, f.field_g);
            uh.field_H = 2;
            di.field_i = ph.field_q;
            ke.field_d = bi.field_d;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (uh.field_H == 2) {
            L20: {
              if (null == bl.field_a) {
                break L20;
              } else {
                if (!bl.field_a.a(0)) {
                  break L20;
                } else {
                  if (!bl.field_a.d(-1, "")) {
                    bl.field_a = null;
                    break L20;
                  } else {
                    if (bl.field_a.a(-3, "")) {
                      ij.a(3, bl.field_a);
                      bl.field_a = null;
                      int discarded$47 = 47;
                      ea.a();
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
            }
            if (bl.field_a == null) {
              uh.field_H = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (uh.field_H != 3) {
            break L21;
          } else {
            if (!nh.a(ph.field_q, ch.field_g, false, bi.field_d)) {
              break L21;
            } else {
              if (!gf.a((byte) 103, ch.field_g)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    int discarded$48 = -119;
                    jj.e();
                    hj.g(-7958);
                    ad.field_e = hh.field_k;
                    wd.field_b = false;
                    int discarded$49 = -22;
                    am.a(ch.field_g, jm.field_c, ph.field_q, bi.field_d);
                    if (ea.field_j) {
                      break L23;
                    } else {
                      if (i.field_d != null) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    if (ea.field_j) {
                      stackOut_102_0 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      break L24;
                    } else {
                      stackOut_101_0 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_103_0 = stackIn_103_0;
                    stackOut_103_1 = 68;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    if (ea.field_j) {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = 0;
                      stackIn_106_0 = stackOut_105_0;
                      stackIn_106_1 = stackOut_105_1;
                      stackIn_106_2 = stackOut_105_2;
                      break L25;
                    } else {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = 1;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_106_1 = stackOut_104_1;
                      stackIn_106_2 = stackOut_104_2;
                      break L25;
                    }
                  }
                  sj.a(stackIn_106_0 != 0, (byte) stackIn_106_1, stackIn_106_2 != 0, i.field_d);
                  break L22;
                }
                L26: {
                  if (od.field_a) {
                    bm.a(-128);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (kj.field_b != null) {
                    break L27;
                  } else {
                    kj.field_b = di.f(-25177);
                    int discarded$50 = -110;
                    sa.field_d = qa.a();
                    break L27;
                  }
                }
                bb.a(ch.field_g, -94, sa.field_d, kj.field_b);
                ch.field_g = null;
                bi.field_d = null;
                ph.field_q = null;
                uh.a(-31312, (java.applet.Applet) this);
                int discarded$51 = 47;
                ea.a();
                uh.field_H = 10;
                break L21;
              }
            }
          }
        }
        L28: {
          if (10 != uh.field_H) {
            break L28;
          } else {
            L29: {
              if (ph.field_o != 0) {
                bi.field_b = va.a(fg.field_b, -117);
                break L29;
              } else {
                break L29;
              }
            }
            uh.field_H = 11;
            break L28;
          }
        }
        L30: {
          if (uh.field_H != 11) {
            break L30;
          } else {
            L31: {
              if (bi.field_b == null) {
                break L31;
              } else {
                L32: {
                  if (!bi.field_b.a(0)) {
                    break L32;
                  } else {
                    if (!bi.field_b.b((byte) -128)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                int discarded$52 = 123;
                vh.a(qc.a(qb.field_e, bi.field_b, si.field_hb), (byte) 66, 0.0f);
                break L30;
              }
            }
            rh.field_d = true;
            uh.field_H = 12;
            break L30;
          }
        }
        L33: {
          if (uh.field_H == 12) {
            if (rh.field_d) {
              break L33;
            } else {
              uh.field_H = 13;
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (13 != uh.field_H) {
            break L34;
          } else {
            L35: {
              var3 = 1;
              if (null == ph.field_v) {
                break L35;
              } else {
                L36: {
                  if (!ph.field_v.a(0)) {
                    stackOut_133_0 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    break L36;
                  } else {
                    stackOut_132_0 = 1;
                    stackIn_134_0 = stackOut_132_0;
                    break L36;
                  }
                }
                var3 = stackIn_134_0;
                vh.a(ph.field_v.field_e, (byte) -128, ph.field_v.field_c);
                break L35;
              }
            }
            if (var3 == 0) {
              break L34;
            } else {
              uh.field_H = 20;
              break L34;
            }
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (!ai.field_h) {
              break L37;
            } else {
              hk.a(ae.field_G, (byte) 112);
              ((gf) this).d(0);
              am.a((byte) -128, ae.field_G);
              break L37;
            }
          }
        }
        L38: {
          var3 = -108 / ((-17 - param0) / 32);
          if (tg.field_c[8]) {
            int discarded$53 = 81;
            dg.a();
            break L38;
          } else {
            break L38;
          }
        }
    }

    private final void j() {
        tg.field_c[2] = true;
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4) {
        int discarded$0 = 0;
        int discarded$1 = -119;
        this.a();
        if (!(!param0)) {
            this.l(10001);
        }
        if (param3) {
            int discarded$2 = 8560;
            this.j();
        }
        if (param1) {
            int discarded$3 = 1;
            this.i();
        }
        if (param4) {
            int discarded$4 = -113;
            this.c();
        }
        if (param2 != 13) {
            ((gf) this).a(true, true, 1, true, true);
        }
    }

    final int a(boolean param0, byte param1) {
        if (param1 != -50) {
            this.l(-92);
        }
        return this.a(param0, true, 100);
    }

    final void h(int param0) {
        int var2 = 0;
        int var3 = 0;
        dc var4 = null;
        int var5 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var5 = Terraphoenix.field_V;
          var2 = qk.field_b;
          var3 = -35 / ((param0 - -34) / 35);
          if (var2 >= 64) {
            break L0;
          } else {
            if (!tg.field_c[var2]) {
              break L0;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if (1 == var2) {
                    int discarded$11 = -127;
                    jb.a();
                    break L1;
                  } else {
                    if (2 != var2) {
                      if (var2 == 3) {
                        te.a((byte) 67);
                        break L1;
                      } else {
                        if (4 != var2) {
                          if (var2 != 5) {
                            if (var2 != 6) {
                              if (var2 == 7) {
                                int discarded$12 = -109;
                                this.e();
                                break L1;
                              } else {
                                if (var2 != 8) {
                                  if (16 != var2) {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (var2 != 13) {
                                            if (var2 != 17) {
                                              if (18 == var2) {
                                                bh.b(-80);
                                                break L1;
                                              } else {
                                                int discarded$13 = -15465;
                                                bd.a((Throwable) null, "MGS1: " + r.i(), -87);
                                                gb.g(-17464);
                                                break L1;
                                              }
                                            } else {
                                              int discarded$14 = -118;
                                              this.g();
                                              break L1;
                                            }
                                          } else {
                                            int discarded$15 = 127;
                                            ee.a();
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      if (12 != var2) {
                                        stackOut_31_0 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        break L3;
                                      } else {
                                        stackOut_30_0 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        break L3;
                                      }
                                    }
                                    int discarded$16 = 0;
                                    var4 = bm.a(stackIn_32_0 != 0);
                                    int discarded$17 = -97;
                                    od.a(var4);
                                    break L1;
                                  } else {
                                    Terraphoenix.q(320);
                                    break L1;
                                  }
                                } else {
                                  sd.a((byte) 43, nj.field_l, (dh) (Object) mk.field_j, qh.field_d);
                                  break L1;
                                }
                              }
                            } else {
                              int discarded$18 = 0;
                              qb.b();
                              break L1;
                            }
                          } else {
                            uk.a(true);
                            break L1;
                          }
                        } else {
                          int discarded$19 = 127;
                          rj.a();
                          break L1;
                        }
                      }
                    } else {
                      int discarded$20 = 127;
                      gi.d();
                      break L1;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        int discarded$21 = -15465;
        bd.a((Throwable) null, "MGS2: " + r.i(), -109);
        gb.g(-17464);
    }

    private final void a() {
        tg.field_c[7] = true;
        tg.field_c[18] = true;
        tg.field_c[0] = true;
        tg.field_c[3] = true;
        tg.field_c[16] = true;
        tg.field_c[8] = false;
        tg.field_c[17] = true;
    }

    private final void a(int param0, int param1, int param2, String param3) {
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          try {
            L0: {
              if (((gf) this).b(true)) {
                L1: {
                  L2: {
                    ((gf) this).field_w = ((gf) this).getCodeBase().getHost();
                    var6_ref2 = ((gf) this).field_w.toLowerCase();
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
                  ((gf) this).field_r = stackIn_7_1 != 0;
                  ((gf) this).field_v = Integer.parseInt(((gf) this).getParameter("gameport1"));
                  ((gf) this).field_A = Integer.parseInt(((gf) this).getParameter("gameport2"));
                  var7 = ((gf) this).getParameter("servernum");
                  if (var7 != null) {
                    ((gf) this).field_x = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((gf) this).field_B = Integer.parseInt(((gf) this).getParameter("gamecrc"));
                  ((gf) this).field_t = Long.parseLong(((gf) this).getParameter("instanceid"));
                  ((gf) this).field_s = ((gf) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((gf) this).getParameter("lang");
                  if (var8 != null) {
                    ((gf) this).field_z = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((gf) this).field_z >= 5) {
                    ((gf) this).field_z = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var9 = ((gf) this).getParameter("affid");
                  if (var9 != null) {
                    ((gf) this).field_o = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                od.field_a = Boolean.valueOf(((gf) this).getParameter("simplemode")).booleanValue();
                ((gf) this).a(param2, 50, 32, ((gf) this).field_B, 640, param3, 480);
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
              bd.a((Throwable) (Object) var6, (String) null, 99);
              ((gf) this).a("crash", true);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6_ref;
            stackOut_24_1 = new StringBuilder().append("gf.QC(").append(-45).append(',').append(480).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L8;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ',' + 640 + ')');
        }
    }

    final void a(int param0, String param1, int param2) {
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
              int discarded$2 = 640;
              this.a(-45, 480, param2, param1);
              if (param0 <= -61) {
                break L1;
              } else {
                ((gf) this).field_w = null;
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
            stackOut_3_1 = new StringBuilder().append("gf.WC(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void f() {
        dk.field_j[9] = -1;
        dk.field_j[2] = -2;
        dk.field_j[6] = -2;
        dk.field_j[11] = -1;
        dk.field_j[10] = -1;
        dk.field_j[7] = -1;
        dk.field_j[1] = 16;
        dk.field_j[3] = -1;
        dk.field_j[4] = -1;
        dk.field_j[5] = -1;
        dk.field_j[17] = -1;
        dk.field_j[16] = -1;
        dk.field_j[13] = -1;
        dk.field_j[8] = -2;
        dk.field_j[18] = 1;
        dk.field_j[12] = -1;
    }

    private final void i() {
        tg.field_c[4] = true;
    }

    private final void e() {
        String var2 = ab.c(-14700);
        int discarded$0 = -1;
        lb.a(var2, dg.a(false));
    }

    final void k(int param0) {
        int var3 = Terraphoenix.field_V;
        if (param0 != -20858) {
            return;
        }
        if (wf.a(31996)) {
            int discarded$1 = this.a(null != a.field_b ? true : false, false, -65);
        } else {
            if (10 <= uh.field_H) {
                if (!sl.a((byte) -126)) {
                    dh.g(97);
                } else {
                    if (q.field_Jb == 0) {
                        int discarded$3 = this.a(false, false, -91);
                    } else {
                        uc.l(3795, vj.field_P);
                    }
                }
            }
        }
    }

    protected gf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new kf("usename");
    }
}
