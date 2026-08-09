/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class d extends se {
    private boolean field_z;
    private boolean field_r;
    private int field_p;
    static bd field_s;
    static long field_y;
    private int field_v;
    static int field_u;
    String field_o;
    private int field_m;
    private int field_t;
    static long field_n;
    private int field_A;
    private boolean field_w;
    private int field_q;
    private long field_x;

    final static void a(byte param0, byte[] param1, File param2, int param3) throws IOException {
        DataInputStream var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        EOFException var5 = null;
        try {
          L0: {
            var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param2)))));
            if (param0 < -107) {
              try {
                L1: {
                  var4.readFully(param1, 0, param3);
                  break L1;
                }
              } catch (java.io.EOFException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var5 = (EOFException) (Object) decompiledCaughtException;
                  break L2;
                }
              }
              var4.close();
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("d.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(boolean param0) {
        mk.field_O[2] = param0;
    }

    public static void g(byte param0) {
        field_s = null;
        int var1 = -80 % ((-65 - param0) / 37);
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10;
        var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param5) {
          return;
        } else {
          nl.field_c = this.field_t;
          la.a(-29828, nl.field_c);
          m.a(param3, param1, gf.field_b, this.field_v, 5000, this.field_q, nl.field_c, 5000, this.field_m, this.field_x, this.field_o, -40, this.field_p, this.field_z);
          hh.a(nl.field_c, this.field_v, gf.field_b, this.field_p, this.field_o, this.field_q, this.field_m, param3, -1);
          rb.e(-2);
          h.field_b = ti.b((byte) -55);
          ea.a(se.field_h, 0);
          nm.field_i = param6;
          ck.field_e = param4;
          tb.field_P = param7;
          ll.field_d = param2;
          uh.field_k = param0;
          this.i(12);
          ec.b(-21931);
          return;
        }
    }

    private final void k(int param0) {
        String var2 = bb.b((byte) 99);
        if (param0 != -1431) {
            field_y = 69L;
        }
        qj.a(var2, bn.c(-1), (byte) 85);
    }

    final int d(byte param0) {
        if (this.field_i) {
            return -1;
        }
        if (!ig.c(false)) {
            return -1;
        }
        if (i.field_d) {
            return -1;
        }
        int var2 = ee.a(true, this.field_A, this.field_r, -109, qc.d(750938499), q.c(-1));
        if (!(-1 != var2)) {
            return -1;
        }
        if (-1 == (var2 ^ -1) || (var2 ^ -1) == -2) {
            if (11 == fa.field_c) {
                if (!((rj.field_H ^ -1) != -1)) {
                    ba.e((byte) -90);
                }
            }
            return var2;
        }
        if (!na.field_b) {
            this.a(3904, "reconnect");
        }
        if (param0 != -75) {
            this.field_t = 120;
        }
        cf.b(true);
        la.a(var2, km.field_x, (byte) 65);
        i.field_d = true;
        dh.field_c = 15000L + hn.a((byte) 80);
        return var2;
    }

    private final void a(boolean param0, byte param1) {
        if (param1 != 30) {
          return;
        } else {
          mk.field_O[18] = true;
          mk.field_O[0] = true;
          mk.field_O[17] = true;
          mk.field_O[16] = true;
          mk.field_O[8] = param0;
          mk.field_O[7] = true;
          mk.field_O[3] = true;
          return;
        }
    }

    final int b(boolean param0, int param1) {
        if (param1 != -1) {
            return -52;
        }
        return this.a(true, -1, param0);
    }

    private final void g(int param0) {
        if (param0 != 24293) {
            field_s = (bd) null;
        }
        mk.field_O[1] = true;
    }

    private final void j(int param0) {
        int var2 = sc.field_g.l(32270);
        int var3 = param0 != (1 & var2) ? 1 : 0;
        int var4 = -1 + jd.field_q;
        byte[] var5 = new byte[var4];
        sc.field_g.a(0, var4, var5, (byte) 82);
        wc.a(bn.c(-1), nm.a(125, var5), (byte) -97, var3 != 0);
    }

    private final void a(int param0, String param1, int param2, int param3, byte param4) {
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
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
                if (this.d(-64)) {
                  L2: {
                    this.field_o = this.getCodeBase().getHost();
                    var6 = this.field_o.toLowerCase();
                    if (param4 <= -21) {
                      break L2;
                    } else {
                      this.b(true, 87);
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      stackIn_7_0 = this;

                      if (var6.equals("jagex.com")) {
                        break L4;
                      } else {
                        stackIn_8_0 = this;

                        if (!var6.endsWith(".jagex.com")) {
                          stackIn_9_0 = this;
                          stackIn_9_1 = 0;
                          break L3;
                        } else {
                          stackIn_7_0 = this;
                          break L4;
                        }
                      }
                    }
                    stackIn_9_0 = this;
                    stackIn_9_1 = 1;
                    break L3;
                  }
                  L5: {
                    ((d) (this)).field_r = stackIn_9_1 != 0;
                    this.field_v = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_m = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L5;
                    } else {
                      this.field_q = Integer.parseInt(var7);
                      break L5;
                    }
                  }
                  L6: {
                    this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_x = Long.parseLong(this.getParameter("instanceid"));
                    this.field_z = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_t = Integer.parseInt(var8);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (this.field_t >= 5) {
                      this.field_t = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_A = Integer.parseInt(var9);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  kj.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(param3, param2, 32, (byte) 121, param0, param1, this.field_p);
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
                var6_ref = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                ic.a((byte) -120, (String) null, (Throwable) ((Object) var6_ref));
                this.a(3904, "crash");
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
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var6_ref2);

            stackIn_26_1 = new StringBuilder().append("d.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, (byte) 30);
        if (!(!param3)) {
            this.g(24293);
        }
        int var6 = 82 % ((-26 - param1) / 38);
        if (!(!param2)) {
            this.c(true);
        }
        if (param0) {
            this.e((byte) -56);
        }
        if (param4) {
            this.f((byte) 97);
        }
    }

    private final void f(byte param0) {
        mk.field_O[5] = true;
        if (param0 != 97) {
            d.g((byte) -39);
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            Throwable decompiledCaughtException = null;
            int var4 = 0;
            int var5_int = 0;
            Exception var5 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            Boolean var10 = null;
            vi var11 = null;
            var8 = HostileSpawn.field_I ? 1 : 0;
            var4 = vb.a(ll.field_c, 118, nl.field_c, param2);
            if (param1 != (var4 ^ -1)) {
              L0: {
                if (var4 == 1) {
                  L1: {
                    var5_int = pj.a(la.b(false), kj.b(-109), 29280);
                    if (-1 != var5_int) {
                      hj.a(ea.field_a, km.field_x, 0, var5_int);
                      ea.field_a = null;
                      km.field_x = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var10 = fj.k(-11401);
                  if (var10 != null) {
                    cj.a(75, var10.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if ((var4 ^ -1) != -3) {
                  break L2;
                } else {
                  var5_int = fj.a(jm.a((byte) 93), this.field_A, vf.l(-1), q.c(-1), kj.a(param1 + -125), (byte) -8, qc.d(param1 ^ -750938500));
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    gm.a(26991, km.field_x, ea.field_a, var5_int);
                    km.field_x = null;
                    ea.field_a = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (-4 == (var4 ^ -1)) {
                  L4: {
                    if ((rj.field_H ^ -1) == 0) {
                      break L4;
                    } else {
                      if ((rj.field_H ^ -1) != -1) {
                        rj.field_H = -1;
                        lg.c(true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param0) {
                    i.field_d = false;
                    break L3;
                  } else {
                    var5_int = ee.a(false, this.field_A, this.field_r, -124, qc.d(750938499), q.c(-1));
                    if (0 != (var5_int ^ -1)) {
                      if (0 != var5_int) {
                        la.a(var5_int, km.field_x, (byte) 51);
                        km.field_x = null;
                        break L3;
                      } else {
                        wg.field_yb = ib.field_d;
                        ba.e((byte) -86);
                        md.field_k = false;
                        fa.field_c = 10;
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
                if (-5 != (var4 ^ -1)) {
                  break L5;
                } else {
                  if (wc.field_g) {
                    aa.a(bn.c(-1), 2429);
                    break L5;
                  } else {
                    md.field_k = true;
                    fa.field_c = 10;
                    break L5;
                  }
                }
              }
              L6: {
                if ((var4 ^ -1) != -6) {
                  break L6;
                } else {
                  dc.a(param1 ^ -64, bn.c(-1));
                  break L6;
                }
              }
              L7: {
                if (6 == var4) {
                  if (ka.field_r) {
                    fa.field_c = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (-8 != (var4 ^ -1)) {
                  break L8;
                } else {
                  uj.a(bn.c(param1 + 0), (byte) 41);
                  break L8;
                }
              }
              L9: {
                if ((var4 ^ -1) == -9) {
                  aa.a(bn.c(-1), 2429);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (9 == var4) {
                  td.a(bn.c(-1), 200);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if ((var4 ^ -1) == -11) {
                  s.field_b.i(19319, 17);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 == 11) {
                  o.a((byte) -98, bn.c(-1));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 != 12) {
                  break L13;
                } else {
                  ta.a(-320, hj.d(param1 + 71), bn.c(-1));
                  break L13;
                }
              }
              L14: {
                if (-14 != (var4 ^ -1)) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (eb.field_c != null) {
                          break L16;
                        } else {
                          eb.field_c = new sc(gf.field_b, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (eb.field_c.b(24)) {
                          L18: {
                            var11 = eb.field_c.b((byte) 124);
                            if (var11 == null) {
                              wj.b((String) null, param1 ^ 10602);
                              break L18;
                            } else {
                              var7 = db.a(var11.field_n, 0, (byte) -120, var11.field_i);
                              wj.b(var7, -10603);
                              break L18;
                            }
                          }
                          eb.field_c = null;
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
                      var5 = (Exception) (Object) decompiledCaughtException;
                      ic.a((byte) -117, "S1", (Throwable) ((Object) var5));
                      var9 = (String) null;
                      wj.b((String) null, -10603);
                      eb.field_c = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (15 == var4) {
                  fa.field_c = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (16 != var4) {
                if (-18 == (var4 ^ -1)) {
                  return 2;
                } else {
                  return 0;
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

    final void h(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (bc.d(-95)) {
            discarded$1 = this.a(false, param0 ^ 12751, wa.field_q != null ? true : false);
        } else {
            if (-11 < (pb.field_Kb ^ -1)) {
            } else {
                if (!uk.a(27301)) {
                    qa.a(true);
                } else {
                    if (0 != fa.field_c) {
                        ml.a((byte) 112, ll.field_c);
                    } else {
                        discarded$2 = this.a(false, param0 + 12751, false);
                    }
                }
            }
        }
        if (param0 != -12752) {
            this.j(-31);
        }
    }

    final void h(byte param0) {
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int var2;
        int var3;
        ln var4;
        int var5;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          var2 = 102 % ((45 - param0) / 58);
          var3 = wa.field_k;
          if (-65 >= (var3 ^ -1)) {
            break L0;
          } else {
            if (mk.field_O[var3]) {
              if (0 == var3) {
                return;
              } else {
                L1: {
                  if (var3 == 1) {
                    tg.b(-4309);
                    break L1;
                  } else {
                    if ((var3 ^ -1) != -3) {
                      if ((var3 ^ -1) == -4) {
                        lb.b(-20785);
                        break L1;
                      } else {
                        if (-5 == (var3 ^ -1)) {
                          mb.a((byte) 65);
                          break L1;
                        } else {
                          if (var3 != 5) {
                            if (var3 == 6) {
                              rg.c(1);
                              break L1;
                            } else {
                              if (-8 == (var3 ^ -1)) {
                                this.k(-1431);
                                break L1;
                              } else {
                                if (var3 != 8) {
                                  if (-17 == (var3 ^ -1)) {
                                    t.a((byte) 118);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var3 == 11) {
                                        break L2;
                                      } else {
                                        if (var3 != 12) {
                                          if (-14 != (var3 ^ -1)) {
                                            if (17 != var3) {
                                              if (18 == var3) {
                                                dh.a((byte) -6);
                                                break L1;
                                              } else {
                                                ic.a((byte) -121, "MGS1: " + gf.a((byte) -123), (Throwable) null);
                                                le.c((byte) 81);
                                                break L1;
                                              }
                                            } else {
                                              this.j(0);
                                              break L1;
                                            }
                                          } else {
                                            oc.a((byte) 102);
                                            break L1;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L3: {
                                      stackIn_22_0 = 1;

                                      if (-13 != (var3 ^ -1)) {
                                        stackIn_23_0 = stackIn_22_0;
                                        stackIn_23_1 = 0;
                                        break L3;
                                      } else {
                                        stackIn_23_0 = stackIn_22_0;
                                        stackIn_23_1 = 1;
                                        break L3;
                                      }
                                    }
                                    var4 = wk.a(stackIn_23_0 != 0, stackIn_23_1 != 0);
                                    ce.a(var4, true);
                                    break L1;
                                  }
                                } else {
                                  i.a(29821, sc.field_g, gf.field_b, jd.field_q);
                                  break L1;
                                }
                              }
                            }
                          } else {
                            rc.b(2);
                            break L1;
                          }
                        }
                      }
                    } else {
                      vi.k(64);
                      break L1;
                    }
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        ic.a((byte) -122, "MGS2: " + gf.a((byte) -125), (Throwable) null);
        le.c((byte) 77);
    }

    private final void i(int param0) {
        ng.field_l[11] = -1;
        ng.field_l[3] = -1;
        ng.field_l[param0] = -1;
        ng.field_l[8] = -2;
        ng.field_l[18] = 1;
        ng.field_l[1] = 16;
        ng.field_l[16] = -1;
        ng.field_l[17] = -1;
        ng.field_l[7] = -1;
        ng.field_l[2] = -2;
        ng.field_l[9] = -1;
        ng.field_l[10] = -1;
        ng.field_l[13] = -1;
        ng.field_l[4] = -1;
        ng.field_l[6] = -2;
        ng.field_l[5] = -1;
    }

    final void a(boolean param0, int param1) {
        int stackIn_23_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_136_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (ie.field_c == null) {
            break L0;
          } else {
            L1: {
              if (null != wa.field_q) {
                break L1;
              } else {
                var6 = fg.b((byte) -31);
                var4 = var6.getSize();
                ie.field_c.a(var4.height, 1, var4.width);
                break L1;
              }
            }
            ie.field_c.a(true);
            break L0;
          }
        }
        L2: {
          sb.a(-113);
          se.b(false);
          if (cm.b((byte) -97)) {
            break L2;
          } else {
            if (11 != fa.field_c) {
              vf.j(param1 + -9769);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null == h.field_b) {
            break L3;
          } else {
            ll.field_c = h.field_b.a((byte) 60);
            break L3;
          }
        }
        L4: {
          if (kl.b(50)) {
            L5: {
              var3 = 1200 * eh.a((byte) -63);
              if (this.field_w) {
                break L5;
              } else {
                if ((el.c(9) ^ -1) >= (var3 ^ -1)) {
                  break L4;
                } else {
                  if ((mf.a(36) ^ -1) >= (var3 ^ -1)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_w = false;
            le.c((byte) 68);
            cf.b(true);
            la.a(2, vf.field_G, (byte) 110);
            qg.b((byte) 111);
            i.field_d = true;
            dh.field_c = hn.a((byte) 80) + 15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if ((rj.field_H ^ -1) == 0) {
              break L7;
            } else {
              if (0 == rj.field_H) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if ((rj.field_H ^ -1) != 0) {
              stackIn_23_0 = 0;
              break L8;
            } else {
              stackIn_23_0 = 1;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            rj.field_H = ud.a(param1 ^ 9768);
            if (var3 == 0) {
              break L9;
            } else {
              if ((rj.field_H ^ -1) != -1) {
                break L9;
              } else {
                if (-12 != (fa.field_c ^ -1)) {
                  break L9;
                } else {
                  if (ig.c(false)) {
                    break L9;
                  } else {
                    ba.e((byte) -104);
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == rj.field_H) {
            break L6;
          } else {
            if ((rj.field_H ^ -1) != -1) {
              dh.field_c = 15000L + hn.a((byte) 80);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (rj.field_H == -1) {
            break L10;
          } else {
            if (0 != rj.field_H) {
              if (-11 >= (pb.field_Kb ^ -1)) {
                if (-11 >= (fa.field_c ^ -1)) {
                  L11: {
                    cf.b(true);
                    if (3 != rj.field_H) {
                      if (4 != rj.field_H) {
                        if (2 != rj.field_H) {
                          if ((rj.field_H ^ -1) == -6) {
                            la.a(5, hd.field_q, (byte) 83);
                            break L11;
                          } else {
                            la.a(256, qb.field_m, (byte) 48);
                            break L11;
                          }
                        } else {
                          la.a(256, jg.field_g, (byte) 84);
                          break L11;
                        }
                      } else {
                        la.a(256, kd.field_A, (byte) 48);
                        break L11;
                      }
                    } else {
                      la.a(256, oh.field_b, (byte) 110);
                      break L11;
                    }
                  }
                  i.field_d = true;
                  break L10;
                } else {
                  break L10;
                }
              } else {
                if ((rj.field_H ^ -1) != -4) {
                  if (-5 == (rj.field_H ^ -1)) {
                    this.a(3904, "js5io");
                    break L10;
                  } else {
                    if ((rj.field_H ^ -1) != -3) {
                      if (5 == rj.field_H) {
                        this.a(3904, "outofdate");
                        break L10;
                      } else {
                        this.a(3904, "js5connect");
                        break L10;
                      }
                    } else {
                      this.a(3904, "js5connect_full");
                      break L10;
                    }
                  }
                } else {
                  this.a(3904, "js5crc");
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          if (param1 == 9768) {
            break L12;
          } else {
            this.a(7, true, -106, -37, -90, true, 83, 74);
            break L12;
          }
        }
        L13: {
          L14: {
            L15: {
              if (rj.field_H == -1) {
                break L15;
              } else {
                if (rj.field_H != 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!ig.c(false)) {
              break L13;
            } else {
              break L14;
            }
          }
          if ((hn.a((byte) 80) ^ -1L) > (dh.field_c ^ -1L)) {
            break L13;
          } else {
            i.field_d = false;
            if (rj.field_H == -1) {
              break L13;
            } else {
              if (rj.field_H == 0) {
                break L13;
              } else {
                rj.field_H = -1;
                lg.c(true);
                break L13;
              }
            }
          }
        }
        L16: {
          if ((rj.field_H ^ -1) != -1) {
            break L16;
          } else {
            if (ig.c(false)) {
              break L16;
            } else {
              tf.field_d = false;
              break L16;
            }
          }
        }
        L17: {
          if ((pb.field_Kb ^ -1) == -1) {
            if (!fg.a(32)) {
              break L17;
            } else {
              pb.field_Kb = 1;
              break L17;
            }
          } else {
            break L17;
          }
        }
        L18: {
          if ((pb.field_Kb ^ -1) == -2) {
            L19: {
              if ((nl.field_c ^ -1) != -1) {
                vc.field_d = qm.b(1, tb.field_P);
                break L19;
              } else {
                break L19;
              }
            }
            im.field_c = nj.a(param1 ^ 9811, ck.field_e, true, false, 1);
            mb.field_m = nj.a(96, uh.field_k, true, false, 1);
            ll.field_b = nj.a(114, nm.field_i, true, false, 1);
            wd.field_a = im.field_c;
            gb.field_a = mb.field_m;
            pb.field_Kb = 2;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (pb.field_Kb == 2) {
            L21: {
              if (vc.field_d == null) {
                break L21;
              } else {
                if (!vc.field_d.a(-15879)) {
                  break L21;
                } else {
                  if (vc.field_d.a("", (byte) 124)) {
                    if (vc.field_d.a(param1 ^ -14784, "")) {
                      dl.a(param1 + -9839, vc.field_d);
                      vc.field_d = null;
                      ql.f(param1 ^ 14668);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    vc.field_d = null;
                    break L21;
                  }
                }
              }
            }
            if (vc.field_d != null) {
              break L20;
            } else {
              pb.field_Kb = 3;
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (pb.field_Kb != 3) {
            break L22;
          } else {
            if (!ca.a(ll.field_b, mb.field_m, im.field_c, param1 + -9768)) {
              break L22;
            } else {
              if (jh.a(-95, ll.field_b)) {
                L23: {
                  L24: {
                    fh.a(1);
                    ni.c(-30074);
                    wi.field_c = l.field_e;
                    ka.field_r = false;
                    lc.a(wc.field_g, ll.field_b, im.field_c, 12789, mb.field_m);
                    if (rd.field_d) {
                      break L24;
                    } else {
                      if (ti.field_d == null) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (rd.field_d) {
                      stackIn_102_0 = 0;
                      break L25;
                    } else {
                      stackIn_102_0 = 1;
                      break L25;
                    }
                  }
                  L26: {


                    if (rd.field_d) {

                      stackIn_105_1 = 0;
                      break L26;
                    } else {

                      stackIn_105_1 = 1;
                      break L26;
                    }
                  }
                  ac.a(stackIn_102_0 != 0, stackIn_105_1 != 0, -1, ti.field_d);
                  break L23;
                }
                L27: {
                  if (kj.field_b) {
                    ci.a(-1);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (hf.field_c == null) {
                    hf.field_c = wj.e((byte) -98);
                    vc.field_b = uj.e(1);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                nm.a(vc.field_b, ll.field_b, param1 + -9887, hf.field_c);
                mb.field_m = null;
                im.field_c = null;
                ll.field_b = null;
                bm.a((byte) -113, (java.applet.Applet) (this));
                ql.f(8036);
                pb.field_Kb = 10;
                break L22;
              } else {
                break L22;
              }
            }
          }
        }
        L29: {
          if (-11 == (pb.field_Kb ^ -1)) {
            L30: {
              if (0 == nl.field_c) {
                break L30;
              } else {
                uh.field_m = qm.b(param1 ^ 9769, ll.field_d);
                break L30;
              }
            }
            pb.field_Kb = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (11 != pb.field_Kb) {
            break L31;
          } else {
            L32: {
              if (uh.field_m == null) {
                break L32;
              } else {
                L33: {
                  if (!uh.field_m.a(-15879)) {
                    break L33;
                  } else {
                    if (!uh.field_m.e(param1 + -9768)) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                gj.a(param1 ^ 9788, md.a(ad.field_b, uh.field_m, u.field_j, (byte) -69), 0.0f);
                break L31;
              }
            }
            pb.field_Kb = 12;
            ri.field_m = true;
            break L31;
          }
        }
        L34: {
          if ((pb.field_Kb ^ -1) == -13) {
            if (!ri.field_m) {
              pb.field_Kb = 13;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if ((pb.field_Kb ^ -1) != -14) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (dd.field_i != null) {
                L37: {
                  if (!dd.field_i.a((byte) -52)) {
                    stackIn_136_0 = 0;
                    break L37;
                  } else {
                    stackIn_136_0 = 1;
                    break L37;
                  }
                }
                var3 = stackIn_136_0;
                gj.a(20, dd.field_i.field_b, dd.field_i.field_f);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 != 0) {
              pb.field_Kb = 20;
              break L35;
            } else {
              break L35;
            }
          }
        }
        L38: {
          if (param0) {
            break L38;
          } else {
            if (ih.field_s) {
              v.a(82, se.field_h);
              this.b(-67);
              ea.a(se.field_h, 0);
              break L38;
            } else {
              break L38;
            }
          }
        }
        L39: {
          if (!mk.field_O[8]) {
            break L39;
          } else {
            vk.c(8);
            break L39;
          }
        }
    }

    private final void e(byte param0) {
        int var2 = -70 % ((param0 - 45) / 41);
        mk.field_O[4] = true;
    }

    final void a(String param0, int param1, int param2) {
        try {
            this.a(param2, param0, 640, param1, (byte) -55);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "d.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    protected d() {
    }

    static {
        field_u = 0;
    }
}
