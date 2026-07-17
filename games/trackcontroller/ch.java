/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class ch extends re {
    private int field_A;
    private long field_w;
    String field_t;
    private int field_q;
    static byte[][] field_z;
    private int field_u;
    static wb field_n;
    static volatile int field_x;
    private boolean field_r;
    private boolean field_v;
    private boolean field_s;
    private int field_p;
    private int field_B;
    static int[] field_y;
    private int field_o;

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        q var4 = null;
        int var5 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          var2 = uk.field_c;
          if (var2 >= 64) {
            break L0;
          } else {
            if (kb.field_f[var2]) {
              var3 = 110 / ((param0 - -31) / 51);
              if (var2 != 0) {
                L1: {
                  if (var2 == 1) {
                    int discarded$11 = 1;
                    rd.a();
                    break L1;
                  } else {
                    if (var2 == 2) {
                      int discarded$12 = -3570;
                      pl.b();
                      break L1;
                    } else {
                      if (var2 != 3) {
                        if (var2 != 4) {
                          if (var2 == 5) {
                            int discarded$13 = -107;
                            cb.b();
                            break L1;
                          } else {
                            if (6 == var2) {
                              int discarded$14 = -126;
                              gk.a();
                              break L1;
                            } else {
                              if (var2 == 7) {
                                int discarded$15 = 3;
                                this.i();
                                break L1;
                              } else {
                                if (8 != var2) {
                                  if (var2 == 16) {
                                    int discarded$16 = 0;
                                    bk.j();
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (var2 != 13) {
                                            if (var2 == 17) {
                                              int discarded$17 = -6;
                                              this.k();
                                              break L1;
                                            } else {
                                              if (var2 != 18) {
                                                hb.a((Throwable) null, 0, "MGS1: " + jc.b(100));
                                                lj.a((byte) 119);
                                                break L1;
                                              } else {
                                                int discarded$18 = -83;
                                                og.f();
                                                break L1;
                                              }
                                            }
                                          } else {
                                            hh.b(128);
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      if (var2 != 12) {
                                        stackOut_29_0 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        break L3;
                                      } else {
                                        stackOut_28_0 = 1;
                                        stackIn_30_0 = stackOut_28_0;
                                        break L3;
                                      }
                                    }
                                    var4 = pj.a(stackIn_30_0 != 0, 21552);
                                    int discarded$19 = 1;
                                    qg.a(var4);
                                    break L1;
                                  }
                                } else {
                                  bl.a(0, hd.field_o, rg.field_c, (be) (Object) ne.field_a);
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          int discarded$20 = -53;
                          mf.a();
                          break L1;
                        }
                      } else {
                        int discarded$21 = -107;
                        kc.b();
                        break L1;
                      }
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
        hb.a((Throwable) null, 0, "MGS2: " + jc.b(90));
        lj.a((byte) 123);
    }

    private final void p() {
        kb.field_f[1] = true;
    }

    private final void a(boolean param0, int param1) {
        kb.field_f[3] = true;
        kb.field_f[param1] = true;
        kb.field_f[8] = false;
        kb.field_f[7] = true;
        kb.field_f[0] = true;
        kb.field_f[17] = true;
        kb.field_f[16] = true;
    }

    private final void f() {
        kb.field_f[2] = true;
    }

    final void a(byte param0, String param1, int param2) {
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
              this.a(480, param2, 640, 16813, param1);
              if (param0 < -64) {
                break L1;
              } else {
                ch.n(-86);
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
            stackOut_3_1 = new StringBuilder().append("ch.V(").append(param0).append(44);
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
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    final int d(byte param0) {
        int var2 = 0;
        L0: {
          if (param0 >= 81) {
            break L0;
          } else {
            ((ch) this).field_q = 70;
            break L0;
          }
        }
        L1: {
          L2: {
            int discarded$16 = -80;
            var2 = this.j();
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
            if (!kb.field_f[1]) {
              break L3;
            } else {
              int discarded$17 = 2;
              int discarded$18 = -101;
              ke.a();
              break L3;
            }
          }
          L4: {
            if (!kb.field_f[2]) {
              break L4;
            } else {
              rf.a(3, 0);
              break L4;
            }
          }
          L5: {
            if (!kb.field_f[3]) {
              break L5;
            } else {
              int discarded$19 = 4;
              int discarded$20 = -30422;
              l.a();
              break L5;
            }
          }
          L6: {
            if (kb.field_f[4]) {
              pa.a(5, (byte) 40);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!kb.field_f[5]) {
              break L7;
            } else {
              gb.a(4, 6);
              break L7;
            }
          }
          L8: {
            if (!kb.field_f[6]) {
              break L8;
            } else {
              int discarded$21 = 7;
              int discarded$22 = 7;
              cl.a();
              break L8;
            }
          }
          if (!kb.field_f[8]) {
            break L1;
          } else {
            int discarded$23 = -114;
            vb.a();
            break L1;
          }
        }
        return var2;
    }

    private final void k() {
        int var2 = ne.field_a.h(16383);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = hd.field_o - 1;
        byte[] var5 = new byte[var4];
        ne.field_a.a(var4, false, 0, var5);
        ib.a(var3 != 0, ta.a(32200, var5), gd.b((byte) 77), (byte) -25);
    }

    final void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, param0 ^ -19);
        if (param0 != -1) {
            ((ch) this).field_q = 52;
        }
        if (!(!param2)) {
            int discarded$0 = 113;
            this.p();
        }
        if (!(!param1)) {
            int discarded$1 = -86;
            this.f();
        }
        if (!(!param4)) {
            int discarded$2 = -111;
            this.g();
        }
        if (!(!param3)) {
            int discarded$3 = 100;
            this.h();
        }
    }

    private final void o(int param0) {
        if (param0 != -9165) {
          return;
        } else {
          kg.field_b[6] = -2;
          kg.field_b[12] = -1;
          kg.field_b[10] = -1;
          kg.field_b[16] = -1;
          kg.field_b[2] = -2;
          kg.field_b[7] = -1;
          kg.field_b[9] = -1;
          kg.field_b[17] = -1;
          kg.field_b[4] = -1;
          kg.field_b[5] = -1;
          kg.field_b[18] = 1;
          kg.field_b[11] = -1;
          kg.field_b[3] = -1;
          kg.field_b[8] = -2;
          kg.field_b[13] = -1;
          kg.field_b[1] = 16;
          return;
        }
    }

    private final void i() {
        int discarded$0 = 107;
        String var2 = aj.a();
        kc.a(gd.b((byte) 77), 1263, var2);
    }

    final void l(int param0) {
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
        var3 = TrackController.field_F ? 1 : 0;
        if (param0 >= -90) {
          return;
        } else {
          L0: {
            int discarded$4 = 1;
            if (ic.a()) {
              L1: {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackOut_9_2 = 0;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                stackIn_11_2 = stackOut_9_2;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                if (og.field_rb == null) {
                  stackOut_11_0 = this;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  stackIn_12_2 = stackOut_11_2;
                  stackIn_12_3 = stackOut_11_3;
                  break L1;
                } else {
                  stackOut_10_0 = this;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = stackIn_10_2;
                  stackOut_10_3 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  stackIn_12_2 = stackOut_10_2;
                  stackIn_12_3 = stackOut_10_3;
                  break L1;
                }
              }
              int discarded$5 = this.a(stackIn_12_1 != 0, stackIn_12_2 != 0, stackIn_12_3 != 0);
              break L0;
            } else {
              if (gl.field_I >= 10) {
                if (!ic.a(false)) {
                  int discarded$6 = 250;
                  kj.d();
                  break L0;
                } else {
                  if (0 == rl.field_N) {
                    int discarded$7 = this.a(true, false, false);
                    break L0;
                  } else {
                    od.a((byte) -105, ee.field_c);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
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
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
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
          try {
            L0: {
              if (((ch) this).a((byte) 60)) {
                L1: {
                  L2: {
                    ((ch) this).field_t = ((ch) this).getCodeBase().getHost();
                    var6_ref2 = ((ch) this).field_t.toLowerCase();
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
                  ((ch) this).field_v = stackIn_7_1 != 0;
                  ((ch) this).field_u = Integer.parseInt(((ch) this).getParameter("gameport1"));
                  ((ch) this).field_p = Integer.parseInt(((ch) this).getParameter("gameport2"));
                  var7 = ((ch) this).getParameter("servernum");
                  if (var7 != null) {
                    ((ch) this).field_o = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((ch) this).field_q = Integer.parseInt(((ch) this).getParameter("gamecrc"));
                  ((ch) this).field_w = Long.parseLong(((ch) this).getParameter("instanceid"));
                  ((ch) this).field_r = ((ch) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ch) this).getParameter("lang");
                  if (var8 != null) {
                    ((ch) this).field_A = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((ch) this).field_A < 5) {
                    break L5;
                  } else {
                    ((ch) this).field_A = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((ch) this).getParameter("affid");
                  if (var9 == null) {
                    break L6;
                  } else {
                    ((ch) this).field_B = Integer.parseInt(var9);
                    break L6;
                  }
                }
                jb.field_a = Boolean.valueOf(((ch) this).getParameter("simplemode")).booleanValue();
                ((ch) this).a(32, param1, ((ch) this).field_q, param4, 640, 480, 10);
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
              hb.a((Throwable) (Object) var6, 0, (String) null);
              ((ch) this).a("crash", (byte) 100);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var6_ref;
            stackOut_21_1 = new StringBuilder().append("ch.O(").append(480).append(44).append(param1).append(44).append(640).append(44).append(16813).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param4 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L8;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L8;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
    }

    final int b(boolean param0, int param1) {
        if (param1 < 78) {
            ((ch) this).field_r = false;
        }
        return this.a(true, true, param0);
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            be var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = TrackController.field_F ? 1 : 0;
            var4 = lf.a(hl.field_F, ee.field_c, (byte) 95, param2);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$12 = 93;
                    var5_int = ta.a(ab.a(false), (byte) -49, th.f());
                    if (var5_int != -1) {
                      ed.a(ca.field_a, var5_int, fi.field_t, (byte) 105);
                      fi.field_t = null;
                      ca.field_a = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$13 = 2;
                  var11 = el.j();
                  if (var11 != null) {
                    int discarded$14 = 1;
                    ld.a(var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  int discarded$15 = -4409;
                  int discarded$16 = 0;
                  int discarded$17 = -119;
                  int discarded$18 = 0;
                  var5_int = ba.a(((ch) this).field_B, sf.j(), qk.b(false), re.c(6), l.h(), gj.a());
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    int discarded$19 = 113;
                    gl.a(fi.field_t, ca.field_a, var5_int);
                    fi.field_t = null;
                    ca.field_a = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 == 3) {
                  L4: {
                    if (-1 == gj.field_c) {
                      break L4;
                    } else {
                      if (gj.field_c != 0) {
                        gj.field_c = -1;
                        jb.a(true);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param1) {
                    int discarded$20 = 0;
                    var5_int = da.a(((ch) this).field_v, false, l.h(), qk.b(false), 113, ((ch) this).field_B);
                    if (var5_int == -1) {
                      break L3;
                    } else {
                      if (var5_int != 0) {
                        af.a(-114, var5_int, fi.field_t);
                        fi.field_t = null;
                        break L3;
                      } else {
                        fi.field_p = nl.field_e;
                        ri.e(-45);
                        rl.field_N = 10;
                        ge.field_D = false;
                        break L3;
                      }
                    }
                  } else {
                    li.field_i = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (var4 == 4) {
                  if (oc.field_i) {
                    we.a(0, gd.b((byte) 77));
                    break L5;
                  } else {
                    ge.field_D = true;
                    rl.field_N = 10;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 == var4) {
                  int discarded$21 = -9;
                  af.a(gd.b((byte) 77));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 != 6) {
                  break L7;
                } else {
                  if (bc.field_d) {
                    rl.field_N = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var4 != 7) {
                  break L8;
                } else {
                  qh.a(false, gd.b((byte) 77));
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  we.a(0, gd.b((byte) 77));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  ma.a(-9969, gd.b((byte) 77));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 10) {
                  ra.field_C.c(17, 7);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 == 11) {
                  int discarded$22 = -1;
                  q.a(gd.b((byte) 77));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 == 12) {
                  int discarded$23 = 1;
                  gk.a(vk.b(), gd.b((byte) 77), -104);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (13 == var4) {
                  try {
                    L15: {
                      L16: {
                        if (null != he.field_c) {
                          break L16;
                        } else {
                          he.field_c = new ej(rg.field_c, new java.net.URL(((ch) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!he.field_c.a((byte) 77)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = he.field_c.a(-5);
                            if (var12 == null) {
                              var9 = null;
                              kd.a((String) null, (byte) 110);
                              break L18;
                            } else {
                              var7 = ka.a(0, -129, var12.field_j, var12.field_k);
                              kd.a(var7, (byte) 92);
                              break L18;
                            }
                          }
                          he.field_c = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      hb.a((Throwable) (Object) var5, 0, "S1");
                      var10 = null;
                      kd.a((String) null, (byte) 42);
                      he.field_c = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (var4 != 15) {
                  break L20;
                } else {
                  rl.field_N = 10;
                  break L20;
                }
              }
              if (var4 != 16) {
                if (17 != var4) {
                  return 0;
                } else {
                  return 2;
                }
              } else {
                return 1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int j() {
        int var2 = 0;
        int var3 = 0;
        if (((ch) this).field_e) {
          return -1;
        } else {
          if (!fc.c(96)) {
            return -1;
          } else {
            if (li.field_i) {
              return -1;
            } else {
              int discarded$2 = 0;
              var2 = da.a(((ch) this).field_v, true, l.h(), qk.b(false), 78, ((ch) this).field_B);
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (1 != var2) {
                      L1: {
                        if (ka.field_a) {
                          break L1;
                        } else {
                          ((ch) this).a("reconnect", (byte) 100);
                          break L1;
                        }
                      }
                      var3 = 0;
                      hh.a(-28717);
                      af.a(-100, var2, fi.field_t);
                      li.field_i = true;
                      rk.field_eb = qg.a(false) + 15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (rl.field_N != 11) {
                    break L2;
                  } else {
                    if (gj.field_c != 0) {
                      break L2;
                    } else {
                      ri.e(-128);
                      break L2;
                    }
                  }
                }
                return var2;
              }
            }
          }
        }
    }

    final static void m(int param0) {
        vg var1 = null;
        int var2 = 0;
        var1 = (vg) (Object) cj.field_j.c((byte) -82);
        if (var1 == null) {
          throw new IllegalStateException();
        } else {
          var2 = -73 % ((-24 - param0) / 38);
          ll.a(var1.field_l, var1.field_j, var1.field_n);
          ll.e(var1.field_q, var1.field_m, var1.field_k, var1.field_i);
          var1.field_l = null;
          gd.field_q.a((byte) -111, (fc) (Object) var1);
          return;
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Container var4_ref_java_awt_Container = null;
        int var4 = 0;
        java.awt.Dimension var5 = null;
        int var6 = 0;
        int stackIn_24_0 = 0;
        String stackIn_99_0 = null;
        String stackIn_100_0 = null;
        String stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        String stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        String stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_135_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_98_0 = null;
        String stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        String stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        String stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        String stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        String stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          var3 = 110 % ((param0 - -46) / 32);
          if (tk.field_u == null) {
            break L0;
          } else {
            L1: {
              if (og.field_rb == null) {
                int discarded$18 = -128;
                var4_ref_java_awt_Container = be.c();
                var5 = var4_ref_java_awt_Container.getSize();
                tk.field_u.a(0, var5.width, var5.height);
                break L1;
              } else {
                break L1;
              }
            }
            tk.field_u.b(true);
            break L0;
          }
        }
        L2: {
          int discarded$19 = 16473;
          ob.h();
          of.c((byte) 66);
          if (ga.a(-107)) {
            break L2;
          } else {
            if (rl.field_N != 11) {
              int discarded$20 = 123;
              vd.k();
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != rd.field_l) {
            ee.field_c = rd.field_l.a(86);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          int discarded$21 = 3100;
          if (!gh.a()) {
            break L4;
          } else {
            L5: {
              var4 = il.c(-14496) * 1200;
              if (((ch) this).field_s) {
                break L5;
              } else {
                int discarded$22 = -29;
                if (~mg.a() >= ~var4) {
                  break L4;
                } else {
                  int discarded$23 = 0;
                  if (uk.a() <= var4) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ch) this).field_s = false;
            lj.a((byte) 112);
            hh.a(-28717);
            af.a(-93, 2, oc.field_k);
            int discarded$24 = 9888;
            dk.a();
            li.field_i = true;
            rk.field_eb = 15000L + qg.a(false);
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == gj.field_c) {
              break L7;
            } else {
              if (0 != gj.field_c) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != gj.field_c) {
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
            var4 = stackIn_24_0;
            int discarded$25 = 104;
            gj.field_c = nl.b();
            if (var4 == 0) {
              break L9;
            } else {
              if (gj.field_c == 0) {
                if (rl.field_N != 11) {
                  break L9;
                } else {
                  if (fc.c(76)) {
                    break L9;
                  } else {
                    ri.e(-96);
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (gj.field_c == -1) {
            break L6;
          } else {
            if (gj.field_c == 0) {
              break L6;
            } else {
              rk.field_eb = 15000L + qg.a(false);
              break L6;
            }
          }
        }
        L10: {
          if (gj.field_c == -1) {
            break L10;
          } else {
            if (gj.field_c != 0) {
              if (gl.field_I >= 10) {
                if (rl.field_N < 10) {
                  break L10;
                } else {
                  L11: {
                    hh.a(-28717);
                    if (gj.field_c != 3) {
                      if (gj.field_c != 4) {
                        if (2 != gj.field_c) {
                          if (gj.field_c != 5) {
                            af.a(-107, 256, el.field_J);
                            break L11;
                          } else {
                            af.a(-91, 5, ak.field_a);
                            break L11;
                          }
                        } else {
                          af.a(-71, 256, wd.field_I);
                          break L11;
                        }
                      } else {
                        af.a(-76, 256, qc.field_f);
                        break L11;
                      }
                    } else {
                      af.a(-80, 256, bk.field_G);
                      break L11;
                    }
                  }
                  li.field_i = true;
                  break L10;
                }
              } else {
                if (3 != gj.field_c) {
                  if (gj.field_c == 4) {
                    ((ch) this).a("js5io", (byte) 100);
                    break L10;
                  } else {
                    if (2 != gj.field_c) {
                      if (5 == gj.field_c) {
                        ((ch) this).a("outofdate", (byte) 100);
                        break L10;
                      } else {
                        ((ch) this).a("js5connect", (byte) 100);
                        break L10;
                      }
                    } else {
                      ((ch) this).a("js5connect_full", (byte) 100);
                      break L10;
                    }
                  }
                } else {
                  ((ch) this).a("js5crc", (byte) 100);
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
              if (gj.field_c == -1) {
                break L14;
              } else {
                if (0 != gj.field_c) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (fc.c(124)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (~rk.field_eb >= ~qg.a(false)) {
            li.field_i = false;
            if (-1 == gj.field_c) {
              break L12;
            } else {
              if (gj.field_c == 0) {
                break L12;
              } else {
                gj.field_c = -1;
                jb.a(true);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (gj.field_c != 0) {
            break L15;
          } else {
            if (!fc.c(38)) {
              qh.field_i = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (gl.field_I != 0) {
            break L16;
          } else {
            int discarded$26 = 55;
            if (!dd.c()) {
              break L16;
            } else {
              gl.field_I = 1;
              break L16;
            }
          }
        }
        L17: {
          if (gl.field_I != 1) {
            break L17;
          } else {
            L18: {
              if (hl.field_F != 0) {
                ff.field_b = mf.a(tf.field_a, (byte) -70);
                break L18;
              } else {
                break L18;
              }
            }
            ei.field_i = vh.a(cg.field_c, 98, false, 1, true);
            ha.field_x = vh.a(rf.field_b, 98, false, 1, true);
            ok.field_G = vh.a(fk.field_b, 98, false, 1, true);
            fb.field_b = ha.field_x;
            el.field_L = ei.field_i;
            gl.field_I = 2;
            break L17;
          }
        }
        L19: {
          if (gl.field_I == 2) {
            L20: {
              if (null == ff.field_b) {
                break L20;
              } else {
                if (!ff.field_b.c(-25)) {
                  break L20;
                } else {
                  if (ff.field_b.a("", (byte) -125)) {
                    if (!ff.field_b.b("", (byte) -3)) {
                      break L20;
                    } else {
                      sf.a((byte) -114, ff.field_b);
                      ff.field_b = null;
                      qi.d(83);
                      break L20;
                    }
                  } else {
                    ff.field_b = null;
                    break L20;
                  }
                }
              }
            }
            if (ff.field_b == null) {
              gl.field_I = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (gl.field_I == 3) {
            if (!l.a(ei.field_i, ha.field_x, (byte) -112, ok.field_G)) {
              break L21;
            } else {
              if (rc.a(-25, ok.field_G)) {
                L22: {
                  L23: {
                    int discarded$27 = -98;
                    nj.b();
                    int discarded$28 = -51;
                    sl.b();
                    qi.field_k = gj.field_a;
                    bc.field_d = false;
                    int discarded$29 = -28484;
                    oe.a(oc.field_i, ei.field_i, ha.field_x, ok.field_G);
                    if (dg.field_B) {
                      break L23;
                    } else {
                      if (null == sk.field_h) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_98_0 = sk.field_h;
                    stackIn_100_0 = stackOut_98_0;
                    stackIn_99_0 = stackOut_98_0;
                    if (dg.field_B) {
                      stackOut_100_0 = (String) (Object) stackIn_100_0;
                      stackOut_100_1 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      break L24;
                    } else {
                      stackOut_99_0 = (String) (Object) stackIn_99_0;
                      stackOut_99_1 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      stackIn_101_1 = stackOut_99_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_101_0 = (String) (Object) stackIn_101_0;
                    stackOut_101_1 = stackIn_101_1;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    if (dg.field_B) {
                      stackOut_103_0 = (String) (Object) stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      break L25;
                    } else {
                      stackOut_102_0 = (String) (Object) stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      break L25;
                    }
                  }
                  int discarded$30 = 0;
                  jb.a(stackIn_104_0, stackIn_104_1 != 0, stackIn_104_2 != 0);
                  break L22;
                }
                L26: {
                  if (!jb.field_a) {
                    break L26;
                  } else {
                    int discarded$31 = 4;
                    kf.a();
                    break L26;
                  }
                }
                L27: {
                  if (null == ni.field_n) {
                    int discarded$32 = 11782;
                    ni.field_n = wd.q();
                    int discarded$33 = -12364;
                    uh.field_e = r.e();
                    break L27;
                  } else {
                    break L27;
                  }
                }
                ok.a(ni.field_n, uh.field_e, (byte) 52, ok.field_G);
                ok.field_G = null;
                ha.field_x = null;
                ei.field_i = null;
                int discarded$34 = 33;
                rh.a((java.applet.Applet) this);
                qi.d(-80);
                gl.field_I = 10;
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
          if (10 == gl.field_I) {
            L29: {
              if (hl.field_F != 0) {
                ed.field_I = mf.a(rj.field_b, (byte) -74);
                break L29;
              } else {
                break L29;
              }
            }
            gl.field_I = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (gl.field_I == 11) {
            L31: {
              if (null == ed.field_I) {
                break L31;
              } else {
                L32: {
                  if (!ed.field_I.c(-47)) {
                    break L32;
                  } else {
                    if (!ed.field_I.a((byte) 48)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                ud.a(128, 0.0f, ug.a(pc.field_t, ed.field_I, 2147483647, jb.field_c));
                break L30;
              }
            }
            ag.field_e = true;
            gl.field_I = 12;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (gl.field_I != 12) {
            break L33;
          } else {
            if (!ag.field_e) {
              gl.field_I = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if (13 == gl.field_I) {
            L35: {
              var4 = 1;
              if (wj.field_b == null) {
                break L35;
              } else {
                L36: {
                  if (!wj.field_b.a(true)) {
                    stackOut_134_0 = 0;
                    stackIn_135_0 = stackOut_134_0;
                    break L36;
                  } else {
                    stackOut_133_0 = 1;
                    stackIn_135_0 = stackOut_133_0;
                    break L36;
                  }
                }
                var4 = stackIn_135_0;
                ud.a(128, wj.field_b.field_i, wj.field_b.field_a);
                break L35;
              }
            }
            if (var4 != 0) {
              gl.field_I = 20;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (mj.field_c) {
              r.a(-32652, ki.field_f);
              ((ch) this).f(-80);
              te.a(true, ki.field_f);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (!kb.field_f[8]) {
            break L38;
          } else {
            int discarded$35 = 1;
            q.a();
            break L38;
          }
        }
    }

    private final void g() {
        kb.field_f[4] = true;
        int var2 = 0;
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, byte param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ch) this).setBackground(java.awt.Color.black);
        hl.field_F = ((ch) this).field_A;
        ld.a(hl.field_F, (byte) -29);
        if (param5 != 3) {
            ((ch) this).field_u = 81;
        }
        uj.a(((ch) this).field_t, ((ch) this).field_w, ((ch) this).field_p, param3, 5000, ((ch) this).field_o, ((ch) this).field_u, 5000, true, rg.field_c, param0, hl.field_F, ((ch) this).field_q, ((ch) this).field_r);
        wj.a(((ch) this).field_u, rg.field_c, hl.field_F, ((ch) this).field_q, ((ch) this).field_t, ((ch) this).field_o, param3, 101, ((ch) this).field_p);
        kf.a(false);
        int discarded$0 = 124;
        rd.field_l = lg.a();
        te.a(true, ki.field_f);
        rf.field_b = param4;
        cg.field_c = param1;
        fk.field_b = param6;
        rj.field_b = param2;
        tf.field_a = param7;
        this.o(param5 + -9168);
        int discarded$1 = -31574;
        th.d();
    }

    public static void n(int param0) {
        field_n = null;
        if (param0 != -8511) {
            ch.m(-32);
        }
        field_z = null;
        field_y = null;
    }

    private final void h() {
        kb.field_f[5] = true;
    }

    protected ch() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0;
        field_z = new byte[250][];
        field_y = new int[8192];
    }
}
