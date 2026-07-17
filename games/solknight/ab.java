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
            if (kj.field_R >= 10) {
              if (!uk.h(250)) {
                int discarded$57 = -27347;
                rb.c();
                break L0;
              } else {
                if (0 == fj.field_i) {
                  int discarded$58 = this.a(false, false, 121);
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
            int discarded$59 = this.a(stackIn_4_1 != 0, false, 106);
            break L0;
          }
        }
        L2: {
          if (param0) {
            break L2;
          } else {
            int discarded$60 = 0;
            int discarded$61 = 0;
            this.c();
            break L2;
          }
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
              if (!((ab) this).c(76)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((ab) this).field_x = ((ab) this).getCodeBase().getHost();
                    var10 = ((ab) this).field_x.toLowerCase();
                    stackOut_3_0 = this;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (!var10.endsWith(".jagex.com")) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L1;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L1;
                }
                L3: {
                  ((ab) this).field_o = stackIn_8_1 != 0;
                  ((ab) this).field_y = Integer.parseInt(((ab) this).getParameter("gameport1"));
                  ((ab) this).field_m = Integer.parseInt(((ab) this).getParameter("gameport2"));
                  var7 = ((ab) this).getParameter("servernum");
                  if (var7 != null) {
                    ((ab) this).field_z = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((ab) this).field_C = Integer.parseInt(((ab) this).getParameter("gamecrc"));
                  ((ab) this).field_w = Long.parseLong(((ab) this).getParameter("instanceid"));
                  ((ab) this).field_n = ((ab) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ab) this).getParameter("lang");
                  if (var8 != null) {
                    ((ab) this).field_v = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((ab) this).field_v >= 5) {
                    ((ab) this).field_v = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var9 = ((ab) this).getParameter("affid");
                  if (var9 != null) {
                    ((ab) this).field_r = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                ml.field_g = Boolean.valueOf(((ab) this).getParameter("simplemode")).booleanValue();
                ((ab) this).a((byte) 80, param4, 640, 32, param0, 480, ((ab) this).field_C);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              int discarded$1 = 1;
              hi.a((Throwable) (Object) var6, (String) null);
              ((ab) this).a("crash", -1);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6_ref;
            stackOut_24_1 = new StringBuilder().append("ab.IA(").append(param0).append(44).append(640).append(44).append(480).append(44).append(-14).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param4 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final static da a(int param0, int param1) {
        try {
            Object var6 = null;
            Object var7 = null;
            lg var8 = null;
            da stackIn_11_0 = null;
            Throwable decompiledCaughtException = null;
            da stackOut_10_0 = null;
            try {
              L0: {
                L1: {
                  var6 = null;
                  var7 = null;
                  if (null == n.field_a.field_c) {
                    break L1;
                  } else {
                    hc.field_c = new hb(n.field_a.field_c, 5200, 0);
                    n.field_a.field_c = null;
                    var6 = (Object) (Object) new bi(255, hc.field_c, new hb(n.field_a.field_s, 12000, 0), 2097152);
                    break L1;
                  }
                }
                L2: {
                  if (hc.field_c != null) {
                    L3: {
                      if (null != tk.field_p) {
                        break L3;
                      } else {
                        tk.field_p = new hb[n.field_a.field_v.length];
                        break L3;
                      }
                    }
                    L4: {
                      if (tk.field_p[param1] == null) {
                        tk.field_p[param1] = new hb(n.field_a.field_v[param1], 12000, 0);
                        n.field_a.field_v[param1] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var7 = (Object) (Object) new bi(param1, hc.field_c, tk.field_p[param1], 2097152);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = d.field_b.a(-65, (bi) var7, false, (bi) var6, param1);
                stackOut_10_0 = new da((wd) (Object) var8, true, 1);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Object) (Object) decompiledCaughtException;
              throw new RuntimeException(((IOException) var6).toString());
            }
            return stackIn_11_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int g(int param0) {
        int var2 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              int discarded$20 = -1;
              var2 = this.j();
              if (var2 == 0) {
                break L1;
              } else {
                if (var2 != 1) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (ef.field_c[1]) {
                int discarded$21 = 9543;
                int discarded$22 = 2;
                gh.a();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!ef.field_c[2]) {
                break L3;
              } else {
                jg.a(3, (byte) -100);
                break L3;
              }
            }
            L4: {
              if (!ef.field_c[3]) {
                break L4;
              } else {
                int discarded$23 = -5887;
                int discarded$24 = 4;
                hi.a();
                break L4;
              }
            }
            L5: {
              if (ef.field_c[4]) {
                int discarded$25 = 18897;
                int discarded$26 = 5;
                ik.a();
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!ef.field_c[5]) {
                break L6;
              } else {
                int discarded$27 = 6;
                int discarded$28 = -77;
                ci.a();
                break L6;
              }
            }
            L7: {
              if (ef.field_c[6]) {
                db.b(36951, 7);
                break L7;
              } else {
                break L7;
              }
            }
            if (ef.field_c[8]) {
              int discarded$29 = -89;
              ff.a();
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        } else {
          return -59;
        }
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
                  if (var2 != 1) {
                    if (var2 != 2) {
                      if (var2 == 3) {
                        db.f(0);
                        break L1;
                      } else {
                        if (var2 == 4) {
                          int discarded$9 = 1811357826;
                          oa.c();
                          break L1;
                        } else {
                          if (var2 != 5) {
                            if (var2 == 6) {
                              td.a(-126);
                              break L1;
                            } else {
                              if (var2 != 7) {
                                if (var2 == 8) {
                                  af.a(wh.field_c, (gb) (Object) te.field_N, (byte) -110, te.field_O);
                                  break L1;
                                } else {
                                  if (var2 == 16) {
                                    ki.a(-106);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (var2 == 11) {
                                        break L2;
                                      } else {
                                        if (12 == var2) {
                                          break L2;
                                        } else {
                                          if (var2 == 13) {
                                            int discarded$10 = 117;
                                            li.d();
                                            break L1;
                                          } else {
                                            if (var2 != 17) {
                                              if (18 == var2) {
                                                u.a(2);
                                                break L1;
                                              } else {
                                                int discarded$11 = 1;
                                                hi.a((Throwable) null, "MGS1: " + oc.a(false));
                                                je.a(false);
                                                break L1;
                                              }
                                            } else {
                                              int discarded$12 = -73;
                                              this.l();
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
                                int discarded$13 = 31156;
                                this.k();
                                break L1;
                              }
                            }
                          } else {
                            int discarded$14 = 1;
                            dd.a();
                            break L1;
                          }
                        }
                      }
                    } else {
                      int discarded$15 = -117;
                      pg.c();
                      break L1;
                    }
                  } else {
                    int discarded$16 = 873698625;
                    le.b();
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
          int discarded$17 = 1;
          hi.a((Throwable) null, "MGS2: " + oc.a(false));
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

    final static String a(da param0, String param1, String param2, String param3) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (!param0.c((byte) -121)) {
              stackOut_4_0 = (String) param2;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              stackOut_6_0 = param1 + " - " + param0.d(-1, param3) + "%";
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ab.MA(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
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
            var8 = SolKnight.field_L ? 1 : 0;
            var4 = ig.a(vd.field_b, cl.field_n, false, param0);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 == 1) {
                  L1: {
                    int discarded$16 = 0;
                    int discarded$17 = 1;
                    var5_int = si.a(ua.h(), ih.a(), -120);
                    if (var5_int != -1) {
                      fb.a(12239, ke.field_O, var5_int, md.field_v);
                      ke.field_O = null;
                      md.field_v = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$18 = -123;
                  var11 = sf.d();
                  if (var11 != null) {
                    qc.a(var11.booleanValue(), -128);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (2 != var4) {
                  break L2;
                } else {
                  int discarded$19 = 84;
                  int discarded$20 = -23;
                  int discarded$21 = -1;
                  int discarded$22 = 0;
                  var5_int = gl.a(fi.a(), 140, rg.a(0), ta.a(), ((ab) this).field_r, sg.b(), lc.b());
                  if (-1 != var5_int) {
                    ff.a(var5_int, -114, ke.field_O, md.field_v);
                    ke.field_O = null;
                    md.field_v = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 != 3) {
                  break L3;
                } else {
                  L4: {
                    if (bf.field_e == -1) {
                      break L4;
                    } else {
                      if (bf.field_e == 0) {
                        break L4;
                      } else {
                        bf.field_e = -1;
                        ti.a((byte) -126);
                        break L4;
                      }
                    }
                  }
                  if (!param1) {
                    int discarded$23 = 84;
                    int discarded$24 = 0;
                    var5_int = fc.a(rg.a(0), ((ab) this).field_r, false, ((ab) this).field_o, fi.a());
                    if (-1 == var5_int) {
                      break L3;
                    } else {
                      if (0 != var5_int) {
                        dd.a((byte) 83, md.field_v, var5_int);
                        md.field_v = null;
                        break L3;
                      } else {
                        d.field_c = kc.field_P;
                        int discarded$25 = 0;
                        ee.f();
                        lh.field_l = false;
                        fj.field_i = 10;
                        break L3;
                      }
                    }
                  } else {
                    ee.field_i = false;
                    break L3;
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (!cl.field_m) {
                    fj.field_i = 10;
                    lh.field_l = true;
                    break L5;
                  } else {
                    gd.a(-1, ia.g(84));
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
                  he.a(-1, ia.g(-16));
                  break L6;
                }
              }
              L7: {
                if (6 == var4) {
                  if (!kk.field_c) {
                    break L7;
                  } else {
                    fj.field_i = 10;
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
                  int discarded$26 = -15071;
                  pl.a(ia.g(-41));
                  break L8;
                }
              }
              L9: {
                if (var4 != 8) {
                  break L9;
                } else {
                  gd.a(-1, ia.g(-48));
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  int discarded$27 = -1;
                  ki.a(ia.g(-92));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  id.field_c.e(17, -2147483648);
                  break L11;
                }
              }
              if (param2 > 69) {
                L12: {
                  if (11 != var4) {
                    break L12;
                  } else {
                    int discarded$28 = 63;
                    di.a(ia.g(-84));
                    break L12;
                  }
                }
                L13: {
                  if (var4 != 12) {
                    break L13;
                  } else {
                    int discarded$29 = 18;
                    kj.a(ia.g(-20), 117, te.d());
                    break L13;
                  }
                }
                L14: {
                  if (var4 == 13) {
                    try {
                      L15: {
                        L16: {
                          if (null != wi.field_j) {
                            break L16;
                          } else {
                            wi.field_j = new na(wh.field_c, new java.net.URL(((ab) this).getCodeBase(), "countrylist.ws"), 5000);
                            break L16;
                          }
                        }
                        L17: {
                          if (!wi.field_j.a((byte) -106)) {
                            break L17;
                          } else {
                            L18: {
                              var12 = wi.field_j.a(true);
                              if (var12 != null) {
                                int discarded$30 = 160;
                                var7 = vd.a(var12.field_l, 0, var12.field_m);
                                dh.a(var7, false);
                                break L18;
                              } else {
                                var9 = null;
                                dh.a((String) null, false);
                                break L18;
                              }
                            }
                            wi.field_j = null;
                            break L17;
                          }
                        }
                        break L15;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L19: {
                        var5 = (Exception) (Object) decompiledCaughtException;
                        int discarded$31 = 1;
                        hi.a((Throwable) (Object) var5, "S1");
                        var10 = null;
                        dh.a((String) null, false);
                        wi.field_j = null;
                        break L19;
                      }
                    }
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L20: {
                  if (15 == var4) {
                    fj.field_i = 10;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                if (var4 != 16) {
                  if (var4 != 17) {
                    return 0;
                  } else {
                    return 2;
                  }
                } else {
                  return 1;
                }
              } else {
                return 57;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void e() {
        field_q = null;
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
        int discarded$0 = 119;
        this.g();
        id.a(-114);
    }

    private final void f() {
        ef.field_c[4] = true;
    }

    final void a(String param0, int param1, int param2) {
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
              this.a(param1, 640, 480, -14, param0);
              if (param2 == 8) {
                break L1;
              } else {
                this.i(-48);
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
            stackOut_3_1 = new StringBuilder().append("ab.NA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        int discarded$0 = 0;
        int discarded$1 = 0;
        this.c();
        if (!(!param4)) {
            this.i(-13072);
        }
        if (param0 != -38) {
            ((ab) this).field_n = true;
        }
        if (param1) {
            int discarded$2 = 0;
            this.b();
        }
        if (!(!param3)) {
            int discarded$3 = 124;
            this.f();
        }
        if (!(!param2)) {
            this.h(param0 ^ -33);
        }
    }

    private final void c() {
        ef.field_c[8] = false;
        ef.field_c[7] = true;
        ef.field_c[18] = true;
        ef.field_c[17] = true;
        ef.field_c[16] = true;
        ef.field_c[3] = true;
        ef.field_c[0] = true;
    }

    private final void g() {
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
        ef.field_b[10] = -1;
        ef.field_b[17] = -1;
        ef.field_b[8] = -2;
        ef.field_b[12] = -1;
    }

    private final void k() {
        String var2 = bk.a(0);
        int discarded$0 = -3603;
        g.a(ia.g(-22), var2);
    }

    final int b(boolean param0, boolean param1) {
        if (param0) {
            return 74;
        }
        return this.a(param1, true, 120);
    }

    private final void b() {
        ef.field_c[2] = true;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_104_2 = 0;
        int stackIn_138_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        L0: {
          var5 = SolKnight.field_L ? 1 : 0;
          if (null == fc.field_l) {
            break L0;
          } else {
            L1: {
              if (null != dj.field_k) {
                break L1;
              } else {
                int discarded$22 = 60;
                var6 = qh.a();
                var4 = var6.getSize();
                fc.field_l.a(var4.height, var4.width, param0 ^ 25192);
                break L1;
              }
            }
            fc.field_l.a(param0 ^ -3);
            break L0;
          }
        }
        L2: {
          mf.f(-11214);
          jh.b(param0 ^ -405);
          if (bl.a((byte) -81)) {
            break L2;
          } else {
            if (11 == fj.field_i) {
              break L2;
            } else {
              int discarded$23 = 0;
              lj.e();
              break L2;
            }
          }
        }
        L3: {
          if (null != ah.field_d) {
            cl.field_n = ah.field_d.a(9408);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (wf.c((byte) -63)) {
            L5: {
              var3 = 1200 * l.a((byte) 99);
              if (((ab) this).field_B) {
                break L5;
              } else {
                if (var3 >= wk.b(param0 ^ -3)) {
                  break L4;
                } else {
                  if (de.a(-122) <= var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ab) this).field_B = false;
            je.a(false);
            int discarded$24 = 0;
            sf.b();
            dd.a((byte) 27, el.field_k, 2);
            int discarded$25 = 1;
            pk.d();
            ee.field_i = true;
            kj.field_I = 15000L + je.a(1);
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (bf.field_e == -1) {
              break L7;
            } else {
              if (bf.field_e != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (bf.field_e != -1) {
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
            bf.field_e = ke.a((byte) 107);
            if (var3 == 0) {
              break L9;
            } else {
              if (0 == bf.field_e) {
                if (11 != fj.field_i) {
                  break L9;
                } else {
                  if (!qc.a(param0 + 37)) {
                    int discarded$26 = 0;
                    ee.f();
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
          if (bf.field_e == -1) {
            break L6;
          } else {
            if (bf.field_e == 0) {
              break L6;
            } else {
              kj.field_I = 15000L + je.a(1);
              break L6;
            }
          }
        }
        L10: {
          if (bf.field_e == -1) {
            break L10;
          } else {
            if (bf.field_e != 0) {
              if (kj.field_R < 10) {
                if (bf.field_e == 3) {
                  ((ab) this).a("js5crc", -1);
                  break L10;
                } else {
                  if (bf.field_e == 4) {
                    ((ab) this).a("js5io", param0 ^ 2);
                    break L10;
                  } else {
                    if (bf.field_e == 2) {
                      ((ab) this).a("js5connect_full", -1);
                      break L10;
                    } else {
                      if (bf.field_e != 5) {
                        ((ab) this).a("js5connect", -1);
                        break L10;
                      } else {
                        ((ab) this).a("outofdate", -1);
                        break L10;
                      }
                    }
                  }
                }
              } else {
                if (10 <= fj.field_i) {
                  L11: {
                    int discarded$27 = 0;
                    sf.b();
                    if (bf.field_e != 3) {
                      if (bf.field_e != 4) {
                        if (bf.field_e != 2) {
                          if (5 == bf.field_e) {
                            dd.a((byte) -115, jl.field_c, 5);
                            break L11;
                          } else {
                            dd.a((byte) 57, cd.field_c, 256);
                            break L11;
                          }
                        } else {
                          dd.a((byte) 51, eb.field_c, 256);
                          break L11;
                        }
                      } else {
                        dd.a((byte) 89, el.field_m, 256);
                        break L11;
                      }
                    } else {
                      dd.a((byte) 115, bl.field_m, 256);
                      break L11;
                    }
                  }
                  ee.field_i = true;
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
              if (bf.field_e == -1) {
                break L14;
              } else {
                if (0 != bf.field_e) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!qc.a(34)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (~kj.field_I < ~je.a(1)) {
            break L12;
          } else {
            ee.field_i = false;
            if (bf.field_e == -1) {
              break L12;
            } else {
              if (bf.field_e == 0) {
                break L12;
              } else {
                bf.field_e = -1;
                ti.a((byte) 77);
                break L12;
              }
            }
          }
        }
        L15: {
          if (bf.field_e != 0) {
            break L15;
          } else {
            if (qc.a(34)) {
              break L15;
            } else {
              ib.field_o = false;
              break L15;
            }
          }
        }
        L16: {
          if (kj.field_R != 0) {
            break L16;
          } else {
            if (!tk.c(false)) {
              break L16;
            } else {
              kj.field_R = 1;
              break L16;
            }
          }
        }
        L17: {
          if (kj.field_R != 1) {
            break L17;
          } else {
            L18: {
              if (vd.field_b != 0) {
                af.field_c = r.a(og.field_c, 82);
                break L18;
              } else {
                break L18;
              }
            }
            int discarded$28 = 1;
            int discarded$29 = 0;
            int discarded$30 = 1;
            lh.field_o = pj.a(vd.field_c, (byte) -30);
            int discarded$31 = 1;
            int discarded$32 = 0;
            int discarded$33 = 1;
            wk.field_c = pj.a(ef.field_g, (byte) -126);
            int discarded$34 = 1;
            int discarded$35 = 0;
            int discarded$36 = 1;
            jk.field_ub = pj.a(aj.field_u, (byte) 52);
            pl.field_d = lh.field_o;
            ai.field_b = wk.field_c;
            kj.field_R = 2;
            break L17;
          }
        }
        L19: {
          if (kj.field_R == 2) {
            L20: {
              if (af.field_c != null) {
                if (af.field_c.c((byte) -121)) {
                  if (!af.field_c.b(param0 + -95, "")) {
                    af.field_c = null;
                    break L20;
                  } else {
                    if (af.field_c.a(2, "")) {
                      lj.a(26708, af.field_c);
                      af.field_c = null;
                      int discarded$37 = 8192;
                      mh.a();
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              } else {
                break L20;
              }
            }
            if (null != af.field_c) {
              break L19;
            } else {
              kj.field_R = 3;
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (3 != kj.field_R) {
            break L21;
          } else {
            if (!pj.a(wk.field_c, -16925, lh.field_o, jk.field_ub)) {
              break L21;
            } else {
              if (td.a(-3, jk.field_ub)) {
                L22: {
                  L23: {
                    cb.b(32);
                    int discarded$38 = -15617;
                    kg.a();
                    pe.field_m = te.field_J;
                    kk.field_c = false;
                    d.a(wk.field_c, cl.field_m, (byte) -110, jk.field_ub, lh.field_o);
                    if (bl.field_p) {
                      break L23;
                    } else {
                      if (null == s.field_hb) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (bl.field_p) {
                      stackOut_100_0 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      break L24;
                    } else {
                      stackOut_99_0 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_101_0 = stackIn_101_0;
                    stackOut_101_1 = param0 + 17075;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    if (bl.field_p) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      break L25;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      break L25;
                    }
                  }
                  hf.a(stackIn_104_0 != 0, stackIn_104_1, stackIn_104_2 != 0, s.field_hb);
                  break L22;
                }
                L26: {
                  if (ml.field_g) {
                    int discarded$39 = 4;
                    qk.f();
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (ce.field_c == null) {
                    int discarded$40 = 0;
                    ce.field_c = rh.a();
                    int discarded$41 = 123;
                    qh.field_c = jk.i();
                    break L27;
                  } else {
                    break L27;
                  }
                }
                r.a(jk.field_ub, qh.field_c, param0 ^ -4, ce.field_c);
                wk.field_c = null;
                jk.field_ub = null;
                lh.field_o = null;
                de.a((java.applet.Applet) this, param0 + 3);
                int discarded$42 = 8192;
                mh.a();
                kj.field_R = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (param0 == -3) {
            break L28;
          } else {
            ((ab) this).field_z = 90;
            break L28;
          }
        }
        L29: {
          if (10 == kj.field_R) {
            L30: {
              if (vd.field_b != 0) {
                wc.field_b = r.a(bl.field_k, 117);
                break L30;
              } else {
                break L30;
              }
            }
            kj.field_R = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (kj.field_R != 11) {
            break L31;
          } else {
            L32: {
              if (null == wc.field_b) {
                break L32;
              } else {
                L33: {
                  if (!wc.field_b.c((byte) -121)) {
                    break L33;
                  } else {
                    if (!wc.field_b.b(true)) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                int discarded$43 = -94;
                a.a((byte) 102, ve.a(uf.field_r, wa.field_a, wc.field_b), 0.0f);
                break L31;
              }
            }
            pd.field_c = true;
            kj.field_R = 12;
            break L31;
          }
        }
        L34: {
          if (12 == kj.field_R) {
            if (!pd.field_c) {
              kj.field_R = 13;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (kj.field_R == 13) {
            L36: {
              var3 = 1;
              if (null == ng.field_a) {
                break L36;
              } else {
                L37: {
                  if (!ng.field_a.a((byte) 125)) {
                    stackOut_137_0 = 0;
                    stackIn_138_0 = stackOut_137_0;
                    break L37;
                  } else {
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L37;
                  }
                }
                var3 = stackIn_138_0;
                a.a((byte) 102, ng.field_a.field_a, ng.field_a.field_c);
                break L36;
              }
            }
            if (var3 == 0) {
              break L35;
            } else {
              kj.field_R = 20;
              break L35;
            }
          } else {
            break L35;
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (!jd.field_p) {
              break L38;
            } else {
              nc.a((byte) 86, dc.field_q);
              ((ab) this).a(true);
              th.a((byte) -69, dc.field_q);
              break L38;
            }
          }
        }
        L39: {
          if (ef.field_c[8]) {
            wd.b(param0 + 11);
            break L39;
          } else {
            break L39;
          }
        }
    }

    final static uh a(jd param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        uh var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        uh stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        uh stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var2_int = param0.d((byte) 48, 8);
            if (var2_int <= 0) {
              L1: {
                var3 = wa.a(param0, (byte) -119) ? 1 : 0;
                var4 = wa.a(param0, (byte) -114) ? 1 : 0;
                var5 = new uh();
                var5.field_y = (short)param0.d((byte) 48, 16);
                var5.field_n = pj.a(-1, param0, 16, var5.field_n);
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
                  var5.field_D = pj.a(-1, param0, 16, var5.field_D);
                  var5.field_C = pj.a(-1, param0, 16, var5.field_C);
                  var5.field_g = pj.a(-1, param0, 16, var5.field_g);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param0.d((byte) 48, 16);
                  var5.field_c = pj.a(-1, param0, 16, var5.field_c);
                  var5.field_H = pj.a(-1, param0, 16, var5.field_H);
                  var5.field_A = pj.a(-1, param0, 16, var5.field_A);
                  var5.field_a = pj.a(-1, param0, 16, var5.field_a);
                  var5.field_e = pj.a(-1, param0, 16, var5.field_e);
                  break L2;
                }
              }
              L3: {
                if (!wa.a(param0, (byte) -121)) {
                  break L3;
                } else {
                  var5.field_s = pj.a(-1, param0, 16, var5.field_s);
                  break L3;
                }
              }
              L4: {
                if (!wa.a(param0, (byte) -127)) {
                  break L4;
                } else {
                  var5.field_k = be.a((byte) 63, var5.field_k, param0, 16);
                  var6 = 0;
                  var7 = 0;
                  L5: while (true) {
                    if (var5.field_k.length <= var7) {
                      if (0 != var6) {
                        var5.field_j = (byte)(1 + var6);
                        break L4;
                      } else {
                        var5.field_k = null;
                        break L4;
                      }
                    } else {
                      L6: {
                        if (var6 >= (var5.field_k[var7] & 255)) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_20_0 = (uh) var5;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              throw new IllegalStateException("" + var2_int);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("ab.EA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -14945 + 41);
        }
        return stackIn_21_0;
    }

    private final int j() {
        int var2 = 0;
        if (((ab) this).field_c) {
          return -1;
        } else {
          if (qc.a(34)) {
            if (ee.field_i) {
              return -1;
            } else {
              int discarded$8 = 84;
              int discarded$9 = 0;
              var2 = fc.a(rg.a(0), ((ab) this).field_r, true, ((ab) this).field_o, fi.a());
              if (var2 != -1) {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (var2 == 1) {
                      break L0;
                    } else {
                      L1: {
                        if (rh.field_f) {
                          break L1;
                        } else {
                          ((ab) this).a("reconnect", -1);
                          break L1;
                        }
                      }
                      int discarded$10 = 0;
                      sf.b();
                      dd.a((byte) 8, md.field_v, var2);
                      ee.field_i = true;
                      kj.field_I = je.a(1) + 15000L;
                      return var2;
                    }
                  }
                }
                L2: {
                  if (11 != fj.field_i) {
                    break L2;
                  } else {
                    if (bf.field_e == 0) {
                      int discarded$11 = 0;
                      ee.f();
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
            }
          } else {
            return -1;
          }
        }
    }

    protected ab() {
    }

    private final void l() {
        int var2 = te.field_N.j(255);
        int var3 = 0 != (1 & var2) ? 1 : 0;
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
