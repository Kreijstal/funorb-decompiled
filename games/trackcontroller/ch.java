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
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          var5 = TrackController.field_F ? 1 : 0;
          var2 = uk.field_c;
          if (-65 >= (var2 ^ -1)) {
            break L0;
          } else {
            if (kb.field_f[var2]) {
              var3 = 110 / ((param0 - -31) / 51);
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if (var2 == 1) {
                    rd.a(1);
                    break L1;
                  } else {
                    if ((var2 ^ -1) == -3) {
                      pl.b(-3570);
                      break L1;
                    } else {
                      if (var2 != -4) {
                        if (var2 != 4) {
                          if (-6 == var2) {
                            cb.b((byte) -107);
                            break L1;
                          } else {
                            if (6 == var2) {
                              gk.a((byte) -126);
                              break L1;
                            } else {
                              if ((var2 ^ -1) == -8) {
                                this.i(3);
                                break L1;
                              } else {
                                if (8 != var2) {
                                  if ((var2 ^ -1) == -17) {
                                    bk.j(0);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (var2 == -13) {
                                          break L2;
                                        } else {
                                          if (var2 != 13) {
                                            if (-18 == var2) {
                                              this.k(-6);
                                              break L1;
                                            } else {
                                              if (var2 != 18) {
                                                hb.a((Throwable) null, 0, "MGS1: " + jc.b(100));
                                                lj.a((byte) 119);
                                                break L1;
                                              } else {
                                                og.f((byte) -83);
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
                                      if (-13 != (var2 ^ -1)) {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        break L3;
                                      } else {
                                        stackOut_27_0 = 1;
                                        stackIn_29_0 = stackOut_27_0;
                                        break L3;
                                      }
                                    }
                                    var4 = pj.a(stackIn_29_0 != 0, 21552);
                                    qg.a(var4, true);
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
                          mf.a((byte) -53);
                          break L1;
                        }
                      } else {
                        kc.b(-107);
                        break L1;
                      }
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
        hb.a((Throwable) null, 0, "MGS2: " + jc.b(90));
        lj.a((byte) 123);
    }

    private final void p(int param0) {
        if (param0 < 110) {
            ((ch) this).field_p = 94;
        }
        kb.field_f[1] = true;
    }

    private final void a(boolean param0, int param1) {
        kb.field_f[3] = true;
        kb.field_f[param1] = true;
        kb.field_f[8] = param0;
        kb.field_f[7] = true;
        kb.field_f[0] = true;
        kb.field_f[17] = true;
        kb.field_f[16] = true;
    }

    private final void f(byte param0) {
        kb.field_f[2] = true;
        if (param0 >= -52) {
            ((ch) this).a(111, true, true, true, true);
        }
    }

    final void a(byte param0, String param1, int param2) {
        this.a(480, param2, 640, 16813, param1);
        if (param0 >= -64) {
            ch.n(-86);
        }
    }

    final int d(byte param0) {
        if (param0 < 81) {
            ((ch) this).field_q = 70;
        }
        int var2 = this.j(-80);
        if (var2 != 0) {
            // if_icmpeq L34
        } else {
            if (kb.field_f[1]) {
                ke.a(-101, 2);
            }
            if (kb.field_f[2]) {
                rf.a(3, 0);
            }
            if (kb.field_f[3]) {
                l.a(-30422, 4);
            }
            if (!(!kb.field_f[4])) {
                pa.a(5, (byte) 40);
            }
            if (kb.field_f[5]) {
                gb.a(4, 6);
            }
            if (kb.field_f[6]) {
                cl.a(7, 7);
            }
            if (kb.field_f[8]) {
                vb.a(-114);
            }
        }
        return var2;
    }

    private final void k(int param0) {
        int var2 = ne.field_a.h(16383);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        if (param0 != -6) {
            int discarded$0 = ((ch) this).b(true, 26);
        }
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
            this.p(113);
        }
        if (!(!param1)) {
            this.f((byte) -86);
        }
        if (!(!param4)) {
            this.g((byte) -111);
        }
        if (!(!param3)) {
            this.h((byte) 100);
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

    private final void i(int param0) {
        String var2 = aj.a((byte) 107);
        kc.a(gd.b((byte) 77), 1263, var2);
        if (param0 != 3) {
            ((ch) this).a(false, -56, 125, -69, 16, (byte) -87, 69, 98);
        }
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
            if (ic.a(1)) {
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
              int discarded$2 = this.a(stackIn_12_1 != 0, stackIn_12_2 != 0, stackIn_12_3 != 0);
              break L0;
            } else {
              if (-11 >= (gl.field_I ^ -1)) {
                if (!ic.a(false)) {
                  kj.d(250);
                  break L0;
                } else {
                  if (0 == rl.field_N) {
                    int discarded$3 = this.a(true, false, false);
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
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        try {
          if (((ch) this).a((byte) 60)) {
            L0: {
              if (param3 == 16813) {
                break L0;
              } else {
                ((ch) this).field_q = -89;
                break L0;
              }
            }
            L1: {
              L2: {
                ((ch) this).field_t = ((ch) this).getCodeBase().getHost();
                var6_ref = ((ch) this).field_t.toLowerCase();
                stackOut_4_0 = this;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
            L3: {
              ((ch) this).field_v = stackIn_9_1 != 0;
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
              if ((((ch) this).field_A ^ -1) > -6) {
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
            ((ch) this).a(32, param1, ((ch) this).field_q, param4, param2, param0, param3 ^ 16807);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        hb.a((Throwable) (Object) var6, param3 ^ 16813, (String) null);
        ((ch) this).a("crash", (byte) 100);
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
            int stackIn_7_0 = 0;
            int stackIn_15_0 = 0;
            boolean stackIn_15_1 = false;
            int stackIn_16_0 = 0;
            boolean stackIn_16_1 = false;
            int stackIn_17_0 = 0;
            boolean stackIn_17_1 = false;
            int stackIn_17_2 = 0;
            int stackIn_47_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_14_0 = 0;
            boolean stackOut_14_1 = false;
            int stackOut_16_0 = 0;
            boolean stackOut_16_1 = false;
            int stackOut_16_2 = 0;
            int stackOut_15_0 = 0;
            boolean stackOut_15_1 = false;
            int stackOut_15_2 = 0;
            int stackOut_46_0 = 0;
            int stackOut_45_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = TrackController.field_F ? 1 : 0;
                        var4 = lf.a(hl.field_F, ee.field_c, (byte) 95, param2);
                        if (-1 == var4) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 3: {
                        if (-2 != var4) {
                            statePc = 13;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (param0) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        stackOut_5_0 = 1;
                        stackIn_7_0 = stackOut_5_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 6: {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var5_int = ta.a(ab.a(stackIn_7_0 != 0), (byte) -49, th.f(93));
                        if ((var5_int ^ -1) != 0) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ed.a(ca.field_a, var5_int, fi.field_t, (byte) 105);
                        fi.field_t = null;
                        ca.field_a = null;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        var11 = el.j(2);
                        if (var11 != null) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        ld.a(var11.booleanValue(), true);
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (var4 != 2) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = ((ch) this).field_B;
                        stackOut_14_1 = sf.j(-4409);
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_16_1 = stackOut_14_1;
                        stackIn_15_0 = stackOut_14_0;
                        stackIn_15_1 = stackOut_14_1;
                        if (param0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = stackIn_15_0;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = stackIn_16_0;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        var5_int = ba.a(stackIn_17_0, stackIn_17_1, qk.b(stackIn_17_2 != 0), re.c(6), l.h(0), gj.a((byte) -119), 0);
                        if ((var5_int ^ -1) == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        gl.a(fi.field_t, ca.field_a, var5_int, (byte) 113);
                        fi.field_t = null;
                        ca.field_a = null;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if ((var4 ^ -1) == -4) {
                            statePc = 21;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (-1 == gj.field_c) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (gj.field_c != 0) {
                            statePc = 24;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        gj.field_c = -1;
                        jb.a(true);
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (!param1) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        li.field_i = false;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 27: {
                        var5_int = da.a(((ch) this).field_v, false, l.h(0), qk.b(false), 113, ((ch) this).field_B);
                        if (0 == (var5_int ^ -1)) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (var5_int != 0) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        fi.field_p = nl.field_e;
                        ri.e(-45);
                        rl.field_N = 10;
                        ge.field_D = false;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 30: {
                        af.a(-114, var5_int, fi.field_t);
                        fi.field_t = null;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if ((var4 ^ -1) == -5) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (oc.field_i) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        ge.field_D = true;
                        rl.field_N = 10;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 35: {
                        we.a(0, gd.b((byte) 77));
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (5 == var4) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        af.a(gd.b((byte) 77), (byte) -9);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if ((var4 ^ -1) != -7) {
                            statePc = 43;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        if (bc.field_d) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        rl.field_N = 10;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if ((var4 ^ -1) != -8) {
                            statePc = 48;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        if (param0) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 46: {
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        qh.a(stackIn_47_0 != 0, gd.b((byte) 77));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (var4 == -9) {
                            statePc = 50;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        we.a(0, gd.b((byte) 77));
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (-10 == var4) {
                            statePc = 53;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        ma.a(-9969, gd.b((byte) 77));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (var4 == 10) {
                            statePc = 56;
                        } else {
                            statePc = 57;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        ra.field_C.c(17, 7);
                        statePc = 57;
                        continue stateLoop;
                    }
                    case 57: {
                        if ((var4 ^ -1) == -12) {
                            statePc = 59;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 59: {
                        q.a(gd.b((byte) 77), -1);
                        statePc = 60;
                        continue stateLoop;
                    }
                    case 60: {
                        if ((var4 ^ -1) == -13) {
                            statePc = 62;
                        } else {
                            statePc = 63;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        gk.a(vk.b(true), gd.b((byte) 77), -104);
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (13 == var4) {
                            statePc = 65;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 65: {
                        try {
                            if (null != he.field_c) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            he.field_c = new ej(rg.field_c, new java.net.URL(((ch) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (!he.field_c.a((byte) 77)) {
                                statePc = 74;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var12 = he.field_c.a(-5);
                            if (var12 == null) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var7 = ka.a(0, -129, var12.field_j, var12.field_k);
                            kd.a(var7, (byte) 92);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var9 = null;
                            kd.a((String) null, (byte) 110);
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            he.field_c = null;
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 73;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        var5 = (Exception) (Object) caughtException;
                        hb.a((Throwable) (Object) var5, 0, "S1");
                        var10 = null;
                        kd.a((String) null, (byte) 42);
                        he.field_c = null;
                        statePc = 74;
                        continue stateLoop;
                    }
                    case 74: {
                        if (param0) {
                            statePc = 76;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        ((ch) this).e((byte) -20);
                        statePc = 76;
                        continue stateLoop;
                    }
                    case 76: {
                        if (var4 != 15) {
                            statePc = 78;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    }
                    case 77: {
                        rl.field_N = 10;
                        statePc = 78;
                        continue stateLoop;
                    }
                    case 78: {
                        if (-17 != (var4 ^ -1)) {
                            statePc = 80;
                        } else {
                            statePc = 79;
                        }
                        continue stateLoop;
                    }
                    case 79: {
                        return 1;
                    }
                    case 80: {
                        if (17 == var4) {
                            statePc = 82;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        return 0;
                    }
                    case 82: {
                        return 2;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int j(int param0) {
        int var2 = 0;
        if (((ch) this).field_e) {
          return -1;
        } else {
          if (!fc.c(96)) {
            return -1;
          } else {
            if (li.field_i) {
              return -1;
            } else {
              var2 = da.a(((ch) this).field_v, true, l.h(0), qk.b(false), 78, ((ch) this).field_B);
              if (var2 == 0) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    if (rl.field_N == 11) {
                      if (-1 == gj.field_c) {
                        ri.e(-128);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      if (rl.field_N == 11) {
                        if (-1 == gj.field_c) {
                          ri.e(-128);
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if (rl.field_N == 11) {
                      if (-1 == gj.field_c) {
                        ri.e(-128);
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
        java.awt.Container var4_ref = null;
        int var4 = 0;
        java.awt.Dimension var5 = null;
        int var6 = 0;
        int stackIn_24_0 = 0;
        String stackIn_109_0 = null;
        String stackIn_110_0 = null;
        String stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        String stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        String stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        String stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int stackIn_145_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_108_0 = null;
        String stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        String stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        String stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        String stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        String stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int stackOut_144_0 = 0;
        int stackOut_143_0 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          var3 = 110 % ((param0 - -46) / 32);
          if (tk.field_u == null) {
            break L0;
          } else {
            L1: {
              if (og.field_rb == null) {
                var4_ref = be.c((byte) -128);
                var5 = var4_ref.getSize();
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
          ob.h(16473);
          of.c((byte) 66);
          if (ga.a(-107)) {
            break L2;
          } else {
            if (rl.field_N != 11) {
              vd.k(123);
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
          if (!gh.a(3100)) {
            break L4;
          } else {
            L5: {
              var4 = il.c(-14496) * 1200;
              if (((ch) this).field_s) {
                break L5;
              } else {
                if (mg.a((byte) -29) <= var4) {
                  break L4;
                } else {
                  if (uk.a(0) <= var4) {
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
            dk.a(9888);
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
          var4 = stackIn_24_0;
          gj.field_c = nl.b((byte) 104);
          if (var4 != 0) {
            L9: {
              if (gj.field_c == 0) {
                if (-12 == (rl.field_N ^ -1)) {
                  if (!fc.c(76)) {
                    ri.e(-96);
                    break L9;
                  } else {
                    if (gj.field_c == 0) {
                      break L6;
                    } else {
                      if (-1 == gj.field_c) {
                        break L6;
                      } else {
                        rk.field_eb = 15000L + qg.a(false);
                        break L6;
                      }
                    }
                  }
                } else {
                  if (gj.field_c == 0) {
                    break L6;
                  } else {
                    if (-1 == gj.field_c) {
                      break L6;
                    } else {
                      rk.field_eb = 15000L + qg.a(false);
                      break L6;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            if (gj.field_c == 0) {
              break L6;
            } else {
              if (-1 == gj.field_c) {
                break L6;
              } else {
                rk.field_eb = 15000L + qg.a(false);
                break L6;
              }
            }
          } else {
            if (gj.field_c == 0) {
              break L6;
            } else {
              if (-1 == gj.field_c) {
                break L6;
              } else {
                rk.field_eb = 15000L + qg.a(false);
                break L6;
              }
            }
          }
        }
        L10: {
          if (gj.field_c == -1) {
            break L10;
          } else {
            if (gj.field_c != -1) {
              if (gl.field_I >= 10) {
                if (-11 < rl.field_N) {
                  break L10;
                } else {
                  L11: {
                    hh.a(-28717);
                    if (-4 != gj.field_c) {
                      if (-5 != (gj.field_c ^ -1)) {
                        if (2 != gj.field_c) {
                          if ((gj.field_c ^ -1) != -6) {
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
                  if (-5 == gj.field_c) {
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
              if ((gj.field_c ^ -1) == 0) {
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
          if ((rk.field_eb ^ -1L) >= (qg.a(false) ^ -1L)) {
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
          if (-1 != (gj.field_c ^ -1)) {
            if (gl.field_I != -1) {
              break L15;
            } else {
              if (!dd.c((byte) 55)) {
                break L15;
              } else {
                gl.field_I = 1;
                break L15;
              }
            }
          } else {
            if (gl.field_I != -1) {
              break L15;
            } else {
              if (!dd.c((byte) 55)) {
                break L15;
              } else {
                gl.field_I = 1;
                break L15;
              }
            }
          }
        }
        L16: {
          if (-2 != gl.field_I) {
            break L16;
          } else {
            L17: {
              if (hl.field_F != 0) {
                ff.field_b = mf.a(tf.field_a, (byte) -70);
                break L17;
              } else {
                break L17;
              }
            }
            ei.field_i = vh.a(cg.field_c, 98, false, 1, true);
            ha.field_x = vh.a(rf.field_b, 98, false, 1, true);
            ok.field_G = vh.a(fk.field_b, 98, false, 1, true);
            fb.field_b = ha.field_x;
            el.field_L = ei.field_i;
            gl.field_I = 2;
            break L16;
          }
        }
        L18: {
          if (gl.field_I == 2) {
            L19: {
              if (null == ff.field_b) {
                break L19;
              } else {
                if (!ff.field_b.c(-25)) {
                  break L19;
                } else {
                  if (ff.field_b.a("", (byte) -125)) {
                    if (!ff.field_b.b("", (byte) -3)) {
                      break L19;
                    } else {
                      sf.a((byte) -114, ff.field_b);
                      ff.field_b = null;
                      qi.d(83);
                      break L19;
                    }
                  } else {
                    ff.field_b = null;
                    break L19;
                  }
                }
              }
            }
            if (ff.field_b == null) {
              gl.field_I = 3;
              break L18;
            } else {
              break L18;
            }
          } else {
            break L18;
          }
        }
        L20: {
          if ((gl.field_I ^ -1) == -4) {
            if (!l.a(ei.field_i, ha.field_x, (byte) -112, ok.field_G)) {
              break L20;
            } else {
              if (rc.a(-25, ok.field_G)) {
                L21: {
                  L22: {
                    nj.b((byte) -98);
                    sl.b((byte) -51);
                    qi.field_k = gj.field_a;
                    bc.field_d = false;
                    oe.a(oc.field_i, ei.field_i, ha.field_x, ok.field_G, -28484);
                    if (dg.field_B) {
                      break L22;
                    } else {
                      if (null == sk.field_h) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    stackOut_108_0 = sk.field_h;
                    stackIn_110_0 = stackOut_108_0;
                    stackIn_109_0 = stackOut_108_0;
                    if (dg.field_B) {
                      stackOut_110_0 = (String) (Object) stackIn_110_0;
                      stackOut_110_1 = 0;
                      stackIn_111_0 = stackOut_110_0;
                      stackIn_111_1 = stackOut_110_1;
                      break L23;
                    } else {
                      stackOut_109_0 = (String) (Object) stackIn_109_0;
                      stackOut_109_1 = 1;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_111_1 = stackOut_109_1;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_111_0 = (String) (Object) stackIn_111_0;
                    stackOut_111_1 = stackIn_111_1;
                    stackIn_113_0 = stackOut_111_0;
                    stackIn_113_1 = stackOut_111_1;
                    stackIn_112_0 = stackOut_111_0;
                    stackIn_112_1 = stackOut_111_1;
                    if (dg.field_B) {
                      stackOut_113_0 = (String) (Object) stackIn_113_0;
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = 0;
                      stackIn_114_0 = stackOut_113_0;
                      stackIn_114_1 = stackOut_113_1;
                      stackIn_114_2 = stackOut_113_2;
                      break L24;
                    } else {
                      stackOut_112_0 = (String) (Object) stackIn_112_0;
                      stackOut_112_1 = stackIn_112_1;
                      stackOut_112_2 = 1;
                      stackIn_114_0 = stackOut_112_0;
                      stackIn_114_1 = stackOut_112_1;
                      stackIn_114_2 = stackOut_112_2;
                      break L24;
                    }
                  }
                  jb.a(stackIn_114_0, stackIn_114_1 != 0, stackIn_114_2 != 0, 0);
                  break L21;
                }
                L25: {
                  if (!jb.field_a) {
                    break L25;
                  } else {
                    kf.a(4);
                    break L25;
                  }
                }
                L26: {
                  if (null == ni.field_n) {
                    ni.field_n = wd.q(11782);
                    uh.field_e = r.e(-12364);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                ok.a(ni.field_n, uh.field_e, (byte) 52, ok.field_G);
                ok.field_G = null;
                ha.field_x = null;
                ei.field_i = null;
                rh.a((java.applet.Applet) this, (byte) 33);
                qi.d(-80);
                gl.field_I = 10;
                break L20;
              } else {
                break L20;
              }
            }
          } else {
            break L20;
          }
        }
        L27: {
          if (10 == gl.field_I) {
            L28: {
              if (hl.field_F != 0) {
                ed.field_I = mf.a(rj.field_b, (byte) -74);
                break L28;
              } else {
                break L28;
              }
            }
            gl.field_I = 11;
            break L27;
          } else {
            break L27;
          }
        }
        L29: {
          if (gl.field_I == 11) {
            L30: {
              if (null == ed.field_I) {
                break L30;
              } else {
                L31: {
                  if (!ed.field_I.c(-47)) {
                    break L31;
                  } else {
                    if (!ed.field_I.a((byte) 48)) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                ud.a(128, 0.0f, ug.a(pc.field_t, ed.field_I, 2147483647, jb.field_c));
                break L29;
              }
            }
            ag.field_e = true;
            gl.field_I = 12;
            break L29;
          } else {
            break L29;
          }
        }
        L32: {
          if (-13 != (gl.field_I ^ -1)) {
            break L32;
          } else {
            if (!ag.field_e) {
              gl.field_I = 13;
              break L32;
            } else {
              break L32;
            }
          }
        }
        L33: {
          if (13 == gl.field_I) {
            L34: {
              var4 = 1;
              if (wj.field_b == null) {
                break L34;
              } else {
                L35: {
                  if (!wj.field_b.a(true)) {
                    stackOut_144_0 = 0;
                    stackIn_145_0 = stackOut_144_0;
                    break L35;
                  } else {
                    stackOut_143_0 = 1;
                    stackIn_145_0 = stackOut_143_0;
                    break L35;
                  }
                }
                var4 = stackIn_145_0;
                ud.a(128, wj.field_b.field_i, wj.field_b.field_a);
                break L34;
              }
            }
            if (var4 != 0) {
              gl.field_I = 20;
              break L33;
            } else {
              break L33;
            }
          } else {
            break L33;
          }
        }
        L36: {
          if (param1) {
            break L36;
          } else {
            if (mj.field_c) {
              r.a(-32652, ki.field_f);
              ((ch) this).f(-80);
              te.a(true, ki.field_f);
              break L36;
            } else {
              break L36;
            }
          }
        }
        L37: {
          if (!kb.field_f[8]) {
            break L37;
          } else {
            q.a(true);
            break L37;
          }
        }
    }

    private final void g(byte param0) {
        kb.field_f[4] = true;
        int var2 = 37 % ((-49 - param0) / 56);
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
        rd.field_l = lg.a(124);
        te.a(true, ki.field_f);
        rf.field_b = param4;
        cg.field_c = param1;
        fk.field_b = param6;
        rj.field_b = param2;
        tf.field_a = param7;
        this.o(param5 + -9168);
        th.d(-31574);
    }

    public static void n(int param0) {
        field_n = null;
        if (param0 != -8511) {
            ch.m(-32);
        }
        field_z = null;
        field_y = null;
    }

    private final void h(byte param0) {
        kb.field_f[5] = true;
        if (param0 < 94) {
            ((ch) this).field_t = null;
        }
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
