/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ab extends dh {
    static String field_q;
    private int field_C;
    static int[] field_A;
    private int field_y;
    private boolean field_n;
    static int[][] field_s;
    private int field_r;
    private int field_v;
    static String field_p;
    private boolean field_o;
    String field_x;
    private boolean field_B;
    static boolean field_t;
    private long field_w;
    private int field_m;
    static boolean field_u;
    private int field_z;

    private final void h(int param0) {
        ef.field_c[param0] = true;
    }

    private final void i(int param0) {
        ef.field_c[1] = true;
        if (param0 != -13072) {
            ((ab) this).field_x = null;
        }
    }

    final void c(boolean param0) {
        int var3 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        L0: {
          var3 = SolKnight.field_L ? 1 : 0;
          if (!bb.h(42)) {
            if ((kj.field_R ^ -1) <= -11) {
              if (!uk.h(250)) {
                rb.c(-27347);
                break L0;
              } else {
                if (0 == fj.field_i) {
                  int discarded$54 = this.a(false, false, 121);
                  break L0;
                } else {
                  ta.a((byte) 119, cl.field_n);
                  break L0;
                }
              }
            } else {
              break L0;
            }
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (dj.field_k == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            int discarded$55 = this.a(stackIn_4_1 != 0, false, 106);
            break L0;
          }
        }
        L2: {
          if (param0) {
            break L2;
          } else {
            this.c(false, false);
            break L2;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        String var11 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (!((ab) this).c(76)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        ((ab) this).field_x = ((ab) this).getCodeBase().getHost();
                        var11 = ((ab) this).field_x.toLowerCase();
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (var11.equals((Object) (Object) "jagex.com")) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (!var11.endsWith(".jagex.com")) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        stackIn_8_1 = stackOut_6_1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((ab) this).field_o = stackIn_8_1 != 0;
                        ((ab) this).field_y = Integer.parseInt(((ab) this).getParameter("gameport1"));
                        ((ab) this).field_m = Integer.parseInt(((ab) this).getParameter("gameport2"));
                        var7 = ((ab) this).getParameter("servernum");
                        if (var7 != null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        ((ab) this).field_z = Integer.parseInt(var7);
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        ((ab) this).field_C = Integer.parseInt(((ab) this).getParameter("gamecrc"));
                        ((ab) this).field_w = Long.parseLong(((ab) this).getParameter("instanceid"));
                        ((ab) this).field_n = ((ab) this).getParameter("member").equals((Object) (Object) "yes");
                        var8 = ((ab) this).getParameter("lang");
                        if (var8 != null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        ((ab) this).field_v = Integer.parseInt(var8);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (((ab) this).field_v >= 5) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        ((ab) this).field_v = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var9 = ((ab) this).getParameter("affid");
                        if (var9 != null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ((ab) this).field_r = Integer.parseInt(var9);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        ml.field_g = Boolean.valueOf(((ab) this).getParameter("simplemode")).booleanValue();
                        ((ab) this).a((byte) 80, param4, param1, 32, param0, param2, ((ab) this).field_C);
                        if (param3 == -14) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        this.k(107);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var6 = (Exception) (Object) caughtException;
                    var10 = null;
                    hi.a((Throwable) (Object) var6, (String) null, 1);
                    ((ab) this).a("crash", param3 ^ 13);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static da a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
            bi var6 = null;
            IOException var6_ref = null;
            bi var7 = null;
            lg var8 = null;
            da stackIn_16_0 = null;
            Throwable decompiledCaughtException = null;
            da stackOut_15_0 = null;
            try {
              L0: {
                var6 = null;
                var7 = null;
                if (null == n.field_a.field_c) {
                  break L0;
                } else {
                  hc.field_c = new hb(n.field_a.field_c, 5200, 0);
                  n.field_a.field_c = null;
                  var6 = new bi(255, hc.field_c, new hb(n.field_a.field_s, 12000, 0), 2097152);
                  break L0;
                }
              }
              L1: {
                if (hc.field_c != null) {
                  L2: {
                    if (null != tk.field_p) {
                      break L2;
                    } else {
                      tk.field_p = new hb[n.field_a.field_v.length];
                      break L2;
                    }
                  }
                  L3: {
                    if (tk.field_p[param1] == null) {
                      tk.field_p[param1] = new hb(n.field_a.field_v[param1], 12000, 0);
                      n.field_a.field_v[param1] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var7 = new bi(param1, hc.field_c, tk.field_p[param1], 2097152);
                  break L1;
                } else {
                  break L1;
                }
              }
              L4: {
                var8 = d.field_b.a(-65, var7, param3, var6, param1);
                if (param5) {
                  var8.a((byte) 0);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                if (param0 == 2097152) {
                  break L5;
                } else {
                  field_A = null;
                  break L5;
                }
              }
              stackOut_15_0 = new da((wd) (Object) var8, param4, param2);
              stackIn_16_0 = stackOut_15_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_16_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final int g(int param0) {
        if (param0 != 0) {
            return -59;
        }
        int var2 = this.j(-1);
        if (var2 != 0) {
            // if_icmpne L154
        }
        if (!(!ef.field_c[1])) {
            gh.a(2, 9543);
        }
        if (ef.field_c[2]) {
            jg.a(3, (byte) -100);
        }
        if (ef.field_c[3]) {
            hi.a(4, -5887);
        }
        if (!(!ef.field_c[4])) {
            ik.a(5, 18897);
        }
        if (ef.field_c[5]) {
            ci.a((byte) -77, 6);
        }
        if (!(!ef.field_c[6])) {
            db.b(36951, 7);
        }
        if (!(!ef.field_c[8])) {
            ff.a((byte) -89);
        }
        return var2;
    }

    final void d(boolean param0) {
        int var2 = 0;
        hf var3 = null;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var4 = SolKnight.field_L ? 1 : 0;
          var2 = ob.field_h;
          if (64 <= var2) {
            break L0;
          } else {
            if (ef.field_c[var2]) {
              if (var2 == 0) {
                return;
              } else {
                L1: {
                  if (var2 != -2) {
                    if (-3 != var2) {
                      if (var2 == -4) {
                        db.f(0);
                        break L1;
                      } else {
                        if (-5 == var2) {
                          oa.c(1811357826);
                          break L1;
                        } else {
                          if ((var2 ^ -1) != -6) {
                            if ((var2 ^ -1) == -7) {
                              td.a(-126);
                              break L1;
                            } else {
                              if (var2 != 7) {
                                if ((var2 ^ -1) == -9) {
                                  af.a(wh.field_c, (gb) (Object) te.field_N, (byte) -110, te.field_O);
                                  break L1;
                                } else {
                                  if (var2 == -17) {
                                    ki.a(-106);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (-12 == var2) {
                                        break L2;
                                      } else {
                                        if (12 == var2) {
                                          break L2;
                                        } else {
                                          if ((var2 ^ -1) == -14) {
                                            li.d(117);
                                            break L1;
                                          } else {
                                            if (var2 != 17) {
                                              if (18 == var2) {
                                                u.a(2);
                                                break L1;
                                              } else {
                                                hi.a((Throwable) null, "MGS1: " + oc.a(false), 1);
                                                je.a(false);
                                                break L1;
                                              }
                                            } else {
                                              this.l(-73);
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_30_0 = 112;
                                      stackIn_32_0 = stackOut_30_0;
                                      stackIn_31_0 = stackOut_30_0;
                                      if (12 != var2) {
                                        stackOut_32_0 = stackIn_32_0;
                                        stackOut_32_1 = 0;
                                        stackIn_33_0 = stackOut_32_0;
                                        stackIn_33_1 = stackOut_32_1;
                                        break L3;
                                      } else {
                                        stackOut_31_0 = stackIn_31_0;
                                        stackOut_31_1 = 1;
                                        stackIn_33_0 = stackOut_31_0;
                                        stackIn_33_1 = stackOut_31_1;
                                        break L3;
                                      }
                                    }
                                    var3 = vd.a(stackIn_33_0, stackIn_33_1 != 0);
                                    al.a((byte) -70, var3);
                                    break L1;
                                  }
                                }
                              } else {
                                this.k(31156);
                                break L1;
                              }
                            }
                          } else {
                            dd.a(true);
                            break L1;
                          }
                        }
                      }
                    } else {
                      pg.c((byte) -117);
                      break L1;
                    }
                  } else {
                    le.b(873698625);
                    break L1;
                  }
                }
                L4: {
                  if (param0) {
                    break L4;
                  } else {
                    field_A = null;
                    break L4;
                  }
                }
                return;
              }
            } else {
              break L0;
            }
          }
        }
        L5: {
          hi.a((Throwable) null, "MGS2: " + oc.a(false), 1);
          if (param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L5;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L5;
          }
        }
        je.a(stackIn_6_0 != 0);
    }

    final static String a(da param0, String param1, String param2, String param3, boolean param4) {
        if (param4) {
            return null;
        }
        if (!(param0.c((byte) -121))) {
            return param2;
        }
        return param1 + " - " + param0.d(-1, param3) + "%";
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            gb var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = SolKnight.field_L ? 1 : 0;
                        var4 = ig.a(vd.field_b, cl.field_n, false, param0);
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
                        if (-2 == var4) {
                            statePc = 5;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var5_int = si.a(ua.h(0), ih.a(true), -120);
                        if (0 != (var5_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        fb.a(12239, ke.field_O, var5_int, md.field_v);
                        ke.field_O = null;
                        md.field_v = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = sf.d(-123);
                        if (var11 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        qc.a(var11.booleanValue(), -128);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (2 != var4) {
                            statePc = 15;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var5_int = gl.a(fi.a((byte) 84), 140, rg.a(0), ta.a((byte) -23), ((ab) this).field_r, sg.b(-1), lc.b(false));
                        if (-1 != var5_int) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        ff.a(var5_int, -114, ke.field_O, md.field_v);
                        ke.field_O = null;
                        md.field_v = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (-4 != (var4 ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (bf.field_e == -1) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (bf.field_e == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        bf.field_e = -1;
                        ti.a((byte) -126);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (!param1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        ee.field_i = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 21: {
                        var5_int = fc.a(rg.a(0), ((ab) this).field_r, false, ((ab) this).field_o, fi.a((byte) 84), 0);
                        if (-1 == var5_int) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (0 != var5_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        d.field_c = kc.field_P;
                        ee.f(0);
                        lh.field_l = false;
                        fj.field_i = 10;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        dd.a((byte) 83, md.field_v, var5_int);
                        md.field_v = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (-5 == var4) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (!cl.field_m) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        gd.a(-1, ia.g(84));
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        fj.field_i = 10;
                        lh.field_l = true;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (-6 != var4) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        he.a(-1, ia.g(-16));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (6 == var4) {
                            statePc = 34;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (!kk.field_c) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        fj.field_i = 10;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if ((var4 ^ -1) != -8) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        pl.a(ia.g(-41), -15071);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if ((var4 ^ -1) != -9) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        gd.a(-1, ia.g(-48));
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if ((var4 ^ -1) == -10) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        ki.a(ia.g(-92), -1);
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (var4 != 10) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        id.field_c.e(17, -2147483648);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (param2 > 69) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        return 57;
                    }
                    case 47: {
                        if (11 != var4) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        di.a(ia.g(-84), 63);
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (var4 != 12) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        kj.a(ia.g(-20), 117, te.d((byte) 18));
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (-14 == (var4 ^ -1)) {
                            statePc = 53;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        try {
                            if (null != wi.field_j) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            wi.field_j = new na(wh.field_c, new java.net.URL(((ab) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (!wi.field_j.a((byte) -106)) {
                                statePc = 62;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var12 = wi.field_j.a(true);
                            if (var12 != null) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var9 = null;
                            dh.a((String) null, false);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var7 = vd.a(var12.field_l, 0, var12.field_m, 160);
                            dh.a(var7, false);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            wi.field_j = null;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 61;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        var5 = (Exception) (Object) caughtException;
                        hi.a((Throwable) (Object) var5, "S1", 1);
                        var10 = null;
                        dh.a((String) null, false);
                        wi.field_j = null;
                        statePc = 62;
                        continue stateLoop;
                    }
                    case 62: {
                        if (15 == var4) {
                            statePc = 64;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        fj.field_i = 10;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if ((var4 ^ -1) != -17) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        return 1;
                    }
                    case 67: {
                        if ((var4 ^ -1) != -18) {
                            statePc = 69;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        return 2;
                    }
                    case 69: {
                        return 0;
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

    public static void e(byte param0) {
        field_q = null;
        if (param0 >= -7) {
            return;
        }
        field_p = null;
        field_A = null;
        field_s = null;
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ab) this).setBackground(java.awt.Color.black);
        vd.field_b = ((ab) this).field_v;
        aa.a((byte) 30, vd.field_b);
        ff.a(((ab) this).field_z, wh.field_c, param1, (byte) 110, ((ab) this).field_C, ((ab) this).field_m, ((ab) this).field_y, 5000, ((ab) this).field_x, ((ab) this).field_n, param5, 5000, vd.field_b, ((ab) this).field_w);
        sk.a(-11400, ((ab) this).field_C, ((ab) this).field_y, wh.field_c, ((ab) this).field_m, ((ab) this).field_z, param5, vd.field_b, ((ab) this).field_x);
        da.a(0);
        ah.field_d = ld.j(0);
        th.a((byte) -63, dc.field_q);
        if (!param4) {
            ((ab) this).field_m = -97;
        }
        ef.field_g = param2;
        og.field_c = param7;
        vd.field_c = param0;
        aj.field_u = param6;
        bl.field_k = param3;
        this.g((byte) 119);
        id.a(-114);
    }

    private final void f(byte param0) {
        ef.field_c[4] = true;
        if (param0 < 6) {
            int discarded$0 = ((ab) this).g(122);
        }
    }

    final void a(String param0, int param1, int param2) {
        this.a(param1, 640, 480, -14, param0);
        if (param2 != 8) {
            this.i(-48);
        }
    }

    final void a(byte param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(false, false);
        if (!(!param4)) {
            this.i(-13072);
        }
        if (param0 != -38) {
            ((ab) this).field_n = true;
        }
        if (param1) {
            this.b(false);
        }
        if (!(!param3)) {
            this.f((byte) 124);
        }
        if (!(!param2)) {
            this.h(param0 ^ -33);
        }
    }

    private final void c(boolean param0, boolean param1) {
        ef.field_c[8] = param1;
        ef.field_c[7] = true;
        if (param0) {
            return;
        }
        ef.field_c[18] = true;
        ef.field_c[17] = true;
        ef.field_c[16] = true;
        ef.field_c[3] = true;
        ef.field_c[0] = true;
    }

    private final void g(byte param0) {
        ef.field_b[18] = 1;
        ef.field_b[3] = -1;
        ef.field_b[16] = -1;
        ef.field_b[5] = -1;
        ef.field_b[11] = -1;
        ef.field_b[7] = -1;
        ef.field_b[4] = -1;
        ef.field_b[2] = -2;
        ef.field_b[9] = -1;
        ef.field_b[1] = 16;
        ef.field_b[6] = -2;
        ef.field_b[13] = -1;
        if (param0 < 64) {
            return;
        }
        ef.field_b[10] = -1;
        ef.field_b[17] = -1;
        ef.field_b[8] = -2;
        ef.field_b[12] = -1;
    }

    private final void k(int param0) {
        if (param0 != 31156) {
            this.i(80);
        }
        String var2 = bk.a(0);
        g.a(ia.g(-22), var2, -3603);
    }

    final int b(boolean param0, boolean param1) {
        if (param0) {
            return 74;
        }
        return this.a(param1, true, 120);
    }

    private final void b(boolean param0) {
        if (param0) {
            return;
        }
        ef.field_c[2] = true;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var5 = 0;
        int stackIn_24_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_137_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_136_0 = 0;
        int stackOut_135_0 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          if (null == fc.field_l) {
            mf.f(-11214);
            jh.b(param0 ^ -405);
            if (bl.a((byte) -81)) {
              break L0;
            } else {
              if (11 == fj.field_i) {
                break L0;
              } else {
                lj.e(false);
                break L0;
              }
            }
          } else {
            mf.f(-11214);
            jh.b(param0 ^ -405);
            if (bl.a((byte) -81)) {
              break L0;
            } else {
              if (11 == fj.field_i) {
                break L0;
              } else {
                lj.e(false);
                break L0;
              }
            }
          }
        }
        L1: {
          if (null != ah.field_d) {
            cl.field_n = ah.field_d.a(9408);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (wf.c((byte) -63)) {
            L3: {
              var3 = 1200 * l.a((byte) 99);
              if (((ab) this).field_B) {
                break L3;
              } else {
                if (var3 >= wk.b(param0 ^ -3)) {
                  break L2;
                } else {
                  if (de.a(-122) <= var3) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            ((ab) this).field_B = false;
            je.a(false);
            sf.b(false);
            dd.a((byte) 27, el.field_k, 2);
            pk.d(true);
            ee.field_i = true;
            kj.field_I = 15000L + je.a(1);
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          L5: {
            if (bf.field_e == -1) {
              break L5;
            } else {
              if (bf.field_e != 0) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if (bf.field_e != -1) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L6;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L6;
            }
          }
          var3 = stackIn_24_0;
          bf.field_e = ke.a((byte) 107);
          if (var3 != 0) {
            if (0 == bf.field_e) {
              break L4;
            } else {
              if (bf.field_e == -1) {
                break L4;
              } else {
                kj.field_I = 15000L + je.a(1);
                break L4;
              }
            }
          } else {
            if (0 == bf.field_e) {
              break L4;
            } else {
              if (bf.field_e == -1) {
                break L4;
              } else {
                kj.field_I = 15000L + je.a(1);
                break L4;
              }
            }
          }
        }
        L7: {
          if (0 == bf.field_e) {
            break L7;
          } else {
            if (bf.field_e != 0) {
              if (kj.field_R < 10) {
                if (bf.field_e == -4) {
                  ((ab) this).a("js5crc", -1);
                  break L7;
                } else {
                  if (-5 == bf.field_e) {
                    ((ab) this).a("js5io", param0 ^ 2);
                    break L7;
                  } else {
                    if (bf.field_e == 2) {
                      ((ab) this).a("js5connect_full", -1);
                      break L7;
                    } else {
                      if (-6 != (bf.field_e ^ -1)) {
                        ((ab) this).a("js5connect", -1);
                        break L7;
                      } else {
                        ((ab) this).a("outofdate", -1);
                        break L7;
                      }
                    }
                  }
                }
              } else {
                if (10 <= fj.field_i) {
                  L8: {
                    sf.b(false);
                    if (bf.field_e != 3) {
                      if (bf.field_e != 4) {
                        if ((bf.field_e ^ -1) != -3) {
                          if (5 == bf.field_e) {
                            dd.a((byte) -115, jl.field_c, 5);
                            break L8;
                          } else {
                            dd.a((byte) 57, cd.field_c, 256);
                            break L8;
                          }
                        } else {
                          dd.a((byte) 51, eb.field_c, 256);
                          break L8;
                        }
                      } else {
                        dd.a((byte) 89, el.field_m, 256);
                        break L8;
                      }
                    } else {
                      dd.a((byte) 115, bl.field_m, 256);
                      break L8;
                    }
                  }
                  ee.field_i = true;
                  break L7;
                } else {
                  break L7;
                }
              }
            } else {
              break L7;
            }
          }
        }
        L9: {
          L10: {
            L11: {
              if ((bf.field_e ^ -1) == 0) {
                break L11;
              } else {
                if (0 != bf.field_e) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            if (!qc.a(34)) {
              break L9;
            } else {
              break L10;
            }
          }
          if ((kj.field_I ^ -1L) < (je.a(1) ^ -1L)) {
            break L9;
          } else {
            ee.field_i = false;
            if ((bf.field_e ^ -1) == 0) {
              break L9;
            } else {
              if (bf.field_e == 0) {
                break L9;
              } else {
                bf.field_e = -1;
                ti.a((byte) 77);
                break L9;
              }
            }
          }
        }
        L12: {
          if (bf.field_e != 0) {
            break L12;
          } else {
            if (qc.a(34)) {
              break L12;
            } else {
              ib.field_o = false;
              break L12;
            }
          }
        }
        L13: {
          if (kj.field_R != 0) {
            break L13;
          } else {
            if (!tk.c(false)) {
              break L13;
            } else {
              kj.field_R = 1;
              break L13;
            }
          }
        }
        L14: {
          if (-2 != (kj.field_R ^ -1)) {
            break L14;
          } else {
            L15: {
              if (vd.field_b != 0) {
                af.field_c = r.a(og.field_c, 82);
                break L15;
              } else {
                break L15;
              }
            }
            lh.field_o = pj.a(vd.field_c, (byte) -30, 1, false, true);
            wk.field_c = pj.a(ef.field_g, (byte) -126, 1, false, true);
            jk.field_ub = pj.a(aj.field_u, (byte) 52, 1, false, true);
            pl.field_d = lh.field_o;
            ai.field_b = wk.field_c;
            kj.field_R = 2;
            break L14;
          }
        }
        L16: {
          if (kj.field_R == 2) {
            L17: {
              if (af.field_c != null) {
                if (af.field_c.c((byte) -121)) {
                  if (!af.field_c.b(param0 + -95, "")) {
                    af.field_c = null;
                    break L17;
                  } else {
                    if (af.field_c.a(2, "")) {
                      lj.a(26708, af.field_c);
                      af.field_c = null;
                      mh.a(8192);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                } else {
                  break L17;
                }
              } else {
                break L17;
              }
            }
            if (null != af.field_c) {
              break L16;
            } else {
              kj.field_R = 3;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L18: {
          if (3 != kj.field_R) {
            break L18;
          } else {
            if (!pj.a(wk.field_c, -16925, lh.field_o, jk.field_ub)) {
              break L18;
            } else {
              if (td.a(-3, jk.field_ub)) {
                L19: {
                  L20: {
                    cb.b(32);
                    kg.a(-15617);
                    pe.field_m = te.field_J;
                    kk.field_c = false;
                    d.a(wk.field_c, cl.field_m, (byte) -110, jk.field_ub, lh.field_o);
                    if (bl.field_p) {
                      break L20;
                    } else {
                      if (null == s.field_hb) {
                        break L19;
                      } else {
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (bl.field_p) {
                      stackOut_99_0 = 0;
                      stackIn_100_0 = stackOut_99_0;
                      break L21;
                    } else {
                      stackOut_98_0 = 1;
                      stackIn_100_0 = stackOut_98_0;
                      break L21;
                    }
                  }
                  L22: {
                    stackOut_100_0 = stackIn_100_0;
                    stackOut_100_1 = param0 + 17075;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_102_1 = stackOut_100_1;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    if (bl.field_p) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      stackIn_103_2 = stackOut_102_2;
                      break L22;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = stackIn_101_1;
                      stackOut_101_2 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      stackIn_103_2 = stackOut_101_2;
                      break L22;
                    }
                  }
                  hf.a(stackIn_103_0 != 0, stackIn_103_1, stackIn_103_2 != 0, s.field_hb);
                  break L19;
                }
                L23: {
                  if (ml.field_g) {
                    qk.f(4);
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (ce.field_c == null) {
                    ce.field_c = rh.a(0);
                    qh.field_c = jk.i((byte) 123);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                r.a(jk.field_ub, qh.field_c, param0 ^ -4, ce.field_c);
                wk.field_c = null;
                jk.field_ub = null;
                lh.field_o = null;
                de.a((java.applet.Applet) this, param0 + 3);
                mh.a(8192);
                kj.field_R = 10;
                break L18;
              } else {
                break L18;
              }
            }
          }
        }
        L25: {
          if (param0 == -3) {
            break L25;
          } else {
            ((ab) this).field_z = 90;
            break L25;
          }
        }
        L26: {
          if (10 == kj.field_R) {
            L27: {
              if (vd.field_b != 0) {
                wc.field_b = r.a(bl.field_k, 117);
                break L27;
              } else {
                break L27;
              }
            }
            kj.field_R = 11;
            break L26;
          } else {
            break L26;
          }
        }
        L28: {
          if (kj.field_R != 11) {
            break L28;
          } else {
            L29: {
              if (null == wc.field_b) {
                break L29;
              } else {
                L30: {
                  if (!wc.field_b.c((byte) -121)) {
                    break L30;
                  } else {
                    if (!wc.field_b.b(true)) {
                      break L30;
                    } else {
                      break L29;
                    }
                  }
                }
                a.a((byte) 102, ve.a(uf.field_r, wa.field_a, wc.field_b, (byte) -94), 0.0f);
                break L28;
              }
            }
            pd.field_c = true;
            kj.field_R = 12;
            break L28;
          }
        }
        L31: {
          if (12 == kj.field_R) {
            if (!pd.field_c) {
              kj.field_R = 13;
              break L31;
            } else {
              break L31;
            }
          } else {
            break L31;
          }
        }
        L32: {
          if (-14 == (kj.field_R ^ -1)) {
            L33: {
              var3 = 1;
              if (null == ng.field_a) {
                break L33;
              } else {
                L34: {
                  if (!ng.field_a.a((byte) 125)) {
                    stackOut_136_0 = 0;
                    stackIn_137_0 = stackOut_136_0;
                    break L34;
                  } else {
                    stackOut_135_0 = 1;
                    stackIn_137_0 = stackOut_135_0;
                    break L34;
                  }
                }
                var3 = stackIn_137_0;
                a.a((byte) 102, ng.field_a.field_a, ng.field_a.field_c);
                break L33;
              }
            }
            if (var3 == 0) {
              break L32;
            } else {
              kj.field_R = 20;
              break L32;
            }
          } else {
            break L32;
          }
        }
        L35: {
          if (param1) {
            break L35;
          } else {
            if (!jd.field_p) {
              break L35;
            } else {
              nc.a((byte) 86, dc.field_q);
              ((ab) this).a(true);
              th.a((byte) -69, dc.field_q);
              break L35;
            }
          }
        }
        L36: {
          if (ef.field_c[8]) {
            wd.b(param0 + 11);
            break L36;
          } else {
            break L36;
          }
        }
    }

    final static uh a(jd param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        uh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SolKnight.field_L ? 1 : 0;
        var2 = param0.d((byte) 48, 8);
        if (-1 <= (var2 ^ -1)) {
          if (param1 == -14945) {
            L0: {
              var3 = wa.a(param0, (byte) -119) ? 1 : 0;
              var4 = wa.a(param0, (byte) -114) ? 1 : 0;
              var5 = new uh();
              var5.field_y = (short)param0.d((byte) 48, 16);
              var5.field_n = pj.a(param1 ^ 14944, param0, 16, var5.field_n);
              var5.field_q = pj.a(-1, param0, 16, var5.field_q);
              var5.field_z = pj.a(-1, param0, 16, var5.field_z);
              var5.field_F = (short)param0.d((byte) 48, 16);
              var5.field_K = pj.a(-1, param0, 16, var5.field_K);
              var5.field_o = pj.a(-1, param0, 16, var5.field_o);
              var5.field_w = pj.a(-1, param0, 16, var5.field_w);
              if (var3 != 0) {
                var5.field_b = (short)param0.d((byte) 48, 16);
                var5.field_B = pj.a(-1, param0, 16, var5.field_B);
                var5.field_v = pj.a(-1, param0, 16, var5.field_v);
                var5.field_J = pj.a(-1, param0, 16, var5.field_J);
                var5.field_D = pj.a(param1 + 14944, param0, 16, var5.field_D);
                var5.field_C = pj.a(-1, param0, 16, var5.field_C);
                var5.field_g = pj.a(-1, param0, 16, var5.field_g);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (var4 == 0) {
                break L1;
              } else {
                int discarded$1 = param0.d((byte) 48, 16);
                var5.field_c = pj.a(param1 + 14944, param0, 16, var5.field_c);
                var5.field_H = pj.a(param1 + 14944, param0, 16, var5.field_H);
                var5.field_A = pj.a(-1, param0, 16, var5.field_A);
                var5.field_a = pj.a(param1 ^ 14944, param0, 16, var5.field_a);
                var5.field_e = pj.a(param1 + 14944, param0, 16, var5.field_e);
                break L1;
              }
            }
            L2: {
              if (!wa.a(param0, (byte) -121)) {
                break L2;
              } else {
                var5.field_s = pj.a(-1, param0, 16, var5.field_s);
                break L2;
              }
            }
            L3: {
              if (!wa.a(param0, (byte) -127)) {
                break L3;
              } else {
                var5.field_k = be.a((byte) 63, var5.field_k, param0, 16);
                var6 = 0;
                var7 = 0;
                L4: while (true) {
                  if (var5.field_k.length <= var7) {
                    if (0 != var6) {
                      var5.field_j = (byte)(1 + var6);
                      break L3;
                    } else {
                      var5.field_k = null;
                      break L3;
                    }
                  } else {
                    if (var6 < (var5.field_k[var7] & 255)) {
                      var6 = var5.field_k[var7] & 255;
                      var7++;
                      continue L4;
                    } else {
                      var7++;
                      continue L4;
                    }
                  }
                }
              }
            }
            return var5;
          } else {
            return null;
          }
        } else {
          throw new IllegalStateException("" + var2);
        }
    }

    private final int j(int param0) {
        if (!(!((ab) this).field_c)) {
            return -1;
        }
        if (!qc.a(param0 + 35)) {
            return -1;
        }
        if (!(!ee.field_i)) {
            return -1;
        }
        int var2 = fc.a(rg.a(0), ((ab) this).field_r, true, ((ab) this).field_o, fi.a((byte) 84), 0);
        if (0 == (var2 ^ -1)) {
            return -1;
        }
        if (var2 != param0) {
            // if_icmpeq L80
        } else {
            if (11 == fj.field_i) {
                if (!(-1 != bf.field_e)) {
                    ee.f(0);
                }
            }
            return var2;
        }
        if (!rh.field_f) {
            ((ab) this).a("reconnect", -1);
        }
        sf.b(false);
        dd.a((byte) 8, md.field_v, var2);
        ee.field_i = true;
        kj.field_I = je.a(param0 ^ -2) + 15000L;
        return var2;
    }

    protected ab() {
    }

    private final void l(int param0) {
        int var2 = te.field_N.j(255);
        int var3 = 0 != (1 & var2) ? 1 : 0;
        if (param0 >= -10) {
            field_u = false;
        }
        int var4 = te.field_O - 1;
        byte[] var5 = new byte[var4];
        te.field_N.b(70, var4, 0, var5);
        ke.a((byte) -122, ia.g(-107), da.a(true, var5), var3 != 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_p = "Logging in...";
        field_s = new int[10][];
        field_A = new int[8192];
        field_u = false;
        field_t = false;
    }
}
