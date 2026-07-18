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

    final static void a(byte param0, byte[] param1, File param2) throws IOException {
        DataInputStream var4 = null;
        RuntimeException var4_ref = null;
        EOFException var5 = null;
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
            var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param2)));
            {
              L1: {
                var4.readFully(param1, 0, 60000);
                break L1;
              }
            }
            var4.close();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4_ref;
            stackOut_7_1 = new StringBuilder().append("d.P(").append(-115).append(',');
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
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + 60000 + ')');
        }
    }

    private final void c() {
        mk.field_O[2] = true;
    }

    public static void g() {
        field_s = null;
        int var1 = 0;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = null;
        var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((d) this).setBackground(java.awt.Color.black);
        if (param5) {
          return;
        } else {
          nl.field_c = ((d) this).field_t;
          la.a(-29828, nl.field_c);
          m.a(param3, param1, gf.field_b, ((d) this).field_v, 5000, ((d) this).field_q, nl.field_c, 5000, ((d) this).field_m, ((d) this).field_x, ((d) this).field_o, -40, ((d) this).field_p, ((d) this).field_z);
          int discarded$5 = -1;
          hh.a(nl.field_c, ((d) this).field_v, gf.field_b, ((d) this).field_p, ((d) this).field_o, ((d) this).field_q, ((d) this).field_m, param3);
          int discarded$6 = -2;
          rb.e();
          int discarded$7 = -55;
          h.field_b = ti.b();
          ea.a(se.field_h, 0);
          nm.field_i = param6;
          ck.field_e = param4;
          tb.field_P = param7;
          ll.field_d = param2;
          uh.field_k = param0;
          int discarded$8 = 12;
          this.i();
          int discarded$9 = -21931;
          ec.b();
          return;
        }
    }

    private final void k() {
        int discarded$0 = 99;
        String var2 = bb.b();
        qj.a(var2, bn.c(-1), (byte) 85);
    }

    final int d(byte param0) {
        int var2 = 0;
        if (!((d) this).field_i) {
          int discarded$8 = 0;
          if (ig.c()) {
            if (!i.field_d) {
              int discarded$9 = -1;
              var2 = ee.a(true, ((d) this).field_A, ((d) this).field_r, -109, qc.d(750938499), q.c());
              if (-1 == var2) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (na.field_b) {
                          break L1;
                        } else {
                          ((d) this).a(3904, "reconnect");
                          break L1;
                        }
                      }
                      L2: {
                        if (param0 == -75) {
                          break L2;
                        } else {
                          ((d) this).field_t = 120;
                          break L2;
                        }
                      }
                      int discarded$10 = 1;
                      cf.b();
                      la.a(var2, km.field_x, (byte) 65);
                      i.field_d = true;
                      dh.field_c = 15000L + hn.a((byte) 80);
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L3: {
                  if (11 != fa.field_c) {
                    break L3;
                  } else {
                    if (rj.field_H == 0) {
                      ba.e((byte) -90);
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
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    private final void a() {
        mk.field_O[18] = true;
        mk.field_O[0] = true;
        mk.field_O[17] = true;
        mk.field_O[16] = true;
        mk.field_O[8] = false;
        mk.field_O[7] = true;
        mk.field_O[3] = true;
    }

    final int b(boolean param0, int param1) {
        if (param1 != -1) {
            return -52;
        }
        return this.a(true, -1, param0);
    }

    private final void g(int param0) {
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

    private final void a(int param0, String param1, int param2, int param3) {
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
              if (((d) this).d(-64)) {
                L1: {
                  L2: {
                    ((d) this).field_o = ((d) this).getCodeBase().getHost();
                    var6_ref2 = ((d) this).field_o.toLowerCase();
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
                  ((d) this).field_r = stackIn_7_1 != 0;
                  ((d) this).field_v = Integer.parseInt(((d) this).getParameter("gameport1"));
                  ((d) this).field_m = Integer.parseInt(((d) this).getParameter("gameport2"));
                  var7 = ((d) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((d) this).field_q = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((d) this).field_p = Integer.parseInt(((d) this).getParameter("gamecrc"));
                  ((d) this).field_x = Long.parseLong(((d) this).getParameter("instanceid"));
                  ((d) this).field_z = ((d) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((d) this).getParameter("lang");
                  if (var8 != null) {
                    ((d) this).field_t = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((d) this).field_t >= 5) {
                    ((d) this).field_t = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var9 = ((d) this).getParameter("affid");
                  if (var9 != null) {
                    ((d) this).field_A = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                kj.field_b = Boolean.valueOf(((d) this).getParameter("simplemode")).booleanValue();
                ((d) this).a(param3, 640, 32, (byte) 121, param0, param1, ((d) this).field_p);
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
              ic.a((byte) -120, (String) null, (Throwable) (Object) var6);
              ((d) this).a(3904, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("d.Q(").append(param0).append(',');
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
          throw wg.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 640 + ',' + param3 + ',' + -55 + ')');
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4) {
        int discarded$0 = 30;
        int discarded$1 = 0;
        this.a();
        if (!(!param3)) {
            this.g(24293);
        }
        int var6 = 82 % ((-26 - param1) / 38);
        if (!(!param2)) {
            int discarded$2 = 1;
            this.c();
        }
        if (param0) {
            int discarded$3 = -56;
            this.e();
        }
        if (param4) {
            int discarded$4 = 97;
            this.f();
        }
    }

    private final void f() {
        mk.field_O[5] = true;
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Boolean var10 = null;
            vi var11 = null;
            Throwable decompiledCaughtException = null;
            var8 = HostileSpawn.field_I ? 1 : 0;
            var4 = vb.a(ll.field_c, 118, nl.field_c, param2);
            if (param1 != ~var4) {
              L0: {
                if (var4 == 1) {
                  L1: {
                    int discarded$12 = -109;
                    int discarded$13 = 29280;
                    var5_int = pj.a(la.b(false), kj.b());
                    if (-1 != var5_int) {
                      hj.a(ea.field_a, km.field_x, 0, var5_int);
                      ea.field_a = null;
                      km.field_x = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$14 = -11401;
                  var10 = fj.k();
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
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$15 = 93;
                  int discarded$16 = -1;
                  int discarded$17 = -1;
                  var5_int = fj.a(jm.a(), ((d) this).field_A, vf.l(), q.c(), kj.a(param1 + -125), (byte) -8, qc.d(param1 ^ -750938500));
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
                if (var4 == 3) {
                  L4: {
                    if (rj.field_H == -1) {
                      break L4;
                    } else {
                      if (rj.field_H != 0) {
                        rj.field_H = -1;
                        int discarded$18 = 1;
                        lg.c();
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
                    int discarded$19 = -1;
                    var5_int = ee.a(false, ((d) this).field_A, ((d) this).field_r, -124, qc.d(750938499), q.c());
                    if (var5_int != -1) {
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
                if (var4 != 4) {
                  break L5;
                } else {
                  if (wc.field_g) {
                    int discarded$20 = 2429;
                    aa.a(bn.c(-1));
                    break L5;
                  } else {
                    md.field_k = true;
                    fa.field_c = 10;
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 != 5) {
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
                if (var4 != 7) {
                  break L8;
                } else {
                  int discarded$21 = 41;
                  uj.a(bn.c(param1));
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  int discarded$22 = 2429;
                  aa.a(bn.c(-1));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (9 == var4) {
                  int discarded$23 = 200;
                  td.a(bn.c(-1));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 10) {
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
                if (var4 != 13) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (eb.field_c != null) {
                          break L16;
                        } else {
                          eb.field_c = new sc(gf.field_b, new java.net.URL(((d) this).getCodeBase(), "countrylist.ws"), 5000);
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
                      ic.a((byte) -117, "S1", (Throwable) (Object) var5);
                      var9 = null;
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
                if (var4 == 17) {
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
        int var3 = HostileSpawn.field_I ? 1 : 0;
        if (bc.d(-95)) {
            int discarded$1 = this.a(false, param0 ^ 12751, wa.field_q != null ? true : false);
        } else {
            if (pb.field_Kb < 10) {
            } else {
                if (!uk.a(27301)) {
                    qa.a(true);
                } else {
                    if (0 != fa.field_c) {
                        ml.a((byte) 112, ll.field_c);
                    } else {
                        int discarded$2 = this.a(false, param0 + 12751, false);
                    }
                }
            }
        }
        if (param0 != -12752) {
            this.j(-31);
        }
    }

    final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          var2 = 102 % ((45 - param0) / 58);
          var3 = wa.field_k;
          if (var3 >= 64) {
            break L0;
          } else {
            if (mk.field_O[var3]) {
              if (0 == var3) {
                return;
              } else {
                L1: {
                  if (var3 == 1) {
                    int discarded$10 = -4309;
                    tg.b();
                    break L1;
                  } else {
                    if (var3 != 2) {
                      if (var3 == 3) {
                        int discarded$11 = -20785;
                        lb.b();
                        break L1;
                      } else {
                        if (var3 == 4) {
                          int discarded$12 = 65;
                          mb.a();
                          break L1;
                        } else {
                          if (var3 != 5) {
                            if (var3 == 6) {
                              int discarded$13 = 1;
                              rg.c();
                              break L1;
                            } else {
                              if (var3 == 7) {
                                int discarded$14 = -1431;
                                this.k();
                                break L1;
                              } else {
                                if (var3 != 8) {
                                  if (var3 == 16) {
                                    int discarded$15 = 118;
                                    t.a();
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var3 == 11) {
                                        break L2;
                                      } else {
                                        if (var3 != 12) {
                                          if (var3 != 13) {
                                            if (17 != var3) {
                                              if (18 == var3) {
                                                int discarded$16 = -6;
                                                dh.a();
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
                                            int discarded$17 = 102;
                                            oc.a();
                                            break L1;
                                          }
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_20_0 = 1;
                                      stackIn_22_0 = stackOut_20_0;
                                      stackIn_21_0 = stackOut_20_0;
                                      if (var3 != 12) {
                                        stackOut_22_0 = stackIn_22_0;
                                        stackOut_22_1 = 0;
                                        stackIn_23_0 = stackOut_22_0;
                                        stackIn_23_1 = stackOut_22_1;
                                        break L3;
                                      } else {
                                        stackOut_21_0 = stackIn_21_0;
                                        stackOut_21_1 = 1;
                                        stackIn_23_0 = stackOut_21_0;
                                        stackIn_23_1 = stackOut_21_1;
                                        break L3;
                                      }
                                    }
                                    var4 = wk.a(stackIn_23_0 != 0, stackIn_23_1 != 0);
                                    int discarded$18 = 1;
                                    ce.a(var4);
                                    break L1;
                                  }
                                } else {
                                  i.a(29821, (vi) (Object) sc.field_g, gf.field_b, jd.field_q);
                                  break L1;
                                }
                              }
                            }
                          } else {
                            int discarded$19 = 2;
                            rc.b();
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

    private final void i() {
        ng.field_l[11] = -1;
        ng.field_l[3] = -1;
        ng.field_l[12] = -1;
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
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_136_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        L0: {
          var5 = HostileSpawn.field_I ? 1 : 0;
          if (ie.field_c == null) {
            break L0;
          } else {
            L1: {
              if (null != wa.field_q) {
                break L1;
              } else {
                int discarded$24 = -31;
                var6 = fg.b();
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
          int discarded$25 = -113;
          sb.a();
          se.b(false);
          int discarded$26 = -97;
          if (cm.b()) {
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
              if (((d) this).field_w) {
                break L5;
              } else {
                int discarded$27 = 9;
                if (~el.c() >= ~var3) {
                  break L4;
                } else {
                  int discarded$28 = 36;
                  if (~mf.a() >= ~var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((d) this).field_w = false;
            le.c((byte) 68);
            int discarded$29 = 1;
            cf.b();
            la.a(2, vf.field_G, (byte) 110);
            int discarded$30 = 111;
            qg.b();
            i.field_d = true;
            dh.field_c = hn.a((byte) 80) + 15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (rj.field_H == -1) {
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
            if (rj.field_H != -1) {
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
            rj.field_H = ud.a(param1 ^ 9768);
            if (var3 == 0) {
              break L9;
            } else {
              if (rj.field_H != 0) {
                break L9;
              } else {
                if (fa.field_c != 11) {
                  break L9;
                } else {
                  int discarded$31 = 0;
                  if (ig.c()) {
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
            if (rj.field_H != 0) {
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
              if (pb.field_Kb >= 10) {
                if (fa.field_c >= 10) {
                  L11: {
                    int discarded$32 = 1;
                    cf.b();
                    if (3 != rj.field_H) {
                      if (4 != rj.field_H) {
                        if (2 != rj.field_H) {
                          if (rj.field_H == 5) {
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
                if (rj.field_H != 3) {
                  if (rj.field_H == 4) {
                    ((d) this).a(3904, "js5io");
                    break L10;
                  } else {
                    if (rj.field_H != 2) {
                      if (5 == rj.field_H) {
                        ((d) this).a(3904, "outofdate");
                        break L10;
                      } else {
                        ((d) this).a(3904, "js5connect");
                        break L10;
                      }
                    } else {
                      ((d) this).a(3904, "js5connect_full");
                      break L10;
                    }
                  }
                } else {
                  ((d) this).a(3904, "js5crc");
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
            ((d) this).a(7, true, -106, -37, -90, true, 83, 74);
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
            int discarded$33 = 0;
            if (!ig.c()) {
              break L13;
            } else {
              break L14;
            }
          }
          if (~hn.a((byte) 80) > ~dh.field_c) {
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
                int discarded$34 = 1;
                lg.c();
                break L13;
              }
            }
          }
        }
        L16: {
          if (rj.field_H != 0) {
            break L16;
          } else {
            int discarded$35 = 0;
            if (ig.c()) {
              break L16;
            } else {
              tf.field_d = false;
              break L16;
            }
          }
        }
        L17: {
          if (pb.field_Kb == 0) {
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
          if (pb.field_Kb == 1) {
            L19: {
              if (nl.field_c != 0) {
                vc.field_d = qm.b(1, tb.field_P);
                break L19;
              } else {
                break L19;
              }
            }
            int discarded$36 = 1;
            int discarded$37 = 0;
            int discarded$38 = 1;
            im.field_c = nj.a(param1 ^ 9811, ck.field_e);
            int discarded$39 = 1;
            int discarded$40 = 0;
            int discarded$41 = 1;
            mb.field_m = nj.a(96, uh.field_k);
            int discarded$42 = 1;
            int discarded$43 = 0;
            int discarded$44 = 1;
            ll.field_b = nj.a(114, nm.field_i);
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
                    int discarded$45 = -30074;
                    ni.c();
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
                      stackOut_101_0 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      break L25;
                    } else {
                      stackOut_100_0 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_102_0 = stackIn_102_0;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (rd.field_d) {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      break L26;
                    } else {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      break L26;
                    }
                  }
                  ac.a(stackIn_105_0 != 0, stackIn_105_1 != 0, -1, ti.field_d);
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
                    int discarded$46 = 1;
                    vc.field_b = uj.e();
                    break L28;
                  } else {
                    break L28;
                  }
                }
                nm.a(vc.field_b, ll.field_b, param1 + -9887, hf.field_c);
                mb.field_m = null;
                im.field_c = null;
                ll.field_b = null;
                bm.a((byte) -113, (java.applet.Applet) this);
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
          if (pb.field_Kb == 10) {
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
          if (pb.field_Kb == 12) {
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
          if (pb.field_Kb != 13) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (dd.field_i != null) {
                L37: {
                  if (!dd.field_i.a((byte) -52)) {
                    stackOut_135_0 = 0;
                    stackIn_136_0 = stackOut_135_0;
                    break L37;
                  } else {
                    stackOut_134_0 = 1;
                    stackIn_136_0 = stackOut_134_0;
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
              ((d) this).b(-67);
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
            int discarded$47 = 8;
            vk.c();
            break L39;
          }
        }
    }

    private final void e() {
        int var2 = 0;
        mk.field_O[4] = true;
    }

    final void a(String param0, int param1, int param2) {
        try {
            int discarded$0 = -55;
            this.a(param2, param0, 640, param1);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "d.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    protected d() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
    }
}
