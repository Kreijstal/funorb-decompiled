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
            var2_int = -25 % ((param0 - 30) / 34);
            stackOut_0_0 = param1.b((byte) -128);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("gf.VC(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    private final void l(int param0) {
        tg.field_c[1] = true;
        if (param0 != 10001) {
            this.field_r = false;
        }
    }

    private final void c(byte param0) {
        tg.field_c[5] = true;
        if (param0 != -113) {
            this.j(45);
        }
    }

    public static void g(int param0) {
        if (param0 >= -110) {
            field_y = (nd) null;
        }
        field_u = null;
        field_p = null;
        field_y = null;
    }

    private final void g(byte param0) {
        int var2 = mk.field_j.a(-16384);
        if (param0 != -118) {
            String var6 = (String) null;
            this.a(-109, -4, -25, (String) null, -60);
        }
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        int var4 = qh.field_d + -1;
        byte[] var5 = new byte[var4];
        mk.field_j.b(0, var5, var4, 0);
        m.a(dg.a(false), var3 != 0, ll.a(0, var5), param0 + 118);
    }

    final int h(byte param0) {
        int var2 = 0;
        L0: {
          var2 = this.d((byte) 78);
          if (param0 == -13) {
            break L0;
          } else {
            this.field_o = 117;
            break L0;
          }
        }
        L1: {
          L2: {
            if (-1 == (var2 ^ -1)) {
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
              ah.a(48, 2);
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
              jh.b(5, -31890);
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
              sa.a(-336, 7);
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

    private final int d(byte param0) {
        int var2 = 0;
        if (this.field_i) {
          return -1;
        } else {
          if (qf.a((byte) 65)) {
            if (q.field_Gb) {
              return -1;
            } else {
              var2 = wj.a(true, 29398, le.a(false), pb.a((byte) -47), this.field_o, this.field_r);
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
                          this.a("reconnect", true);
                          break L1;
                        }
                      }
                      L2: {
                        gl.c((byte) 120);
                        if (param0 == 78) {
                          break L2;
                        } else {
                          this.field_B = -50;
                          break L2;
                        }
                      }
                      k.a(var2, bh.field_d, false);
                      q.field_Gb = true;
                      ah.field_z = 15000L + ll.a(1000);
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L3: {
                  if ((q.field_Jb ^ -1) != -12) {
                    break L3;
                  } else {
                    if (-1 != (jj.field_f ^ -1)) {
                      break L3;
                    } else {
                      kj.a((byte) 95);
                      break L3;
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
        this.setBackground(java.awt.Color.black);
        ph.field_o = this.field_z;
        a.a(ph.field_o, param1 + -4993);
        ji.a(this.field_A, this.field_s, this.field_v, param5, param1 + -4915, this.field_w, this.field_t, nj.field_l, 5000, param1, this.field_x, param6, ph.field_o, this.field_B);
        pe.a(this.field_B, this.field_w, param6, this.field_A, this.field_v, ph.field_o, 128, nj.field_l, this.field_x);
        wd.a(false);
        lk.field_d = ad.c(-3109);
        am.a((byte) 29, ae.field_G);
        f.field_g = param7;
        fg.field_b = param4;
        wc.field_s = param2;
        ld.field_d = param3;
        ik.field_b = param0;
        this.f((byte) -95);
        bk.b(93);
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            int var5 = 0;
            Exception var6 = null;
            dh var7 = null;
            String var8 = null;
            int var9 = 0;
            String var10 = null;
            String var11 = null;
            Boolean var12 = null;
            Throwable decompiledCaughtException = null;
            var9 = Terraphoenix.field_V;
            var4 = a.a(param0, vj.field_P, ph.field_o, 81);
            if (0 != var4) {
              L0: {
                if ((var4 ^ -1) == -2) {
                  L1: {
                    var5 = fg.a(fm.a(-32218), 41, qh.a(true));
                    if ((var5 ^ -1) != 0) {
                      fl.a(bh.field_d, false, te.field_a, var5);
                      te.field_a = null;
                      bh.field_d = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var12 = rd.b((byte) 92);
                  if (var12 != null) {
                    af.a(true, var12.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if ((var4 ^ -1) == -3) {
                  var5 = gi.a(this.field_o, le.a(false), cm.a(-125), 3, ab.b(-27737), vl.b(3), pb.a((byte) -47));
                  if (0 != (var5 ^ -1)) {
                    bi.a(var5, bh.field_d, te.field_a, -14);
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
                    if ((jj.field_f ^ -1) == 0) {
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
                    var5 = wj.a(false, 29398, le.a(false), pb.a((byte) -47), this.field_o, this.field_r);
                    if (0 != (var5 ^ -1)) {
                      if (0 == var5) {
                        pf.field_c = oj.field_y;
                        kj.a((byte) 95);
                        ei.field_R = false;
                        q.field_Jb = 10;
                        break L3;
                      } else {
                        k.a(var5, bh.field_d, false);
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
                    rk.a(dg.a(false), true);
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
                if ((var4 ^ -1) == -6) {
                  fc.a(dg.a(false), 100);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var5 = -92 / ((1 - param2) / 40);
                if ((var4 ^ -1) == -7) {
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
                  rk.a(dg.a(false), true);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if ((var4 ^ -1) == -10) {
                  dl.a(23943, dg.a(false));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if ((var4 ^ -1) != -11) {
                  break L11;
                } else {
                  di.field_l.k(-17410, 17);
                  break L11;
                }
              }
              L12: {
                if (-12 != (var4 ^ -1)) {
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
                if ((var4 ^ -1) == -14) {
                  try {
                    L15: {
                      L16: {
                        if (fm.field_b == null) {
                          fm.field_b = new bh(nj.field_l, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
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
                              var10 = (String) null;
                              si.a((String) null, 3);
                              break L18;
                            } else {
                              var8 = tc.a((byte) -114, var7.field_i, var7.field_k, 0);
                              si.a(var8, 3);
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
                      bd.a((Throwable) ((Object) var6), "S1", 82);
                      var11 = (String) null;
                      si.a((String) null, 3);
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
                var6 = ck.b(113);
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
          tc.b(1);
          fc.b(43);
          if (c.b(-107)) {
            break L2;
          } else {
            if (-12 != (q.field_Jb ^ -1)) {
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
              var3 = 1200 * uc.j((byte) -127);
              if (this.field_q) {
                break L5;
              } else {
                if ((var3 ^ -1) <= (ch.a((byte) -5) ^ -1)) {
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
            this.field_q = false;
            gb.g(-17464);
            gl.c((byte) 127);
            k.a(2, ae.field_F, false);
            ke.a((byte) -107);
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
              if (-1 == (jj.field_f ^ -1)) {
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
            jj.field_f = wc.c(0);
            if (var3 == 0) {
              break L9;
            } else {
              if (jj.field_f != 0) {
                break L9;
              } else {
                if (-12 != (q.field_Jb ^ -1)) {
                  break L9;
                } else {
                  if (!qf.a((byte) 64)) {
                    kj.a((byte) 95);
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
            if (-1 == (jj.field_f ^ -1)) {
              break L10;
            } else {
              if (-11 >= (uh.field_H ^ -1)) {
                if (10 <= q.field_Jb) {
                  L11: {
                    gl.c((byte) 118);
                    if (jj.field_f != 3) {
                      if (jj.field_f != 4) {
                        if (jj.field_f != 2) {
                          if ((jj.field_f ^ -1) == -6) {
                            k.a(5, sh.field_x, false);
                            break L11;
                          } else {
                            k.a(256, ak.field_f, false);
                            break L11;
                          }
                        } else {
                          k.a(256, j.field_P, false);
                          break L11;
                        }
                      } else {
                        k.a(256, lb.field_a, false);
                        break L11;
                      }
                    } else {
                      k.a(256, tj.field_ub, false);
                      break L11;
                    }
                  }
                  q.field_Gb = true;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if ((jj.field_f ^ -1) != -4) {
                  if ((jj.field_f ^ -1) == -5) {
                    this.a("js5io", true);
                    break L10;
                  } else {
                    if (-3 != (jj.field_f ^ -1)) {
                      if ((jj.field_f ^ -1) == -6) {
                        this.a("outofdate", true);
                        break L10;
                      } else {
                        this.a("js5connect", true);
                        break L10;
                      }
                    } else {
                      this.a("js5connect_full", true);
                      break L10;
                    }
                  }
                } else {
                  this.a("js5crc", true);
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if ((jj.field_f ^ -1) == 0) {
                break L14;
              } else {
                if (-1 != (jj.field_f ^ -1)) {
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
              if (-1 != (jj.field_f ^ -1)) {
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
          if (-2 == (uh.field_H ^ -1)) {
            L18: {
              if (0 != ph.field_o) {
                bl.field_a = va.a(wc.field_s, -120);
                break L18;
              } else {
                break L18;
              }
            }
            bi.field_d = vj.a(false, true, ld.field_d, (byte) 62, 1);
            ph.field_q = vj.a(false, true, ik.field_b, (byte) 62, 1);
            ch.field_g = vj.a(false, true, f.field_g, (byte) 62, 1);
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
                      ea.a((byte) 47);
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
                    jj.e(-119);
                    hj.g(-7958);
                    ad.field_e = hh.field_k;
                    wd.field_b = false;
                    am.a(ch.field_g, jm.field_c, ph.field_q, bi.field_d, (byte) -22);
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
                    sa.field_d = qa.a((byte) -110);
                    break L27;
                  }
                }
                bb.a(ch.field_g, -94, sa.field_d, kj.field_b);
                ch.field_g = null;
                bi.field_d = null;
                ph.field_q = null;
                uh.a(-31312, (java.applet.Applet) (this));
                ea.a((byte) 47);
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
                vh.a(qc.a(qb.field_e, bi.field_b, si.field_hb, (byte) 123), (byte) 66, 0.0f);
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
              this.d(0);
              am.a((byte) -128, ae.field_G);
              break L37;
            }
          }
        }
        L38: {
          var3 = -108 / ((-17 - param0) / 32);
          if (tg.field_c[8]) {
            dg.a(81);
            break L38;
          } else {
            break L38;
          }
        }
    }

    private final void j(int param0) {
        tg.field_c[2] = true;
        if (param0 != 8560) {
            field_y = (nd) null;
        }
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4) {
        this.a((byte) -119, false);
        if (!(!param0)) {
            this.l(10001);
        }
        if (param3) {
            this.j(8560);
        }
        if (param1) {
            this.i(1);
        }
        if (param4) {
            this.c((byte) -113);
        }
        if (param2 != 13) {
            this.a(true, true, 1, true, true);
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
                    jb.a((byte) -127);
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
                              if (-8 == (var2 ^ -1)) {
                                this.e((byte) -109);
                                break L1;
                              } else {
                                if (var2 != 8) {
                                  if (16 != var2) {
                                    L2: {
                                      if (-12 == (var2 ^ -1)) {
                                        break L2;
                                      } else {
                                        if ((var2 ^ -1) == -13) {
                                          break L2;
                                        } else {
                                          if (-14 != (var2 ^ -1)) {
                                            if (-18 != (var2 ^ -1)) {
                                              if (18 == var2) {
                                                bh.b(-80);
                                                break L1;
                                              } else {
                                                bd.a((Throwable) null, "MGS1: " + r.i(-15465), -87);
                                                gb.g(-17464);
                                                break L1;
                                              }
                                            } else {
                                              this.g((byte) -118);
                                              break L1;
                                            }
                                          } else {
                                            ee.a((byte) 127);
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
                                    var4 = bm.a(stackIn_32_0 != 0, 0);
                                    od.a(var4, (byte) -97);
                                    break L1;
                                  } else {
                                    Terraphoenix.q(320);
                                    break L1;
                                  }
                                } else {
                                  sd.a((byte) 43, nj.field_l, mk.field_j, qh.field_d);
                                  break L1;
                                }
                              }
                            } else {
                              qb.b(0);
                              break L1;
                            }
                          } else {
                            uk.a(true);
                            break L1;
                          }
                        } else {
                          rj.a(127);
                          break L1;
                        }
                      }
                    } else {
                      gi.d(127);
                      break L1;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        bd.a((Throwable) null, "MGS2: " + r.i(-15465), -109);
        gb.g(-17464);
    }

    private final void a(byte param0, boolean param1) {
        if (param0 != -119) {
            this.field_x = -3;
        }
        tg.field_c[7] = true;
        tg.field_c[18] = true;
        tg.field_c[0] = true;
        tg.field_c[3] = true;
        tg.field_c[16] = true;
        tg.field_c[8] = param1;
        tg.field_c[17] = true;
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
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
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.b(true)) {
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
                    ((gf) (this)).field_r = stackIn_7_1 != 0;
                    this.field_v = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_A = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 != null) {
                      this.field_x = Integer.parseInt(var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_t = Long.parseLong(this.getParameter("instanceid"));
                    this.field_s = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_z = Integer.parseInt(var8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((this.field_z ^ -1) <= -6) {
                      this.field_z = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_o = Integer.parseInt(var9);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  if (param0 < -39) {
                    od.field_a = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                    this.a(param2, 50, 32, this.field_B, param4, param3, param1);
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
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                bd.a((Throwable) ((Object) var6), (String) null, 99);
                this.a("crash", true);
                decompiledRegionSelector0 = 2;
                break L8;
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
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var6_ref);
            stackOut_25_1 = new StringBuilder().append("gf.QC(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param4 + ')');
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
              this.a(-45, 480, param2, param1, 640);
              if (param0 <= -61) {
                break L1;
              } else {
                this.field_w = (String) null;
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
            stackOut_3_1 = new StringBuilder().append("gf.WC(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void f(byte param0) {
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
        if (param0 >= -78) {
            field_y = (nd) null;
        }
        dk.field_j[18] = 1;
        dk.field_j[12] = -1;
    }

    private final void i(int param0) {
        tg.field_c[4] = true;
        if (param0 != 1) {
            this.field_o = -73;
        }
    }

    private final void e(byte param0) {
        if (param0 != -109) {
            return;
        }
        String var2 = ab.c(param0 ^ 14599);
        lb.a(var2, dg.a(false), param0 ^ 108);
    }

    final void k(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = Terraphoenix.field_V;
        if (param0 != -20858) {
            return;
        }
        if (wf.a(31996)) {
            discarded$1 = this.a(null != a.field_b ? true : false, false, -65);
        } else {
            if (10 <= uh.field_H) {
                if (!sl.a((byte) -126)) {
                    dh.g(97);
                } else {
                    if (q.field_Jb == 0) {
                        discarded$3 = this.a(false, false, -91);
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
        field_u = new kf("usename");
    }
}
