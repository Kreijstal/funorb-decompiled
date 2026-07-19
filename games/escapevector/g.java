/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class g extends eh {
    static lk field_r;
    static int field_q;
    private int field_w;
    private int field_u;
    private boolean field_x;
    private int field_y;
    private int field_o;
    private int field_t;
    private boolean field_v;
    private long field_m;
    String field_s;
    private boolean field_n;
    private int field_p;

    private final void g(int param0) {
        if (param0 <= 110) {
            this.h((byte) 65);
        }
        sn.field_b[4] = true;
    }

    final int k(byte param0) {
        int var2 = 0;
        var2 = this.g((byte) 117);
        if (param0 == -67) {
          L0: {
            L1: {
              if (-1 == (var2 ^ -1)) {
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
              if (sn.field_b[1]) {
                di.a(-83, 2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!sn.field_b[2]) {
                break L3;
              } else {
                ck.a(3, (byte) 105);
                break L3;
              }
            }
            L4: {
              if (!sn.field_b[3]) {
                break L4;
              } else {
                tk.a(26, 4);
                break L4;
              }
            }
            L5: {
              if (!sn.field_b[4]) {
                break L5;
              } else {
                im.a((byte) 88, 5);
                break L5;
              }
            }
            L6: {
              if (sn.field_b[5]) {
                be.a(6, 17205);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (sn.field_b[6]) {
                ad.a(7, 69);
                break L7;
              } else {
                break L7;
              }
            }
            if (sn.field_b[8]) {
              sa.d((byte) 27);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return 16;
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 != -556) {
            int[] var4 = (int[]) null;
            g.a((byte[]) null, 119, (int[]) null, 11, -27);
        }
        return this.a(255, true, param0);
    }

    private final void f(byte param0) {
        wd.field_u[2] = -2;
        wd.field_u[10] = -1;
        wd.field_u[8] = -2;
        wd.field_u[12] = -1;
        wd.field_u[9] = -1;
        wd.field_u[11] = -1;
        wd.field_u[5] = -1;
        if (param0 != -14) {
            this.field_s = (String) null;
        }
        wd.field_u[4] = -1;
        wd.field_u[6] = -2;
        wd.field_u[16] = -1;
        wd.field_u[1] = 16;
        wd.field_u[3] = -1;
        wd.field_u[13] = -1;
        wd.field_u[17] = -1;
        wd.field_u[18] = 1;
        wd.field_u[7] = -1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ff.field_h = this.field_u;
        nf.b(ff.field_h, 15);
        qf.a(5000, 5000, this.field_t, this.field_n, param4, field_r, this.field_p, param6, (byte) 84, this.field_o, this.field_m, this.field_s, ff.field_h, this.field_y);
        fl.a(this.field_s, field_r, param4, param5 ^ 22212, ff.field_h, this.field_t, this.field_p, this.field_y, this.field_o);
        cg.e(param5 + 213);
        ji.field_b = EscapeVector.n(13);
        rc.a(of.field_d, true);
        vi.field_g = param1;
        ve.field_k = param0;
        gi.field_l = param3;
        if (param5 != -99) {
            this.j(28);
        }
        dn.field_a = param2;
        wc.field_l = param7;
        this.f((byte) -14);
        ag.b(79);
    }

    final void j(int param0) {
        int discarded$38 = 0;
        int discarded$39 = 0;
        int var3 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        L0: {
          var3 = EscapeVector.field_A;
          if (param0 == -9926) {
            break L0;
          } else {
            this.field_o = 25;
            break L0;
          }
        }
        L1: {
          if (aa.a((byte) 102)) {
            L2: {
              stackOut_9_0 = this;
              stackOut_9_1 = param0 ^ -9787;
              stackOut_9_2 = 0;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              if (null == df.field_d) {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = stackIn_11_2;
                stackOut_11_3 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                stackIn_12_3 = stackOut_11_3;
                break L2;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = stackIn_10_2;
                stackOut_10_3 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_12_3 = stackOut_10_3;
                break L2;
              }
            }
            discarded$38 = this.a(stackIn_12_1, stackIn_12_2 != 0, stackIn_12_3 != 0);
            break L1;
          } else {
            if ((fc.field_a ^ -1) > -11) {
              break L1;
            } else {
              if (jf.l(3)) {
                if (ff.field_e == 0) {
                  discarded$39 = this.a(255, false, false);
                  break L1;
                } else {
                  ac.a(25972, mg.field_f);
                  break L1;
                }
              } else {
                fc.a(true);
                break L1;
              }
            }
          }
        }
    }

    final static ed[] e(int param0) {
        ed[] discarded$1 = null;
        ed[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        byte[] var20 = null;
        int[] var21 = null;
        byte[] var22 = null;
        var8 = EscapeVector.field_A;
        var1 = new ed[qk.field_j];
        var2 = 0;
        L0: while (true) {
          if (qk.field_j <= var2) {
            L1: {
              if (param0 == 15556) {
                break L1;
              } else {
                discarded$1 = g.e(126);
                break L1;
              }
            }
            of.a(false);
            return var1;
          } else {
            var3 = qh.field_k[var2] * bc.field_a[var2];
            var20 = qe.field_a[var2];
            if (bj.field_E[var2]) {
              var22 = hn.field_b[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var7 >= var3) {
                  var1[var2] = (ed) ((Object) new uh(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var16));
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = lb.a(ae.a(255, (int) var22[var7]) << 1146571384, qk.field_f[ae.a(255, (int) var20[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var21 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var6_int >= var3) {
                  var1[var2] = new ed(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], var21);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = qk.field_f[ae.a((int) var20[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    private final void a(boolean param0, byte param1) {
        sn.field_b[18] = true;
        sn.field_b[17] = true;
        sn.field_b[0] = true;
        sn.field_b[3] = true;
        sn.field_b[16] = true;
        int var3 = -65 % ((-38 - param1) / 40);
        sn.field_b[8] = param0;
        sn.field_b[7] = true;
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.a(true)) {
                  L2: {
                    L3: {
                      this.field_s = this.getCodeBase().getHost();
                      var6_ref2 = this.field_s.toLowerCase();
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
                    ((g) (this)).field_x = stackIn_7_1 != 0;
                    this.field_o = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_y = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_t = Integer.parseInt(var7);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_m = Long.parseLong(this.getParameter("instanceid"));
                    this.field_n = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 == null) {
                      break L5;
                    } else {
                      this.field_u = Integer.parseInt(var8);
                      break L5;
                    }
                  }
                  L6: {
                    if ((this.field_u ^ -1) <= -6) {
                      this.field_u = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_w = Integer.parseInt(var9);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  bc.field_e = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(this.field_p, param3, 1, param0, param2, param4, param1);
                  decompiledRegionSelector0 = 1;
                  break L1;
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
                pf.a(false, (String) null, (Throwable) ((Object) var6));
                this.a(-1, "crash");
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
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var6_ref);
            stackOut_21_1 = new StringBuilder().append("g.BA(").append(param0).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
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
            n var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = EscapeVector.field_A;
            var4 = mm.a(param0 ^ 191, param2, mg.field_f, ff.field_h);
            if (-1 != (var4 ^ -1)) {
              L0: {
                if (var4 == 1) {
                  L1: {
                    var5_int = ui.a(kn.b(true), jd.a(false), 55);
                    if (var5_int != -1) {
                      jk.a(jf.field_I, ca.field_a, param0 ^ -156, var5_int);
                      jf.field_I = null;
                      ca.field_a = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = vg.l(-9878);
                  if (var11 == null) {
                    break L0;
                  } else {
                    bh.a(var11.booleanValue(), -19503);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if ((var4 ^ -1) == -3) {
                  var5_int = kh.a(fl.e(0), this.field_w, ce.c(31069), uf.a(30519), jh.d(param0 ^ -4157), oi.k(-99), 0);
                  if ((var5_int ^ -1) != 0) {
                    j.a(jf.field_I, ca.field_a, (byte) -72, var5_int);
                    jf.field_I = null;
                    ca.field_a = null;
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
                    if ((jn.field_b ^ -1) == 0) {
                      break L4;
                    } else {
                      if (0 != jn.field_b) {
                        jn.field_b = -1;
                        va.d(0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param1) {
                    q.field_P = false;
                    break L3;
                  } else {
                    var5_int = mj.a(1, this.field_w, uf.a(30519), fl.e(0), false, this.field_x);
                    if (var5_int == -1) {
                      break L3;
                    } else {
                      if (0 == var5_int) {
                        eb.field_J = mg.field_d;
                        qd.a(true);
                        ff.field_e = 10;
                        nf.field_u = false;
                        break L3;
                      } else {
                        hi.a(var5_int, (byte) 83, ca.field_a);
                        ca.field_a = null;
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (ej.field_d) {
                    cm.a(oc.d((byte) -113), 21027);
                    break L5;
                  } else {
                    nf.field_u = true;
                    ff.field_e = 10;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 != 5) {
                  break L6;
                } else {
                  gk.a(param0 + -10042, oc.d((byte) -72));
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (!c.field_u) {
                    break L7;
                  } else {
                    ff.field_e = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (-8 == (var4 ^ -1)) {
                  v.a(oc.d((byte) -120), (byte) -99);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((var4 ^ -1) == -9) {
                  cm.a(oc.d((byte) -127), param0 ^ 21212);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 != 9) {
                  break L10;
                } else {
                  dm.a(param0 + -251, oc.d((byte) -89));
                  break L10;
                }
              }
              L11: {
                if (-11 != (var4 ^ -1)) {
                  break L11;
                } else {
                  om.field_c.a(17, true);
                  break L11;
                }
              }
              L12: {
                if (param0 == 255) {
                  break L12;
                } else {
                  this.field_m = -32L;
                  break L12;
                }
              }
              L13: {
                if (-12 != (var4 ^ -1)) {
                  break L13;
                } else {
                  de.a(false, oc.d((byte) -102));
                  break L13;
                }
              }
              L14: {
                if ((var4 ^ -1) == -13) {
                  md.a(oc.d((byte) -86), (byte) -123, dg.c((byte) -31));
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if ((var4 ^ -1) != -14) {
                  break L15;
                } else {
                  try {
                    L16: {
                      L17: {
                        if (pk.field_m == null) {
                          pk.field_m = new ad(field_r, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (!pk.field_m.a(17)) {
                          break L18;
                        } else {
                          L19: {
                            var12 = pk.field_m.c(-43);
                            if (var12 != null) {
                              var7 = qi.a(var12.field_m, 0, var12.field_g, (byte) 117);
                              jk.a(var7, (byte) -6);
                              break L19;
                            } else {
                              var9 = (String) null;
                              jk.a((String) null, (byte) -6);
                              break L19;
                            }
                          }
                          pk.field_m = null;
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      pf.a(false, "S1", (Throwable) ((Object) var5));
                      var10 = (String) null;
                      jk.a((String) null, (byte) -6);
                      pk.field_m = null;
                      break L20;
                    }
                  }
                  break L15;
                }
              }
              L21: {
                if (15 == var4) {
                  ff.field_e = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
              if ((var4 ^ -1) == -17) {
                return 1;
              } else {
                if (var4 == 17) {
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

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, (byte) 78);
        if (!(!param0)) {
            this.d(true);
        }
        if (param2) {
            this.j((byte) -113);
        }
        int var6 = 84 / ((28 - param1) / 60);
        if (!(!param3)) {
            this.g(127);
        }
        if (param4) {
            this.k(125);
        }
    }

    private final void c(boolean param0) {
        int var2 = om.field_g.e(0);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + hi.field_r;
        byte[] var5 = new byte[var4];
        om.field_g.a(var5, 19583, var4, 0);
        th.a(param0, var3 != 0, oc.d((byte) -122), mi.a(var5, 117));
    }

    final void a(String param0, int param1, int param2) {
        try {
            this.a(param1, param0, 480, param2, 32);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "g.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1) {
        bk.field_r = new sf(param1);
        int var2 = 45 / ((param0 - 89) / 35);
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        gi var4 = null;
        int var5 = 0;
        int stackIn_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          var2 = cd.field_v;
          var3 = 96 % ((80 - param0) / 33);
          if ((var2 ^ -1) <= -65) {
            break L0;
          } else {
            if (sn.field_b[var2]) {
              if (var2 != 0) {
                L1: {
                  if (-2 == (var2 ^ -1)) {
                    ll.b(false);
                    break L1;
                  } else {
                    if (2 != var2) {
                      if (3 == var2) {
                        cg.c(103);
                        break L1;
                      } else {
                        if ((var2 ^ -1) == -5) {
                          dk.e(108457410);
                          break L1;
                        } else {
                          if ((var2 ^ -1) == -6) {
                            ge.a((byte) 124);
                            break L1;
                          } else {
                            if ((var2 ^ -1) != -7) {
                              if (7 != var2) {
                                if (-9 != (var2 ^ -1)) {
                                  if ((var2 ^ -1) == -17) {
                                    ll.a(true);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (11 == var2) {
                                        break L2;
                                      } else {
                                        if (12 != var2) {
                                          if (13 == var2) {
                                            bk.g(0);
                                            break L1;
                                          } else {
                                            if (-18 != (var2 ^ -1)) {
                                              if (var2 != 18) {
                                                pf.a(false, "MGS1: " + hf.b((byte) 107), (Throwable) null);
                                                nm.a(16);
                                                break L1;
                                              } else {
                                                vd.a((byte) -125);
                                                break L1;
                                              }
                                            } else {
                                              this.c(true);
                                              break L1;
                                            }
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L3: {
                                      if (12 != var2) {
                                        stackOut_24_0 = 0;
                                        stackIn_25_0 = stackOut_24_0;
                                        break L3;
                                      } else {
                                        stackOut_23_0 = 1;
                                        stackIn_25_0 = stackOut_23_0;
                                        break L3;
                                      }
                                    }
                                    var4 = sl.a(stackIn_25_0 != 0, 2);
                                    na.a(19956, var4);
                                    break L1;
                                  }
                                } else {
                                  km.a(om.field_g, field_r, hi.field_r, -24183);
                                  break L1;
                                }
                              } else {
                                this.h((byte) 108);
                                break L1;
                              }
                            } else {
                              ri.a((byte) 113);
                              break L1;
                            }
                          }
                        }
                      }
                    } else {
                      ja.a((byte) -120);
                      break L1;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        pf.a(false, "MGS2: " + hf.b((byte) 49), (Throwable) null);
        nm.a(16);
    }

    final static void a(byte[] param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 > 113) {
                break L1;
              } else {
                field_r = (lk) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= al.field_f.length) {
                break L0;
              } else {
                param4 = al.field_f[var5_int];
                var6 = var5_int << 2109849060;
                L3: while (true) {
                  incrementValue$12 = param4;
                  param4--;
                  if (incrementValue$12 == 0) {
                    var5_int++;
                    continue L2;
                  } else {
                    incrementValue$13 = var6;
                    var6++;
                    param1 = bc.field_f[incrementValue$13];
                    param2[param0[param1]] = param2[param0[param1]] + 1;
                    bc.field_f[param2[param0[param1]]] = param1;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var5);
            stackOut_10_1 = new StringBuilder().append("g.IA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void h(byte param0) {
        String var2 = tf.b((byte) 0);
        va.a(var2, -112, oc.d((byte) -59));
        int var3 = 59 % ((param0 - 41) / 61);
    }

    public static void i(byte param0) {
        field_r = null;
        if (param0 != -73) {
            g.a(-56, 26);
        }
    }

    private final void j(byte param0) {
        if (param0 >= -63) {
            this.field_p = -123;
        }
        sn.field_b[2] = true;
    }

    private final void k(int param0) {
        if (param0 < 99) {
            String var3 = (String) null;
            this.a(69, (String) null, -3, 75, 67);
        }
        sn.field_b[5] = true;
    }

    private final int g(byte param0) {
        int var2 = 0;
        if (this.field_b) {
          return -1;
        } else {
          if (!um.a(17830)) {
            return -1;
          } else {
            if (!q.field_P) {
              var2 = mj.a(1, this.field_w, uf.a(param0 ^ 30530), fl.e(param0 + -117), true, this.field_x);
              if ((var2 ^ -1) == 0) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if ((var2 ^ -1) == -2) {
                      break L0;
                    } else {
                      L1: {
                        if (fh.field_a) {
                          break L1;
                        } else {
                          this.a(-1, "reconnect");
                          break L1;
                        }
                      }
                      L2: {
                        sc.b((byte) -123);
                        hi.a(var2, (byte) 83, ca.field_a);
                        if (param0 == 117) {
                          break L2;
                        } else {
                          this.field_s = (String) null;
                          break L2;
                        }
                      }
                      q.field_P = true;
                      tg.field_mb = td.b(128) - -15000L;
                      return var2;
                    }
                  }
                }
                L3: {
                  if (11 != ff.field_e) {
                    break L3;
                  } else {
                    if (0 == jn.field_b) {
                      qd.a(true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                return var2;
              }
            } else {
              return -1;
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        String stackIn_97_0 = null;
        String stackIn_98_0 = null;
        String stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        String stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        String stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        String stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        int stackIn_131_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_96_0 = null;
        String stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        String stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        String stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        String stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        String stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        L0: {
          var5 = EscapeVector.field_A;
          if (km.field_n == null) {
            break L0;
          } else {
            L1: {
              if (null == df.field_d) {
                var6 = pg.a(-1);
                var4 = var6.getSize();
                km.field_n.a(var4.height, var4.width, 18705);
                break L1;
              } else {
                break L1;
              }
            }
            km.field_n.b(9477);
            break L0;
          }
        }
        L2: {
          ac.a(28087);
          nf.g(-3657);
          if (ii.b(16836)) {
            break L2;
          } else {
            if (11 == ff.field_e) {
              break L2;
            } else {
              b.a(-103);
              break L2;
            }
          }
        }
        L3: {
          if (null != ji.field_b) {
            mg.field_f = ji.field_b.a(-126);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (rb.a(true)) {
            L5: {
              var3 = 1200 * se.a(0);
              if (this.field_v) {
                break L5;
              } else {
                if ((mg.a((byte) -12) ^ -1) >= (var3 ^ -1)) {
                  break L4;
                } else {
                  if (of.a((byte) -127) > var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            this.field_v = false;
            nm.a(param0 ^ -17);
            sc.b((byte) -87);
            hi.a(2, (byte) 83, ah.field_g);
            hg.a(12);
            q.field_P = true;
            tg.field_mb = td.b(param0 + 129) + 15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (0 == (jn.field_b ^ -1)) {
              break L7;
            } else {
              if (-1 != (jn.field_b ^ -1)) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != jn.field_b) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_24_0;
            jn.field_b = ae.b(param0 + -1021831774);
            if (var3 == 0) {
              break L9;
            } else {
              if (0 != jn.field_b) {
                break L9;
              } else {
                if (ff.field_e != 11) {
                  break L9;
                } else {
                  if (!um.a(17830)) {
                    qd.a(true);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (jn.field_b == -1) {
            break L6;
          } else {
            if ((jn.field_b ^ -1) == -1) {
              break L6;
            } else {
              tg.field_mb = 15000L + td.b(128);
              break L6;
            }
          }
        }
        L10: {
          if ((jn.field_b ^ -1) == 0) {
            break L10;
          } else {
            if (-1 != (jn.field_b ^ -1)) {
              if (10 > fc.field_a) {
                if (-4 != (jn.field_b ^ -1)) {
                  if (-5 != (jn.field_b ^ -1)) {
                    if (2 == jn.field_b) {
                      this.a(-1, "js5connect_full");
                      break L10;
                    } else {
                      if (-6 != (jn.field_b ^ -1)) {
                        this.a(-1, "js5connect");
                        break L10;
                      } else {
                        this.a(-1, "outofdate");
                        break L10;
                      }
                    }
                  } else {
                    this.a(-1, "js5io");
                    break L10;
                  }
                } else {
                  this.a(param0 + 0, "js5crc");
                  break L10;
                }
              } else {
                if (-11 < (ff.field_e ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    sc.b((byte) -103);
                    if (jn.field_b == 3) {
                      hi.a(256, (byte) 83, ag.field_b);
                      break L11;
                    } else {
                      if (jn.field_b == 4) {
                        hi.a(256, (byte) 83, nn.field_e);
                        break L11;
                      } else {
                        if (-3 != (jn.field_b ^ -1)) {
                          if (-6 != (jn.field_b ^ -1)) {
                            hi.a(256, (byte) 83, gm.field_f);
                            break L11;
                          } else {
                            hi.a(5, (byte) 83, gj.field_a);
                            break L11;
                          }
                        } else {
                          hi.a(256, (byte) 83, km.field_l);
                          break L11;
                        }
                      }
                    }
                  }
                  q.field_P = true;
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
              if (param0 == jn.field_b) {
                break L14;
              } else {
                if ((jn.field_b ^ -1) != -1) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (um.a(17830)) {
              break L13;
            } else {
              break L12;
            }
          }
          if ((tg.field_mb ^ -1L) < (td.b(128) ^ -1L)) {
            break L12;
          } else {
            q.field_P = false;
            if (jn.field_b == -1) {
              break L12;
            } else {
              if (jn.field_b == 0) {
                break L12;
              } else {
                jn.field_b = -1;
                va.d(param0 ^ -1);
                break L12;
              }
            }
          }
        }
        L15: {
          if (0 != jn.field_b) {
            break L15;
          } else {
            if (um.a(param0 ^ -17831)) {
              break L15;
            } else {
              pb.field_d = false;
              break L15;
            }
          }
        }
        L16: {
          if (0 != fc.field_a) {
            break L16;
          } else {
            if (!tk.a(23403)) {
              break L16;
            } else {
              fc.field_a = 1;
              break L16;
            }
          }
        }
        L17: {
          if (fc.field_a == 1) {
            L18: {
              if (ff.field_h != 0) {
                nk.field_p = mj.a(dn.field_a, param0 + -127);
                break L18;
              } else {
                break L18;
              }
            }
            ii.field_a = ve.a(ve.field_k, 0, false, 1, true);
            w.field_ab = ve.a(gi.field_l, 0, false, 1, true);
            pl.field_j = ve.a(vi.field_g, 0, false, 1, true);
            ve.field_h = ii.field_a;
            fc.field_a = 2;
            ei.field_m = w.field_ab;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (fc.field_a != 2) {
            break L19;
          } else {
            L20: {
              if (null == nk.field_p) {
                break L20;
              } else {
                if (!nk.field_p.b(param0 ^ -1)) {
                  break L20;
                } else {
                  if (!nk.field_p.a("", (byte) -119)) {
                    nk.field_p = null;
                    break L20;
                  } else {
                    if (!nk.field_p.a(0, "")) {
                      break L20;
                    } else {
                      qa.a(true, nk.field_p);
                      nk.field_p = null;
                      fn.a((byte) 62);
                      break L20;
                    }
                  }
                }
              }
            }
            if (nk.field_p == null) {
              fc.field_a = 3;
              break L19;
            } else {
              break L19;
            }
          }
        }
        L21: {
          if (3 == fc.field_a) {
            if (!of.a(ii.field_a, w.field_ab, pl.field_j, (byte) -90)) {
              break L21;
            } else {
              if (cf.a(11, pl.field_j)) {
                L22: {
                  L23: {
                    nk.h(-8055);
                    on.b(-87);
                    c.field_u = false;
                    hd.field_e = um.field_a;
                    dh.a(ej.field_d, (byte) -124, pl.field_j, ii.field_a, w.field_ab);
                    if (jb.field_p) {
                      break L23;
                    } else {
                      if (ac.field_d != null) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    stackOut_96_0 = ac.field_d;
                    stackIn_98_0 = stackOut_96_0;
                    stackIn_97_0 = stackOut_96_0;
                    if (jb.field_p) {
                      stackOut_98_0 = (String) ((Object) stackIn_98_0);
                      stackOut_98_1 = 0;
                      stackIn_99_0 = stackOut_98_0;
                      stackIn_99_1 = stackOut_98_1;
                      break L24;
                    } else {
                      stackOut_97_0 = (String) ((Object) stackIn_97_0);
                      stackOut_97_1 = 1;
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_99_1 = stackOut_97_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_99_0 = (String) ((Object) stackIn_99_0);
                    stackOut_99_1 = stackIn_99_1;
                    stackOut_99_2 = 64;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_101_1 = stackOut_99_1;
                    stackIn_101_2 = stackOut_99_2;
                    stackIn_100_0 = stackOut_99_0;
                    stackIn_100_1 = stackOut_99_1;
                    stackIn_100_2 = stackOut_99_2;
                    if (jb.field_p) {
                      stackOut_101_0 = (String) ((Object) stackIn_101_0);
                      stackOut_101_1 = stackIn_101_1;
                      stackOut_101_2 = stackIn_101_2;
                      stackOut_101_3 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      stackIn_102_2 = stackOut_101_2;
                      stackIn_102_3 = stackOut_101_3;
                      break L25;
                    } else {
                      stackOut_100_0 = (String) ((Object) stackIn_100_0);
                      stackOut_100_1 = stackIn_100_1;
                      stackOut_100_2 = stackIn_100_2;
                      stackOut_100_3 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      stackIn_102_2 = stackOut_100_2;
                      stackIn_102_3 = stackOut_100_3;
                      break L25;
                    }
                  }
                  ff.a(stackIn_102_0, stackIn_102_1 != 0, stackIn_102_2, stackIn_102_3 != 0);
                  break L22;
                }
                L26: {
                  if (bc.field_e) {
                    bm.a(4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (gb.field_b != null) {
                    break L27;
                  } else {
                    gb.field_b = ld.c((byte) 117);
                    sj.field_h = wc.c(-31119);
                    break L27;
                  }
                }
                je.a(pl.field_j, gb.field_b, sj.field_h, (byte) 103);
                ii.field_a = null;
                pl.field_j = null;
                w.field_ab = null;
                si.a(82, (java.applet.Applet) (this));
                fn.a((byte) 126);
                fc.field_a = 10;
                break L21;
              } else {
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (fc.field_a != 10) {
            break L28;
          } else {
            L29: {
              if (-1 != (ff.field_h ^ -1)) {
                mg.field_c = mj.a(wc.field_l, -127);
                break L29;
              } else {
                break L29;
              }
            }
            fc.field_a = 11;
            break L28;
          }
        }
        L30: {
          if ((fc.field_a ^ -1) != -12) {
            break L30;
          } else {
            L31: {
              if (mg.field_c == null) {
                break L31;
              } else {
                L32: {
                  if (!mg.field_c.b(0)) {
                    break L32;
                  } else {
                    if (mg.field_c.a((byte) -119)) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                dn.a(vh.a(md.field_H, mg.field_c, gj.field_g, -12920), 17637, 0.0f);
                break L30;
              }
            }
            of.field_b = true;
            fc.field_a = 12;
            break L30;
          }
        }
        L33: {
          if ((fc.field_a ^ -1) != -13) {
            break L33;
          } else {
            if (!of.field_b) {
              fc.field_a = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if (-14 != (fc.field_a ^ -1)) {
            break L34;
          } else {
            L35: {
              var3 = 1;
              if (null != fl.field_n) {
                L36: {
                  if (!fl.field_n.a(7020)) {
                    stackOut_130_0 = 0;
                    stackIn_131_0 = stackOut_130_0;
                    break L36;
                  } else {
                    stackOut_129_0 = 1;
                    stackIn_131_0 = stackOut_129_0;
                    break L36;
                  }
                }
                var3 = stackIn_131_0;
                dn.a(fl.field_n.field_b, 17637, fl.field_n.field_a);
                break L35;
              } else {
                break L35;
              }
            }
            if (var3 != 0) {
              fc.field_a = 20;
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
            if (n.field_i) {
              bo.a(of.field_d, (byte) -127);
              this.d(-32);
              rc.a(of.field_d, true);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (sn.field_b[8]) {
            c.p(11197);
            break L38;
          } else {
            break L38;
          }
        }
    }

    final static boolean i(int param0) {
        int var1 = 50 % ((param0 - 14) / 40);
        return true;
    }

    final static void h(int param0) {
        int incrementValue$40 = 0;
        int incrementValue$41 = 0;
        int incrementValue$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = EscapeVector.field_A;
        try {
          L0: {
            var5 = al.field_f;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            if (param0 < -110) {
              L1: while (true) {
                if (var3 <= var2) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  incrementValue$40 = var2;
                  var2++;
                  var5[incrementValue$40] = 0;
                  incrementValue$41 = var2;
                  var2++;
                  var5[incrementValue$41] = 0;
                  incrementValue$42 = var2;
                  var2++;
                  var5[incrementValue$42] = 0;
                  incrementValue$43 = var2;
                  var2++;
                  var5[incrementValue$43] = 0;
                  incrementValue$44 = var2;
                  var2++;
                  var5[incrementValue$44] = 0;
                  incrementValue$45 = var2;
                  var2++;
                  var5[incrementValue$45] = 0;
                  incrementValue$46 = var2;
                  var2++;
                  var5[incrementValue$46] = 0;
                  incrementValue$47 = var2;
                  var2++;
                  var5[incrementValue$47] = 0;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "g.MA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void d(boolean param0) {
        sn.field_b[1] = param0;
    }

    protected g() {
    }

    static {
        field_q = -1;
    }
}
